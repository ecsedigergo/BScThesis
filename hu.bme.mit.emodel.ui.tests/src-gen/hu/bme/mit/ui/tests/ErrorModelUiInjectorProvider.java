/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.ui.tests;

import com.google.inject.Injector;
import hu.bme.mit.emodel.ui.internal.EmodelActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ErrorModelUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EmodelActivator.getInstance().getInjector("hu.bme.mit.ErrorModel");
	}

}
