package org.xtext.avi.ide.contentassist.antlr.internal;

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
import org.xtext.avi.services.PdfMkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPdfMkParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ul'", "'ol'", "'var'", "'dd'", "'='", "'{'", "'}'", "','", "':'", "'text:'", "'['", "']'", "'alignment'", "'bold'", "'style'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'styles'", "'content'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPdfMkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPdfMkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPdfMkParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPdfMk.g"; }


    	private PdfMkGrammarAccess grammarAccess;

    	public void setGrammarAccess(PdfMkGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDocDefinition"
    // InternalPdfMk.g:53:1: entryRuleDocDefinition : ruleDocDefinition EOF ;
    public final void entryRuleDocDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:54:1: ( ruleDocDefinition EOF )
            // InternalPdfMk.g:55:1: ruleDocDefinition EOF
            {
             before(grammarAccess.getDocDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDocDefinition();

            state._fsp--;

             after(grammarAccess.getDocDefinitionRule()); 
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
    // $ANTLR end "entryRuleDocDefinition"


    // $ANTLR start "ruleDocDefinition"
    // InternalPdfMk.g:62:1: ruleDocDefinition : ( ( rule__DocDefinition__Group__0 ) ) ;
    public final void ruleDocDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:66:2: ( ( ( rule__DocDefinition__Group__0 ) ) )
            // InternalPdfMk.g:67:2: ( ( rule__DocDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:67:2: ( ( rule__DocDefinition__Group__0 ) )
            // InternalPdfMk.g:68:3: ( rule__DocDefinition__Group__0 )
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:69:3: ( rule__DocDefinition__Group__0 )
            // InternalPdfMk.g:69:4: rule__DocDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocDefinition"


    // $ANTLR start "entryRuleStringObject"
    // InternalPdfMk.g:78:1: entryRuleStringObject : ruleStringObject EOF ;
    public final void entryRuleStringObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:79:1: ( ruleStringObject EOF )
            // InternalPdfMk.g:80:1: ruleStringObject EOF
            {
             before(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getStringObjectRule()); 
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
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalPdfMk.g:87:1: ruleStringObject : ( ( rule__StringObject__ValueAssignment ) ) ;
    public final void ruleStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:91:2: ( ( ( rule__StringObject__ValueAssignment ) ) )
            // InternalPdfMk.g:92:2: ( ( rule__StringObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:92:2: ( ( rule__StringObject__ValueAssignment ) )
            // InternalPdfMk.g:93:3: ( rule__StringObject__ValueAssignment )
            {
             before(grammarAccess.getStringObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:94:3: ( rule__StringObject__ValueAssignment )
            // InternalPdfMk.g:94:4: rule__StringObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringObjectAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRuleTypeFaceDefinition"
    // InternalPdfMk.g:103:1: entryRuleTypeFaceDefinition : ruleTypeFaceDefinition EOF ;
    public final void entryRuleTypeFaceDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:104:1: ( ruleTypeFaceDefinition EOF )
            // InternalPdfMk.g:105:1: ruleTypeFaceDefinition EOF
            {
             before(grammarAccess.getTypeFaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeFaceDefinition();

            state._fsp--;

             after(grammarAccess.getTypeFaceDefinitionRule()); 
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
    // $ANTLR end "entryRuleTypeFaceDefinition"


    // $ANTLR start "ruleTypeFaceDefinition"
    // InternalPdfMk.g:112:1: ruleTypeFaceDefinition : ( ( rule__TypeFaceDefinition__Group__0 ) ) ;
    public final void ruleTypeFaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:116:2: ( ( ( rule__TypeFaceDefinition__Group__0 ) ) )
            // InternalPdfMk.g:117:2: ( ( rule__TypeFaceDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:117:2: ( ( rule__TypeFaceDefinition__Group__0 ) )
            // InternalPdfMk.g:118:3: ( rule__TypeFaceDefinition__Group__0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:119:3: ( rule__TypeFaceDefinition__Group__0 )
            // InternalPdfMk.g:119:4: rule__TypeFaceDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeFaceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeFaceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeFaceDefinition"


    // $ANTLR start "entryRuleBooleanType"
    // InternalPdfMk.g:128:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalPdfMk.g:129:1: ( ruleBooleanType EOF )
            // InternalPdfMk.g:130:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalPdfMk.g:137:1: ruleBooleanType : ( ( rule__BooleanType__Alternatives ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:141:2: ( ( ( rule__BooleanType__Alternatives ) ) )
            // InternalPdfMk.g:142:2: ( ( rule__BooleanType__Alternatives ) )
            {
            // InternalPdfMk.g:142:2: ( ( rule__BooleanType__Alternatives ) )
            // InternalPdfMk.g:143:3: ( rule__BooleanType__Alternatives )
            {
             before(grammarAccess.getBooleanTypeAccess().getAlternatives()); 
            // InternalPdfMk.g:144:3: ( rule__BooleanType__Alternatives )
            // InternalPdfMk.g:144:4: rule__BooleanType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleColumnTextWidthType"
    // InternalPdfMk.g:153:1: entryRuleColumnTextWidthType : ruleColumnTextWidthType EOF ;
    public final void entryRuleColumnTextWidthType() throws RecognitionException {
        try {
            // InternalPdfMk.g:154:1: ( ruleColumnTextWidthType EOF )
            // InternalPdfMk.g:155:1: ruleColumnTextWidthType EOF
            {
             before(grammarAccess.getColumnTextWidthTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnTextWidthType();

            state._fsp--;

             after(grammarAccess.getColumnTextWidthTypeRule()); 
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
    // $ANTLR end "entryRuleColumnTextWidthType"


    // $ANTLR start "ruleColumnTextWidthType"
    // InternalPdfMk.g:162:1: ruleColumnTextWidthType : ( RULE_INT ) ;
    public final void ruleColumnTextWidthType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:166:2: ( ( RULE_INT ) )
            // InternalPdfMk.g:167:2: ( RULE_INT )
            {
            // InternalPdfMk.g:167:2: ( RULE_INT )
            // InternalPdfMk.g:168:3: RULE_INT
            {
             before(grammarAccess.getColumnTextWidthTypeAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnTextWidthTypeAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnTextWidthType"


    // $ANTLR start "entryRuleTextStyleDefinition"
    // InternalPdfMk.g:178:1: entryRuleTextStyleDefinition : ruleTextStyleDefinition EOF ;
    public final void entryRuleTextStyleDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:179:1: ( ruleTextStyleDefinition EOF )
            // InternalPdfMk.g:180:1: ruleTextStyleDefinition EOF
            {
             before(grammarAccess.getTextStyleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTextStyleDefinition();

            state._fsp--;

             after(grammarAccess.getTextStyleDefinitionRule()); 
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
    // $ANTLR end "entryRuleTextStyleDefinition"


    // $ANTLR start "ruleTextStyleDefinition"
    // InternalPdfMk.g:187:1: ruleTextStyleDefinition : ( ( rule__TextStyleDefinition__Group__0 ) ) ;
    public final void ruleTextStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:191:2: ( ( ( rule__TextStyleDefinition__Group__0 ) ) )
            // InternalPdfMk.g:192:2: ( ( rule__TextStyleDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:192:2: ( ( rule__TextStyleDefinition__Group__0 ) )
            // InternalPdfMk.g:193:3: ( rule__TextStyleDefinition__Group__0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:194:3: ( rule__TextStyleDefinition__Group__0 )
            // InternalPdfMk.g:194:4: rule__TextStyleDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextStyleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextStyleDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextStyleDefinition"


    // $ANTLR start "entryRuleTextDefinition"
    // InternalPdfMk.g:203:1: entryRuleTextDefinition : ruleTextDefinition EOF ;
    public final void entryRuleTextDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:204:1: ( ruleTextDefinition EOF )
            // InternalPdfMk.g:205:1: ruleTextDefinition EOF
            {
             before(grammarAccess.getTextDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTextDefinition();

            state._fsp--;

             after(grammarAccess.getTextDefinitionRule()); 
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
    // $ANTLR end "entryRuleTextDefinition"


    // $ANTLR start "ruleTextDefinition"
    // InternalPdfMk.g:212:1: ruleTextDefinition : ( ( rule__TextDefinition__Alternatives ) ) ;
    public final void ruleTextDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:216:2: ( ( ( rule__TextDefinition__Alternatives ) ) )
            // InternalPdfMk.g:217:2: ( ( rule__TextDefinition__Alternatives ) )
            {
            // InternalPdfMk.g:217:2: ( ( rule__TextDefinition__Alternatives ) )
            // InternalPdfMk.g:218:3: ( rule__TextDefinition__Alternatives )
            {
             before(grammarAccess.getTextDefinitionAccess().getAlternatives()); 
            // InternalPdfMk.g:219:3: ( rule__TextDefinition__Alternatives )
            // InternalPdfMk.g:219:4: rule__TextDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextDefinition"


    // $ANTLR start "entryRuleTextAlignmentDefinition"
    // InternalPdfMk.g:228:1: entryRuleTextAlignmentDefinition : ruleTextAlignmentDefinition EOF ;
    public final void entryRuleTextAlignmentDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:229:1: ( ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:230:1: ruleTextAlignmentDefinition EOF
            {
             before(grammarAccess.getTextAlignmentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTextAlignmentDefinition();

            state._fsp--;

             after(grammarAccess.getTextAlignmentDefinitionRule()); 
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
    // $ANTLR end "entryRuleTextAlignmentDefinition"


    // $ANTLR start "ruleTextAlignmentDefinition"
    // InternalPdfMk.g:237:1: ruleTextAlignmentDefinition : ( ( rule__TextAlignmentDefinition__Group__0 ) ) ;
    public final void ruleTextAlignmentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:241:2: ( ( ( rule__TextAlignmentDefinition__Group__0 ) ) )
            // InternalPdfMk.g:242:2: ( ( rule__TextAlignmentDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:242:2: ( ( rule__TextAlignmentDefinition__Group__0 ) )
            // InternalPdfMk.g:243:3: ( rule__TextAlignmentDefinition__Group__0 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:244:3: ( rule__TextAlignmentDefinition__Group__0 )
            // InternalPdfMk.g:244:4: rule__TextAlignmentDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextAlignmentDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAlignmentDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextAlignmentDefinition"


    // $ANTLR start "entryRuleItalicsDefinition"
    // InternalPdfMk.g:253:1: entryRuleItalicsDefinition : ruleItalicsDefinition EOF ;
    public final void entryRuleItalicsDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:254:1: ( ruleItalicsDefinition EOF )
            // InternalPdfMk.g:255:1: ruleItalicsDefinition EOF
            {
             before(grammarAccess.getItalicsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleItalicsDefinition();

            state._fsp--;

             after(grammarAccess.getItalicsDefinitionRule()); 
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
    // $ANTLR end "entryRuleItalicsDefinition"


    // $ANTLR start "ruleItalicsDefinition"
    // InternalPdfMk.g:262:1: ruleItalicsDefinition : ( ( rule__ItalicsDefinition__Group__0 ) ) ;
    public final void ruleItalicsDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:266:2: ( ( ( rule__ItalicsDefinition__Group__0 ) ) )
            // InternalPdfMk.g:267:2: ( ( rule__ItalicsDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:267:2: ( ( rule__ItalicsDefinition__Group__0 ) )
            // InternalPdfMk.g:268:3: ( rule__ItalicsDefinition__Group__0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:269:3: ( rule__ItalicsDefinition__Group__0 )
            // InternalPdfMk.g:269:4: rule__ItalicsDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItalicsDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicsDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalicsDefinition"


    // $ANTLR start "entryRuleFontSizeDefinition"
    // InternalPdfMk.g:278:1: entryRuleFontSizeDefinition : ruleFontSizeDefinition EOF ;
    public final void entryRuleFontSizeDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:279:1: ( ruleFontSizeDefinition EOF )
            // InternalPdfMk.g:280:1: ruleFontSizeDefinition EOF
            {
             before(grammarAccess.getFontSizeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFontSizeDefinition();

            state._fsp--;

             after(grammarAccess.getFontSizeDefinitionRule()); 
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
    // $ANTLR end "entryRuleFontSizeDefinition"


    // $ANTLR start "ruleFontSizeDefinition"
    // InternalPdfMk.g:287:1: ruleFontSizeDefinition : ( ( rule__FontSizeDefinition__Group__0 ) ) ;
    public final void ruleFontSizeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:291:2: ( ( ( rule__FontSizeDefinition__Group__0 ) ) )
            // InternalPdfMk.g:292:2: ( ( rule__FontSizeDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:292:2: ( ( rule__FontSizeDefinition__Group__0 ) )
            // InternalPdfMk.g:293:3: ( rule__FontSizeDefinition__Group__0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:294:3: ( rule__FontSizeDefinition__Group__0 )
            // InternalPdfMk.g:294:4: rule__FontSizeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FontSizeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFontSizeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontSizeDefinition"


    // $ANTLR start "entryRuleWidthDefinition"
    // InternalPdfMk.g:303:1: entryRuleWidthDefinition : ruleWidthDefinition EOF ;
    public final void entryRuleWidthDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:304:1: ( ruleWidthDefinition EOF )
            // InternalPdfMk.g:305:1: ruleWidthDefinition EOF
            {
             before(grammarAccess.getWidthDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWidthDefinition();

            state._fsp--;

             after(grammarAccess.getWidthDefinitionRule()); 
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
    // $ANTLR end "entryRuleWidthDefinition"


    // $ANTLR start "ruleWidthDefinition"
    // InternalPdfMk.g:312:1: ruleWidthDefinition : ( ( rule__WidthDefinition__Group__0 ) ) ;
    public final void ruleWidthDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:316:2: ( ( ( rule__WidthDefinition__Group__0 ) ) )
            // InternalPdfMk.g:317:2: ( ( rule__WidthDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:317:2: ( ( rule__WidthDefinition__Group__0 ) )
            // InternalPdfMk.g:318:3: ( rule__WidthDefinition__Group__0 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:319:3: ( rule__WidthDefinition__Group__0 )
            // InternalPdfMk.g:319:4: rule__WidthDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WidthDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidthDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidthDefinition"


    // $ANTLR start "entryRuleColumnDefinition"
    // InternalPdfMk.g:328:1: entryRuleColumnDefinition : ruleColumnDefinition EOF ;
    public final void entryRuleColumnDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:329:1: ( ruleColumnDefinition EOF )
            // InternalPdfMk.g:330:1: ruleColumnDefinition EOF
            {
             before(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionRule()); 
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
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // InternalPdfMk.g:337:1: ruleColumnDefinition : ( ( rule__ColumnDefinition__Group__0 ) ) ;
    public final void ruleColumnDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:341:2: ( ( ( rule__ColumnDefinition__Group__0 ) ) )
            // InternalPdfMk.g:342:2: ( ( rule__ColumnDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:342:2: ( ( rule__ColumnDefinition__Group__0 ) )
            // InternalPdfMk.g:343:3: ( rule__ColumnDefinition__Group__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:344:3: ( rule__ColumnDefinition__Group__0 )
            // InternalPdfMk.g:344:4: rule__ColumnDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleMarginDefinition"
    // InternalPdfMk.g:353:1: entryRuleMarginDefinition : ruleMarginDefinition EOF ;
    public final void entryRuleMarginDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:354:1: ( ruleMarginDefinition EOF )
            // InternalPdfMk.g:355:1: ruleMarginDefinition EOF
            {
             before(grammarAccess.getMarginDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMarginDefinition();

            state._fsp--;

             after(grammarAccess.getMarginDefinitionRule()); 
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
    // $ANTLR end "entryRuleMarginDefinition"


    // $ANTLR start "ruleMarginDefinition"
    // InternalPdfMk.g:362:1: ruleMarginDefinition : ( ( rule__MarginDefinition__Group__0 ) ) ;
    public final void ruleMarginDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:366:2: ( ( ( rule__MarginDefinition__Group__0 ) ) )
            // InternalPdfMk.g:367:2: ( ( rule__MarginDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:367:2: ( ( rule__MarginDefinition__Group__0 ) )
            // InternalPdfMk.g:368:3: ( rule__MarginDefinition__Group__0 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:369:3: ( rule__MarginDefinition__Group__0 )
            // InternalPdfMk.g:369:4: rule__MarginDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarginDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarginDefinition"


    // $ANTLR start "entryRuleImageDefintion"
    // InternalPdfMk.g:378:1: entryRuleImageDefintion : ruleImageDefintion EOF ;
    public final void entryRuleImageDefintion() throws RecognitionException {
        try {
            // InternalPdfMk.g:379:1: ( ruleImageDefintion EOF )
            // InternalPdfMk.g:380:1: ruleImageDefintion EOF
            {
             before(grammarAccess.getImageDefintionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageDefintion();

            state._fsp--;

             after(grammarAccess.getImageDefintionRule()); 
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
    // $ANTLR end "entryRuleImageDefintion"


    // $ANTLR start "ruleImageDefintion"
    // InternalPdfMk.g:387:1: ruleImageDefintion : ( ( rule__ImageDefintion__Group__0 ) ) ;
    public final void ruleImageDefintion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:391:2: ( ( ( rule__ImageDefintion__Group__0 ) ) )
            // InternalPdfMk.g:392:2: ( ( rule__ImageDefintion__Group__0 ) )
            {
            // InternalPdfMk.g:392:2: ( ( rule__ImageDefintion__Group__0 ) )
            // InternalPdfMk.g:393:3: ( rule__ImageDefintion__Group__0 )
            {
             before(grammarAccess.getImageDefintionAccess().getGroup()); 
            // InternalPdfMk.g:394:3: ( rule__ImageDefintion__Group__0 )
            // InternalPdfMk.g:394:4: rule__ImageDefintion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDefintion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDefintionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageDefintion"


    // $ANTLR start "entryRuleImageWidthDefintion"
    // InternalPdfMk.g:403:1: entryRuleImageWidthDefintion : ruleImageWidthDefintion EOF ;
    public final void entryRuleImageWidthDefintion() throws RecognitionException {
        try {
            // InternalPdfMk.g:404:1: ( ruleImageWidthDefintion EOF )
            // InternalPdfMk.g:405:1: ruleImageWidthDefintion EOF
            {
             before(grammarAccess.getImageWidthDefintionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageWidthDefintion();

            state._fsp--;

             after(grammarAccess.getImageWidthDefintionRule()); 
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
    // $ANTLR end "entryRuleImageWidthDefintion"


    // $ANTLR start "ruleImageWidthDefintion"
    // InternalPdfMk.g:412:1: ruleImageWidthDefintion : ( ( rule__ImageWidthDefintion__Group__0 ) ) ;
    public final void ruleImageWidthDefintion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:416:2: ( ( ( rule__ImageWidthDefintion__Group__0 ) ) )
            // InternalPdfMk.g:417:2: ( ( rule__ImageWidthDefintion__Group__0 ) )
            {
            // InternalPdfMk.g:417:2: ( ( rule__ImageWidthDefintion__Group__0 ) )
            // InternalPdfMk.g:418:3: ( rule__ImageWidthDefintion__Group__0 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getGroup()); 
            // InternalPdfMk.g:419:3: ( rule__ImageWidthDefintion__Group__0 )
            // InternalPdfMk.g:419:4: rule__ImageWidthDefintion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageWidthDefintion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageWidthDefintionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageWidthDefintion"


    // $ANTLR start "entryRuleImageHeightDefintion"
    // InternalPdfMk.g:428:1: entryRuleImageHeightDefintion : ruleImageHeightDefintion EOF ;
    public final void entryRuleImageHeightDefintion() throws RecognitionException {
        try {
            // InternalPdfMk.g:429:1: ( ruleImageHeightDefintion EOF )
            // InternalPdfMk.g:430:1: ruleImageHeightDefintion EOF
            {
             before(grammarAccess.getImageHeightDefintionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageHeightDefintion();

            state._fsp--;

             after(grammarAccess.getImageHeightDefintionRule()); 
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
    // $ANTLR end "entryRuleImageHeightDefintion"


    // $ANTLR start "ruleImageHeightDefintion"
    // InternalPdfMk.g:437:1: ruleImageHeightDefintion : ( ( rule__ImageHeightDefintion__Group__0 ) ) ;
    public final void ruleImageHeightDefintion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:441:2: ( ( ( rule__ImageHeightDefintion__Group__0 ) ) )
            // InternalPdfMk.g:442:2: ( ( rule__ImageHeightDefintion__Group__0 ) )
            {
            // InternalPdfMk.g:442:2: ( ( rule__ImageHeightDefintion__Group__0 ) )
            // InternalPdfMk.g:443:3: ( rule__ImageHeightDefintion__Group__0 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getGroup()); 
            // InternalPdfMk.g:444:3: ( rule__ImageHeightDefintion__Group__0 )
            // InternalPdfMk.g:444:4: rule__ImageHeightDefintion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageHeightDefintion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageHeightDefintionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageHeightDefintion"


    // $ANTLR start "entryRuleImagePageBreakDefinition"
    // InternalPdfMk.g:453:1: entryRuleImagePageBreakDefinition : ruleImagePageBreakDefinition EOF ;
    public final void entryRuleImagePageBreakDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:454:1: ( ruleImagePageBreakDefinition EOF )
            // InternalPdfMk.g:455:1: ruleImagePageBreakDefinition EOF
            {
             before(grammarAccess.getImagePageBreakDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleImagePageBreakDefinition();

            state._fsp--;

             after(grammarAccess.getImagePageBreakDefinitionRule()); 
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
    // $ANTLR end "entryRuleImagePageBreakDefinition"


    // $ANTLR start "ruleImagePageBreakDefinition"
    // InternalPdfMk.g:462:1: ruleImagePageBreakDefinition : ( ( rule__ImagePageBreakDefinition__Group__0 ) ) ;
    public final void ruleImagePageBreakDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:466:2: ( ( ( rule__ImagePageBreakDefinition__Group__0 ) ) )
            // InternalPdfMk.g:467:2: ( ( rule__ImagePageBreakDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:467:2: ( ( rule__ImagePageBreakDefinition__Group__0 ) )
            // InternalPdfMk.g:468:3: ( rule__ImagePageBreakDefinition__Group__0 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:469:3: ( rule__ImagePageBreakDefinition__Group__0 )
            // InternalPdfMk.g:469:4: rule__ImagePageBreakDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImagePageBreakDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImagePageBreakDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImagePageBreakDefinition"


    // $ANTLR start "entryRuleImageFitDefinition"
    // InternalPdfMk.g:478:1: entryRuleImageFitDefinition : ruleImageFitDefinition EOF ;
    public final void entryRuleImageFitDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:479:1: ( ruleImageFitDefinition EOF )
            // InternalPdfMk.g:480:1: ruleImageFitDefinition EOF
            {
             before(grammarAccess.getImageFitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageFitDefinition();

            state._fsp--;

             after(grammarAccess.getImageFitDefinitionRule()); 
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
    // $ANTLR end "entryRuleImageFitDefinition"


    // $ANTLR start "ruleImageFitDefinition"
    // InternalPdfMk.g:487:1: ruleImageFitDefinition : ( ( rule__ImageFitDefinition__Group__0 ) ) ;
    public final void ruleImageFitDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:491:2: ( ( ( rule__ImageFitDefinition__Group__0 ) ) )
            // InternalPdfMk.g:492:2: ( ( rule__ImageFitDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:492:2: ( ( rule__ImageFitDefinition__Group__0 ) )
            // InternalPdfMk.g:493:3: ( rule__ImageFitDefinition__Group__0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:494:3: ( rule__ImageFitDefinition__Group__0 )
            // InternalPdfMk.g:494:4: rule__ImageFitDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageFitDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageFitDefinition"


    // $ANTLR start "entryRuleImageOpacityDefinition"
    // InternalPdfMk.g:503:1: entryRuleImageOpacityDefinition : ruleImageOpacityDefinition EOF ;
    public final void entryRuleImageOpacityDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:504:1: ( ruleImageOpacityDefinition EOF )
            // InternalPdfMk.g:505:1: ruleImageOpacityDefinition EOF
            {
             before(grammarAccess.getImageOpacityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageOpacityDefinition();

            state._fsp--;

             after(grammarAccess.getImageOpacityDefinitionRule()); 
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
    // $ANTLR end "entryRuleImageOpacityDefinition"


    // $ANTLR start "ruleImageOpacityDefinition"
    // InternalPdfMk.g:512:1: ruleImageOpacityDefinition : ( ( rule__ImageOpacityDefinition__Group__0 ) ) ;
    public final void ruleImageOpacityDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:516:2: ( ( ( rule__ImageOpacityDefinition__Group__0 ) ) )
            // InternalPdfMk.g:517:2: ( ( rule__ImageOpacityDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:517:2: ( ( rule__ImageOpacityDefinition__Group__0 ) )
            // InternalPdfMk.g:518:3: ( rule__ImageOpacityDefinition__Group__0 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:519:3: ( rule__ImageOpacityDefinition__Group__0 )
            // InternalPdfMk.g:519:4: rule__ImageOpacityDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageOpacityDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageOpacityDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageOpacityDefinition"


    // $ANTLR start "entryRuleListReversedDefinition"
    // InternalPdfMk.g:528:1: entryRuleListReversedDefinition : ruleListReversedDefinition EOF ;
    public final void entryRuleListReversedDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:529:1: ( ruleListReversedDefinition EOF )
            // InternalPdfMk.g:530:1: ruleListReversedDefinition EOF
            {
             before(grammarAccess.getListReversedDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleListReversedDefinition();

            state._fsp--;

             after(grammarAccess.getListReversedDefinitionRule()); 
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
    // $ANTLR end "entryRuleListReversedDefinition"


    // $ANTLR start "ruleListReversedDefinition"
    // InternalPdfMk.g:537:1: ruleListReversedDefinition : ( ( rule__ListReversedDefinition__Group__0 ) ) ;
    public final void ruleListReversedDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:541:2: ( ( ( rule__ListReversedDefinition__Group__0 ) ) )
            // InternalPdfMk.g:542:2: ( ( rule__ListReversedDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:542:2: ( ( rule__ListReversedDefinition__Group__0 ) )
            // InternalPdfMk.g:543:3: ( rule__ListReversedDefinition__Group__0 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:544:3: ( rule__ListReversedDefinition__Group__0 )
            // InternalPdfMk.g:544:4: rule__ListReversedDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListReversedDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListReversedDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListReversedDefinition"


    // $ANTLR start "entryRuleListCounterDefinition"
    // InternalPdfMk.g:553:1: entryRuleListCounterDefinition : ruleListCounterDefinition EOF ;
    public final void entryRuleListCounterDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:554:1: ( ruleListCounterDefinition EOF )
            // InternalPdfMk.g:555:1: ruleListCounterDefinition EOF
            {
             before(grammarAccess.getListCounterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleListCounterDefinition();

            state._fsp--;

             after(grammarAccess.getListCounterDefinitionRule()); 
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
    // $ANTLR end "entryRuleListCounterDefinition"


    // $ANTLR start "ruleListCounterDefinition"
    // InternalPdfMk.g:562:1: ruleListCounterDefinition : ( ( rule__ListCounterDefinition__Group__0 ) ) ;
    public final void ruleListCounterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:566:2: ( ( ( rule__ListCounterDefinition__Group__0 ) ) )
            // InternalPdfMk.g:567:2: ( ( rule__ListCounterDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:567:2: ( ( rule__ListCounterDefinition__Group__0 ) )
            // InternalPdfMk.g:568:3: ( rule__ListCounterDefinition__Group__0 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:569:3: ( rule__ListCounterDefinition__Group__0 )
            // InternalPdfMk.g:569:4: rule__ListCounterDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListCounterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListCounterDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListCounterDefinition"


    // $ANTLR start "entryRuleListTypeDefinition"
    // InternalPdfMk.g:578:1: entryRuleListTypeDefinition : ruleListTypeDefinition EOF ;
    public final void entryRuleListTypeDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:579:1: ( ruleListTypeDefinition EOF )
            // InternalPdfMk.g:580:1: ruleListTypeDefinition EOF
            {
             before(grammarAccess.getListTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleListTypeDefinition();

            state._fsp--;

             after(grammarAccess.getListTypeDefinitionRule()); 
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
    // $ANTLR end "entryRuleListTypeDefinition"


    // $ANTLR start "ruleListTypeDefinition"
    // InternalPdfMk.g:587:1: ruleListTypeDefinition : ( ( rule__ListTypeDefinition__Group__0 ) ) ;
    public final void ruleListTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:591:2: ( ( ( rule__ListTypeDefinition__Group__0 ) ) )
            // InternalPdfMk.g:592:2: ( ( rule__ListTypeDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:592:2: ( ( rule__ListTypeDefinition__Group__0 ) )
            // InternalPdfMk.g:593:3: ( rule__ListTypeDefinition__Group__0 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:594:3: ( rule__ListTypeDefinition__Group__0 )
            // InternalPdfMk.g:594:4: rule__ListTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListTypeDefinition"


    // $ANTLR start "entryRuleListColorDefinition"
    // InternalPdfMk.g:603:1: entryRuleListColorDefinition : ruleListColorDefinition EOF ;
    public final void entryRuleListColorDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:604:1: ( ruleListColorDefinition EOF )
            // InternalPdfMk.g:605:1: ruleListColorDefinition EOF
            {
             before(grammarAccess.getListColorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleListColorDefinition();

            state._fsp--;

             after(grammarAccess.getListColorDefinitionRule()); 
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
    // $ANTLR end "entryRuleListColorDefinition"


    // $ANTLR start "ruleListColorDefinition"
    // InternalPdfMk.g:612:1: ruleListColorDefinition : ( ( rule__ListColorDefinition__Group__0 ) ) ;
    public final void ruleListColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:616:2: ( ( ( rule__ListColorDefinition__Group__0 ) ) )
            // InternalPdfMk.g:617:2: ( ( rule__ListColorDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:617:2: ( ( rule__ListColorDefinition__Group__0 ) )
            // InternalPdfMk.g:618:3: ( rule__ListColorDefinition__Group__0 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:619:3: ( rule__ListColorDefinition__Group__0 )
            // InternalPdfMk.g:619:4: rule__ListColorDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListColorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListColorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListColorDefinition"


    // $ANTLR start "entryRuleListMarkerColorDefinition"
    // InternalPdfMk.g:628:1: entryRuleListMarkerColorDefinition : ruleListMarkerColorDefinition EOF ;
    public final void entryRuleListMarkerColorDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:629:1: ( ruleListMarkerColorDefinition EOF )
            // InternalPdfMk.g:630:1: ruleListMarkerColorDefinition EOF
            {
             before(grammarAccess.getListMarkerColorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleListMarkerColorDefinition();

            state._fsp--;

             after(grammarAccess.getListMarkerColorDefinitionRule()); 
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
    // $ANTLR end "entryRuleListMarkerColorDefinition"


    // $ANTLR start "ruleListMarkerColorDefinition"
    // InternalPdfMk.g:637:1: ruleListMarkerColorDefinition : ( ( rule__ListMarkerColorDefinition__Group__0 ) ) ;
    public final void ruleListMarkerColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:641:2: ( ( ( rule__ListMarkerColorDefinition__Group__0 ) ) )
            // InternalPdfMk.g:642:2: ( ( rule__ListMarkerColorDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:642:2: ( ( rule__ListMarkerColorDefinition__Group__0 ) )
            // InternalPdfMk.g:643:3: ( rule__ListMarkerColorDefinition__Group__0 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:644:3: ( rule__ListMarkerColorDefinition__Group__0 )
            // InternalPdfMk.g:644:4: rule__ListMarkerColorDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListMarkerColorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListMarkerColorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListMarkerColorDefinition"


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:653:1: entryRuleTextObject : ruleTextObject EOF ;
    public final void entryRuleTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:654:1: ( ruleTextObject EOF )
            // InternalPdfMk.g:655:1: ruleTextObject EOF
            {
             before(grammarAccess.getTextObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getTextObjectRule()); 
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
    // $ANTLR end "entryRuleTextObject"


    // $ANTLR start "ruleTextObject"
    // InternalPdfMk.g:662:1: ruleTextObject : ( ( rule__TextObject__Group__0 ) ) ;
    public final void ruleTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:666:2: ( ( ( rule__TextObject__Group__0 ) ) )
            // InternalPdfMk.g:667:2: ( ( rule__TextObject__Group__0 ) )
            {
            // InternalPdfMk.g:667:2: ( ( rule__TextObject__Group__0 ) )
            // InternalPdfMk.g:668:3: ( rule__TextObject__Group__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup()); 
            // InternalPdfMk.g:669:3: ( rule__TextObject__Group__0 )
            // InternalPdfMk.g:669:4: rule__TextObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextObject"


    // $ANTLR start "entryRuleColumnTextObject"
    // InternalPdfMk.g:678:1: entryRuleColumnTextObject : ruleColumnTextObject EOF ;
    public final void entryRuleColumnTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:679:1: ( ruleColumnTextObject EOF )
            // InternalPdfMk.g:680:1: ruleColumnTextObject EOF
            {
             before(grammarAccess.getColumnTextObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnTextObject();

            state._fsp--;

             after(grammarAccess.getColumnTextObjectRule()); 
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
    // $ANTLR end "entryRuleColumnTextObject"


    // $ANTLR start "ruleColumnTextObject"
    // InternalPdfMk.g:687:1: ruleColumnTextObject : ( ( rule__ColumnTextObject__ValueAssignment ) ) ;
    public final void ruleColumnTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:691:2: ( ( ( rule__ColumnTextObject__ValueAssignment ) ) )
            // InternalPdfMk.g:692:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:692:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            // InternalPdfMk.g:693:3: ( rule__ColumnTextObject__ValueAssignment )
            {
             before(grammarAccess.getColumnTextObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:694:3: ( rule__ColumnTextObject__ValueAssignment )
            // InternalPdfMk.g:694:4: rule__ColumnTextObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnTextObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnTextObjectAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnTextObject"


    // $ANTLR start "entryRuleStyleObject"
    // InternalPdfMk.g:703:1: entryRuleStyleObject : ruleStyleObject EOF ;
    public final void entryRuleStyleObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:704:1: ( ruleStyleObject EOF )
            // InternalPdfMk.g:705:1: ruleStyleObject EOF
            {
             before(grammarAccess.getStyleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleObject();

            state._fsp--;

             after(grammarAccess.getStyleObjectRule()); 
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
    // $ANTLR end "entryRuleStyleObject"


    // $ANTLR start "ruleStyleObject"
    // InternalPdfMk.g:712:1: ruleStyleObject : ( ( rule__StyleObject__Group__0 ) ) ;
    public final void ruleStyleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:716:2: ( ( ( rule__StyleObject__Group__0 ) ) )
            // InternalPdfMk.g:717:2: ( ( rule__StyleObject__Group__0 ) )
            {
            // InternalPdfMk.g:717:2: ( ( rule__StyleObject__Group__0 ) )
            // InternalPdfMk.g:718:3: ( rule__StyleObject__Group__0 )
            {
             before(grammarAccess.getStyleObjectAccess().getGroup()); 
            // InternalPdfMk.g:719:3: ( rule__StyleObject__Group__0 )
            // InternalPdfMk.g:719:4: rule__StyleObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyleObject"


    // $ANTLR start "entryRuleStyleObjects"
    // InternalPdfMk.g:728:1: entryRuleStyleObjects : ruleStyleObjects EOF ;
    public final void entryRuleStyleObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:729:1: ( ruleStyleObjects EOF )
            // InternalPdfMk.g:730:1: ruleStyleObjects EOF
            {
             before(grammarAccess.getStyleObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleObjects();

            state._fsp--;

             after(grammarAccess.getStyleObjectsRule()); 
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
    // $ANTLR end "entryRuleStyleObjects"


    // $ANTLR start "ruleStyleObjects"
    // InternalPdfMk.g:737:1: ruleStyleObjects : ( ( rule__StyleObjects__Group__0 ) ) ;
    public final void ruleStyleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:741:2: ( ( ( rule__StyleObjects__Group__0 ) ) )
            // InternalPdfMk.g:742:2: ( ( rule__StyleObjects__Group__0 ) )
            {
            // InternalPdfMk.g:742:2: ( ( rule__StyleObjects__Group__0 ) )
            // InternalPdfMk.g:743:3: ( rule__StyleObjects__Group__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup()); 
            // InternalPdfMk.g:744:3: ( rule__StyleObjects__Group__0 )
            // InternalPdfMk.g:744:4: rule__StyleObjects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyleObjects"


    // $ANTLR start "entryRuleInnerColumnObject"
    // InternalPdfMk.g:753:1: entryRuleInnerColumnObject : ruleInnerColumnObject EOF ;
    public final void entryRuleInnerColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:754:1: ( ruleInnerColumnObject EOF )
            // InternalPdfMk.g:755:1: ruleInnerColumnObject EOF
            {
             before(grammarAccess.getInnerColumnObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerColumnObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectRule()); 
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
    // $ANTLR end "entryRuleInnerColumnObject"


    // $ANTLR start "ruleInnerColumnObject"
    // InternalPdfMk.g:762:1: ruleInnerColumnObject : ( ( rule__InnerColumnObject__Group__0 ) ) ;
    public final void ruleInnerColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:766:2: ( ( ( rule__InnerColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:767:2: ( ( rule__InnerColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:767:2: ( ( rule__InnerColumnObject__Group__0 ) )
            // InternalPdfMk.g:768:3: ( rule__InnerColumnObject__Group__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:769:3: ( rule__InnerColumnObject__Group__0 )
            // InternalPdfMk.g:769:4: rule__InnerColumnObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerColumnObject"


    // $ANTLR start "entryRuleColumnObject"
    // InternalPdfMk.g:778:1: entryRuleColumnObject : ruleColumnObject EOF ;
    public final void entryRuleColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:779:1: ( ruleColumnObject EOF )
            // InternalPdfMk.g:780:1: ruleColumnObject EOF
            {
             before(grammarAccess.getColumnObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectRule()); 
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
    // $ANTLR end "entryRuleColumnObject"


    // $ANTLR start "ruleColumnObject"
    // InternalPdfMk.g:787:1: ruleColumnObject : ( ( rule__ColumnObject__Group__0 ) ) ;
    public final void ruleColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:791:2: ( ( ( rule__ColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:792:2: ( ( rule__ColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:792:2: ( ( rule__ColumnObject__Group__0 ) )
            // InternalPdfMk.g:793:3: ( rule__ColumnObject__Group__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:794:3: ( rule__ColumnObject__Group__0 )
            // InternalPdfMk.g:794:4: rule__ColumnObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnObject"


    // $ANTLR start "entryRuleImageObject"
    // InternalPdfMk.g:803:1: entryRuleImageObject : ruleImageObject EOF ;
    public final void entryRuleImageObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:804:1: ( ruleImageObject EOF )
            // InternalPdfMk.g:805:1: ruleImageObject EOF
            {
             before(grammarAccess.getImageObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleImageObject();

            state._fsp--;

             after(grammarAccess.getImageObjectRule()); 
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
    // $ANTLR end "entryRuleImageObject"


    // $ANTLR start "ruleImageObject"
    // InternalPdfMk.g:812:1: ruleImageObject : ( ( rule__ImageObject__Group__0 ) ) ;
    public final void ruleImageObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:816:2: ( ( ( rule__ImageObject__Group__0 ) ) )
            // InternalPdfMk.g:817:2: ( ( rule__ImageObject__Group__0 ) )
            {
            // InternalPdfMk.g:817:2: ( ( rule__ImageObject__Group__0 ) )
            // InternalPdfMk.g:818:3: ( rule__ImageObject__Group__0 )
            {
             before(grammarAccess.getImageObjectAccess().getGroup()); 
            // InternalPdfMk.g:819:3: ( rule__ImageObject__Group__0 )
            // InternalPdfMk.g:819:4: rule__ImageObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageObject"


    // $ANTLR start "entryRuleListObjectPropertiesWrapper"
    // InternalPdfMk.g:828:1: entryRuleListObjectPropertiesWrapper : ruleListObjectPropertiesWrapper EOF ;
    public final void entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:829:1: ( ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:830:1: ruleListObjectPropertiesWrapper EOF
            {
             before(grammarAccess.getListObjectPropertiesWrapperRule()); 
            pushFollow(FOLLOW_1);
            ruleListObjectPropertiesWrapper();

            state._fsp--;

             after(grammarAccess.getListObjectPropertiesWrapperRule()); 
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
    // $ANTLR end "entryRuleListObjectPropertiesWrapper"


    // $ANTLR start "ruleListObjectPropertiesWrapper"
    // InternalPdfMk.g:837:1: ruleListObjectPropertiesWrapper : ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) ;
    public final void ruleListObjectPropertiesWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:841:2: ( ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) )
            // InternalPdfMk.g:842:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            {
            // InternalPdfMk.g:842:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            // InternalPdfMk.g:843:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAssignment()); 
            // InternalPdfMk.g:844:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            // InternalPdfMk.g:844:4: rule__ListObjectPropertiesWrapper__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ListObjectPropertiesWrapper__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListObjectPropertiesWrapper"


    // $ANTLR start "entryRuleListElements"
    // InternalPdfMk.g:853:1: entryRuleListElements : ruleListElements EOF ;
    public final void entryRuleListElements() throws RecognitionException {
        try {
            // InternalPdfMk.g:854:1: ( ruleListElements EOF )
            // InternalPdfMk.g:855:1: ruleListElements EOF
            {
             before(grammarAccess.getListElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleListElements();

            state._fsp--;

             after(grammarAccess.getListElementsRule()); 
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
    // $ANTLR end "entryRuleListElements"


    // $ANTLR start "ruleListElements"
    // InternalPdfMk.g:862:1: ruleListElements : ( ( rule__ListElements__Alternatives ) ) ;
    public final void ruleListElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:866:2: ( ( ( rule__ListElements__Alternatives ) ) )
            // InternalPdfMk.g:867:2: ( ( rule__ListElements__Alternatives ) )
            {
            // InternalPdfMk.g:867:2: ( ( rule__ListElements__Alternatives ) )
            // InternalPdfMk.g:868:3: ( rule__ListElements__Alternatives )
            {
             before(grammarAccess.getListElementsAccess().getAlternatives()); 
            // InternalPdfMk.g:869:3: ( rule__ListElements__Alternatives )
            // InternalPdfMk.g:869:4: rule__ListElements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListElements"


    // $ANTLR start "entryRuleListObject"
    // InternalPdfMk.g:878:1: entryRuleListObject : ruleListObject EOF ;
    public final void entryRuleListObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:879:1: ( ruleListObject EOF )
            // InternalPdfMk.g:880:1: ruleListObject EOF
            {
             before(grammarAccess.getListObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleListObject();

            state._fsp--;

             after(grammarAccess.getListObjectRule()); 
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
    // $ANTLR end "entryRuleListObject"


    // $ANTLR start "ruleListObject"
    // InternalPdfMk.g:887:1: ruleListObject : ( ( rule__ListObject__Group__0 ) ) ;
    public final void ruleListObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:891:2: ( ( ( rule__ListObject__Group__0 ) ) )
            // InternalPdfMk.g:892:2: ( ( rule__ListObject__Group__0 ) )
            {
            // InternalPdfMk.g:892:2: ( ( rule__ListObject__Group__0 ) )
            // InternalPdfMk.g:893:3: ( rule__ListObject__Group__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup()); 
            // InternalPdfMk.g:894:3: ( rule__ListObject__Group__0 )
            // InternalPdfMk.g:894:4: rule__ListObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListObject"


    // $ANTLR start "entryRuleContentObject"
    // InternalPdfMk.g:903:1: entryRuleContentObject : ruleContentObject EOF ;
    public final void entryRuleContentObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:904:1: ( ruleContentObject EOF )
            // InternalPdfMk.g:905:1: ruleContentObject EOF
            {
             before(grammarAccess.getContentObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleContentObject();

            state._fsp--;

             after(grammarAccess.getContentObjectRule()); 
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
    // $ANTLR end "entryRuleContentObject"


    // $ANTLR start "ruleContentObject"
    // InternalPdfMk.g:912:1: ruleContentObject : ( ( rule__ContentObject__ValueAssignment ) ) ;
    public final void ruleContentObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:916:2: ( ( ( rule__ContentObject__ValueAssignment ) ) )
            // InternalPdfMk.g:917:2: ( ( rule__ContentObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:917:2: ( ( rule__ContentObject__ValueAssignment ) )
            // InternalPdfMk.g:918:3: ( rule__ContentObject__ValueAssignment )
            {
             before(grammarAccess.getContentObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:919:3: ( rule__ContentObject__ValueAssignment )
            // InternalPdfMk.g:919:4: rule__ContentObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ContentObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentObject"


    // $ANTLR start "entryRuleContentObjects"
    // InternalPdfMk.g:928:1: entryRuleContentObjects : ruleContentObjects EOF ;
    public final void entryRuleContentObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:929:1: ( ruleContentObjects EOF )
            // InternalPdfMk.g:930:1: ruleContentObjects EOF
            {
             before(grammarAccess.getContentObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleContentObjects();

            state._fsp--;

             after(grammarAccess.getContentObjectsRule()); 
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
    // $ANTLR end "entryRuleContentObjects"


    // $ANTLR start "ruleContentObjects"
    // InternalPdfMk.g:937:1: ruleContentObjects : ( ( rule__ContentObjects__Group__0 ) ) ;
    public final void ruleContentObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:941:2: ( ( ( rule__ContentObjects__Group__0 ) ) )
            // InternalPdfMk.g:942:2: ( ( rule__ContentObjects__Group__0 ) )
            {
            // InternalPdfMk.g:942:2: ( ( rule__ContentObjects__Group__0 ) )
            // InternalPdfMk.g:943:3: ( rule__ContentObjects__Group__0 )
            {
             before(grammarAccess.getContentObjectsAccess().getGroup()); 
            // InternalPdfMk.g:944:3: ( rule__ContentObjects__Group__0 )
            // InternalPdfMk.g:944:4: rule__ContentObjects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentObjects"


    // $ANTLR start "entryRuleStyles"
    // InternalPdfMk.g:953:1: entryRuleStyles : ruleStyles EOF ;
    public final void entryRuleStyles() throws RecognitionException {
        try {
            // InternalPdfMk.g:954:1: ( ruleStyles EOF )
            // InternalPdfMk.g:955:1: ruleStyles EOF
            {
             before(grammarAccess.getStylesRule()); 
            pushFollow(FOLLOW_1);
            ruleStyles();

            state._fsp--;

             after(grammarAccess.getStylesRule()); 
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
    // $ANTLR end "entryRuleStyles"


    // $ANTLR start "ruleStyles"
    // InternalPdfMk.g:962:1: ruleStyles : ( ( rule__Styles__Group__0 ) ) ;
    public final void ruleStyles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:966:2: ( ( ( rule__Styles__Group__0 ) ) )
            // InternalPdfMk.g:967:2: ( ( rule__Styles__Group__0 ) )
            {
            // InternalPdfMk.g:967:2: ( ( rule__Styles__Group__0 ) )
            // InternalPdfMk.g:968:3: ( rule__Styles__Group__0 )
            {
             before(grammarAccess.getStylesAccess().getGroup()); 
            // InternalPdfMk.g:969:3: ( rule__Styles__Group__0 )
            // InternalPdfMk.g:969:4: rule__Styles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Styles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStylesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyles"


    // $ANTLR start "entryRuleContent"
    // InternalPdfMk.g:978:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:979:1: ( ruleContent EOF )
            // InternalPdfMk.g:980:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalPdfMk.g:987:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:991:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPdfMk.g:992:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPdfMk.g:992:2: ( ( rule__Content__Group__0 ) )
            // InternalPdfMk.g:993:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPdfMk.g:994:3: ( rule__Content__Group__0 )
            // InternalPdfMk.g:994:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "rule__BooleanType__Alternatives"
    // InternalPdfMk.g:1002:1: rule__BooleanType__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1006:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPdfMk.g:1007:2: ( 'true' )
                    {
                    // InternalPdfMk.g:1007:2: ( 'true' )
                    // InternalPdfMk.g:1008:3: 'true'
                    {
                     before(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1013:2: ( 'false' )
                    {
                    // InternalPdfMk.g:1013:2: ( 'false' )
                    // InternalPdfMk.g:1014:3: 'false'
                    {
                     before(grammarAccess.getBooleanTypeAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanTypeAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BooleanType__Alternatives"


    // $ANTLR start "rule__TextDefinition__Alternatives"
    // InternalPdfMk.g:1023:1: rule__TextDefinition__Alternatives : ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) );
    public final void rule__TextDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1027:1: ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:1028:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    {
                    // InternalPdfMk.g:1028:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    // InternalPdfMk.g:1029:3: ( rule__TextDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_0()); 
                    // InternalPdfMk.g:1030:3: ( rule__TextDefinition__Group_0__0 )
                    // InternalPdfMk.g:1030:4: rule__TextDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1034:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    {
                    // InternalPdfMk.g:1034:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    // InternalPdfMk.g:1035:3: ( rule__TextDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_1()); 
                    // InternalPdfMk.g:1036:3: ( rule__TextDefinition__Group_1__0 )
                    // InternalPdfMk.g:1036:4: rule__TextDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextDefinitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TextDefinition__Alternatives"


    // $ANTLR start "rule__ListObjectPropertiesWrapper__ValueAlternatives_0"
    // InternalPdfMk.g:1044:1: rule__ListObjectPropertiesWrapper__ValueAlternatives_0 : ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) );
    public final void rule__ListObjectPropertiesWrapper__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1048:1: ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 41:
                {
                alt3=4;
                }
                break;
            case 42:
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
                    // InternalPdfMk.g:1049:2: ( ruleListReversedDefinition )
                    {
                    // InternalPdfMk.g:1049:2: ( ruleListReversedDefinition )
                    // InternalPdfMk.g:1050:3: ruleListReversedDefinition
                    {
                     before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListReversedDefinitionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListReversedDefinition();

                    state._fsp--;

                     after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListReversedDefinitionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1055:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1055:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1056:3: ruleListCounterDefinition
                    {
                     before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListCounterDefinitionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListCounterDefinition();

                    state._fsp--;

                     after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListCounterDefinitionParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1061:2: ( ruleListTypeDefinition )
                    {
                    // InternalPdfMk.g:1061:2: ( ruleListTypeDefinition )
                    // InternalPdfMk.g:1062:3: ruleListTypeDefinition
                    {
                     before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListTypeDefinitionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleListTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListTypeDefinitionParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1067:2: ( ruleListColorDefinition )
                    {
                    // InternalPdfMk.g:1067:2: ( ruleListColorDefinition )
                    // InternalPdfMk.g:1068:3: ruleListColorDefinition
                    {
                     before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListColorDefinitionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleListColorDefinition();

                    state._fsp--;

                     after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListColorDefinitionParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1073:2: ( ruleListMarkerColorDefinition )
                    {
                    // InternalPdfMk.g:1073:2: ( ruleListMarkerColorDefinition )
                    // InternalPdfMk.g:1074:3: ruleListMarkerColorDefinition
                    {
                     before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListMarkerColorDefinitionParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListMarkerColorDefinition();

                    state._fsp--;

                     after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListMarkerColorDefinitionParserRuleCall_0_4()); 

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
    // $ANTLR end "rule__ListObjectPropertiesWrapper__ValueAlternatives_0"


    // $ANTLR start "rule__ListElements__Alternatives"
    // InternalPdfMk.g:1083:1: rule__ListElements__Alternatives : ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) );
    public final void rule__ListElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1087:1: ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=22 && LA4_2<=23)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==27||LA4_2==31) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:1088:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    {
                    // InternalPdfMk.g:1088:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    // InternalPdfMk.g:1089:3: ( rule__ListElements__ElValuesAssignment_0 )
                    {
                     before(grammarAccess.getListElementsAccess().getElValuesAssignment_0()); 
                    // InternalPdfMk.g:1090:3: ( rule__ListElements__ElValuesAssignment_0 )
                    // InternalPdfMk.g:1090:4: rule__ListElements__ElValuesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListElements__ElValuesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListElementsAccess().getElValuesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1094:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1094:2: ( ruleTextObject )
                    // InternalPdfMk.g:1095:3: ruleTextObject
                    {
                     before(grammarAccess.getListElementsAccess().getTextObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextObject();

                    state._fsp--;

                     after(grammarAccess.getListElementsAccess().getTextObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1100:2: ( ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1100:2: ( ruleColumnDefinition )
                    // InternalPdfMk.g:1101:3: ruleColumnDefinition
                    {
                     before(grammarAccess.getListElementsAccess().getColumnDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnDefinition();

                    state._fsp--;

                     after(grammarAccess.getListElementsAccess().getColumnDefinitionParserRuleCall_2()); 

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
    // $ANTLR end "rule__ListElements__Alternatives"


    // $ANTLR start "rule__ListObject__Alternatives_2"
    // InternalPdfMk.g:1110:1: rule__ListObject__Alternatives_2 : ( ( 'ul' ) | ( 'ol' ) );
    public final void rule__ListObject__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1114:1: ( ( 'ul' ) | ( 'ol' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:1115:2: ( 'ul' )
                    {
                    // InternalPdfMk.g:1115:2: ( 'ul' )
                    // InternalPdfMk.g:1116:3: 'ul'
                    {
                     before(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1121:2: ( 'ol' )
                    {
                    // InternalPdfMk.g:1121:2: ( 'ol' )
                    // InternalPdfMk.g:1122:3: 'ol'
                    {
                     before(grammarAccess.getListObjectAccess().getOlKeyword_2_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getListObjectAccess().getOlKeyword_2_1()); 

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
    // $ANTLR end "rule__ListObject__Alternatives_2"


    // $ANTLR start "rule__ContentObject__ValueAlternatives_0"
    // InternalPdfMk.g:1131:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );
    public final void rule__ContentObject__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1135:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                switch ( input.LA(2) ) {
                case 13:
                case 14:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    {
                    alt6=5;
                    }
                    break;
                case 19:
                case 20:
                case 33:
                    {
                    alt6=4;
                    }
                    break;
                case 22:
                case 23:
                    {
                    alt6=2;
                    }
                    break;
                case 27:
                case 31:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:1136:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1136:2: ( ruleStringObject )
                    // InternalPdfMk.g:1137:3: ruleStringObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueStringObjectParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueStringObjectParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1142:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1142:2: ( ruleTextObject )
                    // InternalPdfMk.g:1143:3: ruleTextObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueTextObjectParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueTextObjectParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1148:2: ( ruleColumnTextObject )
                    {
                    // InternalPdfMk.g:1148:2: ( ruleColumnTextObject )
                    // InternalPdfMk.g:1149:3: ruleColumnTextObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueColumnTextObjectParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnTextObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueColumnTextObjectParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1154:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1154:2: ( ruleImageObject )
                    // InternalPdfMk.g:1155:3: ruleImageObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueImageObjectParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleImageObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueImageObjectParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1160:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1160:2: ( ruleListObject )
                    // InternalPdfMk.g:1161:3: ruleListObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueListObjectParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueListObjectParserRuleCall_0_4()); 

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
    // $ANTLR end "rule__ContentObject__ValueAlternatives_0"


    // $ANTLR start "rule__DocDefinition__Group__0"
    // InternalPdfMk.g:1170:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1174:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:1175:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DocDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__1();

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
    // $ANTLR end "rule__DocDefinition__Group__0"


    // $ANTLR start "rule__DocDefinition__Group__0__Impl"
    // InternalPdfMk.g:1182:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1186:1: ( ( 'var' ) )
            // InternalPdfMk.g:1187:1: ( 'var' )
            {
            // InternalPdfMk.g:1187:1: ( 'var' )
            // InternalPdfMk.g:1188:2: 'var'
            {
             before(grammarAccess.getDocDefinitionAccess().getVarKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDocDefinitionAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__0__Impl"


    // $ANTLR start "rule__DocDefinition__Group__1"
    // InternalPdfMk.g:1197:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1201:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:1202:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DocDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__2();

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
    // $ANTLR end "rule__DocDefinition__Group__1"


    // $ANTLR start "rule__DocDefinition__Group__1__Impl"
    // InternalPdfMk.g:1209:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1213:1: ( ( 'dd' ) )
            // InternalPdfMk.g:1214:1: ( 'dd' )
            {
            // InternalPdfMk.g:1214:1: ( 'dd' )
            // InternalPdfMk.g:1215:2: 'dd'
            {
             before(grammarAccess.getDocDefinitionAccess().getDdKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDocDefinitionAccess().getDdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__1__Impl"


    // $ANTLR start "rule__DocDefinition__Group__2"
    // InternalPdfMk.g:1224:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1228:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:1229:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DocDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__3();

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
    // $ANTLR end "rule__DocDefinition__Group__2"


    // $ANTLR start "rule__DocDefinition__Group__2__Impl"
    // InternalPdfMk.g:1236:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1240:1: ( ( '=' ) )
            // InternalPdfMk.g:1241:1: ( '=' )
            {
            // InternalPdfMk.g:1241:1: ( '=' )
            // InternalPdfMk.g:1242:2: '='
            {
             before(grammarAccess.getDocDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDocDefinitionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__2__Impl"


    // $ANTLR start "rule__DocDefinition__Group__3"
    // InternalPdfMk.g:1251:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1255:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:1256:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DocDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__4();

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
    // $ANTLR end "rule__DocDefinition__Group__3"


    // $ANTLR start "rule__DocDefinition__Group__3__Impl"
    // InternalPdfMk.g:1263:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1267:1: ( ( '{' ) )
            // InternalPdfMk.g:1268:1: ( '{' )
            {
            // InternalPdfMk.g:1268:1: ( '{' )
            // InternalPdfMk.g:1269:2: '{'
            {
             before(grammarAccess.getDocDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDocDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__3__Impl"


    // $ANTLR start "rule__DocDefinition__Group__4"
    // InternalPdfMk.g:1278:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1282:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:1283:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DocDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__5();

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
    // $ANTLR end "rule__DocDefinition__Group__4"


    // $ANTLR start "rule__DocDefinition__Group__4__Impl"
    // InternalPdfMk.g:1290:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1294:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:1295:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:1295:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:1296:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:1297:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:1297:3: rule__DocDefinition__ContentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DocDefinition__ContentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__4__Impl"


    // $ANTLR start "rule__DocDefinition__Group__5"
    // InternalPdfMk.g:1305:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1309:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:1310:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DocDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__6();

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
    // $ANTLR end "rule__DocDefinition__Group__5"


    // $ANTLR start "rule__DocDefinition__Group__5__Impl"
    // InternalPdfMk.g:1317:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1321:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:1322:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:1322:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:1323:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:1324:2: ( rule__DocDefinition__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1324:3: rule__DocDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DocDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__5__Impl"


    // $ANTLR start "rule__DocDefinition__Group__6"
    // InternalPdfMk.g:1332:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1336:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:1337:2: rule__DocDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group__6__Impl();

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
    // $ANTLR end "rule__DocDefinition__Group__6"


    // $ANTLR start "rule__DocDefinition__Group__6__Impl"
    // InternalPdfMk.g:1343:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1347:1: ( ( '}' ) )
            // InternalPdfMk.g:1348:1: ( '}' )
            {
            // InternalPdfMk.g:1348:1: ( '}' )
            // InternalPdfMk.g:1349:2: '}'
            {
             before(grammarAccess.getDocDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDocDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group__6__Impl"


    // $ANTLR start "rule__DocDefinition__Group_5__0"
    // InternalPdfMk.g:1359:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1363:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:1364:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__DocDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group_5__1();

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
    // $ANTLR end "rule__DocDefinition__Group_5__0"


    // $ANTLR start "rule__DocDefinition__Group_5__0__Impl"
    // InternalPdfMk.g:1371:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1375:1: ( ( ',' ) )
            // InternalPdfMk.g:1376:1: ( ',' )
            {
            // InternalPdfMk.g:1376:1: ( ',' )
            // InternalPdfMk.g:1377:2: ','
            {
             before(grammarAccess.getDocDefinitionAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDocDefinitionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__DocDefinition__Group_5__1"
    // InternalPdfMk.g:1386:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1390:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:1391:2: rule__DocDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocDefinition__Group_5__1__Impl();

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
    // $ANTLR end "rule__DocDefinition__Group_5__1"


    // $ANTLR start "rule__DocDefinition__Group_5__1__Impl"
    // InternalPdfMk.g:1397:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1401:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:1402:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:1402:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:1403:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:1404:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:1404:3: rule__DocDefinition__StylesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DocDefinition__StylesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__TypeFaceDefinition__Group__0"
    // InternalPdfMk.g:1413:1: rule__TypeFaceDefinition__Group__0 : rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 ;
    public final void rule__TypeFaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1417:1: ( rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 )
            // InternalPdfMk.g:1418:2: rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TypeFaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeFaceDefinition__Group__1();

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
    // $ANTLR end "rule__TypeFaceDefinition__Group__0"


    // $ANTLR start "rule__TypeFaceDefinition__Group__0__Impl"
    // InternalPdfMk.g:1425:1: rule__TypeFaceDefinition__Group__0__Impl : ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TypeFaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1429:1: ( ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1430:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1430:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1431:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1432:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1432:3: rule__TypeFaceDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeFaceDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFaceDefinition__Group__0__Impl"


    // $ANTLR start "rule__TypeFaceDefinition__Group__1"
    // InternalPdfMk.g:1440:1: rule__TypeFaceDefinition__Group__1 : rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 ;
    public final void rule__TypeFaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1444:1: ( rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 )
            // InternalPdfMk.g:1445:2: rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TypeFaceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeFaceDefinition__Group__2();

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
    // $ANTLR end "rule__TypeFaceDefinition__Group__1"


    // $ANTLR start "rule__TypeFaceDefinition__Group__1__Impl"
    // InternalPdfMk.g:1452:1: rule__TypeFaceDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeFaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1456:1: ( ( ':' ) )
            // InternalPdfMk.g:1457:1: ( ':' )
            {
            // InternalPdfMk.g:1457:1: ( ':' )
            // InternalPdfMk.g:1458:2: ':'
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeFaceDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFaceDefinition__Group__1__Impl"


    // $ANTLR start "rule__TypeFaceDefinition__Group__2"
    // InternalPdfMk.g:1467:1: rule__TypeFaceDefinition__Group__2 : rule__TypeFaceDefinition__Group__2__Impl ;
    public final void rule__TypeFaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1471:1: ( rule__TypeFaceDefinition__Group__2__Impl )
            // InternalPdfMk.g:1472:2: rule__TypeFaceDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeFaceDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__TypeFaceDefinition__Group__2"


    // $ANTLR start "rule__TypeFaceDefinition__Group__2__Impl"
    // InternalPdfMk.g:1478:1: rule__TypeFaceDefinition__Group__2__Impl : ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TypeFaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1482:1: ( ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1483:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1483:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1484:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1485:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1485:3: rule__TypeFaceDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeFaceDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFaceDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextStyleDefinition__Group__0"
    // InternalPdfMk.g:1494:1: rule__TextStyleDefinition__Group__0 : rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 ;
    public final void rule__TextStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1498:1: ( rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 )
            // InternalPdfMk.g:1499:2: rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TextStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextStyleDefinition__Group__1();

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
    // $ANTLR end "rule__TextStyleDefinition__Group__0"


    // $ANTLR start "rule__TextStyleDefinition__Group__0__Impl"
    // InternalPdfMk.g:1506:1: rule__TextStyleDefinition__Group__0__Impl : ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1510:1: ( ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1511:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1511:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1512:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1513:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1513:3: rule__TextStyleDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TextStyleDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextStyleDefinition__Group__0__Impl"


    // $ANTLR start "rule__TextStyleDefinition__Group__1"
    // InternalPdfMk.g:1521:1: rule__TextStyleDefinition__Group__1 : rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 ;
    public final void rule__TextStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1525:1: ( rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 )
            // InternalPdfMk.g:1526:2: rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TextStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextStyleDefinition__Group__2();

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
    // $ANTLR end "rule__TextStyleDefinition__Group__1"


    // $ANTLR start "rule__TextStyleDefinition__Group__1__Impl"
    // InternalPdfMk.g:1533:1: rule__TextStyleDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1537:1: ( ( ':' ) )
            // InternalPdfMk.g:1538:1: ( ':' )
            {
            // InternalPdfMk.g:1538:1: ( ':' )
            // InternalPdfMk.g:1539:2: ':'
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextStyleDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextStyleDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextStyleDefinition__Group__2"
    // InternalPdfMk.g:1548:1: rule__TextStyleDefinition__Group__2 : rule__TextStyleDefinition__Group__2__Impl ;
    public final void rule__TextStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1552:1: ( rule__TextStyleDefinition__Group__2__Impl )
            // InternalPdfMk.g:1553:2: rule__TextStyleDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextStyleDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__TextStyleDefinition__Group__2"


    // $ANTLR start "rule__TextStyleDefinition__Group__2__Impl"
    // InternalPdfMk.g:1559:1: rule__TextStyleDefinition__Group__2__Impl : ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1563:1: ( ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1564:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1564:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1565:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1566:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1566:3: rule__TextStyleDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TextStyleDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextStyleDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextDefinition__Group_0__0"
    // InternalPdfMk.g:1575:1: rule__TextDefinition__Group_0__0 : rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 ;
    public final void rule__TextDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1579:1: ( rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 )
            // InternalPdfMk.g:1580:2: rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__TextDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group_0__1();

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
    // $ANTLR end "rule__TextDefinition__Group_0__0"


    // $ANTLR start "rule__TextDefinition__Group_0__0__Impl"
    // InternalPdfMk.g:1587:1: rule__TextDefinition__Group_0__0__Impl : ( 'text:' ) ;
    public final void rule__TextDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1591:1: ( ( 'text:' ) )
            // InternalPdfMk.g:1592:1: ( 'text:' )
            {
            // InternalPdfMk.g:1592:1: ( 'text:' )
            // InternalPdfMk.g:1593:2: 'text:'
            {
             before(grammarAccess.getTextDefinitionAccess().getTextKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__TextDefinition__Group_0__1"
    // InternalPdfMk.g:1602:1: rule__TextDefinition__Group_0__1 : rule__TextDefinition__Group_0__1__Impl ;
    public final void rule__TextDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1606:1: ( rule__TextDefinition__Group_0__1__Impl )
            // InternalPdfMk.g:1607:2: rule__TextDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group_0__1__Impl();

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
    // $ANTLR end "rule__TextDefinition__Group_0__1"


    // $ANTLR start "rule__TextDefinition__Group_0__1__Impl"
    // InternalPdfMk.g:1613:1: rule__TextDefinition__Group_0__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1617:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1618:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1618:1: ( RULE_STRING )
            // InternalPdfMk.g:1619:2: RULE_STRING
            {
             before(grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__TextDefinition__Group_1__0"
    // InternalPdfMk.g:1629:1: rule__TextDefinition__Group_1__0 : rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 ;
    public final void rule__TextDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1633:1: ( rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 )
            // InternalPdfMk.g:1634:2: rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__TextDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group_1__1();

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
    // $ANTLR end "rule__TextDefinition__Group_1__0"


    // $ANTLR start "rule__TextDefinition__Group_1__0__Impl"
    // InternalPdfMk.g:1641:1: rule__TextDefinition__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TextDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1645:1: ( ( '[' ) )
            // InternalPdfMk.g:1646:1: ( '[' )
            {
            // InternalPdfMk.g:1646:1: ( '[' )
            // InternalPdfMk.g:1647:2: '['
            {
             before(grammarAccess.getTextDefinitionAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__TextDefinition__Group_1__1"
    // InternalPdfMk.g:1656:1: rule__TextDefinition__Group_1__1 : rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 ;
    public final void rule__TextDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1660:1: ( rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 )
            // InternalPdfMk.g:1661:2: rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__TextDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group_1__2();

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
    // $ANTLR end "rule__TextDefinition__Group_1__1"


    // $ANTLR start "rule__TextDefinition__Group_1__1__Impl"
    // InternalPdfMk.g:1668:1: rule__TextDefinition__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1672:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1673:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1673:1: ( RULE_STRING )
            // InternalPdfMk.g:1674:2: RULE_STRING
            {
             before(grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_1_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__TextDefinition__Group_1__2"
    // InternalPdfMk.g:1683:1: rule__TextDefinition__Group_1__2 : rule__TextDefinition__Group_1__2__Impl ;
    public final void rule__TextDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1687:1: ( rule__TextDefinition__Group_1__2__Impl )
            // InternalPdfMk.g:1688:2: rule__TextDefinition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group_1__2__Impl();

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
    // $ANTLR end "rule__TextDefinition__Group_1__2"


    // $ANTLR start "rule__TextDefinition__Group_1__2__Impl"
    // InternalPdfMk.g:1694:1: rule__TextDefinition__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TextDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1698:1: ( ( ']' ) )
            // InternalPdfMk.g:1699:1: ( ']' )
            {
            // InternalPdfMk.g:1699:1: ( ']' )
            // InternalPdfMk.g:1700:2: ']'
            {
             before(grammarAccess.getTextDefinitionAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__0"
    // InternalPdfMk.g:1710:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1714:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:1715:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TextAlignmentDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAlignmentDefinition__Group__1();

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
    // $ANTLR end "rule__TextAlignmentDefinition__Group__0"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__0__Impl"
    // InternalPdfMk.g:1722:1: rule__TextAlignmentDefinition__Group__0__Impl : ( 'alignment' ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1726:1: ( ( 'alignment' ) )
            // InternalPdfMk.g:1727:1: ( 'alignment' )
            {
            // InternalPdfMk.g:1727:1: ( 'alignment' )
            // InternalPdfMk.g:1728:2: 'alignment'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getAlignmentKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextAlignmentDefinitionAccess().getAlignmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAlignmentDefinition__Group__0__Impl"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__1"
    // InternalPdfMk.g:1737:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1741:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:1742:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TextAlignmentDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAlignmentDefinition__Group__2();

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
    // $ANTLR end "rule__TextAlignmentDefinition__Group__1"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__1__Impl"
    // InternalPdfMk.g:1749:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1753:1: ( ( ':' ) )
            // InternalPdfMk.g:1754:1: ( ':' )
            {
            // InternalPdfMk.g:1754:1: ( ':' )
            // InternalPdfMk.g:1755:2: ':'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAlignmentDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__2"
    // InternalPdfMk.g:1764:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1768:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:1769:2: rule__TextAlignmentDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAlignmentDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__TextAlignmentDefinition__Group__2"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__2__Impl"
    // InternalPdfMk.g:1775:1: rule__TextAlignmentDefinition__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1779:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1780:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1780:1: ( RULE_STRING )
            // InternalPdfMk.g:1781:2: RULE_STRING
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAlignmentDefinitionAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAlignmentDefinition__Group__2__Impl"


    // $ANTLR start "rule__ItalicsDefinition__Group__0"
    // InternalPdfMk.g:1791:1: rule__ItalicsDefinition__Group__0 : rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 ;
    public final void rule__ItalicsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1795:1: ( rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 )
            // InternalPdfMk.g:1796:2: rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ItalicsDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItalicsDefinition__Group__1();

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
    // $ANTLR end "rule__ItalicsDefinition__Group__0"


    // $ANTLR start "rule__ItalicsDefinition__Group__0__Impl"
    // InternalPdfMk.g:1803:1: rule__ItalicsDefinition__Group__0__Impl : ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ItalicsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1807:1: ( ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1808:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1808:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1809:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1810:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1810:3: rule__ItalicsDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ItalicsDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicsDefinition__Group__0__Impl"


    // $ANTLR start "rule__ItalicsDefinition__Group__1"
    // InternalPdfMk.g:1818:1: rule__ItalicsDefinition__Group__1 : rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 ;
    public final void rule__ItalicsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1822:1: ( rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 )
            // InternalPdfMk.g:1823:2: rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ItalicsDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItalicsDefinition__Group__2();

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
    // $ANTLR end "rule__ItalicsDefinition__Group__1"


    // $ANTLR start "rule__ItalicsDefinition__Group__1__Impl"
    // InternalPdfMk.g:1830:1: rule__ItalicsDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ItalicsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1834:1: ( ( ':' ) )
            // InternalPdfMk.g:1835:1: ( ':' )
            {
            // InternalPdfMk.g:1835:1: ( ':' )
            // InternalPdfMk.g:1836:2: ':'
            {
             before(grammarAccess.getItalicsDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getItalicsDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicsDefinition__Group__1__Impl"


    // $ANTLR start "rule__ItalicsDefinition__Group__2"
    // InternalPdfMk.g:1845:1: rule__ItalicsDefinition__Group__2 : rule__ItalicsDefinition__Group__2__Impl ;
    public final void rule__ItalicsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1849:1: ( rule__ItalicsDefinition__Group__2__Impl )
            // InternalPdfMk.g:1850:2: rule__ItalicsDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItalicsDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ItalicsDefinition__Group__2"


    // $ANTLR start "rule__ItalicsDefinition__Group__2__Impl"
    // InternalPdfMk.g:1856:1: rule__ItalicsDefinition__Group__2__Impl : ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ItalicsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1860:1: ( ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1861:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1861:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1862:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1863:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1863:3: rule__ItalicsDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ItalicsDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicsDefinition__Group__2__Impl"


    // $ANTLR start "rule__FontSizeDefinition__Group__0"
    // InternalPdfMk.g:1872:1: rule__FontSizeDefinition__Group__0 : rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 ;
    public final void rule__FontSizeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1876:1: ( rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 )
            // InternalPdfMk.g:1877:2: rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FontSizeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FontSizeDefinition__Group__1();

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
    // $ANTLR end "rule__FontSizeDefinition__Group__0"


    // $ANTLR start "rule__FontSizeDefinition__Group__0__Impl"
    // InternalPdfMk.g:1884:1: rule__FontSizeDefinition__Group__0__Impl : ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__FontSizeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1888:1: ( ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1889:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1889:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1890:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1891:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1891:3: rule__FontSizeDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FontSizeDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSizeDefinition__Group__0__Impl"


    // $ANTLR start "rule__FontSizeDefinition__Group__1"
    // InternalPdfMk.g:1899:1: rule__FontSizeDefinition__Group__1 : rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 ;
    public final void rule__FontSizeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1903:1: ( rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 )
            // InternalPdfMk.g:1904:2: rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FontSizeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FontSizeDefinition__Group__2();

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
    // $ANTLR end "rule__FontSizeDefinition__Group__1"


    // $ANTLR start "rule__FontSizeDefinition__Group__1__Impl"
    // InternalPdfMk.g:1911:1: rule__FontSizeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FontSizeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1915:1: ( ( ':' ) )
            // InternalPdfMk.g:1916:1: ( ':' )
            {
            // InternalPdfMk.g:1916:1: ( ':' )
            // InternalPdfMk.g:1917:2: ':'
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFontSizeDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSizeDefinition__Group__1__Impl"


    // $ANTLR start "rule__FontSizeDefinition__Group__2"
    // InternalPdfMk.g:1926:1: rule__FontSizeDefinition__Group__2 : rule__FontSizeDefinition__Group__2__Impl ;
    public final void rule__FontSizeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1930:1: ( rule__FontSizeDefinition__Group__2__Impl )
            // InternalPdfMk.g:1931:2: rule__FontSizeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FontSizeDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__FontSizeDefinition__Group__2"


    // $ANTLR start "rule__FontSizeDefinition__Group__2__Impl"
    // InternalPdfMk.g:1937:1: rule__FontSizeDefinition__Group__2__Impl : ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__FontSizeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1941:1: ( ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1942:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1942:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1943:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1944:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1944:3: rule__FontSizeDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FontSizeDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSizeDefinition__Group__2__Impl"


    // $ANTLR start "rule__WidthDefinition__Group__0"
    // InternalPdfMk.g:1953:1: rule__WidthDefinition__Group__0 : rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 ;
    public final void rule__WidthDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1957:1: ( rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 )
            // InternalPdfMk.g:1958:2: rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WidthDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidthDefinition__Group__1();

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
    // $ANTLR end "rule__WidthDefinition__Group__0"


    // $ANTLR start "rule__WidthDefinition__Group__0__Impl"
    // InternalPdfMk.g:1965:1: rule__WidthDefinition__Group__0__Impl : ( ( rule__WidthDefinition__KeyAssignment_0 ) ) ;
    public final void rule__WidthDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1969:1: ( ( ( rule__WidthDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1970:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1970:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1971:2: ( rule__WidthDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1972:2: ( rule__WidthDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1972:3: rule__WidthDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WidthDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWidthDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidthDefinition__Group__0__Impl"


    // $ANTLR start "rule__WidthDefinition__Group__1"
    // InternalPdfMk.g:1980:1: rule__WidthDefinition__Group__1 : rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 ;
    public final void rule__WidthDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1984:1: ( rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 )
            // InternalPdfMk.g:1985:2: rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__WidthDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidthDefinition__Group__2();

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
    // $ANTLR end "rule__WidthDefinition__Group__1"


    // $ANTLR start "rule__WidthDefinition__Group__1__Impl"
    // InternalPdfMk.g:1992:1: rule__WidthDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WidthDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1996:1: ( ( ':' ) )
            // InternalPdfMk.g:1997:1: ( ':' )
            {
            // InternalPdfMk.g:1997:1: ( ':' )
            // InternalPdfMk.g:1998:2: ':'
            {
             before(grammarAccess.getWidthDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWidthDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidthDefinition__Group__1__Impl"


    // $ANTLR start "rule__WidthDefinition__Group__2"
    // InternalPdfMk.g:2007:1: rule__WidthDefinition__Group__2 : rule__WidthDefinition__Group__2__Impl ;
    public final void rule__WidthDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2011:1: ( rule__WidthDefinition__Group__2__Impl )
            // InternalPdfMk.g:2012:2: rule__WidthDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidthDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__WidthDefinition__Group__2"


    // $ANTLR start "rule__WidthDefinition__Group__2__Impl"
    // InternalPdfMk.g:2018:1: rule__WidthDefinition__Group__2__Impl : ( ( rule__WidthDefinition__ValueAssignment_2 ) ) ;
    public final void rule__WidthDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2022:1: ( ( ( rule__WidthDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2023:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2023:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2024:2: ( rule__WidthDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2025:2: ( rule__WidthDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2025:3: rule__WidthDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WidthDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWidthDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidthDefinition__Group__2__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__0"
    // InternalPdfMk.g:2034:1: rule__ColumnDefinition__Group__0 : rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 ;
    public final void rule__ColumnDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2038:1: ( rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 )
            // InternalPdfMk.g:2039:2: rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ColumnDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__1();

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
    // $ANTLR end "rule__ColumnDefinition__Group__0"


    // $ANTLR start "rule__ColumnDefinition__Group__0__Impl"
    // InternalPdfMk.g:2046:1: rule__ColumnDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__ColumnDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2050:1: ( ( '{' ) )
            // InternalPdfMk.g:2051:1: ( '{' )
            {
            // InternalPdfMk.g:2051:1: ( '{' )
            // InternalPdfMk.g:2052:2: '{'
            {
             before(grammarAccess.getColumnDefinitionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group__0__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__1"
    // InternalPdfMk.g:2061:1: rule__ColumnDefinition__Group__1 : rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 ;
    public final void rule__ColumnDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2065:1: ( rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 )
            // InternalPdfMk.g:2066:2: rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ColumnDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__2();

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
    // $ANTLR end "rule__ColumnDefinition__Group__1"


    // $ANTLR start "rule__ColumnDefinition__Group__1__Impl"
    // InternalPdfMk.g:2073:1: rule__ColumnDefinition__Group__1__Impl : ( ( rule__ColumnDefinition__Group_1__0 )? ) ;
    public final void rule__ColumnDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2077:1: ( ( ( rule__ColumnDefinition__Group_1__0 )? ) )
            // InternalPdfMk.g:2078:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            {
            // InternalPdfMk.g:2078:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            // InternalPdfMk.g:2079:2: ( rule__ColumnDefinition__Group_1__0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_1()); 
            // InternalPdfMk.g:2080:2: ( rule__ColumnDefinition__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:2080:3: rule__ColumnDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group__1__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__2"
    // InternalPdfMk.g:2088:1: rule__ColumnDefinition__Group__2 : rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 ;
    public final void rule__ColumnDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2092:1: ( rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 )
            // InternalPdfMk.g:2093:2: rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ColumnDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__3();

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
    // $ANTLR end "rule__ColumnDefinition__Group__2"


    // $ANTLR start "rule__ColumnDefinition__Group__2__Impl"
    // InternalPdfMk.g:2100:1: rule__ColumnDefinition__Group__2__Impl : ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) ;
    public final void rule__ColumnDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2104:1: ( ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) )
            // InternalPdfMk.g:2105:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            {
            // InternalPdfMk.g:2105:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            // InternalPdfMk.g:2106:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyAssignment_2()); 
            // InternalPdfMk.g:2107:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            // InternalPdfMk.g:2107:3: rule__ColumnDefinition__KeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group__2__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__3"
    // InternalPdfMk.g:2115:1: rule__ColumnDefinition__Group__3 : rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 ;
    public final void rule__ColumnDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2119:1: ( rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 )
            // InternalPdfMk.g:2120:2: rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ColumnDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__4();

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
    // $ANTLR end "rule__ColumnDefinition__Group__3"


    // $ANTLR start "rule__ColumnDefinition__Group__3__Impl"
    // InternalPdfMk.g:2127:1: rule__ColumnDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2131:1: ( ( ':' ) )
            // InternalPdfMk.g:2132:1: ( ':' )
            {
            // InternalPdfMk.g:2132:1: ( ':' )
            // InternalPdfMk.g:2133:2: ':'
            {
             before(grammarAccess.getColumnDefinitionAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group__3__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__4"
    // InternalPdfMk.g:2142:1: rule__ColumnDefinition__Group__4 : rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 ;
    public final void rule__ColumnDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2146:1: ( rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 )
            // InternalPdfMk.g:2147:2: rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ColumnDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__5();

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
    // $ANTLR end "rule__ColumnDefinition__Group__4"


    // $ANTLR start "rule__ColumnDefinition__Group__4__Impl"
    // InternalPdfMk.g:2154:1: rule__ColumnDefinition__Group__4__Impl : ( ( rule__ColumnDefinition__Group_4__0 ) ) ;
    public final void rule__ColumnDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2158:1: ( ( ( rule__ColumnDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:2159:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:2159:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            // InternalPdfMk.g:2160:2: ( rule__ColumnDefinition__Group_4__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2161:2: ( rule__ColumnDefinition__Group_4__0 )
            // InternalPdfMk.g:2161:3: rule__ColumnDefinition__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group__4__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group__5"
    // InternalPdfMk.g:2169:1: rule__ColumnDefinition__Group__5 : rule__ColumnDefinition__Group__5__Impl ;
    public final void rule__ColumnDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2173:1: ( rule__ColumnDefinition__Group__5__Impl )
            // InternalPdfMk.g:2174:2: rule__ColumnDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__ColumnDefinition__Group__5"


    // $ANTLR start "rule__ColumnDefinition__Group__5__Impl"
    // InternalPdfMk.g:2180:1: rule__ColumnDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ColumnDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2184:1: ( ( '}' ) )
            // InternalPdfMk.g:2185:1: ( '}' )
            {
            // InternalPdfMk.g:2185:1: ( '}' )
            // InternalPdfMk.g:2186:2: '}'
            {
             before(grammarAccess.getColumnDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group__5__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group_1__0"
    // InternalPdfMk.g:2196:1: rule__ColumnDefinition__Group_1__0 : rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 ;
    public final void rule__ColumnDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2200:1: ( rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 )
            // InternalPdfMk.g:2201:2: rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ColumnDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_1__1();

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
    // $ANTLR end "rule__ColumnDefinition__Group_1__0"


    // $ANTLR start "rule__ColumnDefinition__Group_1__0__Impl"
    // InternalPdfMk.g:2208:1: rule__ColumnDefinition__Group_1__0__Impl : ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) ;
    public final void rule__ColumnDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2212:1: ( ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:2213:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:2213:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            // InternalPdfMk.g:2214:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGlobalStyleAssignment_1_0()); 
            // InternalPdfMk.g:2215:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            // InternalPdfMk.g:2215:3: rule__ColumnDefinition__GlobalStyleAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__GlobalStyleAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getGlobalStyleAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group_1__1"
    // InternalPdfMk.g:2223:1: rule__ColumnDefinition__Group_1__1 : rule__ColumnDefinition__Group_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2227:1: ( rule__ColumnDefinition__Group_1__1__Impl )
            // InternalPdfMk.g:2228:2: rule__ColumnDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_1__1__Impl();

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
    // $ANTLR end "rule__ColumnDefinition__Group_1__1"


    // $ANTLR start "rule__ColumnDefinition__Group_1__1__Impl"
    // InternalPdfMk.g:2234:1: rule__ColumnDefinition__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2238:1: ( ( ',' ) )
            // InternalPdfMk.g:2239:1: ( ',' )
            {
            // InternalPdfMk.g:2239:1: ( ',' )
            // InternalPdfMk.g:2240:2: ','
            {
             before(grammarAccess.getColumnDefinitionAccess().getCommaKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group_4__0"
    // InternalPdfMk.g:2250:1: rule__ColumnDefinition__Group_4__0 : rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 ;
    public final void rule__ColumnDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2254:1: ( rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 )
            // InternalPdfMk.g:2255:2: rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__ColumnDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_4__1();

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
    // $ANTLR end "rule__ColumnDefinition__Group_4__0"


    // $ANTLR start "rule__ColumnDefinition__Group_4__0__Impl"
    // InternalPdfMk.g:2262:1: rule__ColumnDefinition__Group_4__0__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) ;
    public final void rule__ColumnDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2266:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) )
            // InternalPdfMk.g:2267:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            {
            // InternalPdfMk.g:2267:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            // InternalPdfMk.g:2268:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_0()); 
            // InternalPdfMk.g:2269:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:2269:3: rule__ColumnDefinition__ValueAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnDefinition__ValueAssignment_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group_4__1"
    // InternalPdfMk.g:2277:1: rule__ColumnDefinition__Group_4__1 : rule__ColumnDefinition__Group_4__1__Impl ;
    public final void rule__ColumnDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2281:1: ( rule__ColumnDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2282:2: rule__ColumnDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__ColumnDefinition__Group_4__1"


    // $ANTLR start "rule__ColumnDefinition__Group_4__1__Impl"
    // InternalPdfMk.g:2288:1: rule__ColumnDefinition__Group_4__1__Impl : ( ( rule__ColumnDefinition__Group_4_1__0 )* ) ;
    public final void rule__ColumnDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2292:1: ( ( ( rule__ColumnDefinition__Group_4_1__0 )* ) )
            // InternalPdfMk.g:2293:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:2293:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            // InternalPdfMk.g:2294:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4_1()); 
            // InternalPdfMk.g:2295:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPdfMk.g:2295:3: rule__ColumnDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getColumnDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group_4_1__0"
    // InternalPdfMk.g:2304:1: rule__ColumnDefinition__Group_4_1__0 : rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 ;
    public final void rule__ColumnDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2308:1: ( rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 )
            // InternalPdfMk.g:2309:2: rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ColumnDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_4_1__1();

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
    // $ANTLR end "rule__ColumnDefinition__Group_4_1__0"


    // $ANTLR start "rule__ColumnDefinition__Group_4_1__0__Impl"
    // InternalPdfMk.g:2316:1: rule__ColumnDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2320:1: ( ( ',' ) )
            // InternalPdfMk.g:2321:1: ( ',' )
            {
            // InternalPdfMk.g:2321:1: ( ',' )
            // InternalPdfMk.g:2322:2: ','
            {
             before(grammarAccess.getColumnDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__ColumnDefinition__Group_4_1__1"
    // InternalPdfMk.g:2331:1: rule__ColumnDefinition__Group_4_1__1 : rule__ColumnDefinition__Group_4_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2335:1: ( rule__ColumnDefinition__Group_4_1__1__Impl )
            // InternalPdfMk.g:2336:2: rule__ColumnDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__ColumnDefinition__Group_4_1__1"


    // $ANTLR start "rule__ColumnDefinition__Group_4_1__1__Impl"
    // InternalPdfMk.g:2342:1: rule__ColumnDefinition__Group_4_1__1__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) ;
    public final void rule__ColumnDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2346:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:2347:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:2347:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            // InternalPdfMk.g:2348:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_1_1()); 
            // InternalPdfMk.g:2349:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            // InternalPdfMk.g:2349:3: rule__ColumnDefinition__ValueAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDefinition__ValueAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__MarginDefinition__Group__0"
    // InternalPdfMk.g:2358:1: rule__MarginDefinition__Group__0 : rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 ;
    public final void rule__MarginDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2362:1: ( rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 )
            // InternalPdfMk.g:2363:2: rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MarginDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__1();

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
    // $ANTLR end "rule__MarginDefinition__Group__0"


    // $ANTLR start "rule__MarginDefinition__Group__0__Impl"
    // InternalPdfMk.g:2370:1: rule__MarginDefinition__Group__0__Impl : ( ( rule__MarginDefinition__KeyAssignment_0 ) ) ;
    public final void rule__MarginDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2374:1: ( ( ( rule__MarginDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2375:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2375:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2376:2: ( rule__MarginDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2377:2: ( rule__MarginDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2377:3: rule__MarginDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MarginDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMarginDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group__0__Impl"


    // $ANTLR start "rule__MarginDefinition__Group__1"
    // InternalPdfMk.g:2385:1: rule__MarginDefinition__Group__1 : rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 ;
    public final void rule__MarginDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2389:1: ( rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 )
            // InternalPdfMk.g:2390:2: rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__MarginDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__2();

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
    // $ANTLR end "rule__MarginDefinition__Group__1"


    // $ANTLR start "rule__MarginDefinition__Group__1__Impl"
    // InternalPdfMk.g:2397:1: rule__MarginDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MarginDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2401:1: ( ( ':' ) )
            // InternalPdfMk.g:2402:1: ( ':' )
            {
            // InternalPdfMk.g:2402:1: ( ':' )
            // InternalPdfMk.g:2403:2: ':'
            {
             before(grammarAccess.getMarginDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group__1__Impl"


    // $ANTLR start "rule__MarginDefinition__Group__2"
    // InternalPdfMk.g:2412:1: rule__MarginDefinition__Group__2 : rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 ;
    public final void rule__MarginDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2416:1: ( rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 )
            // InternalPdfMk.g:2417:2: rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MarginDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__3();

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
    // $ANTLR end "rule__MarginDefinition__Group__2"


    // $ANTLR start "rule__MarginDefinition__Group__2__Impl"
    // InternalPdfMk.g:2424:1: rule__MarginDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__MarginDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2428:1: ( ( '[' ) )
            // InternalPdfMk.g:2429:1: ( '[' )
            {
            // InternalPdfMk.g:2429:1: ( '[' )
            // InternalPdfMk.g:2430:2: '['
            {
             before(grammarAccess.getMarginDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group__2__Impl"


    // $ANTLR start "rule__MarginDefinition__Group__3"
    // InternalPdfMk.g:2439:1: rule__MarginDefinition__Group__3 : rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 ;
    public final void rule__MarginDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2443:1: ( rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 )
            // InternalPdfMk.g:2444:2: rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__MarginDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__4();

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
    // $ANTLR end "rule__MarginDefinition__Group__3"


    // $ANTLR start "rule__MarginDefinition__Group__3__Impl"
    // InternalPdfMk.g:2451:1: rule__MarginDefinition__Group__3__Impl : ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) ;
    public final void rule__MarginDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2455:1: ( ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) )
            // InternalPdfMk.g:2456:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            {
            // InternalPdfMk.g:2456:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            // InternalPdfMk.g:2457:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:2458:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:2458:3: rule__MarginDefinition__ValuesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MarginDefinition__ValuesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group__3__Impl"


    // $ANTLR start "rule__MarginDefinition__Group__4"
    // InternalPdfMk.g:2466:1: rule__MarginDefinition__Group__4 : rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 ;
    public final void rule__MarginDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2470:1: ( rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 )
            // InternalPdfMk.g:2471:2: rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__MarginDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__5();

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
    // $ANTLR end "rule__MarginDefinition__Group__4"


    // $ANTLR start "rule__MarginDefinition__Group__4__Impl"
    // InternalPdfMk.g:2478:1: rule__MarginDefinition__Group__4__Impl : ( ( rule__MarginDefinition__Group_4__0 )* ) ;
    public final void rule__MarginDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2482:1: ( ( ( rule__MarginDefinition__Group_4__0 )* ) )
            // InternalPdfMk.g:2483:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            {
            // InternalPdfMk.g:2483:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            // InternalPdfMk.g:2484:2: ( rule__MarginDefinition__Group_4__0 )*
            {
             before(grammarAccess.getMarginDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2485:2: ( rule__MarginDefinition__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPdfMk.g:2485:3: rule__MarginDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MarginDefinition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMarginDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group__4__Impl"


    // $ANTLR start "rule__MarginDefinition__Group__5"
    // InternalPdfMk.g:2493:1: rule__MarginDefinition__Group__5 : rule__MarginDefinition__Group__5__Impl ;
    public final void rule__MarginDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2497:1: ( rule__MarginDefinition__Group__5__Impl )
            // InternalPdfMk.g:2498:2: rule__MarginDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__MarginDefinition__Group__5"


    // $ANTLR start "rule__MarginDefinition__Group__5__Impl"
    // InternalPdfMk.g:2504:1: rule__MarginDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__MarginDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2508:1: ( ( ']' ) )
            // InternalPdfMk.g:2509:1: ( ']' )
            {
            // InternalPdfMk.g:2509:1: ( ']' )
            // InternalPdfMk.g:2510:2: ']'
            {
             before(grammarAccess.getMarginDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group__5__Impl"


    // $ANTLR start "rule__MarginDefinition__Group_4__0"
    // InternalPdfMk.g:2520:1: rule__MarginDefinition__Group_4__0 : rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 ;
    public final void rule__MarginDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2524:1: ( rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 )
            // InternalPdfMk.g:2525:2: rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__MarginDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group_4__1();

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
    // $ANTLR end "rule__MarginDefinition__Group_4__0"


    // $ANTLR start "rule__MarginDefinition__Group_4__0__Impl"
    // InternalPdfMk.g:2532:1: rule__MarginDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MarginDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2536:1: ( ( ',' ) )
            // InternalPdfMk.g:2537:1: ( ',' )
            {
            // InternalPdfMk.g:2537:1: ( ',' )
            // InternalPdfMk.g:2538:2: ','
            {
             before(grammarAccess.getMarginDefinitionAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__MarginDefinition__Group_4__1"
    // InternalPdfMk.g:2547:1: rule__MarginDefinition__Group_4__1 : rule__MarginDefinition__Group_4__1__Impl ;
    public final void rule__MarginDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2551:1: ( rule__MarginDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2552:2: rule__MarginDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarginDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__MarginDefinition__Group_4__1"


    // $ANTLR start "rule__MarginDefinition__Group_4__1__Impl"
    // InternalPdfMk.g:2558:1: rule__MarginDefinition__Group_4__1__Impl : ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__MarginDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2562:1: ( ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:2563:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:2563:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:2564:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:2565:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:2565:3: rule__MarginDefinition__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MarginDefinition__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ImageDefintion__Group__0"
    // InternalPdfMk.g:2574:1: rule__ImageDefintion__Group__0 : rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 ;
    public final void rule__ImageDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2578:1: ( rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 )
            // InternalPdfMk.g:2579:2: rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageDefintion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDefintion__Group__1();

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
    // $ANTLR end "rule__ImageDefintion__Group__0"


    // $ANTLR start "rule__ImageDefintion__Group__0__Impl"
    // InternalPdfMk.g:2586:1: rule__ImageDefintion__Group__0__Impl : ( ( rule__ImageDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2590:1: ( ( ( rule__ImageDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2591:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2591:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2592:2: ( rule__ImageDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2593:2: ( rule__ImageDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2593:3: rule__ImageDefintion__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDefintion__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageDefintionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDefintion__Group__0__Impl"


    // $ANTLR start "rule__ImageDefintion__Group__1"
    // InternalPdfMk.g:2601:1: rule__ImageDefintion__Group__1 : rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 ;
    public final void rule__ImageDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2605:1: ( rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 )
            // InternalPdfMk.g:2606:2: rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ImageDefintion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDefintion__Group__2();

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
    // $ANTLR end "rule__ImageDefintion__Group__1"


    // $ANTLR start "rule__ImageDefintion__Group__1__Impl"
    // InternalPdfMk.g:2613:1: rule__ImageDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2617:1: ( ( ':' ) )
            // InternalPdfMk.g:2618:1: ( ':' )
            {
            // InternalPdfMk.g:2618:1: ( ':' )
            // InternalPdfMk.g:2619:2: ':'
            {
             before(grammarAccess.getImageDefintionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImageDefintionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDefintion__Group__1__Impl"


    // $ANTLR start "rule__ImageDefintion__Group__2"
    // InternalPdfMk.g:2628:1: rule__ImageDefintion__Group__2 : rule__ImageDefintion__Group__2__Impl ;
    public final void rule__ImageDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2632:1: ( rule__ImageDefintion__Group__2__Impl )
            // InternalPdfMk.g:2633:2: rule__ImageDefintion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDefintion__Group__2__Impl();

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
    // $ANTLR end "rule__ImageDefintion__Group__2"


    // $ANTLR start "rule__ImageDefintion__Group__2__Impl"
    // InternalPdfMk.g:2639:1: rule__ImageDefintion__Group__2__Impl : ( ( rule__ImageDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2643:1: ( ( ( rule__ImageDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2644:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2644:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2645:2: ( rule__ImageDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2646:2: ( rule__ImageDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2646:3: rule__ImageDefintion__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageDefintion__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageDefintionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDefintion__Group__2__Impl"


    // $ANTLR start "rule__ImageWidthDefintion__Group__0"
    // InternalPdfMk.g:2655:1: rule__ImageWidthDefintion__Group__0 : rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 ;
    public final void rule__ImageWidthDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2659:1: ( rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 )
            // InternalPdfMk.g:2660:2: rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageWidthDefintion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageWidthDefintion__Group__1();

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
    // $ANTLR end "rule__ImageWidthDefintion__Group__0"


    // $ANTLR start "rule__ImageWidthDefintion__Group__0__Impl"
    // InternalPdfMk.g:2667:1: rule__ImageWidthDefintion__Group__0__Impl : ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageWidthDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2671:1: ( ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2672:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2672:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2673:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2674:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2674:3: rule__ImageWidthDefintion__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageWidthDefintion__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageWidthDefintionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageWidthDefintion__Group__0__Impl"


    // $ANTLR start "rule__ImageWidthDefintion__Group__1"
    // InternalPdfMk.g:2682:1: rule__ImageWidthDefintion__Group__1 : rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 ;
    public final void rule__ImageWidthDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2686:1: ( rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 )
            // InternalPdfMk.g:2687:2: rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ImageWidthDefintion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageWidthDefintion__Group__2();

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
    // $ANTLR end "rule__ImageWidthDefintion__Group__1"


    // $ANTLR start "rule__ImageWidthDefintion__Group__1__Impl"
    // InternalPdfMk.g:2694:1: rule__ImageWidthDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageWidthDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2698:1: ( ( ':' ) )
            // InternalPdfMk.g:2699:1: ( ':' )
            {
            // InternalPdfMk.g:2699:1: ( ':' )
            // InternalPdfMk.g:2700:2: ':'
            {
             before(grammarAccess.getImageWidthDefintionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImageWidthDefintionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageWidthDefintion__Group__1__Impl"


    // $ANTLR start "rule__ImageWidthDefintion__Group__2"
    // InternalPdfMk.g:2709:1: rule__ImageWidthDefintion__Group__2 : rule__ImageWidthDefintion__Group__2__Impl ;
    public final void rule__ImageWidthDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2713:1: ( rule__ImageWidthDefintion__Group__2__Impl )
            // InternalPdfMk.g:2714:2: rule__ImageWidthDefintion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageWidthDefintion__Group__2__Impl();

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
    // $ANTLR end "rule__ImageWidthDefintion__Group__2"


    // $ANTLR start "rule__ImageWidthDefintion__Group__2__Impl"
    // InternalPdfMk.g:2720:1: rule__ImageWidthDefintion__Group__2__Impl : ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageWidthDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2724:1: ( ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2725:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2725:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2726:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2727:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2727:3: rule__ImageWidthDefintion__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageWidthDefintion__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageWidthDefintionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageWidthDefintion__Group__2__Impl"


    // $ANTLR start "rule__ImageHeightDefintion__Group__0"
    // InternalPdfMk.g:2736:1: rule__ImageHeightDefintion__Group__0 : rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 ;
    public final void rule__ImageHeightDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2740:1: ( rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 )
            // InternalPdfMk.g:2741:2: rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageHeightDefintion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageHeightDefintion__Group__1();

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
    // $ANTLR end "rule__ImageHeightDefintion__Group__0"


    // $ANTLR start "rule__ImageHeightDefintion__Group__0__Impl"
    // InternalPdfMk.g:2748:1: rule__ImageHeightDefintion__Group__0__Impl : ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageHeightDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2752:1: ( ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2753:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2753:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2754:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2755:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2755:3: rule__ImageHeightDefintion__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageHeightDefintion__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageHeightDefintionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageHeightDefintion__Group__0__Impl"


    // $ANTLR start "rule__ImageHeightDefintion__Group__1"
    // InternalPdfMk.g:2763:1: rule__ImageHeightDefintion__Group__1 : rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 ;
    public final void rule__ImageHeightDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2767:1: ( rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 )
            // InternalPdfMk.g:2768:2: rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ImageHeightDefintion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageHeightDefintion__Group__2();

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
    // $ANTLR end "rule__ImageHeightDefintion__Group__1"


    // $ANTLR start "rule__ImageHeightDefintion__Group__1__Impl"
    // InternalPdfMk.g:2775:1: rule__ImageHeightDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageHeightDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2779:1: ( ( ':' ) )
            // InternalPdfMk.g:2780:1: ( ':' )
            {
            // InternalPdfMk.g:2780:1: ( ':' )
            // InternalPdfMk.g:2781:2: ':'
            {
             before(grammarAccess.getImageHeightDefintionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImageHeightDefintionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageHeightDefintion__Group__1__Impl"


    // $ANTLR start "rule__ImageHeightDefintion__Group__2"
    // InternalPdfMk.g:2790:1: rule__ImageHeightDefintion__Group__2 : rule__ImageHeightDefintion__Group__2__Impl ;
    public final void rule__ImageHeightDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2794:1: ( rule__ImageHeightDefintion__Group__2__Impl )
            // InternalPdfMk.g:2795:2: rule__ImageHeightDefintion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageHeightDefintion__Group__2__Impl();

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
    // $ANTLR end "rule__ImageHeightDefintion__Group__2"


    // $ANTLR start "rule__ImageHeightDefintion__Group__2__Impl"
    // InternalPdfMk.g:2801:1: rule__ImageHeightDefintion__Group__2__Impl : ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageHeightDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2805:1: ( ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2806:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2806:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2807:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2808:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2808:3: rule__ImageHeightDefintion__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageHeightDefintion__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageHeightDefintionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageHeightDefintion__Group__2__Impl"


    // $ANTLR start "rule__ImagePageBreakDefinition__Group__0"
    // InternalPdfMk.g:2817:1: rule__ImagePageBreakDefinition__Group__0 : rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 ;
    public final void rule__ImagePageBreakDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2821:1: ( rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 )
            // InternalPdfMk.g:2822:2: rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ImagePageBreakDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImagePageBreakDefinition__Group__1();

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
    // $ANTLR end "rule__ImagePageBreakDefinition__Group__0"


    // $ANTLR start "rule__ImagePageBreakDefinition__Group__0__Impl"
    // InternalPdfMk.g:2829:1: rule__ImagePageBreakDefinition__Group__0__Impl : ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2833:1: ( ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2834:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2834:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2835:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2836:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2836:3: rule__ImagePageBreakDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImagePageBreakDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImagePageBreakDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagePageBreakDefinition__Group__0__Impl"


    // $ANTLR start "rule__ImagePageBreakDefinition__Group__1"
    // InternalPdfMk.g:2844:1: rule__ImagePageBreakDefinition__Group__1 : rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 ;
    public final void rule__ImagePageBreakDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2848:1: ( rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 )
            // InternalPdfMk.g:2849:2: rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ImagePageBreakDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImagePageBreakDefinition__Group__2();

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
    // $ANTLR end "rule__ImagePageBreakDefinition__Group__1"


    // $ANTLR start "rule__ImagePageBreakDefinition__Group__1__Impl"
    // InternalPdfMk.g:2856:1: rule__ImagePageBreakDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImagePageBreakDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2860:1: ( ( ':' ) )
            // InternalPdfMk.g:2861:1: ( ':' )
            {
            // InternalPdfMk.g:2861:1: ( ':' )
            // InternalPdfMk.g:2862:2: ':'
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImagePageBreakDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagePageBreakDefinition__Group__1__Impl"


    // $ANTLR start "rule__ImagePageBreakDefinition__Group__2"
    // InternalPdfMk.g:2871:1: rule__ImagePageBreakDefinition__Group__2 : rule__ImagePageBreakDefinition__Group__2__Impl ;
    public final void rule__ImagePageBreakDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2875:1: ( rule__ImagePageBreakDefinition__Group__2__Impl )
            // InternalPdfMk.g:2876:2: rule__ImagePageBreakDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImagePageBreakDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ImagePageBreakDefinition__Group__2"


    // $ANTLR start "rule__ImagePageBreakDefinition__Group__2__Impl"
    // InternalPdfMk.g:2882:1: rule__ImagePageBreakDefinition__Group__2__Impl : ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2886:1: ( ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2887:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2887:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2888:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2889:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2889:3: rule__ImagePageBreakDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImagePageBreakDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImagePageBreakDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagePageBreakDefinition__Group__2__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group__0"
    // InternalPdfMk.g:2898:1: rule__ImageFitDefinition__Group__0 : rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 ;
    public final void rule__ImageFitDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2902:1: ( rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 )
            // InternalPdfMk.g:2903:2: rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageFitDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__1();

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
    // $ANTLR end "rule__ImageFitDefinition__Group__0"


    // $ANTLR start "rule__ImageFitDefinition__Group__0__Impl"
    // InternalPdfMk.g:2910:1: rule__ImageFitDefinition__Group__0__Impl : ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageFitDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2914:1: ( ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2915:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2915:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2916:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2917:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2917:3: rule__ImageFitDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageFitDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group__0__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group__1"
    // InternalPdfMk.g:2925:1: rule__ImageFitDefinition__Group__1 : rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 ;
    public final void rule__ImageFitDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2929:1: ( rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 )
            // InternalPdfMk.g:2930:2: rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ImageFitDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__2();

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
    // $ANTLR end "rule__ImageFitDefinition__Group__1"


    // $ANTLR start "rule__ImageFitDefinition__Group__1__Impl"
    // InternalPdfMk.g:2937:1: rule__ImageFitDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageFitDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2941:1: ( ( ':' ) )
            // InternalPdfMk.g:2942:1: ( ':' )
            {
            // InternalPdfMk.g:2942:1: ( ':' )
            // InternalPdfMk.g:2943:2: ':'
            {
             before(grammarAccess.getImageFitDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group__1__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group__2"
    // InternalPdfMk.g:2952:1: rule__ImageFitDefinition__Group__2 : rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 ;
    public final void rule__ImageFitDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2956:1: ( rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 )
            // InternalPdfMk.g:2957:2: rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ImageFitDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__3();

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
    // $ANTLR end "rule__ImageFitDefinition__Group__2"


    // $ANTLR start "rule__ImageFitDefinition__Group__2__Impl"
    // InternalPdfMk.g:2964:1: rule__ImageFitDefinition__Group__2__Impl : ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageFitDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2968:1: ( ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2969:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2969:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2970:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2971:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2971:3: rule__ImageFitDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageFitDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group__2__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group__3"
    // InternalPdfMk.g:2979:1: rule__ImageFitDefinition__Group__3 : rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 ;
    public final void rule__ImageFitDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2983:1: ( rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 )
            // InternalPdfMk.g:2984:2: rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ImageFitDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__4();

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
    // $ANTLR end "rule__ImageFitDefinition__Group__3"


    // $ANTLR start "rule__ImageFitDefinition__Group__3__Impl"
    // InternalPdfMk.g:2991:1: rule__ImageFitDefinition__Group__3__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) ;
    public final void rule__ImageFitDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2995:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) )
            // InternalPdfMk.g:2996:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            {
            // InternalPdfMk.g:2996:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            // InternalPdfMk.g:2997:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:2998:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            // InternalPdfMk.g:2998:3: rule__ImageFitDefinition__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group__3__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group__4"
    // InternalPdfMk.g:3006:1: rule__ImageFitDefinition__Group__4 : rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 ;
    public final void rule__ImageFitDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3010:1: ( rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 )
            // InternalPdfMk.g:3011:2: rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ImageFitDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__5();

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
    // $ANTLR end "rule__ImageFitDefinition__Group__4"


    // $ANTLR start "rule__ImageFitDefinition__Group__4__Impl"
    // InternalPdfMk.g:3018:1: rule__ImageFitDefinition__Group__4__Impl : ( ( rule__ImageFitDefinition__Group_4__0 ) ) ;
    public final void rule__ImageFitDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3022:1: ( ( ( rule__ImageFitDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:3023:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:3023:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            // InternalPdfMk.g:3024:2: ( rule__ImageFitDefinition__Group_4__0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:3025:2: ( rule__ImageFitDefinition__Group_4__0 )
            // InternalPdfMk.g:3025:3: rule__ImageFitDefinition__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getImageFitDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group__4__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group__5"
    // InternalPdfMk.g:3033:1: rule__ImageFitDefinition__Group__5 : rule__ImageFitDefinition__Group__5__Impl ;
    public final void rule__ImageFitDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3037:1: ( rule__ImageFitDefinition__Group__5__Impl )
            // InternalPdfMk.g:3038:2: rule__ImageFitDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__ImageFitDefinition__Group__5"


    // $ANTLR start "rule__ImageFitDefinition__Group__5__Impl"
    // InternalPdfMk.g:3044:1: rule__ImageFitDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ImageFitDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3048:1: ( ( ']' ) )
            // InternalPdfMk.g:3049:1: ( ']' )
            {
            // InternalPdfMk.g:3049:1: ( ']' )
            // InternalPdfMk.g:3050:2: ']'
            {
             before(grammarAccess.getImageFitDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group__5__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group_4__0"
    // InternalPdfMk.g:3060:1: rule__ImageFitDefinition__Group_4__0 : rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 ;
    public final void rule__ImageFitDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3064:1: ( rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 )
            // InternalPdfMk.g:3065:2: rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ImageFitDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group_4__1();

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
    // $ANTLR end "rule__ImageFitDefinition__Group_4__0"


    // $ANTLR start "rule__ImageFitDefinition__Group_4__0__Impl"
    // InternalPdfMk.g:3072:1: rule__ImageFitDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageFitDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3076:1: ( ( ',' ) )
            // InternalPdfMk.g:3077:1: ( ',' )
            {
            // InternalPdfMk.g:3077:1: ( ',' )
            // InternalPdfMk.g:3078:2: ','
            {
             before(grammarAccess.getImageFitDefinitionAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ImageFitDefinition__Group_4__1"
    // InternalPdfMk.g:3087:1: rule__ImageFitDefinition__Group_4__1 : rule__ImageFitDefinition__Group_4__1__Impl ;
    public final void rule__ImageFitDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3091:1: ( rule__ImageFitDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:3092:2: rule__ImageFitDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__ImageFitDefinition__Group_4__1"


    // $ANTLR start "rule__ImageFitDefinition__Group_4__1__Impl"
    // InternalPdfMk.g:3098:1: rule__ImageFitDefinition__Group_4__1__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__ImageFitDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3102:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:3103:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:3103:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:3104:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:3105:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:3105:3: rule__ImageFitDefinition__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageFitDefinition__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ImageOpacityDefinition__Group__0"
    // InternalPdfMk.g:3114:1: rule__ImageOpacityDefinition__Group__0 : rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 ;
    public final void rule__ImageOpacityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3118:1: ( rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 )
            // InternalPdfMk.g:3119:2: rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageOpacityDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageOpacityDefinition__Group__1();

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
    // $ANTLR end "rule__ImageOpacityDefinition__Group__0"


    // $ANTLR start "rule__ImageOpacityDefinition__Group__0__Impl"
    // InternalPdfMk.g:3126:1: rule__ImageOpacityDefinition__Group__0__Impl : ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3130:1: ( ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3131:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3131:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3132:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3133:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3133:3: rule__ImageOpacityDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageOpacityDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageOpacityDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageOpacityDefinition__Group__0__Impl"


    // $ANTLR start "rule__ImageOpacityDefinition__Group__1"
    // InternalPdfMk.g:3141:1: rule__ImageOpacityDefinition__Group__1 : rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 ;
    public final void rule__ImageOpacityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3145:1: ( rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 )
            // InternalPdfMk.g:3146:2: rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ImageOpacityDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageOpacityDefinition__Group__2();

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
    // $ANTLR end "rule__ImageOpacityDefinition__Group__1"


    // $ANTLR start "rule__ImageOpacityDefinition__Group__1__Impl"
    // InternalPdfMk.g:3153:1: rule__ImageOpacityDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageOpacityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3157:1: ( ( ':' ) )
            // InternalPdfMk.g:3158:1: ( ':' )
            {
            // InternalPdfMk.g:3158:1: ( ':' )
            // InternalPdfMk.g:3159:2: ':'
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImageOpacityDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageOpacityDefinition__Group__1__Impl"


    // $ANTLR start "rule__ImageOpacityDefinition__Group__2"
    // InternalPdfMk.g:3168:1: rule__ImageOpacityDefinition__Group__2 : rule__ImageOpacityDefinition__Group__2__Impl ;
    public final void rule__ImageOpacityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3172:1: ( rule__ImageOpacityDefinition__Group__2__Impl )
            // InternalPdfMk.g:3173:2: rule__ImageOpacityDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageOpacityDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ImageOpacityDefinition__Group__2"


    // $ANTLR start "rule__ImageOpacityDefinition__Group__2__Impl"
    // InternalPdfMk.g:3179:1: rule__ImageOpacityDefinition__Group__2__Impl : ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3183:1: ( ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3184:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3184:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3185:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3186:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3186:3: rule__ImageOpacityDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageOpacityDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageOpacityDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageOpacityDefinition__Group__2__Impl"


    // $ANTLR start "rule__ListReversedDefinition__Group__0"
    // InternalPdfMk.g:3195:1: rule__ListReversedDefinition__Group__0 : rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 ;
    public final void rule__ListReversedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3199:1: ( rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 )
            // InternalPdfMk.g:3200:2: rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ListReversedDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListReversedDefinition__Group__1();

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
    // $ANTLR end "rule__ListReversedDefinition__Group__0"


    // $ANTLR start "rule__ListReversedDefinition__Group__0__Impl"
    // InternalPdfMk.g:3207:1: rule__ListReversedDefinition__Group__0__Impl : ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListReversedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3211:1: ( ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3212:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3212:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3213:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3214:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3214:3: rule__ListReversedDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListReversedDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListReversedDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListReversedDefinition__Group__0__Impl"


    // $ANTLR start "rule__ListReversedDefinition__Group__1"
    // InternalPdfMk.g:3222:1: rule__ListReversedDefinition__Group__1 : rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 ;
    public final void rule__ListReversedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3226:1: ( rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 )
            // InternalPdfMk.g:3227:2: rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ListReversedDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListReversedDefinition__Group__2();

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
    // $ANTLR end "rule__ListReversedDefinition__Group__1"


    // $ANTLR start "rule__ListReversedDefinition__Group__1__Impl"
    // InternalPdfMk.g:3234:1: rule__ListReversedDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListReversedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3238:1: ( ( ':' ) )
            // InternalPdfMk.g:3239:1: ( ':' )
            {
            // InternalPdfMk.g:3239:1: ( ':' )
            // InternalPdfMk.g:3240:2: ':'
            {
             before(grammarAccess.getListReversedDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListReversedDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListReversedDefinition__Group__1__Impl"


    // $ANTLR start "rule__ListReversedDefinition__Group__2"
    // InternalPdfMk.g:3249:1: rule__ListReversedDefinition__Group__2 : rule__ListReversedDefinition__Group__2__Impl ;
    public final void rule__ListReversedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3253:1: ( rule__ListReversedDefinition__Group__2__Impl )
            // InternalPdfMk.g:3254:2: rule__ListReversedDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListReversedDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ListReversedDefinition__Group__2"


    // $ANTLR start "rule__ListReversedDefinition__Group__2__Impl"
    // InternalPdfMk.g:3260:1: rule__ListReversedDefinition__Group__2__Impl : ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListReversedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3264:1: ( ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3265:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3265:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3266:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3267:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3267:3: rule__ListReversedDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListReversedDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListReversedDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListReversedDefinition__Group__2__Impl"


    // $ANTLR start "rule__ListCounterDefinition__Group__0"
    // InternalPdfMk.g:3276:1: rule__ListCounterDefinition__Group__0 : rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 ;
    public final void rule__ListCounterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3280:1: ( rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 )
            // InternalPdfMk.g:3281:2: rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ListCounterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListCounterDefinition__Group__1();

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
    // $ANTLR end "rule__ListCounterDefinition__Group__0"


    // $ANTLR start "rule__ListCounterDefinition__Group__0__Impl"
    // InternalPdfMk.g:3288:1: rule__ListCounterDefinition__Group__0__Impl : ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListCounterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3292:1: ( ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3293:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3293:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3294:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3295:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3295:3: rule__ListCounterDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListCounterDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListCounterDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListCounterDefinition__Group__0__Impl"


    // $ANTLR start "rule__ListCounterDefinition__Group__1"
    // InternalPdfMk.g:3303:1: rule__ListCounterDefinition__Group__1 : rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 ;
    public final void rule__ListCounterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3307:1: ( rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 )
            // InternalPdfMk.g:3308:2: rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ListCounterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListCounterDefinition__Group__2();

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
    // $ANTLR end "rule__ListCounterDefinition__Group__1"


    // $ANTLR start "rule__ListCounterDefinition__Group__1__Impl"
    // InternalPdfMk.g:3315:1: rule__ListCounterDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListCounterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3319:1: ( ( ':' ) )
            // InternalPdfMk.g:3320:1: ( ':' )
            {
            // InternalPdfMk.g:3320:1: ( ':' )
            // InternalPdfMk.g:3321:2: ':'
            {
             before(grammarAccess.getListCounterDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListCounterDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListCounterDefinition__Group__1__Impl"


    // $ANTLR start "rule__ListCounterDefinition__Group__2"
    // InternalPdfMk.g:3330:1: rule__ListCounterDefinition__Group__2 : rule__ListCounterDefinition__Group__2__Impl ;
    public final void rule__ListCounterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3334:1: ( rule__ListCounterDefinition__Group__2__Impl )
            // InternalPdfMk.g:3335:2: rule__ListCounterDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListCounterDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ListCounterDefinition__Group__2"


    // $ANTLR start "rule__ListCounterDefinition__Group__2__Impl"
    // InternalPdfMk.g:3341:1: rule__ListCounterDefinition__Group__2__Impl : ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListCounterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3345:1: ( ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3346:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3346:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3347:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3348:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3348:3: rule__ListCounterDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListCounterDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListCounterDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListCounterDefinition__Group__2__Impl"


    // $ANTLR start "rule__ListTypeDefinition__Group__0"
    // InternalPdfMk.g:3357:1: rule__ListTypeDefinition__Group__0 : rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 ;
    public final void rule__ListTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3361:1: ( rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 )
            // InternalPdfMk.g:3362:2: rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ListTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListTypeDefinition__Group__1();

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
    // $ANTLR end "rule__ListTypeDefinition__Group__0"


    // $ANTLR start "rule__ListTypeDefinition__Group__0__Impl"
    // InternalPdfMk.g:3369:1: rule__ListTypeDefinition__Group__0__Impl : ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3373:1: ( ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3374:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3374:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3375:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3376:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3376:3: rule__ListTypeDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListTypeDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__ListTypeDefinition__Group__1"
    // InternalPdfMk.g:3384:1: rule__ListTypeDefinition__Group__1 : rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 ;
    public final void rule__ListTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3388:1: ( rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 )
            // InternalPdfMk.g:3389:2: rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ListTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListTypeDefinition__Group__2();

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
    // $ANTLR end "rule__ListTypeDefinition__Group__1"


    // $ANTLR start "rule__ListTypeDefinition__Group__1__Impl"
    // InternalPdfMk.g:3396:1: rule__ListTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3400:1: ( ( ':' ) )
            // InternalPdfMk.g:3401:1: ( ':' )
            {
            // InternalPdfMk.g:3401:1: ( ':' )
            // InternalPdfMk.g:3402:2: ':'
            {
             before(grammarAccess.getListTypeDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListTypeDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__ListTypeDefinition__Group__2"
    // InternalPdfMk.g:3411:1: rule__ListTypeDefinition__Group__2 : rule__ListTypeDefinition__Group__2__Impl ;
    public final void rule__ListTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3415:1: ( rule__ListTypeDefinition__Group__2__Impl )
            // InternalPdfMk.g:3416:2: rule__ListTypeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListTypeDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ListTypeDefinition__Group__2"


    // $ANTLR start "rule__ListTypeDefinition__Group__2__Impl"
    // InternalPdfMk.g:3422:1: rule__ListTypeDefinition__Group__2__Impl : ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3426:1: ( ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3427:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3427:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3428:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3429:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3429:3: rule__ListTypeDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListTypeDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListTypeDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__ListColorDefinition__Group__0"
    // InternalPdfMk.g:3438:1: rule__ListColorDefinition__Group__0 : rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 ;
    public final void rule__ListColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3442:1: ( rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 )
            // InternalPdfMk.g:3443:2: rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ListColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListColorDefinition__Group__1();

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
    // $ANTLR end "rule__ListColorDefinition__Group__0"


    // $ANTLR start "rule__ListColorDefinition__Group__0__Impl"
    // InternalPdfMk.g:3450:1: rule__ListColorDefinition__Group__0__Impl : ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3454:1: ( ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3455:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3455:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3456:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3457:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3457:3: rule__ListColorDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListColorDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListColorDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListColorDefinition__Group__0__Impl"


    // $ANTLR start "rule__ListColorDefinition__Group__1"
    // InternalPdfMk.g:3465:1: rule__ListColorDefinition__Group__1 : rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 ;
    public final void rule__ListColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3469:1: ( rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 )
            // InternalPdfMk.g:3470:2: rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ListColorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListColorDefinition__Group__2();

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
    // $ANTLR end "rule__ListColorDefinition__Group__1"


    // $ANTLR start "rule__ListColorDefinition__Group__1__Impl"
    // InternalPdfMk.g:3477:1: rule__ListColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3481:1: ( ( ':' ) )
            // InternalPdfMk.g:3482:1: ( ':' )
            {
            // InternalPdfMk.g:3482:1: ( ':' )
            // InternalPdfMk.g:3483:2: ':'
            {
             before(grammarAccess.getListColorDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListColorDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListColorDefinition__Group__1__Impl"


    // $ANTLR start "rule__ListColorDefinition__Group__2"
    // InternalPdfMk.g:3492:1: rule__ListColorDefinition__Group__2 : rule__ListColorDefinition__Group__2__Impl ;
    public final void rule__ListColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3496:1: ( rule__ListColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3497:2: rule__ListColorDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListColorDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ListColorDefinition__Group__2"


    // $ANTLR start "rule__ListColorDefinition__Group__2__Impl"
    // InternalPdfMk.g:3503:1: rule__ListColorDefinition__Group__2__Impl : ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3507:1: ( ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3508:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3508:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3509:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3510:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3510:3: rule__ListColorDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListColorDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListColorDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListColorDefinition__Group__2__Impl"


    // $ANTLR start "rule__ListMarkerColorDefinition__Group__0"
    // InternalPdfMk.g:3519:1: rule__ListMarkerColorDefinition__Group__0 : rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 ;
    public final void rule__ListMarkerColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3523:1: ( rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 )
            // InternalPdfMk.g:3524:2: rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ListMarkerColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListMarkerColorDefinition__Group__1();

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
    // $ANTLR end "rule__ListMarkerColorDefinition__Group__0"


    // $ANTLR start "rule__ListMarkerColorDefinition__Group__0__Impl"
    // InternalPdfMk.g:3531:1: rule__ListMarkerColorDefinition__Group__0__Impl : ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3535:1: ( ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3536:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3536:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3537:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3538:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3538:3: rule__ListMarkerColorDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListMarkerColorDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListMarkerColorDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMarkerColorDefinition__Group__0__Impl"


    // $ANTLR start "rule__ListMarkerColorDefinition__Group__1"
    // InternalPdfMk.g:3546:1: rule__ListMarkerColorDefinition__Group__1 : rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 ;
    public final void rule__ListMarkerColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3550:1: ( rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 )
            // InternalPdfMk.g:3551:2: rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ListMarkerColorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListMarkerColorDefinition__Group__2();

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
    // $ANTLR end "rule__ListMarkerColorDefinition__Group__1"


    // $ANTLR start "rule__ListMarkerColorDefinition__Group__1__Impl"
    // InternalPdfMk.g:3558:1: rule__ListMarkerColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListMarkerColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3562:1: ( ( ':' ) )
            // InternalPdfMk.g:3563:1: ( ':' )
            {
            // InternalPdfMk.g:3563:1: ( ':' )
            // InternalPdfMk.g:3564:2: ':'
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListMarkerColorDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMarkerColorDefinition__Group__1__Impl"


    // $ANTLR start "rule__ListMarkerColorDefinition__Group__2"
    // InternalPdfMk.g:3573:1: rule__ListMarkerColorDefinition__Group__2 : rule__ListMarkerColorDefinition__Group__2__Impl ;
    public final void rule__ListMarkerColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3577:1: ( rule__ListMarkerColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3578:2: rule__ListMarkerColorDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListMarkerColorDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ListMarkerColorDefinition__Group__2"


    // $ANTLR start "rule__ListMarkerColorDefinition__Group__2__Impl"
    // InternalPdfMk.g:3584:1: rule__ListMarkerColorDefinition__Group__2__Impl : ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3588:1: ( ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3589:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3589:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3590:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3591:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3591:3: rule__ListMarkerColorDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListMarkerColorDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListMarkerColorDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMarkerColorDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextObject__Group__0"
    // InternalPdfMk.g:3600:1: rule__TextObject__Group__0 : rule__TextObject__Group__0__Impl rule__TextObject__Group__1 ;
    public final void rule__TextObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3604:1: ( rule__TextObject__Group__0__Impl rule__TextObject__Group__1 )
            // InternalPdfMk.g:3605:2: rule__TextObject__Group__0__Impl rule__TextObject__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TextObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__1();

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
    // $ANTLR end "rule__TextObject__Group__0"


    // $ANTLR start "rule__TextObject__Group__0__Impl"
    // InternalPdfMk.g:3612:1: rule__TextObject__Group__0__Impl : ( ( rule__TextObject__ValueAssignment_0 ) ) ;
    public final void rule__TextObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3616:1: ( ( ( rule__TextObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:3617:1: ( ( rule__TextObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:3617:1: ( ( rule__TextObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:3618:2: ( rule__TextObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTextObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:3619:2: ( rule__TextObject__ValueAssignment_0 )
            // InternalPdfMk.g:3619:3: rule__TextObject__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__0__Impl"


    // $ANTLR start "rule__TextObject__Group__1"
    // InternalPdfMk.g:3627:1: rule__TextObject__Group__1 : rule__TextObject__Group__1__Impl rule__TextObject__Group__2 ;
    public final void rule__TextObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3631:1: ( rule__TextObject__Group__1__Impl rule__TextObject__Group__2 )
            // InternalPdfMk.g:3632:2: rule__TextObject__Group__1__Impl rule__TextObject__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__2();

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
    // $ANTLR end "rule__TextObject__Group__1"


    // $ANTLR start "rule__TextObject__Group__1__Impl"
    // InternalPdfMk.g:3639:1: rule__TextObject__Group__1__Impl : ( ( rule__TextObject__TextAssignment_1 ) ) ;
    public final void rule__TextObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3643:1: ( ( ( rule__TextObject__TextAssignment_1 ) ) )
            // InternalPdfMk.g:3644:1: ( ( rule__TextObject__TextAssignment_1 ) )
            {
            // InternalPdfMk.g:3644:1: ( ( rule__TextObject__TextAssignment_1 ) )
            // InternalPdfMk.g:3645:2: ( rule__TextObject__TextAssignment_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTextAssignment_1()); 
            // InternalPdfMk.g:3646:2: ( rule__TextObject__TextAssignment_1 )
            // InternalPdfMk.g:3646:3: rule__TextObject__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__1__Impl"


    // $ANTLR start "rule__TextObject__Group__2"
    // InternalPdfMk.g:3654:1: rule__TextObject__Group__2 : rule__TextObject__Group__2__Impl rule__TextObject__Group__3 ;
    public final void rule__TextObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3658:1: ( rule__TextObject__Group__2__Impl rule__TextObject__Group__3 )
            // InternalPdfMk.g:3659:2: rule__TextObject__Group__2__Impl rule__TextObject__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__3();

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
    // $ANTLR end "rule__TextObject__Group__2"


    // $ANTLR start "rule__TextObject__Group__2__Impl"
    // InternalPdfMk.g:3666:1: rule__TextObject__Group__2__Impl : ( ( rule__TextObject__Group_2__0 )? ) ;
    public final void rule__TextObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3670:1: ( ( ( rule__TextObject__Group_2__0 )? ) )
            // InternalPdfMk.g:3671:1: ( ( rule__TextObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:3671:1: ( ( rule__TextObject__Group_2__0 )? )
            // InternalPdfMk.g:3672:2: ( rule__TextObject__Group_2__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:3673:2: ( rule__TextObject__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==27) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:3673:3: rule__TextObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__2__Impl"


    // $ANTLR start "rule__TextObject__Group__3"
    // InternalPdfMk.g:3681:1: rule__TextObject__Group__3 : rule__TextObject__Group__3__Impl rule__TextObject__Group__4 ;
    public final void rule__TextObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3685:1: ( rule__TextObject__Group__3__Impl rule__TextObject__Group__4 )
            // InternalPdfMk.g:3686:2: rule__TextObject__Group__3__Impl rule__TextObject__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__4();

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
    // $ANTLR end "rule__TextObject__Group__3"


    // $ANTLR start "rule__TextObject__Group__3__Impl"
    // InternalPdfMk.g:3693:1: rule__TextObject__Group__3__Impl : ( ( rule__TextObject__Group_3__0 )? ) ;
    public final void rule__TextObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3697:1: ( ( ( rule__TextObject__Group_3__0 )? ) )
            // InternalPdfMk.g:3698:1: ( ( rule__TextObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:3698:1: ( ( rule__TextObject__Group_3__0 )? )
            // InternalPdfMk.g:3699:2: ( rule__TextObject__Group_3__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:3700:2: ( rule__TextObject__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==29) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPdfMk.g:3700:3: rule__TextObject__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__3__Impl"


    // $ANTLR start "rule__TextObject__Group__4"
    // InternalPdfMk.g:3708:1: rule__TextObject__Group__4 : rule__TextObject__Group__4__Impl rule__TextObject__Group__5 ;
    public final void rule__TextObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3712:1: ( rule__TextObject__Group__4__Impl rule__TextObject__Group__5 )
            // InternalPdfMk.g:3713:2: rule__TextObject__Group__4__Impl rule__TextObject__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__5();

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
    // $ANTLR end "rule__TextObject__Group__4"


    // $ANTLR start "rule__TextObject__Group__4__Impl"
    // InternalPdfMk.g:3720:1: rule__TextObject__Group__4__Impl : ( ( rule__TextObject__Group_4__0 )? ) ;
    public final void rule__TextObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3724:1: ( ( ( rule__TextObject__Group_4__0 )? ) )
            // InternalPdfMk.g:3725:1: ( ( rule__TextObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:3725:1: ( ( rule__TextObject__Group_4__0 )? )
            // InternalPdfMk.g:3726:2: ( rule__TextObject__Group_4__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:3727:2: ( rule__TextObject__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==25) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalPdfMk.g:3727:3: rule__TextObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__4__Impl"


    // $ANTLR start "rule__TextObject__Group__5"
    // InternalPdfMk.g:3735:1: rule__TextObject__Group__5 : rule__TextObject__Group__5__Impl rule__TextObject__Group__6 ;
    public final void rule__TextObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3739:1: ( rule__TextObject__Group__5__Impl rule__TextObject__Group__6 )
            // InternalPdfMk.g:3740:2: rule__TextObject__Group__5__Impl rule__TextObject__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__6();

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
    // $ANTLR end "rule__TextObject__Group__5"


    // $ANTLR start "rule__TextObject__Group__5__Impl"
    // InternalPdfMk.g:3747:1: rule__TextObject__Group__5__Impl : ( ( rule__TextObject__Group_5__0 )? ) ;
    public final void rule__TextObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3751:1: ( ( ( rule__TextObject__Group_5__0 )? ) )
            // InternalPdfMk.g:3752:1: ( ( rule__TextObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:3752:1: ( ( rule__TextObject__Group_5__0 )? )
            // InternalPdfMk.g:3753:2: ( rule__TextObject__Group_5__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:3754:2: ( rule__TextObject__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==26) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:3754:3: rule__TextObject__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__5__Impl"


    // $ANTLR start "rule__TextObject__Group__6"
    // InternalPdfMk.g:3762:1: rule__TextObject__Group__6 : rule__TextObject__Group__6__Impl rule__TextObject__Group__7 ;
    public final void rule__TextObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3766:1: ( rule__TextObject__Group__6__Impl rule__TextObject__Group__7 )
            // InternalPdfMk.g:3767:2: rule__TextObject__Group__6__Impl rule__TextObject__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__7();

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
    // $ANTLR end "rule__TextObject__Group__6"


    // $ANTLR start "rule__TextObject__Group__6__Impl"
    // InternalPdfMk.g:3774:1: rule__TextObject__Group__6__Impl : ( ( rule__TextObject__Group_6__0 )? ) ;
    public final void rule__TextObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3778:1: ( ( ( rule__TextObject__Group_6__0 )? ) )
            // InternalPdfMk.g:3779:1: ( ( rule__TextObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:3779:1: ( ( rule__TextObject__Group_6__0 )? )
            // InternalPdfMk.g:3780:2: ( rule__TextObject__Group_6__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:3781:2: ( rule__TextObject__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==28) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalPdfMk.g:3781:3: rule__TextObject__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__6__Impl"


    // $ANTLR start "rule__TextObject__Group__7"
    // InternalPdfMk.g:3789:1: rule__TextObject__Group__7 : rule__TextObject__Group__7__Impl rule__TextObject__Group__8 ;
    public final void rule__TextObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3793:1: ( rule__TextObject__Group__7__Impl rule__TextObject__Group__8 )
            // InternalPdfMk.g:3794:2: rule__TextObject__Group__7__Impl rule__TextObject__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__8();

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
    // $ANTLR end "rule__TextObject__Group__7"


    // $ANTLR start "rule__TextObject__Group__7__Impl"
    // InternalPdfMk.g:3801:1: rule__TextObject__Group__7__Impl : ( ( rule__TextObject__Group_7__0 )? ) ;
    public final void rule__TextObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3805:1: ( ( ( rule__TextObject__Group_7__0 )? ) )
            // InternalPdfMk.g:3806:1: ( ( rule__TextObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:3806:1: ( ( rule__TextObject__Group_7__0 )? )
            // InternalPdfMk.g:3807:2: ( rule__TextObject__Group_7__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:3808:2: ( rule__TextObject__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==30) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPdfMk.g:3808:3: rule__TextObject__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__7__Impl"


    // $ANTLR start "rule__TextObject__Group__8"
    // InternalPdfMk.g:3816:1: rule__TextObject__Group__8 : rule__TextObject__Group__8__Impl rule__TextObject__Group__9 ;
    public final void rule__TextObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3820:1: ( rule__TextObject__Group__8__Impl rule__TextObject__Group__9 )
            // InternalPdfMk.g:3821:2: rule__TextObject__Group__8__Impl rule__TextObject__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__9();

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
    // $ANTLR end "rule__TextObject__Group__8"


    // $ANTLR start "rule__TextObject__Group__8__Impl"
    // InternalPdfMk.g:3828:1: rule__TextObject__Group__8__Impl : ( ( rule__TextObject__Group_8__0 )? ) ;
    public final void rule__TextObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3832:1: ( ( ( rule__TextObject__Group_8__0 )? ) )
            // InternalPdfMk.g:3833:1: ( ( rule__TextObject__Group_8__0 )? )
            {
            // InternalPdfMk.g:3833:1: ( ( rule__TextObject__Group_8__0 )? )
            // InternalPdfMk.g:3834:2: ( rule__TextObject__Group_8__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_8()); 
            // InternalPdfMk.g:3835:2: ( rule__TextObject__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==32) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:3835:3: rule__TextObject__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__8__Impl"


    // $ANTLR start "rule__TextObject__Group__9"
    // InternalPdfMk.g:3843:1: rule__TextObject__Group__9 : rule__TextObject__Group__9__Impl rule__TextObject__Group__10 ;
    public final void rule__TextObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3847:1: ( rule__TextObject__Group__9__Impl rule__TextObject__Group__10 )
            // InternalPdfMk.g:3848:2: rule__TextObject__Group__9__Impl rule__TextObject__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__TextObject__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group__10();

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
    // $ANTLR end "rule__TextObject__Group__9"


    // $ANTLR start "rule__TextObject__Group__9__Impl"
    // InternalPdfMk.g:3855:1: rule__TextObject__Group__9__Impl : ( ( rule__TextObject__Group_9__0 )? ) ;
    public final void rule__TextObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3859:1: ( ( ( rule__TextObject__Group_9__0 )? ) )
            // InternalPdfMk.g:3860:1: ( ( rule__TextObject__Group_9__0 )? )
            {
            // InternalPdfMk.g:3860:1: ( ( rule__TextObject__Group_9__0 )? )
            // InternalPdfMk.g:3861:2: ( rule__TextObject__Group_9__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_9()); 
            // InternalPdfMk.g:3862:2: ( rule__TextObject__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:3862:3: rule__TextObject__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextObject__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextObjectAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__9__Impl"


    // $ANTLR start "rule__TextObject__Group__10"
    // InternalPdfMk.g:3870:1: rule__TextObject__Group__10 : rule__TextObject__Group__10__Impl ;
    public final void rule__TextObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3874:1: ( rule__TextObject__Group__10__Impl )
            // InternalPdfMk.g:3875:2: rule__TextObject__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group__10__Impl();

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
    // $ANTLR end "rule__TextObject__Group__10"


    // $ANTLR start "rule__TextObject__Group__10__Impl"
    // InternalPdfMk.g:3881:1: rule__TextObject__Group__10__Impl : ( '}' ) ;
    public final void rule__TextObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3885:1: ( ( '}' ) )
            // InternalPdfMk.g:3886:1: ( '}' )
            {
            // InternalPdfMk.g:3886:1: ( '}' )
            // InternalPdfMk.g:3887:2: '}'
            {
             before(grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group__10__Impl"


    // $ANTLR start "rule__TextObject__Group_2__0"
    // InternalPdfMk.g:3897:1: rule__TextObject__Group_2__0 : rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 ;
    public final void rule__TextObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3901:1: ( rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 )
            // InternalPdfMk.g:3902:2: rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__TextObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_2__1();

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
    // $ANTLR end "rule__TextObject__Group_2__0"


    // $ANTLR start "rule__TextObject__Group_2__0__Impl"
    // InternalPdfMk.g:3909:1: rule__TextObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3913:1: ( ( ',' ) )
            // InternalPdfMk.g:3914:1: ( ',' )
            {
            // InternalPdfMk.g:3914:1: ( ',' )
            // InternalPdfMk.g:3915:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_2__0__Impl"


    // $ANTLR start "rule__TextObject__Group_2__1"
    // InternalPdfMk.g:3924:1: rule__TextObject__Group_2__1 : rule__TextObject__Group_2__1__Impl ;
    public final void rule__TextObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3928:1: ( rule__TextObject__Group_2__1__Impl )
            // InternalPdfMk.g:3929:2: rule__TextObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_2__1"


    // $ANTLR start "rule__TextObject__Group_2__1__Impl"
    // InternalPdfMk.g:3935:1: rule__TextObject__Group_2__1__Impl : ( ( rule__TextObject__StyleAssignment_2_1 ) ) ;
    public final void rule__TextObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3939:1: ( ( ( rule__TextObject__StyleAssignment_2_1 ) ) )
            // InternalPdfMk.g:3940:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            {
            // InternalPdfMk.g:3940:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            // InternalPdfMk.g:3941:2: ( rule__TextObject__StyleAssignment_2_1 )
            {
             before(grammarAccess.getTextObjectAccess().getStyleAssignment_2_1()); 
            // InternalPdfMk.g:3942:2: ( rule__TextObject__StyleAssignment_2_1 )
            // InternalPdfMk.g:3942:3: rule__TextObject__StyleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__StyleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getStyleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_2__1__Impl"


    // $ANTLR start "rule__TextObject__Group_3__0"
    // InternalPdfMk.g:3951:1: rule__TextObject__Group_3__0 : rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 ;
    public final void rule__TextObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3955:1: ( rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 )
            // InternalPdfMk.g:3956:2: rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__TextObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_3__1();

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
    // $ANTLR end "rule__TextObject__Group_3__0"


    // $ANTLR start "rule__TextObject__Group_3__0__Impl"
    // InternalPdfMk.g:3963:1: rule__TextObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3967:1: ( ( ',' ) )
            // InternalPdfMk.g:3968:1: ( ',' )
            {
            // InternalPdfMk.g:3968:1: ( ',' )
            // InternalPdfMk.g:3969:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_3__0__Impl"


    // $ANTLR start "rule__TextObject__Group_3__1"
    // InternalPdfMk.g:3978:1: rule__TextObject__Group_3__1 : rule__TextObject__Group_3__1__Impl ;
    public final void rule__TextObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3982:1: ( rule__TextObject__Group_3__1__Impl )
            // InternalPdfMk.g:3983:2: rule__TextObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_3__1"


    // $ANTLR start "rule__TextObject__Group_3__1__Impl"
    // InternalPdfMk.g:3989:1: rule__TextObject__Group_3__1__Impl : ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) ;
    public final void rule__TextObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3993:1: ( ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) )
            // InternalPdfMk.g:3994:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            {
            // InternalPdfMk.g:3994:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            // InternalPdfMk.g:3995:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            {
             before(grammarAccess.getTextObjectAccess().getFontSizeAssignment_3_1()); 
            // InternalPdfMk.g:3996:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            // InternalPdfMk.g:3996:3: rule__TextObject__FontSizeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__FontSizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getFontSizeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_3__1__Impl"


    // $ANTLR start "rule__TextObject__Group_4__0"
    // InternalPdfMk.g:4005:1: rule__TextObject__Group_4__0 : rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 ;
    public final void rule__TextObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4009:1: ( rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 )
            // InternalPdfMk.g:4010:2: rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__TextObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_4__1();

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
    // $ANTLR end "rule__TextObject__Group_4__0"


    // $ANTLR start "rule__TextObject__Group_4__0__Impl"
    // InternalPdfMk.g:4017:1: rule__TextObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4021:1: ( ( ',' ) )
            // InternalPdfMk.g:4022:1: ( ',' )
            {
            // InternalPdfMk.g:4022:1: ( ',' )
            // InternalPdfMk.g:4023:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_4__0__Impl"


    // $ANTLR start "rule__TextObject__Group_4__1"
    // InternalPdfMk.g:4032:1: rule__TextObject__Group_4__1 : rule__TextObject__Group_4__1__Impl ;
    public final void rule__TextObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4036:1: ( rule__TextObject__Group_4__1__Impl )
            // InternalPdfMk.g:4037:2: rule__TextObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_4__1"


    // $ANTLR start "rule__TextObject__Group_4__1__Impl"
    // InternalPdfMk.g:4043:1: rule__TextObject__Group_4__1__Impl : ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) ;
    public final void rule__TextObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4047:1: ( ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) )
            // InternalPdfMk.g:4048:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            {
            // InternalPdfMk.g:4048:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            // InternalPdfMk.g:4049:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            {
             before(grammarAccess.getTextObjectAccess().getAlignmentAssignment_4_1()); 
            // InternalPdfMk.g:4050:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            // InternalPdfMk.g:4050:3: rule__TextObject__AlignmentAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__AlignmentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getAlignmentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_4__1__Impl"


    // $ANTLR start "rule__TextObject__Group_5__0"
    // InternalPdfMk.g:4059:1: rule__TextObject__Group_5__0 : rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 ;
    public final void rule__TextObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4063:1: ( rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 )
            // InternalPdfMk.g:4064:2: rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__TextObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_5__1();

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
    // $ANTLR end "rule__TextObject__Group_5__0"


    // $ANTLR start "rule__TextObject__Group_5__0__Impl"
    // InternalPdfMk.g:4071:1: rule__TextObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4075:1: ( ( ',' ) )
            // InternalPdfMk.g:4076:1: ( ',' )
            {
            // InternalPdfMk.g:4076:1: ( ',' )
            // InternalPdfMk.g:4077:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_5__0__Impl"


    // $ANTLR start "rule__TextObject__Group_5__1"
    // InternalPdfMk.g:4086:1: rule__TextObject__Group_5__1 : rule__TextObject__Group_5__1__Impl ;
    public final void rule__TextObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4090:1: ( rule__TextObject__Group_5__1__Impl )
            // InternalPdfMk.g:4091:2: rule__TextObject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_5__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_5__1"


    // $ANTLR start "rule__TextObject__Group_5__1__Impl"
    // InternalPdfMk.g:4097:1: rule__TextObject__Group_5__1__Impl : ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) ;
    public final void rule__TextObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4101:1: ( ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) )
            // InternalPdfMk.g:4102:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            {
            // InternalPdfMk.g:4102:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            // InternalPdfMk.g:4103:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTypeFaceAssignment_5_1()); 
            // InternalPdfMk.g:4104:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            // InternalPdfMk.g:4104:3: rule__TextObject__TypeFaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__TypeFaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getTypeFaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_5__1__Impl"


    // $ANTLR start "rule__TextObject__Group_6__0"
    // InternalPdfMk.g:4113:1: rule__TextObject__Group_6__0 : rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 ;
    public final void rule__TextObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4117:1: ( rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 )
            // InternalPdfMk.g:4118:2: rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__TextObject__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_6__1();

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
    // $ANTLR end "rule__TextObject__Group_6__0"


    // $ANTLR start "rule__TextObject__Group_6__0__Impl"
    // InternalPdfMk.g:4125:1: rule__TextObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4129:1: ( ( ',' ) )
            // InternalPdfMk.g:4130:1: ( ',' )
            {
            // InternalPdfMk.g:4130:1: ( ',' )
            // InternalPdfMk.g:4131:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_6__0__Impl"


    // $ANTLR start "rule__TextObject__Group_6__1"
    // InternalPdfMk.g:4140:1: rule__TextObject__Group_6__1 : rule__TextObject__Group_6__1__Impl ;
    public final void rule__TextObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4144:1: ( rule__TextObject__Group_6__1__Impl )
            // InternalPdfMk.g:4145:2: rule__TextObject__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_6__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_6__1"


    // $ANTLR start "rule__TextObject__Group_6__1__Impl"
    // InternalPdfMk.g:4151:1: rule__TextObject__Group_6__1__Impl : ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__TextObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4155:1: ( ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:4156:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:4156:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:4157:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getTextObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:4158:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:4158:3: rule__TextObject__ItalicsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__ItalicsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getItalicsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_6__1__Impl"


    // $ANTLR start "rule__TextObject__Group_7__0"
    // InternalPdfMk.g:4167:1: rule__TextObject__Group_7__0 : rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1 ;
    public final void rule__TextObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4171:1: ( rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1 )
            // InternalPdfMk.g:4172:2: rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1
            {
            pushFollow(FOLLOW_27);
            rule__TextObject__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_7__1();

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
    // $ANTLR end "rule__TextObject__Group_7__0"


    // $ANTLR start "rule__TextObject__Group_7__0__Impl"
    // InternalPdfMk.g:4179:1: rule__TextObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4183:1: ( ( ',' ) )
            // InternalPdfMk.g:4184:1: ( ',' )
            {
            // InternalPdfMk.g:4184:1: ( ',' )
            // InternalPdfMk.g:4185:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_7__0__Impl"


    // $ANTLR start "rule__TextObject__Group_7__1"
    // InternalPdfMk.g:4194:1: rule__TextObject__Group_7__1 : rule__TextObject__Group_7__1__Impl ;
    public final void rule__TextObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4198:1: ( rule__TextObject__Group_7__1__Impl )
            // InternalPdfMk.g:4199:2: rule__TextObject__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_7__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_7__1"


    // $ANTLR start "rule__TextObject__Group_7__1__Impl"
    // InternalPdfMk.g:4205:1: rule__TextObject__Group_7__1__Impl : ( ( rule__TextObject__WidthAssignment_7_1 ) ) ;
    public final void rule__TextObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4209:1: ( ( ( rule__TextObject__WidthAssignment_7_1 ) ) )
            // InternalPdfMk.g:4210:1: ( ( rule__TextObject__WidthAssignment_7_1 ) )
            {
            // InternalPdfMk.g:4210:1: ( ( rule__TextObject__WidthAssignment_7_1 ) )
            // InternalPdfMk.g:4211:2: ( rule__TextObject__WidthAssignment_7_1 )
            {
             before(grammarAccess.getTextObjectAccess().getWidthAssignment_7_1()); 
            // InternalPdfMk.g:4212:2: ( rule__TextObject__WidthAssignment_7_1 )
            // InternalPdfMk.g:4212:3: rule__TextObject__WidthAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__WidthAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getWidthAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_7__1__Impl"


    // $ANTLR start "rule__TextObject__Group_8__0"
    // InternalPdfMk.g:4221:1: rule__TextObject__Group_8__0 : rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1 ;
    public final void rule__TextObject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4225:1: ( rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1 )
            // InternalPdfMk.g:4226:2: rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1
            {
            pushFollow(FOLLOW_28);
            rule__TextObject__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_8__1();

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
    // $ANTLR end "rule__TextObject__Group_8__0"


    // $ANTLR start "rule__TextObject__Group_8__0__Impl"
    // InternalPdfMk.g:4233:1: rule__TextObject__Group_8__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4237:1: ( ( ',' ) )
            // InternalPdfMk.g:4238:1: ( ',' )
            {
            // InternalPdfMk.g:4238:1: ( ',' )
            // InternalPdfMk.g:4239:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_8__0__Impl"


    // $ANTLR start "rule__TextObject__Group_8__1"
    // InternalPdfMk.g:4248:1: rule__TextObject__Group_8__1 : rule__TextObject__Group_8__1__Impl ;
    public final void rule__TextObject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4252:1: ( rule__TextObject__Group_8__1__Impl )
            // InternalPdfMk.g:4253:2: rule__TextObject__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_8__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_8__1"


    // $ANTLR start "rule__TextObject__Group_8__1__Impl"
    // InternalPdfMk.g:4259:1: rule__TextObject__Group_8__1__Impl : ( ( rule__TextObject__MarginAssignment_8_1 ) ) ;
    public final void rule__TextObject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4263:1: ( ( ( rule__TextObject__MarginAssignment_8_1 ) ) )
            // InternalPdfMk.g:4264:1: ( ( rule__TextObject__MarginAssignment_8_1 ) )
            {
            // InternalPdfMk.g:4264:1: ( ( rule__TextObject__MarginAssignment_8_1 ) )
            // InternalPdfMk.g:4265:2: ( rule__TextObject__MarginAssignment_8_1 )
            {
             before(grammarAccess.getTextObjectAccess().getMarginAssignment_8_1()); 
            // InternalPdfMk.g:4266:2: ( rule__TextObject__MarginAssignment_8_1 )
            // InternalPdfMk.g:4266:3: rule__TextObject__MarginAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__MarginAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getMarginAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_8__1__Impl"


    // $ANTLR start "rule__TextObject__Group_9__0"
    // InternalPdfMk.g:4275:1: rule__TextObject__Group_9__0 : rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1 ;
    public final void rule__TextObject__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4279:1: ( rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1 )
            // InternalPdfMk.g:4280:2: rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1
            {
            pushFollow(FOLLOW_29);
            rule__TextObject__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_9__1();

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
    // $ANTLR end "rule__TextObject__Group_9__0"


    // $ANTLR start "rule__TextObject__Group_9__0__Impl"
    // InternalPdfMk.g:4287:1: rule__TextObject__Group_9__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4291:1: ( ( ',' ) )
            // InternalPdfMk.g:4292:1: ( ',' )
            {
            // InternalPdfMk.g:4292:1: ( ',' )
            // InternalPdfMk.g:4293:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_9__0__Impl"


    // $ANTLR start "rule__TextObject__Group_9__1"
    // InternalPdfMk.g:4302:1: rule__TextObject__Group_9__1 : rule__TextObject__Group_9__1__Impl ;
    public final void rule__TextObject__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4306:1: ( rule__TextObject__Group_9__1__Impl )
            // InternalPdfMk.g:4307:2: rule__TextObject__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_9__1__Impl();

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
    // $ANTLR end "rule__TextObject__Group_9__1"


    // $ANTLR start "rule__TextObject__Group_9__1__Impl"
    // InternalPdfMk.g:4313:1: rule__TextObject__Group_9__1__Impl : ( ( rule__TextObject__ListCounterAssignment_9_1 ) ) ;
    public final void rule__TextObject__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4317:1: ( ( ( rule__TextObject__ListCounterAssignment_9_1 ) ) )
            // InternalPdfMk.g:4318:1: ( ( rule__TextObject__ListCounterAssignment_9_1 ) )
            {
            // InternalPdfMk.g:4318:1: ( ( rule__TextObject__ListCounterAssignment_9_1 ) )
            // InternalPdfMk.g:4319:2: ( rule__TextObject__ListCounterAssignment_9_1 )
            {
             before(grammarAccess.getTextObjectAccess().getListCounterAssignment_9_1()); 
            // InternalPdfMk.g:4320:2: ( rule__TextObject__ListCounterAssignment_9_1 )
            // InternalPdfMk.g:4320:3: rule__TextObject__ListCounterAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__ListCounterAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getListCounterAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_9__1__Impl"


    // $ANTLR start "rule__StyleObject__Group__0"
    // InternalPdfMk.g:4329:1: rule__StyleObject__Group__0 : rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 ;
    public final void rule__StyleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4333:1: ( rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 )
            // InternalPdfMk.g:4334:2: rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StyleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__1();

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
    // $ANTLR end "rule__StyleObject__Group__0"


    // $ANTLR start "rule__StyleObject__Group__0__Impl"
    // InternalPdfMk.g:4341:1: rule__StyleObject__Group__0__Impl : ( ( rule__StyleObject__KeyAssignment_0 ) ) ;
    public final void rule__StyleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4345:1: ( ( ( rule__StyleObject__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4346:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4346:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            // InternalPdfMk.g:4347:2: ( rule__StyleObject__KeyAssignment_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4348:2: ( rule__StyleObject__KeyAssignment_0 )
            // InternalPdfMk.g:4348:3: rule__StyleObject__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__0__Impl"


    // $ANTLR start "rule__StyleObject__Group__1"
    // InternalPdfMk.g:4356:1: rule__StyleObject__Group__1 : rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 ;
    public final void rule__StyleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4360:1: ( rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 )
            // InternalPdfMk.g:4361:2: rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StyleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__2();

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
    // $ANTLR end "rule__StyleObject__Group__1"


    // $ANTLR start "rule__StyleObject__Group__1__Impl"
    // InternalPdfMk.g:4368:1: rule__StyleObject__Group__1__Impl : ( ':' ) ;
    public final void rule__StyleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4372:1: ( ( ':' ) )
            // InternalPdfMk.g:4373:1: ( ':' )
            {
            // InternalPdfMk.g:4373:1: ( ':' )
            // InternalPdfMk.g:4374:2: ':'
            {
             before(grammarAccess.getStyleObjectAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__1__Impl"


    // $ANTLR start "rule__StyleObject__Group__2"
    // InternalPdfMk.g:4383:1: rule__StyleObject__Group__2 : rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 ;
    public final void rule__StyleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4387:1: ( rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 )
            // InternalPdfMk.g:4388:2: rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__StyleObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__3();

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
    // $ANTLR end "rule__StyleObject__Group__2"


    // $ANTLR start "rule__StyleObject__Group__2__Impl"
    // InternalPdfMk.g:4395:1: rule__StyleObject__Group__2__Impl : ( ( rule__StyleObject__ValueAssignment_2 ) ) ;
    public final void rule__StyleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4399:1: ( ( ( rule__StyleObject__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4400:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4400:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            // InternalPdfMk.g:4401:2: ( rule__StyleObject__ValueAssignment_2 )
            {
             before(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4402:2: ( rule__StyleObject__ValueAssignment_2 )
            // InternalPdfMk.g:4402:3: rule__StyleObject__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__2__Impl"


    // $ANTLR start "rule__StyleObject__Group__3"
    // InternalPdfMk.g:4410:1: rule__StyleObject__Group__3 : rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 ;
    public final void rule__StyleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4414:1: ( rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 )
            // InternalPdfMk.g:4415:2: rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__StyleObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__4();

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
    // $ANTLR end "rule__StyleObject__Group__3"


    // $ANTLR start "rule__StyleObject__Group__3__Impl"
    // InternalPdfMk.g:4422:1: rule__StyleObject__Group__3__Impl : ( ( rule__StyleObject__FontSizeAssignment_3 )? ) ;
    public final void rule__StyleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4426:1: ( ( ( rule__StyleObject__FontSizeAssignment_3 )? ) )
            // InternalPdfMk.g:4427:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            {
            // InternalPdfMk.g:4427:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            // InternalPdfMk.g:4428:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            {
             before(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3()); 
            // InternalPdfMk.g:4429:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPdfMk.g:4429:3: rule__StyleObject__FontSizeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleObject__FontSizeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__3__Impl"


    // $ANTLR start "rule__StyleObject__Group__4"
    // InternalPdfMk.g:4437:1: rule__StyleObject__Group__4 : rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 ;
    public final void rule__StyleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4441:1: ( rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 )
            // InternalPdfMk.g:4442:2: rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__StyleObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__5();

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
    // $ANTLR end "rule__StyleObject__Group__4"


    // $ANTLR start "rule__StyleObject__Group__4__Impl"
    // InternalPdfMk.g:4449:1: rule__StyleObject__Group__4__Impl : ( ( rule__StyleObject__Group_4__0 )? ) ;
    public final void rule__StyleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4453:1: ( ( ( rule__StyleObject__Group_4__0 )? ) )
            // InternalPdfMk.g:4454:1: ( ( rule__StyleObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:4454:1: ( ( rule__StyleObject__Group_4__0 )? )
            // InternalPdfMk.g:4455:2: ( rule__StyleObject__Group_4__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:4456:2: ( rule__StyleObject__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==26) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalPdfMk.g:4456:3: rule__StyleObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__4__Impl"


    // $ANTLR start "rule__StyleObject__Group__5"
    // InternalPdfMk.g:4464:1: rule__StyleObject__Group__5 : rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 ;
    public final void rule__StyleObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4468:1: ( rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 )
            // InternalPdfMk.g:4469:2: rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__StyleObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__6();

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
    // $ANTLR end "rule__StyleObject__Group__5"


    // $ANTLR start "rule__StyleObject__Group__5__Impl"
    // InternalPdfMk.g:4476:1: rule__StyleObject__Group__5__Impl : ( ( rule__StyleObject__Group_5__0 )? ) ;
    public final void rule__StyleObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4480:1: ( ( ( rule__StyleObject__Group_5__0 )? ) )
            // InternalPdfMk.g:4481:1: ( ( rule__StyleObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:4481:1: ( ( rule__StyleObject__Group_5__0 )? )
            // InternalPdfMk.g:4482:2: ( rule__StyleObject__Group_5__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:4483:2: ( rule__StyleObject__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==25) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalPdfMk.g:4483:3: rule__StyleObject__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleObject__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__5__Impl"


    // $ANTLR start "rule__StyleObject__Group__6"
    // InternalPdfMk.g:4491:1: rule__StyleObject__Group__6 : rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 ;
    public final void rule__StyleObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4495:1: ( rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 )
            // InternalPdfMk.g:4496:2: rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__StyleObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__7();

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
    // $ANTLR end "rule__StyleObject__Group__6"


    // $ANTLR start "rule__StyleObject__Group__6__Impl"
    // InternalPdfMk.g:4503:1: rule__StyleObject__Group__6__Impl : ( ( rule__StyleObject__Group_6__0 )? ) ;
    public final void rule__StyleObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4507:1: ( ( ( rule__StyleObject__Group_6__0 )? ) )
            // InternalPdfMk.g:4508:1: ( ( rule__StyleObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:4508:1: ( ( rule__StyleObject__Group_6__0 )? )
            // InternalPdfMk.g:4509:2: ( rule__StyleObject__Group_6__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:4510:2: ( rule__StyleObject__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==28) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalPdfMk.g:4510:3: rule__StyleObject__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleObject__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleObjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__6__Impl"


    // $ANTLR start "rule__StyleObject__Group__7"
    // InternalPdfMk.g:4518:1: rule__StyleObject__Group__7 : rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 ;
    public final void rule__StyleObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4522:1: ( rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 )
            // InternalPdfMk.g:4523:2: rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__StyleObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__8();

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
    // $ANTLR end "rule__StyleObject__Group__7"


    // $ANTLR start "rule__StyleObject__Group__7__Impl"
    // InternalPdfMk.g:4530:1: rule__StyleObject__Group__7__Impl : ( ( rule__StyleObject__Group_7__0 )? ) ;
    public final void rule__StyleObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4534:1: ( ( ( rule__StyleObject__Group_7__0 )? ) )
            // InternalPdfMk.g:4535:1: ( ( rule__StyleObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:4535:1: ( ( rule__StyleObject__Group_7__0 )? )
            // InternalPdfMk.g:4536:2: ( rule__StyleObject__Group_7__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:4537:2: ( rule__StyleObject__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:4537:3: rule__StyleObject__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleObject__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleObjectAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__7__Impl"


    // $ANTLR start "rule__StyleObject__Group__8"
    // InternalPdfMk.g:4545:1: rule__StyleObject__Group__8 : rule__StyleObject__Group__8__Impl ;
    public final void rule__StyleObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4549:1: ( rule__StyleObject__Group__8__Impl )
            // InternalPdfMk.g:4550:2: rule__StyleObject__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__8__Impl();

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
    // $ANTLR end "rule__StyleObject__Group__8"


    // $ANTLR start "rule__StyleObject__Group__8__Impl"
    // InternalPdfMk.g:4556:1: rule__StyleObject__Group__8__Impl : ( '}' ) ;
    public final void rule__StyleObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4560:1: ( ( '}' ) )
            // InternalPdfMk.g:4561:1: ( '}' )
            {
            // InternalPdfMk.g:4561:1: ( '}' )
            // InternalPdfMk.g:4562:2: '}'
            {
             before(grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group__8__Impl"


    // $ANTLR start "rule__StyleObject__Group_4__0"
    // InternalPdfMk.g:4572:1: rule__StyleObject__Group_4__0 : rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 ;
    public final void rule__StyleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4576:1: ( rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 )
            // InternalPdfMk.g:4577:2: rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__StyleObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_4__1();

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
    // $ANTLR end "rule__StyleObject__Group_4__0"


    // $ANTLR start "rule__StyleObject__Group_4__0__Impl"
    // InternalPdfMk.g:4584:1: rule__StyleObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4588:1: ( ( ',' ) )
            // InternalPdfMk.g:4589:1: ( ',' )
            {
            // InternalPdfMk.g:4589:1: ( ',' )
            // InternalPdfMk.g:4590:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_4__0__Impl"


    // $ANTLR start "rule__StyleObject__Group_4__1"
    // InternalPdfMk.g:4599:1: rule__StyleObject__Group_4__1 : rule__StyleObject__Group_4__1__Impl ;
    public final void rule__StyleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4603:1: ( rule__StyleObject__Group_4__1__Impl )
            // InternalPdfMk.g:4604:2: rule__StyleObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__StyleObject__Group_4__1"


    // $ANTLR start "rule__StyleObject__Group_4__1__Impl"
    // InternalPdfMk.g:4610:1: rule__StyleObject__Group_4__1__Impl : ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) ;
    public final void rule__StyleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4614:1: ( ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) )
            // InternalPdfMk.g:4615:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            {
            // InternalPdfMk.g:4615:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            // InternalPdfMk.g:4616:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1()); 
            // InternalPdfMk.g:4617:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            // InternalPdfMk.g:4617:3: rule__StyleObject__TypeFaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__TypeFaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_4__1__Impl"


    // $ANTLR start "rule__StyleObject__Group_5__0"
    // InternalPdfMk.g:4626:1: rule__StyleObject__Group_5__0 : rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 ;
    public final void rule__StyleObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4630:1: ( rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 )
            // InternalPdfMk.g:4631:2: rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__StyleObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_5__1();

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
    // $ANTLR end "rule__StyleObject__Group_5__0"


    // $ANTLR start "rule__StyleObject__Group_5__0__Impl"
    // InternalPdfMk.g:4638:1: rule__StyleObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4642:1: ( ( ',' ) )
            // InternalPdfMk.g:4643:1: ( ',' )
            {
            // InternalPdfMk.g:4643:1: ( ',' )
            // InternalPdfMk.g:4644:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_5__0__Impl"


    // $ANTLR start "rule__StyleObject__Group_5__1"
    // InternalPdfMk.g:4653:1: rule__StyleObject__Group_5__1 : rule__StyleObject__Group_5__1__Impl ;
    public final void rule__StyleObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4657:1: ( rule__StyleObject__Group_5__1__Impl )
            // InternalPdfMk.g:4658:2: rule__StyleObject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_5__1__Impl();

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
    // $ANTLR end "rule__StyleObject__Group_5__1"


    // $ANTLR start "rule__StyleObject__Group_5__1__Impl"
    // InternalPdfMk.g:4664:1: rule__StyleObject__Group_5__1__Impl : ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) ;
    public final void rule__StyleObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4668:1: ( ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) )
            // InternalPdfMk.g:4669:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            {
            // InternalPdfMk.g:4669:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            // InternalPdfMk.g:4670:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1()); 
            // InternalPdfMk.g:4671:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            // InternalPdfMk.g:4671:3: rule__StyleObject__AlignmentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__AlignmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_5__1__Impl"


    // $ANTLR start "rule__StyleObject__Group_6__0"
    // InternalPdfMk.g:4680:1: rule__StyleObject__Group_6__0 : rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 ;
    public final void rule__StyleObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4684:1: ( rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 )
            // InternalPdfMk.g:4685:2: rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__StyleObject__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_6__1();

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
    // $ANTLR end "rule__StyleObject__Group_6__0"


    // $ANTLR start "rule__StyleObject__Group_6__0__Impl"
    // InternalPdfMk.g:4692:1: rule__StyleObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4696:1: ( ( ',' ) )
            // InternalPdfMk.g:4697:1: ( ',' )
            {
            // InternalPdfMk.g:4697:1: ( ',' )
            // InternalPdfMk.g:4698:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_6__0__Impl"


    // $ANTLR start "rule__StyleObject__Group_6__1"
    // InternalPdfMk.g:4707:1: rule__StyleObject__Group_6__1 : rule__StyleObject__Group_6__1__Impl ;
    public final void rule__StyleObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4711:1: ( rule__StyleObject__Group_6__1__Impl )
            // InternalPdfMk.g:4712:2: rule__StyleObject__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_6__1__Impl();

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
    // $ANTLR end "rule__StyleObject__Group_6__1"


    // $ANTLR start "rule__StyleObject__Group_6__1__Impl"
    // InternalPdfMk.g:4718:1: rule__StyleObject__Group_6__1__Impl : ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__StyleObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4722:1: ( ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:4723:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:4723:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:4724:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:4725:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:4725:3: rule__StyleObject__ItalicsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__ItalicsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_6__1__Impl"


    // $ANTLR start "rule__StyleObject__Group_7__0"
    // InternalPdfMk.g:4734:1: rule__StyleObject__Group_7__0 : rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 ;
    public final void rule__StyleObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4738:1: ( rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 )
            // InternalPdfMk.g:4739:2: rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__StyleObject__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_7__1();

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
    // $ANTLR end "rule__StyleObject__Group_7__0"


    // $ANTLR start "rule__StyleObject__Group_7__0__Impl"
    // InternalPdfMk.g:4746:1: rule__StyleObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4750:1: ( ( ',' ) )
            // InternalPdfMk.g:4751:1: ( ',' )
            {
            // InternalPdfMk.g:4751:1: ( ',' )
            // InternalPdfMk.g:4752:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_7__0__Impl"


    // $ANTLR start "rule__StyleObject__Group_7__1"
    // InternalPdfMk.g:4761:1: rule__StyleObject__Group_7__1 : rule__StyleObject__Group_7__1__Impl ;
    public final void rule__StyleObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4765:1: ( rule__StyleObject__Group_7__1__Impl )
            // InternalPdfMk.g:4766:2: rule__StyleObject__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_7__1__Impl();

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
    // $ANTLR end "rule__StyleObject__Group_7__1"


    // $ANTLR start "rule__StyleObject__Group_7__1__Impl"
    // InternalPdfMk.g:4772:1: rule__StyleObject__Group_7__1__Impl : ( ( rule__StyleObject__MarginAssignment_7_1 ) ) ;
    public final void rule__StyleObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4776:1: ( ( ( rule__StyleObject__MarginAssignment_7_1 ) ) )
            // InternalPdfMk.g:4777:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            {
            // InternalPdfMk.g:4777:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            // InternalPdfMk.g:4778:2: ( rule__StyleObject__MarginAssignment_7_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getMarginAssignment_7_1()); 
            // InternalPdfMk.g:4779:2: ( rule__StyleObject__MarginAssignment_7_1 )
            // InternalPdfMk.g:4779:3: rule__StyleObject__MarginAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__MarginAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getMarginAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_7__1__Impl"


    // $ANTLR start "rule__StyleObjects__Group__0"
    // InternalPdfMk.g:4788:1: rule__StyleObjects__Group__0 : rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 ;
    public final void rule__StyleObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4792:1: ( rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 )
            // InternalPdfMk.g:4793:2: rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__StyleObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group__1();

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
    // $ANTLR end "rule__StyleObjects__Group__0"


    // $ANTLR start "rule__StyleObjects__Group__0__Impl"
    // InternalPdfMk.g:4800:1: rule__StyleObjects__Group__0__Impl : ( '{' ) ;
    public final void rule__StyleObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4804:1: ( ( '{' ) )
            // InternalPdfMk.g:4805:1: ( '{' )
            {
            // InternalPdfMk.g:4805:1: ( '{' )
            // InternalPdfMk.g:4806:2: '{'
            {
             before(grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group__0__Impl"


    // $ANTLR start "rule__StyleObjects__Group__1"
    // InternalPdfMk.g:4815:1: rule__StyleObjects__Group__1 : rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 ;
    public final void rule__StyleObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4819:1: ( rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 )
            // InternalPdfMk.g:4820:2: rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__StyleObjects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group__2();

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
    // $ANTLR end "rule__StyleObjects__Group__1"


    // $ANTLR start "rule__StyleObjects__Group__1__Impl"
    // InternalPdfMk.g:4827:1: rule__StyleObjects__Group__1__Impl : ( ( rule__StyleObjects__Group_1__0 ) ) ;
    public final void rule__StyleObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4831:1: ( ( ( rule__StyleObjects__Group_1__0 ) ) )
            // InternalPdfMk.g:4832:1: ( ( rule__StyleObjects__Group_1__0 ) )
            {
            // InternalPdfMk.g:4832:1: ( ( rule__StyleObjects__Group_1__0 ) )
            // InternalPdfMk.g:4833:2: ( rule__StyleObjects__Group_1__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:4834:2: ( rule__StyleObjects__Group_1__0 )
            // InternalPdfMk.g:4834:3: rule__StyleObjects__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group__1__Impl"


    // $ANTLR start "rule__StyleObjects__Group__2"
    // InternalPdfMk.g:4842:1: rule__StyleObjects__Group__2 : rule__StyleObjects__Group__2__Impl ;
    public final void rule__StyleObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4846:1: ( rule__StyleObjects__Group__2__Impl )
            // InternalPdfMk.g:4847:2: rule__StyleObjects__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group__2__Impl();

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
    // $ANTLR end "rule__StyleObjects__Group__2"


    // $ANTLR start "rule__StyleObjects__Group__2__Impl"
    // InternalPdfMk.g:4853:1: rule__StyleObjects__Group__2__Impl : ( '}' ) ;
    public final void rule__StyleObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4857:1: ( ( '}' ) )
            // InternalPdfMk.g:4858:1: ( '}' )
            {
            // InternalPdfMk.g:4858:1: ( '}' )
            // InternalPdfMk.g:4859:2: '}'
            {
             before(grammarAccess.getStyleObjectsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStyleObjectsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group__2__Impl"


    // $ANTLR start "rule__StyleObjects__Group_1__0"
    // InternalPdfMk.g:4869:1: rule__StyleObjects__Group_1__0 : rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 ;
    public final void rule__StyleObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4873:1: ( rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 )
            // InternalPdfMk.g:4874:2: rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__StyleObjects__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_1__1();

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
    // $ANTLR end "rule__StyleObjects__Group_1__0"


    // $ANTLR start "rule__StyleObjects__Group_1__0__Impl"
    // InternalPdfMk.g:4881:1: rule__StyleObjects__Group_1__0__Impl : ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__StyleObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4885:1: ( ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:4886:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:4886:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:4887:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:4888:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:4888:3: rule__StyleObjects__ValueAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__ValueAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_1__0__Impl"


    // $ANTLR start "rule__StyleObjects__Group_1__1"
    // InternalPdfMk.g:4896:1: rule__StyleObjects__Group_1__1 : rule__StyleObjects__Group_1__1__Impl ;
    public final void rule__StyleObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4900:1: ( rule__StyleObjects__Group_1__1__Impl )
            // InternalPdfMk.g:4901:2: rule__StyleObjects__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_1__1__Impl();

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
    // $ANTLR end "rule__StyleObjects__Group_1__1"


    // $ANTLR start "rule__StyleObjects__Group_1__1__Impl"
    // InternalPdfMk.g:4907:1: rule__StyleObjects__Group_1__1__Impl : ( ( rule__StyleObjects__Group_1_1__0 )* ) ;
    public final void rule__StyleObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4911:1: ( ( ( rule__StyleObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:4912:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:4912:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:4913:2: ( rule__StyleObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:4914:2: ( rule__StyleObjects__Group_1_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPdfMk.g:4914:3: rule__StyleObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__StyleObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getStyleObjectsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_1__1__Impl"


    // $ANTLR start "rule__StyleObjects__Group_1_1__0"
    // InternalPdfMk.g:4923:1: rule__StyleObjects__Group_1_1__0 : rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 ;
    public final void rule__StyleObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4927:1: ( rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 )
            // InternalPdfMk.g:4928:2: rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_31);
            rule__StyleObjects__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_1_1__1();

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
    // $ANTLR end "rule__StyleObjects__Group_1_1__0"


    // $ANTLR start "rule__StyleObjects__Group_1_1__0__Impl"
    // InternalPdfMk.g:4935:1: rule__StyleObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__StyleObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4939:1: ( ( ',' ) )
            // InternalPdfMk.g:4940:1: ( ',' )
            {
            // InternalPdfMk.g:4940:1: ( ',' )
            // InternalPdfMk.g:4941:2: ','
            {
             before(grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_1_1__0__Impl"


    // $ANTLR start "rule__StyleObjects__Group_1_1__1"
    // InternalPdfMk.g:4950:1: rule__StyleObjects__Group_1_1__1 : rule__StyleObjects__Group_1_1__1__Impl ;
    public final void rule__StyleObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4954:1: ( rule__StyleObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:4955:2: rule__StyleObjects__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__StyleObjects__Group_1_1__1"


    // $ANTLR start "rule__StyleObjects__Group_1_1__1__Impl"
    // InternalPdfMk.g:4961:1: rule__StyleObjects__Group_1_1__1__Impl : ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__StyleObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4965:1: ( ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:4966:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:4966:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:4967:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:4968:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:4968:3: rule__StyleObjects__ValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__ValueAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_1_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group__0"
    // InternalPdfMk.g:4977:1: rule__InnerColumnObject__Group__0 : rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 ;
    public final void rule__InnerColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4981:1: ( rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 )
            // InternalPdfMk.g:4982:2: rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__InnerColumnObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group__0"


    // $ANTLR start "rule__InnerColumnObject__Group__0__Impl"
    // InternalPdfMk.g:4989:1: rule__InnerColumnObject__Group__0__Impl : ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__InnerColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4993:1: ( ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:4994:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:4994:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:4995:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:4996:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:4996:3: rule__InnerColumnObject__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group__1"
    // InternalPdfMk.g:5004:1: rule__InnerColumnObject__Group__1 : rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 ;
    public final void rule__InnerColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5008:1: ( rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 )
            // InternalPdfMk.g:5009:2: rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__InnerColumnObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group__2();

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
    // $ANTLR end "rule__InnerColumnObject__Group__1"


    // $ANTLR start "rule__InnerColumnObject__Group__1__Impl"
    // InternalPdfMk.g:5016:1: rule__InnerColumnObject__Group__1__Impl : ( ( rule__InnerColumnObject__Group_1__0 ) ) ;
    public final void rule__InnerColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5020:1: ( ( ( rule__InnerColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5021:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5021:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5022:2: ( rule__InnerColumnObject__Group_1__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5023:2: ( rule__InnerColumnObject__Group_1__0 )
            // InternalPdfMk.g:5023:3: rule__InnerColumnObject__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group__2"
    // InternalPdfMk.g:5031:1: rule__InnerColumnObject__Group__2 : rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 ;
    public final void rule__InnerColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5035:1: ( rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 )
            // InternalPdfMk.g:5036:2: rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__InnerColumnObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group__3();

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
    // $ANTLR end "rule__InnerColumnObject__Group__2"


    // $ANTLR start "rule__InnerColumnObject__Group__2__Impl"
    // InternalPdfMk.g:5043:1: rule__InnerColumnObject__Group__2__Impl : ( ( rule__InnerColumnObject__Group_2__0 ) ) ;
    public final void rule__InnerColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5047:1: ( ( ( rule__InnerColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:5048:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:5048:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:5049:2: ( rule__InnerColumnObject__Group_2__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:5050:2: ( rule__InnerColumnObject__Group_2__0 )
            // InternalPdfMk.g:5050:3: rule__InnerColumnObject__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group__2__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group__3"
    // InternalPdfMk.g:5058:1: rule__InnerColumnObject__Group__3 : rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 ;
    public final void rule__InnerColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5062:1: ( rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 )
            // InternalPdfMk.g:5063:2: rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__InnerColumnObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group__4();

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
    // $ANTLR end "rule__InnerColumnObject__Group__3"


    // $ANTLR start "rule__InnerColumnObject__Group__3__Impl"
    // InternalPdfMk.g:5070:1: rule__InnerColumnObject__Group__3__Impl : ( ( rule__InnerColumnObject__Group_3__0 ) ) ;
    public final void rule__InnerColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5074:1: ( ( ( rule__InnerColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5075:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5075:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:5076:2: ( rule__InnerColumnObject__Group_3__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5077:2: ( rule__InnerColumnObject__Group_3__0 )
            // InternalPdfMk.g:5077:3: rule__InnerColumnObject__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group__3__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group__4"
    // InternalPdfMk.g:5085:1: rule__InnerColumnObject__Group__4 : rule__InnerColumnObject__Group__4__Impl ;
    public final void rule__InnerColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5089:1: ( rule__InnerColumnObject__Group__4__Impl )
            // InternalPdfMk.g:5090:2: rule__InnerColumnObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group__4__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group__4"


    // $ANTLR start "rule__InnerColumnObject__Group__4__Impl"
    // InternalPdfMk.g:5096:1: rule__InnerColumnObject__Group__4__Impl : ( ']' ) ;
    public final void rule__InnerColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5100:1: ( ( ']' ) )
            // InternalPdfMk.g:5101:1: ( ']' )
            {
            // InternalPdfMk.g:5101:1: ( ']' )
            // InternalPdfMk.g:5102:2: ']'
            {
             before(grammarAccess.getInnerColumnObjectAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group__4__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_1__0"
    // InternalPdfMk.g:5112:1: rule__InnerColumnObject__Group_1__0 : rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 ;
    public final void rule__InnerColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5116:1: ( rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 )
            // InternalPdfMk.g:5117:2: rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__InnerColumnObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_1__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group_1__0"


    // $ANTLR start "rule__InnerColumnObject__Group_1__0__Impl"
    // InternalPdfMk.g:5124:1: rule__InnerColumnObject__Group_1__0__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__InnerColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5128:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:5129:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:5129:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:5130:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:5131:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPdfMk.g:5131:3: rule__InnerColumnObject__TextAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObject__TextAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_1__1"
    // InternalPdfMk.g:5139:1: rule__InnerColumnObject__Group_1__1 : rule__InnerColumnObject__Group_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5143:1: ( rule__InnerColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5144:2: rule__InnerColumnObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_1__1__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group_1__1"


    // $ANTLR start "rule__InnerColumnObject__Group_1__1__Impl"
    // InternalPdfMk.g:5150:1: rule__InnerColumnObject__Group_1__1__Impl : ( ( rule__InnerColumnObject__Group_1_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5154:1: ( ( ( rule__InnerColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5155:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5155:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5156:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5157:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalPdfMk.g:5157:3: rule__InnerColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getInnerColumnObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_1_1__0"
    // InternalPdfMk.g:5166:1: rule__InnerColumnObject__Group_1_1__0 : rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 ;
    public final void rule__InnerColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5170:1: ( rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:5171:2: rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__InnerColumnObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_1_1__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group_1_1__0"


    // $ANTLR start "rule__InnerColumnObject__Group_1_1__0__Impl"
    // InternalPdfMk.g:5178:1: rule__InnerColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5182:1: ( ( ',' ) )
            // InternalPdfMk.g:5183:1: ( ',' )
            {
            // InternalPdfMk.g:5183:1: ( ',' )
            // InternalPdfMk.g:5184:2: ','
            {
             before(grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_1_1__1"
    // InternalPdfMk.g:5193:1: rule__InnerColumnObject__Group_1_1__1 : rule__InnerColumnObject__Group_1_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5197:1: ( rule__InnerColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5198:2: rule__InnerColumnObject__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group_1_1__1"


    // $ANTLR start "rule__InnerColumnObject__Group_1_1__1__Impl"
    // InternalPdfMk.g:5204:1: rule__InnerColumnObject__Group_1_1__1__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5208:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5209:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5209:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:5210:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:5211:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:5211:3: rule__InnerColumnObject__TextAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__TextAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_2__0"
    // InternalPdfMk.g:5220:1: rule__InnerColumnObject__Group_2__0 : rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 ;
    public final void rule__InnerColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5224:1: ( rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 )
            // InternalPdfMk.g:5225:2: rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__InnerColumnObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_2__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group_2__0"


    // $ANTLR start "rule__InnerColumnObject__Group_2__0__Impl"
    // InternalPdfMk.g:5232:1: rule__InnerColumnObject__Group_2__0__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__InnerColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5236:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:5237:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:5237:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:5238:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:5239:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==18) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>=22 && LA29_1<=23)) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalPdfMk.g:5239:3: rule__InnerColumnObject__TextObjectAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObject__TextObjectAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_2__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_2__1"
    // InternalPdfMk.g:5247:1: rule__InnerColumnObject__Group_2__1 : rule__InnerColumnObject__Group_2__1__Impl ;
    public final void rule__InnerColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5251:1: ( rule__InnerColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:5252:2: rule__InnerColumnObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group_2__1"


    // $ANTLR start "rule__InnerColumnObject__Group_2__1__Impl"
    // InternalPdfMk.g:5258:1: rule__InnerColumnObject__Group_2__1__Impl : ( ( rule__InnerColumnObject__Group_2_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5262:1: ( ( ( rule__InnerColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:5263:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:5263:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:5264:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:5265:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==18) ) {
                        int LA30_3 = input.LA(3);

                        if ( ((LA30_3>=22 && LA30_3<=23)) ) {
                            alt30=1;
                        }


                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalPdfMk.g:5265:3: rule__InnerColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getInnerColumnObjectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_2__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_2_1__0"
    // InternalPdfMk.g:5274:1: rule__InnerColumnObject__Group_2_1__0 : rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 ;
    public final void rule__InnerColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5278:1: ( rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:5279:2: rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__InnerColumnObject__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_2_1__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group_2_1__0"


    // $ANTLR start "rule__InnerColumnObject__Group_2_1__0__Impl"
    // InternalPdfMk.g:5286:1: rule__InnerColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5290:1: ( ( ',' ) )
            // InternalPdfMk.g:5291:1: ( ',' )
            {
            // InternalPdfMk.g:5291:1: ( ',' )
            // InternalPdfMk.g:5292:2: ','
            {
             before(grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_2_1__1"
    // InternalPdfMk.g:5301:1: rule__InnerColumnObject__Group_2_1__1 : rule__InnerColumnObject__Group_2_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5305:1: ( rule__InnerColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:5306:2: rule__InnerColumnObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group_2_1__1"


    // $ANTLR start "rule__InnerColumnObject__Group_2_1__1__Impl"
    // InternalPdfMk.g:5312:1: rule__InnerColumnObject__Group_2_1__1__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5316:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:5317:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:5317:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:5318:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:5319:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:5319:3: rule__InnerColumnObject__TextObjectAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__TextObjectAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_3__0"
    // InternalPdfMk.g:5328:1: rule__InnerColumnObject__Group_3__0 : rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 ;
    public final void rule__InnerColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5332:1: ( rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 )
            // InternalPdfMk.g:5333:2: rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__InnerColumnObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_3__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group_3__0"


    // $ANTLR start "rule__InnerColumnObject__Group_3__0__Impl"
    // InternalPdfMk.g:5340:1: rule__InnerColumnObject__Group_3__0__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__InnerColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5344:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:5345:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:5345:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:5346:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:5347:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPdfMk.g:5347:3: rule__InnerColumnObject__ColumnAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObject__ColumnAssignment_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_3__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_3__1"
    // InternalPdfMk.g:5355:1: rule__InnerColumnObject__Group_3__1 : rule__InnerColumnObject__Group_3__1__Impl ;
    public final void rule__InnerColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5359:1: ( rule__InnerColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:5360:2: rule__InnerColumnObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group_3__1"


    // $ANTLR start "rule__InnerColumnObject__Group_3__1__Impl"
    // InternalPdfMk.g:5366:1: rule__InnerColumnObject__Group_3__1__Impl : ( ( rule__InnerColumnObject__Group_3_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5370:1: ( ( ( rule__InnerColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:5371:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:5371:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:5372:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:5373:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPdfMk.g:5373:3: rule__InnerColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getInnerColumnObjectAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_3__1__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_3_1__0"
    // InternalPdfMk.g:5382:1: rule__InnerColumnObject__Group_3_1__0 : rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 ;
    public final void rule__InnerColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5386:1: ( rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:5387:2: rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__InnerColumnObject__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_3_1__1();

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
    // $ANTLR end "rule__InnerColumnObject__Group_3_1__0"


    // $ANTLR start "rule__InnerColumnObject__Group_3_1__0__Impl"
    // InternalPdfMk.g:5394:1: rule__InnerColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5398:1: ( ( ',' ) )
            // InternalPdfMk.g:5399:1: ( ',' )
            {
            // InternalPdfMk.g:5399:1: ( ',' )
            // InternalPdfMk.g:5400:2: ','
            {
             before(grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_3_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObject__Group_3_1__1"
    // InternalPdfMk.g:5409:1: rule__InnerColumnObject__Group_3_1__1 : rule__InnerColumnObject__Group_3_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5413:1: ( rule__InnerColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:5414:2: rule__InnerColumnObject__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__InnerColumnObject__Group_3_1__1"


    // $ANTLR start "rule__InnerColumnObject__Group_3_1__1__Impl"
    // InternalPdfMk.g:5420:1: rule__InnerColumnObject__Group_3_1__1__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5424:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:5425:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:5425:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:5426:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:5427:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:5427:3: rule__InnerColumnObject__ColumnAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObject__ColumnAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__Group_3_1__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group__0"
    // InternalPdfMk.g:5436:1: rule__ColumnObject__Group__0 : rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 ;
    public final void rule__ColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5440:1: ( rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 )
            // InternalPdfMk.g:5441:2: rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ColumnObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__1();

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
    // $ANTLR end "rule__ColumnObject__Group__0"


    // $ANTLR start "rule__ColumnObject__Group__0__Impl"
    // InternalPdfMk.g:5448:1: rule__ColumnObject__Group__0__Impl : ( ( rule__ColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__ColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5452:1: ( ( ( rule__ColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5453:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5453:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5454:2: ( rule__ColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5455:2: ( rule__ColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:5455:3: rule__ColumnObject__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group__1"
    // InternalPdfMk.g:5463:1: rule__ColumnObject__Group__1 : rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 ;
    public final void rule__ColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5467:1: ( rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 )
            // InternalPdfMk.g:5468:2: rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ColumnObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__2();

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
    // $ANTLR end "rule__ColumnObject__Group__1"


    // $ANTLR start "rule__ColumnObject__Group__1__Impl"
    // InternalPdfMk.g:5475:1: rule__ColumnObject__Group__1__Impl : ( ( rule__ColumnObject__Group_1__0 ) ) ;
    public final void rule__ColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5479:1: ( ( ( rule__ColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5480:1: ( ( rule__ColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5480:1: ( ( rule__ColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5481:2: ( rule__ColumnObject__Group_1__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5482:2: ( rule__ColumnObject__Group_1__0 )
            // InternalPdfMk.g:5482:3: rule__ColumnObject__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group__2"
    // InternalPdfMk.g:5490:1: rule__ColumnObject__Group__2 : rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 ;
    public final void rule__ColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5494:1: ( rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 )
            // InternalPdfMk.g:5495:2: rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ColumnObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__3();

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
    // $ANTLR end "rule__ColumnObject__Group__2"


    // $ANTLR start "rule__ColumnObject__Group__2__Impl"
    // InternalPdfMk.g:5502:1: rule__ColumnObject__Group__2__Impl : ( ( rule__ColumnObject__Group_2__0 ) ) ;
    public final void rule__ColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5506:1: ( ( ( rule__ColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:5507:1: ( ( rule__ColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:5507:1: ( ( rule__ColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:5508:2: ( rule__ColumnObject__Group_2__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:5509:2: ( rule__ColumnObject__Group_2__0 )
            // InternalPdfMk.g:5509:3: rule__ColumnObject__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group__2__Impl"


    // $ANTLR start "rule__ColumnObject__Group__3"
    // InternalPdfMk.g:5517:1: rule__ColumnObject__Group__3 : rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 ;
    public final void rule__ColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5521:1: ( rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 )
            // InternalPdfMk.g:5522:2: rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ColumnObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__4();

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
    // $ANTLR end "rule__ColumnObject__Group__3"


    // $ANTLR start "rule__ColumnObject__Group__3__Impl"
    // InternalPdfMk.g:5529:1: rule__ColumnObject__Group__3__Impl : ( ( rule__ColumnObject__Group_3__0 ) ) ;
    public final void rule__ColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5533:1: ( ( ( rule__ColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5534:1: ( ( rule__ColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5534:1: ( ( rule__ColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:5535:2: ( rule__ColumnObject__Group_3__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5536:2: ( rule__ColumnObject__Group_3__0 )
            // InternalPdfMk.g:5536:3: rule__ColumnObject__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group__3__Impl"


    // $ANTLR start "rule__ColumnObject__Group__4"
    // InternalPdfMk.g:5544:1: rule__ColumnObject__Group__4 : rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 ;
    public final void rule__ColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5548:1: ( rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 )
            // InternalPdfMk.g:5549:2: rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ColumnObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__5();

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
    // $ANTLR end "rule__ColumnObject__Group__4"


    // $ANTLR start "rule__ColumnObject__Group__4__Impl"
    // InternalPdfMk.g:5556:1: rule__ColumnObject__Group__4__Impl : ( ( rule__ColumnObject__Group_4__0 ) ) ;
    public final void rule__ColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5560:1: ( ( ( rule__ColumnObject__Group_4__0 ) ) )
            // InternalPdfMk.g:5561:1: ( ( rule__ColumnObject__Group_4__0 ) )
            {
            // InternalPdfMk.g:5561:1: ( ( rule__ColumnObject__Group_4__0 ) )
            // InternalPdfMk.g:5562:2: ( rule__ColumnObject__Group_4__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:5563:2: ( rule__ColumnObject__Group_4__0 )
            // InternalPdfMk.g:5563:3: rule__ColumnObject__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group__4__Impl"


    // $ANTLR start "rule__ColumnObject__Group__5"
    // InternalPdfMk.g:5571:1: rule__ColumnObject__Group__5 : rule__ColumnObject__Group__5__Impl ;
    public final void rule__ColumnObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5575:1: ( rule__ColumnObject__Group__5__Impl )
            // InternalPdfMk.g:5576:2: rule__ColumnObject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__5__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group__5"


    // $ANTLR start "rule__ColumnObject__Group__5__Impl"
    // InternalPdfMk.g:5582:1: rule__ColumnObject__Group__5__Impl : ( ']' ) ;
    public final void rule__ColumnObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5586:1: ( ( ']' ) )
            // InternalPdfMk.g:5587:1: ( ']' )
            {
            // InternalPdfMk.g:5587:1: ( ']' )
            // InternalPdfMk.g:5588:2: ']'
            {
             before(grammarAccess.getColumnObjectAccess().getRightSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group__5__Impl"


    // $ANTLR start "rule__ColumnObject__Group_1__0"
    // InternalPdfMk.g:5598:1: rule__ColumnObject__Group_1__0 : rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 ;
    public final void rule__ColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5602:1: ( rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 )
            // InternalPdfMk.g:5603:2: rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__ColumnObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_1__1();

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
    // $ANTLR end "rule__ColumnObject__Group_1__0"


    // $ANTLR start "rule__ColumnObject__Group_1__0__Impl"
    // InternalPdfMk.g:5610:1: rule__ColumnObject__Group_1__0__Impl : ( ( rule__ColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__ColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5614:1: ( ( ( rule__ColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:5615:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:5615:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:5616:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:5617:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPdfMk.g:5617:3: rule__ColumnObject__TextAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObject__TextAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnObjectAccess().getTextAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_1__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_1__1"
    // InternalPdfMk.g:5625:1: rule__ColumnObject__Group_1__1 : rule__ColumnObject__Group_1__1__Impl ;
    public final void rule__ColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5629:1: ( rule__ColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5630:2: rule__ColumnObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_1__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_1__1"


    // $ANTLR start "rule__ColumnObject__Group_1__1__Impl"
    // InternalPdfMk.g:5636:1: rule__ColumnObject__Group_1__1__Impl : ( ( rule__ColumnObject__Group_1_1__0 )* ) ;
    public final void rule__ColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5640:1: ( ( ( rule__ColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5641:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5641:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5642:2: ( rule__ColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5643:2: ( rule__ColumnObject__Group_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_STRING) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalPdfMk.g:5643:3: rule__ColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getColumnObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_1__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_1_1__0"
    // InternalPdfMk.g:5652:1: rule__ColumnObject__Group_1_1__0 : rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 ;
    public final void rule__ColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5656:1: ( rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:5657:2: rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ColumnObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_1_1__1();

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
    // $ANTLR end "rule__ColumnObject__Group_1_1__0"


    // $ANTLR start "rule__ColumnObject__Group_1_1__0__Impl"
    // InternalPdfMk.g:5664:1: rule__ColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5668:1: ( ( ',' ) )
            // InternalPdfMk.g:5669:1: ( ',' )
            {
            // InternalPdfMk.g:5669:1: ( ',' )
            // InternalPdfMk.g:5670:2: ','
            {
             before(grammarAccess.getColumnObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_1_1__1"
    // InternalPdfMk.g:5679:1: rule__ColumnObject__Group_1_1__1 : rule__ColumnObject__Group_1_1__1__Impl ;
    public final void rule__ColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5683:1: ( rule__ColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5684:2: rule__ColumnObject__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_1_1__1"


    // $ANTLR start "rule__ColumnObject__Group_1_1__1__Impl"
    // InternalPdfMk.g:5690:1: rule__ColumnObject__Group_1_1__1__Impl : ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__ColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5694:1: ( ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5695:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5695:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:5696:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:5697:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:5697:3: rule__ColumnObject__TextAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__TextAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getTextAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_2__0"
    // InternalPdfMk.g:5706:1: rule__ColumnObject__Group_2__0 : rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 ;
    public final void rule__ColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5710:1: ( rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 )
            // InternalPdfMk.g:5711:2: rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__ColumnObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_2__1();

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
    // $ANTLR end "rule__ColumnObject__Group_2__0"


    // $ANTLR start "rule__ColumnObject__Group_2__0__Impl"
    // InternalPdfMk.g:5718:1: rule__ColumnObject__Group_2__0__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__ColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5722:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:5723:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:5723:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:5724:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:5725:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                int LA35_1 = input.LA(2);

                if ( ((LA35_1>=22 && LA35_1<=23)) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalPdfMk.g:5725:3: rule__ColumnObject__TextObjectAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObject__TextObjectAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_2__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_2__1"
    // InternalPdfMk.g:5733:1: rule__ColumnObject__Group_2__1 : rule__ColumnObject__Group_2__1__Impl ;
    public final void rule__ColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5737:1: ( rule__ColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:5738:2: rule__ColumnObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_2__1"


    // $ANTLR start "rule__ColumnObject__Group_2__1__Impl"
    // InternalPdfMk.g:5744:1: rule__ColumnObject__Group_2__1__Impl : ( ( rule__ColumnObject__Group_2_1__0 )* ) ;
    public final void rule__ColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5748:1: ( ( ( rule__ColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:5749:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:5749:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:5750:2: ( rule__ColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:5751:2: ( rule__ColumnObject__Group_2_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==20) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==18) ) {
                        int LA36_3 = input.LA(3);

                        if ( ((LA36_3>=22 && LA36_3<=23)) ) {
                            alt36=1;
                        }


                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalPdfMk.g:5751:3: rule__ColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getColumnObjectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_2__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_2_1__0"
    // InternalPdfMk.g:5760:1: rule__ColumnObject__Group_2_1__0 : rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 ;
    public final void rule__ColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5764:1: ( rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:5765:2: rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ColumnObject__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_2_1__1();

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
    // $ANTLR end "rule__ColumnObject__Group_2_1__0"


    // $ANTLR start "rule__ColumnObject__Group_2_1__0__Impl"
    // InternalPdfMk.g:5772:1: rule__ColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5776:1: ( ( ',' ) )
            // InternalPdfMk.g:5777:1: ( ',' )
            {
            // InternalPdfMk.g:5777:1: ( ',' )
            // InternalPdfMk.g:5778:2: ','
            {
             before(grammarAccess.getColumnObjectAccess().getCommaKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_2_1__1"
    // InternalPdfMk.g:5787:1: rule__ColumnObject__Group_2_1__1 : rule__ColumnObject__Group_2_1__1__Impl ;
    public final void rule__ColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5791:1: ( rule__ColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:5792:2: rule__ColumnObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_2_1__1"


    // $ANTLR start "rule__ColumnObject__Group_2_1__1__Impl"
    // InternalPdfMk.g:5798:1: rule__ColumnObject__Group_2_1__1__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__ColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5802:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:5803:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:5803:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:5804:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:5805:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:5805:3: rule__ColumnObject__TextObjectAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__TextObjectAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_3__0"
    // InternalPdfMk.g:5814:1: rule__ColumnObject__Group_3__0 : rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 ;
    public final void rule__ColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5818:1: ( rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 )
            // InternalPdfMk.g:5819:2: rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__ColumnObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_3__1();

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
    // $ANTLR end "rule__ColumnObject__Group_3__0"


    // $ANTLR start "rule__ColumnObject__Group_3__0__Impl"
    // InternalPdfMk.g:5826:1: rule__ColumnObject__Group_3__0__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__ColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5830:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:5831:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:5831:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:5832:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:5833:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPdfMk.g:5833:3: rule__ColumnObject__ColumnAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObject__ColumnAssignment_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_3__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_3__1"
    // InternalPdfMk.g:5841:1: rule__ColumnObject__Group_3__1 : rule__ColumnObject__Group_3__1__Impl ;
    public final void rule__ColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5845:1: ( rule__ColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:5846:2: rule__ColumnObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_3__1"


    // $ANTLR start "rule__ColumnObject__Group_3__1__Impl"
    // InternalPdfMk.g:5852:1: rule__ColumnObject__Group_3__1__Impl : ( ( rule__ColumnObject__Group_3_1__0 )* ) ;
    public final void rule__ColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5856:1: ( ( ( rule__ColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:5857:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:5857:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:5858:2: ( rule__ColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:5859:2: ( rule__ColumnObject__Group_3_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==18) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalPdfMk.g:5859:3: rule__ColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getColumnObjectAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_3__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_3_1__0"
    // InternalPdfMk.g:5868:1: rule__ColumnObject__Group_3_1__0 : rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 ;
    public final void rule__ColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5872:1: ( rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:5873:2: rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ColumnObject__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_3_1__1();

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
    // $ANTLR end "rule__ColumnObject__Group_3_1__0"


    // $ANTLR start "rule__ColumnObject__Group_3_1__0__Impl"
    // InternalPdfMk.g:5880:1: rule__ColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5884:1: ( ( ',' ) )
            // InternalPdfMk.g:5885:1: ( ',' )
            {
            // InternalPdfMk.g:5885:1: ( ',' )
            // InternalPdfMk.g:5886:2: ','
            {
             before(grammarAccess.getColumnObjectAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_3_1__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_3_1__1"
    // InternalPdfMk.g:5895:1: rule__ColumnObject__Group_3_1__1 : rule__ColumnObject__Group_3_1__1__Impl ;
    public final void rule__ColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5899:1: ( rule__ColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:5900:2: rule__ColumnObject__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_3_1__1"


    // $ANTLR start "rule__ColumnObject__Group_3_1__1__Impl"
    // InternalPdfMk.g:5906:1: rule__ColumnObject__Group_3_1__1__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__ColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5910:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:5911:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:5911:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:5912:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:5913:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:5913:3: rule__ColumnObject__ColumnAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__ColumnAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_3_1__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_4__0"
    // InternalPdfMk.g:5922:1: rule__ColumnObject__Group_4__0 : rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 ;
    public final void rule__ColumnObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5926:1: ( rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 )
            // InternalPdfMk.g:5927:2: rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__ColumnObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_4__1();

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
    // $ANTLR end "rule__ColumnObject__Group_4__0"


    // $ANTLR start "rule__ColumnObject__Group_4__0__Impl"
    // InternalPdfMk.g:5934:1: rule__ColumnObject__Group_4__0__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) ;
    public final void rule__ColumnObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5938:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) )
            // InternalPdfMk.g:5939:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            {
            // InternalPdfMk.g:5939:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            // InternalPdfMk.g:5940:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_0()); 
            // InternalPdfMk.g:5941:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:5941:3: rule__ColumnObject__InnerColumnAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObject__InnerColumnAssignment_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_4__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_4__1"
    // InternalPdfMk.g:5949:1: rule__ColumnObject__Group_4__1 : rule__ColumnObject__Group_4__1__Impl ;
    public final void rule__ColumnObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5953:1: ( rule__ColumnObject__Group_4__1__Impl )
            // InternalPdfMk.g:5954:2: rule__ColumnObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_4__1"


    // $ANTLR start "rule__ColumnObject__Group_4__1__Impl"
    // InternalPdfMk.g:5960:1: rule__ColumnObject__Group_4__1__Impl : ( ( rule__ColumnObject__Group_4_1__0 )* ) ;
    public final void rule__ColumnObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5964:1: ( ( ( rule__ColumnObject__Group_4_1__0 )* ) )
            // InternalPdfMk.g:5965:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:5965:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            // InternalPdfMk.g:5966:2: ( rule__ColumnObject__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4_1()); 
            // InternalPdfMk.g:5967:2: ( rule__ColumnObject__Group_4_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPdfMk.g:5967:3: rule__ColumnObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getColumnObjectAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_4__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group_4_1__0"
    // InternalPdfMk.g:5976:1: rule__ColumnObject__Group_4_1__0 : rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 ;
    public final void rule__ColumnObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5980:1: ( rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 )
            // InternalPdfMk.g:5981:2: rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ColumnObject__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_4_1__1();

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
    // $ANTLR end "rule__ColumnObject__Group_4_1__0"


    // $ANTLR start "rule__ColumnObject__Group_4_1__0__Impl"
    // InternalPdfMk.g:5988:1: rule__ColumnObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5992:1: ( ( ',' ) )
            // InternalPdfMk.g:5993:1: ( ',' )
            {
            // InternalPdfMk.g:5993:1: ( ',' )
            // InternalPdfMk.g:5994:2: ','
            {
             before(grammarAccess.getColumnObjectAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_4_1__0__Impl"


    // $ANTLR start "rule__ColumnObject__Group_4_1__1"
    // InternalPdfMk.g:6003:1: rule__ColumnObject__Group_4_1__1 : rule__ColumnObject__Group_4_1__1__Impl ;
    public final void rule__ColumnObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6007:1: ( rule__ColumnObject__Group_4_1__1__Impl )
            // InternalPdfMk.g:6008:2: rule__ColumnObject__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__ColumnObject__Group_4_1__1"


    // $ANTLR start "rule__ColumnObject__Group_4_1__1__Impl"
    // InternalPdfMk.g:6014:1: rule__ColumnObject__Group_4_1__1__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) ;
    public final void rule__ColumnObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6018:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:6019:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:6019:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            // InternalPdfMk.g:6020:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_1_1()); 
            // InternalPdfMk.g:6021:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            // InternalPdfMk.g:6021:3: rule__ColumnObject__InnerColumnAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__InnerColumnAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__Group_4_1__1__Impl"


    // $ANTLR start "rule__ImageObject__Group__0"
    // InternalPdfMk.g:6030:1: rule__ImageObject__Group__0 : rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 ;
    public final void rule__ImageObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6034:1: ( rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 )
            // InternalPdfMk.g:6035:2: rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__1();

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
    // $ANTLR end "rule__ImageObject__Group__0"


    // $ANTLR start "rule__ImageObject__Group__0__Impl"
    // InternalPdfMk.g:6042:1: rule__ImageObject__Group__0__Impl : ( ( rule__ImageObject__ValueAssignment_0 ) ) ;
    public final void rule__ImageObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6046:1: ( ( ( rule__ImageObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6047:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6047:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6048:2: ( rule__ImageObject__ValueAssignment_0 )
            {
             before(grammarAccess.getImageObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6049:2: ( rule__ImageObject__ValueAssignment_0 )
            // InternalPdfMk.g:6049:3: rule__ImageObject__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__0__Impl"


    // $ANTLR start "rule__ImageObject__Group__1"
    // InternalPdfMk.g:6057:1: rule__ImageObject__Group__1 : rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 ;
    public final void rule__ImageObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6061:1: ( rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 )
            // InternalPdfMk.g:6062:2: rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__2();

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
    // $ANTLR end "rule__ImageObject__Group__1"


    // $ANTLR start "rule__ImageObject__Group__1__Impl"
    // InternalPdfMk.g:6069:1: rule__ImageObject__Group__1__Impl : ( ( rule__ImageObject__ImageAssignment_1 )? ) ;
    public final void rule__ImageObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6073:1: ( ( ( rule__ImageObject__ImageAssignment_1 )? ) )
            // InternalPdfMk.g:6074:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            {
            // InternalPdfMk.g:6074:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            // InternalPdfMk.g:6075:2: ( rule__ImageObject__ImageAssignment_1 )?
            {
             before(grammarAccess.getImageObjectAccess().getImageAssignment_1()); 
            // InternalPdfMk.g:6076:2: ( rule__ImageObject__ImageAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPdfMk.g:6076:3: rule__ImageObject__ImageAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageObject__ImageAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageObjectAccess().getImageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__1__Impl"


    // $ANTLR start "rule__ImageObject__Group__2"
    // InternalPdfMk.g:6084:1: rule__ImageObject__Group__2 : rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 ;
    public final void rule__ImageObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6088:1: ( rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 )
            // InternalPdfMk.g:6089:2: rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__3();

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
    // $ANTLR end "rule__ImageObject__Group__2"


    // $ANTLR start "rule__ImageObject__Group__2__Impl"
    // InternalPdfMk.g:6096:1: rule__ImageObject__Group__2__Impl : ( ( rule__ImageObject__Group_2__0 )? ) ;
    public final void rule__ImageObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6100:1: ( ( ( rule__ImageObject__Group_2__0 )? ) )
            // InternalPdfMk.g:6101:1: ( ( rule__ImageObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:6101:1: ( ( rule__ImageObject__Group_2__0 )? )
            // InternalPdfMk.g:6102:2: ( rule__ImageObject__Group_2__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:6103:2: ( rule__ImageObject__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==30) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalPdfMk.g:6103:3: rule__ImageObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__2__Impl"


    // $ANTLR start "rule__ImageObject__Group__3"
    // InternalPdfMk.g:6111:1: rule__ImageObject__Group__3 : rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 ;
    public final void rule__ImageObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6115:1: ( rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 )
            // InternalPdfMk.g:6116:2: rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__4();

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
    // $ANTLR end "rule__ImageObject__Group__3"


    // $ANTLR start "rule__ImageObject__Group__3__Impl"
    // InternalPdfMk.g:6123:1: rule__ImageObject__Group__3__Impl : ( ( rule__ImageObject__Group_3__0 )? ) ;
    public final void rule__ImageObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6127:1: ( ( ( rule__ImageObject__Group_3__0 )? ) )
            // InternalPdfMk.g:6128:1: ( ( rule__ImageObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:6128:1: ( ( rule__ImageObject__Group_3__0 )? )
            // InternalPdfMk.g:6129:2: ( rule__ImageObject__Group_3__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:6130:2: ( rule__ImageObject__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==34) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalPdfMk.g:6130:3: rule__ImageObject__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageObject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageObjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__3__Impl"


    // $ANTLR start "rule__ImageObject__Group__4"
    // InternalPdfMk.g:6138:1: rule__ImageObject__Group__4 : rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 ;
    public final void rule__ImageObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6142:1: ( rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 )
            // InternalPdfMk.g:6143:2: rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__5();

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
    // $ANTLR end "rule__ImageObject__Group__4"


    // $ANTLR start "rule__ImageObject__Group__4__Impl"
    // InternalPdfMk.g:6150:1: rule__ImageObject__Group__4__Impl : ( ( rule__ImageObject__Group_4__0 )? ) ;
    public final void rule__ImageObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6154:1: ( ( ( rule__ImageObject__Group_4__0 )? ) )
            // InternalPdfMk.g:6155:1: ( ( rule__ImageObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:6155:1: ( ( rule__ImageObject__Group_4__0 )? )
            // InternalPdfMk.g:6156:2: ( rule__ImageObject__Group_4__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:6157:2: ( rule__ImageObject__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==37) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalPdfMk.g:6157:3: rule__ImageObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__4__Impl"


    // $ANTLR start "rule__ImageObject__Group__5"
    // InternalPdfMk.g:6165:1: rule__ImageObject__Group__5 : rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 ;
    public final void rule__ImageObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6169:1: ( rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 )
            // InternalPdfMk.g:6170:2: rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__6();

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
    // $ANTLR end "rule__ImageObject__Group__5"


    // $ANTLR start "rule__ImageObject__Group__5__Impl"
    // InternalPdfMk.g:6177:1: rule__ImageObject__Group__5__Impl : ( ( rule__ImageObject__Group_5__0 )? ) ;
    public final void rule__ImageObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6181:1: ( ( ( rule__ImageObject__Group_5__0 )? ) )
            // InternalPdfMk.g:6182:1: ( ( rule__ImageObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:6182:1: ( ( rule__ImageObject__Group_5__0 )? )
            // InternalPdfMk.g:6183:2: ( rule__ImageObject__Group_5__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6184:2: ( rule__ImageObject__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==36) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalPdfMk.g:6184:3: rule__ImageObject__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageObject__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__5__Impl"


    // $ANTLR start "rule__ImageObject__Group__6"
    // InternalPdfMk.g:6192:1: rule__ImageObject__Group__6 : rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 ;
    public final void rule__ImageObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6196:1: ( rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 )
            // InternalPdfMk.g:6197:2: rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__ImageObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__7();

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
    // $ANTLR end "rule__ImageObject__Group__6"


    // $ANTLR start "rule__ImageObject__Group__6__Impl"
    // InternalPdfMk.g:6204:1: rule__ImageObject__Group__6__Impl : ( ( rule__ImageObject__Group_6__0 )? ) ;
    public final void rule__ImageObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6208:1: ( ( ( rule__ImageObject__Group_6__0 )? ) )
            // InternalPdfMk.g:6209:1: ( ( rule__ImageObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:6209:1: ( ( rule__ImageObject__Group_6__0 )? )
            // InternalPdfMk.g:6210:2: ( rule__ImageObject__Group_6__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:6211:2: ( rule__ImageObject__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPdfMk.g:6211:3: rule__ImageObject__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageObject__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageObjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__6__Impl"


    // $ANTLR start "rule__ImageObject__Group__7"
    // InternalPdfMk.g:6219:1: rule__ImageObject__Group__7 : rule__ImageObject__Group__7__Impl ;
    public final void rule__ImageObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6223:1: ( rule__ImageObject__Group__7__Impl )
            // InternalPdfMk.g:6224:2: rule__ImageObject__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__7__Impl();

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
    // $ANTLR end "rule__ImageObject__Group__7"


    // $ANTLR start "rule__ImageObject__Group__7__Impl"
    // InternalPdfMk.g:6230:1: rule__ImageObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ImageObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6234:1: ( ( '}' ) )
            // InternalPdfMk.g:6235:1: ( '}' )
            {
            // InternalPdfMk.g:6235:1: ( '}' )
            // InternalPdfMk.g:6236:2: '}'
            {
             before(grammarAccess.getImageObjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group__7__Impl"


    // $ANTLR start "rule__ImageObject__Group_2__0"
    // InternalPdfMk.g:6246:1: rule__ImageObject__Group_2__0 : rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 ;
    public final void rule__ImageObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6250:1: ( rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 )
            // InternalPdfMk.g:6251:2: rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__ImageObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_2__1();

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
    // $ANTLR end "rule__ImageObject__Group_2__0"


    // $ANTLR start "rule__ImageObject__Group_2__0__Impl"
    // InternalPdfMk.g:6258:1: rule__ImageObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6262:1: ( ( ',' ) )
            // InternalPdfMk.g:6263:1: ( ',' )
            {
            // InternalPdfMk.g:6263:1: ( ',' )
            // InternalPdfMk.g:6264:2: ','
            {
             before(grammarAccess.getImageObjectAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_2__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_2__1"
    // InternalPdfMk.g:6273:1: rule__ImageObject__Group_2__1 : rule__ImageObject__Group_2__1__Impl ;
    public final void rule__ImageObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6277:1: ( rule__ImageObject__Group_2__1__Impl )
            // InternalPdfMk.g:6278:2: rule__ImageObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__ImageObject__Group_2__1"


    // $ANTLR start "rule__ImageObject__Group_2__1__Impl"
    // InternalPdfMk.g:6284:1: rule__ImageObject__Group_2__1__Impl : ( ( rule__ImageObject__WidthAssignment_2_1 ) ) ;
    public final void rule__ImageObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6288:1: ( ( ( rule__ImageObject__WidthAssignment_2_1 ) ) )
            // InternalPdfMk.g:6289:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            {
            // InternalPdfMk.g:6289:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            // InternalPdfMk.g:6290:2: ( rule__ImageObject__WidthAssignment_2_1 )
            {
             before(grammarAccess.getImageObjectAccess().getWidthAssignment_2_1()); 
            // InternalPdfMk.g:6291:2: ( rule__ImageObject__WidthAssignment_2_1 )
            // InternalPdfMk.g:6291:3: rule__ImageObject__WidthAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__WidthAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getWidthAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_2__1__Impl"


    // $ANTLR start "rule__ImageObject__Group_3__0"
    // InternalPdfMk.g:6300:1: rule__ImageObject__Group_3__0 : rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 ;
    public final void rule__ImageObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6304:1: ( rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 )
            // InternalPdfMk.g:6305:2: rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__ImageObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_3__1();

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
    // $ANTLR end "rule__ImageObject__Group_3__0"


    // $ANTLR start "rule__ImageObject__Group_3__0__Impl"
    // InternalPdfMk.g:6312:1: rule__ImageObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6316:1: ( ( ',' ) )
            // InternalPdfMk.g:6317:1: ( ',' )
            {
            // InternalPdfMk.g:6317:1: ( ',' )
            // InternalPdfMk.g:6318:2: ','
            {
             before(grammarAccess.getImageObjectAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_3__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_3__1"
    // InternalPdfMk.g:6327:1: rule__ImageObject__Group_3__1 : rule__ImageObject__Group_3__1__Impl ;
    public final void rule__ImageObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6331:1: ( rule__ImageObject__Group_3__1__Impl )
            // InternalPdfMk.g:6332:2: rule__ImageObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__ImageObject__Group_3__1"


    // $ANTLR start "rule__ImageObject__Group_3__1__Impl"
    // InternalPdfMk.g:6338:1: rule__ImageObject__Group_3__1__Impl : ( ( rule__ImageObject__HeightAssignment_3_1 ) ) ;
    public final void rule__ImageObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6342:1: ( ( ( rule__ImageObject__HeightAssignment_3_1 ) ) )
            // InternalPdfMk.g:6343:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            {
            // InternalPdfMk.g:6343:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            // InternalPdfMk.g:6344:2: ( rule__ImageObject__HeightAssignment_3_1 )
            {
             before(grammarAccess.getImageObjectAccess().getHeightAssignment_3_1()); 
            // InternalPdfMk.g:6345:2: ( rule__ImageObject__HeightAssignment_3_1 )
            // InternalPdfMk.g:6345:3: rule__ImageObject__HeightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__HeightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getHeightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_3__1__Impl"


    // $ANTLR start "rule__ImageObject__Group_4__0"
    // InternalPdfMk.g:6354:1: rule__ImageObject__Group_4__0 : rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 ;
    public final void rule__ImageObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6358:1: ( rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 )
            // InternalPdfMk.g:6359:2: rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__ImageObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_4__1();

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
    // $ANTLR end "rule__ImageObject__Group_4__0"


    // $ANTLR start "rule__ImageObject__Group_4__0__Impl"
    // InternalPdfMk.g:6366:1: rule__ImageObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6370:1: ( ( ',' ) )
            // InternalPdfMk.g:6371:1: ( ',' )
            {
            // InternalPdfMk.g:6371:1: ( ',' )
            // InternalPdfMk.g:6372:2: ','
            {
             before(grammarAccess.getImageObjectAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_4__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_4__1"
    // InternalPdfMk.g:6381:1: rule__ImageObject__Group_4__1 : rule__ImageObject__Group_4__1__Impl ;
    public final void rule__ImageObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6385:1: ( rule__ImageObject__Group_4__1__Impl )
            // InternalPdfMk.g:6386:2: rule__ImageObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__ImageObject__Group_4__1"


    // $ANTLR start "rule__ImageObject__Group_4__1__Impl"
    // InternalPdfMk.g:6392:1: rule__ImageObject__Group_4__1__Impl : ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) ;
    public final void rule__ImageObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6396:1: ( ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) )
            // InternalPdfMk.g:6397:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            {
            // InternalPdfMk.g:6397:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            // InternalPdfMk.g:6398:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            {
             before(grammarAccess.getImageObjectAccess().getOpacityAssignment_4_1()); 
            // InternalPdfMk.g:6399:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            // InternalPdfMk.g:6399:3: rule__ImageObject__OpacityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__OpacityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getOpacityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_4__1__Impl"


    // $ANTLR start "rule__ImageObject__Group_5__0"
    // InternalPdfMk.g:6408:1: rule__ImageObject__Group_5__0 : rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 ;
    public final void rule__ImageObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6412:1: ( rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 )
            // InternalPdfMk.g:6413:2: rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1
            {
            pushFollow(FOLLOW_37);
            rule__ImageObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_5__1();

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
    // $ANTLR end "rule__ImageObject__Group_5__0"


    // $ANTLR start "rule__ImageObject__Group_5__0__Impl"
    // InternalPdfMk.g:6420:1: rule__ImageObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6424:1: ( ( ',' ) )
            // InternalPdfMk.g:6425:1: ( ',' )
            {
            // InternalPdfMk.g:6425:1: ( ',' )
            // InternalPdfMk.g:6426:2: ','
            {
             before(grammarAccess.getImageObjectAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_5__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_5__1"
    // InternalPdfMk.g:6435:1: rule__ImageObject__Group_5__1 : rule__ImageObject__Group_5__1__Impl ;
    public final void rule__ImageObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6439:1: ( rule__ImageObject__Group_5__1__Impl )
            // InternalPdfMk.g:6440:2: rule__ImageObject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_5__1__Impl();

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
    // $ANTLR end "rule__ImageObject__Group_5__1"


    // $ANTLR start "rule__ImageObject__Group_5__1__Impl"
    // InternalPdfMk.g:6446:1: rule__ImageObject__Group_5__1__Impl : ( ( rule__ImageObject__FitAssignment_5_1 ) ) ;
    public final void rule__ImageObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6450:1: ( ( ( rule__ImageObject__FitAssignment_5_1 ) ) )
            // InternalPdfMk.g:6451:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            {
            // InternalPdfMk.g:6451:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            // InternalPdfMk.g:6452:2: ( rule__ImageObject__FitAssignment_5_1 )
            {
             before(grammarAccess.getImageObjectAccess().getFitAssignment_5_1()); 
            // InternalPdfMk.g:6453:2: ( rule__ImageObject__FitAssignment_5_1 )
            // InternalPdfMk.g:6453:3: rule__ImageObject__FitAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__FitAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getFitAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_5__1__Impl"


    // $ANTLR start "rule__ImageObject__Group_6__0"
    // InternalPdfMk.g:6462:1: rule__ImageObject__Group_6__0 : rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 ;
    public final void rule__ImageObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6466:1: ( rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 )
            // InternalPdfMk.g:6467:2: rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1
            {
            pushFollow(FOLLOW_38);
            rule__ImageObject__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_6__1();

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
    // $ANTLR end "rule__ImageObject__Group_6__0"


    // $ANTLR start "rule__ImageObject__Group_6__0__Impl"
    // InternalPdfMk.g:6474:1: rule__ImageObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6478:1: ( ( ',' ) )
            // InternalPdfMk.g:6479:1: ( ',' )
            {
            // InternalPdfMk.g:6479:1: ( ',' )
            // InternalPdfMk.g:6480:2: ','
            {
             before(grammarAccess.getImageObjectAccess().getCommaKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_6__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_6__1"
    // InternalPdfMk.g:6489:1: rule__ImageObject__Group_6__1 : rule__ImageObject__Group_6__1__Impl ;
    public final void rule__ImageObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6493:1: ( rule__ImageObject__Group_6__1__Impl )
            // InternalPdfMk.g:6494:2: rule__ImageObject__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_6__1__Impl();

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
    // $ANTLR end "rule__ImageObject__Group_6__1"


    // $ANTLR start "rule__ImageObject__Group_6__1__Impl"
    // InternalPdfMk.g:6500:1: rule__ImageObject__Group_6__1__Impl : ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) ;
    public final void rule__ImageObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6504:1: ( ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) )
            // InternalPdfMk.g:6505:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            {
            // InternalPdfMk.g:6505:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            // InternalPdfMk.g:6506:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            {
             before(grammarAccess.getImageObjectAccess().getPageBreakAssignment_6_1()); 
            // InternalPdfMk.g:6507:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            // InternalPdfMk.g:6507:3: rule__ImageObject__PageBreakAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__PageBreakAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getPageBreakAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_6__1__Impl"


    // $ANTLR start "rule__ListObject__Group__0"
    // InternalPdfMk.g:6516:1: rule__ListObject__Group__0 : rule__ListObject__Group__0__Impl rule__ListObject__Group__1 ;
    public final void rule__ListObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6520:1: ( rule__ListObject__Group__0__Impl rule__ListObject__Group__1 )
            // InternalPdfMk.g:6521:2: rule__ListObject__Group__0__Impl rule__ListObject__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ListObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__1();

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
    // $ANTLR end "rule__ListObject__Group__0"


    // $ANTLR start "rule__ListObject__Group__0__Impl"
    // InternalPdfMk.g:6528:1: rule__ListObject__Group__0__Impl : ( ( rule__ListObject__ValueAssignment_0 ) ) ;
    public final void rule__ListObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6532:1: ( ( ( rule__ListObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6533:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6533:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6534:2: ( rule__ListObject__ValueAssignment_0 )
            {
             before(grammarAccess.getListObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6535:2: ( rule__ListObject__ValueAssignment_0 )
            // InternalPdfMk.g:6535:3: rule__ListObject__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__0__Impl"


    // $ANTLR start "rule__ListObject__Group__1"
    // InternalPdfMk.g:6543:1: rule__ListObject__Group__1 : rule__ListObject__Group__1__Impl rule__ListObject__Group__2 ;
    public final void rule__ListObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6547:1: ( rule__ListObject__Group__1__Impl rule__ListObject__Group__2 )
            // InternalPdfMk.g:6548:2: rule__ListObject__Group__1__Impl rule__ListObject__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ListObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__2();

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
    // $ANTLR end "rule__ListObject__Group__1"


    // $ANTLR start "rule__ListObject__Group__1__Impl"
    // InternalPdfMk.g:6555:1: rule__ListObject__Group__1__Impl : ( ( rule__ListObject__Group_1__0 )* ) ;
    public final void rule__ListObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6559:1: ( ( ( rule__ListObject__Group_1__0 )* ) )
            // InternalPdfMk.g:6560:1: ( ( rule__ListObject__Group_1__0 )* )
            {
            // InternalPdfMk.g:6560:1: ( ( rule__ListObject__Group_1__0 )* )
            // InternalPdfMk.g:6561:2: ( rule__ListObject__Group_1__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:6562:2: ( rule__ListObject__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=38 && LA47_0<=42)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPdfMk.g:6562:3: rule__ListObject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__ListObject__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getListObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__1__Impl"


    // $ANTLR start "rule__ListObject__Group__2"
    // InternalPdfMk.g:6570:1: rule__ListObject__Group__2 : rule__ListObject__Group__2__Impl rule__ListObject__Group__3 ;
    public final void rule__ListObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6574:1: ( rule__ListObject__Group__2__Impl rule__ListObject__Group__3 )
            // InternalPdfMk.g:6575:2: rule__ListObject__Group__2__Impl rule__ListObject__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ListObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__3();

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
    // $ANTLR end "rule__ListObject__Group__2"


    // $ANTLR start "rule__ListObject__Group__2__Impl"
    // InternalPdfMk.g:6582:1: rule__ListObject__Group__2__Impl : ( ( rule__ListObject__Alternatives_2 ) ) ;
    public final void rule__ListObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6586:1: ( ( ( rule__ListObject__Alternatives_2 ) ) )
            // InternalPdfMk.g:6587:1: ( ( rule__ListObject__Alternatives_2 ) )
            {
            // InternalPdfMk.g:6587:1: ( ( rule__ListObject__Alternatives_2 ) )
            // InternalPdfMk.g:6588:2: ( rule__ListObject__Alternatives_2 )
            {
             before(grammarAccess.getListObjectAccess().getAlternatives_2()); 
            // InternalPdfMk.g:6589:2: ( rule__ListObject__Alternatives_2 )
            // InternalPdfMk.g:6589:3: rule__ListObject__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__2__Impl"


    // $ANTLR start "rule__ListObject__Group__3"
    // InternalPdfMk.g:6597:1: rule__ListObject__Group__3 : rule__ListObject__Group__3__Impl rule__ListObject__Group__4 ;
    public final void rule__ListObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6601:1: ( rule__ListObject__Group__3__Impl rule__ListObject__Group__4 )
            // InternalPdfMk.g:6602:2: rule__ListObject__Group__3__Impl rule__ListObject__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ListObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__4();

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
    // $ANTLR end "rule__ListObject__Group__3"


    // $ANTLR start "rule__ListObject__Group__3__Impl"
    // InternalPdfMk.g:6609:1: rule__ListObject__Group__3__Impl : ( ':' ) ;
    public final void rule__ListObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6613:1: ( ( ':' ) )
            // InternalPdfMk.g:6614:1: ( ':' )
            {
            // InternalPdfMk.g:6614:1: ( ':' )
            // InternalPdfMk.g:6615:2: ':'
            {
             before(grammarAccess.getListObjectAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__3__Impl"


    // $ANTLR start "rule__ListObject__Group__4"
    // InternalPdfMk.g:6624:1: rule__ListObject__Group__4 : rule__ListObject__Group__4__Impl rule__ListObject__Group__5 ;
    public final void rule__ListObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6628:1: ( rule__ListObject__Group__4__Impl rule__ListObject__Group__5 )
            // InternalPdfMk.g:6629:2: rule__ListObject__Group__4__Impl rule__ListObject__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__ListObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__5();

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
    // $ANTLR end "rule__ListObject__Group__4"


    // $ANTLR start "rule__ListObject__Group__4__Impl"
    // InternalPdfMk.g:6636:1: rule__ListObject__Group__4__Impl : ( '[' ) ;
    public final void rule__ListObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6640:1: ( ( '[' ) )
            // InternalPdfMk.g:6641:1: ( '[' )
            {
            // InternalPdfMk.g:6641:1: ( '[' )
            // InternalPdfMk.g:6642:2: '['
            {
             before(grammarAccess.getListObjectAccess().getLeftSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__4__Impl"


    // $ANTLR start "rule__ListObject__Group__5"
    // InternalPdfMk.g:6651:1: rule__ListObject__Group__5 : rule__ListObject__Group__5__Impl rule__ListObject__Group__6 ;
    public final void rule__ListObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6655:1: ( rule__ListObject__Group__5__Impl rule__ListObject__Group__6 )
            // InternalPdfMk.g:6656:2: rule__ListObject__Group__5__Impl rule__ListObject__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ListObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__6();

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
    // $ANTLR end "rule__ListObject__Group__5"


    // $ANTLR start "rule__ListObject__Group__5__Impl"
    // InternalPdfMk.g:6663:1: rule__ListObject__Group__5__Impl : ( ( rule__ListObject__Group_5__0 ) ) ;
    public final void rule__ListObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6667:1: ( ( ( rule__ListObject__Group_5__0 ) ) )
            // InternalPdfMk.g:6668:1: ( ( rule__ListObject__Group_5__0 ) )
            {
            // InternalPdfMk.g:6668:1: ( ( rule__ListObject__Group_5__0 ) )
            // InternalPdfMk.g:6669:2: ( rule__ListObject__Group_5__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6670:2: ( rule__ListObject__Group_5__0 )
            // InternalPdfMk.g:6670:3: rule__ListObject__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__5__Impl"


    // $ANTLR start "rule__ListObject__Group__6"
    // InternalPdfMk.g:6678:1: rule__ListObject__Group__6 : rule__ListObject__Group__6__Impl rule__ListObject__Group__7 ;
    public final void rule__ListObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6682:1: ( rule__ListObject__Group__6__Impl rule__ListObject__Group__7 )
            // InternalPdfMk.g:6683:2: rule__ListObject__Group__6__Impl rule__ListObject__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ListObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group__7();

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
    // $ANTLR end "rule__ListObject__Group__6"


    // $ANTLR start "rule__ListObject__Group__6__Impl"
    // InternalPdfMk.g:6690:1: rule__ListObject__Group__6__Impl : ( ']' ) ;
    public final void rule__ListObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6694:1: ( ( ']' ) )
            // InternalPdfMk.g:6695:1: ( ']' )
            {
            // InternalPdfMk.g:6695:1: ( ']' )
            // InternalPdfMk.g:6696:2: ']'
            {
             before(grammarAccess.getListObjectAccess().getRightSquareBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__6__Impl"


    // $ANTLR start "rule__ListObject__Group__7"
    // InternalPdfMk.g:6705:1: rule__ListObject__Group__7 : rule__ListObject__Group__7__Impl ;
    public final void rule__ListObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6709:1: ( rule__ListObject__Group__7__Impl )
            // InternalPdfMk.g:6710:2: rule__ListObject__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group__7__Impl();

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
    // $ANTLR end "rule__ListObject__Group__7"


    // $ANTLR start "rule__ListObject__Group__7__Impl"
    // InternalPdfMk.g:6716:1: rule__ListObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ListObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6720:1: ( ( '}' ) )
            // InternalPdfMk.g:6721:1: ( '}' )
            {
            // InternalPdfMk.g:6721:1: ( '}' )
            // InternalPdfMk.g:6722:2: '}'
            {
             before(grammarAccess.getListObjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group__7__Impl"


    // $ANTLR start "rule__ListObject__Group_1__0"
    // InternalPdfMk.g:6732:1: rule__ListObject__Group_1__0 : rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 ;
    public final void rule__ListObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6736:1: ( rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 )
            // InternalPdfMk.g:6737:2: rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ListObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1__1();

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
    // $ANTLR end "rule__ListObject__Group_1__0"


    // $ANTLR start "rule__ListObject__Group_1__0__Impl"
    // InternalPdfMk.g:6744:1: rule__ListObject__Group_1__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) ;
    public final void rule__ListObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6748:1: ( ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) )
            // InternalPdfMk.g:6749:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            {
            // InternalPdfMk.g:6749:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            // InternalPdfMk.g:6750:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_0()); 
            // InternalPdfMk.g:6751:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            // InternalPdfMk.g:6751:3: rule__ListObject__PropertiesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__PropertiesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1__0__Impl"


    // $ANTLR start "rule__ListObject__Group_1__1"
    // InternalPdfMk.g:6759:1: rule__ListObject__Group_1__1 : rule__ListObject__Group_1__1__Impl ;
    public final void rule__ListObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6763:1: ( rule__ListObject__Group_1__1__Impl )
            // InternalPdfMk.g:6764:2: rule__ListObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1__1__Impl();

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
    // $ANTLR end "rule__ListObject__Group_1__1"


    // $ANTLR start "rule__ListObject__Group_1__1__Impl"
    // InternalPdfMk.g:6770:1: rule__ListObject__Group_1__1__Impl : ( ( rule__ListObject__Group_1_1__0 )? ) ;
    public final void rule__ListObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6774:1: ( ( ( rule__ListObject__Group_1_1__0 )? ) )
            // InternalPdfMk.g:6775:1: ( ( rule__ListObject__Group_1_1__0 )? )
            {
            // InternalPdfMk.g:6775:1: ( ( rule__ListObject__Group_1_1__0 )? )
            // InternalPdfMk.g:6776:2: ( rule__ListObject__Group_1_1__0 )?
            {
             before(grammarAccess.getListObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:6777:2: ( rule__ListObject__Group_1_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==20) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPdfMk.g:6777:3: rule__ListObject__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListObject__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1__1__Impl"


    // $ANTLR start "rule__ListObject__Group_1_1__0"
    // InternalPdfMk.g:6786:1: rule__ListObject__Group_1_1__0 : rule__ListObject__Group_1_1__0__Impl rule__ListObject__Group_1_1__1 ;
    public final void rule__ListObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6790:1: ( rule__ListObject__Group_1_1__0__Impl rule__ListObject__Group_1_1__1 )
            // InternalPdfMk.g:6791:2: rule__ListObject__Group_1_1__0__Impl rule__ListObject__Group_1_1__1
            {
            pushFollow(FOLLOW_42);
            rule__ListObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1_1__1();

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
    // $ANTLR end "rule__ListObject__Group_1_1__0"


    // $ANTLR start "rule__ListObject__Group_1_1__0__Impl"
    // InternalPdfMk.g:6798:1: rule__ListObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6802:1: ( ( ',' ) )
            // InternalPdfMk.g:6803:1: ( ',' )
            {
            // InternalPdfMk.g:6803:1: ( ',' )
            // InternalPdfMk.g:6804:2: ','
            {
             before(grammarAccess.getListObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__ListObject__Group_1_1__1"
    // InternalPdfMk.g:6813:1: rule__ListObject__Group_1_1__1 : rule__ListObject__Group_1_1__1__Impl rule__ListObject__Group_1_1__2 ;
    public final void rule__ListObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6817:1: ( rule__ListObject__Group_1_1__1__Impl rule__ListObject__Group_1_1__2 )
            // InternalPdfMk.g:6818:2: rule__ListObject__Group_1_1__1__Impl rule__ListObject__Group_1_1__2
            {
            pushFollow(FOLLOW_17);
            rule__ListObject__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1_1__2();

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
    // $ANTLR end "rule__ListObject__Group_1_1__1"


    // $ANTLR start "rule__ListObject__Group_1_1__1__Impl"
    // InternalPdfMk.g:6825:1: rule__ListObject__Group_1_1__1__Impl : ( ( rule__ListObject__PropertiesAssignment_1_1_1 ) ) ;
    public final void rule__ListObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6829:1: ( ( ( rule__ListObject__PropertiesAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:6830:1: ( ( rule__ListObject__PropertiesAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:6830:1: ( ( rule__ListObject__PropertiesAssignment_1_1_1 ) )
            // InternalPdfMk.g:6831:2: ( rule__ListObject__PropertiesAssignment_1_1_1 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_1_1()); 
            // InternalPdfMk.g:6832:2: ( rule__ListObject__PropertiesAssignment_1_1_1 )
            // InternalPdfMk.g:6832:3: rule__ListObject__PropertiesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__PropertiesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__ListObject__Group_1_1__2"
    // InternalPdfMk.g:6840:1: rule__ListObject__Group_1_1__2 : rule__ListObject__Group_1_1__2__Impl ;
    public final void rule__ListObject__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6844:1: ( rule__ListObject__Group_1_1__2__Impl )
            // InternalPdfMk.g:6845:2: rule__ListObject__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ListObject__Group_1_1__2"


    // $ANTLR start "rule__ListObject__Group_1_1__2__Impl"
    // InternalPdfMk.g:6851:1: rule__ListObject__Group_1_1__2__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6855:1: ( ( ',' ) )
            // InternalPdfMk.g:6856:1: ( ',' )
            {
            // InternalPdfMk.g:6856:1: ( ',' )
            // InternalPdfMk.g:6857:2: ','
            {
             before(grammarAccess.getListObjectAccess().getCommaKeyword_1_1_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getCommaKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_1__2__Impl"


    // $ANTLR start "rule__ListObject__Group_5__0"
    // InternalPdfMk.g:6867:1: rule__ListObject__Group_5__0 : rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 ;
    public final void rule__ListObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6871:1: ( rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 )
            // InternalPdfMk.g:6872:2: rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1
            {
            pushFollow(FOLLOW_41);
            rule__ListObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_5__1();

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
    // $ANTLR end "rule__ListObject__Group_5__0"


    // $ANTLR start "rule__ListObject__Group_5__0__Impl"
    // InternalPdfMk.g:6879:1: rule__ListObject__Group_5__0__Impl : ( ( rule__ListObject__ElementsAssignment_5_0 )? ) ;
    public final void rule__ListObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6883:1: ( ( ( rule__ListObject__ElementsAssignment_5_0 )? ) )
            // InternalPdfMk.g:6884:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            {
            // InternalPdfMk.g:6884:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            // InternalPdfMk.g:6885:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            {
             before(grammarAccess.getListObjectAccess().getElementsAssignment_5_0()); 
            // InternalPdfMk.g:6886:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING||LA49_0==18) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPdfMk.g:6886:3: rule__ListObject__ElementsAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListObject__ElementsAssignment_5_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListObjectAccess().getElementsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_5__0__Impl"


    // $ANTLR start "rule__ListObject__Group_5__1"
    // InternalPdfMk.g:6894:1: rule__ListObject__Group_5__1 : rule__ListObject__Group_5__1__Impl ;
    public final void rule__ListObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6898:1: ( rule__ListObject__Group_5__1__Impl )
            // InternalPdfMk.g:6899:2: rule__ListObject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_5__1__Impl();

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
    // $ANTLR end "rule__ListObject__Group_5__1"


    // $ANTLR start "rule__ListObject__Group_5__1__Impl"
    // InternalPdfMk.g:6905:1: rule__ListObject__Group_5__1__Impl : ( ( rule__ListObject__Group_5_1__0 )* ) ;
    public final void rule__ListObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6909:1: ( ( ( rule__ListObject__Group_5_1__0 )* ) )
            // InternalPdfMk.g:6910:1: ( ( rule__ListObject__Group_5_1__0 )* )
            {
            // InternalPdfMk.g:6910:1: ( ( rule__ListObject__Group_5_1__0 )* )
            // InternalPdfMk.g:6911:2: ( rule__ListObject__Group_5_1__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_5_1()); 
            // InternalPdfMk.g:6912:2: ( rule__ListObject__Group_5_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPdfMk.g:6912:3: rule__ListObject__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ListObject__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getListObjectAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_5__1__Impl"


    // $ANTLR start "rule__ListObject__Group_5_1__0"
    // InternalPdfMk.g:6921:1: rule__ListObject__Group_5_1__0 : rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 ;
    public final void rule__ListObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6925:1: ( rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 )
            // InternalPdfMk.g:6926:2: rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1
            {
            pushFollow(FOLLOW_43);
            rule__ListObject__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_5_1__1();

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
    // $ANTLR end "rule__ListObject__Group_5_1__0"


    // $ANTLR start "rule__ListObject__Group_5_1__0__Impl"
    // InternalPdfMk.g:6933:1: rule__ListObject__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6937:1: ( ( ',' ) )
            // InternalPdfMk.g:6938:1: ( ',' )
            {
            // InternalPdfMk.g:6938:1: ( ',' )
            // InternalPdfMk.g:6939:2: ','
            {
             before(grammarAccess.getListObjectAccess().getCommaKeyword_5_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_5_1__0__Impl"


    // $ANTLR start "rule__ListObject__Group_5_1__1"
    // InternalPdfMk.g:6948:1: rule__ListObject__Group_5_1__1 : rule__ListObject__Group_5_1__1__Impl ;
    public final void rule__ListObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6952:1: ( rule__ListObject__Group_5_1__1__Impl )
            // InternalPdfMk.g:6953:2: rule__ListObject__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__ListObject__Group_5_1__1"


    // $ANTLR start "rule__ListObject__Group_5_1__1__Impl"
    // InternalPdfMk.g:6959:1: rule__ListObject__Group_5_1__1__Impl : ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) ;
    public final void rule__ListObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6963:1: ( ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) )
            // InternalPdfMk.g:6964:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            {
            // InternalPdfMk.g:6964:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            // InternalPdfMk.g:6965:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            {
             before(grammarAccess.getListObjectAccess().getElemtensAssignment_5_1_1()); 
            // InternalPdfMk.g:6966:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            // InternalPdfMk.g:6966:3: rule__ListObject__ElemtensAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__ElemtensAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getElemtensAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_5_1__1__Impl"


    // $ANTLR start "rule__ContentObjects__Group__0"
    // InternalPdfMk.g:6975:1: rule__ContentObjects__Group__0 : rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 ;
    public final void rule__ContentObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6979:1: ( rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 )
            // InternalPdfMk.g:6980:2: rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ContentObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group__1();

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
    // $ANTLR end "rule__ContentObjects__Group__0"


    // $ANTLR start "rule__ContentObjects__Group__0__Impl"
    // InternalPdfMk.g:6987:1: rule__ContentObjects__Group__0__Impl : ( '[' ) ;
    public final void rule__ContentObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6991:1: ( ( '[' ) )
            // InternalPdfMk.g:6992:1: ( '[' )
            {
            // InternalPdfMk.g:6992:1: ( '[' )
            // InternalPdfMk.g:6993:2: '['
            {
             before(grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group__0__Impl"


    // $ANTLR start "rule__ContentObjects__Group__1"
    // InternalPdfMk.g:7002:1: rule__ContentObjects__Group__1 : rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 ;
    public final void rule__ContentObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7006:1: ( rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 )
            // InternalPdfMk.g:7007:2: rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__ContentObjects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group__2();

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
    // $ANTLR end "rule__ContentObjects__Group__1"


    // $ANTLR start "rule__ContentObjects__Group__1__Impl"
    // InternalPdfMk.g:7014:1: rule__ContentObjects__Group__1__Impl : ( ( rule__ContentObjects__Group_1__0 )? ) ;
    public final void rule__ContentObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7018:1: ( ( ( rule__ContentObjects__Group_1__0 )? ) )
            // InternalPdfMk.g:7019:1: ( ( rule__ContentObjects__Group_1__0 )? )
            {
            // InternalPdfMk.g:7019:1: ( ( rule__ContentObjects__Group_1__0 )? )
            // InternalPdfMk.g:7020:2: ( rule__ContentObjects__Group_1__0 )?
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:7021:2: ( rule__ContentObjects__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING||LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPdfMk.g:7021:3: rule__ContentObjects__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentObjects__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentObjectsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group__1__Impl"


    // $ANTLR start "rule__ContentObjects__Group__2"
    // InternalPdfMk.g:7029:1: rule__ContentObjects__Group__2 : rule__ContentObjects__Group__2__Impl ;
    public final void rule__ContentObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7033:1: ( rule__ContentObjects__Group__2__Impl )
            // InternalPdfMk.g:7034:2: rule__ContentObjects__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group__2__Impl();

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
    // $ANTLR end "rule__ContentObjects__Group__2"


    // $ANTLR start "rule__ContentObjects__Group__2__Impl"
    // InternalPdfMk.g:7040:1: rule__ContentObjects__Group__2__Impl : ( ']' ) ;
    public final void rule__ContentObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7044:1: ( ( ']' ) )
            // InternalPdfMk.g:7045:1: ( ']' )
            {
            // InternalPdfMk.g:7045:1: ( ']' )
            // InternalPdfMk.g:7046:2: ']'
            {
             before(grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group__2__Impl"


    // $ANTLR start "rule__ContentObjects__Group_1__0"
    // InternalPdfMk.g:7056:1: rule__ContentObjects__Group_1__0 : rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1 ;
    public final void rule__ContentObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7060:1: ( rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1 )
            // InternalPdfMk.g:7061:2: rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ContentObjects__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_1__1();

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
    // $ANTLR end "rule__ContentObjects__Group_1__0"


    // $ANTLR start "rule__ContentObjects__Group_1__0__Impl"
    // InternalPdfMk.g:7068:1: rule__ContentObjects__Group_1__0__Impl : ( ( rule__ContentObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__ContentObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7072:1: ( ( ( rule__ContentObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:7073:1: ( ( rule__ContentObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7073:1: ( ( rule__ContentObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:7074:2: ( rule__ContentObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:7075:2: ( rule__ContentObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:7075:3: rule__ContentObjects__ValueAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__ValueAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectsAccess().getValueAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_1__0__Impl"


    // $ANTLR start "rule__ContentObjects__Group_1__1"
    // InternalPdfMk.g:7083:1: rule__ContentObjects__Group_1__1 : rule__ContentObjects__Group_1__1__Impl ;
    public final void rule__ContentObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7087:1: ( rule__ContentObjects__Group_1__1__Impl )
            // InternalPdfMk.g:7088:2: rule__ContentObjects__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_1__1__Impl();

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
    // $ANTLR end "rule__ContentObjects__Group_1__1"


    // $ANTLR start "rule__ContentObjects__Group_1__1__Impl"
    // InternalPdfMk.g:7094:1: rule__ContentObjects__Group_1__1__Impl : ( ( rule__ContentObjects__Group_1_1__0 )* ) ;
    public final void rule__ContentObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7098:1: ( ( ( rule__ContentObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:7099:1: ( ( rule__ContentObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:7099:1: ( ( rule__ContentObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:7100:2: ( rule__ContentObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:7101:2: ( rule__ContentObjects__Group_1_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==20) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPdfMk.g:7101:3: rule__ContentObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ContentObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getContentObjectsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_1__1__Impl"


    // $ANTLR start "rule__ContentObjects__Group_1_1__0"
    // InternalPdfMk.g:7110:1: rule__ContentObjects__Group_1_1__0 : rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1 ;
    public final void rule__ContentObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7114:1: ( rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1 )
            // InternalPdfMk.g:7115:2: rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_43);
            rule__ContentObjects__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_1_1__1();

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
    // $ANTLR end "rule__ContentObjects__Group_1_1__0"


    // $ANTLR start "rule__ContentObjects__Group_1_1__0__Impl"
    // InternalPdfMk.g:7122:1: rule__ContentObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ContentObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7126:1: ( ( ',' ) )
            // InternalPdfMk.g:7127:1: ( ',' )
            {
            // InternalPdfMk.g:7127:1: ( ',' )
            // InternalPdfMk.g:7128:2: ','
            {
             before(grammarAccess.getContentObjectsAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContentObjectsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_1_1__0__Impl"


    // $ANTLR start "rule__ContentObjects__Group_1_1__1"
    // InternalPdfMk.g:7137:1: rule__ContentObjects__Group_1_1__1 : rule__ContentObjects__Group_1_1__1__Impl ;
    public final void rule__ContentObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7141:1: ( rule__ContentObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:7142:2: rule__ContentObjects__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ContentObjects__Group_1_1__1"


    // $ANTLR start "rule__ContentObjects__Group_1_1__1__Impl"
    // InternalPdfMk.g:7148:1: rule__ContentObjects__Group_1_1__1__Impl : ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__ContentObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7152:1: ( ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:7153:1: ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:7153:1: ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:7154:2: ( rule__ContentObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:7155:2: ( rule__ContentObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:7155:3: rule__ContentObjects__ValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__ValueAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectsAccess().getValueAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_1_1__1__Impl"


    // $ANTLR start "rule__Styles__Group__0"
    // InternalPdfMk.g:7164:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7168:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:7169:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Styles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Styles__Group__1();

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
    // $ANTLR end "rule__Styles__Group__0"


    // $ANTLR start "rule__Styles__Group__0__Impl"
    // InternalPdfMk.g:7176:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7180:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:7181:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:7181:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:7182:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:7183:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:7183:3: rule__Styles__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Styles__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStylesAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__Group__0__Impl"


    // $ANTLR start "rule__Styles__Group__1"
    // InternalPdfMk.g:7191:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7195:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:7196:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Styles__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Styles__Group__2();

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
    // $ANTLR end "rule__Styles__Group__1"


    // $ANTLR start "rule__Styles__Group__1__Impl"
    // InternalPdfMk.g:7203:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7207:1: ( ( ':' ) )
            // InternalPdfMk.g:7208:1: ( ':' )
            {
            // InternalPdfMk.g:7208:1: ( ':' )
            // InternalPdfMk.g:7209:2: ':'
            {
             before(grammarAccess.getStylesAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStylesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__Group__1__Impl"


    // $ANTLR start "rule__Styles__Group__2"
    // InternalPdfMk.g:7218:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7222:1: ( rule__Styles__Group__2__Impl )
            // InternalPdfMk.g:7223:2: rule__Styles__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Styles__Group__2__Impl();

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
    // $ANTLR end "rule__Styles__Group__2"


    // $ANTLR start "rule__Styles__Group__2__Impl"
    // InternalPdfMk.g:7229:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7233:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:7234:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:7234:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:7235:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:7236:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:7236:3: rule__Styles__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Styles__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStylesAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__Group__2__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // InternalPdfMk.g:7245:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7249:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:7250:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalPdfMk.g:7257:1: rule__Content__Group__0__Impl : ( ( rule__Content__KeyAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7261:1: ( ( ( rule__Content__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:7262:1: ( ( rule__Content__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:7262:1: ( ( rule__Content__KeyAssignment_0 ) )
            // InternalPdfMk.g:7263:2: ( rule__Content__KeyAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:7264:2: ( rule__Content__KeyAssignment_0 )
            // InternalPdfMk.g:7264:3: rule__Content__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalPdfMk.g:7272:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7276:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:7277:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Content__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__2();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalPdfMk.g:7284:1: rule__Content__Group__1__Impl : ( ':' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7288:1: ( ( ':' ) )
            // InternalPdfMk.g:7289:1: ( ':' )
            {
            // InternalPdfMk.g:7289:1: ( ':' )
            // InternalPdfMk.g:7290:2: ':'
            {
             before(grammarAccess.getContentAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Content__Group__2"
    // InternalPdfMk.g:7299:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7303:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:7304:2: rule__Content__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__2__Impl();

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
    // $ANTLR end "rule__Content__Group__2"


    // $ANTLR start "rule__Content__Group__2__Impl"
    // InternalPdfMk.g:7310:1: rule__Content__Group__2__Impl : ( ( rule__Content__ValueAssignment_2 ) ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7314:1: ( ( ( rule__Content__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:7315:1: ( ( rule__Content__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:7315:1: ( ( rule__Content__ValueAssignment_2 ) )
            // InternalPdfMk.g:7316:2: ( rule__Content__ValueAssignment_2 )
            {
             before(grammarAccess.getContentAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:7317:2: ( rule__Content__ValueAssignment_2 )
            // InternalPdfMk.g:7317:3: rule__Content__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Content__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__2__Impl"


    // $ANTLR start "rule__DocDefinition__ContentAssignment_4"
    // InternalPdfMk.g:7326:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7330:1: ( ( ruleContent ) )
            // InternalPdfMk.g:7331:2: ( ruleContent )
            {
            // InternalPdfMk.g:7331:2: ( ruleContent )
            // InternalPdfMk.g:7332:3: ruleContent
            {
             before(grammarAccess.getDocDefinitionAccess().getContentContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getDocDefinitionAccess().getContentContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__ContentAssignment_4"


    // $ANTLR start "rule__DocDefinition__StylesAssignment_5_1"
    // InternalPdfMk.g:7341:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7345:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:7346:2: ( ruleStyles )
            {
            // InternalPdfMk.g:7346:2: ( ruleStyles )
            // InternalPdfMk.g:7347:3: ruleStyles
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesStylesParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStyles();

            state._fsp--;

             after(grammarAccess.getDocDefinitionAccess().getStylesStylesParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__StylesAssignment_5_1"


    // $ANTLR start "rule__StringObject__ValueAssignment"
    // InternalPdfMk.g:7356:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7360:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7361:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7361:2: ( RULE_STRING )
            // InternalPdfMk.g:7362:3: RULE_STRING
            {
             before(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringObject__ValueAssignment"


    // $ANTLR start "rule__TypeFaceDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7371:1: rule__TypeFaceDefinition__KeyAssignment_0 : ( ( 'bold' ) ) ;
    public final void rule__TypeFaceDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7375:1: ( ( ( 'bold' ) ) )
            // InternalPdfMk.g:7376:2: ( ( 'bold' ) )
            {
            // InternalPdfMk.g:7376:2: ( ( 'bold' ) )
            // InternalPdfMk.g:7377:3: ( 'bold' )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            // InternalPdfMk.g:7378:3: ( 'bold' )
            // InternalPdfMk.g:7379:4: 'bold'
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 

            }

             after(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFaceDefinition__KeyAssignment_0"


    // $ANTLR start "rule__TypeFaceDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7390:1: rule__TypeFaceDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__TypeFaceDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7394:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7395:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7395:2: ( ruleBooleanType )
            // InternalPdfMk.g:7396:3: ruleBooleanType
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFaceDefinition__ValueAssignment_2"


    // $ANTLR start "rule__TextStyleDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7405:1: rule__TextStyleDefinition__KeyAssignment_0 : ( ( 'style' ) ) ;
    public final void rule__TextStyleDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7409:1: ( ( ( 'style' ) ) )
            // InternalPdfMk.g:7410:2: ( ( 'style' ) )
            {
            // InternalPdfMk.g:7410:2: ( ( 'style' ) )
            // InternalPdfMk.g:7411:3: ( 'style' )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            // InternalPdfMk.g:7412:3: ( 'style' )
            // InternalPdfMk.g:7413:4: 'style'
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 

            }

             after(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextStyleDefinition__KeyAssignment_0"


    // $ANTLR start "rule__TextStyleDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7424:1: rule__TextStyleDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextStyleDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7428:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7429:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7429:2: ( RULE_STRING )
            // InternalPdfMk.g:7430:3: RULE_STRING
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextStyleDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextStyleDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ItalicsDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7439:1: rule__ItalicsDefinition__KeyAssignment_0 : ( ( 'italics' ) ) ;
    public final void rule__ItalicsDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7443:1: ( ( ( 'italics' ) ) )
            // InternalPdfMk.g:7444:2: ( ( 'italics' ) )
            {
            // InternalPdfMk.g:7444:2: ( ( 'italics' ) )
            // InternalPdfMk.g:7445:3: ( 'italics' )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            // InternalPdfMk.g:7446:3: ( 'italics' )
            // InternalPdfMk.g:7447:4: 'italics'
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 

            }

             after(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicsDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ItalicsDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7458:1: rule__ItalicsDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ItalicsDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7462:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7463:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7463:2: ( ruleBooleanType )
            // InternalPdfMk.g:7464:3: ruleBooleanType
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getItalicsDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicsDefinition__ValueAssignment_2"


    // $ANTLR start "rule__FontSizeDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7473:1: rule__FontSizeDefinition__KeyAssignment_0 : ( ( 'fontSize' ) ) ;
    public final void rule__FontSizeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7477:1: ( ( ( 'fontSize' ) ) )
            // InternalPdfMk.g:7478:2: ( ( 'fontSize' ) )
            {
            // InternalPdfMk.g:7478:2: ( ( 'fontSize' ) )
            // InternalPdfMk.g:7479:3: ( 'fontSize' )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            // InternalPdfMk.g:7480:3: ( 'fontSize' )
            // InternalPdfMk.g:7481:4: 'fontSize'
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 

            }

             after(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSizeDefinition__KeyAssignment_0"


    // $ANTLR start "rule__FontSizeDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7492:1: rule__FontSizeDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FontSizeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7496:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7497:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7497:2: ( RULE_INT )
            // InternalPdfMk.g:7498:3: RULE_INT
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFontSizeDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSizeDefinition__ValueAssignment_2"


    // $ANTLR start "rule__WidthDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7507:1: rule__WidthDefinition__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__WidthDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7511:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:7512:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:7512:2: ( ( 'width' ) )
            // InternalPdfMk.g:7513:3: ( 'width' )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:7514:3: ( 'width' )
            // InternalPdfMk.g:7515:4: 'width'
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 

            }

             after(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidthDefinition__KeyAssignment_0"


    // $ANTLR start "rule__WidthDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7526:1: rule__WidthDefinition__ValueAssignment_2 : ( ruleColumnTextWidthType ) ;
    public final void rule__WidthDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7530:1: ( ( ruleColumnTextWidthType ) )
            // InternalPdfMk.g:7531:2: ( ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:7531:2: ( ruleColumnTextWidthType )
            // InternalPdfMk.g:7532:3: ruleColumnTextWidthType
            {
             before(grammarAccess.getWidthDefinitionAccess().getValueColumnTextWidthTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnTextWidthType();

            state._fsp--;

             after(grammarAccess.getWidthDefinitionAccess().getValueColumnTextWidthTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidthDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ColumnDefinition__GlobalStyleAssignment_1_0"
    // InternalPdfMk.g:7541:1: rule__ColumnDefinition__GlobalStyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__ColumnDefinition__GlobalStyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7545:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:7546:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:7546:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:7547:3: ruleTextStyleDefinition
            {
             before(grammarAccess.getColumnDefinitionAccess().getGlobalStyleTextStyleDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextStyleDefinition();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionAccess().getGlobalStyleTextStyleDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__GlobalStyleAssignment_1_0"


    // $ANTLR start "rule__ColumnDefinition__KeyAssignment_2"
    // InternalPdfMk.g:7556:1: rule__ColumnDefinition__KeyAssignment_2 : ( ( 'columns' ) ) ;
    public final void rule__ColumnDefinition__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7560:1: ( ( ( 'columns' ) ) )
            // InternalPdfMk.g:7561:2: ( ( 'columns' ) )
            {
            // InternalPdfMk.g:7561:2: ( ( 'columns' ) )
            // InternalPdfMk.g:7562:3: ( 'columns' )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 
            // InternalPdfMk.g:7563:3: ( 'columns' )
            // InternalPdfMk.g:7564:4: 'columns'
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 

            }

             after(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__KeyAssignment_2"


    // $ANTLR start "rule__ColumnDefinition__ValueAssignment_4_0"
    // InternalPdfMk.g:7575:1: rule__ColumnDefinition__ValueAssignment_4_0 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7579:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:7580:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:7580:2: ( ruleColumnObject )
            // InternalPdfMk.g:7581:3: ruleColumnObject
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueColumnObjectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnObject();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionAccess().getValueColumnObjectParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__ValueAssignment_4_0"


    // $ANTLR start "rule__ColumnDefinition__ValueAssignment_4_1_1"
    // InternalPdfMk.g:7590:1: rule__ColumnDefinition__ValueAssignment_4_1_1 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7594:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:7595:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:7595:2: ( ruleColumnObject )
            // InternalPdfMk.g:7596:3: ruleColumnObject
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueColumnObjectParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnObject();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionAccess().getValueColumnObjectParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__ValueAssignment_4_1_1"


    // $ANTLR start "rule__MarginDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7605:1: rule__MarginDefinition__KeyAssignment_0 : ( ( 'margin' ) ) ;
    public final void rule__MarginDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7609:1: ( ( ( 'margin' ) ) )
            // InternalPdfMk.g:7610:2: ( ( 'margin' ) )
            {
            // InternalPdfMk.g:7610:2: ( ( 'margin' ) )
            // InternalPdfMk.g:7611:3: ( 'margin' )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 
            // InternalPdfMk.g:7612:3: ( 'margin' )
            // InternalPdfMk.g:7613:4: 'margin'
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 

            }

             after(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__KeyAssignment_0"


    // $ANTLR start "rule__MarginDefinition__ValuesAssignment_3"
    // InternalPdfMk.g:7624:1: rule__MarginDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7628:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7629:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7629:2: ( RULE_INT )
            // InternalPdfMk.g:7630:3: RULE_INT
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getValuesINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__ValuesAssignment_3"


    // $ANTLR start "rule__MarginDefinition__ValuesAssignment_4_1"
    // InternalPdfMk.g:7639:1: rule__MarginDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7643:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7644:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7644:2: ( RULE_INT )
            // InternalPdfMk.g:7645:3: RULE_INT
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMarginDefinitionAccess().getValuesINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarginDefinition__ValuesAssignment_4_1"


    // $ANTLR start "rule__ImageDefintion__KeyAssignment_0"
    // InternalPdfMk.g:7654:1: rule__ImageDefintion__KeyAssignment_0 : ( ( 'image' ) ) ;
    public final void rule__ImageDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7658:1: ( ( ( 'image' ) ) )
            // InternalPdfMk.g:7659:2: ( ( 'image' ) )
            {
            // InternalPdfMk.g:7659:2: ( ( 'image' ) )
            // InternalPdfMk.g:7660:3: ( 'image' )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 
            // InternalPdfMk.g:7661:3: ( 'image' )
            // InternalPdfMk.g:7662:4: 'image'
            {
             before(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 

            }

             after(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDefintion__KeyAssignment_0"


    // $ANTLR start "rule__ImageDefintion__ValueAssignment_2"
    // InternalPdfMk.g:7673:1: rule__ImageDefintion__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7677:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7678:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7678:2: ( RULE_STRING )
            // InternalPdfMk.g:7679:3: RULE_STRING
            {
             before(grammarAccess.getImageDefintionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDefintionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDefintion__ValueAssignment_2"


    // $ANTLR start "rule__ImageWidthDefintion__KeyAssignment_0"
    // InternalPdfMk.g:7688:1: rule__ImageWidthDefintion__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__ImageWidthDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7692:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:7693:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:7693:2: ( ( 'width' ) )
            // InternalPdfMk.g:7694:3: ( 'width' )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:7695:3: ( 'width' )
            // InternalPdfMk.g:7696:4: 'width'
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 

            }

             after(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageWidthDefintion__KeyAssignment_0"


    // $ANTLR start "rule__ImageWidthDefintion__ValueAssignment_2"
    // InternalPdfMk.g:7707:1: rule__ImageWidthDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageWidthDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7711:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7712:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7712:2: ( RULE_INT )
            // InternalPdfMk.g:7713:3: RULE_INT
            {
             before(grammarAccess.getImageWidthDefintionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageWidthDefintionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageWidthDefintion__ValueAssignment_2"


    // $ANTLR start "rule__ImageHeightDefintion__KeyAssignment_0"
    // InternalPdfMk.g:7722:1: rule__ImageHeightDefintion__KeyAssignment_0 : ( ( 'height' ) ) ;
    public final void rule__ImageHeightDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7726:1: ( ( ( 'height' ) ) )
            // InternalPdfMk.g:7727:2: ( ( 'height' ) )
            {
            // InternalPdfMk.g:7727:2: ( ( 'height' ) )
            // InternalPdfMk.g:7728:3: ( 'height' )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 
            // InternalPdfMk.g:7729:3: ( 'height' )
            // InternalPdfMk.g:7730:4: 'height'
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 

            }

             after(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageHeightDefintion__KeyAssignment_0"


    // $ANTLR start "rule__ImageHeightDefintion__ValueAssignment_2"
    // InternalPdfMk.g:7741:1: rule__ImageHeightDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageHeightDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7745:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7746:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7746:2: ( RULE_INT )
            // InternalPdfMk.g:7747:3: RULE_INT
            {
             before(grammarAccess.getImageHeightDefintionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageHeightDefintionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageHeightDefintion__ValueAssignment_2"


    // $ANTLR start "rule__ImagePageBreakDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7756:1: rule__ImagePageBreakDefinition__KeyAssignment_0 : ( ( 'pageBreak' ) ) ;
    public final void rule__ImagePageBreakDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7760:1: ( ( ( 'pageBreak' ) ) )
            // InternalPdfMk.g:7761:2: ( ( 'pageBreak' ) )
            {
            // InternalPdfMk.g:7761:2: ( ( 'pageBreak' ) )
            // InternalPdfMk.g:7762:3: ( 'pageBreak' )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 
            // InternalPdfMk.g:7763:3: ( 'pageBreak' )
            // InternalPdfMk.g:7764:4: 'pageBreak'
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 

            }

             after(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagePageBreakDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ImagePageBreakDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7775:1: rule__ImagePageBreakDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImagePageBreakDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7779:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7780:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7780:2: ( RULE_STRING )
            // InternalPdfMk.g:7781:3: RULE_STRING
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImagePageBreakDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagePageBreakDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ImageFitDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7790:1: rule__ImageFitDefinition__KeyAssignment_0 : ( ( 'fit' ) ) ;
    public final void rule__ImageFitDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7794:1: ( ( ( 'fit' ) ) )
            // InternalPdfMk.g:7795:2: ( ( 'fit' ) )
            {
            // InternalPdfMk.g:7795:2: ( ( 'fit' ) )
            // InternalPdfMk.g:7796:3: ( 'fit' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 
            // InternalPdfMk.g:7797:3: ( 'fit' )
            // InternalPdfMk.g:7798:4: 'fit'
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 

            }

             after(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ImageFitDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7809:1: rule__ImageFitDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__ImageFitDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7813:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:7814:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:7814:2: ( ( '[' ) )
            // InternalPdfMk.g:7815:3: ( '[' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:7816:3: ( '[' )
            // InternalPdfMk.g:7817:4: '['
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ImageFitDefinition__ValuesAssignment_3"
    // InternalPdfMk.g:7828:1: rule__ImageFitDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7832:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7833:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7833:2: ( RULE_INT )
            // InternalPdfMk.g:7834:3: RULE_INT
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getValuesINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__ValuesAssignment_3"


    // $ANTLR start "rule__ImageFitDefinition__ValuesAssignment_4_1"
    // InternalPdfMk.g:7843:1: rule__ImageFitDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7847:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7848:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7848:2: ( RULE_INT )
            // InternalPdfMk.g:7849:3: RULE_INT
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageFitDefinitionAccess().getValuesINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageFitDefinition__ValuesAssignment_4_1"


    // $ANTLR start "rule__ImageOpacityDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7858:1: rule__ImageOpacityDefinition__KeyAssignment_0 : ( ( 'opacity' ) ) ;
    public final void rule__ImageOpacityDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7862:1: ( ( ( 'opacity' ) ) )
            // InternalPdfMk.g:7863:2: ( ( 'opacity' ) )
            {
            // InternalPdfMk.g:7863:2: ( ( 'opacity' ) )
            // InternalPdfMk.g:7864:3: ( 'opacity' )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 
            // InternalPdfMk.g:7865:3: ( 'opacity' )
            // InternalPdfMk.g:7866:4: 'opacity'
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 

            }

             after(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageOpacityDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ImageOpacityDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7877:1: rule__ImageOpacityDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageOpacityDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7881:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7882:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7882:2: ( RULE_INT )
            // InternalPdfMk.g:7883:3: RULE_INT
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageOpacityDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageOpacityDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ListReversedDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7892:1: rule__ListReversedDefinition__KeyAssignment_0 : ( ( 'reversed' ) ) ;
    public final void rule__ListReversedDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7896:1: ( ( ( 'reversed' ) ) )
            // InternalPdfMk.g:7897:2: ( ( 'reversed' ) )
            {
            // InternalPdfMk.g:7897:2: ( ( 'reversed' ) )
            // InternalPdfMk.g:7898:3: ( 'reversed' )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 
            // InternalPdfMk.g:7899:3: ( 'reversed' )
            // InternalPdfMk.g:7900:4: 'reversed'
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 

            }

             after(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListReversedDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ListReversedDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7911:1: rule__ListReversedDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ListReversedDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7915:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7916:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7916:2: ( ruleBooleanType )
            // InternalPdfMk.g:7917:3: ruleBooleanType
            {
             before(grammarAccess.getListReversedDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getListReversedDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListReversedDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ListCounterDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7926:1: rule__ListCounterDefinition__KeyAssignment_0 : ( ( 'counter' ) ) ;
    public final void rule__ListCounterDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7930:1: ( ( ( 'counter' ) ) )
            // InternalPdfMk.g:7931:2: ( ( 'counter' ) )
            {
            // InternalPdfMk.g:7931:2: ( ( 'counter' ) )
            // InternalPdfMk.g:7932:3: ( 'counter' )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 
            // InternalPdfMk.g:7933:3: ( 'counter' )
            // InternalPdfMk.g:7934:4: 'counter'
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 

            }

             after(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListCounterDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ListCounterDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7945:1: rule__ListCounterDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ListCounterDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7949:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7950:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7950:2: ( RULE_INT )
            // InternalPdfMk.g:7951:3: RULE_INT
            {
             before(grammarAccess.getListCounterDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getListCounterDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListCounterDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ListTypeDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7960:1: rule__ListTypeDefinition__KeyAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__ListTypeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7964:1: ( ( ( 'type' ) ) )
            // InternalPdfMk.g:7965:2: ( ( 'type' ) )
            {
            // InternalPdfMk.g:7965:2: ( ( 'type' ) )
            // InternalPdfMk.g:7966:3: ( 'type' )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 
            // InternalPdfMk.g:7967:3: ( 'type' )
            // InternalPdfMk.g:7968:4: 'type'
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 

            }

             after(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ListTypeDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7979:1: rule__ListTypeDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListTypeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7983:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7984:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7984:2: ( RULE_STRING )
            // InternalPdfMk.g:7985:3: RULE_STRING
            {
             before(grammarAccess.getListTypeDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListTypeDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ListColorDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7994:1: rule__ListColorDefinition__KeyAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ListColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7998:1: ( ( ( 'color' ) ) )
            // InternalPdfMk.g:7999:2: ( ( 'color' ) )
            {
            // InternalPdfMk.g:7999:2: ( ( 'color' ) )
            // InternalPdfMk.g:8000:3: ( 'color' )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 
            // InternalPdfMk.g:8001:3: ( 'color' )
            // InternalPdfMk.g:8002:4: 'color'
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 

            }

             after(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListColorDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ListColorDefinition__ValueAssignment_2"
    // InternalPdfMk.g:8013:1: rule__ListColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8017:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8018:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8018:2: ( RULE_STRING )
            // InternalPdfMk.g:8019:3: RULE_STRING
            {
             before(grammarAccess.getListColorDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListColorDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListColorDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ListMarkerColorDefinition__KeyAssignment_0"
    // InternalPdfMk.g:8028:1: rule__ListMarkerColorDefinition__KeyAssignment_0 : ( ( 'markerColor' ) ) ;
    public final void rule__ListMarkerColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8032:1: ( ( ( 'markerColor' ) ) )
            // InternalPdfMk.g:8033:2: ( ( 'markerColor' ) )
            {
            // InternalPdfMk.g:8033:2: ( ( 'markerColor' ) )
            // InternalPdfMk.g:8034:3: ( 'markerColor' )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 
            // InternalPdfMk.g:8035:3: ( 'markerColor' )
            // InternalPdfMk.g:8036:4: 'markerColor'
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 

            }

             after(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMarkerColorDefinition__KeyAssignment_0"


    // $ANTLR start "rule__ListMarkerColorDefinition__ValueAssignment_2"
    // InternalPdfMk.g:8047:1: rule__ListMarkerColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListMarkerColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8051:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8052:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8052:2: ( RULE_STRING )
            // InternalPdfMk.g:8053:3: RULE_STRING
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListMarkerColorDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMarkerColorDefinition__ValueAssignment_2"


    // $ANTLR start "rule__TextObject__ValueAssignment_0"
    // InternalPdfMk.g:8062:1: rule__TextObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TextObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8066:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8067:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8067:2: ( ( '{' ) )
            // InternalPdfMk.g:8068:3: ( '{' )
            {
             before(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:8069:3: ( '{' )
            // InternalPdfMk.g:8070:4: '{'
            {
             before(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__ValueAssignment_0"


    // $ANTLR start "rule__TextObject__TextAssignment_1"
    // InternalPdfMk.g:8081:1: rule__TextObject__TextAssignment_1 : ( ruleTextDefinition ) ;
    public final void rule__TextObject__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8085:1: ( ( ruleTextDefinition ) )
            // InternalPdfMk.g:8086:2: ( ruleTextDefinition )
            {
            // InternalPdfMk.g:8086:2: ( ruleTextDefinition )
            // InternalPdfMk.g:8087:3: ruleTextDefinition
            {
             before(grammarAccess.getTextObjectAccess().getTextTextDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getTextTextDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__TextAssignment_1"


    // $ANTLR start "rule__TextObject__StyleAssignment_2_1"
    // InternalPdfMk.g:8096:1: rule__TextObject__StyleAssignment_2_1 : ( ruleTextStyleDefinition ) ;
    public final void rule__TextObject__StyleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8100:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:8101:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:8101:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:8102:3: ruleTextStyleDefinition
            {
             before(grammarAccess.getTextObjectAccess().getStyleTextStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextStyleDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getStyleTextStyleDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__StyleAssignment_2_1"


    // $ANTLR start "rule__TextObject__FontSizeAssignment_3_1"
    // InternalPdfMk.g:8111:1: rule__TextObject__FontSizeAssignment_3_1 : ( ruleFontSizeDefinition ) ;
    public final void rule__TextObject__FontSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8115:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:8116:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:8116:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:8117:3: ruleFontSizeDefinition
            {
             before(grammarAccess.getTextObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFontSizeDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__FontSizeAssignment_3_1"


    // $ANTLR start "rule__TextObject__AlignmentAssignment_4_1"
    // InternalPdfMk.g:8126:1: rule__TextObject__AlignmentAssignment_4_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__TextObject__AlignmentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8130:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:8131:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:8131:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:8132:3: ruleTextAlignmentDefinition
            {
             before(grammarAccess.getTextObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextAlignmentDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__AlignmentAssignment_4_1"


    // $ANTLR start "rule__TextObject__TypeFaceAssignment_5_1"
    // InternalPdfMk.g:8141:1: rule__TextObject__TypeFaceAssignment_5_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__TextObject__TypeFaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8145:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:8146:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:8146:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:8147:3: ruleTypeFaceDefinition
            {
             before(grammarAccess.getTextObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeFaceDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__TypeFaceAssignment_5_1"


    // $ANTLR start "rule__TextObject__ItalicsAssignment_6_1"
    // InternalPdfMk.g:8156:1: rule__TextObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__TextObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8160:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:8161:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:8161:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:8162:3: ruleItalicsDefinition
            {
             before(grammarAccess.getTextObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItalicsDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__ItalicsAssignment_6_1"


    // $ANTLR start "rule__TextObject__WidthAssignment_7_1"
    // InternalPdfMk.g:8171:1: rule__TextObject__WidthAssignment_7_1 : ( ruleWidthDefinition ) ;
    public final void rule__TextObject__WidthAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8175:1: ( ( ruleWidthDefinition ) )
            // InternalPdfMk.g:8176:2: ( ruleWidthDefinition )
            {
            // InternalPdfMk.g:8176:2: ( ruleWidthDefinition )
            // InternalPdfMk.g:8177:3: ruleWidthDefinition
            {
             before(grammarAccess.getTextObjectAccess().getWidthWidthDefinitionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWidthDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getWidthWidthDefinitionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__WidthAssignment_7_1"


    // $ANTLR start "rule__TextObject__MarginAssignment_8_1"
    // InternalPdfMk.g:8186:1: rule__TextObject__MarginAssignment_8_1 : ( ruleMarginDefinition ) ;
    public final void rule__TextObject__MarginAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8190:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:8191:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:8191:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:8192:3: ruleMarginDefinition
            {
             before(grammarAccess.getTextObjectAccess().getMarginMarginDefinitionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMarginDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getMarginMarginDefinitionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__MarginAssignment_8_1"


    // $ANTLR start "rule__TextObject__ListCounterAssignment_9_1"
    // InternalPdfMk.g:8201:1: rule__TextObject__ListCounterAssignment_9_1 : ( ruleListCounterDefinition ) ;
    public final void rule__TextObject__ListCounterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8205:1: ( ( ruleListCounterDefinition ) )
            // InternalPdfMk.g:8206:2: ( ruleListCounterDefinition )
            {
            // InternalPdfMk.g:8206:2: ( ruleListCounterDefinition )
            // InternalPdfMk.g:8207:3: ruleListCounterDefinition
            {
             before(grammarAccess.getTextObjectAccess().getListCounterListCounterDefinitionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListCounterDefinition();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getListCounterListCounterDefinitionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__ListCounterAssignment_9_1"


    // $ANTLR start "rule__ColumnTextObject__ValueAssignment"
    // InternalPdfMk.g:8216:1: rule__ColumnTextObject__ValueAssignment : ( ruleColumnDefinition ) ;
    public final void rule__ColumnTextObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8220:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8221:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8221:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8222:3: ruleColumnDefinition
            {
             before(grammarAccess.getColumnTextObjectAccess().getValueColumnDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnTextObjectAccess().getValueColumnDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTextObject__ValueAssignment"


    // $ANTLR start "rule__StyleObject__KeyAssignment_0"
    // InternalPdfMk.g:8231:1: rule__StyleObject__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StyleObject__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8235:1: ( ( RULE_ID ) )
            // InternalPdfMk.g:8236:2: ( RULE_ID )
            {
            // InternalPdfMk.g:8236:2: ( RULE_ID )
            // InternalPdfMk.g:8237:3: RULE_ID
            {
             before(grammarAccess.getStyleObjectAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__KeyAssignment_0"


    // $ANTLR start "rule__StyleObject__ValueAssignment_2"
    // InternalPdfMk.g:8246:1: rule__StyleObject__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__StyleObject__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8250:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8251:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8251:2: ( ( '{' ) )
            // InternalPdfMk.g:8252:3: ( '{' )
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:8253:3: ( '{' )
            // InternalPdfMk.g:8254:4: '{'
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__ValueAssignment_2"


    // $ANTLR start "rule__StyleObject__FontSizeAssignment_3"
    // InternalPdfMk.g:8265:1: rule__StyleObject__FontSizeAssignment_3 : ( ruleFontSizeDefinition ) ;
    public final void rule__StyleObject__FontSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8269:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:8270:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:8270:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:8271:3: ruleFontSizeDefinition
            {
             before(grammarAccess.getStyleObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFontSizeDefinition();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__FontSizeAssignment_3"


    // $ANTLR start "rule__StyleObject__TypeFaceAssignment_4_1"
    // InternalPdfMk.g:8280:1: rule__StyleObject__TypeFaceAssignment_4_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__StyleObject__TypeFaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8284:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:8285:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:8285:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:8286:3: ruleTypeFaceDefinition
            {
             before(grammarAccess.getStyleObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeFaceDefinition();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__TypeFaceAssignment_4_1"


    // $ANTLR start "rule__StyleObject__AlignmentAssignment_5_1"
    // InternalPdfMk.g:8295:1: rule__StyleObject__AlignmentAssignment_5_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__StyleObject__AlignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8299:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:8300:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:8300:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:8301:3: ruleTextAlignmentDefinition
            {
             before(grammarAccess.getStyleObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextAlignmentDefinition();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__AlignmentAssignment_5_1"


    // $ANTLR start "rule__StyleObject__ItalicsAssignment_6_1"
    // InternalPdfMk.g:8310:1: rule__StyleObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__StyleObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8314:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:8315:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:8315:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:8316:3: ruleItalicsDefinition
            {
             before(grammarAccess.getStyleObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItalicsDefinition();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__ItalicsAssignment_6_1"


    // $ANTLR start "rule__StyleObject__MarginAssignment_7_1"
    // InternalPdfMk.g:8325:1: rule__StyleObject__MarginAssignment_7_1 : ( ruleMarginDefinition ) ;
    public final void rule__StyleObject__MarginAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8329:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:8330:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:8330:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:8331:3: ruleMarginDefinition
            {
             before(grammarAccess.getStyleObjectAccess().getMarginMarginDefinitionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMarginDefinition();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getMarginMarginDefinitionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__MarginAssignment_7_1"


    // $ANTLR start "rule__StyleObjects__ValueAssignment_1_0"
    // InternalPdfMk.g:8340:1: rule__StyleObjects__ValueAssignment_1_0 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8344:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:8345:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:8345:2: ( ruleStyleObject )
            // InternalPdfMk.g:8346:3: ruleStyleObject
            {
             before(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObject();

            state._fsp--;

             after(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__ValueAssignment_1_0"


    // $ANTLR start "rule__StyleObjects__ValueAssignment_1_1_1"
    // InternalPdfMk.g:8355:1: rule__StyleObjects__ValueAssignment_1_1_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8359:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:8360:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:8360:2: ( ruleStyleObject )
            // InternalPdfMk.g:8361:3: ruleStyleObject
            {
             before(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObject();

            state._fsp--;

             after(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__ValueAssignment_1_1_1"


    // $ANTLR start "rule__InnerColumnObject__ValueAssignment_0"
    // InternalPdfMk.g:8370:1: rule__InnerColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__InnerColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8374:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8375:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8375:2: ( ( '[' ) )
            // InternalPdfMk.g:8376:3: ( '[' )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:8377:3: ( '[' )
            // InternalPdfMk.g:8378:4: '['
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__ValueAssignment_0"


    // $ANTLR start "rule__InnerColumnObject__TextAssignment_1_0"
    // InternalPdfMk.g:8389:1: rule__InnerColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8393:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8394:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8394:2: ( ruleStringObject )
            // InternalPdfMk.g:8395:3: ruleStringObject
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__TextAssignment_1_0"


    // $ANTLR start "rule__InnerColumnObject__TextAssignment_1_1_1"
    // InternalPdfMk.g:8404:1: rule__InnerColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8408:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8409:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8409:2: ( ruleStringObject )
            // InternalPdfMk.g:8410:3: ruleStringObject
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__TextAssignment_1_1_1"


    // $ANTLR start "rule__InnerColumnObject__TextObjectAssignment_2_0"
    // InternalPdfMk.g:8419:1: rule__InnerColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8423:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8424:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8424:2: ( ruleTextObject )
            // InternalPdfMk.g:8425:3: ruleTextObject
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__TextObjectAssignment_2_0"


    // $ANTLR start "rule__InnerColumnObject__TextObjectAssignment_2_1_1"
    // InternalPdfMk.g:8434:1: rule__InnerColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8438:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8439:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8439:2: ( ruleTextObject )
            // InternalPdfMk.g:8440:3: ruleTextObject
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__TextObjectAssignment_2_1_1"


    // $ANTLR start "rule__InnerColumnObject__ColumnAssignment_3_0"
    // InternalPdfMk.g:8449:1: rule__InnerColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8453:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8454:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8454:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8455:3: ruleColumnDefinition
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__ColumnAssignment_3_0"


    // $ANTLR start "rule__InnerColumnObject__ColumnAssignment_3_1_1"
    // InternalPdfMk.g:8464:1: rule__InnerColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8468:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8469:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8469:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8470:3: ruleColumnDefinition
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObject__ColumnAssignment_3_1_1"


    // $ANTLR start "rule__ColumnObject__ValueAssignment_0"
    // InternalPdfMk.g:8479:1: rule__ColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__ColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8483:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8484:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8484:2: ( ( '[' ) )
            // InternalPdfMk.g:8485:3: ( '[' )
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:8486:3: ( '[' )
            // InternalPdfMk.g:8487:4: '['
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__ValueAssignment_0"


    // $ANTLR start "rule__ColumnObject__TextAssignment_1_0"
    // InternalPdfMk.g:8498:1: rule__ColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8502:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8503:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8503:2: ( ruleStringObject )
            // InternalPdfMk.g:8504:3: ruleStringObject
            {
             before(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__TextAssignment_1_0"


    // $ANTLR start "rule__ColumnObject__TextAssignment_1_1_1"
    // InternalPdfMk.g:8513:1: rule__ColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8517:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8518:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8518:2: ( ruleStringObject )
            // InternalPdfMk.g:8519:3: ruleStringObject
            {
             before(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__TextAssignment_1_1_1"


    // $ANTLR start "rule__ColumnObject__TextObjectAssignment_2_0"
    // InternalPdfMk.g:8528:1: rule__ColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8532:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8533:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8533:2: ( ruleTextObject )
            // InternalPdfMk.g:8534:3: ruleTextObject
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__TextObjectAssignment_2_0"


    // $ANTLR start "rule__ColumnObject__TextObjectAssignment_2_1_1"
    // InternalPdfMk.g:8543:1: rule__ColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8547:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8548:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8548:2: ( ruleTextObject )
            // InternalPdfMk.g:8549:3: ruleTextObject
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__TextObjectAssignment_2_1_1"


    // $ANTLR start "rule__ColumnObject__ColumnAssignment_3_0"
    // InternalPdfMk.g:8558:1: rule__ColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8562:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8563:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8563:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8564:3: ruleColumnDefinition
            {
             before(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__ColumnAssignment_3_0"


    // $ANTLR start "rule__ColumnObject__ColumnAssignment_3_1_1"
    // InternalPdfMk.g:8573:1: rule__ColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8577:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8578:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8578:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8579:3: ruleColumnDefinition
            {
             before(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__ColumnAssignment_3_1_1"


    // $ANTLR start "rule__ColumnObject__InnerColumnAssignment_4_0"
    // InternalPdfMk.g:8588:1: rule__ColumnObject__InnerColumnAssignment_4_0 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8592:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:8593:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:8593:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:8594:3: ruleInnerColumnObject
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnInnerColumnObjectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerColumnObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getInnerColumnInnerColumnObjectParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__InnerColumnAssignment_4_0"


    // $ANTLR start "rule__ColumnObject__InnerColumnAssignment_4_1_1"
    // InternalPdfMk.g:8603:1: rule__ColumnObject__InnerColumnAssignment_4_1_1 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8607:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:8608:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:8608:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:8609:3: ruleInnerColumnObject
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnInnerColumnObjectParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerColumnObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getInnerColumnInnerColumnObjectParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__InnerColumnAssignment_4_1_1"


    // $ANTLR start "rule__ImageObject__ValueAssignment_0"
    // InternalPdfMk.g:8618:1: rule__ImageObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ImageObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8622:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8623:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8623:2: ( ( '{' ) )
            // InternalPdfMk.g:8624:3: ( '{' )
            {
             before(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:8625:3: ( '{' )
            // InternalPdfMk.g:8626:4: '{'
            {
             before(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__ValueAssignment_0"


    // $ANTLR start "rule__ImageObject__ImageAssignment_1"
    // InternalPdfMk.g:8637:1: rule__ImageObject__ImageAssignment_1 : ( ruleImageDefintion ) ;
    public final void rule__ImageObject__ImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8641:1: ( ( ruleImageDefintion ) )
            // InternalPdfMk.g:8642:2: ( ruleImageDefintion )
            {
            // InternalPdfMk.g:8642:2: ( ruleImageDefintion )
            // InternalPdfMk.g:8643:3: ruleImageDefintion
            {
             before(grammarAccess.getImageObjectAccess().getImageImageDefintionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageDefintion();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getImageImageDefintionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__ImageAssignment_1"


    // $ANTLR start "rule__ImageObject__WidthAssignment_2_1"
    // InternalPdfMk.g:8652:1: rule__ImageObject__WidthAssignment_2_1 : ( ruleImageWidthDefintion ) ;
    public final void rule__ImageObject__WidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8656:1: ( ( ruleImageWidthDefintion ) )
            // InternalPdfMk.g:8657:2: ( ruleImageWidthDefintion )
            {
            // InternalPdfMk.g:8657:2: ( ruleImageWidthDefintion )
            // InternalPdfMk.g:8658:3: ruleImageWidthDefintion
            {
             before(grammarAccess.getImageObjectAccess().getWidthImageWidthDefintionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageWidthDefintion();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getWidthImageWidthDefintionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__WidthAssignment_2_1"


    // $ANTLR start "rule__ImageObject__HeightAssignment_3_1"
    // InternalPdfMk.g:8667:1: rule__ImageObject__HeightAssignment_3_1 : ( ruleImageHeightDefintion ) ;
    public final void rule__ImageObject__HeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8671:1: ( ( ruleImageHeightDefintion ) )
            // InternalPdfMk.g:8672:2: ( ruleImageHeightDefintion )
            {
            // InternalPdfMk.g:8672:2: ( ruleImageHeightDefintion )
            // InternalPdfMk.g:8673:3: ruleImageHeightDefintion
            {
             before(grammarAccess.getImageObjectAccess().getHeightImageHeightDefintionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageHeightDefintion();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getHeightImageHeightDefintionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__HeightAssignment_3_1"


    // $ANTLR start "rule__ImageObject__OpacityAssignment_4_1"
    // InternalPdfMk.g:8682:1: rule__ImageObject__OpacityAssignment_4_1 : ( ruleImageOpacityDefinition ) ;
    public final void rule__ImageObject__OpacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8686:1: ( ( ruleImageOpacityDefinition ) )
            // InternalPdfMk.g:8687:2: ( ruleImageOpacityDefinition )
            {
            // InternalPdfMk.g:8687:2: ( ruleImageOpacityDefinition )
            // InternalPdfMk.g:8688:3: ruleImageOpacityDefinition
            {
             before(grammarAccess.getImageObjectAccess().getOpacityImageOpacityDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageOpacityDefinition();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getOpacityImageOpacityDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__OpacityAssignment_4_1"


    // $ANTLR start "rule__ImageObject__FitAssignment_5_1"
    // InternalPdfMk.g:8697:1: rule__ImageObject__FitAssignment_5_1 : ( ruleImageFitDefinition ) ;
    public final void rule__ImageObject__FitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8701:1: ( ( ruleImageFitDefinition ) )
            // InternalPdfMk.g:8702:2: ( ruleImageFitDefinition )
            {
            // InternalPdfMk.g:8702:2: ( ruleImageFitDefinition )
            // InternalPdfMk.g:8703:3: ruleImageFitDefinition
            {
             before(grammarAccess.getImageObjectAccess().getFitImageFitDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageFitDefinition();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getFitImageFitDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__FitAssignment_5_1"


    // $ANTLR start "rule__ImageObject__PageBreakAssignment_6_1"
    // InternalPdfMk.g:8712:1: rule__ImageObject__PageBreakAssignment_6_1 : ( ruleImagePageBreakDefinition ) ;
    public final void rule__ImageObject__PageBreakAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8716:1: ( ( ruleImagePageBreakDefinition ) )
            // InternalPdfMk.g:8717:2: ( ruleImagePageBreakDefinition )
            {
            // InternalPdfMk.g:8717:2: ( ruleImagePageBreakDefinition )
            // InternalPdfMk.g:8718:3: ruleImagePageBreakDefinition
            {
             before(grammarAccess.getImageObjectAccess().getPageBreakImagePageBreakDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImagePageBreakDefinition();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getPageBreakImagePageBreakDefinitionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__PageBreakAssignment_6_1"


    // $ANTLR start "rule__ListObjectPropertiesWrapper__ValueAssignment"
    // InternalPdfMk.g:8727:1: rule__ListObjectPropertiesWrapper__ValueAssignment : ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) ;
    public final void rule__ListObjectPropertiesWrapper__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8731:1: ( ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:8732:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:8732:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            // InternalPdfMk.g:8733:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:8734:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            // InternalPdfMk.g:8734:4: rule__ListObjectPropertiesWrapper__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ListObjectPropertiesWrapper__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObjectPropertiesWrapper__ValueAssignment"


    // $ANTLR start "rule__ListElements__ElValuesAssignment_0"
    // InternalPdfMk.g:8742:1: rule__ListElements__ElValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListElements__ElValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8746:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8747:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8747:2: ( RULE_STRING )
            // InternalPdfMk.g:8748:3: RULE_STRING
            {
             before(grammarAccess.getListElementsAccess().getElValuesSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListElementsAccess().getElValuesSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElements__ElValuesAssignment_0"


    // $ANTLR start "rule__ListObject__ValueAssignment_0"
    // InternalPdfMk.g:8757:1: rule__ListObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ListObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8761:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8762:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8762:2: ( ( '{' ) )
            // InternalPdfMk.g:8763:3: ( '{' )
            {
             before(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:8764:3: ( '{' )
            // InternalPdfMk.g:8765:4: '{'
            {
             before(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__ValueAssignment_0"


    // $ANTLR start "rule__ListObject__PropertiesAssignment_1_0"
    // InternalPdfMk.g:8776:1: rule__ListObject__PropertiesAssignment_1_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8780:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:8781:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:8781:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:8782:3: ruleListObjectPropertiesWrapper
            {
             before(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListObjectPropertiesWrapper();

            state._fsp--;

             after(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__PropertiesAssignment_1_0"


    // $ANTLR start "rule__ListObject__PropertiesAssignment_1_1_1"
    // InternalPdfMk.g:8791:1: rule__ListObject__PropertiesAssignment_1_1_1 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8795:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:8796:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:8796:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:8797:3: ruleListObjectPropertiesWrapper
            {
             before(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListObjectPropertiesWrapper();

            state._fsp--;

             after(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__PropertiesAssignment_1_1_1"


    // $ANTLR start "rule__ListObject__ElementsAssignment_5_0"
    // InternalPdfMk.g:8806:1: rule__ListObject__ElementsAssignment_5_0 : ( ruleListElements ) ;
    public final void rule__ListObject__ElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8810:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:8811:2: ( ruleListElements )
            {
            // InternalPdfMk.g:8811:2: ( ruleListElements )
            // InternalPdfMk.g:8812:3: ruleListElements
            {
             before(grammarAccess.getListObjectAccess().getElementsListElementsParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListElements();

            state._fsp--;

             after(grammarAccess.getListObjectAccess().getElementsListElementsParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__ElementsAssignment_5_0"


    // $ANTLR start "rule__ListObject__ElemtensAssignment_5_1_1"
    // InternalPdfMk.g:8821:1: rule__ListObject__ElemtensAssignment_5_1_1 : ( ruleListElements ) ;
    public final void rule__ListObject__ElemtensAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8825:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:8826:2: ( ruleListElements )
            {
            // InternalPdfMk.g:8826:2: ( ruleListElements )
            // InternalPdfMk.g:8827:3: ruleListElements
            {
             before(grammarAccess.getListObjectAccess().getElemtensListElementsParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListElements();

            state._fsp--;

             after(grammarAccess.getListObjectAccess().getElemtensListElementsParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__ElemtensAssignment_5_1_1"


    // $ANTLR start "rule__ContentObject__ValueAssignment"
    // InternalPdfMk.g:8836:1: rule__ContentObject__ValueAssignment : ( ( rule__ContentObject__ValueAlternatives_0 ) ) ;
    public final void rule__ContentObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8840:1: ( ( ( rule__ContentObject__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:8841:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:8841:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            // InternalPdfMk.g:8842:3: ( rule__ContentObject__ValueAlternatives_0 )
            {
             before(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:8843:3: ( rule__ContentObject__ValueAlternatives_0 )
            // InternalPdfMk.g:8843:4: rule__ContentObject__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ContentObject__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObject__ValueAssignment"


    // $ANTLR start "rule__ContentObjects__ValueAssignment_1_0"
    // InternalPdfMk.g:8851:1: rule__ContentObjects__ValueAssignment_1_0 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8855:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:8856:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:8856:2: ( ruleContentObject )
            // InternalPdfMk.g:8857:3: ruleContentObject
            {
             before(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContentObject();

            state._fsp--;

             after(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__ValueAssignment_1_0"


    // $ANTLR start "rule__ContentObjects__ValueAssignment_1_1_1"
    // InternalPdfMk.g:8866:1: rule__ContentObjects__ValueAssignment_1_1_1 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8870:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:8871:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:8871:2: ( ruleContentObject )
            // InternalPdfMk.g:8872:3: ruleContentObject
            {
             before(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentObject();

            state._fsp--;

             after(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__ValueAssignment_1_1_1"


    // $ANTLR start "rule__Styles__KeyAssignment_0"
    // InternalPdfMk.g:8881:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8885:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:8886:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:8886:2: ( ( 'styles' ) )
            // InternalPdfMk.g:8887:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:8888:3: ( 'styles' )
            // InternalPdfMk.g:8889:4: 'styles'
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 

            }

             after(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__KeyAssignment_0"


    // $ANTLR start "rule__Styles__ValueAssignment_2"
    // InternalPdfMk.g:8900:1: rule__Styles__ValueAssignment_2 : ( ruleStyleObjects ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8904:1: ( ( ruleStyleObjects ) )
            // InternalPdfMk.g:8905:2: ( ruleStyleObjects )
            {
            // InternalPdfMk.g:8905:2: ( ruleStyleObjects )
            // InternalPdfMk.g:8906:3: ruleStyleObjects
            {
             before(grammarAccess.getStylesAccess().getValueStyleObjectsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObjects();

            state._fsp--;

             after(grammarAccess.getStylesAccess().getValueStyleObjectsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__ValueAssignment_2"


    // $ANTLR start "rule__Content__KeyAssignment_0"
    // InternalPdfMk.g:8915:1: rule__Content__KeyAssignment_0 : ( ( 'content' ) ) ;
    public final void rule__Content__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8919:1: ( ( ( 'content' ) ) )
            // InternalPdfMk.g:8920:2: ( ( 'content' ) )
            {
            // InternalPdfMk.g:8920:2: ( ( 'content' ) )
            // InternalPdfMk.g:8921:3: ( 'content' )
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            // InternalPdfMk.g:8922:3: ( 'content' )
            // InternalPdfMk.g:8923:4: 'content'
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 

            }

             after(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__KeyAssignment_0"


    // $ANTLR start "rule__Content__ValueAssignment_2"
    // InternalPdfMk.g:8934:1: rule__Content__ValueAssignment_2 : ( ruleContentObjects ) ;
    public final void rule__Content__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8938:1: ( ( ruleContentObjects ) )
            // InternalPdfMk.g:8939:2: ( ruleContentObjects )
            {
            // InternalPdfMk.g:8939:2: ( ruleContentObjects )
            // InternalPdfMk.g:8940:3: ruleContentObjects
            {
             before(grammarAccess.getContentAccess().getValueContentObjectsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContentObjects();

            state._fsp--;

             after(grammarAccess.getContentAccess().getValueContentObjectsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000007C000006000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001040020L});

}