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

                if ( (LA1_0==11||LA1_0==15||LA1_0==26) ) {
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


    // $ANTLR start "entryRuleSystemConnDec"
    // InternalComponentModel.g:103:1: entryRuleSystemConnDec : ruleSystemConnDec EOF ;
    public final void entryRuleSystemConnDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:104:1: ( ruleSystemConnDec EOF )
            // InternalComponentModel.g:105:1: ruleSystemConnDec EOF
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
    // InternalComponentModel.g:112:1: ruleSystemConnDec : ( ( rule__SystemConnDec__Group__0 ) ) ;
    public final void ruleSystemConnDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:116:2: ( ( ( rule__SystemConnDec__Group__0 ) ) )
            // InternalComponentModel.g:117:2: ( ( rule__SystemConnDec__Group__0 ) )
            {
            // InternalComponentModel.g:117:2: ( ( rule__SystemConnDec__Group__0 ) )
            // InternalComponentModel.g:118:3: ( rule__SystemConnDec__Group__0 )
            {
             before(grammarAccess.getSystemConnDecAccess().getGroup()); 
            // InternalComponentModel.g:119:3: ( rule__SystemConnDec__Group__0 )
            // InternalComponentModel.g:119:4: rule__SystemConnDec__Group__0
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
    // InternalComponentModel.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalComponentModel.g:129:1: ( ruleQualifiedName EOF )
            // InternalComponentModel.g:130:1: ruleQualifiedName EOF
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
    // InternalComponentModel.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalComponentModel.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalComponentModel.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalComponentModel.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalComponentModel.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalComponentModel.g:144:4: rule__QualifiedName__Group__0
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
    // InternalComponentModel.g:153:1: entryRuleSystemDec : ruleSystemDec EOF ;
    public final void entryRuleSystemDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:154:1: ( ruleSystemDec EOF )
            // InternalComponentModel.g:155:1: ruleSystemDec EOF
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
    // InternalComponentModel.g:162:1: ruleSystemDec : ( ( rule__SystemDec__Group__0 ) ) ;
    public final void ruleSystemDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:166:2: ( ( ( rule__SystemDec__Group__0 ) ) )
            // InternalComponentModel.g:167:2: ( ( rule__SystemDec__Group__0 ) )
            {
            // InternalComponentModel.g:167:2: ( ( rule__SystemDec__Group__0 ) )
            // InternalComponentModel.g:168:3: ( rule__SystemDec__Group__0 )
            {
             before(grammarAccess.getSystemDecAccess().getGroup()); 
            // InternalComponentModel.g:169:3: ( rule__SystemDec__Group__0 )
            // InternalComponentModel.g:169:4: rule__SystemDec__Group__0
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
    // InternalComponentModel.g:178:1: entryRuleAbstractFeatures : ruleAbstractFeatures EOF ;
    public final void entryRuleAbstractFeatures() throws RecognitionException {
        try {
            // InternalComponentModel.g:179:1: ( ruleAbstractFeatures EOF )
            // InternalComponentModel.g:180:1: ruleAbstractFeatures EOF
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
    // InternalComponentModel.g:187:1: ruleAbstractFeatures : ( ( rule__AbstractFeatures__Alternatives ) ) ;
    public final void ruleAbstractFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:191:2: ( ( ( rule__AbstractFeatures__Alternatives ) ) )
            // InternalComponentModel.g:192:2: ( ( rule__AbstractFeatures__Alternatives ) )
            {
            // InternalComponentModel.g:192:2: ( ( rule__AbstractFeatures__Alternatives ) )
            // InternalComponentModel.g:193:3: ( rule__AbstractFeatures__Alternatives )
            {
             before(grammarAccess.getAbstractFeaturesAccess().getAlternatives()); 
            // InternalComponentModel.g:194:3: ( rule__AbstractFeatures__Alternatives )
            // InternalComponentModel.g:194:4: rule__AbstractFeatures__Alternatives
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
    // InternalComponentModel.g:203:1: entryRuleSystemPortDec : ruleSystemPortDec EOF ;
    public final void entryRuleSystemPortDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:204:1: ( ruleSystemPortDec EOF )
            // InternalComponentModel.g:205:1: ruleSystemPortDec EOF
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
    // InternalComponentModel.g:212:1: ruleSystemPortDec : ( ( rule__SystemPortDec__Alternatives ) ) ;
    public final void ruleSystemPortDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:216:2: ( ( ( rule__SystemPortDec__Alternatives ) ) )
            // InternalComponentModel.g:217:2: ( ( rule__SystemPortDec__Alternatives ) )
            {
            // InternalComponentModel.g:217:2: ( ( rule__SystemPortDec__Alternatives ) )
            // InternalComponentModel.g:218:3: ( rule__SystemPortDec__Alternatives )
            {
             before(grammarAccess.getSystemPortDecAccess().getAlternatives()); 
            // InternalComponentModel.g:219:3: ( rule__SystemPortDec__Alternatives )
            // InternalComponentModel.g:219:4: rule__SystemPortDec__Alternatives
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
    // InternalComponentModel.g:228:1: entryRuleSystemPortIn : ruleSystemPortIn EOF ;
    public final void entryRuleSystemPortIn() throws RecognitionException {
        try {
            // InternalComponentModel.g:229:1: ( ruleSystemPortIn EOF )
            // InternalComponentModel.g:230:1: ruleSystemPortIn EOF
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
    // InternalComponentModel.g:237:1: ruleSystemPortIn : ( ( rule__SystemPortIn__Group__0 ) ) ;
    public final void ruleSystemPortIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:241:2: ( ( ( rule__SystemPortIn__Group__0 ) ) )
            // InternalComponentModel.g:242:2: ( ( rule__SystemPortIn__Group__0 ) )
            {
            // InternalComponentModel.g:242:2: ( ( rule__SystemPortIn__Group__0 ) )
            // InternalComponentModel.g:243:3: ( rule__SystemPortIn__Group__0 )
            {
             before(grammarAccess.getSystemPortInAccess().getGroup()); 
            // InternalComponentModel.g:244:3: ( rule__SystemPortIn__Group__0 )
            // InternalComponentModel.g:244:4: rule__SystemPortIn__Group__0
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
    // InternalComponentModel.g:253:1: entryRuleSystemPortOut : ruleSystemPortOut EOF ;
    public final void entryRuleSystemPortOut() throws RecognitionException {
        try {
            // InternalComponentModel.g:254:1: ( ruleSystemPortOut EOF )
            // InternalComponentModel.g:255:1: ruleSystemPortOut EOF
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
    // InternalComponentModel.g:262:1: ruleSystemPortOut : ( ( rule__SystemPortOut__Group__0 ) ) ;
    public final void ruleSystemPortOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:266:2: ( ( ( rule__SystemPortOut__Group__0 ) ) )
            // InternalComponentModel.g:267:2: ( ( rule__SystemPortOut__Group__0 ) )
            {
            // InternalComponentModel.g:267:2: ( ( rule__SystemPortOut__Group__0 ) )
            // InternalComponentModel.g:268:3: ( rule__SystemPortOut__Group__0 )
            {
             before(grammarAccess.getSystemPortOutAccess().getGroup()); 
            // InternalComponentModel.g:269:3: ( rule__SystemPortOut__Group__0 )
            // InternalComponentModel.g:269:4: rule__SystemPortOut__Group__0
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
    // InternalComponentModel.g:278:1: entryRuleCompConnDec : ruleCompConnDec EOF ;
    public final void entryRuleCompConnDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:279:1: ( ruleCompConnDec EOF )
            // InternalComponentModel.g:280:1: ruleCompConnDec EOF
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
    // InternalComponentModel.g:287:1: ruleCompConnDec : ( ( rule__CompConnDec__Group__0 ) ) ;
    public final void ruleCompConnDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:291:2: ( ( ( rule__CompConnDec__Group__0 ) ) )
            // InternalComponentModel.g:292:2: ( ( rule__CompConnDec__Group__0 ) )
            {
            // InternalComponentModel.g:292:2: ( ( rule__CompConnDec__Group__0 ) )
            // InternalComponentModel.g:293:3: ( rule__CompConnDec__Group__0 )
            {
             before(grammarAccess.getCompConnDecAccess().getGroup()); 
            // InternalComponentModel.g:294:3: ( rule__CompConnDec__Group__0 )
            // InternalComponentModel.g:294:4: rule__CompConnDec__Group__0
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


    // $ANTLR start "entryRuleComponentImpl"
    // InternalComponentModel.g:303:1: entryRuleComponentImpl : ruleComponentImpl EOF ;
    public final void entryRuleComponentImpl() throws RecognitionException {
        try {
            // InternalComponentModel.g:304:1: ( ruleComponentImpl EOF )
            // InternalComponentModel.g:305:1: ruleComponentImpl EOF
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
    // InternalComponentModel.g:312:1: ruleComponentImpl : ( ( rule__ComponentImpl__Group__0 ) ) ;
    public final void ruleComponentImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:316:2: ( ( ( rule__ComponentImpl__Group__0 ) ) )
            // InternalComponentModel.g:317:2: ( ( rule__ComponentImpl__Group__0 ) )
            {
            // InternalComponentModel.g:317:2: ( ( rule__ComponentImpl__Group__0 ) )
            // InternalComponentModel.g:318:3: ( rule__ComponentImpl__Group__0 )
            {
             before(grammarAccess.getComponentImplAccess().getGroup()); 
            // InternalComponentModel.g:319:3: ( rule__ComponentImpl__Group__0 )
            // InternalComponentModel.g:319:4: rule__ComponentImpl__Group__0
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalComponentModel.g:502:1: rule__AbstractElement__Alternatives : ( ( ruleSystemDec ) | ( ruleSystemConnDec ) | ( rulePortType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:506:1: ( ( ruleSystemDec ) | ( ruleSystemConnDec ) | ( rulePortType ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 26:
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
                    // InternalComponentModel.g:507:2: ( ruleSystemDec )
                    {
                    // InternalComponentModel.g:507:2: ( ruleSystemDec )
                    // InternalComponentModel.g:508:3: ruleSystemDec
                    {
                     before(grammarAccess.getAbstractElementAccess().getSystemDecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSystemDecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:513:2: ( ruleSystemConnDec )
                    {
                    // InternalComponentModel.g:513:2: ( ruleSystemConnDec )
                    // InternalComponentModel.g:514:3: ruleSystemConnDec
                    {
                     before(grammarAccess.getAbstractElementAccess().getSystemConnDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemConnDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSystemConnDecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:519:2: ( rulePortType )
                    {
                    // InternalComponentModel.g:519:2: ( rulePortType )
                    // InternalComponentModel.g:520:3: rulePortType
                    {
                     before(grammarAccess.getAbstractElementAccess().getPortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePortType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPortTypeParserRuleCall_2()); 

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
    // InternalComponentModel.g:529:1: rule__AbstractFeatures__Alternatives : ( ( ruleComponentType ) | ( ruleComponentImpl ) | ( ruleCompConnDec ) | ( ruleSystemPortDec ) );
    public final void rule__AbstractFeatures__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:533:1: ( ( ruleComponentType ) | ( ruleComponentImpl ) | ( ruleCompConnDec ) | ( ruleSystemPortDec ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 18:
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalComponentModel.g:534:2: ( ruleComponentType )
                    {
                    // InternalComponentModel.g:534:2: ( ruleComponentType )
                    // InternalComponentModel.g:535:3: ruleComponentType
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
                    // InternalComponentModel.g:540:2: ( ruleComponentImpl )
                    {
                    // InternalComponentModel.g:540:2: ( ruleComponentImpl )
                    // InternalComponentModel.g:541:3: ruleComponentImpl
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getComponentImplParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentImpl();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getComponentImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:546:2: ( ruleCompConnDec )
                    {
                    // InternalComponentModel.g:546:2: ( ruleCompConnDec )
                    // InternalComponentModel.g:547:3: ruleCompConnDec
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getCompConnDecParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompConnDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getCompConnDecParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentModel.g:552:2: ( ruleSystemPortDec )
                    {
                    // InternalComponentModel.g:552:2: ( ruleSystemPortDec )
                    // InternalComponentModel.g:553:3: ruleSystemPortDec
                    {
                     before(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemPortDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractFeaturesAccess().getSystemPortDecParserRuleCall_3()); 

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
    // InternalComponentModel.g:562:1: rule__SystemPortDec__Alternatives : ( ( ruleSystemPortIn ) | ( ruleSystemPortOut ) );
    public final void rule__SystemPortDec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:566:1: ( ( ruleSystemPortIn ) | ( ruleSystemPortOut ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentModel.g:567:2: ( ruleSystemPortIn )
                    {
                    // InternalComponentModel.g:567:2: ( ruleSystemPortIn )
                    // InternalComponentModel.g:568:3: ruleSystemPortIn
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
                    // InternalComponentModel.g:573:2: ( ruleSystemPortOut )
                    {
                    // InternalComponentModel.g:573:2: ( ruleSystemPortOut )
                    // InternalComponentModel.g:574:3: ruleSystemPortOut
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
    // InternalComponentModel.g:583:1: rule__Port__Alternatives : ( ( ruleInPort ) | ( ruleOutPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:587:1: ( ( ruleInPort ) | ( ruleOutPort ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
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
                    // InternalComponentModel.g:588:2: ( ruleInPort )
                    {
                    // InternalComponentModel.g:588:2: ( ruleInPort )
                    // InternalComponentModel.g:589:3: ruleInPort
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
                    // InternalComponentModel.g:594:2: ( ruleOutPort )
                    {
                    // InternalComponentModel.g:594:2: ( ruleOutPort )
                    // InternalComponentModel.g:595:3: ruleOutPort
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


    // $ANTLR start "rule__SystemConnDec__Group__0"
    // InternalComponentModel.g:604:1: rule__SystemConnDec__Group__0 : rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1 ;
    public final void rule__SystemConnDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:608:1: ( rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1 )
            // InternalComponentModel.g:609:2: rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1
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
    // InternalComponentModel.g:616:1: rule__SystemConnDec__Group__0__Impl : ( 'system connection' ) ;
    public final void rule__SystemConnDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:620:1: ( ( 'system connection' ) )
            // InternalComponentModel.g:621:1: ( 'system connection' )
            {
            // InternalComponentModel.g:621:1: ( 'system connection' )
            // InternalComponentModel.g:622:2: 'system connection'
            {
             before(grammarAccess.getSystemConnDecAccess().getSystemConnectionKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalComponentModel.g:631:1: rule__SystemConnDec__Group__1 : rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2 ;
    public final void rule__SystemConnDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:635:1: ( rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2 )
            // InternalComponentModel.g:636:2: rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2
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
    // InternalComponentModel.g:643:1: rule__SystemConnDec__Group__1__Impl : ( ( rule__SystemConnDec__NameAssignment_1 ) ) ;
    public final void rule__SystemConnDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:647:1: ( ( ( rule__SystemConnDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:648:1: ( ( rule__SystemConnDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:648:1: ( ( rule__SystemConnDec__NameAssignment_1 ) )
            // InternalComponentModel.g:649:2: ( rule__SystemConnDec__NameAssignment_1 )
            {
             before(grammarAccess.getSystemConnDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:650:2: ( rule__SystemConnDec__NameAssignment_1 )
            // InternalComponentModel.g:650:3: rule__SystemConnDec__NameAssignment_1
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
    // InternalComponentModel.g:658:1: rule__SystemConnDec__Group__2 : rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3 ;
    public final void rule__SystemConnDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:662:1: ( rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3 )
            // InternalComponentModel.g:663:2: rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3
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
    // InternalComponentModel.g:670:1: rule__SystemConnDec__Group__2__Impl : ( 'from' ) ;
    public final void rule__SystemConnDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:674:1: ( ( 'from' ) )
            // InternalComponentModel.g:675:1: ( 'from' )
            {
            // InternalComponentModel.g:675:1: ( 'from' )
            // InternalComponentModel.g:676:2: 'from'
            {
             before(grammarAccess.getSystemConnDecAccess().getFromKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentModel.g:685:1: rule__SystemConnDec__Group__3 : rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4 ;
    public final void rule__SystemConnDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:689:1: ( rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4 )
            // InternalComponentModel.g:690:2: rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4
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
    // InternalComponentModel.g:697:1: rule__SystemConnDec__Group__3__Impl : ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) ) ;
    public final void rule__SystemConnDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:701:1: ( ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) ) )
            // InternalComponentModel.g:702:1: ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) )
            {
            // InternalComponentModel.g:702:1: ( ( rule__SystemConnDec__SourceSystemAssignment_3 ) )
            // InternalComponentModel.g:703:2: ( rule__SystemConnDec__SourceSystemAssignment_3 )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemAssignment_3()); 
            // InternalComponentModel.g:704:2: ( rule__SystemConnDec__SourceSystemAssignment_3 )
            // InternalComponentModel.g:704:3: rule__SystemConnDec__SourceSystemAssignment_3
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
    // InternalComponentModel.g:712:1: rule__SystemConnDec__Group__4 : rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5 ;
    public final void rule__SystemConnDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:716:1: ( rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5 )
            // InternalComponentModel.g:717:2: rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5
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
    // InternalComponentModel.g:724:1: rule__SystemConnDec__Group__4__Impl : ( '.' ) ;
    public final void rule__SystemConnDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:728:1: ( ( '.' ) )
            // InternalComponentModel.g:729:1: ( '.' )
            {
            // InternalComponentModel.g:729:1: ( '.' )
            // InternalComponentModel.g:730:2: '.'
            {
             before(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:739:1: rule__SystemConnDec__Group__5 : rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6 ;
    public final void rule__SystemConnDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:743:1: ( rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6 )
            // InternalComponentModel.g:744:2: rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6
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
    // InternalComponentModel.g:751:1: rule__SystemConnDec__Group__5__Impl : ( ( rule__SystemConnDec__SourcePortAssignment_5 ) ) ;
    public final void rule__SystemConnDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:755:1: ( ( ( rule__SystemConnDec__SourcePortAssignment_5 ) ) )
            // InternalComponentModel.g:756:1: ( ( rule__SystemConnDec__SourcePortAssignment_5 ) )
            {
            // InternalComponentModel.g:756:1: ( ( rule__SystemConnDec__SourcePortAssignment_5 ) )
            // InternalComponentModel.g:757:2: ( rule__SystemConnDec__SourcePortAssignment_5 )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortAssignment_5()); 
            // InternalComponentModel.g:758:2: ( rule__SystemConnDec__SourcePortAssignment_5 )
            // InternalComponentModel.g:758:3: rule__SystemConnDec__SourcePortAssignment_5
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
    // InternalComponentModel.g:766:1: rule__SystemConnDec__Group__6 : rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7 ;
    public final void rule__SystemConnDec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:770:1: ( rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7 )
            // InternalComponentModel.g:771:2: rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7
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
    // InternalComponentModel.g:778:1: rule__SystemConnDec__Group__6__Impl : ( 'to' ) ;
    public final void rule__SystemConnDec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:782:1: ( ( 'to' ) )
            // InternalComponentModel.g:783:1: ( 'to' )
            {
            // InternalComponentModel.g:783:1: ( 'to' )
            // InternalComponentModel.g:784:2: 'to'
            {
             before(grammarAccess.getSystemConnDecAccess().getToKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentModel.g:793:1: rule__SystemConnDec__Group__7 : rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8 ;
    public final void rule__SystemConnDec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:797:1: ( rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8 )
            // InternalComponentModel.g:798:2: rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8
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
    // InternalComponentModel.g:805:1: rule__SystemConnDec__Group__7__Impl : ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) ) ;
    public final void rule__SystemConnDec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:809:1: ( ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) ) )
            // InternalComponentModel.g:810:1: ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) )
            {
            // InternalComponentModel.g:810:1: ( ( rule__SystemConnDec__TargetSystemAssignment_7 ) )
            // InternalComponentModel.g:811:2: ( rule__SystemConnDec__TargetSystemAssignment_7 )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemAssignment_7()); 
            // InternalComponentModel.g:812:2: ( rule__SystemConnDec__TargetSystemAssignment_7 )
            // InternalComponentModel.g:812:3: rule__SystemConnDec__TargetSystemAssignment_7
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
    // InternalComponentModel.g:820:1: rule__SystemConnDec__Group__8 : rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9 ;
    public final void rule__SystemConnDec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:824:1: ( rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9 )
            // InternalComponentModel.g:825:2: rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9
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
    // InternalComponentModel.g:832:1: rule__SystemConnDec__Group__8__Impl : ( '.' ) ;
    public final void rule__SystemConnDec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:836:1: ( ( '.' ) )
            // InternalComponentModel.g:837:1: ( '.' )
            {
            // InternalComponentModel.g:837:1: ( '.' )
            // InternalComponentModel.g:838:2: '.'
            {
             before(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_8()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:847:1: rule__SystemConnDec__Group__9 : rule__SystemConnDec__Group__9__Impl ;
    public final void rule__SystemConnDec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:851:1: ( rule__SystemConnDec__Group__9__Impl )
            // InternalComponentModel.g:852:2: rule__SystemConnDec__Group__9__Impl
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
    // InternalComponentModel.g:858:1: rule__SystemConnDec__Group__9__Impl : ( ( rule__SystemConnDec__TargetPortAssignment_9 ) ) ;
    public final void rule__SystemConnDec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:862:1: ( ( ( rule__SystemConnDec__TargetPortAssignment_9 ) ) )
            // InternalComponentModel.g:863:1: ( ( rule__SystemConnDec__TargetPortAssignment_9 ) )
            {
            // InternalComponentModel.g:863:1: ( ( rule__SystemConnDec__TargetPortAssignment_9 ) )
            // InternalComponentModel.g:864:2: ( rule__SystemConnDec__TargetPortAssignment_9 )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortAssignment_9()); 
            // InternalComponentModel.g:865:2: ( rule__SystemConnDec__TargetPortAssignment_9 )
            // InternalComponentModel.g:865:3: rule__SystemConnDec__TargetPortAssignment_9
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
    // InternalComponentModel.g:874:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:878:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalComponentModel.g:879:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalComponentModel.g:886:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:890:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:891:1: ( RULE_ID )
            {
            // InternalComponentModel.g:891:1: ( RULE_ID )
            // InternalComponentModel.g:892:2: RULE_ID
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
    // InternalComponentModel.g:901:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:905:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalComponentModel.g:906:2: rule__QualifiedName__Group__1__Impl
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
    // InternalComponentModel.g:912:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:916:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalComponentModel.g:917:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalComponentModel.g:917:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalComponentModel.g:918:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalComponentModel.g:919:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentModel.g:919:3: rule__QualifiedName__Group_1__0
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
    // InternalComponentModel.g:928:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:932:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalComponentModel.g:933:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalComponentModel.g:940:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:944:1: ( ( '.' ) )
            // InternalComponentModel.g:945:1: ( '.' )
            {
            // InternalComponentModel.g:945:1: ( '.' )
            // InternalComponentModel.g:946:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:955:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:959:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalComponentModel.g:960:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalComponentModel.g:966:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:970:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:971:1: ( RULE_ID )
            {
            // InternalComponentModel.g:971:1: ( RULE_ID )
            // InternalComponentModel.g:972:2: RULE_ID
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
    // InternalComponentModel.g:982:1: rule__SystemDec__Group__0 : rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1 ;
    public final void rule__SystemDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:986:1: ( rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1 )
            // InternalComponentModel.g:987:2: rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1
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
    // InternalComponentModel.g:994:1: rule__SystemDec__Group__0__Impl : ( 'system declaration' ) ;
    public final void rule__SystemDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:998:1: ( ( 'system declaration' ) )
            // InternalComponentModel.g:999:1: ( 'system declaration' )
            {
            // InternalComponentModel.g:999:1: ( 'system declaration' )
            // InternalComponentModel.g:1000:2: 'system declaration'
            {
             before(grammarAccess.getSystemDecAccess().getSystemDeclarationKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentModel.g:1009:1: rule__SystemDec__Group__1 : rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2 ;
    public final void rule__SystemDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1013:1: ( rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2 )
            // InternalComponentModel.g:1014:2: rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2
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
    // InternalComponentModel.g:1021:1: rule__SystemDec__Group__1__Impl : ( ( rule__SystemDec__NameAssignment_1 ) ) ;
    public final void rule__SystemDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1025:1: ( ( ( rule__SystemDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1026:1: ( ( rule__SystemDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1026:1: ( ( rule__SystemDec__NameAssignment_1 ) )
            // InternalComponentModel.g:1027:2: ( rule__SystemDec__NameAssignment_1 )
            {
             before(grammarAccess.getSystemDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1028:2: ( rule__SystemDec__NameAssignment_1 )
            // InternalComponentModel.g:1028:3: rule__SystemDec__NameAssignment_1
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
    // InternalComponentModel.g:1036:1: rule__SystemDec__Group__2 : rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3 ;
    public final void rule__SystemDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1040:1: ( rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3 )
            // InternalComponentModel.g:1041:2: rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3
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
    // InternalComponentModel.g:1048:1: rule__SystemDec__Group__2__Impl : ( '{' ) ;
    public final void rule__SystemDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1052:1: ( ( '{' ) )
            // InternalComponentModel.g:1053:1: ( '{' )
            {
            // InternalComponentModel.g:1053:1: ( '{' )
            // InternalComponentModel.g:1054:2: '{'
            {
             before(grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentModel.g:1063:1: rule__SystemDec__Group__3 : rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4 ;
    public final void rule__SystemDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1067:1: ( rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4 )
            // InternalComponentModel.g:1068:2: rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4
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
    // InternalComponentModel.g:1075:1: rule__SystemDec__Group__3__Impl : ( ( rule__SystemDec__SysFeaturesAssignment_3 )* ) ;
    public final void rule__SystemDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1079:1: ( ( ( rule__SystemDec__SysFeaturesAssignment_3 )* ) )
            // InternalComponentModel.g:1080:1: ( ( rule__SystemDec__SysFeaturesAssignment_3 )* )
            {
            // InternalComponentModel.g:1080:1: ( ( rule__SystemDec__SysFeaturesAssignment_3 )* )
            // InternalComponentModel.g:1081:2: ( rule__SystemDec__SysFeaturesAssignment_3 )*
            {
             before(grammarAccess.getSystemDecAccess().getSysFeaturesAssignment_3()); 
            // InternalComponentModel.g:1082:2: ( rule__SystemDec__SysFeaturesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=21)||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentModel.g:1082:3: rule__SystemDec__SysFeaturesAssignment_3
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
    // InternalComponentModel.g:1090:1: rule__SystemDec__Group__4 : rule__SystemDec__Group__4__Impl ;
    public final void rule__SystemDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1094:1: ( rule__SystemDec__Group__4__Impl )
            // InternalComponentModel.g:1095:2: rule__SystemDec__Group__4__Impl
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
    // InternalComponentModel.g:1101:1: rule__SystemDec__Group__4__Impl : ( '}' ) ;
    public final void rule__SystemDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1105:1: ( ( '}' ) )
            // InternalComponentModel.g:1106:1: ( '}' )
            {
            // InternalComponentModel.g:1106:1: ( '}' )
            // InternalComponentModel.g:1107:2: '}'
            {
             before(grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentModel.g:1117:1: rule__SystemPortIn__Group__0 : rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1 ;
    public final void rule__SystemPortIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1121:1: ( rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1 )
            // InternalComponentModel.g:1122:2: rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1
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
    // InternalComponentModel.g:1129:1: rule__SystemPortIn__Group__0__Impl : ( 'system port in' ) ;
    public final void rule__SystemPortIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1133:1: ( ( 'system port in' ) )
            // InternalComponentModel.g:1134:1: ( 'system port in' )
            {
            // InternalComponentModel.g:1134:1: ( 'system port in' )
            // InternalComponentModel.g:1135:2: 'system port in'
            {
             before(grammarAccess.getSystemPortInAccess().getSystemPortInKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalComponentModel.g:1144:1: rule__SystemPortIn__Group__1 : rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2 ;
    public final void rule__SystemPortIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1148:1: ( rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2 )
            // InternalComponentModel.g:1149:2: rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2
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
    // InternalComponentModel.g:1156:1: rule__SystemPortIn__Group__1__Impl : ( ( rule__SystemPortIn__NameAssignment_1 ) ) ;
    public final void rule__SystemPortIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1160:1: ( ( ( rule__SystemPortIn__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1161:1: ( ( rule__SystemPortIn__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1161:1: ( ( rule__SystemPortIn__NameAssignment_1 ) )
            // InternalComponentModel.g:1162:2: ( rule__SystemPortIn__NameAssignment_1 )
            {
             before(grammarAccess.getSystemPortInAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1163:2: ( rule__SystemPortIn__NameAssignment_1 )
            // InternalComponentModel.g:1163:3: rule__SystemPortIn__NameAssignment_1
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
    // InternalComponentModel.g:1171:1: rule__SystemPortIn__Group__2 : rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3 ;
    public final void rule__SystemPortIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1175:1: ( rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3 )
            // InternalComponentModel.g:1176:2: rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3
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
    // InternalComponentModel.g:1183:1: rule__SystemPortIn__Group__2__Impl : ( 'to' ) ;
    public final void rule__SystemPortIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1187:1: ( ( 'to' ) )
            // InternalComponentModel.g:1188:1: ( 'to' )
            {
            // InternalComponentModel.g:1188:1: ( 'to' )
            // InternalComponentModel.g:1189:2: 'to'
            {
             before(grammarAccess.getSystemPortInAccess().getToKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentModel.g:1198:1: rule__SystemPortIn__Group__3 : rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4 ;
    public final void rule__SystemPortIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1202:1: ( rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4 )
            // InternalComponentModel.g:1203:2: rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4
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
    // InternalComponentModel.g:1210:1: rule__SystemPortIn__Group__3__Impl : ( ( rule__SystemPortIn__InCompAssignment_3 ) ) ;
    public final void rule__SystemPortIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1214:1: ( ( ( rule__SystemPortIn__InCompAssignment_3 ) ) )
            // InternalComponentModel.g:1215:1: ( ( rule__SystemPortIn__InCompAssignment_3 ) )
            {
            // InternalComponentModel.g:1215:1: ( ( rule__SystemPortIn__InCompAssignment_3 ) )
            // InternalComponentModel.g:1216:2: ( rule__SystemPortIn__InCompAssignment_3 )
            {
             before(grammarAccess.getSystemPortInAccess().getInCompAssignment_3()); 
            // InternalComponentModel.g:1217:2: ( rule__SystemPortIn__InCompAssignment_3 )
            // InternalComponentModel.g:1217:3: rule__SystemPortIn__InCompAssignment_3
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
    // InternalComponentModel.g:1225:1: rule__SystemPortIn__Group__4 : rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5 ;
    public final void rule__SystemPortIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1229:1: ( rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5 )
            // InternalComponentModel.g:1230:2: rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5
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
    // InternalComponentModel.g:1237:1: rule__SystemPortIn__Group__4__Impl : ( '.' ) ;
    public final void rule__SystemPortIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1241:1: ( ( '.' ) )
            // InternalComponentModel.g:1242:1: ( '.' )
            {
            // InternalComponentModel.g:1242:1: ( '.' )
            // InternalComponentModel.g:1243:2: '.'
            {
             before(grammarAccess.getSystemPortInAccess().getFullStopKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:1252:1: rule__SystemPortIn__Group__5 : rule__SystemPortIn__Group__5__Impl ;
    public final void rule__SystemPortIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1256:1: ( rule__SystemPortIn__Group__5__Impl )
            // InternalComponentModel.g:1257:2: rule__SystemPortIn__Group__5__Impl
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
    // InternalComponentModel.g:1263:1: rule__SystemPortIn__Group__5__Impl : ( ( rule__SystemPortIn__InPortAssignment_5 ) ) ;
    public final void rule__SystemPortIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1267:1: ( ( ( rule__SystemPortIn__InPortAssignment_5 ) ) )
            // InternalComponentModel.g:1268:1: ( ( rule__SystemPortIn__InPortAssignment_5 ) )
            {
            // InternalComponentModel.g:1268:1: ( ( rule__SystemPortIn__InPortAssignment_5 ) )
            // InternalComponentModel.g:1269:2: ( rule__SystemPortIn__InPortAssignment_5 )
            {
             before(grammarAccess.getSystemPortInAccess().getInPortAssignment_5()); 
            // InternalComponentModel.g:1270:2: ( rule__SystemPortIn__InPortAssignment_5 )
            // InternalComponentModel.g:1270:3: rule__SystemPortIn__InPortAssignment_5
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
    // InternalComponentModel.g:1279:1: rule__SystemPortOut__Group__0 : rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1 ;
    public final void rule__SystemPortOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1283:1: ( rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1 )
            // InternalComponentModel.g:1284:2: rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1
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
    // InternalComponentModel.g:1291:1: rule__SystemPortOut__Group__0__Impl : ( 'system port out' ) ;
    public final void rule__SystemPortOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1295:1: ( ( 'system port out' ) )
            // InternalComponentModel.g:1296:1: ( 'system port out' )
            {
            // InternalComponentModel.g:1296:1: ( 'system port out' )
            // InternalComponentModel.g:1297:2: 'system port out'
            {
             before(grammarAccess.getSystemPortOutAccess().getSystemPortOutKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalComponentModel.g:1306:1: rule__SystemPortOut__Group__1 : rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2 ;
    public final void rule__SystemPortOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1310:1: ( rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2 )
            // InternalComponentModel.g:1311:2: rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2
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
    // InternalComponentModel.g:1318:1: rule__SystemPortOut__Group__1__Impl : ( ( rule__SystemPortOut__NameAssignment_1 ) ) ;
    public final void rule__SystemPortOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1322:1: ( ( ( rule__SystemPortOut__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1323:1: ( ( rule__SystemPortOut__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1323:1: ( ( rule__SystemPortOut__NameAssignment_1 ) )
            // InternalComponentModel.g:1324:2: ( rule__SystemPortOut__NameAssignment_1 )
            {
             before(grammarAccess.getSystemPortOutAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1325:2: ( rule__SystemPortOut__NameAssignment_1 )
            // InternalComponentModel.g:1325:3: rule__SystemPortOut__NameAssignment_1
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
    // InternalComponentModel.g:1333:1: rule__SystemPortOut__Group__2 : rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3 ;
    public final void rule__SystemPortOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1337:1: ( rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3 )
            // InternalComponentModel.g:1338:2: rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3
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
    // InternalComponentModel.g:1345:1: rule__SystemPortOut__Group__2__Impl : ( 'from' ) ;
    public final void rule__SystemPortOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1349:1: ( ( 'from' ) )
            // InternalComponentModel.g:1350:1: ( 'from' )
            {
            // InternalComponentModel.g:1350:1: ( 'from' )
            // InternalComponentModel.g:1351:2: 'from'
            {
             before(grammarAccess.getSystemPortOutAccess().getFromKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentModel.g:1360:1: rule__SystemPortOut__Group__3 : rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4 ;
    public final void rule__SystemPortOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1364:1: ( rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4 )
            // InternalComponentModel.g:1365:2: rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4
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
    // InternalComponentModel.g:1372:1: rule__SystemPortOut__Group__3__Impl : ( ( rule__SystemPortOut__OutCompAssignment_3 ) ) ;
    public final void rule__SystemPortOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1376:1: ( ( ( rule__SystemPortOut__OutCompAssignment_3 ) ) )
            // InternalComponentModel.g:1377:1: ( ( rule__SystemPortOut__OutCompAssignment_3 ) )
            {
            // InternalComponentModel.g:1377:1: ( ( rule__SystemPortOut__OutCompAssignment_3 ) )
            // InternalComponentModel.g:1378:2: ( rule__SystemPortOut__OutCompAssignment_3 )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompAssignment_3()); 
            // InternalComponentModel.g:1379:2: ( rule__SystemPortOut__OutCompAssignment_3 )
            // InternalComponentModel.g:1379:3: rule__SystemPortOut__OutCompAssignment_3
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
    // InternalComponentModel.g:1387:1: rule__SystemPortOut__Group__4 : rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5 ;
    public final void rule__SystemPortOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1391:1: ( rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5 )
            // InternalComponentModel.g:1392:2: rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5
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
    // InternalComponentModel.g:1399:1: rule__SystemPortOut__Group__4__Impl : ( '.' ) ;
    public final void rule__SystemPortOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1403:1: ( ( '.' ) )
            // InternalComponentModel.g:1404:1: ( '.' )
            {
            // InternalComponentModel.g:1404:1: ( '.' )
            // InternalComponentModel.g:1405:2: '.'
            {
             before(grammarAccess.getSystemPortOutAccess().getFullStopKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:1414:1: rule__SystemPortOut__Group__5 : rule__SystemPortOut__Group__5__Impl ;
    public final void rule__SystemPortOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1418:1: ( rule__SystemPortOut__Group__5__Impl )
            // InternalComponentModel.g:1419:2: rule__SystemPortOut__Group__5__Impl
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
    // InternalComponentModel.g:1425:1: rule__SystemPortOut__Group__5__Impl : ( ( rule__SystemPortOut__OutPortAssignment_5 ) ) ;
    public final void rule__SystemPortOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1429:1: ( ( ( rule__SystemPortOut__OutPortAssignment_5 ) ) )
            // InternalComponentModel.g:1430:1: ( ( rule__SystemPortOut__OutPortAssignment_5 ) )
            {
            // InternalComponentModel.g:1430:1: ( ( rule__SystemPortOut__OutPortAssignment_5 ) )
            // InternalComponentModel.g:1431:2: ( rule__SystemPortOut__OutPortAssignment_5 )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortAssignment_5()); 
            // InternalComponentModel.g:1432:2: ( rule__SystemPortOut__OutPortAssignment_5 )
            // InternalComponentModel.g:1432:3: rule__SystemPortOut__OutPortAssignment_5
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
    // InternalComponentModel.g:1441:1: rule__CompConnDec__Group__0 : rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1 ;
    public final void rule__CompConnDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1445:1: ( rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1 )
            // InternalComponentModel.g:1446:2: rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1
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
    // InternalComponentModel.g:1453:1: rule__CompConnDec__Group__0__Impl : ( 'connection' ) ;
    public final void rule__CompConnDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1457:1: ( ( 'connection' ) )
            // InternalComponentModel.g:1458:1: ( 'connection' )
            {
            // InternalComponentModel.g:1458:1: ( 'connection' )
            // InternalComponentModel.g:1459:2: 'connection'
            {
             before(grammarAccess.getCompConnDecAccess().getConnectionKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalComponentModel.g:1468:1: rule__CompConnDec__Group__1 : rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2 ;
    public final void rule__CompConnDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1472:1: ( rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2 )
            // InternalComponentModel.g:1473:2: rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2
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
    // InternalComponentModel.g:1480:1: rule__CompConnDec__Group__1__Impl : ( ( rule__CompConnDec__NameAssignment_1 ) ) ;
    public final void rule__CompConnDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1484:1: ( ( ( rule__CompConnDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1485:1: ( ( rule__CompConnDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1485:1: ( ( rule__CompConnDec__NameAssignment_1 ) )
            // InternalComponentModel.g:1486:2: ( rule__CompConnDec__NameAssignment_1 )
            {
             before(grammarAccess.getCompConnDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1487:2: ( rule__CompConnDec__NameAssignment_1 )
            // InternalComponentModel.g:1487:3: rule__CompConnDec__NameAssignment_1
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
    // InternalComponentModel.g:1495:1: rule__CompConnDec__Group__2 : rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3 ;
    public final void rule__CompConnDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1499:1: ( rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3 )
            // InternalComponentModel.g:1500:2: rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3
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
    // InternalComponentModel.g:1507:1: rule__CompConnDec__Group__2__Impl : ( 'from' ) ;
    public final void rule__CompConnDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1511:1: ( ( 'from' ) )
            // InternalComponentModel.g:1512:1: ( 'from' )
            {
            // InternalComponentModel.g:1512:1: ( 'from' )
            // InternalComponentModel.g:1513:2: 'from'
            {
             before(grammarAccess.getCompConnDecAccess().getFromKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalComponentModel.g:1522:1: rule__CompConnDec__Group__3 : rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4 ;
    public final void rule__CompConnDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1526:1: ( rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4 )
            // InternalComponentModel.g:1527:2: rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4
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
    // InternalComponentModel.g:1534:1: rule__CompConnDec__Group__3__Impl : ( ( rule__CompConnDec__SourceCompAssignment_3 ) ) ;
    public final void rule__CompConnDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1538:1: ( ( ( rule__CompConnDec__SourceCompAssignment_3 ) ) )
            // InternalComponentModel.g:1539:1: ( ( rule__CompConnDec__SourceCompAssignment_3 ) )
            {
            // InternalComponentModel.g:1539:1: ( ( rule__CompConnDec__SourceCompAssignment_3 ) )
            // InternalComponentModel.g:1540:2: ( rule__CompConnDec__SourceCompAssignment_3 )
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompAssignment_3()); 
            // InternalComponentModel.g:1541:2: ( rule__CompConnDec__SourceCompAssignment_3 )
            // InternalComponentModel.g:1541:3: rule__CompConnDec__SourceCompAssignment_3
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
    // InternalComponentModel.g:1549:1: rule__CompConnDec__Group__4 : rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5 ;
    public final void rule__CompConnDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1553:1: ( rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5 )
            // InternalComponentModel.g:1554:2: rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5
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
    // InternalComponentModel.g:1561:1: rule__CompConnDec__Group__4__Impl : ( '.' ) ;
    public final void rule__CompConnDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1565:1: ( ( '.' ) )
            // InternalComponentModel.g:1566:1: ( '.' )
            {
            // InternalComponentModel.g:1566:1: ( '.' )
            // InternalComponentModel.g:1567:2: '.'
            {
             before(grammarAccess.getCompConnDecAccess().getFullStopKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:1576:1: rule__CompConnDec__Group__5 : rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6 ;
    public final void rule__CompConnDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1580:1: ( rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6 )
            // InternalComponentModel.g:1581:2: rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6
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
    // InternalComponentModel.g:1588:1: rule__CompConnDec__Group__5__Impl : ( ( rule__CompConnDec__SourcePortAssignment_5 ) ) ;
    public final void rule__CompConnDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1592:1: ( ( ( rule__CompConnDec__SourcePortAssignment_5 ) ) )
            // InternalComponentModel.g:1593:1: ( ( rule__CompConnDec__SourcePortAssignment_5 ) )
            {
            // InternalComponentModel.g:1593:1: ( ( rule__CompConnDec__SourcePortAssignment_5 ) )
            // InternalComponentModel.g:1594:2: ( rule__CompConnDec__SourcePortAssignment_5 )
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortAssignment_5()); 
            // InternalComponentModel.g:1595:2: ( rule__CompConnDec__SourcePortAssignment_5 )
            // InternalComponentModel.g:1595:3: rule__CompConnDec__SourcePortAssignment_5
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
    // InternalComponentModel.g:1603:1: rule__CompConnDec__Group__6 : rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7 ;
    public final void rule__CompConnDec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1607:1: ( rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7 )
            // InternalComponentModel.g:1608:2: rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7
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
    // InternalComponentModel.g:1615:1: rule__CompConnDec__Group__6__Impl : ( 'to' ) ;
    public final void rule__CompConnDec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1619:1: ( ( 'to' ) )
            // InternalComponentModel.g:1620:1: ( 'to' )
            {
            // InternalComponentModel.g:1620:1: ( 'to' )
            // InternalComponentModel.g:1621:2: 'to'
            {
             before(grammarAccess.getCompConnDecAccess().getToKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentModel.g:1630:1: rule__CompConnDec__Group__7 : rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8 ;
    public final void rule__CompConnDec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1634:1: ( rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8 )
            // InternalComponentModel.g:1635:2: rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8
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
    // InternalComponentModel.g:1642:1: rule__CompConnDec__Group__7__Impl : ( ( rule__CompConnDec__TargetCompAssignment_7 ) ) ;
    public final void rule__CompConnDec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1646:1: ( ( ( rule__CompConnDec__TargetCompAssignment_7 ) ) )
            // InternalComponentModel.g:1647:1: ( ( rule__CompConnDec__TargetCompAssignment_7 ) )
            {
            // InternalComponentModel.g:1647:1: ( ( rule__CompConnDec__TargetCompAssignment_7 ) )
            // InternalComponentModel.g:1648:2: ( rule__CompConnDec__TargetCompAssignment_7 )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompAssignment_7()); 
            // InternalComponentModel.g:1649:2: ( rule__CompConnDec__TargetCompAssignment_7 )
            // InternalComponentModel.g:1649:3: rule__CompConnDec__TargetCompAssignment_7
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
    // InternalComponentModel.g:1657:1: rule__CompConnDec__Group__8 : rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9 ;
    public final void rule__CompConnDec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1661:1: ( rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9 )
            // InternalComponentModel.g:1662:2: rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9
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
    // InternalComponentModel.g:1669:1: rule__CompConnDec__Group__8__Impl : ( '.' ) ;
    public final void rule__CompConnDec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1673:1: ( ( '.' ) )
            // InternalComponentModel.g:1674:1: ( '.' )
            {
            // InternalComponentModel.g:1674:1: ( '.' )
            // InternalComponentModel.g:1675:2: '.'
            {
             before(grammarAccess.getCompConnDecAccess().getFullStopKeyword_8()); 
            match(input,13,FOLLOW_2); 
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
    // InternalComponentModel.g:1684:1: rule__CompConnDec__Group__9 : rule__CompConnDec__Group__9__Impl ;
    public final void rule__CompConnDec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1688:1: ( rule__CompConnDec__Group__9__Impl )
            // InternalComponentModel.g:1689:2: rule__CompConnDec__Group__9__Impl
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
    // InternalComponentModel.g:1695:1: rule__CompConnDec__Group__9__Impl : ( ( rule__CompConnDec__TargetPortAssignment_9 ) ) ;
    public final void rule__CompConnDec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1699:1: ( ( ( rule__CompConnDec__TargetPortAssignment_9 ) ) )
            // InternalComponentModel.g:1700:1: ( ( rule__CompConnDec__TargetPortAssignment_9 ) )
            {
            // InternalComponentModel.g:1700:1: ( ( rule__CompConnDec__TargetPortAssignment_9 ) )
            // InternalComponentModel.g:1701:2: ( rule__CompConnDec__TargetPortAssignment_9 )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortAssignment_9()); 
            // InternalComponentModel.g:1702:2: ( rule__CompConnDec__TargetPortAssignment_9 )
            // InternalComponentModel.g:1702:3: rule__CompConnDec__TargetPortAssignment_9
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


    // $ANTLR start "rule__ComponentImpl__Group__0"
    // InternalComponentModel.g:1711:1: rule__ComponentImpl__Group__0 : rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 ;
    public final void rule__ComponentImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1715:1: ( rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 )
            // InternalComponentModel.g:1716:2: rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1
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
    // InternalComponentModel.g:1723:1: rule__ComponentImpl__Group__0__Impl : ( 'component implementation' ) ;
    public final void rule__ComponentImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1727:1: ( ( 'component implementation' ) )
            // InternalComponentModel.g:1728:1: ( 'component implementation' )
            {
            // InternalComponentModel.g:1728:1: ( 'component implementation' )
            // InternalComponentModel.g:1729:2: 'component implementation'
            {
             before(grammarAccess.getComponentImplAccess().getComponentImplementationKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentModel.g:1738:1: rule__ComponentImpl__Group__1 : rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 ;
    public final void rule__ComponentImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1742:1: ( rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 )
            // InternalComponentModel.g:1743:2: rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentModel.g:1750:1: rule__ComponentImpl__Group__1__Impl : ( ( rule__ComponentImpl__NameAssignment_1 ) ) ;
    public final void rule__ComponentImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1754:1: ( ( ( rule__ComponentImpl__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1755:1: ( ( rule__ComponentImpl__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1755:1: ( ( rule__ComponentImpl__NameAssignment_1 ) )
            // InternalComponentModel.g:1756:2: ( rule__ComponentImpl__NameAssignment_1 )
            {
             before(grammarAccess.getComponentImplAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1757:2: ( rule__ComponentImpl__NameAssignment_1 )
            // InternalComponentModel.g:1757:3: rule__ComponentImpl__NameAssignment_1
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
    // InternalComponentModel.g:1765:1: rule__ComponentImpl__Group__2 : rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 ;
    public final void rule__ComponentImpl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1769:1: ( rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 )
            // InternalComponentModel.g:1770:2: rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3
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
    // InternalComponentModel.g:1777:1: rule__ComponentImpl__Group__2__Impl : ( ':' ) ;
    public final void rule__ComponentImpl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1781:1: ( ( ':' ) )
            // InternalComponentModel.g:1782:1: ( ':' )
            {
            // InternalComponentModel.g:1782:1: ( ':' )
            // InternalComponentModel.g:1783:2: ':'
            {
             before(grammarAccess.getComponentImplAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentModel.g:1792:1: rule__ComponentImpl__Group__3 : rule__ComponentImpl__Group__3__Impl ;
    public final void rule__ComponentImpl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1796:1: ( rule__ComponentImpl__Group__3__Impl )
            // InternalComponentModel.g:1797:2: rule__ComponentImpl__Group__3__Impl
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
    // InternalComponentModel.g:1803:1: rule__ComponentImpl__Group__3__Impl : ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) ) ;
    public final void rule__ComponentImpl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1807:1: ( ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) ) )
            // InternalComponentModel.g:1808:1: ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) )
            {
            // InternalComponentModel.g:1808:1: ( ( rule__ComponentImpl__SuperTypeAssignment_3 ) )
            // InternalComponentModel.g:1809:2: ( rule__ComponentImpl__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeAssignment_3()); 
            // InternalComponentModel.g:1810:2: ( rule__ComponentImpl__SuperTypeAssignment_3 )
            // InternalComponentModel.g:1810:3: rule__ComponentImpl__SuperTypeAssignment_3
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


    // $ANTLR start "rule__ComponentType__Group__0"
    // InternalComponentModel.g:1819:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1823:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // InternalComponentModel.g:1824:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
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
    // InternalComponentModel.g:1831:1: rule__ComponentType__Group__0__Impl : ( 'component type' ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1835:1: ( ( 'component type' ) )
            // InternalComponentModel.g:1836:1: ( 'component type' )
            {
            // InternalComponentModel.g:1836:1: ( 'component type' )
            // InternalComponentModel.g:1837:2: 'component type'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentModel.g:1846:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1850:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // InternalComponentModel.g:1851:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
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
    // InternalComponentModel.g:1858:1: rule__ComponentType__Group__1__Impl : ( ( rule__ComponentType__NameAssignment_1 ) ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1862:1: ( ( ( rule__ComponentType__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1863:1: ( ( rule__ComponentType__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1863:1: ( ( rule__ComponentType__NameAssignment_1 ) )
            // InternalComponentModel.g:1864:2: ( rule__ComponentType__NameAssignment_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:1865:2: ( rule__ComponentType__NameAssignment_1 )
            // InternalComponentModel.g:1865:3: rule__ComponentType__NameAssignment_1
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
    // InternalComponentModel.g:1873:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1877:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // InternalComponentModel.g:1878:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentModel.g:1885:1: rule__ComponentType__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1889:1: ( ( '{' ) )
            // InternalComponentModel.g:1890:1: ( '{' )
            {
            // InternalComponentModel.g:1890:1: ( '{' )
            // InternalComponentModel.g:1891:2: '{'
            {
             before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentModel.g:1900:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1904:1: ( rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 )
            // InternalComponentModel.g:1905:2: rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentModel.g:1912:1: rule__ComponentType__Group__3__Impl : ( ( rule__ComponentType__CompFeaturesAssignment_3 )* ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1916:1: ( ( ( rule__ComponentType__CompFeaturesAssignment_3 )* ) )
            // InternalComponentModel.g:1917:1: ( ( rule__ComponentType__CompFeaturesAssignment_3 )* )
            {
            // InternalComponentModel.g:1917:1: ( ( rule__ComponentType__CompFeaturesAssignment_3 )* )
            // InternalComponentModel.g:1918:2: ( rule__ComponentType__CompFeaturesAssignment_3 )*
            {
             before(grammarAccess.getComponentTypeAccess().getCompFeaturesAssignment_3()); 
            // InternalComponentModel.g:1919:2: ( rule__ComponentType__CompFeaturesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentModel.g:1919:3: rule__ComponentType__CompFeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalComponentModel.g:1927:1: rule__ComponentType__Group__4 : rule__ComponentType__Group__4__Impl ;
    public final void rule__ComponentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1931:1: ( rule__ComponentType__Group__4__Impl )
            // InternalComponentModel.g:1932:2: rule__ComponentType__Group__4__Impl
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
    // InternalComponentModel.g:1938:1: rule__ComponentType__Group__4__Impl : ( '}' ) ;
    public final void rule__ComponentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1942:1: ( ( '}' ) )
            // InternalComponentModel.g:1943:1: ( '}' )
            {
            // InternalComponentModel.g:1943:1: ( '}' )
            // InternalComponentModel.g:1944:2: '}'
            {
             before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentModel.g:1954:1: rule__InPort__Group__0 : rule__InPort__Group__0__Impl rule__InPort__Group__1 ;
    public final void rule__InPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1958:1: ( rule__InPort__Group__0__Impl rule__InPort__Group__1 )
            // InternalComponentModel.g:1959:2: rule__InPort__Group__0__Impl rule__InPort__Group__1
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
    // InternalComponentModel.g:1966:1: rule__InPort__Group__0__Impl : ( 'port instance in' ) ;
    public final void rule__InPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1970:1: ( ( 'port instance in' ) )
            // InternalComponentModel.g:1971:1: ( 'port instance in' )
            {
            // InternalComponentModel.g:1971:1: ( 'port instance in' )
            // InternalComponentModel.g:1972:2: 'port instance in'
            {
             before(grammarAccess.getInPortAccess().getPortInstanceInKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentModel.g:1981:1: rule__InPort__Group__1 : rule__InPort__Group__1__Impl rule__InPort__Group__2 ;
    public final void rule__InPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1985:1: ( rule__InPort__Group__1__Impl rule__InPort__Group__2 )
            // InternalComponentModel.g:1986:2: rule__InPort__Group__1__Impl rule__InPort__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentModel.g:1993:1: rule__InPort__Group__1__Impl : ( ( rule__InPort__NameAssignment_1 ) ) ;
    public final void rule__InPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1997:1: ( ( ( rule__InPort__NameAssignment_1 ) ) )
            // InternalComponentModel.g:1998:1: ( ( rule__InPort__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:1998:1: ( ( rule__InPort__NameAssignment_1 ) )
            // InternalComponentModel.g:1999:2: ( rule__InPort__NameAssignment_1 )
            {
             before(grammarAccess.getInPortAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2000:2: ( rule__InPort__NameAssignment_1 )
            // InternalComponentModel.g:2000:3: rule__InPort__NameAssignment_1
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
    // InternalComponentModel.g:2008:1: rule__InPort__Group__2 : rule__InPort__Group__2__Impl rule__InPort__Group__3 ;
    public final void rule__InPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2012:1: ( rule__InPort__Group__2__Impl rule__InPort__Group__3 )
            // InternalComponentModel.g:2013:2: rule__InPort__Group__2__Impl rule__InPort__Group__3
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
    // InternalComponentModel.g:2020:1: rule__InPort__Group__2__Impl : ( ':' ) ;
    public final void rule__InPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2024:1: ( ( ':' ) )
            // InternalComponentModel.g:2025:1: ( ':' )
            {
            // InternalComponentModel.g:2025:1: ( ':' )
            // InternalComponentModel.g:2026:2: ':'
            {
             before(grammarAccess.getInPortAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentModel.g:2035:1: rule__InPort__Group__3 : rule__InPort__Group__3__Impl ;
    public final void rule__InPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2039:1: ( rule__InPort__Group__3__Impl )
            // InternalComponentModel.g:2040:2: rule__InPort__Group__3__Impl
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
    // InternalComponentModel.g:2046:1: rule__InPort__Group__3__Impl : ( ( rule__InPort__SuperTypeAssignment_3 ) ) ;
    public final void rule__InPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2050:1: ( ( ( rule__InPort__SuperTypeAssignment_3 ) ) )
            // InternalComponentModel.g:2051:1: ( ( rule__InPort__SuperTypeAssignment_3 ) )
            {
            // InternalComponentModel.g:2051:1: ( ( rule__InPort__SuperTypeAssignment_3 ) )
            // InternalComponentModel.g:2052:2: ( rule__InPort__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getInPortAccess().getSuperTypeAssignment_3()); 
            // InternalComponentModel.g:2053:2: ( rule__InPort__SuperTypeAssignment_3 )
            // InternalComponentModel.g:2053:3: rule__InPort__SuperTypeAssignment_3
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
    // InternalComponentModel.g:2062:1: rule__OutPort__Group__0 : rule__OutPort__Group__0__Impl rule__OutPort__Group__1 ;
    public final void rule__OutPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2066:1: ( rule__OutPort__Group__0__Impl rule__OutPort__Group__1 )
            // InternalComponentModel.g:2067:2: rule__OutPort__Group__0__Impl rule__OutPort__Group__1
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
    // InternalComponentModel.g:2074:1: rule__OutPort__Group__0__Impl : ( 'port instance out' ) ;
    public final void rule__OutPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2078:1: ( ( 'port instance out' ) )
            // InternalComponentModel.g:2079:1: ( 'port instance out' )
            {
            // InternalComponentModel.g:2079:1: ( 'port instance out' )
            // InternalComponentModel.g:2080:2: 'port instance out'
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
    // InternalComponentModel.g:2089:1: rule__OutPort__Group__1 : rule__OutPort__Group__1__Impl rule__OutPort__Group__2 ;
    public final void rule__OutPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2093:1: ( rule__OutPort__Group__1__Impl rule__OutPort__Group__2 )
            // InternalComponentModel.g:2094:2: rule__OutPort__Group__1__Impl rule__OutPort__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentModel.g:2101:1: rule__OutPort__Group__1__Impl : ( ( rule__OutPort__NameAssignment_1 ) ) ;
    public final void rule__OutPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2105:1: ( ( ( rule__OutPort__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2106:1: ( ( rule__OutPort__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2106:1: ( ( rule__OutPort__NameAssignment_1 ) )
            // InternalComponentModel.g:2107:2: ( rule__OutPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutPortAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2108:2: ( rule__OutPort__NameAssignment_1 )
            // InternalComponentModel.g:2108:3: rule__OutPort__NameAssignment_1
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
    // InternalComponentModel.g:2116:1: rule__OutPort__Group__2 : rule__OutPort__Group__2__Impl rule__OutPort__Group__3 ;
    public final void rule__OutPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2120:1: ( rule__OutPort__Group__2__Impl rule__OutPort__Group__3 )
            // InternalComponentModel.g:2121:2: rule__OutPort__Group__2__Impl rule__OutPort__Group__3
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
    // InternalComponentModel.g:2128:1: rule__OutPort__Group__2__Impl : ( ':' ) ;
    public final void rule__OutPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2132:1: ( ( ':' ) )
            // InternalComponentModel.g:2133:1: ( ':' )
            {
            // InternalComponentModel.g:2133:1: ( ':' )
            // InternalComponentModel.g:2134:2: ':'
            {
             before(grammarAccess.getOutPortAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentModel.g:2143:1: rule__OutPort__Group__3 : rule__OutPort__Group__3__Impl ;
    public final void rule__OutPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2147:1: ( rule__OutPort__Group__3__Impl )
            // InternalComponentModel.g:2148:2: rule__OutPort__Group__3__Impl
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
    // InternalComponentModel.g:2154:1: rule__OutPort__Group__3__Impl : ( ( rule__OutPort__SuperTypeAssignment_3 ) ) ;
    public final void rule__OutPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2158:1: ( ( ( rule__OutPort__SuperTypeAssignment_3 ) ) )
            // InternalComponentModel.g:2159:1: ( ( rule__OutPort__SuperTypeAssignment_3 ) )
            {
            // InternalComponentModel.g:2159:1: ( ( rule__OutPort__SuperTypeAssignment_3 ) )
            // InternalComponentModel.g:2160:2: ( rule__OutPort__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getOutPortAccess().getSuperTypeAssignment_3()); 
            // InternalComponentModel.g:2161:2: ( rule__OutPort__SuperTypeAssignment_3 )
            // InternalComponentModel.g:2161:3: rule__OutPort__SuperTypeAssignment_3
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
    // InternalComponentModel.g:2170:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2174:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // InternalComponentModel.g:2175:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
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
    // InternalComponentModel.g:2182:1: rule__PortType__Group__0__Impl : ( 'port type' ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2186:1: ( ( 'port type' ) )
            // InternalComponentModel.g:2187:1: ( 'port type' )
            {
            // InternalComponentModel.g:2187:1: ( 'port type' )
            // InternalComponentModel.g:2188:2: 'port type'
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
    // InternalComponentModel.g:2197:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2201:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // InternalComponentModel.g:2202:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentModel.g:2209:1: rule__PortType__Group__1__Impl : ( ( rule__PortType__NameAssignment_1 ) ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2213:1: ( ( ( rule__PortType__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2214:1: ( ( rule__PortType__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2214:1: ( ( rule__PortType__NameAssignment_1 ) )
            // InternalComponentModel.g:2215:2: ( rule__PortType__NameAssignment_1 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2216:2: ( rule__PortType__NameAssignment_1 )
            // InternalComponentModel.g:2216:3: rule__PortType__NameAssignment_1
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
    // InternalComponentModel.g:2224:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2228:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // InternalComponentModel.g:2229:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
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
    // InternalComponentModel.g:2236:1: rule__PortType__Group__2__Impl : ( '{' ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2240:1: ( ( '{' ) )
            // InternalComponentModel.g:2241:1: ( '{' )
            {
            // InternalComponentModel.g:2241:1: ( '{' )
            // InternalComponentModel.g:2242:2: '{'
            {
             before(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalComponentModel.g:2251:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl rule__PortType__Group__4 ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2255:1: ( rule__PortType__Group__3__Impl rule__PortType__Group__4 )
            // InternalComponentModel.g:2256:2: rule__PortType__Group__3__Impl rule__PortType__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentModel.g:2263:1: rule__PortType__Group__3__Impl : ( ( rule__PortType__EModesAssignment_3 )* ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2267:1: ( ( ( rule__PortType__EModesAssignment_3 )* ) )
            // InternalComponentModel.g:2268:1: ( ( rule__PortType__EModesAssignment_3 )* )
            {
            // InternalComponentModel.g:2268:1: ( ( rule__PortType__EModesAssignment_3 )* )
            // InternalComponentModel.g:2269:2: ( rule__PortType__EModesAssignment_3 )*
            {
             before(grammarAccess.getPortTypeAccess().getEModesAssignment_3()); 
            // InternalComponentModel.g:2270:2: ( rule__PortType__EModesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentModel.g:2270:3: rule__PortType__EModesAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__PortType__EModesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPortTypeAccess().getEModesAssignment_3()); 

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
    // InternalComponentModel.g:2278:1: rule__PortType__Group__4 : rule__PortType__Group__4__Impl ;
    public final void rule__PortType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2282:1: ( rule__PortType__Group__4__Impl )
            // InternalComponentModel.g:2283:2: rule__PortType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PortType__Group__4__Impl();

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
    // InternalComponentModel.g:2289:1: rule__PortType__Group__4__Impl : ( '}' ) ;
    public final void rule__PortType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2293:1: ( ( '}' ) )
            // InternalComponentModel.g:2294:1: ( '}' )
            {
            // InternalComponentModel.g:2294:1: ( '}' )
            // InternalComponentModel.g:2295:2: '}'
            {
             before(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__ErrorModes__Group__0"
    // InternalComponentModel.g:2305:1: rule__ErrorModes__Group__0 : rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1 ;
    public final void rule__ErrorModes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2309:1: ( rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1 )
            // InternalComponentModel.g:2310:2: rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1
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
    // InternalComponentModel.g:2317:1: rule__ErrorModes__Group__0__Impl : ( 'error mode' ) ;
    public final void rule__ErrorModes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2321:1: ( ( 'error mode' ) )
            // InternalComponentModel.g:2322:1: ( 'error mode' )
            {
            // InternalComponentModel.g:2322:1: ( 'error mode' )
            // InternalComponentModel.g:2323:2: 'error mode'
            {
             before(grammarAccess.getErrorModesAccess().getErrorModeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getErrorModesAccess().getErrorModeKeyword_0()); 

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
    // InternalComponentModel.g:2332:1: rule__ErrorModes__Group__1 : rule__ErrorModes__Group__1__Impl ;
    public final void rule__ErrorModes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2336:1: ( rule__ErrorModes__Group__1__Impl )
            // InternalComponentModel.g:2337:2: rule__ErrorModes__Group__1__Impl
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
    // InternalComponentModel.g:2343:1: rule__ErrorModes__Group__1__Impl : ( ( rule__ErrorModes__NameAssignment_1 ) ) ;
    public final void rule__ErrorModes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2347:1: ( ( ( rule__ErrorModes__NameAssignment_1 ) ) )
            // InternalComponentModel.g:2348:1: ( ( rule__ErrorModes__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:2348:1: ( ( rule__ErrorModes__NameAssignment_1 ) )
            // InternalComponentModel.g:2349:2: ( rule__ErrorModes__NameAssignment_1 )
            {
             before(grammarAccess.getErrorModesAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:2350:2: ( rule__ErrorModes__NameAssignment_1 )
            // InternalComponentModel.g:2350:3: rule__ErrorModes__NameAssignment_1
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


    // $ANTLR start "rule__ComponentModel__ElementsAssignment"
    // InternalComponentModel.g:2359:1: rule__ComponentModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ComponentModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2363:1: ( ( ruleAbstractElement ) )
            // InternalComponentModel.g:2364:2: ( ruleAbstractElement )
            {
            // InternalComponentModel.g:2364:2: ( ruleAbstractElement )
            // InternalComponentModel.g:2365:3: ruleAbstractElement
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


    // $ANTLR start "rule__SystemConnDec__NameAssignment_1"
    // InternalComponentModel.g:2374:1: rule__SystemConnDec__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemConnDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2378:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2379:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2379:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2380:3: ruleQualifiedName
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
    // InternalComponentModel.g:2389:1: rule__SystemConnDec__SourceSystemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__SourceSystemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2393:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2394:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2394:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2395:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_3_0()); 
            // InternalComponentModel.g:2396:3: ( RULE_ID )
            // InternalComponentModel.g:2397:4: RULE_ID
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
    // InternalComponentModel.g:2408:1: rule__SystemConnDec__SourcePortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__SourcePortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2412:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2413:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2413:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2414:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_5_0()); 
            // InternalComponentModel.g:2415:3: ( RULE_ID )
            // InternalComponentModel.g:2416:4: RULE_ID
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
    // InternalComponentModel.g:2427:1: rule__SystemConnDec__TargetSystemAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__TargetSystemAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2431:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2432:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2432:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2433:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_7_0()); 
            // InternalComponentModel.g:2434:3: ( RULE_ID )
            // InternalComponentModel.g:2435:4: RULE_ID
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
    // InternalComponentModel.g:2446:1: rule__SystemConnDec__TargetPortAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__TargetPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2450:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2451:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2451:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2452:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_9_0()); 
            // InternalComponentModel.g:2453:3: ( RULE_ID )
            // InternalComponentModel.g:2454:4: RULE_ID
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
    // InternalComponentModel.g:2465:1: rule__SystemDec__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2469:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2470:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2470:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2471:3: ruleQualifiedName
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
    // InternalComponentModel.g:2480:1: rule__SystemDec__SysFeaturesAssignment_3 : ( ruleAbstractFeatures ) ;
    public final void rule__SystemDec__SysFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2484:1: ( ( ruleAbstractFeatures ) )
            // InternalComponentModel.g:2485:2: ( ruleAbstractFeatures )
            {
            // InternalComponentModel.g:2485:2: ( ruleAbstractFeatures )
            // InternalComponentModel.g:2486:3: ruleAbstractFeatures
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
    // InternalComponentModel.g:2495:1: rule__SystemPortIn__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemPortIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2499:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2500:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2500:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2501:3: ruleQualifiedName
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
    // InternalComponentModel.g:2510:1: rule__SystemPortIn__InCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortIn__InCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2514:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2515:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2515:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2516:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_3_0()); 
            // InternalComponentModel.g:2517:3: ( RULE_ID )
            // InternalComponentModel.g:2518:4: RULE_ID
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
    // InternalComponentModel.g:2529:1: rule__SystemPortIn__InPortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortIn__InPortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2533:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2534:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2534:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2535:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_5_0()); 
            // InternalComponentModel.g:2536:3: ( RULE_ID )
            // InternalComponentModel.g:2537:4: RULE_ID
            {
             before(grammarAccess.getSystemPortInAccess().getInPortInPortIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getInPortInPortIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_5_0()); 

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
    // InternalComponentModel.g:2548:1: rule__SystemPortOut__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SystemPortOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2552:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2553:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2553:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2554:3: ruleQualifiedName
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
    // InternalComponentModel.g:2563:1: rule__SystemPortOut__OutCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortOut__OutCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2567:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2568:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2568:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2569:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_3_0()); 
            // InternalComponentModel.g:2570:3: ( RULE_ID )
            // InternalComponentModel.g:2571:4: RULE_ID
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
    // InternalComponentModel.g:2582:1: rule__SystemPortOut__OutPortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortOut__OutPortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2586:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2587:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2587:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2588:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_5_0()); 
            // InternalComponentModel.g:2589:3: ( RULE_ID )
            // InternalComponentModel.g:2590:4: RULE_ID
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortOutPortIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getOutPortOutPortIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_5_0()); 

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
    // InternalComponentModel.g:2601:1: rule__CompConnDec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompConnDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2605:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:2606:2: ( RULE_ID )
            {
            // InternalComponentModel.g:2606:2: ( RULE_ID )
            // InternalComponentModel.g:2607:3: RULE_ID
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
    // InternalComponentModel.g:2616:1: rule__CompConnDec__SourceCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__SourceCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2620:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2621:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2621:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2622:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_3_0()); 
            // InternalComponentModel.g:2623:3: ( RULE_ID )
            // InternalComponentModel.g:2624:4: RULE_ID
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
    // InternalComponentModel.g:2635:1: rule__CompConnDec__SourcePortAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__SourcePortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2639:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2640:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2640:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2641:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_5_0()); 
            // InternalComponentModel.g:2642:3: ( RULE_ID )
            // InternalComponentModel.g:2643:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortOutPortIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getSourcePortOutPortIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_5_0()); 

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
    // InternalComponentModel.g:2654:1: rule__CompConnDec__TargetCompAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__TargetCompAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2658:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2659:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2659:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2660:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_7_0()); 
            // InternalComponentModel.g:2661:3: ( RULE_ID )
            // InternalComponentModel.g:2662:4: RULE_ID
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
    // InternalComponentModel.g:2673:1: rule__CompConnDec__TargetPortAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__TargetPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2677:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2678:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2678:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2679:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_9_0()); 
            // InternalComponentModel.g:2680:3: ( RULE_ID )
            // InternalComponentModel.g:2681:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortInPortIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getTargetPortInPortIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_9_0()); 

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


    // $ANTLR start "rule__ComponentImpl__NameAssignment_1"
    // InternalComponentModel.g:2692:1: rule__ComponentImpl__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ComponentImpl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2696:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2697:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2697:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2698:3: ruleQualifiedName
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
    // InternalComponentModel.g:2707:1: rule__ComponentImpl__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentImpl__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2711:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2712:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2712:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2713:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_3_0()); 
            // InternalComponentModel.g:2714:3: ( RULE_ID )
            // InternalComponentModel.g:2715:4: RULE_ID
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


    // $ANTLR start "rule__ComponentType__NameAssignment_1"
    // InternalComponentModel.g:2726:1: rule__ComponentType__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ComponentType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2730:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2731:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2731:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2732:3: ruleQualifiedName
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
    // InternalComponentModel.g:2741:1: rule__ComponentType__CompFeaturesAssignment_3 : ( ruleComponentFeature ) ;
    public final void rule__ComponentType__CompFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2745:1: ( ( ruleComponentFeature ) )
            // InternalComponentModel.g:2746:2: ( ruleComponentFeature )
            {
            // InternalComponentModel.g:2746:2: ( ruleComponentFeature )
            // InternalComponentModel.g:2747:3: ruleComponentFeature
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
    // InternalComponentModel.g:2756:1: rule__ComponentFeature__PortsAssignment : ( rulePort ) ;
    public final void rule__ComponentFeature__PortsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2760:1: ( ( rulePort ) )
            // InternalComponentModel.g:2761:2: ( rulePort )
            {
            // InternalComponentModel.g:2761:2: ( rulePort )
            // InternalComponentModel.g:2762:3: rulePort
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
    // InternalComponentModel.g:2771:1: rule__InPort__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__InPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2775:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2776:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2776:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2777:3: ruleQualifiedName
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
    // InternalComponentModel.g:2786:1: rule__InPort__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InPort__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2790:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2791:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2791:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2792:3: ( RULE_ID )
            {
             before(grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_3_0()); 
            // InternalComponentModel.g:2793:3: ( RULE_ID )
            // InternalComponentModel.g:2794:4: RULE_ID
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
    // InternalComponentModel.g:2805:1: rule__OutPort__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__OutPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2809:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2810:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2810:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2811:3: ruleQualifiedName
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
    // InternalComponentModel.g:2820:1: rule__OutPort__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__OutPort__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2824:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:2825:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:2825:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:2826:3: ( RULE_ID )
            {
             before(grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_3_0()); 
            // InternalComponentModel.g:2827:3: ( RULE_ID )
            // InternalComponentModel.g:2828:4: RULE_ID
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
    // InternalComponentModel.g:2839:1: rule__PortType__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PortType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2843:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2844:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2844:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2845:3: ruleQualifiedName
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


    // $ANTLR start "rule__PortType__EModesAssignment_3"
    // InternalComponentModel.g:2854:1: rule__PortType__EModesAssignment_3 : ( ruleerrorModes ) ;
    public final void rule__PortType__EModesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2858:1: ( ( ruleerrorModes ) )
            // InternalComponentModel.g:2859:2: ( ruleerrorModes )
            {
            // InternalComponentModel.g:2859:2: ( ruleerrorModes )
            // InternalComponentModel.g:2860:3: ruleerrorModes
            {
             before(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleerrorModes();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PortType__EModesAssignment_3"


    // $ANTLR start "rule__ErrorModes__NameAssignment_1"
    // InternalComponentModel.g:2869:1: rule__ErrorModes__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ErrorModes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2873:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:2874:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:2874:2: ( ruleQualifiedName )
            // InternalComponentModel.g:2875:3: ruleQualifiedName
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000BE0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000BC0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});

}