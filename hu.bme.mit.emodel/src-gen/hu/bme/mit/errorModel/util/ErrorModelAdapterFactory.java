/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel.util;

import hu.bme.mit.errorModel.EModelDec;
import hu.bme.mit.errorModel.EModelElement;
import hu.bme.mit.errorModel.EPropagationDec;
import hu.bme.mit.errorModel.ErrorModel;
import hu.bme.mit.errorModel.ErrorModelPackage;
import hu.bme.mit.errorModel.EventDec;
import hu.bme.mit.errorModel.EventFeature;
import hu.bme.mit.errorModel.EventState;
import hu.bme.mit.errorModel.InPropDec;
import hu.bme.mit.errorModel.OutPropDec;
import hu.bme.mit.errorModel.OuterPropagation;
import hu.bme.mit.errorModel.StateDec;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.errorModel.ErrorModelPackage
 * @generated
 */
public class ErrorModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ErrorModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ErrorModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ErrorModelSwitch<Adapter> modelSwitch =
    new ErrorModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseErrorModel(ErrorModel object)
      {
        return createErrorModelAdapter();
      }
      @Override
      public Adapter caseError(hu.bme.mit.errorModel.Error object)
      {
        return createErrorAdapter();
      }
      @Override
      public Adapter caseEPropagationDec(EPropagationDec object)
      {
        return createEPropagationDecAdapter();
      }
      @Override
      public Adapter caseEModelDec(EModelDec object)
      {
        return createEModelDecAdapter();
      }
      @Override
      public Adapter caseEModelElement(EModelElement object)
      {
        return createEModelElementAdapter();
      }
      @Override
      public Adapter caseOuterPropagation(OuterPropagation object)
      {
        return createOuterPropagationAdapter();
      }
      @Override
      public Adapter caseInPropDec(InPropDec object)
      {
        return createInPropDecAdapter();
      }
      @Override
      public Adapter caseOutPropDec(OutPropDec object)
      {
        return createOutPropDecAdapter();
      }
      @Override
      public Adapter caseStateDec(StateDec object)
      {
        return createStateDecAdapter();
      }
      @Override
      public Adapter caseEventDec(EventDec object)
      {
        return createEventDecAdapter();
      }
      @Override
      public Adapter caseEventFeature(EventFeature object)
      {
        return createEventFeatureAdapter();
      }
      @Override
      public Adapter caseEventState(EventState object)
      {
        return createEventStateAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.ErrorModel <em>Error Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.ErrorModel
   * @generated
   */
  public Adapter createErrorModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.Error <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.Error
   * @generated
   */
  public Adapter createErrorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.EPropagationDec <em>EPropagation Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.EPropagationDec
   * @generated
   */
  public Adapter createEPropagationDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.EModelDec <em>EModel Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.EModelDec
   * @generated
   */
  public Adapter createEModelDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.EModelElement <em>EModel Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.EModelElement
   * @generated
   */
  public Adapter createEModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.OuterPropagation <em>Outer Propagation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.OuterPropagation
   * @generated
   */
  public Adapter createOuterPropagationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.InPropDec <em>In Prop Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.InPropDec
   * @generated
   */
  public Adapter createInPropDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.OutPropDec <em>Out Prop Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.OutPropDec
   * @generated
   */
  public Adapter createOutPropDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.StateDec <em>State Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.StateDec
   * @generated
   */
  public Adapter createStateDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.EventDec <em>Event Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.EventDec
   * @generated
   */
  public Adapter createEventDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.EventFeature <em>Event Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.EventFeature
   * @generated
   */
  public Adapter createEventFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.errorModel.EventState <em>Event State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.errorModel.EventState
   * @generated
   */
  public Adapter createEventStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ErrorModelAdapterFactory