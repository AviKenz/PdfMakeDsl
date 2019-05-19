package org.xtext.avi.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.avi.services.PdfMkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPdfMkParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'dd'", "'='", "'{'", "','", "'}'", "'text:'", "'['", "']'", "'style:'", "'alignment'", "':'", "'true'", "'false'", "'styles'", "'content:['"
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

        public InternalPdfMkParser(TokenStream input, PdfMkGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DocDefinition";
       	}

       	@Override
       	protected PdfMkGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocDefinition"
    // InternalPdfMk.g:64:1: entryRuleDocDefinition returns [EObject current=null] : iv_ruleDocDefinition= ruleDocDefinition EOF ;
    public final EObject entryRuleDocDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocDefinition = null;


        try {
            // InternalPdfMk.g:64:54: (iv_ruleDocDefinition= ruleDocDefinition EOF )
            // InternalPdfMk.g:65:2: iv_ruleDocDefinition= ruleDocDefinition EOF
            {
             newCompositeNode(grammarAccess.getDocDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocDefinition=ruleDocDefinition();

            state._fsp--;

             current =iv_ruleDocDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocDefinition"


    // $ANTLR start "ruleDocDefinition"
    // InternalPdfMk.g:71:1: ruleDocDefinition returns [EObject current=null] : (otherlv_0= 'var' otherlv_1= 'dd' otherlv_2= '=' otherlv_3= '{' ( (lv_content_4_0= ruleContent ) ) (otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDocDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_content_4_0 = null;

        EObject lv_styles_6_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:77:2: ( (otherlv_0= 'var' otherlv_1= 'dd' otherlv_2= '=' otherlv_3= '{' ( (lv_content_4_0= ruleContent ) ) (otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) ) )? otherlv_7= '}' ) )
            // InternalPdfMk.g:78:2: (otherlv_0= 'var' otherlv_1= 'dd' otherlv_2= '=' otherlv_3= '{' ( (lv_content_4_0= ruleContent ) ) (otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) ) )? otherlv_7= '}' )
            {
            // InternalPdfMk.g:78:2: (otherlv_0= 'var' otherlv_1= 'dd' otherlv_2= '=' otherlv_3= '{' ( (lv_content_4_0= ruleContent ) ) (otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) ) )? otherlv_7= '}' )
            // InternalPdfMk.g:79:3: otherlv_0= 'var' otherlv_1= 'dd' otherlv_2= '=' otherlv_3= '{' ( (lv_content_4_0= ruleContent ) ) (otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDocDefinitionAccess().getVarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDocDefinitionAccess().getDdKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDocDefinitionAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDocDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPdfMk.g:95:3: ( (lv_content_4_0= ruleContent ) )
            // InternalPdfMk.g:96:4: (lv_content_4_0= ruleContent )
            {
            // InternalPdfMk.g:96:4: (lv_content_4_0= ruleContent )
            // InternalPdfMk.g:97:5: lv_content_4_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getDocDefinitionAccess().getContentContentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_4_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocDefinitionRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_4_0,
            						"org.xtext.avi.PdfMk.Content");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPdfMk.g:114:3: (otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPdfMk.g:115:4: otherlv_5= ',' ( (lv_styles_6_0= ruleStyles ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDocDefinitionAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:119:4: ( (lv_styles_6_0= ruleStyles ) )
                    // InternalPdfMk.g:120:5: (lv_styles_6_0= ruleStyles )
                    {
                    // InternalPdfMk.g:120:5: (lv_styles_6_0= ruleStyles )
                    // InternalPdfMk.g:121:6: lv_styles_6_0= ruleStyles
                    {

                    						newCompositeNode(grammarAccess.getDocDefinitionAccess().getStylesStylesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_styles_6_0=ruleStyles();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"styles",
                    							lv_styles_6_0,
                    							"org.xtext.avi.PdfMk.Styles");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDocDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocDefinition"


    // $ANTLR start "entryRuleStringElement"
    // InternalPdfMk.g:147:1: entryRuleStringElement returns [EObject current=null] : iv_ruleStringElement= ruleStringElement EOF ;
    public final EObject entryRuleStringElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElement = null;


        try {
            // InternalPdfMk.g:147:54: (iv_ruleStringElement= ruleStringElement EOF )
            // InternalPdfMk.g:148:2: iv_ruleStringElement= ruleStringElement EOF
            {
             newCompositeNode(grammarAccess.getStringElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringElement=ruleStringElement();

            state._fsp--;

             current =iv_ruleStringElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // InternalPdfMk.g:154:1: ruleStringElement returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:160:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalPdfMk.g:161:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:161:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalPdfMk.g:162:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalPdfMk.g:162:3: (lv_value_0_0= RULE_STRING )
            // InternalPdfMk.g:163:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleTextDefinition"
    // InternalPdfMk.g:182:1: entryRuleTextDefinition returns [String current=null] : iv_ruleTextDefinition= ruleTextDefinition EOF ;
    public final String entryRuleTextDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextDefinition = null;


        try {
            // InternalPdfMk.g:182:54: (iv_ruleTextDefinition= ruleTextDefinition EOF )
            // InternalPdfMk.g:183:2: iv_ruleTextDefinition= ruleTextDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextDefinition=ruleTextDefinition();

            state._fsp--;

             current =iv_ruleTextDefinition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextDefinition"


    // $ANTLR start "ruleTextDefinition"
    // InternalPdfMk.g:189:1: ruleTextDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleTextDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalPdfMk.g:195:2: ( ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) ) )
            // InternalPdfMk.g:196:2: ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) )
            {
            // InternalPdfMk.g:196:2: ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:197:3: (kw= 'text:' this_STRING_1= RULE_STRING )
                    {
                    // InternalPdfMk.g:197:3: (kw= 'text:' this_STRING_1= RULE_STRING )
                    // InternalPdfMk.g:198:4: kw= 'text:' this_STRING_1= RULE_STRING
                    {
                    kw=(Token)match(input,17,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTextDefinitionAccess().getTextKeyword_0_0());
                    			
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_1);
                    			

                    				newLeafNode(this_STRING_1, grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:212:3: (kw= '[' this_STRING_3= RULE_STRING kw= ']' )
                    {
                    // InternalPdfMk.g:212:3: (kw= '[' this_STRING_3= RULE_STRING kw= ']' )
                    // InternalPdfMk.g:213:4: kw= '[' this_STRING_3= RULE_STRING kw= ']'
                    {
                    kw=(Token)match(input,18,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTextDefinitionAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_1_1());
                    			
                    kw=(Token)match(input,19,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTextDefinitionAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextDefinition"


    // $ANTLR start "entryRuleStyleDefinition"
    // InternalPdfMk.g:235:1: entryRuleStyleDefinition returns [String current=null] : iv_ruleStyleDefinition= ruleStyleDefinition EOF ;
    public final String entryRuleStyleDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStyleDefinition = null;


        try {
            // InternalPdfMk.g:235:55: (iv_ruleStyleDefinition= ruleStyleDefinition EOF )
            // InternalPdfMk.g:236:2: iv_ruleStyleDefinition= ruleStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getStyleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleDefinition=ruleStyleDefinition();

            state._fsp--;

             current =iv_ruleStyleDefinition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyleDefinition"


    // $ANTLR start "ruleStyleDefinition"
    // InternalPdfMk.g:242:1: ruleStyleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'style:' this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleStyleDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalPdfMk.g:248:2: ( (kw= 'style:' this_STRING_1= RULE_STRING ) )
            // InternalPdfMk.g:249:2: (kw= 'style:' this_STRING_1= RULE_STRING )
            {
            // InternalPdfMk.g:249:2: (kw= 'style:' this_STRING_1= RULE_STRING )
            // InternalPdfMk.g:250:3: kw= 'style:' this_STRING_1= RULE_STRING
            {
            kw=(Token)match(input,20,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStyleDefinitionAccess().getStyleKeyword_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getStyleDefinitionAccess().getSTRINGTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyleDefinition"


    // $ANTLR start "entryRuleTextAlignmentDefinition"
    // InternalPdfMk.g:266:1: entryRuleTextAlignmentDefinition returns [EObject current=null] : iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF ;
    public final EObject entryRuleTextAlignmentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlignmentDefinition = null;


        try {
            // InternalPdfMk.g:266:64: (iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:267:2: iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextAlignmentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextAlignmentDefinition=ruleTextAlignmentDefinition();

            state._fsp--;

             current =iv_ruleTextAlignmentDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextAlignmentDefinition"


    // $ANTLR start "ruleTextAlignmentDefinition"
    // InternalPdfMk.g:273:1: ruleTextAlignmentDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextAlignmentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:279:2: ( ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:280:2: ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:280:2: ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:281:3: ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:281:3: ( (lv_key_0_0= 'alignment' ) )
            // InternalPdfMk.g:282:4: (lv_key_0_0= 'alignment' )
            {
            // InternalPdfMk.g:282:4: (lv_key_0_0= 'alignment' )
            // InternalPdfMk.g:283:5: lv_key_0_0= 'alignment'
            {
            lv_key_0_0=(Token)match(input,21,FOLLOW_12); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAlignmentDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "alignment");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:299:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:300:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:300:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:301:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTextAlignmentDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAlignmentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextAlignmentDefinition"


    // $ANTLR start "entryRuleBoolean"
    // InternalPdfMk.g:321:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalPdfMk.g:321:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalPdfMk.g:322:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalPdfMk.g:328:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPdfMk.g:334:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalPdfMk.g:335:2: (kw= 'true' | kw= 'false' )
            {
            // InternalPdfMk.g:335:2: (kw= 'true' | kw= 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPdfMk.g:336:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:342:3: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleTextElement"
    // InternalPdfMk.g:351:1: entryRuleTextElement returns [EObject current=null] : iv_ruleTextElement= ruleTextElement EOF ;
    public final EObject entryRuleTextElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextElement = null;


        try {
            // InternalPdfMk.g:351:52: (iv_ruleTextElement= ruleTextElement EOF )
            // InternalPdfMk.g:352:2: iv_ruleTextElement= ruleTextElement EOF
            {
             newCompositeNode(grammarAccess.getTextElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextElement=ruleTextElement();

            state._fsp--;

             current =iv_ruleTextElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // InternalPdfMk.g:358:1: ruleTextElement returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ruleTextDefinition (otherlv_2= ',' ruleStyleDefinition )? (otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition )? otherlv_6= '}' ) ;
    public final EObject ruleTextElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_TextAlignmentDefinition_5 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:364:2: ( ( ( (lv_value_0_0= '{' ) ) ruleTextDefinition (otherlv_2= ',' ruleStyleDefinition )? (otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition )? otherlv_6= '}' ) )
            // InternalPdfMk.g:365:2: ( ( (lv_value_0_0= '{' ) ) ruleTextDefinition (otherlv_2= ',' ruleStyleDefinition )? (otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition )? otherlv_6= '}' )
            {
            // InternalPdfMk.g:365:2: ( ( (lv_value_0_0= '{' ) ) ruleTextDefinition (otherlv_2= ',' ruleStyleDefinition )? (otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition )? otherlv_6= '}' )
            // InternalPdfMk.g:366:3: ( (lv_value_0_0= '{' ) ) ruleTextDefinition (otherlv_2= ',' ruleStyleDefinition )? (otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition )? otherlv_6= '}'
            {
            // InternalPdfMk.g:366:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:367:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:367:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:368:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_13); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTextElementAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextElementRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }


            			newCompositeNode(grammarAccess.getTextElementAccess().getTextDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_7);
            ruleTextDefinition();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalPdfMk.g:387:3: (otherlv_2= ',' ruleStyleDefinition )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==20) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:388:4: otherlv_2= ',' ruleStyleDefinition
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextElementAccess().getCommaKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getTextElementAccess().getStyleDefinitionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_7);
                    ruleStyleDefinition();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalPdfMk.g:400:3: (otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:401:4: otherlv_4= ',' this_TextAlignmentDefinition_5= ruleTextAlignmentDefinition
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextElementAccess().getCommaKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getTextElementAccess().getTextAlignmentDefinitionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_TextAlignmentDefinition_5=ruleTextAlignmentDefinition();

                    state._fsp--;


                    				current = this_TextAlignmentDefinition_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTextElementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleElement"
    // InternalPdfMk.g:422:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalPdfMk.g:422:48: (iv_ruleElement= ruleElement EOF )
            // InternalPdfMk.g:423:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalPdfMk.g:429:1: ruleElement returns [EObject current=null] : ( ( (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:435:2: ( ( ( (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement ) ) ) )
            // InternalPdfMk.g:436:2: ( ( (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement ) ) )
            {
            // InternalPdfMk.g:436:2: ( ( (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement ) ) )
            // InternalPdfMk.g:437:3: ( (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement ) )
            {
            // InternalPdfMk.g:437:3: ( (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement ) )
            // InternalPdfMk.g:438:4: (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement )
            {
            // InternalPdfMk.g:438:4: (lv_value_0_1= ruleStringElement | lv_value_0_2= ruleTextElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
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
                    // InternalPdfMk.g:439:5: lv_value_0_1= ruleStringElement
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getValueStringElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=ruleStringElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.xtext.avi.PdfMk.StringElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:455:5: lv_value_0_2= ruleTextElement
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getValueTextElementParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleTextElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.xtext.avi.PdfMk.TextElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleElements"
    // InternalPdfMk.g:476:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // InternalPdfMk.g:476:49: (iv_ruleElements= ruleElements EOF )
            // InternalPdfMk.g:477:2: iv_ruleElements= ruleElements EOF
            {
             newCompositeNode(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElements=ruleElements();

            state._fsp--;

             current =iv_ruleElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalPdfMk.g:483:1: ruleElements returns [EObject current=null] : ( ( (lv_value_0_0= ruleElement ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleElement ) ) )* ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:489:2: ( ( ( (lv_value_0_0= ruleElement ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleElement ) ) )* ) )
            // InternalPdfMk.g:490:2: ( ( (lv_value_0_0= ruleElement ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleElement ) ) )* )
            {
            // InternalPdfMk.g:490:2: ( ( (lv_value_0_0= ruleElement ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleElement ) ) )* )
            // InternalPdfMk.g:491:3: ( (lv_value_0_0= ruleElement ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleElement ) ) )*
            {
            // InternalPdfMk.g:491:3: ( (lv_value_0_0= ruleElement ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:492:4: (lv_value_0_0= ruleElement )
                    {
                    // InternalPdfMk.g:492:4: (lv_value_0_0= ruleElement )
                    // InternalPdfMk.g:493:5: lv_value_0_0= ruleElement
                    {

                    					newCompositeNode(grammarAccess.getElementsAccess().getValueElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_value_0_0=ruleElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementsRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.avi.PdfMk.Element");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:510:3: (otherlv_1= ',' ( (lv_value_2_0= ruleElement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPdfMk.g:511:4: otherlv_1= ',' ( (lv_value_2_0= ruleElement ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getElementsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPdfMk.g:515:4: ( (lv_value_2_0= ruleElement ) )
            	    // InternalPdfMk.g:516:5: (lv_value_2_0= ruleElement )
            	    {
            	    // InternalPdfMk.g:516:5: (lv_value_2_0= ruleElement )
            	    // InternalPdfMk.g:517:6: lv_value_2_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getElementsAccess().getValueElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_value_2_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_2_0,
            	    							"org.xtext.avi.PdfMk.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleStyles"
    // InternalPdfMk.g:539:1: entryRuleStyles returns [EObject current=null] : iv_ruleStyles= ruleStyles EOF ;
    public final EObject entryRuleStyles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyles = null;


        try {
            // InternalPdfMk.g:539:47: (iv_ruleStyles= ruleStyles EOF )
            // InternalPdfMk.g:540:2: iv_ruleStyles= ruleStyles EOF
            {
             newCompositeNode(grammarAccess.getStylesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyles=ruleStyles();

            state._fsp--;

             current =iv_ruleStyles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyles"


    // $ANTLR start "ruleStyles"
    // InternalPdfMk.g:546:1: ruleStyles returns [EObject current=null] : ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) otherlv_3= '}' ) ;
    public final EObject ruleStyles() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPdfMk.g:552:2: ( ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) otherlv_3= '}' ) )
            // InternalPdfMk.g:553:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) otherlv_3= '}' )
            {
            // InternalPdfMk.g:553:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) otherlv_3= '}' )
            // InternalPdfMk.g:554:3: ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) otherlv_3= '}'
            {
            // InternalPdfMk.g:554:3: ( (lv_key_0_0= 'styles' ) )
            // InternalPdfMk.g:555:4: (lv_key_0_0= 'styles' )
            {
            // InternalPdfMk.g:555:4: (lv_key_0_0= 'styles' )
            // InternalPdfMk.g:556:5: lv_key_0_0= 'styles'
            {
            lv_key_0_0=(Token)match(input,25,FOLLOW_12); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStylesRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "styles");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStylesAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:572:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:573:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:573:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:574:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_9); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStylesAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStylesRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStylesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyles"


    // $ANTLR start "entryRuleContent"
    // InternalPdfMk.g:594:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPdfMk.g:594:48: (iv_ruleContent= ruleContent EOF )
            // InternalPdfMk.g:595:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalPdfMk.g:601:1: ruleContent returns [EObject current=null] : (otherlv_0= 'content:[' this_Elements_1= ruleElements otherlv_2= ']' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Elements_1 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:607:2: ( (otherlv_0= 'content:[' this_Elements_1= ruleElements otherlv_2= ']' ) )
            // InternalPdfMk.g:608:2: (otherlv_0= 'content:[' this_Elements_1= ruleElements otherlv_2= ']' )
            {
            // InternalPdfMk.g:608:2: (otherlv_0= 'content:[' this_Elements_1= ruleElements otherlv_2= ']' )
            // InternalPdfMk.g:609:3: otherlv_0= 'content:[' this_Elements_1= ruleElements otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getContentAccess().getContentKeyword_0());
            		

            			newCompositeNode(grammarAccess.getContentAccess().getElementsParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_Elements_1=ruleElements();

            state._fsp--;


            			current = this_Elements_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getContentAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000008C010L});

}