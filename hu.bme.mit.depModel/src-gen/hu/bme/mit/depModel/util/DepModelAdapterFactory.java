/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.util;

import hu.bme.mit.depModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.depModel.DepModelPackage
 * @generated
 */
public class DepModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DepModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DepModelPackage.eINSTANCE;
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
  protected DepModelSwitch<Adapter> modelSwitch =
    new DepModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseDepModel(DepModel object)
      {
        return createDepModelAdapter();
      }
      @Override
      public Adapter caseabstractModelDec(abstractModelDec object)
      {
        return createabstractModelDecAdapter();
      }
      @Override
      public Adapter casePortType(PortType object)
      {
        return createPortTypeAdapter();
      }
      @Override
      public Adapter caseerrorModes(errorModes object)
      {
        return createerrorModesAdapter();
      }
      @Override
      public Adapter caseErrorModel(ErrorModel object)
      {
        return createErrorModelAdapter();
      }
      @Override
      public Adapter caseEModelElement(EModelElement object)
      {
        return createEModelElementAdapter();
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
      public Adapter caseTransitionFeatureDec(TransitionFeatureDec object)
      {
        return createTransitionFeatureDecAdapter();
      }
      @Override
      public Adapter caseTransitionState(TransitionState object)
      {
        return createTransitionStateAdapter();
      }
      @Override
      public Adapter caseTriggerDec(TriggerDec object)
      {
        return createTriggerDecAdapter();
      }
      @Override
      public Adapter caseActionDec(ActionDec object)
      {
        return createActionDecAdapter();
      }
      @Override
      public Adapter caseComponentModel(ComponentModel object)
      {
        return createComponentModelAdapter();
      }
      @Override
      public Adapter caseComponentModelDec(ComponentModelDec object)
      {
        return createComponentModelDecAdapter();
      }
      @Override
      public Adapter caseSystemConnDec(SystemConnDec object)
      {
        return createSystemConnDecAdapter();
      }
      @Override
      public Adapter caseSystemDec(SystemDec object)
      {
        return createSystemDecAdapter();
      }
      @Override
      public Adapter caseAbstractFeatures(AbstractFeatures object)
      {
        return createAbstractFeaturesAdapter();
      }
      @Override
      public Adapter caseSystemPortDec(SystemPortDec object)
      {
        return createSystemPortDecAdapter();
      }
      @Override
      public Adapter caseSystemPortIn(SystemPortIn object)
      {
        return createSystemPortInAdapter();
      }
      @Override
      public Adapter caseSystemPortOut(SystemPortOut object)
      {
        return createSystemPortOutAdapter();
      }
      @Override
      public Adapter caseCompConnDec(CompConnDec object)
      {
        return createCompConnDecAdapter();
      }
      @Override
      public Adapter caseComponentImpl(ComponentImpl object)
      {
        return createComponentImplAdapter();
      }
      @Override
      public Adapter caseComponentType(ComponentType object)
      {
        return createComponentTypeAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseInPort(InPort object)
      {
        return createInPortAdapter();
      }
      @Override
      public Adapter caseOutPort(OutPort object)
      {
        return createOutPortAdapter();
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
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.DepModel <em>Dep Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.DepModel
   * @generated
   */
  public Adapter createDepModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.abstractModelDec <em>abstract Model Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.abstractModelDec
   * @generated
   */
  public Adapter createabstractModelDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.PortType <em>Port Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.PortType
   * @generated
   */
  public Adapter createPortTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.errorModes <em>error Modes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.errorModes
   * @generated
   */
  public Adapter createerrorModesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.ErrorModel <em>Error Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.ErrorModel
   * @generated
   */
  public Adapter createErrorModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.EModelElement <em>EModel Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.EModelElement
   * @generated
   */
  public Adapter createEModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.StateDec <em>State Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.StateDec
   * @generated
   */
  public Adapter createStateDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.EventDec <em>Event Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.EventDec
   * @generated
   */
  public Adapter createEventDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.TransitionFeatureDec <em>Transition Feature Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.TransitionFeatureDec
   * @generated
   */
  public Adapter createTransitionFeatureDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.TransitionState <em>Transition State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.TransitionState
   * @generated
   */
  public Adapter createTransitionStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.TriggerDec <em>Trigger Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.TriggerDec
   * @generated
   */
  public Adapter createTriggerDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.ActionDec <em>Action Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.ActionDec
   * @generated
   */
  public Adapter createActionDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.ComponentModel <em>Component Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.ComponentModel
   * @generated
   */
  public Adapter createComponentModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.ComponentModelDec <em>Component Model Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.ComponentModelDec
   * @generated
   */
  public Adapter createComponentModelDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.SystemConnDec <em>System Conn Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.SystemConnDec
   * @generated
   */
  public Adapter createSystemConnDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.SystemDec <em>System Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.SystemDec
   * @generated
   */
  public Adapter createSystemDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.AbstractFeatures <em>Abstract Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.AbstractFeatures
   * @generated
   */
  public Adapter createAbstractFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.SystemPortDec <em>System Port Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.SystemPortDec
   * @generated
   */
  public Adapter createSystemPortDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.SystemPortIn <em>System Port In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.SystemPortIn
   * @generated
   */
  public Adapter createSystemPortInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.SystemPortOut <em>System Port Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.SystemPortOut
   * @generated
   */
  public Adapter createSystemPortOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.CompConnDec <em>Comp Conn Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.CompConnDec
   * @generated
   */
  public Adapter createCompConnDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.ComponentImpl <em>Component Impl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.ComponentImpl
   * @generated
   */
  public Adapter createComponentImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.ComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.ComponentType
   * @generated
   */
  public Adapter createComponentTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.InPort <em>In Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.InPort
   * @generated
   */
  public Adapter createInPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.depModel.OutPort <em>Out Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.depModel.OutPort
   * @generated
   */
  public Adapter createOutPortAdapter()
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

} //DepModelAdapterFactory