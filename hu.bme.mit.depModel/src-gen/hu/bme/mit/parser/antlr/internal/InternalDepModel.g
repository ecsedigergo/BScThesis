/*
 * generated by Xtext 2.9.2
 */
grammar InternalDepModel;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package hu.bme.mit.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hu.bme.mit.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.services.DepModelGrammarAccess;

}

@parser::members {

 	private DepModelGrammarAccess grammarAccess;

    public InternalDepModelParser(TokenStream input, DepModelGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DepModel";
   	}

   	@Override
   	protected DepModelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDepModel
entryRuleDepModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDepModelRule()); }
	iv_ruleDepModel=ruleDepModel
	{ $current=$iv_ruleDepModel.current; }
	EOF;

// Rule DepModel
ruleDepModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDepModelAccess().getDepmodelsAbstractModelDecParserRuleCall_0());
			}
			lv_depmodels_0_0=ruleabstractModelDec
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDepModelRule());
				}
				add(
					$current,
					"depmodels",
					lv_depmodels_0_0,
					"hu.bme.mit.DepModel.abstractModelDec");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleabstractModelDec
entryRuleabstractModelDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractModelDecRule()); }
	iv_ruleabstractModelDec=ruleabstractModelDec
	{ $current=$iv_ruleabstractModelDec.current; }
	EOF;

// Rule abstractModelDec
ruleabstractModelDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractModelDecAccess().getComponentModelParserRuleCall_0());
		}
		this_ComponentModel_0=ruleComponentModel
		{
			$current = $this_ComponentModel_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractModelDecAccess().getErrorModelParserRuleCall_1());
		}
		this_ErrorModel_1=ruleErrorModel
		{
			$current = $this_ErrorModel_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractModelDecAccess().getPortTypeParserRuleCall_2());
		}
		this_PortType_2=rulePortType
		{
			$current = $this_PortType_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePortType
entryRulePortType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortTypeRule()); }
	iv_rulePortType=rulePortType
	{ $current=$iv_rulePortType.current; }
	EOF;

// Rule PortType
rulePortType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='port'
		{
			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortKeyword_0());
		}
		otherlv_1='type'
		{
			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getTypeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPortTypeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0());
				}
				lv_eModes_4_0=ruleerrorModes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortTypeRule());
					}
					set(
						$current,
						"eModes",
						lv_eModes_4_0,
						"hu.bme.mit.DepModel.errorModes");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleerrorModes
entryRuleerrorModes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getErrorModesRule()); }
	iv_ruleerrorModes=ruleerrorModes
	{ $current=$iv_ruleerrorModes.current; }
	EOF;

// Rule errorModes
ruleerrorModes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='error'
		{
			newLeafNode(otherlv_0, grammarAccess.getErrorModesAccess().getErrorKeyword_0());
		}
		otherlv_1='mode'
		{
			newLeafNode(otherlv_1, grammarAccess.getErrorModesAccess().getModeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getErrorModesAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getErrorModesRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleErrorModel
entryRuleErrorModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getErrorModelRule()); }
	iv_ruleErrorModel=ruleErrorModel
	{ $current=$iv_ruleErrorModel.current; }
	EOF;

// Rule ErrorModel
ruleErrorModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='error'
		{
			newLeafNode(otherlv_0, grammarAccess.getErrorModelAccess().getErrorKeyword_0());
		}
		otherlv_1='model'
		{
			newLeafNode(otherlv_1, grammarAccess.getErrorModelAccess().getModelKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getErrorModelAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getErrorModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getErrorModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getErrorModelAccess().getEmodelElementsEModelElementParserRuleCall_4_0());
				}
				lv_emodelElements_4_0=ruleEModelElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getErrorModelRule());
					}
					add(
						$current,
						"emodelElements",
						lv_emodelElements_4_0,
						"hu.bme.mit.DepModel.EModelElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getErrorModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEModelElement
entryRuleEModelElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEModelElementRule()); }
	iv_ruleEModelElement=ruleEModelElement
	{ $current=$iv_ruleEModelElement.current; }
	EOF;

// Rule EModelElement
ruleEModelElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEModelElementAccess().getStateDecParserRuleCall_0());
		}
		this_StateDec_0=ruleStateDec
		{
			$current = $this_StateDec_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEModelElementAccess().getEventDecParserRuleCall_1());
		}
		this_EventDec_1=ruleEventDec
		{
			$current = $this_EventDec_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStateDec
entryRuleStateDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateDecRule()); }
	iv_ruleStateDec=ruleStateDec
	{ $current=$iv_ruleStateDec.current; }
	EOF;

