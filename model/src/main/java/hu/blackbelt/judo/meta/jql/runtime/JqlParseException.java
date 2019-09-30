package hu.blackbelt.judo.meta.jql.runtime;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class JqlParseException extends RuntimeException {

    private final EList<Diagnostic> errors;

    public JqlParseException(EList<Diagnostic> errors) {
        super("Error parsing JQL expression " + errors.toString());
        this.errors = errors;
    }
    
    public EList<Diagnostic> getErrors() {
        return errors;
    }
    
}
