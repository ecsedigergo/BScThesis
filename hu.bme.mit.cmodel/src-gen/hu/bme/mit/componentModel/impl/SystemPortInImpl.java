/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.impl;

import hu.bme.mit.componentModel.ComponentImpl;
import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.InPort;
import hu.bme.mit.componentModel.SystemPortIn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Port In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemPortInImpl#getInComp <em>In Comp</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemPortInImpl#getInPort <em>In Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemPortInImpl extends SystemPortDecImpl implements SystemPortIn
{
  /**
   * The cached value of the '{@link #getInComp() <em>In Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInComp()
   * @generated
   * @ordered
   */
  protected ComponentImpl inComp;

  /**
   * The cached value of the '{@link #getInPort() <em>In Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInPort()
   * @generated
   * @ordered
   */
  protected InPort inPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemPortInImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ComponentModelPackage.Literals.SYSTEM_PORT_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl getInComp()
  {
    if (inComp != null && inComp.eIsProxy())
    {
      InternalEObject oldInComp = (InternalEObject)inComp;
      inComp = (ComponentImpl)eResolveProxy(oldInComp);
      if (inComp != oldInComp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.SYSTEM_PORT_IN__IN_COMP, oldInComp, inComp));
      }
    }
    return inComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl basicGetInComp()
  {
    return inComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInComp(ComponentImpl newInComp)
  {
    ComponentImpl oldInComp = inComp;
    inComp = newInComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_PORT_IN__IN_COMP, oldInComp, inComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InPort getInPort()
  {
    if (inPort != null && inPort.eIsProxy())
    {
      InternalEObject oldInPort = (InternalEObject)inPort;
      inPort = (InPort)eResolveProxy(oldInPort);
      if (inPort != oldInPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.SYSTEM_PORT_IN__IN_PORT, oldInPort, inPort));
      }
    }
    return inPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InPort basicGetInPort()
  {
    return inPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInPort(InPort newInPort)
  {
    InPort oldInPort = inPort;
    inPort = newInPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_PORT_IN__IN_PORT, oldInPort, inPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_COMP:
        if (resolve) return getInComp();
        return basicGetInComp();
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_PORT:
        if (resolve) return getInPort();
        return basicGetInPort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_COMP:
        setInComp((ComponentImpl)newValue);
        return;
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_PORT:
        setInPort((InPort)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_COMP:
        setInComp((ComponentImpl)null);
        return;
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_PORT:
        setInPort((InPort)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_COMP:
        return inComp != null;
      case ComponentModelPackage.SYSTEM_PORT_IN__IN_PORT:
        return inPort != null;
    }
    return super.eIsSet(featureID);
  }

} //SystemPortInImpl
