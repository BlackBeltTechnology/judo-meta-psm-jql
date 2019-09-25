/**
 * generated by Xtext 2.18.0
 */
package hu.blackbelt.judo.meta.jql.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.blackbelt.judo.meta.jql.JqlDslRuntimeModule;
import hu.blackbelt.judo.meta.jql.JqlDslStandaloneSetup;
import hu.blackbelt.judo.meta.jql.ide.JqlDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class JqlDslIdeSetup extends JqlDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    JqlDslRuntimeModule _jqlDslRuntimeModule = new JqlDslRuntimeModule();
    JqlDslIdeModule _jqlDslIdeModule = new JqlDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_jqlDslRuntimeModule, _jqlDslIdeModule));
  }
}