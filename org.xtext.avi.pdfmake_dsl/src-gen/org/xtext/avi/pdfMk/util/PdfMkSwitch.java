/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.avi.pdfMk.*;

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
 * @see org.xtext.avi.pdfMk.PdfMkPackage
 * @generated
 */
public class PdfMkSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdfMkPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfMkSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PdfMkPackage.eINSTANCE;
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
      case PdfMkPackage.DOC_DEFINITION:
      {
        DocDefinition docDefinition = (DocDefinition)theEObject;
        T result = caseDocDefinition(docDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.STRING_OBJECT:
      {
        StringObject stringObject = (StringObject)theEObject;
        T result = caseStringObject(stringObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.TYPE_FACE_DEFINITION:
      {
        TypeFaceDefinition typeFaceDefinition = (TypeFaceDefinition)theEObject;
        T result = caseTypeFaceDefinition(typeFaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.TEXT_STYLE_DEFINITION:
      {
        TextStyleDefinition textStyleDefinition = (TextStyleDefinition)theEObject;
        T result = caseTextStyleDefinition(textStyleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.ITALICS_DEFINITION:
      {
        ItalicsDefinition italicsDefinition = (ItalicsDefinition)theEObject;
        T result = caseItalicsDefinition(italicsDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.FONT_SIZE_DEFINITION:
      {
        FontSizeDefinition fontSizeDefinition = (FontSizeDefinition)theEObject;
        T result = caseFontSizeDefinition(fontSizeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.STYLE_DEFINITION:
      {
        StyleDefinition styleDefinition = (StyleDefinition)theEObject;
        T result = caseStyleDefinition(styleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.WIDTH_DEFINITION:
      {
        WidthDefinition widthDefinition = (WidthDefinition)theEObject;
        T result = caseWidthDefinition(widthDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.COLUMN_GAP_DEFINTION:
      {
        ColumnGapDefintion columnGapDefintion = (ColumnGapDefintion)theEObject;
        T result = caseColumnGapDefintion(columnGapDefintion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.COLUMN_DEFINITION:
      {
        ColumnDefinition columnDefinition = (ColumnDefinition)theEObject;
        T result = caseColumnDefinition(columnDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.MARGIN_DEFINITION:
      {
        MarginDefinition marginDefinition = (MarginDefinition)theEObject;
        T result = caseMarginDefinition(marginDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_DEFINTION:
      {
        ImageDefintion imageDefintion = (ImageDefintion)theEObject;
        T result = caseImageDefintion(imageDefintion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_WIDTH_DEFINTION:
      {
        ImageWidthDefintion imageWidthDefintion = (ImageWidthDefintion)theEObject;
        T result = caseImageWidthDefintion(imageWidthDefintion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_HEIGHT_DEFINTION:
      {
        ImageHeightDefintion imageHeightDefintion = (ImageHeightDefintion)theEObject;
        T result = caseImageHeightDefintion(imageHeightDefintion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_PAGE_BREAK_DEFINITION:
      {
        ImagePageBreakDefinition imagePageBreakDefinition = (ImagePageBreakDefinition)theEObject;
        T result = caseImagePageBreakDefinition(imagePageBreakDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_FIT_DEFINITION:
      {
        ImageFitDefinition imageFitDefinition = (ImageFitDefinition)theEObject;
        T result = caseImageFitDefinition(imageFitDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_OPACITY_DEFINITION:
      {
        ImageOpacityDefinition imageOpacityDefinition = (ImageOpacityDefinition)theEObject;
        T result = caseImageOpacityDefinition(imageOpacityDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.TEXT_OBJECT:
      {
        TextObject textObject = (TextObject)theEObject;
        T result = caseTextObject(textObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.COLUMN_TEXT_OBJECT:
      {
        ColumnTextObject columnTextObject = (ColumnTextObject)theEObject;
        T result = caseColumnTextObject(columnTextObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.STYLE_OBJECT:
      {
        StyleObject styleObject = (StyleObject)theEObject;
        T result = caseStyleObject(styleObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.STYLE_OBJECTS:
      {
        StyleObjects styleObjects = (StyleObjects)theEObject;
        T result = caseStyleObjects(styleObjects);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.INNER_COLUMN_OBJECT:
      {
        InnerColumnObject innerColumnObject = (InnerColumnObject)theEObject;
        T result = caseInnerColumnObject(innerColumnObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.COLUMN_OBJECT:
      {
        ColumnObject columnObject = (ColumnObject)theEObject;
        T result = caseColumnObject(columnObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.IMAGE_OBJECT:
      {
        ImageObject imageObject = (ImageObject)theEObject;
        T result = caseImageObject(imageObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.CONTENT_OBJECT:
      {
        ContentObject contentObject = (ContentObject)theEObject;
        T result = caseContentObject(contentObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.CONTENT_OBJECTS:
      {
        ContentObjects contentObjects = (ContentObjects)theEObject;
        T result = caseContentObjects(contentObjects);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.STYLES:
      {
        Styles styles = (Styles)theEObject;
        T result = caseStyles(styles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdfMkPackage.CONTENT:
      {
        Content content = (Content)theEObject;
        T result = caseContent(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doc Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doc Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocDefinition(DocDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringObject(StringObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Face Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Face Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFaceDefinition(TypeFaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Style Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Style Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextStyleDefinition(TextStyleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italics Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italics Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalicsDefinition(ItalicsDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Size Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Size Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontSizeDefinition(FontSizeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleDefinition(StyleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Width Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Width Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidthDefinition(WidthDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Gap Defintion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Gap Defintion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnGapDefintion(ColumnGapDefintion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnDefinition(ColumnDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Margin Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Margin Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarginDefinition(MarginDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Defintion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Defintion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageDefintion(ImageDefintion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Width Defintion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Width Defintion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageWidthDefintion(ImageWidthDefintion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Height Defintion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Height Defintion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageHeightDefintion(ImageHeightDefintion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Page Break Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Page Break Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImagePageBreakDefinition(ImagePageBreakDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Fit Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Fit Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageFitDefinition(ImageFitDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Opacity Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Opacity Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageOpacityDefinition(ImageOpacityDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextObject(TextObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Text Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Text Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnTextObject(ColumnTextObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleObject(StyleObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Objects</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Objects</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleObjects(StyleObjects object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inner Column Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inner Column Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInnerColumnObject(InnerColumnObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnObject(ColumnObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageObject(ImageObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentObject(ContentObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Objects</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Objects</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentObjects(ContentObjects object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Styles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Styles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyles(Styles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContent(Content object)
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

} //PdfMkSwitch
