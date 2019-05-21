/*
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.avi.ide.contentassist.antlr.internal.InternalPdfMkParser;
import org.xtext.avi.services.PdfMkGrammarAccess;

public class PdfMkParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PdfMkGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PdfMkGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTextAlignmentTypeAccess().getAlternatives(), "rule__TextAlignmentType__Alternatives");
			builder.put(grammarAccess.getBooleanDefinitionAccess().getAlternatives(), "rule__BooleanDefinition__Alternatives");
			builder.put(grammarAccess.getTextDefinitionAccess().getAlternatives(), "rule__TextDefinition__Alternatives");
			builder.put(grammarAccess.getContentObjectAccess().getValueAlternatives_0(), "rule__ContentObject__ValueAlternatives_0");
			builder.put(grammarAccess.getDocDefinitionAccess().getGroup(), "rule__DocDefinition__Group__0");
			builder.put(grammarAccess.getDocDefinitionAccess().getGroup_5(), "rule__DocDefinition__Group_5__0");
			builder.put(grammarAccess.getTypeFaceDefinitionAccess().getGroup(), "rule__TypeFaceDefinition__Group__0");
			builder.put(grammarAccess.getTextStyleDefinitionAccess().getGroup(), "rule__TextStyleDefinition__Group__0");
			builder.put(grammarAccess.getTextDefinitionAccess().getGroup_0(), "rule__TextDefinition__Group_0__0");
			builder.put(grammarAccess.getTextDefinitionAccess().getGroup_1(), "rule__TextDefinition__Group_1__0");
			builder.put(grammarAccess.getTextAlignmentDefinitionAccess().getGroup(), "rule__TextAlignmentDefinition__Group__0");
			builder.put(grammarAccess.getItalicsDefinitionAccess().getGroup(), "rule__ItalicsDefinition__Group__0");
			builder.put(grammarAccess.getFontSizeDefinitionAccess().getGroup(), "rule__FontSizeDefinition__Group__0");
			builder.put(grammarAccess.getStyleDefinitionAccess().getGroup(), "rule__StyleDefinition__Group__0");
			builder.put(grammarAccess.getTextObjectAccess().getGroup(), "rule__TextObject__Group__0");
			builder.put(grammarAccess.getTextObjectAccess().getGroup_2(), "rule__TextObject__Group_2__0");
			builder.put(grammarAccess.getTextObjectAccess().getGroup_3(), "rule__TextObject__Group_3__0");
			builder.put(grammarAccess.getTextObjectAccess().getGroup_4(), "rule__TextObject__Group_4__0");
			builder.put(grammarAccess.getTextObjectAccess().getGroup_5(), "rule__TextObject__Group_5__0");
			builder.put(grammarAccess.getTextObjectAccess().getGroup_6(), "rule__TextObject__Group_6__0");
			builder.put(grammarAccess.getStyleObjectAccess().getGroup(), "rule__StyleObject__Group__0");
			builder.put(grammarAccess.getStyleObjectAccess().getGroup_4(), "rule__StyleObject__Group_4__0");
			builder.put(grammarAccess.getStyleObjectAccess().getGroup_5(), "rule__StyleObject__Group_5__0");
			builder.put(grammarAccess.getStyleObjectAccess().getGroup_6(), "rule__StyleObject__Group_6__0");
			builder.put(grammarAccess.getStyleObjectsAccess().getGroup(), "rule__StyleObjects__Group__0");
			builder.put(grammarAccess.getStyleObjectsAccess().getGroup_2(), "rule__StyleObjects__Group_2__0");
			builder.put(grammarAccess.getContentObjectsAccess().getGroup(), "rule__ContentObjects__Group__0");
			builder.put(grammarAccess.getContentObjectsAccess().getGroup_1(), "rule__ContentObjects__Group_1__0");
			builder.put(grammarAccess.getContentObjectsAccess().getGroup_1_1(), "rule__ContentObjects__Group_1_1__0");
			builder.put(grammarAccess.getStylesAccess().getGroup(), "rule__Styles__Group__0");
			builder.put(grammarAccess.getContentAccess().getGroup(), "rule__Content__Group__0");
			builder.put(grammarAccess.getDocDefinitionAccess().getContentAssignment_4(), "rule__DocDefinition__ContentAssignment_4");
			builder.put(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1(), "rule__DocDefinition__StylesAssignment_5_1");
			builder.put(grammarAccess.getStringObjectAccess().getValueAssignment(), "rule__StringObject__ValueAssignment");
			builder.put(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0(), "rule__TypeFaceDefinition__KeyAssignment_0");
			builder.put(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2(), "rule__TypeFaceDefinition__ValueAssignment_2");
			builder.put(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0(), "rule__TextStyleDefinition__KeyAssignment_0");
			builder.put(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2(), "rule__TextStyleDefinition__ValueAssignment_2");
			builder.put(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0(), "rule__ItalicsDefinition__KeyAssignment_0");
			builder.put(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2(), "rule__ItalicsDefinition__ValueAssignment_2");
			builder.put(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0(), "rule__FontSizeDefinition__KeyAssignment_0");
			builder.put(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2(), "rule__FontSizeDefinition__ValueAssignment_2");
			builder.put(grammarAccess.getStyleDefinitionAccess().getKeyAssignment_0(), "rule__StyleDefinition__KeyAssignment_0");
			builder.put(grammarAccess.getStyleDefinitionAccess().getValueAssignment_2(), "rule__StyleDefinition__ValueAssignment_2");
			builder.put(grammarAccess.getTextObjectAccess().getValueAssignment_0(), "rule__TextObject__ValueAssignment_0");
			builder.put(grammarAccess.getTextObjectAccess().getTextAssignment_1(), "rule__TextObject__TextAssignment_1");
			builder.put(grammarAccess.getTextObjectAccess().getStyleAssignment_2_1(), "rule__TextObject__StyleAssignment_2_1");
			builder.put(grammarAccess.getTextObjectAccess().getFontSizeAssignment_3_1(), "rule__TextObject__FontSizeAssignment_3_1");
			builder.put(grammarAccess.getTextObjectAccess().getAlignmentAssignment_4_1(), "rule__TextObject__AlignmentAssignment_4_1");
			builder.put(grammarAccess.getTextObjectAccess().getTypeFaceAssignment_5_1(), "rule__TextObject__TypeFaceAssignment_5_1");
			builder.put(grammarAccess.getTextObjectAccess().getItalicsAssignment_6_1(), "rule__TextObject__ItalicsAssignment_6_1");
			builder.put(grammarAccess.getStyleObjectAccess().getKeyAssignment_0(), "rule__StyleObject__KeyAssignment_0");
			builder.put(grammarAccess.getStyleObjectAccess().getValueAssignment_2(), "rule__StyleObject__ValueAssignment_2");
			builder.put(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3(), "rule__StyleObject__FontSizeAssignment_3");
			builder.put(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1(), "rule__StyleObject__TypeFaceAssignment_4_1");
			builder.put(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1(), "rule__StyleObject__AlignmentAssignment_5_1");
			builder.put(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1(), "rule__StyleObject__ItalicsAssignment_6_1");
			builder.put(grammarAccess.getStyleObjectsAccess().getValueAssignment_1(), "rule__StyleObjects__ValueAssignment_1");
			builder.put(grammarAccess.getStyleObjectsAccess().getValueAssignment_2_1(), "rule__StyleObjects__ValueAssignment_2_1");
			builder.put(grammarAccess.getContentObjectAccess().getValueAssignment(), "rule__ContentObject__ValueAssignment");
			builder.put(grammarAccess.getContentObjectsAccess().getValueAssignment_1_0(), "rule__ContentObjects__ValueAssignment_1_0");
			builder.put(grammarAccess.getContentObjectsAccess().getValueAssignment_1_1_1(), "rule__ContentObjects__ValueAssignment_1_1_1");
			builder.put(grammarAccess.getStylesAccess().getKeyAssignment_0(), "rule__Styles__KeyAssignment_0");
			builder.put(grammarAccess.getStylesAccess().getValueAssignment_2(), "rule__Styles__ValueAssignment_2");
			builder.put(grammarAccess.getContentAccess().getKeyAssignment_0(), "rule__Content__KeyAssignment_0");
			builder.put(grammarAccess.getContentAccess().getValueAssignment_2(), "rule__Content__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PdfMkGrammarAccess grammarAccess;

	@Override
	protected InternalPdfMkParser createParser() {
		InternalPdfMkParser result = new InternalPdfMkParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PdfMkGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PdfMkGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
