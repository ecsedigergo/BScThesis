/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.errorModel.TriggerDec#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.errorModel.ErrorModelPackage#getTriggerDec()
 * @model
 * @generated
 */
public interface TriggerDec extends TransitionFeatureDec
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.errorModel.ErrorModelPackage#getTriggerDec_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.errorModel.TriggerDec#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TriggerDec