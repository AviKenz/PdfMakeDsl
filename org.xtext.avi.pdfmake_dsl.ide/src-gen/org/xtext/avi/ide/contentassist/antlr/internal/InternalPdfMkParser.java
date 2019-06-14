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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ul'", "'ol'", "'var'", "'dd'", "'='", "'{'", "'}'", "','", "':'", "'alignment'", "'['", "']'", "'bold'", "'style'", "'text'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'body'", "'table'", "'styles'", "'content'"
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
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalPdfMk.g:212:1: ruleTextDefinition : ( ( rule__TextDefinition__Group__0 ) ) ;
    public final void ruleTextDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:216:2: ( ( ( rule__TextDefinition__Group__0 ) ) )
            // InternalPdfMk.g:217:2: ( ( rule__TextDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:217:2: ( ( rule__TextDefinition__Group__0 ) )
            // InternalPdfMk.g:218:3: ( rule__TextDefinition__Group__0 )
            {
             before(grammarAccess.getTextDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:219:3: ( rule__TextDefinition__Group__0 )
            // InternalPdfMk.g:219:4: rule__TextDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextDefinitionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTableCellItemElements"
    // InternalPdfMk.g:653:1: entryRuleTableCellItemElements : ruleTableCellItemElements EOF ;
    public final void entryRuleTableCellItemElements() throws RecognitionException {
        try {
            // InternalPdfMk.g:654:1: ( ruleTableCellItemElements EOF )
            // InternalPdfMk.g:655:1: ruleTableCellItemElements EOF
            {
             before(grammarAccess.getTableCellItemElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleTableCellItemElements();

            state._fsp--;

             after(grammarAccess.getTableCellItemElementsRule()); 
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
    // $ANTLR end "entryRuleTableCellItemElements"


    // $ANTLR start "ruleTableCellItemElements"
    // InternalPdfMk.g:662:1: ruleTableCellItemElements : ( ( rule__TableCellItemElements__ElementsAssignment ) ) ;
    public final void ruleTableCellItemElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:666:2: ( ( ( rule__TableCellItemElements__ElementsAssignment ) ) )
            // InternalPdfMk.g:667:2: ( ( rule__TableCellItemElements__ElementsAssignment ) )
            {
            // InternalPdfMk.g:667:2: ( ( rule__TableCellItemElements__ElementsAssignment ) )
            // InternalPdfMk.g:668:3: ( rule__TableCellItemElements__ElementsAssignment )
            {
             before(grammarAccess.getTableCellItemElementsAccess().getElementsAssignment()); 
            // InternalPdfMk.g:669:3: ( rule__TableCellItemElements__ElementsAssignment )
            // InternalPdfMk.g:669:4: rule__TableCellItemElements__ElementsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TableCellItemElements__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableCellItemElementsAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableCellItemElements"


    // $ANTLR start "entryRuleTableRowDefinition"
    // InternalPdfMk.g:678:1: entryRuleTableRowDefinition : ruleTableRowDefinition EOF ;
    public final void entryRuleTableRowDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:679:1: ( ruleTableRowDefinition EOF )
            // InternalPdfMk.g:680:1: ruleTableRowDefinition EOF
            {
             before(grammarAccess.getTableRowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTableRowDefinition();

            state._fsp--;

             after(grammarAccess.getTableRowDefinitionRule()); 
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
    // $ANTLR end "entryRuleTableRowDefinition"


    // $ANTLR start "ruleTableRowDefinition"
    // InternalPdfMk.g:687:1: ruleTableRowDefinition : ( ( rule__TableRowDefinition__Group__0 ) ) ;
    public final void ruleTableRowDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:691:2: ( ( ( rule__TableRowDefinition__Group__0 ) ) )
            // InternalPdfMk.g:692:2: ( ( rule__TableRowDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:692:2: ( ( rule__TableRowDefinition__Group__0 ) )
            // InternalPdfMk.g:693:3: ( rule__TableRowDefinition__Group__0 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:694:3: ( rule__TableRowDefinition__Group__0 )
            // InternalPdfMk.g:694:4: rule__TableRowDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableRowDefinition"


    // $ANTLR start "entryRuleTableBodyDefinition"
    // InternalPdfMk.g:703:1: entryRuleTableBodyDefinition : ruleTableBodyDefinition EOF ;
    public final void entryRuleTableBodyDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:704:1: ( ruleTableBodyDefinition EOF )
            // InternalPdfMk.g:705:1: ruleTableBodyDefinition EOF
            {
             before(grammarAccess.getTableBodyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTableBodyDefinition();

            state._fsp--;

             after(grammarAccess.getTableBodyDefinitionRule()); 
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
    // $ANTLR end "entryRuleTableBodyDefinition"


    // $ANTLR start "ruleTableBodyDefinition"
    // InternalPdfMk.g:712:1: ruleTableBodyDefinition : ( ( rule__TableBodyDefinition__Group__0 ) ) ;
    public final void ruleTableBodyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:716:2: ( ( ( rule__TableBodyDefinition__Group__0 ) ) )
            // InternalPdfMk.g:717:2: ( ( rule__TableBodyDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:717:2: ( ( rule__TableBodyDefinition__Group__0 ) )
            // InternalPdfMk.g:718:3: ( rule__TableBodyDefinition__Group__0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:719:3: ( rule__TableBodyDefinition__Group__0 )
            // InternalPdfMk.g:719:4: rule__TableBodyDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableBodyDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableBodyDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // InternalPdfMk.g:728:1: entryRuleTableDefinition : ruleTableDefinition EOF ;
    public final void entryRuleTableDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:729:1: ( ruleTableDefinition EOF )
            // InternalPdfMk.g:730:1: ruleTableDefinition EOF
            {
             before(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTableDefinition();

            state._fsp--;

             after(grammarAccess.getTableDefinitionRule()); 
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
    // $ANTLR end "entryRuleTableDefinition"


    // $ANTLR start "ruleTableDefinition"
    // InternalPdfMk.g:737:1: ruleTableDefinition : ( ( rule__TableDefinition__Group__0 ) ) ;
    public final void ruleTableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:741:2: ( ( ( rule__TableDefinition__Group__0 ) ) )
            // InternalPdfMk.g:742:2: ( ( rule__TableDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:742:2: ( ( rule__TableDefinition__Group__0 ) )
            // InternalPdfMk.g:743:3: ( rule__TableDefinition__Group__0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:744:3: ( rule__TableDefinition__Group__0 )
            // InternalPdfMk.g:744:4: rule__TableDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:753:1: entryRuleTextObject : ruleTextObject EOF ;
    public final void entryRuleTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:754:1: ( ruleTextObject EOF )
            // InternalPdfMk.g:755:1: ruleTextObject EOF
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
    // InternalPdfMk.g:762:1: ruleTextObject : ( ( rule__TextObject__Group__0 ) ) ;
    public final void ruleTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:766:2: ( ( ( rule__TextObject__Group__0 ) ) )
            // InternalPdfMk.g:767:2: ( ( rule__TextObject__Group__0 ) )
            {
            // InternalPdfMk.g:767:2: ( ( rule__TextObject__Group__0 ) )
            // InternalPdfMk.g:768:3: ( rule__TextObject__Group__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup()); 
            // InternalPdfMk.g:769:3: ( rule__TextObject__Group__0 )
            // InternalPdfMk.g:769:4: rule__TextObject__Group__0
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
    // InternalPdfMk.g:778:1: entryRuleColumnTextObject : ruleColumnTextObject EOF ;
    public final void entryRuleColumnTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:779:1: ( ruleColumnTextObject EOF )
            // InternalPdfMk.g:780:1: ruleColumnTextObject EOF
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
    // InternalPdfMk.g:787:1: ruleColumnTextObject : ( ( rule__ColumnTextObject__ValueAssignment ) ) ;
    public final void ruleColumnTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:791:2: ( ( ( rule__ColumnTextObject__ValueAssignment ) ) )
            // InternalPdfMk.g:792:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:792:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            // InternalPdfMk.g:793:3: ( rule__ColumnTextObject__ValueAssignment )
            {
             before(grammarAccess.getColumnTextObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:794:3: ( rule__ColumnTextObject__ValueAssignment )
            // InternalPdfMk.g:794:4: rule__ColumnTextObject__ValueAssignment
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
    // InternalPdfMk.g:803:1: entryRuleStyleObject : ruleStyleObject EOF ;
    public final void entryRuleStyleObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:804:1: ( ruleStyleObject EOF )
            // InternalPdfMk.g:805:1: ruleStyleObject EOF
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
    // InternalPdfMk.g:812:1: ruleStyleObject : ( ( rule__StyleObject__Group__0 ) ) ;
    public final void ruleStyleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:816:2: ( ( ( rule__StyleObject__Group__0 ) ) )
            // InternalPdfMk.g:817:2: ( ( rule__StyleObject__Group__0 ) )
            {
            // InternalPdfMk.g:817:2: ( ( rule__StyleObject__Group__0 ) )
            // InternalPdfMk.g:818:3: ( rule__StyleObject__Group__0 )
            {
             before(grammarAccess.getStyleObjectAccess().getGroup()); 
            // InternalPdfMk.g:819:3: ( rule__StyleObject__Group__0 )
            // InternalPdfMk.g:819:4: rule__StyleObject__Group__0
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
    // InternalPdfMk.g:828:1: entryRuleStyleObjects : ruleStyleObjects EOF ;
    public final void entryRuleStyleObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:829:1: ( ruleStyleObjects EOF )
            // InternalPdfMk.g:830:1: ruleStyleObjects EOF
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
    // InternalPdfMk.g:837:1: ruleStyleObjects : ( ( rule__StyleObjects__Group__0 ) ) ;
    public final void ruleStyleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:841:2: ( ( ( rule__StyleObjects__Group__0 ) ) )
            // InternalPdfMk.g:842:2: ( ( rule__StyleObjects__Group__0 ) )
            {
            // InternalPdfMk.g:842:2: ( ( rule__StyleObjects__Group__0 ) )
            // InternalPdfMk.g:843:3: ( rule__StyleObjects__Group__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup()); 
            // InternalPdfMk.g:844:3: ( rule__StyleObjects__Group__0 )
            // InternalPdfMk.g:844:4: rule__StyleObjects__Group__0
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
    // InternalPdfMk.g:853:1: entryRuleInnerColumnObject : ruleInnerColumnObject EOF ;
    public final void entryRuleInnerColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:854:1: ( ruleInnerColumnObject EOF )
            // InternalPdfMk.g:855:1: ruleInnerColumnObject EOF
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
    // InternalPdfMk.g:862:1: ruleInnerColumnObject : ( ( rule__InnerColumnObject__Group__0 ) ) ;
    public final void ruleInnerColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:866:2: ( ( ( rule__InnerColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:867:2: ( ( rule__InnerColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:867:2: ( ( rule__InnerColumnObject__Group__0 ) )
            // InternalPdfMk.g:868:3: ( rule__InnerColumnObject__Group__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:869:3: ( rule__InnerColumnObject__Group__0 )
            // InternalPdfMk.g:869:4: rule__InnerColumnObject__Group__0
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
    // InternalPdfMk.g:878:1: entryRuleColumnObject : ruleColumnObject EOF ;
    public final void entryRuleColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:879:1: ( ruleColumnObject EOF )
            // InternalPdfMk.g:880:1: ruleColumnObject EOF
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
    // InternalPdfMk.g:887:1: ruleColumnObject : ( ( rule__ColumnObject__Group__0 ) ) ;
    public final void ruleColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:891:2: ( ( ( rule__ColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:892:2: ( ( rule__ColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:892:2: ( ( rule__ColumnObject__Group__0 ) )
            // InternalPdfMk.g:893:3: ( rule__ColumnObject__Group__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:894:3: ( rule__ColumnObject__Group__0 )
            // InternalPdfMk.g:894:4: rule__ColumnObject__Group__0
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
    // InternalPdfMk.g:903:1: entryRuleImageObject : ruleImageObject EOF ;
    public final void entryRuleImageObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:904:1: ( ruleImageObject EOF )
            // InternalPdfMk.g:905:1: ruleImageObject EOF
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
    // InternalPdfMk.g:912:1: ruleImageObject : ( ( rule__ImageObject__Group__0 ) ) ;
    public final void ruleImageObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:916:2: ( ( ( rule__ImageObject__Group__0 ) ) )
            // InternalPdfMk.g:917:2: ( ( rule__ImageObject__Group__0 ) )
            {
            // InternalPdfMk.g:917:2: ( ( rule__ImageObject__Group__0 ) )
            // InternalPdfMk.g:918:3: ( rule__ImageObject__Group__0 )
            {
             before(grammarAccess.getImageObjectAccess().getGroup()); 
            // InternalPdfMk.g:919:3: ( rule__ImageObject__Group__0 )
            // InternalPdfMk.g:919:4: rule__ImageObject__Group__0
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
    // InternalPdfMk.g:928:1: entryRuleListObjectPropertiesWrapper : ruleListObjectPropertiesWrapper EOF ;
    public final void entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:929:1: ( ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:930:1: ruleListObjectPropertiesWrapper EOF
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
    // InternalPdfMk.g:937:1: ruleListObjectPropertiesWrapper : ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) ;
    public final void ruleListObjectPropertiesWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:941:2: ( ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) )
            // InternalPdfMk.g:942:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            {
            // InternalPdfMk.g:942:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            // InternalPdfMk.g:943:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAssignment()); 
            // InternalPdfMk.g:944:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            // InternalPdfMk.g:944:4: rule__ListObjectPropertiesWrapper__ValueAssignment
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
    // InternalPdfMk.g:953:1: entryRuleListElements : ruleListElements EOF ;
    public final void entryRuleListElements() throws RecognitionException {
        try {
            // InternalPdfMk.g:954:1: ( ruleListElements EOF )
            // InternalPdfMk.g:955:1: ruleListElements EOF
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
    // InternalPdfMk.g:962:1: ruleListElements : ( ( rule__ListElements__Alternatives ) ) ;
    public final void ruleListElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:966:2: ( ( ( rule__ListElements__Alternatives ) ) )
            // InternalPdfMk.g:967:2: ( ( rule__ListElements__Alternatives ) )
            {
            // InternalPdfMk.g:967:2: ( ( rule__ListElements__Alternatives ) )
            // InternalPdfMk.g:968:3: ( rule__ListElements__Alternatives )
            {
             before(grammarAccess.getListElementsAccess().getAlternatives()); 
            // InternalPdfMk.g:969:3: ( rule__ListElements__Alternatives )
            // InternalPdfMk.g:969:4: rule__ListElements__Alternatives
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
    // InternalPdfMk.g:978:1: entryRuleListObject : ruleListObject EOF ;
    public final void entryRuleListObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:979:1: ( ruleListObject EOF )
            // InternalPdfMk.g:980:1: ruleListObject EOF
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
    // InternalPdfMk.g:987:1: ruleListObject : ( ( rule__ListObject__Group__0 ) ) ;
    public final void ruleListObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:991:2: ( ( ( rule__ListObject__Group__0 ) ) )
            // InternalPdfMk.g:992:2: ( ( rule__ListObject__Group__0 ) )
            {
            // InternalPdfMk.g:992:2: ( ( rule__ListObject__Group__0 ) )
            // InternalPdfMk.g:993:3: ( rule__ListObject__Group__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup()); 
            // InternalPdfMk.g:994:3: ( rule__ListObject__Group__0 )
            // InternalPdfMk.g:994:4: rule__ListObject__Group__0
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


    // $ANTLR start "entryRuleTableObject"
    // InternalPdfMk.g:1003:1: entryRuleTableObject : ruleTableObject EOF ;
    public final void entryRuleTableObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1004:1: ( ruleTableObject EOF )
            // InternalPdfMk.g:1005:1: ruleTableObject EOF
            {
             before(grammarAccess.getTableObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleTableObject();

            state._fsp--;

             after(grammarAccess.getTableObjectRule()); 
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
    // $ANTLR end "entryRuleTableObject"


    // $ANTLR start "ruleTableObject"
    // InternalPdfMk.g:1012:1: ruleTableObject : ( ( rule__TableObject__Group__0 ) ) ;
    public final void ruleTableObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1016:2: ( ( ( rule__TableObject__Group__0 ) ) )
            // InternalPdfMk.g:1017:2: ( ( rule__TableObject__Group__0 ) )
            {
            // InternalPdfMk.g:1017:2: ( ( rule__TableObject__Group__0 ) )
            // InternalPdfMk.g:1018:3: ( rule__TableObject__Group__0 )
            {
             before(grammarAccess.getTableObjectAccess().getGroup()); 
            // InternalPdfMk.g:1019:3: ( rule__TableObject__Group__0 )
            // InternalPdfMk.g:1019:4: rule__TableObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableObject"


    // $ANTLR start "entryRuleContentObject"
    // InternalPdfMk.g:1028:1: entryRuleContentObject : ruleContentObject EOF ;
    public final void entryRuleContentObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1029:1: ( ruleContentObject EOF )
            // InternalPdfMk.g:1030:1: ruleContentObject EOF
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
    // InternalPdfMk.g:1037:1: ruleContentObject : ( ( rule__ContentObject__ValueAssignment ) ) ;
    public final void ruleContentObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1041:2: ( ( ( rule__ContentObject__ValueAssignment ) ) )
            // InternalPdfMk.g:1042:2: ( ( rule__ContentObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:1042:2: ( ( rule__ContentObject__ValueAssignment ) )
            // InternalPdfMk.g:1043:3: ( rule__ContentObject__ValueAssignment )
            {
             before(grammarAccess.getContentObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:1044:3: ( rule__ContentObject__ValueAssignment )
            // InternalPdfMk.g:1044:4: rule__ContentObject__ValueAssignment
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
    // InternalPdfMk.g:1053:1: entryRuleContentObjects : ruleContentObjects EOF ;
    public final void entryRuleContentObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:1054:1: ( ruleContentObjects EOF )
            // InternalPdfMk.g:1055:1: ruleContentObjects EOF
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
    // InternalPdfMk.g:1062:1: ruleContentObjects : ( ( rule__ContentObjects__Group__0 ) ) ;
    public final void ruleContentObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1066:2: ( ( ( rule__ContentObjects__Group__0 ) ) )
            // InternalPdfMk.g:1067:2: ( ( rule__ContentObjects__Group__0 ) )
            {
            // InternalPdfMk.g:1067:2: ( ( rule__ContentObjects__Group__0 ) )
            // InternalPdfMk.g:1068:3: ( rule__ContentObjects__Group__0 )
            {
             before(grammarAccess.getContentObjectsAccess().getGroup()); 
            // InternalPdfMk.g:1069:3: ( rule__ContentObjects__Group__0 )
            // InternalPdfMk.g:1069:4: rule__ContentObjects__Group__0
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
    // InternalPdfMk.g:1078:1: entryRuleStyles : ruleStyles EOF ;
    public final void entryRuleStyles() throws RecognitionException {
        try {
            // InternalPdfMk.g:1079:1: ( ruleStyles EOF )
            // InternalPdfMk.g:1080:1: ruleStyles EOF
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
    // InternalPdfMk.g:1087:1: ruleStyles : ( ( rule__Styles__Group__0 ) ) ;
    public final void ruleStyles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1091:2: ( ( ( rule__Styles__Group__0 ) ) )
            // InternalPdfMk.g:1092:2: ( ( rule__Styles__Group__0 ) )
            {
            // InternalPdfMk.g:1092:2: ( ( rule__Styles__Group__0 ) )
            // InternalPdfMk.g:1093:3: ( rule__Styles__Group__0 )
            {
             before(grammarAccess.getStylesAccess().getGroup()); 
            // InternalPdfMk.g:1094:3: ( rule__Styles__Group__0 )
            // InternalPdfMk.g:1094:4: rule__Styles__Group__0
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
    // InternalPdfMk.g:1103:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:1104:1: ( ruleContent EOF )
            // InternalPdfMk.g:1105:1: ruleContent EOF
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
    // InternalPdfMk.g:1112:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1116:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPdfMk.g:1117:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPdfMk.g:1117:2: ( ( rule__Content__Group__0 ) )
            // InternalPdfMk.g:1118:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPdfMk.g:1119:3: ( rule__Content__Group__0 )
            // InternalPdfMk.g:1119:4: rule__Content__Group__0
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
    // InternalPdfMk.g:1127:1: rule__BooleanType__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1131:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalPdfMk.g:1132:2: ( 'true' )
                    {
                    // InternalPdfMk.g:1132:2: ( 'true' )
                    // InternalPdfMk.g:1133:3: 'true'
                    {
                     before(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1138:2: ( 'false' )
                    {
                    // InternalPdfMk.g:1138:2: ( 'false' )
                    // InternalPdfMk.g:1139:3: 'false'
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


    // $ANTLR start "rule__TableCellItemElements__ElementsAlternatives_0"
    // InternalPdfMk.g:1148:1: rule__TableCellItemElements__ElementsAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );
    public final void rule__TableCellItemElements__ElementsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1152:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt2=2;
                    }
                    break;
                case 13:
                case 14:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    {
                    alt2=4;
                    }
                    break;
                case 19:
                case 20:
                case 33:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:1153:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1153:2: ( ruleStringObject )
                    // InternalPdfMk.g:1154:3: ruleStringObject
                    {
                     before(grammarAccess.getTableCellItemElementsAccess().getElementsStringObjectParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringObject();

                    state._fsp--;

                     after(grammarAccess.getTableCellItemElementsAccess().getElementsStringObjectParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1159:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1159:2: ( ruleTextObject )
                    // InternalPdfMk.g:1160:3: ruleTextObject
                    {
                     before(grammarAccess.getTableCellItemElementsAccess().getElementsTextObjectParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextObject();

                    state._fsp--;

                     after(grammarAccess.getTableCellItemElementsAccess().getElementsTextObjectParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1165:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1165:2: ( ruleImageObject )
                    // InternalPdfMk.g:1166:3: ruleImageObject
                    {
                     before(grammarAccess.getTableCellItemElementsAccess().getElementsImageObjectParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImageObject();

                    state._fsp--;

                     after(grammarAccess.getTableCellItemElementsAccess().getElementsImageObjectParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1171:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1171:2: ( ruleListObject )
                    // InternalPdfMk.g:1172:3: ruleListObject
                    {
                     before(grammarAccess.getTableCellItemElementsAccess().getElementsListObjectParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleListObject();

                    state._fsp--;

                     after(grammarAccess.getTableCellItemElementsAccess().getElementsListObjectParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__TableCellItemElements__ElementsAlternatives_0"


    // $ANTLR start "rule__ListObjectPropertiesWrapper__ValueAlternatives_0"
    // InternalPdfMk.g:1181:1: rule__ListObjectPropertiesWrapper__ValueAlternatives_0 : ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) );
    public final void rule__ListObjectPropertiesWrapper__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1185:1: ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) )
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
                    // InternalPdfMk.g:1186:2: ( ruleListReversedDefinition )
                    {
                    // InternalPdfMk.g:1186:2: ( ruleListReversedDefinition )
                    // InternalPdfMk.g:1187:3: ruleListReversedDefinition
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
                    // InternalPdfMk.g:1192:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1192:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1193:3: ruleListCounterDefinition
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
                    // InternalPdfMk.g:1198:2: ( ruleListTypeDefinition )
                    {
                    // InternalPdfMk.g:1198:2: ( ruleListTypeDefinition )
                    // InternalPdfMk.g:1199:3: ruleListTypeDefinition
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
                    // InternalPdfMk.g:1204:2: ( ruleListColorDefinition )
                    {
                    // InternalPdfMk.g:1204:2: ( ruleListColorDefinition )
                    // InternalPdfMk.g:1205:3: ruleListColorDefinition
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
                    // InternalPdfMk.g:1210:2: ( ruleListMarkerColorDefinition )
                    {
                    // InternalPdfMk.g:1210:2: ( ruleListMarkerColorDefinition )
                    // InternalPdfMk.g:1211:3: ruleListMarkerColorDefinition
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
    // InternalPdfMk.g:1220:1: rule__ListElements__Alternatives : ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) );
    public final void rule__ListElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1224:1: ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==26||LA4_2==31) ) {
                    alt4=3;
                }
                else if ( (LA4_2==27) ) {
                    alt4=2;
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
                    // InternalPdfMk.g:1225:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    {
                    // InternalPdfMk.g:1225:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    // InternalPdfMk.g:1226:3: ( rule__ListElements__ElValuesAssignment_0 )
                    {
                     before(grammarAccess.getListElementsAccess().getElValuesAssignment_0()); 
                    // InternalPdfMk.g:1227:3: ( rule__ListElements__ElValuesAssignment_0 )
                    // InternalPdfMk.g:1227:4: rule__ListElements__ElValuesAssignment_0
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
                    // InternalPdfMk.g:1231:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1231:2: ( ruleTextObject )
                    // InternalPdfMk.g:1232:3: ruleTextObject
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
                    // InternalPdfMk.g:1237:2: ( ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1237:2: ( ruleColumnDefinition )
                    // InternalPdfMk.g:1238:3: ruleColumnDefinition
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
    // InternalPdfMk.g:1247:1: rule__ListObject__Alternatives_2 : ( ( 'ul' ) | ( 'ol' ) );
    public final void rule__ListObject__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1251:1: ( ( 'ul' ) | ( 'ol' ) )
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
                    // InternalPdfMk.g:1252:2: ( 'ul' )
                    {
                    // InternalPdfMk.g:1252:2: ( 'ul' )
                    // InternalPdfMk.g:1253:3: 'ul'
                    {
                     before(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1258:2: ( 'ol' )
                    {
                    // InternalPdfMk.g:1258:2: ( 'ol' )
                    // InternalPdfMk.g:1259:3: 'ol'
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
    // InternalPdfMk.g:1268:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );
    public final void rule__ContentObject__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1272:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:1273:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1273:2: ( ruleStringObject )
                    // InternalPdfMk.g:1274:3: ruleStringObject
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
                    // InternalPdfMk.g:1279:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1279:2: ( ruleTextObject )
                    // InternalPdfMk.g:1280:3: ruleTextObject
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
                    // InternalPdfMk.g:1285:2: ( ruleColumnTextObject )
                    {
                    // InternalPdfMk.g:1285:2: ( ruleColumnTextObject )
                    // InternalPdfMk.g:1286:3: ruleColumnTextObject
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
                    // InternalPdfMk.g:1291:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1291:2: ( ruleImageObject )
                    // InternalPdfMk.g:1292:3: ruleImageObject
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
                    // InternalPdfMk.g:1297:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1297:2: ( ruleListObject )
                    // InternalPdfMk.g:1298:3: ruleListObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueListObjectParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueListObjectParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPdfMk.g:1303:2: ( ruleTableObject )
                    {
                    // InternalPdfMk.g:1303:2: ( ruleTableObject )
                    // InternalPdfMk.g:1304:3: ruleTableObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueTableObjectParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTableObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueTableObjectParserRuleCall_0_5()); 

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
    // InternalPdfMk.g:1313:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1317:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:1318:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
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
    // InternalPdfMk.g:1325:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1329:1: ( ( 'var' ) )
            // InternalPdfMk.g:1330:1: ( 'var' )
            {
            // InternalPdfMk.g:1330:1: ( 'var' )
            // InternalPdfMk.g:1331:2: 'var'
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
    // InternalPdfMk.g:1340:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1344:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:1345:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
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
    // InternalPdfMk.g:1352:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1356:1: ( ( 'dd' ) )
            // InternalPdfMk.g:1357:1: ( 'dd' )
            {
            // InternalPdfMk.g:1357:1: ( 'dd' )
            // InternalPdfMk.g:1358:2: 'dd'
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
    // InternalPdfMk.g:1367:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1371:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:1372:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
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
    // InternalPdfMk.g:1379:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1383:1: ( ( '=' ) )
            // InternalPdfMk.g:1384:1: ( '=' )
            {
            // InternalPdfMk.g:1384:1: ( '=' )
            // InternalPdfMk.g:1385:2: '='
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
    // InternalPdfMk.g:1394:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1398:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:1399:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
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
    // InternalPdfMk.g:1406:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1410:1: ( ( '{' ) )
            // InternalPdfMk.g:1411:1: ( '{' )
            {
            // InternalPdfMk.g:1411:1: ( '{' )
            // InternalPdfMk.g:1412:2: '{'
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
    // InternalPdfMk.g:1421:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1425:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:1426:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
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
    // InternalPdfMk.g:1433:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1437:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:1438:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:1438:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:1439:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:1440:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:1440:3: rule__DocDefinition__ContentAssignment_4
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
    // InternalPdfMk.g:1448:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1452:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:1453:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
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
    // InternalPdfMk.g:1460:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1464:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:1465:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:1465:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:1466:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:1467:2: ( rule__DocDefinition__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1467:3: rule__DocDefinition__Group_5__0
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
    // InternalPdfMk.g:1475:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1479:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:1480:2: rule__DocDefinition__Group__6__Impl
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
    // InternalPdfMk.g:1486:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1490:1: ( ( '}' ) )
            // InternalPdfMk.g:1491:1: ( '}' )
            {
            // InternalPdfMk.g:1491:1: ( '}' )
            // InternalPdfMk.g:1492:2: '}'
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
    // InternalPdfMk.g:1502:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1506:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:1507:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
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
    // InternalPdfMk.g:1514:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1518:1: ( ( ',' ) )
            // InternalPdfMk.g:1519:1: ( ',' )
            {
            // InternalPdfMk.g:1519:1: ( ',' )
            // InternalPdfMk.g:1520:2: ','
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
    // InternalPdfMk.g:1529:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1533:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:1534:2: rule__DocDefinition__Group_5__1__Impl
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
    // InternalPdfMk.g:1540:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1544:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:1545:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:1545:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:1546:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:1547:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:1547:3: rule__DocDefinition__StylesAssignment_5_1
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
    // InternalPdfMk.g:1556:1: rule__TypeFaceDefinition__Group__0 : rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 ;
    public final void rule__TypeFaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1560:1: ( rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 )
            // InternalPdfMk.g:1561:2: rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1
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
    // InternalPdfMk.g:1568:1: rule__TypeFaceDefinition__Group__0__Impl : ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TypeFaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1572:1: ( ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1573:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1573:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1574:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1575:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1575:3: rule__TypeFaceDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1583:1: rule__TypeFaceDefinition__Group__1 : rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 ;
    public final void rule__TypeFaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1587:1: ( rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 )
            // InternalPdfMk.g:1588:2: rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2
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
    // InternalPdfMk.g:1595:1: rule__TypeFaceDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeFaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1599:1: ( ( ':' ) )
            // InternalPdfMk.g:1600:1: ( ':' )
            {
            // InternalPdfMk.g:1600:1: ( ':' )
            // InternalPdfMk.g:1601:2: ':'
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
    // InternalPdfMk.g:1610:1: rule__TypeFaceDefinition__Group__2 : rule__TypeFaceDefinition__Group__2__Impl ;
    public final void rule__TypeFaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1614:1: ( rule__TypeFaceDefinition__Group__2__Impl )
            // InternalPdfMk.g:1615:2: rule__TypeFaceDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1621:1: rule__TypeFaceDefinition__Group__2__Impl : ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TypeFaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1625:1: ( ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1626:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1626:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1627:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1628:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1628:3: rule__TypeFaceDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1637:1: rule__TextStyleDefinition__Group__0 : rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 ;
    public final void rule__TextStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1641:1: ( rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 )
            // InternalPdfMk.g:1642:2: rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1
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
    // InternalPdfMk.g:1649:1: rule__TextStyleDefinition__Group__0__Impl : ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1653:1: ( ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1654:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1654:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1655:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1656:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1656:3: rule__TextStyleDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1664:1: rule__TextStyleDefinition__Group__1 : rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 ;
    public final void rule__TextStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1668:1: ( rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 )
            // InternalPdfMk.g:1669:2: rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2
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
    // InternalPdfMk.g:1676:1: rule__TextStyleDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1680:1: ( ( ':' ) )
            // InternalPdfMk.g:1681:1: ( ':' )
            {
            // InternalPdfMk.g:1681:1: ( ':' )
            // InternalPdfMk.g:1682:2: ':'
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
    // InternalPdfMk.g:1691:1: rule__TextStyleDefinition__Group__2 : rule__TextStyleDefinition__Group__2__Impl ;
    public final void rule__TextStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1695:1: ( rule__TextStyleDefinition__Group__2__Impl )
            // InternalPdfMk.g:1696:2: rule__TextStyleDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1702:1: rule__TextStyleDefinition__Group__2__Impl : ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1706:1: ( ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1707:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1707:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1708:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1709:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1709:3: rule__TextStyleDefinition__ValueAssignment_2
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


    // $ANTLR start "rule__TextDefinition__Group__0"
    // InternalPdfMk.g:1718:1: rule__TextDefinition__Group__0 : rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1 ;
    public final void rule__TextDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1722:1: ( rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1 )
            // InternalPdfMk.g:1723:2: rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TextDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group__0"


    // $ANTLR start "rule__TextDefinition__Group__0__Impl"
    // InternalPdfMk.g:1730:1: rule__TextDefinition__Group__0__Impl : ( ( rule__TextDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1734:1: ( ( ( rule__TextDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1735:1: ( ( rule__TextDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1735:1: ( ( rule__TextDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1736:2: ( rule__TextDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1737:2: ( rule__TextDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1737:3: rule__TextDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group__0__Impl"


    // $ANTLR start "rule__TextDefinition__Group__1"
    // InternalPdfMk.g:1745:1: rule__TextDefinition__Group__1 : rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2 ;
    public final void rule__TextDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1749:1: ( rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2 )
            // InternalPdfMk.g:1750:2: rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TextDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group__1"


    // $ANTLR start "rule__TextDefinition__Group__1__Impl"
    // InternalPdfMk.g:1757:1: rule__TextDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1761:1: ( ( ':' ) )
            // InternalPdfMk.g:1762:1: ( ':' )
            {
            // InternalPdfMk.g:1762:1: ( ':' )
            // InternalPdfMk.g:1763:2: ':'
            {
             before(grammarAccess.getTextDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextDefinition__Group__2"
    // InternalPdfMk.g:1772:1: rule__TextDefinition__Group__2 : rule__TextDefinition__Group__2__Impl ;
    public final void rule__TextDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1776:1: ( rule__TextDefinition__Group__2__Impl )
            // InternalPdfMk.g:1777:2: rule__TextDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group__2"


    // $ANTLR start "rule__TextDefinition__Group__2__Impl"
    // InternalPdfMk.g:1783:1: rule__TextDefinition__Group__2__Impl : ( ( rule__TextDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1787:1: ( ( ( rule__TextDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1788:1: ( ( rule__TextDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1788:1: ( ( rule__TextDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1789:2: ( rule__TextDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1790:2: ( rule__TextDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1790:3: rule__TextDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TextDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__Group__2__Impl"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__0"
    // InternalPdfMk.g:1799:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1803:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:1804:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
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
    // InternalPdfMk.g:1811:1: rule__TextAlignmentDefinition__Group__0__Impl : ( 'alignment' ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1815:1: ( ( 'alignment' ) )
            // InternalPdfMk.g:1816:1: ( 'alignment' )
            {
            // InternalPdfMk.g:1816:1: ( 'alignment' )
            // InternalPdfMk.g:1817:2: 'alignment'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getAlignmentKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:1826:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1830:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:1831:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
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
    // InternalPdfMk.g:1838:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1842:1: ( ( ':' ) )
            // InternalPdfMk.g:1843:1: ( ':' )
            {
            // InternalPdfMk.g:1843:1: ( ':' )
            // InternalPdfMk.g:1844:2: ':'
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
    // InternalPdfMk.g:1853:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1857:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:1858:2: rule__TextAlignmentDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1864:1: rule__TextAlignmentDefinition__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1868:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1869:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1869:1: ( RULE_STRING )
            // InternalPdfMk.g:1870:2: RULE_STRING
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
    // InternalPdfMk.g:1880:1: rule__ItalicsDefinition__Group__0 : rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 ;
    public final void rule__ItalicsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1884:1: ( rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 )
            // InternalPdfMk.g:1885:2: rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1
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
    // InternalPdfMk.g:1892:1: rule__ItalicsDefinition__Group__0__Impl : ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ItalicsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1896:1: ( ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1897:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1897:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1898:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1899:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1899:3: rule__ItalicsDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1907:1: rule__ItalicsDefinition__Group__1 : rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 ;
    public final void rule__ItalicsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1911:1: ( rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 )
            // InternalPdfMk.g:1912:2: rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2
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
    // InternalPdfMk.g:1919:1: rule__ItalicsDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ItalicsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1923:1: ( ( ':' ) )
            // InternalPdfMk.g:1924:1: ( ':' )
            {
            // InternalPdfMk.g:1924:1: ( ':' )
            // InternalPdfMk.g:1925:2: ':'
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
    // InternalPdfMk.g:1934:1: rule__ItalicsDefinition__Group__2 : rule__ItalicsDefinition__Group__2__Impl ;
    public final void rule__ItalicsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1938:1: ( rule__ItalicsDefinition__Group__2__Impl )
            // InternalPdfMk.g:1939:2: rule__ItalicsDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1945:1: rule__ItalicsDefinition__Group__2__Impl : ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ItalicsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1949:1: ( ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1950:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1950:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1951:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1952:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1952:3: rule__ItalicsDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1961:1: rule__FontSizeDefinition__Group__0 : rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 ;
    public final void rule__FontSizeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1965:1: ( rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 )
            // InternalPdfMk.g:1966:2: rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1
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
    // InternalPdfMk.g:1973:1: rule__FontSizeDefinition__Group__0__Impl : ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__FontSizeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1977:1: ( ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1978:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1978:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1979:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1980:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1980:3: rule__FontSizeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1988:1: rule__FontSizeDefinition__Group__1 : rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 ;
    public final void rule__FontSizeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1992:1: ( rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 )
            // InternalPdfMk.g:1993:2: rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:2000:1: rule__FontSizeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FontSizeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2004:1: ( ( ':' ) )
            // InternalPdfMk.g:2005:1: ( ':' )
            {
            // InternalPdfMk.g:2005:1: ( ':' )
            // InternalPdfMk.g:2006:2: ':'
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
    // InternalPdfMk.g:2015:1: rule__FontSizeDefinition__Group__2 : rule__FontSizeDefinition__Group__2__Impl ;
    public final void rule__FontSizeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2019:1: ( rule__FontSizeDefinition__Group__2__Impl )
            // InternalPdfMk.g:2020:2: rule__FontSizeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2026:1: rule__FontSizeDefinition__Group__2__Impl : ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__FontSizeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2030:1: ( ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2031:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2031:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2032:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2033:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2033:3: rule__FontSizeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2042:1: rule__WidthDefinition__Group__0 : rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 ;
    public final void rule__WidthDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2046:1: ( rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 )
            // InternalPdfMk.g:2047:2: rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1
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
    // InternalPdfMk.g:2054:1: rule__WidthDefinition__Group__0__Impl : ( ( rule__WidthDefinition__KeyAssignment_0 ) ) ;
    public final void rule__WidthDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2058:1: ( ( ( rule__WidthDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2059:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2059:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2060:2: ( rule__WidthDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2061:2: ( rule__WidthDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2061:3: rule__WidthDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2069:1: rule__WidthDefinition__Group__1 : rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 ;
    public final void rule__WidthDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2073:1: ( rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 )
            // InternalPdfMk.g:2074:2: rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:2081:1: rule__WidthDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WidthDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2085:1: ( ( ':' ) )
            // InternalPdfMk.g:2086:1: ( ':' )
            {
            // InternalPdfMk.g:2086:1: ( ':' )
            // InternalPdfMk.g:2087:2: ':'
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
    // InternalPdfMk.g:2096:1: rule__WidthDefinition__Group__2 : rule__WidthDefinition__Group__2__Impl ;
    public final void rule__WidthDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2100:1: ( rule__WidthDefinition__Group__2__Impl )
            // InternalPdfMk.g:2101:2: rule__WidthDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2107:1: rule__WidthDefinition__Group__2__Impl : ( ( rule__WidthDefinition__ValueAssignment_2 ) ) ;
    public final void rule__WidthDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2111:1: ( ( ( rule__WidthDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2112:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2112:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2113:2: ( rule__WidthDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2114:2: ( rule__WidthDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2114:3: rule__WidthDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2123:1: rule__ColumnDefinition__Group__0 : rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 ;
    public final void rule__ColumnDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2127:1: ( rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 )
            // InternalPdfMk.g:2128:2: rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPdfMk.g:2135:1: rule__ColumnDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__ColumnDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2139:1: ( ( '{' ) )
            // InternalPdfMk.g:2140:1: ( '{' )
            {
            // InternalPdfMk.g:2140:1: ( '{' )
            // InternalPdfMk.g:2141:2: '{'
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
    // InternalPdfMk.g:2150:1: rule__ColumnDefinition__Group__1 : rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 ;
    public final void rule__ColumnDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2154:1: ( rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 )
            // InternalPdfMk.g:2155:2: rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalPdfMk.g:2162:1: rule__ColumnDefinition__Group__1__Impl : ( ( rule__ColumnDefinition__Group_1__0 )? ) ;
    public final void rule__ColumnDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2166:1: ( ( ( rule__ColumnDefinition__Group_1__0 )? ) )
            // InternalPdfMk.g:2167:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            {
            // InternalPdfMk.g:2167:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            // InternalPdfMk.g:2168:2: ( rule__ColumnDefinition__Group_1__0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_1()); 
            // InternalPdfMk.g:2169:2: ( rule__ColumnDefinition__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:2169:3: rule__ColumnDefinition__Group_1__0
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
    // InternalPdfMk.g:2177:1: rule__ColumnDefinition__Group__2 : rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 ;
    public final void rule__ColumnDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2181:1: ( rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 )
            // InternalPdfMk.g:2182:2: rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3
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
    // InternalPdfMk.g:2189:1: rule__ColumnDefinition__Group__2__Impl : ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) ;
    public final void rule__ColumnDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2193:1: ( ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) )
            // InternalPdfMk.g:2194:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            {
            // InternalPdfMk.g:2194:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            // InternalPdfMk.g:2195:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyAssignment_2()); 
            // InternalPdfMk.g:2196:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            // InternalPdfMk.g:2196:3: rule__ColumnDefinition__KeyAssignment_2
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
    // InternalPdfMk.g:2204:1: rule__ColumnDefinition__Group__3 : rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 ;
    public final void rule__ColumnDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2208:1: ( rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 )
            // InternalPdfMk.g:2209:2: rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalPdfMk.g:2216:1: rule__ColumnDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2220:1: ( ( ':' ) )
            // InternalPdfMk.g:2221:1: ( ':' )
            {
            // InternalPdfMk.g:2221:1: ( ':' )
            // InternalPdfMk.g:2222:2: ':'
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
    // InternalPdfMk.g:2231:1: rule__ColumnDefinition__Group__4 : rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 ;
    public final void rule__ColumnDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2235:1: ( rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 )
            // InternalPdfMk.g:2236:2: rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:2243:1: rule__ColumnDefinition__Group__4__Impl : ( ( rule__ColumnDefinition__Group_4__0 ) ) ;
    public final void rule__ColumnDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2247:1: ( ( ( rule__ColumnDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:2248:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:2248:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            // InternalPdfMk.g:2249:2: ( rule__ColumnDefinition__Group_4__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2250:2: ( rule__ColumnDefinition__Group_4__0 )
            // InternalPdfMk.g:2250:3: rule__ColumnDefinition__Group_4__0
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
    // InternalPdfMk.g:2258:1: rule__ColumnDefinition__Group__5 : rule__ColumnDefinition__Group__5__Impl ;
    public final void rule__ColumnDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2262:1: ( rule__ColumnDefinition__Group__5__Impl )
            // InternalPdfMk.g:2263:2: rule__ColumnDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2269:1: rule__ColumnDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ColumnDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2273:1: ( ( '}' ) )
            // InternalPdfMk.g:2274:1: ( '}' )
            {
            // InternalPdfMk.g:2274:1: ( '}' )
            // InternalPdfMk.g:2275:2: '}'
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
    // InternalPdfMk.g:2285:1: rule__ColumnDefinition__Group_1__0 : rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 ;
    public final void rule__ColumnDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2289:1: ( rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 )
            // InternalPdfMk.g:2290:2: rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:2297:1: rule__ColumnDefinition__Group_1__0__Impl : ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) ;
    public final void rule__ColumnDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2301:1: ( ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:2302:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:2302:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            // InternalPdfMk.g:2303:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGlobalStyleAssignment_1_0()); 
            // InternalPdfMk.g:2304:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            // InternalPdfMk.g:2304:3: rule__ColumnDefinition__GlobalStyleAssignment_1_0
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
    // InternalPdfMk.g:2312:1: rule__ColumnDefinition__Group_1__1 : rule__ColumnDefinition__Group_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2316:1: ( rule__ColumnDefinition__Group_1__1__Impl )
            // InternalPdfMk.g:2317:2: rule__ColumnDefinition__Group_1__1__Impl
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
    // InternalPdfMk.g:2323:1: rule__ColumnDefinition__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2327:1: ( ( ',' ) )
            // InternalPdfMk.g:2328:1: ( ',' )
            {
            // InternalPdfMk.g:2328:1: ( ',' )
            // InternalPdfMk.g:2329:2: ','
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
    // InternalPdfMk.g:2339:1: rule__ColumnDefinition__Group_4__0 : rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 ;
    public final void rule__ColumnDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2343:1: ( rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 )
            // InternalPdfMk.g:2344:2: rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPdfMk.g:2351:1: rule__ColumnDefinition__Group_4__0__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) ;
    public final void rule__ColumnDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2355:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) )
            // InternalPdfMk.g:2356:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            {
            // InternalPdfMk.g:2356:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            // InternalPdfMk.g:2357:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_0()); 
            // InternalPdfMk.g:2358:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:2358:3: rule__ColumnDefinition__ValueAssignment_4_0
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
    // InternalPdfMk.g:2366:1: rule__ColumnDefinition__Group_4__1 : rule__ColumnDefinition__Group_4__1__Impl ;
    public final void rule__ColumnDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2370:1: ( rule__ColumnDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2371:2: rule__ColumnDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2377:1: rule__ColumnDefinition__Group_4__1__Impl : ( ( rule__ColumnDefinition__Group_4_1__0 )* ) ;
    public final void rule__ColumnDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2381:1: ( ( ( rule__ColumnDefinition__Group_4_1__0 )* ) )
            // InternalPdfMk.g:2382:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:2382:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            // InternalPdfMk.g:2383:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4_1()); 
            // InternalPdfMk.g:2384:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPdfMk.g:2384:3: rule__ColumnDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:2393:1: rule__ColumnDefinition__Group_4_1__0 : rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 ;
    public final void rule__ColumnDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2397:1: ( rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 )
            // InternalPdfMk.g:2398:2: rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:2405:1: rule__ColumnDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2409:1: ( ( ',' ) )
            // InternalPdfMk.g:2410:1: ( ',' )
            {
            // InternalPdfMk.g:2410:1: ( ',' )
            // InternalPdfMk.g:2411:2: ','
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
    // InternalPdfMk.g:2420:1: rule__ColumnDefinition__Group_4_1__1 : rule__ColumnDefinition__Group_4_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2424:1: ( rule__ColumnDefinition__Group_4_1__1__Impl )
            // InternalPdfMk.g:2425:2: rule__ColumnDefinition__Group_4_1__1__Impl
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
    // InternalPdfMk.g:2431:1: rule__ColumnDefinition__Group_4_1__1__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) ;
    public final void rule__ColumnDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2435:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:2436:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:2436:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            // InternalPdfMk.g:2437:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_1_1()); 
            // InternalPdfMk.g:2438:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            // InternalPdfMk.g:2438:3: rule__ColumnDefinition__ValueAssignment_4_1_1
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
    // InternalPdfMk.g:2447:1: rule__MarginDefinition__Group__0 : rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 ;
    public final void rule__MarginDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2451:1: ( rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 )
            // InternalPdfMk.g:2452:2: rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1
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
    // InternalPdfMk.g:2459:1: rule__MarginDefinition__Group__0__Impl : ( ( rule__MarginDefinition__KeyAssignment_0 ) ) ;
    public final void rule__MarginDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2463:1: ( ( ( rule__MarginDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2464:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2464:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2465:2: ( rule__MarginDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2466:2: ( rule__MarginDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2466:3: rule__MarginDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2474:1: rule__MarginDefinition__Group__1 : rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 ;
    public final void rule__MarginDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2478:1: ( rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 )
            // InternalPdfMk.g:2479:2: rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:2486:1: rule__MarginDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MarginDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2490:1: ( ( ':' ) )
            // InternalPdfMk.g:2491:1: ( ':' )
            {
            // InternalPdfMk.g:2491:1: ( ':' )
            // InternalPdfMk.g:2492:2: ':'
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
    // InternalPdfMk.g:2501:1: rule__MarginDefinition__Group__2 : rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 ;
    public final void rule__MarginDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2505:1: ( rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 )
            // InternalPdfMk.g:2506:2: rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:2513:1: rule__MarginDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__MarginDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2517:1: ( ( '[' ) )
            // InternalPdfMk.g:2518:1: ( '[' )
            {
            // InternalPdfMk.g:2518:1: ( '[' )
            // InternalPdfMk.g:2519:2: '['
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
    // InternalPdfMk.g:2528:1: rule__MarginDefinition__Group__3 : rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 ;
    public final void rule__MarginDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2532:1: ( rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 )
            // InternalPdfMk.g:2533:2: rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:2540:1: rule__MarginDefinition__Group__3__Impl : ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) ;
    public final void rule__MarginDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2544:1: ( ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) )
            // InternalPdfMk.g:2545:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            {
            // InternalPdfMk.g:2545:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            // InternalPdfMk.g:2546:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:2547:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:2547:3: rule__MarginDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:2555:1: rule__MarginDefinition__Group__4 : rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 ;
    public final void rule__MarginDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2559:1: ( rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 )
            // InternalPdfMk.g:2560:2: rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:2567:1: rule__MarginDefinition__Group__4__Impl : ( ( rule__MarginDefinition__Group_4__0 )* ) ;
    public final void rule__MarginDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2571:1: ( ( ( rule__MarginDefinition__Group_4__0 )* ) )
            // InternalPdfMk.g:2572:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            {
            // InternalPdfMk.g:2572:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            // InternalPdfMk.g:2573:2: ( rule__MarginDefinition__Group_4__0 )*
            {
             before(grammarAccess.getMarginDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2574:2: ( rule__MarginDefinition__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPdfMk.g:2574:3: rule__MarginDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:2582:1: rule__MarginDefinition__Group__5 : rule__MarginDefinition__Group__5__Impl ;
    public final void rule__MarginDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2586:1: ( rule__MarginDefinition__Group__5__Impl )
            // InternalPdfMk.g:2587:2: rule__MarginDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2593:1: rule__MarginDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__MarginDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2597:1: ( ( ']' ) )
            // InternalPdfMk.g:2598:1: ( ']' )
            {
            // InternalPdfMk.g:2598:1: ( ']' )
            // InternalPdfMk.g:2599:2: ']'
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
    // InternalPdfMk.g:2609:1: rule__MarginDefinition__Group_4__0 : rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 ;
    public final void rule__MarginDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2613:1: ( rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 )
            // InternalPdfMk.g:2614:2: rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:2621:1: rule__MarginDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MarginDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2625:1: ( ( ',' ) )
            // InternalPdfMk.g:2626:1: ( ',' )
            {
            // InternalPdfMk.g:2626:1: ( ',' )
            // InternalPdfMk.g:2627:2: ','
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
    // InternalPdfMk.g:2636:1: rule__MarginDefinition__Group_4__1 : rule__MarginDefinition__Group_4__1__Impl ;
    public final void rule__MarginDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2640:1: ( rule__MarginDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2641:2: rule__MarginDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2647:1: rule__MarginDefinition__Group_4__1__Impl : ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__MarginDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2651:1: ( ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:2652:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:2652:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:2653:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:2654:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:2654:3: rule__MarginDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:2663:1: rule__ImageDefintion__Group__0 : rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 ;
    public final void rule__ImageDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2667:1: ( rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 )
            // InternalPdfMk.g:2668:2: rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1
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
    // InternalPdfMk.g:2675:1: rule__ImageDefintion__Group__0__Impl : ( ( rule__ImageDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2679:1: ( ( ( rule__ImageDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2680:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2680:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2681:2: ( rule__ImageDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2682:2: ( rule__ImageDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2682:3: rule__ImageDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2690:1: rule__ImageDefintion__Group__1 : rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 ;
    public final void rule__ImageDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2694:1: ( rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 )
            // InternalPdfMk.g:2695:2: rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2
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
    // InternalPdfMk.g:2702:1: rule__ImageDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2706:1: ( ( ':' ) )
            // InternalPdfMk.g:2707:1: ( ':' )
            {
            // InternalPdfMk.g:2707:1: ( ':' )
            // InternalPdfMk.g:2708:2: ':'
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
    // InternalPdfMk.g:2717:1: rule__ImageDefintion__Group__2 : rule__ImageDefintion__Group__2__Impl ;
    public final void rule__ImageDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2721:1: ( rule__ImageDefintion__Group__2__Impl )
            // InternalPdfMk.g:2722:2: rule__ImageDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2728:1: rule__ImageDefintion__Group__2__Impl : ( ( rule__ImageDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2732:1: ( ( ( rule__ImageDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2733:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2733:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2734:2: ( rule__ImageDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2735:2: ( rule__ImageDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2735:3: rule__ImageDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2744:1: rule__ImageWidthDefintion__Group__0 : rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 ;
    public final void rule__ImageWidthDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2748:1: ( rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 )
            // InternalPdfMk.g:2749:2: rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1
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
    // InternalPdfMk.g:2756:1: rule__ImageWidthDefintion__Group__0__Impl : ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageWidthDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2760:1: ( ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2761:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2761:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2762:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2763:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2763:3: rule__ImageWidthDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2771:1: rule__ImageWidthDefintion__Group__1 : rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 ;
    public final void rule__ImageWidthDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2775:1: ( rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 )
            // InternalPdfMk.g:2776:2: rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:2783:1: rule__ImageWidthDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageWidthDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2787:1: ( ( ':' ) )
            // InternalPdfMk.g:2788:1: ( ':' )
            {
            // InternalPdfMk.g:2788:1: ( ':' )
            // InternalPdfMk.g:2789:2: ':'
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
    // InternalPdfMk.g:2798:1: rule__ImageWidthDefintion__Group__2 : rule__ImageWidthDefintion__Group__2__Impl ;
    public final void rule__ImageWidthDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2802:1: ( rule__ImageWidthDefintion__Group__2__Impl )
            // InternalPdfMk.g:2803:2: rule__ImageWidthDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2809:1: rule__ImageWidthDefintion__Group__2__Impl : ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageWidthDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2813:1: ( ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2814:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2814:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2815:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2816:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2816:3: rule__ImageWidthDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2825:1: rule__ImageHeightDefintion__Group__0 : rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 ;
    public final void rule__ImageHeightDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2829:1: ( rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 )
            // InternalPdfMk.g:2830:2: rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1
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
    // InternalPdfMk.g:2837:1: rule__ImageHeightDefintion__Group__0__Impl : ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageHeightDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2841:1: ( ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2842:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2842:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2843:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2844:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2844:3: rule__ImageHeightDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2852:1: rule__ImageHeightDefintion__Group__1 : rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 ;
    public final void rule__ImageHeightDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2856:1: ( rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 )
            // InternalPdfMk.g:2857:2: rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:2864:1: rule__ImageHeightDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageHeightDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2868:1: ( ( ':' ) )
            // InternalPdfMk.g:2869:1: ( ':' )
            {
            // InternalPdfMk.g:2869:1: ( ':' )
            // InternalPdfMk.g:2870:2: ':'
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
    // InternalPdfMk.g:2879:1: rule__ImageHeightDefintion__Group__2 : rule__ImageHeightDefintion__Group__2__Impl ;
    public final void rule__ImageHeightDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2883:1: ( rule__ImageHeightDefintion__Group__2__Impl )
            // InternalPdfMk.g:2884:2: rule__ImageHeightDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2890:1: rule__ImageHeightDefintion__Group__2__Impl : ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageHeightDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2894:1: ( ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2895:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2895:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2896:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2897:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2897:3: rule__ImageHeightDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2906:1: rule__ImagePageBreakDefinition__Group__0 : rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 ;
    public final void rule__ImagePageBreakDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2910:1: ( rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 )
            // InternalPdfMk.g:2911:2: rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1
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
    // InternalPdfMk.g:2918:1: rule__ImagePageBreakDefinition__Group__0__Impl : ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2922:1: ( ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2923:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2923:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2924:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2925:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2925:3: rule__ImagePageBreakDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2933:1: rule__ImagePageBreakDefinition__Group__1 : rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 ;
    public final void rule__ImagePageBreakDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2937:1: ( rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 )
            // InternalPdfMk.g:2938:2: rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2
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
    // InternalPdfMk.g:2945:1: rule__ImagePageBreakDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImagePageBreakDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2949:1: ( ( ':' ) )
            // InternalPdfMk.g:2950:1: ( ':' )
            {
            // InternalPdfMk.g:2950:1: ( ':' )
            // InternalPdfMk.g:2951:2: ':'
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
    // InternalPdfMk.g:2960:1: rule__ImagePageBreakDefinition__Group__2 : rule__ImagePageBreakDefinition__Group__2__Impl ;
    public final void rule__ImagePageBreakDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2964:1: ( rule__ImagePageBreakDefinition__Group__2__Impl )
            // InternalPdfMk.g:2965:2: rule__ImagePageBreakDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2971:1: rule__ImagePageBreakDefinition__Group__2__Impl : ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2975:1: ( ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2976:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2976:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2977:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2978:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2978:3: rule__ImagePageBreakDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2987:1: rule__ImageFitDefinition__Group__0 : rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 ;
    public final void rule__ImageFitDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2991:1: ( rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 )
            // InternalPdfMk.g:2992:2: rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1
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
    // InternalPdfMk.g:2999:1: rule__ImageFitDefinition__Group__0__Impl : ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageFitDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3003:1: ( ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3004:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3004:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3005:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3006:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3006:3: rule__ImageFitDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3014:1: rule__ImageFitDefinition__Group__1 : rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 ;
    public final void rule__ImageFitDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3018:1: ( rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 )
            // InternalPdfMk.g:3019:2: rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:3026:1: rule__ImageFitDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageFitDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3030:1: ( ( ':' ) )
            // InternalPdfMk.g:3031:1: ( ':' )
            {
            // InternalPdfMk.g:3031:1: ( ':' )
            // InternalPdfMk.g:3032:2: ':'
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
    // InternalPdfMk.g:3041:1: rule__ImageFitDefinition__Group__2 : rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 ;
    public final void rule__ImageFitDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3045:1: ( rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 )
            // InternalPdfMk.g:3046:2: rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:3053:1: rule__ImageFitDefinition__Group__2__Impl : ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageFitDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3057:1: ( ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3058:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3058:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3059:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3060:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3060:3: rule__ImageFitDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3068:1: rule__ImageFitDefinition__Group__3 : rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 ;
    public final void rule__ImageFitDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3072:1: ( rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 )
            // InternalPdfMk.g:3073:2: rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:3080:1: rule__ImageFitDefinition__Group__3__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) ;
    public final void rule__ImageFitDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3084:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) )
            // InternalPdfMk.g:3085:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            {
            // InternalPdfMk.g:3085:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            // InternalPdfMk.g:3086:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:3087:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            // InternalPdfMk.g:3087:3: rule__ImageFitDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:3095:1: rule__ImageFitDefinition__Group__4 : rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 ;
    public final void rule__ImageFitDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3099:1: ( rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 )
            // InternalPdfMk.g:3100:2: rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:3107:1: rule__ImageFitDefinition__Group__4__Impl : ( ( rule__ImageFitDefinition__Group_4__0 ) ) ;
    public final void rule__ImageFitDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3111:1: ( ( ( rule__ImageFitDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:3112:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:3112:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            // InternalPdfMk.g:3113:2: ( rule__ImageFitDefinition__Group_4__0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:3114:2: ( rule__ImageFitDefinition__Group_4__0 )
            // InternalPdfMk.g:3114:3: rule__ImageFitDefinition__Group_4__0
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
    // InternalPdfMk.g:3122:1: rule__ImageFitDefinition__Group__5 : rule__ImageFitDefinition__Group__5__Impl ;
    public final void rule__ImageFitDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3126:1: ( rule__ImageFitDefinition__Group__5__Impl )
            // InternalPdfMk.g:3127:2: rule__ImageFitDefinition__Group__5__Impl
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
    // InternalPdfMk.g:3133:1: rule__ImageFitDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ImageFitDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3137:1: ( ( ']' ) )
            // InternalPdfMk.g:3138:1: ( ']' )
            {
            // InternalPdfMk.g:3138:1: ( ']' )
            // InternalPdfMk.g:3139:2: ']'
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
    // InternalPdfMk.g:3149:1: rule__ImageFitDefinition__Group_4__0 : rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 ;
    public final void rule__ImageFitDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3153:1: ( rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 )
            // InternalPdfMk.g:3154:2: rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:3161:1: rule__ImageFitDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageFitDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3165:1: ( ( ',' ) )
            // InternalPdfMk.g:3166:1: ( ',' )
            {
            // InternalPdfMk.g:3166:1: ( ',' )
            // InternalPdfMk.g:3167:2: ','
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
    // InternalPdfMk.g:3176:1: rule__ImageFitDefinition__Group_4__1 : rule__ImageFitDefinition__Group_4__1__Impl ;
    public final void rule__ImageFitDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3180:1: ( rule__ImageFitDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:3181:2: rule__ImageFitDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:3187:1: rule__ImageFitDefinition__Group_4__1__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__ImageFitDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3191:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:3192:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:3192:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:3193:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:3194:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:3194:3: rule__ImageFitDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:3203:1: rule__ImageOpacityDefinition__Group__0 : rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 ;
    public final void rule__ImageOpacityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3207:1: ( rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 )
            // InternalPdfMk.g:3208:2: rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1
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
    // InternalPdfMk.g:3215:1: rule__ImageOpacityDefinition__Group__0__Impl : ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3219:1: ( ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3220:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3220:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3221:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3222:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3222:3: rule__ImageOpacityDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3230:1: rule__ImageOpacityDefinition__Group__1 : rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 ;
    public final void rule__ImageOpacityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3234:1: ( rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 )
            // InternalPdfMk.g:3235:2: rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:3242:1: rule__ImageOpacityDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageOpacityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3246:1: ( ( ':' ) )
            // InternalPdfMk.g:3247:1: ( ':' )
            {
            // InternalPdfMk.g:3247:1: ( ':' )
            // InternalPdfMk.g:3248:2: ':'
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
    // InternalPdfMk.g:3257:1: rule__ImageOpacityDefinition__Group__2 : rule__ImageOpacityDefinition__Group__2__Impl ;
    public final void rule__ImageOpacityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3261:1: ( rule__ImageOpacityDefinition__Group__2__Impl )
            // InternalPdfMk.g:3262:2: rule__ImageOpacityDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3268:1: rule__ImageOpacityDefinition__Group__2__Impl : ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3272:1: ( ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3273:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3273:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3274:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3275:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3275:3: rule__ImageOpacityDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3284:1: rule__ListReversedDefinition__Group__0 : rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 ;
    public final void rule__ListReversedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3288:1: ( rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 )
            // InternalPdfMk.g:3289:2: rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1
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
    // InternalPdfMk.g:3296:1: rule__ListReversedDefinition__Group__0__Impl : ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListReversedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3300:1: ( ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3301:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3301:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3302:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3303:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3303:3: rule__ListReversedDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3311:1: rule__ListReversedDefinition__Group__1 : rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 ;
    public final void rule__ListReversedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3315:1: ( rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 )
            // InternalPdfMk.g:3316:2: rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2
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
    // InternalPdfMk.g:3323:1: rule__ListReversedDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListReversedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3327:1: ( ( ':' ) )
            // InternalPdfMk.g:3328:1: ( ':' )
            {
            // InternalPdfMk.g:3328:1: ( ':' )
            // InternalPdfMk.g:3329:2: ':'
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
    // InternalPdfMk.g:3338:1: rule__ListReversedDefinition__Group__2 : rule__ListReversedDefinition__Group__2__Impl ;
    public final void rule__ListReversedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3342:1: ( rule__ListReversedDefinition__Group__2__Impl )
            // InternalPdfMk.g:3343:2: rule__ListReversedDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3349:1: rule__ListReversedDefinition__Group__2__Impl : ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListReversedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3353:1: ( ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3354:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3354:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3355:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3356:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3356:3: rule__ListReversedDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3365:1: rule__ListCounterDefinition__Group__0 : rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 ;
    public final void rule__ListCounterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3369:1: ( rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 )
            // InternalPdfMk.g:3370:2: rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1
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
    // InternalPdfMk.g:3377:1: rule__ListCounterDefinition__Group__0__Impl : ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListCounterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3381:1: ( ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3382:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3382:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3383:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3384:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3384:3: rule__ListCounterDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3392:1: rule__ListCounterDefinition__Group__1 : rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 ;
    public final void rule__ListCounterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3396:1: ( rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 )
            // InternalPdfMk.g:3397:2: rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:3404:1: rule__ListCounterDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListCounterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3408:1: ( ( ':' ) )
            // InternalPdfMk.g:3409:1: ( ':' )
            {
            // InternalPdfMk.g:3409:1: ( ':' )
            // InternalPdfMk.g:3410:2: ':'
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
    // InternalPdfMk.g:3419:1: rule__ListCounterDefinition__Group__2 : rule__ListCounterDefinition__Group__2__Impl ;
    public final void rule__ListCounterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3423:1: ( rule__ListCounterDefinition__Group__2__Impl )
            // InternalPdfMk.g:3424:2: rule__ListCounterDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3430:1: rule__ListCounterDefinition__Group__2__Impl : ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListCounterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3434:1: ( ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3435:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3435:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3436:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3437:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3437:3: rule__ListCounterDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3446:1: rule__ListTypeDefinition__Group__0 : rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 ;
    public final void rule__ListTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3450:1: ( rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 )
            // InternalPdfMk.g:3451:2: rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1
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
    // InternalPdfMk.g:3458:1: rule__ListTypeDefinition__Group__0__Impl : ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3462:1: ( ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3463:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3463:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3464:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3465:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3465:3: rule__ListTypeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3473:1: rule__ListTypeDefinition__Group__1 : rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 ;
    public final void rule__ListTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3477:1: ( rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 )
            // InternalPdfMk.g:3478:2: rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2
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
    // InternalPdfMk.g:3485:1: rule__ListTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3489:1: ( ( ':' ) )
            // InternalPdfMk.g:3490:1: ( ':' )
            {
            // InternalPdfMk.g:3490:1: ( ':' )
            // InternalPdfMk.g:3491:2: ':'
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
    // InternalPdfMk.g:3500:1: rule__ListTypeDefinition__Group__2 : rule__ListTypeDefinition__Group__2__Impl ;
    public final void rule__ListTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3504:1: ( rule__ListTypeDefinition__Group__2__Impl )
            // InternalPdfMk.g:3505:2: rule__ListTypeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3511:1: rule__ListTypeDefinition__Group__2__Impl : ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3515:1: ( ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3516:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3516:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3517:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3518:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3518:3: rule__ListTypeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3527:1: rule__ListColorDefinition__Group__0 : rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 ;
    public final void rule__ListColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3531:1: ( rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 )
            // InternalPdfMk.g:3532:2: rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1
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
    // InternalPdfMk.g:3539:1: rule__ListColorDefinition__Group__0__Impl : ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3543:1: ( ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3544:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3544:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3545:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3546:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3546:3: rule__ListColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3554:1: rule__ListColorDefinition__Group__1 : rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 ;
    public final void rule__ListColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3558:1: ( rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 )
            // InternalPdfMk.g:3559:2: rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2
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
    // InternalPdfMk.g:3566:1: rule__ListColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3570:1: ( ( ':' ) )
            // InternalPdfMk.g:3571:1: ( ':' )
            {
            // InternalPdfMk.g:3571:1: ( ':' )
            // InternalPdfMk.g:3572:2: ':'
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
    // InternalPdfMk.g:3581:1: rule__ListColorDefinition__Group__2 : rule__ListColorDefinition__Group__2__Impl ;
    public final void rule__ListColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3585:1: ( rule__ListColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3586:2: rule__ListColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3592:1: rule__ListColorDefinition__Group__2__Impl : ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3596:1: ( ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3597:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3597:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3598:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3599:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3599:3: rule__ListColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3608:1: rule__ListMarkerColorDefinition__Group__0 : rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 ;
    public final void rule__ListMarkerColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3612:1: ( rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 )
            // InternalPdfMk.g:3613:2: rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1
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
    // InternalPdfMk.g:3620:1: rule__ListMarkerColorDefinition__Group__0__Impl : ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3624:1: ( ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3625:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3625:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3626:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3627:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3627:3: rule__ListMarkerColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3635:1: rule__ListMarkerColorDefinition__Group__1 : rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 ;
    public final void rule__ListMarkerColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3639:1: ( rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 )
            // InternalPdfMk.g:3640:2: rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2
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
    // InternalPdfMk.g:3647:1: rule__ListMarkerColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListMarkerColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3651:1: ( ( ':' ) )
            // InternalPdfMk.g:3652:1: ( ':' )
            {
            // InternalPdfMk.g:3652:1: ( ':' )
            // InternalPdfMk.g:3653:2: ':'
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
    // InternalPdfMk.g:3662:1: rule__ListMarkerColorDefinition__Group__2 : rule__ListMarkerColorDefinition__Group__2__Impl ;
    public final void rule__ListMarkerColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3666:1: ( rule__ListMarkerColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3667:2: rule__ListMarkerColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3673:1: rule__ListMarkerColorDefinition__Group__2__Impl : ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3677:1: ( ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3678:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3678:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3679:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3680:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3680:3: rule__ListMarkerColorDefinition__ValueAssignment_2
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


    // $ANTLR start "rule__TableRowDefinition__Group__0"
    // InternalPdfMk.g:3689:1: rule__TableRowDefinition__Group__0 : rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 ;
    public final void rule__TableRowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3693:1: ( rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 )
            // InternalPdfMk.g:3694:2: rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TableRowDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__0"


    // $ANTLR start "rule__TableRowDefinition__Group__0__Impl"
    // InternalPdfMk.g:3701:1: rule__TableRowDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3705:1: ( ( '[' ) )
            // InternalPdfMk.g:3706:1: ( '[' )
            {
            // InternalPdfMk.g:3706:1: ( '[' )
            // InternalPdfMk.g:3707:2: '['
            {
             before(grammarAccess.getTableRowDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableRowDefinitionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__0__Impl"


    // $ANTLR start "rule__TableRowDefinition__Group__1"
    // InternalPdfMk.g:3716:1: rule__TableRowDefinition__Group__1 : rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 ;
    public final void rule__TableRowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3720:1: ( rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 )
            // InternalPdfMk.g:3721:2: rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TableRowDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__1"


    // $ANTLR start "rule__TableRowDefinition__Group__1__Impl"
    // InternalPdfMk.g:3728:1: rule__TableRowDefinition__Group__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) ;
    public final void rule__TableRowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3732:1: ( ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) )
            // InternalPdfMk.g:3733:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            {
            // InternalPdfMk.g:3733:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            // InternalPdfMk.g:3734:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_1()); 
            // InternalPdfMk.g:3735:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            // InternalPdfMk.g:3735:3: rule__TableRowDefinition__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__1__Impl"


    // $ANTLR start "rule__TableRowDefinition__Group__2"
    // InternalPdfMk.g:3743:1: rule__TableRowDefinition__Group__2 : rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 ;
    public final void rule__TableRowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3747:1: ( rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 )
            // InternalPdfMk.g:3748:2: rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TableRowDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__2"


    // $ANTLR start "rule__TableRowDefinition__Group__2__Impl"
    // InternalPdfMk.g:3755:1: rule__TableRowDefinition__Group__2__Impl : ( ( rule__TableRowDefinition__Group_2__0 ) ) ;
    public final void rule__TableRowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3759:1: ( ( ( rule__TableRowDefinition__Group_2__0 ) ) )
            // InternalPdfMk.g:3760:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            {
            // InternalPdfMk.g:3760:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            // InternalPdfMk.g:3761:2: ( rule__TableRowDefinition__Group_2__0 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getGroup_2()); 
            // InternalPdfMk.g:3762:2: ( rule__TableRowDefinition__Group_2__0 )
            // InternalPdfMk.g:3762:3: rule__TableRowDefinition__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__2__Impl"


    // $ANTLR start "rule__TableRowDefinition__Group__3"
    // InternalPdfMk.g:3770:1: rule__TableRowDefinition__Group__3 : rule__TableRowDefinition__Group__3__Impl ;
    public final void rule__TableRowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3774:1: ( rule__TableRowDefinition__Group__3__Impl )
            // InternalPdfMk.g:3775:2: rule__TableRowDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__3"


    // $ANTLR start "rule__TableRowDefinition__Group__3__Impl"
    // InternalPdfMk.g:3781:1: rule__TableRowDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3785:1: ( ( ']' ) )
            // InternalPdfMk.g:3786:1: ( ']' )
            {
            // InternalPdfMk.g:3786:1: ( ']' )
            // InternalPdfMk.g:3787:2: ']'
            {
             before(grammarAccess.getTableRowDefinitionAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableRowDefinitionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group__3__Impl"


    // $ANTLR start "rule__TableRowDefinition__Group_2__0"
    // InternalPdfMk.g:3797:1: rule__TableRowDefinition__Group_2__0 : rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 ;
    public final void rule__TableRowDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3801:1: ( rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 )
            // InternalPdfMk.g:3802:2: rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__TableRowDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group_2__0"


    // $ANTLR start "rule__TableRowDefinition__Group_2__0__Impl"
    // InternalPdfMk.g:3809:1: rule__TableRowDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRowDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3813:1: ( ( ',' ) )
            // InternalPdfMk.g:3814:1: ( ',' )
            {
            // InternalPdfMk.g:3814:1: ( ',' )
            // InternalPdfMk.g:3815:2: ','
            {
             before(grammarAccess.getTableRowDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableRowDefinitionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__TableRowDefinition__Group_2__1"
    // InternalPdfMk.g:3824:1: rule__TableRowDefinition__Group_2__1 : rule__TableRowDefinition__Group_2__1__Impl ;
    public final void rule__TableRowDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3828:1: ( rule__TableRowDefinition__Group_2__1__Impl )
            // InternalPdfMk.g:3829:2: rule__TableRowDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group_2__1"


    // $ANTLR start "rule__TableRowDefinition__Group_2__1__Impl"
    // InternalPdfMk.g:3835:1: rule__TableRowDefinition__Group_2__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) ;
    public final void rule__TableRowDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3839:1: ( ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) )
            // InternalPdfMk.g:3840:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            {
            // InternalPdfMk.g:3840:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            // InternalPdfMk.g:3841:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_2_1()); 
            // InternalPdfMk.g:3842:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            // InternalPdfMk.g:3842:3: rule__TableRowDefinition__ItemAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TableRowDefinition__ItemAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group__0"
    // InternalPdfMk.g:3851:1: rule__TableBodyDefinition__Group__0 : rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 ;
    public final void rule__TableBodyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3855:1: ( rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 )
            // InternalPdfMk.g:3856:2: rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TableBodyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__0"


    // $ANTLR start "rule__TableBodyDefinition__Group__0__Impl"
    // InternalPdfMk.g:3863:1: rule__TableBodyDefinition__Group__0__Impl : ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableBodyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3867:1: ( ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3868:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3868:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3869:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3870:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3870:3: rule__TableBodyDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableBodyDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__0__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group__1"
    // InternalPdfMk.g:3878:1: rule__TableBodyDefinition__Group__1 : rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 ;
    public final void rule__TableBodyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3882:1: ( rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 )
            // InternalPdfMk.g:3883:2: rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TableBodyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__1"


    // $ANTLR start "rule__TableBodyDefinition__Group__1__Impl"
    // InternalPdfMk.g:3890:1: rule__TableBodyDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableBodyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3894:1: ( ( ':' ) )
            // InternalPdfMk.g:3895:1: ( ':' )
            {
            // InternalPdfMk.g:3895:1: ( ':' )
            // InternalPdfMk.g:3896:2: ':'
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableBodyDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__1__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group__2"
    // InternalPdfMk.g:3905:1: rule__TableBodyDefinition__Group__2 : rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 ;
    public final void rule__TableBodyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3909:1: ( rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 )
            // InternalPdfMk.g:3910:2: rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__TableBodyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__2"


    // $ANTLR start "rule__TableBodyDefinition__Group__2__Impl"
    // InternalPdfMk.g:3917:1: rule__TableBodyDefinition__Group__2__Impl : ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableBodyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3921:1: ( ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3922:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3922:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3923:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3924:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3924:3: rule__TableBodyDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableBodyDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__2__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group__3"
    // InternalPdfMk.g:3932:1: rule__TableBodyDefinition__Group__3 : rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 ;
    public final void rule__TableBodyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3936:1: ( rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 )
            // InternalPdfMk.g:3937:2: rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__TableBodyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__3"


    // $ANTLR start "rule__TableBodyDefinition__Group__3__Impl"
    // InternalPdfMk.g:3944:1: rule__TableBodyDefinition__Group__3__Impl : ( ( rule__TableBodyDefinition__Group_3__0 ) ) ;
    public final void rule__TableBodyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3948:1: ( ( ( rule__TableBodyDefinition__Group_3__0 ) ) )
            // InternalPdfMk.g:3949:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            {
            // InternalPdfMk.g:3949:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            // InternalPdfMk.g:3950:2: ( rule__TableBodyDefinition__Group_3__0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3()); 
            // InternalPdfMk.g:3951:2: ( rule__TableBodyDefinition__Group_3__0 )
            // InternalPdfMk.g:3951:3: rule__TableBodyDefinition__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTableBodyDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__3__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group__4"
    // InternalPdfMk.g:3959:1: rule__TableBodyDefinition__Group__4 : rule__TableBodyDefinition__Group__4__Impl ;
    public final void rule__TableBodyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3963:1: ( rule__TableBodyDefinition__Group__4__Impl )
            // InternalPdfMk.g:3964:2: rule__TableBodyDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__4"


    // $ANTLR start "rule__TableBodyDefinition__Group__4__Impl"
    // InternalPdfMk.g:3970:1: rule__TableBodyDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__TableBodyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3974:1: ( ( ']' ) )
            // InternalPdfMk.g:3975:1: ( ']' )
            {
            // InternalPdfMk.g:3975:1: ( ']' )
            // InternalPdfMk.g:3976:2: ']'
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableBodyDefinitionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group__4__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group_3__0"
    // InternalPdfMk.g:3986:1: rule__TableBodyDefinition__Group_3__0 : rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 ;
    public final void rule__TableBodyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3990:1: ( rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 )
            // InternalPdfMk.g:3991:2: rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__TableBodyDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3__0"


    // $ANTLR start "rule__TableBodyDefinition__Group_3__0__Impl"
    // InternalPdfMk.g:3998:1: rule__TableBodyDefinition__Group_3__0__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) ;
    public final void rule__TableBodyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4002:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) )
            // InternalPdfMk.g:4003:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            {
            // InternalPdfMk.g:4003:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            // InternalPdfMk.g:4004:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_0()); 
            // InternalPdfMk.g:4005:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            // InternalPdfMk.g:4005:3: rule__TableBodyDefinition__RowsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__RowsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group_3__1"
    // InternalPdfMk.g:4013:1: rule__TableBodyDefinition__Group_3__1 : rule__TableBodyDefinition__Group_3__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4017:1: ( rule__TableBodyDefinition__Group_3__1__Impl )
            // InternalPdfMk.g:4018:2: rule__TableBodyDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3__1"


    // $ANTLR start "rule__TableBodyDefinition__Group_3__1__Impl"
    // InternalPdfMk.g:4024:1: rule__TableBodyDefinition__Group_3__1__Impl : ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) ;
    public final void rule__TableBodyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4028:1: ( ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) )
            // InternalPdfMk.g:4029:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:4029:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            // InternalPdfMk.g:4030:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3_1()); 
            // InternalPdfMk.g:4031:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPdfMk.g:4031:3: rule__TableBodyDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TableBodyDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTableBodyDefinitionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group_3_1__0"
    // InternalPdfMk.g:4040:1: rule__TableBodyDefinition__Group_3_1__0 : rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 ;
    public final void rule__TableBodyDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4044:1: ( rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 )
            // InternalPdfMk.g:4045:2: rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__TableBodyDefinition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3_1__0"


    // $ANTLR start "rule__TableBodyDefinition__Group_3_1__0__Impl"
    // InternalPdfMk.g:4052:1: rule__TableBodyDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__TableBodyDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4056:1: ( ( ',' ) )
            // InternalPdfMk.g:4057:1: ( ',' )
            {
            // InternalPdfMk.g:4057:1: ( ',' )
            // InternalPdfMk.g:4058:2: ','
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableBodyDefinitionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__TableBodyDefinition__Group_3_1__1"
    // InternalPdfMk.g:4067:1: rule__TableBodyDefinition__Group_3_1__1 : rule__TableBodyDefinition__Group_3_1__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4071:1: ( rule__TableBodyDefinition__Group_3_1__1__Impl )
            // InternalPdfMk.g:4072:2: rule__TableBodyDefinition__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3_1__1"


    // $ANTLR start "rule__TableBodyDefinition__Group_3_1__1__Impl"
    // InternalPdfMk.g:4078:1: rule__TableBodyDefinition__Group_3_1__1__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) ;
    public final void rule__TableBodyDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4082:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:4083:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:4083:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            // InternalPdfMk.g:4084:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_1_1()); 
            // InternalPdfMk.g:4085:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            // InternalPdfMk.g:4085:3: rule__TableBodyDefinition__RowsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TableBodyDefinition__RowsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__0"
    // InternalPdfMk.g:4094:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4098:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // InternalPdfMk.g:4099:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__0"


    // $ANTLR start "rule__TableDefinition__Group__0__Impl"
    // InternalPdfMk.g:4106:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4110:1: ( ( ( rule__TableDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4111:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4111:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:4112:2: ( rule__TableDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4113:2: ( rule__TableDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:4113:3: rule__TableDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__0__Impl"


    // $ANTLR start "rule__TableDefinition__Group__1"
    // InternalPdfMk.g:4121:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4125:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // InternalPdfMk.g:4126:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__1"


    // $ANTLR start "rule__TableDefinition__Group__1__Impl"
    // InternalPdfMk.g:4133:1: rule__TableDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4137:1: ( ( ':' ) )
            // InternalPdfMk.g:4138:1: ( ':' )
            {
            // InternalPdfMk.g:4138:1: ( ':' )
            // InternalPdfMk.g:4139:2: ':'
            {
             before(grammarAccess.getTableDefinitionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__1__Impl"


    // $ANTLR start "rule__TableDefinition__Group__2"
    // InternalPdfMk.g:4148:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4152:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // InternalPdfMk.g:4153:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__2"


    // $ANTLR start "rule__TableDefinition__Group__2__Impl"
    // InternalPdfMk.g:4160:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4164:1: ( ( ( rule__TableDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4165:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4165:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:4166:2: ( rule__TableDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4167:2: ( rule__TableDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:4167:3: rule__TableDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__2__Impl"


    // $ANTLR start "rule__TableDefinition__Group__3"
    // InternalPdfMk.g:4175:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4179:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // InternalPdfMk.g:4180:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__3"


    // $ANTLR start "rule__TableDefinition__Group__3__Impl"
    // InternalPdfMk.g:4187:1: rule__TableDefinition__Group__3__Impl : ( ( rule__TableDefinition__BodyAssignment_3 ) ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4191:1: ( ( ( rule__TableDefinition__BodyAssignment_3 ) ) )
            // InternalPdfMk.g:4192:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            {
            // InternalPdfMk.g:4192:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            // InternalPdfMk.g:4193:2: ( rule__TableDefinition__BodyAssignment_3 )
            {
             before(grammarAccess.getTableDefinitionAccess().getBodyAssignment_3()); 
            // InternalPdfMk.g:4194:2: ( rule__TableDefinition__BodyAssignment_3 )
            // InternalPdfMk.g:4194:3: rule__TableDefinition__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TableDefinition__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableDefinitionAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__3__Impl"


    // $ANTLR start "rule__TableDefinition__Group__4"
    // InternalPdfMk.g:4202:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4206:1: ( rule__TableDefinition__Group__4__Impl )
            // InternalPdfMk.g:4207:2: rule__TableDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__4"


    // $ANTLR start "rule__TableDefinition__Group__4__Impl"
    // InternalPdfMk.g:4213:1: rule__TableDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4217:1: ( ( '}' ) )
            // InternalPdfMk.g:4218:1: ( '}' )
            {
            // InternalPdfMk.g:4218:1: ( '}' )
            // InternalPdfMk.g:4219:2: '}'
            {
             before(grammarAccess.getTableDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__Group__4__Impl"


    // $ANTLR start "rule__TextObject__Group__0"
    // InternalPdfMk.g:4229:1: rule__TextObject__Group__0 : rule__TextObject__Group__0__Impl rule__TextObject__Group__1 ;
    public final void rule__TextObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4233:1: ( rule__TextObject__Group__0__Impl rule__TextObject__Group__1 )
            // InternalPdfMk.g:4234:2: rule__TextObject__Group__0__Impl rule__TextObject__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPdfMk.g:4241:1: rule__TextObject__Group__0__Impl : ( '{' ) ;
    public final void rule__TextObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4245:1: ( ( '{' ) )
            // InternalPdfMk.g:4246:1: ( '{' )
            {
            // InternalPdfMk.g:4246:1: ( '{' )
            // InternalPdfMk.g:4247:2: '{'
            {
             before(grammarAccess.getTextObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalPdfMk.g:4256:1: rule__TextObject__Group__1 : rule__TextObject__Group__1__Impl rule__TextObject__Group__2 ;
    public final void rule__TextObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4260:1: ( rule__TextObject__Group__1__Impl rule__TextObject__Group__2 )
            // InternalPdfMk.g:4261:2: rule__TextObject__Group__1__Impl rule__TextObject__Group__2
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
    // InternalPdfMk.g:4268:1: rule__TextObject__Group__1__Impl : ( ( rule__TextObject__TextAssignment_1 ) ) ;
    public final void rule__TextObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4272:1: ( ( ( rule__TextObject__TextAssignment_1 ) ) )
            // InternalPdfMk.g:4273:1: ( ( rule__TextObject__TextAssignment_1 ) )
            {
            // InternalPdfMk.g:4273:1: ( ( rule__TextObject__TextAssignment_1 ) )
            // InternalPdfMk.g:4274:2: ( rule__TextObject__TextAssignment_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTextAssignment_1()); 
            // InternalPdfMk.g:4275:2: ( rule__TextObject__TextAssignment_1 )
            // InternalPdfMk.g:4275:3: rule__TextObject__TextAssignment_1
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
    // InternalPdfMk.g:4283:1: rule__TextObject__Group__2 : rule__TextObject__Group__2__Impl rule__TextObject__Group__3 ;
    public final void rule__TextObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4287:1: ( rule__TextObject__Group__2__Impl rule__TextObject__Group__3 )
            // InternalPdfMk.g:4288:2: rule__TextObject__Group__2__Impl rule__TextObject__Group__3
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
    // InternalPdfMk.g:4295:1: rule__TextObject__Group__2__Impl : ( ( rule__TextObject__Group_2__0 )? ) ;
    public final void rule__TextObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4299:1: ( ( ( rule__TextObject__Group_2__0 )? ) )
            // InternalPdfMk.g:4300:1: ( ( rule__TextObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:4300:1: ( ( rule__TextObject__Group_2__0 )? )
            // InternalPdfMk.g:4301:2: ( rule__TextObject__Group_2__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:4302:2: ( rule__TextObject__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==26) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPdfMk.g:4302:3: rule__TextObject__Group_2__0
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
    // InternalPdfMk.g:4310:1: rule__TextObject__Group__3 : rule__TextObject__Group__3__Impl rule__TextObject__Group__4 ;
    public final void rule__TextObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4314:1: ( rule__TextObject__Group__3__Impl rule__TextObject__Group__4 )
            // InternalPdfMk.g:4315:2: rule__TextObject__Group__3__Impl rule__TextObject__Group__4
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
    // InternalPdfMk.g:4322:1: rule__TextObject__Group__3__Impl : ( ( rule__TextObject__Group_3__0 )? ) ;
    public final void rule__TextObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4326:1: ( ( ( rule__TextObject__Group_3__0 )? ) )
            // InternalPdfMk.g:4327:1: ( ( rule__TextObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:4327:1: ( ( rule__TextObject__Group_3__0 )? )
            // InternalPdfMk.g:4328:2: ( rule__TextObject__Group_3__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:4329:2: ( rule__TextObject__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==29) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalPdfMk.g:4329:3: rule__TextObject__Group_3__0
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
    // InternalPdfMk.g:4337:1: rule__TextObject__Group__4 : rule__TextObject__Group__4__Impl rule__TextObject__Group__5 ;
    public final void rule__TextObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4341:1: ( rule__TextObject__Group__4__Impl rule__TextObject__Group__5 )
            // InternalPdfMk.g:4342:2: rule__TextObject__Group__4__Impl rule__TextObject__Group__5
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
    // InternalPdfMk.g:4349:1: rule__TextObject__Group__4__Impl : ( ( rule__TextObject__Group_4__0 )? ) ;
    public final void rule__TextObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4353:1: ( ( ( rule__TextObject__Group_4__0 )? ) )
            // InternalPdfMk.g:4354:1: ( ( rule__TextObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:4354:1: ( ( rule__TextObject__Group_4__0 )? )
            // InternalPdfMk.g:4355:2: ( rule__TextObject__Group_4__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:4356:2: ( rule__TextObject__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==22) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:4356:3: rule__TextObject__Group_4__0
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
    // InternalPdfMk.g:4364:1: rule__TextObject__Group__5 : rule__TextObject__Group__5__Impl rule__TextObject__Group__6 ;
    public final void rule__TextObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4368:1: ( rule__TextObject__Group__5__Impl rule__TextObject__Group__6 )
            // InternalPdfMk.g:4369:2: rule__TextObject__Group__5__Impl rule__TextObject__Group__6
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
    // InternalPdfMk.g:4376:1: rule__TextObject__Group__5__Impl : ( ( rule__TextObject__Group_5__0 )? ) ;
    public final void rule__TextObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4380:1: ( ( ( rule__TextObject__Group_5__0 )? ) )
            // InternalPdfMk.g:4381:1: ( ( rule__TextObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:4381:1: ( ( rule__TextObject__Group_5__0 )? )
            // InternalPdfMk.g:4382:2: ( rule__TextObject__Group_5__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:4383:2: ( rule__TextObject__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==25) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalPdfMk.g:4383:3: rule__TextObject__Group_5__0
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
    // InternalPdfMk.g:4391:1: rule__TextObject__Group__6 : rule__TextObject__Group__6__Impl rule__TextObject__Group__7 ;
    public final void rule__TextObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4395:1: ( rule__TextObject__Group__6__Impl rule__TextObject__Group__7 )
            // InternalPdfMk.g:4396:2: rule__TextObject__Group__6__Impl rule__TextObject__Group__7
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
    // InternalPdfMk.g:4403:1: rule__TextObject__Group__6__Impl : ( ( rule__TextObject__Group_6__0 )? ) ;
    public final void rule__TextObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4407:1: ( ( ( rule__TextObject__Group_6__0 )? ) )
            // InternalPdfMk.g:4408:1: ( ( rule__TextObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:4408:1: ( ( rule__TextObject__Group_6__0 )? )
            // InternalPdfMk.g:4409:2: ( rule__TextObject__Group_6__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:4410:2: ( rule__TextObject__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==28) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPdfMk.g:4410:3: rule__TextObject__Group_6__0
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
    // InternalPdfMk.g:4418:1: rule__TextObject__Group__7 : rule__TextObject__Group__7__Impl rule__TextObject__Group__8 ;
    public final void rule__TextObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4422:1: ( rule__TextObject__Group__7__Impl rule__TextObject__Group__8 )
            // InternalPdfMk.g:4423:2: rule__TextObject__Group__7__Impl rule__TextObject__Group__8
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
    // InternalPdfMk.g:4430:1: rule__TextObject__Group__7__Impl : ( ( rule__TextObject__Group_7__0 )? ) ;
    public final void rule__TextObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4434:1: ( ( ( rule__TextObject__Group_7__0 )? ) )
            // InternalPdfMk.g:4435:1: ( ( rule__TextObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:4435:1: ( ( rule__TextObject__Group_7__0 )? )
            // InternalPdfMk.g:4436:2: ( rule__TextObject__Group_7__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:4437:2: ( rule__TextObject__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==30) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:4437:3: rule__TextObject__Group_7__0
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
    // InternalPdfMk.g:4445:1: rule__TextObject__Group__8 : rule__TextObject__Group__8__Impl rule__TextObject__Group__9 ;
    public final void rule__TextObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4449:1: ( rule__TextObject__Group__8__Impl rule__TextObject__Group__9 )
            // InternalPdfMk.g:4450:2: rule__TextObject__Group__8__Impl rule__TextObject__Group__9
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
    // InternalPdfMk.g:4457:1: rule__TextObject__Group__8__Impl : ( ( rule__TextObject__Group_8__0 )? ) ;
    public final void rule__TextObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4461:1: ( ( ( rule__TextObject__Group_8__0 )? ) )
            // InternalPdfMk.g:4462:1: ( ( rule__TextObject__Group_8__0 )? )
            {
            // InternalPdfMk.g:4462:1: ( ( rule__TextObject__Group_8__0 )? )
            // InternalPdfMk.g:4463:2: ( rule__TextObject__Group_8__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_8()); 
            // InternalPdfMk.g:4464:2: ( rule__TextObject__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==32) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:4464:3: rule__TextObject__Group_8__0
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
    // InternalPdfMk.g:4472:1: rule__TextObject__Group__9 : rule__TextObject__Group__9__Impl rule__TextObject__Group__10 ;
    public final void rule__TextObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4476:1: ( rule__TextObject__Group__9__Impl rule__TextObject__Group__10 )
            // InternalPdfMk.g:4477:2: rule__TextObject__Group__9__Impl rule__TextObject__Group__10
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
    // InternalPdfMk.g:4484:1: rule__TextObject__Group__9__Impl : ( ( rule__TextObject__Group_9__0 )? ) ;
    public final void rule__TextObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4488:1: ( ( ( rule__TextObject__Group_9__0 )? ) )
            // InternalPdfMk.g:4489:1: ( ( rule__TextObject__Group_9__0 )? )
            {
            // InternalPdfMk.g:4489:1: ( ( rule__TextObject__Group_9__0 )? )
            // InternalPdfMk.g:4490:2: ( rule__TextObject__Group_9__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_9()); 
            // InternalPdfMk.g:4491:2: ( rule__TextObject__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPdfMk.g:4491:3: rule__TextObject__Group_9__0
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
    // InternalPdfMk.g:4499:1: rule__TextObject__Group__10 : rule__TextObject__Group__10__Impl ;
    public final void rule__TextObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4503:1: ( rule__TextObject__Group__10__Impl )
            // InternalPdfMk.g:4504:2: rule__TextObject__Group__10__Impl
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
    // InternalPdfMk.g:4510:1: rule__TextObject__Group__10__Impl : ( '}' ) ;
    public final void rule__TextObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4514:1: ( ( '}' ) )
            // InternalPdfMk.g:4515:1: ( '}' )
            {
            // InternalPdfMk.g:4515:1: ( '}' )
            // InternalPdfMk.g:4516:2: '}'
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
    // InternalPdfMk.g:4526:1: rule__TextObject__Group_2__0 : rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 ;
    public final void rule__TextObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4530:1: ( rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 )
            // InternalPdfMk.g:4531:2: rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4538:1: rule__TextObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4542:1: ( ( ',' ) )
            // InternalPdfMk.g:4543:1: ( ',' )
            {
            // InternalPdfMk.g:4543:1: ( ',' )
            // InternalPdfMk.g:4544:2: ','
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
    // InternalPdfMk.g:4553:1: rule__TextObject__Group_2__1 : rule__TextObject__Group_2__1__Impl ;
    public final void rule__TextObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4557:1: ( rule__TextObject__Group_2__1__Impl )
            // InternalPdfMk.g:4558:2: rule__TextObject__Group_2__1__Impl
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
    // InternalPdfMk.g:4564:1: rule__TextObject__Group_2__1__Impl : ( ( rule__TextObject__StyleAssignment_2_1 ) ) ;
    public final void rule__TextObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4568:1: ( ( ( rule__TextObject__StyleAssignment_2_1 ) ) )
            // InternalPdfMk.g:4569:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            {
            // InternalPdfMk.g:4569:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            // InternalPdfMk.g:4570:2: ( rule__TextObject__StyleAssignment_2_1 )
            {
             before(grammarAccess.getTextObjectAccess().getStyleAssignment_2_1()); 
            // InternalPdfMk.g:4571:2: ( rule__TextObject__StyleAssignment_2_1 )
            // InternalPdfMk.g:4571:3: rule__TextObject__StyleAssignment_2_1
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
    // InternalPdfMk.g:4580:1: rule__TextObject__Group_3__0 : rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 ;
    public final void rule__TextObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4584:1: ( rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 )
            // InternalPdfMk.g:4585:2: rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPdfMk.g:4592:1: rule__TextObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4596:1: ( ( ',' ) )
            // InternalPdfMk.g:4597:1: ( ',' )
            {
            // InternalPdfMk.g:4597:1: ( ',' )
            // InternalPdfMk.g:4598:2: ','
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
    // InternalPdfMk.g:4607:1: rule__TextObject__Group_3__1 : rule__TextObject__Group_3__1__Impl ;
    public final void rule__TextObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4611:1: ( rule__TextObject__Group_3__1__Impl )
            // InternalPdfMk.g:4612:2: rule__TextObject__Group_3__1__Impl
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
    // InternalPdfMk.g:4618:1: rule__TextObject__Group_3__1__Impl : ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) ;
    public final void rule__TextObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4622:1: ( ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) )
            // InternalPdfMk.g:4623:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            {
            // InternalPdfMk.g:4623:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            // InternalPdfMk.g:4624:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            {
             before(grammarAccess.getTextObjectAccess().getFontSizeAssignment_3_1()); 
            // InternalPdfMk.g:4625:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            // InternalPdfMk.g:4625:3: rule__TextObject__FontSizeAssignment_3_1
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
    // InternalPdfMk.g:4634:1: rule__TextObject__Group_4__0 : rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 ;
    public final void rule__TextObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4638:1: ( rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 )
            // InternalPdfMk.g:4639:2: rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPdfMk.g:4646:1: rule__TextObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4650:1: ( ( ',' ) )
            // InternalPdfMk.g:4651:1: ( ',' )
            {
            // InternalPdfMk.g:4651:1: ( ',' )
            // InternalPdfMk.g:4652:2: ','
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
    // InternalPdfMk.g:4661:1: rule__TextObject__Group_4__1 : rule__TextObject__Group_4__1__Impl ;
    public final void rule__TextObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4665:1: ( rule__TextObject__Group_4__1__Impl )
            // InternalPdfMk.g:4666:2: rule__TextObject__Group_4__1__Impl
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
    // InternalPdfMk.g:4672:1: rule__TextObject__Group_4__1__Impl : ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) ;
    public final void rule__TextObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4676:1: ( ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) )
            // InternalPdfMk.g:4677:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            {
            // InternalPdfMk.g:4677:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            // InternalPdfMk.g:4678:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            {
             before(grammarAccess.getTextObjectAccess().getAlignmentAssignment_4_1()); 
            // InternalPdfMk.g:4679:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            // InternalPdfMk.g:4679:3: rule__TextObject__AlignmentAssignment_4_1
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
    // InternalPdfMk.g:4688:1: rule__TextObject__Group_5__0 : rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 ;
    public final void rule__TextObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4692:1: ( rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 )
            // InternalPdfMk.g:4693:2: rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:4700:1: rule__TextObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4704:1: ( ( ',' ) )
            // InternalPdfMk.g:4705:1: ( ',' )
            {
            // InternalPdfMk.g:4705:1: ( ',' )
            // InternalPdfMk.g:4706:2: ','
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
    // InternalPdfMk.g:4715:1: rule__TextObject__Group_5__1 : rule__TextObject__Group_5__1__Impl ;
    public final void rule__TextObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4719:1: ( rule__TextObject__Group_5__1__Impl )
            // InternalPdfMk.g:4720:2: rule__TextObject__Group_5__1__Impl
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
    // InternalPdfMk.g:4726:1: rule__TextObject__Group_5__1__Impl : ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) ;
    public final void rule__TextObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4730:1: ( ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) )
            // InternalPdfMk.g:4731:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            {
            // InternalPdfMk.g:4731:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            // InternalPdfMk.g:4732:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTypeFaceAssignment_5_1()); 
            // InternalPdfMk.g:4733:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            // InternalPdfMk.g:4733:3: rule__TextObject__TypeFaceAssignment_5_1
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
    // InternalPdfMk.g:4742:1: rule__TextObject__Group_6__0 : rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 ;
    public final void rule__TextObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4746:1: ( rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 )
            // InternalPdfMk.g:4747:2: rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPdfMk.g:4754:1: rule__TextObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4758:1: ( ( ',' ) )
            // InternalPdfMk.g:4759:1: ( ',' )
            {
            // InternalPdfMk.g:4759:1: ( ',' )
            // InternalPdfMk.g:4760:2: ','
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
    // InternalPdfMk.g:4769:1: rule__TextObject__Group_6__1 : rule__TextObject__Group_6__1__Impl ;
    public final void rule__TextObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4773:1: ( rule__TextObject__Group_6__1__Impl )
            // InternalPdfMk.g:4774:2: rule__TextObject__Group_6__1__Impl
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
    // InternalPdfMk.g:4780:1: rule__TextObject__Group_6__1__Impl : ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__TextObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4784:1: ( ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:4785:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:4785:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:4786:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getTextObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:4787:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:4787:3: rule__TextObject__ItalicsAssignment_6_1
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
    // InternalPdfMk.g:4796:1: rule__TextObject__Group_7__0 : rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1 ;
    public final void rule__TextObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4800:1: ( rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1 )
            // InternalPdfMk.g:4801:2: rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPdfMk.g:4808:1: rule__TextObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4812:1: ( ( ',' ) )
            // InternalPdfMk.g:4813:1: ( ',' )
            {
            // InternalPdfMk.g:4813:1: ( ',' )
            // InternalPdfMk.g:4814:2: ','
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
    // InternalPdfMk.g:4823:1: rule__TextObject__Group_7__1 : rule__TextObject__Group_7__1__Impl ;
    public final void rule__TextObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4827:1: ( rule__TextObject__Group_7__1__Impl )
            // InternalPdfMk.g:4828:2: rule__TextObject__Group_7__1__Impl
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
    // InternalPdfMk.g:4834:1: rule__TextObject__Group_7__1__Impl : ( ( rule__TextObject__WidthAssignment_7_1 ) ) ;
    public final void rule__TextObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4838:1: ( ( ( rule__TextObject__WidthAssignment_7_1 ) ) )
            // InternalPdfMk.g:4839:1: ( ( rule__TextObject__WidthAssignment_7_1 ) )
            {
            // InternalPdfMk.g:4839:1: ( ( rule__TextObject__WidthAssignment_7_1 ) )
            // InternalPdfMk.g:4840:2: ( rule__TextObject__WidthAssignment_7_1 )
            {
             before(grammarAccess.getTextObjectAccess().getWidthAssignment_7_1()); 
            // InternalPdfMk.g:4841:2: ( rule__TextObject__WidthAssignment_7_1 )
            // InternalPdfMk.g:4841:3: rule__TextObject__WidthAssignment_7_1
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
    // InternalPdfMk.g:4850:1: rule__TextObject__Group_8__0 : rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1 ;
    public final void rule__TextObject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4854:1: ( rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1 )
            // InternalPdfMk.g:4855:2: rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPdfMk.g:4862:1: rule__TextObject__Group_8__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4866:1: ( ( ',' ) )
            // InternalPdfMk.g:4867:1: ( ',' )
            {
            // InternalPdfMk.g:4867:1: ( ',' )
            // InternalPdfMk.g:4868:2: ','
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
    // InternalPdfMk.g:4877:1: rule__TextObject__Group_8__1 : rule__TextObject__Group_8__1__Impl ;
    public final void rule__TextObject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4881:1: ( rule__TextObject__Group_8__1__Impl )
            // InternalPdfMk.g:4882:2: rule__TextObject__Group_8__1__Impl
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
    // InternalPdfMk.g:4888:1: rule__TextObject__Group_8__1__Impl : ( ( rule__TextObject__MarginAssignment_8_1 ) ) ;
    public final void rule__TextObject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4892:1: ( ( ( rule__TextObject__MarginAssignment_8_1 ) ) )
            // InternalPdfMk.g:4893:1: ( ( rule__TextObject__MarginAssignment_8_1 ) )
            {
            // InternalPdfMk.g:4893:1: ( ( rule__TextObject__MarginAssignment_8_1 ) )
            // InternalPdfMk.g:4894:2: ( rule__TextObject__MarginAssignment_8_1 )
            {
             before(grammarAccess.getTextObjectAccess().getMarginAssignment_8_1()); 
            // InternalPdfMk.g:4895:2: ( rule__TextObject__MarginAssignment_8_1 )
            // InternalPdfMk.g:4895:3: rule__TextObject__MarginAssignment_8_1
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
    // InternalPdfMk.g:4904:1: rule__TextObject__Group_9__0 : rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1 ;
    public final void rule__TextObject__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4908:1: ( rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1 )
            // InternalPdfMk.g:4909:2: rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:4916:1: rule__TextObject__Group_9__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4920:1: ( ( ',' ) )
            // InternalPdfMk.g:4921:1: ( ',' )
            {
            // InternalPdfMk.g:4921:1: ( ',' )
            // InternalPdfMk.g:4922:2: ','
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
    // InternalPdfMk.g:4931:1: rule__TextObject__Group_9__1 : rule__TextObject__Group_9__1__Impl ;
    public final void rule__TextObject__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4935:1: ( rule__TextObject__Group_9__1__Impl )
            // InternalPdfMk.g:4936:2: rule__TextObject__Group_9__1__Impl
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
    // InternalPdfMk.g:4942:1: rule__TextObject__Group_9__1__Impl : ( ( rule__TextObject__ListCounterAssignment_9_1 ) ) ;
    public final void rule__TextObject__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4946:1: ( ( ( rule__TextObject__ListCounterAssignment_9_1 ) ) )
            // InternalPdfMk.g:4947:1: ( ( rule__TextObject__ListCounterAssignment_9_1 ) )
            {
            // InternalPdfMk.g:4947:1: ( ( rule__TextObject__ListCounterAssignment_9_1 ) )
            // InternalPdfMk.g:4948:2: ( rule__TextObject__ListCounterAssignment_9_1 )
            {
             before(grammarAccess.getTextObjectAccess().getListCounterAssignment_9_1()); 
            // InternalPdfMk.g:4949:2: ( rule__TextObject__ListCounterAssignment_9_1 )
            // InternalPdfMk.g:4949:3: rule__TextObject__ListCounterAssignment_9_1
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
    // InternalPdfMk.g:4958:1: rule__StyleObject__Group__0 : rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 ;
    public final void rule__StyleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4962:1: ( rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 )
            // InternalPdfMk.g:4963:2: rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1
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
    // InternalPdfMk.g:4970:1: rule__StyleObject__Group__0__Impl : ( ( rule__StyleObject__KeyAssignment_0 ) ) ;
    public final void rule__StyleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4974:1: ( ( ( rule__StyleObject__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4975:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4975:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            // InternalPdfMk.g:4976:2: ( rule__StyleObject__KeyAssignment_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4977:2: ( rule__StyleObject__KeyAssignment_0 )
            // InternalPdfMk.g:4977:3: rule__StyleObject__KeyAssignment_0
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
    // InternalPdfMk.g:4985:1: rule__StyleObject__Group__1 : rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 ;
    public final void rule__StyleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4989:1: ( rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 )
            // InternalPdfMk.g:4990:2: rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2
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
    // InternalPdfMk.g:4997:1: rule__StyleObject__Group__1__Impl : ( ':' ) ;
    public final void rule__StyleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5001:1: ( ( ':' ) )
            // InternalPdfMk.g:5002:1: ( ':' )
            {
            // InternalPdfMk.g:5002:1: ( ':' )
            // InternalPdfMk.g:5003:2: ':'
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
    // InternalPdfMk.g:5012:1: rule__StyleObject__Group__2 : rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 ;
    public final void rule__StyleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5016:1: ( rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 )
            // InternalPdfMk.g:5017:2: rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:5024:1: rule__StyleObject__Group__2__Impl : ( ( rule__StyleObject__ValueAssignment_2 ) ) ;
    public final void rule__StyleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5028:1: ( ( ( rule__StyleObject__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:5029:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:5029:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            // InternalPdfMk.g:5030:2: ( rule__StyleObject__ValueAssignment_2 )
            {
             before(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:5031:2: ( rule__StyleObject__ValueAssignment_2 )
            // InternalPdfMk.g:5031:3: rule__StyleObject__ValueAssignment_2
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
    // InternalPdfMk.g:5039:1: rule__StyleObject__Group__3 : rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 ;
    public final void rule__StyleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5043:1: ( rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 )
            // InternalPdfMk.g:5044:2: rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:5051:1: rule__StyleObject__Group__3__Impl : ( ( rule__StyleObject__FontSizeAssignment_3 )? ) ;
    public final void rule__StyleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5055:1: ( ( ( rule__StyleObject__FontSizeAssignment_3 )? ) )
            // InternalPdfMk.g:5056:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            {
            // InternalPdfMk.g:5056:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            // InternalPdfMk.g:5057:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            {
             before(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3()); 
            // InternalPdfMk.g:5058:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPdfMk.g:5058:3: rule__StyleObject__FontSizeAssignment_3
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
    // InternalPdfMk.g:5066:1: rule__StyleObject__Group__4 : rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 ;
    public final void rule__StyleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5070:1: ( rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 )
            // InternalPdfMk.g:5071:2: rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:5078:1: rule__StyleObject__Group__4__Impl : ( ( rule__StyleObject__Group_4__0 )? ) ;
    public final void rule__StyleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5082:1: ( ( ( rule__StyleObject__Group_4__0 )? ) )
            // InternalPdfMk.g:5083:1: ( ( rule__StyleObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:5083:1: ( ( rule__StyleObject__Group_4__0 )? )
            // InternalPdfMk.g:5084:2: ( rule__StyleObject__Group_4__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:5085:2: ( rule__StyleObject__Group_4__0 )?
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
                    // InternalPdfMk.g:5085:3: rule__StyleObject__Group_4__0
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
    // InternalPdfMk.g:5093:1: rule__StyleObject__Group__5 : rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 ;
    public final void rule__StyleObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5097:1: ( rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 )
            // InternalPdfMk.g:5098:2: rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:5105:1: rule__StyleObject__Group__5__Impl : ( ( rule__StyleObject__Group_5__0 )? ) ;
    public final void rule__StyleObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5109:1: ( ( ( rule__StyleObject__Group_5__0 )? ) )
            // InternalPdfMk.g:5110:1: ( ( rule__StyleObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:5110:1: ( ( rule__StyleObject__Group_5__0 )? )
            // InternalPdfMk.g:5111:2: ( rule__StyleObject__Group_5__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:5112:2: ( rule__StyleObject__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==22) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalPdfMk.g:5112:3: rule__StyleObject__Group_5__0
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
    // InternalPdfMk.g:5120:1: rule__StyleObject__Group__6 : rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 ;
    public final void rule__StyleObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5124:1: ( rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 )
            // InternalPdfMk.g:5125:2: rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:5132:1: rule__StyleObject__Group__6__Impl : ( ( rule__StyleObject__Group_6__0 )? ) ;
    public final void rule__StyleObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5136:1: ( ( ( rule__StyleObject__Group_6__0 )? ) )
            // InternalPdfMk.g:5137:1: ( ( rule__StyleObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:5137:1: ( ( rule__StyleObject__Group_6__0 )? )
            // InternalPdfMk.g:5138:2: ( rule__StyleObject__Group_6__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:5139:2: ( rule__StyleObject__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==28) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:5139:3: rule__StyleObject__Group_6__0
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
    // InternalPdfMk.g:5147:1: rule__StyleObject__Group__7 : rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 ;
    public final void rule__StyleObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5151:1: ( rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 )
            // InternalPdfMk.g:5152:2: rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:5159:1: rule__StyleObject__Group__7__Impl : ( ( rule__StyleObject__Group_7__0 )? ) ;
    public final void rule__StyleObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5163:1: ( ( ( rule__StyleObject__Group_7__0 )? ) )
            // InternalPdfMk.g:5164:1: ( ( rule__StyleObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:5164:1: ( ( rule__StyleObject__Group_7__0 )? )
            // InternalPdfMk.g:5165:2: ( rule__StyleObject__Group_7__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:5166:2: ( rule__StyleObject__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPdfMk.g:5166:3: rule__StyleObject__Group_7__0
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
    // InternalPdfMk.g:5174:1: rule__StyleObject__Group__8 : rule__StyleObject__Group__8__Impl ;
    public final void rule__StyleObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5178:1: ( rule__StyleObject__Group__8__Impl )
            // InternalPdfMk.g:5179:2: rule__StyleObject__Group__8__Impl
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
    // InternalPdfMk.g:5185:1: rule__StyleObject__Group__8__Impl : ( '}' ) ;
    public final void rule__StyleObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5189:1: ( ( '}' ) )
            // InternalPdfMk.g:5190:1: ( '}' )
            {
            // InternalPdfMk.g:5190:1: ( '}' )
            // InternalPdfMk.g:5191:2: '}'
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
    // InternalPdfMk.g:5201:1: rule__StyleObject__Group_4__0 : rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 ;
    public final void rule__StyleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5205:1: ( rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 )
            // InternalPdfMk.g:5206:2: rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:5213:1: rule__StyleObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5217:1: ( ( ',' ) )
            // InternalPdfMk.g:5218:1: ( ',' )
            {
            // InternalPdfMk.g:5218:1: ( ',' )
            // InternalPdfMk.g:5219:2: ','
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
    // InternalPdfMk.g:5228:1: rule__StyleObject__Group_4__1 : rule__StyleObject__Group_4__1__Impl ;
    public final void rule__StyleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5232:1: ( rule__StyleObject__Group_4__1__Impl )
            // InternalPdfMk.g:5233:2: rule__StyleObject__Group_4__1__Impl
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
    // InternalPdfMk.g:5239:1: rule__StyleObject__Group_4__1__Impl : ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) ;
    public final void rule__StyleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5243:1: ( ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) )
            // InternalPdfMk.g:5244:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            {
            // InternalPdfMk.g:5244:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            // InternalPdfMk.g:5245:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1()); 
            // InternalPdfMk.g:5246:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            // InternalPdfMk.g:5246:3: rule__StyleObject__TypeFaceAssignment_4_1
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
    // InternalPdfMk.g:5255:1: rule__StyleObject__Group_5__0 : rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 ;
    public final void rule__StyleObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5259:1: ( rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 )
            // InternalPdfMk.g:5260:2: rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPdfMk.g:5267:1: rule__StyleObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5271:1: ( ( ',' ) )
            // InternalPdfMk.g:5272:1: ( ',' )
            {
            // InternalPdfMk.g:5272:1: ( ',' )
            // InternalPdfMk.g:5273:2: ','
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
    // InternalPdfMk.g:5282:1: rule__StyleObject__Group_5__1 : rule__StyleObject__Group_5__1__Impl ;
    public final void rule__StyleObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5286:1: ( rule__StyleObject__Group_5__1__Impl )
            // InternalPdfMk.g:5287:2: rule__StyleObject__Group_5__1__Impl
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
    // InternalPdfMk.g:5293:1: rule__StyleObject__Group_5__1__Impl : ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) ;
    public final void rule__StyleObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5297:1: ( ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) )
            // InternalPdfMk.g:5298:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            {
            // InternalPdfMk.g:5298:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            // InternalPdfMk.g:5299:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1()); 
            // InternalPdfMk.g:5300:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            // InternalPdfMk.g:5300:3: rule__StyleObject__AlignmentAssignment_5_1
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
    // InternalPdfMk.g:5309:1: rule__StyleObject__Group_6__0 : rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 ;
    public final void rule__StyleObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5313:1: ( rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 )
            // InternalPdfMk.g:5314:2: rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPdfMk.g:5321:1: rule__StyleObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5325:1: ( ( ',' ) )
            // InternalPdfMk.g:5326:1: ( ',' )
            {
            // InternalPdfMk.g:5326:1: ( ',' )
            // InternalPdfMk.g:5327:2: ','
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
    // InternalPdfMk.g:5336:1: rule__StyleObject__Group_6__1 : rule__StyleObject__Group_6__1__Impl ;
    public final void rule__StyleObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5340:1: ( rule__StyleObject__Group_6__1__Impl )
            // InternalPdfMk.g:5341:2: rule__StyleObject__Group_6__1__Impl
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
    // InternalPdfMk.g:5347:1: rule__StyleObject__Group_6__1__Impl : ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__StyleObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5351:1: ( ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:5352:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:5352:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:5353:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:5354:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:5354:3: rule__StyleObject__ItalicsAssignment_6_1
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
    // InternalPdfMk.g:5363:1: rule__StyleObject__Group_7__0 : rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 ;
    public final void rule__StyleObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5367:1: ( rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 )
            // InternalPdfMk.g:5368:2: rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPdfMk.g:5375:1: rule__StyleObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5379:1: ( ( ',' ) )
            // InternalPdfMk.g:5380:1: ( ',' )
            {
            // InternalPdfMk.g:5380:1: ( ',' )
            // InternalPdfMk.g:5381:2: ','
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
    // InternalPdfMk.g:5390:1: rule__StyleObject__Group_7__1 : rule__StyleObject__Group_7__1__Impl ;
    public final void rule__StyleObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5394:1: ( rule__StyleObject__Group_7__1__Impl )
            // InternalPdfMk.g:5395:2: rule__StyleObject__Group_7__1__Impl
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
    // InternalPdfMk.g:5401:1: rule__StyleObject__Group_7__1__Impl : ( ( rule__StyleObject__MarginAssignment_7_1 ) ) ;
    public final void rule__StyleObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5405:1: ( ( ( rule__StyleObject__MarginAssignment_7_1 ) ) )
            // InternalPdfMk.g:5406:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            {
            // InternalPdfMk.g:5406:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            // InternalPdfMk.g:5407:2: ( rule__StyleObject__MarginAssignment_7_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getMarginAssignment_7_1()); 
            // InternalPdfMk.g:5408:2: ( rule__StyleObject__MarginAssignment_7_1 )
            // InternalPdfMk.g:5408:3: rule__StyleObject__MarginAssignment_7_1
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
    // InternalPdfMk.g:5417:1: rule__StyleObjects__Group__0 : rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 ;
    public final void rule__StyleObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5421:1: ( rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 )
            // InternalPdfMk.g:5422:2: rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPdfMk.g:5429:1: rule__StyleObjects__Group__0__Impl : ( '{' ) ;
    public final void rule__StyleObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5433:1: ( ( '{' ) )
            // InternalPdfMk.g:5434:1: ( '{' )
            {
            // InternalPdfMk.g:5434:1: ( '{' )
            // InternalPdfMk.g:5435:2: '{'
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
    // InternalPdfMk.g:5444:1: rule__StyleObjects__Group__1 : rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 ;
    public final void rule__StyleObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5448:1: ( rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 )
            // InternalPdfMk.g:5449:2: rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:5456:1: rule__StyleObjects__Group__1__Impl : ( ( rule__StyleObjects__Group_1__0 ) ) ;
    public final void rule__StyleObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5460:1: ( ( ( rule__StyleObjects__Group_1__0 ) ) )
            // InternalPdfMk.g:5461:1: ( ( rule__StyleObjects__Group_1__0 ) )
            {
            // InternalPdfMk.g:5461:1: ( ( rule__StyleObjects__Group_1__0 ) )
            // InternalPdfMk.g:5462:2: ( rule__StyleObjects__Group_1__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:5463:2: ( rule__StyleObjects__Group_1__0 )
            // InternalPdfMk.g:5463:3: rule__StyleObjects__Group_1__0
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
    // InternalPdfMk.g:5471:1: rule__StyleObjects__Group__2 : rule__StyleObjects__Group__2__Impl ;
    public final void rule__StyleObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5475:1: ( rule__StyleObjects__Group__2__Impl )
            // InternalPdfMk.g:5476:2: rule__StyleObjects__Group__2__Impl
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
    // InternalPdfMk.g:5482:1: rule__StyleObjects__Group__2__Impl : ( '}' ) ;
    public final void rule__StyleObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5486:1: ( ( '}' ) )
            // InternalPdfMk.g:5487:1: ( '}' )
            {
            // InternalPdfMk.g:5487:1: ( '}' )
            // InternalPdfMk.g:5488:2: '}'
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
    // InternalPdfMk.g:5498:1: rule__StyleObjects__Group_1__0 : rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 ;
    public final void rule__StyleObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5502:1: ( rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 )
            // InternalPdfMk.g:5503:2: rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:5510:1: rule__StyleObjects__Group_1__0__Impl : ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__StyleObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5514:1: ( ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:5515:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5515:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:5516:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:5517:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:5517:3: rule__StyleObjects__ValueAssignment_1_0
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
    // InternalPdfMk.g:5525:1: rule__StyleObjects__Group_1__1 : rule__StyleObjects__Group_1__1__Impl ;
    public final void rule__StyleObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5529:1: ( rule__StyleObjects__Group_1__1__Impl )
            // InternalPdfMk.g:5530:2: rule__StyleObjects__Group_1__1__Impl
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
    // InternalPdfMk.g:5536:1: rule__StyleObjects__Group_1__1__Impl : ( ( rule__StyleObjects__Group_1_1__0 )* ) ;
    public final void rule__StyleObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5540:1: ( ( ( rule__StyleObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5541:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5541:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:5542:2: ( rule__StyleObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5543:2: ( rule__StyleObjects__Group_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPdfMk.g:5543:3: rule__StyleObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StyleObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPdfMk.g:5552:1: rule__StyleObjects__Group_1_1__0 : rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 ;
    public final void rule__StyleObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5556:1: ( rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 )
            // InternalPdfMk.g:5557:2: rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPdfMk.g:5564:1: rule__StyleObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__StyleObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5568:1: ( ( ',' ) )
            // InternalPdfMk.g:5569:1: ( ',' )
            {
            // InternalPdfMk.g:5569:1: ( ',' )
            // InternalPdfMk.g:5570:2: ','
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
    // InternalPdfMk.g:5579:1: rule__StyleObjects__Group_1_1__1 : rule__StyleObjects__Group_1_1__1__Impl ;
    public final void rule__StyleObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5583:1: ( rule__StyleObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:5584:2: rule__StyleObjects__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5590:1: rule__StyleObjects__Group_1_1__1__Impl : ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__StyleObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5594:1: ( ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5595:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5595:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:5596:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:5597:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:5597:3: rule__StyleObjects__ValueAssignment_1_1_1
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
    // InternalPdfMk.g:5606:1: rule__InnerColumnObject__Group__0 : rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 ;
    public final void rule__InnerColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5610:1: ( rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 )
            // InternalPdfMk.g:5611:2: rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPdfMk.g:5618:1: rule__InnerColumnObject__Group__0__Impl : ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__InnerColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5622:1: ( ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5623:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5623:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5624:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5625:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:5625:3: rule__InnerColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:5633:1: rule__InnerColumnObject__Group__1 : rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 ;
    public final void rule__InnerColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5637:1: ( rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 )
            // InternalPdfMk.g:5638:2: rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:5645:1: rule__InnerColumnObject__Group__1__Impl : ( ( rule__InnerColumnObject__Group_1__0 ) ) ;
    public final void rule__InnerColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5649:1: ( ( ( rule__InnerColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5650:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5650:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5651:2: ( rule__InnerColumnObject__Group_1__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5652:2: ( rule__InnerColumnObject__Group_1__0 )
            // InternalPdfMk.g:5652:3: rule__InnerColumnObject__Group_1__0
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
    // InternalPdfMk.g:5660:1: rule__InnerColumnObject__Group__2 : rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 ;
    public final void rule__InnerColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5664:1: ( rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 )
            // InternalPdfMk.g:5665:2: rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:5672:1: rule__InnerColumnObject__Group__2__Impl : ( ( rule__InnerColumnObject__Group_2__0 ) ) ;
    public final void rule__InnerColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5676:1: ( ( ( rule__InnerColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:5677:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:5677:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:5678:2: ( rule__InnerColumnObject__Group_2__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:5679:2: ( rule__InnerColumnObject__Group_2__0 )
            // InternalPdfMk.g:5679:3: rule__InnerColumnObject__Group_2__0
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
    // InternalPdfMk.g:5687:1: rule__InnerColumnObject__Group__3 : rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 ;
    public final void rule__InnerColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5691:1: ( rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 )
            // InternalPdfMk.g:5692:2: rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:5699:1: rule__InnerColumnObject__Group__3__Impl : ( ( rule__InnerColumnObject__Group_3__0 ) ) ;
    public final void rule__InnerColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5703:1: ( ( ( rule__InnerColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5704:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5704:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:5705:2: ( rule__InnerColumnObject__Group_3__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5706:2: ( rule__InnerColumnObject__Group_3__0 )
            // InternalPdfMk.g:5706:3: rule__InnerColumnObject__Group_3__0
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
    // InternalPdfMk.g:5714:1: rule__InnerColumnObject__Group__4 : rule__InnerColumnObject__Group__4__Impl ;
    public final void rule__InnerColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5718:1: ( rule__InnerColumnObject__Group__4__Impl )
            // InternalPdfMk.g:5719:2: rule__InnerColumnObject__Group__4__Impl
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
    // InternalPdfMk.g:5725:1: rule__InnerColumnObject__Group__4__Impl : ( ']' ) ;
    public final void rule__InnerColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5729:1: ( ( ']' ) )
            // InternalPdfMk.g:5730:1: ( ']' )
            {
            // InternalPdfMk.g:5730:1: ( ']' )
            // InternalPdfMk.g:5731:2: ']'
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
    // InternalPdfMk.g:5741:1: rule__InnerColumnObject__Group_1__0 : rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 ;
    public final void rule__InnerColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5745:1: ( rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 )
            // InternalPdfMk.g:5746:2: rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPdfMk.g:5753:1: rule__InnerColumnObject__Group_1__0__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__InnerColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5757:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:5758:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:5758:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:5759:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:5760:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPdfMk.g:5760:3: rule__InnerColumnObject__TextAssignment_1_0
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
    // InternalPdfMk.g:5768:1: rule__InnerColumnObject__Group_1__1 : rule__InnerColumnObject__Group_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5772:1: ( rule__InnerColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5773:2: rule__InnerColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:5779:1: rule__InnerColumnObject__Group_1__1__Impl : ( ( rule__InnerColumnObject__Group_1_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5783:1: ( ( ( rule__InnerColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5784:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5784:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5785:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5786:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==RULE_STRING) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalPdfMk.g:5786:3: rule__InnerColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPdfMk.g:5795:1: rule__InnerColumnObject__Group_1_1__0 : rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 ;
    public final void rule__InnerColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5799:1: ( rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:5800:2: rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1
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
    // InternalPdfMk.g:5807:1: rule__InnerColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5811:1: ( ( ',' ) )
            // InternalPdfMk.g:5812:1: ( ',' )
            {
            // InternalPdfMk.g:5812:1: ( ',' )
            // InternalPdfMk.g:5813:2: ','
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
    // InternalPdfMk.g:5822:1: rule__InnerColumnObject__Group_1_1__1 : rule__InnerColumnObject__Group_1_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5826:1: ( rule__InnerColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5827:2: rule__InnerColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5833:1: rule__InnerColumnObject__Group_1_1__1__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5837:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5838:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5838:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:5839:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:5840:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:5840:3: rule__InnerColumnObject__TextAssignment_1_1_1
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
    // InternalPdfMk.g:5849:1: rule__InnerColumnObject__Group_2__0 : rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 ;
    public final void rule__InnerColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5853:1: ( rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 )
            // InternalPdfMk.g:5854:2: rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:5861:1: rule__InnerColumnObject__Group_2__0__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__InnerColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5865:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:5866:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:5866:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:5867:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:5868:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==27) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalPdfMk.g:5868:3: rule__InnerColumnObject__TextObjectAssignment_2_0
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
    // InternalPdfMk.g:5876:1: rule__InnerColumnObject__Group_2__1 : rule__InnerColumnObject__Group_2__1__Impl ;
    public final void rule__InnerColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5880:1: ( rule__InnerColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:5881:2: rule__InnerColumnObject__Group_2__1__Impl
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
    // InternalPdfMk.g:5887:1: rule__InnerColumnObject__Group_2__1__Impl : ( ( rule__InnerColumnObject__Group_2_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5891:1: ( ( ( rule__InnerColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:5892:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:5892:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:5893:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:5894:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==18) ) {
                        int LA31_3 = input.LA(3);

                        if ( (LA31_3==27) ) {
                            alt31=1;
                        }


                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPdfMk.g:5894:3: rule__InnerColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPdfMk.g:5903:1: rule__InnerColumnObject__Group_2_1__0 : rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 ;
    public final void rule__InnerColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5907:1: ( rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:5908:2: rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1
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
    // InternalPdfMk.g:5915:1: rule__InnerColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5919:1: ( ( ',' ) )
            // InternalPdfMk.g:5920:1: ( ',' )
            {
            // InternalPdfMk.g:5920:1: ( ',' )
            // InternalPdfMk.g:5921:2: ','
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
    // InternalPdfMk.g:5930:1: rule__InnerColumnObject__Group_2_1__1 : rule__InnerColumnObject__Group_2_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5934:1: ( rule__InnerColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:5935:2: rule__InnerColumnObject__Group_2_1__1__Impl
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
    // InternalPdfMk.g:5941:1: rule__InnerColumnObject__Group_2_1__1__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5945:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:5946:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:5946:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:5947:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:5948:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:5948:3: rule__InnerColumnObject__TextObjectAssignment_2_1_1
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
    // InternalPdfMk.g:5957:1: rule__InnerColumnObject__Group_3__0 : rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 ;
    public final void rule__InnerColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5961:1: ( rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 )
            // InternalPdfMk.g:5962:2: rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:5969:1: rule__InnerColumnObject__Group_3__0__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__InnerColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5973:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:5974:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:5974:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:5975:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:5976:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPdfMk.g:5976:3: rule__InnerColumnObject__ColumnAssignment_3_0
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
    // InternalPdfMk.g:5984:1: rule__InnerColumnObject__Group_3__1 : rule__InnerColumnObject__Group_3__1__Impl ;
    public final void rule__InnerColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5988:1: ( rule__InnerColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:5989:2: rule__InnerColumnObject__Group_3__1__Impl
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
    // InternalPdfMk.g:5995:1: rule__InnerColumnObject__Group_3__1__Impl : ( ( rule__InnerColumnObject__Group_3_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5999:1: ( ( ( rule__InnerColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:6000:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:6000:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:6001:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:6002:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPdfMk.g:6002:3: rule__InnerColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPdfMk.g:6011:1: rule__InnerColumnObject__Group_3_1__0 : rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 ;
    public final void rule__InnerColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6015:1: ( rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:6016:2: rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1
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
    // InternalPdfMk.g:6023:1: rule__InnerColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6027:1: ( ( ',' ) )
            // InternalPdfMk.g:6028:1: ( ',' )
            {
            // InternalPdfMk.g:6028:1: ( ',' )
            // InternalPdfMk.g:6029:2: ','
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
    // InternalPdfMk.g:6038:1: rule__InnerColumnObject__Group_3_1__1 : rule__InnerColumnObject__Group_3_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6042:1: ( rule__InnerColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:6043:2: rule__InnerColumnObject__Group_3_1__1__Impl
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
    // InternalPdfMk.g:6049:1: rule__InnerColumnObject__Group_3_1__1__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6053:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:6054:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:6054:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:6055:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:6056:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:6056:3: rule__InnerColumnObject__ColumnAssignment_3_1_1
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
    // InternalPdfMk.g:6065:1: rule__ColumnObject__Group__0 : rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 ;
    public final void rule__ColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6069:1: ( rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 )
            // InternalPdfMk.g:6070:2: rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPdfMk.g:6077:1: rule__ColumnObject__Group__0__Impl : ( ( rule__ColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__ColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6081:1: ( ( ( rule__ColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6082:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6082:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6083:2: ( rule__ColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6084:2: ( rule__ColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:6084:3: rule__ColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:6092:1: rule__ColumnObject__Group__1 : rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 ;
    public final void rule__ColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6096:1: ( rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 )
            // InternalPdfMk.g:6097:2: rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:6104:1: rule__ColumnObject__Group__1__Impl : ( ( rule__ColumnObject__Group_1__0 ) ) ;
    public final void rule__ColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6108:1: ( ( ( rule__ColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:6109:1: ( ( rule__ColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:6109:1: ( ( rule__ColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:6110:2: ( rule__ColumnObject__Group_1__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:6111:2: ( rule__ColumnObject__Group_1__0 )
            // InternalPdfMk.g:6111:3: rule__ColumnObject__Group_1__0
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
    // InternalPdfMk.g:6119:1: rule__ColumnObject__Group__2 : rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 ;
    public final void rule__ColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6123:1: ( rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 )
            // InternalPdfMk.g:6124:2: rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:6131:1: rule__ColumnObject__Group__2__Impl : ( ( rule__ColumnObject__Group_2__0 ) ) ;
    public final void rule__ColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6135:1: ( ( ( rule__ColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:6136:1: ( ( rule__ColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:6136:1: ( ( rule__ColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:6137:2: ( rule__ColumnObject__Group_2__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:6138:2: ( rule__ColumnObject__Group_2__0 )
            // InternalPdfMk.g:6138:3: rule__ColumnObject__Group_2__0
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
    // InternalPdfMk.g:6146:1: rule__ColumnObject__Group__3 : rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 ;
    public final void rule__ColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6150:1: ( rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 )
            // InternalPdfMk.g:6151:2: rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalPdfMk.g:6158:1: rule__ColumnObject__Group__3__Impl : ( ( rule__ColumnObject__Group_3__0 ) ) ;
    public final void rule__ColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6162:1: ( ( ( rule__ColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:6163:1: ( ( rule__ColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:6163:1: ( ( rule__ColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:6164:2: ( rule__ColumnObject__Group_3__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:6165:2: ( rule__ColumnObject__Group_3__0 )
            // InternalPdfMk.g:6165:3: rule__ColumnObject__Group_3__0
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
    // InternalPdfMk.g:6173:1: rule__ColumnObject__Group__4 : rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 ;
    public final void rule__ColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6177:1: ( rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 )
            // InternalPdfMk.g:6178:2: rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:6185:1: rule__ColumnObject__Group__4__Impl : ( ( rule__ColumnObject__Group_4__0 ) ) ;
    public final void rule__ColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6189:1: ( ( ( rule__ColumnObject__Group_4__0 ) ) )
            // InternalPdfMk.g:6190:1: ( ( rule__ColumnObject__Group_4__0 ) )
            {
            // InternalPdfMk.g:6190:1: ( ( rule__ColumnObject__Group_4__0 ) )
            // InternalPdfMk.g:6191:2: ( rule__ColumnObject__Group_4__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:6192:2: ( rule__ColumnObject__Group_4__0 )
            // InternalPdfMk.g:6192:3: rule__ColumnObject__Group_4__0
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
    // InternalPdfMk.g:6200:1: rule__ColumnObject__Group__5 : rule__ColumnObject__Group__5__Impl ;
    public final void rule__ColumnObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6204:1: ( rule__ColumnObject__Group__5__Impl )
            // InternalPdfMk.g:6205:2: rule__ColumnObject__Group__5__Impl
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
    // InternalPdfMk.g:6211:1: rule__ColumnObject__Group__5__Impl : ( ']' ) ;
    public final void rule__ColumnObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6215:1: ( ( ']' ) )
            // InternalPdfMk.g:6216:1: ( ']' )
            {
            // InternalPdfMk.g:6216:1: ( ']' )
            // InternalPdfMk.g:6217:2: ']'
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
    // InternalPdfMk.g:6227:1: rule__ColumnObject__Group_1__0 : rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 ;
    public final void rule__ColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6231:1: ( rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 )
            // InternalPdfMk.g:6232:2: rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPdfMk.g:6239:1: rule__ColumnObject__Group_1__0__Impl : ( ( rule__ColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__ColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6243:1: ( ( ( rule__ColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:6244:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:6244:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:6245:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:6246:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPdfMk.g:6246:3: rule__ColumnObject__TextAssignment_1_0
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
    // InternalPdfMk.g:6254:1: rule__ColumnObject__Group_1__1 : rule__ColumnObject__Group_1__1__Impl ;
    public final void rule__ColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6258:1: ( rule__ColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:6259:2: rule__ColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:6265:1: rule__ColumnObject__Group_1__1__Impl : ( ( rule__ColumnObject__Group_1_1__0 )* ) ;
    public final void rule__ColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6269:1: ( ( ( rule__ColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:6270:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:6270:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:6271:2: ( rule__ColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:6272:2: ( rule__ColumnObject__Group_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==20) ) {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==RULE_STRING) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalPdfMk.g:6272:3: rule__ColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPdfMk.g:6281:1: rule__ColumnObject__Group_1_1__0 : rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 ;
    public final void rule__ColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6285:1: ( rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:6286:2: rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1
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
    // InternalPdfMk.g:6293:1: rule__ColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6297:1: ( ( ',' ) )
            // InternalPdfMk.g:6298:1: ( ',' )
            {
            // InternalPdfMk.g:6298:1: ( ',' )
            // InternalPdfMk.g:6299:2: ','
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
    // InternalPdfMk.g:6308:1: rule__ColumnObject__Group_1_1__1 : rule__ColumnObject__Group_1_1__1__Impl ;
    public final void rule__ColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6312:1: ( rule__ColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:6313:2: rule__ColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:6319:1: rule__ColumnObject__Group_1_1__1__Impl : ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__ColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6323:1: ( ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:6324:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:6324:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:6325:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:6326:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:6326:3: rule__ColumnObject__TextAssignment_1_1_1
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
    // InternalPdfMk.g:6335:1: rule__ColumnObject__Group_2__0 : rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 ;
    public final void rule__ColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6339:1: ( rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 )
            // InternalPdfMk.g:6340:2: rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:6347:1: rule__ColumnObject__Group_2__0__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__ColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6351:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:6352:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:6352:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:6353:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:6354:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==27) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalPdfMk.g:6354:3: rule__ColumnObject__TextObjectAssignment_2_0
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
    // InternalPdfMk.g:6362:1: rule__ColumnObject__Group_2__1 : rule__ColumnObject__Group_2__1__Impl ;
    public final void rule__ColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6366:1: ( rule__ColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:6367:2: rule__ColumnObject__Group_2__1__Impl
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
    // InternalPdfMk.g:6373:1: rule__ColumnObject__Group_2__1__Impl : ( ( rule__ColumnObject__Group_2_1__0 )* ) ;
    public final void rule__ColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6377:1: ( ( ( rule__ColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:6378:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:6378:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:6379:2: ( rule__ColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:6380:2: ( rule__ColumnObject__Group_2_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==18) ) {
                        int LA37_3 = input.LA(3);

                        if ( (LA37_3==27) ) {
                            alt37=1;
                        }


                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalPdfMk.g:6380:3: rule__ColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalPdfMk.g:6389:1: rule__ColumnObject__Group_2_1__0 : rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 ;
    public final void rule__ColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6393:1: ( rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:6394:2: rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1
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
    // InternalPdfMk.g:6401:1: rule__ColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6405:1: ( ( ',' ) )
            // InternalPdfMk.g:6406:1: ( ',' )
            {
            // InternalPdfMk.g:6406:1: ( ',' )
            // InternalPdfMk.g:6407:2: ','
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
    // InternalPdfMk.g:6416:1: rule__ColumnObject__Group_2_1__1 : rule__ColumnObject__Group_2_1__1__Impl ;
    public final void rule__ColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6420:1: ( rule__ColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:6421:2: rule__ColumnObject__Group_2_1__1__Impl
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
    // InternalPdfMk.g:6427:1: rule__ColumnObject__Group_2_1__1__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__ColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6431:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:6432:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:6432:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:6433:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:6434:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:6434:3: rule__ColumnObject__TextObjectAssignment_2_1_1
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
    // InternalPdfMk.g:6443:1: rule__ColumnObject__Group_3__0 : rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 ;
    public final void rule__ColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6447:1: ( rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 )
            // InternalPdfMk.g:6448:2: rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:6455:1: rule__ColumnObject__Group_3__0__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__ColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6459:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:6460:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:6460:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:6461:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:6462:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPdfMk.g:6462:3: rule__ColumnObject__ColumnAssignment_3_0
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
    // InternalPdfMk.g:6470:1: rule__ColumnObject__Group_3__1 : rule__ColumnObject__Group_3__1__Impl ;
    public final void rule__ColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6474:1: ( rule__ColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:6475:2: rule__ColumnObject__Group_3__1__Impl
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
    // InternalPdfMk.g:6481:1: rule__ColumnObject__Group_3__1__Impl : ( ( rule__ColumnObject__Group_3_1__0 )* ) ;
    public final void rule__ColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6485:1: ( ( ( rule__ColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:6486:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:6486:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:6487:2: ( rule__ColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:6488:2: ( rule__ColumnObject__Group_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==20) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==18) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalPdfMk.g:6488:3: rule__ColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPdfMk.g:6497:1: rule__ColumnObject__Group_3_1__0 : rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 ;
    public final void rule__ColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6501:1: ( rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:6502:2: rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1
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
    // InternalPdfMk.g:6509:1: rule__ColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6513:1: ( ( ',' ) )
            // InternalPdfMk.g:6514:1: ( ',' )
            {
            // InternalPdfMk.g:6514:1: ( ',' )
            // InternalPdfMk.g:6515:2: ','
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
    // InternalPdfMk.g:6524:1: rule__ColumnObject__Group_3_1__1 : rule__ColumnObject__Group_3_1__1__Impl ;
    public final void rule__ColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6528:1: ( rule__ColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:6529:2: rule__ColumnObject__Group_3_1__1__Impl
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
    // InternalPdfMk.g:6535:1: rule__ColumnObject__Group_3_1__1__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__ColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6539:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:6540:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:6540:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:6541:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:6542:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:6542:3: rule__ColumnObject__ColumnAssignment_3_1_1
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
    // InternalPdfMk.g:6551:1: rule__ColumnObject__Group_4__0 : rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 ;
    public final void rule__ColumnObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6555:1: ( rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 )
            // InternalPdfMk.g:6556:2: rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPdfMk.g:6563:1: rule__ColumnObject__Group_4__0__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) ;
    public final void rule__ColumnObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6567:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) )
            // InternalPdfMk.g:6568:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            {
            // InternalPdfMk.g:6568:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            // InternalPdfMk.g:6569:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_0()); 
            // InternalPdfMk.g:6570:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPdfMk.g:6570:3: rule__ColumnObject__InnerColumnAssignment_4_0
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
    // InternalPdfMk.g:6578:1: rule__ColumnObject__Group_4__1 : rule__ColumnObject__Group_4__1__Impl ;
    public final void rule__ColumnObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6582:1: ( rule__ColumnObject__Group_4__1__Impl )
            // InternalPdfMk.g:6583:2: rule__ColumnObject__Group_4__1__Impl
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
    // InternalPdfMk.g:6589:1: rule__ColumnObject__Group_4__1__Impl : ( ( rule__ColumnObject__Group_4_1__0 )* ) ;
    public final void rule__ColumnObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6593:1: ( ( ( rule__ColumnObject__Group_4_1__0 )* ) )
            // InternalPdfMk.g:6594:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:6594:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            // InternalPdfMk.g:6595:2: ( rule__ColumnObject__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4_1()); 
            // InternalPdfMk.g:6596:2: ( rule__ColumnObject__Group_4_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==20) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPdfMk.g:6596:3: rule__ColumnObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPdfMk.g:6605:1: rule__ColumnObject__Group_4_1__0 : rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 ;
    public final void rule__ColumnObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6609:1: ( rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 )
            // InternalPdfMk.g:6610:2: rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:6617:1: rule__ColumnObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6621:1: ( ( ',' ) )
            // InternalPdfMk.g:6622:1: ( ',' )
            {
            // InternalPdfMk.g:6622:1: ( ',' )
            // InternalPdfMk.g:6623:2: ','
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
    // InternalPdfMk.g:6632:1: rule__ColumnObject__Group_4_1__1 : rule__ColumnObject__Group_4_1__1__Impl ;
    public final void rule__ColumnObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6636:1: ( rule__ColumnObject__Group_4_1__1__Impl )
            // InternalPdfMk.g:6637:2: rule__ColumnObject__Group_4_1__1__Impl
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
    // InternalPdfMk.g:6643:1: rule__ColumnObject__Group_4_1__1__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) ;
    public final void rule__ColumnObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6647:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:6648:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:6648:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            // InternalPdfMk.g:6649:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_1_1()); 
            // InternalPdfMk.g:6650:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            // InternalPdfMk.g:6650:3: rule__ColumnObject__InnerColumnAssignment_4_1_1
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
    // InternalPdfMk.g:6659:1: rule__ImageObject__Group__0 : rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 ;
    public final void rule__ImageObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6663:1: ( rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 )
            // InternalPdfMk.g:6664:2: rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6671:1: rule__ImageObject__Group__0__Impl : ( ( rule__ImageObject__ValueAssignment_0 ) ) ;
    public final void rule__ImageObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6675:1: ( ( ( rule__ImageObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6676:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6676:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6677:2: ( rule__ImageObject__ValueAssignment_0 )
            {
             before(grammarAccess.getImageObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6678:2: ( rule__ImageObject__ValueAssignment_0 )
            // InternalPdfMk.g:6678:3: rule__ImageObject__ValueAssignment_0
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
    // InternalPdfMk.g:6686:1: rule__ImageObject__Group__1 : rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 ;
    public final void rule__ImageObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6690:1: ( rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 )
            // InternalPdfMk.g:6691:2: rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6698:1: rule__ImageObject__Group__1__Impl : ( ( rule__ImageObject__ImageAssignment_1 )? ) ;
    public final void rule__ImageObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6702:1: ( ( ( rule__ImageObject__ImageAssignment_1 )? ) )
            // InternalPdfMk.g:6703:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            {
            // InternalPdfMk.g:6703:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            // InternalPdfMk.g:6704:2: ( rule__ImageObject__ImageAssignment_1 )?
            {
             before(grammarAccess.getImageObjectAccess().getImageAssignment_1()); 
            // InternalPdfMk.g:6705:2: ( rule__ImageObject__ImageAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPdfMk.g:6705:3: rule__ImageObject__ImageAssignment_1
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
    // InternalPdfMk.g:6713:1: rule__ImageObject__Group__2 : rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 ;
    public final void rule__ImageObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6717:1: ( rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 )
            // InternalPdfMk.g:6718:2: rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6725:1: rule__ImageObject__Group__2__Impl : ( ( rule__ImageObject__Group_2__0 )? ) ;
    public final void rule__ImageObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6729:1: ( ( ( rule__ImageObject__Group_2__0 )? ) )
            // InternalPdfMk.g:6730:1: ( ( rule__ImageObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:6730:1: ( ( rule__ImageObject__Group_2__0 )? )
            // InternalPdfMk.g:6731:2: ( rule__ImageObject__Group_2__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:6732:2: ( rule__ImageObject__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==30) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalPdfMk.g:6732:3: rule__ImageObject__Group_2__0
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
    // InternalPdfMk.g:6740:1: rule__ImageObject__Group__3 : rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 ;
    public final void rule__ImageObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6744:1: ( rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 )
            // InternalPdfMk.g:6745:2: rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6752:1: rule__ImageObject__Group__3__Impl : ( ( rule__ImageObject__Group_3__0 )? ) ;
    public final void rule__ImageObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6756:1: ( ( ( rule__ImageObject__Group_3__0 )? ) )
            // InternalPdfMk.g:6757:1: ( ( rule__ImageObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:6757:1: ( ( rule__ImageObject__Group_3__0 )? )
            // InternalPdfMk.g:6758:2: ( rule__ImageObject__Group_3__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:6759:2: ( rule__ImageObject__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==34) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalPdfMk.g:6759:3: rule__ImageObject__Group_3__0
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
    // InternalPdfMk.g:6767:1: rule__ImageObject__Group__4 : rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 ;
    public final void rule__ImageObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6771:1: ( rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 )
            // InternalPdfMk.g:6772:2: rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6779:1: rule__ImageObject__Group__4__Impl : ( ( rule__ImageObject__Group_4__0 )? ) ;
    public final void rule__ImageObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6783:1: ( ( ( rule__ImageObject__Group_4__0 )? ) )
            // InternalPdfMk.g:6784:1: ( ( rule__ImageObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:6784:1: ( ( rule__ImageObject__Group_4__0 )? )
            // InternalPdfMk.g:6785:2: ( rule__ImageObject__Group_4__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:6786:2: ( rule__ImageObject__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==37) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalPdfMk.g:6786:3: rule__ImageObject__Group_4__0
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
    // InternalPdfMk.g:6794:1: rule__ImageObject__Group__5 : rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 ;
    public final void rule__ImageObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6798:1: ( rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 )
            // InternalPdfMk.g:6799:2: rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6806:1: rule__ImageObject__Group__5__Impl : ( ( rule__ImageObject__Group_5__0 )? ) ;
    public final void rule__ImageObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6810:1: ( ( ( rule__ImageObject__Group_5__0 )? ) )
            // InternalPdfMk.g:6811:1: ( ( rule__ImageObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:6811:1: ( ( rule__ImageObject__Group_5__0 )? )
            // InternalPdfMk.g:6812:2: ( rule__ImageObject__Group_5__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6813:2: ( rule__ImageObject__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==36) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalPdfMk.g:6813:3: rule__ImageObject__Group_5__0
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
    // InternalPdfMk.g:6821:1: rule__ImageObject__Group__6 : rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 ;
    public final void rule__ImageObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6825:1: ( rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 )
            // InternalPdfMk.g:6826:2: rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6833:1: rule__ImageObject__Group__6__Impl : ( ( rule__ImageObject__Group_6__0 )? ) ;
    public final void rule__ImageObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6837:1: ( ( ( rule__ImageObject__Group_6__0 )? ) )
            // InternalPdfMk.g:6838:1: ( ( rule__ImageObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:6838:1: ( ( rule__ImageObject__Group_6__0 )? )
            // InternalPdfMk.g:6839:2: ( rule__ImageObject__Group_6__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:6840:2: ( rule__ImageObject__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPdfMk.g:6840:3: rule__ImageObject__Group_6__0
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
    // InternalPdfMk.g:6848:1: rule__ImageObject__Group__7 : rule__ImageObject__Group__7__Impl ;
    public final void rule__ImageObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6852:1: ( rule__ImageObject__Group__7__Impl )
            // InternalPdfMk.g:6853:2: rule__ImageObject__Group__7__Impl
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
    // InternalPdfMk.g:6859:1: rule__ImageObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ImageObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6863:1: ( ( '}' ) )
            // InternalPdfMk.g:6864:1: ( '}' )
            {
            // InternalPdfMk.g:6864:1: ( '}' )
            // InternalPdfMk.g:6865:2: '}'
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
    // InternalPdfMk.g:6875:1: rule__ImageObject__Group_2__0 : rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 ;
    public final void rule__ImageObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6879:1: ( rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 )
            // InternalPdfMk.g:6880:2: rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPdfMk.g:6887:1: rule__ImageObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6891:1: ( ( ',' ) )
            // InternalPdfMk.g:6892:1: ( ',' )
            {
            // InternalPdfMk.g:6892:1: ( ',' )
            // InternalPdfMk.g:6893:2: ','
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
    // InternalPdfMk.g:6902:1: rule__ImageObject__Group_2__1 : rule__ImageObject__Group_2__1__Impl ;
    public final void rule__ImageObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6906:1: ( rule__ImageObject__Group_2__1__Impl )
            // InternalPdfMk.g:6907:2: rule__ImageObject__Group_2__1__Impl
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
    // InternalPdfMk.g:6913:1: rule__ImageObject__Group_2__1__Impl : ( ( rule__ImageObject__WidthAssignment_2_1 ) ) ;
    public final void rule__ImageObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6917:1: ( ( ( rule__ImageObject__WidthAssignment_2_1 ) ) )
            // InternalPdfMk.g:6918:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            {
            // InternalPdfMk.g:6918:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            // InternalPdfMk.g:6919:2: ( rule__ImageObject__WidthAssignment_2_1 )
            {
             before(grammarAccess.getImageObjectAccess().getWidthAssignment_2_1()); 
            // InternalPdfMk.g:6920:2: ( rule__ImageObject__WidthAssignment_2_1 )
            // InternalPdfMk.g:6920:3: rule__ImageObject__WidthAssignment_2_1
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
    // InternalPdfMk.g:6929:1: rule__ImageObject__Group_3__0 : rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 ;
    public final void rule__ImageObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6933:1: ( rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 )
            // InternalPdfMk.g:6934:2: rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPdfMk.g:6941:1: rule__ImageObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6945:1: ( ( ',' ) )
            // InternalPdfMk.g:6946:1: ( ',' )
            {
            // InternalPdfMk.g:6946:1: ( ',' )
            // InternalPdfMk.g:6947:2: ','
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
    // InternalPdfMk.g:6956:1: rule__ImageObject__Group_3__1 : rule__ImageObject__Group_3__1__Impl ;
    public final void rule__ImageObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6960:1: ( rule__ImageObject__Group_3__1__Impl )
            // InternalPdfMk.g:6961:2: rule__ImageObject__Group_3__1__Impl
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
    // InternalPdfMk.g:6967:1: rule__ImageObject__Group_3__1__Impl : ( ( rule__ImageObject__HeightAssignment_3_1 ) ) ;
    public final void rule__ImageObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6971:1: ( ( ( rule__ImageObject__HeightAssignment_3_1 ) ) )
            // InternalPdfMk.g:6972:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            {
            // InternalPdfMk.g:6972:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            // InternalPdfMk.g:6973:2: ( rule__ImageObject__HeightAssignment_3_1 )
            {
             before(grammarAccess.getImageObjectAccess().getHeightAssignment_3_1()); 
            // InternalPdfMk.g:6974:2: ( rule__ImageObject__HeightAssignment_3_1 )
            // InternalPdfMk.g:6974:3: rule__ImageObject__HeightAssignment_3_1
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
    // InternalPdfMk.g:6983:1: rule__ImageObject__Group_4__0 : rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 ;
    public final void rule__ImageObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6987:1: ( rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 )
            // InternalPdfMk.g:6988:2: rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPdfMk.g:6995:1: rule__ImageObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6999:1: ( ( ',' ) )
            // InternalPdfMk.g:7000:1: ( ',' )
            {
            // InternalPdfMk.g:7000:1: ( ',' )
            // InternalPdfMk.g:7001:2: ','
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
    // InternalPdfMk.g:7010:1: rule__ImageObject__Group_4__1 : rule__ImageObject__Group_4__1__Impl ;
    public final void rule__ImageObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7014:1: ( rule__ImageObject__Group_4__1__Impl )
            // InternalPdfMk.g:7015:2: rule__ImageObject__Group_4__1__Impl
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
    // InternalPdfMk.g:7021:1: rule__ImageObject__Group_4__1__Impl : ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) ;
    public final void rule__ImageObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7025:1: ( ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) )
            // InternalPdfMk.g:7026:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            {
            // InternalPdfMk.g:7026:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            // InternalPdfMk.g:7027:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            {
             before(grammarAccess.getImageObjectAccess().getOpacityAssignment_4_1()); 
            // InternalPdfMk.g:7028:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            // InternalPdfMk.g:7028:3: rule__ImageObject__OpacityAssignment_4_1
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
    // InternalPdfMk.g:7037:1: rule__ImageObject__Group_5__0 : rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 ;
    public final void rule__ImageObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7041:1: ( rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 )
            // InternalPdfMk.g:7042:2: rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPdfMk.g:7049:1: rule__ImageObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7053:1: ( ( ',' ) )
            // InternalPdfMk.g:7054:1: ( ',' )
            {
            // InternalPdfMk.g:7054:1: ( ',' )
            // InternalPdfMk.g:7055:2: ','
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
    // InternalPdfMk.g:7064:1: rule__ImageObject__Group_5__1 : rule__ImageObject__Group_5__1__Impl ;
    public final void rule__ImageObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7068:1: ( rule__ImageObject__Group_5__1__Impl )
            // InternalPdfMk.g:7069:2: rule__ImageObject__Group_5__1__Impl
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
    // InternalPdfMk.g:7075:1: rule__ImageObject__Group_5__1__Impl : ( ( rule__ImageObject__FitAssignment_5_1 ) ) ;
    public final void rule__ImageObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7079:1: ( ( ( rule__ImageObject__FitAssignment_5_1 ) ) )
            // InternalPdfMk.g:7080:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            {
            // InternalPdfMk.g:7080:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            // InternalPdfMk.g:7081:2: ( rule__ImageObject__FitAssignment_5_1 )
            {
             before(grammarAccess.getImageObjectAccess().getFitAssignment_5_1()); 
            // InternalPdfMk.g:7082:2: ( rule__ImageObject__FitAssignment_5_1 )
            // InternalPdfMk.g:7082:3: rule__ImageObject__FitAssignment_5_1
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
    // InternalPdfMk.g:7091:1: rule__ImageObject__Group_6__0 : rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 ;
    public final void rule__ImageObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7095:1: ( rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 )
            // InternalPdfMk.g:7096:2: rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalPdfMk.g:7103:1: rule__ImageObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7107:1: ( ( ',' ) )
            // InternalPdfMk.g:7108:1: ( ',' )
            {
            // InternalPdfMk.g:7108:1: ( ',' )
            // InternalPdfMk.g:7109:2: ','
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
    // InternalPdfMk.g:7118:1: rule__ImageObject__Group_6__1 : rule__ImageObject__Group_6__1__Impl ;
    public final void rule__ImageObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7122:1: ( rule__ImageObject__Group_6__1__Impl )
            // InternalPdfMk.g:7123:2: rule__ImageObject__Group_6__1__Impl
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
    // InternalPdfMk.g:7129:1: rule__ImageObject__Group_6__1__Impl : ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) ;
    public final void rule__ImageObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7133:1: ( ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) )
            // InternalPdfMk.g:7134:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            {
            // InternalPdfMk.g:7134:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            // InternalPdfMk.g:7135:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            {
             before(grammarAccess.getImageObjectAccess().getPageBreakAssignment_6_1()); 
            // InternalPdfMk.g:7136:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            // InternalPdfMk.g:7136:3: rule__ImageObject__PageBreakAssignment_6_1
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
    // InternalPdfMk.g:7145:1: rule__ListObject__Group__0 : rule__ListObject__Group__0__Impl rule__ListObject__Group__1 ;
    public final void rule__ListObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7149:1: ( rule__ListObject__Group__0__Impl rule__ListObject__Group__1 )
            // InternalPdfMk.g:7150:2: rule__ListObject__Group__0__Impl rule__ListObject__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalPdfMk.g:7157:1: rule__ListObject__Group__0__Impl : ( ( rule__ListObject__ValueAssignment_0 ) ) ;
    public final void rule__ListObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7161:1: ( ( ( rule__ListObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:7162:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:7162:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:7163:2: ( rule__ListObject__ValueAssignment_0 )
            {
             before(grammarAccess.getListObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:7164:2: ( rule__ListObject__ValueAssignment_0 )
            // InternalPdfMk.g:7164:3: rule__ListObject__ValueAssignment_0
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
    // InternalPdfMk.g:7172:1: rule__ListObject__Group__1 : rule__ListObject__Group__1__Impl rule__ListObject__Group__2 ;
    public final void rule__ListObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7176:1: ( rule__ListObject__Group__1__Impl rule__ListObject__Group__2 )
            // InternalPdfMk.g:7177:2: rule__ListObject__Group__1__Impl rule__ListObject__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalPdfMk.g:7184:1: rule__ListObject__Group__1__Impl : ( ( rule__ListObject__Group_1__0 )? ) ;
    public final void rule__ListObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7188:1: ( ( ( rule__ListObject__Group_1__0 )? ) )
            // InternalPdfMk.g:7189:1: ( ( rule__ListObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:7189:1: ( ( rule__ListObject__Group_1__0 )? )
            // InternalPdfMk.g:7190:2: ( rule__ListObject__Group_1__0 )?
            {
             before(grammarAccess.getListObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:7191:2: ( rule__ListObject__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=38 && LA48_0<=42)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPdfMk.g:7191:3: rule__ListObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalPdfMk.g:7199:1: rule__ListObject__Group__2 : rule__ListObject__Group__2__Impl rule__ListObject__Group__3 ;
    public final void rule__ListObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7203:1: ( rule__ListObject__Group__2__Impl rule__ListObject__Group__3 )
            // InternalPdfMk.g:7204:2: rule__ListObject__Group__2__Impl rule__ListObject__Group__3
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
    // InternalPdfMk.g:7211:1: rule__ListObject__Group__2__Impl : ( ( rule__ListObject__Alternatives_2 ) ) ;
    public final void rule__ListObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7215:1: ( ( ( rule__ListObject__Alternatives_2 ) ) )
            // InternalPdfMk.g:7216:1: ( ( rule__ListObject__Alternatives_2 ) )
            {
            // InternalPdfMk.g:7216:1: ( ( rule__ListObject__Alternatives_2 ) )
            // InternalPdfMk.g:7217:2: ( rule__ListObject__Alternatives_2 )
            {
             before(grammarAccess.getListObjectAccess().getAlternatives_2()); 
            // InternalPdfMk.g:7218:2: ( rule__ListObject__Alternatives_2 )
            // InternalPdfMk.g:7218:3: rule__ListObject__Alternatives_2
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
    // InternalPdfMk.g:7226:1: rule__ListObject__Group__3 : rule__ListObject__Group__3__Impl rule__ListObject__Group__4 ;
    public final void rule__ListObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7230:1: ( rule__ListObject__Group__3__Impl rule__ListObject__Group__4 )
            // InternalPdfMk.g:7231:2: rule__ListObject__Group__3__Impl rule__ListObject__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:7238:1: rule__ListObject__Group__3__Impl : ( ':' ) ;
    public final void rule__ListObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7242:1: ( ( ':' ) )
            // InternalPdfMk.g:7243:1: ( ':' )
            {
            // InternalPdfMk.g:7243:1: ( ':' )
            // InternalPdfMk.g:7244:2: ':'
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
    // InternalPdfMk.g:7253:1: rule__ListObject__Group__4 : rule__ListObject__Group__4__Impl rule__ListObject__Group__5 ;
    public final void rule__ListObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7257:1: ( rule__ListObject__Group__4__Impl rule__ListObject__Group__5 )
            // InternalPdfMk.g:7258:2: rule__ListObject__Group__4__Impl rule__ListObject__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalPdfMk.g:7265:1: rule__ListObject__Group__4__Impl : ( '[' ) ;
    public final void rule__ListObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7269:1: ( ( '[' ) )
            // InternalPdfMk.g:7270:1: ( '[' )
            {
            // InternalPdfMk.g:7270:1: ( '[' )
            // InternalPdfMk.g:7271:2: '['
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
    // InternalPdfMk.g:7280:1: rule__ListObject__Group__5 : rule__ListObject__Group__5__Impl rule__ListObject__Group__6 ;
    public final void rule__ListObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7284:1: ( rule__ListObject__Group__5__Impl rule__ListObject__Group__6 )
            // InternalPdfMk.g:7285:2: rule__ListObject__Group__5__Impl rule__ListObject__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:7292:1: rule__ListObject__Group__5__Impl : ( ( rule__ListObject__Group_5__0 ) ) ;
    public final void rule__ListObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7296:1: ( ( ( rule__ListObject__Group_5__0 ) ) )
            // InternalPdfMk.g:7297:1: ( ( rule__ListObject__Group_5__0 ) )
            {
            // InternalPdfMk.g:7297:1: ( ( rule__ListObject__Group_5__0 ) )
            // InternalPdfMk.g:7298:2: ( rule__ListObject__Group_5__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:7299:2: ( rule__ListObject__Group_5__0 )
            // InternalPdfMk.g:7299:3: rule__ListObject__Group_5__0
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
    // InternalPdfMk.g:7307:1: rule__ListObject__Group__6 : rule__ListObject__Group__6__Impl rule__ListObject__Group__7 ;
    public final void rule__ListObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7311:1: ( rule__ListObject__Group__6__Impl rule__ListObject__Group__7 )
            // InternalPdfMk.g:7312:2: rule__ListObject__Group__6__Impl rule__ListObject__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:7319:1: rule__ListObject__Group__6__Impl : ( ']' ) ;
    public final void rule__ListObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7323:1: ( ( ']' ) )
            // InternalPdfMk.g:7324:1: ( ']' )
            {
            // InternalPdfMk.g:7324:1: ( ']' )
            // InternalPdfMk.g:7325:2: ']'
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
    // InternalPdfMk.g:7334:1: rule__ListObject__Group__7 : rule__ListObject__Group__7__Impl ;
    public final void rule__ListObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7338:1: ( rule__ListObject__Group__7__Impl )
            // InternalPdfMk.g:7339:2: rule__ListObject__Group__7__Impl
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
    // InternalPdfMk.g:7345:1: rule__ListObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ListObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7349:1: ( ( '}' ) )
            // InternalPdfMk.g:7350:1: ( '}' )
            {
            // InternalPdfMk.g:7350:1: ( '}' )
            // InternalPdfMk.g:7351:2: '}'
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
    // InternalPdfMk.g:7361:1: rule__ListObject__Group_1__0 : rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 ;
    public final void rule__ListObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7365:1: ( rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 )
            // InternalPdfMk.g:7366:2: rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:7373:1: rule__ListObject__Group_1__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) ;
    public final void rule__ListObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7377:1: ( ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) )
            // InternalPdfMk.g:7378:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7378:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            // InternalPdfMk.g:7379:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_0()); 
            // InternalPdfMk.g:7380:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            // InternalPdfMk.g:7380:3: rule__ListObject__PropertiesAssignment_1_0
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
    // InternalPdfMk.g:7388:1: rule__ListObject__Group_1__1 : rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 ;
    public final void rule__ListObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7392:1: ( rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 )
            // InternalPdfMk.g:7393:2: rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2
            {
            pushFollow(FOLLOW_43);
            rule__ListObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:7400:1: rule__ListObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7404:1: ( ( ',' ) )
            // InternalPdfMk.g:7405:1: ( ',' )
            {
            // InternalPdfMk.g:7405:1: ( ',' )
            // InternalPdfMk.g:7406:2: ','
            {
             before(grammarAccess.getListObjectAccess().getCommaKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getCommaKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ListObject__Group_1__2"
    // InternalPdfMk.g:7415:1: rule__ListObject__Group_1__2 : rule__ListObject__Group_1__2__Impl ;
    public final void rule__ListObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7419:1: ( rule__ListObject__Group_1__2__Impl )
            // InternalPdfMk.g:7420:2: rule__ListObject__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1__2"


    // $ANTLR start "rule__ListObject__Group_1__2__Impl"
    // InternalPdfMk.g:7426:1: rule__ListObject__Group_1__2__Impl : ( ( rule__ListObject__Group_1_2__0 )* ) ;
    public final void rule__ListObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7430:1: ( ( ( rule__ListObject__Group_1_2__0 )* ) )
            // InternalPdfMk.g:7431:1: ( ( rule__ListObject__Group_1_2__0 )* )
            {
            // InternalPdfMk.g:7431:1: ( ( rule__ListObject__Group_1_2__0 )* )
            // InternalPdfMk.g:7432:2: ( rule__ListObject__Group_1_2__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_1_2()); 
            // InternalPdfMk.g:7433:2: ( rule__ListObject__Group_1_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=38 && LA49_0<=42)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPdfMk.g:7433:3: rule__ListObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ListObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getListObjectAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1__2__Impl"


    // $ANTLR start "rule__ListObject__Group_1_2__0"
    // InternalPdfMk.g:7442:1: rule__ListObject__Group_1_2__0 : rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 ;
    public final void rule__ListObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7446:1: ( rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 )
            // InternalPdfMk.g:7447:2: rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__ListObject__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_2__0"


    // $ANTLR start "rule__ListObject__Group_1_2__0__Impl"
    // InternalPdfMk.g:7454:1: rule__ListObject__Group_1_2__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) ;
    public final void rule__ListObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7458:1: ( ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) )
            // InternalPdfMk.g:7459:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            {
            // InternalPdfMk.g:7459:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            // InternalPdfMk.g:7460:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_2_0()); 
            // InternalPdfMk.g:7461:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            // InternalPdfMk.g:7461:3: rule__ListObject__PropertiesAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__PropertiesAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_2__0__Impl"


    // $ANTLR start "rule__ListObject__Group_1_2__1"
    // InternalPdfMk.g:7469:1: rule__ListObject__Group_1_2__1 : rule__ListObject__Group_1_2__1__Impl ;
    public final void rule__ListObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7473:1: ( rule__ListObject__Group_1_2__1__Impl )
            // InternalPdfMk.g:7474:2: rule__ListObject__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListObject__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_2__1"


    // $ANTLR start "rule__ListObject__Group_1_2__1__Impl"
    // InternalPdfMk.g:7480:1: rule__ListObject__Group_1_2__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7484:1: ( ( ',' ) )
            // InternalPdfMk.g:7485:1: ( ',' )
            {
            // InternalPdfMk.g:7485:1: ( ',' )
            // InternalPdfMk.g:7486:2: ','
            {
             before(grammarAccess.getListObjectAccess().getCommaKeyword_1_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListObjectAccess().getCommaKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__Group_1_2__1__Impl"


    // $ANTLR start "rule__ListObject__Group_5__0"
    // InternalPdfMk.g:7496:1: rule__ListObject__Group_5__0 : rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 ;
    public final void rule__ListObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7500:1: ( rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 )
            // InternalPdfMk.g:7501:2: rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalPdfMk.g:7508:1: rule__ListObject__Group_5__0__Impl : ( ( rule__ListObject__ElementsAssignment_5_0 )? ) ;
    public final void rule__ListObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7512:1: ( ( ( rule__ListObject__ElementsAssignment_5_0 )? ) )
            // InternalPdfMk.g:7513:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            {
            // InternalPdfMk.g:7513:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            // InternalPdfMk.g:7514:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            {
             before(grammarAccess.getListObjectAccess().getElementsAssignment_5_0()); 
            // InternalPdfMk.g:7515:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING||LA50_0==18) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPdfMk.g:7515:3: rule__ListObject__ElementsAssignment_5_0
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
    // InternalPdfMk.g:7523:1: rule__ListObject__Group_5__1 : rule__ListObject__Group_5__1__Impl ;
    public final void rule__ListObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7527:1: ( rule__ListObject__Group_5__1__Impl )
            // InternalPdfMk.g:7528:2: rule__ListObject__Group_5__1__Impl
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
    // InternalPdfMk.g:7534:1: rule__ListObject__Group_5__1__Impl : ( ( rule__ListObject__Group_5_1__0 )* ) ;
    public final void rule__ListObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7538:1: ( ( ( rule__ListObject__Group_5_1__0 )* ) )
            // InternalPdfMk.g:7539:1: ( ( rule__ListObject__Group_5_1__0 )* )
            {
            // InternalPdfMk.g:7539:1: ( ( rule__ListObject__Group_5_1__0 )* )
            // InternalPdfMk.g:7540:2: ( rule__ListObject__Group_5_1__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_5_1()); 
            // InternalPdfMk.g:7541:2: ( rule__ListObject__Group_5_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==20) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPdfMk.g:7541:3: rule__ListObject__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ListObject__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalPdfMk.g:7550:1: rule__ListObject__Group_5_1__0 : rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 ;
    public final void rule__ListObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7554:1: ( rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 )
            // InternalPdfMk.g:7555:2: rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPdfMk.g:7562:1: rule__ListObject__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7566:1: ( ( ',' ) )
            // InternalPdfMk.g:7567:1: ( ',' )
            {
            // InternalPdfMk.g:7567:1: ( ',' )
            // InternalPdfMk.g:7568:2: ','
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
    // InternalPdfMk.g:7577:1: rule__ListObject__Group_5_1__1 : rule__ListObject__Group_5_1__1__Impl ;
    public final void rule__ListObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7581:1: ( rule__ListObject__Group_5_1__1__Impl )
            // InternalPdfMk.g:7582:2: rule__ListObject__Group_5_1__1__Impl
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
    // InternalPdfMk.g:7588:1: rule__ListObject__Group_5_1__1__Impl : ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) ;
    public final void rule__ListObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7592:1: ( ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) )
            // InternalPdfMk.g:7593:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            {
            // InternalPdfMk.g:7593:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            // InternalPdfMk.g:7594:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            {
             before(grammarAccess.getListObjectAccess().getElemtensAssignment_5_1_1()); 
            // InternalPdfMk.g:7595:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            // InternalPdfMk.g:7595:3: rule__ListObject__ElemtensAssignment_5_1_1
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


    // $ANTLR start "rule__TableObject__Group__0"
    // InternalPdfMk.g:7604:1: rule__TableObject__Group__0 : rule__TableObject__Group__0__Impl rule__TableObject__Group__1 ;
    public final void rule__TableObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7608:1: ( rule__TableObject__Group__0__Impl rule__TableObject__Group__1 )
            // InternalPdfMk.g:7609:2: rule__TableObject__Group__0__Impl rule__TableObject__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__TableObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__0"


    // $ANTLR start "rule__TableObject__Group__0__Impl"
    // InternalPdfMk.g:7616:1: rule__TableObject__Group__0__Impl : ( ( rule__TableObject__ValueAssignment_0 ) ) ;
    public final void rule__TableObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7620:1: ( ( ( rule__TableObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:7621:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:7621:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:7622:2: ( rule__TableObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTableObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:7623:2: ( rule__TableObject__ValueAssignment_0 )
            // InternalPdfMk.g:7623:3: rule__TableObject__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableObject__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableObjectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__0__Impl"


    // $ANTLR start "rule__TableObject__Group__1"
    // InternalPdfMk.g:7631:1: rule__TableObject__Group__1 : rule__TableObject__Group__1__Impl rule__TableObject__Group__2 ;
    public final void rule__TableObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7635:1: ( rule__TableObject__Group__1__Impl rule__TableObject__Group__2 )
            // InternalPdfMk.g:7636:2: rule__TableObject__Group__1__Impl rule__TableObject__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__TableObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__1"


    // $ANTLR start "rule__TableObject__Group__1__Impl"
    // InternalPdfMk.g:7643:1: rule__TableObject__Group__1__Impl : ( ( rule__TableObject__Group_1__0 )? ) ;
    public final void rule__TableObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7647:1: ( ( ( rule__TableObject__Group_1__0 )? ) )
            // InternalPdfMk.g:7648:1: ( ( rule__TableObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:7648:1: ( ( rule__TableObject__Group_1__0 )? )
            // InternalPdfMk.g:7649:2: ( rule__TableObject__Group_1__0 )?
            {
             before(grammarAccess.getTableObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:7650:2: ( rule__TableObject__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPdfMk.g:7650:3: rule__TableObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__1__Impl"


    // $ANTLR start "rule__TableObject__Group__2"
    // InternalPdfMk.g:7658:1: rule__TableObject__Group__2 : rule__TableObject__Group__2__Impl rule__TableObject__Group__3 ;
    public final void rule__TableObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7662:1: ( rule__TableObject__Group__2__Impl rule__TableObject__Group__3 )
            // InternalPdfMk.g:7663:2: rule__TableObject__Group__2__Impl rule__TableObject__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TableObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__2"


    // $ANTLR start "rule__TableObject__Group__2__Impl"
    // InternalPdfMk.g:7670:1: rule__TableObject__Group__2__Impl : ( ( rule__TableObject__TableAssignment_2 ) ) ;
    public final void rule__TableObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7674:1: ( ( ( rule__TableObject__TableAssignment_2 ) ) )
            // InternalPdfMk.g:7675:1: ( ( rule__TableObject__TableAssignment_2 ) )
            {
            // InternalPdfMk.g:7675:1: ( ( rule__TableObject__TableAssignment_2 ) )
            // InternalPdfMk.g:7676:2: ( rule__TableObject__TableAssignment_2 )
            {
             before(grammarAccess.getTableObjectAccess().getTableAssignment_2()); 
            // InternalPdfMk.g:7677:2: ( rule__TableObject__TableAssignment_2 )
            // InternalPdfMk.g:7677:3: rule__TableObject__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableObject__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableObjectAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__2__Impl"


    // $ANTLR start "rule__TableObject__Group__3"
    // InternalPdfMk.g:7685:1: rule__TableObject__Group__3 : rule__TableObject__Group__3__Impl ;
    public final void rule__TableObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7689:1: ( rule__TableObject__Group__3__Impl )
            // InternalPdfMk.g:7690:2: rule__TableObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__3"


    // $ANTLR start "rule__TableObject__Group__3__Impl"
    // InternalPdfMk.g:7696:1: rule__TableObject__Group__3__Impl : ( '}' ) ;
    public final void rule__TableObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7700:1: ( ( '}' ) )
            // InternalPdfMk.g:7701:1: ( '}' )
            {
            // InternalPdfMk.g:7701:1: ( '}' )
            // InternalPdfMk.g:7702:2: '}'
            {
             before(grammarAccess.getTableObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableObjectAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group__3__Impl"


    // $ANTLR start "rule__TableObject__Group_1__0"
    // InternalPdfMk.g:7712:1: rule__TableObject__Group_1__0 : rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 ;
    public final void rule__TableObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7716:1: ( rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 )
            // InternalPdfMk.g:7717:2: rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__TableObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableObject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group_1__0"


    // $ANTLR start "rule__TableObject__Group_1__0__Impl"
    // InternalPdfMk.g:7724:1: rule__TableObject__Group_1__0__Impl : ( ( rule__TableObject__StyleAssignment_1_0 ) ) ;
    public final void rule__TableObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7728:1: ( ( ( rule__TableObject__StyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:7729:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7729:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            // InternalPdfMk.g:7730:2: ( rule__TableObject__StyleAssignment_1_0 )
            {
             before(grammarAccess.getTableObjectAccess().getStyleAssignment_1_0()); 
            // InternalPdfMk.g:7731:2: ( rule__TableObject__StyleAssignment_1_0 )
            // InternalPdfMk.g:7731:3: rule__TableObject__StyleAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TableObject__StyleAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTableObjectAccess().getStyleAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group_1__0__Impl"


    // $ANTLR start "rule__TableObject__Group_1__1"
    // InternalPdfMk.g:7739:1: rule__TableObject__Group_1__1 : rule__TableObject__Group_1__1__Impl ;
    public final void rule__TableObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7743:1: ( rule__TableObject__Group_1__1__Impl )
            // InternalPdfMk.g:7744:2: rule__TableObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableObject__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group_1__1"


    // $ANTLR start "rule__TableObject__Group_1__1__Impl"
    // InternalPdfMk.g:7750:1: rule__TableObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__TableObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7754:1: ( ( ',' ) )
            // InternalPdfMk.g:7755:1: ( ',' )
            {
            // InternalPdfMk.g:7755:1: ( ',' )
            // InternalPdfMk.g:7756:2: ','
            {
             before(grammarAccess.getTableObjectAccess().getCommaKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableObjectAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__Group_1__1__Impl"


    // $ANTLR start "rule__ContentObjects__Group__0"
    // InternalPdfMk.g:7766:1: rule__ContentObjects__Group__0 : rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 ;
    public final void rule__ContentObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7770:1: ( rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 )
            // InternalPdfMk.g:7771:2: rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:7778:1: rule__ContentObjects__Group__0__Impl : ( () ) ;
    public final void rule__ContentObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7782:1: ( ( () ) )
            // InternalPdfMk.g:7783:1: ( () )
            {
            // InternalPdfMk.g:7783:1: ( () )
            // InternalPdfMk.g:7784:2: ()
            {
             before(grammarAccess.getContentObjectsAccess().getContentObjectsAction_0()); 
            // InternalPdfMk.g:7785:2: ()
            // InternalPdfMk.g:7785:3: 
            {
            }

             after(grammarAccess.getContentObjectsAccess().getContentObjectsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group__0__Impl"


    // $ANTLR start "rule__ContentObjects__Group__1"
    // InternalPdfMk.g:7793:1: rule__ContentObjects__Group__1 : rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 ;
    public final void rule__ContentObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7797:1: ( rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 )
            // InternalPdfMk.g:7798:2: rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalPdfMk.g:7805:1: rule__ContentObjects__Group__1__Impl : ( '[' ) ;
    public final void rule__ContentObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7809:1: ( ( '[' ) )
            // InternalPdfMk.g:7810:1: ( '[' )
            {
            // InternalPdfMk.g:7810:1: ( '[' )
            // InternalPdfMk.g:7811:2: '['
            {
             before(grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
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
    // InternalPdfMk.g:7820:1: rule__ContentObjects__Group__2 : rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3 ;
    public final void rule__ContentObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7824:1: ( rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3 )
            // InternalPdfMk.g:7825:2: rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__ContentObjects__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:7832:1: rule__ContentObjects__Group__2__Impl : ( ( rule__ContentObjects__Group_2__0 )? ) ;
    public final void rule__ContentObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7836:1: ( ( ( rule__ContentObjects__Group_2__0 )? ) )
            // InternalPdfMk.g:7837:1: ( ( rule__ContentObjects__Group_2__0 )? )
            {
            // InternalPdfMk.g:7837:1: ( ( rule__ContentObjects__Group_2__0 )? )
            // InternalPdfMk.g:7838:2: ( rule__ContentObjects__Group_2__0 )?
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_2()); 
            // InternalPdfMk.g:7839:2: ( rule__ContentObjects__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING||LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPdfMk.g:7839:3: rule__ContentObjects__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentObjects__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentObjectsAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContentObjects__Group__3"
    // InternalPdfMk.g:7847:1: rule__ContentObjects__Group__3 : rule__ContentObjects__Group__3__Impl ;
    public final void rule__ContentObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7851:1: ( rule__ContentObjects__Group__3__Impl )
            // InternalPdfMk.g:7852:2: rule__ContentObjects__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group__3"


    // $ANTLR start "rule__ContentObjects__Group__3__Impl"
    // InternalPdfMk.g:7858:1: rule__ContentObjects__Group__3__Impl : ( ']' ) ;
    public final void rule__ContentObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7862:1: ( ( ']' ) )
            // InternalPdfMk.g:7863:1: ( ']' )
            {
            // InternalPdfMk.g:7863:1: ( ']' )
            // InternalPdfMk.g:7864:2: ']'
            {
             before(grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group__3__Impl"


    // $ANTLR start "rule__ContentObjects__Group_2__0"
    // InternalPdfMk.g:7874:1: rule__ContentObjects__Group_2__0 : rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1 ;
    public final void rule__ContentObjects__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7878:1: ( rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1 )
            // InternalPdfMk.g:7879:2: rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__ContentObjects__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2__0"


    // $ANTLR start "rule__ContentObjects__Group_2__0__Impl"
    // InternalPdfMk.g:7886:1: rule__ContentObjects__Group_2__0__Impl : ( ( rule__ContentObjects__ValueAssignment_2_0 ) ) ;
    public final void rule__ContentObjects__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7890:1: ( ( ( rule__ContentObjects__ValueAssignment_2_0 ) ) )
            // InternalPdfMk.g:7891:1: ( ( rule__ContentObjects__ValueAssignment_2_0 ) )
            {
            // InternalPdfMk.g:7891:1: ( ( rule__ContentObjects__ValueAssignment_2_0 ) )
            // InternalPdfMk.g:7892:2: ( rule__ContentObjects__ValueAssignment_2_0 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_2_0()); 
            // InternalPdfMk.g:7893:2: ( rule__ContentObjects__ValueAssignment_2_0 )
            // InternalPdfMk.g:7893:3: rule__ContentObjects__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__ValueAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectsAccess().getValueAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2__0__Impl"


    // $ANTLR start "rule__ContentObjects__Group_2__1"
    // InternalPdfMk.g:7901:1: rule__ContentObjects__Group_2__1 : rule__ContentObjects__Group_2__1__Impl ;
    public final void rule__ContentObjects__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7905:1: ( rule__ContentObjects__Group_2__1__Impl )
            // InternalPdfMk.g:7906:2: rule__ContentObjects__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2__1"


    // $ANTLR start "rule__ContentObjects__Group_2__1__Impl"
    // InternalPdfMk.g:7912:1: rule__ContentObjects__Group_2__1__Impl : ( ( rule__ContentObjects__Group_2_1__0 )* ) ;
    public final void rule__ContentObjects__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7916:1: ( ( ( rule__ContentObjects__Group_2_1__0 )* ) )
            // InternalPdfMk.g:7917:1: ( ( rule__ContentObjects__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:7917:1: ( ( rule__ContentObjects__Group_2_1__0 )* )
            // InternalPdfMk.g:7918:2: ( rule__ContentObjects__Group_2_1__0 )*
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_2_1()); 
            // InternalPdfMk.g:7919:2: ( rule__ContentObjects__Group_2_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==20) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPdfMk.g:7919:3: rule__ContentObjects__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ContentObjects__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getContentObjectsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2__1__Impl"


    // $ANTLR start "rule__ContentObjects__Group_2_1__0"
    // InternalPdfMk.g:7928:1: rule__ContentObjects__Group_2_1__0 : rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1 ;
    public final void rule__ContentObjects__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7932:1: ( rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1 )
            // InternalPdfMk.g:7933:2: rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ContentObjects__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2_1__0"


    // $ANTLR start "rule__ContentObjects__Group_2_1__0__Impl"
    // InternalPdfMk.g:7940:1: rule__ContentObjects__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ContentObjects__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7944:1: ( ( ',' ) )
            // InternalPdfMk.g:7945:1: ( ',' )
            {
            // InternalPdfMk.g:7945:1: ( ',' )
            // InternalPdfMk.g:7946:2: ','
            {
             before(grammarAccess.getContentObjectsAccess().getCommaKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContentObjectsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2_1__0__Impl"


    // $ANTLR start "rule__ContentObjects__Group_2_1__1"
    // InternalPdfMk.g:7955:1: rule__ContentObjects__Group_2_1__1 : rule__ContentObjects__Group_2_1__1__Impl ;
    public final void rule__ContentObjects__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7959:1: ( rule__ContentObjects__Group_2_1__1__Impl )
            // InternalPdfMk.g:7960:2: rule__ContentObjects__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2_1__1"


    // $ANTLR start "rule__ContentObjects__Group_2_1__1__Impl"
    // InternalPdfMk.g:7966:1: rule__ContentObjects__Group_2_1__1__Impl : ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ContentObjects__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7970:1: ( ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:7971:1: ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:7971:1: ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) )
            // InternalPdfMk.g:7972:2: ( rule__ContentObjects__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_2_1_1()); 
            // InternalPdfMk.g:7973:2: ( rule__ContentObjects__ValueAssignment_2_1_1 )
            // InternalPdfMk.g:7973:3: rule__ContentObjects__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentObjects__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContentObjectsAccess().getValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__Group_2_1__1__Impl"


    // $ANTLR start "rule__Styles__Group__0"
    // InternalPdfMk.g:7982:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7986:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:7987:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
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
    // InternalPdfMk.g:7994:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7998:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:7999:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:7999:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:8000:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:8001:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:8001:3: rule__Styles__KeyAssignment_0
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
    // InternalPdfMk.g:8009:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8013:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:8014:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
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
    // InternalPdfMk.g:8021:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8025:1: ( ( ':' ) )
            // InternalPdfMk.g:8026:1: ( ':' )
            {
            // InternalPdfMk.g:8026:1: ( ':' )
            // InternalPdfMk.g:8027:2: ':'
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
    // InternalPdfMk.g:8036:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8040:1: ( rule__Styles__Group__2__Impl )
            // InternalPdfMk.g:8041:2: rule__Styles__Group__2__Impl
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
    // InternalPdfMk.g:8047:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8051:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:8052:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:8052:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:8053:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:8054:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:8054:3: rule__Styles__ValueAssignment_2
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
    // InternalPdfMk.g:8063:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8067:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:8068:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalPdfMk.g:8075:1: rule__Content__Group__0__Impl : ( ( rule__Content__KeyAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8079:1: ( ( ( rule__Content__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:8080:1: ( ( rule__Content__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:8080:1: ( ( rule__Content__KeyAssignment_0 ) )
            // InternalPdfMk.g:8081:2: ( rule__Content__KeyAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:8082:2: ( rule__Content__KeyAssignment_0 )
            // InternalPdfMk.g:8082:3: rule__Content__KeyAssignment_0
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
    // InternalPdfMk.g:8090:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8094:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:8095:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:8102:1: rule__Content__Group__1__Impl : ( ':' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8106:1: ( ( ':' ) )
            // InternalPdfMk.g:8107:1: ( ':' )
            {
            // InternalPdfMk.g:8107:1: ( ':' )
            // InternalPdfMk.g:8108:2: ':'
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
    // InternalPdfMk.g:8117:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8121:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:8122:2: rule__Content__Group__2__Impl
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
    // InternalPdfMk.g:8128:1: rule__Content__Group__2__Impl : ( ( rule__Content__ValueAssignment_2 ) ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8132:1: ( ( ( rule__Content__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:8133:1: ( ( rule__Content__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:8133:1: ( ( rule__Content__ValueAssignment_2 ) )
            // InternalPdfMk.g:8134:2: ( rule__Content__ValueAssignment_2 )
            {
             before(grammarAccess.getContentAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:8135:2: ( rule__Content__ValueAssignment_2 )
            // InternalPdfMk.g:8135:3: rule__Content__ValueAssignment_2
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
    // InternalPdfMk.g:8144:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8148:1: ( ( ruleContent ) )
            // InternalPdfMk.g:8149:2: ( ruleContent )
            {
            // InternalPdfMk.g:8149:2: ( ruleContent )
            // InternalPdfMk.g:8150:3: ruleContent
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
    // InternalPdfMk.g:8159:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8163:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:8164:2: ( ruleStyles )
            {
            // InternalPdfMk.g:8164:2: ( ruleStyles )
            // InternalPdfMk.g:8165:3: ruleStyles
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
    // InternalPdfMk.g:8174:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8178:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8179:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8179:2: ( RULE_STRING )
            // InternalPdfMk.g:8180:3: RULE_STRING
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
    // InternalPdfMk.g:8189:1: rule__TypeFaceDefinition__KeyAssignment_0 : ( ( 'bold' ) ) ;
    public final void rule__TypeFaceDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8193:1: ( ( ( 'bold' ) ) )
            // InternalPdfMk.g:8194:2: ( ( 'bold' ) )
            {
            // InternalPdfMk.g:8194:2: ( ( 'bold' ) )
            // InternalPdfMk.g:8195:3: ( 'bold' )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            // InternalPdfMk.g:8196:3: ( 'bold' )
            // InternalPdfMk.g:8197:4: 'bold'
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPdfMk.g:8208:1: rule__TypeFaceDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__TypeFaceDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8212:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8213:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8213:2: ( ruleBooleanType )
            // InternalPdfMk.g:8214:3: ruleBooleanType
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
    // InternalPdfMk.g:8223:1: rule__TextStyleDefinition__KeyAssignment_0 : ( ( 'style' ) ) ;
    public final void rule__TextStyleDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8227:1: ( ( ( 'style' ) ) )
            // InternalPdfMk.g:8228:2: ( ( 'style' ) )
            {
            // InternalPdfMk.g:8228:2: ( ( 'style' ) )
            // InternalPdfMk.g:8229:3: ( 'style' )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            // InternalPdfMk.g:8230:3: ( 'style' )
            // InternalPdfMk.g:8231:4: 'style'
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPdfMk.g:8242:1: rule__TextStyleDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextStyleDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8246:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8247:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8247:2: ( RULE_STRING )
            // InternalPdfMk.g:8248:3: RULE_STRING
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


    // $ANTLR start "rule__TextDefinition__KeyAssignment_0"
    // InternalPdfMk.g:8257:1: rule__TextDefinition__KeyAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__TextDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8261:1: ( ( ( 'text' ) ) )
            // InternalPdfMk.g:8262:2: ( ( 'text' ) )
            {
            // InternalPdfMk.g:8262:2: ( ( 'text' ) )
            // InternalPdfMk.g:8263:3: ( 'text' )
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 
            // InternalPdfMk.g:8264:3: ( 'text' )
            // InternalPdfMk.g:8265:4: 'text'
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 

            }

             after(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__KeyAssignment_0"


    // $ANTLR start "rule__TextDefinition__ValueAssignment_2"
    // InternalPdfMk.g:8276:1: rule__TextDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8280:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8281:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8281:2: ( RULE_STRING )
            // InternalPdfMk.g:8282:3: RULE_STRING
            {
             before(grammarAccess.getTextDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ItalicsDefinition__KeyAssignment_0"
    // InternalPdfMk.g:8291:1: rule__ItalicsDefinition__KeyAssignment_0 : ( ( 'italics' ) ) ;
    public final void rule__ItalicsDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8295:1: ( ( ( 'italics' ) ) )
            // InternalPdfMk.g:8296:2: ( ( 'italics' ) )
            {
            // InternalPdfMk.g:8296:2: ( ( 'italics' ) )
            // InternalPdfMk.g:8297:3: ( 'italics' )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            // InternalPdfMk.g:8298:3: ( 'italics' )
            // InternalPdfMk.g:8299:4: 'italics'
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
    // InternalPdfMk.g:8310:1: rule__ItalicsDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ItalicsDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8314:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8315:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8315:2: ( ruleBooleanType )
            // InternalPdfMk.g:8316:3: ruleBooleanType
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
    // InternalPdfMk.g:8325:1: rule__FontSizeDefinition__KeyAssignment_0 : ( ( 'fontSize' ) ) ;
    public final void rule__FontSizeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8329:1: ( ( ( 'fontSize' ) ) )
            // InternalPdfMk.g:8330:2: ( ( 'fontSize' ) )
            {
            // InternalPdfMk.g:8330:2: ( ( 'fontSize' ) )
            // InternalPdfMk.g:8331:3: ( 'fontSize' )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            // InternalPdfMk.g:8332:3: ( 'fontSize' )
            // InternalPdfMk.g:8333:4: 'fontSize'
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
    // InternalPdfMk.g:8344:1: rule__FontSizeDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FontSizeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8348:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8349:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8349:2: ( RULE_INT )
            // InternalPdfMk.g:8350:3: RULE_INT
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
    // InternalPdfMk.g:8359:1: rule__WidthDefinition__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__WidthDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8363:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:8364:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:8364:2: ( ( 'width' ) )
            // InternalPdfMk.g:8365:3: ( 'width' )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:8366:3: ( 'width' )
            // InternalPdfMk.g:8367:4: 'width'
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
    // InternalPdfMk.g:8378:1: rule__WidthDefinition__ValueAssignment_2 : ( ruleColumnTextWidthType ) ;
    public final void rule__WidthDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8382:1: ( ( ruleColumnTextWidthType ) )
            // InternalPdfMk.g:8383:2: ( ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:8383:2: ( ruleColumnTextWidthType )
            // InternalPdfMk.g:8384:3: ruleColumnTextWidthType
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
    // InternalPdfMk.g:8393:1: rule__ColumnDefinition__GlobalStyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__ColumnDefinition__GlobalStyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8397:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:8398:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:8398:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:8399:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:8408:1: rule__ColumnDefinition__KeyAssignment_2 : ( ( 'columns' ) ) ;
    public final void rule__ColumnDefinition__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8412:1: ( ( ( 'columns' ) ) )
            // InternalPdfMk.g:8413:2: ( ( 'columns' ) )
            {
            // InternalPdfMk.g:8413:2: ( ( 'columns' ) )
            // InternalPdfMk.g:8414:3: ( 'columns' )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 
            // InternalPdfMk.g:8415:3: ( 'columns' )
            // InternalPdfMk.g:8416:4: 'columns'
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
    // InternalPdfMk.g:8427:1: rule__ColumnDefinition__ValueAssignment_4_0 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8431:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:8432:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:8432:2: ( ruleColumnObject )
            // InternalPdfMk.g:8433:3: ruleColumnObject
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
    // InternalPdfMk.g:8442:1: rule__ColumnDefinition__ValueAssignment_4_1_1 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8446:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:8447:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:8447:2: ( ruleColumnObject )
            // InternalPdfMk.g:8448:3: ruleColumnObject
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
    // InternalPdfMk.g:8457:1: rule__MarginDefinition__KeyAssignment_0 : ( ( 'margin' ) ) ;
    public final void rule__MarginDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8461:1: ( ( ( 'margin' ) ) )
            // InternalPdfMk.g:8462:2: ( ( 'margin' ) )
            {
            // InternalPdfMk.g:8462:2: ( ( 'margin' ) )
            // InternalPdfMk.g:8463:3: ( 'margin' )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 
            // InternalPdfMk.g:8464:3: ( 'margin' )
            // InternalPdfMk.g:8465:4: 'margin'
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
    // InternalPdfMk.g:8476:1: rule__MarginDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8480:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8481:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8481:2: ( RULE_INT )
            // InternalPdfMk.g:8482:3: RULE_INT
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
    // InternalPdfMk.g:8491:1: rule__MarginDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8495:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8496:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8496:2: ( RULE_INT )
            // InternalPdfMk.g:8497:3: RULE_INT
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
    // InternalPdfMk.g:8506:1: rule__ImageDefintion__KeyAssignment_0 : ( ( 'image' ) ) ;
    public final void rule__ImageDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8510:1: ( ( ( 'image' ) ) )
            // InternalPdfMk.g:8511:2: ( ( 'image' ) )
            {
            // InternalPdfMk.g:8511:2: ( ( 'image' ) )
            // InternalPdfMk.g:8512:3: ( 'image' )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 
            // InternalPdfMk.g:8513:3: ( 'image' )
            // InternalPdfMk.g:8514:4: 'image'
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
    // InternalPdfMk.g:8525:1: rule__ImageDefintion__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8529:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8530:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8530:2: ( RULE_STRING )
            // InternalPdfMk.g:8531:3: RULE_STRING
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
    // InternalPdfMk.g:8540:1: rule__ImageWidthDefintion__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__ImageWidthDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8544:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:8545:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:8545:2: ( ( 'width' ) )
            // InternalPdfMk.g:8546:3: ( 'width' )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:8547:3: ( 'width' )
            // InternalPdfMk.g:8548:4: 'width'
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
    // InternalPdfMk.g:8559:1: rule__ImageWidthDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageWidthDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8563:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8564:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8564:2: ( RULE_INT )
            // InternalPdfMk.g:8565:3: RULE_INT
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
    // InternalPdfMk.g:8574:1: rule__ImageHeightDefintion__KeyAssignment_0 : ( ( 'height' ) ) ;
    public final void rule__ImageHeightDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8578:1: ( ( ( 'height' ) ) )
            // InternalPdfMk.g:8579:2: ( ( 'height' ) )
            {
            // InternalPdfMk.g:8579:2: ( ( 'height' ) )
            // InternalPdfMk.g:8580:3: ( 'height' )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 
            // InternalPdfMk.g:8581:3: ( 'height' )
            // InternalPdfMk.g:8582:4: 'height'
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
    // InternalPdfMk.g:8593:1: rule__ImageHeightDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageHeightDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8597:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8598:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8598:2: ( RULE_INT )
            // InternalPdfMk.g:8599:3: RULE_INT
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
    // InternalPdfMk.g:8608:1: rule__ImagePageBreakDefinition__KeyAssignment_0 : ( ( 'pageBreak' ) ) ;
    public final void rule__ImagePageBreakDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8612:1: ( ( ( 'pageBreak' ) ) )
            // InternalPdfMk.g:8613:2: ( ( 'pageBreak' ) )
            {
            // InternalPdfMk.g:8613:2: ( ( 'pageBreak' ) )
            // InternalPdfMk.g:8614:3: ( 'pageBreak' )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 
            // InternalPdfMk.g:8615:3: ( 'pageBreak' )
            // InternalPdfMk.g:8616:4: 'pageBreak'
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
    // InternalPdfMk.g:8627:1: rule__ImagePageBreakDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImagePageBreakDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8631:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8632:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8632:2: ( RULE_STRING )
            // InternalPdfMk.g:8633:3: RULE_STRING
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
    // InternalPdfMk.g:8642:1: rule__ImageFitDefinition__KeyAssignment_0 : ( ( 'fit' ) ) ;
    public final void rule__ImageFitDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8646:1: ( ( ( 'fit' ) ) )
            // InternalPdfMk.g:8647:2: ( ( 'fit' ) )
            {
            // InternalPdfMk.g:8647:2: ( ( 'fit' ) )
            // InternalPdfMk.g:8648:3: ( 'fit' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 
            // InternalPdfMk.g:8649:3: ( 'fit' )
            // InternalPdfMk.g:8650:4: 'fit'
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
    // InternalPdfMk.g:8661:1: rule__ImageFitDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__ImageFitDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8665:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8666:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8666:2: ( ( '[' ) )
            // InternalPdfMk.g:8667:3: ( '[' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:8668:3: ( '[' )
            // InternalPdfMk.g:8669:4: '['
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
    // InternalPdfMk.g:8680:1: rule__ImageFitDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8684:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8685:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8685:2: ( RULE_INT )
            // InternalPdfMk.g:8686:3: RULE_INT
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
    // InternalPdfMk.g:8695:1: rule__ImageFitDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8699:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8700:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8700:2: ( RULE_INT )
            // InternalPdfMk.g:8701:3: RULE_INT
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
    // InternalPdfMk.g:8710:1: rule__ImageOpacityDefinition__KeyAssignment_0 : ( ( 'opacity' ) ) ;
    public final void rule__ImageOpacityDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8714:1: ( ( ( 'opacity' ) ) )
            // InternalPdfMk.g:8715:2: ( ( 'opacity' ) )
            {
            // InternalPdfMk.g:8715:2: ( ( 'opacity' ) )
            // InternalPdfMk.g:8716:3: ( 'opacity' )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 
            // InternalPdfMk.g:8717:3: ( 'opacity' )
            // InternalPdfMk.g:8718:4: 'opacity'
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
    // InternalPdfMk.g:8729:1: rule__ImageOpacityDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageOpacityDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8733:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8734:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8734:2: ( RULE_INT )
            // InternalPdfMk.g:8735:3: RULE_INT
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
    // InternalPdfMk.g:8744:1: rule__ListReversedDefinition__KeyAssignment_0 : ( ( 'reversed' ) ) ;
    public final void rule__ListReversedDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8748:1: ( ( ( 'reversed' ) ) )
            // InternalPdfMk.g:8749:2: ( ( 'reversed' ) )
            {
            // InternalPdfMk.g:8749:2: ( ( 'reversed' ) )
            // InternalPdfMk.g:8750:3: ( 'reversed' )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 
            // InternalPdfMk.g:8751:3: ( 'reversed' )
            // InternalPdfMk.g:8752:4: 'reversed'
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
    // InternalPdfMk.g:8763:1: rule__ListReversedDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ListReversedDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8767:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8768:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8768:2: ( ruleBooleanType )
            // InternalPdfMk.g:8769:3: ruleBooleanType
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
    // InternalPdfMk.g:8778:1: rule__ListCounterDefinition__KeyAssignment_0 : ( ( 'counter' ) ) ;
    public final void rule__ListCounterDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8782:1: ( ( ( 'counter' ) ) )
            // InternalPdfMk.g:8783:2: ( ( 'counter' ) )
            {
            // InternalPdfMk.g:8783:2: ( ( 'counter' ) )
            // InternalPdfMk.g:8784:3: ( 'counter' )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 
            // InternalPdfMk.g:8785:3: ( 'counter' )
            // InternalPdfMk.g:8786:4: 'counter'
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
    // InternalPdfMk.g:8797:1: rule__ListCounterDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ListCounterDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8801:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8802:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8802:2: ( RULE_INT )
            // InternalPdfMk.g:8803:3: RULE_INT
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
    // InternalPdfMk.g:8812:1: rule__ListTypeDefinition__KeyAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__ListTypeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8816:1: ( ( ( 'type' ) ) )
            // InternalPdfMk.g:8817:2: ( ( 'type' ) )
            {
            // InternalPdfMk.g:8817:2: ( ( 'type' ) )
            // InternalPdfMk.g:8818:3: ( 'type' )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 
            // InternalPdfMk.g:8819:3: ( 'type' )
            // InternalPdfMk.g:8820:4: 'type'
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
    // InternalPdfMk.g:8831:1: rule__ListTypeDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListTypeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8835:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8836:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8836:2: ( RULE_STRING )
            // InternalPdfMk.g:8837:3: RULE_STRING
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
    // InternalPdfMk.g:8846:1: rule__ListColorDefinition__KeyAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ListColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8850:1: ( ( ( 'color' ) ) )
            // InternalPdfMk.g:8851:2: ( ( 'color' ) )
            {
            // InternalPdfMk.g:8851:2: ( ( 'color' ) )
            // InternalPdfMk.g:8852:3: ( 'color' )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 
            // InternalPdfMk.g:8853:3: ( 'color' )
            // InternalPdfMk.g:8854:4: 'color'
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
    // InternalPdfMk.g:8865:1: rule__ListColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8869:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8870:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8870:2: ( RULE_STRING )
            // InternalPdfMk.g:8871:3: RULE_STRING
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
    // InternalPdfMk.g:8880:1: rule__ListMarkerColorDefinition__KeyAssignment_0 : ( ( 'markerColor' ) ) ;
    public final void rule__ListMarkerColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8884:1: ( ( ( 'markerColor' ) ) )
            // InternalPdfMk.g:8885:2: ( ( 'markerColor' ) )
            {
            // InternalPdfMk.g:8885:2: ( ( 'markerColor' ) )
            // InternalPdfMk.g:8886:3: ( 'markerColor' )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 
            // InternalPdfMk.g:8887:3: ( 'markerColor' )
            // InternalPdfMk.g:8888:4: 'markerColor'
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
    // InternalPdfMk.g:8899:1: rule__ListMarkerColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListMarkerColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8903:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8904:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8904:2: ( RULE_STRING )
            // InternalPdfMk.g:8905:3: RULE_STRING
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


    // $ANTLR start "rule__TableCellItemElements__ElementsAssignment"
    // InternalPdfMk.g:8914:1: rule__TableCellItemElements__ElementsAssignment : ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) ;
    public final void rule__TableCellItemElements__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8918:1: ( ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) )
            // InternalPdfMk.g:8919:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            {
            // InternalPdfMk.g:8919:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            // InternalPdfMk.g:8920:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            {
             before(grammarAccess.getTableCellItemElementsAccess().getElementsAlternatives_0()); 
            // InternalPdfMk.g:8921:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            // InternalPdfMk.g:8921:4: rule__TableCellItemElements__ElementsAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TableCellItemElements__ElementsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTableCellItemElementsAccess().getElementsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCellItemElements__ElementsAssignment"


    // $ANTLR start "rule__TableRowDefinition__ItemAssignment_1"
    // InternalPdfMk.g:8929:1: rule__TableRowDefinition__ItemAssignment_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8933:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:8934:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:8934:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:8935:3: ruleTableCellItemElements
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableCellItemElements();

            state._fsp--;

             after(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__ItemAssignment_1"


    // $ANTLR start "rule__TableRowDefinition__ItemAssignment_2_1"
    // InternalPdfMk.g:8944:1: rule__TableRowDefinition__ItemAssignment_2_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8948:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:8949:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:8949:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:8950:3: ruleTableCellItemElements
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableCellItemElements();

            state._fsp--;

             after(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRowDefinition__ItemAssignment_2_1"


    // $ANTLR start "rule__TableBodyDefinition__KeyAssignment_0"
    // InternalPdfMk.g:8959:1: rule__TableBodyDefinition__KeyAssignment_0 : ( ( 'body' ) ) ;
    public final void rule__TableBodyDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8963:1: ( ( ( 'body' ) ) )
            // InternalPdfMk.g:8964:2: ( ( 'body' ) )
            {
            // InternalPdfMk.g:8964:2: ( ( 'body' ) )
            // InternalPdfMk.g:8965:3: ( 'body' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 
            // InternalPdfMk.g:8966:3: ( 'body' )
            // InternalPdfMk.g:8967:4: 'body'
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 

            }

             after(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__KeyAssignment_0"


    // $ANTLR start "rule__TableBodyDefinition__ValueAssignment_2"
    // InternalPdfMk.g:8978:1: rule__TableBodyDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__TableBodyDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8982:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8983:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8983:2: ( ( '[' ) )
            // InternalPdfMk.g:8984:3: ( '[' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:8985:3: ( '[' )
            // InternalPdfMk.g:8986:4: '['
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__ValueAssignment_2"


    // $ANTLR start "rule__TableBodyDefinition__RowsAssignment_3_0"
    // InternalPdfMk.g:8997:1: rule__TableBodyDefinition__RowsAssignment_3_0 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9001:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:9002:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:9002:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:9003:3: ruleTableRowDefinition
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTableRowDefinition();

            state._fsp--;

             after(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__RowsAssignment_3_0"


    // $ANTLR start "rule__TableBodyDefinition__RowsAssignment_3_1_1"
    // InternalPdfMk.g:9012:1: rule__TableBodyDefinition__RowsAssignment_3_1_1 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9016:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:9017:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:9017:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:9018:3: ruleTableRowDefinition
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableRowDefinition();

            state._fsp--;

             after(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableBodyDefinition__RowsAssignment_3_1_1"


    // $ANTLR start "rule__TableDefinition__KeyAssignment_0"
    // InternalPdfMk.g:9027:1: rule__TableDefinition__KeyAssignment_0 : ( ( 'table' ) ) ;
    public final void rule__TableDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9031:1: ( ( ( 'table' ) ) )
            // InternalPdfMk.g:9032:2: ( ( 'table' ) )
            {
            // InternalPdfMk.g:9032:2: ( ( 'table' ) )
            // InternalPdfMk.g:9033:3: ( 'table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 
            // InternalPdfMk.g:9034:3: ( 'table' )
            // InternalPdfMk.g:9035:4: 'table'
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 

            }

             after(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__KeyAssignment_0"


    // $ANTLR start "rule__TableDefinition__ValueAssignment_2"
    // InternalPdfMk.g:9046:1: rule__TableDefinition__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__TableDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9050:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9051:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9051:2: ( ( '{' ) )
            // InternalPdfMk.g:9052:3: ( '{' )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:9053:3: ( '{' )
            // InternalPdfMk.g:9054:4: '{'
            {
             before(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__ValueAssignment_2"


    // $ANTLR start "rule__TableDefinition__BodyAssignment_3"
    // InternalPdfMk.g:9065:1: rule__TableDefinition__BodyAssignment_3 : ( ruleTableBodyDefinition ) ;
    public final void rule__TableDefinition__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9069:1: ( ( ruleTableBodyDefinition ) )
            // InternalPdfMk.g:9070:2: ( ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:9070:2: ( ruleTableBodyDefinition )
            // InternalPdfMk.g:9071:3: ruleTableBodyDefinition
            {
             before(grammarAccess.getTableDefinitionAccess().getBodyTableBodyDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTableBodyDefinition();

            state._fsp--;

             after(grammarAccess.getTableDefinitionAccess().getBodyTableBodyDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDefinition__BodyAssignment_3"


    // $ANTLR start "rule__TextObject__TextAssignment_1"
    // InternalPdfMk.g:9080:1: rule__TextObject__TextAssignment_1 : ( ruleTextDefinition ) ;
    public final void rule__TextObject__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9084:1: ( ( ruleTextDefinition ) )
            // InternalPdfMk.g:9085:2: ( ruleTextDefinition )
            {
            // InternalPdfMk.g:9085:2: ( ruleTextDefinition )
            // InternalPdfMk.g:9086:3: ruleTextDefinition
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
    // InternalPdfMk.g:9095:1: rule__TextObject__StyleAssignment_2_1 : ( ruleTextStyleDefinition ) ;
    public final void rule__TextObject__StyleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9099:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:9100:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:9100:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:9101:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:9110:1: rule__TextObject__FontSizeAssignment_3_1 : ( ruleFontSizeDefinition ) ;
    public final void rule__TextObject__FontSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9114:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:9115:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:9115:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:9116:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:9125:1: rule__TextObject__AlignmentAssignment_4_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__TextObject__AlignmentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9129:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:9130:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:9130:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:9131:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:9140:1: rule__TextObject__TypeFaceAssignment_5_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__TextObject__TypeFaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9144:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:9145:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:9145:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:9146:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:9155:1: rule__TextObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__TextObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9159:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:9160:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:9160:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:9161:3: ruleItalicsDefinition
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
    // InternalPdfMk.g:9170:1: rule__TextObject__WidthAssignment_7_1 : ( ruleWidthDefinition ) ;
    public final void rule__TextObject__WidthAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9174:1: ( ( ruleWidthDefinition ) )
            // InternalPdfMk.g:9175:2: ( ruleWidthDefinition )
            {
            // InternalPdfMk.g:9175:2: ( ruleWidthDefinition )
            // InternalPdfMk.g:9176:3: ruleWidthDefinition
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
    // InternalPdfMk.g:9185:1: rule__TextObject__MarginAssignment_8_1 : ( ruleMarginDefinition ) ;
    public final void rule__TextObject__MarginAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9189:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:9190:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:9190:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:9191:3: ruleMarginDefinition
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
    // InternalPdfMk.g:9200:1: rule__TextObject__ListCounterAssignment_9_1 : ( ruleListCounterDefinition ) ;
    public final void rule__TextObject__ListCounterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9204:1: ( ( ruleListCounterDefinition ) )
            // InternalPdfMk.g:9205:2: ( ruleListCounterDefinition )
            {
            // InternalPdfMk.g:9205:2: ( ruleListCounterDefinition )
            // InternalPdfMk.g:9206:3: ruleListCounterDefinition
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
    // InternalPdfMk.g:9215:1: rule__ColumnTextObject__ValueAssignment : ( ruleColumnDefinition ) ;
    public final void rule__ColumnTextObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9219:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9220:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9220:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9221:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9230:1: rule__StyleObject__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StyleObject__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9234:1: ( ( RULE_ID ) )
            // InternalPdfMk.g:9235:2: ( RULE_ID )
            {
            // InternalPdfMk.g:9235:2: ( RULE_ID )
            // InternalPdfMk.g:9236:3: RULE_ID
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
    // InternalPdfMk.g:9245:1: rule__StyleObject__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__StyleObject__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9249:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9250:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9250:2: ( ( '{' ) )
            // InternalPdfMk.g:9251:3: ( '{' )
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:9252:3: ( '{' )
            // InternalPdfMk.g:9253:4: '{'
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
    // InternalPdfMk.g:9264:1: rule__StyleObject__FontSizeAssignment_3 : ( ruleFontSizeDefinition ) ;
    public final void rule__StyleObject__FontSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9268:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:9269:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:9269:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:9270:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:9279:1: rule__StyleObject__TypeFaceAssignment_4_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__StyleObject__TypeFaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9283:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:9284:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:9284:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:9285:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:9294:1: rule__StyleObject__AlignmentAssignment_5_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__StyleObject__AlignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9298:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:9299:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:9299:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:9300:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:9309:1: rule__StyleObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__StyleObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9313:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:9314:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:9314:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:9315:3: ruleItalicsDefinition
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
    // InternalPdfMk.g:9324:1: rule__StyleObject__MarginAssignment_7_1 : ( ruleMarginDefinition ) ;
    public final void rule__StyleObject__MarginAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9328:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:9329:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:9329:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:9330:3: ruleMarginDefinition
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
    // InternalPdfMk.g:9339:1: rule__StyleObjects__ValueAssignment_1_0 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9343:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:9344:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:9344:2: ( ruleStyleObject )
            // InternalPdfMk.g:9345:3: ruleStyleObject
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
    // InternalPdfMk.g:9354:1: rule__StyleObjects__ValueAssignment_1_1_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9358:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:9359:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:9359:2: ( ruleStyleObject )
            // InternalPdfMk.g:9360:3: ruleStyleObject
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
    // InternalPdfMk.g:9369:1: rule__InnerColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__InnerColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9373:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:9374:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:9374:2: ( ( '[' ) )
            // InternalPdfMk.g:9375:3: ( '[' )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:9376:3: ( '[' )
            // InternalPdfMk.g:9377:4: '['
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
    // InternalPdfMk.g:9388:1: rule__InnerColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9392:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9393:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9393:2: ( ruleStringObject )
            // InternalPdfMk.g:9394:3: ruleStringObject
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
    // InternalPdfMk.g:9403:1: rule__InnerColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9407:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9408:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9408:2: ( ruleStringObject )
            // InternalPdfMk.g:9409:3: ruleStringObject
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
    // InternalPdfMk.g:9418:1: rule__InnerColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9422:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9423:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9423:2: ( ruleTextObject )
            // InternalPdfMk.g:9424:3: ruleTextObject
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
    // InternalPdfMk.g:9433:1: rule__InnerColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9437:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9438:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9438:2: ( ruleTextObject )
            // InternalPdfMk.g:9439:3: ruleTextObject
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
    // InternalPdfMk.g:9448:1: rule__InnerColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9452:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9453:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9453:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9454:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9463:1: rule__InnerColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9467:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9468:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9468:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9469:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9478:1: rule__ColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__ColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9482:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:9483:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:9483:2: ( ( '[' ) )
            // InternalPdfMk.g:9484:3: ( '[' )
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:9485:3: ( '[' )
            // InternalPdfMk.g:9486:4: '['
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
    // InternalPdfMk.g:9497:1: rule__ColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9501:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9502:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9502:2: ( ruleStringObject )
            // InternalPdfMk.g:9503:3: ruleStringObject
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
    // InternalPdfMk.g:9512:1: rule__ColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9516:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9517:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9517:2: ( ruleStringObject )
            // InternalPdfMk.g:9518:3: ruleStringObject
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
    // InternalPdfMk.g:9527:1: rule__ColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9531:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9532:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9532:2: ( ruleTextObject )
            // InternalPdfMk.g:9533:3: ruleTextObject
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
    // InternalPdfMk.g:9542:1: rule__ColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9546:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9547:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9547:2: ( ruleTextObject )
            // InternalPdfMk.g:9548:3: ruleTextObject
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
    // InternalPdfMk.g:9557:1: rule__ColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9561:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9562:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9562:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9563:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9572:1: rule__ColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9576:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9577:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9577:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9578:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9587:1: rule__ColumnObject__InnerColumnAssignment_4_0 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9591:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:9592:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:9592:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:9593:3: ruleInnerColumnObject
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
    // InternalPdfMk.g:9602:1: rule__ColumnObject__InnerColumnAssignment_4_1_1 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9606:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:9607:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:9607:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:9608:3: ruleInnerColumnObject
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
    // InternalPdfMk.g:9617:1: rule__ImageObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ImageObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9621:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9622:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9622:2: ( ( '{' ) )
            // InternalPdfMk.g:9623:3: ( '{' )
            {
             before(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9624:3: ( '{' )
            // InternalPdfMk.g:9625:4: '{'
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
    // InternalPdfMk.g:9636:1: rule__ImageObject__ImageAssignment_1 : ( ruleImageDefintion ) ;
    public final void rule__ImageObject__ImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9640:1: ( ( ruleImageDefintion ) )
            // InternalPdfMk.g:9641:2: ( ruleImageDefintion )
            {
            // InternalPdfMk.g:9641:2: ( ruleImageDefintion )
            // InternalPdfMk.g:9642:3: ruleImageDefintion
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
    // InternalPdfMk.g:9651:1: rule__ImageObject__WidthAssignment_2_1 : ( ruleImageWidthDefintion ) ;
    public final void rule__ImageObject__WidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9655:1: ( ( ruleImageWidthDefintion ) )
            // InternalPdfMk.g:9656:2: ( ruleImageWidthDefintion )
            {
            // InternalPdfMk.g:9656:2: ( ruleImageWidthDefintion )
            // InternalPdfMk.g:9657:3: ruleImageWidthDefintion
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
    // InternalPdfMk.g:9666:1: rule__ImageObject__HeightAssignment_3_1 : ( ruleImageHeightDefintion ) ;
    public final void rule__ImageObject__HeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9670:1: ( ( ruleImageHeightDefintion ) )
            // InternalPdfMk.g:9671:2: ( ruleImageHeightDefintion )
            {
            // InternalPdfMk.g:9671:2: ( ruleImageHeightDefintion )
            // InternalPdfMk.g:9672:3: ruleImageHeightDefintion
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
    // InternalPdfMk.g:9681:1: rule__ImageObject__OpacityAssignment_4_1 : ( ruleImageOpacityDefinition ) ;
    public final void rule__ImageObject__OpacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9685:1: ( ( ruleImageOpacityDefinition ) )
            // InternalPdfMk.g:9686:2: ( ruleImageOpacityDefinition )
            {
            // InternalPdfMk.g:9686:2: ( ruleImageOpacityDefinition )
            // InternalPdfMk.g:9687:3: ruleImageOpacityDefinition
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
    // InternalPdfMk.g:9696:1: rule__ImageObject__FitAssignment_5_1 : ( ruleImageFitDefinition ) ;
    public final void rule__ImageObject__FitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9700:1: ( ( ruleImageFitDefinition ) )
            // InternalPdfMk.g:9701:2: ( ruleImageFitDefinition )
            {
            // InternalPdfMk.g:9701:2: ( ruleImageFitDefinition )
            // InternalPdfMk.g:9702:3: ruleImageFitDefinition
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
    // InternalPdfMk.g:9711:1: rule__ImageObject__PageBreakAssignment_6_1 : ( ruleImagePageBreakDefinition ) ;
    public final void rule__ImageObject__PageBreakAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9715:1: ( ( ruleImagePageBreakDefinition ) )
            // InternalPdfMk.g:9716:2: ( ruleImagePageBreakDefinition )
            {
            // InternalPdfMk.g:9716:2: ( ruleImagePageBreakDefinition )
            // InternalPdfMk.g:9717:3: ruleImagePageBreakDefinition
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
    // InternalPdfMk.g:9726:1: rule__ListObjectPropertiesWrapper__ValueAssignment : ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) ;
    public final void rule__ListObjectPropertiesWrapper__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9730:1: ( ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:9731:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:9731:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            // InternalPdfMk.g:9732:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:9733:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            // InternalPdfMk.g:9733:4: rule__ListObjectPropertiesWrapper__ValueAlternatives_0
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
    // InternalPdfMk.g:9741:1: rule__ListElements__ElValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListElements__ElValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9745:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:9746:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:9746:2: ( RULE_STRING )
            // InternalPdfMk.g:9747:3: RULE_STRING
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
    // InternalPdfMk.g:9756:1: rule__ListObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ListObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9760:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9761:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9761:2: ( ( '{' ) )
            // InternalPdfMk.g:9762:3: ( '{' )
            {
             before(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9763:3: ( '{' )
            // InternalPdfMk.g:9764:4: '{'
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
    // InternalPdfMk.g:9775:1: rule__ListObject__PropertiesAssignment_1_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9779:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:9780:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:9780:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:9781:3: ruleListObjectPropertiesWrapper
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


    // $ANTLR start "rule__ListObject__PropertiesAssignment_1_2_0"
    // InternalPdfMk.g:9790:1: rule__ListObject__PropertiesAssignment_1_2_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9794:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:9795:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:9795:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:9796:3: ruleListObjectPropertiesWrapper
            {
             before(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListObjectPropertiesWrapper();

            state._fsp--;

             after(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListObject__PropertiesAssignment_1_2_0"


    // $ANTLR start "rule__ListObject__ElementsAssignment_5_0"
    // InternalPdfMk.g:9805:1: rule__ListObject__ElementsAssignment_5_0 : ( ruleListElements ) ;
    public final void rule__ListObject__ElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9809:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:9810:2: ( ruleListElements )
            {
            // InternalPdfMk.g:9810:2: ( ruleListElements )
            // InternalPdfMk.g:9811:3: ruleListElements
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
    // InternalPdfMk.g:9820:1: rule__ListObject__ElemtensAssignment_5_1_1 : ( ruleListElements ) ;
    public final void rule__ListObject__ElemtensAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9824:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:9825:2: ( ruleListElements )
            {
            // InternalPdfMk.g:9825:2: ( ruleListElements )
            // InternalPdfMk.g:9826:3: ruleListElements
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


    // $ANTLR start "rule__TableObject__ValueAssignment_0"
    // InternalPdfMk.g:9835:1: rule__TableObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TableObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9839:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9840:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9840:2: ( ( '{' ) )
            // InternalPdfMk.g:9841:3: ( '{' )
            {
             before(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9842:3: ( '{' )
            // InternalPdfMk.g:9843:4: '{'
            {
             before(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__ValueAssignment_0"


    // $ANTLR start "rule__TableObject__StyleAssignment_1_0"
    // InternalPdfMk.g:9854:1: rule__TableObject__StyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__TableObject__StyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9858:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:9859:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:9859:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:9860:3: ruleTextStyleDefinition
            {
             before(grammarAccess.getTableObjectAccess().getStyleTextStyleDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextStyleDefinition();

            state._fsp--;

             after(grammarAccess.getTableObjectAccess().getStyleTextStyleDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__StyleAssignment_1_0"


    // $ANTLR start "rule__TableObject__TableAssignment_2"
    // InternalPdfMk.g:9869:1: rule__TableObject__TableAssignment_2 : ( ruleTableDefinition ) ;
    public final void rule__TableObject__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9873:1: ( ( ruleTableDefinition ) )
            // InternalPdfMk.g:9874:2: ( ruleTableDefinition )
            {
            // InternalPdfMk.g:9874:2: ( ruleTableDefinition )
            // InternalPdfMk.g:9875:3: ruleTableDefinition
            {
             before(grammarAccess.getTableObjectAccess().getTableTableDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTableDefinition();

            state._fsp--;

             after(grammarAccess.getTableObjectAccess().getTableTableDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableObject__TableAssignment_2"


    // $ANTLR start "rule__ContentObject__ValueAssignment"
    // InternalPdfMk.g:9884:1: rule__ContentObject__ValueAssignment : ( ( rule__ContentObject__ValueAlternatives_0 ) ) ;
    public final void rule__ContentObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9888:1: ( ( ( rule__ContentObject__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:9889:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:9889:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            // InternalPdfMk.g:9890:3: ( rule__ContentObject__ValueAlternatives_0 )
            {
             before(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:9891:3: ( rule__ContentObject__ValueAlternatives_0 )
            // InternalPdfMk.g:9891:4: rule__ContentObject__ValueAlternatives_0
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


    // $ANTLR start "rule__ContentObjects__ValueAssignment_2_0"
    // InternalPdfMk.g:9899:1: rule__ContentObjects__ValueAssignment_2_0 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9903:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:9904:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:9904:2: ( ruleContentObject )
            // InternalPdfMk.g:9905:3: ruleContentObject
            {
             before(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContentObject();

            state._fsp--;

             after(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__ValueAssignment_2_0"


    // $ANTLR start "rule__ContentObjects__ValueAssignment_2_1_1"
    // InternalPdfMk.g:9914:1: rule__ContentObjects__ValueAssignment_2_1_1 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9918:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:9919:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:9919:2: ( ruleContentObject )
            // InternalPdfMk.g:9920:3: ruleContentObject
            {
             before(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentObject();

            state._fsp--;

             after(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentObjects__ValueAssignment_2_1_1"


    // $ANTLR start "rule__Styles__KeyAssignment_0"
    // InternalPdfMk.g:9929:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9933:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:9934:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:9934:2: ( ( 'styles' ) )
            // InternalPdfMk.g:9935:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:9936:3: ( 'styles' )
            // InternalPdfMk.g:9937:4: 'styles'
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPdfMk.g:9948:1: rule__Styles__ValueAssignment_2 : ( ruleStyleObjects ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9952:1: ( ( ruleStyleObjects ) )
            // InternalPdfMk.g:9953:2: ( ruleStyleObjects )
            {
            // InternalPdfMk.g:9953:2: ( ruleStyleObjects )
            // InternalPdfMk.g:9954:3: ruleStyleObjects
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
    // InternalPdfMk.g:9963:1: rule__Content__KeyAssignment_0 : ( ( 'content' ) ) ;
    public final void rule__Content__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9967:1: ( ( ( 'content' ) ) )
            // InternalPdfMk.g:9968:2: ( ( 'content' ) )
            {
            // InternalPdfMk.g:9968:2: ( ( 'content' ) )
            // InternalPdfMk.g:9969:3: ( 'content' )
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            // InternalPdfMk.g:9970:3: ( 'content' )
            // InternalPdfMk.g:9971:4: 'content'
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPdfMk.g:9982:1: rule__Content__ValueAssignment_2 : ( ruleContentObjects ) ;
    public final void rule__Content__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9986:1: ( ( ruleContentObjects ) )
            // InternalPdfMk.g:9987:2: ( ruleContentObjects )
            {
            // InternalPdfMk.g:9987:2: ( ruleContentObjects )
            // InternalPdfMk.g:9988:3: ruleContentObjects
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\15\1\uffff\1\25\4\uffff\1\5\1\24\1\37";
    static final String dfa_3s = "\1\22\1\uffff\1\54\1\uffff\1\25\4\uffff\1\5\1\24\1\54";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\6\1\5\1\4\1\3\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
            "",
            "\2\6\4\uffff\2\7\5\uffff\1\4\1\3\3\uffff\1\10\1\uffff\1\7\4\uffff\5\6\1\uffff\1\5",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\10\14\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1268:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001100010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000007C000006000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000001040020L});

}