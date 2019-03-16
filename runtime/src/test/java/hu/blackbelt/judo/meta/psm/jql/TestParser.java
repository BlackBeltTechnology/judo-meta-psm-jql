package hu.blackbelt.judo.meta.psm.jql;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class TestParser {

    @Test
    public void textInitializingXText() throws IOException {
        log.info("Initializing XText...");

        final Injector injector = new JqlDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();

        final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        final Resource sample = resourceSet.getResource(URI.createFileURI(testDir() + "/sample.jql"), true);

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

        Resource resource = new XMIResourceImpl(URI.createFileURI(testDir() + "/sample-out.psmjql"));
        resource.getContents().addAll(EcoreUtil.copyAll(sample.getContents()));
        resource.save(ImmutableMap.of(XMIResource.OPTION_ENCODING, "UTF-8"));
    }


    public File testDir() {
        String relPath = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        File targetDir = new File(relPath);
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }
        return targetDir;
    }
}
