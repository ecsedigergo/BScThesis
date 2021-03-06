/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.componentModel.util;

import hu.bme.mit.componentModel.*;

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
 * @see hu.bme.mit.componentModel.ComponentModelPackage
 * @generated
 */
public class ComponentModelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ComponentModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ComponentModelPackage.eINSTANCE;
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
      case ComponentModelPackage.COMPONENT_MODEL:
      {
        ComponentModel componentModel = (ComponentModel)theEObject;
        T result = caseComponentModel(componentModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.SYSTEM_CONN_DEC:
      {
        SystemConnDec systemConnDec = (SystemConnDec)theEObject;
        T result = caseSystemConnDec(systemConnDec);
        if (result == null) result = caseAbstractElement(systemConnDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.SYSTEM_DEC:
      {
        SystemDec systemDec = (SystemDec)theEObject;
        T result = caseSystemDec(systemDec);
        if (result == null) result = caseAbstractElement(systemDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.ABSTRACT_FEATURES:
      {
        AbstractFeatures abstractFeatures = (AbstractFeatures)theEObject;
        T result = caseAbstractFeatures(abstractFeatures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.SYSTEM_PORT_DEC:
      {
        SystemPortDec systemPortDec = (SystemPortDec)theEObject;
        T result = caseSystemPortDec(systemPortDec);
        if (result == null) result = caseAbstractFeatures(systemPortDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.SYSTEM_PORT_IN:
      {
        SystemPortIn systemPortIn = (SystemPortIn)theEObject;
        T result = caseSystemPortIn(systemPortIn);
        if (result == null) result = caseSystemPortDec(systemPortIn);
        if (result == null) result = caseAbstractFeatures(systemPortIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.SYSTEM_PORT_OUT:
      {
        SystemPortOut systemPortOut = (SystemPortOut)theEObject;
        T result = caseSystemPortOut(systemPortOut);
        if (result == null) result = caseSystemPortDec(systemPortOut);
        if (result == null) result = caseAbstractFeatures(systemPortOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.COMP_CONN_DEC:
      {
        CompConnDec compConnDec = (CompConnDec)theEObject;
        T result = caseCompConnDec(compConnDec);
        if (result == null) result = caseAbstractFeatures(compConnDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.COMPONENT_IMPL:
      {
        ComponentImpl componentImpl = (ComponentImpl)theEObject;
        T result = caseComponentImpl(componentImpl);
        if (result == null) result = caseAbstractFeatures(componentImpl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.COMPONENT_TYPE:
      {
        ComponentType componentType = (ComponentType)theEObject;
        T result = caseComponentType(componentType);
        if (result == null) result = caseAbstractFeatures(componentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.COMPONENT_FEATURE:
      {
        ComponentFeature componentFeature = (ComponentFeature)theEObject;
        T result = caseComponentFeature(componentFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.IN_PORT:
      {
        InPort inPort = (InPort)theEObject;
        T result = caseInPort(inPort);
        if (result == null) result = casePort(inPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.OUT_PORT:
      {
        OutPort outPort = (OutPort)theEObject;
        T result = caseOutPort(outPort);
        if (result == null) result = casePort(outPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.PORT_TYPE:
      {
        PortType portType = (PortType)theEObject;
        T result = casePortType(portType);
        if (result == null) result = caseAbstractElement(portType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComponentModelPackage.ERROR_MODES:
      {
        errorModes errorModes = (errorModes)theEObject;
        T result = caseerrorModes(errorModes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentModel(ComponentModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Conn Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Conn Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemConnDec(SystemConnDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemDec(SystemDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractFeatures(AbstractFeatures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Port Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Port Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemPortDec(SystemPortDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Port In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Port In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemPortIn(SystemPortIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Port Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Port Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemPortOut(SystemPortOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comp Conn Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comp Conn Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompConnDec(CompConnDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Impl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Impl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentImpl(ComponentImpl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentType(ComponentType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentFeature(ComponentFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInPort(InPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutPort(OutPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePortType(PortType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>error Modes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>error Modes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseerrorModes(errorModes object)
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

} //ComponentModelSwitch
