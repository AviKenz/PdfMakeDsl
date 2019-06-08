/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.TableObject#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.TableObject#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.TableObject#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableObject()
 * @model
 * @generated
 */
public interface TableObject extends EObject
{
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
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableObject_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.TableObject#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(TextStyleDefinition)
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableObject_Style()
   * @model containment="true"
   * @generated
   */
  TextStyleDefinition getStyle();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.TableObject#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(TextStyleDefinition value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(TableDefinition)
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getTableObject_Table()
   * @model containment="true"
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.TableObject#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

} // TableObject