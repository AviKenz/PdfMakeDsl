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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'dd'", "'='", "'{'", "','", "'}'", "'bold'", "':'", "'true'", "'false'", "'style'", "'text'", "'alignment'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'['", "']'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'body'", "'table'", "'ul'", "'ol'", "'styles'", "'content'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    // InternalPdfMk.g:347:1: entryRuleTextDefinition returns [EObject current=null] : iv_ruleTextDefinition= ruleTextDefinition EOF ;
    public final EObject entryRuleTextDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextDefinition = null;


        try {
            // InternalPdfMk.g:347:55: (iv_ruleTextDefinition= ruleTextDefinition EOF )
            // InternalPdfMk.g:348:2: iv_ruleTextDefinition= ruleTextDefinition EOF
            {
             newCompositeNode(grammarAccess.getTextDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextDefinition=ruleTextDefinition();

            state._fsp--;

             current =iv_ruleTextDefinition; 
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
    // InternalPdfMk.g:354:1: ruleTextDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:360:2: ( ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:361:2: ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:361:2: ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:362:3: ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:362:3: ( (lv_key_0_0= 'text' ) )
            // InternalPdfMk.g:363:4: (lv_key_0_0= 'text' )
            {
            // InternalPdfMk.g:363:4: (lv_key_0_0= 'text' )
            // InternalPdfMk.g:364:5: lv_key_0_0= 'text'
            {
            lv_key_0_0=(Token)match(input,22,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "text");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTextDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:380:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:381:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:381:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:382:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTextDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextDefinitionRule());
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
    // $ANTLR end "ruleTextDefinition"


    // $ANTLR start "entryRuleTextAlignmentDefinition"
    // InternalPdfMk.g:402:1: entryRuleTextAlignmentDefinition returns [EObject current=null] : iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF ;
    public final EObject entryRuleTextAlignmentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlignmentDefinition = null;


        try {
            // InternalPdfMk.g:402:64: (iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:403:2: iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF
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
    // InternalPdfMk.g:409:1: ruleTextAlignmentDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextAlignmentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:415:2: ( ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:416:2: ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:416:2: ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:417:3: ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:417:3: ( (lv_key_0_0= 'alignment' ) )
            // InternalPdfMk.g:418:4: (lv_key_0_0= 'alignment' )
            {
            // InternalPdfMk.g:418:4: (lv_key_0_0= 'alignment' )
            // InternalPdfMk.g:419:5: lv_key_0_0= 'alignment'
            {
            lv_key_0_0=(Token)match(input,23,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAlignmentDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "alignment");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:435:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:436:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:436:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:437:5: lv_value_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleItalicsDefinition"
    // InternalPdfMk.g:457:1: entryRuleItalicsDefinition returns [EObject current=null] : iv_ruleItalicsDefinition= ruleItalicsDefinition EOF ;
    public final EObject entryRuleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicsDefinition = null;


        try {
            // InternalPdfMk.g:457:58: (iv_ruleItalicsDefinition= ruleItalicsDefinition EOF )
            // InternalPdfMk.g:458:2: iv_ruleItalicsDefinition= ruleItalicsDefinition EOF
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
    // InternalPdfMk.g:464:1: ruleItalicsDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:470:2: ( ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:471:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:471:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:472:3: ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
            {
            // InternalPdfMk.g:472:3: ( (lv_key_0_0= 'italics' ) )
            // InternalPdfMk.g:473:4: (lv_key_0_0= 'italics' )
            {
            // InternalPdfMk.g:473:4: (lv_key_0_0= 'italics' )
            // InternalPdfMk.g:474:5: lv_key_0_0= 'italics'
            {
            lv_key_0_0=(Token)match(input,24,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItalicsDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "italics");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getItalicsDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:490:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:491:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:491:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:492:5: lv_value_2_0= ruleBooleanType
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
    // InternalPdfMk.g:513:1: entryRuleFontSizeDefinition returns [EObject current=null] : iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF ;
    public final EObject entryRuleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSizeDefinition = null;


        try {
            // InternalPdfMk.g:513:59: (iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF )
            // InternalPdfMk.g:514:2: iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF
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
    // InternalPdfMk.g:520:1: ruleFontSizeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:526:2: ( ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:527:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:527:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:528:3: ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:528:3: ( (lv_key_0_0= 'fontSize' ) )
            // InternalPdfMk.g:529:4: (lv_key_0_0= 'fontSize' )
            {
            // InternalPdfMk.g:529:4: (lv_key_0_0= 'fontSize' )
            // InternalPdfMk.g:530:5: lv_key_0_0= 'fontSize'
            {
            lv_key_0_0=(Token)match(input,25,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFontSizeDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "fontSize");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFontSizeDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:546:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:547:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:547:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:548:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:568:1: entryRuleWidthDefinition returns [EObject current=null] : iv_ruleWidthDefinition= ruleWidthDefinition EOF ;
    public final EObject entryRuleWidthDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidthDefinition = null;


        try {
            // InternalPdfMk.g:568:56: (iv_ruleWidthDefinition= ruleWidthDefinition EOF )
            // InternalPdfMk.g:569:2: iv_ruleWidthDefinition= ruleWidthDefinition EOF
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
    // InternalPdfMk.g:575:1: ruleWidthDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) ) ;
    public final EObject ruleWidthDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:581:2: ( ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) ) )
            // InternalPdfMk.g:582:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) )
            {
            // InternalPdfMk.g:582:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) )
            // InternalPdfMk.g:583:3: ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) )
            {
            // InternalPdfMk.g:583:3: ( (lv_key_0_0= 'width' ) )
            // InternalPdfMk.g:584:4: (lv_key_0_0= 'width' )
            {
            // InternalPdfMk.g:584:4: (lv_key_0_0= 'width' )
            // InternalPdfMk.g:585:5: lv_key_0_0= 'width'
            {
            lv_key_0_0=(Token)match(input,26,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidthDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "width");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getWidthDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:601:3: ( (lv_value_2_0= ruleColumnTextWidthType ) )
            // InternalPdfMk.g:602:4: (lv_value_2_0= ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:602:4: (lv_value_2_0= ruleColumnTextWidthType )
            // InternalPdfMk.g:603:5: lv_value_2_0= ruleColumnTextWidthType
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
    // InternalPdfMk.g:624:1: entryRuleColumnDefinition returns [EObject current=null] : iv_ruleColumnDefinition= ruleColumnDefinition EOF ;
    public final EObject entryRuleColumnDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDefinition = null;


        try {
            // InternalPdfMk.g:624:57: (iv_ruleColumnDefinition= ruleColumnDefinition EOF )
            // InternalPdfMk.g:625:2: iv_ruleColumnDefinition= ruleColumnDefinition EOF
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
    // InternalPdfMk.g:631:1: ruleColumnDefinition returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' ) ;
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
            // InternalPdfMk.g:637:2: ( (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' ) )
            // InternalPdfMk.g:638:2: (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' )
            {
            // InternalPdfMk.g:638:2: (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' )
            // InternalPdfMk.g:639:3: otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnDefinitionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:643:3: ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPdfMk.g:644:4: ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ','
                    {
                    // InternalPdfMk.g:644:4: ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:645:5: (lv_globalStyle_1_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:645:5: (lv_globalStyle_1_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:646:6: lv_globalStyle_1_0= ruleTextStyleDefinition
                    {

                    						newCompositeNode(grammarAccess.getColumnDefinitionAccess().getGlobalStyleTextStyleDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    otherlv_2=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnDefinitionAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPdfMk.g:668:3: ( (lv_key_3_0= 'columns' ) )
            // InternalPdfMk.g:669:4: (lv_key_3_0= 'columns' )
            {
            // InternalPdfMk.g:669:4: (lv_key_3_0= 'columns' )
            // InternalPdfMk.g:670:5: lv_key_3_0= 'columns'
            {
            lv_key_3_0=(Token)match(input,27,FOLLOW_10); 

            					newLeafNode(lv_key_3_0, grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_3_0, "columns");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnDefinitionAccess().getColonKeyword_3());
            		
            // InternalPdfMk.g:686:3: ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* )
            // InternalPdfMk.g:687:4: ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )*
            {
            // InternalPdfMk.g:687:4: ( (lv_value_5_0= ruleColumnObject ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:688:5: (lv_value_5_0= ruleColumnObject )
                    {
                    // InternalPdfMk.g:688:5: (lv_value_5_0= ruleColumnObject )
                    // InternalPdfMk.g:689:6: lv_value_5_0= ruleColumnObject
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

            // InternalPdfMk.g:706:4: (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPdfMk.g:707:5: otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_18); 

            	    					newLeafNode(otherlv_6, grammarAccess.getColumnDefinitionAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalPdfMk.g:711:5: ( (lv_value_7_0= ruleColumnObject ) )
            	    // InternalPdfMk.g:712:6: (lv_value_7_0= ruleColumnObject )
            	    {
            	    // InternalPdfMk.g:712:6: (lv_value_7_0= ruleColumnObject )
            	    // InternalPdfMk.g:713:7: lv_value_7_0= ruleColumnObject
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
            	    break loop5;
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
    // InternalPdfMk.g:740:1: entryRuleMarginDefinition returns [EObject current=null] : iv_ruleMarginDefinition= ruleMarginDefinition EOF ;
    public final EObject entryRuleMarginDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarginDefinition = null;


        try {
            // InternalPdfMk.g:740:57: (iv_ruleMarginDefinition= ruleMarginDefinition EOF )
            // InternalPdfMk.g:741:2: iv_ruleMarginDefinition= ruleMarginDefinition EOF
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
    // InternalPdfMk.g:747:1: ruleMarginDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' ) ;
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
            // InternalPdfMk.g:753:2: ( ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' ) )
            // InternalPdfMk.g:754:2: ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' )
            {
            // InternalPdfMk.g:754:2: ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' )
            // InternalPdfMk.g:755:3: ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']'
            {
            // InternalPdfMk.g:755:3: ( (lv_key_0_0= 'margin' ) )
            // InternalPdfMk.g:756:4: (lv_key_0_0= 'margin' )
            {
            // InternalPdfMk.g:756:4: (lv_key_0_0= 'margin' )
            // InternalPdfMk.g:757:5: lv_key_0_0= 'margin'
            {
            lv_key_0_0=(Token)match(input,28,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarginDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "margin");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMarginDefinitionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMarginDefinitionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPdfMk.g:777:3: ( (lv_values_3_0= RULE_INT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPdfMk.g:778:4: (lv_values_3_0= RULE_INT )
                    {
                    // InternalPdfMk.g:778:4: (lv_values_3_0= RULE_INT )
                    // InternalPdfMk.g:779:5: lv_values_3_0= RULE_INT
                    {
                    lv_values_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

            // InternalPdfMk.g:795:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPdfMk.g:796:4: otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMarginDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPdfMk.g:800:4: ( (lv_values_5_0= RULE_INT ) )
            	    // InternalPdfMk.g:801:5: (lv_values_5_0= RULE_INT )
            	    {
            	    // InternalPdfMk.g:801:5: (lv_values_5_0= RULE_INT )
            	    // InternalPdfMk.g:802:6: lv_values_5_0= RULE_INT
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalPdfMk.g:827:1: entryRuleImageDefintion returns [EObject current=null] : iv_ruleImageDefintion= ruleImageDefintion EOF ;
    public final EObject entryRuleImageDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDefintion = null;


        try {
            // InternalPdfMk.g:827:55: (iv_ruleImageDefintion= ruleImageDefintion EOF )
            // InternalPdfMk.g:828:2: iv_ruleImageDefintion= ruleImageDefintion EOF
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
    // InternalPdfMk.g:834:1: ruleImageDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImageDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:840:2: ( ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:841:2: ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:841:2: ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:842:3: ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:842:3: ( (lv_key_0_0= 'image' ) )
            // InternalPdfMk.g:843:4: (lv_key_0_0= 'image' )
            {
            // InternalPdfMk.g:843:4: (lv_key_0_0= 'image' )
            // InternalPdfMk.g:844:5: lv_key_0_0= 'image'
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
            		
            // InternalPdfMk.g:860:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:861:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:861:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:862:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:882:1: entryRuleImageWidthDefintion returns [EObject current=null] : iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF ;
    public final EObject entryRuleImageWidthDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageWidthDefintion = null;


        try {
            // InternalPdfMk.g:882:60: (iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF )
            // InternalPdfMk.g:883:2: iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF
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
    // InternalPdfMk.g:889:1: ruleImageWidthDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageWidthDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:895:2: ( ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:896:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:896:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:897:3: ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:897:3: ( (lv_key_0_0= 'width' ) )
            // InternalPdfMk.g:898:4: (lv_key_0_0= 'width' )
            {
            // InternalPdfMk.g:898:4: (lv_key_0_0= 'width' )
            // InternalPdfMk.g:899:5: lv_key_0_0= 'width'
            {
            lv_key_0_0=(Token)match(input,26,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageWidthDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "width");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImageWidthDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:915:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:916:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:916:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:917:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:937:1: entryRuleImageHeightDefintion returns [EObject current=null] : iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF ;
    public final EObject entryRuleImageHeightDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageHeightDefintion = null;


        try {
            // InternalPdfMk.g:937:61: (iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF )
            // InternalPdfMk.g:938:2: iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF
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
    // InternalPdfMk.g:944:1: ruleImageHeightDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageHeightDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:950:2: ( ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:951:2: ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:951:2: ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:952:3: ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:952:3: ( (lv_key_0_0= 'height' ) )
            // InternalPdfMk.g:953:4: (lv_key_0_0= 'height' )
            {
            // InternalPdfMk.g:953:4: (lv_key_0_0= 'height' )
            // InternalPdfMk.g:954:5: lv_key_0_0= 'height'
            {
            lv_key_0_0=(Token)match(input,32,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageHeightDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "height");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImageHeightDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:970:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:971:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:971:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:972:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:992:1: entryRuleImagePageBreakDefinition returns [EObject current=null] : iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF ;
    public final EObject entryRuleImagePageBreakDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagePageBreakDefinition = null;


        try {
            // InternalPdfMk.g:992:65: (iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF )
            // InternalPdfMk.g:993:2: iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF
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
    // InternalPdfMk.g:999:1: ruleImagePageBreakDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImagePageBreakDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1005:2: ( ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1006:2: ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1006:2: ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1007:3: ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1007:3: ( (lv_key_0_0= 'pageBreak' ) )
            // InternalPdfMk.g:1008:4: (lv_key_0_0= 'pageBreak' )
            {
            // InternalPdfMk.g:1008:4: (lv_key_0_0= 'pageBreak' )
            // InternalPdfMk.g:1009:5: lv_key_0_0= 'pageBreak'
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
            		
            // InternalPdfMk.g:1025:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1026:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1026:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1027:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1047:1: entryRuleImageFitDefinition returns [EObject current=null] : iv_ruleImageFitDefinition= ruleImageFitDefinition EOF ;
    public final EObject entryRuleImageFitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFitDefinition = null;


        try {
            // InternalPdfMk.g:1047:59: (iv_ruleImageFitDefinition= ruleImageFitDefinition EOF )
            // InternalPdfMk.g:1048:2: iv_ruleImageFitDefinition= ruleImageFitDefinition EOF
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
    // InternalPdfMk.g:1054:1: ruleImageFitDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' ) ;
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
            // InternalPdfMk.g:1060:2: ( ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' ) )
            // InternalPdfMk.g:1061:2: ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' )
            {
            // InternalPdfMk.g:1061:2: ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' )
            // InternalPdfMk.g:1062:3: ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']'
            {
            // InternalPdfMk.g:1062:3: ( (lv_key_0_0= 'fit' ) )
            // InternalPdfMk.g:1063:4: (lv_key_0_0= 'fit' )
            {
            // InternalPdfMk.g:1063:4: (lv_key_0_0= 'fit' )
            // InternalPdfMk.g:1064:5: lv_key_0_0= 'fit'
            {
            lv_key_0_0=(Token)match(input,34,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "fit");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getImageFitDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1080:3: ( (lv_value_2_0= '[' ) )
            // InternalPdfMk.g:1081:4: (lv_value_2_0= '[' )
            {
            // InternalPdfMk.g:1081:4: (lv_value_2_0= '[' )
            // InternalPdfMk.g:1082:5: lv_value_2_0= '['
            {
            lv_value_2_0=(Token)match(input,29,FOLLOW_13); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1094:3: ( (lv_values_3_0= RULE_INT ) )
            // InternalPdfMk.g:1095:4: (lv_values_3_0= RULE_INT )
            {
            // InternalPdfMk.g:1095:4: (lv_values_3_0= RULE_INT )
            // InternalPdfMk.g:1096:5: lv_values_3_0= RULE_INT
            {
            lv_values_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalPdfMk.g:1112:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )
            // InternalPdfMk.g:1113:4: otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) )
            {
            otherlv_4=(Token)match(input,15,FOLLOW_13); 

            				newLeafNode(otherlv_4, grammarAccess.getImageFitDefinitionAccess().getCommaKeyword_4_0());
            			
            // InternalPdfMk.g:1117:4: ( (lv_values_5_0= RULE_INT ) )
            // InternalPdfMk.g:1118:5: (lv_values_5_0= RULE_INT )
            {
            // InternalPdfMk.g:1118:5: (lv_values_5_0= RULE_INT )
            // InternalPdfMk.g:1119:6: lv_values_5_0= RULE_INT
            {
            lv_values_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalPdfMk.g:1144:1: entryRuleImageOpacityDefinition returns [EObject current=null] : iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF ;
    public final EObject entryRuleImageOpacityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageOpacityDefinition = null;


        try {
            // InternalPdfMk.g:1144:63: (iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF )
            // InternalPdfMk.g:1145:2: iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF
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
    // InternalPdfMk.g:1151:1: ruleImageOpacityDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageOpacityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1157:2: ( ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:1158:2: ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:1158:2: ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:1159:3: ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:1159:3: ( (lv_key_0_0= 'opacity' ) )
            // InternalPdfMk.g:1160:4: (lv_key_0_0= 'opacity' )
            {
            // InternalPdfMk.g:1160:4: (lv_key_0_0= 'opacity' )
            // InternalPdfMk.g:1161:5: lv_key_0_0= 'opacity'
            {
            lv_key_0_0=(Token)match(input,35,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageOpacityDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "opacity");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImageOpacityDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1177:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:1178:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:1178:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:1179:5: lv_value_2_0= RULE_INT
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


    // $ANTLR start "entryRuleListReversedDefinition"
    // InternalPdfMk.g:1199:1: entryRuleListReversedDefinition returns [EObject current=null] : iv_ruleListReversedDefinition= ruleListReversedDefinition EOF ;
    public final EObject entryRuleListReversedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListReversedDefinition = null;


        try {
            // InternalPdfMk.g:1199:63: (iv_ruleListReversedDefinition= ruleListReversedDefinition EOF )
            // InternalPdfMk.g:1200:2: iv_ruleListReversedDefinition= ruleListReversedDefinition EOF
            {
             newCompositeNode(grammarAccess.getListReversedDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListReversedDefinition=ruleListReversedDefinition();

            state._fsp--;

             current =iv_ruleListReversedDefinition; 
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
    // $ANTLR end "entryRuleListReversedDefinition"


    // $ANTLR start "ruleListReversedDefinition"
    // InternalPdfMk.g:1206:1: ruleListReversedDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleListReversedDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1212:2: ( ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:1213:2: ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:1213:2: ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:1214:3: ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
            {
            // InternalPdfMk.g:1214:3: ( (lv_key_0_0= 'reversed' ) )
            // InternalPdfMk.g:1215:4: (lv_key_0_0= 'reversed' )
            {
            // InternalPdfMk.g:1215:4: (lv_key_0_0= 'reversed' )
            // InternalPdfMk.g:1216:5: lv_key_0_0= 'reversed'
            {
            lv_key_0_0=(Token)match(input,36,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListReversedDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "reversed");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getListReversedDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1232:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:1233:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:1233:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:1234:5: lv_value_2_0= ruleBooleanType
            {

            					newCompositeNode(grammarAccess.getListReversedDefinitionAccess().getValueBooleanTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBooleanType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListReversedDefinitionRule());
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
    // $ANTLR end "ruleListReversedDefinition"


    // $ANTLR start "entryRuleListCounterDefinition"
    // InternalPdfMk.g:1255:1: entryRuleListCounterDefinition returns [EObject current=null] : iv_ruleListCounterDefinition= ruleListCounterDefinition EOF ;
    public final EObject entryRuleListCounterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListCounterDefinition = null;


        try {
            // InternalPdfMk.g:1255:62: (iv_ruleListCounterDefinition= ruleListCounterDefinition EOF )
            // InternalPdfMk.g:1256:2: iv_ruleListCounterDefinition= ruleListCounterDefinition EOF
            {
             newCompositeNode(grammarAccess.getListCounterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListCounterDefinition=ruleListCounterDefinition();

            state._fsp--;

             current =iv_ruleListCounterDefinition; 
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
    // $ANTLR end "entryRuleListCounterDefinition"


    // $ANTLR start "ruleListCounterDefinition"
    // InternalPdfMk.g:1262:1: ruleListCounterDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleListCounterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1268:2: ( ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:1269:2: ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:1269:2: ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:1270:3: ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:1270:3: ( (lv_key_0_0= 'counter' ) )
            // InternalPdfMk.g:1271:4: (lv_key_0_0= 'counter' )
            {
            // InternalPdfMk.g:1271:4: (lv_key_0_0= 'counter' )
            // InternalPdfMk.g:1272:5: lv_key_0_0= 'counter'
            {
            lv_key_0_0=(Token)match(input,37,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListCounterDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "counter");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getListCounterDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1288:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:1289:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:1289:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:1290:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getListCounterDefinitionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListCounterDefinitionRule());
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
    // $ANTLR end "ruleListCounterDefinition"


    // $ANTLR start "entryRuleListTypeDefinition"
    // InternalPdfMk.g:1310:1: entryRuleListTypeDefinition returns [EObject current=null] : iv_ruleListTypeDefinition= ruleListTypeDefinition EOF ;
    public final EObject entryRuleListTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeDefinition = null;


        try {
            // InternalPdfMk.g:1310:59: (iv_ruleListTypeDefinition= ruleListTypeDefinition EOF )
            // InternalPdfMk.g:1311:2: iv_ruleListTypeDefinition= ruleListTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getListTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListTypeDefinition=ruleListTypeDefinition();

            state._fsp--;

             current =iv_ruleListTypeDefinition; 
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
    // $ANTLR end "entryRuleListTypeDefinition"


    // $ANTLR start "ruleListTypeDefinition"
    // InternalPdfMk.g:1317:1: ruleListTypeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1323:2: ( ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1324:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1324:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1325:3: ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1325:3: ( (lv_key_0_0= 'type' ) )
            // InternalPdfMk.g:1326:4: (lv_key_0_0= 'type' )
            {
            // InternalPdfMk.g:1326:4: (lv_key_0_0= 'type' )
            // InternalPdfMk.g:1327:5: lv_key_0_0= 'type'
            {
            lv_key_0_0=(Token)match(input,38,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListTypeDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "type");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListTypeDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1343:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1344:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1344:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1345:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getListTypeDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListTypeDefinitionRule());
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
    // $ANTLR end "ruleListTypeDefinition"


    // $ANTLR start "entryRuleListColorDefinition"
    // InternalPdfMk.g:1365:1: entryRuleListColorDefinition returns [EObject current=null] : iv_ruleListColorDefinition= ruleListColorDefinition EOF ;
    public final EObject entryRuleListColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListColorDefinition = null;


        try {
            // InternalPdfMk.g:1365:60: (iv_ruleListColorDefinition= ruleListColorDefinition EOF )
            // InternalPdfMk.g:1366:2: iv_ruleListColorDefinition= ruleListColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getListColorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListColorDefinition=ruleListColorDefinition();

            state._fsp--;

             current =iv_ruleListColorDefinition; 
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
    // $ANTLR end "entryRuleListColorDefinition"


    // $ANTLR start "ruleListColorDefinition"
    // InternalPdfMk.g:1372:1: ruleListColorDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListColorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1378:2: ( ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1379:2: ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1379:2: ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1380:3: ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1380:3: ( (lv_key_0_0= 'color' ) )
            // InternalPdfMk.g:1381:4: (lv_key_0_0= 'color' )
            {
            // InternalPdfMk.g:1381:4: (lv_key_0_0= 'color' )
            // InternalPdfMk.g:1382:5: lv_key_0_0= 'color'
            {
            lv_key_0_0=(Token)match(input,39,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListColorDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "color");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListColorDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1398:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1399:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1399:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1400:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getListColorDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListColorDefinitionRule());
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
    // $ANTLR end "ruleListColorDefinition"


    // $ANTLR start "entryRuleListMarkerColorDefinition"
    // InternalPdfMk.g:1420:1: entryRuleListMarkerColorDefinition returns [EObject current=null] : iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF ;
    public final EObject entryRuleListMarkerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMarkerColorDefinition = null;


        try {
            // InternalPdfMk.g:1420:66: (iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF )
            // InternalPdfMk.g:1421:2: iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getListMarkerColorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListMarkerColorDefinition=ruleListMarkerColorDefinition();

            state._fsp--;

             current =iv_ruleListMarkerColorDefinition; 
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
    // $ANTLR end "entryRuleListMarkerColorDefinition"


    // $ANTLR start "ruleListMarkerColorDefinition"
    // InternalPdfMk.g:1427:1: ruleListMarkerColorDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListMarkerColorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1433:2: ( ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1434:2: ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1434:2: ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1435:3: ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1435:3: ( (lv_key_0_0= 'markerColor' ) )
            // InternalPdfMk.g:1436:4: (lv_key_0_0= 'markerColor' )
            {
            // InternalPdfMk.g:1436:4: (lv_key_0_0= 'markerColor' )
            // InternalPdfMk.g:1437:5: lv_key_0_0= 'markerColor'
            {
            lv_key_0_0=(Token)match(input,40,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListMarkerColorDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "markerColor");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListMarkerColorDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1453:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1454:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1454:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1455:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getListMarkerColorDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListMarkerColorDefinitionRule());
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
    // $ANTLR end "ruleListMarkerColorDefinition"


    // $ANTLR start "entryRuleTableCellItemElements"
    // InternalPdfMk.g:1475:1: entryRuleTableCellItemElements returns [EObject current=null] : iv_ruleTableCellItemElements= ruleTableCellItemElements EOF ;
    public final EObject entryRuleTableCellItemElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCellItemElements = null;


        try {
            // InternalPdfMk.g:1475:62: (iv_ruleTableCellItemElements= ruleTableCellItemElements EOF )
            // InternalPdfMk.g:1476:2: iv_ruleTableCellItemElements= ruleTableCellItemElements EOF
            {
             newCompositeNode(grammarAccess.getTableCellItemElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableCellItemElements=ruleTableCellItemElements();

            state._fsp--;

             current =iv_ruleTableCellItemElements; 
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
    // $ANTLR end "entryRuleTableCellItemElements"


    // $ANTLR start "ruleTableCellItemElements"
    // InternalPdfMk.g:1482:1: ruleTableCellItemElements returns [EObject current=null] : ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) ) ;
    public final EObject ruleTableCellItemElements() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_1 = null;

        EObject lv_elements_0_2 = null;

        EObject lv_elements_0_3 = null;

        EObject lv_elements_0_4 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1488:2: ( ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) ) )
            // InternalPdfMk.g:1489:2: ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) )
            {
            // InternalPdfMk.g:1489:2: ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) )
            // InternalPdfMk.g:1490:3: ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) )
            {
            // InternalPdfMk.g:1490:3: ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) )
            // InternalPdfMk.g:1491:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )
            {
            // InternalPdfMk.g:1491:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPdfMk.g:1492:5: lv_elements_0_1= ruleStringObject
                    {

                    					newCompositeNode(grammarAccess.getTableCellItemElementsAccess().getElementsStringObjectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_1=ruleStringObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableCellItemElementsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_0_1,
                    						"org.xtext.avi.PdfMk.StringObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1508:5: lv_elements_0_2= ruleTextObject
                    {

                    					newCompositeNode(grammarAccess.getTableCellItemElementsAccess().getElementsTextObjectParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_2=ruleTextObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableCellItemElementsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_0_2,
                    						"org.xtext.avi.PdfMk.TextObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1524:5: lv_elements_0_3= ruleImageObject
                    {

                    					newCompositeNode(grammarAccess.getTableCellItemElementsAccess().getElementsImageObjectParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_3=ruleImageObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableCellItemElementsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_0_3,
                    						"org.xtext.avi.PdfMk.ImageObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1540:5: lv_elements_0_4= ruleListObject
                    {

                    					newCompositeNode(grammarAccess.getTableCellItemElementsAccess().getElementsListObjectParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_4=ruleListObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableCellItemElementsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_0_4,
                    						"org.xtext.avi.PdfMk.ListObject");
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
    // $ANTLR end "ruleTableCellItemElements"


    // $ANTLR start "entryRuleTableRowDefinition"
    // InternalPdfMk.g:1561:1: entryRuleTableRowDefinition returns [EObject current=null] : iv_ruleTableRowDefinition= ruleTableRowDefinition EOF ;
    public final EObject entryRuleTableRowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRowDefinition = null;


        try {
            // InternalPdfMk.g:1561:59: (iv_ruleTableRowDefinition= ruleTableRowDefinition EOF )
            // InternalPdfMk.g:1562:2: iv_ruleTableRowDefinition= ruleTableRowDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableRowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableRowDefinition=ruleTableRowDefinition();

            state._fsp--;

             current =iv_ruleTableRowDefinition; 
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
    // $ANTLR end "entryRuleTableRowDefinition"


    // $ANTLR start "ruleTableRowDefinition"
    // InternalPdfMk.g:1568:1: ruleTableRowDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' ) ;
    public final EObject ruleTableRowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_item_1_0 = null;

        EObject lv_item_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1574:2: ( (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' ) )
            // InternalPdfMk.g:1575:2: (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' )
            {
            // InternalPdfMk.g:1575:2: (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' )
            // InternalPdfMk.g:1576:3: otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowDefinitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPdfMk.g:1580:3: ( (lv_item_1_0= ruleTableCellItemElements ) )
            // InternalPdfMk.g:1581:4: (lv_item_1_0= ruleTableCellItemElements )
            {
            // InternalPdfMk.g:1581:4: (lv_item_1_0= ruleTableCellItemElements )
            // InternalPdfMk.g:1582:5: lv_item_1_0= ruleTableCellItemElements
            {

            					newCompositeNode(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_item_1_0=ruleTableCellItemElements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRowDefinitionRule());
            					}
            					add(
            						current,
            						"item",
            						lv_item_1_0,
            						"org.xtext.avi.PdfMk.TableCellItemElements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPdfMk.g:1599:3: (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) )
            // InternalPdfMk.g:1600:4: otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) )
            {
            otherlv_2=(Token)match(input,15,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getTableRowDefinitionAccess().getCommaKeyword_2_0());
            			
            // InternalPdfMk.g:1604:4: ( (lv_item_3_0= ruleTableCellItemElements ) )
            // InternalPdfMk.g:1605:5: (lv_item_3_0= ruleTableCellItemElements )
            {
            // InternalPdfMk.g:1605:5: (lv_item_3_0= ruleTableCellItemElements )
            // InternalPdfMk.g:1606:6: lv_item_3_0= ruleTableCellItemElements
            {

            						newCompositeNode(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_21);
            lv_item_3_0=ruleTableCellItemElements();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTableRowDefinitionRule());
            						}
            						add(
            							current,
            							"item",
            							lv_item_3_0,
            							"org.xtext.avi.PdfMk.TableCellItemElements");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableRowDefinitionAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTableRowDefinition"


    // $ANTLR start "entryRuleTableBodyDefinition"
    // InternalPdfMk.g:1632:1: entryRuleTableBodyDefinition returns [EObject current=null] : iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF ;
    public final EObject entryRuleTableBodyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableBodyDefinition = null;


        try {
            // InternalPdfMk.g:1632:60: (iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF )
            // InternalPdfMk.g:1633:2: iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableBodyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableBodyDefinition=ruleTableBodyDefinition();

            state._fsp--;

             current =iv_ruleTableBodyDefinition; 
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
    // $ANTLR end "entryRuleTableBodyDefinition"


    // $ANTLR start "ruleTableBodyDefinition"
    // InternalPdfMk.g:1639:1: ruleTableBodyDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' ) ;
    public final EObject ruleTableBodyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rows_3_0 = null;

        EObject lv_rows_5_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1645:2: ( ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' ) )
            // InternalPdfMk.g:1646:2: ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' )
            {
            // InternalPdfMk.g:1646:2: ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' )
            // InternalPdfMk.g:1647:3: ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']'
            {
            // InternalPdfMk.g:1647:3: ( (lv_key_0_0= 'body' ) )
            // InternalPdfMk.g:1648:4: (lv_key_0_0= 'body' )
            {
            // InternalPdfMk.g:1648:4: (lv_key_0_0= 'body' )
            // InternalPdfMk.g:1649:5: lv_key_0_0= 'body'
            {
            lv_key_0_0=(Token)match(input,41,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableBodyDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "body");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTableBodyDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1665:3: ( (lv_value_2_0= '[' ) )
            // InternalPdfMk.g:1666:4: (lv_value_2_0= '[' )
            {
            // InternalPdfMk.g:1666:4: (lv_value_2_0= '[' )
            // InternalPdfMk.g:1667:5: lv_value_2_0= '['
            {
            lv_value_2_0=(Token)match(input,29,FOLLOW_18); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableBodyDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1679:3: ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* )
            // InternalPdfMk.g:1680:4: ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )*
            {
            // InternalPdfMk.g:1680:4: ( (lv_rows_3_0= ruleTableRowDefinition ) )
            // InternalPdfMk.g:1681:5: (lv_rows_3_0= ruleTableRowDefinition )
            {
            // InternalPdfMk.g:1681:5: (lv_rows_3_0= ruleTableRowDefinition )
            // InternalPdfMk.g:1682:6: lv_rows_3_0= ruleTableRowDefinition
            {

            						newCompositeNode(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_20);
            lv_rows_3_0=ruleTableRowDefinition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTableBodyDefinitionRule());
            						}
            						add(
            							current,
            							"rows",
            							lv_rows_3_0,
            							"org.xtext.avi.PdfMk.TableRowDefinition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPdfMk.g:1699:4: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPdfMk.g:1700:5: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_18); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTableBodyDefinitionAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:1704:5: ( (lv_rows_5_0= ruleTableRowDefinition ) )
            	    // InternalPdfMk.g:1705:6: (lv_rows_5_0= ruleTableRowDefinition )
            	    {
            	    // InternalPdfMk.g:1705:6: (lv_rows_5_0= ruleTableRowDefinition )
            	    // InternalPdfMk.g:1706:7: lv_rows_5_0= ruleTableRowDefinition
            	    {

            	    							newCompositeNode(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_rows_5_0=ruleTableRowDefinition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTableBodyDefinitionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"rows",
            	    								lv_rows_5_0,
            	    								"org.xtext.avi.PdfMk.TableRowDefinition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableBodyDefinitionAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTableBodyDefinition"


    // $ANTLR start "entryRuleTableDefinition"
    // InternalPdfMk.g:1733:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // InternalPdfMk.g:1733:56: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // InternalPdfMk.g:1734:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
             newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;

             current =iv_ruleTableDefinition; 
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
    // $ANTLR end "entryRuleTableDefinition"


    // $ANTLR start "ruleTableDefinition"
    // InternalPdfMk.g:1740:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1746:2: ( ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' ) )
            // InternalPdfMk.g:1747:2: ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:1747:2: ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' )
            // InternalPdfMk.g:1748:3: ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}'
            {
            // InternalPdfMk.g:1748:3: ( (lv_key_0_0= 'table' ) )
            // InternalPdfMk.g:1749:4: (lv_key_0_0= 'table' )
            {
            // InternalPdfMk.g:1749:4: (lv_key_0_0= 'table' )
            // InternalPdfMk.g:1750:5: lv_key_0_0= 'table'
            {
            lv_key_0_0=(Token)match(input,42,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "table");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1766:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:1767:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:1767:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:1768:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_23); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:1780:3: ( (lv_body_3_0= ruleTableBodyDefinition ) )
            // InternalPdfMk.g:1781:4: (lv_body_3_0= ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:1781:4: (lv_body_3_0= ruleTableBodyDefinition )
            // InternalPdfMk.g:1782:5: lv_body_3_0= ruleTableBodyDefinition
            {

            					newCompositeNode(grammarAccess.getTableDefinitionAccess().getBodyTableBodyDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_body_3_0=ruleTableBodyDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableDefinitionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.xtext.avi.PdfMk.TableBodyDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleTextObjectMembersWrapper"
    // InternalPdfMk.g:1807:1: entryRuleTextObjectMembersWrapper returns [EObject current=null] : iv_ruleTextObjectMembersWrapper= ruleTextObjectMembersWrapper EOF ;
    public final EObject entryRuleTextObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:1807:65: (iv_ruleTextObjectMembersWrapper= ruleTextObjectMembersWrapper EOF )
            // InternalPdfMk.g:1808:2: iv_ruleTextObjectMembersWrapper= ruleTextObjectMembersWrapper EOF
            {
             newCompositeNode(grammarAccess.getTextObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextObjectMembersWrapper=ruleTextObjectMembersWrapper();

            state._fsp--;

             current =iv_ruleTextObjectMembersWrapper; 
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
    // $ANTLR end "entryRuleTextObjectMembersWrapper"


    // $ANTLR start "ruleTextObjectMembersWrapper"
    // InternalPdfMk.g:1814:1: ruleTextObjectMembersWrapper returns [EObject current=null] : (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition ) ;
    public final EObject ruleTextObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject this_TextDefinition_0 = null;

        EObject this_TextStyleDefinition_1 = null;

        EObject this_FontSizeDefinition_2 = null;

        EObject this_TextAlignmentDefinition_3 = null;

        EObject this_TypeFaceDefinition_4 = null;

        EObject this_ItalicsDefinition_5 = null;

        EObject this_WidthDefinition_6 = null;

        EObject this_MarginDefinition_7 = null;

        EObject this_ListCounterDefinition_8 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1820:2: ( (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition ) )
            // InternalPdfMk.g:1821:2: (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition )
            {
            // InternalPdfMk.g:1821:2: (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 17:
                {
                alt10=5;
                }
                break;
            case 24:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            case 28:
                {
                alt10=8;
                }
                break;
            case 37:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPdfMk.g:1822:3: this_TextDefinition_0= ruleTextDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getTextDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextDefinition_0=ruleTextDefinition();

                    state._fsp--;


                    			current = this_TextDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1831:3: this_TextStyleDefinition_1= ruleTextStyleDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getTextStyleDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextStyleDefinition_1=ruleTextStyleDefinition();

                    state._fsp--;


                    			current = this_TextStyleDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1840:3: this_FontSizeDefinition_2= ruleFontSizeDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getFontSizeDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FontSizeDefinition_2=ruleFontSizeDefinition();

                    state._fsp--;


                    			current = this_FontSizeDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1849:3: this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getTextAlignmentDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextAlignmentDefinition_3=ruleTextAlignmentDefinition();

                    state._fsp--;


                    			current = this_TextAlignmentDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1858:3: this_TypeFaceDefinition_4= ruleTypeFaceDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getTypeFaceDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeFaceDefinition_4=ruleTypeFaceDefinition();

                    state._fsp--;


                    			current = this_TypeFaceDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPdfMk.g:1867:3: this_ItalicsDefinition_5= ruleItalicsDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getItalicsDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItalicsDefinition_5=ruleItalicsDefinition();

                    state._fsp--;


                    			current = this_ItalicsDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPdfMk.g:1876:3: this_WidthDefinition_6= ruleWidthDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getWidthDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidthDefinition_6=ruleWidthDefinition();

                    state._fsp--;


                    			current = this_WidthDefinition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPdfMk.g:1885:3: this_MarginDefinition_7= ruleMarginDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getMarginDefinitionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarginDefinition_7=ruleMarginDefinition();

                    state._fsp--;


                    			current = this_MarginDefinition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPdfMk.g:1894:3: this_ListCounterDefinition_8= ruleListCounterDefinition
                    {

                    			newCompositeNode(grammarAccess.getTextObjectMembersWrapperAccess().getListCounterDefinitionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListCounterDefinition_8=ruleListCounterDefinition();

                    state._fsp--;


                    			current = this_ListCounterDefinition_8;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTextObjectMembersWrapper"


    // $ANTLR start "entryRuleStyleObjectMembersWrapper"
    // InternalPdfMk.g:1906:1: entryRuleStyleObjectMembersWrapper returns [EObject current=null] : iv_ruleStyleObjectMembersWrapper= ruleStyleObjectMembersWrapper EOF ;
    public final EObject entryRuleStyleObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:1906:66: (iv_ruleStyleObjectMembersWrapper= ruleStyleObjectMembersWrapper EOF )
            // InternalPdfMk.g:1907:2: iv_ruleStyleObjectMembersWrapper= ruleStyleObjectMembersWrapper EOF
            {
             newCompositeNode(grammarAccess.getStyleObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleObjectMembersWrapper=ruleStyleObjectMembersWrapper();

            state._fsp--;

             current =iv_ruleStyleObjectMembersWrapper; 
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
    // $ANTLR end "entryRuleStyleObjectMembersWrapper"


    // $ANTLR start "ruleStyleObjectMembersWrapper"
    // InternalPdfMk.g:1913:1: ruleStyleObjectMembersWrapper returns [EObject current=null] : (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition ) ;
    public final EObject ruleStyleObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject this_FontSizeDefinition_0 = null;

        EObject this_TypeFaceDefinition_1 = null;

        EObject this_TextAlignmentDefinition_2 = null;

        EObject this_ItalicsDefinition_3 = null;

        EObject this_MarginDefinition_4 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1919:2: ( (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition ) )
            // InternalPdfMk.g:1920:2: (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition )
            {
            // InternalPdfMk.g:1920:2: (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:1921:3: this_FontSizeDefinition_0= ruleFontSizeDefinition
                    {

                    			newCompositeNode(grammarAccess.getStyleObjectMembersWrapperAccess().getFontSizeDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FontSizeDefinition_0=ruleFontSizeDefinition();

                    state._fsp--;


                    			current = this_FontSizeDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1930:3: this_TypeFaceDefinition_1= ruleTypeFaceDefinition
                    {

                    			newCompositeNode(grammarAccess.getStyleObjectMembersWrapperAccess().getTypeFaceDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeFaceDefinition_1=ruleTypeFaceDefinition();

                    state._fsp--;


                    			current = this_TypeFaceDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:1939:3: this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition
                    {

                    			newCompositeNode(grammarAccess.getStyleObjectMembersWrapperAccess().getTextAlignmentDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextAlignmentDefinition_2=ruleTextAlignmentDefinition();

                    state._fsp--;


                    			current = this_TextAlignmentDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:1948:3: this_ItalicsDefinition_3= ruleItalicsDefinition
                    {

                    			newCompositeNode(grammarAccess.getStyleObjectMembersWrapperAccess().getItalicsDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItalicsDefinition_3=ruleItalicsDefinition();

                    state._fsp--;


                    			current = this_ItalicsDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:1957:3: this_MarginDefinition_4= ruleMarginDefinition
                    {

                    			newCompositeNode(grammarAccess.getStyleObjectMembersWrapperAccess().getMarginDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarginDefinition_4=ruleMarginDefinition();

                    state._fsp--;


                    			current = this_MarginDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleStyleObjectMembersWrapper"


    // $ANTLR start "entryRuleImageObjectMembersWrapper"
    // InternalPdfMk.g:1969:1: entryRuleImageObjectMembersWrapper returns [EObject current=null] : iv_ruleImageObjectMembersWrapper= ruleImageObjectMembersWrapper EOF ;
    public final EObject entryRuleImageObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:1969:66: (iv_ruleImageObjectMembersWrapper= ruleImageObjectMembersWrapper EOF )
            // InternalPdfMk.g:1970:2: iv_ruleImageObjectMembersWrapper= ruleImageObjectMembersWrapper EOF
            {
             newCompositeNode(grammarAccess.getImageObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageObjectMembersWrapper=ruleImageObjectMembersWrapper();

            state._fsp--;

             current =iv_ruleImageObjectMembersWrapper; 
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
    // $ANTLR end "entryRuleImageObjectMembersWrapper"


    // $ANTLR start "ruleImageObjectMembersWrapper"
    // InternalPdfMk.g:1976:1: ruleImageObjectMembersWrapper returns [EObject current=null] : (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition ) ;
    public final EObject ruleImageObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject this_ImageDefintion_0 = null;

        EObject this_ImageWidthDefintion_1 = null;

        EObject this_ImageHeightDefintion_2 = null;

        EObject this_ImageOpacityDefinition_3 = null;

        EObject this_ImageFitDefinition_4 = null;

        EObject this_ImagePageBreakDefinition_5 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1982:2: ( (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition ) )
            // InternalPdfMk.g:1983:2: (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition )
            {
            // InternalPdfMk.g:1983:2: (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            case 34:
                {
                alt12=5;
                }
                break;
            case 33:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:1984:3: this_ImageDefintion_0= ruleImageDefintion
                    {

                    			newCompositeNode(grammarAccess.getImageObjectMembersWrapperAccess().getImageDefintionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageDefintion_0=ruleImageDefintion();

                    state._fsp--;


                    			current = this_ImageDefintion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:1993:3: this_ImageWidthDefintion_1= ruleImageWidthDefintion
                    {

                    			newCompositeNode(grammarAccess.getImageObjectMembersWrapperAccess().getImageWidthDefintionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageWidthDefintion_1=ruleImageWidthDefintion();

                    state._fsp--;


                    			current = this_ImageWidthDefintion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:2002:3: this_ImageHeightDefintion_2= ruleImageHeightDefintion
                    {

                    			newCompositeNode(grammarAccess.getImageObjectMembersWrapperAccess().getImageHeightDefintionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageHeightDefintion_2=ruleImageHeightDefintion();

                    state._fsp--;


                    			current = this_ImageHeightDefintion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:2011:3: this_ImageOpacityDefinition_3= ruleImageOpacityDefinition
                    {

                    			newCompositeNode(grammarAccess.getImageObjectMembersWrapperAccess().getImageOpacityDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageOpacityDefinition_3=ruleImageOpacityDefinition();

                    state._fsp--;


                    			current = this_ImageOpacityDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:2020:3: this_ImageFitDefinition_4= ruleImageFitDefinition
                    {

                    			newCompositeNode(grammarAccess.getImageObjectMembersWrapperAccess().getImageFitDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageFitDefinition_4=ruleImageFitDefinition();

                    state._fsp--;


                    			current = this_ImageFitDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPdfMk.g:2029:3: this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition
                    {

                    			newCompositeNode(grammarAccess.getImageObjectMembersWrapperAccess().getImagePageBreakDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImagePageBreakDefinition_5=ruleImagePageBreakDefinition();

                    state._fsp--;


                    			current = this_ImagePageBreakDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleImageObjectMembersWrapper"


    // $ANTLR start "entryRuleInnerColumnObjectMembersWrapper"
    // InternalPdfMk.g:2041:1: entryRuleInnerColumnObjectMembersWrapper returns [EObject current=null] : iv_ruleInnerColumnObjectMembersWrapper= ruleInnerColumnObjectMembersWrapper EOF ;
    public final EObject entryRuleInnerColumnObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerColumnObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:2041:72: (iv_ruleInnerColumnObjectMembersWrapper= ruleInnerColumnObjectMembersWrapper EOF )
            // InternalPdfMk.g:2042:2: iv_ruleInnerColumnObjectMembersWrapper= ruleInnerColumnObjectMembersWrapper EOF
            {
             newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerColumnObjectMembersWrapper=ruleInnerColumnObjectMembersWrapper();

            state._fsp--;

             current =iv_ruleInnerColumnObjectMembersWrapper; 
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
    // $ANTLR end "entryRuleInnerColumnObjectMembersWrapper"


    // $ANTLR start "ruleInnerColumnObjectMembersWrapper"
    // InternalPdfMk.g:2048:1: ruleInnerColumnObjectMembersWrapper returns [EObject current=null] : ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) ) ;
    public final EObject ruleInnerColumnObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_text_0_0 = null;

        EObject lv_text_2_0 = null;

        EObject lv_textObject_3_0 = null;

        EObject lv_textObject_5_0 = null;

        EObject lv_column_6_0 = null;

        EObject lv_column_8_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2054:2: ( ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) ) )
            // InternalPdfMk.g:2055:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) )
            {
            // InternalPdfMk.g:2055:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:2056:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    {
                    // InternalPdfMk.g:2056:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    // InternalPdfMk.g:2057:4: ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    {
                    // InternalPdfMk.g:2057:4: ( (lv_text_0_0= ruleStringObject ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPdfMk.g:2058:5: (lv_text_0_0= ruleStringObject )
                            {
                            // InternalPdfMk.g:2058:5: (lv_text_0_0= ruleStringObject )
                            // InternalPdfMk.g:2059:6: lv_text_0_0= ruleStringObject
                            {

                            						newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_text_0_0=ruleStringObject();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInnerColumnObjectMembersWrapperRule());
                            						}
                            						add(
                            							current,
                            							"text",
                            							lv_text_0_0,
                            							"org.xtext.avi.PdfMk.StringObject");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalPdfMk.g:2076:4: (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPdfMk.g:2077:5: otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) )
                    	    {
                    	    otherlv_1=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalPdfMk.g:2081:5: ( (lv_text_2_0= ruleStringObject ) )
                    	    // InternalPdfMk.g:2082:6: (lv_text_2_0= ruleStringObject )
                    	    {
                    	    // InternalPdfMk.g:2082:6: (lv_text_2_0= ruleStringObject )
                    	    // InternalPdfMk.g:2083:7: lv_text_2_0= ruleStringObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_text_2_0=ruleStringObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInnerColumnObjectMembersWrapperRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"text",
                    	    								lv_text_2_0,
                    	    								"org.xtext.avi.PdfMk.StringObject");
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
                    break;
                case 2 :
                    // InternalPdfMk.g:2103:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    {
                    // InternalPdfMk.g:2103:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    // InternalPdfMk.g:2104:4: ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    {
                    // InternalPdfMk.g:2104:4: ( (lv_textObject_3_0= ruleTextObject ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==14) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPdfMk.g:2105:5: (lv_textObject_3_0= ruleTextObject )
                            {
                            // InternalPdfMk.g:2105:5: (lv_textObject_3_0= ruleTextObject )
                            // InternalPdfMk.g:2106:6: lv_textObject_3_0= ruleTextObject
                            {

                            						newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_textObject_3_0=ruleTextObject();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInnerColumnObjectMembersWrapperRule());
                            						}
                            						add(
                            							current,
                            							"textObject",
                            							lv_textObject_3_0,
                            							"org.xtext.avi.PdfMk.TextObject");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalPdfMk.g:2123:4: (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPdfMk.g:2124:5: otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPdfMk.g:2128:5: ( (lv_textObject_5_0= ruleTextObject ) )
                    	    // InternalPdfMk.g:2129:6: (lv_textObject_5_0= ruleTextObject )
                    	    {
                    	    // InternalPdfMk.g:2129:6: (lv_textObject_5_0= ruleTextObject )
                    	    // InternalPdfMk.g:2130:7: lv_textObject_5_0= ruleTextObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_textObject_5_0=ruleTextObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInnerColumnObjectMembersWrapperRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"textObject",
                    	    								lv_textObject_5_0,
                    	    								"org.xtext.avi.PdfMk.TextObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:2150:3: ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* )
                    {
                    // InternalPdfMk.g:2150:3: ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* )
                    // InternalPdfMk.g:2151:4: ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )*
                    {
                    // InternalPdfMk.g:2151:4: ( (lv_column_6_0= ruleColumnDefinition ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==14) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPdfMk.g:2152:5: (lv_column_6_0= ruleColumnDefinition )
                            {
                            // InternalPdfMk.g:2152:5: (lv_column_6_0= ruleColumnDefinition )
                            // InternalPdfMk.g:2153:6: lv_column_6_0= ruleColumnDefinition
                            {

                            						newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_column_6_0=ruleColumnDefinition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInnerColumnObjectMembersWrapperRule());
                            						}
                            						add(
                            							current,
                            							"column",
                            							lv_column_6_0,
                            							"org.xtext.avi.PdfMk.ColumnDefinition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalPdfMk.g:2170:4: (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalPdfMk.g:2171:5: otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPdfMk.g:2175:5: ( (lv_column_8_0= ruleColumnDefinition ) )
                    	    // InternalPdfMk.g:2176:6: (lv_column_8_0= ruleColumnDefinition )
                    	    {
                    	    // InternalPdfMk.g:2176:6: (lv_column_8_0= ruleColumnDefinition )
                    	    // InternalPdfMk.g:2177:7: lv_column_8_0= ruleColumnDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_column_8_0=ruleColumnDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInnerColumnObjectMembersWrapperRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"column",
                    	    								lv_column_8_0,
                    	    								"org.xtext.avi.PdfMk.ColumnDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


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
    // $ANTLR end "ruleInnerColumnObjectMembersWrapper"


    // $ANTLR start "entryRuleColumnObjectMembersWrapper"
    // InternalPdfMk.g:2200:1: entryRuleColumnObjectMembersWrapper returns [EObject current=null] : iv_ruleColumnObjectMembersWrapper= ruleColumnObjectMembersWrapper EOF ;
    public final EObject entryRuleColumnObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:2200:67: (iv_ruleColumnObjectMembersWrapper= ruleColumnObjectMembersWrapper EOF )
            // InternalPdfMk.g:2201:2: iv_ruleColumnObjectMembersWrapper= ruleColumnObjectMembersWrapper EOF
            {
             newCompositeNode(grammarAccess.getColumnObjectMembersWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnObjectMembersWrapper=ruleColumnObjectMembersWrapper();

            state._fsp--;

             current =iv_ruleColumnObjectMembersWrapper; 
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
    // $ANTLR end "entryRuleColumnObjectMembersWrapper"


    // $ANTLR start "ruleColumnObjectMembersWrapper"
    // InternalPdfMk.g:2207:1: ruleColumnObjectMembersWrapper returns [EObject current=null] : ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) ) ;
    public final EObject ruleColumnObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_text_0_0 = null;

        EObject lv_text_2_0 = null;

        EObject lv_textObject_3_0 = null;

        EObject lv_textObject_5_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2213:2: ( ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) ) )
            // InternalPdfMk.g:2214:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) )
            {
            // InternalPdfMk.g:2214:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) )
            int alt24=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case 15:
                {
                alt24=1;
                }
                break;
            case EOF:
                {
                alt24=1;
                }
                break;
            case 30:
                {
                alt24=1;
                }
                break;
            case 14:
                {
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPdfMk.g:2215:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    {
                    // InternalPdfMk.g:2215:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    // InternalPdfMk.g:2216:4: ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    {
                    // InternalPdfMk.g:2216:4: ( (lv_text_0_0= ruleStringObject ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_STRING) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalPdfMk.g:2217:5: (lv_text_0_0= ruleStringObject )
                            {
                            // InternalPdfMk.g:2217:5: (lv_text_0_0= ruleStringObject )
                            // InternalPdfMk.g:2218:6: lv_text_0_0= ruleStringObject
                            {

                            						newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_text_0_0=ruleStringObject();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getColumnObjectMembersWrapperRule());
                            						}
                            						add(
                            							current,
                            							"text",
                            							lv_text_0_0,
                            							"org.xtext.avi.PdfMk.StringObject");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalPdfMk.g:2235:4: (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==RULE_STRING) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPdfMk.g:2236:5: otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) )
                    	    {
                    	    otherlv_1=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalPdfMk.g:2240:5: ( (lv_text_2_0= ruleStringObject ) )
                    	    // InternalPdfMk.g:2241:6: (lv_text_2_0= ruleStringObject )
                    	    {
                    	    // InternalPdfMk.g:2241:6: (lv_text_2_0= ruleStringObject )
                    	    // InternalPdfMk.g:2242:7: lv_text_2_0= ruleStringObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_text_2_0=ruleStringObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnObjectMembersWrapperRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"text",
                    	    								lv_text_2_0,
                    	    								"org.xtext.avi.PdfMk.StringObject");
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


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:2262:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    {
                    // InternalPdfMk.g:2262:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    // InternalPdfMk.g:2263:4: ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    {
                    // InternalPdfMk.g:2263:4: ( (lv_textObject_3_0= ruleTextObject ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==14) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalPdfMk.g:2264:5: (lv_textObject_3_0= ruleTextObject )
                            {
                            // InternalPdfMk.g:2264:5: (lv_textObject_3_0= ruleTextObject )
                            // InternalPdfMk.g:2265:6: lv_textObject_3_0= ruleTextObject
                            {

                            						newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_textObject_3_0=ruleTextObject();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getColumnObjectMembersWrapperRule());
                            						}
                            						add(
                            							current,
                            							"textObject",
                            							lv_textObject_3_0,
                            							"org.xtext.avi.PdfMk.TextObject");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalPdfMk.g:2282:4: (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        alt23 = dfa23.predict(input);
                        switch (alt23) {
                    	case 1 :
                    	    // InternalPdfMk.g:2283:5: otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPdfMk.g:2287:5: ( (lv_textObject_5_0= ruleTextObject ) )
                    	    // InternalPdfMk.g:2288:6: (lv_textObject_5_0= ruleTextObject )
                    	    {
                    	    // InternalPdfMk.g:2288:6: (lv_textObject_5_0= ruleTextObject )
                    	    // InternalPdfMk.g:2289:7: lv_textObject_5_0= ruleTextObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_textObject_5_0=ruleTextObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnObjectMembersWrapperRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"textObject",
                    	    								lv_textObject_5_0,
                    	    								"org.xtext.avi.PdfMk.TextObject");
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
    // $ANTLR end "ruleColumnObjectMembersWrapper"


    // $ANTLR start "entryRuleListObjectPropertiesWrapper"
    // InternalPdfMk.g:2312:1: entryRuleListObjectPropertiesWrapper returns [EObject current=null] : iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF ;
    public final EObject entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListObjectPropertiesWrapper = null;


        try {
            // InternalPdfMk.g:2312:68: (iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:2313:2: iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF
            {
             newCompositeNode(grammarAccess.getListObjectPropertiesWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListObjectPropertiesWrapper=ruleListObjectPropertiesWrapper();

            state._fsp--;

             current =iv_ruleListObjectPropertiesWrapper; 
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
    // $ANTLR end "entryRuleListObjectPropertiesWrapper"


    // $ANTLR start "ruleListObjectPropertiesWrapper"
    // InternalPdfMk.g:2319:1: ruleListObjectPropertiesWrapper returns [EObject current=null] : ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) ) ;
    public final EObject ruleListObjectPropertiesWrapper() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;

        EObject lv_value_0_3 = null;

        EObject lv_value_0_4 = null;

        EObject lv_value_0_5 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2325:2: ( ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) ) )
            // InternalPdfMk.g:2326:2: ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) )
            {
            // InternalPdfMk.g:2326:2: ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) )
            // InternalPdfMk.g:2327:3: ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) )
            {
            // InternalPdfMk.g:2327:3: ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) )
            // InternalPdfMk.g:2328:4: (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition )
            {
            // InternalPdfMk.g:2328:4: (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            case 39:
                {
                alt25=4;
                }
                break;
            case 40:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:2329:5: lv_value_0_1= ruleListReversedDefinition
                    {

                    					newCompositeNode(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListReversedDefinitionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=ruleListReversedDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListObjectPropertiesWrapperRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.xtext.avi.PdfMk.ListReversedDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:2345:5: lv_value_0_2= ruleListCounterDefinition
                    {

                    					newCompositeNode(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListCounterDefinitionParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleListCounterDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListObjectPropertiesWrapperRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.xtext.avi.PdfMk.ListCounterDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:2361:5: lv_value_0_3= ruleListTypeDefinition
                    {

                    					newCompositeNode(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListTypeDefinitionParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_3=ruleListTypeDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListObjectPropertiesWrapperRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_3,
                    						"org.xtext.avi.PdfMk.ListTypeDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalPdfMk.g:2377:5: lv_value_0_4= ruleListColorDefinition
                    {

                    					newCompositeNode(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListColorDefinitionParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_4=ruleListColorDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListObjectPropertiesWrapperRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_4,
                    						"org.xtext.avi.PdfMk.ListColorDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalPdfMk.g:2393:5: lv_value_0_5= ruleListMarkerColorDefinition
                    {

                    					newCompositeNode(grammarAccess.getListObjectPropertiesWrapperAccess().getValueListMarkerColorDefinitionParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_5=ruleListMarkerColorDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListObjectPropertiesWrapperRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_5,
                    						"org.xtext.avi.PdfMk.ListMarkerColorDefinition");
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
    // $ANTLR end "ruleListObjectPropertiesWrapper"


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:2414:1: entryRuleTextObject returns [EObject current=null] : iv_ruleTextObject= ruleTextObject EOF ;
    public final EObject entryRuleTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObject = null;


        try {
            // InternalPdfMk.g:2414:51: (iv_ruleTextObject= ruleTextObject EOF )
            // InternalPdfMk.g:2415:2: iv_ruleTextObject= ruleTextObject EOF
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
    // InternalPdfMk.g:2421:1: ruleTextObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleTextObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2427:2: ( (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2428:2: (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2428:2: (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2429:3: otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTextObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:2433:3: ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2434:4: ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2434:4: ( (lv_members_1_0= ruleTextObjectMembersWrapper ) )
            // InternalPdfMk.g:2435:5: (lv_members_1_0= ruleTextObjectMembersWrapper )
            {
            // InternalPdfMk.g:2435:5: (lv_members_1_0= ruleTextObjectMembersWrapper )
            // InternalPdfMk.g:2436:6: lv_members_1_0= ruleTextObjectMembersWrapper
            {

            						newCompositeNode(grammarAccess.getTextObjectAccess().getMembersTextObjectMembersWrapperParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_members_1_0=ruleTextObjectMembersWrapper();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTextObjectRule());
            						}
            						add(
            							current,
            							"members",
            							lv_members_1_0,
            							"org.xtext.avi.PdfMk.TextObjectMembersWrapper");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPdfMk.g:2453:4: (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPdfMk.g:2454:5: otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_25); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTextObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2458:5: ( (lv_members_3_0= ruleTextObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2459:6: (lv_members_3_0= ruleTextObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2459:6: (lv_members_3_0= ruleTextObjectMembersWrapper )
            	    // InternalPdfMk.g:2460:7: lv_members_3_0= ruleTextObjectMembersWrapper
            	    {

            	    							newCompositeNode(grammarAccess.getTextObjectAccess().getMembersTextObjectMembersWrapperParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_members_3_0=ruleTextObjectMembersWrapper();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTextObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"members",
            	    								lv_members_3_0,
            	    								"org.xtext.avi.PdfMk.TextObjectMembersWrapper");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalPdfMk.g:2487:1: entryRuleColumnTextObject returns [EObject current=null] : iv_ruleColumnTextObject= ruleColumnTextObject EOF ;
    public final EObject entryRuleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTextObject = null;


        try {
            // InternalPdfMk.g:2487:57: (iv_ruleColumnTextObject= ruleColumnTextObject EOF )
            // InternalPdfMk.g:2488:2: iv_ruleColumnTextObject= ruleColumnTextObject EOF
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
    // InternalPdfMk.g:2494:1: ruleColumnTextObject returns [EObject current=null] : ( (lv_value_0_0= ruleColumnDefinition ) ) ;
    public final EObject ruleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2500:2: ( ( (lv_value_0_0= ruleColumnDefinition ) ) )
            // InternalPdfMk.g:2501:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            {
            // InternalPdfMk.g:2501:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            // InternalPdfMk.g:2502:3: (lv_value_0_0= ruleColumnDefinition )
            {
            // InternalPdfMk.g:2502:3: (lv_value_0_0= ruleColumnDefinition )
            // InternalPdfMk.g:2503:4: lv_value_0_0= ruleColumnDefinition
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
    // InternalPdfMk.g:2523:1: entryRuleStyleObject returns [EObject current=null] : iv_ruleStyleObject= ruleStyleObject EOF ;
    public final EObject entryRuleStyleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObject = null;


        try {
            // InternalPdfMk.g:2523:52: (iv_ruleStyleObject= ruleStyleObject EOF )
            // InternalPdfMk.g:2524:2: iv_ruleStyleObject= ruleStyleObject EOF
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
    // InternalPdfMk.g:2530:1: ruleStyleObject returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleStyleObject() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2536:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' ) )
            // InternalPdfMk.g:2537:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' )
            {
            // InternalPdfMk.g:2537:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' )
            // InternalPdfMk.g:2538:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}'
            {
            // InternalPdfMk.g:2538:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalPdfMk.g:2539:4: (lv_key_0_0= RULE_ID )
            {
            // InternalPdfMk.g:2539:4: (lv_key_0_0= RULE_ID )
            // InternalPdfMk.g:2540:5: lv_key_0_0= RULE_ID
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
            		
            // InternalPdfMk.g:2560:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:2561:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:2561:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:2562:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_26); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2574:3: ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2575:4: ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2575:4: ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) )
            // InternalPdfMk.g:2576:5: (lv_members_3_0= ruleStyleObjectMembersWrapper )
            {
            // InternalPdfMk.g:2576:5: (lv_members_3_0= ruleStyleObjectMembersWrapper )
            // InternalPdfMk.g:2577:6: lv_members_3_0= ruleStyleObjectMembersWrapper
            {

            						newCompositeNode(grammarAccess.getStyleObjectAccess().getMembersStyleObjectMembersWrapperParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_members_3_0=ruleStyleObjectMembersWrapper();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStyleObjectRule());
            						}
            						add(
            							current,
            							"members",
            							lv_members_3_0,
            							"org.xtext.avi.PdfMk.StyleObjectMembersWrapper");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPdfMk.g:2594:4: (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPdfMk.g:2595:5: otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_26); 

            	    					newLeafNode(otherlv_4, grammarAccess.getStyleObjectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:2599:5: ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2600:6: (lv_members_5_0= ruleStyleObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2600:6: (lv_members_5_0= ruleStyleObjectMembersWrapper )
            	    // InternalPdfMk.g:2601:7: lv_members_5_0= ruleStyleObjectMembersWrapper
            	    {

            	    							newCompositeNode(grammarAccess.getStyleObjectAccess().getMembersStyleObjectMembersWrapperParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_members_5_0=ruleStyleObjectMembersWrapper();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStyleObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"members",
            	    								lv_members_5_0,
            	    								"org.xtext.avi.PdfMk.StyleObjectMembersWrapper");
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStyleObjectAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalPdfMk.g:2628:1: entryRuleStyleObjects returns [EObject current=null] : iv_ruleStyleObjects= ruleStyleObjects EOF ;
    public final EObject entryRuleStyleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjects = null;


        try {
            // InternalPdfMk.g:2628:53: (iv_ruleStyleObjects= ruleStyleObjects EOF )
            // InternalPdfMk.g:2629:2: iv_ruleStyleObjects= ruleStyleObjects EOF
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
    // InternalPdfMk.g:2635:1: ruleStyleObjects returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleStyleObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2641:2: ( (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2642:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2642:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2643:3: otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:2647:3: ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* )
            // InternalPdfMk.g:2648:4: ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            {
            // InternalPdfMk.g:2648:4: ( (lv_value_1_0= ruleStyleObject ) )
            // InternalPdfMk.g:2649:5: (lv_value_1_0= ruleStyleObject )
            {
            // InternalPdfMk.g:2649:5: (lv_value_1_0= ruleStyleObject )
            // InternalPdfMk.g:2650:6: lv_value_1_0= ruleStyleObject
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

            // InternalPdfMk.g:2667:4: (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPdfMk.g:2668:5: otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_27); 

            	    					newLeafNode(otherlv_2, grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2672:5: ( (lv_value_3_0= ruleStyleObject ) )
            	    // InternalPdfMk.g:2673:6: (lv_value_3_0= ruleStyleObject )
            	    {
            	    // InternalPdfMk.g:2673:6: (lv_value_3_0= ruleStyleObject )
            	    // InternalPdfMk.g:2674:7: lv_value_3_0= ruleStyleObject
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
            	    break loop28;
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


    // $ANTLR start "entryRuleImageObject"
    // InternalPdfMk.g:2701:1: entryRuleImageObject returns [EObject current=null] : iv_ruleImageObject= ruleImageObject EOF ;
    public final EObject entryRuleImageObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageObject = null;


        try {
            // InternalPdfMk.g:2701:52: (iv_ruleImageObject= ruleImageObject EOF )
            // InternalPdfMk.g:2702:2: iv_ruleImageObject= ruleImageObject EOF
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
    // InternalPdfMk.g:2708:1: ruleImageObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleImageObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2714:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2715:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2715:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2716:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}'
            {
            // InternalPdfMk.g:2716:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:2717:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:2717:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:2718:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_28); 

            					newLeafNode(lv_value_0_0, grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2730:3: ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2731:4: ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2731:4: ( (lv_members_1_0= ruleImageObjectMembersWrapper ) )
            // InternalPdfMk.g:2732:5: (lv_members_1_0= ruleImageObjectMembersWrapper )
            {
            // InternalPdfMk.g:2732:5: (lv_members_1_0= ruleImageObjectMembersWrapper )
            // InternalPdfMk.g:2733:6: lv_members_1_0= ruleImageObjectMembersWrapper
            {

            						newCompositeNode(grammarAccess.getImageObjectAccess().getMembersImageObjectMembersWrapperParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_members_1_0=ruleImageObjectMembersWrapper();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getImageObjectRule());
            						}
            						add(
            							current,
            							"members",
            							lv_members_1_0,
            							"org.xtext.avi.PdfMk.ImageObjectMembersWrapper");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPdfMk.g:2750:4: (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPdfMk.g:2751:5: otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_28); 

            	    					newLeafNode(otherlv_2, grammarAccess.getImageObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2755:5: ( (lv_members_3_0= ruleImageObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2756:6: (lv_members_3_0= ruleImageObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2756:6: (lv_members_3_0= ruleImageObjectMembersWrapper )
            	    // InternalPdfMk.g:2757:7: lv_members_3_0= ruleImageObjectMembersWrapper
            	    {

            	    							newCompositeNode(grammarAccess.getImageObjectAccess().getMembersImageObjectMembersWrapperParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_members_3_0=ruleImageObjectMembersWrapper();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getImageObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"members",
            	    								lv_members_3_0,
            	    								"org.xtext.avi.PdfMk.ImageObjectMembersWrapper");
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImageObjectAccess().getRightCurlyBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleColumnObject"
    // InternalPdfMk.g:2784:1: entryRuleColumnObject returns [EObject current=null] : iv_ruleColumnObject= ruleColumnObject EOF ;
    public final EObject entryRuleColumnObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnObject = null;


        try {
            // InternalPdfMk.g:2784:53: (iv_ruleColumnObject= ruleColumnObject EOF )
            // InternalPdfMk.g:2785:2: iv_ruleColumnObject= ruleColumnObject EOF
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
    // InternalPdfMk.g:2791:1: ruleColumnObject returns [EObject current=null] : ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' ) ;
    public final EObject ruleColumnObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2797:2: ( ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' ) )
            // InternalPdfMk.g:2798:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' )
            {
            // InternalPdfMk.g:2798:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' )
            // InternalPdfMk.g:2799:3: ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']'
            {
            // InternalPdfMk.g:2799:3: ( (lv_value_0_0= '[' ) )
            // InternalPdfMk.g:2800:4: (lv_value_0_0= '[' )
            {
            // InternalPdfMk.g:2800:4: (lv_value_0_0= '[' )
            // InternalPdfMk.g:2801:5: lv_value_0_0= '['
            {
            lv_value_0_0=(Token)match(input,29,FOLLOW_29); 

            					newLeafNode(lv_value_0_0, grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "[");
            				

            }


            }

            // InternalPdfMk.g:2813:3: ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2814:4: ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2814:4: ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) )
            // InternalPdfMk.g:2815:5: (lv_members_1_0= ruleColumnObjectMembersWrapper )
            {
            // InternalPdfMk.g:2815:5: (lv_members_1_0= ruleColumnObjectMembersWrapper )
            // InternalPdfMk.g:2816:6: lv_members_1_0= ruleColumnObjectMembersWrapper
            {

            						newCompositeNode(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_20);
            lv_members_1_0=ruleColumnObjectMembersWrapper();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getColumnObjectRule());
            						}
            						add(
            							current,
            							"members",
            							lv_members_1_0,
            							"org.xtext.avi.PdfMk.ColumnObjectMembersWrapper");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPdfMk.g:2833:4: (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPdfMk.g:2834:5: otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_29); 

            	    					newLeafNode(otherlv_2, grammarAccess.getColumnObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2838:5: ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2839:6: (lv_members_3_0= ruleColumnObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2839:6: (lv_members_3_0= ruleColumnObjectMembersWrapper )
            	    // InternalPdfMk.g:2840:7: lv_members_3_0= ruleColumnObjectMembersWrapper
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_members_3_0=ruleColumnObjectMembersWrapper();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getColumnObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"members",
            	    								lv_members_3_0,
            	    								"org.xtext.avi.PdfMk.ColumnObjectMembersWrapper");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnObjectAccess().getRightSquareBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleListElements"
    // InternalPdfMk.g:2867:1: entryRuleListElements returns [EObject current=null] : iv_ruleListElements= ruleListElements EOF ;
    public final EObject entryRuleListElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElements = null;


        try {
            // InternalPdfMk.g:2867:53: (iv_ruleListElements= ruleListElements EOF )
            // InternalPdfMk.g:2868:2: iv_ruleListElements= ruleListElements EOF
            {
             newCompositeNode(grammarAccess.getListElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListElements=ruleListElements();

            state._fsp--;

             current =iv_ruleListElements; 
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
    // $ANTLR end "entryRuleListElements"


    // $ANTLR start "ruleListElements"
    // InternalPdfMk.g:2874:1: ruleListElements returns [EObject current=null] : ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition ) ;
    public final EObject ruleListElements() throws RecognitionException {
        EObject current = null;

        Token lv_elValues_0_0=null;
        EObject this_TextObject_1 = null;

        EObject this_ColumnDefinition_2 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2880:2: ( ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition ) )
            // InternalPdfMk.g:2881:2: ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition )
            {
            // InternalPdfMk.g:2881:2: ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==14) ) {
                switch ( input.LA(2) ) {
                case 17:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 28:
                case 37:
                    {
                    alt31=2;
                    }
                    break;
                case 21:
                    {
                    int LA31_4 = input.LA(3);

                    if ( (LA31_4==18) ) {
                        int LA31_6 = input.LA(4);

                        if ( (LA31_6==RULE_STRING) ) {
                            int LA31_7 = input.LA(5);

                            if ( (LA31_7==15) ) {
                                int LA31_8 = input.LA(6);

                                if ( (LA31_8==17||(LA31_8>=21 && LA31_8<=26)||LA31_8==28||LA31_8==37) ) {
                                    alt31=2;
                                }
                                else if ( (LA31_8==27) ) {
                                    alt31=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 31, 8, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA31_7==16) ) {
                                alt31=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    alt31=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPdfMk.g:2882:3: ( (lv_elValues_0_0= RULE_STRING ) )
                    {
                    // InternalPdfMk.g:2882:3: ( (lv_elValues_0_0= RULE_STRING ) )
                    // InternalPdfMk.g:2883:4: (lv_elValues_0_0= RULE_STRING )
                    {
                    // InternalPdfMk.g:2883:4: (lv_elValues_0_0= RULE_STRING )
                    // InternalPdfMk.g:2884:5: lv_elValues_0_0= RULE_STRING
                    {
                    lv_elValues_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_elValues_0_0, grammarAccess.getListElementsAccess().getElValuesSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListElementsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"elValues",
                    						lv_elValues_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:2901:3: this_TextObject_1= ruleTextObject
                    {

                    			newCompositeNode(grammarAccess.getListElementsAccess().getTextObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextObject_1=ruleTextObject();

                    state._fsp--;


                    			current = this_TextObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:2910:3: this_ColumnDefinition_2= ruleColumnDefinition
                    {

                    			newCompositeNode(grammarAccess.getListElementsAccess().getColumnDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnDefinition_2=ruleColumnDefinition();

                    state._fsp--;


                    			current = this_ColumnDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleListElements"


    // $ANTLR start "entryRuleListObject"
    // InternalPdfMk.g:2922:1: entryRuleListObject returns [EObject current=null] : iv_ruleListObject= ruleListObject EOF ;
    public final EObject entryRuleListObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListObject = null;


        try {
            // InternalPdfMk.g:2922:51: (iv_ruleListObject= ruleListObject EOF )
            // InternalPdfMk.g:2923:2: iv_ruleListObject= ruleListObject EOF
            {
             newCompositeNode(grammarAccess.getListObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListObject=ruleListObject();

            state._fsp--;

             current =iv_ruleListObject; 
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
    // $ANTLR end "entryRuleListObject"


    // $ANTLR start "ruleListObject"
    // InternalPdfMk.g:2929:1: ruleListObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' ) ;
    public final EObject ruleListObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_elements_9_0 = null;

        EObject lv_elemtens_11_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2935:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' ) )
            // InternalPdfMk.g:2936:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' )
            {
            // InternalPdfMk.g:2936:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' )
            // InternalPdfMk.g:2937:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}'
            {
            // InternalPdfMk.g:2937:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:2938:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:2938:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:2939:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_30); 

            					newLeafNode(lv_value_0_0, grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2951:3: ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=36 && LA33_0<=40)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPdfMk.g:2952:4: ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )*
                    {
                    // InternalPdfMk.g:2952:4: ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) )
                    // InternalPdfMk.g:2953:5: (lv_properties_1_0= ruleListObjectPropertiesWrapper )
                    {
                    // InternalPdfMk.g:2953:5: (lv_properties_1_0= ruleListObjectPropertiesWrapper )
                    // InternalPdfMk.g:2954:6: lv_properties_1_0= ruleListObjectPropertiesWrapper
                    {

                    						newCompositeNode(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_properties_1_0=ruleListObjectPropertiesWrapper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListObjectRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_1_0,
                    							"org.xtext.avi.PdfMk.ListObjectPropertiesWrapper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getListObjectAccess().getCommaKeyword_1_1());
                    			
                    // InternalPdfMk.g:2975:4: ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=36 && LA32_0<=40)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalPdfMk.g:2976:5: ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ','
                    	    {
                    	    // InternalPdfMk.g:2976:5: ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) )
                    	    // InternalPdfMk.g:2977:6: (lv_properties_3_0= ruleListObjectPropertiesWrapper )
                    	    {
                    	    // InternalPdfMk.g:2977:6: (lv_properties_3_0= ruleListObjectPropertiesWrapper )
                    	    // InternalPdfMk.g:2978:7: lv_properties_3_0= ruleListObjectPropertiesWrapper
                    	    {

                    	    							newCompositeNode(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_properties_3_0=ruleListObjectPropertiesWrapper();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getListObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_3_0,
                    	    								"org.xtext.avi.PdfMk.ListObjectPropertiesWrapper");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getListObjectAccess().getCommaKeyword_1_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPdfMk.g:3001:3: (otherlv_5= 'ul' | otherlv_6= 'ol' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPdfMk.g:3002:4: otherlv_5= 'ul'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getListObjectAccess().getUlKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:3007:4: otherlv_6= 'ol'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getListObjectAccess().getOlKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getListObjectAccess().getColonKeyword_3());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getListObjectAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalPdfMk.g:3020:3: ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* )
            // InternalPdfMk.g:3021:4: ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )*
            {
            // InternalPdfMk.g:3021:4: ( (lv_elements_9_0= ruleListElements ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING||LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPdfMk.g:3022:5: (lv_elements_9_0= ruleListElements )
                    {
                    // InternalPdfMk.g:3022:5: (lv_elements_9_0= ruleListElements )
                    // InternalPdfMk.g:3023:6: lv_elements_9_0= ruleListElements
                    {

                    						newCompositeNode(grammarAccess.getListObjectAccess().getElementsListElementsParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_elements_9_0=ruleListElements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListObjectRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_9_0,
                    							"org.xtext.avi.PdfMk.ListElements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalPdfMk.g:3040:4: (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPdfMk.g:3041:5: otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_22); 

            	    					newLeafNode(otherlv_10, grammarAccess.getListObjectAccess().getCommaKeyword_5_1_0());
            	    				
            	    // InternalPdfMk.g:3045:5: ( (lv_elemtens_11_0= ruleListElements ) )
            	    // InternalPdfMk.g:3046:6: (lv_elemtens_11_0= ruleListElements )
            	    {
            	    // InternalPdfMk.g:3046:6: (lv_elemtens_11_0= ruleListElements )
            	    // InternalPdfMk.g:3047:7: lv_elemtens_11_0= ruleListElements
            	    {

            	    							newCompositeNode(grammarAccess.getListObjectAccess().getElemtensListElementsParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_elemtens_11_0=ruleListElements();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getListObjectRule());
            	    							}
            	    							add(
            	    								current,
            	    								"elemtens",
            	    								lv_elemtens_11_0,
            	    								"org.xtext.avi.PdfMk.ListElements");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            otherlv_12=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getListObjectAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getListObjectAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleListObject"


    // $ANTLR start "entryRuleTableObject"
    // InternalPdfMk.g:3078:1: entryRuleTableObject returns [EObject current=null] : iv_ruleTableObject= ruleTableObject EOF ;
    public final EObject entryRuleTableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableObject = null;


        try {
            // InternalPdfMk.g:3078:52: (iv_ruleTableObject= ruleTableObject EOF )
            // InternalPdfMk.g:3079:2: iv_ruleTableObject= ruleTableObject EOF
            {
             newCompositeNode(grammarAccess.getTableObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableObject=ruleTableObject();

            state._fsp--;

             current =iv_ruleTableObject; 
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
    // $ANTLR end "entryRuleTableObject"


    // $ANTLR start "ruleTableObject"
    // InternalPdfMk.g:3085:1: ruleTableObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_style_1_0 = null;

        EObject lv_table_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3091:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' ) )
            // InternalPdfMk.g:3092:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:3092:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' )
            // InternalPdfMk.g:3093:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}'
            {
            // InternalPdfMk.g:3093:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:3094:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:3094:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:3095:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_31); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:3107:3: ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPdfMk.g:3108:4: ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ','
                    {
                    // InternalPdfMk.g:3108:4: ( (lv_style_1_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:3109:5: (lv_style_1_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:3109:5: (lv_style_1_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:3110:6: lv_style_1_0= ruleTextStyleDefinition
                    {

                    						newCompositeNode(grammarAccess.getTableObjectAccess().getStyleTextStyleDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_style_1_0=ruleTextStyleDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableObjectRule());
                    						}
                    						set(
                    							current,
                    							"style",
                    							lv_style_1_0,
                    							"org.xtext.avi.PdfMk.TextStyleDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableObjectAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPdfMk.g:3132:3: ( (lv_table_3_0= ruleTableDefinition ) )
            // InternalPdfMk.g:3133:4: (lv_table_3_0= ruleTableDefinition )
            {
            // InternalPdfMk.g:3133:4: (lv_table_3_0= ruleTableDefinition )
            // InternalPdfMk.g:3134:5: lv_table_3_0= ruleTableDefinition
            {

            					newCompositeNode(grammarAccess.getTableObjectAccess().getTableTableDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_table_3_0=ruleTableDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableObjectRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_3_0,
            						"org.xtext.avi.PdfMk.TableDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableObjectAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTableObject"


    // $ANTLR start "entryRuleContentObject"
    // InternalPdfMk.g:3159:1: entryRuleContentObject returns [EObject current=null] : iv_ruleContentObject= ruleContentObject EOF ;
    public final EObject entryRuleContentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObject = null;


        try {
            // InternalPdfMk.g:3159:54: (iv_ruleContentObject= ruleContentObject EOF )
            // InternalPdfMk.g:3160:2: iv_ruleContentObject= ruleContentObject EOF
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
    // InternalPdfMk.g:3166:1: ruleContentObject returns [EObject current=null] : ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) ) ;
    public final EObject ruleContentObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;

        EObject lv_value_0_3 = null;

        EObject lv_value_0_4 = null;

        EObject lv_value_0_5 = null;

        EObject lv_value_0_6 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3172:2: ( ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) ) )
            // InternalPdfMk.g:3173:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) )
            {
            // InternalPdfMk.g:3173:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) )
            // InternalPdfMk.g:3174:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) )
            {
            // InternalPdfMk.g:3174:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) )
            // InternalPdfMk.g:3175:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )
            {
            // InternalPdfMk.g:3175:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )
            int alt38=6;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalPdfMk.g:3176:5: lv_value_0_1= ruleStringObject
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
                    // InternalPdfMk.g:3192:5: lv_value_0_2= ruleTextObject
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
                    // InternalPdfMk.g:3208:5: lv_value_0_3= ruleColumnTextObject
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
                    // InternalPdfMk.g:3224:5: lv_value_0_4= ruleImageObject
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
                case 5 :
                    // InternalPdfMk.g:3240:5: lv_value_0_5= ruleListObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectAccess().getValueListObjectParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_5=ruleListObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_5,
                    						"org.xtext.avi.PdfMk.ListObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalPdfMk.g:3256:5: lv_value_0_6= ruleTableObject
                    {

                    					newCompositeNode(grammarAccess.getContentObjectAccess().getValueTableObjectParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_6=ruleTableObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentObjectRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_6,
                    						"org.xtext.avi.PdfMk.TableObject");
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
    // InternalPdfMk.g:3277:1: entryRuleContentObjects returns [EObject current=null] : iv_ruleContentObjects= ruleContentObjects EOF ;
    public final EObject entryRuleContentObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObjects = null;


        try {
            // InternalPdfMk.g:3277:55: (iv_ruleContentObjects= ruleContentObjects EOF )
            // InternalPdfMk.g:3278:2: iv_ruleContentObjects= ruleContentObjects EOF
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
    // InternalPdfMk.g:3284:1: ruleContentObjects returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleContentObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3290:2: ( ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' ) )
            // InternalPdfMk.g:3291:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' )
            {
            // InternalPdfMk.g:3291:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' )
            // InternalPdfMk.g:3292:3: () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']'
            {
            // InternalPdfMk.g:3292:3: ()
            // InternalPdfMk.g:3293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentObjectsAccess().getContentObjectsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPdfMk.g:3303:3: ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING||LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPdfMk.g:3304:4: ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )*
                    {
                    // InternalPdfMk.g:3304:4: ( (lv_value_2_0= ruleContentObject ) )
                    // InternalPdfMk.g:3305:5: (lv_value_2_0= ruleContentObject )
                    {
                    // InternalPdfMk.g:3305:5: (lv_value_2_0= ruleContentObject )
                    // InternalPdfMk.g:3306:6: lv_value_2_0= ruleContentObject
                    {

                    						newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalPdfMk.g:3323:4: (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalPdfMk.g:3324:5: otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getContentObjectsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPdfMk.g:3328:5: ( (lv_value_4_0= ruleContentObject ) )
                    	    // InternalPdfMk.g:3329:6: (lv_value_4_0= ruleContentObject )
                    	    {
                    	    // InternalPdfMk.g:3329:6: (lv_value_4_0= ruleContentObject )
                    	    // InternalPdfMk.g:3330:7: lv_value_4_0= ruleContentObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_value_4_0=ruleContentObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentObjectsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"org.xtext.avi.PdfMk.ContentObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContentObjectsAccess().getRightSquareBracketKeyword_3());
            		

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
    // InternalPdfMk.g:3357:1: entryRuleStyles returns [EObject current=null] : iv_ruleStyles= ruleStyles EOF ;
    public final EObject entryRuleStyles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyles = null;


        try {
            // InternalPdfMk.g:3357:47: (iv_ruleStyles= ruleStyles EOF )
            // InternalPdfMk.g:3358:2: iv_ruleStyles= ruleStyles EOF
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
    // InternalPdfMk.g:3364:1: ruleStyles returns [EObject current=null] : ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) ;
    public final EObject ruleStyles() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3370:2: ( ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) )
            // InternalPdfMk.g:3371:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            {
            // InternalPdfMk.g:3371:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            // InternalPdfMk.g:3372:3: ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) )
            {
            // InternalPdfMk.g:3372:3: ( (lv_key_0_0= 'styles' ) )
            // InternalPdfMk.g:3373:4: (lv_key_0_0= 'styles' )
            {
            // InternalPdfMk.g:3373:4: (lv_key_0_0= 'styles' )
            // InternalPdfMk.g:3374:5: lv_key_0_0= 'styles'
            {
            lv_key_0_0=(Token)match(input,45,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStylesRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "styles");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStylesAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:3390:3: ( (lv_value_2_0= ruleStyleObjects ) )
            // InternalPdfMk.g:3391:4: (lv_value_2_0= ruleStyleObjects )
            {
            // InternalPdfMk.g:3391:4: (lv_value_2_0= ruleStyleObjects )
            // InternalPdfMk.g:3392:5: lv_value_2_0= ruleStyleObjects
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
    // InternalPdfMk.g:3413:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPdfMk.g:3413:48: (iv_ruleContent= ruleContent EOF )
            // InternalPdfMk.g:3414:2: iv_ruleContent= ruleContent EOF
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
    // InternalPdfMk.g:3420:1: ruleContent returns [EObject current=null] : ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3426:2: ( ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) )
            // InternalPdfMk.g:3427:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            {
            // InternalPdfMk.g:3427:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            // InternalPdfMk.g:3428:3: ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) )
            {
            // InternalPdfMk.g:3428:3: ( (lv_key_0_0= 'content' ) )
            // InternalPdfMk.g:3429:4: (lv_key_0_0= 'content' )
            {
            // InternalPdfMk.g:3429:4: (lv_key_0_0= 'content' )
            // InternalPdfMk.g:3430:5: lv_key_0_0= 'content'
            {
            lv_key_0_0=(Token)match(input,46,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getContentAccess().getKeyContentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "content");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:3446:3: ( (lv_value_2_0= ruleContentObjects ) )
            // InternalPdfMk.g:3447:4: (lv_value_2_0= ruleContentObjects )
            {
            // InternalPdfMk.g:3447:4: (lv_value_2_0= ruleContentObjects )
            // InternalPdfMk.g:3448:5: lv_value_2_0= ruleContentObjects
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\21\1\uffff\1\22\1\uffff\1\22\1\uffff\2\5\2\17\1\21\1\uffff\1\21\2\22\2\5\2\17\1\21";
    static final String dfa_3s = "\1\16\1\uffff\1\54\1\uffff\1\22\1\uffff\1\22\1\uffff\2\5\2\20\1\45\1\uffff\1\54\2\22\2\5\2\20\1\54";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\4\1\uffff\1\2\5\uffff\1\2\10\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\7\3\uffff\5\7\1\4\1\uffff\1\7\2\uffff\5\3\1\5\1\6\3\5\2\uffff\2\5",
            "",
            "\1\10",
            "",
            "\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16\1\15",
            "\1\15\3\uffff\5\15\1\17\1\uffff\1\15\2\uffff\5\3\1\uffff\1\15",
            "",
            "\1\15\3\uffff\6\15\1\uffff\1\15\7\uffff\1\5\1\20\3\5\2\uffff\2\5",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\14\1\15",
            "\1\25\1\15",
            "\1\15\3\uffff\6\15\1\uffff\1\15\7\uffff\1\5\1\20\3\5\2\uffff\2\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1491:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )";
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\1\3\17\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\uffff\2\21\1\uffff\1\22\1\uffff\1\22\2\4\2\17\2\21";
    static final String dfa_10s = "\1\17\1\uffff\1\16\1\uffff\2\45\1\uffff\1\22\1\uffff\1\22\2\4\2\20\2\45";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\7\uffff";
    static final String dfa_12s = "\20\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\11\uffff\1\4\1\2",
            "",
            "\1\3\11\uffff\1\5",
            "",
            "\1\6\3\uffff\1\7\5\6\1\10\1\6\10\uffff\1\6",
            "\1\6\3\uffff\1\11\5\6\1\10\1\6\10\uffff\1\6",
            "",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\6",
            "\1\17\1\6",
            "\1\6\3\uffff\6\6\1\10\1\6\10\uffff\1\6",
            "\1\6\3\uffff\6\6\1\10\1\6\10\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2055:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) )";
        }
    }
    static final String dfa_14s = "\110\uffff";
    static final String dfa_15s = "\1\1\107\uffff";
    static final String dfa_16s = "\1\17\1\uffff\1\4\1\21\11\22\2\4\1\5\1\4\2\23\1\5\1\35\1\5\11\17\1\5\1\17\1\21\1\uffff\1\17\1\5\1\17\11\22\1\17\2\4\1\5\1\4\2\23\1\5\1\35\1\5\11\17\1\5\2\17\1\5\2\17";
    static final String dfa_17s = "\1\36\1\uffff\1\36\1\45\11\22\2\4\1\5\1\4\2\24\1\5\1\35\1\5\11\20\1\36\1\20\1\45\1\uffff\1\36\1\5\1\20\11\22\1\36\2\4\1\5\1\4\2\24\1\5\1\35\1\5\11\20\1\36\1\20\1\36\1\5\1\20\1\36";
    static final String dfa_18s = "\1\uffff\1\2\40\uffff\1\1\45\uffff";
    static final String dfa_19s = "\110\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\16\uffff\1\1",
            "",
            "\1\1\11\uffff\1\3\1\1\16\uffff\1\1",
            "\1\10\3\uffff\1\5\1\4\1\7\1\11\1\6\1\12\1\uffff\1\13\10\uffff\1\14",
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
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\43\11\uffff\1\44\16\uffff\1\45",
            "\1\41\1\42",
            "\1\52\3\uffff\1\47\1\46\1\51\1\53\1\50\1\54\1\uffff\1\55\10\uffff\1\56",
            "",
            "\1\44\16\uffff\1\45",
            "\1\57",
            "\1\41\1\42",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\44\16\uffff\1\45",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\104\11\uffff\1\105\16\uffff\1\106",
            "\1\41\1\42",
            "\1\105\16\uffff\1\106",
            "\1\107",
            "\1\41\1\42",
            "\1\105\16\uffff\1\106"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 2282:4: (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*";
        }
    }
    static final String dfa_21s = "\34\uffff";
    static final String dfa_22s = "\1\4\1\uffff\1\21\1\uffff\1\22\1\uffff\2\22\3\uffff\1\5\1\4\1\5\3\17\1\21\1\uffff\2\21\2\22\2\5\2\17\1\21";
    static final String dfa_23s = "\1\16\1\uffff\1\54\1\uffff\1\22\1\uffff\2\22\3\uffff\1\5\1\4\1\5\3\20\1\45\1\uffff\1\52\1\54\2\22\2\5\2\20\1\54";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\2\2\uffff\1\5\1\6\1\3\7\uffff\1\2\11\uffff";
    static final String dfa_25s = "\34\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\5\3\uffff\1\6\4\5\1\4\1\12\1\5\2\uffff\5\3\1\10\1\7\3\10\1\uffff\1\11\2\10",
            "",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21\1\22",
            "\1\23\1\22",
            "\1\24\1\22",
            "\1\22\3\uffff\5\22\1\25\1\uffff\1\22\2\uffff\5\3\1\uffff\1\22",
            "",
            "\1\22\3\uffff\6\22\1\12\1\22\10\uffff\1\22\4\uffff\1\11",
            "\1\22\3\uffff\6\22\1\uffff\1\22\7\uffff\1\10\1\26\3\10\2\uffff\2\10",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\21\1\22",
            "\1\33\1\22",
            "\1\22\3\uffff\6\22\1\uffff\1\22\7\uffff\1\10\1\26\3\10\2\uffff\2\10"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3175:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040008020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002017E20000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000013820000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000F84000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000004000C010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000019F017E20000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040004010L});

}