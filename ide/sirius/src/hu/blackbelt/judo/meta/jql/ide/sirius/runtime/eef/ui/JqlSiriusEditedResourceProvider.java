package hu.blackbelt.judo.meta.jql.ide.sirius.runtime.eef.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class JqlSiriusEditedResourceProvider implements IEditedResourceProvider {

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceFactory resourceFactory;
	
	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	private EObject self;

	public JqlSiriusEditedResourceProvider(EObject self, Injector injector) {
		this.self = self;
		injector.injectMembers(this);
	}
	
	@Override
	public XtextResource createResource() {
		XtextResourceSet resourceSet = this.resourceSetProvider.get();
		resourceSet.setClasspathURIContext(getClass());
		
		XtextResource resource = (XtextResource) this.resourceFactory
				.createResource(URI.createURI("_synthetic." + this.fileExtension));
		resourceSet.getResources().add(resource);
		resourceSet.getResources().add(self.eResource());
		
		return resource;
	}

}
