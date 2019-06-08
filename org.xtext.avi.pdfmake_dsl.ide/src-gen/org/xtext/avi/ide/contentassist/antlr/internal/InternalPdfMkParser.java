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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ul'", "'ol'", "'var'", "'dd'", "'='", "'{'", "'}'", "','", "':'", "'text:'", "'['", "']'", "'alignment'", "'bold'", "'style'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'body'", "'table'", "'styles'", "'content'"
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


    // $ANTLR start "rule__TextDefinition__Alternatives"
    // InternalPdfMk.g:1148:1: rule__TextDefinition__Alternatives : ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) );
    public final void rule__TextDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1152:1: ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) )
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
                    // InternalPdfMk.g:1153:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    {
                    // InternalPdfMk.g:1153:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    // InternalPdfMk.g:1154:3: ( rule__TextDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_0()); 
                    // InternalPdfMk.g:1155:3: ( rule__TextDefinition__Group_0__0 )
                    // InternalPdfMk.g:1155:4: rule__TextDefinition__Group_0__0
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
                    // InternalPdfMk.g:1159:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    {
                    // InternalPdfMk.g:1159:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    // InternalPdfMk.g:1160:3: ( rule__TextDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_1()); 
                    // InternalPdfMk.g:1161:3: ( rule__TextDefinition__Group_1__0 )
                    // InternalPdfMk.g:1161:4: rule__TextDefinition__Group_1__0
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


    // $ANTLR start "rule__TableCellItemElements__ElementsAlternatives_0"
    // InternalPdfMk.g:1169:1: rule__TableCellItemElements__ElementsAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) );
    public final void rule__TableCellItemElements__ElementsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1173:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleImageObject ) | ( ruleListObject ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 23:
                    {
                    alt3=2;
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
                    alt3=4;
                    }
                    break;
                case 19:
                case 20:
                case 33:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

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
                    // InternalPdfMk.g:1174:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1174:2: ( ruleStringObject )
                    // InternalPdfMk.g:1175:3: ruleStringObject
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
                    // InternalPdfMk.g:1180:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1180:2: ( ruleTextObject )
                    // InternalPdfMk.g:1181:3: ruleTextObject
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
                    // InternalPdfMk.g:1186:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1186:2: ( ruleImageObject )
                    // InternalPdfMk.g:1187:3: ruleImageObject
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
                    // InternalPdfMk.g:1192:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1192:2: ( ruleListObject )
                    // InternalPdfMk.g:1193:3: ruleListObject
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
    // InternalPdfMk.g:1202:1: rule__ListObjectPropertiesWrapper__ValueAlternatives_0 : ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) );
    public final void rule__ListObjectPropertiesWrapper__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1206:1: ( ( ruleListReversedDefinition ) | ( ruleListCounterDefinition ) | ( ruleListTypeDefinition ) | ( ruleListColorDefinition ) | ( ruleListMarkerColorDefinition ) )
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
                    // InternalPdfMk.g:1207:2: ( ruleListReversedDefinition )
                    {
                    // InternalPdfMk.g:1207:2: ( ruleListReversedDefinition )
                    // InternalPdfMk.g:1208:3: ruleListReversedDefinition
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
                    // InternalPdfMk.g:1213:2: ( ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:1213:2: ( ruleListCounterDefinition )
                    // InternalPdfMk.g:1214:3: ruleListCounterDefinition
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
                    // InternalPdfMk.g:1219:2: ( ruleListTypeDefinition )
                    {
                    // InternalPdfMk.g:1219:2: ( ruleListTypeDefinition )
                    // InternalPdfMk.g:1220:3: ruleListTypeDefinition
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
                    // InternalPdfMk.g:1225:2: ( ruleListColorDefinition )
                    {
                    // InternalPdfMk.g:1225:2: ( ruleListColorDefinition )
                    // InternalPdfMk.g:1226:3: ruleListColorDefinition
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
                    // InternalPdfMk.g:1231:2: ( ruleListMarkerColorDefinition )
                    {
                    // InternalPdfMk.g:1231:2: ( ruleListMarkerColorDefinition )
                    // InternalPdfMk.g:1232:3: ruleListMarkerColorDefinition
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
    // InternalPdfMk.g:1241:1: rule__ListElements__Alternatives : ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) );
    public final void rule__ListElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1245:1: ( ( ( rule__ListElements__ElValuesAssignment_0 ) ) | ( ruleTextObject ) | ( ruleColumnDefinition ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==27||LA5_2==31) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=22 && LA5_2<=23)) ) {
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
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:1246:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    {
                    // InternalPdfMk.g:1246:2: ( ( rule__ListElements__ElValuesAssignment_0 ) )
                    // InternalPdfMk.g:1247:3: ( rule__ListElements__ElValuesAssignment_0 )
                    {
                     before(grammarAccess.getListElementsAccess().getElValuesAssignment_0()); 
                    // InternalPdfMk.g:1248:3: ( rule__ListElements__ElValuesAssignment_0 )
                    // InternalPdfMk.g:1248:4: rule__ListElements__ElValuesAssignment_0
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
                    // InternalPdfMk.g:1252:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1252:2: ( ruleTextObject )
                    // InternalPdfMk.g:1253:3: ruleTextObject
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
                    // InternalPdfMk.g:1258:2: ( ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1258:2: ( ruleColumnDefinition )
                    // InternalPdfMk.g:1259:3: ruleColumnDefinition
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
    // InternalPdfMk.g:1268:1: rule__ListObject__Alternatives_2 : ( ( 'ul' ) | ( 'ol' ) );
    public final void rule__ListObject__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1272:1: ( ( 'ul' ) | ( 'ol' ) )
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
                    // InternalPdfMk.g:1273:2: ( 'ul' )
                    {
                    // InternalPdfMk.g:1273:2: ( 'ul' )
                    // InternalPdfMk.g:1274:3: 'ul'
                    {
                     before(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListObjectAccess().getUlKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1279:2: ( 'ol' )
                    {
                    // InternalPdfMk.g:1279:2: ( 'ol' )
                    // InternalPdfMk.g:1280:3: 'ol'
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
    // InternalPdfMk.g:1289:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );
    public final void rule__ContentObject__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1293:1: ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1294:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:1294:2: ( ruleStringObject )
                    // InternalPdfMk.g:1295:3: ruleStringObject
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
                    // InternalPdfMk.g:1300:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:1300:2: ( ruleTextObject )
                    // InternalPdfMk.g:1301:3: ruleTextObject
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
                    // InternalPdfMk.g:1306:2: ( ruleColumnTextObject )
                    {
                    // InternalPdfMk.g:1306:2: ( ruleColumnTextObject )
                    // InternalPdfMk.g:1307:3: ruleColumnTextObject
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
                    // InternalPdfMk.g:1312:2: ( ruleImageObject )
                    {
                    // InternalPdfMk.g:1312:2: ( ruleImageObject )
                    // InternalPdfMk.g:1313:3: ruleImageObject
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
                    // InternalPdfMk.g:1318:2: ( ruleListObject )
                    {
                    // InternalPdfMk.g:1318:2: ( ruleListObject )
                    // InternalPdfMk.g:1319:3: ruleListObject
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
                    // InternalPdfMk.g:1324:2: ( ruleTableObject )
                    {
                    // InternalPdfMk.g:1324:2: ( ruleTableObject )
                    // InternalPdfMk.g:1325:3: ruleTableObject
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
    // InternalPdfMk.g:1334:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1338:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:1339:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
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
    // InternalPdfMk.g:1346:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1350:1: ( ( 'var' ) )
            // InternalPdfMk.g:1351:1: ( 'var' )
            {
            // InternalPdfMk.g:1351:1: ( 'var' )
            // InternalPdfMk.g:1352:2: 'var'
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
    // InternalPdfMk.g:1361:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1365:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:1366:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
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
    // InternalPdfMk.g:1373:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1377:1: ( ( 'dd' ) )
            // InternalPdfMk.g:1378:1: ( 'dd' )
            {
            // InternalPdfMk.g:1378:1: ( 'dd' )
            // InternalPdfMk.g:1379:2: 'dd'
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
    // InternalPdfMk.g:1388:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1392:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:1393:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
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
    // InternalPdfMk.g:1400:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1404:1: ( ( '=' ) )
            // InternalPdfMk.g:1405:1: ( '=' )
            {
            // InternalPdfMk.g:1405:1: ( '=' )
            // InternalPdfMk.g:1406:2: '='
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
    // InternalPdfMk.g:1415:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1419:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:1420:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
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
    // InternalPdfMk.g:1427:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1431:1: ( ( '{' ) )
            // InternalPdfMk.g:1432:1: ( '{' )
            {
            // InternalPdfMk.g:1432:1: ( '{' )
            // InternalPdfMk.g:1433:2: '{'
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
    // InternalPdfMk.g:1442:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1446:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:1447:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
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
    // InternalPdfMk.g:1454:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1458:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:1459:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:1459:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:1460:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:1461:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:1461:3: rule__DocDefinition__ContentAssignment_4
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
    // InternalPdfMk.g:1469:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1473:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:1474:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
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
    // InternalPdfMk.g:1481:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1485:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:1486:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:1486:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:1487:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:1488:2: ( rule__DocDefinition__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:1488:3: rule__DocDefinition__Group_5__0
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
    // InternalPdfMk.g:1496:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1500:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:1501:2: rule__DocDefinition__Group__6__Impl
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
    // InternalPdfMk.g:1507:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1511:1: ( ( '}' ) )
            // InternalPdfMk.g:1512:1: ( '}' )
            {
            // InternalPdfMk.g:1512:1: ( '}' )
            // InternalPdfMk.g:1513:2: '}'
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
    // InternalPdfMk.g:1523:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1527:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:1528:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
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
    // InternalPdfMk.g:1535:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1539:1: ( ( ',' ) )
            // InternalPdfMk.g:1540:1: ( ',' )
            {
            // InternalPdfMk.g:1540:1: ( ',' )
            // InternalPdfMk.g:1541:2: ','
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
    // InternalPdfMk.g:1550:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1554:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:1555:2: rule__DocDefinition__Group_5__1__Impl
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
    // InternalPdfMk.g:1561:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1565:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:1566:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:1566:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:1567:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:1568:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:1568:3: rule__DocDefinition__StylesAssignment_5_1
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
    // InternalPdfMk.g:1577:1: rule__TypeFaceDefinition__Group__0 : rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 ;
    public final void rule__TypeFaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1581:1: ( rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 )
            // InternalPdfMk.g:1582:2: rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1
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
    // InternalPdfMk.g:1589:1: rule__TypeFaceDefinition__Group__0__Impl : ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TypeFaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1593:1: ( ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1594:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1594:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1595:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1596:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1596:3: rule__TypeFaceDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1604:1: rule__TypeFaceDefinition__Group__1 : rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 ;
    public final void rule__TypeFaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1608:1: ( rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 )
            // InternalPdfMk.g:1609:2: rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2
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
    // InternalPdfMk.g:1616:1: rule__TypeFaceDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeFaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1620:1: ( ( ':' ) )
            // InternalPdfMk.g:1621:1: ( ':' )
            {
            // InternalPdfMk.g:1621:1: ( ':' )
            // InternalPdfMk.g:1622:2: ':'
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
    // InternalPdfMk.g:1631:1: rule__TypeFaceDefinition__Group__2 : rule__TypeFaceDefinition__Group__2__Impl ;
    public final void rule__TypeFaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1635:1: ( rule__TypeFaceDefinition__Group__2__Impl )
            // InternalPdfMk.g:1636:2: rule__TypeFaceDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1642:1: rule__TypeFaceDefinition__Group__2__Impl : ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TypeFaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1646:1: ( ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1647:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1647:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1648:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1649:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1649:3: rule__TypeFaceDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1658:1: rule__TextStyleDefinition__Group__0 : rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 ;
    public final void rule__TextStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1662:1: ( rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 )
            // InternalPdfMk.g:1663:2: rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1
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
    // InternalPdfMk.g:1670:1: rule__TextStyleDefinition__Group__0__Impl : ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1674:1: ( ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1675:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1675:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1676:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1677:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1677:3: rule__TextStyleDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1685:1: rule__TextStyleDefinition__Group__1 : rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 ;
    public final void rule__TextStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1689:1: ( rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 )
            // InternalPdfMk.g:1690:2: rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2
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
    // InternalPdfMk.g:1697:1: rule__TextStyleDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1701:1: ( ( ':' ) )
            // InternalPdfMk.g:1702:1: ( ':' )
            {
            // InternalPdfMk.g:1702:1: ( ':' )
            // InternalPdfMk.g:1703:2: ':'
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
    // InternalPdfMk.g:1712:1: rule__TextStyleDefinition__Group__2 : rule__TextStyleDefinition__Group__2__Impl ;
    public final void rule__TextStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1716:1: ( rule__TextStyleDefinition__Group__2__Impl )
            // InternalPdfMk.g:1717:2: rule__TextStyleDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1723:1: rule__TextStyleDefinition__Group__2__Impl : ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1727:1: ( ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1728:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1728:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1729:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1730:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1730:3: rule__TextStyleDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1739:1: rule__TextDefinition__Group_0__0 : rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 ;
    public final void rule__TextDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1743:1: ( rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 )
            // InternalPdfMk.g:1744:2: rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1
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
    // InternalPdfMk.g:1751:1: rule__TextDefinition__Group_0__0__Impl : ( 'text:' ) ;
    public final void rule__TextDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1755:1: ( ( 'text:' ) )
            // InternalPdfMk.g:1756:1: ( 'text:' )
            {
            // InternalPdfMk.g:1756:1: ( 'text:' )
            // InternalPdfMk.g:1757:2: 'text:'
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
    // InternalPdfMk.g:1766:1: rule__TextDefinition__Group_0__1 : rule__TextDefinition__Group_0__1__Impl ;
    public final void rule__TextDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1770:1: ( rule__TextDefinition__Group_0__1__Impl )
            // InternalPdfMk.g:1771:2: rule__TextDefinition__Group_0__1__Impl
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
    // InternalPdfMk.g:1777:1: rule__TextDefinition__Group_0__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1781:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1782:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1782:1: ( RULE_STRING )
            // InternalPdfMk.g:1783:2: RULE_STRING
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
    // InternalPdfMk.g:1793:1: rule__TextDefinition__Group_1__0 : rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 ;
    public final void rule__TextDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1797:1: ( rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 )
            // InternalPdfMk.g:1798:2: rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1
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
    // InternalPdfMk.g:1805:1: rule__TextDefinition__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TextDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1809:1: ( ( '[' ) )
            // InternalPdfMk.g:1810:1: ( '[' )
            {
            // InternalPdfMk.g:1810:1: ( '[' )
            // InternalPdfMk.g:1811:2: '['
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
    // InternalPdfMk.g:1820:1: rule__TextDefinition__Group_1__1 : rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 ;
    public final void rule__TextDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1824:1: ( rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 )
            // InternalPdfMk.g:1825:2: rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2
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
    // InternalPdfMk.g:1832:1: rule__TextDefinition__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1836:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1837:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1837:1: ( RULE_STRING )
            // InternalPdfMk.g:1838:2: RULE_STRING
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
    // InternalPdfMk.g:1847:1: rule__TextDefinition__Group_1__2 : rule__TextDefinition__Group_1__2__Impl ;
    public final void rule__TextDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1851:1: ( rule__TextDefinition__Group_1__2__Impl )
            // InternalPdfMk.g:1852:2: rule__TextDefinition__Group_1__2__Impl
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
    // InternalPdfMk.g:1858:1: rule__TextDefinition__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TextDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1862:1: ( ( ']' ) )
            // InternalPdfMk.g:1863:1: ( ']' )
            {
            // InternalPdfMk.g:1863:1: ( ']' )
            // InternalPdfMk.g:1864:2: ']'
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
    // InternalPdfMk.g:1874:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1878:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:1879:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
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
    // InternalPdfMk.g:1886:1: rule__TextAlignmentDefinition__Group__0__Impl : ( 'alignment' ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1890:1: ( ( 'alignment' ) )
            // InternalPdfMk.g:1891:1: ( 'alignment' )
            {
            // InternalPdfMk.g:1891:1: ( 'alignment' )
            // InternalPdfMk.g:1892:2: 'alignment'
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
    // InternalPdfMk.g:1901:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1905:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:1906:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
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
    // InternalPdfMk.g:1913:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1917:1: ( ( ':' ) )
            // InternalPdfMk.g:1918:1: ( ':' )
            {
            // InternalPdfMk.g:1918:1: ( ':' )
            // InternalPdfMk.g:1919:2: ':'
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
    // InternalPdfMk.g:1928:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1932:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:1933:2: rule__TextAlignmentDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1939:1: rule__TextAlignmentDefinition__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1943:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1944:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1944:1: ( RULE_STRING )
            // InternalPdfMk.g:1945:2: RULE_STRING
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
    // InternalPdfMk.g:1955:1: rule__ItalicsDefinition__Group__0 : rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 ;
    public final void rule__ItalicsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1959:1: ( rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 )
            // InternalPdfMk.g:1960:2: rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1
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
    // InternalPdfMk.g:1967:1: rule__ItalicsDefinition__Group__0__Impl : ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ItalicsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1971:1: ( ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1972:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1972:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1973:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1974:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1974:3: rule__ItalicsDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1982:1: rule__ItalicsDefinition__Group__1 : rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 ;
    public final void rule__ItalicsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1986:1: ( rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 )
            // InternalPdfMk.g:1987:2: rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2
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
    // InternalPdfMk.g:1994:1: rule__ItalicsDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ItalicsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1998:1: ( ( ':' ) )
            // InternalPdfMk.g:1999:1: ( ':' )
            {
            // InternalPdfMk.g:1999:1: ( ':' )
            // InternalPdfMk.g:2000:2: ':'
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
    // InternalPdfMk.g:2009:1: rule__ItalicsDefinition__Group__2 : rule__ItalicsDefinition__Group__2__Impl ;
    public final void rule__ItalicsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2013:1: ( rule__ItalicsDefinition__Group__2__Impl )
            // InternalPdfMk.g:2014:2: rule__ItalicsDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2020:1: rule__ItalicsDefinition__Group__2__Impl : ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ItalicsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2024:1: ( ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2025:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2025:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2026:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2027:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2027:3: rule__ItalicsDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2036:1: rule__FontSizeDefinition__Group__0 : rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 ;
    public final void rule__FontSizeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2040:1: ( rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 )
            // InternalPdfMk.g:2041:2: rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1
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
    // InternalPdfMk.g:2048:1: rule__FontSizeDefinition__Group__0__Impl : ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__FontSizeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2052:1: ( ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2053:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2053:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2054:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2055:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2055:3: rule__FontSizeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2063:1: rule__FontSizeDefinition__Group__1 : rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 ;
    public final void rule__FontSizeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2067:1: ( rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 )
            // InternalPdfMk.g:2068:2: rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2
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
    // InternalPdfMk.g:2075:1: rule__FontSizeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FontSizeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2079:1: ( ( ':' ) )
            // InternalPdfMk.g:2080:1: ( ':' )
            {
            // InternalPdfMk.g:2080:1: ( ':' )
            // InternalPdfMk.g:2081:2: ':'
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
    // InternalPdfMk.g:2090:1: rule__FontSizeDefinition__Group__2 : rule__FontSizeDefinition__Group__2__Impl ;
    public final void rule__FontSizeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2094:1: ( rule__FontSizeDefinition__Group__2__Impl )
            // InternalPdfMk.g:2095:2: rule__FontSizeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2101:1: rule__FontSizeDefinition__Group__2__Impl : ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__FontSizeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2105:1: ( ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2106:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2106:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2107:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2108:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2108:3: rule__FontSizeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2117:1: rule__WidthDefinition__Group__0 : rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 ;
    public final void rule__WidthDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2121:1: ( rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1 )
            // InternalPdfMk.g:2122:2: rule__WidthDefinition__Group__0__Impl rule__WidthDefinition__Group__1
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
    // InternalPdfMk.g:2129:1: rule__WidthDefinition__Group__0__Impl : ( ( rule__WidthDefinition__KeyAssignment_0 ) ) ;
    public final void rule__WidthDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2133:1: ( ( ( rule__WidthDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2134:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2134:1: ( ( rule__WidthDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2135:2: ( rule__WidthDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2136:2: ( rule__WidthDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2136:3: rule__WidthDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2144:1: rule__WidthDefinition__Group__1 : rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 ;
    public final void rule__WidthDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2148:1: ( rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2 )
            // InternalPdfMk.g:2149:2: rule__WidthDefinition__Group__1__Impl rule__WidthDefinition__Group__2
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
    // InternalPdfMk.g:2156:1: rule__WidthDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WidthDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2160:1: ( ( ':' ) )
            // InternalPdfMk.g:2161:1: ( ':' )
            {
            // InternalPdfMk.g:2161:1: ( ':' )
            // InternalPdfMk.g:2162:2: ':'
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
    // InternalPdfMk.g:2171:1: rule__WidthDefinition__Group__2 : rule__WidthDefinition__Group__2__Impl ;
    public final void rule__WidthDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2175:1: ( rule__WidthDefinition__Group__2__Impl )
            // InternalPdfMk.g:2176:2: rule__WidthDefinition__Group__2__Impl
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
    // InternalPdfMk.g:2182:1: rule__WidthDefinition__Group__2__Impl : ( ( rule__WidthDefinition__ValueAssignment_2 ) ) ;
    public final void rule__WidthDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2186:1: ( ( ( rule__WidthDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2187:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2187:1: ( ( rule__WidthDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:2188:2: ( rule__WidthDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getWidthDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2189:2: ( rule__WidthDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:2189:3: rule__WidthDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:2198:1: rule__ColumnDefinition__Group__0 : rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 ;
    public final void rule__ColumnDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2202:1: ( rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1 )
            // InternalPdfMk.g:2203:2: rule__ColumnDefinition__Group__0__Impl rule__ColumnDefinition__Group__1
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
    // InternalPdfMk.g:2210:1: rule__ColumnDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__ColumnDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2214:1: ( ( '{' ) )
            // InternalPdfMk.g:2215:1: ( '{' )
            {
            // InternalPdfMk.g:2215:1: ( '{' )
            // InternalPdfMk.g:2216:2: '{'
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
    // InternalPdfMk.g:2225:1: rule__ColumnDefinition__Group__1 : rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 ;
    public final void rule__ColumnDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2229:1: ( rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2 )
            // InternalPdfMk.g:2230:2: rule__ColumnDefinition__Group__1__Impl rule__ColumnDefinition__Group__2
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
    // InternalPdfMk.g:2237:1: rule__ColumnDefinition__Group__1__Impl : ( ( rule__ColumnDefinition__Group_1__0 )? ) ;
    public final void rule__ColumnDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2241:1: ( ( ( rule__ColumnDefinition__Group_1__0 )? ) )
            // InternalPdfMk.g:2242:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            {
            // InternalPdfMk.g:2242:1: ( ( rule__ColumnDefinition__Group_1__0 )? )
            // InternalPdfMk.g:2243:2: ( rule__ColumnDefinition__Group_1__0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_1()); 
            // InternalPdfMk.g:2244:2: ( rule__ColumnDefinition__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:2244:3: rule__ColumnDefinition__Group_1__0
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
    // InternalPdfMk.g:2252:1: rule__ColumnDefinition__Group__2 : rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 ;
    public final void rule__ColumnDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2256:1: ( rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3 )
            // InternalPdfMk.g:2257:2: rule__ColumnDefinition__Group__2__Impl rule__ColumnDefinition__Group__3
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
    // InternalPdfMk.g:2264:1: rule__ColumnDefinition__Group__2__Impl : ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) ;
    public final void rule__ColumnDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2268:1: ( ( ( rule__ColumnDefinition__KeyAssignment_2 ) ) )
            // InternalPdfMk.g:2269:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            {
            // InternalPdfMk.g:2269:1: ( ( rule__ColumnDefinition__KeyAssignment_2 ) )
            // InternalPdfMk.g:2270:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyAssignment_2()); 
            // InternalPdfMk.g:2271:2: ( rule__ColumnDefinition__KeyAssignment_2 )
            // InternalPdfMk.g:2271:3: rule__ColumnDefinition__KeyAssignment_2
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
    // InternalPdfMk.g:2279:1: rule__ColumnDefinition__Group__3 : rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 ;
    public final void rule__ColumnDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2283:1: ( rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4 )
            // InternalPdfMk.g:2284:2: rule__ColumnDefinition__Group__3__Impl rule__ColumnDefinition__Group__4
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
    // InternalPdfMk.g:2291:1: rule__ColumnDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2295:1: ( ( ':' ) )
            // InternalPdfMk.g:2296:1: ( ':' )
            {
            // InternalPdfMk.g:2296:1: ( ':' )
            // InternalPdfMk.g:2297:2: ':'
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
    // InternalPdfMk.g:2306:1: rule__ColumnDefinition__Group__4 : rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 ;
    public final void rule__ColumnDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2310:1: ( rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5 )
            // InternalPdfMk.g:2311:2: rule__ColumnDefinition__Group__4__Impl rule__ColumnDefinition__Group__5
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
    // InternalPdfMk.g:2318:1: rule__ColumnDefinition__Group__4__Impl : ( ( rule__ColumnDefinition__Group_4__0 ) ) ;
    public final void rule__ColumnDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2322:1: ( ( ( rule__ColumnDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:2323:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:2323:1: ( ( rule__ColumnDefinition__Group_4__0 ) )
            // InternalPdfMk.g:2324:2: ( rule__ColumnDefinition__Group_4__0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2325:2: ( rule__ColumnDefinition__Group_4__0 )
            // InternalPdfMk.g:2325:3: rule__ColumnDefinition__Group_4__0
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
    // InternalPdfMk.g:2333:1: rule__ColumnDefinition__Group__5 : rule__ColumnDefinition__Group__5__Impl ;
    public final void rule__ColumnDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2337:1: ( rule__ColumnDefinition__Group__5__Impl )
            // InternalPdfMk.g:2338:2: rule__ColumnDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2344:1: rule__ColumnDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ColumnDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2348:1: ( ( '}' ) )
            // InternalPdfMk.g:2349:1: ( '}' )
            {
            // InternalPdfMk.g:2349:1: ( '}' )
            // InternalPdfMk.g:2350:2: '}'
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
    // InternalPdfMk.g:2360:1: rule__ColumnDefinition__Group_1__0 : rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 ;
    public final void rule__ColumnDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2364:1: ( rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1 )
            // InternalPdfMk.g:2365:2: rule__ColumnDefinition__Group_1__0__Impl rule__ColumnDefinition__Group_1__1
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
    // InternalPdfMk.g:2372:1: rule__ColumnDefinition__Group_1__0__Impl : ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) ;
    public final void rule__ColumnDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2376:1: ( ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:2377:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:2377:1: ( ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 ) )
            // InternalPdfMk.g:2378:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getGlobalStyleAssignment_1_0()); 
            // InternalPdfMk.g:2379:2: ( rule__ColumnDefinition__GlobalStyleAssignment_1_0 )
            // InternalPdfMk.g:2379:3: rule__ColumnDefinition__GlobalStyleAssignment_1_0
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
    // InternalPdfMk.g:2387:1: rule__ColumnDefinition__Group_1__1 : rule__ColumnDefinition__Group_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2391:1: ( rule__ColumnDefinition__Group_1__1__Impl )
            // InternalPdfMk.g:2392:2: rule__ColumnDefinition__Group_1__1__Impl
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
    // InternalPdfMk.g:2398:1: rule__ColumnDefinition__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2402:1: ( ( ',' ) )
            // InternalPdfMk.g:2403:1: ( ',' )
            {
            // InternalPdfMk.g:2403:1: ( ',' )
            // InternalPdfMk.g:2404:2: ','
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
    // InternalPdfMk.g:2414:1: rule__ColumnDefinition__Group_4__0 : rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 ;
    public final void rule__ColumnDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2418:1: ( rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1 )
            // InternalPdfMk.g:2419:2: rule__ColumnDefinition__Group_4__0__Impl rule__ColumnDefinition__Group_4__1
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
    // InternalPdfMk.g:2426:1: rule__ColumnDefinition__Group_4__0__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) ;
    public final void rule__ColumnDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2430:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? ) )
            // InternalPdfMk.g:2431:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            {
            // InternalPdfMk.g:2431:1: ( ( rule__ColumnDefinition__ValueAssignment_4_0 )? )
            // InternalPdfMk.g:2432:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_0()); 
            // InternalPdfMk.g:2433:2: ( rule__ColumnDefinition__ValueAssignment_4_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:2433:3: rule__ColumnDefinition__ValueAssignment_4_0
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
    // InternalPdfMk.g:2441:1: rule__ColumnDefinition__Group_4__1 : rule__ColumnDefinition__Group_4__1__Impl ;
    public final void rule__ColumnDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2445:1: ( rule__ColumnDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2446:2: rule__ColumnDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2452:1: rule__ColumnDefinition__Group_4__1__Impl : ( ( rule__ColumnDefinition__Group_4_1__0 )* ) ;
    public final void rule__ColumnDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2456:1: ( ( ( rule__ColumnDefinition__Group_4_1__0 )* ) )
            // InternalPdfMk.g:2457:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:2457:1: ( ( rule__ColumnDefinition__Group_4_1__0 )* )
            // InternalPdfMk.g:2458:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnDefinitionAccess().getGroup_4_1()); 
            // InternalPdfMk.g:2459:2: ( rule__ColumnDefinition__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPdfMk.g:2459:3: rule__ColumnDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:2468:1: rule__ColumnDefinition__Group_4_1__0 : rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 ;
    public final void rule__ColumnDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2472:1: ( rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1 )
            // InternalPdfMk.g:2473:2: rule__ColumnDefinition__Group_4_1__0__Impl rule__ColumnDefinition__Group_4_1__1
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
    // InternalPdfMk.g:2480:1: rule__ColumnDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2484:1: ( ( ',' ) )
            // InternalPdfMk.g:2485:1: ( ',' )
            {
            // InternalPdfMk.g:2485:1: ( ',' )
            // InternalPdfMk.g:2486:2: ','
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
    // InternalPdfMk.g:2495:1: rule__ColumnDefinition__Group_4_1__1 : rule__ColumnDefinition__Group_4_1__1__Impl ;
    public final void rule__ColumnDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2499:1: ( rule__ColumnDefinition__Group_4_1__1__Impl )
            // InternalPdfMk.g:2500:2: rule__ColumnDefinition__Group_4_1__1__Impl
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
    // InternalPdfMk.g:2506:1: rule__ColumnDefinition__Group_4_1__1__Impl : ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) ;
    public final void rule__ColumnDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2510:1: ( ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:2511:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:2511:1: ( ( rule__ColumnDefinition__ValueAssignment_4_1_1 ) )
            // InternalPdfMk.g:2512:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnDefinitionAccess().getValueAssignment_4_1_1()); 
            // InternalPdfMk.g:2513:2: ( rule__ColumnDefinition__ValueAssignment_4_1_1 )
            // InternalPdfMk.g:2513:3: rule__ColumnDefinition__ValueAssignment_4_1_1
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
    // InternalPdfMk.g:2522:1: rule__MarginDefinition__Group__0 : rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 ;
    public final void rule__MarginDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2526:1: ( rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1 )
            // InternalPdfMk.g:2527:2: rule__MarginDefinition__Group__0__Impl rule__MarginDefinition__Group__1
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
    // InternalPdfMk.g:2534:1: rule__MarginDefinition__Group__0__Impl : ( ( rule__MarginDefinition__KeyAssignment_0 ) ) ;
    public final void rule__MarginDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2538:1: ( ( ( rule__MarginDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2539:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2539:1: ( ( rule__MarginDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2540:2: ( rule__MarginDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2541:2: ( rule__MarginDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:2541:3: rule__MarginDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:2549:1: rule__MarginDefinition__Group__1 : rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 ;
    public final void rule__MarginDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2553:1: ( rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2 )
            // InternalPdfMk.g:2554:2: rule__MarginDefinition__Group__1__Impl rule__MarginDefinition__Group__2
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
    // InternalPdfMk.g:2561:1: rule__MarginDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MarginDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2565:1: ( ( ':' ) )
            // InternalPdfMk.g:2566:1: ( ':' )
            {
            // InternalPdfMk.g:2566:1: ( ':' )
            // InternalPdfMk.g:2567:2: ':'
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
    // InternalPdfMk.g:2576:1: rule__MarginDefinition__Group__2 : rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 ;
    public final void rule__MarginDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2580:1: ( rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3 )
            // InternalPdfMk.g:2581:2: rule__MarginDefinition__Group__2__Impl rule__MarginDefinition__Group__3
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
    // InternalPdfMk.g:2588:1: rule__MarginDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__MarginDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2592:1: ( ( '[' ) )
            // InternalPdfMk.g:2593:1: ( '[' )
            {
            // InternalPdfMk.g:2593:1: ( '[' )
            // InternalPdfMk.g:2594:2: '['
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
    // InternalPdfMk.g:2603:1: rule__MarginDefinition__Group__3 : rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 ;
    public final void rule__MarginDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2607:1: ( rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4 )
            // InternalPdfMk.g:2608:2: rule__MarginDefinition__Group__3__Impl rule__MarginDefinition__Group__4
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
    // InternalPdfMk.g:2615:1: rule__MarginDefinition__Group__3__Impl : ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) ;
    public final void rule__MarginDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2619:1: ( ( ( rule__MarginDefinition__ValuesAssignment_3 )? ) )
            // InternalPdfMk.g:2620:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            {
            // InternalPdfMk.g:2620:1: ( ( rule__MarginDefinition__ValuesAssignment_3 )? )
            // InternalPdfMk.g:2621:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:2622:2: ( rule__MarginDefinition__ValuesAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:2622:3: rule__MarginDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:2630:1: rule__MarginDefinition__Group__4 : rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 ;
    public final void rule__MarginDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2634:1: ( rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5 )
            // InternalPdfMk.g:2635:2: rule__MarginDefinition__Group__4__Impl rule__MarginDefinition__Group__5
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
    // InternalPdfMk.g:2642:1: rule__MarginDefinition__Group__4__Impl : ( ( rule__MarginDefinition__Group_4__0 )* ) ;
    public final void rule__MarginDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2646:1: ( ( ( rule__MarginDefinition__Group_4__0 )* ) )
            // InternalPdfMk.g:2647:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            {
            // InternalPdfMk.g:2647:1: ( ( rule__MarginDefinition__Group_4__0 )* )
            // InternalPdfMk.g:2648:2: ( rule__MarginDefinition__Group_4__0 )*
            {
             before(grammarAccess.getMarginDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:2649:2: ( rule__MarginDefinition__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPdfMk.g:2649:3: rule__MarginDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:2657:1: rule__MarginDefinition__Group__5 : rule__MarginDefinition__Group__5__Impl ;
    public final void rule__MarginDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2661:1: ( rule__MarginDefinition__Group__5__Impl )
            // InternalPdfMk.g:2662:2: rule__MarginDefinition__Group__5__Impl
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
    // InternalPdfMk.g:2668:1: rule__MarginDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__MarginDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2672:1: ( ( ']' ) )
            // InternalPdfMk.g:2673:1: ( ']' )
            {
            // InternalPdfMk.g:2673:1: ( ']' )
            // InternalPdfMk.g:2674:2: ']'
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
    // InternalPdfMk.g:2684:1: rule__MarginDefinition__Group_4__0 : rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 ;
    public final void rule__MarginDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2688:1: ( rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1 )
            // InternalPdfMk.g:2689:2: rule__MarginDefinition__Group_4__0__Impl rule__MarginDefinition__Group_4__1
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
    // InternalPdfMk.g:2696:1: rule__MarginDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MarginDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2700:1: ( ( ',' ) )
            // InternalPdfMk.g:2701:1: ( ',' )
            {
            // InternalPdfMk.g:2701:1: ( ',' )
            // InternalPdfMk.g:2702:2: ','
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
    // InternalPdfMk.g:2711:1: rule__MarginDefinition__Group_4__1 : rule__MarginDefinition__Group_4__1__Impl ;
    public final void rule__MarginDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2715:1: ( rule__MarginDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:2716:2: rule__MarginDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:2722:1: rule__MarginDefinition__Group_4__1__Impl : ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__MarginDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2726:1: ( ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:2727:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:2727:1: ( ( rule__MarginDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:2728:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getMarginDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:2729:2: ( rule__MarginDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:2729:3: rule__MarginDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:2738:1: rule__ImageDefintion__Group__0 : rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 ;
    public final void rule__ImageDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2742:1: ( rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1 )
            // InternalPdfMk.g:2743:2: rule__ImageDefintion__Group__0__Impl rule__ImageDefintion__Group__1
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
    // InternalPdfMk.g:2750:1: rule__ImageDefintion__Group__0__Impl : ( ( rule__ImageDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2754:1: ( ( ( rule__ImageDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2755:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2755:1: ( ( rule__ImageDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2756:2: ( rule__ImageDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2757:2: ( rule__ImageDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2757:3: rule__ImageDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2765:1: rule__ImageDefintion__Group__1 : rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 ;
    public final void rule__ImageDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2769:1: ( rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2 )
            // InternalPdfMk.g:2770:2: rule__ImageDefintion__Group__1__Impl rule__ImageDefintion__Group__2
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
    // InternalPdfMk.g:2777:1: rule__ImageDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2781:1: ( ( ':' ) )
            // InternalPdfMk.g:2782:1: ( ':' )
            {
            // InternalPdfMk.g:2782:1: ( ':' )
            // InternalPdfMk.g:2783:2: ':'
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
    // InternalPdfMk.g:2792:1: rule__ImageDefintion__Group__2 : rule__ImageDefintion__Group__2__Impl ;
    public final void rule__ImageDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2796:1: ( rule__ImageDefintion__Group__2__Impl )
            // InternalPdfMk.g:2797:2: rule__ImageDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2803:1: rule__ImageDefintion__Group__2__Impl : ( ( rule__ImageDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2807:1: ( ( ( rule__ImageDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2808:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2808:1: ( ( rule__ImageDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2809:2: ( rule__ImageDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2810:2: ( rule__ImageDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2810:3: rule__ImageDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2819:1: rule__ImageWidthDefintion__Group__0 : rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 ;
    public final void rule__ImageWidthDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2823:1: ( rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1 )
            // InternalPdfMk.g:2824:2: rule__ImageWidthDefintion__Group__0__Impl rule__ImageWidthDefintion__Group__1
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
    // InternalPdfMk.g:2831:1: rule__ImageWidthDefintion__Group__0__Impl : ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageWidthDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2835:1: ( ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2836:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2836:1: ( ( rule__ImageWidthDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2837:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2838:2: ( rule__ImageWidthDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2838:3: rule__ImageWidthDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2846:1: rule__ImageWidthDefintion__Group__1 : rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 ;
    public final void rule__ImageWidthDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2850:1: ( rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2 )
            // InternalPdfMk.g:2851:2: rule__ImageWidthDefintion__Group__1__Impl rule__ImageWidthDefintion__Group__2
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
    // InternalPdfMk.g:2858:1: rule__ImageWidthDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageWidthDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2862:1: ( ( ':' ) )
            // InternalPdfMk.g:2863:1: ( ':' )
            {
            // InternalPdfMk.g:2863:1: ( ':' )
            // InternalPdfMk.g:2864:2: ':'
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
    // InternalPdfMk.g:2873:1: rule__ImageWidthDefintion__Group__2 : rule__ImageWidthDefintion__Group__2__Impl ;
    public final void rule__ImageWidthDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2877:1: ( rule__ImageWidthDefintion__Group__2__Impl )
            // InternalPdfMk.g:2878:2: rule__ImageWidthDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2884:1: rule__ImageWidthDefintion__Group__2__Impl : ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageWidthDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2888:1: ( ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2889:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2889:1: ( ( rule__ImageWidthDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2890:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2891:2: ( rule__ImageWidthDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2891:3: rule__ImageWidthDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2900:1: rule__ImageHeightDefintion__Group__0 : rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 ;
    public final void rule__ImageHeightDefintion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2904:1: ( rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1 )
            // InternalPdfMk.g:2905:2: rule__ImageHeightDefintion__Group__0__Impl rule__ImageHeightDefintion__Group__1
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
    // InternalPdfMk.g:2912:1: rule__ImageHeightDefintion__Group__0__Impl : ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) ;
    public final void rule__ImageHeightDefintion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2916:1: ( ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2917:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2917:1: ( ( rule__ImageHeightDefintion__KeyAssignment_0 ) )
            // InternalPdfMk.g:2918:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2919:2: ( rule__ImageHeightDefintion__KeyAssignment_0 )
            // InternalPdfMk.g:2919:3: rule__ImageHeightDefintion__KeyAssignment_0
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
    // InternalPdfMk.g:2927:1: rule__ImageHeightDefintion__Group__1 : rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 ;
    public final void rule__ImageHeightDefintion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2931:1: ( rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2 )
            // InternalPdfMk.g:2932:2: rule__ImageHeightDefintion__Group__1__Impl rule__ImageHeightDefintion__Group__2
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
    // InternalPdfMk.g:2939:1: rule__ImageHeightDefintion__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageHeightDefintion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2943:1: ( ( ':' ) )
            // InternalPdfMk.g:2944:1: ( ':' )
            {
            // InternalPdfMk.g:2944:1: ( ':' )
            // InternalPdfMk.g:2945:2: ':'
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
    // InternalPdfMk.g:2954:1: rule__ImageHeightDefintion__Group__2 : rule__ImageHeightDefintion__Group__2__Impl ;
    public final void rule__ImageHeightDefintion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2958:1: ( rule__ImageHeightDefintion__Group__2__Impl )
            // InternalPdfMk.g:2959:2: rule__ImageHeightDefintion__Group__2__Impl
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
    // InternalPdfMk.g:2965:1: rule__ImageHeightDefintion__Group__2__Impl : ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) ;
    public final void rule__ImageHeightDefintion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2969:1: ( ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2970:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2970:1: ( ( rule__ImageHeightDefintion__ValueAssignment_2 ) )
            // InternalPdfMk.g:2971:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2972:2: ( rule__ImageHeightDefintion__ValueAssignment_2 )
            // InternalPdfMk.g:2972:3: rule__ImageHeightDefintion__ValueAssignment_2
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
    // InternalPdfMk.g:2981:1: rule__ImagePageBreakDefinition__Group__0 : rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 ;
    public final void rule__ImagePageBreakDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2985:1: ( rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1 )
            // InternalPdfMk.g:2986:2: rule__ImagePageBreakDefinition__Group__0__Impl rule__ImagePageBreakDefinition__Group__1
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
    // InternalPdfMk.g:2993:1: rule__ImagePageBreakDefinition__Group__0__Impl : ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2997:1: ( ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2998:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2998:1: ( ( rule__ImagePageBreakDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:2999:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3000:2: ( rule__ImagePageBreakDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3000:3: rule__ImagePageBreakDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3008:1: rule__ImagePageBreakDefinition__Group__1 : rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 ;
    public final void rule__ImagePageBreakDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3012:1: ( rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2 )
            // InternalPdfMk.g:3013:2: rule__ImagePageBreakDefinition__Group__1__Impl rule__ImagePageBreakDefinition__Group__2
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
    // InternalPdfMk.g:3020:1: rule__ImagePageBreakDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImagePageBreakDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3024:1: ( ( ':' ) )
            // InternalPdfMk.g:3025:1: ( ':' )
            {
            // InternalPdfMk.g:3025:1: ( ':' )
            // InternalPdfMk.g:3026:2: ':'
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
    // InternalPdfMk.g:3035:1: rule__ImagePageBreakDefinition__Group__2 : rule__ImagePageBreakDefinition__Group__2__Impl ;
    public final void rule__ImagePageBreakDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3039:1: ( rule__ImagePageBreakDefinition__Group__2__Impl )
            // InternalPdfMk.g:3040:2: rule__ImagePageBreakDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3046:1: rule__ImagePageBreakDefinition__Group__2__Impl : ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImagePageBreakDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3050:1: ( ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3051:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3051:1: ( ( rule__ImagePageBreakDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3052:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3053:2: ( rule__ImagePageBreakDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3053:3: rule__ImagePageBreakDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3062:1: rule__ImageFitDefinition__Group__0 : rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 ;
    public final void rule__ImageFitDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3066:1: ( rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1 )
            // InternalPdfMk.g:3067:2: rule__ImageFitDefinition__Group__0__Impl rule__ImageFitDefinition__Group__1
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
    // InternalPdfMk.g:3074:1: rule__ImageFitDefinition__Group__0__Impl : ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageFitDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3078:1: ( ( ( rule__ImageFitDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3079:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3079:1: ( ( rule__ImageFitDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3080:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3081:2: ( rule__ImageFitDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3081:3: rule__ImageFitDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3089:1: rule__ImageFitDefinition__Group__1 : rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 ;
    public final void rule__ImageFitDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3093:1: ( rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2 )
            // InternalPdfMk.g:3094:2: rule__ImageFitDefinition__Group__1__Impl rule__ImageFitDefinition__Group__2
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
    // InternalPdfMk.g:3101:1: rule__ImageFitDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageFitDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3105:1: ( ( ':' ) )
            // InternalPdfMk.g:3106:1: ( ':' )
            {
            // InternalPdfMk.g:3106:1: ( ':' )
            // InternalPdfMk.g:3107:2: ':'
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
    // InternalPdfMk.g:3116:1: rule__ImageFitDefinition__Group__2 : rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 ;
    public final void rule__ImageFitDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3120:1: ( rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3 )
            // InternalPdfMk.g:3121:2: rule__ImageFitDefinition__Group__2__Impl rule__ImageFitDefinition__Group__3
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
    // InternalPdfMk.g:3128:1: rule__ImageFitDefinition__Group__2__Impl : ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageFitDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3132:1: ( ( ( rule__ImageFitDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3133:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3133:1: ( ( rule__ImageFitDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3134:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3135:2: ( rule__ImageFitDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3135:3: rule__ImageFitDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3143:1: rule__ImageFitDefinition__Group__3 : rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 ;
    public final void rule__ImageFitDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3147:1: ( rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4 )
            // InternalPdfMk.g:3148:2: rule__ImageFitDefinition__Group__3__Impl rule__ImageFitDefinition__Group__4
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
    // InternalPdfMk.g:3155:1: rule__ImageFitDefinition__Group__3__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) ;
    public final void rule__ImageFitDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3159:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) ) )
            // InternalPdfMk.g:3160:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            {
            // InternalPdfMk.g:3160:1: ( ( rule__ImageFitDefinition__ValuesAssignment_3 ) )
            // InternalPdfMk.g:3161:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_3()); 
            // InternalPdfMk.g:3162:2: ( rule__ImageFitDefinition__ValuesAssignment_3 )
            // InternalPdfMk.g:3162:3: rule__ImageFitDefinition__ValuesAssignment_3
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
    // InternalPdfMk.g:3170:1: rule__ImageFitDefinition__Group__4 : rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 ;
    public final void rule__ImageFitDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3174:1: ( rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5 )
            // InternalPdfMk.g:3175:2: rule__ImageFitDefinition__Group__4__Impl rule__ImageFitDefinition__Group__5
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
    // InternalPdfMk.g:3182:1: rule__ImageFitDefinition__Group__4__Impl : ( ( rule__ImageFitDefinition__Group_4__0 ) ) ;
    public final void rule__ImageFitDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3186:1: ( ( ( rule__ImageFitDefinition__Group_4__0 ) ) )
            // InternalPdfMk.g:3187:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            {
            // InternalPdfMk.g:3187:1: ( ( rule__ImageFitDefinition__Group_4__0 ) )
            // InternalPdfMk.g:3188:2: ( rule__ImageFitDefinition__Group_4__0 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getGroup_4()); 
            // InternalPdfMk.g:3189:2: ( rule__ImageFitDefinition__Group_4__0 )
            // InternalPdfMk.g:3189:3: rule__ImageFitDefinition__Group_4__0
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
    // InternalPdfMk.g:3197:1: rule__ImageFitDefinition__Group__5 : rule__ImageFitDefinition__Group__5__Impl ;
    public final void rule__ImageFitDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3201:1: ( rule__ImageFitDefinition__Group__5__Impl )
            // InternalPdfMk.g:3202:2: rule__ImageFitDefinition__Group__5__Impl
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
    // InternalPdfMk.g:3208:1: rule__ImageFitDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ImageFitDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3212:1: ( ( ']' ) )
            // InternalPdfMk.g:3213:1: ( ']' )
            {
            // InternalPdfMk.g:3213:1: ( ']' )
            // InternalPdfMk.g:3214:2: ']'
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
    // InternalPdfMk.g:3224:1: rule__ImageFitDefinition__Group_4__0 : rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 ;
    public final void rule__ImageFitDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3228:1: ( rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1 )
            // InternalPdfMk.g:3229:2: rule__ImageFitDefinition__Group_4__0__Impl rule__ImageFitDefinition__Group_4__1
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
    // InternalPdfMk.g:3236:1: rule__ImageFitDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageFitDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3240:1: ( ( ',' ) )
            // InternalPdfMk.g:3241:1: ( ',' )
            {
            // InternalPdfMk.g:3241:1: ( ',' )
            // InternalPdfMk.g:3242:2: ','
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
    // InternalPdfMk.g:3251:1: rule__ImageFitDefinition__Group_4__1 : rule__ImageFitDefinition__Group_4__1__Impl ;
    public final void rule__ImageFitDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3255:1: ( rule__ImageFitDefinition__Group_4__1__Impl )
            // InternalPdfMk.g:3256:2: rule__ImageFitDefinition__Group_4__1__Impl
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
    // InternalPdfMk.g:3262:1: rule__ImageFitDefinition__Group_4__1__Impl : ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) ;
    public final void rule__ImageFitDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3266:1: ( ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) ) )
            // InternalPdfMk.g:3267:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            {
            // InternalPdfMk.g:3267:1: ( ( rule__ImageFitDefinition__ValuesAssignment_4_1 ) )
            // InternalPdfMk.g:3268:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValuesAssignment_4_1()); 
            // InternalPdfMk.g:3269:2: ( rule__ImageFitDefinition__ValuesAssignment_4_1 )
            // InternalPdfMk.g:3269:3: rule__ImageFitDefinition__ValuesAssignment_4_1
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
    // InternalPdfMk.g:3278:1: rule__ImageOpacityDefinition__Group__0 : rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 ;
    public final void rule__ImageOpacityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3282:1: ( rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1 )
            // InternalPdfMk.g:3283:2: rule__ImageOpacityDefinition__Group__0__Impl rule__ImageOpacityDefinition__Group__1
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
    // InternalPdfMk.g:3290:1: rule__ImageOpacityDefinition__Group__0__Impl : ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3294:1: ( ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3295:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3295:1: ( ( rule__ImageOpacityDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3296:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3297:2: ( rule__ImageOpacityDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3297:3: rule__ImageOpacityDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3305:1: rule__ImageOpacityDefinition__Group__1 : rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 ;
    public final void rule__ImageOpacityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3309:1: ( rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2 )
            // InternalPdfMk.g:3310:2: rule__ImageOpacityDefinition__Group__1__Impl rule__ImageOpacityDefinition__Group__2
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
    // InternalPdfMk.g:3317:1: rule__ImageOpacityDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ImageOpacityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3321:1: ( ( ':' ) )
            // InternalPdfMk.g:3322:1: ( ':' )
            {
            // InternalPdfMk.g:3322:1: ( ':' )
            // InternalPdfMk.g:3323:2: ':'
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
    // InternalPdfMk.g:3332:1: rule__ImageOpacityDefinition__Group__2 : rule__ImageOpacityDefinition__Group__2__Impl ;
    public final void rule__ImageOpacityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3336:1: ( rule__ImageOpacityDefinition__Group__2__Impl )
            // InternalPdfMk.g:3337:2: rule__ImageOpacityDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3343:1: rule__ImageOpacityDefinition__Group__2__Impl : ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ImageOpacityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3347:1: ( ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3348:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3348:1: ( ( rule__ImageOpacityDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3349:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3350:2: ( rule__ImageOpacityDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3350:3: rule__ImageOpacityDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3359:1: rule__ListReversedDefinition__Group__0 : rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 ;
    public final void rule__ListReversedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3363:1: ( rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1 )
            // InternalPdfMk.g:3364:2: rule__ListReversedDefinition__Group__0__Impl rule__ListReversedDefinition__Group__1
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
    // InternalPdfMk.g:3371:1: rule__ListReversedDefinition__Group__0__Impl : ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListReversedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3375:1: ( ( ( rule__ListReversedDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3376:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3376:1: ( ( rule__ListReversedDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3377:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3378:2: ( rule__ListReversedDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3378:3: rule__ListReversedDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3386:1: rule__ListReversedDefinition__Group__1 : rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 ;
    public final void rule__ListReversedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3390:1: ( rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2 )
            // InternalPdfMk.g:3391:2: rule__ListReversedDefinition__Group__1__Impl rule__ListReversedDefinition__Group__2
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
    // InternalPdfMk.g:3398:1: rule__ListReversedDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListReversedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3402:1: ( ( ':' ) )
            // InternalPdfMk.g:3403:1: ( ':' )
            {
            // InternalPdfMk.g:3403:1: ( ':' )
            // InternalPdfMk.g:3404:2: ':'
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
    // InternalPdfMk.g:3413:1: rule__ListReversedDefinition__Group__2 : rule__ListReversedDefinition__Group__2__Impl ;
    public final void rule__ListReversedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3417:1: ( rule__ListReversedDefinition__Group__2__Impl )
            // InternalPdfMk.g:3418:2: rule__ListReversedDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3424:1: rule__ListReversedDefinition__Group__2__Impl : ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListReversedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3428:1: ( ( ( rule__ListReversedDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3429:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3429:1: ( ( rule__ListReversedDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3430:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3431:2: ( rule__ListReversedDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3431:3: rule__ListReversedDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3440:1: rule__ListCounterDefinition__Group__0 : rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 ;
    public final void rule__ListCounterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3444:1: ( rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1 )
            // InternalPdfMk.g:3445:2: rule__ListCounterDefinition__Group__0__Impl rule__ListCounterDefinition__Group__1
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
    // InternalPdfMk.g:3452:1: rule__ListCounterDefinition__Group__0__Impl : ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListCounterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3456:1: ( ( ( rule__ListCounterDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3457:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3457:1: ( ( rule__ListCounterDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3458:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3459:2: ( rule__ListCounterDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3459:3: rule__ListCounterDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3467:1: rule__ListCounterDefinition__Group__1 : rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 ;
    public final void rule__ListCounterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3471:1: ( rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2 )
            // InternalPdfMk.g:3472:2: rule__ListCounterDefinition__Group__1__Impl rule__ListCounterDefinition__Group__2
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
    // InternalPdfMk.g:3479:1: rule__ListCounterDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListCounterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3483:1: ( ( ':' ) )
            // InternalPdfMk.g:3484:1: ( ':' )
            {
            // InternalPdfMk.g:3484:1: ( ':' )
            // InternalPdfMk.g:3485:2: ':'
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
    // InternalPdfMk.g:3494:1: rule__ListCounterDefinition__Group__2 : rule__ListCounterDefinition__Group__2__Impl ;
    public final void rule__ListCounterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3498:1: ( rule__ListCounterDefinition__Group__2__Impl )
            // InternalPdfMk.g:3499:2: rule__ListCounterDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3505:1: rule__ListCounterDefinition__Group__2__Impl : ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListCounterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3509:1: ( ( ( rule__ListCounterDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3510:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3510:1: ( ( rule__ListCounterDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3511:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3512:2: ( rule__ListCounterDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3512:3: rule__ListCounterDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3521:1: rule__ListTypeDefinition__Group__0 : rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 ;
    public final void rule__ListTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3525:1: ( rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1 )
            // InternalPdfMk.g:3526:2: rule__ListTypeDefinition__Group__0__Impl rule__ListTypeDefinition__Group__1
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
    // InternalPdfMk.g:3533:1: rule__ListTypeDefinition__Group__0__Impl : ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3537:1: ( ( ( rule__ListTypeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3538:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3538:1: ( ( rule__ListTypeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3539:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3540:2: ( rule__ListTypeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3540:3: rule__ListTypeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3548:1: rule__ListTypeDefinition__Group__1 : rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 ;
    public final void rule__ListTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3552:1: ( rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2 )
            // InternalPdfMk.g:3553:2: rule__ListTypeDefinition__Group__1__Impl rule__ListTypeDefinition__Group__2
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
    // InternalPdfMk.g:3560:1: rule__ListTypeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3564:1: ( ( ':' ) )
            // InternalPdfMk.g:3565:1: ( ':' )
            {
            // InternalPdfMk.g:3565:1: ( ':' )
            // InternalPdfMk.g:3566:2: ':'
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
    // InternalPdfMk.g:3575:1: rule__ListTypeDefinition__Group__2 : rule__ListTypeDefinition__Group__2__Impl ;
    public final void rule__ListTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3579:1: ( rule__ListTypeDefinition__Group__2__Impl )
            // InternalPdfMk.g:3580:2: rule__ListTypeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3586:1: rule__ListTypeDefinition__Group__2__Impl : ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3590:1: ( ( ( rule__ListTypeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3591:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3591:1: ( ( rule__ListTypeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3592:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3593:2: ( rule__ListTypeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3593:3: rule__ListTypeDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3602:1: rule__ListColorDefinition__Group__0 : rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 ;
    public final void rule__ListColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3606:1: ( rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1 )
            // InternalPdfMk.g:3607:2: rule__ListColorDefinition__Group__0__Impl rule__ListColorDefinition__Group__1
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
    // InternalPdfMk.g:3614:1: rule__ListColorDefinition__Group__0__Impl : ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3618:1: ( ( ( rule__ListColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3619:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3619:1: ( ( rule__ListColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3620:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3621:2: ( rule__ListColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3621:3: rule__ListColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3629:1: rule__ListColorDefinition__Group__1 : rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 ;
    public final void rule__ListColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3633:1: ( rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2 )
            // InternalPdfMk.g:3634:2: rule__ListColorDefinition__Group__1__Impl rule__ListColorDefinition__Group__2
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
    // InternalPdfMk.g:3641:1: rule__ListColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3645:1: ( ( ':' ) )
            // InternalPdfMk.g:3646:1: ( ':' )
            {
            // InternalPdfMk.g:3646:1: ( ':' )
            // InternalPdfMk.g:3647:2: ':'
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
    // InternalPdfMk.g:3656:1: rule__ListColorDefinition__Group__2 : rule__ListColorDefinition__Group__2__Impl ;
    public final void rule__ListColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3660:1: ( rule__ListColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3661:2: rule__ListColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3667:1: rule__ListColorDefinition__Group__2__Impl : ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3671:1: ( ( ( rule__ListColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3672:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3672:1: ( ( rule__ListColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3673:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3674:2: ( rule__ListColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3674:3: rule__ListColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3683:1: rule__ListMarkerColorDefinition__Group__0 : rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 ;
    public final void rule__ListMarkerColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3687:1: ( rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1 )
            // InternalPdfMk.g:3688:2: rule__ListMarkerColorDefinition__Group__0__Impl rule__ListMarkerColorDefinition__Group__1
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
    // InternalPdfMk.g:3695:1: rule__ListMarkerColorDefinition__Group__0__Impl : ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3699:1: ( ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3700:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3700:1: ( ( rule__ListMarkerColorDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3701:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3702:2: ( rule__ListMarkerColorDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3702:3: rule__ListMarkerColorDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3710:1: rule__ListMarkerColorDefinition__Group__1 : rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 ;
    public final void rule__ListMarkerColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3714:1: ( rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2 )
            // InternalPdfMk.g:3715:2: rule__ListMarkerColorDefinition__Group__1__Impl rule__ListMarkerColorDefinition__Group__2
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
    // InternalPdfMk.g:3722:1: rule__ListMarkerColorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ListMarkerColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3726:1: ( ( ':' ) )
            // InternalPdfMk.g:3727:1: ( ':' )
            {
            // InternalPdfMk.g:3727:1: ( ':' )
            // InternalPdfMk.g:3728:2: ':'
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
    // InternalPdfMk.g:3737:1: rule__ListMarkerColorDefinition__Group__2 : rule__ListMarkerColorDefinition__Group__2__Impl ;
    public final void rule__ListMarkerColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3741:1: ( rule__ListMarkerColorDefinition__Group__2__Impl )
            // InternalPdfMk.g:3742:2: rule__ListMarkerColorDefinition__Group__2__Impl
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
    // InternalPdfMk.g:3748:1: rule__ListMarkerColorDefinition__Group__2__Impl : ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ListMarkerColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3752:1: ( ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3753:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3753:1: ( ( rule__ListMarkerColorDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3754:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3755:2: ( rule__ListMarkerColorDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3755:3: rule__ListMarkerColorDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:3764:1: rule__TableRowDefinition__Group__0 : rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 ;
    public final void rule__TableRowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3768:1: ( rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1 )
            // InternalPdfMk.g:3769:2: rule__TableRowDefinition__Group__0__Impl rule__TableRowDefinition__Group__1
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
    // InternalPdfMk.g:3776:1: rule__TableRowDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3780:1: ( ( '[' ) )
            // InternalPdfMk.g:3781:1: ( '[' )
            {
            // InternalPdfMk.g:3781:1: ( '[' )
            // InternalPdfMk.g:3782:2: '['
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
    // InternalPdfMk.g:3791:1: rule__TableRowDefinition__Group__1 : rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 ;
    public final void rule__TableRowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3795:1: ( rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2 )
            // InternalPdfMk.g:3796:2: rule__TableRowDefinition__Group__1__Impl rule__TableRowDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:3803:1: rule__TableRowDefinition__Group__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) ;
    public final void rule__TableRowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3807:1: ( ( ( rule__TableRowDefinition__ItemAssignment_1 ) ) )
            // InternalPdfMk.g:3808:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            {
            // InternalPdfMk.g:3808:1: ( ( rule__TableRowDefinition__ItemAssignment_1 ) )
            // InternalPdfMk.g:3809:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_1()); 
            // InternalPdfMk.g:3810:2: ( rule__TableRowDefinition__ItemAssignment_1 )
            // InternalPdfMk.g:3810:3: rule__TableRowDefinition__ItemAssignment_1
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
    // InternalPdfMk.g:3818:1: rule__TableRowDefinition__Group__2 : rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 ;
    public final void rule__TableRowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3822:1: ( rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3 )
            // InternalPdfMk.g:3823:2: rule__TableRowDefinition__Group__2__Impl rule__TableRowDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:3830:1: rule__TableRowDefinition__Group__2__Impl : ( ( rule__TableRowDefinition__Group_2__0 ) ) ;
    public final void rule__TableRowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3834:1: ( ( ( rule__TableRowDefinition__Group_2__0 ) ) )
            // InternalPdfMk.g:3835:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            {
            // InternalPdfMk.g:3835:1: ( ( rule__TableRowDefinition__Group_2__0 ) )
            // InternalPdfMk.g:3836:2: ( rule__TableRowDefinition__Group_2__0 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getGroup_2()); 
            // InternalPdfMk.g:3837:2: ( rule__TableRowDefinition__Group_2__0 )
            // InternalPdfMk.g:3837:3: rule__TableRowDefinition__Group_2__0
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
    // InternalPdfMk.g:3845:1: rule__TableRowDefinition__Group__3 : rule__TableRowDefinition__Group__3__Impl ;
    public final void rule__TableRowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3849:1: ( rule__TableRowDefinition__Group__3__Impl )
            // InternalPdfMk.g:3850:2: rule__TableRowDefinition__Group__3__Impl
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
    // InternalPdfMk.g:3856:1: rule__TableRowDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3860:1: ( ( ']' ) )
            // InternalPdfMk.g:3861:1: ( ']' )
            {
            // InternalPdfMk.g:3861:1: ( ']' )
            // InternalPdfMk.g:3862:2: ']'
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
    // InternalPdfMk.g:3872:1: rule__TableRowDefinition__Group_2__0 : rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 ;
    public final void rule__TableRowDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3876:1: ( rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1 )
            // InternalPdfMk.g:3877:2: rule__TableRowDefinition__Group_2__0__Impl rule__TableRowDefinition__Group_2__1
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
    // InternalPdfMk.g:3884:1: rule__TableRowDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRowDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3888:1: ( ( ',' ) )
            // InternalPdfMk.g:3889:1: ( ',' )
            {
            // InternalPdfMk.g:3889:1: ( ',' )
            // InternalPdfMk.g:3890:2: ','
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
    // InternalPdfMk.g:3899:1: rule__TableRowDefinition__Group_2__1 : rule__TableRowDefinition__Group_2__1__Impl ;
    public final void rule__TableRowDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3903:1: ( rule__TableRowDefinition__Group_2__1__Impl )
            // InternalPdfMk.g:3904:2: rule__TableRowDefinition__Group_2__1__Impl
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
    // InternalPdfMk.g:3910:1: rule__TableRowDefinition__Group_2__1__Impl : ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) ;
    public final void rule__TableRowDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3914:1: ( ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) ) )
            // InternalPdfMk.g:3915:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            {
            // InternalPdfMk.g:3915:1: ( ( rule__TableRowDefinition__ItemAssignment_2_1 ) )
            // InternalPdfMk.g:3916:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            {
             before(grammarAccess.getTableRowDefinitionAccess().getItemAssignment_2_1()); 
            // InternalPdfMk.g:3917:2: ( rule__TableRowDefinition__ItemAssignment_2_1 )
            // InternalPdfMk.g:3917:3: rule__TableRowDefinition__ItemAssignment_2_1
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
    // InternalPdfMk.g:3926:1: rule__TableBodyDefinition__Group__0 : rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 ;
    public final void rule__TableBodyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3930:1: ( rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1 )
            // InternalPdfMk.g:3931:2: rule__TableBodyDefinition__Group__0__Impl rule__TableBodyDefinition__Group__1
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
    // InternalPdfMk.g:3938:1: rule__TableBodyDefinition__Group__0__Impl : ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableBodyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3942:1: ( ( ( rule__TableBodyDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:3943:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:3943:1: ( ( rule__TableBodyDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:3944:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:3945:2: ( rule__TableBodyDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:3945:3: rule__TableBodyDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:3953:1: rule__TableBodyDefinition__Group__1 : rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 ;
    public final void rule__TableBodyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3957:1: ( rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2 )
            // InternalPdfMk.g:3958:2: rule__TableBodyDefinition__Group__1__Impl rule__TableBodyDefinition__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:3965:1: rule__TableBodyDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableBodyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3969:1: ( ( ':' ) )
            // InternalPdfMk.g:3970:1: ( ':' )
            {
            // InternalPdfMk.g:3970:1: ( ':' )
            // InternalPdfMk.g:3971:2: ':'
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
    // InternalPdfMk.g:3980:1: rule__TableBodyDefinition__Group__2 : rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 ;
    public final void rule__TableBodyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3984:1: ( rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3 )
            // InternalPdfMk.g:3985:2: rule__TableBodyDefinition__Group__2__Impl rule__TableBodyDefinition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:3992:1: rule__TableBodyDefinition__Group__2__Impl : ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableBodyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3996:1: ( ( ( rule__TableBodyDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:3997:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:3997:1: ( ( rule__TableBodyDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:3998:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:3999:2: ( rule__TableBodyDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:3999:3: rule__TableBodyDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:4007:1: rule__TableBodyDefinition__Group__3 : rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 ;
    public final void rule__TableBodyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4011:1: ( rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4 )
            // InternalPdfMk.g:4012:2: rule__TableBodyDefinition__Group__3__Impl rule__TableBodyDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalPdfMk.g:4019:1: rule__TableBodyDefinition__Group__3__Impl : ( ( rule__TableBodyDefinition__Group_3__0 ) ) ;
    public final void rule__TableBodyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4023:1: ( ( ( rule__TableBodyDefinition__Group_3__0 ) ) )
            // InternalPdfMk.g:4024:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            {
            // InternalPdfMk.g:4024:1: ( ( rule__TableBodyDefinition__Group_3__0 ) )
            // InternalPdfMk.g:4025:2: ( rule__TableBodyDefinition__Group_3__0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3()); 
            // InternalPdfMk.g:4026:2: ( rule__TableBodyDefinition__Group_3__0 )
            // InternalPdfMk.g:4026:3: rule__TableBodyDefinition__Group_3__0
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
    // InternalPdfMk.g:4034:1: rule__TableBodyDefinition__Group__4 : rule__TableBodyDefinition__Group__4__Impl ;
    public final void rule__TableBodyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4038:1: ( rule__TableBodyDefinition__Group__4__Impl )
            // InternalPdfMk.g:4039:2: rule__TableBodyDefinition__Group__4__Impl
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
    // InternalPdfMk.g:4045:1: rule__TableBodyDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__TableBodyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4049:1: ( ( ']' ) )
            // InternalPdfMk.g:4050:1: ( ']' )
            {
            // InternalPdfMk.g:4050:1: ( ']' )
            // InternalPdfMk.g:4051:2: ']'
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
    // InternalPdfMk.g:4061:1: rule__TableBodyDefinition__Group_3__0 : rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 ;
    public final void rule__TableBodyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4065:1: ( rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1 )
            // InternalPdfMk.g:4066:2: rule__TableBodyDefinition__Group_3__0__Impl rule__TableBodyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:4073:1: rule__TableBodyDefinition__Group_3__0__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) ;
    public final void rule__TableBodyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4077:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) ) )
            // InternalPdfMk.g:4078:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            {
            // InternalPdfMk.g:4078:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_0 ) )
            // InternalPdfMk.g:4079:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_0()); 
            // InternalPdfMk.g:4080:2: ( rule__TableBodyDefinition__RowsAssignment_3_0 )
            // InternalPdfMk.g:4080:3: rule__TableBodyDefinition__RowsAssignment_3_0
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
    // InternalPdfMk.g:4088:1: rule__TableBodyDefinition__Group_3__1 : rule__TableBodyDefinition__Group_3__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4092:1: ( rule__TableBodyDefinition__Group_3__1__Impl )
            // InternalPdfMk.g:4093:2: rule__TableBodyDefinition__Group_3__1__Impl
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
    // InternalPdfMk.g:4099:1: rule__TableBodyDefinition__Group_3__1__Impl : ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) ;
    public final void rule__TableBodyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4103:1: ( ( ( rule__TableBodyDefinition__Group_3_1__0 )* ) )
            // InternalPdfMk.g:4104:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:4104:1: ( ( rule__TableBodyDefinition__Group_3_1__0 )* )
            // InternalPdfMk.g:4105:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getGroup_3_1()); 
            // InternalPdfMk.g:4106:2: ( rule__TableBodyDefinition__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPdfMk.g:4106:3: rule__TableBodyDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:4115:1: rule__TableBodyDefinition__Group_3_1__0 : rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 ;
    public final void rule__TableBodyDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4119:1: ( rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1 )
            // InternalPdfMk.g:4120:2: rule__TableBodyDefinition__Group_3_1__0__Impl rule__TableBodyDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:4127:1: rule__TableBodyDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__TableBodyDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4131:1: ( ( ',' ) )
            // InternalPdfMk.g:4132:1: ( ',' )
            {
            // InternalPdfMk.g:4132:1: ( ',' )
            // InternalPdfMk.g:4133:2: ','
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
    // InternalPdfMk.g:4142:1: rule__TableBodyDefinition__Group_3_1__1 : rule__TableBodyDefinition__Group_3_1__1__Impl ;
    public final void rule__TableBodyDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4146:1: ( rule__TableBodyDefinition__Group_3_1__1__Impl )
            // InternalPdfMk.g:4147:2: rule__TableBodyDefinition__Group_3_1__1__Impl
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
    // InternalPdfMk.g:4153:1: rule__TableBodyDefinition__Group_3_1__1__Impl : ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) ;
    public final void rule__TableBodyDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4157:1: ( ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:4158:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:4158:1: ( ( rule__TableBodyDefinition__RowsAssignment_3_1_1 ) )
            // InternalPdfMk.g:4159:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getRowsAssignment_3_1_1()); 
            // InternalPdfMk.g:4160:2: ( rule__TableBodyDefinition__RowsAssignment_3_1_1 )
            // InternalPdfMk.g:4160:3: rule__TableBodyDefinition__RowsAssignment_3_1_1
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
    // InternalPdfMk.g:4169:1: rule__TableDefinition__Group__0 : rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 ;
    public final void rule__TableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4173:1: ( rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1 )
            // InternalPdfMk.g:4174:2: rule__TableDefinition__Group__0__Impl rule__TableDefinition__Group__1
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
    // InternalPdfMk.g:4181:1: rule__TableDefinition__Group__0__Impl : ( ( rule__TableDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4185:1: ( ( ( rule__TableDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:4186:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:4186:1: ( ( rule__TableDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:4187:2: ( rule__TableDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:4188:2: ( rule__TableDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:4188:3: rule__TableDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:4196:1: rule__TableDefinition__Group__1 : rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 ;
    public final void rule__TableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4200:1: ( rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2 )
            // InternalPdfMk.g:4201:2: rule__TableDefinition__Group__1__Impl rule__TableDefinition__Group__2
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
    // InternalPdfMk.g:4208:1: rule__TableDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4212:1: ( ( ':' ) )
            // InternalPdfMk.g:4213:1: ( ':' )
            {
            // InternalPdfMk.g:4213:1: ( ':' )
            // InternalPdfMk.g:4214:2: ':'
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
    // InternalPdfMk.g:4223:1: rule__TableDefinition__Group__2 : rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 ;
    public final void rule__TableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4227:1: ( rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3 )
            // InternalPdfMk.g:4228:2: rule__TableDefinition__Group__2__Impl rule__TableDefinition__Group__3
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
    // InternalPdfMk.g:4235:1: rule__TableDefinition__Group__2__Impl : ( ( rule__TableDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4239:1: ( ( ( rule__TableDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:4240:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:4240:1: ( ( rule__TableDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:4241:2: ( rule__TableDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:4242:2: ( rule__TableDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:4242:3: rule__TableDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:4250:1: rule__TableDefinition__Group__3 : rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 ;
    public final void rule__TableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4254:1: ( rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4 )
            // InternalPdfMk.g:4255:2: rule__TableDefinition__Group__3__Impl rule__TableDefinition__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:4262:1: rule__TableDefinition__Group__3__Impl : ( ( rule__TableDefinition__BodyAssignment_3 ) ) ;
    public final void rule__TableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4266:1: ( ( ( rule__TableDefinition__BodyAssignment_3 ) ) )
            // InternalPdfMk.g:4267:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            {
            // InternalPdfMk.g:4267:1: ( ( rule__TableDefinition__BodyAssignment_3 ) )
            // InternalPdfMk.g:4268:2: ( rule__TableDefinition__BodyAssignment_3 )
            {
             before(grammarAccess.getTableDefinitionAccess().getBodyAssignment_3()); 
            // InternalPdfMk.g:4269:2: ( rule__TableDefinition__BodyAssignment_3 )
            // InternalPdfMk.g:4269:3: rule__TableDefinition__BodyAssignment_3
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
    // InternalPdfMk.g:4277:1: rule__TableDefinition__Group__4 : rule__TableDefinition__Group__4__Impl ;
    public final void rule__TableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4281:1: ( rule__TableDefinition__Group__4__Impl )
            // InternalPdfMk.g:4282:2: rule__TableDefinition__Group__4__Impl
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
    // InternalPdfMk.g:4288:1: rule__TableDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__TableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4292:1: ( ( '}' ) )
            // InternalPdfMk.g:4293:1: ( '}' )
            {
            // InternalPdfMk.g:4293:1: ( '}' )
            // InternalPdfMk.g:4294:2: '}'
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
    // InternalPdfMk.g:4304:1: rule__TextObject__Group__0 : rule__TextObject__Group__0__Impl rule__TextObject__Group__1 ;
    public final void rule__TextObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4308:1: ( rule__TextObject__Group__0__Impl rule__TextObject__Group__1 )
            // InternalPdfMk.g:4309:2: rule__TextObject__Group__0__Impl rule__TextObject__Group__1
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
    // InternalPdfMk.g:4316:1: rule__TextObject__Group__0__Impl : ( ( rule__TextObject__ValueAssignment_0 ) ) ;
    public final void rule__TextObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4320:1: ( ( ( rule__TextObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:4321:1: ( ( rule__TextObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:4321:1: ( ( rule__TextObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:4322:2: ( rule__TextObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTextObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:4323:2: ( rule__TextObject__ValueAssignment_0 )
            // InternalPdfMk.g:4323:3: rule__TextObject__ValueAssignment_0
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
    // InternalPdfMk.g:4331:1: rule__TextObject__Group__1 : rule__TextObject__Group__1__Impl rule__TextObject__Group__2 ;
    public final void rule__TextObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4335:1: ( rule__TextObject__Group__1__Impl rule__TextObject__Group__2 )
            // InternalPdfMk.g:4336:2: rule__TextObject__Group__1__Impl rule__TextObject__Group__2
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
    // InternalPdfMk.g:4343:1: rule__TextObject__Group__1__Impl : ( ( rule__TextObject__TextAssignment_1 ) ) ;
    public final void rule__TextObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4347:1: ( ( ( rule__TextObject__TextAssignment_1 ) ) )
            // InternalPdfMk.g:4348:1: ( ( rule__TextObject__TextAssignment_1 ) )
            {
            // InternalPdfMk.g:4348:1: ( ( rule__TextObject__TextAssignment_1 ) )
            // InternalPdfMk.g:4349:2: ( rule__TextObject__TextAssignment_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTextAssignment_1()); 
            // InternalPdfMk.g:4350:2: ( rule__TextObject__TextAssignment_1 )
            // InternalPdfMk.g:4350:3: rule__TextObject__TextAssignment_1
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
    // InternalPdfMk.g:4358:1: rule__TextObject__Group__2 : rule__TextObject__Group__2__Impl rule__TextObject__Group__3 ;
    public final void rule__TextObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4362:1: ( rule__TextObject__Group__2__Impl rule__TextObject__Group__3 )
            // InternalPdfMk.g:4363:2: rule__TextObject__Group__2__Impl rule__TextObject__Group__3
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
    // InternalPdfMk.g:4370:1: rule__TextObject__Group__2__Impl : ( ( rule__TextObject__Group_2__0 )? ) ;
    public final void rule__TextObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4374:1: ( ( ( rule__TextObject__Group_2__0 )? ) )
            // InternalPdfMk.g:4375:1: ( ( rule__TextObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:4375:1: ( ( rule__TextObject__Group_2__0 )? )
            // InternalPdfMk.g:4376:2: ( rule__TextObject__Group_2__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:4377:2: ( rule__TextObject__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==27) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalPdfMk.g:4377:3: rule__TextObject__Group_2__0
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
    // InternalPdfMk.g:4385:1: rule__TextObject__Group__3 : rule__TextObject__Group__3__Impl rule__TextObject__Group__4 ;
    public final void rule__TextObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4389:1: ( rule__TextObject__Group__3__Impl rule__TextObject__Group__4 )
            // InternalPdfMk.g:4390:2: rule__TextObject__Group__3__Impl rule__TextObject__Group__4
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
    // InternalPdfMk.g:4397:1: rule__TextObject__Group__3__Impl : ( ( rule__TextObject__Group_3__0 )? ) ;
    public final void rule__TextObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4401:1: ( ( ( rule__TextObject__Group_3__0 )? ) )
            // InternalPdfMk.g:4402:1: ( ( rule__TextObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:4402:1: ( ( rule__TextObject__Group_3__0 )? )
            // InternalPdfMk.g:4403:2: ( rule__TextObject__Group_3__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:4404:2: ( rule__TextObject__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==29) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:4404:3: rule__TextObject__Group_3__0
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
    // InternalPdfMk.g:4412:1: rule__TextObject__Group__4 : rule__TextObject__Group__4__Impl rule__TextObject__Group__5 ;
    public final void rule__TextObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4416:1: ( rule__TextObject__Group__4__Impl rule__TextObject__Group__5 )
            // InternalPdfMk.g:4417:2: rule__TextObject__Group__4__Impl rule__TextObject__Group__5
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
    // InternalPdfMk.g:4424:1: rule__TextObject__Group__4__Impl : ( ( rule__TextObject__Group_4__0 )? ) ;
    public final void rule__TextObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4428:1: ( ( ( rule__TextObject__Group_4__0 )? ) )
            // InternalPdfMk.g:4429:1: ( ( rule__TextObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:4429:1: ( ( rule__TextObject__Group_4__0 )? )
            // InternalPdfMk.g:4430:2: ( rule__TextObject__Group_4__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:4431:2: ( rule__TextObject__Group_4__0 )?
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
                    // InternalPdfMk.g:4431:3: rule__TextObject__Group_4__0
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
    // InternalPdfMk.g:4439:1: rule__TextObject__Group__5 : rule__TextObject__Group__5__Impl rule__TextObject__Group__6 ;
    public final void rule__TextObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4443:1: ( rule__TextObject__Group__5__Impl rule__TextObject__Group__6 )
            // InternalPdfMk.g:4444:2: rule__TextObject__Group__5__Impl rule__TextObject__Group__6
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
    // InternalPdfMk.g:4451:1: rule__TextObject__Group__5__Impl : ( ( rule__TextObject__Group_5__0 )? ) ;
    public final void rule__TextObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4455:1: ( ( ( rule__TextObject__Group_5__0 )? ) )
            // InternalPdfMk.g:4456:1: ( ( rule__TextObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:4456:1: ( ( rule__TextObject__Group_5__0 )? )
            // InternalPdfMk.g:4457:2: ( rule__TextObject__Group_5__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:4458:2: ( rule__TextObject__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==26) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPdfMk.g:4458:3: rule__TextObject__Group_5__0
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
    // InternalPdfMk.g:4466:1: rule__TextObject__Group__6 : rule__TextObject__Group__6__Impl rule__TextObject__Group__7 ;
    public final void rule__TextObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4470:1: ( rule__TextObject__Group__6__Impl rule__TextObject__Group__7 )
            // InternalPdfMk.g:4471:2: rule__TextObject__Group__6__Impl rule__TextObject__Group__7
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
    // InternalPdfMk.g:4478:1: rule__TextObject__Group__6__Impl : ( ( rule__TextObject__Group_6__0 )? ) ;
    public final void rule__TextObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4482:1: ( ( ( rule__TextObject__Group_6__0 )? ) )
            // InternalPdfMk.g:4483:1: ( ( rule__TextObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:4483:1: ( ( rule__TextObject__Group_6__0 )? )
            // InternalPdfMk.g:4484:2: ( rule__TextObject__Group_6__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:4485:2: ( rule__TextObject__Group_6__0 )?
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
                    // InternalPdfMk.g:4485:3: rule__TextObject__Group_6__0
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
    // InternalPdfMk.g:4493:1: rule__TextObject__Group__7 : rule__TextObject__Group__7__Impl rule__TextObject__Group__8 ;
    public final void rule__TextObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4497:1: ( rule__TextObject__Group__7__Impl rule__TextObject__Group__8 )
            // InternalPdfMk.g:4498:2: rule__TextObject__Group__7__Impl rule__TextObject__Group__8
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
    // InternalPdfMk.g:4505:1: rule__TextObject__Group__7__Impl : ( ( rule__TextObject__Group_7__0 )? ) ;
    public final void rule__TextObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4509:1: ( ( ( rule__TextObject__Group_7__0 )? ) )
            // InternalPdfMk.g:4510:1: ( ( rule__TextObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:4510:1: ( ( rule__TextObject__Group_7__0 )? )
            // InternalPdfMk.g:4511:2: ( rule__TextObject__Group_7__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:4512:2: ( rule__TextObject__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==30) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:4512:3: rule__TextObject__Group_7__0
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
    // InternalPdfMk.g:4520:1: rule__TextObject__Group__8 : rule__TextObject__Group__8__Impl rule__TextObject__Group__9 ;
    public final void rule__TextObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4524:1: ( rule__TextObject__Group__8__Impl rule__TextObject__Group__9 )
            // InternalPdfMk.g:4525:2: rule__TextObject__Group__8__Impl rule__TextObject__Group__9
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
    // InternalPdfMk.g:4532:1: rule__TextObject__Group__8__Impl : ( ( rule__TextObject__Group_8__0 )? ) ;
    public final void rule__TextObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4536:1: ( ( ( rule__TextObject__Group_8__0 )? ) )
            // InternalPdfMk.g:4537:1: ( ( rule__TextObject__Group_8__0 )? )
            {
            // InternalPdfMk.g:4537:1: ( ( rule__TextObject__Group_8__0 )? )
            // InternalPdfMk.g:4538:2: ( rule__TextObject__Group_8__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_8()); 
            // InternalPdfMk.g:4539:2: ( rule__TextObject__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==32) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalPdfMk.g:4539:3: rule__TextObject__Group_8__0
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
    // InternalPdfMk.g:4547:1: rule__TextObject__Group__9 : rule__TextObject__Group__9__Impl rule__TextObject__Group__10 ;
    public final void rule__TextObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4551:1: ( rule__TextObject__Group__9__Impl rule__TextObject__Group__10 )
            // InternalPdfMk.g:4552:2: rule__TextObject__Group__9__Impl rule__TextObject__Group__10
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
    // InternalPdfMk.g:4559:1: rule__TextObject__Group__9__Impl : ( ( rule__TextObject__Group_9__0 )? ) ;
    public final void rule__TextObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4563:1: ( ( ( rule__TextObject__Group_9__0 )? ) )
            // InternalPdfMk.g:4564:1: ( ( rule__TextObject__Group_9__0 )? )
            {
            // InternalPdfMk.g:4564:1: ( ( rule__TextObject__Group_9__0 )? )
            // InternalPdfMk.g:4565:2: ( rule__TextObject__Group_9__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_9()); 
            // InternalPdfMk.g:4566:2: ( rule__TextObject__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPdfMk.g:4566:3: rule__TextObject__Group_9__0
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
    // InternalPdfMk.g:4574:1: rule__TextObject__Group__10 : rule__TextObject__Group__10__Impl ;
    public final void rule__TextObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4578:1: ( rule__TextObject__Group__10__Impl )
            // InternalPdfMk.g:4579:2: rule__TextObject__Group__10__Impl
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
    // InternalPdfMk.g:4585:1: rule__TextObject__Group__10__Impl : ( '}' ) ;
    public final void rule__TextObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4589:1: ( ( '}' ) )
            // InternalPdfMk.g:4590:1: ( '}' )
            {
            // InternalPdfMk.g:4590:1: ( '}' )
            // InternalPdfMk.g:4591:2: '}'
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
    // InternalPdfMk.g:4601:1: rule__TextObject__Group_2__0 : rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 ;
    public final void rule__TextObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4605:1: ( rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 )
            // InternalPdfMk.g:4606:2: rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1
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
    // InternalPdfMk.g:4613:1: rule__TextObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4617:1: ( ( ',' ) )
            // InternalPdfMk.g:4618:1: ( ',' )
            {
            // InternalPdfMk.g:4618:1: ( ',' )
            // InternalPdfMk.g:4619:2: ','
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
    // InternalPdfMk.g:4628:1: rule__TextObject__Group_2__1 : rule__TextObject__Group_2__1__Impl ;
    public final void rule__TextObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4632:1: ( rule__TextObject__Group_2__1__Impl )
            // InternalPdfMk.g:4633:2: rule__TextObject__Group_2__1__Impl
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
    // InternalPdfMk.g:4639:1: rule__TextObject__Group_2__1__Impl : ( ( rule__TextObject__StyleAssignment_2_1 ) ) ;
    public final void rule__TextObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4643:1: ( ( ( rule__TextObject__StyleAssignment_2_1 ) ) )
            // InternalPdfMk.g:4644:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            {
            // InternalPdfMk.g:4644:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            // InternalPdfMk.g:4645:2: ( rule__TextObject__StyleAssignment_2_1 )
            {
             before(grammarAccess.getTextObjectAccess().getStyleAssignment_2_1()); 
            // InternalPdfMk.g:4646:2: ( rule__TextObject__StyleAssignment_2_1 )
            // InternalPdfMk.g:4646:3: rule__TextObject__StyleAssignment_2_1
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
    // InternalPdfMk.g:4655:1: rule__TextObject__Group_3__0 : rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 ;
    public final void rule__TextObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4659:1: ( rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 )
            // InternalPdfMk.g:4660:2: rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1
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
    // InternalPdfMk.g:4667:1: rule__TextObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4671:1: ( ( ',' ) )
            // InternalPdfMk.g:4672:1: ( ',' )
            {
            // InternalPdfMk.g:4672:1: ( ',' )
            // InternalPdfMk.g:4673:2: ','
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
    // InternalPdfMk.g:4682:1: rule__TextObject__Group_3__1 : rule__TextObject__Group_3__1__Impl ;
    public final void rule__TextObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4686:1: ( rule__TextObject__Group_3__1__Impl )
            // InternalPdfMk.g:4687:2: rule__TextObject__Group_3__1__Impl
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
    // InternalPdfMk.g:4693:1: rule__TextObject__Group_3__1__Impl : ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) ;
    public final void rule__TextObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4697:1: ( ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) )
            // InternalPdfMk.g:4698:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            {
            // InternalPdfMk.g:4698:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            // InternalPdfMk.g:4699:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            {
             before(grammarAccess.getTextObjectAccess().getFontSizeAssignment_3_1()); 
            // InternalPdfMk.g:4700:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            // InternalPdfMk.g:4700:3: rule__TextObject__FontSizeAssignment_3_1
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
    // InternalPdfMk.g:4709:1: rule__TextObject__Group_4__0 : rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 ;
    public final void rule__TextObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4713:1: ( rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 )
            // InternalPdfMk.g:4714:2: rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1
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
    // InternalPdfMk.g:4721:1: rule__TextObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4725:1: ( ( ',' ) )
            // InternalPdfMk.g:4726:1: ( ',' )
            {
            // InternalPdfMk.g:4726:1: ( ',' )
            // InternalPdfMk.g:4727:2: ','
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
    // InternalPdfMk.g:4736:1: rule__TextObject__Group_4__1 : rule__TextObject__Group_4__1__Impl ;
    public final void rule__TextObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4740:1: ( rule__TextObject__Group_4__1__Impl )
            // InternalPdfMk.g:4741:2: rule__TextObject__Group_4__1__Impl
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
    // InternalPdfMk.g:4747:1: rule__TextObject__Group_4__1__Impl : ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) ;
    public final void rule__TextObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4751:1: ( ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) )
            // InternalPdfMk.g:4752:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            {
            // InternalPdfMk.g:4752:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            // InternalPdfMk.g:4753:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            {
             before(grammarAccess.getTextObjectAccess().getAlignmentAssignment_4_1()); 
            // InternalPdfMk.g:4754:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            // InternalPdfMk.g:4754:3: rule__TextObject__AlignmentAssignment_4_1
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
    // InternalPdfMk.g:4763:1: rule__TextObject__Group_5__0 : rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 ;
    public final void rule__TextObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4767:1: ( rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 )
            // InternalPdfMk.g:4768:2: rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1
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
    // InternalPdfMk.g:4775:1: rule__TextObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4779:1: ( ( ',' ) )
            // InternalPdfMk.g:4780:1: ( ',' )
            {
            // InternalPdfMk.g:4780:1: ( ',' )
            // InternalPdfMk.g:4781:2: ','
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
    // InternalPdfMk.g:4790:1: rule__TextObject__Group_5__1 : rule__TextObject__Group_5__1__Impl ;
    public final void rule__TextObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4794:1: ( rule__TextObject__Group_5__1__Impl )
            // InternalPdfMk.g:4795:2: rule__TextObject__Group_5__1__Impl
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
    // InternalPdfMk.g:4801:1: rule__TextObject__Group_5__1__Impl : ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) ;
    public final void rule__TextObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4805:1: ( ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) )
            // InternalPdfMk.g:4806:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            {
            // InternalPdfMk.g:4806:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            // InternalPdfMk.g:4807:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTypeFaceAssignment_5_1()); 
            // InternalPdfMk.g:4808:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            // InternalPdfMk.g:4808:3: rule__TextObject__TypeFaceAssignment_5_1
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
    // InternalPdfMk.g:4817:1: rule__TextObject__Group_6__0 : rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 ;
    public final void rule__TextObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4821:1: ( rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 )
            // InternalPdfMk.g:4822:2: rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1
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
    // InternalPdfMk.g:4829:1: rule__TextObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4833:1: ( ( ',' ) )
            // InternalPdfMk.g:4834:1: ( ',' )
            {
            // InternalPdfMk.g:4834:1: ( ',' )
            // InternalPdfMk.g:4835:2: ','
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
    // InternalPdfMk.g:4844:1: rule__TextObject__Group_6__1 : rule__TextObject__Group_6__1__Impl ;
    public final void rule__TextObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4848:1: ( rule__TextObject__Group_6__1__Impl )
            // InternalPdfMk.g:4849:2: rule__TextObject__Group_6__1__Impl
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
    // InternalPdfMk.g:4855:1: rule__TextObject__Group_6__1__Impl : ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__TextObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4859:1: ( ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:4860:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:4860:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:4861:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getTextObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:4862:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:4862:3: rule__TextObject__ItalicsAssignment_6_1
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
    // InternalPdfMk.g:4871:1: rule__TextObject__Group_7__0 : rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1 ;
    public final void rule__TextObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4875:1: ( rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1 )
            // InternalPdfMk.g:4876:2: rule__TextObject__Group_7__0__Impl rule__TextObject__Group_7__1
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
    // InternalPdfMk.g:4883:1: rule__TextObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4887:1: ( ( ',' ) )
            // InternalPdfMk.g:4888:1: ( ',' )
            {
            // InternalPdfMk.g:4888:1: ( ',' )
            // InternalPdfMk.g:4889:2: ','
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
    // InternalPdfMk.g:4898:1: rule__TextObject__Group_7__1 : rule__TextObject__Group_7__1__Impl ;
    public final void rule__TextObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4902:1: ( rule__TextObject__Group_7__1__Impl )
            // InternalPdfMk.g:4903:2: rule__TextObject__Group_7__1__Impl
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
    // InternalPdfMk.g:4909:1: rule__TextObject__Group_7__1__Impl : ( ( rule__TextObject__WidthAssignment_7_1 ) ) ;
    public final void rule__TextObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4913:1: ( ( ( rule__TextObject__WidthAssignment_7_1 ) ) )
            // InternalPdfMk.g:4914:1: ( ( rule__TextObject__WidthAssignment_7_1 ) )
            {
            // InternalPdfMk.g:4914:1: ( ( rule__TextObject__WidthAssignment_7_1 ) )
            // InternalPdfMk.g:4915:2: ( rule__TextObject__WidthAssignment_7_1 )
            {
             before(grammarAccess.getTextObjectAccess().getWidthAssignment_7_1()); 
            // InternalPdfMk.g:4916:2: ( rule__TextObject__WidthAssignment_7_1 )
            // InternalPdfMk.g:4916:3: rule__TextObject__WidthAssignment_7_1
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
    // InternalPdfMk.g:4925:1: rule__TextObject__Group_8__0 : rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1 ;
    public final void rule__TextObject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4929:1: ( rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1 )
            // InternalPdfMk.g:4930:2: rule__TextObject__Group_8__0__Impl rule__TextObject__Group_8__1
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
    // InternalPdfMk.g:4937:1: rule__TextObject__Group_8__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4941:1: ( ( ',' ) )
            // InternalPdfMk.g:4942:1: ( ',' )
            {
            // InternalPdfMk.g:4942:1: ( ',' )
            // InternalPdfMk.g:4943:2: ','
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
    // InternalPdfMk.g:4952:1: rule__TextObject__Group_8__1 : rule__TextObject__Group_8__1__Impl ;
    public final void rule__TextObject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4956:1: ( rule__TextObject__Group_8__1__Impl )
            // InternalPdfMk.g:4957:2: rule__TextObject__Group_8__1__Impl
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
    // InternalPdfMk.g:4963:1: rule__TextObject__Group_8__1__Impl : ( ( rule__TextObject__MarginAssignment_8_1 ) ) ;
    public final void rule__TextObject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4967:1: ( ( ( rule__TextObject__MarginAssignment_8_1 ) ) )
            // InternalPdfMk.g:4968:1: ( ( rule__TextObject__MarginAssignment_8_1 ) )
            {
            // InternalPdfMk.g:4968:1: ( ( rule__TextObject__MarginAssignment_8_1 ) )
            // InternalPdfMk.g:4969:2: ( rule__TextObject__MarginAssignment_8_1 )
            {
             before(grammarAccess.getTextObjectAccess().getMarginAssignment_8_1()); 
            // InternalPdfMk.g:4970:2: ( rule__TextObject__MarginAssignment_8_1 )
            // InternalPdfMk.g:4970:3: rule__TextObject__MarginAssignment_8_1
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
    // InternalPdfMk.g:4979:1: rule__TextObject__Group_9__0 : rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1 ;
    public final void rule__TextObject__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4983:1: ( rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1 )
            // InternalPdfMk.g:4984:2: rule__TextObject__Group_9__0__Impl rule__TextObject__Group_9__1
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
    // InternalPdfMk.g:4991:1: rule__TextObject__Group_9__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:4995:1: ( ( ',' ) )
            // InternalPdfMk.g:4996:1: ( ',' )
            {
            // InternalPdfMk.g:4996:1: ( ',' )
            // InternalPdfMk.g:4997:2: ','
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
    // InternalPdfMk.g:5006:1: rule__TextObject__Group_9__1 : rule__TextObject__Group_9__1__Impl ;
    public final void rule__TextObject__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5010:1: ( rule__TextObject__Group_9__1__Impl )
            // InternalPdfMk.g:5011:2: rule__TextObject__Group_9__1__Impl
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
    // InternalPdfMk.g:5017:1: rule__TextObject__Group_9__1__Impl : ( ( rule__TextObject__ListCounterAssignment_9_1 ) ) ;
    public final void rule__TextObject__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5021:1: ( ( ( rule__TextObject__ListCounterAssignment_9_1 ) ) )
            // InternalPdfMk.g:5022:1: ( ( rule__TextObject__ListCounterAssignment_9_1 ) )
            {
            // InternalPdfMk.g:5022:1: ( ( rule__TextObject__ListCounterAssignment_9_1 ) )
            // InternalPdfMk.g:5023:2: ( rule__TextObject__ListCounterAssignment_9_1 )
            {
             before(grammarAccess.getTextObjectAccess().getListCounterAssignment_9_1()); 
            // InternalPdfMk.g:5024:2: ( rule__TextObject__ListCounterAssignment_9_1 )
            // InternalPdfMk.g:5024:3: rule__TextObject__ListCounterAssignment_9_1
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
    // InternalPdfMk.g:5033:1: rule__StyleObject__Group__0 : rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 ;
    public final void rule__StyleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5037:1: ( rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 )
            // InternalPdfMk.g:5038:2: rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1
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
    // InternalPdfMk.g:5045:1: rule__StyleObject__Group__0__Impl : ( ( rule__StyleObject__KeyAssignment_0 ) ) ;
    public final void rule__StyleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5049:1: ( ( ( rule__StyleObject__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:5050:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:5050:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            // InternalPdfMk.g:5051:2: ( rule__StyleObject__KeyAssignment_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:5052:2: ( rule__StyleObject__KeyAssignment_0 )
            // InternalPdfMk.g:5052:3: rule__StyleObject__KeyAssignment_0
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
    // InternalPdfMk.g:5060:1: rule__StyleObject__Group__1 : rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 ;
    public final void rule__StyleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5064:1: ( rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 )
            // InternalPdfMk.g:5065:2: rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2
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
    // InternalPdfMk.g:5072:1: rule__StyleObject__Group__1__Impl : ( ':' ) ;
    public final void rule__StyleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5076:1: ( ( ':' ) )
            // InternalPdfMk.g:5077:1: ( ':' )
            {
            // InternalPdfMk.g:5077:1: ( ':' )
            // InternalPdfMk.g:5078:2: ':'
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
    // InternalPdfMk.g:5087:1: rule__StyleObject__Group__2 : rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 ;
    public final void rule__StyleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5091:1: ( rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 )
            // InternalPdfMk.g:5092:2: rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3
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
    // InternalPdfMk.g:5099:1: rule__StyleObject__Group__2__Impl : ( ( rule__StyleObject__ValueAssignment_2 ) ) ;
    public final void rule__StyleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5103:1: ( ( ( rule__StyleObject__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:5104:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:5104:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            // InternalPdfMk.g:5105:2: ( rule__StyleObject__ValueAssignment_2 )
            {
             before(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:5106:2: ( rule__StyleObject__ValueAssignment_2 )
            // InternalPdfMk.g:5106:3: rule__StyleObject__ValueAssignment_2
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
    // InternalPdfMk.g:5114:1: rule__StyleObject__Group__3 : rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 ;
    public final void rule__StyleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5118:1: ( rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 )
            // InternalPdfMk.g:5119:2: rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4
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
    // InternalPdfMk.g:5126:1: rule__StyleObject__Group__3__Impl : ( ( rule__StyleObject__FontSizeAssignment_3 )? ) ;
    public final void rule__StyleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5130:1: ( ( ( rule__StyleObject__FontSizeAssignment_3 )? ) )
            // InternalPdfMk.g:5131:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            {
            // InternalPdfMk.g:5131:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            // InternalPdfMk.g:5132:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            {
             before(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3()); 
            // InternalPdfMk.g:5133:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPdfMk.g:5133:3: rule__StyleObject__FontSizeAssignment_3
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
    // InternalPdfMk.g:5141:1: rule__StyleObject__Group__4 : rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 ;
    public final void rule__StyleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5145:1: ( rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 )
            // InternalPdfMk.g:5146:2: rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5
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
    // InternalPdfMk.g:5153:1: rule__StyleObject__Group__4__Impl : ( ( rule__StyleObject__Group_4__0 )? ) ;
    public final void rule__StyleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5157:1: ( ( ( rule__StyleObject__Group_4__0 )? ) )
            // InternalPdfMk.g:5158:1: ( ( rule__StyleObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:5158:1: ( ( rule__StyleObject__Group_4__0 )? )
            // InternalPdfMk.g:5159:2: ( rule__StyleObject__Group_4__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:5160:2: ( rule__StyleObject__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==26) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalPdfMk.g:5160:3: rule__StyleObject__Group_4__0
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
    // InternalPdfMk.g:5168:1: rule__StyleObject__Group__5 : rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 ;
    public final void rule__StyleObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5172:1: ( rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 )
            // InternalPdfMk.g:5173:2: rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6
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
    // InternalPdfMk.g:5180:1: rule__StyleObject__Group__5__Impl : ( ( rule__StyleObject__Group_5__0 )? ) ;
    public final void rule__StyleObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5184:1: ( ( ( rule__StyleObject__Group_5__0 )? ) )
            // InternalPdfMk.g:5185:1: ( ( rule__StyleObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:5185:1: ( ( rule__StyleObject__Group_5__0 )? )
            // InternalPdfMk.g:5186:2: ( rule__StyleObject__Group_5__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:5187:2: ( rule__StyleObject__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==25) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:5187:3: rule__StyleObject__Group_5__0
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
    // InternalPdfMk.g:5195:1: rule__StyleObject__Group__6 : rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 ;
    public final void rule__StyleObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5199:1: ( rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 )
            // InternalPdfMk.g:5200:2: rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7
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
    // InternalPdfMk.g:5207:1: rule__StyleObject__Group__6__Impl : ( ( rule__StyleObject__Group_6__0 )? ) ;
    public final void rule__StyleObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5211:1: ( ( ( rule__StyleObject__Group_6__0 )? ) )
            // InternalPdfMk.g:5212:1: ( ( rule__StyleObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:5212:1: ( ( rule__StyleObject__Group_6__0 )? )
            // InternalPdfMk.g:5213:2: ( rule__StyleObject__Group_6__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:5214:2: ( rule__StyleObject__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==28) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalPdfMk.g:5214:3: rule__StyleObject__Group_6__0
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
    // InternalPdfMk.g:5222:1: rule__StyleObject__Group__7 : rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 ;
    public final void rule__StyleObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5226:1: ( rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8 )
            // InternalPdfMk.g:5227:2: rule__StyleObject__Group__7__Impl rule__StyleObject__Group__8
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
    // InternalPdfMk.g:5234:1: rule__StyleObject__Group__7__Impl : ( ( rule__StyleObject__Group_7__0 )? ) ;
    public final void rule__StyleObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5238:1: ( ( ( rule__StyleObject__Group_7__0 )? ) )
            // InternalPdfMk.g:5239:1: ( ( rule__StyleObject__Group_7__0 )? )
            {
            // InternalPdfMk.g:5239:1: ( ( rule__StyleObject__Group_7__0 )? )
            // InternalPdfMk.g:5240:2: ( rule__StyleObject__Group_7__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_7()); 
            // InternalPdfMk.g:5241:2: ( rule__StyleObject__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPdfMk.g:5241:3: rule__StyleObject__Group_7__0
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
    // InternalPdfMk.g:5249:1: rule__StyleObject__Group__8 : rule__StyleObject__Group__8__Impl ;
    public final void rule__StyleObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5253:1: ( rule__StyleObject__Group__8__Impl )
            // InternalPdfMk.g:5254:2: rule__StyleObject__Group__8__Impl
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
    // InternalPdfMk.g:5260:1: rule__StyleObject__Group__8__Impl : ( '}' ) ;
    public final void rule__StyleObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5264:1: ( ( '}' ) )
            // InternalPdfMk.g:5265:1: ( '}' )
            {
            // InternalPdfMk.g:5265:1: ( '}' )
            // InternalPdfMk.g:5266:2: '}'
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
    // InternalPdfMk.g:5276:1: rule__StyleObject__Group_4__0 : rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 ;
    public final void rule__StyleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5280:1: ( rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 )
            // InternalPdfMk.g:5281:2: rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1
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
    // InternalPdfMk.g:5288:1: rule__StyleObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5292:1: ( ( ',' ) )
            // InternalPdfMk.g:5293:1: ( ',' )
            {
            // InternalPdfMk.g:5293:1: ( ',' )
            // InternalPdfMk.g:5294:2: ','
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
    // InternalPdfMk.g:5303:1: rule__StyleObject__Group_4__1 : rule__StyleObject__Group_4__1__Impl ;
    public final void rule__StyleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5307:1: ( rule__StyleObject__Group_4__1__Impl )
            // InternalPdfMk.g:5308:2: rule__StyleObject__Group_4__1__Impl
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
    // InternalPdfMk.g:5314:1: rule__StyleObject__Group_4__1__Impl : ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) ;
    public final void rule__StyleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5318:1: ( ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) )
            // InternalPdfMk.g:5319:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            {
            // InternalPdfMk.g:5319:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            // InternalPdfMk.g:5320:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1()); 
            // InternalPdfMk.g:5321:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            // InternalPdfMk.g:5321:3: rule__StyleObject__TypeFaceAssignment_4_1
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
    // InternalPdfMk.g:5330:1: rule__StyleObject__Group_5__0 : rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 ;
    public final void rule__StyleObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5334:1: ( rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 )
            // InternalPdfMk.g:5335:2: rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1
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
    // InternalPdfMk.g:5342:1: rule__StyleObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5346:1: ( ( ',' ) )
            // InternalPdfMk.g:5347:1: ( ',' )
            {
            // InternalPdfMk.g:5347:1: ( ',' )
            // InternalPdfMk.g:5348:2: ','
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
    // InternalPdfMk.g:5357:1: rule__StyleObject__Group_5__1 : rule__StyleObject__Group_5__1__Impl ;
    public final void rule__StyleObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5361:1: ( rule__StyleObject__Group_5__1__Impl )
            // InternalPdfMk.g:5362:2: rule__StyleObject__Group_5__1__Impl
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
    // InternalPdfMk.g:5368:1: rule__StyleObject__Group_5__1__Impl : ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) ;
    public final void rule__StyleObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5372:1: ( ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) )
            // InternalPdfMk.g:5373:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            {
            // InternalPdfMk.g:5373:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            // InternalPdfMk.g:5374:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1()); 
            // InternalPdfMk.g:5375:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            // InternalPdfMk.g:5375:3: rule__StyleObject__AlignmentAssignment_5_1
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
    // InternalPdfMk.g:5384:1: rule__StyleObject__Group_6__0 : rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 ;
    public final void rule__StyleObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5388:1: ( rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 )
            // InternalPdfMk.g:5389:2: rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1
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
    // InternalPdfMk.g:5396:1: rule__StyleObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5400:1: ( ( ',' ) )
            // InternalPdfMk.g:5401:1: ( ',' )
            {
            // InternalPdfMk.g:5401:1: ( ',' )
            // InternalPdfMk.g:5402:2: ','
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
    // InternalPdfMk.g:5411:1: rule__StyleObject__Group_6__1 : rule__StyleObject__Group_6__1__Impl ;
    public final void rule__StyleObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5415:1: ( rule__StyleObject__Group_6__1__Impl )
            // InternalPdfMk.g:5416:2: rule__StyleObject__Group_6__1__Impl
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
    // InternalPdfMk.g:5422:1: rule__StyleObject__Group_6__1__Impl : ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__StyleObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5426:1: ( ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:5427:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:5427:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:5428:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:5429:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:5429:3: rule__StyleObject__ItalicsAssignment_6_1
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
    // InternalPdfMk.g:5438:1: rule__StyleObject__Group_7__0 : rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 ;
    public final void rule__StyleObject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5442:1: ( rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1 )
            // InternalPdfMk.g:5443:2: rule__StyleObject__Group_7__0__Impl rule__StyleObject__Group_7__1
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
    // InternalPdfMk.g:5450:1: rule__StyleObject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5454:1: ( ( ',' ) )
            // InternalPdfMk.g:5455:1: ( ',' )
            {
            // InternalPdfMk.g:5455:1: ( ',' )
            // InternalPdfMk.g:5456:2: ','
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
    // InternalPdfMk.g:5465:1: rule__StyleObject__Group_7__1 : rule__StyleObject__Group_7__1__Impl ;
    public final void rule__StyleObject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5469:1: ( rule__StyleObject__Group_7__1__Impl )
            // InternalPdfMk.g:5470:2: rule__StyleObject__Group_7__1__Impl
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
    // InternalPdfMk.g:5476:1: rule__StyleObject__Group_7__1__Impl : ( ( rule__StyleObject__MarginAssignment_7_1 ) ) ;
    public final void rule__StyleObject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5480:1: ( ( ( rule__StyleObject__MarginAssignment_7_1 ) ) )
            // InternalPdfMk.g:5481:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            {
            // InternalPdfMk.g:5481:1: ( ( rule__StyleObject__MarginAssignment_7_1 ) )
            // InternalPdfMk.g:5482:2: ( rule__StyleObject__MarginAssignment_7_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getMarginAssignment_7_1()); 
            // InternalPdfMk.g:5483:2: ( rule__StyleObject__MarginAssignment_7_1 )
            // InternalPdfMk.g:5483:3: rule__StyleObject__MarginAssignment_7_1
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
    // InternalPdfMk.g:5492:1: rule__StyleObjects__Group__0 : rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 ;
    public final void rule__StyleObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5496:1: ( rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 )
            // InternalPdfMk.g:5497:2: rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1
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
    // InternalPdfMk.g:5504:1: rule__StyleObjects__Group__0__Impl : ( '{' ) ;
    public final void rule__StyleObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5508:1: ( ( '{' ) )
            // InternalPdfMk.g:5509:1: ( '{' )
            {
            // InternalPdfMk.g:5509:1: ( '{' )
            // InternalPdfMk.g:5510:2: '{'
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
    // InternalPdfMk.g:5519:1: rule__StyleObjects__Group__1 : rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 ;
    public final void rule__StyleObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5523:1: ( rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 )
            // InternalPdfMk.g:5524:2: rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2
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
    // InternalPdfMk.g:5531:1: rule__StyleObjects__Group__1__Impl : ( ( rule__StyleObjects__Group_1__0 ) ) ;
    public final void rule__StyleObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5535:1: ( ( ( rule__StyleObjects__Group_1__0 ) ) )
            // InternalPdfMk.g:5536:1: ( ( rule__StyleObjects__Group_1__0 ) )
            {
            // InternalPdfMk.g:5536:1: ( ( rule__StyleObjects__Group_1__0 ) )
            // InternalPdfMk.g:5537:2: ( rule__StyleObjects__Group_1__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:5538:2: ( rule__StyleObjects__Group_1__0 )
            // InternalPdfMk.g:5538:3: rule__StyleObjects__Group_1__0
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
    // InternalPdfMk.g:5546:1: rule__StyleObjects__Group__2 : rule__StyleObjects__Group__2__Impl ;
    public final void rule__StyleObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5550:1: ( rule__StyleObjects__Group__2__Impl )
            // InternalPdfMk.g:5551:2: rule__StyleObjects__Group__2__Impl
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
    // InternalPdfMk.g:5557:1: rule__StyleObjects__Group__2__Impl : ( '}' ) ;
    public final void rule__StyleObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5561:1: ( ( '}' ) )
            // InternalPdfMk.g:5562:1: ( '}' )
            {
            // InternalPdfMk.g:5562:1: ( '}' )
            // InternalPdfMk.g:5563:2: '}'
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
    // InternalPdfMk.g:5573:1: rule__StyleObjects__Group_1__0 : rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 ;
    public final void rule__StyleObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5577:1: ( rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1 )
            // InternalPdfMk.g:5578:2: rule__StyleObjects__Group_1__0__Impl rule__StyleObjects__Group_1__1
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
    // InternalPdfMk.g:5585:1: rule__StyleObjects__Group_1__0__Impl : ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__StyleObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5589:1: ( ( ( rule__StyleObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:5590:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:5590:1: ( ( rule__StyleObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:5591:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:5592:2: ( rule__StyleObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:5592:3: rule__StyleObjects__ValueAssignment_1_0
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
    // InternalPdfMk.g:5600:1: rule__StyleObjects__Group_1__1 : rule__StyleObjects__Group_1__1__Impl ;
    public final void rule__StyleObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5604:1: ( rule__StyleObjects__Group_1__1__Impl )
            // InternalPdfMk.g:5605:2: rule__StyleObjects__Group_1__1__Impl
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
    // InternalPdfMk.g:5611:1: rule__StyleObjects__Group_1__1__Impl : ( ( rule__StyleObjects__Group_1_1__0 )* ) ;
    public final void rule__StyleObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5615:1: ( ( ( rule__StyleObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5616:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5616:1: ( ( rule__StyleObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:5617:2: ( rule__StyleObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5618:2: ( rule__StyleObjects__Group_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPdfMk.g:5618:3: rule__StyleObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__StyleObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPdfMk.g:5627:1: rule__StyleObjects__Group_1_1__0 : rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 ;
    public final void rule__StyleObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5631:1: ( rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1 )
            // InternalPdfMk.g:5632:2: rule__StyleObjects__Group_1_1__0__Impl rule__StyleObjects__Group_1_1__1
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
    // InternalPdfMk.g:5639:1: rule__StyleObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__StyleObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5643:1: ( ( ',' ) )
            // InternalPdfMk.g:5644:1: ( ',' )
            {
            // InternalPdfMk.g:5644:1: ( ',' )
            // InternalPdfMk.g:5645:2: ','
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
    // InternalPdfMk.g:5654:1: rule__StyleObjects__Group_1_1__1 : rule__StyleObjects__Group_1_1__1__Impl ;
    public final void rule__StyleObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5658:1: ( rule__StyleObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:5659:2: rule__StyleObjects__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5665:1: rule__StyleObjects__Group_1_1__1__Impl : ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__StyleObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5669:1: ( ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5670:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5670:1: ( ( rule__StyleObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:5671:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:5672:2: ( rule__StyleObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:5672:3: rule__StyleObjects__ValueAssignment_1_1_1
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
    // InternalPdfMk.g:5681:1: rule__InnerColumnObject__Group__0 : rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 ;
    public final void rule__InnerColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5685:1: ( rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1 )
            // InternalPdfMk.g:5686:2: rule__InnerColumnObject__Group__0__Impl rule__InnerColumnObject__Group__1
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
    // InternalPdfMk.g:5693:1: rule__InnerColumnObject__Group__0__Impl : ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__InnerColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5697:1: ( ( ( rule__InnerColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:5698:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:5698:1: ( ( rule__InnerColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:5699:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:5700:2: ( rule__InnerColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:5700:3: rule__InnerColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:5708:1: rule__InnerColumnObject__Group__1 : rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 ;
    public final void rule__InnerColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5712:1: ( rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2 )
            // InternalPdfMk.g:5713:2: rule__InnerColumnObject__Group__1__Impl rule__InnerColumnObject__Group__2
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
    // InternalPdfMk.g:5720:1: rule__InnerColumnObject__Group__1__Impl : ( ( rule__InnerColumnObject__Group_1__0 ) ) ;
    public final void rule__InnerColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5724:1: ( ( ( rule__InnerColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:5725:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:5725:1: ( ( rule__InnerColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:5726:2: ( rule__InnerColumnObject__Group_1__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:5727:2: ( rule__InnerColumnObject__Group_1__0 )
            // InternalPdfMk.g:5727:3: rule__InnerColumnObject__Group_1__0
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
    // InternalPdfMk.g:5735:1: rule__InnerColumnObject__Group__2 : rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 ;
    public final void rule__InnerColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5739:1: ( rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3 )
            // InternalPdfMk.g:5740:2: rule__InnerColumnObject__Group__2__Impl rule__InnerColumnObject__Group__3
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
    // InternalPdfMk.g:5747:1: rule__InnerColumnObject__Group__2__Impl : ( ( rule__InnerColumnObject__Group_2__0 ) ) ;
    public final void rule__InnerColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5751:1: ( ( ( rule__InnerColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:5752:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:5752:1: ( ( rule__InnerColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:5753:2: ( rule__InnerColumnObject__Group_2__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:5754:2: ( rule__InnerColumnObject__Group_2__0 )
            // InternalPdfMk.g:5754:3: rule__InnerColumnObject__Group_2__0
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
    // InternalPdfMk.g:5762:1: rule__InnerColumnObject__Group__3 : rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 ;
    public final void rule__InnerColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5766:1: ( rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4 )
            // InternalPdfMk.g:5767:2: rule__InnerColumnObject__Group__3__Impl rule__InnerColumnObject__Group__4
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
    // InternalPdfMk.g:5774:1: rule__InnerColumnObject__Group__3__Impl : ( ( rule__InnerColumnObject__Group_3__0 ) ) ;
    public final void rule__InnerColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5778:1: ( ( ( rule__InnerColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:5779:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:5779:1: ( ( rule__InnerColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:5780:2: ( rule__InnerColumnObject__Group_3__0 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:5781:2: ( rule__InnerColumnObject__Group_3__0 )
            // InternalPdfMk.g:5781:3: rule__InnerColumnObject__Group_3__0
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
    // InternalPdfMk.g:5789:1: rule__InnerColumnObject__Group__4 : rule__InnerColumnObject__Group__4__Impl ;
    public final void rule__InnerColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5793:1: ( rule__InnerColumnObject__Group__4__Impl )
            // InternalPdfMk.g:5794:2: rule__InnerColumnObject__Group__4__Impl
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
    // InternalPdfMk.g:5800:1: rule__InnerColumnObject__Group__4__Impl : ( ']' ) ;
    public final void rule__InnerColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5804:1: ( ( ']' ) )
            // InternalPdfMk.g:5805:1: ( ']' )
            {
            // InternalPdfMk.g:5805:1: ( ']' )
            // InternalPdfMk.g:5806:2: ']'
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
    // InternalPdfMk.g:5816:1: rule__InnerColumnObject__Group_1__0 : rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 ;
    public final void rule__InnerColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5820:1: ( rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1 )
            // InternalPdfMk.g:5821:2: rule__InnerColumnObject__Group_1__0__Impl rule__InnerColumnObject__Group_1__1
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
    // InternalPdfMk.g:5828:1: rule__InnerColumnObject__Group_1__0__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__InnerColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5832:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:5833:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:5833:1: ( ( rule__InnerColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:5834:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:5835:2: ( rule__InnerColumnObject__TextAssignment_1_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPdfMk.g:5835:3: rule__InnerColumnObject__TextAssignment_1_0
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
    // InternalPdfMk.g:5843:1: rule__InnerColumnObject__Group_1__1 : rule__InnerColumnObject__Group_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5847:1: ( rule__InnerColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:5848:2: rule__InnerColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:5854:1: rule__InnerColumnObject__Group_1__1__Impl : ( ( rule__InnerColumnObject__Group_1_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5858:1: ( ( ( rule__InnerColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:5859:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:5859:1: ( ( rule__InnerColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:5860:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:5861:2: ( rule__InnerColumnObject__Group_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==RULE_STRING) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalPdfMk.g:5861:3: rule__InnerColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPdfMk.g:5870:1: rule__InnerColumnObject__Group_1_1__0 : rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 ;
    public final void rule__InnerColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5874:1: ( rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:5875:2: rule__InnerColumnObject__Group_1_1__0__Impl rule__InnerColumnObject__Group_1_1__1
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
    // InternalPdfMk.g:5882:1: rule__InnerColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5886:1: ( ( ',' ) )
            // InternalPdfMk.g:5887:1: ( ',' )
            {
            // InternalPdfMk.g:5887:1: ( ',' )
            // InternalPdfMk.g:5888:2: ','
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
    // InternalPdfMk.g:5897:1: rule__InnerColumnObject__Group_1_1__1 : rule__InnerColumnObject__Group_1_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5901:1: ( rule__InnerColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:5902:2: rule__InnerColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:5908:1: rule__InnerColumnObject__Group_1_1__1__Impl : ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5912:1: ( ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:5913:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:5913:1: ( ( rule__InnerColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:5914:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:5915:2: ( rule__InnerColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:5915:3: rule__InnerColumnObject__TextAssignment_1_1_1
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
    // InternalPdfMk.g:5924:1: rule__InnerColumnObject__Group_2__0 : rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 ;
    public final void rule__InnerColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5928:1: ( rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1 )
            // InternalPdfMk.g:5929:2: rule__InnerColumnObject__Group_2__0__Impl rule__InnerColumnObject__Group_2__1
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
    // InternalPdfMk.g:5936:1: rule__InnerColumnObject__Group_2__0__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__InnerColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5940:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:5941:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:5941:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:5942:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:5943:2: ( rule__InnerColumnObject__TextObjectAssignment_2_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1>=22 && LA31_1<=23)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalPdfMk.g:5943:3: rule__InnerColumnObject__TextObjectAssignment_2_0
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
    // InternalPdfMk.g:5951:1: rule__InnerColumnObject__Group_2__1 : rule__InnerColumnObject__Group_2__1__Impl ;
    public final void rule__InnerColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5955:1: ( rule__InnerColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:5956:2: rule__InnerColumnObject__Group_2__1__Impl
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
    // InternalPdfMk.g:5962:1: rule__InnerColumnObject__Group_2__1__Impl : ( ( rule__InnerColumnObject__Group_2_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5966:1: ( ( ( rule__InnerColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:5967:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:5967:1: ( ( rule__InnerColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:5968:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:5969:2: ( rule__InnerColumnObject__Group_2_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==18) ) {
                        int LA32_3 = input.LA(3);

                        if ( ((LA32_3>=22 && LA32_3<=23)) ) {
                            alt32=1;
                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalPdfMk.g:5969:3: rule__InnerColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPdfMk.g:5978:1: rule__InnerColumnObject__Group_2_1__0 : rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 ;
    public final void rule__InnerColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5982:1: ( rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:5983:2: rule__InnerColumnObject__Group_2_1__0__Impl rule__InnerColumnObject__Group_2_1__1
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
    // InternalPdfMk.g:5990:1: rule__InnerColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:5994:1: ( ( ',' ) )
            // InternalPdfMk.g:5995:1: ( ',' )
            {
            // InternalPdfMk.g:5995:1: ( ',' )
            // InternalPdfMk.g:5996:2: ','
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
    // InternalPdfMk.g:6005:1: rule__InnerColumnObject__Group_2_1__1 : rule__InnerColumnObject__Group_2_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6009:1: ( rule__InnerColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:6010:2: rule__InnerColumnObject__Group_2_1__1__Impl
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
    // InternalPdfMk.g:6016:1: rule__InnerColumnObject__Group_2_1__1__Impl : ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6020:1: ( ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:6021:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:6021:1: ( ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:6022:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:6023:2: ( rule__InnerColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:6023:3: rule__InnerColumnObject__TextObjectAssignment_2_1_1
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
    // InternalPdfMk.g:6032:1: rule__InnerColumnObject__Group_3__0 : rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 ;
    public final void rule__InnerColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6036:1: ( rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1 )
            // InternalPdfMk.g:6037:2: rule__InnerColumnObject__Group_3__0__Impl rule__InnerColumnObject__Group_3__1
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
    // InternalPdfMk.g:6044:1: rule__InnerColumnObject__Group_3__0__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__InnerColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6048:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:6049:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:6049:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:6050:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:6051:2: ( rule__InnerColumnObject__ColumnAssignment_3_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPdfMk.g:6051:3: rule__InnerColumnObject__ColumnAssignment_3_0
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
    // InternalPdfMk.g:6059:1: rule__InnerColumnObject__Group_3__1 : rule__InnerColumnObject__Group_3__1__Impl ;
    public final void rule__InnerColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6063:1: ( rule__InnerColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:6064:2: rule__InnerColumnObject__Group_3__1__Impl
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
    // InternalPdfMk.g:6070:1: rule__InnerColumnObject__Group_3__1__Impl : ( ( rule__InnerColumnObject__Group_3_1__0 )* ) ;
    public final void rule__InnerColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6074:1: ( ( ( rule__InnerColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:6075:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:6075:1: ( ( rule__InnerColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:6076:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getInnerColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:6077:2: ( rule__InnerColumnObject__Group_3_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPdfMk.g:6077:3: rule__InnerColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalPdfMk.g:6086:1: rule__InnerColumnObject__Group_3_1__0 : rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 ;
    public final void rule__InnerColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6090:1: ( rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:6091:2: rule__InnerColumnObject__Group_3_1__0__Impl rule__InnerColumnObject__Group_3_1__1
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
    // InternalPdfMk.g:6098:1: rule__InnerColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__InnerColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6102:1: ( ( ',' ) )
            // InternalPdfMk.g:6103:1: ( ',' )
            {
            // InternalPdfMk.g:6103:1: ( ',' )
            // InternalPdfMk.g:6104:2: ','
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
    // InternalPdfMk.g:6113:1: rule__InnerColumnObject__Group_3_1__1 : rule__InnerColumnObject__Group_3_1__1__Impl ;
    public final void rule__InnerColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6117:1: ( rule__InnerColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:6118:2: rule__InnerColumnObject__Group_3_1__1__Impl
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
    // InternalPdfMk.g:6124:1: rule__InnerColumnObject__Group_3_1__1__Impl : ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__InnerColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6128:1: ( ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:6129:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:6129:1: ( ( rule__InnerColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:6130:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:6131:2: ( rule__InnerColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:6131:3: rule__InnerColumnObject__ColumnAssignment_3_1_1
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
    // InternalPdfMk.g:6140:1: rule__ColumnObject__Group__0 : rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 ;
    public final void rule__ColumnObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6144:1: ( rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1 )
            // InternalPdfMk.g:6145:2: rule__ColumnObject__Group__0__Impl rule__ColumnObject__Group__1
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
    // InternalPdfMk.g:6152:1: rule__ColumnObject__Group__0__Impl : ( ( rule__ColumnObject__ValueAssignment_0 ) ) ;
    public final void rule__ColumnObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6156:1: ( ( ( rule__ColumnObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6157:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6157:1: ( ( rule__ColumnObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6158:2: ( rule__ColumnObject__ValueAssignment_0 )
            {
             before(grammarAccess.getColumnObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6159:2: ( rule__ColumnObject__ValueAssignment_0 )
            // InternalPdfMk.g:6159:3: rule__ColumnObject__ValueAssignment_0
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
    // InternalPdfMk.g:6167:1: rule__ColumnObject__Group__1 : rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 ;
    public final void rule__ColumnObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6171:1: ( rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2 )
            // InternalPdfMk.g:6172:2: rule__ColumnObject__Group__1__Impl rule__ColumnObject__Group__2
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
    // InternalPdfMk.g:6179:1: rule__ColumnObject__Group__1__Impl : ( ( rule__ColumnObject__Group_1__0 ) ) ;
    public final void rule__ColumnObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6183:1: ( ( ( rule__ColumnObject__Group_1__0 ) ) )
            // InternalPdfMk.g:6184:1: ( ( rule__ColumnObject__Group_1__0 ) )
            {
            // InternalPdfMk.g:6184:1: ( ( rule__ColumnObject__Group_1__0 ) )
            // InternalPdfMk.g:6185:2: ( rule__ColumnObject__Group_1__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:6186:2: ( rule__ColumnObject__Group_1__0 )
            // InternalPdfMk.g:6186:3: rule__ColumnObject__Group_1__0
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
    // InternalPdfMk.g:6194:1: rule__ColumnObject__Group__2 : rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 ;
    public final void rule__ColumnObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6198:1: ( rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3 )
            // InternalPdfMk.g:6199:2: rule__ColumnObject__Group__2__Impl rule__ColumnObject__Group__3
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
    // InternalPdfMk.g:6206:1: rule__ColumnObject__Group__2__Impl : ( ( rule__ColumnObject__Group_2__0 ) ) ;
    public final void rule__ColumnObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6210:1: ( ( ( rule__ColumnObject__Group_2__0 ) ) )
            // InternalPdfMk.g:6211:1: ( ( rule__ColumnObject__Group_2__0 ) )
            {
            // InternalPdfMk.g:6211:1: ( ( rule__ColumnObject__Group_2__0 ) )
            // InternalPdfMk.g:6212:2: ( rule__ColumnObject__Group_2__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:6213:2: ( rule__ColumnObject__Group_2__0 )
            // InternalPdfMk.g:6213:3: rule__ColumnObject__Group_2__0
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
    // InternalPdfMk.g:6221:1: rule__ColumnObject__Group__3 : rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 ;
    public final void rule__ColumnObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6225:1: ( rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4 )
            // InternalPdfMk.g:6226:2: rule__ColumnObject__Group__3__Impl rule__ColumnObject__Group__4
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
    // InternalPdfMk.g:6233:1: rule__ColumnObject__Group__3__Impl : ( ( rule__ColumnObject__Group_3__0 ) ) ;
    public final void rule__ColumnObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6237:1: ( ( ( rule__ColumnObject__Group_3__0 ) ) )
            // InternalPdfMk.g:6238:1: ( ( rule__ColumnObject__Group_3__0 ) )
            {
            // InternalPdfMk.g:6238:1: ( ( rule__ColumnObject__Group_3__0 ) )
            // InternalPdfMk.g:6239:2: ( rule__ColumnObject__Group_3__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:6240:2: ( rule__ColumnObject__Group_3__0 )
            // InternalPdfMk.g:6240:3: rule__ColumnObject__Group_3__0
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
    // InternalPdfMk.g:6248:1: rule__ColumnObject__Group__4 : rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 ;
    public final void rule__ColumnObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6252:1: ( rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5 )
            // InternalPdfMk.g:6253:2: rule__ColumnObject__Group__4__Impl rule__ColumnObject__Group__5
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
    // InternalPdfMk.g:6260:1: rule__ColumnObject__Group__4__Impl : ( ( rule__ColumnObject__Group_4__0 ) ) ;
    public final void rule__ColumnObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6264:1: ( ( ( rule__ColumnObject__Group_4__0 ) ) )
            // InternalPdfMk.g:6265:1: ( ( rule__ColumnObject__Group_4__0 ) )
            {
            // InternalPdfMk.g:6265:1: ( ( rule__ColumnObject__Group_4__0 ) )
            // InternalPdfMk.g:6266:2: ( rule__ColumnObject__Group_4__0 )
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:6267:2: ( rule__ColumnObject__Group_4__0 )
            // InternalPdfMk.g:6267:3: rule__ColumnObject__Group_4__0
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
    // InternalPdfMk.g:6275:1: rule__ColumnObject__Group__5 : rule__ColumnObject__Group__5__Impl ;
    public final void rule__ColumnObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6279:1: ( rule__ColumnObject__Group__5__Impl )
            // InternalPdfMk.g:6280:2: rule__ColumnObject__Group__5__Impl
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
    // InternalPdfMk.g:6286:1: rule__ColumnObject__Group__5__Impl : ( ']' ) ;
    public final void rule__ColumnObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6290:1: ( ( ']' ) )
            // InternalPdfMk.g:6291:1: ( ']' )
            {
            // InternalPdfMk.g:6291:1: ( ']' )
            // InternalPdfMk.g:6292:2: ']'
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
    // InternalPdfMk.g:6302:1: rule__ColumnObject__Group_1__0 : rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 ;
    public final void rule__ColumnObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6306:1: ( rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1 )
            // InternalPdfMk.g:6307:2: rule__ColumnObject__Group_1__0__Impl rule__ColumnObject__Group_1__1
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
    // InternalPdfMk.g:6314:1: rule__ColumnObject__Group_1__0__Impl : ( ( rule__ColumnObject__TextAssignment_1_0 )? ) ;
    public final void rule__ColumnObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6318:1: ( ( ( rule__ColumnObject__TextAssignment_1_0 )? ) )
            // InternalPdfMk.g:6319:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            {
            // InternalPdfMk.g:6319:1: ( ( rule__ColumnObject__TextAssignment_1_0 )? )
            // InternalPdfMk.g:6320:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_0()); 
            // InternalPdfMk.g:6321:2: ( rule__ColumnObject__TextAssignment_1_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPdfMk.g:6321:3: rule__ColumnObject__TextAssignment_1_0
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
    // InternalPdfMk.g:6329:1: rule__ColumnObject__Group_1__1 : rule__ColumnObject__Group_1__1__Impl ;
    public final void rule__ColumnObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6333:1: ( rule__ColumnObject__Group_1__1__Impl )
            // InternalPdfMk.g:6334:2: rule__ColumnObject__Group_1__1__Impl
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
    // InternalPdfMk.g:6340:1: rule__ColumnObject__Group_1__1__Impl : ( ( rule__ColumnObject__Group_1_1__0 )* ) ;
    public final void rule__ColumnObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6344:1: ( ( ( rule__ColumnObject__Group_1_1__0 )* ) )
            // InternalPdfMk.g:6345:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:6345:1: ( ( rule__ColumnObject__Group_1_1__0 )* )
            // InternalPdfMk.g:6346:2: ( rule__ColumnObject__Group_1_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_1_1()); 
            // InternalPdfMk.g:6347:2: ( rule__ColumnObject__Group_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==20) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_STRING) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalPdfMk.g:6347:3: rule__ColumnObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPdfMk.g:6356:1: rule__ColumnObject__Group_1_1__0 : rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 ;
    public final void rule__ColumnObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6360:1: ( rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1 )
            // InternalPdfMk.g:6361:2: rule__ColumnObject__Group_1_1__0__Impl rule__ColumnObject__Group_1_1__1
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
    // InternalPdfMk.g:6368:1: rule__ColumnObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6372:1: ( ( ',' ) )
            // InternalPdfMk.g:6373:1: ( ',' )
            {
            // InternalPdfMk.g:6373:1: ( ',' )
            // InternalPdfMk.g:6374:2: ','
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
    // InternalPdfMk.g:6383:1: rule__ColumnObject__Group_1_1__1 : rule__ColumnObject__Group_1_1__1__Impl ;
    public final void rule__ColumnObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6387:1: ( rule__ColumnObject__Group_1_1__1__Impl )
            // InternalPdfMk.g:6388:2: rule__ColumnObject__Group_1_1__1__Impl
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
    // InternalPdfMk.g:6394:1: rule__ColumnObject__Group_1_1__1__Impl : ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) ;
    public final void rule__ColumnObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6398:1: ( ( ( rule__ColumnObject__TextAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:6399:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:6399:1: ( ( rule__ColumnObject__TextAssignment_1_1_1 ) )
            // InternalPdfMk.g:6400:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextAssignment_1_1_1()); 
            // InternalPdfMk.g:6401:2: ( rule__ColumnObject__TextAssignment_1_1_1 )
            // InternalPdfMk.g:6401:3: rule__ColumnObject__TextAssignment_1_1_1
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
    // InternalPdfMk.g:6410:1: rule__ColumnObject__Group_2__0 : rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 ;
    public final void rule__ColumnObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6414:1: ( rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1 )
            // InternalPdfMk.g:6415:2: rule__ColumnObject__Group_2__0__Impl rule__ColumnObject__Group_2__1
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
    // InternalPdfMk.g:6422:1: rule__ColumnObject__Group_2__0__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) ;
    public final void rule__ColumnObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6426:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? ) )
            // InternalPdfMk.g:6427:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            {
            // InternalPdfMk.g:6427:1: ( ( rule__ColumnObject__TextObjectAssignment_2_0 )? )
            // InternalPdfMk.g:6428:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_0()); 
            // InternalPdfMk.g:6429:2: ( rule__ColumnObject__TextObjectAssignment_2_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=22 && LA37_1<=23)) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalPdfMk.g:6429:3: rule__ColumnObject__TextObjectAssignment_2_0
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
    // InternalPdfMk.g:6437:1: rule__ColumnObject__Group_2__1 : rule__ColumnObject__Group_2__1__Impl ;
    public final void rule__ColumnObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6441:1: ( rule__ColumnObject__Group_2__1__Impl )
            // InternalPdfMk.g:6442:2: rule__ColumnObject__Group_2__1__Impl
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
    // InternalPdfMk.g:6448:1: rule__ColumnObject__Group_2__1__Impl : ( ( rule__ColumnObject__Group_2_1__0 )* ) ;
    public final void rule__ColumnObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6452:1: ( ( ( rule__ColumnObject__Group_2_1__0 )* ) )
            // InternalPdfMk.g:6453:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            {
            // InternalPdfMk.g:6453:1: ( ( rule__ColumnObject__Group_2_1__0 )* )
            // InternalPdfMk.g:6454:2: ( rule__ColumnObject__Group_2_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_2_1()); 
            // InternalPdfMk.g:6455:2: ( rule__ColumnObject__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==18) ) {
                        int LA38_3 = input.LA(3);

                        if ( ((LA38_3>=22 && LA38_3<=23)) ) {
                            alt38=1;
                        }


                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalPdfMk.g:6455:3: rule__ColumnObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalPdfMk.g:6464:1: rule__ColumnObject__Group_2_1__0 : rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 ;
    public final void rule__ColumnObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6468:1: ( rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1 )
            // InternalPdfMk.g:6469:2: rule__ColumnObject__Group_2_1__0__Impl rule__ColumnObject__Group_2_1__1
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
    // InternalPdfMk.g:6476:1: rule__ColumnObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6480:1: ( ( ',' ) )
            // InternalPdfMk.g:6481:1: ( ',' )
            {
            // InternalPdfMk.g:6481:1: ( ',' )
            // InternalPdfMk.g:6482:2: ','
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
    // InternalPdfMk.g:6491:1: rule__ColumnObject__Group_2_1__1 : rule__ColumnObject__Group_2_1__1__Impl ;
    public final void rule__ColumnObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6495:1: ( rule__ColumnObject__Group_2_1__1__Impl )
            // InternalPdfMk.g:6496:2: rule__ColumnObject__Group_2_1__1__Impl
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
    // InternalPdfMk.g:6502:1: rule__ColumnObject__Group_2_1__1__Impl : ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) ;
    public final void rule__ColumnObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6506:1: ( ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) ) )
            // InternalPdfMk.g:6507:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            {
            // InternalPdfMk.g:6507:1: ( ( rule__ColumnObject__TextObjectAssignment_2_1_1 ) )
            // InternalPdfMk.g:6508:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getTextObjectAssignment_2_1_1()); 
            // InternalPdfMk.g:6509:2: ( rule__ColumnObject__TextObjectAssignment_2_1_1 )
            // InternalPdfMk.g:6509:3: rule__ColumnObject__TextObjectAssignment_2_1_1
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
    // InternalPdfMk.g:6518:1: rule__ColumnObject__Group_3__0 : rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 ;
    public final void rule__ColumnObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6522:1: ( rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1 )
            // InternalPdfMk.g:6523:2: rule__ColumnObject__Group_3__0__Impl rule__ColumnObject__Group_3__1
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
    // InternalPdfMk.g:6530:1: rule__ColumnObject__Group_3__0__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) ;
    public final void rule__ColumnObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6534:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_0 )? ) )
            // InternalPdfMk.g:6535:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            {
            // InternalPdfMk.g:6535:1: ( ( rule__ColumnObject__ColumnAssignment_3_0 )? )
            // InternalPdfMk.g:6536:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_0()); 
            // InternalPdfMk.g:6537:2: ( rule__ColumnObject__ColumnAssignment_3_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:6537:3: rule__ColumnObject__ColumnAssignment_3_0
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
    // InternalPdfMk.g:6545:1: rule__ColumnObject__Group_3__1 : rule__ColumnObject__Group_3__1__Impl ;
    public final void rule__ColumnObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6549:1: ( rule__ColumnObject__Group_3__1__Impl )
            // InternalPdfMk.g:6550:2: rule__ColumnObject__Group_3__1__Impl
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
    // InternalPdfMk.g:6556:1: rule__ColumnObject__Group_3__1__Impl : ( ( rule__ColumnObject__Group_3_1__0 )* ) ;
    public final void rule__ColumnObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6560:1: ( ( ( rule__ColumnObject__Group_3_1__0 )* ) )
            // InternalPdfMk.g:6561:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            {
            // InternalPdfMk.g:6561:1: ( ( rule__ColumnObject__Group_3_1__0 )* )
            // InternalPdfMk.g:6562:2: ( rule__ColumnObject__Group_3_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_3_1()); 
            // InternalPdfMk.g:6563:2: ( rule__ColumnObject__Group_3_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==18) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalPdfMk.g:6563:3: rule__ColumnObject__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalPdfMk.g:6572:1: rule__ColumnObject__Group_3_1__0 : rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 ;
    public final void rule__ColumnObject__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6576:1: ( rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1 )
            // InternalPdfMk.g:6577:2: rule__ColumnObject__Group_3_1__0__Impl rule__ColumnObject__Group_3_1__1
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
    // InternalPdfMk.g:6584:1: rule__ColumnObject__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6588:1: ( ( ',' ) )
            // InternalPdfMk.g:6589:1: ( ',' )
            {
            // InternalPdfMk.g:6589:1: ( ',' )
            // InternalPdfMk.g:6590:2: ','
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
    // InternalPdfMk.g:6599:1: rule__ColumnObject__Group_3_1__1 : rule__ColumnObject__Group_3_1__1__Impl ;
    public final void rule__ColumnObject__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6603:1: ( rule__ColumnObject__Group_3_1__1__Impl )
            // InternalPdfMk.g:6604:2: rule__ColumnObject__Group_3_1__1__Impl
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
    // InternalPdfMk.g:6610:1: rule__ColumnObject__Group_3_1__1__Impl : ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) ;
    public final void rule__ColumnObject__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6614:1: ( ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) ) )
            // InternalPdfMk.g:6615:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            {
            // InternalPdfMk.g:6615:1: ( ( rule__ColumnObject__ColumnAssignment_3_1_1 ) )
            // InternalPdfMk.g:6616:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getColumnAssignment_3_1_1()); 
            // InternalPdfMk.g:6617:2: ( rule__ColumnObject__ColumnAssignment_3_1_1 )
            // InternalPdfMk.g:6617:3: rule__ColumnObject__ColumnAssignment_3_1_1
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
    // InternalPdfMk.g:6626:1: rule__ColumnObject__Group_4__0 : rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 ;
    public final void rule__ColumnObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6630:1: ( rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1 )
            // InternalPdfMk.g:6631:2: rule__ColumnObject__Group_4__0__Impl rule__ColumnObject__Group_4__1
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
    // InternalPdfMk.g:6638:1: rule__ColumnObject__Group_4__0__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) ;
    public final void rule__ColumnObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6642:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? ) )
            // InternalPdfMk.g:6643:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            {
            // InternalPdfMk.g:6643:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_0 )? )
            // InternalPdfMk.g:6644:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_0()); 
            // InternalPdfMk.g:6645:2: ( rule__ColumnObject__InnerColumnAssignment_4_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPdfMk.g:6645:3: rule__ColumnObject__InnerColumnAssignment_4_0
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
    // InternalPdfMk.g:6653:1: rule__ColumnObject__Group_4__1 : rule__ColumnObject__Group_4__1__Impl ;
    public final void rule__ColumnObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6657:1: ( rule__ColumnObject__Group_4__1__Impl )
            // InternalPdfMk.g:6658:2: rule__ColumnObject__Group_4__1__Impl
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
    // InternalPdfMk.g:6664:1: rule__ColumnObject__Group_4__1__Impl : ( ( rule__ColumnObject__Group_4_1__0 )* ) ;
    public final void rule__ColumnObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6668:1: ( ( ( rule__ColumnObject__Group_4_1__0 )* ) )
            // InternalPdfMk.g:6669:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            {
            // InternalPdfMk.g:6669:1: ( ( rule__ColumnObject__Group_4_1__0 )* )
            // InternalPdfMk.g:6670:2: ( rule__ColumnObject__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnObjectAccess().getGroup_4_1()); 
            // InternalPdfMk.g:6671:2: ( rule__ColumnObject__Group_4_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPdfMk.g:6671:3: rule__ColumnObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColumnObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalPdfMk.g:6680:1: rule__ColumnObject__Group_4_1__0 : rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 ;
    public final void rule__ColumnObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6684:1: ( rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1 )
            // InternalPdfMk.g:6685:2: rule__ColumnObject__Group_4_1__0__Impl rule__ColumnObject__Group_4_1__1
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
    // InternalPdfMk.g:6692:1: rule__ColumnObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ColumnObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6696:1: ( ( ',' ) )
            // InternalPdfMk.g:6697:1: ( ',' )
            {
            // InternalPdfMk.g:6697:1: ( ',' )
            // InternalPdfMk.g:6698:2: ','
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
    // InternalPdfMk.g:6707:1: rule__ColumnObject__Group_4_1__1 : rule__ColumnObject__Group_4_1__1__Impl ;
    public final void rule__ColumnObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6711:1: ( rule__ColumnObject__Group_4_1__1__Impl )
            // InternalPdfMk.g:6712:2: rule__ColumnObject__Group_4_1__1__Impl
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
    // InternalPdfMk.g:6718:1: rule__ColumnObject__Group_4_1__1__Impl : ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) ;
    public final void rule__ColumnObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6722:1: ( ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) ) )
            // InternalPdfMk.g:6723:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            {
            // InternalPdfMk.g:6723:1: ( ( rule__ColumnObject__InnerColumnAssignment_4_1_1 ) )
            // InternalPdfMk.g:6724:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnObjectAccess().getInnerColumnAssignment_4_1_1()); 
            // InternalPdfMk.g:6725:2: ( rule__ColumnObject__InnerColumnAssignment_4_1_1 )
            // InternalPdfMk.g:6725:3: rule__ColumnObject__InnerColumnAssignment_4_1_1
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
    // InternalPdfMk.g:6734:1: rule__ImageObject__Group__0 : rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 ;
    public final void rule__ImageObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6738:1: ( rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1 )
            // InternalPdfMk.g:6739:2: rule__ImageObject__Group__0__Impl rule__ImageObject__Group__1
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
    // InternalPdfMk.g:6746:1: rule__ImageObject__Group__0__Impl : ( ( rule__ImageObject__ValueAssignment_0 ) ) ;
    public final void rule__ImageObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6750:1: ( ( ( rule__ImageObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:6751:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:6751:1: ( ( rule__ImageObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:6752:2: ( rule__ImageObject__ValueAssignment_0 )
            {
             before(grammarAccess.getImageObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:6753:2: ( rule__ImageObject__ValueAssignment_0 )
            // InternalPdfMk.g:6753:3: rule__ImageObject__ValueAssignment_0
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
    // InternalPdfMk.g:6761:1: rule__ImageObject__Group__1 : rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 ;
    public final void rule__ImageObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6765:1: ( rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2 )
            // InternalPdfMk.g:6766:2: rule__ImageObject__Group__1__Impl rule__ImageObject__Group__2
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
    // InternalPdfMk.g:6773:1: rule__ImageObject__Group__1__Impl : ( ( rule__ImageObject__ImageAssignment_1 )? ) ;
    public final void rule__ImageObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6777:1: ( ( ( rule__ImageObject__ImageAssignment_1 )? ) )
            // InternalPdfMk.g:6778:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            {
            // InternalPdfMk.g:6778:1: ( ( rule__ImageObject__ImageAssignment_1 )? )
            // InternalPdfMk.g:6779:2: ( rule__ImageObject__ImageAssignment_1 )?
            {
             before(grammarAccess.getImageObjectAccess().getImageAssignment_1()); 
            // InternalPdfMk.g:6780:2: ( rule__ImageObject__ImageAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPdfMk.g:6780:3: rule__ImageObject__ImageAssignment_1
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
    // InternalPdfMk.g:6788:1: rule__ImageObject__Group__2 : rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 ;
    public final void rule__ImageObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6792:1: ( rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3 )
            // InternalPdfMk.g:6793:2: rule__ImageObject__Group__2__Impl rule__ImageObject__Group__3
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
    // InternalPdfMk.g:6800:1: rule__ImageObject__Group__2__Impl : ( ( rule__ImageObject__Group_2__0 )? ) ;
    public final void rule__ImageObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6804:1: ( ( ( rule__ImageObject__Group_2__0 )? ) )
            // InternalPdfMk.g:6805:1: ( ( rule__ImageObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:6805:1: ( ( rule__ImageObject__Group_2__0 )? )
            // InternalPdfMk.g:6806:2: ( rule__ImageObject__Group_2__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:6807:2: ( rule__ImageObject__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==30) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalPdfMk.g:6807:3: rule__ImageObject__Group_2__0
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
    // InternalPdfMk.g:6815:1: rule__ImageObject__Group__3 : rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 ;
    public final void rule__ImageObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6819:1: ( rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4 )
            // InternalPdfMk.g:6820:2: rule__ImageObject__Group__3__Impl rule__ImageObject__Group__4
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
    // InternalPdfMk.g:6827:1: rule__ImageObject__Group__3__Impl : ( ( rule__ImageObject__Group_3__0 )? ) ;
    public final void rule__ImageObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6831:1: ( ( ( rule__ImageObject__Group_3__0 )? ) )
            // InternalPdfMk.g:6832:1: ( ( rule__ImageObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:6832:1: ( ( rule__ImageObject__Group_3__0 )? )
            // InternalPdfMk.g:6833:2: ( rule__ImageObject__Group_3__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:6834:2: ( rule__ImageObject__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==34) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalPdfMk.g:6834:3: rule__ImageObject__Group_3__0
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
    // InternalPdfMk.g:6842:1: rule__ImageObject__Group__4 : rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 ;
    public final void rule__ImageObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6846:1: ( rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5 )
            // InternalPdfMk.g:6847:2: rule__ImageObject__Group__4__Impl rule__ImageObject__Group__5
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
    // InternalPdfMk.g:6854:1: rule__ImageObject__Group__4__Impl : ( ( rule__ImageObject__Group_4__0 )? ) ;
    public final void rule__ImageObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6858:1: ( ( ( rule__ImageObject__Group_4__0 )? ) )
            // InternalPdfMk.g:6859:1: ( ( rule__ImageObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:6859:1: ( ( rule__ImageObject__Group_4__0 )? )
            // InternalPdfMk.g:6860:2: ( rule__ImageObject__Group_4__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:6861:2: ( rule__ImageObject__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==37) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalPdfMk.g:6861:3: rule__ImageObject__Group_4__0
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
    // InternalPdfMk.g:6869:1: rule__ImageObject__Group__5 : rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 ;
    public final void rule__ImageObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6873:1: ( rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6 )
            // InternalPdfMk.g:6874:2: rule__ImageObject__Group__5__Impl rule__ImageObject__Group__6
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
    // InternalPdfMk.g:6881:1: rule__ImageObject__Group__5__Impl : ( ( rule__ImageObject__Group_5__0 )? ) ;
    public final void rule__ImageObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6885:1: ( ( ( rule__ImageObject__Group_5__0 )? ) )
            // InternalPdfMk.g:6886:1: ( ( rule__ImageObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:6886:1: ( ( rule__ImageObject__Group_5__0 )? )
            // InternalPdfMk.g:6887:2: ( rule__ImageObject__Group_5__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:6888:2: ( rule__ImageObject__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==36) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalPdfMk.g:6888:3: rule__ImageObject__Group_5__0
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
    // InternalPdfMk.g:6896:1: rule__ImageObject__Group__6 : rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 ;
    public final void rule__ImageObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6900:1: ( rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7 )
            // InternalPdfMk.g:6901:2: rule__ImageObject__Group__6__Impl rule__ImageObject__Group__7
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
    // InternalPdfMk.g:6908:1: rule__ImageObject__Group__6__Impl : ( ( rule__ImageObject__Group_6__0 )? ) ;
    public final void rule__ImageObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6912:1: ( ( ( rule__ImageObject__Group_6__0 )? ) )
            // InternalPdfMk.g:6913:1: ( ( rule__ImageObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:6913:1: ( ( rule__ImageObject__Group_6__0 )? )
            // InternalPdfMk.g:6914:2: ( rule__ImageObject__Group_6__0 )?
            {
             before(grammarAccess.getImageObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:6915:2: ( rule__ImageObject__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==20) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPdfMk.g:6915:3: rule__ImageObject__Group_6__0
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
    // InternalPdfMk.g:6923:1: rule__ImageObject__Group__7 : rule__ImageObject__Group__7__Impl ;
    public final void rule__ImageObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6927:1: ( rule__ImageObject__Group__7__Impl )
            // InternalPdfMk.g:6928:2: rule__ImageObject__Group__7__Impl
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
    // InternalPdfMk.g:6934:1: rule__ImageObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ImageObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6938:1: ( ( '}' ) )
            // InternalPdfMk.g:6939:1: ( '}' )
            {
            // InternalPdfMk.g:6939:1: ( '}' )
            // InternalPdfMk.g:6940:2: '}'
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
    // InternalPdfMk.g:6950:1: rule__ImageObject__Group_2__0 : rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 ;
    public final void rule__ImageObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6954:1: ( rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1 )
            // InternalPdfMk.g:6955:2: rule__ImageObject__Group_2__0__Impl rule__ImageObject__Group_2__1
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
    // InternalPdfMk.g:6962:1: rule__ImageObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6966:1: ( ( ',' ) )
            // InternalPdfMk.g:6967:1: ( ',' )
            {
            // InternalPdfMk.g:6967:1: ( ',' )
            // InternalPdfMk.g:6968:2: ','
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
    // InternalPdfMk.g:6977:1: rule__ImageObject__Group_2__1 : rule__ImageObject__Group_2__1__Impl ;
    public final void rule__ImageObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6981:1: ( rule__ImageObject__Group_2__1__Impl )
            // InternalPdfMk.g:6982:2: rule__ImageObject__Group_2__1__Impl
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
    // InternalPdfMk.g:6988:1: rule__ImageObject__Group_2__1__Impl : ( ( rule__ImageObject__WidthAssignment_2_1 ) ) ;
    public final void rule__ImageObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:6992:1: ( ( ( rule__ImageObject__WidthAssignment_2_1 ) ) )
            // InternalPdfMk.g:6993:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            {
            // InternalPdfMk.g:6993:1: ( ( rule__ImageObject__WidthAssignment_2_1 ) )
            // InternalPdfMk.g:6994:2: ( rule__ImageObject__WidthAssignment_2_1 )
            {
             before(grammarAccess.getImageObjectAccess().getWidthAssignment_2_1()); 
            // InternalPdfMk.g:6995:2: ( rule__ImageObject__WidthAssignment_2_1 )
            // InternalPdfMk.g:6995:3: rule__ImageObject__WidthAssignment_2_1
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
    // InternalPdfMk.g:7004:1: rule__ImageObject__Group_3__0 : rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 ;
    public final void rule__ImageObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7008:1: ( rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1 )
            // InternalPdfMk.g:7009:2: rule__ImageObject__Group_3__0__Impl rule__ImageObject__Group_3__1
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
    // InternalPdfMk.g:7016:1: rule__ImageObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7020:1: ( ( ',' ) )
            // InternalPdfMk.g:7021:1: ( ',' )
            {
            // InternalPdfMk.g:7021:1: ( ',' )
            // InternalPdfMk.g:7022:2: ','
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
    // InternalPdfMk.g:7031:1: rule__ImageObject__Group_3__1 : rule__ImageObject__Group_3__1__Impl ;
    public final void rule__ImageObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7035:1: ( rule__ImageObject__Group_3__1__Impl )
            // InternalPdfMk.g:7036:2: rule__ImageObject__Group_3__1__Impl
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
    // InternalPdfMk.g:7042:1: rule__ImageObject__Group_3__1__Impl : ( ( rule__ImageObject__HeightAssignment_3_1 ) ) ;
    public final void rule__ImageObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7046:1: ( ( ( rule__ImageObject__HeightAssignment_3_1 ) ) )
            // InternalPdfMk.g:7047:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            {
            // InternalPdfMk.g:7047:1: ( ( rule__ImageObject__HeightAssignment_3_1 ) )
            // InternalPdfMk.g:7048:2: ( rule__ImageObject__HeightAssignment_3_1 )
            {
             before(grammarAccess.getImageObjectAccess().getHeightAssignment_3_1()); 
            // InternalPdfMk.g:7049:2: ( rule__ImageObject__HeightAssignment_3_1 )
            // InternalPdfMk.g:7049:3: rule__ImageObject__HeightAssignment_3_1
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
    // InternalPdfMk.g:7058:1: rule__ImageObject__Group_4__0 : rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 ;
    public final void rule__ImageObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7062:1: ( rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1 )
            // InternalPdfMk.g:7063:2: rule__ImageObject__Group_4__0__Impl rule__ImageObject__Group_4__1
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
    // InternalPdfMk.g:7070:1: rule__ImageObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7074:1: ( ( ',' ) )
            // InternalPdfMk.g:7075:1: ( ',' )
            {
            // InternalPdfMk.g:7075:1: ( ',' )
            // InternalPdfMk.g:7076:2: ','
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
    // InternalPdfMk.g:7085:1: rule__ImageObject__Group_4__1 : rule__ImageObject__Group_4__1__Impl ;
    public final void rule__ImageObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7089:1: ( rule__ImageObject__Group_4__1__Impl )
            // InternalPdfMk.g:7090:2: rule__ImageObject__Group_4__1__Impl
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
    // InternalPdfMk.g:7096:1: rule__ImageObject__Group_4__1__Impl : ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) ;
    public final void rule__ImageObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7100:1: ( ( ( rule__ImageObject__OpacityAssignment_4_1 ) ) )
            // InternalPdfMk.g:7101:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            {
            // InternalPdfMk.g:7101:1: ( ( rule__ImageObject__OpacityAssignment_4_1 ) )
            // InternalPdfMk.g:7102:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            {
             before(grammarAccess.getImageObjectAccess().getOpacityAssignment_4_1()); 
            // InternalPdfMk.g:7103:2: ( rule__ImageObject__OpacityAssignment_4_1 )
            // InternalPdfMk.g:7103:3: rule__ImageObject__OpacityAssignment_4_1
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
    // InternalPdfMk.g:7112:1: rule__ImageObject__Group_5__0 : rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 ;
    public final void rule__ImageObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7116:1: ( rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1 )
            // InternalPdfMk.g:7117:2: rule__ImageObject__Group_5__0__Impl rule__ImageObject__Group_5__1
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
    // InternalPdfMk.g:7124:1: rule__ImageObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7128:1: ( ( ',' ) )
            // InternalPdfMk.g:7129:1: ( ',' )
            {
            // InternalPdfMk.g:7129:1: ( ',' )
            // InternalPdfMk.g:7130:2: ','
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
    // InternalPdfMk.g:7139:1: rule__ImageObject__Group_5__1 : rule__ImageObject__Group_5__1__Impl ;
    public final void rule__ImageObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7143:1: ( rule__ImageObject__Group_5__1__Impl )
            // InternalPdfMk.g:7144:2: rule__ImageObject__Group_5__1__Impl
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
    // InternalPdfMk.g:7150:1: rule__ImageObject__Group_5__1__Impl : ( ( rule__ImageObject__FitAssignment_5_1 ) ) ;
    public final void rule__ImageObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7154:1: ( ( ( rule__ImageObject__FitAssignment_5_1 ) ) )
            // InternalPdfMk.g:7155:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            {
            // InternalPdfMk.g:7155:1: ( ( rule__ImageObject__FitAssignment_5_1 ) )
            // InternalPdfMk.g:7156:2: ( rule__ImageObject__FitAssignment_5_1 )
            {
             before(grammarAccess.getImageObjectAccess().getFitAssignment_5_1()); 
            // InternalPdfMk.g:7157:2: ( rule__ImageObject__FitAssignment_5_1 )
            // InternalPdfMk.g:7157:3: rule__ImageObject__FitAssignment_5_1
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
    // InternalPdfMk.g:7166:1: rule__ImageObject__Group_6__0 : rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 ;
    public final void rule__ImageObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7170:1: ( rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1 )
            // InternalPdfMk.g:7171:2: rule__ImageObject__Group_6__0__Impl rule__ImageObject__Group_6__1
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
    // InternalPdfMk.g:7178:1: rule__ImageObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ImageObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7182:1: ( ( ',' ) )
            // InternalPdfMk.g:7183:1: ( ',' )
            {
            // InternalPdfMk.g:7183:1: ( ',' )
            // InternalPdfMk.g:7184:2: ','
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
    // InternalPdfMk.g:7193:1: rule__ImageObject__Group_6__1 : rule__ImageObject__Group_6__1__Impl ;
    public final void rule__ImageObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7197:1: ( rule__ImageObject__Group_6__1__Impl )
            // InternalPdfMk.g:7198:2: rule__ImageObject__Group_6__1__Impl
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
    // InternalPdfMk.g:7204:1: rule__ImageObject__Group_6__1__Impl : ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) ;
    public final void rule__ImageObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7208:1: ( ( ( rule__ImageObject__PageBreakAssignment_6_1 ) ) )
            // InternalPdfMk.g:7209:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            {
            // InternalPdfMk.g:7209:1: ( ( rule__ImageObject__PageBreakAssignment_6_1 ) )
            // InternalPdfMk.g:7210:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            {
             before(grammarAccess.getImageObjectAccess().getPageBreakAssignment_6_1()); 
            // InternalPdfMk.g:7211:2: ( rule__ImageObject__PageBreakAssignment_6_1 )
            // InternalPdfMk.g:7211:3: rule__ImageObject__PageBreakAssignment_6_1
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
    // InternalPdfMk.g:7220:1: rule__ListObject__Group__0 : rule__ListObject__Group__0__Impl rule__ListObject__Group__1 ;
    public final void rule__ListObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7224:1: ( rule__ListObject__Group__0__Impl rule__ListObject__Group__1 )
            // InternalPdfMk.g:7225:2: rule__ListObject__Group__0__Impl rule__ListObject__Group__1
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
    // InternalPdfMk.g:7232:1: rule__ListObject__Group__0__Impl : ( ( rule__ListObject__ValueAssignment_0 ) ) ;
    public final void rule__ListObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7236:1: ( ( ( rule__ListObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:7237:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:7237:1: ( ( rule__ListObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:7238:2: ( rule__ListObject__ValueAssignment_0 )
            {
             before(grammarAccess.getListObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:7239:2: ( rule__ListObject__ValueAssignment_0 )
            // InternalPdfMk.g:7239:3: rule__ListObject__ValueAssignment_0
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
    // InternalPdfMk.g:7247:1: rule__ListObject__Group__1 : rule__ListObject__Group__1__Impl rule__ListObject__Group__2 ;
    public final void rule__ListObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7251:1: ( rule__ListObject__Group__1__Impl rule__ListObject__Group__2 )
            // InternalPdfMk.g:7252:2: rule__ListObject__Group__1__Impl rule__ListObject__Group__2
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
    // InternalPdfMk.g:7259:1: rule__ListObject__Group__1__Impl : ( ( rule__ListObject__Group_1__0 )? ) ;
    public final void rule__ListObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7263:1: ( ( ( rule__ListObject__Group_1__0 )? ) )
            // InternalPdfMk.g:7264:1: ( ( rule__ListObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:7264:1: ( ( rule__ListObject__Group_1__0 )? )
            // InternalPdfMk.g:7265:2: ( rule__ListObject__Group_1__0 )?
            {
             before(grammarAccess.getListObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:7266:2: ( rule__ListObject__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=38 && LA49_0<=42)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPdfMk.g:7266:3: rule__ListObject__Group_1__0
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
    // InternalPdfMk.g:7274:1: rule__ListObject__Group__2 : rule__ListObject__Group__2__Impl rule__ListObject__Group__3 ;
    public final void rule__ListObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7278:1: ( rule__ListObject__Group__2__Impl rule__ListObject__Group__3 )
            // InternalPdfMk.g:7279:2: rule__ListObject__Group__2__Impl rule__ListObject__Group__3
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
    // InternalPdfMk.g:7286:1: rule__ListObject__Group__2__Impl : ( ( rule__ListObject__Alternatives_2 ) ) ;
    public final void rule__ListObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7290:1: ( ( ( rule__ListObject__Alternatives_2 ) ) )
            // InternalPdfMk.g:7291:1: ( ( rule__ListObject__Alternatives_2 ) )
            {
            // InternalPdfMk.g:7291:1: ( ( rule__ListObject__Alternatives_2 ) )
            // InternalPdfMk.g:7292:2: ( rule__ListObject__Alternatives_2 )
            {
             before(grammarAccess.getListObjectAccess().getAlternatives_2()); 
            // InternalPdfMk.g:7293:2: ( rule__ListObject__Alternatives_2 )
            // InternalPdfMk.g:7293:3: rule__ListObject__Alternatives_2
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
    // InternalPdfMk.g:7301:1: rule__ListObject__Group__3 : rule__ListObject__Group__3__Impl rule__ListObject__Group__4 ;
    public final void rule__ListObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7305:1: ( rule__ListObject__Group__3__Impl rule__ListObject__Group__4 )
            // InternalPdfMk.g:7306:2: rule__ListObject__Group__3__Impl rule__ListObject__Group__4
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
    // InternalPdfMk.g:7313:1: rule__ListObject__Group__3__Impl : ( ':' ) ;
    public final void rule__ListObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7317:1: ( ( ':' ) )
            // InternalPdfMk.g:7318:1: ( ':' )
            {
            // InternalPdfMk.g:7318:1: ( ':' )
            // InternalPdfMk.g:7319:2: ':'
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
    // InternalPdfMk.g:7328:1: rule__ListObject__Group__4 : rule__ListObject__Group__4__Impl rule__ListObject__Group__5 ;
    public final void rule__ListObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7332:1: ( rule__ListObject__Group__4__Impl rule__ListObject__Group__5 )
            // InternalPdfMk.g:7333:2: rule__ListObject__Group__4__Impl rule__ListObject__Group__5
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
    // InternalPdfMk.g:7340:1: rule__ListObject__Group__4__Impl : ( '[' ) ;
    public final void rule__ListObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7344:1: ( ( '[' ) )
            // InternalPdfMk.g:7345:1: ( '[' )
            {
            // InternalPdfMk.g:7345:1: ( '[' )
            // InternalPdfMk.g:7346:2: '['
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
    // InternalPdfMk.g:7355:1: rule__ListObject__Group__5 : rule__ListObject__Group__5__Impl rule__ListObject__Group__6 ;
    public final void rule__ListObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7359:1: ( rule__ListObject__Group__5__Impl rule__ListObject__Group__6 )
            // InternalPdfMk.g:7360:2: rule__ListObject__Group__5__Impl rule__ListObject__Group__6
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
    // InternalPdfMk.g:7367:1: rule__ListObject__Group__5__Impl : ( ( rule__ListObject__Group_5__0 ) ) ;
    public final void rule__ListObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7371:1: ( ( ( rule__ListObject__Group_5__0 ) ) )
            // InternalPdfMk.g:7372:1: ( ( rule__ListObject__Group_5__0 ) )
            {
            // InternalPdfMk.g:7372:1: ( ( rule__ListObject__Group_5__0 ) )
            // InternalPdfMk.g:7373:2: ( rule__ListObject__Group_5__0 )
            {
             before(grammarAccess.getListObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:7374:2: ( rule__ListObject__Group_5__0 )
            // InternalPdfMk.g:7374:3: rule__ListObject__Group_5__0
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
    // InternalPdfMk.g:7382:1: rule__ListObject__Group__6 : rule__ListObject__Group__6__Impl rule__ListObject__Group__7 ;
    public final void rule__ListObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7386:1: ( rule__ListObject__Group__6__Impl rule__ListObject__Group__7 )
            // InternalPdfMk.g:7387:2: rule__ListObject__Group__6__Impl rule__ListObject__Group__7
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
    // InternalPdfMk.g:7394:1: rule__ListObject__Group__6__Impl : ( ']' ) ;
    public final void rule__ListObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7398:1: ( ( ']' ) )
            // InternalPdfMk.g:7399:1: ( ']' )
            {
            // InternalPdfMk.g:7399:1: ( ']' )
            // InternalPdfMk.g:7400:2: ']'
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
    // InternalPdfMk.g:7409:1: rule__ListObject__Group__7 : rule__ListObject__Group__7__Impl ;
    public final void rule__ListObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7413:1: ( rule__ListObject__Group__7__Impl )
            // InternalPdfMk.g:7414:2: rule__ListObject__Group__7__Impl
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
    // InternalPdfMk.g:7420:1: rule__ListObject__Group__7__Impl : ( '}' ) ;
    public final void rule__ListObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7424:1: ( ( '}' ) )
            // InternalPdfMk.g:7425:1: ( '}' )
            {
            // InternalPdfMk.g:7425:1: ( '}' )
            // InternalPdfMk.g:7426:2: '}'
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
    // InternalPdfMk.g:7436:1: rule__ListObject__Group_1__0 : rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 ;
    public final void rule__ListObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7440:1: ( rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1 )
            // InternalPdfMk.g:7441:2: rule__ListObject__Group_1__0__Impl rule__ListObject__Group_1__1
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
    // InternalPdfMk.g:7448:1: rule__ListObject__Group_1__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) ;
    public final void rule__ListObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7452:1: ( ( ( rule__ListObject__PropertiesAssignment_1_0 ) ) )
            // InternalPdfMk.g:7453:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7453:1: ( ( rule__ListObject__PropertiesAssignment_1_0 ) )
            // InternalPdfMk.g:7454:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_0()); 
            // InternalPdfMk.g:7455:2: ( rule__ListObject__PropertiesAssignment_1_0 )
            // InternalPdfMk.g:7455:3: rule__ListObject__PropertiesAssignment_1_0
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
    // InternalPdfMk.g:7463:1: rule__ListObject__Group_1__1 : rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 ;
    public final void rule__ListObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7467:1: ( rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2 )
            // InternalPdfMk.g:7468:2: rule__ListObject__Group_1__1__Impl rule__ListObject__Group_1__2
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
    // InternalPdfMk.g:7475:1: rule__ListObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7479:1: ( ( ',' ) )
            // InternalPdfMk.g:7480:1: ( ',' )
            {
            // InternalPdfMk.g:7480:1: ( ',' )
            // InternalPdfMk.g:7481:2: ','
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
    // InternalPdfMk.g:7490:1: rule__ListObject__Group_1__2 : rule__ListObject__Group_1__2__Impl ;
    public final void rule__ListObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7494:1: ( rule__ListObject__Group_1__2__Impl )
            // InternalPdfMk.g:7495:2: rule__ListObject__Group_1__2__Impl
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
    // InternalPdfMk.g:7501:1: rule__ListObject__Group_1__2__Impl : ( ( rule__ListObject__Group_1_2__0 )* ) ;
    public final void rule__ListObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7505:1: ( ( ( rule__ListObject__Group_1_2__0 )* ) )
            // InternalPdfMk.g:7506:1: ( ( rule__ListObject__Group_1_2__0 )* )
            {
            // InternalPdfMk.g:7506:1: ( ( rule__ListObject__Group_1_2__0 )* )
            // InternalPdfMk.g:7507:2: ( rule__ListObject__Group_1_2__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_1_2()); 
            // InternalPdfMk.g:7508:2: ( rule__ListObject__Group_1_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=38 && LA50_0<=42)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPdfMk.g:7508:3: rule__ListObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ListObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalPdfMk.g:7517:1: rule__ListObject__Group_1_2__0 : rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 ;
    public final void rule__ListObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7521:1: ( rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1 )
            // InternalPdfMk.g:7522:2: rule__ListObject__Group_1_2__0__Impl rule__ListObject__Group_1_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:7529:1: rule__ListObject__Group_1_2__0__Impl : ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) ;
    public final void rule__ListObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7533:1: ( ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) ) )
            // InternalPdfMk.g:7534:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            {
            // InternalPdfMk.g:7534:1: ( ( rule__ListObject__PropertiesAssignment_1_2_0 ) )
            // InternalPdfMk.g:7535:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            {
             before(grammarAccess.getListObjectAccess().getPropertiesAssignment_1_2_0()); 
            // InternalPdfMk.g:7536:2: ( rule__ListObject__PropertiesAssignment_1_2_0 )
            // InternalPdfMk.g:7536:3: rule__ListObject__PropertiesAssignment_1_2_0
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
    // InternalPdfMk.g:7544:1: rule__ListObject__Group_1_2__1 : rule__ListObject__Group_1_2__1__Impl ;
    public final void rule__ListObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7548:1: ( rule__ListObject__Group_1_2__1__Impl )
            // InternalPdfMk.g:7549:2: rule__ListObject__Group_1_2__1__Impl
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
    // InternalPdfMk.g:7555:1: rule__ListObject__Group_1_2__1__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7559:1: ( ( ',' ) )
            // InternalPdfMk.g:7560:1: ( ',' )
            {
            // InternalPdfMk.g:7560:1: ( ',' )
            // InternalPdfMk.g:7561:2: ','
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
    // InternalPdfMk.g:7571:1: rule__ListObject__Group_5__0 : rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 ;
    public final void rule__ListObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7575:1: ( rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1 )
            // InternalPdfMk.g:7576:2: rule__ListObject__Group_5__0__Impl rule__ListObject__Group_5__1
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
    // InternalPdfMk.g:7583:1: rule__ListObject__Group_5__0__Impl : ( ( rule__ListObject__ElementsAssignment_5_0 )? ) ;
    public final void rule__ListObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7587:1: ( ( ( rule__ListObject__ElementsAssignment_5_0 )? ) )
            // InternalPdfMk.g:7588:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            {
            // InternalPdfMk.g:7588:1: ( ( rule__ListObject__ElementsAssignment_5_0 )? )
            // InternalPdfMk.g:7589:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            {
             before(grammarAccess.getListObjectAccess().getElementsAssignment_5_0()); 
            // InternalPdfMk.g:7590:2: ( rule__ListObject__ElementsAssignment_5_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING||LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPdfMk.g:7590:3: rule__ListObject__ElementsAssignment_5_0
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
    // InternalPdfMk.g:7598:1: rule__ListObject__Group_5__1 : rule__ListObject__Group_5__1__Impl ;
    public final void rule__ListObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7602:1: ( rule__ListObject__Group_5__1__Impl )
            // InternalPdfMk.g:7603:2: rule__ListObject__Group_5__1__Impl
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
    // InternalPdfMk.g:7609:1: rule__ListObject__Group_5__1__Impl : ( ( rule__ListObject__Group_5_1__0 )* ) ;
    public final void rule__ListObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7613:1: ( ( ( rule__ListObject__Group_5_1__0 )* ) )
            // InternalPdfMk.g:7614:1: ( ( rule__ListObject__Group_5_1__0 )* )
            {
            // InternalPdfMk.g:7614:1: ( ( rule__ListObject__Group_5_1__0 )* )
            // InternalPdfMk.g:7615:2: ( rule__ListObject__Group_5_1__0 )*
            {
             before(grammarAccess.getListObjectAccess().getGroup_5_1()); 
            // InternalPdfMk.g:7616:2: ( rule__ListObject__Group_5_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==20) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPdfMk.g:7616:3: rule__ListObject__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ListObject__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalPdfMk.g:7625:1: rule__ListObject__Group_5_1__0 : rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 ;
    public final void rule__ListObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7629:1: ( rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1 )
            // InternalPdfMk.g:7630:2: rule__ListObject__Group_5_1__0__Impl rule__ListObject__Group_5_1__1
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
    // InternalPdfMk.g:7637:1: rule__ListObject__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ListObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7641:1: ( ( ',' ) )
            // InternalPdfMk.g:7642:1: ( ',' )
            {
            // InternalPdfMk.g:7642:1: ( ',' )
            // InternalPdfMk.g:7643:2: ','
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
    // InternalPdfMk.g:7652:1: rule__ListObject__Group_5_1__1 : rule__ListObject__Group_5_1__1__Impl ;
    public final void rule__ListObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7656:1: ( rule__ListObject__Group_5_1__1__Impl )
            // InternalPdfMk.g:7657:2: rule__ListObject__Group_5_1__1__Impl
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
    // InternalPdfMk.g:7663:1: rule__ListObject__Group_5_1__1__Impl : ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) ;
    public final void rule__ListObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7667:1: ( ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) ) )
            // InternalPdfMk.g:7668:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            {
            // InternalPdfMk.g:7668:1: ( ( rule__ListObject__ElemtensAssignment_5_1_1 ) )
            // InternalPdfMk.g:7669:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            {
             before(grammarAccess.getListObjectAccess().getElemtensAssignment_5_1_1()); 
            // InternalPdfMk.g:7670:2: ( rule__ListObject__ElemtensAssignment_5_1_1 )
            // InternalPdfMk.g:7670:3: rule__ListObject__ElemtensAssignment_5_1_1
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
    // InternalPdfMk.g:7679:1: rule__TableObject__Group__0 : rule__TableObject__Group__0__Impl rule__TableObject__Group__1 ;
    public final void rule__TableObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7683:1: ( rule__TableObject__Group__0__Impl rule__TableObject__Group__1 )
            // InternalPdfMk.g:7684:2: rule__TableObject__Group__0__Impl rule__TableObject__Group__1
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
    // InternalPdfMk.g:7691:1: rule__TableObject__Group__0__Impl : ( ( rule__TableObject__ValueAssignment_0 ) ) ;
    public final void rule__TableObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7695:1: ( ( ( rule__TableObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:7696:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:7696:1: ( ( rule__TableObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:7697:2: ( rule__TableObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTableObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:7698:2: ( rule__TableObject__ValueAssignment_0 )
            // InternalPdfMk.g:7698:3: rule__TableObject__ValueAssignment_0
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
    // InternalPdfMk.g:7706:1: rule__TableObject__Group__1 : rule__TableObject__Group__1__Impl rule__TableObject__Group__2 ;
    public final void rule__TableObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7710:1: ( rule__TableObject__Group__1__Impl rule__TableObject__Group__2 )
            // InternalPdfMk.g:7711:2: rule__TableObject__Group__1__Impl rule__TableObject__Group__2
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
    // InternalPdfMk.g:7718:1: rule__TableObject__Group__1__Impl : ( ( rule__TableObject__Group_1__0 )? ) ;
    public final void rule__TableObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7722:1: ( ( ( rule__TableObject__Group_1__0 )? ) )
            // InternalPdfMk.g:7723:1: ( ( rule__TableObject__Group_1__0 )? )
            {
            // InternalPdfMk.g:7723:1: ( ( rule__TableObject__Group_1__0 )? )
            // InternalPdfMk.g:7724:2: ( rule__TableObject__Group_1__0 )?
            {
             before(grammarAccess.getTableObjectAccess().getGroup_1()); 
            // InternalPdfMk.g:7725:2: ( rule__TableObject__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPdfMk.g:7725:3: rule__TableObject__Group_1__0
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
    // InternalPdfMk.g:7733:1: rule__TableObject__Group__2 : rule__TableObject__Group__2__Impl rule__TableObject__Group__3 ;
    public final void rule__TableObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7737:1: ( rule__TableObject__Group__2__Impl rule__TableObject__Group__3 )
            // InternalPdfMk.g:7738:2: rule__TableObject__Group__2__Impl rule__TableObject__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:7745:1: rule__TableObject__Group__2__Impl : ( ( rule__TableObject__TableAssignment_2 ) ) ;
    public final void rule__TableObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7749:1: ( ( ( rule__TableObject__TableAssignment_2 ) ) )
            // InternalPdfMk.g:7750:1: ( ( rule__TableObject__TableAssignment_2 ) )
            {
            // InternalPdfMk.g:7750:1: ( ( rule__TableObject__TableAssignment_2 ) )
            // InternalPdfMk.g:7751:2: ( rule__TableObject__TableAssignment_2 )
            {
             before(grammarAccess.getTableObjectAccess().getTableAssignment_2()); 
            // InternalPdfMk.g:7752:2: ( rule__TableObject__TableAssignment_2 )
            // InternalPdfMk.g:7752:3: rule__TableObject__TableAssignment_2
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
    // InternalPdfMk.g:7760:1: rule__TableObject__Group__3 : rule__TableObject__Group__3__Impl ;
    public final void rule__TableObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7764:1: ( rule__TableObject__Group__3__Impl )
            // InternalPdfMk.g:7765:2: rule__TableObject__Group__3__Impl
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
    // InternalPdfMk.g:7771:1: rule__TableObject__Group__3__Impl : ( '}' ) ;
    public final void rule__TableObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7775:1: ( ( '}' ) )
            // InternalPdfMk.g:7776:1: ( '}' )
            {
            // InternalPdfMk.g:7776:1: ( '}' )
            // InternalPdfMk.g:7777:2: '}'
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
    // InternalPdfMk.g:7787:1: rule__TableObject__Group_1__0 : rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 ;
    public final void rule__TableObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7791:1: ( rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1 )
            // InternalPdfMk.g:7792:2: rule__TableObject__Group_1__0__Impl rule__TableObject__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:7799:1: rule__TableObject__Group_1__0__Impl : ( ( rule__TableObject__StyleAssignment_1_0 ) ) ;
    public final void rule__TableObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7803:1: ( ( ( rule__TableObject__StyleAssignment_1_0 ) ) )
            // InternalPdfMk.g:7804:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7804:1: ( ( rule__TableObject__StyleAssignment_1_0 ) )
            // InternalPdfMk.g:7805:2: ( rule__TableObject__StyleAssignment_1_0 )
            {
             before(grammarAccess.getTableObjectAccess().getStyleAssignment_1_0()); 
            // InternalPdfMk.g:7806:2: ( rule__TableObject__StyleAssignment_1_0 )
            // InternalPdfMk.g:7806:3: rule__TableObject__StyleAssignment_1_0
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
    // InternalPdfMk.g:7814:1: rule__TableObject__Group_1__1 : rule__TableObject__Group_1__1__Impl ;
    public final void rule__TableObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7818:1: ( rule__TableObject__Group_1__1__Impl )
            // InternalPdfMk.g:7819:2: rule__TableObject__Group_1__1__Impl
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
    // InternalPdfMk.g:7825:1: rule__TableObject__Group_1__1__Impl : ( ',' ) ;
    public final void rule__TableObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7829:1: ( ( ',' ) )
            // InternalPdfMk.g:7830:1: ( ',' )
            {
            // InternalPdfMk.g:7830:1: ( ',' )
            // InternalPdfMk.g:7831:2: ','
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
    // InternalPdfMk.g:7841:1: rule__ContentObjects__Group__0 : rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 ;
    public final void rule__ContentObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7845:1: ( rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 )
            // InternalPdfMk.g:7846:2: rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPdfMk.g:7853:1: rule__ContentObjects__Group__0__Impl : ( '[' ) ;
    public final void rule__ContentObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7857:1: ( ( '[' ) )
            // InternalPdfMk.g:7858:1: ( '[' )
            {
            // InternalPdfMk.g:7858:1: ( '[' )
            // InternalPdfMk.g:7859:2: '['
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
    // InternalPdfMk.g:7868:1: rule__ContentObjects__Group__1 : rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 ;
    public final void rule__ContentObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7872:1: ( rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 )
            // InternalPdfMk.g:7873:2: rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2
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
    // InternalPdfMk.g:7880:1: rule__ContentObjects__Group__1__Impl : ( ( rule__ContentObjects__Group_1__0 )? ) ;
    public final void rule__ContentObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7884:1: ( ( ( rule__ContentObjects__Group_1__0 )? ) )
            // InternalPdfMk.g:7885:1: ( ( rule__ContentObjects__Group_1__0 )? )
            {
            // InternalPdfMk.g:7885:1: ( ( rule__ContentObjects__Group_1__0 )? )
            // InternalPdfMk.g:7886:2: ( rule__ContentObjects__Group_1__0 )?
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:7887:2: ( rule__ContentObjects__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING||LA54_0==18) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPdfMk.g:7887:3: rule__ContentObjects__Group_1__0
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
    // InternalPdfMk.g:7895:1: rule__ContentObjects__Group__2 : rule__ContentObjects__Group__2__Impl ;
    public final void rule__ContentObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7899:1: ( rule__ContentObjects__Group__2__Impl )
            // InternalPdfMk.g:7900:2: rule__ContentObjects__Group__2__Impl
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
    // InternalPdfMk.g:7906:1: rule__ContentObjects__Group__2__Impl : ( ']' ) ;
    public final void rule__ContentObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7910:1: ( ( ']' ) )
            // InternalPdfMk.g:7911:1: ( ']' )
            {
            // InternalPdfMk.g:7911:1: ( ']' )
            // InternalPdfMk.g:7912:2: ']'
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
    // InternalPdfMk.g:7922:1: rule__ContentObjects__Group_1__0 : rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1 ;
    public final void rule__ContentObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7926:1: ( rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1 )
            // InternalPdfMk.g:7927:2: rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1
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
    // InternalPdfMk.g:7934:1: rule__ContentObjects__Group_1__0__Impl : ( ( rule__ContentObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__ContentObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7938:1: ( ( ( rule__ContentObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:7939:1: ( ( rule__ContentObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:7939:1: ( ( rule__ContentObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:7940:2: ( rule__ContentObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:7941:2: ( rule__ContentObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:7941:3: rule__ContentObjects__ValueAssignment_1_0
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
    // InternalPdfMk.g:7949:1: rule__ContentObjects__Group_1__1 : rule__ContentObjects__Group_1__1__Impl ;
    public final void rule__ContentObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7953:1: ( rule__ContentObjects__Group_1__1__Impl )
            // InternalPdfMk.g:7954:2: rule__ContentObjects__Group_1__1__Impl
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
    // InternalPdfMk.g:7960:1: rule__ContentObjects__Group_1__1__Impl : ( ( rule__ContentObjects__Group_1_1__0 )* ) ;
    public final void rule__ContentObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7964:1: ( ( ( rule__ContentObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:7965:1: ( ( rule__ContentObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:7965:1: ( ( rule__ContentObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:7966:2: ( rule__ContentObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:7967:2: ( rule__ContentObjects__Group_1_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==20) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalPdfMk.g:7967:3: rule__ContentObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ContentObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalPdfMk.g:7976:1: rule__ContentObjects__Group_1_1__0 : rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1 ;
    public final void rule__ContentObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7980:1: ( rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1 )
            // InternalPdfMk.g:7981:2: rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPdfMk.g:7988:1: rule__ContentObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ContentObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:7992:1: ( ( ',' ) )
            // InternalPdfMk.g:7993:1: ( ',' )
            {
            // InternalPdfMk.g:7993:1: ( ',' )
            // InternalPdfMk.g:7994:2: ','
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
    // InternalPdfMk.g:8003:1: rule__ContentObjects__Group_1_1__1 : rule__ContentObjects__Group_1_1__1__Impl ;
    public final void rule__ContentObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8007:1: ( rule__ContentObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:8008:2: rule__ContentObjects__Group_1_1__1__Impl
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
    // InternalPdfMk.g:8014:1: rule__ContentObjects__Group_1_1__1__Impl : ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__ContentObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8018:1: ( ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:8019:1: ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:8019:1: ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:8020:2: ( rule__ContentObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:8021:2: ( rule__ContentObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:8021:3: rule__ContentObjects__ValueAssignment_1_1_1
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
    // InternalPdfMk.g:8030:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8034:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:8035:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
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
    // InternalPdfMk.g:8042:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8046:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:8047:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:8047:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:8048:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:8049:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:8049:3: rule__Styles__KeyAssignment_0
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
    // InternalPdfMk.g:8057:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8061:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:8062:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
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
    // InternalPdfMk.g:8069:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8073:1: ( ( ':' ) )
            // InternalPdfMk.g:8074:1: ( ':' )
            {
            // InternalPdfMk.g:8074:1: ( ':' )
            // InternalPdfMk.g:8075:2: ':'
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
    // InternalPdfMk.g:8084:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8088:1: ( rule__Styles__Group__2__Impl )
            // InternalPdfMk.g:8089:2: rule__Styles__Group__2__Impl
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
    // InternalPdfMk.g:8095:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8099:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:8100:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:8100:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:8101:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:8102:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:8102:3: rule__Styles__ValueAssignment_2
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
    // InternalPdfMk.g:8111:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8115:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:8116:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalPdfMk.g:8123:1: rule__Content__Group__0__Impl : ( ( rule__Content__KeyAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8127:1: ( ( ( rule__Content__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:8128:1: ( ( rule__Content__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:8128:1: ( ( rule__Content__KeyAssignment_0 ) )
            // InternalPdfMk.g:8129:2: ( rule__Content__KeyAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:8130:2: ( rule__Content__KeyAssignment_0 )
            // InternalPdfMk.g:8130:3: rule__Content__KeyAssignment_0
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
    // InternalPdfMk.g:8138:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8142:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:8143:2: rule__Content__Group__1__Impl rule__Content__Group__2
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
    // InternalPdfMk.g:8150:1: rule__Content__Group__1__Impl : ( ':' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8154:1: ( ( ':' ) )
            // InternalPdfMk.g:8155:1: ( ':' )
            {
            // InternalPdfMk.g:8155:1: ( ':' )
            // InternalPdfMk.g:8156:2: ':'
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
    // InternalPdfMk.g:8165:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8169:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:8170:2: rule__Content__Group__2__Impl
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
    // InternalPdfMk.g:8176:1: rule__Content__Group__2__Impl : ( ( rule__Content__ValueAssignment_2 ) ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8180:1: ( ( ( rule__Content__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:8181:1: ( ( rule__Content__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:8181:1: ( ( rule__Content__ValueAssignment_2 ) )
            // InternalPdfMk.g:8182:2: ( rule__Content__ValueAssignment_2 )
            {
             before(grammarAccess.getContentAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:8183:2: ( rule__Content__ValueAssignment_2 )
            // InternalPdfMk.g:8183:3: rule__Content__ValueAssignment_2
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
    // InternalPdfMk.g:8192:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8196:1: ( ( ruleContent ) )
            // InternalPdfMk.g:8197:2: ( ruleContent )
            {
            // InternalPdfMk.g:8197:2: ( ruleContent )
            // InternalPdfMk.g:8198:3: ruleContent
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
    // InternalPdfMk.g:8207:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8211:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:8212:2: ( ruleStyles )
            {
            // InternalPdfMk.g:8212:2: ( ruleStyles )
            // InternalPdfMk.g:8213:3: ruleStyles
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
    // InternalPdfMk.g:8222:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8226:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8227:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8227:2: ( RULE_STRING )
            // InternalPdfMk.g:8228:3: RULE_STRING
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
    // InternalPdfMk.g:8237:1: rule__TypeFaceDefinition__KeyAssignment_0 : ( ( 'bold' ) ) ;
    public final void rule__TypeFaceDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8241:1: ( ( ( 'bold' ) ) )
            // InternalPdfMk.g:8242:2: ( ( 'bold' ) )
            {
            // InternalPdfMk.g:8242:2: ( ( 'bold' ) )
            // InternalPdfMk.g:8243:3: ( 'bold' )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            // InternalPdfMk.g:8244:3: ( 'bold' )
            // InternalPdfMk.g:8245:4: 'bold'
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
    // InternalPdfMk.g:8256:1: rule__TypeFaceDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__TypeFaceDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8260:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8261:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8261:2: ( ruleBooleanType )
            // InternalPdfMk.g:8262:3: ruleBooleanType
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
    // InternalPdfMk.g:8271:1: rule__TextStyleDefinition__KeyAssignment_0 : ( ( 'style' ) ) ;
    public final void rule__TextStyleDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8275:1: ( ( ( 'style' ) ) )
            // InternalPdfMk.g:8276:2: ( ( 'style' ) )
            {
            // InternalPdfMk.g:8276:2: ( ( 'style' ) )
            // InternalPdfMk.g:8277:3: ( 'style' )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            // InternalPdfMk.g:8278:3: ( 'style' )
            // InternalPdfMk.g:8279:4: 'style'
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
    // InternalPdfMk.g:8290:1: rule__TextStyleDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextStyleDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8294:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8295:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8295:2: ( RULE_STRING )
            // InternalPdfMk.g:8296:3: RULE_STRING
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
    // InternalPdfMk.g:8305:1: rule__ItalicsDefinition__KeyAssignment_0 : ( ( 'italics' ) ) ;
    public final void rule__ItalicsDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8309:1: ( ( ( 'italics' ) ) )
            // InternalPdfMk.g:8310:2: ( ( 'italics' ) )
            {
            // InternalPdfMk.g:8310:2: ( ( 'italics' ) )
            // InternalPdfMk.g:8311:3: ( 'italics' )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            // InternalPdfMk.g:8312:3: ( 'italics' )
            // InternalPdfMk.g:8313:4: 'italics'
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
    // InternalPdfMk.g:8324:1: rule__ItalicsDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ItalicsDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8328:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8329:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8329:2: ( ruleBooleanType )
            // InternalPdfMk.g:8330:3: ruleBooleanType
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
    // InternalPdfMk.g:8339:1: rule__FontSizeDefinition__KeyAssignment_0 : ( ( 'fontSize' ) ) ;
    public final void rule__FontSizeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8343:1: ( ( ( 'fontSize' ) ) )
            // InternalPdfMk.g:8344:2: ( ( 'fontSize' ) )
            {
            // InternalPdfMk.g:8344:2: ( ( 'fontSize' ) )
            // InternalPdfMk.g:8345:3: ( 'fontSize' )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            // InternalPdfMk.g:8346:3: ( 'fontSize' )
            // InternalPdfMk.g:8347:4: 'fontSize'
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
    // InternalPdfMk.g:8358:1: rule__FontSizeDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FontSizeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8362:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8363:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8363:2: ( RULE_INT )
            // InternalPdfMk.g:8364:3: RULE_INT
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
    // InternalPdfMk.g:8373:1: rule__WidthDefinition__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__WidthDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8377:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:8378:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:8378:2: ( ( 'width' ) )
            // InternalPdfMk.g:8379:3: ( 'width' )
            {
             before(grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:8380:3: ( 'width' )
            // InternalPdfMk.g:8381:4: 'width'
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
    // InternalPdfMk.g:8392:1: rule__WidthDefinition__ValueAssignment_2 : ( ruleColumnTextWidthType ) ;
    public final void rule__WidthDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8396:1: ( ( ruleColumnTextWidthType ) )
            // InternalPdfMk.g:8397:2: ( ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:8397:2: ( ruleColumnTextWidthType )
            // InternalPdfMk.g:8398:3: ruleColumnTextWidthType
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
    // InternalPdfMk.g:8407:1: rule__ColumnDefinition__GlobalStyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__ColumnDefinition__GlobalStyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8411:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:8412:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:8412:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:8413:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:8422:1: rule__ColumnDefinition__KeyAssignment_2 : ( ( 'columns' ) ) ;
    public final void rule__ColumnDefinition__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8426:1: ( ( ( 'columns' ) ) )
            // InternalPdfMk.g:8427:2: ( ( 'columns' ) )
            {
            // InternalPdfMk.g:8427:2: ( ( 'columns' ) )
            // InternalPdfMk.g:8428:3: ( 'columns' )
            {
             before(grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0()); 
            // InternalPdfMk.g:8429:3: ( 'columns' )
            // InternalPdfMk.g:8430:4: 'columns'
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
    // InternalPdfMk.g:8441:1: rule__ColumnDefinition__ValueAssignment_4_0 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8445:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:8446:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:8446:2: ( ruleColumnObject )
            // InternalPdfMk.g:8447:3: ruleColumnObject
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
    // InternalPdfMk.g:8456:1: rule__ColumnDefinition__ValueAssignment_4_1_1 : ( ruleColumnObject ) ;
    public final void rule__ColumnDefinition__ValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8460:1: ( ( ruleColumnObject ) )
            // InternalPdfMk.g:8461:2: ( ruleColumnObject )
            {
            // InternalPdfMk.g:8461:2: ( ruleColumnObject )
            // InternalPdfMk.g:8462:3: ruleColumnObject
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
    // InternalPdfMk.g:8471:1: rule__MarginDefinition__KeyAssignment_0 : ( ( 'margin' ) ) ;
    public final void rule__MarginDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8475:1: ( ( ( 'margin' ) ) )
            // InternalPdfMk.g:8476:2: ( ( 'margin' ) )
            {
            // InternalPdfMk.g:8476:2: ( ( 'margin' ) )
            // InternalPdfMk.g:8477:3: ( 'margin' )
            {
             before(grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0()); 
            // InternalPdfMk.g:8478:3: ( 'margin' )
            // InternalPdfMk.g:8479:4: 'margin'
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
    // InternalPdfMk.g:8490:1: rule__MarginDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8494:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8495:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8495:2: ( RULE_INT )
            // InternalPdfMk.g:8496:3: RULE_INT
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
    // InternalPdfMk.g:8505:1: rule__MarginDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarginDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8509:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8510:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8510:2: ( RULE_INT )
            // InternalPdfMk.g:8511:3: RULE_INT
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
    // InternalPdfMk.g:8520:1: rule__ImageDefintion__KeyAssignment_0 : ( ( 'image' ) ) ;
    public final void rule__ImageDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8524:1: ( ( ( 'image' ) ) )
            // InternalPdfMk.g:8525:2: ( ( 'image' ) )
            {
            // InternalPdfMk.g:8525:2: ( ( 'image' ) )
            // InternalPdfMk.g:8526:3: ( 'image' )
            {
             before(grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0()); 
            // InternalPdfMk.g:8527:3: ( 'image' )
            // InternalPdfMk.g:8528:4: 'image'
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
    // InternalPdfMk.g:8539:1: rule__ImageDefintion__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8543:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8544:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8544:2: ( RULE_STRING )
            // InternalPdfMk.g:8545:3: RULE_STRING
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
    // InternalPdfMk.g:8554:1: rule__ImageWidthDefintion__KeyAssignment_0 : ( ( 'width' ) ) ;
    public final void rule__ImageWidthDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8558:1: ( ( ( 'width' ) ) )
            // InternalPdfMk.g:8559:2: ( ( 'width' ) )
            {
            // InternalPdfMk.g:8559:2: ( ( 'width' ) )
            // InternalPdfMk.g:8560:3: ( 'width' )
            {
             before(grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0()); 
            // InternalPdfMk.g:8561:3: ( 'width' )
            // InternalPdfMk.g:8562:4: 'width'
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
    // InternalPdfMk.g:8573:1: rule__ImageWidthDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageWidthDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8577:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8578:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8578:2: ( RULE_INT )
            // InternalPdfMk.g:8579:3: RULE_INT
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
    // InternalPdfMk.g:8588:1: rule__ImageHeightDefintion__KeyAssignment_0 : ( ( 'height' ) ) ;
    public final void rule__ImageHeightDefintion__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8592:1: ( ( ( 'height' ) ) )
            // InternalPdfMk.g:8593:2: ( ( 'height' ) )
            {
            // InternalPdfMk.g:8593:2: ( ( 'height' ) )
            // InternalPdfMk.g:8594:3: ( 'height' )
            {
             before(grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0()); 
            // InternalPdfMk.g:8595:3: ( 'height' )
            // InternalPdfMk.g:8596:4: 'height'
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
    // InternalPdfMk.g:8607:1: rule__ImageHeightDefintion__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageHeightDefintion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8611:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8612:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8612:2: ( RULE_INT )
            // InternalPdfMk.g:8613:3: RULE_INT
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
    // InternalPdfMk.g:8622:1: rule__ImagePageBreakDefinition__KeyAssignment_0 : ( ( 'pageBreak' ) ) ;
    public final void rule__ImagePageBreakDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8626:1: ( ( ( 'pageBreak' ) ) )
            // InternalPdfMk.g:8627:2: ( ( 'pageBreak' ) )
            {
            // InternalPdfMk.g:8627:2: ( ( 'pageBreak' ) )
            // InternalPdfMk.g:8628:3: ( 'pageBreak' )
            {
             before(grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0()); 
            // InternalPdfMk.g:8629:3: ( 'pageBreak' )
            // InternalPdfMk.g:8630:4: 'pageBreak'
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
    // InternalPdfMk.g:8641:1: rule__ImagePageBreakDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImagePageBreakDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8645:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8646:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8646:2: ( RULE_STRING )
            // InternalPdfMk.g:8647:3: RULE_STRING
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
    // InternalPdfMk.g:8656:1: rule__ImageFitDefinition__KeyAssignment_0 : ( ( 'fit' ) ) ;
    public final void rule__ImageFitDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8660:1: ( ( ( 'fit' ) ) )
            // InternalPdfMk.g:8661:2: ( ( 'fit' ) )
            {
            // InternalPdfMk.g:8661:2: ( ( 'fit' ) )
            // InternalPdfMk.g:8662:3: ( 'fit' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0()); 
            // InternalPdfMk.g:8663:3: ( 'fit' )
            // InternalPdfMk.g:8664:4: 'fit'
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
    // InternalPdfMk.g:8675:1: rule__ImageFitDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__ImageFitDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8679:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8680:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8680:2: ( ( '[' ) )
            // InternalPdfMk.g:8681:3: ( '[' )
            {
             before(grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:8682:3: ( '[' )
            // InternalPdfMk.g:8683:4: '['
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
    // InternalPdfMk.g:8694:1: rule__ImageFitDefinition__ValuesAssignment_3 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8698:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8699:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8699:2: ( RULE_INT )
            // InternalPdfMk.g:8700:3: RULE_INT
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
    // InternalPdfMk.g:8709:1: rule__ImageFitDefinition__ValuesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ImageFitDefinition__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8713:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8714:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8714:2: ( RULE_INT )
            // InternalPdfMk.g:8715:3: RULE_INT
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
    // InternalPdfMk.g:8724:1: rule__ImageOpacityDefinition__KeyAssignment_0 : ( ( 'opacity' ) ) ;
    public final void rule__ImageOpacityDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8728:1: ( ( ( 'opacity' ) ) )
            // InternalPdfMk.g:8729:2: ( ( 'opacity' ) )
            {
            // InternalPdfMk.g:8729:2: ( ( 'opacity' ) )
            // InternalPdfMk.g:8730:3: ( 'opacity' )
            {
             before(grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0()); 
            // InternalPdfMk.g:8731:3: ( 'opacity' )
            // InternalPdfMk.g:8732:4: 'opacity'
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
    // InternalPdfMk.g:8743:1: rule__ImageOpacityDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ImageOpacityDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8747:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8748:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8748:2: ( RULE_INT )
            // InternalPdfMk.g:8749:3: RULE_INT
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
    // InternalPdfMk.g:8758:1: rule__ListReversedDefinition__KeyAssignment_0 : ( ( 'reversed' ) ) ;
    public final void rule__ListReversedDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8762:1: ( ( ( 'reversed' ) ) )
            // InternalPdfMk.g:8763:2: ( ( 'reversed' ) )
            {
            // InternalPdfMk.g:8763:2: ( ( 'reversed' ) )
            // InternalPdfMk.g:8764:3: ( 'reversed' )
            {
             before(grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0()); 
            // InternalPdfMk.g:8765:3: ( 'reversed' )
            // InternalPdfMk.g:8766:4: 'reversed'
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
    // InternalPdfMk.g:8777:1: rule__ListReversedDefinition__ValueAssignment_2 : ( ruleBooleanType ) ;
    public final void rule__ListReversedDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8781:1: ( ( ruleBooleanType ) )
            // InternalPdfMk.g:8782:2: ( ruleBooleanType )
            {
            // InternalPdfMk.g:8782:2: ( ruleBooleanType )
            // InternalPdfMk.g:8783:3: ruleBooleanType
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
    // InternalPdfMk.g:8792:1: rule__ListCounterDefinition__KeyAssignment_0 : ( ( 'counter' ) ) ;
    public final void rule__ListCounterDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8796:1: ( ( ( 'counter' ) ) )
            // InternalPdfMk.g:8797:2: ( ( 'counter' ) )
            {
            // InternalPdfMk.g:8797:2: ( ( 'counter' ) )
            // InternalPdfMk.g:8798:3: ( 'counter' )
            {
             before(grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0()); 
            // InternalPdfMk.g:8799:3: ( 'counter' )
            // InternalPdfMk.g:8800:4: 'counter'
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
    // InternalPdfMk.g:8811:1: rule__ListCounterDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ListCounterDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8815:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:8816:2: ( RULE_INT )
            {
            // InternalPdfMk.g:8816:2: ( RULE_INT )
            // InternalPdfMk.g:8817:3: RULE_INT
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
    // InternalPdfMk.g:8826:1: rule__ListTypeDefinition__KeyAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__ListTypeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8830:1: ( ( ( 'type' ) ) )
            // InternalPdfMk.g:8831:2: ( ( 'type' ) )
            {
            // InternalPdfMk.g:8831:2: ( ( 'type' ) )
            // InternalPdfMk.g:8832:3: ( 'type' )
            {
             before(grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0()); 
            // InternalPdfMk.g:8833:3: ( 'type' )
            // InternalPdfMk.g:8834:4: 'type'
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
    // InternalPdfMk.g:8845:1: rule__ListTypeDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListTypeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8849:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8850:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8850:2: ( RULE_STRING )
            // InternalPdfMk.g:8851:3: RULE_STRING
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
    // InternalPdfMk.g:8860:1: rule__ListColorDefinition__KeyAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ListColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8864:1: ( ( ( 'color' ) ) )
            // InternalPdfMk.g:8865:2: ( ( 'color' ) )
            {
            // InternalPdfMk.g:8865:2: ( ( 'color' ) )
            // InternalPdfMk.g:8866:3: ( 'color' )
            {
             before(grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0()); 
            // InternalPdfMk.g:8867:3: ( 'color' )
            // InternalPdfMk.g:8868:4: 'color'
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
    // InternalPdfMk.g:8879:1: rule__ListColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8883:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8884:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8884:2: ( RULE_STRING )
            // InternalPdfMk.g:8885:3: RULE_STRING
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
    // InternalPdfMk.g:8894:1: rule__ListMarkerColorDefinition__KeyAssignment_0 : ( ( 'markerColor' ) ) ;
    public final void rule__ListMarkerColorDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8898:1: ( ( ( 'markerColor' ) ) )
            // InternalPdfMk.g:8899:2: ( ( 'markerColor' ) )
            {
            // InternalPdfMk.g:8899:2: ( ( 'markerColor' ) )
            // InternalPdfMk.g:8900:3: ( 'markerColor' )
            {
             before(grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0()); 
            // InternalPdfMk.g:8901:3: ( 'markerColor' )
            // InternalPdfMk.g:8902:4: 'markerColor'
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
    // InternalPdfMk.g:8913:1: rule__ListMarkerColorDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListMarkerColorDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8917:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:8918:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:8918:2: ( RULE_STRING )
            // InternalPdfMk.g:8919:3: RULE_STRING
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
    // InternalPdfMk.g:8928:1: rule__TableCellItemElements__ElementsAssignment : ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) ;
    public final void rule__TableCellItemElements__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8932:1: ( ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) ) )
            // InternalPdfMk.g:8933:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            {
            // InternalPdfMk.g:8933:2: ( ( rule__TableCellItemElements__ElementsAlternatives_0 ) )
            // InternalPdfMk.g:8934:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            {
             before(grammarAccess.getTableCellItemElementsAccess().getElementsAlternatives_0()); 
            // InternalPdfMk.g:8935:3: ( rule__TableCellItemElements__ElementsAlternatives_0 )
            // InternalPdfMk.g:8935:4: rule__TableCellItemElements__ElementsAlternatives_0
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
    // InternalPdfMk.g:8943:1: rule__TableRowDefinition__ItemAssignment_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8947:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:8948:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:8948:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:8949:3: ruleTableCellItemElements
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
    // InternalPdfMk.g:8958:1: rule__TableRowDefinition__ItemAssignment_2_1 : ( ruleTableCellItemElements ) ;
    public final void rule__TableRowDefinition__ItemAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8962:1: ( ( ruleTableCellItemElements ) )
            // InternalPdfMk.g:8963:2: ( ruleTableCellItemElements )
            {
            // InternalPdfMk.g:8963:2: ( ruleTableCellItemElements )
            // InternalPdfMk.g:8964:3: ruleTableCellItemElements
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
    // InternalPdfMk.g:8973:1: rule__TableBodyDefinition__KeyAssignment_0 : ( ( 'body' ) ) ;
    public final void rule__TableBodyDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8977:1: ( ( ( 'body' ) ) )
            // InternalPdfMk.g:8978:2: ( ( 'body' ) )
            {
            // InternalPdfMk.g:8978:2: ( ( 'body' ) )
            // InternalPdfMk.g:8979:3: ( 'body' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0()); 
            // InternalPdfMk.g:8980:3: ( 'body' )
            // InternalPdfMk.g:8981:4: 'body'
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
    // InternalPdfMk.g:8992:1: rule__TableBodyDefinition__ValueAssignment_2 : ( ( '[' ) ) ;
    public final void rule__TableBodyDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:8996:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:8997:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:8997:2: ( ( '[' ) )
            // InternalPdfMk.g:8998:3: ( '[' )
            {
             before(grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0()); 
            // InternalPdfMk.g:8999:3: ( '[' )
            // InternalPdfMk.g:9000:4: '['
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
    // InternalPdfMk.g:9011:1: rule__TableBodyDefinition__RowsAssignment_3_0 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9015:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:9016:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:9016:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:9017:3: ruleTableRowDefinition
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
    // InternalPdfMk.g:9026:1: rule__TableBodyDefinition__RowsAssignment_3_1_1 : ( ruleTableRowDefinition ) ;
    public final void rule__TableBodyDefinition__RowsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9030:1: ( ( ruleTableRowDefinition ) )
            // InternalPdfMk.g:9031:2: ( ruleTableRowDefinition )
            {
            // InternalPdfMk.g:9031:2: ( ruleTableRowDefinition )
            // InternalPdfMk.g:9032:3: ruleTableRowDefinition
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
    // InternalPdfMk.g:9041:1: rule__TableDefinition__KeyAssignment_0 : ( ( 'table' ) ) ;
    public final void rule__TableDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9045:1: ( ( ( 'table' ) ) )
            // InternalPdfMk.g:9046:2: ( ( 'table' ) )
            {
            // InternalPdfMk.g:9046:2: ( ( 'table' ) )
            // InternalPdfMk.g:9047:3: ( 'table' )
            {
             before(grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0()); 
            // InternalPdfMk.g:9048:3: ( 'table' )
            // InternalPdfMk.g:9049:4: 'table'
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
    // InternalPdfMk.g:9060:1: rule__TableDefinition__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__TableDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9064:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9065:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9065:2: ( ( '{' ) )
            // InternalPdfMk.g:9066:3: ( '{' )
            {
             before(grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:9067:3: ( '{' )
            // InternalPdfMk.g:9068:4: '{'
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
    // InternalPdfMk.g:9079:1: rule__TableDefinition__BodyAssignment_3 : ( ruleTableBodyDefinition ) ;
    public final void rule__TableDefinition__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9083:1: ( ( ruleTableBodyDefinition ) )
            // InternalPdfMk.g:9084:2: ( ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:9084:2: ( ruleTableBodyDefinition )
            // InternalPdfMk.g:9085:3: ruleTableBodyDefinition
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


    // $ANTLR start "rule__TextObject__ValueAssignment_0"
    // InternalPdfMk.g:9094:1: rule__TextObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TextObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9098:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9099:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9099:2: ( ( '{' ) )
            // InternalPdfMk.g:9100:3: ( '{' )
            {
             before(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9101:3: ( '{' )
            // InternalPdfMk.g:9102:4: '{'
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
    // InternalPdfMk.g:9113:1: rule__TextObject__TextAssignment_1 : ( ruleTextDefinition ) ;
    public final void rule__TextObject__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9117:1: ( ( ruleTextDefinition ) )
            // InternalPdfMk.g:9118:2: ( ruleTextDefinition )
            {
            // InternalPdfMk.g:9118:2: ( ruleTextDefinition )
            // InternalPdfMk.g:9119:3: ruleTextDefinition
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
    // InternalPdfMk.g:9128:1: rule__TextObject__StyleAssignment_2_1 : ( ruleTextStyleDefinition ) ;
    public final void rule__TextObject__StyleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9132:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:9133:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:9133:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:9134:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:9143:1: rule__TextObject__FontSizeAssignment_3_1 : ( ruleFontSizeDefinition ) ;
    public final void rule__TextObject__FontSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9147:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:9148:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:9148:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:9149:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:9158:1: rule__TextObject__AlignmentAssignment_4_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__TextObject__AlignmentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9162:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:9163:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:9163:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:9164:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:9173:1: rule__TextObject__TypeFaceAssignment_5_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__TextObject__TypeFaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9177:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:9178:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:9178:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:9179:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:9188:1: rule__TextObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__TextObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9192:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:9193:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:9193:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:9194:3: ruleItalicsDefinition
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
    // InternalPdfMk.g:9203:1: rule__TextObject__WidthAssignment_7_1 : ( ruleWidthDefinition ) ;
    public final void rule__TextObject__WidthAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9207:1: ( ( ruleWidthDefinition ) )
            // InternalPdfMk.g:9208:2: ( ruleWidthDefinition )
            {
            // InternalPdfMk.g:9208:2: ( ruleWidthDefinition )
            // InternalPdfMk.g:9209:3: ruleWidthDefinition
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
    // InternalPdfMk.g:9218:1: rule__TextObject__MarginAssignment_8_1 : ( ruleMarginDefinition ) ;
    public final void rule__TextObject__MarginAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9222:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:9223:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:9223:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:9224:3: ruleMarginDefinition
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
    // InternalPdfMk.g:9233:1: rule__TextObject__ListCounterAssignment_9_1 : ( ruleListCounterDefinition ) ;
    public final void rule__TextObject__ListCounterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9237:1: ( ( ruleListCounterDefinition ) )
            // InternalPdfMk.g:9238:2: ( ruleListCounterDefinition )
            {
            // InternalPdfMk.g:9238:2: ( ruleListCounterDefinition )
            // InternalPdfMk.g:9239:3: ruleListCounterDefinition
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
    // InternalPdfMk.g:9248:1: rule__ColumnTextObject__ValueAssignment : ( ruleColumnDefinition ) ;
    public final void rule__ColumnTextObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9252:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9253:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9253:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9254:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9263:1: rule__StyleObject__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StyleObject__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9267:1: ( ( RULE_ID ) )
            // InternalPdfMk.g:9268:2: ( RULE_ID )
            {
            // InternalPdfMk.g:9268:2: ( RULE_ID )
            // InternalPdfMk.g:9269:3: RULE_ID
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
    // InternalPdfMk.g:9278:1: rule__StyleObject__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__StyleObject__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9282:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9283:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9283:2: ( ( '{' ) )
            // InternalPdfMk.g:9284:3: ( '{' )
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:9285:3: ( '{' )
            // InternalPdfMk.g:9286:4: '{'
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
    // InternalPdfMk.g:9297:1: rule__StyleObject__FontSizeAssignment_3 : ( ruleFontSizeDefinition ) ;
    public final void rule__StyleObject__FontSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9301:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:9302:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:9302:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:9303:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:9312:1: rule__StyleObject__TypeFaceAssignment_4_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__StyleObject__TypeFaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9316:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:9317:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:9317:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:9318:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:9327:1: rule__StyleObject__AlignmentAssignment_5_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__StyleObject__AlignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9331:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:9332:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:9332:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:9333:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:9342:1: rule__StyleObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__StyleObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9346:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:9347:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:9347:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:9348:3: ruleItalicsDefinition
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
    // InternalPdfMk.g:9357:1: rule__StyleObject__MarginAssignment_7_1 : ( ruleMarginDefinition ) ;
    public final void rule__StyleObject__MarginAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9361:1: ( ( ruleMarginDefinition ) )
            // InternalPdfMk.g:9362:2: ( ruleMarginDefinition )
            {
            // InternalPdfMk.g:9362:2: ( ruleMarginDefinition )
            // InternalPdfMk.g:9363:3: ruleMarginDefinition
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
    // InternalPdfMk.g:9372:1: rule__StyleObjects__ValueAssignment_1_0 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9376:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:9377:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:9377:2: ( ruleStyleObject )
            // InternalPdfMk.g:9378:3: ruleStyleObject
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
    // InternalPdfMk.g:9387:1: rule__StyleObjects__ValueAssignment_1_1_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9391:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:9392:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:9392:2: ( ruleStyleObject )
            // InternalPdfMk.g:9393:3: ruleStyleObject
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
    // InternalPdfMk.g:9402:1: rule__InnerColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__InnerColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9406:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:9407:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:9407:2: ( ( '[' ) )
            // InternalPdfMk.g:9408:3: ( '[' )
            {
             before(grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:9409:3: ( '[' )
            // InternalPdfMk.g:9410:4: '['
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
    // InternalPdfMk.g:9421:1: rule__InnerColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9425:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9426:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9426:2: ( ruleStringObject )
            // InternalPdfMk.g:9427:3: ruleStringObject
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
    // InternalPdfMk.g:9436:1: rule__InnerColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__InnerColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9440:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9441:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9441:2: ( ruleStringObject )
            // InternalPdfMk.g:9442:3: ruleStringObject
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
    // InternalPdfMk.g:9451:1: rule__InnerColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9455:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9456:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9456:2: ( ruleTextObject )
            // InternalPdfMk.g:9457:3: ruleTextObject
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
    // InternalPdfMk.g:9466:1: rule__InnerColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__InnerColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9470:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9471:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9471:2: ( ruleTextObject )
            // InternalPdfMk.g:9472:3: ruleTextObject
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
    // InternalPdfMk.g:9481:1: rule__InnerColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9485:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9486:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9486:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9487:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9496:1: rule__InnerColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__InnerColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9500:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9501:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9501:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9502:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9511:1: rule__ColumnObject__ValueAssignment_0 : ( ( '[' ) ) ;
    public final void rule__ColumnObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9515:1: ( ( ( '[' ) ) )
            // InternalPdfMk.g:9516:2: ( ( '[' ) )
            {
            // InternalPdfMk.g:9516:2: ( ( '[' ) )
            // InternalPdfMk.g:9517:3: ( '[' )
            {
             before(grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0()); 
            // InternalPdfMk.g:9518:3: ( '[' )
            // InternalPdfMk.g:9519:4: '['
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
    // InternalPdfMk.g:9530:1: rule__ColumnObject__TextAssignment_1_0 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9534:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9535:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9535:2: ( ruleStringObject )
            // InternalPdfMk.g:9536:3: ruleStringObject
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
    // InternalPdfMk.g:9545:1: rule__ColumnObject__TextAssignment_1_1_1 : ( ruleStringObject ) ;
    public final void rule__ColumnObject__TextAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9549:1: ( ( ruleStringObject ) )
            // InternalPdfMk.g:9550:2: ( ruleStringObject )
            {
            // InternalPdfMk.g:9550:2: ( ruleStringObject )
            // InternalPdfMk.g:9551:3: ruleStringObject
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
    // InternalPdfMk.g:9560:1: rule__ColumnObject__TextObjectAssignment_2_0 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9564:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9565:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9565:2: ( ruleTextObject )
            // InternalPdfMk.g:9566:3: ruleTextObject
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
    // InternalPdfMk.g:9575:1: rule__ColumnObject__TextObjectAssignment_2_1_1 : ( ruleTextObject ) ;
    public final void rule__ColumnObject__TextObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9579:1: ( ( ruleTextObject ) )
            // InternalPdfMk.g:9580:2: ( ruleTextObject )
            {
            // InternalPdfMk.g:9580:2: ( ruleTextObject )
            // InternalPdfMk.g:9581:3: ruleTextObject
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
    // InternalPdfMk.g:9590:1: rule__ColumnObject__ColumnAssignment_3_0 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9594:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9595:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9595:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9596:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9605:1: rule__ColumnObject__ColumnAssignment_3_1_1 : ( ruleColumnDefinition ) ;
    public final void rule__ColumnObject__ColumnAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9609:1: ( ( ruleColumnDefinition ) )
            // InternalPdfMk.g:9610:2: ( ruleColumnDefinition )
            {
            // InternalPdfMk.g:9610:2: ( ruleColumnDefinition )
            // InternalPdfMk.g:9611:3: ruleColumnDefinition
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
    // InternalPdfMk.g:9620:1: rule__ColumnObject__InnerColumnAssignment_4_0 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9624:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:9625:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:9625:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:9626:3: ruleInnerColumnObject
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
    // InternalPdfMk.g:9635:1: rule__ColumnObject__InnerColumnAssignment_4_1_1 : ( ruleInnerColumnObject ) ;
    public final void rule__ColumnObject__InnerColumnAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9639:1: ( ( ruleInnerColumnObject ) )
            // InternalPdfMk.g:9640:2: ( ruleInnerColumnObject )
            {
            // InternalPdfMk.g:9640:2: ( ruleInnerColumnObject )
            // InternalPdfMk.g:9641:3: ruleInnerColumnObject
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
    // InternalPdfMk.g:9650:1: rule__ImageObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ImageObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9654:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9655:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9655:2: ( ( '{' ) )
            // InternalPdfMk.g:9656:3: ( '{' )
            {
             before(grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9657:3: ( '{' )
            // InternalPdfMk.g:9658:4: '{'
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
    // InternalPdfMk.g:9669:1: rule__ImageObject__ImageAssignment_1 : ( ruleImageDefintion ) ;
    public final void rule__ImageObject__ImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9673:1: ( ( ruleImageDefintion ) )
            // InternalPdfMk.g:9674:2: ( ruleImageDefintion )
            {
            // InternalPdfMk.g:9674:2: ( ruleImageDefintion )
            // InternalPdfMk.g:9675:3: ruleImageDefintion
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
    // InternalPdfMk.g:9684:1: rule__ImageObject__WidthAssignment_2_1 : ( ruleImageWidthDefintion ) ;
    public final void rule__ImageObject__WidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9688:1: ( ( ruleImageWidthDefintion ) )
            // InternalPdfMk.g:9689:2: ( ruleImageWidthDefintion )
            {
            // InternalPdfMk.g:9689:2: ( ruleImageWidthDefintion )
            // InternalPdfMk.g:9690:3: ruleImageWidthDefintion
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
    // InternalPdfMk.g:9699:1: rule__ImageObject__HeightAssignment_3_1 : ( ruleImageHeightDefintion ) ;
    public final void rule__ImageObject__HeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9703:1: ( ( ruleImageHeightDefintion ) )
            // InternalPdfMk.g:9704:2: ( ruleImageHeightDefintion )
            {
            // InternalPdfMk.g:9704:2: ( ruleImageHeightDefintion )
            // InternalPdfMk.g:9705:3: ruleImageHeightDefintion
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
    // InternalPdfMk.g:9714:1: rule__ImageObject__OpacityAssignment_4_1 : ( ruleImageOpacityDefinition ) ;
    public final void rule__ImageObject__OpacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9718:1: ( ( ruleImageOpacityDefinition ) )
            // InternalPdfMk.g:9719:2: ( ruleImageOpacityDefinition )
            {
            // InternalPdfMk.g:9719:2: ( ruleImageOpacityDefinition )
            // InternalPdfMk.g:9720:3: ruleImageOpacityDefinition
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
    // InternalPdfMk.g:9729:1: rule__ImageObject__FitAssignment_5_1 : ( ruleImageFitDefinition ) ;
    public final void rule__ImageObject__FitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9733:1: ( ( ruleImageFitDefinition ) )
            // InternalPdfMk.g:9734:2: ( ruleImageFitDefinition )
            {
            // InternalPdfMk.g:9734:2: ( ruleImageFitDefinition )
            // InternalPdfMk.g:9735:3: ruleImageFitDefinition
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
    // InternalPdfMk.g:9744:1: rule__ImageObject__PageBreakAssignment_6_1 : ( ruleImagePageBreakDefinition ) ;
    public final void rule__ImageObject__PageBreakAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9748:1: ( ( ruleImagePageBreakDefinition ) )
            // InternalPdfMk.g:9749:2: ( ruleImagePageBreakDefinition )
            {
            // InternalPdfMk.g:9749:2: ( ruleImagePageBreakDefinition )
            // InternalPdfMk.g:9750:3: ruleImagePageBreakDefinition
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
    // InternalPdfMk.g:9759:1: rule__ListObjectPropertiesWrapper__ValueAssignment : ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) ;
    public final void rule__ListObjectPropertiesWrapper__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9763:1: ( ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:9764:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:9764:2: ( ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 ) )
            // InternalPdfMk.g:9765:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            {
             before(grammarAccess.getListObjectPropertiesWrapperAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:9766:3: ( rule__ListObjectPropertiesWrapper__ValueAlternatives_0 )
            // InternalPdfMk.g:9766:4: rule__ListObjectPropertiesWrapper__ValueAlternatives_0
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
    // InternalPdfMk.g:9774:1: rule__ListElements__ElValuesAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListElements__ElValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9778:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:9779:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:9779:2: ( RULE_STRING )
            // InternalPdfMk.g:9780:3: RULE_STRING
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
    // InternalPdfMk.g:9789:1: rule__ListObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__ListObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9793:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9794:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9794:2: ( ( '{' ) )
            // InternalPdfMk.g:9795:3: ( '{' )
            {
             before(grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9796:3: ( '{' )
            // InternalPdfMk.g:9797:4: '{'
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
    // InternalPdfMk.g:9808:1: rule__ListObject__PropertiesAssignment_1_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9812:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:9813:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:9813:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:9814:3: ruleListObjectPropertiesWrapper
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
    // InternalPdfMk.g:9823:1: rule__ListObject__PropertiesAssignment_1_2_0 : ( ruleListObjectPropertiesWrapper ) ;
    public final void rule__ListObject__PropertiesAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9827:1: ( ( ruleListObjectPropertiesWrapper ) )
            // InternalPdfMk.g:9828:2: ( ruleListObjectPropertiesWrapper )
            {
            // InternalPdfMk.g:9828:2: ( ruleListObjectPropertiesWrapper )
            // InternalPdfMk.g:9829:3: ruleListObjectPropertiesWrapper
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
    // InternalPdfMk.g:9838:1: rule__ListObject__ElementsAssignment_5_0 : ( ruleListElements ) ;
    public final void rule__ListObject__ElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9842:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:9843:2: ( ruleListElements )
            {
            // InternalPdfMk.g:9843:2: ( ruleListElements )
            // InternalPdfMk.g:9844:3: ruleListElements
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
    // InternalPdfMk.g:9853:1: rule__ListObject__ElemtensAssignment_5_1_1 : ( ruleListElements ) ;
    public final void rule__ListObject__ElemtensAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9857:1: ( ( ruleListElements ) )
            // InternalPdfMk.g:9858:2: ( ruleListElements )
            {
            // InternalPdfMk.g:9858:2: ( ruleListElements )
            // InternalPdfMk.g:9859:3: ruleListElements
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
    // InternalPdfMk.g:9868:1: rule__TableObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TableObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9872:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:9873:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:9873:2: ( ( '{' ) )
            // InternalPdfMk.g:9874:3: ( '{' )
            {
             before(grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:9875:3: ( '{' )
            // InternalPdfMk.g:9876:4: '{'
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
    // InternalPdfMk.g:9887:1: rule__TableObject__StyleAssignment_1_0 : ( ruleTextStyleDefinition ) ;
    public final void rule__TableObject__StyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9891:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:9892:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:9892:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:9893:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:9902:1: rule__TableObject__TableAssignment_2 : ( ruleTableDefinition ) ;
    public final void rule__TableObject__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9906:1: ( ( ruleTableDefinition ) )
            // InternalPdfMk.g:9907:2: ( ruleTableDefinition )
            {
            // InternalPdfMk.g:9907:2: ( ruleTableDefinition )
            // InternalPdfMk.g:9908:3: ruleTableDefinition
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
    // InternalPdfMk.g:9917:1: rule__ContentObject__ValueAssignment : ( ( rule__ContentObject__ValueAlternatives_0 ) ) ;
    public final void rule__ContentObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9921:1: ( ( ( rule__ContentObject__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:9922:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:9922:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            // InternalPdfMk.g:9923:3: ( rule__ContentObject__ValueAlternatives_0 )
            {
             before(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:9924:3: ( rule__ContentObject__ValueAlternatives_0 )
            // InternalPdfMk.g:9924:4: rule__ContentObject__ValueAlternatives_0
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
    // InternalPdfMk.g:9932:1: rule__ContentObjects__ValueAssignment_1_0 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9936:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:9937:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:9937:2: ( ruleContentObject )
            // InternalPdfMk.g:9938:3: ruleContentObject
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
    // InternalPdfMk.g:9947:1: rule__ContentObjects__ValueAssignment_1_1_1 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9951:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:9952:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:9952:2: ( ruleContentObject )
            // InternalPdfMk.g:9953:3: ruleContentObject
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
    // InternalPdfMk.g:9962:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9966:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:9967:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:9967:2: ( ( 'styles' ) )
            // InternalPdfMk.g:9968:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:9969:3: ( 'styles' )
            // InternalPdfMk.g:9970:4: 'styles'
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
    // InternalPdfMk.g:9981:1: rule__Styles__ValueAssignment_2 : ( ruleStyleObjects ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:9985:1: ( ( ruleStyleObjects ) )
            // InternalPdfMk.g:9986:2: ( ruleStyleObjects )
            {
            // InternalPdfMk.g:9986:2: ( ruleStyleObjects )
            // InternalPdfMk.g:9987:3: ruleStyleObjects
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
    // InternalPdfMk.g:9996:1: rule__Content__KeyAssignment_0 : ( ( 'content' ) ) ;
    public final void rule__Content__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:10000:1: ( ( ( 'content' ) ) )
            // InternalPdfMk.g:10001:2: ( ( 'content' ) )
            {
            // InternalPdfMk.g:10001:2: ( ( 'content' ) )
            // InternalPdfMk.g:10002:3: ( 'content' )
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            // InternalPdfMk.g:10003:3: ( 'content' )
            // InternalPdfMk.g:10004:4: 'content'
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
    // InternalPdfMk.g:10015:1: rule__Content__ValueAssignment_2 : ( ruleContentObjects ) ;
    public final void rule__Content__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:10019:1: ( ( ruleContentObjects ) )
            // InternalPdfMk.g:10020:2: ( ruleContentObjects )
            {
            // InternalPdfMk.g:10020:2: ( ruleContentObjects )
            // InternalPdfMk.g:10021:3: ruleContentObjects
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\15\1\25\5\uffff\1\5\1\24\1\37";
    static final String dfa_3s = "\1\22\1\uffff\1\54\1\25\5\uffff\1\5\1\24\1\54";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\6\1\5\1\4\1\2\1\3\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
            "",
            "\2\5\4\uffff\2\6\1\uffff\2\7\3\uffff\1\3\3\uffff\1\10\1\uffff\1\6\4\uffff\5\5\1\uffff\1\4",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\10\14\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1289:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) | ( ruleColumnTextObject ) | ( ruleImageObject ) | ( ruleListObject ) | ( ruleTableObject ) );";
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
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
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000001040020L});

}