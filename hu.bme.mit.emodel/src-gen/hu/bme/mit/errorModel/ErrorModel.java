/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.errorModel.ErrorModel#getAbstractElement <em>Abstract Element</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.errorModel.ErrorModelPackage#getErrorModel()
 * @model
 * @generated
 */
public interface ErrorModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract Element</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.errorModel.Error}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Element</em>' containment reference list.
   * @see hu.bme.mit.errorModel.ErrorModelPackage#getErrorModel_AbstractElement()
   * @model containment="true"
   * @generated
   */
  EList<hu.bme.mit.errorModel.Error> getAbstractElement();

} // ErrorModel
