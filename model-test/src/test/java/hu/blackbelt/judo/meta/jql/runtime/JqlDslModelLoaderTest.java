package hu.blackbelt.judo.meta.jql.runtime;

/*-
 * #%L
 * Judo :: Jql :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

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

import static hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel.LoadArguments.jqlDslLoadArgumentsBuilder;
import static hu.blackbelt.judo.meta.jql.jqldsl.runtime.JqlDslModel.loadJqlDslModel;


public class JqlDslModelLoaderTest {

    static Logger log = LoggerFactory.getLogger(JqlDslModelLoaderTest.class);

    @Test
    @DisplayName("Load Jql Model")
    void loadJqlModel() throws IOException, JqlDslModel.JqlDslValidationException {
        JqlDslModel jqlModel = loadJqlDslModel(jqlDslLoadArgumentsBuilder()
                .uri(URI.createFileURI(new File("src/test/model/test.jql.xmi").getAbsolutePath()))
                .name("test"));

        for (Iterator<EObject> i = jqlModel.getResourceSet().getResource(jqlModel.getUri(), false).getAllContents(); i.hasNext(); ) {
            log.info(i.next().toString());
        }
    }
}
