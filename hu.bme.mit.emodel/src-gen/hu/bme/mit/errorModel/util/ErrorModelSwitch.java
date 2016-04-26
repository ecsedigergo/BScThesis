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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.errorModel.ErrorModelPackage
 * @generated
 */
public class ErrorModelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ErrorModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ErrorModelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ErrorModelPackage.ERROR_MODEL:
      {
        ErrorModel errorModel = (ErrorModel)theEObject;
        T result = caseErrorModel(errorModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.ERROR:
      {
        hu.bme.mit.errorModel.Error error = (hu.bme.mit.errorModel.Error)theEObject;
        T result = caseError(error);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.EPROPAGATION_DEC:
      {
        EPropagationDec ePropagationDec = (EPropagationDec)theEObject;
        T result = caseEPropagationDec(ePropagationDec);
        if (result == null) result = caseError(ePropagationDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.EMODEL_DEC:
      {
        EModelDec eModelDec = (EModelDec)theEObject;
        T result = caseEModelDec(eModelDec);
        if (result == null) result = caseError(eModelDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.EMODEL_ELEMENT:
      {
        EModelElement eModelElement = (EModelElement)theEObject;
        T result = caseEModelElement(eModelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.OUTER_PROPAGATION:
      {
        OuterPropagation outerPropagation = (OuterPropagation)theEObject;
        T result = caseOuterPropagation(outerPropagation);
        if (result == null) result = caseEModelElement(outerPropagation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.IN_PROP_DEC:
      {
        InPropDec inPropDec = (InPropDec)theEObject;
        T result = caseInPropDec(inPropDec);
        if (result == null) result = caseOuterPropagation(inPropDec);
        if (result == null) result = caseEModelElement(inPropDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.OUT_PROP_DEC:
      {
        OutPropDec outPropDec = (OutPropDec)theEObject;
        T result = caseOutPropDec(outPropDec);
        if (result == null) result = caseOuterPropagation(outPropDec);
        if (result == null) result = caseEModelElement(outPropDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.STATE_DEC:
      {
        StateDec stateDec = (StateDec)theEObject;
        T result = caseStateDec(stateDec);
        if (result == null) result = caseEModelElement(stateDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.EVENT_DEC:
      {
        EventDec eventDec = (EventDec)theEObject;
        T result = caseEventDec(eventDec);
        if (result == null) result = caseEModelElement(eventDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.EVENT_FEATURE:
      {
        EventFeature eventFeature = (EventFeature)theEObject;
        T result = caseEventFeature(eventFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ErrorModelPackage.EVENT_STATE:
      {
        EventState eventState = (EventState)theEObject;
        T result = caseEventState(eventState);
        if (result == null) result = caseEventFeature(eventState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorModel(ErrorModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseError(hu.bme.mit.errorModel.Error object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPropagation Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPropagation Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPropagationDec(EPropagationDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EModel Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EModel Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEModelDec(EModelDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEModelElement(EModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outer Propagation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outer Propagation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOuterPropagation(OuterPropagation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Prop Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Prop Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInPropDec(InPropDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Prop Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Prop Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutPropDec(OutPropDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDec(StateDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventDec(EventDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventFeature(EventFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventState(EventState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ErrorModelSwitch