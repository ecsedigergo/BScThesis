/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractComponentModelValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(hu.bme.mit.componentModel.ComponentModelPackage.eINSTANCE);
		return result;
	}
	
}
