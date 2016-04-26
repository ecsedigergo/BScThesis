/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.SystemDec#getSysFeatures <em>Sys Features</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemDec()
 * @model
 * @generated
 */
public interface SystemDec extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Sys Features</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.componentModel.AbstractFeatures}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sys Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sys Features</em>' containment reference list.
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemDec_SysFeatures()
   * @model containment="true"
   * @generated
   */
  EList<AbstractFeatures> getSysFeatures();

} // SystemDec
