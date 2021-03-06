/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel.impl;

import hu.bme.mit.errorModel.ErrorModelPackage;
import hu.bme.mit.errorModel.EventDec;
import hu.bme.mit.errorModel.OutPropDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Prop Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.errorModel.impl.OutPropDecImpl#getFromState <em>From State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutPropDecImpl extends OuterPropagationImpl implements OutPropDec
{
  /**
   * The cached value of the '{@link #getFromState() <em>From State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromState()
   * @generated
   * @ordered
   */
  protected EventDec fromState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutPropDecImpl()
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
    return ErrorModelPackage.Literals.OUT_PROP_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDec getFromState()
  {
    if (fromState != null && fromState.eIsProxy())
    {
      InternalEObject oldFromState = (InternalEObject)fromState;
      fromState = (EventDec)eResolveProxy(oldFromState);
      if (fromState != oldFromState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorModelPackage.OUT_PROP_DEC__FROM_STATE, oldFromState, fromState));
      }
    }
    return fromState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDec basicGetFromState()
  {
    return fromState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromState(EventDec newFromState)
  {
    EventDec oldFromState = fromState;
    fromState = newFromState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErrorModelPackage.OUT_PROP_DEC__FROM_STATE, oldFromState, fromState));
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
      case ErrorModelPackage.OUT_PROP_DEC__FROM_STATE:
        if (resolve) return getFromState();
        return basicGetFromState();
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
      case ErrorModelPackage.OUT_PROP_DEC__FROM_STATE:
        setFromState((EventDec)newValue);
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
      case ErrorModelPackage.OUT_PROP_DEC__FROM_STATE:
        setFromState((EventDec)null);
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
      case ErrorModelPackage.OUT_PROP_DEC__FROM_STATE:
        return fromState != null;
    }
    return super.eIsSet(featureID);
  }

} //OutPropDecImpl
