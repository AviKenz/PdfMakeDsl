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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'dd'", "'='", "'{'", "','", "'}'", "'bold'", "':'", "'true'", "'false'", "'style'", "'text:'", "'['", "']'", "'alignment'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'body'", "'table'", "'ul'", "'ol'", "'styles'", "'content'"
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


    // $ANTLR start "entryRuleListReversedDefinition"
    // InternalPdfMk.g:1178:1: entryRuleListReversedDefinition returns [EObject current=null] : iv_ruleListReversedDefinition= ruleListReversedDefinition EOF ;
    public final EObject entryRuleListReversedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListReversedDefinition = null;


        try {
            // InternalPdfMk.g:1178:63: (iv_ruleListReversedDefinition= ruleListReversedDefinition EOF )
            // InternalPdfMk.g:1179:2: iv_ruleListReversedDefinition= ruleListReversedDefinition EOF
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
    // InternalPdfMk.g:1185:1: ruleListReversedDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleListReversedDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1191:2: ( ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:1192:2: ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:1192:2: ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:1193:3: ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
            {
            // InternalPdfMk.g:1193:3: ( (lv_key_0_0= 'reversed' ) )
            // InternalPdfMk.g:1194:4: (lv_key_0_0= 'reversed' )
            {
            // InternalPdfMk.g:1194:4: (lv_key_0_0= 'reversed' )
            // InternalPdfMk.g:1195:5: lv_key_0_0= 'reversed'
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
            		
            // InternalPdfMk.g:1211:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:1212:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:1212:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:1213:5: lv_value_2_0= ruleBooleanType
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
    // InternalPdfMk.g:1234:1: entryRuleListCounterDefinition returns [EObject current=null] : iv_ruleListCounterDefinition= ruleListCounterDefinition EOF ;
    public final EObject entryRuleListCounterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListCounterDefinition = null;


        try {
            // InternalPdfMk.g:1234:62: (iv_ruleListCounterDefinition= ruleListCounterDefinition EOF )
            // InternalPdfMk.g:1235:2: iv_ruleListCounterDefinition= ruleListCounterDefinition EOF
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
    // InternalPdfMk.g:1241:1: ruleListCounterDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleListCounterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1247:2: ( ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:1248:2: ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:1248:2: ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:1249:3: ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:1249:3: ( (lv_key_0_0= 'counter' ) )
            // InternalPdfMk.g:1250:4: (lv_key_0_0= 'counter' )
            {
            // InternalPdfMk.g:1250:4: (lv_key_0_0= 'counter' )
            // InternalPdfMk.g:1251:5: lv_key_0_0= 'counter'
            {
            lv_key_0_0=(Token)match(input,37,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListCounterDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "counter");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getListCounterDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1267:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:1268:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:1268:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:1269:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:1289:1: entryRuleListTypeDefinition returns [EObject current=null] : iv_ruleListTypeDefinition= ruleListTypeDefinition EOF ;
    public final EObject entryRuleListTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeDefinition = null;


        try {
            // InternalPdfMk.g:1289:59: (iv_ruleListTypeDefinition= ruleListTypeDefinition EOF )
            // InternalPdfMk.g:1290:2: iv_ruleListTypeDefinition= ruleListTypeDefinition EOF
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
    // InternalPdfMk.g:1296:1: ruleListTypeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1302:2: ( ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1303:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1303:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1304:3: ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1304:3: ( (lv_key_0_0= 'type' ) )
            // InternalPdfMk.g:1305:4: (lv_key_0_0= 'type' )
            {
            // InternalPdfMk.g:1305:4: (lv_key_0_0= 'type' )
            // InternalPdfMk.g:1306:5: lv_key_0_0= 'type'
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
            		
            // InternalPdfMk.g:1322:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1323:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1323:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1324:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1344:1: entryRuleListColorDefinition returns [EObject current=null] : iv_ruleListColorDefinition= ruleListColorDefinition EOF ;
    public final EObject entryRuleListColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListColorDefinition = null;


        try {
            // InternalPdfMk.g:1344:60: (iv_ruleListColorDefinition= ruleListColorDefinition EOF )
            // InternalPdfMk.g:1345:2: iv_ruleListColorDefinition= ruleListColorDefinition EOF
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
    // InternalPdfMk.g:1351:1: ruleListColorDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListColorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1357:2: ( ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1358:2: ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1358:2: ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1359:3: ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1359:3: ( (lv_key_0_0= 'color' ) )
            // InternalPdfMk.g:1360:4: (lv_key_0_0= 'color' )
            {
            // InternalPdfMk.g:1360:4: (lv_key_0_0= 'color' )
            // InternalPdfMk.g:1361:5: lv_key_0_0= 'color'
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
            		
            // InternalPdfMk.g:1377:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1378:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1378:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1379:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1399:1: entryRuleListMarkerColorDefinition returns [EObject current=null] : iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF ;
    public final EObject entryRuleListMarkerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMarkerColorDefinition = null;


        try {
            // InternalPdfMk.g:1399:66: (iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF )
            // InternalPdfMk.g:1400:2: iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF
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
    // InternalPdfMk.g:1406:1: ruleListMarkerColorDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListMarkerColorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1412:2: ( ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1413:2: ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1413:2: ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1414:3: ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1414:3: ( (lv_key_0_0= 'markerColor' ) )
            // InternalPdfMk.g:1415:4: (lv_key_0_0= 'markerColor' )
            {
            // InternalPdfMk.g:1415:4: (lv_key_0_0= 'markerColor' )
            // InternalPdfMk.g:1416:5: lv_key_0_0= 'markerColor'
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
            		
            // InternalPdfMk.g:1432:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1433:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1433:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1434:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1454:1: entryRuleTableCellItemElements returns [EObject current=null] : iv_ruleTableCellItemElements= ruleTableCellItemElements EOF ;
    public final EObject entryRuleTableCellItemElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCellItemElements = null;


        try {
            // InternalPdfMk.g:1454:62: (iv_ruleTableCellItemElements= ruleTableCellItemElements EOF )
            // InternalPdfMk.g:1455:2: iv_ruleTableCellItemElements= ruleTableCellItemElements EOF
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
    // InternalPdfMk.g:1461:1: ruleTableCellItemElements returns [EObject current=null] : ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) ) ;
    public final EObject ruleTableCellItemElements() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_1 = null;

        EObject lv_elements_0_2 = null;

        EObject lv_elements_0_3 = null;

        EObject lv_elements_0_4 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1467:2: ( ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) ) )
            // InternalPdfMk.g:1468:2: ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) )
            {
            // InternalPdfMk.g:1468:2: ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) )
            // InternalPdfMk.g:1469:3: ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) )
            {
            // InternalPdfMk.g:1469:3: ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) )
            // InternalPdfMk.g:1470:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )
            {
            // InternalPdfMk.g:1470:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 23:
                    {
                    alt9=2;
                    }
                    break;
                case 15:
                case 16:
                case 31:
                    {
                    alt9=3;
                    }
                    break;
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 43:
                case 44:
                    {
                    alt9=4;
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
                    // InternalPdfMk.g:1471:5: lv_elements_0_1= ruleStringObject
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
                    // InternalPdfMk.g:1487:5: lv_elements_0_2= ruleTextObject
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
                    // InternalPdfMk.g:1503:5: lv_elements_0_3= ruleImageObject
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
                    // InternalPdfMk.g:1519:5: lv_elements_0_4= ruleListObject
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
    // InternalPdfMk.g:1540:1: entryRuleTableRowDefinition returns [EObject current=null] : iv_ruleTableRowDefinition= ruleTableRowDefinition EOF ;
    public final EObject entryRuleTableRowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRowDefinition = null;


        try {
            // InternalPdfMk.g:1540:59: (iv_ruleTableRowDefinition= ruleTableRowDefinition EOF )
            // InternalPdfMk.g:1541:2: iv_ruleTableRowDefinition= ruleTableRowDefinition EOF
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
    // InternalPdfMk.g:1547:1: ruleTableRowDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' ) ;
    public final EObject ruleTableRowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_item_1_0 = null;

        EObject lv_item_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1553:2: ( (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' ) )
            // InternalPdfMk.g:1554:2: (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' )
            {
            // InternalPdfMk.g:1554:2: (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' )
            // InternalPdfMk.g:1555:3: otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowDefinitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPdfMk.g:1559:3: ( (lv_item_1_0= ruleTableCellItemElements ) )
            // InternalPdfMk.g:1560:4: (lv_item_1_0= ruleTableCellItemElements )
            {
            // InternalPdfMk.g:1560:4: (lv_item_1_0= ruleTableCellItemElements )
            // InternalPdfMk.g:1561:5: lv_item_1_0= ruleTableCellItemElements
            {

            					newCompositeNode(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalPdfMk.g:1578:3: (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) )
            // InternalPdfMk.g:1579:4: otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) )
            {
            otherlv_2=(Token)match(input,15,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getTableRowDefinitionAccess().getCommaKeyword_2_0());
            			
            // InternalPdfMk.g:1583:4: ( (lv_item_3_0= ruleTableCellItemElements ) )
            // InternalPdfMk.g:1584:5: (lv_item_3_0= ruleTableCellItemElements )
            {
            // InternalPdfMk.g:1584:5: (lv_item_3_0= ruleTableCellItemElements )
            // InternalPdfMk.g:1585:6: lv_item_3_0= ruleTableCellItemElements
            {

            						newCompositeNode(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

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
    // InternalPdfMk.g:1611:1: entryRuleTableBodyDefinition returns [EObject current=null] : iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF ;
    public final EObject entryRuleTableBodyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableBodyDefinition = null;


        try {
            // InternalPdfMk.g:1611:60: (iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF )
            // InternalPdfMk.g:1612:2: iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF
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
    // InternalPdfMk.g:1618:1: ruleTableBodyDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' ) ;
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
            // InternalPdfMk.g:1624:2: ( ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' ) )
            // InternalPdfMk.g:1625:2: ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' )
            {
            // InternalPdfMk.g:1625:2: ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' )
            // InternalPdfMk.g:1626:3: ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']'
            {
            // InternalPdfMk.g:1626:3: ( (lv_key_0_0= 'body' ) )
            // InternalPdfMk.g:1627:4: (lv_key_0_0= 'body' )
            {
            // InternalPdfMk.g:1627:4: (lv_key_0_0= 'body' )
            // InternalPdfMk.g:1628:5: lv_key_0_0= 'body'
            {
            lv_key_0_0=(Token)match(input,41,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableBodyDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "body");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTableBodyDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1644:3: ( (lv_value_2_0= '[' ) )
            // InternalPdfMk.g:1645:4: (lv_value_2_0= '[' )
            {
            // InternalPdfMk.g:1645:4: (lv_value_2_0= '[' )
            // InternalPdfMk.g:1646:5: lv_value_2_0= '['
            {
            lv_value_2_0=(Token)match(input,23,FOLLOW_19); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableBodyDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1658:3: ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* )
            // InternalPdfMk.g:1659:4: ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )*
            {
            // InternalPdfMk.g:1659:4: ( (lv_rows_3_0= ruleTableRowDefinition ) )
            // InternalPdfMk.g:1660:5: (lv_rows_3_0= ruleTableRowDefinition )
            {
            // InternalPdfMk.g:1660:5: (lv_rows_3_0= ruleTableRowDefinition )
            // InternalPdfMk.g:1661:6: lv_rows_3_0= ruleTableRowDefinition
            {

            						newCompositeNode(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_21);
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

            // InternalPdfMk.g:1678:4: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPdfMk.g:1679:5: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTableBodyDefinitionAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:1683:5: ( (lv_rows_5_0= ruleTableRowDefinition ) )
            	    // InternalPdfMk.g:1684:6: (lv_rows_5_0= ruleTableRowDefinition )
            	    {
            	    // InternalPdfMk.g:1684:6: (lv_rows_5_0= ruleTableRowDefinition )
            	    // InternalPdfMk.g:1685:7: lv_rows_5_0= ruleTableRowDefinition
            	    {

            	    							newCompositeNode(grammarAccess.getTableBodyDefinitionAccess().getRowsTableRowDefinitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    break loop10;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

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
    // InternalPdfMk.g:1712:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // InternalPdfMk.g:1712:56: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // InternalPdfMk.g:1713:2: iv_ruleTableDefinition= ruleTableDefinition EOF
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
    // InternalPdfMk.g:1719:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1725:2: ( ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' ) )
            // InternalPdfMk.g:1726:2: ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:1726:2: ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' )
            // InternalPdfMk.g:1727:3: ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}'
            {
            // InternalPdfMk.g:1727:3: ( (lv_key_0_0= 'table' ) )
            // InternalPdfMk.g:1728:4: (lv_key_0_0= 'table' )
            {
            // InternalPdfMk.g:1728:4: (lv_key_0_0= 'table' )
            // InternalPdfMk.g:1729:5: lv_key_0_0= 'table'
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
            		
            // InternalPdfMk.g:1745:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:1746:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:1746:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:1747:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_23); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:1759:3: ( (lv_body_3_0= ruleTableBodyDefinition ) )
            // InternalPdfMk.g:1760:4: (lv_body_3_0= ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:1760:4: (lv_body_3_0= ruleTableBodyDefinition )
            // InternalPdfMk.g:1761:5: lv_body_3_0= ruleTableBodyDefinition
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


    // $ANTLR start "entryRuleTextObject"
    // InternalPdfMk.g:1786:1: entryRuleTextObject returns [EObject current=null] : iv_ruleTextObject= ruleTextObject EOF ;
    public final EObject entryRuleTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObject = null;


        try {
            // InternalPdfMk.g:1786:51: (iv_ruleTextObject= ruleTextObject EOF )
            // InternalPdfMk.g:1787:2: iv_ruleTextObject= ruleTextObject EOF
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
    // InternalPdfMk.g:1793:1: ruleTextObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? (otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) ) )? otherlv_18= '}' ) ;
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
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_style_3_0 = null;

        EObject lv_fontSize_5_0 = null;

        AntlrDatatypeRuleToken lv_alignment_7_0 = null;

        EObject lv_typeFace_9_0 = null;

        EObject lv_italics_11_0 = null;

        EObject lv_width_13_0 = null;

        EObject lv_margin_15_0 = null;

        EObject lv_listCounter_17_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1799:2: ( ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? (otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) ) )? otherlv_18= '}' ) )
            // InternalPdfMk.g:1800:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? (otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) ) )? otherlv_18= '}' )
            {
            // InternalPdfMk.g:1800:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? (otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) ) )? otherlv_18= '}' )
            // InternalPdfMk.g:1801:3: ( (lv_value_0_0= '{' ) ) ( (lv_text_1_0= ruleTextDefinition ) ) (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )? (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )? (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )? (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )? (otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) ) )? otherlv_18= '}'
            {
            // InternalPdfMk.g:1801:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:1802:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:1802:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:1803:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_24); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTextObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:1815:3: ( (lv_text_1_0= ruleTextDefinition ) )
            // InternalPdfMk.g:1816:4: (lv_text_1_0= ruleTextDefinition )
            {
            // InternalPdfMk.g:1816:4: (lv_text_1_0= ruleTextDefinition )
            // InternalPdfMk.g:1817:5: lv_text_1_0= ruleTextDefinition
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

            // InternalPdfMk.g:1834:3: (otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==21) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:1835:4: otherlv_2= ',' ( (lv_style_3_0= ruleTextStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextObjectAccess().getCommaKeyword_2_0());
                    			
                    // InternalPdfMk.g:1839:4: ( (lv_style_3_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:1840:5: (lv_style_3_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:1840:5: (lv_style_3_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:1841:6: lv_style_3_0= ruleTextStyleDefinition
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

            // InternalPdfMk.g:1859:3: (otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==27) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:1860:4: otherlv_4= ',' ( (lv_fontSize_5_0= ruleFontSizeDefinition ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextObjectAccess().getCommaKeyword_3_0());
                    			
                    // InternalPdfMk.g:1864:4: ( (lv_fontSize_5_0= ruleFontSizeDefinition ) )
                    // InternalPdfMk.g:1865:5: (lv_fontSize_5_0= ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:1865:5: (lv_fontSize_5_0= ruleFontSizeDefinition )
                    // InternalPdfMk.g:1866:6: lv_fontSize_5_0= ruleFontSizeDefinition
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

            // InternalPdfMk.g:1884:3: (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==25) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:1885:4: otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:1889:4: ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    // InternalPdfMk.g:1890:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:1890:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:1891:6: lv_alignment_7_0= ruleTextAlignmentDefinition
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

            // InternalPdfMk.g:1909:3: (otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==17) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPdfMk.g:1910:4: otherlv_8= ',' ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:1914:4: ( (lv_typeFace_9_0= ruleTypeFaceDefinition ) )
                    // InternalPdfMk.g:1915:5: (lv_typeFace_9_0= ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:1915:5: (lv_typeFace_9_0= ruleTypeFaceDefinition )
                    // InternalPdfMk.g:1916:6: lv_typeFace_9_0= ruleTypeFaceDefinition
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

            // InternalPdfMk.g:1934:3: (otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==26) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalPdfMk.g:1935:4: otherlv_10= ',' ( (lv_italics_11_0= ruleItalicsDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:1939:4: ( (lv_italics_11_0= ruleItalicsDefinition ) )
                    // InternalPdfMk.g:1940:5: (lv_italics_11_0= ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:1940:5: (lv_italics_11_0= ruleItalicsDefinition )
                    // InternalPdfMk.g:1941:6: lv_italics_11_0= ruleItalicsDefinition
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

            // InternalPdfMk.g:1959:3: (otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==28) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalPdfMk.g:1960:4: otherlv_12= ',' ( (lv_width_13_0= ruleWidthDefinition ) )
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextObjectAccess().getCommaKeyword_7_0());
                    			
                    // InternalPdfMk.g:1964:4: ( (lv_width_13_0= ruleWidthDefinition ) )
                    // InternalPdfMk.g:1965:5: (lv_width_13_0= ruleWidthDefinition )
                    {
                    // InternalPdfMk.g:1965:5: (lv_width_13_0= ruleWidthDefinition )
                    // InternalPdfMk.g:1966:6: lv_width_13_0= ruleWidthDefinition
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

            // InternalPdfMk.g:1984:3: (otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==30) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalPdfMk.g:1985:4: otherlv_14= ',' ( (lv_margin_15_0= ruleMarginDefinition ) )
                    {
                    otherlv_14=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextObjectAccess().getCommaKeyword_8_0());
                    			
                    // InternalPdfMk.g:1989:4: ( (lv_margin_15_0= ruleMarginDefinition ) )
                    // InternalPdfMk.g:1990:5: (lv_margin_15_0= ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:1990:5: (lv_margin_15_0= ruleMarginDefinition )
                    // InternalPdfMk.g:1991:6: lv_margin_15_0= ruleMarginDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getMarginMarginDefinitionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            // InternalPdfMk.g:2009:3: (otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPdfMk.g:2010:4: otherlv_16= ',' ( (lv_listCounter_17_0= ruleListCounterDefinition ) )
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getTextObjectAccess().getCommaKeyword_9_0());
                    			
                    // InternalPdfMk.g:2014:4: ( (lv_listCounter_17_0= ruleListCounterDefinition ) )
                    // InternalPdfMk.g:2015:5: (lv_listCounter_17_0= ruleListCounterDefinition )
                    {
                    // InternalPdfMk.g:2015:5: (lv_listCounter_17_0= ruleListCounterDefinition )
                    // InternalPdfMk.g:2016:6: lv_listCounter_17_0= ruleListCounterDefinition
                    {

                    						newCompositeNode(grammarAccess.getTextObjectAccess().getListCounterListCounterDefinitionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_listCounter_17_0=ruleListCounterDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextObjectRule());
                    						}
                    						set(
                    							current,
                    							"listCounter",
                    							true,
                    							"org.xtext.avi.PdfMk.ListCounterDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTextObjectAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalPdfMk.g:2042:1: entryRuleColumnTextObject returns [EObject current=null] : iv_ruleColumnTextObject= ruleColumnTextObject EOF ;
    public final EObject entryRuleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTextObject = null;


        try {
            // InternalPdfMk.g:2042:57: (iv_ruleColumnTextObject= ruleColumnTextObject EOF )
            // InternalPdfMk.g:2043:2: iv_ruleColumnTextObject= ruleColumnTextObject EOF
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
    // InternalPdfMk.g:2049:1: ruleColumnTextObject returns [EObject current=null] : ( (lv_value_0_0= ruleColumnDefinition ) ) ;
    public final EObject ruleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2055:2: ( ( (lv_value_0_0= ruleColumnDefinition ) ) )
            // InternalPdfMk.g:2056:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            {
            // InternalPdfMk.g:2056:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            // InternalPdfMk.g:2057:3: (lv_value_0_0= ruleColumnDefinition )
            {
            // InternalPdfMk.g:2057:3: (lv_value_0_0= ruleColumnDefinition )
            // InternalPdfMk.g:2058:4: lv_value_0_0= ruleColumnDefinition
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
    // InternalPdfMk.g:2078:1: entryRuleStyleObject returns [EObject current=null] : iv_ruleStyleObject= ruleStyleObject EOF ;
    public final EObject entryRuleStyleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObject = null;


        try {
            // InternalPdfMk.g:2078:52: (iv_ruleStyleObject= ruleStyleObject EOF )
            // InternalPdfMk.g:2079:2: iv_ruleStyleObject= ruleStyleObject EOF
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
    // InternalPdfMk.g:2085:1: ruleStyleObject returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' ) ;
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
            // InternalPdfMk.g:2091:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' ) )
            // InternalPdfMk.g:2092:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' )
            {
            // InternalPdfMk.g:2092:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}' )
            // InternalPdfMk.g:2093:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )? (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )? (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )? (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )? (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )? otherlv_12= '}'
            {
            // InternalPdfMk.g:2093:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalPdfMk.g:2094:4: (lv_key_0_0= RULE_ID )
            {
            // InternalPdfMk.g:2094:4: (lv_key_0_0= RULE_ID )
            // InternalPdfMk.g:2095:5: lv_key_0_0= RULE_ID
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
            		
            // InternalPdfMk.g:2115:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:2116:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:2116:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:2117:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_33); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2129:3: ( (lv_fontSize_3_0= ruleFontSizeDefinition ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPdfMk.g:2130:4: (lv_fontSize_3_0= ruleFontSizeDefinition )
                    {
                    // InternalPdfMk.g:2130:4: (lv_fontSize_3_0= ruleFontSizeDefinition )
                    // InternalPdfMk.g:2131:5: lv_fontSize_3_0= ruleFontSizeDefinition
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

            // InternalPdfMk.g:2148:3: (otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==17) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:2149:4: otherlv_4= ',' ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getStyleObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:2153:4: ( (lv_typeFace_5_0= ruleTypeFaceDefinition ) )
                    // InternalPdfMk.g:2154:5: (lv_typeFace_5_0= ruleTypeFaceDefinition )
                    {
                    // InternalPdfMk.g:2154:5: (lv_typeFace_5_0= ruleTypeFaceDefinition )
                    // InternalPdfMk.g:2155:6: lv_typeFace_5_0= ruleTypeFaceDefinition
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

            // InternalPdfMk.g:2173:3: (otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==25) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalPdfMk.g:2174:4: otherlv_6= ',' ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getStyleObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:2178:4: ( (lv_alignment_7_0= ruleTextAlignmentDefinition ) )
                    // InternalPdfMk.g:2179:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    {
                    // InternalPdfMk.g:2179:5: (lv_alignment_7_0= ruleTextAlignmentDefinition )
                    // InternalPdfMk.g:2180:6: lv_alignment_7_0= ruleTextAlignmentDefinition
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

            // InternalPdfMk.g:2198:3: (otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==26) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalPdfMk.g:2199:4: otherlv_8= ',' ( (lv_italics_9_0= ruleItalicsDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getStyleObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:2203:4: ( (lv_italics_9_0= ruleItalicsDefinition ) )
                    // InternalPdfMk.g:2204:5: (lv_italics_9_0= ruleItalicsDefinition )
                    {
                    // InternalPdfMk.g:2204:5: (lv_italics_9_0= ruleItalicsDefinition )
                    // InternalPdfMk.g:2205:6: lv_italics_9_0= ruleItalicsDefinition
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

            // InternalPdfMk.g:2223:3: (otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPdfMk.g:2224:4: otherlv_10= ',' ( (lv_margin_11_0= ruleMarginDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getStyleObjectAccess().getCommaKeyword_7_0());
                    			
                    // InternalPdfMk.g:2228:4: ( (lv_margin_11_0= ruleMarginDefinition ) )
                    // InternalPdfMk.g:2229:5: (lv_margin_11_0= ruleMarginDefinition )
                    {
                    // InternalPdfMk.g:2229:5: (lv_margin_11_0= ruleMarginDefinition )
                    // InternalPdfMk.g:2230:6: lv_margin_11_0= ruleMarginDefinition
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
    // InternalPdfMk.g:2256:1: entryRuleStyleObjects returns [EObject current=null] : iv_ruleStyleObjects= ruleStyleObjects EOF ;
    public final EObject entryRuleStyleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjects = null;


        try {
            // InternalPdfMk.g:2256:53: (iv_ruleStyleObjects= ruleStyleObjects EOF )
            // InternalPdfMk.g:2257:2: iv_ruleStyleObjects= ruleStyleObjects EOF
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
    // InternalPdfMk.g:2263:1: ruleStyleObjects returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleStyleObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2269:2: ( (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2270:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2270:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2271:3: otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:2275:3: ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* )
            // InternalPdfMk.g:2276:4: ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            {
            // InternalPdfMk.g:2276:4: ( (lv_value_1_0= ruleStyleObject ) )
            // InternalPdfMk.g:2277:5: (lv_value_1_0= ruleStyleObject )
            {
            // InternalPdfMk.g:2277:5: (lv_value_1_0= ruleStyleObject )
            // InternalPdfMk.g:2278:6: lv_value_1_0= ruleStyleObject
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

            // InternalPdfMk.g:2295:4: (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPdfMk.g:2296:5: otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_34); 

            	    					newLeafNode(otherlv_2, grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2300:5: ( (lv_value_3_0= ruleStyleObject ) )
            	    // InternalPdfMk.g:2301:6: (lv_value_3_0= ruleStyleObject )
            	    {
            	    // InternalPdfMk.g:2301:6: (lv_value_3_0= ruleStyleObject )
            	    // InternalPdfMk.g:2302:7: lv_value_3_0= ruleStyleObject
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
            	    break loop24;
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
    // InternalPdfMk.g:2329:1: entryRuleInnerColumnObject returns [EObject current=null] : iv_ruleInnerColumnObject= ruleInnerColumnObject EOF ;
    public final EObject entryRuleInnerColumnObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerColumnObject = null;


        try {
            // InternalPdfMk.g:2329:58: (iv_ruleInnerColumnObject= ruleInnerColumnObject EOF )
            // InternalPdfMk.g:2330:2: iv_ruleInnerColumnObject= ruleInnerColumnObject EOF
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
    // InternalPdfMk.g:2336:1: ruleInnerColumnObject returns [EObject current=null] : ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' ) ;
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
            // InternalPdfMk.g:2342:2: ( ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' ) )
            // InternalPdfMk.g:2343:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' )
            {
            // InternalPdfMk.g:2343:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']' )
            // InternalPdfMk.g:2344:3: ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) otherlv_10= ']'
            {
            // InternalPdfMk.g:2344:3: ( (lv_value_0_0= '[' ) )
            // InternalPdfMk.g:2345:4: (lv_value_0_0= '[' )
            {
            // InternalPdfMk.g:2345:4: (lv_value_0_0= '[' )
            // InternalPdfMk.g:2346:5: lv_value_0_0= '['
            {
            lv_value_0_0=(Token)match(input,23,FOLLOW_35); 

            					newLeafNode(lv_value_0_0, grammarAccess.getInnerColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInnerColumnObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "[");
            				

            }


            }

            // InternalPdfMk.g:2358:3: ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* )
            // InternalPdfMk.g:2359:4: ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            {
            // InternalPdfMk.g:2359:4: ( (lv_text_1_0= ruleStringObject ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:2360:5: (lv_text_1_0= ruleStringObject )
                    {
                    // InternalPdfMk.g:2360:5: (lv_text_1_0= ruleStringObject )
                    // InternalPdfMk.g:2361:6: lv_text_1_0= ruleStringObject
                    {

                    						newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalPdfMk.g:2378:4: (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_STRING) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPdfMk.g:2379:5: otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2383:5: ( (lv_text_3_0= ruleStringObject ) )
            	    // InternalPdfMk.g:2384:6: (lv_text_3_0= ruleStringObject )
            	    {
            	    // InternalPdfMk.g:2384:6: (lv_text_3_0= ruleStringObject )
            	    // InternalPdfMk.g:2385:7: lv_text_3_0= ruleStringObject
            	    {

            	    							newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_36);
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
            	    break loop26;
                }
            } while (true);


            }

            // InternalPdfMk.g:2404:3: ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* )
            // InternalPdfMk.g:2405:4: ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            {
            // InternalPdfMk.g:2405:4: ( (lv_textObject_4_0= ruleTextObject ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=22 && LA27_1<=23)) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalPdfMk.g:2406:5: (lv_textObject_4_0= ruleTextObject )
                    {
                    // InternalPdfMk.g:2406:5: (lv_textObject_4_0= ruleTextObject )
                    // InternalPdfMk.g:2407:6: lv_textObject_4_0= ruleTextObject
                    {

                    						newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalPdfMk.g:2424:4: (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==14) ) {
                        int LA28_3 = input.LA(3);

                        if ( ((LA28_3>=22 && LA28_3<=23)) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalPdfMk.g:2425:5: otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalPdfMk.g:2429:5: ( (lv_textObject_6_0= ruleTextObject ) )
            	    // InternalPdfMk.g:2430:6: (lv_textObject_6_0= ruleTextObject )
            	    {
            	    // InternalPdfMk.g:2430:6: (lv_textObject_6_0= ruleTextObject )
            	    // InternalPdfMk.g:2431:7: lv_textObject_6_0= ruleTextObject
            	    {

            	    							newCompositeNode(grammarAccess.getInnerColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_36);
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
            	    break loop28;
                }
            } while (true);


            }

            // InternalPdfMk.g:2450:3: ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* )
            // InternalPdfMk.g:2451:4: ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            {
            // InternalPdfMk.g:2451:4: ( (lv_column_7_0= ruleColumnDefinition ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPdfMk.g:2452:5: (lv_column_7_0= ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:2452:5: (lv_column_7_0= ruleColumnDefinition )
                    // InternalPdfMk.g:2453:6: lv_column_7_0= ruleColumnDefinition
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

            // InternalPdfMk.g:2470:4: (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPdfMk.g:2471:5: otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getInnerColumnObjectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:2475:5: ( (lv_column_9_0= ruleColumnDefinition ) )
            	    // InternalPdfMk.g:2476:6: (lv_column_9_0= ruleColumnDefinition )
            	    {
            	    // InternalPdfMk.g:2476:6: (lv_column_9_0= ruleColumnDefinition )
            	    // InternalPdfMk.g:2477:7: lv_column_9_0= ruleColumnDefinition
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
            	    break loop30;
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
    // InternalPdfMk.g:2504:1: entryRuleColumnObject returns [EObject current=null] : iv_ruleColumnObject= ruleColumnObject EOF ;
    public final EObject entryRuleColumnObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnObject = null;


        try {
            // InternalPdfMk.g:2504:53: (iv_ruleColumnObject= ruleColumnObject EOF )
            // InternalPdfMk.g:2505:2: iv_ruleColumnObject= ruleColumnObject EOF
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
    // InternalPdfMk.g:2511:1: ruleColumnObject returns [EObject current=null] : ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' ) ;
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
            // InternalPdfMk.g:2517:2: ( ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' ) )
            // InternalPdfMk.g:2518:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' )
            {
            // InternalPdfMk.g:2518:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']' )
            // InternalPdfMk.g:2519:3: ( (lv_value_0_0= '[' ) ) ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* ) ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* ) ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* ) ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* ) otherlv_13= ']'
            {
            // InternalPdfMk.g:2519:3: ( (lv_value_0_0= '[' ) )
            // InternalPdfMk.g:2520:4: (lv_value_0_0= '[' )
            {
            // InternalPdfMk.g:2520:4: (lv_value_0_0= '[' )
            // InternalPdfMk.g:2521:5: lv_value_0_0= '['
            {
            lv_value_0_0=(Token)match(input,23,FOLLOW_37); 

            					newLeafNode(lv_value_0_0, grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "[");
            				

            }


            }

            // InternalPdfMk.g:2533:3: ( ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )* )
            // InternalPdfMk.g:2534:4: ( (lv_text_1_0= ruleStringObject ) )? (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            {
            // InternalPdfMk.g:2534:4: ( (lv_text_1_0= ruleStringObject ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPdfMk.g:2535:5: (lv_text_1_0= ruleStringObject )
                    {
                    // InternalPdfMk.g:2535:5: (lv_text_1_0= ruleStringObject )
                    // InternalPdfMk.g:2536:6: lv_text_1_0= ruleStringObject
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalPdfMk.g:2553:4: (otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_STRING) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalPdfMk.g:2554:5: otherlv_2= ',' ( (lv_text_3_0= ruleStringObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getColumnObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2558:5: ( (lv_text_3_0= ruleStringObject ) )
            	    // InternalPdfMk.g:2559:6: (lv_text_3_0= ruleStringObject )
            	    {
            	    // InternalPdfMk.g:2559:6: (lv_text_3_0= ruleStringObject )
            	    // InternalPdfMk.g:2560:7: lv_text_3_0= ruleStringObject
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getTextStringObjectParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_38);
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
            	    break loop32;
                }
            } while (true);


            }

            // InternalPdfMk.g:2579:3: ( ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )* )
            // InternalPdfMk.g:2580:4: ( (lv_textObject_4_0= ruleTextObject ) )? (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            {
            // InternalPdfMk.g:2580:4: ( (lv_textObject_4_0= ruleTextObject ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14) ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>=22 && LA33_1<=23)) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalPdfMk.g:2581:5: (lv_textObject_4_0= ruleTextObject )
                    {
                    // InternalPdfMk.g:2581:5: (lv_textObject_4_0= ruleTextObject )
                    // InternalPdfMk.g:2582:6: lv_textObject_4_0= ruleTextObject
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalPdfMk.g:2599:4: (otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==14) ) {
                        int LA34_3 = input.LA(3);

                        if ( ((LA34_3>=22 && LA34_3<=23)) ) {
                            alt34=1;
                        }


                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalPdfMk.g:2600:5: otherlv_5= ',' ( (lv_textObject_6_0= ruleTextObject ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getColumnObjectAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalPdfMk.g:2604:5: ( (lv_textObject_6_0= ruleTextObject ) )
            	    // InternalPdfMk.g:2605:6: (lv_textObject_6_0= ruleTextObject )
            	    {
            	    // InternalPdfMk.g:2605:6: (lv_textObject_6_0= ruleTextObject )
            	    // InternalPdfMk.g:2606:7: lv_textObject_6_0= ruleTextObject
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getTextObjectTextObjectParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_38);
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
            	    break loop34;
                }
            } while (true);


            }

            // InternalPdfMk.g:2625:3: ( ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )* )
            // InternalPdfMk.g:2626:4: ( (lv_column_7_0= ruleColumnDefinition ) )? (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            {
            // InternalPdfMk.g:2626:4: ( (lv_column_7_0= ruleColumnDefinition ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPdfMk.g:2627:5: (lv_column_7_0= ruleColumnDefinition )
                    {
                    // InternalPdfMk.g:2627:5: (lv_column_7_0= ruleColumnDefinition )
                    // InternalPdfMk.g:2628:6: lv_column_7_0= ruleColumnDefinition
                    {

                    						newCompositeNode(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalPdfMk.g:2645:4: (otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==14) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalPdfMk.g:2646:5: otherlv_8= ',' ( (lv_column_9_0= ruleColumnDefinition ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getColumnObjectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:2650:5: ( (lv_column_9_0= ruleColumnDefinition ) )
            	    // InternalPdfMk.g:2651:6: (lv_column_9_0= ruleColumnDefinition )
            	    {
            	    // InternalPdfMk.g:2651:6: (lv_column_9_0= ruleColumnDefinition )
            	    // InternalPdfMk.g:2652:7: lv_column_9_0= ruleColumnDefinition
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getColumnColumnDefinitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_39);
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
            	    break loop36;
                }
            } while (true);


            }

            // InternalPdfMk.g:2671:3: ( ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )* )
            // InternalPdfMk.g:2672:4: ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )? (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )*
            {
            // InternalPdfMk.g:2672:4: ( (lv_innerColumn_10_0= ruleInnerColumnObject ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPdfMk.g:2673:5: (lv_innerColumn_10_0= ruleInnerColumnObject )
                    {
                    // InternalPdfMk.g:2673:5: (lv_innerColumn_10_0= ruleInnerColumnObject )
                    // InternalPdfMk.g:2674:6: lv_innerColumn_10_0= ruleInnerColumnObject
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

            // InternalPdfMk.g:2691:4: (otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==15) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPdfMk.g:2692:5: otherlv_11= ',' ( (lv_innerColumn_12_0= ruleInnerColumnObject ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_19); 

            	    					newLeafNode(otherlv_11, grammarAccess.getColumnObjectAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalPdfMk.g:2696:5: ( (lv_innerColumn_12_0= ruleInnerColumnObject ) )
            	    // InternalPdfMk.g:2697:6: (lv_innerColumn_12_0= ruleInnerColumnObject )
            	    {
            	    // InternalPdfMk.g:2697:6: (lv_innerColumn_12_0= ruleInnerColumnObject )
            	    // InternalPdfMk.g:2698:7: lv_innerColumn_12_0= ruleInnerColumnObject
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
            	    break loop38;
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
    // InternalPdfMk.g:2725:1: entryRuleImageObject returns [EObject current=null] : iv_ruleImageObject= ruleImageObject EOF ;
    public final EObject entryRuleImageObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageObject = null;


        try {
            // InternalPdfMk.g:2725:52: (iv_ruleImageObject= ruleImageObject EOF )
            // InternalPdfMk.g:2726:2: iv_ruleImageObject= ruleImageObject EOF
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
    // InternalPdfMk.g:2732:1: ruleImageObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' ) ;
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
            // InternalPdfMk.g:2738:2: ( ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' ) )
            // InternalPdfMk.g:2739:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' )
            {
            // InternalPdfMk.g:2739:2: ( ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}' )
            // InternalPdfMk.g:2740:3: ( (lv_value_0_0= '{' ) ) ( (lv_image_1_0= ruleImageDefintion ) )? (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )? (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )? (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )? (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )? (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )? otherlv_12= '}'
            {
            // InternalPdfMk.g:2740:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:2741:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:2741:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:2742:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_40); 

            					newLeafNode(lv_value_0_0, grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2754:3: ( (lv_image_1_0= ruleImageDefintion ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:2755:4: (lv_image_1_0= ruleImageDefintion )
                    {
                    // InternalPdfMk.g:2755:4: (lv_image_1_0= ruleImageDefintion )
                    // InternalPdfMk.g:2756:5: lv_image_1_0= ruleImageDefintion
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

            // InternalPdfMk.g:2773:3: (otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==28) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalPdfMk.g:2774:4: otherlv_2= ',' ( (lv_width_3_0= ruleImageWidthDefintion ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getImageObjectAccess().getCommaKeyword_2_0());
                    			
                    // InternalPdfMk.g:2778:4: ( (lv_width_3_0= ruleImageWidthDefintion ) )
                    // InternalPdfMk.g:2779:5: (lv_width_3_0= ruleImageWidthDefintion )
                    {
                    // InternalPdfMk.g:2779:5: (lv_width_3_0= ruleImageWidthDefintion )
                    // InternalPdfMk.g:2780:6: lv_width_3_0= ruleImageWidthDefintion
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

            // InternalPdfMk.g:2798:3: (otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==32) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalPdfMk.g:2799:4: otherlv_4= ',' ( (lv_height_5_0= ruleImageHeightDefintion ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getImageObjectAccess().getCommaKeyword_3_0());
                    			
                    // InternalPdfMk.g:2803:4: ( (lv_height_5_0= ruleImageHeightDefintion ) )
                    // InternalPdfMk.g:2804:5: (lv_height_5_0= ruleImageHeightDefintion )
                    {
                    // InternalPdfMk.g:2804:5: (lv_height_5_0= ruleImageHeightDefintion )
                    // InternalPdfMk.g:2805:6: lv_height_5_0= ruleImageHeightDefintion
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

            // InternalPdfMk.g:2823:3: (otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==15) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==35) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalPdfMk.g:2824:4: otherlv_6= ',' ( (lv_opacity_7_0= ruleImageOpacityDefinition ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_42); 

                    				newLeafNode(otherlv_6, grammarAccess.getImageObjectAccess().getCommaKeyword_4_0());
                    			
                    // InternalPdfMk.g:2828:4: ( (lv_opacity_7_0= ruleImageOpacityDefinition ) )
                    // InternalPdfMk.g:2829:5: (lv_opacity_7_0= ruleImageOpacityDefinition )
                    {
                    // InternalPdfMk.g:2829:5: (lv_opacity_7_0= ruleImageOpacityDefinition )
                    // InternalPdfMk.g:2830:6: lv_opacity_7_0= ruleImageOpacityDefinition
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

            // InternalPdfMk.g:2848:3: (otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==34) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalPdfMk.g:2849:4: otherlv_8= ',' ( (lv_fit_9_0= ruleImageFitDefinition ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getImageObjectAccess().getCommaKeyword_5_0());
                    			
                    // InternalPdfMk.g:2853:4: ( (lv_fit_9_0= ruleImageFitDefinition ) )
                    // InternalPdfMk.g:2854:5: (lv_fit_9_0= ruleImageFitDefinition )
                    {
                    // InternalPdfMk.g:2854:5: (lv_fit_9_0= ruleImageFitDefinition )
                    // InternalPdfMk.g:2855:6: lv_fit_9_0= ruleImageFitDefinition
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

            // InternalPdfMk.g:2873:3: (otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==15) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPdfMk.g:2874:4: otherlv_10= ',' ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) )
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getImageObjectAccess().getCommaKeyword_6_0());
                    			
                    // InternalPdfMk.g:2878:4: ( (lv_pageBreak_11_0= ruleImagePageBreakDefinition ) )
                    // InternalPdfMk.g:2879:5: (lv_pageBreak_11_0= ruleImagePageBreakDefinition )
                    {
                    // InternalPdfMk.g:2879:5: (lv_pageBreak_11_0= ruleImagePageBreakDefinition )
                    // InternalPdfMk.g:2880:6: lv_pageBreak_11_0= ruleImagePageBreakDefinition
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


    // $ANTLR start "entryRuleListObjectPropertiesWrapper"
    // InternalPdfMk.g:2906:1: entryRuleListObjectPropertiesWrapper returns [EObject current=null] : iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF ;
    public final EObject entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListObjectPropertiesWrapper = null;


        try {
            // InternalPdfMk.g:2906:68: (iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:2907:2: iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF
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
    // InternalPdfMk.g:2913:1: ruleListObjectPropertiesWrapper returns [EObject current=null] : ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) ) ;
    public final EObject ruleListObjectPropertiesWrapper() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;

        EObject lv_value_0_3 = null;

        EObject lv_value_0_4 = null;

        EObject lv_value_0_5 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2919:2: ( ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) ) )
            // InternalPdfMk.g:2920:2: ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) )
            {
            // InternalPdfMk.g:2920:2: ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) )
            // InternalPdfMk.g:2921:3: ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) )
            {
            // InternalPdfMk.g:2921:3: ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) )
            // InternalPdfMk.g:2922:4: (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition )
            {
            // InternalPdfMk.g:2922:4: (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt45=1;
                }
                break;
            case 37:
                {
                alt45=2;
                }
                break;
            case 38:
                {
                alt45=3;
                }
                break;
            case 39:
                {
                alt45=4;
                }
                break;
            case 40:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalPdfMk.g:2923:5: lv_value_0_1= ruleListReversedDefinition
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
                    // InternalPdfMk.g:2939:5: lv_value_0_2= ruleListCounterDefinition
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
                    // InternalPdfMk.g:2955:5: lv_value_0_3= ruleListTypeDefinition
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
                    // InternalPdfMk.g:2971:5: lv_value_0_4= ruleListColorDefinition
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
                    // InternalPdfMk.g:2987:5: lv_value_0_5= ruleListMarkerColorDefinition
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


    // $ANTLR start "entryRuleListElements"
    // InternalPdfMk.g:3008:1: entryRuleListElements returns [EObject current=null] : iv_ruleListElements= ruleListElements EOF ;
    public final EObject entryRuleListElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElements = null;


        try {
            // InternalPdfMk.g:3008:53: (iv_ruleListElements= ruleListElements EOF )
            // InternalPdfMk.g:3009:2: iv_ruleListElements= ruleListElements EOF
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
    // InternalPdfMk.g:3015:1: ruleListElements returns [EObject current=null] : ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition ) ;
    public final EObject ruleListElements() throws RecognitionException {
        EObject current = null;

        Token lv_elValues_0_0=null;
        EObject this_TextObject_1 = null;

        EObject this_ColumnDefinition_2 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3021:2: ( ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition ) )
            // InternalPdfMk.g:3022:2: ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition )
            {
            // InternalPdfMk.g:3022:2: ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==14) ) {
                int LA46_2 = input.LA(2);

                if ( ((LA46_2>=22 && LA46_2<=23)) ) {
                    alt46=2;
                }
                else if ( (LA46_2==21||LA46_2==29) ) {
                    alt46=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalPdfMk.g:3023:3: ( (lv_elValues_0_0= RULE_STRING ) )
                    {
                    // InternalPdfMk.g:3023:3: ( (lv_elValues_0_0= RULE_STRING ) )
                    // InternalPdfMk.g:3024:4: (lv_elValues_0_0= RULE_STRING )
                    {
                    // InternalPdfMk.g:3024:4: (lv_elValues_0_0= RULE_STRING )
                    // InternalPdfMk.g:3025:5: lv_elValues_0_0= RULE_STRING
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
                    // InternalPdfMk.g:3042:3: this_TextObject_1= ruleTextObject
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
                    // InternalPdfMk.g:3051:3: this_ColumnDefinition_2= ruleColumnDefinition
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
    // InternalPdfMk.g:3063:1: entryRuleListObject returns [EObject current=null] : iv_ruleListObject= ruleListObject EOF ;
    public final EObject entryRuleListObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListObject = null;


        try {
            // InternalPdfMk.g:3063:51: (iv_ruleListObject= ruleListObject EOF )
            // InternalPdfMk.g:3064:2: iv_ruleListObject= ruleListObject EOF
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
    // InternalPdfMk.g:3070:1: ruleListObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' ) ;
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
            // InternalPdfMk.g:3076:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' ) )
            // InternalPdfMk.g:3077:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' )
            {
            // InternalPdfMk.g:3077:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' )
            // InternalPdfMk.g:3078:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}'
            {
            // InternalPdfMk.g:3078:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:3079:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:3079:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:3080:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_45); 

            					newLeafNode(lv_value_0_0, grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:3092:3: ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=36 && LA48_0<=40)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPdfMk.g:3093:4: ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )*
                    {
                    // InternalPdfMk.g:3093:4: ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) )
                    // InternalPdfMk.g:3094:5: (lv_properties_1_0= ruleListObjectPropertiesWrapper )
                    {
                    // InternalPdfMk.g:3094:5: (lv_properties_1_0= ruleListObjectPropertiesWrapper )
                    // InternalPdfMk.g:3095:6: lv_properties_1_0= ruleListObjectPropertiesWrapper
                    {

                    						newCompositeNode(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_2=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getListObjectAccess().getCommaKeyword_1_1());
                    			
                    // InternalPdfMk.g:3116:4: ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=36 && LA47_0<=40)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalPdfMk.g:3117:5: ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ','
                    	    {
                    	    // InternalPdfMk.g:3117:5: ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) )
                    	    // InternalPdfMk.g:3118:6: (lv_properties_3_0= ruleListObjectPropertiesWrapper )
                    	    {
                    	    // InternalPdfMk.g:3118:6: (lv_properties_3_0= ruleListObjectPropertiesWrapper )
                    	    // InternalPdfMk.g:3119:7: lv_properties_3_0= ruleListObjectPropertiesWrapper
                    	    {

                    	    							newCompositeNode(grammarAccess.getListObjectAccess().getPropertiesListObjectPropertiesWrapperParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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

                    	    otherlv_4=(Token)match(input,15,FOLLOW_45); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getListObjectAccess().getCommaKeyword_1_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPdfMk.g:3142:3: (otherlv_5= 'ul' | otherlv_6= 'ol' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            else if ( (LA49_0==44) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPdfMk.g:3143:4: otherlv_5= 'ul'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getListObjectAccess().getUlKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:3148:4: otherlv_6= 'ol'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getListObjectAccess().getOlKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getListObjectAccess().getColonKeyword_3());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getListObjectAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalPdfMk.g:3161:3: ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* )
            // InternalPdfMk.g:3162:4: ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )*
            {
            // InternalPdfMk.g:3162:4: ( (lv_elements_9_0= ruleListElements ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING||LA50_0==14) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPdfMk.g:3163:5: (lv_elements_9_0= ruleListElements )
                    {
                    // InternalPdfMk.g:3163:5: (lv_elements_9_0= ruleListElements )
                    // InternalPdfMk.g:3164:6: lv_elements_9_0= ruleListElements
                    {

                    						newCompositeNode(grammarAccess.getListObjectAccess().getElementsListElementsParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalPdfMk.g:3181:4: (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==15) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPdfMk.g:3182:5: otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_22); 

            	    					newLeafNode(otherlv_10, grammarAccess.getListObjectAccess().getCommaKeyword_5_1_0());
            	    				
            	    // InternalPdfMk.g:3186:5: ( (lv_elemtens_11_0= ruleListElements ) )
            	    // InternalPdfMk.g:3187:6: (lv_elemtens_11_0= ruleListElements )
            	    {
            	    // InternalPdfMk.g:3187:6: (lv_elemtens_11_0= ruleListElements )
            	    // InternalPdfMk.g:3188:7: lv_elemtens_11_0= ruleListElements
            	    {

            	    							newCompositeNode(grammarAccess.getListObjectAccess().getElemtensListElementsParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    break loop51;
                }
            } while (true);


            }

            otherlv_12=(Token)match(input,24,FOLLOW_9); 

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
    // InternalPdfMk.g:3219:1: entryRuleTableObject returns [EObject current=null] : iv_ruleTableObject= ruleTableObject EOF ;
    public final EObject entryRuleTableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableObject = null;


        try {
            // InternalPdfMk.g:3219:52: (iv_ruleTableObject= ruleTableObject EOF )
            // InternalPdfMk.g:3220:2: iv_ruleTableObject= ruleTableObject EOF
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
    // InternalPdfMk.g:3226:1: ruleTableObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_style_1_0 = null;

        EObject lv_table_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3232:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' ) )
            // InternalPdfMk.g:3233:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:3233:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' )
            // InternalPdfMk.g:3234:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}'
            {
            // InternalPdfMk.g:3234:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:3235:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:3235:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:3236:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_46); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:3248:3: ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==21) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPdfMk.g:3249:4: ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ','
                    {
                    // InternalPdfMk.g:3249:4: ( (lv_style_1_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:3250:5: (lv_style_1_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:3250:5: (lv_style_1_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:3251:6: lv_style_1_0= ruleTextStyleDefinition
                    {

                    						newCompositeNode(grammarAccess.getTableObjectAccess().getStyleTextStyleDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_2=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableObjectAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPdfMk.g:3273:3: ( (lv_table_3_0= ruleTableDefinition ) )
            // InternalPdfMk.g:3274:4: (lv_table_3_0= ruleTableDefinition )
            {
            // InternalPdfMk.g:3274:4: (lv_table_3_0= ruleTableDefinition )
            // InternalPdfMk.g:3275:5: lv_table_3_0= ruleTableDefinition
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
    // InternalPdfMk.g:3300:1: entryRuleContentObject returns [EObject current=null] : iv_ruleContentObject= ruleContentObject EOF ;
    public final EObject entryRuleContentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObject = null;


        try {
            // InternalPdfMk.g:3300:54: (iv_ruleContentObject= ruleContentObject EOF )
            // InternalPdfMk.g:3301:2: iv_ruleContentObject= ruleContentObject EOF
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
    // InternalPdfMk.g:3307:1: ruleContentObject returns [EObject current=null] : ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) ) ;
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
            // InternalPdfMk.g:3313:2: ( ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) ) )
            // InternalPdfMk.g:3314:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) )
            {
            // InternalPdfMk.g:3314:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) )
            // InternalPdfMk.g:3315:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) )
            {
            // InternalPdfMk.g:3315:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) )
            // InternalPdfMk.g:3316:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )
            {
            // InternalPdfMk.g:3316:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )
            int alt53=6;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalPdfMk.g:3317:5: lv_value_0_1= ruleStringObject
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
                    // InternalPdfMk.g:3333:5: lv_value_0_2= ruleTextObject
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
                    // InternalPdfMk.g:3349:5: lv_value_0_3= ruleColumnTextObject
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
                    // InternalPdfMk.g:3365:5: lv_value_0_4= ruleImageObject
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
                    // InternalPdfMk.g:3381:5: lv_value_0_5= ruleListObject
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
                    // InternalPdfMk.g:3397:5: lv_value_0_6= ruleTableObject
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
    // InternalPdfMk.g:3418:1: entryRuleContentObjects returns [EObject current=null] : iv_ruleContentObjects= ruleContentObjects EOF ;
    public final EObject entryRuleContentObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObjects = null;


        try {
            // InternalPdfMk.g:3418:55: (iv_ruleContentObjects= ruleContentObjects EOF )
            // InternalPdfMk.g:3419:2: iv_ruleContentObjects= ruleContentObjects EOF
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
    // InternalPdfMk.g:3425:1: ruleContentObjects returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleContentObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3431:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' ) )
            // InternalPdfMk.g:3432:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' )
            {
            // InternalPdfMk.g:3432:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']' )
            // InternalPdfMk.g:3433:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPdfMk.g:3437:3: ( ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING||LA55_0==14) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPdfMk.g:3438:4: ( (lv_value_1_0= ruleContentObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )*
                    {
                    // InternalPdfMk.g:3438:4: ( (lv_value_1_0= ruleContentObject ) )
                    // InternalPdfMk.g:3439:5: (lv_value_1_0= ruleContentObject )
                    {
                    // InternalPdfMk.g:3439:5: (lv_value_1_0= ruleContentObject )
                    // InternalPdfMk.g:3440:6: lv_value_1_0= ruleContentObject
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

                    // InternalPdfMk.g:3457:4: (otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalPdfMk.g:3458:5: otherlv_2= ',' ( (lv_value_3_0= ruleContentObject ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getContentObjectsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPdfMk.g:3462:5: ( (lv_value_3_0= ruleContentObject ) )
                    	    // InternalPdfMk.g:3463:6: (lv_value_3_0= ruleContentObject )
                    	    {
                    	    // InternalPdfMk.g:3463:6: (lv_value_3_0= ruleContentObject )
                    	    // InternalPdfMk.g:3464:7: lv_value_3_0= ruleContentObject
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
                    	    break loop54;
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
    // InternalPdfMk.g:3491:1: entryRuleStyles returns [EObject current=null] : iv_ruleStyles= ruleStyles EOF ;
    public final EObject entryRuleStyles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyles = null;


        try {
            // InternalPdfMk.g:3491:47: (iv_ruleStyles= ruleStyles EOF )
            // InternalPdfMk.g:3492:2: iv_ruleStyles= ruleStyles EOF
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
    // InternalPdfMk.g:3498:1: ruleStyles returns [EObject current=null] : ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) ;
    public final EObject ruleStyles() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3504:2: ( ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) )
            // InternalPdfMk.g:3505:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            {
            // InternalPdfMk.g:3505:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            // InternalPdfMk.g:3506:3: ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) )
            {
            // InternalPdfMk.g:3506:3: ( (lv_key_0_0= 'styles' ) )
            // InternalPdfMk.g:3507:4: (lv_key_0_0= 'styles' )
            {
            // InternalPdfMk.g:3507:4: (lv_key_0_0= 'styles' )
            // InternalPdfMk.g:3508:5: lv_key_0_0= 'styles'
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
            		
            // InternalPdfMk.g:3524:3: ( (lv_value_2_0= ruleStyleObjects ) )
            // InternalPdfMk.g:3525:4: (lv_value_2_0= ruleStyleObjects )
            {
            // InternalPdfMk.g:3525:4: (lv_value_2_0= ruleStyleObjects )
            // InternalPdfMk.g:3526:5: lv_value_2_0= ruleStyleObjects
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
    // InternalPdfMk.g:3547:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPdfMk.g:3547:48: (iv_ruleContent= ruleContent EOF )
            // InternalPdfMk.g:3548:2: iv_ruleContent= ruleContent EOF
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
    // InternalPdfMk.g:3554:1: ruleContent returns [EObject current=null] : ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3560:2: ( ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) )
            // InternalPdfMk.g:3561:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            {
            // InternalPdfMk.g:3561:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            // InternalPdfMk.g:3562:3: ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) )
            {
            // InternalPdfMk.g:3562:3: ( (lv_key_0_0= 'content' ) )
            // InternalPdfMk.g:3563:4: (lv_key_0_0= 'content' )
            {
            // InternalPdfMk.g:3563:4: (lv_key_0_0= 'content' )
            // InternalPdfMk.g:3564:5: lv_key_0_0= 'content'
            {
            lv_key_0_0=(Token)match(input,46,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getContentAccess().getKeyContentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "content");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:3580:3: ( (lv_value_2_0= ruleContentObjects ) )
            // InternalPdfMk.g:3581:4: (lv_value_2_0= ruleContentObjects )
            {
            // InternalPdfMk.g:3581:4: (lv_value_2_0= ruleContentObjects )
            // InternalPdfMk.g:3582:5: lv_value_2_0= ruleContentObjects
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


    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\17\1\uffff\1\22\4\uffff\1\4\1\17\1\35";
    static final String dfa_3s = "\1\16\1\uffff\1\54\1\uffff\1\22\4\uffff\1\4\1\17\1\52";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\6\1\3\1\4\1\5\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\1\2",
            "",
            "\2\7\4\uffff\1\4\2\3\5\uffff\1\6\1\uffff\1\7\4\uffff\5\10\1\uffff\1\5\2\10",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\6\14\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3316:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000818000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008018000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000100C010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000180C010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000180C000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080018000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000019F000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001004010L});

}