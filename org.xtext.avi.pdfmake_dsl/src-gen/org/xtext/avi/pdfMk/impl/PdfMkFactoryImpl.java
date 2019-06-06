/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.avi.pdfMk.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdfMkFactoryImpl extends EFactoryImpl implements PdfMkFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PdfMkFactory init()
  {
    try
    {
      PdfMkFactory thePdfMkFactory = (PdfMkFactory)EPackage.Registry.INSTANCE.getEFactory(PdfMkPackage.eNS_URI);
      if (thePdfMkFactory != null)
      {
        return thePdfMkFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PdfMkFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfMkFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PdfMkPackage.DOC_DEFINITION: return createDocDefinition();
      case PdfMkPackage.STRING_OBJECT: return createStringObject();
      case PdfMkPackage.TYPE_FACE_DEFINITION: return createTypeFaceDefinition();
      case PdfMkPackage.TEXT_STYLE_DEFINITION: return createTextStyleDefinition();
      case PdfMkPackage.ITALICS_DEFINITION: return createItalicsDefinition();
      case PdfMkPackage.FONT_SIZE_DEFINITION: return createFontSizeDefinition();
      case PdfMkPackage.STYLE_DEFINITION: return createStyleDefinition();
      case PdfMkPackage.WIDTH_DEFINITION: return createWidthDefinition();
      case PdfMkPackage.COLUMN_GAP_DEFINTION: return createColumnGapDefintion();
      case PdfMkPackage.COLUMN_DEFINITION: return createColumnDefinition();
      case PdfMkPackage.INNER_COLUMN_OBJECT: return createInnerColumnObject();
      case PdfMkPackage.COLUMN_OBJECT: return createColumnObject();
      case PdfMkPackage.TEXT_OBJECT: return createTextObject();
      case PdfMkPackage.COLUMN_TEXT_OBJECT: return createColumnTextObject();
      case PdfMkPackage.STYLE_OBJECT: return createStyleObject();
      case PdfMkPackage.STYLE_OBJECTS: return createStyleObjects();
      case PdfMkPackage.CONTENT_OBJECT: return createContentObject();
      case PdfMkPackage.CONTENT_OBJECTS: return createContentObjects();
      case PdfMkPackage.STYLES: return createStyles();
      case PdfMkPackage.CONTENT: return createContent();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocDefinition createDocDefinition()
  {
    DocDefinitionImpl docDefinition = new DocDefinitionImpl();
    return docDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringObject createStringObject()
  {
    StringObjectImpl stringObject = new StringObjectImpl();
    return stringObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFaceDefinition createTypeFaceDefinition()
  {
    TypeFaceDefinitionImpl typeFaceDefinition = new TypeFaceDefinitionImpl();
    return typeFaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStyleDefinition createTextStyleDefinition()
  {
    TextStyleDefinitionImpl textStyleDefinition = new TextStyleDefinitionImpl();
    return textStyleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicsDefinition createItalicsDefinition()
  {
    ItalicsDefinitionImpl italicsDefinition = new ItalicsDefinitionImpl();
    return italicsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontSizeDefinition createFontSizeDefinition()
  {
    FontSizeDefinitionImpl fontSizeDefinition = new FontSizeDefinitionImpl();
    return fontSizeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleDefinition createStyleDefinition()
  {
    StyleDefinitionImpl styleDefinition = new StyleDefinitionImpl();
    return styleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WidthDefinition createWidthDefinition()
  {
    WidthDefinitionImpl widthDefinition = new WidthDefinitionImpl();
    return widthDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnGapDefintion createColumnGapDefintion()
  {
    ColumnGapDefintionImpl columnGapDefintion = new ColumnGapDefintionImpl();
    return columnGapDefintion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDefinition createColumnDefinition()
  {
    ColumnDefinitionImpl columnDefinition = new ColumnDefinitionImpl();
    return columnDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerColumnObject createInnerColumnObject()
  {
    InnerColumnObjectImpl innerColumnObject = new InnerColumnObjectImpl();
    return innerColumnObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnObject createColumnObject()
  {
    ColumnObjectImpl columnObject = new ColumnObjectImpl();
    return columnObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextObject createTextObject()
  {
    TextObjectImpl textObject = new TextObjectImpl();
    return textObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnTextObject createColumnTextObject()
  {
    ColumnTextObjectImpl columnTextObject = new ColumnTextObjectImpl();
    return columnTextObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleObject createStyleObject()
  {
    StyleObjectImpl styleObject = new StyleObjectImpl();
    return styleObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleObjects createStyleObjects()
  {
    StyleObjectsImpl styleObjects = new StyleObjectsImpl();
    return styleObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentObject createContentObject()
  {
    ContentObjectImpl contentObject = new ContentObjectImpl();
    return contentObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentObjects createContentObjects()
  {
    ContentObjectsImpl contentObjects = new ContentObjectsImpl();
    return contentObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Styles createStyles()
  {
    StylesImpl styles = new StylesImpl();
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfMkPackage getPdfMkPackage()
  {
    return (PdfMkPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PdfMkPackage getPackage()
  {
    return PdfMkPackage.eINSTANCE;
  }

} //PdfMkFactoryImpl
