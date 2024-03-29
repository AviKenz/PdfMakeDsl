/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Size Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.FontSizeDefinition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.avi.pdfMk.PdfMkPackage#getFontSizeDefinition()
 * @model
 * @generated
 */
public interface FontSizeDefinition extends TextObjectMembersWrapper, StyleObjectMembersWrapper
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
   * @see #setValue(int)
   * @see org.xtext.avi.pdfMk.PdfMkPackage#getFontSizeDefinition_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.avi.pdfMk.FontSizeDefinition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // FontSizeDefinition