// Rule StateDec
ruleStateDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='error'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorKeyword_0());
		}
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateDecAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getStateDecAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleEventDec
entryRuleEventDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventDecRule()); }
	iv_ruleEventDec=ruleEventDec
	{ $current=$iv_ruleEventDec.current; }
	EOF;

// Rule EventDec
ruleEventDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getEventDecAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEventDecAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEventDecAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEventDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0());
				}
				lv_Features_3_0=ruleTransitionFeatureDec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventDecRule());
					}
					add(
						$current,
						"Features",
						lv_Features_3_0,
						"hu.bme.mit.DepModel.TransitionFeatureDec");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEventDecAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTransitionFeatureDec
entryRuleTransitionFeatureDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionFeatureDecRule()); }
	iv_ruleTransitionFeatureDec=ruleTransitionFeatureDec
	{ $current=$iv_ruleTransitionFeatureDec.current; }
	EOF;

// Rule TransitionFeatureDec
ruleTransitionFeatureDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTransitionStateParserRuleCall_0());
		}
		this_TransitionState_0=ruleTransitionState
		{
			$current = $this_TransitionState_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTriggerDecParserRuleCall_1());
		}
		this_TriggerDec_1=ruleTriggerDec
		{
			$current = $this_TriggerDec_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getActionDecParserRuleCall_2());
		}
		this_ActionDec_2=ruleActionDec
		{
			$current = $this_ActionDec_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getOccurenceDecParserRuleCall_3());
		}
		ruleOccurenceDec
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTransitionState
entryRuleTransitionState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionStateRule()); }
	iv_ruleTransitionState=ruleTransitionState
	{ $current=$iv_ruleTransitionState.current; }
	EOF;

// Rule TransitionState
ruleTransitionState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='states'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionStateRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_2_0());
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionStateRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getTransitionStateAccess().getTargetStateStateDecCrossReference_4_0());
				}
			)
		)
	)
;

// Entry rule entryRuleTriggerDec
entryRuleTriggerDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTriggerDecRule()); }
	iv_ruleTriggerDec=ruleTriggerDec
	{ $current=$iv_ruleTriggerDec.current; }
	EOF;

// Rule TriggerDec
ruleTriggerDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='trigger'
		{
			newLeafNode(otherlv_0, grammarAccess.getTriggerDecAccess().getTriggerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTriggerDecAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerDecRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTriggerDecAccess().getPortTypePortCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerDecRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTriggerDecAccess().getErrorModeErrorModesCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleActionDec
entryRuleActionDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionDecRule()); }
	iv_ruleActionDec=ruleActionDec
	{ $current=$iv_ruleActionDec.current; }
	EOF;

// Rule ActionDec
ruleActionDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='action'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionDecAccess().getActionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getActionDecAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionDecRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getActionDecAccess().getPortTypePortCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionDecRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getActionDecAccess().getErrorModeErrorModesCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleOccurenceDec
entryRuleOccurenceDec returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOccurenceDecRule()); }
	iv_ruleOccurenceDec=ruleOccurenceDec
	{ $current=$iv_ruleOccurenceDec.current.getText(); }
	EOF;

// Rule OccurenceDec
ruleOccurenceDec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='occurrence'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOccurenceDecAccess().getOccurrenceKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getOccurenceDecAccess().getDOUBLEParserRuleCall_1());
		}
		this_DOUBLE_1=ruleDOUBLE
		{
			$current.merge(this_DOUBLE_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); }
	iv_ruleDOUBLE=ruleDOUBLE
	{ $current=$iv_ruleDOUBLE.current.getText(); }
	EOF;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleComponentModel
entryRuleComponentModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModelRule()); }
	iv_ruleComponentModel=ruleComponentModel
	{ $current=$iv_ruleComponentModel.current; }
	EOF;

// Rule ComponentModel
ruleComponentModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getComponentModelAccess().getElementsComponentModelDecParserRuleCall_0());
			}
			lv_elements_0_0=ruleComponentModelDec
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getComponentModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"hu.bme.mit.DepModel.ComponentModelDec");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleComponentModelDec
entryRuleComponentModelDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModelDecRule()); }
	iv_ruleComponentModelDec=ruleComponentModelDec
	{ $current=$iv_ruleComponentModelDec.current; }
	EOF;

