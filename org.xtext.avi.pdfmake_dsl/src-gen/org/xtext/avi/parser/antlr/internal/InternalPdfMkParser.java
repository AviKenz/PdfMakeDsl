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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'dd'", "'='", "'{'", "','", "'}'", "'bold'", "':'", "'true'", "'false'", "'style'", "'text:'", "'['", "']'", "'alignment'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'styles'", "'content'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalPdfMk.g:189:1: ruleTypeFaceDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleTypeFaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:195:2: ( ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:196:2: ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:196:2: ( ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:197:3: ( (lv_key_0_0= 'bold' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
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
            		
            // InternalPdfMk.g:215:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:216:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:216:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:217:5: lv_value_2_0= ruleBooleanType
            {

            					newCompositeNode(grammarAccess.getTypeFaceDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBooleanType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeFaceDefinitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.BooleanType");
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


    // $ANTLR start "entryRuleBooleanType"
    // InternalPdfMk.g:238:1: entryRuleBooleanType returns [String current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final String entryRuleBooleanType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanType = null;


        try {
            // InternalPdfMk.g:238:51: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalPdfMk.g:239:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType.getText(); 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalPdfMk.g:245:1: ruleBooleanType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanType() throws RecognitionException {
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
                    			newLeafNode(kw, grammarAccess.getBooleanTypeAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:259:3: kw= 'false'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanTypeAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleColumnTextWidthType"
    // InternalPdfMk.g:268:1: entryRuleColumnTextWidthType returns [String current=null] : iv_ruleColumnTextWidthType= ruleColumnTextWidthType EOF ;
    public final String entryRuleColumnTextWidthType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColumnTextWidthType = null;


        try {
            // InternalPdfMk.g:268:59: (iv_ruleColumnTextWidthType= ruleColumnTextWidthType EOF )
            // InternalPdfMk.g:269:2: iv_ruleColumnTextWidthType= ruleColumnTextWidthType EOF
            {
             newCompositeNode(grammarAccess.getColumnTextWidthTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnTextWidthType=ruleColumnTextWidthType();

            state._fsp--;

             current =iv_ruleColumnTextWidthType.getText(); 
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
    // $ANTLR end "entryRuleColumnTextWidthType"


    // $ANTLR start "ruleColumnTextWidthType"
    // InternalPdfMk.g:275:1: ruleColumnTextWidthType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleColumnTextWidthType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:281:2: (this_INT_0= RULE_INT )
            // InternalPdfMk.g:282:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getColumnTextWidthTypeAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleColumnTextWidthType"


    // $ANTLR start "entryRuleTextStyleDefinition"
    // InternalPdfMk.g:292:1: entryRuleTextStyleDefinition returns [EObject current=null] : iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF ;
    public final EObject entryRuleTextStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextStyleDefinition = null;


        try {
            // InternalPdfMk.g:292:60: (iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF )
            // InternalPdfMk.g:293:2: iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF
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
    // InternalPdfMk.g:299:1: ruleTextStyleDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:305:2: ( ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:306:2: ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:306:2: ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:307:3: ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:307:3: ( (lv_key_0_0= 'style' ) )
            // InternalPdfMk.g:308:4: (lv_key_0_0= 'style' )
            {
            // InternalPdfMk.g:308:4: (lv_key_0_0= 'style' )
            // InternalPdfMk.g:309:5: lv_key_0_0= 'style'
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
            		
            // InternalPdfMk.g:325:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:326:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:326:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:327:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:347:1: entryRuleTextDefinition returns [String current=null] : iv_ruleTextDefinition= ruleTextDefinition EOF ;
    public final String entryRuleTextDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextDefinition = null;


        try {
            // InternalPdfMk.g:347:54: (iv_ruleTextDefinition= ruleTextDefinition EOF )
            // InternalPdfMk.g:348:2: iv_ruleTextDefinition= ruleTextDefinition EOF
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
    // InternalPdfMk.g:354:1: ruleTextDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleTextDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalPdfMk.g:360:2: ( ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) ) )
            // InternalPdfMk.g:361:2: ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) )
            {
            // InternalPdfMk.g:361:2: ( (kw= 'text:' this_STRING_1= RULE_STRING ) | (kw= '[' this_STRING_3= RULE_STRING kw= ']' ) )
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
                    // InternalPdfMk.g:362:3: (kw= 'text:' this_STRING_1= RULE_STRING )
                    {
                    // InternalPdfMk.g:362:3: (kw= 'text:' this_STRING_1= RULE_STRING )
                    // InternalPdfMk.g:363:4: kw= 'text:' this_STRING_1= RULE_STRING
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
                    // InternalPdfMk.g:377:3: (kw= '[' this_STRING_3= RULE_STRING kw= ']' )
                    {
                    // InternalPdfMk.g:377:3: (kw= '[' this_STRING_3= RULE_STRING kw= ']' )
                    // InternalPdfMk.g:378:4: kw= '[' this_STRING_3= RULE_STRING kw= ']'
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
    // InternalPdfMk.g:400:1: entryRuleTextAlignmentDefinition returns [String current=null] : iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF ;
    public final String entryRuleTextAlignmentDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextAlignmentDefinition = null;


        try {
            // InternalPdfMk.g:400:63: (iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:401:2: iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF
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
    // InternalPdfMk.g:407:1: ruleTextAlignmentDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleTextAlignmentDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalPdfMk.g:413:2: ( (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING ) )
            // InternalPdfMk.g:414:2: (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING )
            {
            // InternalPdfMk.g:414:2: (kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING )
            // InternalPdfMk.g:415:3: kw= 'alignment' kw= ':' this_STRING_2= RULE_STRING
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
    // InternalPdfMk.g:436:1: entryRuleItalicsDefinition returns [EObject current=null] : iv_ruleItalicsDefinition= ruleItalicsDefinition EOF ;
    public final EObject entryRuleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicsDefinition = null;


        try {
            // InternalPdfMk.g:436:58: (iv_ruleItalicsDefinition= ruleItalicsDefinition EOF )
            // InternalPdfMk.g:437:2: iv_ruleItalicsDefinition= ruleItalicsDefinition EOF
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
    // InternalPdfMk.g:443:1: ruleItalicsDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:449:2: ( ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:450:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:450:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:451:3: ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
            {
            // InternalPdfMk.g:451:3: ( (lv_key_0_0= 'italics' ) )
            // InternalPdfMk.g:452:4: (lv_key_0_0= 'italics' )
            {
            // InternalPdfMk.g:452:4: (lv_key_0_0= 'italics' )
            // InternalPdfMk.g:453:5: lv_key_0_0= 'italics'
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
            		
            // InternalPdfMk.g:469:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:470:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:470:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:471:5: lv_value_2_0= ruleBooleanType
            {

            					newCompositeNode(grammarAccess.getItalicsDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBooleanType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItalicsDefinitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.BooleanType");
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
    // InternalPdfMk.g:492:1: entryRuleFontSizeDefinition returns [EObject current=null] : iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF ;
    public final EObject entryRuleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSizeDefinition = null;


        try {
            // InternalPdfMk.g:492:59: (iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF )
            // InternalPdfMk.g:493:2: iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF
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
    // InternalPdfMk.g:499:1: ruleFontSizeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:505:2: ( ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:506:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:506:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:507:3: ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:507:3: ( (lv_key_0_0= 'fontSize' ) )
            // InternalPdfMk.g:508:4: (lv_key_0_0= 'fontSize' )
            {
            // InternalPdfMk.g:508:4: (lv_key_0_0= 'fontSize' )
            // InternalPdfMk.g:509:5: lv_key_0_0= 'fontSize'
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
            		
            // InternalPdfMk.g:525:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:526:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:526:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:527:5: lv_value_2_0= RULE_INT
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


    // $ANTLR start "entryRuleWidthDefinition"
    // InternalPdfMk.g:547:1: entryRuleWidthDefinition returns [EObject current=null] : iv_ruleWidthDefinition= ruleWidthDefinition EOF ;
    public final EObject entryRuleWidthDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidthDefinition = null;


        try {
            // InternalPdfMk.g:547:56: (iv_ruleWidthDefinition= ruleWidthDefinition EOF )
            // InternalPdfMk.g:548:2: iv_ruleWidthDefinition= ruleWidthDefinition EOF
            {
             newCompositeNode(grammarAccess.getWidthDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidthDefinition=ruleWidthDefinition();

            state._fsp--;

             current =iv_ruleWidthDefinition; 
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
    // $ANTLR end "entryRuleWidthDefinition"


    // $ANTLR start "ruleWidthDefinition"
    // InternalPdfMk.g:554:1: ruleWidthDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) ) ;
    public final EObject ruleWidthDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:560:2: ( ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) ) )
            // InternalPdfMk.g:561:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) )
            {
            // InternalPdfMk.g:561:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) )
            // InternalPdfMk.g:562:3: ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) )
            {
            // InternalPdfMk.g:562:3: ( (lv_key_0_0= 'width' ) )
            // InternalPdfMk.g:563:4: (lv_key_0_0= 'width' )
            {
            // InternalPdfMk.g:563:4: (lv_key_0_0= 'width' )
            // InternalPdfMk.g:564:5: lv_key_0_0= 'width'
            {
            lv_key_0_0=(Token)match(input,28,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidthDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "width");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getWidthDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:580:3: ( (lv_value_2_0= ruleColumnTextWidthType ) )
            // InternalPdfMk.g:581:4: (lv_value_2_0= ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:581:4: (lv_value_2_0= ruleColumnTextWidthType )
            // InternalPdfMk.g:582:5: lv_value_2_0= ruleColumnTextWidthType
            {

            					newCompositeNode(grammarAccess.getWidthDefinitionAccess().getValueColumnTextWidthTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleColumnTextWidthType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidthDefinitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.ColumnTextWidthType");
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
    // $ANTLR end "ruleWidthDefinition"


    // $ANTLR start "entryRuleColumnDefinition"
    // InternalPdfMk.g:603:1: entryRuleColumnDefinition returns [EObject current=null] : iv_ruleColumnDefinition= ruleColumnDefinition EOF ;
    public final EObject entryRuleColumnDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDefinition = null;


        try {
            // InternalPdfMk.g:603:57: (iv_ruleColumnDefinition= ruleColumnDefinition EOF )
            // InternalPdfMk.g:604:2: iv_ruleColumnDefinition= ruleColumnDefinition EOF
            {
             newCompositeNode(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnDefinition=ruleColumnDefinition();

            state._fsp--;

             current =iv_ruleColumnDefinition; 
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
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // InternalPdfMk.g:610:1: ruleColumnDefinition returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' ) ;
    public final EObject ruleColumnDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_key_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_globalStyle_1_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:616:2: ( (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' ) )
            // InternalPdfMk.g:617:2: (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' )
            {
            // InternalPdfMk.g:617:2: (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' )
            // InternalPdfMk.g:618:3: otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnDefinitionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:622:3: ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:623:4: ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ','
                    {
                    // InternalPdfMk.g:623:4: ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:624:5: (lv_globalStyle_1_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:624:5: (lv_globalStyle_1_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:625:6: lv_globalStyle_1_0= ruleTextStyleDefinition
                    {

                    						newCompositeNode(grammarAccess.getColumnDefinitionAccess().getGlobalStyleTextStyleDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_globalStyle_1_0=ruleTextStyleDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"globalStyle",
                    							true,
                    							"org.xtext.avi.PdfMk.TextStyleDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnDefinitionAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPdfMk.g:647:3: ( (lv_key_3_0= 'columns' ) )
            // InternalPdfMk.g:648:4: (lv_key_3_0= 'columns' )
            {
            // InternalPdfMk.g:648:4: (lv_key_3_0= 'columns' )
            // InternalPdfMk.g:649:5: lv_key_3_0= 'columns'
            {
            lv_key_3_0=(Token)match(input,29,FOLLOW_10); 

            					newLeafNode(lv_key_3_0, grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_3_0, "columns");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnDefinitionAccess().getColonKeyword_3());
            		
            // InternalPdfMk.g:665:3: ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* )
            // InternalPdfMk.g:666:4: ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )*
            {
            // InternalPdfMk.g:666:4: ( (lv_value_5_0= ruleColumnObject ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:667:5: (lv_value_5_0= ruleColumnObject )
                    {
                    // InternalPdfMk.g:667:5: (lv_value_5_0= ruleColumnObject )
                    // InternalPdfMk.g:668:6: lv_value_5_0= ruleColumnObject
                    {

                    						newCompositeNode(grammarAccess.getColumnDefinitionAccess().getValueColumnObjectParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_5_0=ruleColumnObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.avi.PdfMk.ColumnObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:685:4: (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPdfMk.g:686:5: otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_19); 

            	    					newLeafNode(otherlv_6, grammarAccess.getColumnDefinitionAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalPdfMk.g:690:5: ( (lv_value_7_0= ruleColumnObject ) )
            	    // InternalPdfMk.g:691:6: (lv_value_7_0= ruleColumnObject )
            	    {
            	    // InternalPdfMk.g:691:6: (lv_value_7_0= ruleColumnObject )
            	    // InternalPdfMk.g:692:7: lv_value_7_0= ruleColumnObject
            	    {

            	    							newCompositeNode(grammarAccess.getColumnDefinitionAccess().getValueColumnObjectParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_value_7_0=ruleColumnObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getColumnDefinitionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"value",
            	    								lv_value_7_0,
            	    								"org.xtext.avi.PdfMk.ColumnObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getColumnDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleMarginDefinition"
    // InternalPdfMk.g:719:1: entryRuleMarginDefinition returns [EObject current=null] : iv_ruleMarginDefinition= ruleMarginDefinition EOF ;
    public final EObject entryRuleMarginDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarginDefinition = null;


        try {
            // InternalPdfMk.g:719:57: (iv_ruleMarginDefinition= ruleMarginDefinition EOF )
            // InternalPdfMk.g:720:2: iv_ruleMarginDefinition= ruleMarginDefinition EOF
            {
             newCompositeNode(grammarAccess.getMarginDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarginDefinition=ruleMarginDefinition();

            state._fsp--;

             current =iv_ruleMarginDefinition; 
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
    // $ANTLR end "entryRuleMarginDefinition"


    // $ANTLR start "ruleMarginDefinition"
    // InternalPdfMk.g:726:1: ruleMarginDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleMarginDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPdfMk.g:732:2: ( ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' ) )
            // InternalPdfMk.g:733:2: ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' )
            {
            // InternalPdfMk.g:733:2: ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' )
            // InternalPdfMk.g:734:3: ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']'
            {
            // InternalPdfMk.g:734:3: ( (lv_key_0_0= 'margin' ) )
            // InternalPdfMk.g:735:4: (lv_key_0_0= 'margin' )
            {
            // InternalPdfMk.g:735:4: (lv_key_0_0= 'margin' )
            // InternalPdfMk.g:736:5: lv_key_0_0= 'margin'
            {
            lv_key_0_0=(Token)match(input,30,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarginDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "margin");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMarginDefinitionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMarginDefinitionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPdfMk.g:756:3: ( (lv_values_3_0= RULE_INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:757:4: (lv_values_3_0= RULE_INT )
                    {
                    // InternalPdfMk.g:757:4: (lv_values_3_0= RULE_INT )
                    // InternalPdfMk.g:758:5: lv_values_3_0= RULE_INT
                    {
                    lv_values_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    					newLeafNode(lv_values_3_0, grammarAccess.getMarginDefinitionAccess().getValuesINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMarginDefinitionRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"values",
                    						lv_values_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:774:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPdfMk.g:775:4: otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMarginDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPdfMk.g:779:4: ( (lv_values_5_0= RULE_INT ) )
            	    // InternalPdfMk.g:780:5: (lv_values_5_0= RULE_INT )
            	    {
            	    // InternalPdfMk.g:780:5: (lv_values_5_0= RULE_INT )
            	    // InternalPdfMk.g:781:6: lv_values_5_0= RULE_INT
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    						newLeafNode(lv_values_5_0, grammarAccess.getMarginDefinitionAccess().getValuesINTTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMarginDefinitionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMarginDefinitionAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMarginDefinition"


    // $ANTLR start "entryRuleImageDefintion"
    // InternalPdfMk.g:806:1: entryRuleImageDefintion returns [EObject current=null] : iv_ruleImageDefintion= ruleImageDefintion EOF ;
    public final EObject entryRuleImageDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDefintion = null;


        try {
            // InternalPdfMk.g:806:55: (iv_ruleImageDefintion= ruleImageDefintion EOF )
            // InternalPdfMk.g:807:2: iv_ruleImageDefintion= ruleImageDefintion EOF
            {
             newCompositeNode(grammarAccess.getImageDefintionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageDefintion=ruleImageDefintion();

            state._fsp--;

             current =iv_ruleImageDefintion; 
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
    // $ANTLR end "entryRuleImageDefintion"


    // $ANTLR start "ruleImageDefintion"
    // InternalPdfMk.g:813:1: ruleImageDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImageDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:819:2: ( ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:820:2: ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:820:2: ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:821:3: ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:821:3: ( (lv_key_0_0= 'image' ) )
            // InternalPdfMk.g:822:4: (lv_key_0_0= 'image' )
            {
            // InternalPdfMk.g:822:4: (lv_key_0_0= 'image' )
            // InternalPdfMk.g:823:5: lv_key_0_0= 'image'
            {
            lv_key_0_0=(Token)match(input,31,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "image");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImageDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:839:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:840:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:840:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:841:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageDefintionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDefintionRule());
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
    // $ANTLR end "ruleImageDefintion"


    // $ANTLR start "entryRuleImageWidthDefintion"
    // InternalPdfMk.g:861:1: entryRuleImageWidthDefintion returns [EObject current=null] : iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF ;
    public final EObject entryRuleImageWidthDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageWidthDefintion = null;


        try {
            // InternalPdfMk.g:861:60: (iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF )
            // InternalPdfMk.g:862:2: iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF
            {
             newCompositeNode(grammarAccess.getImageWidthDefintionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageWidthDefintion=ruleImageWidthDefintion();

            state._fsp--;

             current =iv_ruleImageWidthDefintion; 
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
    // $ANTLR end "entryRuleImageWidthDefintion"


    // $ANTLR start "ruleImageWidthDefintion"
    // InternalPdfMk.g:868:1: ruleImageWidthDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageWidthDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:874:2: ( ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:875:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:875:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:876:3: ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:876:3: ( (lv_key_0_0= 'width' ) )
            // InternalPdfMk.g:877:4: (lv_key_0_0= 'width' )
            {
            // InternalPdfMk.g:877:4: (lv_key_0_0= 'width' )
            // InternalPdfMk.g:878:5: lv_key_0_0= 'width'
            {
            lv_key_0_0=(Token)match(input,28,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageWidthDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "width");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getImageWidthDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:894:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:895:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:895:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:896:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageWidthDefintionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageWidthDefintionRule());
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
    // $ANTLR end "ruleImageWidthDefintion"


    // $ANTLR start "entryRuleImageHeightDefintion"
    // InternalPdfMk.g:916:1: entryRuleImageHeightDefintion returns [EObject current=null] : iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF ;
    public final EObject entryRuleImageHeightDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageHeightDefintion = null;


        try {
            // InternalPdfMk.g:916:61: (iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF )
            // InternalPdfMk.g:917:2: iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF
            {
             newCompositeNode(grammarAccess.getImageHeightDefintionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageHeightDefintion=ruleImageHeightDefintion();

            state._fsp--;

             current =iv_ruleImageHeightDefintion; 
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
    // $ANTLR end "entryRuleImageHeightDefintion"


    // $ANTLR start "ruleImageHeightDefintion"
    // InternalPdfMk.g:923:1: ruleImageHeightDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageHeightDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:929:2: ( ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:930:2: ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:930:2: ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:931:3: ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:931:3: ( (lv_key_0_0= 'height' ) )
            // InternalPdfMk.g:932:4: (lv_key_0_0= 'height' )
            {
            // InternalPdfMk.g:932:4: (lv_key_0_0= 'height' )
            // InternalPdfMk.g:933:5: lv_key_0_0= 'height'
            {
            lv_key_0_0=(Token)match(input,32,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageHeightDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "height");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getImageHeightDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:949:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:950:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:950:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:951:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageHeightDefintionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageHeightDefintionRule());
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
    // $ANTLR end "ruleImageHeightDefintion"


    // $ANTLR start "entryRuleImagePageBreakDefinition"
    // InternalPdfMk.g:971:1: entryRuleImagePageBreakDefinition returns [EObject current=null] : iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF ;
    public final EObject entryRuleImagePageBreakDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagePageBreakDefinition = null;


        try {
            // InternalPdfMk.g:971:65: (iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF )
            // InternalPdfMk.g:972:2: iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF
            {
             newCompositeNode(grammarAccess.getImagePageBreakDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImagePageBreakDefinition=ruleImagePageBreakDefinition();

            state._fsp--;

             current =iv_ruleImagePageBreakDefinition; 
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
    // $ANTLR end "entryRuleImagePageBreakDefinition"


    // $ANTLR start "ruleImagePageBreakDefinition"
    // InternalPdfMk.g:978:1: ruleImagePageBreakDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImagePageBreakDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:984:2: ( ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:985:2: ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:985:2: ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:986:3: ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:986:3: ( (lv_key_0_0= 'pageBreak' ) )
            // InternalPdfMk.g:987:4: (lv_key_0_0= 'pageBreak' )
            {
            // InternalPdfMk.g:987:4: (lv_key_0_0= 'pageBreak' )
            // InternalPdfMk.g:988:5: lv_key_0_0= 'pageBreak'
            {
            lv_key_0_0=(Token)match(input,33,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImagePageBreakDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "pageBreak");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImagePageBreakDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1004:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1005:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1005:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1006:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImagePageBreakDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImagePageBreakDefinitionRule());
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
    // $ANTLR end "ruleImagePageBreakDefinition"


    // $ANTLR start "entryRuleImageFitDefinition"
    // InternalPdfMk.g:1026:1: entryRuleImageFitDefinition returns [EObject current=null] : iv_ruleImageFitDefinition= ruleImageFitDefinition EOF ;
    public final EObject entryRuleImageFitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFitDefinition = null;


        try {
            // InternalPdfMk.g:1026:59: (iv_ruleImageFitDefinition= ruleImageFitDefinition EOF )
            // InternalPdfMk.g:1027:2: iv_ruleImageFitDefinition= ruleImageFitDefinition EOF
            {
             newCompositeNode(grammarAccess.getImageFitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageFitDefinition=ruleImageFitDefinition();

            state._fsp--;

             current =iv_ruleImageFitDefinition; 
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
    // $ANTLR end "entryRuleImageFitDefinition"


    // $ANTLR start "ruleImageFitDefinition"
    // InternalPdfMk.g:1033:1: ruleImageFitDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' ) ;
    public final EObject ruleImageFitDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1039:2: ( ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' ) )
            // InternalPdfMk.g:1040:2: ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' )
            {
            // InternalPdfMk.g:1040:2: ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' )
            // InternalPdfMk.g:1041:3: ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']'
            {
            // InternalPdfMk.g:1041:3: ( (lv_key_0_0= 'fit' ) )
            // InternalPdfMk.g:1042:4: (lv_key_0_0= 'fit' )
            {
            // InternalPdfMk.g:1042:4: (lv_key_0_0= 'fit' )
            // InternalPdfMk.g:1043:5: lv_key_0_0= 'fit'
            {
            lv_key_0_0=(Token)match(input,34,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "fit");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getImageFitDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1059:3: ( (lv_value_2_0= '[' ) )
            // InternalPdfMk.g:1060:4: (lv_value_2_0= '[' )
            {
            // InternalPdfMk.g:1060:4: (lv_value_2_0= '[' )
            // InternalPdfMk.g:1061:5: lv_value_2_0= '['
            {
            lv_value_2_0=(Token)match(input,23,FOLLOW_14); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1073:3: ( (lv_values_3_0= RULE_INT ) )
            // InternalPdfMk.g:1074:4: (lv_values_3_0= RULE_INT )
            {
            // InternalPdfMk.g:1074:4: (lv_values_3_0= RULE_INT )
            // InternalPdfMk.g:1075:5: lv_values_3_0= RULE_INT
            {
            lv_values_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_values_3_0, grammarAccess.getImageFitDefinitionAccess().getValuesINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPdfMk.g:1091:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )
            // InternalPdfMk.g:1092:4: otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) )
            {
            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            				newLeafNode(otherlv_4, grammarAccess.getImageFitDefinitionAccess().getCommaKeyword_4_0());
            			
            // InternalPdfMk.g:1096:4: ( (lv_values_5_0= RULE_INT ) )
            // InternalPdfMk.g:1097:5: (lv_values_5_0= RULE_INT )
            {
            // InternalPdfMk.g:1097:5: (lv_values_5_0= RULE_INT )
            // InternalPdfMk.g:1098:6: lv_values_5_0= RULE_INT
            {
            lv_values_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            						newLeafNode(lv_values_5_0, grammarAccess.getImageFitDefinitionAccess().getValuesINTTerminalRuleCall_4_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            						}
            						addWithLastConsumed(
            							current,
            							"values",
            							lv_values_5_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImageFitDefinitionAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleImageFitDefinition"


    // $ANTLR start "entryRuleImageOpacityDefinition"
    // InternalPdfMk.g:1123:1: entryRuleImageOpacityDefinition returns [EObject current=null] : iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF ;
    public final EObject entryRuleImageOpacityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageOpacityDefinition = null;


        try {
            // InternalPdfMk.g:1123:63: (iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF )
            // InternalPdfMk.g:1124:2: iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF
            {
             newCompositeNode(grammarAccess.getImageOpacityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageOpacityDefinition=ruleImageOpacityDefinition();

            state._fsp--;

             current =iv_ruleImageOpacityDefinition; 
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
    // $ANTLR end "entryRuleImageOpacityDefinition"


    // $ANTLR start "ruleImageOpacityDefinition"
    // InternalPdfMk.g:1130:1: ruleImageOpacityDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageOpacityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1136:2: ( ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:1137:2: ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:1137:2: ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:1138:3: ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:1138:3: ( (lv_key_0_0= 'opacity' ) )
            // InternalPdfMk.g:1139:4: (lv_key_0_0= 'opacity' )
            {
            // InternalPdfMk.g:1139:4: (lv_key_0_0= 'opacity' )
            // InternalPdfMk.g:1140:5: lv_key_0_0= 'opacity'
            {
            lv_key_0_0=(Token)match(input,35,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageOpacityDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "opacity");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getImageOpacityDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1156:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:1157:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:1157:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:1158:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageOpacityDefinitionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageOpacityDefinitionRule());
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
    // $ANTLR end "ruleImageOpacityDefinition"


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:1178:1: entryRuleTextObject returns [EObject current=null] : iv_ruleTextObject= ruleTextObject EOF ;
    public final EObject entryRuleTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObject = null;


        try {
            // InternalPdfMk.g:1178:51: (iv_ruleTextObject= ruleTextObject EOF )
            // InternalPdfMk.g:1179:2: iv_ruleTextObject= ruleTextObject EOF
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
    // InternalPdfMk.g:1185:1: ruleTextObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleTextObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_style_3_0 = null;

        EObject lv_fontSize_5_0 = null;

        AntlrDatatypeRuleToken lv_alignment_7_0 = null;

        EObject lv_typeFace_9_0 = null;

        EObject lv_italics_11_0 = null;

        EObject lv_width_13_0 = null;

        EObject lv_margin_15_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1191:2: ( ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? otherlv_16= '}' ) )
            // InternalPdfMk.g:1192:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? otherlv_16= '}' )
            {
            // InternalPdfMk.g:1192:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? otherlv_16= '}' )
            // InternalPdfMk.g:1193:3: ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? otherlv_16= '}'
            {
            // InternalPdfMk.g:1193:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:1194:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:1194:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:1195:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_22); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:1207:3: ( (lv_text_1_0= ruleTextDefinition ) )
            // InternalPdfMk.g:1208:4: (lv_text_1_0= ruleTextDefinition )
            {
            // InternalPdfMk.g:1208:4: (lv_text_1_0= ruleTextDefinition )
            // InternalPdfMk.g:1209:5: lv_text_1_0= ruleTextDefinition
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

            // InternalPdfMk.g:1226:3: (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==21) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:1227:4: otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextObjectAccess().getCommaKeyword_2_0());
                    			
                    // InternalPdfMk.g:1231:4: ( (lv_style_3_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:1232:5: (lv_style_3_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:1232:5: (lv_style_3_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:1233:6: lv_style_3_0= ruleTextStyleDefinition
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

            // InternalPdfMk.g:1251:3: (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==27) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:1252:4: otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextObjectAccess().getCommaKeyword_3_0());
                    			
                    // InternalPdfMk.g:1256:4: ( (lv_fontSize_5_0= ruleFontSizeDefinition ) )
                    // InternalPdfMk.g:1257:5: (lv_fontSize_5_0= ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:1257:5: (lv_fontSize_5_0= ruleFontSizeDefinition )
                    // InternalPdfMk.g:1258:6: lv_fontSize_5_0= ruleFontSizeDefinition
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

            // InternalPdfMk.g:1276:3: (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )?
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
                    // InternalPdfMk.g:1277:4: otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:1281:4: ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    // InternalPdfMk.g:1282:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:1282:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:1283:6: lv_alignment_7_0= ruleTextAlignmentDefinition
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

            // InternalPdfMk.g:1301:3: (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==17) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:1302:4: otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:1306:4: ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) )
                    // InternalPdfMk.g:1307:5: (lv_typeFace_9_0= ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:1307:5: (lv_typeFace_9_0= ruleTypeFaceDefinition )
                    // InternalPdfMk.g:1308:6: lv_typeFace_9_0= ruleTypeFaceDefinition
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

            // InternalPdfMk.g:1326:3: (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==26) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:1327:4: otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:1331:4: ( (lv_italics_11_0= ruleItalicsDefinition ) )
                    // InternalPdfMk.g:1332:5: (lv_italics_11_0= ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:1332:5: (lv_italics_11_0= ruleItalicsDefinition )
                    // InternalPdfMk.g:1333:6: lv_italics_11_0= ruleItalicsDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            // InternalPdfMk.g:1351:3: (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==28) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPdfMk.g:1352:4: otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) )
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextObjectAccess().getCommaKeyword_7_0());
                    			
                    // InternalPdfMk.g:1356:4: ( (lv_width_13_0= ruleWidthDefinition ) )
                    // InternalPdfMk.g:1357:5: (lv_width_13_0= ruleWidthDefinition )
                    {
                    // InternalPdfMk.g:1357:5: (lv_width_13_0= ruleWidthDefinition )
                    // InternalPdfMk.g:1358:6: lv_width_13_0= ruleWidthDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getWidthWidthDefinitionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_width_13_0=ruleWidthDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							true,
                    							"org.xtext.avi.PdfMk.WidthDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:1376:3: (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPdfMk.g:1377:4: otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) )
                    {
                    otherlv_14=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextObjectAccess().getCommaKeyword_8_0());
                    			
                    // InternalPdfMk.g:1381:4: ( (lv_margin_15_0= ruleMarginDefinition ) )
                    // InternalPdfMk.g:1382:5: (lv_margin_15_0= ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:1382:5: (lv_margin_15_0= ruleMarginDefinition )
                    // InternalPdfMk.g:1383:6: lv_margin_15_0= ruleMarginDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getMarginMarginDefinitionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_margin_15_0=ruleMarginDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"margin",
                    							true,
                    							"org.xtext.avi.PdfMk.MarginDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleColumnTextObject"
    // InternalPdfMk.g:1409:1: entryRuleColumnTextObject returns [EObject current=null] : iv_ruleColumnTextObject= ruleColumnTextObject EOF ;
    public final EObject entryRuleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTextObject = null;


        try {
            // InternalPdfMk.g:1409:57: (iv_ruleColumnTextObject= ruleColumnTextObject EOF )
            // InternalPdfMk.g:1410:2: iv_ruleColumnTextObject= ruleColumnTextObject EOF
            {
             newCompositeNode(grammarAccess.getColumnTextObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnTextObject=ruleColumnTextObject();

            state._fsp--;

             current =iv_ruleColumnTextObject; 
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
    // $ANTLR end "entryRuleColumnTextObject"


    // $ANTLR start "ruleColumnTextObject"
    // InternalPdfMk.g:1416:1: ruleColumnTextObject returns [EObject current=null] : ( (lv_value_0_0= ruleColumnDefinition ) ) ;
    public final EObject ruleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1422:2: ( ( (lv_value_0_0= ruleColumnDefinition ) ) )
            // InternalPdfMk.g:1423:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            {
            // InternalPdfMk.g:1423:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            // InternalPdfMk.g:1424:3: (lv_value_0_0= ruleColumnDefinition )
            {
            // InternalPdfMk.g:1424:3: (lv_value_0_0= ruleColumnDefinition )
            // InternalPdfMk.g:1425:4: lv_value_0_0= ruleColumnDefinition
            {

            				newCompositeNode(grammarAccess.getColumnTextObjectAccess().getValueColumnDefinitionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleColumnDefinition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getColumnTextObjectRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.avi.PdfMk.ColumnDefinition");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleColumnTextObject"


    // $ANTLR start "entryRuleStyleObject"
    // InternalPdfMk.g:1445:1: entryRuleStyleObject returns [EObject current=null] : iv_ruleStyleObject= ruleStyleObject EOF ;
    public final EObject entryRuleStyleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObject = null;


        try {
            // InternalPdfMk.g:1445:52: (iv_ruleStyleObject= ruleStyleObject EOF )
            // InternalPdfMk.g:1446:2: iv_ruleStyleObject= ruleStyleObject EOF
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
    // InternalPdfMk.g:1452:1: ruleStyleObject returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleStyleObject() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_fontSize_3_0 = null;

        EObject lv_typeFace_5_0 = null;

        AntlrDatatypeRuleToken lv_alignment_7_0 = null;

        EObject lv_italics_9_0 = null;

        EObject lv_margin_11_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1458:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' ) )
            // InternalPdfMk.g:1459:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' )
            {
            // InternalPdfMk.g:1459:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' )
            // InternalPdfMk.g:1460:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}'
            {
            // InternalPdfMk.g:1460:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalPdfMk.g:1461:4: (lv_key_0_0= RULE_ID )
            {
            // InternalPdfMk.g:1461:4: (lv_key_0_0= RULE_ID )
            // InternalPdfMk.g:1462:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStyleObjectAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStyleObjectAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1482:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:1483:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:1483:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:1484:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_30); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:1496:3: ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:1497:4: (lv_fontSize_3_0= ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:1497:4: (lv_fontSize_3_0= ruleFontSizeDefinition )
                    // InternalPdfMk.g:1498:5: lv_fontSize_3_0= ruleFontSizeDefinition
                    {

                    					newCompositeNode(grammarAccess.getStyleObjectAccess().getFontSizeFontSizeDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_fontSize_3_0=ruleFontSizeDefinition();

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

            // InternalPdfMk.g:1515:3: (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==17) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalPdfMk.g:1516:4: otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getStyleObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:1520:4: ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) )
                    // InternalPdfMk.g:1521:5: (lv_typeFace_5_0= ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:1521:5: (lv_typeFace_5_0= ruleTypeFaceDefinition )
                    // InternalPdfMk.g:1522:6: lv_typeFace_5_0= ruleTypeFaceDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getTypeFaceTypeFaceDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_typeFace_5_0=ruleTypeFaceDefinition();

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

            // InternalPdfMk.g:1540:3: (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==25) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPdfMk.g:1541:4: otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getStyleObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:1545:4: ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    // InternalPdfMk.g:1546:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:1546:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:1547:6: lv_alignment_7_0= ruleTextAlignmentDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getAlignmentTextAlignmentDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_alignment_7_0=ruleTextAlignmentDefinition();

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

            // InternalPdfMk.g:1565:3: (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==26) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:1566:4: otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getStyleObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:1570:4: ( (lv_italics_9_0= ruleItalicsDefinition ) )
                    // InternalPdfMk.g:1571:5: (lv_italics_9_0= ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:1571:5: (lv_italics_9_0= ruleItalicsDefinition )
                    // InternalPdfMk.g:1572:6: lv_italics_9_0= ruleItalicsDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getItalicsItalicsDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_italics_9_0=ruleItalicsDefinition();

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

            // InternalPdfMk.g:1590:3: (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:1591:4: otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getStyleObjectAccess().getCommaKeyword_7_0());
                    			
                    // InternalPdfMk.g:1595:4: ( (lv_margin_11_0= ruleMarginDefinition ) )
                    // InternalPdfMk.g:1596:5: (lv_margin_11_0= ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:1596:5: (lv_margin_11_0= ruleMarginDefinition )
                    // InternalPdfMk.g:1597:6: lv_margin_11_0= ruleMarginDefinition
                    {

                    						newCompositeNode(grammarAccess.getStyleObjectAccess().getMarginMarginDefinitionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_margin_11_0=ruleMarginDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStyleObjectRule());
                    						}
                    						set(
                    							current,
                    							"margin",
                    							true,
                    							"org.xtext.avi.PdfMk.MarginDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalPdfMk.g:1623:1: entryRuleStyleObjects returns [EObject current=null] : iv_ruleStyleObjects= ruleStyleObjects EOF ;
    public final EObject entryRuleStyleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjects = null;


        try {
            // InternalPdfMk.g:1623:53: (iv_ruleStyleObjects= ruleStyleObjects EOF )
            // InternalPdfMk.g:1624:2: iv_ruleStyleObjects= ruleStyleObjects EOF
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
    // InternalPdfMk.g:1630:1: ruleStyleObjects returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleStyleObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1636:2: ( (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:1637:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:1637:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:1638:3: otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:1642:3: ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* )
            // InternalPdfMk.g:1643:4: ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            {
            // InternalPdfMk.g:1643:4: ( (lv_value_1_0= ruleStyleObject ) )
            // InternalPdfMk.g:1644:5: (lv_value_1_0= ruleStyleObject )
            {
            // InternalPdfMk.g:1644:5: (lv_value_1_0= ruleStyleObject )
            // InternalPdfMk.g:1645:6: lv_value_1_0= ruleStyleObject
            {

            						newCompositeNode(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_1_0=ruleStyleObject();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStyleObjectsRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_1_0,
            							"org.xtext.avi.PdfMk.StyleObject");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPdfMk.g:1662:4: (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPdfMk.g:1663:5: otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_31); 

            	    					newLeafNode(otherlv_2, grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:1667:5: ( (lv_value_3_0= ruleStyleObject ) )
            	    // InternalPdfMk.g:1668:6: (lv_value_3_0= ruleStyleObject )
            	    {
            	    // InternalPdfMk.g:1668:6: (lv_value_3_0= ruleStyleObject )
            	    // InternalPdfMk.g:1669:7: lv_value_3_0= ruleStyleObject
            	    {

            	    							newCompositeNode(grammarAccess.getStyleObjectsAccess().getValueStyleObjectParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_value_3_0=ruleStyleObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStyleObjectsRule());
            	    							}
            	    							add(
            	    								current,
            	    								"value",
            	    								lv_value_3_0,
            	    								"org.xtext.avi.PdfMk.StyleObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStyleObjectsAccess().getRightCurlyBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleInnerColumnObject"
    // InternalPdfMk.g:1696:1: entryRuleInnerColumnObject returns [EObject current=null] : iv_ruleInnerColumnObject= ruleInnerColumnObject EOF ;
    public final EObject entryRuleInnerColumnObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerColumnObject = null;


        try {
            // InternalPdfMk.g:1696:58: (iv_ruleInnerColumnObject= ruleInnerColumnObject EOF )
            // InternalPdfMk.g:1697:2: iv_ruleInnerColumnObject= ruleInnerColumnObject EOF
            {
             newCompositeNode(grammarAccess.getInnerColumnObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerColumnObject=ruleInnerColumnObject();

            state._fsp--;

             current =iv_ruleInnerColumnObject; 
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
    // $ANTLR end "entryRuleInnerColumnObject"


    // $ANTLR start "ruleInnerColumnObject"
    // InternalPdfMk.g:1703:1: ruleInnerColumnObject returns [EObject current=null] : ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' ) ;
    public final EObject ruleInnerColumnObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_text_1_0 = null;

        EObject lv_text_3_0 = null;

        EObject lv_textObject_4_0 = null;

        EObject lv_textObject_6_0 = null;

        EObject lv_column_7_0 = null;

        EObject lv_column_9_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1709:2: ( ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' ) )
            // InternalPdfMk.g:1710:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' )
            {
            // InternalPdfMk.g:1710:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' )
            // InternalPdfMk.g:1711:3: ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']'
            {
            // InternalPdfMk.g:1711:3: ( (lv_value_0_0= '[' ) )
            // InternalPdfMk.g:1712:4: (lv_value_0_0= '[' )
            {
            // InternalPdfMk.g:1712:4: (lv_value_0_0= '[' )
            // InternalPdfMk.g:1713:5: lv_value_0_0= '['
            {
            lv_value_0_0=(Token)match(input,23,FOLLOW_32); 

            					newLeafNode(lv_value_0_0, grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInnerColumnObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1725:3: ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* )
            // InternalPdfMk.g:1726:4: ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            {
            // InternalPdfMk.g:1726:4: ( (lv_text_1_0= ruleStringObject ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPdfMk.g:1727:5: (lv_text_1_0= ruleStringObject )
                    {
                    // InternalPdfMk.g:1727:5: (lv_text_1_0= ruleStringObject )
                    // InternalPdfMk.g:1728:6: lv_text_1_0= ruleStringObject
                    {

                    						newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_text_1_0=ruleStringObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInnerColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"text",
                    							lv_text_1_0,
                    							"org.xtext.avi.PdfMk.StringObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:1745:4: (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_STRING) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalPdfMk.g:1746:5: otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:1750:5: ( (lv_text_3_0= ruleStringObject ) )
            	    // InternalPdfMk.g:1751:6: (lv_text_3_0= ruleStringObject )
            	    {
            	    // InternalPdfMk.g:1751:6: (lv_text_3_0= ruleStringObject )
            	    // InternalPdfMk.g:1752:7: lv_text_3_0= ruleStringObject
            	    {

            	    							newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_33);
            	    lv_text_3_0=ruleStringObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getInnerColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"text",
            	    								lv_text_3_0,
            	    								"org.xtext.avi.PdfMk.StringObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            // InternalPdfMk.g:1771:3: ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* )
            // InternalPdfMk.g:1772:4: ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            {
            // InternalPdfMk.g:1772:4: ( (lv_textObject_4_0= ruleTextObject ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=22 && LA24_1<=23)) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalPdfMk.g:1773:5: (lv_textObject_4_0= ruleTextObject )
                    {
                    // InternalPdfMk.g:1773:5: (lv_textObject_4_0= ruleTextObject )
                    // InternalPdfMk.g:1774:6: lv_textObject_4_0= ruleTextObject
                    {

                    						newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_textObject_4_0=ruleTextObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInnerColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"textObject",
                    							lv_textObject_4_0,
                    							"org.xtext.avi.PdfMk.TextObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:1791:4: (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==14) ) {
                        int LA25_3 = input.LA(3);

                        if ( ((LA25_3>=22 && LA25_3<=23)) ) {
                            alt25=1;
                        }


                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalPdfMk.g:1792:5: otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalPdfMk.g:1796:5: ( (lv_textObject_6_0= ruleTextObject ) )
            	    // InternalPdfMk.g:1797:6: (lv_textObject_6_0= ruleTextObject )
            	    {
            	    // InternalPdfMk.g:1797:6: (lv_textObject_6_0= ruleTextObject )
            	    // InternalPdfMk.g:1798:7: lv_textObject_6_0= ruleTextObject
            	    {

            	    							newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_33);
            	    lv_textObject_6_0=ruleTextObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getInnerColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"textObject",
            	    								lv_textObject_6_0,
            	    								"org.xtext.avi.PdfMk.TextObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            // InternalPdfMk.g:1817:3: ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* )
            // InternalPdfMk.g:1818:4: ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            {
            // InternalPdfMk.g:1818:4: ( (lv_column_7_0= ruleColumnDefinition ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPdfMk.g:1819:5: (lv_column_7_0= ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1819:5: (lv_column_7_0= ruleColumnDefinition )
                    // InternalPdfMk.g:1820:6: lv_column_7_0= ruleColumnDefinition
                    {

                    						newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_column_7_0=ruleColumnDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInnerColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"column",
                    							lv_column_7_0,
                    							"org.xtext.avi.PdfMk.ColumnDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:1837:4: (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPdfMk.g:1838:5: otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:1842:5: ( (lv_column_9_0= ruleColumnDefinition ) )
            	    // InternalPdfMk.g:1843:6: (lv_column_9_0= ruleColumnDefinition )
            	    {
            	    // InternalPdfMk.g:1843:6: (lv_column_9_0= ruleColumnDefinition )
            	    // InternalPdfMk.g:1844:7: lv_column_9_0= ruleColumnDefinition
            	    {

            	    							newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_column_9_0=ruleColumnDefinition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getInnerColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"column",
            	    								lv_column_9_0,
            	    								"org.xtext.avi.PdfMk.ColumnDefinition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInnerColumnObjectAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInnerColumnObject"


    // $ANTLR start "entryRuleColumnObject"
    // InternalPdfMk.g:1871:1: entryRuleColumnObject returns [EObject current=null] : iv_ruleColumnObject= ruleColumnObject EOF ;
    public final EObject entryRuleColumnObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnObject = null;


        try {
            // InternalPdfMk.g:1871:53: (iv_ruleColumnObject= ruleColumnObject EOF )
            // InternalPdfMk.g:1872:2: iv_ruleColumnObject= ruleColumnObject EOF
            {
             newCompositeNode(grammarAccess.getColumnObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnObject=ruleColumnObject();

            state._fsp--;

             current =iv_ruleColumnObject; 
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
    // $ANTLR end "entryRuleColumnObject"


    // $ANTLR start "ruleColumnObject"
    // InternalPdfMk.g:1878:1: ruleColumnObject returns [EObject current=null] : ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' ) ;
    public final EObject ruleColumnObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_text_1_0 = null;

        EObject lv_text_3_0 = null;

        EObject lv_textObject_4_0 = null;

        EObject lv_textObject_6_0 = null;

        EObject lv_column_7_0 = null;

        EObject lv_column_9_0 = null;

        EObject lv_innerColumn_10_0 = null;

        EObject lv_innerColumn_12_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1884:2: ( ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' ) )
            // InternalPdfMk.g:1885:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' )
            {
            // InternalPdfMk.g:1885:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' )
            // InternalPdfMk.g:1886:3: ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']'
            {
            // InternalPdfMk.g:1886:3: ( (lv_value_0_0= '[' ) )
            // InternalPdfMk.g:1887:4: (lv_value_0_0= '[' )
            {
            // InternalPdfMk.g:1887:4: (lv_value_0_0= '[' )
            // InternalPdfMk.g:1888:5: lv_value_0_0= '['
            {
            lv_value_0_0=(Token)match(input,23,FOLLOW_34); 

            					newLeafNode(lv_value_0_0, grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1900:3: ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* )
            // InternalPdfMk.g:1901:4: ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            {
            // InternalPdfMk.g:1901:4: ( (lv_text_1_0= ruleStringObject ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPdfMk.g:1902:5: (lv_text_1_0= ruleStringObject )
                    {
                    // InternalPdfMk.g:1902:5: (lv_text_1_0= ruleStringObject )
                    // InternalPdfMk.g:1903:6: lv_text_1_0= ruleStringObject
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_text_1_0=ruleStringObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"text",
                    							lv_text_1_0,
                    							"org.xtext.avi.PdfMk.StringObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:1920:4: (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==RULE_STRING) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalPdfMk.g:1921:5: otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getColumnObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:1925:5: ( (lv_text_3_0= ruleStringObject ) )
            	    // InternalPdfMk.g:1926:6: (lv_text_3_0= ruleStringObject )
            	    {
            	    // InternalPdfMk.g:1926:6: (lv_text_3_0= ruleStringObject )
            	    // InternalPdfMk.g:1927:7: lv_text_3_0= ruleStringObject
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_35);
            	    lv_text_3_0=ruleStringObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"text",
            	    								lv_text_3_0,
            	    								"org.xtext.avi.PdfMk.StringObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            // InternalPdfMk.g:1946:3: ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* )
            // InternalPdfMk.g:1947:4: ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            {
            // InternalPdfMk.g:1947:4: ( (lv_textObject_4_0= ruleTextObject ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=22 && LA30_1<=23)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalPdfMk.g:1948:5: (lv_textObject_4_0= ruleTextObject )
                    {
                    // InternalPdfMk.g:1948:5: (lv_textObject_4_0= ruleTextObject )
                    // InternalPdfMk.g:1949:6: lv_textObject_4_0= ruleTextObject
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_textObject_4_0=ruleTextObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"textObject",
                    							lv_textObject_4_0,
                    							"org.xtext.avi.PdfMk.TextObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:1966:4: (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==14) ) {
                        int LA31_3 = input.LA(3);

                        if ( ((LA31_3>=22 && LA31_3<=23)) ) {
                            alt31=1;
                        }


                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPdfMk.g:1967:5: otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getColumnObjectAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalPdfMk.g:1971:5: ( (lv_textObject_6_0= ruleTextObject ) )
            	    // InternalPdfMk.g:1972:6: (lv_textObject_6_0= ruleTextObject )
            	    {
            	    // InternalPdfMk.g:1972:6: (lv_textObject_6_0= ruleTextObject )
            	    // InternalPdfMk.g:1973:7: lv_textObject_6_0= ruleTextObject
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_35);
            	    lv_textObject_6_0=ruleTextObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"textObject",
            	    								lv_textObject_6_0,
            	    								"org.xtext.avi.PdfMk.TextObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            // InternalPdfMk.g:1992:3: ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* )
            // InternalPdfMk.g:1993:4: ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            {
            // InternalPdfMk.g:1993:4: ( (lv_column_7_0= ruleColumnDefinition ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==14) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPdfMk.g:1994:5: (lv_column_7_0= ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:1994:5: (lv_column_7_0= ruleColumnDefinition )
                    // InternalPdfMk.g:1995:6: lv_column_7_0= ruleColumnDefinition
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_column_7_0=ruleColumnDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"column",
                    							lv_column_7_0,
                    							"org.xtext.avi.PdfMk.ColumnDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2012:4: (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==14) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalPdfMk.g:2013:5: otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getColumnObjectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:2017:5: ( (lv_column_9_0= ruleColumnDefinition ) )
            	    // InternalPdfMk.g:2018:6: (lv_column_9_0= ruleColumnDefinition )
            	    {
            	    // InternalPdfMk.g:2018:6: (lv_column_9_0= ruleColumnDefinition )
            	    // InternalPdfMk.g:2019:7: lv_column_9_0= ruleColumnDefinition
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_column_9_0=ruleColumnDefinition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"column",
            	    								lv_column_9_0,
            	    								"org.xtext.avi.PdfMk.ColumnDefinition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            // InternalPdfMk.g:2038:3: ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* )
            // InternalPdfMk.g:2039:4: ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )*
            {
            // InternalPdfMk.g:2039:4: ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPdfMk.g:2040:5: (lv_innerColumn_10_0= ruleInnerColumnObject )
                    {
                    // InternalPdfMk.g:2040:5: (lv_innerColumn_10_0= ruleInnerColumnObject )
                    // InternalPdfMk.g:2041:6: lv_innerColumn_10_0= ruleInnerColumnObject
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getInnerColumnInnerColumnObjectParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_innerColumn_10_0=ruleInnerColumnObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnObjectRule());
                    						}
                    						add(
                    							current,
                    							"innerColumn",
                    							lv_innerColumn_10_0,
                    							"org.xtext.avi.PdfMk.InnerColumnObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2058:4: (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==15) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPdfMk.g:2059:5: otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_19); 

            	    					newLeafNode(otherlv_11, grammarAccess.getColumnObjectAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalPdfMk.g:2063:5: ( (lv_innerColumn_12_0= ruleInnerColumnObject ) )
            	    // InternalPdfMk.g:2064:6: (lv_innerColumn_12_0= ruleInnerColumnObject )
            	    {
            	    // InternalPdfMk.g:2064:6: (lv_innerColumn_12_0= ruleInnerColumnObject )
            	    // InternalPdfMk.g:2065:7: lv_innerColumn_12_0= ruleInnerColumnObject
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getInnerColumnInnerColumnObjectParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_innerColumn_12_0=ruleInnerColumnObject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"innerColumn",
            	    								lv_innerColumn_12_0,
            	    								"org.xtext.avi.PdfMk.InnerColumnObject");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            otherlv_13=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getColumnObjectAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleColumnObject"


    // $ANTLR start "entryRuleImageObject"
    // InternalPdfMk.g:2092:1: entryRuleImageObject returns [EObject current=null] : iv_ruleImageObject= ruleImageObject EOF ;
    public final EObject entryRuleImageObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageObject = null;


        try {
            // InternalPdfMk.g:2092:52: (iv_ruleImageObject= ruleImageObject EOF )
            // InternalPdfMk.g:2093:2: iv_ruleImageObject= ruleImageObject EOF
            {
             newCompositeNode(grammarAccess.getImageObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageObject=ruleImageObject();

            state._fsp--;

             current =iv_ruleImageObject; 
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
    // $ANTLR end "entryRuleImageObject"


    // $ANTLR start "ruleImageObject"
    // InternalPdfMk.g:2099:1: ruleImageObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleImageObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_image_1_0 = null;

        EObject lv_width_3_0 = null;

        EObject lv_height_5_0 = null;

        EObject lv_opacity_7_0 = null;

        EObject lv_fit_9_0 = null;

        EObject lv_pageBreak_11_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2105:2: ( ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' ) )
            // InternalPdfMk.g:2106:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' )
            {
            // InternalPdfMk.g:2106:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' )
            // InternalPdfMk.g:2107:3: ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}'
            {
            // InternalPdfMk.g:2107:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:2108:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:2108:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:2109:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_37); 

            					newLeafNode(lv_value_0_0, grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2121:3: ( (lv_image_1_0= ruleImageDefintion ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPdfMk.g:2122:4: (lv_image_1_0= ruleImageDefintion )
                    {
                    // InternalPdfMk.g:2122:4: (lv_image_1_0= ruleImageDefintion )
                    // InternalPdfMk.g:2123:5: lv_image_1_0= ruleImageDefintion
                    {

                    					newCompositeNode(grammarAccess.getImageObjectAccess().getImageImageDefintionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_image_1_0=ruleImageDefintion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImageObjectRule());
                    					}
                    					set(
                    						current,
                    						"image",
                    						true,
                    						"org.xtext.avi.PdfMk.ImageDefintion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2140:3: (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==28) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalPdfMk.g:2141:4: otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getImageObjectAccess().getCommaKeyword_2_0());
                    			
                    // InternalPdfMk.g:2145:4: ( (lv_width_3_0= ruleImageWidthDefintion ) )
                    // InternalPdfMk.g:2146:5: (lv_width_3_0= ruleImageWidthDefintion )
                    {
                    // InternalPdfMk.g:2146:5: (lv_width_3_0= ruleImageWidthDefintion )
                    // InternalPdfMk.g:2147:6: lv_width_3_0= ruleImageWidthDefintion
                    {

                    						newCompositeNode(grammarAccess.getImageObjectAccess().getWidthImageWidthDefintionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_width_3_0=ruleImageWidthDefintion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageObjectRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							true,
                    							"org.xtext.avi.PdfMk.ImageWidthDefintion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2165:3: (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==32) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalPdfMk.g:2166:4: otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getImageObjectAccess().getCommaKeyword_3_0());
                    			
                    // InternalPdfMk.g:2170:4: ( (lv_height_5_0= ruleImageHeightDefintion ) )
                    // InternalPdfMk.g:2171:5: (lv_height_5_0= ruleImageHeightDefintion )
                    {
                    // InternalPdfMk.g:2171:5: (lv_height_5_0= ruleImageHeightDefintion )
                    // InternalPdfMk.g:2172:6: lv_height_5_0= ruleImageHeightDefintion
                    {

                    						newCompositeNode(grammarAccess.getImageObjectAccess().getHeightImageHeightDefintionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_height_5_0=ruleImageHeightDefintion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageObjectRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							true,
                    							"org.xtext.avi.PdfMk.ImageHeightDefintion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2190:3: (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==35) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:2191:4: otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getImageObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:2195:4: ( (lv_opacity_7_0= ruleImageOpacityDefinition ) )
                    // InternalPdfMk.g:2196:5: (lv_opacity_7_0= ruleImageOpacityDefinition )
                    {
                    // InternalPdfMk.g:2196:5: (lv_opacity_7_0= ruleImageOpacityDefinition )
                    // InternalPdfMk.g:2197:6: lv_opacity_7_0= ruleImageOpacityDefinition
                    {

                    						newCompositeNode(grammarAccess.getImageObjectAccess().getOpacityImageOpacityDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_opacity_7_0=ruleImageOpacityDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageObjectRule());
                    						}
                    						set(
                    							current,
                    							"opacity",
                    							true,
                    							"org.xtext.avi.PdfMk.ImageOpacityDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2215:3: (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==34) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalPdfMk.g:2216:4: otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getImageObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:2220:4: ( (lv_fit_9_0= ruleImageFitDefinition ) )
                    // InternalPdfMk.g:2221:5: (lv_fit_9_0= ruleImageFitDefinition )
                    {
                    // InternalPdfMk.g:2221:5: (lv_fit_9_0= ruleImageFitDefinition )
                    // InternalPdfMk.g:2222:6: lv_fit_9_0= ruleImageFitDefinition
                    {

                    						newCompositeNode(grammarAccess.getImageObjectAccess().getFitImageFitDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fit_9_0=ruleImageFitDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageObjectRule());
                    						}
                    						set(
                    							current,
                    							"fit",
                    							true,
                    							"org.xtext.avi.PdfMk.ImageFitDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPdfMk.g:2240:3: (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPdfMk.g:2241:4: otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getImageObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:2245:4: ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) )
                    // InternalPdfMk.g:2246:5: (lv_pageBreak_11_0= ruleImagePageBreakDefinition )
                    {
                    // InternalPdfMk.g:2246:5: (lv_pageBreak_11_0= ruleImagePageBreakDefinition )
                    // InternalPdfMk.g:2247:6: lv_pageBreak_11_0= ruleImagePageBreakDefinition
                    {

                    						newCompositeNode(grammarAccess.getImageObjectAccess().getPageBreakImagePageBreakDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_pageBreak_11_0=ruleImagePageBreakDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageObjectRule());
                    						}
                    						set(
                    							current,
                    							"pageBreak",
                    							true,
                    							"org.xtext.avi.PdfMk.ImagePageBreakDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getImageObjectAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleImageObject"


    // $ANTLR start "entryRuleContentObject"
    // InternalPdfMk.g:2273:1: entryRuleContentObject returns [EObject current=null] : iv_ruleContentObject= ruleContentObject EOF ;
    public final EObject entryRuleContentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObject = null;


        try {
            // InternalPdfMk.g:2273:54: (iv_ruleContentObject= ruleContentObject EOF )
            // InternalPdfMk.g:2274:2: iv_ruleContentObject= ruleContentObject EOF
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
    // InternalPdfMk.g:2280:1: ruleContentObject returns [EObject current=null] : ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject ) ) ) ;
    public final EObject ruleContentObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;

        EObject lv_value_0_3 = null;

        EObject lv_value_0_4 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2286:2: ( ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject ) ) ) )
            // InternalPdfMk.g:2287:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject ) ) )
            {
            // InternalPdfMk.g:2287:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject ) ) )
            // InternalPdfMk.g:2288:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject ) )
            {
            // InternalPdfMk.g:2288:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject ) )
            // InternalPdfMk.g:2289:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject )
            {
            // InternalPdfMk.g:2289:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject )
            int alt42=4;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==14) ) {
                switch ( input.LA(2) ) {
                case 21:
                case 29:
                    {
                    alt42=3;
                    }
                    break;
                case 15:
                case 16:
                case 31:
                    {
                    alt42=4;
                    }
                    break;
                case 22:
                case 23:
                    {
                    alt42=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPdfMk.g:2290:5: lv_value_0_1= ruleStringObject
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
                    // InternalPdfMk.g:2306:5: lv_value_0_2= ruleTextObject
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
                case 3 :
                    // InternalPdfMk.g:2322:5: lv_value_0_3= ruleColumnTextObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectAccess().getValueColumnTextObjectParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_3=ruleColumnTextObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_3,
                    						"org.xtext.avi.PdfMk.ColumnTextObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:2338:5: lv_value_0_4= ruleImageObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectAccess().getValueImageObjectParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_4=ruleImageObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_4,
                    						"org.xtext.avi.PdfMk.ImageObject");
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
    // InternalPdfMk.g:2359:1: entryRuleContentObjects returns [EObject current=null] : iv_ruleContentObjects= ruleContentObjects EOF ;
    public final EObject entryRuleContentObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObjects = null;


        try {
            // InternalPdfMk.g:2359:55: (iv_ruleContentObjects= ruleContentObjects EOF )
            // InternalPdfMk.g:2360:2: iv_ruleContentObjects= ruleContentObjects EOF
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
    // InternalPdfMk.g:2366:1: ruleContentObjects returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleContentObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2372:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' ) )
            // InternalPdfMk.g:2373:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' )
            {
            // InternalPdfMk.g:2373:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' )
            // InternalPdfMk.g:2374:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPdfMk.g:2378:3: ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING||LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPdfMk.g:2379:4: ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )*
                    {
                    // InternalPdfMk.g:2379:4: ( (lv_value_1_0= ruleContentObject ) )
                    // InternalPdfMk.g:2380:5: (lv_value_1_0= ruleContentObject )
                    {
                    // InternalPdfMk.g:2380:5: (lv_value_1_0= ruleContentObject )
                    // InternalPdfMk.g:2381:6: lv_value_1_0= ruleContentObject
                    {

                    						newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_1_0=ruleContentObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentObjectsRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.avi.PdfMk.ContentObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPdfMk.g:2398:4: (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==15) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalPdfMk.g:2399:5: otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getContentObjectsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPdfMk.g:2403:5: ( (lv_value_3_0= ruleContentObject ) )
                    	    // InternalPdfMk.g:2404:6: (lv_value_3_0= ruleContentObject )
                    	    {
                    	    // InternalPdfMk.g:2404:6: (lv_value_3_0= ruleContentObject )
                    	    // InternalPdfMk.g:2405:7: lv_value_3_0= ruleContentObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_value_3_0=ruleContentObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentObjectsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_3_0,
                    	    								"org.xtext.avi.PdfMk.ContentObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_2());
            		

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
    // InternalPdfMk.g:2432:1: entryRuleStyles returns [EObject current=null] : iv_ruleStyles= ruleStyles EOF ;
    public final EObject entryRuleStyles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyles = null;


        try {
            // InternalPdfMk.g:2432:47: (iv_ruleStyles= ruleStyles EOF )
            // InternalPdfMk.g:2433:2: iv_ruleStyles= ruleStyles EOF
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
    // InternalPdfMk.g:2439:1: ruleStyles returns [EObject current=null] : ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) ;
    public final EObject ruleStyles() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2445:2: ( ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) )
            // InternalPdfMk.g:2446:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            {
            // InternalPdfMk.g:2446:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            // InternalPdfMk.g:2447:3: ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) )
            {
            // InternalPdfMk.g:2447:3: ( (lv_key_0_0= 'styles' ) )
            // InternalPdfMk.g:2448:4: (lv_key_0_0= 'styles' )
            {
            // InternalPdfMk.g:2448:4: (lv_key_0_0= 'styles' )
            // InternalPdfMk.g:2449:5: lv_key_0_0= 'styles'
            {
            lv_key_0_0=(Token)match(input,36,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStylesRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "styles");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStylesAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:2465:3: ( (lv_value_2_0= ruleStyleObjects ) )
            // InternalPdfMk.g:2466:4: (lv_value_2_0= ruleStyleObjects )
            {
            // InternalPdfMk.g:2466:4: (lv_value_2_0= ruleStyleObjects )
            // InternalPdfMk.g:2467:5: lv_value_2_0= ruleStyleObjects
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
    // InternalPdfMk.g:2488:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPdfMk.g:2488:48: (iv_ruleContent= ruleContent EOF )
            // InternalPdfMk.g:2489:2: iv_ruleContent= ruleContent EOF
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
    // InternalPdfMk.g:2495:1: ruleContent returns [EObject current=null] : ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2501:2: ( ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) )
            // InternalPdfMk.g:2502:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            {
            // InternalPdfMk.g:2502:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            // InternalPdfMk.g:2503:3: ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) )
            {
            // InternalPdfMk.g:2503:3: ( (lv_key_0_0= 'content' ) )
            // InternalPdfMk.g:2504:4: (lv_key_0_0= 'content' )
            {
            // InternalPdfMk.g:2504:4: (lv_key_0_0= 'content' )
            // InternalPdfMk.g:2505:5: lv_key_0_0= 'content'
            {
            lv_key_0_0=(Token)match(input,37,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getContentAccess().getKeyContentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "content");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:2521:3: ( (lv_value_2_0= ruleContentObjects ) )
            // InternalPdfMk.g:2522:4: (lv_value_2_0= ruleContentObjects )
            {
            // InternalPdfMk.g:2522:4: (lv_value_2_0= ruleContentObjects )
            // InternalPdfMk.g:2523:5: lv_value_2_0= ruleContentObjects
            {

            					newCompositeNode(grammarAccess.getContentAccess().getValueContentObjectsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleContentObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.avi.PdfMk.ContentObjects");
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
    // $ANTLR end "ruleContent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000818000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008018000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000100C010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000180C010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000180C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080018000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001004010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004010L});

}