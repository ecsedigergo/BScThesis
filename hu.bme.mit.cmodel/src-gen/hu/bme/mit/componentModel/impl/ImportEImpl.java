/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.impl;

import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.ImportE;

import hu.bme.mit.errorModel.ErrorModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.impl.ImportEImpl#getIncludedEModel <em>Included EModel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportEImpl extends AbstractElementImpl implements ImportE
{
  /**
   * The cached value of the '{@link #getIncludedEModel() <em>Included EModel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedEModel()
   * @generated
   * @ordered
   */
  protected ErrorModel includedEModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportEImpl()
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
    return ComponentModelPackage.Literals.IMPORT_E;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModel getIncludedEModel()
  {
    if (includedEModel != null && includedEModel.eIsProxy())
    {
      InternalEObject oldIncludedEModel = (InternalEObject)includedEModel;
      includedEModel = (ErrorModel)eResolveProxy(oldIncludedEModel);
      if (includedEModel != oldIncludedEModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.IMPORT_E__INCLUDED_EMODEL, oldIncludedEModel, includedEModel));
      }
    }
    return includedEModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModel basicGetIncludedEModel()
  {
    return includedEModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludedEModel(ErrorModel newIncludedEModel)
  {
    ErrorModel oldIncludedEModel = includedEModel;
    includedEModel = newIncludedEModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.IMPORT_E__INCLUDED_EMODEL, oldIncludedEModel, includedEModel));
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
      case ComponentModelPackage.IMPORT_E__INCLUDED_EMODEL:
        if (resolve) return getIncludedEModel();
        return basicGetIncludedEModel();
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
      case ComponentModelPackage.IMPORT_E__INCLUDED_EMODEL:
        setIncludedEModel((ErrorModel)newValue);
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
      case ComponentModelPackage.IMPORT_E__INCLUDED_EMODEL:
        setIncludedEModel((ErrorModel)null);
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
      case ComponentModelPackage.IMPORT_E__INCLUDED_EMODEL:
        return includedEModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportEImpl