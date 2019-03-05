package hu.blackbelt.judo.meta.psm.jql;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface PsmJqlMetaModel {

    Resource.Factory getFactory();

    void registerPsmJqlMetamodel(ResourceSet resourceSet);
}
