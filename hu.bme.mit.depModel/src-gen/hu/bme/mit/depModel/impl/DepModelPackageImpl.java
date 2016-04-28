/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.AbstractFeatures;
import hu.bme.mit.depModel.ActionDec;
import hu.bme.mit.depModel.CompConnDec;
import hu.bme.mit.depModel.ComponentImpl;
import hu.bme.mit.depModel.ComponentModel;
import hu.bme.mit.depModel.ComponentModelDec;
import hu.bme.mit.depModel.ComponentType;
import hu.bme.mit.depModel.DepModel;
import hu.bme.mit.depModel.DepModelFactory;
import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.EModelElement;
import hu.bme.mit.depModel.ErrorModel;
import hu.bme.mit.depModel.EventDec;
import hu.bme.mit.depModel.InPort;
import hu.bme.mit.depModel.OutPort;
import hu.bme.mit.depModel.Port;
import hu.bme.mit.depModel.PortType;
import hu.bme.mit.depModel.StateDec;
import hu.bme.mit.depModel.SystemConnDec;
import hu.bme.mit.depModel.SystemDec;
import hu.bme.mit.depModel.SystemPortDec;
import hu.bme.mit.depModel.SystemPortIn;
import hu.bme.mit.depModel.SystemPortOut;
import hu.bme.mit.depModel.TransitionFeatureDec;
import hu.bme.mit.depModel.TransitionState;
import hu.bme.mit.depModel.TriggerDec;
import hu.bme.mit.depModel.abstractModelDec;
import hu.bme.mit.depModel.errorModes;

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
public class DepModelPackageImpl extends EPackageImpl implements DepModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass depModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractModelDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorModesEClass = null;

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
  private EClass eModelElementEClass = null;

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
  private EClass transitionStateEClass = null;

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
  private EClass componentModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentModelDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemConnDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractFeaturesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemPortDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemPortInEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemPortOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compConnDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentImplEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outPortEClass = null;

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
   * @see hu.bme.mit.depModel.DepModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DepModelPackageImpl()
  {
    super(eNS_URI, DepModelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DepModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DepModelPackage init()
  {
    if (isInited) return (DepModelPackage)EPackage.Registry.INSTANCE.getEPackage(DepModelPackage.eNS_URI);

    // Obtain or create and register package
    DepModelPackageImpl theDepModelPackage = (DepModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DepModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DepModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDepModelPackage.createPackageContents();

    // Initialize created meta-data
    theDepModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDepModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DepModelPackage.eNS_URI, theDepModelPackage);
    return theDepModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDepModel()
  {
    return depModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDepModel_Depmodels()
  {
    return (EReference)depModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getabstractModelDec()
  {
    return abstractModelDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPortType()
  {
    return portTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPortType_Name()
  {
    return (EAttribute)portTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPortType_EModes()
  {
    return (EReference)portTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geterrorModes()
  {
    return errorModesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geterrorModes_Name()
  {
    return (EAttribute)errorModesEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getErrorModel_Name()
  {
    return (EAttribute)errorModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorModel_EmodelElements()
  {
    return (EReference)errorModelEClass.getEStructuralFeatures().get(1);
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
  public EReference getTriggerDec_PortType()
  {
    return (EReference)triggerDecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggerDec_ErrorMode()
  {
    return (EReference)triggerDecEClass.getEStructuralFeatures().get(2);
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
  public EReference getActionDec_PortType()
  {
    return (EReference)actionDecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionDec_ErrorMode()
  {
    return (EReference)actionDecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentModel()
  {
    return componentModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentModel_Elements()
  {
    return (EReference)componentModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentModelDec()
  {
    return componentModelDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentModelDec_Name()
  {
    return (EAttribute)componentModelDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemConnDec()
  {
    return systemConnDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemConnDec_SourceSystem()
  {
    return (EReference)systemConnDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemConnDec_SourcePort()
  {
    return (EReference)systemConnDecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemConnDec_TargetSystem()
  {
    return (EReference)systemConnDecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemConnDec_TargetPort()
  {
    return (EReference)systemConnDecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemDec()
  {
    return systemDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemDec_SysFeatures()
  {
    return (EReference)systemDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractFeatures()
  {
    return abstractFeaturesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractFeatures_Name()
  {
    return (EAttribute)abstractFeaturesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemPortDec()
  {
    return systemPortDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemPortIn()
  {
    return systemPortInEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemPortIn_InComp()
  {
    return (EReference)systemPortInEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemPortIn_InPort()
  {
    return (EReference)systemPortInEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemPortOut()
  {
    return systemPortOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemPortOut_OutComp()
  {
    return (EReference)systemPortOutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemPortOut_OutPort()
  {
    return (EReference)systemPortOutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompConnDec()
  {
    return compConnDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompConnDec_SourceComp()
  {
    return (EReference)compConnDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompConnDec_SourcePort()
  {
    return (EReference)compConnDecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompConnDec_TargetComp()
  {
    return (EReference)compConnDecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompConnDec_TargetPort()
  {
    return (EReference)compConnDecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentImpl()
  {
    return componentImplEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentImpl_SuperType()
  {
    return (EReference)componentImplEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentType()
  {
    return componentTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_CompFeatures()
  {
    return (EReference)componentTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Name()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_SuperType()
  {
    return (EReference)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInPort()
  {
    return inPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutPort()
  {
    return outPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepModelFactory getDepModelFactory()
  {
    return (DepModelFactory)getEFactoryInstance();
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
    depModelEClass = createEClass(DEP_MODEL);
    createEReference(depModelEClass, DEP_MODEL__DEPMODELS);

    abstractModelDecEClass = createEClass(ABSTRACT_MODEL_DEC);

    portTypeEClass = createEClass(PORT_TYPE);
    createEAttribute(portTypeEClass, PORT_TYPE__NAME);
    createEReference(portTypeEClass, PORT_TYPE__EMODES);

    errorModesEClass = createEClass(ERROR_MODES);
    createEAttribute(errorModesEClass, ERROR_MODES__NAME);

    errorModelEClass = createEClass(ERROR_MODEL);
    createEAttribute(errorModelEClass, ERROR_MODEL__NAME);
    createEReference(errorModelEClass, ERROR_MODEL__EMODEL_ELEMENTS);

    eModelElementEClass = createEClass(EMODEL_ELEMENT);
    createEAttribute(eModelElementEClass, EMODEL_ELEMENT__NAME);

    stateDecEClass = createEClass(STATE_DEC);

    eventDecEClass = createEClass(EVENT_DEC);
    createEReference(eventDecEClass, EVENT_DEC__FEATURES);

    transitionFeatureDecEClass = createEClass(TRANSITION_FEATURE_DEC);

    transitionStateEClass = createEClass(TRANSITION_STATE);
    createEReference(transitionStateEClass, TRANSITION_STATE__SOURCE_STATE);
    createEReference(transitionStateEClass, TRANSITION_STATE__TARGET_STATE);

    triggerDecEClass = createEClass(TRIGGER_DEC);
    createEAttribute(triggerDecEClass, TRIGGER_DEC__NAME);
    createEReference(triggerDecEClass, TRIGGER_DEC__PORT_TYPE);
    createEReference(triggerDecEClass, TRIGGER_DEC__ERROR_MODE);

    actionDecEClass = createEClass(ACTION_DEC);
    createEAttribute(actionDecEClass, ACTION_DEC__NAME);
    createEReference(actionDecEClass, ACTION_DEC__PORT_TYPE);
    createEReference(actionDecEClass, ACTION_DEC__ERROR_MODE);

    componentModelEClass = createEClass(COMPONENT_MODEL);
    createEReference(componentModelEClass, COMPONENT_MODEL__ELEMENTS);

    componentModelDecEClass = createEClass(COMPONENT_MODEL_DEC);
    createEAttribute(componentModelDecEClass, COMPONENT_MODEL_DEC__NAME);

    systemConnDecEClass = createEClass(SYSTEM_CONN_DEC);
    createEReference(systemConnDecEClass, SYSTEM_CONN_DEC__SOURCE_SYSTEM);
    createEReference(systemConnDecEClass, SYSTEM_CONN_DEC__SOURCE_PORT);
    createEReference(systemConnDecEClass, SYSTEM_CONN_DEC__TARGET_SYSTEM);
    createEReference(systemConnDecEClass, SYSTEM_CONN_DEC__TARGET_PORT);

    systemDecEClass = createEClass(SYSTEM_DEC);
    createEReference(systemDecEClass, SYSTEM_DEC__SYS_FEATURES);

    abstractFeaturesEClass = createEClass(ABSTRACT_FEATURES);
    createEAttribute(abstractFeaturesEClass, ABSTRACT_FEATURES__NAME);

    systemPortDecEClass = createEClass(SYSTEM_PORT_DEC);

    systemPortInEClass = createEClass(SYSTEM_PORT_IN);
    createEReference(systemPortInEClass, SYSTEM_PORT_IN__IN_COMP);
    createEReference(systemPortInEClass, SYSTEM_PORT_IN__IN_PORT);

    systemPortOutEClass = createEClass(SYSTEM_PORT_OUT);
    createEReference(systemPortOutEClass, SYSTEM_PORT_OUT__OUT_COMP);
    createEReference(systemPortOutEClass, SYSTEM_PORT_OUT__OUT_PORT);

    compConnDecEClass = createEClass(COMP_CONN_DEC);
    createEReference(compConnDecEClass, COMP_CONN_DEC__SOURCE_COMP);
    createEReference(compConnDecEClass, COMP_CONN_DEC__SOURCE_PORT);
    createEReference(compConnDecEClass, COMP_CONN_DEC__TARGET_COMP);
    createEReference(compConnDecEClass, COMP_CONN_DEC__TARGET_PORT);

    componentImplEClass = createEClass(COMPONENT_IMPL);
    createEReference(componentImplEClass, COMPONENT_IMPL__SUPER_TYPE);

    componentTypeEClass = createEClass(COMPONENT_TYPE);
    createEReference(componentTypeEClass, COMPONENT_TYPE__COMP_FEATURES);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__NAME);
    createEReference(portEClass, PORT__SUPER_TYPE);

    inPortEClass = createEClass(IN_PORT);

    outPortEClass = createEClass(OUT_PORT);
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
    portTypeEClass.getESuperTypes().add(this.getabstractModelDec());
    errorModelEClass.getESuperTypes().add(this.getabstractModelDec());
    stateDecEClass.getESuperTypes().add(this.getEModelElement());
    eventDecEClass.getESuperTypes().add(this.getEModelElement());
    transitionStateEClass.getESuperTypes().add(this.getTransitionFeatureDec());
    triggerDecEClass.getESuperTypes().add(this.getTransitionFeatureDec());
    actionDecEClass.getESuperTypes().add(this.getTransitionFeatureDec());
    componentModelEClass.getESuperTypes().add(this.getabstractModelDec());
    systemConnDecEClass.getESuperTypes().add(this.getComponentModelDec());
    systemDecEClass.getESuperTypes().add(this.getComponentModelDec());
    systemPortDecEClass.getESuperTypes().add(this.getAbstractFeatures());
    systemPortInEClass.getESuperTypes().add(this.getSystemPortDec());
    systemPortOutEClass.getESuperTypes().add(this.getSystemPortDec());
    compConnDecEClass.getESuperTypes().add(this.getAbstractFeatures());
    componentImplEClass.getESuperTypes().add(this.getAbstractFeatures());
    componentTypeEClass.getESuperTypes().add(this.getAbstractFeatures());
    inPortEClass.getESuperTypes().add(this.getPort());
    outPortEClass.getESuperTypes().add(this.getPort());

    // Initialize classes and features; add operations and parameters
    initEClass(depModelEClass, DepModel.class, "DepModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDepModel_Depmodels(), this.getabstractModelDec(), null, "depmodels", null, 0, -1, DepModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractModelDecEClass, abstractModelDec.class, "abstractModelDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPortType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPortType_EModes(), this.geterrorModes(), null, "eModes", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(errorModesEClass, errorModes.class, "errorModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(geterrorModes_Name(), ecorePackage.getEString(), "name", null, 0, 1, errorModes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(errorModelEClass, ErrorModel.class, "ErrorModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getErrorModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ErrorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getErrorModel_EmodelElements(), this.getEModelElement(), null, "emodelElements", null, 0, -1, ErrorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eModelElementEClass, EModelElement.class, "EModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDecEClass, StateDec.class, "StateDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventDecEClass, EventDec.class, "EventDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventDec_Features(), this.getTransitionFeatureDec(), null, "Features", null, 0, -1, EventDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionFeatureDecEClass, TransitionFeatureDec.class, "TransitionFeatureDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionStateEClass, TransitionState.class, "TransitionState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionState_SourceState(), this.getStateDec(), null, "sourceState", null, 0, 1, TransitionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionState_TargetState(), this.getStateDec(), null, "targetState", null, 0, 1, TransitionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerDecEClass, TriggerDec.class, "TriggerDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTriggerDec_Name(), ecorePackage.getEString(), "name", null, 0, 1, TriggerDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTriggerDec_PortType(), this.getPort(), null, "portType", null, 0, 1, TriggerDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTriggerDec_ErrorMode(), this.geterrorModes(), null, "errorMode", null, 0, 1, TriggerDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionDecEClass, ActionDec.class, "ActionDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionDec_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionDec_PortType(), this.getPort(), null, "portType", null, 0, 1, ActionDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionDec_ErrorMode(), this.geterrorModes(), null, "errorMode", null, 0, 1, ActionDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentModelEClass, ComponentModel.class, "ComponentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentModel_Elements(), this.getComponentModelDec(), null, "elements", null, 0, -1, ComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentModelDecEClass, ComponentModelDec.class, "ComponentModelDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentModelDec_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentModelDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemConnDecEClass, SystemConnDec.class, "SystemConnDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemConnDec_SourceSystem(), this.getSystemDec(), null, "sourceSystem", null, 0, 1, SystemConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConnDec_SourcePort(), this.getSystemPortDec(), null, "sourcePort", null, 0, 1, SystemConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConnDec_TargetSystem(), this.getSystemDec(), null, "targetSystem", null, 0, 1, SystemConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConnDec_TargetPort(), this.getSystemPortDec(), null, "targetPort", null, 0, 1, SystemConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemDecEClass, SystemDec.class, "SystemDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemDec_SysFeatures(), this.getAbstractFeatures(), null, "sysFeatures", null, 0, -1, SystemDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractFeaturesEClass, AbstractFeatures.class, "AbstractFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractFeatures_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemPortDecEClass, SystemPortDec.class, "SystemPortDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemPortInEClass, SystemPortIn.class, "SystemPortIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemPortIn_InComp(), this.getComponentImpl(), null, "inComp", null, 0, 1, SystemPortIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemPortIn_InPort(), this.getInPort(), null, "inPort", null, 0, 1, SystemPortIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemPortOutEClass, SystemPortOut.class, "SystemPortOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemPortOut_OutComp(), this.getComponentImpl(), null, "outComp", null, 0, 1, SystemPortOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemPortOut_OutPort(), this.getOutPort(), null, "outPort", null, 0, 1, SystemPortOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compConnDecEClass, CompConnDec.class, "CompConnDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompConnDec_SourceComp(), this.getComponentImpl(), null, "sourceComp", null, 0, 1, CompConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompConnDec_SourcePort(), this.getOutPort(), null, "sourcePort", null, 0, 1, CompConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompConnDec_TargetComp(), this.getComponentImpl(), null, "targetComp", null, 0, 1, CompConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompConnDec_TargetPort(), this.getInPort(), null, "targetPort", null, 0, 1, CompConnDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentImplEClass, ComponentImpl.class, "ComponentImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentImpl_SuperType(), this.getComponentType(), null, "superType", null, 0, 1, ComponentImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentType_CompFeatures(), this.getPort(), null, "compFeatures", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPort_SuperType(), this.getPortType(), null, "superType", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inPortEClass, InPort.class, "InPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outPortEClass, OutPort.class, "OutPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //DepModelPackageImpl