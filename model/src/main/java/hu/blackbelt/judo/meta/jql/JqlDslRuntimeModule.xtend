package hu.blackbelt.judo.meta.jql

import hu.blackbelt.judo.meta.jql.runtime.JqlTerminalConverters
import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class JqlDslRuntimeModule extends AbstractJqlDslRuntimeModule {

    override Class<? extends IValueConverterService> bindIValueConverterService() {
        return typeof(JqlTerminalConverters)
    }

}
