/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel.impl;

import hu.bme.mit.errorModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorModelFactoryImpl extends EFactoryImpl implements ErrorModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ErrorModelFactory init()
  {
    try
    {
      ErrorModelFactory theErrorModelFactory = (ErrorModelFactory)EPackage.Registry.INSTANCE.getEFactory(ErrorModelPackage.eNS_URI);
      if (theErrorModelFactory != null)
      {
        return theErrorModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ErrorModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ErrorModelPackage.ERROR_MODEL: return createErrorModel();
      case ErrorModelPackage.EMODEL_DEC: return createEModelDec();
      case ErrorModelPackage.EMODEL_ELEMENT: return createEModelElement();
      case ErrorModelPackage.OUTER_PROPAGATION: return createOuterPropagation();
      case ErrorModelPackage.IN_PROP_DEC: return createInPropDec();
      case ErrorModelPackage.OUT_PROP_DEC: return createOutPropDec();
      case ErrorModelPackage.STATE_DEC: return createStateDec();
      case ErrorModelPackage.EVENT_DEC: return createEventDec();
      case ErrorModelPackage.TRANSITION_FEATURE_DEC: return createTransitionFeatureDec();
      case ErrorModelPackage.TRIGGER_DEC: return createTriggerDec();
      case ErrorModelPackage.ACTION_DEC: return createActionDec();
      case ErrorModelPackage.TRANSITION_STATE: return createTransitionState();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModel createErrorModel()
  {
    ErrorModelImpl errorModel = new ErrorModelImpl();
    return errorModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EModelDec createEModelDec()
  {
    EModelDecImpl eModelDec = new EModelDecImpl();
    return eModelDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EModelElement createEModelElement()
  {
    EModelElementImpl eModelElement = new EModelElementImpl();
    return eModelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OuterPropagation createOuterPropagation()
  {
    OuterPropagationImpl outerPropagation = new OuterPropagationImpl();
    return outerPropagation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InPropDec createInPropDec()
  {
    InPropDecImpl inPropDec = new InPropDecImpl();
    return inPropDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutPropDec createOutPropDec()
  {
    OutPropDecImpl outPropDec = new OutPropDecImpl();
    return outPropDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDec createStateDec()
  {
    StateDecImpl stateDec = new StateDecImpl();
    return stateDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDec createEventDec()
  {
    EventDecImpl eventDec = new EventDecImpl();
    return eventDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionFeatureDec createTransitionFeatureDec()
  {
    TransitionFeatureDecImpl transitionFeatureDec = new TransitionFeatureDecImpl();
    return transitionFeatureDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerDec createTriggerDec()
  {
    TriggerDecImpl triggerDec = new TriggerDecImpl();
    return triggerDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDec createActionDec()
  {
    ActionDecImpl actionDec = new ActionDecImpl();
    return actionDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionState createTransitionState()
  {
    TransitionStateImpl transitionState = new TransitionStateImpl();
    return transitionState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelPackage getErrorModelPackage()
  {
    return (ErrorModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ErrorModelPackage getPackage()
  {
    return ErrorModelPackage.eINSTANCE;
  }

} //ErrorModelFactoryImpl
