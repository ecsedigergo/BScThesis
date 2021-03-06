/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.impl;

import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.SystemConnDec;
import hu.bme.mit.componentModel.SystemDec;
import hu.bme.mit.componentModel.SystemPortDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Conn Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemConnDecImpl#getSourceSystem <em>Source System</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemConnDecImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemConnDecImpl#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemConnDecImpl#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemConnDecImpl extends AbstractElementImpl implements SystemConnDec
{
  /**
   * The cached value of the '{@link #getSourceSystem() <em>Source System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceSystem()
   * @generated
   * @ordered
   */
  protected SystemDec sourceSystem;

  /**
   * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePort()
   * @generated
   * @ordered
   */
  protected SystemPortDec sourcePort;

  /**
   * The cached value of the '{@link #getTargetSystem() <em>Target System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetSystem()
   * @generated
   * @ordered
   */
  protected SystemDec targetSystem;

  /**
   * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetPort()
   * @generated
   * @ordered
   */
  protected SystemPortDec targetPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemConnDecImpl()
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
    return ComponentModelPackage.Literals.SYSTEM_CONN_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDec getSourceSystem()
  {
    if (sourceSystem != null && sourceSystem.eIsProxy())
    {
      InternalEObject oldSourceSystem = (InternalEObject)sourceSystem;
      sourceSystem = (SystemDec)eResolveProxy(oldSourceSystem);
      if (sourceSystem != oldSourceSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_SYSTEM, oldSourceSystem, sourceSystem));
      }
    }
    return sourceSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDec basicGetSourceSystem()
  {
    return sourceSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceSystem(SystemDec newSourceSystem)
  {
    SystemDec oldSourceSystem = sourceSystem;
    sourceSystem = newSourceSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_SYSTEM, oldSourceSystem, sourceSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortDec getSourcePort()
  {
    if (sourcePort != null && sourcePort.eIsProxy())
    {
      InternalEObject oldSourcePort = (InternalEObject)sourcePort;
      sourcePort = (SystemPortDec)eResolveProxy(oldSourcePort);
      if (sourcePort != oldSourcePort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_PORT, oldSourcePort, sourcePort));
      }
    }
    return sourcePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortDec basicGetSourcePort()
  {
    return sourcePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcePort(SystemPortDec newSourcePort)
  {
    SystemPortDec oldSourcePort = sourcePort;
    sourcePort = newSourcePort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_PORT, oldSourcePort, sourcePort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDec getTargetSystem()
  {
    if (targetSystem != null && targetSystem.eIsProxy())
    {
      InternalEObject oldTargetSystem = (InternalEObject)targetSystem;
      targetSystem = (SystemDec)eResolveProxy(oldTargetSystem);
      if (targetSystem != oldTargetSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_SYSTEM, oldTargetSystem, targetSystem));
      }
    }
    return targetSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDec basicGetTargetSystem()
  {
    return targetSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetSystem(SystemDec newTargetSystem)
  {
    SystemDec oldTargetSystem = targetSystem;
    targetSystem = newTargetSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_SYSTEM, oldTargetSystem, targetSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortDec getTargetPort()
  {
    if (targetPort != null && targetPort.eIsProxy())
    {
      InternalEObject oldTargetPort = (InternalEObject)targetPort;
      targetPort = (SystemPortDec)eResolveProxy(oldTargetPort);
      if (targetPort != oldTargetPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_PORT, oldTargetPort, targetPort));
      }
    }
    return targetPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortDec basicGetTargetPort()
  {
    return targetPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetPort(SystemPortDec newTargetPort)
  {
    SystemPortDec oldTargetPort = targetPort;
    targetPort = newTargetPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_PORT, oldTargetPort, targetPort));
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
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_SYSTEM:
        if (resolve) return getSourceSystem();
        return basicGetSourceSystem();
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_PORT:
        if (resolve) return getSourcePort();
        return basicGetSourcePort();
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_SYSTEM:
        if (resolve) return getTargetSystem();
        return basicGetTargetSystem();
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_PORT:
        if (resolve) return getTargetPort();
        return basicGetTargetPort();
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
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_SYSTEM:
        setSourceSystem((SystemDec)newValue);
        return;
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_PORT:
        setSourcePort((SystemPortDec)newValue);
        return;
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_SYSTEM:
        setTargetSystem((SystemDec)newValue);
        return;
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_PORT:
        setTargetPort((SystemPortDec)newValue);
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
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_SYSTEM:
        setSourceSystem((SystemDec)null);
        return;
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_PORT:
        setSourcePort((SystemPortDec)null);
        return;
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_SYSTEM:
        setTargetSystem((SystemDec)null);
        return;
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_PORT:
        setTargetPort((SystemPortDec)null);
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
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_SYSTEM:
        return sourceSystem != null;
      case ComponentModelPackage.SYSTEM_CONN_DEC__SOURCE_PORT:
        return sourcePort != null;
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_SYSTEM:
        return targetSystem != null;
      case ComponentModelPackage.SYSTEM_CONN_DEC__TARGET_PORT:
        return targetPort != null;
    }
    return super.eIsSet(featureID);
  }

} //SystemConnDecImpl
