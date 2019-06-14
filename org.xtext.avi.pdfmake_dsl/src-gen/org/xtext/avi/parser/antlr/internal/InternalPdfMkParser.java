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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'dd'", "'='", "'{'", "','", "'}'", "'bold'", "':'", "'true'", "'false'", "'*'", "'style'", "'text'", "'alignment'", "'italics'", "'fontSize'", "'width'", "'columns'", "'margin'", "'['", "']'", "'image'", "'height'", "'pageBreak'", "'fit'", "'opacity'", "'reversed'", "'counter'", "'type'", "'color'", "'markerColor'", "'body'", "'table'", "'ul'", "'ol'", "'styles'", "'content'"
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
    public static final int T__47=47;
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
    // InternalPdfMk.g:275:1: ruleColumnTextWidthType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleColumnTextWidthType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPdfMk.g:281:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalPdfMk.g:282:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalPdfMk.g:282:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPdfMk.g:283:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getColumnTextWidthTypeAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:291:3: kw= '*'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColumnTextWidthTypeAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleColumnTextWidthType"


    // $ANTLR start "entryRuleTextStyleDefinition"
    // InternalPdfMk.g:300:1: entryRuleTextStyleDefinition returns [EObject current=null] : iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF ;
    public final EObject entryRuleTextStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextStyleDefinition = null;


        try {
            // InternalPdfMk.g:300:60: (iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF )
            // InternalPdfMk.g:301:2: iv_ruleTextStyleDefinition= ruleTextStyleDefinition EOF
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
    // InternalPdfMk.g:307:1: ruleTextStyleDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:313:2: ( ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:314:2: ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:314:2: ( ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:315:3: ( (lv_key_0_0= 'style' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:315:3: ( (lv_key_0_0= 'style' ) )
            // InternalPdfMk.g:316:4: (lv_key_0_0= 'style' )
            {
            // InternalPdfMk.g:316:4: (lv_key_0_0= 'style' )
            // InternalPdfMk.g:317:5: lv_key_0_0= 'style'
            {
            lv_key_0_0=(Token)match(input,22,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextStyleDefinitionAccess().getKeyStyleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextStyleDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "style");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTextStyleDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:333:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:334:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:334:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:335:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:355:1: entryRuleTextDefinition returns [EObject current=null] : iv_ruleTextDefinition= ruleTextDefinition EOF ;
    public final EObject entryRuleTextDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextDefinition = null;


        try {
            // InternalPdfMk.g:355:55: (iv_ruleTextDefinition= ruleTextDefinition EOF )
            // InternalPdfMk.g:356:2: iv_ruleTextDefinition= ruleTextDefinition EOF
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
    // InternalPdfMk.g:362:1: ruleTextDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:368:2: ( ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:369:2: ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:369:2: ( ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:370:3: ( (lv_key_0_0= 'text' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:370:3: ( (lv_key_0_0= 'text' ) )
            // InternalPdfMk.g:371:4: (lv_key_0_0= 'text' )
            {
            // InternalPdfMk.g:371:4: (lv_key_0_0= 'text' )
            // InternalPdfMk.g:372:5: lv_key_0_0= 'text'
            {
            lv_key_0_0=(Token)match(input,23,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextDefinitionAccess().getKeyTextKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "text");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTextDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:388:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:389:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:389:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:390:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:410:1: entryRuleTextAlignmentDefinition returns [EObject current=null] : iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF ;
    public final EObject entryRuleTextAlignmentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAlignmentDefinition = null;


        try {
            // InternalPdfMk.g:410:64: (iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF )
            // InternalPdfMk.g:411:2: iv_ruleTextAlignmentDefinition= ruleTextAlignmentDefinition EOF
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
    // InternalPdfMk.g:417:1: ruleTextAlignmentDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextAlignmentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:423:2: ( ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:424:2: ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:424:2: ( ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:425:3: ( (lv_key_0_0= 'alignment' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:425:3: ( (lv_key_0_0= 'alignment' ) )
            // InternalPdfMk.g:426:4: (lv_key_0_0= 'alignment' )
            {
            // InternalPdfMk.g:426:4: (lv_key_0_0= 'alignment' )
            // InternalPdfMk.g:427:5: lv_key_0_0= 'alignment'
            {
            lv_key_0_0=(Token)match(input,24,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTextAlignmentDefinitionAccess().getKeyAlignmentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAlignmentDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "alignment");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAlignmentDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:443:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:444:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:444:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:445:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:465:1: entryRuleItalicsDefinition returns [EObject current=null] : iv_ruleItalicsDefinition= ruleItalicsDefinition EOF ;
    public final EObject entryRuleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicsDefinition = null;


        try {
            // InternalPdfMk.g:465:58: (iv_ruleItalicsDefinition= ruleItalicsDefinition EOF )
            // InternalPdfMk.g:466:2: iv_ruleItalicsDefinition= ruleItalicsDefinition EOF
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
    // InternalPdfMk.g:472:1: ruleItalicsDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleItalicsDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:478:2: ( ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:479:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:479:2: ( ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:480:3: ( (lv_key_0_0= 'italics' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
            {
            // InternalPdfMk.g:480:3: ( (lv_key_0_0= 'italics' ) )
            // InternalPdfMk.g:481:4: (lv_key_0_0= 'italics' )
            {
            // InternalPdfMk.g:481:4: (lv_key_0_0= 'italics' )
            // InternalPdfMk.g:482:5: lv_key_0_0= 'italics'
            {
            lv_key_0_0=(Token)match(input,25,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getItalicsDefinitionAccess().getKeyItalicsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItalicsDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "italics");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getItalicsDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:498:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:499:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:499:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:500:5: lv_value_2_0= ruleBooleanType
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
    // InternalPdfMk.g:521:1: entryRuleFontSizeDefinition returns [EObject current=null] : iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF ;
    public final EObject entryRuleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSizeDefinition = null;


        try {
            // InternalPdfMk.g:521:59: (iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF )
            // InternalPdfMk.g:522:2: iv_ruleFontSizeDefinition= ruleFontSizeDefinition EOF
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
    // InternalPdfMk.g:528:1: ruleFontSizeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFontSizeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:534:2: ( ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:535:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:535:2: ( ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:536:3: ( (lv_key_0_0= 'fontSize' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:536:3: ( (lv_key_0_0= 'fontSize' ) )
            // InternalPdfMk.g:537:4: (lv_key_0_0= 'fontSize' )
            {
            // InternalPdfMk.g:537:4: (lv_key_0_0= 'fontSize' )
            // InternalPdfMk.g:538:5: lv_key_0_0= 'fontSize'
            {
            lv_key_0_0=(Token)match(input,26,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getFontSizeDefinitionAccess().getKeyFontSizeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFontSizeDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "fontSize");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFontSizeDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:554:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:555:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:555:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:556:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:576:1: entryRuleWidthDefinition returns [EObject current=null] : iv_ruleWidthDefinition= ruleWidthDefinition EOF ;
    public final EObject entryRuleWidthDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidthDefinition = null;


        try {
            // InternalPdfMk.g:576:56: (iv_ruleWidthDefinition= ruleWidthDefinition EOF )
            // InternalPdfMk.g:577:2: iv_ruleWidthDefinition= ruleWidthDefinition EOF
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
    // InternalPdfMk.g:583:1: ruleWidthDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) ) ;
    public final EObject ruleWidthDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:589:2: ( ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) ) )
            // InternalPdfMk.g:590:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) )
            {
            // InternalPdfMk.g:590:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) ) )
            // InternalPdfMk.g:591:3: ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleColumnTextWidthType ) )
            {
            // InternalPdfMk.g:591:3: ( (lv_key_0_0= 'width' ) )
            // InternalPdfMk.g:592:4: (lv_key_0_0= 'width' )
            {
            // InternalPdfMk.g:592:4: (lv_key_0_0= 'width' )
            // InternalPdfMk.g:593:5: lv_key_0_0= 'width'
            {
            lv_key_0_0=(Token)match(input,27,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getWidthDefinitionAccess().getKeyWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidthDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "width");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getWidthDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:609:3: ( (lv_value_2_0= ruleColumnTextWidthType ) )
            // InternalPdfMk.g:610:4: (lv_value_2_0= ruleColumnTextWidthType )
            {
            // InternalPdfMk.g:610:4: (lv_value_2_0= ruleColumnTextWidthType )
            // InternalPdfMk.g:611:5: lv_value_2_0= ruleColumnTextWidthType
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
    // InternalPdfMk.g:632:1: entryRuleColumnDefinition returns [EObject current=null] : iv_ruleColumnDefinition= ruleColumnDefinition EOF ;
    public final EObject entryRuleColumnDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDefinition = null;


        try {
            // InternalPdfMk.g:632:57: (iv_ruleColumnDefinition= ruleColumnDefinition EOF )
            // InternalPdfMk.g:633:2: iv_ruleColumnDefinition= ruleColumnDefinition EOF
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
    // InternalPdfMk.g:639:1: ruleColumnDefinition returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' ) ;
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
            // InternalPdfMk.g:645:2: ( (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' ) )
            // InternalPdfMk.g:646:2: (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' )
            {
            // InternalPdfMk.g:646:2: (otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}' )
            // InternalPdfMk.g:647:3: otherlv_0= '{' ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_key_3_0= 'columns' ) ) otherlv_4= ':' ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnDefinitionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:651:3: ( ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPdfMk.g:652:4: ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) ) otherlv_2= ','
                    {
                    // InternalPdfMk.g:652:4: ( (lv_globalStyle_1_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:653:5: (lv_globalStyle_1_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:653:5: (lv_globalStyle_1_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:654:6: lv_globalStyle_1_0= ruleTextStyleDefinition
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

            // InternalPdfMk.g:676:3: ( (lv_key_3_0= 'columns' ) )
            // InternalPdfMk.g:677:4: (lv_key_3_0= 'columns' )
            {
            // InternalPdfMk.g:677:4: (lv_key_3_0= 'columns' )
            // InternalPdfMk.g:678:5: lv_key_3_0= 'columns'
            {
            lv_key_3_0=(Token)match(input,28,FOLLOW_10); 

            					newLeafNode(lv_key_3_0, grammarAccess.getColumnDefinitionAccess().getKeyColumnsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_3_0, "columns");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnDefinitionAccess().getColonKeyword_3());
            		
            // InternalPdfMk.g:694:3: ( ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )* )
            // InternalPdfMk.g:695:4: ( (lv_value_5_0= ruleColumnObject ) )? (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )*
            {
            // InternalPdfMk.g:695:4: ( (lv_value_5_0= ruleColumnObject ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPdfMk.g:696:5: (lv_value_5_0= ruleColumnObject )
                    {
                    // InternalPdfMk.g:696:5: (lv_value_5_0= ruleColumnObject )
                    // InternalPdfMk.g:697:6: lv_value_5_0= ruleColumnObject
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

            // InternalPdfMk.g:714:4: (otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPdfMk.g:715:5: otherlv_6= ',' ( (lv_value_7_0= ruleColumnObject ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_19); 

            	    					newLeafNode(otherlv_6, grammarAccess.getColumnDefinitionAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalPdfMk.g:719:5: ( (lv_value_7_0= ruleColumnObject ) )
            	    // InternalPdfMk.g:720:6: (lv_value_7_0= ruleColumnObject )
            	    {
            	    // InternalPdfMk.g:720:6: (lv_value_7_0= ruleColumnObject )
            	    // InternalPdfMk.g:721:7: lv_value_7_0= ruleColumnObject
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
    // InternalPdfMk.g:748:1: entryRuleMarginDefinition returns [EObject current=null] : iv_ruleMarginDefinition= ruleMarginDefinition EOF ;
    public final EObject entryRuleMarginDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarginDefinition = null;


        try {
            // InternalPdfMk.g:748:57: (iv_ruleMarginDefinition= ruleMarginDefinition EOF )
            // InternalPdfMk.g:749:2: iv_ruleMarginDefinition= ruleMarginDefinition EOF
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
    // InternalPdfMk.g:755:1: ruleMarginDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' ) ;
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
            // InternalPdfMk.g:761:2: ( ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' ) )
            // InternalPdfMk.g:762:2: ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' )
            {
            // InternalPdfMk.g:762:2: ( ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']' )
            // InternalPdfMk.g:763:3: ( (lv_key_0_0= 'margin' ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_INT ) )? (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )* otherlv_6= ']'
            {
            // InternalPdfMk.g:763:3: ( (lv_key_0_0= 'margin' ) )
            // InternalPdfMk.g:764:4: (lv_key_0_0= 'margin' )
            {
            // InternalPdfMk.g:764:4: (lv_key_0_0= 'margin' )
            // InternalPdfMk.g:765:5: lv_key_0_0= 'margin'
            {
            lv_key_0_0=(Token)match(input,29,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getMarginDefinitionAccess().getKeyMarginKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarginDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "margin");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMarginDefinitionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMarginDefinitionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPdfMk.g:785:3: ( (lv_values_3_0= RULE_INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPdfMk.g:786:4: (lv_values_3_0= RULE_INT )
                    {
                    // InternalPdfMk.g:786:4: (lv_values_3_0= RULE_INT )
                    // InternalPdfMk.g:787:5: lv_values_3_0= RULE_INT
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

            // InternalPdfMk.g:803:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPdfMk.g:804:4: otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMarginDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPdfMk.g:808:4: ( (lv_values_5_0= RULE_INT ) )
            	    // InternalPdfMk.g:809:5: (lv_values_5_0= RULE_INT )
            	    {
            	    // InternalPdfMk.g:809:5: (lv_values_5_0= RULE_INT )
            	    // InternalPdfMk.g:810:6: lv_values_5_0= RULE_INT
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

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalPdfMk.g:835:1: entryRuleImageDefintion returns [EObject current=null] : iv_ruleImageDefintion= ruleImageDefintion EOF ;
    public final EObject entryRuleImageDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDefintion = null;


        try {
            // InternalPdfMk.g:835:55: (iv_ruleImageDefintion= ruleImageDefintion EOF )
            // InternalPdfMk.g:836:2: iv_ruleImageDefintion= ruleImageDefintion EOF
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
    // InternalPdfMk.g:842:1: ruleImageDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImageDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:848:2: ( ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:849:2: ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:849:2: ( ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:850:3: ( (lv_key_0_0= 'image' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:850:3: ( (lv_key_0_0= 'image' ) )
            // InternalPdfMk.g:851:4: (lv_key_0_0= 'image' )
            {
            // InternalPdfMk.g:851:4: (lv_key_0_0= 'image' )
            // InternalPdfMk.g:852:5: lv_key_0_0= 'image'
            {
            lv_key_0_0=(Token)match(input,32,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageDefintionAccess().getKeyImageKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "image");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImageDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:868:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:869:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:869:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:870:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:890:1: entryRuleImageWidthDefintion returns [EObject current=null] : iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF ;
    public final EObject entryRuleImageWidthDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageWidthDefintion = null;


        try {
            // InternalPdfMk.g:890:60: (iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF )
            // InternalPdfMk.g:891:2: iv_ruleImageWidthDefintion= ruleImageWidthDefintion EOF
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
    // InternalPdfMk.g:897:1: ruleImageWidthDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageWidthDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:903:2: ( ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:904:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:904:2: ( ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:905:3: ( (lv_key_0_0= 'width' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:905:3: ( (lv_key_0_0= 'width' ) )
            // InternalPdfMk.g:906:4: (lv_key_0_0= 'width' )
            {
            // InternalPdfMk.g:906:4: (lv_key_0_0= 'width' )
            // InternalPdfMk.g:907:5: lv_key_0_0= 'width'
            {
            lv_key_0_0=(Token)match(input,27,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageWidthDefintionAccess().getKeyWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageWidthDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "width");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImageWidthDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:923:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:924:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:924:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:925:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:945:1: entryRuleImageHeightDefintion returns [EObject current=null] : iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF ;
    public final EObject entryRuleImageHeightDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageHeightDefintion = null;


        try {
            // InternalPdfMk.g:945:61: (iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF )
            // InternalPdfMk.g:946:2: iv_ruleImageHeightDefintion= ruleImageHeightDefintion EOF
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
    // InternalPdfMk.g:952:1: ruleImageHeightDefintion returns [EObject current=null] : ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageHeightDefintion() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:958:2: ( ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:959:2: ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:959:2: ( ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:960:3: ( (lv_key_0_0= 'height' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:960:3: ( (lv_key_0_0= 'height' ) )
            // InternalPdfMk.g:961:4: (lv_key_0_0= 'height' )
            {
            // InternalPdfMk.g:961:4: (lv_key_0_0= 'height' )
            // InternalPdfMk.g:962:5: lv_key_0_0= 'height'
            {
            lv_key_0_0=(Token)match(input,33,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageHeightDefintionAccess().getKeyHeightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageHeightDefintionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "height");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImageHeightDefintionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:978:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:979:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:979:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:980:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:1000:1: entryRuleImagePageBreakDefinition returns [EObject current=null] : iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF ;
    public final EObject entryRuleImagePageBreakDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagePageBreakDefinition = null;


        try {
            // InternalPdfMk.g:1000:65: (iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF )
            // InternalPdfMk.g:1001:2: iv_ruleImagePageBreakDefinition= ruleImagePageBreakDefinition EOF
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
    // InternalPdfMk.g:1007:1: ruleImagePageBreakDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImagePageBreakDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1013:2: ( ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1014:2: ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1014:2: ( ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1015:3: ( (lv_key_0_0= 'pageBreak' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1015:3: ( (lv_key_0_0= 'pageBreak' ) )
            // InternalPdfMk.g:1016:4: (lv_key_0_0= 'pageBreak' )
            {
            // InternalPdfMk.g:1016:4: (lv_key_0_0= 'pageBreak' )
            // InternalPdfMk.g:1017:5: lv_key_0_0= 'pageBreak'
            {
            lv_key_0_0=(Token)match(input,34,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImagePageBreakDefinitionAccess().getKeyPageBreakKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImagePageBreakDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "pageBreak");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImagePageBreakDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1033:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1034:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1034:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1035:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1055:1: entryRuleImageFitDefinition returns [EObject current=null] : iv_ruleImageFitDefinition= ruleImageFitDefinition EOF ;
    public final EObject entryRuleImageFitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageFitDefinition = null;


        try {
            // InternalPdfMk.g:1055:59: (iv_ruleImageFitDefinition= ruleImageFitDefinition EOF )
            // InternalPdfMk.g:1056:2: iv_ruleImageFitDefinition= ruleImageFitDefinition EOF
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
    // InternalPdfMk.g:1062:1: ruleImageFitDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' ) ;
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
            // InternalPdfMk.g:1068:2: ( ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' ) )
            // InternalPdfMk.g:1069:2: ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' )
            {
            // InternalPdfMk.g:1069:2: ( ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']' )
            // InternalPdfMk.g:1070:3: ( (lv_key_0_0= 'fit' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( (lv_values_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) ) otherlv_6= ']'
            {
            // InternalPdfMk.g:1070:3: ( (lv_key_0_0= 'fit' ) )
            // InternalPdfMk.g:1071:4: (lv_key_0_0= 'fit' )
            {
            // InternalPdfMk.g:1071:4: (lv_key_0_0= 'fit' )
            // InternalPdfMk.g:1072:5: lv_key_0_0= 'fit'
            {
            lv_key_0_0=(Token)match(input,35,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageFitDefinitionAccess().getKeyFitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "fit");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getImageFitDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1088:3: ( (lv_value_2_0= '[' ) )
            // InternalPdfMk.g:1089:4: (lv_value_2_0= '[' )
            {
            // InternalPdfMk.g:1089:4: (lv_value_2_0= '[' )
            // InternalPdfMk.g:1090:5: lv_value_2_0= '['
            {
            lv_value_2_0=(Token)match(input,30,FOLLOW_13); 

            					newLeafNode(lv_value_2_0, grammarAccess.getImageFitDefinitionAccess().getValueLeftSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageFitDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1102:3: ( (lv_values_3_0= RULE_INT ) )
            // InternalPdfMk.g:1103:4: (lv_values_3_0= RULE_INT )
            {
            // InternalPdfMk.g:1103:4: (lv_values_3_0= RULE_INT )
            // InternalPdfMk.g:1104:5: lv_values_3_0= RULE_INT
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

            // InternalPdfMk.g:1120:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) ) )
            // InternalPdfMk.g:1121:4: otherlv_4= ',' ( (lv_values_5_0= RULE_INT ) )
            {
            otherlv_4=(Token)match(input,15,FOLLOW_13); 

            				newLeafNode(otherlv_4, grammarAccess.getImageFitDefinitionAccess().getCommaKeyword_4_0());
            			
            // InternalPdfMk.g:1125:4: ( (lv_values_5_0= RULE_INT ) )
            // InternalPdfMk.g:1126:5: (lv_values_5_0= RULE_INT )
            {
            // InternalPdfMk.g:1126:5: (lv_values_5_0= RULE_INT )
            // InternalPdfMk.g:1127:6: lv_values_5_0= RULE_INT
            {
            lv_values_5_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalPdfMk.g:1152:1: entryRuleImageOpacityDefinition returns [EObject current=null] : iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF ;
    public final EObject entryRuleImageOpacityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageOpacityDefinition = null;


        try {
            // InternalPdfMk.g:1152:63: (iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF )
            // InternalPdfMk.g:1153:2: iv_ruleImageOpacityDefinition= ruleImageOpacityDefinition EOF
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
    // InternalPdfMk.g:1159:1: ruleImageOpacityDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleImageOpacityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1165:2: ( ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:1166:2: ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:1166:2: ( ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:1167:3: ( (lv_key_0_0= 'opacity' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:1167:3: ( (lv_key_0_0= 'opacity' ) )
            // InternalPdfMk.g:1168:4: (lv_key_0_0= 'opacity' )
            {
            // InternalPdfMk.g:1168:4: (lv_key_0_0= 'opacity' )
            // InternalPdfMk.g:1169:5: lv_key_0_0= 'opacity'
            {
            lv_key_0_0=(Token)match(input,36,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getImageOpacityDefinitionAccess().getKeyOpacityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageOpacityDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "opacity");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImageOpacityDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1185:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:1186:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:1186:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:1187:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:1207:1: entryRuleListReversedDefinition returns [EObject current=null] : iv_ruleListReversedDefinition= ruleListReversedDefinition EOF ;
    public final EObject entryRuleListReversedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListReversedDefinition = null;


        try {
            // InternalPdfMk.g:1207:63: (iv_ruleListReversedDefinition= ruleListReversedDefinition EOF )
            // InternalPdfMk.g:1208:2: iv_ruleListReversedDefinition= ruleListReversedDefinition EOF
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
    // InternalPdfMk.g:1214:1: ruleListReversedDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) ;
    public final EObject ruleListReversedDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1220:2: ( ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) ) )
            // InternalPdfMk.g:1221:2: ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            {
            // InternalPdfMk.g:1221:2: ( ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) ) )
            // InternalPdfMk.g:1222:3: ( (lv_key_0_0= 'reversed' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanType ) )
            {
            // InternalPdfMk.g:1222:3: ( (lv_key_0_0= 'reversed' ) )
            // InternalPdfMk.g:1223:4: (lv_key_0_0= 'reversed' )
            {
            // InternalPdfMk.g:1223:4: (lv_key_0_0= 'reversed' )
            // InternalPdfMk.g:1224:5: lv_key_0_0= 'reversed'
            {
            lv_key_0_0=(Token)match(input,37,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListReversedDefinitionAccess().getKeyReversedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListReversedDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "reversed");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getListReversedDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1240:3: ( (lv_value_2_0= ruleBooleanType ) )
            // InternalPdfMk.g:1241:4: (lv_value_2_0= ruleBooleanType )
            {
            // InternalPdfMk.g:1241:4: (lv_value_2_0= ruleBooleanType )
            // InternalPdfMk.g:1242:5: lv_value_2_0= ruleBooleanType
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
    // InternalPdfMk.g:1263:1: entryRuleListCounterDefinition returns [EObject current=null] : iv_ruleListCounterDefinition= ruleListCounterDefinition EOF ;
    public final EObject entryRuleListCounterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListCounterDefinition = null;


        try {
            // InternalPdfMk.g:1263:62: (iv_ruleListCounterDefinition= ruleListCounterDefinition EOF )
            // InternalPdfMk.g:1264:2: iv_ruleListCounterDefinition= ruleListCounterDefinition EOF
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
    // InternalPdfMk.g:1270:1: ruleListCounterDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleListCounterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1276:2: ( ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPdfMk.g:1277:2: ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPdfMk.g:1277:2: ( ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPdfMk.g:1278:3: ( (lv_key_0_0= 'counter' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPdfMk.g:1278:3: ( (lv_key_0_0= 'counter' ) )
            // InternalPdfMk.g:1279:4: (lv_key_0_0= 'counter' )
            {
            // InternalPdfMk.g:1279:4: (lv_key_0_0= 'counter' )
            // InternalPdfMk.g:1280:5: lv_key_0_0= 'counter'
            {
            lv_key_0_0=(Token)match(input,38,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListCounterDefinitionAccess().getKeyCounterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListCounterDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "counter");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getListCounterDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1296:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPdfMk.g:1297:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPdfMk.g:1297:4: (lv_value_2_0= RULE_INT )
            // InternalPdfMk.g:1298:5: lv_value_2_0= RULE_INT
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
    // InternalPdfMk.g:1318:1: entryRuleListTypeDefinition returns [EObject current=null] : iv_ruleListTypeDefinition= ruleListTypeDefinition EOF ;
    public final EObject entryRuleListTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeDefinition = null;


        try {
            // InternalPdfMk.g:1318:59: (iv_ruleListTypeDefinition= ruleListTypeDefinition EOF )
            // InternalPdfMk.g:1319:2: iv_ruleListTypeDefinition= ruleListTypeDefinition EOF
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
    // InternalPdfMk.g:1325:1: ruleListTypeDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1331:2: ( ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1332:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1332:2: ( ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1333:3: ( (lv_key_0_0= 'type' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1333:3: ( (lv_key_0_0= 'type' ) )
            // InternalPdfMk.g:1334:4: (lv_key_0_0= 'type' )
            {
            // InternalPdfMk.g:1334:4: (lv_key_0_0= 'type' )
            // InternalPdfMk.g:1335:5: lv_key_0_0= 'type'
            {
            lv_key_0_0=(Token)match(input,39,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListTypeDefinitionAccess().getKeyTypeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListTypeDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "type");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListTypeDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1351:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1352:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1352:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1353:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1373:1: entryRuleListColorDefinition returns [EObject current=null] : iv_ruleListColorDefinition= ruleListColorDefinition EOF ;
    public final EObject entryRuleListColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListColorDefinition = null;


        try {
            // InternalPdfMk.g:1373:60: (iv_ruleListColorDefinition= ruleListColorDefinition EOF )
            // InternalPdfMk.g:1374:2: iv_ruleListColorDefinition= ruleListColorDefinition EOF
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
    // InternalPdfMk.g:1380:1: ruleListColorDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListColorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1386:2: ( ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1387:2: ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1387:2: ( ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1388:3: ( (lv_key_0_0= 'color' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1388:3: ( (lv_key_0_0= 'color' ) )
            // InternalPdfMk.g:1389:4: (lv_key_0_0= 'color' )
            {
            // InternalPdfMk.g:1389:4: (lv_key_0_0= 'color' )
            // InternalPdfMk.g:1390:5: lv_key_0_0= 'color'
            {
            lv_key_0_0=(Token)match(input,40,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListColorDefinitionAccess().getKeyColorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListColorDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "color");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListColorDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1406:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1407:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1407:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1408:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1428:1: entryRuleListMarkerColorDefinition returns [EObject current=null] : iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF ;
    public final EObject entryRuleListMarkerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMarkerColorDefinition = null;


        try {
            // InternalPdfMk.g:1428:66: (iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF )
            // InternalPdfMk.g:1429:2: iv_ruleListMarkerColorDefinition= ruleListMarkerColorDefinition EOF
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
    // InternalPdfMk.g:1435:1: ruleListMarkerColorDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleListMarkerColorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPdfMk.g:1441:2: ( ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPdfMk.g:1442:2: ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPdfMk.g:1442:2: ( ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPdfMk.g:1443:3: ( (lv_key_0_0= 'markerColor' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPdfMk.g:1443:3: ( (lv_key_0_0= 'markerColor' ) )
            // InternalPdfMk.g:1444:4: (lv_key_0_0= 'markerColor' )
            {
            // InternalPdfMk.g:1444:4: (lv_key_0_0= 'markerColor' )
            // InternalPdfMk.g:1445:5: lv_key_0_0= 'markerColor'
            {
            lv_key_0_0=(Token)match(input,41,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListMarkerColorDefinitionAccess().getKeyMarkerColorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListMarkerColorDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "markerColor");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListMarkerColorDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1461:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPdfMk.g:1462:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPdfMk.g:1462:4: (lv_value_2_0= RULE_STRING )
            // InternalPdfMk.g:1463:5: lv_value_2_0= RULE_STRING
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
    // InternalPdfMk.g:1483:1: entryRuleTableCellItemElements returns [EObject current=null] : iv_ruleTableCellItemElements= ruleTableCellItemElements EOF ;
    public final EObject entryRuleTableCellItemElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCellItemElements = null;


        try {
            // InternalPdfMk.g:1483:62: (iv_ruleTableCellItemElements= ruleTableCellItemElements EOF )
            // InternalPdfMk.g:1484:2: iv_ruleTableCellItemElements= ruleTableCellItemElements EOF
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
    // InternalPdfMk.g:1490:1: ruleTableCellItemElements returns [EObject current=null] : ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) ) ;
    public final EObject ruleTableCellItemElements() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_1 = null;

        EObject lv_elements_0_2 = null;

        EObject lv_elements_0_3 = null;

        EObject lv_elements_0_4 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1496:2: ( ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) ) )
            // InternalPdfMk.g:1497:2: ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) )
            {
            // InternalPdfMk.g:1497:2: ( ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) ) )
            // InternalPdfMk.g:1498:3: ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) )
            {
            // InternalPdfMk.g:1498:3: ( (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject ) )
            // InternalPdfMk.g:1499:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )
            {
            // InternalPdfMk.g:1499:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalPdfMk.g:1500:5: lv_elements_0_1= ruleStringObject
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
                    // InternalPdfMk.g:1516:5: lv_elements_0_2= ruleTextObject
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
                    // InternalPdfMk.g:1532:5: lv_elements_0_3= ruleImageObject
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
                    // InternalPdfMk.g:1548:5: lv_elements_0_4= ruleListObject
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
    // InternalPdfMk.g:1569:1: entryRuleTableRowDefinition returns [EObject current=null] : iv_ruleTableRowDefinition= ruleTableRowDefinition EOF ;
    public final EObject entryRuleTableRowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRowDefinition = null;


        try {
            // InternalPdfMk.g:1569:59: (iv_ruleTableRowDefinition= ruleTableRowDefinition EOF )
            // InternalPdfMk.g:1570:2: iv_ruleTableRowDefinition= ruleTableRowDefinition EOF
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
    // InternalPdfMk.g:1576:1: ruleTableRowDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' ) ;
    public final EObject ruleTableRowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_item_1_0 = null;

        EObject lv_item_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1582:2: ( (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' ) )
            // InternalPdfMk.g:1583:2: (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' )
            {
            // InternalPdfMk.g:1583:2: (otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']' )
            // InternalPdfMk.g:1584:3: otherlv_0= '[' ( (lv_item_1_0= ruleTableCellItemElements ) ) (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowDefinitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPdfMk.g:1588:3: ( (lv_item_1_0= ruleTableCellItemElements ) )
            // InternalPdfMk.g:1589:4: (lv_item_1_0= ruleTableCellItemElements )
            {
            // InternalPdfMk.g:1589:4: (lv_item_1_0= ruleTableCellItemElements )
            // InternalPdfMk.g:1590:5: lv_item_1_0= ruleTableCellItemElements
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

            // InternalPdfMk.g:1607:3: (otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) ) )
            // InternalPdfMk.g:1608:4: otherlv_2= ',' ( (lv_item_3_0= ruleTableCellItemElements ) )
            {
            otherlv_2=(Token)match(input,15,FOLLOW_23); 

            				newLeafNode(otherlv_2, grammarAccess.getTableRowDefinitionAccess().getCommaKeyword_2_0());
            			
            // InternalPdfMk.g:1612:4: ( (lv_item_3_0= ruleTableCellItemElements ) )
            // InternalPdfMk.g:1613:5: (lv_item_3_0= ruleTableCellItemElements )
            {
            // InternalPdfMk.g:1613:5: (lv_item_3_0= ruleTableCellItemElements )
            // InternalPdfMk.g:1614:6: lv_item_3_0= ruleTableCellItemElements
            {

            						newCompositeNode(grammarAccess.getTableRowDefinitionAccess().getItemTableCellItemElementsParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_22);
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

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalPdfMk.g:1640:1: entryRuleTableBodyDefinition returns [EObject current=null] : iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF ;
    public final EObject entryRuleTableBodyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableBodyDefinition = null;


        try {
            // InternalPdfMk.g:1640:60: (iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF )
            // InternalPdfMk.g:1641:2: iv_ruleTableBodyDefinition= ruleTableBodyDefinition EOF
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
    // InternalPdfMk.g:1647:1: ruleTableBodyDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' ) ;
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
            // InternalPdfMk.g:1653:2: ( ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' ) )
            // InternalPdfMk.g:1654:2: ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' )
            {
            // InternalPdfMk.g:1654:2: ( ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']' )
            // InternalPdfMk.g:1655:3: ( (lv_key_0_0= 'body' ) ) otherlv_1= ':' ( (lv_value_2_0= '[' ) ) ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* ) otherlv_6= ']'
            {
            // InternalPdfMk.g:1655:3: ( (lv_key_0_0= 'body' ) )
            // InternalPdfMk.g:1656:4: (lv_key_0_0= 'body' )
            {
            // InternalPdfMk.g:1656:4: (lv_key_0_0= 'body' )
            // InternalPdfMk.g:1657:5: lv_key_0_0= 'body'
            {
            lv_key_0_0=(Token)match(input,42,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTableBodyDefinitionAccess().getKeyBodyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableBodyDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "body");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTableBodyDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1673:3: ( (lv_value_2_0= '[' ) )
            // InternalPdfMk.g:1674:4: (lv_value_2_0= '[' )
            {
            // InternalPdfMk.g:1674:4: (lv_value_2_0= '[' )
            // InternalPdfMk.g:1675:5: lv_value_2_0= '['
            {
            lv_value_2_0=(Token)match(input,30,FOLLOW_19); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTableBodyDefinitionAccess().getValueLeftSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableBodyDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "[");
            				

            }


            }

            // InternalPdfMk.g:1687:3: ( ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )* )
            // InternalPdfMk.g:1688:4: ( (lv_rows_3_0= ruleTableRowDefinition ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )*
            {
            // InternalPdfMk.g:1688:4: ( (lv_rows_3_0= ruleTableRowDefinition ) )
            // InternalPdfMk.g:1689:5: (lv_rows_3_0= ruleTableRowDefinition )
            {
            // InternalPdfMk.g:1689:5: (lv_rows_3_0= ruleTableRowDefinition )
            // InternalPdfMk.g:1690:6: lv_rows_3_0= ruleTableRowDefinition
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

            // InternalPdfMk.g:1707:4: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPdfMk.g:1708:5: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRowDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTableBodyDefinitionAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:1712:5: ( (lv_rows_5_0= ruleTableRowDefinition ) )
            	    // InternalPdfMk.g:1713:6: (lv_rows_5_0= ruleTableRowDefinition )
            	    {
            	    // InternalPdfMk.g:1713:6: (lv_rows_5_0= ruleTableRowDefinition )
            	    // InternalPdfMk.g:1714:7: lv_rows_5_0= ruleTableRowDefinition
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

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalPdfMk.g:1741:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


        try {
            // InternalPdfMk.g:1741:56: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // InternalPdfMk.g:1742:2: iv_ruleTableDefinition= ruleTableDefinition EOF
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
    // InternalPdfMk.g:1748:1: ruleTableDefinition returns [EObject current=null] : ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1754:2: ( ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' ) )
            // InternalPdfMk.g:1755:2: ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:1755:2: ( ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}' )
            // InternalPdfMk.g:1756:3: ( (lv_key_0_0= 'table' ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( (lv_body_3_0= ruleTableBodyDefinition ) ) otherlv_4= '}'
            {
            // InternalPdfMk.g:1756:3: ( (lv_key_0_0= 'table' ) )
            // InternalPdfMk.g:1757:4: (lv_key_0_0= 'table' )
            {
            // InternalPdfMk.g:1757:4: (lv_key_0_0= 'table' )
            // InternalPdfMk.g:1758:5: lv_key_0_0= 'table'
            {
            lv_key_0_0=(Token)match(input,43,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTableDefinitionAccess().getKeyTableKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDefinitionRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "table");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableDefinitionAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:1774:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:1775:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:1775:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:1776:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_24); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTableDefinitionAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDefinitionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:1788:3: ( (lv_body_3_0= ruleTableBodyDefinition ) )
            // InternalPdfMk.g:1789:4: (lv_body_3_0= ruleTableBodyDefinition )
            {
            // InternalPdfMk.g:1789:4: (lv_body_3_0= ruleTableBodyDefinition )
            // InternalPdfMk.g:1790:5: lv_body_3_0= ruleTableBodyDefinition
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
    // InternalPdfMk.g:1815:1: entryRuleTextObjectMembersWrapper returns [EObject current=null] : iv_ruleTextObjectMembersWrapper= ruleTextObjectMembersWrapper EOF ;
    public final EObject entryRuleTextObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:1815:65: (iv_ruleTextObjectMembersWrapper= ruleTextObjectMembersWrapper EOF )
            // InternalPdfMk.g:1816:2: iv_ruleTextObjectMembersWrapper= ruleTextObjectMembersWrapper EOF
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
    // InternalPdfMk.g:1822:1: ruleTextObjectMembersWrapper returns [EObject current=null] : (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition ) ;
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
            // InternalPdfMk.g:1828:2: ( (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition ) )
            // InternalPdfMk.g:1829:2: (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition )
            {
            // InternalPdfMk.g:1829:2: (this_TextDefinition_0= ruleTextDefinition | this_TextStyleDefinition_1= ruleTextStyleDefinition | this_FontSizeDefinition_2= ruleFontSizeDefinition | this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition | this_TypeFaceDefinition_4= ruleTypeFaceDefinition | this_ItalicsDefinition_5= ruleItalicsDefinition | this_WidthDefinition_6= ruleWidthDefinition | this_MarginDefinition_7= ruleMarginDefinition | this_ListCounterDefinition_8= ruleListCounterDefinition )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            case 17:
                {
                alt11=5;
                }
                break;
            case 25:
                {
                alt11=6;
                }
                break;
            case 27:
                {
                alt11=7;
                }
                break;
            case 29:
                {
                alt11=8;
                }
                break;
            case 38:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPdfMk.g:1830:3: this_TextDefinition_0= ruleTextDefinition
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
                    // InternalPdfMk.g:1839:3: this_TextStyleDefinition_1= ruleTextStyleDefinition
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
                    // InternalPdfMk.g:1848:3: this_FontSizeDefinition_2= ruleFontSizeDefinition
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
                    // InternalPdfMk.g:1857:3: this_TextAlignmentDefinition_3= ruleTextAlignmentDefinition
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
                    // InternalPdfMk.g:1866:3: this_TypeFaceDefinition_4= ruleTypeFaceDefinition
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
                    // InternalPdfMk.g:1875:3: this_ItalicsDefinition_5= ruleItalicsDefinition
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
                    // InternalPdfMk.g:1884:3: this_WidthDefinition_6= ruleWidthDefinition
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
                    // InternalPdfMk.g:1893:3: this_MarginDefinition_7= ruleMarginDefinition
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
                    // InternalPdfMk.g:1902:3: this_ListCounterDefinition_8= ruleListCounterDefinition
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
    // InternalPdfMk.g:1914:1: entryRuleStyleObjectMembersWrapper returns [EObject current=null] : iv_ruleStyleObjectMembersWrapper= ruleStyleObjectMembersWrapper EOF ;
    public final EObject entryRuleStyleObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:1914:66: (iv_ruleStyleObjectMembersWrapper= ruleStyleObjectMembersWrapper EOF )
            // InternalPdfMk.g:1915:2: iv_ruleStyleObjectMembersWrapper= ruleStyleObjectMembersWrapper EOF
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
    // InternalPdfMk.g:1921:1: ruleStyleObjectMembersWrapper returns [EObject current=null] : (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition ) ;
    public final EObject ruleStyleObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject this_FontSizeDefinition_0 = null;

        EObject this_TypeFaceDefinition_1 = null;

        EObject this_TextAlignmentDefinition_2 = null;

        EObject this_ItalicsDefinition_3 = null;

        EObject this_MarginDefinition_4 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:1927:2: ( (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition ) )
            // InternalPdfMk.g:1928:2: (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition )
            {
            // InternalPdfMk.g:1928:2: (this_FontSizeDefinition_0= ruleFontSizeDefinition | this_TypeFaceDefinition_1= ruleTypeFaceDefinition | this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition | this_ItalicsDefinition_3= ruleItalicsDefinition | this_MarginDefinition_4= ruleMarginDefinition )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPdfMk.g:1929:3: this_FontSizeDefinition_0= ruleFontSizeDefinition
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
                    // InternalPdfMk.g:1938:3: this_TypeFaceDefinition_1= ruleTypeFaceDefinition
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
                    // InternalPdfMk.g:1947:3: this_TextAlignmentDefinition_2= ruleTextAlignmentDefinition
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
                    // InternalPdfMk.g:1956:3: this_ItalicsDefinition_3= ruleItalicsDefinition
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
                    // InternalPdfMk.g:1965:3: this_MarginDefinition_4= ruleMarginDefinition
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
    // InternalPdfMk.g:1977:1: entryRuleImageObjectMembersWrapper returns [EObject current=null] : iv_ruleImageObjectMembersWrapper= ruleImageObjectMembersWrapper EOF ;
    public final EObject entryRuleImageObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:1977:66: (iv_ruleImageObjectMembersWrapper= ruleImageObjectMembersWrapper EOF )
            // InternalPdfMk.g:1978:2: iv_ruleImageObjectMembersWrapper= ruleImageObjectMembersWrapper EOF
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
    // InternalPdfMk.g:1984:1: ruleImageObjectMembersWrapper returns [EObject current=null] : (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition ) ;
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
            // InternalPdfMk.g:1990:2: ( (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition ) )
            // InternalPdfMk.g:1991:2: (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition )
            {
            // InternalPdfMk.g:1991:2: (this_ImageDefintion_0= ruleImageDefintion | this_ImageWidthDefintion_1= ruleImageWidthDefintion | this_ImageHeightDefintion_2= ruleImageHeightDefintion | this_ImageOpacityDefinition_3= ruleImageOpacityDefinition | this_ImageFitDefinition_4= ruleImageFitDefinition | this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 33:
                {
                alt13=3;
                }
                break;
            case 36:
                {
                alt13=4;
                }
                break;
            case 35:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPdfMk.g:1992:3: this_ImageDefintion_0= ruleImageDefintion
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
                    // InternalPdfMk.g:2001:3: this_ImageWidthDefintion_1= ruleImageWidthDefintion
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
                    // InternalPdfMk.g:2010:3: this_ImageHeightDefintion_2= ruleImageHeightDefintion
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
                    // InternalPdfMk.g:2019:3: this_ImageOpacityDefinition_3= ruleImageOpacityDefinition
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
                    // InternalPdfMk.g:2028:3: this_ImageFitDefinition_4= ruleImageFitDefinition
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
                    // InternalPdfMk.g:2037:3: this_ImagePageBreakDefinition_5= ruleImagePageBreakDefinition
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
    // InternalPdfMk.g:2049:1: entryRuleInnerColumnObjectMembersWrapper returns [EObject current=null] : iv_ruleInnerColumnObjectMembersWrapper= ruleInnerColumnObjectMembersWrapper EOF ;
    public final EObject entryRuleInnerColumnObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerColumnObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:2049:72: (iv_ruleInnerColumnObjectMembersWrapper= ruleInnerColumnObjectMembersWrapper EOF )
            // InternalPdfMk.g:2050:2: iv_ruleInnerColumnObjectMembersWrapper= ruleInnerColumnObjectMembersWrapper EOF
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
    // InternalPdfMk.g:2056:1: ruleInnerColumnObjectMembersWrapper returns [EObject current=null] : ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) ) ;
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
            // InternalPdfMk.g:2062:2: ( ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) ) )
            // InternalPdfMk.g:2063:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) )
            {
            // InternalPdfMk.g:2063:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalPdfMk.g:2064:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    {
                    // InternalPdfMk.g:2064:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    // InternalPdfMk.g:2065:4: ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    {
                    // InternalPdfMk.g:2065:4: ( (lv_text_0_0= ruleStringObject ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPdfMk.g:2066:5: (lv_text_0_0= ruleStringObject )
                            {
                            // InternalPdfMk.g:2066:5: (lv_text_0_0= ruleStringObject )
                            // InternalPdfMk.g:2067:6: lv_text_0_0= ruleStringObject
                            {

                            						newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    // InternalPdfMk.g:2084:4: (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPdfMk.g:2085:5: otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) )
                    	    {
                    	    otherlv_1=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalPdfMk.g:2089:5: ( (lv_text_2_0= ruleStringObject ) )
                    	    // InternalPdfMk.g:2090:6: (lv_text_2_0= ruleStringObject )
                    	    {
                    	    // InternalPdfMk.g:2090:6: (lv_text_2_0= ruleStringObject )
                    	    // InternalPdfMk.g:2091:7: lv_text_2_0= ruleStringObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:2111:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    {
                    // InternalPdfMk.g:2111:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    // InternalPdfMk.g:2112:4: ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    {
                    // InternalPdfMk.g:2112:4: ( (lv_textObject_3_0= ruleTextObject ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==14) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPdfMk.g:2113:5: (lv_textObject_3_0= ruleTextObject )
                            {
                            // InternalPdfMk.g:2113:5: (lv_textObject_3_0= ruleTextObject )
                            // InternalPdfMk.g:2114:6: lv_textObject_3_0= ruleTextObject
                            {

                            						newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    // InternalPdfMk.g:2131:4: (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalPdfMk.g:2132:5: otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPdfMk.g:2136:5: ( (lv_textObject_5_0= ruleTextObject ) )
                    	    // InternalPdfMk.g:2137:6: (lv_textObject_5_0= ruleTextObject )
                    	    {
                    	    // InternalPdfMk.g:2137:6: (lv_textObject_5_0= ruleTextObject )
                    	    // InternalPdfMk.g:2138:7: lv_textObject_5_0= ruleTextObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalPdfMk.g:2158:3: ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* )
                    {
                    // InternalPdfMk.g:2158:3: ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* )
                    // InternalPdfMk.g:2159:4: ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )*
                    {
                    // InternalPdfMk.g:2159:4: ( (lv_column_6_0= ruleColumnDefinition ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==14) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPdfMk.g:2160:5: (lv_column_6_0= ruleColumnDefinition )
                            {
                            // InternalPdfMk.g:2160:5: (lv_column_6_0= ruleColumnDefinition )
                            // InternalPdfMk.g:2161:6: lv_column_6_0= ruleColumnDefinition
                            {

                            						newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    // InternalPdfMk.g:2178:4: (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPdfMk.g:2179:5: otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInnerColumnObjectMembersWrapperAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPdfMk.g:2183:5: ( (lv_column_8_0= ruleColumnDefinition ) )
                    	    // InternalPdfMk.g:2184:6: (lv_column_8_0= ruleColumnDefinition )
                    	    {
                    	    // InternalPdfMk.g:2184:6: (lv_column_8_0= ruleColumnDefinition )
                    	    // InternalPdfMk.g:2185:7: lv_column_8_0= ruleColumnDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getInnerColumnObjectMembersWrapperAccess().getColumnColumnDefinitionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop19;
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
    // InternalPdfMk.g:2208:1: entryRuleColumnObjectMembersWrapper returns [EObject current=null] : iv_ruleColumnObjectMembersWrapper= ruleColumnObjectMembersWrapper EOF ;
    public final EObject entryRuleColumnObjectMembersWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnObjectMembersWrapper = null;


        try {
            // InternalPdfMk.g:2208:67: (iv_ruleColumnObjectMembersWrapper= ruleColumnObjectMembersWrapper EOF )
            // InternalPdfMk.g:2209:2: iv_ruleColumnObjectMembersWrapper= ruleColumnObjectMembersWrapper EOF
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
    // InternalPdfMk.g:2215:1: ruleColumnObjectMembersWrapper returns [EObject current=null] : ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) ) ;
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
            // InternalPdfMk.g:2221:2: ( ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) ) )
            // InternalPdfMk.g:2222:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) )
            {
            // InternalPdfMk.g:2222:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case 15:
                {
                alt25=1;
                }
                break;
            case EOF:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=1;
                }
                break;
            case 14:
                {
                alt25=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPdfMk.g:2223:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    {
                    // InternalPdfMk.g:2223:3: ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* )
                    // InternalPdfMk.g:2224:4: ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    {
                    // InternalPdfMk.g:2224:4: ( (lv_text_0_0= ruleStringObject ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_STRING) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalPdfMk.g:2225:5: (lv_text_0_0= ruleStringObject )
                            {
                            // InternalPdfMk.g:2225:5: (lv_text_0_0= ruleStringObject )
                            // InternalPdfMk.g:2226:6: lv_text_0_0= ruleStringObject
                            {

                            						newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    // InternalPdfMk.g:2243:4: (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            int LA22_2 = input.LA(2);

                            if ( (LA22_2==RULE_STRING) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalPdfMk.g:2244:5: otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) )
                    	    {
                    	    otherlv_1=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalPdfMk.g:2248:5: ( (lv_text_2_0= ruleStringObject ) )
                    	    // InternalPdfMk.g:2249:6: (lv_text_2_0= ruleStringObject )
                    	    {
                    	    // InternalPdfMk.g:2249:6: (lv_text_2_0= ruleStringObject )
                    	    // InternalPdfMk.g:2250:7: lv_text_2_0= ruleStringObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextStringObjectParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:2270:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    {
                    // InternalPdfMk.g:2270:3: ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* )
                    // InternalPdfMk.g:2271:4: ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    {
                    // InternalPdfMk.g:2271:4: ( (lv_textObject_3_0= ruleTextObject ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==14) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPdfMk.g:2272:5: (lv_textObject_3_0= ruleTextObject )
                            {
                            // InternalPdfMk.g:2272:5: (lv_textObject_3_0= ruleTextObject )
                            // InternalPdfMk.g:2273:6: lv_textObject_3_0= ruleTextObject
                            {

                            						newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    // InternalPdfMk.g:2290:4: (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        alt24 = dfa24.predict(input);
                        switch (alt24) {
                    	case 1 :
                    	    // InternalPdfMk.g:2291:5: otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getColumnObjectMembersWrapperAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPdfMk.g:2295:5: ( (lv_textObject_5_0= ruleTextObject ) )
                    	    // InternalPdfMk.g:2296:6: (lv_textObject_5_0= ruleTextObject )
                    	    {
                    	    // InternalPdfMk.g:2296:6: (lv_textObject_5_0= ruleTextObject )
                    	    // InternalPdfMk.g:2297:7: lv_textObject_5_0= ruleTextObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnObjectMembersWrapperAccess().getTextObjectTextObjectParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop24;
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
    // InternalPdfMk.g:2320:1: entryRuleListObjectPropertiesWrapper returns [EObject current=null] : iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF ;
    public final EObject entryRuleListObjectPropertiesWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListObjectPropertiesWrapper = null;


        try {
            // InternalPdfMk.g:2320:68: (iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF )
            // InternalPdfMk.g:2321:2: iv_ruleListObjectPropertiesWrapper= ruleListObjectPropertiesWrapper EOF
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
    // InternalPdfMk.g:2327:1: ruleListObjectPropertiesWrapper returns [EObject current=null] : ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) ) ;
    public final EObject ruleListObjectPropertiesWrapper() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;

        EObject lv_value_0_3 = null;

        EObject lv_value_0_4 = null;

        EObject lv_value_0_5 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2333:2: ( ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) ) )
            // InternalPdfMk.g:2334:2: ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) )
            {
            // InternalPdfMk.g:2334:2: ( ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) ) )
            // InternalPdfMk.g:2335:3: ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) )
            {
            // InternalPdfMk.g:2335:3: ( (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition ) )
            // InternalPdfMk.g:2336:4: (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition )
            {
            // InternalPdfMk.g:2336:4: (lv_value_0_1= ruleListReversedDefinition | lv_value_0_2= ruleListCounterDefinition | lv_value_0_3= ruleListTypeDefinition | lv_value_0_4= ruleListColorDefinition | lv_value_0_5= ruleListMarkerColorDefinition )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt26=1;
                }
                break;
            case 38:
                {
                alt26=2;
                }
                break;
            case 39:
                {
                alt26=3;
                }
                break;
            case 40:
                {
                alt26=4;
                }
                break;
            case 41:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPdfMk.g:2337:5: lv_value_0_1= ruleListReversedDefinition
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
                    // InternalPdfMk.g:2353:5: lv_value_0_2= ruleListCounterDefinition
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
                    // InternalPdfMk.g:2369:5: lv_value_0_3= ruleListTypeDefinition
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
                    // InternalPdfMk.g:2385:5: lv_value_0_4= ruleListColorDefinition
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
                    // InternalPdfMk.g:2401:5: lv_value_0_5= ruleListMarkerColorDefinition
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
    // InternalPdfMk.g:2422:1: entryRuleTextObject returns [EObject current=null] : iv_ruleTextObject= ruleTextObject EOF ;
    public final EObject entryRuleTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextObject = null;


        try {
            // InternalPdfMk.g:2422:51: (iv_ruleTextObject= ruleTextObject EOF )
            // InternalPdfMk.g:2423:2: iv_ruleTextObject= ruleTextObject EOF
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
    // InternalPdfMk.g:2429:1: ruleTextObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleTextObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2435:2: ( (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2436:2: (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2436:2: (otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2437:3: otherlv_0= '{' ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTextObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:2441:3: ( ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2442:4: ( (lv_members_1_0= ruleTextObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2442:4: ( (lv_members_1_0= ruleTextObjectMembersWrapper ) )
            // InternalPdfMk.g:2443:5: (lv_members_1_0= ruleTextObjectMembersWrapper )
            {
            // InternalPdfMk.g:2443:5: (lv_members_1_0= ruleTextObjectMembersWrapper )
            // InternalPdfMk.g:2444:6: lv_members_1_0= ruleTextObjectMembersWrapper
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

            // InternalPdfMk.g:2461:4: (otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPdfMk.g:2462:5: otherlv_2= ',' ( (lv_members_3_0= ruleTextObjectMembersWrapper ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_26); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTextObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2466:5: ( (lv_members_3_0= ruleTextObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2467:6: (lv_members_3_0= ruleTextObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2467:6: (lv_members_3_0= ruleTextObjectMembersWrapper )
            	    // InternalPdfMk.g:2468:7: lv_members_3_0= ruleTextObjectMembersWrapper
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
            	    break loop27;
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
    // InternalPdfMk.g:2495:1: entryRuleColumnTextObject returns [EObject current=null] : iv_ruleColumnTextObject= ruleColumnTextObject EOF ;
    public final EObject entryRuleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTextObject = null;


        try {
            // InternalPdfMk.g:2495:57: (iv_ruleColumnTextObject= ruleColumnTextObject EOF )
            // InternalPdfMk.g:2496:2: iv_ruleColumnTextObject= ruleColumnTextObject EOF
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
    // InternalPdfMk.g:2502:1: ruleColumnTextObject returns [EObject current=null] : ( (lv_value_0_0= ruleColumnDefinition ) ) ;
    public final EObject ruleColumnTextObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2508:2: ( ( (lv_value_0_0= ruleColumnDefinition ) ) )
            // InternalPdfMk.g:2509:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            {
            // InternalPdfMk.g:2509:2: ( (lv_value_0_0= ruleColumnDefinition ) )
            // InternalPdfMk.g:2510:3: (lv_value_0_0= ruleColumnDefinition )
            {
            // InternalPdfMk.g:2510:3: (lv_value_0_0= ruleColumnDefinition )
            // InternalPdfMk.g:2511:4: lv_value_0_0= ruleColumnDefinition
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
    // InternalPdfMk.g:2531:1: entryRuleStyleObject returns [EObject current=null] : iv_ruleStyleObject= ruleStyleObject EOF ;
    public final EObject entryRuleStyleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObject = null;


        try {
            // InternalPdfMk.g:2531:52: (iv_ruleStyleObject= ruleStyleObject EOF )
            // InternalPdfMk.g:2532:2: iv_ruleStyleObject= ruleStyleObject EOF
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
    // InternalPdfMk.g:2538:1: ruleStyleObject returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' ) ;
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
            // InternalPdfMk.g:2544:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' ) )
            // InternalPdfMk.g:2545:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' )
            {
            // InternalPdfMk.g:2545:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}' )
            // InternalPdfMk.g:2546:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= '{' ) ) ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* ) otherlv_6= '}'
            {
            // InternalPdfMk.g:2546:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalPdfMk.g:2547:4: (lv_key_0_0= RULE_ID )
            {
            // InternalPdfMk.g:2547:4: (lv_key_0_0= RULE_ID )
            // InternalPdfMk.g:2548:5: lv_key_0_0= RULE_ID
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
            		
            // InternalPdfMk.g:2568:3: ( (lv_value_2_0= '{' ) )
            // InternalPdfMk.g:2569:4: (lv_value_2_0= '{' )
            {
            // InternalPdfMk.g:2569:4: (lv_value_2_0= '{' )
            // InternalPdfMk.g:2570:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,14,FOLLOW_27); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStyleObjectAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2582:3: ( ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2583:4: ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2583:4: ( (lv_members_3_0= ruleStyleObjectMembersWrapper ) )
            // InternalPdfMk.g:2584:5: (lv_members_3_0= ruleStyleObjectMembersWrapper )
            {
            // InternalPdfMk.g:2584:5: (lv_members_3_0= ruleStyleObjectMembersWrapper )
            // InternalPdfMk.g:2585:6: lv_members_3_0= ruleStyleObjectMembersWrapper
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

            // InternalPdfMk.g:2602:4: (otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPdfMk.g:2603:5: otherlv_4= ',' ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_27); 

            	    					newLeafNode(otherlv_4, grammarAccess.getStyleObjectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalPdfMk.g:2607:5: ( (lv_members_5_0= ruleStyleObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2608:6: (lv_members_5_0= ruleStyleObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2608:6: (lv_members_5_0= ruleStyleObjectMembersWrapper )
            	    // InternalPdfMk.g:2609:7: lv_members_5_0= ruleStyleObjectMembersWrapper
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
            	    break loop28;
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
    // InternalPdfMk.g:2636:1: entryRuleStyleObjects returns [EObject current=null] : iv_ruleStyleObjects= ruleStyleObjects EOF ;
    public final EObject entryRuleStyleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleObjects = null;


        try {
            // InternalPdfMk.g:2636:53: (iv_ruleStyleObjects= ruleStyleObjects EOF )
            // InternalPdfMk.g:2637:2: iv_ruleStyleObjects= ruleStyleObjects EOF
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
    // InternalPdfMk.g:2643:1: ruleStyleObjects returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleStyleObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2649:2: ( (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2650:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2650:2: (otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2651:3: otherlv_0= '{' ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleObjectsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPdfMk.g:2655:3: ( ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )* )
            // InternalPdfMk.g:2656:4: ( (lv_value_1_0= ruleStyleObject ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            {
            // InternalPdfMk.g:2656:4: ( (lv_value_1_0= ruleStyleObject ) )
            // InternalPdfMk.g:2657:5: (lv_value_1_0= ruleStyleObject )
            {
            // InternalPdfMk.g:2657:5: (lv_value_1_0= ruleStyleObject )
            // InternalPdfMk.g:2658:6: lv_value_1_0= ruleStyleObject
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

            // InternalPdfMk.g:2675:4: (otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPdfMk.g:2676:5: otherlv_2= ',' ( (lv_value_3_0= ruleStyleObject ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_28); 

            	    					newLeafNode(otherlv_2, grammarAccess.getStyleObjectsAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2680:5: ( (lv_value_3_0= ruleStyleObject ) )
            	    // InternalPdfMk.g:2681:6: (lv_value_3_0= ruleStyleObject )
            	    {
            	    // InternalPdfMk.g:2681:6: (lv_value_3_0= ruleStyleObject )
            	    // InternalPdfMk.g:2682:7: lv_value_3_0= ruleStyleObject
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
            	    break loop29;
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
    // InternalPdfMk.g:2709:1: entryRuleImageObject returns [EObject current=null] : iv_ruleImageObject= ruleImageObject EOF ;
    public final EObject entryRuleImageObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageObject = null;


        try {
            // InternalPdfMk.g:2709:52: (iv_ruleImageObject= ruleImageObject EOF )
            // InternalPdfMk.g:2710:2: iv_ruleImageObject= ruleImageObject EOF
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
    // InternalPdfMk.g:2716:1: ruleImageObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleImageObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2722:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' ) )
            // InternalPdfMk.g:2723:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:2723:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}' )
            // InternalPdfMk.g:2724:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* ) otherlv_4= '}'
            {
            // InternalPdfMk.g:2724:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:2725:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:2725:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:2726:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_29); 

            					newLeafNode(lv_value_0_0, grammarAccess.getImageObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2738:3: ( ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2739:4: ( (lv_members_1_0= ruleImageObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2739:4: ( (lv_members_1_0= ruleImageObjectMembersWrapper ) )
            // InternalPdfMk.g:2740:5: (lv_members_1_0= ruleImageObjectMembersWrapper )
            {
            // InternalPdfMk.g:2740:5: (lv_members_1_0= ruleImageObjectMembersWrapper )
            // InternalPdfMk.g:2741:6: lv_members_1_0= ruleImageObjectMembersWrapper
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

            // InternalPdfMk.g:2758:4: (otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPdfMk.g:2759:5: otherlv_2= ',' ( (lv_members_3_0= ruleImageObjectMembersWrapper ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_29); 

            	    					newLeafNode(otherlv_2, grammarAccess.getImageObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2763:5: ( (lv_members_3_0= ruleImageObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2764:6: (lv_members_3_0= ruleImageObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2764:6: (lv_members_3_0= ruleImageObjectMembersWrapper )
            	    // InternalPdfMk.g:2765:7: lv_members_3_0= ruleImageObjectMembersWrapper
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
            	    break loop30;
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
    // InternalPdfMk.g:2792:1: entryRuleColumnObject returns [EObject current=null] : iv_ruleColumnObject= ruleColumnObject EOF ;
    public final EObject entryRuleColumnObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnObject = null;


        try {
            // InternalPdfMk.g:2792:53: (iv_ruleColumnObject= ruleColumnObject EOF )
            // InternalPdfMk.g:2793:2: iv_ruleColumnObject= ruleColumnObject EOF
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
    // InternalPdfMk.g:2799:1: ruleColumnObject returns [EObject current=null] : ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' ) ;
    public final EObject ruleColumnObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2805:2: ( ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' ) )
            // InternalPdfMk.g:2806:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' )
            {
            // InternalPdfMk.g:2806:2: ( ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']' )
            // InternalPdfMk.g:2807:3: ( (lv_value_0_0= '[' ) ) ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* ) otherlv_4= ']'
            {
            // InternalPdfMk.g:2807:3: ( (lv_value_0_0= '[' ) )
            // InternalPdfMk.g:2808:4: (lv_value_0_0= '[' )
            {
            // InternalPdfMk.g:2808:4: (lv_value_0_0= '[' )
            // InternalPdfMk.g:2809:5: lv_value_0_0= '['
            {
            lv_value_0_0=(Token)match(input,30,FOLLOW_30); 

            					newLeafNode(lv_value_0_0, grammarAccess.getColumnObjectAccess().getValueLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "[");
            				

            }


            }

            // InternalPdfMk.g:2821:3: ( ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )* )
            // InternalPdfMk.g:2822:4: ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )*
            {
            // InternalPdfMk.g:2822:4: ( (lv_members_1_0= ruleColumnObjectMembersWrapper ) )
            // InternalPdfMk.g:2823:5: (lv_members_1_0= ruleColumnObjectMembersWrapper )
            {
            // InternalPdfMk.g:2823:5: (lv_members_1_0= ruleColumnObjectMembersWrapper )
            // InternalPdfMk.g:2824:6: lv_members_1_0= ruleColumnObjectMembersWrapper
            {

            						newCompositeNode(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_21);
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

            // InternalPdfMk.g:2841:4: (otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPdfMk.g:2842:5: otherlv_2= ',' ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_30); 

            	    					newLeafNode(otherlv_2, grammarAccess.getColumnObjectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPdfMk.g:2846:5: ( (lv_members_3_0= ruleColumnObjectMembersWrapper ) )
            	    // InternalPdfMk.g:2847:6: (lv_members_3_0= ruleColumnObjectMembersWrapper )
            	    {
            	    // InternalPdfMk.g:2847:6: (lv_members_3_0= ruleColumnObjectMembersWrapper )
            	    // InternalPdfMk.g:2848:7: lv_members_3_0= ruleColumnObjectMembersWrapper
            	    {

            	    							newCompositeNode(grammarAccess.getColumnObjectAccess().getMembersColumnObjectMembersWrapperParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    break loop31;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalPdfMk.g:2875:1: entryRuleListElements returns [EObject current=null] : iv_ruleListElements= ruleListElements EOF ;
    public final EObject entryRuleListElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElements = null;


        try {
            // InternalPdfMk.g:2875:53: (iv_ruleListElements= ruleListElements EOF )
            // InternalPdfMk.g:2876:2: iv_ruleListElements= ruleListElements EOF
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
    // InternalPdfMk.g:2882:1: ruleListElements returns [EObject current=null] : ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition ) ;
    public final EObject ruleListElements() throws RecognitionException {
        EObject current = null;

        Token lv_elValues_0_0=null;
        EObject this_TextObject_1 = null;

        EObject this_ColumnDefinition_2 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:2888:2: ( ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition ) )
            // InternalPdfMk.g:2889:2: ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition )
            {
            // InternalPdfMk.g:2889:2: ( ( (lv_elValues_0_0= RULE_STRING ) ) | this_TextObject_1= ruleTextObject | this_ColumnDefinition_2= ruleColumnDefinition )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==14) ) {
                switch ( input.LA(2) ) {
                case 17:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 29:
                case 38:
                    {
                    alt32=2;
                    }
                    break;
                case 22:
                    {
                    int LA32_4 = input.LA(3);

                    if ( (LA32_4==18) ) {
                        int LA32_6 = input.LA(4);

                        if ( (LA32_6==RULE_STRING) ) {
                            int LA32_7 = input.LA(5);

                            if ( (LA32_7==15) ) {
                                int LA32_8 = input.LA(6);

                                if ( (LA32_8==28) ) {
                                    alt32=3;
                                }
                                else if ( (LA32_8==17||(LA32_8>=22 && LA32_8<=27)||LA32_8==29||LA32_8==38) ) {
                                    alt32=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 32, 8, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA32_7==16) ) {
                                alt32=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                    {
                    alt32=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPdfMk.g:2890:3: ( (lv_elValues_0_0= RULE_STRING ) )
                    {
                    // InternalPdfMk.g:2890:3: ( (lv_elValues_0_0= RULE_STRING ) )
                    // InternalPdfMk.g:2891:4: (lv_elValues_0_0= RULE_STRING )
                    {
                    // InternalPdfMk.g:2891:4: (lv_elValues_0_0= RULE_STRING )
                    // InternalPdfMk.g:2892:5: lv_elValues_0_0= RULE_STRING
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
                    // InternalPdfMk.g:2909:3: this_TextObject_1= ruleTextObject
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
                    // InternalPdfMk.g:2918:3: this_ColumnDefinition_2= ruleColumnDefinition
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
    // InternalPdfMk.g:2930:1: entryRuleListObject returns [EObject current=null] : iv_ruleListObject= ruleListObject EOF ;
    public final EObject entryRuleListObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListObject = null;


        try {
            // InternalPdfMk.g:2930:51: (iv_ruleListObject= ruleListObject EOF )
            // InternalPdfMk.g:2931:2: iv_ruleListObject= ruleListObject EOF
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
    // InternalPdfMk.g:2937:1: ruleListObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' ) ;
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
            // InternalPdfMk.g:2943:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' ) )
            // InternalPdfMk.g:2944:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' )
            {
            // InternalPdfMk.g:2944:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}' )
            // InternalPdfMk.g:2945:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )? (otherlv_5= 'ul' | otherlv_6= 'ol' ) otherlv_7= ':' otherlv_8= '[' ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* ) otherlv_12= ']' otherlv_13= '}'
            {
            // InternalPdfMk.g:2945:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:2946:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:2946:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:2947:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_31); 

            					newLeafNode(lv_value_0_0, grammarAccess.getListObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:2959:3: ( ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=37 && LA34_0<=41)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPdfMk.g:2960:4: ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) ) otherlv_2= ',' ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )*
                    {
                    // InternalPdfMk.g:2960:4: ( (lv_properties_1_0= ruleListObjectPropertiesWrapper ) )
                    // InternalPdfMk.g:2961:5: (lv_properties_1_0= ruleListObjectPropertiesWrapper )
                    {
                    // InternalPdfMk.g:2961:5: (lv_properties_1_0= ruleListObjectPropertiesWrapper )
                    // InternalPdfMk.g:2962:6: lv_properties_1_0= ruleListObjectPropertiesWrapper
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

                    otherlv_2=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getListObjectAccess().getCommaKeyword_1_1());
                    			
                    // InternalPdfMk.g:2983:4: ( ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ',' )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=37 && LA33_0<=41)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPdfMk.g:2984:5: ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) ) otherlv_4= ','
                    	    {
                    	    // InternalPdfMk.g:2984:5: ( (lv_properties_3_0= ruleListObjectPropertiesWrapper ) )
                    	    // InternalPdfMk.g:2985:6: (lv_properties_3_0= ruleListObjectPropertiesWrapper )
                    	    {
                    	    // InternalPdfMk.g:2985:6: (lv_properties_3_0= ruleListObjectPropertiesWrapper )
                    	    // InternalPdfMk.g:2986:7: lv_properties_3_0= ruleListObjectPropertiesWrapper
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

                    	    otherlv_4=(Token)match(input,15,FOLLOW_31); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getListObjectAccess().getCommaKeyword_1_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPdfMk.g:3009:3: (otherlv_5= 'ul' | otherlv_6= 'ol' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPdfMk.g:3010:4: otherlv_5= 'ul'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getListObjectAccess().getUlKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPdfMk.g:3015:4: otherlv_6= 'ol'
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getListObjectAccess().getOlKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getListObjectAccess().getColonKeyword_3());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getListObjectAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalPdfMk.g:3028:3: ( ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )* )
            // InternalPdfMk.g:3029:4: ( (lv_elements_9_0= ruleListElements ) )? (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )*
            {
            // InternalPdfMk.g:3029:4: ( (lv_elements_9_0= ruleListElements ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING||LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPdfMk.g:3030:5: (lv_elements_9_0= ruleListElements )
                    {
                    // InternalPdfMk.g:3030:5: (lv_elements_9_0= ruleListElements )
                    // InternalPdfMk.g:3031:6: lv_elements_9_0= ruleListElements
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

            // InternalPdfMk.g:3048:4: (otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==15) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPdfMk.g:3049:5: otherlv_10= ',' ( (lv_elemtens_11_0= ruleListElements ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_23); 

            	    					newLeafNode(otherlv_10, grammarAccess.getListObjectAccess().getCommaKeyword_5_1_0());
            	    				
            	    // InternalPdfMk.g:3053:5: ( (lv_elemtens_11_0= ruleListElements ) )
            	    // InternalPdfMk.g:3054:6: (lv_elemtens_11_0= ruleListElements )
            	    {
            	    // InternalPdfMk.g:3054:6: (lv_elemtens_11_0= ruleListElements )
            	    // InternalPdfMk.g:3055:7: lv_elemtens_11_0= ruleListElements
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
            	    break loop37;
                }
            } while (true);


            }

            otherlv_12=(Token)match(input,31,FOLLOW_9); 

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
    // InternalPdfMk.g:3086:1: entryRuleTableObject returns [EObject current=null] : iv_ruleTableObject= ruleTableObject EOF ;
    public final EObject entryRuleTableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableObject = null;


        try {
            // InternalPdfMk.g:3086:52: (iv_ruleTableObject= ruleTableObject EOF )
            // InternalPdfMk.g:3087:2: iv_ruleTableObject= ruleTableObject EOF
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
    // InternalPdfMk.g:3093:1: ruleTableObject returns [EObject current=null] : ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_style_1_0 = null;

        EObject lv_table_3_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3099:2: ( ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' ) )
            // InternalPdfMk.g:3100:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' )
            {
            // InternalPdfMk.g:3100:2: ( ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}' )
            // InternalPdfMk.g:3101:3: ( (lv_value_0_0= '{' ) ) ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )? ( (lv_table_3_0= ruleTableDefinition ) ) otherlv_4= '}'
            {
            // InternalPdfMk.g:3101:3: ( (lv_value_0_0= '{' ) )
            // InternalPdfMk.g:3102:4: (lv_value_0_0= '{' )
            {
            // InternalPdfMk.g:3102:4: (lv_value_0_0= '{' )
            // InternalPdfMk.g:3103:5: lv_value_0_0= '{'
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_32); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTableObjectAccess().getValueLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableObjectRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0, "{");
            				

            }


            }

            // InternalPdfMk.g:3115:3: ( ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPdfMk.g:3116:4: ( (lv_style_1_0= ruleTextStyleDefinition ) ) otherlv_2= ','
                    {
                    // InternalPdfMk.g:3116:4: ( (lv_style_1_0= ruleTextStyleDefinition ) )
                    // InternalPdfMk.g:3117:5: (lv_style_1_0= ruleTextStyleDefinition )
                    {
                    // InternalPdfMk.g:3117:5: (lv_style_1_0= ruleTextStyleDefinition )
                    // InternalPdfMk.g:3118:6: lv_style_1_0= ruleTextStyleDefinition
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

                    otherlv_2=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableObjectAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPdfMk.g:3140:3: ( (lv_table_3_0= ruleTableDefinition ) )
            // InternalPdfMk.g:3141:4: (lv_table_3_0= ruleTableDefinition )
            {
            // InternalPdfMk.g:3141:4: (lv_table_3_0= ruleTableDefinition )
            // InternalPdfMk.g:3142:5: lv_table_3_0= ruleTableDefinition
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
    // InternalPdfMk.g:3167:1: entryRuleContentObject returns [EObject current=null] : iv_ruleContentObject= ruleContentObject EOF ;
    public final EObject entryRuleContentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObject = null;


        try {
            // InternalPdfMk.g:3167:54: (iv_ruleContentObject= ruleContentObject EOF )
            // InternalPdfMk.g:3168:2: iv_ruleContentObject= ruleContentObject EOF
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
    // InternalPdfMk.g:3174:1: ruleContentObject returns [EObject current=null] : ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) ) ;
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
            // InternalPdfMk.g:3180:2: ( ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) ) )
            // InternalPdfMk.g:3181:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) )
            {
            // InternalPdfMk.g:3181:2: ( ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) ) )
            // InternalPdfMk.g:3182:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) )
            {
            // InternalPdfMk.g:3182:3: ( (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject ) )
            // InternalPdfMk.g:3183:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )
            {
            // InternalPdfMk.g:3183:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )
            int alt39=6;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalPdfMk.g:3184:5: lv_value_0_1= ruleStringObject
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
                    // InternalPdfMk.g:3200:5: lv_value_0_2= ruleTextObject
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
                    // InternalPdfMk.g:3216:5: lv_value_0_3= ruleColumnTextObject
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
                    // InternalPdfMk.g:3232:5: lv_value_0_4= ruleImageObject
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
                    // InternalPdfMk.g:3248:5: lv_value_0_5= ruleListObject
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
                    // InternalPdfMk.g:3264:5: lv_value_0_6= ruleTableObject
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
    // InternalPdfMk.g:3285:1: entryRuleContentObjects returns [EObject current=null] : iv_ruleContentObjects= ruleContentObjects EOF ;
    public final EObject entryRuleContentObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentObjects = null;


        try {
            // InternalPdfMk.g:3285:55: (iv_ruleContentObjects= ruleContentObjects EOF )
            // InternalPdfMk.g:3286:2: iv_ruleContentObjects= ruleContentObjects EOF
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
    // InternalPdfMk.g:3292:1: ruleContentObjects returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleContentObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3298:2: ( ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' ) )
            // InternalPdfMk.g:3299:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' )
            {
            // InternalPdfMk.g:3299:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']' )
            // InternalPdfMk.g:3300:3: () otherlv_1= '[' ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )? otherlv_5= ']'
            {
            // InternalPdfMk.g:3300:3: ()
            // InternalPdfMk.g:3301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentObjectsAccess().getContentObjectsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getContentObjectsAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPdfMk.g:3311:3: ( ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING||LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPdfMk.g:3312:4: ( (lv_value_2_0= ruleContentObject ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )*
                    {
                    // InternalPdfMk.g:3312:4: ( (lv_value_2_0= ruleContentObject ) )
                    // InternalPdfMk.g:3313:5: (lv_value_2_0= ruleContentObject )
                    {
                    // InternalPdfMk.g:3313:5: (lv_value_2_0= ruleContentObject )
                    // InternalPdfMk.g:3314:6: lv_value_2_0= ruleContentObject
                    {

                    						newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalPdfMk.g:3331:4: (otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==15) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalPdfMk.g:3332:5: otherlv_3= ',' ( (lv_value_4_0= ruleContentObject ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getContentObjectsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPdfMk.g:3336:5: ( (lv_value_4_0= ruleContentObject ) )
                    	    // InternalPdfMk.g:3337:6: (lv_value_4_0= ruleContentObject )
                    	    {
                    	    // InternalPdfMk.g:3337:6: (lv_value_4_0= ruleContentObject )
                    	    // InternalPdfMk.g:3338:7: lv_value_4_0= ruleContentObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentObjectsAccess().getValueContentObjectParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalPdfMk.g:3365:1: entryRuleStyles returns [EObject current=null] : iv_ruleStyles= ruleStyles EOF ;
    public final EObject entryRuleStyles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyles = null;


        try {
            // InternalPdfMk.g:3365:47: (iv_ruleStyles= ruleStyles EOF )
            // InternalPdfMk.g:3366:2: iv_ruleStyles= ruleStyles EOF
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
    // InternalPdfMk.g:3372:1: ruleStyles returns [EObject current=null] : ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) ;
    public final EObject ruleStyles() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3378:2: ( ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) ) )
            // InternalPdfMk.g:3379:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            {
            // InternalPdfMk.g:3379:2: ( ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) ) )
            // InternalPdfMk.g:3380:3: ( (lv_key_0_0= 'styles' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStyleObjects ) )
            {
            // InternalPdfMk.g:3380:3: ( (lv_key_0_0= 'styles' ) )
            // InternalPdfMk.g:3381:4: (lv_key_0_0= 'styles' )
            {
            // InternalPdfMk.g:3381:4: (lv_key_0_0= 'styles' )
            // InternalPdfMk.g:3382:5: lv_key_0_0= 'styles'
            {
            lv_key_0_0=(Token)match(input,46,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStylesAccess().getKeyStylesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStylesRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "styles");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStylesAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:3398:3: ( (lv_value_2_0= ruleStyleObjects ) )
            // InternalPdfMk.g:3399:4: (lv_value_2_0= ruleStyleObjects )
            {
            // InternalPdfMk.g:3399:4: (lv_value_2_0= ruleStyleObjects )
            // InternalPdfMk.g:3400:5: lv_value_2_0= ruleStyleObjects
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
    // InternalPdfMk.g:3421:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPdfMk.g:3421:48: (iv_ruleContent= ruleContent EOF )
            // InternalPdfMk.g:3422:2: iv_ruleContent= ruleContent EOF
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
    // InternalPdfMk.g:3428:1: ruleContent returns [EObject current=null] : ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPdfMk.g:3434:2: ( ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) ) )
            // InternalPdfMk.g:3435:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            {
            // InternalPdfMk.g:3435:2: ( ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) ) )
            // InternalPdfMk.g:3436:3: ( (lv_key_0_0= 'content' ) ) otherlv_1= ':' ( (lv_value_2_0= ruleContentObjects ) )
            {
            // InternalPdfMk.g:3436:3: ( (lv_key_0_0= 'content' ) )
            // InternalPdfMk.g:3437:4: (lv_key_0_0= 'content' )
            {
            // InternalPdfMk.g:3437:4: (lv_key_0_0= 'content' )
            // InternalPdfMk.g:3438:5: lv_key_0_0= 'content'
            {
            lv_key_0_0=(Token)match(input,47,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getContentAccess().getKeyContentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "content");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getColonKeyword_1());
            		
            // InternalPdfMk.g:3454:3: ( (lv_value_2_0= ruleContentObjects ) )
            // InternalPdfMk.g:3455:4: (lv_value_2_0= ruleContentObjects )
            {
            // InternalPdfMk.g:3455:4: (lv_value_2_0= ruleContentObjects )
            // InternalPdfMk.g:3456:5: lv_value_2_0= ruleContentObjects
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\21\1\uffff\1\22\1\uffff\1\22\1\uffff\2\5\2\17\1\21\1\uffff\1\21\2\22\2\5\2\17\1\21";
    static final String dfa_3s = "\1\16\1\uffff\1\55\1\uffff\1\22\1\uffff\1\22\1\uffff\1\25\1\5\2\20\1\46\1\uffff\1\55\2\22\1\25\1\5\2\20\1\55";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\4\1\uffff\1\2\5\uffff\1\2\10\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\7\4\uffff\5\7\1\4\1\uffff\1\7\2\uffff\5\3\1\5\1\6\3\5\2\uffff\2\5",
            "",
            "\1\10",
            "",
            "\1\11",
            "",
            "\1\12\17\uffff\1\7",
            "\1\13",
            "\1\14\1\15",
            "\1\16\1\15",
            "\1\15\4\uffff\5\15\1\17\1\uffff\1\15\2\uffff\5\3\1\uffff\1\15",
            "",
            "\1\15\4\uffff\6\15\1\uffff\1\15\7\uffff\1\5\1\20\3\5\2\uffff\2\5",
            "\1\21",
            "\1\22",
            "\1\23\17\uffff\1\15",
            "\1\24",
            "\1\14\1\15",
            "\1\25\1\15",
            "\1\15\4\uffff\6\15\1\uffff\1\15\7\uffff\1\5\1\20\3\5\2\uffff\2\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1499:4: (lv_elements_0_1= ruleStringObject | lv_elements_0_2= ruleTextObject | lv_elements_0_3= ruleImageObject | lv_elements_0_4= ruleListObject )";
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\1\3\17\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\uffff\2\21\1\uffff\1\22\1\uffff\1\22\2\4\2\17\2\21";
    static final String dfa_10s = "\1\17\1\uffff\1\16\1\uffff\2\46\1\uffff\1\22\1\uffff\1\22\2\4\2\20\2\46";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\7\uffff";
    static final String dfa_12s = "\20\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\11\uffff\1\4\1\2",
            "",
            "\1\3\11\uffff\1\5",
            "",
            "\1\6\4\uffff\1\7\5\6\1\10\1\6\10\uffff\1\6",
            "\1\6\4\uffff\1\11\5\6\1\10\1\6\10\uffff\1\6",
            "",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\6",
            "\1\17\1\6",
            "\1\6\4\uffff\6\6\1\10\1\6\10\uffff\1\6",
            "\1\6\4\uffff\6\6\1\10\1\6\10\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2063:2: ( ( ( (lv_text_0_0= ruleStringObject ) )? (otherlv_1= ',' ( (lv_text_2_0= ruleStringObject ) ) )* ) | ( ( (lv_textObject_3_0= ruleTextObject ) )? (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )* ) | ( ( (lv_column_6_0= ruleColumnDefinition ) )? (otherlv_7= ',' ( (lv_column_8_0= ruleColumnDefinition ) ) )* ) )";
        }
    }
    static final String dfa_14s = "\112\uffff";
    static final String dfa_15s = "\1\1\111\uffff";
    static final String dfa_16s = "\1\17\1\uffff\1\4\1\21\11\22\2\4\1\5\1\4\2\23\1\5\1\36\1\5\12\17\1\5\1\17\1\21\1\uffff\1\17\1\5\1\17\11\22\1\17\2\4\1\5\1\4\2\23\1\5\1\36\1\5\12\17\1\5\2\17\1\5\2\17";
    static final String dfa_17s = "\1\37\1\uffff\1\37\1\46\11\22\2\4\1\5\1\4\2\24\1\25\1\36\1\5\12\20\1\37\1\20\1\46\1\uffff\1\37\1\5\1\20\11\22\1\37\2\4\1\5\1\4\2\24\1\25\1\36\1\5\12\20\1\37\1\20\1\37\1\5\1\20\1\37";
    static final String dfa_18s = "\1\uffff\1\2\41\uffff\1\1\46\uffff";
    static final String dfa_19s = "\112\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\17\uffff\1\1",
            "",
            "\1\1\11\uffff\1\3\1\1\17\uffff\1\1",
            "\1\10\4\uffff\1\5\1\4\1\7\1\11\1\6\1\12\1\uffff\1\13\10\uffff\1\14",
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
            "\1\36\17\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\44\11\uffff\1\45\17\uffff\1\46",
            "\1\42\1\43",
            "\1\53\4\uffff\1\50\1\47\1\52\1\54\1\51\1\55\1\uffff\1\56\10\uffff\1\57",
            "",
            "\1\45\17\uffff\1\46",
            "\1\60",
            "\1\42\1\43",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\45\17\uffff\1\46",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\1\77",
            "\1\100\1\101",
            "\1\102\17\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\106\11\uffff\1\107\17\uffff\1\110",
            "\1\42\1\43",
            "\1\107\17\uffff\1\110",
            "\1\111",
            "\1\42\1\43",
            "\1\107\17\uffff\1\110"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 2290:4: (otherlv_4= ',' ( (lv_textObject_5_0= ruleTextObject ) ) )*";
        }
    }
    static final String dfa_21s = "\34\uffff";
    static final String dfa_22s = "\1\4\1\uffff\1\21\1\uffff\3\22\4\uffff\1\4\2\5\3\17\2\21\1\uffff\1\21\2\22\2\5\2\17\1\21";
    static final String dfa_23s = "\1\16\1\uffff\1\55\1\uffff\3\22\4\uffff\1\4\1\25\1\5\3\20\1\53\1\46\1\uffff\1\55\2\22\1\25\1\5\2\20\1\55";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\2\3\uffff\1\5\1\6\1\3\1\4\10\uffff\1\2\10\uffff";
    static final String dfa_25s = "\34\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\3\4\uffff\1\4\4\3\1\5\1\11\1\3\2\uffff\5\12\1\7\1\6\3\7\1\uffff\1\10\2\7",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\17\17\uffff\1\3",
            "\1\20",
            "\1\21\1\3",
            "\1\22\1\23",
            "\1\24\1\23",
            "\1\23\4\uffff\6\23\1\11\1\23\10\uffff\1\23\4\uffff\1\10",
            "\1\23\4\uffff\5\23\1\25\1\uffff\1\23\2\uffff\5\12\1\uffff\1\23",
            "",
            "\1\23\4\uffff\6\23\1\uffff\1\23\7\uffff\1\7\1\26\3\7\2\uffff\2\7",
            "\1\27",
            "\1\30",
            "\1\31\17\uffff\1\23",
            "\1\32",
            "\1\22\1\23",
            "\1\33\1\23",
            "\1\23\4\uffff\6\23\1\uffff\1\23\7\uffff\1\7\1\26\3\7\2\uffff\2\7"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3183:4: (lv_value_0_1= ruleStringObject | lv_value_0_2= ruleTextObject | lv_value_0_3= ruleColumnTextObject | lv_value_0_4= ruleImageObject | lv_value_0_5= ruleListObject | lv_value_0_6= ruleTableObject )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040018000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080008020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000402FC20000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000027020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001F08000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000008000C010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000033E02FC20000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080004010L});

}