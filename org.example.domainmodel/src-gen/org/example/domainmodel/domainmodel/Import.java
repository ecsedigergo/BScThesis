/**
 * generated by Xtext 2.9.2
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Import#getImportedNameSpace <em>Imported Name Space</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Imported Name Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Name Space</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Name Space</em>' attribute.
   * @see #setImportedNameSpace(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getImport_ImportedNameSpace()
   * @model
   * @generated
   */
  String getImportedNameSpace();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Import#getImportedNameSpace <em>Imported Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Name Space</em>' attribute.
   * @see #getImportedNameSpace()
   * @generated
   */
  void setImportedNameSpace(String value);

} // Import
