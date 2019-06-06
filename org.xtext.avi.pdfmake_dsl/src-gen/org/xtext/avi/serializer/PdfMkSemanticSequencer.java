/*
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.avi.pdfMk.ColumnDefinition;
import org.xtext.avi.pdfMk.ColumnGapDefintion;
import org.xtext.avi.pdfMk.ColumnObject;
import org.xtext.avi.pdfMk.ColumnTextObject;
import org.xtext.avi.pdfMk.Content;
import org.xtext.avi.pdfMk.ContentObject;
import org.xtext.avi.pdfMk.ContentObjects;
import org.xtext.avi.pdfMk.DocDefinition;
import org.xtext.avi.pdfMk.FontSizeDefinition;
import org.xtext.avi.pdfMk.ImageDefintion;
import org.xtext.avi.pdfMk.ImageFitDefinition;
import org.xtext.avi.pdfMk.ImageHeightDefintion;
import org.xtext.avi.pdfMk.ImageObject;
import org.xtext.avi.pdfMk.ImageOpacityDefinition;
import org.xtext.avi.pdfMk.ImagePageBreakDefinition;
import org.xtext.avi.pdfMk.ImageWidthDefintion;
import org.xtext.avi.pdfMk.InnerColumnObject;
import org.xtext.avi.pdfMk.ItalicsDefinition;
import org.xtext.avi.pdfMk.MarginDefinition;
import org.xtext.avi.pdfMk.PdfMkPackage;
import org.xtext.avi.pdfMk.StringObject;
import org.xtext.avi.pdfMk.StyleDefinition;
import org.xtext.avi.pdfMk.StyleObject;
import org.xtext.avi.pdfMk.StyleObjects;
import org.xtext.avi.pdfMk.Styles;
import org.xtext.avi.pdfMk.TextObject;
import org.xtext.avi.pdfMk.TextStyleDefinition;
import org.xtext.avi.pdfMk.TypeFaceDefinition;
import org.xtext.avi.pdfMk.WidthDefinition;
import org.xtext.avi.services.PdfMkGrammarAccess;

@SuppressWarnings("all")
public class PdfMkSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PdfMkGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PdfMkPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PdfMkPackage.COLUMN_DEFINITION:
				sequence_ColumnDefinition(context, (ColumnDefinition) semanticObject); 
				return; 
			case PdfMkPackage.COLUMN_GAP_DEFINTION:
				sequence_ColumnGapDefintion(context, (ColumnGapDefintion) semanticObject); 
				return; 
			case PdfMkPackage.COLUMN_OBJECT:
				sequence_ColumnObject(context, (ColumnObject) semanticObject); 
				return; 
			case PdfMkPackage.COLUMN_TEXT_OBJECT:
				sequence_ColumnTextObject(context, (ColumnTextObject) semanticObject); 
				return; 
			case PdfMkPackage.CONTENT:
				sequence_Content(context, (Content) semanticObject); 
				return; 
			case PdfMkPackage.CONTENT_OBJECT:
				sequence_ContentObject(context, (ContentObject) semanticObject); 
				return; 
			case PdfMkPackage.CONTENT_OBJECTS:
				sequence_ContentObjects(context, (ContentObjects) semanticObject); 
				return; 
			case PdfMkPackage.DOC_DEFINITION:
				sequence_DocDefinition(context, (DocDefinition) semanticObject); 
				return; 
			case PdfMkPackage.FONT_SIZE_DEFINITION:
				sequence_FontSizeDefinition(context, (FontSizeDefinition) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_DEFINTION:
				sequence_ImageDefintion(context, (ImageDefintion) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_FIT_DEFINITION:
				sequence_ImageFitDefinition(context, (ImageFitDefinition) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_HEIGHT_DEFINTION:
				sequence_ImageHeightDefintion(context, (ImageHeightDefintion) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_OBJECT:
				sequence_ImageObject(context, (ImageObject) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_OPACITY_DEFINITION:
				sequence_ImageOpacityDefinition(context, (ImageOpacityDefinition) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_PAGE_BREAK_DEFINITION:
				sequence_ImagePageBreakDefinition(context, (ImagePageBreakDefinition) semanticObject); 
				return; 
			case PdfMkPackage.IMAGE_WIDTH_DEFINTION:
				sequence_ImageWidthDefintion(context, (ImageWidthDefintion) semanticObject); 
				return; 
			case PdfMkPackage.INNER_COLUMN_OBJECT:
				sequence_InnerColumnObject(context, (InnerColumnObject) semanticObject); 
				return; 
			case PdfMkPackage.ITALICS_DEFINITION:
				sequence_ItalicsDefinition(context, (ItalicsDefinition) semanticObject); 
				return; 
			case PdfMkPackage.MARGIN_DEFINITION:
				sequence_MarginDefinition(context, (MarginDefinition) semanticObject); 
				return; 
			case PdfMkPackage.STRING_OBJECT:
				sequence_StringObject(context, (StringObject) semanticObject); 
				return; 
			case PdfMkPackage.STYLE_DEFINITION:
				sequence_StyleDefinition(context, (StyleDefinition) semanticObject); 
				return; 
			case PdfMkPackage.STYLE_OBJECT:
				sequence_StyleObject(context, (StyleObject) semanticObject); 
				return; 
			case PdfMkPackage.STYLE_OBJECTS:
				sequence_StyleObjects(context, (StyleObjects) semanticObject); 
				return; 
			case PdfMkPackage.STYLES:
				sequence_Styles(context, (Styles) semanticObject); 
				return; 
			case PdfMkPackage.TEXT_OBJECT:
				sequence_TextObject(context, (TextObject) semanticObject); 
				return; 
			case PdfMkPackage.TEXT_STYLE_DEFINITION:
				sequence_TextStyleDefinition(context, (TextStyleDefinition) semanticObject); 
				return; 
			case PdfMkPackage.TYPE_FACE_DEFINITION:
				sequence_TypeFaceDefinition(context, (TypeFaceDefinition) semanticObject); 
				return; 
			case PdfMkPackage.WIDTH_DEFINITION:
				sequence_WidthDefinition(context, (WidthDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ColumnDefinition returns ColumnDefinition
	 *
	 * Constraint:
	 *     (globalStyle?=TextStyleDefinition? key='columns' value+=ColumnObject? value+=ColumnObject*)
	 */
	protected void sequence_ColumnDefinition(ISerializationContext context, ColumnDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColumnGapDefintion returns ColumnGapDefintion
	 *
	 * Constraint:
	 *     (key='columnGap' value=INT)
	 */
	protected void sequence_ColumnGapDefintion(ISerializationContext context, ColumnGapDefintion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.COLUMN_GAP_DEFINTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.COLUMN_GAP_DEFINTION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.COLUMN_GAP_DEFINTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.COLUMN_GAP_DEFINTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnGapDefintionAccess().getKeyColumnGapKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getColumnGapDefintionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ColumnObject returns ColumnObject
	 *
	 * Constraint:
	 *     (
	 *         value='[' 
	 *         text+=StringObject? 
	 *         text+=StringObject* 
	 *         textObject+=TextObject? 
	 *         textObject+=TextObject* 
	 *         column+=ColumnDefinition? 
	 *         column+=ColumnDefinition* 
	 *         innerColumn+=InnerColumnObject? 
	 *         innerColumn+=InnerColumnObject*
	 *     )
	 */
	protected void sequence_ColumnObject(ISerializationContext context, ColumnObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColumnTextObject returns ColumnTextObject
	 *
	 * Constraint:
	 *     value=ColumnDefinition
	 */
	protected void sequence_ColumnTextObject(ISerializationContext context, ColumnTextObject semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.COLUMN_TEXT_OBJECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.COLUMN_TEXT_OBJECT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnTextObjectAccess().getValueColumnDefinitionParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ContentObject returns ContentObject
	 *
	 * Constraint:
	 *     (value=StringObject | value=TextObject | value=ColumnTextObject | value=ImageObject)
	 */
	protected void sequence_ContentObject(ISerializationContext context, ContentObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContentObjects returns ContentObjects
	 *
	 * Constraint:
	 *     (value+=ContentObject value+=ContentObject*)
	 */
	protected void sequence_ContentObjects(ISerializationContext context, ContentObjects semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Content returns Content
	 *
	 * Constraint:
	 *     (key='content' value=ContentObjects)
	 */
	protected void sequence_Content(ISerializationContext context, Content semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.CONTENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.CONTENT__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.CONTENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.CONTENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContentAccess().getKeyContentKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getContentAccess().getValueContentObjectsParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DocDefinition returns DocDefinition
	 *
	 * Constraint:
	 *     (content=Content styles=Styles?)
	 */
	protected void sequence_DocDefinition(ISerializationContext context, DocDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FontSizeDefinition returns FontSizeDefinition
	 *
	 * Constraint:
	 *     (key='fontSize' value=INT)
	 */
	protected void sequence_FontSizeDefinition(ISerializationContext context, FontSizeDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.FONT_SIZE_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.FONT_SIZE_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.FONT_SIZE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.FONT_SIZE_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getFontSizeDefinitionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImageDefintion returns ImageDefintion
	 *
	 * Constraint:
	 *     (key='image' value=STRING)
	 */
	protected void sequence_ImageDefintion(ISerializationContext context, ImageDefintion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_DEFINTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_DEFINTION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_DEFINTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_DEFINTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getImageDefintionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImageFitDefinition returns ImageFitDefinition
	 *
	 * Constraint:
	 *     (key='fit' value='[' values+=INT values+=INT)
	 */
	protected void sequence_ImageFitDefinition(ISerializationContext context, ImageFitDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImageHeightDefintion returns ImageHeightDefintion
	 *
	 * Constraint:
	 *     (key='height' value=INT)
	 */
	protected void sequence_ImageHeightDefintion(ISerializationContext context, ImageHeightDefintion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_HEIGHT_DEFINTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_HEIGHT_DEFINTION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_HEIGHT_DEFINTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_HEIGHT_DEFINTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getImageHeightDefintionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImageObject returns ImageObject
	 *
	 * Constraint:
	 *     (
	 *         value='{' 
	 *         image?=ImageDefintion? 
	 *         width?=ImageWidthDefintion? 
	 *         height?=ImageHeightDefintion? 
	 *         opacity?=ImageOpacityDefinition? 
	 *         fit?=ImageFitDefinition? 
	 *         pageBreak?=ImagePageBreakDefinition?
	 *     )
	 */
	protected void sequence_ImageObject(ISerializationContext context, ImageObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImageOpacityDefinition returns ImageOpacityDefinition
	 *
	 * Constraint:
	 *     (key='opacity' value=INT)
	 */
	protected void sequence_ImageOpacityDefinition(ISerializationContext context, ImageOpacityDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_OPACITY_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_OPACITY_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_OPACITY_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_OPACITY_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getImageOpacityDefinitionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImagePageBreakDefinition returns ImagePageBreakDefinition
	 *
	 * Constraint:
	 *     (key='pageBreak' value=STRING)
	 */
	protected void sequence_ImagePageBreakDefinition(ISerializationContext context, ImagePageBreakDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_PAGE_BREAK_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_PAGE_BREAK_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_PAGE_BREAK_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_PAGE_BREAK_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getImagePageBreakDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImageWidthDefintion returns ImageWidthDefintion
	 *
	 * Constraint:
	 *     (key='width' value=INT)
	 */
	protected void sequence_ImageWidthDefintion(ISerializationContext context, ImageWidthDefintion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_WIDTH_DEFINTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_WIDTH_DEFINTION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.IMAGE_WIDTH_DEFINTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.IMAGE_WIDTH_DEFINTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getImageWidthDefintionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InnerColumnObject returns InnerColumnObject
	 *
	 * Constraint:
	 *     (
	 *         value='[' 
	 *         text+=StringObject? 
	 *         text+=StringObject* 
	 *         textObject+=TextObject? 
	 *         textObject+=TextObject* 
	 *         column+=ColumnDefinition? 
	 *         column+=ColumnDefinition*
	 *     )
	 */
	protected void sequence_InnerColumnObject(ISerializationContext context, InnerColumnObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ItalicsDefinition returns ItalicsDefinition
	 *
	 * Constraint:
	 *     (key='italics' value=BooleanType)
	 */
	protected void sequence_ItalicsDefinition(ISerializationContext context, ItalicsDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.ITALICS_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.ITALICS_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.ITALICS_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.ITALICS_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getItalicsDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MarginDefinition returns MarginDefinition
	 *
	 * Constraint:
	 *     (key='margin' values+=INT? values+=INT*)
	 */
	protected void sequence_MarginDefinition(ISerializationContext context, MarginDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringObject returns StringObject
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringObject(ISerializationContext context, StringObject semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.STRING_OBJECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.STRING_OBJECT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StyleDefinition returns StyleDefinition
	 *
	 * Constraint:
	 *     (key=STRING value=StyleObject)
	 */
	protected void sequence_StyleDefinition(ISerializationContext context, StyleDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.STYLE_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.STYLE_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.STYLE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.STYLE_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStyleDefinitionAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStyleDefinitionAccess().getValueStyleObjectParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StyleObject returns StyleObject
	 *
	 * Constraint:
	 *     (
	 *         key=ID 
	 *         value='{' 
	 *         fontSize?=FontSizeDefinition? 
	 *         typeFace?=TypeFaceDefinition? 
	 *         alignment?=TextAlignmentDefinition? 
	 *         italics?=ItalicsDefinition? 
	 *         margin?=MarginDefinition?
	 *     )
	 */
	protected void sequence_StyleObject(ISerializationContext context, StyleObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StyleObjects returns StyleObjects
	 *
	 * Constraint:
	 *     (value+=StyleObject value+=StyleObject*)
	 */
	protected void sequence_StyleObjects(ISerializationContext context, StyleObjects semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Styles returns Styles
	 *
	 * Constraint:
	 *     (key='styles' value=StyleObjects)
	 */
	protected void sequence_Styles(ISerializationContext context, Styles semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.STYLES__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.STYLES__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.STYLES__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.STYLES__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStylesAccess().getValueStyleObjectsParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TextObject returns TextObject
	 *
	 * Constraint:
	 *     (
	 *         value='{' 
	 *         text?=TextDefinition 
	 *         style?=TextStyleDefinition? 
	 *         fontSize?=FontSizeDefinition? 
	 *         alignment?=TextAlignmentDefinition? 
	 *         typeFace?=TypeFaceDefinition? 
	 *         italics?=ItalicsDefinition? 
	 *         width?=WidthDefinition? 
	 *         margin?=MarginDefinition?
	 *     )
	 */
	protected void sequence_TextObject(ISerializationContext context, TextObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TextStyleDefinition returns TextStyleDefinition
	 *
	 * Constraint:
	 *     (key='style' value=STRING)
	 */
	protected void sequence_TextStyleDefinition(ISerializationContext context, TextStyleDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.TEXT_STYLE_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.TEXT_STYLE_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.TEXT_STYLE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.TEXT_STYLE_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getTextStyleDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeFaceDefinition returns TypeFaceDefinition
	 *
	 * Constraint:
	 *     (key='bold' value=BooleanType)
	 */
	protected void sequence_TypeFaceDefinition(ISerializationContext context, TypeFaceDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.TYPE_FACE_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.TYPE_FACE_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.TYPE_FACE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.TYPE_FACE_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidthDefinition returns WidthDefinition
	 *
	 * Constraint:
	 *     (key='width' value=ColumnTextWidthType)
	 */
	protected void sequence_WidthDefinition(ISerializationContext context, WidthDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.WIDTH_DEFINITION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.WIDTH_DEFINITION__KEY));
			if (transientValues.isValueTransient(semanticObject, PdfMkPackage.Literals.WIDTH_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdfMkPackage.Literals.WIDTH_DEFINITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getWidthDefinitionAccess().getValueColumnTextWidthTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
