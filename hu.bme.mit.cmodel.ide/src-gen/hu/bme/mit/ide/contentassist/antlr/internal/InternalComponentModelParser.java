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

                if ( (LA1_0==12||LA1_0==18) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalComponentModel.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalComponentModel.g:79:1: ( ruleQualifiedName EOF )
            // InternalComponentModel.g:80:1: ruleQualifiedName EOF
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
    // InternalComponentModel.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalComponentModel.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalComponentModel.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalComponentModel.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalComponentModel.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalComponentModel.g:94:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalComponentModel.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalComponentModel.g:104:1: ( ruleAbstractElement EOF )
            // InternalComponentModel.g:105:1: ruleAbstractElement EOF
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
    // InternalComponentModel.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalComponentModel.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalComponentModel.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalComponentModel.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalComponentModel.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalComponentModel.g:119:4: rule__AbstractElement__Alternatives
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


    // $ANTLR start "entryRulePortType"
    // InternalComponentModel.g:128:1: entryRulePortType : rulePortType EOF ;
    public final void entryRulePortType() throws RecognitionException {
        try {
            // InternalComponentModel.g:129:1: ( rulePortType EOF )
            // InternalComponentModel.g:130:1: rulePortType EOF
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
    // InternalComponentModel.g:137:1: rulePortType : ( ( rule__PortType__Group__0 ) ) ;
    public final void rulePortType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:141:2: ( ( ( rule__PortType__Group__0 ) ) )
            // InternalComponentModel.g:142:2: ( ( rule__PortType__Group__0 ) )
            {
            // InternalComponentModel.g:142:2: ( ( rule__PortType__Group__0 ) )
            // InternalComponentModel.g:143:3: ( rule__PortType__Group__0 )
            {
             before(grammarAccess.getPortTypeAccess().getGroup()); 
            // InternalComponentModel.g:144:3: ( rule__PortType__Group__0 )
            // InternalComponentModel.g:144:4: rule__PortType__Group__0
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


    // $ANTLR start "entryRuleErrorModes"
    // InternalComponentModel.g:153:1: entryRuleErrorModes : ruleErrorModes EOF ;
    public final void entryRuleErrorModes() throws RecognitionException {
        try {
            // InternalComponentModel.g:154:1: ( ruleErrorModes EOF )
            // InternalComponentModel.g:155:1: ruleErrorModes EOF
            {
             before(grammarAccess.getErrorModesRule()); 
            pushFollow(FOLLOW_1);
            ruleErrorModes();

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
    // $ANTLR end "entryRuleErrorModes"


    // $ANTLR start "ruleErrorModes"
    // InternalComponentModel.g:162:1: ruleErrorModes : ( ( rule__ErrorModes__Group__0 ) ) ;
    public final void ruleErrorModes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:166:2: ( ( ( rule__ErrorModes__Group__0 ) ) )
            // InternalComponentModel.g:167:2: ( ( rule__ErrorModes__Group__0 ) )
            {
            // InternalComponentModel.g:167:2: ( ( rule__ErrorModes__Group__0 ) )
            // InternalComponentModel.g:168:3: ( rule__ErrorModes__Group__0 )
            {
             before(grammarAccess.getErrorModesAccess().getGroup()); 
            // InternalComponentModel.g:169:3: ( rule__ErrorModes__Group__0 )
            // InternalComponentModel.g:169:4: rule__ErrorModes__Group__0
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
    // $ANTLR end "ruleErrorModes"


    // $ANTLR start "entryRuleComponentModelDec"
    // InternalComponentModel.g:178:1: entryRuleComponentModelDec : ruleComponentModelDec EOF ;
    public final void entryRuleComponentModelDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:179:1: ( ruleComponentModelDec EOF )
            // InternalComponentModel.g:180:1: ruleComponentModelDec EOF
            {
             before(grammarAccess.getComponentModelDecRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModelDec();

            state._fsp--;

             after(grammarAccess.getComponentModelDecRule()); 
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
    // $ANTLR end "entryRuleComponentModelDec"


    // $ANTLR start "ruleComponentModelDec"
    // InternalComponentModel.g:187:1: ruleComponentModelDec : ( ( rule__ComponentModelDec__Alternatives ) ) ;
    public final void ruleComponentModelDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:191:2: ( ( ( rule__ComponentModelDec__Alternatives ) ) )
            // InternalComponentModel.g:192:2: ( ( rule__ComponentModelDec__Alternatives ) )
            {
            // InternalComponentModel.g:192:2: ( ( rule__ComponentModelDec__Alternatives ) )
            // InternalComponentModel.g:193:3: ( rule__ComponentModelDec__Alternatives )
            {
             before(grammarAccess.getComponentModelDecAccess().getAlternatives()); 
            // InternalComponentModel.g:194:3: ( rule__ComponentModelDec__Alternatives )
            // InternalComponentModel.g:194:4: rule__ComponentModelDec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModelDec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentModelDecAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponentModelDec"


    // $ANTLR start "entryRuleSystemConnDec"
    // InternalComponentModel.g:203:1: entryRuleSystemConnDec : ruleSystemConnDec EOF ;
    public final void entryRuleSystemConnDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:204:1: ( ruleSystemConnDec EOF )
            // InternalComponentModel.g:205:1: ruleSystemConnDec EOF
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
    // InternalComponentModel.g:212:1: ruleSystemConnDec : ( ( rule__SystemConnDec__Group__0 ) ) ;
    public final void ruleSystemConnDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:216:2: ( ( ( rule__SystemConnDec__Group__0 ) ) )
            // InternalComponentModel.g:217:2: ( ( rule__SystemConnDec__Group__0 ) )
            {
            // InternalComponentModel.g:217:2: ( ( rule__SystemConnDec__Group__0 ) )
            // InternalComponentModel.g:218:3: ( rule__SystemConnDec__Group__0 )
            {
             before(grammarAccess.getSystemConnDecAccess().getGroup()); 
            // InternalComponentModel.g:219:3: ( rule__SystemConnDec__Group__0 )
            // InternalComponentModel.g:219:4: rule__SystemConnDec__Group__0
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


    // $ANTLR start "entryRuleSystemDec"
    // InternalComponentModel.g:228:1: entryRuleSystemDec : ruleSystemDec EOF ;
    public final void entryRuleSystemDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:229:1: ( ruleSystemDec EOF )
            // InternalComponentModel.g:230:1: ruleSystemDec EOF
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
    // InternalComponentModel.g:237:1: ruleSystemDec : ( ( rule__SystemDec__Group__0 ) ) ;
    public final void ruleSystemDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:241:2: ( ( ( rule__SystemDec__Group__0 ) ) )
            // InternalComponentModel.g:242:2: ( ( rule__SystemDec__Group__0 ) )
            {
            // InternalComponentModel.g:242:2: ( ( rule__SystemDec__Group__0 ) )
            // InternalComponentModel.g:243:3: ( rule__SystemDec__Group__0 )
            {
             before(grammarAccess.getSystemDecAccess().getGroup()); 
            // InternalComponentModel.g:244:3: ( rule__SystemDec__Group__0 )
            // InternalComponentModel.g:244:4: rule__SystemDec__Group__0
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
    // InternalComponentModel.g:253:1: entryRuleAbstractFeatures : ruleAbstractFeatures EOF ;
    public final void entryRuleAbstractFeatures() throws RecognitionException {
        try {
            // InternalComponentModel.g:254:1: ( ruleAbstractFeatures EOF )
            // InternalComponentModel.g:255:1: ruleAbstractFeatures EOF
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
    // InternalComponentModel.g:262:1: ruleAbstractFeatures : ( ( rule__AbstractFeatures__Alternatives ) ) ;
    public final void ruleAbstractFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:266:2: ( ( ( rule__AbstractFeatures__Alternatives ) ) )
            // InternalComponentModel.g:267:2: ( ( rule__AbstractFeatures__Alternatives ) )
            {
            // InternalComponentModel.g:267:2: ( ( rule__AbstractFeatures__Alternatives ) )
            // InternalComponentModel.g:268:3: ( rule__AbstractFeatures__Alternatives )
            {
             before(grammarAccess.getAbstractFeaturesAccess().getAlternatives()); 
            // InternalComponentModel.g:269:3: ( rule__AbstractFeatures__Alternatives )
            // InternalComponentModel.g:269:4: rule__AbstractFeatures__Alternatives
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
    // InternalComponentModel.g:278:1: entryRuleSystemPortDec : ruleSystemPortDec EOF ;
    public final void entryRuleSystemPortDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:279:1: ( ruleSystemPortDec EOF )
            // InternalComponentModel.g:280:1: ruleSystemPortDec EOF
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
    // InternalComponentModel.g:287:1: ruleSystemPortDec : ( ( rule__SystemPortDec__Alternatives ) ) ;
    public final void ruleSystemPortDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:291:2: ( ( ( rule__SystemPortDec__Alternatives ) ) )
            // InternalComponentModel.g:292:2: ( ( rule__SystemPortDec__Alternatives ) )
            {
            // InternalComponentModel.g:292:2: ( ( rule__SystemPortDec__Alternatives ) )
            // InternalComponentModel.g:293:3: ( rule__SystemPortDec__Alternatives )
            {
             before(grammarAccess.getSystemPortDecAccess().getAlternatives()); 
            // InternalComponentModel.g:294:3: ( rule__SystemPortDec__Alternatives )
            // InternalComponentModel.g:294:4: rule__SystemPortDec__Alternatives
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
    // InternalComponentModel.g:303:1: entryRuleSystemPortIn : ruleSystemPortIn EOF ;
    public final void entryRuleSystemPortIn() throws RecognitionException {
        try {
            // InternalComponentModel.g:304:1: ( ruleSystemPortIn EOF )
            // InternalComponentModel.g:305:1: ruleSystemPortIn EOF
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
    // InternalComponentModel.g:312:1: ruleSystemPortIn : ( ( rule__SystemPortIn__Group__0 ) ) ;
    public final void ruleSystemPortIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:316:2: ( ( ( rule__SystemPortIn__Group__0 ) ) )
            // InternalComponentModel.g:317:2: ( ( rule__SystemPortIn__Group__0 ) )
            {
            // InternalComponentModel.g:317:2: ( ( rule__SystemPortIn__Group__0 ) )
            // InternalComponentModel.g:318:3: ( rule__SystemPortIn__Group__0 )
            {
             before(grammarAccess.getSystemPortInAccess().getGroup()); 
            // InternalComponentModel.g:319:3: ( rule__SystemPortIn__Group__0 )
            // InternalComponentModel.g:319:4: rule__SystemPortIn__Group__0
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
    // InternalComponentModel.g:328:1: entryRuleSystemPortOut : ruleSystemPortOut EOF ;
    public final void entryRuleSystemPortOut() throws RecognitionException {
        try {
            // InternalComponentModel.g:329:1: ( ruleSystemPortOut EOF )
            // InternalComponentModel.g:330:1: ruleSystemPortOut EOF
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
    // InternalComponentModel.g:337:1: ruleSystemPortOut : ( ( rule__SystemPortOut__Group__0 ) ) ;
    public final void ruleSystemPortOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:341:2: ( ( ( rule__SystemPortOut__Group__0 ) ) )
            // InternalComponentModel.g:342:2: ( ( rule__SystemPortOut__Group__0 ) )
            {
            // InternalComponentModel.g:342:2: ( ( rule__SystemPortOut__Group__0 ) )
            // InternalComponentModel.g:343:3: ( rule__SystemPortOut__Group__0 )
            {
             before(grammarAccess.getSystemPortOutAccess().getGroup()); 
            // InternalComponentModel.g:344:3: ( rule__SystemPortOut__Group__0 )
            // InternalComponentModel.g:344:4: rule__SystemPortOut__Group__0
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
    // InternalComponentModel.g:353:1: entryRuleCompConnDec : ruleCompConnDec EOF ;
    public final void entryRuleCompConnDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:354:1: ( ruleCompConnDec EOF )
            // InternalComponentModel.g:355:1: ruleCompConnDec EOF
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
    // InternalComponentModel.g:362:1: ruleCompConnDec : ( ( rule__CompConnDec__Group__0 ) ) ;
    public final void ruleCompConnDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:366:2: ( ( ( rule__CompConnDec__Group__0 ) ) )
            // InternalComponentModel.g:367:2: ( ( rule__CompConnDec__Group__0 ) )
            {
            // InternalComponentModel.g:367:2: ( ( rule__CompConnDec__Group__0 ) )
            // InternalComponentModel.g:368:3: ( rule__CompConnDec__Group__0 )
            {
             before(grammarAccess.getCompConnDecAccess().getGroup()); 
            // InternalComponentModel.g:369:3: ( rule__CompConnDec__Group__0 )
            // InternalComponentModel.g:369:4: rule__CompConnDec__Group__0
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
    // InternalComponentModel.g:378:1: entryRuleComponentImpl : ruleComponentImpl EOF ;
    public final void entryRuleComponentImpl() throws RecognitionException {
        try {
            // InternalComponentModel.g:379:1: ( ruleComponentImpl EOF )
            // InternalComponentModel.g:380:1: ruleComponentImpl EOF
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
    // InternalComponentModel.g:387:1: ruleComponentImpl : ( ( rule__ComponentImpl__Group__0 ) ) ;
    public final void ruleComponentImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:391:2: ( ( ( rule__ComponentImpl__Group__0 ) ) )
            // InternalComponentModel.g:392:2: ( ( rule__ComponentImpl__Group__0 ) )
            {
            // InternalComponentModel.g:392:2: ( ( rule__ComponentImpl__Group__0 ) )
            // InternalComponentModel.g:393:3: ( rule__ComponentImpl__Group__0 )
            {
             before(grammarAccess.getComponentImplAccess().getGroup()); 
            // InternalComponentModel.g:394:3: ( rule__ComponentImpl__Group__0 )
            // InternalComponentModel.g:394:4: rule__ComponentImpl__Group__0
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
    // InternalComponentModel.g:403:1: entryRuleComponentType : ruleComponentType EOF ;
    public final void entryRuleComponentType() throws RecognitionException {
        try {
            // InternalComponentModel.g:404:1: ( ruleComponentType EOF )
            // InternalComponentModel.g:405:1: ruleComponentType EOF
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
    // InternalComponentModel.g:412:1: ruleComponentType : ( ( rule__ComponentType__Group__0 ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:416:2: ( ( ( rule__ComponentType__Group__0 ) ) )
            // InternalComponentModel.g:417:2: ( ( rule__ComponentType__Group__0 ) )
            {
            // InternalComponentModel.g:417:2: ( ( rule__ComponentType__Group__0 ) )
            // InternalComponentModel.g:418:3: ( rule__ComponentType__Group__0 )
            {
             before(grammarAccess.getComponentTypeAccess().getGroup()); 
            // InternalComponentModel.g:419:3: ( rule__ComponentType__Group__0 )
            // InternalComponentModel.g:419:4: rule__ComponentType__Group__0
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


    // $ANTLR start "entryRuleAbstractComponentFeatures"
    // InternalComponentModel.g:428:1: entryRuleAbstractComponentFeatures : ruleAbstractComponentFeatures EOF ;
    public final void entryRuleAbstractComponentFeatures() throws RecognitionException {
        try {
            // InternalComponentModel.g:429:1: ( ruleAbstractComponentFeatures EOF )
            // InternalComponentModel.g:430:1: ruleAbstractComponentFeatures EOF
            {
             before(grammarAccess.getAbstractComponentFeaturesRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractComponentFeatures();

            state._fsp--;

             after(grammarAccess.getAbstractComponentFeaturesRule()); 
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
    // $ANTLR end "entryRuleAbstractComponentFeatures"


    // $ANTLR start "ruleAbstractComponentFeatures"
    // InternalComponentModel.g:437:1: ruleAbstractComponentFeatures : ( ( rule__AbstractComponentFeatures__Alternatives ) ) ;
    public final void ruleAbstractComponentFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:441:2: ( ( ( rule__AbstractComponentFeatures__Alternatives ) ) )
            // InternalComponentModel.g:442:2: ( ( rule__AbstractComponentFeatures__Alternatives ) )
            {
            // InternalComponentModel.g:442:2: ( ( rule__AbstractComponentFeatures__Alternatives ) )
            // InternalComponentModel.g:443:3: ( rule__AbstractComponentFeatures__Alternatives )
            {
             before(grammarAccess.getAbstractComponentFeaturesAccess().getAlternatives()); 
            // InternalComponentModel.g:444:3: ( rule__AbstractComponentFeatures__Alternatives )
            // InternalComponentModel.g:444:4: rule__AbstractComponentFeatures__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractComponentFeatures__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentFeaturesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractComponentFeatures"


    // $ANTLR start "entryRulePort"
    // InternalComponentModel.g:453:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalComponentModel.g:454:1: ( rulePort EOF )
            // InternalComponentModel.g:455:1: rulePort EOF
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
    // InternalComponentModel.g:462:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:466:2: ( ( ( rule__Port__Alternatives ) ) )
            // InternalComponentModel.g:467:2: ( ( rule__Port__Alternatives ) )
            {
            // InternalComponentModel.g:467:2: ( ( rule__Port__Alternatives ) )
            // InternalComponentModel.g:468:3: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // InternalComponentModel.g:469:3: ( rule__Port__Alternatives )
            // InternalComponentModel.g:469:4: rule__Port__Alternatives
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
    // InternalComponentModel.g:478:1: entryRuleInPort : ruleInPort EOF ;
    public final void entryRuleInPort() throws RecognitionException {
        try {
            // InternalComponentModel.g:479:1: ( ruleInPort EOF )
            // InternalComponentModel.g:480:1: ruleInPort EOF
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
    // InternalComponentModel.g:487:1: ruleInPort : ( ( rule__InPort__Group__0 ) ) ;
    public final void ruleInPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:491:2: ( ( ( rule__InPort__Group__0 ) ) )
            // InternalComponentModel.g:492:2: ( ( rule__InPort__Group__0 ) )
            {
            // InternalComponentModel.g:492:2: ( ( rule__InPort__Group__0 ) )
            // InternalComponentModel.g:493:3: ( rule__InPort__Group__0 )
            {
             before(grammarAccess.getInPortAccess().getGroup()); 
            // InternalComponentModel.g:494:3: ( rule__InPort__Group__0 )
            // InternalComponentModel.g:494:4: rule__InPort__Group__0
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
    // InternalComponentModel.g:503:1: entryRuleOutPort : ruleOutPort EOF ;
    public final void entryRuleOutPort() throws RecognitionException {
        try {
            // InternalComponentModel.g:504:1: ( ruleOutPort EOF )
            // InternalComponentModel.g:505:1: ruleOutPort EOF
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
    // InternalComponentModel.g:512:1: ruleOutPort : ( ( rule__OutPort__Group__0 ) ) ;
    public final void ruleOutPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:516:2: ( ( ( rule__OutPort__Group__0 ) ) )
            // InternalComponentModel.g:517:2: ( ( rule__OutPort__Group__0 ) )
            {
            // InternalComponentModel.g:517:2: ( ( rule__OutPort__Group__0 ) )
            // InternalComponentModel.g:518:3: ( rule__OutPort__Group__0 )
            {
             before(grammarAccess.getOutPortAccess().getGroup()); 
            // InternalComponentModel.g:519:3: ( rule__OutPort__Group__0 )
            // InternalComponentModel.g:519:4: rule__OutPort__Group__0
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


    // $ANTLR start "entryRuleEModelDec"
    // InternalComponentModel.g:528:1: entryRuleEModelDec : ruleEModelDec EOF ;
    public final void entryRuleEModelDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:529:1: ( ruleEModelDec EOF )
            // InternalComponentModel.g:530:1: ruleEModelDec EOF
            {
             before(grammarAccess.getEModelDecRule()); 
            pushFollow(FOLLOW_1);
            ruleEModelDec();

            state._fsp--;

             after(grammarAccess.getEModelDecRule()); 
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
    // $ANTLR end "entryRuleEModelDec"


    // $ANTLR start "ruleEModelDec"
    // InternalComponentModel.g:537:1: ruleEModelDec : ( ( rule__EModelDec__Group__0 ) ) ;
    public final void ruleEModelDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:541:2: ( ( ( rule__EModelDec__Group__0 ) ) )
            // InternalComponentModel.g:542:2: ( ( rule__EModelDec__Group__0 ) )
            {
            // InternalComponentModel.g:542:2: ( ( rule__EModelDec__Group__0 ) )
            // InternalComponentModel.g:543:3: ( rule__EModelDec__Group__0 )
            {
             before(grammarAccess.getEModelDecAccess().getGroup()); 
            // InternalComponentModel.g:544:3: ( rule__EModelDec__Group__0 )
            // InternalComponentModel.g:544:4: rule__EModelDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEModelDecAccess().getGroup()); 

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
    // $ANTLR end "ruleEModelDec"


    // $ANTLR start "entryRuleEModelElement"
    // InternalComponentModel.g:553:1: entryRuleEModelElement : ruleEModelElement EOF ;
    public final void entryRuleEModelElement() throws RecognitionException {
        try {
            // InternalComponentModel.g:554:1: ( ruleEModelElement EOF )
            // InternalComponentModel.g:555:1: ruleEModelElement EOF
            {
             before(grammarAccess.getEModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEModelElement();

            state._fsp--;

             after(grammarAccess.getEModelElementRule()); 
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
    // $ANTLR end "entryRuleEModelElement"


    // $ANTLR start "ruleEModelElement"
    // InternalComponentModel.g:562:1: ruleEModelElement : ( ( rule__EModelElement__Alternatives ) ) ;
    public final void ruleEModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:566:2: ( ( ( rule__EModelElement__Alternatives ) ) )
            // InternalComponentModel.g:567:2: ( ( rule__EModelElement__Alternatives ) )
            {
            // InternalComponentModel.g:567:2: ( ( rule__EModelElement__Alternatives ) )
            // InternalComponentModel.g:568:3: ( rule__EModelElement__Alternatives )
            {
             before(grammarAccess.getEModelElementAccess().getAlternatives()); 
            // InternalComponentModel.g:569:3: ( rule__EModelElement__Alternatives )
            // InternalComponentModel.g:569:4: rule__EModelElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEModelElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEModelElement"


    // $ANTLR start "entryRuleStateDec"
    // InternalComponentModel.g:578:1: entryRuleStateDec : ruleStateDec EOF ;
    public final void entryRuleStateDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:579:1: ( ruleStateDec EOF )
            // InternalComponentModel.g:580:1: ruleStateDec EOF
            {
             before(grammarAccess.getStateDecRule()); 
            pushFollow(FOLLOW_1);
            ruleStateDec();

            state._fsp--;

             after(grammarAccess.getStateDecRule()); 
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
    // $ANTLR end "entryRuleStateDec"


    // $ANTLR start "ruleStateDec"
    // InternalComponentModel.g:587:1: ruleStateDec : ( ( rule__StateDec__Group__0 ) ) ;
    public final void ruleStateDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:591:2: ( ( ( rule__StateDec__Group__0 ) ) )
            // InternalComponentModel.g:592:2: ( ( rule__StateDec__Group__0 ) )
            {
            // InternalComponentModel.g:592:2: ( ( rule__StateDec__Group__0 ) )
            // InternalComponentModel.g:593:3: ( rule__StateDec__Group__0 )
            {
             before(grammarAccess.getStateDecAccess().getGroup()); 
            // InternalComponentModel.g:594:3: ( rule__StateDec__Group__0 )
            // InternalComponentModel.g:594:4: rule__StateDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateDecAccess().getGroup()); 

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
    // $ANTLR end "ruleStateDec"


    // $ANTLR start "entryRuleTransitionDec"
    // InternalComponentModel.g:603:1: entryRuleTransitionDec : ruleTransitionDec EOF ;
    public final void entryRuleTransitionDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:604:1: ( ruleTransitionDec EOF )
            // InternalComponentModel.g:605:1: ruleTransitionDec EOF
            {
             before(grammarAccess.getTransitionDecRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionDec();

            state._fsp--;

             after(grammarAccess.getTransitionDecRule()); 
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
    // $ANTLR end "entryRuleTransitionDec"


    // $ANTLR start "ruleTransitionDec"
    // InternalComponentModel.g:612:1: ruleTransitionDec : ( ( rule__TransitionDec__Group__0 ) ) ;
    public final void ruleTransitionDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:616:2: ( ( ( rule__TransitionDec__Group__0 ) ) )
            // InternalComponentModel.g:617:2: ( ( rule__TransitionDec__Group__0 ) )
            {
            // InternalComponentModel.g:617:2: ( ( rule__TransitionDec__Group__0 ) )
            // InternalComponentModel.g:618:3: ( rule__TransitionDec__Group__0 )
            {
             before(grammarAccess.getTransitionDecAccess().getGroup()); 
            // InternalComponentModel.g:619:3: ( rule__TransitionDec__Group__0 )
            // InternalComponentModel.g:619:4: rule__TransitionDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionDecAccess().getGroup()); 

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
    // $ANTLR end "ruleTransitionDec"


    // $ANTLR start "entryRuleTransitionFeatureDec"
    // InternalComponentModel.g:628:1: entryRuleTransitionFeatureDec : ruleTransitionFeatureDec EOF ;
    public final void entryRuleTransitionFeatureDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:629:1: ( ruleTransitionFeatureDec EOF )
            // InternalComponentModel.g:630:1: ruleTransitionFeatureDec EOF
            {
             before(grammarAccess.getTransitionFeatureDecRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionFeatureDec();

            state._fsp--;

             after(grammarAccess.getTransitionFeatureDecRule()); 
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
    // $ANTLR end "entryRuleTransitionFeatureDec"


    // $ANTLR start "ruleTransitionFeatureDec"
    // InternalComponentModel.g:637:1: ruleTransitionFeatureDec : ( ( rule__TransitionFeatureDec__Alternatives ) ) ;
    public final void ruleTransitionFeatureDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:641:2: ( ( ( rule__TransitionFeatureDec__Alternatives ) ) )
            // InternalComponentModel.g:642:2: ( ( rule__TransitionFeatureDec__Alternatives ) )
            {
            // InternalComponentModel.g:642:2: ( ( rule__TransitionFeatureDec__Alternatives ) )
            // InternalComponentModel.g:643:3: ( rule__TransitionFeatureDec__Alternatives )
            {
             before(grammarAccess.getTransitionFeatureDecAccess().getAlternatives()); 
            // InternalComponentModel.g:644:3: ( rule__TransitionFeatureDec__Alternatives )
            // InternalComponentModel.g:644:4: rule__TransitionFeatureDec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransitionFeatureDec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionFeatureDecAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransitionFeatureDec"


    // $ANTLR start "entryRuleTransitionState"
    // InternalComponentModel.g:653:1: entryRuleTransitionState : ruleTransitionState EOF ;
    public final void entryRuleTransitionState() throws RecognitionException {
        try {
            // InternalComponentModel.g:654:1: ( ruleTransitionState EOF )
            // InternalComponentModel.g:655:1: ruleTransitionState EOF
            {
             before(grammarAccess.getTransitionStateRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionState();

            state._fsp--;

             after(grammarAccess.getTransitionStateRule()); 
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
    // $ANTLR end "entryRuleTransitionState"


    // $ANTLR start "ruleTransitionState"
    // InternalComponentModel.g:662:1: ruleTransitionState : ( ( rule__TransitionState__Group__0 ) ) ;
    public final void ruleTransitionState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:666:2: ( ( ( rule__TransitionState__Group__0 ) ) )
            // InternalComponentModel.g:667:2: ( ( rule__TransitionState__Group__0 ) )
            {
            // InternalComponentModel.g:667:2: ( ( rule__TransitionState__Group__0 ) )
            // InternalComponentModel.g:668:3: ( rule__TransitionState__Group__0 )
            {
             before(grammarAccess.getTransitionStateAccess().getGroup()); 
            // InternalComponentModel.g:669:3: ( rule__TransitionState__Group__0 )
            // InternalComponentModel.g:669:4: rule__TransitionState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getGroup()); 

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
    // $ANTLR end "ruleTransitionState"


    // $ANTLR start "entryRuleTriggerDec"
    // InternalComponentModel.g:678:1: entryRuleTriggerDec : ruleTriggerDec EOF ;
    public final void entryRuleTriggerDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:679:1: ( ruleTriggerDec EOF )
            // InternalComponentModel.g:680:1: ruleTriggerDec EOF
            {
             before(grammarAccess.getTriggerDecRule()); 
            pushFollow(FOLLOW_1);
            ruleTriggerDec();

            state._fsp--;

             after(grammarAccess.getTriggerDecRule()); 
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
    // $ANTLR end "entryRuleTriggerDec"


    // $ANTLR start "ruleTriggerDec"
    // InternalComponentModel.g:687:1: ruleTriggerDec : ( ( rule__TriggerDec__Group__0 ) ) ;
    public final void ruleTriggerDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:691:2: ( ( ( rule__TriggerDec__Group__0 ) ) )
            // InternalComponentModel.g:692:2: ( ( rule__TriggerDec__Group__0 ) )
            {
            // InternalComponentModel.g:692:2: ( ( rule__TriggerDec__Group__0 ) )
            // InternalComponentModel.g:693:3: ( rule__TriggerDec__Group__0 )
            {
             before(grammarAccess.getTriggerDecAccess().getGroup()); 
            // InternalComponentModel.g:694:3: ( rule__TriggerDec__Group__0 )
            // InternalComponentModel.g:694:4: rule__TriggerDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDecAccess().getGroup()); 

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
    // $ANTLR end "ruleTriggerDec"


    // $ANTLR start "entryRuleActionDec"
    // InternalComponentModel.g:703:1: entryRuleActionDec : ruleActionDec EOF ;
    public final void entryRuleActionDec() throws RecognitionException {
        try {
            // InternalComponentModel.g:704:1: ( ruleActionDec EOF )
            // InternalComponentModel.g:705:1: ruleActionDec EOF
            {
             before(grammarAccess.getActionDecRule()); 
            pushFollow(FOLLOW_1);
            ruleActionDec();

            state._fsp--;

             after(grammarAccess.getActionDecRule()); 
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
    // $ANTLR end "entryRuleActionDec"


    // $ANTLR start "ruleActionDec"
    // InternalComponentModel.g:712:1: ruleActionDec : ( ( rule__ActionDec__Group__0 ) ) ;
    public final void ruleActionDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:716:2: ( ( ( rule__ActionDec__Group__0 ) ) )
            // InternalComponentModel.g:717:2: ( ( rule__ActionDec__Group__0 ) )
            {
            // InternalComponentModel.g:717:2: ( ( rule__ActionDec__Group__0 ) )
            // InternalComponentModel.g:718:3: ( rule__ActionDec__Group__0 )
            {
             before(grammarAccess.getActionDecAccess().getGroup()); 
            // InternalComponentModel.g:719:3: ( rule__ActionDec__Group__0 )
            // InternalComponentModel.g:719:4: rule__ActionDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionDecAccess().getGroup()); 

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
    // $ANTLR end "ruleActionDec"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalComponentModel.g:728:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalComponentModel.g:729:1: ( ruleDOUBLE EOF )
            // InternalComponentModel.g:730:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalComponentModel.g:737:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:741:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalComponentModel.g:742:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalComponentModel.g:742:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalComponentModel.g:743:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalComponentModel.g:744:3: ( rule__DOUBLE__Group__0 )
            // InternalComponentModel.g:744:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalComponentModel.g:752:1: rule__AbstractElement__Alternatives : ( ( ruleComponentModelDec ) | ( rulePortType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:756:1: ( ( ruleComponentModelDec ) | ( rulePortType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentModel.g:757:2: ( ruleComponentModelDec )
                    {
                    // InternalComponentModel.g:757:2: ( ruleComponentModelDec )
                    // InternalComponentModel.g:758:3: ruleComponentModelDec
                    {
                     before(grammarAccess.getAbstractElementAccess().getComponentModelDecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentModelDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getComponentModelDecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:763:2: ( rulePortType )
                    {
                    // InternalComponentModel.g:763:2: ( rulePortType )
                    // InternalComponentModel.g:764:3: rulePortType
                    {
                     before(grammarAccess.getAbstractElementAccess().getPortTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePortType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPortTypeParserRuleCall_1()); 

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


    // $ANTLR start "rule__ComponentModelDec__Alternatives"
    // InternalComponentModel.g:773:1: rule__ComponentModelDec__Alternatives : ( ( ruleSystemConnDec ) | ( ruleSystemDec ) );
    public final void rule__ComponentModelDec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:777:1: ( ( ruleSystemConnDec ) | ( ruleSystemDec ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==22) ) {
                    alt3=2;
                }
                else if ( (LA3_1==19) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentModel.g:778:2: ( ruleSystemConnDec )
                    {
                    // InternalComponentModel.g:778:2: ( ruleSystemConnDec )
                    // InternalComponentModel.g:779:3: ruleSystemConnDec
                    {
                     before(grammarAccess.getComponentModelDecAccess().getSystemConnDecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemConnDec();

                    state._fsp--;

                     after(grammarAccess.getComponentModelDecAccess().getSystemConnDecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:784:2: ( ruleSystemDec )
                    {
                    // InternalComponentModel.g:784:2: ( ruleSystemDec )
                    // InternalComponentModel.g:785:3: ruleSystemDec
                    {
                     before(grammarAccess.getComponentModelDecAccess().getSystemDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemDec();

                    state._fsp--;

                     after(grammarAccess.getComponentModelDecAccess().getSystemDecParserRuleCall_1()); 

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
    // $ANTLR end "rule__ComponentModelDec__Alternatives"


    // $ANTLR start "rule__AbstractFeatures__Alternatives"
    // InternalComponentModel.g:794:1: rule__AbstractFeatures__Alternatives : ( ( ruleComponentType ) | ( ruleComponentImpl ) | ( ruleCompConnDec ) | ( ruleSystemPortDec ) );
    public final void rule__AbstractFeatures__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:798:1: ( ( ruleComponentType ) | ( ruleComponentImpl ) | ( ruleCompConnDec ) | ( ruleSystemPortDec ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt4=1;
                    }
                    break;
                case 26:
                    {
                    alt4=2;
                    }
                    break;
                case 19:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==18) ) {
                alt4=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentModel.g:799:2: ( ruleComponentType )
                    {
                    // InternalComponentModel.g:799:2: ( ruleComponentType )
                    // InternalComponentModel.g:800:3: ruleComponentType
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
                    // InternalComponentModel.g:805:2: ( ruleComponentImpl )
                    {
                    // InternalComponentModel.g:805:2: ( ruleComponentImpl )
                    // InternalComponentModel.g:806:3: ruleComponentImpl
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
                    // InternalComponentModel.g:811:2: ( ruleCompConnDec )
                    {
                    // InternalComponentModel.g:811:2: ( ruleCompConnDec )
                    // InternalComponentModel.g:812:3: ruleCompConnDec
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
                    // InternalComponentModel.g:817:2: ( ruleSystemPortDec )
                    {
                    // InternalComponentModel.g:817:2: ( ruleSystemPortDec )
                    // InternalComponentModel.g:818:3: ruleSystemPortDec
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
    // InternalComponentModel.g:827:1: rule__SystemPortDec__Alternatives : ( ( ruleSystemPortIn ) | ( ruleSystemPortOut ) );
    public final void rule__SystemPortDec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:831:1: ( ( ruleSystemPortIn ) | ( ruleSystemPortOut ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==12) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==23) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==24) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
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
                    // InternalComponentModel.g:832:2: ( ruleSystemPortIn )
                    {
                    // InternalComponentModel.g:832:2: ( ruleSystemPortIn )
                    // InternalComponentModel.g:833:3: ruleSystemPortIn
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
                    // InternalComponentModel.g:838:2: ( ruleSystemPortOut )
                    {
                    // InternalComponentModel.g:838:2: ( ruleSystemPortOut )
                    // InternalComponentModel.g:839:3: ruleSystemPortOut
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


    // $ANTLR start "rule__AbstractComponentFeatures__Alternatives"
    // InternalComponentModel.g:848:1: rule__AbstractComponentFeatures__Alternatives : ( ( rulePort ) | ( ruleEModelDec ) );
    public final void rule__AbstractComponentFeatures__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:852:1: ( ( rulePort ) | ( ruleEModelDec ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentModel.g:853:2: ( rulePort )
                    {
                    // InternalComponentModel.g:853:2: ( rulePort )
                    // InternalComponentModel.g:854:3: rulePort
                    {
                     before(grammarAccess.getAbstractComponentFeaturesAccess().getPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentFeaturesAccess().getPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:859:2: ( ruleEModelDec )
                    {
                    // InternalComponentModel.g:859:2: ( ruleEModelDec )
                    // InternalComponentModel.g:860:3: ruleEModelDec
                    {
                     before(grammarAccess.getAbstractComponentFeaturesAccess().getEModelDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEModelDec();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentFeaturesAccess().getEModelDecParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractComponentFeatures__Alternatives"


    // $ANTLR start "rule__Port__Alternatives"
    // InternalComponentModel.g:869:1: rule__Port__Alternatives : ( ( ruleInPort ) | ( ruleOutPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:873:1: ( ( ruleInPort ) | ( ruleOutPort ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==28) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==23) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==24) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentModel.g:874:2: ( ruleInPort )
                    {
                    // InternalComponentModel.g:874:2: ( ruleInPort )
                    // InternalComponentModel.g:875:3: ruleInPort
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
                    // InternalComponentModel.g:880:2: ( ruleOutPort )
                    {
                    // InternalComponentModel.g:880:2: ( ruleOutPort )
                    // InternalComponentModel.g:881:3: ruleOutPort
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


    // $ANTLR start "rule__EModelElement__Alternatives"
    // InternalComponentModel.g:890:1: rule__EModelElement__Alternatives : ( ( ruleStateDec ) | ( ruleTransitionDec ) | ( rulePort ) );
    public final void rule__EModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:894:1: ( ( ruleStateDec ) | ( ruleTransitionDec ) | ( rulePort ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 12:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalComponentModel.g:895:2: ( ruleStateDec )
                    {
                    // InternalComponentModel.g:895:2: ( ruleStateDec )
                    // InternalComponentModel.g:896:3: ruleStateDec
                    {
                     before(grammarAccess.getEModelElementAccess().getStateDecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStateDec();

                    state._fsp--;

                     after(grammarAccess.getEModelElementAccess().getStateDecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:901:2: ( ruleTransitionDec )
                    {
                    // InternalComponentModel.g:901:2: ( ruleTransitionDec )
                    // InternalComponentModel.g:902:3: ruleTransitionDec
                    {
                     before(grammarAccess.getEModelElementAccess().getTransitionDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransitionDec();

                    state._fsp--;

                     after(grammarAccess.getEModelElementAccess().getTransitionDecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:907:2: ( rulePort )
                    {
                    // InternalComponentModel.g:907:2: ( rulePort )
                    // InternalComponentModel.g:908:3: rulePort
                    {
                     before(grammarAccess.getEModelElementAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getEModelElementAccess().getPortParserRuleCall_2()); 

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
    // $ANTLR end "rule__EModelElement__Alternatives"


    // $ANTLR start "rule__TransitionFeatureDec__Alternatives"
    // InternalComponentModel.g:917:1: rule__TransitionFeatureDec__Alternatives : ( ( ruleTransitionState ) | ( ruleTriggerDec ) | ( ruleActionDec ) | ( ( rule__TransitionFeatureDec__Group_3__0 ) ) );
    public final void rule__TransitionFeatureDec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:921:1: ( ( ruleTransitionState ) | ( ruleTriggerDec ) | ( ruleActionDec ) | ( ( rule__TransitionFeatureDec__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalComponentModel.g:922:2: ( ruleTransitionState )
                    {
                    // InternalComponentModel.g:922:2: ( ruleTransitionState )
                    // InternalComponentModel.g:923:3: ruleTransitionState
                    {
                     before(grammarAccess.getTransitionFeatureDecAccess().getTransitionStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTransitionState();

                    state._fsp--;

                     after(grammarAccess.getTransitionFeatureDecAccess().getTransitionStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentModel.g:928:2: ( ruleTriggerDec )
                    {
                    // InternalComponentModel.g:928:2: ( ruleTriggerDec )
                    // InternalComponentModel.g:929:3: ruleTriggerDec
                    {
                     before(grammarAccess.getTransitionFeatureDecAccess().getTriggerDecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTriggerDec();

                    state._fsp--;

                     after(grammarAccess.getTransitionFeatureDecAccess().getTriggerDecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentModel.g:934:2: ( ruleActionDec )
                    {
                    // InternalComponentModel.g:934:2: ( ruleActionDec )
                    // InternalComponentModel.g:935:3: ruleActionDec
                    {
                     before(grammarAccess.getTransitionFeatureDecAccess().getActionDecParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleActionDec();

                    state._fsp--;

                     after(grammarAccess.getTransitionFeatureDecAccess().getActionDecParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentModel.g:940:2: ( ( rule__TransitionFeatureDec__Group_3__0 ) )
                    {
                    // InternalComponentModel.g:940:2: ( ( rule__TransitionFeatureDec__Group_3__0 ) )
                    // InternalComponentModel.g:941:3: ( rule__TransitionFeatureDec__Group_3__0 )
                    {
                     before(grammarAccess.getTransitionFeatureDecAccess().getGroup_3()); 
                    // InternalComponentModel.g:942:3: ( rule__TransitionFeatureDec__Group_3__0 )
                    // InternalComponentModel.g:942:4: rule__TransitionFeatureDec__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionFeatureDec__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionFeatureDecAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TransitionFeatureDec__Alternatives"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalComponentModel.g:950:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:954:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalComponentModel.g:955:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalComponentModel.g:962:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:966:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:967:1: ( RULE_ID )
            {
            // InternalComponentModel.g:967:1: ( RULE_ID )
            // InternalComponentModel.g:968:2: RULE_ID
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
    // InternalComponentModel.g:977:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:981:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalComponentModel.g:982:2: rule__QualifiedName__Group__1__Impl
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
    // InternalComponentModel.g:988:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:992:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalComponentModel.g:993:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalComponentModel.g:993:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalComponentModel.g:994:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalComponentModel.g:995:2: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentModel.g:995:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalComponentModel.g:1004:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1008:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalComponentModel.g:1009:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1016:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1020:1: ( ( '.' ) )
            // InternalComponentModel.g:1021:1: ( '.' )
            {
            // InternalComponentModel.g:1021:1: ( '.' )
            // InternalComponentModel.g:1022:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalComponentModel.g:1031:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1035:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalComponentModel.g:1036:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalComponentModel.g:1042:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1046:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:1047:1: ( RULE_ID )
            {
            // InternalComponentModel.g:1047:1: ( RULE_ID )
            // InternalComponentModel.g:1048:2: RULE_ID
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


    // $ANTLR start "rule__PortType__Group__0"
    // InternalComponentModel.g:1058:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1062:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // InternalComponentModel.g:1063:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentModel.g:1070:1: rule__PortType__Group__0__Impl : ( 'port' ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1074:1: ( ( 'port' ) )
            // InternalComponentModel.g:1075:1: ( 'port' )
            {
            // InternalComponentModel.g:1075:1: ( 'port' )
            // InternalComponentModel.g:1076:2: 'port'
            {
             before(grammarAccess.getPortTypeAccess().getPortKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getPortKeyword_0()); 

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
    // InternalComponentModel.g:1085:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1089:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // InternalComponentModel.g:1090:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1097:1: rule__PortType__Group__1__Impl : ( 'type' ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1101:1: ( ( 'type' ) )
            // InternalComponentModel.g:1102:1: ( 'type' )
            {
            // InternalComponentModel.g:1102:1: ( 'type' )
            // InternalComponentModel.g:1103:2: 'type'
            {
             before(grammarAccess.getPortTypeAccess().getTypeKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getTypeKeyword_1()); 

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
    // InternalComponentModel.g:1112:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1116:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // InternalComponentModel.g:1117:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentModel.g:1124:1: rule__PortType__Group__2__Impl : ( ( rule__PortType__NameAssignment_2 ) ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1128:1: ( ( ( rule__PortType__NameAssignment_2 ) ) )
            // InternalComponentModel.g:1129:1: ( ( rule__PortType__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:1129:1: ( ( rule__PortType__NameAssignment_2 ) )
            // InternalComponentModel.g:1130:2: ( rule__PortType__NameAssignment_2 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:1131:2: ( rule__PortType__NameAssignment_2 )
            // InternalComponentModel.g:1131:3: rule__PortType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PortType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getNameAssignment_2()); 

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
    // InternalComponentModel.g:1139:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl rule__PortType__Group__4 ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1143:1: ( rule__PortType__Group__3__Impl rule__PortType__Group__4 )
            // InternalComponentModel.g:1144:2: rule__PortType__Group__3__Impl rule__PortType__Group__4
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
    // InternalComponentModel.g:1151:1: rule__PortType__Group__3__Impl : ( '{' ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1155:1: ( ( '{' ) )
            // InternalComponentModel.g:1156:1: ( '{' )
            {
            // InternalComponentModel.g:1156:1: ( '{' )
            // InternalComponentModel.g:1157:2: '{'
            {
             before(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalComponentModel.g:1166:1: rule__PortType__Group__4 : rule__PortType__Group__4__Impl rule__PortType__Group__5 ;
    public final void rule__PortType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1170:1: ( rule__PortType__Group__4__Impl rule__PortType__Group__5 )
            // InternalComponentModel.g:1171:2: rule__PortType__Group__4__Impl rule__PortType__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentModel.g:1178:1: rule__PortType__Group__4__Impl : ( ( rule__PortType__EModesAssignment_4 )* ) ;
    public final void rule__PortType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1182:1: ( ( ( rule__PortType__EModesAssignment_4 )* ) )
            // InternalComponentModel.g:1183:1: ( ( rule__PortType__EModesAssignment_4 )* )
            {
            // InternalComponentModel.g:1183:1: ( ( rule__PortType__EModesAssignment_4 )* )
            // InternalComponentModel.g:1184:2: ( rule__PortType__EModesAssignment_4 )*
            {
             before(grammarAccess.getPortTypeAccess().getEModesAssignment_4()); 
            // InternalComponentModel.g:1185:2: ( rule__PortType__EModesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentModel.g:1185:3: rule__PortType__EModesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PortType__EModesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPortTypeAccess().getEModesAssignment_4()); 

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
    // InternalComponentModel.g:1193:1: rule__PortType__Group__5 : rule__PortType__Group__5__Impl ;
    public final void rule__PortType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1197:1: ( rule__PortType__Group__5__Impl )
            // InternalComponentModel.g:1198:2: rule__PortType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PortType__Group__5__Impl();

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
    // InternalComponentModel.g:1204:1: rule__PortType__Group__5__Impl : ( '}' ) ;
    public final void rule__PortType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1208:1: ( ( '}' ) )
            // InternalComponentModel.g:1209:1: ( '}' )
            {
            // InternalComponentModel.g:1209:1: ( '}' )
            // InternalComponentModel.g:1210:2: '}'
            {
             before(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__ErrorModes__Group__0"
    // InternalComponentModel.g:1220:1: rule__ErrorModes__Group__0 : rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1 ;
    public final void rule__ErrorModes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1224:1: ( rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1 )
            // InternalComponentModel.g:1225:2: rule__ErrorModes__Group__0__Impl rule__ErrorModes__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentModel.g:1232:1: rule__ErrorModes__Group__0__Impl : ( 'error' ) ;
    public final void rule__ErrorModes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1236:1: ( ( 'error' ) )
            // InternalComponentModel.g:1237:1: ( 'error' )
            {
            // InternalComponentModel.g:1237:1: ( 'error' )
            // InternalComponentModel.g:1238:2: 'error'
            {
             before(grammarAccess.getErrorModesAccess().getErrorKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getErrorModesAccess().getErrorKeyword_0()); 

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
    // InternalComponentModel.g:1247:1: rule__ErrorModes__Group__1 : rule__ErrorModes__Group__1__Impl rule__ErrorModes__Group__2 ;
    public final void rule__ErrorModes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1251:1: ( rule__ErrorModes__Group__1__Impl rule__ErrorModes__Group__2 )
            // InternalComponentModel.g:1252:2: rule__ErrorModes__Group__1__Impl rule__ErrorModes__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ErrorModes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorModes__Group__2();

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
    // InternalComponentModel.g:1259:1: rule__ErrorModes__Group__1__Impl : ( 'mode' ) ;
    public final void rule__ErrorModes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1263:1: ( ( 'mode' ) )
            // InternalComponentModel.g:1264:1: ( 'mode' )
            {
            // InternalComponentModel.g:1264:1: ( 'mode' )
            // InternalComponentModel.g:1265:2: 'mode'
            {
             before(grammarAccess.getErrorModesAccess().getModeKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getErrorModesAccess().getModeKeyword_1()); 

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


    // $ANTLR start "rule__ErrorModes__Group__2"
    // InternalComponentModel.g:1274:1: rule__ErrorModes__Group__2 : rule__ErrorModes__Group__2__Impl ;
    public final void rule__ErrorModes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1278:1: ( rule__ErrorModes__Group__2__Impl )
            // InternalComponentModel.g:1279:2: rule__ErrorModes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorModes__Group__2__Impl();

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
    // $ANTLR end "rule__ErrorModes__Group__2"


    // $ANTLR start "rule__ErrorModes__Group__2__Impl"
    // InternalComponentModel.g:1285:1: rule__ErrorModes__Group__2__Impl : ( ( rule__ErrorModes__NameAssignment_2 ) ) ;
    public final void rule__ErrorModes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1289:1: ( ( ( rule__ErrorModes__NameAssignment_2 ) ) )
            // InternalComponentModel.g:1290:1: ( ( rule__ErrorModes__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:1290:1: ( ( rule__ErrorModes__NameAssignment_2 ) )
            // InternalComponentModel.g:1291:2: ( rule__ErrorModes__NameAssignment_2 )
            {
             before(grammarAccess.getErrorModesAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:1292:2: ( rule__ErrorModes__NameAssignment_2 )
            // InternalComponentModel.g:1292:3: rule__ErrorModes__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ErrorModes__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getErrorModesAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ErrorModes__Group__2__Impl"


    // $ANTLR start "rule__SystemConnDec__Group__0"
    // InternalComponentModel.g:1301:1: rule__SystemConnDec__Group__0 : rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1 ;
    public final void rule__SystemConnDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1305:1: ( rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1 )
            // InternalComponentModel.g:1306:2: rule__SystemConnDec__Group__0__Impl rule__SystemConnDec__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentModel.g:1313:1: rule__SystemConnDec__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemConnDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1317:1: ( ( 'system' ) )
            // InternalComponentModel.g:1318:1: ( 'system' )
            {
            // InternalComponentModel.g:1318:1: ( 'system' )
            // InternalComponentModel.g:1319:2: 'system'
            {
             before(grammarAccess.getSystemConnDecAccess().getSystemKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getSystemKeyword_0()); 

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
    // InternalComponentModel.g:1328:1: rule__SystemConnDec__Group__1 : rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2 ;
    public final void rule__SystemConnDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1332:1: ( rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2 )
            // InternalComponentModel.g:1333:2: rule__SystemConnDec__Group__1__Impl rule__SystemConnDec__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1340:1: rule__SystemConnDec__Group__1__Impl : ( 'connection' ) ;
    public final void rule__SystemConnDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1344:1: ( ( 'connection' ) )
            // InternalComponentModel.g:1345:1: ( 'connection' )
            {
            // InternalComponentModel.g:1345:1: ( 'connection' )
            // InternalComponentModel.g:1346:2: 'connection'
            {
             before(grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1()); 

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
    // InternalComponentModel.g:1355:1: rule__SystemConnDec__Group__2 : rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3 ;
    public final void rule__SystemConnDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1359:1: ( rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3 )
            // InternalComponentModel.g:1360:2: rule__SystemConnDec__Group__2__Impl rule__SystemConnDec__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentModel.g:1367:1: rule__SystemConnDec__Group__2__Impl : ( ( rule__SystemConnDec__NameAssignment_2 ) ) ;
    public final void rule__SystemConnDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1371:1: ( ( ( rule__SystemConnDec__NameAssignment_2 ) ) )
            // InternalComponentModel.g:1372:1: ( ( rule__SystemConnDec__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:1372:1: ( ( rule__SystemConnDec__NameAssignment_2 ) )
            // InternalComponentModel.g:1373:2: ( rule__SystemConnDec__NameAssignment_2 )
            {
             before(grammarAccess.getSystemConnDecAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:1374:2: ( rule__SystemConnDec__NameAssignment_2 )
            // InternalComponentModel.g:1374:3: rule__SystemConnDec__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getNameAssignment_2()); 

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
    // InternalComponentModel.g:1382:1: rule__SystemConnDec__Group__3 : rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4 ;
    public final void rule__SystemConnDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1386:1: ( rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4 )
            // InternalComponentModel.g:1387:2: rule__SystemConnDec__Group__3__Impl rule__SystemConnDec__Group__4
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
    // InternalComponentModel.g:1394:1: rule__SystemConnDec__Group__3__Impl : ( 'from' ) ;
    public final void rule__SystemConnDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1398:1: ( ( 'from' ) )
            // InternalComponentModel.g:1399:1: ( 'from' )
            {
            // InternalComponentModel.g:1399:1: ( 'from' )
            // InternalComponentModel.g:1400:2: 'from'
            {
             before(grammarAccess.getSystemConnDecAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getFromKeyword_3()); 

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
    // InternalComponentModel.g:1409:1: rule__SystemConnDec__Group__4 : rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5 ;
    public final void rule__SystemConnDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1413:1: ( rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5 )
            // InternalComponentModel.g:1414:2: rule__SystemConnDec__Group__4__Impl rule__SystemConnDec__Group__5
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
    // InternalComponentModel.g:1421:1: rule__SystemConnDec__Group__4__Impl : ( ( rule__SystemConnDec__SourceSystemAssignment_4 ) ) ;
    public final void rule__SystemConnDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1425:1: ( ( ( rule__SystemConnDec__SourceSystemAssignment_4 ) ) )
            // InternalComponentModel.g:1426:1: ( ( rule__SystemConnDec__SourceSystemAssignment_4 ) )
            {
            // InternalComponentModel.g:1426:1: ( ( rule__SystemConnDec__SourceSystemAssignment_4 ) )
            // InternalComponentModel.g:1427:2: ( rule__SystemConnDec__SourceSystemAssignment_4 )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemAssignment_4()); 
            // InternalComponentModel.g:1428:2: ( rule__SystemConnDec__SourceSystemAssignment_4 )
            // InternalComponentModel.g:1428:3: rule__SystemConnDec__SourceSystemAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__SourceSystemAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getSourceSystemAssignment_4()); 

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
    // InternalComponentModel.g:1436:1: rule__SystemConnDec__Group__5 : rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6 ;
    public final void rule__SystemConnDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1440:1: ( rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6 )
            // InternalComponentModel.g:1441:2: rule__SystemConnDec__Group__5__Impl rule__SystemConnDec__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1448:1: rule__SystemConnDec__Group__5__Impl : ( '.' ) ;
    public final void rule__SystemConnDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1452:1: ( ( '.' ) )
            // InternalComponentModel.g:1453:1: ( '.' )
            {
            // InternalComponentModel.g:1453:1: ( '.' )
            // InternalComponentModel.g:1454:2: '.'
            {
             before(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5()); 

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
    // InternalComponentModel.g:1463:1: rule__SystemConnDec__Group__6 : rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7 ;
    public final void rule__SystemConnDec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1467:1: ( rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7 )
            // InternalComponentModel.g:1468:2: rule__SystemConnDec__Group__6__Impl rule__SystemConnDec__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentModel.g:1475:1: rule__SystemConnDec__Group__6__Impl : ( ( rule__SystemConnDec__SourcePortAssignment_6 ) ) ;
    public final void rule__SystemConnDec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1479:1: ( ( ( rule__SystemConnDec__SourcePortAssignment_6 ) ) )
            // InternalComponentModel.g:1480:1: ( ( rule__SystemConnDec__SourcePortAssignment_6 ) )
            {
            // InternalComponentModel.g:1480:1: ( ( rule__SystemConnDec__SourcePortAssignment_6 ) )
            // InternalComponentModel.g:1481:2: ( rule__SystemConnDec__SourcePortAssignment_6 )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortAssignment_6()); 
            // InternalComponentModel.g:1482:2: ( rule__SystemConnDec__SourcePortAssignment_6 )
            // InternalComponentModel.g:1482:3: rule__SystemConnDec__SourcePortAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__SourcePortAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getSourcePortAssignment_6()); 

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
    // InternalComponentModel.g:1490:1: rule__SystemConnDec__Group__7 : rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8 ;
    public final void rule__SystemConnDec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1494:1: ( rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8 )
            // InternalComponentModel.g:1495:2: rule__SystemConnDec__Group__7__Impl rule__SystemConnDec__Group__8
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
    // InternalComponentModel.g:1502:1: rule__SystemConnDec__Group__7__Impl : ( 'to' ) ;
    public final void rule__SystemConnDec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1506:1: ( ( 'to' ) )
            // InternalComponentModel.g:1507:1: ( 'to' )
            {
            // InternalComponentModel.g:1507:1: ( 'to' )
            // InternalComponentModel.g:1508:2: 'to'
            {
             before(grammarAccess.getSystemConnDecAccess().getToKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getToKeyword_7()); 

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
    // InternalComponentModel.g:1517:1: rule__SystemConnDec__Group__8 : rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9 ;
    public final void rule__SystemConnDec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1521:1: ( rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9 )
            // InternalComponentModel.g:1522:2: rule__SystemConnDec__Group__8__Impl rule__SystemConnDec__Group__9
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
    // InternalComponentModel.g:1529:1: rule__SystemConnDec__Group__8__Impl : ( ( rule__SystemConnDec__TargetSystemAssignment_8 ) ) ;
    public final void rule__SystemConnDec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1533:1: ( ( ( rule__SystemConnDec__TargetSystemAssignment_8 ) ) )
            // InternalComponentModel.g:1534:1: ( ( rule__SystemConnDec__TargetSystemAssignment_8 ) )
            {
            // InternalComponentModel.g:1534:1: ( ( rule__SystemConnDec__TargetSystemAssignment_8 ) )
            // InternalComponentModel.g:1535:2: ( rule__SystemConnDec__TargetSystemAssignment_8 )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemAssignment_8()); 
            // InternalComponentModel.g:1536:2: ( rule__SystemConnDec__TargetSystemAssignment_8 )
            // InternalComponentModel.g:1536:3: rule__SystemConnDec__TargetSystemAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__TargetSystemAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getTargetSystemAssignment_8()); 

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
    // InternalComponentModel.g:1544:1: rule__SystemConnDec__Group__9 : rule__SystemConnDec__Group__9__Impl rule__SystemConnDec__Group__10 ;
    public final void rule__SystemConnDec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1548:1: ( rule__SystemConnDec__Group__9__Impl rule__SystemConnDec__Group__10 )
            // InternalComponentModel.g:1549:2: rule__SystemConnDec__Group__9__Impl rule__SystemConnDec__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__SystemConnDec__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__10();

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
    // InternalComponentModel.g:1556:1: rule__SystemConnDec__Group__9__Impl : ( '.' ) ;
    public final void rule__SystemConnDec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1560:1: ( ( '.' ) )
            // InternalComponentModel.g:1561:1: ( '.' )
            {
            // InternalComponentModel.g:1561:1: ( '.' )
            // InternalComponentModel.g:1562:2: '.'
            {
             before(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9()); 

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


    // $ANTLR start "rule__SystemConnDec__Group__10"
    // InternalComponentModel.g:1571:1: rule__SystemConnDec__Group__10 : rule__SystemConnDec__Group__10__Impl ;
    public final void rule__SystemConnDec__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1575:1: ( rule__SystemConnDec__Group__10__Impl )
            // InternalComponentModel.g:1576:2: rule__SystemConnDec__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__Group__10__Impl();

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
    // $ANTLR end "rule__SystemConnDec__Group__10"


    // $ANTLR start "rule__SystemConnDec__Group__10__Impl"
    // InternalComponentModel.g:1582:1: rule__SystemConnDec__Group__10__Impl : ( ( rule__SystemConnDec__TargetPortAssignment_10 ) ) ;
    public final void rule__SystemConnDec__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1586:1: ( ( ( rule__SystemConnDec__TargetPortAssignment_10 ) ) )
            // InternalComponentModel.g:1587:1: ( ( rule__SystemConnDec__TargetPortAssignment_10 ) )
            {
            // InternalComponentModel.g:1587:1: ( ( rule__SystemConnDec__TargetPortAssignment_10 ) )
            // InternalComponentModel.g:1588:2: ( rule__SystemConnDec__TargetPortAssignment_10 )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortAssignment_10()); 
            // InternalComponentModel.g:1589:2: ( rule__SystemConnDec__TargetPortAssignment_10 )
            // InternalComponentModel.g:1589:3: rule__SystemConnDec__TargetPortAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SystemConnDec__TargetPortAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSystemConnDecAccess().getTargetPortAssignment_10()); 

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
    // $ANTLR end "rule__SystemConnDec__Group__10__Impl"


    // $ANTLR start "rule__SystemDec__Group__0"
    // InternalComponentModel.g:1598:1: rule__SystemDec__Group__0 : rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1 ;
    public final void rule__SystemDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1602:1: ( rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1 )
            // InternalComponentModel.g:1603:2: rule__SystemDec__Group__0__Impl rule__SystemDec__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentModel.g:1610:1: rule__SystemDec__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1614:1: ( ( 'system' ) )
            // InternalComponentModel.g:1615:1: ( 'system' )
            {
            // InternalComponentModel.g:1615:1: ( 'system' )
            // InternalComponentModel.g:1616:2: 'system'
            {
             before(grammarAccess.getSystemDecAccess().getSystemKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getSystemKeyword_0()); 

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
    // InternalComponentModel.g:1625:1: rule__SystemDec__Group__1 : rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2 ;
    public final void rule__SystemDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1629:1: ( rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2 )
            // InternalComponentModel.g:1630:2: rule__SystemDec__Group__1__Impl rule__SystemDec__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1637:1: rule__SystemDec__Group__1__Impl : ( 'declaration' ) ;
    public final void rule__SystemDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1641:1: ( ( 'declaration' ) )
            // InternalComponentModel.g:1642:1: ( 'declaration' )
            {
            // InternalComponentModel.g:1642:1: ( 'declaration' )
            // InternalComponentModel.g:1643:2: 'declaration'
            {
             before(grammarAccess.getSystemDecAccess().getDeclarationKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getDeclarationKeyword_1()); 

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
    // InternalComponentModel.g:1652:1: rule__SystemDec__Group__2 : rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3 ;
    public final void rule__SystemDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1656:1: ( rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3 )
            // InternalComponentModel.g:1657:2: rule__SystemDec__Group__2__Impl rule__SystemDec__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentModel.g:1664:1: rule__SystemDec__Group__2__Impl : ( ( rule__SystemDec__NameAssignment_2 ) ) ;
    public final void rule__SystemDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1668:1: ( ( ( rule__SystemDec__NameAssignment_2 ) ) )
            // InternalComponentModel.g:1669:1: ( ( rule__SystemDec__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:1669:1: ( ( rule__SystemDec__NameAssignment_2 ) )
            // InternalComponentModel.g:1670:2: ( rule__SystemDec__NameAssignment_2 )
            {
             before(grammarAccess.getSystemDecAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:1671:2: ( rule__SystemDec__NameAssignment_2 )
            // InternalComponentModel.g:1671:3: rule__SystemDec__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemDec__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemDecAccess().getNameAssignment_2()); 

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
    // InternalComponentModel.g:1679:1: rule__SystemDec__Group__3 : rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4 ;
    public final void rule__SystemDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1683:1: ( rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4 )
            // InternalComponentModel.g:1684:2: rule__SystemDec__Group__3__Impl rule__SystemDec__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalComponentModel.g:1691:1: rule__SystemDec__Group__3__Impl : ( '{' ) ;
    public final void rule__SystemDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1695:1: ( ( '{' ) )
            // InternalComponentModel.g:1696:1: ( '{' )
            {
            // InternalComponentModel.g:1696:1: ( '{' )
            // InternalComponentModel.g:1697:2: '{'
            {
             before(grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalComponentModel.g:1706:1: rule__SystemDec__Group__4 : rule__SystemDec__Group__4__Impl rule__SystemDec__Group__5 ;
    public final void rule__SystemDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1710:1: ( rule__SystemDec__Group__4__Impl rule__SystemDec__Group__5 )
            // InternalComponentModel.g:1711:2: rule__SystemDec__Group__4__Impl rule__SystemDec__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__SystemDec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__5();

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
    // InternalComponentModel.g:1718:1: rule__SystemDec__Group__4__Impl : ( ( rule__SystemDec__SysFeaturesAssignment_4 )* ) ;
    public final void rule__SystemDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1722:1: ( ( ( rule__SystemDec__SysFeaturesAssignment_4 )* ) )
            // InternalComponentModel.g:1723:1: ( ( rule__SystemDec__SysFeaturesAssignment_4 )* )
            {
            // InternalComponentModel.g:1723:1: ( ( rule__SystemDec__SysFeaturesAssignment_4 )* )
            // InternalComponentModel.g:1724:2: ( rule__SystemDec__SysFeaturesAssignment_4 )*
            {
             before(grammarAccess.getSystemDecAccess().getSysFeaturesAssignment_4()); 
            // InternalComponentModel.g:1725:2: ( rule__SystemDec__SysFeaturesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentModel.g:1725:3: rule__SystemDec__SysFeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SystemDec__SysFeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSystemDecAccess().getSysFeaturesAssignment_4()); 

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


    // $ANTLR start "rule__SystemDec__Group__5"
    // InternalComponentModel.g:1733:1: rule__SystemDec__Group__5 : rule__SystemDec__Group__5__Impl ;
    public final void rule__SystemDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1737:1: ( rule__SystemDec__Group__5__Impl )
            // InternalComponentModel.g:1738:2: rule__SystemDec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDec__Group__5__Impl();

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
    // $ANTLR end "rule__SystemDec__Group__5"


    // $ANTLR start "rule__SystemDec__Group__5__Impl"
    // InternalComponentModel.g:1744:1: rule__SystemDec__Group__5__Impl : ( '}' ) ;
    public final void rule__SystemDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1748:1: ( ( '}' ) )
            // InternalComponentModel.g:1749:1: ( '}' )
            {
            // InternalComponentModel.g:1749:1: ( '}' )
            // InternalComponentModel.g:1750:2: '}'
            {
             before(grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SystemDec__Group__5__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__0"
    // InternalComponentModel.g:1760:1: rule__SystemPortIn__Group__0 : rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1 ;
    public final void rule__SystemPortIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1764:1: ( rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1 )
            // InternalComponentModel.g:1765:2: rule__SystemPortIn__Group__0__Impl rule__SystemPortIn__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentModel.g:1772:1: rule__SystemPortIn__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemPortIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1776:1: ( ( 'system' ) )
            // InternalComponentModel.g:1777:1: ( 'system' )
            {
            // InternalComponentModel.g:1777:1: ( 'system' )
            // InternalComponentModel.g:1778:2: 'system'
            {
             before(grammarAccess.getSystemPortInAccess().getSystemKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getSystemKeyword_0()); 

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
    // InternalComponentModel.g:1787:1: rule__SystemPortIn__Group__1 : rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2 ;
    public final void rule__SystemPortIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1791:1: ( rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2 )
            // InternalComponentModel.g:1792:2: rule__SystemPortIn__Group__1__Impl rule__SystemPortIn__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentModel.g:1799:1: rule__SystemPortIn__Group__1__Impl : ( 'port' ) ;
    public final void rule__SystemPortIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1803:1: ( ( 'port' ) )
            // InternalComponentModel.g:1804:1: ( 'port' )
            {
            // InternalComponentModel.g:1804:1: ( 'port' )
            // InternalComponentModel.g:1805:2: 'port'
            {
             before(grammarAccess.getSystemPortInAccess().getPortKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getPortKeyword_1()); 

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
    // InternalComponentModel.g:1814:1: rule__SystemPortIn__Group__2 : rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3 ;
    public final void rule__SystemPortIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1818:1: ( rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3 )
            // InternalComponentModel.g:1819:2: rule__SystemPortIn__Group__2__Impl rule__SystemPortIn__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1826:1: rule__SystemPortIn__Group__2__Impl : ( 'in' ) ;
    public final void rule__SystemPortIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1830:1: ( ( 'in' ) )
            // InternalComponentModel.g:1831:1: ( 'in' )
            {
            // InternalComponentModel.g:1831:1: ( 'in' )
            // InternalComponentModel.g:1832:2: 'in'
            {
             before(grammarAccess.getSystemPortInAccess().getInKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getInKeyword_2()); 

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
    // InternalComponentModel.g:1841:1: rule__SystemPortIn__Group__3 : rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4 ;
    public final void rule__SystemPortIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1845:1: ( rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4 )
            // InternalComponentModel.g:1846:2: rule__SystemPortIn__Group__3__Impl rule__SystemPortIn__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentModel.g:1853:1: rule__SystemPortIn__Group__3__Impl : ( ( rule__SystemPortIn__NameAssignment_3 ) ) ;
    public final void rule__SystemPortIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1857:1: ( ( ( rule__SystemPortIn__NameAssignment_3 ) ) )
            // InternalComponentModel.g:1858:1: ( ( rule__SystemPortIn__NameAssignment_3 ) )
            {
            // InternalComponentModel.g:1858:1: ( ( rule__SystemPortIn__NameAssignment_3 ) )
            // InternalComponentModel.g:1859:2: ( rule__SystemPortIn__NameAssignment_3 )
            {
             before(grammarAccess.getSystemPortInAccess().getNameAssignment_3()); 
            // InternalComponentModel.g:1860:2: ( rule__SystemPortIn__NameAssignment_3 )
            // InternalComponentModel.g:1860:3: rule__SystemPortIn__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getNameAssignment_3()); 

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
    // InternalComponentModel.g:1868:1: rule__SystemPortIn__Group__4 : rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5 ;
    public final void rule__SystemPortIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1872:1: ( rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5 )
            // InternalComponentModel.g:1873:2: rule__SystemPortIn__Group__4__Impl rule__SystemPortIn__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:1880:1: rule__SystemPortIn__Group__4__Impl : ( 'to' ) ;
    public final void rule__SystemPortIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1884:1: ( ( 'to' ) )
            // InternalComponentModel.g:1885:1: ( 'to' )
            {
            // InternalComponentModel.g:1885:1: ( 'to' )
            // InternalComponentModel.g:1886:2: 'to'
            {
             before(grammarAccess.getSystemPortInAccess().getToKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getToKeyword_4()); 

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
    // InternalComponentModel.g:1895:1: rule__SystemPortIn__Group__5 : rule__SystemPortIn__Group__5__Impl rule__SystemPortIn__Group__6 ;
    public final void rule__SystemPortIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1899:1: ( rule__SystemPortIn__Group__5__Impl rule__SystemPortIn__Group__6 )
            // InternalComponentModel.g:1900:2: rule__SystemPortIn__Group__5__Impl rule__SystemPortIn__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortIn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__6();

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
    // InternalComponentModel.g:1907:1: rule__SystemPortIn__Group__5__Impl : ( ( rule__SystemPortIn__InCompAssignment_5 ) ) ;
    public final void rule__SystemPortIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1911:1: ( ( ( rule__SystemPortIn__InCompAssignment_5 ) ) )
            // InternalComponentModel.g:1912:1: ( ( rule__SystemPortIn__InCompAssignment_5 ) )
            {
            // InternalComponentModel.g:1912:1: ( ( rule__SystemPortIn__InCompAssignment_5 ) )
            // InternalComponentModel.g:1913:2: ( rule__SystemPortIn__InCompAssignment_5 )
            {
             before(grammarAccess.getSystemPortInAccess().getInCompAssignment_5()); 
            // InternalComponentModel.g:1914:2: ( rule__SystemPortIn__InCompAssignment_5 )
            // InternalComponentModel.g:1914:3: rule__SystemPortIn__InCompAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__InCompAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getInCompAssignment_5()); 

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


    // $ANTLR start "rule__SystemPortIn__Group__6"
    // InternalComponentModel.g:1922:1: rule__SystemPortIn__Group__6 : rule__SystemPortIn__Group__6__Impl rule__SystemPortIn__Group__7 ;
    public final void rule__SystemPortIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1926:1: ( rule__SystemPortIn__Group__6__Impl rule__SystemPortIn__Group__7 )
            // InternalComponentModel.g:1927:2: rule__SystemPortIn__Group__6__Impl rule__SystemPortIn__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SystemPortIn__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__7();

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
    // $ANTLR end "rule__SystemPortIn__Group__6"


    // $ANTLR start "rule__SystemPortIn__Group__6__Impl"
    // InternalComponentModel.g:1934:1: rule__SystemPortIn__Group__6__Impl : ( '.' ) ;
    public final void rule__SystemPortIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1938:1: ( ( '.' ) )
            // InternalComponentModel.g:1939:1: ( '.' )
            {
            // InternalComponentModel.g:1939:1: ( '.' )
            // InternalComponentModel.g:1940:2: '.'
            {
             before(grammarAccess.getSystemPortInAccess().getFullStopKeyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__SystemPortIn__Group__6__Impl"


    // $ANTLR start "rule__SystemPortIn__Group__7"
    // InternalComponentModel.g:1949:1: rule__SystemPortIn__Group__7 : rule__SystemPortIn__Group__7__Impl ;
    public final void rule__SystemPortIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1953:1: ( rule__SystemPortIn__Group__7__Impl )
            // InternalComponentModel.g:1954:2: rule__SystemPortIn__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__Group__7__Impl();

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
    // $ANTLR end "rule__SystemPortIn__Group__7"


    // $ANTLR start "rule__SystemPortIn__Group__7__Impl"
    // InternalComponentModel.g:1960:1: rule__SystemPortIn__Group__7__Impl : ( ( rule__SystemPortIn__InPortAssignment_7 ) ) ;
    public final void rule__SystemPortIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1964:1: ( ( ( rule__SystemPortIn__InPortAssignment_7 ) ) )
            // InternalComponentModel.g:1965:1: ( ( rule__SystemPortIn__InPortAssignment_7 ) )
            {
            // InternalComponentModel.g:1965:1: ( ( rule__SystemPortIn__InPortAssignment_7 ) )
            // InternalComponentModel.g:1966:2: ( rule__SystemPortIn__InPortAssignment_7 )
            {
             before(grammarAccess.getSystemPortInAccess().getInPortAssignment_7()); 
            // InternalComponentModel.g:1967:2: ( rule__SystemPortIn__InPortAssignment_7 )
            // InternalComponentModel.g:1967:3: rule__SystemPortIn__InPortAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortIn__InPortAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortInAccess().getInPortAssignment_7()); 

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
    // $ANTLR end "rule__SystemPortIn__Group__7__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__0"
    // InternalComponentModel.g:1976:1: rule__SystemPortOut__Group__0 : rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1 ;
    public final void rule__SystemPortOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1980:1: ( rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1 )
            // InternalComponentModel.g:1981:2: rule__SystemPortOut__Group__0__Impl rule__SystemPortOut__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentModel.g:1988:1: rule__SystemPortOut__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemPortOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:1992:1: ( ( 'system' ) )
            // InternalComponentModel.g:1993:1: ( 'system' )
            {
            // InternalComponentModel.g:1993:1: ( 'system' )
            // InternalComponentModel.g:1994:2: 'system'
            {
             before(grammarAccess.getSystemPortOutAccess().getSystemKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getSystemKeyword_0()); 

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
    // InternalComponentModel.g:2003:1: rule__SystemPortOut__Group__1 : rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2 ;
    public final void rule__SystemPortOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2007:1: ( rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2 )
            // InternalComponentModel.g:2008:2: rule__SystemPortOut__Group__1__Impl rule__SystemPortOut__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentModel.g:2015:1: rule__SystemPortOut__Group__1__Impl : ( 'port' ) ;
    public final void rule__SystemPortOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2019:1: ( ( 'port' ) )
            // InternalComponentModel.g:2020:1: ( 'port' )
            {
            // InternalComponentModel.g:2020:1: ( 'port' )
            // InternalComponentModel.g:2021:2: 'port'
            {
             before(grammarAccess.getSystemPortOutAccess().getPortKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getPortKeyword_1()); 

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
    // InternalComponentModel.g:2030:1: rule__SystemPortOut__Group__2 : rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3 ;
    public final void rule__SystemPortOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2034:1: ( rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3 )
            // InternalComponentModel.g:2035:2: rule__SystemPortOut__Group__2__Impl rule__SystemPortOut__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2042:1: rule__SystemPortOut__Group__2__Impl : ( 'out' ) ;
    public final void rule__SystemPortOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2046:1: ( ( 'out' ) )
            // InternalComponentModel.g:2047:1: ( 'out' )
            {
            // InternalComponentModel.g:2047:1: ( 'out' )
            // InternalComponentModel.g:2048:2: 'out'
            {
             before(grammarAccess.getSystemPortOutAccess().getOutKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getOutKeyword_2()); 

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
    // InternalComponentModel.g:2057:1: rule__SystemPortOut__Group__3 : rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4 ;
    public final void rule__SystemPortOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2061:1: ( rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4 )
            // InternalComponentModel.g:2062:2: rule__SystemPortOut__Group__3__Impl rule__SystemPortOut__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentModel.g:2069:1: rule__SystemPortOut__Group__3__Impl : ( ( rule__SystemPortOut__NameAssignment_3 ) ) ;
    public final void rule__SystemPortOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2073:1: ( ( ( rule__SystemPortOut__NameAssignment_3 ) ) )
            // InternalComponentModel.g:2074:1: ( ( rule__SystemPortOut__NameAssignment_3 ) )
            {
            // InternalComponentModel.g:2074:1: ( ( rule__SystemPortOut__NameAssignment_3 ) )
            // InternalComponentModel.g:2075:2: ( rule__SystemPortOut__NameAssignment_3 )
            {
             before(grammarAccess.getSystemPortOutAccess().getNameAssignment_3()); 
            // InternalComponentModel.g:2076:2: ( rule__SystemPortOut__NameAssignment_3 )
            // InternalComponentModel.g:2076:3: rule__SystemPortOut__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getNameAssignment_3()); 

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
    // InternalComponentModel.g:2084:1: rule__SystemPortOut__Group__4 : rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5 ;
    public final void rule__SystemPortOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2088:1: ( rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5 )
            // InternalComponentModel.g:2089:2: rule__SystemPortOut__Group__4__Impl rule__SystemPortOut__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2096:1: rule__SystemPortOut__Group__4__Impl : ( 'from' ) ;
    public final void rule__SystemPortOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2100:1: ( ( 'from' ) )
            // InternalComponentModel.g:2101:1: ( 'from' )
            {
            // InternalComponentModel.g:2101:1: ( 'from' )
            // InternalComponentModel.g:2102:2: 'from'
            {
             before(grammarAccess.getSystemPortOutAccess().getFromKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getFromKeyword_4()); 

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
    // InternalComponentModel.g:2111:1: rule__SystemPortOut__Group__5 : rule__SystemPortOut__Group__5__Impl rule__SystemPortOut__Group__6 ;
    public final void rule__SystemPortOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2115:1: ( rule__SystemPortOut__Group__5__Impl rule__SystemPortOut__Group__6 )
            // InternalComponentModel.g:2116:2: rule__SystemPortOut__Group__5__Impl rule__SystemPortOut__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__SystemPortOut__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__6();

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
    // InternalComponentModel.g:2123:1: rule__SystemPortOut__Group__5__Impl : ( ( rule__SystemPortOut__OutCompAssignment_5 ) ) ;
    public final void rule__SystemPortOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2127:1: ( ( ( rule__SystemPortOut__OutCompAssignment_5 ) ) )
            // InternalComponentModel.g:2128:1: ( ( rule__SystemPortOut__OutCompAssignment_5 ) )
            {
            // InternalComponentModel.g:2128:1: ( ( rule__SystemPortOut__OutCompAssignment_5 ) )
            // InternalComponentModel.g:2129:2: ( rule__SystemPortOut__OutCompAssignment_5 )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompAssignment_5()); 
            // InternalComponentModel.g:2130:2: ( rule__SystemPortOut__OutCompAssignment_5 )
            // InternalComponentModel.g:2130:3: rule__SystemPortOut__OutCompAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__OutCompAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getOutCompAssignment_5()); 

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


    // $ANTLR start "rule__SystemPortOut__Group__6"
    // InternalComponentModel.g:2138:1: rule__SystemPortOut__Group__6 : rule__SystemPortOut__Group__6__Impl rule__SystemPortOut__Group__7 ;
    public final void rule__SystemPortOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2142:1: ( rule__SystemPortOut__Group__6__Impl rule__SystemPortOut__Group__7 )
            // InternalComponentModel.g:2143:2: rule__SystemPortOut__Group__6__Impl rule__SystemPortOut__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SystemPortOut__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__7();

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
    // $ANTLR end "rule__SystemPortOut__Group__6"


    // $ANTLR start "rule__SystemPortOut__Group__6__Impl"
    // InternalComponentModel.g:2150:1: rule__SystemPortOut__Group__6__Impl : ( '.' ) ;
    public final void rule__SystemPortOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2154:1: ( ( '.' ) )
            // InternalComponentModel.g:2155:1: ( '.' )
            {
            // InternalComponentModel.g:2155:1: ( '.' )
            // InternalComponentModel.g:2156:2: '.'
            {
             before(grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__SystemPortOut__Group__6__Impl"


    // $ANTLR start "rule__SystemPortOut__Group__7"
    // InternalComponentModel.g:2165:1: rule__SystemPortOut__Group__7 : rule__SystemPortOut__Group__7__Impl ;
    public final void rule__SystemPortOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2169:1: ( rule__SystemPortOut__Group__7__Impl )
            // InternalComponentModel.g:2170:2: rule__SystemPortOut__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__Group__7__Impl();

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
    // $ANTLR end "rule__SystemPortOut__Group__7"


    // $ANTLR start "rule__SystemPortOut__Group__7__Impl"
    // InternalComponentModel.g:2176:1: rule__SystemPortOut__Group__7__Impl : ( ( rule__SystemPortOut__OutPortAssignment_7 ) ) ;
    public final void rule__SystemPortOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2180:1: ( ( ( rule__SystemPortOut__OutPortAssignment_7 ) ) )
            // InternalComponentModel.g:2181:1: ( ( rule__SystemPortOut__OutPortAssignment_7 ) )
            {
            // InternalComponentModel.g:2181:1: ( ( rule__SystemPortOut__OutPortAssignment_7 ) )
            // InternalComponentModel.g:2182:2: ( rule__SystemPortOut__OutPortAssignment_7 )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortAssignment_7()); 
            // InternalComponentModel.g:2183:2: ( rule__SystemPortOut__OutPortAssignment_7 )
            // InternalComponentModel.g:2183:3: rule__SystemPortOut__OutPortAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SystemPortOut__OutPortAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSystemPortOutAccess().getOutPortAssignment_7()); 

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
    // $ANTLR end "rule__SystemPortOut__Group__7__Impl"


    // $ANTLR start "rule__CompConnDec__Group__0"
    // InternalComponentModel.g:2192:1: rule__CompConnDec__Group__0 : rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1 ;
    public final void rule__CompConnDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2196:1: ( rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1 )
            // InternalComponentModel.g:2197:2: rule__CompConnDec__Group__0__Impl rule__CompConnDec__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentModel.g:2204:1: rule__CompConnDec__Group__0__Impl : ( 'component' ) ;
    public final void rule__CompConnDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2208:1: ( ( 'component' ) )
            // InternalComponentModel.g:2209:1: ( 'component' )
            {
            // InternalComponentModel.g:2209:1: ( 'component' )
            // InternalComponentModel.g:2210:2: 'component'
            {
             before(grammarAccess.getCompConnDecAccess().getComponentKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getComponentKeyword_0()); 

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
    // InternalComponentModel.g:2219:1: rule__CompConnDec__Group__1 : rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2 ;
    public final void rule__CompConnDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2223:1: ( rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2 )
            // InternalComponentModel.g:2224:2: rule__CompConnDec__Group__1__Impl rule__CompConnDec__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2231:1: rule__CompConnDec__Group__1__Impl : ( 'connection' ) ;
    public final void rule__CompConnDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2235:1: ( ( 'connection' ) )
            // InternalComponentModel.g:2236:1: ( 'connection' )
            {
            // InternalComponentModel.g:2236:1: ( 'connection' )
            // InternalComponentModel.g:2237:2: 'connection'
            {
             before(grammarAccess.getCompConnDecAccess().getConnectionKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getConnectionKeyword_1()); 

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
    // InternalComponentModel.g:2246:1: rule__CompConnDec__Group__2 : rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3 ;
    public final void rule__CompConnDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2250:1: ( rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3 )
            // InternalComponentModel.g:2251:2: rule__CompConnDec__Group__2__Impl rule__CompConnDec__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentModel.g:2258:1: rule__CompConnDec__Group__2__Impl : ( ( rule__CompConnDec__NameAssignment_2 ) ) ;
    public final void rule__CompConnDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2262:1: ( ( ( rule__CompConnDec__NameAssignment_2 ) ) )
            // InternalComponentModel.g:2263:1: ( ( rule__CompConnDec__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:2263:1: ( ( rule__CompConnDec__NameAssignment_2 ) )
            // InternalComponentModel.g:2264:2: ( rule__CompConnDec__NameAssignment_2 )
            {
             before(grammarAccess.getCompConnDecAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:2265:2: ( rule__CompConnDec__NameAssignment_2 )
            // InternalComponentModel.g:2265:3: rule__CompConnDec__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getNameAssignment_2()); 

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
    // InternalComponentModel.g:2273:1: rule__CompConnDec__Group__3 : rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4 ;
    public final void rule__CompConnDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2277:1: ( rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4 )
            // InternalComponentModel.g:2278:2: rule__CompConnDec__Group__3__Impl rule__CompConnDec__Group__4
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
    // InternalComponentModel.g:2285:1: rule__CompConnDec__Group__3__Impl : ( 'from' ) ;
    public final void rule__CompConnDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2289:1: ( ( 'from' ) )
            // InternalComponentModel.g:2290:1: ( 'from' )
            {
            // InternalComponentModel.g:2290:1: ( 'from' )
            // InternalComponentModel.g:2291:2: 'from'
            {
             before(grammarAccess.getCompConnDecAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getFromKeyword_3()); 

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
    // InternalComponentModel.g:2300:1: rule__CompConnDec__Group__4 : rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5 ;
    public final void rule__CompConnDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2304:1: ( rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5 )
            // InternalComponentModel.g:2305:2: rule__CompConnDec__Group__4__Impl rule__CompConnDec__Group__5
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
    // InternalComponentModel.g:2312:1: rule__CompConnDec__Group__4__Impl : ( ( rule__CompConnDec__SourceCompAssignment_4 ) ) ;
    public final void rule__CompConnDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2316:1: ( ( ( rule__CompConnDec__SourceCompAssignment_4 ) ) )
            // InternalComponentModel.g:2317:1: ( ( rule__CompConnDec__SourceCompAssignment_4 ) )
            {
            // InternalComponentModel.g:2317:1: ( ( rule__CompConnDec__SourceCompAssignment_4 ) )
            // InternalComponentModel.g:2318:2: ( rule__CompConnDec__SourceCompAssignment_4 )
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompAssignment_4()); 
            // InternalComponentModel.g:2319:2: ( rule__CompConnDec__SourceCompAssignment_4 )
            // InternalComponentModel.g:2319:3: rule__CompConnDec__SourceCompAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__SourceCompAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getSourceCompAssignment_4()); 

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
    // InternalComponentModel.g:2327:1: rule__CompConnDec__Group__5 : rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6 ;
    public final void rule__CompConnDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2331:1: ( rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6 )
            // InternalComponentModel.g:2332:2: rule__CompConnDec__Group__5__Impl rule__CompConnDec__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2339:1: rule__CompConnDec__Group__5__Impl : ( '.' ) ;
    public final void rule__CompConnDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2343:1: ( ( '.' ) )
            // InternalComponentModel.g:2344:1: ( '.' )
            {
            // InternalComponentModel.g:2344:1: ( '.' )
            // InternalComponentModel.g:2345:2: '.'
            {
             before(grammarAccess.getCompConnDecAccess().getFullStopKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getFullStopKeyword_5()); 

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
    // InternalComponentModel.g:2354:1: rule__CompConnDec__Group__6 : rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7 ;
    public final void rule__CompConnDec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2358:1: ( rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7 )
            // InternalComponentModel.g:2359:2: rule__CompConnDec__Group__6__Impl rule__CompConnDec__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentModel.g:2366:1: rule__CompConnDec__Group__6__Impl : ( ( rule__CompConnDec__SourcePortAssignment_6 ) ) ;
    public final void rule__CompConnDec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2370:1: ( ( ( rule__CompConnDec__SourcePortAssignment_6 ) ) )
            // InternalComponentModel.g:2371:1: ( ( rule__CompConnDec__SourcePortAssignment_6 ) )
            {
            // InternalComponentModel.g:2371:1: ( ( rule__CompConnDec__SourcePortAssignment_6 ) )
            // InternalComponentModel.g:2372:2: ( rule__CompConnDec__SourcePortAssignment_6 )
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortAssignment_6()); 
            // InternalComponentModel.g:2373:2: ( rule__CompConnDec__SourcePortAssignment_6 )
            // InternalComponentModel.g:2373:3: rule__CompConnDec__SourcePortAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__SourcePortAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getSourcePortAssignment_6()); 

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
    // InternalComponentModel.g:2381:1: rule__CompConnDec__Group__7 : rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8 ;
    public final void rule__CompConnDec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2385:1: ( rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8 )
            // InternalComponentModel.g:2386:2: rule__CompConnDec__Group__7__Impl rule__CompConnDec__Group__8
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
    // InternalComponentModel.g:2393:1: rule__CompConnDec__Group__7__Impl : ( 'to' ) ;
    public final void rule__CompConnDec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2397:1: ( ( 'to' ) )
            // InternalComponentModel.g:2398:1: ( 'to' )
            {
            // InternalComponentModel.g:2398:1: ( 'to' )
            // InternalComponentModel.g:2399:2: 'to'
            {
             before(grammarAccess.getCompConnDecAccess().getToKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getToKeyword_7()); 

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
    // InternalComponentModel.g:2408:1: rule__CompConnDec__Group__8 : rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9 ;
    public final void rule__CompConnDec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2412:1: ( rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9 )
            // InternalComponentModel.g:2413:2: rule__CompConnDec__Group__8__Impl rule__CompConnDec__Group__9
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
    // InternalComponentModel.g:2420:1: rule__CompConnDec__Group__8__Impl : ( ( rule__CompConnDec__TargetCompAssignment_8 ) ) ;
    public final void rule__CompConnDec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2424:1: ( ( ( rule__CompConnDec__TargetCompAssignment_8 ) ) )
            // InternalComponentModel.g:2425:1: ( ( rule__CompConnDec__TargetCompAssignment_8 ) )
            {
            // InternalComponentModel.g:2425:1: ( ( rule__CompConnDec__TargetCompAssignment_8 ) )
            // InternalComponentModel.g:2426:2: ( rule__CompConnDec__TargetCompAssignment_8 )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompAssignment_8()); 
            // InternalComponentModel.g:2427:2: ( rule__CompConnDec__TargetCompAssignment_8 )
            // InternalComponentModel.g:2427:3: rule__CompConnDec__TargetCompAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__TargetCompAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getTargetCompAssignment_8()); 

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
    // InternalComponentModel.g:2435:1: rule__CompConnDec__Group__9 : rule__CompConnDec__Group__9__Impl rule__CompConnDec__Group__10 ;
    public final void rule__CompConnDec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2439:1: ( rule__CompConnDec__Group__9__Impl rule__CompConnDec__Group__10 )
            // InternalComponentModel.g:2440:2: rule__CompConnDec__Group__9__Impl rule__CompConnDec__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__CompConnDec__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__10();

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
    // InternalComponentModel.g:2447:1: rule__CompConnDec__Group__9__Impl : ( '.' ) ;
    public final void rule__CompConnDec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2451:1: ( ( '.' ) )
            // InternalComponentModel.g:2452:1: ( '.' )
            {
            // InternalComponentModel.g:2452:1: ( '.' )
            // InternalComponentModel.g:2453:2: '.'
            {
             before(grammarAccess.getCompConnDecAccess().getFullStopKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getFullStopKeyword_9()); 

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


    // $ANTLR start "rule__CompConnDec__Group__10"
    // InternalComponentModel.g:2462:1: rule__CompConnDec__Group__10 : rule__CompConnDec__Group__10__Impl ;
    public final void rule__CompConnDec__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2466:1: ( rule__CompConnDec__Group__10__Impl )
            // InternalComponentModel.g:2467:2: rule__CompConnDec__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__Group__10__Impl();

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
    // $ANTLR end "rule__CompConnDec__Group__10"


    // $ANTLR start "rule__CompConnDec__Group__10__Impl"
    // InternalComponentModel.g:2473:1: rule__CompConnDec__Group__10__Impl : ( ( rule__CompConnDec__TargetPortAssignment_10 ) ) ;
    public final void rule__CompConnDec__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2477:1: ( ( ( rule__CompConnDec__TargetPortAssignment_10 ) ) )
            // InternalComponentModel.g:2478:1: ( ( rule__CompConnDec__TargetPortAssignment_10 ) )
            {
            // InternalComponentModel.g:2478:1: ( ( rule__CompConnDec__TargetPortAssignment_10 ) )
            // InternalComponentModel.g:2479:2: ( rule__CompConnDec__TargetPortAssignment_10 )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortAssignment_10()); 
            // InternalComponentModel.g:2480:2: ( rule__CompConnDec__TargetPortAssignment_10 )
            // InternalComponentModel.g:2480:3: rule__CompConnDec__TargetPortAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__CompConnDec__TargetPortAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCompConnDecAccess().getTargetPortAssignment_10()); 

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
    // $ANTLR end "rule__CompConnDec__Group__10__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__0"
    // InternalComponentModel.g:2489:1: rule__ComponentImpl__Group__0 : rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 ;
    public final void rule__ComponentImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2493:1: ( rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 )
            // InternalComponentModel.g:2494:2: rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentModel.g:2501:1: rule__ComponentImpl__Group__0__Impl : ( 'component' ) ;
    public final void rule__ComponentImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2505:1: ( ( 'component' ) )
            // InternalComponentModel.g:2506:1: ( 'component' )
            {
            // InternalComponentModel.g:2506:1: ( 'component' )
            // InternalComponentModel.g:2507:2: 'component'
            {
             before(grammarAccess.getComponentImplAccess().getComponentKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getComponentKeyword_0()); 

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
    // InternalComponentModel.g:2516:1: rule__ComponentImpl__Group__1 : rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 ;
    public final void rule__ComponentImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2520:1: ( rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 )
            // InternalComponentModel.g:2521:2: rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2528:1: rule__ComponentImpl__Group__1__Impl : ( 'implementation' ) ;
    public final void rule__ComponentImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2532:1: ( ( 'implementation' ) )
            // InternalComponentModel.g:2533:1: ( 'implementation' )
            {
            // InternalComponentModel.g:2533:1: ( 'implementation' )
            // InternalComponentModel.g:2534:2: 'implementation'
            {
             before(grammarAccess.getComponentImplAccess().getImplementationKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getImplementationKeyword_1()); 

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
    // InternalComponentModel.g:2543:1: rule__ComponentImpl__Group__2 : rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 ;
    public final void rule__ComponentImpl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2547:1: ( rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 )
            // InternalComponentModel.g:2548:2: rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalComponentModel.g:2555:1: rule__ComponentImpl__Group__2__Impl : ( ( rule__ComponentImpl__NameAssignment_2 ) ) ;
    public final void rule__ComponentImpl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2559:1: ( ( ( rule__ComponentImpl__NameAssignment_2 ) ) )
            // InternalComponentModel.g:2560:1: ( ( rule__ComponentImpl__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:2560:1: ( ( rule__ComponentImpl__NameAssignment_2 ) )
            // InternalComponentModel.g:2561:2: ( rule__ComponentImpl__NameAssignment_2 )
            {
             before(grammarAccess.getComponentImplAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:2562:2: ( rule__ComponentImpl__NameAssignment_2 )
            // InternalComponentModel.g:2562:3: rule__ComponentImpl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentImplAccess().getNameAssignment_2()); 

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
    // InternalComponentModel.g:2570:1: rule__ComponentImpl__Group__3 : rule__ComponentImpl__Group__3__Impl rule__ComponentImpl__Group__4 ;
    public final void rule__ComponentImpl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2574:1: ( rule__ComponentImpl__Group__3__Impl rule__ComponentImpl__Group__4 )
            // InternalComponentModel.g:2575:2: rule__ComponentImpl__Group__3__Impl rule__ComponentImpl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentImpl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__4();

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
    // InternalComponentModel.g:2582:1: rule__ComponentImpl__Group__3__Impl : ( ':' ) ;
    public final void rule__ComponentImpl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2586:1: ( ( ':' ) )
            // InternalComponentModel.g:2587:1: ( ':' )
            {
            // InternalComponentModel.g:2587:1: ( ':' )
            // InternalComponentModel.g:2588:2: ':'
            {
             before(grammarAccess.getComponentImplAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getColonKeyword_3()); 

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


    // $ANTLR start "rule__ComponentImpl__Group__4"
    // InternalComponentModel.g:2597:1: rule__ComponentImpl__Group__4 : rule__ComponentImpl__Group__4__Impl ;
    public final void rule__ComponentImpl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2601:1: ( rule__ComponentImpl__Group__4__Impl )
            // InternalComponentModel.g:2602:2: rule__ComponentImpl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__4__Impl();

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
    // $ANTLR end "rule__ComponentImpl__Group__4"


    // $ANTLR start "rule__ComponentImpl__Group__4__Impl"
    // InternalComponentModel.g:2608:1: rule__ComponentImpl__Group__4__Impl : ( ( rule__ComponentImpl__SuperTypeAssignment_4 ) ) ;
    public final void rule__ComponentImpl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2612:1: ( ( ( rule__ComponentImpl__SuperTypeAssignment_4 ) ) )
            // InternalComponentModel.g:2613:1: ( ( rule__ComponentImpl__SuperTypeAssignment_4 ) )
            {
            // InternalComponentModel.g:2613:1: ( ( rule__ComponentImpl__SuperTypeAssignment_4 ) )
            // InternalComponentModel.g:2614:2: ( rule__ComponentImpl__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeAssignment_4()); 
            // InternalComponentModel.g:2615:2: ( rule__ComponentImpl__SuperTypeAssignment_4 )
            // InternalComponentModel.g:2615:3: rule__ComponentImpl__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentImplAccess().getSuperTypeAssignment_4()); 

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
    // $ANTLR end "rule__ComponentImpl__Group__4__Impl"


    // $ANTLR start "rule__ComponentType__Group__0"
    // InternalComponentModel.g:2624:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2628:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // InternalComponentModel.g:2629:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentModel.g:2636:1: rule__ComponentType__Group__0__Impl : ( 'component' ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2640:1: ( ( 'component' ) )
            // InternalComponentModel.g:2641:1: ( 'component' )
            {
            // InternalComponentModel.g:2641:1: ( 'component' )
            // InternalComponentModel.g:2642:2: 'component'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getComponentKeyword_0()); 

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
    // InternalComponentModel.g:2651:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2655:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // InternalComponentModel.g:2656:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2663:1: rule__ComponentType__Group__1__Impl : ( 'type' ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2667:1: ( ( 'type' ) )
            // InternalComponentModel.g:2668:1: ( 'type' )
            {
            // InternalComponentModel.g:2668:1: ( 'type' )
            // InternalComponentModel.g:2669:2: 'type'
            {
             before(grammarAccess.getComponentTypeAccess().getTypeKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getTypeKeyword_1()); 

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
    // InternalComponentModel.g:2678:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2682:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // InternalComponentModel.g:2683:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentModel.g:2690:1: rule__ComponentType__Group__2__Impl : ( ( rule__ComponentType__NameAssignment_2 ) ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2694:1: ( ( ( rule__ComponentType__NameAssignment_2 ) ) )
            // InternalComponentModel.g:2695:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            {
            // InternalComponentModel.g:2695:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            // InternalComponentModel.g:2696:2: ( rule__ComponentType__NameAssignment_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 
            // InternalComponentModel.g:2697:2: ( rule__ComponentType__NameAssignment_2 )
            // InternalComponentModel.g:2697:3: rule__ComponentType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 

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
    // InternalComponentModel.g:2705:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2709:1: ( rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 )
            // InternalComponentModel.g:2710:2: rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalComponentModel.g:2717:1: rule__ComponentType__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2721:1: ( ( '{' ) )
            // InternalComponentModel.g:2722:1: ( '{' )
            {
            // InternalComponentModel.g:2722:1: ( '{' )
            // InternalComponentModel.g:2723:2: '{'
            {
             before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalComponentModel.g:2732:1: rule__ComponentType__Group__4 : rule__ComponentType__Group__4__Impl rule__ComponentType__Group__5 ;
    public final void rule__ComponentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2736:1: ( rule__ComponentType__Group__4__Impl rule__ComponentType__Group__5 )
            // InternalComponentModel.g:2737:2: rule__ComponentType__Group__4__Impl rule__ComponentType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ComponentType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__5();

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
    // InternalComponentModel.g:2744:1: rule__ComponentType__Group__4__Impl : ( ( rule__ComponentType__ComponentFeaturesAssignment_4 )* ) ;
    public final void rule__ComponentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2748:1: ( ( ( rule__ComponentType__ComponentFeaturesAssignment_4 )* ) )
            // InternalComponentModel.g:2749:1: ( ( rule__ComponentType__ComponentFeaturesAssignment_4 )* )
            {
            // InternalComponentModel.g:2749:1: ( ( rule__ComponentType__ComponentFeaturesAssignment_4 )* )
            // InternalComponentModel.g:2750:2: ( rule__ComponentType__ComponentFeaturesAssignment_4 )*
            {
             before(grammarAccess.getComponentTypeAccess().getComponentFeaturesAssignment_4()); 
            // InternalComponentModel.g:2751:2: ( rule__ComponentType__ComponentFeaturesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12||LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentModel.g:2751:3: rule__ComponentType__ComponentFeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ComponentType__ComponentFeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentTypeAccess().getComponentFeaturesAssignment_4()); 

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


    // $ANTLR start "rule__ComponentType__Group__5"
    // InternalComponentModel.g:2759:1: rule__ComponentType__Group__5 : rule__ComponentType__Group__5__Impl ;
    public final void rule__ComponentType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2763:1: ( rule__ComponentType__Group__5__Impl )
            // InternalComponentModel.g:2764:2: rule__ComponentType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__5__Impl();

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
    // $ANTLR end "rule__ComponentType__Group__5"


    // $ANTLR start "rule__ComponentType__Group__5__Impl"
    // InternalComponentModel.g:2770:1: rule__ComponentType__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2774:1: ( ( '}' ) )
            // InternalComponentModel.g:2775:1: ( '}' )
            {
            // InternalComponentModel.g:2775:1: ( '}' )
            // InternalComponentModel.g:2776:2: '}'
            {
             before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ComponentType__Group__5__Impl"


    // $ANTLR start "rule__InPort__Group__0"
    // InternalComponentModel.g:2786:1: rule__InPort__Group__0 : rule__InPort__Group__0__Impl rule__InPort__Group__1 ;
    public final void rule__InPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2790:1: ( rule__InPort__Group__0__Impl rule__InPort__Group__1 )
            // InternalComponentModel.g:2791:2: rule__InPort__Group__0__Impl rule__InPort__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalComponentModel.g:2798:1: rule__InPort__Group__0__Impl : ( 'port' ) ;
    public final void rule__InPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2802:1: ( ( 'port' ) )
            // InternalComponentModel.g:2803:1: ( 'port' )
            {
            // InternalComponentModel.g:2803:1: ( 'port' )
            // InternalComponentModel.g:2804:2: 'port'
            {
             before(grammarAccess.getInPortAccess().getPortKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getPortKeyword_0()); 

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
    // InternalComponentModel.g:2813:1: rule__InPort__Group__1 : rule__InPort__Group__1__Impl rule__InPort__Group__2 ;
    public final void rule__InPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2817:1: ( rule__InPort__Group__1__Impl rule__InPort__Group__2 )
            // InternalComponentModel.g:2818:2: rule__InPort__Group__1__Impl rule__InPort__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentModel.g:2825:1: rule__InPort__Group__1__Impl : ( 'instance' ) ;
    public final void rule__InPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2829:1: ( ( 'instance' ) )
            // InternalComponentModel.g:2830:1: ( 'instance' )
            {
            // InternalComponentModel.g:2830:1: ( 'instance' )
            // InternalComponentModel.g:2831:2: 'instance'
            {
             before(grammarAccess.getInPortAccess().getInstanceKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getInstanceKeyword_1()); 

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
    // InternalComponentModel.g:2840:1: rule__InPort__Group__2 : rule__InPort__Group__2__Impl rule__InPort__Group__3 ;
    public final void rule__InPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2844:1: ( rule__InPort__Group__2__Impl rule__InPort__Group__3 )
            // InternalComponentModel.g:2845:2: rule__InPort__Group__2__Impl rule__InPort__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:2852:1: rule__InPort__Group__2__Impl : ( 'in' ) ;
    public final void rule__InPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2856:1: ( ( 'in' ) )
            // InternalComponentModel.g:2857:1: ( 'in' )
            {
            // InternalComponentModel.g:2857:1: ( 'in' )
            // InternalComponentModel.g:2858:2: 'in'
            {
             before(grammarAccess.getInPortAccess().getInKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getInKeyword_2()); 

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
    // InternalComponentModel.g:2867:1: rule__InPort__Group__3 : rule__InPort__Group__3__Impl rule__InPort__Group__4 ;
    public final void rule__InPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2871:1: ( rule__InPort__Group__3__Impl rule__InPort__Group__4 )
            // InternalComponentModel.g:2872:2: rule__InPort__Group__3__Impl rule__InPort__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__InPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPort__Group__4();

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
    // InternalComponentModel.g:2879:1: rule__InPort__Group__3__Impl : ( ( rule__InPort__NameInPortAssignment_3 ) ) ;
    public final void rule__InPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2883:1: ( ( ( rule__InPort__NameInPortAssignment_3 ) ) )
            // InternalComponentModel.g:2884:1: ( ( rule__InPort__NameInPortAssignment_3 ) )
            {
            // InternalComponentModel.g:2884:1: ( ( rule__InPort__NameInPortAssignment_3 ) )
            // InternalComponentModel.g:2885:2: ( rule__InPort__NameInPortAssignment_3 )
            {
             before(grammarAccess.getInPortAccess().getNameInPortAssignment_3()); 
            // InternalComponentModel.g:2886:2: ( rule__InPort__NameInPortAssignment_3 )
            // InternalComponentModel.g:2886:3: rule__InPort__NameInPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InPort__NameInPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInPortAccess().getNameInPortAssignment_3()); 

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


    // $ANTLR start "rule__InPort__Group__4"
    // InternalComponentModel.g:2894:1: rule__InPort__Group__4 : rule__InPort__Group__4__Impl rule__InPort__Group__5 ;
    public final void rule__InPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2898:1: ( rule__InPort__Group__4__Impl rule__InPort__Group__5 )
            // InternalComponentModel.g:2899:2: rule__InPort__Group__4__Impl rule__InPort__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__InPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InPort__Group__5();

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
    // $ANTLR end "rule__InPort__Group__4"


    // $ANTLR start "rule__InPort__Group__4__Impl"
    // InternalComponentModel.g:2906:1: rule__InPort__Group__4__Impl : ( ':' ) ;
    public final void rule__InPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2910:1: ( ( ':' ) )
            // InternalComponentModel.g:2911:1: ( ':' )
            {
            // InternalComponentModel.g:2911:1: ( ':' )
            // InternalComponentModel.g:2912:2: ':'
            {
             before(grammarAccess.getInPortAccess().getColonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__InPort__Group__4__Impl"


    // $ANTLR start "rule__InPort__Group__5"
    // InternalComponentModel.g:2921:1: rule__InPort__Group__5 : rule__InPort__Group__5__Impl ;
    public final void rule__InPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2925:1: ( rule__InPort__Group__5__Impl )
            // InternalComponentModel.g:2926:2: rule__InPort__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InPort__Group__5__Impl();

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
    // $ANTLR end "rule__InPort__Group__5"


    // $ANTLR start "rule__InPort__Group__5__Impl"
    // InternalComponentModel.g:2932:1: rule__InPort__Group__5__Impl : ( ( rule__InPort__SuperTypeAssignment_5 ) ) ;
    public final void rule__InPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2936:1: ( ( ( rule__InPort__SuperTypeAssignment_5 ) ) )
            // InternalComponentModel.g:2937:1: ( ( rule__InPort__SuperTypeAssignment_5 ) )
            {
            // InternalComponentModel.g:2937:1: ( ( rule__InPort__SuperTypeAssignment_5 ) )
            // InternalComponentModel.g:2938:2: ( rule__InPort__SuperTypeAssignment_5 )
            {
             before(grammarAccess.getInPortAccess().getSuperTypeAssignment_5()); 
            // InternalComponentModel.g:2939:2: ( rule__InPort__SuperTypeAssignment_5 )
            // InternalComponentModel.g:2939:3: rule__InPort__SuperTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__InPort__SuperTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInPortAccess().getSuperTypeAssignment_5()); 

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
    // $ANTLR end "rule__InPort__Group__5__Impl"


    // $ANTLR start "rule__OutPort__Group__0"
    // InternalComponentModel.g:2948:1: rule__OutPort__Group__0 : rule__OutPort__Group__0__Impl rule__OutPort__Group__1 ;
    public final void rule__OutPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2952:1: ( rule__OutPort__Group__0__Impl rule__OutPort__Group__1 )
            // InternalComponentModel.g:2953:2: rule__OutPort__Group__0__Impl rule__OutPort__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalComponentModel.g:2960:1: rule__OutPort__Group__0__Impl : ( 'port' ) ;
    public final void rule__OutPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2964:1: ( ( 'port' ) )
            // InternalComponentModel.g:2965:1: ( 'port' )
            {
            // InternalComponentModel.g:2965:1: ( 'port' )
            // InternalComponentModel.g:2966:2: 'port'
            {
             before(grammarAccess.getOutPortAccess().getPortKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getPortKeyword_0()); 

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
    // InternalComponentModel.g:2975:1: rule__OutPort__Group__1 : rule__OutPort__Group__1__Impl rule__OutPort__Group__2 ;
    public final void rule__OutPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2979:1: ( rule__OutPort__Group__1__Impl rule__OutPort__Group__2 )
            // InternalComponentModel.g:2980:2: rule__OutPort__Group__1__Impl rule__OutPort__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentModel.g:2987:1: rule__OutPort__Group__1__Impl : ( 'instance' ) ;
    public final void rule__OutPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:2991:1: ( ( 'instance' ) )
            // InternalComponentModel.g:2992:1: ( 'instance' )
            {
            // InternalComponentModel.g:2992:1: ( 'instance' )
            // InternalComponentModel.g:2993:2: 'instance'
            {
             before(grammarAccess.getOutPortAccess().getInstanceKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getInstanceKeyword_1()); 

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
    // InternalComponentModel.g:3002:1: rule__OutPort__Group__2 : rule__OutPort__Group__2__Impl rule__OutPort__Group__3 ;
    public final void rule__OutPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3006:1: ( rule__OutPort__Group__2__Impl rule__OutPort__Group__3 )
            // InternalComponentModel.g:3007:2: rule__OutPort__Group__2__Impl rule__OutPort__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentModel.g:3014:1: rule__OutPort__Group__2__Impl : ( 'out' ) ;
    public final void rule__OutPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3018:1: ( ( 'out' ) )
            // InternalComponentModel.g:3019:1: ( 'out' )
            {
            // InternalComponentModel.g:3019:1: ( 'out' )
            // InternalComponentModel.g:3020:2: 'out'
            {
             before(grammarAccess.getOutPortAccess().getOutKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getOutKeyword_2()); 

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
    // InternalComponentModel.g:3029:1: rule__OutPort__Group__3 : rule__OutPort__Group__3__Impl rule__OutPort__Group__4 ;
    public final void rule__OutPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3033:1: ( rule__OutPort__Group__3__Impl rule__OutPort__Group__4 )
            // InternalComponentModel.g:3034:2: rule__OutPort__Group__3__Impl rule__OutPort__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__OutPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPort__Group__4();

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
    // InternalComponentModel.g:3041:1: rule__OutPort__Group__3__Impl : ( ( rule__OutPort__NameOutPortAssignment_3 ) ) ;
    public final void rule__OutPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3045:1: ( ( ( rule__OutPort__NameOutPortAssignment_3 ) ) )
            // InternalComponentModel.g:3046:1: ( ( rule__OutPort__NameOutPortAssignment_3 ) )
            {
            // InternalComponentModel.g:3046:1: ( ( rule__OutPort__NameOutPortAssignment_3 ) )
            // InternalComponentModel.g:3047:2: ( rule__OutPort__NameOutPortAssignment_3 )
            {
             before(grammarAccess.getOutPortAccess().getNameOutPortAssignment_3()); 
            // InternalComponentModel.g:3048:2: ( rule__OutPort__NameOutPortAssignment_3 )
            // InternalComponentModel.g:3048:3: rule__OutPort__NameOutPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__NameOutPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutPortAccess().getNameOutPortAssignment_3()); 

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


    // $ANTLR start "rule__OutPort__Group__4"
    // InternalComponentModel.g:3056:1: rule__OutPort__Group__4 : rule__OutPort__Group__4__Impl rule__OutPort__Group__5 ;
    public final void rule__OutPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3060:1: ( rule__OutPort__Group__4__Impl rule__OutPort__Group__5 )
            // InternalComponentModel.g:3061:2: rule__OutPort__Group__4__Impl rule__OutPort__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__OutPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutPort__Group__5();

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
    // $ANTLR end "rule__OutPort__Group__4"


    // $ANTLR start "rule__OutPort__Group__4__Impl"
    // InternalComponentModel.g:3068:1: rule__OutPort__Group__4__Impl : ( ':' ) ;
    public final void rule__OutPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3072:1: ( ( ':' ) )
            // InternalComponentModel.g:3073:1: ( ':' )
            {
            // InternalComponentModel.g:3073:1: ( ':' )
            // InternalComponentModel.g:3074:2: ':'
            {
             before(grammarAccess.getOutPortAccess().getColonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__OutPort__Group__4__Impl"


    // $ANTLR start "rule__OutPort__Group__5"
    // InternalComponentModel.g:3083:1: rule__OutPort__Group__5 : rule__OutPort__Group__5__Impl ;
    public final void rule__OutPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3087:1: ( rule__OutPort__Group__5__Impl )
            // InternalComponentModel.g:3088:2: rule__OutPort__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__Group__5__Impl();

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
    // $ANTLR end "rule__OutPort__Group__5"


    // $ANTLR start "rule__OutPort__Group__5__Impl"
    // InternalComponentModel.g:3094:1: rule__OutPort__Group__5__Impl : ( ( rule__OutPort__SuperTypeAssignment_5 ) ) ;
    public final void rule__OutPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3098:1: ( ( ( rule__OutPort__SuperTypeAssignment_5 ) ) )
            // InternalComponentModel.g:3099:1: ( ( rule__OutPort__SuperTypeAssignment_5 ) )
            {
            // InternalComponentModel.g:3099:1: ( ( rule__OutPort__SuperTypeAssignment_5 ) )
            // InternalComponentModel.g:3100:2: ( rule__OutPort__SuperTypeAssignment_5 )
            {
             before(grammarAccess.getOutPortAccess().getSuperTypeAssignment_5()); 
            // InternalComponentModel.g:3101:2: ( rule__OutPort__SuperTypeAssignment_5 )
            // InternalComponentModel.g:3101:3: rule__OutPort__SuperTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OutPort__SuperTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOutPortAccess().getSuperTypeAssignment_5()); 

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
    // $ANTLR end "rule__OutPort__Group__5__Impl"


    // $ANTLR start "rule__EModelDec__Group__0"
    // InternalComponentModel.g:3110:1: rule__EModelDec__Group__0 : rule__EModelDec__Group__0__Impl rule__EModelDec__Group__1 ;
    public final void rule__EModelDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3114:1: ( rule__EModelDec__Group__0__Impl rule__EModelDec__Group__1 )
            // InternalComponentModel.g:3115:2: rule__EModelDec__Group__0__Impl rule__EModelDec__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EModelDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__1();

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
    // $ANTLR end "rule__EModelDec__Group__0"


    // $ANTLR start "rule__EModelDec__Group__0__Impl"
    // InternalComponentModel.g:3122:1: rule__EModelDec__Group__0__Impl : ( 'error' ) ;
    public final void rule__EModelDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3126:1: ( ( 'error' ) )
            // InternalComponentModel.g:3127:1: ( 'error' )
            {
            // InternalComponentModel.g:3127:1: ( 'error' )
            // InternalComponentModel.g:3128:2: 'error'
            {
             before(grammarAccess.getEModelDecAccess().getErrorKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEModelDecAccess().getErrorKeyword_0()); 

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
    // $ANTLR end "rule__EModelDec__Group__0__Impl"


    // $ANTLR start "rule__EModelDec__Group__1"
    // InternalComponentModel.g:3137:1: rule__EModelDec__Group__1 : rule__EModelDec__Group__1__Impl rule__EModelDec__Group__2 ;
    public final void rule__EModelDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3141:1: ( rule__EModelDec__Group__1__Impl rule__EModelDec__Group__2 )
            // InternalComponentModel.g:3142:2: rule__EModelDec__Group__1__Impl rule__EModelDec__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EModelDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__2();

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
    // $ANTLR end "rule__EModelDec__Group__1"


    // $ANTLR start "rule__EModelDec__Group__1__Impl"
    // InternalComponentModel.g:3149:1: rule__EModelDec__Group__1__Impl : ( 'model' ) ;
    public final void rule__EModelDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3153:1: ( ( 'model' ) )
            // InternalComponentModel.g:3154:1: ( 'model' )
            {
            // InternalComponentModel.g:3154:1: ( 'model' )
            // InternalComponentModel.g:3155:2: 'model'
            {
             before(grammarAccess.getEModelDecAccess().getModelKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEModelDecAccess().getModelKeyword_1()); 

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
    // $ANTLR end "rule__EModelDec__Group__1__Impl"


    // $ANTLR start "rule__EModelDec__Group__2"
    // InternalComponentModel.g:3164:1: rule__EModelDec__Group__2 : rule__EModelDec__Group__2__Impl rule__EModelDec__Group__3 ;
    public final void rule__EModelDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3168:1: ( rule__EModelDec__Group__2__Impl rule__EModelDec__Group__3 )
            // InternalComponentModel.g:3169:2: rule__EModelDec__Group__2__Impl rule__EModelDec__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__EModelDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__3();

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
    // $ANTLR end "rule__EModelDec__Group__2"


    // $ANTLR start "rule__EModelDec__Group__2__Impl"
    // InternalComponentModel.g:3176:1: rule__EModelDec__Group__2__Impl : ( ( rule__EModelDec__NameEModelDecAssignment_2 ) ) ;
    public final void rule__EModelDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3180:1: ( ( ( rule__EModelDec__NameEModelDecAssignment_2 ) ) )
            // InternalComponentModel.g:3181:1: ( ( rule__EModelDec__NameEModelDecAssignment_2 ) )
            {
            // InternalComponentModel.g:3181:1: ( ( rule__EModelDec__NameEModelDecAssignment_2 ) )
            // InternalComponentModel.g:3182:2: ( rule__EModelDec__NameEModelDecAssignment_2 )
            {
             before(grammarAccess.getEModelDecAccess().getNameEModelDecAssignment_2()); 
            // InternalComponentModel.g:3183:2: ( rule__EModelDec__NameEModelDecAssignment_2 )
            // InternalComponentModel.g:3183:3: rule__EModelDec__NameEModelDecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EModelDec__NameEModelDecAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEModelDecAccess().getNameEModelDecAssignment_2()); 

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
    // $ANTLR end "rule__EModelDec__Group__2__Impl"


    // $ANTLR start "rule__EModelDec__Group__3"
    // InternalComponentModel.g:3191:1: rule__EModelDec__Group__3 : rule__EModelDec__Group__3__Impl rule__EModelDec__Group__4 ;
    public final void rule__EModelDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3195:1: ( rule__EModelDec__Group__3__Impl rule__EModelDec__Group__4 )
            // InternalComponentModel.g:3196:2: rule__EModelDec__Group__3__Impl rule__EModelDec__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__EModelDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__4();

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
    // $ANTLR end "rule__EModelDec__Group__3"


    // $ANTLR start "rule__EModelDec__Group__3__Impl"
    // InternalComponentModel.g:3203:1: rule__EModelDec__Group__3__Impl : ( '{' ) ;
    public final void rule__EModelDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3207:1: ( ( '{' ) )
            // InternalComponentModel.g:3208:1: ( '{' )
            {
            // InternalComponentModel.g:3208:1: ( '{' )
            // InternalComponentModel.g:3209:2: '{'
            {
             before(grammarAccess.getEModelDecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEModelDecAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__EModelDec__Group__3__Impl"


    // $ANTLR start "rule__EModelDec__Group__4"
    // InternalComponentModel.g:3218:1: rule__EModelDec__Group__4 : rule__EModelDec__Group__4__Impl rule__EModelDec__Group__5 ;
    public final void rule__EModelDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3222:1: ( rule__EModelDec__Group__4__Impl rule__EModelDec__Group__5 )
            // InternalComponentModel.g:3223:2: rule__EModelDec__Group__4__Impl rule__EModelDec__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__EModelDec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__5();

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
    // $ANTLR end "rule__EModelDec__Group__4"


    // $ANTLR start "rule__EModelDec__Group__4__Impl"
    // InternalComponentModel.g:3230:1: rule__EModelDec__Group__4__Impl : ( ( rule__EModelDec__EmodelElementsAssignment_4 )* ) ;
    public final void rule__EModelDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3234:1: ( ( ( rule__EModelDec__EmodelElementsAssignment_4 )* ) )
            // InternalComponentModel.g:3235:1: ( ( rule__EModelDec__EmodelElementsAssignment_4 )* )
            {
            // InternalComponentModel.g:3235:1: ( ( rule__EModelDec__EmodelElementsAssignment_4 )* )
            // InternalComponentModel.g:3236:2: ( rule__EModelDec__EmodelElementsAssignment_4 )*
            {
             before(grammarAccess.getEModelDecAccess().getEmodelElementsAssignment_4()); 
            // InternalComponentModel.g:3237:2: ( rule__EModelDec__EmodelElementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12||LA14_0==16||LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentModel.g:3237:3: rule__EModelDec__EmodelElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__EModelDec__EmodelElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEModelDecAccess().getEmodelElementsAssignment_4()); 

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
    // $ANTLR end "rule__EModelDec__Group__4__Impl"


    // $ANTLR start "rule__EModelDec__Group__5"
    // InternalComponentModel.g:3245:1: rule__EModelDec__Group__5 : rule__EModelDec__Group__5__Impl ;
    public final void rule__EModelDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3249:1: ( rule__EModelDec__Group__5__Impl )
            // InternalComponentModel.g:3250:2: rule__EModelDec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EModelDec__Group__5__Impl();

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
    // $ANTLR end "rule__EModelDec__Group__5"


    // $ANTLR start "rule__EModelDec__Group__5__Impl"
    // InternalComponentModel.g:3256:1: rule__EModelDec__Group__5__Impl : ( '}' ) ;
    public final void rule__EModelDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3260:1: ( ( '}' ) )
            // InternalComponentModel.g:3261:1: ( '}' )
            {
            // InternalComponentModel.g:3261:1: ( '}' )
            // InternalComponentModel.g:3262:2: '}'
            {
             before(grammarAccess.getEModelDecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEModelDecAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EModelDec__Group__5__Impl"


    // $ANTLR start "rule__StateDec__Group__0"
    // InternalComponentModel.g:3272:1: rule__StateDec__Group__0 : rule__StateDec__Group__0__Impl rule__StateDec__Group__1 ;
    public final void rule__StateDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3276:1: ( rule__StateDec__Group__0__Impl rule__StateDec__Group__1 )
            // InternalComponentModel.g:3277:2: rule__StateDec__Group__0__Impl rule__StateDec__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__StateDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateDec__Group__1();

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
    // $ANTLR end "rule__StateDec__Group__0"


    // $ANTLR start "rule__StateDec__Group__0__Impl"
    // InternalComponentModel.g:3284:1: rule__StateDec__Group__0__Impl : ( 'error' ) ;
    public final void rule__StateDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3288:1: ( ( 'error' ) )
            // InternalComponentModel.g:3289:1: ( 'error' )
            {
            // InternalComponentModel.g:3289:1: ( 'error' )
            // InternalComponentModel.g:3290:2: 'error'
            {
             before(grammarAccess.getStateDecAccess().getErrorKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateDecAccess().getErrorKeyword_0()); 

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
    // $ANTLR end "rule__StateDec__Group__0__Impl"


    // $ANTLR start "rule__StateDec__Group__1"
    // InternalComponentModel.g:3299:1: rule__StateDec__Group__1 : rule__StateDec__Group__1__Impl rule__StateDec__Group__2 ;
    public final void rule__StateDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3303:1: ( rule__StateDec__Group__1__Impl rule__StateDec__Group__2 )
            // InternalComponentModel.g:3304:2: rule__StateDec__Group__1__Impl rule__StateDec__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StateDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateDec__Group__2();

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
    // $ANTLR end "rule__StateDec__Group__1"


    // $ANTLR start "rule__StateDec__Group__1__Impl"
    // InternalComponentModel.g:3311:1: rule__StateDec__Group__1__Impl : ( 'state' ) ;
    public final void rule__StateDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3315:1: ( ( 'state' ) )
            // InternalComponentModel.g:3316:1: ( 'state' )
            {
            // InternalComponentModel.g:3316:1: ( 'state' )
            // InternalComponentModel.g:3317:2: 'state'
            {
             before(grammarAccess.getStateDecAccess().getStateKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStateDecAccess().getStateKeyword_1()); 

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
    // $ANTLR end "rule__StateDec__Group__1__Impl"


    // $ANTLR start "rule__StateDec__Group__2"
    // InternalComponentModel.g:3326:1: rule__StateDec__Group__2 : rule__StateDec__Group__2__Impl ;
    public final void rule__StateDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3330:1: ( rule__StateDec__Group__2__Impl )
            // InternalComponentModel.g:3331:2: rule__StateDec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateDec__Group__2__Impl();

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
    // $ANTLR end "rule__StateDec__Group__2"


    // $ANTLR start "rule__StateDec__Group__2__Impl"
    // InternalComponentModel.g:3337:1: rule__StateDec__Group__2__Impl : ( ( rule__StateDec__NameStateDecAssignment_2 ) ) ;
    public final void rule__StateDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3341:1: ( ( ( rule__StateDec__NameStateDecAssignment_2 ) ) )
            // InternalComponentModel.g:3342:1: ( ( rule__StateDec__NameStateDecAssignment_2 ) )
            {
            // InternalComponentModel.g:3342:1: ( ( rule__StateDec__NameStateDecAssignment_2 ) )
            // InternalComponentModel.g:3343:2: ( rule__StateDec__NameStateDecAssignment_2 )
            {
             before(grammarAccess.getStateDecAccess().getNameStateDecAssignment_2()); 
            // InternalComponentModel.g:3344:2: ( rule__StateDec__NameStateDecAssignment_2 )
            // InternalComponentModel.g:3344:3: rule__StateDec__NameStateDecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateDec__NameStateDecAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateDecAccess().getNameStateDecAssignment_2()); 

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
    // $ANTLR end "rule__StateDec__Group__2__Impl"


    // $ANTLR start "rule__TransitionDec__Group__0"
    // InternalComponentModel.g:3353:1: rule__TransitionDec__Group__0 : rule__TransitionDec__Group__0__Impl rule__TransitionDec__Group__1 ;
    public final void rule__TransitionDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3357:1: ( rule__TransitionDec__Group__0__Impl rule__TransitionDec__Group__1 )
            // InternalComponentModel.g:3358:2: rule__TransitionDec__Group__0__Impl rule__TransitionDec__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TransitionDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDec__Group__1();

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
    // $ANTLR end "rule__TransitionDec__Group__0"


    // $ANTLR start "rule__TransitionDec__Group__0__Impl"
    // InternalComponentModel.g:3365:1: rule__TransitionDec__Group__0__Impl : ( 'transition' ) ;
    public final void rule__TransitionDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3369:1: ( ( 'transition' ) )
            // InternalComponentModel.g:3370:1: ( 'transition' )
            {
            // InternalComponentModel.g:3370:1: ( 'transition' )
            // InternalComponentModel.g:3371:2: 'transition'
            {
             before(grammarAccess.getTransitionDecAccess().getTransitionKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTransitionDecAccess().getTransitionKeyword_0()); 

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
    // $ANTLR end "rule__TransitionDec__Group__0__Impl"


    // $ANTLR start "rule__TransitionDec__Group__1"
    // InternalComponentModel.g:3380:1: rule__TransitionDec__Group__1 : rule__TransitionDec__Group__1__Impl rule__TransitionDec__Group__2 ;
    public final void rule__TransitionDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3384:1: ( rule__TransitionDec__Group__1__Impl rule__TransitionDec__Group__2 )
            // InternalComponentModel.g:3385:2: rule__TransitionDec__Group__1__Impl rule__TransitionDec__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TransitionDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDec__Group__2();

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
    // $ANTLR end "rule__TransitionDec__Group__1"


    // $ANTLR start "rule__TransitionDec__Group__1__Impl"
    // InternalComponentModel.g:3392:1: rule__TransitionDec__Group__1__Impl : ( ( rule__TransitionDec__NameEventDecAssignment_1 ) ) ;
    public final void rule__TransitionDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3396:1: ( ( ( rule__TransitionDec__NameEventDecAssignment_1 ) ) )
            // InternalComponentModel.g:3397:1: ( ( rule__TransitionDec__NameEventDecAssignment_1 ) )
            {
            // InternalComponentModel.g:3397:1: ( ( rule__TransitionDec__NameEventDecAssignment_1 ) )
            // InternalComponentModel.g:3398:2: ( rule__TransitionDec__NameEventDecAssignment_1 )
            {
             before(grammarAccess.getTransitionDecAccess().getNameEventDecAssignment_1()); 
            // InternalComponentModel.g:3399:2: ( rule__TransitionDec__NameEventDecAssignment_1 )
            // InternalComponentModel.g:3399:3: rule__TransitionDec__NameEventDecAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDec__NameEventDecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionDecAccess().getNameEventDecAssignment_1()); 

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
    // $ANTLR end "rule__TransitionDec__Group__1__Impl"


    // $ANTLR start "rule__TransitionDec__Group__2"
    // InternalComponentModel.g:3407:1: rule__TransitionDec__Group__2 : rule__TransitionDec__Group__2__Impl rule__TransitionDec__Group__3 ;
    public final void rule__TransitionDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3411:1: ( rule__TransitionDec__Group__2__Impl rule__TransitionDec__Group__3 )
            // InternalComponentModel.g:3412:2: rule__TransitionDec__Group__2__Impl rule__TransitionDec__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__TransitionDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDec__Group__3();

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
    // $ANTLR end "rule__TransitionDec__Group__2"


    // $ANTLR start "rule__TransitionDec__Group__2__Impl"
    // InternalComponentModel.g:3419:1: rule__TransitionDec__Group__2__Impl : ( '{' ) ;
    public final void rule__TransitionDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3423:1: ( ( '{' ) )
            // InternalComponentModel.g:3424:1: ( '{' )
            {
            // InternalComponentModel.g:3424:1: ( '{' )
            // InternalComponentModel.g:3425:2: '{'
            {
             before(grammarAccess.getTransitionDecAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionDecAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TransitionDec__Group__2__Impl"


    // $ANTLR start "rule__TransitionDec__Group__3"
    // InternalComponentModel.g:3434:1: rule__TransitionDec__Group__3 : rule__TransitionDec__Group__3__Impl rule__TransitionDec__Group__4 ;
    public final void rule__TransitionDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3438:1: ( rule__TransitionDec__Group__3__Impl rule__TransitionDec__Group__4 )
            // InternalComponentModel.g:3439:2: rule__TransitionDec__Group__3__Impl rule__TransitionDec__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__TransitionDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDec__Group__4();

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
    // $ANTLR end "rule__TransitionDec__Group__3"


    // $ANTLR start "rule__TransitionDec__Group__3__Impl"
    // InternalComponentModel.g:3446:1: rule__TransitionDec__Group__3__Impl : ( ( rule__TransitionDec__FeaturesAssignment_3 )* ) ;
    public final void rule__TransitionDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3450:1: ( ( ( rule__TransitionDec__FeaturesAssignment_3 )* ) )
            // InternalComponentModel.g:3451:1: ( ( rule__TransitionDec__FeaturesAssignment_3 )* )
            {
            // InternalComponentModel.g:3451:1: ( ( rule__TransitionDec__FeaturesAssignment_3 )* )
            // InternalComponentModel.g:3452:2: ( rule__TransitionDec__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getTransitionDecAccess().getFeaturesAssignment_3()); 
            // InternalComponentModel.g:3453:2: ( rule__TransitionDec__FeaturesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=33)||(LA15_0>=35 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentModel.g:3453:3: rule__TransitionDec__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__TransitionDec__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTransitionDecAccess().getFeaturesAssignment_3()); 

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
    // $ANTLR end "rule__TransitionDec__Group__3__Impl"


    // $ANTLR start "rule__TransitionDec__Group__4"
    // InternalComponentModel.g:3461:1: rule__TransitionDec__Group__4 : rule__TransitionDec__Group__4__Impl ;
    public final void rule__TransitionDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3465:1: ( rule__TransitionDec__Group__4__Impl )
            // InternalComponentModel.g:3466:2: rule__TransitionDec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDec__Group__4__Impl();

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
    // $ANTLR end "rule__TransitionDec__Group__4"


    // $ANTLR start "rule__TransitionDec__Group__4__Impl"
    // InternalComponentModel.g:3472:1: rule__TransitionDec__Group__4__Impl : ( '}' ) ;
    public final void rule__TransitionDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3476:1: ( ( '}' ) )
            // InternalComponentModel.g:3477:1: ( '}' )
            {
            // InternalComponentModel.g:3477:1: ( '}' )
            // InternalComponentModel.g:3478:2: '}'
            {
             before(grammarAccess.getTransitionDecAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionDecAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__TransitionDec__Group__4__Impl"


    // $ANTLR start "rule__TransitionFeatureDec__Group_3__0"
    // InternalComponentModel.g:3488:1: rule__TransitionFeatureDec__Group_3__0 : rule__TransitionFeatureDec__Group_3__0__Impl rule__TransitionFeatureDec__Group_3__1 ;
    public final void rule__TransitionFeatureDec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3492:1: ( rule__TransitionFeatureDec__Group_3__0__Impl rule__TransitionFeatureDec__Group_3__1 )
            // InternalComponentModel.g:3493:2: rule__TransitionFeatureDec__Group_3__0__Impl rule__TransitionFeatureDec__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionFeatureDec__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionFeatureDec__Group_3__1();

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
    // $ANTLR end "rule__TransitionFeatureDec__Group_3__0"


    // $ANTLR start "rule__TransitionFeatureDec__Group_3__0__Impl"
    // InternalComponentModel.g:3500:1: rule__TransitionFeatureDec__Group_3__0__Impl : ( 'occurrence' ) ;
    public final void rule__TransitionFeatureDec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3504:1: ( ( 'occurrence' ) )
            // InternalComponentModel.g:3505:1: ( 'occurrence' )
            {
            // InternalComponentModel.g:3505:1: ( 'occurrence' )
            // InternalComponentModel.g:3506:2: 'occurrence'
            {
             before(grammarAccess.getTransitionFeatureDecAccess().getOccurrenceKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTransitionFeatureDecAccess().getOccurrenceKeyword_3_0()); 

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
    // $ANTLR end "rule__TransitionFeatureDec__Group_3__0__Impl"


    // $ANTLR start "rule__TransitionFeatureDec__Group_3__1"
    // InternalComponentModel.g:3515:1: rule__TransitionFeatureDec__Group_3__1 : rule__TransitionFeatureDec__Group_3__1__Impl rule__TransitionFeatureDec__Group_3__2 ;
    public final void rule__TransitionFeatureDec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3519:1: ( rule__TransitionFeatureDec__Group_3__1__Impl rule__TransitionFeatureDec__Group_3__2 )
            // InternalComponentModel.g:3520:2: rule__TransitionFeatureDec__Group_3__1__Impl rule__TransitionFeatureDec__Group_3__2
            {
            pushFollow(FOLLOW_32);
            rule__TransitionFeatureDec__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionFeatureDec__Group_3__2();

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
    // $ANTLR end "rule__TransitionFeatureDec__Group_3__1"


    // $ANTLR start "rule__TransitionFeatureDec__Group_3__1__Impl"
    // InternalComponentModel.g:3527:1: rule__TransitionFeatureDec__Group_3__1__Impl : ( () ) ;
    public final void rule__TransitionFeatureDec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3531:1: ( ( () ) )
            // InternalComponentModel.g:3532:1: ( () )
            {
            // InternalComponentModel.g:3532:1: ( () )
            // InternalComponentModel.g:3533:2: ()
            {
             before(grammarAccess.getTransitionFeatureDecAccess().getOccurrenceDecAction_3_1()); 
            // InternalComponentModel.g:3534:2: ()
            // InternalComponentModel.g:3534:3: 
            {
            }

             after(grammarAccess.getTransitionFeatureDecAccess().getOccurrenceDecAction_3_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionFeatureDec__Group_3__1__Impl"


    // $ANTLR start "rule__TransitionFeatureDec__Group_3__2"
    // InternalComponentModel.g:3542:1: rule__TransitionFeatureDec__Group_3__2 : rule__TransitionFeatureDec__Group_3__2__Impl ;
    public final void rule__TransitionFeatureDec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3546:1: ( rule__TransitionFeatureDec__Group_3__2__Impl )
            // InternalComponentModel.g:3547:2: rule__TransitionFeatureDec__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionFeatureDec__Group_3__2__Impl();

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
    // $ANTLR end "rule__TransitionFeatureDec__Group_3__2"


    // $ANTLR start "rule__TransitionFeatureDec__Group_3__2__Impl"
    // InternalComponentModel.g:3553:1: rule__TransitionFeatureDec__Group_3__2__Impl : ( ruleDOUBLE ) ;
    public final void rule__TransitionFeatureDec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3557:1: ( ( ruleDOUBLE ) )
            // InternalComponentModel.g:3558:1: ( ruleDOUBLE )
            {
            // InternalComponentModel.g:3558:1: ( ruleDOUBLE )
            // InternalComponentModel.g:3559:2: ruleDOUBLE
            {
             before(grammarAccess.getTransitionFeatureDecAccess().getDOUBLEParserRuleCall_3_2()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getTransitionFeatureDecAccess().getDOUBLEParserRuleCall_3_2()); 

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
    // $ANTLR end "rule__TransitionFeatureDec__Group_3__2__Impl"


    // $ANTLR start "rule__TransitionState__Group__0"
    // InternalComponentModel.g:3569:1: rule__TransitionState__Group__0 : rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 ;
    public final void rule__TransitionState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3573:1: ( rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 )
            // InternalComponentModel.g:3574:2: rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TransitionState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__1();

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
    // $ANTLR end "rule__TransitionState__Group__0"


    // $ANTLR start "rule__TransitionState__Group__0__Impl"
    // InternalComponentModel.g:3581:1: rule__TransitionState__Group__0__Impl : ( 'states' ) ;
    public final void rule__TransitionState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3585:1: ( ( 'states' ) )
            // InternalComponentModel.g:3586:1: ( 'states' )
            {
            // InternalComponentModel.g:3586:1: ( 'states' )
            // InternalComponentModel.g:3587:2: 'states'
            {
             before(grammarAccess.getTransitionStateAccess().getStatesKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getStatesKeyword_0()); 

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
    // $ANTLR end "rule__TransitionState__Group__0__Impl"


    // $ANTLR start "rule__TransitionState__Group__1"
    // InternalComponentModel.g:3596:1: rule__TransitionState__Group__1 : rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 ;
    public final void rule__TransitionState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3600:1: ( rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 )
            // InternalComponentModel.g:3601:2: rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__TransitionState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__2();

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
    // $ANTLR end "rule__TransitionState__Group__1"


    // $ANTLR start "rule__TransitionState__Group__1__Impl"
    // InternalComponentModel.g:3608:1: rule__TransitionState__Group__1__Impl : ( ( rule__TransitionState__SourceStateAssignment_1 ) ) ;
    public final void rule__TransitionState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3612:1: ( ( ( rule__TransitionState__SourceStateAssignment_1 ) ) )
            // InternalComponentModel.g:3613:1: ( ( rule__TransitionState__SourceStateAssignment_1 ) )
            {
            // InternalComponentModel.g:3613:1: ( ( rule__TransitionState__SourceStateAssignment_1 ) )
            // InternalComponentModel.g:3614:2: ( rule__TransitionState__SourceStateAssignment_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getSourceStateAssignment_1()); 
            // InternalComponentModel.g:3615:2: ( rule__TransitionState__SourceStateAssignment_1 )
            // InternalComponentModel.g:3615:3: rule__TransitionState__SourceStateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__SourceStateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getSourceStateAssignment_1()); 

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
    // $ANTLR end "rule__TransitionState__Group__1__Impl"


    // $ANTLR start "rule__TransitionState__Group__2"
    // InternalComponentModel.g:3623:1: rule__TransitionState__Group__2 : rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 ;
    public final void rule__TransitionState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3627:1: ( rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 )
            // InternalComponentModel.g:3628:2: rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TransitionState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__3();

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
    // $ANTLR end "rule__TransitionState__Group__2"


    // $ANTLR start "rule__TransitionState__Group__2__Impl"
    // InternalComponentModel.g:3635:1: rule__TransitionState__Group__2__Impl : ( '->' ) ;
    public final void rule__TransitionState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3639:1: ( ( '->' ) )
            // InternalComponentModel.g:3640:1: ( '->' )
            {
            // InternalComponentModel.g:3640:1: ( '->' )
            // InternalComponentModel.g:3641:2: '->'
            {
             before(grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__TransitionState__Group__2__Impl"


    // $ANTLR start "rule__TransitionState__Group__3"
    // InternalComponentModel.g:3650:1: rule__TransitionState__Group__3 : rule__TransitionState__Group__3__Impl ;
    public final void rule__TransitionState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3654:1: ( rule__TransitionState__Group__3__Impl )
            // InternalComponentModel.g:3655:2: rule__TransitionState__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__3__Impl();

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
    // $ANTLR end "rule__TransitionState__Group__3"


    // $ANTLR start "rule__TransitionState__Group__3__Impl"
    // InternalComponentModel.g:3661:1: rule__TransitionState__Group__3__Impl : ( ( rule__TransitionState__TargetStateAssignment_3 ) ) ;
    public final void rule__TransitionState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3665:1: ( ( ( rule__TransitionState__TargetStateAssignment_3 ) ) )
            // InternalComponentModel.g:3666:1: ( ( rule__TransitionState__TargetStateAssignment_3 ) )
            {
            // InternalComponentModel.g:3666:1: ( ( rule__TransitionState__TargetStateAssignment_3 ) )
            // InternalComponentModel.g:3667:2: ( rule__TransitionState__TargetStateAssignment_3 )
            {
             before(grammarAccess.getTransitionStateAccess().getTargetStateAssignment_3()); 
            // InternalComponentModel.g:3668:2: ( rule__TransitionState__TargetStateAssignment_3 )
            // InternalComponentModel.g:3668:3: rule__TransitionState__TargetStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__TargetStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getTargetStateAssignment_3()); 

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
    // $ANTLR end "rule__TransitionState__Group__3__Impl"


    // $ANTLR start "rule__TriggerDec__Group__0"
    // InternalComponentModel.g:3677:1: rule__TriggerDec__Group__0 : rule__TriggerDec__Group__0__Impl rule__TriggerDec__Group__1 ;
    public final void rule__TriggerDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3681:1: ( rule__TriggerDec__Group__0__Impl rule__TriggerDec__Group__1 )
            // InternalComponentModel.g:3682:2: rule__TriggerDec__Group__0__Impl rule__TriggerDec__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TriggerDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__1();

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
    // $ANTLR end "rule__TriggerDec__Group__0"


    // $ANTLR start "rule__TriggerDec__Group__0__Impl"
    // InternalComponentModel.g:3689:1: rule__TriggerDec__Group__0__Impl : ( 'trigger' ) ;
    public final void rule__TriggerDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3693:1: ( ( 'trigger' ) )
            // InternalComponentModel.g:3694:1: ( 'trigger' )
            {
            // InternalComponentModel.g:3694:1: ( 'trigger' )
            // InternalComponentModel.g:3695:2: 'trigger'
            {
             before(grammarAccess.getTriggerDecAccess().getTriggerKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTriggerDecAccess().getTriggerKeyword_0()); 

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
    // $ANTLR end "rule__TriggerDec__Group__0__Impl"


    // $ANTLR start "rule__TriggerDec__Group__1"
    // InternalComponentModel.g:3704:1: rule__TriggerDec__Group__1 : rule__TriggerDec__Group__1__Impl rule__TriggerDec__Group__2 ;
    public final void rule__TriggerDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3708:1: ( rule__TriggerDec__Group__1__Impl rule__TriggerDec__Group__2 )
            // InternalComponentModel.g:3709:2: rule__TriggerDec__Group__1__Impl rule__TriggerDec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TriggerDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__2();

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
    // $ANTLR end "rule__TriggerDec__Group__1"


    // $ANTLR start "rule__TriggerDec__Group__1__Impl"
    // InternalComponentModel.g:3716:1: rule__TriggerDec__Group__1__Impl : ( ( rule__TriggerDec__NameAssignment_1 ) ) ;
    public final void rule__TriggerDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3720:1: ( ( ( rule__TriggerDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:3721:1: ( ( rule__TriggerDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:3721:1: ( ( rule__TriggerDec__NameAssignment_1 ) )
            // InternalComponentModel.g:3722:2: ( rule__TriggerDec__NameAssignment_1 )
            {
             before(grammarAccess.getTriggerDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:3723:2: ( rule__TriggerDec__NameAssignment_1 )
            // InternalComponentModel.g:3723:3: rule__TriggerDec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDecAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TriggerDec__Group__1__Impl"


    // $ANTLR start "rule__TriggerDec__Group__2"
    // InternalComponentModel.g:3731:1: rule__TriggerDec__Group__2 : rule__TriggerDec__Group__2__Impl rule__TriggerDec__Group__3 ;
    public final void rule__TriggerDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3735:1: ( rule__TriggerDec__Group__2__Impl rule__TriggerDec__Group__3 )
            // InternalComponentModel.g:3736:2: rule__TriggerDec__Group__2__Impl rule__TriggerDec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TriggerDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__3();

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
    // $ANTLR end "rule__TriggerDec__Group__2"


    // $ANTLR start "rule__TriggerDec__Group__2__Impl"
    // InternalComponentModel.g:3743:1: rule__TriggerDec__Group__2__Impl : ( ':' ) ;
    public final void rule__TriggerDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3747:1: ( ( ':' ) )
            // InternalComponentModel.g:3748:1: ( ':' )
            {
            // InternalComponentModel.g:3748:1: ( ':' )
            // InternalComponentModel.g:3749:2: ':'
            {
             before(grammarAccess.getTriggerDecAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTriggerDecAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__TriggerDec__Group__2__Impl"


    // $ANTLR start "rule__TriggerDec__Group__3"
    // InternalComponentModel.g:3758:1: rule__TriggerDec__Group__3 : rule__TriggerDec__Group__3__Impl rule__TriggerDec__Group__4 ;
    public final void rule__TriggerDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3762:1: ( rule__TriggerDec__Group__3__Impl rule__TriggerDec__Group__4 )
            // InternalComponentModel.g:3763:2: rule__TriggerDec__Group__3__Impl rule__TriggerDec__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TriggerDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__4();

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
    // $ANTLR end "rule__TriggerDec__Group__3"


    // $ANTLR start "rule__TriggerDec__Group__3__Impl"
    // InternalComponentModel.g:3770:1: rule__TriggerDec__Group__3__Impl : ( ( rule__TriggerDec__PortInstanceAssignment_3 ) ) ;
    public final void rule__TriggerDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3774:1: ( ( ( rule__TriggerDec__PortInstanceAssignment_3 ) ) )
            // InternalComponentModel.g:3775:1: ( ( rule__TriggerDec__PortInstanceAssignment_3 ) )
            {
            // InternalComponentModel.g:3775:1: ( ( rule__TriggerDec__PortInstanceAssignment_3 ) )
            // InternalComponentModel.g:3776:2: ( rule__TriggerDec__PortInstanceAssignment_3 )
            {
             before(grammarAccess.getTriggerDecAccess().getPortInstanceAssignment_3()); 
            // InternalComponentModel.g:3777:2: ( rule__TriggerDec__PortInstanceAssignment_3 )
            // InternalComponentModel.g:3777:3: rule__TriggerDec__PortInstanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDec__PortInstanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDecAccess().getPortInstanceAssignment_3()); 

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
    // $ANTLR end "rule__TriggerDec__Group__3__Impl"


    // $ANTLR start "rule__TriggerDec__Group__4"
    // InternalComponentModel.g:3785:1: rule__TriggerDec__Group__4 : rule__TriggerDec__Group__4__Impl rule__TriggerDec__Group__5 ;
    public final void rule__TriggerDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3789:1: ( rule__TriggerDec__Group__4__Impl rule__TriggerDec__Group__5 )
            // InternalComponentModel.g:3790:2: rule__TriggerDec__Group__4__Impl rule__TriggerDec__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TriggerDec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__5();

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
    // $ANTLR end "rule__TriggerDec__Group__4"


    // $ANTLR start "rule__TriggerDec__Group__4__Impl"
    // InternalComponentModel.g:3797:1: rule__TriggerDec__Group__4__Impl : ( '.' ) ;
    public final void rule__TriggerDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3801:1: ( ( '.' ) )
            // InternalComponentModel.g:3802:1: ( '.' )
            {
            // InternalComponentModel.g:3802:1: ( '.' )
            // InternalComponentModel.g:3803:2: '.'
            {
             before(grammarAccess.getTriggerDecAccess().getFullStopKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTriggerDecAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__TriggerDec__Group__4__Impl"


    // $ANTLR start "rule__TriggerDec__Group__5"
    // InternalComponentModel.g:3812:1: rule__TriggerDec__Group__5 : rule__TriggerDec__Group__5__Impl ;
    public final void rule__TriggerDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3816:1: ( rule__TriggerDec__Group__5__Impl )
            // InternalComponentModel.g:3817:2: rule__TriggerDec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDec__Group__5__Impl();

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
    // $ANTLR end "rule__TriggerDec__Group__5"


    // $ANTLR start "rule__TriggerDec__Group__5__Impl"
    // InternalComponentModel.g:3823:1: rule__TriggerDec__Group__5__Impl : ( ( rule__TriggerDec__ErrorModeAssignment_5 ) ) ;
    public final void rule__TriggerDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3827:1: ( ( ( rule__TriggerDec__ErrorModeAssignment_5 ) ) )
            // InternalComponentModel.g:3828:1: ( ( rule__TriggerDec__ErrorModeAssignment_5 ) )
            {
            // InternalComponentModel.g:3828:1: ( ( rule__TriggerDec__ErrorModeAssignment_5 ) )
            // InternalComponentModel.g:3829:2: ( rule__TriggerDec__ErrorModeAssignment_5 )
            {
             before(grammarAccess.getTriggerDecAccess().getErrorModeAssignment_5()); 
            // InternalComponentModel.g:3830:2: ( rule__TriggerDec__ErrorModeAssignment_5 )
            // InternalComponentModel.g:3830:3: rule__TriggerDec__ErrorModeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDec__ErrorModeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDecAccess().getErrorModeAssignment_5()); 

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
    // $ANTLR end "rule__TriggerDec__Group__5__Impl"


    // $ANTLR start "rule__ActionDec__Group__0"
    // InternalComponentModel.g:3839:1: rule__ActionDec__Group__0 : rule__ActionDec__Group__0__Impl rule__ActionDec__Group__1 ;
    public final void rule__ActionDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3843:1: ( rule__ActionDec__Group__0__Impl rule__ActionDec__Group__1 )
            // InternalComponentModel.g:3844:2: rule__ActionDec__Group__0__Impl rule__ActionDec__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ActionDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__1();

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
    // $ANTLR end "rule__ActionDec__Group__0"


    // $ANTLR start "rule__ActionDec__Group__0__Impl"
    // InternalComponentModel.g:3851:1: rule__ActionDec__Group__0__Impl : ( 'action' ) ;
    public final void rule__ActionDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3855:1: ( ( 'action' ) )
            // InternalComponentModel.g:3856:1: ( 'action' )
            {
            // InternalComponentModel.g:3856:1: ( 'action' )
            // InternalComponentModel.g:3857:2: 'action'
            {
             before(grammarAccess.getActionDecAccess().getActionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActionDecAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__ActionDec__Group__0__Impl"


    // $ANTLR start "rule__ActionDec__Group__1"
    // InternalComponentModel.g:3866:1: rule__ActionDec__Group__1 : rule__ActionDec__Group__1__Impl rule__ActionDec__Group__2 ;
    public final void rule__ActionDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3870:1: ( rule__ActionDec__Group__1__Impl rule__ActionDec__Group__2 )
            // InternalComponentModel.g:3871:2: rule__ActionDec__Group__1__Impl rule__ActionDec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ActionDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__2();

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
    // $ANTLR end "rule__ActionDec__Group__1"


    // $ANTLR start "rule__ActionDec__Group__1__Impl"
    // InternalComponentModel.g:3878:1: rule__ActionDec__Group__1__Impl : ( ( rule__ActionDec__NameAssignment_1 ) ) ;
    public final void rule__ActionDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3882:1: ( ( ( rule__ActionDec__NameAssignment_1 ) ) )
            // InternalComponentModel.g:3883:1: ( ( rule__ActionDec__NameAssignment_1 ) )
            {
            // InternalComponentModel.g:3883:1: ( ( rule__ActionDec__NameAssignment_1 ) )
            // InternalComponentModel.g:3884:2: ( rule__ActionDec__NameAssignment_1 )
            {
             before(grammarAccess.getActionDecAccess().getNameAssignment_1()); 
            // InternalComponentModel.g:3885:2: ( rule__ActionDec__NameAssignment_1 )
            // InternalComponentModel.g:3885:3: rule__ActionDec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionDec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionDecAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ActionDec__Group__1__Impl"


    // $ANTLR start "rule__ActionDec__Group__2"
    // InternalComponentModel.g:3893:1: rule__ActionDec__Group__2 : rule__ActionDec__Group__2__Impl rule__ActionDec__Group__3 ;
    public final void rule__ActionDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3897:1: ( rule__ActionDec__Group__2__Impl rule__ActionDec__Group__3 )
            // InternalComponentModel.g:3898:2: rule__ActionDec__Group__2__Impl rule__ActionDec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ActionDec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__3();

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
    // $ANTLR end "rule__ActionDec__Group__2"


    // $ANTLR start "rule__ActionDec__Group__2__Impl"
    // InternalComponentModel.g:3905:1: rule__ActionDec__Group__2__Impl : ( ':' ) ;
    public final void rule__ActionDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3909:1: ( ( ':' ) )
            // InternalComponentModel.g:3910:1: ( ':' )
            {
            // InternalComponentModel.g:3910:1: ( ':' )
            // InternalComponentModel.g:3911:2: ':'
            {
             before(grammarAccess.getActionDecAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionDecAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ActionDec__Group__2__Impl"


    // $ANTLR start "rule__ActionDec__Group__3"
    // InternalComponentModel.g:3920:1: rule__ActionDec__Group__3 : rule__ActionDec__Group__3__Impl rule__ActionDec__Group__4 ;
    public final void rule__ActionDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3924:1: ( rule__ActionDec__Group__3__Impl rule__ActionDec__Group__4 )
            // InternalComponentModel.g:3925:2: rule__ActionDec__Group__3__Impl rule__ActionDec__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ActionDec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__4();

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
    // $ANTLR end "rule__ActionDec__Group__3"


    // $ANTLR start "rule__ActionDec__Group__3__Impl"
    // InternalComponentModel.g:3932:1: rule__ActionDec__Group__3__Impl : ( ( rule__ActionDec__PortInstanceAssignment_3 ) ) ;
    public final void rule__ActionDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3936:1: ( ( ( rule__ActionDec__PortInstanceAssignment_3 ) ) )
            // InternalComponentModel.g:3937:1: ( ( rule__ActionDec__PortInstanceAssignment_3 ) )
            {
            // InternalComponentModel.g:3937:1: ( ( rule__ActionDec__PortInstanceAssignment_3 ) )
            // InternalComponentModel.g:3938:2: ( rule__ActionDec__PortInstanceAssignment_3 )
            {
             before(grammarAccess.getActionDecAccess().getPortInstanceAssignment_3()); 
            // InternalComponentModel.g:3939:2: ( rule__ActionDec__PortInstanceAssignment_3 )
            // InternalComponentModel.g:3939:3: rule__ActionDec__PortInstanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ActionDec__PortInstanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionDecAccess().getPortInstanceAssignment_3()); 

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
    // $ANTLR end "rule__ActionDec__Group__3__Impl"


    // $ANTLR start "rule__ActionDec__Group__4"
    // InternalComponentModel.g:3947:1: rule__ActionDec__Group__4 : rule__ActionDec__Group__4__Impl rule__ActionDec__Group__5 ;
    public final void rule__ActionDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3951:1: ( rule__ActionDec__Group__4__Impl rule__ActionDec__Group__5 )
            // InternalComponentModel.g:3952:2: rule__ActionDec__Group__4__Impl rule__ActionDec__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ActionDec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__5();

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
    // $ANTLR end "rule__ActionDec__Group__4"


    // $ANTLR start "rule__ActionDec__Group__4__Impl"
    // InternalComponentModel.g:3959:1: rule__ActionDec__Group__4__Impl : ( '.' ) ;
    public final void rule__ActionDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3963:1: ( ( '.' ) )
            // InternalComponentModel.g:3964:1: ( '.' )
            {
            // InternalComponentModel.g:3964:1: ( '.' )
            // InternalComponentModel.g:3965:2: '.'
            {
             before(grammarAccess.getActionDecAccess().getFullStopKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getActionDecAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__ActionDec__Group__4__Impl"


    // $ANTLR start "rule__ActionDec__Group__5"
    // InternalComponentModel.g:3974:1: rule__ActionDec__Group__5 : rule__ActionDec__Group__5__Impl ;
    public final void rule__ActionDec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3978:1: ( rule__ActionDec__Group__5__Impl )
            // InternalComponentModel.g:3979:2: rule__ActionDec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDec__Group__5__Impl();

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
    // $ANTLR end "rule__ActionDec__Group__5"


    // $ANTLR start "rule__ActionDec__Group__5__Impl"
    // InternalComponentModel.g:3985:1: rule__ActionDec__Group__5__Impl : ( ( rule__ActionDec__ErrorModeAssignment_5 ) ) ;
    public final void rule__ActionDec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:3989:1: ( ( ( rule__ActionDec__ErrorModeAssignment_5 ) ) )
            // InternalComponentModel.g:3990:1: ( ( rule__ActionDec__ErrorModeAssignment_5 ) )
            {
            // InternalComponentModel.g:3990:1: ( ( rule__ActionDec__ErrorModeAssignment_5 ) )
            // InternalComponentModel.g:3991:2: ( rule__ActionDec__ErrorModeAssignment_5 )
            {
             before(grammarAccess.getActionDecAccess().getErrorModeAssignment_5()); 
            // InternalComponentModel.g:3992:2: ( rule__ActionDec__ErrorModeAssignment_5 )
            // InternalComponentModel.g:3992:3: rule__ActionDec__ErrorModeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ActionDec__ErrorModeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActionDecAccess().getErrorModeAssignment_5()); 

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
    // $ANTLR end "rule__ActionDec__Group__5__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalComponentModel.g:4001:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4005:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalComponentModel.g:4006:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalComponentModel.g:4013:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4017:1: ( ( RULE_INT ) )
            // InternalComponentModel.g:4018:1: ( RULE_INT )
            {
            // InternalComponentModel.g:4018:1: ( RULE_INT )
            // InternalComponentModel.g:4019:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalComponentModel.g:4028:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4032:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalComponentModel.g:4033:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalComponentModel.g:4040:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4044:1: ( ( '.' ) )
            // InternalComponentModel.g:4045:1: ( '.' )
            {
            // InternalComponentModel.g:4045:1: ( '.' )
            // InternalComponentModel.g:4046:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalComponentModel.g:4055:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4059:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalComponentModel.g:4060:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalComponentModel.g:4066:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4070:1: ( ( RULE_INT ) )
            // InternalComponentModel.g:4071:1: ( RULE_INT )
            {
            // InternalComponentModel.g:4071:1: ( RULE_INT )
            // InternalComponentModel.g:4072:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__ComponentModel__ElementsAssignment"
    // InternalComponentModel.g:4082:1: rule__ComponentModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ComponentModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4086:1: ( ( ruleAbstractElement ) )
            // InternalComponentModel.g:4087:2: ( ruleAbstractElement )
            {
            // InternalComponentModel.g:4087:2: ( ruleAbstractElement )
            // InternalComponentModel.g:4088:3: ruleAbstractElement
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


    // $ANTLR start "rule__PortType__NameAssignment_2"
    // InternalComponentModel.g:4097:1: rule__PortType__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PortType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4101:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4102:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4102:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4103:3: ruleQualifiedName
            {
             before(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PortType__NameAssignment_2"


    // $ANTLR start "rule__PortType__EModesAssignment_4"
    // InternalComponentModel.g:4112:1: rule__PortType__EModesAssignment_4 : ( ruleErrorModes ) ;
    public final void rule__PortType__EModesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4116:1: ( ( ruleErrorModes ) )
            // InternalComponentModel.g:4117:2: ( ruleErrorModes )
            {
            // InternalComponentModel.g:4117:2: ( ruleErrorModes )
            // InternalComponentModel.g:4118:3: ruleErrorModes
            {
             before(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleErrorModes();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PortType__EModesAssignment_4"


    // $ANTLR start "rule__ErrorModes__NameAssignment_2"
    // InternalComponentModel.g:4127:1: rule__ErrorModes__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ErrorModes__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4131:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4132:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4132:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4133:3: ruleQualifiedName
            {
             before(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ErrorModes__NameAssignment_2"


    // $ANTLR start "rule__SystemConnDec__NameAssignment_2"
    // InternalComponentModel.g:4142:1: rule__SystemConnDec__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__SystemConnDec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4146:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4147:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4147:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4148:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SystemConnDec__NameAssignment_2"


    // $ANTLR start "rule__SystemConnDec__SourceSystemAssignment_4"
    // InternalComponentModel.g:4157:1: rule__SystemConnDec__SourceSystemAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__SourceSystemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4161:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4162:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4162:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4163:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0()); 
            // InternalComponentModel.g:4164:3: ( RULE_ID )
            // InternalComponentModel.g:4165:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0()); 

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
    // $ANTLR end "rule__SystemConnDec__SourceSystemAssignment_4"


    // $ANTLR start "rule__SystemConnDec__SourcePortAssignment_6"
    // InternalComponentModel.g:4176:1: rule__SystemConnDec__SourcePortAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__SourcePortAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4180:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4181:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4181:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4182:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0()); 
            // InternalComponentModel.g:4183:3: ( RULE_ID )
            // InternalComponentModel.g:4184:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0()); 

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
    // $ANTLR end "rule__SystemConnDec__SourcePortAssignment_6"


    // $ANTLR start "rule__SystemConnDec__TargetSystemAssignment_8"
    // InternalComponentModel.g:4195:1: rule__SystemConnDec__TargetSystemAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__TargetSystemAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4199:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4200:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4200:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4201:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0()); 
            // InternalComponentModel.g:4202:3: ( RULE_ID )
            // InternalComponentModel.g:4203:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0()); 

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
    // $ANTLR end "rule__SystemConnDec__TargetSystemAssignment_8"


    // $ANTLR start "rule__SystemConnDec__TargetPortAssignment_10"
    // InternalComponentModel.g:4214:1: rule__SystemConnDec__TargetPortAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__SystemConnDec__TargetPortAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4218:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4219:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4219:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4220:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_10_0()); 
            // InternalComponentModel.g:4221:3: ( RULE_ID )
            // InternalComponentModel.g:4222:4: RULE_ID
            {
             before(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_10_0()); 

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
    // $ANTLR end "rule__SystemConnDec__TargetPortAssignment_10"


    // $ANTLR start "rule__SystemDec__NameAssignment_2"
    // InternalComponentModel.g:4233:1: rule__SystemDec__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__SystemDec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4237:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4238:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4238:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4239:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SystemDec__NameAssignment_2"


    // $ANTLR start "rule__SystemDec__SysFeaturesAssignment_4"
    // InternalComponentModel.g:4248:1: rule__SystemDec__SysFeaturesAssignment_4 : ( ruleAbstractFeatures ) ;
    public final void rule__SystemDec__SysFeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4252:1: ( ( ruleAbstractFeatures ) )
            // InternalComponentModel.g:4253:2: ( ruleAbstractFeatures )
            {
            // InternalComponentModel.g:4253:2: ( ruleAbstractFeatures )
            // InternalComponentModel.g:4254:3: ruleAbstractFeatures
            {
             before(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractFeatures();

            state._fsp--;

             after(grammarAccess.getSystemDecAccess().getSysFeaturesAbstractFeaturesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SystemDec__SysFeaturesAssignment_4"


    // $ANTLR start "rule__SystemPortIn__NameAssignment_3"
    // InternalComponentModel.g:4263:1: rule__SystemPortIn__NameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__SystemPortIn__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4267:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4268:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4268:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4269:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SystemPortIn__NameAssignment_3"


    // $ANTLR start "rule__SystemPortIn__InCompAssignment_5"
    // InternalComponentModel.g:4278:1: rule__SystemPortIn__InCompAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortIn__InCompAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4282:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4283:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4283:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4284:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0()); 
            // InternalComponentModel.g:4285:3: ( RULE_ID )
            // InternalComponentModel.g:4286:4: RULE_ID
            {
             before(grammarAccess.getSystemPortInAccess().getInCompComponentImplIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getInCompComponentImplIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0()); 

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
    // $ANTLR end "rule__SystemPortIn__InCompAssignment_5"


    // $ANTLR start "rule__SystemPortIn__InPortAssignment_7"
    // InternalComponentModel.g:4297:1: rule__SystemPortIn__InPortAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortIn__InPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4301:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4302:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4302:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4303:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_7_0()); 
            // InternalComponentModel.g:4304:3: ( RULE_ID )
            // InternalComponentModel.g:4305:4: RULE_ID
            {
             before(grammarAccess.getSystemPortInAccess().getInPortInPortIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortInAccess().getInPortInPortIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSystemPortInAccess().getInPortInPortCrossReference_7_0()); 

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
    // $ANTLR end "rule__SystemPortIn__InPortAssignment_7"


    // $ANTLR start "rule__SystemPortOut__NameAssignment_3"
    // InternalComponentModel.g:4316:1: rule__SystemPortOut__NameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__SystemPortOut__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4320:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4321:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4321:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4322:3: ruleQualifiedName
            {
             before(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SystemPortOut__NameAssignment_3"


    // $ANTLR start "rule__SystemPortOut__OutCompAssignment_5"
    // InternalComponentModel.g:4331:1: rule__SystemPortOut__OutCompAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortOut__OutCompAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4335:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4336:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4336:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4337:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0()); 
            // InternalComponentModel.g:4338:3: ( RULE_ID )
            // InternalComponentModel.g:4339:4: RULE_ID
            {
             before(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0()); 

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
    // $ANTLR end "rule__SystemPortOut__OutCompAssignment_5"


    // $ANTLR start "rule__SystemPortOut__OutPortAssignment_7"
    // InternalComponentModel.g:4350:1: rule__SystemPortOut__OutPortAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__SystemPortOut__OutPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4354:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4355:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4355:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4356:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_7_0()); 
            // InternalComponentModel.g:4357:3: ( RULE_ID )
            // InternalComponentModel.g:4358:4: RULE_ID
            {
             before(grammarAccess.getSystemPortOutAccess().getOutPortOutPortIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPortOutAccess().getOutPortOutPortIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSystemPortOutAccess().getOutPortOutPortCrossReference_7_0()); 

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
    // $ANTLR end "rule__SystemPortOut__OutPortAssignment_7"


    // $ANTLR start "rule__CompConnDec__NameAssignment_2"
    // InternalComponentModel.g:4369:1: rule__CompConnDec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CompConnDec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4373:1: ( ( RULE_ID ) )
            // InternalComponentModel.g:4374:2: ( RULE_ID )
            {
            // InternalComponentModel.g:4374:2: ( RULE_ID )
            // InternalComponentModel.g:4375:3: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompConnDec__NameAssignment_2"


    // $ANTLR start "rule__CompConnDec__SourceCompAssignment_4"
    // InternalComponentModel.g:4384:1: rule__CompConnDec__SourceCompAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__SourceCompAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4388:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4389:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4389:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4390:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_4_0()); 
            // InternalComponentModel.g:4391:3: ( RULE_ID )
            // InternalComponentModel.g:4392:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplCrossReference_4_0()); 

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
    // $ANTLR end "rule__CompConnDec__SourceCompAssignment_4"


    // $ANTLR start "rule__CompConnDec__SourcePortAssignment_6"
    // InternalComponentModel.g:4403:1: rule__CompConnDec__SourcePortAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__SourcePortAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4407:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4408:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4408:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4409:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_6_0()); 
            // InternalComponentModel.g:4410:3: ( RULE_ID )
            // InternalComponentModel.g:4411:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getSourcePortOutPortIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getSourcePortOutPortIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getSourcePortOutPortCrossReference_6_0()); 

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
    // $ANTLR end "rule__CompConnDec__SourcePortAssignment_6"


    // $ANTLR start "rule__CompConnDec__TargetCompAssignment_8"
    // InternalComponentModel.g:4422:1: rule__CompConnDec__TargetCompAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__TargetCompAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4426:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4427:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4427:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4428:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_8_0()); 
            // InternalComponentModel.g:4429:3: ( RULE_ID )
            // InternalComponentModel.g:4430:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplCrossReference_8_0()); 

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
    // $ANTLR end "rule__CompConnDec__TargetCompAssignment_8"


    // $ANTLR start "rule__CompConnDec__TargetPortAssignment_10"
    // InternalComponentModel.g:4441:1: rule__CompConnDec__TargetPortAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__CompConnDec__TargetPortAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4445:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4446:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4446:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4447:3: ( RULE_ID )
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_10_0()); 
            // InternalComponentModel.g:4448:3: ( RULE_ID )
            // InternalComponentModel.g:4449:4: RULE_ID
            {
             before(grammarAccess.getCompConnDecAccess().getTargetPortInPortIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompConnDecAccess().getTargetPortInPortIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getCompConnDecAccess().getTargetPortInPortCrossReference_10_0()); 

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
    // $ANTLR end "rule__CompConnDec__TargetPortAssignment_10"


    // $ANTLR start "rule__ComponentImpl__NameAssignment_2"
    // InternalComponentModel.g:4460:1: rule__ComponentImpl__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ComponentImpl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4464:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4465:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4465:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4466:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentImpl__NameAssignment_2"


    // $ANTLR start "rule__ComponentImpl__SuperTypeAssignment_4"
    // InternalComponentModel.g:4475:1: rule__ComponentImpl__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentImpl__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4479:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4480:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4480:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4481:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_4_0()); 
            // InternalComponentModel.g:4482:3: ( RULE_ID )
            // InternalComponentModel.g:4483:4: RULE_ID
            {
             before(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__ComponentImpl__SuperTypeAssignment_4"


    // $ANTLR start "rule__ComponentType__NameAssignment_2"
    // InternalComponentModel.g:4494:1: rule__ComponentType__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ComponentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4498:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4499:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4499:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4500:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentType__NameAssignment_2"


    // $ANTLR start "rule__ComponentType__ComponentFeaturesAssignment_4"
    // InternalComponentModel.g:4509:1: rule__ComponentType__ComponentFeaturesAssignment_4 : ( ruleAbstractComponentFeatures ) ;
    public final void rule__ComponentType__ComponentFeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4513:1: ( ( ruleAbstractComponentFeatures ) )
            // InternalComponentModel.g:4514:2: ( ruleAbstractComponentFeatures )
            {
            // InternalComponentModel.g:4514:2: ( ruleAbstractComponentFeatures )
            // InternalComponentModel.g:4515:3: ruleAbstractComponentFeatures
            {
             before(grammarAccess.getComponentTypeAccess().getComponentFeaturesAbstractComponentFeaturesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentFeatures();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getComponentFeaturesAbstractComponentFeaturesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ComponentType__ComponentFeaturesAssignment_4"


    // $ANTLR start "rule__InPort__NameInPortAssignment_3"
    // InternalComponentModel.g:4524:1: rule__InPort__NameInPortAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__InPort__NameInPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4528:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4529:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4529:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4530:3: ruleQualifiedName
            {
             before(grammarAccess.getInPortAccess().getNameInPortQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInPortAccess().getNameInPortQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InPort__NameInPortAssignment_3"


    // $ANTLR start "rule__InPort__SuperTypeAssignment_5"
    // InternalComponentModel.g:4539:1: rule__InPort__SuperTypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InPort__SuperTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4543:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4544:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4544:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4545:3: ( RULE_ID )
            {
             before(grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_5_0()); 
            // InternalComponentModel.g:4546:3: ( RULE_ID )
            // InternalComponentModel.g:4547:4: RULE_ID
            {
             before(grammarAccess.getInPortAccess().getSuperTypePortTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInPortAccess().getSuperTypePortTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInPortAccess().getSuperTypePortTypeCrossReference_5_0()); 

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
    // $ANTLR end "rule__InPort__SuperTypeAssignment_5"


    // $ANTLR start "rule__OutPort__NameOutPortAssignment_3"
    // InternalComponentModel.g:4558:1: rule__OutPort__NameOutPortAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__OutPort__NameOutPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4562:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4563:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4563:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4564:3: ruleQualifiedName
            {
             before(grammarAccess.getOutPortAccess().getNameOutPortQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOutPortAccess().getNameOutPortQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OutPort__NameOutPortAssignment_3"


    // $ANTLR start "rule__OutPort__SuperTypeAssignment_5"
    // InternalComponentModel.g:4573:1: rule__OutPort__SuperTypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__OutPort__SuperTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4577:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4578:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4578:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4579:3: ( RULE_ID )
            {
             before(grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_5_0()); 
            // InternalComponentModel.g:4580:3: ( RULE_ID )
            // InternalComponentModel.g:4581:4: RULE_ID
            {
             before(grammarAccess.getOutPortAccess().getSuperTypePortTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutPortAccess().getSuperTypePortTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOutPortAccess().getSuperTypePortTypeCrossReference_5_0()); 

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
    // $ANTLR end "rule__OutPort__SuperTypeAssignment_5"


    // $ANTLR start "rule__EModelDec__NameEModelDecAssignment_2"
    // InternalComponentModel.g:4592:1: rule__EModelDec__NameEModelDecAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EModelDec__NameEModelDecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4596:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4597:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4597:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4598:3: ruleQualifiedName
            {
             before(grammarAccess.getEModelDecAccess().getNameEModelDecQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEModelDecAccess().getNameEModelDecQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EModelDec__NameEModelDecAssignment_2"


    // $ANTLR start "rule__EModelDec__EmodelElementsAssignment_4"
    // InternalComponentModel.g:4607:1: rule__EModelDec__EmodelElementsAssignment_4 : ( ruleEModelElement ) ;
    public final void rule__EModelDec__EmodelElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4611:1: ( ( ruleEModelElement ) )
            // InternalComponentModel.g:4612:2: ( ruleEModelElement )
            {
            // InternalComponentModel.g:4612:2: ( ruleEModelElement )
            // InternalComponentModel.g:4613:3: ruleEModelElement
            {
             before(grammarAccess.getEModelDecAccess().getEmodelElementsEModelElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEModelElement();

            state._fsp--;

             after(grammarAccess.getEModelDecAccess().getEmodelElementsEModelElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__EModelDec__EmodelElementsAssignment_4"


    // $ANTLR start "rule__StateDec__NameStateDecAssignment_2"
    // InternalComponentModel.g:4622:1: rule__StateDec__NameStateDecAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__StateDec__NameStateDecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4626:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4627:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4627:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4628:3: ruleQualifiedName
            {
             before(grammarAccess.getStateDecAccess().getNameStateDecQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStateDecAccess().getNameStateDecQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StateDec__NameStateDecAssignment_2"


    // $ANTLR start "rule__TransitionDec__NameEventDecAssignment_1"
    // InternalComponentModel.g:4637:1: rule__TransitionDec__NameEventDecAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TransitionDec__NameEventDecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4641:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4642:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4642:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4643:3: ruleQualifiedName
            {
             before(grammarAccess.getTransitionDecAccess().getNameEventDecQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTransitionDecAccess().getNameEventDecQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TransitionDec__NameEventDecAssignment_1"


    // $ANTLR start "rule__TransitionDec__FeaturesAssignment_3"
    // InternalComponentModel.g:4652:1: rule__TransitionDec__FeaturesAssignment_3 : ( ruleTransitionFeatureDec ) ;
    public final void rule__TransitionDec__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4656:1: ( ( ruleTransitionFeatureDec ) )
            // InternalComponentModel.g:4657:2: ( ruleTransitionFeatureDec )
            {
            // InternalComponentModel.g:4657:2: ( ruleTransitionFeatureDec )
            // InternalComponentModel.g:4658:3: ruleTransitionFeatureDec
            {
             before(grammarAccess.getTransitionDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionFeatureDec();

            state._fsp--;

             after(grammarAccess.getTransitionDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TransitionDec__FeaturesAssignment_3"


    // $ANTLR start "rule__TransitionState__SourceStateAssignment_1"
    // InternalComponentModel.g:4667:1: rule__TransitionState__SourceStateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionState__SourceStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4671:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4672:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4672:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4673:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_1_0()); 
            // InternalComponentModel.g:4674:3: ( RULE_ID )
            // InternalComponentModel.g:4675:4: RULE_ID
            {
             before(grammarAccess.getTransitionStateAccess().getSourceStateStateDecIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getSourceStateStateDecIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_1_0()); 

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
    // $ANTLR end "rule__TransitionState__SourceStateAssignment_1"


    // $ANTLR start "rule__TransitionState__TargetStateAssignment_3"
    // InternalComponentModel.g:4686:1: rule__TransitionState__TargetStateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionState__TargetStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4690:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4691:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4691:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4692:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionStateAccess().getTargetStateStateDecCrossReference_3_0()); 
            // InternalComponentModel.g:4693:3: ( RULE_ID )
            // InternalComponentModel.g:4694:4: RULE_ID
            {
             before(grammarAccess.getTransitionStateAccess().getTargetStateStateDecIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getTargetStateStateDecIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getTargetStateStateDecCrossReference_3_0()); 

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
    // $ANTLR end "rule__TransitionState__TargetStateAssignment_3"


    // $ANTLR start "rule__TriggerDec__NameAssignment_1"
    // InternalComponentModel.g:4705:1: rule__TriggerDec__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TriggerDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4709:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4710:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4710:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4711:3: ruleQualifiedName
            {
             before(grammarAccess.getTriggerDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTriggerDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TriggerDec__NameAssignment_1"


    // $ANTLR start "rule__TriggerDec__PortInstanceAssignment_3"
    // InternalComponentModel.g:4720:1: rule__TriggerDec__PortInstanceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerDec__PortInstanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4724:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4725:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4725:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4726:3: ( RULE_ID )
            {
             before(grammarAccess.getTriggerDecAccess().getPortInstancePortCrossReference_3_0()); 
            // InternalComponentModel.g:4727:3: ( RULE_ID )
            // InternalComponentModel.g:4728:4: RULE_ID
            {
             before(grammarAccess.getTriggerDecAccess().getPortInstancePortIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerDecAccess().getPortInstancePortIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTriggerDecAccess().getPortInstancePortCrossReference_3_0()); 

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
    // $ANTLR end "rule__TriggerDec__PortInstanceAssignment_3"


    // $ANTLR start "rule__TriggerDec__ErrorModeAssignment_5"
    // InternalComponentModel.g:4739:1: rule__TriggerDec__ErrorModeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerDec__ErrorModeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4743:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4744:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4744:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4745:3: ( RULE_ID )
            {
             before(grammarAccess.getTriggerDecAccess().getErrorModeErrorModesCrossReference_5_0()); 
            // InternalComponentModel.g:4746:3: ( RULE_ID )
            // InternalComponentModel.g:4747:4: RULE_ID
            {
             before(grammarAccess.getTriggerDecAccess().getErrorModeErrorModesIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerDecAccess().getErrorModeErrorModesIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTriggerDecAccess().getErrorModeErrorModesCrossReference_5_0()); 

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
    // $ANTLR end "rule__TriggerDec__ErrorModeAssignment_5"


    // $ANTLR start "rule__ActionDec__NameAssignment_1"
    // InternalComponentModel.g:4758:1: rule__ActionDec__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ActionDec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4762:1: ( ( ruleQualifiedName ) )
            // InternalComponentModel.g:4763:2: ( ruleQualifiedName )
            {
            // InternalComponentModel.g:4763:2: ( ruleQualifiedName )
            // InternalComponentModel.g:4764:3: ruleQualifiedName
            {
             before(grammarAccess.getActionDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActionDecAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ActionDec__NameAssignment_1"


    // $ANTLR start "rule__ActionDec__PortInstanceAssignment_3"
    // InternalComponentModel.g:4773:1: rule__ActionDec__PortInstanceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ActionDec__PortInstanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4777:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4778:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4778:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4779:3: ( RULE_ID )
            {
             before(grammarAccess.getActionDecAccess().getPortInstancePortCrossReference_3_0()); 
            // InternalComponentModel.g:4780:3: ( RULE_ID )
            // InternalComponentModel.g:4781:4: RULE_ID
            {
             before(grammarAccess.getActionDecAccess().getPortInstancePortIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionDecAccess().getPortInstancePortIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getActionDecAccess().getPortInstancePortCrossReference_3_0()); 

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
    // $ANTLR end "rule__ActionDec__PortInstanceAssignment_3"


    // $ANTLR start "rule__ActionDec__ErrorModeAssignment_5"
    // InternalComponentModel.g:4792:1: rule__ActionDec__ErrorModeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ActionDec__ErrorModeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentModel.g:4796:1: ( ( ( RULE_ID ) ) )
            // InternalComponentModel.g:4797:2: ( ( RULE_ID ) )
            {
            // InternalComponentModel.g:4797:2: ( ( RULE_ID ) )
            // InternalComponentModel.g:4798:3: ( RULE_ID )
            {
             before(grammarAccess.getActionDecAccess().getErrorModeErrorModesCrossReference_5_0()); 
            // InternalComponentModel.g:4799:3: ( RULE_ID )
            // InternalComponentModel.g:4800:4: RULE_ID
            {
             before(grammarAccess.getActionDecAccess().getErrorModeErrorModesIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionDecAccess().getErrorModeErrorModesIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getActionDecAccess().getErrorModeErrorModesCrossReference_5_0()); 

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
    // $ANTLR end "rule__ActionDec__ErrorModeAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080019000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080011002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001B00008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001B00000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});

}