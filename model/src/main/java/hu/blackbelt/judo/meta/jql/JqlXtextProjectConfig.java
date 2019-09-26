package hu.blackbelt.judo.meta.jql;

import com.google.common.base.Objects;
import org.eclipse.xtext.xtext.generator.model.project.StandardProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.SubProjectConfig;

/**
 * MWE2 workflow generator configuration to fit JQL project structure
 */
public class JqlXtextProjectConfig extends StandardProjectConfig {

    @Override
    protected String computeName(SubProjectConfig project) {
        String computedName;
        if (Objects.equal(project, getGenericIde())) {
            computedName = "ide";
        } else if (Objects.equal(project, getEclipsePlugin())) {
            computedName = "ui";
        } else {
            computedName = super.computeName(project);
        }
        return computedName;
    }

}
