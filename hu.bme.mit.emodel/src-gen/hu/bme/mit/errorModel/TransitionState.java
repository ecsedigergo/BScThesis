/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.errorModel.TransitionState#getSourceState <em>Source State</em>}</li>
 *   <li>{@link hu.bme.mit.errorModel.TransitionState#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.errorModel.ErrorModelPackage#getTransitionState()
 * @model
 * @generated
 */
public interface TransitionState extends TransitionFeatureDec
{
  /**
   * Returns the value of the '<em><b>Source State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source State</em>' reference.
   * @see #setSourceState(StateDec)
   * @see hu.bme.mit.errorModel.ErrorModelPackage#getTransitionState_SourceState()
   * @model
   * @generated
   */
  StateDec getSourceState();

  /**
   * Sets the value of the '{@link hu.bme.mit.errorModel.TransitionState#getSourceState <em>Source State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source State</em>' reference.
   * @see #getSourceState()
   * @generated
   */
  void setSourceState(StateDec value);

  /**
   * Returns the value of the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target State</em>' reference.
   * @see #setTargetState(StateDec)
   * @see hu.bme.mit.errorModel.ErrorModelPackage#getTransitionState_TargetState()
   * @model
   * @generated
   */
  StateDec getTargetState();

  /**
   * Sets the value of the '{@link hu.bme.mit.errorModel.TransitionState#getTargetState <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target State</em>' reference.
   * @see #getTargetState()
   * @generated
   */
  void setTargetState(StateDec value);

} // TransitionState