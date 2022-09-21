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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class JqlParseException extends RuntimeException {

    private final EList<Diagnostic> errors;

    public JqlParseException(String jqlExpression, EList<Diagnostic> errors) {
        super("Error parsing JQL expression (" + jqlExpression + "): " + errors.toString());
        this.errors = errors;
    }

    public EList<Diagnostic> getErrors() {
        return errors;
    }

}
