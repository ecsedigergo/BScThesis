/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.impl;

import hu.bme.mit.componentModel.ComponentFeature;
import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.ComponentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.componentModel.impl.ComponentTypeImpl#getCompFeatures <em>Comp Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends AbstractFeaturesImpl implements ComponentType
{
  /**
   * The cached value of the '{@link #getCompFeatures() <em>Comp Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompFeatures()
   * @generated
   * @ordered
   */
  protected EList<ComponentFeature> compFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentTypeImpl()
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
    return ComponentModelPackage.Literals.COMPONENT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentFeature> getCompFeatures()
  {
    if (compFeatures == null)
    {
      compFeatures = new EObjectContainmentEList<ComponentFeature>(ComponentFeature.class, this, ComponentModelPackage.COMPONENT_TYPE__COMP_FEATURES);
    }
    return compFeatures;
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
      case ComponentModelPackage.COMPONENT_TYPE__COMP_FEATURES:
        return ((InternalEList<?>)getCompFeatures()).basicRemove(otherEnd, msgs);
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
      case ComponentModelPackage.COMPONENT_TYPE__COMP_FEATURES:
        return getCompFeatures();
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
      case ComponentModelPackage.COMPONENT_TYPE__COMP_FEATURES:
        getCompFeatures().clear();
        getCompFeatures().addAll((Collection<? extends ComponentFeature>)newValue);
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
      case ComponentModelPackage.COMPONENT_TYPE__COMP_FEATURES:
        getCompFeatures().clear();
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
      case ComponentModelPackage.COMPONENT_TYPE__COMP_FEATURES:
        return compFeatures != null && !compFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentTypeImpl
