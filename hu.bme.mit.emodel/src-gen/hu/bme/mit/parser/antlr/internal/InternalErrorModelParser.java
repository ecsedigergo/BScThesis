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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'error propagation'", "'from'", "'.'", "'to'", "'error model'", "'{'", "'}'", "'propagation in'", "'->'", "'propagation out'", "'<-'", "'error state'", "'error event'", "'states'", "':'"
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
    public static final int T__25=25;
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
    // InternalErrorModel.g:71:1: ruleErrorModel returns [EObject current=null] : ( (lv_AbstractElement_0_0= ruleError ) )* ;
    public final EObject ruleErrorModel() throws RecognitionException {
        EObject current = null;

        EObject lv_AbstractElement_0_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:77:2: ( ( (lv_AbstractElement_0_0= ruleError ) )* )
            // InternalErrorModel.g:78:2: ( (lv_AbstractElement_0_0= ruleError ) )*
            {
            // InternalErrorModel.g:78:2: ( (lv_AbstractElement_0_0= ruleError ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalErrorModel.g:79:3: (lv_AbstractElement_0_0= ruleError )
            	    {
            	    // InternalErrorModel.g:79:3: (lv_AbstractElement_0_0= ruleError )
            	    // InternalErrorModel.g:80:4: lv_AbstractElement_0_0= ruleError
            	    {

            	    				newCompositeNode(grammarAccess.getErrorModelAccess().getAbstractElementErrorParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_AbstractElement_0_0=ruleError();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getErrorModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"AbstractElement",
            	    					lv_AbstractElement_0_0,
            	    					"hu.bme.mit.ErrorModel.Error");
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


    // $ANTLR start "entryRuleError"
    // InternalErrorModel.g:100:1: entryRuleError returns [EObject current=null] : iv_ruleError= ruleError EOF ;
    public final EObject entryRuleError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleError = null;


        try {
            // InternalErrorModel.g:100:46: (iv_ruleError= ruleError EOF )
            // InternalErrorModel.g:101:2: iv_ruleError= ruleError EOF
            {
             newCompositeNode(grammarAccess.getErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleError=ruleError();

            state._fsp--;

             current =iv_ruleError; 
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
    // $ANTLR end "entryRuleError"


    // $ANTLR start "ruleError"
    // InternalErrorModel.g:107:1: ruleError returns [EObject current=null] : (this_EModelDec_0= ruleEModelDec | this_EPropagationDec_1= ruleEPropagationDec ) ;
    public final EObject ruleError() throws RecognitionException {
        EObject current = null;

        EObject this_EModelDec_0 = null;

        EObject this_EPropagationDec_1 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:113:2: ( (this_EModelDec_0= ruleEModelDec | this_EPropagationDec_1= ruleEPropagationDec ) )
            // InternalErrorModel.g:114:2: (this_EModelDec_0= ruleEModelDec | this_EPropagationDec_1= ruleEPropagationDec )
            {
            // InternalErrorModel.g:114:2: (this_EModelDec_0= ruleEModelDec | this_EPropagationDec_1= ruleEPropagationDec )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalErrorModel.g:115:3: this_EModelDec_0= ruleEModelDec
                    {

                    			newCompositeNode(grammarAccess.getErrorAccess().getEModelDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EModelDec_0=ruleEModelDec();

                    state._fsp--;


                    			current = this_EModelDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalErrorModel.g:124:3: this_EPropagationDec_1= ruleEPropagationDec
                    {

                    			newCompositeNode(grammarAccess.getErrorAccess().getEPropagationDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPropagationDec_1=ruleEPropagationDec();

                    state._fsp--;


                    			current = this_EPropagationDec_1;
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
    // $ANTLR end "ruleError"


    // $ANTLR start "entryRuleEPropagationDec"
    // InternalErrorModel.g:136:1: entryRuleEPropagationDec returns [EObject current=null] : iv_ruleEPropagationDec= ruleEPropagationDec EOF ;
    public final EObject entryRuleEPropagationDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropagationDec = null;


        try {
            // InternalErrorModel.g:136:56: (iv_ruleEPropagationDec= ruleEPropagationDec EOF )
            // InternalErrorModel.g:137:2: iv_ruleEPropagationDec= ruleEPropagationDec EOF
            {
             newCompositeNode(grammarAccess.getEPropagationDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropagationDec=ruleEPropagationDec();

            state._fsp--;

             current =iv_ruleEPropagationDec; 
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
    // $ANTLR end "entryRuleEPropagationDec"


    // $ANTLR start "ruleEPropagationDec"
    // InternalErrorModel.g:143:1: ruleEPropagationDec returns [EObject current=null] : (otherlv_0= 'error propagation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleEPropagationDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:149:2: ( (otherlv_0= 'error propagation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalErrorModel.g:150:2: (otherlv_0= 'error propagation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalErrorModel.g:150:2: (otherlv_0= 'error propagation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) )
            // InternalErrorModel.g:151:3: otherlv_0= 'error propagation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEPropagationDecAccess().getErrorPropagationKeyword_0());
            		
            // InternalErrorModel.g:155:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:156:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:156:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:157:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEPropagationDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPropagationDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ErrorModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEPropagationDecAccess().getFromKeyword_2());
            		
            // InternalErrorModel.g:178:3: ( (otherlv_3= RULE_ID ) )
            // InternalErrorModel.g:179:4: (otherlv_3= RULE_ID )
            {
            // InternalErrorModel.g:179:4: (otherlv_3= RULE_ID )
            // InternalErrorModel.g:180:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropagationDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getEPropagationDecAccess().getSourceModelEModelDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getEPropagationDecAccess().getFullStopKeyword_4());
            		
            // InternalErrorModel.g:195:3: ( (otherlv_5= RULE_ID ) )
            // InternalErrorModel.g:196:4: (otherlv_5= RULE_ID )
            {
            // InternalErrorModel.g:196:4: (otherlv_5= RULE_ID )
            // InternalErrorModel.g:197:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropagationDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getEPropagationDecAccess().getSourcePropOutPropDecCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEPropagationDecAccess().getToKeyword_6());
            		
            // InternalErrorModel.g:212:3: ( (otherlv_7= RULE_ID ) )
            // InternalErrorModel.g:213:4: (otherlv_7= RULE_ID )
            {
            // InternalErrorModel.g:213:4: (otherlv_7= RULE_ID )
            // InternalErrorModel.g:214:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropagationDecRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_7, grammarAccess.getEPropagationDecAccess().getTargetModelEModelDecCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getEPropagationDecAccess().getFullStopKeyword_8());
            		
            // InternalErrorModel.g:229:3: ( (otherlv_9= RULE_ID ) )
            // InternalErrorModel.g:230:4: (otherlv_9= RULE_ID )
            {
            // InternalErrorModel.g:230:4: (otherlv_9= RULE_ID )
            // InternalErrorModel.g:231:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropagationDecRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getEPropagationDecAccess().getTargetPropInPropDecCrossReference_9_0());
            				

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
    // $ANTLR end "ruleEPropagationDec"


    // $ANTLR start "entryRuleEModelDec"
    // InternalErrorModel.g:246:1: entryRuleEModelDec returns [EObject current=null] : iv_ruleEModelDec= ruleEModelDec EOF ;
    public final EObject entryRuleEModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelDec = null;


        try {
            // InternalErrorModel.g:246:50: (iv_ruleEModelDec= ruleEModelDec EOF )
            // InternalErrorModel.g:247:2: iv_ruleEModelDec= ruleEModelDec EOF
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
    // InternalErrorModel.g:253:1: ruleEModelDec returns [EObject current=null] : (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModelDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_emodelElements_3_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:259:2: ( (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' ) )
            // InternalErrorModel.g:260:2: (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' )
            {
            // InternalErrorModel.g:260:2: (otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}' )
            // InternalErrorModel.g:261:3: otherlv_0= 'error model' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_emodelElements_3_0= ruleEModelElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEModelDecAccess().getErrorModelKeyword_0());
            		
            // InternalErrorModel.g:265:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:266:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:266:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:267:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEModelDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEModelDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalErrorModel.g:288:3: ( (lv_emodelElements_3_0= ruleEModelElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==20||(LA3_0>=22 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalErrorModel.g:289:4: (lv_emodelElements_3_0= ruleEModelElement )
            	    {
            	    // InternalErrorModel.g:289:4: (lv_emodelElements_3_0= ruleEModelElement )
            	    // InternalErrorModel.g:290:5: lv_emodelElements_3_0= ruleEModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getEModelDecAccess().getEmodelElementsEModelElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalErrorModel.g:315:1: entryRuleEModelElement returns [EObject current=null] : iv_ruleEModelElement= ruleEModelElement EOF ;
    public final EObject entryRuleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelElement = null;


        try {
            // InternalErrorModel.g:315:54: (iv_ruleEModelElement= ruleEModelElement EOF )
            // InternalErrorModel.g:316:2: iv_ruleEModelElement= ruleEModelElement EOF
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
    // InternalErrorModel.g:322:1: ruleEModelElement returns [EObject current=null] : (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation ) ;
    public final EObject ruleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_StateDec_0 = null;

        EObject this_EventDec_1 = null;

        EObject this_OuterPropagation_2 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:328:2: ( (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation ) )
            // InternalErrorModel.g:329:2: (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation )
            {
            // InternalErrorModel.g:329:2: (this_StateDec_0= ruleStateDec | this_EventDec_1= ruleEventDec | this_OuterPropagation_2= ruleOuterPropagation )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 18:
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalErrorModel.g:330:3: this_StateDec_0= ruleStateDec
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
                    // InternalErrorModel.g:339:3: this_EventDec_1= ruleEventDec
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
                    // InternalErrorModel.g:348:3: this_OuterPropagation_2= ruleOuterPropagation
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
    // InternalErrorModel.g:360:1: entryRuleOuterPropagation returns [EObject current=null] : iv_ruleOuterPropagation= ruleOuterPropagation EOF ;
    public final EObject entryRuleOuterPropagation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterPropagation = null;


        try {
            // InternalErrorModel.g:360:57: (iv_ruleOuterPropagation= ruleOuterPropagation EOF )
            // InternalErrorModel.g:361:2: iv_ruleOuterPropagation= ruleOuterPropagation EOF
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
    // InternalErrorModel.g:367:1: ruleOuterPropagation returns [EObject current=null] : (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec ) ;
    public final EObject ruleOuterPropagation() throws RecognitionException {
        EObject current = null;

        EObject this_InPropDec_0 = null;

        EObject this_OutPropDec_1 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:373:2: ( (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec ) )
            // InternalErrorModel.g:374:2: (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec )
            {
            // InternalErrorModel.g:374:2: (this_InPropDec_0= ruleInPropDec | this_OutPropDec_1= ruleOutPropDec )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalErrorModel.g:375:3: this_InPropDec_0= ruleInPropDec
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
                    // InternalErrorModel.g:384:3: this_OutPropDec_1= ruleOutPropDec
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
    // InternalErrorModel.g:396:1: entryRuleInPropDec returns [EObject current=null] : iv_ruleInPropDec= ruleInPropDec EOF ;
    public final EObject entryRuleInPropDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPropDec = null;


        try {
            // InternalErrorModel.g:396:50: (iv_ruleInPropDec= ruleInPropDec EOF )
            // InternalErrorModel.g:397:2: iv_ruleInPropDec= ruleInPropDec EOF
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
    // InternalErrorModel.g:403:1: ruleInPropDec returns [EObject current=null] : (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInPropDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:409:2: ( (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalErrorModel.g:410:2: (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalErrorModel.g:410:2: (otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // InternalErrorModel.g:411:3: otherlv_0= 'propagation in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInPropDecAccess().getPropagationInKeyword_0());
            		
            // InternalErrorModel.g:415:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:416:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:416:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:417:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getInPropDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInPropDecAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalErrorModel.g:438:3: ( (otherlv_3= RULE_ID ) )
            // InternalErrorModel.g:439:4: (otherlv_3= RULE_ID )
            {
            // InternalErrorModel.g:439:4: (otherlv_3= RULE_ID )
            // InternalErrorModel.g:440:5: otherlv_3= RULE_ID
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
    // InternalErrorModel.g:455:1: entryRuleOutPropDec returns [EObject current=null] : iv_ruleOutPropDec= ruleOutPropDec EOF ;
    public final EObject entryRuleOutPropDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPropDec = null;


        try {
            // InternalErrorModel.g:455:51: (iv_ruleOutPropDec= ruleOutPropDec EOF )
            // InternalErrorModel.g:456:2: iv_ruleOutPropDec= ruleOutPropDec EOF
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
    // InternalErrorModel.g:462:1: ruleOutPropDec returns [EObject current=null] : (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '<-' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleOutPropDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:468:2: ( (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '<-' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalErrorModel.g:469:2: (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '<-' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalErrorModel.g:469:2: (otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '<-' ( (otherlv_3= RULE_ID ) ) )
            // InternalErrorModel.g:470:3: otherlv_0= 'propagation out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '<-' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutPropDecAccess().getPropagationOutKeyword_0());
            		
            // InternalErrorModel.g:474:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:475:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:475:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:476:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getOutPropDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOutPropDecAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalErrorModel.g:497:3: ( (otherlv_3= RULE_ID ) )
            // InternalErrorModel.g:498:4: (otherlv_3= RULE_ID )
            {
            // InternalErrorModel.g:498:4: (otherlv_3= RULE_ID )
            // InternalErrorModel.g:499:5: otherlv_3= RULE_ID
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
    // InternalErrorModel.g:514:1: entryRuleStateDec returns [EObject current=null] : iv_ruleStateDec= ruleStateDec EOF ;
    public final EObject entryRuleStateDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDec = null;


        try {
            // InternalErrorModel.g:514:49: (iv_ruleStateDec= ruleStateDec EOF )
            // InternalErrorModel.g:515:2: iv_ruleStateDec= ruleStateDec EOF
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
    // InternalErrorModel.g:521:1: ruleStateDec returns [EObject current=null] : (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleStateDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:527:2: ( (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalErrorModel.g:528:2: (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalErrorModel.g:528:2: (otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalErrorModel.g:529:3: otherlv_0= 'error state' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorStateKeyword_0());
            		
            // InternalErrorModel.g:533:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:534:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:534:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:535:5: lv_name_1_0= ruleQualifiedName
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
    // InternalErrorModel.g:556:1: entryRuleEventDec returns [EObject current=null] : iv_ruleEventDec= ruleEventDec EOF ;
    public final EObject entryRuleEventDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDec = null;


        try {
            // InternalErrorModel.g:556:49: (iv_ruleEventDec= ruleEventDec EOF )
            // InternalErrorModel.g:557:2: iv_ruleEventDec= ruleEventDec EOF
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
    // InternalErrorModel.g:563:1: ruleEventDec returns [EObject current=null] : (otherlv_0= 'error event' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eventFeatures_3_0= ruleEventFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleEventDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_eventFeatures_3_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:569:2: ( (otherlv_0= 'error event' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eventFeatures_3_0= ruleEventFeature ) )* otherlv_4= '}' ) )
            // InternalErrorModel.g:570:2: (otherlv_0= 'error event' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eventFeatures_3_0= ruleEventFeature ) )* otherlv_4= '}' )
            {
            // InternalErrorModel.g:570:2: (otherlv_0= 'error event' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eventFeatures_3_0= ruleEventFeature ) )* otherlv_4= '}' )
            // InternalErrorModel.g:571:3: otherlv_0= 'error event' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eventFeatures_3_0= ruleEventFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDecAccess().getErrorEventKeyword_0());
            		
            // InternalErrorModel.g:575:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalErrorModel.g:576:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalErrorModel.g:576:4: (lv_name_1_0= ruleQualifiedName )
            // InternalErrorModel.g:577:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEventDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEventDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalErrorModel.g:598:3: ( (lv_eventFeatures_3_0= ruleEventFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalErrorModel.g:599:4: (lv_eventFeatures_3_0= ruleEventFeature )
            	    {
            	    // InternalErrorModel.g:599:4: (lv_eventFeatures_3_0= ruleEventFeature )
            	    // InternalErrorModel.g:600:5: lv_eventFeatures_3_0= ruleEventFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEventDecAccess().getEventFeaturesEventFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_eventFeatures_3_0=ruleEventFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eventFeatures",
            	    						lv_eventFeatures_3_0,
            	    						"hu.bme.mit.ErrorModel.EventFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEventFeature"
    // InternalErrorModel.g:625:1: entryRuleEventFeature returns [EObject current=null] : iv_ruleEventFeature= ruleEventFeature EOF ;
    public final EObject entryRuleEventFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventFeature = null;


        try {
            // InternalErrorModel.g:625:53: (iv_ruleEventFeature= ruleEventFeature EOF )
            // InternalErrorModel.g:626:2: iv_ruleEventFeature= ruleEventFeature EOF
            {
             newCompositeNode(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventFeature=ruleEventFeature();

            state._fsp--;

             current =iv_ruleEventFeature; 
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
    // $ANTLR end "entryRuleEventFeature"


    // $ANTLR start "ruleEventFeature"
    // InternalErrorModel.g:632:1: ruleEventFeature returns [EObject current=null] : this_EventState_0= ruleEventState ;
    public final EObject ruleEventFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EventState_0 = null;



        	enterRule();

        try {
            // InternalErrorModel.g:638:2: (this_EventState_0= ruleEventState )
            // InternalErrorModel.g:639:2: this_EventState_0= ruleEventState
            {

            		newCompositeNode(grammarAccess.getEventFeatureAccess().getEventStateParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EventState_0=ruleEventState();

            state._fsp--;


            		current = this_EventState_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEventFeature"


    // $ANTLR start "entryRuleEventState"
    // InternalErrorModel.g:650:1: entryRuleEventState returns [EObject current=null] : iv_ruleEventState= ruleEventState EOF ;
    public final EObject entryRuleEventState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventState = null;


        try {
            // InternalErrorModel.g:650:51: (iv_ruleEventState= ruleEventState EOF )
            // InternalErrorModel.g:651:2: iv_ruleEventState= ruleEventState EOF
            {
             newCompositeNode(grammarAccess.getEventStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventState=ruleEventState();

            state._fsp--;

             current =iv_ruleEventState; 
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
    // $ANTLR end "entryRuleEventState"


    // $ANTLR start "ruleEventState"
    // InternalErrorModel.g:657:1: ruleEventState returns [EObject current=null] : (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleEventState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalErrorModel.g:663:2: ( (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalErrorModel.g:664:2: (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalErrorModel.g:664:2: (otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalErrorModel.g:665:3: otherlv_0= 'states' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEventStateAccess().getStatesKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEventStateAccess().getColonKeyword_1());
            		
            // InternalErrorModel.g:673:3: ( (otherlv_2= RULE_ID ) )
            // InternalErrorModel.g:674:4: (otherlv_2= RULE_ID )
            {
            // InternalErrorModel.g:674:4: (otherlv_2= RULE_ID )
            // InternalErrorModel.g:675:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getEventStateAccess().getSourceStateStateDecCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEventStateAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalErrorModel.g:690:3: ( (otherlv_4= RULE_ID ) )
            // InternalErrorModel.g:691:4: (otherlv_4= RULE_ID )
            {
            // InternalErrorModel.g:691:4: (otherlv_4= RULE_ID )
            // InternalErrorModel.g:692:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventStateRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getEventStateAccess().getTargetStateStateDecCrossReference_4_0());
            				

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
    // $ANTLR end "ruleEventState"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalErrorModel.g:707:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalErrorModel.g:707:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalErrorModel.g:708:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalErrorModel.g:714:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalErrorModel.g:720:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalErrorModel.g:721:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalErrorModel.g:721:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalErrorModel.g:722:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,13,FOLLOW_14); 

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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalErrorModel.g:767:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalErrorModel.g:768:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000D60000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002002L});

}