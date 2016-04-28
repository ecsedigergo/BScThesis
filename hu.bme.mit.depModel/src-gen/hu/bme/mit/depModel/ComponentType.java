/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.ComponentType#getCompFeatures <em>Comp Features</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.depModel.DepModelPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends AbstractFeatures
{
  /**
   * Returns the value of the '<em><b>Comp Features</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.depModel.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp Features</em>' containment reference list.
   * @see hu.bme.mit.depModel.DepModelPackage#getComponentType_CompFeatures()
   * @model containment="true"
   * @generated
   */
  EList<Port> getCompFeatures();

} // ComponentType
