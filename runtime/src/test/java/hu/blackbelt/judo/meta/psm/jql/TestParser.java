package hu.blackbelt.judo.meta.psm.jql;

import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

@Slf4j
public class TestParser {

    @Test
    public void textInitializingXText() {
        log.info("Initializing XText...");

        final Injector injector = new JqlDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();

        final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        final Resource sample = resourceSet.getResource(URI.createFileURI("./sample.jql"), true);

        final Iterator<EObject> contents = sample.getAllContents();
        while (contents.hasNext()) {
            log.info("Loaded content: {}", contents.next());
        }

        final IResourceValidator validator = ((XtextResource)sample).getResourceServiceProvider().getResourceValidator();
        final List<Issue> issues = validator.validate(sample, CheckMode.ALL, CancelIndicator.NullImpl);

        if (!issues.isEmpty()) {
            log.error("Input is INVALID: {}", issues);
        } else {
            log.info("Input is VALID");
        }
    }
}
