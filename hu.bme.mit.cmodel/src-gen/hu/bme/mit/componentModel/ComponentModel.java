/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.ComponentModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.componentModel.ComponentModelPackage#getComponentModel()
 * @model
 * @generated
 */
public interface ComponentModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.componentModel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getComponentModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // ComponentModel