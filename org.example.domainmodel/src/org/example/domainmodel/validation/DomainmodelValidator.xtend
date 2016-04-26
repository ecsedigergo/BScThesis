/*
 * generated by Xtext 2.9.2
 */
package org.example.domainmodel.validation

import org.eclipse.xtext.validation.Check
import org.example.domainmodel.domainmodel.DomainmodelPackage
import org.example.domainmodel.domainmodel.Entity
import org.example.domainmodel.domainmodel.Feature

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DomainmodelValidator extends AbstractDomainmodelValidator {
	
  public static val INVALID_NAME = 'invalidName'

	@Check
	def checkGreetingStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.name.charAt(0))) {
			warning('Name should start with a capital', 
					DomainmodelPackage.Literals.TYPE__NAME,
					INVALID_NAME)
		}
	}
	
	@Check
	def void checkFeatureNameIsUnique(Feature f){
		var superEntity = (f.eContainer as Entity).superType
		while(superEntity != null){
			for (other  : superEntity.features) {
				if (f.name == other.name) {
					error("Feature names have to be unique", DomainmodelPackage.Literals.FEATURE__NAME)
					return
				}
			}
			superEntity = superEntity.getSuperType();
		} 
		
	}
}
