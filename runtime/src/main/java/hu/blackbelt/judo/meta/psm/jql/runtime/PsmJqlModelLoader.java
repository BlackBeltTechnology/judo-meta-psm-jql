package hu.blackbelt.judo.meta.psm.jql.runtime;

import hu.blackbelt.judo.meta.psm.jql.jqldsl.JqldslPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PsmJqlModelLoader {

    public static void registerPsmJqlMetamodel(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put(JqldslPackage.eINSTANCE.getNsURI(), JqldslPackage.eINSTANCE);
    }


    public static Resource.Factory getPsmJqlFactory() {
        return new XMIResourceFactoryImpl();
    }

    public static ResourceSet createPsmJqlResourceSet() {
        return createPsmJqlResourceSet(null);
    }

    public static ResourceSet createPsmJqlResourceSet(URIHandler uriHandler) {
        ResourceSet resourceSet = new ResourceSetImpl();
        registerPsmJqlMetamodel(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ResourceFactoryRegistryImpl.DEFAULT_EXTENSION, getPsmJqlFactory());
        if (uriHandler != null) {
            resourceSet.getURIConverter().getURIHandlers().add(0, uriHandler);
        }
        return resourceSet;
    }


    public static PsmJqlModel loadPsmJqlModel(URI uri, String name, String version) throws IOException {
        return loadPsmJqlModel(createPsmJqlResourceSet(), uri, name, version, null, null);
    }

    public static PsmJqlModel loadPsmJqlModel(ResourceSet resourceSet, URI uri, String name, String version) throws IOException {
        return loadPsmJqlModel(resourceSet, uri, name, version, null, null);
    }

    public static PsmJqlModel loadPsmJqlModel(ResourceSet resourceSet, URI uri, String name, String version, String checksum, String acceptedMetaVersionRange) throws IOException {
        registerPsmJqlMetamodel(resourceSet);
        Resource resource = resourceSet.createResource(uri);
        Map<Object, Object> loadOptions = new HashMap<>();
        //loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        //loadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
        resource.load(loadOptions);

        PsmJqlModel.PsmJqlModelBuilder b = PsmJqlModel.buildPsmJqlModel();

        b.name(name)
                .version(version)
                .uri(uri)
                .checksum(checksum)
                .resource(resource);

        if (checksum != null) {
            b.checksum(checksum);
        }

        if (acceptedMetaVersionRange != null)  {
            b.metaVersionRange(acceptedMetaVersionRange);
        }
        return b.build();
    }

}