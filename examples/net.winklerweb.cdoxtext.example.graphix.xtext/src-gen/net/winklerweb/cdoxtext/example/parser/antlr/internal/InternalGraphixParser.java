package net.winklerweb.cdoxtext.example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.winklerweb.cdoxtext.example.services.GraphixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphixParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Canvas'", "'('", "'..'", "')'", "'{'", "';'", "'}'", "'|'", "'Circle'", "'at'", "'radius'", "'line'", "'fill'", "'Color'", "','", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGraphixParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphixParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphixParser.tokenNames; }
    public String getGrammarFileName() { return "../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g"; }



     	private GraphixGrammarAccess grammarAccess;
     	
        public InternalGraphixParser(TokenStream input, GraphixGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GraphixCanvas";	
       	}
       	
       	@Override
       	protected GraphixGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGraphixCanvas"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:67:1: entryRuleGraphixCanvas returns [EObject current=null] : iv_ruleGraphixCanvas= ruleGraphixCanvas EOF ;
    public final EObject entryRuleGraphixCanvas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphixCanvas = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:68:2: (iv_ruleGraphixCanvas= ruleGraphixCanvas EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:69:2: iv_ruleGraphixCanvas= ruleGraphixCanvas EOF
            {
             newCompositeNode(grammarAccess.getGraphixCanvasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraphixCanvas_in_entryRuleGraphixCanvas75);
            iv_ruleGraphixCanvas=ruleGraphixCanvas();

            state._fsp--;

             current =iv_ruleGraphixCanvas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGraphixCanvas85); 

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
    // $ANTLR end "entryRuleGraphixCanvas"


    // $ANTLR start "ruleGraphixCanvas"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:76:1: ruleGraphixCanvas returns [EObject current=null] : (otherlv_0= 'Canvas' otherlv_1= '(' ( (lv_lowerLeftBounds_2_0= rulePoint ) ) otherlv_3= '..' ( (lv_upperRightBounds_4_0= rulePoint ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleGraphixCanvas() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_lowerLeftBounds_2_0 = null;

        EObject lv_upperRightBounds_4_0 = null;

        EObject lv_content_7_0 = null;

        EObject lv_content_9_0 = null;


         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:79:28: ( (otherlv_0= 'Canvas' otherlv_1= '(' ( (lv_lowerLeftBounds_2_0= rulePoint ) ) otherlv_3= '..' ( (lv_upperRightBounds_4_0= rulePoint ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )* )? otherlv_10= '}' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:80:1: (otherlv_0= 'Canvas' otherlv_1= '(' ( (lv_lowerLeftBounds_2_0= rulePoint ) ) otherlv_3= '..' ( (lv_upperRightBounds_4_0= rulePoint ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )* )? otherlv_10= '}' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:80:1: (otherlv_0= 'Canvas' otherlv_1= '(' ( (lv_lowerLeftBounds_2_0= rulePoint ) ) otherlv_3= '..' ( (lv_upperRightBounds_4_0= rulePoint ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )* )? otherlv_10= '}' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:80:3: otherlv_0= 'Canvas' otherlv_1= '(' ( (lv_lowerLeftBounds_2_0= rulePoint ) ) otherlv_3= '..' ( (lv_upperRightBounds_4_0= rulePoint ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )* )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGraphixCanvas122); 

                	newLeafNode(otherlv_0, grammarAccess.getGraphixCanvasAccess().getCanvasKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGraphixCanvas134); 

                	newLeafNode(otherlv_1, grammarAccess.getGraphixCanvasAccess().getLeftParenthesisKeyword_1());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:88:1: ( (lv_lowerLeftBounds_2_0= rulePoint ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:89:1: (lv_lowerLeftBounds_2_0= rulePoint )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:89:1: (lv_lowerLeftBounds_2_0= rulePoint )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:90:3: lv_lowerLeftBounds_2_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getGraphixCanvasAccess().getLowerLeftBoundsPointParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_ruleGraphixCanvas155);
            lv_lowerLeftBounds_2_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphixCanvasRule());
            	        }
                   		set(
                   			current, 
                   			"lowerLeftBounds",
                    		lv_lowerLeftBounds_2_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGraphixCanvas167); 

                	newLeafNode(otherlv_3, grammarAccess.getGraphixCanvasAccess().getFullStopFullStopKeyword_3());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:110:1: ( (lv_upperRightBounds_4_0= rulePoint ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:111:1: (lv_upperRightBounds_4_0= rulePoint )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:111:1: (lv_upperRightBounds_4_0= rulePoint )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:112:3: lv_upperRightBounds_4_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getGraphixCanvasAccess().getUpperRightBoundsPointParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_ruleGraphixCanvas188);
            lv_upperRightBounds_4_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphixCanvasRule());
            	        }
                   		set(
                   			current, 
                   			"upperRightBounds",
                    		lv_upperRightBounds_4_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGraphixCanvas200); 

                	newLeafNode(otherlv_5, grammarAccess.getGraphixCanvasAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGraphixCanvas212); 

                	newLeafNode(otherlv_6, grammarAccess.getGraphixCanvasAccess().getLeftCurlyBracketKeyword_6());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:136:1: ( ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19||LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:136:2: ( (lv_content_7_0= ruleGraphixElement ) ) (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )*
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:136:2: ( (lv_content_7_0= ruleGraphixElement ) )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:137:1: (lv_content_7_0= ruleGraphixElement )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:137:1: (lv_content_7_0= ruleGraphixElement )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:138:3: lv_content_7_0= ruleGraphixElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getGraphixCanvasAccess().getContentGraphixElementParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGraphixElement_in_ruleGraphixCanvas234);
                    lv_content_7_0=ruleGraphixElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGraphixCanvasRule());
                    	        }
                           		add(
                           			current, 
                           			"content",
                            		lv_content_7_0, 
                            		"GraphixElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:154:2: (otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:154:4: otherlv_8= ';' ( (lv_content_9_0= ruleGraphixElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGraphixCanvas247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getGraphixCanvasAccess().getSemicolonKeyword_7_1_0());
                    	        
                    	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:158:1: ( (lv_content_9_0= ruleGraphixElement ) )
                    	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:159:1: (lv_content_9_0= ruleGraphixElement )
                    	    {
                    	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:159:1: (lv_content_9_0= ruleGraphixElement )
                    	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:160:3: lv_content_9_0= ruleGraphixElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGraphixCanvasAccess().getContentGraphixElementParserRuleCall_7_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGraphixElement_in_ruleGraphixCanvas268);
                    	    lv_content_9_0=ruleGraphixElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGraphixCanvasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"content",
                    	            		lv_content_9_0, 
                    	            		"GraphixElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGraphixCanvas284); 

                	newLeafNode(otherlv_10, grammarAccess.getGraphixCanvasAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleGraphixCanvas"


    // $ANTLR start "entryRuleGraphixElement"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:188:1: entryRuleGraphixElement returns [EObject current=null] : iv_ruleGraphixElement= ruleGraphixElement EOF ;
    public final EObject entryRuleGraphixElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphixElement = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:189:2: (iv_ruleGraphixElement= ruleGraphixElement EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:190:2: iv_ruleGraphixElement= ruleGraphixElement EOF
            {
             newCompositeNode(grammarAccess.getGraphixElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraphixElement_in_entryRuleGraphixElement320);
            iv_ruleGraphixElement=ruleGraphixElement();

            state._fsp--;

             current =iv_ruleGraphixElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGraphixElement330); 

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
    // $ANTLR end "entryRuleGraphixElement"


    // $ANTLR start "ruleGraphixElement"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:197:1: ruleGraphixElement returns [EObject current=null] : (this_Circle_0= ruleCircle | this_Color_1= ruleColor ) ;
    public final EObject ruleGraphixElement() throws RecognitionException {
        EObject current = null;

        EObject this_Circle_0 = null;

        EObject this_Color_1 = null;


         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:200:28: ( (this_Circle_0= ruleCircle | this_Color_1= ruleColor ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:201:1: (this_Circle_0= ruleCircle | this_Color_1= ruleColor )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:201:1: (this_Circle_0= ruleCircle | this_Color_1= ruleColor )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
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
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:202:5: this_Circle_0= ruleCircle
                    {
                     
                            newCompositeNode(grammarAccess.getGraphixElementAccess().getCircleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCircle_in_ruleGraphixElement377);
                    this_Circle_0=ruleCircle();

                    state._fsp--;

                     
                            current = this_Circle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:212:5: this_Color_1= ruleColor
                    {
                     
                            newCompositeNode(grammarAccess.getGraphixElementAccess().getColorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleColor_in_ruleGraphixElement404);
                    this_Color_1=ruleColor();

                    state._fsp--;

                     
                            current = this_Color_1; 
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
    // $ANTLR end "ruleGraphixElement"


    // $ANTLR start "entryRulePoint"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:228:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:229:2: (iv_rulePoint= rulePoint EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:230:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_entryRulePoint439);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePoint449); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:237:1: rulePoint returns [EObject current=null] : ( () (otherlv_1= '(' )? ( (lv_x_2_0= ruleEDouble ) ) otherlv_3= '|' ( (lv_y_4_0= ruleEDouble ) ) (otherlv_5= ')' )? ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:240:28: ( ( () (otherlv_1= '(' )? ( (lv_x_2_0= ruleEDouble ) ) otherlv_3= '|' ( (lv_y_4_0= ruleEDouble ) ) (otherlv_5= ')' )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:241:1: ( () (otherlv_1= '(' )? ( (lv_x_2_0= ruleEDouble ) ) otherlv_3= '|' ( (lv_y_4_0= ruleEDouble ) ) (otherlv_5= ')' )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:241:1: ( () (otherlv_1= '(' )? ( (lv_x_2_0= ruleEDouble ) ) otherlv_3= '|' ( (lv_y_4_0= ruleEDouble ) ) (otherlv_5= ')' )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:241:2: () (otherlv_1= '(' )? ( (lv_x_2_0= ruleEDouble ) ) otherlv_3= '|' ( (lv_y_4_0= ruleEDouble ) ) (otherlv_5= ')' )?
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:241:2: ()
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:242:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPointAccess().getPointAction_0(),
                        current);
                

            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:247:2: (otherlv_1= '(' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:247:4: otherlv_1= '('
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePoint496); 

                        	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getLeftParenthesisKeyword_1());
                        

                    }
                    break;

            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:251:3: ( (lv_x_2_0= ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:252:1: (lv_x_2_0= ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:252:1: (lv_x_2_0= ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:253:3: lv_x_2_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getPointAccess().getXEDoubleParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rulePoint519);
            lv_x_2_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointRule());
            	        }
                   		set(
                   			current, 
                   			"x",
                    		lv_x_2_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePoint531); 

                	newLeafNode(otherlv_3, grammarAccess.getPointAccess().getVerticalLineKeyword_3());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:273:1: ( (lv_y_4_0= ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:274:1: (lv_y_4_0= ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:274:1: (lv_y_4_0= ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:275:3: lv_y_4_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getPointAccess().getYEDoubleParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rulePoint552);
            lv_y_4_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointRule());
            	        }
                   		set(
                   			current, 
                   			"y",
                    		lv_y_4_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:291:2: (otherlv_5= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=13 && LA5_1<=14)||LA5_1==21) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:291:4: otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePoint565); 

                        	newLeafNode(otherlv_5, grammarAccess.getPointAccess().getRightParenthesisKeyword_5());
                        

                    }
                    break;

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleCircle"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:303:1: entryRuleCircle returns [EObject current=null] : iv_ruleCircle= ruleCircle EOF ;
    public final EObject entryRuleCircle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircle = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:304:2: (iv_ruleCircle= ruleCircle EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:305:2: iv_ruleCircle= ruleCircle EOF
            {
             newCompositeNode(grammarAccess.getCircleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCircle_in_entryRuleCircle603);
            iv_ruleCircle=ruleCircle();

            state._fsp--;

             current =iv_ruleCircle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCircle613); 

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
    // $ANTLR end "entryRuleCircle"


    // $ANTLR start "ruleCircle"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:312:1: ruleCircle returns [EObject current=null] : (otherlv_0= 'Circle' otherlv_1= 'at' ( (lv_center_2_0= rulePoint ) ) otherlv_3= 'radius' ( (lv_radius_4_0= ruleEDouble ) ) ( (otherlv_5= 'line' ( ( ruleEString ) ) ) | (otherlv_7= 'fill' ( ( ruleEString ) ) ) )* ) ;
    public final EObject ruleCircle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_center_2_0 = null;

        AntlrDatatypeRuleToken lv_radius_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:315:28: ( (otherlv_0= 'Circle' otherlv_1= 'at' ( (lv_center_2_0= rulePoint ) ) otherlv_3= 'radius' ( (lv_radius_4_0= ruleEDouble ) ) ( (otherlv_5= 'line' ( ( ruleEString ) ) ) | (otherlv_7= 'fill' ( ( ruleEString ) ) ) )* ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:316:1: (otherlv_0= 'Circle' otherlv_1= 'at' ( (lv_center_2_0= rulePoint ) ) otherlv_3= 'radius' ( (lv_radius_4_0= ruleEDouble ) ) ( (otherlv_5= 'line' ( ( ruleEString ) ) ) | (otherlv_7= 'fill' ( ( ruleEString ) ) ) )* )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:316:1: (otherlv_0= 'Circle' otherlv_1= 'at' ( (lv_center_2_0= rulePoint ) ) otherlv_3= 'radius' ( (lv_radius_4_0= ruleEDouble ) ) ( (otherlv_5= 'line' ( ( ruleEString ) ) ) | (otherlv_7= 'fill' ( ( ruleEString ) ) ) )* )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:316:3: otherlv_0= 'Circle' otherlv_1= 'at' ( (lv_center_2_0= rulePoint ) ) otherlv_3= 'radius' ( (lv_radius_4_0= ruleEDouble ) ) ( (otherlv_5= 'line' ( ( ruleEString ) ) ) | (otherlv_7= 'fill' ( ( ruleEString ) ) ) )*
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCircle650); 

                	newLeafNode(otherlv_0, grammarAccess.getCircleAccess().getCircleKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCircle662); 

                	newLeafNode(otherlv_1, grammarAccess.getCircleAccess().getAtKeyword_1());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:324:1: ( (lv_center_2_0= rulePoint ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:325:1: (lv_center_2_0= rulePoint )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:325:1: (lv_center_2_0= rulePoint )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:326:3: lv_center_2_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getCircleAccess().getCenterPointParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_ruleCircle683);
            lv_center_2_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCircleRule());
            	        }
                   		set(
                   			current, 
                   			"center",
                    		lv_center_2_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCircle695); 

                	newLeafNode(otherlv_3, grammarAccess.getCircleAccess().getRadiusKeyword_3());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:346:1: ( (lv_radius_4_0= ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:347:1: (lv_radius_4_0= ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:347:1: (lv_radius_4_0= ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:348:3: lv_radius_4_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getCircleAccess().getRadiusEDoubleParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleCircle716);
            lv_radius_4_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCircleRule());
            	        }
                   		set(
                   			current, 
                   			"radius",
                    		lv_radius_4_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:364:2: ( (otherlv_5= 'line' ( ( ruleEString ) ) ) | (otherlv_7= 'fill' ( ( ruleEString ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }
                else if ( (LA6_0==23) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:364:3: (otherlv_5= 'line' ( ( ruleEString ) ) )
            	    {
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:364:3: (otherlv_5= 'line' ( ( ruleEString ) ) )
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:364:5: otherlv_5= 'line' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCircle730); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCircleAccess().getLineKeyword_5_0_0());
            	        
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:368:1: ( ( ruleEString ) )
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:369:1: ( ruleEString )
            	    {
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:369:1: ( ruleEString )
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:370:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCircleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCircleAccess().getLineColorColorCrossReference_5_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCircle753);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:384:6: (otherlv_7= 'fill' ( ( ruleEString ) ) )
            	    {
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:384:6: (otherlv_7= 'fill' ( ( ruleEString ) ) )
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:384:8: otherlv_7= 'fill' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCircle773); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCircleAccess().getFillKeyword_5_1_0());
            	        
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:388:1: ( ( ruleEString ) )
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:389:1: ( ruleEString )
            	    {
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:389:1: ( ruleEString )
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:390:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCircleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCircleAccess().getFillColorColorCrossReference_5_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCircle796);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleCircle"


    // $ANTLR start "entryRuleColor"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:411:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:412:2: (iv_ruleColor= ruleColor EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:413:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleColor_in_entryRuleColor835);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColor845); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:420:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')' ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_red_4_0 = null;

        AntlrDatatypeRuleToken lv_green_6_0 = null;

        AntlrDatatypeRuleToken lv_blue_8_0 = null;

        AntlrDatatypeRuleToken lv_alpha_10_0 = null;


         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:423:28: ( ( () otherlv_1= 'Color' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')' ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:424:1: ( () otherlv_1= 'Color' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')' ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:424:1: ( () otherlv_1= 'Color' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:424:2: () otherlv_1= 'Color' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:424:2: ()
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:425:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorAccess().getColorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleColor891); 

                	newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:434:1: ( (lv_name_2_0= ruleEString ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:435:1: (lv_name_2_0= ruleEString )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:435:1: (lv_name_2_0= ruleEString )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:436:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleColor912);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:452:2: (otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:452:4: otherlv_3= '(' ( (lv_red_4_0= ruleEDouble ) ) otherlv_5= ',' ( (lv_green_6_0= ruleEDouble ) ) otherlv_7= ',' ( (lv_blue_8_0= ruleEDouble ) ) (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= ')'
            {
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleColor925); 

                	newLeafNode(otherlv_3, grammarAccess.getColorAccess().getLeftParenthesisKeyword_3_0());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:456:1: ( (lv_red_4_0= ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:457:1: (lv_red_4_0= ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:457:1: (lv_red_4_0= ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:458:3: lv_red_4_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getRedEDoubleParserRuleCall_3_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleColor946);
            lv_red_4_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"red",
                    		lv_red_4_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleColor958); 

                	newLeafNode(otherlv_5, grammarAccess.getColorAccess().getCommaKeyword_3_2());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:478:1: ( (lv_green_6_0= ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:479:1: (lv_green_6_0= ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:479:1: (lv_green_6_0= ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:480:3: lv_green_6_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getGreenEDoubleParserRuleCall_3_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleColor979);
            lv_green_6_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"green",
                    		lv_green_6_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleColor991); 

                	newLeafNode(otherlv_7, grammarAccess.getColorAccess().getCommaKeyword_3_4());
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:500:1: ( (lv_blue_8_0= ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:501:1: (lv_blue_8_0= ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:501:1: (lv_blue_8_0= ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:502:3: lv_blue_8_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getBlueEDoubleParserRuleCall_3_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleColor1012);
            lv_blue_8_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"blue",
                    		lv_blue_8_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:518:2: (otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:518:4: otherlv_9= ',' ( (lv_alpha_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleColor1025); 

                        	newLeafNode(otherlv_9, grammarAccess.getColorAccess().getCommaKeyword_3_6_0());
                        
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:522:1: ( (lv_alpha_10_0= ruleEDouble ) )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:523:1: (lv_alpha_10_0= ruleEDouble )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:523:1: (lv_alpha_10_0= ruleEDouble )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:524:3: lv_alpha_10_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getAlphaEDoubleParserRuleCall_3_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleColor1046);
                    lv_alpha_10_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"alpha",
                            		lv_alpha_10_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleColor1060); 

                	newLeafNode(otherlv_11, grammarAccess.getColorAccess().getRightParenthesisKeyword_3_7());
                

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleEDouble"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:552:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:553:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:554:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1098);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1109); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:561:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:564:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:565:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:565:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:565:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:565:2: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:566:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDouble1148); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:571:3: (this_INT_1= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:571:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1166); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDouble1186); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1201); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:591:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=28 && LA12_0<=29)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:591:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:591:2: (kw= 'E' | kw= 'e' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==28) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==29) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:592:2: kw= 'E'
                            {
                            kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDouble1221); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:599:2: kw= 'e'
                            {
                            kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDouble1240); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:604:2: (kw= '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==26) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:605:2: kw= '-'
                            {
                            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDouble1255); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1272); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:625:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:626:2: (iv_ruleEString= ruleEString EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:627:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1320);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1331); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:634:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:637:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:638:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:638:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:638:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1371); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext/src-gen/net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.g:646:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1397); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGraphixCanvas_in_entryRuleGraphixCanvas75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGraphixCanvas85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGraphixCanvas122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGraphixCanvas134 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_rulePoint_in_ruleGraphixCanvas155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGraphixCanvas167 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_rulePoint_in_ruleGraphixCanvas188 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGraphixCanvas200 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGraphixCanvas212 = new BitSet(new long[]{0x00000000010A0000L});
        public static final BitSet FOLLOW_ruleGraphixElement_in_ruleGraphixCanvas234 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleGraphixCanvas247 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_ruleGraphixElement_in_ruleGraphixCanvas268 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleGraphixCanvas284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGraphixElement_in_entryRuleGraphixElement320 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGraphixElement330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCircle_in_ruleGraphixElement377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColor_in_ruleGraphixElement404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_entryRulePoint439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePoint449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rulePoint496 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_rulePoint519 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePoint531 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_rulePoint552 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_rulePoint565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCircle_in_entryRuleCircle603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCircle613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleCircle650 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCircle662 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_rulePoint_in_ruleCircle683 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCircle695 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleCircle716 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_22_in_ruleCircle730 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCircle753 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_23_in_ruleCircle773 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCircle796 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_ruleColor_in_entryRuleColor835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColor845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleColor891 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleColor912 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleColor925 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleColor946 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleColor958 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleColor979 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleColor991 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleColor1012 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_25_in_ruleColor1025 = new BitSet(new long[]{0x000000000C001010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleColor1046 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleColor1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1098 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEDouble1148 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1166 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleEDouble1186 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1201 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_28_in_ruleEDouble1221 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_29_in_ruleEDouble1240 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_26_in_ruleEDouble1255 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1320 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1397 = new BitSet(new long[]{0x0000000000000002L});
    }


}