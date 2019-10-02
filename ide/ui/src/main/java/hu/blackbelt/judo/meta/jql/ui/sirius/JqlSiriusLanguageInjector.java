package hu.blackbelt.judo.meta.jql.ui.sirius;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;
import hu.blackbelt.judo.meta.jql.ui.internal.JqlActivator;

public class JqlSiriusLanguageInjector implements IXtextLanguageInjector {

    @Override
    public Injector getInjector() {
        return JqlActivator.getInstance().getInjector(JqlActivator.HU_BLACKBELT_JUDO_META_JQL_JQLDSL);
    }

}
