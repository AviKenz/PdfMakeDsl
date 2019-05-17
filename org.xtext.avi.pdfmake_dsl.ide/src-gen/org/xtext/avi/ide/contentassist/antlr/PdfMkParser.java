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
			builder.put(grammarAccess.getElementAccess().getElementAlternatives_0(), "rule__Element__ElementAlternatives_0");
			builder.put(grammarAccess.getDocDefinitionAccess().getRootsAssignment(), "rule__DocDefinition__RootsAssignment");
			builder.put(grammarAccess.getElementAccess().getElementAssignment(), "rule__Element__ElementAssignment");
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
