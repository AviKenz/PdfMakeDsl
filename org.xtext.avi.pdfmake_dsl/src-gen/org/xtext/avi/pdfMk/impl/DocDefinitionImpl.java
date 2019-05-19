/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.avi.pdfMk.Content;
import org.xtext.avi.pdfMk.DocDefinition;
import org.xtext.avi.pdfMk.PdfMkPackage;
import org.xtext.avi.pdfMk.Styles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.avi.pdfMk.impl.DocDefinitionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.xtext.avi.pdfMk.impl.DocDefinitionImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocDefinitionImpl extends MinimalEObjectImpl.Container implements DocDefinition
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected Content content;

  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected Styles styles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocDefinitionImpl()
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
    return PdfMkPackage.Literals.DOC_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(Content newContent, NotificationChain msgs)
  {
    Content oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfMkPackage.DOC_DEFINITION__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(Content newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfMkPackage.DOC_DEFINITION__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfMkPackage.DOC_DEFINITION__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.DOC_DEFINITION__CONTENT, newContent, newContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Styles getStyles()
  {
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyles(Styles newStyles, NotificationChain msgs)
  {
    Styles oldStyles = styles;
    styles = newStyles;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdfMkPackage.DOC_DEFINITION__STYLES, oldStyles, newStyles);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyles(Styles newStyles)
  {
    if (newStyles != styles)
    {
      NotificationChain msgs = null;
      if (styles != null)
        msgs = ((InternalEObject)styles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdfMkPackage.DOC_DEFINITION__STYLES, null, msgs);
      if (newStyles != null)
        msgs = ((InternalEObject)newStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdfMkPackage.DOC_DEFINITION__STYLES, null, msgs);
      msgs = basicSetStyles(newStyles, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdfMkPackage.DOC_DEFINITION__STYLES, newStyles, newStyles));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PdfMkPackage.DOC_DEFINITION__CONTENT:
        return basicSetContent(null, msgs);
      case PdfMkPackage.DOC_DEFINITION__STYLES:
        return basicSetStyles(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PdfMkPackage.DOC_DEFINITION__CONTENT:
        return getContent();
      case PdfMkPackage.DOC_DEFINITION__STYLES:
        return getStyles();
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
      case PdfMkPackage.DOC_DEFINITION__CONTENT:
        setContent((Content)newValue);
        return;
      case PdfMkPackage.DOC_DEFINITION__STYLES:
        setStyles((Styles)newValue);
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
      case PdfMkPackage.DOC_DEFINITION__CONTENT:
        setContent((Content)null);
        return;
      case PdfMkPackage.DOC_DEFINITION__STYLES:
        setStyles((Styles)null);
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
      case PdfMkPackage.DOC_DEFINITION__CONTENT:
        return content != null;
      case PdfMkPackage.DOC_DEFINITION__STYLES:
        return styles != null;
    }
    return super.eIsSet(featureID);
  }

} //DocDefinitionImpl
