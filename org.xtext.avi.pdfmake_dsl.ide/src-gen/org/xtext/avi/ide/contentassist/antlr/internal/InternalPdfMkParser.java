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


    // $ANTLR start "entryRuleTextObjectMembersWrapper"
    // InternalPdfMk.g:753:1: entryRuleTextObjectMembersWrapper : ruleTextObjectMembersWrapper EOF ;
    public final void entryRuleTextObjectMembersWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:754:1: ( ruleTextObjectMembersWrapper EOF )
            // InternalPdfMk.g:755:1: ruleTextObjectMembersWrapper EOF
            {
             before(grammarAccess.getTextObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            ruleTextObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getTextObjectMembersWrapperRule()); 
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
    // $ANTLR end "entryRuleTextObjectMembersWrapper"


    // $ANTLR start "ruleTextObjectMembersWrapper"
    // InternalPdfMk.g:762:1: ruleTextObjectMembersWrapper : ( ( rule__TextObjectMembersWrapper__Alternatives ) ) ;
    public final void ruleTextObjectMembersWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:766:2: ( ( ( rule__TextObjectMembersWrapper__Alternatives ) ) )
            // InternalPdfMk.g:767:2: ( ( rule__TextObjectMembersWrapper__Alternatives ) )
            {
            // InternalPdfMk.g:767:2: ( ( rule__TextObjectMembersWrapper__Alternatives ) )
            // InternalPdfMk.g:768:3: ( rule__TextObjectMembersWrapper__Alternatives )
            {
             before(grammarAccess.getTextObjectMembersWrapperAccess().getAlternatives()); 
            // InternalPdfMk.g:769:3: ( rule__TextObjectMembersWrapper__Alternatives )
            // InternalPdfMk.g:769:4: rule__TextObjectMembersWrapper__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextObjectMembersWrapper__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectMembersWrapperAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextObjectMembersWrapper"


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:778:1: entryRuleTextObject : ruleTextObject EOF ;
    public final void entryRuleTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:779:1: ( ruleTextObject EOF )
            // InternalPdfMk.g:780:1: ruleTextObject EOF
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
    // InternalPdfMk.g:787:1: ruleTextObject : ( ( rule__TextObject__Group__0 ) ) ;
    public final void ruleTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:791:2: ( ( ( rule__TextObject__Group__0 ) ) )
            // InternalPdfMk.g:792:2: ( ( rule__TextObject__Group__0 ) )
            {
            // InternalPdfMk.g:792:2: ( ( rule__TextObject__Group__0 ) )
            // InternalPdfMk.g:793:3: ( rule__TextObject__Group__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup()); 
            // InternalPdfMk.g:794:3: ( rule__TextObject__Group__0 )
            // InternalPdfMk.g:794:4: rule__TextObject__Group__0
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
    // InternalPdfMk.g:803:1: entryRuleColumnTextObject : ruleColumnTextObject EOF ;
    public final void entryRuleColumnTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:804:1: ( ruleColumnTextObject EOF )
            // InternalPdfMk.g:805:1: ruleColumnTextObject EOF
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
    // InternalPdfMk.g:812:1: ruleColumnTextObject : ( ( rule__ColumnTextObject__ValueAssignment ) ) ;
    public final void ruleColumnTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:816:2: ( ( ( rule__ColumnTextObject__ValueAssignment ) ) )
            // InternalPdfMk.g:817:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:817:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            // InternalPdfMk.g:818:3: ( rule__ColumnTextObject__ValueAssignment )
            {
             before(grammarAccess.getColumnTextObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:819:3: ( rule__ColumnTextObject__ValueAssignment )
            // InternalPdfMk.g:819:4: rule__ColumnTextObject__ValueAssignment
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
    // InternalPdfMk.g:828:1: entryRuleStyleObject : ruleStyleObject EOF ;
    public final void entryRuleStyleObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:829:1: ( ruleStyleObject EOF )
            // InternalPdfMk.g:830:1: ruleStyleObject EOF
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
    // InternalPdfMk.g:837:1: ruleStyleObject : ( ( rule__StyleObject__Group__0 ) ) ;
    public final void ruleStyleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:841:2: ( ( ( rule__StyleObject__Group__0 ) ) )
            // InternalPdfMk.g:842:2: ( ( rule__StyleObject__Group__0 ) )
            {
            // InternalPdfMk.g:842:2: ( ( rule__StyleObject__Group__0 ) )
            // InternalPdfMk.g:843:3: ( rule__StyleObject__Group__0 )
            {
             before(grammarAccess.getStyleObjectAccess().getGroup()); 
            // InternalPdfMk.g:844:3: ( rule__StyleObject__Group__0 )
            // InternalPdfMk.g:844:4: rule__StyleObject__Group__0
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
    // InternalPdfMk.g:853:1: entryRuleStyleObjects : ruleStyleObjects EOF ;
    public final void entryRuleStyleObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:854:1: ( ruleStyleObjects EOF )
            // InternalPdfMk.g:855:1: ruleStyleObjects EOF
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
    // InternalPdfMk.g:862:1: ruleStyleObjects : ( ( rule__StyleObjects__Group__0 ) ) ;
    public final void ruleStyleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:866:2: ( ( ( rule__StyleObjects__Group__0 ) ) )
            // InternalPdfMk.g:867:2: ( ( rule__StyleObjects__Group__0 ) )
            {
            // InternalPdfMk.g:867:2: ( ( rule__StyleObjects__Group__0 ) )
            // InternalPdfMk.g:868:3: ( rule__StyleObjects__Group__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup()); 
            // InternalPdfMk.g:869:3: ( rule__StyleObjects__Group__0 )
            // InternalPdfMk.g:869:4: rule__StyleObjects__Group__0
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
    // InternalPdfMk.g:878:1: entryRuleInnerColumnObject : ruleInnerColumnObject EOF ;
    public final void entryRuleInnerColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:879:1: ( ruleInnerColumnObject EOF )
            // InternalPdfMk.g:880:1: ruleInnerColumnObject EOF
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
    // InternalPdfMk.g:887:1: ruleInnerColumnObject : ( ( rule__InnerColumnObject__Group__0 ) ) ;
    public final void ruleInnerColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:891:2: ( ( ( rule__InnerColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:892:2: ( ( rule__InnerColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:892:2: ( ( rule__InnerColumnObject__Group__0 ) )
            // InternalPdfMk.g:893:3: ( rule__InnerColumnObject__Group__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:894:3: ( rule__InnerColumnObject__Group__0 )
            // InternalPdfMk.g:894:4: rule__InnerColumnObject__Group__0
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
    // InternalPdfMk.g:903:1: entryRuleColumnObject : ruleColumnObject EOF ;
    public final void entryRuleColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:904:1: ( ruleColumnObject EOF )
            // InternalPdfMk.g:905:1: ruleColumnObject EOF
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
    // InternalPdfMk.g:912:1: ruleColumnObject : ( ( rule__ColumnObject__Group__0 ) ) ;
    public final void ruleColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:916:2: ( ( ( rule__ColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:917:2: ( ( rule__ColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:917:2: ( ( rule__ColumnObject__Group__0 ) )
            // InternalPdfMk.g:918:3: ( rule__ColumnObject__Group__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:919:3: ( rule__ColumnObject__Group__0 )
            // InternalPdfMk.g:919:4: rule__ColumnObject__Group__0
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
    // InternalPdfMk.g:928:1: entryRuleImageObject : ruleImageObject EOF ;
    public final void entryRuleImageObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:929:1: ( ruleImageObject EOF )
            // InternalPdfMk.g:930:1: ruleImageObject EOF
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
    // InternalPdfMk.g:937:1: ruleImageObject : ( ( rule__ImageObject__Group__0 ) ) ;
    public final void ruleImageObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:941:2: ( ( ( rule__ImageObject__Group__0 ) ) )
            // InternalPdfMk.g:942:2: ( ( rule__ImageObject__Group__0 ) )
            {
            // InternalPdfMk.g:942:2: ( ( rule__ImageObject__Group__0 ) )
            // InternalPdfMk.g:943:3: ( rule__ImageObject__Group__0 )
            {
             before(grammarAccess.getImageObjectAccess().getGroup()); 
            // InternalPdfMk.g:944:3: ( rule__ImageObject__Group__0 )
            // InternalPdfMk.g:944:4: rule__ImageObject__Group__0
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
    // InternalPdfMk.g:953:1: entryRuleListObjectPropertiesWrapper : ruleListObjectPropertiesWrapper EOF ;
    public final void entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:954:1: ( ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:955:1: ruleListObjectPropertiesWrapper EOF
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
    // InternalPdfMk.g:962:1: ruleListObjectPropertiesWrapper : ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) ;
    public final void ruleListObjectPropertiesWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:966:2: ( ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) )
            // InternalPdfMk.g:967:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            {
            // InternalPdfMk.g:967:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            // InternalPdfMk.g:968:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAssignment()); 
            // InternalPdfMk.g:969:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            // InternalPdfMk.g:969:4: rule__ListObjectPropertiesWrapper__ValueAssignment
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
    // InternalPdfMk.g:978:1: entryRuleListElements : ruleListElements EOF ;
    public final void entryRuleListElements() throws RecognitionException {
        try {
            // InternalPdfMk.g:979:1: ( ruleListElements EOF )
            // InternalPdfMk.g:980:1: ruleListElements EOF
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
    // InternalPdfMk.g:987:1: ruleListElements : ( ( rule__ListElements__Alternatives ) ) ;
    public final void ruleListElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:991:2: ( ( ( rule__ListElements__Alternatives ) ) )
            // InternalPdfMk.g:992:2: ( ( rule__ListElements__Alternatives ) )
            {
            // InternalPdfMk.g:992:2: ( ( rule__ListElements__Alternatives ) )
            // InternalPdfMk.g:993:3: ( rule__ListElements__Alternatives )
            {
             before(grammarAccess.getListElementsAccess().getAlternatives()); 
            // InternalPdfMk.g:994:3: ( rule__ListElements__Alternatives )
            // InternalPdfMk.g:994:4: rule__ListElements__Alternatives
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
    // InternalPdfMk.g:1003:1: entryRuleListObject : ruleListObject EOF ;
    public final void entryRuleListObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1004:1: ( ruleListObject EOF )
            // InternalPdfMk.g:1005:1: ruleListObject EOF
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
    // InternalPdfMk.g:1012:1: ruleListObject : ( ( rule__ListObject__Group__0 ) ) ;
    public final void ruleListObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1016:2: ( ( ( rule__ListObject__Group__0 ) ) )
            // InternalPdfMk.g:1017:2: ( ( rule__ListObject__Group__0 ) )
            {
            // InternalPdfMk.g:1017:2: ( ( rule__ListObject__Group__0 ) )
            // InternalPdfMk.g:1018:3: ( rule__ListObject__Group__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup()); 
            // InternalPdfMk.g:1019:3: ( rule__ListObject__Group__0 )
            // InternalPdfMk.g:1019:4: rule__ListObject__Group__0
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
    // InternalPdfMk.g:1028:1: entryRuleTableObject : ruleTableObject EOF ;
    public final void entryRuleTableObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1029:1: ( ruleTableObject EOF )
            // InternalPdfMk.g:1030:1: ruleTableObject EOF
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
    // InternalPdfMk.g:1037:1: ruleTableObject : ( ( rule__TableObject__Group__0 ) ) ;
    public final void ruleTableObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1041:2: ( ( ( rule__TableObject__Group__0 ) ) )
            // InternalPdfMk.g:1042:2: ( ( rule__TableObject__Group__0 ) )
            {
            // InternalPdfMk.g:1042:2: ( ( rule__TableObject__Group__0 ) )
            // InternalPdfMk.g:1043:3: ( rule__TableObject__Group__0 )
            {
             before(grammarAccess.getTableObjectAccess().getGroup()); 
            // InternalPdfMk.g:1044:3: ( rule__TableObject__Group__0 )
            // InternalPdfMk.g:1044:4: rule__TableObject__Group__0
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
    // InternalPdfMk.g:1053:1: entryRuleContentObject : ruleContentObject EOF ;
    public final void entryRuleContentObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1054:1: ( ruleContentObject EOF )
            // InternalPdfMk.g:1055:1: ruleContentObject EOF
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
    // InternalPdfMk.g:1062:1: ruleContentObject : ( ( rule__ContentObject__ValueAssignment ) ) ;
    public final void ruleContentObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1066:2: ( ( ( rule__ContentObject__ValueAssignment ) ) )
            // InternalPdfMk.g:1067:2: ( ( rule__ContentObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:1067:2: ( ( rule__ContentObject__ValueAssignment ) )
            // InternalPdfMk.g:1068:3: ( rule__ContentObject__ValueAssignment )
            {
             before(grammarAccess.getContentObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:1069:3: ( rule__ContentObject__ValueAssignment )
            // InternalPdfMk.g:1069:4: rule__ContentObject__ValueAssignment
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
    // InternalPdfMk.g:1078:1: entryRuleContentObjects : ruleContentObjects EOF ;
    public final void entryRuleContentObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:1079:1: ( ruleContentObjects EOF )
            // InternalPdfMk.g:1080:1: ruleContentObjects EOF
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
    // InternalPdfMk.g:1087:1: ruleContentObjects : ( ( rule__ContentObjects__Group__0 ) ) ;
    public final void ruleContentObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1091:2: ( ( ( rule__ContentObjects__Group__0 ) ) )
            // InternalPdfMk.g:1092:2: ( ( rule__ContentObjects__Group__0 ) )
            {
            // InternalPdfMk.g:1092:2: ( ( rule__ContentObjects__Group__0 ) )
            // InternalPdfMk.g:1093:3: ( rule__ContentObjects__Group__0 )
            {
             before(grammarAccess.getContentObjectsAccess().getGroup()); 
            // InternalPdfMk.g:1094:3: ( rule__ContentObjects__Group__0 )
            // InternalPdfMk.g:1094:4: rule__ContentObjects__Group__0
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
    // InternalPdfMk.g:1103:1: entryRuleStyles : ruleStyles EOF ;
    public final void entryRuleStyles() throws RecognitionException {
        try {
            // InternalPdfMk.g:1104:1: ( ruleStyles EOF )
            // InternalPdfMk.g:1105:1: ruleStyles EOF
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
    // InternalPdfMk.g:1112:1: ruleStyles : ( ( rule__Styles__Group__0 ) ) ;
    public final void ruleStyles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1116:2: ( ( ( rule__Styles__Group__0 ) ) )
            // InternalPdfMk.g:1117:2: ( ( rule__Styles__Group__0 ) )
            {
            // InternalPdfMk.g:1117:2: ( ( rule__Styles__Group__0 ) )
            // InternalPdfMk.g:1118:3: ( rule__Styles__Group__0 )
            {
             before(grammarAccess.getStylesAccess().getGroup()); 
            // InternalPdfMk.g:1119:3: ( rule__Styles__Group__0 )
            // InternalPdfMk.g:1119:4: rule__Styles__Group__0
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
    // InternalPdfMk.g:1128:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:1129:1: ( ruleContent EOF )
            // InternalPdfMk.g:1130:1: ruleContent EOF
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
    // InternalPdfMk.g:1137:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1141:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPdfMk.g:1142:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPdfMk.g:1142:2: ( ( rule__Content__Group__0 ) )
            // InternalPdfMk.g:1143:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPdfMk.g:1144:3: ( rule__Content__Group__0 )
            // InternalPdfMk.g:1144:4: rule__Content__Group__0
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
    // InternalPdfMk.g:1152:1: rule__BooleanType__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1156:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalPdfMk.g:1157:2: ( 'true' )
                    {
                    // InternalPdfMk.g:1157:2: ( 'true' )
                    // InternalPdfMk.g:1158:3: 'true'
                    {
                     before(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1163:2: ( 'false' )
                    {
                    // InternalPdfMk.g:1163:2: ( 'false' )
                    // InternalPdfMk.g:1164:3: 'false'
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
    // InternalPdfMk.g:1173:1: rule__TableCellItemElements__ElementsAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );
    public final void rule__TableCellItemElements__ElementsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1177:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:1178:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1178:2: ( ruleStringObject )
                    // InternalPdfMk.g:1179:3: ruleStringObject
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
                    // InternalPdfMk.g:1184:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1184:2: ( ruleTextObject )
                    // InternalPdfMk.g:1185:3: ruleTextObject
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
                    // InternalPdfMk.g:1190:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1190:2: ( ruleImageObject )
                    // InternalPdfMk.g:1191:3: ruleImageObject
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
                    // InternalPdfMk.g:1196:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1196:2: ( ruleListObject )
                    // InternalPdfMk.g:1197:3: ruleListObject
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


    // $ANTLR start "rule__TextObjectMembersWrapper__Alternatives"
    // InternalPdfMk.g:1206:1: rule__TextObjectMembersWrapper__Alternatives : ( ( ruleTextDefinition ) | ( ruleTextStyleDefinition ) | ( ruleFontSizeDefinition ) | ( ruleTextAlignmentDefinition ) | ( ruleTypeFaceDefinition ) | ( ruleItalicsDefinition ) | ( ruleWidthDefinition ) | ( ruleMarginDefinition ) | ( ruleListCounterDefinition ) );
    public final void rule__TextObjectMembersWrapper__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1210:1: ( ( ruleTextDefinition ) | ( ruleTextStyleDefinition ) | ( ruleFontSizeDefinition ) | ( ruleTextAlignmentDefinition ) | ( ruleTypeFaceDefinition ) | ( ruleItalicsDefinition ) | ( ruleWidthDefinition ) | ( ruleMarginDefinition ) | ( ruleListCounterDefinition ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 32:
                {
                alt3=8;
                }
                break;
            case 39:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPdfMk.g:1211:2: ( ruleTextDefinition )
                    {
                    // InternalPdfMk.g:1211:2: ( ruleTextDefinition )
                    // InternalPdfMk.g:1212:3: ruleTextDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getTextDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getTextDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1217:2: ( ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:1217:2: ( ruleTextStyleDefinition )
                    // InternalPdfMk.g:1218:3: ruleTextStyleDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getTextStyleDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextStyleDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getTextStyleDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1223:2: ( ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:1223:2: ( ruleFontSizeDefinition )
                    // InternalPdfMk.g:1224:3: ruleFontSizeDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getFontSizeDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFontSizeDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getFontSizeDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1229:2: ( ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:1229:2: ( ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:1230:3: ruleTextAlignmentDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getTextAlignmentDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTextAlignmentDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getTextAlignmentDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1235:2: ( ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:1235:2: ( ruleTypeFaceDefinition )
                    // InternalPdfMk.g:1236:3: ruleTypeFaceDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getTypeFaceDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeFaceDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getTypeFaceDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPdfMk.g:1241:2: ( ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:1241:2: ( ruleItalicsDefinition )
                    // InternalPdfMk.g:1242:3: ruleItalicsDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getItalicsDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleItalicsDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getItalicsDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPdfMk.g:1247:2: ( ruleWidthDefinition )
                    {
                    // InternalPdfMk.g:1247:2: ( ruleWidthDefinition )
                    // InternalPdfMk.g:1248:3: ruleWidthDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getWidthDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWidthDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getWidthDefinitionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPdfMk.g:1253:2: ( ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:1253:2: ( ruleMarginDefinition )
                    // InternalPdfMk.g:1254:3: ruleMarginDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getMarginDefinitionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMarginDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getMarginDefinitionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPdfMk.g:1259:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1259:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1260:3: ruleListCounterDefinition
                    {
                     before(grammarAccess.getTextObjectMembersWrapperAccess().getListCounterDefinitionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleListCounterDefinition();

                    state._fsp--;

                     after(grammarAccess.getTextObjectMembersWrapperAccess().getListCounterDefinitionParserRuleCall_8()); 

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
    // $ANTLR end "rule__TextObjectMembersWrapper__Alternatives"


    // $ANTLR start "rule__ListObjectPropertiesWrapper__ValueAlternatives_0"
    // InternalPdfMk.g:1269:1: rule__ListObjectPropertiesWrapper__ValueAlternatives_0 : ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) );
    public final void rule__ListObjectPropertiesWrapper__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1273:1: ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 41:
                {
                alt4=4;
                }
                break;
            case 42:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:1274:2: ( ruleListReversedDefinition )
                    {
                    // InternalPdfMk.g:1274:2: ( ruleListReversedDefinition )
                    // InternalPdfMk.g:1275:3: ruleListReversedDefinition
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
                    // InternalPdfMk.g:1280:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1280:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1281:3: ruleListCounterDefinition
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
                    // InternalPdfMk.g:1286:2: ( ruleListTypeDefinition )
                    {
                    // InternalPdfMk.g:1286:2: ( ruleListTypeDefinition )
                    // InternalPdfMk.g:1287:3: ruleListTypeDefinition
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
                    // InternalPdfMk.g:1292:2: ( ruleListColorDefinition )
                    {
                    // InternalPdfMk.g:1292:2: ( ruleListColorDefinition )
                    // InternalPdfMk.g:1293:3: ruleListColorDefinition
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
                    // InternalPdfMk.g:1298:2: ( ruleListMarkerColorDefinition )
                    {
                    // InternalPdfMk.g:1298:2: ( ruleListMarkerColorDefinition )
                    // InternalPdfMk.g:1299:3: ruleListMarkerColorDefinition
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
    // InternalPdfMk.g:1308:1: rule__ListElements__Alternatives : ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) );
    public final void rule__ListElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1312:1: ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 25:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 39:
                    {
                    alt5=2;
                    }
                    break;
                case 26:
                    {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==21) ) {
                        int LA5_6 = input.LA(4);

                        if ( (LA5_6==RULE_STRING) ) {
                            int LA5_7 = input.LA(5);

                            if ( (LA5_7==20) ) {
                                int LA5_8 = input.LA(6);

                                if ( (LA5_8==22||(LA5_8>=25 && LA5_8<=30)||LA5_8==32||LA5_8==39) ) {
                                    alt5=2;
                                }
                                else if ( (LA5_8==31) ) {
                                    alt5=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 8, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA5_7==19) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    alt5=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

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
                    // InternalPdfMk.g:1313:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    {
                    // InternalPdfMk.g:1313:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    // InternalPdfMk.g:1314:3: ( rule__ListElements__ElValuesAssignment_0 )
                    {
                     before(grammarAccess.getListElementsAccess().getElValuesAssignment_0()); 
                    // InternalPdfMk.g:1315:3: ( rule__ListElements__ElValuesAssignment_0 )
                    // InternalPdfMk.g:1315:4: rule__ListElements__ElValuesAssignment_0
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
                    // InternalPdfMk.g:1319:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1319:2: ( ruleTextObject )
                    // InternalPdfMk.g:1320:3: ruleTextObject
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
                    // InternalPdfMk.g:1325:2: ( ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1325:2: ( ruleColumnDefinition )
                    // InternalPdfMk.g:1326:3: ruleColumnDefinition
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
    // InternalPdfMk.g:1335:1: rule__ListObject__Alternatives_2 : ( ( 'ul' ) | ( 'ol' ) );
    public final void rule__ListObject__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1339:1: ( ( 'ul' ) | ( 'ol' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:1340:2: ( 'ul' )
                    {
                    // InternalPdfMk.g:1340:2: ( 'ul' )
                    // InternalPdfMk.g:1341:3: 'ul'
                    {
                     before(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1346:2: ( 'ol' )
                    {
                    // InternalPdfMk.g:1346:2: ( 'ol' )
                    // InternalPdfMk.g:1347:3: 'ol'
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
    // InternalPdfMk.g:1356:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );
    public final void rule__ContentObject__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1360:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1361:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1361:2: ( ruleStringObject )
                    // InternalPdfMk.g:1362:3: ruleStringObject
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
                    // InternalPdfMk.g:1367:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1367:2: ( ruleTextObject )
                    // InternalPdfMk.g:1368:3: ruleTextObject
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
                    // InternalPdfMk.g:1373:2: ( ruleColumnTextObject )
                    {
                    // InternalPdfMk.g:1373:2: ( ruleColumnTextObject )
                    // InternalPdfMk.g:1374:3: ruleColumnTextObject
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
                    // InternalPdfMk.g:1379:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1379:2: ( ruleImageObject )
                    // InternalPdfMk.g:1380:3: ruleImageObject
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
                    // InternalPdfMk.g:1385:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1385:2: ( ruleListObject )
                    // InternalPdfMk.g:1386:3: ruleListObject
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
                    // InternalPdfMk.g:1391:2: ( ruleTableObject )
                    {
                    // InternalPdfMk.g:1391:2: ( ruleTableObject )
                    // InternalPdfMk.g:1392:3: ruleTableObject
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
    // InternalPdfMk.g:1401:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1405:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:1406:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
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
    // InternalPdfMk.g:1413:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1417:1: ( ( 'var' ) )
            // InternalPdfMk.g:1418:1: ( 'var' )
            {
            // InternalPdfMk.g:1418:1: ( 'var' )
            // InternalPdfMk.g:1419:2: 'var'
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
    // InternalPdfMk.g:1428:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1432:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:1433:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
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
    // InternalPdfMk.g:1440:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1444:1: ( ( 'dd' ) )
            // InternalPdfMk.g:1445:1: ( 'dd' )
            {
            // InternalPdfMk.g:1445:1: ( 'dd' )
            // InternalPdfMk.g:1446:2: 'dd'
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
    // InternalPdfMk.g:1455:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1459:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:1460:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
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
    // InternalPdfMk.g:1467:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1471:1: ( ( '=' ) )
            // InternalPdfMk.g:1472:1: ( '=' )
            {
            // InternalPdfMk.g:1472:1: ( '=' )
            // InternalPdfMk.g:1473:2: '='
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
    // InternalPdfMk.g:1482:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1486:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:1487:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
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
    // InternalPdfMk.g:1494:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1498:1: ( ( '{' ) )
            // InternalPdfMk.g:1499:1: ( '{' )
            {
            // InternalPdfMk.g:1499:1: ( '{' )
            // InternalPdfMk.g:1500:2: '{'
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
    // InternalPdfMk.g:1509:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1513:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:1514:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
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
    // InternalPdfMk.g:1521:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1525:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:1526:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:1526:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:1527:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:1528:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:1528:3: rule__DocDefinition__ContentAssignment_4
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
    // InternalPdfMk.g:1536:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1540:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:1541:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
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
    // InternalPdfMk.g:1548:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1552:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:1553:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:1553:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:1554:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:1555:2: ( rule__DocDefinition__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:1555:3: rule__DocDefinition__Group_5__0
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
    // InternalPdfMk.g:1563:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1567:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:1568:2: rule__DocDefinition__Group__6__Impl
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
    // InternalPdfMk.g:1574:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1578:1: ( ( '}' ) )
            // InternalPdfMk.g:1579:1: ( '}' )
            {
            // InternalPdfMk.g:1579:1: ( '}' )
            // InternalPdfMk.g:1580:2: '}'
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
    // InternalPdfMk.g:1590:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1594:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:1595:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
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
    // InternalPdfMk.g:1602:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1606:1: ( ( ',' ) )
            // InternalPdfMk.g:1607:1: ( ',' )
            {
            // InternalPdfMk.g:1607:1: ( ',' )
            // InternalPdfMk.g:1608:2: ','
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
    // InternalPdfMk.g:1617:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1621:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:1622:2: rule__DocDefinition__Group_5__1__Impl
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
    // InternalPdfMk.g:1628:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1632:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:1633:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:1633:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:1634:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:1635:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:1635:3: rule__DocDefinition__StylesAssignment_5_1
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
    // InternalPdfMk.g:1644:1: rule__TypeFaceDefinition__Group__0 : rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 ;
    public final void rule__TypeFaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1648:1: ( rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 )
            // InternalPdfMk.g:1649:2: rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1
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
    // InternalPdfMk.g:1656:1: rule__TypeFaceDefinition__Group__0__Impl : ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TypeFaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1660:1: ( ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1661:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1661:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1662:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1663:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1663:3: rule__TypeFaceDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1671:1: rule__TypeFaceDefinition__Group__1 : rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 ;
    public final void rule__TypeFaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1675:1: ( rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 )
            // InternalPdfMk.g:1676:2: rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2
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
    // InternalPdfMk.g:1683:1: rule__TypeFaceDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeFaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1687:1: ( ( ':' ) )
            // InternalPdfMk.g:1688:1: ( ':' )
            {
            // InternalPdfMk.g:1688:1: ( ':' )
            // InternalPdfMk.g:1689:2: ':'
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
    // InternalPdfMk.g:1698:1: rule__TypeFaceDefinition__Group__2 : rule__TypeFaceDefinition__Group__2__Impl ;
    public final void rule__TypeFaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1702:1: ( rule__TypeFaceDefinition__Group__2__Impl )
            // InternalPdfMk.g:1703:2: rule__TypeFaceDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1709:1: rule__TypeFaceDefinition__Group__2__Impl : ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TypeFaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1713:1: ( ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1714:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1714:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1715:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1716:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1716:3: rule__TypeFaceDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1725:1: rule__TextStyleDefinition__Group__0 : rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 ;
    public final void rule__TextStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1729:1: ( rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 )
            // InternalPdfMk.g:1730:2: rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1
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
    // InternalPdfMk.g:1737:1: rule__TextStyleDefinition__Group__0__Impl : ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1741:1: ( ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1742:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1742:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1743:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1744:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1744:3: rule__TextStyleDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1752:1: rule__TextStyleDefinition__Group__1 : rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 ;
    public final void rule__TextStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1756:1: ( rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 )
            // InternalPdfMk.g:1757:2: rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2
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
    // InternalPdfMk.g:1764:1: rule__TextStyleDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1768:1: ( ( ':' ) )
            // InternalPdfMk.g:1769:1: ( ':' )
            {
            // InternalPdfMk.g:1769:1: ( ':' )
            // InternalPdfMk.g:1770:2: ':'
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
    // InternalPdfMk.g:1779:1: rule__TextStyleDefinition__Group__2 : rule__TextStyleDefinition__Group__2__Impl ;
    public final void rule__TextStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1783:1: ( rule__TextStyleDefinition__Group__2__Impl )
            // InternalPdfMk.g:1784:2: rule__TextStyleDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1790:1: rule__TextStyleDefinition__Group__2__Impl : ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1794:1: ( ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1795:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1795:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1796:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1797:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1797:3: rule__TextStyleDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1806:1: rule__TextDefinition__Group__0 : rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1 ;
    public final void rule__TextDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1810:1: ( rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1 )
            // InternalPdfMk.g:1811:2: rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1
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
    // InternalPdfMk.g:1818:1: rule__TextDefinition__Group__0__Impl : ( ( rule__TextDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1822:1: ( ( ( rule__TextDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1823:1: ( ( rule__TextDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1823:1: ( ( rule__TextDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1824:2: ( rule__TextDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1825:2: ( rule__TextDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1825:3: rule__TextDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1833:1: rule__TextDefinition__Group__1 : rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2 ;
    public final void rule__TextDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1837:1: ( rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2 )
            // InternalPdfMk.g:1838:2: rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2
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
    // InternalPdfMk.g:1845:1: rule__TextDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1849:1: ( ( ':' ) )
            // InternalPdfMk.g:1850:1: ( ':' )
            {
            // InternalPdfMk.g:1850:1: ( ':' )
            // InternalPdfMk.g:1851:2: ':'
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
    // InternalPdfMk.g:1860:1: rule__TextDefinition__Group__2 : rule__TextDefinition__Group__2__Impl ;
    public final void rule__TextDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1864:1: ( rule__TextDefinition__Group__2__Impl )
            // InternalPdfMk.g:1865:2: rule__TextDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1871:1: rule__TextDefinition__Group__2__Impl : ( ( rule__TextDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1875:1: ( ( ( rule__TextDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1876:1: ( ( rule__TextDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1876:1: ( ( rule__TextDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1877:2: ( rule__TextDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1878:2: ( rule__TextDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1878:3: rule__TextDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1887:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1891:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:1892:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
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
    // InternalPdfMk.g:1899:1: rule__TextAlignmentDefinition__Group__0__Impl : ( 'alignment' ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1903:1: ( ( 'alignment' ) )
            // InternalPdfMk.g:1904:1: ( 'alignment' )
            {
            // InternalPdfMk.g:1904:1: ( 'alignment' )
            // InternalPdfMk.g:1905:2: 'alignment'
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
    // InternalPdfMk.g:1914:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1918:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:1919:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
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
    // InternalPdfMk.g:1926:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1930:1: ( ( ':' ) )
            // InternalPdfMk.g:1931:1: ( ':' )
            {
            // InternalPdfMk.g:1931:1: ( ':' )
            // InternalPdfMk.g:1932:2: ':'
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
    // InternalPdfMk.g:1941:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1945:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:1946:2: rule__TextAlignmentDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1952:1: rule__TextAlignmentDefinition__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1956:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1957:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1957:1: ( RULE_STRING )
            // InternalPdfMk.g:1958:2: RULE_STRING
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
    // InternalPdfMk.g:1968:1: rule__ItalicsDefinition__Group__0 : rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 ;
    public final void rule__ItalicsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1972:1: ( rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 )
            // InternalPdfMk.g:1973:2: rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1
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
    // InternalPdfMk.g:1980:1: rule__ItalicsDefinition__Group__0__Impl : ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ItalicsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1984:1: ( ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1985:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1985:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1986:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1987:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1987:3: rule__ItalicsDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1995:1: rule__ItalicsDefinition__Group__1 : rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 ;
    public final void rule__ItalicsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1999:1: ( rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 )
            // InternalPdfMk.g:2000:2: rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2
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
    // InternalPdfMk.g:2007:1: rule__ItalicsDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ItalicsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2011:1: ( ( ':' ) )
            // InternalPdfMk.g:2012:1: ( ':' )
            {
            // InternalPdfMk.g:2012:1: ( ':' )
            // InternalPdfMk.g:2013:2: ':'
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
    // InternalPdfMk.g:2022:1: rule__ItalicsDefinition__Group__2 : rule__ItalicsDefinition__Group__2__Impl ;
    public final void rule__ItalicsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2026:1: ( rule__ItalicsDefinition__Group__2__Impl )
            // InternalPdfMk.g:2027:2: rule__ItalicsDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2033:1: rule__ItalicsDefinition__Group__2__Impl : ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ItalicsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2037:1: ( ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2038:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2038:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2039:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2040:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2040:3: rule__ItalicsDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2049:1: rule__FontSizeDefinition__Group__0 : rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 ;
    public final void rule__FontSizeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2053:1: ( rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 )
            // InternalPdfMk.g:2054:2: rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1
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
    // InternalPdfMk.g:2061:1: rule__FontSizeDefinition__Group__0__Impl : ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__FontSizeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2065:1: ( ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2066:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2066:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2067:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2068:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2068:3: rule__FontSizeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2076:1: rule__FontSizeDefinition__Group__1 : rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 ;
    public final void rule__FontSizeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2080:1: ( rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 )
            // InternalPdfMk.g:2081:2: rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2
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
    // InternalPdfMk.g:2088:1: rule__FontSizeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FontSizeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2092:1: ( ( ':' ) )
            // InternalPdfMk.g:2093:1: ( ':' )
            {
            // InternalPdfMk.g:2093:1: ( ':' )
            // InternalPdfMk.g:2094:2: ':'
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
    // InternalPdfMk.g:2103:1: rule__FontSizeDefinition__Group__2 : rule__FontSizeDefinition__Group__2__Impl ;
    public final void rule__FontSizeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2107:1: ( rule__FontSizeDefinition__Group__2__Impl )
            // InternalPdfMk.g:2108:2: rule__FontSizeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2114:1: rule__FontSizeDefinition__Group__2__Impl : ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__FontSizeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2118:1: ( ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2119:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2119:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2120:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2121:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2121:3: rule__FontSizeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2130:1: rule__WidthDefinition__Group__0 : rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 ;
    public final void rule__WidthDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2134:1: ( rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 )
            // InternalPdfMk.g:2135:2: rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1
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
    // InternalPdfMk.g:2142:1: rule__WidthDefinition__Group__0__Impl : ( ( rule__WidthDefinition__KeyAssignment_0 ) ) ;
    public final void rule__WidthDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2146:1: ( ( ( rule__WidthDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2147:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2147:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2148:2: ( rule__WidthDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2149:2: ( rule__WidthDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2149:3: rule__WidthDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2157:1: rule__WidthDefinition__Group__1 : rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 ;
    public final void rule__WidthDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2161:1: ( rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 )
            // InternalPdfMk.g:2162:2: rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2
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
    // InternalPdfMk.g:2169:1: rule__WidthDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WidthDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2173:1: ( ( ':' ) )
            // InternalPdfMk.g:2174:1: ( ':' )
            {
            // InternalPdfMk.g:2174:1: ( ':' )
            // InternalPdfMk.g:2175:2: ':'
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
    // InternalPdfMk.g:2184:1: rule__WidthDefinition__Group__2 : rule__WidthDefinition__Group__2__Impl ;
    public final void rule__WidthDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2188:1: ( rule__WidthDefinition__Group__2__Impl )
            // InternalPdfMk.g:2189:2: rule__WidthDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2195:1: rule__WidthDefinition__Group__2__Impl : ( ( rule__WidthDefinition__ValueAssignment_2 ) ) ;
    public final void rule__WidthDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2199:1: ( ( ( rule__WidthDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2200:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2200:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2201:2: ( rule__WidthDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2202:2: ( rule__WidthDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2202:3: rule__WidthDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2211:1: rule__ColumnDefinition__Group__0 : rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 ;
    public final void rule__ColumnDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2215:1: ( rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 )
            // InternalPdfMk.g:2216:2: rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1
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
    // InternalPdfMk.g:2223:1: rule__ColumnDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__ColumnDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2227:1: ( ( '{' ) )
            // InternalPdfMk.g:2228:1: ( '{' )
            {
            // InternalPdfMk.g:2228:1: ( '{' )
            // InternalPdfMk.g:2229:2: '{'
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
    // InternalPdfMk.g:2238:1: rule__ColumnDefinition__Group__1 : rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 ;
    public final void rule__ColumnDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2242:1: ( rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 )
            // InternalPdfMk.g:2243:2: rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2
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
    // InternalPdfMk.g:2250:1: rule__ColumnDefinition__Group__1__Impl : ( ( rule__ColumnDefinition__Group_1__0 )? ) ;
    public final void rule__ColumnDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2254:1: ( ( ( rule__ColumnDefinition__Group_1__0 )? ) )
            // InternalPdfMk.g:2255:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            {
            // InternalPdfMk.g:2255:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            // InternalPdfMk.g:2256:2: ( rule__ColumnDefinition__Group_1__0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_1()); 
            // InternalPdfMk.g:2257:2: ( rule__ColumnDefinition__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:2257:3: rule__ColumnDefinition__Group_1__0
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
    // InternalPdfMk.g:2265:1: rule__ColumnDefinition__Group__2 : rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 ;
    public final void rule__ColumnDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2269:1: ( rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 )
            // InternalPdfMk.g:2270:2: rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3
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
    // InternalPdfMk.g:2277:1: rule__ColumnDefinition__Group__2__Impl : ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) ;
    public final void rule__ColumnDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2281:1: ( ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) )
            // InternalPdfMk.g:2282:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            {
            // InternalPdfMk.g:2282:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            // InternalPdfMk.g:2283:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyAssignment_2()); 
            // InternalPdfMk.g:2284:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            // InternalPdfMk.g:2284:3: rule__ColumnDefinition__KeyAssignment_2
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
    // InternalPdfMk.g:2292:1: rule__ColumnDefinition__Group__3 : rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 ;
    public final void rule__ColumnDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2296:1: ( rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 )
            // InternalPdfMk.g:2297:2: rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4
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
    // InternalPdfMk.g:2304:1: rule__ColumnDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2308:1: ( ( ':' ) )
            // InternalPdfMk.g:2309:1: ( ':' )
            {
            // InternalPdfMk.g:2309:1: ( ':' )
            // InternalPdfMk.g:2310:2: ':'
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
    // InternalPdfMk.g:2319:1: rule__ColumnDefinition__Group__4 : rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 ;
    public final void rule__ColumnDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2323:1: ( rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 )
            // InternalPdfMk.g:2324:2: rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5
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
    // InternalPdfMk.g:2331:1: rule__ColumnDefinition__Group__4__Impl : ( ( rule__ColumnDefinition__Group_4__0 ) ) ;
    public final void rule__ColumnDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2335:1: ( ( ( rule__ColumnDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:2336:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:2336:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            // InternalPdfMk.g:2337:2: ( rule__ColumnDefinition__Group_4__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2338:2: ( rule__ColumnDefinition__Group_4__0 )
            // InternalPdfMk.g:2338:3: rule__ColumnDefinition__Group_4__0
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
    // InternalPdfMk.g:2346:1: rule__ColumnDefinition__Group__5 : rule__ColumnDefinition__Group__5__Impl ;
    public final void rule__ColumnDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2350:1: ( rule__ColumnDefinition__Group__5__Impl )
            // InternalPdfMk.g:2351:2: rule__ColumnDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2357:1: rule__ColumnDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ColumnDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2361:1: ( ( '}' ) )
            // InternalPdfMk.g:2362:1: ( '}' )
            {
            // InternalPdfMk.g:2362:1: ( '}' )
            // InternalPdfMk.g:2363:2: '}'
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
    // InternalPdfMk.g:2373:1: rule__ColumnDefinition__Group_1__0 : rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 ;
    public final void rule__ColumnDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2377:1: ( rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 )
            // InternalPdfMk.g:2378:2: rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1
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
    // InternalPdfMk.g:2385:1: rule__ColumnDefinition__Group_1__0__Impl : ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) ;
    public final void rule__ColumnDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2389:1: ( ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:2390:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:2390:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            // InternalPdfMk.g:2391:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGlobalStyleAssignment_1_0()); 
            // InternalPdfMk.g:2392:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            // InternalPdfMk.g:2392:3: rule__ColumnDefinition__GlobalStyleAssignment_1_0
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
    // InternalPdfMk.g:2400:1: rule__ColumnDefinition__Group_1__1 : rule__ColumnDefinition__Group_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2404:1: ( rule__ColumnDefinition__Group_1__1__Impl )
            // InternalPdfMk.g:2405:2: rule__ColumnDefinition__Group_1__1__Impl
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
    // InternalPdfMk.g:2411:1: rule__ColumnDefinition__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2415:1: ( ( ',' ) )
            // InternalPdfMk.g:2416:1: ( ',' )
            {
            // InternalPdfMk.g:2416:1: ( ',' )
            // InternalPdfMk.g:2417:2: ','
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
    // InternalPdfMk.g:2427:1: rule__ColumnDefinition__Group_4__0 : rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 ;
    public final void rule__ColumnDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2431:1: ( rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 )
            // InternalPdfMk.g:2432:2: rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1
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
    // InternalPdfMk.g:2439:1: rule__ColumnDefinition__Group_4__0__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) ;
    public final void rule__ColumnDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2443:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) )
            // InternalPdfMk.g:2444:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            {
            // InternalPdfMk.g:2444:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            // InternalPdfMk.g:2445:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_0()); 
            // InternalPdfMk.g:2446:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:2446:3: rule__ColumnDefinition__ValueAssignment_4_0
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
    // InternalPdfMk.g:2454:1: rule__ColumnDefinition__Group_4__1 : rule__ColumnDefinition__Group_4__1__Impl ;
    public final void rule__ColumnDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2458:1: ( rule__ColumnDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2459:2: rule__ColumnDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2465:1: rule__ColumnDefinition__Group_4__1__Impl : ( ( rule__ColumnDefinition__Group_4_1__0 )* ) ;
    public final void rule__ColumnDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2469:1: ( ( ( rule__ColumnDefinition__Group_4_1__0 )* ) )
            // InternalPdfMk.g:2470:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:2470:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            // InternalPdfMk.g:2471:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4_1()); 
            // InternalPdfMk.g:2472:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPdfMk.g:2472:3: rule__ColumnDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalPdfMk.g:2481:1: rule__ColumnDefinition__Group_4_1__0 : rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 ;
    public final void rule__ColumnDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2485:1: ( rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 )
            // InternalPdfMk.g:2486:2: rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1
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
    // InternalPdfMk.g:2493:1: rule__ColumnDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2497:1: ( ( ',' ) )
            // InternalPdfMk.g:2498:1: ( ',' )
            {
            // InternalPdfMk.g:2498:1: ( ',' )
            // InternalPdfMk.g:2499:2: ','
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
    // InternalPdfMk.g:2508:1: rule__ColumnDefinition__Group_4_1__1 : rule__ColumnDefinition__Group_4_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2512:1: ( rule__ColumnDefinition__Group_4_1__1__Impl )
            // InternalPdfMk.g:2513:2: rule__ColumnDefinition__Group_4_1__1__Impl
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
    // InternalPdfMk.g:2519:1: rule__ColumnDefinition__Group_4_1__1__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) ;
    public final void rule__ColumnDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2523:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:2524:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:2524:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            // InternalPdfMk.g:2525:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_1_1()); 
            // InternalPdfMk.g:2526:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            // InternalPdfMk.g:2526:3: rule__ColumnDefinition__ValueAssignment_4_1_1
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
    // InternalPdfMk.g:2535:1: rule__MarginDefinition__Group__0 : rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 ;
    public final void rule__MarginDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2539:1: ( rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 )
            // InternalPdfMk.g:2540:2: rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1
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
    // InternalPdfMk.g:2547:1: rule__MarginDefinition__Group__0__Impl : ( ( rule__MarginDefinition__KeyAssignment_0 ) ) ;
    public final void rule__MarginDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2551:1: ( ( ( rule__MarginDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2552:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2552:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2553:2: ( rule__MarginDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2554:2: ( rule__MarginDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2554:3: rule__MarginDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2562:1: rule__MarginDefinition__Group__1 : rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 ;
    public final void rule__MarginDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2566:1: ( rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 )
            // InternalPdfMk.g:2567:2: rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2
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
    // InternalPdfMk.g:2574:1: rule__MarginDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MarginDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2578:1: ( ( ':' ) )
            // InternalPdfMk.g:2579:1: ( ':' )
            {
            // InternalPdfMk.g:2579:1: ( ':' )
            // InternalPdfMk.g:2580:2: ':'
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
    // InternalPdfMk.g:2589:1: rule__MarginDefinition__Group__2 : rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 ;
    public final void rule__MarginDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2593:1: ( rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 )
            // InternalPdfMk.g:2594:2: rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3
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
    // InternalPdfMk.g:2601:1: rule__MarginDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__MarginDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2605:1: ( ( '[' ) )
            // InternalPdfMk.g:2606:1: ( '[' )
            {
            // InternalPdfMk.g:2606:1: ( '[' )
            // InternalPdfMk.g:2607:2: '['
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
    // InternalPdfMk.g:2616:1: rule__MarginDefinition__Group__3 : rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 ;
    public final void rule__MarginDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2620:1: ( rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 )
            // InternalPdfMk.g:2621:2: rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4
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
    // InternalPdfMk.g:2628:1: rule__MarginDefinition__Group__3__Impl : ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) ;
    public final void rule__MarginDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2632:1: ( ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) )
            // InternalPdfMk.g:2633:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            {
            // InternalPdfMk.g:2633:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            // InternalPdfMk.g:2634:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:2635:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:2635:3: rule__MarginDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:2643:1: rule__MarginDefinition__Group__4 : rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 ;
    public final void rule__MarginDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2647:1: ( rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 )
            // InternalPdfMk.g:2648:2: rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5
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
    // InternalPdfMk.g:2655:1: rule__MarginDefinition__Group__4__Impl : ( ( rule__MarginDefinition__Group_4__0 )* ) ;
    public final void rule__MarginDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2659:1: ( ( ( rule__MarginDefinition__Group_4__0 )* ) )
            // InternalPdfMk.g:2660:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            {
            // InternalPdfMk.g:2660:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            // InternalPdfMk.g:2661:2: ( rule__MarginDefinition__Group_4__0 )*
            {
             before(grammarAccess.getMarginDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2662:2: ( rule__MarginDefinition__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPdfMk.g:2662:3: rule__MarginDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MarginDefinition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalPdfMk.g:2670:1: rule__MarginDefinition__Group__5 : rule__MarginDefinition__Group__5__Impl ;
    public final void rule__MarginDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2674:1: ( rule__MarginDefinition__Group__5__Impl )
            // InternalPdfMk.g:2675:2: rule__MarginDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2681:1: rule__MarginDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__MarginDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2685:1: ( ( ']' ) )
            // InternalPdfMk.g:2686:1: ( ']' )
            {
            // InternalPdfMk.g:2686:1: ( ']' )
            // InternalPdfMk.g:2687:2: ']'
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
    // InternalPdfMk.g:2697:1: rule__MarginDefinition__Group_4__0 : rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 ;
    public final void rule__MarginDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2701:1: ( rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 )
            // InternalPdfMk.g:2702:2: rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1
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
    // InternalPdfMk.g:2709:1: rule__MarginDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MarginDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2713:1: ( ( ',' ) )
            // InternalPdfMk.g:2714:1: ( ',' )
            {
            // InternalPdfMk.g:2714:1: ( ',' )
            // InternalPdfMk.g:2715:2: ','
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
    // InternalPdfMk.g:2724:1: rule__MarginDefinition__Group_4__1 : rule__MarginDefinition__Group_4__1__Impl ;
    public final void rule__MarginDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2728:1: ( rule__MarginDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2729:2: rule__MarginDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2735:1: rule__MarginDefinition__Group_4__1__Impl : ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__MarginDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2739:1: ( ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:2740:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:2740:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:2741:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:2742:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:2742:3: rule__MarginDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:2751:1: rule__ImageDefintion__Group__0 : rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 ;
    public final void rule__ImageDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2755:1: ( rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 )
            // InternalPdfMk.g:2756:2: rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1
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
    // InternalPdfMk.g:2763:1: rule__ImageDefintion__Group__0__Impl : ( ( rule__ImageDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2767:1: ( ( ( rule__ImageDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2768:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2768:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2769:2: ( rule__ImageDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2770:2: ( rule__ImageDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2770:3: rule__ImageDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2778:1: rule__ImageDefintion__Group__1 : rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 ;
    public final void rule__ImageDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2782:1: ( rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 )
            // InternalPdfMk.g:2783:2: rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2
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
    // InternalPdfMk.g:2790:1: rule__ImageDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2794:1: ( ( ':' ) )
            // InternalPdfMk.g:2795:1: ( ':' )
            {
            // InternalPdfMk.g:2795:1: ( ':' )
            // InternalPdfMk.g:2796:2: ':'
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
    // InternalPdfMk.g:2805:1: rule__ImageDefintion__Group__2 : rule__ImageDefintion__Group__2__Impl ;
    public final void rule__ImageDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2809:1: ( rule__ImageDefintion__Group__2__Impl )
            // InternalPdfMk.g:2810:2: rule__ImageDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2816:1: rule__ImageDefintion__Group__2__Impl : ( ( rule__ImageDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2820:1: ( ( ( rule__ImageDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2821:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2821:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2822:2: ( rule__ImageDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2823:2: ( rule__ImageDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2823:3: rule__ImageDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2832:1: rule__ImageWidthDefintion__Group__0 : rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 ;
    public final void rule__ImageWidthDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2836:1: ( rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 )
            // InternalPdfMk.g:2837:2: rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1
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
    // InternalPdfMk.g:2844:1: rule__ImageWidthDefintion__Group__0__Impl : ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageWidthDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2848:1: ( ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2849:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2849:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2850:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2851:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2851:3: rule__ImageWidthDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2859:1: rule__ImageWidthDefintion__Group__1 : rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 ;
    public final void rule__ImageWidthDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2863:1: ( rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 )
            // InternalPdfMk.g:2864:2: rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2
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
    // InternalPdfMk.g:2871:1: rule__ImageWidthDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageWidthDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2875:1: ( ( ':' ) )
            // InternalPdfMk.g:2876:1: ( ':' )
            {
            // InternalPdfMk.g:2876:1: ( ':' )
            // InternalPdfMk.g:2877:2: ':'
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
    // InternalPdfMk.g:2886:1: rule__ImageWidthDefintion__Group__2 : rule__ImageWidthDefintion__Group__2__Impl ;
    public final void rule__ImageWidthDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2890:1: ( rule__ImageWidthDefintion__Group__2__Impl )
            // InternalPdfMk.g:2891:2: rule__ImageWidthDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2897:1: rule__ImageWidthDefintion__Group__2__Impl : ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageWidthDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2901:1: ( ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2902:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2902:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2903:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2904:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2904:3: rule__ImageWidthDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2913:1: rule__ImageHeightDefintion__Group__0 : rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 ;
    public final void rule__ImageHeightDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2917:1: ( rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 )
            // InternalPdfMk.g:2918:2: rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1
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
    // InternalPdfMk.g:2925:1: rule__ImageHeightDefintion__Group__0__Impl : ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageHeightDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2929:1: ( ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2930:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2930:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2931:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2932:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2932:3: rule__ImageHeightDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2940:1: rule__ImageHeightDefintion__Group__1 : rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 ;
    public final void rule__ImageHeightDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2944:1: ( rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 )
            // InternalPdfMk.g:2945:2: rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2
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
    // InternalPdfMk.g:2952:1: rule__ImageHeightDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageHeightDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2956:1: ( ( ':' ) )
            // InternalPdfMk.g:2957:1: ( ':' )
            {
            // InternalPdfMk.g:2957:1: ( ':' )
            // InternalPdfMk.g:2958:2: ':'
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
    // InternalPdfMk.g:2967:1: rule__ImageHeightDefintion__Group__2 : rule__ImageHeightDefintion__Group__2__Impl ;
    public final void rule__ImageHeightDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2971:1: ( rule__ImageHeightDefintion__Group__2__Impl )
            // InternalPdfMk.g:2972:2: rule__ImageHeightDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2978:1: rule__ImageHeightDefintion__Group__2__Impl : ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageHeightDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2982:1: ( ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2983:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2983:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2984:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2985:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2985:3: rule__ImageHeightDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2994:1: rule__ImagePageBreakDefinition__Group__0 : rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 ;
    public final void rule__ImagePageBreakDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2998:1: ( rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 )
            // InternalPdfMk.g:2999:2: rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1
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
    // InternalPdfMk.g:3006:1: rule__ImagePageBreakDefinition__Group__0__Impl : ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3010:1: ( ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3011:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3011:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3012:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3013:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3013:3: rule__ImagePageBreakDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3021:1: rule__ImagePageBreakDefinition__Group__1 : rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 ;
    public final void rule__ImagePageBreakDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3025:1: ( rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 )
            // InternalPdfMk.g:3026:2: rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2
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
    // InternalPdfMk.g:3033:1: rule__ImagePageBreakDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImagePageBreakDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3037:1: ( ( ':' ) )
            // InternalPdfMk.g:3038:1: ( ':' )
            {
            // InternalPdfMk.g:3038:1: ( ':' )
            // InternalPdfMk.g:3039:2: ':'
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
    // InternalPdfMk.g:3048:1: rule__ImagePageBreakDefinition__Group__2 : rule__ImagePageBreakDefinition__Group__2__Impl ;
    public final void rule__ImagePageBreakDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3052:1: ( rule__ImagePageBreakDefinition__Group__2__Impl )
            // InternalPdfMk.g:3053:2: rule__ImagePageBreakDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3059:1: rule__ImagePageBreakDefinition__Group__2__Impl : ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3063:1: ( ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3064:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3064:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3065:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3066:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3066:3: rule__ImagePageBreakDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3075:1: rule__ImageFitDefinition__Group__0 : rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 ;
    public final void rule__ImageFitDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3079:1: ( rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 )
            // InternalPdfMk.g:3080:2: rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1
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
    // InternalPdfMk.g:3087:1: rule__ImageFitDefinition__Group__0__Impl : ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageFitDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3091:1: ( ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3092:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3092:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3093:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3094:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3094:3: rule__ImageFitDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3102:1: rule__ImageFitDefinition__Group__1 : rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 ;
    public final void rule__ImageFitDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3106:1: ( rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 )
            // InternalPdfMk.g:3107:2: rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2
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
    // InternalPdfMk.g:3114:1: rule__ImageFitDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageFitDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3118:1: ( ( ':' ) )
            // InternalPdfMk.g:3119:1: ( ':' )
            {
            // InternalPdfMk.g:3119:1: ( ':' )
            // InternalPdfMk.g:3120:2: ':'
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
    // InternalPdfMk.g:3129:1: rule__ImageFitDefinition__Group__2 : rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 ;
    public final void rule__ImageFitDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3133:1: ( rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 )
            // InternalPdfMk.g:3134:2: rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3
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
    // InternalPdfMk.g:3141:1: rule__ImageFitDefinition__Group__2__Impl : ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageFitDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3145:1: ( ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3146:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3146:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3147:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3148:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3148:3: rule__ImageFitDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3156:1: rule__ImageFitDefinition__Group__3 : rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 ;
    public final void rule__ImageFitDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3160:1: ( rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 )
            // InternalPdfMk.g:3161:2: rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4
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
    // InternalPdfMk.g:3168:1: rule__ImageFitDefinition__Group__3__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) ;
    public final void rule__ImageFitDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3172:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) )
            // InternalPdfMk.g:3173:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            {
            // InternalPdfMk.g:3173:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            // InternalPdfMk.g:3174:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:3175:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            // InternalPdfMk.g:3175:3: rule__ImageFitDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:3183:1: rule__ImageFitDefinition__Group__4 : rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 ;
    public final void rule__ImageFitDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3187:1: ( rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 )
            // InternalPdfMk.g:3188:2: rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5
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
    // InternalPdfMk.g:3195:1: rule__ImageFitDefinition__Group__4__Impl : ( ( rule__ImageFitDefinition__Group_4__0 ) ) ;
    public final void rule__ImageFitDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3199:1: ( ( ( rule__ImageFitDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:3200:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:3200:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            // InternalPdfMk.g:3201:2: ( rule__ImageFitDefinition__Group_4__0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:3202:2: ( rule__ImageFitDefinition__Group_4__0 )
            // InternalPdfMk.g:3202:3: rule__ImageFitDefinition__Group_4__0
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
    // InternalPdfMk.g:3210:1: rule__ImageFitDefinition__Group__5 : rule__ImageFitDefinition__Group__5__Impl ;
    public final void rule__ImageFitDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3214:1: ( rule__ImageFitDefinition__Group__5__Impl )
            // InternalPdfMk.g:3215:2: rule__ImageFitDefinition__Group__5__Impl
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
    // InternalPdfMk.g:3221:1: rule__ImageFitDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ImageFitDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3225:1: ( ( ']' ) )
            // InternalPdfMk.g:3226:1: ( ']' )
            {
            // InternalPdfMk.g:3226:1: ( ']' )
            // InternalPdfMk.g:3227:2: ']'
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
    // InternalPdfMk.g:3237:1: rule__ImageFitDefinition__Group_4__0 : rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 ;
    public final void rule__ImageFitDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3241:1: ( rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 )
            // InternalPdfMk.g:3242:2: rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1
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
    // InternalPdfMk.g:3249:1: rule__ImageFitDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageFitDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3253:1: ( ( ',' ) )
            // InternalPdfMk.g:3254:1: ( ',' )
            {
            // InternalPdfMk.g:3254:1: ( ',' )
            // InternalPdfMk.g:3255:2: ','
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
    // InternalPdfMk.g:3264:1: rule__ImageFitDefinition__Group_4__1 : rule__ImageFitDefinition__Group_4__1__Impl ;
    public final void rule__ImageFitDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3268:1: ( rule__ImageFitDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:3269:2: rule__ImageFitDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:3275:1: rule__ImageFitDefinition__Group_4__1__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__ImageFitDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3279:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:3280:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:3280:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:3281:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:3282:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:3282:3: rule__ImageFitDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:3291:1: rule__ImageOpacityDefinition__Group__0 : rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 ;
    public final void rule__ImageOpacityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3295:1: ( rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 )
            // InternalPdfMk.g:3296:2: rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1
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
    // InternalPdfMk.g:3303:1: rule__ImageOpacityDefinition__Group__0__Impl : ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3307:1: ( ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3308:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3308:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3309:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3310:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3310:3: rule__ImageOpacityDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3318:1: rule__ImageOpacityDefinition__Group__1 : rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 ;
    public final void rule__ImageOpacityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3322:1: ( rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 )
            // InternalPdfMk.g:3323:2: rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2
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
    // InternalPdfMk.g:3330:1: rule__ImageOpacityDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageOpacityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3334:1: ( ( ':' ) )
            // InternalPdfMk.g:3335:1: ( ':' )
            {
            // InternalPdfMk.g:3335:1: ( ':' )
            // InternalPdfMk.g:3336:2: ':'
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
    // InternalPdfMk.g:3345:1: rule__ImageOpacityDefinition__Group__2 : rule__ImageOpacityDefinition__Group__2__Impl ;
    public final void rule__ImageOpacityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3349:1: ( rule__ImageOpacityDefinition__Group__2__Impl )
            // InternalPdfMk.g:3350:2: rule__ImageOpacityDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3356:1: rule__ImageOpacityDefinition__Group__2__Impl : ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3360:1: ( ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3361:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3361:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3362:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3363:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3363:3: rule__ImageOpacityDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3372:1: rule__ListReversedDefinition__Group__0 : rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 ;
    public final void rule__ListReversedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3376:1: ( rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 )
            // InternalPdfMk.g:3377:2: rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1
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
    // InternalPdfMk.g:3384:1: rule__ListReversedDefinition__Group__0__Impl : ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListReversedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3388:1: ( ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3389:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3389:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3390:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3391:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3391:3: rule__ListReversedDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3399:1: rule__ListReversedDefinition__Group__1 : rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 ;
    public final void rule__ListReversedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3403:1: ( rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 )
            // InternalPdfMk.g:3404:2: rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2
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
    // InternalPdfMk.g:3411:1: rule__ListReversedDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListReversedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3415:1: ( ( ':' ) )
            // InternalPdfMk.g:3416:1: ( ':' )
            {
            // InternalPdfMk.g:3416:1: ( ':' )
            // InternalPdfMk.g:3417:2: ':'
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
    // InternalPdfMk.g:3426:1: rule__ListReversedDefinition__Group__2 : rule__ListReversedDefinition__Group__2__Impl ;
    public final void rule__ListReversedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3430:1: ( rule__ListReversedDefinition__Group__2__Impl )
            // InternalPdfMk.g:3431:2: rule__ListReversedDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3437:1: rule__ListReversedDefinition__Group__2__Impl : ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListReversedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3441:1: ( ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3442:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3442:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3443:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3444:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3444:3: rule__ListReversedDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3453:1: rule__ListCounterDefinition__Group__0 : rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 ;
    public final void rule__ListCounterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3457:1: ( rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 )
            // InternalPdfMk.g:3458:2: rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1
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
    // InternalPdfMk.g:3465:1: rule__ListCounterDefinition__Group__0__Impl : ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListCounterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3469:1: ( ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3470:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3470:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3471:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3472:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3472:3: rule__ListCounterDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3480:1: rule__ListCounterDefinition__Group__1 : rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 ;
    public final void rule__ListCounterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3484:1: ( rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 )
            // InternalPdfMk.g:3485:2: rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2
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
    // InternalPdfMk.g:3492:1: rule__ListCounterDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListCounterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3496:1: ( ( ':' ) )
            // InternalPdfMk.g:3497:1: ( ':' )
            {
            // InternalPdfMk.g:3497:1: ( ':' )
            // InternalPdfMk.g:3498:2: ':'
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
    // InternalPdfMk.g:3507:1: rule__ListCounterDefinition__Group__2 : rule__ListCounterDefinition__Group__2__Impl ;
    public final void rule__ListCounterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3511:1: ( rule__ListCounterDefinition__Group__2__Impl )
            // InternalPdfMk.g:3512:2: rule__ListCounterDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3518:1: rule__ListCounterDefinition__Group__2__Impl : ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListCounterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3522:1: ( ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3523:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3523:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3524:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3525:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3525:3: rule__ListCounterDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3534:1: rule__ListTypeDefinition__Group__0 : rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 ;
    public final void rule__ListTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3538:1: ( rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 )
            // InternalPdfMk.g:3539:2: rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1
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
    // InternalPdfMk.g:3546:1: rule__ListTypeDefinition__Group__0__Impl : ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3550:1: ( ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3551:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3551:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3552:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3553:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3553:3: rule__ListTypeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3561:1: rule__ListTypeDefinition__Group__1 : rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 ;
    public final void rule__ListTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3565:1: ( rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 )
            // InternalPdfMk.g:3566:2: rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2
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
    // InternalPdfMk.g:3573:1: rule__ListTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3577:1: ( ( ':' ) )
            // InternalPdfMk.g:3578:1: ( ':' )
            {
            // InternalPdfMk.g:3578:1: ( ':' )
            // InternalPdfMk.g:3579:2: ':'
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
    // InternalPdfMk.g:3588:1: rule__ListTypeDefinition__Group__2 : rule__ListTypeDefinition__Group__2__Impl ;
    public final void rule__ListTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3592:1: ( rule__ListTypeDefinition__Group__2__Impl )
            // InternalPdfMk.g:3593:2: rule__ListTypeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3599:1: rule__ListTypeDefinition__Group__2__Impl : ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3603:1: ( ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3604:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3604:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3605:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3606:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3606:3: rule__ListTypeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3615:1: rule__ListColorDefinition__Group__0 : rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 ;
    public final void rule__ListColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3619:1: ( rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 )
            // InternalPdfMk.g:3620:2: rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1
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
    // InternalPdfMk.g:3627:1: rule__ListColorDefinition__Group__0__Impl : ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3631:1: ( ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3632:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3632:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3633:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3634:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3634:3: rule__ListColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3642:1: rule__ListColorDefinition__Group__1 : rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 ;
    public final void rule__ListColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3646:1: ( rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 )
            // InternalPdfMk.g:3647:2: rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2
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
    // InternalPdfMk.g:3654:1: rule__ListColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3658:1: ( ( ':' ) )
            // InternalPdfMk.g:3659:1: ( ':' )
            {
            // InternalPdfMk.g:3659:1: ( ':' )
            // InternalPdfMk.g:3660:2: ':'
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
    // InternalPdfMk.g:3669:1: rule__ListColorDefinition__Group__2 : rule__ListColorDefinition__Group__2__Impl ;
    public final void rule__ListColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3673:1: ( rule__ListColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3674:2: rule__ListColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3680:1: rule__ListColorDefinition__Group__2__Impl : ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3684:1: ( ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3685:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3685:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3686:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3687:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3687:3: rule__ListColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3696:1: rule__ListMarkerColorDefinition__Group__0 : rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 ;
    public final void rule__ListMarkerColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3700:1: ( rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 )
            // InternalPdfMk.g:3701:2: rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1
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
    // InternalPdfMk.g:3708:1: rule__ListMarkerColorDefinition__Group__0__Impl : ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3712:1: ( ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3713:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3713:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3714:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3715:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3715:3: rule__ListMarkerColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3723:1: rule__ListMarkerColorDefinition__Group__1 : rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 ;
    public final void rule__ListMarkerColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3727:1: ( rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 )
            // InternalPdfMk.g:3728:2: rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2
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
    // InternalPdfMk.g:3735:1: rule__ListMarkerColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListMarkerColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3739:1: ( ( ':' ) )
            // InternalPdfMk.g:3740:1: ( ':' )
            {
            // InternalPdfMk.g:3740:1: ( ':' )
            // InternalPdfMk.g:3741:2: ':'
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
    // InternalPdfMk.g:3750:1: rule__ListMarkerColorDefinition__Group__2 : rule__ListMarkerColorDefinition__Group__2__Impl ;
    public final void rule__ListMarkerColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3754:1: ( rule__ListMarkerColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3755:2: rule__ListMarkerColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3761:1: rule__ListMarkerColorDefinition__Group__2__Impl : ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3765:1: ( ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3766:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3766:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3767:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3768:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3768:3: rule__ListMarkerColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3777:1: rule__TableRowDefinition__Group__0 : rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 ;
    public final void rule__TableRowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3781:1: ( rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 )
            // InternalPdfMk.g:3782:2: rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1
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
    // InternalPdfMk.g:3789:1: rule__TableRowDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3793:1: ( ( '[' ) )
            // InternalPdfMk.g:3794:1: ( '[' )
            {
            // InternalPdfMk.g:3794:1: ( '[' )
            // InternalPdfMk.g:3795:2: '['
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
    // InternalPdfMk.g:3804:1: rule__TableRowDefinition__Group__1 : rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 ;
    public final void rule__TableRowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3808:1: ( rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 )
            // InternalPdfMk.g:3809:2: rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2
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
    // InternalPdfMk.g:3816:1: rule__TableRowDefinition__Group__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) ;
    public final void rule__TableRowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3820:1: ( ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) )
            // InternalPdfMk.g:3821:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            {
            // InternalPdfMk.g:3821:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            // InternalPdfMk.g:3822:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_1()); 
            // InternalPdfMk.g:3823:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            // InternalPdfMk.g:3823:3: rule__TableRowDefinition__ItemAssignment_1
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
    // InternalPdfMk.g:3831:1: rule__TableRowDefinition__Group__2 : rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 ;
    public final void rule__TableRowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3835:1: ( rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 )
            // InternalPdfMk.g:3836:2: rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3
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
    // InternalPdfMk.g:3843:1: rule__TableRowDefinition__Group__2__Impl : ( ( rule__TableRowDefinition__Group_2__0 ) ) ;
    public final void rule__TableRowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3847:1: ( ( ( rule__TableRowDefinition__Group_2__0 ) ) )
            // InternalPdfMk.g:3848:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            {
            // InternalPdfMk.g:3848:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            // InternalPdfMk.g:3849:2: ( rule__TableRowDefinition__Group_2__0 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getGroup_2()); 
            // InternalPdfMk.g:3850:2: ( rule__TableRowDefinition__Group_2__0 )
            // InternalPdfMk.g:3850:3: rule__TableRowDefinition__Group_2__0
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
    // InternalPdfMk.g:3858:1: rule__TableRowDefinition__Group__3 : rule__TableRowDefinition__Group__3__Impl ;
    public final void rule__TableRowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3862:1: ( rule__TableRowDefinition__Group__3__Impl )
            // InternalPdfMk.g:3863:2: rule__TableRowDefinition__Group__3__Impl
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
    // InternalPdfMk.g:3869:1: rule__TableRowDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3873:1: ( ( ']' ) )
            // InternalPdfMk.g:3874:1: ( ']' )
            {
            // InternalPdfMk.g:3874:1: ( ']' )
            // InternalPdfMk.g:3875:2: ']'
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
    // InternalPdfMk.g:3885:1: rule__TableRowDefinition__Group_2__0 : rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 ;
    public final void rule__TableRowDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3889:1: ( rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 )
            // InternalPdfMk.g:3890:2: rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1
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
    // InternalPdfMk.g:3897:1: rule__TableRowDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRowDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3901:1: ( ( ',' ) )
            // InternalPdfMk.g:3902:1: ( ',' )
            {
            // InternalPdfMk.g:3902:1: ( ',' )
            // InternalPdfMk.g:3903:2: ','
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
    // InternalPdfMk.g:3912:1: rule__TableRowDefinition__Group_2__1 : rule__TableRowDefinition__Group_2__1__Impl ;
    public final void rule__TableRowDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3916:1: ( rule__TableRowDefinition__Group_2__1__Impl )
            // InternalPdfMk.g:3917:2: rule__TableRowDefinition__Group_2__1__Impl
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
    // InternalPdfMk.g:3923:1: rule__TableRowDefinition__Group_2__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) ;
    public final void rule__TableRowDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3927:1: ( ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) )
            // InternalPdfMk.g:3928:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            {
            // InternalPdfMk.g:3928:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            // InternalPdfMk.g:3929:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_2_1()); 
            // InternalPdfMk.g:3930:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            // InternalPdfMk.g:3930:3: rule__TableRowDefinition__ItemAssignment_2_1
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
    // InternalPdfMk.g:3939:1: rule__TableBodyDefinition__Group__0 : rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 ;
    public final void rule__TableBodyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3943:1: ( rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 )
            // InternalPdfMk.g:3944:2: rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1
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
    // InternalPdfMk.g:3951:1: rule__TableBodyDefinition__Group__0__Impl : ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableBodyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3955:1: ( ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3956:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3956:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3957:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3958:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3958:3: rule__TableBodyDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3966:1: rule__TableBodyDefinition__Group__1 : rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 ;
    public final void rule__TableBodyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3970:1: ( rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 )
            // InternalPdfMk.g:3971:2: rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2
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
    // InternalPdfMk.g:3978:1: rule__TableBodyDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableBodyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3982:1: ( ( ':' ) )
            // InternalPdfMk.g:3983:1: ( ':' )
            {
            // InternalPdfMk.g:3983:1: ( ':' )
            // InternalPdfMk.g:3984:2: ':'
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
    // InternalPdfMk.g:3993:1: rule__TableBodyDefinition__Group__2 : rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 ;
    public final void rule__TableBodyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3997:1: ( rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 )
            // InternalPdfMk.g:3998:2: rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3
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
    // InternalPdfMk.g:4005:1: rule__TableBodyDefinition__Group__2__Impl : ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableBodyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4009:1: ( ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4010:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4010:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:4011:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4012:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:4012:3: rule__TableBodyDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:4020:1: rule__TableBodyDefinition__Group__3 : rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 ;
    public final void rule__TableBodyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4024:1: ( rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 )
            // InternalPdfMk.g:4025:2: rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4
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
    // InternalPdfMk.g:4032:1: rule__TableBodyDefinition__Group__3__Impl : ( ( rule__TableBodyDefinition__Group_3__0 ) ) ;
    public final void rule__TableBodyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4036:1: ( ( ( rule__TableBodyDefinition__Group_3__0 ) ) )
            // InternalPdfMk.g:4037:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            {
            // InternalPdfMk.g:4037:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            // InternalPdfMk.g:4038:2: ( rule__TableBodyDefinition__Group_3__0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3()); 
            // InternalPdfMk.g:4039:2: ( rule__TableBodyDefinition__Group_3__0 )
            // InternalPdfMk.g:4039:3: rule__TableBodyDefinition__Group_3__0
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
    // InternalPdfMk.g:4047:1: rule__TableBodyDefinition__Group__4 : rule__TableBodyDefinition__Group__4__Impl ;
    public final void rule__TableBodyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4051:1: ( rule__TableBodyDefinition__Group__4__Impl )
            // InternalPdfMk.g:4052:2: rule__TableBodyDefinition__Group__4__Impl
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
    // InternalPdfMk.g:4058:1: rule__TableBodyDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__TableBodyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4062:1: ( ( ']' ) )
            // InternalPdfMk.g:4063:1: ( ']' )
            {
            // InternalPdfMk.g:4063:1: ( ']' )
            // InternalPdfMk.g:4064:2: ']'
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
    // InternalPdfMk.g:4074:1: rule__TableBodyDefinition__Group_3__0 : rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 ;
    public final void rule__TableBodyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4078:1: ( rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 )
            // InternalPdfMk.g:4079:2: rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1
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
    // InternalPdfMk.g:4086:1: rule__TableBodyDefinition__Group_3__0__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) ;
    public final void rule__TableBodyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4090:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) )
            // InternalPdfMk.g:4091:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            {
            // InternalPdfMk.g:4091:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            // InternalPdfMk.g:4092:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_0()); 
            // InternalPdfMk.g:4093:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            // InternalPdfMk.g:4093:3: rule__TableBodyDefinition__RowsAssignment_3_0
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
    // InternalPdfMk.g:4101:1: rule__TableBodyDefinition__Group_3__1 : rule__TableBodyDefinition__Group_3__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4105:1: ( rule__TableBodyDefinition__Group_3__1__Impl )
            // InternalPdfMk.g:4106:2: rule__TableBodyDefinition__Group_3__1__Impl
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
    // InternalPdfMk.g:4112:1: rule__TableBodyDefinition__Group_3__1__Impl : ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) ;
    public final void rule__TableBodyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4116:1: ( ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) )
            // InternalPdfMk.g:4117:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:4117:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            // InternalPdfMk.g:4118:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3_1()); 
            // InternalPdfMk.g:4119:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPdfMk.g:4119:3: rule__TableBodyDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TableBodyDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalPdfMk.g:4128:1: rule__TableBodyDefinition__Group_3_1__0 : rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 ;
    public final void rule__TableBodyDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4132:1: ( rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 )
            // InternalPdfMk.g:4133:2: rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1
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
    // InternalPdfMk.g:4140:1: rule__TableBodyDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__TableBodyDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4144:1: ( ( ',' ) )
            // InternalPdfMk.g:4145:1: ( ',' )
            {
            // InternalPdfMk.g:4145:1: ( ',' )
            // InternalPdfMk.g:4146:2: ','
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
    // InternalPdfMk.g:4155:1: rule__TableBodyDefinition__Group_3_1__1 : rule__TableBodyDefinition__Group_3_1__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4159:1: ( rule__TableBodyDefinition__Group_3_1__1__Impl )
            // InternalPdfMk.g:4160:2: rule__TableBodyDefinition__Group_3_1__1__Impl
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
    // InternalPdfMk.g:4166:1: rule__TableBodyDefinition__Group_3_1__1__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) ;
    public final void rule__TableBodyDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4170:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:4171:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:4171:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            // InternalPdfMk.g:4172:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_1_1()); 
            // InternalPdfMk.g:4173:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            // InternalPdfMk.g:4173:3: rule__TableBodyDefinition__RowsAssignment_3_1_1
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
    // InternalPdfMk.g:4182:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4186:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // InternalPdfMk.g:4187:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
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
    // InternalPdfMk.g:4194:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4198:1: ( ( ( rule__TableDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4199:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4199:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:4200:2: ( rule__TableDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4201:2: ( rule__TableDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:4201:3: rule__TableDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:4209:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4213:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // InternalPdfMk.g:4214:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
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
    // InternalPdfMk.g:4221:1: rule__TableDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4225:1: ( ( ':' ) )
            // InternalPdfMk.g:4226:1: ( ':' )
            {
            // InternalPdfMk.g:4226:1: ( ':' )
            // InternalPdfMk.g:4227:2: ':'
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
    // InternalPdfMk.g:4236:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4240:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // InternalPdfMk.g:4241:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
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
    // InternalPdfMk.g:4248:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4252:1: ( ( ( rule__TableDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4253:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4253:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:4254:2: ( rule__TableDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4255:2: ( rule__TableDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:4255:3: rule__TableDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:4263:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4267:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // InternalPdfMk.g:4268:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
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
    // InternalPdfMk.g:4275:1: rule__TableDefinition__Group__3__Impl : ( ( rule__TableDefinition__BodyAssignment_3 ) ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4279:1: ( ( ( rule__TableDefinition__BodyAssignment_3 ) ) )
            // InternalPdfMk.g:4280:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            {
            // InternalPdfMk.g:4280:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            // InternalPdfMk.g:4281:2: ( rule__TableDefinition__BodyAssignment_3 )
            {
             before(grammarAccess.getTableDefinitionAccess().getBodyAssignment_3()); 
            // InternalPdfMk.g:4282:2: ( rule__TableDefinition__BodyAssignment_3 )
            // InternalPdfMk.g:4282:3: rule__TableDefinition__BodyAssignment_3
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
    // InternalPdfMk.g:4290:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4294:1: ( rule__TableDefinition__Group__4__Impl )
            // InternalPdfMk.g:4295:2: rule__TableDefinition__Group__4__Impl
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
    // InternalPdfMk.g:4301:1: rule__TableDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4305:1: ( ( '}' ) )
            // InternalPdfMk.g:4306:1: ( '}' )
            {
            // InternalPdfMk.g:4306:1: ( '}' )
            // InternalPdfMk.g:4307:2: '}'
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
    // InternalPdfMk.g:4317:1: rule__TextObject__Group__0 : rule__TextObject__Group__0__Impl rule__TextObject__Group__1 ;
    public final void rule__TextObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4321:1: ( rule__TextObject__Group__0__Impl rule__TextObject__Group__1 )
            // InternalPdfMk.g:4322:2: rule__TextObject__Group__0__Impl rule__TextObject__Group__1
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
    // InternalPdfMk.g:4329:1: rule__TextObject__Group__0__Impl : ( '{' ) ;
    public final void rule__TextObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4333:1: ( ( '{' ) )
            // InternalPdfMk.g:4334:1: ( '{' )
            {
            // InternalPdfMk.g:4334:1: ( '{' )
            // InternalPdfMk.g:4335:2: '{'
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
    // InternalPdfMk.g:4344:1: rule__TextObject__Group__1 : rule__TextObject__Group__1__Impl rule__TextObject__Group__2 ;
    public final void rule__TextObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4348:1: ( rule__TextObject__Group__1__Impl rule__TextObject__Group__2 )
            // InternalPdfMk.g:4349:2: rule__TextObject__Group__1__Impl rule__TextObject__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:4356:1: rule__TextObject__Group__1__Impl : ( ( rule__TextObject__Group_1__0 ) ) ;
    public final void rule__TextObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4360:1: ( ( ( rule__TextObject__Group_1__0 ) ) )
            // InternalPdfMk.g:4361:1: ( ( rule__TextObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:4361:1: ( ( rule__TextObject__Group_1__0 ) )
            // InternalPdfMk.g:4362:2: ( rule__TextObject__Group_1__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:4363:2: ( rule__TextObject__Group_1__0 )
            // InternalPdfMk.g:4363:3: rule__TextObject__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalPdfMk.g:4371:1: rule__TextObject__Group__2 : rule__TextObject__Group__2__Impl ;
    public final void rule__TextObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4375:1: ( rule__TextObject__Group__2__Impl )
            // InternalPdfMk.g:4376:2: rule__TextObject__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:4382:1: rule__TextObject__Group__2__Impl : ( '}' ) ;
    public final void rule__TextObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4386:1: ( ( '}' ) )
            // InternalPdfMk.g:4387:1: ( '}' )
            {
            // InternalPdfMk.g:4387:1: ( '}' )
            // InternalPdfMk.g:4388:2: '}'
            {
             before(grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextObject__Group_1__0"
    // InternalPdfMk.g:4398:1: rule__TextObject__Group_1__0 : rule__TextObject__Group_1__0__Impl rule__TextObject__Group_1__1 ;
    public final void rule__TextObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4402:1: ( rule__TextObject__Group_1__0__Impl rule__TextObject__Group_1__1 )
            // InternalPdfMk.g:4403:2: rule__TextObject__Group_1__0__Impl rule__TextObject__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__TextObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1__0"


    // $ANTLR start "rule__TextObject__Group_1__0__Impl"
    // InternalPdfMk.g:4410:1: rule__TextObject__Group_1__0__Impl : ( ( rule__TextObject__MembersAssignment_1_0 ) ) ;
    public final void rule__TextObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4414:1: ( ( ( rule__TextObject__MembersAssignment_1_0 ) ) )
            // InternalPdfMk.g:4415:1: ( ( rule__TextObject__MembersAssignment_1_0 ) )
            {
            // InternalPdfMk.g:4415:1: ( ( rule__TextObject__MembersAssignment_1_0 ) )
            // InternalPdfMk.g:4416:2: ( rule__TextObject__MembersAssignment_1_0 )
            {
             before(grammarAccess.getTextObjectAccess().getMembersAssignment_1_0()); 
            // InternalPdfMk.g:4417:2: ( rule__TextObject__MembersAssignment_1_0 )
            // InternalPdfMk.g:4417:3: rule__TextObject__MembersAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__MembersAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getMembersAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1__0__Impl"


    // $ANTLR start "rule__TextObject__Group_1__1"
    // InternalPdfMk.g:4425:1: rule__TextObject__Group_1__1 : rule__TextObject__Group_1__1__Impl ;
    public final void rule__TextObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4429:1: ( rule__TextObject__Group_1__1__Impl )
            // InternalPdfMk.g:4430:2: rule__TextObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1__1"


    // $ANTLR start "rule__TextObject__Group_1__1__Impl"
    // InternalPdfMk.g:4436:1: rule__TextObject__Group_1__1__Impl : ( ( rule__TextObject__Group_1_1__0 )* ) ;
    public final void rule__TextObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4440:1: ( ( ( rule__TextObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:4441:1: ( ( rule__TextObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:4441:1: ( ( rule__TextObject__Group_1_1__0 )* )
            // InternalPdfMk.g:4442:2: ( rule__TextObject__Group_1_1__0 )*
            {
             before(grammarAccess.getTextObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:4443:2: ( rule__TextObject__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPdfMk.g:4443:3: rule__TextObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TextObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTextObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1__1__Impl"


    // $ANTLR start "rule__TextObject__Group_1_1__0"
    // InternalPdfMk.g:4452:1: rule__TextObject__Group_1_1__0 : rule__TextObject__Group_1_1__0__Impl rule__TextObject__Group_1_1__1 ;
    public final void rule__TextObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4456:1: ( rule__TextObject__Group_1_1__0__Impl rule__TextObject__Group_1_1__1 )
            // InternalPdfMk.g:4457:2: rule__TextObject__Group_1_1__0__Impl rule__TextObject__Group_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__TextObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextObject__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1_1__0"


    // $ANTLR start "rule__TextObject__Group_1_1__0__Impl"
    // InternalPdfMk.g:4464:1: rule__TextObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4468:1: ( ( ',' ) )
            // InternalPdfMk.g:4469:1: ( ',' )
            {
            // InternalPdfMk.g:4469:1: ( ',' )
            // InternalPdfMk.g:4470:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__TextObject__Group_1_1__1"
    // InternalPdfMk.g:4479:1: rule__TextObject__Group_1_1__1 : rule__TextObject__Group_1_1__1__Impl ;
    public final void rule__TextObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4483:1: ( rule__TextObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:4484:2: rule__TextObject__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1_1__1"


    // $ANTLR start "rule__TextObject__Group_1_1__1__Impl"
    // InternalPdfMk.g:4490:1: rule__TextObject__Group_1_1__1__Impl : ( ( rule__TextObject__MembersAssignment_1_1_1 ) ) ;
    public final void rule__TextObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4494:1: ( ( ( rule__TextObject__MembersAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:4495:1: ( ( rule__TextObject__MembersAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:4495:1: ( ( rule__TextObject__MembersAssignment_1_1_1 ) )
            // InternalPdfMk.g:4496:2: ( rule__TextObject__MembersAssignment_1_1_1 )
            {
             before(grammarAccess.getTextObjectAccess().getMembersAssignment_1_1_1()); 
            // InternalPdfMk.g:4497:2: ( rule__TextObject__MembersAssignment_1_1_1 )
            // InternalPdfMk.g:4497:3: rule__TextObject__MembersAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__MembersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTextObjectAccess().getMembersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__StyleObject__Group__0"
    // InternalPdfMk.g:4506:1: rule__StyleObject__Group__0 : rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 ;
    public final void rule__StyleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4510:1: ( rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 )
            // InternalPdfMk.g:4511:2: rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1
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
    // InternalPdfMk.g:4518:1: rule__StyleObject__Group__0__Impl : ( ( rule__StyleObject__KeyAssignment_0 ) ) ;
    public final void rule__StyleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4522:1: ( ( ( rule__StyleObject__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4523:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4523:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            // InternalPdfMk.g:4524:2: ( rule__StyleObject__KeyAssignment_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4525:2: ( rule__StyleObject__KeyAssignment_0 )
            // InternalPdfMk.g:4525:3: rule__StyleObject__KeyAssignment_0
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
    // InternalPdfMk.g:4533:1: rule__StyleObject__Group__1 : rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 ;
    public final void rule__StyleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4537:1: ( rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 )
            // InternalPdfMk.g:4538:2: rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2
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
    // InternalPdfMk.g:4545:1: rule__StyleObject__Group__1__Impl : ( ':' ) ;
    public final void rule__StyleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4549:1: ( ( ':' ) )
            // InternalPdfMk.g:4550:1: ( ':' )
            {
            // InternalPdfMk.g:4550:1: ( ':' )
            // InternalPdfMk.g:4551:2: ':'
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
    // InternalPdfMk.g:4560:1: rule__StyleObject__Group__2 : rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 ;
    public final void rule__StyleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4564:1: ( rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 )
            // InternalPdfMk.g:4565:2: rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4572:1: rule__StyleObject__Group__2__Impl : ( ( rule__StyleObject__ValueAssignment_2 ) ) ;
    public final void rule__StyleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4576:1: ( ( ( rule__StyleObject__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4577:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4577:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            // InternalPdfMk.g:4578:2: ( rule__StyleObject__ValueAssignment_2 )
            {
             before(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4579:2: ( rule__StyleObject__ValueAssignment_2 )
            // InternalPdfMk.g:4579:3: rule__StyleObject__ValueAssignment_2
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
    // InternalPdfMk.g:4587:1: rule__StyleObject__Group__3 : rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 ;
    public final void rule__StyleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4591:1: ( rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 )
            // InternalPdfMk.g:4592:2: rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4599:1: rule__StyleObject__Group__3__Impl : ( ( rule__StyleObject__FontSizeAssignment_3 )? ) ;
    public final void rule__StyleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4603:1: ( ( ( rule__StyleObject__FontSizeAssignment_3 )? ) )
            // InternalPdfMk.g:4604:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            {
            // InternalPdfMk.g:4604:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            // InternalPdfMk.g:4605:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            {
             before(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3()); 
            // InternalPdfMk.g:4606:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:4606:3: rule__StyleObject__FontSizeAssignment_3
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
    // InternalPdfMk.g:4614:1: rule__StyleObject__Group__4 : rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 ;
    public final void rule__StyleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4618:1: ( rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 )
            // InternalPdfMk.g:4619:2: rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4626:1: rule__StyleObject__Group__4__Impl : ( ( rule__StyleObject__Group_4__0 )? ) ;
    public final void rule__StyleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4630:1: ( ( ( rule__StyleObject__Group_4__0 )? ) )
            // InternalPdfMk.g:4631:1: ( ( rule__StyleObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:4631:1: ( ( rule__StyleObject__Group_4__0 )? )
            // InternalPdfMk.g:4632:2: ( rule__StyleObject__Group_4__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:4633:2: ( rule__StyleObject__Group_4__0 )?
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
                    // InternalPdfMk.g:4633:3: rule__StyleObject__Group_4__0
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
    // InternalPdfMk.g:4641:1: rule__StyleObject__Group__5 : rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 ;
    public final void rule__StyleObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4645:1: ( rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 )
            // InternalPdfMk.g:4646:2: rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4653:1: rule__StyleObject__Group__5__Impl : ( ( rule__StyleObject__Group_5__0 )? ) ;
    public final void rule__StyleObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4657:1: ( ( ( rule__StyleObject__Group_5__0 )? ) )
            // InternalPdfMk.g:4658:1: ( ( rule__StyleObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:4658:1: ( ( rule__StyleObject__Group_5__0 )? )
            // InternalPdfMk.g:4659:2: ( rule__StyleObject__Group_5__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:4660:2: ( rule__StyleObject__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==22) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPdfMk.g:4660:3: rule__StyleObject__Group_5__0
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
    // InternalPdfMk.g:4668:1: rule__StyleObject__Group__6 : rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 ;
    public final void rule__StyleObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4672:1: ( rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 )
            // InternalPdfMk.g:4673:2: rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4680:1: rule__StyleObject__Group__6__Impl : ( ( rule__StyleObject__Group_6__0 )? ) ;
    public final void rule__StyleObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4684:1: ( ( ( rule__StyleObject__Group_6__0 )? ) )
            // InternalPdfMk.g:4685:1: ( ( rule__StyleObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:4685:1: ( ( rule__StyleObject__Group_6__0 )? )
            // InternalPdfMk.g:4686:2: ( rule__StyleObject__Group_6__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:4687:2: ( rule__StyleObject__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==28) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:4687:3: rule__StyleObject__Group_6__0
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
    // InternalPdfMk.g:4695:1: rule__StyleObject__Group__7 : rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 ;
    public final void rule__StyleObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4699:1: ( rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 )
            // InternalPdfMk.g:4700:2: rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:4707:1: rule__StyleObject__Group__7__Impl : ( ( rule__StyleObject__Group_7__0 )? ) ;
    public final void rule__StyleObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4711:1: ( ( ( rule__StyleObject__Group_7__0 )? ) )
            // InternalPdfMk.g:4712:1: ( ( rule__StyleObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:4712:1: ( ( rule__StyleObject__Group_7__0 )? )
            // InternalPdfMk.g:4713:2: ( rule__StyleObject__Group_7__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:4714:2: ( rule__StyleObject__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:4714:3: rule__StyleObject__Group_7__0
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
    // InternalPdfMk.g:4722:1: rule__StyleObject__Group__8 : rule__StyleObject__Group__8__Impl ;
    public final void rule__StyleObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4726:1: ( rule__StyleObject__Group__8__Impl )
            // InternalPdfMk.g:4727:2: rule__StyleObject__Group__8__Impl
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
    // InternalPdfMk.g:4733:1: rule__StyleObject__Group__8__Impl : ( '}' ) ;
    public final void rule__StyleObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4737:1: ( ( '}' ) )
            // InternalPdfMk.g:4738:1: ( '}' )
            {
            // InternalPdfMk.g:4738:1: ( '}' )
            // InternalPdfMk.g:4739:2: '}'
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
    // InternalPdfMk.g:4749:1: rule__StyleObject__Group_4__0 : rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 ;
    public final void rule__StyleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4753:1: ( rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 )
            // InternalPdfMk.g:4754:2: rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1
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
    // InternalPdfMk.g:4761:1: rule__StyleObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4765:1: ( ( ',' ) )
            // InternalPdfMk.g:4766:1: ( ',' )
            {
            // InternalPdfMk.g:4766:1: ( ',' )
            // InternalPdfMk.g:4767:2: ','
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
    // InternalPdfMk.g:4776:1: rule__StyleObject__Group_4__1 : rule__StyleObject__Group_4__1__Impl ;
    public final void rule__StyleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4780:1: ( rule__StyleObject__Group_4__1__Impl )
            // InternalPdfMk.g:4781:2: rule__StyleObject__Group_4__1__Impl
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
    // InternalPdfMk.g:4787:1: rule__StyleObject__Group_4__1__Impl : ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) ;
    public final void rule__StyleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4791:1: ( ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) )
            // InternalPdfMk.g:4792:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            {
            // InternalPdfMk.g:4792:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            // InternalPdfMk.g:4793:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1()); 
            // InternalPdfMk.g:4794:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            // InternalPdfMk.g:4794:3: rule__StyleObject__TypeFaceAssignment_4_1
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
    // InternalPdfMk.g:4803:1: rule__StyleObject__Group_5__0 : rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 ;
    public final void rule__StyleObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4807:1: ( rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 )
            // InternalPdfMk.g:4808:2: rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1
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
    // InternalPdfMk.g:4815:1: rule__StyleObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4819:1: ( ( ',' ) )
            // InternalPdfMk.g:4820:1: ( ',' )
            {
            // InternalPdfMk.g:4820:1: ( ',' )
            // InternalPdfMk.g:4821:2: ','
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
    // InternalPdfMk.g:4830:1: rule__StyleObject__Group_5__1 : rule__StyleObject__Group_5__1__Impl ;
    public final void rule__StyleObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4834:1: ( rule__StyleObject__Group_5__1__Impl )
            // InternalPdfMk.g:4835:2: rule__StyleObject__Group_5__1__Impl
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
    // InternalPdfMk.g:4841:1: rule__StyleObject__Group_5__1__Impl : ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) ;
    public final void rule__StyleObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4845:1: ( ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) )
            // InternalPdfMk.g:4846:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            {
            // InternalPdfMk.g:4846:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            // InternalPdfMk.g:4847:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1()); 
            // InternalPdfMk.g:4848:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            // InternalPdfMk.g:4848:3: rule__StyleObject__AlignmentAssignment_5_1
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
    // InternalPdfMk.g:4857:1: rule__StyleObject__Group_6__0 : rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 ;
    public final void rule__StyleObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4861:1: ( rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 )
            // InternalPdfMk.g:4862:2: rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:4869:1: rule__StyleObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4873:1: ( ( ',' ) )
            // InternalPdfMk.g:4874:1: ( ',' )
            {
            // InternalPdfMk.g:4874:1: ( ',' )
            // InternalPdfMk.g:4875:2: ','
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
    // InternalPdfMk.g:4884:1: rule__StyleObject__Group_6__1 : rule__StyleObject__Group_6__1__Impl ;
    public final void rule__StyleObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4888:1: ( rule__StyleObject__Group_6__1__Impl )
            // InternalPdfMk.g:4889:2: rule__StyleObject__Group_6__1__Impl
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
    // InternalPdfMk.g:4895:1: rule__StyleObject__Group_6__1__Impl : ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__StyleObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4899:1: ( ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:4900:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:4900:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:4901:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:4902:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:4902:3: rule__StyleObject__ItalicsAssignment_6_1
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
    // InternalPdfMk.g:4911:1: rule__StyleObject__Group_7__0 : rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 ;
    public final void rule__StyleObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4915:1: ( rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 )
            // InternalPdfMk.g:4916:2: rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1
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
    // InternalPdfMk.g:4923:1: rule__StyleObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4927:1: ( ( ',' ) )
            // InternalPdfMk.g:4928:1: ( ',' )
            {
            // InternalPdfMk.g:4928:1: ( ',' )
            // InternalPdfMk.g:4929:2: ','
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
    // InternalPdfMk.g:4938:1: rule__StyleObject__Group_7__1 : rule__StyleObject__Group_7__1__Impl ;
    public final void rule__StyleObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4942:1: ( rule__StyleObject__Group_7__1__Impl )
            // InternalPdfMk.g:4943:2: rule__StyleObject__Group_7__1__Impl
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
    // InternalPdfMk.g:4949:1: rule__StyleObject__Group_7__1__Impl : ( ( rule__StyleObject__MarginAssignment_7_1 ) ) ;
    public final void rule__StyleObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4953:1: ( ( ( rule__StyleObject__MarginAssignment_7_1 ) ) )
            // InternalPdfMk.g:4954:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            {
            // InternalPdfMk.g:4954:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            // InternalPdfMk.g:4955:2: ( rule__StyleObject__MarginAssignment_7_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getMarginAssignment_7_1()); 
            // InternalPdfMk.g:4956:2: ( rule__StyleObject__MarginAssignment_7_1 )
            // InternalPdfMk.g:4956:3: rule__StyleObject__MarginAssignment_7_1
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
    // InternalPdfMk.g:4965:1: rule__StyleObjects__Group__0 : rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 ;
    public final void rule__StyleObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4969:1: ( rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 )
            // InternalPdfMk.g:4970:2: rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPdfMk.g:4977:1: rule__StyleObjects__Group__0__Impl : ( '{' ) ;
    public final void rule__StyleObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4981:1: ( ( '{' ) )
            // InternalPdfMk.g:4982:1: ( '{' )
            {
            // InternalPdfMk.g:4982:1: ( '{' )
            // InternalPdfMk.g:4983:2: '{'
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
    // InternalPdfMk.g:4992:1: rule__StyleObjects__Group__1 : rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 ;
    public final void rule__StyleObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4996:1: ( rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 )
            // InternalPdfMk.g:4997:2: rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2
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
    // InternalPdfMk.g:5004:1: rule__StyleObjects__Group__1__Impl : ( ( rule__StyleObjects__Group_1__0 ) ) ;
    public final void rule__StyleObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5008:1: ( ( ( rule__StyleObjects__Group_1__0 ) ) )
            // InternalPdfMk.g:5009:1: ( ( rule__StyleObjects__Group_1__0 ) )
            {
            // InternalPdfMk.g:5009:1: ( ( rule__StyleObjects__Group_1__0 ) )
            // InternalPdfMk.g:5010:2: ( rule__StyleObjects__Group_1__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:5011:2: ( rule__StyleObjects__Group_1__0 )
            // InternalPdfMk.g:5011:3: rule__StyleObjects__Group_1__0
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
    // InternalPdfMk.g:5019:1: rule__StyleObjects__Group__2 : rule__StyleObjects__Group__2__Impl ;
    public final void rule__StyleObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5023:1: ( rule__StyleObjects__Group__2__Impl )
            // InternalPdfMk.g:5024:2: rule__StyleObjects__Group__2__Impl
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
    // InternalPdfMk.g:5030:1: rule__StyleObjects__Group__2__Impl : ( '}' ) ;
    public final void rule__StyleObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5034:1: ( ( '}' ) )
            // InternalPdfMk.g:5035:1: ( '}' )
            {
            // InternalPdfMk.g:5035:1: ( '}' )
            // InternalPdfMk.g:5036:2: '}'
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
    // InternalPdfMk.g:5046:1: rule__StyleObjects__Group_1__0 : rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 ;
    public final void rule__StyleObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5050:1: ( rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 )
            // InternalPdfMk.g:5051:2: rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1
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
    // InternalPdfMk.g:5058:1: rule__StyleObjects__Group_1__0__Impl : ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__StyleObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5062:1: ( ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:5063:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5063:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:5064:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:5065:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:5065:3: rule__StyleObjects__ValueAssignment_1_0
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
    // InternalPdfMk.g:5073:1: rule__StyleObjects__Group_1__1 : rule__StyleObjects__Group_1__1__Impl ;
    public final void rule__StyleObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5077:1: ( rule__StyleObjects__Group_1__1__Impl )
            // InternalPdfMk.g:5078:2: rule__StyleObjects__Group_1__1__Impl
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
    // InternalPdfMk.g:5084:1: rule__StyleObjects__Group_1__1__Impl : ( ( rule__StyleObjects__Group_1_1__0 )* ) ;
    public final void rule__StyleObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5088:1: ( ( ( rule__StyleObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5089:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5089:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:5090:2: ( rule__StyleObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5091:2: ( rule__StyleObjects__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPdfMk.g:5091:3: rule__StyleObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StyleObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPdfMk.g:5100:1: rule__StyleObjects__Group_1_1__0 : rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 ;
    public final void rule__StyleObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5104:1: ( rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 )
            // InternalPdfMk.g:5105:2: rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPdfMk.g:5112:1: rule__StyleObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__StyleObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5116:1: ( ( ',' ) )
            // InternalPdfMk.g:5117:1: ( ',' )
            {
            // InternalPdfMk.g:5117:1: ( ',' )
            // InternalPdfMk.g:5118:2: ','
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
    // InternalPdfMk.g:5127:1: rule__StyleObjects__Group_1_1__1 : rule__StyleObjects__Group_1_1__1__Impl ;
    public final void rule__StyleObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5131:1: ( rule__StyleObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:5132:2: rule__StyleObjects__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5138:1: rule__StyleObjects__Group_1_1__1__Impl : ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__StyleObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5142:1: ( ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5143:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5143:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:5144:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:5145:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:5145:3: rule__StyleObjects__ValueAssignment_1_1_1
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
    // InternalPdfMk.g:5154:1: rule__InnerColumnObject__Group__0 : rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 ;
    public final void rule__InnerColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5158:1: ( rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 )
            // InternalPdfMk.g:5159:2: rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPdfMk.g:5166:1: rule__InnerColumnObject__Group__0__Impl : ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__InnerColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5170:1: ( ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5171:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5171:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5172:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5173:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:5173:3: rule__InnerColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:5181:1: rule__InnerColumnObject__Group__1 : rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 ;
    public final void rule__InnerColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5185:1: ( rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 )
            // InternalPdfMk.g:5186:2: rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5193:1: rule__InnerColumnObject__Group__1__Impl : ( ( rule__InnerColumnObject__Group_1__0 ) ) ;
    public final void rule__InnerColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5197:1: ( ( ( rule__InnerColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5198:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5198:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5199:2: ( rule__InnerColumnObject__Group_1__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5200:2: ( rule__InnerColumnObject__Group_1__0 )
            // InternalPdfMk.g:5200:3: rule__InnerColumnObject__Group_1__0
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
    // InternalPdfMk.g:5208:1: rule__InnerColumnObject__Group__2 : rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 ;
    public final void rule__InnerColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5212:1: ( rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 )
            // InternalPdfMk.g:5213:2: rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5220:1: rule__InnerColumnObject__Group__2__Impl : ( ( rule__InnerColumnObject__Group_2__0 ) ) ;
    public final void rule__InnerColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5224:1: ( ( ( rule__InnerColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:5225:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:5225:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:5226:2: ( rule__InnerColumnObject__Group_2__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:5227:2: ( rule__InnerColumnObject__Group_2__0 )
            // InternalPdfMk.g:5227:3: rule__InnerColumnObject__Group_2__0
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
    // InternalPdfMk.g:5235:1: rule__InnerColumnObject__Group__3 : rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 ;
    public final void rule__InnerColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5239:1: ( rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 )
            // InternalPdfMk.g:5240:2: rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4
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
    // InternalPdfMk.g:5247:1: rule__InnerColumnObject__Group__3__Impl : ( ( rule__InnerColumnObject__Group_3__0 ) ) ;
    public final void rule__InnerColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5251:1: ( ( ( rule__InnerColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5252:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5252:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:5253:2: ( rule__InnerColumnObject__Group_3__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5254:2: ( rule__InnerColumnObject__Group_3__0 )
            // InternalPdfMk.g:5254:3: rule__InnerColumnObject__Group_3__0
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
    // InternalPdfMk.g:5262:1: rule__InnerColumnObject__Group__4 : rule__InnerColumnObject__Group__4__Impl ;
    public final void rule__InnerColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5266:1: ( rule__InnerColumnObject__Group__4__Impl )
            // InternalPdfMk.g:5267:2: rule__InnerColumnObject__Group__4__Impl
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
    // InternalPdfMk.g:5273:1: rule__InnerColumnObject__Group__4__Impl : ( ']' ) ;
    public final void rule__InnerColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5277:1: ( ( ']' ) )
            // InternalPdfMk.g:5278:1: ( ']' )
            {
            // InternalPdfMk.g:5278:1: ( ']' )
            // InternalPdfMk.g:5279:2: ']'
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
    // InternalPdfMk.g:5289:1: rule__InnerColumnObject__Group_1__0 : rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 ;
    public final void rule__InnerColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5293:1: ( rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 )
            // InternalPdfMk.g:5294:2: rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPdfMk.g:5301:1: rule__InnerColumnObject__Group_1__0__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__InnerColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5305:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:5306:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:5306:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:5307:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:5308:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPdfMk.g:5308:3: rule__InnerColumnObject__TextAssignment_1_0
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
    // InternalPdfMk.g:5316:1: rule__InnerColumnObject__Group_1__1 : rule__InnerColumnObject__Group_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5320:1: ( rule__InnerColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5321:2: rule__InnerColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:5327:1: rule__InnerColumnObject__Group_1__1__Impl : ( ( rule__InnerColumnObject__Group_1_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5331:1: ( ( ( rule__InnerColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5332:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5332:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5333:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5334:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_STRING) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalPdfMk.g:5334:3: rule__InnerColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalPdfMk.g:5343:1: rule__InnerColumnObject__Group_1_1__0 : rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 ;
    public final void rule__InnerColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5347:1: ( rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:5348:2: rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1
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
    // InternalPdfMk.g:5355:1: rule__InnerColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5359:1: ( ( ',' ) )
            // InternalPdfMk.g:5360:1: ( ',' )
            {
            // InternalPdfMk.g:5360:1: ( ',' )
            // InternalPdfMk.g:5361:2: ','
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
    // InternalPdfMk.g:5370:1: rule__InnerColumnObject__Group_1_1__1 : rule__InnerColumnObject__Group_1_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5374:1: ( rule__InnerColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5375:2: rule__InnerColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5381:1: rule__InnerColumnObject__Group_1_1__1__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5385:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5386:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5386:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:5387:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:5388:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:5388:3: rule__InnerColumnObject__TextAssignment_1_1_1
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
    // InternalPdfMk.g:5397:1: rule__InnerColumnObject__Group_2__0 : rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 ;
    public final void rule__InnerColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5401:1: ( rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 )
            // InternalPdfMk.g:5402:2: rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5409:1: rule__InnerColumnObject__Group_2__0__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__InnerColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5413:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:5414:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:5414:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:5415:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:5416:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==26) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==21) ) {
                        int LA24_5 = input.LA(4);

                        if ( (LA24_5==RULE_STRING) ) {
                            int LA24_6 = input.LA(5);

                            if ( (LA24_6==20) ) {
                                int LA24_7 = input.LA(6);

                                if ( (LA24_7==22||(LA24_7>=25 && LA24_7<=30)||LA24_7==32||LA24_7==39) ) {
                                    alt24=1;
                                }
                            }
                            else if ( (LA24_6==19) ) {
                                alt24=1;
                            }
                        }
                    }
                }
                else if ( (LA24_1==22||LA24_1==25||(LA24_1>=27 && LA24_1<=30)||LA24_1==32||LA24_1==39) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalPdfMk.g:5416:3: rule__InnerColumnObject__TextObjectAssignment_2_0
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
    // InternalPdfMk.g:5424:1: rule__InnerColumnObject__Group_2__1 : rule__InnerColumnObject__Group_2__1__Impl ;
    public final void rule__InnerColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5428:1: ( rule__InnerColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:5429:2: rule__InnerColumnObject__Group_2__1__Impl
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
    // InternalPdfMk.g:5435:1: rule__InnerColumnObject__Group_2__1__Impl : ( ( rule__InnerColumnObject__Group_2_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5439:1: ( ( ( rule__InnerColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:5440:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:5440:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:5441:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:5442:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==18) ) {
                        int LA25_3 = input.LA(3);

                        if ( (LA25_3==26) ) {
                            int LA25_4 = input.LA(4);

                            if ( (LA25_4==21) ) {
                                int LA25_6 = input.LA(5);

                                if ( (LA25_6==RULE_STRING) ) {
                                    int LA25_7 = input.LA(6);

                                    if ( (LA25_7==20) ) {
                                        int LA25_8 = input.LA(7);

                                        if ( (LA25_8==22||(LA25_8>=25 && LA25_8<=30)||LA25_8==32||LA25_8==39) ) {
                                            alt25=1;
                                        }


                                    }
                                    else if ( (LA25_7==19) ) {
                                        alt25=1;
                                    }


                                }


                            }


                        }
                        else if ( (LA25_3==22||LA25_3==25||(LA25_3>=27 && LA25_3<=30)||LA25_3==32||LA25_3==39) ) {
                            alt25=1;
                        }


                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalPdfMk.g:5442:3: rule__InnerColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPdfMk.g:5451:1: rule__InnerColumnObject__Group_2_1__0 : rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 ;
    public final void rule__InnerColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5455:1: ( rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:5456:2: rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1
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
    // InternalPdfMk.g:5463:1: rule__InnerColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5467:1: ( ( ',' ) )
            // InternalPdfMk.g:5468:1: ( ',' )
            {
            // InternalPdfMk.g:5468:1: ( ',' )
            // InternalPdfMk.g:5469:2: ','
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
    // InternalPdfMk.g:5478:1: rule__InnerColumnObject__Group_2_1__1 : rule__InnerColumnObject__Group_2_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5482:1: ( rule__InnerColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:5483:2: rule__InnerColumnObject__Group_2_1__1__Impl
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
    // InternalPdfMk.g:5489:1: rule__InnerColumnObject__Group_2_1__1__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5493:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:5494:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:5494:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:5495:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:5496:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:5496:3: rule__InnerColumnObject__TextObjectAssignment_2_1_1
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
    // InternalPdfMk.g:5505:1: rule__InnerColumnObject__Group_3__0 : rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 ;
    public final void rule__InnerColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5509:1: ( rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 )
            // InternalPdfMk.g:5510:2: rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5517:1: rule__InnerColumnObject__Group_3__0__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__InnerColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5521:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:5522:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:5522:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:5523:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:5524:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPdfMk.g:5524:3: rule__InnerColumnObject__ColumnAssignment_3_0
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
    // InternalPdfMk.g:5532:1: rule__InnerColumnObject__Group_3__1 : rule__InnerColumnObject__Group_3__1__Impl ;
    public final void rule__InnerColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5536:1: ( rule__InnerColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:5537:2: rule__InnerColumnObject__Group_3__1__Impl
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
    // InternalPdfMk.g:5543:1: rule__InnerColumnObject__Group_3__1__Impl : ( ( rule__InnerColumnObject__Group_3_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5547:1: ( ( ( rule__InnerColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:5548:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:5548:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:5549:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:5550:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPdfMk.g:5550:3: rule__InnerColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPdfMk.g:5559:1: rule__InnerColumnObject__Group_3_1__0 : rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 ;
    public final void rule__InnerColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5563:1: ( rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:5564:2: rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1
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
    // InternalPdfMk.g:5571:1: rule__InnerColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5575:1: ( ( ',' ) )
            // InternalPdfMk.g:5576:1: ( ',' )
            {
            // InternalPdfMk.g:5576:1: ( ',' )
            // InternalPdfMk.g:5577:2: ','
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
    // InternalPdfMk.g:5586:1: rule__InnerColumnObject__Group_3_1__1 : rule__InnerColumnObject__Group_3_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5590:1: ( rule__InnerColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:5591:2: rule__InnerColumnObject__Group_3_1__1__Impl
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
    // InternalPdfMk.g:5597:1: rule__InnerColumnObject__Group_3_1__1__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5601:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:5602:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:5602:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:5603:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:5604:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:5604:3: rule__InnerColumnObject__ColumnAssignment_3_1_1
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
    // InternalPdfMk.g:5613:1: rule__ColumnObject__Group__0 : rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 ;
    public final void rule__ColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5617:1: ( rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 )
            // InternalPdfMk.g:5618:2: rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPdfMk.g:5625:1: rule__ColumnObject__Group__0__Impl : ( ( rule__ColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__ColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5629:1: ( ( ( rule__ColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5630:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5630:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5631:2: ( rule__ColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5632:2: ( rule__ColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:5632:3: rule__ColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:5640:1: rule__ColumnObject__Group__1 : rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 ;
    public final void rule__ColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5644:1: ( rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 )
            // InternalPdfMk.g:5645:2: rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5652:1: rule__ColumnObject__Group__1__Impl : ( ( rule__ColumnObject__Group_1__0 ) ) ;
    public final void rule__ColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5656:1: ( ( ( rule__ColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5657:1: ( ( rule__ColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5657:1: ( ( rule__ColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5658:2: ( rule__ColumnObject__Group_1__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5659:2: ( rule__ColumnObject__Group_1__0 )
            // InternalPdfMk.g:5659:3: rule__ColumnObject__Group_1__0
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
    // InternalPdfMk.g:5667:1: rule__ColumnObject__Group__2 : rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 ;
    public final void rule__ColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5671:1: ( rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 )
            // InternalPdfMk.g:5672:2: rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5679:1: rule__ColumnObject__Group__2__Impl : ( ( rule__ColumnObject__Group_2__0 ) ) ;
    public final void rule__ColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5683:1: ( ( ( rule__ColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:5684:1: ( ( rule__ColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:5684:1: ( ( rule__ColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:5685:2: ( rule__ColumnObject__Group_2__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:5686:2: ( rule__ColumnObject__Group_2__0 )
            // InternalPdfMk.g:5686:3: rule__ColumnObject__Group_2__0
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
    // InternalPdfMk.g:5694:1: rule__ColumnObject__Group__3 : rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 ;
    public final void rule__ColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5698:1: ( rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 )
            // InternalPdfMk.g:5699:2: rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4
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
    // InternalPdfMk.g:5706:1: rule__ColumnObject__Group__3__Impl : ( ( rule__ColumnObject__Group_3__0 ) ) ;
    public final void rule__ColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5710:1: ( ( ( rule__ColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5711:1: ( ( rule__ColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5711:1: ( ( rule__ColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:5712:2: ( rule__ColumnObject__Group_3__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5713:2: ( rule__ColumnObject__Group_3__0 )
            // InternalPdfMk.g:5713:3: rule__ColumnObject__Group_3__0
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
    // InternalPdfMk.g:5721:1: rule__ColumnObject__Group__4 : rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 ;
    public final void rule__ColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5725:1: ( rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 )
            // InternalPdfMk.g:5726:2: rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5
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
    // InternalPdfMk.g:5733:1: rule__ColumnObject__Group__4__Impl : ( ( rule__ColumnObject__Group_4__0 ) ) ;
    public final void rule__ColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5737:1: ( ( ( rule__ColumnObject__Group_4__0 ) ) )
            // InternalPdfMk.g:5738:1: ( ( rule__ColumnObject__Group_4__0 ) )
            {
            // InternalPdfMk.g:5738:1: ( ( rule__ColumnObject__Group_4__0 ) )
            // InternalPdfMk.g:5739:2: ( rule__ColumnObject__Group_4__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:5740:2: ( rule__ColumnObject__Group_4__0 )
            // InternalPdfMk.g:5740:3: rule__ColumnObject__Group_4__0
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
    // InternalPdfMk.g:5748:1: rule__ColumnObject__Group__5 : rule__ColumnObject__Group__5__Impl ;
    public final void rule__ColumnObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5752:1: ( rule__ColumnObject__Group__5__Impl )
            // InternalPdfMk.g:5753:2: rule__ColumnObject__Group__5__Impl
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
    // InternalPdfMk.g:5759:1: rule__ColumnObject__Group__5__Impl : ( ']' ) ;
    public final void rule__ColumnObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5763:1: ( ( ']' ) )
            // InternalPdfMk.g:5764:1: ( ']' )
            {
            // InternalPdfMk.g:5764:1: ( ']' )
            // InternalPdfMk.g:5765:2: ']'
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
    // InternalPdfMk.g:5775:1: rule__ColumnObject__Group_1__0 : rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 ;
    public final void rule__ColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5779:1: ( rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 )
            // InternalPdfMk.g:5780:2: rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPdfMk.g:5787:1: rule__ColumnObject__Group_1__0__Impl : ( ( rule__ColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__ColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5791:1: ( ( ( rule__ColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:5792:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:5792:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:5793:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:5794:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPdfMk.g:5794:3: rule__ColumnObject__TextAssignment_1_0
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
    // InternalPdfMk.g:5802:1: rule__ColumnObject__Group_1__1 : rule__ColumnObject__Group_1__1__Impl ;
    public final void rule__ColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5806:1: ( rule__ColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5807:2: rule__ColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:5813:1: rule__ColumnObject__Group_1__1__Impl : ( ( rule__ColumnObject__Group_1_1__0 )* ) ;
    public final void rule__ColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5817:1: ( ( ( rule__ColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5818:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5818:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5819:2: ( rule__ColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5820:2: ( rule__ColumnObject__Group_1_1__0 )*
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
            	    // InternalPdfMk.g:5820:3: rule__ColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPdfMk.g:5829:1: rule__ColumnObject__Group_1_1__0 : rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 ;
    public final void rule__ColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5833:1: ( rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:5834:2: rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1
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
    // InternalPdfMk.g:5841:1: rule__ColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5845:1: ( ( ',' ) )
            // InternalPdfMk.g:5846:1: ( ',' )
            {
            // InternalPdfMk.g:5846:1: ( ',' )
            // InternalPdfMk.g:5847:2: ','
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
    // InternalPdfMk.g:5856:1: rule__ColumnObject__Group_1_1__1 : rule__ColumnObject__Group_1_1__1__Impl ;
    public final void rule__ColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5860:1: ( rule__ColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5861:2: rule__ColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5867:1: rule__ColumnObject__Group_1_1__1__Impl : ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__ColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5871:1: ( ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5872:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5872:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:5873:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:5874:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:5874:3: rule__ColumnObject__TextAssignment_1_1_1
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
    // InternalPdfMk.g:5883:1: rule__ColumnObject__Group_2__0 : rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 ;
    public final void rule__ColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5887:1: ( rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 )
            // InternalPdfMk.g:5888:2: rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:5895:1: rule__ColumnObject__Group_2__0__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__ColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5899:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:5900:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:5900:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:5901:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:5902:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==22||LA30_1==25||(LA30_1>=27 && LA30_1<=30)||LA30_1==32||LA30_1==39) ) {
                    alt30=1;
                }
                else if ( (LA30_1==26) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==21) ) {
                        int LA30_5 = input.LA(4);

                        if ( (LA30_5==RULE_STRING) ) {
                            int LA30_6 = input.LA(5);

                            if ( (LA30_6==20) ) {
                                int LA30_7 = input.LA(6);

                                if ( (LA30_7==22||(LA30_7>=25 && LA30_7<=30)||LA30_7==32||LA30_7==39) ) {
                                    alt30=1;
                                }
                            }
                            else if ( (LA30_6==19) ) {
                                alt30=1;
                            }
                        }
                    }
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalPdfMk.g:5902:3: rule__ColumnObject__TextObjectAssignment_2_0
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
    // InternalPdfMk.g:5910:1: rule__ColumnObject__Group_2__1 : rule__ColumnObject__Group_2__1__Impl ;
    public final void rule__ColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5914:1: ( rule__ColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:5915:2: rule__ColumnObject__Group_2__1__Impl
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
    // InternalPdfMk.g:5921:1: rule__ColumnObject__Group_2__1__Impl : ( ( rule__ColumnObject__Group_2_1__0 )* ) ;
    public final void rule__ColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5925:1: ( ( ( rule__ColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:5926:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:5926:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:5927:2: ( rule__ColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:5928:2: ( rule__ColumnObject__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==18) ) {
                        int LA31_3 = input.LA(3);

                        if ( (LA31_3==26) ) {
                            int LA31_4 = input.LA(4);

                            if ( (LA31_4==21) ) {
                                int LA31_6 = input.LA(5);

                                if ( (LA31_6==RULE_STRING) ) {
                                    int LA31_7 = input.LA(6);

                                    if ( (LA31_7==20) ) {
                                        int LA31_8 = input.LA(7);

                                        if ( (LA31_8==22||(LA31_8>=25 && LA31_8<=30)||LA31_8==32||LA31_8==39) ) {
                                            alt31=1;
                                        }


                                    }
                                    else if ( (LA31_7==19) ) {
                                        alt31=1;
                                    }


                                }


                            }


                        }
                        else if ( (LA31_3==22||LA31_3==25||(LA31_3>=27 && LA31_3<=30)||LA31_3==32||LA31_3==39) ) {
                            alt31=1;
                        }


                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPdfMk.g:5928:3: rule__ColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPdfMk.g:5937:1: rule__ColumnObject__Group_2_1__0 : rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 ;
    public final void rule__ColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5941:1: ( rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:5942:2: rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1
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
    // InternalPdfMk.g:5949:1: rule__ColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5953:1: ( ( ',' ) )
            // InternalPdfMk.g:5954:1: ( ',' )
            {
            // InternalPdfMk.g:5954:1: ( ',' )
            // InternalPdfMk.g:5955:2: ','
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
    // InternalPdfMk.g:5964:1: rule__ColumnObject__Group_2_1__1 : rule__ColumnObject__Group_2_1__1__Impl ;
    public final void rule__ColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5968:1: ( rule__ColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:5969:2: rule__ColumnObject__Group_2_1__1__Impl
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
    // InternalPdfMk.g:5975:1: rule__ColumnObject__Group_2_1__1__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__ColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5979:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:5980:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:5980:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:5981:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:5982:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:5982:3: rule__ColumnObject__TextObjectAssignment_2_1_1
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
    // InternalPdfMk.g:5991:1: rule__ColumnObject__Group_3__0 : rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 ;
    public final void rule__ColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5995:1: ( rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 )
            // InternalPdfMk.g:5996:2: rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:6003:1: rule__ColumnObject__Group_3__0__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__ColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6007:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:6008:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:6008:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:6009:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:6010:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPdfMk.g:6010:3: rule__ColumnObject__ColumnAssignment_3_0
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
    // InternalPdfMk.g:6018:1: rule__ColumnObject__Group_3__1 : rule__ColumnObject__Group_3__1__Impl ;
    public final void rule__ColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6022:1: ( rule__ColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:6023:2: rule__ColumnObject__Group_3__1__Impl
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
    // InternalPdfMk.g:6029:1: rule__ColumnObject__Group_3__1__Impl : ( ( rule__ColumnObject__Group_3_1__0 )* ) ;
    public final void rule__ColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6033:1: ( ( ( rule__ColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:6034:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:6034:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:6035:2: ( rule__ColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:6036:2: ( rule__ColumnObject__Group_3_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==18) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalPdfMk.g:6036:3: rule__ColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPdfMk.g:6045:1: rule__ColumnObject__Group_3_1__0 : rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 ;
    public final void rule__ColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6049:1: ( rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:6050:2: rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1
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
    // InternalPdfMk.g:6057:1: rule__ColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6061:1: ( ( ',' ) )
            // InternalPdfMk.g:6062:1: ( ',' )
            {
            // InternalPdfMk.g:6062:1: ( ',' )
            // InternalPdfMk.g:6063:2: ','
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
    // InternalPdfMk.g:6072:1: rule__ColumnObject__Group_3_1__1 : rule__ColumnObject__Group_3_1__1__Impl ;
    public final void rule__ColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6076:1: ( rule__ColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:6077:2: rule__ColumnObject__Group_3_1__1__Impl
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
    // InternalPdfMk.g:6083:1: rule__ColumnObject__Group_3_1__1__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__ColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6087:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:6088:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:6088:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:6089:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:6090:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:6090:3: rule__ColumnObject__ColumnAssignment_3_1_1
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
    // InternalPdfMk.g:6099:1: rule__ColumnObject__Group_4__0 : rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 ;
    public final void rule__ColumnObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6103:1: ( rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 )
            // InternalPdfMk.g:6104:2: rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1
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
    // InternalPdfMk.g:6111:1: rule__ColumnObject__Group_4__0__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) ;
    public final void rule__ColumnObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6115:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) )
            // InternalPdfMk.g:6116:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            {
            // InternalPdfMk.g:6116:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            // InternalPdfMk.g:6117:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_0()); 
            // InternalPdfMk.g:6118:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPdfMk.g:6118:3: rule__ColumnObject__InnerColumnAssignment_4_0
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
    // InternalPdfMk.g:6126:1: rule__ColumnObject__Group_4__1 : rule__ColumnObject__Group_4__1__Impl ;
    public final void rule__ColumnObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6130:1: ( rule__ColumnObject__Group_4__1__Impl )
            // InternalPdfMk.g:6131:2: rule__ColumnObject__Group_4__1__Impl
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
    // InternalPdfMk.g:6137:1: rule__ColumnObject__Group_4__1__Impl : ( ( rule__ColumnObject__Group_4_1__0 )* ) ;
    public final void rule__ColumnObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6141:1: ( ( ( rule__ColumnObject__Group_4_1__0 )* ) )
            // InternalPdfMk.g:6142:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:6142:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            // InternalPdfMk.g:6143:2: ( rule__ColumnObject__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4_1()); 
            // InternalPdfMk.g:6144:2: ( rule__ColumnObject__Group_4_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPdfMk.g:6144:3: rule__ColumnObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPdfMk.g:6153:1: rule__ColumnObject__Group_4_1__0 : rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 ;
    public final void rule__ColumnObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6157:1: ( rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 )
            // InternalPdfMk.g:6158:2: rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1
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
    // InternalPdfMk.g:6165:1: rule__ColumnObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6169:1: ( ( ',' ) )
            // InternalPdfMk.g:6170:1: ( ',' )
            {
            // InternalPdfMk.g:6170:1: ( ',' )
            // InternalPdfMk.g:6171:2: ','
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
    // InternalPdfMk.g:6180:1: rule__ColumnObject__Group_4_1__1 : rule__ColumnObject__Group_4_1__1__Impl ;
    public final void rule__ColumnObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6184:1: ( rule__ColumnObject__Group_4_1__1__Impl )
            // InternalPdfMk.g:6185:2: rule__ColumnObject__Group_4_1__1__Impl
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
    // InternalPdfMk.g:6191:1: rule__ColumnObject__Group_4_1__1__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) ;
    public final void rule__ColumnObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6195:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:6196:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:6196:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            // InternalPdfMk.g:6197:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_1_1()); 
            // InternalPdfMk.g:6198:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            // InternalPdfMk.g:6198:3: rule__ColumnObject__InnerColumnAssignment_4_1_1
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
    // InternalPdfMk.g:6207:1: rule__ImageObject__Group__0 : rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 ;
    public final void rule__ImageObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6211:1: ( rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 )
            // InternalPdfMk.g:6212:2: rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6219:1: rule__ImageObject__Group__0__Impl : ( ( rule__ImageObject__ValueAssignment_0 ) ) ;
    public final void rule__ImageObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6223:1: ( ( ( rule__ImageObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6224:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6224:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6225:2: ( rule__ImageObject__ValueAssignment_0 )
            {
             before(grammarAccess.getImageObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6226:2: ( rule__ImageObject__ValueAssignment_0 )
            // InternalPdfMk.g:6226:3: rule__ImageObject__ValueAssignment_0
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
    // InternalPdfMk.g:6234:1: rule__ImageObject__Group__1 : rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 ;
    public final void rule__ImageObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6238:1: ( rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 )
            // InternalPdfMk.g:6239:2: rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6246:1: rule__ImageObject__Group__1__Impl : ( ( rule__ImageObject__ImageAssignment_1 )? ) ;
    public final void rule__ImageObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6250:1: ( ( ( rule__ImageObject__ImageAssignment_1 )? ) )
            // InternalPdfMk.g:6251:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            {
            // InternalPdfMk.g:6251:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            // InternalPdfMk.g:6252:2: ( rule__ImageObject__ImageAssignment_1 )?
            {
             before(grammarAccess.getImageObjectAccess().getImageAssignment_1()); 
            // InternalPdfMk.g:6253:2: ( rule__ImageObject__ImageAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPdfMk.g:6253:3: rule__ImageObject__ImageAssignment_1
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
    // InternalPdfMk.g:6261:1: rule__ImageObject__Group__2 : rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 ;
    public final void rule__ImageObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6265:1: ( rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 )
            // InternalPdfMk.g:6266:2: rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6273:1: rule__ImageObject__Group__2__Impl : ( ( rule__ImageObject__Group_2__0 )? ) ;
    public final void rule__ImageObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6277:1: ( ( ( rule__ImageObject__Group_2__0 )? ) )
            // InternalPdfMk.g:6278:1: ( ( rule__ImageObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:6278:1: ( ( rule__ImageObject__Group_2__0 )? )
            // InternalPdfMk.g:6279:2: ( rule__ImageObject__Group_2__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:6280:2: ( rule__ImageObject__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==30) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalPdfMk.g:6280:3: rule__ImageObject__Group_2__0
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
    // InternalPdfMk.g:6288:1: rule__ImageObject__Group__3 : rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 ;
    public final void rule__ImageObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6292:1: ( rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 )
            // InternalPdfMk.g:6293:2: rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6300:1: rule__ImageObject__Group__3__Impl : ( ( rule__ImageObject__Group_3__0 )? ) ;
    public final void rule__ImageObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6304:1: ( ( ( rule__ImageObject__Group_3__0 )? ) )
            // InternalPdfMk.g:6305:1: ( ( rule__ImageObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:6305:1: ( ( rule__ImageObject__Group_3__0 )? )
            // InternalPdfMk.g:6306:2: ( rule__ImageObject__Group_3__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:6307:2: ( rule__ImageObject__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==34) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalPdfMk.g:6307:3: rule__ImageObject__Group_3__0
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
    // InternalPdfMk.g:6315:1: rule__ImageObject__Group__4 : rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 ;
    public final void rule__ImageObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6319:1: ( rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 )
            // InternalPdfMk.g:6320:2: rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6327:1: rule__ImageObject__Group__4__Impl : ( ( rule__ImageObject__Group_4__0 )? ) ;
    public final void rule__ImageObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6331:1: ( ( ( rule__ImageObject__Group_4__0 )? ) )
            // InternalPdfMk.g:6332:1: ( ( rule__ImageObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:6332:1: ( ( rule__ImageObject__Group_4__0 )? )
            // InternalPdfMk.g:6333:2: ( rule__ImageObject__Group_4__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:6334:2: ( rule__ImageObject__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==37) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:6334:3: rule__ImageObject__Group_4__0
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
    // InternalPdfMk.g:6342:1: rule__ImageObject__Group__5 : rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 ;
    public final void rule__ImageObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6346:1: ( rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 )
            // InternalPdfMk.g:6347:2: rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6354:1: rule__ImageObject__Group__5__Impl : ( ( rule__ImageObject__Group_5__0 )? ) ;
    public final void rule__ImageObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6358:1: ( ( ( rule__ImageObject__Group_5__0 )? ) )
            // InternalPdfMk.g:6359:1: ( ( rule__ImageObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:6359:1: ( ( rule__ImageObject__Group_5__0 )? )
            // InternalPdfMk.g:6360:2: ( rule__ImageObject__Group_5__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6361:2: ( rule__ImageObject__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==36) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalPdfMk.g:6361:3: rule__ImageObject__Group_5__0
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
    // InternalPdfMk.g:6369:1: rule__ImageObject__Group__6 : rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 ;
    public final void rule__ImageObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6373:1: ( rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 )
            // InternalPdfMk.g:6374:2: rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6381:1: rule__ImageObject__Group__6__Impl : ( ( rule__ImageObject__Group_6__0 )? ) ;
    public final void rule__ImageObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6385:1: ( ( ( rule__ImageObject__Group_6__0 )? ) )
            // InternalPdfMk.g:6386:1: ( ( rule__ImageObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:6386:1: ( ( rule__ImageObject__Group_6__0 )? )
            // InternalPdfMk.g:6387:2: ( rule__ImageObject__Group_6__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:6388:2: ( rule__ImageObject__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPdfMk.g:6388:3: rule__ImageObject__Group_6__0
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
    // InternalPdfMk.g:6396:1: rule__ImageObject__Group__7 : rule__ImageObject__Group__7__Impl ;
    public final void rule__ImageObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6400:1: ( rule__ImageObject__Group__7__Impl )
            // InternalPdfMk.g:6401:2: rule__ImageObject__Group__7__Impl
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
    // InternalPdfMk.g:6407:1: rule__ImageObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ImageObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6411:1: ( ( '}' ) )
            // InternalPdfMk.g:6412:1: ( '}' )
            {
            // InternalPdfMk.g:6412:1: ( '}' )
            // InternalPdfMk.g:6413:2: '}'
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
    // InternalPdfMk.g:6423:1: rule__ImageObject__Group_2__0 : rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 ;
    public final void rule__ImageObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6427:1: ( rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 )
            // InternalPdfMk.g:6428:2: rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPdfMk.g:6435:1: rule__ImageObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6439:1: ( ( ',' ) )
            // InternalPdfMk.g:6440:1: ( ',' )
            {
            // InternalPdfMk.g:6440:1: ( ',' )
            // InternalPdfMk.g:6441:2: ','
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
    // InternalPdfMk.g:6450:1: rule__ImageObject__Group_2__1 : rule__ImageObject__Group_2__1__Impl ;
    public final void rule__ImageObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6454:1: ( rule__ImageObject__Group_2__1__Impl )
            // InternalPdfMk.g:6455:2: rule__ImageObject__Group_2__1__Impl
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
    // InternalPdfMk.g:6461:1: rule__ImageObject__Group_2__1__Impl : ( ( rule__ImageObject__WidthAssignment_2_1 ) ) ;
    public final void rule__ImageObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6465:1: ( ( ( rule__ImageObject__WidthAssignment_2_1 ) ) )
            // InternalPdfMk.g:6466:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            {
            // InternalPdfMk.g:6466:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            // InternalPdfMk.g:6467:2: ( rule__ImageObject__WidthAssignment_2_1 )
            {
             before(grammarAccess.getImageObjectAccess().getWidthAssignment_2_1()); 
            // InternalPdfMk.g:6468:2: ( rule__ImageObject__WidthAssignment_2_1 )
            // InternalPdfMk.g:6468:3: rule__ImageObject__WidthAssignment_2_1
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
    // InternalPdfMk.g:6477:1: rule__ImageObject__Group_3__0 : rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 ;
    public final void rule__ImageObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6481:1: ( rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 )
            // InternalPdfMk.g:6482:2: rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPdfMk.g:6489:1: rule__ImageObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6493:1: ( ( ',' ) )
            // InternalPdfMk.g:6494:1: ( ',' )
            {
            // InternalPdfMk.g:6494:1: ( ',' )
            // InternalPdfMk.g:6495:2: ','
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
    // InternalPdfMk.g:6504:1: rule__ImageObject__Group_3__1 : rule__ImageObject__Group_3__1__Impl ;
    public final void rule__ImageObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6508:1: ( rule__ImageObject__Group_3__1__Impl )
            // InternalPdfMk.g:6509:2: rule__ImageObject__Group_3__1__Impl
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
    // InternalPdfMk.g:6515:1: rule__ImageObject__Group_3__1__Impl : ( ( rule__ImageObject__HeightAssignment_3_1 ) ) ;
    public final void rule__ImageObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6519:1: ( ( ( rule__ImageObject__HeightAssignment_3_1 ) ) )
            // InternalPdfMk.g:6520:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            {
            // InternalPdfMk.g:6520:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            // InternalPdfMk.g:6521:2: ( rule__ImageObject__HeightAssignment_3_1 )
            {
             before(grammarAccess.getImageObjectAccess().getHeightAssignment_3_1()); 
            // InternalPdfMk.g:6522:2: ( rule__ImageObject__HeightAssignment_3_1 )
            // InternalPdfMk.g:6522:3: rule__ImageObject__HeightAssignment_3_1
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
    // InternalPdfMk.g:6531:1: rule__ImageObject__Group_4__0 : rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 ;
    public final void rule__ImageObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6535:1: ( rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 )
            // InternalPdfMk.g:6536:2: rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPdfMk.g:6543:1: rule__ImageObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6547:1: ( ( ',' ) )
            // InternalPdfMk.g:6548:1: ( ',' )
            {
            // InternalPdfMk.g:6548:1: ( ',' )
            // InternalPdfMk.g:6549:2: ','
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
    // InternalPdfMk.g:6558:1: rule__ImageObject__Group_4__1 : rule__ImageObject__Group_4__1__Impl ;
    public final void rule__ImageObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6562:1: ( rule__ImageObject__Group_4__1__Impl )
            // InternalPdfMk.g:6563:2: rule__ImageObject__Group_4__1__Impl
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
    // InternalPdfMk.g:6569:1: rule__ImageObject__Group_4__1__Impl : ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) ;
    public final void rule__ImageObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6573:1: ( ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) )
            // InternalPdfMk.g:6574:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            {
            // InternalPdfMk.g:6574:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            // InternalPdfMk.g:6575:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            {
             before(grammarAccess.getImageObjectAccess().getOpacityAssignment_4_1()); 
            // InternalPdfMk.g:6576:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            // InternalPdfMk.g:6576:3: rule__ImageObject__OpacityAssignment_4_1
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
    // InternalPdfMk.g:6585:1: rule__ImageObject__Group_5__0 : rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 ;
    public final void rule__ImageObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6589:1: ( rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 )
            // InternalPdfMk.g:6590:2: rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPdfMk.g:6597:1: rule__ImageObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6601:1: ( ( ',' ) )
            // InternalPdfMk.g:6602:1: ( ',' )
            {
            // InternalPdfMk.g:6602:1: ( ',' )
            // InternalPdfMk.g:6603:2: ','
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
    // InternalPdfMk.g:6612:1: rule__ImageObject__Group_5__1 : rule__ImageObject__Group_5__1__Impl ;
    public final void rule__ImageObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6616:1: ( rule__ImageObject__Group_5__1__Impl )
            // InternalPdfMk.g:6617:2: rule__ImageObject__Group_5__1__Impl
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
    // InternalPdfMk.g:6623:1: rule__ImageObject__Group_5__1__Impl : ( ( rule__ImageObject__FitAssignment_5_1 ) ) ;
    public final void rule__ImageObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6627:1: ( ( ( rule__ImageObject__FitAssignment_5_1 ) ) )
            // InternalPdfMk.g:6628:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            {
            // InternalPdfMk.g:6628:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            // InternalPdfMk.g:6629:2: ( rule__ImageObject__FitAssignment_5_1 )
            {
             before(grammarAccess.getImageObjectAccess().getFitAssignment_5_1()); 
            // InternalPdfMk.g:6630:2: ( rule__ImageObject__FitAssignment_5_1 )
            // InternalPdfMk.g:6630:3: rule__ImageObject__FitAssignment_5_1
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
    // InternalPdfMk.g:6639:1: rule__ImageObject__Group_6__0 : rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 ;
    public final void rule__ImageObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6643:1: ( rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 )
            // InternalPdfMk.g:6644:2: rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPdfMk.g:6651:1: rule__ImageObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6655:1: ( ( ',' ) )
            // InternalPdfMk.g:6656:1: ( ',' )
            {
            // InternalPdfMk.g:6656:1: ( ',' )
            // InternalPdfMk.g:6657:2: ','
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
    // InternalPdfMk.g:6666:1: rule__ImageObject__Group_6__1 : rule__ImageObject__Group_6__1__Impl ;
    public final void rule__ImageObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6670:1: ( rule__ImageObject__Group_6__1__Impl )
            // InternalPdfMk.g:6671:2: rule__ImageObject__Group_6__1__Impl
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
    // InternalPdfMk.g:6677:1: rule__ImageObject__Group_6__1__Impl : ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) ;
    public final void rule__ImageObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6681:1: ( ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) )
            // InternalPdfMk.g:6682:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            {
            // InternalPdfMk.g:6682:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            // InternalPdfMk.g:6683:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            {
             before(grammarAccess.getImageObjectAccess().getPageBreakAssignment_6_1()); 
            // InternalPdfMk.g:6684:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            // InternalPdfMk.g:6684:3: rule__ImageObject__PageBreakAssignment_6_1
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
    // InternalPdfMk.g:6693:1: rule__ListObject__Group__0 : rule__ListObject__Group__0__Impl rule__ListObject__Group__1 ;
    public final void rule__ListObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6697:1: ( rule__ListObject__Group__0__Impl rule__ListObject__Group__1 )
            // InternalPdfMk.g:6698:2: rule__ListObject__Group__0__Impl rule__ListObject__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPdfMk.g:6705:1: rule__ListObject__Group__0__Impl : ( ( rule__ListObject__ValueAssignment_0 ) ) ;
    public final void rule__ListObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6709:1: ( ( ( rule__ListObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6710:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6710:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6711:2: ( rule__ListObject__ValueAssignment_0 )
            {
             before(grammarAccess.getListObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6712:2: ( rule__ListObject__ValueAssignment_0 )
            // InternalPdfMk.g:6712:3: rule__ListObject__ValueAssignment_0
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
    // InternalPdfMk.g:6720:1: rule__ListObject__Group__1 : rule__ListObject__Group__1__Impl rule__ListObject__Group__2 ;
    public final void rule__ListObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6724:1: ( rule__ListObject__Group__1__Impl rule__ListObject__Group__2 )
            // InternalPdfMk.g:6725:2: rule__ListObject__Group__1__Impl rule__ListObject__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalPdfMk.g:6732:1: rule__ListObject__Group__1__Impl : ( ( rule__ListObject__Group_1__0 )? ) ;
    public final void rule__ListObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6736:1: ( ( ( rule__ListObject__Group_1__0 )? ) )
            // InternalPdfMk.g:6737:1: ( ( rule__ListObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:6737:1: ( ( rule__ListObject__Group_1__0 )? )
            // InternalPdfMk.g:6738:2: ( rule__ListObject__Group_1__0 )?
            {
             before(grammarAccess.getListObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:6739:2: ( rule__ListObject__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=38 && LA42_0<=42)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPdfMk.g:6739:3: rule__ListObject__Group_1__0
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
    // InternalPdfMk.g:6747:1: rule__ListObject__Group__2 : rule__ListObject__Group__2__Impl rule__ListObject__Group__3 ;
    public final void rule__ListObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6751:1: ( rule__ListObject__Group__2__Impl rule__ListObject__Group__3 )
            // InternalPdfMk.g:6752:2: rule__ListObject__Group__2__Impl rule__ListObject__Group__3
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
    // InternalPdfMk.g:6759:1: rule__ListObject__Group__2__Impl : ( ( rule__ListObject__Alternatives_2 ) ) ;
    public final void rule__ListObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6763:1: ( ( ( rule__ListObject__Alternatives_2 ) ) )
            // InternalPdfMk.g:6764:1: ( ( rule__ListObject__Alternatives_2 ) )
            {
            // InternalPdfMk.g:6764:1: ( ( rule__ListObject__Alternatives_2 ) )
            // InternalPdfMk.g:6765:2: ( rule__ListObject__Alternatives_2 )
            {
             before(grammarAccess.getListObjectAccess().getAlternatives_2()); 
            // InternalPdfMk.g:6766:2: ( rule__ListObject__Alternatives_2 )
            // InternalPdfMk.g:6766:3: rule__ListObject__Alternatives_2
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
    // InternalPdfMk.g:6774:1: rule__ListObject__Group__3 : rule__ListObject__Group__3__Impl rule__ListObject__Group__4 ;
    public final void rule__ListObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6778:1: ( rule__ListObject__Group__3__Impl rule__ListObject__Group__4 )
            // InternalPdfMk.g:6779:2: rule__ListObject__Group__3__Impl rule__ListObject__Group__4
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
    // InternalPdfMk.g:6786:1: rule__ListObject__Group__3__Impl : ( ':' ) ;
    public final void rule__ListObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6790:1: ( ( ':' ) )
            // InternalPdfMk.g:6791:1: ( ':' )
            {
            // InternalPdfMk.g:6791:1: ( ':' )
            // InternalPdfMk.g:6792:2: ':'
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
    // InternalPdfMk.g:6801:1: rule__ListObject__Group__4 : rule__ListObject__Group__4__Impl rule__ListObject__Group__5 ;
    public final void rule__ListObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6805:1: ( rule__ListObject__Group__4__Impl rule__ListObject__Group__5 )
            // InternalPdfMk.g:6806:2: rule__ListObject__Group__4__Impl rule__ListObject__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalPdfMk.g:6813:1: rule__ListObject__Group__4__Impl : ( '[' ) ;
    public final void rule__ListObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6817:1: ( ( '[' ) )
            // InternalPdfMk.g:6818:1: ( '[' )
            {
            // InternalPdfMk.g:6818:1: ( '[' )
            // InternalPdfMk.g:6819:2: '['
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
    // InternalPdfMk.g:6828:1: rule__ListObject__Group__5 : rule__ListObject__Group__5__Impl rule__ListObject__Group__6 ;
    public final void rule__ListObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6832:1: ( rule__ListObject__Group__5__Impl rule__ListObject__Group__6 )
            // InternalPdfMk.g:6833:2: rule__ListObject__Group__5__Impl rule__ListObject__Group__6
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
    // InternalPdfMk.g:6840:1: rule__ListObject__Group__5__Impl : ( ( rule__ListObject__Group_5__0 ) ) ;
    public final void rule__ListObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6844:1: ( ( ( rule__ListObject__Group_5__0 ) ) )
            // InternalPdfMk.g:6845:1: ( ( rule__ListObject__Group_5__0 ) )
            {
            // InternalPdfMk.g:6845:1: ( ( rule__ListObject__Group_5__0 ) )
            // InternalPdfMk.g:6846:2: ( rule__ListObject__Group_5__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6847:2: ( rule__ListObject__Group_5__0 )
            // InternalPdfMk.g:6847:3: rule__ListObject__Group_5__0
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
    // InternalPdfMk.g:6855:1: rule__ListObject__Group__6 : rule__ListObject__Group__6__Impl rule__ListObject__Group__7 ;
    public final void rule__ListObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6859:1: ( rule__ListObject__Group__6__Impl rule__ListObject__Group__7 )
            // InternalPdfMk.g:6860:2: rule__ListObject__Group__6__Impl rule__ListObject__Group__7
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
    // InternalPdfMk.g:6867:1: rule__ListObject__Group__6__Impl : ( ']' ) ;
    public final void rule__ListObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6871:1: ( ( ']' ) )
            // InternalPdfMk.g:6872:1: ( ']' )
            {
            // InternalPdfMk.g:6872:1: ( ']' )
            // InternalPdfMk.g:6873:2: ']'
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
    // InternalPdfMk.g:6882:1: rule__ListObject__Group__7 : rule__ListObject__Group__7__Impl ;
    public final void rule__ListObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6886:1: ( rule__ListObject__Group__7__Impl )
            // InternalPdfMk.g:6887:2: rule__ListObject__Group__7__Impl
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
    // InternalPdfMk.g:6893:1: rule__ListObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ListObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6897:1: ( ( '}' ) )
            // InternalPdfMk.g:6898:1: ( '}' )
            {
            // InternalPdfMk.g:6898:1: ( '}' )
            // InternalPdfMk.g:6899:2: '}'
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
    // InternalPdfMk.g:6909:1: rule__ListObject__Group_1__0 : rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 ;
    public final void rule__ListObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6913:1: ( rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 )
            // InternalPdfMk.g:6914:2: rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1
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
    // InternalPdfMk.g:6921:1: rule__ListObject__Group_1__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) ;
    public final void rule__ListObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6925:1: ( ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) )
            // InternalPdfMk.g:6926:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            {
            // InternalPdfMk.g:6926:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            // InternalPdfMk.g:6927:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_0()); 
            // InternalPdfMk.g:6928:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            // InternalPdfMk.g:6928:3: rule__ListObject__PropertiesAssignment_1_0
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
    // InternalPdfMk.g:6936:1: rule__ListObject__Group_1__1 : rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 ;
    public final void rule__ListObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6940:1: ( rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 )
            // InternalPdfMk.g:6941:2: rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalPdfMk.g:6948:1: rule__ListObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6952:1: ( ( ',' ) )
            // InternalPdfMk.g:6953:1: ( ',' )
            {
            // InternalPdfMk.g:6953:1: ( ',' )
            // InternalPdfMk.g:6954:2: ','
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
    // InternalPdfMk.g:6963:1: rule__ListObject__Group_1__2 : rule__ListObject__Group_1__2__Impl ;
    public final void rule__ListObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6967:1: ( rule__ListObject__Group_1__2__Impl )
            // InternalPdfMk.g:6968:2: rule__ListObject__Group_1__2__Impl
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
    // InternalPdfMk.g:6974:1: rule__ListObject__Group_1__2__Impl : ( ( rule__ListObject__Group_1_2__0 )* ) ;
    public final void rule__ListObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6978:1: ( ( ( rule__ListObject__Group_1_2__0 )* ) )
            // InternalPdfMk.g:6979:1: ( ( rule__ListObject__Group_1_2__0 )* )
            {
            // InternalPdfMk.g:6979:1: ( ( rule__ListObject__Group_1_2__0 )* )
            // InternalPdfMk.g:6980:2: ( rule__ListObject__Group_1_2__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_1_2()); 
            // InternalPdfMk.g:6981:2: ( rule__ListObject__Group_1_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=38 && LA43_0<=42)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPdfMk.g:6981:3: rule__ListObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__ListObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalPdfMk.g:6990:1: rule__ListObject__Group_1_2__0 : rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 ;
    public final void rule__ListObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6994:1: ( rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 )
            // InternalPdfMk.g:6995:2: rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1
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
    // InternalPdfMk.g:7002:1: rule__ListObject__Group_1_2__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) ;
    public final void rule__ListObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7006:1: ( ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) )
            // InternalPdfMk.g:7007:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            {
            // InternalPdfMk.g:7007:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            // InternalPdfMk.g:7008:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_2_0()); 
            // InternalPdfMk.g:7009:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            // InternalPdfMk.g:7009:3: rule__ListObject__PropertiesAssignment_1_2_0
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
    // InternalPdfMk.g:7017:1: rule__ListObject__Group_1_2__1 : rule__ListObject__Group_1_2__1__Impl ;
    public final void rule__ListObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7021:1: ( rule__ListObject__Group_1_2__1__Impl )
            // InternalPdfMk.g:7022:2: rule__ListObject__Group_1_2__1__Impl
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
    // InternalPdfMk.g:7028:1: rule__ListObject__Group_1_2__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7032:1: ( ( ',' ) )
            // InternalPdfMk.g:7033:1: ( ',' )
            {
            // InternalPdfMk.g:7033:1: ( ',' )
            // InternalPdfMk.g:7034:2: ','
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
    // InternalPdfMk.g:7044:1: rule__ListObject__Group_5__0 : rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 ;
    public final void rule__ListObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7048:1: ( rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 )
            // InternalPdfMk.g:7049:2: rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPdfMk.g:7056:1: rule__ListObject__Group_5__0__Impl : ( ( rule__ListObject__ElementsAssignment_5_0 )? ) ;
    public final void rule__ListObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7060:1: ( ( ( rule__ListObject__ElementsAssignment_5_0 )? ) )
            // InternalPdfMk.g:7061:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            {
            // InternalPdfMk.g:7061:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            // InternalPdfMk.g:7062:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            {
             before(grammarAccess.getListObjectAccess().getElementsAssignment_5_0()); 
            // InternalPdfMk.g:7063:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING||LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPdfMk.g:7063:3: rule__ListObject__ElementsAssignment_5_0
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
    // InternalPdfMk.g:7071:1: rule__ListObject__Group_5__1 : rule__ListObject__Group_5__1__Impl ;
    public final void rule__ListObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7075:1: ( rule__ListObject__Group_5__1__Impl )
            // InternalPdfMk.g:7076:2: rule__ListObject__Group_5__1__Impl
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
    // InternalPdfMk.g:7082:1: rule__ListObject__Group_5__1__Impl : ( ( rule__ListObject__Group_5_1__0 )* ) ;
    public final void rule__ListObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7086:1: ( ( ( rule__ListObject__Group_5_1__0 )* ) )
            // InternalPdfMk.g:7087:1: ( ( rule__ListObject__Group_5_1__0 )* )
            {
            // InternalPdfMk.g:7087:1: ( ( rule__ListObject__Group_5_1__0 )* )
            // InternalPdfMk.g:7088:2: ( rule__ListObject__Group_5_1__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_5_1()); 
            // InternalPdfMk.g:7089:2: ( rule__ListObject__Group_5_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==20) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPdfMk.g:7089:3: rule__ListObject__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ListObject__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPdfMk.g:7098:1: rule__ListObject__Group_5_1__0 : rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 ;
    public final void rule__ListObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7102:1: ( rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 )
            // InternalPdfMk.g:7103:2: rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1
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
    // InternalPdfMk.g:7110:1: rule__ListObject__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7114:1: ( ( ',' ) )
            // InternalPdfMk.g:7115:1: ( ',' )
            {
            // InternalPdfMk.g:7115:1: ( ',' )
            // InternalPdfMk.g:7116:2: ','
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
    // InternalPdfMk.g:7125:1: rule__ListObject__Group_5_1__1 : rule__ListObject__Group_5_1__1__Impl ;
    public final void rule__ListObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7129:1: ( rule__ListObject__Group_5_1__1__Impl )
            // InternalPdfMk.g:7130:2: rule__ListObject__Group_5_1__1__Impl
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
    // InternalPdfMk.g:7136:1: rule__ListObject__Group_5_1__1__Impl : ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) ;
    public final void rule__ListObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7140:1: ( ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) )
            // InternalPdfMk.g:7141:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            {
            // InternalPdfMk.g:7141:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            // InternalPdfMk.g:7142:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            {
             before(grammarAccess.getListObjectAccess().getElemtensAssignment_5_1_1()); 
            // InternalPdfMk.g:7143:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            // InternalPdfMk.g:7143:3: rule__ListObject__ElemtensAssignment_5_1_1
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
    // InternalPdfMk.g:7152:1: rule__TableObject__Group__0 : rule__TableObject__Group__0__Impl rule__TableObject__Group__1 ;
    public final void rule__TableObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7156:1: ( rule__TableObject__Group__0__Impl rule__TableObject__Group__1 )
            // InternalPdfMk.g:7157:2: rule__TableObject__Group__0__Impl rule__TableObject__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalPdfMk.g:7164:1: rule__TableObject__Group__0__Impl : ( ( rule__TableObject__ValueAssignment_0 ) ) ;
    public final void rule__TableObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7168:1: ( ( ( rule__TableObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:7169:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:7169:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:7170:2: ( rule__TableObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTableObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:7171:2: ( rule__TableObject__ValueAssignment_0 )
            // InternalPdfMk.g:7171:3: rule__TableObject__ValueAssignment_0
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
    // InternalPdfMk.g:7179:1: rule__TableObject__Group__1 : rule__TableObject__Group__1__Impl rule__TableObject__Group__2 ;
    public final void rule__TableObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7183:1: ( rule__TableObject__Group__1__Impl rule__TableObject__Group__2 )
            // InternalPdfMk.g:7184:2: rule__TableObject__Group__1__Impl rule__TableObject__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalPdfMk.g:7191:1: rule__TableObject__Group__1__Impl : ( ( rule__TableObject__Group_1__0 )? ) ;
    public final void rule__TableObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7195:1: ( ( ( rule__TableObject__Group_1__0 )? ) )
            // InternalPdfMk.g:7196:1: ( ( rule__TableObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:7196:1: ( ( rule__TableObject__Group_1__0 )? )
            // InternalPdfMk.g:7197:2: ( rule__TableObject__Group_1__0 )?
            {
             before(grammarAccess.getTableObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:7198:2: ( rule__TableObject__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPdfMk.g:7198:3: rule__TableObject__Group_1__0
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
    // InternalPdfMk.g:7206:1: rule__TableObject__Group__2 : rule__TableObject__Group__2__Impl rule__TableObject__Group__3 ;
    public final void rule__TableObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7210:1: ( rule__TableObject__Group__2__Impl rule__TableObject__Group__3 )
            // InternalPdfMk.g:7211:2: rule__TableObject__Group__2__Impl rule__TableObject__Group__3
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
    // InternalPdfMk.g:7218:1: rule__TableObject__Group__2__Impl : ( ( rule__TableObject__TableAssignment_2 ) ) ;
    public final void rule__TableObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7222:1: ( ( ( rule__TableObject__TableAssignment_2 ) ) )
            // InternalPdfMk.g:7223:1: ( ( rule__TableObject__TableAssignment_2 ) )
            {
            // InternalPdfMk.g:7223:1: ( ( rule__TableObject__TableAssignment_2 ) )
            // InternalPdfMk.g:7224:2: ( rule__TableObject__TableAssignment_2 )
            {
             before(grammarAccess.getTableObjectAccess().getTableAssignment_2()); 
            // InternalPdfMk.g:7225:2: ( rule__TableObject__TableAssignment_2 )
            // InternalPdfMk.g:7225:3: rule__TableObject__TableAssignment_2
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
    // InternalPdfMk.g:7233:1: rule__TableObject__Group__3 : rule__TableObject__Group__3__Impl ;
    public final void rule__TableObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7237:1: ( rule__TableObject__Group__3__Impl )
            // InternalPdfMk.g:7238:2: rule__TableObject__Group__3__Impl
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
    // InternalPdfMk.g:7244:1: rule__TableObject__Group__3__Impl : ( '}' ) ;
    public final void rule__TableObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7248:1: ( ( '}' ) )
            // InternalPdfMk.g:7249:1: ( '}' )
            {
            // InternalPdfMk.g:7249:1: ( '}' )
            // InternalPdfMk.g:7250:2: '}'
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
    // InternalPdfMk.g:7260:1: rule__TableObject__Group_1__0 : rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 ;
    public final void rule__TableObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7264:1: ( rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 )
            // InternalPdfMk.g:7265:2: rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1
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
    // InternalPdfMk.g:7272:1: rule__TableObject__Group_1__0__Impl : ( ( rule__TableObject__StyleAssignment_1_0 ) ) ;
    public final void rule__TableObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7276:1: ( ( ( rule__TableObject__StyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:7277:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7277:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            // InternalPdfMk.g:7278:2: ( rule__TableObject__StyleAssignment_1_0 )
            {
             before(grammarAccess.getTableObjectAccess().getStyleAssignment_1_0()); 
            // InternalPdfMk.g:7279:2: ( rule__TableObject__StyleAssignment_1_0 )
            // InternalPdfMk.g:7279:3: rule__TableObject__StyleAssignment_1_0
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
    // InternalPdfMk.g:7287:1: rule__TableObject__Group_1__1 : rule__TableObject__Group_1__1__Impl ;
    public final void rule__TableObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7291:1: ( rule__TableObject__Group_1__1__Impl )
            // InternalPdfMk.g:7292:2: rule__TableObject__Group_1__1__Impl
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
    // InternalPdfMk.g:7298:1: rule__TableObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__TableObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7302:1: ( ( ',' ) )
            // InternalPdfMk.g:7303:1: ( ',' )
            {
            // InternalPdfMk.g:7303:1: ( ',' )
            // InternalPdfMk.g:7304:2: ','
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
    // InternalPdfMk.g:7314:1: rule__ContentObjects__Group__0 : rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 ;
    public final void rule__ContentObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7318:1: ( rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 )
            // InternalPdfMk.g:7319:2: rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1
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
    // InternalPdfMk.g:7326:1: rule__ContentObjects__Group__0__Impl : ( () ) ;
    public final void rule__ContentObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7330:1: ( ( () ) )
            // InternalPdfMk.g:7331:1: ( () )
            {
            // InternalPdfMk.g:7331:1: ( () )
            // InternalPdfMk.g:7332:2: ()
            {
             before(grammarAccess.getContentObjectsAccess().getContentObjectsAction_0()); 
            // InternalPdfMk.g:7333:2: ()
            // InternalPdfMk.g:7333:3: 
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
    // InternalPdfMk.g:7341:1: rule__ContentObjects__Group__1 : rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 ;
    public final void rule__ContentObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7345:1: ( rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 )
            // InternalPdfMk.g:7346:2: rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalPdfMk.g:7353:1: rule__ContentObjects__Group__1__Impl : ( '[' ) ;
    public final void rule__ContentObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7357:1: ( ( '[' ) )
            // InternalPdfMk.g:7358:1: ( '[' )
            {
            // InternalPdfMk.g:7358:1: ( '[' )
            // InternalPdfMk.g:7359:2: '['
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
    // InternalPdfMk.g:7368:1: rule__ContentObjects__Group__2 : rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3 ;
    public final void rule__ContentObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7372:1: ( rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3 )
            // InternalPdfMk.g:7373:2: rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalPdfMk.g:7380:1: rule__ContentObjects__Group__2__Impl : ( ( rule__ContentObjects__Group_2__0 )? ) ;
    public final void rule__ContentObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7384:1: ( ( ( rule__ContentObjects__Group_2__0 )? ) )
            // InternalPdfMk.g:7385:1: ( ( rule__ContentObjects__Group_2__0 )? )
            {
            // InternalPdfMk.g:7385:1: ( ( rule__ContentObjects__Group_2__0 )? )
            // InternalPdfMk.g:7386:2: ( rule__ContentObjects__Group_2__0 )?
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_2()); 
            // InternalPdfMk.g:7387:2: ( rule__ContentObjects__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING||LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPdfMk.g:7387:3: rule__ContentObjects__Group_2__0
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
    // InternalPdfMk.g:7395:1: rule__ContentObjects__Group__3 : rule__ContentObjects__Group__3__Impl ;
    public final void rule__ContentObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7399:1: ( rule__ContentObjects__Group__3__Impl )
            // InternalPdfMk.g:7400:2: rule__ContentObjects__Group__3__Impl
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
    // InternalPdfMk.g:7406:1: rule__ContentObjects__Group__3__Impl : ( ']' ) ;
    public final void rule__ContentObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7410:1: ( ( ']' ) )
            // InternalPdfMk.g:7411:1: ( ']' )
            {
            // InternalPdfMk.g:7411:1: ( ']' )
            // InternalPdfMk.g:7412:2: ']'
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
    // InternalPdfMk.g:7422:1: rule__ContentObjects__Group_2__0 : rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1 ;
    public final void rule__ContentObjects__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7426:1: ( rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1 )
            // InternalPdfMk.g:7427:2: rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1
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
    // InternalPdfMk.g:7434:1: rule__ContentObjects__Group_2__0__Impl : ( ( rule__ContentObjects__ValueAssignment_2_0 ) ) ;
    public final void rule__ContentObjects__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7438:1: ( ( ( rule__ContentObjects__ValueAssignment_2_0 ) ) )
            // InternalPdfMk.g:7439:1: ( ( rule__ContentObjects__ValueAssignment_2_0 ) )
            {
            // InternalPdfMk.g:7439:1: ( ( rule__ContentObjects__ValueAssignment_2_0 ) )
            // InternalPdfMk.g:7440:2: ( rule__ContentObjects__ValueAssignment_2_0 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_2_0()); 
            // InternalPdfMk.g:7441:2: ( rule__ContentObjects__ValueAssignment_2_0 )
            // InternalPdfMk.g:7441:3: rule__ContentObjects__ValueAssignment_2_0
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
    // InternalPdfMk.g:7449:1: rule__ContentObjects__Group_2__1 : rule__ContentObjects__Group_2__1__Impl ;
    public final void rule__ContentObjects__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7453:1: ( rule__ContentObjects__Group_2__1__Impl )
            // InternalPdfMk.g:7454:2: rule__ContentObjects__Group_2__1__Impl
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
    // InternalPdfMk.g:7460:1: rule__ContentObjects__Group_2__1__Impl : ( ( rule__ContentObjects__Group_2_1__0 )* ) ;
    public final void rule__ContentObjects__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7464:1: ( ( ( rule__ContentObjects__Group_2_1__0 )* ) )
            // InternalPdfMk.g:7465:1: ( ( rule__ContentObjects__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:7465:1: ( ( rule__ContentObjects__Group_2_1__0 )* )
            // InternalPdfMk.g:7466:2: ( rule__ContentObjects__Group_2_1__0 )*
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_2_1()); 
            // InternalPdfMk.g:7467:2: ( rule__ContentObjects__Group_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPdfMk.g:7467:3: rule__ContentObjects__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ContentObjects__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalPdfMk.g:7476:1: rule__ContentObjects__Group_2_1__0 : rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1 ;
    public final void rule__ContentObjects__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7480:1: ( rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1 )
            // InternalPdfMk.g:7481:2: rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1
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
    // InternalPdfMk.g:7488:1: rule__ContentObjects__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ContentObjects__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7492:1: ( ( ',' ) )
            // InternalPdfMk.g:7493:1: ( ',' )
            {
            // InternalPdfMk.g:7493:1: ( ',' )
            // InternalPdfMk.g:7494:2: ','
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
    // InternalPdfMk.g:7503:1: rule__ContentObjects__Group_2_1__1 : rule__ContentObjects__Group_2_1__1__Impl ;
    public final void rule__ContentObjects__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7507:1: ( rule__ContentObjects__Group_2_1__1__Impl )
            // InternalPdfMk.g:7508:2: rule__ContentObjects__Group_2_1__1__Impl
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
    // InternalPdfMk.g:7514:1: rule__ContentObjects__Group_2_1__1__Impl : ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ContentObjects__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7518:1: ( ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:7519:1: ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:7519:1: ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) )
            // InternalPdfMk.g:7520:2: ( rule__ContentObjects__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_2_1_1()); 
            // InternalPdfMk.g:7521:2: ( rule__ContentObjects__ValueAssignment_2_1_1 )
            // InternalPdfMk.g:7521:3: rule__ContentObjects__ValueAssignment_2_1_1
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
    // InternalPdfMk.g:7530:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7534:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:7535:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
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
    // InternalPdfMk.g:7542:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7546:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:7547:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:7547:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:7548:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:7549:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:7549:3: rule__Styles__KeyAssignment_0
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
    // InternalPdfMk.g:7557:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7561:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:7562:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
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
    // InternalPdfMk.g:7569:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7573:1: ( ( ':' ) )
            // InternalPdfMk.g:7574:1: ( ':' )
            {
            // InternalPdfMk.g:7574:1: ( ':' )
            // InternalPdfMk.g:7575:2: ':'
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
    // InternalPdfMk.g:7584:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7588:1: ( rule__Styles__Group__2__Impl )
            // InternalPdfMk.g:7589:2: rule__Styles__Group__2__Impl
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
    // InternalPdfMk.g:7595:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7599:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:7600:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:7600:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:7601:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:7602:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:7602:3: rule__Styles__ValueAssignment_2
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
    // InternalPdfMk.g:7611:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7615:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:7616:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalPdfMk.g:7623:1: rule__Content__Group__0__Impl : ( ( rule__Content__KeyAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7627:1: ( ( ( rule__Content__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:7628:1: ( ( rule__Content__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:7628:1: ( ( rule__Content__KeyAssignment_0 ) )
            // InternalPdfMk.g:7629:2: ( rule__Content__KeyAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:7630:2: ( rule__Content__KeyAssignment_0 )
            // InternalPdfMk.g:7630:3: rule__Content__KeyAssignment_0
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
    // InternalPdfMk.g:7638:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7642:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:7643:2: rule__Content__Group__1__Impl rule__Content__Group__2
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
    // InternalPdfMk.g:7650:1: rule__Content__Group__1__Impl : ( ':' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7654:1: ( ( ':' ) )
            // InternalPdfMk.g:7655:1: ( ':' )
            {
            // InternalPdfMk.g:7655:1: ( ':' )
            // InternalPdfMk.g:7656:2: ':'
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
    // InternalPdfMk.g:7665:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7669:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:7670:2: rule__Content__Group__2__Impl
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
    // InternalPdfMk.g:7676:1: rule__Content__Group__2__Impl : ( ( rule__Content__ValueAssignment_2 ) ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7680:1: ( ( ( rule__Content__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:7681:1: ( ( rule__Content__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:7681:1: ( ( rule__Content__ValueAssignment_2 ) )
            // InternalPdfMk.g:7682:2: ( rule__Content__ValueAssignment_2 )
            {
             before(grammarAccess.getContentAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:7683:2: ( rule__Content__ValueAssignment_2 )
            // InternalPdfMk.g:7683:3: rule__Content__ValueAssignment_2
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
    // InternalPdfMk.g:7692:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7696:1: ( ( ruleContent ) )
            // InternalPdfMk.g:7697:2: ( ruleContent )
            {
            // InternalPdfMk.g:7697:2: ( ruleContent )
            // InternalPdfMk.g:7698:3: ruleContent
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
    // InternalPdfMk.g:7707:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7711:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:7712:2: ( ruleStyles )
            {
            // InternalPdfMk.g:7712:2: ( ruleStyles )
            // InternalPdfMk.g:7713:3: ruleStyles
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
    // InternalPdfMk.g:7722:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7726:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7727:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7727:2: ( RULE_STRING )
            // InternalPdfMk.g:7728:3: RULE_STRING
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
    // InternalPdfMk.g:7737:1: rule__TypeFaceDefinition__KeyAssignment_0 : ( ( 'bold' ) ) ;
    public final void rule__TypeFaceDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7741:1: ( ( ( 'bold' ) ) )
            // InternalPdfMk.g:7742:2: ( ( 'bold' ) )
            {
            // InternalPdfMk.g:7742:2: ( ( 'bold' ) )
            // InternalPdfMk.g:7743:3: ( 'bold' )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            // InternalPdfMk.g:7744:3: ( 'bold' )
            // InternalPdfMk.g:7745:4: 'bold'
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
    // InternalPdfMk.g:7756:1: rule__TypeFaceDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__TypeFaceDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7760:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7761:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7761:2: ( ruleBooleanType )
            // InternalPdfMk.g:7762:3: ruleBooleanType
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
    // InternalPdfMk.g:7771:1: rule__TextStyleDefinition__KeyAssignment_0 : ( ( 'style' ) ) ;
    public final void rule__TextStyleDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7775:1: ( ( ( 'style' ) ) )
            // InternalPdfMk.g:7776:2: ( ( 'style' ) )
            {
            // InternalPdfMk.g:7776:2: ( ( 'style' ) )
            // InternalPdfMk.g:7777:3: ( 'style' )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            // InternalPdfMk.g:7778:3: ( 'style' )
            // InternalPdfMk.g:7779:4: 'style'
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
    // InternalPdfMk.g:7790:1: rule__TextStyleDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextStyleDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7794:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7795:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7795:2: ( RULE_STRING )
            // InternalPdfMk.g:7796:3: RULE_STRING
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
    // InternalPdfMk.g:7805:1: rule__TextDefinition__KeyAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__TextDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7809:1: ( ( ( 'text' ) ) )
            // InternalPdfMk.g:7810:2: ( ( 'text' ) )
            {
            // InternalPdfMk.g:7810:2: ( ( 'text' ) )
            // InternalPdfMk.g:7811:3: ( 'text' )
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 
            // InternalPdfMk.g:7812:3: ( 'text' )
            // InternalPdfMk.g:7813:4: 'text'
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
    // InternalPdfMk.g:7824:1: rule__TextDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7828:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7829:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7829:2: ( RULE_STRING )
            // InternalPdfMk.g:7830:3: RULE_STRING
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
    // InternalPdfMk.g:7839:1: rule__ItalicsDefinition__KeyAssignment_0 : ( ( 'italics' ) ) ;
    public final void rule__ItalicsDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7843:1: ( ( ( 'italics' ) ) )
            // InternalPdfMk.g:7844:2: ( ( 'italics' ) )
            {
            // InternalPdfMk.g:7844:2: ( ( 'italics' ) )
            // InternalPdfMk.g:7845:3: ( 'italics' )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            // InternalPdfMk.g:7846:3: ( 'italics' )
            // InternalPdfMk.g:7847:4: 'italics'
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
    // InternalPdfMk.g:7858:1: rule__ItalicsDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ItalicsDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7862:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7863:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7863:2: ( ruleBooleanType )
            // InternalPdfMk.g:7864:3: ruleBooleanType
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
    // InternalPdfMk.g:7873:1: rule__FontSizeDefinition__KeyAssignment_0 : ( ( 'fontSize' ) ) ;
    public final void rule__FontSizeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7877:1: ( ( ( 'fontSize' ) ) )
            // InternalPdfMk.g:7878:2: ( ( 'fontSize' ) )
            {
            // InternalPdfMk.g:7878:2: ( ( 'fontSize' ) )
            // InternalPdfMk.g:7879:3: ( 'fontSize' )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            // InternalPdfMk.g:7880:3: ( 'fontSize' )
            // InternalPdfMk.g:7881:4: 'fontSize'
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
    // InternalPdfMk.g:7892:1: rule__FontSizeDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FontSizeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7896:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7897:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7897:2: ( RULE_INT )
            // InternalPdfMk.g:7898:3: RULE_INT
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
    // InternalPdfMk.g:7907:1: rule__WidthDefinition__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__WidthDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7911:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:7912:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:7912:2: ( ( 'width' ) )
            // InternalPdfMk.g:7913:3: ( 'width' )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:7914:3: ( 'width' )
            // InternalPdfMk.g:7915:4: 'width'
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
    // InternalPdfMk.g:7926:1: rule__WidthDefinition__ValueAssignment_2 : ( ruleColumnTextWidthType ) ;
    public final void rule__WidthDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7930:1: ( ( ruleColumnTextWidthType ) )
            // InternalPdfMk.g:7931:2: ( ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:7931:2: ( ruleColumnTextWidthType )
            // InternalPdfMk.g:7932:3: ruleColumnTextWidthType
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
    // InternalPdfMk.g:7941:1: rule__ColumnDefinition__GlobalStyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__ColumnDefinition__GlobalStyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7945:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:7946:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:7946:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:7947:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:7956:1: rule__ColumnDefinition__KeyAssignment_2 : ( ( 'columns' ) ) ;
    public final void rule__ColumnDefinition__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7960:1: ( ( ( 'columns' ) ) )
            // InternalPdfMk.g:7961:2: ( ( 'columns' ) )
            {
            // InternalPdfMk.g:7961:2: ( ( 'columns' ) )
            // InternalPdfMk.g:7962:3: ( 'columns' )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 
            // InternalPdfMk.g:7963:3: ( 'columns' )
            // InternalPdfMk.g:7964:4: 'columns'
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
    // InternalPdfMk.g:7975:1: rule__ColumnDefinition__ValueAssignment_4_0 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7979:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:7980:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:7980:2: ( ruleColumnObject )
            // InternalPdfMk.g:7981:3: ruleColumnObject
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
    // InternalPdfMk.g:7990:1: rule__ColumnDefinition__ValueAssignment_4_1_1 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7994:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:7995:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:7995:2: ( ruleColumnObject )
            // InternalPdfMk.g:7996:3: ruleColumnObject
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
    // InternalPdfMk.g:8005:1: rule__MarginDefinition__KeyAssignment_0 : ( ( 'margin' ) ) ;
    public final void rule__MarginDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8009:1: ( ( ( 'margin' ) ) )
            // InternalPdfMk.g:8010:2: ( ( 'margin' ) )
            {
            // InternalPdfMk.g:8010:2: ( ( 'margin' ) )
            // InternalPdfMk.g:8011:3: ( 'margin' )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 
            // InternalPdfMk.g:8012:3: ( 'margin' )
            // InternalPdfMk.g:8013:4: 'margin'
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
    // InternalPdfMk.g:8024:1: rule__MarginDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8028:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8029:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8029:2: ( RULE_INT )
            // InternalPdfMk.g:8030:3: RULE_INT
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
    // InternalPdfMk.g:8039:1: rule__MarginDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8043:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8044:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8044:2: ( RULE_INT )
            // InternalPdfMk.g:8045:3: RULE_INT
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
    // InternalPdfMk.g:8054:1: rule__ImageDefintion__KeyAssignment_0 : ( ( 'image' ) ) ;
    public final void rule__ImageDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8058:1: ( ( ( 'image' ) ) )
            // InternalPdfMk.g:8059:2: ( ( 'image' ) )
            {
            // InternalPdfMk.g:8059:2: ( ( 'image' ) )
            // InternalPdfMk.g:8060:3: ( 'image' )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 
            // InternalPdfMk.g:8061:3: ( 'image' )
            // InternalPdfMk.g:8062:4: 'image'
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
    // InternalPdfMk.g:8073:1: rule__ImageDefintion__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8077:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8078:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8078:2: ( RULE_STRING )
            // InternalPdfMk.g:8079:3: RULE_STRING
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
    // InternalPdfMk.g:8088:1: rule__ImageWidthDefintion__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__ImageWidthDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8092:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:8093:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:8093:2: ( ( 'width' ) )
            // InternalPdfMk.g:8094:3: ( 'width' )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:8095:3: ( 'width' )
            // InternalPdfMk.g:8096:4: 'width'
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
    // InternalPdfMk.g:8107:1: rule__ImageWidthDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageWidthDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8111:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8112:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8112:2: ( RULE_INT )
            // InternalPdfMk.g:8113:3: RULE_INT
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
    // InternalPdfMk.g:8122:1: rule__ImageHeightDefintion__KeyAssignment_0 : ( ( 'height' ) ) ;
    public final void rule__ImageHeightDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8126:1: ( ( ( 'height' ) ) )
            // InternalPdfMk.g:8127:2: ( ( 'height' ) )
            {
            // InternalPdfMk.g:8127:2: ( ( 'height' ) )
            // InternalPdfMk.g:8128:3: ( 'height' )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 
            // InternalPdfMk.g:8129:3: ( 'height' )
            // InternalPdfMk.g:8130:4: 'height'
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
    // InternalPdfMk.g:8141:1: rule__ImageHeightDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageHeightDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8145:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8146:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8146:2: ( RULE_INT )
            // InternalPdfMk.g:8147:3: RULE_INT
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
    // InternalPdfMk.g:8156:1: rule__ImagePageBreakDefinition__KeyAssignment_0 : ( ( 'pageBreak' ) ) ;
    public final void rule__ImagePageBreakDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8160:1: ( ( ( 'pageBreak' ) ) )
            // InternalPdfMk.g:8161:2: ( ( 'pageBreak' ) )
            {
            // InternalPdfMk.g:8161:2: ( ( 'pageBreak' ) )
            // InternalPdfMk.g:8162:3: ( 'pageBreak' )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 
            // InternalPdfMk.g:8163:3: ( 'pageBreak' )
            // InternalPdfMk.g:8164:4: 'pageBreak'
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
    // InternalPdfMk.g:8175:1: rule__ImagePageBreakDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImagePageBreakDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8179:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8180:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8180:2: ( RULE_STRING )
            // InternalPdfMk.g:8181:3: RULE_STRING
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
    // InternalPdfMk.g:8190:1: rule__ImageFitDefinition__KeyAssignment_0 : ( ( 'fit' ) ) ;
    public final void rule__ImageFitDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8194:1: ( ( ( 'fit' ) ) )
            // InternalPdfMk.g:8195:2: ( ( 'fit' ) )
            {
            // InternalPdfMk.g:8195:2: ( ( 'fit' ) )
            // InternalPdfMk.g:8196:3: ( 'fit' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 
            // InternalPdfMk.g:8197:3: ( 'fit' )
            // InternalPdfMk.g:8198:4: 'fit'
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
    // InternalPdfMk.g:8209:1: rule__ImageFitDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__ImageFitDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8213:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8214:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8214:2: ( ( '[' ) )
            // InternalPdfMk.g:8215:3: ( '[' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:8216:3: ( '[' )
            // InternalPdfMk.g:8217:4: '['
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
    // InternalPdfMk.g:8228:1: rule__ImageFitDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8232:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8233:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8233:2: ( RULE_INT )
            // InternalPdfMk.g:8234:3: RULE_INT
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
    // InternalPdfMk.g:8243:1: rule__ImageFitDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8247:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8248:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8248:2: ( RULE_INT )
            // InternalPdfMk.g:8249:3: RULE_INT
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
    // InternalPdfMk.g:8258:1: rule__ImageOpacityDefinition__KeyAssignment_0 : ( ( 'opacity' ) ) ;
    public final void rule__ImageOpacityDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8262:1: ( ( ( 'opacity' ) ) )
            // InternalPdfMk.g:8263:2: ( ( 'opacity' ) )
            {
            // InternalPdfMk.g:8263:2: ( ( 'opacity' ) )
            // InternalPdfMk.g:8264:3: ( 'opacity' )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 
            // InternalPdfMk.g:8265:3: ( 'opacity' )
            // InternalPdfMk.g:8266:4: 'opacity'
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
    // InternalPdfMk.g:8277:1: rule__ImageOpacityDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageOpacityDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8281:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8282:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8282:2: ( RULE_INT )
            // InternalPdfMk.g:8283:3: RULE_INT
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
    // InternalPdfMk.g:8292:1: rule__ListReversedDefinition__KeyAssignment_0 : ( ( 'reversed' ) ) ;
    public final void rule__ListReversedDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8296:1: ( ( ( 'reversed' ) ) )
            // InternalPdfMk.g:8297:2: ( ( 'reversed' ) )
            {
            // InternalPdfMk.g:8297:2: ( ( 'reversed' ) )
            // InternalPdfMk.g:8298:3: ( 'reversed' )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 
            // InternalPdfMk.g:8299:3: ( 'reversed' )
            // InternalPdfMk.g:8300:4: 'reversed'
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
    // InternalPdfMk.g:8311:1: rule__ListReversedDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ListReversedDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8315:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8316:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8316:2: ( ruleBooleanType )
            // InternalPdfMk.g:8317:3: ruleBooleanType
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
    // InternalPdfMk.g:8326:1: rule__ListCounterDefinition__KeyAssignment_0 : ( ( 'counter' ) ) ;
    public final void rule__ListCounterDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8330:1: ( ( ( 'counter' ) ) )
            // InternalPdfMk.g:8331:2: ( ( 'counter' ) )
            {
            // InternalPdfMk.g:8331:2: ( ( 'counter' ) )
            // InternalPdfMk.g:8332:3: ( 'counter' )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 
            // InternalPdfMk.g:8333:3: ( 'counter' )
            // InternalPdfMk.g:8334:4: 'counter'
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
    // InternalPdfMk.g:8345:1: rule__ListCounterDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ListCounterDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8349:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8350:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8350:2: ( RULE_INT )
            // InternalPdfMk.g:8351:3: RULE_INT
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
    // InternalPdfMk.g:8360:1: rule__ListTypeDefinition__KeyAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__ListTypeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8364:1: ( ( ( 'type' ) ) )
            // InternalPdfMk.g:8365:2: ( ( 'type' ) )
            {
            // InternalPdfMk.g:8365:2: ( ( 'type' ) )
            // InternalPdfMk.g:8366:3: ( 'type' )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 
            // InternalPdfMk.g:8367:3: ( 'type' )
            // InternalPdfMk.g:8368:4: 'type'
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
    // InternalPdfMk.g:8379:1: rule__ListTypeDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListTypeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8383:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8384:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8384:2: ( RULE_STRING )
            // InternalPdfMk.g:8385:3: RULE_STRING
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
    // InternalPdfMk.g:8394:1: rule__ListColorDefinition__KeyAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ListColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8398:1: ( ( ( 'color' ) ) )
            // InternalPdfMk.g:8399:2: ( ( 'color' ) )
            {
            // InternalPdfMk.g:8399:2: ( ( 'color' ) )
            // InternalPdfMk.g:8400:3: ( 'color' )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 
            // InternalPdfMk.g:8401:3: ( 'color' )
            // InternalPdfMk.g:8402:4: 'color'
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
    // InternalPdfMk.g:8413:1: rule__ListColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8417:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8418:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8418:2: ( RULE_STRING )
            // InternalPdfMk.g:8419:3: RULE_STRING
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
    // InternalPdfMk.g:8428:1: rule__ListMarkerColorDefinition__KeyAssignment_0 : ( ( 'markerColor' ) ) ;
    public final void rule__ListMarkerColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8432:1: ( ( ( 'markerColor' ) ) )
            // InternalPdfMk.g:8433:2: ( ( 'markerColor' ) )
            {
            // InternalPdfMk.g:8433:2: ( ( 'markerColor' ) )
            // InternalPdfMk.g:8434:3: ( 'markerColor' )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 
            // InternalPdfMk.g:8435:3: ( 'markerColor' )
            // InternalPdfMk.g:8436:4: 'markerColor'
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
    // InternalPdfMk.g:8447:1: rule__ListMarkerColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListMarkerColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8451:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8452:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8452:2: ( RULE_STRING )
            // InternalPdfMk.g:8453:3: RULE_STRING
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
    // InternalPdfMk.g:8462:1: rule__TableCellItemElements__ElementsAssignment : ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) ;
    public final void rule__TableCellItemElements__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8466:1: ( ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) )
            // InternalPdfMk.g:8467:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            {
            // InternalPdfMk.g:8467:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            // InternalPdfMk.g:8468:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            {
             before(grammarAccess.getTableCellItemElementsAccess().getElementsAlternatives_0()); 
            // InternalPdfMk.g:8469:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            // InternalPdfMk.g:8469:4: rule__TableCellItemElements__ElementsAlternatives_0
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
    // InternalPdfMk.g:8477:1: rule__TableRowDefinition__ItemAssignment_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8481:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:8482:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:8482:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:8483:3: ruleTableCellItemElements
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
    // InternalPdfMk.g:8492:1: rule__TableRowDefinition__ItemAssignment_2_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8496:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:8497:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:8497:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:8498:3: ruleTableCellItemElements
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
    // InternalPdfMk.g:8507:1: rule__TableBodyDefinition__KeyAssignment_0 : ( ( 'body' ) ) ;
    public final void rule__TableBodyDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8511:1: ( ( ( 'body' ) ) )
            // InternalPdfMk.g:8512:2: ( ( 'body' ) )
            {
            // InternalPdfMk.g:8512:2: ( ( 'body' ) )
            // InternalPdfMk.g:8513:3: ( 'body' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 
            // InternalPdfMk.g:8514:3: ( 'body' )
            // InternalPdfMk.g:8515:4: 'body'
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
    // InternalPdfMk.g:8526:1: rule__TableBodyDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__TableBodyDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8530:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8531:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8531:2: ( ( '[' ) )
            // InternalPdfMk.g:8532:3: ( '[' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:8533:3: ( '[' )
            // InternalPdfMk.g:8534:4: '['
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
    // InternalPdfMk.g:8545:1: rule__TableBodyDefinition__RowsAssignment_3_0 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8549:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:8550:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:8550:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:8551:3: ruleTableRowDefinition
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
    // InternalPdfMk.g:8560:1: rule__TableBodyDefinition__RowsAssignment_3_1_1 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8564:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:8565:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:8565:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:8566:3: ruleTableRowDefinition
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
    // InternalPdfMk.g:8575:1: rule__TableDefinition__KeyAssignment_0 : ( ( 'table' ) ) ;
    public final void rule__TableDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8579:1: ( ( ( 'table' ) ) )
            // InternalPdfMk.g:8580:2: ( ( 'table' ) )
            {
            // InternalPdfMk.g:8580:2: ( ( 'table' ) )
            // InternalPdfMk.g:8581:3: ( 'table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 
            // InternalPdfMk.g:8582:3: ( 'table' )
            // InternalPdfMk.g:8583:4: 'table'
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
    // InternalPdfMk.g:8594:1: rule__TableDefinition__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__TableDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8598:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8599:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8599:2: ( ( '{' ) )
            // InternalPdfMk.g:8600:3: ( '{' )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:8601:3: ( '{' )
            // InternalPdfMk.g:8602:4: '{'
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
    // InternalPdfMk.g:8613:1: rule__TableDefinition__BodyAssignment_3 : ( ruleTableBodyDefinition ) ;
    public final void rule__TableDefinition__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8617:1: ( ( ruleTableBodyDefinition ) )
            // InternalPdfMk.g:8618:2: ( ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:8618:2: ( ruleTableBodyDefinition )
            // InternalPdfMk.g:8619:3: ruleTableBodyDefinition
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


    // $ANTLR start "rule__TextObject__MembersAssignment_1_0"
    // InternalPdfMk.g:8628:1: rule__TextObject__MembersAssignment_1_0 : ( ruleTextObjectMembersWrapper ) ;
    public final void rule__TextObject__MembersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8632:1: ( ( ruleTextObjectMembersWrapper ) )
            // InternalPdfMk.g:8633:2: ( ruleTextObjectMembersWrapper )
            {
            // InternalPdfMk.g:8633:2: ( ruleTextObjectMembersWrapper )
            // InternalPdfMk.g:8634:3: ruleTextObjectMembersWrapper
            {
             before(grammarAccess.getTextObjectAccess().getMembersTextObjectMembersWrapperParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getMembersTextObjectMembersWrapperParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__MembersAssignment_1_0"


    // $ANTLR start "rule__TextObject__MembersAssignment_1_1_1"
    // InternalPdfMk.g:8643:1: rule__TextObject__MembersAssignment_1_1_1 : ( ruleTextObjectMembersWrapper ) ;
    public final void rule__TextObject__MembersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8647:1: ( ( ruleTextObjectMembersWrapper ) )
            // InternalPdfMk.g:8648:2: ( ruleTextObjectMembersWrapper )
            {
            // InternalPdfMk.g:8648:2: ( ruleTextObjectMembersWrapper )
            // InternalPdfMk.g:8649:3: ruleTextObjectMembersWrapper
            {
             before(grammarAccess.getTextObjectAccess().getMembersTextObjectMembersWrapperParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getTextObjectAccess().getMembersTextObjectMembersWrapperParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextObject__MembersAssignment_1_1_1"


    // $ANTLR start "rule__ColumnTextObject__ValueAssignment"
    // InternalPdfMk.g:8658:1: rule__ColumnTextObject__ValueAssignment : ( ruleColumnDefinition ) ;
    public final void rule__ColumnTextObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8662:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8663:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8663:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8664:3: ruleColumnDefinition
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
    // InternalPdfMk.g:8673:1: rule__StyleObject__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StyleObject__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8677:1: ( ( RULE_ID ) )
            // InternalPdfMk.g:8678:2: ( RULE_ID )
            {
            // InternalPdfMk.g:8678:2: ( RULE_ID )
            // InternalPdfMk.g:8679:3: RULE_ID
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
    // InternalPdfMk.g:8688:1: rule__StyleObject__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__StyleObject__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8692:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8693:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8693:2: ( ( '{' ) )
            // InternalPdfMk.g:8694:3: ( '{' )
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:8695:3: ( '{' )
            // InternalPdfMk.g:8696:4: '{'
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
    // InternalPdfMk.g:8707:1: rule__StyleObject__FontSizeAssignment_3 : ( ruleFontSizeDefinition ) ;
    public final void rule__StyleObject__FontSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8711:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:8712:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:8712:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:8713:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:8722:1: rule__StyleObject__TypeFaceAssignment_4_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__StyleObject__TypeFaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8726:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:8727:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:8727:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:8728:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:8737:1: rule__StyleObject__AlignmentAssignment_5_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__StyleObject__AlignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8741:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:8742:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:8742:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:8743:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:8752:1: rule__StyleObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__StyleObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8756:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:8757:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:8757:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:8758:3: ruleItalicsDefinition
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
    // InternalPdfMk.g:8767:1: rule__StyleObject__MarginAssignment_7_1 : ( ruleMarginDefinition ) ;
    public final void rule__StyleObject__MarginAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8771:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:8772:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:8772:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:8773:3: ruleMarginDefinition
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
    // InternalPdfMk.g:8782:1: rule__StyleObjects__ValueAssignment_1_0 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8786:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:8787:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:8787:2: ( ruleStyleObject )
            // InternalPdfMk.g:8788:3: ruleStyleObject
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
    // InternalPdfMk.g:8797:1: rule__StyleObjects__ValueAssignment_1_1_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8801:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:8802:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:8802:2: ( ruleStyleObject )
            // InternalPdfMk.g:8803:3: ruleStyleObject
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
    // InternalPdfMk.g:8812:1: rule__InnerColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__InnerColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8816:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8817:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8817:2: ( ( '[' ) )
            // InternalPdfMk.g:8818:3: ( '[' )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:8819:3: ( '[' )
            // InternalPdfMk.g:8820:4: '['
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
    // InternalPdfMk.g:8831:1: rule__InnerColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8835:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8836:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8836:2: ( ruleStringObject )
            // InternalPdfMk.g:8837:3: ruleStringObject
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
    // InternalPdfMk.g:8846:1: rule__InnerColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8850:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8851:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8851:2: ( ruleStringObject )
            // InternalPdfMk.g:8852:3: ruleStringObject
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
    // InternalPdfMk.g:8861:1: rule__InnerColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8865:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8866:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8866:2: ( ruleTextObject )
            // InternalPdfMk.g:8867:3: ruleTextObject
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
    // InternalPdfMk.g:8876:1: rule__InnerColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8880:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8881:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8881:2: ( ruleTextObject )
            // InternalPdfMk.g:8882:3: ruleTextObject
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
    // InternalPdfMk.g:8891:1: rule__InnerColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8895:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8896:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8896:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8897:3: ruleColumnDefinition
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
    // InternalPdfMk.g:8906:1: rule__InnerColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8910:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8911:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8911:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8912:3: ruleColumnDefinition
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
    // InternalPdfMk.g:8921:1: rule__ColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__ColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8925:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8926:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8926:2: ( ( '[' ) )
            // InternalPdfMk.g:8927:3: ( '[' )
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:8928:3: ( '[' )
            // InternalPdfMk.g:8929:4: '['
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
    // InternalPdfMk.g:8940:1: rule__ColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8944:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8945:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8945:2: ( ruleStringObject )
            // InternalPdfMk.g:8946:3: ruleStringObject
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
    // InternalPdfMk.g:8955:1: rule__ColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8959:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8960:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8960:2: ( ruleStringObject )
            // InternalPdfMk.g:8961:3: ruleStringObject
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
    // InternalPdfMk.g:8970:1: rule__ColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8974:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8975:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8975:2: ( ruleTextObject )
            // InternalPdfMk.g:8976:3: ruleTextObject
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
    // InternalPdfMk.g:8985:1: rule__ColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8989:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8990:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8990:2: ( ruleTextObject )
            // InternalPdfMk.g:8991:3: ruleTextObject
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
    // InternalPdfMk.g:9000:1: rule__ColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9004:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9005:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9005:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9006:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9015:1: rule__ColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9019:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9020:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9020:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9021:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9030:1: rule__ColumnObject__InnerColumnAssignment_4_0 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9034:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:9035:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:9035:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:9036:3: ruleInnerColumnObject
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
    // InternalPdfMk.g:9045:1: rule__ColumnObject__InnerColumnAssignment_4_1_1 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9049:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:9050:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:9050:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:9051:3: ruleInnerColumnObject
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
    // InternalPdfMk.g:9060:1: rule__ImageObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ImageObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9064:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9065:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9065:2: ( ( '{' ) )
            // InternalPdfMk.g:9066:3: ( '{' )
            {
             before(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9067:3: ( '{' )
            // InternalPdfMk.g:9068:4: '{'
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
    // InternalPdfMk.g:9079:1: rule__ImageObject__ImageAssignment_1 : ( ruleImageDefintion ) ;
    public final void rule__ImageObject__ImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9083:1: ( ( ruleImageDefintion ) )
            // InternalPdfMk.g:9084:2: ( ruleImageDefintion )
            {
            // InternalPdfMk.g:9084:2: ( ruleImageDefintion )
            // InternalPdfMk.g:9085:3: ruleImageDefintion
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
    // InternalPdfMk.g:9094:1: rule__ImageObject__WidthAssignment_2_1 : ( ruleImageWidthDefintion ) ;
    public final void rule__ImageObject__WidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9098:1: ( ( ruleImageWidthDefintion ) )
            // InternalPdfMk.g:9099:2: ( ruleImageWidthDefintion )
            {
            // InternalPdfMk.g:9099:2: ( ruleImageWidthDefintion )
            // InternalPdfMk.g:9100:3: ruleImageWidthDefintion
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
    // InternalPdfMk.g:9109:1: rule__ImageObject__HeightAssignment_3_1 : ( ruleImageHeightDefintion ) ;
    public final void rule__ImageObject__HeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9113:1: ( ( ruleImageHeightDefintion ) )
            // InternalPdfMk.g:9114:2: ( ruleImageHeightDefintion )
            {
            // InternalPdfMk.g:9114:2: ( ruleImageHeightDefintion )
            // InternalPdfMk.g:9115:3: ruleImageHeightDefintion
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
    // InternalPdfMk.g:9124:1: rule__ImageObject__OpacityAssignment_4_1 : ( ruleImageOpacityDefinition ) ;
    public final void rule__ImageObject__OpacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9128:1: ( ( ruleImageOpacityDefinition ) )
            // InternalPdfMk.g:9129:2: ( ruleImageOpacityDefinition )
            {
            // InternalPdfMk.g:9129:2: ( ruleImageOpacityDefinition )
            // InternalPdfMk.g:9130:3: ruleImageOpacityDefinition
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
    // InternalPdfMk.g:9139:1: rule__ImageObject__FitAssignment_5_1 : ( ruleImageFitDefinition ) ;
    public final void rule__ImageObject__FitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9143:1: ( ( ruleImageFitDefinition ) )
            // InternalPdfMk.g:9144:2: ( ruleImageFitDefinition )
            {
            // InternalPdfMk.g:9144:2: ( ruleImageFitDefinition )
            // InternalPdfMk.g:9145:3: ruleImageFitDefinition
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
    // InternalPdfMk.g:9154:1: rule__ImageObject__PageBreakAssignment_6_1 : ( ruleImagePageBreakDefinition ) ;
    public final void rule__ImageObject__PageBreakAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9158:1: ( ( ruleImagePageBreakDefinition ) )
            // InternalPdfMk.g:9159:2: ( ruleImagePageBreakDefinition )
            {
            // InternalPdfMk.g:9159:2: ( ruleImagePageBreakDefinition )
            // InternalPdfMk.g:9160:3: ruleImagePageBreakDefinition
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
    // InternalPdfMk.g:9169:1: rule__ListObjectPropertiesWrapper__ValueAssignment : ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) ;
    public final void rule__ListObjectPropertiesWrapper__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9173:1: ( ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:9174:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:9174:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            // InternalPdfMk.g:9175:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:9176:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            // InternalPdfMk.g:9176:4: rule__ListObjectPropertiesWrapper__ValueAlternatives_0
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
    // InternalPdfMk.g:9184:1: rule__ListElements__ElValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListElements__ElValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9188:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:9189:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:9189:2: ( RULE_STRING )
            // InternalPdfMk.g:9190:3: RULE_STRING
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
    // InternalPdfMk.g:9199:1: rule__ListObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ListObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9203:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9204:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9204:2: ( ( '{' ) )
            // InternalPdfMk.g:9205:3: ( '{' )
            {
             before(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9206:3: ( '{' )
            // InternalPdfMk.g:9207:4: '{'
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
    // InternalPdfMk.g:9218:1: rule__ListObject__PropertiesAssignment_1_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9222:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:9223:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:9223:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:9224:3: ruleListObjectPropertiesWrapper
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
    // InternalPdfMk.g:9233:1: rule__ListObject__PropertiesAssignment_1_2_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9237:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:9238:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:9238:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:9239:3: ruleListObjectPropertiesWrapper
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
    // InternalPdfMk.g:9248:1: rule__ListObject__ElementsAssignment_5_0 : ( ruleListElements ) ;
    public final void rule__ListObject__ElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9252:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:9253:2: ( ruleListElements )
            {
            // InternalPdfMk.g:9253:2: ( ruleListElements )
            // InternalPdfMk.g:9254:3: ruleListElements
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
    // InternalPdfMk.g:9263:1: rule__ListObject__ElemtensAssignment_5_1_1 : ( ruleListElements ) ;
    public final void rule__ListObject__ElemtensAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9267:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:9268:2: ( ruleListElements )
            {
            // InternalPdfMk.g:9268:2: ( ruleListElements )
            // InternalPdfMk.g:9269:3: ruleListElements
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
    // InternalPdfMk.g:9278:1: rule__TableObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TableObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9282:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9283:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9283:2: ( ( '{' ) )
            // InternalPdfMk.g:9284:3: ( '{' )
            {
             before(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9285:3: ( '{' )
            // InternalPdfMk.g:9286:4: '{'
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
    // InternalPdfMk.g:9297:1: rule__TableObject__StyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__TableObject__StyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9301:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:9302:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:9302:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:9303:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:9312:1: rule__TableObject__TableAssignment_2 : ( ruleTableDefinition ) ;
    public final void rule__TableObject__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9316:1: ( ( ruleTableDefinition ) )
            // InternalPdfMk.g:9317:2: ( ruleTableDefinition )
            {
            // InternalPdfMk.g:9317:2: ( ruleTableDefinition )
            // InternalPdfMk.g:9318:3: ruleTableDefinition
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
    // InternalPdfMk.g:9327:1: rule__ContentObject__ValueAssignment : ( ( rule__ContentObject__ValueAlternatives_0 ) ) ;
    public final void rule__ContentObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9331:1: ( ( ( rule__ContentObject__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:9332:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:9332:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            // InternalPdfMk.g:9333:3: ( rule__ContentObject__ValueAlternatives_0 )
            {
             before(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:9334:3: ( rule__ContentObject__ValueAlternatives_0 )
            // InternalPdfMk.g:9334:4: rule__ContentObject__ValueAlternatives_0
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
    // InternalPdfMk.g:9342:1: rule__ContentObjects__ValueAssignment_2_0 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9346:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:9347:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:9347:2: ( ruleContentObject )
            // InternalPdfMk.g:9348:3: ruleContentObject
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
    // InternalPdfMk.g:9357:1: rule__ContentObjects__ValueAssignment_2_1_1 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9361:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:9362:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:9362:2: ( ruleContentObject )
            // InternalPdfMk.g:9363:3: ruleContentObject
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
    // InternalPdfMk.g:9372:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9376:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:9377:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:9377:2: ( ( 'styles' ) )
            // InternalPdfMk.g:9378:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:9379:3: ( 'styles' )
            // InternalPdfMk.g:9380:4: 'styles'
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
    // InternalPdfMk.g:9391:1: rule__Styles__ValueAssignment_2 : ( ruleStyleObjects ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9395:1: ( ( ruleStyleObjects ) )
            // InternalPdfMk.g:9396:2: ( ruleStyleObjects )
            {
            // InternalPdfMk.g:9396:2: ( ruleStyleObjects )
            // InternalPdfMk.g:9397:3: ruleStyleObjects
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
    // InternalPdfMk.g:9406:1: rule__Content__KeyAssignment_0 : ( ( 'content' ) ) ;
    public final void rule__Content__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9410:1: ( ( ( 'content' ) ) )
            // InternalPdfMk.g:9411:2: ( ( 'content' ) )
            {
            // InternalPdfMk.g:9411:2: ( ( 'content' ) )
            // InternalPdfMk.g:9412:3: ( 'content' )
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            // InternalPdfMk.g:9413:3: ( 'content' )
            // InternalPdfMk.g:9414:4: 'content'
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
    // InternalPdfMk.g:9425:1: rule__Content__ValueAssignment_2 : ( ruleContentObjects ) ;
    public final void rule__Content__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9429:1: ( ( ruleContentObjects ) )
            // InternalPdfMk.g:9430:2: ( ruleContentObjects )
            {
            // InternalPdfMk.g:9430:2: ( ruleContentObjects )
            // InternalPdfMk.g:9431:3: ruleContentObjects
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\15\1\uffff\1\25\2\uffff\1\4\1\23\1\15\1\25\1\4\1\23\1\15";
    static final String dfa_3s = "\1\22\1\uffff\1\52\1\uffff\1\25\2\uffff\1\4\1\24\1\52\1\25\1\4\1\24\1\52";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\3\1\2\7\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
            "",
            "\2\3\4\uffff\2\5\1\uffff\1\6\2\uffff\6\6\1\uffff\1\6\1\5\4\uffff\1\3\1\4\3\3",
            "",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\6\1\11",
            "\2\3\7\uffff\1\6\2\uffff\6\6\1\uffff\1\6\5\uffff\1\3\1\12\3\3",
            "\1\13",
            "\1\14",
            "\1\6\1\15",
            "\2\3\7\uffff\1\6\2\uffff\6\6\1\uffff\1\6\5\uffff\1\3\1\12\3\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1173:1: rule__TableCellItemElements__ElementsAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );";
        }
    }
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\5\1\uffff\1\15\1\25\3\uffff\1\25\2\uffff\1\5\1\4\2\23\1\26\1\15\1\25\1\4\1\23\1\15";
    static final String dfa_9s = "\1\22\1\uffff\1\54\1\25\3\uffff\1\25\2\uffff\1\5\1\4\2\24\1\54\1\52\1\25\1\4\1\24\1\52";
    static final String dfa_10s = "\1\uffff\1\1\2\uffff\1\6\1\3\1\5\1\uffff\1\4\1\2\12\uffff";
    static final String dfa_11s = "\24\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\14\uffff\1\2",
            "",
            "\2\6\4\uffff\2\10\1\uffff\1\11\2\uffff\1\11\1\3\4\11\1\5\1\11\1\10\4\uffff\1\6\1\7\3\6\1\uffff\1\4",
            "\1\12",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\11\1\16",
            "\1\11\1\17",
            "\1\11\2\uffff\6\11\1\5\1\11\6\uffff\1\11\4\uffff\1\4",
            "\2\6\7\uffff\1\11\2\uffff\6\11\1\uffff\1\11\5\uffff\1\6\1\20\3\6",
            "\1\21",
            "\1\22",
            "\1\11\1\23",
            "\2\6\7\uffff\1\11\2\uffff\6\11\1\uffff\1\11\5\uffff\1\6\1\20\3\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1356:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );";
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000817E400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000007C17E406000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000007C17E400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000007C17E400002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001040020L});

}