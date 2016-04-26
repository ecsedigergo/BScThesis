/*
 * generated by Xtext 2.9.2
 */
package org.example.domainmodel.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.example.domainmodel.ui.internal.DomainmodelActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DomainmodelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DomainmodelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DomainmodelActivator.getInstance().getInjector(DomainmodelActivator.ORG_EXAMPLE_DOMAINMODEL_DOMAINMODEL);
	}
	
}
