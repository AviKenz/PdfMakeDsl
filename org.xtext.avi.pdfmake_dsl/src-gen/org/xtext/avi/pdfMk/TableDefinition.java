/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.TableDefinition#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.TableDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.TableDefinition#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableDefinition()
 * @model
 * @generated
 */
public interface TableDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableDefinition_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.TableDefinition#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableDefinition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.TableDefinition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(TableBodyDefinition)
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableDefinition_Body()
   * @model containment="true"
   * @generated
   */
  TableBodyDefinition getBody();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.TableDefinition#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(TableBodyDefinition value);

} // TableDefinition
