package hu.bme.mit.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.services.ComponentModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import emodel'", "'system connection'", "'from'", "'.'", "'to'", "'system declaration'", "'{'", "'}'", "'system port in'", "'system port out'", "'connection'", "'component type'", "'port instance in'", "':'", "'port instance out'", "'port type'", "'eModes'", "'eMode'", "'component implementation'"
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

    	public void setGrammarAccess(ComponentModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleComponentModel"
    // InternalComponentModel.g:53:1: entryRuleComponentModel : ruleComponentModel EOF ;
    public final void entryRuleComponentModel() throws RecognitionException {
        try {
            // InternalComponentModel.g:54:1: ( ruleComponentModel EOF )
            // InternalComponentModel.g:55:1: ruleComponentModel EOF
            {
             before(grammarAccess.getComponentModelRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModel();

            state._fsp--;

             after(grammarAccess.getComponentModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentModel"


    // $ANTLR start "ruleComponentModel"
    // InternalComponentModel.g:62:1: ruleComponentModel : ( ( rule__ComponentModel__ElementsAssignment )* ) ;
    public final void ruleComponentModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:66:2: ( ( ( rule__ComponentModel__ElementsAssignment )* ) )
            // InternalComponentModel.g:67:2: ( ( rule__ComponentModel__ElementsAssignment )* )
            {
            // InternalComponentModel.g:67:2: ( ( rule__ComponentModel__ElementsAssignment )* )
            // InternalComponentModel.g:68:3: ( rule__ComponentModel__ElementsAssignment )*
            {
             before(grammarAccess.getComponentModelAccess().getElementsAssignment()); 
            // InternalComponentModel.g:69:3: ( rule__ComponentModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentModel.g:69:4: rule__ComponentModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ComponentModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getComponentModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalComponentModel.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalComponentModel.g:79:1: ( ruleAbstractElement EOF )
            // InternalComponentModel.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalComponentModel.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalComponentModel.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalComponentModel.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalComponentModel.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalComponentModel.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalComponentModel.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImportE"
    // InternalComponentModel.g:103:1: entryRuleImportE : ruleImportE EOF ;
    public final void entryRuleImportE() throws RecognitionException {
        try {
            // InternalComponentModel.g:104:1: ( ruleImportE EOF )
            // InternalComponentModel.g:105:1: ruleImportE EOF
            {
             before(grammarAccess.getImportERule()); 
            pushFollow(FOLLOW_1);
            ruleImportE();

            state._fsp--;

             after(grammarAccess.getImportERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportE"


    // $ANTLR start "ruleImportE"
    // InternalComponentModel.g:112:1: ruleImportE : ( ( rule__ImportE__Group__0 ) ) ;
    public final void ruleImportE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:116:2: ( ( ( rule__ImportE__Group__0 ) ) )
            // InternalComponentModel.g:117:2: ( ( rule__ImportE__Group__0 ) )
            {
            // InternalComponentModel.g:117:2: ( ( rule__ImportE__Group__0 ) )
            // InternalComponentModel.g:118:3: ( rule__ImportE__Group__0 )
            {
             before(grammarAccess.getImportEAccess().getGroup()); 
            // InternalComponentModel.g:119:3: ( rule__ImportE__Group__0 )
            // InternalComponentModel.g:119:4: rule__ImportE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportE"


    // $ANTLR start "entryRuleSystemConnDec"
    // InternalComponentModel.g:128:1: entryRuleSystemConnDec : ruleSystemConnDec EOF ;
    public final void entryRuleSystemConnDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:129:1: ( ruleSystemConnDec EOF )
            // InternalComponentModel.g:130:1: ruleSystemConnDec EOF
            {
             before(grammarAccess.getSystemConnDecRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemConnDec();

            state._fsp--;

             after(grammarAccess.getSystemConnDecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemConnDec"


    // $ANTLR start "ruleSystemConnDec"
    // InternalComponentModel.g:137:1: ruleSystemConnDec : ( ( rule__SystemConnDec__Group__0 ) ) ;
    public final void ruleSystemConnDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:141:2: ( ( ( rule__SystemConnDec__Group__0 ) ) )
            // InternalComponentModel.g:142:2: ( ( rule__SystemConnDec__Group__0 ) )
            {
            // InternalComponentModel.g:142:2: ( ( rule__SystemConnDec__Group__0 ) )
            // InternalComponentModel.g:143:3: ( rule__SystemConnDec__Group__0 )
            {
             before(grammarAccess.getSystemConnDecAccess().getGroup()); 
            // InternalComponentModel.g:144:3: ( rule__SystemConnDec__Group__0 )
            // InternalComponentModel.g:144:4: rule__SystemConnDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemConnDec"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalComponentModel.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalComponentModel.g:154:1: ( ruleQualifiedName EOF )
            // InternalComponentModel.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalComponentModel.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalComponentModel.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalComponentModel.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalComponentModel.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalComponentModel.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalComponentModel.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSystemDec"
    // InternalComponentModel.g:178:1: entryRuleSystemDec : ruleSystemDec EOF ;
    public final void entryRuleSystemDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:179:1: ( ruleSystemDec EOF )
            // InternalComponentModel.g:180:1: ruleSystemDec EOF
            {
             before(grammarAccess.getSystemDecRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemDec();

            state._fsp--;

             after(grammarAccess.getSystemDecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemDec"


    // $ANTLR start "ruleSystemDec"
    // InternalComponentModel.g:187:1: ruleSystemDec : ( ( rule__SystemDec__Group__0 ) ) ;
    public final void ruleSystemDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:191:2: ( ( ( rule__SystemDec__Group__0 ) ) )
            // InternalComponentModel.g:192:2: ( ( rule__SystemDec__Group__0 ) )
            {
            // InternalComponentModel.g:192:2: ( ( rule__SystemDec__Group__0 ) )
            // InternalComponentModel.g:193:3: ( rule__SystemDec__Group__0 )
            {
             before(grammarAccess.getSystemDecAccess().getGroup()); 
            // InternalComponentModel.g:194:3: ( rule__SystemDec__Group__0 )
            // InternalComponentModel.g:194:4: rule__SystemDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemDec"


    // $ANTLR start "entryRuleAbstractFeatures"
    // InternalComponentModel.g:203:1: entryRuleAbstractFeatures : ruleAbstractFeatures EOF ;
    public final void entryRuleAbstractFeatures() throws RecognitionException {
        try {
            // InternalComponentModel.g:204:1: ( ruleAbstractFeatures EOF )
            // InternalComponentModel.g:205:1: ruleAbstractFeatures EOF
            {
             before(grammarAccess.getAbstractFeaturesRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractFeatures();

            state._fsp--;

             after(grammarAccess.getAbstractFeaturesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractFeatures"


    // $ANTLR start "ruleAbstractFeatures"
    // InternalComponentModel.g:212:1: ruleAbstractFeatures : ( ( rule__AbstractFeatures__Alternatives ) ) ;
    public final void ruleAbstractFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:216:2: ( ( ( rule__AbstractFeatures__Alternatives ) ) )
            // InternalComponentModel.g:217:2: ( ( rule__AbstractFeatures__Alternatives ) )
            {
            // InternalComponentModel.g:217:2: ( ( rule__AbstractFeatures__Alternatives ) )
            // InternalComponentModel.g:218:3: ( rule__AbstractFeatures__Alternatives )
            {
             before(grammarAccess.getAbstractFeaturesAccess().getAlternatives()); 
            // InternalComponentModel.g:219:3: ( rule__AbstractFeatures__Alternatives )
            // InternalComponentModel.g:219:4: rule__AbstractFeatures__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFeatures__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractFeaturesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractFeatures"


    // $ANTLR start "entryRuleSystemPortDec"
    // InternalComponentModel.g:228:1: entryRuleSystemPortDec : ruleSystemPortDec EOF ;
    public final void entryRuleSystemPortDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:229:1: ( ruleSystemPortDec EOF )
            // InternalComponentModel.g:230:1: ruleSystemPortDec EOF
            {
             before(grammarAccess.getSystemPortDecRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemPortDec();

            state._fsp--;

             after(grammarAccess.getSystemPortDecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemPortDec"


    // $ANTLR start "ruleSystemPortDec"
    // InternalComponentModel.g:237:1: ruleSystemPortDec : ( ( rule__SystemPortDec__Alternatives ) ) ;
    public final void ruleSystemPortDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:241:2: ( ( ( rule__SystemPortDec__Alternatives ) ) )
            // InternalComponentModel.g:242:2: ( ( rule__SystemPortDec__Alternatives ) )
            {
            // InternalComponentModel.g:242:2: ( ( rule__SystemPortDec__Alternatives ) )
            // InternalComponentModel.g:243:3: ( rule__SystemPortDec__Alternatives )
            {
             before(grammarAccess.getSystemPortDecAccess().getAlternatives()); 
            // InternalComponentModel.g:244:3: ( rule__SystemPortDec__Alternatives )
            // InternalComponentModel.g:244:4: rule__SystemPortDec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortDec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortDecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemPortDec"


    // $ANTLR start "entryRuleSystemPortIn"
    // InternalComponentModel.g:253:1: entryRuleSystemPortIn : ruleSystemPortIn EOF ;
    public final void entryRuleSystemPortIn() throws RecognitionException {
        try {
            // InternalComponentModel.g:254:1: ( ruleSystemPortIn EOF )
            // InternalComponentModel.g:255:1: ruleSystemPortIn EOF
            {
             before(grammarAccess.getSystemPortInRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemPortIn();

            state._fsp--;

             after(grammarAccess.getSystemPortInRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemPortIn"


    // $ANTLR start "ruleSystemPortIn"
    // InternalComponentModel.g:262:1: ruleSystemPortIn : ( ( rule__SystemPortIn__Group__0 ) ) ;
    public final void ruleSystemPortIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:266:2: ( ( ( rule__SystemPortIn__Group__0 ) ) )
            // InternalComponentModel.g:267:2: ( ( rule__SystemPortIn__Group__0 ) )
            {
            // InternalComponentModel.g:267:2: ( ( rule__SystemPortIn__Group__0 ) )
            // InternalComponentModel.g:268:3: ( rule__SystemPortIn__Group__0 )
            {
             before(grammarAccess.getSystemPortInAccess().getGroup()); 
            // InternalComponentModel.g:269:3: ( rule__SystemPortIn__Group__0 )
            // InternalComponentModel.g:269:4: rule__SystemPortIn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemPortIn"


    // $ANTLR start "entryRuleSystemPortOut"
    // InternalComponentModel.g:278:1: entryRuleSystemPortOut : ruleSystemPortOut EOF ;
    public final void entryRuleSystemPortOut() throws RecognitionException {
        try {
            // InternalComponentModel.g:279:1: ( ruleSystemPortOut EOF )
            // InternalComponentModel.g:280:1: ruleSystemPortOut EOF
            {
             before(grammarAccess.getSystemPortOutRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemPortOut();

            state._fsp--;

             after(grammarAccess.getSystemPortOutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemPortOut"


    // $ANTLR start "ruleSystemPortOut"
    // InternalComponentModel.g:287:1: ruleSystemPortOut : ( ( rule__SystemPortOut__Group__0 ) ) ;
    public final void ruleSystemPortOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:291:2: ( ( ( rule__SystemPortOut__Group__0 ) ) )
            // InternalComponentModel.g:292:2: ( ( rule__SystemPortOut__Group__0 ) )
            {
            // InternalComponentModel.g:292:2: ( ( rule__SystemPortOut__Group__0 ) )
            // InternalComponentModel.g:293:3: ( rule__SystemPortOut__Group__0 )
            {
             before(grammarAccess.getSystemPortOutAccess().getGroup()); 
            // InternalComponentModel.g:294:3: ( rule__SystemPortOut__Group__0 )
            // InternalComponentModel.g:294:4: rule__SystemPortOut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemPortOut"


    // $ANTLR start "entryRuleCompConnDec"
    // InternalComponentModel.g:303:1: entryRuleCompConnDec : ruleCompConnDec EOF ;
    public final void entryRuleCompConnDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:304:1: ( ruleCompConnDec EOF )
            // InternalComponentModel.g:305:1: ruleCompConnDec EOF
            {
             before(grammarAccess.getCompConnDecRule()); 
            pushFollow(FOLLOW_1);
            ruleCompConnDec();

            state._fsp--;

             after(grammarAccess.getCompConnDecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompConnDec"


    // $ANTLR start "ruleCompConnDec"
    // InternalComponentModel.g:312:1: ruleCompConnDec : ( ( rule__CompConnDec__Group__0 ) ) ;
    public final void ruleCompConnDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:316:2: ( ( ( rule__CompConnDec__Group__0 ) ) )
            // InternalComponentModel.g:317:2: ( ( rule__CompConnDec__Group__0 ) )
            {
            // InternalComponentModel.g:317:2: ( ( rule__CompConnDec__Group__0 ) )
            // InternalComponentModel.g:318:3: ( rule__CompConnDec__Group__0 )
            {
             before(grammarAccess.getCompConnDecAccess().getGroup()); 
            // InternalComponentModel.g:319:3: ( rule__CompConnDec__Group__0 )
            // InternalComponentModel.g:319:4: rule__CompConnDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompConnDec"


    // $ANTLR start "entryRuleComponentType"
    // InternalComponentModel.g:328:1: entryRuleComponentType : ruleComponentType EOF ;
    public final void entryRuleComponentType() throws RecognitionException {
        try {
            // InternalComponentModel.g:329:1: ( ruleComponentType EOF )
            // InternalComponentModel.g:330:1: ruleComponentType EOF
            {
             before(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getComponentTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalComponentModel.g:337:1: ruleComponentType : ( ( rule__ComponentType__Group__0 ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:341:2: ( ( ( rule__ComponentType__Group__0 ) ) )
            // InternalComponentModel.g:342:2: ( ( rule__ComponentType__Group__0 ) )
            {
            // InternalComponentModel.g:342:2: ( ( rule__ComponentType__Group__0 ) )
            // InternalComponentModel.g:343:3: ( rule__ComponentType__Group__0 )
            {
             before(grammarAccess.getComponentTypeAccess().getGroup()); 
            // InternalComponentModel.g:344:3: ( rule__ComponentType__Group__0 )
            // InternalComponentModel.g:344:4: rule__ComponentType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRuleComponentFeature"
    // InternalComponentModel.g:353:1: entryRuleComponentFeature : ruleComponentFeature EOF ;
    public final void entryRuleComponentFeature() throws RecognitionException {
        try {
            // InternalComponentModel.g:354:1: ( ruleComponentFeature EOF )
            // InternalComponentModel.g:355:1: ruleComponentFeature EOF
            {
             before(grammarAccess.getComponentFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentFeature();

            state._fsp--;

             after(grammarAccess.getComponentFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentFeature"


    // $ANTLR start "ruleComponentFeature"
    // InternalComponentModel.g:362:1: ruleComponentFeature : ( ( rule__ComponentFeature__PortsAssignment ) ) ;
    public final void ruleComponentFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:366:2: ( ( ( rule__ComponentFeature__PortsAssignment ) ) )
            // InternalComponentModel.g:367:2: ( ( rule__ComponentFeature__PortsAssignment ) )
            {
            // InternalComponentModel.g:367:2: ( ( rule__ComponentFeature__PortsAssignment ) )
            // InternalComponentModel.g:368:3: ( rule__ComponentFeature__PortsAssignment )
            {
             before(grammarAccess.getComponentFeatureAccess().getPortsAssignment()); 
            // InternalComponentModel.g:369:3: ( rule__ComponentFeature__PortsAssignment )
            // InternalComponentModel.g:369:4: rule__ComponentFeature__PortsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComponentFeature__PortsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComponentFeatureAccess().getPortsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentFeature"


    // $ANTLR start "entryRulePort"
    // InternalComponentModel.g:378:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalComponentModel.g:379:1: ( rulePort EOF )
            // InternalComponentModel.g:380:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalComponentModel.g:387:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:391:2: ( ( ( rule__Port__Alternatives ) ) )
            // InternalComponentModel.g:392:2: ( ( rule__Port__Alternatives ) )
            {
            // InternalComponentModel.g:392:2: ( ( rule__Port__Alternatives ) )
            // InternalComponentModel.g:393:3: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // InternalComponentModel.g:394:3: ( rule__Port__Alternatives )
            // InternalComponentModel.g:394:4: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleInPort"
    // InternalComponentModel.g:403:1: entryRuleInPort : ruleInPort EOF ;
    public final void entryRuleInPort() throws RecognitionException {
        try {
            // InternalComponentModel.g:404:1: ( ruleInPort EOF )
            // InternalComponentModel.g:405:1: ruleInPort EOF
            {
             before(grammarAccess.getInPortRule()); 
            pushFollow(FOLLOW_1);
            ruleInPort();

            state._fsp--;

             after(grammarAccess.getInPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInPort"


    // $ANTLR start "ruleInPort"
    // InternalComponentModel.g:412:1: ruleInPort : ( ( rule__InPort__Group__0 ) ) ;
    public final void ruleInPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:416:2: ( ( ( rule__InPort__Group__0 ) ) )
            // InternalComponentModel.g:417:2: ( ( rule__InPort__Group__0 ) )
            {
            // InternalComponentModel.g:417:2: ( ( rule__InPort__Group__0 ) )
            // InternalComponentModel.g:418:3: ( rule__InPort__Group__0 )
            {
             before(grammarAccess.getInPortAccess().getGroup()); 
            // InternalComponentModel.g:419:3: ( rule__InPort__Group__0 )
            // InternalComponentModel.g:419:4: rule__InPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInPort"


    // $ANTLR start "entryRuleOutPort"
    // InternalComponentModel.g:428:1: entryRuleOutPort : ruleOutPort EOF ;
    public final void entryRuleOutPort() throws RecognitionException {
        try {
            // InternalComponentModel.g:429:1: ( ruleOutPort EOF )
            // InternalComponentModel.g:430:1: ruleOutPort EOF
            {
             before(grammarAccess.getOutPortRule()); 
            pushFollow(FOLLOW_1);
            ruleOutPort();

            state._fsp--;

             after(grammarAccess.getOutPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutPort"


    // $ANTLR start "ruleOutPort"
    // InternalComponentModel.g:437:1: ruleOutPort : ( ( rule__OutPort__Group__0 ) ) ;
    public final void ruleOutPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:441:2: ( ( ( rule__OutPort__Group__0 ) ) )
            // InternalComponentModel.g:442:2: ( ( rule__OutPort__Group__0 ) )
            {
            // InternalComponentModel.g:442:2: ( ( rule__OutPort__Group__0 ) )
            // InternalComponentModel.g:443:3: ( rule__OutPort__Group__0 )
            {
             before(grammarAccess.getOutPortAccess().getGroup()); 
            // InternalComponentModel.g:444:3: ( rule__OutPort__Group__0 )
            // InternalComponentModel.g:444:4: rule__OutPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutPort"


    // $ANTLR start "entryRulePortType"
    // InternalComponentModel.g:453:1: entryRulePortType : rulePortType EOF ;
    public final void entryRulePortType() throws RecognitionException {
        try {
            // InternalComponentModel.g:454:1: ( rulePortType EOF )
            // InternalComponentModel.g:455:1: rulePortType EOF
            {
             before(grammarAccess.getPortTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePortType();

            state._fsp--;

             after(grammarAccess.getPortTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePortType"


    // $ANTLR start "rulePortType"
    // InternalComponentModel.g:462:1: rulePortType : ( ( rule__PortType__Group__0 ) ) ;
    public final void rulePortType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:466:2: ( ( ( rule__PortType__Group__0 ) ) )
            // InternalComponentModel.g:467:2: ( ( rule__PortType__Group__0 ) )
            {
            // InternalComponentModel.g:467:2: ( ( rule__PortType__Group__0 ) )
            // InternalComponentModel.g:468:3: ( rule__PortType__Group__0 )
            {
             before(grammarAccess.getPortTypeAccess().getGroup()); 
            // InternalComponentModel.g:469:3: ( rule__PortType__Group__0 )
            // InternalComponentModel.g:469:4: rule__PortType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PortType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortType"


    // $ANTLR start "entryRuleerrorModes"
    // InternalComponentModel.g:478:1: entryRuleerrorModes : ruleerrorModes EOF ;
    public final void entryRuleerrorModes() throws RecognitionException {
        try {
            // InternalComponentModel.g:479:1: ( ruleerrorModes EOF )
            // InternalComponentModel.g:480:1: ruleerrorModes EOF
            {
             before(grammarAccess.getErrorModesRule()); 
            pushFollow(FOLLOW_1);
            ruleerrorModes();

            state._fsp--;

             after(grammarAccess.getErrorModesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleerrorModes"


    // $ANTLR start "ruleerrorModes"
    // InternalComponentModel.g:487:1: ruleerrorModes : ( ( rule__ErrorModes__Group__0 ) ) ;
    public final void ruleerrorModes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:491:2: ( ( ( rule__ErrorModes__Group__0 ) ) )
            // InternalComponentModel.g:492:2: ( ( rule__ErrorModes__Group__0 ) )
            {
            // InternalComponentModel.g:492:2: ( ( rule__ErrorModes__Group__0 ) )
            // InternalComponentModel.g:493:3: ( rule__ErrorModes__Group__0 )
            {
             before(grammarAccess.getErrorModesAccess().getGroup()); 
            // InternalComponentModel.g:494:3: ( rule__ErrorModes__Group__0 )
            // InternalComponentModel.g:494:4: rule__ErrorModes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorModes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getErrorModesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleerrorModes"


    // $ANTLR start "entryRuleComponentImpl"
    // InternalComponentModel.g:503:1: entryRuleComponentImpl : ruleComponentImpl EOF ;
    public final void entryRuleComponentImpl() throws RecognitionException {
        try {
            // InternalComponentModel.g:504:1: ( ruleComponentImpl EOF )
            // InternalComponentModel.g:505:1: ruleComponentImpl EOF
            {
             before(grammarAccess.getComponentImplRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentImpl();

            state._fsp--;

             after(grammarAccess.getComponentImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentImpl"


    // $ANTLR start "ruleComponentImpl"
    // InternalComponentModel.g:512:1: ruleComponentImpl : ( ( rule__ComponentImpl__Group__0 ) ) ;
    public final void ruleComponentImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:516:2: ( ( ( rule__ComponentImpl__Group__0 ) ) )
            // InternalComponentModel.g:517:2: ( ( rule__ComponentImpl__Group__0 ) )
            {
            // InternalComponentModel.g:517:2: ( ( rule__ComponentImpl__Group__0 ) )
            // InternalComponentModel.g:518:3: ( rule__ComponentImpl__Group__0 )
            {
             before(grammarAccess.getComponentImplAccess().getGroup()); 
            // InternalComponentModel.g:519:3: ( rule__ComponentImpl__Group__0 )
            // InternalComponentModel.g:519:4: rule__ComponentImpl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentImpl"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalComponentModel.g:527:1: rule__AbstractElement__Alternatives : ( ( ruleImportE ) | ( ruleSystemDec ) | ( ruleSystemConnDec ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:531:1: ( ( ruleImportE ) | ( ruleSystemDec ) | ( ruleSystemConnDec ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 12:
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
                    // InternalComponentModel.g:532:2: ( ruleImportE )
                    {
                    // InternalComponentModel.g:532:2: ( ruleImportE )
                    // InternalComponentModel.g:533:3: ruleImportE
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportEParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImportE();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:538:2: ( ruleSystemDec )
                    {
                    // InternalComponentModel.g:538:2: ( ruleSystemDec )
                    // InternalComponentModel.g:539:3: ruleSystemDec
                    {
                     before(grammarAccess.getAbstractElementAccess().getSystemDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSystemDecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:544:2: ( ruleSystemConnDec )
                    {
                    // InternalComponentModel.g:544:2: ( ruleSystemConnDec )
                    // InternalComponentModel.g:545:3: ruleSystemConnDec
                    {
                     before(grammarAccess.getAbstractElementAccess().getSystemConnDecParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemConnDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSystemConnDecParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__AbstractFeatures__Alternatives"
    // InternalComponentModel.g:554:1: rule__AbstractFeatures__Alternatives : ( ( ruleComponentType ) | ( ruleCompConnDec ) | ( rulePortType ) | ( ruleComponentImpl ) | ( ruleSystemPortDec ) );
    public final void rule__AbstractFeatures__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:558:1: ( ( ruleComponentType ) | ( ruleCompConnDec ) | ( rulePortType ) | ( ruleComponentImpl ) | ( ruleSystemPortDec ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 19:
            case 20:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalComponentModel.g:559:2: ( ruleComponentType )
                    {
                    // InternalComponentModel.g:559:2: ( ruleComponentType )
                    // InternalComponentModel.g:560:3: ruleComponentType
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getComponentTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentType();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getComponentTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:565:2: ( ruleCompConnDec )
                    {
                    // InternalComponentModel.g:565:2: ( ruleCompConnDec )
                    // InternalComponentModel.g:566:3: ruleCompConnDec
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getCompConnDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompConnDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getCompConnDecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:571:2: ( rulePortType )
                    {
                    // InternalComponentModel.g:571:2: ( rulePortType )
                    // InternalComponentModel.g:572:3: rulePortType
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getPortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePortType();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getPortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentModel.g:577:2: ( ruleComponentImpl )
                    {
                    // InternalComponentModel.g:577:2: ( ruleComponentImpl )
                    // InternalComponentModel.g:578:3: ruleComponentImpl
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getComponentImplParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentImpl();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getComponentImplParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentModel.g:583:2: ( ruleSystemPortDec )
                    {
                    // InternalComponentModel.g:583:2: ( ruleSystemPortDec )
                    // InternalComponentModel.g:584:3: ruleSystemPortDec
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemPortDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFeatures__Alternatives"


    // $ANTLR start "rule__SystemPortDec__Alternatives"
    // InternalComponentModel.g:593:1: rule__SystemPortDec__Alternatives : ( ( ruleSystemPortIn ) | ( ruleSystemPortOut ) );
    public final void rule__SystemPortDec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:597:1: ( ( ruleSystemPortIn ) | ( ruleSystemPortOut ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentModel.g:598:2: ( ruleSystemPortIn )
                    {
                    // InternalComponentModel.g:598:2: ( ruleSystemPortIn )
                    // InternalComponentModel.g:599:3: ruleSystemPortIn
                    {
                     before(grammarAccess.getSystemPortDecAccess().getSystemPortInParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemPortIn();

                    state._fsp--;

                     after(grammarAccess.getSystemPortDecAccess().getSystemPortInParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:604:2: ( ruleSystemPortOut )
                    {
                    // InternalComponentModel.g:604:2: ( ruleSystemPortOut )
                    // InternalComponentModel.g:605:3: ruleSystemPortOut
                    {
                     before(grammarAccess.getSystemPortDecAccess().getSystemPortOutParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemPortOut();

                    state._fsp--;

                     after(grammarAccess.getSystemPortDecAccess().getSystemPortOutParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortDec__Alternatives"


    // $ANTLR start "rule__Port__Alternatives"
    // InternalComponentModel.g:614:1: rule__Port__Alternatives : ( ( ruleInPort ) | ( ruleOutPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:618:1: ( ( ruleInPort ) | ( ruleOutPort ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentModel.g:619:2: ( ruleInPort )
                    {
                    // InternalComponentModel.g:619:2: ( ruleInPort )
                    // InternalComponentModel.g:620:3: ruleInPort
                    {
                     before(grammarAccess.getPortAccess().getInPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getInPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:625:2: ( ruleOutPort )
                    {
                    // InternalComponentModel.g:625:2: ( ruleOutPort )
                    // InternalComponentModel.g:626:3: ruleOutPort
                    {
                     before(grammarAccess.getPortAccess().getOutPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOutPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getOutPortParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__ImportE__Group__0"
    // InternalComponentModel.g:635:1: rule__ImportE__Group__0 : rule__ImportE__Group__0__Impl rule__ImportE__Group__1 ;
    public final void rule__ImportE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:639:1: ( rule__ImportE__Group__0__Impl rule__ImportE__Group__1 )
            // InternalComponentModel.g:640:2: rule__ImportE__Group__0__Impl rule__ImportE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ImportE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportE__Group__0"


    // $ANTLR start "rule__ImportE__Group__0__Impl"
    // InternalComponentModel.g:647:1: rule__ImportE__Group__0__Impl : ( 'import emodel' ) ;
    public final void rule__ImportE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:651:1: ( ( 'import emodel' ) )
            // InternalComponentModel.g:652:1: ( 'import emodel' )
            {
            // InternalComponentModel.g:652:1: ( 'import emodel' )
            // InternalComponentModel.g:653:2: 'import emodel'
            {
             before(grammarAccess.getImportEAccess().getImportEmodelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImportEAccess().getImportEmodelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportE__Group__0__Impl"


    // $ANTLR start "rule__ImportE__Group__1"
    // InternalComponentModel.g:662:1: rule__ImportE__Group__1 : rule__ImportE__Group__1__Impl ;
    public final void rule__ImportE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:666:1: ( rule__ImportE__Group__1__Impl )
            // InternalComponentModel.g:667:2: rule__ImportE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportE__Group__1"


    // $ANTLR start "rule__ImportE__Group__1__Impl"
    // InternalComponentModel.g:673:1: rule__ImportE__Group__1__Impl : ( ( rule__ImportE__IncludedEModelAssignment_1 ) ) ;
    public final void rule__ImportE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:677:1: ( ( ( rule__ImportE__IncludedEModelAssignment_1 ) ) )
            // InternalComponentModel.g:678:1: ( ( rule__ImportE__IncludedEModelAssignment_1 ) )
            {
            // InternalComponentModel.g:678:1: ( ( rule__ImportE__IncludedEModelAssignment_1 ) )
            // InternalComponentModel.g:679:2: ( rule__ImportE__IncludedEModelAssignment_1 )
            {
             before(grammarAccess.getImportEAccess().getIncludedEModelAssignment_1()); 
            // InternalComponentModel.g:680:2: ( rule__ImportE__IncludedEModelAssignment_1 )
            // InternalComponentModel.g:680:3: rule__ImportE__IncludedEModelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportE__IncludedEModelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportEAccess().getIncludedEModelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportE__Group__1__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__0"
    // InternalComponentModel.g:689:1: rule__SystemConnDec__Group__0 : rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1 ;
    public final void rule__SystemConnDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:693:1: ( rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1 )
            // InternalComponentModel.g:694:2: rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemConnDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__0"


    // $ANTLR start "rule__SystemConnDec__Group__0__Impl"
    // InternalComponentModel.g:701:1: rule__SystemConnDec__Group__0__Impl : ( 'system connection' ) ;
    public final void rule__SystemConnDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:705:1: ( ( 'system connection' ) )
            // InternalComponentModel.g:706:1: ( 'system connection' )
            {
            // InternalComponentModel.g:706:1: ( 'system connection' )
            // InternalComponentModel.g:707:2: 'system connection'
            {
             before(grammarAccess.getSystemConnDecAccess().getSystemConnectionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getSystemConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__0__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__1"
    // InternalComponentModel.g:716:1: rule__SystemConnDec__Group__1 : rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2 ;
    public final void rule__SystemConnDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:720:1: ( rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2 )
            // InternalComponentModel.g:721:2: rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SystemConnDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__1"


    // $ANTLR start "rule__SystemConnDec__Group__1__Impl"
    // InternalComponentModel.g:728:1: rule__SystemConnDec__Group__1__Impl : ( ( rule__SystemConnDec__NameAssignment_1 ) ) ;
    public final void rule__SystemConnDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:732:1: ( ( ( rule__SystemConnDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:733:1: ( ( rule__SystemConnDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:733:1: ( ( rule__SystemConnDec__NameAssignment_1 ) )
            // InternalComponentModel.g:734:2: ( rule__SystemConnDec__NameAssignment_1 )
            {
             before(grammarAccess.getSystemConnDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:735:2: ( rule__SystemConnDec__NameAssignment_1 )
            // InternalComponentModel.g:735:3: rule__SystemConnDec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__1__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__2"
    // InternalComponentModel.g:743:1: rule__SystemConnDec__Group__2 : rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3 ;
    public final void rule__SystemConnDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:747:1: ( rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3 )
            // InternalComponentModel.g:748:2: rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SystemConnDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__2"


    // $ANTLR start "rule__SystemConnDec__Group__2__Impl"
    // InternalComponentModel.g:755:1: rule__SystemConnDec__Group__2__Impl : ( 'from' ) ;
    public final void rule__SystemConnDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:759:1: ( ( 'from' ) )
            // InternalComponentModel.g:760:1: ( 'from' )
            {
            // InternalComponentModel.g:760:1: ( 'from' )
            // InternalComponentModel.g:761:2: 'from'
            {
             before(grammarAccess.getSystemConnDecAccess().getFromKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__2__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__3"
    // InternalComponentModel.g:770:1: rule__SystemConnDec__Group__3 : rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4 ;
    public final void rule__SystemConnDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:774:1: ( rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4 )
            // InternalComponentModel.g:775:2: rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SystemConnDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__3"


    // $ANTLR start "rule__SystemConnDec__Group__3__Impl"
    // InternalComponentModel.g:782:1: rule__SystemConnDec__Group__3__Impl : ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) ) ;
    public final void rule__SystemConnDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:786:1: ( ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) ) )
            // InternalComponentModel.g:787:1: ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) )
            {
            // InternalComponentModel.g:787:1: ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) )
            // InternalComponentModel.g:788:2: ( rule__SystemConnDec__SourceSystemAssignment_3 )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemAssignment_3()); 
            // InternalComponentModel.g:789:2: ( rule__SystemConnDec__SourceSystemAssignment_3 )
            // InternalComponentModel.g:789:3: rule__SystemConnDec__SourceSystemAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__SourceSystemAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getSourceSystemAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__3__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__4"
    // InternalComponentModel.g:797:1: rule__SystemConnDec__Group__4 : rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5 ;
    public final void rule__SystemConnDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:801:1: ( rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5 )
            // InternalComponentModel.g:802:2: rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__SystemConnDec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__4"


    // $ANTLR start "rule__SystemConnDec__Group__4__Impl"
    // InternalComponentModel.g:809:1: rule__SystemConnDec__Group__4__Impl : ( '.' ) ;
    public final void rule__SystemConnDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:813:1: ( ( '.' ) )
            // InternalComponentModel.g:814:1: ( '.' )
            {
            // InternalComponentModel.g:814:1: ( '.' )
            // InternalComponentModel.g:815:2: '.'
            {
             before(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__4__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__5"
    // InternalComponentModel.g:824:1: rule__SystemConnDec__Group__5 : rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6 ;
    public final void rule__SystemConnDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:828:1: ( rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6 )
            // InternalComponentModel.g:829:2: rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__SystemConnDec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__5"


    // $ANTLR start "rule__SystemConnDec__Group__5__Impl"
    // InternalComponentModel.g:836:1: rule__SystemConnDec__Group__5__Impl : ( ( rule__SystemConnDec__SourcePortAssignment_5 ) ) ;
    public final void rule__SystemConnDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:840:1: ( ( ( rule__SystemConnDec__SourcePortAssignment_5 ) ) )
            // InternalComponentModel.g:841:1: ( ( rule__SystemConnDec__SourcePortAssignment_5 ) )
            {
            // InternalComponentModel.g:841:1: ( ( rule__SystemConnDec__SourcePortAssignment_5 ) )
            // InternalComponentModel.g:842:2: ( rule__SystemConnDec__SourcePortAssignment_5 )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortAssignment_5()); 
            // InternalComponentModel.g:843:2: ( rule__SystemConnDec__SourcePortAssignment_5 )
            // InternalComponentModel.g:843:3: rule__SystemConnDec__SourcePortAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__SourcePortAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getSourcePortAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__5__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__6"
    // InternalComponentModel.g:851:1: rule__SystemConnDec__Group__6 : rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7 ;
    public final void rule__SystemConnDec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:855:1: ( rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7 )
            // InternalComponentModel.g:856:2: rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__SystemConnDec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__6"


    // $ANTLR start "rule__SystemConnDec__Group__6__Impl"
    // InternalComponentModel.g:863:1: rule__SystemConnDec__Group__6__Impl : ( 'to' ) ;
    public final void rule__SystemConnDec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:867:1: ( ( 'to' ) )
            // InternalComponentModel.g:868:1: ( 'to' )
            {
            // InternalComponentModel.g:868:1: ( 'to' )
            // InternalComponentModel.g:869:2: 'to'
            {
             before(grammarAccess.getSystemConnDecAccess().getToKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__6__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__7"
    // InternalComponentModel.g:878:1: rule__SystemConnDec__Group__7 : rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8 ;
    public final void rule__SystemConnDec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:882:1: ( rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8 )
            // InternalComponentModel.g:883:2: rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__SystemConnDec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__7"


    // $ANTLR start "rule__SystemConnDec__Group__7__Impl"
    // InternalComponentModel.g:890:1: rule__SystemConnDec__Group__7__Impl : ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) ) ;
    public final void rule__SystemConnDec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:894:1: ( ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) ) )
            // InternalComponentModel.g:895:1: ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) )
            {
            // InternalComponentModel.g:895:1: ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) )
            // InternalComponentModel.g:896:2: ( rule__SystemConnDec__TargetSystemAssignment_7 )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemAssignment_7()); 
            // InternalComponentModel.g:897:2: ( rule__SystemConnDec__TargetSystemAssignment_7 )
            // InternalComponentModel.g:897:3: rule__SystemConnDec__TargetSystemAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__TargetSystemAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getTargetSystemAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__7__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__8"
    // InternalComponentModel.g:905:1: rule__SystemConnDec__Group__8 : rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9 ;
    public final void rule__SystemConnDec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:909:1: ( rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9 )
            // InternalComponentModel.g:910:2: rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__SystemConnDec__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__8"


    // $ANTLR start "rule__SystemConnDec__Group__8__Impl"
    // InternalComponentModel.g:917:1: rule__SystemConnDec__Group__8__Impl : ( '.' ) ;
    public final void rule__SystemConnDec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:921:1: ( ( '.' ) )
            // InternalComponentModel.g:922:1: ( '.' )
            {
            // InternalComponentModel.g:922:1: ( '.' )
            // InternalComponentModel.g:923:2: '.'
            {
             before(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__8__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__9"
    // InternalComponentModel.g:932:1: rule__SystemConnDec__Group__9 : rule__SystemConnDec__Group__9__Impl ;
    public final void rule__SystemConnDec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:936:1: ( rule__SystemConnDec__Group__9__Impl )
            // InternalComponentModel.g:937:2: rule__SystemConnDec__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__9"


    // $ANTLR start "rule__SystemConnDec__Group__9__Impl"
    // InternalComponentModel.g:943:1: rule__SystemConnDec__Group__9__Impl : ( ( rule__SystemConnDec__TargetPortAssignment_9 ) ) ;
    public final void rule__SystemConnDec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:947:1: ( ( ( rule__SystemConnDec__TargetPortAssignment_9 ) ) )
            // InternalComponentModel.g:948:1: ( ( rule__SystemConnDec__TargetPortAssignment_9 ) )
            {
            // InternalComponentModel.g:948:1: ( ( rule__SystemConnDec__TargetPortAssignment_9 ) )
            // InternalComponentModel.g:949:2: ( rule__SystemConnDec__TargetPortAssignment_9 )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortAssignment_9()); 
            // InternalComponentModel.g:950:2: ( rule__SystemConnDec__TargetPortAssignment_9 )
            // InternalComponentModel.g:950:3: rule__SystemConnDec__TargetPortAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__TargetPortAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getTargetPortAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__Group__9__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalComponentModel.g:959:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:963:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalComponentModel.g:964:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalComponentModel.g:971:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:975:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:976:1: ( RULE_ID )
            {
            // InternalComponentModel.g:976:1: ( RULE_ID )
            // InternalComponentModel.g:977:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalComponentModel.g:986:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:990:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalComponentModel.g:991:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalComponentModel.g:997:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1001:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalComponentModel.g:1002:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalComponentModel.g:1002:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalComponentModel.g:1003:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalComponentModel.g:1004:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentModel.g:1004:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalComponentModel.g:1013:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1017:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalComponentModel.g:1018:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalComponentModel.g:1025:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1029:1: ( ( '.' ) )
            // InternalComponentModel.g:1030:1: ( '.' )
            {
            // InternalComponentModel.g:1030:1: ( '.' )
            // InternalComponentModel.g:1031:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalComponentModel.g:1040:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1044:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalComponentModel.g:1045:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalComponentModel.g:1051:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1055:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:1056:1: ( RULE_ID )
            {
            // InternalComponentModel.g:1056:1: ( RULE_ID )
            // InternalComponentModel.g:1057:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__SystemDec__Group__0"
    // InternalComponentModel.g:1067:1: rule__SystemDec__Group__0 : rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1 ;
    public final void rule__SystemDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1071:1: ( rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1 )
            // InternalComponentModel.g:1072:2: rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__0"


    // $ANTLR start "rule__SystemDec__Group__0__Impl"
    // InternalComponentModel.g:1079:1: rule__SystemDec__Group__0__Impl : ( 'system declaration' ) ;
    public final void rule__SystemDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1083:1: ( ( 'system declaration' ) )
            // InternalComponentModel.g:1084:1: ( 'system declaration' )
            {
            // InternalComponentModel.g:1084:1: ( 'system declaration' )
            // InternalComponentModel.g:1085:2: 'system declaration'
            {
             before(grammarAccess.getSystemDecAccess().getSystemDeclarationKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getSystemDeclarationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__0__Impl"


    // $ANTLR start "rule__SystemDec__Group__1"
    // InternalComponentModel.g:1094:1: rule__SystemDec__Group__1 : rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2 ;
    public final void rule__SystemDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1098:1: ( rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2 )
            // InternalComponentModel.g:1099:2: rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SystemDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__1"


    // $ANTLR start "rule__SystemDec__Group__1__Impl"
    // InternalComponentModel.g:1106:1: rule__SystemDec__Group__1__Impl : ( ( rule__SystemDec__NameAssignment_1 ) ) ;
    public final void rule__SystemDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1110:1: ( ( ( rule__SystemDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1111:1: ( ( rule__SystemDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1111:1: ( ( rule__SystemDec__NameAssignment_1 ) )
            // InternalComponentModel.g:1112:2: ( rule__SystemDec__NameAssignment_1 )
            {
             before(grammarAccess.getSystemDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1113:2: ( rule__SystemDec__NameAssignment_1 )
            // InternalComponentModel.g:1113:3: rule__SystemDec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemDec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemDecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__1__Impl"


    // $ANTLR start "rule__SystemDec__Group__2"
    // InternalComponentModel.g:1121:1: rule__SystemDec__Group__2 : rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3 ;
    public final void rule__SystemDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1125:1: ( rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3 )
            // InternalComponentModel.g:1126:2: rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SystemDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__2"


    // $ANTLR start "rule__SystemDec__Group__2__Impl"
    // InternalComponentModel.g:1133:1: rule__SystemDec__Group__2__Impl : ( '{' ) ;
    public final void rule__SystemDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1137:1: ( ( '{' ) )
            // InternalComponentModel.g:1138:1: ( '{' )
            {
            // InternalComponentModel.g:1138:1: ( '{' )
            // InternalComponentModel.g:1139:2: '{'
            {
             before(grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__2__Impl"


    // $ANTLR start "rule__SystemDec__Group__3"
    // InternalComponentModel.g:1148:1: rule__SystemDec__Group__3 : rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4 ;
    public final void rule__SystemDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1152:1: ( rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4 )
            // InternalComponentModel.g:1153:2: rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SystemDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__3"


    // $ANTLR start "rule__SystemDec__Group__3__Impl"
    // InternalComponentModel.g:1160:1: rule__SystemDec__Group__3__Impl : ( ( rule__SystemDec__SysFeaturesAssignment_3 )* ) ;
    public final void rule__SystemDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1164:1: ( ( ( rule__SystemDec__SysFeaturesAssignment_3 )* ) )
            // InternalComponentModel.g:1165:1: ( ( rule__SystemDec__SysFeaturesAssignment_3 )* )
            {
            // InternalComponentModel.g:1165:1: ( ( rule__SystemDec__SysFeaturesAssignment_3 )* )
            // InternalComponentModel.g:1166:2: ( rule__SystemDec__SysFeaturesAssignment_3 )*
            {
             before(grammarAccess.getSystemDecAccess().getSysFeaturesAssignment_3()); 
            // InternalComponentModel.g:1167:2: ( rule__SystemDec__SysFeaturesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=22)||LA7_0==26||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentModel.g:1167:3: rule__SystemDec__SysFeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SystemDec__SysFeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSystemDecAccess().getSysFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__3__Impl"


    // $ANTLR start "rule__SystemDec__Group__4"
    // InternalComponentModel.g:1175:1: rule__SystemDec__Group__4 : rule__SystemDec__Group__4__Impl ;
    public final void rule__SystemDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1179:1: ( rule__SystemDec__Group__4__Impl )
            // InternalComponentModel.g:1180:2: rule__SystemDec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__4"


    // $ANTLR start "rule__SystemDec__Group__4__Impl"
    // InternalComponentModel.g:1186:1: rule__SystemDec__Group__4__Impl : ( '}' ) ;
    public final void rule__SystemDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1190:1: ( ( '}' ) )
            // InternalComponentModel.g:1191:1: ( '}' )
            {
            // InternalComponentModel.g:1191:1: ( '}' )
            // InternalComponentModel.g:1192:2: '}'
            {
             before(grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__Group__4__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__0"
    // InternalComponentModel.g:1202:1: rule__SystemPortIn__Group__0 : rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1 ;
    public final void rule__SystemPortIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1206:1: ( rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1 )
            // InternalComponentModel.g:1207:2: rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__0"


    // $ANTLR start "rule__SystemPortIn__Group__0__Impl"
    // InternalComponentModel.g:1214:1: rule__SystemPortIn__Group__0__Impl : ( 'system port in' ) ;
    public final void rule__SystemPortIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1218:1: ( ( 'system port in' ) )
            // InternalComponentModel.g:1219:1: ( 'system port in' )
            {
            // InternalComponentModel.g:1219:1: ( 'system port in' )
            // InternalComponentModel.g:1220:2: 'system port in'
            {
             before(grammarAccess.getSystemPortInAccess().getSystemPortInKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getSystemPortInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__0__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__1"
    // InternalComponentModel.g:1229:1: rule__SystemPortIn__Group__1 : rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2 ;
    public final void rule__SystemPortIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1233:1: ( rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2 )
            // InternalComponentModel.g:1234:2: rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SystemPortIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__1"


    // $ANTLR start "rule__SystemPortIn__Group__1__Impl"
    // InternalComponentModel.g:1241:1: rule__SystemPortIn__Group__1__Impl : ( ( rule__SystemPortIn__NameAssignment_1 ) ) ;
    public final void rule__SystemPortIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1245:1: ( ( ( rule__SystemPortIn__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1246:1: ( ( rule__SystemPortIn__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1246:1: ( ( rule__SystemPortIn__NameAssignment_1 ) )
            // InternalComponentModel.g:1247:2: ( rule__SystemPortIn__NameAssignment_1 )
            {
             before(grammarAccess.getSystemPortInAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1248:2: ( rule__SystemPortIn__NameAssignment_1 )
            // InternalComponentModel.g:1248:3: rule__SystemPortIn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__1__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__2"
    // InternalComponentModel.g:1256:1: rule__SystemPortIn__Group__2 : rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3 ;
    public final void rule__SystemPortIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1260:1: ( rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3 )
            // InternalComponentModel.g:1261:2: rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__2"


    // $ANTLR start "rule__SystemPortIn__Group__2__Impl"
    // InternalComponentModel.g:1268:1: rule__SystemPortIn__Group__2__Impl : ( 'to' ) ;
    public final void rule__SystemPortIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1272:1: ( ( 'to' ) )
            // InternalComponentModel.g:1273:1: ( 'to' )
            {
            // InternalComponentModel.g:1273:1: ( 'to' )
            // InternalComponentModel.g:1274:2: 'to'
            {
             before(grammarAccess.getSystemPortInAccess().getToKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__2__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__3"
    // InternalComponentModel.g:1283:1: rule__SystemPortIn__Group__3 : rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4 ;
    public final void rule__SystemPortIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1287:1: ( rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4 )
            // InternalComponentModel.g:1288:2: rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SystemPortIn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__3"


    // $ANTLR start "rule__SystemPortIn__Group__3__Impl"
    // InternalComponentModel.g:1295:1: rule__SystemPortIn__Group__3__Impl : ( ( rule__SystemPortIn__InCompAssignment_3 ) ) ;
    public final void rule__SystemPortIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1299:1: ( ( ( rule__SystemPortIn__InCompAssignment_3 ) ) )
            // InternalComponentModel.g:1300:1: ( ( rule__SystemPortIn__InCompAssignment_3 ) )
            {
            // InternalComponentModel.g:1300:1: ( ( rule__SystemPortIn__InCompAssignment_3 ) )
            // InternalComponentModel.g:1301:2: ( rule__SystemPortIn__InCompAssignment_3 )
            {
             before(grammarAccess.getSystemPortInAccess().getInCompAssignment_3()); 
            // InternalComponentModel.g:1302:2: ( rule__SystemPortIn__InCompAssignment_3 )
            // InternalComponentModel.g:1302:3: rule__SystemPortIn__InCompAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__InCompAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getInCompAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__3__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__4"
    // InternalComponentModel.g:1310:1: rule__SystemPortIn__Group__4 : rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5 ;
    public final void rule__SystemPortIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1314:1: ( rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5 )
            // InternalComponentModel.g:1315:2: rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortIn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__4"


    // $ANTLR start "rule__SystemPortIn__Group__4__Impl"
    // InternalComponentModel.g:1322:1: rule__SystemPortIn__Group__4__Impl : ( '.' ) ;
    public final void rule__SystemPortIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1326:1: ( ( '.' ) )
            // InternalComponentModel.g:1327:1: ( '.' )
            {
            // InternalComponentModel.g:1327:1: ( '.' )
            // InternalComponentModel.g:1328:2: '.'
            {
             before(grammarAccess.getSystemPortInAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__4__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__5"
    // InternalComponentModel.g:1337:1: rule__SystemPortIn__Group__5 : rule__SystemPortIn__Group__5__Impl ;
    public final void rule__SystemPortIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1341:1: ( rule__SystemPortIn__Group__5__Impl )
            // InternalComponentModel.g:1342:2: rule__SystemPortIn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__5"


    // $ANTLR start "rule__SystemPortIn__Group__5__Impl"
    // InternalComponentModel.g:1348:1: rule__SystemPortIn__Group__5__Impl : ( ( rule__SystemPortIn__InPortAssignment_5 ) ) ;
    public final void rule__SystemPortIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1352:1: ( ( ( rule__SystemPortIn__InPortAssignment_5 ) ) )
            // InternalComponentModel.g:1353:1: ( ( rule__SystemPortIn__InPortAssignment_5 ) )
            {
            // InternalComponentModel.g:1353:1: ( ( rule__SystemPortIn__InPortAssignment_5 ) )
            // InternalComponentModel.g:1354:2: ( rule__SystemPortIn__InPortAssignment_5 )
            {
             before(grammarAccess.getSystemPortInAccess().getInPortAssignment_5()); 
            // InternalComponentModel.g:1355:2: ( rule__SystemPortIn__InPortAssignment_5 )
            // InternalComponentModel.g:1355:3: rule__SystemPortIn__InPortAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__InPortAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getInPortAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__Group__5__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__0"
    // InternalComponentModel.g:1364:1: rule__SystemPortOut__Group__0 : rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1 ;
    public final void rule__SystemPortOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1368:1: ( rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1 )
            // InternalComponentModel.g:1369:2: rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortOut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__0"


    // $ANTLR start "rule__SystemPortOut__Group__0__Impl"
    // InternalComponentModel.g:1376:1: rule__SystemPortOut__Group__0__Impl : ( 'system port out' ) ;
    public final void rule__SystemPortOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1380:1: ( ( 'system port out' ) )
            // InternalComponentModel.g:1381:1: ( 'system port out' )
            {
            // InternalComponentModel.g:1381:1: ( 'system port out' )
            // InternalComponentModel.g:1382:2: 'system port out'
            {
             before(grammarAccess.getSystemPortOutAccess().getSystemPortOutKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getSystemPortOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__0__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__1"
    // InternalComponentModel.g:1391:1: rule__SystemPortOut__Group__1 : rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2 ;
    public final void rule__SystemPortOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1395:1: ( rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2 )
            // InternalComponentModel.g:1396:2: rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SystemPortOut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__1"


    // $ANTLR start "rule__SystemPortOut__Group__1__Impl"
    // InternalComponentModel.g:1403:1: rule__SystemPortOut__Group__1__Impl : ( ( rule__SystemPortOut__NameAssignment_1 ) ) ;
    public final void rule__SystemPortOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1407:1: ( ( ( rule__SystemPortOut__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1408:1: ( ( rule__SystemPortOut__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1408:1: ( ( rule__SystemPortOut__NameAssignment_1 ) )
            // InternalComponentModel.g:1409:2: ( rule__SystemPortOut__NameAssignment_1 )
            {
             before(grammarAccess.getSystemPortOutAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1410:2: ( rule__SystemPortOut__NameAssignment_1 )
            // InternalComponentModel.g:1410:3: rule__SystemPortOut__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__1__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__2"
    // InternalComponentModel.g:1418:1: rule__SystemPortOut__Group__2 : rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3 ;
    public final void rule__SystemPortOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1422:1: ( rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3 )
            // InternalComponentModel.g:1423:2: rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortOut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__2"


    // $ANTLR start "rule__SystemPortOut__Group__2__Impl"
    // InternalComponentModel.g:1430:1: rule__SystemPortOut__Group__2__Impl : ( 'from' ) ;
    public final void rule__SystemPortOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1434:1: ( ( 'from' ) )
            // InternalComponentModel.g:1435:1: ( 'from' )
            {
            // InternalComponentModel.g:1435:1: ( 'from' )
            // InternalComponentModel.g:1436:2: 'from'
            {
             before(grammarAccess.getSystemPortOutAccess().getFromKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__2__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__3"
    // InternalComponentModel.g:1445:1: rule__SystemPortOut__Group__3 : rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4 ;
    public final void rule__SystemPortOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1449:1: ( rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4 )
            // InternalComponentModel.g:1450:2: rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SystemPortOut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__3"


    // $ANTLR start "rule__SystemPortOut__Group__3__Impl"
    // InternalComponentModel.g:1457:1: rule__SystemPortOut__Group__3__Impl : ( ( rule__SystemPortOut__OutCompAssignment_3 ) ) ;
    public final void rule__SystemPortOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1461:1: ( ( ( rule__SystemPortOut__OutCompAssignment_3 ) ) )
            // InternalComponentModel.g:1462:1: ( ( rule__SystemPortOut__OutCompAssignment_3 ) )
            {
            // InternalComponentModel.g:1462:1: ( ( rule__SystemPortOut__OutCompAssignment_3 ) )
            // InternalComponentModel.g:1463:2: ( rule__SystemPortOut__OutCompAssignment_3 )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompAssignment_3()); 
            // InternalComponentModel.g:1464:2: ( rule__SystemPortOut__OutCompAssignment_3 )
            // InternalComponentModel.g:1464:3: rule__SystemPortOut__OutCompAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__OutCompAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getOutCompAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__3__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__4"
    // InternalComponentModel.g:1472:1: rule__SystemPortOut__Group__4 : rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5 ;
    public final void rule__SystemPortOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1476:1: ( rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5 )
            // InternalComponentModel.g:1477:2: rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortOut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__4"


    // $ANTLR start "rule__SystemPortOut__Group__4__Impl"
    // InternalComponentModel.g:1484:1: rule__SystemPortOut__Group__4__Impl : ( '.' ) ;
    public final void rule__SystemPortOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1488:1: ( ( '.' ) )
            // InternalComponentModel.g:1489:1: ( '.' )
            {
            // InternalComponentModel.g:1489:1: ( '.' )
            // InternalComponentModel.g:1490:2: '.'
            {
             before(grammarAccess.getSystemPortOutAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__4__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__5"
    // InternalComponentModel.g:1499:1: rule__SystemPortOut__Group__5 : rule__SystemPortOut__Group__5__Impl ;
    public final void rule__SystemPortOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1503:1: ( rule__SystemPortOut__Group__5__Impl )
            // InternalComponentModel.g:1504:2: rule__SystemPortOut__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__5"


    // $ANTLR start "rule__SystemPortOut__Group__5__Impl"
    // InternalComponentModel.g:1510:1: rule__SystemPortOut__Group__5__Impl : ( ( rule__SystemPortOut__OutPortAssignment_5 ) ) ;
    public final void rule__SystemPortOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1514:1: ( ( ( rule__SystemPortOut__OutPortAssignment_5 ) ) )
            // InternalComponentModel.g:1515:1: ( ( rule__SystemPortOut__OutPortAssignment_5 ) )
            {
            // InternalComponentModel.g:1515:1: ( ( rule__SystemPortOut__OutPortAssignment_5 ) )
            // InternalComponentModel.g:1516:2: ( rule__SystemPortOut__OutPortAssignment_5 )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortAssignment_5()); 
            // InternalComponentModel.g:1517:2: ( rule__SystemPortOut__OutPortAssignment_5 )
            // InternalComponentModel.g:1517:3: rule__SystemPortOut__OutPortAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__OutPortAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getOutPortAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__Group__5__Impl"


    // $ANTLR start "rule__CompConnDec__Group__0"
    // InternalComponentModel.g:1526:1: rule__CompConnDec__Group__0 : rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1 ;
    public final void rule__CompConnDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1530:1: ( rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1 )
            // InternalComponentModel.g:1531:2: rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CompConnDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__0"


    // $ANTLR start "rule__CompConnDec__Group__0__Impl"
    // InternalComponentModel.g:1538:1: rule__CompConnDec__Group__0__Impl : ( 'connection' ) ;
    public final void rule__CompConnDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1542:1: ( ( 'connection' ) )
            // InternalComponentModel.g:1543:1: ( 'connection' )
            {
            // InternalComponentModel.g:1543:1: ( 'connection' )
            // InternalComponentModel.g:1544:2: 'connection'
            {
             before(grammarAccess.getCompConnDecAccess().getConnectionKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__0__Impl"


    // $ANTLR start "rule__CompConnDec__Group__1"
    // InternalComponentModel.g:1553:1: rule__CompConnDec__Group__1 : rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2 ;
    public final void rule__CompConnDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1557:1: ( rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2 )
            // InternalComponentModel.g:1558:2: rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CompConnDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__1"


    // $ANTLR start "rule__CompConnDec__Group__1__Impl"
    // InternalComponentModel.g:1565:1: rule__CompConnDec__Group__1__Impl : ( ( rule__CompConnDec__NameAssignment_1 ) ) ;
    public final void rule__CompConnDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1569:1: ( ( ( rule__CompConnDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1570:1: ( ( rule__CompConnDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1570:1: ( ( rule__CompConnDec__NameAssignment_1 ) )
            // InternalComponentModel.g:1571:2: ( rule__CompConnDec__NameAssignment_1 )
            {
             before(grammarAccess.getCompConnDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1572:2: ( rule__CompConnDec__NameAssignment_1 )
            // InternalComponentModel.g:1572:3: rule__CompConnDec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__1__Impl"


    // $ANTLR start "rule__CompConnDec__Group__2"
    // InternalComponentModel.g:1580:1: rule__CompConnDec__Group__2 : rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3 ;
    public final void rule__CompConnDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1584:1: ( rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3 )
            // InternalComponentModel.g:1585:2: rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CompConnDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__2"


    // $ANTLR start "rule__CompConnDec__Group__2__Impl"
    // InternalComponentModel.g:1592:1: rule__CompConnDec__Group__2__Impl : ( 'from' ) ;
    public final void rule__CompConnDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1596:1: ( ( 'from' ) )
            // InternalComponentModel.g:1597:1: ( 'from' )
            {
            // InternalComponentModel.g:1597:1: ( 'from' )
            // InternalComponentModel.g:1598:2: 'from'
            {
             before(grammarAccess.getCompConnDecAccess().getFromKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__2__Impl"


    // $ANTLR start "rule__CompConnDec__Group__3"
    // InternalComponentModel.g:1607:1: rule__CompConnDec__Group__3 : rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4 ;
    public final void rule__CompConnDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1611:1: ( rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4 )
            // InternalComponentModel.g:1612:2: rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CompConnDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__3"


    // $ANTLR start "rule__CompConnDec__Group__3__Impl"
    // InternalComponentModel.g:1619:1: rule__CompConnDec__Group__3__Impl : ( ( rule__CompConnDec__SourceCompAssignment_3 ) ) ;
    public final void rule__CompConnDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1623:1: ( ( ( rule__CompConnDec__SourceCompAssignment_3 ) ) )
            // InternalComponentModel.g:1624:1: ( ( rule__CompConnDec__SourceCompAssignment_3 ) )
            {
            // InternalComponentModel.g:1624:1: ( ( rule__CompConnDec__SourceCompAssignment_3 ) )
            // InternalComponentModel.g:1625:2: ( rule__CompConnDec__SourceCompAssignment_3 )
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompAssignment_3()); 
            // InternalComponentModel.g:1626:2: ( rule__CompConnDec__SourceCompAssignment_3 )
            // InternalComponentModel.g:1626:3: rule__CompConnDec__SourceCompAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__SourceCompAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getSourceCompAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__3__Impl"


    // $ANTLR start "rule__CompConnDec__Group__4"
    // InternalComponentModel.g:1634:1: rule__CompConnDec__Group__4 : rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5 ;
    public final void rule__CompConnDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1638:1: ( rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5 )
            // InternalComponentModel.g:1639:2: rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__CompConnDec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__4"


    // $ANTLR start "rule__CompConnDec__Group__4__Impl"
    // InternalComponentModel.g:1646:1: rule__CompConnDec__Group__4__Impl : ( '.' ) ;
    public final void rule__CompConnDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1650:1: ( ( '.' ) )
            // InternalComponentModel.g:1651:1: ( '.' )
            {
            // InternalComponentModel.g:1651:1: ( '.' )
            // InternalComponentModel.g:1652:2: '.'
            {
             before(grammarAccess.getCompConnDecAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__4__Impl"


    // $ANTLR start "rule__CompConnDec__Group__5"
    // InternalComponentModel.g:1661:1: rule__CompConnDec__Group__5 : rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6 ;
    public final void rule__CompConnDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1665:1: ( rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6 )
            // InternalComponentModel.g:1666:2: rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__CompConnDec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__5"


    // $ANTLR start "rule__CompConnDec__Group__5__Impl"
    // InternalComponentModel.g:1673:1: rule__CompConnDec__Group__5__Impl : ( ( rule__CompConnDec__SourcePortAssignment_5 ) ) ;
    public final void rule__CompConnDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1677:1: ( ( ( rule__CompConnDec__SourcePortAssignment_5 ) ) )
            // InternalComponentModel.g:1678:1: ( ( rule__CompConnDec__SourcePortAssignment_5 ) )
            {
            // InternalComponentModel.g:1678:1: ( ( rule__CompConnDec__SourcePortAssignment_5 ) )
            // InternalComponentModel.g:1679:2: ( rule__CompConnDec__SourcePortAssignment_5 )
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortAssignment_5()); 
            // InternalComponentModel.g:1680:2: ( rule__CompConnDec__SourcePortAssignment_5 )
            // InternalComponentModel.g:1680:3: rule__CompConnDec__SourcePortAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__SourcePortAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getSourcePortAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__5__Impl"


    // $ANTLR start "rule__CompConnDec__Group__6"
    // InternalComponentModel.g:1688:1: rule__CompConnDec__Group__6 : rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7 ;
    public final void rule__CompConnDec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1692:1: ( rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7 )
            // InternalComponentModel.g:1693:2: rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__CompConnDec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__6"


    // $ANTLR start "rule__CompConnDec__Group__6__Impl"
    // InternalComponentModel.g:1700:1: rule__CompConnDec__Group__6__Impl : ( 'to' ) ;
    public final void rule__CompConnDec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1704:1: ( ( 'to' ) )
            // InternalComponentModel.g:1705:1: ( 'to' )
            {
            // InternalComponentModel.g:1705:1: ( 'to' )
            // InternalComponentModel.g:1706:2: 'to'
            {
             before(grammarAccess.getCompConnDecAccess().getToKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__6__Impl"


    // $ANTLR start "rule__CompConnDec__Group__7"
    // InternalComponentModel.g:1715:1: rule__CompConnDec__Group__7 : rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8 ;
    public final void rule__CompConnDec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1719:1: ( rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8 )
            // InternalComponentModel.g:1720:2: rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__CompConnDec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__7"


    // $ANTLR start "rule__CompConnDec__Group__7__Impl"
    // InternalComponentModel.g:1727:1: rule__CompConnDec__Group__7__Impl : ( ( rule__CompConnDec__TargetCompAssignment_7 ) ) ;
    public final void rule__CompConnDec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1731:1: ( ( ( rule__CompConnDec__TargetCompAssignment_7 ) ) )
            // InternalComponentModel.g:1732:1: ( ( rule__CompConnDec__TargetCompAssignment_7 ) )
            {
            // InternalComponentModel.g:1732:1: ( ( rule__CompConnDec__TargetCompAssignment_7 ) )
            // InternalComponentModel.g:1733:2: ( rule__CompConnDec__TargetCompAssignment_7 )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompAssignment_7()); 
            // InternalComponentModel.g:1734:2: ( rule__CompConnDec__TargetCompAssignment_7 )
            // InternalComponentModel.g:1734:3: rule__CompConnDec__TargetCompAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__TargetCompAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getTargetCompAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__7__Impl"


    // $ANTLR start "rule__CompConnDec__Group__8"
    // InternalComponentModel.g:1742:1: rule__CompConnDec__Group__8 : rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9 ;
    public final void rule__CompConnDec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1746:1: ( rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9 )
            // InternalComponentModel.g:1747:2: rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__CompConnDec__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__8"


    // $ANTLR start "rule__CompConnDec__Group__8__Impl"
    // InternalComponentModel.g:1754:1: rule__CompConnDec__Group__8__Impl : ( '.' ) ;
    public final void rule__CompConnDec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1758:1: ( ( '.' ) )
            // InternalComponentModel.g:1759:1: ( '.' )
            {
            // InternalComponentModel.g:1759:1: ( '.' )
            // InternalComponentModel.g:1760:2: '.'
            {
             before(grammarAccess.getCompConnDecAccess().getFullStopKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__8__Impl"


    // $ANTLR start "rule__CompConnDec__Group__9"
    // InternalComponentModel.g:1769:1: rule__CompConnDec__Group__9 : rule__CompConnDec__Group__9__Impl ;
    public final void rule__CompConnDec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1773:1: ( rule__CompConnDec__Group__9__Impl )
            // InternalComponentModel.g:1774:2: rule__CompConnDec__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__9"


    // $ANTLR start "rule__CompConnDec__Group__9__Impl"
    // InternalComponentModel.g:1780:1: rule__CompConnDec__Group__9__Impl : ( ( rule__CompConnDec__TargetPortAssignment_9 ) ) ;
    public final void rule__CompConnDec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1784:1: ( ( ( rule__CompConnDec__TargetPortAssignment_9 ) ) )
            // InternalComponentModel.g:1785:1: ( ( rule__CompConnDec__TargetPortAssignment_9 ) )
            {
            // InternalComponentModel.g:1785:1: ( ( rule__CompConnDec__TargetPortAssignment_9 ) )
            // InternalComponentModel.g:1786:2: ( rule__CompConnDec__TargetPortAssignment_9 )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortAssignment_9()); 
            // InternalComponentModel.g:1787:2: ( rule__CompConnDec__TargetPortAssignment_9 )
            // InternalComponentModel.g:1787:3: rule__CompConnDec__TargetPortAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__TargetPortAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getTargetPortAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__Group__9__Impl"


    // $ANTLR start "rule__ComponentType__Group__0"
    // InternalComponentModel.g:1796:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1800:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // InternalComponentModel.g:1801:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__0"


    // $ANTLR start "rule__ComponentType__Group__0__Impl"
    // InternalComponentModel.g:1808:1: rule__ComponentType__Group__0__Impl : ( 'component type' ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1812:1: ( ( 'component type' ) )
            // InternalComponentModel.g:1813:1: ( 'component type' )
            {
            // InternalComponentModel.g:1813:1: ( 'component type' )
            // InternalComponentModel.g:1814:2: 'component type'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__0__Impl"


    // $ANTLR start "rule__ComponentType__Group__1"
    // InternalComponentModel.g:1823:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1827:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // InternalComponentModel.g:1828:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__1"


    // $ANTLR start "rule__ComponentType__Group__1__Impl"
    // InternalComponentModel.g:1835:1: rule__ComponentType__Group__1__Impl : ( ( rule__ComponentType__NameAssignment_1 ) ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1839:1: ( ( ( rule__ComponentType__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1840:1: ( ( rule__ComponentType__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1840:1: ( ( rule__ComponentType__NameAssignment_1 ) )
            // InternalComponentModel.g:1841:2: ( rule__ComponentType__NameAssignment_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1842:2: ( rule__ComponentType__NameAssignment_1 )
            // InternalComponentModel.g:1842:3: rule__ComponentType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__1__Impl"


    // $ANTLR start "rule__ComponentType__Group__2"
    // InternalComponentModel.g:1850:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1854:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // InternalComponentModel.g:1855:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__2"


    // $ANTLR start "rule__ComponentType__Group__2__Impl"
    // InternalComponentModel.g:1862:1: rule__ComponentType__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1866:1: ( ( '{' ) )
            // InternalComponentModel.g:1867:1: ( '{' )
            {
            // InternalComponentModel.g:1867:1: ( '{' )
            // InternalComponentModel.g:1868:2: '{'
            {
             before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__2__Impl"


    // $ANTLR start "rule__ComponentType__Group__3"
    // InternalComponentModel.g:1877:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1881:1: ( rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 )
            // InternalComponentModel.g:1882:2: rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__3"


    // $ANTLR start "rule__ComponentType__Group__3__Impl"
    // InternalComponentModel.g:1889:1: rule__ComponentType__Group__3__Impl : ( ( rule__ComponentType__CompFeaturesAssignment_3 )* ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1893:1: ( ( ( rule__ComponentType__CompFeaturesAssignment_3 )* ) )
            // InternalComponentModel.g:1894:1: ( ( rule__ComponentType__CompFeaturesAssignment_3 )* )
            {
            // InternalComponentModel.g:1894:1: ( ( rule__ComponentType__CompFeaturesAssignment_3 )* )
            // InternalComponentModel.g:1895:2: ( rule__ComponentType__CompFeaturesAssignment_3 )*
            {
             before(grammarAccess.getComponentTypeAccess().getCompFeaturesAssignment_3()); 
            // InternalComponentModel.g:1896:2: ( rule__ComponentType__CompFeaturesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentModel.g:1896:3: rule__ComponentType__CompFeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ComponentType__CompFeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentTypeAccess().getCompFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__3__Impl"


    // $ANTLR start "rule__ComponentType__Group__4"
    // InternalComponentModel.g:1904:1: rule__ComponentType__Group__4 : rule__ComponentType__Group__4__Impl ;
    public final void rule__ComponentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1908:1: ( rule__ComponentType__Group__4__Impl )
            // InternalComponentModel.g:1909:2: rule__ComponentType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__4"


    // $ANTLR start "rule__ComponentType__Group__4__Impl"
    // InternalComponentModel.g:1915:1: rule__ComponentType__Group__4__Impl : ( '}' ) ;
    public final void rule__ComponentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1919:1: ( ( '}' ) )
            // InternalComponentModel.g:1920:1: ( '}' )
            {
            // InternalComponentModel.g:1920:1: ( '}' )
            // InternalComponentModel.g:1921:2: '}'
            {
             before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__4__Impl"


    // $ANTLR start "rule__InPort__Group__0"
    // InternalComponentModel.g:1931:1: rule__InPort__Group__0 : rule__InPort__Group__0__Impl rule__InPort__Group__1 ;
    public final void rule__InPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1935:1: ( rule__InPort__Group__0__Impl rule__InPort__Group__1 )
            // InternalComponentModel.g:1936:2: rule__InPort__Group__0__Impl rule__InPort__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__0"


    // $ANTLR start "rule__InPort__Group__0__Impl"
    // InternalComponentModel.g:1943:1: rule__InPort__Group__0__Impl : ( 'port instance in' ) ;
    public final void rule__InPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1947:1: ( ( 'port instance in' ) )
            // InternalComponentModel.g:1948:1: ( 'port instance in' )
            {
            // InternalComponentModel.g:1948:1: ( 'port instance in' )
            // InternalComponentModel.g:1949:2: 'port instance in'
            {
             before(grammarAccess.getInPortAccess().getPortInstanceInKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getPortInstanceInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__0__Impl"


    // $ANTLR start "rule__InPort__Group__1"
    // InternalComponentModel.g:1958:1: rule__InPort__Group__1 : rule__InPort__Group__1__Impl rule__InPort__Group__2 ;
    public final void rule__InPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1962:1: ( rule__InPort__Group__1__Impl rule__InPort__Group__2 )
            // InternalComponentModel.g:1963:2: rule__InPort__Group__1__Impl rule__InPort__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__InPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__1"


    // $ANTLR start "rule__InPort__Group__1__Impl"
    // InternalComponentModel.g:1970:1: rule__InPort__Group__1__Impl : ( ( rule__InPort__NameAssignment_1 ) ) ;
    public final void rule__InPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1974:1: ( ( ( rule__InPort__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1975:1: ( ( rule__InPort__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1975:1: ( ( rule__InPort__NameAssignment_1 ) )
            // InternalComponentModel.g:1976:2: ( rule__InPort__NameAssignment_1 )
            {
             before(grammarAccess.getInPortAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1977:2: ( rule__InPort__NameAssignment_1 )
            // InternalComponentModel.g:1977:3: rule__InPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__1__Impl"


    // $ANTLR start "rule__InPort__Group__2"
    // InternalComponentModel.g:1985:1: rule__InPort__Group__2 : rule__InPort__Group__2__Impl rule__InPort__Group__3 ;
    public final void rule__InPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1989:1: ( rule__InPort__Group__2__Impl rule__InPort__Group__3 )
            // InternalComponentModel.g:1990:2: rule__InPort__Group__2__Impl rule__InPort__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__InPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__2"


    // $ANTLR start "rule__InPort__Group__2__Impl"
    // InternalComponentModel.g:1997:1: rule__InPort__Group__2__Impl : ( ':' ) ;
    public final void rule__InPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2001:1: ( ( ':' ) )
            // InternalComponentModel.g:2002:1: ( ':' )
            {
            // InternalComponentModel.g:2002:1: ( ':' )
            // InternalComponentModel.g:2003:2: ':'
            {
             before(grammarAccess.getInPortAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__2__Impl"


    // $ANTLR start "rule__InPort__Group__3"
    // InternalComponentModel.g:2012:1: rule__InPort__Group__3 : rule__InPort__Group__3__Impl ;
    public final void rule__InPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2016:1: ( rule__InPort__Group__3__Impl )
            // InternalComponentModel.g:2017:2: rule__InPort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InPort__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__3"


    // $ANTLR start "rule__InPort__Group__3__Impl"
    // InternalComponentModel.g:2023:1: rule__InPort__Group__3__Impl : ( ( rule__InPort__SuperTypeAssignment_3 ) ) ;
    public final void rule__InPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2027:1: ( ( ( rule__InPort__SuperTypeAssignment_3 ) ) )
            // InternalComponentModel.g:2028:1: ( ( rule__InPort__SuperTypeAssignment_3 ) )
            {
            // InternalComponentModel.g:2028:1: ( ( rule__InPort__SuperTypeAssignment_3 ) )
            // InternalComponentModel.g:2029:2: ( rule__InPort__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getInPortAccess().getSuperTypeAssignment_3()); 
            // InternalComponentModel.g:2030:2: ( rule__InPort__SuperTypeAssignment_3 )
            // InternalComponentModel.g:2030:3: rule__InPort__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InPort__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInPortAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__Group__3__Impl"


    // $ANTLR start "rule__OutPort__Group__0"
    // InternalComponentModel.g:2039:1: rule__OutPort__Group__0 : rule__OutPort__Group__0__Impl rule__OutPort__Group__1 ;
    public final void rule__OutPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2043:1: ( rule__OutPort__Group__0__Impl rule__OutPort__Group__1 )
            // InternalComponentModel.g:2044:2: rule__OutPort__Group__0__Impl rule__OutPort__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OutPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__0"


    // $ANTLR start "rule__OutPort__Group__0__Impl"
    // InternalComponentModel.g:2051:1: rule__OutPort__Group__0__Impl : ( 'port instance out' ) ;
    public final void rule__OutPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2055:1: ( ( 'port instance out' ) )
            // InternalComponentModel.g:2056:1: ( 'port instance out' )
            {
            // InternalComponentModel.g:2056:1: ( 'port instance out' )
            // InternalComponentModel.g:2057:2: 'port instance out'
            {
             before(grammarAccess.getOutPortAccess().getPortInstanceOutKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getPortInstanceOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__0__Impl"


    // $ANTLR start "rule__OutPort__Group__1"
    // InternalComponentModel.g:2066:1: rule__OutPort__Group__1 : rule__OutPort__Group__1__Impl rule__OutPort__Group__2 ;
    public final void rule__OutPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2070:1: ( rule__OutPort__Group__1__Impl rule__OutPort__Group__2 )
            // InternalComponentModel.g:2071:2: rule__OutPort__Group__1__Impl rule__OutPort__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OutPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__1"


    // $ANTLR start "rule__OutPort__Group__1__Impl"
    // InternalComponentModel.g:2078:1: rule__OutPort__Group__1__Impl : ( ( rule__OutPort__NameAssignment_1 ) ) ;
    public final void rule__OutPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2082:1: ( ( ( rule__OutPort__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2083:1: ( ( rule__OutPort__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2083:1: ( ( rule__OutPort__NameAssignment_1 ) )
            // InternalComponentModel.g:2084:2: ( rule__OutPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutPortAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2085:2: ( rule__OutPort__NameAssignment_1 )
            // InternalComponentModel.g:2085:3: rule__OutPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__1__Impl"


    // $ANTLR start "rule__OutPort__Group__2"
    // InternalComponentModel.g:2093:1: rule__OutPort__Group__2 : rule__OutPort__Group__2__Impl rule__OutPort__Group__3 ;
    public final void rule__OutPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2097:1: ( rule__OutPort__Group__2__Impl rule__OutPort__Group__3 )
            // InternalComponentModel.g:2098:2: rule__OutPort__Group__2__Impl rule__OutPort__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OutPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__2"


    // $ANTLR start "rule__OutPort__Group__2__Impl"
    // InternalComponentModel.g:2105:1: rule__OutPort__Group__2__Impl : ( ':' ) ;
    public final void rule__OutPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2109:1: ( ( ':' ) )
            // InternalComponentModel.g:2110:1: ( ':' )
            {
            // InternalComponentModel.g:2110:1: ( ':' )
            // InternalComponentModel.g:2111:2: ':'
            {
             before(grammarAccess.getOutPortAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__2__Impl"


    // $ANTLR start "rule__OutPort__Group__3"
    // InternalComponentModel.g:2120:1: rule__OutPort__Group__3 : rule__OutPort__Group__3__Impl ;
    public final void rule__OutPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2124:1: ( rule__OutPort__Group__3__Impl )
            // InternalComponentModel.g:2125:2: rule__OutPort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__3"


    // $ANTLR start "rule__OutPort__Group__3__Impl"
    // InternalComponentModel.g:2131:1: rule__OutPort__Group__3__Impl : ( ( rule__OutPort__SuperTypeAssignment_3 ) ) ;
    public final void rule__OutPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2135:1: ( ( ( rule__OutPort__SuperTypeAssignment_3 ) ) )
            // InternalComponentModel.g:2136:1: ( ( rule__OutPort__SuperTypeAssignment_3 ) )
            {
            // InternalComponentModel.g:2136:1: ( ( rule__OutPort__SuperTypeAssignment_3 ) )
            // InternalComponentModel.g:2137:2: ( rule__OutPort__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getOutPortAccess().getSuperTypeAssignment_3()); 
            // InternalComponentModel.g:2138:2: ( rule__OutPort__SuperTypeAssignment_3 )
            // InternalComponentModel.g:2138:3: rule__OutPort__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutPortAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__Group__3__Impl"


    // $ANTLR start "rule__PortType__Group__0"
    // InternalComponentModel.g:2147:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2151:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // InternalComponentModel.g:2152:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PortType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__0"


    // $ANTLR start "rule__PortType__Group__0__Impl"
    // InternalComponentModel.g:2159:1: rule__PortType__Group__0__Impl : ( 'port type' ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2163:1: ( ( 'port type' ) )
            // InternalComponentModel.g:2164:1: ( 'port type' )
            {
            // InternalComponentModel.g:2164:1: ( 'port type' )
            // InternalComponentModel.g:2165:2: 'port type'
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getPortTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__0__Impl"


    // $ANTLR start "rule__PortType__Group__1"
    // InternalComponentModel.g:2174:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2178:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // InternalComponentModel.g:2179:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PortType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__1"


    // $ANTLR start "rule__PortType__Group__1__Impl"
    // InternalComponentModel.g:2186:1: rule__PortType__Group__1__Impl : ( ( rule__PortType__NameAssignment_1 ) ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2190:1: ( ( ( rule__PortType__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2191:1: ( ( rule__PortType__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2191:1: ( ( rule__PortType__NameAssignment_1 ) )
            // InternalComponentModel.g:2192:2: ( rule__PortType__NameAssignment_1 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2193:2: ( rule__PortType__NameAssignment_1 )
            // InternalComponentModel.g:2193:3: rule__PortType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PortType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__1__Impl"


    // $ANTLR start "rule__PortType__Group__2"
    // InternalComponentModel.g:2201:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2205:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // InternalComponentModel.g:2206:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__PortType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__2"


    // $ANTLR start "rule__PortType__Group__2__Impl"
    // InternalComponentModel.g:2213:1: rule__PortType__Group__2__Impl : ( ':' ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2217:1: ( ( ':' ) )
            // InternalComponentModel.g:2218:1: ( ':' )
            {
            // InternalComponentModel.g:2218:1: ( ':' )
            // InternalComponentModel.g:2219:2: ':'
            {
             before(grammarAccess.getPortTypeAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__2__Impl"


    // $ANTLR start "rule__PortType__Group__3"
    // InternalComponentModel.g:2228:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl rule__PortType__Group__4 ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2232:1: ( rule__PortType__Group__3__Impl rule__PortType__Group__4 )
            // InternalComponentModel.g:2233:2: rule__PortType__Group__3__Impl rule__PortType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__PortType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__3"


    // $ANTLR start "rule__PortType__Group__3__Impl"
    // InternalComponentModel.g:2240:1: rule__PortType__Group__3__Impl : ( 'eModes' ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2244:1: ( ( 'eModes' ) )
            // InternalComponentModel.g:2245:1: ( 'eModes' )
            {
            // InternalComponentModel.g:2245:1: ( 'eModes' )
            // InternalComponentModel.g:2246:2: 'eModes'
            {
             before(grammarAccess.getPortTypeAccess().getEModesKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getEModesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__3__Impl"


    // $ANTLR start "rule__PortType__Group__4"
    // InternalComponentModel.g:2255:1: rule__PortType__Group__4 : rule__PortType__Group__4__Impl rule__PortType__Group__5 ;
    public final void rule__PortType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2259:1: ( rule__PortType__Group__4__Impl rule__PortType__Group__5 )
            // InternalComponentModel.g:2260:2: rule__PortType__Group__4__Impl rule__PortType__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__PortType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__4"


    // $ANTLR start "rule__PortType__Group__4__Impl"
    // InternalComponentModel.g:2267:1: rule__PortType__Group__4__Impl : ( '{' ) ;
    public final void rule__PortType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2271:1: ( ( '{' ) )
            // InternalComponentModel.g:2272:1: ( '{' )
            {
            // InternalComponentModel.g:2272:1: ( '{' )
            // InternalComponentModel.g:2273:2: '{'
            {
             before(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__4__Impl"


    // $ANTLR start "rule__PortType__Group__5"
    // InternalComponentModel.g:2282:1: rule__PortType__Group__5 : rule__PortType__Group__5__Impl rule__PortType__Group__6 ;
    public final void rule__PortType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2286:1: ( rule__PortType__Group__5__Impl rule__PortType__Group__6 )
            // InternalComponentModel.g:2287:2: rule__PortType__Group__5__Impl rule__PortType__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__PortType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PortType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__5"


    // $ANTLR start "rule__PortType__Group__5__Impl"
    // InternalComponentModel.g:2294:1: rule__PortType__Group__5__Impl : ( ( rule__PortType__EModesAssignment_5 ) ) ;
    public final void rule__PortType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2298:1: ( ( ( rule__PortType__EModesAssignment_5 ) ) )
            // InternalComponentModel.g:2299:1: ( ( rule__PortType__EModesAssignment_5 ) )
            {
            // InternalComponentModel.g:2299:1: ( ( rule__PortType__EModesAssignment_5 ) )
            // InternalComponentModel.g:2300:2: ( rule__PortType__EModesAssignment_5 )
            {
             before(grammarAccess.getPortTypeAccess().getEModesAssignment_5()); 
            // InternalComponentModel.g:2301:2: ( rule__PortType__EModesAssignment_5 )
            // InternalComponentModel.g:2301:3: rule__PortType__EModesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PortType__EModesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getEModesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__5__Impl"


    // $ANTLR start "rule__PortType__Group__6"
    // InternalComponentModel.g:2309:1: rule__PortType__Group__6 : rule__PortType__Group__6__Impl ;
    public final void rule__PortType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2313:1: ( rule__PortType__Group__6__Impl )
            // InternalComponentModel.g:2314:2: rule__PortType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PortType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__6"


    // $ANTLR start "rule__PortType__Group__6__Impl"
    // InternalComponentModel.g:2320:1: rule__PortType__Group__6__Impl : ( '}' ) ;
    public final void rule__PortType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2324:1: ( ( '}' ) )
            // InternalComponentModel.g:2325:1: ( '}' )
            {
            // InternalComponentModel.g:2325:1: ( '}' )
            // InternalComponentModel.g:2326:2: '}'
            {
             before(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__6__Impl"


    // $ANTLR start "rule__ErrorModes__Group__0"
    // InternalComponentModel.g:2336:1: rule__ErrorModes__Group__0 : rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1 ;
    public final void rule__ErrorModes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2340:1: ( rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1 )
            // InternalComponentModel.g:2341:2: rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ErrorModes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorModes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorModes__Group__0"


    // $ANTLR start "rule__ErrorModes__Group__0__Impl"
    // InternalComponentModel.g:2348:1: rule__ErrorModes__Group__0__Impl : ( 'eMode' ) ;
    public final void rule__ErrorModes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2352:1: ( ( 'eMode' ) )
            // InternalComponentModel.g:2353:1: ( 'eMode' )
            {
            // InternalComponentModel.g:2353:1: ( 'eMode' )
            // InternalComponentModel.g:2354:2: 'eMode'
            {
             before(grammarAccess.getErrorModesAccess().getEModeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getErrorModesAccess().getEModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorModes__Group__0__Impl"


    // $ANTLR start "rule__ErrorModes__Group__1"
    // InternalComponentModel.g:2363:1: rule__ErrorModes__Group__1 : rule__ErrorModes__Group__1__Impl ;
    public final void rule__ErrorModes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2367:1: ( rule__ErrorModes__Group__1__Impl )
            // InternalComponentModel.g:2368:2: rule__ErrorModes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorModes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorModes__Group__1"


    // $ANTLR start "rule__ErrorModes__Group__1__Impl"
    // InternalComponentModel.g:2374:1: rule__ErrorModes__Group__1__Impl : ( ( rule__ErrorModes__NameAssignment_1 ) ) ;
    public final void rule__ErrorModes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2378:1: ( ( ( rule__ErrorModes__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2379:1: ( ( rule__ErrorModes__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2379:1: ( ( rule__ErrorModes__NameAssignment_1 ) )
            // InternalComponentModel.g:2380:2: ( rule__ErrorModes__NameAssignment_1 )
            {
             before(grammarAccess.getErrorModesAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2381:2: ( rule__ErrorModes__NameAssignment_1 )
            // InternalComponentModel.g:2381:3: rule__ErrorModes__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ErrorModes__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getErrorModesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorModes__Group__1__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__0"
    // InternalComponentModel.g:2390:1: rule__ComponentImpl__Group__0 : rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 ;
    public final void rule__ComponentImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2394:1: ( rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 )
            // InternalComponentModel.g:2395:2: rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentImpl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__0"


    // $ANTLR start "rule__ComponentImpl__Group__0__Impl"
    // InternalComponentModel.g:2402:1: rule__ComponentImpl__Group__0__Impl : ( 'component implementation' ) ;
    public final void rule__ComponentImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2406:1: ( ( 'component implementation' ) )
            // InternalComponentModel.g:2407:1: ( 'component implementation' )
            {
            // InternalComponentModel.g:2407:1: ( 'component implementation' )
            // InternalComponentModel.g:2408:2: 'component implementation'
            {
             before(grammarAccess.getComponentImplAccess().getComponentImplementationKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getComponentImplementationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__0__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__1"
    // InternalComponentModel.g:2417:1: rule__ComponentImpl__Group__1 : rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 ;
    public final void rule__ComponentImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2421:1: ( rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 )
            // InternalComponentModel.g:2422:2: rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentImpl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__1"


    // $ANTLR start "rule__ComponentImpl__Group__1__Impl"
    // InternalComponentModel.g:2429:1: rule__ComponentImpl__Group__1__Impl : ( ( rule__ComponentImpl__NameAssignment_1 ) ) ;
    public final void rule__ComponentImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2433:1: ( ( ( rule__ComponentImpl__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2434:1: ( ( rule__ComponentImpl__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2434:1: ( ( rule__ComponentImpl__NameAssignment_1 ) )
            // InternalComponentModel.g:2435:2: ( rule__ComponentImpl__NameAssignment_1 )
            {
             before(grammarAccess.getComponentImplAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2436:2: ( rule__ComponentImpl__NameAssignment_1 )
            // InternalComponentModel.g:2436:3: rule__ComponentImpl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__1__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__2"
    // InternalComponentModel.g:2444:1: rule__ComponentImpl__Group__2 : rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 ;
    public final void rule__ComponentImpl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2448:1: ( rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 )
            // InternalComponentModel.g:2449:2: rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ComponentImpl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__2"


    // $ANTLR start "rule__ComponentImpl__Group__2__Impl"
    // InternalComponentModel.g:2456:1: rule__ComponentImpl__Group__2__Impl : ( ':' ) ;
    public final void rule__ComponentImpl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2460:1: ( ( ':' ) )
            // InternalComponentModel.g:2461:1: ( ':' )
            {
            // InternalComponentModel.g:2461:1: ( ':' )
            // InternalComponentModel.g:2462:2: ':'
            {
             before(grammarAccess.getComponentImplAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__2__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__3"
    // InternalComponentModel.g:2471:1: rule__ComponentImpl__Group__3 : rule__ComponentImpl__Group__3__Impl ;
    public final void rule__ComponentImpl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2475:1: ( rule__ComponentImpl__Group__3__Impl )
            // InternalComponentModel.g:2476:2: rule__ComponentImpl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__3"


    // $ANTLR start "rule__ComponentImpl__Group__3__Impl"
    // InternalComponentModel.g:2482:1: rule__ComponentImpl__Group__3__Impl : ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) ) ;
    public final void rule__ComponentImpl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2486:1: ( ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) ) )
            // InternalComponentModel.g:2487:1: ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) )
            {
            // InternalComponentModel.g:2487:1: ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) )
            // InternalComponentModel.g:2488:2: ( rule__ComponentImpl__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeAssignment_3()); 
            // InternalComponentModel.g:2489:2: ( rule__ComponentImpl__SuperTypeAssignment_3 )
            // InternalComponentModel.g:2489:3: rule__ComponentImpl__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentImplAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__3__Impl"


    // $ANTLR start "rule__ComponentModel__ElementsAssignment"
    // InternalComponentModel.g:2498:1: rule__ComponentModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ComponentModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2502:1: ( ( ruleAbstractElement ) )
            // InternalComponentModel.g:2503:2: ( ruleAbstractElement )
            {
            // InternalComponentModel.g:2503:2: ( ruleAbstractElement )
            // InternalComponentModel.g:2504:3: ruleAbstractElement
            {
             before(grammarAccess.getComponentModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getComponentModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModel__ElementsAssignment"


    // $ANTLR start "rule__ImportE__IncludedEModelAssignment_1"
    // InternalComponentModel.g:2513:1: rule__ImportE__IncludedEModelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ImportE__IncludedEModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2517:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2518:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2518:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2519:3: ( RULE_ID )
            {
             before(grammarAccess.getImportEAccess().getIncludedEModelErrorModelCrossReference_1_0()); 
            // InternalComponentModel.g:2520:3: ( RULE_ID )
            // InternalComponentModel.g:2521:4: RULE_ID
            {
             before(grammarAccess.getImportEAccess().getIncludedEModelErrorModelIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportEAccess().getIncludedEModelErrorModelIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportEAccess().getIncludedEModelErrorModelCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportE__IncludedEModelAssignment_1"


    // $ANTLR start "rule__SystemConnDec__NameAssignment_1"
    // InternalComponentModel.g:2532:1: rule__SystemConnDec__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemConnDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2536:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2537:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2537:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2538:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__NameAssignment_1"


    // $ANTLR start "rule__SystemConnDec__SourceSystemAssignment_3"
    // InternalComponentModel.g:2547:1: rule__SystemConnDec__SourceSystemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__SourceSystemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2551:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2552:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2552:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2553:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_3_0()); 
            // InternalComponentModel.g:2554:3: ( RULE_ID )
            // InternalComponentModel.g:2555:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__SourceSystemAssignment_3"


    // $ANTLR start "rule__SystemConnDec__SourcePortAssignment_5"
    // InternalComponentModel.g:2566:1: rule__SystemConnDec__SourcePortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__SourcePortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2570:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2571:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2571:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2572:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_5_0()); 
            // InternalComponentModel.g:2573:3: ( RULE_ID )
            // InternalComponentModel.g:2574:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__SourcePortAssignment_5"


    // $ANTLR start "rule__SystemConnDec__TargetSystemAssignment_7"
    // InternalComponentModel.g:2585:1: rule__SystemConnDec__TargetSystemAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__TargetSystemAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2589:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2590:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2590:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2591:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_7_0()); 
            // InternalComponentModel.g:2592:3: ( RULE_ID )
            // InternalComponentModel.g:2593:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__TargetSystemAssignment_7"


    // $ANTLR start "rule__SystemConnDec__TargetPortAssignment_9"
    // InternalComponentModel.g:2604:1: rule__SystemConnDec__TargetPortAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__TargetPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2608:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2609:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2609:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2610:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_9_0()); 
            // InternalComponentModel.g:2611:3: ( RULE_ID )
            // InternalComponentModel.g:2612:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemConnDec__TargetPortAssignment_9"


    // $ANTLR start "rule__SystemDec__NameAssignment_1"
    // InternalComponentModel.g:2623:1: rule__SystemDec__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2627:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2628:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2628:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2629:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__NameAssignment_1"


    // $ANTLR start "rule__SystemDec__SysFeaturesAssignment_3"
    // InternalComponentModel.g:2638:1: rule__SystemDec__SysFeaturesAssignment_3 : ( ruleAbstractFeatures ) ;
    public final void rule__SystemDec__SysFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2642:1: ( ( ruleAbstractFeatures ) )
            // InternalComponentModel.g:2643:2: ( ruleAbstractFeatures )
            {
            // InternalComponentModel.g:2643:2: ( ruleAbstractFeatures )
            // InternalComponentModel.g:2644:3: ruleAbstractFeatures
            {
             before(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractFeatures();

            state._fsp--;

             after(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDec__SysFeaturesAssignment_3"


    // $ANTLR start "rule__SystemPortIn__NameAssignment_1"
    // InternalComponentModel.g:2653:1: rule__SystemPortIn__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemPortIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2657:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2658:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2658:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2659:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__NameAssignment_1"


    // $ANTLR start "rule__SystemPortIn__InCompAssignment_3"
    // InternalComponentModel.g:2668:1: rule__SystemPortIn__InCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortIn__InCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2672:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2673:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2673:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2674:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_3_0()); 
            // InternalComponentModel.g:2675:3: ( RULE_ID )
            // InternalComponentModel.g:2676:4: RULE_ID
            {
             before(grammarAccess.getSystemPortInAccess().getInCompComponentImplIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getInCompComponentImplIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__InCompAssignment_3"


    // $ANTLR start "rule__SystemPortIn__InPortAssignment_5"
    // InternalComponentModel.g:2687:1: rule__SystemPortIn__InPortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortIn__InPortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2691:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2692:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2692:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2693:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortInAccess().getInPortPortCrossReference_5_0()); 
            // InternalComponentModel.g:2694:3: ( RULE_ID )
            // InternalComponentModel.g:2695:4: RULE_ID
            {
             before(grammarAccess.getSystemPortInAccess().getInPortPortIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getInPortPortIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemPortInAccess().getInPortPortCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortIn__InPortAssignment_5"


    // $ANTLR start "rule__SystemPortOut__NameAssignment_1"
    // InternalComponentModel.g:2706:1: rule__SystemPortOut__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemPortOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2710:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2711:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2711:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2712:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__NameAssignment_1"


    // $ANTLR start "rule__SystemPortOut__OutCompAssignment_3"
    // InternalComponentModel.g:2721:1: rule__SystemPortOut__OutCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortOut__OutCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2725:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2726:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2726:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2727:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_3_0()); 
            // InternalComponentModel.g:2728:3: ( RULE_ID )
            // InternalComponentModel.g:2729:4: RULE_ID
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__OutCompAssignment_3"


    // $ANTLR start "rule__SystemPortOut__OutPortAssignment_5"
    // InternalComponentModel.g:2740:1: rule__SystemPortOut__OutPortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortOut__OutPortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2744:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2745:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2745:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2746:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortPortCrossReference_5_0()); 
            // InternalComponentModel.g:2747:3: ( RULE_ID )
            // InternalComponentModel.g:2748:4: RULE_ID
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortPortIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getOutPortPortIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemPortOutAccess().getOutPortPortCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPortOut__OutPortAssignment_5"


    // $ANTLR start "rule__CompConnDec__NameAssignment_1"
    // InternalComponentModel.g:2759:1: rule__CompConnDec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompConnDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2763:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:2764:2: ( RULE_ID )
            {
            // InternalComponentModel.g:2764:2: ( RULE_ID )
            // InternalComponentModel.g:2765:3: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__NameAssignment_1"


    // $ANTLR start "rule__CompConnDec__SourceCompAssignment_3"
    // InternalComponentModel.g:2774:1: rule__CompConnDec__SourceCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__SourceCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2778:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2779:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2779:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2780:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_3_0()); 
            // InternalComponentModel.g:2781:3: ( RULE_ID )
            // InternalComponentModel.g:2782:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__SourceCompAssignment_3"


    // $ANTLR start "rule__CompConnDec__SourcePortAssignment_5"
    // InternalComponentModel.g:2793:1: rule__CompConnDec__SourcePortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__SourcePortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2797:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2798:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2798:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2799:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortPortCrossReference_5_0()); 
            // InternalComponentModel.g:2800:3: ( RULE_ID )
            // InternalComponentModel.g:2801:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortPortIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getSourcePortPortIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getSourcePortPortCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__SourcePortAssignment_5"


    // $ANTLR start "rule__CompConnDec__TargetCompAssignment_7"
    // InternalComponentModel.g:2812:1: rule__CompConnDec__TargetCompAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__TargetCompAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2816:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2817:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2817:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2818:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_7_0()); 
            // InternalComponentModel.g:2819:3: ( RULE_ID )
            // InternalComponentModel.g:2820:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__TargetCompAssignment_7"


    // $ANTLR start "rule__CompConnDec__TargetPortAssignment_9"
    // InternalComponentModel.g:2831:1: rule__CompConnDec__TargetPortAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__TargetPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2835:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2836:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2836:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2837:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortPortCrossReference_9_0()); 
            // InternalComponentModel.g:2838:3: ( RULE_ID )
            // InternalComponentModel.g:2839:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortPortIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getTargetPortPortIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getTargetPortPortCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompConnDec__TargetPortAssignment_9"


    // $ANTLR start "rule__ComponentType__NameAssignment_1"
    // InternalComponentModel.g:2850:1: rule__ComponentType__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ComponentType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2854:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2855:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2855:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2856:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__NameAssignment_1"


    // $ANTLR start "rule__ComponentType__CompFeaturesAssignment_3"
    // InternalComponentModel.g:2865:1: rule__ComponentType__CompFeaturesAssignment_3 : ( ruleComponentFeature ) ;
    public final void rule__ComponentType__CompFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2869:1: ( ( ruleComponentFeature ) )
            // InternalComponentModel.g:2870:2: ( ruleComponentFeature )
            {
            // InternalComponentModel.g:2870:2: ( ruleComponentFeature )
            // InternalComponentModel.g:2871:3: ruleComponentFeature
            {
             before(grammarAccess.getComponentTypeAccess().getCompFeaturesComponentFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentFeature();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getCompFeaturesComponentFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__CompFeaturesAssignment_3"


    // $ANTLR start "rule__ComponentFeature__PortsAssignment"
    // InternalComponentModel.g:2880:1: rule__ComponentFeature__PortsAssignment : ( rulePort ) ;
    public final void rule__ComponentFeature__PortsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2884:1: ( ( rulePort ) )
            // InternalComponentModel.g:2885:2: ( rulePort )
            {
            // InternalComponentModel.g:2885:2: ( rulePort )
            // InternalComponentModel.g:2886:3: rulePort
            {
             before(grammarAccess.getComponentFeatureAccess().getPortsPortParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentFeatureAccess().getPortsPortParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentFeature__PortsAssignment"


    // $ANTLR start "rule__InPort__NameAssignment_1"
    // InternalComponentModel.g:2895:1: rule__InPort__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__InPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2899:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2900:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2900:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2901:3: ruleQualifiedName
            {
             before(grammarAccess.getInPortAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInPortAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__NameAssignment_1"


    // $ANTLR start "rule__InPort__SuperTypeAssignment_3"
    // InternalComponentModel.g:2910:1: rule__InPort__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InPort__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2914:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2915:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2915:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2916:3: ( RULE_ID )
            {
             before(grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_3_0()); 
            // InternalComponentModel.g:2917:3: ( RULE_ID )
            // InternalComponentModel.g:2918:4: RULE_ID
            {
             before(grammarAccess.getInPortAccess().getSuperTypePortTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getSuperTypePortTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InPort__SuperTypeAssignment_3"


    // $ANTLR start "rule__OutPort__NameAssignment_1"
    // InternalComponentModel.g:2929:1: rule__OutPort__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__OutPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2933:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2934:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2934:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2935:3: ruleQualifiedName
            {
             before(grammarAccess.getOutPortAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOutPortAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__NameAssignment_1"


    // $ANTLR start "rule__OutPort__SuperTypeAssignment_3"
    // InternalComponentModel.g:2944:1: rule__OutPort__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__OutPort__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2948:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2949:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2949:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2950:3: ( RULE_ID )
            {
             before(grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_3_0()); 
            // InternalComponentModel.g:2951:3: ( RULE_ID )
            // InternalComponentModel.g:2952:4: RULE_ID
            {
             before(grammarAccess.getOutPortAccess().getSuperTypePortTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getSuperTypePortTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutPort__SuperTypeAssignment_3"


    // $ANTLR start "rule__PortType__NameAssignment_1"
    // InternalComponentModel.g:2963:1: rule__PortType__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PortType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2967:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2968:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2968:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2969:3: ruleQualifiedName
            {
             before(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__NameAssignment_1"


    // $ANTLR start "rule__PortType__EModesAssignment_5"
    // InternalComponentModel.g:2978:1: rule__PortType__EModesAssignment_5 : ( ruleerrorModes ) ;
    public final void rule__PortType__EModesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2982:1: ( ( ruleerrorModes ) )
            // InternalComponentModel.g:2983:2: ( ruleerrorModes )
            {
            // InternalComponentModel.g:2983:2: ( ruleerrorModes )
            // InternalComponentModel.g:2984:3: ruleerrorModes
            {
             before(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleerrorModes();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__EModesAssignment_5"


    // $ANTLR start "rule__ErrorModes__NameAssignment_1"
    // InternalComponentModel.g:2993:1: rule__ErrorModes__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ErrorModes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2997:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2998:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2998:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2999:3: ruleQualifiedName
            {
             before(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorModes__NameAssignment_1"


    // $ANTLR start "rule__ComponentImpl__NameAssignment_1"
    // InternalComponentModel.g:3008:1: rule__ComponentImpl__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ComponentImpl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3012:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:3013:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:3013:2: ( ruleQualifiedName )
            // InternalComponentModel.g:3014:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__NameAssignment_1"


    // $ANTLR start "rule__ComponentImpl__SuperTypeAssignment_3"
    // InternalComponentModel.g:3023:1: rule__ComponentImpl__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentImpl__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3027:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:3028:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:3028:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:3029:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_3_0()); 
            // InternalComponentModel.g:3030:3: ( RULE_ID )
            // InternalComponentModel.g:3031:4: RULE_ID
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__SuperTypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000247C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000024780002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002840000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});

}