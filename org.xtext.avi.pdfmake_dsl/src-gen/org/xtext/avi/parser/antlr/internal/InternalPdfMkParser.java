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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'dd'", "'='", "'{'", "','", "'}'", "'bold'", "':'", "'true'", "'false'", "'style'", "'text:'", "'['", "']'", "'alignment'", "'italics'", "'fontSize'", "'styles'", "'content'"
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


    // $ANTLR start "entryRuleStringObject"
    // InternalPdfMk.g:147:1: entryRuleStringObject returns [EObject current=null] : iv_ruleStringObject= ruleStringObject EOF ;
    public final EObject entryRuleStringObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringObject = null;


        try {
            // InternalPdfMk.g:147:53: (iv_ruleStringObject= ruleStringObject EOF )
            // InternalPdfMk.g:148:2: iv_ruleStringObject= ruleStringObject EOF
            {
             newCompositeNode(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringObject=ruleStringObject();

            state._fsp--;

             current =iv_ruleStringObject; 
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
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalPdfMk.g:154:1: ruleStringObject returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringObject() throws RecognitionException {
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

            				newLeafNode(lv_value_0_0, grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringObjectRule());
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
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRuleTypeFaceDefinition"
    // InternalPdfMk.g:182:1: entryRuleTypeFaceDefinition returns [EObject current=null] : iv_ruleTypeFaceDefinition= ruleTypeFaceDefinition EOF ;
    public final EObject entryRuleTypeFaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFaceDefinition = null;


        try {
            // InternalPdfMk.g:182:59: (iv_ruleTypeFaceDefinition= ruleTypeFaceDefinition EOF )
            // InternalPdfMk.g:183:2: iv_ruleTypeFaceDefinition= ruleTypeFaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeFaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeFaceDefinition=ruleTypeFaceDefinition();

            state._fsp--;

             current =iv_ruleTypeFaceDefinition; 
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
    // $ANTLR end "entryRuleTypeFaceDefinition"


    // $ANTLR start "ruleTypeFaceDefinition"
    // InternalPdfMk.g:189:1: ruleTypeFaceDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) ) ;
    public final EObject ruleTypeFaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:195:2: ( ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) ) )
            // InternalPdfMk.g:196:2: ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) )
            {
            // InternalPdfMk.g:196:2: ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) )
            // InternalPdfMk.g:197:3: ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) )
            {
            // InternalPdfMk.g:197:3: ( (lv_key_0_0= 'bold' ) )
            // InternalPdfMk.g:198:4: (lv_key_0_0= 'bold' )
            {
            // InternalPdfMk.g:198:4: (lv_key_0_0= 'bold' )
            // InternalPdfMk.g:199:5: lv_key_0_0= 'bold'
            {
            lv_key_0_0=(Token)match(input,17,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTypeFaceDefinitionAccess().getKeyBoldKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeFaceDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "bold");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeFaceDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:215:3: ( (lv_value_2_0= ruleBooleanDefinition ) )
            // InternalPdfMk.g:216:4: (lv_value_2_0= ruleBooleanDefinition )
            {
            // InternalPdfMk.g:216:4: (lv_value_2_0= ruleBooleanDefinition )
            // InternalPdfMk.g:217:5: lv_value_2_0= ruleBooleanDefinition
            {

            					newCompositeNode(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBooleanDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeFaceDefinitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.BooleanDefinition");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleTypeFaceDefinition"


    // $ANTLR start "entryRuleBooleanDefinition"
    // InternalPdfMk.g:238:1: entryRuleBooleanDefinition returns [String current=null] : iv_ruleBooleanDefinition= ruleBooleanDefinition EOF ;
    public final String entryRuleBooleanDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanDefinition = null;


        try {
            // InternalPdfMk.g:238:57: (iv_ruleBooleanDefinition= ruleBooleanDefinition EOF )
            // InternalPdfMk.g:239:2: iv_ruleBooleanDefinition= ruleBooleanDefinition EOF
            {
             newCompositeNode(grammarAccess.getBooleanDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanDefinition=ruleBooleanDefinition();

            state._fsp--;

             current =iv_ruleBooleanDefinition.getText(); 
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
    // $ANTLR end "entryRuleBooleanDefinition"


    // $ANTLR start "ruleBooleanDefinition"
    // InternalPdfMk.g:245:1: ruleBooleanDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPdfMk.g:251:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalPdfMk.g:252:2: (kw= 'true' | kw= 'false' )
            {
            // InternalPdfMk.g:252:2: (kw= 'true' | kw= 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPdfMk.g:253:3: kw= 'true'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanDefinitionAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:259:3: kw= 'false'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanDefinitionAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBooleanDefinition"


    // $ANTLR start "entryRuleTextStyleDefinition"
    // InternalPdfMk.g:268:1: entryRuleTextStyleDefinition returns [EObject current=null] : iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF ;
    public final EObject entryRuleTextStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextStyleDefinition = null;


        try {
            // InternalPdfMk.g:268:60: (iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF )
            // InternalPdfMk.g:269:2: iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextStyleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextStyleDefinition=ruleTextStyleDefinition();

            state._fsp--;

             current =iv_ruleTextStyleDefinition; 
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
    // $ANTLR end "entryRuleTextStyleDefinition"


    // $ANTLR start "ruleTextStyleDefinition"
    // InternalPdfMk.g:275:1: ruleTextStyleDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:281:2: ( ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:282:2: ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:282:2: ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:283:3: ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:283:3: ( (lv_key_0_0= 'style' ) )
            // InternalPdfMk.g:284:4: (lv_key_0_0= 'style' )
            {
            // InternalPdfMk.g:284:4: (lv_key_0_0= 'style' )
            // InternalPdfMk.g:285:5: lv_key_0_0= 'style'
            {
            lv_key_0_0=(Token)match(input,21,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextStyleDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "style");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTextStyleDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:301:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:302:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:302:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:303:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTextStyleDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextStyleDefinitionRule());
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
    // $ANTLR end "ruleTextStyleDefinition"


    // $ANTLR start "entryRuleTextDefinition"
    // InternalPdfMk.g:323:1: entryRuleTextDefinition returns [String current=null] : iv_ruleTextDefinition= ruleTextDefinition EOF ;
    public final String entryRuleTextDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextDefinition = null;


        try {
            // InternalPdfMk.g:323:54: (iv_ruleTextDefinition= ruleTextDefinition EOF )
            // InternalPdfMk.g:324:2: iv_ruleTextDefinition= ruleTextDefinition EOF
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
    // InternalPdfMk.g:330:1: ruleTextDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleTextDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalPdfMk.g:336:2: ( ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) ) )
            // InternalPdfMk.g:337:2: ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) )
            {
            // InternalPdfMk.g:337:2: ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPdfMk.g:338:3: (kw= 'text:' this_STRING_1= RULE_STRING )
                    {
                    // InternalPdfMk.g:338:3: (kw= 'text:' this_STRING_1= RULE_STRING )
                    // InternalPdfMk.g:339:4: kw= 'text:' this_STRING_1= RULE_STRING
                    {
                    kw=(Token)match(input,22,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTextDefinitionAccess().getTextKeyword_0_0());
                    			
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_1);
                    			

                    				newLeafNode(this_STRING_1, grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:353:3: (kw= '[' this_STRING_3= RULE_STRING kw= ']' )
                    {
                    // InternalPdfMk.g:353:3: (kw= '[' this_STRING_3= RULE_STRING kw= ']' )
                    // InternalPdfMk.g:354:4: kw= '[' this_STRING_3= RULE_STRING kw= ']'
                    {
                    kw=(Token)match(input,23,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTextDefinitionAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getTextDefinitionAccess().getSTRINGTerminalRuleCall_1_1());
                    			
                    kw=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTextAlignmentDefinition"
    // InternalPdfMk.g:376:1: entryRuleTextAlignmentDefinition returns [String current=null] : iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF ;
    public final String entryRuleTextAlignmentDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextAlignmentDefinition = null;


        try {
            // InternalPdfMk.g:376:63: (iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:377:2: iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextAlignmentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextAlignmentDefinition=ruleTextAlignmentDefinition();

            state._fsp--;

             current =iv_ruleTextAlignmentDefinition.getText(); 
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
    // InternalPdfMk.g:383:1: ruleTextAlignmentDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleTextAlignmentDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalPdfMk.g:389:2: ( (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING ) )
            // InternalPdfMk.g:390:2: (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING )
            {
            // InternalPdfMk.g:390:2: (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING )
            // InternalPdfMk.g:391:3: kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING
            {
            kw=(Token)match(input,25,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTextAlignmentDefinitionAccess().getAlignmentKeyword_0());
            		
            kw=(Token)match(input,18,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getTextAlignmentDefinitionAccess().getSTRINGTerminalRuleCall_2());
            		

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


    // $ANTLR start "entryRuleItalicsDefinition"
    // InternalPdfMk.g:412:1: entryRuleItalicsDefinition returns [EObject current=null] : iv_ruleItalicsDefinition= ruleItalicsDefinition EOF ;
    public final EObject entryRuleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicsDefinition = null;


        try {
            // InternalPdfMk.g:412:58: (iv_ruleItalicsDefinition= ruleItalicsDefinition EOF )
            // InternalPdfMk.g:413:2: iv_ruleItalicsDefinition= ruleItalicsDefinition EOF
            {
             newCompositeNode(grammarAccess.getItalicsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItalicsDefinition=ruleItalicsDefinition();

            state._fsp--;

             current =iv_ruleItalicsDefinition; 
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
    // $ANTLR end "entryRuleItalicsDefinition"


    // $ANTLR start "ruleItalicsDefinition"
    // InternalPdfMk.g:419:1: ruleItalicsDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) ) ;
    public final EObject ruleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:425:2: ( ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) ) )
            // InternalPdfMk.g:426:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) )
            {
            // InternalPdfMk.g:426:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) ) )
            // InternalPdfMk.g:427:3: ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanDefinition ) )
            {
            // InternalPdfMk.g:427:3: ( (lv_key_0_0= 'italics' ) )
            // InternalPdfMk.g:428:4: (lv_key_0_0= 'italics' )
            {
            // InternalPdfMk.g:428:4: (lv_key_0_0= 'italics' )
            // InternalPdfMk.g:429:5: lv_key_0_0= 'italics'
            {
            lv_key_0_0=(Token)match(input,26,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItalicsDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "italics");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getItalicsDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:445:3: ( (lv_value_2_0= ruleBooleanDefinition ) )
            // InternalPdfMk.g:446:4: (lv_value_2_0= ruleBooleanDefinition )
            {
            // InternalPdfMk.g:446:4: (lv_value_2_0= ruleBooleanDefinition )
            // InternalPdfMk.g:447:5: lv_value_2_0= ruleBooleanDefinition
            {

            					newCompositeNode(grammarAccess.getItalicsDefinitionAccess().getValueBooleanDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBooleanDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItalicsDefinitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.BooleanDefinition");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleItalicsDefinition"


    // $ANTLR start "entryRuleFontSizeDefinition"
    // InternalPdfMk.g:468:1: entryRuleFontSizeDefinition returns [EObject current=null] : iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF ;
    public final EObject entryRuleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSizeDefinition = null;


        try {
            // InternalPdfMk.g:468:59: (iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF )
            // InternalPdfMk.g:469:2: iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF
            {
             newCompositeNode(grammarAccess.getFontSizeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFontSizeDefinition=ruleFontSizeDefinition();

            state._fsp--;

             current =iv_ruleFontSizeDefinition; 
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
    // $ANTLR end "entryRuleFontSizeDefinition"


    // $ANTLR start "ruleFontSizeDefinition"
    // InternalPdfMk.g:475:1: ruleFontSizeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:481:2: ( ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:482:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:482:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:483:3: ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:483:3: ( (lv_key_0_0= 'fontSize' ) )
            // InternalPdfMk.g:484:4: (lv_key_0_0= 'fontSize' )
            {
            // InternalPdfMk.g:484:4: (lv_key_0_0= 'fontSize' )
            // InternalPdfMk.g:485:5: lv_key_0_0= 'fontSize'
            {
            lv_key_0_0=(Token)match(input,27,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFontSizeDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "fontSize");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFontSizeDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:501:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:502:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:502:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:503:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getFontSizeDefinitionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFontSizeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleFontSizeDefinition"


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:523:1: entryRuleTextObject returns [EObject current=null] : iv_ruleTextObject= ruleTextObject EOF ;
    public final EObject entryRuleTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObject = null;


        try {
            // InternalPdfMk.g:523:51: (iv_ruleTextObject= ruleTextObject EOF )
            // InternalPdfMk.g:524:2: iv_ruleTextObject= ruleTextObject EOF
            {
             newCompositeNode(grammarAccess.getTextObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextObject=ruleTextObject();

            state._fsp--;

             current =iv_ruleTextObject; 
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
    // $ANTLR end "entryRuleTextObject"


    // $ANTLR start "ruleTextObject"
    // InternalPdfMk.g:530:1: ruleTextObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleTextObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_style_3_0 = null;

        EObject lv_fontSize_5_0 = null;

        AntlrDatatypeRuleToken lv_alignment_7_0 = null;

        EObject lv_typeFace_9_0 = null;

        EObject lv_italics_11_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:536:2: ( ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? otherlv_12= '}' ) )
            // InternalPdfMk.g:537:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? otherlv_12= '}' )
            {
            // InternalPdfMk.g:537:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? otherlv_12= '}' )
            // InternalPdfMk.g:538:3: ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? otherlv_12= '}'
            {
            // InternalPdfMk.g:538:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:539:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:539:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:540:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_15); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:552:3: ( (lv_text_1_0= ruleTextDefinition ) )
            // InternalPdfMk.g:553:4: (lv_text_1_0= ruleTextDefinition )
            {
            // InternalPdfMk.g:553:4: (lv_text_1_0= ruleTextDefinition )
            // InternalPdfMk.g:554:5: lv_text_1_0= ruleTextDefinition
            {

            					newCompositeNode(grammarAccess.getTextObjectAccess().getTextTextDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_text_1_0=ruleTextDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextObjectRule());
            					}
            					set(
            						current,
            						"text",
            						true,
            						"org.xtext.avi.PdfMk.TextDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPdfMk.g:571:3: (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:572:4: otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextObjectAccess().getCommaKeyword_2_0());
                    			
                    // InternalPdfMk.g:576:4: ( (lv_style_3_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:577:5: (lv_style_3_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:577:5: (lv_style_3_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:578:6: lv_style_3_0= ruleTextStyleDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getStyleTextStyleDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_style_3_0=ruleTextStyleDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"style",
                    							true,
                    							"org.xtext.avi.PdfMk.TextStyleDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:596:3: (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==27) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:597:4: otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextObjectAccess().getCommaKeyword_3_0());
                    			
                    // InternalPdfMk.g:601:4: ( (lv_fontSize_5_0= ruleFontSizeDefinition ) )
                    // InternalPdfMk.g:602:5: (lv_fontSize_5_0= ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:602:5: (lv_fontSize_5_0= ruleFontSizeDefinition )
                    // InternalPdfMk.g:603:6: lv_fontSize_5_0= ruleFontSizeDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fontSize_5_0=ruleFontSizeDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"fontSize",
                    							true,
                    							"org.xtext.avi.PdfMk.FontSizeDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:621:3: (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==25) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:622:4: otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:626:4: ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    // InternalPdfMk.g:627:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:627:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:628:6: lv_alignment_7_0= ruleTextAlignmentDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_alignment_7_0=ruleTextAlignmentDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"alignment",
                    							true,
                    							"org.xtext.avi.PdfMk.TextAlignmentDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:646:3: (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:647:4: otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:651:4: ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) )
                    // InternalPdfMk.g:652:5: (lv_typeFace_9_0= ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:652:5: (lv_typeFace_9_0= ruleTypeFaceDefinition )
                    // InternalPdfMk.g:653:6: lv_typeFace_9_0= ruleTypeFaceDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_typeFace_9_0=ruleTypeFaceDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"typeFace",
                    							true,
                    							"org.xtext.avi.PdfMk.TypeFaceDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:671:3: (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:672:4: otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:676:4: ( (lv_italics_11_0= ruleItalicsDefinition ) )
                    // InternalPdfMk.g:677:5: (lv_italics_11_0= ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:677:5: (lv_italics_11_0= ruleItalicsDefinition )
                    // InternalPdfMk.g:678:6: lv_italics_11_0= ruleItalicsDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_italics_11_0=ruleItalicsDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"italics",
                    							true,
                    							"org.xtext.avi.PdfMk.ItalicsDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTextObject"


    // $ANTLR start "entryRuleStyleObject"
    // InternalPdfMk.g:704:1: entryRuleStyleObject returns [EObject current=null] : iv_ruleStyleObject= ruleStyleObject EOF ;
    public final EObject entryRuleStyleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObject = null;


        try {
            // InternalPdfMk.g:704:52: (iv_ruleStyleObject= ruleStyleObject EOF )
            // InternalPdfMk.g:705:2: iv_ruleStyleObject= ruleStyleObject EOF
            {
             newCompositeNode(grammarAccess.getStyleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleObject=ruleStyleObject();

            state._fsp--;

             current =iv_ruleStyleObject; 
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
    // $ANTLR end "entryRuleStyleObject"


    // $ANTLR start "ruleStyleObject"
    // InternalPdfMk.g:711:1: ruleStyleObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( (lv_fontSize_1_0= ruleFontSizeDefinition ) )? (otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) ) )? (otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) ) )? (otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleStyleObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_fontSize_1_0 = null;

        EObject lv_typeFace_3_0 = null;

        AntlrDatatypeRuleToken lv_alignment_5_0 = null;

        EObject lv_italics_7_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:717:2: ( ( ( (lv_value_0_0= '{' ) ) ( (lv_fontSize_1_0= ruleFontSizeDefinition ) )? (otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) ) )? (otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) ) )? (otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) ) )? otherlv_8= '}' ) )
            // InternalPdfMk.g:718:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_fontSize_1_0= ruleFontSizeDefinition ) )? (otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) ) )? (otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) ) )? (otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) ) )? otherlv_8= '}' )
            {
            // InternalPdfMk.g:718:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_fontSize_1_0= ruleFontSizeDefinition ) )? (otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) ) )? (otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) ) )? (otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) ) )? otherlv_8= '}' )
            // InternalPdfMk.g:719:3: ( (lv_value_0_0= '{' ) ) ( (lv_fontSize_1_0= ruleFontSizeDefinition ) )? (otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) ) )? (otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) ) )? (otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) ) )? otherlv_8= '}'
            {
            // InternalPdfMk.g:719:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:720:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:720:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:721:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_21); 

            					newLeafNode(lv_value_0_0, grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:733:3: ( (lv_fontSize_1_0= ruleFontSizeDefinition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:734:4: (lv_fontSize_1_0= ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:734:4: (lv_fontSize_1_0= ruleFontSizeDefinition )
                    // InternalPdfMk.g:735:5: lv_fontSize_1_0= ruleFontSizeDefinition
                    {

                    					newCompositeNode(grammarAccess.getStyleObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_fontSize_1_0=ruleFontSizeDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStyleObjectRule());
                    					}
                    					set(
                    						current,
                    						"fontSize",
                    						true,
                    						"org.xtext.avi.PdfMk.FontSizeDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:752:3: (otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==17) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:753:4: otherlv_2= ',' ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getStyleObjectAccess().getCommaKeyword_2_0());
                    			
                    // InternalPdfMk.g:757:4: ( (lv_typeFace_3_0= ruleTypeFaceDefinition ) )
                    // InternalPdfMk.g:758:5: (lv_typeFace_3_0= ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:758:5: (lv_typeFace_3_0= ruleTypeFaceDefinition )
                    // InternalPdfMk.g:759:6: lv_typeFace_3_0= ruleTypeFaceDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_typeFace_3_0=ruleTypeFaceDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStyleObjectRule());
                    						}
                    						set(
                    							current,
                    							"typeFace",
                    							true,
                    							"org.xtext.avi.PdfMk.TypeFaceDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:777:3: (otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==25) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:778:4: otherlv_4= ',' ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getStyleObjectAccess().getCommaKeyword_3_0());
                    			
                    // InternalPdfMk.g:782:4: ( (lv_alignment_5_0= ruleTextAlignmentDefinition ) )
                    // InternalPdfMk.g:783:5: (lv_alignment_5_0= ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:783:5: (lv_alignment_5_0= ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:784:6: lv_alignment_5_0= ruleTextAlignmentDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_alignment_5_0=ruleTextAlignmentDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStyleObjectRule());
                    						}
                    						set(
                    							current,
                    							"alignment",
                    							true,
                    							"org.xtext.avi.PdfMk.TextAlignmentDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:802:3: (otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:803:4: otherlv_6= ',' ( (lv_italics_7_0= ruleItalicsDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getStyleObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:807:4: ( (lv_italics_7_0= ruleItalicsDefinition ) )
                    // InternalPdfMk.g:808:5: (lv_italics_7_0= ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:808:5: (lv_italics_7_0= ruleItalicsDefinition )
                    // InternalPdfMk.g:809:6: lv_italics_7_0= ruleItalicsDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getItalicsItalicsDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_italics_7_0=ruleItalicsDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStyleObjectRule());
                    						}
                    						set(
                    							current,
                    							"italics",
                    							true,
                    							"org.xtext.avi.PdfMk.ItalicsDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStyleObject"


    // $ANTLR start "entryRuleStyleObjects"
    // InternalPdfMk.g:835:1: entryRuleStyleObjects returns [EObject current=null] : iv_ruleStyleObjects= ruleStyleObjects EOF ;
    public final EObject entryRuleStyleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjects = null;


        try {
            // InternalPdfMk.g:835:53: (iv_ruleStyleObjects= ruleStyleObjects EOF )
            // InternalPdfMk.g:836:2: iv_ruleStyleObjects= ruleStyleObjects EOF
            {
             newCompositeNode(grammarAccess.getStyleObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleObjects=ruleStyleObjects();

            state._fsp--;

             current =iv_ruleStyleObjects; 
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
    // $ANTLR end "entryRuleStyleObjects"


    // $ANTLR start "ruleStyleObjects"
    // InternalPdfMk.g:842:1: ruleStyleObjects returns [EObject current=null] : ( ( (lv_value_0_0= ruleStyleObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) ) )* ) ;
    public final EObject ruleStyleObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:848:2: ( ( ( (lv_value_0_0= ruleStyleObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) ) )* ) )
            // InternalPdfMk.g:849:2: ( ( (lv_value_0_0= ruleStyleObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) ) )* )
            {
            // InternalPdfMk.g:849:2: ( ( (lv_value_0_0= ruleStyleObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) ) )* )
            // InternalPdfMk.g:850:3: ( (lv_value_0_0= ruleStyleObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) ) )*
            {
            // InternalPdfMk.g:850:3: ( (lv_value_0_0= ruleStyleObject ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:851:4: (lv_value_0_0= ruleStyleObject )
                    {
                    // InternalPdfMk.g:851:4: (lv_value_0_0= ruleStyleObject )
                    // InternalPdfMk.g:852:5: lv_value_0_0= ruleStyleObject
                    {

                    					newCompositeNode(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_value_0_0=ruleStyleObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStyleObjectsRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.avi.PdfMk.StyleObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:869:3: (otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPdfMk.g:870:4: otherlv_1= ',' ( (lv_value_2_0= ruleStyleObject ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPdfMk.g:874:4: ( (lv_value_2_0= ruleStyleObject ) )
            	    // InternalPdfMk.g:875:5: (lv_value_2_0= ruleStyleObject )
            	    {
            	    // InternalPdfMk.g:875:5: (lv_value_2_0= ruleStyleObject )
            	    // InternalPdfMk.g:876:6: lv_value_2_0= ruleStyleObject
            	    {

            	    						newCompositeNode(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_value_2_0=ruleStyleObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStyleObjectsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_2_0,
            	    							"org.xtext.avi.PdfMk.StyleObject");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleStyleObjects"


    // $ANTLR start "entryRuleContentObject"
    // InternalPdfMk.g:898:1: entryRuleContentObject returns [EObject current=null] : iv_ruleContentObject= ruleContentObject EOF ;
    public final EObject entryRuleContentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObject = null;


        try {
            // InternalPdfMk.g:898:54: (iv_ruleContentObject= ruleContentObject EOF )
            // InternalPdfMk.g:899:2: iv_ruleContentObject= ruleContentObject EOF
            {
             newCompositeNode(grammarAccess.getContentObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentObject=ruleContentObject();

            state._fsp--;

             current =iv_ruleContentObject; 
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
    // $ANTLR end "entryRuleContentObject"


    // $ANTLR start "ruleContentObject"
    // InternalPdfMk.g:905:1: ruleContentObject returns [EObject current=null] : ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject ) ) ) ;
    public final EObject ruleContentObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:911:2: ( ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject ) ) ) )
            // InternalPdfMk.g:912:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject ) ) )
            {
            // InternalPdfMk.g:912:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject ) ) )
            // InternalPdfMk.g:913:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject ) )
            {
            // InternalPdfMk.g:913:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject ) )
            // InternalPdfMk.g:914:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject )
            {
            // InternalPdfMk.g:914:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==14) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPdfMk.g:915:5: lv_value_0_1= ruleStringObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectAccess().getValueStringObjectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=ruleStringObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.xtext.avi.PdfMk.StringObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:931:5: lv_value_0_2= ruleTextObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectAccess().getValueTextObjectParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleTextObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.xtext.avi.PdfMk.TextObject");
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
    // $ANTLR end "ruleContentObject"


    // $ANTLR start "entryRuleContentObjects"
    // InternalPdfMk.g:952:1: entryRuleContentObjects returns [EObject current=null] : iv_ruleContentObjects= ruleContentObjects EOF ;
    public final EObject entryRuleContentObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObjects = null;


        try {
            // InternalPdfMk.g:952:55: (iv_ruleContentObjects= ruleContentObjects EOF )
            // InternalPdfMk.g:953:2: iv_ruleContentObjects= ruleContentObjects EOF
            {
             newCompositeNode(grammarAccess.getContentObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentObjects=ruleContentObjects();

            state._fsp--;

             current =iv_ruleContentObjects; 
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
    // $ANTLR end "entryRuleContentObjects"


    // $ANTLR start "ruleContentObjects"
    // InternalPdfMk.g:959:1: ruleContentObjects returns [EObject current=null] : ( ( (lv_value_0_0= ruleContentObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) ) )* ) ;
    public final EObject ruleContentObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:965:2: ( ( ( (lv_value_0_0= ruleContentObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) ) )* ) )
            // InternalPdfMk.g:966:2: ( ( (lv_value_0_0= ruleContentObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) ) )* )
            {
            // InternalPdfMk.g:966:2: ( ( (lv_value_0_0= ruleContentObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) ) )* )
            // InternalPdfMk.g:967:3: ( (lv_value_0_0= ruleContentObject ) )? (otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) ) )*
            {
            // InternalPdfMk.g:967:3: ( (lv_value_0_0= ruleContentObject ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:968:4: (lv_value_0_0= ruleContentObject )
                    {
                    // InternalPdfMk.g:968:4: (lv_value_0_0= ruleContentObject )
                    // InternalPdfMk.g:969:5: lv_value_0_0= ruleContentObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_value_0_0=ruleContentObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectsRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.avi.PdfMk.ContentObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:986:3: (otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPdfMk.g:987:4: otherlv_1= ',' ( (lv_value_2_0= ruleContentObject ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getContentObjectsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPdfMk.g:991:4: ( (lv_value_2_0= ruleContentObject ) )
            	    // InternalPdfMk.g:992:5: (lv_value_2_0= ruleContentObject )
            	    {
            	    // InternalPdfMk.g:992:5: (lv_value_2_0= ruleContentObject )
            	    // InternalPdfMk.g:993:6: lv_value_2_0= ruleContentObject
            	    {

            	    						newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_value_2_0=ruleContentObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContentObjectsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_2_0,
            	    							"org.xtext.avi.PdfMk.ContentObject");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleContentObjects"


    // $ANTLR start "entryRuleStyles"
    // InternalPdfMk.g:1015:1: entryRuleStyles returns [EObject current=null] : iv_ruleStyles= ruleStyles EOF ;
    public final EObject entryRuleStyles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyles = null;


        try {
            // InternalPdfMk.g:1015:47: (iv_ruleStyles= ruleStyles EOF )
            // InternalPdfMk.g:1016:2: iv_ruleStyles= ruleStyles EOF
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
    // InternalPdfMk.g:1022:1: ruleStyles returns [EObject current=null] : ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) ;
    public final EObject ruleStyles() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1028:2: ( ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) )
            // InternalPdfMk.g:1029:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            {
            // InternalPdfMk.g:1029:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            // InternalPdfMk.g:1030:3: ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) )
            {
            // InternalPdfMk.g:1030:3: ( (lv_key_0_0= 'styles' ) )
            // InternalPdfMk.g:1031:4: (lv_key_0_0= 'styles' )
            {
            // InternalPdfMk.g:1031:4: (lv_key_0_0= 'styles' )
            // InternalPdfMk.g:1032:5: lv_key_0_0= 'styles'
            {
            lv_key_0_0=(Token)match(input,28,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStylesRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "styles");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getStylesAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1048:3: ( (lv_value_2_0= ruleStyleObjects ) )
            // InternalPdfMk.g:1049:4: (lv_value_2_0= ruleStyleObjects )
            {
            // InternalPdfMk.g:1049:4: (lv_value_2_0= ruleStyleObjects )
            // InternalPdfMk.g:1050:5: lv_value_2_0= ruleStyleObjects
            {

            					newCompositeNode(grammarAccess.getStylesAccess().getValueStyleObjectsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleStyleObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStylesRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.StyleObjects");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleStyles"


    // $ANTLR start "entryRuleContent"
    // InternalPdfMk.g:1071:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPdfMk.g:1071:48: (iv_ruleContent= ruleContent EOF )
            // InternalPdfMk.g:1072:2: iv_ruleContent= ruleContent EOF
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
    // InternalPdfMk.g:1078:1: ruleContent returns [EObject current=null] : ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_value_3_0= ruleContentObjects ) ) otherlv_4= ']' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1084:2: ( ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_value_3_0= ruleContentObjects ) ) otherlv_4= ']' ) )
            // InternalPdfMk.g:1085:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_value_3_0= ruleContentObjects ) ) otherlv_4= ']' )
            {
            // InternalPdfMk.g:1085:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_value_3_0= ruleContentObjects ) ) otherlv_4= ']' )
            // InternalPdfMk.g:1086:3: ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_value_3_0= ruleContentObjects ) ) otherlv_4= ']'
            {
            // InternalPdfMk.g:1086:3: ( (lv_key_0_0= 'content' ) )
            // InternalPdfMk.g:1087:4: (lv_key_0_0= 'content' )
            {
            // InternalPdfMk.g:1087:4: (lv_key_0_0= 'content' )
            // InternalPdfMk.g:1088:5: lv_key_0_0= 'content'
            {
            lv_key_0_0=(Token)match(input,29,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getContentAccess().getKeyContentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "content");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getContentAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPdfMk.g:1108:3: ( (lv_value_3_0= ruleContentObjects ) )
            // InternalPdfMk.g:1109:4: (lv_value_3_0= ruleContentObjects )
            {
            // InternalPdfMk.g:1109:4: (lv_value_3_0= ruleContentObjects )
            // InternalPdfMk.g:1110:5: lv_value_3_0= ruleContentObjects
            {

            					newCompositeNode(grammarAccess.getContentAccess().getValueContentObjectsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=ruleContentObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.avi.PdfMk.ContentObjects");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContentAccess().getRightSquareBracketKeyword_4());
            		

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008018000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000100C010L});

}