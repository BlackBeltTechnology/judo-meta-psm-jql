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
