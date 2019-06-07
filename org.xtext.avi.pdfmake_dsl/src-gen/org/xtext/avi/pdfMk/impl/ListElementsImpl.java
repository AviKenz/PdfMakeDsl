/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.avi.pdfMk.ListElements;
import org.xtext.avi.pdfMk.PdfMkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.impl.ListElementsImpl#getElValues <em>El Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListElementsImpl extends MinimalEObjectImpl.Container implements ListElements
{
  /**
   * The default value of the '{@link #getElValues() <em>El Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElValues()
   * @generated
   * @ordered
   */
  protected static final String EL_VALUES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElValues() <em>El Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElValues()
   * @generated
   * @ordered
   */
  protected String elValues = EL_VALUES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListElementsImpl()
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
    return PdfMkPackage.Literals.LIST_ELEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElValues()
  {
    return elValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElValues(String newElValues)
  {
    String oldElValues = elValues;
    elValues = newElValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.LIST_ELEMENTS__EL_VALUES, oldElValues, elValues));
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
      case PdfMkPackage.LIST_ELEMENTS__EL_VALUES:
        return getElValues();
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
      case PdfMkPackage.LIST_ELEMENTS__EL_VALUES:
        setElValues((String)newValue);
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
      case PdfMkPackage.LIST_ELEMENTS__EL_VALUES:
        setElValues(EL_VALUES_EDEFAULT);
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
      case PdfMkPackage.LIST_ELEMENTS__EL_VALUES:
        return EL_VALUES_EDEFAULT == null ? elValues != null : !EL_VALUES_EDEFAULT.equals(elValues);
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
    result.append(" (elValues: ");
    result.append(elValues);
    result.append(')');
    return result.toString();
  }

} //ListElementsImpl