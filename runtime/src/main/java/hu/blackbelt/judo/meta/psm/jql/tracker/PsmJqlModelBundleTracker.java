package hu.blackbelt.judo.meta.psm.jql.tracker;

import hu.blackbelt.judo.meta.psm.jql.PsmJqlMetaModel;
import hu.blackbelt.judo.meta.psm.jql.PsmJqlModelInfo;
import hu.blackbelt.osgi.utils.osgi.api.BundleCallback;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import hu.blackbelt.osgi.utils.osgi.api.BundleUtil;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.Version;
import org.osgi.framework.VersionRange;
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

@Component(immediate = true)
@Slf4j
public class PsmJqlModelBundleTracker {

    public static final String PSM_MODELS = "Psm-Jql-Models";

    @Reference
    BundleTrackerManager bundleTrackerManager;

    @Reference
    PsmJqlMetaModel psmJqlMetaModel;

    Map<String, ServiceRegistration<PsmJqlModelInfo>> psmJqlRegistrations = new ConcurrentHashMap<>();
    Map<String, PsmJqlModelInfo> psmJqlModels = new HashMap<>();

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
                if (params.containsKey(PsmJqlModelInfo.META_VERSION)) {
                    VersionRange versionRange = new VersionRange(params.get(PsmJqlModelInfo.META_VERSION).replaceAll("\"", ""));
                    if (versionRange.includes(bundleContext.getBundle().getVersion())) {

                        // Unpack model
                        try {
                            String key = trackedBundle.getBundleId() + "-" + params.get(PsmJqlModelInfo.NAME);

                            File file = BundleUtil.copyBundleFileToPersistentStorage(trackedBundle, key + ".jql", params.get(PsmJqlModelInfo.FILE));

                            PsmJqlModelInfo psmJqlModelInfo = new PsmJqlModelInfo(
                                    file,
                                    params.get(PsmJqlModelInfo.NAME),
                                    new Version(params.get(PsmJqlModelInfo.VERSION)),
                                    URI.createURI(file.getAbsolutePath()),
                                    params.get(PsmJqlModelInfo.CHECKSUM),
                                    versionRange);

                            log.info("Registering model: " + psmJqlModelInfo);

                            ServiceRegistration<PsmJqlModelInfo> modelServiceRegistration = bundleContext.registerService(PsmJqlModelInfo.class, psmJqlModelInfo, psmJqlModelInfo.toDictionary());
                            psmJqlModels.put(key, psmJqlModelInfo);
                            psmJqlRegistrations.put(key, modelServiceRegistration);

                        } catch (IOException e) {
                            log.error("Could not load model: " + params.get(PsmJqlModelInfo.NAME) + " from bundle: " + trackedBundle.getBundleId());
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
                VersionRange versionRange = new VersionRange(params.get(PsmJqlModelInfo.META_VERSION).replaceAll("\"", ""));
                if (params.containsKey(PsmJqlModelInfo.META_VERSION)) {
                    if (versionRange.includes(bundleContext.getBundle().getVersion())) {
                        String key = trackedBundle.getBundleId() + "-" + params.get(PsmJqlModelInfo.NAME);
                        ServiceRegistration<PsmJqlModelInfo> modelServiceRegistration = psmJqlRegistrations.get(key);

                        if (modelServiceRegistration != null) {
                            log.info("Unregistering moodel: " + psmJqlModels.get(key));
                            modelServiceRegistration.unregister();
                            psmJqlRegistrations.remove(key);
                            psmJqlModels.remove(key);
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
}
