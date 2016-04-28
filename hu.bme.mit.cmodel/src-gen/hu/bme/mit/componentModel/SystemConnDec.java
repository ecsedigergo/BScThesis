/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Conn Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.SystemConnDec#getSourceSystem <em>Source System</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.SystemConnDec#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.SystemConnDec#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.SystemConnDec#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemConnDec()
 * @model
 * @generated
 */
public interface SystemConnDec extends ComponentModelDec
{
  /**
   * Returns the value of the '<em><b>Source System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source System</em>' reference.
   * @see #setSourceSystem(SystemDec)
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemConnDec_SourceSystem()
   * @model
   * @generated
   */
  SystemDec getSourceSystem();

  /**
   * Sets the value of the '{@link hu.bme.mit.componentModel.SystemConnDec#getSourceSystem <em>Source System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source System</em>' reference.
   * @see #getSourceSystem()
   * @generated
   */
  void setSourceSystem(SystemDec value);

  /**
   * Returns the value of the '<em><b>Source Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Port</em>' reference.
   * @see #setSourcePort(SystemPortDec)
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemConnDec_SourcePort()
   * @model
   * @generated
   */
  SystemPortDec getSourcePort();

  /**
   * Sets the value of the '{@link hu.bme.mit.componentModel.SystemConnDec#getSourcePort <em>Source Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Port</em>' reference.
   * @see #getSourcePort()
   * @generated
   */
  void setSourcePort(SystemPortDec value);

  /**
   * Returns the value of the '<em><b>Target System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target System</em>' reference.
   * @see #setTargetSystem(SystemDec)
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemConnDec_TargetSystem()
   * @model
   * @generated
   */
  SystemDec getTargetSystem();

  /**
   * Sets the value of the '{@link hu.bme.mit.componentModel.SystemConnDec#getTargetSystem <em>Target System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target System</em>' reference.
   * @see #getTargetSystem()
   * @generated
   */
  void setTargetSystem(SystemDec value);

  /**
   * Returns the value of the '<em><b>Target Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Port</em>' reference.
   * @see #setTargetPort(SystemPortDec)
   * @see hu.bme.mit.componentModel.ComponentModelPackage#getSystemConnDec_TargetPort()
   * @model
   * @generated
   */
  SystemPortDec getTargetPort();

  /**
   * Sets the value of the '{@link hu.bme.mit.componentModel.SystemConnDec#getTargetPort <em>Target Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Port</em>' reference.
   * @see #getTargetPort()
   * @generated
   */
  void setTargetPort(SystemPortDec value);

} // SystemConnDec
