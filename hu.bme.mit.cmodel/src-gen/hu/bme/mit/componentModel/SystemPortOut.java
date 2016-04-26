/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Port Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.SystemPortOut#getOutComp <em>Out Comp</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.SystemPortOut#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemPortOut()
 * @model
 * @generated
 */
public interface SystemPortOut extends SystemPortDec
{
  /**
   * Returns the value of the '<em><b>Out Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Comp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Comp</em>' reference.
   * @see #setOutComp(ComponentImpl)
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemPortOut_OutComp()
   * @model
   * @generated
   */
  ComponentImpl getOutComp();

  /**
   * Sets the value of the '{@link hu.bme.mit.componentModel.SystemPortOut#getOutComp <em>Out Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Comp</em>' reference.
   * @see #getOutComp()
   * @generated
   */
  void setOutComp(ComponentImpl value);

  /**
   * Returns the value of the '<em><b>Out Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Port</em>' reference.
   * @see #setOutPort(Port)
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemPortOut_OutPort()
   * @model
   * @generated
   */
  Port getOutPort();

  /**
   * Sets the value of the '{@link hu.bme.mit.componentModel.SystemPortOut#getOutPort <em>Out Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Port</em>' reference.
   * @see #getOutPort()
   * @generated
   */
  void setOutPort(Port value);

} // SystemPortOut