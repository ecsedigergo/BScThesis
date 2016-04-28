/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.Port;
import hu.bme.mit.depModel.TriggerDec;
import hu.bme.mit.depModel.errorModes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.TriggerDecImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.TriggerDecImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.TriggerDecImpl#getErrorMode <em>Error Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerDecImpl extends TransitionFeatureDecImpl implements TriggerDec
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortType()
   * @generated
   * @ordered
   */
  protected Port portType;

  /**
   * The cached value of the '{@link #getErrorMode() <em>Error Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMode()
   * @generated
   * @ordered
   */
  protected errorModes errorMode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerDecImpl()
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
    return DepModelPackage.Literals.TRIGGER_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.TRIGGER_DEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPortType()
  {
    if (portType != null && portType.eIsProxy())
    {
      InternalEObject oldPortType = (InternalEObject)portType;
      portType = (Port)eResolveProxy(oldPortType);
      if (portType != oldPortType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.TRIGGER_DEC__PORT_TYPE, oldPortType, portType));
      }
    }
    return portType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPortType()
  {
    return portType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortType(Port newPortType)
  {
    Port oldPortType = portType;
    portType = newPortType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.TRIGGER_DEC__PORT_TYPE, oldPortType, portType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public errorModes getErrorMode()
  {
    if (errorMode != null && errorMode.eIsProxy())
    {
      InternalEObject oldErrorMode = (InternalEObject)errorMode;
      errorMode = (errorModes)eResolveProxy(oldErrorMode);
      if (errorMode != oldErrorMode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.TRIGGER_DEC__ERROR_MODE, oldErrorMode, errorMode));
      }
    }
    return errorMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public errorModes basicGetErrorMode()
  {
    return errorMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorMode(errorModes newErrorMode)
  {
    errorModes oldErrorMode = errorMode;
    errorMode = newErrorMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.TRIGGER_DEC__ERROR_MODE, oldErrorMode, errorMode));
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
      case DepModelPackage.TRIGGER_DEC__NAME:
        return getName();
      case DepModelPackage.TRIGGER_DEC__PORT_TYPE:
        if (resolve) return getPortType();
        return basicGetPortType();
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
        if (resolve) return getErrorMode();
        return basicGetErrorMode();
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
      case DepModelPackage.TRIGGER_DEC__NAME:
        setName((String)newValue);
        return;
      case DepModelPackage.TRIGGER_DEC__PORT_TYPE:
        setPortType((Port)newValue);
        return;
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
        setErrorMode((errorModes)newValue);
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
      case DepModelPackage.TRIGGER_DEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DepModelPackage.TRIGGER_DEC__PORT_TYPE:
        setPortType((Port)null);
        return;
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
        setErrorMode((errorModes)null);
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
      case DepModelPackage.TRIGGER_DEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DepModelPackage.TRIGGER_DEC__PORT_TYPE:
        return portType != null;
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
        return errorMode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TriggerDecImpl
