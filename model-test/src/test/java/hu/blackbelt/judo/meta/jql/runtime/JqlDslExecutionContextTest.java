package hu.blackbelt.judo.meta.jql.runtime;

import hu.blackbelt.judo.meta.jql.jqldsl.support.JqlDslModelResourceSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hu.blackbelt.judo.meta.jql.jqldsl.support.JqlDslModelResourceSupport.jqlDslModelResourceSupportBuilder;

class JqlDslExecutionContextTest {

    @Test
    @DisplayName("Create Jql model with builder pattern")
    void testJqlReflectiveCreated() throws Exception {

        String createdSourceModelName = "urn:jql.judo-meta-jql";

        JqlDslModelResourceSupport jqlModelSupport = jqlDslModelResourceSupportBuilder()
                .uri(URI.createFileURI(createdSourceModelName))
                .build();

        // Build model here
    }
}