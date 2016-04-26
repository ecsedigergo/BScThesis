/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.impl;

import hu.bme.mit.componentModel.AbstractFeatures;
import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.SystemDec;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemDecImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.componentModel.impl.SystemDecImpl#getSysFeatures <em>Sys Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemDecImpl extends AbstractElementImpl implements SystemDec
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
   * The cached value of the '{@link #getSysFeatures() <em>Sys Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSysFeatures()
   * @generated
   * @ordered
   */
  protected EList<AbstractFeatures> sysFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemDecImpl()
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
    return ComponentModelPackage.Literals.SYSTEM_DEC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.SYSTEM_DEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractFeatures> getSysFeatures()
  {
    if (sysFeatures == null)
    {
      sysFeatures = new EObjectContainmentEList<AbstractFeatures>(AbstractFeatures.class, this, ComponentModelPackage.SYSTEM_DEC__SYS_FEATURES);
    }
    return sysFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ComponentModelPackage.SYSTEM_DEC__SYS_FEATURES:
        return ((InternalEList<?>)getSysFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ComponentModelPackage.SYSTEM_DEC__NAME:
        return getName();
      case ComponentModelPackage.SYSTEM_DEC__SYS_FEATURES:
        return getSysFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComponentModelPackage.SYSTEM_DEC__NAME:
        setName((String)newValue);
        return;
      case ComponentModelPackage.SYSTEM_DEC__SYS_FEATURES:
        getSysFeatures().clear();
        getSysFeatures().addAll((Collection<? extends AbstractFeatures>)newValue);
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
      case ComponentModelPackage.SYSTEM_DEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ComponentModelPackage.SYSTEM_DEC__SYS_FEATURES:
        getSysFeatures().clear();
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
      case ComponentModelPackage.SYSTEM_DEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ComponentModelPackage.SYSTEM_DEC__SYS_FEATURES:
        return sysFeatures != null && !sysFeatures.isEmpty();
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

} //SystemDecImpl
