/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit;

import hu.bme.mit.ComponentModelStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ComponentModelStandaloneSetup extends ComponentModelStandaloneSetupGenerated {
  public static void doSetup() {
    ComponentModelStandaloneSetup _componentModelStandaloneSetup = new ComponentModelStandaloneSetup();
    _componentModelStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}