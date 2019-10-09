package hu.blackbelt.judo.meta.jql.ui.sirius;

import com.google.inject.Injector;
import hu.blackbelt.judo.meta.jql.ide.ui.internal.IdeActivator;

public class JqlSiriusLanguageInjector {

    public Injector getInjector() {
        return IdeActivator.getInstance().getInjector(IdeActivator.HU_BLACKBELT_JUDO_META_JQL_JQLDSL);
    }

}
