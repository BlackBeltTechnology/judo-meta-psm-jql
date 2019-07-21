package hu.blackbelt.judo.meta.jql.osgi;

import hu.blackbelt.epsilon.runtime.osgi.BundleURIHandler;
import hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel;
import hu.blackbelt.osgi.utils.osgi.api.BundleCallback;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import hu.blackbelt.osgi.utils.osgi.api.BundleUtil;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.VersionRange;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

@Component(immediate = true)
@Slf4j
public class JqlModelBundleTracker {

    public static final String JQL_MODELS = "Jql-Models";

    @Reference
    BundleTrackerManager bundleTrackerManager;

    Map<String, ServiceRegistration<JqlDslModel>> jqlModelRegistrations = new ConcurrentHashMap<>();

    Map<String, JqlDslModel> jqlModels = new HashMap<>();

    @Activate
    public void activate(final ComponentContext componentContext) {
        bundleTrackerManager.registerBundleCallback(this.getClass().getName(),
                new JqlRegisterCallback(componentContext.getBundleContext()),
                new JqlUnregisterCallback(),
                new JqlBundlePredicate());
    }

    @Deactivate
    public void deactivate(final ComponentContext componentContext) {
        bundleTrackerManager.unregisterBundleCallback(this.getClass().getName());
    }

    private static class JqlBundlePredicate implements Predicate<Bundle> {
        @Override
        public boolean test(Bundle trackedBundle) {
            return BundleUtil.hasHeader(trackedBundle, JQL_MODELS);
        }
    }

    private class JqlRegisterCallback implements BundleCallback {

        BundleContext bundleContext;

        public JqlRegisterCallback(BundleContext bundleContext) {
            this.bundleContext = bundleContext;
        }


        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, JQL_MODELS);


            for (Map<String, String> params : entries) {
                String key = params.get(JqlDslModel.NAME);
                if (jqlModelRegistrations.containsKey(key)) {
                    log.error("Jql model already loaded: " + key);
                } else {
                    if (params.containsKey(JqlDslModel.META_VERSION_RANGE)) {
                        VersionRange versionRange = new VersionRange(params.get(JqlDslModel.META_VERSION_RANGE).replaceAll("\"", ""));
                        if (versionRange.includes(bundleContext.getBundle().getVersion())) {
                            // Unpack model
                            try {
                                JqlDslModel jqlModel = JqlDslModel.loadJqlDslModel(
                                        JqlDslModel.LoadArguments.loadArgumentsBuilder()
                                                .uriHandler(Optional.of(new BundleURIHandler("urn", "", trackedBundle)))
                                                .uri(URI.createURI(params.get("file")))
                                                .name(params.get(JqlDslModel.NAME))
                                                .version(Optional.of(trackedBundle.getVersion().toString()))
                                                .checksum(Optional.ofNullable(params.get(JqlDslModel.CHECKSUM)))
                                                .acceptedMetaVersionRange(Optional.of(versionRange.toString()))
                                                .build()
                                );

                                log.info("Registering Jql model: " + jqlModel);

                                ServiceRegistration<JqlDslModel> modelServiceRegistration = bundleContext.registerService(JqlDslModel.class, jqlModel, jqlModel.toDictionary());
                                jqlModels.put(key, jqlModel);
                                jqlModelRegistrations.put(key, modelServiceRegistration);

                            } catch (IOException e) {
                                log.error("Could not load Jql model: " + params.get(JqlDslModel.NAME) + " from bundle: " + trackedBundle.getBundleId());
                            }
                        }
                    }
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

    private class JqlUnregisterCallback implements BundleCallback {

        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, JQL_MODELS);
            for (Map<String, String> params : entries) {
                String key = params.get(JqlDslModel.NAME);

                if (jqlModels.containsKey(key)) {
                    ServiceRegistration<JqlDslModel> modelServiceRegistration = jqlModelRegistrations.get(key);

                    if (modelServiceRegistration != null) {
                        log.info("Unregistering Jql model: " + jqlModels.get(key));
                        modelServiceRegistration.unregister();
                        jqlModelRegistrations.remove(key);
                        jqlModels.remove(key);
                    }
                } else {
                    log.error("Jql Model is not registered: " + key);
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

}
