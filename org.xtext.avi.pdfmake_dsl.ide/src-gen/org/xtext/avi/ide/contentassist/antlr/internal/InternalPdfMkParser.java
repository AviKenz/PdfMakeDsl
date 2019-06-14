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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ul'", "'ol'", "'var'", "'dd'", "'='", "'{'", "'}'", "','", "':'", "'['", "']'", "'bold'", "'style'", "'text'", "'alignment'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'body'", "'table'", "'styles'", "'content'"
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


    // $ANTLR start "entryRuleStyleObjectMembersWrapper"
    // InternalPdfMk.g:778:1: entryRuleStyleObjectMembersWrapper : ruleStyleObjectMembersWrapper EOF ;
    public final void entryRuleStyleObjectMembersWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:779:1: ( ruleStyleObjectMembersWrapper EOF )
            // InternalPdfMk.g:780:1: ruleStyleObjectMembersWrapper EOF
            {
             before(grammarAccess.getStyleObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getStyleObjectMembersWrapperRule()); 
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
    // $ANTLR end "entryRuleStyleObjectMembersWrapper"


    // $ANTLR start "ruleStyleObjectMembersWrapper"
    // InternalPdfMk.g:787:1: ruleStyleObjectMembersWrapper : ( ( rule__StyleObjectMembersWrapper__Alternatives ) ) ;
    public final void ruleStyleObjectMembersWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:791:2: ( ( ( rule__StyleObjectMembersWrapper__Alternatives ) ) )
            // InternalPdfMk.g:792:2: ( ( rule__StyleObjectMembersWrapper__Alternatives ) )
            {
            // InternalPdfMk.g:792:2: ( ( rule__StyleObjectMembersWrapper__Alternatives ) )
            // InternalPdfMk.g:793:3: ( rule__StyleObjectMembersWrapper__Alternatives )
            {
             before(grammarAccess.getStyleObjectMembersWrapperAccess().getAlternatives()); 
            // InternalPdfMk.g:794:3: ( rule__StyleObjectMembersWrapper__Alternatives )
            // InternalPdfMk.g:794:4: rule__StyleObjectMembersWrapper__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjectMembersWrapper__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectMembersWrapperAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyleObjectMembersWrapper"


    // $ANTLR start "entryRuleImageObjectMembersWrapper"
    // InternalPdfMk.g:803:1: entryRuleImageObjectMembersWrapper : ruleImageObjectMembersWrapper EOF ;
    public final void entryRuleImageObjectMembersWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:804:1: ( ruleImageObjectMembersWrapper EOF )
            // InternalPdfMk.g:805:1: ruleImageObjectMembersWrapper EOF
            {
             before(grammarAccess.getImageObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            ruleImageObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getImageObjectMembersWrapperRule()); 
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
    // $ANTLR end "entryRuleImageObjectMembersWrapper"


    // $ANTLR start "ruleImageObjectMembersWrapper"
    // InternalPdfMk.g:812:1: ruleImageObjectMembersWrapper : ( ( rule__ImageObjectMembersWrapper__Alternatives ) ) ;
    public final void ruleImageObjectMembersWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:816:2: ( ( ( rule__ImageObjectMembersWrapper__Alternatives ) ) )
            // InternalPdfMk.g:817:2: ( ( rule__ImageObjectMembersWrapper__Alternatives ) )
            {
            // InternalPdfMk.g:817:2: ( ( rule__ImageObjectMembersWrapper__Alternatives ) )
            // InternalPdfMk.g:818:3: ( rule__ImageObjectMembersWrapper__Alternatives )
            {
             before(grammarAccess.getImageObjectMembersWrapperAccess().getAlternatives()); 
            // InternalPdfMk.g:819:3: ( rule__ImageObjectMembersWrapper__Alternatives )
            // InternalPdfMk.g:819:4: rule__ImageObjectMembersWrapper__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImageObjectMembersWrapper__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectMembersWrapperAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageObjectMembersWrapper"


    // $ANTLR start "entryRuleInnerColumnObjectMembersWrapper"
    // InternalPdfMk.g:828:1: entryRuleInnerColumnObjectMembersWrapper : ruleInnerColumnObjectMembersWrapper EOF ;
    public final void entryRuleInnerColumnObjectMembersWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:829:1: ( ruleInnerColumnObjectMembersWrapper EOF )
            // InternalPdfMk.g:830:1: ruleInnerColumnObjectMembersWrapper EOF
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerColumnObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperRule()); 
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
    // $ANTLR end "entryRuleInnerColumnObjectMembersWrapper"


    // $ANTLR start "ruleInnerColumnObjectMembersWrapper"
    // InternalPdfMk.g:837:1: ruleInnerColumnObjectMembersWrapper : ( ( rule__InnerColumnObjectMembersWrapper__Alternatives ) ) ;
    public final void ruleInnerColumnObjectMembersWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:841:2: ( ( ( rule__InnerColumnObjectMembersWrapper__Alternatives ) ) )
            // InternalPdfMk.g:842:2: ( ( rule__InnerColumnObjectMembersWrapper__Alternatives ) )
            {
            // InternalPdfMk.g:842:2: ( ( rule__InnerColumnObjectMembersWrapper__Alternatives ) )
            // InternalPdfMk.g:843:3: ( rule__InnerColumnObjectMembersWrapper__Alternatives )
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getAlternatives()); 
            // InternalPdfMk.g:844:3: ( rule__InnerColumnObjectMembersWrapper__Alternatives )
            // InternalPdfMk.g:844:4: rule__InnerColumnObjectMembersWrapper__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerColumnObjectMembersWrapper"


    // $ANTLR start "entryRuleColumnObjectMembersWrapper"
    // InternalPdfMk.g:853:1: entryRuleColumnObjectMembersWrapper : ruleColumnObjectMembersWrapper EOF ;
    public final void entryRuleColumnObjectMembersWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:854:1: ( ruleColumnObjectMembersWrapper EOF )
            // InternalPdfMk.g:855:1: ruleColumnObjectMembersWrapper EOF
            {
             before(grammarAccess.getColumnObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getColumnObjectMembersWrapperRule()); 
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
    // $ANTLR end "entryRuleColumnObjectMembersWrapper"


    // $ANTLR start "ruleColumnObjectMembersWrapper"
    // InternalPdfMk.g:862:1: ruleColumnObjectMembersWrapper : ( ( rule__ColumnObjectMembersWrapper__Alternatives ) ) ;
    public final void ruleColumnObjectMembersWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:866:2: ( ( ( rule__ColumnObjectMembersWrapper__Alternatives ) ) )
            // InternalPdfMk.g:867:2: ( ( rule__ColumnObjectMembersWrapper__Alternatives ) )
            {
            // InternalPdfMk.g:867:2: ( ( rule__ColumnObjectMembersWrapper__Alternatives ) )
            // InternalPdfMk.g:868:3: ( rule__ColumnObjectMembersWrapper__Alternatives )
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getAlternatives()); 
            // InternalPdfMk.g:869:3: ( rule__ColumnObjectMembersWrapper__Alternatives )
            // InternalPdfMk.g:869:4: rule__ColumnObjectMembersWrapper__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnObjectMembersWrapper"


    // $ANTLR start "entryRuleListObjectPropertiesWrapper"
    // InternalPdfMk.g:878:1: entryRuleListObjectPropertiesWrapper : ruleListObjectPropertiesWrapper EOF ;
    public final void entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        try {
            // InternalPdfMk.g:879:1: ( ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:880:1: ruleListObjectPropertiesWrapper EOF
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
    // InternalPdfMk.g:887:1: ruleListObjectPropertiesWrapper : ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) ;
    public final void ruleListObjectPropertiesWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:891:2: ( ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) ) )
            // InternalPdfMk.g:892:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            {
            // InternalPdfMk.g:892:2: ( ( rule__ListObjectPropertiesWrapper__ValueAssignment ) )
            // InternalPdfMk.g:893:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAssignment()); 
            // InternalPdfMk.g:894:3: ( rule__ListObjectPropertiesWrapper__ValueAssignment )
            // InternalPdfMk.g:894:4: rule__ListObjectPropertiesWrapper__ValueAssignment
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


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:903:1: entryRuleTextObject : ruleTextObject EOF ;
    public final void entryRuleTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:904:1: ( ruleTextObject EOF )
            // InternalPdfMk.g:905:1: ruleTextObject EOF
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
    // InternalPdfMk.g:912:1: ruleTextObject : ( ( rule__TextObject__Group__0 ) ) ;
    public final void ruleTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:916:2: ( ( ( rule__TextObject__Group__0 ) ) )
            // InternalPdfMk.g:917:2: ( ( rule__TextObject__Group__0 ) )
            {
            // InternalPdfMk.g:917:2: ( ( rule__TextObject__Group__0 ) )
            // InternalPdfMk.g:918:3: ( rule__TextObject__Group__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup()); 
            // InternalPdfMk.g:919:3: ( rule__TextObject__Group__0 )
            // InternalPdfMk.g:919:4: rule__TextObject__Group__0
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
    // InternalPdfMk.g:928:1: entryRuleColumnTextObject : ruleColumnTextObject EOF ;
    public final void entryRuleColumnTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:929:1: ( ruleColumnTextObject EOF )
            // InternalPdfMk.g:930:1: ruleColumnTextObject EOF
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
    // InternalPdfMk.g:937:1: ruleColumnTextObject : ( ( rule__ColumnTextObject__ValueAssignment ) ) ;
    public final void ruleColumnTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:941:2: ( ( ( rule__ColumnTextObject__ValueAssignment ) ) )
            // InternalPdfMk.g:942:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:942:2: ( ( rule__ColumnTextObject__ValueAssignment ) )
            // InternalPdfMk.g:943:3: ( rule__ColumnTextObject__ValueAssignment )
            {
             before(grammarAccess.getColumnTextObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:944:3: ( rule__ColumnTextObject__ValueAssignment )
            // InternalPdfMk.g:944:4: rule__ColumnTextObject__ValueAssignment
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
    // InternalPdfMk.g:953:1: entryRuleStyleObject : ruleStyleObject EOF ;
    public final void entryRuleStyleObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:954:1: ( ruleStyleObject EOF )
            // InternalPdfMk.g:955:1: ruleStyleObject EOF
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
    // InternalPdfMk.g:962:1: ruleStyleObject : ( ( rule__StyleObject__Group__0 ) ) ;
    public final void ruleStyleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:966:2: ( ( ( rule__StyleObject__Group__0 ) ) )
            // InternalPdfMk.g:967:2: ( ( rule__StyleObject__Group__0 ) )
            {
            // InternalPdfMk.g:967:2: ( ( rule__StyleObject__Group__0 ) )
            // InternalPdfMk.g:968:3: ( rule__StyleObject__Group__0 )
            {
             before(grammarAccess.getStyleObjectAccess().getGroup()); 
            // InternalPdfMk.g:969:3: ( rule__StyleObject__Group__0 )
            // InternalPdfMk.g:969:4: rule__StyleObject__Group__0
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
    // InternalPdfMk.g:978:1: entryRuleStyleObjects : ruleStyleObjects EOF ;
    public final void entryRuleStyleObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:979:1: ( ruleStyleObjects EOF )
            // InternalPdfMk.g:980:1: ruleStyleObjects EOF
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
    // InternalPdfMk.g:987:1: ruleStyleObjects : ( ( rule__StyleObjects__Group__0 ) ) ;
    public final void ruleStyleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:991:2: ( ( ( rule__StyleObjects__Group__0 ) ) )
            // InternalPdfMk.g:992:2: ( ( rule__StyleObjects__Group__0 ) )
            {
            // InternalPdfMk.g:992:2: ( ( rule__StyleObjects__Group__0 ) )
            // InternalPdfMk.g:993:3: ( rule__StyleObjects__Group__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup()); 
            // InternalPdfMk.g:994:3: ( rule__StyleObjects__Group__0 )
            // InternalPdfMk.g:994:4: rule__StyleObjects__Group__0
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


    // $ANTLR start "entryRuleImageObject"
    // InternalPdfMk.g:1003:1: entryRuleImageObject : ruleImageObject EOF ;
    public final void entryRuleImageObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1004:1: ( ruleImageObject EOF )
            // InternalPdfMk.g:1005:1: ruleImageObject EOF
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
    // InternalPdfMk.g:1012:1: ruleImageObject : ( ( rule__ImageObject__Group__0 ) ) ;
    public final void ruleImageObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1016:2: ( ( ( rule__ImageObject__Group__0 ) ) )
            // InternalPdfMk.g:1017:2: ( ( rule__ImageObject__Group__0 ) )
            {
            // InternalPdfMk.g:1017:2: ( ( rule__ImageObject__Group__0 ) )
            // InternalPdfMk.g:1018:3: ( rule__ImageObject__Group__0 )
            {
             before(grammarAccess.getImageObjectAccess().getGroup()); 
            // InternalPdfMk.g:1019:3: ( rule__ImageObject__Group__0 )
            // InternalPdfMk.g:1019:4: rule__ImageObject__Group__0
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


    // $ANTLR start "entryRuleColumnObject"
    // InternalPdfMk.g:1028:1: entryRuleColumnObject : ruleColumnObject EOF ;
    public final void entryRuleColumnObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1029:1: ( ruleColumnObject EOF )
            // InternalPdfMk.g:1030:1: ruleColumnObject EOF
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
    // InternalPdfMk.g:1037:1: ruleColumnObject : ( ( rule__ColumnObject__Group__0 ) ) ;
    public final void ruleColumnObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1041:2: ( ( ( rule__ColumnObject__Group__0 ) ) )
            // InternalPdfMk.g:1042:2: ( ( rule__ColumnObject__Group__0 ) )
            {
            // InternalPdfMk.g:1042:2: ( ( rule__ColumnObject__Group__0 ) )
            // InternalPdfMk.g:1043:3: ( rule__ColumnObject__Group__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup()); 
            // InternalPdfMk.g:1044:3: ( rule__ColumnObject__Group__0 )
            // InternalPdfMk.g:1044:4: rule__ColumnObject__Group__0
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


    // $ANTLR start "entryRuleListElements"
    // InternalPdfMk.g:1053:1: entryRuleListElements : ruleListElements EOF ;
    public final void entryRuleListElements() throws RecognitionException {
        try {
            // InternalPdfMk.g:1054:1: ( ruleListElements EOF )
            // InternalPdfMk.g:1055:1: ruleListElements EOF
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
    // InternalPdfMk.g:1062:1: ruleListElements : ( ( rule__ListElements__Alternatives ) ) ;
    public final void ruleListElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1066:2: ( ( ( rule__ListElements__Alternatives ) ) )
            // InternalPdfMk.g:1067:2: ( ( rule__ListElements__Alternatives ) )
            {
            // InternalPdfMk.g:1067:2: ( ( rule__ListElements__Alternatives ) )
            // InternalPdfMk.g:1068:3: ( rule__ListElements__Alternatives )
            {
             before(grammarAccess.getListElementsAccess().getAlternatives()); 
            // InternalPdfMk.g:1069:3: ( rule__ListElements__Alternatives )
            // InternalPdfMk.g:1069:4: rule__ListElements__Alternatives
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
    // InternalPdfMk.g:1078:1: entryRuleListObject : ruleListObject EOF ;
    public final void entryRuleListObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1079:1: ( ruleListObject EOF )
            // InternalPdfMk.g:1080:1: ruleListObject EOF
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
    // InternalPdfMk.g:1087:1: ruleListObject : ( ( rule__ListObject__Group__0 ) ) ;
    public final void ruleListObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1091:2: ( ( ( rule__ListObject__Group__0 ) ) )
            // InternalPdfMk.g:1092:2: ( ( rule__ListObject__Group__0 ) )
            {
            // InternalPdfMk.g:1092:2: ( ( rule__ListObject__Group__0 ) )
            // InternalPdfMk.g:1093:3: ( rule__ListObject__Group__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup()); 
            // InternalPdfMk.g:1094:3: ( rule__ListObject__Group__0 )
            // InternalPdfMk.g:1094:4: rule__ListObject__Group__0
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
    // InternalPdfMk.g:1103:1: entryRuleTableObject : ruleTableObject EOF ;
    public final void entryRuleTableObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1104:1: ( ruleTableObject EOF )
            // InternalPdfMk.g:1105:1: ruleTableObject EOF
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
    // InternalPdfMk.g:1112:1: ruleTableObject : ( ( rule__TableObject__Group__0 ) ) ;
    public final void ruleTableObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1116:2: ( ( ( rule__TableObject__Group__0 ) ) )
            // InternalPdfMk.g:1117:2: ( ( rule__TableObject__Group__0 ) )
            {
            // InternalPdfMk.g:1117:2: ( ( rule__TableObject__Group__0 ) )
            // InternalPdfMk.g:1118:3: ( rule__TableObject__Group__0 )
            {
             before(grammarAccess.getTableObjectAccess().getGroup()); 
            // InternalPdfMk.g:1119:3: ( rule__TableObject__Group__0 )
            // InternalPdfMk.g:1119:4: rule__TableObject__Group__0
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
    // InternalPdfMk.g:1128:1: entryRuleContentObject : ruleContentObject EOF ;
    public final void entryRuleContentObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:1129:1: ( ruleContentObject EOF )
            // InternalPdfMk.g:1130:1: ruleContentObject EOF
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
    // InternalPdfMk.g:1137:1: ruleContentObject : ( ( rule__ContentObject__ValueAssignment ) ) ;
    public final void ruleContentObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1141:2: ( ( ( rule__ContentObject__ValueAssignment ) ) )
            // InternalPdfMk.g:1142:2: ( ( rule__ContentObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:1142:2: ( ( rule__ContentObject__ValueAssignment ) )
            // InternalPdfMk.g:1143:3: ( rule__ContentObject__ValueAssignment )
            {
             before(grammarAccess.getContentObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:1144:3: ( rule__ContentObject__ValueAssignment )
            // InternalPdfMk.g:1144:4: rule__ContentObject__ValueAssignment
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
    // InternalPdfMk.g:1153:1: entryRuleContentObjects : ruleContentObjects EOF ;
    public final void entryRuleContentObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:1154:1: ( ruleContentObjects EOF )
            // InternalPdfMk.g:1155:1: ruleContentObjects EOF
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
    // InternalPdfMk.g:1162:1: ruleContentObjects : ( ( rule__ContentObjects__Group__0 ) ) ;
    public final void ruleContentObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1166:2: ( ( ( rule__ContentObjects__Group__0 ) ) )
            // InternalPdfMk.g:1167:2: ( ( rule__ContentObjects__Group__0 ) )
            {
            // InternalPdfMk.g:1167:2: ( ( rule__ContentObjects__Group__0 ) )
            // InternalPdfMk.g:1168:3: ( rule__ContentObjects__Group__0 )
            {
             before(grammarAccess.getContentObjectsAccess().getGroup()); 
            // InternalPdfMk.g:1169:3: ( rule__ContentObjects__Group__0 )
            // InternalPdfMk.g:1169:4: rule__ContentObjects__Group__0
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
    // InternalPdfMk.g:1178:1: entryRuleStyles : ruleStyles EOF ;
    public final void entryRuleStyles() throws RecognitionException {
        try {
            // InternalPdfMk.g:1179:1: ( ruleStyles EOF )
            // InternalPdfMk.g:1180:1: ruleStyles EOF
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
    // InternalPdfMk.g:1187:1: ruleStyles : ( ( rule__Styles__Group__0 ) ) ;
    public final void ruleStyles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1191:2: ( ( ( rule__Styles__Group__0 ) ) )
            // InternalPdfMk.g:1192:2: ( ( rule__Styles__Group__0 ) )
            {
            // InternalPdfMk.g:1192:2: ( ( rule__Styles__Group__0 ) )
            // InternalPdfMk.g:1193:3: ( rule__Styles__Group__0 )
            {
             before(grammarAccess.getStylesAccess().getGroup()); 
            // InternalPdfMk.g:1194:3: ( rule__Styles__Group__0 )
            // InternalPdfMk.g:1194:4: rule__Styles__Group__0
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
    // InternalPdfMk.g:1203:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:1204:1: ( ruleContent EOF )
            // InternalPdfMk.g:1205:1: ruleContent EOF
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
    // InternalPdfMk.g:1212:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1216:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPdfMk.g:1217:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPdfMk.g:1217:2: ( ( rule__Content__Group__0 ) )
            // InternalPdfMk.g:1218:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPdfMk.g:1219:3: ( rule__Content__Group__0 )
            // InternalPdfMk.g:1219:4: rule__Content__Group__0
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
    // InternalPdfMk.g:1227:1: rule__BooleanType__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1231:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalPdfMk.g:1232:2: ( 'true' )
                    {
                    // InternalPdfMk.g:1232:2: ( 'true' )
                    // InternalPdfMk.g:1233:3: 'true'
                    {
                     before(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanTypeAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1238:2: ( 'false' )
                    {
                    // InternalPdfMk.g:1238:2: ( 'false' )
                    // InternalPdfMk.g:1239:3: 'false'
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
    // InternalPdfMk.g:1248:1: rule__TableCellItemElements__ElementsAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );
    public final void rule__TableCellItemElements__ElementsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1252:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:1253:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1253:2: ( ruleStringObject )
                    // InternalPdfMk.g:1254:3: ruleStringObject
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
                    // InternalPdfMk.g:1259:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1259:2: ( ruleTextObject )
                    // InternalPdfMk.g:1260:3: ruleTextObject
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
                    // InternalPdfMk.g:1265:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1265:2: ( ruleImageObject )
                    // InternalPdfMk.g:1266:3: ruleImageObject
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
                    // InternalPdfMk.g:1271:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1271:2: ( ruleListObject )
                    // InternalPdfMk.g:1272:3: ruleListObject
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
    // InternalPdfMk.g:1281:1: rule__TextObjectMembersWrapper__Alternatives : ( ( ruleTextDefinition ) | ( ruleTextStyleDefinition ) | ( ruleFontSizeDefinition ) | ( ruleTextAlignmentDefinition ) | ( ruleTypeFaceDefinition ) | ( ruleItalicsDefinition ) | ( ruleWidthDefinition ) | ( ruleMarginDefinition ) | ( ruleListCounterDefinition ) );
    public final void rule__TextObjectMembersWrapper__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1285:1: ( ( ruleTextDefinition ) | ( ruleTextStyleDefinition ) | ( ruleFontSizeDefinition ) | ( ruleTextAlignmentDefinition ) | ( ruleTypeFaceDefinition ) | ( ruleItalicsDefinition ) | ( ruleWidthDefinition ) | ( ruleMarginDefinition ) | ( ruleListCounterDefinition ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 24:
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
                    // InternalPdfMk.g:1286:2: ( ruleTextDefinition )
                    {
                    // InternalPdfMk.g:1286:2: ( ruleTextDefinition )
                    // InternalPdfMk.g:1287:3: ruleTextDefinition
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
                    // InternalPdfMk.g:1292:2: ( ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:1292:2: ( ruleTextStyleDefinition )
                    // InternalPdfMk.g:1293:3: ruleTextStyleDefinition
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
                    // InternalPdfMk.g:1298:2: ( ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:1298:2: ( ruleFontSizeDefinition )
                    // InternalPdfMk.g:1299:3: ruleFontSizeDefinition
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
                    // InternalPdfMk.g:1304:2: ( ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:1304:2: ( ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:1305:3: ruleTextAlignmentDefinition
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
                    // InternalPdfMk.g:1310:2: ( ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:1310:2: ( ruleTypeFaceDefinition )
                    // InternalPdfMk.g:1311:3: ruleTypeFaceDefinition
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
                    // InternalPdfMk.g:1316:2: ( ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:1316:2: ( ruleItalicsDefinition )
                    // InternalPdfMk.g:1317:3: ruleItalicsDefinition
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
                    // InternalPdfMk.g:1322:2: ( ruleWidthDefinition )
                    {
                    // InternalPdfMk.g:1322:2: ( ruleWidthDefinition )
                    // InternalPdfMk.g:1323:3: ruleWidthDefinition
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
                    // InternalPdfMk.g:1328:2: ( ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:1328:2: ( ruleMarginDefinition )
                    // InternalPdfMk.g:1329:3: ruleMarginDefinition
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
                    // InternalPdfMk.g:1334:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1334:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1335:3: ruleListCounterDefinition
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


    // $ANTLR start "rule__StyleObjectMembersWrapper__Alternatives"
    // InternalPdfMk.g:1344:1: rule__StyleObjectMembersWrapper__Alternatives : ( ( ruleFontSizeDefinition ) | ( ruleTypeFaceDefinition ) | ( ruleTextAlignmentDefinition ) | ( ruleItalicsDefinition ) | ( ruleMarginDefinition ) );
    public final void rule__StyleObjectMembersWrapper__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1348:1: ( ( ruleFontSizeDefinition ) | ( ruleTypeFaceDefinition ) | ( ruleTextAlignmentDefinition ) | ( ruleItalicsDefinition ) | ( ruleMarginDefinition ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 32:
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
                    // InternalPdfMk.g:1349:2: ( ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:1349:2: ( ruleFontSizeDefinition )
                    // InternalPdfMk.g:1350:3: ruleFontSizeDefinition
                    {
                     before(grammarAccess.getStyleObjectMembersWrapperAccess().getFontSizeDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFontSizeDefinition();

                    state._fsp--;

                     after(grammarAccess.getStyleObjectMembersWrapperAccess().getFontSizeDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1355:2: ( ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:1355:2: ( ruleTypeFaceDefinition )
                    // InternalPdfMk.g:1356:3: ruleTypeFaceDefinition
                    {
                     before(grammarAccess.getStyleObjectMembersWrapperAccess().getTypeFaceDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeFaceDefinition();

                    state._fsp--;

                     after(grammarAccess.getStyleObjectMembersWrapperAccess().getTypeFaceDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1361:2: ( ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:1361:2: ( ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:1362:3: ruleTextAlignmentDefinition
                    {
                     before(grammarAccess.getStyleObjectMembersWrapperAccess().getTextAlignmentDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTextAlignmentDefinition();

                    state._fsp--;

                     after(grammarAccess.getStyleObjectMembersWrapperAccess().getTextAlignmentDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1367:2: ( ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:1367:2: ( ruleItalicsDefinition )
                    // InternalPdfMk.g:1368:3: ruleItalicsDefinition
                    {
                     before(grammarAccess.getStyleObjectMembersWrapperAccess().getItalicsDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleItalicsDefinition();

                    state._fsp--;

                     after(grammarAccess.getStyleObjectMembersWrapperAccess().getItalicsDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1373:2: ( ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:1373:2: ( ruleMarginDefinition )
                    // InternalPdfMk.g:1374:3: ruleMarginDefinition
                    {
                     before(grammarAccess.getStyleObjectMembersWrapperAccess().getMarginDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMarginDefinition();

                    state._fsp--;

                     after(grammarAccess.getStyleObjectMembersWrapperAccess().getMarginDefinitionParserRuleCall_4()); 

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
    // $ANTLR end "rule__StyleObjectMembersWrapper__Alternatives"


    // $ANTLR start "rule__ImageObjectMembersWrapper__Alternatives"
    // InternalPdfMk.g:1383:1: rule__ImageObjectMembersWrapper__Alternatives : ( ( ruleImageDefintion ) | ( ruleImageWidthDefintion ) | ( ruleImageHeightDefintion ) | ( ruleImageOpacityDefinition ) | ( ruleImageFitDefinition ) | ( ruleImagePageBreakDefinition ) );
    public final void rule__ImageObjectMembersWrapper__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1387:1: ( ( ruleImageDefintion ) | ( ruleImageWidthDefintion ) | ( ruleImageHeightDefintion ) | ( ruleImageOpacityDefinition ) | ( ruleImageFitDefinition ) | ( ruleImagePageBreakDefinition ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 35:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:1388:2: ( ruleImageDefintion )
                    {
                    // InternalPdfMk.g:1388:2: ( ruleImageDefintion )
                    // InternalPdfMk.g:1389:3: ruleImageDefintion
                    {
                     before(grammarAccess.getImageObjectMembersWrapperAccess().getImageDefintionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImageDefintion();

                    state._fsp--;

                     after(grammarAccess.getImageObjectMembersWrapperAccess().getImageDefintionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1394:2: ( ruleImageWidthDefintion )
                    {
                    // InternalPdfMk.g:1394:2: ( ruleImageWidthDefintion )
                    // InternalPdfMk.g:1395:3: ruleImageWidthDefintion
                    {
                     before(grammarAccess.getImageObjectMembersWrapperAccess().getImageWidthDefintionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImageWidthDefintion();

                    state._fsp--;

                     after(grammarAccess.getImageObjectMembersWrapperAccess().getImageWidthDefintionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1400:2: ( ruleImageHeightDefintion )
                    {
                    // InternalPdfMk.g:1400:2: ( ruleImageHeightDefintion )
                    // InternalPdfMk.g:1401:3: ruleImageHeightDefintion
                    {
                     before(grammarAccess.getImageObjectMembersWrapperAccess().getImageHeightDefintionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImageHeightDefintion();

                    state._fsp--;

                     after(grammarAccess.getImageObjectMembersWrapperAccess().getImageHeightDefintionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1406:2: ( ruleImageOpacityDefinition )
                    {
                    // InternalPdfMk.g:1406:2: ( ruleImageOpacityDefinition )
                    // InternalPdfMk.g:1407:3: ruleImageOpacityDefinition
                    {
                     before(grammarAccess.getImageObjectMembersWrapperAccess().getImageOpacityDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleImageOpacityDefinition();

                    state._fsp--;

                     after(grammarAccess.getImageObjectMembersWrapperAccess().getImageOpacityDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1412:2: ( ruleImageFitDefinition )
                    {
                    // InternalPdfMk.g:1412:2: ( ruleImageFitDefinition )
                    // InternalPdfMk.g:1413:3: ruleImageFitDefinition
                    {
                     before(grammarAccess.getImageObjectMembersWrapperAccess().getImageFitDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleImageFitDefinition();

                    state._fsp--;

                     after(grammarAccess.getImageObjectMembersWrapperAccess().getImageFitDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPdfMk.g:1418:2: ( ruleImagePageBreakDefinition )
                    {
                    // InternalPdfMk.g:1418:2: ( ruleImagePageBreakDefinition )
                    // InternalPdfMk.g:1419:3: ruleImagePageBreakDefinition
                    {
                     before(grammarAccess.getImageObjectMembersWrapperAccess().getImagePageBreakDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleImagePageBreakDefinition();

                    state._fsp--;

                     after(grammarAccess.getImageObjectMembersWrapperAccess().getImagePageBreakDefinitionParserRuleCall_5()); 

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
    // $ANTLR end "rule__ImageObjectMembersWrapper__Alternatives"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Alternatives"
    // InternalPdfMk.g:1428:1: rule__InnerColumnObjectMembersWrapper__Alternatives : ( ( ( rule__InnerColumnObjectMembersWrapper__Group_0__0 ) ) | ( ( rule__InnerColumnObjectMembersWrapper__Group_1__0 ) ) | ( ( rule__InnerColumnObjectMembersWrapper__Group_2__0 ) ) );
    public final void rule__InnerColumnObjectMembersWrapper__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1432:1: ( ( ( rule__InnerColumnObjectMembersWrapper__Group_0__0 ) ) | ( ( rule__InnerColumnObjectMembersWrapper__Group_1__0 ) ) | ( ( rule__InnerColumnObjectMembersWrapper__Group_2__0 ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:1433:2: ( ( rule__InnerColumnObjectMembersWrapper__Group_0__0 ) )
                    {
                    // InternalPdfMk.g:1433:2: ( ( rule__InnerColumnObjectMembersWrapper__Group_0__0 ) )
                    // InternalPdfMk.g:1434:3: ( rule__InnerColumnObjectMembersWrapper__Group_0__0 )
                    {
                     before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_0()); 
                    // InternalPdfMk.g:1435:3: ( rule__InnerColumnObjectMembersWrapper__Group_0__0 )
                    // InternalPdfMk.g:1435:4: rule__InnerColumnObjectMembersWrapper__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObjectMembersWrapper__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1439:2: ( ( rule__InnerColumnObjectMembersWrapper__Group_1__0 ) )
                    {
                    // InternalPdfMk.g:1439:2: ( ( rule__InnerColumnObjectMembersWrapper__Group_1__0 ) )
                    // InternalPdfMk.g:1440:3: ( rule__InnerColumnObjectMembersWrapper__Group_1__0 )
                    {
                     before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_1()); 
                    // InternalPdfMk.g:1441:3: ( rule__InnerColumnObjectMembersWrapper__Group_1__0 )
                    // InternalPdfMk.g:1441:4: rule__InnerColumnObjectMembersWrapper__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObjectMembersWrapper__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1445:2: ( ( rule__InnerColumnObjectMembersWrapper__Group_2__0 ) )
                    {
                    // InternalPdfMk.g:1445:2: ( ( rule__InnerColumnObjectMembersWrapper__Group_2__0 ) )
                    // InternalPdfMk.g:1446:3: ( rule__InnerColumnObjectMembersWrapper__Group_2__0 )
                    {
                     before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_2()); 
                    // InternalPdfMk.g:1447:3: ( rule__InnerColumnObjectMembersWrapper__Group_2__0 )
                    // InternalPdfMk.g:1447:4: rule__InnerColumnObjectMembersWrapper__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObjectMembersWrapper__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_2()); 

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
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Alternatives"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Alternatives"
    // InternalPdfMk.g:1455:1: rule__ColumnObjectMembersWrapper__Alternatives : ( ( ( rule__ColumnObjectMembersWrapper__Group_0__0 ) ) | ( ( rule__ColumnObjectMembersWrapper__Group_1__0 ) ) );
    public final void rule__ColumnObjectMembersWrapper__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1459:1: ( ( ( rule__ColumnObjectMembersWrapper__Group_0__0 ) ) | ( ( rule__ColumnObjectMembersWrapper__Group_1__0 ) ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=1;
                }
                break;
            case EOF:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1460:2: ( ( rule__ColumnObjectMembersWrapper__Group_0__0 ) )
                    {
                    // InternalPdfMk.g:1460:2: ( ( rule__ColumnObjectMembersWrapper__Group_0__0 ) )
                    // InternalPdfMk.g:1461:3: ( rule__ColumnObjectMembersWrapper__Group_0__0 )
                    {
                     before(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_0()); 
                    // InternalPdfMk.g:1462:3: ( rule__ColumnObjectMembersWrapper__Group_0__0 )
                    // InternalPdfMk.g:1462:4: rule__ColumnObjectMembersWrapper__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObjectMembersWrapper__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1466:2: ( ( rule__ColumnObjectMembersWrapper__Group_1__0 ) )
                    {
                    // InternalPdfMk.g:1466:2: ( ( rule__ColumnObjectMembersWrapper__Group_1__0 ) )
                    // InternalPdfMk.g:1467:3: ( rule__ColumnObjectMembersWrapper__Group_1__0 )
                    {
                     before(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_1()); 
                    // InternalPdfMk.g:1468:3: ( rule__ColumnObjectMembersWrapper__Group_1__0 )
                    // InternalPdfMk.g:1468:4: rule__ColumnObjectMembersWrapper__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObjectMembersWrapper__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Alternatives"


    // $ANTLR start "rule__ListObjectPropertiesWrapper__ValueAlternatives_0"
    // InternalPdfMk.g:1476:1: rule__ListObjectPropertiesWrapper__ValueAlternatives_0 : ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) );
    public final void rule__ListObjectPropertiesWrapper__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1480:1: ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:1481:2: ( ruleListReversedDefinition )
                    {
                    // InternalPdfMk.g:1481:2: ( ruleListReversedDefinition )
                    // InternalPdfMk.g:1482:3: ruleListReversedDefinition
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
                    // InternalPdfMk.g:1487:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1487:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1488:3: ruleListCounterDefinition
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
                    // InternalPdfMk.g:1493:2: ( ruleListTypeDefinition )
                    {
                    // InternalPdfMk.g:1493:2: ( ruleListTypeDefinition )
                    // InternalPdfMk.g:1494:3: ruleListTypeDefinition
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
                    // InternalPdfMk.g:1499:2: ( ruleListColorDefinition )
                    {
                    // InternalPdfMk.g:1499:2: ( ruleListColorDefinition )
                    // InternalPdfMk.g:1500:3: ruleListColorDefinition
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
                    // InternalPdfMk.g:1505:2: ( ruleListMarkerColorDefinition )
                    {
                    // InternalPdfMk.g:1505:2: ( ruleListMarkerColorDefinition )
                    // InternalPdfMk.g:1506:3: ruleListMarkerColorDefinition
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
    // InternalPdfMk.g:1515:1: rule__ListElements__Alternatives : ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) );
    public final void rule__ListElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1519:1: ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                switch ( input.LA(2) ) {
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 39:
                    {
                    alt9=2;
                    }
                    break;
                case 25:
                    {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==21) ) {
                        int LA9_6 = input.LA(4);

                        if ( (LA9_6==RULE_STRING) ) {
                            int LA9_7 = input.LA(5);

                            if ( (LA9_7==20) ) {
                                int LA9_8 = input.LA(6);

                                if ( ((LA9_8>=24 && LA9_8<=30)||LA9_8==32||LA9_8==39) ) {
                                    alt9=2;
                                }
                                else if ( (LA9_8==31) ) {
                                    alt9=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 8, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA9_7==19) ) {
                                alt9=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

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
                    // InternalPdfMk.g:1520:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    {
                    // InternalPdfMk.g:1520:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    // InternalPdfMk.g:1521:3: ( rule__ListElements__ElValuesAssignment_0 )
                    {
                     before(grammarAccess.getListElementsAccess().getElValuesAssignment_0()); 
                    // InternalPdfMk.g:1522:3: ( rule__ListElements__ElValuesAssignment_0 )
                    // InternalPdfMk.g:1522:4: rule__ListElements__ElValuesAssignment_0
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
                    // InternalPdfMk.g:1526:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1526:2: ( ruleTextObject )
                    // InternalPdfMk.g:1527:3: ruleTextObject
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
                    // InternalPdfMk.g:1532:2: ( ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1532:2: ( ruleColumnDefinition )
                    // InternalPdfMk.g:1533:3: ruleColumnDefinition
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
    // InternalPdfMk.g:1542:1: rule__ListObject__Alternatives_2 : ( ( 'ul' ) | ( 'ol' ) );
    public final void rule__ListObject__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1546:1: ( ( 'ul' ) | ( 'ol' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:1547:2: ( 'ul' )
                    {
                    // InternalPdfMk.g:1547:2: ( 'ul' )
                    // InternalPdfMk.g:1548:3: 'ul'
                    {
                     before(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1553:2: ( 'ol' )
                    {
                    // InternalPdfMk.g:1553:2: ( 'ol' )
                    // InternalPdfMk.g:1554:3: 'ol'
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
    // InternalPdfMk.g:1563:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );
    public final void rule__ContentObject__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1567:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:1568:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1568:2: ( ruleStringObject )
                    // InternalPdfMk.g:1569:3: ruleStringObject
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
                    // InternalPdfMk.g:1574:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1574:2: ( ruleTextObject )
                    // InternalPdfMk.g:1575:3: ruleTextObject
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
                    // InternalPdfMk.g:1580:2: ( ruleColumnTextObject )
                    {
                    // InternalPdfMk.g:1580:2: ( ruleColumnTextObject )
                    // InternalPdfMk.g:1581:3: ruleColumnTextObject
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
                    // InternalPdfMk.g:1586:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1586:2: ( ruleImageObject )
                    // InternalPdfMk.g:1587:3: ruleImageObject
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
                    // InternalPdfMk.g:1592:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1592:2: ( ruleListObject )
                    // InternalPdfMk.g:1593:3: ruleListObject
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
                    // InternalPdfMk.g:1598:2: ( ruleTableObject )
                    {
                    // InternalPdfMk.g:1598:2: ( ruleTableObject )
                    // InternalPdfMk.g:1599:3: ruleTableObject
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
    // InternalPdfMk.g:1608:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1612:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:1613:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
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
    // InternalPdfMk.g:1620:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1624:1: ( ( 'var' ) )
            // InternalPdfMk.g:1625:1: ( 'var' )
            {
            // InternalPdfMk.g:1625:1: ( 'var' )
            // InternalPdfMk.g:1626:2: 'var'
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
    // InternalPdfMk.g:1635:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1639:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:1640:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
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
    // InternalPdfMk.g:1647:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1651:1: ( ( 'dd' ) )
            // InternalPdfMk.g:1652:1: ( 'dd' )
            {
            // InternalPdfMk.g:1652:1: ( 'dd' )
            // InternalPdfMk.g:1653:2: 'dd'
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
    // InternalPdfMk.g:1662:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1666:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:1667:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
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
    // InternalPdfMk.g:1674:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1678:1: ( ( '=' ) )
            // InternalPdfMk.g:1679:1: ( '=' )
            {
            // InternalPdfMk.g:1679:1: ( '=' )
            // InternalPdfMk.g:1680:2: '='
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
    // InternalPdfMk.g:1689:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1693:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:1694:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
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
    // InternalPdfMk.g:1701:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1705:1: ( ( '{' ) )
            // InternalPdfMk.g:1706:1: ( '{' )
            {
            // InternalPdfMk.g:1706:1: ( '{' )
            // InternalPdfMk.g:1707:2: '{'
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
    // InternalPdfMk.g:1716:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1720:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:1721:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
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
    // InternalPdfMk.g:1728:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1732:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:1733:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:1733:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:1734:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:1735:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:1735:3: rule__DocDefinition__ContentAssignment_4
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
    // InternalPdfMk.g:1743:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1747:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:1748:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
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
    // InternalPdfMk.g:1755:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1759:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:1760:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:1760:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:1761:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:1762:2: ( rule__DocDefinition__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:1762:3: rule__DocDefinition__Group_5__0
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
    // InternalPdfMk.g:1770:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1774:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:1775:2: rule__DocDefinition__Group__6__Impl
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
    // InternalPdfMk.g:1781:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1785:1: ( ( '}' ) )
            // InternalPdfMk.g:1786:1: ( '}' )
            {
            // InternalPdfMk.g:1786:1: ( '}' )
            // InternalPdfMk.g:1787:2: '}'
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
    // InternalPdfMk.g:1797:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1801:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:1802:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
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
    // InternalPdfMk.g:1809:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1813:1: ( ( ',' ) )
            // InternalPdfMk.g:1814:1: ( ',' )
            {
            // InternalPdfMk.g:1814:1: ( ',' )
            // InternalPdfMk.g:1815:2: ','
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
    // InternalPdfMk.g:1824:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1828:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:1829:2: rule__DocDefinition__Group_5__1__Impl
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
    // InternalPdfMk.g:1835:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1839:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:1840:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:1840:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:1841:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:1842:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:1842:3: rule__DocDefinition__StylesAssignment_5_1
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
    // InternalPdfMk.g:1851:1: rule__TypeFaceDefinition__Group__0 : rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 ;
    public final void rule__TypeFaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1855:1: ( rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 )
            // InternalPdfMk.g:1856:2: rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1
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
    // InternalPdfMk.g:1863:1: rule__TypeFaceDefinition__Group__0__Impl : ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TypeFaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1867:1: ( ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1868:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1868:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1869:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1870:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1870:3: rule__TypeFaceDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1878:1: rule__TypeFaceDefinition__Group__1 : rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 ;
    public final void rule__TypeFaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1882:1: ( rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 )
            // InternalPdfMk.g:1883:2: rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2
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
    // InternalPdfMk.g:1890:1: rule__TypeFaceDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeFaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1894:1: ( ( ':' ) )
            // InternalPdfMk.g:1895:1: ( ':' )
            {
            // InternalPdfMk.g:1895:1: ( ':' )
            // InternalPdfMk.g:1896:2: ':'
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
    // InternalPdfMk.g:1905:1: rule__TypeFaceDefinition__Group__2 : rule__TypeFaceDefinition__Group__2__Impl ;
    public final void rule__TypeFaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1909:1: ( rule__TypeFaceDefinition__Group__2__Impl )
            // InternalPdfMk.g:1910:2: rule__TypeFaceDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1916:1: rule__TypeFaceDefinition__Group__2__Impl : ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TypeFaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1920:1: ( ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1921:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1921:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1922:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1923:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1923:3: rule__TypeFaceDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1932:1: rule__TextStyleDefinition__Group__0 : rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 ;
    public final void rule__TextStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1936:1: ( rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 )
            // InternalPdfMk.g:1937:2: rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1
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
    // InternalPdfMk.g:1944:1: rule__TextStyleDefinition__Group__0__Impl : ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1948:1: ( ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1949:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1949:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1950:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1951:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1951:3: rule__TextStyleDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1959:1: rule__TextStyleDefinition__Group__1 : rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 ;
    public final void rule__TextStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1963:1: ( rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 )
            // InternalPdfMk.g:1964:2: rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2
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
    // InternalPdfMk.g:1971:1: rule__TextStyleDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1975:1: ( ( ':' ) )
            // InternalPdfMk.g:1976:1: ( ':' )
            {
            // InternalPdfMk.g:1976:1: ( ':' )
            // InternalPdfMk.g:1977:2: ':'
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
    // InternalPdfMk.g:1986:1: rule__TextStyleDefinition__Group__2 : rule__TextStyleDefinition__Group__2__Impl ;
    public final void rule__TextStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1990:1: ( rule__TextStyleDefinition__Group__2__Impl )
            // InternalPdfMk.g:1991:2: rule__TextStyleDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1997:1: rule__TextStyleDefinition__Group__2__Impl : ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2001:1: ( ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2002:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2002:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2003:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2004:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2004:3: rule__TextStyleDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2013:1: rule__TextDefinition__Group__0 : rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1 ;
    public final void rule__TextDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2017:1: ( rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1 )
            // InternalPdfMk.g:2018:2: rule__TextDefinition__Group__0__Impl rule__TextDefinition__Group__1
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
    // InternalPdfMk.g:2025:1: rule__TextDefinition__Group__0__Impl : ( ( rule__TextDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2029:1: ( ( ( rule__TextDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2030:1: ( ( rule__TextDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2030:1: ( ( rule__TextDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2031:2: ( rule__TextDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2032:2: ( rule__TextDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2032:3: rule__TextDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2040:1: rule__TextDefinition__Group__1 : rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2 ;
    public final void rule__TextDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2044:1: ( rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2 )
            // InternalPdfMk.g:2045:2: rule__TextDefinition__Group__1__Impl rule__TextDefinition__Group__2
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
    // InternalPdfMk.g:2052:1: rule__TextDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2056:1: ( ( ':' ) )
            // InternalPdfMk.g:2057:1: ( ':' )
            {
            // InternalPdfMk.g:2057:1: ( ':' )
            // InternalPdfMk.g:2058:2: ':'
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
    // InternalPdfMk.g:2067:1: rule__TextDefinition__Group__2 : rule__TextDefinition__Group__2__Impl ;
    public final void rule__TextDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2071:1: ( rule__TextDefinition__Group__2__Impl )
            // InternalPdfMk.g:2072:2: rule__TextDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2078:1: rule__TextDefinition__Group__2__Impl : ( ( rule__TextDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2082:1: ( ( ( rule__TextDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2083:1: ( ( rule__TextDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2083:1: ( ( rule__TextDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2084:2: ( rule__TextDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2085:2: ( rule__TextDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2085:3: rule__TextDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2094:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2098:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:2099:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
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
    // InternalPdfMk.g:2106:1: rule__TextAlignmentDefinition__Group__0__Impl : ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2110:1: ( ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2111:1: ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2111:1: ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2112:2: ( rule__TextAlignmentDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2113:2: ( rule__TextAlignmentDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2113:3: rule__TextAlignmentDefinition__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TextAlignmentDefinition__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAssignment_0()); 

            }


            }

        }
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
    // InternalPdfMk.g:2121:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2125:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:2126:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
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
    // InternalPdfMk.g:2133:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2137:1: ( ( ':' ) )
            // InternalPdfMk.g:2138:1: ( ':' )
            {
            // InternalPdfMk.g:2138:1: ( ':' )
            // InternalPdfMk.g:2139:2: ':'
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
    // InternalPdfMk.g:2148:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2152:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:2153:2: rule__TextAlignmentDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2159:1: rule__TextAlignmentDefinition__Group__2__Impl : ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2163:1: ( ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2164:1: ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2164:1: ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2165:2: ( rule__TextAlignmentDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2166:2: ( rule__TextAlignmentDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2166:3: rule__TextAlignmentDefinition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TextAlignmentDefinition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAlignmentDefinitionAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // InternalPdfMk.g:2175:1: rule__ItalicsDefinition__Group__0 : rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 ;
    public final void rule__ItalicsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2179:1: ( rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 )
            // InternalPdfMk.g:2180:2: rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1
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
    // InternalPdfMk.g:2187:1: rule__ItalicsDefinition__Group__0__Impl : ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ItalicsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2191:1: ( ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2192:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2192:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2193:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2194:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2194:3: rule__ItalicsDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2202:1: rule__ItalicsDefinition__Group__1 : rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 ;
    public final void rule__ItalicsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2206:1: ( rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 )
            // InternalPdfMk.g:2207:2: rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2
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
    // InternalPdfMk.g:2214:1: rule__ItalicsDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ItalicsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2218:1: ( ( ':' ) )
            // InternalPdfMk.g:2219:1: ( ':' )
            {
            // InternalPdfMk.g:2219:1: ( ':' )
            // InternalPdfMk.g:2220:2: ':'
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
    // InternalPdfMk.g:2229:1: rule__ItalicsDefinition__Group__2 : rule__ItalicsDefinition__Group__2__Impl ;
    public final void rule__ItalicsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2233:1: ( rule__ItalicsDefinition__Group__2__Impl )
            // InternalPdfMk.g:2234:2: rule__ItalicsDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2240:1: rule__ItalicsDefinition__Group__2__Impl : ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ItalicsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2244:1: ( ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2245:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2245:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2246:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2247:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2247:3: rule__ItalicsDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2256:1: rule__FontSizeDefinition__Group__0 : rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 ;
    public final void rule__FontSizeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2260:1: ( rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 )
            // InternalPdfMk.g:2261:2: rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1
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
    // InternalPdfMk.g:2268:1: rule__FontSizeDefinition__Group__0__Impl : ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__FontSizeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2272:1: ( ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2273:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2273:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2274:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2275:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2275:3: rule__FontSizeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2283:1: rule__FontSizeDefinition__Group__1 : rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 ;
    public final void rule__FontSizeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2287:1: ( rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 )
            // InternalPdfMk.g:2288:2: rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2
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
    // InternalPdfMk.g:2295:1: rule__FontSizeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FontSizeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2299:1: ( ( ':' ) )
            // InternalPdfMk.g:2300:1: ( ':' )
            {
            // InternalPdfMk.g:2300:1: ( ':' )
            // InternalPdfMk.g:2301:2: ':'
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
    // InternalPdfMk.g:2310:1: rule__FontSizeDefinition__Group__2 : rule__FontSizeDefinition__Group__2__Impl ;
    public final void rule__FontSizeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2314:1: ( rule__FontSizeDefinition__Group__2__Impl )
            // InternalPdfMk.g:2315:2: rule__FontSizeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2321:1: rule__FontSizeDefinition__Group__2__Impl : ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__FontSizeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2325:1: ( ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2326:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2326:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2327:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2328:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2328:3: rule__FontSizeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2337:1: rule__WidthDefinition__Group__0 : rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 ;
    public final void rule__WidthDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2341:1: ( rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 )
            // InternalPdfMk.g:2342:2: rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1
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
    // InternalPdfMk.g:2349:1: rule__WidthDefinition__Group__0__Impl : ( ( rule__WidthDefinition__KeyAssignment_0 ) ) ;
    public final void rule__WidthDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2353:1: ( ( ( rule__WidthDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2354:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2354:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2355:2: ( rule__WidthDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2356:2: ( rule__WidthDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2356:3: rule__WidthDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2364:1: rule__WidthDefinition__Group__1 : rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 ;
    public final void rule__WidthDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2368:1: ( rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 )
            // InternalPdfMk.g:2369:2: rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2
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
    // InternalPdfMk.g:2376:1: rule__WidthDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WidthDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2380:1: ( ( ':' ) )
            // InternalPdfMk.g:2381:1: ( ':' )
            {
            // InternalPdfMk.g:2381:1: ( ':' )
            // InternalPdfMk.g:2382:2: ':'
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
    // InternalPdfMk.g:2391:1: rule__WidthDefinition__Group__2 : rule__WidthDefinition__Group__2__Impl ;
    public final void rule__WidthDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2395:1: ( rule__WidthDefinition__Group__2__Impl )
            // InternalPdfMk.g:2396:2: rule__WidthDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2402:1: rule__WidthDefinition__Group__2__Impl : ( ( rule__WidthDefinition__ValueAssignment_2 ) ) ;
    public final void rule__WidthDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2406:1: ( ( ( rule__WidthDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2407:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2407:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2408:2: ( rule__WidthDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2409:2: ( rule__WidthDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2409:3: rule__WidthDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2418:1: rule__ColumnDefinition__Group__0 : rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 ;
    public final void rule__ColumnDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2422:1: ( rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 )
            // InternalPdfMk.g:2423:2: rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1
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
    // InternalPdfMk.g:2430:1: rule__ColumnDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__ColumnDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2434:1: ( ( '{' ) )
            // InternalPdfMk.g:2435:1: ( '{' )
            {
            // InternalPdfMk.g:2435:1: ( '{' )
            // InternalPdfMk.g:2436:2: '{'
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
    // InternalPdfMk.g:2445:1: rule__ColumnDefinition__Group__1 : rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 ;
    public final void rule__ColumnDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2449:1: ( rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 )
            // InternalPdfMk.g:2450:2: rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2
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
    // InternalPdfMk.g:2457:1: rule__ColumnDefinition__Group__1__Impl : ( ( rule__ColumnDefinition__Group_1__0 )? ) ;
    public final void rule__ColumnDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2461:1: ( ( ( rule__ColumnDefinition__Group_1__0 )? ) )
            // InternalPdfMk.g:2462:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            {
            // InternalPdfMk.g:2462:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            // InternalPdfMk.g:2463:2: ( rule__ColumnDefinition__Group_1__0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_1()); 
            // InternalPdfMk.g:2464:2: ( rule__ColumnDefinition__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:2464:3: rule__ColumnDefinition__Group_1__0
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
    // InternalPdfMk.g:2472:1: rule__ColumnDefinition__Group__2 : rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 ;
    public final void rule__ColumnDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2476:1: ( rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 )
            // InternalPdfMk.g:2477:2: rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3
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
    // InternalPdfMk.g:2484:1: rule__ColumnDefinition__Group__2__Impl : ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) ;
    public final void rule__ColumnDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2488:1: ( ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) )
            // InternalPdfMk.g:2489:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            {
            // InternalPdfMk.g:2489:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            // InternalPdfMk.g:2490:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyAssignment_2()); 
            // InternalPdfMk.g:2491:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            // InternalPdfMk.g:2491:3: rule__ColumnDefinition__KeyAssignment_2
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
    // InternalPdfMk.g:2499:1: rule__ColumnDefinition__Group__3 : rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 ;
    public final void rule__ColumnDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2503:1: ( rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 )
            // InternalPdfMk.g:2504:2: rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4
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
    // InternalPdfMk.g:2511:1: rule__ColumnDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2515:1: ( ( ':' ) )
            // InternalPdfMk.g:2516:1: ( ':' )
            {
            // InternalPdfMk.g:2516:1: ( ':' )
            // InternalPdfMk.g:2517:2: ':'
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
    // InternalPdfMk.g:2526:1: rule__ColumnDefinition__Group__4 : rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 ;
    public final void rule__ColumnDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2530:1: ( rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 )
            // InternalPdfMk.g:2531:2: rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5
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
    // InternalPdfMk.g:2538:1: rule__ColumnDefinition__Group__4__Impl : ( ( rule__ColumnDefinition__Group_4__0 ) ) ;
    public final void rule__ColumnDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2542:1: ( ( ( rule__ColumnDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:2543:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:2543:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            // InternalPdfMk.g:2544:2: ( rule__ColumnDefinition__Group_4__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2545:2: ( rule__ColumnDefinition__Group_4__0 )
            // InternalPdfMk.g:2545:3: rule__ColumnDefinition__Group_4__0
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
    // InternalPdfMk.g:2553:1: rule__ColumnDefinition__Group__5 : rule__ColumnDefinition__Group__5__Impl ;
    public final void rule__ColumnDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2557:1: ( rule__ColumnDefinition__Group__5__Impl )
            // InternalPdfMk.g:2558:2: rule__ColumnDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2564:1: rule__ColumnDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ColumnDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2568:1: ( ( '}' ) )
            // InternalPdfMk.g:2569:1: ( '}' )
            {
            // InternalPdfMk.g:2569:1: ( '}' )
            // InternalPdfMk.g:2570:2: '}'
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
    // InternalPdfMk.g:2580:1: rule__ColumnDefinition__Group_1__0 : rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 ;
    public final void rule__ColumnDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2584:1: ( rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 )
            // InternalPdfMk.g:2585:2: rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1
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
    // InternalPdfMk.g:2592:1: rule__ColumnDefinition__Group_1__0__Impl : ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) ;
    public final void rule__ColumnDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2596:1: ( ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:2597:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:2597:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            // InternalPdfMk.g:2598:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGlobalStyleAssignment_1_0()); 
            // InternalPdfMk.g:2599:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            // InternalPdfMk.g:2599:3: rule__ColumnDefinition__GlobalStyleAssignment_1_0
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
    // InternalPdfMk.g:2607:1: rule__ColumnDefinition__Group_1__1 : rule__ColumnDefinition__Group_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2611:1: ( rule__ColumnDefinition__Group_1__1__Impl )
            // InternalPdfMk.g:2612:2: rule__ColumnDefinition__Group_1__1__Impl
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
    // InternalPdfMk.g:2618:1: rule__ColumnDefinition__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2622:1: ( ( ',' ) )
            // InternalPdfMk.g:2623:1: ( ',' )
            {
            // InternalPdfMk.g:2623:1: ( ',' )
            // InternalPdfMk.g:2624:2: ','
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
    // InternalPdfMk.g:2634:1: rule__ColumnDefinition__Group_4__0 : rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 ;
    public final void rule__ColumnDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2638:1: ( rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 )
            // InternalPdfMk.g:2639:2: rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1
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
    // InternalPdfMk.g:2646:1: rule__ColumnDefinition__Group_4__0__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) ;
    public final void rule__ColumnDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2650:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) )
            // InternalPdfMk.g:2651:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            {
            // InternalPdfMk.g:2651:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            // InternalPdfMk.g:2652:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_0()); 
            // InternalPdfMk.g:2653:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPdfMk.g:2653:3: rule__ColumnDefinition__ValueAssignment_4_0
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
    // InternalPdfMk.g:2661:1: rule__ColumnDefinition__Group_4__1 : rule__ColumnDefinition__Group_4__1__Impl ;
    public final void rule__ColumnDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2665:1: ( rule__ColumnDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2666:2: rule__ColumnDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2672:1: rule__ColumnDefinition__Group_4__1__Impl : ( ( rule__ColumnDefinition__Group_4_1__0 )* ) ;
    public final void rule__ColumnDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2676:1: ( ( ( rule__ColumnDefinition__Group_4_1__0 )* ) )
            // InternalPdfMk.g:2677:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:2677:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            // InternalPdfMk.g:2678:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4_1()); 
            // InternalPdfMk.g:2679:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPdfMk.g:2679:3: rule__ColumnDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPdfMk.g:2688:1: rule__ColumnDefinition__Group_4_1__0 : rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 ;
    public final void rule__ColumnDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2692:1: ( rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 )
            // InternalPdfMk.g:2693:2: rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1
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
    // InternalPdfMk.g:2700:1: rule__ColumnDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2704:1: ( ( ',' ) )
            // InternalPdfMk.g:2705:1: ( ',' )
            {
            // InternalPdfMk.g:2705:1: ( ',' )
            // InternalPdfMk.g:2706:2: ','
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
    // InternalPdfMk.g:2715:1: rule__ColumnDefinition__Group_4_1__1 : rule__ColumnDefinition__Group_4_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2719:1: ( rule__ColumnDefinition__Group_4_1__1__Impl )
            // InternalPdfMk.g:2720:2: rule__ColumnDefinition__Group_4_1__1__Impl
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
    // InternalPdfMk.g:2726:1: rule__ColumnDefinition__Group_4_1__1__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) ;
    public final void rule__ColumnDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2730:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:2731:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:2731:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            // InternalPdfMk.g:2732:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_1_1()); 
            // InternalPdfMk.g:2733:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            // InternalPdfMk.g:2733:3: rule__ColumnDefinition__ValueAssignment_4_1_1
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
    // InternalPdfMk.g:2742:1: rule__MarginDefinition__Group__0 : rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 ;
    public final void rule__MarginDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2746:1: ( rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 )
            // InternalPdfMk.g:2747:2: rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1
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
    // InternalPdfMk.g:2754:1: rule__MarginDefinition__Group__0__Impl : ( ( rule__MarginDefinition__KeyAssignment_0 ) ) ;
    public final void rule__MarginDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2758:1: ( ( ( rule__MarginDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2759:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2759:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2760:2: ( rule__MarginDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2761:2: ( rule__MarginDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2761:3: rule__MarginDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2769:1: rule__MarginDefinition__Group__1 : rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 ;
    public final void rule__MarginDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2773:1: ( rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 )
            // InternalPdfMk.g:2774:2: rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2
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
    // InternalPdfMk.g:2781:1: rule__MarginDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MarginDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2785:1: ( ( ':' ) )
            // InternalPdfMk.g:2786:1: ( ':' )
            {
            // InternalPdfMk.g:2786:1: ( ':' )
            // InternalPdfMk.g:2787:2: ':'
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
    // InternalPdfMk.g:2796:1: rule__MarginDefinition__Group__2 : rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 ;
    public final void rule__MarginDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2800:1: ( rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 )
            // InternalPdfMk.g:2801:2: rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3
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
    // InternalPdfMk.g:2808:1: rule__MarginDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__MarginDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2812:1: ( ( '[' ) )
            // InternalPdfMk.g:2813:1: ( '[' )
            {
            // InternalPdfMk.g:2813:1: ( '[' )
            // InternalPdfMk.g:2814:2: '['
            {
             before(grammarAccess.getMarginDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:2823:1: rule__MarginDefinition__Group__3 : rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 ;
    public final void rule__MarginDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2827:1: ( rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 )
            // InternalPdfMk.g:2828:2: rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4
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
    // InternalPdfMk.g:2835:1: rule__MarginDefinition__Group__3__Impl : ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) ;
    public final void rule__MarginDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2839:1: ( ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) )
            // InternalPdfMk.g:2840:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            {
            // InternalPdfMk.g:2840:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            // InternalPdfMk.g:2841:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:2842:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:2842:3: rule__MarginDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:2850:1: rule__MarginDefinition__Group__4 : rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 ;
    public final void rule__MarginDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2854:1: ( rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 )
            // InternalPdfMk.g:2855:2: rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5
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
    // InternalPdfMk.g:2862:1: rule__MarginDefinition__Group__4__Impl : ( ( rule__MarginDefinition__Group_4__0 )* ) ;
    public final void rule__MarginDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2866:1: ( ( ( rule__MarginDefinition__Group_4__0 )* ) )
            // InternalPdfMk.g:2867:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            {
            // InternalPdfMk.g:2867:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            // InternalPdfMk.g:2868:2: ( rule__MarginDefinition__Group_4__0 )*
            {
             before(grammarAccess.getMarginDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2869:2: ( rule__MarginDefinition__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPdfMk.g:2869:3: rule__MarginDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MarginDefinition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPdfMk.g:2877:1: rule__MarginDefinition__Group__5 : rule__MarginDefinition__Group__5__Impl ;
    public final void rule__MarginDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2881:1: ( rule__MarginDefinition__Group__5__Impl )
            // InternalPdfMk.g:2882:2: rule__MarginDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2888:1: rule__MarginDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__MarginDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2892:1: ( ( ']' ) )
            // InternalPdfMk.g:2893:1: ( ']' )
            {
            // InternalPdfMk.g:2893:1: ( ']' )
            // InternalPdfMk.g:2894:2: ']'
            {
             before(grammarAccess.getMarginDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:2904:1: rule__MarginDefinition__Group_4__0 : rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 ;
    public final void rule__MarginDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2908:1: ( rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 )
            // InternalPdfMk.g:2909:2: rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1
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
    // InternalPdfMk.g:2916:1: rule__MarginDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MarginDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2920:1: ( ( ',' ) )
            // InternalPdfMk.g:2921:1: ( ',' )
            {
            // InternalPdfMk.g:2921:1: ( ',' )
            // InternalPdfMk.g:2922:2: ','
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
    // InternalPdfMk.g:2931:1: rule__MarginDefinition__Group_4__1 : rule__MarginDefinition__Group_4__1__Impl ;
    public final void rule__MarginDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2935:1: ( rule__MarginDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2936:2: rule__MarginDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2942:1: rule__MarginDefinition__Group_4__1__Impl : ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__MarginDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2946:1: ( ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:2947:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:2947:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:2948:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:2949:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:2949:3: rule__MarginDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:2958:1: rule__ImageDefintion__Group__0 : rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 ;
    public final void rule__ImageDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2962:1: ( rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 )
            // InternalPdfMk.g:2963:2: rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1
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
    // InternalPdfMk.g:2970:1: rule__ImageDefintion__Group__0__Impl : ( ( rule__ImageDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2974:1: ( ( ( rule__ImageDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2975:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2975:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2976:2: ( rule__ImageDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2977:2: ( rule__ImageDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2977:3: rule__ImageDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2985:1: rule__ImageDefintion__Group__1 : rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 ;
    public final void rule__ImageDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2989:1: ( rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 )
            // InternalPdfMk.g:2990:2: rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2
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
    // InternalPdfMk.g:2997:1: rule__ImageDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3001:1: ( ( ':' ) )
            // InternalPdfMk.g:3002:1: ( ':' )
            {
            // InternalPdfMk.g:3002:1: ( ':' )
            // InternalPdfMk.g:3003:2: ':'
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
    // InternalPdfMk.g:3012:1: rule__ImageDefintion__Group__2 : rule__ImageDefintion__Group__2__Impl ;
    public final void rule__ImageDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3016:1: ( rule__ImageDefintion__Group__2__Impl )
            // InternalPdfMk.g:3017:2: rule__ImageDefintion__Group__2__Impl
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
    // InternalPdfMk.g:3023:1: rule__ImageDefintion__Group__2__Impl : ( ( rule__ImageDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3027:1: ( ( ( rule__ImageDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3028:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3028:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:3029:2: ( rule__ImageDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3030:2: ( rule__ImageDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:3030:3: rule__ImageDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:3039:1: rule__ImageWidthDefintion__Group__0 : rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 ;
    public final void rule__ImageWidthDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3043:1: ( rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 )
            // InternalPdfMk.g:3044:2: rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1
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
    // InternalPdfMk.g:3051:1: rule__ImageWidthDefintion__Group__0__Impl : ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageWidthDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3055:1: ( ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3056:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3056:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:3057:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3058:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:3058:3: rule__ImageWidthDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:3066:1: rule__ImageWidthDefintion__Group__1 : rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 ;
    public final void rule__ImageWidthDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3070:1: ( rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 )
            // InternalPdfMk.g:3071:2: rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2
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
    // InternalPdfMk.g:3078:1: rule__ImageWidthDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageWidthDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3082:1: ( ( ':' ) )
            // InternalPdfMk.g:3083:1: ( ':' )
            {
            // InternalPdfMk.g:3083:1: ( ':' )
            // InternalPdfMk.g:3084:2: ':'
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
    // InternalPdfMk.g:3093:1: rule__ImageWidthDefintion__Group__2 : rule__ImageWidthDefintion__Group__2__Impl ;
    public final void rule__ImageWidthDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3097:1: ( rule__ImageWidthDefintion__Group__2__Impl )
            // InternalPdfMk.g:3098:2: rule__ImageWidthDefintion__Group__2__Impl
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
    // InternalPdfMk.g:3104:1: rule__ImageWidthDefintion__Group__2__Impl : ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageWidthDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3108:1: ( ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3109:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3109:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:3110:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3111:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:3111:3: rule__ImageWidthDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:3120:1: rule__ImageHeightDefintion__Group__0 : rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 ;
    public final void rule__ImageHeightDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3124:1: ( rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 )
            // InternalPdfMk.g:3125:2: rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1
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
    // InternalPdfMk.g:3132:1: rule__ImageHeightDefintion__Group__0__Impl : ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageHeightDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3136:1: ( ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3137:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3137:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:3138:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3139:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:3139:3: rule__ImageHeightDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:3147:1: rule__ImageHeightDefintion__Group__1 : rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 ;
    public final void rule__ImageHeightDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3151:1: ( rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 )
            // InternalPdfMk.g:3152:2: rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2
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
    // InternalPdfMk.g:3159:1: rule__ImageHeightDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageHeightDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3163:1: ( ( ':' ) )
            // InternalPdfMk.g:3164:1: ( ':' )
            {
            // InternalPdfMk.g:3164:1: ( ':' )
            // InternalPdfMk.g:3165:2: ':'
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
    // InternalPdfMk.g:3174:1: rule__ImageHeightDefintion__Group__2 : rule__ImageHeightDefintion__Group__2__Impl ;
    public final void rule__ImageHeightDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3178:1: ( rule__ImageHeightDefintion__Group__2__Impl )
            // InternalPdfMk.g:3179:2: rule__ImageHeightDefintion__Group__2__Impl
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
    // InternalPdfMk.g:3185:1: rule__ImageHeightDefintion__Group__2__Impl : ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageHeightDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3189:1: ( ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3190:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3190:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:3191:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3192:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:3192:3: rule__ImageHeightDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:3201:1: rule__ImagePageBreakDefinition__Group__0 : rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 ;
    public final void rule__ImagePageBreakDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3205:1: ( rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 )
            // InternalPdfMk.g:3206:2: rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1
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
    // InternalPdfMk.g:3213:1: rule__ImagePageBreakDefinition__Group__0__Impl : ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3217:1: ( ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3218:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3218:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3219:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3220:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3220:3: rule__ImagePageBreakDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3228:1: rule__ImagePageBreakDefinition__Group__1 : rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 ;
    public final void rule__ImagePageBreakDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3232:1: ( rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 )
            // InternalPdfMk.g:3233:2: rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2
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
    // InternalPdfMk.g:3240:1: rule__ImagePageBreakDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImagePageBreakDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3244:1: ( ( ':' ) )
            // InternalPdfMk.g:3245:1: ( ':' )
            {
            // InternalPdfMk.g:3245:1: ( ':' )
            // InternalPdfMk.g:3246:2: ':'
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
    // InternalPdfMk.g:3255:1: rule__ImagePageBreakDefinition__Group__2 : rule__ImagePageBreakDefinition__Group__2__Impl ;
    public final void rule__ImagePageBreakDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3259:1: ( rule__ImagePageBreakDefinition__Group__2__Impl )
            // InternalPdfMk.g:3260:2: rule__ImagePageBreakDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3266:1: rule__ImagePageBreakDefinition__Group__2__Impl : ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3270:1: ( ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3271:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3271:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3272:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3273:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3273:3: rule__ImagePageBreakDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3282:1: rule__ImageFitDefinition__Group__0 : rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 ;
    public final void rule__ImageFitDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3286:1: ( rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 )
            // InternalPdfMk.g:3287:2: rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1
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
    // InternalPdfMk.g:3294:1: rule__ImageFitDefinition__Group__0__Impl : ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageFitDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3298:1: ( ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3299:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3299:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3300:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3301:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3301:3: rule__ImageFitDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3309:1: rule__ImageFitDefinition__Group__1 : rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 ;
    public final void rule__ImageFitDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3313:1: ( rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 )
            // InternalPdfMk.g:3314:2: rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2
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
    // InternalPdfMk.g:3321:1: rule__ImageFitDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageFitDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3325:1: ( ( ':' ) )
            // InternalPdfMk.g:3326:1: ( ':' )
            {
            // InternalPdfMk.g:3326:1: ( ':' )
            // InternalPdfMk.g:3327:2: ':'
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
    // InternalPdfMk.g:3336:1: rule__ImageFitDefinition__Group__2 : rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 ;
    public final void rule__ImageFitDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3340:1: ( rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 )
            // InternalPdfMk.g:3341:2: rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3
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
    // InternalPdfMk.g:3348:1: rule__ImageFitDefinition__Group__2__Impl : ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageFitDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3352:1: ( ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3353:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3353:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3354:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3355:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3355:3: rule__ImageFitDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3363:1: rule__ImageFitDefinition__Group__3 : rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 ;
    public final void rule__ImageFitDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3367:1: ( rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 )
            // InternalPdfMk.g:3368:2: rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4
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
    // InternalPdfMk.g:3375:1: rule__ImageFitDefinition__Group__3__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) ;
    public final void rule__ImageFitDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3379:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) )
            // InternalPdfMk.g:3380:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            {
            // InternalPdfMk.g:3380:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            // InternalPdfMk.g:3381:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:3382:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            // InternalPdfMk.g:3382:3: rule__ImageFitDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:3390:1: rule__ImageFitDefinition__Group__4 : rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 ;
    public final void rule__ImageFitDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3394:1: ( rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 )
            // InternalPdfMk.g:3395:2: rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5
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
    // InternalPdfMk.g:3402:1: rule__ImageFitDefinition__Group__4__Impl : ( ( rule__ImageFitDefinition__Group_4__0 ) ) ;
    public final void rule__ImageFitDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3406:1: ( ( ( rule__ImageFitDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:3407:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:3407:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            // InternalPdfMk.g:3408:2: ( rule__ImageFitDefinition__Group_4__0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:3409:2: ( rule__ImageFitDefinition__Group_4__0 )
            // InternalPdfMk.g:3409:3: rule__ImageFitDefinition__Group_4__0
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
    // InternalPdfMk.g:3417:1: rule__ImageFitDefinition__Group__5 : rule__ImageFitDefinition__Group__5__Impl ;
    public final void rule__ImageFitDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3421:1: ( rule__ImageFitDefinition__Group__5__Impl )
            // InternalPdfMk.g:3422:2: rule__ImageFitDefinition__Group__5__Impl
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
    // InternalPdfMk.g:3428:1: rule__ImageFitDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ImageFitDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3432:1: ( ( ']' ) )
            // InternalPdfMk.g:3433:1: ( ']' )
            {
            // InternalPdfMk.g:3433:1: ( ']' )
            // InternalPdfMk.g:3434:2: ']'
            {
             before(grammarAccess.getImageFitDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:3444:1: rule__ImageFitDefinition__Group_4__0 : rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 ;
    public final void rule__ImageFitDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3448:1: ( rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 )
            // InternalPdfMk.g:3449:2: rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1
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
    // InternalPdfMk.g:3456:1: rule__ImageFitDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageFitDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3460:1: ( ( ',' ) )
            // InternalPdfMk.g:3461:1: ( ',' )
            {
            // InternalPdfMk.g:3461:1: ( ',' )
            // InternalPdfMk.g:3462:2: ','
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
    // InternalPdfMk.g:3471:1: rule__ImageFitDefinition__Group_4__1 : rule__ImageFitDefinition__Group_4__1__Impl ;
    public final void rule__ImageFitDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3475:1: ( rule__ImageFitDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:3476:2: rule__ImageFitDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:3482:1: rule__ImageFitDefinition__Group_4__1__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__ImageFitDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3486:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:3487:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:3487:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:3488:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:3489:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:3489:3: rule__ImageFitDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:3498:1: rule__ImageOpacityDefinition__Group__0 : rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 ;
    public final void rule__ImageOpacityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3502:1: ( rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 )
            // InternalPdfMk.g:3503:2: rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1
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
    // InternalPdfMk.g:3510:1: rule__ImageOpacityDefinition__Group__0__Impl : ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3514:1: ( ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3515:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3515:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3516:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3517:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3517:3: rule__ImageOpacityDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3525:1: rule__ImageOpacityDefinition__Group__1 : rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 ;
    public final void rule__ImageOpacityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3529:1: ( rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 )
            // InternalPdfMk.g:3530:2: rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2
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
    // InternalPdfMk.g:3537:1: rule__ImageOpacityDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageOpacityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3541:1: ( ( ':' ) )
            // InternalPdfMk.g:3542:1: ( ':' )
            {
            // InternalPdfMk.g:3542:1: ( ':' )
            // InternalPdfMk.g:3543:2: ':'
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
    // InternalPdfMk.g:3552:1: rule__ImageOpacityDefinition__Group__2 : rule__ImageOpacityDefinition__Group__2__Impl ;
    public final void rule__ImageOpacityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3556:1: ( rule__ImageOpacityDefinition__Group__2__Impl )
            // InternalPdfMk.g:3557:2: rule__ImageOpacityDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3563:1: rule__ImageOpacityDefinition__Group__2__Impl : ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3567:1: ( ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3568:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3568:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3569:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3570:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3570:3: rule__ImageOpacityDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3579:1: rule__ListReversedDefinition__Group__0 : rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 ;
    public final void rule__ListReversedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3583:1: ( rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 )
            // InternalPdfMk.g:3584:2: rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1
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
    // InternalPdfMk.g:3591:1: rule__ListReversedDefinition__Group__0__Impl : ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListReversedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3595:1: ( ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3596:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3596:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3597:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3598:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3598:3: rule__ListReversedDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3606:1: rule__ListReversedDefinition__Group__1 : rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 ;
    public final void rule__ListReversedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3610:1: ( rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 )
            // InternalPdfMk.g:3611:2: rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2
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
    // InternalPdfMk.g:3618:1: rule__ListReversedDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListReversedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3622:1: ( ( ':' ) )
            // InternalPdfMk.g:3623:1: ( ':' )
            {
            // InternalPdfMk.g:3623:1: ( ':' )
            // InternalPdfMk.g:3624:2: ':'
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
    // InternalPdfMk.g:3633:1: rule__ListReversedDefinition__Group__2 : rule__ListReversedDefinition__Group__2__Impl ;
    public final void rule__ListReversedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3637:1: ( rule__ListReversedDefinition__Group__2__Impl )
            // InternalPdfMk.g:3638:2: rule__ListReversedDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3644:1: rule__ListReversedDefinition__Group__2__Impl : ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListReversedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3648:1: ( ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3649:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3649:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3650:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3651:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3651:3: rule__ListReversedDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3660:1: rule__ListCounterDefinition__Group__0 : rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 ;
    public final void rule__ListCounterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3664:1: ( rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 )
            // InternalPdfMk.g:3665:2: rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1
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
    // InternalPdfMk.g:3672:1: rule__ListCounterDefinition__Group__0__Impl : ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListCounterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3676:1: ( ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3677:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3677:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3678:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3679:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3679:3: rule__ListCounterDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3687:1: rule__ListCounterDefinition__Group__1 : rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 ;
    public final void rule__ListCounterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3691:1: ( rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 )
            // InternalPdfMk.g:3692:2: rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2
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
    // InternalPdfMk.g:3699:1: rule__ListCounterDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListCounterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3703:1: ( ( ':' ) )
            // InternalPdfMk.g:3704:1: ( ':' )
            {
            // InternalPdfMk.g:3704:1: ( ':' )
            // InternalPdfMk.g:3705:2: ':'
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
    // InternalPdfMk.g:3714:1: rule__ListCounterDefinition__Group__2 : rule__ListCounterDefinition__Group__2__Impl ;
    public final void rule__ListCounterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3718:1: ( rule__ListCounterDefinition__Group__2__Impl )
            // InternalPdfMk.g:3719:2: rule__ListCounterDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3725:1: rule__ListCounterDefinition__Group__2__Impl : ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListCounterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3729:1: ( ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3730:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3730:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3731:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3732:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3732:3: rule__ListCounterDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3741:1: rule__ListTypeDefinition__Group__0 : rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 ;
    public final void rule__ListTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3745:1: ( rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 )
            // InternalPdfMk.g:3746:2: rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1
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
    // InternalPdfMk.g:3753:1: rule__ListTypeDefinition__Group__0__Impl : ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3757:1: ( ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3758:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3758:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3759:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3760:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3760:3: rule__ListTypeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3768:1: rule__ListTypeDefinition__Group__1 : rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 ;
    public final void rule__ListTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3772:1: ( rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 )
            // InternalPdfMk.g:3773:2: rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2
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
    // InternalPdfMk.g:3780:1: rule__ListTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3784:1: ( ( ':' ) )
            // InternalPdfMk.g:3785:1: ( ':' )
            {
            // InternalPdfMk.g:3785:1: ( ':' )
            // InternalPdfMk.g:3786:2: ':'
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
    // InternalPdfMk.g:3795:1: rule__ListTypeDefinition__Group__2 : rule__ListTypeDefinition__Group__2__Impl ;
    public final void rule__ListTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3799:1: ( rule__ListTypeDefinition__Group__2__Impl )
            // InternalPdfMk.g:3800:2: rule__ListTypeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3806:1: rule__ListTypeDefinition__Group__2__Impl : ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3810:1: ( ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3811:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3811:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3812:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3813:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3813:3: rule__ListTypeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3822:1: rule__ListColorDefinition__Group__0 : rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 ;
    public final void rule__ListColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3826:1: ( rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 )
            // InternalPdfMk.g:3827:2: rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1
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
    // InternalPdfMk.g:3834:1: rule__ListColorDefinition__Group__0__Impl : ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3838:1: ( ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3839:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3839:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3840:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3841:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3841:3: rule__ListColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3849:1: rule__ListColorDefinition__Group__1 : rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 ;
    public final void rule__ListColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3853:1: ( rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 )
            // InternalPdfMk.g:3854:2: rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2
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
    // InternalPdfMk.g:3861:1: rule__ListColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3865:1: ( ( ':' ) )
            // InternalPdfMk.g:3866:1: ( ':' )
            {
            // InternalPdfMk.g:3866:1: ( ':' )
            // InternalPdfMk.g:3867:2: ':'
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
    // InternalPdfMk.g:3876:1: rule__ListColorDefinition__Group__2 : rule__ListColorDefinition__Group__2__Impl ;
    public final void rule__ListColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3880:1: ( rule__ListColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3881:2: rule__ListColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3887:1: rule__ListColorDefinition__Group__2__Impl : ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3891:1: ( ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3892:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3892:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3893:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3894:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3894:3: rule__ListColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3903:1: rule__ListMarkerColorDefinition__Group__0 : rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 ;
    public final void rule__ListMarkerColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3907:1: ( rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 )
            // InternalPdfMk.g:3908:2: rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1
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
    // InternalPdfMk.g:3915:1: rule__ListMarkerColorDefinition__Group__0__Impl : ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3919:1: ( ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3920:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3920:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3921:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3922:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3922:3: rule__ListMarkerColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3930:1: rule__ListMarkerColorDefinition__Group__1 : rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 ;
    public final void rule__ListMarkerColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3934:1: ( rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 )
            // InternalPdfMk.g:3935:2: rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2
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
    // InternalPdfMk.g:3942:1: rule__ListMarkerColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListMarkerColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3946:1: ( ( ':' ) )
            // InternalPdfMk.g:3947:1: ( ':' )
            {
            // InternalPdfMk.g:3947:1: ( ':' )
            // InternalPdfMk.g:3948:2: ':'
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
    // InternalPdfMk.g:3957:1: rule__ListMarkerColorDefinition__Group__2 : rule__ListMarkerColorDefinition__Group__2__Impl ;
    public final void rule__ListMarkerColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3961:1: ( rule__ListMarkerColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3962:2: rule__ListMarkerColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3968:1: rule__ListMarkerColorDefinition__Group__2__Impl : ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3972:1: ( ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3973:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3973:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3974:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3975:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3975:3: rule__ListMarkerColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3984:1: rule__TableRowDefinition__Group__0 : rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 ;
    public final void rule__TableRowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3988:1: ( rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 )
            // InternalPdfMk.g:3989:2: rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1
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
    // InternalPdfMk.g:3996:1: rule__TableRowDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4000:1: ( ( '[' ) )
            // InternalPdfMk.g:4001:1: ( '[' )
            {
            // InternalPdfMk.g:4001:1: ( '[' )
            // InternalPdfMk.g:4002:2: '['
            {
             before(grammarAccess.getTableRowDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:4011:1: rule__TableRowDefinition__Group__1 : rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 ;
    public final void rule__TableRowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4015:1: ( rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 )
            // InternalPdfMk.g:4016:2: rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2
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
    // InternalPdfMk.g:4023:1: rule__TableRowDefinition__Group__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) ;
    public final void rule__TableRowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4027:1: ( ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) )
            // InternalPdfMk.g:4028:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            {
            // InternalPdfMk.g:4028:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            // InternalPdfMk.g:4029:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_1()); 
            // InternalPdfMk.g:4030:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            // InternalPdfMk.g:4030:3: rule__TableRowDefinition__ItemAssignment_1
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
    // InternalPdfMk.g:4038:1: rule__TableRowDefinition__Group__2 : rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 ;
    public final void rule__TableRowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4042:1: ( rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 )
            // InternalPdfMk.g:4043:2: rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3
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
    // InternalPdfMk.g:4050:1: rule__TableRowDefinition__Group__2__Impl : ( ( rule__TableRowDefinition__Group_2__0 ) ) ;
    public final void rule__TableRowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4054:1: ( ( ( rule__TableRowDefinition__Group_2__0 ) ) )
            // InternalPdfMk.g:4055:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            {
            // InternalPdfMk.g:4055:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            // InternalPdfMk.g:4056:2: ( rule__TableRowDefinition__Group_2__0 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getGroup_2()); 
            // InternalPdfMk.g:4057:2: ( rule__TableRowDefinition__Group_2__0 )
            // InternalPdfMk.g:4057:3: rule__TableRowDefinition__Group_2__0
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
    // InternalPdfMk.g:4065:1: rule__TableRowDefinition__Group__3 : rule__TableRowDefinition__Group__3__Impl ;
    public final void rule__TableRowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4069:1: ( rule__TableRowDefinition__Group__3__Impl )
            // InternalPdfMk.g:4070:2: rule__TableRowDefinition__Group__3__Impl
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
    // InternalPdfMk.g:4076:1: rule__TableRowDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4080:1: ( ( ']' ) )
            // InternalPdfMk.g:4081:1: ( ']' )
            {
            // InternalPdfMk.g:4081:1: ( ']' )
            // InternalPdfMk.g:4082:2: ']'
            {
             before(grammarAccess.getTableRowDefinitionAccess().getRightSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:4092:1: rule__TableRowDefinition__Group_2__0 : rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 ;
    public final void rule__TableRowDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4096:1: ( rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 )
            // InternalPdfMk.g:4097:2: rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1
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
    // InternalPdfMk.g:4104:1: rule__TableRowDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRowDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4108:1: ( ( ',' ) )
            // InternalPdfMk.g:4109:1: ( ',' )
            {
            // InternalPdfMk.g:4109:1: ( ',' )
            // InternalPdfMk.g:4110:2: ','
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
    // InternalPdfMk.g:4119:1: rule__TableRowDefinition__Group_2__1 : rule__TableRowDefinition__Group_2__1__Impl ;
    public final void rule__TableRowDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4123:1: ( rule__TableRowDefinition__Group_2__1__Impl )
            // InternalPdfMk.g:4124:2: rule__TableRowDefinition__Group_2__1__Impl
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
    // InternalPdfMk.g:4130:1: rule__TableRowDefinition__Group_2__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) ;
    public final void rule__TableRowDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4134:1: ( ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) )
            // InternalPdfMk.g:4135:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            {
            // InternalPdfMk.g:4135:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            // InternalPdfMk.g:4136:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_2_1()); 
            // InternalPdfMk.g:4137:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            // InternalPdfMk.g:4137:3: rule__TableRowDefinition__ItemAssignment_2_1
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
    // InternalPdfMk.g:4146:1: rule__TableBodyDefinition__Group__0 : rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 ;
    public final void rule__TableBodyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4150:1: ( rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 )
            // InternalPdfMk.g:4151:2: rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1
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
    // InternalPdfMk.g:4158:1: rule__TableBodyDefinition__Group__0__Impl : ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableBodyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4162:1: ( ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4163:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4163:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:4164:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4165:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:4165:3: rule__TableBodyDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:4173:1: rule__TableBodyDefinition__Group__1 : rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 ;
    public final void rule__TableBodyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4177:1: ( rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 )
            // InternalPdfMk.g:4178:2: rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2
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
    // InternalPdfMk.g:4185:1: rule__TableBodyDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableBodyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4189:1: ( ( ':' ) )
            // InternalPdfMk.g:4190:1: ( ':' )
            {
            // InternalPdfMk.g:4190:1: ( ':' )
            // InternalPdfMk.g:4191:2: ':'
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
    // InternalPdfMk.g:4200:1: rule__TableBodyDefinition__Group__2 : rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 ;
    public final void rule__TableBodyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4204:1: ( rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 )
            // InternalPdfMk.g:4205:2: rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3
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
    // InternalPdfMk.g:4212:1: rule__TableBodyDefinition__Group__2__Impl : ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableBodyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4216:1: ( ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4217:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4217:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:4218:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4219:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:4219:3: rule__TableBodyDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:4227:1: rule__TableBodyDefinition__Group__3 : rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 ;
    public final void rule__TableBodyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4231:1: ( rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 )
            // InternalPdfMk.g:4232:2: rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4
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
    // InternalPdfMk.g:4239:1: rule__TableBodyDefinition__Group__3__Impl : ( ( rule__TableBodyDefinition__Group_3__0 ) ) ;
    public final void rule__TableBodyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4243:1: ( ( ( rule__TableBodyDefinition__Group_3__0 ) ) )
            // InternalPdfMk.g:4244:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            {
            // InternalPdfMk.g:4244:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            // InternalPdfMk.g:4245:2: ( rule__TableBodyDefinition__Group_3__0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3()); 
            // InternalPdfMk.g:4246:2: ( rule__TableBodyDefinition__Group_3__0 )
            // InternalPdfMk.g:4246:3: rule__TableBodyDefinition__Group_3__0
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
    // InternalPdfMk.g:4254:1: rule__TableBodyDefinition__Group__4 : rule__TableBodyDefinition__Group__4__Impl ;
    public final void rule__TableBodyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4258:1: ( rule__TableBodyDefinition__Group__4__Impl )
            // InternalPdfMk.g:4259:2: rule__TableBodyDefinition__Group__4__Impl
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
    // InternalPdfMk.g:4265:1: rule__TableBodyDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__TableBodyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4269:1: ( ( ']' ) )
            // InternalPdfMk.g:4270:1: ( ']' )
            {
            // InternalPdfMk.g:4270:1: ( ']' )
            // InternalPdfMk.g:4271:2: ']'
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:4281:1: rule__TableBodyDefinition__Group_3__0 : rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 ;
    public final void rule__TableBodyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4285:1: ( rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 )
            // InternalPdfMk.g:4286:2: rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1
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
    // InternalPdfMk.g:4293:1: rule__TableBodyDefinition__Group_3__0__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) ;
    public final void rule__TableBodyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4297:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) )
            // InternalPdfMk.g:4298:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            {
            // InternalPdfMk.g:4298:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            // InternalPdfMk.g:4299:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_0()); 
            // InternalPdfMk.g:4300:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            // InternalPdfMk.g:4300:3: rule__TableBodyDefinition__RowsAssignment_3_0
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
    // InternalPdfMk.g:4308:1: rule__TableBodyDefinition__Group_3__1 : rule__TableBodyDefinition__Group_3__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4312:1: ( rule__TableBodyDefinition__Group_3__1__Impl )
            // InternalPdfMk.g:4313:2: rule__TableBodyDefinition__Group_3__1__Impl
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
    // InternalPdfMk.g:4319:1: rule__TableBodyDefinition__Group_3__1__Impl : ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) ;
    public final void rule__TableBodyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4323:1: ( ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) )
            // InternalPdfMk.g:4324:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:4324:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            // InternalPdfMk.g:4325:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3_1()); 
            // InternalPdfMk.g:4326:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPdfMk.g:4326:3: rule__TableBodyDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TableBodyDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPdfMk.g:4335:1: rule__TableBodyDefinition__Group_3_1__0 : rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 ;
    public final void rule__TableBodyDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4339:1: ( rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 )
            // InternalPdfMk.g:4340:2: rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1
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
    // InternalPdfMk.g:4347:1: rule__TableBodyDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__TableBodyDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4351:1: ( ( ',' ) )
            // InternalPdfMk.g:4352:1: ( ',' )
            {
            // InternalPdfMk.g:4352:1: ( ',' )
            // InternalPdfMk.g:4353:2: ','
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
    // InternalPdfMk.g:4362:1: rule__TableBodyDefinition__Group_3_1__1 : rule__TableBodyDefinition__Group_3_1__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4366:1: ( rule__TableBodyDefinition__Group_3_1__1__Impl )
            // InternalPdfMk.g:4367:2: rule__TableBodyDefinition__Group_3_1__1__Impl
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
    // InternalPdfMk.g:4373:1: rule__TableBodyDefinition__Group_3_1__1__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) ;
    public final void rule__TableBodyDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4377:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:4378:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:4378:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            // InternalPdfMk.g:4379:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_1_1()); 
            // InternalPdfMk.g:4380:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            // InternalPdfMk.g:4380:3: rule__TableBodyDefinition__RowsAssignment_3_1_1
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
    // InternalPdfMk.g:4389:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4393:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // InternalPdfMk.g:4394:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
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
    // InternalPdfMk.g:4401:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4405:1: ( ( ( rule__TableDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4406:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4406:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:4407:2: ( rule__TableDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4408:2: ( rule__TableDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:4408:3: rule__TableDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:4416:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4420:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // InternalPdfMk.g:4421:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
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
    // InternalPdfMk.g:4428:1: rule__TableDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4432:1: ( ( ':' ) )
            // InternalPdfMk.g:4433:1: ( ':' )
            {
            // InternalPdfMk.g:4433:1: ( ':' )
            // InternalPdfMk.g:4434:2: ':'
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
    // InternalPdfMk.g:4443:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4447:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // InternalPdfMk.g:4448:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
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
    // InternalPdfMk.g:4455:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4459:1: ( ( ( rule__TableDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4460:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4460:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:4461:2: ( rule__TableDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4462:2: ( rule__TableDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:4462:3: rule__TableDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:4470:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4474:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // InternalPdfMk.g:4475:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
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
    // InternalPdfMk.g:4482:1: rule__TableDefinition__Group__3__Impl : ( ( rule__TableDefinition__BodyAssignment_3 ) ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4486:1: ( ( ( rule__TableDefinition__BodyAssignment_3 ) ) )
            // InternalPdfMk.g:4487:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            {
            // InternalPdfMk.g:4487:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            // InternalPdfMk.g:4488:2: ( rule__TableDefinition__BodyAssignment_3 )
            {
             before(grammarAccess.getTableDefinitionAccess().getBodyAssignment_3()); 
            // InternalPdfMk.g:4489:2: ( rule__TableDefinition__BodyAssignment_3 )
            // InternalPdfMk.g:4489:3: rule__TableDefinition__BodyAssignment_3
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
    // InternalPdfMk.g:4497:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4501:1: ( rule__TableDefinition__Group__4__Impl )
            // InternalPdfMk.g:4502:2: rule__TableDefinition__Group__4__Impl
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
    // InternalPdfMk.g:4508:1: rule__TableDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4512:1: ( ( '}' ) )
            // InternalPdfMk.g:4513:1: ( '}' )
            {
            // InternalPdfMk.g:4513:1: ( '}' )
            // InternalPdfMk.g:4514:2: '}'
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


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0__0"
    // InternalPdfMk.g:4524:1: rule__InnerColumnObjectMembersWrapper__Group_0__0 : rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl rule__InnerColumnObjectMembersWrapper__Group_0__1 ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4528:1: ( rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl rule__InnerColumnObjectMembersWrapper__Group_0__1 )
            // InternalPdfMk.g:4529:2: rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl rule__InnerColumnObjectMembersWrapper__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0__0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl"
    // InternalPdfMk.g:4536:1: rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl : ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 )? ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4540:1: ( ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 )? ) )
            // InternalPdfMk.g:4541:1: ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 )? )
            {
            // InternalPdfMk.g:4541:1: ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 )? )
            // InternalPdfMk.g:4542:2: ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 )?
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextAssignment_0_0()); 
            // InternalPdfMk.g:4543:2: ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:4543:3: rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0__0__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0__1"
    // InternalPdfMk.g:4551:1: rule__InnerColumnObjectMembersWrapper__Group_0__1 : rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4555:1: ( rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl )
            // InternalPdfMk.g:4556:2: rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0__1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl"
    // InternalPdfMk.g:4562:1: rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl : ( ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0 )* ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4566:1: ( ( ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0 )* ) )
            // InternalPdfMk.g:4567:1: ( ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0 )* )
            {
            // InternalPdfMk.g:4567:1: ( ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0 )* )
            // InternalPdfMk.g:4568:2: ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_0_1()); 
            // InternalPdfMk.g:4569:2: ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPdfMk.g:4569:3: rule__InnerColumnObjectMembersWrapper__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObjectMembersWrapper__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0__1__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0_1__0"
    // InternalPdfMk.g:4578:1: rule__InnerColumnObjectMembersWrapper__Group_0_1__0 : rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_0_1__1 ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4582:1: ( rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_0_1__1 )
            // InternalPdfMk.g:4583:2: rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_0_1__1
            {
            pushFollow(FOLLOW_11);
            rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0_1__0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl"
    // InternalPdfMk.g:4590:1: rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4594:1: ( ( ',' ) )
            // InternalPdfMk.g:4595:1: ( ',' )
            {
            // InternalPdfMk.g:4595:1: ( ',' )
            // InternalPdfMk.g:4596:2: ','
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0_1__1"
    // InternalPdfMk.g:4605:1: rule__InnerColumnObjectMembersWrapper__Group_0_1__1 : rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4609:1: ( rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl )
            // InternalPdfMk.g:4610:2: rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0_1__1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl"
    // InternalPdfMk.g:4616:1: rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl : ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 ) ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4620:1: ( ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 ) ) )
            // InternalPdfMk.g:4621:1: ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 ) )
            {
            // InternalPdfMk.g:4621:1: ( ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 ) )
            // InternalPdfMk.g:4622:2: ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextAssignment_0_1_1()); 
            // InternalPdfMk.g:4623:2: ( rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 )
            // InternalPdfMk.g:4623:3: rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_0_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1__0"
    // InternalPdfMk.g:4632:1: rule__InnerColumnObjectMembersWrapper__Group_1__0 : rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_1__1 ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4636:1: ( rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_1__1 )
            // InternalPdfMk.g:4637:2: rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1__0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl"
    // InternalPdfMk.g:4644:1: rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl : ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4648:1: ( ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? ) )
            // InternalPdfMk.g:4649:1: ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? )
            {
            // InternalPdfMk.g:4649:1: ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? )
            // InternalPdfMk.g:4650:2: ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 )?
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_0()); 
            // InternalPdfMk.g:4651:2: ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPdfMk.g:4651:3: rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1__1"
    // InternalPdfMk.g:4659:1: rule__InnerColumnObjectMembersWrapper__Group_1__1 : rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4663:1: ( rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl )
            // InternalPdfMk.g:4664:2: rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1__1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl"
    // InternalPdfMk.g:4670:1: rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl : ( ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0 )* ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4674:1: ( ( ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0 )* ) )
            // InternalPdfMk.g:4675:1: ( ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:4675:1: ( ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0 )* )
            // InternalPdfMk.g:4676:2: ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_1_1()); 
            // InternalPdfMk.g:4677:2: ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPdfMk.g:4677:3: rule__InnerColumnObjectMembersWrapper__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObjectMembersWrapper__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1_1__0"
    // InternalPdfMk.g:4686:1: rule__InnerColumnObjectMembersWrapper__Group_1_1__0 : rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_1_1__1 ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4690:1: ( rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_1_1__1 )
            // InternalPdfMk.g:4691:2: rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1_1__0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl"
    // InternalPdfMk.g:4698:1: rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4702:1: ( ( ',' ) )
            // InternalPdfMk.g:4703:1: ( ',' )
            {
            // InternalPdfMk.g:4703:1: ( ',' )
            // InternalPdfMk.g:4704:2: ','
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1_1__1"
    // InternalPdfMk.g:4713:1: rule__InnerColumnObjectMembersWrapper__Group_1_1__1 : rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4717:1: ( rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl )
            // InternalPdfMk.g:4718:2: rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1_1__1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl"
    // InternalPdfMk.g:4724:1: rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl : ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4728:1: ( ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:4729:1: ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:4729:1: ( ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) )
            // InternalPdfMk.g:4730:2: ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_1_1()); 
            // InternalPdfMk.g:4731:2: ( rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 )
            // InternalPdfMk.g:4731:3: rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_1_1__1__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2__0"
    // InternalPdfMk.g:4740:1: rule__InnerColumnObjectMembersWrapper__Group_2__0 : rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl rule__InnerColumnObjectMembersWrapper__Group_2__1 ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4744:1: ( rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl rule__InnerColumnObjectMembersWrapper__Group_2__1 )
            // InternalPdfMk.g:4745:2: rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl rule__InnerColumnObjectMembersWrapper__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2__0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl"
    // InternalPdfMk.g:4752:1: rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl : ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 )? ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4756:1: ( ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 )? ) )
            // InternalPdfMk.g:4757:1: ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 )? )
            {
            // InternalPdfMk.g:4757:1: ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 )? )
            // InternalPdfMk.g:4758:2: ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 )?
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnAssignment_2_0()); 
            // InternalPdfMk.g:4759:2: ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPdfMk.g:4759:3: rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2__0__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2__1"
    // InternalPdfMk.g:4767:1: rule__InnerColumnObjectMembersWrapper__Group_2__1 : rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4771:1: ( rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl )
            // InternalPdfMk.g:4772:2: rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2__1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl"
    // InternalPdfMk.g:4778:1: rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl : ( ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0 )* ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4782:1: ( ( ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0 )* ) )
            // InternalPdfMk.g:4783:1: ( ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:4783:1: ( ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0 )* )
            // InternalPdfMk.g:4784:2: ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_2_1()); 
            // InternalPdfMk.g:4785:2: ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPdfMk.g:4785:3: rule__InnerColumnObjectMembersWrapper__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InnerColumnObjectMembersWrapper__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2__1__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2_1__0"
    // InternalPdfMk.g:4794:1: rule__InnerColumnObjectMembersWrapper__Group_2_1__0 : rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_2_1__1 ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4798:1: ( rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_2_1__1 )
            // InternalPdfMk.g:4799:2: rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl rule__InnerColumnObjectMembersWrapper__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2_1__0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl"
    // InternalPdfMk.g:4806:1: rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4810:1: ( ( ',' ) )
            // InternalPdfMk.g:4811:1: ( ',' )
            {
            // InternalPdfMk.g:4811:1: ( ',' )
            // InternalPdfMk.g:4812:2: ','
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2_1__0__Impl"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2_1__1"
    // InternalPdfMk.g:4821:1: rule__InnerColumnObjectMembersWrapper__Group_2_1__1 : rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4825:1: ( rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl )
            // InternalPdfMk.g:4826:2: rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2_1__1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl"
    // InternalPdfMk.g:4832:1: rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl : ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 ) ) ;
    public final void rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4836:1: ( ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:4837:1: ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:4837:1: ( ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 ) )
            // InternalPdfMk.g:4838:2: ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnAssignment_2_1_1()); 
            // InternalPdfMk.g:4839:2: ( rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 )
            // InternalPdfMk.g:4839:3: rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__Group_2_1__1__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0__0"
    // InternalPdfMk.g:4848:1: rule__ColumnObjectMembersWrapper__Group_0__0 : rule__ColumnObjectMembersWrapper__Group_0__0__Impl rule__ColumnObjectMembersWrapper__Group_0__1 ;
    public final void rule__ColumnObjectMembersWrapper__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4852:1: ( rule__ColumnObjectMembersWrapper__Group_0__0__Impl rule__ColumnObjectMembersWrapper__Group_0__1 )
            // InternalPdfMk.g:4853:2: rule__ColumnObjectMembersWrapper__Group_0__0__Impl rule__ColumnObjectMembersWrapper__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__ColumnObjectMembersWrapper__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0__0"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0__0__Impl"
    // InternalPdfMk.g:4860:1: rule__ColumnObjectMembersWrapper__Group_0__0__Impl : ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_0 )? ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4864:1: ( ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_0 )? ) )
            // InternalPdfMk.g:4865:1: ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_0 )? )
            {
            // InternalPdfMk.g:4865:1: ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_0 )? )
            // InternalPdfMk.g:4866:2: ( rule__ColumnObjectMembersWrapper__TextAssignment_0_0 )?
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextAssignment_0_0()); 
            // InternalPdfMk.g:4867:2: ( rule__ColumnObjectMembersWrapper__TextAssignment_0_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:4867:3: rule__ColumnObjectMembersWrapper__TextAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObjectMembersWrapper__TextAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0__0__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0__1"
    // InternalPdfMk.g:4875:1: rule__ColumnObjectMembersWrapper__Group_0__1 : rule__ColumnObjectMembersWrapper__Group_0__1__Impl ;
    public final void rule__ColumnObjectMembersWrapper__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4879:1: ( rule__ColumnObjectMembersWrapper__Group_0__1__Impl )
            // InternalPdfMk.g:4880:2: rule__ColumnObjectMembersWrapper__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0__1"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0__1__Impl"
    // InternalPdfMk.g:4886:1: rule__ColumnObjectMembersWrapper__Group_0__1__Impl : ( ( rule__ColumnObjectMembersWrapper__Group_0_1__0 )* ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4890:1: ( ( ( rule__ColumnObjectMembersWrapper__Group_0_1__0 )* ) )
            // InternalPdfMk.g:4891:1: ( ( rule__ColumnObjectMembersWrapper__Group_0_1__0 )* )
            {
            // InternalPdfMk.g:4891:1: ( ( rule__ColumnObjectMembersWrapper__Group_0_1__0 )* )
            // InternalPdfMk.g:4892:2: ( rule__ColumnObjectMembersWrapper__Group_0_1__0 )*
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_0_1()); 
            // InternalPdfMk.g:4893:2: ( rule__ColumnObjectMembersWrapper__Group_0_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_STRING) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPdfMk.g:4893:3: rule__ColumnObjectMembersWrapper__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObjectMembersWrapper__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0__1__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0_1__0"
    // InternalPdfMk.g:4902:1: rule__ColumnObjectMembersWrapper__Group_0_1__0 : rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl rule__ColumnObjectMembersWrapper__Group_0_1__1 ;
    public final void rule__ColumnObjectMembersWrapper__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4906:1: ( rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl rule__ColumnObjectMembersWrapper__Group_0_1__1 )
            // InternalPdfMk.g:4907:2: rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl rule__ColumnObjectMembersWrapper__Group_0_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0_1__0"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl"
    // InternalPdfMk.g:4914:1: rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4918:1: ( ( ',' ) )
            // InternalPdfMk.g:4919:1: ( ',' )
            {
            // InternalPdfMk.g:4919:1: ( ',' )
            // InternalPdfMk.g:4920:2: ','
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0_1__0__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0_1__1"
    // InternalPdfMk.g:4929:1: rule__ColumnObjectMembersWrapper__Group_0_1__1 : rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl ;
    public final void rule__ColumnObjectMembersWrapper__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4933:1: ( rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl )
            // InternalPdfMk.g:4934:2: rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0_1__1"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl"
    // InternalPdfMk.g:4940:1: rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl : ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 ) ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4944:1: ( ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 ) ) )
            // InternalPdfMk.g:4945:1: ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 ) )
            {
            // InternalPdfMk.g:4945:1: ( ( rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 ) )
            // InternalPdfMk.g:4946:2: ( rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 )
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextAssignment_0_1_1()); 
            // InternalPdfMk.g:4947:2: ( rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 )
            // InternalPdfMk.g:4947:3: rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_0_1__1__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1__0"
    // InternalPdfMk.g:4956:1: rule__ColumnObjectMembersWrapper__Group_1__0 : rule__ColumnObjectMembersWrapper__Group_1__0__Impl rule__ColumnObjectMembersWrapper__Group_1__1 ;
    public final void rule__ColumnObjectMembersWrapper__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4960:1: ( rule__ColumnObjectMembersWrapper__Group_1__0__Impl rule__ColumnObjectMembersWrapper__Group_1__1 )
            // InternalPdfMk.g:4961:2: rule__ColumnObjectMembersWrapper__Group_1__0__Impl rule__ColumnObjectMembersWrapper__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ColumnObjectMembersWrapper__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1__0"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1__0__Impl"
    // InternalPdfMk.g:4968:1: rule__ColumnObjectMembersWrapper__Group_1__0__Impl : ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4972:1: ( ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? ) )
            // InternalPdfMk.g:4973:1: ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? )
            {
            // InternalPdfMk.g:4973:1: ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 )? )
            // InternalPdfMk.g:4974:2: ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 )?
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_0()); 
            // InternalPdfMk.g:4975:2: ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPdfMk.g:4975:3: rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1__0__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1__1"
    // InternalPdfMk.g:4983:1: rule__ColumnObjectMembersWrapper__Group_1__1 : rule__ColumnObjectMembersWrapper__Group_1__1__Impl ;
    public final void rule__ColumnObjectMembersWrapper__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4987:1: ( rule__ColumnObjectMembersWrapper__Group_1__1__Impl )
            // InternalPdfMk.g:4988:2: rule__ColumnObjectMembersWrapper__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1__1"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1__1__Impl"
    // InternalPdfMk.g:4994:1: rule__ColumnObjectMembersWrapper__Group_1__1__Impl : ( ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )* ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4998:1: ( ( ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )* ) )
            // InternalPdfMk.g:4999:1: ( ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:4999:1: ( ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )* )
            // InternalPdfMk.g:5000:2: ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )*
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5001:2: ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // InternalPdfMk.g:5001:3: rule__ColumnObjectMembersWrapper__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObjectMembersWrapper__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1__1__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1_1__0"
    // InternalPdfMk.g:5010:1: rule__ColumnObjectMembersWrapper__Group_1_1__0 : rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl rule__ColumnObjectMembersWrapper__Group_1_1__1 ;
    public final void rule__ColumnObjectMembersWrapper__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5014:1: ( rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl rule__ColumnObjectMembersWrapper__Group_1_1__1 )
            // InternalPdfMk.g:5015:2: rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl rule__ColumnObjectMembersWrapper__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1_1__0"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl"
    // InternalPdfMk.g:5022:1: rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5026:1: ( ( ',' ) )
            // InternalPdfMk.g:5027:1: ( ',' )
            {
            // InternalPdfMk.g:5027:1: ( ',' )
            // InternalPdfMk.g:5028:2: ','
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1_1__0__Impl"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1_1__1"
    // InternalPdfMk.g:5037:1: rule__ColumnObjectMembersWrapper__Group_1_1__1 : rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl ;
    public final void rule__ColumnObjectMembersWrapper__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5041:1: ( rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl )
            // InternalPdfMk.g:5042:2: rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1_1__1"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl"
    // InternalPdfMk.g:5048:1: rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl : ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) ) ;
    public final void rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5052:1: ( ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5053:1: ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5053:1: ( ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 ) )
            // InternalPdfMk.g:5054:2: ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 )
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_1_1()); 
            // InternalPdfMk.g:5055:2: ( rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 )
            // InternalPdfMk.g:5055:3: rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__Group_1_1__1__Impl"


    // $ANTLR start "rule__TextObject__Group__0"
    // InternalPdfMk.g:5064:1: rule__TextObject__Group__0 : rule__TextObject__Group__0__Impl rule__TextObject__Group__1 ;
    public final void rule__TextObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5068:1: ( rule__TextObject__Group__0__Impl rule__TextObject__Group__1 )
            // InternalPdfMk.g:5069:2: rule__TextObject__Group__0__Impl rule__TextObject__Group__1
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
    // InternalPdfMk.g:5076:1: rule__TextObject__Group__0__Impl : ( '{' ) ;
    public final void rule__TextObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5080:1: ( ( '{' ) )
            // InternalPdfMk.g:5081:1: ( '{' )
            {
            // InternalPdfMk.g:5081:1: ( '{' )
            // InternalPdfMk.g:5082:2: '{'
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
    // InternalPdfMk.g:5091:1: rule__TextObject__Group__1 : rule__TextObject__Group__1__Impl rule__TextObject__Group__2 ;
    public final void rule__TextObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5095:1: ( rule__TextObject__Group__1__Impl rule__TextObject__Group__2 )
            // InternalPdfMk.g:5096:2: rule__TextObject__Group__1__Impl rule__TextObject__Group__2
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
    // InternalPdfMk.g:5103:1: rule__TextObject__Group__1__Impl : ( ( rule__TextObject__Group_1__0 ) ) ;
    public final void rule__TextObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5107:1: ( ( ( rule__TextObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5108:1: ( ( rule__TextObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5108:1: ( ( rule__TextObject__Group_1__0 ) )
            // InternalPdfMk.g:5109:2: ( rule__TextObject__Group_1__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5110:2: ( rule__TextObject__Group_1__0 )
            // InternalPdfMk.g:5110:3: rule__TextObject__Group_1__0
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
    // InternalPdfMk.g:5118:1: rule__TextObject__Group__2 : rule__TextObject__Group__2__Impl ;
    public final void rule__TextObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5122:1: ( rule__TextObject__Group__2__Impl )
            // InternalPdfMk.g:5123:2: rule__TextObject__Group__2__Impl
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
    // InternalPdfMk.g:5129:1: rule__TextObject__Group__2__Impl : ( '}' ) ;
    public final void rule__TextObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5133:1: ( ( '}' ) )
            // InternalPdfMk.g:5134:1: ( '}' )
            {
            // InternalPdfMk.g:5134:1: ( '}' )
            // InternalPdfMk.g:5135:2: '}'
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
    // InternalPdfMk.g:5145:1: rule__TextObject__Group_1__0 : rule__TextObject__Group_1__0__Impl rule__TextObject__Group_1__1 ;
    public final void rule__TextObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5149:1: ( rule__TextObject__Group_1__0__Impl rule__TextObject__Group_1__1 )
            // InternalPdfMk.g:5150:2: rule__TextObject__Group_1__0__Impl rule__TextObject__Group_1__1
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
    // InternalPdfMk.g:5157:1: rule__TextObject__Group_1__0__Impl : ( ( rule__TextObject__MembersAssignment_1_0 ) ) ;
    public final void rule__TextObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5161:1: ( ( ( rule__TextObject__MembersAssignment_1_0 ) ) )
            // InternalPdfMk.g:5162:1: ( ( rule__TextObject__MembersAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5162:1: ( ( rule__TextObject__MembersAssignment_1_0 ) )
            // InternalPdfMk.g:5163:2: ( rule__TextObject__MembersAssignment_1_0 )
            {
             before(grammarAccess.getTextObjectAccess().getMembersAssignment_1_0()); 
            // InternalPdfMk.g:5164:2: ( rule__TextObject__MembersAssignment_1_0 )
            // InternalPdfMk.g:5164:3: rule__TextObject__MembersAssignment_1_0
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
    // InternalPdfMk.g:5172:1: rule__TextObject__Group_1__1 : rule__TextObject__Group_1__1__Impl ;
    public final void rule__TextObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5176:1: ( rule__TextObject__Group_1__1__Impl )
            // InternalPdfMk.g:5177:2: rule__TextObject__Group_1__1__Impl
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
    // InternalPdfMk.g:5183:1: rule__TextObject__Group_1__1__Impl : ( ( rule__TextObject__Group_1_1__0 )* ) ;
    public final void rule__TextObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5187:1: ( ( ( rule__TextObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5188:1: ( ( rule__TextObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5188:1: ( ( rule__TextObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5189:2: ( rule__TextObject__Group_1_1__0 )*
            {
             before(grammarAccess.getTextObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5190:2: ( rule__TextObject__Group_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPdfMk.g:5190:3: rule__TextObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TextObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPdfMk.g:5199:1: rule__TextObject__Group_1_1__0 : rule__TextObject__Group_1_1__0__Impl rule__TextObject__Group_1_1__1 ;
    public final void rule__TextObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5203:1: ( rule__TextObject__Group_1_1__0__Impl rule__TextObject__Group_1_1__1 )
            // InternalPdfMk.g:5204:2: rule__TextObject__Group_1_1__0__Impl rule__TextObject__Group_1_1__1
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
    // InternalPdfMk.g:5211:1: rule__TextObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5215:1: ( ( ',' ) )
            // InternalPdfMk.g:5216:1: ( ',' )
            {
            // InternalPdfMk.g:5216:1: ( ',' )
            // InternalPdfMk.g:5217:2: ','
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
    // InternalPdfMk.g:5226:1: rule__TextObject__Group_1_1__1 : rule__TextObject__Group_1_1__1__Impl ;
    public final void rule__TextObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5230:1: ( rule__TextObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5231:2: rule__TextObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5237:1: rule__TextObject__Group_1_1__1__Impl : ( ( rule__TextObject__MembersAssignment_1_1_1 ) ) ;
    public final void rule__TextObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5241:1: ( ( ( rule__TextObject__MembersAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5242:1: ( ( rule__TextObject__MembersAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5242:1: ( ( rule__TextObject__MembersAssignment_1_1_1 ) )
            // InternalPdfMk.g:5243:2: ( rule__TextObject__MembersAssignment_1_1_1 )
            {
             before(grammarAccess.getTextObjectAccess().getMembersAssignment_1_1_1()); 
            // InternalPdfMk.g:5244:2: ( rule__TextObject__MembersAssignment_1_1_1 )
            // InternalPdfMk.g:5244:3: rule__TextObject__MembersAssignment_1_1_1
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
    // InternalPdfMk.g:5253:1: rule__StyleObject__Group__0 : rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 ;
    public final void rule__StyleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5257:1: ( rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 )
            // InternalPdfMk.g:5258:2: rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1
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
    // InternalPdfMk.g:5265:1: rule__StyleObject__Group__0__Impl : ( ( rule__StyleObject__KeyAssignment_0 ) ) ;
    public final void rule__StyleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5269:1: ( ( ( rule__StyleObject__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:5270:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:5270:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            // InternalPdfMk.g:5271:2: ( rule__StyleObject__KeyAssignment_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:5272:2: ( rule__StyleObject__KeyAssignment_0 )
            // InternalPdfMk.g:5272:3: rule__StyleObject__KeyAssignment_0
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
    // InternalPdfMk.g:5280:1: rule__StyleObject__Group__1 : rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 ;
    public final void rule__StyleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5284:1: ( rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 )
            // InternalPdfMk.g:5285:2: rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2
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
    // InternalPdfMk.g:5292:1: rule__StyleObject__Group__1__Impl : ( ':' ) ;
    public final void rule__StyleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5296:1: ( ( ':' ) )
            // InternalPdfMk.g:5297:1: ( ':' )
            {
            // InternalPdfMk.g:5297:1: ( ':' )
            // InternalPdfMk.g:5298:2: ':'
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
    // InternalPdfMk.g:5307:1: rule__StyleObject__Group__2 : rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 ;
    public final void rule__StyleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5311:1: ( rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 )
            // InternalPdfMk.g:5312:2: rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3
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
    // InternalPdfMk.g:5319:1: rule__StyleObject__Group__2__Impl : ( ( rule__StyleObject__ValueAssignment_2 ) ) ;
    public final void rule__StyleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5323:1: ( ( ( rule__StyleObject__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:5324:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:5324:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            // InternalPdfMk.g:5325:2: ( rule__StyleObject__ValueAssignment_2 )
            {
             before(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:5326:2: ( rule__StyleObject__ValueAssignment_2 )
            // InternalPdfMk.g:5326:3: rule__StyleObject__ValueAssignment_2
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
    // InternalPdfMk.g:5334:1: rule__StyleObject__Group__3 : rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 ;
    public final void rule__StyleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5338:1: ( rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 )
            // InternalPdfMk.g:5339:2: rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:5346:1: rule__StyleObject__Group__3__Impl : ( ( rule__StyleObject__Group_3__0 ) ) ;
    public final void rule__StyleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5350:1: ( ( ( rule__StyleObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5351:1: ( ( rule__StyleObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5351:1: ( ( rule__StyleObject__Group_3__0 ) )
            // InternalPdfMk.g:5352:2: ( rule__StyleObject__Group_3__0 )
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5353:2: ( rule__StyleObject__Group_3__0 )
            // InternalPdfMk.g:5353:3: rule__StyleObject__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalPdfMk.g:5361:1: rule__StyleObject__Group__4 : rule__StyleObject__Group__4__Impl ;
    public final void rule__StyleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5365:1: ( rule__StyleObject__Group__4__Impl )
            // InternalPdfMk.g:5366:2: rule__StyleObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:5372:1: rule__StyleObject__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5376:1: ( ( '}' ) )
            // InternalPdfMk.g:5377:1: ( '}' )
            {
            // InternalPdfMk.g:5377:1: ( '}' )
            // InternalPdfMk.g:5378:2: '}'
            {
             before(grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__StyleObject__Group_3__0"
    // InternalPdfMk.g:5388:1: rule__StyleObject__Group_3__0 : rule__StyleObject__Group_3__0__Impl rule__StyleObject__Group_3__1 ;
    public final void rule__StyleObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5392:1: ( rule__StyleObject__Group_3__0__Impl rule__StyleObject__Group_3__1 )
            // InternalPdfMk.g:5393:2: rule__StyleObject__Group_3__0__Impl rule__StyleObject__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__StyleObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3__0"


    // $ANTLR start "rule__StyleObject__Group_3__0__Impl"
    // InternalPdfMk.g:5400:1: rule__StyleObject__Group_3__0__Impl : ( ( rule__StyleObject__MembersAssignment_3_0 ) ) ;
    public final void rule__StyleObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5404:1: ( ( ( rule__StyleObject__MembersAssignment_3_0 ) ) )
            // InternalPdfMk.g:5405:1: ( ( rule__StyleObject__MembersAssignment_3_0 ) )
            {
            // InternalPdfMk.g:5405:1: ( ( rule__StyleObject__MembersAssignment_3_0 ) )
            // InternalPdfMk.g:5406:2: ( rule__StyleObject__MembersAssignment_3_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getMembersAssignment_3_0()); 
            // InternalPdfMk.g:5407:2: ( rule__StyleObject__MembersAssignment_3_0 )
            // InternalPdfMk.g:5407:3: rule__StyleObject__MembersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__MembersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getMembersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3__0__Impl"


    // $ANTLR start "rule__StyleObject__Group_3__1"
    // InternalPdfMk.g:5415:1: rule__StyleObject__Group_3__1 : rule__StyleObject__Group_3__1__Impl ;
    public final void rule__StyleObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5419:1: ( rule__StyleObject__Group_3__1__Impl )
            // InternalPdfMk.g:5420:2: rule__StyleObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3__1"


    // $ANTLR start "rule__StyleObject__Group_3__1__Impl"
    // InternalPdfMk.g:5426:1: rule__StyleObject__Group_3__1__Impl : ( ( rule__StyleObject__Group_3_1__0 )* ) ;
    public final void rule__StyleObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5430:1: ( ( ( rule__StyleObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:5431:1: ( ( rule__StyleObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:5431:1: ( ( rule__StyleObject__Group_3_1__0 )* )
            // InternalPdfMk.g:5432:2: ( rule__StyleObject__Group_3_1__0 )*
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:5433:2: ( rule__StyleObject__Group_3_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPdfMk.g:5433:3: rule__StyleObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StyleObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getStyleObjectAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3__1__Impl"


    // $ANTLR start "rule__StyleObject__Group_3_1__0"
    // InternalPdfMk.g:5442:1: rule__StyleObject__Group_3_1__0 : rule__StyleObject__Group_3_1__0__Impl rule__StyleObject__Group_3_1__1 ;
    public final void rule__StyleObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5446:1: ( rule__StyleObject__Group_3_1__0__Impl rule__StyleObject__Group_3_1__1 )
            // InternalPdfMk.g:5447:2: rule__StyleObject__Group_3_1__0__Impl rule__StyleObject__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
            rule__StyleObject__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3_1__0"


    // $ANTLR start "rule__StyleObject__Group_3_1__0__Impl"
    // InternalPdfMk.g:5454:1: rule__StyleObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5458:1: ( ( ',' ) )
            // InternalPdfMk.g:5459:1: ( ',' )
            {
            // InternalPdfMk.g:5459:1: ( ',' )
            // InternalPdfMk.g:5460:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3_1__0__Impl"


    // $ANTLR start "rule__StyleObject__Group_3_1__1"
    // InternalPdfMk.g:5469:1: rule__StyleObject__Group_3_1__1 : rule__StyleObject__Group_3_1__1__Impl ;
    public final void rule__StyleObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5473:1: ( rule__StyleObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:5474:2: rule__StyleObject__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3_1__1"


    // $ANTLR start "rule__StyleObject__Group_3_1__1__Impl"
    // InternalPdfMk.g:5480:1: rule__StyleObject__Group_3_1__1__Impl : ( ( rule__StyleObject__MembersAssignment_3_1_1 ) ) ;
    public final void rule__StyleObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5484:1: ( ( ( rule__StyleObject__MembersAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:5485:1: ( ( rule__StyleObject__MembersAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:5485:1: ( ( rule__StyleObject__MembersAssignment_3_1_1 ) )
            // InternalPdfMk.g:5486:2: ( rule__StyleObject__MembersAssignment_3_1_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getMembersAssignment_3_1_1()); 
            // InternalPdfMk.g:5487:2: ( rule__StyleObject__MembersAssignment_3_1_1 )
            // InternalPdfMk.g:5487:3: rule__StyleObject__MembersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__MembersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectAccess().getMembersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__Group_3_1__1__Impl"


    // $ANTLR start "rule__StyleObjects__Group__0"
    // InternalPdfMk.g:5496:1: rule__StyleObjects__Group__0 : rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 ;
    public final void rule__StyleObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5500:1: ( rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 )
            // InternalPdfMk.g:5501:2: rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPdfMk.g:5508:1: rule__StyleObjects__Group__0__Impl : ( '{' ) ;
    public final void rule__StyleObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5512:1: ( ( '{' ) )
            // InternalPdfMk.g:5513:1: ( '{' )
            {
            // InternalPdfMk.g:5513:1: ( '{' )
            // InternalPdfMk.g:5514:2: '{'
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
    // InternalPdfMk.g:5523:1: rule__StyleObjects__Group__1 : rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 ;
    public final void rule__StyleObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5527:1: ( rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 )
            // InternalPdfMk.g:5528:2: rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2
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
    // InternalPdfMk.g:5535:1: rule__StyleObjects__Group__1__Impl : ( ( rule__StyleObjects__Group_1__0 ) ) ;
    public final void rule__StyleObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5539:1: ( ( ( rule__StyleObjects__Group_1__0 ) ) )
            // InternalPdfMk.g:5540:1: ( ( rule__StyleObjects__Group_1__0 ) )
            {
            // InternalPdfMk.g:5540:1: ( ( rule__StyleObjects__Group_1__0 ) )
            // InternalPdfMk.g:5541:2: ( rule__StyleObjects__Group_1__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:5542:2: ( rule__StyleObjects__Group_1__0 )
            // InternalPdfMk.g:5542:3: rule__StyleObjects__Group_1__0
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
    // InternalPdfMk.g:5550:1: rule__StyleObjects__Group__2 : rule__StyleObjects__Group__2__Impl ;
    public final void rule__StyleObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5554:1: ( rule__StyleObjects__Group__2__Impl )
            // InternalPdfMk.g:5555:2: rule__StyleObjects__Group__2__Impl
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
    // InternalPdfMk.g:5561:1: rule__StyleObjects__Group__2__Impl : ( '}' ) ;
    public final void rule__StyleObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5565:1: ( ( '}' ) )
            // InternalPdfMk.g:5566:1: ( '}' )
            {
            // InternalPdfMk.g:5566:1: ( '}' )
            // InternalPdfMk.g:5567:2: '}'
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
    // InternalPdfMk.g:5577:1: rule__StyleObjects__Group_1__0 : rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 ;
    public final void rule__StyleObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5581:1: ( rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 )
            // InternalPdfMk.g:5582:2: rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1
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
    // InternalPdfMk.g:5589:1: rule__StyleObjects__Group_1__0__Impl : ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__StyleObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5593:1: ( ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:5594:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5594:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:5595:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:5596:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:5596:3: rule__StyleObjects__ValueAssignment_1_0
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
    // InternalPdfMk.g:5604:1: rule__StyleObjects__Group_1__1 : rule__StyleObjects__Group_1__1__Impl ;
    public final void rule__StyleObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5608:1: ( rule__StyleObjects__Group_1__1__Impl )
            // InternalPdfMk.g:5609:2: rule__StyleObjects__Group_1__1__Impl
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
    // InternalPdfMk.g:5615:1: rule__StyleObjects__Group_1__1__Impl : ( ( rule__StyleObjects__Group_1_1__0 )* ) ;
    public final void rule__StyleObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5619:1: ( ( ( rule__StyleObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5620:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5620:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:5621:2: ( rule__StyleObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5622:2: ( rule__StyleObjects__Group_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPdfMk.g:5622:3: rule__StyleObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StyleObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPdfMk.g:5631:1: rule__StyleObjects__Group_1_1__0 : rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 ;
    public final void rule__StyleObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5635:1: ( rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 )
            // InternalPdfMk.g:5636:2: rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPdfMk.g:5643:1: rule__StyleObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__StyleObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5647:1: ( ( ',' ) )
            // InternalPdfMk.g:5648:1: ( ',' )
            {
            // InternalPdfMk.g:5648:1: ( ',' )
            // InternalPdfMk.g:5649:2: ','
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
    // InternalPdfMk.g:5658:1: rule__StyleObjects__Group_1_1__1 : rule__StyleObjects__Group_1_1__1__Impl ;
    public final void rule__StyleObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5662:1: ( rule__StyleObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:5663:2: rule__StyleObjects__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5669:1: rule__StyleObjects__Group_1_1__1__Impl : ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__StyleObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5673:1: ( ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5674:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5674:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:5675:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:5676:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:5676:3: rule__StyleObjects__ValueAssignment_1_1_1
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


    // $ANTLR start "rule__ImageObject__Group__0"
    // InternalPdfMk.g:5685:1: rule__ImageObject__Group__0 : rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 ;
    public final void rule__ImageObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5689:1: ( rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 )
            // InternalPdfMk.g:5690:2: rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPdfMk.g:5697:1: rule__ImageObject__Group__0__Impl : ( ( rule__ImageObject__ValueAssignment_0 ) ) ;
    public final void rule__ImageObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5701:1: ( ( ( rule__ImageObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5702:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5702:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5703:2: ( rule__ImageObject__ValueAssignment_0 )
            {
             before(grammarAccess.getImageObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5704:2: ( rule__ImageObject__ValueAssignment_0 )
            // InternalPdfMk.g:5704:3: rule__ImageObject__ValueAssignment_0
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
    // InternalPdfMk.g:5712:1: rule__ImageObject__Group__1 : rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 ;
    public final void rule__ImageObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5716:1: ( rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 )
            // InternalPdfMk.g:5717:2: rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:5724:1: rule__ImageObject__Group__1__Impl : ( ( rule__ImageObject__Group_1__0 ) ) ;
    public final void rule__ImageObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5728:1: ( ( ( rule__ImageObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5729:1: ( ( rule__ImageObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5729:1: ( ( rule__ImageObject__Group_1__0 ) )
            // InternalPdfMk.g:5730:2: ( rule__ImageObject__Group_1__0 )
            {
             before(grammarAccess.getImageObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5731:2: ( rule__ImageObject__Group_1__0 )
            // InternalPdfMk.g:5731:3: rule__ImageObject__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalPdfMk.g:5739:1: rule__ImageObject__Group__2 : rule__ImageObject__Group__2__Impl ;
    public final void rule__ImageObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5743:1: ( rule__ImageObject__Group__2__Impl )
            // InternalPdfMk.g:5744:2: rule__ImageObject__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:5750:1: rule__ImageObject__Group__2__Impl : ( '}' ) ;
    public final void rule__ImageObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5754:1: ( ( '}' ) )
            // InternalPdfMk.g:5755:1: ( '}' )
            {
            // InternalPdfMk.g:5755:1: ( '}' )
            // InternalPdfMk.g:5756:2: '}'
            {
             before(grammarAccess.getImageObjectAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ImageObject__Group_1__0"
    // InternalPdfMk.g:5766:1: rule__ImageObject__Group_1__0 : rule__ImageObject__Group_1__0__Impl rule__ImageObject__Group_1__1 ;
    public final void rule__ImageObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5770:1: ( rule__ImageObject__Group_1__0__Impl rule__ImageObject__Group_1__1 )
            // InternalPdfMk.g:5771:2: rule__ImageObject__Group_1__0__Impl rule__ImageObject__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ImageObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1__0"


    // $ANTLR start "rule__ImageObject__Group_1__0__Impl"
    // InternalPdfMk.g:5778:1: rule__ImageObject__Group_1__0__Impl : ( ( rule__ImageObject__MembersAssignment_1_0 ) ) ;
    public final void rule__ImageObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5782:1: ( ( ( rule__ImageObject__MembersAssignment_1_0 ) ) )
            // InternalPdfMk.g:5783:1: ( ( rule__ImageObject__MembersAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5783:1: ( ( rule__ImageObject__MembersAssignment_1_0 ) )
            // InternalPdfMk.g:5784:2: ( rule__ImageObject__MembersAssignment_1_0 )
            {
             before(grammarAccess.getImageObjectAccess().getMembersAssignment_1_0()); 
            // InternalPdfMk.g:5785:2: ( rule__ImageObject__MembersAssignment_1_0 )
            // InternalPdfMk.g:5785:3: rule__ImageObject__MembersAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__MembersAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getMembersAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_1__1"
    // InternalPdfMk.g:5793:1: rule__ImageObject__Group_1__1 : rule__ImageObject__Group_1__1__Impl ;
    public final void rule__ImageObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5797:1: ( rule__ImageObject__Group_1__1__Impl )
            // InternalPdfMk.g:5798:2: rule__ImageObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1__1"


    // $ANTLR start "rule__ImageObject__Group_1__1__Impl"
    // InternalPdfMk.g:5804:1: rule__ImageObject__Group_1__1__Impl : ( ( rule__ImageObject__Group_1_1__0 )* ) ;
    public final void rule__ImageObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5808:1: ( ( ( rule__ImageObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5809:1: ( ( rule__ImageObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5809:1: ( ( rule__ImageObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5810:2: ( rule__ImageObject__Group_1_1__0 )*
            {
             before(grammarAccess.getImageObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5811:2: ( rule__ImageObject__Group_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPdfMk.g:5811:3: rule__ImageObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ImageObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getImageObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1__1__Impl"


    // $ANTLR start "rule__ImageObject__Group_1_1__0"
    // InternalPdfMk.g:5820:1: rule__ImageObject__Group_1_1__0 : rule__ImageObject__Group_1_1__0__Impl rule__ImageObject__Group_1_1__1 ;
    public final void rule__ImageObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5824:1: ( rule__ImageObject__Group_1_1__0__Impl rule__ImageObject__Group_1_1__1 )
            // InternalPdfMk.g:5825:2: rule__ImageObject__Group_1_1__0__Impl rule__ImageObject__Group_1_1__1
            {
            pushFollow(FOLLOW_26);
            rule__ImageObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1_1__0"


    // $ANTLR start "rule__ImageObject__Group_1_1__0__Impl"
    // InternalPdfMk.g:5832:1: rule__ImageObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5836:1: ( ( ',' ) )
            // InternalPdfMk.g:5837:1: ( ',' )
            {
            // InternalPdfMk.g:5837:1: ( ',' )
            // InternalPdfMk.g:5838:2: ','
            {
             before(grammarAccess.getImageObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImageObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__ImageObject__Group_1_1__1"
    // InternalPdfMk.g:5847:1: rule__ImageObject__Group_1_1__1 : rule__ImageObject__Group_1_1__1__Impl ;
    public final void rule__ImageObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5851:1: ( rule__ImageObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5852:2: rule__ImageObject__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1_1__1"


    // $ANTLR start "rule__ImageObject__Group_1_1__1__Impl"
    // InternalPdfMk.g:5858:1: rule__ImageObject__Group_1_1__1__Impl : ( ( rule__ImageObject__MembersAssignment_1_1_1 ) ) ;
    public final void rule__ImageObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5862:1: ( ( ( rule__ImageObject__MembersAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5863:1: ( ( rule__ImageObject__MembersAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5863:1: ( ( rule__ImageObject__MembersAssignment_1_1_1 ) )
            // InternalPdfMk.g:5864:2: ( rule__ImageObject__MembersAssignment_1_1_1 )
            {
             before(grammarAccess.getImageObjectAccess().getMembersAssignment_1_1_1()); 
            // InternalPdfMk.g:5865:2: ( rule__ImageObject__MembersAssignment_1_1_1 )
            // InternalPdfMk.g:5865:3: rule__ImageObject__MembersAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageObject__MembersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImageObjectAccess().getMembersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__ColumnObject__Group__0"
    // InternalPdfMk.g:5874:1: rule__ColumnObject__Group__0 : rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 ;
    public final void rule__ColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5878:1: ( rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 )
            // InternalPdfMk.g:5879:2: rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:5886:1: rule__ColumnObject__Group__0__Impl : ( ( rule__ColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__ColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5890:1: ( ( ( rule__ColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5891:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5891:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5892:2: ( rule__ColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5893:2: ( rule__ColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:5893:3: rule__ColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:5901:1: rule__ColumnObject__Group__1 : rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 ;
    public final void rule__ColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5905:1: ( rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 )
            // InternalPdfMk.g:5906:2: rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:5913:1: rule__ColumnObject__Group__1__Impl : ( ( rule__ColumnObject__Group_1__0 ) ) ;
    public final void rule__ColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5917:1: ( ( ( rule__ColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5918:1: ( ( rule__ColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5918:1: ( ( rule__ColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5919:2: ( rule__ColumnObject__Group_1__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5920:2: ( rule__ColumnObject__Group_1__0 )
            // InternalPdfMk.g:5920:3: rule__ColumnObject__Group_1__0
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
    // InternalPdfMk.g:5928:1: rule__ColumnObject__Group__2 : rule__ColumnObject__Group__2__Impl ;
    public final void rule__ColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5932:1: ( rule__ColumnObject__Group__2__Impl )
            // InternalPdfMk.g:5933:2: rule__ColumnObject__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:5939:1: rule__ColumnObject__Group__2__Impl : ( ']' ) ;
    public final void rule__ColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5943:1: ( ( ']' ) )
            // InternalPdfMk.g:5944:1: ( ']' )
            {
            // InternalPdfMk.g:5944:1: ( ']' )
            // InternalPdfMk.g:5945:2: ']'
            {
             before(grammarAccess.getColumnObjectAccess().getRightSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnObjectAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ColumnObject__Group_1__0"
    // InternalPdfMk.g:5955:1: rule__ColumnObject__Group_1__0 : rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 ;
    public final void rule__ColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5959:1: ( rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 )
            // InternalPdfMk.g:5960:2: rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:5967:1: rule__ColumnObject__Group_1__0__Impl : ( ( rule__ColumnObject__MembersAssignment_1_0 ) ) ;
    public final void rule__ColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5971:1: ( ( ( rule__ColumnObject__MembersAssignment_1_0 ) ) )
            // InternalPdfMk.g:5972:1: ( ( rule__ColumnObject__MembersAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5972:1: ( ( rule__ColumnObject__MembersAssignment_1_0 ) )
            // InternalPdfMk.g:5973:2: ( rule__ColumnObject__MembersAssignment_1_0 )
            {
             before(grammarAccess.getColumnObjectAccess().getMembersAssignment_1_0()); 
            // InternalPdfMk.g:5974:2: ( rule__ColumnObject__MembersAssignment_1_0 )
            // InternalPdfMk.g:5974:3: rule__ColumnObject__MembersAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__MembersAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getMembersAssignment_1_0()); 

            }


            }

        }
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
    // InternalPdfMk.g:5982:1: rule__ColumnObject__Group_1__1 : rule__ColumnObject__Group_1__1__Impl ;
    public final void rule__ColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5986:1: ( rule__ColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5987:2: rule__ColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:5993:1: rule__ColumnObject__Group_1__1__Impl : ( ( rule__ColumnObject__Group_1_1__0 )* ) ;
    public final void rule__ColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5997:1: ( ( ( rule__ColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5998:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5998:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5999:2: ( rule__ColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:6000:2: ( rule__ColumnObject__Group_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPdfMk.g:6000:3: rule__ColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPdfMk.g:6009:1: rule__ColumnObject__Group_1_1__0 : rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 ;
    public final void rule__ColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6013:1: ( rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:6014:2: rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:6021:1: rule__ColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6025:1: ( ( ',' ) )
            // InternalPdfMk.g:6026:1: ( ',' )
            {
            // InternalPdfMk.g:6026:1: ( ',' )
            // InternalPdfMk.g:6027:2: ','
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
    // InternalPdfMk.g:6036:1: rule__ColumnObject__Group_1_1__1 : rule__ColumnObject__Group_1_1__1__Impl ;
    public final void rule__ColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6040:1: ( rule__ColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:6041:2: rule__ColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:6047:1: rule__ColumnObject__Group_1_1__1__Impl : ( ( rule__ColumnObject__MembersAssignment_1_1_1 ) ) ;
    public final void rule__ColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6051:1: ( ( ( rule__ColumnObject__MembersAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:6052:1: ( ( rule__ColumnObject__MembersAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:6052:1: ( ( rule__ColumnObject__MembersAssignment_1_1_1 ) )
            // InternalPdfMk.g:6053:2: ( rule__ColumnObject__MembersAssignment_1_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getMembersAssignment_1_1_1()); 
            // InternalPdfMk.g:6054:2: ( rule__ColumnObject__MembersAssignment_1_1_1 )
            // InternalPdfMk.g:6054:3: rule__ColumnObject__MembersAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnObject__MembersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnObjectAccess().getMembersAssignment_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ListObject__Group__0"
    // InternalPdfMk.g:6063:1: rule__ListObject__Group__0 : rule__ListObject__Group__0__Impl rule__ListObject__Group__1 ;
    public final void rule__ListObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6067:1: ( rule__ListObject__Group__0__Impl rule__ListObject__Group__1 )
            // InternalPdfMk.g:6068:2: rule__ListObject__Group__0__Impl rule__ListObject__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPdfMk.g:6075:1: rule__ListObject__Group__0__Impl : ( ( rule__ListObject__ValueAssignment_0 ) ) ;
    public final void rule__ListObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6079:1: ( ( ( rule__ListObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6080:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6080:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6081:2: ( rule__ListObject__ValueAssignment_0 )
            {
             before(grammarAccess.getListObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6082:2: ( rule__ListObject__ValueAssignment_0 )
            // InternalPdfMk.g:6082:3: rule__ListObject__ValueAssignment_0
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
    // InternalPdfMk.g:6090:1: rule__ListObject__Group__1 : rule__ListObject__Group__1__Impl rule__ListObject__Group__2 ;
    public final void rule__ListObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6094:1: ( rule__ListObject__Group__1__Impl rule__ListObject__Group__2 )
            // InternalPdfMk.g:6095:2: rule__ListObject__Group__1__Impl rule__ListObject__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalPdfMk.g:6102:1: rule__ListObject__Group__1__Impl : ( ( rule__ListObject__Group_1__0 )? ) ;
    public final void rule__ListObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6106:1: ( ( ( rule__ListObject__Group_1__0 )? ) )
            // InternalPdfMk.g:6107:1: ( ( rule__ListObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:6107:1: ( ( rule__ListObject__Group_1__0 )? )
            // InternalPdfMk.g:6108:2: ( rule__ListObject__Group_1__0 )?
            {
             before(grammarAccess.getListObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:6109:2: ( rule__ListObject__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=38 && LA34_0<=42)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPdfMk.g:6109:3: rule__ListObject__Group_1__0
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
    // InternalPdfMk.g:6117:1: rule__ListObject__Group__2 : rule__ListObject__Group__2__Impl rule__ListObject__Group__3 ;
    public final void rule__ListObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6121:1: ( rule__ListObject__Group__2__Impl rule__ListObject__Group__3 )
            // InternalPdfMk.g:6122:2: rule__ListObject__Group__2__Impl rule__ListObject__Group__3
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
    // InternalPdfMk.g:6129:1: rule__ListObject__Group__2__Impl : ( ( rule__ListObject__Alternatives_2 ) ) ;
    public final void rule__ListObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6133:1: ( ( ( rule__ListObject__Alternatives_2 ) ) )
            // InternalPdfMk.g:6134:1: ( ( rule__ListObject__Alternatives_2 ) )
            {
            // InternalPdfMk.g:6134:1: ( ( rule__ListObject__Alternatives_2 ) )
            // InternalPdfMk.g:6135:2: ( rule__ListObject__Alternatives_2 )
            {
             before(grammarAccess.getListObjectAccess().getAlternatives_2()); 
            // InternalPdfMk.g:6136:2: ( rule__ListObject__Alternatives_2 )
            // InternalPdfMk.g:6136:3: rule__ListObject__Alternatives_2
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
    // InternalPdfMk.g:6144:1: rule__ListObject__Group__3 : rule__ListObject__Group__3__Impl rule__ListObject__Group__4 ;
    public final void rule__ListObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6148:1: ( rule__ListObject__Group__3__Impl rule__ListObject__Group__4 )
            // InternalPdfMk.g:6149:2: rule__ListObject__Group__3__Impl rule__ListObject__Group__4
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
    // InternalPdfMk.g:6156:1: rule__ListObject__Group__3__Impl : ( ':' ) ;
    public final void rule__ListObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6160:1: ( ( ':' ) )
            // InternalPdfMk.g:6161:1: ( ':' )
            {
            // InternalPdfMk.g:6161:1: ( ':' )
            // InternalPdfMk.g:6162:2: ':'
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
    // InternalPdfMk.g:6171:1: rule__ListObject__Group__4 : rule__ListObject__Group__4__Impl rule__ListObject__Group__5 ;
    public final void rule__ListObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6175:1: ( rule__ListObject__Group__4__Impl rule__ListObject__Group__5 )
            // InternalPdfMk.g:6176:2: rule__ListObject__Group__4__Impl rule__ListObject__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:6183:1: rule__ListObject__Group__4__Impl : ( '[' ) ;
    public final void rule__ListObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6187:1: ( ( '[' ) )
            // InternalPdfMk.g:6188:1: ( '[' )
            {
            // InternalPdfMk.g:6188:1: ( '[' )
            // InternalPdfMk.g:6189:2: '['
            {
             before(grammarAccess.getListObjectAccess().getLeftSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:6198:1: rule__ListObject__Group__5 : rule__ListObject__Group__5__Impl rule__ListObject__Group__6 ;
    public final void rule__ListObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6202:1: ( rule__ListObject__Group__5__Impl rule__ListObject__Group__6 )
            // InternalPdfMk.g:6203:2: rule__ListObject__Group__5__Impl rule__ListObject__Group__6
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
    // InternalPdfMk.g:6210:1: rule__ListObject__Group__5__Impl : ( ( rule__ListObject__Group_5__0 ) ) ;
    public final void rule__ListObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6214:1: ( ( ( rule__ListObject__Group_5__0 ) ) )
            // InternalPdfMk.g:6215:1: ( ( rule__ListObject__Group_5__0 ) )
            {
            // InternalPdfMk.g:6215:1: ( ( rule__ListObject__Group_5__0 ) )
            // InternalPdfMk.g:6216:2: ( rule__ListObject__Group_5__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6217:2: ( rule__ListObject__Group_5__0 )
            // InternalPdfMk.g:6217:3: rule__ListObject__Group_5__0
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
    // InternalPdfMk.g:6225:1: rule__ListObject__Group__6 : rule__ListObject__Group__6__Impl rule__ListObject__Group__7 ;
    public final void rule__ListObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6229:1: ( rule__ListObject__Group__6__Impl rule__ListObject__Group__7 )
            // InternalPdfMk.g:6230:2: rule__ListObject__Group__6__Impl rule__ListObject__Group__7
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
    // InternalPdfMk.g:6237:1: rule__ListObject__Group__6__Impl : ( ']' ) ;
    public final void rule__ListObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6241:1: ( ( ']' ) )
            // InternalPdfMk.g:6242:1: ( ']' )
            {
            // InternalPdfMk.g:6242:1: ( ']' )
            // InternalPdfMk.g:6243:2: ']'
            {
             before(grammarAccess.getListObjectAccess().getRightSquareBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:6252:1: rule__ListObject__Group__7 : rule__ListObject__Group__7__Impl ;
    public final void rule__ListObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6256:1: ( rule__ListObject__Group__7__Impl )
            // InternalPdfMk.g:6257:2: rule__ListObject__Group__7__Impl
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
    // InternalPdfMk.g:6263:1: rule__ListObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ListObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6267:1: ( ( '}' ) )
            // InternalPdfMk.g:6268:1: ( '}' )
            {
            // InternalPdfMk.g:6268:1: ( '}' )
            // InternalPdfMk.g:6269:2: '}'
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
    // InternalPdfMk.g:6279:1: rule__ListObject__Group_1__0 : rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 ;
    public final void rule__ListObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6283:1: ( rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 )
            // InternalPdfMk.g:6284:2: rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1
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
    // InternalPdfMk.g:6291:1: rule__ListObject__Group_1__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) ;
    public final void rule__ListObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6295:1: ( ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) )
            // InternalPdfMk.g:6296:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            {
            // InternalPdfMk.g:6296:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            // InternalPdfMk.g:6297:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_0()); 
            // InternalPdfMk.g:6298:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            // InternalPdfMk.g:6298:3: rule__ListObject__PropertiesAssignment_1_0
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
    // InternalPdfMk.g:6306:1: rule__ListObject__Group_1__1 : rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 ;
    public final void rule__ListObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6310:1: ( rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 )
            // InternalPdfMk.g:6311:2: rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalPdfMk.g:6318:1: rule__ListObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6322:1: ( ( ',' ) )
            // InternalPdfMk.g:6323:1: ( ',' )
            {
            // InternalPdfMk.g:6323:1: ( ',' )
            // InternalPdfMk.g:6324:2: ','
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
    // InternalPdfMk.g:6333:1: rule__ListObject__Group_1__2 : rule__ListObject__Group_1__2__Impl ;
    public final void rule__ListObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6337:1: ( rule__ListObject__Group_1__2__Impl )
            // InternalPdfMk.g:6338:2: rule__ListObject__Group_1__2__Impl
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
    // InternalPdfMk.g:6344:1: rule__ListObject__Group_1__2__Impl : ( ( rule__ListObject__Group_1_2__0 )* ) ;
    public final void rule__ListObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6348:1: ( ( ( rule__ListObject__Group_1_2__0 )* ) )
            // InternalPdfMk.g:6349:1: ( ( rule__ListObject__Group_1_2__0 )* )
            {
            // InternalPdfMk.g:6349:1: ( ( rule__ListObject__Group_1_2__0 )* )
            // InternalPdfMk.g:6350:2: ( rule__ListObject__Group_1_2__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_1_2()); 
            // InternalPdfMk.g:6351:2: ( rule__ListObject__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=38 && LA35_0<=42)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPdfMk.g:6351:3: rule__ListObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPdfMk.g:6360:1: rule__ListObject__Group_1_2__0 : rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 ;
    public final void rule__ListObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6364:1: ( rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 )
            // InternalPdfMk.g:6365:2: rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1
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
    // InternalPdfMk.g:6372:1: rule__ListObject__Group_1_2__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) ;
    public final void rule__ListObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6376:1: ( ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) )
            // InternalPdfMk.g:6377:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            {
            // InternalPdfMk.g:6377:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            // InternalPdfMk.g:6378:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_2_0()); 
            // InternalPdfMk.g:6379:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            // InternalPdfMk.g:6379:3: rule__ListObject__PropertiesAssignment_1_2_0
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
    // InternalPdfMk.g:6387:1: rule__ListObject__Group_1_2__1 : rule__ListObject__Group_1_2__1__Impl ;
    public final void rule__ListObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6391:1: ( rule__ListObject__Group_1_2__1__Impl )
            // InternalPdfMk.g:6392:2: rule__ListObject__Group_1_2__1__Impl
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
    // InternalPdfMk.g:6398:1: rule__ListObject__Group_1_2__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6402:1: ( ( ',' ) )
            // InternalPdfMk.g:6403:1: ( ',' )
            {
            // InternalPdfMk.g:6403:1: ( ',' )
            // InternalPdfMk.g:6404:2: ','
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
    // InternalPdfMk.g:6414:1: rule__ListObject__Group_5__0 : rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 ;
    public final void rule__ListObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6418:1: ( rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 )
            // InternalPdfMk.g:6419:2: rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:6426:1: rule__ListObject__Group_5__0__Impl : ( ( rule__ListObject__ElementsAssignment_5_0 )? ) ;
    public final void rule__ListObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6430:1: ( ( ( rule__ListObject__ElementsAssignment_5_0 )? ) )
            // InternalPdfMk.g:6431:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            {
            // InternalPdfMk.g:6431:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            // InternalPdfMk.g:6432:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            {
             before(grammarAccess.getListObjectAccess().getElementsAssignment_5_0()); 
            // InternalPdfMk.g:6433:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING||LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPdfMk.g:6433:3: rule__ListObject__ElementsAssignment_5_0
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
    // InternalPdfMk.g:6441:1: rule__ListObject__Group_5__1 : rule__ListObject__Group_5__1__Impl ;
    public final void rule__ListObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6445:1: ( rule__ListObject__Group_5__1__Impl )
            // InternalPdfMk.g:6446:2: rule__ListObject__Group_5__1__Impl
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
    // InternalPdfMk.g:6452:1: rule__ListObject__Group_5__1__Impl : ( ( rule__ListObject__Group_5_1__0 )* ) ;
    public final void rule__ListObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6456:1: ( ( ( rule__ListObject__Group_5_1__0 )* ) )
            // InternalPdfMk.g:6457:1: ( ( rule__ListObject__Group_5_1__0 )* )
            {
            // InternalPdfMk.g:6457:1: ( ( rule__ListObject__Group_5_1__0 )* )
            // InternalPdfMk.g:6458:2: ( rule__ListObject__Group_5_1__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_5_1()); 
            // InternalPdfMk.g:6459:2: ( rule__ListObject__Group_5_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPdfMk.g:6459:3: rule__ListObject__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ListObject__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalPdfMk.g:6468:1: rule__ListObject__Group_5_1__0 : rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 ;
    public final void rule__ListObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6472:1: ( rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 )
            // InternalPdfMk.g:6473:2: rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1
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
    // InternalPdfMk.g:6480:1: rule__ListObject__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6484:1: ( ( ',' ) )
            // InternalPdfMk.g:6485:1: ( ',' )
            {
            // InternalPdfMk.g:6485:1: ( ',' )
            // InternalPdfMk.g:6486:2: ','
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
    // InternalPdfMk.g:6495:1: rule__ListObject__Group_5_1__1 : rule__ListObject__Group_5_1__1__Impl ;
    public final void rule__ListObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6499:1: ( rule__ListObject__Group_5_1__1__Impl )
            // InternalPdfMk.g:6500:2: rule__ListObject__Group_5_1__1__Impl
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
    // InternalPdfMk.g:6506:1: rule__ListObject__Group_5_1__1__Impl : ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) ;
    public final void rule__ListObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6510:1: ( ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) )
            // InternalPdfMk.g:6511:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            {
            // InternalPdfMk.g:6511:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            // InternalPdfMk.g:6512:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            {
             before(grammarAccess.getListObjectAccess().getElemtensAssignment_5_1_1()); 
            // InternalPdfMk.g:6513:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            // InternalPdfMk.g:6513:3: rule__ListObject__ElemtensAssignment_5_1_1
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
    // InternalPdfMk.g:6522:1: rule__TableObject__Group__0 : rule__TableObject__Group__0__Impl rule__TableObject__Group__1 ;
    public final void rule__TableObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6526:1: ( rule__TableObject__Group__0__Impl rule__TableObject__Group__1 )
            // InternalPdfMk.g:6527:2: rule__TableObject__Group__0__Impl rule__TableObject__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:6534:1: rule__TableObject__Group__0__Impl : ( ( rule__TableObject__ValueAssignment_0 ) ) ;
    public final void rule__TableObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6538:1: ( ( ( rule__TableObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6539:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6539:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6540:2: ( rule__TableObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTableObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6541:2: ( rule__TableObject__ValueAssignment_0 )
            // InternalPdfMk.g:6541:3: rule__TableObject__ValueAssignment_0
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
    // InternalPdfMk.g:6549:1: rule__TableObject__Group__1 : rule__TableObject__Group__1__Impl rule__TableObject__Group__2 ;
    public final void rule__TableObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6553:1: ( rule__TableObject__Group__1__Impl rule__TableObject__Group__2 )
            // InternalPdfMk.g:6554:2: rule__TableObject__Group__1__Impl rule__TableObject__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalPdfMk.g:6561:1: rule__TableObject__Group__1__Impl : ( ( rule__TableObject__Group_1__0 )? ) ;
    public final void rule__TableObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6565:1: ( ( ( rule__TableObject__Group_1__0 )? ) )
            // InternalPdfMk.g:6566:1: ( ( rule__TableObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:6566:1: ( ( rule__TableObject__Group_1__0 )? )
            // InternalPdfMk.g:6567:2: ( rule__TableObject__Group_1__0 )?
            {
             before(grammarAccess.getTableObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:6568:2: ( rule__TableObject__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPdfMk.g:6568:3: rule__TableObject__Group_1__0
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
    // InternalPdfMk.g:6576:1: rule__TableObject__Group__2 : rule__TableObject__Group__2__Impl rule__TableObject__Group__3 ;
    public final void rule__TableObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6580:1: ( rule__TableObject__Group__2__Impl rule__TableObject__Group__3 )
            // InternalPdfMk.g:6581:2: rule__TableObject__Group__2__Impl rule__TableObject__Group__3
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
    // InternalPdfMk.g:6588:1: rule__TableObject__Group__2__Impl : ( ( rule__TableObject__TableAssignment_2 ) ) ;
    public final void rule__TableObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6592:1: ( ( ( rule__TableObject__TableAssignment_2 ) ) )
            // InternalPdfMk.g:6593:1: ( ( rule__TableObject__TableAssignment_2 ) )
            {
            // InternalPdfMk.g:6593:1: ( ( rule__TableObject__TableAssignment_2 ) )
            // InternalPdfMk.g:6594:2: ( rule__TableObject__TableAssignment_2 )
            {
             before(grammarAccess.getTableObjectAccess().getTableAssignment_2()); 
            // InternalPdfMk.g:6595:2: ( rule__TableObject__TableAssignment_2 )
            // InternalPdfMk.g:6595:3: rule__TableObject__TableAssignment_2
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
    // InternalPdfMk.g:6603:1: rule__TableObject__Group__3 : rule__TableObject__Group__3__Impl ;
    public final void rule__TableObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6607:1: ( rule__TableObject__Group__3__Impl )
            // InternalPdfMk.g:6608:2: rule__TableObject__Group__3__Impl
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
    // InternalPdfMk.g:6614:1: rule__TableObject__Group__3__Impl : ( '}' ) ;
    public final void rule__TableObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6618:1: ( ( '}' ) )
            // InternalPdfMk.g:6619:1: ( '}' )
            {
            // InternalPdfMk.g:6619:1: ( '}' )
            // InternalPdfMk.g:6620:2: '}'
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
    // InternalPdfMk.g:6630:1: rule__TableObject__Group_1__0 : rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 ;
    public final void rule__TableObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6634:1: ( rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 )
            // InternalPdfMk.g:6635:2: rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1
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
    // InternalPdfMk.g:6642:1: rule__TableObject__Group_1__0__Impl : ( ( rule__TableObject__StyleAssignment_1_0 ) ) ;
    public final void rule__TableObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6646:1: ( ( ( rule__TableObject__StyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:6647:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:6647:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            // InternalPdfMk.g:6648:2: ( rule__TableObject__StyleAssignment_1_0 )
            {
             before(grammarAccess.getTableObjectAccess().getStyleAssignment_1_0()); 
            // InternalPdfMk.g:6649:2: ( rule__TableObject__StyleAssignment_1_0 )
            // InternalPdfMk.g:6649:3: rule__TableObject__StyleAssignment_1_0
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
    // InternalPdfMk.g:6657:1: rule__TableObject__Group_1__1 : rule__TableObject__Group_1__1__Impl ;
    public final void rule__TableObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6661:1: ( rule__TableObject__Group_1__1__Impl )
            // InternalPdfMk.g:6662:2: rule__TableObject__Group_1__1__Impl
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
    // InternalPdfMk.g:6668:1: rule__TableObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__TableObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6672:1: ( ( ',' ) )
            // InternalPdfMk.g:6673:1: ( ',' )
            {
            // InternalPdfMk.g:6673:1: ( ',' )
            // InternalPdfMk.g:6674:2: ','
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
    // InternalPdfMk.g:6684:1: rule__ContentObjects__Group__0 : rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 ;
    public final void rule__ContentObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6688:1: ( rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 )
            // InternalPdfMk.g:6689:2: rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1
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
    // InternalPdfMk.g:6696:1: rule__ContentObjects__Group__0__Impl : ( () ) ;
    public final void rule__ContentObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6700:1: ( ( () ) )
            // InternalPdfMk.g:6701:1: ( () )
            {
            // InternalPdfMk.g:6701:1: ( () )
            // InternalPdfMk.g:6702:2: ()
            {
             before(grammarAccess.getContentObjectsAccess().getContentObjectsAction_0()); 
            // InternalPdfMk.g:6703:2: ()
            // InternalPdfMk.g:6703:3: 
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
    // InternalPdfMk.g:6711:1: rule__ContentObjects__Group__1 : rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 ;
    public final void rule__ContentObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6715:1: ( rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 )
            // InternalPdfMk.g:6716:2: rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6723:1: rule__ContentObjects__Group__1__Impl : ( '[' ) ;
    public final void rule__ContentObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6727:1: ( ( '[' ) )
            // InternalPdfMk.g:6728:1: ( '[' )
            {
            // InternalPdfMk.g:6728:1: ( '[' )
            // InternalPdfMk.g:6729:2: '['
            {
             before(grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:6738:1: rule__ContentObjects__Group__2 : rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3 ;
    public final void rule__ContentObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6742:1: ( rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3 )
            // InternalPdfMk.g:6743:2: rule__ContentObjects__Group__2__Impl rule__ContentObjects__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalPdfMk.g:6750:1: rule__ContentObjects__Group__2__Impl : ( ( rule__ContentObjects__Group_2__0 )? ) ;
    public final void rule__ContentObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6754:1: ( ( ( rule__ContentObjects__Group_2__0 )? ) )
            // InternalPdfMk.g:6755:1: ( ( rule__ContentObjects__Group_2__0 )? )
            {
            // InternalPdfMk.g:6755:1: ( ( rule__ContentObjects__Group_2__0 )? )
            // InternalPdfMk.g:6756:2: ( rule__ContentObjects__Group_2__0 )?
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_2()); 
            // InternalPdfMk.g:6757:2: ( rule__ContentObjects__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING||LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:6757:3: rule__ContentObjects__Group_2__0
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
    // InternalPdfMk.g:6765:1: rule__ContentObjects__Group__3 : rule__ContentObjects__Group__3__Impl ;
    public final void rule__ContentObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6769:1: ( rule__ContentObjects__Group__3__Impl )
            // InternalPdfMk.g:6770:2: rule__ContentObjects__Group__3__Impl
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
    // InternalPdfMk.g:6776:1: rule__ContentObjects__Group__3__Impl : ( ']' ) ;
    public final void rule__ContentObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6780:1: ( ( ']' ) )
            // InternalPdfMk.g:6781:1: ( ']' )
            {
            // InternalPdfMk.g:6781:1: ( ']' )
            // InternalPdfMk.g:6782:2: ']'
            {
             before(grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:6792:1: rule__ContentObjects__Group_2__0 : rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1 ;
    public final void rule__ContentObjects__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6796:1: ( rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1 )
            // InternalPdfMk.g:6797:2: rule__ContentObjects__Group_2__0__Impl rule__ContentObjects__Group_2__1
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
    // InternalPdfMk.g:6804:1: rule__ContentObjects__Group_2__0__Impl : ( ( rule__ContentObjects__ValueAssignment_2_0 ) ) ;
    public final void rule__ContentObjects__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6808:1: ( ( ( rule__ContentObjects__ValueAssignment_2_0 ) ) )
            // InternalPdfMk.g:6809:1: ( ( rule__ContentObjects__ValueAssignment_2_0 ) )
            {
            // InternalPdfMk.g:6809:1: ( ( rule__ContentObjects__ValueAssignment_2_0 ) )
            // InternalPdfMk.g:6810:2: ( rule__ContentObjects__ValueAssignment_2_0 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_2_0()); 
            // InternalPdfMk.g:6811:2: ( rule__ContentObjects__ValueAssignment_2_0 )
            // InternalPdfMk.g:6811:3: rule__ContentObjects__ValueAssignment_2_0
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
    // InternalPdfMk.g:6819:1: rule__ContentObjects__Group_2__1 : rule__ContentObjects__Group_2__1__Impl ;
    public final void rule__ContentObjects__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6823:1: ( rule__ContentObjects__Group_2__1__Impl )
            // InternalPdfMk.g:6824:2: rule__ContentObjects__Group_2__1__Impl
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
    // InternalPdfMk.g:6830:1: rule__ContentObjects__Group_2__1__Impl : ( ( rule__ContentObjects__Group_2_1__0 )* ) ;
    public final void rule__ContentObjects__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6834:1: ( ( ( rule__ContentObjects__Group_2_1__0 )* ) )
            // InternalPdfMk.g:6835:1: ( ( rule__ContentObjects__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:6835:1: ( ( rule__ContentObjects__Group_2_1__0 )* )
            // InternalPdfMk.g:6836:2: ( rule__ContentObjects__Group_2_1__0 )*
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_2_1()); 
            // InternalPdfMk.g:6837:2: ( rule__ContentObjects__Group_2_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPdfMk.g:6837:3: rule__ContentObjects__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ContentObjects__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalPdfMk.g:6846:1: rule__ContentObjects__Group_2_1__0 : rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1 ;
    public final void rule__ContentObjects__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6850:1: ( rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1 )
            // InternalPdfMk.g:6851:2: rule__ContentObjects__Group_2_1__0__Impl rule__ContentObjects__Group_2_1__1
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
    // InternalPdfMk.g:6858:1: rule__ContentObjects__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ContentObjects__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6862:1: ( ( ',' ) )
            // InternalPdfMk.g:6863:1: ( ',' )
            {
            // InternalPdfMk.g:6863:1: ( ',' )
            // InternalPdfMk.g:6864:2: ','
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
    // InternalPdfMk.g:6873:1: rule__ContentObjects__Group_2_1__1 : rule__ContentObjects__Group_2_1__1__Impl ;
    public final void rule__ContentObjects__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6877:1: ( rule__ContentObjects__Group_2_1__1__Impl )
            // InternalPdfMk.g:6878:2: rule__ContentObjects__Group_2_1__1__Impl
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
    // InternalPdfMk.g:6884:1: rule__ContentObjects__Group_2_1__1__Impl : ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ContentObjects__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6888:1: ( ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:6889:1: ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:6889:1: ( ( rule__ContentObjects__ValueAssignment_2_1_1 ) )
            // InternalPdfMk.g:6890:2: ( rule__ContentObjects__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_2_1_1()); 
            // InternalPdfMk.g:6891:2: ( rule__ContentObjects__ValueAssignment_2_1_1 )
            // InternalPdfMk.g:6891:3: rule__ContentObjects__ValueAssignment_2_1_1
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
    // InternalPdfMk.g:6900:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6904:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:6905:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
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
    // InternalPdfMk.g:6912:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6916:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:6917:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:6917:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:6918:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:6919:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:6919:3: rule__Styles__KeyAssignment_0
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
    // InternalPdfMk.g:6927:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6931:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:6932:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
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
    // InternalPdfMk.g:6939:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6943:1: ( ( ':' ) )
            // InternalPdfMk.g:6944:1: ( ':' )
            {
            // InternalPdfMk.g:6944:1: ( ':' )
            // InternalPdfMk.g:6945:2: ':'
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
    // InternalPdfMk.g:6954:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6958:1: ( rule__Styles__Group__2__Impl )
            // InternalPdfMk.g:6959:2: rule__Styles__Group__2__Impl
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
    // InternalPdfMk.g:6965:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6969:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:6970:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:6970:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:6971:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:6972:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:6972:3: rule__Styles__ValueAssignment_2
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
    // InternalPdfMk.g:6981:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6985:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:6986:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalPdfMk.g:6993:1: rule__Content__Group__0__Impl : ( ( rule__Content__KeyAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6997:1: ( ( ( rule__Content__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:6998:1: ( ( rule__Content__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:6998:1: ( ( rule__Content__KeyAssignment_0 ) )
            // InternalPdfMk.g:6999:2: ( rule__Content__KeyAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:7000:2: ( rule__Content__KeyAssignment_0 )
            // InternalPdfMk.g:7000:3: rule__Content__KeyAssignment_0
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
    // InternalPdfMk.g:7008:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7012:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:7013:2: rule__Content__Group__1__Impl rule__Content__Group__2
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
    // InternalPdfMk.g:7020:1: rule__Content__Group__1__Impl : ( ':' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7024:1: ( ( ':' ) )
            // InternalPdfMk.g:7025:1: ( ':' )
            {
            // InternalPdfMk.g:7025:1: ( ':' )
            // InternalPdfMk.g:7026:2: ':'
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
    // InternalPdfMk.g:7035:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7039:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:7040:2: rule__Content__Group__2__Impl
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
    // InternalPdfMk.g:7046:1: rule__Content__Group__2__Impl : ( ( rule__Content__ValueAssignment_2 ) ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7050:1: ( ( ( rule__Content__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:7051:1: ( ( rule__Content__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:7051:1: ( ( rule__Content__ValueAssignment_2 ) )
            // InternalPdfMk.g:7052:2: ( rule__Content__ValueAssignment_2 )
            {
             before(grammarAccess.getContentAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:7053:2: ( rule__Content__ValueAssignment_2 )
            // InternalPdfMk.g:7053:3: rule__Content__ValueAssignment_2
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
    // InternalPdfMk.g:7062:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7066:1: ( ( ruleContent ) )
            // InternalPdfMk.g:7067:2: ( ruleContent )
            {
            // InternalPdfMk.g:7067:2: ( ruleContent )
            // InternalPdfMk.g:7068:3: ruleContent
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
    // InternalPdfMk.g:7077:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7081:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:7082:2: ( ruleStyles )
            {
            // InternalPdfMk.g:7082:2: ( ruleStyles )
            // InternalPdfMk.g:7083:3: ruleStyles
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
    // InternalPdfMk.g:7092:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7096:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7097:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7097:2: ( RULE_STRING )
            // InternalPdfMk.g:7098:3: RULE_STRING
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
    // InternalPdfMk.g:7107:1: rule__TypeFaceDefinition__KeyAssignment_0 : ( ( 'bold' ) ) ;
    public final void rule__TypeFaceDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7111:1: ( ( ( 'bold' ) ) )
            // InternalPdfMk.g:7112:2: ( ( 'bold' ) )
            {
            // InternalPdfMk.g:7112:2: ( ( 'bold' ) )
            // InternalPdfMk.g:7113:3: ( 'bold' )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            // InternalPdfMk.g:7114:3: ( 'bold' )
            // InternalPdfMk.g:7115:4: 'bold'
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPdfMk.g:7126:1: rule__TypeFaceDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__TypeFaceDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7130:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7131:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7131:2: ( ruleBooleanType )
            // InternalPdfMk.g:7132:3: ruleBooleanType
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
    // InternalPdfMk.g:7141:1: rule__TextStyleDefinition__KeyAssignment_0 : ( ( 'style' ) ) ;
    public final void rule__TextStyleDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7145:1: ( ( ( 'style' ) ) )
            // InternalPdfMk.g:7146:2: ( ( 'style' ) )
            {
            // InternalPdfMk.g:7146:2: ( ( 'style' ) )
            // InternalPdfMk.g:7147:3: ( 'style' )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            // InternalPdfMk.g:7148:3: ( 'style' )
            // InternalPdfMk.g:7149:4: 'style'
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPdfMk.g:7160:1: rule__TextStyleDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextStyleDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7164:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7165:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7165:2: ( RULE_STRING )
            // InternalPdfMk.g:7166:3: RULE_STRING
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
    // InternalPdfMk.g:7175:1: rule__TextDefinition__KeyAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__TextDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7179:1: ( ( ( 'text' ) ) )
            // InternalPdfMk.g:7180:2: ( ( 'text' ) )
            {
            // InternalPdfMk.g:7180:2: ( ( 'text' ) )
            // InternalPdfMk.g:7181:3: ( 'text' )
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 
            // InternalPdfMk.g:7182:3: ( 'text' )
            // InternalPdfMk.g:7183:4: 'text'
            {
             before(grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPdfMk.g:7194:1: rule__TextDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7198:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7199:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7199:2: ( RULE_STRING )
            // InternalPdfMk.g:7200:3: RULE_STRING
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


    // $ANTLR start "rule__TextAlignmentDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7209:1: rule__TextAlignmentDefinition__KeyAssignment_0 : ( ( 'alignment' ) ) ;
    public final void rule__TextAlignmentDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7213:1: ( ( ( 'alignment' ) ) )
            // InternalPdfMk.g:7214:2: ( ( 'alignment' ) )
            {
            // InternalPdfMk.g:7214:2: ( ( 'alignment' ) )
            // InternalPdfMk.g:7215:3: ( 'alignment' )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0()); 
            // InternalPdfMk.g:7216:3: ( 'alignment' )
            // InternalPdfMk.g:7217:4: 'alignment'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0()); 

            }

             after(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAlignmentDefinition__KeyAssignment_0"


    // $ANTLR start "rule__TextAlignmentDefinition__ValueAssignment_2"
    // InternalPdfMk.g:7228:1: rule__TextAlignmentDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7232:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7233:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7233:2: ( RULE_STRING )
            // InternalPdfMk.g:7234:3: RULE_STRING
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAlignmentDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAlignmentDefinition__ValueAssignment_2"


    // $ANTLR start "rule__ItalicsDefinition__KeyAssignment_0"
    // InternalPdfMk.g:7243:1: rule__ItalicsDefinition__KeyAssignment_0 : ( ( 'italics' ) ) ;
    public final void rule__ItalicsDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7247:1: ( ( ( 'italics' ) ) )
            // InternalPdfMk.g:7248:2: ( ( 'italics' ) )
            {
            // InternalPdfMk.g:7248:2: ( ( 'italics' ) )
            // InternalPdfMk.g:7249:3: ( 'italics' )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            // InternalPdfMk.g:7250:3: ( 'italics' )
            // InternalPdfMk.g:7251:4: 'italics'
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
    // InternalPdfMk.g:7262:1: rule__ItalicsDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ItalicsDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7266:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7267:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7267:2: ( ruleBooleanType )
            // InternalPdfMk.g:7268:3: ruleBooleanType
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
    // InternalPdfMk.g:7277:1: rule__FontSizeDefinition__KeyAssignment_0 : ( ( 'fontSize' ) ) ;
    public final void rule__FontSizeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7281:1: ( ( ( 'fontSize' ) ) )
            // InternalPdfMk.g:7282:2: ( ( 'fontSize' ) )
            {
            // InternalPdfMk.g:7282:2: ( ( 'fontSize' ) )
            // InternalPdfMk.g:7283:3: ( 'fontSize' )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            // InternalPdfMk.g:7284:3: ( 'fontSize' )
            // InternalPdfMk.g:7285:4: 'fontSize'
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
    // InternalPdfMk.g:7296:1: rule__FontSizeDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FontSizeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7300:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7301:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7301:2: ( RULE_INT )
            // InternalPdfMk.g:7302:3: RULE_INT
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
    // InternalPdfMk.g:7311:1: rule__WidthDefinition__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__WidthDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7315:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:7316:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:7316:2: ( ( 'width' ) )
            // InternalPdfMk.g:7317:3: ( 'width' )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:7318:3: ( 'width' )
            // InternalPdfMk.g:7319:4: 'width'
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
    // InternalPdfMk.g:7330:1: rule__WidthDefinition__ValueAssignment_2 : ( ruleColumnTextWidthType ) ;
    public final void rule__WidthDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7334:1: ( ( ruleColumnTextWidthType ) )
            // InternalPdfMk.g:7335:2: ( ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:7335:2: ( ruleColumnTextWidthType )
            // InternalPdfMk.g:7336:3: ruleColumnTextWidthType
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
    // InternalPdfMk.g:7345:1: rule__ColumnDefinition__GlobalStyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__ColumnDefinition__GlobalStyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7349:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:7350:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:7350:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:7351:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:7360:1: rule__ColumnDefinition__KeyAssignment_2 : ( ( 'columns' ) ) ;
    public final void rule__ColumnDefinition__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7364:1: ( ( ( 'columns' ) ) )
            // InternalPdfMk.g:7365:2: ( ( 'columns' ) )
            {
            // InternalPdfMk.g:7365:2: ( ( 'columns' ) )
            // InternalPdfMk.g:7366:3: ( 'columns' )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 
            // InternalPdfMk.g:7367:3: ( 'columns' )
            // InternalPdfMk.g:7368:4: 'columns'
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
    // InternalPdfMk.g:7379:1: rule__ColumnDefinition__ValueAssignment_4_0 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7383:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:7384:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:7384:2: ( ruleColumnObject )
            // InternalPdfMk.g:7385:3: ruleColumnObject
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
    // InternalPdfMk.g:7394:1: rule__ColumnDefinition__ValueAssignment_4_1_1 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7398:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:7399:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:7399:2: ( ruleColumnObject )
            // InternalPdfMk.g:7400:3: ruleColumnObject
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
    // InternalPdfMk.g:7409:1: rule__MarginDefinition__KeyAssignment_0 : ( ( 'margin' ) ) ;
    public final void rule__MarginDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7413:1: ( ( ( 'margin' ) ) )
            // InternalPdfMk.g:7414:2: ( ( 'margin' ) )
            {
            // InternalPdfMk.g:7414:2: ( ( 'margin' ) )
            // InternalPdfMk.g:7415:3: ( 'margin' )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 
            // InternalPdfMk.g:7416:3: ( 'margin' )
            // InternalPdfMk.g:7417:4: 'margin'
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
    // InternalPdfMk.g:7428:1: rule__MarginDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7432:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7433:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7433:2: ( RULE_INT )
            // InternalPdfMk.g:7434:3: RULE_INT
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
    // InternalPdfMk.g:7443:1: rule__MarginDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7447:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7448:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7448:2: ( RULE_INT )
            // InternalPdfMk.g:7449:3: RULE_INT
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
    // InternalPdfMk.g:7458:1: rule__ImageDefintion__KeyAssignment_0 : ( ( 'image' ) ) ;
    public final void rule__ImageDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7462:1: ( ( ( 'image' ) ) )
            // InternalPdfMk.g:7463:2: ( ( 'image' ) )
            {
            // InternalPdfMk.g:7463:2: ( ( 'image' ) )
            // InternalPdfMk.g:7464:3: ( 'image' )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 
            // InternalPdfMk.g:7465:3: ( 'image' )
            // InternalPdfMk.g:7466:4: 'image'
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
    // InternalPdfMk.g:7477:1: rule__ImageDefintion__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7481:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7482:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7482:2: ( RULE_STRING )
            // InternalPdfMk.g:7483:3: RULE_STRING
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
    // InternalPdfMk.g:7492:1: rule__ImageWidthDefintion__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__ImageWidthDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7496:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:7497:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:7497:2: ( ( 'width' ) )
            // InternalPdfMk.g:7498:3: ( 'width' )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:7499:3: ( 'width' )
            // InternalPdfMk.g:7500:4: 'width'
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
    // InternalPdfMk.g:7511:1: rule__ImageWidthDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageWidthDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7515:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7516:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7516:2: ( RULE_INT )
            // InternalPdfMk.g:7517:3: RULE_INT
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
    // InternalPdfMk.g:7526:1: rule__ImageHeightDefintion__KeyAssignment_0 : ( ( 'height' ) ) ;
    public final void rule__ImageHeightDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7530:1: ( ( ( 'height' ) ) )
            // InternalPdfMk.g:7531:2: ( ( 'height' ) )
            {
            // InternalPdfMk.g:7531:2: ( ( 'height' ) )
            // InternalPdfMk.g:7532:3: ( 'height' )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 
            // InternalPdfMk.g:7533:3: ( 'height' )
            // InternalPdfMk.g:7534:4: 'height'
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
    // InternalPdfMk.g:7545:1: rule__ImageHeightDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageHeightDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7549:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7550:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7550:2: ( RULE_INT )
            // InternalPdfMk.g:7551:3: RULE_INT
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
    // InternalPdfMk.g:7560:1: rule__ImagePageBreakDefinition__KeyAssignment_0 : ( ( 'pageBreak' ) ) ;
    public final void rule__ImagePageBreakDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7564:1: ( ( ( 'pageBreak' ) ) )
            // InternalPdfMk.g:7565:2: ( ( 'pageBreak' ) )
            {
            // InternalPdfMk.g:7565:2: ( ( 'pageBreak' ) )
            // InternalPdfMk.g:7566:3: ( 'pageBreak' )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 
            // InternalPdfMk.g:7567:3: ( 'pageBreak' )
            // InternalPdfMk.g:7568:4: 'pageBreak'
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
    // InternalPdfMk.g:7579:1: rule__ImagePageBreakDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImagePageBreakDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7583:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7584:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7584:2: ( RULE_STRING )
            // InternalPdfMk.g:7585:3: RULE_STRING
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
    // InternalPdfMk.g:7594:1: rule__ImageFitDefinition__KeyAssignment_0 : ( ( 'fit' ) ) ;
    public final void rule__ImageFitDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7598:1: ( ( ( 'fit' ) ) )
            // InternalPdfMk.g:7599:2: ( ( 'fit' ) )
            {
            // InternalPdfMk.g:7599:2: ( ( 'fit' ) )
            // InternalPdfMk.g:7600:3: ( 'fit' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 
            // InternalPdfMk.g:7601:3: ( 'fit' )
            // InternalPdfMk.g:7602:4: 'fit'
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
    // InternalPdfMk.g:7613:1: rule__ImageFitDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__ImageFitDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7617:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:7618:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:7618:2: ( ( '[' ) )
            // InternalPdfMk.g:7619:3: ( '[' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:7620:3: ( '[' )
            // InternalPdfMk.g:7621:4: '['
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:7632:1: rule__ImageFitDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7636:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7637:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7637:2: ( RULE_INT )
            // InternalPdfMk.g:7638:3: RULE_INT
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
    // InternalPdfMk.g:7647:1: rule__ImageFitDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7651:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7652:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7652:2: ( RULE_INT )
            // InternalPdfMk.g:7653:3: RULE_INT
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
    // InternalPdfMk.g:7662:1: rule__ImageOpacityDefinition__KeyAssignment_0 : ( ( 'opacity' ) ) ;
    public final void rule__ImageOpacityDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7666:1: ( ( ( 'opacity' ) ) )
            // InternalPdfMk.g:7667:2: ( ( 'opacity' ) )
            {
            // InternalPdfMk.g:7667:2: ( ( 'opacity' ) )
            // InternalPdfMk.g:7668:3: ( 'opacity' )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 
            // InternalPdfMk.g:7669:3: ( 'opacity' )
            // InternalPdfMk.g:7670:4: 'opacity'
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
    // InternalPdfMk.g:7681:1: rule__ImageOpacityDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageOpacityDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7685:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7686:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7686:2: ( RULE_INT )
            // InternalPdfMk.g:7687:3: RULE_INT
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
    // InternalPdfMk.g:7696:1: rule__ListReversedDefinition__KeyAssignment_0 : ( ( 'reversed' ) ) ;
    public final void rule__ListReversedDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7700:1: ( ( ( 'reversed' ) ) )
            // InternalPdfMk.g:7701:2: ( ( 'reversed' ) )
            {
            // InternalPdfMk.g:7701:2: ( ( 'reversed' ) )
            // InternalPdfMk.g:7702:3: ( 'reversed' )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 
            // InternalPdfMk.g:7703:3: ( 'reversed' )
            // InternalPdfMk.g:7704:4: 'reversed'
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
    // InternalPdfMk.g:7715:1: rule__ListReversedDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ListReversedDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7719:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:7720:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:7720:2: ( ruleBooleanType )
            // InternalPdfMk.g:7721:3: ruleBooleanType
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
    // InternalPdfMk.g:7730:1: rule__ListCounterDefinition__KeyAssignment_0 : ( ( 'counter' ) ) ;
    public final void rule__ListCounterDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7734:1: ( ( ( 'counter' ) ) )
            // InternalPdfMk.g:7735:2: ( ( 'counter' ) )
            {
            // InternalPdfMk.g:7735:2: ( ( 'counter' ) )
            // InternalPdfMk.g:7736:3: ( 'counter' )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 
            // InternalPdfMk.g:7737:3: ( 'counter' )
            // InternalPdfMk.g:7738:4: 'counter'
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
    // InternalPdfMk.g:7749:1: rule__ListCounterDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ListCounterDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7753:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:7754:2: ( RULE_INT )
            {
            // InternalPdfMk.g:7754:2: ( RULE_INT )
            // InternalPdfMk.g:7755:3: RULE_INT
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
    // InternalPdfMk.g:7764:1: rule__ListTypeDefinition__KeyAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__ListTypeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7768:1: ( ( ( 'type' ) ) )
            // InternalPdfMk.g:7769:2: ( ( 'type' ) )
            {
            // InternalPdfMk.g:7769:2: ( ( 'type' ) )
            // InternalPdfMk.g:7770:3: ( 'type' )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 
            // InternalPdfMk.g:7771:3: ( 'type' )
            // InternalPdfMk.g:7772:4: 'type'
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
    // InternalPdfMk.g:7783:1: rule__ListTypeDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListTypeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7787:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7788:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7788:2: ( RULE_STRING )
            // InternalPdfMk.g:7789:3: RULE_STRING
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
    // InternalPdfMk.g:7798:1: rule__ListColorDefinition__KeyAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ListColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7802:1: ( ( ( 'color' ) ) )
            // InternalPdfMk.g:7803:2: ( ( 'color' ) )
            {
            // InternalPdfMk.g:7803:2: ( ( 'color' ) )
            // InternalPdfMk.g:7804:3: ( 'color' )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 
            // InternalPdfMk.g:7805:3: ( 'color' )
            // InternalPdfMk.g:7806:4: 'color'
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
    // InternalPdfMk.g:7817:1: rule__ListColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7821:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7822:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7822:2: ( RULE_STRING )
            // InternalPdfMk.g:7823:3: RULE_STRING
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
    // InternalPdfMk.g:7832:1: rule__ListMarkerColorDefinition__KeyAssignment_0 : ( ( 'markerColor' ) ) ;
    public final void rule__ListMarkerColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7836:1: ( ( ( 'markerColor' ) ) )
            // InternalPdfMk.g:7837:2: ( ( 'markerColor' ) )
            {
            // InternalPdfMk.g:7837:2: ( ( 'markerColor' ) )
            // InternalPdfMk.g:7838:3: ( 'markerColor' )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 
            // InternalPdfMk.g:7839:3: ( 'markerColor' )
            // InternalPdfMk.g:7840:4: 'markerColor'
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
    // InternalPdfMk.g:7851:1: rule__ListMarkerColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListMarkerColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7855:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:7856:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:7856:2: ( RULE_STRING )
            // InternalPdfMk.g:7857:3: RULE_STRING
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
    // InternalPdfMk.g:7866:1: rule__TableCellItemElements__ElementsAssignment : ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) ;
    public final void rule__TableCellItemElements__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7870:1: ( ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) )
            // InternalPdfMk.g:7871:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            {
            // InternalPdfMk.g:7871:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            // InternalPdfMk.g:7872:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            {
             before(grammarAccess.getTableCellItemElementsAccess().getElementsAlternatives_0()); 
            // InternalPdfMk.g:7873:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            // InternalPdfMk.g:7873:4: rule__TableCellItemElements__ElementsAlternatives_0
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
    // InternalPdfMk.g:7881:1: rule__TableRowDefinition__ItemAssignment_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7885:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:7886:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:7886:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:7887:3: ruleTableCellItemElements
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
    // InternalPdfMk.g:7896:1: rule__TableRowDefinition__ItemAssignment_2_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7900:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:7901:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:7901:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:7902:3: ruleTableCellItemElements
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
    // InternalPdfMk.g:7911:1: rule__TableBodyDefinition__KeyAssignment_0 : ( ( 'body' ) ) ;
    public final void rule__TableBodyDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7915:1: ( ( ( 'body' ) ) )
            // InternalPdfMk.g:7916:2: ( ( 'body' ) )
            {
            // InternalPdfMk.g:7916:2: ( ( 'body' ) )
            // InternalPdfMk.g:7917:3: ( 'body' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 
            // InternalPdfMk.g:7918:3: ( 'body' )
            // InternalPdfMk.g:7919:4: 'body'
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
    // InternalPdfMk.g:7930:1: rule__TableBodyDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__TableBodyDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7934:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:7935:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:7935:2: ( ( '[' ) )
            // InternalPdfMk.g:7936:3: ( '[' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:7937:3: ( '[' )
            // InternalPdfMk.g:7938:4: '['
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:7949:1: rule__TableBodyDefinition__RowsAssignment_3_0 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7953:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:7954:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:7954:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:7955:3: ruleTableRowDefinition
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
    // InternalPdfMk.g:7964:1: rule__TableBodyDefinition__RowsAssignment_3_1_1 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7968:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:7969:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:7969:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:7970:3: ruleTableRowDefinition
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
    // InternalPdfMk.g:7979:1: rule__TableDefinition__KeyAssignment_0 : ( ( 'table' ) ) ;
    public final void rule__TableDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7983:1: ( ( ( 'table' ) ) )
            // InternalPdfMk.g:7984:2: ( ( 'table' ) )
            {
            // InternalPdfMk.g:7984:2: ( ( 'table' ) )
            // InternalPdfMk.g:7985:3: ( 'table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 
            // InternalPdfMk.g:7986:3: ( 'table' )
            // InternalPdfMk.g:7987:4: 'table'
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
    // InternalPdfMk.g:7998:1: rule__TableDefinition__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__TableDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8002:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8003:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8003:2: ( ( '{' ) )
            // InternalPdfMk.g:8004:3: ( '{' )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:8005:3: ( '{' )
            // InternalPdfMk.g:8006:4: '{'
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
    // InternalPdfMk.g:8017:1: rule__TableDefinition__BodyAssignment_3 : ( ruleTableBodyDefinition ) ;
    public final void rule__TableDefinition__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8021:1: ( ( ruleTableBodyDefinition ) )
            // InternalPdfMk.g:8022:2: ( ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:8022:2: ( ruleTableBodyDefinition )
            // InternalPdfMk.g:8023:3: ruleTableBodyDefinition
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


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0"
    // InternalPdfMk.g:8032:1: rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8036:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8037:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8037:2: ( ruleStringObject )
            // InternalPdfMk.g:8038:3: ruleStringObject
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__TextAssignment_0_0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1"
    // InternalPdfMk.g:8047:1: rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8051:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8052:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8052:2: ( ruleStringObject )
            // InternalPdfMk.g:8053:3: ruleStringObject
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__TextAssignment_0_1_1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0"
    // InternalPdfMk.g:8062:1: rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8066:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8067:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8067:2: ( ruleTextObject )
            // InternalPdfMk.g:8068:3: ruleTextObject
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1"
    // InternalPdfMk.g:8077:1: rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8081:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8082:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8082:2: ( ruleTextObject )
            // InternalPdfMk.g:8083:3: ruleTextObject
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__TextObjectAssignment_1_1_1"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0"
    // InternalPdfMk.g:8092:1: rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8096:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8097:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8097:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8098:3: ruleColumnDefinition
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_0"


    // $ANTLR start "rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1"
    // InternalPdfMk.g:8107:1: rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8111:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8112:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8112:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8113:3: ruleColumnDefinition
            {
             before(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerColumnObjectMembersWrapper__ColumnAssignment_2_1_1"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__TextAssignment_0_0"
    // InternalPdfMk.g:8122:1: rule__ColumnObjectMembersWrapper__TextAssignment_0_0 : ( ruleStringObject ) ;
    public final void rule__ColumnObjectMembersWrapper__TextAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8126:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8127:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8127:2: ( ruleStringObject )
            // InternalPdfMk.g:8128:3: ruleStringObject
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__TextAssignment_0_0"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1"
    // InternalPdfMk.g:8137:1: rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1 : ( ruleStringObject ) ;
    public final void rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8141:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:8142:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:8142:2: ( ruleStringObject )
            // InternalPdfMk.g:8143:3: ruleStringObject
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__TextAssignment_0_1_1"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0"
    // InternalPdfMk.g:8152:1: rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0 : ( ruleTextObject ) ;
    public final void rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8156:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8157:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8157:2: ( ruleTextObject )
            // InternalPdfMk.g:8158:3: ruleTextObject
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_0"


    // $ANTLR start "rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1"
    // InternalPdfMk.g:8167:1: rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1 : ( ruleTextObject ) ;
    public final void rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8171:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:8172:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:8172:2: ( ruleTextObject )
            // InternalPdfMk.g:8173:3: ruleTextObject
            {
             before(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextObject();

            state._fsp--;

             after(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObjectMembersWrapper__TextObjectAssignment_1_1_1"


    // $ANTLR start "rule__ListObjectPropertiesWrapper__ValueAssignment"
    // InternalPdfMk.g:8182:1: rule__ListObjectPropertiesWrapper__ValueAssignment : ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) ;
    public final void rule__ListObjectPropertiesWrapper__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8186:1: ( ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:8187:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:8187:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            // InternalPdfMk.g:8188:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:8189:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            // InternalPdfMk.g:8189:4: rule__ListObjectPropertiesWrapper__ValueAlternatives_0
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


    // $ANTLR start "rule__TextObject__MembersAssignment_1_0"
    // InternalPdfMk.g:8197:1: rule__TextObject__MembersAssignment_1_0 : ( ruleTextObjectMembersWrapper ) ;
    public final void rule__TextObject__MembersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8201:1: ( ( ruleTextObjectMembersWrapper ) )
            // InternalPdfMk.g:8202:2: ( ruleTextObjectMembersWrapper )
            {
            // InternalPdfMk.g:8202:2: ( ruleTextObjectMembersWrapper )
            // InternalPdfMk.g:8203:3: ruleTextObjectMembersWrapper
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
    // InternalPdfMk.g:8212:1: rule__TextObject__MembersAssignment_1_1_1 : ( ruleTextObjectMembersWrapper ) ;
    public final void rule__TextObject__MembersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8216:1: ( ( ruleTextObjectMembersWrapper ) )
            // InternalPdfMk.g:8217:2: ( ruleTextObjectMembersWrapper )
            {
            // InternalPdfMk.g:8217:2: ( ruleTextObjectMembersWrapper )
            // InternalPdfMk.g:8218:3: ruleTextObjectMembersWrapper
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
    // InternalPdfMk.g:8227:1: rule__ColumnTextObject__ValueAssignment : ( ruleColumnDefinition ) ;
    public final void rule__ColumnTextObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8231:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:8232:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:8232:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:8233:3: ruleColumnDefinition
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
    // InternalPdfMk.g:8242:1: rule__StyleObject__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StyleObject__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8246:1: ( ( RULE_ID ) )
            // InternalPdfMk.g:8247:2: ( RULE_ID )
            {
            // InternalPdfMk.g:8247:2: ( RULE_ID )
            // InternalPdfMk.g:8248:3: RULE_ID
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
    // InternalPdfMk.g:8257:1: rule__StyleObject__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__StyleObject__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8261:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8262:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8262:2: ( ( '{' ) )
            // InternalPdfMk.g:8263:3: ( '{' )
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:8264:3: ( '{' )
            // InternalPdfMk.g:8265:4: '{'
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


    // $ANTLR start "rule__StyleObject__MembersAssignment_3_0"
    // InternalPdfMk.g:8276:1: rule__StyleObject__MembersAssignment_3_0 : ( ruleStyleObjectMembersWrapper ) ;
    public final void rule__StyleObject__MembersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8280:1: ( ( ruleStyleObjectMembersWrapper ) )
            // InternalPdfMk.g:8281:2: ( ruleStyleObjectMembersWrapper )
            {
            // InternalPdfMk.g:8281:2: ( ruleStyleObjectMembersWrapper )
            // InternalPdfMk.g:8282:3: ruleStyleObjectMembersWrapper
            {
             before(grammarAccess.getStyleObjectAccess().getMembersStyleObjectMembersWrapperParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getMembersStyleObjectMembersWrapperParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__MembersAssignment_3_0"


    // $ANTLR start "rule__StyleObject__MembersAssignment_3_1_1"
    // InternalPdfMk.g:8291:1: rule__StyleObject__MembersAssignment_3_1_1 : ( ruleStyleObjectMembersWrapper ) ;
    public final void rule__StyleObject__MembersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8295:1: ( ( ruleStyleObjectMembersWrapper ) )
            // InternalPdfMk.g:8296:2: ( ruleStyleObjectMembersWrapper )
            {
            // InternalPdfMk.g:8296:2: ( ruleStyleObjectMembersWrapper )
            // InternalPdfMk.g:8297:3: ruleStyleObjectMembersWrapper
            {
             before(grammarAccess.getStyleObjectAccess().getMembersStyleObjectMembersWrapperParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getStyleObjectAccess().getMembersStyleObjectMembersWrapperParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObject__MembersAssignment_3_1_1"


    // $ANTLR start "rule__StyleObjects__ValueAssignment_1_0"
    // InternalPdfMk.g:8306:1: rule__StyleObjects__ValueAssignment_1_0 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8310:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:8311:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:8311:2: ( ruleStyleObject )
            // InternalPdfMk.g:8312:3: ruleStyleObject
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
    // InternalPdfMk.g:8321:1: rule__StyleObjects__ValueAssignment_1_1_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8325:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:8326:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:8326:2: ( ruleStyleObject )
            // InternalPdfMk.g:8327:3: ruleStyleObject
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


    // $ANTLR start "rule__ImageObject__ValueAssignment_0"
    // InternalPdfMk.g:8336:1: rule__ImageObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ImageObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8340:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8341:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8341:2: ( ( '{' ) )
            // InternalPdfMk.g:8342:3: ( '{' )
            {
             before(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:8343:3: ( '{' )
            // InternalPdfMk.g:8344:4: '{'
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


    // $ANTLR start "rule__ImageObject__MembersAssignment_1_0"
    // InternalPdfMk.g:8355:1: rule__ImageObject__MembersAssignment_1_0 : ( ruleImageObjectMembersWrapper ) ;
    public final void rule__ImageObject__MembersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8359:1: ( ( ruleImageObjectMembersWrapper ) )
            // InternalPdfMk.g:8360:2: ( ruleImageObjectMembersWrapper )
            {
            // InternalPdfMk.g:8360:2: ( ruleImageObjectMembersWrapper )
            // InternalPdfMk.g:8361:3: ruleImageObjectMembersWrapper
            {
             before(grammarAccess.getImageObjectAccess().getMembersImageObjectMembersWrapperParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImageObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getMembersImageObjectMembersWrapperParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__MembersAssignment_1_0"


    // $ANTLR start "rule__ImageObject__MembersAssignment_1_1_1"
    // InternalPdfMk.g:8370:1: rule__ImageObject__MembersAssignment_1_1_1 : ( ruleImageObjectMembersWrapper ) ;
    public final void rule__ImageObject__MembersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8374:1: ( ( ruleImageObjectMembersWrapper ) )
            // InternalPdfMk.g:8375:2: ( ruleImageObjectMembersWrapper )
            {
            // InternalPdfMk.g:8375:2: ( ruleImageObjectMembersWrapper )
            // InternalPdfMk.g:8376:3: ruleImageObjectMembersWrapper
            {
             before(grammarAccess.getImageObjectAccess().getMembersImageObjectMembersWrapperParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getImageObjectAccess().getMembersImageObjectMembersWrapperParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageObject__MembersAssignment_1_1_1"


    // $ANTLR start "rule__ColumnObject__ValueAssignment_0"
    // InternalPdfMk.g:8385:1: rule__ColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__ColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8389:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8390:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8390:2: ( ( '[' ) )
            // InternalPdfMk.g:8391:3: ( '[' )
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:8392:3: ( '[' )
            // InternalPdfMk.g:8393:4: '['
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__ColumnObject__MembersAssignment_1_0"
    // InternalPdfMk.g:8404:1: rule__ColumnObject__MembersAssignment_1_0 : ( ruleColumnObjectMembersWrapper ) ;
    public final void rule__ColumnObject__MembersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8408:1: ( ( ruleColumnObjectMembersWrapper ) )
            // InternalPdfMk.g:8409:2: ( ruleColumnObjectMembersWrapper )
            {
            // InternalPdfMk.g:8409:2: ( ruleColumnObjectMembersWrapper )
            // InternalPdfMk.g:8410:3: ruleColumnObjectMembersWrapper
            {
             before(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__MembersAssignment_1_0"


    // $ANTLR start "rule__ColumnObject__MembersAssignment_1_1_1"
    // InternalPdfMk.g:8419:1: rule__ColumnObject__MembersAssignment_1_1_1 : ( ruleColumnObjectMembersWrapper ) ;
    public final void rule__ColumnObject__MembersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8423:1: ( ( ruleColumnObjectMembersWrapper ) )
            // InternalPdfMk.g:8424:2: ( ruleColumnObjectMembersWrapper )
            {
            // InternalPdfMk.g:8424:2: ( ruleColumnObjectMembersWrapper )
            // InternalPdfMk.g:8425:3: ruleColumnObjectMembersWrapper
            {
             before(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnObjectMembersWrapper();

            state._fsp--;

             after(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnObject__MembersAssignment_1_1_1"


    // $ANTLR start "rule__ListElements__ElValuesAssignment_0"
    // InternalPdfMk.g:8434:1: rule__ListElements__ElValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListElements__ElValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8438:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8439:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8439:2: ( RULE_STRING )
            // InternalPdfMk.g:8440:3: RULE_STRING
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
    // InternalPdfMk.g:8449:1: rule__ListObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ListObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8453:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8454:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8454:2: ( ( '{' ) )
            // InternalPdfMk.g:8455:3: ( '{' )
            {
             before(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:8456:3: ( '{' )
            // InternalPdfMk.g:8457:4: '{'
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
    // InternalPdfMk.g:8468:1: rule__ListObject__PropertiesAssignment_1_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8472:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:8473:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:8473:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:8474:3: ruleListObjectPropertiesWrapper
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
    // InternalPdfMk.g:8483:1: rule__ListObject__PropertiesAssignment_1_2_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8487:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:8488:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:8488:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:8489:3: ruleListObjectPropertiesWrapper
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
    // InternalPdfMk.g:8498:1: rule__ListObject__ElementsAssignment_5_0 : ( ruleListElements ) ;
    public final void rule__ListObject__ElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8502:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:8503:2: ( ruleListElements )
            {
            // InternalPdfMk.g:8503:2: ( ruleListElements )
            // InternalPdfMk.g:8504:3: ruleListElements
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
    // InternalPdfMk.g:8513:1: rule__ListObject__ElemtensAssignment_5_1_1 : ( ruleListElements ) ;
    public final void rule__ListObject__ElemtensAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8517:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:8518:2: ( ruleListElements )
            {
            // InternalPdfMk.g:8518:2: ( ruleListElements )
            // InternalPdfMk.g:8519:3: ruleListElements
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
    // InternalPdfMk.g:8528:1: rule__TableObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TableObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8532:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:8533:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:8533:2: ( ( '{' ) )
            // InternalPdfMk.g:8534:3: ( '{' )
            {
             before(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:8535:3: ( '{' )
            // InternalPdfMk.g:8536:4: '{'
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
    // InternalPdfMk.g:8547:1: rule__TableObject__StyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__TableObject__StyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8551:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:8552:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:8552:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:8553:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:8562:1: rule__TableObject__TableAssignment_2 : ( ruleTableDefinition ) ;
    public final void rule__TableObject__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8566:1: ( ( ruleTableDefinition ) )
            // InternalPdfMk.g:8567:2: ( ruleTableDefinition )
            {
            // InternalPdfMk.g:8567:2: ( ruleTableDefinition )
            // InternalPdfMk.g:8568:3: ruleTableDefinition
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
    // InternalPdfMk.g:8577:1: rule__ContentObject__ValueAssignment : ( ( rule__ContentObject__ValueAlternatives_0 ) ) ;
    public final void rule__ContentObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8581:1: ( ( ( rule__ContentObject__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:8582:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:8582:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            // InternalPdfMk.g:8583:3: ( rule__ContentObject__ValueAlternatives_0 )
            {
             before(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:8584:3: ( rule__ContentObject__ValueAlternatives_0 )
            // InternalPdfMk.g:8584:4: rule__ContentObject__ValueAlternatives_0
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
    // InternalPdfMk.g:8592:1: rule__ContentObjects__ValueAssignment_2_0 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8596:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:8597:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:8597:2: ( ruleContentObject )
            // InternalPdfMk.g:8598:3: ruleContentObject
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
    // InternalPdfMk.g:8607:1: rule__ContentObjects__ValueAssignment_2_1_1 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8611:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:8612:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:8612:2: ( ruleContentObject )
            // InternalPdfMk.g:8613:3: ruleContentObject
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
    // InternalPdfMk.g:8622:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8626:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:8627:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:8627:2: ( ( 'styles' ) )
            // InternalPdfMk.g:8628:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:8629:3: ( 'styles' )
            // InternalPdfMk.g:8630:4: 'styles'
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
    // InternalPdfMk.g:8641:1: rule__Styles__ValueAssignment_2 : ( ruleStyleObjects ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8645:1: ( ( ruleStyleObjects ) )
            // InternalPdfMk.g:8646:2: ( ruleStyleObjects )
            {
            // InternalPdfMk.g:8646:2: ( ruleStyleObjects )
            // InternalPdfMk.g:8647:3: ruleStyleObjects
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
    // InternalPdfMk.g:8656:1: rule__Content__KeyAssignment_0 : ( ( 'content' ) ) ;
    public final void rule__Content__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8660:1: ( ( ( 'content' ) ) )
            // InternalPdfMk.g:8661:2: ( ( 'content' ) )
            {
            // InternalPdfMk.g:8661:2: ( ( 'content' ) )
            // InternalPdfMk.g:8662:3: ( 'content' )
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            // InternalPdfMk.g:8663:3: ( 'content' )
            // InternalPdfMk.g:8664:4: 'content'
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
    // InternalPdfMk.g:8675:1: rule__Content__ValueAssignment_2 : ( ruleContentObjects ) ;
    public final void rule__Content__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8679:1: ( ( ruleContentObjects ) )
            // InternalPdfMk.g:8680:2: ( ruleContentObjects )
            {
            // InternalPdfMk.g:8680:2: ( ruleContentObjects )
            // InternalPdfMk.g:8681:3: ruleContentObjects
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
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\15\1\uffff\1\25\1\uffff\1\25\1\uffff\2\4\2\23\1\15\1\30\1\uffff\2\25\2\4\2\23\1\15";
    static final String dfa_3s = "\1\22\1\uffff\1\52\1\uffff\1\25\1\uffff\1\25\1\uffff\2\4\2\24\1\52\1\47\1\uffff\2\25\2\4\2\24\1\52";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\2\1\uffff\1\3\6\uffff\1\2\7\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
            "",
            "\2\3\11\uffff\6\5\1\6\1\uffff\1\5\5\7\1\3\1\4\3\3",
            "",
            "\1\10",
            "",
            "\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\5\1\14",
            "\1\16\1\15",
            "\2\3\11\uffff\7\16\1\uffff\1\16\5\uffff\1\3\1\17\3\3",
            "\6\16\1\20\1\uffff\1\16\5\7\1\uffff\1\16",
            "",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\16\1\25",
            "\1\16\1\15",
            "\2\3\11\uffff\7\16\1\uffff\1\16\5\uffff\1\3\1\17\3\3"
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
            return "1248:1: rule__TableCellItemElements__ElementsAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );";
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\1\3\17\uffff";
    static final String dfa_9s = "\1\5\1\uffff\1\5\1\uffff\2\30\1\uffff\1\25\1\uffff\1\25\2\5\2\23\2\30";
    static final String dfa_10s = "\1\24\1\uffff\1\22\1\uffff\2\47\1\uffff\1\25\1\uffff\1\25\2\5\2\24\2\47";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\7\uffff";
    static final String dfa_12s = "\20\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\14\uffff\1\4\1\uffff\1\2",
            "",
            "\1\3\14\uffff\1\5",
            "",
            "\1\6\1\7\5\6\1\10\1\6\6\uffff\1\6",
            "\1\6\1\11\5\6\1\10\1\6\6\uffff\1\6",
            "",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\6\1\16",
            "\1\6\1\17",
            "\7\6\1\10\1\6\6\uffff\1\6",
            "\7\6\1\10\1\6\6\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1428:1: rule__InnerColumnObjectMembersWrapper__Alternatives : ( ( ( rule__InnerColumnObjectMembersWrapper__Group_0__0 ) ) | ( ( rule__InnerColumnObjectMembersWrapper__Group_1__0 ) ) | ( ( rule__InnerColumnObjectMembersWrapper__Group_2__0 ) ) );";
        }
    }
    static final String dfa_14s = "\34\uffff";
    static final String dfa_15s = "\1\5\1\uffff\1\15\1\uffff\2\25\2\uffff\1\25\2\uffff\1\4\1\5\1\4\3\23\1\30\1\uffff\1\30\1\15\2\25\2\4\2\23\1\15";
    static final String dfa_16s = "\1\22\1\uffff\1\54\1\uffff\2\25\2\uffff\1\25\2\uffff\1\4\1\5\1\4\3\24\1\47\1\uffff\1\54\1\52\2\25\2\4\2\24\1\52";
    static final String dfa_17s = "\1\uffff\1\1\1\uffff\1\4\2\uffff\1\6\1\2\1\uffff\1\3\1\5\7\uffff\1\2\11\uffff";
    static final String dfa_18s = "\34\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\14\uffff\1\2",
            "",
            "\2\12\11\uffff\1\7\1\5\4\7\1\4\1\11\1\7\5\3\1\12\1\10\3\12\1\uffff\1\6",
            "",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\22\1\21",
            "\1\22\1\23",
            "\1\22\1\24",
            "\6\22\1\25\1\uffff\1\22\5\3\1\uffff\1\22",
            "",
            "\7\22\1\11\1\22\6\uffff\1\22\4\uffff\1\6",
            "\2\12\11\uffff\7\22\1\uffff\1\22\5\uffff\1\12\1\26\3\12",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\22\1\21",
            "\1\22\1\33",
            "\2\12\11\uffff\7\22\1\uffff\1\22\5\uffff\1\12\1\26\3\12"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1563:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );";
        }
    }
    static final String dfa_20s = "\110\uffff";
    static final String dfa_21s = "\1\1\107\uffff";
    static final String dfa_22s = "\1\24\1\uffff\1\5\1\30\11\25\2\5\1\4\1\5\2\13\1\4\1\26\1\4\11\23\1\4\1\23\1\30\1\uffff\1\24\1\4\1\23\11\25\1\24\2\5\1\4\1\5\2\13\1\4\1\26\1\4\11\23\1\4\1\23\1\24\1\4\1\23\1\24";
    static final String dfa_23s = "\1\27\1\uffff\1\27\1\47\11\25\2\5\1\4\1\5\2\14\1\4\1\26\1\4\11\24\1\27\1\24\1\47\1\uffff\1\27\1\4\1\24\11\25\1\27\2\5\1\4\1\5\2\14\1\4\1\26\1\4\11\24\1\27\1\24\1\27\1\4\1\24\1\27";
    static final String dfa_24s = "\1\uffff\1\2\40\uffff\1\1\45\uffff";
    static final String dfa_25s = "\110\uffff}>";
    static final String[] dfa_26s = {
            "\1\2\2\uffff\1\1",
            "",
            "\1\1\14\uffff\1\3\1\uffff\1\1\2\uffff\1\1",
            "\1\10\1\5\1\4\1\7\1\11\1\6\1\12\1\uffff\1\13\6\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\43\17\uffff\1\44\2\uffff\1\45",
            "\1\42\1\41",
            "\1\52\1\47\1\46\1\51\1\53\1\50\1\54\1\uffff\1\55\6\uffff\1\56",
            "",
            "\1\44\2\uffff\1\45",
            "\1\57",
            "\1\42\1\41",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\44\2\uffff\1\45",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\104\17\uffff\1\105\2\uffff\1\106",
            "\1\42\1\41",
            "\1\105\2\uffff\1\106",
            "\1\107",
            "\1\42\1\41",
            "\1\105\2\uffff\1\106"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 5001:2: ( rule__ColumnObjectMembersWrapper__Group_1_1__0 )*";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000817F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000139000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003E40000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000007C17F006000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000007C17F000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007C17F000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000840020L});

}