// Rule ComponentModelDec
ruleComponentModelDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemDecParserRuleCall_0());
		}
		this_SystemDec_0=ruleSystemDec
		{
			$current = $this_SystemDec_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemConnDecParserRuleCall_1());
		}
		this_SystemConnDec_1=ruleSystemConnDec
		{
			$current = $this_SystemConnDec_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSystemConnDec
entryRuleSystemConnDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemConnDecRule()); }
	iv_ruleSystemConnDec=ruleSystemConnDec
	{ $current=$iv_ruleSystemConnDec.current; }
	EOF;

// Rule SystemConnDec
ruleSystemConnDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getSystemKeyword_0());
		}
		otherlv_1='connection'
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSystemConnDecAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemConnDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='from'
		{
			newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getFromKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemConnDecRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0());
				}
			)
		)
		otherlv_5='.'
		{
			newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemConnDecRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0());
				}
			)
		)
		otherlv_7='to'
		{
			newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getToKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemConnDecRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0());
				}
			)
		)
		otherlv_9='.'
		{
			newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemConnDecRule());
					}
				}
				otherlv_10=RULE_ID
				{
					newLeafNode(otherlv_10, grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_10_0());
				}
			)
		)
	)
;

// Entry rule entryRuleSystemDec
entryRuleSystemDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemDecRule()); }
	iv_ruleSystemDec=ruleSystemDec
	{ $current=$iv_ruleSystemDec.current; }
	EOF;

// Rule SystemDec
ruleSystemDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemKeyword_0());
		}
		otherlv_1='declaration'
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemDecAccess().getDeclarationKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSystemDecAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_4_0());
				}
				lv_sysFeatures_4_0=ruleAbstractFeatures
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemDecRule());
					}
					add(
						$current,
						"sysFeatures",
						lv_sysFeatures_4_0,
						"hu.bme.mit.DepModel.AbstractFeatures");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAbstractFeatures
entryRuleAbstractFeatures returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractFeaturesRule()); }
	iv_ruleAbstractFeatures=ruleAbstractFeatures
	{ $current=$iv_ruleAbstractFeatures.current; }
	EOF;

// Rule AbstractFeatures
ruleAbstractFeatures returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getComponentTypeParserRuleCall_0());
		}
		this_ComponentType_0=ruleComponentType
		{
			$current = $this_ComponentType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getComponentImplParserRuleCall_1());
		}
		this_ComponentImpl_1=ruleComponentImpl
		{
			$current = $this_ComponentImpl_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getCompConnDecParserRuleCall_2());
		}
		this_CompConnDec_2=ruleCompConnDec
		{
			$current = $this_CompConnDec_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_3());
		}
		this_SystemPortDec_3=ruleSystemPortDec
		{
			$current = $this_SystemPortDec_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSystemPortDec
entryRuleSystemPortDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemPortDecRule()); }
	iv_ruleSystemPortDec=ruleSystemPortDec
	{ $current=$iv_ruleSystemPortDec.current; }
	EOF;

// Rule SystemPortDec
ruleSystemPortDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSystemPortDecAccess().getSystemPortInParserRuleCall_0());
		}
		this_SystemPortIn_0=ruleSystemPortIn
		{
			$current = $this_SystemPortIn_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSystemPortDecAccess().getSystemPortOutParserRuleCall_1());
		}
		this_SystemPortOut_1=ruleSystemPortOut
		{
			$current = $this_SystemPortOut_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSystemPortIn
entryRuleSystemPortIn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemPortInRule()); }
	iv_ruleSystemPortIn=ruleSystemPortIn
	{ $current=$iv_ruleSystemPortIn.current; }
	EOF;

// Rule SystemPortIn
ruleSystemPortIn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemKeyword_0());
		}
		otherlv_1='port'
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemPortInAccess().getPortKeyword_1());
		}
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getInKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getSystemPortInAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemPortInRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemPortInRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0());
				}
			)
		)
		otherlv_6='.'
		{
			newLeafNode(otherlv_6, grammarAccess.getSystemPortInAccess().getFullStopKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemPortInRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_7_0());
				}
			)
		)
	)
;

// Entry rule entryRuleSystemPortOut
entryRuleSystemPortOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemPortOutRule()); }
	iv_ruleSystemPortOut=ruleSystemPortOut
	{ $current=$iv_ruleSystemPortOut.current; }
	EOF;

