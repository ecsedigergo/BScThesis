/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.errorModel.impl;

import hu.bme.mit.errorModel.ActionDec;
import hu.bme.mit.errorModel.EModelDec;
import hu.bme.mit.errorModel.EModelElement;
import hu.bme.mit.errorModel.ErrorModel;
import hu.bme.mit.errorModel.ErrorModelFactory;
import hu.bme.mit.errorModel.ErrorModelPackage;
import hu.bme.mit.errorModel.EventDec;
import hu.bme.mit.errorModel.InPropDec;
import hu.bme.mit.errorModel.OutPropDec;
import hu.bme.mit.errorModel.OuterPropagation;
import hu.bme.mit.errorModel.StateDec;
import hu.bme.mit.errorModel.TransitionFeatureDec;
import hu.bme.mit.errorModel.TransitionState;
import hu.bme.mit.errorModel.TriggerDec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorModelPackageImpl extends EPackageImpl implements ErrorModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eModelDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eModelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outerPropagationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inPropDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outPropDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionFeatureDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionStateEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hu.bme.mit.errorModel.ErrorModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ErrorModelPackageImpl()
  {
    super(eNS_URI, ErrorModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ErrorModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ErrorModelPackage init()
  {
    if (isInited) return (ErrorModelPackage)EPackage.Registry.INSTANCE.getEPackage(ErrorModelPackage.eNS_URI);

    // Obtain or create and register package
    ErrorModelPackageImpl theErrorModelPackage = (ErrorModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErrorModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErrorModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theErrorModelPackage.createPackageContents();

    // Initialize created meta-data
    theErrorModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theErrorModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ErrorModelPackage.eNS_URI, theErrorModelPackage);
    return theErrorModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorModel()
  {
    return errorModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorModel_AbstractElement()
  {
    return (EReference)errorModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEModelDec()
  {
    return eModelDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEModelDec_Name()
  {
    return (EAttribute)eModelDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEModelDec_EmodelElements()
  {
    return (EReference)eModelDecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEModelElement()
  {
    return eModelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEModelElement_Name()
  {
    return (EAttribute)eModelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOuterPropagation()
  {
    return outerPropagationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInPropDec()
  {
    return inPropDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInPropDec_AffectedState()
  {
    return (EReference)inPropDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutPropDec()
  {
    return outPropDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutPropDec_FromState()
  {
    return (EReference)outPropDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDec()
  {
    return stateDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDec()
  {
    return eventDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDec_Features()
  {
    return (EReference)eventDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionFeatureDec()
  {
    return transitionFeatureDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggerDec()
  {
    return triggerDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTriggerDec_Name()
  {
    return (EAttribute)triggerDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionDec()
  {
    return actionDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionDec_Name()
  {
    return (EAttribute)actionDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionState()
  {
    return transitionStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionState_SourceState()
  {
    return (EReference)transitionStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionState_TargetState()
  {
    return (EReference)transitionStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelFactory getErrorModelFactory()
  {
    return (ErrorModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    errorModelEClass = createEClass(ERROR_MODEL);
    createEReference(errorModelEClass, ERROR_MODEL__ABSTRACT_ELEMENT);

    eModelDecEClass = createEClass(EMODEL_DEC);
    createEAttribute(eModelDecEClass, EMODEL_DEC__NAME);
    createEReference(eModelDecEClass, EMODEL_DEC__EMODEL_ELEMENTS);

    eModelElementEClass = createEClass(EMODEL_ELEMENT);
    createEAttribute(eModelElementEClass, EMODEL_ELEMENT__NAME);

    outerPropagationEClass = createEClass(OUTER_PROPAGATION);

    inPropDecEClass = createEClass(IN_PROP_DEC);
    createEReference(inPropDecEClass, IN_PROP_DEC__AFFECTED_STATE);

    outPropDecEClass = createEClass(OUT_PROP_DEC);
    createEReference(outPropDecEClass, OUT_PROP_DEC__FROM_STATE);

    stateDecEClass = createEClass(STATE_DEC);

    eventDecEClass = createEClass(EVENT_DEC);
    createEReference(eventDecEClass, EVENT_DEC__FEATURES);

    transitionFeatureDecEClass = createEClass(TRANSITION_FEATURE_DEC);

    triggerDecEClass = createEClass(TRIGGER_DEC);
    createEAttribute(triggerDecEClass, TRIGGER_DEC__NAME);

    actionDecEClass = createEClass(ACTION_DEC);
    createEAttribute(actionDecEClass, ACTION_DEC__NAME);

    transitionStateEClass = createEClass(TRANSITION_STATE);
    createEReference(transitionStateEClass, TRANSITION_STATE__SOURCE_STATE);
    createEReference(transitionStateEClass, TRANSITION_STATE__TARGET_STATE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    outerPropagationEClass.getESuperTypes().add(this.getEModelElement());
    inPropDecEClass.getESuperTypes().add(this.getOuterPropagation());
    outPropDecEClass.getESuperTypes().add(this.getOuterPropagation());
    stateDecEClass.getESuperTypes().add(this.getEModelElement());
    eventDecEClass.getESuperTypes().add(this.getEModelElement());
    triggerDecEClass.getESuperTypes().add(this.getTransitionFeatureDec());
    actionDecEClass.getESuperTypes().add(this.getTransitionFeatureDec());
    transitionStateEClass.getESuperTypes().add(this.getTransitionFeatureDec());

    // Initialize classes and features; add operations and parameters
    initEClass(errorModelEClass, ErrorModel.class, "ErrorModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getErrorModel_AbstractElement(), this.getEModelDec(), null, "AbstractElement", null, 0, -1, ErrorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eModelDecEClass, EModelDec.class, "EModelDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEModelDec_Name(), ecorePackage.getEString(), "name", null, 0, 1, EModelDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEModelDec_EmodelElements(), this.getEModelElement(), null, "emodelElements", null, 0, -1, EModelDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eModelElementEClass, EModelElement.class, "EModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outerPropagationEClass, OuterPropagation.class, "OuterPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inPropDecEClass, InPropDec.class, "InPropDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInPropDec_AffectedState(), this.getEventDec(), null, "affectedState", null, 0, 1, InPropDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outPropDecEClass, OutPropDec.class, "OutPropDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutPropDec_FromState(), this.getEventDec(), null, "fromState", null, 0, 1, OutPropDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDecEClass, StateDec.class, "StateDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventDecEClass, EventDec.class, "EventDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventDec_Features(), this.getTransitionFeatureDec(), null, "Features", null, 0, -1, EventDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionFeatureDecEClass, TransitionFeatureDec.class, "TransitionFeatureDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(triggerDecEClass, TriggerDec.class, "TriggerDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTriggerDec_Name(), ecorePackage.getEString(), "name", null, 0, 1, TriggerDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionDecEClass, ActionDec.class, "ActionDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionDec_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionStateEClass, TransitionState.class, "TransitionState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionState_SourceState(), this.getStateDec(), null, "sourceState", null, 0, 1, TransitionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionState_TargetState(), this.getStateDec(), null, "targetState", null, 0, 1, TransitionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ErrorModelPackageImpl
