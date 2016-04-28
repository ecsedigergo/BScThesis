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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDepModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'port'", "'type'", "'{'", "'}'", "'error'", "'mode'", "'model'", "'state'", "'transition'", "'states'", "':'", "'->'", "'trigger'", "'action'", "'occurrence'", "'.'", "'system'", "'connection'", "'from'", "'to'", "'declaration'", "'in'", "'out'", "'component'", "'implementation'", "'instance'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDepModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDepModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDepModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDepModel.g"; }



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




    // $ANTLR start "entryRuleDepModel"
    // InternalDepModel.g:64:1: entryRuleDepModel returns [EObject current=null] : iv_ruleDepModel= ruleDepModel EOF ;
    public final EObject entryRuleDepModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepModel = null;


        try {
            // InternalDepModel.g:64:49: (iv_ruleDepModel= ruleDepModel EOF )
            // InternalDepModel.g:65:2: iv_ruleDepModel= ruleDepModel EOF
            {
             newCompositeNode(grammarAccess.getDepModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepModel=ruleDepModel();

            state._fsp--;

             current =iv_ruleDepModel; 
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
    // $ANTLR end "entryRuleDepModel"


    // $ANTLR start "ruleDepModel"
    // InternalDepModel.g:71:1: ruleDepModel returns [EObject current=null] : ( (lv_depmodels_0_0= ruleabstractModelDec ) )* ;
    public final EObject ruleDepModel() throws RecognitionException {
        EObject current = null;

        EObject lv_depmodels_0_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:77:2: ( ( (lv_depmodels_0_0= ruleabstractModelDec ) )* )
            // InternalDepModel.g:78:2: ( (lv_depmodels_0_0= ruleabstractModelDec ) )*
            {
            // InternalDepModel.g:78:2: ( (lv_depmodels_0_0= ruleabstractModelDec ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDepModel.g:79:3: (lv_depmodels_0_0= ruleabstractModelDec )
            	    {
            	    // InternalDepModel.g:79:3: (lv_depmodels_0_0= ruleabstractModelDec )
            	    // InternalDepModel.g:80:4: lv_depmodels_0_0= ruleabstractModelDec
            	    {

            	    				newCompositeNode(grammarAccess.getDepModelAccess().getDepmodelsAbstractModelDecParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_depmodels_0_0=ruleabstractModelDec();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDepModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"depmodels",
            	    					lv_depmodels_0_0,
            	    					"hu.bme.mit.DepModel.abstractModelDec");
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
    // $ANTLR end "ruleDepModel"


    // $ANTLR start "entryRuleabstractModelDec"
    // InternalDepModel.g:100:1: entryRuleabstractModelDec returns [EObject current=null] : iv_ruleabstractModelDec= ruleabstractModelDec EOF ;
    public final EObject entryRuleabstractModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleabstractModelDec = null;


        try {
            // InternalDepModel.g:100:57: (iv_ruleabstractModelDec= ruleabstractModelDec EOF )
            // InternalDepModel.g:101:2: iv_ruleabstractModelDec= ruleabstractModelDec EOF
            {
             newCompositeNode(grammarAccess.getAbstractModelDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleabstractModelDec=ruleabstractModelDec();

            state._fsp--;

             current =iv_ruleabstractModelDec; 
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
    // $ANTLR end "entryRuleabstractModelDec"


    // $ANTLR start "ruleabstractModelDec"
    // InternalDepModel.g:107:1: ruleabstractModelDec returns [EObject current=null] : (this_ComponentModel_0= ruleComponentModel | this_ErrorModel_1= ruleErrorModel | this_PortType_2= rulePortType ) ;
    public final EObject ruleabstractModelDec() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentModel_0 = null;

        EObject this_ErrorModel_1 = null;

        EObject this_PortType_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:113:2: ( (this_ComponentModel_0= ruleComponentModel | this_ErrorModel_1= ruleErrorModel | this_PortType_2= rulePortType ) )
            // InternalDepModel.g:114:2: (this_ComponentModel_0= ruleComponentModel | this_ErrorModel_1= ruleErrorModel | this_PortType_2= rulePortType )
            {
            // InternalDepModel.g:114:2: (this_ComponentModel_0= ruleComponentModel | this_ErrorModel_1= ruleErrorModel | this_PortType_2= rulePortType )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDepModel.g:115:3: this_ComponentModel_0= ruleComponentModel
                    {

                    			newCompositeNode(grammarAccess.getAbstractModelDecAccess().getComponentModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentModel_0=ruleComponentModel();

                    state._fsp--;


                    			current = this_ComponentModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:124:3: this_ErrorModel_1= ruleErrorModel
                    {

                    			newCompositeNode(grammarAccess.getAbstractModelDecAccess().getErrorModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorModel_1=ruleErrorModel();

                    state._fsp--;


                    			current = this_ErrorModel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDepModel.g:133:3: this_PortType_2= rulePortType
                    {

                    			newCompositeNode(grammarAccess.getAbstractModelDecAccess().getPortTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortType_2=rulePortType();

                    state._fsp--;


                    			current = this_PortType_2;
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
    // $ANTLR end "ruleabstractModelDec"


    // $ANTLR start "entryRulePortType"
    // InternalDepModel.g:145:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDepModel.g:145:49: (iv_rulePortType= rulePortType EOF )
            // InternalDepModel.g:146:2: iv_rulePortType= rulePortType EOF
            {
             newCompositeNode(grammarAccess.getPortTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortType=rulePortType();

            state._fsp--;

             current =iv_rulePortType; 
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
    // $ANTLR end "entryRulePortType"


    // $ANTLR start "rulePortType"
    // InternalDepModel.g:152:1: rulePortType returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleerrorModes ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_eModes_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:158:2: ( (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleerrorModes ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:159:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleerrorModes ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:159:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleerrorModes ) )* otherlv_5= '}' )
            // InternalDepModel.g:160:3: otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleerrorModes ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:168:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:169:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:169:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:170:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPortTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:190:3: ( (lv_eModes_4_0= ruleerrorModes ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDepModel.g:191:4: (lv_eModes_4_0= ruleerrorModes )
            	    {
            	    // InternalDepModel.g:191:4: (lv_eModes_4_0= ruleerrorModes )
            	    // InternalDepModel.g:192:5: lv_eModes_4_0= ruleerrorModes
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_eModes_4_0=ruleerrorModes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            	    					}
            	    					set(
            	    						current,
            	    						"eModes",
            	    						lv_eModes_4_0,
            	    						"hu.bme.mit.DepModel.errorModes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePortType"


    // $ANTLR start "entryRuleerrorModes"
    // InternalDepModel.g:217:1: entryRuleerrorModes returns [EObject current=null] : iv_ruleerrorModes= ruleerrorModes EOF ;
    public final EObject entryRuleerrorModes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleerrorModes = null;


        try {
            // InternalDepModel.g:217:51: (iv_ruleerrorModes= ruleerrorModes EOF )
            // InternalDepModel.g:218:2: iv_ruleerrorModes= ruleerrorModes EOF
            {
             newCompositeNode(grammarAccess.getErrorModesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleerrorModes=ruleerrorModes();

            state._fsp--;

             current =iv_ruleerrorModes; 
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
    // $ANTLR end "entryRuleerrorModes"


    // $ANTLR start "ruleerrorModes"
    // InternalDepModel.g:224:1: ruleerrorModes returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleerrorModes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDepModel.g:230:2: ( (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDepModel.g:231:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDepModel.g:231:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalDepModel.g:232:3: otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModesAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModesAccess().getModeKeyword_1());
            		
            // InternalDepModel.g:240:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:241:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:241:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:242:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getErrorModesAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorModesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleerrorModes"


    // $ANTLR start "entryRuleErrorModel"
    // InternalDepModel.g:262:1: entryRuleErrorModel returns [EObject current=null] : iv_ruleErrorModel= ruleErrorModel EOF ;
    public final EObject entryRuleErrorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModel = null;


        try {
            // InternalDepModel.g:262:51: (iv_ruleErrorModel= ruleErrorModel EOF )
            // InternalDepModel.g:263:2: iv_ruleErrorModel= ruleErrorModel EOF
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
    // InternalDepModel.g:269:1: ruleErrorModel returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleErrorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_emodelElements_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:275:2: ( (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:276:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:276:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' )
            // InternalDepModel.g:277:3: otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModelAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModelAccess().getModelKeyword_1());
            		
            // InternalDepModel.g:285:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:286:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:286:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:287:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getErrorModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getErrorModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:307:3: ( (lv_emodelElements_4_0= ruleEModelElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDepModel.g:308:4: (lv_emodelElements_4_0= ruleEModelElement )
            	    {
            	    // InternalDepModel.g:308:4: (lv_emodelElements_4_0= ruleEModelElement )
            	    // InternalDepModel.g:309:5: lv_emodelElements_4_0= ruleEModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getErrorModelAccess().getEmodelElementsEModelElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_emodelElements_4_0=ruleEModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getErrorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"emodelElements",
            	    						lv_emodelElements_4_0,
            	    						"hu.bme.mit.DepModel.EModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getErrorModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleErrorModel"


    // $ANTLR start "entryRuleEModelElement"
    // InternalDepModel.g:334:1: entryRuleEModelElement returns [EObject current=null] : iv_ruleEModelElement= ruleEModelElement EOF ;
    public final EObject entryRuleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelElement = null;


        try {
            // InternalDepModel.g:334:54: (iv_ruleEModelElement= ruleEModelElement EOF )
            // InternalDepModel.g:335:2: iv_ruleEModelElement= ruleEModelElement EOF
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
    // InternalDepModel.g:341:1: ruleEModelElement returns [EObject current=null] : (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec ) ;
    public final EObject ruleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_StateDec_0 = null;

        EObject this_EventDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:347:2: ( (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec ) )
            // InternalDepModel.g:348:2: (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec )
            {
            // InternalDepModel.g:348:2: (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDepModel.g:349:3: this_StateDec_0= ruleStateDec
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
                    // InternalDepModel.g:358:3: this_EventDec_1= ruleEventDec
                    {

                    			newCompositeNode(grammarAccess.getEModelElementAccess().getEventDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventDec_1=ruleEventDec();

                    state._fsp--;


                    			current = this_EventDec_1;
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


    // $ANTLR start "entryRuleStateDec"
    // InternalDepModel.g:370:1: entryRuleStateDec returns [EObject current=null] : iv_ruleStateDec= ruleStateDec EOF ;
    public final EObject entryRuleStateDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDec = null;


        try {
            // InternalDepModel.g:370:49: (iv_ruleStateDec= ruleStateDec EOF )
            // InternalDepModel.g:371:2: iv_ruleStateDec= ruleStateDec EOF
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
    // InternalDepModel.g:377:1: ruleStateDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStateDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDepModel.g:383:2: ( (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDepModel.g:384:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDepModel.g:384:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalDepModel.g:385:3: otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateDecAccess().getStateKeyword_1());
            		
            // InternalDepModel.g:393:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:394:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:394:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:395:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateDecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalDepModel.g:415:1: entryRuleEventDec returns [EObject current=null] : iv_ruleEventDec= ruleEventDec EOF ;
    public final EObject entryRuleEventDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDec = null;


        try {
            // InternalDepModel.g:415:49: (iv_ruleEventDec= ruleEventDec EOF )
            // InternalDepModel.g:416:2: iv_ruleEventDec= ruleEventDec EOF
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
    // InternalDepModel.g:422:1: ruleEventDec returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleEventDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Features_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:428:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) )
            // InternalDepModel.g:429:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            {
            // InternalDepModel.g:429:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            // InternalDepModel.g:430:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDecAccess().getTransitionKeyword_0());
            		
            // InternalDepModel.g:434:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDepModel.g:435:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDepModel.g:435:4: (lv_name_1_0= RULE_ID )
            // InternalDepModel.g:436:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventDecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEventDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDepModel.g:456:3: ( (lv_Features_3_0= ruleTransitionFeatureDec ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20||(LA6_0>=23 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDepModel.g:457:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    {
            	    // InternalDepModel.g:457:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    // InternalDepModel.g:458:5: lv_Features_3_0= ruleTransitionFeatureDec
            	    {

            	    					newCompositeNode(grammarAccess.getEventDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_Features_3_0=ruleTransitionFeatureDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Features",
            	    						lv_Features_3_0,
            	    						"hu.bme.mit.DepModel.TransitionFeatureDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalDepModel.g:483:1: entryRuleTransitionFeatureDec returns [EObject current=null] : iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF ;
    public final EObject entryRuleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFeatureDec = null;


        try {
            // InternalDepModel.g:483:61: (iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF )
            // InternalDepModel.g:484:2: iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF
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
    // InternalDepModel.g:490:1: ruleTransitionFeatureDec returns [EObject current=null] : (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec ) ;
    public final EObject ruleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionState_0 = null;

        EObject this_TriggerDec_1 = null;

        EObject this_ActionDec_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:496:2: ( (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec ) )
            // InternalDepModel.g:497:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec )
            {
            // InternalDepModel.g:497:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | ruleOccurenceDec )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDepModel.g:498:3: this_TransitionState_0= ruleTransitionState
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
                    // InternalDepModel.g:507:3: this_TriggerDec_1= ruleTriggerDec
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
                    // InternalDepModel.g:516:3: this_ActionDec_2= ruleActionDec
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
                    // InternalDepModel.g:525:3: ruleOccurenceDec
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


    // $ANTLR start "entryRuleTransitionState"
    // InternalDepModel.g:536:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalDepModel.g:536:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalDepModel.g:537:2: iv_ruleTransitionState= ruleTransitionState EOF
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
    // InternalDepModel.g:543:1: ruleTransitionState returns [EObject current=null] : (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDepModel.g:549:2: ( (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDepModel.g:550:2: (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDepModel.g:550:2: (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalDepModel.g:551:3: otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getColonKeyword_1());
            		
            // InternalDepModel.g:559:3: ( (otherlv_2= RULE_ID ) )
            // InternalDepModel.g:560:4: (otherlv_2= RULE_ID )
            {
            // InternalDepModel.g:560:4: (otherlv_2= RULE_ID )
            // InternalDepModel.g:561:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalDepModel.g:576:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:577:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:577:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:578:5: otherlv_4= RULE_ID
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


    // $ANTLR start "entryRuleTriggerDec"
    // InternalDepModel.g:593:1: entryRuleTriggerDec returns [EObject current=null] : iv_ruleTriggerDec= ruleTriggerDec EOF ;
    public final EObject entryRuleTriggerDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDec = null;


        try {
            // InternalDepModel.g:593:51: (iv_ruleTriggerDec= ruleTriggerDec EOF )
            // InternalDepModel.g:594:2: iv_ruleTriggerDec= ruleTriggerDec EOF
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
    // InternalDepModel.g:600:1: ruleTriggerDec returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTriggerDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:606:2: ( (otherlv_0= 'trigger' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:607:2: (otherlv_0= 'trigger' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:607:2: (otherlv_0= 'trigger' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:608:3: otherlv_0= 'trigger' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDecAccess().getTriggerKeyword_0());
            		
            // InternalDepModel.g:612:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDepModel.g:613:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDepModel.g:613:4: (lv_name_1_0= RULE_ID )
            // InternalDepModel.g:614:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriggerDecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDepModel.g:630:3: ( (otherlv_2= RULE_ID ) )
            // InternalDepModel.g:631:4: (otherlv_2= RULE_ID )
            {
            // InternalDepModel.g:631:4: (otherlv_2= RULE_ID )
            // InternalDepModel.g:632:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getTriggerDecAccess().getPortTypePortCrossReference_2_0());
            				

            }


            }

            // InternalDepModel.g:643:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:644:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:644:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:645:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTriggerDecAccess().getErrorModeErrorModesCrossReference_3_0());
            				

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
    // InternalDepModel.g:660:1: entryRuleActionDec returns [EObject current=null] : iv_ruleActionDec= ruleActionDec EOF ;
    public final EObject entryRuleActionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDec = null;


        try {
            // InternalDepModel.g:660:50: (iv_ruleActionDec= ruleActionDec EOF )
            // InternalDepModel.g:661:2: iv_ruleActionDec= ruleActionDec EOF
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
    // InternalDepModel.g:667:1: ruleActionDec returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleActionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:673:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:674:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:674:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:675:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDecAccess().getActionKeyword_0());
            		
            // InternalDepModel.g:679:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDepModel.g:680:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDepModel.g:680:4: (lv_name_1_0= RULE_ID )
            // InternalDepModel.g:681:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionDecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDepModel.g:697:3: ( (otherlv_2= RULE_ID ) )
            // InternalDepModel.g:698:4: (otherlv_2= RULE_ID )
            {
            // InternalDepModel.g:698:4: (otherlv_2= RULE_ID )
            // InternalDepModel.g:699:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getActionDecAccess().getPortTypePortCrossReference_2_0());
            				

            }


            }

            // InternalDepModel.g:710:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:711:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:711:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:712:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getActionDecAccess().getErrorModeErrorModesCrossReference_3_0());
            				

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
    // InternalDepModel.g:727:1: entryRuleOccurenceDec returns [String current=null] : iv_ruleOccurenceDec= ruleOccurenceDec EOF ;
    public final String entryRuleOccurenceDec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOccurenceDec = null;


        try {
            // InternalDepModel.g:727:52: (iv_ruleOccurenceDec= ruleOccurenceDec EOF )
            // InternalDepModel.g:728:2: iv_ruleOccurenceDec= ruleOccurenceDec EOF
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
    // InternalDepModel.g:734:1: ruleOccurenceDec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleOccurenceDec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DOUBLE_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:740:2: ( (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE ) )
            // InternalDepModel.g:741:2: (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE )
            {
            // InternalDepModel.g:741:2: (kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE )
            // InternalDepModel.g:742:3: kw= 'occurrence' this_DOUBLE_1= ruleDOUBLE
            {
            kw=(Token)match(input,25,FOLLOW_15); 

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
    // InternalDepModel.g:761:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalDepModel.g:761:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalDepModel.g:762:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalDepModel.g:768:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDepModel.g:774:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDepModel.g:775:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDepModel.g:775:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDepModel.g:776:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,26,FOLLOW_15); 

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


    // $ANTLR start "entryRuleComponentModel"
    // InternalDepModel.g:799:1: entryRuleComponentModel returns [EObject current=null] : iv_ruleComponentModel= ruleComponentModel EOF ;
    public final EObject entryRuleComponentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModel = null;


        try {
            // InternalDepModel.g:799:55: (iv_ruleComponentModel= ruleComponentModel EOF )
            // InternalDepModel.g:800:2: iv_ruleComponentModel= ruleComponentModel EOF
            {
             newCompositeNode(grammarAccess.getComponentModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModel=ruleComponentModel();

            state._fsp--;

             current =iv_ruleComponentModel; 
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
    // $ANTLR end "entryRuleComponentModel"


    // $ANTLR start "ruleComponentModel"
    // InternalDepModel.g:806:1: ruleComponentModel returns [EObject current=null] : ( (lv_elements_0_0= ruleComponentModelDec ) )+ ;
    public final EObject ruleComponentModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:812:2: ( ( (lv_elements_0_0= ruleComponentModelDec ) )+ )
            // InternalDepModel.g:813:2: ( (lv_elements_0_0= ruleComponentModelDec ) )+
            {
            // InternalDepModel.g:813:2: ( (lv_elements_0_0= ruleComponentModelDec ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDepModel.g:814:3: (lv_elements_0_0= ruleComponentModelDec )
            	    {
            	    // InternalDepModel.g:814:3: (lv_elements_0_0= ruleComponentModelDec )
            	    // InternalDepModel.g:815:4: lv_elements_0_0= ruleComponentModelDec
            	    {

            	    				newCompositeNode(grammarAccess.getComponentModelAccess().getElementsComponentModelDecParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_elements_0_0=ruleComponentModelDec();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getComponentModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"hu.bme.mit.DepModel.ComponentModelDec");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleComponentModel"


    // $ANTLR start "entryRuleComponentModelDec"
    // InternalDepModel.g:835:1: entryRuleComponentModelDec returns [EObject current=null] : iv_ruleComponentModelDec= ruleComponentModelDec EOF ;
    public final EObject entryRuleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModelDec = null;


        try {
            // InternalDepModel.g:835:58: (iv_ruleComponentModelDec= ruleComponentModelDec EOF )
            // InternalDepModel.g:836:2: iv_ruleComponentModelDec= ruleComponentModelDec EOF
            {
             newCompositeNode(grammarAccess.getComponentModelDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModelDec=ruleComponentModelDec();

            state._fsp--;

             current =iv_ruleComponentModelDec; 
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
    // $ANTLR end "entryRuleComponentModelDec"


    // $ANTLR start "ruleComponentModelDec"
    // InternalDepModel.g:842:1: ruleComponentModelDec returns [EObject current=null] : (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec ) ;
    public final EObject ruleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemDec_0 = null;

        EObject this_SystemConnDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:848:2: ( (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec ) )
            // InternalDepModel.g:849:2: (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec )
            {
            // InternalDepModel.g:849:2: (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==31) ) {
                    alt9=1;
                }
                else if ( (LA9_1==28) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDepModel.g:850:3: this_SystemDec_0= ruleSystemDec
                    {

                    			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemDec_0=ruleSystemDec();

                    state._fsp--;


                    			current = this_SystemDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:859:3: this_SystemConnDec_1= ruleSystemConnDec
                    {

                    			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemConnDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemConnDec_1=ruleSystemConnDec();

                    state._fsp--;


                    			current = this_SystemConnDec_1;
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
    // $ANTLR end "ruleComponentModelDec"


    // $ANTLR start "entryRuleSystemConnDec"
    // InternalDepModel.g:871:1: entryRuleSystemConnDec returns [EObject current=null] : iv_ruleSystemConnDec= ruleSystemConnDec EOF ;
    public final EObject entryRuleSystemConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConnDec = null;


        try {
            // InternalDepModel.g:871:54: (iv_ruleSystemConnDec= ruleSystemConnDec EOF )
            // InternalDepModel.g:872:2: iv_ruleSystemConnDec= ruleSystemConnDec EOF
            {
             newCompositeNode(grammarAccess.getSystemConnDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemConnDec=ruleSystemConnDec();

            state._fsp--;

             current =iv_ruleSystemConnDec; 
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
    // $ANTLR end "entryRuleSystemConnDec"


    // $ANTLR start "ruleSystemConnDec"
    // InternalDepModel.g:878:1: ruleSystemConnDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleSystemConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalDepModel.g:884:2: ( (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDepModel.g:885:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDepModel.g:885:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalDepModel.g:886:3: otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1());
            		
            // InternalDepModel.g:894:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:895:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:895:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:896:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemConnDecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getFromKeyword_3());
            		
            // InternalDepModel.g:916:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:917:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:917:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:918:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5());
            		
            // InternalDepModel.g:933:3: ( (otherlv_6= RULE_ID ) )
            // InternalDepModel.g:934:4: (otherlv_6= RULE_ID )
            {
            // InternalDepModel.g:934:4: (otherlv_6= RULE_ID )
            // InternalDepModel.g:935:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getToKeyword_7());
            		
            // InternalDepModel.g:950:3: ( (otherlv_8= RULE_ID ) )
            // InternalDepModel.g:951:4: (otherlv_8= RULE_ID )
            {
            // InternalDepModel.g:951:4: (otherlv_8= RULE_ID )
            // InternalDepModel.g:952:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9());
            		
            // InternalDepModel.g:967:3: ( (otherlv_10= RULE_ID ) )
            // InternalDepModel.g:968:4: (otherlv_10= RULE_ID )
            {
            // InternalDepModel.g:968:4: (otherlv_10= RULE_ID )
            // InternalDepModel.g:969:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_10_0());
            				

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
    // $ANTLR end "ruleSystemConnDec"


    // $ANTLR start "entryRuleSystemDec"
    // InternalDepModel.g:984:1: entryRuleSystemDec returns [EObject current=null] : iv_ruleSystemDec= ruleSystemDec EOF ;
    public final EObject entryRuleSystemDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDec = null;


        try {
            // InternalDepModel.g:984:50: (iv_ruleSystemDec= ruleSystemDec EOF )
            // InternalDepModel.g:985:2: iv_ruleSystemDec= ruleSystemDec EOF
            {
             newCompositeNode(grammarAccess.getSystemDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDec=ruleSystemDec();

            state._fsp--;

             current =iv_ruleSystemDec; 
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
    // $ANTLR end "entryRuleSystemDec"


    // $ANTLR start "ruleSystemDec"
    // InternalDepModel.g:991:1: ruleSystemDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sysFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:997:2: ( (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:998:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:998:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' )
            // InternalDepModel.g:999:3: otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemDecAccess().getDeclarationKeyword_1());
            		
            // InternalDepModel.g:1007:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:1008:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:1008:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:1009:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemDecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:1029:3: ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDepModel.g:1030:4: (lv_sysFeatures_4_0= ruleAbstractFeatures )
            	    {
            	    // InternalDepModel.g:1030:4: (lv_sysFeatures_4_0= ruleAbstractFeatures )
            	    // InternalDepModel.g:1031:5: lv_sysFeatures_4_0= ruleAbstractFeatures
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_sysFeatures_4_0=ruleAbstractFeatures();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sysFeatures",
            	    						lv_sysFeatures_4_0,
            	    						"hu.bme.mit.DepModel.AbstractFeatures");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSystemDec"


    // $ANTLR start "entryRuleAbstractFeatures"
    // InternalDepModel.g:1056:1: entryRuleAbstractFeatures returns [EObject current=null] : iv_ruleAbstractFeatures= ruleAbstractFeatures EOF ;
    public final EObject entryRuleAbstractFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFeatures = null;


        try {
            // InternalDepModel.g:1056:57: (iv_ruleAbstractFeatures= ruleAbstractFeatures EOF )
            // InternalDepModel.g:1057:2: iv_ruleAbstractFeatures= ruleAbstractFeatures EOF
            {
             newCompositeNode(grammarAccess.getAbstractFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractFeatures=ruleAbstractFeatures();

            state._fsp--;

             current =iv_ruleAbstractFeatures; 
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
    // $ANTLR end "entryRuleAbstractFeatures"


    // $ANTLR start "ruleAbstractFeatures"
    // InternalDepModel.g:1063:1: ruleAbstractFeatures returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec ) ;
    public final EObject ruleAbstractFeatures() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_ComponentImpl_1 = null;

        EObject this_CompConnDec_2 = null;

        EObject this_SystemPortDec_3 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1069:2: ( (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec ) )
            // InternalDepModel.g:1070:2: (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec )
            {
            // InternalDepModel.g:1070:2: (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt11=3;
                    }
                    break;
                case 35:
                    {
                    alt11=2;
                    }
                    break;
                case 12:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==27) ) {
                alt11=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDepModel.g:1071:3: this_ComponentType_0= ruleComponentType
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getComponentTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentType_0=ruleComponentType();

                    state._fsp--;


                    			current = this_ComponentType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1080:3: this_ComponentImpl_1= ruleComponentImpl
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getComponentImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentImpl_1=ruleComponentImpl();

                    state._fsp--;


                    			current = this_ComponentImpl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDepModel.g:1089:3: this_CompConnDec_2= ruleCompConnDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getCompConnDecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompConnDec_2=ruleCompConnDec();

                    state._fsp--;


                    			current = this_CompConnDec_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDepModel.g:1098:3: this_SystemPortDec_3= ruleSystemPortDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortDec_3=ruleSystemPortDec();

                    state._fsp--;


                    			current = this_SystemPortDec_3;
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
    // $ANTLR end "ruleAbstractFeatures"


    // $ANTLR start "entryRuleSystemPortDec"
    // InternalDepModel.g:1110:1: entryRuleSystemPortDec returns [EObject current=null] : iv_ruleSystemPortDec= ruleSystemPortDec EOF ;
    public final EObject entryRuleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortDec = null;


        try {
            // InternalDepModel.g:1110:54: (iv_ruleSystemPortDec= ruleSystemPortDec EOF )
            // InternalDepModel.g:1111:2: iv_ruleSystemPortDec= ruleSystemPortDec EOF
            {
             newCompositeNode(grammarAccess.getSystemPortDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPortDec=ruleSystemPortDec();

            state._fsp--;

             current =iv_ruleSystemPortDec; 
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
    // $ANTLR end "entryRuleSystemPortDec"


    // $ANTLR start "ruleSystemPortDec"
    // InternalDepModel.g:1117:1: ruleSystemPortDec returns [EObject current=null] : (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) ;
    public final EObject ruleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortIn_0 = null;

        EObject this_SystemPortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1123:2: ( (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) )
            // InternalDepModel.g:1124:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            {
            // InternalDepModel.g:1124:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==11) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==33) ) {
                        alt12=2;
                    }
                    else if ( (LA12_2==32) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDepModel.g:1125:3: this_SystemPortIn_0= ruleSystemPortIn
                    {

                    			newCompositeNode(grammarAccess.getSystemPortDecAccess().getSystemPortInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortIn_0=ruleSystemPortIn();

                    state._fsp--;


                    			current = this_SystemPortIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1134:3: this_SystemPortOut_1= ruleSystemPortOut
                    {

                    			newCompositeNode(grammarAccess.getSystemPortDecAccess().getSystemPortOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortOut_1=ruleSystemPortOut();

                    state._fsp--;


                    			current = this_SystemPortOut_1;
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
    // $ANTLR end "ruleSystemPortDec"


    // $ANTLR start "entryRuleSystemPortIn"
    // InternalDepModel.g:1146:1: entryRuleSystemPortIn returns [EObject current=null] : iv_ruleSystemPortIn= ruleSystemPortIn EOF ;
    public final EObject entryRuleSystemPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortIn = null;


        try {
            // InternalDepModel.g:1146:53: (iv_ruleSystemPortIn= ruleSystemPortIn EOF )
            // InternalDepModel.g:1147:2: iv_ruleSystemPortIn= ruleSystemPortIn EOF
            {
             newCompositeNode(grammarAccess.getSystemPortInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPortIn=ruleSystemPortIn();

            state._fsp--;

             current =iv_ruleSystemPortIn; 
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
    // $ANTLR end "entryRuleSystemPortIn"


    // $ANTLR start "ruleSystemPortIn"
    // InternalDepModel.g:1153:1: ruleSystemPortIn returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDepModel.g:1159:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:1160:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:1160:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:1161:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:1173:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDepModel.g:1174:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDepModel.g:1174:4: (lv_name_3_0= RULE_ID )
            // InternalDepModel.g:1175:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSystemPortInAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getToKeyword_4());
            		
            // InternalDepModel.g:1195:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1196:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1196:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1197:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortInAccess().getFullStopKeyword_6());
            		
            // InternalDepModel.g:1212:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:1213:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:1213:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:1214:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_7_0());
            				

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
    // $ANTLR end "ruleSystemPortIn"


    // $ANTLR start "entryRuleSystemPortOut"
    // InternalDepModel.g:1229:1: entryRuleSystemPortOut returns [EObject current=null] : iv_ruleSystemPortOut= ruleSystemPortOut EOF ;
    public final EObject entryRuleSystemPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortOut = null;


        try {
            // InternalDepModel.g:1229:54: (iv_ruleSystemPortOut= ruleSystemPortOut EOF )
            // InternalDepModel.g:1230:2: iv_ruleSystemPortOut= ruleSystemPortOut EOF
            {
             newCompositeNode(grammarAccess.getSystemPortOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPortOut=ruleSystemPortOut();

            state._fsp--;

             current =iv_ruleSystemPortOut; 
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
    // $ANTLR end "entryRuleSystemPortOut"


    // $ANTLR start "ruleSystemPortOut"
    // InternalDepModel.g:1236:1: ruleSystemPortOut returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDepModel.g:1242:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:1243:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:1243:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:1244:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:1256:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDepModel.g:1257:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDepModel.g:1257:4: (lv_name_3_0= RULE_ID )
            // InternalDepModel.g:1258:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSystemPortOutAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFromKeyword_4());
            		
            // InternalDepModel.g:1278:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1279:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1279:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1280:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6());
            		
            // InternalDepModel.g:1295:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:1296:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:1296:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:1297:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_7_0());
            				

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
    // $ANTLR end "ruleSystemPortOut"


    // $ANTLR start "entryRuleCompConnDec"
    // InternalDepModel.g:1312:1: entryRuleCompConnDec returns [EObject current=null] : iv_ruleCompConnDec= ruleCompConnDec EOF ;
    public final EObject entryRuleCompConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompConnDec = null;


        try {
            // InternalDepModel.g:1312:52: (iv_ruleCompConnDec= ruleCompConnDec EOF )
            // InternalDepModel.g:1313:2: iv_ruleCompConnDec= ruleCompConnDec EOF
            {
             newCompositeNode(grammarAccess.getCompConnDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompConnDec=ruleCompConnDec();

            state._fsp--;

             current =iv_ruleCompConnDec; 
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
    // $ANTLR end "entryRuleCompConnDec"


    // $ANTLR start "ruleCompConnDec"
    // InternalDepModel.g:1319:1: ruleCompConnDec returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleCompConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalDepModel.g:1325:2: ( (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDepModel.g:1326:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDepModel.g:1326:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalDepModel.g:1327:3: otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCompConnDecAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCompConnDecAccess().getConnectionKeyword_1());
            		
            // InternalDepModel.g:1335:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:1336:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:1336:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:1337:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompConnDecAccess().getFromKeyword_3());
            		
            // InternalDepModel.g:1357:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:1358:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:1358:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:1359:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCompConnDecAccess().getFullStopKeyword_5());
            		
            // InternalDepModel.g:1374:3: ( (otherlv_6= RULE_ID ) )
            // InternalDepModel.g:1375:4: (otherlv_6= RULE_ID )
            {
            // InternalDepModel.g:1375:4: (otherlv_6= RULE_ID )
            // InternalDepModel.g:1376:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_6, grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getCompConnDecAccess().getToKeyword_7());
            		
            // InternalDepModel.g:1391:3: ( (otherlv_8= RULE_ID ) )
            // InternalDepModel.g:1392:4: (otherlv_8= RULE_ID )
            {
            // InternalDepModel.g:1392:4: (otherlv_8= RULE_ID )
            // InternalDepModel.g:1393:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_8, grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getCompConnDecAccess().getFullStopKeyword_9());
            		
            // InternalDepModel.g:1408:3: ( (otherlv_10= RULE_ID ) )
            // InternalDepModel.g:1409:4: (otherlv_10= RULE_ID )
            {
            // InternalDepModel.g:1409:4: (otherlv_10= RULE_ID )
            // InternalDepModel.g:1410:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_10_0());
            				

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
    // $ANTLR end "ruleCompConnDec"


    // $ANTLR start "entryRuleComponentImpl"
    // InternalDepModel.g:1425:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalDepModel.g:1425:54: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalDepModel.g:1426:2: iv_ruleComponentImpl= ruleComponentImpl EOF
            {
             newCompositeNode(grammarAccess.getComponentImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentImpl=ruleComponentImpl();

            state._fsp--;

             current =iv_ruleComponentImpl; 
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
    // $ANTLR end "entryRuleComponentImpl"


    // $ANTLR start "ruleComponentImpl"
    // InternalDepModel.g:1432:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDepModel.g:1438:2: ( (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDepModel.g:1439:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDepModel.g:1439:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalDepModel.g:1440:3: otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentImplAccess().getImplementationKeyword_1());
            		
            // InternalDepModel.g:1448:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:1449:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:1449:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:1450:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentImplAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getColonKeyword_3());
            		
            // InternalDepModel.g:1470:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:1471:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:1471:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:1472:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentImplRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_4_0());
            				

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
    // $ANTLR end "ruleComponentImpl"


    // $ANTLR start "entryRuleComponentType"
    // InternalDepModel.g:1487:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDepModel.g:1487:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDepModel.g:1488:2: iv_ruleComponentType= ruleComponentType EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentType=ruleComponentType();

            state._fsp--;

             current =iv_ruleComponentType; 
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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalDepModel.g:1494:1: ruleComponentType returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_compFeatures_4_0= rulePort ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_compFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1500:2: ( (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_compFeatures_4_0= rulePort ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:1501:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_compFeatures_4_0= rulePort ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:1501:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_compFeatures_4_0= rulePort ) )* otherlv_5= '}' )
            // InternalDepModel.g:1502:3: otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_compFeatures_4_0= rulePort ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:1510:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:1511:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:1511:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:1512:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:1532:3: ( (lv_compFeatures_4_0= rulePort ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDepModel.g:1533:4: (lv_compFeatures_4_0= rulePort )
            	    {
            	    // InternalDepModel.g:1533:4: (lv_compFeatures_4_0= rulePort )
            	    // InternalDepModel.g:1534:5: lv_compFeatures_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getComponentTypeAccess().getCompFeaturesPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_compFeatures_4_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"compFeatures",
            	    						lv_compFeatures_4_0,
            	    						"hu.bme.mit.DepModel.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRulePort"
    // InternalDepModel.g:1559:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDepModel.g:1559:45: (iv_rulePort= rulePort EOF )
            // InternalDepModel.g:1560:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDepModel.g:1566:1: rulePort returns [EObject current=null] : (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_InPort_0 = null;

        EObject this_OutPort_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1572:2: ( (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) )
            // InternalDepModel.g:1573:2: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            {
            // InternalDepModel.g:1573:2: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==36) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==33) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==32) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDepModel.g:1574:3: this_InPort_0= ruleInPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getInPortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InPort_0=ruleInPort();

                    state._fsp--;


                    			current = this_InPort_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1583:3: this_OutPort_1= ruleOutPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getOutPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutPort_1=ruleOutPort();

                    state._fsp--;


                    			current = this_OutPort_1;
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleInPort"
    // InternalDepModel.g:1595:1: entryRuleInPort returns [EObject current=null] : iv_ruleInPort= ruleInPort EOF ;
    public final EObject entryRuleInPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPort = null;


        try {
            // InternalDepModel.g:1595:47: (iv_ruleInPort= ruleInPort EOF )
            // InternalDepModel.g:1596:2: iv_ruleInPort= ruleInPort EOF
            {
             newCompositeNode(grammarAccess.getInPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInPort=ruleInPort();

            state._fsp--;

             current =iv_ruleInPort; 
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
    // $ANTLR end "entryRuleInPort"


    // $ANTLR start "ruleInPort"
    // InternalDepModel.g:1602:1: ruleInPort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleInPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDepModel.g:1608:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1609:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1609:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1610:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getInPortAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getInPortAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInPortAccess().getInKeyword_2());
            		
            // InternalDepModel.g:1622:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDepModel.g:1623:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDepModel.g:1623:4: (lv_name_3_0= RULE_ID )
            // InternalDepModel.g:1624:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInPortAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getInPortAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1644:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1645:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1645:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1646:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInPortRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_5_0());
            				

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
    // $ANTLR end "ruleInPort"


    // $ANTLR start "entryRuleOutPort"
    // InternalDepModel.g:1661:1: entryRuleOutPort returns [EObject current=null] : iv_ruleOutPort= ruleOutPort EOF ;
    public final EObject entryRuleOutPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPort = null;


        try {
            // InternalDepModel.g:1661:48: (iv_ruleOutPort= ruleOutPort EOF )
            // InternalDepModel.g:1662:2: iv_ruleOutPort= ruleOutPort EOF
            {
             newCompositeNode(grammarAccess.getOutPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutPort=ruleOutPort();

            state._fsp--;

             current =iv_ruleOutPort; 
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
    // $ANTLR end "entryRuleOutPort"


    // $ANTLR start "ruleOutPort"
    // InternalDepModel.g:1668:1: ruleOutPort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleOutPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDepModel.g:1674:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1675:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1675:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1676:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getOutPortAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getOutPortAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutPortAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:1688:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDepModel.g:1689:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDepModel.g:1689:4: (lv_name_3_0= RULE_ID )
            // InternalDepModel.g:1690:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getOutPortAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getOutPortAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1710:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1711:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1711:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1712:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutPortRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_5_0());
            				

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
    // $ANTLR end "ruleOutPort"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003904000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000408004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});

}