// Rule SystemPortOut
ruleSystemPortOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemKeyword_0());
		}
		otherlv_1='port'
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemPortOutAccess().getPortKeyword_1());
		}
		otherlv_2='out'
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getOutKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getSystemPortOutAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemPortOutRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='from'
		{
			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFromKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemPortOutRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0());
				}
			)
		)
		otherlv_6='.'
		{
			newLeafNode(otherlv_6, grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemPortOutRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_7_0());
				}
			)
		)
	)
;

// Entry rule entryRuleCompConnDec
entryRuleCompConnDec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompConnDecRule()); }
	iv_ruleCompConnDec=ruleCompConnDec
	{ $current=$iv_ruleCompConnDec.current; }
	EOF;

// Rule CompConnDec
ruleCompConnDec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='component'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompConnDecAccess().getComponentKeyword_0());
		}
		otherlv_1='connection'
		{
			newLeafNode(otherlv_1, grammarAccess.getCompConnDecAccess().getConnectionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompConnDecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='from'
		{
			newLeafNode(otherlv_3, grammarAccess.getCompConnDecAccess().getFromKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompConnDecRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_4_0());
				}
			)
		)
		otherlv_5='.'
		{
			newLeafNode(otherlv_5, grammarAccess.getCompConnDecAccess().getFullStopKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompConnDecRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_6_0());
				}
			)
		)
		otherlv_7='to'
		{
			newLeafNode(otherlv_7, grammarAccess.getCompConnDecAccess().getToKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompConnDecRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_8_0());
				}
			)
		)
		otherlv_9='.'
		{
			newLeafNode(otherlv_9, grammarAccess.getCompConnDecAccess().getFullStopKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompConnDecRule());
					}
				}
				otherlv_10=RULE_ID
				{
					newLeafNode(otherlv_10, grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_10_0());
				}
			)
		)
	)
;

// Entry rule entryRuleComponentImpl
entryRuleComponentImpl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentImplRule()); }
	iv_ruleComponentImpl=ruleComponentImpl
	{ $current=$iv_ruleComponentImpl.current; }
	EOF;

// Rule ComponentImpl
ruleComponentImpl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentKeyword_0());
		}
		otherlv_1='implementation'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentImplAccess().getImplementationKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getComponentImplAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentImplRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getColonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentImplRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_4_0());
				}
			)
		)
	)
;

// Entry rule entryRuleComponentType
entryRuleComponentType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentTypeRule()); }
	iv_ruleComponentType=ruleComponentType
	{ $current=$iv_ruleComponentType.current; }
	EOF;

// Rule ComponentType
ruleComponentType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentKeyword_0());
		}
		otherlv_1='type'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getTypeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getComponentTypeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentTypeAccess().getCompFeaturesPortParserRuleCall_4_0());
				}
				lv_compFeatures_4_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentTypeRule());
					}
					add(
						$current,
						"compFeatures",
						lv_compFeatures_4_0,
						"hu.bme.mit.DepModel.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPortAccess().getInPortParserRuleCall_0());
		}
		this_InPort_0=ruleInPort
		{
			$current = $this_InPort_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getOutPortParserRuleCall_1());
		}
		this_OutPort_1=ruleOutPort
		{
			$current = $this_OutPort_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInPort
entryRuleInPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInPortRule()); }
	iv_ruleInPort=ruleInPort
	{ $current=$iv_ruleInPort.current; }
	EOF;

// Rule InPort
ruleInPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='port'
		{
			newLeafNode(otherlv_0, grammarAccess.getInPortAccess().getPortKeyword_0());
		}
		otherlv_1='instance'
		{
			newLeafNode(otherlv_1, grammarAccess.getInPortAccess().getInstanceKeyword_1());
		}
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getInPortAccess().getInKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getInPortAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getInPortAccess().getColonKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInPortRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleOutPort
entryRuleOutPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutPortRule()); }
	iv_ruleOutPort=ruleOutPort
	{ $current=$iv_ruleOutPort.current; }
	EOF;

// Rule OutPort
ruleOutPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='port'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutPortAccess().getPortKeyword_0());
		}
		otherlv_1='instance'
		{
			newLeafNode(otherlv_1, grammarAccess.getOutPortAccess().getInstanceKeyword_1());
		}
		otherlv_2='out'
		{
			newLeafNode(otherlv_2, grammarAccess.getOutPortAccess().getOutKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getOutPortAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getOutPortAccess().getColonKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutPortRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_5_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;