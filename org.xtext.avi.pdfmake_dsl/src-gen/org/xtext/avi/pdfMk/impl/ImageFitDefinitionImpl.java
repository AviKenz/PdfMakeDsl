/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.avi.pdfMk.ImageFitDefinition;
import org.xtext.avi.pdfMk.PdfMkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Fit Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.impl.ImageFitDefinitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.impl.ImageFitDefinitionImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageFitDefinitionImpl extends ImageObjectMembersWrapperImpl implements ImageFitDefinition
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
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<Integer> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageFitDefinitionImpl()
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
    return PdfMkPackage.Literals.IMAGE_FIT_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.IMAGE_FIT_DEFINITION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<Integer>(Integer.class, this, PdfMkPackage.IMAGE_FIT_DEFINITION__VALUES);
    }
    return values;
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
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUE:
        return getValue();
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUES:
        return getValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUE:
        setValue((String)newValue);
        return;
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends Integer>)newValue);
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
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUES:
        getValues().clear();
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
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case PdfMkPackage.IMAGE_FIT_DEFINITION__VALUES:
        return values != null && !values.isEmpty();
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
    result.append(", values: ");
    result.append(values);
    result.append(')');
    return result.toString();
  }

} //ImageFitDefinitionImpl
