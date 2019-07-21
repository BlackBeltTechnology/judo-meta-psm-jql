package hu.blackbelt.judo.meta.jql.runtime;

import hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel;
import hu.blackbelt.judo.meta.jql.jqldsl.support.JqlDslModelResourceSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;


public class JqlDslModelLoaderTest {

    static Logger log = LoggerFactory.getLogger(JqlDslModelLoaderTest.class);
	
    @Test
    @DisplayName("Load Jql Model")
    void loadJqlModel() throws IOException {
        ResourceSet jqlResourceSet = JqlDslModelResourceSupport.createJqlDslResourceSet();

        JqlDslModel jqlModel = JqlDslModel.loadJqlDslModel(JqlDslModel.LoadArguments.loadArgumentsBuilder()
                .resourceSet(Optional.of(jqlResourceSet))
                .uri(URI.createFileURI(new File("src/test/model/test.jql").getAbsolutePath()))
                .name("test")
                .build());

        for (Iterator<EObject> i = jqlModel.getResourceSet().getResource(jqlModel.getUri(), false).getAllContents(); i.hasNext(); ) {
            log.info(i.next().toString());
        }
    }
}