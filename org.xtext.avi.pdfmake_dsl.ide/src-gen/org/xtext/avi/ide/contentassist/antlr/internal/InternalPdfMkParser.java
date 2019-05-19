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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'var'", "'dd'", "'='", "'{'", "'}'", "','", "'text:'", "'['", "']'", "'style:'", "':'", "'content:['", "'alignment'", "'styles'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRuleStringElement"
    // InternalPdfMk.g:78:1: entryRuleStringElement : ruleStringElement EOF ;
    public final void entryRuleStringElement() throws RecognitionException {
        try {
            // InternalPdfMk.g:79:1: ( ruleStringElement EOF )
            // InternalPdfMk.g:80:1: ruleStringElement EOF
            {
             before(grammarAccess.getStringElementRule()); 
            pushFollow(FOLLOW_1);
            ruleStringElement();

            state._fsp--;

             after(grammarAccess.getStringElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // InternalPdfMk.g:87:1: ruleStringElement : ( ( rule__StringElement__ValueAssignment ) ) ;
    public final void ruleStringElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:91:2: ( ( ( rule__StringElement__ValueAssignment ) ) )
            // InternalPdfMk.g:92:2: ( ( rule__StringElement__ValueAssignment ) )
            {
            // InternalPdfMk.g:92:2: ( ( rule__StringElement__ValueAssignment ) )
            // InternalPdfMk.g:93:3: ( rule__StringElement__ValueAssignment )
            {
             before(grammarAccess.getStringElementAccess().getValueAssignment()); 
            // InternalPdfMk.g:94:3: ( rule__StringElement__ValueAssignment )
            // InternalPdfMk.g:94:4: rule__StringElement__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringElement__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleTextDefinition"
    // InternalPdfMk.g:103:1: entryRuleTextDefinition : ruleTextDefinition EOF ;
    public final void entryRuleTextDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:104:1: ( ruleTextDefinition EOF )
            // InternalPdfMk.g:105:1: ruleTextDefinition EOF
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
    // InternalPdfMk.g:112:1: ruleTextDefinition : ( ( rule__TextDefinition__Alternatives ) ) ;
    public final void ruleTextDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:116:2: ( ( ( rule__TextDefinition__Alternatives ) ) )
            // InternalPdfMk.g:117:2: ( ( rule__TextDefinition__Alternatives ) )
            {
            // InternalPdfMk.g:117:2: ( ( rule__TextDefinition__Alternatives ) )
            // InternalPdfMk.g:118:3: ( rule__TextDefinition__Alternatives )
            {
             before(grammarAccess.getTextDefinitionAccess().getAlternatives()); 
            // InternalPdfMk.g:119:3: ( rule__TextDefinition__Alternatives )
            // InternalPdfMk.g:119:4: rule__TextDefinition__Alternatives
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


    // $ANTLR start "entryRuleStyleDefinition"
    // InternalPdfMk.g:128:1: entryRuleStyleDefinition : ruleStyleDefinition EOF ;
    public final void entryRuleStyleDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:129:1: ( ruleStyleDefinition EOF )
            // InternalPdfMk.g:130:1: ruleStyleDefinition EOF
            {
             before(grammarAccess.getStyleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleDefinition();

            state._fsp--;

             after(grammarAccess.getStyleDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStyleDefinition"


    // $ANTLR start "ruleStyleDefinition"
    // InternalPdfMk.g:137:1: ruleStyleDefinition : ( ( rule__StyleDefinition__Group__0 ) ) ;
    public final void ruleStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:141:2: ( ( ( rule__StyleDefinition__Group__0 ) ) )
            // InternalPdfMk.g:142:2: ( ( rule__StyleDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:142:2: ( ( rule__StyleDefinition__Group__0 ) )
            // InternalPdfMk.g:143:3: ( rule__StyleDefinition__Group__0 )
            {
             before(grammarAccess.getStyleDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:144:3: ( rule__StyleDefinition__Group__0 )
            // InternalPdfMk.g:144:4: rule__StyleDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyleDefinition"


    // $ANTLR start "entryRuleTextAlignmentDefinition"
    // InternalPdfMk.g:153:1: entryRuleTextAlignmentDefinition : ruleTextAlignmentDefinition EOF ;
    public final void entryRuleTextAlignmentDefinition() throws RecognitionException {
        try {
            // InternalPdfMk.g:154:1: ( ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:155:1: ruleTextAlignmentDefinition EOF
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
    // InternalPdfMk.g:162:1: ruleTextAlignmentDefinition : ( ( rule__TextAlignmentDefinition__Group__0 ) ) ;
    public final void ruleTextAlignmentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:166:2: ( ( ( rule__TextAlignmentDefinition__Group__0 ) ) )
            // InternalPdfMk.g:167:2: ( ( rule__TextAlignmentDefinition__Group__0 ) )
            {
            // InternalPdfMk.g:167:2: ( ( rule__TextAlignmentDefinition__Group__0 ) )
            // InternalPdfMk.g:168:3: ( rule__TextAlignmentDefinition__Group__0 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getGroup()); 
            // InternalPdfMk.g:169:3: ( rule__TextAlignmentDefinition__Group__0 )
            // InternalPdfMk.g:169:4: rule__TextAlignmentDefinition__Group__0
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


    // $ANTLR start "entryRuleBoolean"
    // InternalPdfMk.g:178:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalPdfMk.g:179:1: ( ruleBoolean EOF )
            // InternalPdfMk.g:180:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalPdfMk.g:187:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:191:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalPdfMk.g:192:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalPdfMk.g:192:2: ( ( rule__Boolean__Alternatives ) )
            // InternalPdfMk.g:193:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalPdfMk.g:194:3: ( rule__Boolean__Alternatives )
            // InternalPdfMk.g:194:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleTextElement"
    // InternalPdfMk.g:203:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // InternalPdfMk.g:204:1: ( ruleTextElement EOF )
            // InternalPdfMk.g:205:1: ruleTextElement EOF
            {
             before(grammarAccess.getTextElementRule()); 
            pushFollow(FOLLOW_1);
            ruleTextElement();

            state._fsp--;

             after(grammarAccess.getTextElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // InternalPdfMk.g:212:1: ruleTextElement : ( ( rule__TextElement__Group__0 ) ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:216:2: ( ( ( rule__TextElement__Group__0 ) ) )
            // InternalPdfMk.g:217:2: ( ( rule__TextElement__Group__0 ) )
            {
            // InternalPdfMk.g:217:2: ( ( rule__TextElement__Group__0 ) )
            // InternalPdfMk.g:218:3: ( rule__TextElement__Group__0 )
            {
             before(grammarAccess.getTextElementAccess().getGroup()); 
            // InternalPdfMk.g:219:3: ( rule__TextElement__Group__0 )
            // InternalPdfMk.g:219:4: rule__TextElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleElement"
    // InternalPdfMk.g:228:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalPdfMk.g:229:1: ( ruleElement EOF )
            // InternalPdfMk.g:230:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalPdfMk.g:237:1: ruleElement : ( ( rule__Element__ValueAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:241:2: ( ( ( rule__Element__ValueAssignment ) ) )
            // InternalPdfMk.g:242:2: ( ( rule__Element__ValueAssignment ) )
            {
            // InternalPdfMk.g:242:2: ( ( rule__Element__ValueAssignment ) )
            // InternalPdfMk.g:243:3: ( rule__Element__ValueAssignment )
            {
             before(grammarAccess.getElementAccess().getValueAssignment()); 
            // InternalPdfMk.g:244:3: ( rule__Element__ValueAssignment )
            // InternalPdfMk.g:244:4: rule__Element__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Element__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleElements"
    // InternalPdfMk.g:253:1: entryRuleElements : ruleElements EOF ;
    public final void entryRuleElements() throws RecognitionException {
        try {
            // InternalPdfMk.g:254:1: ( ruleElements EOF )
            // InternalPdfMk.g:255:1: ruleElements EOF
            {
             before(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalPdfMk.g:262:1: ruleElements : ( ( rule__Elements__Group__0 ) ) ;
    public final void ruleElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:266:2: ( ( ( rule__Elements__Group__0 ) ) )
            // InternalPdfMk.g:267:2: ( ( rule__Elements__Group__0 ) )
            {
            // InternalPdfMk.g:267:2: ( ( rule__Elements__Group__0 ) )
            // InternalPdfMk.g:268:3: ( rule__Elements__Group__0 )
            {
             before(grammarAccess.getElementsAccess().getGroup()); 
            // InternalPdfMk.g:269:3: ( rule__Elements__Group__0 )
            // InternalPdfMk.g:269:4: rule__Elements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Elements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleStyles"
    // InternalPdfMk.g:278:1: entryRuleStyles : ruleStyles EOF ;
    public final void entryRuleStyles() throws RecognitionException {
        try {
            // InternalPdfMk.g:279:1: ( ruleStyles EOF )
            // InternalPdfMk.g:280:1: ruleStyles EOF
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
    // InternalPdfMk.g:287:1: ruleStyles : ( ( rule__Styles__Group__0 ) ) ;
    public final void ruleStyles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:291:2: ( ( ( rule__Styles__Group__0 ) ) )
            // InternalPdfMk.g:292:2: ( ( rule__Styles__Group__0 ) )
            {
            // InternalPdfMk.g:292:2: ( ( rule__Styles__Group__0 ) )
            // InternalPdfMk.g:293:3: ( rule__Styles__Group__0 )
            {
             before(grammarAccess.getStylesAccess().getGroup()); 
            // InternalPdfMk.g:294:3: ( rule__Styles__Group__0 )
            // InternalPdfMk.g:294:4: rule__Styles__Group__0
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
    // InternalPdfMk.g:303:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:304:1: ( ruleContent EOF )
            // InternalPdfMk.g:305:1: ruleContent EOF
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
    // InternalPdfMk.g:312:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:316:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPdfMk.g:317:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPdfMk.g:317:2: ( ( rule__Content__Group__0 ) )
            // InternalPdfMk.g:318:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPdfMk.g:319:3: ( rule__Content__Group__0 )
            // InternalPdfMk.g:319:4: rule__Content__Group__0
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


    // $ANTLR start "rule__TextDefinition__Alternatives"
    // InternalPdfMk.g:327:1: rule__TextDefinition__Alternatives : ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) );
    public final void rule__TextDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:331:1: ( ( ( rule__TextDefinition__Group_0__0 ) ) | ( ( rule__TextDefinition__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPdfMk.g:332:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    {
                    // InternalPdfMk.g:332:2: ( ( rule__TextDefinition__Group_0__0 ) )
                    // InternalPdfMk.g:333:3: ( rule__TextDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_0()); 
                    // InternalPdfMk.g:334:3: ( rule__TextDefinition__Group_0__0 )
                    // InternalPdfMk.g:334:4: rule__TextDefinition__Group_0__0
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
                    // InternalPdfMk.g:338:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    {
                    // InternalPdfMk.g:338:2: ( ( rule__TextDefinition__Group_1__0 ) )
                    // InternalPdfMk.g:339:3: ( rule__TextDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getTextDefinitionAccess().getGroup_1()); 
                    // InternalPdfMk.g:340:3: ( rule__TextDefinition__Group_1__0 )
                    // InternalPdfMk.g:340:4: rule__TextDefinition__Group_1__0
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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalPdfMk.g:348:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:352:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
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
                    // InternalPdfMk.g:353:2: ( 'true' )
                    {
                    // InternalPdfMk.g:353:2: ( 'true' )
                    // InternalPdfMk.g:354:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:359:2: ( 'false' )
                    {
                    // InternalPdfMk.g:359:2: ( 'false' )
                    // InternalPdfMk.g:360:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Element__ValueAlternatives_0"
    // InternalPdfMk.g:369:1: rule__Element__ValueAlternatives_0 : ( ( ruleStringElement ) | ( ruleTextElement ) );
    public final void rule__Element__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:373:1: ( ( ruleStringElement ) | ( ruleTextElement ) )
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
                    // InternalPdfMk.g:374:2: ( ruleStringElement )
                    {
                    // InternalPdfMk.g:374:2: ( ruleStringElement )
                    // InternalPdfMk.g:375:3: ruleStringElement
                    {
                     before(grammarAccess.getElementAccess().getValueStringElementParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getValueStringElementParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:380:2: ( ruleTextElement )
                    {
                    // InternalPdfMk.g:380:2: ( ruleTextElement )
                    // InternalPdfMk.g:381:3: ruleTextElement
                    {
                     before(grammarAccess.getElementAccess().getValueTextElementParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getValueTextElementParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Element__ValueAlternatives_0"


    // $ANTLR start "rule__DocDefinition__Group__0"
    // InternalPdfMk.g:390:1: rule__DocDefinition__Group__0 : rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 ;
    public final void rule__DocDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:394:1: ( rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1 )
            // InternalPdfMk.g:395:2: rule__DocDefinition__Group__0__Impl rule__DocDefinition__Group__1
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
    // InternalPdfMk.g:402:1: rule__DocDefinition__Group__0__Impl : ( 'var' ) ;
    public final void rule__DocDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:406:1: ( ( 'var' ) )
            // InternalPdfMk.g:407:1: ( 'var' )
            {
            // InternalPdfMk.g:407:1: ( 'var' )
            // InternalPdfMk.g:408:2: 'var'
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
    // InternalPdfMk.g:417:1: rule__DocDefinition__Group__1 : rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 ;
    public final void rule__DocDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:421:1: ( rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2 )
            // InternalPdfMk.g:422:2: rule__DocDefinition__Group__1__Impl rule__DocDefinition__Group__2
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
    // InternalPdfMk.g:429:1: rule__DocDefinition__Group__1__Impl : ( 'dd' ) ;
    public final void rule__DocDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:433:1: ( ( 'dd' ) )
            // InternalPdfMk.g:434:1: ( 'dd' )
            {
            // InternalPdfMk.g:434:1: ( 'dd' )
            // InternalPdfMk.g:435:2: 'dd'
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
    // InternalPdfMk.g:444:1: rule__DocDefinition__Group__2 : rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 ;
    public final void rule__DocDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:448:1: ( rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3 )
            // InternalPdfMk.g:449:2: rule__DocDefinition__Group__2__Impl rule__DocDefinition__Group__3
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
    // InternalPdfMk.g:456:1: rule__DocDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__DocDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:460:1: ( ( '=' ) )
            // InternalPdfMk.g:461:1: ( '=' )
            {
            // InternalPdfMk.g:461:1: ( '=' )
            // InternalPdfMk.g:462:2: '='
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
    // InternalPdfMk.g:471:1: rule__DocDefinition__Group__3 : rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 ;
    public final void rule__DocDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:475:1: ( rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4 )
            // InternalPdfMk.g:476:2: rule__DocDefinition__Group__3__Impl rule__DocDefinition__Group__4
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
    // InternalPdfMk.g:483:1: rule__DocDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DocDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:487:1: ( ( '{' ) )
            // InternalPdfMk.g:488:1: ( '{' )
            {
            // InternalPdfMk.g:488:1: ( '{' )
            // InternalPdfMk.g:489:2: '{'
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
    // InternalPdfMk.g:498:1: rule__DocDefinition__Group__4 : rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 ;
    public final void rule__DocDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:502:1: ( rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5 )
            // InternalPdfMk.g:503:2: rule__DocDefinition__Group__4__Impl rule__DocDefinition__Group__5
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
    // InternalPdfMk.g:510:1: rule__DocDefinition__Group__4__Impl : ( ( rule__DocDefinition__ContentAssignment_4 ) ) ;
    public final void rule__DocDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:514:1: ( ( ( rule__DocDefinition__ContentAssignment_4 ) ) )
            // InternalPdfMk.g:515:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            {
            // InternalPdfMk.g:515:1: ( ( rule__DocDefinition__ContentAssignment_4 ) )
            // InternalPdfMk.g:516:2: ( rule__DocDefinition__ContentAssignment_4 )
            {
             before(grammarAccess.getDocDefinitionAccess().getContentAssignment_4()); 
            // InternalPdfMk.g:517:2: ( rule__DocDefinition__ContentAssignment_4 )
            // InternalPdfMk.g:517:3: rule__DocDefinition__ContentAssignment_4
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
    // InternalPdfMk.g:525:1: rule__DocDefinition__Group__5 : rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 ;
    public final void rule__DocDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:529:1: ( rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6 )
            // InternalPdfMk.g:530:2: rule__DocDefinition__Group__5__Impl rule__DocDefinition__Group__6
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
    // InternalPdfMk.g:537:1: rule__DocDefinition__Group__5__Impl : ( ( rule__DocDefinition__Group_5__0 )? ) ;
    public final void rule__DocDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:541:1: ( ( ( rule__DocDefinition__Group_5__0 )? ) )
            // InternalPdfMk.g:542:1: ( ( rule__DocDefinition__Group_5__0 )? )
            {
            // InternalPdfMk.g:542:1: ( ( rule__DocDefinition__Group_5__0 )? )
            // InternalPdfMk.g:543:2: ( rule__DocDefinition__Group_5__0 )?
            {
             before(grammarAccess.getDocDefinitionAccess().getGroup_5()); 
            // InternalPdfMk.g:544:2: ( rule__DocDefinition__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:544:3: rule__DocDefinition__Group_5__0
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
    // InternalPdfMk.g:552:1: rule__DocDefinition__Group__6 : rule__DocDefinition__Group__6__Impl ;
    public final void rule__DocDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:556:1: ( rule__DocDefinition__Group__6__Impl )
            // InternalPdfMk.g:557:2: rule__DocDefinition__Group__6__Impl
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
    // InternalPdfMk.g:563:1: rule__DocDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__DocDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:567:1: ( ( '}' ) )
            // InternalPdfMk.g:568:1: ( '}' )
            {
            // InternalPdfMk.g:568:1: ( '}' )
            // InternalPdfMk.g:569:2: '}'
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
    // InternalPdfMk.g:579:1: rule__DocDefinition__Group_5__0 : rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 ;
    public final void rule__DocDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:583:1: ( rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1 )
            // InternalPdfMk.g:584:2: rule__DocDefinition__Group_5__0__Impl rule__DocDefinition__Group_5__1
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
    // InternalPdfMk.g:591:1: rule__DocDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DocDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:595:1: ( ( ',' ) )
            // InternalPdfMk.g:596:1: ( ',' )
            {
            // InternalPdfMk.g:596:1: ( ',' )
            // InternalPdfMk.g:597:2: ','
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
    // InternalPdfMk.g:606:1: rule__DocDefinition__Group_5__1 : rule__DocDefinition__Group_5__1__Impl ;
    public final void rule__DocDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:610:1: ( rule__DocDefinition__Group_5__1__Impl )
            // InternalPdfMk.g:611:2: rule__DocDefinition__Group_5__1__Impl
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
    // InternalPdfMk.g:617:1: rule__DocDefinition__Group_5__1__Impl : ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) ;
    public final void rule__DocDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:621:1: ( ( ( rule__DocDefinition__StylesAssignment_5_1 ) ) )
            // InternalPdfMk.g:622:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            {
            // InternalPdfMk.g:622:1: ( ( rule__DocDefinition__StylesAssignment_5_1 ) )
            // InternalPdfMk.g:623:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            {
             before(grammarAccess.getDocDefinitionAccess().getStylesAssignment_5_1()); 
            // InternalPdfMk.g:624:2: ( rule__DocDefinition__StylesAssignment_5_1 )
            // InternalPdfMk.g:624:3: rule__DocDefinition__StylesAssignment_5_1
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


    // $ANTLR start "rule__TextDefinition__Group_0__0"
    // InternalPdfMk.g:633:1: rule__TextDefinition__Group_0__0 : rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 ;
    public final void rule__TextDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:637:1: ( rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1 )
            // InternalPdfMk.g:638:2: rule__TextDefinition__Group_0__0__Impl rule__TextDefinition__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalPdfMk.g:645:1: rule__TextDefinition__Group_0__0__Impl : ( 'text:' ) ;
    public final void rule__TextDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:649:1: ( ( 'text:' ) )
            // InternalPdfMk.g:650:1: ( 'text:' )
            {
            // InternalPdfMk.g:650:1: ( 'text:' )
            // InternalPdfMk.g:651:2: 'text:'
            {
             before(grammarAccess.getTextDefinitionAccess().getTextKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalPdfMk.g:660:1: rule__TextDefinition__Group_0__1 : rule__TextDefinition__Group_0__1__Impl ;
    public final void rule__TextDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:664:1: ( rule__TextDefinition__Group_0__1__Impl )
            // InternalPdfMk.g:665:2: rule__TextDefinition__Group_0__1__Impl
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
    // InternalPdfMk.g:671:1: rule__TextDefinition__Group_0__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:675:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:676:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:676:1: ( RULE_STRING )
            // InternalPdfMk.g:677:2: RULE_STRING
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
    // InternalPdfMk.g:687:1: rule__TextDefinition__Group_1__0 : rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 ;
    public final void rule__TextDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:691:1: ( rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1 )
            // InternalPdfMk.g:692:2: rule__TextDefinition__Group_1__0__Impl rule__TextDefinition__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalPdfMk.g:699:1: rule__TextDefinition__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TextDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:703:1: ( ( '[' ) )
            // InternalPdfMk.g:704:1: ( '[' )
            {
            // InternalPdfMk.g:704:1: ( '[' )
            // InternalPdfMk.g:705:2: '['
            {
             before(grammarAccess.getTextDefinitionAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalPdfMk.g:714:1: rule__TextDefinition__Group_1__1 : rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 ;
    public final void rule__TextDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:718:1: ( rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2 )
            // InternalPdfMk.g:719:2: rule__TextDefinition__Group_1__1__Impl rule__TextDefinition__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalPdfMk.g:726:1: rule__TextDefinition__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__TextDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:730:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:731:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:731:1: ( RULE_STRING )
            // InternalPdfMk.g:732:2: RULE_STRING
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
    // InternalPdfMk.g:741:1: rule__TextDefinition__Group_1__2 : rule__TextDefinition__Group_1__2__Impl ;
    public final void rule__TextDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:745:1: ( rule__TextDefinition__Group_1__2__Impl )
            // InternalPdfMk.g:746:2: rule__TextDefinition__Group_1__2__Impl
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
    // InternalPdfMk.g:752:1: rule__TextDefinition__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TextDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:756:1: ( ( ']' ) )
            // InternalPdfMk.g:757:1: ( ']' )
            {
            // InternalPdfMk.g:757:1: ( ']' )
            // InternalPdfMk.g:758:2: ']'
            {
             before(grammarAccess.getTextDefinitionAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__StyleDefinition__Group__0"
    // InternalPdfMk.g:768:1: rule__StyleDefinition__Group__0 : rule__StyleDefinition__Group__0__Impl rule__StyleDefinition__Group__1 ;
    public final void rule__StyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:772:1: ( rule__StyleDefinition__Group__0__Impl rule__StyleDefinition__Group__1 )
            // InternalPdfMk.g:773:2: rule__StyleDefinition__Group__0__Impl rule__StyleDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleDefinition__Group__0"


    // $ANTLR start "rule__StyleDefinition__Group__0__Impl"
    // InternalPdfMk.g:780:1: rule__StyleDefinition__Group__0__Impl : ( 'style:' ) ;
    public final void rule__StyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:784:1: ( ( 'style:' ) )
            // InternalPdfMk.g:785:1: ( 'style:' )
            {
            // InternalPdfMk.g:785:1: ( 'style:' )
            // InternalPdfMk.g:786:2: 'style:'
            {
             before(grammarAccess.getStyleDefinitionAccess().getStyleKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStyleDefinitionAccess().getStyleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleDefinition__Group__0__Impl"


    // $ANTLR start "rule__StyleDefinition__Group__1"
    // InternalPdfMk.g:795:1: rule__StyleDefinition__Group__1 : rule__StyleDefinition__Group__1__Impl ;
    public final void rule__StyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:799:1: ( rule__StyleDefinition__Group__1__Impl )
            // InternalPdfMk.g:800:2: rule__StyleDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleDefinition__Group__1"


    // $ANTLR start "rule__StyleDefinition__Group__1__Impl"
    // InternalPdfMk.g:806:1: rule__StyleDefinition__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__StyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:810:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:811:1: ( RULE_STRING )
            {
            // InternalPdfMk.g:811:1: ( RULE_STRING )
            // InternalPdfMk.g:812:2: RULE_STRING
            {
             before(grammarAccess.getStyleDefinitionAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStyleDefinitionAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleDefinition__Group__1__Impl"


    // $ANTLR start "rule__TextAlignmentDefinition__Group__0"
    // InternalPdfMk.g:822:1: rule__TextAlignmentDefinition__Group__0 : rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 ;
    public final void rule__TextAlignmentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:826:1: ( rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1 )
            // InternalPdfMk.g:827:2: rule__TextAlignmentDefinition__Group__0__Impl rule__TextAlignmentDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPdfMk.g:834:1: rule__TextAlignmentDefinition__Group__0__Impl : ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) ) ;
    public final void rule__TextAlignmentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:838:1: ( ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:839:1: ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:839:1: ( ( rule__TextAlignmentDefinition__KeyAssignment_0 ) )
            // InternalPdfMk.g:840:2: ( rule__TextAlignmentDefinition__KeyAssignment_0 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:841:2: ( rule__TextAlignmentDefinition__KeyAssignment_0 )
            // InternalPdfMk.g:841:3: rule__TextAlignmentDefinition__KeyAssignment_0
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
    // InternalPdfMk.g:849:1: rule__TextAlignmentDefinition__Group__1 : rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 ;
    public final void rule__TextAlignmentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:853:1: ( rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2 )
            // InternalPdfMk.g:854:2: rule__TextAlignmentDefinition__Group__1__Impl rule__TextAlignmentDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalPdfMk.g:861:1: rule__TextAlignmentDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TextAlignmentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:865:1: ( ( ':' ) )
            // InternalPdfMk.g:866:1: ( ':' )
            {
            // InternalPdfMk.g:866:1: ( ':' )
            // InternalPdfMk.g:867:2: ':'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:876:1: rule__TextAlignmentDefinition__Group__2 : rule__TextAlignmentDefinition__Group__2__Impl ;
    public final void rule__TextAlignmentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:880:1: ( rule__TextAlignmentDefinition__Group__2__Impl )
            // InternalPdfMk.g:881:2: rule__TextAlignmentDefinition__Group__2__Impl
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
    // InternalPdfMk.g:887:1: rule__TextAlignmentDefinition__Group__2__Impl : ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) ) ;
    public final void rule__TextAlignmentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:891:1: ( ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:892:1: ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:892:1: ( ( rule__TextAlignmentDefinition__ValueAssignment_2 ) )
            // InternalPdfMk.g:893:2: ( rule__TextAlignmentDefinition__ValueAssignment_2 )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:894:2: ( rule__TextAlignmentDefinition__ValueAssignment_2 )
            // InternalPdfMk.g:894:3: rule__TextAlignmentDefinition__ValueAssignment_2
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


    // $ANTLR start "rule__TextElement__Group__0"
    // InternalPdfMk.g:903:1: rule__TextElement__Group__0 : rule__TextElement__Group__0__Impl rule__TextElement__Group__1 ;
    public final void rule__TextElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:907:1: ( rule__TextElement__Group__0__Impl rule__TextElement__Group__1 )
            // InternalPdfMk.g:908:2: rule__TextElement__Group__0__Impl rule__TextElement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TextElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__0"


    // $ANTLR start "rule__TextElement__Group__0__Impl"
    // InternalPdfMk.g:915:1: rule__TextElement__Group__0__Impl : ( ( rule__TextElement__ValueAssignment_0 ) ) ;
    public final void rule__TextElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:919:1: ( ( ( rule__TextElement__ValueAssignment_0 ) ) )
            // InternalPdfMk.g:920:1: ( ( rule__TextElement__ValueAssignment_0 ) )
            {
            // InternalPdfMk.g:920:1: ( ( rule__TextElement__ValueAssignment_0 ) )
            // InternalPdfMk.g:921:2: ( rule__TextElement__ValueAssignment_0 )
            {
             before(grammarAccess.getTextElementAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:922:2: ( rule__TextElement__ValueAssignment_0 )
            // InternalPdfMk.g:922:3: rule__TextElement__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TextElement__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextElementAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__0__Impl"


    // $ANTLR start "rule__TextElement__Group__1"
    // InternalPdfMk.g:930:1: rule__TextElement__Group__1 : rule__TextElement__Group__1__Impl rule__TextElement__Group__2 ;
    public final void rule__TextElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:934:1: ( rule__TextElement__Group__1__Impl rule__TextElement__Group__2 )
            // InternalPdfMk.g:935:2: rule__TextElement__Group__1__Impl rule__TextElement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TextElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__1"


    // $ANTLR start "rule__TextElement__Group__1__Impl"
    // InternalPdfMk.g:942:1: rule__TextElement__Group__1__Impl : ( ruleTextDefinition ) ;
    public final void rule__TextElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:946:1: ( ( ruleTextDefinition ) )
            // InternalPdfMk.g:947:1: ( ruleTextDefinition )
            {
            // InternalPdfMk.g:947:1: ( ruleTextDefinition )
            // InternalPdfMk.g:948:2: ruleTextDefinition
            {
             before(grammarAccess.getTextElementAccess().getTextDefinitionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTextDefinition();

            state._fsp--;

             after(grammarAccess.getTextElementAccess().getTextDefinitionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__1__Impl"


    // $ANTLR start "rule__TextElement__Group__2"
    // InternalPdfMk.g:957:1: rule__TextElement__Group__2 : rule__TextElement__Group__2__Impl rule__TextElement__Group__3 ;
    public final void rule__TextElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:961:1: ( rule__TextElement__Group__2__Impl rule__TextElement__Group__3 )
            // InternalPdfMk.g:962:2: rule__TextElement__Group__2__Impl rule__TextElement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__TextElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__2"


    // $ANTLR start "rule__TextElement__Group__2__Impl"
    // InternalPdfMk.g:969:1: rule__TextElement__Group__2__Impl : ( ( rule__TextElement__Group_2__0 )? ) ;
    public final void rule__TextElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:973:1: ( ( ( rule__TextElement__Group_2__0 )? ) )
            // InternalPdfMk.g:974:1: ( ( rule__TextElement__Group_2__0 )? )
            {
            // InternalPdfMk.g:974:1: ( ( rule__TextElement__Group_2__0 )? )
            // InternalPdfMk.g:975:2: ( rule__TextElement__Group_2__0 )?
            {
             before(grammarAccess.getTextElementAccess().getGroup_2()); 
            // InternalPdfMk.g:976:2: ( rule__TextElement__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:976:3: rule__TextElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextElement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__2__Impl"


    // $ANTLR start "rule__TextElement__Group__3"
    // InternalPdfMk.g:984:1: rule__TextElement__Group__3 : rule__TextElement__Group__3__Impl rule__TextElement__Group__4 ;
    public final void rule__TextElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:988:1: ( rule__TextElement__Group__3__Impl rule__TextElement__Group__4 )
            // InternalPdfMk.g:989:2: rule__TextElement__Group__3__Impl rule__TextElement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TextElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__3"


    // $ANTLR start "rule__TextElement__Group__3__Impl"
    // InternalPdfMk.g:996:1: rule__TextElement__Group__3__Impl : ( ( rule__TextElement__Group_3__0 )? ) ;
    public final void rule__TextElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1000:1: ( ( ( rule__TextElement__Group_3__0 )? ) )
            // InternalPdfMk.g:1001:1: ( ( rule__TextElement__Group_3__0 )? )
            {
            // InternalPdfMk.g:1001:1: ( ( rule__TextElement__Group_3__0 )? )
            // InternalPdfMk.g:1002:2: ( rule__TextElement__Group_3__0 )?
            {
             before(grammarAccess.getTextElementAccess().getGroup_3()); 
            // InternalPdfMk.g:1003:2: ( rule__TextElement__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:1003:3: rule__TextElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__3__Impl"


    // $ANTLR start "rule__TextElement__Group__4"
    // InternalPdfMk.g:1011:1: rule__TextElement__Group__4 : rule__TextElement__Group__4__Impl ;
    public final void rule__TextElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1015:1: ( rule__TextElement__Group__4__Impl )
            // InternalPdfMk.g:1016:2: rule__TextElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__4"


    // $ANTLR start "rule__TextElement__Group__4__Impl"
    // InternalPdfMk.g:1022:1: rule__TextElement__Group__4__Impl : ( '}' ) ;
    public final void rule__TextElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1026:1: ( ( '}' ) )
            // InternalPdfMk.g:1027:1: ( '}' )
            {
            // InternalPdfMk.g:1027:1: ( '}' )
            // InternalPdfMk.g:1028:2: '}'
            {
             before(grammarAccess.getTextElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextElementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group__4__Impl"


    // $ANTLR start "rule__TextElement__Group_2__0"
    // InternalPdfMk.g:1038:1: rule__TextElement__Group_2__0 : rule__TextElement__Group_2__0__Impl rule__TextElement__Group_2__1 ;
    public final void rule__TextElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1042:1: ( rule__TextElement__Group_2__0__Impl rule__TextElement__Group_2__1 )
            // InternalPdfMk.g:1043:2: rule__TextElement__Group_2__0__Impl rule__TextElement__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__TextElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_2__0"


    // $ANTLR start "rule__TextElement__Group_2__0__Impl"
    // InternalPdfMk.g:1050:1: rule__TextElement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TextElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1054:1: ( ( ',' ) )
            // InternalPdfMk.g:1055:1: ( ',' )
            {
            // InternalPdfMk.g:1055:1: ( ',' )
            // InternalPdfMk.g:1056:2: ','
            {
             before(grammarAccess.getTextElementAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextElementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_2__0__Impl"


    // $ANTLR start "rule__TextElement__Group_2__1"
    // InternalPdfMk.g:1065:1: rule__TextElement__Group_2__1 : rule__TextElement__Group_2__1__Impl ;
    public final void rule__TextElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1069:1: ( rule__TextElement__Group_2__1__Impl )
            // InternalPdfMk.g:1070:2: rule__TextElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextElement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_2__1"


    // $ANTLR start "rule__TextElement__Group_2__1__Impl"
    // InternalPdfMk.g:1076:1: rule__TextElement__Group_2__1__Impl : ( ruleStyleDefinition ) ;
    public final void rule__TextElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1080:1: ( ( ruleStyleDefinition ) )
            // InternalPdfMk.g:1081:1: ( ruleStyleDefinition )
            {
            // InternalPdfMk.g:1081:1: ( ruleStyleDefinition )
            // InternalPdfMk.g:1082:2: ruleStyleDefinition
            {
             before(grammarAccess.getTextElementAccess().getStyleDefinitionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleStyleDefinition();

            state._fsp--;

             after(grammarAccess.getTextElementAccess().getStyleDefinitionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_2__1__Impl"


    // $ANTLR start "rule__TextElement__Group_3__0"
    // InternalPdfMk.g:1092:1: rule__TextElement__Group_3__0 : rule__TextElement__Group_3__0__Impl rule__TextElement__Group_3__1 ;
    public final void rule__TextElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1096:1: ( rule__TextElement__Group_3__0__Impl rule__TextElement__Group_3__1 )
            // InternalPdfMk.g:1097:2: rule__TextElement__Group_3__0__Impl rule__TextElement__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__TextElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_3__0"


    // $ANTLR start "rule__TextElement__Group_3__0__Impl"
    // InternalPdfMk.g:1104:1: rule__TextElement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TextElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1108:1: ( ( ',' ) )
            // InternalPdfMk.g:1109:1: ( ',' )
            {
            // InternalPdfMk.g:1109:1: ( ',' )
            // InternalPdfMk.g:1110:2: ','
            {
             before(grammarAccess.getTextElementAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextElementAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_3__0__Impl"


    // $ANTLR start "rule__TextElement__Group_3__1"
    // InternalPdfMk.g:1119:1: rule__TextElement__Group_3__1 : rule__TextElement__Group_3__1__Impl ;
    public final void rule__TextElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1123:1: ( rule__TextElement__Group_3__1__Impl )
            // InternalPdfMk.g:1124:2: rule__TextElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_3__1"


    // $ANTLR start "rule__TextElement__Group_3__1__Impl"
    // InternalPdfMk.g:1130:1: rule__TextElement__Group_3__1__Impl : ( ruleTextAlignmentDefinition ) ;
    public final void rule__TextElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1134:1: ( ( ruleTextAlignmentDefinition ) )
            // InternalPdfMk.g:1135:1: ( ruleTextAlignmentDefinition )
            {
            // InternalPdfMk.g:1135:1: ( ruleTextAlignmentDefinition )
            // InternalPdfMk.g:1136:2: ruleTextAlignmentDefinition
            {
             before(grammarAccess.getTextElementAccess().getTextAlignmentDefinitionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleTextAlignmentDefinition();

            state._fsp--;

             after(grammarAccess.getTextElementAccess().getTextAlignmentDefinitionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__Group_3__1__Impl"


    // $ANTLR start "rule__Elements__Group__0"
    // InternalPdfMk.g:1146:1: rule__Elements__Group__0 : rule__Elements__Group__0__Impl rule__Elements__Group__1 ;
    public final void rule__Elements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1150:1: ( rule__Elements__Group__0__Impl rule__Elements__Group__1 )
            // InternalPdfMk.g:1151:2: rule__Elements__Group__0__Impl rule__Elements__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Elements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__0"


    // $ANTLR start "rule__Elements__Group__0__Impl"
    // InternalPdfMk.g:1158:1: rule__Elements__Group__0__Impl : ( ( rule__Elements__ValueAssignment_0 )? ) ;
    public final void rule__Elements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1162:1: ( ( ( rule__Elements__ValueAssignment_0 )? ) )
            // InternalPdfMk.g:1163:1: ( ( rule__Elements__ValueAssignment_0 )? )
            {
            // InternalPdfMk.g:1163:1: ( ( rule__Elements__ValueAssignment_0 )? )
            // InternalPdfMk.g:1164:2: ( rule__Elements__ValueAssignment_0 )?
            {
             before(grammarAccess.getElementsAccess().getValueAssignment_0()); 
            // InternalPdfMk.g:1165:2: ( rule__Elements__ValueAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:1165:3: rule__Elements__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Elements__ValueAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementsAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__0__Impl"


    // $ANTLR start "rule__Elements__Group__1"
    // InternalPdfMk.g:1173:1: rule__Elements__Group__1 : rule__Elements__Group__1__Impl ;
    public final void rule__Elements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1177:1: ( rule__Elements__Group__1__Impl )
            // InternalPdfMk.g:1178:2: rule__Elements__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elements__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__1"


    // $ANTLR start "rule__Elements__Group__1__Impl"
    // InternalPdfMk.g:1184:1: rule__Elements__Group__1__Impl : ( ( rule__Elements__Group_1__0 )* ) ;
    public final void rule__Elements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1188:1: ( ( ( rule__Elements__Group_1__0 )* ) )
            // InternalPdfMk.g:1189:1: ( ( rule__Elements__Group_1__0 )* )
            {
            // InternalPdfMk.g:1189:1: ( ( rule__Elements__Group_1__0 )* )
            // InternalPdfMk.g:1190:2: ( rule__Elements__Group_1__0 )*
            {
             before(grammarAccess.getElementsAccess().getGroup_1()); 
            // InternalPdfMk.g:1191:2: ( rule__Elements__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPdfMk.g:1191:3: rule__Elements__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Elements__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getElementsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__1__Impl"


    // $ANTLR start "rule__Elements__Group_1__0"
    // InternalPdfMk.g:1200:1: rule__Elements__Group_1__0 : rule__Elements__Group_1__0__Impl rule__Elements__Group_1__1 ;
    public final void rule__Elements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1204:1: ( rule__Elements__Group_1__0__Impl rule__Elements__Group_1__1 )
            // InternalPdfMk.g:1205:2: rule__Elements__Group_1__0__Impl rule__Elements__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Elements__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elements__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group_1__0"


    // $ANTLR start "rule__Elements__Group_1__0__Impl"
    // InternalPdfMk.g:1212:1: rule__Elements__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Elements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1216:1: ( ( ',' ) )
            // InternalPdfMk.g:1217:1: ( ',' )
            {
            // InternalPdfMk.g:1217:1: ( ',' )
            // InternalPdfMk.g:1218:2: ','
            {
             before(grammarAccess.getElementsAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getElementsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group_1__0__Impl"


    // $ANTLR start "rule__Elements__Group_1__1"
    // InternalPdfMk.g:1227:1: rule__Elements__Group_1__1 : rule__Elements__Group_1__1__Impl ;
    public final void rule__Elements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1231:1: ( rule__Elements__Group_1__1__Impl )
            // InternalPdfMk.g:1232:2: rule__Elements__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elements__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group_1__1"


    // $ANTLR start "rule__Elements__Group_1__1__Impl"
    // InternalPdfMk.g:1238:1: rule__Elements__Group_1__1__Impl : ( ( rule__Elements__ValueAssignment_1_1 ) ) ;
    public final void rule__Elements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1242:1: ( ( ( rule__Elements__ValueAssignment_1_1 ) ) )
            // InternalPdfMk.g:1243:1: ( ( rule__Elements__ValueAssignment_1_1 ) )
            {
            // InternalPdfMk.g:1243:1: ( ( rule__Elements__ValueAssignment_1_1 ) )
            // InternalPdfMk.g:1244:2: ( rule__Elements__ValueAssignment_1_1 )
            {
             before(grammarAccess.getElementsAccess().getValueAssignment_1_1()); 
            // InternalPdfMk.g:1245:2: ( rule__Elements__ValueAssignment_1_1 )
            // InternalPdfMk.g:1245:3: rule__Elements__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Elements__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group_1__1__Impl"


    // $ANTLR start "rule__Styles__Group__0"
    // InternalPdfMk.g:1254:1: rule__Styles__Group__0 : rule__Styles__Group__0__Impl rule__Styles__Group__1 ;
    public final void rule__Styles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1258:1: ( rule__Styles__Group__0__Impl rule__Styles__Group__1 )
            // InternalPdfMk.g:1259:2: rule__Styles__Group__0__Impl rule__Styles__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPdfMk.g:1266:1: rule__Styles__Group__0__Impl : ( ( rule__Styles__KeyAssignment_0 ) ) ;
    public final void rule__Styles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1270:1: ( ( ( rule__Styles__KeyAssignment_0 ) ) )
            // InternalPdfMk.g:1271:1: ( ( rule__Styles__KeyAssignment_0 ) )
            {
            // InternalPdfMk.g:1271:1: ( ( rule__Styles__KeyAssignment_0 ) )
            // InternalPdfMk.g:1272:2: ( rule__Styles__KeyAssignment_0 )
            {
             before(grammarAccess.getStylesAccess().getKeyAssignment_0()); 
            // InternalPdfMk.g:1273:2: ( rule__Styles__KeyAssignment_0 )
            // InternalPdfMk.g:1273:3: rule__Styles__KeyAssignment_0
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
    // InternalPdfMk.g:1281:1: rule__Styles__Group__1 : rule__Styles__Group__1__Impl rule__Styles__Group__2 ;
    public final void rule__Styles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1285:1: ( rule__Styles__Group__1__Impl rule__Styles__Group__2 )
            // InternalPdfMk.g:1286:2: rule__Styles__Group__1__Impl rule__Styles__Group__2
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
    // InternalPdfMk.g:1293:1: rule__Styles__Group__1__Impl : ( ':' ) ;
    public final void rule__Styles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1297:1: ( ( ':' ) )
            // InternalPdfMk.g:1298:1: ( ':' )
            {
            // InternalPdfMk.g:1298:1: ( ':' )
            // InternalPdfMk.g:1299:2: ':'
            {
             before(grammarAccess.getStylesAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPdfMk.g:1308:1: rule__Styles__Group__2 : rule__Styles__Group__2__Impl rule__Styles__Group__3 ;
    public final void rule__Styles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1312:1: ( rule__Styles__Group__2__Impl rule__Styles__Group__3 )
            // InternalPdfMk.g:1313:2: rule__Styles__Group__2__Impl rule__Styles__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Styles__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Styles__Group__3();

            state._fsp--;


            }

        }
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
    // InternalPdfMk.g:1320:1: rule__Styles__Group__2__Impl : ( ( rule__Styles__ValueAssignment_2 ) ) ;
    public final void rule__Styles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1324:1: ( ( ( rule__Styles__ValueAssignment_2 ) ) )
            // InternalPdfMk.g:1325:1: ( ( rule__Styles__ValueAssignment_2 ) )
            {
            // InternalPdfMk.g:1325:1: ( ( rule__Styles__ValueAssignment_2 ) )
            // InternalPdfMk.g:1326:2: ( rule__Styles__ValueAssignment_2 )
            {
             before(grammarAccess.getStylesAccess().getValueAssignment_2()); 
            // InternalPdfMk.g:1327:2: ( rule__Styles__ValueAssignment_2 )
            // InternalPdfMk.g:1327:3: rule__Styles__ValueAssignment_2
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


    // $ANTLR start "rule__Styles__Group__3"
    // InternalPdfMk.g:1335:1: rule__Styles__Group__3 : rule__Styles__Group__3__Impl ;
    public final void rule__Styles__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1339:1: ( rule__Styles__Group__3__Impl )
            // InternalPdfMk.g:1340:2: rule__Styles__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Styles__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__Group__3"


    // $ANTLR start "rule__Styles__Group__3__Impl"
    // InternalPdfMk.g:1346:1: rule__Styles__Group__3__Impl : ( '}' ) ;
    public final void rule__Styles__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1350:1: ( ( '}' ) )
            // InternalPdfMk.g:1351:1: ( '}' )
            {
            // InternalPdfMk.g:1351:1: ( '}' )
            // InternalPdfMk.g:1352:2: '}'
            {
             before(grammarAccess.getStylesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStylesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Styles__Group__3__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // InternalPdfMk.g:1362:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1366:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPdfMk.g:1367:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPdfMk.g:1374:1: rule__Content__Group__0__Impl : ( 'content:[' ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1378:1: ( ( 'content:[' ) )
            // InternalPdfMk.g:1379:1: ( 'content:[' )
            {
            // InternalPdfMk.g:1379:1: ( 'content:[' )
            // InternalPdfMk.g:1380:2: 'content:['
            {
             before(grammarAccess.getContentAccess().getContentKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getContentKeyword_0()); 

            }


            }

        }
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
    // InternalPdfMk.g:1389:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1393:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalPdfMk.g:1394:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalPdfMk.g:1401:1: rule__Content__Group__1__Impl : ( ruleElements ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1405:1: ( ( ruleElements ) )
            // InternalPdfMk.g:1406:1: ( ruleElements )
            {
            // InternalPdfMk.g:1406:1: ( ruleElements )
            // InternalPdfMk.g:1407:2: ruleElements
            {
             before(grammarAccess.getContentAccess().getElementsParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getContentAccess().getElementsParserRuleCall_1()); 

            }


            }

        }
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
    // InternalPdfMk.g:1416:1: rule__Content__Group__2 : rule__Content__Group__2__Impl ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1420:1: ( rule__Content__Group__2__Impl )
            // InternalPdfMk.g:1421:2: rule__Content__Group__2__Impl
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
    // InternalPdfMk.g:1427:1: rule__Content__Group__2__Impl : ( ']' ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1431:1: ( ( ']' ) )
            // InternalPdfMk.g:1432:1: ( ']' )
            {
            // InternalPdfMk.g:1432:1: ( ']' )
            // InternalPdfMk.g:1433:2: ']'
            {
             before(grammarAccess.getContentAccess().getRightSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalPdfMk.g:1443:1: rule__DocDefinition__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__DocDefinition__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1447:1: ( ( ruleContent ) )
            // InternalPdfMk.g:1448:2: ( ruleContent )
            {
            // InternalPdfMk.g:1448:2: ( ruleContent )
            // InternalPdfMk.g:1449:3: ruleContent
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
    // InternalPdfMk.g:1458:1: rule__DocDefinition__StylesAssignment_5_1 : ( ruleStyles ) ;
    public final void rule__DocDefinition__StylesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1462:1: ( ( ruleStyles ) )
            // InternalPdfMk.g:1463:2: ( ruleStyles )
            {
            // InternalPdfMk.g:1463:2: ( ruleStyles )
            // InternalPdfMk.g:1464:3: ruleStyles
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


    // $ANTLR start "rule__StringElement__ValueAssignment"
    // InternalPdfMk.g:1473:1: rule__StringElement__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringElement__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1477:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1478:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:1478:2: ( RULE_STRING )
            // InternalPdfMk.g:1479:3: RULE_STRING
            {
             before(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__ValueAssignment"


    // $ANTLR start "rule__TextAlignmentDefinition__KeyAssignment_0"
    // InternalPdfMk.g:1488:1: rule__TextAlignmentDefinition__KeyAssignment_0 : ( ( 'alignment' ) ) ;
    public final void rule__TextAlignmentDefinition__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1492:1: ( ( ( 'alignment' ) ) )
            // InternalPdfMk.g:1493:2: ( ( 'alignment' ) )
            {
            // InternalPdfMk.g:1493:2: ( ( 'alignment' ) )
            // InternalPdfMk.g:1494:3: ( 'alignment' )
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0()); 
            // InternalPdfMk.g:1495:3: ( 'alignment' )
            // InternalPdfMk.g:1496:4: 'alignment'
            {
             before(grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPdfMk.g:1507:1: rule__TextAlignmentDefinition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TextAlignmentDefinition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1511:1: ( ( RULE_STRING ) )
            // InternalPdfMk.g:1512:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:1512:2: ( RULE_STRING )
            // InternalPdfMk.g:1513:3: RULE_STRING
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


    // $ANTLR start "rule__TextElement__ValueAssignment_0"
    // InternalPdfMk.g:1522:1: rule__TextElement__ValueAssignment_0 : ( ( '{' ) ) ;
    public final void rule__TextElement__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1526:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:1527:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:1527:2: ( ( '{' ) )
            // InternalPdfMk.g:1528:3: ( '{' )
            {
             before(grammarAccess.getTextElementAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            // InternalPdfMk.g:1529:3: ( '{' )
            // InternalPdfMk.g:1530:4: '{'
            {
             before(grammarAccess.getTextElementAccess().getValueLeftCurlyBracketKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTextElementAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getTextElementAccess().getValueLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__ValueAssignment_0"


    // $ANTLR start "rule__Element__ValueAssignment"
    // InternalPdfMk.g:1541:1: rule__Element__ValueAssignment : ( ( rule__Element__ValueAlternatives_0 ) ) ;
    public final void rule__Element__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1545:1: ( ( ( rule__Element__ValueAlternatives_0 ) ) )
            // InternalPdfMk.g:1546:2: ( ( rule__Element__ValueAlternatives_0 ) )
            {
            // InternalPdfMk.g:1546:2: ( ( rule__Element__ValueAlternatives_0 ) )
            // InternalPdfMk.g:1547:3: ( rule__Element__ValueAlternatives_0 )
            {
             before(grammarAccess.getElementAccess().getValueAlternatives_0()); 
            // InternalPdfMk.g:1548:3: ( rule__Element__ValueAlternatives_0 )
            // InternalPdfMk.g:1548:4: rule__Element__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ValueAssignment"


    // $ANTLR start "rule__Elements__ValueAssignment_0"
    // InternalPdfMk.g:1556:1: rule__Elements__ValueAssignment_0 : ( ruleElement ) ;
    public final void rule__Elements__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1560:1: ( ( ruleElement ) )
            // InternalPdfMk.g:1561:2: ( ruleElement )
            {
            // InternalPdfMk.g:1561:2: ( ruleElement )
            // InternalPdfMk.g:1562:3: ruleElement
            {
             before(grammarAccess.getElementsAccess().getValueElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementsAccess().getValueElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__ValueAssignment_0"


    // $ANTLR start "rule__Elements__ValueAssignment_1_1"
    // InternalPdfMk.g:1571:1: rule__Elements__ValueAssignment_1_1 : ( ruleElement ) ;
    public final void rule__Elements__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1575:1: ( ( ruleElement ) )
            // InternalPdfMk.g:1576:2: ( ruleElement )
            {
            // InternalPdfMk.g:1576:2: ( ruleElement )
            // InternalPdfMk.g:1577:3: ruleElement
            {
             before(grammarAccess.getElementsAccess().getValueElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementsAccess().getValueElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__ValueAssignment_1_1"


    // $ANTLR start "rule__Styles__KeyAssignment_0"
    // InternalPdfMk.g:1586:1: rule__Styles__KeyAssignment_0 : ( ( 'styles' ) ) ;
    public final void rule__Styles__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1590:1: ( ( ( 'styles' ) ) )
            // InternalPdfMk.g:1591:2: ( ( 'styles' ) )
            {
            // InternalPdfMk.g:1591:2: ( ( 'styles' ) )
            // InternalPdfMk.g:1592:3: ( 'styles' )
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            // InternalPdfMk.g:1593:3: ( 'styles' )
            // InternalPdfMk.g:1594:4: 'styles'
            {
             before(grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPdfMk.g:1605:1: rule__Styles__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__Styles__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:1609:1: ( ( ( '{' ) ) )
            // InternalPdfMk.g:1610:2: ( ( '{' ) )
            {
            // InternalPdfMk.g:1610:2: ( ( '{' ) )
            // InternalPdfMk.g:1611:3: ( '{' )
            {
             before(grammarAccess.getStylesAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalPdfMk.g:1612:3: ( '{' )
            // InternalPdfMk.g:1613:4: '{'
            {
             before(grammarAccess.getStylesAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStylesAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getStylesAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000050010L});

}