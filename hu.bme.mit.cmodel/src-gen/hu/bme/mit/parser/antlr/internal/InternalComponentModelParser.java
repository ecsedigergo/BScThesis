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
import hu.bme.mit.services.ComponentModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system connection'", "'from'", "'.'", "'to'", "'system declaration'", "'{'", "'}'", "'system port in'", "'system port out'", "'connection'", "'component implementation'", "':'", "'component type'", "'port instance in'", "'port instance out'", "'port type'", "'error mode'"
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
    public static final int T__26=26;
    public static final int T__27=27;
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


        public InternalComponentModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentModel.g"; }



     	private ComponentModelGrammarAccess grammarAccess;

        public InternalComponentModelParser(TokenStream input, ComponentModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentModel";
       	}

       	@Override
       	protected ComponentModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentModel"
    // InternalComponentModel.g:64:1: entryRuleComponentModel returns [EObject current=null] : iv_ruleComponentModel= ruleComponentModel EOF ;
    public final EObject entryRuleComponentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModel = null;


        try {
            // InternalComponentModel.g:64:55: (iv_ruleComponentModel= ruleComponentModel EOF )
            // InternalComponentModel.g:65:2: iv_ruleComponentModel= ruleComponentModel EOF
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
    // InternalComponentModel.g:71:1: ruleComponentModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleComponentModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalComponentModel.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalComponentModel.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentModel.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalComponentModel.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalComponentModel.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getComponentModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getComponentModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"hu.bme.mit.ComponentModel.AbstractElement");
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
    // $ANTLR end "ruleComponentModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalComponentModel.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalComponentModel.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalComponentModel.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalComponentModel.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_SystemDec_0 = null;

        EObject this_SystemConnDec_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:113:2: ( (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec ) )
            // InternalComponentModel.g:114:2: (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec )
            {
            // InternalComponentModel.g:114:2: (this_SystemDec_0= ruleSystemDec | this_SystemConnDec_1= ruleSystemConnDec )
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
                    // InternalComponentModel.g:115:3: this_SystemDec_0= ruleSystemDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemDec_0=ruleSystemDec();

                    state._fsp--;


                    			current = this_SystemDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:124:3: this_SystemConnDec_1= ruleSystemConnDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemConnDecParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleSystemConnDec"
    // InternalComponentModel.g:136:1: entryRuleSystemConnDec returns [EObject current=null] : iv_ruleSystemConnDec= ruleSystemConnDec EOF ;
    public final EObject entryRuleSystemConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConnDec = null;


        try {
            // InternalComponentModel.g:136:54: (iv_ruleSystemConnDec= ruleSystemConnDec EOF )
            // InternalComponentModel.g:137:2: iv_ruleSystemConnDec= ruleSystemConnDec EOF
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
    // InternalComponentModel.g:143:1: ruleSystemConnDec returns [EObject current=null] : (otherlv_0= 'system connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleSystemConnDec() throws RecognitionException {
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
            // InternalComponentModel.g:149:2: ( (otherlv_0= 'system connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalComponentModel.g:150:2: (otherlv_0= 'system connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalComponentModel.g:150:2: (otherlv_0= 'system connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) )
            // InternalComponentModel.g:151:3: otherlv_0= 'system connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getSystemConnectionKeyword_0());
            		
            // InternalComponentModel.g:155:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:156:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:156:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:157:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemConnDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemConnDecAccess().getFromKeyword_2());
            		
            // InternalComponentModel.g:178:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:179:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:179:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:180:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_4());
            		
            // InternalComponentModel.g:195:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:196:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:196:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:197:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getToKeyword_6());
            		
            // InternalComponentModel.g:212:3: ( (otherlv_7= RULE_ID ) )
            // InternalComponentModel.g:213:4: (otherlv_7= RULE_ID )
            {
            // InternalComponentModel.g:213:4: (otherlv_7= RULE_ID )
            // InternalComponentModel.g:214:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_8());
            		
            // InternalComponentModel.g:229:3: ( (otherlv_9= RULE_ID ) )
            // InternalComponentModel.g:230:4: (otherlv_9= RULE_ID )
            {
            // InternalComponentModel.g:230:4: (otherlv_9= RULE_ID )
            // InternalComponentModel.g:231:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_9_0());
            				

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalComponentModel.g:246:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalComponentModel.g:246:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalComponentModel.g:247:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalComponentModel.g:253:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentModel.g:259:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentModel.g:260:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentModel.g:260:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentModel.g:261:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentModel.g:268:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentModel.g:269:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleSystemDec"
    // InternalComponentModel.g:286:1: entryRuleSystemDec returns [EObject current=null] : iv_ruleSystemDec= ruleSystemDec EOF ;
    public final EObject entryRuleSystemDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDec = null;


        try {
            // InternalComponentModel.g:286:50: (iv_ruleSystemDec= ruleSystemDec EOF )
            // InternalComponentModel.g:287:2: iv_ruleSystemDec= ruleSystemDec EOF
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
    // InternalComponentModel.g:293:1: ruleSystemDec returns [EObject current=null] : (otherlv_0= 'system declaration' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleAbstractFeatures ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystemDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sysFeatures_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:299:2: ( (otherlv_0= 'system declaration' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleAbstractFeatures ) )* otherlv_4= '}' ) )
            // InternalComponentModel.g:300:2: (otherlv_0= 'system declaration' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleAbstractFeatures ) )* otherlv_4= '}' )
            {
            // InternalComponentModel.g:300:2: (otherlv_0= 'system declaration' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleAbstractFeatures ) )* otherlv_4= '}' )
            // InternalComponentModel.g:301:3: otherlv_0= 'system declaration' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleAbstractFeatures ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemDeclarationKeyword_0());
            		
            // InternalComponentModel.g:305:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:306:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:306:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:307:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentModel.g:328:3: ( (lv_sysFeatures_3_0= ruleAbstractFeatures ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=21)||LA4_0==23||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentModel.g:329:4: (lv_sysFeatures_3_0= ruleAbstractFeatures )
            	    {
            	    // InternalComponentModel.g:329:4: (lv_sysFeatures_3_0= ruleAbstractFeatures )
            	    // InternalComponentModel.g:330:5: lv_sysFeatures_3_0= ruleAbstractFeatures
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_sysFeatures_3_0=ruleAbstractFeatures();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sysFeatures",
            	    						lv_sysFeatures_3_0,
            	    						"hu.bme.mit.ComponentModel.AbstractFeatures");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentModel.g:355:1: entryRuleAbstractFeatures returns [EObject current=null] : iv_ruleAbstractFeatures= ruleAbstractFeatures EOF ;
    public final EObject entryRuleAbstractFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFeatures = null;


        try {
            // InternalComponentModel.g:355:57: (iv_ruleAbstractFeatures= ruleAbstractFeatures EOF )
            // InternalComponentModel.g:356:2: iv_ruleAbstractFeatures= ruleAbstractFeatures EOF
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
    // InternalComponentModel.g:362:1: ruleAbstractFeatures returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_PortType_3= rulePortType | this_SystemPortDec_4= ruleSystemPortDec ) ;
    public final EObject ruleAbstractFeatures() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_ComponentImpl_1 = null;

        EObject this_CompConnDec_2 = null;

        EObject this_PortType_3 = null;

        EObject this_SystemPortDec_4 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:368:2: ( (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_PortType_3= rulePortType | this_SystemPortDec_4= ruleSystemPortDec ) )
            // InternalComponentModel.g:369:2: (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_PortType_3= rulePortType | this_SystemPortDec_4= ruleSystemPortDec )
            {
            // InternalComponentModel.g:369:2: (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_PortType_3= rulePortType | this_SystemPortDec_4= ruleSystemPortDec )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 18:
            case 19:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalComponentModel.g:370:3: this_ComponentType_0= ruleComponentType
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
                    // InternalComponentModel.g:379:3: this_ComponentImpl_1= ruleComponentImpl
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
                    // InternalComponentModel.g:388:3: this_CompConnDec_2= ruleCompConnDec
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
                    // InternalComponentModel.g:397:3: this_PortType_3= rulePortType
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getPortTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortType_3=rulePortType();

                    state._fsp--;


                    			current = this_PortType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentModel.g:406:3: this_SystemPortDec_4= ruleSystemPortDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortDec_4=ruleSystemPortDec();

                    state._fsp--;


                    			current = this_SystemPortDec_4;
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
    // InternalComponentModel.g:418:1: entryRuleSystemPortDec returns [EObject current=null] : iv_ruleSystemPortDec= ruleSystemPortDec EOF ;
    public final EObject entryRuleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortDec = null;


        try {
            // InternalComponentModel.g:418:54: (iv_ruleSystemPortDec= ruleSystemPortDec EOF )
            // InternalComponentModel.g:419:2: iv_ruleSystemPortDec= ruleSystemPortDec EOF
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
    // InternalComponentModel.g:425:1: ruleSystemPortDec returns [EObject current=null] : (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) ;
    public final EObject ruleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortIn_0 = null;

        EObject this_SystemPortOut_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:431:2: ( (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) )
            // InternalComponentModel.g:432:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            {
            // InternalComponentModel.g:432:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentModel.g:433:3: this_SystemPortIn_0= ruleSystemPortIn
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
                    // InternalComponentModel.g:442:3: this_SystemPortOut_1= ruleSystemPortOut
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
    // InternalComponentModel.g:454:1: entryRuleSystemPortIn returns [EObject current=null] : iv_ruleSystemPortIn= ruleSystemPortIn EOF ;
    public final EObject entryRuleSystemPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortIn = null;


        try {
            // InternalComponentModel.g:454:53: (iv_ruleSystemPortIn= ruleSystemPortIn EOF )
            // InternalComponentModel.g:455:2: iv_ruleSystemPortIn= ruleSystemPortIn EOF
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
    // InternalComponentModel.g:461:1: ruleSystemPortIn returns [EObject current=null] : (otherlv_0= 'system port in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:467:2: ( (otherlv_0= 'system port in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalComponentModel.g:468:2: (otherlv_0= 'system port in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalComponentModel.g:468:2: (otherlv_0= 'system port in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalComponentModel.g:469:3: otherlv_0= 'system port in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemPortInKeyword_0());
            		
            // InternalComponentModel.g:473:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:474:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:474:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:475:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getToKeyword_2());
            		
            // InternalComponentModel.g:496:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:497:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:497:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:498:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getFullStopKeyword_4());
            		
            // InternalComponentModel.g:513:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:514:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:514:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:515:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_5_0());
            				

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
    // InternalComponentModel.g:530:1: entryRuleSystemPortOut returns [EObject current=null] : iv_ruleSystemPortOut= ruleSystemPortOut EOF ;
    public final EObject entryRuleSystemPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortOut = null;


        try {
            // InternalComponentModel.g:530:54: (iv_ruleSystemPortOut= ruleSystemPortOut EOF )
            // InternalComponentModel.g:531:2: iv_ruleSystemPortOut= ruleSystemPortOut EOF
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
    // InternalComponentModel.g:537:1: ruleSystemPortOut returns [EObject current=null] : (otherlv_0= 'system port out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:543:2: ( (otherlv_0= 'system port out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalComponentModel.g:544:2: (otherlv_0= 'system port out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalComponentModel.g:544:2: (otherlv_0= 'system port out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalComponentModel.g:545:3: otherlv_0= 'system port out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemPortOutKeyword_0());
            		
            // InternalComponentModel.g:549:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:550:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:550:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:551:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getFromKeyword_2());
            		
            // InternalComponentModel.g:572:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:573:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:573:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:574:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFullStopKeyword_4());
            		
            // InternalComponentModel.g:589:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:590:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:590:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:591:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_5_0());
            				

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
    // InternalComponentModel.g:606:1: entryRuleCompConnDec returns [EObject current=null] : iv_ruleCompConnDec= ruleCompConnDec EOF ;
    public final EObject entryRuleCompConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompConnDec = null;


        try {
            // InternalComponentModel.g:606:52: (iv_ruleCompConnDec= ruleCompConnDec EOF )
            // InternalComponentModel.g:607:2: iv_ruleCompConnDec= ruleCompConnDec EOF
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
    // InternalComponentModel.g:613:1: ruleCompConnDec returns [EObject current=null] : (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleCompConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalComponentModel.g:619:2: ( (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalComponentModel.g:620:2: (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalComponentModel.g:620:2: (otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) )
            // InternalComponentModel.g:621:3: otherlv_0= 'connection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompConnDecAccess().getConnectionKeyword_0());
            		
            // InternalComponentModel.g:625:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentModel.g:626:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentModel.g:626:4: (lv_name_1_0= RULE_ID )
            // InternalComponentModel.g:627:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCompConnDecAccess().getFromKeyword_2());
            		
            // InternalComponentModel.g:647:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:648:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:648:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:649:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getCompConnDecAccess().getFullStopKeyword_4());
            		
            // InternalComponentModel.g:664:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:665:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:665:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:666:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCompConnDecAccess().getToKeyword_6());
            		
            // InternalComponentModel.g:681:3: ( (otherlv_7= RULE_ID ) )
            // InternalComponentModel.g:682:4: (otherlv_7= RULE_ID )
            {
            // InternalComponentModel.g:682:4: (otherlv_7= RULE_ID )
            // InternalComponentModel.g:683:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_7, grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getCompConnDecAccess().getFullStopKeyword_8());
            		
            // InternalComponentModel.g:698:3: ( (otherlv_9= RULE_ID ) )
            // InternalComponentModel.g:699:4: (otherlv_9= RULE_ID )
            {
            // InternalComponentModel.g:699:4: (otherlv_9= RULE_ID )
            // InternalComponentModel.g:700:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_9_0());
            				

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
    // InternalComponentModel.g:715:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalComponentModel.g:715:54: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalComponentModel.g:716:2: iv_ruleComponentImpl= ruleComponentImpl EOF
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
    // InternalComponentModel.g:722:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'component implementation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:728:2: ( (otherlv_0= 'component implementation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalComponentModel.g:729:2: (otherlv_0= 'component implementation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalComponentModel.g:729:2: (otherlv_0= 'component implementation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalComponentModel.g:730:3: otherlv_0= 'component implementation' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentImplementationKeyword_0());
            		
            // InternalComponentModel.g:734:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:735:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:735:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:736:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentImplAccess().getColonKeyword_2());
            		
            // InternalComponentModel.g:757:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:758:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:758:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:759:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentImplRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_3_0());
            				

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
    // InternalComponentModel.g:774:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalComponentModel.g:774:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalComponentModel.g:775:2: iv_ruleComponentType= ruleComponentType EOF
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
    // InternalComponentModel.g:781:1: ruleComponentType returns [EObject current=null] : (otherlv_0= 'component type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_compFeatures_3_0= ruleComponentFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_compFeatures_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:787:2: ( (otherlv_0= 'component type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_compFeatures_3_0= ruleComponentFeature ) )* otherlv_4= '}' ) )
            // InternalComponentModel.g:788:2: (otherlv_0= 'component type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_compFeatures_3_0= ruleComponentFeature ) )* otherlv_4= '}' )
            {
            // InternalComponentModel.g:788:2: (otherlv_0= 'component type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_compFeatures_3_0= ruleComponentFeature ) )* otherlv_4= '}' )
            // InternalComponentModel.g:789:3: otherlv_0= 'component type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_compFeatures_3_0= ruleComponentFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_0());
            		
            // InternalComponentModel.g:793:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:794:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:794:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:795:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentModel.g:816:3: ( (lv_compFeatures_3_0= ruleComponentFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentModel.g:817:4: (lv_compFeatures_3_0= ruleComponentFeature )
            	    {
            	    // InternalComponentModel.g:817:4: (lv_compFeatures_3_0= ruleComponentFeature )
            	    // InternalComponentModel.g:818:5: lv_compFeatures_3_0= ruleComponentFeature
            	    {

            	    					newCompositeNode(grammarAccess.getComponentTypeAccess().getCompFeaturesComponentFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_compFeatures_3_0=ruleComponentFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"compFeatures",
            	    						lv_compFeatures_3_0,
            	    						"hu.bme.mit.ComponentModel.ComponentFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleComponentFeature"
    // InternalComponentModel.g:843:1: entryRuleComponentFeature returns [EObject current=null] : iv_ruleComponentFeature= ruleComponentFeature EOF ;
    public final EObject entryRuleComponentFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentFeature = null;


        try {
            // InternalComponentModel.g:843:57: (iv_ruleComponentFeature= ruleComponentFeature EOF )
            // InternalComponentModel.g:844:2: iv_ruleComponentFeature= ruleComponentFeature EOF
            {
             newCompositeNode(grammarAccess.getComponentFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentFeature=ruleComponentFeature();

            state._fsp--;

             current =iv_ruleComponentFeature; 
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
    // $ANTLR end "entryRuleComponentFeature"


    // $ANTLR start "ruleComponentFeature"
    // InternalComponentModel.g:850:1: ruleComponentFeature returns [EObject current=null] : ( (lv_ports_0_0= rulePort ) ) ;
    public final EObject ruleComponentFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_ports_0_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:856:2: ( ( (lv_ports_0_0= rulePort ) ) )
            // InternalComponentModel.g:857:2: ( (lv_ports_0_0= rulePort ) )
            {
            // InternalComponentModel.g:857:2: ( (lv_ports_0_0= rulePort ) )
            // InternalComponentModel.g:858:3: (lv_ports_0_0= rulePort )
            {
            // InternalComponentModel.g:858:3: (lv_ports_0_0= rulePort )
            // InternalComponentModel.g:859:4: lv_ports_0_0= rulePort
            {

            				newCompositeNode(grammarAccess.getComponentFeatureAccess().getPortsPortParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ports_0_0=rulePort();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getComponentFeatureRule());
            				}
            				add(
            					current,
            					"ports",
            					lv_ports_0_0,
            					"hu.bme.mit.ComponentModel.Port");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleComponentFeature"


    // $ANTLR start "entryRulePort"
    // InternalComponentModel.g:879:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalComponentModel.g:879:45: (iv_rulePort= rulePort EOF )
            // InternalComponentModel.g:880:2: iv_rulePort= rulePort EOF
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
    // InternalComponentModel.g:886:1: rulePort returns [EObject current=null] : (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_InPort_0 = null;

        EObject this_OutPort_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:892:2: ( (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) )
            // InternalComponentModel.g:893:2: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            {
            // InternalComponentModel.g:893:2: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentModel.g:894:3: this_InPort_0= ruleInPort
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
                    // InternalComponentModel.g:903:3: this_OutPort_1= ruleOutPort
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
    // InternalComponentModel.g:915:1: entryRuleInPort returns [EObject current=null] : iv_ruleInPort= ruleInPort EOF ;
    public final EObject entryRuleInPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPort = null;


        try {
            // InternalComponentModel.g:915:47: (iv_ruleInPort= ruleInPort EOF )
            // InternalComponentModel.g:916:2: iv_ruleInPort= ruleInPort EOF
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
    // InternalComponentModel.g:922:1: ruleInPort returns [EObject current=null] : (otherlv_0= 'port instance in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:928:2: ( (otherlv_0= 'port instance in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalComponentModel.g:929:2: (otherlv_0= 'port instance in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalComponentModel.g:929:2: (otherlv_0= 'port instance in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalComponentModel.g:930:3: otherlv_0= 'port instance in' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInPortAccess().getPortInstanceInKeyword_0());
            		
            // InternalComponentModel.g:934:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:935:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:935:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:936:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getInPortAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInPortAccess().getColonKeyword_2());
            		
            // InternalComponentModel.g:957:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:958:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:958:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:959:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInPortRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_3_0());
            				

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
    // InternalComponentModel.g:974:1: entryRuleOutPort returns [EObject current=null] : iv_ruleOutPort= ruleOutPort EOF ;
    public final EObject entryRuleOutPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPort = null;


        try {
            // InternalComponentModel.g:974:48: (iv_ruleOutPort= ruleOutPort EOF )
            // InternalComponentModel.g:975:2: iv_ruleOutPort= ruleOutPort EOF
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
    // InternalComponentModel.g:981:1: ruleOutPort returns [EObject current=null] : (otherlv_0= 'port instance out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleOutPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:987:2: ( (otherlv_0= 'port instance out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalComponentModel.g:988:2: (otherlv_0= 'port instance out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalComponentModel.g:988:2: (otherlv_0= 'port instance out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalComponentModel.g:989:3: otherlv_0= 'port instance out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutPortAccess().getPortInstanceOutKeyword_0());
            		
            // InternalComponentModel.g:993:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:994:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:994:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:995:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getOutPortAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOutPortAccess().getColonKeyword_2());
            		
            // InternalComponentModel.g:1016:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:1017:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:1017:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:1018:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutPortRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_3_0());
            				

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


    // $ANTLR start "entryRulePortType"
    // InternalComponentModel.g:1033:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalComponentModel.g:1033:49: (iv_rulePortType= rulePortType EOF )
            // InternalComponentModel.g:1034:2: iv_rulePortType= rulePortType EOF
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
    // InternalComponentModel.g:1040:1: rulePortType returns [EObject current=null] : (otherlv_0= 'port type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eModes_3_0= ruleerrorModes ) )* otherlv_4= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_eModes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1046:2: ( (otherlv_0= 'port type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eModes_3_0= ruleerrorModes ) )* otherlv_4= '}' ) )
            // InternalComponentModel.g:1047:2: (otherlv_0= 'port type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eModes_3_0= ruleerrorModes ) )* otherlv_4= '}' )
            {
            // InternalComponentModel.g:1047:2: (otherlv_0= 'port type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eModes_3_0= ruleerrorModes ) )* otherlv_4= '}' )
            // InternalComponentModel.g:1048:3: otherlv_0= 'port type' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_eModes_3_0= ruleerrorModes ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortTypeKeyword_0());
            		
            // InternalComponentModel.g:1052:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1053:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1053:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:1054:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentModel.g:1075:3: ( (lv_eModes_3_0= ruleerrorModes ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentModel.g:1076:4: (lv_eModes_3_0= ruleerrorModes )
            	    {
            	    // InternalComponentModel.g:1076:4: (lv_eModes_3_0= ruleerrorModes )
            	    // InternalComponentModel.g:1077:5: lv_eModes_3_0= ruleerrorModes
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_eModes_3_0=ruleerrorModes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            	    					}
            	    					set(
            	    						current,
            	    						"eModes",
            	    						lv_eModes_3_0,
            	    						"hu.bme.mit.ComponentModel.errorModes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentModel.g:1102:1: entryRuleerrorModes returns [EObject current=null] : iv_ruleerrorModes= ruleerrorModes EOF ;
    public final EObject entryRuleerrorModes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleerrorModes = null;


        try {
            // InternalComponentModel.g:1102:51: (iv_ruleerrorModes= ruleerrorModes EOF )
            // InternalComponentModel.g:1103:2: iv_ruleerrorModes= ruleerrorModes EOF
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
    // InternalComponentModel.g:1109:1: ruleerrorModes returns [EObject current=null] : (otherlv_0= 'error mode' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleerrorModes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1115:2: ( (otherlv_0= 'error mode' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalComponentModel.g:1116:2: (otherlv_0= 'error mode' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalComponentModel.g:1116:2: (otherlv_0= 'error mode' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalComponentModel.g:1117:3: otherlv_0= 'error mode' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModesAccess().getErrorModeKeyword_0());
            		
            // InternalComponentModel.g:1121:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1122:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1122:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:1123:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorModesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
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
    // $ANTLR end "ruleerrorModes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004BE0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008020000L});

}