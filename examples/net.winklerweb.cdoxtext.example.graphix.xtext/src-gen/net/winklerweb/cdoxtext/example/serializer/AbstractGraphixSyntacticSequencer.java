package net.winklerweb.cdoxtext.example.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.winklerweb.cdoxtext.example.services.GraphixGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractGraphixSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GraphixGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Point_LeftParenthesisKeyword_1_q;
	protected AbstractElementAlias match_Point_RightParenthesisKeyword_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GraphixGrammarAccess) access;
		match_Point_LeftParenthesisKeyword_1_q = new TokenAlias(false, true, grammarAccess.getPointAccess().getLeftParenthesisKeyword_1());
		match_Point_RightParenthesisKeyword_5_q = new TokenAlias(false, true, grammarAccess.getPointAccess().getRightParenthesisKeyword_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Point_LeftParenthesisKeyword_1_q.equals(syntax))
				emit_Point_LeftParenthesisKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Point_RightParenthesisKeyword_5_q.equals(syntax))
				emit_Point_RightParenthesisKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('?
	 */
	protected void emit_Point_LeftParenthesisKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'?
	 */
	protected void emit_Point_RightParenthesisKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
