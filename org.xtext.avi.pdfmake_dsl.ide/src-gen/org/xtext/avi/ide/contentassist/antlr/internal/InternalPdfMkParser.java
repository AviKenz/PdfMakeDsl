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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'avi'", "'content:[]'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

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
    // InternalPdfMk.g:62:1: ruleDocDefinition : ( ( rule__DocDefinition__RootsAssignment ) ) ;
    public final void ruleDocDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:66:2: ( ( ( rule__DocDefinition__RootsAssignment ) ) )
            // InternalPdfMk.g:67:2: ( ( rule__DocDefinition__RootsAssignment ) )
            {
            // InternalPdfMk.g:67:2: ( ( rule__DocDefinition__RootsAssignment ) )
            // InternalPdfMk.g:68:3: ( rule__DocDefinition__RootsAssignment )
            {
             before(grammarAccess.getDocDefinitionAccess().getRootsAssignment()); 
            // InternalPdfMk.g:69:3: ( rule__DocDefinition__RootsAssignment )
            // InternalPdfMk.g:69:4: rule__DocDefinition__RootsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DocDefinition__RootsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDocDefinitionAccess().getRootsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTextElement"
    // InternalPdfMk.g:78:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // InternalPdfMk.g:79:1: ( ruleTextElement EOF )
            // InternalPdfMk.g:80:1: ruleTextElement EOF
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
    // InternalPdfMk.g:87:1: ruleTextElement : ( RULE_STRING ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:91:2: ( ( RULE_STRING ) )
            // InternalPdfMk.g:92:2: ( RULE_STRING )
            {
            // InternalPdfMk.g:92:2: ( RULE_STRING )
            // InternalPdfMk.g:93:3: RULE_STRING
            {
             before(grammarAccess.getTextElementAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextElementAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleJsonElement"
    // InternalPdfMk.g:103:1: entryRuleJsonElement : ruleJsonElement EOF ;
    public final void entryRuleJsonElement() throws RecognitionException {
        try {
            // InternalPdfMk.g:104:1: ( ruleJsonElement EOF )
            // InternalPdfMk.g:105:1: ruleJsonElement EOF
            {
             before(grammarAccess.getJsonElementRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonElement();

            state._fsp--;

             after(grammarAccess.getJsonElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonElement"


    // $ANTLR start "ruleJsonElement"
    // InternalPdfMk.g:112:1: ruleJsonElement : ( 'avi' ) ;
    public final void ruleJsonElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:116:2: ( ( 'avi' ) )
            // InternalPdfMk.g:117:2: ( 'avi' )
            {
            // InternalPdfMk.g:117:2: ( 'avi' )
            // InternalPdfMk.g:118:3: 'avi'
            {
             before(grammarAccess.getJsonElementAccess().getAviKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getJsonElementAccess().getAviKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonElement"


    // $ANTLR start "entryRuleContent"
    // InternalPdfMk.g:128:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPdfMk.g:129:1: ( ruleContent EOF )
            // InternalPdfMk.g:130:1: ruleContent EOF
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
    // InternalPdfMk.g:137:1: ruleContent : ( 'content:[]' ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:141:2: ( ( 'content:[]' ) )
            // InternalPdfMk.g:142:2: ( 'content:[]' )
            {
            // InternalPdfMk.g:142:2: ( 'content:[]' )
            // InternalPdfMk.g:143:3: 'content:[]'
            {
             before(grammarAccess.getContentAccess().getContentKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getContentKeyword()); 

            }


            }

        }
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


    // $ANTLR start "rule__DocDefinition__RootsAssignment"
    // InternalPdfMk.g:152:1: rule__DocDefinition__RootsAssignment : ( ruleContent ) ;
    public final void rule__DocDefinition__RootsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPdfMk.g:156:1: ( ( ruleContent ) )
            // InternalPdfMk.g:157:2: ( ruleContent )
            {
            // InternalPdfMk.g:157:2: ( ruleContent )
            // InternalPdfMk.g:158:3: ruleContent
            {
             before(grammarAccess.getDocDefinitionAccess().getRootsContentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getDocDefinitionAccess().getRootsContentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocDefinition__RootsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}