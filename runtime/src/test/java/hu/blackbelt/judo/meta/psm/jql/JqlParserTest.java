package hu.blackbelt.judo.meta.psm.jql;

import com.google.common.collect.ImmutableMap;
import hu.blackbelt.judo.meta.psm.jql.jqldsl.BinaryOperation;
import hu.blackbelt.judo.meta.psm.jql.jqldsl.Expression;
import hu.blackbelt.judo.meta.psm.jql.runtime.JqlParser;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Slf4j
public class JqlParserTest {

    private JqlParser parser;

    private static final String TEST_EXPRESSION = "self.quantity * self.unitPrice * (1 - self.discount)";

    @Before
    public void setUp() {
        parser = new JqlParser();
    }

    @After
    public void tearDown() {
        parser = null;
    }

    private void validateResource(final XtextResource loaded) {
        final IResourceValidator validator = loaded.getResourceServiceProvider().getResourceValidator();
        final List<Issue> issues = validator.validate(loaded, CheckMode.ALL, CancelIndicator.NullImpl);

        Assert.assertTrue(issues.isEmpty());

        Resource resource = new XMIResourceImpl(URI.createFileURI(testDir() + "/sample-jql-" + UUID.randomUUID() + ".model"));
        resource.getContents().addAll(EcoreUtil.copyAll(loaded.getContents()));
        try {
            resource.save(ImmutableMap.of(XMIResource.OPTION_ENCODING, "UTF-8"));
        } catch (IOException ex) {
            log.error("Unable to save JQL model", ex);
        }
    }

    private void validateExpression(final Expression jqlExpression) {
        Assert.assertTrue(jqlExpression instanceof BinaryOperation);
    }

    @Test
    public void testLoadFile() {
        final XtextResource sample = parser.loadJqlFromFile(new File(testDir(), "sample.jql"));
        validateResource(sample);
    }

    @Test
    public void testLoadStream() {
        final XtextResource sample = parser.loadJqlFromStream(new ByteArrayInputStream(TEST_EXPRESSION.getBytes()), URI.createURI("urn:testLoadString"));
        validateResource(sample);
    }

    @Test
    public void testLoadString() {
        final XtextResource sample = parser.loadJqlFromString(TEST_EXPRESSION, URI.createURI("urn:testLoadStream"));
        validateResource(sample);
    }

    @Test
    public void testParseFile() {
        final Expression jqlExpression = parser.parseFile(new File(testDir(), "sample.jql"));
        validateExpression(jqlExpression);
    }

    @Test
    public void testParseStream() {
        final Expression jqlExpression = parser.parseStream(new ByteArrayInputStream(TEST_EXPRESSION.getBytes()));
        validateExpression(jqlExpression);
    }

    @Test
    public void testParseString() {
        final Expression jqlExpression = parser.parseString(TEST_EXPRESSION);
        validateExpression(jqlExpression);
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
