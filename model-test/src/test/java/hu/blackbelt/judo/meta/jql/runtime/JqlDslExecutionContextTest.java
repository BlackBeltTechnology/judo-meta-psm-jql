package hu.blackbelt.judo.meta.jql.runtime;

import hu.blackbelt.judo.meta.jql.jqldsl.support.JqlDslModelResourceSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JqlDslExecutionContextTest {

    @Test
    @DisplayName("Create Jql model with builder pattern")
    void testJqlReflectiveCreated() throws Exception {


        String createdSourceModelName = "urn:jql.judo-meta-jql";

        JqlDslModelResourceSupport jqlModelSupport = JqlDslModelResourceSupport.jqlDslModelResourceSupportBuilder().build();
        Resource jqlResource = jqlModelSupport.getResourceSet().createResource(
                URI.createFileURI(createdSourceModelName));

        // Build model here
    }
}