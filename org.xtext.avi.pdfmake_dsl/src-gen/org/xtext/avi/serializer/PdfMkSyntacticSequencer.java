/*
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.avi.services.PdfMkGrammarAccess;

@SuppressWarnings("all")
public class PdfMkSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PdfMkGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PdfMkGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getTextAlignmentDefinitionRule())
			return getTextAlignmentDefinitionToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTextDefinitionRule())
			return getTextDefinitionToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * TextAlignmentDefinition:
	 * 	"alignment" ":" STRING;
	 */
	protected String getTextAlignmentDefinitionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "alignment:\"\"";
	}
	
	/**
	 * TextDefinition:
	 * 	"text:" STRING | "[" STRING "]";
	 */
	protected String getTextDefinitionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "text:\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
