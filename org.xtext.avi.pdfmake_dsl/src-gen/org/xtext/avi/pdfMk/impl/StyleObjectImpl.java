/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.avi.pdfMk.PdfMkPackage;
import org.xtext.avi.pdfMk.StyleObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.impl.StyleObjectImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.impl.StyleObjectImpl#isFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.impl.StyleObjectImpl#isTypeFace <em>Type Face</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.impl.StyleObjectImpl#isAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.impl.StyleObjectImpl#isItalics <em>Italics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleObjectImpl extends MinimalEObjectImpl.Container implements StyleObject
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isFontSize() <em>Font Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFontSize()
   * @generated
   * @ordered
   */
  protected static final boolean FONT_SIZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFontSize() <em>Font Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFontSize()
   * @generated
   * @ordered
   */
  protected boolean fontSize = FONT_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isTypeFace() <em>Type Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeFace()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_FACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeFace() <em>Type Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeFace()
   * @generated
   * @ordered
   */
  protected boolean typeFace = TYPE_FACE_EDEFAULT;

  /**
   * The default value of the '{@link #isAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlignment()
   * @generated
   * @ordered
   */
  protected static final boolean ALIGNMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlignment()
   * @generated
   * @ordered
   */
  protected boolean alignment = ALIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #isItalics() <em>Italics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItalics()
   * @generated
   * @ordered
   */
  protected static final boolean ITALICS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isItalics() <em>Italics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItalics()
   * @generated
   * @ordered
   */
  protected boolean italics = ITALICS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleObjectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PdfMkPackage.Literals.STYLE_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.STYLE_OBJECT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFontSize()
  {
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontSize(boolean newFontSize)
  {
    boolean oldFontSize = fontSize;
    fontSize = newFontSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.STYLE_OBJECT__FONT_SIZE, oldFontSize, fontSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTypeFace()
  {
    return typeFace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeFace(boolean newTypeFace)
  {
    boolean oldTypeFace = typeFace;
    typeFace = newTypeFace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.STYLE_OBJECT__TYPE_FACE, oldTypeFace, typeFace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAlignment()
  {
    return alignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment(boolean newAlignment)
  {
    boolean oldAlignment = alignment;
    alignment = newAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.STYLE_OBJECT__ALIGNMENT, oldAlignment, alignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isItalics()
  {
    return italics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItalics(boolean newItalics)
  {
    boolean oldItalics = italics;
    italics = newItalics;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.STYLE_OBJECT__ITALICS, oldItalics, italics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PdfMkPackage.STYLE_OBJECT__VALUE:
        return getValue();
      case PdfMkPackage.STYLE_OBJECT__FONT_SIZE:
        return isFontSize();
      case PdfMkPackage.STYLE_OBJECT__TYPE_FACE:
        return isTypeFace();
      case PdfMkPackage.STYLE_OBJECT__ALIGNMENT:
        return isAlignment();
      case PdfMkPackage.STYLE_OBJECT__ITALICS:
        return isItalics();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdfMkPackage.STYLE_OBJECT__VALUE:
        setValue((String)newValue);
        return;
      case PdfMkPackage.STYLE_OBJECT__FONT_SIZE:
        setFontSize((Boolean)newValue);
        return;
      case PdfMkPackage.STYLE_OBJECT__TYPE_FACE:
        setTypeFace((Boolean)newValue);
        return;
      case PdfMkPackage.STYLE_OBJECT__ALIGNMENT:
        setAlignment((Boolean)newValue);
        return;
      case PdfMkPackage.STYLE_OBJECT__ITALICS:
        setItalics((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PdfMkPackage.STYLE_OBJECT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case PdfMkPackage.STYLE_OBJECT__FONT_SIZE:
        setFontSize(FONT_SIZE_EDEFAULT);
        return;
      case PdfMkPackage.STYLE_OBJECT__TYPE_FACE:
        setTypeFace(TYPE_FACE_EDEFAULT);
        return;
      case PdfMkPackage.STYLE_OBJECT__ALIGNMENT:
        setAlignment(ALIGNMENT_EDEFAULT);
        return;
      case PdfMkPackage.STYLE_OBJECT__ITALICS:
        setItalics(ITALICS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PdfMkPackage.STYLE_OBJECT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case PdfMkPackage.STYLE_OBJECT__FONT_SIZE:
        return fontSize != FONT_SIZE_EDEFAULT;
      case PdfMkPackage.STYLE_OBJECT__TYPE_FACE:
        return typeFace != TYPE_FACE_EDEFAULT;
      case PdfMkPackage.STYLE_OBJECT__ALIGNMENT:
        return alignment != ALIGNMENT_EDEFAULT;
      case PdfMkPackage.STYLE_OBJECT__ITALICS:
        return italics != ITALICS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", fontSize: ");
    result.append(fontSize);
    result.append(", typeFace: ");
    result.append(typeFace);
    result.append(", alignment: ");
    result.append(alignment);
    result.append(", italics: ");
    result.append(italics);
    result.append(')');
    return result.toString();
  }

} //StyleObjectImpl
