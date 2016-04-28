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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'port'", "'type'", "'{'", "'}'", "'error'", "'mode'", "'system'", "'connection'", "'from'", "'to'", "'declaration'", "'in'", "'out'", "'component'", "'implementation'", "':'", "'instance'", "'model'", "'state'", "'transition'", "'occurrence'", "'states'", "'->'", "'trigger'", "'action'"
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

                if ( (LA1_0==12||LA1_0==18) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalComponentModel.g:100:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalComponentModel.g:100:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalComponentModel.g:101:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalComponentModel.g:107:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentModel.g:113:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentModel.g:114:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentModel.g:114:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentModel.g:115:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentModel.g:122:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentModel.g:123:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalComponentModel.g:140:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalComponentModel.g:140:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalComponentModel.g:141:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalComponentModel.g:147:1: ruleAbstractElement returns [EObject current=null] : (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentModelDec_0 = null;

        EObject this_PortType_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:153:2: ( (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType ) )
            // InternalComponentModel.g:154:2: (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType )
            {
            // InternalComponentModel.g:154:2: (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentModel.g:155:3: this_ComponentModelDec_0= ruleComponentModelDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getComponentModelDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentModelDec_0=ruleComponentModelDec();

                    state._fsp--;


                    			current = this_ComponentModelDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:164:3: this_PortType_1= rulePortType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPortTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortType_1=rulePortType();

                    state._fsp--;


                    			current = this_PortType_1;
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


    // $ANTLR start "entryRulePortType"
    // InternalComponentModel.g:176:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalComponentModel.g:176:49: (iv_rulePortType= rulePortType EOF )
            // InternalComponentModel.g:177:2: iv_rulePortType= rulePortType EOF
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
    // InternalComponentModel.g:183:1: rulePortType returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eModes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:189:2: ( (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' ) )
            // InternalComponentModel.g:190:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' )
            {
            // InternalComponentModel.g:190:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' )
            // InternalComponentModel.g:191:3: otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getTypeKeyword_1());
            		
            // InternalComponentModel.g:199:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:200:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:200:4: (lv_name_2_0= ruleQualifiedName )
            // InternalComponentModel.g:201:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentModel.g:222:3: ( (lv_eModes_4_0= ruleErrorModes ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentModel.g:223:4: (lv_eModes_4_0= ruleErrorModes )
            	    {
            	    // InternalComponentModel.g:223:4: (lv_eModes_4_0= ruleErrorModes )
            	    // InternalComponentModel.g:224:5: lv_eModes_4_0= ruleErrorModes
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_eModes_4_0=ruleErrorModes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            	    					}
            	    					set(
            	    						current,
            	    						"eModes",
            	    						lv_eModes_4_0,
            	    						"hu.bme.mit.ComponentModel.ErrorModes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleErrorModes"
    // InternalComponentModel.g:249:1: entryRuleErrorModes returns [EObject current=null] : iv_ruleErrorModes= ruleErrorModes EOF ;
    public final EObject entryRuleErrorModes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModes = null;


        try {
            // InternalComponentModel.g:249:51: (iv_ruleErrorModes= ruleErrorModes EOF )
            // InternalComponentModel.g:250:2: iv_ruleErrorModes= ruleErrorModes EOF
            {
             newCompositeNode(grammarAccess.getErrorModesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorModes=ruleErrorModes();

            state._fsp--;

             current =iv_ruleErrorModes; 
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
    // $ANTLR end "entryRuleErrorModes"


    // $ANTLR start "ruleErrorModes"
    // InternalComponentModel.g:256:1: ruleErrorModes returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleErrorModes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:262:2: ( (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) ) )
            // InternalComponentModel.g:263:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) )
            {
            // InternalComponentModel.g:263:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) )
            // InternalComponentModel.g:264:3: otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModesAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModesAccess().getModeKeyword_1());
            		
            // InternalComponentModel.g:272:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:273:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:273:4: (lv_name_2_0= ruleQualifiedName )
            // InternalComponentModel.g:274:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorModesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleErrorModes"


    // $ANTLR start "entryRuleComponentModelDec"
    // InternalComponentModel.g:295:1: entryRuleComponentModelDec returns [EObject current=null] : iv_ruleComponentModelDec= ruleComponentModelDec EOF ;
    public final EObject entryRuleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModelDec = null;


        try {
            // InternalComponentModel.g:295:58: (iv_ruleComponentModelDec= ruleComponentModelDec EOF )
            // InternalComponentModel.g:296:2: iv_ruleComponentModelDec= ruleComponentModelDec EOF
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
    // InternalComponentModel.g:302:1: ruleComponentModelDec returns [EObject current=null] : (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) ;
    public final EObject ruleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemConnDec_0 = null;

        EObject this_SystemDec_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:308:2: ( (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) )
            // InternalComponentModel.g:309:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            {
            // InternalComponentModel.g:309:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=1;
                }
                else if ( (LA5_1==22) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentModel.g:310:3: this_SystemConnDec_0= ruleSystemConnDec
                    {

                    			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemConnDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemConnDec_0=ruleSystemConnDec();

                    state._fsp--;


                    			current = this_SystemConnDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:319:3: this_SystemDec_1= ruleSystemDec
                    {

                    			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemDec_1=ruleSystemDec();

                    state._fsp--;


                    			current = this_SystemDec_1;
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
    // InternalComponentModel.g:331:1: entryRuleSystemConnDec returns [EObject current=null] : iv_ruleSystemConnDec= ruleSystemConnDec EOF ;
    public final EObject entryRuleSystemConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConnDec = null;


        try {
            // InternalComponentModel.g:331:54: (iv_ruleSystemConnDec= ruleSystemConnDec EOF )
            // InternalComponentModel.g:332:2: iv_ruleSystemConnDec= ruleSystemConnDec EOF
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
    // InternalComponentModel.g:338:1: ruleSystemConnDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleSystemConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:344:2: ( (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalComponentModel.g:345:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalComponentModel.g:345:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalComponentModel.g:346:3: otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1());
            		
            // InternalComponentModel.g:354:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:355:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:355:4: (lv_name_2_0= ruleQualifiedName )
            // InternalComponentModel.g:356:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemConnDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getFromKeyword_3());
            		
            // InternalComponentModel.g:377:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponentModel.g:378:4: (otherlv_4= RULE_ID )
            {
            // InternalComponentModel.g:378:4: (otherlv_4= RULE_ID )
            // InternalComponentModel.g:379:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5());
            		
            // InternalComponentModel.g:394:3: ( (otherlv_6= RULE_ID ) )
            // InternalComponentModel.g:395:4: (otherlv_6= RULE_ID )
            {
            // InternalComponentModel.g:395:4: (otherlv_6= RULE_ID )
            // InternalComponentModel.g:396:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getToKeyword_7());
            		
            // InternalComponentModel.g:411:3: ( (otherlv_8= RULE_ID ) )
            // InternalComponentModel.g:412:4: (otherlv_8= RULE_ID )
            {
            // InternalComponentModel.g:412:4: (otherlv_8= RULE_ID )
            // InternalComponentModel.g:413:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9());
            		
            // InternalComponentModel.g:428:3: ( (otherlv_10= RULE_ID ) )
            // InternalComponentModel.g:429:4: (otherlv_10= RULE_ID )
            {
            // InternalComponentModel.g:429:4: (otherlv_10= RULE_ID )
            // InternalComponentModel.g:430:5: otherlv_10= RULE_ID
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
    // InternalComponentModel.g:445:1: entryRuleSystemDec returns [EObject current=null] : iv_ruleSystemDec= ruleSystemDec EOF ;
    public final EObject entryRuleSystemDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDec = null;


        try {
            // InternalComponentModel.g:445:50: (iv_ruleSystemDec= ruleSystemDec EOF )
            // InternalComponentModel.g:446:2: iv_ruleSystemDec= ruleSystemDec EOF
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
    // InternalComponentModel.g:452:1: ruleSystemDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sysFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:458:2: ( (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' ) )
            // InternalComponentModel.g:459:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' )
            {
            // InternalComponentModel.g:459:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}' )
            // InternalComponentModel.g:460:3: otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemDecAccess().getDeclarationKeyword_1());
            		
            // InternalComponentModel.g:468:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:469:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:469:4: (lv_name_2_0= ruleQualifiedName )
            // InternalComponentModel.g:470:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentModel.g:491:3: ( (lv_sysFeatures_4_0= ruleAbstractFeatures ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentModel.g:492:4: (lv_sysFeatures_4_0= ruleAbstractFeatures )
            	    {
            	    // InternalComponentModel.g:492:4: (lv_sysFeatures_4_0= ruleAbstractFeatures )
            	    // InternalComponentModel.g:493:5: lv_sysFeatures_4_0= ruleAbstractFeatures
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_sysFeatures_4_0=ruleAbstractFeatures();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sysFeatures",
            	    						lv_sysFeatures_4_0,
            	    						"hu.bme.mit.ComponentModel.AbstractFeatures");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentModel.g:518:1: entryRuleAbstractFeatures returns [EObject current=null] : iv_ruleAbstractFeatures= ruleAbstractFeatures EOF ;
    public final EObject entryRuleAbstractFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFeatures = null;


        try {
            // InternalComponentModel.g:518:57: (iv_ruleAbstractFeatures= ruleAbstractFeatures EOF )
            // InternalComponentModel.g:519:2: iv_ruleAbstractFeatures= ruleAbstractFeatures EOF
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
    // InternalComponentModel.g:525:1: ruleAbstractFeatures returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec ) ;
    public final EObject ruleAbstractFeatures() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_ComponentImpl_1 = null;

        EObject this_CompConnDec_2 = null;

        EObject this_SystemPortDec_3 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:531:2: ( (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec ) )
            // InternalComponentModel.g:532:2: (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec )
            {
            // InternalComponentModel.g:532:2: (this_ComponentType_0= ruleComponentType | this_ComponentImpl_1= ruleComponentImpl | this_CompConnDec_2= ruleCompConnDec | this_SystemPortDec_3= ruleSystemPortDec )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt7=2;
                    }
                    break;
                case 13:
                    {
                    alt7=1;
                    }
                    break;
                case 19:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA7_0==18) ) {
                alt7=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentModel.g:533:3: this_ComponentType_0= ruleComponentType
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
                    // InternalComponentModel.g:542:3: this_ComponentImpl_1= ruleComponentImpl
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
                    // InternalComponentModel.g:551:3: this_CompConnDec_2= ruleCompConnDec
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
                    // InternalComponentModel.g:560:3: this_SystemPortDec_3= ruleSystemPortDec
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
    // InternalComponentModel.g:572:1: entryRuleSystemPortDec returns [EObject current=null] : iv_ruleSystemPortDec= ruleSystemPortDec EOF ;
    public final EObject entryRuleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortDec = null;


        try {
            // InternalComponentModel.g:572:54: (iv_ruleSystemPortDec= ruleSystemPortDec EOF )
            // InternalComponentModel.g:573:2: iv_ruleSystemPortDec= ruleSystemPortDec EOF
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
    // InternalComponentModel.g:579:1: ruleSystemPortDec returns [EObject current=null] : (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) ;
    public final EObject ruleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortIn_0 = null;

        EObject this_SystemPortOut_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:585:2: ( (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) )
            // InternalComponentModel.g:586:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            {
            // InternalComponentModel.g:586:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==12) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==24) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentModel.g:587:3: this_SystemPortIn_0= ruleSystemPortIn
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
                    // InternalComponentModel.g:596:3: this_SystemPortOut_1= ruleSystemPortOut
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
    // InternalComponentModel.g:608:1: entryRuleSystemPortIn returns [EObject current=null] : iv_ruleSystemPortIn= ruleSystemPortIn EOF ;
    public final EObject entryRuleSystemPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortIn = null;


        try {
            // InternalComponentModel.g:608:53: (iv_ruleSystemPortIn= ruleSystemPortIn EOF )
            // InternalComponentModel.g:609:2: iv_ruleSystemPortIn= ruleSystemPortIn EOF
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
    // InternalComponentModel.g:615:1: ruleSystemPortIn returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:621:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalComponentModel.g:622:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalComponentModel.g:622:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalComponentModel.g:623:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getInKeyword_2());
            		
            // InternalComponentModel.g:635:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalComponentModel.g:636:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:636:4: (lv_name_3_0= ruleQualifiedName )
            // InternalComponentModel.g:637:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getToKeyword_4());
            		
            // InternalComponentModel.g:658:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:659:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:659:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:660:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortInAccess().getFullStopKeyword_6());
            		
            // InternalComponentModel.g:675:3: ( (otherlv_7= RULE_ID ) )
            // InternalComponentModel.g:676:4: (otherlv_7= RULE_ID )
            {
            // InternalComponentModel.g:676:4: (otherlv_7= RULE_ID )
            // InternalComponentModel.g:677:5: otherlv_7= RULE_ID
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
    // InternalComponentModel.g:692:1: entryRuleSystemPortOut returns [EObject current=null] : iv_ruleSystemPortOut= ruleSystemPortOut EOF ;
    public final EObject entryRuleSystemPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortOut = null;


        try {
            // InternalComponentModel.g:692:54: (iv_ruleSystemPortOut= ruleSystemPortOut EOF )
            // InternalComponentModel.g:693:2: iv_ruleSystemPortOut= ruleSystemPortOut EOF
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
    // InternalComponentModel.g:699:1: ruleSystemPortOut returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:705:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalComponentModel.g:706:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalComponentModel.g:706:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalComponentModel.g:707:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getOutKeyword_2());
            		
            // InternalComponentModel.g:719:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalComponentModel.g:720:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:720:4: (lv_name_3_0= ruleQualifiedName )
            // InternalComponentModel.g:721:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFromKeyword_4());
            		
            // InternalComponentModel.g:742:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:743:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:743:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:744:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6());
            		
            // InternalComponentModel.g:759:3: ( (otherlv_7= RULE_ID ) )
            // InternalComponentModel.g:760:4: (otherlv_7= RULE_ID )
            {
            // InternalComponentModel.g:760:4: (otherlv_7= RULE_ID )
            // InternalComponentModel.g:761:5: otherlv_7= RULE_ID
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
    // InternalComponentModel.g:776:1: entryRuleCompConnDec returns [EObject current=null] : iv_ruleCompConnDec= ruleCompConnDec EOF ;
    public final EObject entryRuleCompConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompConnDec = null;


        try {
            // InternalComponentModel.g:776:52: (iv_ruleCompConnDec= ruleCompConnDec EOF )
            // InternalComponentModel.g:777:2: iv_ruleCompConnDec= ruleCompConnDec EOF
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
    // InternalComponentModel.g:783:1: ruleCompConnDec returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
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
            // InternalComponentModel.g:789:2: ( (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalComponentModel.g:790:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalComponentModel.g:790:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalComponentModel.g:791:3: otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCompConnDecAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCompConnDecAccess().getConnectionKeyword_1());
            		
            // InternalComponentModel.g:799:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentModel.g:800:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentModel.g:800:4: (lv_name_2_0= RULE_ID )
            // InternalComponentModel.g:801:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompConnDecAccess().getFromKeyword_3());
            		
            // InternalComponentModel.g:821:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponentModel.g:822:4: (otherlv_4= RULE_ID )
            {
            // InternalComponentModel.g:822:4: (otherlv_4= RULE_ID )
            // InternalComponentModel.g:823:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCompConnDecAccess().getFullStopKeyword_5());
            		
            // InternalComponentModel.g:838:3: ( (otherlv_6= RULE_ID ) )
            // InternalComponentModel.g:839:4: (otherlv_6= RULE_ID )
            {
            // InternalComponentModel.g:839:4: (otherlv_6= RULE_ID )
            // InternalComponentModel.g:840:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getCompConnDecAccess().getToKeyword_7());
            		
            // InternalComponentModel.g:855:3: ( (otherlv_8= RULE_ID ) )
            // InternalComponentModel.g:856:4: (otherlv_8= RULE_ID )
            {
            // InternalComponentModel.g:856:4: (otherlv_8= RULE_ID )
            // InternalComponentModel.g:857:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_8, grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getCompConnDecAccess().getFullStopKeyword_9());
            		
            // InternalComponentModel.g:872:3: ( (otherlv_10= RULE_ID ) )
            // InternalComponentModel.g:873:4: (otherlv_10= RULE_ID )
            {
            // InternalComponentModel.g:873:4: (otherlv_10= RULE_ID )
            // InternalComponentModel.g:874:5: otherlv_10= RULE_ID
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
    // InternalComponentModel.g:889:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalComponentModel.g:889:54: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalComponentModel.g:890:2: iv_ruleComponentImpl= ruleComponentImpl EOF
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
    // InternalComponentModel.g:896:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:902:2: ( (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalComponentModel.g:903:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalComponentModel.g:903:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalComponentModel.g:904:3: otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentImplAccess().getImplementationKeyword_1());
            		
            // InternalComponentModel.g:912:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:913:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:913:4: (lv_name_2_0= ruleQualifiedName )
            // InternalComponentModel.g:914:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getColonKeyword_3());
            		
            // InternalComponentModel.g:935:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponentModel.g:936:4: (otherlv_4= RULE_ID )
            {
            // InternalComponentModel.g:936:4: (otherlv_4= RULE_ID )
            // InternalComponentModel.g:937:5: otherlv_4= RULE_ID
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
    // InternalComponentModel.g:952:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalComponentModel.g:952:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalComponentModel.g:953:2: iv_ruleComponentType= ruleComponentType EOF
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
    // InternalComponentModel.g:959:1: ruleComponentType returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleAbstractComponentFeatures ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_componentFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:965:2: ( (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleAbstractComponentFeatures ) )* otherlv_5= '}' ) )
            // InternalComponentModel.g:966:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleAbstractComponentFeatures ) )* otherlv_5= '}' )
            {
            // InternalComponentModel.g:966:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleAbstractComponentFeatures ) )* otherlv_5= '}' )
            // InternalComponentModel.g:967:3: otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleAbstractComponentFeatures ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getTypeKeyword_1());
            		
            // InternalComponentModel.g:975:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:976:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:976:4: (lv_name_2_0= ruleQualifiedName )
            // InternalComponentModel.g:977:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentModel.g:998:3: ( (lv_componentFeatures_4_0= ruleAbstractComponentFeatures ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12||LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentModel.g:999:4: (lv_componentFeatures_4_0= ruleAbstractComponentFeatures )
            	    {
            	    // InternalComponentModel.g:999:4: (lv_componentFeatures_4_0= ruleAbstractComponentFeatures )
            	    // InternalComponentModel.g:1000:5: lv_componentFeatures_4_0= ruleAbstractComponentFeatures
            	    {

            	    					newCompositeNode(grammarAccess.getComponentTypeAccess().getComponentFeaturesAbstractComponentFeaturesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_componentFeatures_4_0=ruleAbstractComponentFeatures();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentFeatures",
            	    						lv_componentFeatures_4_0,
            	    						"hu.bme.mit.ComponentModel.AbstractComponentFeatures");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAbstractComponentFeatures"
    // InternalComponentModel.g:1025:1: entryRuleAbstractComponentFeatures returns [EObject current=null] : iv_ruleAbstractComponentFeatures= ruleAbstractComponentFeatures EOF ;
    public final EObject entryRuleAbstractComponentFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentFeatures = null;


        try {
            // InternalComponentModel.g:1025:66: (iv_ruleAbstractComponentFeatures= ruleAbstractComponentFeatures EOF )
            // InternalComponentModel.g:1026:2: iv_ruleAbstractComponentFeatures= ruleAbstractComponentFeatures EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentFeatures=ruleAbstractComponentFeatures();

            state._fsp--;

             current =iv_ruleAbstractComponentFeatures; 
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
    // $ANTLR end "entryRuleAbstractComponentFeatures"


    // $ANTLR start "ruleAbstractComponentFeatures"
    // InternalComponentModel.g:1032:1: ruleAbstractComponentFeatures returns [EObject current=null] : (this_Port_0= rulePort | this_EModelDec_1= ruleEModelDec ) ;
    public final EObject ruleAbstractComponentFeatures() throws RecognitionException {
        EObject current = null;

        EObject this_Port_0 = null;

        EObject this_EModelDec_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1038:2: ( (this_Port_0= rulePort | this_EModelDec_1= ruleEModelDec ) )
            // InternalComponentModel.g:1039:2: (this_Port_0= rulePort | this_EModelDec_1= ruleEModelDec )
            {
            // InternalComponentModel.g:1039:2: (this_Port_0= rulePort | this_EModelDec_1= ruleEModelDec )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentModel.g:1040:3: this_Port_0= rulePort
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentFeaturesAccess().getPortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_0=rulePort();

                    state._fsp--;


                    			current = this_Port_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:1049:3: this_EModelDec_1= ruleEModelDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentFeaturesAccess().getEModelDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EModelDec_1=ruleEModelDec();

                    state._fsp--;


                    			current = this_EModelDec_1;
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
    // $ANTLR end "ruleAbstractComponentFeatures"


    // $ANTLR start "entryRulePort"
    // InternalComponentModel.g:1061:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalComponentModel.g:1061:45: (iv_rulePort= rulePort EOF )
            // InternalComponentModel.g:1062:2: iv_rulePort= rulePort EOF
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
    // InternalComponentModel.g:1068:1: rulePort returns [EObject current=null] : (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_InPort_0 = null;

        EObject this_OutPort_1 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1074:2: ( (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort ) )
            // InternalComponentModel.g:1075:2: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            {
            // InternalComponentModel.g:1075:2: (this_InPort_0= ruleInPort | this_OutPort_1= ruleOutPort )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==28) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==24) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==23) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentModel.g:1076:3: this_InPort_0= ruleInPort
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
                    // InternalComponentModel.g:1085:3: this_OutPort_1= ruleOutPort
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
    // InternalComponentModel.g:1097:1: entryRuleInPort returns [EObject current=null] : iv_ruleInPort= ruleInPort EOF ;
    public final EObject entryRuleInPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPort = null;


        try {
            // InternalComponentModel.g:1097:47: (iv_ruleInPort= ruleInPort EOF )
            // InternalComponentModel.g:1098:2: iv_ruleInPort= ruleInPort EOF
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
    // InternalComponentModel.g:1104:1: ruleInPort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_nameInPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleInPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nameInPort_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1110:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_nameInPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalComponentModel.g:1111:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_nameInPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalComponentModel.g:1111:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_nameInPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalComponentModel.g:1112:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_nameInPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getInPortAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getInPortAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInPortAccess().getInKeyword_2());
            		
            // InternalComponentModel.g:1124:3: ( (lv_nameInPort_3_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1125:4: (lv_nameInPort_3_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1125:4: (lv_nameInPort_3_0= ruleQualifiedName )
            // InternalComponentModel.g:1126:5: lv_nameInPort_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getInPortAccess().getNameInPortQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_nameInPort_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInPortRule());
            					}
            					set(
            						current,
            						"nameInPort",
            						lv_nameInPort_3_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getInPortAccess().getColonKeyword_4());
            		
            // InternalComponentModel.g:1147:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:1148:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:1148:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:1149:5: otherlv_5= RULE_ID
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
    // InternalComponentModel.g:1164:1: entryRuleOutPort returns [EObject current=null] : iv_ruleOutPort= ruleOutPort EOF ;
    public final EObject entryRuleOutPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPort = null;


        try {
            // InternalComponentModel.g:1164:48: (iv_ruleOutPort= ruleOutPort EOF )
            // InternalComponentModel.g:1165:2: iv_ruleOutPort= ruleOutPort EOF
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
    // InternalComponentModel.g:1171:1: ruleOutPort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_nameOutPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleOutPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nameOutPort_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1177:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_nameOutPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalComponentModel.g:1178:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_nameOutPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalComponentModel.g:1178:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_nameOutPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalComponentModel.g:1179:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_nameOutPort_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getOutPortAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getOutPortAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutPortAccess().getOutKeyword_2());
            		
            // InternalComponentModel.g:1191:3: ( (lv_nameOutPort_3_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1192:4: (lv_nameOutPort_3_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1192:4: (lv_nameOutPort_3_0= ruleQualifiedName )
            // InternalComponentModel.g:1193:5: lv_nameOutPort_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getOutPortAccess().getNameOutPortQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_nameOutPort_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutPortRule());
            					}
            					set(
            						current,
            						"nameOutPort",
            						lv_nameOutPort_3_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getOutPortAccess().getColonKeyword_4());
            		
            // InternalComponentModel.g:1214:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:1215:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:1215:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:1216:5: otherlv_5= RULE_ID
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


    // $ANTLR start "entryRuleEModelDec"
    // InternalComponentModel.g:1231:1: entryRuleEModelDec returns [EObject current=null] : iv_ruleEModelDec= ruleEModelDec EOF ;
    public final EObject entryRuleEModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelDec = null;


        try {
            // InternalComponentModel.g:1231:50: (iv_ruleEModelDec= ruleEModelDec EOF )
            // InternalComponentModel.g:1232:2: iv_ruleEModelDec= ruleEModelDec EOF
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
    // InternalComponentModel.g:1238:1: ruleEModelDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'model' ( (lv_nameEModelDec_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleEModelDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nameEModelDec_2_0 = null;

        EObject lv_emodelElements_4_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1244:2: ( (otherlv_0= 'error' otherlv_1= 'model' ( (lv_nameEModelDec_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' ) )
            // InternalComponentModel.g:1245:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_nameEModelDec_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' )
            {
            // InternalComponentModel.g:1245:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_nameEModelDec_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}' )
            // InternalComponentModel.g:1246:3: otherlv_0= 'error' otherlv_1= 'model' ( (lv_nameEModelDec_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleEModelElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEModelDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEModelDecAccess().getModelKeyword_1());
            		
            // InternalComponentModel.g:1254:3: ( (lv_nameEModelDec_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1255:4: (lv_nameEModelDec_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1255:4: (lv_nameEModelDec_2_0= ruleQualifiedName )
            // InternalComponentModel.g:1256:5: lv_nameEModelDec_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getEModelDecAccess().getNameEModelDecQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_nameEModelDec_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEModelDecRule());
            					}
            					set(
            						current,
            						"nameEModelDec",
            						lv_nameEModelDec_2_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getEModelDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentModel.g:1277:3: ( (lv_emodelElements_4_0= ruleEModelElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12||LA12_0==16||LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentModel.g:1278:4: (lv_emodelElements_4_0= ruleEModelElement )
            	    {
            	    // InternalComponentModel.g:1278:4: (lv_emodelElements_4_0= ruleEModelElement )
            	    // InternalComponentModel.g:1279:5: lv_emodelElements_4_0= ruleEModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getEModelDecAccess().getEmodelElementsEModelElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_emodelElements_4_0=ruleEModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEModelDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"emodelElements",
            	    						lv_emodelElements_4_0,
            	    						"hu.bme.mit.ComponentModel.EModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEModelDecAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalComponentModel.g:1304:1: entryRuleEModelElement returns [EObject current=null] : iv_ruleEModelElement= ruleEModelElement EOF ;
    public final EObject entryRuleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelElement = null;


        try {
            // InternalComponentModel.g:1304:54: (iv_ruleEModelElement= ruleEModelElement EOF )
            // InternalComponentModel.g:1305:2: iv_ruleEModelElement= ruleEModelElement EOF
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
    // InternalComponentModel.g:1311:1: ruleEModelElement returns [EObject current=null] : (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_Port_2= rulePort ) ;
    public final EObject ruleEModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_StateDec_0 = null;

        EObject this_TransitionDec_1 = null;

        EObject this_Port_2 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1317:2: ( (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_Port_2= rulePort ) )
            // InternalComponentModel.g:1318:2: (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_Port_2= rulePort )
            {
            // InternalComponentModel.g:1318:2: (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_Port_2= rulePort )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 12:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalComponentModel.g:1319:3: this_StateDec_0= ruleStateDec
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
                    // InternalComponentModel.g:1328:3: this_TransitionDec_1= ruleTransitionDec
                    {

                    			newCompositeNode(grammarAccess.getEModelElementAccess().getTransitionDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransitionDec_1=ruleTransitionDec();

                    state._fsp--;


                    			current = this_TransitionDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:1337:3: this_Port_2= rulePort
                    {

                    			newCompositeNode(grammarAccess.getEModelElementAccess().getPortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_2=rulePort();

                    state._fsp--;


                    			current = this_Port_2;
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
    // InternalComponentModel.g:1349:1: entryRuleStateDec returns [EObject current=null] : iv_ruleStateDec= ruleStateDec EOF ;
    public final EObject entryRuleStateDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDec = null;


        try {
            // InternalComponentModel.g:1349:49: (iv_ruleStateDec= ruleStateDec EOF )
            // InternalComponentModel.g:1350:2: iv_ruleStateDec= ruleStateDec EOF
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
    // InternalComponentModel.g:1356:1: ruleStateDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'state' ( (lv_nameStateDec_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleStateDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_nameStateDec_2_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1362:2: ( (otherlv_0= 'error' otherlv_1= 'state' ( (lv_nameStateDec_2_0= ruleQualifiedName ) ) ) )
            // InternalComponentModel.g:1363:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_nameStateDec_2_0= ruleQualifiedName ) ) )
            {
            // InternalComponentModel.g:1363:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_nameStateDec_2_0= ruleQualifiedName ) ) )
            // InternalComponentModel.g:1364:3: otherlv_0= 'error' otherlv_1= 'state' ( (lv_nameStateDec_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateDecAccess().getStateKeyword_1());
            		
            // InternalComponentModel.g:1372:3: ( (lv_nameStateDec_2_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1373:4: (lv_nameStateDec_2_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1373:4: (lv_nameStateDec_2_0= ruleQualifiedName )
            // InternalComponentModel.g:1374:5: lv_nameStateDec_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStateDecAccess().getNameStateDecQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_nameStateDec_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDecRule());
            					}
            					set(
            						current,
            						"nameStateDec",
            						lv_nameStateDec_2_0,
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
    // $ANTLR end "ruleStateDec"


    // $ANTLR start "entryRuleTransitionDec"
    // InternalComponentModel.g:1395:1: entryRuleTransitionDec returns [EObject current=null] : iv_ruleTransitionDec= ruleTransitionDec EOF ;
    public final EObject entryRuleTransitionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDec = null;


        try {
            // InternalComponentModel.g:1395:54: (iv_ruleTransitionDec= ruleTransitionDec EOF )
            // InternalComponentModel.g:1396:2: iv_ruleTransitionDec= ruleTransitionDec EOF
            {
             newCompositeNode(grammarAccess.getTransitionDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDec=ruleTransitionDec();

            state._fsp--;

             current =iv_ruleTransitionDec; 
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
    // $ANTLR end "entryRuleTransitionDec"


    // $ANTLR start "ruleTransitionDec"
    // InternalComponentModel.g:1402:1: ruleTransitionDec returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_nameEventDec_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransitionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nameEventDec_1_0 = null;

        EObject lv_Features_3_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1408:2: ( (otherlv_0= 'transition' ( (lv_nameEventDec_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) )
            // InternalComponentModel.g:1409:2: (otherlv_0= 'transition' ( (lv_nameEventDec_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            {
            // InternalComponentModel.g:1409:2: (otherlv_0= 'transition' ( (lv_nameEventDec_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            // InternalComponentModel.g:1410:3: otherlv_0= 'transition' ( (lv_nameEventDec_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDecAccess().getTransitionKeyword_0());
            		
            // InternalComponentModel.g:1414:3: ( (lv_nameEventDec_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1415:4: (lv_nameEventDec_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1415:4: (lv_nameEventDec_1_0= ruleQualifiedName )
            // InternalComponentModel.g:1416:5: lv_nameEventDec_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTransitionDecAccess().getNameEventDecQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_nameEventDec_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDecRule());
            					}
            					set(
            						current,
            						"nameEventDec",
            						lv_nameEventDec_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentModel.g:1437:3: ( (lv_Features_3_0= ruleTransitionFeatureDec ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=32 && LA14_0<=33)||(LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentModel.g:1438:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    {
            	    // InternalComponentModel.g:1438:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    // InternalComponentModel.g:1439:5: lv_Features_3_0= ruleTransitionFeatureDec
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_Features_3_0=ruleTransitionFeatureDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitionDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Features",
            	    						lv_Features_3_0,
            	    						"hu.bme.mit.ComponentModel.TransitionFeatureDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionDecAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTransitionDec"


    // $ANTLR start "entryRuleTransitionFeatureDec"
    // InternalComponentModel.g:1464:1: entryRuleTransitionFeatureDec returns [EObject current=null] : iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF ;
    public final EObject entryRuleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFeatureDec = null;


        try {
            // InternalComponentModel.g:1464:61: (iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF )
            // InternalComponentModel.g:1465:2: iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF
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
    // InternalComponentModel.g:1471:1: ruleTransitionFeatureDec returns [EObject current=null] : (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) ;
    public final EObject ruleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TransitionState_0 = null;

        EObject this_TriggerDec_1 = null;

        EObject this_ActionDec_2 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1477:2: ( (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) )
            // InternalComponentModel.g:1478:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            {
            // InternalComponentModel.g:1478:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalComponentModel.g:1479:3: this_TransitionState_0= ruleTransitionState
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
                    // InternalComponentModel.g:1488:3: this_TriggerDec_1= ruleTriggerDec
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
                    // InternalComponentModel.g:1497:3: this_ActionDec_2= ruleActionDec
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
                    // InternalComponentModel.g:1506:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    {
                    // InternalComponentModel.g:1506:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    // InternalComponentModel.g:1507:4: otherlv_3= 'occurrence' () ruleDOUBLE
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionFeatureDecAccess().getOccurrenceKeyword_3_0());
                    			
                    // InternalComponentModel.g:1511:4: ()
                    // InternalComponentModel.g:1512:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTransitionFeatureDecAccess().getOccurrenceDecAction_3_1(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getDOUBLEParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleDOUBLE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // InternalComponentModel.g:1530:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalComponentModel.g:1530:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalComponentModel.g:1531:2: iv_ruleTransitionState= ruleTransitionState EOF
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
    // InternalComponentModel.g:1537:1: ruleTransitionState returns [EObject current=null] : (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalComponentModel.g:1543:2: ( (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalComponentModel.g:1544:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalComponentModel.g:1544:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // InternalComponentModel.g:1545:3: otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
            		
            // InternalComponentModel.g:1549:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentModel.g:1550:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentModel.g:1550:4: (otherlv_1= RULE_ID )
            // InternalComponentModel.g:1551:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalComponentModel.g:1566:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:1567:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:1567:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:1568:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionStateAccess().getTargetStateStateDecCrossReference_3_0());
            				

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
    // InternalComponentModel.g:1583:1: entryRuleTriggerDec returns [EObject current=null] : iv_ruleTriggerDec= ruleTriggerDec EOF ;
    public final EObject entryRuleTriggerDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDec = null;


        try {
            // InternalComponentModel.g:1583:51: (iv_ruleTriggerDec= ruleTriggerDec EOF )
            // InternalComponentModel.g:1584:2: iv_ruleTriggerDec= ruleTriggerDec EOF
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
    // InternalComponentModel.g:1590:1: ruleTriggerDec returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTriggerDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1596:2: ( (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalComponentModel.g:1597:2: (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalComponentModel.g:1597:2: (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalComponentModel.g:1598:3: otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDecAccess().getTriggerKeyword_0());
            		
            // InternalComponentModel.g:1602:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1603:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1603:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:1604:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTriggerDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerDecAccess().getColonKeyword_2());
            		
            // InternalComponentModel.g:1625:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:1626:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:1626:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:1627:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getTriggerDecAccess().getPortInstancePortCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerDecAccess().getFullStopKeyword_4());
            		
            // InternalComponentModel.g:1642:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:1643:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:1643:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:1644:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTriggerDecAccess().getErrorModeErrorModesCrossReference_5_0());
            				

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
    // InternalComponentModel.g:1659:1: entryRuleActionDec returns [EObject current=null] : iv_ruleActionDec= ruleActionDec EOF ;
    public final EObject entryRuleActionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDec = null;


        try {
            // InternalComponentModel.g:1659:50: (iv_ruleActionDec= ruleActionDec EOF )
            // InternalComponentModel.g:1660:2: iv_ruleActionDec= ruleActionDec EOF
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
    // InternalComponentModel.g:1666:1: ruleActionDec returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleActionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponentModel.g:1672:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalComponentModel.g:1673:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalComponentModel.g:1673:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalComponentModel.g:1674:3: otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDecAccess().getActionKeyword_0());
            		
            // InternalComponentModel.g:1678:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalComponentModel.g:1679:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalComponentModel.g:1679:4: (lv_name_1_0= ruleQualifiedName )
            // InternalComponentModel.g:1680:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getActionDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.ComponentModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionDecAccess().getColonKeyword_2());
            		
            // InternalComponentModel.g:1701:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentModel.g:1702:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentModel.g:1702:4: (otherlv_3= RULE_ID )
            // InternalComponentModel.g:1703:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getActionDecAccess().getPortInstancePortCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActionDecAccess().getFullStopKeyword_4());
            		
            // InternalComponentModel.g:1718:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentModel.g:1719:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentModel.g:1719:4: (otherlv_5= RULE_ID )
            // InternalComponentModel.g:1720:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getActionDecAccess().getErrorModeErrorModesCrossReference_5_0());
            				

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


    // $ANTLR start "entryRuleDOUBLE"
    // InternalComponentModel.g:1735:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalComponentModel.g:1735:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalComponentModel.g:1736:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalComponentModel.g:1742:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalComponentModel.g:1748:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalComponentModel.g:1749:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalComponentModel.g:1749:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalComponentModel.g:1750:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_27); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080019000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001B00008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});

}