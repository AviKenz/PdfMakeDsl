/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.ColumnObject#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.ColumnObject#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.xtext.avi.pdfMk.PdfMkPackage#getColumnObject()
 * @model
 * @generated
 */
public interface ColumnObject extends EObject
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
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getColumnObject_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.ColumnObject#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.avi.pdfMk.ColumnObjectMembersWrapper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getColumnObject_Members()
   * @model containment="true"
   * @generated
   */
  EList<ColumnObjectMembersWrapper> getMembers();

} // ColumnObject
