/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.impl;

import hu.bme.mit.componentModel.ActionDec;
import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.ErrorModes;
import hu.bme.mit.componentModel.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.impl.ActionDecImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.ActionDecImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.ActionDecImpl#getErrorMode <em>Error Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDecImpl extends TransitionFeatureDecImpl implements ActionDec
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
   * The cached value of the '{@link #getPortInstance() <em>Port Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortInstance()
   * @generated
   * @ordered
   */
  protected Port portInstance;

  /**
   * The cached value of the '{@link #getErrorMode() <em>Error Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMode()
   * @generated
   * @ordered
   */
  protected ErrorModes errorMode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionDecImpl()
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
    return ComponentModelPackage.Literals.ACTION_DEC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.ACTION_DEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPortInstance()
  {
    if (portInstance != null && portInstance.eIsProxy())
    {
      InternalEObject oldPortInstance = (InternalEObject)portInstance;
      portInstance = (Port)eResolveProxy(oldPortInstance);
      if (portInstance != oldPortInstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.ACTION_DEC__PORT_INSTANCE, oldPortInstance, portInstance));
      }
    }
    return portInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPortInstance()
  {
    return portInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortInstance(Port newPortInstance)
  {
    Port oldPortInstance = portInstance;
    portInstance = newPortInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.ACTION_DEC__PORT_INSTANCE, oldPortInstance, portInstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModes getErrorMode()
  {
    if (errorMode != null && errorMode.eIsProxy())
    {
      InternalEObject oldErrorMode = (InternalEObject)errorMode;
      errorMode = (ErrorModes)eResolveProxy(oldErrorMode);
      if (errorMode != oldErrorMode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.ACTION_DEC__ERROR_MODE, oldErrorMode, errorMode));
      }
    }
    return errorMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModes basicGetErrorMode()
  {
    return errorMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorMode(ErrorModes newErrorMode)
  {
    ErrorModes oldErrorMode = errorMode;
    errorMode = newErrorMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.ACTION_DEC__ERROR_MODE, oldErrorMode, errorMode));
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
      case ComponentModelPackage.ACTION_DEC__NAME:
        return getName();
      case ComponentModelPackage.ACTION_DEC__PORT_INSTANCE:
        if (resolve) return getPortInstance();
        return basicGetPortInstance();
      case ComponentModelPackage.ACTION_DEC__ERROR_MODE:
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
      case ComponentModelPackage.ACTION_DEC__NAME:
        setName((String)newValue);
        return;
      case ComponentModelPackage.ACTION_DEC__PORT_INSTANCE:
        setPortInstance((Port)newValue);
        return;
      case ComponentModelPackage.ACTION_DEC__ERROR_MODE:
        setErrorMode((ErrorModes)newValue);
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
      case ComponentModelPackage.ACTION_DEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ComponentModelPackage.ACTION_DEC__PORT_INSTANCE:
        setPortInstance((Port)null);
        return;
      case ComponentModelPackage.ACTION_DEC__ERROR_MODE:
        setErrorMode((ErrorModes)null);
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
      case ComponentModelPackage.ACTION_DEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ComponentModelPackage.ACTION_DEC__PORT_INSTANCE:
        return portInstance != null;
      case ComponentModelPackage.ACTION_DEC__ERROR_MODE:
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

} //ActionDecImpl