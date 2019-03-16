package hu.blackbelt.judo.meta.psm.jql.tracker;

import hu.blackbelt.judo.meta.psm.jql.PsmJqlModel;
import hu.blackbelt.osgi.utils.osgi.api.BundleCallback;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import hu.blackbelt.osgi.utils.osgi.api.BundleUtil;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.*;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

import static hu.blackbelt.judo.meta.psm.jql.PsmJqlModelLoader.loadPsmJqlModel;

@Component(immediate = true)
@Slf4j
public class PsmJqlModelBundleTracker {

    public static final String PSM_MODELS = "PsmJql-Models";

    @Reference
    BundleTrackerManager bundleTrackerManager;

    Map<String, ServiceRegistration<PsmJqlModel>> measureModelRegistrations = new ConcurrentHashMap<>();

    Map<String, PsmJqlModel> measureModels = new HashMap<>();

    @Activate
    public void activate(final ComponentContext componentContext) {
        bundleTrackerManager.registerBundleCallback(this.getClass().getName(),
                new PsmJqlRegisterCallback(componentContext.getBundleContext()),
                new PsmJqlUnregisterCallback(componentContext.getBundleContext()),
                new PsmJqlBundlePredicate());
    }

    @Deactivate
    public void deactivate(final ComponentContext componentContext) {
        bundleTrackerManager.unregisterBundleCallback(this.getClass().getName());
    }

    private static class PsmJqlBundlePredicate implements Predicate<Bundle> {
        @Override
        public boolean test(Bundle trackedBundle) {
            return BundleUtil.hasHeader(trackedBundle, PSM_MODELS);
        }
    }

    private class PsmJqlRegisterCallback implements BundleCallback {

        BundleContext bundleContext;

        public PsmJqlRegisterCallback(BundleContext bundleContext) {
            this.bundleContext = bundleContext;
        }

        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, PSM_MODELS);


            for (Map<String, String> params : entries) {
                String key = params.get(PsmJqlModel.NAME);
                if (measureModelRegistrations.containsKey(key)) {
                    log.error("Model already loaded: " + key);
                } else {
                    if (params.containsKey(PsmJqlModel.META_VERSION_RANGE)) {
                        VersionRange versionRange = new VersionRange(params.get(PsmJqlModel.META_VERSION_RANGE).replaceAll("\"", ""));
                        if (versionRange.includes(bundleContext.getBundle().getVersion())) {
                            // Unpack model
                            try {
                                File file = BundleUtil.copyBundleFileToPersistentStorage(trackedBundle, key + ".judo-meta-measure", params.get("file"));
                                Version version = bundleContext.getBundle().getVersion();

                                // TODO: JNG-55 Copy mapping XLSX

                                PsmJqlModel measureModel = loadPsmJqlModel(
                                        new ResourceSetImpl(),
                                        URI.createURI(file.getAbsolutePath()),
                                        params.get(PsmJqlModel.NAME),
                                        version.toString(),
                                        params.get(PsmJqlModel.CHECKSUM),
                                        versionRange.toString());

                                log.info("Registering model: " + measureModel);

                                ServiceRegistration<PsmJqlModel> modelServiceRegistration = bundleContext.registerService(PsmJqlModel.class, measureModel, measureModel.toDictionary());
                                measureModels.put(key, measureModel);
                                measureModelRegistrations.put(key, modelServiceRegistration);

                            } catch (IOException e) {
                                log.error("Could not load model: " + params.get(PsmJqlModel.NAME) + " from bundle: " + trackedBundle.getBundleId());
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

    private class PsmJqlUnregisterCallback implements BundleCallback {
        BundleContext bundleContext;

        public PsmJqlUnregisterCallback(BundleContext bundleContext) {
            this.bundleContext = bundleContext;
        }

        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, PSM_MODELS);
            for (Map<String, String> params : entries) {
                String key = params.get(PsmJqlModel.NAME);

                if (measureModels.containsKey(key)) {
                    ServiceRegistration<PsmJqlModel> modelServiceRegistration = measureModelRegistrations.get(key);

                    if (modelServiceRegistration != null) {
                        log.info("Unregistering moodel: " + measureModels.get(key));
                        modelServiceRegistration.unregister();
                        measureModelRegistrations.remove(key);
                        measureModels.remove(key);
                    }
                } else {
                    log.error("Model is not registered: " + key);
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

}
