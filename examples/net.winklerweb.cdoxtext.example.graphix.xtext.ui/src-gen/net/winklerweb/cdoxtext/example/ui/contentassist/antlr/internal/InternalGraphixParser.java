package net.winklerweb.cdoxtext.example.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.winklerweb.cdoxtext.example.services.GraphixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphixParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Canvas'", "'('", "'..'", "')'", "'{'", "'}'", "';'", "'|'", "'Circle'", "'at'", "'radius'", "'line'", "'fill'", "'Color'", "','", "'-'", "'.'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g"; }


     
     	private GraphixGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GraphixGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleGraphixCanvas"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:60:1: entryRuleGraphixCanvas : ruleGraphixCanvas EOF ;
    public final void entryRuleGraphixCanvas() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:61:1: ( ruleGraphixCanvas EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:62:1: ruleGraphixCanvas EOF
            {
             before(grammarAccess.getGraphixCanvasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraphixCanvas_in_entryRuleGraphixCanvas61);
            ruleGraphixCanvas();

            state._fsp--;

             after(grammarAccess.getGraphixCanvasRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGraphixCanvas68); 

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
    // $ANTLR end "entryRuleGraphixCanvas"


    // $ANTLR start "ruleGraphixCanvas"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:69:1: ruleGraphixCanvas : ( ( rule__GraphixCanvas__Group__0 ) ) ;
    public final void ruleGraphixCanvas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:73:2: ( ( ( rule__GraphixCanvas__Group__0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:74:1: ( ( rule__GraphixCanvas__Group__0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:74:1: ( ( rule__GraphixCanvas__Group__0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:75:1: ( rule__GraphixCanvas__Group__0 )
            {
             before(grammarAccess.getGraphixCanvasAccess().getGroup()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:76:1: ( rule__GraphixCanvas__Group__0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:76:2: rule__GraphixCanvas__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__0_in_ruleGraphixCanvas94);
            rule__GraphixCanvas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphixCanvasAccess().getGroup()); 

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
    // $ANTLR end "ruleGraphixCanvas"


    // $ANTLR start "entryRuleGraphixElement"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:88:1: entryRuleGraphixElement : ruleGraphixElement EOF ;
    public final void entryRuleGraphixElement() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:89:1: ( ruleGraphixElement EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:90:1: ruleGraphixElement EOF
            {
             before(grammarAccess.getGraphixElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraphixElement_in_entryRuleGraphixElement121);
            ruleGraphixElement();

            state._fsp--;

             after(grammarAccess.getGraphixElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGraphixElement128); 

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
    // $ANTLR end "entryRuleGraphixElement"


    // $ANTLR start "ruleGraphixElement"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:97:1: ruleGraphixElement : ( ( rule__GraphixElement__Alternatives ) ) ;
    public final void ruleGraphixElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:101:2: ( ( ( rule__GraphixElement__Alternatives ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:102:1: ( ( rule__GraphixElement__Alternatives ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:102:1: ( ( rule__GraphixElement__Alternatives ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:103:1: ( rule__GraphixElement__Alternatives )
            {
             before(grammarAccess.getGraphixElementAccess().getAlternatives()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:104:1: ( rule__GraphixElement__Alternatives )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:104:2: rule__GraphixElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixElement__Alternatives_in_ruleGraphixElement154);
            rule__GraphixElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphixElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGraphixElement"


    // $ANTLR start "entryRulePoint"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:116:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:117:1: ( rulePoint EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:118:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_entryRulePoint181);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePoint188); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:125:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:129:2: ( ( ( rule__Point__Group__0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:130:1: ( ( rule__Point__Group__0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:130:1: ( ( rule__Point__Group__0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:131:1: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:132:1: ( rule__Point__Group__0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:132:2: rule__Point__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__0_in_rulePoint214);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleCircle"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:144:1: entryRuleCircle : ruleCircle EOF ;
    public final void entryRuleCircle() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:145:1: ( ruleCircle EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:146:1: ruleCircle EOF
            {
             before(grammarAccess.getCircleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCircle_in_entryRuleCircle241);
            ruleCircle();

            state._fsp--;

             after(grammarAccess.getCircleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCircle248); 

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
    // $ANTLR end "entryRuleCircle"


    // $ANTLR start "ruleCircle"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:153:1: ruleCircle : ( ( rule__Circle__Group__0 ) ) ;
    public final void ruleCircle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:157:2: ( ( ( rule__Circle__Group__0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:158:1: ( ( rule__Circle__Group__0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:158:1: ( ( rule__Circle__Group__0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:159:1: ( rule__Circle__Group__0 )
            {
             before(grammarAccess.getCircleAccess().getGroup()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:160:1: ( rule__Circle__Group__0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:160:2: rule__Circle__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__0_in_ruleCircle274);
            rule__Circle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getGroup()); 

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
    // $ANTLR end "ruleCircle"


    // $ANTLR start "entryRuleColor"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:172:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:173:1: ( ruleColor EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:174:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleColor_in_entryRuleColor301);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColor308); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:181:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:185:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:186:1: ( ( rule__Color__Group__0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:186:1: ( ( rule__Color__Group__0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:187:1: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:188:1: ( rule__Color__Group__0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:188:2: rule__Color__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__0_in_ruleColor334);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleEDouble"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:200:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:201:1: ( ruleEDouble EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:202:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble361);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble368); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:209:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:213:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:214:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:214:1: ( ( rule__EDouble__Group__0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:215:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:216:1: ( rule__EDouble__Group__0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:216:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble394);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:229:1: ( ruleEString EOF )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString421);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString428); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:242:1: ( ( rule__EString__Alternatives ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:242:1: ( ( rule__EString__Alternatives ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:243:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:244:1: ( rule__EString__Alternatives )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:244:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString454);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__GraphixElement__Alternatives"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:256:1: rule__GraphixElement__Alternatives : ( ( ruleCircle ) | ( ruleColor ) );
    public final void rule__GraphixElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:260:1: ( ( ruleCircle ) | ( ruleColor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:261:1: ( ruleCircle )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:261:1: ( ruleCircle )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:262:1: ruleCircle
                    {
                     before(grammarAccess.getGraphixElementAccess().getCircleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCircle_in_rule__GraphixElement__Alternatives490);
                    ruleCircle();

                    state._fsp--;

                     after(grammarAccess.getGraphixElementAccess().getCircleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:267:6: ( ruleColor )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:267:6: ( ruleColor )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:268:1: ruleColor
                    {
                     before(grammarAccess.getGraphixElementAccess().getColorParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleColor_in_rule__GraphixElement__Alternatives507);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getGraphixElementAccess().getColorParserRuleCall_1()); 

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
    // $ANTLR end "rule__GraphixElement__Alternatives"


    // $ANTLR start "rule__Circle__Alternatives_5"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:278:1: rule__Circle__Alternatives_5 : ( ( ( rule__Circle__Group_5_0__0 ) ) | ( ( rule__Circle__Group_5_1__0 ) ) );
    public final void rule__Circle__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:282:1: ( ( ( rule__Circle__Group_5_0__0 ) ) | ( ( rule__Circle__Group_5_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:283:1: ( ( rule__Circle__Group_5_0__0 ) )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:283:1: ( ( rule__Circle__Group_5_0__0 ) )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:284:1: ( rule__Circle__Group_5_0__0 )
                    {
                     before(grammarAccess.getCircleAccess().getGroup_5_0()); 
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:285:1: ( rule__Circle__Group_5_0__0 )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:285:2: rule__Circle__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_0__0_in_rule__Circle__Alternatives_5539);
                    rule__Circle__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCircleAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:289:6: ( ( rule__Circle__Group_5_1__0 ) )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:289:6: ( ( rule__Circle__Group_5_1__0 ) )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:290:1: ( rule__Circle__Group_5_1__0 )
                    {
                     before(grammarAccess.getCircleAccess().getGroup_5_1()); 
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:291:1: ( rule__Circle__Group_5_1__0 )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:291:2: rule__Circle__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_1__0_in_rule__Circle__Alternatives_5557);
                    rule__Circle__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCircleAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Circle__Alternatives_5"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:300:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:304:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:305:1: ( 'E' )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:305:1: ( 'E' )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:306:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0591); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:313:6: ( 'e' )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:313:6: ( 'e' )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:314:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0611); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:326:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:330:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:331:1: ( RULE_STRING )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:331:1: ( RULE_STRING )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:332:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives645); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:337:6: ( RULE_ID )
                    {
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:337:6: ( RULE_ID )
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:338:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives662); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__GraphixCanvas__Group__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:350:1: rule__GraphixCanvas__Group__0 : rule__GraphixCanvas__Group__0__Impl rule__GraphixCanvas__Group__1 ;
    public final void rule__GraphixCanvas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:354:1: ( rule__GraphixCanvas__Group__0__Impl rule__GraphixCanvas__Group__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:355:2: rule__GraphixCanvas__Group__0__Impl rule__GraphixCanvas__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__0__Impl_in_rule__GraphixCanvas__Group__0692);
            rule__GraphixCanvas__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__1_in_rule__GraphixCanvas__Group__0695);
            rule__GraphixCanvas__Group__1();

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
    // $ANTLR end "rule__GraphixCanvas__Group__0"


    // $ANTLR start "rule__GraphixCanvas__Group__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:362:1: rule__GraphixCanvas__Group__0__Impl : ( 'Canvas' ) ;
    public final void rule__GraphixCanvas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:366:1: ( ( 'Canvas' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:367:1: ( 'Canvas' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:367:1: ( 'Canvas' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:368:1: 'Canvas'
            {
             before(grammarAccess.getGraphixCanvasAccess().getCanvasKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__GraphixCanvas__Group__0__Impl723); 
             after(grammarAccess.getGraphixCanvasAccess().getCanvasKeyword_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__0__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:381:1: rule__GraphixCanvas__Group__1 : rule__GraphixCanvas__Group__1__Impl rule__GraphixCanvas__Group__2 ;
    public final void rule__GraphixCanvas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:385:1: ( rule__GraphixCanvas__Group__1__Impl rule__GraphixCanvas__Group__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:386:2: rule__GraphixCanvas__Group__1__Impl rule__GraphixCanvas__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__1__Impl_in_rule__GraphixCanvas__Group__1754);
            rule__GraphixCanvas__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__2_in_rule__GraphixCanvas__Group__1757);
            rule__GraphixCanvas__Group__2();

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
    // $ANTLR end "rule__GraphixCanvas__Group__1"


    // $ANTLR start "rule__GraphixCanvas__Group__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:393:1: rule__GraphixCanvas__Group__1__Impl : ( '(' ) ;
    public final void rule__GraphixCanvas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:397:1: ( ( '(' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:398:1: ( '(' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:398:1: ( '(' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:399:1: '('
            {
             before(grammarAccess.getGraphixCanvasAccess().getLeftParenthesisKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GraphixCanvas__Group__1__Impl785); 
             after(grammarAccess.getGraphixCanvasAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__1__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:412:1: rule__GraphixCanvas__Group__2 : rule__GraphixCanvas__Group__2__Impl rule__GraphixCanvas__Group__3 ;
    public final void rule__GraphixCanvas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:416:1: ( rule__GraphixCanvas__Group__2__Impl rule__GraphixCanvas__Group__3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:417:2: rule__GraphixCanvas__Group__2__Impl rule__GraphixCanvas__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__2__Impl_in_rule__GraphixCanvas__Group__2816);
            rule__GraphixCanvas__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__3_in_rule__GraphixCanvas__Group__2819);
            rule__GraphixCanvas__Group__3();

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
    // $ANTLR end "rule__GraphixCanvas__Group__2"


    // $ANTLR start "rule__GraphixCanvas__Group__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:424:1: rule__GraphixCanvas__Group__2__Impl : ( ( rule__GraphixCanvas__LowerLeftBoundsAssignment_2 ) ) ;
    public final void rule__GraphixCanvas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:428:1: ( ( ( rule__GraphixCanvas__LowerLeftBoundsAssignment_2 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:429:1: ( ( rule__GraphixCanvas__LowerLeftBoundsAssignment_2 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:429:1: ( ( rule__GraphixCanvas__LowerLeftBoundsAssignment_2 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:430:1: ( rule__GraphixCanvas__LowerLeftBoundsAssignment_2 )
            {
             before(grammarAccess.getGraphixCanvasAccess().getLowerLeftBoundsAssignment_2()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:431:1: ( rule__GraphixCanvas__LowerLeftBoundsAssignment_2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:431:2: rule__GraphixCanvas__LowerLeftBoundsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__LowerLeftBoundsAssignment_2_in_rule__GraphixCanvas__Group__2__Impl846);
            rule__GraphixCanvas__LowerLeftBoundsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphixCanvasAccess().getLowerLeftBoundsAssignment_2()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__2__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:441:1: rule__GraphixCanvas__Group__3 : rule__GraphixCanvas__Group__3__Impl rule__GraphixCanvas__Group__4 ;
    public final void rule__GraphixCanvas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:445:1: ( rule__GraphixCanvas__Group__3__Impl rule__GraphixCanvas__Group__4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:446:2: rule__GraphixCanvas__Group__3__Impl rule__GraphixCanvas__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__3__Impl_in_rule__GraphixCanvas__Group__3876);
            rule__GraphixCanvas__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__4_in_rule__GraphixCanvas__Group__3879);
            rule__GraphixCanvas__Group__4();

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
    // $ANTLR end "rule__GraphixCanvas__Group__3"


    // $ANTLR start "rule__GraphixCanvas__Group__3__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:453:1: rule__GraphixCanvas__Group__3__Impl : ( '..' ) ;
    public final void rule__GraphixCanvas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:457:1: ( ( '..' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:458:1: ( '..' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:458:1: ( '..' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:459:1: '..'
            {
             before(grammarAccess.getGraphixCanvasAccess().getFullStopFullStopKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GraphixCanvas__Group__3__Impl907); 
             after(grammarAccess.getGraphixCanvasAccess().getFullStopFullStopKeyword_3()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__3__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:472:1: rule__GraphixCanvas__Group__4 : rule__GraphixCanvas__Group__4__Impl rule__GraphixCanvas__Group__5 ;
    public final void rule__GraphixCanvas__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:476:1: ( rule__GraphixCanvas__Group__4__Impl rule__GraphixCanvas__Group__5 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:477:2: rule__GraphixCanvas__Group__4__Impl rule__GraphixCanvas__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__4__Impl_in_rule__GraphixCanvas__Group__4938);
            rule__GraphixCanvas__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__5_in_rule__GraphixCanvas__Group__4941);
            rule__GraphixCanvas__Group__5();

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
    // $ANTLR end "rule__GraphixCanvas__Group__4"


    // $ANTLR start "rule__GraphixCanvas__Group__4__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:484:1: rule__GraphixCanvas__Group__4__Impl : ( ( rule__GraphixCanvas__UpperRightBoundsAssignment_4 ) ) ;
    public final void rule__GraphixCanvas__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:488:1: ( ( ( rule__GraphixCanvas__UpperRightBoundsAssignment_4 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:489:1: ( ( rule__GraphixCanvas__UpperRightBoundsAssignment_4 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:489:1: ( ( rule__GraphixCanvas__UpperRightBoundsAssignment_4 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:490:1: ( rule__GraphixCanvas__UpperRightBoundsAssignment_4 )
            {
             before(grammarAccess.getGraphixCanvasAccess().getUpperRightBoundsAssignment_4()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:491:1: ( rule__GraphixCanvas__UpperRightBoundsAssignment_4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:491:2: rule__GraphixCanvas__UpperRightBoundsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__UpperRightBoundsAssignment_4_in_rule__GraphixCanvas__Group__4__Impl968);
            rule__GraphixCanvas__UpperRightBoundsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGraphixCanvasAccess().getUpperRightBoundsAssignment_4()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__4__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__5"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:501:1: rule__GraphixCanvas__Group__5 : rule__GraphixCanvas__Group__5__Impl rule__GraphixCanvas__Group__6 ;
    public final void rule__GraphixCanvas__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:505:1: ( rule__GraphixCanvas__Group__5__Impl rule__GraphixCanvas__Group__6 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:506:2: rule__GraphixCanvas__Group__5__Impl rule__GraphixCanvas__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__5__Impl_in_rule__GraphixCanvas__Group__5998);
            rule__GraphixCanvas__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__6_in_rule__GraphixCanvas__Group__51001);
            rule__GraphixCanvas__Group__6();

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
    // $ANTLR end "rule__GraphixCanvas__Group__5"


    // $ANTLR start "rule__GraphixCanvas__Group__5__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:513:1: rule__GraphixCanvas__Group__5__Impl : ( ')' ) ;
    public final void rule__GraphixCanvas__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:517:1: ( ( ')' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:518:1: ( ')' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:518:1: ( ')' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:519:1: ')'
            {
             before(grammarAccess.getGraphixCanvasAccess().getRightParenthesisKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__GraphixCanvas__Group__5__Impl1029); 
             after(grammarAccess.getGraphixCanvasAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__5__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__6"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:532:1: rule__GraphixCanvas__Group__6 : rule__GraphixCanvas__Group__6__Impl rule__GraphixCanvas__Group__7 ;
    public final void rule__GraphixCanvas__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:536:1: ( rule__GraphixCanvas__Group__6__Impl rule__GraphixCanvas__Group__7 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:537:2: rule__GraphixCanvas__Group__6__Impl rule__GraphixCanvas__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__6__Impl_in_rule__GraphixCanvas__Group__61060);
            rule__GraphixCanvas__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__7_in_rule__GraphixCanvas__Group__61063);
            rule__GraphixCanvas__Group__7();

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
    // $ANTLR end "rule__GraphixCanvas__Group__6"


    // $ANTLR start "rule__GraphixCanvas__Group__6__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:544:1: rule__GraphixCanvas__Group__6__Impl : ( '{' ) ;
    public final void rule__GraphixCanvas__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:548:1: ( ( '{' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:549:1: ( '{' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:549:1: ( '{' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:550:1: '{'
            {
             before(grammarAccess.getGraphixCanvasAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__GraphixCanvas__Group__6__Impl1091); 
             after(grammarAccess.getGraphixCanvasAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__6__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__7"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:563:1: rule__GraphixCanvas__Group__7 : rule__GraphixCanvas__Group__7__Impl rule__GraphixCanvas__Group__8 ;
    public final void rule__GraphixCanvas__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:567:1: ( rule__GraphixCanvas__Group__7__Impl rule__GraphixCanvas__Group__8 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:568:2: rule__GraphixCanvas__Group__7__Impl rule__GraphixCanvas__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__7__Impl_in_rule__GraphixCanvas__Group__71122);
            rule__GraphixCanvas__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__8_in_rule__GraphixCanvas__Group__71125);
            rule__GraphixCanvas__Group__8();

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
    // $ANTLR end "rule__GraphixCanvas__Group__7"


    // $ANTLR start "rule__GraphixCanvas__Group__7__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:575:1: rule__GraphixCanvas__Group__7__Impl : ( ( rule__GraphixCanvas__Group_7__0 )? ) ;
    public final void rule__GraphixCanvas__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:579:1: ( ( ( rule__GraphixCanvas__Group_7__0 )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:580:1: ( ( rule__GraphixCanvas__Group_7__0 )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:580:1: ( ( rule__GraphixCanvas__Group_7__0 )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:581:1: ( rule__GraphixCanvas__Group_7__0 )?
            {
             before(grammarAccess.getGraphixCanvasAccess().getGroup_7()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:582:1: ( rule__GraphixCanvas__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21||LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:582:2: rule__GraphixCanvas__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7__0_in_rule__GraphixCanvas__Group__7__Impl1152);
                    rule__GraphixCanvas__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphixCanvasAccess().getGroup_7()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__7__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group__8"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:592:1: rule__GraphixCanvas__Group__8 : rule__GraphixCanvas__Group__8__Impl ;
    public final void rule__GraphixCanvas__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:596:1: ( rule__GraphixCanvas__Group__8__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:597:2: rule__GraphixCanvas__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group__8__Impl_in_rule__GraphixCanvas__Group__81183);
            rule__GraphixCanvas__Group__8__Impl();

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
    // $ANTLR end "rule__GraphixCanvas__Group__8"


    // $ANTLR start "rule__GraphixCanvas__Group__8__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:603:1: rule__GraphixCanvas__Group__8__Impl : ( '}' ) ;
    public final void rule__GraphixCanvas__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:607:1: ( ( '}' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:608:1: ( '}' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:608:1: ( '}' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:609:1: '}'
            {
             before(grammarAccess.getGraphixCanvasAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__GraphixCanvas__Group__8__Impl1211); 
             after(grammarAccess.getGraphixCanvasAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group__8__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group_7__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:640:1: rule__GraphixCanvas__Group_7__0 : rule__GraphixCanvas__Group_7__0__Impl rule__GraphixCanvas__Group_7__1 ;
    public final void rule__GraphixCanvas__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:644:1: ( rule__GraphixCanvas__Group_7__0__Impl rule__GraphixCanvas__Group_7__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:645:2: rule__GraphixCanvas__Group_7__0__Impl rule__GraphixCanvas__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7__0__Impl_in_rule__GraphixCanvas__Group_7__01260);
            rule__GraphixCanvas__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7__1_in_rule__GraphixCanvas__Group_7__01263);
            rule__GraphixCanvas__Group_7__1();

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
    // $ANTLR end "rule__GraphixCanvas__Group_7__0"


    // $ANTLR start "rule__GraphixCanvas__Group_7__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:652:1: rule__GraphixCanvas__Group_7__0__Impl : ( ( rule__GraphixCanvas__ContentAssignment_7_0 ) ) ;
    public final void rule__GraphixCanvas__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:656:1: ( ( ( rule__GraphixCanvas__ContentAssignment_7_0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:657:1: ( ( rule__GraphixCanvas__ContentAssignment_7_0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:657:1: ( ( rule__GraphixCanvas__ContentAssignment_7_0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:658:1: ( rule__GraphixCanvas__ContentAssignment_7_0 )
            {
             before(grammarAccess.getGraphixCanvasAccess().getContentAssignment_7_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:659:1: ( rule__GraphixCanvas__ContentAssignment_7_0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:659:2: rule__GraphixCanvas__ContentAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__ContentAssignment_7_0_in_rule__GraphixCanvas__Group_7__0__Impl1290);
            rule__GraphixCanvas__ContentAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphixCanvasAccess().getContentAssignment_7_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group_7__0__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group_7__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:669:1: rule__GraphixCanvas__Group_7__1 : rule__GraphixCanvas__Group_7__1__Impl ;
    public final void rule__GraphixCanvas__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:673:1: ( rule__GraphixCanvas__Group_7__1__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:674:2: rule__GraphixCanvas__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7__1__Impl_in_rule__GraphixCanvas__Group_7__11320);
            rule__GraphixCanvas__Group_7__1__Impl();

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
    // $ANTLR end "rule__GraphixCanvas__Group_7__1"


    // $ANTLR start "rule__GraphixCanvas__Group_7__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:680:1: rule__GraphixCanvas__Group_7__1__Impl : ( ( rule__GraphixCanvas__Group_7_1__0 )* ) ;
    public final void rule__GraphixCanvas__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:684:1: ( ( ( rule__GraphixCanvas__Group_7_1__0 )* ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:685:1: ( ( rule__GraphixCanvas__Group_7_1__0 )* )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:685:1: ( ( rule__GraphixCanvas__Group_7_1__0 )* )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:686:1: ( rule__GraphixCanvas__Group_7_1__0 )*
            {
             before(grammarAccess.getGraphixCanvasAccess().getGroup_7_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:687:1: ( rule__GraphixCanvas__Group_7_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:687:2: rule__GraphixCanvas__Group_7_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7_1__0_in_rule__GraphixCanvas__Group_7__1__Impl1347);
            	    rule__GraphixCanvas__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGraphixCanvasAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group_7__1__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group_7_1__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:701:1: rule__GraphixCanvas__Group_7_1__0 : rule__GraphixCanvas__Group_7_1__0__Impl rule__GraphixCanvas__Group_7_1__1 ;
    public final void rule__GraphixCanvas__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:705:1: ( rule__GraphixCanvas__Group_7_1__0__Impl rule__GraphixCanvas__Group_7_1__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:706:2: rule__GraphixCanvas__Group_7_1__0__Impl rule__GraphixCanvas__Group_7_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7_1__0__Impl_in_rule__GraphixCanvas__Group_7_1__01382);
            rule__GraphixCanvas__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7_1__1_in_rule__GraphixCanvas__Group_7_1__01385);
            rule__GraphixCanvas__Group_7_1__1();

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
    // $ANTLR end "rule__GraphixCanvas__Group_7_1__0"


    // $ANTLR start "rule__GraphixCanvas__Group_7_1__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:713:1: rule__GraphixCanvas__Group_7_1__0__Impl : ( ';' ) ;
    public final void rule__GraphixCanvas__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:717:1: ( ( ';' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:718:1: ( ';' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:718:1: ( ';' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:719:1: ';'
            {
             before(grammarAccess.getGraphixCanvasAccess().getSemicolonKeyword_7_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__GraphixCanvas__Group_7_1__0__Impl1413); 
             after(grammarAccess.getGraphixCanvasAccess().getSemicolonKeyword_7_1_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group_7_1__0__Impl"


    // $ANTLR start "rule__GraphixCanvas__Group_7_1__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:732:1: rule__GraphixCanvas__Group_7_1__1 : rule__GraphixCanvas__Group_7_1__1__Impl ;
    public final void rule__GraphixCanvas__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:736:1: ( rule__GraphixCanvas__Group_7_1__1__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:737:2: rule__GraphixCanvas__Group_7_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__Group_7_1__1__Impl_in_rule__GraphixCanvas__Group_7_1__11444);
            rule__GraphixCanvas__Group_7_1__1__Impl();

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
    // $ANTLR end "rule__GraphixCanvas__Group_7_1__1"


    // $ANTLR start "rule__GraphixCanvas__Group_7_1__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:743:1: rule__GraphixCanvas__Group_7_1__1__Impl : ( ( rule__GraphixCanvas__ContentAssignment_7_1_1 ) ) ;
    public final void rule__GraphixCanvas__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:747:1: ( ( ( rule__GraphixCanvas__ContentAssignment_7_1_1 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:748:1: ( ( rule__GraphixCanvas__ContentAssignment_7_1_1 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:748:1: ( ( rule__GraphixCanvas__ContentAssignment_7_1_1 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:749:1: ( rule__GraphixCanvas__ContentAssignment_7_1_1 )
            {
             before(grammarAccess.getGraphixCanvasAccess().getContentAssignment_7_1_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:750:1: ( rule__GraphixCanvas__ContentAssignment_7_1_1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:750:2: rule__GraphixCanvas__ContentAssignment_7_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GraphixCanvas__ContentAssignment_7_1_1_in_rule__GraphixCanvas__Group_7_1__1__Impl1471);
            rule__GraphixCanvas__ContentAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphixCanvasAccess().getContentAssignment_7_1_1()); 

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
    // $ANTLR end "rule__GraphixCanvas__Group_7_1__1__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:764:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:768:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:769:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__01505);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__1_in_rule__Point__Group__01508);
            rule__Point__Group__1();

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
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:776:1: rule__Point__Group__0__Impl : ( () ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:780:1: ( ( () ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:781:1: ( () )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:781:1: ( () )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:782:1: ()
            {
             before(grammarAccess.getPointAccess().getPointAction_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:783:1: ()
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:785:1: 
            {
            }

             after(grammarAccess.getPointAccess().getPointAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:795:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:799:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:800:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__11566);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__2_in_rule__Point__Group__11569);
            rule__Point__Group__2();

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
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:807:1: rule__Point__Group__1__Impl : ( ( '(' )? ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:811:1: ( ( ( '(' )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:812:1: ( ( '(' )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:812:1: ( ( '(' )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:813:1: ( '(' )?
            {
             before(grammarAccess.getPointAccess().getLeftParenthesisKeyword_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:814:1: ( '(' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:815:2: '('
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Point__Group__1__Impl1598); 

                    }
                    break;

            }

             after(grammarAccess.getPointAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:826:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:830:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:831:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__2__Impl_in_rule__Point__Group__21631);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__3_in_rule__Point__Group__21634);
            rule__Point__Group__3();

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
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:838:1: rule__Point__Group__2__Impl : ( ( rule__Point__XAssignment_2 ) ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:842:1: ( ( ( rule__Point__XAssignment_2 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:843:1: ( ( rule__Point__XAssignment_2 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:843:1: ( ( rule__Point__XAssignment_2 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:844:1: ( rule__Point__XAssignment_2 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_2()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:845:1: ( rule__Point__XAssignment_2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:845:2: rule__Point__XAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__XAssignment_2_in_rule__Point__Group__2__Impl1661);
            rule__Point__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_2()); 

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
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:855:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:859:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:860:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__3__Impl_in_rule__Point__Group__31691);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__4_in_rule__Point__Group__31694);
            rule__Point__Group__4();

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
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:867:1: rule__Point__Group__3__Impl : ( '|' ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:871:1: ( ( '|' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:872:1: ( '|' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:872:1: ( '|' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:873:1: '|'
            {
             before(grammarAccess.getPointAccess().getVerticalLineKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Point__Group__3__Impl1722); 
             after(grammarAccess.getPointAccess().getVerticalLineKeyword_3()); 

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
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:886:1: rule__Point__Group__4 : rule__Point__Group__4__Impl rule__Point__Group__5 ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:890:1: ( rule__Point__Group__4__Impl rule__Point__Group__5 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:891:2: rule__Point__Group__4__Impl rule__Point__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__4__Impl_in_rule__Point__Group__41753);
            rule__Point__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__5_in_rule__Point__Group__41756);
            rule__Point__Group__5();

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
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:898:1: rule__Point__Group__4__Impl : ( ( rule__Point__YAssignment_4 ) ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:902:1: ( ( ( rule__Point__YAssignment_4 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:903:1: ( ( rule__Point__YAssignment_4 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:903:1: ( ( rule__Point__YAssignment_4 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:904:1: ( rule__Point__YAssignment_4 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_4()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:905:1: ( rule__Point__YAssignment_4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:905:2: rule__Point__YAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__YAssignment_4_in_rule__Point__Group__4__Impl1783);
            rule__Point__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_4()); 

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
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Point__Group__5"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:915:1: rule__Point__Group__5 : rule__Point__Group__5__Impl ;
    public final void rule__Point__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:919:1: ( rule__Point__Group__5__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:920:2: rule__Point__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__5__Impl_in_rule__Point__Group__51813);
            rule__Point__Group__5__Impl();

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
    // $ANTLR end "rule__Point__Group__5"


    // $ANTLR start "rule__Point__Group__5__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:926:1: rule__Point__Group__5__Impl : ( ( ')' )? ) ;
    public final void rule__Point__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:930:1: ( ( ( ')' )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:931:1: ( ( ')' )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:931:1: ( ( ')' )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:932:1: ( ')' )?
            {
             before(grammarAccess.getPointAccess().getRightParenthesisKeyword_5()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:933:1: ( ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=15 && LA8_1<=16)||LA8_1==23) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:934:2: ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Point__Group__5__Impl1842); 

                    }
                    break;

            }

             after(grammarAccess.getPointAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Point__Group__5__Impl"


    // $ANTLR start "rule__Circle__Group__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:957:1: rule__Circle__Group__0 : rule__Circle__Group__0__Impl rule__Circle__Group__1 ;
    public final void rule__Circle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:961:1: ( rule__Circle__Group__0__Impl rule__Circle__Group__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:962:2: rule__Circle__Group__0__Impl rule__Circle__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__0__Impl_in_rule__Circle__Group__01887);
            rule__Circle__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__1_in_rule__Circle__Group__01890);
            rule__Circle__Group__1();

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
    // $ANTLR end "rule__Circle__Group__0"


    // $ANTLR start "rule__Circle__Group__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:969:1: rule__Circle__Group__0__Impl : ( 'Circle' ) ;
    public final void rule__Circle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:973:1: ( ( 'Circle' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:974:1: ( 'Circle' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:974:1: ( 'Circle' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:975:1: 'Circle'
            {
             before(grammarAccess.getCircleAccess().getCircleKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Circle__Group__0__Impl1918); 
             after(grammarAccess.getCircleAccess().getCircleKeyword_0()); 

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
    // $ANTLR end "rule__Circle__Group__0__Impl"


    // $ANTLR start "rule__Circle__Group__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:988:1: rule__Circle__Group__1 : rule__Circle__Group__1__Impl rule__Circle__Group__2 ;
    public final void rule__Circle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:992:1: ( rule__Circle__Group__1__Impl rule__Circle__Group__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:993:2: rule__Circle__Group__1__Impl rule__Circle__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__1__Impl_in_rule__Circle__Group__11949);
            rule__Circle__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__2_in_rule__Circle__Group__11952);
            rule__Circle__Group__2();

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
    // $ANTLR end "rule__Circle__Group__1"


    // $ANTLR start "rule__Circle__Group__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1000:1: rule__Circle__Group__1__Impl : ( 'at' ) ;
    public final void rule__Circle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1004:1: ( ( 'at' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1005:1: ( 'at' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1005:1: ( 'at' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1006:1: 'at'
            {
             before(grammarAccess.getCircleAccess().getAtKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Circle__Group__1__Impl1980); 
             after(grammarAccess.getCircleAccess().getAtKeyword_1()); 

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
    // $ANTLR end "rule__Circle__Group__1__Impl"


    // $ANTLR start "rule__Circle__Group__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1019:1: rule__Circle__Group__2 : rule__Circle__Group__2__Impl rule__Circle__Group__3 ;
    public final void rule__Circle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1023:1: ( rule__Circle__Group__2__Impl rule__Circle__Group__3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1024:2: rule__Circle__Group__2__Impl rule__Circle__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__2__Impl_in_rule__Circle__Group__22011);
            rule__Circle__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__3_in_rule__Circle__Group__22014);
            rule__Circle__Group__3();

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
    // $ANTLR end "rule__Circle__Group__2"


    // $ANTLR start "rule__Circle__Group__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1031:1: rule__Circle__Group__2__Impl : ( ( rule__Circle__CenterAssignment_2 ) ) ;
    public final void rule__Circle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1035:1: ( ( ( rule__Circle__CenterAssignment_2 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1036:1: ( ( rule__Circle__CenterAssignment_2 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1036:1: ( ( rule__Circle__CenterAssignment_2 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1037:1: ( rule__Circle__CenterAssignment_2 )
            {
             before(grammarAccess.getCircleAccess().getCenterAssignment_2()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1038:1: ( rule__Circle__CenterAssignment_2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1038:2: rule__Circle__CenterAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__CenterAssignment_2_in_rule__Circle__Group__2__Impl2041);
            rule__Circle__CenterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getCenterAssignment_2()); 

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
    // $ANTLR end "rule__Circle__Group__2__Impl"


    // $ANTLR start "rule__Circle__Group__3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1048:1: rule__Circle__Group__3 : rule__Circle__Group__3__Impl rule__Circle__Group__4 ;
    public final void rule__Circle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1052:1: ( rule__Circle__Group__3__Impl rule__Circle__Group__4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1053:2: rule__Circle__Group__3__Impl rule__Circle__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__3__Impl_in_rule__Circle__Group__32071);
            rule__Circle__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__4_in_rule__Circle__Group__32074);
            rule__Circle__Group__4();

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
    // $ANTLR end "rule__Circle__Group__3"


    // $ANTLR start "rule__Circle__Group__3__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1060:1: rule__Circle__Group__3__Impl : ( 'radius' ) ;
    public final void rule__Circle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1064:1: ( ( 'radius' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1065:1: ( 'radius' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1065:1: ( 'radius' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1066:1: 'radius'
            {
             before(grammarAccess.getCircleAccess().getRadiusKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Circle__Group__3__Impl2102); 
             after(grammarAccess.getCircleAccess().getRadiusKeyword_3()); 

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
    // $ANTLR end "rule__Circle__Group__3__Impl"


    // $ANTLR start "rule__Circle__Group__4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1079:1: rule__Circle__Group__4 : rule__Circle__Group__4__Impl rule__Circle__Group__5 ;
    public final void rule__Circle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1083:1: ( rule__Circle__Group__4__Impl rule__Circle__Group__5 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1084:2: rule__Circle__Group__4__Impl rule__Circle__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__4__Impl_in_rule__Circle__Group__42133);
            rule__Circle__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__5_in_rule__Circle__Group__42136);
            rule__Circle__Group__5();

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
    // $ANTLR end "rule__Circle__Group__4"


    // $ANTLR start "rule__Circle__Group__4__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1091:1: rule__Circle__Group__4__Impl : ( ( rule__Circle__RadiusAssignment_4 ) ) ;
    public final void rule__Circle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1095:1: ( ( ( rule__Circle__RadiusAssignment_4 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1096:1: ( ( rule__Circle__RadiusAssignment_4 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1096:1: ( ( rule__Circle__RadiusAssignment_4 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1097:1: ( rule__Circle__RadiusAssignment_4 )
            {
             before(grammarAccess.getCircleAccess().getRadiusAssignment_4()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1098:1: ( rule__Circle__RadiusAssignment_4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1098:2: rule__Circle__RadiusAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__RadiusAssignment_4_in_rule__Circle__Group__4__Impl2163);
            rule__Circle__RadiusAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getRadiusAssignment_4()); 

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
    // $ANTLR end "rule__Circle__Group__4__Impl"


    // $ANTLR start "rule__Circle__Group__5"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1108:1: rule__Circle__Group__5 : rule__Circle__Group__5__Impl ;
    public final void rule__Circle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1112:1: ( rule__Circle__Group__5__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1113:2: rule__Circle__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group__5__Impl_in_rule__Circle__Group__52193);
            rule__Circle__Group__5__Impl();

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
    // $ANTLR end "rule__Circle__Group__5"


    // $ANTLR start "rule__Circle__Group__5__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1119:1: rule__Circle__Group__5__Impl : ( ( rule__Circle__Alternatives_5 )* ) ;
    public final void rule__Circle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1123:1: ( ( ( rule__Circle__Alternatives_5 )* ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1124:1: ( ( rule__Circle__Alternatives_5 )* )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1124:1: ( ( rule__Circle__Alternatives_5 )* )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1125:1: ( rule__Circle__Alternatives_5 )*
            {
             before(grammarAccess.getCircleAccess().getAlternatives_5()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1126:1: ( rule__Circle__Alternatives_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1126:2: rule__Circle__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Circle__Alternatives_5_in_rule__Circle__Group__5__Impl2220);
            	    rule__Circle__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCircleAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__Circle__Group__5__Impl"


    // $ANTLR start "rule__Circle__Group_5_0__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1148:1: rule__Circle__Group_5_0__0 : rule__Circle__Group_5_0__0__Impl rule__Circle__Group_5_0__1 ;
    public final void rule__Circle__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1152:1: ( rule__Circle__Group_5_0__0__Impl rule__Circle__Group_5_0__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1153:2: rule__Circle__Group_5_0__0__Impl rule__Circle__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_0__0__Impl_in_rule__Circle__Group_5_0__02263);
            rule__Circle__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_0__1_in_rule__Circle__Group_5_0__02266);
            rule__Circle__Group_5_0__1();

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
    // $ANTLR end "rule__Circle__Group_5_0__0"


    // $ANTLR start "rule__Circle__Group_5_0__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1160:1: rule__Circle__Group_5_0__0__Impl : ( 'line' ) ;
    public final void rule__Circle__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1164:1: ( ( 'line' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1165:1: ( 'line' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1165:1: ( 'line' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1166:1: 'line'
            {
             before(grammarAccess.getCircleAccess().getLineKeyword_5_0_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Circle__Group_5_0__0__Impl2294); 
             after(grammarAccess.getCircleAccess().getLineKeyword_5_0_0()); 

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
    // $ANTLR end "rule__Circle__Group_5_0__0__Impl"


    // $ANTLR start "rule__Circle__Group_5_0__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1179:1: rule__Circle__Group_5_0__1 : rule__Circle__Group_5_0__1__Impl ;
    public final void rule__Circle__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1183:1: ( rule__Circle__Group_5_0__1__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1184:2: rule__Circle__Group_5_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_0__1__Impl_in_rule__Circle__Group_5_0__12325);
            rule__Circle__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__Circle__Group_5_0__1"


    // $ANTLR start "rule__Circle__Group_5_0__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1190:1: rule__Circle__Group_5_0__1__Impl : ( ( rule__Circle__LineColorAssignment_5_0_1 ) ) ;
    public final void rule__Circle__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1194:1: ( ( ( rule__Circle__LineColorAssignment_5_0_1 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1195:1: ( ( rule__Circle__LineColorAssignment_5_0_1 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1195:1: ( ( rule__Circle__LineColorAssignment_5_0_1 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1196:1: ( rule__Circle__LineColorAssignment_5_0_1 )
            {
             before(grammarAccess.getCircleAccess().getLineColorAssignment_5_0_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1197:1: ( rule__Circle__LineColorAssignment_5_0_1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1197:2: rule__Circle__LineColorAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__LineColorAssignment_5_0_1_in_rule__Circle__Group_5_0__1__Impl2352);
            rule__Circle__LineColorAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getLineColorAssignment_5_0_1()); 

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
    // $ANTLR end "rule__Circle__Group_5_0__1__Impl"


    // $ANTLR start "rule__Circle__Group_5_1__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1211:1: rule__Circle__Group_5_1__0 : rule__Circle__Group_5_1__0__Impl rule__Circle__Group_5_1__1 ;
    public final void rule__Circle__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1215:1: ( rule__Circle__Group_5_1__0__Impl rule__Circle__Group_5_1__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1216:2: rule__Circle__Group_5_1__0__Impl rule__Circle__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_1__0__Impl_in_rule__Circle__Group_5_1__02386);
            rule__Circle__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_1__1_in_rule__Circle__Group_5_1__02389);
            rule__Circle__Group_5_1__1();

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
    // $ANTLR end "rule__Circle__Group_5_1__0"


    // $ANTLR start "rule__Circle__Group_5_1__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1223:1: rule__Circle__Group_5_1__0__Impl : ( 'fill' ) ;
    public final void rule__Circle__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1227:1: ( ( 'fill' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1228:1: ( 'fill' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1228:1: ( 'fill' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1229:1: 'fill'
            {
             before(grammarAccess.getCircleAccess().getFillKeyword_5_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Circle__Group_5_1__0__Impl2417); 
             after(grammarAccess.getCircleAccess().getFillKeyword_5_1_0()); 

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
    // $ANTLR end "rule__Circle__Group_5_1__0__Impl"


    // $ANTLR start "rule__Circle__Group_5_1__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1242:1: rule__Circle__Group_5_1__1 : rule__Circle__Group_5_1__1__Impl ;
    public final void rule__Circle__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1246:1: ( rule__Circle__Group_5_1__1__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1247:2: rule__Circle__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__Group_5_1__1__Impl_in_rule__Circle__Group_5_1__12448);
            rule__Circle__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Circle__Group_5_1__1"


    // $ANTLR start "rule__Circle__Group_5_1__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1253:1: rule__Circle__Group_5_1__1__Impl : ( ( rule__Circle__FillColorAssignment_5_1_1 ) ) ;
    public final void rule__Circle__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1257:1: ( ( ( rule__Circle__FillColorAssignment_5_1_1 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1258:1: ( ( rule__Circle__FillColorAssignment_5_1_1 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1258:1: ( ( rule__Circle__FillColorAssignment_5_1_1 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1259:1: ( rule__Circle__FillColorAssignment_5_1_1 )
            {
             before(grammarAccess.getCircleAccess().getFillColorAssignment_5_1_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1260:1: ( rule__Circle__FillColorAssignment_5_1_1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1260:2: rule__Circle__FillColorAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Circle__FillColorAssignment_5_1_1_in_rule__Circle__Group_5_1__1__Impl2475);
            rule__Circle__FillColorAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getFillColorAssignment_5_1_1()); 

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
    // $ANTLR end "rule__Circle__Group_5_1__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1274:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1278:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1279:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__02509);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__1_in_rule__Color__Group__02512);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1286:1: rule__Color__Group__0__Impl : ( () ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1290:1: ( ( () ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1291:1: ( () )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1291:1: ( () )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1292:1: ()
            {
             before(grammarAccess.getColorAccess().getColorAction_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1293:1: ()
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1295:1: 
            {
            }

             after(grammarAccess.getColorAccess().getColorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1305:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1309:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1310:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__12570);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__2_in_rule__Color__Group__12573);
            rule__Color__Group__2();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1317:1: rule__Color__Group__1__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1321:1: ( ( 'Color' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1322:1: ( 'Color' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1322:1: ( 'Color' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1323:1: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Color__Group__1__Impl2601); 
             after(grammarAccess.getColorAccess().getColorKeyword_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1336:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1340:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1341:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__22632);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__3_in_rule__Color__Group__22635);
            rule__Color__Group__3();

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1348:1: rule__Color__Group__2__Impl : ( ( rule__Color__NameAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1352:1: ( ( ( rule__Color__NameAssignment_2 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1353:1: ( ( rule__Color__NameAssignment_2 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1353:1: ( ( rule__Color__NameAssignment_2 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1354:1: ( rule__Color__NameAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_2()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1355:1: ( rule__Color__NameAssignment_2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1355:2: rule__Color__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__NameAssignment_2_in_rule__Color__Group__2__Impl2662);
            rule__Color__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1365:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1369:1: ( rule__Color__Group__3__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1370:2: rule__Color__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__32692);
            rule__Color__Group__3__Impl();

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
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1376:1: rule__Color__Group__3__Impl : ( ( rule__Color__Group_3__0 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1380:1: ( ( ( rule__Color__Group_3__0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1381:1: ( ( rule__Color__Group_3__0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1381:1: ( ( rule__Color__Group_3__0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1382:1: ( rule__Color__Group_3__0 )
            {
             before(grammarAccess.getColorAccess().getGroup_3()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1383:1: ( rule__Color__Group_3__0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1383:2: rule__Color__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__0_in_rule__Color__Group__3__Impl2719);
            rule__Color__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group_3__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1401:1: rule__Color__Group_3__0 : rule__Color__Group_3__0__Impl rule__Color__Group_3__1 ;
    public final void rule__Color__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1405:1: ( rule__Color__Group_3__0__Impl rule__Color__Group_3__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1406:2: rule__Color__Group_3__0__Impl rule__Color__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__0__Impl_in_rule__Color__Group_3__02757);
            rule__Color__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__1_in_rule__Color__Group_3__02760);
            rule__Color__Group_3__1();

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
    // $ANTLR end "rule__Color__Group_3__0"


    // $ANTLR start "rule__Color__Group_3__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1413:1: rule__Color__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Color__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1417:1: ( ( '(' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1418:1: ( '(' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1418:1: ( '(' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1419:1: '('
            {
             before(grammarAccess.getColorAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Color__Group_3__0__Impl2788); 
             after(grammarAccess.getColorAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Color__Group_3__0__Impl"


    // $ANTLR start "rule__Color__Group_3__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1432:1: rule__Color__Group_3__1 : rule__Color__Group_3__1__Impl rule__Color__Group_3__2 ;
    public final void rule__Color__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1436:1: ( rule__Color__Group_3__1__Impl rule__Color__Group_3__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1437:2: rule__Color__Group_3__1__Impl rule__Color__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__1__Impl_in_rule__Color__Group_3__12819);
            rule__Color__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__2_in_rule__Color__Group_3__12822);
            rule__Color__Group_3__2();

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
    // $ANTLR end "rule__Color__Group_3__1"


    // $ANTLR start "rule__Color__Group_3__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1444:1: rule__Color__Group_3__1__Impl : ( ( rule__Color__RedAssignment_3_1 ) ) ;
    public final void rule__Color__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1448:1: ( ( ( rule__Color__RedAssignment_3_1 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1449:1: ( ( rule__Color__RedAssignment_3_1 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1449:1: ( ( rule__Color__RedAssignment_3_1 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1450:1: ( rule__Color__RedAssignment_3_1 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1451:1: ( rule__Color__RedAssignment_3_1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1451:2: rule__Color__RedAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__RedAssignment_3_1_in_rule__Color__Group_3__1__Impl2849);
            rule__Color__RedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_3_1()); 

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
    // $ANTLR end "rule__Color__Group_3__1__Impl"


    // $ANTLR start "rule__Color__Group_3__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1461:1: rule__Color__Group_3__2 : rule__Color__Group_3__2__Impl rule__Color__Group_3__3 ;
    public final void rule__Color__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1465:1: ( rule__Color__Group_3__2__Impl rule__Color__Group_3__3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1466:2: rule__Color__Group_3__2__Impl rule__Color__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__2__Impl_in_rule__Color__Group_3__22879);
            rule__Color__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__3_in_rule__Color__Group_3__22882);
            rule__Color__Group_3__3();

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
    // $ANTLR end "rule__Color__Group_3__2"


    // $ANTLR start "rule__Color__Group_3__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1473:1: rule__Color__Group_3__2__Impl : ( ',' ) ;
    public final void rule__Color__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1477:1: ( ( ',' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1478:1: ( ',' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1478:1: ( ',' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1479:1: ','
            {
             before(grammarAccess.getColorAccess().getCommaKeyword_3_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Color__Group_3__2__Impl2910); 
             after(grammarAccess.getColorAccess().getCommaKeyword_3_2()); 

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
    // $ANTLR end "rule__Color__Group_3__2__Impl"


    // $ANTLR start "rule__Color__Group_3__3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1492:1: rule__Color__Group_3__3 : rule__Color__Group_3__3__Impl rule__Color__Group_3__4 ;
    public final void rule__Color__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1496:1: ( rule__Color__Group_3__3__Impl rule__Color__Group_3__4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1497:2: rule__Color__Group_3__3__Impl rule__Color__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__3__Impl_in_rule__Color__Group_3__32941);
            rule__Color__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__4_in_rule__Color__Group_3__32944);
            rule__Color__Group_3__4();

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
    // $ANTLR end "rule__Color__Group_3__3"


    // $ANTLR start "rule__Color__Group_3__3__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1504:1: rule__Color__Group_3__3__Impl : ( ( rule__Color__GreenAssignment_3_3 ) ) ;
    public final void rule__Color__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1508:1: ( ( ( rule__Color__GreenAssignment_3_3 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1509:1: ( ( rule__Color__GreenAssignment_3_3 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1509:1: ( ( rule__Color__GreenAssignment_3_3 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1510:1: ( rule__Color__GreenAssignment_3_3 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_3_3()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1511:1: ( rule__Color__GreenAssignment_3_3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1511:2: rule__Color__GreenAssignment_3_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__GreenAssignment_3_3_in_rule__Color__Group_3__3__Impl2971);
            rule__Color__GreenAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_3_3()); 

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
    // $ANTLR end "rule__Color__Group_3__3__Impl"


    // $ANTLR start "rule__Color__Group_3__4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1521:1: rule__Color__Group_3__4 : rule__Color__Group_3__4__Impl rule__Color__Group_3__5 ;
    public final void rule__Color__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1525:1: ( rule__Color__Group_3__4__Impl rule__Color__Group_3__5 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1526:2: rule__Color__Group_3__4__Impl rule__Color__Group_3__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__4__Impl_in_rule__Color__Group_3__43001);
            rule__Color__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__5_in_rule__Color__Group_3__43004);
            rule__Color__Group_3__5();

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
    // $ANTLR end "rule__Color__Group_3__4"


    // $ANTLR start "rule__Color__Group_3__4__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1533:1: rule__Color__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Color__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1537:1: ( ( ',' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1538:1: ( ',' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1538:1: ( ',' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1539:1: ','
            {
             before(grammarAccess.getColorAccess().getCommaKeyword_3_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Color__Group_3__4__Impl3032); 
             after(grammarAccess.getColorAccess().getCommaKeyword_3_4()); 

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
    // $ANTLR end "rule__Color__Group_3__4__Impl"


    // $ANTLR start "rule__Color__Group_3__5"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1552:1: rule__Color__Group_3__5 : rule__Color__Group_3__5__Impl rule__Color__Group_3__6 ;
    public final void rule__Color__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1556:1: ( rule__Color__Group_3__5__Impl rule__Color__Group_3__6 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1557:2: rule__Color__Group_3__5__Impl rule__Color__Group_3__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__5__Impl_in_rule__Color__Group_3__53063);
            rule__Color__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__6_in_rule__Color__Group_3__53066);
            rule__Color__Group_3__6();

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
    // $ANTLR end "rule__Color__Group_3__5"


    // $ANTLR start "rule__Color__Group_3__5__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1564:1: rule__Color__Group_3__5__Impl : ( ( rule__Color__BlueAssignment_3_5 ) ) ;
    public final void rule__Color__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1568:1: ( ( ( rule__Color__BlueAssignment_3_5 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1569:1: ( ( rule__Color__BlueAssignment_3_5 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1569:1: ( ( rule__Color__BlueAssignment_3_5 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1570:1: ( rule__Color__BlueAssignment_3_5 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_3_5()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1571:1: ( rule__Color__BlueAssignment_3_5 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1571:2: rule__Color__BlueAssignment_3_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__BlueAssignment_3_5_in_rule__Color__Group_3__5__Impl3093);
            rule__Color__BlueAssignment_3_5();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_3_5()); 

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
    // $ANTLR end "rule__Color__Group_3__5__Impl"


    // $ANTLR start "rule__Color__Group_3__6"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1581:1: rule__Color__Group_3__6 : rule__Color__Group_3__6__Impl rule__Color__Group_3__7 ;
    public final void rule__Color__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1585:1: ( rule__Color__Group_3__6__Impl rule__Color__Group_3__7 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1586:2: rule__Color__Group_3__6__Impl rule__Color__Group_3__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__6__Impl_in_rule__Color__Group_3__63123);
            rule__Color__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__7_in_rule__Color__Group_3__63126);
            rule__Color__Group_3__7();

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
    // $ANTLR end "rule__Color__Group_3__6"


    // $ANTLR start "rule__Color__Group_3__6__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1593:1: rule__Color__Group_3__6__Impl : ( ( rule__Color__Group_3_6__0 )? ) ;
    public final void rule__Color__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1597:1: ( ( ( rule__Color__Group_3_6__0 )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1598:1: ( ( rule__Color__Group_3_6__0 )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1598:1: ( ( rule__Color__Group_3_6__0 )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1599:1: ( rule__Color__Group_3_6__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_3_6()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1600:1: ( rule__Color__Group_3_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1600:2: rule__Color__Group_3_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3_6__0_in_rule__Color__Group_3__6__Impl3153);
                    rule__Color__Group_3_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_3_6()); 

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
    // $ANTLR end "rule__Color__Group_3__6__Impl"


    // $ANTLR start "rule__Color__Group_3__7"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1610:1: rule__Color__Group_3__7 : rule__Color__Group_3__7__Impl ;
    public final void rule__Color__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1614:1: ( rule__Color__Group_3__7__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1615:2: rule__Color__Group_3__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3__7__Impl_in_rule__Color__Group_3__73184);
            rule__Color__Group_3__7__Impl();

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
    // $ANTLR end "rule__Color__Group_3__7"


    // $ANTLR start "rule__Color__Group_3__7__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1621:1: rule__Color__Group_3__7__Impl : ( ')' ) ;
    public final void rule__Color__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1625:1: ( ( ')' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1626:1: ( ')' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1626:1: ( ')' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1627:1: ')'
            {
             before(grammarAccess.getColorAccess().getRightParenthesisKeyword_3_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Color__Group_3__7__Impl3212); 
             after(grammarAccess.getColorAccess().getRightParenthesisKeyword_3_7()); 

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
    // $ANTLR end "rule__Color__Group_3__7__Impl"


    // $ANTLR start "rule__Color__Group_3_6__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1656:1: rule__Color__Group_3_6__0 : rule__Color__Group_3_6__0__Impl rule__Color__Group_3_6__1 ;
    public final void rule__Color__Group_3_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1660:1: ( rule__Color__Group_3_6__0__Impl rule__Color__Group_3_6__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1661:2: rule__Color__Group_3_6__0__Impl rule__Color__Group_3_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3_6__0__Impl_in_rule__Color__Group_3_6__03259);
            rule__Color__Group_3_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3_6__1_in_rule__Color__Group_3_6__03262);
            rule__Color__Group_3_6__1();

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
    // $ANTLR end "rule__Color__Group_3_6__0"


    // $ANTLR start "rule__Color__Group_3_6__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1668:1: rule__Color__Group_3_6__0__Impl : ( ',' ) ;
    public final void rule__Color__Group_3_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1672:1: ( ( ',' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1673:1: ( ',' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1673:1: ( ',' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1674:1: ','
            {
             before(grammarAccess.getColorAccess().getCommaKeyword_3_6_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Color__Group_3_6__0__Impl3290); 
             after(grammarAccess.getColorAccess().getCommaKeyword_3_6_0()); 

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
    // $ANTLR end "rule__Color__Group_3_6__0__Impl"


    // $ANTLR start "rule__Color__Group_3_6__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1687:1: rule__Color__Group_3_6__1 : rule__Color__Group_3_6__1__Impl ;
    public final void rule__Color__Group_3_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1691:1: ( rule__Color__Group_3_6__1__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1692:2: rule__Color__Group_3_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Group_3_6__1__Impl_in_rule__Color__Group_3_6__13321);
            rule__Color__Group_3_6__1__Impl();

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
    // $ANTLR end "rule__Color__Group_3_6__1"


    // $ANTLR start "rule__Color__Group_3_6__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1698:1: rule__Color__Group_3_6__1__Impl : ( ( rule__Color__AlphaAssignment_3_6_1 ) ) ;
    public final void rule__Color__Group_3_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1702:1: ( ( ( rule__Color__AlphaAssignment_3_6_1 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1703:1: ( ( rule__Color__AlphaAssignment_3_6_1 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1703:1: ( ( rule__Color__AlphaAssignment_3_6_1 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1704:1: ( rule__Color__AlphaAssignment_3_6_1 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_3_6_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1705:1: ( rule__Color__AlphaAssignment_3_6_1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1705:2: rule__Color__AlphaAssignment_3_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__AlphaAssignment_3_6_1_in_rule__Color__Group_3_6__1__Impl3348);
            rule__Color__AlphaAssignment_3_6_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_3_6_1()); 

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
    // $ANTLR end "rule__Color__Group_3_6__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1719:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1723:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1724:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__03382);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__03385);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1731:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1735:1: ( ( ( '-' )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1736:1: ( ( '-' )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1736:1: ( ( '-' )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1737:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1738:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1739:2: '-'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__EDouble__Group__0__Impl3414); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1750:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1754:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1755:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13447);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13450);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1762:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1766:1: ( ( ( RULE_INT )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1767:1: ( ( RULE_INT )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1767:1: ( ( RULE_INT )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1768:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1769:1: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1769:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3478); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1779:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1783:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1784:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23509);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__23512);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1791:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1795:1: ( ( '.' ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1796:1: ( '.' )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1796:1: ( '.' )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1797:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EDouble__Group__2__Impl3540); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1810:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1814:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1815:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__33571);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__33574);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1822:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1826:1: ( ( RULE_INT ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1827:1: ( RULE_INT )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1827:1: ( RULE_INT )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1828:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl3601); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1839:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1843:1: ( rule__EDouble__Group__4__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1844:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__43630);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1850:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1854:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1855:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1855:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1856:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1857:1: ( rule__EDouble__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1857:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl3657);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1877:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1881:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1882:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__03698);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__03701);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1889:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1893:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1894:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1894:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1895:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1896:1: ( rule__EDouble__Alternatives_4_0 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1896:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl3728);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1906:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1910:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1911:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__13758);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__13761);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1918:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1922:1: ( ( ( '-' )? ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1923:1: ( ( '-' )? )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1923:1: ( ( '-' )? )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1924:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1925:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1926:2: '-'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__EDouble__Group_4__1__Impl3790); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1937:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1941:1: ( rule__EDouble__Group_4__2__Impl )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1942:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__23823);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1948:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1952:1: ( ( RULE_INT ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1953:1: ( RULE_INT )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1953:1: ( RULE_INT )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1954:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl3850); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__GraphixCanvas__LowerLeftBoundsAssignment_2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1972:1: rule__GraphixCanvas__LowerLeftBoundsAssignment_2 : ( rulePoint ) ;
    public final void rule__GraphixCanvas__LowerLeftBoundsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1976:1: ( ( rulePoint ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1977:1: ( rulePoint )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1977:1: ( rulePoint )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1978:1: rulePoint
            {
             before(grammarAccess.getGraphixCanvasAccess().getLowerLeftBoundsPointParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_rule__GraphixCanvas__LowerLeftBoundsAssignment_23890);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getGraphixCanvasAccess().getLowerLeftBoundsPointParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__LowerLeftBoundsAssignment_2"


    // $ANTLR start "rule__GraphixCanvas__UpperRightBoundsAssignment_4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1987:1: rule__GraphixCanvas__UpperRightBoundsAssignment_4 : ( rulePoint ) ;
    public final void rule__GraphixCanvas__UpperRightBoundsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1991:1: ( ( rulePoint ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1992:1: ( rulePoint )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1992:1: ( rulePoint )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:1993:1: rulePoint
            {
             before(grammarAccess.getGraphixCanvasAccess().getUpperRightBoundsPointParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_rule__GraphixCanvas__UpperRightBoundsAssignment_43921);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getGraphixCanvasAccess().getUpperRightBoundsPointParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__UpperRightBoundsAssignment_4"


    // $ANTLR start "rule__GraphixCanvas__ContentAssignment_7_0"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2002:1: rule__GraphixCanvas__ContentAssignment_7_0 : ( ruleGraphixElement ) ;
    public final void rule__GraphixCanvas__ContentAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2006:1: ( ( ruleGraphixElement ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2007:1: ( ruleGraphixElement )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2007:1: ( ruleGraphixElement )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2008:1: ruleGraphixElement
            {
             before(grammarAccess.getGraphixCanvasAccess().getContentGraphixElementParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraphixElement_in_rule__GraphixCanvas__ContentAssignment_7_03952);
            ruleGraphixElement();

            state._fsp--;

             after(grammarAccess.getGraphixCanvasAccess().getContentGraphixElementParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__ContentAssignment_7_0"


    // $ANTLR start "rule__GraphixCanvas__ContentAssignment_7_1_1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2017:1: rule__GraphixCanvas__ContentAssignment_7_1_1 : ( ruleGraphixElement ) ;
    public final void rule__GraphixCanvas__ContentAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2021:1: ( ( ruleGraphixElement ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2022:1: ( ruleGraphixElement )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2022:1: ( ruleGraphixElement )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2023:1: ruleGraphixElement
            {
             before(grammarAccess.getGraphixCanvasAccess().getContentGraphixElementParserRuleCall_7_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraphixElement_in_rule__GraphixCanvas__ContentAssignment_7_1_13983);
            ruleGraphixElement();

            state._fsp--;

             after(grammarAccess.getGraphixCanvasAccess().getContentGraphixElementParserRuleCall_7_1_1_0()); 

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
    // $ANTLR end "rule__GraphixCanvas__ContentAssignment_7_1_1"


    // $ANTLR start "rule__Point__XAssignment_2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2032:1: rule__Point__XAssignment_2 : ( ruleEDouble ) ;
    public final void rule__Point__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2036:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2037:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2037:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2038:1: ruleEDouble
            {
             before(grammarAccess.getPointAccess().getXEDoubleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Point__XAssignment_24014);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPointAccess().getXEDoubleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Point__XAssignment_2"


    // $ANTLR start "rule__Point__YAssignment_4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2047:1: rule__Point__YAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Point__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2051:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2052:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2052:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2053:1: ruleEDouble
            {
             before(grammarAccess.getPointAccess().getYEDoubleParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Point__YAssignment_44045);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPointAccess().getYEDoubleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Point__YAssignment_4"


    // $ANTLR start "rule__Circle__CenterAssignment_2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2062:1: rule__Circle__CenterAssignment_2 : ( rulePoint ) ;
    public final void rule__Circle__CenterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2066:1: ( ( rulePoint ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2067:1: ( rulePoint )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2067:1: ( rulePoint )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2068:1: rulePoint
            {
             before(grammarAccess.getCircleAccess().getCenterPointParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_rule__Circle__CenterAssignment_24076);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getCenterPointParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Circle__CenterAssignment_2"


    // $ANTLR start "rule__Circle__RadiusAssignment_4"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2077:1: rule__Circle__RadiusAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Circle__RadiusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2081:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2082:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2082:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2083:1: ruleEDouble
            {
             before(grammarAccess.getCircleAccess().getRadiusEDoubleParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Circle__RadiusAssignment_44107);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getRadiusEDoubleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Circle__RadiusAssignment_4"


    // $ANTLR start "rule__Circle__LineColorAssignment_5_0_1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2092:1: rule__Circle__LineColorAssignment_5_0_1 : ( ( ruleEString ) ) ;
    public final void rule__Circle__LineColorAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2096:1: ( ( ( ruleEString ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2097:1: ( ( ruleEString ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2097:1: ( ( ruleEString ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2098:1: ( ruleEString )
            {
             before(grammarAccess.getCircleAccess().getLineColorColorCrossReference_5_0_1_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2099:1: ( ruleEString )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2100:1: ruleEString
            {
             before(grammarAccess.getCircleAccess().getLineColorColorEStringParserRuleCall_5_0_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Circle__LineColorAssignment_5_0_14142);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getLineColorColorEStringParserRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getCircleAccess().getLineColorColorCrossReference_5_0_1_0()); 

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
    // $ANTLR end "rule__Circle__LineColorAssignment_5_0_1"


    // $ANTLR start "rule__Circle__FillColorAssignment_5_1_1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2111:1: rule__Circle__FillColorAssignment_5_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Circle__FillColorAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2115:1: ( ( ( ruleEString ) ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2116:1: ( ( ruleEString ) )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2116:1: ( ( ruleEString ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2117:1: ( ruleEString )
            {
             before(grammarAccess.getCircleAccess().getFillColorColorCrossReference_5_1_1_0()); 
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2118:1: ( ruleEString )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2119:1: ruleEString
            {
             before(grammarAccess.getCircleAccess().getFillColorColorEStringParserRuleCall_5_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Circle__FillColorAssignment_5_1_14181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getFillColorColorEStringParserRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getCircleAccess().getFillColorColorCrossReference_5_1_1_0()); 

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
    // $ANTLR end "rule__Circle__FillColorAssignment_5_1_1"


    // $ANTLR start "rule__Color__NameAssignment_2"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2130:1: rule__Color__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Color__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2134:1: ( ( ruleEString ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2135:1: ( ruleEString )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2135:1: ( ruleEString )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2136:1: ruleEString
            {
             before(grammarAccess.getColorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Color__NameAssignment_24216);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColorAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Color__NameAssignment_2"


    // $ANTLR start "rule__Color__RedAssignment_3_1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2145:1: rule__Color__RedAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Color__RedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2149:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2150:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2150:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2151:1: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getRedEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Color__RedAssignment_3_14247);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedEDoubleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Color__RedAssignment_3_1"


    // $ANTLR start "rule__Color__GreenAssignment_3_3"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2160:1: rule__Color__GreenAssignment_3_3 : ( ruleEDouble ) ;
    public final void rule__Color__GreenAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2164:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2165:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2165:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2166:1: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getGreenEDoubleParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Color__GreenAssignment_3_34278);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenEDoubleParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Color__GreenAssignment_3_3"


    // $ANTLR start "rule__Color__BlueAssignment_3_5"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2175:1: rule__Color__BlueAssignment_3_5 : ( ruleEDouble ) ;
    public final void rule__Color__BlueAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2179:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2180:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2180:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2181:1: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getBlueEDoubleParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Color__BlueAssignment_3_54309);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueEDoubleParserRuleCall_3_5_0()); 

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
    // $ANTLR end "rule__Color__BlueAssignment_3_5"


    // $ANTLR start "rule__Color__AlphaAssignment_3_6_1"
    // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2190:1: rule__Color__AlphaAssignment_3_6_1 : ( ruleEDouble ) ;
    public final void rule__Color__AlphaAssignment_3_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2194:1: ( ( ruleEDouble ) )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2195:1: ( ruleEDouble )
            {
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2195:1: ( ruleEDouble )
            // ../net.winklerweb.cdoxtext.example.graphix.xtext.ui/src-gen/net/winklerweb/cdoxtext/example/ui/contentassist/antlr/internal/InternalGraphix.g:2196:1: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getAlphaEDoubleParserRuleCall_3_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Color__AlphaAssignment_3_6_14340);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaEDoubleParserRuleCall_3_6_1_0()); 

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
    // $ANTLR end "rule__Color__AlphaAssignment_3_6_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGraphixCanvas_in_entryRuleGraphixCanvas61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGraphixCanvas68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__0_in_ruleGraphixCanvas94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGraphixElement_in_entryRuleGraphixElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGraphixElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixElement__Alternatives_in_ruleGraphixElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_entryRulePoint181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePoint188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__0_in_rulePoint214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCircle_in_entryRuleCircle241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCircle248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__0_in_ruleCircle274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColor_in_entryRuleColor301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColor308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCircle_in_rule__GraphixElement__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColor_in_rule__GraphixElement__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_0__0_in_rule__Circle__Alternatives_5539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_1__0_in_rule__Circle__Alternatives_5557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__0__Impl_in_rule__GraphixCanvas__Group__0692 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__1_in_rule__GraphixCanvas__Group__0695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__GraphixCanvas__Group__0__Impl723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__1__Impl_in_rule__GraphixCanvas__Group__1754 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__2_in_rule__GraphixCanvas__Group__1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GraphixCanvas__Group__1__Impl785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__2__Impl_in_rule__GraphixCanvas__Group__2816 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__3_in_rule__GraphixCanvas__Group__2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__LowerLeftBoundsAssignment_2_in_rule__GraphixCanvas__Group__2__Impl846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__3__Impl_in_rule__GraphixCanvas__Group__3876 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__4_in_rule__GraphixCanvas__Group__3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GraphixCanvas__Group__3__Impl907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__4__Impl_in_rule__GraphixCanvas__Group__4938 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__5_in_rule__GraphixCanvas__Group__4941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__UpperRightBoundsAssignment_4_in_rule__GraphixCanvas__Group__4__Impl968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__5__Impl_in_rule__GraphixCanvas__Group__5998 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__6_in_rule__GraphixCanvas__Group__51001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__GraphixCanvas__Group__5__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__6__Impl_in_rule__GraphixCanvas__Group__61060 = new BitSet(new long[]{0x0000000004240000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__7_in_rule__GraphixCanvas__Group__61063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__GraphixCanvas__Group__6__Impl1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__7__Impl_in_rule__GraphixCanvas__Group__71122 = new BitSet(new long[]{0x0000000004240000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__8_in_rule__GraphixCanvas__Group__71125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7__0_in_rule__GraphixCanvas__Group__7__Impl1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group__8__Impl_in_rule__GraphixCanvas__Group__81183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__GraphixCanvas__Group__8__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7__0__Impl_in_rule__GraphixCanvas__Group_7__01260 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7__1_in_rule__GraphixCanvas__Group_7__01263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__ContentAssignment_7_0_in_rule__GraphixCanvas__Group_7__0__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7__1__Impl_in_rule__GraphixCanvas__Group_7__11320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7_1__0_in_rule__GraphixCanvas__Group_7__1__Impl1347 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7_1__0__Impl_in_rule__GraphixCanvas__Group_7_1__01382 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7_1__1_in_rule__GraphixCanvas__Group_7_1__01385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__GraphixCanvas__Group_7_1__0__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__Group_7_1__1__Impl_in_rule__GraphixCanvas__Group_7_1__11444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GraphixCanvas__ContentAssignment_7_1_1_in_rule__GraphixCanvas__Group_7_1__1__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__01505 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Point__Group__1_in_rule__Point__Group__01508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__11566 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Point__Group__2_in_rule__Point__Group__11569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Point__Group__1__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__2__Impl_in_rule__Point__Group__21631 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Point__Group__3_in_rule__Point__Group__21634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__XAssignment_2_in_rule__Point__Group__2__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__3__Impl_in_rule__Point__Group__31691 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Point__Group__4_in_rule__Point__Group__31694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Point__Group__3__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__4__Impl_in_rule__Point__Group__41753 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Point__Group__5_in_rule__Point__Group__41756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__YAssignment_4_in_rule__Point__Group__4__Impl1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__5__Impl_in_rule__Point__Group__51813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Point__Group__5__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__0__Impl_in_rule__Circle__Group__01887 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Circle__Group__1_in_rule__Circle__Group__01890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Circle__Group__0__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__1__Impl_in_rule__Circle__Group__11949 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Circle__Group__2_in_rule__Circle__Group__11952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Circle__Group__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__2__Impl_in_rule__Circle__Group__22011 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Circle__Group__3_in_rule__Circle__Group__22014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__CenterAssignment_2_in_rule__Circle__Group__2__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__3__Impl_in_rule__Circle__Group__32071 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Circle__Group__4_in_rule__Circle__Group__32074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Circle__Group__3__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__4__Impl_in_rule__Circle__Group__42133 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__Circle__Group__5_in_rule__Circle__Group__42136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__RadiusAssignment_4_in_rule__Circle__Group__4__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group__5__Impl_in_rule__Circle__Group__52193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Alternatives_5_in_rule__Circle__Group__5__Impl2220 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_0__0__Impl_in_rule__Circle__Group_5_0__02263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_0__1_in_rule__Circle__Group_5_0__02266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Circle__Group_5_0__0__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_0__1__Impl_in_rule__Circle__Group_5_0__12325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__LineColorAssignment_5_0_1_in_rule__Circle__Group_5_0__1__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_1__0__Impl_in_rule__Circle__Group_5_1__02386 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_1__1_in_rule__Circle__Group_5_1__02389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Circle__Group_5_1__0__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__Group_5_1__1__Impl_in_rule__Circle__Group_5_1__12448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Circle__FillColorAssignment_5_1_1_in_rule__Circle__Group_5_1__1__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__02509 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__02512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__12570 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__12573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Color__Group__1__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__22632 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Color__Group__3_in_rule__Color__Group__22635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__NameAssignment_2_in_rule__Color__Group__2__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__32692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__0_in_rule__Color__Group__3__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__0__Impl_in_rule__Color__Group_3__02757 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Color__Group_3__1_in_rule__Color__Group_3__02760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Color__Group_3__0__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__1__Impl_in_rule__Color__Group_3__12819 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Color__Group_3__2_in_rule__Color__Group_3__12822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__RedAssignment_3_1_in_rule__Color__Group_3__1__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__2__Impl_in_rule__Color__Group_3__22879 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Color__Group_3__3_in_rule__Color__Group_3__22882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Color__Group_3__2__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__3__Impl_in_rule__Color__Group_3__32941 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Color__Group_3__4_in_rule__Color__Group_3__32944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__GreenAssignment_3_3_in_rule__Color__Group_3__3__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__4__Impl_in_rule__Color__Group_3__43001 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Color__Group_3__5_in_rule__Color__Group_3__43004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Color__Group_3__4__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__5__Impl_in_rule__Color__Group_3__53063 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Color__Group_3__6_in_rule__Color__Group_3__53066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__BlueAssignment_3_5_in_rule__Color__Group_3__5__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__6__Impl_in_rule__Color__Group_3__63123 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Color__Group_3__7_in_rule__Color__Group_3__63126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3_6__0_in_rule__Color__Group_3__6__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3__7__Impl_in_rule__Color__Group_3__73184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Color__Group_3__7__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3_6__0__Impl_in_rule__Color__Group_3_6__03259 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__Color__Group_3_6__1_in_rule__Color__Group_3_6__03262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Color__Group_3_6__0__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Group_3_6__1__Impl_in_rule__Color__Group_3_6__13321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__AlphaAssignment_3_6_1_in_rule__Color__Group_3_6__1__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__03382 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__03385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EDouble__Group__0__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13447 = new BitSet(new long[]{0x0000000030004040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23509 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__23512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDouble__Group__2__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__33571 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__33574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__43630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__03698 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__03701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__13758 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__13761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EDouble__Group_4__1__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__23823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl3850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_rule__GraphixCanvas__LowerLeftBoundsAssignment_23890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_rule__GraphixCanvas__UpperRightBoundsAssignment_43921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGraphixElement_in_rule__GraphixCanvas__ContentAssignment_7_03952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGraphixElement_in_rule__GraphixCanvas__ContentAssignment_7_1_13983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Point__XAssignment_24014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Point__YAssignment_44045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_rule__Circle__CenterAssignment_24076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Circle__RadiusAssignment_44107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Circle__LineColorAssignment_5_0_14142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Circle__FillColorAssignment_5_1_14181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Color__NameAssignment_24216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Color__RedAssignment_3_14247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Color__GreenAssignment_3_34278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Color__BlueAssignment_3_54309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Color__AlphaAssignment_3_6_14340 = new BitSet(new long[]{0x0000000000000002L});
    }


}