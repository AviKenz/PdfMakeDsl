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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'var'", "'dd'", "'='", "'{'", "'}'", "','", "':'", "'text:'", "'['", "']'", "'alignment'", "'bold'", "'style'", "'italics'", "'fontSize'", "'styles'", "'content'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=6;
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


    // $ANTLR start "entryRuleBooleanDefinition"
    // InternalPdfMk.g:128:1: entryRuleBooleanDefinition : ruleBooleanDefinition EOF ;
    public final void entryRuleBooleanDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:129:1: ( ruleBooleanDefinition EOF )
            // InternalPdfMk.g:130:1: ruleBooleanDefinition EOF
            {
             before(grammarAccess.getBooleanDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanDefinition();

            state._fsp--;

             after(grammarAccess.getBooleanDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanDefinition"


    // $ANTLR start "ruleBooleanDefinition"
    // InternalPdfMk.g:137:1: ruleBooleanDefinition : ( ( rule__BooleanDefinition__Alternatives ) ) ;
    public final void ruleBooleanDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:141:2: ( ( ( rule__BooleanDefinition__Alternatives ) ) )
            // InternalPdfMk.g:142:2: ( ( rule__BooleanDefinition__Alternatives ) )
            {
            // InternalPdfMk.g:142:2: ( ( rule__BooleanDefinition__Alternatives ) )
            // InternalPdfMk.g:143:3: ( rule__BooleanDefinition__Alternatives )
            {
             before(grammarAccess.getBooleanDefinitionAccess().getAlternatives()); 
            // InternalPdfMk.g:144:3: ( rule__BooleanDefinition__Alternatives )
            // InternalPdfMk.g:144:4: rule__BooleanDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanDefinition"


    // $ANTLR start "entryRuleTextStyleDefinition"
    // InternalPdfMk.g:153:1: entryRuleTextStyleDefinition : ruleTextStyleDefinition EOF ;
    public final void entryRuleTextStyleDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:154:1: ( ruleTextStyleDefinition EOF )
            // InternalPdfMk.g:155:1: ruleTextStyleDefinition EOF
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
    // InternalPdfMk.g:162:1: ruleTextStyleDefinition : ( ( rule__TextStyleDefinition__Group__0 ) ) ;
    public final void ruleTextStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:166:2: ( ( ( rule__TextStyleDefinition__Group__0 ) ) )
            // InternalPdfMk.g:167:2: ( ( rule__TextStyleDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:167:2: ( ( rule__TextStyleDefinition__Group__0 ) )
            // InternalPdfMk.g:168:3: ( rule__TextStyleDefinition__Group__0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:169:3: ( rule__TextStyleDefinition__Group__0 )
            // InternalPdfMk.g:169:4: rule__TextStyleDefinition__Group__0
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
    // InternalPdfMk.g:178:1: entryRuleTextDefinition : ruleTextDefinition EOF ;
    public final void entryRuleTextDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:179:1: ( ruleTextDefinition EOF )
            // InternalPdfMk.g:180:1: ruleTextDefinition EOF
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
    // InternalPdfMk.g:187:1: ruleTextDefinition : ( ( rule__TextDefinition__Alternatives ) ) ;
    public final void ruleTextDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:191:2: ( ( ( rule__TextDefinition__Alternatives ) ) )
            // InternalPdfMk.g:192:2: ( ( rule__TextDefinition__Alternatives ) )
            {
            // InternalPdfMk.g:192:2: ( ( rule__TextDefinition__Alternatives ) )
            // InternalPdfMk.g:193:3: ( rule__TextDefinition__Alternatives )
            {
             before(grammarAccess.getTextDefinitionAccess().getAlternatives()); 
            // InternalPdfMk.g:194:3: ( rule__TextDefinition__Alternatives )
            // InternalPdfMk.g:194:4: rule__TextDefinition__Alternatives
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
    // InternalPdfMk.g:203:1: entryRuleTextAlignmentDefinition : ruleTextAlignmentDefinition EOF ;
    public final void entryRuleTextAlignmentDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:204:1: ( ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:205:1: ruleTextAlignmentDefinition EOF
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
    // InternalPdfMk.g:212:1: ruleTextAlignmentDefinition : ( ( rule__TextAlignmentDefinition__Group__0 ) ) ;
    public final void ruleTextAlignmentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:216:2: ( ( ( rule__TextAlignmentDefinition__Group__0 ) ) )
            // InternalPdfMk.g:217:2: ( ( rule__TextAlignmentDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:217:2: ( ( rule__TextAlignmentDefinition__Group__0 ) )
            // InternalPdfMk.g:218:3: ( rule__TextAlignmentDefinition__Group__0 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:219:3: ( rule__TextAlignmentDefinition__Group__0 )
            // InternalPdfMk.g:219:4: rule__TextAlignmentDefinition__Group__0
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
    // InternalPdfMk.g:228:1: entryRuleItalicsDefinition : ruleItalicsDefinition EOF ;
    public final void entryRuleItalicsDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:229:1: ( ruleItalicsDefinition EOF )
            // InternalPdfMk.g:230:1: ruleItalicsDefinition EOF
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
    // InternalPdfMk.g:237:1: ruleItalicsDefinition : ( ( rule__ItalicsDefinition__Group__0 ) ) ;
    public final void ruleItalicsDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:241:2: ( ( ( rule__ItalicsDefinition__Group__0 ) ) )
            // InternalPdfMk.g:242:2: ( ( rule__ItalicsDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:242:2: ( ( rule__ItalicsDefinition__Group__0 ) )
            // InternalPdfMk.g:243:3: ( rule__ItalicsDefinition__Group__0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:244:3: ( rule__ItalicsDefinition__Group__0 )
            // InternalPdfMk.g:244:4: rule__ItalicsDefinition__Group__0
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
    // InternalPdfMk.g:253:1: entryRuleFontSizeDefinition : ruleFontSizeDefinition EOF ;
    public final void entryRuleFontSizeDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:254:1: ( ruleFontSizeDefinition EOF )
            // InternalPdfMk.g:255:1: ruleFontSizeDefinition EOF
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
    // InternalPdfMk.g:262:1: ruleFontSizeDefinition : ( ( rule__FontSizeDefinition__Group__0 ) ) ;
    public final void ruleFontSizeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:266:2: ( ( ( rule__FontSizeDefinition__Group__0 ) ) )
            // InternalPdfMk.g:267:2: ( ( rule__FontSizeDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:267:2: ( ( rule__FontSizeDefinition__Group__0 ) )
            // InternalPdfMk.g:268:3: ( rule__FontSizeDefinition__Group__0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:269:3: ( rule__FontSizeDefinition__Group__0 )
            // InternalPdfMk.g:269:4: rule__FontSizeDefinition__Group__0
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


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:278:1: entryRuleTextObject : ruleTextObject EOF ;
    public final void entryRuleTextObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:279:1: ( ruleTextObject EOF )
            // InternalPdfMk.g:280:1: ruleTextObject EOF
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
    // InternalPdfMk.g:287:1: ruleTextObject : ( ( rule__TextObject__Group__0 ) ) ;
    public final void ruleTextObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:291:2: ( ( ( rule__TextObject__Group__0 ) ) )
            // InternalPdfMk.g:292:2: ( ( rule__TextObject__Group__0 ) )
            {
            // InternalPdfMk.g:292:2: ( ( rule__TextObject__Group__0 ) )
            // InternalPdfMk.g:293:3: ( rule__TextObject__Group__0 )
            {
             before(grammarAccess.getTextObjectAccess().getGroup()); 
            // InternalPdfMk.g:294:3: ( rule__TextObject__Group__0 )
            // InternalPdfMk.g:294:4: rule__TextObject__Group__0
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


    // $ANTLR start "entryRuleStyleObject"
    // InternalPdfMk.g:303:1: entryRuleStyleObject : ruleStyleObject EOF ;
    public final void entryRuleStyleObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:304:1: ( ruleStyleObject EOF )
            // InternalPdfMk.g:305:1: ruleStyleObject EOF
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
    // InternalPdfMk.g:312:1: ruleStyleObject : ( ( rule__StyleObject__Group__0 ) ) ;
    public final void ruleStyleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:316:2: ( ( ( rule__StyleObject__Group__0 ) ) )
            // InternalPdfMk.g:317:2: ( ( rule__StyleObject__Group__0 ) )
            {
            // InternalPdfMk.g:317:2: ( ( rule__StyleObject__Group__0 ) )
            // InternalPdfMk.g:318:3: ( rule__StyleObject__Group__0 )
            {
             before(grammarAccess.getStyleObjectAccess().getGroup()); 
            // InternalPdfMk.g:319:3: ( rule__StyleObject__Group__0 )
            // InternalPdfMk.g:319:4: rule__StyleObject__Group__0
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
    // InternalPdfMk.g:328:1: entryRuleStyleObjects : ruleStyleObjects EOF ;
    public final void entryRuleStyleObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:329:1: ( ruleStyleObjects EOF )
            // InternalPdfMk.g:330:1: ruleStyleObjects EOF
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
    // InternalPdfMk.g:337:1: ruleStyleObjects : ( ( rule__StyleObjects__Group__0 ) ) ;
    public final void ruleStyleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:341:2: ( ( ( rule__StyleObjects__Group__0 ) ) )
            // InternalPdfMk.g:342:2: ( ( rule__StyleObjects__Group__0 ) )
            {
            // InternalPdfMk.g:342:2: ( ( rule__StyleObjects__Group__0 ) )
            // InternalPdfMk.g:343:3: ( rule__StyleObjects__Group__0 )
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup()); 
            // InternalPdfMk.g:344:3: ( rule__StyleObjects__Group__0 )
            // InternalPdfMk.g:344:4: rule__StyleObjects__Group__0
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


    // $ANTLR start "entryRuleContentObject"
    // InternalPdfMk.g:353:1: entryRuleContentObject : ruleContentObject EOF ;
    public final void entryRuleContentObject() throws RecognitionException {
        try {
            // InternalPdfMk.g:354:1: ( ruleContentObject EOF )
            // InternalPdfMk.g:355:1: ruleContentObject EOF
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
    // InternalPdfMk.g:362:1: ruleContentObject : ( ( rule__ContentObject__ValueAssignment ) ) ;
    public final void ruleContentObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:366:2: ( ( ( rule__ContentObject__ValueAssignment ) ) )
            // InternalPdfMk.g:367:2: ( ( rule__ContentObject__ValueAssignment ) )
            {
            // InternalPdfMk.g:367:2: ( ( rule__ContentObject__ValueAssignment ) )
            // InternalPdfMk.g:368:3: ( rule__ContentObject__ValueAssignment )
            {
             before(grammarAccess.getContentObjectAccess().getValueAssignment()); 
            // InternalPdfMk.g:369:3: ( rule__ContentObject__ValueAssignment )
            // InternalPdfMk.g:369:4: rule__ContentObject__ValueAssignment
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
    // InternalPdfMk.g:378:1: entryRuleContentObjects : ruleContentObjects EOF ;
    public final void entryRuleContentObjects() throws RecognitionException {
        try {
            // InternalPdfMk.g:379:1: ( ruleContentObjects EOF )
            // InternalPdfMk.g:380:1: ruleContentObjects EOF
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
    // InternalPdfMk.g:387:1: ruleContentObjects : ( ( rule__ContentObjects__Group__0 ) ) ;
    public final void ruleContentObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:391:2: ( ( ( rule__ContentObjects__Group__0 ) ) )
            // InternalPdfMk.g:392:2: ( ( rule__ContentObjects__Group__0 ) )
            {
            // InternalPdfMk.g:392:2: ( ( rule__ContentObjects__Group__0 ) )
            // InternalPdfMk.g:393:3: ( rule__ContentObjects__Group__0 )
            {
             before(grammarAccess.getContentObjectsAccess().getGroup()); 
            // InternalPdfMk.g:394:3: ( rule__ContentObjects__Group__0 )
            // InternalPdfMk.g:394:4: rule__ContentObjects__Group__0
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
    // InternalPdfMk.g:403:1: entryRuleStyles : ruleStyles EOF ;
    public final void entryRuleStyles() throws RecognitionException {
        try {
            // InternalPdfMk.g:404:1: ( ruleStyles EOF )
            // InternalPdfMk.g:405:1: ruleStyles EOF
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
    // InternalPdfMk.g:412:1: ruleStyles : ( ( rule__Styles__Group__0 ) ) ;
    public final void ruleStyles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:416:2: ( ( ( rule__Styles__Group__0 ) ) )
            // InternalPdfMk.g:417:2: ( ( rule__Styles__Group__0 ) )
            {
            // InternalPdfMk.g:417:2: ( ( rule__Styles__Group__0 ) )
            // InternalPdfMk.g:418:3: ( rule__Styles__Group__0 )
            {
             before(grammarAccess.getStylesAccess().getGroup()); 
            // InternalPdfMk.g:419:3: ( rule__Styles__Group__0 )
            // InternalPdfMk.g:419:4: rule__Styles__Group__0
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
    // InternalPdfMk.g:428:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:429:1: ( ruleContent EOF )
            // InternalPdfMk.g:430:1: ruleContent EOF
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
    // InternalPdfMk.g:437:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:441:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPdfMk.g:442:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPdfMk.g:442:2: ( ( rule__Content__Group__0 ) )
            // InternalPdfMk.g:443:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPdfMk.g:444:3: ( rule__Content__Group__0 )
            // InternalPdfMk.g:444:4: rule__Content__Group__0
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


    // $ANTLR start "rule__BooleanDefinition__Alternatives"
    // InternalPdfMk.g:452:1: rule__BooleanDefinition__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:456:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalPdfMk.g:457:2: ( 'true' )
                    {
                    // InternalPdfMk.g:457:2: ( 'true' )
                    // InternalPdfMk.g:458:3: 'true'
                    {
                     before(grammarAccess.getBooleanDefinitionAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanDefinitionAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:463:2: ( 'false' )
                    {
                    // InternalPdfMk.g:463:2: ( 'false' )
                    // InternalPdfMk.g:464:3: 'false'
                    {
                     before(grammarAccess.getBooleanDefinitionAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanDefinitionAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BooleanDefinition__Alternatives"


    // $ANTLR start "rule__TextDefinition__Alternatives"
    // InternalPdfMk.g:473:1: rule__TextDefinition__Alternatives : ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) );
    public final void rule__TextDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:477:1: ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:478:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    {
                    // InternalPdfMk.g:478:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    // InternalPdfMk.g:479:3: ( rule__TextDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_0()); 
                    // InternalPdfMk.g:480:3: ( rule__TextDefinition__Group_0__0 )
                    // InternalPdfMk.g:480:4: rule__TextDefinition__Group_0__0
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
                    // InternalPdfMk.g:484:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    {
                    // InternalPdfMk.g:484:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    // InternalPdfMk.g:485:3: ( rule__TextDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_1()); 
                    // InternalPdfMk.g:486:3: ( rule__TextDefinition__Group_1__0 )
                    // InternalPdfMk.g:486:4: rule__TextDefinition__Group_1__0
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


    // $ANTLR start "rule__ContentObject__ValueAlternatives_0"
    // InternalPdfMk.g:494:1: rule__ContentObject__ValueAlternatives_0 : ( ( ruleStringObject ) | ( ruleTextObject ) );
    public final void rule__ContentObject__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:498:1: ( ( ruleStringObject ) | ( ruleTextObject ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPdfMk.g:499:2: ( ruleStringObject )
                    {
                    // InternalPdfMk.g:499:2: ( ruleStringObject )
                    // InternalPdfMk.g:500:3: ruleStringObject
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
                    // InternalPdfMk.g:505:2: ( ruleTextObject )
                    {
                    // InternalPdfMk.g:505:2: ( ruleTextObject )
                    // InternalPdfMk.g:506:3: ruleTextObject
                    {
                     before(grammarAccess.getContentObjectAccess().getValueTextObjectParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextObject();

                    state._fsp--;

                     after(grammarAccess.getContentObjectAccess().getValueTextObjectParserRuleCall_0_1()); 

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
    // InternalPdfMk.g:515:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:519:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:520:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
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
    // InternalPdfMk.g:527:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:531:1: ( ( 'var' ) )
            // InternalPdfMk.g:532:1: ( 'var' )
            {
            // InternalPdfMk.g:532:1: ( 'var' )
            // InternalPdfMk.g:533:2: 'var'
            {
             before(grammarAccess.getDocDefinitionAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalPdfMk.g:542:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:546:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:547:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
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
    // InternalPdfMk.g:554:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:558:1: ( ( 'dd' ) )
            // InternalPdfMk.g:559:1: ( 'dd' )
            {
            // InternalPdfMk.g:559:1: ( 'dd' )
            // InternalPdfMk.g:560:2: 'dd'
            {
             before(grammarAccess.getDocDefinitionAccess().getDdKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalPdfMk.g:569:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:573:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:574:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
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
    // InternalPdfMk.g:581:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:585:1: ( ( '=' ) )
            // InternalPdfMk.g:586:1: ( '=' )
            {
            // InternalPdfMk.g:586:1: ( '=' )
            // InternalPdfMk.g:587:2: '='
            {
             before(grammarAccess.getDocDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalPdfMk.g:596:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:600:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:601:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
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
    // InternalPdfMk.g:608:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:612:1: ( ( '{' ) )
            // InternalPdfMk.g:613:1: ( '{' )
            {
            // InternalPdfMk.g:613:1: ( '{' )
            // InternalPdfMk.g:614:2: '{'
            {
             before(grammarAccess.getDocDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPdfMk.g:623:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:627:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:628:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
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
    // InternalPdfMk.g:635:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:639:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:640:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:640:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:641:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:642:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:642:3: rule__DocDefinition__ContentAssignment_4
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
    // InternalPdfMk.g:650:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:654:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:655:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
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
    // InternalPdfMk.g:662:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:666:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:667:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:667:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:668:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:669:2: ( rule__DocDefinition__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:669:3: rule__DocDefinition__Group_5__0
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
    // InternalPdfMk.g:677:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:681:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:682:2: rule__DocDefinition__Group__6__Impl
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
    // InternalPdfMk.g:688:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:692:1: ( ( '}' ) )
            // InternalPdfMk.g:693:1: ( '}' )
            {
            // InternalPdfMk.g:693:1: ( '}' )
            // InternalPdfMk.g:694:2: '}'
            {
             before(grammarAccess.getDocDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalPdfMk.g:704:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:708:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:709:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
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
    // InternalPdfMk.g:716:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:720:1: ( ( ',' ) )
            // InternalPdfMk.g:721:1: ( ',' )
            {
            // InternalPdfMk.g:721:1: ( ',' )
            // InternalPdfMk.g:722:2: ','
            {
             before(grammarAccess.getDocDefinitionAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:731:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:735:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:736:2: rule__DocDefinition__Group_5__1__Impl
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
    // InternalPdfMk.g:742:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:746:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:747:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:747:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:748:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:749:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:749:3: rule__DocDefinition__StylesAssignment_5_1
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
    // InternalPdfMk.g:758:1: rule__TypeFaceDefinition__Group__0 : rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 ;
    public final void rule__TypeFaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:762:1: ( rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1 )
            // InternalPdfMk.g:763:2: rule__TypeFaceDefinition__Group__0__Impl rule__TypeFaceDefinition__Group__1
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
    // InternalPdfMk.g:770:1: rule__TypeFaceDefinition__Group__0__Impl : ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TypeFaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:774:1: ( ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:775:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:775:1: ( ( rule__TypeFaceDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:776:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:777:2: ( rule__TypeFaceDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:777:3: rule__TypeFaceDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:785:1: rule__TypeFaceDefinition__Group__1 : rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 ;
    public final void rule__TypeFaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:789:1: ( rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2 )
            // InternalPdfMk.g:790:2: rule__TypeFaceDefinition__Group__1__Impl rule__TypeFaceDefinition__Group__2
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
    // InternalPdfMk.g:797:1: rule__TypeFaceDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeFaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:801:1: ( ( ':' ) )
            // InternalPdfMk.g:802:1: ( ':' )
            {
            // InternalPdfMk.g:802:1: ( ':' )
            // InternalPdfMk.g:803:2: ':'
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:812:1: rule__TypeFaceDefinition__Group__2 : rule__TypeFaceDefinition__Group__2__Impl ;
    public final void rule__TypeFaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:816:1: ( rule__TypeFaceDefinition__Group__2__Impl )
            // InternalPdfMk.g:817:2: rule__TypeFaceDefinition__Group__2__Impl
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
    // InternalPdfMk.g:823:1: rule__TypeFaceDefinition__Group__2__Impl : ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TypeFaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:827:1: ( ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:828:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:828:1: ( ( rule__TypeFaceDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:829:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:830:2: ( rule__TypeFaceDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:830:3: rule__TypeFaceDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:839:1: rule__TextStyleDefinition__Group__0 : rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 ;
    public final void rule__TextStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:843:1: ( rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1 )
            // InternalPdfMk.g:844:2: rule__TextStyleDefinition__Group__0__Impl rule__TextStyleDefinition__Group__1
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
    // InternalPdfMk.g:851:1: rule__TextStyleDefinition__Group__0__Impl : ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:855:1: ( ( ( rule__TextStyleDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:856:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:856:1: ( ( rule__TextStyleDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:857:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:858:2: ( rule__TextStyleDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:858:3: rule__TextStyleDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:866:1: rule__TextStyleDefinition__Group__1 : rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 ;
    public final void rule__TextStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:870:1: ( rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2 )
            // InternalPdfMk.g:871:2: rule__TextStyleDefinition__Group__1__Impl rule__TextStyleDefinition__Group__2
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
    // InternalPdfMk.g:878:1: rule__TextStyleDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:882:1: ( ( ':' ) )
            // InternalPdfMk.g:883:1: ( ':' )
            {
            // InternalPdfMk.g:883:1: ( ':' )
            // InternalPdfMk.g:884:2: ':'
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:893:1: rule__TextStyleDefinition__Group__2 : rule__TextStyleDefinition__Group__2__Impl ;
    public final void rule__TextStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:897:1: ( rule__TextStyleDefinition__Group__2__Impl )
            // InternalPdfMk.g:898:2: rule__TextStyleDefinition__Group__2__Impl
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
    // InternalPdfMk.g:904:1: rule__TextStyleDefinition__Group__2__Impl : ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:908:1: ( ( ( rule__TextStyleDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:909:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:909:1: ( ( rule__TextStyleDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:910:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:911:2: ( rule__TextStyleDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:911:3: rule__TextStyleDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:920:1: rule__TextDefinition__Group_0__0 : rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 ;
    public final void rule__TextDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:924:1: ( rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 )
            // InternalPdfMk.g:925:2: rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1
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
    // InternalPdfMk.g:932:1: rule__TextDefinition__Group_0__0__Impl : ( 'text:' ) ;
    public final void rule__TextDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:936:1: ( ( 'text:' ) )
            // InternalPdfMk.g:937:1: ( 'text:' )
            {
            // InternalPdfMk.g:937:1: ( 'text:' )
            // InternalPdfMk.g:938:2: 'text:'
            {
             before(grammarAccess.getTextDefinitionAccess().getTextKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalPdfMk.g:947:1: rule__TextDefinition__Group_0__1 : rule__TextDefinition__Group_0__1__Impl ;
    public final void rule__TextDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:951:1: ( rule__TextDefinition__Group_0__1__Impl )
            // InternalPdfMk.g:952:2: rule__TextDefinition__Group_0__1__Impl
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
    // InternalPdfMk.g:958:1: rule__TextDefinition__Group_0__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:962:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:963:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:963:1: ( RULE_STRING )
            // InternalPdfMk.g:964:2: RULE_STRING
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
    // InternalPdfMk.g:974:1: rule__TextDefinition__Group_1__0 : rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 ;
    public final void rule__TextDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:978:1: ( rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 )
            // InternalPdfMk.g:979:2: rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1
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
    // InternalPdfMk.g:986:1: rule__TextDefinition__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TextDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:990:1: ( ( '[' ) )
            // InternalPdfMk.g:991:1: ( '[' )
            {
            // InternalPdfMk.g:991:1: ( '[' )
            // InternalPdfMk.g:992:2: '['
            {
             before(grammarAccess.getTextDefinitionAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalPdfMk.g:1001:1: rule__TextDefinition__Group_1__1 : rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 ;
    public final void rule__TextDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1005:1: ( rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 )
            // InternalPdfMk.g:1006:2: rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2
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
    // InternalPdfMk.g:1013:1: rule__TextDefinition__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1017:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1018:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1018:1: ( RULE_STRING )
            // InternalPdfMk.g:1019:2: RULE_STRING
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
    // InternalPdfMk.g:1028:1: rule__TextDefinition__Group_1__2 : rule__TextDefinition__Group_1__2__Impl ;
    public final void rule__TextDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1032:1: ( rule__TextDefinition__Group_1__2__Impl )
            // InternalPdfMk.g:1033:2: rule__TextDefinition__Group_1__2__Impl
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
    // InternalPdfMk.g:1039:1: rule__TextDefinition__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TextDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1043:1: ( ( ']' ) )
            // InternalPdfMk.g:1044:1: ( ']' )
            {
            // InternalPdfMk.g:1044:1: ( ']' )
            // InternalPdfMk.g:1045:2: ']'
            {
             before(grammarAccess.getTextDefinitionAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:1055:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1059:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:1060:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
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
    // InternalPdfMk.g:1067:1: rule__TextAlignmentDefinition__Group__0__Impl : ( 'alignment' ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1071:1: ( ( 'alignment' ) )
            // InternalPdfMk.g:1072:1: ( 'alignment' )
            {
            // InternalPdfMk.g:1072:1: ( 'alignment' )
            // InternalPdfMk.g:1073:2: 'alignment'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getAlignmentKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:1082:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1086:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:1087:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
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
    // InternalPdfMk.g:1094:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1098:1: ( ( ':' ) )
            // InternalPdfMk.g:1099:1: ( ':' )
            {
            // InternalPdfMk.g:1099:1: ( ':' )
            // InternalPdfMk.g:1100:2: ':'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:1109:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1113:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:1114:2: rule__TextAlignmentDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1120:1: rule__TextAlignmentDefinition__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1124:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1125:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:1125:1: ( RULE_STRING )
            // InternalPdfMk.g:1126:2: RULE_STRING
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
    // InternalPdfMk.g:1136:1: rule__ItalicsDefinition__Group__0 : rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 ;
    public final void rule__ItalicsDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1140:1: ( rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1 )
            // InternalPdfMk.g:1141:2: rule__ItalicsDefinition__Group__0__Impl rule__ItalicsDefinition__Group__1
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
    // InternalPdfMk.g:1148:1: rule__ItalicsDefinition__Group__0__Impl : ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) ;
    public final void rule__ItalicsDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1152:1: ( ( ( rule__ItalicsDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1153:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1153:1: ( ( rule__ItalicsDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1154:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1155:2: ( rule__ItalicsDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1155:3: rule__ItalicsDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1163:1: rule__ItalicsDefinition__Group__1 : rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 ;
    public final void rule__ItalicsDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1167:1: ( rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2 )
            // InternalPdfMk.g:1168:2: rule__ItalicsDefinition__Group__1__Impl rule__ItalicsDefinition__Group__2
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
    // InternalPdfMk.g:1175:1: rule__ItalicsDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ItalicsDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1179:1: ( ( ':' ) )
            // InternalPdfMk.g:1180:1: ( ':' )
            {
            // InternalPdfMk.g:1180:1: ( ':' )
            // InternalPdfMk.g:1181:2: ':'
            {
             before(grammarAccess.getItalicsDefinitionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:1190:1: rule__ItalicsDefinition__Group__2 : rule__ItalicsDefinition__Group__2__Impl ;
    public final void rule__ItalicsDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1194:1: ( rule__ItalicsDefinition__Group__2__Impl )
            // InternalPdfMk.g:1195:2: rule__ItalicsDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1201:1: rule__ItalicsDefinition__Group__2__Impl : ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) ;
    public final void rule__ItalicsDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1205:1: ( ( ( rule__ItalicsDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1206:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1206:1: ( ( rule__ItalicsDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1207:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1208:2: ( rule__ItalicsDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1208:3: rule__ItalicsDefinition__ValueAssignment_2
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
    // InternalPdfMk.g:1217:1: rule__FontSizeDefinition__Group__0 : rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 ;
    public final void rule__FontSizeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1221:1: ( rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1 )
            // InternalPdfMk.g:1222:2: rule__FontSizeDefinition__Group__0__Impl rule__FontSizeDefinition__Group__1
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
    // InternalPdfMk.g:1229:1: rule__FontSizeDefinition__Group__0__Impl : ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) ;
    public final void rule__FontSizeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1233:1: ( ( ( rule__FontSizeDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1234:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1234:1: ( ( rule__FontSizeDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:1235:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1236:2: ( rule__FontSizeDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:1236:3: rule__FontSizeDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:1244:1: rule__FontSizeDefinition__Group__1 : rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 ;
    public final void rule__FontSizeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1248:1: ( rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2 )
            // InternalPdfMk.g:1249:2: rule__FontSizeDefinition__Group__1__Impl rule__FontSizeDefinition__Group__2
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
    // InternalPdfMk.g:1256:1: rule__FontSizeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FontSizeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1260:1: ( ( ':' ) )
            // InternalPdfMk.g:1261:1: ( ':' )
            {
            // InternalPdfMk.g:1261:1: ( ':' )
            // InternalPdfMk.g:1262:2: ':'
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:1271:1: rule__FontSizeDefinition__Group__2 : rule__FontSizeDefinition__Group__2__Impl ;
    public final void rule__FontSizeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1275:1: ( rule__FontSizeDefinition__Group__2__Impl )
            // InternalPdfMk.g:1276:2: rule__FontSizeDefinition__Group__2__Impl
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
    // InternalPdfMk.g:1282:1: rule__FontSizeDefinition__Group__2__Impl : ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) ;
    public final void rule__FontSizeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1286:1: ( ( ( rule__FontSizeDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1287:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1287:1: ( ( rule__FontSizeDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:1288:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1289:2: ( rule__FontSizeDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:1289:3: rule__FontSizeDefinition__ValueAssignment_2
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


    // $ANTLR start "rule__TextObject__Group__0"
    // InternalPdfMk.g:1298:1: rule__TextObject__Group__0 : rule__TextObject__Group__0__Impl rule__TextObject__Group__1 ;
    public final void rule__TextObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1302:1: ( rule__TextObject__Group__0__Impl rule__TextObject__Group__1 )
            // InternalPdfMk.g:1303:2: rule__TextObject__Group__0__Impl rule__TextObject__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPdfMk.g:1310:1: rule__TextObject__Group__0__Impl : ( ( rule__TextObject__ValueAssignment_0 ) ) ;
    public final void rule__TextObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1314:1: ( ( ( rule__TextObject__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:1315:1: ( ( rule__TextObject__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:1315:1: ( ( rule__TextObject__ValueAssignment_0 ) )
            // InternalPdfMk.g:1316:2: ( rule__TextObject__ValueAssignment_0 )
            {
             before(grammarAccess.getTextObjectAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:1317:2: ( rule__TextObject__ValueAssignment_0 )
            // InternalPdfMk.g:1317:3: rule__TextObject__ValueAssignment_0
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
    // InternalPdfMk.g:1325:1: rule__TextObject__Group__1 : rule__TextObject__Group__1__Impl rule__TextObject__Group__2 ;
    public final void rule__TextObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1329:1: ( rule__TextObject__Group__1__Impl rule__TextObject__Group__2 )
            // InternalPdfMk.g:1330:2: rule__TextObject__Group__1__Impl rule__TextObject__Group__2
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
    // InternalPdfMk.g:1337:1: rule__TextObject__Group__1__Impl : ( ( rule__TextObject__TextAssignment_1 ) ) ;
    public final void rule__TextObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1341:1: ( ( ( rule__TextObject__TextAssignment_1 ) ) )
            // InternalPdfMk.g:1342:1: ( ( rule__TextObject__TextAssignment_1 ) )
            {
            // InternalPdfMk.g:1342:1: ( ( rule__TextObject__TextAssignment_1 ) )
            // InternalPdfMk.g:1343:2: ( rule__TextObject__TextAssignment_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTextAssignment_1()); 
            // InternalPdfMk.g:1344:2: ( rule__TextObject__TextAssignment_1 )
            // InternalPdfMk.g:1344:3: rule__TextObject__TextAssignment_1
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
    // InternalPdfMk.g:1352:1: rule__TextObject__Group__2 : rule__TextObject__Group__2__Impl rule__TextObject__Group__3 ;
    public final void rule__TextObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1356:1: ( rule__TextObject__Group__2__Impl rule__TextObject__Group__3 )
            // InternalPdfMk.g:1357:2: rule__TextObject__Group__2__Impl rule__TextObject__Group__3
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
    // InternalPdfMk.g:1364:1: rule__TextObject__Group__2__Impl : ( ( rule__TextObject__Group_2__0 )? ) ;
    public final void rule__TextObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1368:1: ( ( ( rule__TextObject__Group_2__0 )? ) )
            // InternalPdfMk.g:1369:1: ( ( rule__TextObject__Group_2__0 )? )
            {
            // InternalPdfMk.g:1369:1: ( ( rule__TextObject__Group_2__0 )? )
            // InternalPdfMk.g:1370:2: ( rule__TextObject__Group_2__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_2()); 
            // InternalPdfMk.g:1371:2: ( rule__TextObject__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==25) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:1371:3: rule__TextObject__Group_2__0
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
    // InternalPdfMk.g:1379:1: rule__TextObject__Group__3 : rule__TextObject__Group__3__Impl rule__TextObject__Group__4 ;
    public final void rule__TextObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1383:1: ( rule__TextObject__Group__3__Impl rule__TextObject__Group__4 )
            // InternalPdfMk.g:1384:2: rule__TextObject__Group__3__Impl rule__TextObject__Group__4
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
    // InternalPdfMk.g:1391:1: rule__TextObject__Group__3__Impl : ( ( rule__TextObject__Group_3__0 )? ) ;
    public final void rule__TextObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1395:1: ( ( ( rule__TextObject__Group_3__0 )? ) )
            // InternalPdfMk.g:1396:1: ( ( rule__TextObject__Group_3__0 )? )
            {
            // InternalPdfMk.g:1396:1: ( ( rule__TextObject__Group_3__0 )? )
            // InternalPdfMk.g:1397:2: ( rule__TextObject__Group_3__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_3()); 
            // InternalPdfMk.g:1398:2: ( rule__TextObject__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==27) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:1398:3: rule__TextObject__Group_3__0
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
    // InternalPdfMk.g:1406:1: rule__TextObject__Group__4 : rule__TextObject__Group__4__Impl rule__TextObject__Group__5 ;
    public final void rule__TextObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1410:1: ( rule__TextObject__Group__4__Impl rule__TextObject__Group__5 )
            // InternalPdfMk.g:1411:2: rule__TextObject__Group__4__Impl rule__TextObject__Group__5
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
    // InternalPdfMk.g:1418:1: rule__TextObject__Group__4__Impl : ( ( rule__TextObject__Group_4__0 )? ) ;
    public final void rule__TextObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1422:1: ( ( ( rule__TextObject__Group_4__0 )? ) )
            // InternalPdfMk.g:1423:1: ( ( rule__TextObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:1423:1: ( ( rule__TextObject__Group_4__0 )? )
            // InternalPdfMk.g:1424:2: ( rule__TextObject__Group_4__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:1425:2: ( rule__TextObject__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==23) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1425:3: rule__TextObject__Group_4__0
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
    // InternalPdfMk.g:1433:1: rule__TextObject__Group__5 : rule__TextObject__Group__5__Impl rule__TextObject__Group__6 ;
    public final void rule__TextObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1437:1: ( rule__TextObject__Group__5__Impl rule__TextObject__Group__6 )
            // InternalPdfMk.g:1438:2: rule__TextObject__Group__5__Impl rule__TextObject__Group__6
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
    // InternalPdfMk.g:1445:1: rule__TextObject__Group__5__Impl : ( ( rule__TextObject__Group_5__0 )? ) ;
    public final void rule__TextObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1449:1: ( ( ( rule__TextObject__Group_5__0 )? ) )
            // InternalPdfMk.g:1450:1: ( ( rule__TextObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:1450:1: ( ( rule__TextObject__Group_5__0 )? )
            // InternalPdfMk.g:1451:2: ( rule__TextObject__Group_5__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:1452:2: ( rule__TextObject__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==24) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:1452:3: rule__TextObject__Group_5__0
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
    // InternalPdfMk.g:1460:1: rule__TextObject__Group__6 : rule__TextObject__Group__6__Impl rule__TextObject__Group__7 ;
    public final void rule__TextObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1464:1: ( rule__TextObject__Group__6__Impl rule__TextObject__Group__7 )
            // InternalPdfMk.g:1465:2: rule__TextObject__Group__6__Impl rule__TextObject__Group__7
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
    // InternalPdfMk.g:1472:1: rule__TextObject__Group__6__Impl : ( ( rule__TextObject__Group_6__0 )? ) ;
    public final void rule__TextObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1476:1: ( ( ( rule__TextObject__Group_6__0 )? ) )
            // InternalPdfMk.g:1477:1: ( ( rule__TextObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:1477:1: ( ( rule__TextObject__Group_6__0 )? )
            // InternalPdfMk.g:1478:2: ( rule__TextObject__Group_6__0 )?
            {
             before(grammarAccess.getTextObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:1479:2: ( rule__TextObject__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:1479:3: rule__TextObject__Group_6__0
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
    // InternalPdfMk.g:1487:1: rule__TextObject__Group__7 : rule__TextObject__Group__7__Impl ;
    public final void rule__TextObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1491:1: ( rule__TextObject__Group__7__Impl )
            // InternalPdfMk.g:1492:2: rule__TextObject__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextObject__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:1498:1: rule__TextObject__Group__7__Impl : ( '}' ) ;
    public final void rule__TextObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1502:1: ( ( '}' ) )
            // InternalPdfMk.g:1503:1: ( '}' )
            {
            // InternalPdfMk.g:1503:1: ( '}' )
            // InternalPdfMk.g:1504:2: '}'
            {
             before(grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextObject__Group_2__0"
    // InternalPdfMk.g:1514:1: rule__TextObject__Group_2__0 : rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 ;
    public final void rule__TextObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1518:1: ( rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1 )
            // InternalPdfMk.g:1519:2: rule__TextObject__Group_2__0__Impl rule__TextObject__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPdfMk.g:1526:1: rule__TextObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1530:1: ( ( ',' ) )
            // InternalPdfMk.g:1531:1: ( ',' )
            {
            // InternalPdfMk.g:1531:1: ( ',' )
            // InternalPdfMk.g:1532:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:1541:1: rule__TextObject__Group_2__1 : rule__TextObject__Group_2__1__Impl ;
    public final void rule__TextObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1545:1: ( rule__TextObject__Group_2__1__Impl )
            // InternalPdfMk.g:1546:2: rule__TextObject__Group_2__1__Impl
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
    // InternalPdfMk.g:1552:1: rule__TextObject__Group_2__1__Impl : ( ( rule__TextObject__StyleAssignment_2_1 ) ) ;
    public final void rule__TextObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1556:1: ( ( ( rule__TextObject__StyleAssignment_2_1 ) ) )
            // InternalPdfMk.g:1557:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            {
            // InternalPdfMk.g:1557:1: ( ( rule__TextObject__StyleAssignment_2_1 ) )
            // InternalPdfMk.g:1558:2: ( rule__TextObject__StyleAssignment_2_1 )
            {
             before(grammarAccess.getTextObjectAccess().getStyleAssignment_2_1()); 
            // InternalPdfMk.g:1559:2: ( rule__TextObject__StyleAssignment_2_1 )
            // InternalPdfMk.g:1559:3: rule__TextObject__StyleAssignment_2_1
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
    // InternalPdfMk.g:1568:1: rule__TextObject__Group_3__0 : rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 ;
    public final void rule__TextObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1572:1: ( rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1 )
            // InternalPdfMk.g:1573:2: rule__TextObject__Group_3__0__Impl rule__TextObject__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPdfMk.g:1580:1: rule__TextObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1584:1: ( ( ',' ) )
            // InternalPdfMk.g:1585:1: ( ',' )
            {
            // InternalPdfMk.g:1585:1: ( ',' )
            // InternalPdfMk.g:1586:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:1595:1: rule__TextObject__Group_3__1 : rule__TextObject__Group_3__1__Impl ;
    public final void rule__TextObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1599:1: ( rule__TextObject__Group_3__1__Impl )
            // InternalPdfMk.g:1600:2: rule__TextObject__Group_3__1__Impl
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
    // InternalPdfMk.g:1606:1: rule__TextObject__Group_3__1__Impl : ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) ;
    public final void rule__TextObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1610:1: ( ( ( rule__TextObject__FontSizeAssignment_3_1 ) ) )
            // InternalPdfMk.g:1611:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            {
            // InternalPdfMk.g:1611:1: ( ( rule__TextObject__FontSizeAssignment_3_1 ) )
            // InternalPdfMk.g:1612:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            {
             before(grammarAccess.getTextObjectAccess().getFontSizeAssignment_3_1()); 
            // InternalPdfMk.g:1613:2: ( rule__TextObject__FontSizeAssignment_3_1 )
            // InternalPdfMk.g:1613:3: rule__TextObject__FontSizeAssignment_3_1
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
    // InternalPdfMk.g:1622:1: rule__TextObject__Group_4__0 : rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 ;
    public final void rule__TextObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1626:1: ( rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1 )
            // InternalPdfMk.g:1627:2: rule__TextObject__Group_4__0__Impl rule__TextObject__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:1634:1: rule__TextObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1638:1: ( ( ',' ) )
            // InternalPdfMk.g:1639:1: ( ',' )
            {
            // InternalPdfMk.g:1639:1: ( ',' )
            // InternalPdfMk.g:1640:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:1649:1: rule__TextObject__Group_4__1 : rule__TextObject__Group_4__1__Impl ;
    public final void rule__TextObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1653:1: ( rule__TextObject__Group_4__1__Impl )
            // InternalPdfMk.g:1654:2: rule__TextObject__Group_4__1__Impl
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
    // InternalPdfMk.g:1660:1: rule__TextObject__Group_4__1__Impl : ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) ;
    public final void rule__TextObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1664:1: ( ( ( rule__TextObject__AlignmentAssignment_4_1 ) ) )
            // InternalPdfMk.g:1665:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            {
            // InternalPdfMk.g:1665:1: ( ( rule__TextObject__AlignmentAssignment_4_1 ) )
            // InternalPdfMk.g:1666:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            {
             before(grammarAccess.getTextObjectAccess().getAlignmentAssignment_4_1()); 
            // InternalPdfMk.g:1667:2: ( rule__TextObject__AlignmentAssignment_4_1 )
            // InternalPdfMk.g:1667:3: rule__TextObject__AlignmentAssignment_4_1
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
    // InternalPdfMk.g:1676:1: rule__TextObject__Group_5__0 : rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 ;
    public final void rule__TextObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1680:1: ( rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1 )
            // InternalPdfMk.g:1681:2: rule__TextObject__Group_5__0__Impl rule__TextObject__Group_5__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:1688:1: rule__TextObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1692:1: ( ( ',' ) )
            // InternalPdfMk.g:1693:1: ( ',' )
            {
            // InternalPdfMk.g:1693:1: ( ',' )
            // InternalPdfMk.g:1694:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:1703:1: rule__TextObject__Group_5__1 : rule__TextObject__Group_5__1__Impl ;
    public final void rule__TextObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1707:1: ( rule__TextObject__Group_5__1__Impl )
            // InternalPdfMk.g:1708:2: rule__TextObject__Group_5__1__Impl
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
    // InternalPdfMk.g:1714:1: rule__TextObject__Group_5__1__Impl : ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) ;
    public final void rule__TextObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1718:1: ( ( ( rule__TextObject__TypeFaceAssignment_5_1 ) ) )
            // InternalPdfMk.g:1719:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            {
            // InternalPdfMk.g:1719:1: ( ( rule__TextObject__TypeFaceAssignment_5_1 ) )
            // InternalPdfMk.g:1720:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            {
             before(grammarAccess.getTextObjectAccess().getTypeFaceAssignment_5_1()); 
            // InternalPdfMk.g:1721:2: ( rule__TextObject__TypeFaceAssignment_5_1 )
            // InternalPdfMk.g:1721:3: rule__TextObject__TypeFaceAssignment_5_1
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
    // InternalPdfMk.g:1730:1: rule__TextObject__Group_6__0 : rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 ;
    public final void rule__TextObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1734:1: ( rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1 )
            // InternalPdfMk.g:1735:2: rule__TextObject__Group_6__0__Impl rule__TextObject__Group_6__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:1742:1: rule__TextObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TextObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1746:1: ( ( ',' ) )
            // InternalPdfMk.g:1747:1: ( ',' )
            {
            // InternalPdfMk.g:1747:1: ( ',' )
            // InternalPdfMk.g:1748:2: ','
            {
             before(grammarAccess.getTextObjectAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:1757:1: rule__TextObject__Group_6__1 : rule__TextObject__Group_6__1__Impl ;
    public final void rule__TextObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1761:1: ( rule__TextObject__Group_6__1__Impl )
            // InternalPdfMk.g:1762:2: rule__TextObject__Group_6__1__Impl
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
    // InternalPdfMk.g:1768:1: rule__TextObject__Group_6__1__Impl : ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__TextObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1772:1: ( ( ( rule__TextObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:1773:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:1773:1: ( ( rule__TextObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:1774:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getTextObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:1775:2: ( rule__TextObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:1775:3: rule__TextObject__ItalicsAssignment_6_1
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


    // $ANTLR start "rule__StyleObject__Group__0"
    // InternalPdfMk.g:1784:1: rule__StyleObject__Group__0 : rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 ;
    public final void rule__StyleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1788:1: ( rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1 )
            // InternalPdfMk.g:1789:2: rule__StyleObject__Group__0__Impl rule__StyleObject__Group__1
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
    // InternalPdfMk.g:1796:1: rule__StyleObject__Group__0__Impl : ( ( rule__StyleObject__KeyAssignment_0 ) ) ;
    public final void rule__StyleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1800:1: ( ( ( rule__StyleObject__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1801:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1801:1: ( ( rule__StyleObject__KeyAssignment_0 ) )
            // InternalPdfMk.g:1802:2: ( rule__StyleObject__KeyAssignment_0 )
            {
             before(grammarAccess.getStyleObjectAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1803:2: ( rule__StyleObject__KeyAssignment_0 )
            // InternalPdfMk.g:1803:3: rule__StyleObject__KeyAssignment_0
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
    // InternalPdfMk.g:1811:1: rule__StyleObject__Group__1 : rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 ;
    public final void rule__StyleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1815:1: ( rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2 )
            // InternalPdfMk.g:1816:2: rule__StyleObject__Group__1__Impl rule__StyleObject__Group__2
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
    // InternalPdfMk.g:1823:1: rule__StyleObject__Group__1__Impl : ( ':' ) ;
    public final void rule__StyleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1827:1: ( ( ':' ) )
            // InternalPdfMk.g:1828:1: ( ':' )
            {
            // InternalPdfMk.g:1828:1: ( ':' )
            // InternalPdfMk.g:1829:2: ':'
            {
             before(grammarAccess.getStyleObjectAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:1838:1: rule__StyleObject__Group__2 : rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 ;
    public final void rule__StyleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1842:1: ( rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3 )
            // InternalPdfMk.g:1843:2: rule__StyleObject__Group__2__Impl rule__StyleObject__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:1850:1: rule__StyleObject__Group__2__Impl : ( ( rule__StyleObject__ValueAssignment_2 ) ) ;
    public final void rule__StyleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1854:1: ( ( ( rule__StyleObject__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1855:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1855:1: ( ( rule__StyleObject__ValueAssignment_2 ) )
            // InternalPdfMk.g:1856:2: ( rule__StyleObject__ValueAssignment_2 )
            {
             before(grammarAccess.getStyleObjectAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1857:2: ( rule__StyleObject__ValueAssignment_2 )
            // InternalPdfMk.g:1857:3: rule__StyleObject__ValueAssignment_2
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
    // InternalPdfMk.g:1865:1: rule__StyleObject__Group__3 : rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 ;
    public final void rule__StyleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1869:1: ( rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4 )
            // InternalPdfMk.g:1870:2: rule__StyleObject__Group__3__Impl rule__StyleObject__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:1877:1: rule__StyleObject__Group__3__Impl : ( ( rule__StyleObject__FontSizeAssignment_3 )? ) ;
    public final void rule__StyleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1881:1: ( ( ( rule__StyleObject__FontSizeAssignment_3 )? ) )
            // InternalPdfMk.g:1882:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            {
            // InternalPdfMk.g:1882:1: ( ( rule__StyleObject__FontSizeAssignment_3 )? )
            // InternalPdfMk.g:1883:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            {
             before(grammarAccess.getStyleObjectAccess().getFontSizeAssignment_3()); 
            // InternalPdfMk.g:1884:2: ( rule__StyleObject__FontSizeAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:1884:3: rule__StyleObject__FontSizeAssignment_3
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
    // InternalPdfMk.g:1892:1: rule__StyleObject__Group__4 : rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 ;
    public final void rule__StyleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1896:1: ( rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5 )
            // InternalPdfMk.g:1897:2: rule__StyleObject__Group__4__Impl rule__StyleObject__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:1904:1: rule__StyleObject__Group__4__Impl : ( ( rule__StyleObject__Group_4__0 )? ) ;
    public final void rule__StyleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1908:1: ( ( ( rule__StyleObject__Group_4__0 )? ) )
            // InternalPdfMk.g:1909:1: ( ( rule__StyleObject__Group_4__0 )? )
            {
            // InternalPdfMk.g:1909:1: ( ( rule__StyleObject__Group_4__0 )? )
            // InternalPdfMk.g:1910:2: ( rule__StyleObject__Group_4__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_4()); 
            // InternalPdfMk.g:1911:2: ( rule__StyleObject__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==24) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:1911:3: rule__StyleObject__Group_4__0
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
    // InternalPdfMk.g:1919:1: rule__StyleObject__Group__5 : rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 ;
    public final void rule__StyleObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1923:1: ( rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6 )
            // InternalPdfMk.g:1924:2: rule__StyleObject__Group__5__Impl rule__StyleObject__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:1931:1: rule__StyleObject__Group__5__Impl : ( ( rule__StyleObject__Group_5__0 )? ) ;
    public final void rule__StyleObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1935:1: ( ( ( rule__StyleObject__Group_5__0 )? ) )
            // InternalPdfMk.g:1936:1: ( ( rule__StyleObject__Group_5__0 )? )
            {
            // InternalPdfMk.g:1936:1: ( ( rule__StyleObject__Group_5__0 )? )
            // InternalPdfMk.g:1937:2: ( rule__StyleObject__Group_5__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_5()); 
            // InternalPdfMk.g:1938:2: ( rule__StyleObject__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==23) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:1938:3: rule__StyleObject__Group_5__0
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
    // InternalPdfMk.g:1946:1: rule__StyleObject__Group__6 : rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 ;
    public final void rule__StyleObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1950:1: ( rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7 )
            // InternalPdfMk.g:1951:2: rule__StyleObject__Group__6__Impl rule__StyleObject__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalPdfMk.g:1958:1: rule__StyleObject__Group__6__Impl : ( ( rule__StyleObject__Group_6__0 )? ) ;
    public final void rule__StyleObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1962:1: ( ( ( rule__StyleObject__Group_6__0 )? ) )
            // InternalPdfMk.g:1963:1: ( ( rule__StyleObject__Group_6__0 )? )
            {
            // InternalPdfMk.g:1963:1: ( ( rule__StyleObject__Group_6__0 )? )
            // InternalPdfMk.g:1964:2: ( rule__StyleObject__Group_6__0 )?
            {
             before(grammarAccess.getStyleObjectAccess().getGroup_6()); 
            // InternalPdfMk.g:1965:2: ( rule__StyleObject__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:1965:3: rule__StyleObject__Group_6__0
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
    // InternalPdfMk.g:1973:1: rule__StyleObject__Group__7 : rule__StyleObject__Group__7__Impl ;
    public final void rule__StyleObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1977:1: ( rule__StyleObject__Group__7__Impl )
            // InternalPdfMk.g:1978:2: rule__StyleObject__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObject__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:1984:1: rule__StyleObject__Group__7__Impl : ( '}' ) ;
    public final void rule__StyleObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1988:1: ( ( '}' ) )
            // InternalPdfMk.g:1989:1: ( '}' )
            {
            // InternalPdfMk.g:1989:1: ( '}' )
            // InternalPdfMk.g:1990:2: '}'
            {
             before(grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__StyleObject__Group_4__0"
    // InternalPdfMk.g:2000:1: rule__StyleObject__Group_4__0 : rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 ;
    public final void rule__StyleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2004:1: ( rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1 )
            // InternalPdfMk.g:2005:2: rule__StyleObject__Group_4__0__Impl rule__StyleObject__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPdfMk.g:2012:1: rule__StyleObject__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2016:1: ( ( ',' ) )
            // InternalPdfMk.g:2017:1: ( ',' )
            {
            // InternalPdfMk.g:2017:1: ( ',' )
            // InternalPdfMk.g:2018:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:2027:1: rule__StyleObject__Group_4__1 : rule__StyleObject__Group_4__1__Impl ;
    public final void rule__StyleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2031:1: ( rule__StyleObject__Group_4__1__Impl )
            // InternalPdfMk.g:2032:2: rule__StyleObject__Group_4__1__Impl
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
    // InternalPdfMk.g:2038:1: rule__StyleObject__Group_4__1__Impl : ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) ;
    public final void rule__StyleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2042:1: ( ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) ) )
            // InternalPdfMk.g:2043:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            {
            // InternalPdfMk.g:2043:1: ( ( rule__StyleObject__TypeFaceAssignment_4_1 ) )
            // InternalPdfMk.g:2044:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getTypeFaceAssignment_4_1()); 
            // InternalPdfMk.g:2045:2: ( rule__StyleObject__TypeFaceAssignment_4_1 )
            // InternalPdfMk.g:2045:3: rule__StyleObject__TypeFaceAssignment_4_1
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
    // InternalPdfMk.g:2054:1: rule__StyleObject__Group_5__0 : rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 ;
    public final void rule__StyleObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2058:1: ( rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1 )
            // InternalPdfMk.g:2059:2: rule__StyleObject__Group_5__0__Impl rule__StyleObject__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPdfMk.g:2066:1: rule__StyleObject__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2070:1: ( ( ',' ) )
            // InternalPdfMk.g:2071:1: ( ',' )
            {
            // InternalPdfMk.g:2071:1: ( ',' )
            // InternalPdfMk.g:2072:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:2081:1: rule__StyleObject__Group_5__1 : rule__StyleObject__Group_5__1__Impl ;
    public final void rule__StyleObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2085:1: ( rule__StyleObject__Group_5__1__Impl )
            // InternalPdfMk.g:2086:2: rule__StyleObject__Group_5__1__Impl
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
    // InternalPdfMk.g:2092:1: rule__StyleObject__Group_5__1__Impl : ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) ;
    public final void rule__StyleObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2096:1: ( ( ( rule__StyleObject__AlignmentAssignment_5_1 ) ) )
            // InternalPdfMk.g:2097:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            {
            // InternalPdfMk.g:2097:1: ( ( rule__StyleObject__AlignmentAssignment_5_1 ) )
            // InternalPdfMk.g:2098:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getAlignmentAssignment_5_1()); 
            // InternalPdfMk.g:2099:2: ( rule__StyleObject__AlignmentAssignment_5_1 )
            // InternalPdfMk.g:2099:3: rule__StyleObject__AlignmentAssignment_5_1
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
    // InternalPdfMk.g:2108:1: rule__StyleObject__Group_6__0 : rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 ;
    public final void rule__StyleObject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2112:1: ( rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1 )
            // InternalPdfMk.g:2113:2: rule__StyleObject__Group_6__0__Impl rule__StyleObject__Group_6__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:2120:1: rule__StyleObject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__StyleObject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2124:1: ( ( ',' ) )
            // InternalPdfMk.g:2125:1: ( ',' )
            {
            // InternalPdfMk.g:2125:1: ( ',' )
            // InternalPdfMk.g:2126:2: ','
            {
             before(grammarAccess.getStyleObjectAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:2135:1: rule__StyleObject__Group_6__1 : rule__StyleObject__Group_6__1__Impl ;
    public final void rule__StyleObject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2139:1: ( rule__StyleObject__Group_6__1__Impl )
            // InternalPdfMk.g:2140:2: rule__StyleObject__Group_6__1__Impl
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
    // InternalPdfMk.g:2146:1: rule__StyleObject__Group_6__1__Impl : ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) ;
    public final void rule__StyleObject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2150:1: ( ( ( rule__StyleObject__ItalicsAssignment_6_1 ) ) )
            // InternalPdfMk.g:2151:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            {
            // InternalPdfMk.g:2151:1: ( ( rule__StyleObject__ItalicsAssignment_6_1 ) )
            // InternalPdfMk.g:2152:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            {
             before(grammarAccess.getStyleObjectAccess().getItalicsAssignment_6_1()); 
            // InternalPdfMk.g:2153:2: ( rule__StyleObject__ItalicsAssignment_6_1 )
            // InternalPdfMk.g:2153:3: rule__StyleObject__ItalicsAssignment_6_1
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


    // $ANTLR start "rule__StyleObjects__Group__0"
    // InternalPdfMk.g:2162:1: rule__StyleObjects__Group__0 : rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 ;
    public final void rule__StyleObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2166:1: ( rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1 )
            // InternalPdfMk.g:2167:2: rule__StyleObjects__Group__0__Impl rule__StyleObjects__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPdfMk.g:2174:1: rule__StyleObjects__Group__0__Impl : ( '{' ) ;
    public final void rule__StyleObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2178:1: ( ( '{' ) )
            // InternalPdfMk.g:2179:1: ( '{' )
            {
            // InternalPdfMk.g:2179:1: ( '{' )
            // InternalPdfMk.g:2180:2: '{'
            {
             before(grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPdfMk.g:2189:1: rule__StyleObjects__Group__1 : rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 ;
    public final void rule__StyleObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2193:1: ( rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2 )
            // InternalPdfMk.g:2194:2: rule__StyleObjects__Group__1__Impl rule__StyleObjects__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalPdfMk.g:2201:1: rule__StyleObjects__Group__1__Impl : ( ( rule__StyleObjects__ValueAssignment_1 )? ) ;
    public final void rule__StyleObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2205:1: ( ( ( rule__StyleObjects__ValueAssignment_1 )? ) )
            // InternalPdfMk.g:2206:1: ( ( rule__StyleObjects__ValueAssignment_1 )? )
            {
            // InternalPdfMk.g:2206:1: ( ( rule__StyleObjects__ValueAssignment_1 )? )
            // InternalPdfMk.g:2207:2: ( rule__StyleObjects__ValueAssignment_1 )?
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_1()); 
            // InternalPdfMk.g:2208:2: ( rule__StyleObjects__ValueAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPdfMk.g:2208:3: rule__StyleObjects__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleObjects__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleObjectsAccess().getValueAssignment_1()); 

            }


            }

        }
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
    // InternalPdfMk.g:2216:1: rule__StyleObjects__Group__2 : rule__StyleObjects__Group__2__Impl rule__StyleObjects__Group__3 ;
    public final void rule__StyleObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2220:1: ( rule__StyleObjects__Group__2__Impl rule__StyleObjects__Group__3 )
            // InternalPdfMk.g:2221:2: rule__StyleObjects__Group__2__Impl rule__StyleObjects__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__StyleObjects__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:2228:1: rule__StyleObjects__Group__2__Impl : ( ( rule__StyleObjects__Group_2__0 )* ) ;
    public final void rule__StyleObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2232:1: ( ( ( rule__StyleObjects__Group_2__0 )* ) )
            // InternalPdfMk.g:2233:1: ( ( rule__StyleObjects__Group_2__0 )* )
            {
            // InternalPdfMk.g:2233:1: ( ( rule__StyleObjects__Group_2__0 )* )
            // InternalPdfMk.g:2234:2: ( rule__StyleObjects__Group_2__0 )*
            {
             before(grammarAccess.getStyleObjectsAccess().getGroup_2()); 
            // InternalPdfMk.g:2235:2: ( rule__StyleObjects__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPdfMk.g:2235:3: rule__StyleObjects__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__StyleObjects__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStyleObjectsAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__StyleObjects__Group__3"
    // InternalPdfMk.g:2243:1: rule__StyleObjects__Group__3 : rule__StyleObjects__Group__3__Impl ;
    public final void rule__StyleObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2247:1: ( rule__StyleObjects__Group__3__Impl )
            // InternalPdfMk.g:2248:2: rule__StyleObjects__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group__3"


    // $ANTLR start "rule__StyleObjects__Group__3__Impl"
    // InternalPdfMk.g:2254:1: rule__StyleObjects__Group__3__Impl : ( '}' ) ;
    public final void rule__StyleObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2258:1: ( ( '}' ) )
            // InternalPdfMk.g:2259:1: ( '}' )
            {
            // InternalPdfMk.g:2259:1: ( '}' )
            // InternalPdfMk.g:2260:2: '}'
            {
             before(grammarAccess.getStyleObjectsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStyleObjectsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group__3__Impl"


    // $ANTLR start "rule__StyleObjects__Group_2__0"
    // InternalPdfMk.g:2270:1: rule__StyleObjects__Group_2__0 : rule__StyleObjects__Group_2__0__Impl rule__StyleObjects__Group_2__1 ;
    public final void rule__StyleObjects__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2274:1: ( rule__StyleObjects__Group_2__0__Impl rule__StyleObjects__Group_2__1 )
            // InternalPdfMk.g:2275:2: rule__StyleObjects__Group_2__0__Impl rule__StyleObjects__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__StyleObjects__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_2__0"


    // $ANTLR start "rule__StyleObjects__Group_2__0__Impl"
    // InternalPdfMk.g:2282:1: rule__StyleObjects__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StyleObjects__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2286:1: ( ( ',' ) )
            // InternalPdfMk.g:2287:1: ( ',' )
            {
            // InternalPdfMk.g:2287:1: ( ',' )
            // InternalPdfMk.g:2288:2: ','
            {
             before(grammarAccess.getStyleObjectsAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStyleObjectsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_2__0__Impl"


    // $ANTLR start "rule__StyleObjects__Group_2__1"
    // InternalPdfMk.g:2297:1: rule__StyleObjects__Group_2__1 : rule__StyleObjects__Group_2__1__Impl ;
    public final void rule__StyleObjects__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2301:1: ( rule__StyleObjects__Group_2__1__Impl )
            // InternalPdfMk.g:2302:2: rule__StyleObjects__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_2__1"


    // $ANTLR start "rule__StyleObjects__Group_2__1__Impl"
    // InternalPdfMk.g:2308:1: rule__StyleObjects__Group_2__1__Impl : ( ( rule__StyleObjects__ValueAssignment_2_1 ) ) ;
    public final void rule__StyleObjects__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2312:1: ( ( ( rule__StyleObjects__ValueAssignment_2_1 ) ) )
            // InternalPdfMk.g:2313:1: ( ( rule__StyleObjects__ValueAssignment_2_1 ) )
            {
            // InternalPdfMk.g:2313:1: ( ( rule__StyleObjects__ValueAssignment_2_1 ) )
            // InternalPdfMk.g:2314:2: ( rule__StyleObjects__ValueAssignment_2_1 )
            {
             before(grammarAccess.getStyleObjectsAccess().getValueAssignment_2_1()); 
            // InternalPdfMk.g:2315:2: ( rule__StyleObjects__ValueAssignment_2_1 )
            // InternalPdfMk.g:2315:3: rule__StyleObjects__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleObjects__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleObjectsAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__Group_2__1__Impl"


    // $ANTLR start "rule__ContentObjects__Group__0"
    // InternalPdfMk.g:2324:1: rule__ContentObjects__Group__0 : rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 ;
    public final void rule__ContentObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2328:1: ( rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1 )
            // InternalPdfMk.g:2329:2: rule__ContentObjects__Group__0__Impl rule__ContentObjects__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:2336:1: rule__ContentObjects__Group__0__Impl : ( '[' ) ;
    public final void rule__ContentObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2340:1: ( ( '[' ) )
            // InternalPdfMk.g:2341:1: ( '[' )
            {
            // InternalPdfMk.g:2341:1: ( '[' )
            // InternalPdfMk.g:2342:2: '['
            {
             before(grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalPdfMk.g:2351:1: rule__ContentObjects__Group__1 : rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 ;
    public final void rule__ContentObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2355:1: ( rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2 )
            // InternalPdfMk.g:2356:2: rule__ContentObjects__Group__1__Impl rule__ContentObjects__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalPdfMk.g:2363:1: rule__ContentObjects__Group__1__Impl : ( ( rule__ContentObjects__Group_1__0 )? ) ;
    public final void rule__ContentObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2367:1: ( ( ( rule__ContentObjects__Group_1__0 )? ) )
            // InternalPdfMk.g:2368:1: ( ( rule__ContentObjects__Group_1__0 )? )
            {
            // InternalPdfMk.g:2368:1: ( ( rule__ContentObjects__Group_1__0 )? )
            // InternalPdfMk.g:2369:2: ( rule__ContentObjects__Group_1__0 )?
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_1()); 
            // InternalPdfMk.g:2370:2: ( rule__ContentObjects__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:2370:3: rule__ContentObjects__Group_1__0
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
    // InternalPdfMk.g:2378:1: rule__ContentObjects__Group__2 : rule__ContentObjects__Group__2__Impl ;
    public final void rule__ContentObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2382:1: ( rule__ContentObjects__Group__2__Impl )
            // InternalPdfMk.g:2383:2: rule__ContentObjects__Group__2__Impl
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
    // InternalPdfMk.g:2389:1: rule__ContentObjects__Group__2__Impl : ( ']' ) ;
    public final void rule__ContentObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2393:1: ( ( ']' ) )
            // InternalPdfMk.g:2394:1: ( ']' )
            {
            // InternalPdfMk.g:2394:1: ( ']' )
            // InternalPdfMk.g:2395:2: ']'
            {
             before(grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPdfMk.g:2405:1: rule__ContentObjects__Group_1__0 : rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1 ;
    public final void rule__ContentObjects__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2409:1: ( rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1 )
            // InternalPdfMk.g:2410:2: rule__ContentObjects__Group_1__0__Impl rule__ContentObjects__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPdfMk.g:2417:1: rule__ContentObjects__Group_1__0__Impl : ( ( rule__ContentObjects__ValueAssignment_1_0 ) ) ;
    public final void rule__ContentObjects__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2421:1: ( ( ( rule__ContentObjects__ValueAssignment_1_0 ) ) )
            // InternalPdfMk.g:2422:1: ( ( rule__ContentObjects__ValueAssignment_1_0 ) )
            {
            // InternalPdfMk.g:2422:1: ( ( rule__ContentObjects__ValueAssignment_1_0 ) )
            // InternalPdfMk.g:2423:2: ( rule__ContentObjects__ValueAssignment_1_0 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_1_0()); 
            // InternalPdfMk.g:2424:2: ( rule__ContentObjects__ValueAssignment_1_0 )
            // InternalPdfMk.g:2424:3: rule__ContentObjects__ValueAssignment_1_0
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
    // InternalPdfMk.g:2432:1: rule__ContentObjects__Group_1__1 : rule__ContentObjects__Group_1__1__Impl ;
    public final void rule__ContentObjects__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2436:1: ( rule__ContentObjects__Group_1__1__Impl )
            // InternalPdfMk.g:2437:2: rule__ContentObjects__Group_1__1__Impl
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
    // InternalPdfMk.g:2443:1: rule__ContentObjects__Group_1__1__Impl : ( ( rule__ContentObjects__Group_1_1__0 )* ) ;
    public final void rule__ContentObjects__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2447:1: ( ( ( rule__ContentObjects__Group_1_1__0 )* ) )
            // InternalPdfMk.g:2448:1: ( ( rule__ContentObjects__Group_1_1__0 )* )
            {
            // InternalPdfMk.g:2448:1: ( ( rule__ContentObjects__Group_1_1__0 )* )
            // InternalPdfMk.g:2449:2: ( rule__ContentObjects__Group_1_1__0 )*
            {
             before(grammarAccess.getContentObjectsAccess().getGroup_1_1()); 
            // InternalPdfMk.g:2450:2: ( rule__ContentObjects__Group_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPdfMk.g:2450:3: rule__ContentObjects__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ContentObjects__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPdfMk.g:2459:1: rule__ContentObjects__Group_1_1__0 : rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1 ;
    public final void rule__ContentObjects__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2463:1: ( rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1 )
            // InternalPdfMk.g:2464:2: rule__ContentObjects__Group_1_1__0__Impl rule__ContentObjects__Group_1_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPdfMk.g:2471:1: rule__ContentObjects__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ContentObjects__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2475:1: ( ( ',' ) )
            // InternalPdfMk.g:2476:1: ( ',' )
            {
            // InternalPdfMk.g:2476:1: ( ',' )
            // InternalPdfMk.g:2477:2: ','
            {
             before(grammarAccess.getContentObjectsAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalPdfMk.g:2486:1: rule__ContentObjects__Group_1_1__1 : rule__ContentObjects__Group_1_1__1__Impl ;
    public final void rule__ContentObjects__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2490:1: ( rule__ContentObjects__Group_1_1__1__Impl )
            // InternalPdfMk.g:2491:2: rule__ContentObjects__Group_1_1__1__Impl
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
    // InternalPdfMk.g:2497:1: rule__ContentObjects__Group_1_1__1__Impl : ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) ) ;
    public final void rule__ContentObjects__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2501:1: ( ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) ) )
            // InternalPdfMk.g:2502:1: ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) )
            {
            // InternalPdfMk.g:2502:1: ( ( rule__ContentObjects__ValueAssignment_1_1_1 ) )
            // InternalPdfMk.g:2503:2: ( rule__ContentObjects__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getContentObjectsAccess().getValueAssignment_1_1_1()); 
            // InternalPdfMk.g:2504:2: ( rule__ContentObjects__ValueAssignment_1_1_1 )
            // InternalPdfMk.g:2504:3: rule__ContentObjects__ValueAssignment_1_1_1
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
    // InternalPdfMk.g:2513:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2517:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:2518:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
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
    // InternalPdfMk.g:2525:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2529:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2530:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2530:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:2531:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2532:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:2532:3: rule__Styles__KeyAssignment_0
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
    // InternalPdfMk.g:2540:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2544:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:2545:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
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
    // InternalPdfMk.g:2552:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2556:1: ( ( ':' ) )
            // InternalPdfMk.g:2557:1: ( ':' )
            {
            // InternalPdfMk.g:2557:1: ( ':' )
            // InternalPdfMk.g:2558:2: ':'
            {
             before(grammarAccess.getStylesAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:2567:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2571:1: ( rule__Styles__Group__2__Impl )
            // InternalPdfMk.g:2572:2: rule__Styles__Group__2__Impl
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
    // InternalPdfMk.g:2578:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2582:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2583:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2583:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:2584:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2585:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:2585:3: rule__Styles__ValueAssignment_2
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
    // InternalPdfMk.g:2594:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2598:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:2599:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalPdfMk.g:2606:1: rule__Content__Group__0__Impl : ( ( rule__Content__KeyAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2610:1: ( ( ( rule__Content__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:2611:1: ( ( rule__Content__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:2611:1: ( ( rule__Content__KeyAssignment_0 ) )
            // InternalPdfMk.g:2612:2: ( rule__Content__KeyAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:2613:2: ( rule__Content__KeyAssignment_0 )
            // InternalPdfMk.g:2613:3: rule__Content__KeyAssignment_0
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
    // InternalPdfMk.g:2621:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2625:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:2626:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalPdfMk.g:2633:1: rule__Content__Group__1__Impl : ( ':' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2637:1: ( ( ':' ) )
            // InternalPdfMk.g:2638:1: ( ':' )
            {
            // InternalPdfMk.g:2638:1: ( ':' )
            // InternalPdfMk.g:2639:2: ':'
            {
             before(grammarAccess.getContentAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:2648:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2652:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:2653:2: rule__Content__Group__2__Impl
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
    // InternalPdfMk.g:2659:1: rule__Content__Group__2__Impl : ( ( rule__Content__ValueAssignment_2 ) ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2663:1: ( ( ( rule__Content__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:2664:1: ( ( rule__Content__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:2664:1: ( ( rule__Content__ValueAssignment_2 ) )
            // InternalPdfMk.g:2665:2: ( rule__Content__ValueAssignment_2 )
            {
             before(grammarAccess.getContentAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:2666:2: ( rule__Content__ValueAssignment_2 )
            // InternalPdfMk.g:2666:3: rule__Content__ValueAssignment_2
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
    // InternalPdfMk.g:2675:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2679:1: ( ( ruleContent ) )
            // InternalPdfMk.g:2680:2: ( ruleContent )
            {
            // InternalPdfMk.g:2680:2: ( ruleContent )
            // InternalPdfMk.g:2681:3: ruleContent
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
    // InternalPdfMk.g:2690:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2694:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:2695:2: ( ruleStyles )
            {
            // InternalPdfMk.g:2695:2: ( ruleStyles )
            // InternalPdfMk.g:2696:3: ruleStyles
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
    // InternalPdfMk.g:2705:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2709:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:2710:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:2710:2: ( RULE_STRING )
            // InternalPdfMk.g:2711:3: RULE_STRING
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
    // InternalPdfMk.g:2720:1: rule__TypeFaceDefinition__KeyAssignment_0 : ( ( 'bold' ) ) ;
    public final void rule__TypeFaceDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2724:1: ( ( ( 'bold' ) ) )
            // InternalPdfMk.g:2725:2: ( ( 'bold' ) )
            {
            // InternalPdfMk.g:2725:2: ( ( 'bold' ) )
            // InternalPdfMk.g:2726:3: ( 'bold' )
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0()); 
            // InternalPdfMk.g:2727:3: ( 'bold' )
            // InternalPdfMk.g:2728:4: 'bold'
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
    // InternalPdfMk.g:2739:1: rule__TypeFaceDefinition__ValueAssignment_2 : ( ruleBooleanDefinition ) ;
    public final void rule__TypeFaceDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2743:1: ( ( ruleBooleanDefinition ) )
            // InternalPdfMk.g:2744:2: ( ruleBooleanDefinition )
            {
            // InternalPdfMk.g:2744:2: ( ruleBooleanDefinition )
            // InternalPdfMk.g:2745:3: ruleBooleanDefinition
            {
             before(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanDefinition();

            state._fsp--;

             after(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanDefinitionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalPdfMk.g:2754:1: rule__TextStyleDefinition__KeyAssignment_0 : ( ( 'style' ) ) ;
    public final void rule__TextStyleDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2758:1: ( ( ( 'style' ) ) )
            // InternalPdfMk.g:2759:2: ( ( 'style' ) )
            {
            // InternalPdfMk.g:2759:2: ( ( 'style' ) )
            // InternalPdfMk.g:2760:3: ( 'style' )
            {
             before(grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0()); 
            // InternalPdfMk.g:2761:3: ( 'style' )
            // InternalPdfMk.g:2762:4: 'style'
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
    // InternalPdfMk.g:2773:1: rule__TextStyleDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextStyleDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2777:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:2778:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:2778:2: ( RULE_STRING )
            // InternalPdfMk.g:2779:3: RULE_STRING
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
    // InternalPdfMk.g:2788:1: rule__ItalicsDefinition__KeyAssignment_0 : ( ( 'italics' ) ) ;
    public final void rule__ItalicsDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2792:1: ( ( ( 'italics' ) ) )
            // InternalPdfMk.g:2793:2: ( ( 'italics' ) )
            {
            // InternalPdfMk.g:2793:2: ( ( 'italics' ) )
            // InternalPdfMk.g:2794:3: ( 'italics' )
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            // InternalPdfMk.g:2795:3: ( 'italics' )
            // InternalPdfMk.g:2796:4: 'italics'
            {
             before(grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPdfMk.g:2807:1: rule__ItalicsDefinition__ValueAssignment_2 : ( ruleBooleanDefinition ) ;
    public final void rule__ItalicsDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2811:1: ( ( ruleBooleanDefinition ) )
            // InternalPdfMk.g:2812:2: ( ruleBooleanDefinition )
            {
            // InternalPdfMk.g:2812:2: ( ruleBooleanDefinition )
            // InternalPdfMk.g:2813:3: ruleBooleanDefinition
            {
             before(grammarAccess.getItalicsDefinitionAccess().getValueBooleanDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanDefinition();

            state._fsp--;

             after(grammarAccess.getItalicsDefinitionAccess().getValueBooleanDefinitionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalPdfMk.g:2822:1: rule__FontSizeDefinition__KeyAssignment_0 : ( ( 'fontSize' ) ) ;
    public final void rule__FontSizeDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2826:1: ( ( ( 'fontSize' ) ) )
            // InternalPdfMk.g:2827:2: ( ( 'fontSize' ) )
            {
            // InternalPdfMk.g:2827:2: ( ( 'fontSize' ) )
            // InternalPdfMk.g:2828:3: ( 'fontSize' )
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            // InternalPdfMk.g:2829:3: ( 'fontSize' )
            // InternalPdfMk.g:2830:4: 'fontSize'
            {
             before(grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPdfMk.g:2841:1: rule__FontSizeDefinition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FontSizeDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2845:1: ( ( RULE_INT ) )
            // InternalPdfMk.g:2846:2: ( RULE_INT )
            {
            // InternalPdfMk.g:2846:2: ( RULE_INT )
            // InternalPdfMk.g:2847:3: RULE_INT
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


    // $ANTLR start "rule__TextObject__ValueAssignment_0"
    // InternalPdfMk.g:2856:1: rule__TextObject__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TextObject__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2860:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:2861:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:2861:2: ( ( '{' ) )
            // InternalPdfMk.g:2862:3: ( '{' )
            {
             before(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:2863:3: ( '{' )
            // InternalPdfMk.g:2864:4: '{'
            {
             before(grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPdfMk.g:2875:1: rule__TextObject__TextAssignment_1 : ( ruleTextDefinition ) ;
    public final void rule__TextObject__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2879:1: ( ( ruleTextDefinition ) )
            // InternalPdfMk.g:2880:2: ( ruleTextDefinition )
            {
            // InternalPdfMk.g:2880:2: ( ruleTextDefinition )
            // InternalPdfMk.g:2881:3: ruleTextDefinition
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
    // InternalPdfMk.g:2890:1: rule__TextObject__StyleAssignment_2_1 : ( ruleTextStyleDefinition ) ;
    public final void rule__TextObject__StyleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2894:1: ( ( ruleTextStyleDefinition ) )
            // InternalPdfMk.g:2895:2: ( ruleTextStyleDefinition )
            {
            // InternalPdfMk.g:2895:2: ( ruleTextStyleDefinition )
            // InternalPdfMk.g:2896:3: ruleTextStyleDefinition
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
    // InternalPdfMk.g:2905:1: rule__TextObject__FontSizeAssignment_3_1 : ( ruleFontSizeDefinition ) ;
    public final void rule__TextObject__FontSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2909:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:2910:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:2910:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:2911:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:2920:1: rule__TextObject__AlignmentAssignment_4_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__TextObject__AlignmentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2924:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:2925:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:2925:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:2926:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:2935:1: rule__TextObject__TypeFaceAssignment_5_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__TextObject__TypeFaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2939:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:2940:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:2940:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:2941:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:2950:1: rule__TextObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__TextObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2954:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:2955:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:2955:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:2956:3: ruleItalicsDefinition
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


    // $ANTLR start "rule__StyleObject__KeyAssignment_0"
    // InternalPdfMk.g:2965:1: rule__StyleObject__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StyleObject__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2969:1: ( ( RULE_ID ) )
            // InternalPdfMk.g:2970:2: ( RULE_ID )
            {
            // InternalPdfMk.g:2970:2: ( RULE_ID )
            // InternalPdfMk.g:2971:3: RULE_ID
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
    // InternalPdfMk.g:2980:1: rule__StyleObject__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__StyleObject__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:2984:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:2985:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:2985:2: ( ( '{' ) )
            // InternalPdfMk.g:2986:3: ( '{' )
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:2987:3: ( '{' )
            // InternalPdfMk.g:2988:4: '{'
            {
             before(grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPdfMk.g:2999:1: rule__StyleObject__FontSizeAssignment_3 : ( ruleFontSizeDefinition ) ;
    public final void rule__StyleObject__FontSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3003:1: ( ( ruleFontSizeDefinition ) )
            // InternalPdfMk.g:3004:2: ( ruleFontSizeDefinition )
            {
            // InternalPdfMk.g:3004:2: ( ruleFontSizeDefinition )
            // InternalPdfMk.g:3005:3: ruleFontSizeDefinition
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
    // InternalPdfMk.g:3014:1: rule__StyleObject__TypeFaceAssignment_4_1 : ( ruleTypeFaceDefinition ) ;
    public final void rule__StyleObject__TypeFaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3018:1: ( ( ruleTypeFaceDefinition ) )
            // InternalPdfMk.g:3019:2: ( ruleTypeFaceDefinition )
            {
            // InternalPdfMk.g:3019:2: ( ruleTypeFaceDefinition )
            // InternalPdfMk.g:3020:3: ruleTypeFaceDefinition
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
    // InternalPdfMk.g:3029:1: rule__StyleObject__AlignmentAssignment_5_1 : ( ruleTextAlignmentDefinition ) ;
    public final void rule__StyleObject__AlignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3033:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:3034:2: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:3034:2: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:3035:3: ruleTextAlignmentDefinition
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
    // InternalPdfMk.g:3044:1: rule__StyleObject__ItalicsAssignment_6_1 : ( ruleItalicsDefinition ) ;
    public final void rule__StyleObject__ItalicsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3048:1: ( ( ruleItalicsDefinition ) )
            // InternalPdfMk.g:3049:2: ( ruleItalicsDefinition )
            {
            // InternalPdfMk.g:3049:2: ( ruleItalicsDefinition )
            // InternalPdfMk.g:3050:3: ruleItalicsDefinition
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


    // $ANTLR start "rule__StyleObjects__ValueAssignment_1"
    // InternalPdfMk.g:3059:1: rule__StyleObjects__ValueAssignment_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3063:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:3064:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:3064:2: ( ruleStyleObject )
            // InternalPdfMk.g:3065:3: ruleStyleObject
            {
             before(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObject();

            state._fsp--;

             after(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__ValueAssignment_1"


    // $ANTLR start "rule__StyleObjects__ValueAssignment_2_1"
    // InternalPdfMk.g:3074:1: rule__StyleObjects__ValueAssignment_2_1 : ( ruleStyleObject ) ;
    public final void rule__StyleObjects__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3078:1: ( ( ruleStyleObject ) )
            // InternalPdfMk.g:3079:2: ( ruleStyleObject )
            {
            // InternalPdfMk.g:3079:2: ( ruleStyleObject )
            // InternalPdfMk.g:3080:3: ruleStyleObject
            {
             before(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleObject();

            state._fsp--;

             after(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleObjects__ValueAssignment_2_1"


    // $ANTLR start "rule__ContentObject__ValueAssignment"
    // InternalPdfMk.g:3089:1: rule__ContentObject__ValueAssignment : ( ( rule__ContentObject__ValueAlternatives_0 ) ) ;
    public final void rule__ContentObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3093:1: ( ( ( rule__ContentObject__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:3094:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:3094:2: ( ( rule__ContentObject__ValueAlternatives_0 ) )
            // InternalPdfMk.g:3095:3: ( rule__ContentObject__ValueAlternatives_0 )
            {
             before(grammarAccess.getContentObjectAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:3096:3: ( rule__ContentObject__ValueAlternatives_0 )
            // InternalPdfMk.g:3096:4: rule__ContentObject__ValueAlternatives_0
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
    // InternalPdfMk.g:3104:1: rule__ContentObjects__ValueAssignment_1_0 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3108:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:3109:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:3109:2: ( ruleContentObject )
            // InternalPdfMk.g:3110:3: ruleContentObject
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
    // InternalPdfMk.g:3119:1: rule__ContentObjects__ValueAssignment_1_1_1 : ( ruleContentObject ) ;
    public final void rule__ContentObjects__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3123:1: ( ( ruleContentObject ) )
            // InternalPdfMk.g:3124:2: ( ruleContentObject )
            {
            // InternalPdfMk.g:3124:2: ( ruleContentObject )
            // InternalPdfMk.g:3125:3: ruleContentObject
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
    // InternalPdfMk.g:3134:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3138:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:3139:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:3139:2: ( ( 'styles' ) )
            // InternalPdfMk.g:3140:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:3141:3: ( 'styles' )
            // InternalPdfMk.g:3142:4: 'styles'
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPdfMk.g:3153:1: rule__Styles__ValueAssignment_2 : ( ruleStyleObjects ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3157:1: ( ( ruleStyleObjects ) )
            // InternalPdfMk.g:3158:2: ( ruleStyleObjects )
            {
            // InternalPdfMk.g:3158:2: ( ruleStyleObjects )
            // InternalPdfMk.g:3159:3: ruleStyleObjects
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
    // InternalPdfMk.g:3168:1: rule__Content__KeyAssignment_0 : ( ( 'content' ) ) ;
    public final void rule__Content__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3172:1: ( ( ( 'content' ) ) )
            // InternalPdfMk.g:3173:2: ( ( 'content' ) )
            {
            // InternalPdfMk.g:3173:2: ( ( 'content' ) )
            // InternalPdfMk.g:3174:3: ( 'content' )
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            // InternalPdfMk.g:3175:3: ( 'content' )
            // InternalPdfMk.g:3176:4: 'content'
            {
             before(grammarAccess.getContentAccess().getKeyContentKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPdfMk.g:3187:1: rule__Content__ValueAssignment_2 : ( ruleContentObjects ) ;
    public final void rule__Content__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:3191:1: ( ( ruleContentObjects ) )
            // InternalPdfMk.g:3192:2: ( ruleContentObjects )
            {
            // InternalPdfMk.g:3192:2: ( ruleContentObjects )
            // InternalPdfMk.g:3193:3: ruleContentObjects
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008060000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000060040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000410010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});

}