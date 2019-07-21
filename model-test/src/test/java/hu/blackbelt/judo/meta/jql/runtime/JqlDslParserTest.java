package hu.blackbelt.judo.meta.jql.runtime;

import com.google.common.collect.ImmutableMap;
import hu.blackbelt.judo.meta.jql.jqldsl.BinaryOperation;
import hu.blackbelt.judo.meta.jql.jqldsl.Expression;
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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class JqlDslParserTest {

    Logger log = LoggerFactory.getLogger(JqlDslParserTest.class);
    private JqlParser parser;

    private static final String TEST_EXPRESSION = "self.quantity * self.unitPrice * (1 - self.discount)";

    @BeforeEach
    public void setUp() {
        parser = new JqlParser();
    }

    @AfterEach
    public void tearDown() {
        parser = null;
    }

    private void validateResource(final XtextResource loaded) {
        final IResourceValidator validator = loaded.getResourceServiceProvider().getResourceValidator();
        final List<Issue> issues = validator.validate(loaded, CheckMode.ALL, CancelIndicator.NullImpl);

        Assertions.assertTrue(issues.isEmpty());

        Resource resource = new XMIResourceImpl(URI.createFileURI("target/classes/sample-jql-" + UUID.randomUUID() + ".model"));
        resource.getContents().addAll(EcoreUtil.copyAll(loaded.getContents()));
        try {
            resource.save(ImmutableMap.of(XMIResource.OPTION_ENCODING, "UTF-8"));
        } catch (IOException ex) {
            log.error("Unable to save JQL model", ex);
        }
    }

    private void validateExpression(final Expression jqlExpression) {
        Assertions.assertTrue(jqlExpression instanceof BinaryOperation);
    }

    @Test
    public void testLoadFile() {
        final XtextResource sample = parser.loadJqlFromFile(new File( "src/test/model/sample.jql"));
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
        final Expression jqlExpression = parser.parseFile(new File("src/test/model/sample.jql"));
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

}
