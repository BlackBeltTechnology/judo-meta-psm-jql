package hu.blackbelt.judo.meta.jql.runtime;

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
