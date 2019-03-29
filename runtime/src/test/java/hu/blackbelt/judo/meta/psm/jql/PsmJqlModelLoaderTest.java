package hu.blackbelt.judo.meta.psm.jql;

import hu.blackbelt.judo.meta.psm.jql.runtime.PsmJqlModel;
import hu.blackbelt.judo.meta.psm.jql.runtime.PsmJqlModelLoader;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;


@Slf4j
public class PsmJqlModelLoaderTest {

    @Test
    public void loadPsmJqlModelTest() throws IOException {
        PsmJqlModel psmJqlModel = PsmJqlModelLoader.loadPsmJqlModel(
                URI.createURI(new File(srcDir(), "sample.psmjql").getAbsolutePath()),
                "test",
                "1.0.0");

        for (Iterator<EObject> i = psmJqlModel.getResourceSet().getResource(psmJqlModel.getUri(), false).getAllContents(); i.hasNext(); ) {
            log.info(i.next().toString());
        }
    }

    public File srcDir(){
        String relPath = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        File targetDir = new File(relPath);
        if(!targetDir.exists()) {
            targetDir.mkdir();
        }
        return targetDir;
    }


}