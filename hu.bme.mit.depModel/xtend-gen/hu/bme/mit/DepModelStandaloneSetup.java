/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit;

import hu.bme.mit.DepModelStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DepModelStandaloneSetup extends DepModelStandaloneSetupGenerated {
  public static void doSetup() {
    DepModelStandaloneSetup _depModelStandaloneSetup = new DepModelStandaloneSetup();
    _depModelStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}