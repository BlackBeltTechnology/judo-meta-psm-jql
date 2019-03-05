package hu.blackbelt.judo.meta.psm.jql;

import hu.blackbelt.judo.meta.psm.jql.jqlDsl.JqlDslPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import java.util.Dictionary;
import java.util.Hashtable;

@Component(immediate = true, service = PsmJqlMetaModel.class)
public class PsmJqlMetaModelRegistration implements PsmJqlMetaModel {

    ServiceRegistration<Resource.Factory> psmFactoryRegistration;
    Resource.Factory factory = new ResourceFactoryImpl();

    @Activate
    public void activate(ComponentContext componentContext) {
        Dictionary<String, Object> params = new Hashtable<>();
        params.put("meta", "psm/jql");
        params.put("version", componentContext.getBundleContext().getBundle().getVersion());
        params.put("bundle", componentContext.getBundleContext().getBundle());

        psmFactoryRegistration = componentContext.getBundleContext()
                .registerService(Resource.Factory.class, factory, params);
    }

    @Deactivate
    public void deactivate() {
        psmFactoryRegistration.unregister();
    }

    @Override
    public Resource.Factory getFactory() {
        return factory;
    }

    @Override
    public void registerPsmJqlMetamodel(ResourceSet resourceSet) {

        resourceSet.getPackageRegistry().put(JqlDslPackage.eINSTANCE.getNsURI(), JqlDslPackage.eINSTANCE);

    }
}
