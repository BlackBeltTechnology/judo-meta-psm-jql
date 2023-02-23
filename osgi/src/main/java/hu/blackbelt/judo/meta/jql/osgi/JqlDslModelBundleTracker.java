package hu.blackbelt.judo.meta.jql.osgi;

/*-
 * #%L
 * Judo :: Jql :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel;
import hu.blackbelt.osgi.utils.osgi.api.BundleCallback;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import hu.blackbelt.osgi.utils.osgi.api.BundleUtil;
import lombok.extern.slf4j.Slf4j;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.VersionRange;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel.LoadArguments.jqlDslLoadArgumentsBuilder;
import static hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel.loadJqlDslModel;
import static java.util.Optional.ofNullable;

@Component(immediate = true)
@Slf4j
@Designate(ocd = JqlDslModelBundleTracker.TrackerConfig.class)
public class JqlDslModelBundleTracker {

    public static final String JQLDSL_MODELS = "JqlDsl-Models";

    @ObjectClassDefinition(name="JqlDsl Model Bundle TTracker")
    public @interface TrackerConfig {
        @AttributeDefinition(
                name = "Tags",
                description = "Which tags are on the loaded model when there is no one defined in bundle"
        )
        String tags() default "";
    }

    @Reference
    BundleTrackerManager bundleTrackerManager;

    Map<String, ServiceRegistration<JqlDslModel>> jqlModelRegistrations = new ConcurrentHashMap<>();

    Map<String, JqlDslModel> jqlModels = new HashMap<>();

    TrackerConfig config;

    @Activate
    public void activate(final ComponentContext componentContext, final TrackerConfig trackerConfig) {
        this.config = trackerConfig;
        bundleTrackerManager.registerBundleCallback(this.getClass().getName(),
                new JqlDslRegisterCallback(componentContext.getBundleContext()),
                new JqlDslUnregisterCallback(),
                new JqlDslBundlePredicate());
    }

    @Deactivate
    public void deactivate(final ComponentContext componentContext) {
        bundleTrackerManager.unregisterBundleCallback(this.getClass().getName());
    }

    private static class JqlDslBundlePredicate implements Predicate<Bundle> {
        @Override
        public boolean test(Bundle trackedBundle) {
            return BundleUtil.hasHeader(trackedBundle, JQLDSL_MODELS);
        }
    }

    private class JqlDslRegisterCallback implements BundleCallback {

        BundleContext bundleContext;

        public JqlDslRegisterCallback(BundleContext bundleContext) {
            this.bundleContext = bundleContext;
        }


        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, JQLDSL_MODELS);


            for (Map<String, String> params : entries) {
                String key = params.get(JqlDslModel.NAME);
                if (jqlModelRegistrations.containsKey(key)) {
                    log.error("JqlDsl model already loaded: " + key);
                } else {
                    // Unpack model
                    try {
                        JqlDslModel jqlModel = loadJqlDslModel(jqlDslLoadArgumentsBuilder()
                                .inputStream(trackedBundle.getEntry(params.get("file")).openStream())
                                .name(params.get(JqlDslModel.NAME))
                                .version(trackedBundle.getVersion().toString()));

                        log.info("Registering JqlDsl model: " + jqlModel);

                        ServiceRegistration<JqlDslModel> modelServiceRegistration = bundleContext.registerService(JqlDslModel.class, jqlModel, jqlModel.toDictionary());
                        jqlModels.put(key, jqlModel);
                        jqlModelRegistrations.put(key, modelServiceRegistration);

                    } catch (IOException | JqlDslModel.JqlDslValidationException e) {
                        log.error("Could not load Psm model: " + params.get(JqlDslModel.NAME) + " from bundle: " + trackedBundle.getBundleId(), e);
                    }
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

    private class JqlDslUnregisterCallback implements BundleCallback {

        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, JQLDSL_MODELS);
            for (Map<String, String> params : entries) {
                String key = params.get(JqlDslModel.NAME);

                if (jqlModels.containsKey(key)) {
                    ServiceRegistration<JqlDslModel> modelServiceRegistration = jqlModelRegistrations.get(key);

                    if (modelServiceRegistration != null) {
                        log.info("Unregistering JqlDsl model: " + jqlModels.get(key));
                        modelServiceRegistration.unregister();
                        jqlModelRegistrations.remove(key);
                        jqlModels.remove(key);
                    }
                } else {
                    log.error("JqlDsl Model is not registered: " + key);
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

}
