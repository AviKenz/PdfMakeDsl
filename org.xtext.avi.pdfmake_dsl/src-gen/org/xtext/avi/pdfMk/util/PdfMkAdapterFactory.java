/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.pdfMk.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.avi.pdfMk.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.avi.pdfMk.PdfMkPackage
 * @generated
 */
public class PdfMkAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdfMkPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdfMkAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PdfMkPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PdfMkSwitch<Adapter> modelSwitch =
    new PdfMkSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocDefinition(DocDefinition object)
      {
        return createDocDefinitionAdapter();
      }
      @Override
      public Adapter caseStringObject(StringObject object)
      {
        return createStringObjectAdapter();
      }
      @Override
      public Adapter caseTypeFaceDefinition(TypeFaceDefinition object)
      {
        return createTypeFaceDefinitionAdapter();
      }
      @Override
      public Adapter caseTextStyleDefinition(TextStyleDefinition object)
      {
        return createTextStyleDefinitionAdapter();
      }
      @Override
      public Adapter caseTextDefinition(TextDefinition object)
      {
        return createTextDefinitionAdapter();
      }
      @Override
      public Adapter caseItalicsDefinition(ItalicsDefinition object)
      {
        return createItalicsDefinitionAdapter();
      }
      @Override
      public Adapter caseFontSizeDefinition(FontSizeDefinition object)
      {
        return createFontSizeDefinitionAdapter();
      }
      @Override
      public Adapter caseStyleDefinition(StyleDefinition object)
      {
        return createStyleDefinitionAdapter();
      }
      @Override
      public Adapter caseWidthDefinition(WidthDefinition object)
      {
        return createWidthDefinitionAdapter();
      }
      @Override
      public Adapter caseColumnGapDefintion(ColumnGapDefintion object)
      {
        return createColumnGapDefintionAdapter();
      }
      @Override
      public Adapter caseColumnDefinition(ColumnDefinition object)
      {
        return createColumnDefinitionAdapter();
      }
      @Override
      public Adapter caseMarginDefinition(MarginDefinition object)
      {
        return createMarginDefinitionAdapter();
      }
      @Override
      public Adapter caseImageDefintion(ImageDefintion object)
      {
        return createImageDefintionAdapter();
      }
      @Override
      public Adapter caseImageWidthDefintion(ImageWidthDefintion object)
      {
        return createImageWidthDefintionAdapter();
      }
      @Override
      public Adapter caseImageHeightDefintion(ImageHeightDefintion object)
      {
        return createImageHeightDefintionAdapter();
      }
      @Override
      public Adapter caseImagePageBreakDefinition(ImagePageBreakDefinition object)
      {
        return createImagePageBreakDefinitionAdapter();
      }
      @Override
      public Adapter caseImageFitDefinition(ImageFitDefinition object)
      {
        return createImageFitDefinitionAdapter();
      }
      @Override
      public Adapter caseImageOpacityDefinition(ImageOpacityDefinition object)
      {
        return createImageOpacityDefinitionAdapter();
      }
      @Override
      public Adapter caseListReversedDefinition(ListReversedDefinition object)
      {
        return createListReversedDefinitionAdapter();
      }
      @Override
      public Adapter caseListStartDefinition(ListStartDefinition object)
      {
        return createListStartDefinitionAdapter();
      }
      @Override
      public Adapter caseListCounterDefinition(ListCounterDefinition object)
      {
        return createListCounterDefinitionAdapter();
      }
      @Override
      public Adapter caseListTypeDefinition(ListTypeDefinition object)
      {
        return createListTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseListColorDefinition(ListColorDefinition object)
      {
        return createListColorDefinitionAdapter();
      }
      @Override
      public Adapter caseListMarkerColorDefinition(ListMarkerColorDefinition object)
      {
        return createListMarkerColorDefinitionAdapter();
      }
      @Override
      public Adapter caseTableCellItemElements(TableCellItemElements object)
      {
        return createTableCellItemElementsAdapter();
      }
      @Override
      public Adapter caseTableRowDefinition(TableRowDefinition object)
      {
        return createTableRowDefinitionAdapter();
      }
      @Override
      public Adapter caseTableBodyDefinition(TableBodyDefinition object)
      {
        return createTableBodyDefinitionAdapter();
      }
      @Override
      public Adapter caseTableDefinition(TableDefinition object)
      {
        return createTableDefinitionAdapter();
      }
      @Override
      public Adapter caseTextObjectMembersWrapper(TextObjectMembersWrapper object)
      {
        return createTextObjectMembersWrapperAdapter();
      }
      @Override
      public Adapter caseTextObject(TextObject object)
      {
        return createTextObjectAdapter();
      }
      @Override
      public Adapter caseColumnTextObject(ColumnTextObject object)
      {
        return createColumnTextObjectAdapter();
      }
      @Override
      public Adapter caseStyleObject(StyleObject object)
      {
        return createStyleObjectAdapter();
      }
      @Override
      public Adapter caseStyleObjects(StyleObjects object)
      {
        return createStyleObjectsAdapter();
      }
      @Override
      public Adapter caseInnerColumnObject(InnerColumnObject object)
      {
        return createInnerColumnObjectAdapter();
      }
      @Override
      public Adapter caseColumnObject(ColumnObject object)
      {
        return createColumnObjectAdapter();
      }
      @Override
      public Adapter caseImageObject(ImageObject object)
      {
        return createImageObjectAdapter();
      }
      @Override
      public Adapter caseListObjectPropertiesWrapper(ListObjectPropertiesWrapper object)
      {
        return createListObjectPropertiesWrapperAdapter();
      }
      @Override
      public Adapter caseListElements(ListElements object)
      {
        return createListElementsAdapter();
      }
      @Override
      public Adapter caseListObject(ListObject object)
      {
        return createListObjectAdapter();
      }
      @Override
      public Adapter caseTableObject(TableObject object)
      {
        return createTableObjectAdapter();
      }
      @Override
      public Adapter caseContentObject(ContentObject object)
      {
        return createContentObjectAdapter();
      }
      @Override
      public Adapter caseContentObjects(ContentObjects object)
      {
        return createContentObjectsAdapter();
      }
      @Override
      public Adapter caseStyles(Styles object)
      {
        return createStylesAdapter();
      }
      @Override
      public Adapter caseContent(Content object)
      {
        return createContentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.DocDefinition <em>Doc Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.DocDefinition
   * @generated
   */
  public Adapter createDocDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.StringObject <em>String Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.StringObject
   * @generated
   */
  public Adapter createStringObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TypeFaceDefinition <em>Type Face Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TypeFaceDefinition
   * @generated
   */
  public Adapter createTypeFaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TextStyleDefinition <em>Text Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TextStyleDefinition
   * @generated
   */
  public Adapter createTextStyleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TextDefinition <em>Text Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TextDefinition
   * @generated
   */
  public Adapter createTextDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ItalicsDefinition <em>Italics Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ItalicsDefinition
   * @generated
   */
  public Adapter createItalicsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.FontSizeDefinition <em>Font Size Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.FontSizeDefinition
   * @generated
   */
  public Adapter createFontSizeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.StyleDefinition <em>Style Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.StyleDefinition
   * @generated
   */
  public Adapter createStyleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.WidthDefinition <em>Width Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.WidthDefinition
   * @generated
   */
  public Adapter createWidthDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ColumnGapDefintion <em>Column Gap Defintion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ColumnGapDefintion
   * @generated
   */
  public Adapter createColumnGapDefintionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ColumnDefinition
   * @generated
   */
  public Adapter createColumnDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.MarginDefinition <em>Margin Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.MarginDefinition
   * @generated
   */
  public Adapter createMarginDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImageDefintion <em>Image Defintion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImageDefintion
   * @generated
   */
  public Adapter createImageDefintionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImageWidthDefintion <em>Image Width Defintion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImageWidthDefintion
   * @generated
   */
  public Adapter createImageWidthDefintionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImageHeightDefintion <em>Image Height Defintion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImageHeightDefintion
   * @generated
   */
  public Adapter createImageHeightDefintionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImagePageBreakDefinition <em>Image Page Break Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImagePageBreakDefinition
   * @generated
   */
  public Adapter createImagePageBreakDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImageFitDefinition <em>Image Fit Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImageFitDefinition
   * @generated
   */
  public Adapter createImageFitDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImageOpacityDefinition <em>Image Opacity Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImageOpacityDefinition
   * @generated
   */
  public Adapter createImageOpacityDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListReversedDefinition <em>List Reversed Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListReversedDefinition
   * @generated
   */
  public Adapter createListReversedDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListStartDefinition <em>List Start Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListStartDefinition
   * @generated
   */
  public Adapter createListStartDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListCounterDefinition <em>List Counter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListCounterDefinition
   * @generated
   */
  public Adapter createListCounterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListTypeDefinition <em>List Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListTypeDefinition
   * @generated
   */
  public Adapter createListTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListColorDefinition <em>List Color Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListColorDefinition
   * @generated
   */
  public Adapter createListColorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListMarkerColorDefinition <em>List Marker Color Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListMarkerColorDefinition
   * @generated
   */
  public Adapter createListMarkerColorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TableCellItemElements <em>Table Cell Item Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TableCellItemElements
   * @generated
   */
  public Adapter createTableCellItemElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TableRowDefinition <em>Table Row Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TableRowDefinition
   * @generated
   */
  public Adapter createTableRowDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TableBodyDefinition <em>Table Body Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TableBodyDefinition
   * @generated
   */
  public Adapter createTableBodyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TableDefinition
   * @generated
   */
  public Adapter createTableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TextObjectMembersWrapper <em>Text Object Members Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TextObjectMembersWrapper
   * @generated
   */
  public Adapter createTextObjectMembersWrapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TextObject <em>Text Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TextObject
   * @generated
   */
  public Adapter createTextObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ColumnTextObject <em>Column Text Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ColumnTextObject
   * @generated
   */
  public Adapter createColumnTextObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.StyleObject <em>Style Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.StyleObject
   * @generated
   */
  public Adapter createStyleObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.StyleObjects <em>Style Objects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.StyleObjects
   * @generated
   */
  public Adapter createStyleObjectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.InnerColumnObject <em>Inner Column Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.InnerColumnObject
   * @generated
   */
  public Adapter createInnerColumnObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ColumnObject <em>Column Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ColumnObject
   * @generated
   */
  public Adapter createColumnObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ImageObject <em>Image Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ImageObject
   * @generated
   */
  public Adapter createImageObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListObjectPropertiesWrapper <em>List Object Properties Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListObjectPropertiesWrapper
   * @generated
   */
  public Adapter createListObjectPropertiesWrapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListElements <em>List Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListElements
   * @generated
   */
  public Adapter createListElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ListObject <em>List Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ListObject
   * @generated
   */
  public Adapter createListObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.TableObject <em>Table Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.TableObject
   * @generated
   */
  public Adapter createTableObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ContentObject <em>Content Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ContentObject
   * @generated
   */
  public Adapter createContentObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.ContentObjects <em>Content Objects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.ContentObjects
   * @generated
   */
  public Adapter createContentObjectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.Styles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.Styles
   * @generated
   */
  public Adapter createStylesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.avi.pdfMk.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.avi.pdfMk.Content
   * @generated
   */
  public Adapter createContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PdfMkAdapterFactory
