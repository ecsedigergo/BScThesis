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
import hu.bme.mit.services.ErrorModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErrorModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'error model'", "'{'", "'}'", "'propagation in'", "'trigger'", "'propagation out'", "'action'", "'error state'", "'transition'", "'occurrence'", "'.'", "'states'", "':'", "'->'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalErrorModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErrorModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErrorModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalErrorModel.g"; }



     	private ErrorModelGrammarAccess grammarAccess;

        public InternalErrorModelParser(TokenStream input, ErrorModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ErrorModel";
       	}

       	@Override
       	protected ErrorModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleErrorModel"
    // InternalErrorModel.g:64:1: entryRuleErrorModel returns [EObject current=null] : iv_ruleErrorModel= ruleErrorModel EOF ;
    public final EObject entryRuleErrorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModel = null;


        try {
            // InternalErrorModel.g:64:51: (iv_ruleErrorModel= ruleErrorModel EOF )
            // InternalErrorModel.g:65:2: iv_ruleErrorModel= ruleErrorModel EOF
            {
             newCompositeNode(grammarAccess.getErrorModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorModel=ruleErrorModel();

            state._fsp--;

             current =iv_ruleErrorModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorModel"


    // $ANTLR start "ruleErrorModel"
    // InternalErrorModel.g:71:1: ruleErrorModel returns [EObject current=null] : ( (lv_AbstractElement_0_0= ruleEModelDec ) )* ;
    public final EObject ruleErrorModel() throws RecognitionException {
        EObject current = null;

        EObject lv_AbstractElement_0_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:77:2: ( ( (lv_AbstractElement_0_0= ruleEModelDec ) )* )
            // InternalErrorModel.g:78:2: ( (lv_AbstractElement_0_0= ruleEModelDec ) )*
            {
            // InternalErrorModel.g:78:2: ( (lv_AbstractElement_0_0= ruleEModelDec ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalErrorModel.g:79:3: (lv_AbstractElement_0_0= ruleEModelDec )
            	    {
            	    // InternalErrorModel.g:79:3: (lv_AbstractElement_0_0= ruleEModelDec )
            	    // InternalErrorModel.g:80:4: lv_AbstractElement_0_0= ruleEModelDec
            	    {

            	    				newCompositeNode(grammarAccess.getErrorModelAccess().getAbstractElementEModelDecParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_AbstractElement_0_0=ruleEModelDec();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getErrorModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"AbstractElement",
            	    					lv_AbstractElement_0_0,
            	    					"hu.bme.mit.ErrorModel.EModelDec");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorModel"


    // $ANTLR start "entryRuleEModelDec"
    // InternalErrorModel.g:100:1: entryRuleEModelDec returns [EObject current=null] : iv_ruleEModelDec= ruleEModelDec EOF ;
    public final EObject entryRuleEModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelDec = null;


        try {
            // InternalErrorModel.g:100:50: (iv_ruleEModelDec= ruleEModelDec EOF )
            // InternalErrorModel.g:101:2: iv_ruleEModelDec= ruleEModelDec EOF
            {
             newCompositeNode(grammarAccess.getEModelDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEModelDec=ruleEModelDec();

            state._fsp--;

             current =iv_ruleEModelDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEModelDec"


    // $ANTLR start "ruleEModelDec"
    // InternalErrorModel.g:107:1: ruleEModelDec returns [EObject current=null] : (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModelDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_emodelElements_3_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:113:2: ( (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' ) )
            // InternalErrorModel.g:114:2: (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' )
            {
            // InternalErrorModel.g:114:2: (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' )
            // InternalErrorModel.g:115:3: otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEModelDecAccess().getErrorModelKeyword_0());
            		
            // InternalErrorModel.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEModelDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEModelDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEModelDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalErrorModel.g:142:3: ( (lv_emodelElements_3_0= ruleEModelElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==16||(LA2_0>=18 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalErrorModel.g:143:4: (lv_emodelElements_3_0= ruleEModelElement )
            	    {
            	    // InternalErrorModel.g:143:4: (lv_emodelElements_3_0= ruleEModelElement )
            	    // InternalErrorModel.g:144:5: lv_emodelElements_3_0= ruleEModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getEModelDecAccess().getEmodelElementsEModelElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_emodelElements_3_0=ruleEModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEModelDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"emodelElements",
            	    						lv_emodelElements_3_0,
            	    						"hu.bme.mit.ErrorModel.EModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEModelDecAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEModelDec"


    // $ANTLR start "entryRuleEModelElement"
    // InternalErrorModel.g:169:1: entryRuleEModelElement returns [EObject current=null] : iv_ruleEModelElement= ruleEModelElement EOF ;
    public final EObject entryRuleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelElement = null;


        try {
            // InternalErrorModel.g:169:54: (iv_ruleEModelElement= ruleEModelElement EOF )
            // InternalErrorModel.g:170:2: iv_ruleEModelElement= ruleEModelElement EOF
            {
             newCompositeNode(grammarAccess.getEModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEModelElement=ruleEModelElement();

            state._fsp--;

             current =iv_ruleEModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEModelElement"


    // $ANTLR start "ruleEModelElement"
    // InternalErrorModel.g:176:1: ruleEModelElement returns [EObject current=null] : (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation ) ;
    public final EObject ruleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_StateDec_0 = null;

        EObject this_EventDec_1 = null;

        EObject this_OuterPropagation_2 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:182:2: ( (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation ) )
            // InternalErrorModel.g:183:2: (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation )
            {
            // InternalErrorModel.g:183:2: (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 14:
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalErrorModel.g:184:3: this_StateDec_0= ruleStateDec
                    {

                    			newCompositeNode(grammarAccess.getEModelElementAccess().getStateDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateDec_0=ruleStateDec();

                    state._fsp--;


                    			current = this_StateDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalErrorModel.g:193:3: this_EventDec_1= ruleEventDec
                    {

                    			newCompositeNode(grammarAccess.getEModelElementAccess().getEventDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventDec_1=ruleEventDec();

                    state._fsp--;


                    			current = this_EventDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalErrorModel.g:202:3: this_OuterPropagation_2= ruleOuterPropagation
                    {

                    			newCompositeNode(grammarAccess.getEModelElementAccess().getOuterPropagationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OuterPropagation_2=ruleOuterPropagation();

                    state._fsp--;


                    			current = this_OuterPropagation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEModelElement"


    // $ANTLR start "entryRuleOuterPropagation"
    // InternalErrorModel.g:214:1: entryRuleOuterPropagation returns [EObject current=null] : iv_ruleOuterPropagation= ruleOuterPropagation EOF ;
    public final EObject entryRuleOuterPropagation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterPropagation = null;


        try {
            // InternalErrorModel.g:214:57: (iv_ruleOuterPropagation= ruleOuterPropagation EOF )
            // InternalErrorModel.g:215:2: iv_ruleOuterPropagation= ruleOuterPropagation EOF
            {
             newCompositeNode(grammarAccess.getOuterPropagationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOuterPropagation=ruleOuterPropagation();

            state._fsp--;

             current =iv_ruleOuterPropagation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOuterPropagation"


    // $ANTLR start "ruleOuterPropagation"
    // InternalErrorModel.g:221:1: ruleOuterPropagation returns [EObject current=null] : (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec ) ;
    public final EObject ruleOuterPropagation() throws RecognitionException {
        EObject current = null;

        EObject this_InPropDec_0 = null;

        EObject this_OutPropDec_1 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:227:2: ( (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec ) )
            // InternalErrorModel.g:228:2: (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec )
            {
            // InternalErrorModel.g:228:2: (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalErrorModel.g:229:3: this_InPropDec_0= ruleInPropDec
                    {

                    			newCompositeNode(grammarAccess.getOuterPropagationAccess().getInPropDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InPropDec_0=ruleInPropDec();

                    state._fsp--;


                    			current = this_InPropDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalErrorModel.g:238:3: this_OutPropDec_1= ruleOutPropDec
                    {

                    			newCompositeNode(grammarAccess.getOuterPropagationAccess().getOutPropDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutPropDec_1=ruleOutPropDec();

                    state._fsp--;


                    			current = this_OutPropDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOuterPropagation"


    // $ANTLR start "entryRuleInPropDec"
    // InternalErrorModel.g:250:1: entryRuleInPropDec returns [EObject current=null] : iv_ruleInPropDec= ruleInPropDec EOF ;
    public final EObject entryRuleInPropDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPropDec = null;


        try {
            // InternalErrorModel.g:250:50: (iv_ruleInPropDec= ruleInPropDec EOF )
            // InternalErrorModel.g:251:2: iv_ruleInPropDec= ruleInPropDec EOF
            {
             newCompositeNode(grammarAccess.getInPropDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInPropDec=ruleInPropDec();

            state._fsp--;

             current =iv_ruleInPropDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInPropDec"


    // $ANTLR start "ruleInPropDec"
    // InternalErrorModel.g:257:1: ruleInPropDec returns [EObject current=null] : (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'trigger' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInPropDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:263:2: ( (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'trigger' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalErrorModel.g:264:2: (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'trigger' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalErrorModel.g:264:2: (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'trigger' ( (otherlv_3= RULE_ID ) ) )
            // InternalErrorModel.g:265:3: otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'trigger' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInPropDecAccess().getPropagationInKeyword_0());
            		
            // InternalErrorModel.g:269:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:270:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:270:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:271:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getInPropDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPropDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInPropDecAccess().getTriggerKeyword_2());
            		
            // InternalErrorModel.g:292:3: ( (otherlv_3= RULE_ID ) )
            // InternalErrorModel.g:293:4: (otherlv_3= RULE_ID )
            {
            // InternalErrorModel.g:293:4: (otherlv_3= RULE_ID )
            // InternalErrorModel.g:294:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInPropDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getInPropDecAccess().getAffectedStateEventDecCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInPropDec"


    // $ANTLR start "entryRuleOutPropDec"
    // InternalErrorModel.g:309:1: entryRuleOutPropDec returns [EObject current=null] : iv_ruleOutPropDec= ruleOutPropDec EOF ;
    public final EObject entryRuleOutPropDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPropDec = null;


        try {
            // InternalErrorModel.g:309:51: (iv_ruleOutPropDec= ruleOutPropDec EOF )
            // InternalErrorModel.g:310:2: iv_ruleOutPropDec= ruleOutPropDec EOF
            {
             newCompositeNode(grammarAccess.getOutPropDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutPropDec=ruleOutPropDec();

            state._fsp--;

             current =iv_ruleOutPropDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutPropDec"


    // $ANTLR start "ruleOutPropDec"
    // InternalErrorModel.g:316:1: ruleOutPropDec returns [EObject current=null] : (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'action' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleOutPropDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:322:2: ( (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'action' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalErrorModel.g:323:2: (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'action' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalErrorModel.g:323:2: (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'action' ( (otherlv_3= RULE_ID ) ) )
            // InternalErrorModel.g:324:3: otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'action' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutPropDecAccess().getPropagationOutKeyword_0());
            		
            // InternalErrorModel.g:328:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:329:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:329:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:330:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getOutPropDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutPropDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOutPropDecAccess().getActionKeyword_2());
            		
            // InternalErrorModel.g:351:3: ( (otherlv_3= RULE_ID ) )
            // InternalErrorModel.g:352:4: (otherlv_3= RULE_ID )
            {
            // InternalErrorModel.g:352:4: (otherlv_3= RULE_ID )
            // InternalErrorModel.g:353:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutPropDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getOutPropDecAccess().getFromStateEventDecCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutPropDec"


    // $ANTLR start "entryRuleStateDec"
    // InternalErrorModel.g:368:1: entryRuleStateDec returns [EObject current=null] : iv_ruleStateDec= ruleStateDec EOF ;
    public final EObject entryRuleStateDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDec = null;


        try {
            // InternalErrorModel.g:368:49: (iv_ruleStateDec= ruleStateDec EOF )
            // InternalErrorModel.g:369:2: iv_ruleStateDec= ruleStateDec EOF
            {
             newCompositeNode(grammarAccess.getStateDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDec=ruleStateDec();

            state._fsp--;

             current =iv_ruleStateDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateDec"


    // $ANTLR start "ruleStateDec"
    // InternalErrorModel.g:375:1: ruleStateDec returns [EObject current=null] : (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleStateDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:381:2: ( (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalErrorModel.g:382:2: (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalErrorModel.g:382:2: (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalErrorModel.g:383:3: otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorStateKeyword_0());
            		
            // InternalErrorModel.g:387:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:388:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:388:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:389:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStateDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateDec"


    // $ANTLR start "entryRuleEventDec"
    // InternalErrorModel.g:410:1: entryRuleEventDec returns [EObject current=null] : iv_ruleEventDec= ruleEventDec EOF ;
    public final EObject entryRuleEventDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDec = null;


        try {
            // InternalErrorModel.g:410:49: (iv_ruleEventDec= ruleEventDec EOF )
            // InternalErrorModel.g:411:2: iv_ruleEventDec= ruleEventDec EOF
            {
             newCompositeNode(grammarAccess.getEventDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventDec=ruleEventDec();

            state._fsp--;

             current =iv_ruleEventDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDec"


    // $ANTLR start "ruleEventDec"
    // InternalErrorModel.g:417:1: ruleEventDec returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleEventDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_Features_3_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:423:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) )
            // InternalErrorModel.g:424:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            {
            // InternalErrorModel.g:424:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            // InternalErrorModel.g:425:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDecAccess().getTransitionKeyword_0());
            		
            // InternalErrorModel.g:429:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:430:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:430:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:431:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEventDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEventDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalErrorModel.g:452:3: ( (lv_Features_3_0= ruleTransitionFeatureDec ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==17||LA5_0==20||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalErrorModel.g:453:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    {
            	    // InternalErrorModel.g:453:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    // InternalErrorModel.g:454:5: lv_Features_3_0= ruleTransitionFeatureDec
            	    {

            	    					newCompositeNode(grammarAccess.getEventDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_Features_3_0=ruleTransitionFeatureDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Features",
            	    						lv_Features_3_0,
            	    						"hu.bme.mit.ErrorModel.TransitionFeatureDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEventDecAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDec"


    // $ANTLR start "entryRuleTransitionFeatureDec"
    // InternalErrorModel.g:479:1: entryRuleTransitionFeatureDec returns [EObject current=null] : iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF ;
    public final EObject entryRuleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFeatureDec = null;


        try {
            // InternalErrorModel.g:479:61: (iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF )
            // InternalErrorModel.g:480:2: iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF
            {
             newCompositeNode(grammarAccess.getTransitionFeatureDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionFeatureDec=ruleTransitionFeatureDec();

            state._fsp--;

             current =iv_ruleTransitionFeatureDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionFeatureDec"


    // $ANTLR start "ruleTransitionFeatureDec"
    // InternalErrorModel.g:486:1: ruleTransitionFeatureDec returns [EObject current=null] : (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec ) ;
    public final EObject ruleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionState_0 = null;

        EObject this_TriggerDec_1 = null;

        EObject this_ActionDec_2 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:492:2: ( (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec ) )
            // InternalErrorModel.g:493:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec )
            {
            // InternalErrorModel.g:493:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalErrorModel.g:494:3: this_TransitionState_0= ruleTransitionState
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTransitionStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransitionState_0=ruleTransitionState();

                    state._fsp--;


                    			current = this_TransitionState_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalErrorModel.g:503:3: this_TriggerDec_1= ruleTriggerDec
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTriggerDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerDec_1=ruleTriggerDec();

                    state._fsp--;


                    			current = this_TriggerDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalErrorModel.g:512:3: this_ActionDec_2= ruleActionDec
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getActionDecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionDec_2=ruleActionDec();

                    state._fsp--;


                    			current = this_ActionDec_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalErrorModel.g:521:3: ruleOccurenceDec
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getOccurenceDecParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleOccurenceDec();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionFeatureDec"


    // $ANTLR start "entryRuleTriggerDec"
    // InternalErrorModel.g:532:1: entryRuleTriggerDec returns [EObject current=null] : iv_ruleTriggerDec= ruleTriggerDec EOF ;
    public final EObject entryRuleTriggerDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDec = null;


        try {
            // InternalErrorModel.g:532:51: (iv_ruleTriggerDec= ruleTriggerDec EOF )
            // InternalErrorModel.g:533:2: iv_ruleTriggerDec= ruleTriggerDec EOF
            {
             newCompositeNode(grammarAccess.getTriggerDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerDec=ruleTriggerDec();

            state._fsp--;

             current =iv_ruleTriggerDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerDec"


    // $ANTLR start "ruleTriggerDec"
    // InternalErrorModel.g:539:1: ruleTriggerDec returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleTriggerDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:545:2: ( (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalErrorModel.g:546:2: (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalErrorModel.g:546:2: (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalErrorModel.g:547:3: otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDecAccess().getTriggerKeyword_0());
            		
            // InternalErrorModel.g:551:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:552:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:552:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:553:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTriggerDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerDec"


    // $ANTLR start "entryRuleActionDec"
    // InternalErrorModel.g:574:1: entryRuleActionDec returns [EObject current=null] : iv_ruleActionDec= ruleActionDec EOF ;
    public final EObject entryRuleActionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDec = null;


        try {
            // InternalErrorModel.g:574:50: (iv_ruleActionDec= ruleActionDec EOF )
            // InternalErrorModel.g:575:2: iv_ruleActionDec= ruleActionDec EOF
            {
             newCompositeNode(grammarAccess.getActionDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDec=ruleActionDec();

            state._fsp--;

             current =iv_ruleActionDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionDec"


    // $ANTLR start "ruleActionDec"
    // InternalErrorModel.g:581:1: ruleActionDec returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleActionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:587:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalErrorModel.g:588:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalErrorModel.g:588:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalErrorModel.g:589:3: otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDecAccess().getActionKeyword_0());
            		
            // InternalErrorModel.g:593:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:594:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:594:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:595:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getActionDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionDec"


    // $ANTLR start "entryRuleOccurenceDec"
    // InternalErrorModel.g:616:1: entryRuleOccurenceDec returns [String current=null] : iv_ruleOccurenceDec= ruleOccurenceDec EOF ;
    public final String entryRuleOccurenceDec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOccurenceDec = null;


        try {
            // InternalErrorModel.g:616:52: (iv_ruleOccurenceDec= ruleOccurenceDec EOF )
            // InternalErrorModel.g:617:2: iv_ruleOccurenceDec= ruleOccurenceDec EOF
            {
             newCompositeNode(grammarAccess.getOccurenceDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurenceDec=ruleOccurenceDec();

            state._fsp--;

             current =iv_ruleOccurenceDec.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurenceDec"


    // $ANTLR start "ruleOccurenceDec"
    // InternalErrorModel.g:623:1: ruleOccurenceDec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleOccurenceDec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DOUBLE_1 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:629:2: ( (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE ) )
            // InternalErrorModel.g:630:2: (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE )
            {
            // InternalErrorModel.g:630:2: (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE )
            // InternalErrorModel.g:631:3: kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE
            {
            kw=(Token)match(input,20,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOccurenceDecAccess().getOccurrenceKeyword_0());
            		

            			newCompositeNode(grammarAccess.getOccurenceDecAccess().getDOUBLEParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_DOUBLE_1=ruleDOUBLE();

            state._fsp--;


            			current.merge(this_DOUBLE_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurenceDec"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalErrorModel.g:650:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalErrorModel.g:650:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalErrorModel.g:651:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalErrorModel.g:657:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalErrorModel.g:663:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalErrorModel.g:664:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalErrorModel.g:664:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalErrorModel.g:665:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,21,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleTransitionState"
    // InternalErrorModel.g:688:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalErrorModel.g:688:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalErrorModel.g:689:2: iv_ruleTransitionState= ruleTransitionState EOF
            {
             newCompositeNode(grammarAccess.getTransitionStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionState=ruleTransitionState();

            state._fsp--;

             current =iv_ruleTransitionState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionState"


    // $ANTLR start "ruleTransitionState"
    // InternalErrorModel.g:695:1: ruleTransitionState returns [EObject current=null] : (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalErrorModel.g:701:2: ( (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalErrorModel.g:702:2: (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalErrorModel.g:702:2: (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalErrorModel.g:703:3: otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getColonKeyword_1());
            		
            // InternalErrorModel.g:711:3: ( (otherlv_2= RULE_ID ) )
            // InternalErrorModel.g:712:4: (otherlv_2= RULE_ID )
            {
            // InternalErrorModel.g:712:4: (otherlv_2= RULE_ID )
            // InternalErrorModel.g:713:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalErrorModel.g:728:3: ( (otherlv_4= RULE_ID ) )
            // InternalErrorModel.g:729:4: (otherlv_4= RULE_ID )
            {
            // InternalErrorModel.g:729:4: (otherlv_4= RULE_ID )
            // InternalErrorModel.g:730:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionStateAccess().getTargetStateStateDecCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionState"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalErrorModel.g:745:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalErrorModel.g:745:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalErrorModel.g:746:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalErrorModel.g:752:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalErrorModel.g:758:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalErrorModel.g:759:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalErrorModel.g:759:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalErrorModel.g:760:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalErrorModel.g:767:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalErrorModel.g:768:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000D6000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000052A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});

}