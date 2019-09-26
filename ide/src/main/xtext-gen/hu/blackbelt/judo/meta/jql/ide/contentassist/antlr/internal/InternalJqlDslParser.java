package hu.blackbelt.judo.meta.jql.ide.contentassist.antlr.internal;

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
import hu.blackbelt.judo.meta.jql.services.JqlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJqlDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_DECIMAL", "RULE_STRING", "RULE_DATE", "RULE_TIMESTAMP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'or'", "'OR'", "'and'", "'AND'", "'=='", "'!='", "'>='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'div'", "'DIV'", "'mod'", "'MOD'", "'!'", "'not'", "'NOT'", "'CASE'", "'case'", "'AS'", "'as'", "'WHEN'", "'when'", "'ELSE'", "'else'", "'THEN'", "'then'", "'false'", "'='", "'('", "')'", "'|'", "','", "'['", "']'", "'`'", "'.'", "'@'", "'::'", "'true'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_DATE=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_TIMESTAMP=9;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJqlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJqlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJqlDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJqlDsl.g"; }


    	private JqlDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(JqlDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExpression"
    // InternalJqlDsl.g:54:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:55:1: ( ruleExpression EOF )
            // InternalJqlDsl.g:56:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalJqlDsl.g:63:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:67:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalJqlDsl.g:68:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalJqlDsl.g:68:2: ( ( rule__Expression__Alternatives ) )
            // InternalJqlDsl.g:69:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:70:3: ( rule__Expression__Alternatives )
            // InternalJqlDsl.g:70:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConcatenateExpression"
    // InternalJqlDsl.g:79:1: entryRuleConcatenateExpression : ruleConcatenateExpression EOF ;
    public final void entryRuleConcatenateExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:80:1: ( ruleConcatenateExpression EOF )
            // InternalJqlDsl.g:81:1: ruleConcatenateExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConcatenateExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConcatenateExpression"


    // $ANTLR start "ruleConcatenateExpression"
    // InternalJqlDsl.g:88:1: ruleConcatenateExpression : ( ( rule__ConcatenateExpression__Group__0 ) ) ;
    public final void ruleConcatenateExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:92:2: ( ( ( rule__ConcatenateExpression__Group__0 ) ) )
            // InternalJqlDsl.g:93:2: ( ( rule__ConcatenateExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:93:2: ( ( rule__ConcatenateExpression__Group__0 ) )
            // InternalJqlDsl.g:94:3: ( rule__ConcatenateExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:95:3: ( rule__ConcatenateExpression__Group__0 )
            // InternalJqlDsl.g:95:4: rule__ConcatenateExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConcatenateExpression"


    // $ANTLR start "entryRuleOpConcat"
    // InternalJqlDsl.g:104:1: entryRuleOpConcat : ruleOpConcat EOF ;
    public final void entryRuleOpConcat() throws RecognitionException {
        try {
            // InternalJqlDsl.g:105:1: ( ruleOpConcat EOF )
            // InternalJqlDsl.g:106:1: ruleOpConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpConcatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpConcat"


    // $ANTLR start "ruleOpConcat"
    // InternalJqlDsl.g:113:1: ruleOpConcat : ( '||' ) ;
    public final void ruleOpConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:117:2: ( ( '||' ) )
            // InternalJqlDsl.g:118:2: ( '||' )
            {
            // InternalJqlDsl.g:118:2: ( '||' )
            // InternalJqlDsl.g:119:3: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpConcatAccess().getVerticalLineVerticalLineKeyword()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpConcatAccess().getVerticalLineVerticalLineKeyword()); 
            }

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
    // $ANTLR end "ruleOpConcat"


    // $ANTLR start "entryRuleOrExpression"
    // InternalJqlDsl.g:129:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:130:1: ( ruleOrExpression EOF )
            // InternalJqlDsl.g:131:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalJqlDsl.g:138:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:142:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalJqlDsl.g:143:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:143:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalJqlDsl.g:144:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:145:3: ( rule__OrExpression__Group__0 )
            // InternalJqlDsl.g:145:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // InternalJqlDsl.g:154:1: entryRuleOpOr : ruleOpOr EOF ;
    public final void entryRuleOpOr() throws RecognitionException {
        try {
            // InternalJqlDsl.g:155:1: ( ruleOpOr EOF )
            // InternalJqlDsl.g:156:1: ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // InternalJqlDsl.g:163:1: ruleOpOr : ( ( rule__OpOr__Alternatives ) ) ;
    public final void ruleOpOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:167:2: ( ( ( rule__OpOr__Alternatives ) ) )
            // InternalJqlDsl.g:168:2: ( ( rule__OpOr__Alternatives ) )
            {
            // InternalJqlDsl.g:168:2: ( ( rule__OpOr__Alternatives ) )
            // InternalJqlDsl.g:169:3: ( rule__OpOr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpOrAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:170:3: ( rule__OpOr__Alternatives )
            // InternalJqlDsl.g:170:4: rule__OpOr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpOr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpOrAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleAndExpression"
    // InternalJqlDsl.g:179:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:180:1: ( ruleAndExpression EOF )
            // InternalJqlDsl.g:181:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalJqlDsl.g:188:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:192:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalJqlDsl.g:193:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:193:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalJqlDsl.g:194:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:195:3: ( rule__AndExpression__Group__0 )
            // InternalJqlDsl.g:195:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // InternalJqlDsl.g:204:1: entryRuleOpAnd : ruleOpAnd EOF ;
    public final void entryRuleOpAnd() throws RecognitionException {
        try {
            // InternalJqlDsl.g:205:1: ( ruleOpAnd EOF )
            // InternalJqlDsl.g:206:1: ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // InternalJqlDsl.g:213:1: ruleOpAnd : ( ( rule__OpAnd__Alternatives ) ) ;
    public final void ruleOpAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:217:2: ( ( ( rule__OpAnd__Alternatives ) ) )
            // InternalJqlDsl.g:218:2: ( ( rule__OpAnd__Alternatives ) )
            {
            // InternalJqlDsl.g:218:2: ( ( rule__OpAnd__Alternatives ) )
            // InternalJqlDsl.g:219:3: ( rule__OpAnd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAndAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:220:3: ( rule__OpAnd__Alternatives )
            // InternalJqlDsl.g:220:4: rule__OpAnd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpAnd__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpAndAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalJqlDsl.g:229:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:230:1: ( ruleEqualityExpression EOF )
            // InternalJqlDsl.g:231:1: ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalJqlDsl.g:238:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:242:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalJqlDsl.g:243:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:243:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalJqlDsl.g:244:3: ( rule__EqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:245:3: ( rule__EqualityExpression__Group__0 )
            // InternalJqlDsl.g:245:4: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // InternalJqlDsl.g:254:1: entryRuleOpEquality : ruleOpEquality EOF ;
    public final void entryRuleOpEquality() throws RecognitionException {
        try {
            // InternalJqlDsl.g:255:1: ( ruleOpEquality EOF )
            // InternalJqlDsl.g:256:1: ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // InternalJqlDsl.g:263:1: ruleOpEquality : ( ( rule__OpEquality__Alternatives ) ) ;
    public final void ruleOpEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:267:2: ( ( ( rule__OpEquality__Alternatives ) ) )
            // InternalJqlDsl.g:268:2: ( ( rule__OpEquality__Alternatives ) )
            {
            // InternalJqlDsl.g:268:2: ( ( rule__OpEquality__Alternatives ) )
            // InternalJqlDsl.g:269:3: ( rule__OpEquality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpEqualityAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:270:3: ( rule__OpEquality__Alternatives )
            // InternalJqlDsl.g:270:4: rule__OpEquality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpEquality__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpEqualityAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalJqlDsl.g:279:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:280:1: ( ruleRelationalExpression EOF )
            // InternalJqlDsl.g:281:1: ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalJqlDsl.g:288:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:292:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalJqlDsl.g:293:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:293:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalJqlDsl.g:294:3: ( rule__RelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:295:3: ( rule__RelationalExpression__Group__0 )
            // InternalJqlDsl.g:295:4: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // InternalJqlDsl.g:304:1: entryRuleOpCompare : ruleOpCompare EOF ;
    public final void entryRuleOpCompare() throws RecognitionException {
        try {
            // InternalJqlDsl.g:305:1: ( ruleOpCompare EOF )
            // InternalJqlDsl.g:306:1: ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCompareRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // InternalJqlDsl.g:313:1: ruleOpCompare : ( ( rule__OpCompare__Alternatives ) ) ;
    public final void ruleOpCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:317:2: ( ( ( rule__OpCompare__Alternatives ) ) )
            // InternalJqlDsl.g:318:2: ( ( rule__OpCompare__Alternatives ) )
            {
            // InternalJqlDsl.g:318:2: ( ( rule__OpCompare__Alternatives ) )
            // InternalJqlDsl.g:319:3: ( rule__OpCompare__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:320:3: ( rule__OpCompare__Alternatives )
            // InternalJqlDsl.g:320:4: rule__OpCompare__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpCompare__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCompareAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalJqlDsl.g:329:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:330:1: ( ruleAdditiveExpression EOF )
            // InternalJqlDsl.g:331:1: ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalJqlDsl.g:338:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:342:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalJqlDsl.g:343:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:343:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalJqlDsl.g:344:3: ( rule__AdditiveExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:345:3: ( rule__AdditiveExpression__Group__0 )
            // InternalJqlDsl.g:345:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // InternalJqlDsl.g:354:1: entryRuleOpAdd : ruleOpAdd EOF ;
    public final void entryRuleOpAdd() throws RecognitionException {
        try {
            // InternalJqlDsl.g:355:1: ( ruleOpAdd EOF )
            // InternalJqlDsl.g:356:1: ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpAdd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpAddRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // InternalJqlDsl.g:363:1: ruleOpAdd : ( ( rule__OpAdd__Alternatives ) ) ;
    public final void ruleOpAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:367:2: ( ( ( rule__OpAdd__Alternatives ) ) )
            // InternalJqlDsl.g:368:2: ( ( rule__OpAdd__Alternatives ) )
            {
            // InternalJqlDsl.g:368:2: ( ( rule__OpAdd__Alternatives ) )
            // InternalJqlDsl.g:369:3: ( rule__OpAdd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAddAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:370:3: ( rule__OpAdd__Alternatives )
            // InternalJqlDsl.g:370:4: rule__OpAdd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpAdd__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpAddAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalJqlDsl.g:379:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:380:1: ( ruleMultiplicativeExpression EOF )
            // InternalJqlDsl.g:381:1: ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalJqlDsl.g:388:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:392:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalJqlDsl.g:393:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:393:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalJqlDsl.g:394:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:395:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalJqlDsl.g:395:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // InternalJqlDsl.g:404:1: entryRuleOpMulti : ruleOpMulti EOF ;
    public final void entryRuleOpMulti() throws RecognitionException {
        try {
            // InternalJqlDsl.g:405:1: ( ruleOpMulti EOF )
            // InternalJqlDsl.g:406:1: ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpMulti();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpMultiRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // InternalJqlDsl.g:413:1: ruleOpMulti : ( ( rule__OpMulti__Alternatives ) ) ;
    public final void ruleOpMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:417:2: ( ( ( rule__OpMulti__Alternatives ) ) )
            // InternalJqlDsl.g:418:2: ( ( rule__OpMulti__Alternatives ) )
            {
            // InternalJqlDsl.g:418:2: ( ( rule__OpMulti__Alternatives ) )
            // InternalJqlDsl.g:419:3: ( rule__OpMulti__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpMultiAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:420:3: ( rule__OpMulti__Alternatives )
            // InternalJqlDsl.g:420:4: rule__OpMulti__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpMulti__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpMultiAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalJqlDsl.g:429:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // InternalJqlDsl.g:430:1: ( ruleUnaryOperation EOF )
            // InternalJqlDsl.g:431:1: ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalJqlDsl.g:438:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Alternatives ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:442:2: ( ( ( rule__UnaryOperation__Alternatives ) ) )
            // InternalJqlDsl.g:443:2: ( ( rule__UnaryOperation__Alternatives ) )
            {
            // InternalJqlDsl.g:443:2: ( ( rule__UnaryOperation__Alternatives ) )
            // InternalJqlDsl.g:444:3: ( rule__UnaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:445:3: ( rule__UnaryOperation__Alternatives )
            // InternalJqlDsl.g:445:4: rule__UnaryOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // InternalJqlDsl.g:454:1: entryRuleOpUnary : ruleOpUnary EOF ;
    public final void entryRuleOpUnary() throws RecognitionException {
        try {
            // InternalJqlDsl.g:455:1: ( ruleOpUnary EOF )
            // InternalJqlDsl.g:456:1: ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpUnary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpUnaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // InternalJqlDsl.g:463:1: ruleOpUnary : ( ( rule__OpUnary__Alternatives ) ) ;
    public final void ruleOpUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:467:2: ( ( ( rule__OpUnary__Alternatives ) ) )
            // InternalJqlDsl.g:468:2: ( ( rule__OpUnary__Alternatives ) )
            {
            // InternalJqlDsl.g:468:2: ( ( rule__OpUnary__Alternatives ) )
            // InternalJqlDsl.g:469:3: ( rule__OpUnary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpUnaryAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:470:3: ( rule__OpUnary__Alternatives )
            // InternalJqlDsl.g:470:4: rule__OpUnary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpUnary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpUnaryAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // InternalJqlDsl.g:479:1: entryRuleParenthesizedExpression : ruleParenthesizedExpression EOF ;
    public final void entryRuleParenthesizedExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:480:1: ( ruleParenthesizedExpression EOF )
            // InternalJqlDsl.g:481:1: ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // InternalJqlDsl.g:488:1: ruleParenthesizedExpression : ( ( rule__ParenthesizedExpression__Group__0 ) ) ;
    public final void ruleParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:492:2: ( ( ( rule__ParenthesizedExpression__Group__0 ) ) )
            // InternalJqlDsl.g:493:2: ( ( rule__ParenthesizedExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:493:2: ( ( rule__ParenthesizedExpression__Group__0 ) )
            // InternalJqlDsl.g:494:3: ( rule__ParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:495:3: ( rule__ParenthesizedExpression__Group__0 )
            // InternalJqlDsl.g:495:4: rule__ParenthesizedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParenthesizedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalJqlDsl.g:504:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:505:1: ( rulePrimaryExpression EOF )
            // InternalJqlDsl.g:506:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalJqlDsl.g:513:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:517:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalJqlDsl.g:518:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalJqlDsl.g:518:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalJqlDsl.g:519:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:520:3: ( rule__PrimaryExpression__Alternatives )
            // InternalJqlDsl.g:520:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLambdaExpression"
    // InternalJqlDsl.g:529:1: entryRuleLambdaExpression : ruleLambdaExpression EOF ;
    public final void entryRuleLambdaExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:530:1: ( ruleLambdaExpression EOF )
            // InternalJqlDsl.g:531:1: ruleLambdaExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLambdaExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLambdaExpression"


    // $ANTLR start "ruleLambdaExpression"
    // InternalJqlDsl.g:538:1: ruleLambdaExpression : ( ( rule__LambdaExpression__Group__0 ) ) ;
    public final void ruleLambdaExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:542:2: ( ( ( rule__LambdaExpression__Group__0 ) ) )
            // InternalJqlDsl.g:543:2: ( ( rule__LambdaExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:543:2: ( ( rule__LambdaExpression__Group__0 ) )
            // InternalJqlDsl.g:544:3: ( rule__LambdaExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:545:3: ( rule__LambdaExpression__Group__0 )
            // InternalJqlDsl.g:545:4: rule__LambdaExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleLambdaExpression"


    // $ANTLR start "entryRuleFunction"
    // InternalJqlDsl.g:554:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalJqlDsl.g:555:1: ( ruleFunction EOF )
            // InternalJqlDsl.g:556:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalJqlDsl.g:563:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:567:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalJqlDsl.g:568:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalJqlDsl.g:568:2: ( ( rule__Function__Group__0 ) )
            // InternalJqlDsl.g:569:3: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:570:3: ( rule__Function__Group__0 )
            // InternalJqlDsl.g:570:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSwitchExpression"
    // InternalJqlDsl.g:579:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:580:1: ( ruleSwitchExpression EOF )
            // InternalJqlDsl.g:581:1: ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // InternalJqlDsl.g:588:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Group__0 ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:592:2: ( ( ( rule__SwitchExpression__Group__0 ) ) )
            // InternalJqlDsl.g:593:2: ( ( rule__SwitchExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:593:2: ( ( rule__SwitchExpression__Group__0 ) )
            // InternalJqlDsl.g:594:3: ( rule__SwitchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:595:3: ( rule__SwitchExpression__Group__0 )
            // InternalJqlDsl.g:595:4: rule__SwitchExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleSwitchConditionalExpression"
    // InternalJqlDsl.g:604:1: entryRuleSwitchConditionalExpression : ruleSwitchConditionalExpression EOF ;
    public final void entryRuleSwitchConditionalExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:605:1: ( ruleSwitchConditionalExpression EOF )
            // InternalJqlDsl.g:606:1: ruleSwitchConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchConditionalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitchConditionalExpression"


    // $ANTLR start "ruleSwitchConditionalExpression"
    // InternalJqlDsl.g:613:1: ruleSwitchConditionalExpression : ( ( rule__SwitchConditionalExpression__Group__0 ) ) ;
    public final void ruleSwitchConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:617:2: ( ( ( rule__SwitchConditionalExpression__Group__0 ) ) )
            // InternalJqlDsl.g:618:2: ( ( rule__SwitchConditionalExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:618:2: ( ( rule__SwitchConditionalExpression__Group__0 ) )
            // InternalJqlDsl.g:619:3: ( rule__SwitchConditionalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:620:3: ( rule__SwitchConditionalExpression__Group__0 )
            // InternalJqlDsl.g:620:4: rule__SwitchConditionalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSwitchConditionalExpression"


    // $ANTLR start "entryRuleSwitchConditionalCase"
    // InternalJqlDsl.g:629:1: entryRuleSwitchConditionalCase : ruleSwitchConditionalCase EOF ;
    public final void entryRuleSwitchConditionalCase() throws RecognitionException {
        try {
            // InternalJqlDsl.g:630:1: ( ruleSwitchConditionalCase EOF )
            // InternalJqlDsl.g:631:1: ruleSwitchConditionalCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchConditionalCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitchConditionalCase"


    // $ANTLR start "ruleSwitchConditionalCase"
    // InternalJqlDsl.g:638:1: ruleSwitchConditionalCase : ( ( rule__SwitchConditionalCase__Group__0 ) ) ;
    public final void ruleSwitchConditionalCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:642:2: ( ( ( rule__SwitchConditionalCase__Group__0 ) ) )
            // InternalJqlDsl.g:643:2: ( ( rule__SwitchConditionalCase__Group__0 ) )
            {
            // InternalJqlDsl.g:643:2: ( ( rule__SwitchConditionalCase__Group__0 ) )
            // InternalJqlDsl.g:644:3: ( rule__SwitchConditionalCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getGroup()); 
            }
            // InternalJqlDsl.g:645:3: ( rule__SwitchConditionalCase__Group__0 )
            // InternalJqlDsl.g:645:4: rule__SwitchConditionalCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSwitchConditionalCase"


    // $ANTLR start "entryRuleSwitchEqualsExpression"
    // InternalJqlDsl.g:654:1: entryRuleSwitchEqualsExpression : ruleSwitchEqualsExpression EOF ;
    public final void entryRuleSwitchEqualsExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:655:1: ( ruleSwitchEqualsExpression EOF )
            // InternalJqlDsl.g:656:1: ruleSwitchEqualsExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchEqualsExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitchEqualsExpression"


    // $ANTLR start "ruleSwitchEqualsExpression"
    // InternalJqlDsl.g:663:1: ruleSwitchEqualsExpression : ( ( rule__SwitchEqualsExpression__Group__0 ) ) ;
    public final void ruleSwitchEqualsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:667:2: ( ( ( rule__SwitchEqualsExpression__Group__0 ) ) )
            // InternalJqlDsl.g:668:2: ( ( rule__SwitchEqualsExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:668:2: ( ( rule__SwitchEqualsExpression__Group__0 ) )
            // InternalJqlDsl.g:669:3: ( rule__SwitchEqualsExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:670:3: ( rule__SwitchEqualsExpression__Group__0 )
            // InternalJqlDsl.g:670:4: rule__SwitchEqualsExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSwitchEqualsExpression"


    // $ANTLR start "entryRuleSwitchEqualsCase"
    // InternalJqlDsl.g:679:1: entryRuleSwitchEqualsCase : ruleSwitchEqualsCase EOF ;
    public final void entryRuleSwitchEqualsCase() throws RecognitionException {
        try {
            // InternalJqlDsl.g:680:1: ( ruleSwitchEqualsCase EOF )
            // InternalJqlDsl.g:681:1: ruleSwitchEqualsCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchEqualsCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitchEqualsCase"


    // $ANTLR start "ruleSwitchEqualsCase"
    // InternalJqlDsl.g:688:1: ruleSwitchEqualsCase : ( ( rule__SwitchEqualsCase__Group__0 ) ) ;
    public final void ruleSwitchEqualsCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:692:2: ( ( ( rule__SwitchEqualsCase__Group__0 ) ) )
            // InternalJqlDsl.g:693:2: ( ( rule__SwitchEqualsCase__Group__0 ) )
            {
            // InternalJqlDsl.g:693:2: ( ( rule__SwitchEqualsCase__Group__0 ) )
            // InternalJqlDsl.g:694:3: ( rule__SwitchEqualsCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getGroup()); 
            }
            // InternalJqlDsl.g:695:3: ( rule__SwitchEqualsCase__Group__0 )
            // InternalJqlDsl.g:695:4: rule__SwitchEqualsCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSwitchEqualsCase"


    // $ANTLR start "entryRuleLiteral"
    // InternalJqlDsl.g:704:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:705:1: ( ruleLiteral EOF )
            // InternalJqlDsl.g:706:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalJqlDsl.g:713:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:717:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalJqlDsl.g:718:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalJqlDsl.g:718:2: ( ( rule__Literal__Alternatives ) )
            // InternalJqlDsl.g:719:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:720:3: ( rule__Literal__Alternatives )
            // InternalJqlDsl.g:720:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalJqlDsl.g:729:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:730:1: ( ruleBooleanLiteral EOF )
            // InternalJqlDsl.g:731:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalJqlDsl.g:738:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:742:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:743:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:743:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalJqlDsl.g:744:3: ( rule__BooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:745:3: ( rule__BooleanLiteral__Group__0 )
            // InternalJqlDsl.g:745:4: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalJqlDsl.g:754:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:755:1: ( ruleNumberLiteral EOF )
            // InternalJqlDsl.g:756:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalJqlDsl.g:763:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Alternatives ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:767:2: ( ( ( rule__NumberLiteral__Alternatives ) ) )
            // InternalJqlDsl.g:768:2: ( ( rule__NumberLiteral__Alternatives ) )
            {
            // InternalJqlDsl.g:768:2: ( ( rule__NumberLiteral__Alternatives ) )
            // InternalJqlDsl.g:769:3: ( rule__NumberLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:770:3: ( rule__NumberLiteral__Alternatives )
            // InternalJqlDsl.g:770:4: rule__NumberLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalJqlDsl.g:779:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:780:1: ( ruleStringLiteral EOF )
            // InternalJqlDsl.g:781:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalJqlDsl.g:788:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:792:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:793:2: ( ( rule__StringLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:793:2: ( ( rule__StringLiteral__Group__0 ) )
            // InternalJqlDsl.g:794:3: ( rule__StringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:795:3: ( rule__StringLiteral__Group__0 )
            // InternalJqlDsl.g:795:4: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleTemporalLiteral"
    // InternalJqlDsl.g:804:1: entryRuleTemporalLiteral : ruleTemporalLiteral EOF ;
    public final void entryRuleTemporalLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:805:1: ( ruleTemporalLiteral EOF )
            // InternalJqlDsl.g:806:1: ruleTemporalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTemporalLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemporalLiteral"


    // $ANTLR start "ruleTemporalLiteral"
    // InternalJqlDsl.g:813:1: ruleTemporalLiteral : ( ( rule__TemporalLiteral__Alternatives ) ) ;
    public final void ruleTemporalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:817:2: ( ( ( rule__TemporalLiteral__Alternatives ) ) )
            // InternalJqlDsl.g:818:2: ( ( rule__TemporalLiteral__Alternatives ) )
            {
            // InternalJqlDsl.g:818:2: ( ( rule__TemporalLiteral__Alternatives ) )
            // InternalJqlDsl.g:819:3: ( rule__TemporalLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:820:3: ( rule__TemporalLiteral__Alternatives )
            // InternalJqlDsl.g:820:4: rule__TemporalLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTemporalLiteral"


    // $ANTLR start "entryRuleMeasuredLiteral"
    // InternalJqlDsl.g:829:1: entryRuleMeasuredLiteral : ruleMeasuredLiteral EOF ;
    public final void entryRuleMeasuredLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:830:1: ( ruleMeasuredLiteral EOF )
            // InternalJqlDsl.g:831:1: ruleMeasuredLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMeasuredLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMeasuredLiteral"


    // $ANTLR start "ruleMeasuredLiteral"
    // InternalJqlDsl.g:838:1: ruleMeasuredLiteral : ( ( rule__MeasuredLiteral__Group__0 ) ) ;
    public final void ruleMeasuredLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:842:2: ( ( ( rule__MeasuredLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:843:2: ( ( rule__MeasuredLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:843:2: ( ( rule__MeasuredLiteral__Group__0 ) )
            // InternalJqlDsl.g:844:3: ( rule__MeasuredLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:845:3: ( rule__MeasuredLiteral__Group__0 )
            // InternalJqlDsl.g:845:4: rule__MeasuredLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMeasuredLiteral"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalJqlDsl.g:854:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:855:1: ( ruleEnumLiteral EOF )
            // InternalJqlDsl.g:856:1: ruleEnumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalJqlDsl.g:863:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:867:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:868:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:868:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalJqlDsl.g:869:3: ( rule__EnumLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:870:3: ( rule__EnumLiteral__Group__0 )
            // InternalJqlDsl.g:870:4: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleNavigationExpression"
    // InternalJqlDsl.g:879:1: entryRuleNavigationExpression : ruleNavigationExpression EOF ;
    public final void entryRuleNavigationExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:880:1: ( ruleNavigationExpression EOF )
            // InternalJqlDsl.g:881:1: ruleNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNavigationExpression"


    // $ANTLR start "ruleNavigationExpression"
    // InternalJqlDsl.g:888:1: ruleNavigationExpression : ( ( rule__NavigationExpression__Group__0 ) ) ;
    public final void ruleNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:892:2: ( ( ( rule__NavigationExpression__Group__0 ) ) )
            // InternalJqlDsl.g:893:2: ( ( rule__NavigationExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:893:2: ( ( rule__NavigationExpression__Group__0 ) )
            // InternalJqlDsl.g:894:3: ( rule__NavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:895:3: ( rule__NavigationExpression__Group__0 )
            // InternalJqlDsl.g:895:4: rule__NavigationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNavigationExpression"


    // $ANTLR start "entryRuleFeature"
    // InternalJqlDsl.g:904:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalJqlDsl.g:905:1: ( ruleFeature EOF )
            // InternalJqlDsl.g:906:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalJqlDsl.g:913:1: ruleFeature : ( ( rule__Feature__NameAssignment ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:917:2: ( ( ( rule__Feature__NameAssignment ) ) )
            // InternalJqlDsl.g:918:2: ( ( rule__Feature__NameAssignment ) )
            {
            // InternalJqlDsl.g:918:2: ( ( rule__Feature__NameAssignment ) )
            // InternalJqlDsl.g:919:3: ( rule__Feature__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameAssignment()); 
            }
            // InternalJqlDsl.g:920:3: ( rule__Feature__NameAssignment )
            // InternalJqlDsl.g:920:4: rule__Feature__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getNameAssignment()); 
            }

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNavigationBase"
    // InternalJqlDsl.g:929:1: entryRuleNavigationBase : ruleNavigationBase EOF ;
    public final void entryRuleNavigationBase() throws RecognitionException {
        try {
            // InternalJqlDsl.g:930:1: ( ruleNavigationBase EOF )
            // InternalJqlDsl.g:931:1: ruleNavigationBase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNavigationBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationBaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNavigationBase"


    // $ANTLR start "ruleNavigationBase"
    // InternalJqlDsl.g:938:1: ruleNavigationBase : ( ( rule__NavigationBase__Alternatives ) ) ;
    public final void ruleNavigationBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:942:2: ( ( ( rule__NavigationBase__Alternatives ) ) )
            // InternalJqlDsl.g:943:2: ( ( rule__NavigationBase__Alternatives ) )
            {
            // InternalJqlDsl.g:943:2: ( ( rule__NavigationBase__Alternatives ) )
            // InternalJqlDsl.g:944:3: ( rule__NavigationBase__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationBaseAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:945:3: ( rule__NavigationBase__Alternatives )
            // InternalJqlDsl.g:945:4: rule__NavigationBase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigationBase__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationBaseAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNavigationBase"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalJqlDsl.g:954:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalJqlDsl.g:955:1: ( ruleQualifiedName EOF )
            // InternalJqlDsl.g:956:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalJqlDsl.g:963:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:967:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalJqlDsl.g:968:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalJqlDsl.g:968:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalJqlDsl.g:969:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalJqlDsl.g:970:3: ( rule__QualifiedName__Group__0 )
            // InternalJqlDsl.g:970:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // InternalJqlDsl.g:979:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalJqlDsl.g:980:1: ( ruleValidID EOF )
            // InternalJqlDsl.g:981:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalJqlDsl.g:988:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:992:2: ( ( RULE_ID ) )
            // InternalJqlDsl.g:993:2: ( RULE_ID )
            {
            // InternalJqlDsl.g:993:2: ( RULE_ID )
            // InternalJqlDsl.g:994:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalJqlDsl.g:1003:1: rule__Expression__Alternatives : ( ( ruleConcatenateExpression ) | ( ruleSwitchExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1007:1: ( ( ruleConcatenateExpression ) | ( ruleSwitchExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_TIMESTAMP)||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=33 && LA1_0<=35)||LA1_0==46||LA1_0==48||LA1_0==54||LA1_0==58) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=36 && LA1_0<=37)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJqlDsl.g:1008:2: ( ruleConcatenateExpression )
                    {
                    // InternalJqlDsl.g:1008:2: ( ruleConcatenateExpression )
                    // InternalJqlDsl.g:1009:3: ruleConcatenateExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getConcatenateExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConcatenateExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getConcatenateExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1014:2: ( ruleSwitchExpression )
                    {
                    // InternalJqlDsl.g:1014:2: ( ruleSwitchExpression )
                    // InternalJqlDsl.g:1015:3: ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSwitchExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getSwitchExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__OpOr__Alternatives"
    // InternalJqlDsl.g:1024:1: rule__OpOr__Alternatives : ( ( 'or' ) | ( 'OR' ) );
    public final void rule__OpOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1028:1: ( ( 'or' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJqlDsl.g:1029:2: ( 'or' )
                    {
                    // InternalJqlDsl.g:1029:2: ( 'or' )
                    // InternalJqlDsl.g:1030:3: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOrKeyword_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOrKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1035:2: ( 'OR' )
                    {
                    // InternalJqlDsl.g:1035:2: ( 'OR' )
                    // InternalJqlDsl.g:1036:3: 'OR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getORKeyword_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getORKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpOr__Alternatives"


    // $ANTLR start "rule__OpAnd__Alternatives"
    // InternalJqlDsl.g:1045:1: rule__OpAnd__Alternatives : ( ( 'and' ) | ( 'AND' ) );
    public final void rule__OpAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1049:1: ( ( 'and' ) | ( 'AND' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJqlDsl.g:1050:2: ( 'and' )
                    {
                    // InternalJqlDsl.g:1050:2: ( 'and' )
                    // InternalJqlDsl.g:1051:3: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getAndKeyword_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAndAccess().getAndKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1056:2: ( 'AND' )
                    {
                    // InternalJqlDsl.g:1056:2: ( 'AND' )
                    // InternalJqlDsl.g:1057:3: 'AND'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDKeyword_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAndAccess().getANDKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpAnd__Alternatives"


    // $ANTLR start "rule__OpEquality__Alternatives"
    // InternalJqlDsl.g:1066:1: rule__OpEquality__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1070:1: ( ( '==' ) | ( '!=' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJqlDsl.g:1071:2: ( '==' )
                    {
                    // InternalJqlDsl.g:1071:2: ( '==' )
                    // InternalJqlDsl.g:1072:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1077:2: ( '!=' )
                    {
                    // InternalJqlDsl.g:1077:2: ( '!=' )
                    // InternalJqlDsl.g:1078:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpEquality__Alternatives"


    // $ANTLR start "rule__OpCompare__Alternatives"
    // InternalJqlDsl.g:1087:1: rule__OpCompare__Alternatives : ( ( '>=' ) | ( ( rule__OpCompare__Group_1__0 ) ) | ( '>' ) | ( '<' ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1091:1: ( ( '>=' ) | ( ( rule__OpCompare__Group_1__0 ) ) | ( '>' ) | ( '<' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=RULE_ID && LA5_2<=RULE_TIMESTAMP)||(LA5_2>=24 && LA5_2<=25)||(LA5_2>=33 && LA5_2<=35)||LA5_2==46||LA5_2==48||LA5_2==54||LA5_2==58) ) {
                    alt5=4;
                }
                else if ( (LA5_2==47) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJqlDsl.g:1092:2: ( '>=' )
                    {
                    // InternalJqlDsl.g:1092:2: ( '>=' )
                    // InternalJqlDsl.g:1093:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1098:2: ( ( rule__OpCompare__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1098:2: ( ( rule__OpCompare__Group_1__0 ) )
                    // InternalJqlDsl.g:1099:3: ( rule__OpCompare__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1100:3: ( rule__OpCompare__Group_1__0 )
                    // InternalJqlDsl.g:1100:4: rule__OpCompare__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpCompare__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDsl.g:1104:2: ( '>' )
                    {
                    // InternalJqlDsl.g:1104:2: ( '>' )
                    // InternalJqlDsl.g:1105:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDsl.g:1110:2: ( '<' )
                    {
                    // InternalJqlDsl.g:1110:2: ( '<' )
                    // InternalJqlDsl.g:1111:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                    }

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
    // $ANTLR end "rule__OpCompare__Alternatives"


    // $ANTLR start "rule__OpAdd__Alternatives"
    // InternalJqlDsl.g:1120:1: rule__OpAdd__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1124:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJqlDsl.g:1125:2: ( '+' )
                    {
                    // InternalJqlDsl.g:1125:2: ( '+' )
                    // InternalJqlDsl.g:1126:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1131:2: ( '-' )
                    {
                    // InternalJqlDsl.g:1131:2: ( '-' )
                    // InternalJqlDsl.g:1132:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpAdd__Alternatives"


    // $ANTLR start "rule__OpMulti__Alternatives"
    // InternalJqlDsl.g:1141:1: rule__OpMulti__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) | ( 'div' ) | ( 'DIV' ) | ( 'mod' ) | ( 'MOD' ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1145:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( 'div' ) | ( 'DIV' ) | ( 'mod' ) | ( 'MOD' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 31:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJqlDsl.g:1146:2: ( '*' )
                    {
                    // InternalJqlDsl.g:1146:2: ( '*' )
                    // InternalJqlDsl.g:1147:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1152:2: ( '/' )
                    {
                    // InternalJqlDsl.g:1152:2: ( '/' )
                    // InternalJqlDsl.g:1153:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDsl.g:1158:2: ( '%' )
                    {
                    // InternalJqlDsl.g:1158:2: ( '%' )
                    // InternalJqlDsl.g:1159:3: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getPercentSignKeyword_2()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getPercentSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDsl.g:1164:2: ( 'div' )
                    {
                    // InternalJqlDsl.g:1164:2: ( 'div' )
                    // InternalJqlDsl.g:1165:3: 'div'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDivKeyword_3()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getDivKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalJqlDsl.g:1170:2: ( 'DIV' )
                    {
                    // InternalJqlDsl.g:1170:2: ( 'DIV' )
                    // InternalJqlDsl.g:1171:3: 'DIV'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDIVKeyword_4()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getDIVKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalJqlDsl.g:1176:2: ( 'mod' )
                    {
                    // InternalJqlDsl.g:1176:2: ( 'mod' )
                    // InternalJqlDsl.g:1177:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getModKeyword_5()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getModKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalJqlDsl.g:1182:2: ( 'MOD' )
                    {
                    // InternalJqlDsl.g:1182:2: ( 'MOD' )
                    // InternalJqlDsl.g:1183:3: 'MOD'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMODKeyword_6()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getMODKeyword_6()); 
                    }

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
    // $ANTLR end "rule__OpMulti__Alternatives"


    // $ANTLR start "rule__UnaryOperation__Alternatives"
    // InternalJqlDsl.g:1192:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1196:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=24 && LA8_0<=25)||(LA8_0>=33 && LA8_0<=35)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_TIMESTAMP)||LA8_0==46||LA8_0==48||LA8_0==54||LA8_0==58) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalJqlDsl.g:1197:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1197:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalJqlDsl.g:1198:3: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1199:3: ( rule__UnaryOperation__Group_0__0 )
                    // InternalJqlDsl.g:1199:4: rule__UnaryOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1203:2: ( rulePrimaryExpression )
                    {
                    // InternalJqlDsl.g:1203:2: ( rulePrimaryExpression )
                    // InternalJqlDsl.g:1204:3: rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__UnaryOperation__Alternatives"


    // $ANTLR start "rule__OpUnary__Alternatives"
    // InternalJqlDsl.g:1213:1: rule__OpUnary__Alternatives : ( ( '!' ) | ( 'not' ) | ( 'NOT' ) | ( '-' ) | ( '+' ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1217:1: ( ( '!' ) | ( 'not' ) | ( 'NOT' ) | ( '-' ) | ( '+' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalJqlDsl.g:1218:2: ( '!' )
                    {
                    // InternalJqlDsl.g:1218:2: ( '!' )
                    // InternalJqlDsl.g:1219:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1224:2: ( 'not' )
                    {
                    // InternalJqlDsl.g:1224:2: ( 'not' )
                    // InternalJqlDsl.g:1225:3: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNotKeyword_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNotKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDsl.g:1230:2: ( 'NOT' )
                    {
                    // InternalJqlDsl.g:1230:2: ( 'NOT' )
                    // InternalJqlDsl.g:1231:3: 'NOT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTKeyword_2()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDsl.g:1236:2: ( '-' )
                    {
                    // InternalJqlDsl.g:1236:2: ( '-' )
                    // InternalJqlDsl.g:1237:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_3()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalJqlDsl.g:1242:2: ( '+' )
                    {
                    // InternalJqlDsl.g:1242:2: ( '+' )
                    // InternalJqlDsl.g:1243:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getPlusSignKeyword_4()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getPlusSignKeyword_4()); 
                    }

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
    // $ANTLR end "rule__OpUnary__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalJqlDsl.g:1252:1: rule__PrimaryExpression__Alternatives : ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1256:1: ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case RULE_STRING:
            case RULE_DATE:
            case RULE_TIMESTAMP:
            case 46:
            case 54:
            case 58:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalJqlDsl.g:1257:2: ( ruleParenthesizedExpression )
                    {
                    // InternalJqlDsl.g:1257:2: ( ruleParenthesizedExpression )
                    // InternalJqlDsl.g:1258:3: ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1263:2: ( ruleNavigationExpression )
                    {
                    // InternalJqlDsl.g:1263:2: ( ruleNavigationExpression )
                    // InternalJqlDsl.g:1264:3: ruleNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNavigationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDsl.g:1269:2: ( ruleLiteral )
                    {
                    // InternalJqlDsl.g:1269:2: ( ruleLiteral )
                    // InternalJqlDsl.g:1270:3: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Function__Alternatives_2_1"
    // InternalJqlDsl.g:1279:1: rule__Function__Alternatives_2_1 : ( ( ( rule__Function__LambdaAssignment_2_1_0 ) ) | ( ( rule__Function__Group_2_1_1__0 ) ) );
    public final void rule__Function__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1283:1: ( ( ( rule__Function__LambdaAssignment_2_1_0 ) ) | ( ( rule__Function__Group_2_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=14 && LA11_1<=33)||LA11_1==49||LA11_1==51||(LA11_1>=55 && LA11_1<=57)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==50) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_INTEGER && LA11_0<=RULE_TIMESTAMP)||(LA11_0>=24 && LA11_0<=25)||(LA11_0>=33 && LA11_0<=37)||LA11_0==46||(LA11_0>=48 && LA11_0<=49)||LA11_0==51||LA11_0==54||LA11_0==58) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJqlDsl.g:1284:2: ( ( rule__Function__LambdaAssignment_2_1_0 ) )
                    {
                    // InternalJqlDsl.g:1284:2: ( ( rule__Function__LambdaAssignment_2_1_0 ) )
                    // InternalJqlDsl.g:1285:3: ( rule__Function__LambdaAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionAccess().getLambdaAssignment_2_1_0()); 
                    }
                    // InternalJqlDsl.g:1286:3: ( rule__Function__LambdaAssignment_2_1_0 )
                    // InternalJqlDsl.g:1286:4: rule__Function__LambdaAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__LambdaAssignment_2_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionAccess().getLambdaAssignment_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1290:2: ( ( rule__Function__Group_2_1_1__0 ) )
                    {
                    // InternalJqlDsl.g:1290:2: ( ( rule__Function__Group_2_1_1__0 ) )
                    // InternalJqlDsl.g:1291:3: ( rule__Function__Group_2_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionAccess().getGroup_2_1_1()); 
                    }
                    // InternalJqlDsl.g:1292:3: ( rule__Function__Group_2_1_1__0 )
                    // InternalJqlDsl.g:1292:4: rule__Function__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_2_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionAccess().getGroup_2_1_1()); 
                    }

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
    // $ANTLR end "rule__Function__Alternatives_2_1"


    // $ANTLR start "rule__SwitchExpression__Alternatives_1"
    // InternalJqlDsl.g:1300:1: rule__SwitchExpression__Alternatives_1 : ( ( 'CASE' ) | ( 'case' ) );
    public final void rule__SwitchExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1304:1: ( ( 'CASE' ) | ( 'case' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==37) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalJqlDsl.g:1305:2: ( 'CASE' )
                    {
                    // InternalJqlDsl.g:1305:2: ( 'CASE' )
                    // InternalJqlDsl.g:1306:3: 'CASE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getCASEKeyword_1_0()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getCASEKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1311:2: ( 'case' )
                    {
                    // InternalJqlDsl.g:1311:2: ( 'case' )
                    // InternalJqlDsl.g:1312:3: 'case'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getCaseKeyword_1_1()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getCaseKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__SwitchExpression__Alternatives_1"


    // $ANTLR start "rule__SwitchExpression__BodyAlternatives_3_0"
    // InternalJqlDsl.g:1321:1: rule__SwitchExpression__BodyAlternatives_3_0 : ( ( ruleSwitchConditionalExpression ) | ( ruleSwitchEqualsExpression ) );
    public final void rule__SwitchExpression__BodyAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1325:1: ( ( ruleSwitchConditionalExpression ) | ( ruleSwitchEqualsExpression ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=38 && LA13_0<=39)) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||(LA13_0>=40 && LA13_0<=43)||LA13_0==49||LA13_0==51) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJqlDsl.g:1326:2: ( ruleSwitchConditionalExpression )
                    {
                    // InternalJqlDsl.g:1326:2: ( ruleSwitchConditionalExpression )
                    // InternalJqlDsl.g:1327:3: ruleSwitchConditionalExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getBodySwitchConditionalExpressionParserRuleCall_3_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchConditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getBodySwitchConditionalExpressionParserRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1332:2: ( ruleSwitchEqualsExpression )
                    {
                    // InternalJqlDsl.g:1332:2: ( ruleSwitchEqualsExpression )
                    // InternalJqlDsl.g:1333:3: ruleSwitchEqualsExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getBodySwitchEqualsExpressionParserRuleCall_3_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchEqualsExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getBodySwitchEqualsExpressionParserRuleCall_3_0_1()); 
                    }

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
    // $ANTLR end "rule__SwitchExpression__BodyAlternatives_3_0"


    // $ANTLR start "rule__SwitchConditionalExpression__Alternatives_1"
    // InternalJqlDsl.g:1342:1: rule__SwitchConditionalExpression__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__SwitchConditionalExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1346:1: ( ( 'AS' ) | ( 'as' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalJqlDsl.g:1347:2: ( 'AS' )
                    {
                    // InternalJqlDsl.g:1347:2: ( 'AS' )
                    // InternalJqlDsl.g:1348:3: 'AS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalExpressionAccess().getASKeyword_1_0()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalExpressionAccess().getASKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1353:2: ( 'as' )
                    {
                    // InternalJqlDsl.g:1353:2: ( 'as' )
                    // InternalJqlDsl.g:1354:3: 'as'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalExpressionAccess().getAsKeyword_1_1()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalExpressionAccess().getAsKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Alternatives_1"


    // $ANTLR start "rule__SwitchConditionalExpression__Alternatives_3_0_0"
    // InternalJqlDsl.g:1363:1: rule__SwitchConditionalExpression__Alternatives_3_0_0 : ( ( 'WHEN' ) | ( 'when' ) );
    public final void rule__SwitchConditionalExpression__Alternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1367:1: ( ( 'WHEN' ) | ( 'when' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJqlDsl.g:1368:2: ( 'WHEN' )
                    {
                    // InternalJqlDsl.g:1368:2: ( 'WHEN' )
                    // InternalJqlDsl.g:1369:3: 'WHEN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalExpressionAccess().getWHENKeyword_3_0_0_0()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalExpressionAccess().getWHENKeyword_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1374:2: ( 'when' )
                    {
                    // InternalJqlDsl.g:1374:2: ( 'when' )
                    // InternalJqlDsl.g:1375:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalExpressionAccess().getWhenKeyword_3_0_0_1()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalExpressionAccess().getWhenKeyword_3_0_0_1()); 
                    }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Alternatives_3_0_0"


    // $ANTLR start "rule__SwitchConditionalExpression__Alternatives_4_0_0"
    // InternalJqlDsl.g:1384:1: rule__SwitchConditionalExpression__Alternatives_4_0_0 : ( ( 'ELSE' ) | ( 'else' ) );
    public final void rule__SwitchConditionalExpression__Alternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1388:1: ( ( 'ELSE' ) | ( 'else' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            else if ( (LA16_0==43) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalJqlDsl.g:1389:2: ( 'ELSE' )
                    {
                    // InternalJqlDsl.g:1389:2: ( 'ELSE' )
                    // InternalJqlDsl.g:1390:3: 'ELSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalExpressionAccess().getELSEKeyword_4_0_0_0()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalExpressionAccess().getELSEKeyword_4_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1395:2: ( 'else' )
                    {
                    // InternalJqlDsl.g:1395:2: ( 'else' )
                    // InternalJqlDsl.g:1396:3: 'else'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalExpressionAccess().getElseKeyword_4_0_0_1()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalExpressionAccess().getElseKeyword_4_0_0_1()); 
                    }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Alternatives_4_0_0"


    // $ANTLR start "rule__SwitchConditionalCase__Alternatives_2"
    // InternalJqlDsl.g:1405:1: rule__SwitchConditionalCase__Alternatives_2 : ( ( 'THEN' ) | ( 'then' ) );
    public final void rule__SwitchConditionalCase__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1409:1: ( ( 'THEN' ) | ( 'then' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            else if ( (LA17_0==45) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJqlDsl.g:1410:2: ( 'THEN' )
                    {
                    // InternalJqlDsl.g:1410:2: ( 'THEN' )
                    // InternalJqlDsl.g:1411:3: 'THEN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalCaseAccess().getTHENKeyword_2_0()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalCaseAccess().getTHENKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1416:2: ( 'then' )
                    {
                    // InternalJqlDsl.g:1416:2: ( 'then' )
                    // InternalJqlDsl.g:1417:3: 'then'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchConditionalCaseAccess().getThenKeyword_2_1()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchConditionalCaseAccess().getThenKeyword_2_1()); 
                    }

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
    // $ANTLR end "rule__SwitchConditionalCase__Alternatives_2"


    // $ANTLR start "rule__SwitchEqualsExpression__Alternatives_1_0_0"
    // InternalJqlDsl.g:1426:1: rule__SwitchEqualsExpression__Alternatives_1_0_0 : ( ( 'WHEN' ) | ( 'when' ) );
    public final void rule__SwitchEqualsExpression__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1430:1: ( ( 'WHEN' ) | ( 'when' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalJqlDsl.g:1431:2: ( 'WHEN' )
                    {
                    // InternalJqlDsl.g:1431:2: ( 'WHEN' )
                    // InternalJqlDsl.g:1432:3: 'WHEN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchEqualsExpressionAccess().getWHENKeyword_1_0_0_0()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchEqualsExpressionAccess().getWHENKeyword_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1437:2: ( 'when' )
                    {
                    // InternalJqlDsl.g:1437:2: ( 'when' )
                    // InternalJqlDsl.g:1438:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchEqualsExpressionAccess().getWhenKeyword_1_0_0_1()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchEqualsExpressionAccess().getWhenKeyword_1_0_0_1()); 
                    }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Alternatives_1_0_0"


    // $ANTLR start "rule__SwitchEqualsExpression__Alternatives_2_0_0"
    // InternalJqlDsl.g:1447:1: rule__SwitchEqualsExpression__Alternatives_2_0_0 : ( ( 'ELSE' ) | ( 'else' ) );
    public final void rule__SwitchEqualsExpression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1451:1: ( ( 'ELSE' ) | ( 'else' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJqlDsl.g:1452:2: ( 'ELSE' )
                    {
                    // InternalJqlDsl.g:1452:2: ( 'ELSE' )
                    // InternalJqlDsl.g:1453:3: 'ELSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchEqualsExpressionAccess().getELSEKeyword_2_0_0_0()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchEqualsExpressionAccess().getELSEKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1458:2: ( 'else' )
                    {
                    // InternalJqlDsl.g:1458:2: ( 'else' )
                    // InternalJqlDsl.g:1459:3: 'else'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchEqualsExpressionAccess().getElseKeyword_2_0_0_1()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchEqualsExpressionAccess().getElseKeyword_2_0_0_1()); 
                    }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Alternatives_2_0_0"


    // $ANTLR start "rule__SwitchEqualsCase__Alternatives_2"
    // InternalJqlDsl.g:1468:1: rule__SwitchEqualsCase__Alternatives_2 : ( ( 'THEN' ) | ( 'then' ) );
    public final void rule__SwitchEqualsCase__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1472:1: ( ( 'THEN' ) | ( 'then' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            else if ( (LA20_0==45) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalJqlDsl.g:1473:2: ( 'THEN' )
                    {
                    // InternalJqlDsl.g:1473:2: ( 'THEN' )
                    // InternalJqlDsl.g:1474:3: 'THEN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchEqualsCaseAccess().getTHENKeyword_2_0()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchEqualsCaseAccess().getTHENKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1479:2: ( 'then' )
                    {
                    // InternalJqlDsl.g:1479:2: ( 'then' )
                    // InternalJqlDsl.g:1480:3: 'then'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchEqualsCaseAccess().getThenKeyword_2_1()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchEqualsCaseAccess().getThenKeyword_2_1()); 
                    }

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
    // $ANTLR end "rule__SwitchEqualsCase__Alternatives_2"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalJqlDsl.g:1489:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1493:1: ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 46:
            case 58:
                {
                alt21=1;
                }
                break;
            case RULE_INTEGER:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==52) ) {
                    alt21=6;
                }
                else if ( (LA21_2==EOF||(LA21_2>=14 && LA21_2<=33)||(LA21_2>=38 && LA21_2<=45)||LA21_2==49||LA21_2==51) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMAL:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==52) ) {
                    alt21=6;
                }
                else if ( (LA21_3==EOF||(LA21_3>=14 && LA21_3<=33)||(LA21_3>=38 && LA21_3<=45)||LA21_3==49||LA21_3==51) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt21=3;
                }
                break;
            case RULE_DATE:
            case RULE_TIMESTAMP:
                {
                alt21=4;
                }
                break;
            case 54:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalJqlDsl.g:1494:2: ( ruleBooleanLiteral )
                    {
                    // InternalJqlDsl.g:1494:2: ( ruleBooleanLiteral )
                    // InternalJqlDsl.g:1495:3: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1500:2: ( ruleNumberLiteral )
                    {
                    // InternalJqlDsl.g:1500:2: ( ruleNumberLiteral )
                    // InternalJqlDsl.g:1501:3: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDsl.g:1506:2: ( ruleStringLiteral )
                    {
                    // InternalJqlDsl.g:1506:2: ( ruleStringLiteral )
                    // InternalJqlDsl.g:1507:3: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDsl.g:1512:2: ( ruleTemporalLiteral )
                    {
                    // InternalJqlDsl.g:1512:2: ( ruleTemporalLiteral )
                    // InternalJqlDsl.g:1513:3: ruleTemporalLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getTemporalLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTemporalLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getTemporalLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalJqlDsl.g:1518:2: ( ruleEnumLiteral )
                    {
                    // InternalJqlDsl.g:1518:2: ( ruleEnumLiteral )
                    // InternalJqlDsl.g:1519:3: ruleEnumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getEnumLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getEnumLiteralParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalJqlDsl.g:1524:2: ( ruleMeasuredLiteral )
                    {
                    // InternalJqlDsl.g:1524:2: ( ruleMeasuredLiteral )
                    // InternalJqlDsl.g:1525:3: ruleMeasuredLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getMeasuredLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMeasuredLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getMeasuredLiteralParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__Alternatives_1"
    // InternalJqlDsl.g:1534:1: rule__BooleanLiteral__Alternatives_1 : ( ( 'false' ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1538:1: ( ( 'false' ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            else if ( (LA22_0==58) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalJqlDsl.g:1539:2: ( 'false' )
                    {
                    // InternalJqlDsl.g:1539:2: ( 'false' )
                    // InternalJqlDsl.g:1540:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1545:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    {
                    // InternalJqlDsl.g:1545:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    // InternalJqlDsl.g:1546:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_1()); 
                    }
                    // InternalJqlDsl.g:1547:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    // InternalJqlDsl.g:1547:4: rule__BooleanLiteral__IsTrueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanLiteral__IsTrueAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_1()); 
                    }

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
    // $ANTLR end "rule__BooleanLiteral__Alternatives_1"


    // $ANTLR start "rule__NumberLiteral__Alternatives"
    // InternalJqlDsl.g:1555:1: rule__NumberLiteral__Alternatives : ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) );
    public final void rule__NumberLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1559:1: ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_DECIMAL) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalJqlDsl.g:1560:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1560:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    // InternalJqlDsl.g:1561:3: ( rule__NumberLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1562:3: ( rule__NumberLiteral__Group_0__0 )
                    // InternalJqlDsl.g:1562:4: rule__NumberLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumberLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1566:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1566:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    // InternalJqlDsl.g:1567:3: ( rule__NumberLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1568:3: ( rule__NumberLiteral__Group_1__0 )
                    // InternalJqlDsl.g:1568:4: rule__NumberLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__NumberLiteral__Alternatives"


    // $ANTLR start "rule__TemporalLiteral__Alternatives"
    // InternalJqlDsl.g:1576:1: rule__TemporalLiteral__Alternatives : ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) );
    public final void rule__TemporalLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1580:1: ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DATE) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_TIMESTAMP) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalJqlDsl.g:1581:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1581:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    // InternalJqlDsl.g:1582:3: ( rule__TemporalLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1583:3: ( rule__TemporalLiteral__Group_0__0 )
                    // InternalJqlDsl.g:1583:4: rule__TemporalLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalLiteral__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1587:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1587:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    // InternalJqlDsl.g:1588:3: ( rule__TemporalLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1589:3: ( rule__TemporalLiteral__Group_1__0 )
                    // InternalJqlDsl.g:1589:4: rule__TemporalLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalLiteralAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__TemporalLiteral__Alternatives"


    // $ANTLR start "rule__NavigationBase__Alternatives"
    // InternalJqlDsl.g:1597:1: rule__NavigationBase__Alternatives : ( ( ruleValidID ) | ( ruleQualifiedName ) );
    public final void rule__NavigationBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1601:1: ( ( ruleValidID ) | ( ruleQualifiedName ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||(LA25_1>=14 && LA25_1<=33)||(LA25_1>=38 && LA25_1<=45)||LA25_1==49||LA25_1==51||(LA25_1>=55 && LA25_1<=56)) ) {
                    alt25=1;
                }
                else if ( (LA25_1==57) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalJqlDsl.g:1602:2: ( ruleValidID )
                    {
                    // InternalJqlDsl.g:1602:2: ( ruleValidID )
                    // InternalJqlDsl.g:1603:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationBaseAccess().getValidIDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationBaseAccess().getValidIDParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1608:2: ( ruleQualifiedName )
                    {
                    // InternalJqlDsl.g:1608:2: ( ruleQualifiedName )
                    // InternalJqlDsl.g:1609:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationBaseAccess().getQualifiedNameParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationBaseAccess().getQualifiedNameParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__NavigationBase__Alternatives"


    // $ANTLR start "rule__ConcatenateExpression__Group__0"
    // InternalJqlDsl.g:1618:1: rule__ConcatenateExpression__Group__0 : rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1 ;
    public final void rule__ConcatenateExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1622:1: ( rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1 )
            // InternalJqlDsl.g:1623:2: rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConcatenateExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group__0"


    // $ANTLR start "rule__ConcatenateExpression__Group__0__Impl"
    // InternalJqlDsl.g:1630:1: rule__ConcatenateExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ConcatenateExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1634:1: ( ( ruleOrExpression ) )
            // InternalJqlDsl.g:1635:1: ( ruleOrExpression )
            {
            // InternalJqlDsl.g:1635:1: ( ruleOrExpression )
            // InternalJqlDsl.g:1636:2: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getOrExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getOrExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__Group__0__Impl"


    // $ANTLR start "rule__ConcatenateExpression__Group__1"
    // InternalJqlDsl.g:1645:1: rule__ConcatenateExpression__Group__1 : rule__ConcatenateExpression__Group__1__Impl ;
    public final void rule__ConcatenateExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1649:1: ( rule__ConcatenateExpression__Group__1__Impl )
            // InternalJqlDsl.g:1650:2: rule__ConcatenateExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group__1"


    // $ANTLR start "rule__ConcatenateExpression__Group__1__Impl"
    // InternalJqlDsl.g:1656:1: rule__ConcatenateExpression__Group__1__Impl : ( ( rule__ConcatenateExpression__Group_1__0 )* ) ;
    public final void rule__ConcatenateExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1660:1: ( ( ( rule__ConcatenateExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1661:1: ( ( rule__ConcatenateExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1661:1: ( ( rule__ConcatenateExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1662:2: ( rule__ConcatenateExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1663:2: ( rule__ConcatenateExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJqlDsl.g:1663:3: rule__ConcatenateExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ConcatenateExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__Group__1__Impl"


    // $ANTLR start "rule__ConcatenateExpression__Group_1__0"
    // InternalJqlDsl.g:1672:1: rule__ConcatenateExpression__Group_1__0 : rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1 ;
    public final void rule__ConcatenateExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1676:1: ( rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1 )
            // InternalJqlDsl.g:1677:2: rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ConcatenateExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1__0"


    // $ANTLR start "rule__ConcatenateExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:1684:1: rule__ConcatenateExpression__Group_1__0__Impl : ( ( rule__ConcatenateExpression__Group_1_0__0 ) ) ;
    public final void rule__ConcatenateExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1688:1: ( ( ( rule__ConcatenateExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1689:1: ( ( rule__ConcatenateExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1689:1: ( ( rule__ConcatenateExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1690:2: ( rule__ConcatenateExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1691:2: ( rule__ConcatenateExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1691:3: rule__ConcatenateExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConcatenateExpression__Group_1__1"
    // InternalJqlDsl.g:1699:1: rule__ConcatenateExpression__Group_1__1 : rule__ConcatenateExpression__Group_1__1__Impl ;
    public final void rule__ConcatenateExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1703:1: ( rule__ConcatenateExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1704:2: rule__ConcatenateExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1__1"


    // $ANTLR start "rule__ConcatenateExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:1710:1: rule__ConcatenateExpression__Group_1__1__Impl : ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__ConcatenateExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1714:1: ( ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1715:1: ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1715:1: ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1716:2: ( rule__ConcatenateExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1717:2: ( rule__ConcatenateExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1717:3: rule__ConcatenateExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getRightOperandAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConcatenateExpression__Group_1_0__0"
    // InternalJqlDsl.g:1726:1: rule__ConcatenateExpression__Group_1_0__0 : rule__ConcatenateExpression__Group_1_0__0__Impl ;
    public final void rule__ConcatenateExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1730:1: ( rule__ConcatenateExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1731:2: rule__ConcatenateExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1_0__0"


    // $ANTLR start "rule__ConcatenateExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:1737:1: rule__ConcatenateExpression__Group_1_0__0__Impl : ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConcatenateExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1741:1: ( ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1742:1: ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1742:1: ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1743:2: ( rule__ConcatenateExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1744:2: ( rule__ConcatenateExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1744:3: rule__ConcatenateExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConcatenateExpression__Group_1_0_0__0"
    // InternalJqlDsl.g:1753:1: rule__ConcatenateExpression__Group_1_0_0__0 : rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1 ;
    public final void rule__ConcatenateExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1757:1: ( rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1758:2: rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ConcatenateExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ConcatenateExpression__Group_1_0_0__0__Impl"
    // InternalJqlDsl.g:1765:1: rule__ConcatenateExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConcatenateExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1769:1: ( ( () ) )
            // InternalJqlDsl.g:1770:1: ( () )
            {
            // InternalJqlDsl.g:1770:1: ( () )
            // InternalJqlDsl.g:1771:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1772:2: ()
            // InternalJqlDsl.g:1772:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatenateExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ConcatenateExpression__Group_1_0_0__1"
    // InternalJqlDsl.g:1780:1: rule__ConcatenateExpression__Group_1_0_0__1 : rule__ConcatenateExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConcatenateExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1784:1: ( rule__ConcatenateExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1785:2: rule__ConcatenateExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ConcatenateExpression__Group_1_0_0__1__Impl"
    // InternalJqlDsl.g:1791:1: rule__ConcatenateExpression__Group_1_0_0__1__Impl : ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConcatenateExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1795:1: ( ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1796:1: ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1796:1: ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1797:2: ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1798:2: ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1798:3: rule__ConcatenateExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcatenateExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalJqlDsl.g:1807:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1811:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalJqlDsl.g:1812:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalJqlDsl.g:1819:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1823:1: ( ( ruleAndExpression ) )
            // InternalJqlDsl.g:1824:1: ( ruleAndExpression )
            {
            // InternalJqlDsl.g:1824:1: ( ruleAndExpression )
            // InternalJqlDsl.g:1825:2: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalJqlDsl.g:1834:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1838:1: ( rule__OrExpression__Group__1__Impl )
            // InternalJqlDsl.g:1839:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalJqlDsl.g:1845:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1849:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1850:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1850:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1851:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1852:2: ( rule__OrExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=15 && LA27_0<=16)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJqlDsl.g:1852:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalJqlDsl.g:1861:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1865:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalJqlDsl.g:1866:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:1873:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1877:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1878:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1878:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1879:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1880:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1880:3: rule__OrExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalJqlDsl.g:1888:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1892:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1893:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:1899:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1903:1: ( ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1904:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1904:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1905:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1906:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1906:3: rule__OrExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1_0__0"
    // InternalJqlDsl.g:1915:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1919:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1920:2: rule__OrExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1_0__0"


    // $ANTLR start "rule__OrExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:1926:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1930:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1931:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1931:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1932:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1933:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1933:3: rule__OrExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__0"
    // InternalJqlDsl.g:1942:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1946:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1947:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__OrExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1_0_0__0"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__0__Impl"
    // InternalJqlDsl.g:1954:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1958:1: ( ( () ) )
            // InternalJqlDsl.g:1959:1: ( () )
            {
            // InternalJqlDsl.g:1959:1: ( () )
            // InternalJqlDsl.g:1960:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1961:2: ()
            // InternalJqlDsl.g:1961:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__1"
    // InternalJqlDsl.g:1969:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1973:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1974:2: rule__OrExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1_0_0__1"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__1__Impl"
    // InternalJqlDsl.g:1980:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1984:1: ( ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1985:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1985:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1986:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1987:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1987:3: rule__OrExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalJqlDsl.g:1996:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2000:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalJqlDsl.g:2001:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalJqlDsl.g:2008:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2012:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDsl.g:2013:1: ( ruleEqualityExpression )
            {
            // InternalJqlDsl.g:2013:1: ( ruleEqualityExpression )
            // InternalJqlDsl.g:2014:2: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalJqlDsl.g:2023:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2027:1: ( rule__AndExpression__Group__1__Impl )
            // InternalJqlDsl.g:2028:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalJqlDsl.g:2034:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2038:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2039:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2039:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2040:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2041:2: ( rule__AndExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=17 && LA28_0<=18)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalJqlDsl.g:2041:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalJqlDsl.g:2050:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2054:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalJqlDsl.g:2055:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:2062:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2066:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2067:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2067:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2068:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2069:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2069:3: rule__AndExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalJqlDsl.g:2077:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2081:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2082:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:2088:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2092:1: ( ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2093:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2093:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2094:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2095:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2095:3: rule__AndExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0__0"
    // InternalJqlDsl.g:2104:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2108:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2109:2: rule__AndExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1_0__0"


    // $ANTLR start "rule__AndExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:2115:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2119:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2120:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2120:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2121:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2122:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2122:3: rule__AndExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__0"
    // InternalJqlDsl.g:2131:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2135:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2136:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_8);
            rule__AndExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__0__Impl"
    // InternalJqlDsl.g:2143:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2147:1: ( ( () ) )
            // InternalJqlDsl.g:2148:1: ( () )
            {
            // InternalJqlDsl.g:2148:1: ( () )
            // InternalJqlDsl.g:2149:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2150:2: ()
            // InternalJqlDsl.g:2150:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__1"
    // InternalJqlDsl.g:2158:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2162:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2163:2: rule__AndExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__1__Impl"
    // InternalJqlDsl.g:2169:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2173:1: ( ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2174:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2174:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2175:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2176:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2176:3: rule__AndExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // InternalJqlDsl.g:2185:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2189:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalJqlDsl.g:2190:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // InternalJqlDsl.g:2197:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2201:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:2202:1: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:2202:1: ( ruleRelationalExpression )
            // InternalJqlDsl.g:2203:2: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // InternalJqlDsl.g:2212:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2216:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalJqlDsl.g:2217:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // InternalJqlDsl.g:2223:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2227:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2228:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2228:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2229:2: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2230:2: ( rule__EqualityExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=19 && LA29_0<=20)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalJqlDsl.g:2230:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // InternalJqlDsl.g:2239:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2243:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalJqlDsl.g:2244:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:2251:1: rule__EqualityExpression__Group_1__0__Impl : ( ( rule__EqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2255:1: ( ( ( rule__EqualityExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2256:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2256:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2257:2: ( rule__EqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2258:2: ( rule__EqualityExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2258:3: rule__EqualityExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // InternalJqlDsl.g:2266:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2270:1: ( rule__EqualityExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2271:2: rule__EqualityExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:2277:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2281:1: ( ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2282:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2282:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2283:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2284:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2284:3: rule__EqualityExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_0__0"
    // InternalJqlDsl.g:2293:1: rule__EqualityExpression__Group_1_0__0 : rule__EqualityExpression__Group_1_0__0__Impl ;
    public final void rule__EqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2297:1: ( rule__EqualityExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2298:2: rule__EqualityExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1_0__0"


    // $ANTLR start "rule__EqualityExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:2304:1: rule__EqualityExpression__Group_1_0__0__Impl : ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2308:1: ( ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2309:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2309:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2310:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2311:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2311:3: rule__EqualityExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_0_0__0"
    // InternalJqlDsl.g:2320:1: rule__EqualityExpression__Group_1_0_0__0 : rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 ;
    public final void rule__EqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2324:1: ( rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2325:2: rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_10);
            rule__EqualityExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1_0_0__0"


    // $ANTLR start "rule__EqualityExpression__Group_1_0_0__0__Impl"
    // InternalJqlDsl.g:2332:1: rule__EqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2336:1: ( ( () ) )
            // InternalJqlDsl.g:2337:1: ( () )
            {
            // InternalJqlDsl.g:2337:1: ( () )
            // InternalJqlDsl.g:2338:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2339:2: ()
            // InternalJqlDsl.g:2339:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_0_0__1"
    // InternalJqlDsl.g:2347:1: rule__EqualityExpression__Group_1_0_0__1 : rule__EqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__EqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2351:1: ( rule__EqualityExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2352:2: rule__EqualityExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1_0_0__1"


    // $ANTLR start "rule__EqualityExpression__Group_1_0_0__1__Impl"
    // InternalJqlDsl.g:2358:1: rule__EqualityExpression__Group_1_0_0__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__EqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2362:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2363:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2363:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2364:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2365:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2365:3: rule__EqualityExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // InternalJqlDsl.g:2374:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2378:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalJqlDsl.g:2379:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // InternalJqlDsl.g:2386:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2390:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDsl.g:2391:1: ( ruleAdditiveExpression )
            {
            // InternalJqlDsl.g:2391:1: ( ruleAdditiveExpression )
            // InternalJqlDsl.g:2392:2: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // InternalJqlDsl.g:2401:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2405:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalJqlDsl.g:2406:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // InternalJqlDsl.g:2412:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2416:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2417:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2417:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2418:2: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2419:2: ( rule__RelationalExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=21 && LA30_0<=23)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalJqlDsl.g:2419:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // InternalJqlDsl.g:2428:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2432:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalJqlDsl.g:2433:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:2440:1: rule__RelationalExpression__Group_1__0__Impl : ( ( rule__RelationalExpression__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2444:1: ( ( ( rule__RelationalExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2445:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2445:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2446:2: ( rule__RelationalExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2447:2: ( rule__RelationalExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2447:3: rule__RelationalExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // InternalJqlDsl.g:2455:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2459:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2460:2: rule__RelationalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:2466:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2470:1: ( ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2471:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2471:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2472:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2473:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2473:3: rule__RelationalExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1_0__0"
    // InternalJqlDsl.g:2482:1: rule__RelationalExpression__Group_1_0__0 : rule__RelationalExpression__Group_1_0__0__Impl ;
    public final void rule__RelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2486:1: ( rule__RelationalExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2487:2: rule__RelationalExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0__0"


    // $ANTLR start "rule__RelationalExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:2493:1: rule__RelationalExpression__Group_1_0__0__Impl : ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2497:1: ( ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2498:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2498:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2499:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2500:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2500:3: rule__RelationalExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__0"
    // InternalJqlDsl.g:2509:1: rule__RelationalExpression__Group_1_0_0__0 : rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 ;
    public final void rule__RelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2513:1: ( rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2514:2: rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_12);
            rule__RelationalExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__0"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__0__Impl"
    // InternalJqlDsl.g:2521:1: rule__RelationalExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2525:1: ( ( () ) )
            // InternalJqlDsl.g:2526:1: ( () )
            {
            // InternalJqlDsl.g:2526:1: ( () )
            // InternalJqlDsl.g:2527:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2528:2: ()
            // InternalJqlDsl.g:2528:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__1"
    // InternalJqlDsl.g:2536:1: rule__RelationalExpression__Group_1_0_0__1 : rule__RelationalExpression__Group_1_0_0__1__Impl ;
    public final void rule__RelationalExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2540:1: ( rule__RelationalExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2541:2: rule__RelationalExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__1"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__1__Impl"
    // InternalJqlDsl.g:2547:1: rule__RelationalExpression__Group_1_0_0__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__RelationalExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2551:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2552:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2552:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2553:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2554:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2554:3: rule__RelationalExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__OpCompare__Group_1__0"
    // InternalJqlDsl.g:2563:1: rule__OpCompare__Group_1__0 : rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 ;
    public final void rule__OpCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2567:1: ( rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 )
            // InternalJqlDsl.g:2568:2: rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__OpCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpCompare__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OpCompare__Group_1__0"


    // $ANTLR start "rule__OpCompare__Group_1__0__Impl"
    // InternalJqlDsl.g:2575:1: rule__OpCompare__Group_1__0__Impl : ( '<' ) ;
    public final void rule__OpCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2579:1: ( ( '<' ) )
            // InternalJqlDsl.g:2580:1: ( '<' )
            {
            // InternalJqlDsl.g:2580:1: ( '<' )
            // InternalJqlDsl.g:2581:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__OpCompare__Group_1__0__Impl"


    // $ANTLR start "rule__OpCompare__Group_1__1"
    // InternalJqlDsl.g:2590:1: rule__OpCompare__Group_1__1 : rule__OpCompare__Group_1__1__Impl ;
    public final void rule__OpCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2594:1: ( rule__OpCompare__Group_1__1__Impl )
            // InternalJqlDsl.g:2595:2: rule__OpCompare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpCompare__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OpCompare__Group_1__1"


    // $ANTLR start "rule__OpCompare__Group_1__1__Impl"
    // InternalJqlDsl.g:2601:1: rule__OpCompare__Group_1__1__Impl : ( '=' ) ;
    public final void rule__OpCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2605:1: ( ( '=' ) )
            // InternalJqlDsl.g:2606:1: ( '=' )
            {
            // InternalJqlDsl.g:2606:1: ( '=' )
            // InternalJqlDsl.g:2607:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__OpCompare__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalJqlDsl.g:2617:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2621:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalJqlDsl.g:2622:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalJqlDsl.g:2629:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2633:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDsl.g:2634:1: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDsl.g:2634:1: ( ruleMultiplicativeExpression )
            // InternalJqlDsl.g:2635:2: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalJqlDsl.g:2644:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2648:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalJqlDsl.g:2649:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalJqlDsl.g:2655:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2659:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2660:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2660:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2661:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2662:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=24 && LA31_0<=25)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalJqlDsl.g:2662:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalJqlDsl.g:2671:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2675:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalJqlDsl.g:2676:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:2683:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2687:1: ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2688:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2688:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2689:2: ( rule__AdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2690:2: ( rule__AdditiveExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2690:3: rule__AdditiveExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalJqlDsl.g:2698:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2702:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2703:2: rule__AdditiveExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:2709:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2713:1: ( ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2714:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2714:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2715:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2716:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2716:3: rule__AdditiveExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__0"
    // InternalJqlDsl.g:2725:1: rule__AdditiveExpression__Group_1_0__0 : rule__AdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__AdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2729:1: ( rule__AdditiveExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2730:2: rule__AdditiveExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:2736:1: rule__AdditiveExpression__Group_1_0__0__Impl : ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2740:1: ( ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2741:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2741:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2742:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2743:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2743:3: rule__AdditiveExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__0"
    // InternalJqlDsl.g:2752:1: rule__AdditiveExpression__Group_1_0_0__0 : rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 ;
    public final void rule__AdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2756:1: ( rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2757:2: rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_15);
            rule__AdditiveExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__0__Impl"
    // InternalJqlDsl.g:2764:1: rule__AdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2768:1: ( ( () ) )
            // InternalJqlDsl.g:2769:1: ( () )
            {
            // InternalJqlDsl.g:2769:1: ( () )
            // InternalJqlDsl.g:2770:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2771:2: ()
            // InternalJqlDsl.g:2771:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__1"
    // InternalJqlDsl.g:2779:1: rule__AdditiveExpression__Group_1_0_0__1 : rule__AdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2783:1: ( rule__AdditiveExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2784:2: rule__AdditiveExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__1__Impl"
    // InternalJqlDsl.g:2790:1: rule__AdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2794:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2795:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2795:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2796:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2797:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2797:3: rule__AdditiveExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalJqlDsl.g:2806:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2810:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalJqlDsl.g:2811:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalJqlDsl.g:2818:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2822:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:2823:1: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:2823:1: ( ruleUnaryOperation )
            // InternalJqlDsl.g:2824:2: ruleUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalJqlDsl.g:2833:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2837:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // InternalJqlDsl.g:2838:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalJqlDsl.g:2845:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2849:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2850:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2850:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2851:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2852:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalJqlDsl.g:2852:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__2"
    // InternalJqlDsl.g:2860:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2864:1: ( rule__MultiplicativeExpression__Group__2__Impl )
            // InternalJqlDsl.g:2865:2: rule__MultiplicativeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group__2__Impl"
    // InternalJqlDsl.g:2871:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__Group_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2875:1: ( ( ( rule__MultiplicativeExpression__Group_2__0 )* ) )
            // InternalJqlDsl.g:2876:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            {
            // InternalJqlDsl.g:2876:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            // InternalJqlDsl.g:2877:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:2878:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=26 && LA33_0<=32)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalJqlDsl.g:2878:3: rule__MultiplicativeExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MultiplicativeExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalJqlDsl.g:2887:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2891:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalJqlDsl.g:2892:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:2899:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( '!' ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2903:1: ( ( ( '!' ) ) )
            // InternalJqlDsl.g:2904:1: ( ( '!' ) )
            {
            // InternalJqlDsl.g:2904:1: ( ( '!' ) )
            // InternalJqlDsl.g:2905:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getExclamationMarkKeyword_1_0()); 
            }
            // InternalJqlDsl.g:2906:2: ( '!' )
            // InternalJqlDsl.g:2906:3: '!'
            {
            match(input,33,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getExclamationMarkKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalJqlDsl.g:2914:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2918:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2919:2: rule__MultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:2925:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2929:1: ( ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2930:1: ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2930:1: ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) )
            // InternalJqlDsl.g:2931:2: ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionsAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2932:2: ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 )
            // InternalJqlDsl.g:2932:3: rule__MultiplicativeExpression__FunctionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__FunctionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__0"
    // InternalJqlDsl.g:2941:1: rule__MultiplicativeExpression__Group_2__0 : rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2945:1: ( rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 )
            // InternalJqlDsl.g:2946:2: rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MultiplicativeExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__0__Impl"
    // InternalJqlDsl.g:2953:1: rule__MultiplicativeExpression__Group_2__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2957:1: ( ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) )
            // InternalJqlDsl.g:2958:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            {
            // InternalJqlDsl.g:2958:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            // InternalJqlDsl.g:2959:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0()); 
            }
            // InternalJqlDsl.g:2960:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            // InternalJqlDsl.g:2960:3: rule__MultiplicativeExpression__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__1"
    // InternalJqlDsl.g:2968:1: rule__MultiplicativeExpression__Group_2__1 : rule__MultiplicativeExpression__Group_2__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2972:1: ( rule__MultiplicativeExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:2973:2: rule__MultiplicativeExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__1__Impl"
    // InternalJqlDsl.g:2979:1: rule__MultiplicativeExpression__Group_2__1__Impl : ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2983:1: ( ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) )
            // InternalJqlDsl.g:2984:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:2984:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            // InternalJqlDsl.g:2985:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandAssignment_2_1()); 
            }
            // InternalJqlDsl.g:2986:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            // InternalJqlDsl.g:2986:3: rule__MultiplicativeExpression__RightOperandAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightOperandAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_0__0"
    // InternalJqlDsl.g:2995:1: rule__MultiplicativeExpression__Group_2_0__0 : rule__MultiplicativeExpression__Group_2_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2999:1: ( rule__MultiplicativeExpression__Group_2_0__0__Impl )
            // InternalJqlDsl.g:3000:2: rule__MultiplicativeExpression__Group_2_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_0__0__Impl"
    // InternalJqlDsl.g:3006:1: rule__MultiplicativeExpression__Group_2_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3010:1: ( ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) )
            // InternalJqlDsl.g:3011:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            {
            // InternalJqlDsl.g:3011:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            // InternalJqlDsl.g:3012:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0_0()); 
            }
            // InternalJqlDsl.g:3013:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            // InternalJqlDsl.g:3013:3: rule__MultiplicativeExpression__Group_2_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_0_0__0"
    // InternalJqlDsl.g:3022:1: rule__MultiplicativeExpression__Group_2_0_0__0 : rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3026:1: ( rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 )
            // InternalJqlDsl.g:3027:2: rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1
            {
            pushFollow(FOLLOW_21);
            rule__MultiplicativeExpression__Group_2_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_0_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_0_0__0__Impl"
    // InternalJqlDsl.g:3034:1: rule__MultiplicativeExpression__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3038:1: ( ( () ) )
            // InternalJqlDsl.g:3039:1: ( () )
            {
            // InternalJqlDsl.g:3039:1: ( () )
            // InternalJqlDsl.g:3040:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftOperandAction_2_0_0_0()); 
            }
            // InternalJqlDsl.g:3041:2: ()
            // InternalJqlDsl.g:3041:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftOperandAction_2_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_0_0__1"
    // InternalJqlDsl.g:3049:1: rule__MultiplicativeExpression__Group_2_0_0__1 : rule__MultiplicativeExpression__Group_2_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3053:1: ( rule__MultiplicativeExpression__Group_2_0_0__1__Impl )
            // InternalJqlDsl.g:3054:2: rule__MultiplicativeExpression__Group_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_2_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_0_0__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_0_0__1__Impl"
    // InternalJqlDsl.g:3060:1: rule__MultiplicativeExpression__Group_2_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3064:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) )
            // InternalJqlDsl.g:3065:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            {
            // InternalJqlDsl.g:3065:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            // InternalJqlDsl.g:3066:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_2_0_0_1()); 
            }
            // InternalJqlDsl.g:3067:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            // InternalJqlDsl.g:3067:3: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_2_0_0_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__0"
    // InternalJqlDsl.g:3076:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3080:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalJqlDsl.g:3081:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__UnaryOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryOperation__Group_0__0"


    // $ANTLR start "rule__UnaryOperation__Group_0__0__Impl"
    // InternalJqlDsl.g:3088:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3092:1: ( ( () ) )
            // InternalJqlDsl.g:3093:1: ( () )
            {
            // InternalJqlDsl.g:3093:1: ( () )
            // InternalJqlDsl.g:3094:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); 
            }
            // InternalJqlDsl.g:3095:2: ()
            // InternalJqlDsl.g:3095:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__1"
    // InternalJqlDsl.g:3103:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3107:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalJqlDsl.g:3108:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__UnaryOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryOperation__Group_0__1"


    // $ANTLR start "rule__UnaryOperation__Group_0__1__Impl"
    // InternalJqlDsl.g:3115:1: rule__UnaryOperation__Group_0__1__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3119:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalJqlDsl.g:3120:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:3120:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            // InternalJqlDsl.g:3121:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalJqlDsl.g:3122:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            // InternalJqlDsl.g:3122:3: rule__UnaryOperation__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__2"
    // InternalJqlDsl.g:3130:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3134:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalJqlDsl.g:3135:2: rule__UnaryOperation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryOperation__Group_0__2"


    // $ANTLR start "rule__UnaryOperation__Group_0__2__Impl"
    // InternalJqlDsl.g:3141:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3145:1: ( ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalJqlDsl.g:3146:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalJqlDsl.g:3146:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            // InternalJqlDsl.g:3147:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalJqlDsl.g:3148:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            // InternalJqlDsl.g:3148:3: rule__UnaryOperation__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__Group_0__2__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0"
    // InternalJqlDsl.g:3157:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3161:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // InternalJqlDsl.g:3162:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ParenthesizedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParenthesizedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__0"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0__Impl"
    // InternalJqlDsl.g:3169:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3173:1: ( ( '(' ) )
            // InternalJqlDsl.g:3174:1: ( '(' )
            {
            // InternalJqlDsl.g:3174:1: ( '(' )
            // InternalJqlDsl.g:3175:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__1"
    // InternalJqlDsl.g:3184:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3188:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // InternalJqlDsl.g:3189:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ParenthesizedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParenthesizedExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__1"


    // $ANTLR start "rule__ParenthesizedExpression__Group__1__Impl"
    // InternalJqlDsl.g:3196:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3200:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:3201:1: ( ruleExpression )
            {
            // InternalJqlDsl.g:3201:1: ( ruleExpression )
            // InternalJqlDsl.g:3202:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__2"
    // InternalJqlDsl.g:3211:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3215:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // InternalJqlDsl.g:3216:2: rule__ParenthesizedExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParenthesizedExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__2"


    // $ANTLR start "rule__ParenthesizedExpression__Group__2__Impl"
    // InternalJqlDsl.g:3222:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3226:1: ( ( ')' ) )
            // InternalJqlDsl.g:3227:1: ( ')' )
            {
            // InternalJqlDsl.g:3227:1: ( ')' )
            // InternalJqlDsl.g:3228:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__2__Impl"


    // $ANTLR start "rule__LambdaExpression__Group__0"
    // InternalJqlDsl.g:3238:1: rule__LambdaExpression__Group__0 : rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 ;
    public final void rule__LambdaExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3242:1: ( rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 )
            // InternalJqlDsl.g:3243:2: rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__LambdaExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LambdaExpression__Group__0"


    // $ANTLR start "rule__LambdaExpression__Group__0__Impl"
    // InternalJqlDsl.g:3250:1: rule__LambdaExpression__Group__0__Impl : ( () ) ;
    public final void rule__LambdaExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3254:1: ( ( () ) )
            // InternalJqlDsl.g:3255:1: ( () )
            {
            // InternalJqlDsl.g:3255:1: ( () )
            // InternalJqlDsl.g:3256:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getLambdaExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3257:2: ()
            // InternalJqlDsl.g:3257:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getLambdaExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LambdaExpression__Group__0__Impl"


    // $ANTLR start "rule__LambdaExpression__Group__1"
    // InternalJqlDsl.g:3265:1: rule__LambdaExpression__Group__1 : rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 ;
    public final void rule__LambdaExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3269:1: ( rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 )
            // InternalJqlDsl.g:3270:2: rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__LambdaExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LambdaExpression__Group__1"


    // $ANTLR start "rule__LambdaExpression__Group__1__Impl"
    // InternalJqlDsl.g:3277:1: rule__LambdaExpression__Group__1__Impl : ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) ;
    public final void rule__LambdaExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3281:1: ( ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) )
            // InternalJqlDsl.g:3282:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            {
            // InternalJqlDsl.g:3282:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            // InternalJqlDsl.g:3283:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getArgumentAssignment_1()); 
            }
            // InternalJqlDsl.g:3284:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            // InternalJqlDsl.g:3284:3: rule__LambdaExpression__ArgumentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__ArgumentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getArgumentAssignment_1()); 
            }

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
    // $ANTLR end "rule__LambdaExpression__Group__1__Impl"


    // $ANTLR start "rule__LambdaExpression__Group__2"
    // InternalJqlDsl.g:3292:1: rule__LambdaExpression__Group__2 : rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 ;
    public final void rule__LambdaExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3296:1: ( rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 )
            // InternalJqlDsl.g:3297:2: rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LambdaExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LambdaExpression__Group__2"


    // $ANTLR start "rule__LambdaExpression__Group__2__Impl"
    // InternalJqlDsl.g:3304:1: rule__LambdaExpression__Group__2__Impl : ( '|' ) ;
    public final void rule__LambdaExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3308:1: ( ( '|' ) )
            // InternalJqlDsl.g:3309:1: ( '|' )
            {
            // InternalJqlDsl.g:3309:1: ( '|' )
            // InternalJqlDsl.g:3310:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getVerticalLineKeyword_2()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getVerticalLineKeyword_2()); 
            }

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
    // $ANTLR end "rule__LambdaExpression__Group__2__Impl"


    // $ANTLR start "rule__LambdaExpression__Group__3"
    // InternalJqlDsl.g:3319:1: rule__LambdaExpression__Group__3 : rule__LambdaExpression__Group__3__Impl ;
    public final void rule__LambdaExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3323:1: ( rule__LambdaExpression__Group__3__Impl )
            // InternalJqlDsl.g:3324:2: rule__LambdaExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LambdaExpression__Group__3"


    // $ANTLR start "rule__LambdaExpression__Group__3__Impl"
    // InternalJqlDsl.g:3330:1: rule__LambdaExpression__Group__3__Impl : ( ( rule__LambdaExpression__StatementAssignment_3 ) ) ;
    public final void rule__LambdaExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3334:1: ( ( ( rule__LambdaExpression__StatementAssignment_3 ) ) )
            // InternalJqlDsl.g:3335:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            {
            // InternalJqlDsl.g:3335:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            // InternalJqlDsl.g:3336:2: ( rule__LambdaExpression__StatementAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getStatementAssignment_3()); 
            }
            // InternalJqlDsl.g:3337:2: ( rule__LambdaExpression__StatementAssignment_3 )
            // InternalJqlDsl.g:3337:3: rule__LambdaExpression__StatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LambdaExpression__StatementAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getStatementAssignment_3()); 
            }

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
    // $ANTLR end "rule__LambdaExpression__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalJqlDsl.g:3346:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3350:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalJqlDsl.g:3351:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalJqlDsl.g:3358:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3362:1: ( ( () ) )
            // InternalJqlDsl.g:3363:1: ( () )
            {
            // InternalJqlDsl.g:3363:1: ( () )
            // InternalJqlDsl.g:3364:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            }
            // InternalJqlDsl.g:3365:2: ()
            // InternalJqlDsl.g:3365:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalJqlDsl.g:3373:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3377:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalJqlDsl.g:3378:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalJqlDsl.g:3385:1: rule__Function__Group__1__Impl : ( ( rule__Function__FeatureAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3389:1: ( ( ( rule__Function__FeatureAssignment_1 ) ) )
            // InternalJqlDsl.g:3390:1: ( ( rule__Function__FeatureAssignment_1 ) )
            {
            // InternalJqlDsl.g:3390:1: ( ( rule__Function__FeatureAssignment_1 ) )
            // InternalJqlDsl.g:3391:2: ( rule__Function__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFeatureAssignment_1()); 
            }
            // InternalJqlDsl.g:3392:2: ( rule__Function__FeatureAssignment_1 )
            // InternalJqlDsl.g:3392:3: rule__Function__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__FeatureAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFeatureAssignment_1()); 
            }

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalJqlDsl.g:3400:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3404:1: ( rule__Function__Group__2__Impl )
            // InternalJqlDsl.g:3405:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalJqlDsl.g:3411:1: rule__Function__Group__2__Impl : ( ( rule__Function__Group_2__0 )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3415:1: ( ( ( rule__Function__Group_2__0 )? ) )
            // InternalJqlDsl.g:3416:1: ( ( rule__Function__Group_2__0 )? )
            {
            // InternalJqlDsl.g:3416:1: ( ( rule__Function__Group_2__0 )? )
            // InternalJqlDsl.g:3417:2: ( rule__Function__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:3418:2: ( rule__Function__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJqlDsl.g:3418:3: rule__Function__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group_2__0"
    // InternalJqlDsl.g:3427:1: rule__Function__Group_2__0 : rule__Function__Group_2__0__Impl rule__Function__Group_2__1 ;
    public final void rule__Function__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3431:1: ( rule__Function__Group_2__0__Impl rule__Function__Group_2__1 )
            // InternalJqlDsl.g:3432:2: rule__Function__Group_2__0__Impl rule__Function__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Function__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2__0"


    // $ANTLR start "rule__Function__Group_2__0__Impl"
    // InternalJqlDsl.g:3439:1: rule__Function__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Function__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3443:1: ( ( '(' ) )
            // InternalJqlDsl.g:3444:1: ( '(' )
            {
            // InternalJqlDsl.g:3444:1: ( '(' )
            // InternalJqlDsl.g:3445:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__Function__Group_2__0__Impl"


    // $ANTLR start "rule__Function__Group_2__1"
    // InternalJqlDsl.g:3454:1: rule__Function__Group_2__1 : rule__Function__Group_2__1__Impl rule__Function__Group_2__2 ;
    public final void rule__Function__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3458:1: ( rule__Function__Group_2__1__Impl rule__Function__Group_2__2 )
            // InternalJqlDsl.g:3459:2: rule__Function__Group_2__1__Impl rule__Function__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__Function__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2__1"


    // $ANTLR start "rule__Function__Group_2__1__Impl"
    // InternalJqlDsl.g:3466:1: rule__Function__Group_2__1__Impl : ( ( rule__Function__Alternatives_2_1 ) ) ;
    public final void rule__Function__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3470:1: ( ( ( rule__Function__Alternatives_2_1 ) ) )
            // InternalJqlDsl.g:3471:1: ( ( rule__Function__Alternatives_2_1 ) )
            {
            // InternalJqlDsl.g:3471:1: ( ( rule__Function__Alternatives_2_1 ) )
            // InternalJqlDsl.g:3472:2: ( rule__Function__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getAlternatives_2_1()); 
            }
            // InternalJqlDsl.g:3473:2: ( rule__Function__Alternatives_2_1 )
            // InternalJqlDsl.g:3473:3: rule__Function__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getAlternatives_2_1()); 
            }

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
    // $ANTLR end "rule__Function__Group_2__1__Impl"


    // $ANTLR start "rule__Function__Group_2__2"
    // InternalJqlDsl.g:3481:1: rule__Function__Group_2__2 : rule__Function__Group_2__2__Impl ;
    public final void rule__Function__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3485:1: ( rule__Function__Group_2__2__Impl )
            // InternalJqlDsl.g:3486:2: rule__Function__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2__2"


    // $ANTLR start "rule__Function__Group_2__2__Impl"
    // InternalJqlDsl.g:3492:1: rule__Function__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Function__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3496:1: ( ( ')' ) )
            // InternalJqlDsl.g:3497:1: ( ')' )
            {
            // InternalJqlDsl.g:3497:1: ( ')' )
            // InternalJqlDsl.g:3498:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_2()); 
            }

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
    // $ANTLR end "rule__Function__Group_2__2__Impl"


    // $ANTLR start "rule__Function__Group_2_1_1__0"
    // InternalJqlDsl.g:3508:1: rule__Function__Group_2_1_1__0 : rule__Function__Group_2_1_1__0__Impl rule__Function__Group_2_1_1__1 ;
    public final void rule__Function__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3512:1: ( rule__Function__Group_2_1_1__0__Impl rule__Function__Group_2_1_1__1 )
            // InternalJqlDsl.g:3513:2: rule__Function__Group_2_1_1__0__Impl rule__Function__Group_2_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Function__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2_1_1__0"


    // $ANTLR start "rule__Function__Group_2_1_1__0__Impl"
    // InternalJqlDsl.g:3520:1: rule__Function__Group_2_1_1__0__Impl : ( ( rule__Function__ParametersAssignment_2_1_1_0 )? ) ;
    public final void rule__Function__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3524:1: ( ( ( rule__Function__ParametersAssignment_2_1_1_0 )? ) )
            // InternalJqlDsl.g:3525:1: ( ( rule__Function__ParametersAssignment_2_1_1_0 )? )
            {
            // InternalJqlDsl.g:3525:1: ( ( rule__Function__ParametersAssignment_2_1_1_0 )? )
            // InternalJqlDsl.g:3526:2: ( rule__Function__ParametersAssignment_2_1_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersAssignment_2_1_1_0()); 
            }
            // InternalJqlDsl.g:3527:2: ( rule__Function__ParametersAssignment_2_1_1_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_TIMESTAMP)||(LA35_0>=24 && LA35_0<=25)||(LA35_0>=33 && LA35_0<=37)||LA35_0==46||LA35_0==48||LA35_0==54||LA35_0==58) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJqlDsl.g:3527:3: rule__Function__ParametersAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__ParametersAssignment_2_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersAssignment_2_1_1_0()); 
            }

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
    // $ANTLR end "rule__Function__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Function__Group_2_1_1__1"
    // InternalJqlDsl.g:3535:1: rule__Function__Group_2_1_1__1 : rule__Function__Group_2_1_1__1__Impl ;
    public final void rule__Function__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3539:1: ( rule__Function__Group_2_1_1__1__Impl )
            // InternalJqlDsl.g:3540:2: rule__Function__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2_1_1__1"


    // $ANTLR start "rule__Function__Group_2_1_1__1__Impl"
    // InternalJqlDsl.g:3546:1: rule__Function__Group_2_1_1__1__Impl : ( ( rule__Function__Group_2_1_1_1__0 )* ) ;
    public final void rule__Function__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3550:1: ( ( ( rule__Function__Group_2_1_1_1__0 )* ) )
            // InternalJqlDsl.g:3551:1: ( ( rule__Function__Group_2_1_1_1__0 )* )
            {
            // InternalJqlDsl.g:3551:1: ( ( rule__Function__Group_2_1_1_1__0 )* )
            // InternalJqlDsl.g:3552:2: ( rule__Function__Group_2_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup_2_1_1_1()); 
            }
            // InternalJqlDsl.g:3553:2: ( rule__Function__Group_2_1_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalJqlDsl.g:3553:3: rule__Function__Group_2_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Function__Group_2_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup_2_1_1_1()); 
            }

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
    // $ANTLR end "rule__Function__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Function__Group_2_1_1_1__0"
    // InternalJqlDsl.g:3562:1: rule__Function__Group_2_1_1_1__0 : rule__Function__Group_2_1_1_1__0__Impl rule__Function__Group_2_1_1_1__1 ;
    public final void rule__Function__Group_2_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3566:1: ( rule__Function__Group_2_1_1_1__0__Impl rule__Function__Group_2_1_1_1__1 )
            // InternalJqlDsl.g:3567:2: rule__Function__Group_2_1_1_1__0__Impl rule__Function__Group_2_1_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Function__Group_2_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group_2_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2_1_1_1__0"


    // $ANTLR start "rule__Function__Group_2_1_1_1__0__Impl"
    // InternalJqlDsl.g:3574:1: rule__Function__Group_2_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_2_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3578:1: ( ( ',' ) )
            // InternalJqlDsl.g:3579:1: ( ',' )
            {
            // InternalJqlDsl.g:3579:1: ( ',' )
            // InternalJqlDsl.g:3580:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getCommaKeyword_2_1_1_1_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getCommaKeyword_2_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__Function__Group_2_1_1_1__0__Impl"


    // $ANTLR start "rule__Function__Group_2_1_1_1__1"
    // InternalJqlDsl.g:3589:1: rule__Function__Group_2_1_1_1__1 : rule__Function__Group_2_1_1_1__1__Impl ;
    public final void rule__Function__Group_2_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3593:1: ( rule__Function__Group_2_1_1_1__1__Impl )
            // InternalJqlDsl.g:3594:2: rule__Function__Group_2_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_2_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Function__Group_2_1_1_1__1"


    // $ANTLR start "rule__Function__Group_2_1_1_1__1__Impl"
    // InternalJqlDsl.g:3600:1: rule__Function__Group_2_1_1_1__1__Impl : ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) ) ;
    public final void rule__Function__Group_2_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3604:1: ( ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) ) )
            // InternalJqlDsl.g:3605:1: ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) )
            {
            // InternalJqlDsl.g:3605:1: ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) )
            // InternalJqlDsl.g:3606:2: ( rule__Function__ParametersAssignment_2_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersAssignment_2_1_1_1_1()); 
            }
            // InternalJqlDsl.g:3607:2: ( rule__Function__ParametersAssignment_2_1_1_1_1 )
            // InternalJqlDsl.g:3607:3: rule__Function__ParametersAssignment_2_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_2_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersAssignment_2_1_1_1_1()); 
            }

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
    // $ANTLR end "rule__Function__Group_2_1_1_1__1__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__0"
    // InternalJqlDsl.g:3616:1: rule__SwitchExpression__Group__0 : rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 ;
    public final void rule__SwitchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3620:1: ( rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 )
            // InternalJqlDsl.g:3621:2: rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SwitchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchExpression__Group__0"


    // $ANTLR start "rule__SwitchExpression__Group__0__Impl"
    // InternalJqlDsl.g:3628:1: rule__SwitchExpression__Group__0__Impl : ( () ) ;
    public final void rule__SwitchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3632:1: ( ( () ) )
            // InternalJqlDsl.g:3633:1: ( () )
            {
            // InternalJqlDsl.g:3633:1: ( () )
            // InternalJqlDsl.g:3634:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getSwitchExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3635:2: ()
            // InternalJqlDsl.g:3635:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getSwitchExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__0__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__1"
    // InternalJqlDsl.g:3643:1: rule__SwitchExpression__Group__1 : rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 ;
    public final void rule__SwitchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3647:1: ( rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 )
            // InternalJqlDsl.g:3648:2: rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SwitchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchExpression__Group__1"


    // $ANTLR start "rule__SwitchExpression__Group__1__Impl"
    // InternalJqlDsl.g:3655:1: rule__SwitchExpression__Group__1__Impl : ( ( rule__SwitchExpression__Alternatives_1 ) ) ;
    public final void rule__SwitchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3659:1: ( ( ( rule__SwitchExpression__Alternatives_1 ) ) )
            // InternalJqlDsl.g:3660:1: ( ( rule__SwitchExpression__Alternatives_1 ) )
            {
            // InternalJqlDsl.g:3660:1: ( ( rule__SwitchExpression__Alternatives_1 ) )
            // InternalJqlDsl.g:3661:2: ( rule__SwitchExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getAlternatives_1()); 
            }
            // InternalJqlDsl.g:3662:2: ( rule__SwitchExpression__Alternatives_1 )
            // InternalJqlDsl.g:3662:3: rule__SwitchExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__SwitchExpression__Group__1__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__2"
    // InternalJqlDsl.g:3670:1: rule__SwitchExpression__Group__2 : rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 ;
    public final void rule__SwitchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3674:1: ( rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 )
            // InternalJqlDsl.g:3675:2: rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__SwitchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchExpression__Group__2"


    // $ANTLR start "rule__SwitchExpression__Group__2__Impl"
    // InternalJqlDsl.g:3682:1: rule__SwitchExpression__Group__2__Impl : ( ( rule__SwitchExpression__OperandAssignment_2 ) ) ;
    public final void rule__SwitchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3686:1: ( ( ( rule__SwitchExpression__OperandAssignment_2 ) ) )
            // InternalJqlDsl.g:3687:1: ( ( rule__SwitchExpression__OperandAssignment_2 ) )
            {
            // InternalJqlDsl.g:3687:1: ( ( rule__SwitchExpression__OperandAssignment_2 ) )
            // InternalJqlDsl.g:3688:2: ( rule__SwitchExpression__OperandAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getOperandAssignment_2()); 
            }
            // InternalJqlDsl.g:3689:2: ( rule__SwitchExpression__OperandAssignment_2 )
            // InternalJqlDsl.g:3689:3: rule__SwitchExpression__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__OperandAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getOperandAssignment_2()); 
            }

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
    // $ANTLR end "rule__SwitchExpression__Group__2__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__3"
    // InternalJqlDsl.g:3697:1: rule__SwitchExpression__Group__3 : rule__SwitchExpression__Group__3__Impl ;
    public final void rule__SwitchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3701:1: ( rule__SwitchExpression__Group__3__Impl )
            // InternalJqlDsl.g:3702:2: rule__SwitchExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchExpression__Group__3"


    // $ANTLR start "rule__SwitchExpression__Group__3__Impl"
    // InternalJqlDsl.g:3708:1: rule__SwitchExpression__Group__3__Impl : ( ( rule__SwitchExpression__BodyAssignment_3 ) ) ;
    public final void rule__SwitchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3712:1: ( ( ( rule__SwitchExpression__BodyAssignment_3 ) ) )
            // InternalJqlDsl.g:3713:1: ( ( rule__SwitchExpression__BodyAssignment_3 ) )
            {
            // InternalJqlDsl.g:3713:1: ( ( rule__SwitchExpression__BodyAssignment_3 ) )
            // InternalJqlDsl.g:3714:2: ( rule__SwitchExpression__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getBodyAssignment_3()); 
            }
            // InternalJqlDsl.g:3715:2: ( rule__SwitchExpression__BodyAssignment_3 )
            // InternalJqlDsl.g:3715:3: rule__SwitchExpression__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getBodyAssignment_3()); 
            }

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
    // $ANTLR end "rule__SwitchExpression__Group__3__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__0"
    // InternalJqlDsl.g:3724:1: rule__SwitchConditionalExpression__Group__0 : rule__SwitchConditionalExpression__Group__0__Impl rule__SwitchConditionalExpression__Group__1 ;
    public final void rule__SwitchConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3728:1: ( rule__SwitchConditionalExpression__Group__0__Impl rule__SwitchConditionalExpression__Group__1 )
            // InternalJqlDsl.g:3729:2: rule__SwitchConditionalExpression__Group__0__Impl rule__SwitchConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SwitchConditionalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__0"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__0__Impl"
    // InternalJqlDsl.g:3736:1: rule__SwitchConditionalExpression__Group__0__Impl : ( () ) ;
    public final void rule__SwitchConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3740:1: ( ( () ) )
            // InternalJqlDsl.g:3741:1: ( () )
            {
            // InternalJqlDsl.g:3741:1: ( () )
            // InternalJqlDsl.g:3742:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getSwitchConditionalExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3743:2: ()
            // InternalJqlDsl.g:3743:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getSwitchConditionalExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchConditionalExpression__Group__0__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__1"
    // InternalJqlDsl.g:3751:1: rule__SwitchConditionalExpression__Group__1 : rule__SwitchConditionalExpression__Group__1__Impl rule__SwitchConditionalExpression__Group__2 ;
    public final void rule__SwitchConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3755:1: ( rule__SwitchConditionalExpression__Group__1__Impl rule__SwitchConditionalExpression__Group__2 )
            // InternalJqlDsl.g:3756:2: rule__SwitchConditionalExpression__Group__1__Impl rule__SwitchConditionalExpression__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SwitchConditionalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__1"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__1__Impl"
    // InternalJqlDsl.g:3763:1: rule__SwitchConditionalExpression__Group__1__Impl : ( ( rule__SwitchConditionalExpression__Alternatives_1 ) ) ;
    public final void rule__SwitchConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3767:1: ( ( ( rule__SwitchConditionalExpression__Alternatives_1 ) ) )
            // InternalJqlDsl.g:3768:1: ( ( rule__SwitchConditionalExpression__Alternatives_1 ) )
            {
            // InternalJqlDsl.g:3768:1: ( ( rule__SwitchConditionalExpression__Alternatives_1 ) )
            // InternalJqlDsl.g:3769:2: ( rule__SwitchConditionalExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getAlternatives_1()); 
            }
            // InternalJqlDsl.g:3770:2: ( rule__SwitchConditionalExpression__Alternatives_1 )
            // InternalJqlDsl.g:3770:3: rule__SwitchConditionalExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__1__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__2"
    // InternalJqlDsl.g:3778:1: rule__SwitchConditionalExpression__Group__2 : rule__SwitchConditionalExpression__Group__2__Impl rule__SwitchConditionalExpression__Group__3 ;
    public final void rule__SwitchConditionalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3782:1: ( rule__SwitchConditionalExpression__Group__2__Impl rule__SwitchConditionalExpression__Group__3 )
            // InternalJqlDsl.g:3783:2: rule__SwitchConditionalExpression__Group__2__Impl rule__SwitchConditionalExpression__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__SwitchConditionalExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__2"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__2__Impl"
    // InternalJqlDsl.g:3790:1: rule__SwitchConditionalExpression__Group__2__Impl : ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) ) ;
    public final void rule__SwitchConditionalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3794:1: ( ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) ) )
            // InternalJqlDsl.g:3795:1: ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) )
            {
            // InternalJqlDsl.g:3795:1: ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) )
            // InternalJqlDsl.g:3796:2: ( rule__SwitchConditionalExpression__AliasAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getAliasAssignment_2()); 
            }
            // InternalJqlDsl.g:3797:2: ( rule__SwitchConditionalExpression__AliasAssignment_2 )
            // InternalJqlDsl.g:3797:3: rule__SwitchConditionalExpression__AliasAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__AliasAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getAliasAssignment_2()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__2__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__3"
    // InternalJqlDsl.g:3805:1: rule__SwitchConditionalExpression__Group__3 : rule__SwitchConditionalExpression__Group__3__Impl rule__SwitchConditionalExpression__Group__4 ;
    public final void rule__SwitchConditionalExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3809:1: ( rule__SwitchConditionalExpression__Group__3__Impl rule__SwitchConditionalExpression__Group__4 )
            // InternalJqlDsl.g:3810:2: rule__SwitchConditionalExpression__Group__3__Impl rule__SwitchConditionalExpression__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__SwitchConditionalExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__3"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__3__Impl"
    // InternalJqlDsl.g:3817:1: rule__SwitchConditionalExpression__Group__3__Impl : ( ( rule__SwitchConditionalExpression__Group_3__0 )* ) ;
    public final void rule__SwitchConditionalExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3821:1: ( ( ( rule__SwitchConditionalExpression__Group_3__0 )* ) )
            // InternalJqlDsl.g:3822:1: ( ( rule__SwitchConditionalExpression__Group_3__0 )* )
            {
            // InternalJqlDsl.g:3822:1: ( ( rule__SwitchConditionalExpression__Group_3__0 )* )
            // InternalJqlDsl.g:3823:2: ( rule__SwitchConditionalExpression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_3()); 
            }
            // InternalJqlDsl.g:3824:2: ( rule__SwitchConditionalExpression__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==40) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred52_InternalJqlDsl()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==41) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred52_InternalJqlDsl()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalJqlDsl.g:3824:3: rule__SwitchConditionalExpression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SwitchConditionalExpression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__3__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__4"
    // InternalJqlDsl.g:3832:1: rule__SwitchConditionalExpression__Group__4 : rule__SwitchConditionalExpression__Group__4__Impl ;
    public final void rule__SwitchConditionalExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3836:1: ( rule__SwitchConditionalExpression__Group__4__Impl )
            // InternalJqlDsl.g:3837:2: rule__SwitchConditionalExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__4"


    // $ANTLR start "rule__SwitchConditionalExpression__Group__4__Impl"
    // InternalJqlDsl.g:3843:1: rule__SwitchConditionalExpression__Group__4__Impl : ( ( rule__SwitchConditionalExpression__Group_4__0 )? ) ;
    public final void rule__SwitchConditionalExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3847:1: ( ( ( rule__SwitchConditionalExpression__Group_4__0 )? ) )
            // InternalJqlDsl.g:3848:1: ( ( rule__SwitchConditionalExpression__Group_4__0 )? )
            {
            // InternalJqlDsl.g:3848:1: ( ( rule__SwitchConditionalExpression__Group_4__0 )? )
            // InternalJqlDsl.g:3849:2: ( rule__SwitchConditionalExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_4()); 
            }
            // InternalJqlDsl.g:3850:2: ( rule__SwitchConditionalExpression__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred53_InternalJqlDsl()) ) {
                    alt38=1;
                }
            }
            else if ( (LA38_0==43) ) {
                int LA38_2 = input.LA(2);

                if ( (synpred53_InternalJqlDsl()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalJqlDsl.g:3850:3: rule__SwitchConditionalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchConditionalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group__4__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_3__0"
    // InternalJqlDsl.g:3859:1: rule__SwitchConditionalExpression__Group_3__0 : rule__SwitchConditionalExpression__Group_3__0__Impl rule__SwitchConditionalExpression__Group_3__1 ;
    public final void rule__SwitchConditionalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3863:1: ( rule__SwitchConditionalExpression__Group_3__0__Impl rule__SwitchConditionalExpression__Group_3__1 )
            // InternalJqlDsl.g:3864:2: rule__SwitchConditionalExpression__Group_3__0__Impl rule__SwitchConditionalExpression__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__SwitchConditionalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_3__0"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_3__0__Impl"
    // InternalJqlDsl.g:3871:1: rule__SwitchConditionalExpression__Group_3__0__Impl : ( ( rule__SwitchConditionalExpression__Group_3_0__0 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3875:1: ( ( ( rule__SwitchConditionalExpression__Group_3_0__0 ) ) )
            // InternalJqlDsl.g:3876:1: ( ( rule__SwitchConditionalExpression__Group_3_0__0 ) )
            {
            // InternalJqlDsl.g:3876:1: ( ( rule__SwitchConditionalExpression__Group_3_0__0 ) )
            // InternalJqlDsl.g:3877:2: ( rule__SwitchConditionalExpression__Group_3_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_3_0()); 
            }
            // InternalJqlDsl.g:3878:2: ( rule__SwitchConditionalExpression__Group_3_0__0 )
            // InternalJqlDsl.g:3878:3: rule__SwitchConditionalExpression__Group_3_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_3_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_3_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_3__1"
    // InternalJqlDsl.g:3886:1: rule__SwitchConditionalExpression__Group_3__1 : rule__SwitchConditionalExpression__Group_3__1__Impl ;
    public final void rule__SwitchConditionalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3890:1: ( rule__SwitchConditionalExpression__Group_3__1__Impl )
            // InternalJqlDsl.g:3891:2: rule__SwitchConditionalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_3__1"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_3__1__Impl"
    // InternalJqlDsl.g:3897:1: rule__SwitchConditionalExpression__Group_3__1__Impl : ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3901:1: ( ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) ) )
            // InternalJqlDsl.g:3902:1: ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) )
            {
            // InternalJqlDsl.g:3902:1: ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) )
            // InternalJqlDsl.g:3903:2: ( rule__SwitchConditionalExpression__CasesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getCasesAssignment_3_1()); 
            }
            // InternalJqlDsl.g:3904:2: ( rule__SwitchConditionalExpression__CasesAssignment_3_1 )
            // InternalJqlDsl.g:3904:3: rule__SwitchConditionalExpression__CasesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__CasesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getCasesAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_3_0__0"
    // InternalJqlDsl.g:3913:1: rule__SwitchConditionalExpression__Group_3_0__0 : rule__SwitchConditionalExpression__Group_3_0__0__Impl ;
    public final void rule__SwitchConditionalExpression__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3917:1: ( rule__SwitchConditionalExpression__Group_3_0__0__Impl )
            // InternalJqlDsl.g:3918:2: rule__SwitchConditionalExpression__Group_3_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_3_0__0"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_3_0__0__Impl"
    // InternalJqlDsl.g:3924:1: rule__SwitchConditionalExpression__Group_3_0__0__Impl : ( ( rule__SwitchConditionalExpression__Alternatives_3_0_0 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3928:1: ( ( ( rule__SwitchConditionalExpression__Alternatives_3_0_0 ) ) )
            // InternalJqlDsl.g:3929:1: ( ( rule__SwitchConditionalExpression__Alternatives_3_0_0 ) )
            {
            // InternalJqlDsl.g:3929:1: ( ( rule__SwitchConditionalExpression__Alternatives_3_0_0 ) )
            // InternalJqlDsl.g:3930:2: ( rule__SwitchConditionalExpression__Alternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getAlternatives_3_0_0()); 
            }
            // InternalJqlDsl.g:3931:2: ( rule__SwitchConditionalExpression__Alternatives_3_0_0 )
            // InternalJqlDsl.g:3931:3: rule__SwitchConditionalExpression__Alternatives_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Alternatives_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getAlternatives_3_0_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_3_0__0__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4__0"
    // InternalJqlDsl.g:3940:1: rule__SwitchConditionalExpression__Group_4__0 : rule__SwitchConditionalExpression__Group_4__0__Impl rule__SwitchConditionalExpression__Group_4__1 ;
    public final void rule__SwitchConditionalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3944:1: ( rule__SwitchConditionalExpression__Group_4__0__Impl rule__SwitchConditionalExpression__Group_4__1 )
            // InternalJqlDsl.g:3945:2: rule__SwitchConditionalExpression__Group_4__0__Impl rule__SwitchConditionalExpression__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__SwitchConditionalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_4__0"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4__0__Impl"
    // InternalJqlDsl.g:3952:1: rule__SwitchConditionalExpression__Group_4__0__Impl : ( ( rule__SwitchConditionalExpression__Group_4_0__0 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3956:1: ( ( ( rule__SwitchConditionalExpression__Group_4_0__0 ) ) )
            // InternalJqlDsl.g:3957:1: ( ( rule__SwitchConditionalExpression__Group_4_0__0 ) )
            {
            // InternalJqlDsl.g:3957:1: ( ( rule__SwitchConditionalExpression__Group_4_0__0 ) )
            // InternalJqlDsl.g:3958:2: ( rule__SwitchConditionalExpression__Group_4_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_4_0()); 
            }
            // InternalJqlDsl.g:3959:2: ( rule__SwitchConditionalExpression__Group_4_0__0 )
            // InternalJqlDsl.g:3959:3: rule__SwitchConditionalExpression__Group_4_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_4_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_4_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4__1"
    // InternalJqlDsl.g:3967:1: rule__SwitchConditionalExpression__Group_4__1 : rule__SwitchConditionalExpression__Group_4__1__Impl ;
    public final void rule__SwitchConditionalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3971:1: ( rule__SwitchConditionalExpression__Group_4__1__Impl )
            // InternalJqlDsl.g:3972:2: rule__SwitchConditionalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_4__1"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4__1__Impl"
    // InternalJqlDsl.g:3978:1: rule__SwitchConditionalExpression__Group_4__1__Impl : ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3982:1: ( ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) ) )
            // InternalJqlDsl.g:3983:1: ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) )
            {
            // InternalJqlDsl.g:3983:1: ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) )
            // InternalJqlDsl.g:3984:2: ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getDefaultAssignment_4_1()); 
            }
            // InternalJqlDsl.g:3985:2: ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 )
            // InternalJqlDsl.g:3985:3: rule__SwitchConditionalExpression__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__DefaultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getDefaultAssignment_4_1()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4_0__0"
    // InternalJqlDsl.g:3994:1: rule__SwitchConditionalExpression__Group_4_0__0 : rule__SwitchConditionalExpression__Group_4_0__0__Impl ;
    public final void rule__SwitchConditionalExpression__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3998:1: ( rule__SwitchConditionalExpression__Group_4_0__0__Impl )
            // InternalJqlDsl.g:3999:2: rule__SwitchConditionalExpression__Group_4_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_4_0__0"


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4_0__0__Impl"
    // InternalJqlDsl.g:4005:1: rule__SwitchConditionalExpression__Group_4_0__0__Impl : ( ( rule__SwitchConditionalExpression__Alternatives_4_0_0 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4009:1: ( ( ( rule__SwitchConditionalExpression__Alternatives_4_0_0 ) ) )
            // InternalJqlDsl.g:4010:1: ( ( rule__SwitchConditionalExpression__Alternatives_4_0_0 ) )
            {
            // InternalJqlDsl.g:4010:1: ( ( rule__SwitchConditionalExpression__Alternatives_4_0_0 ) )
            // InternalJqlDsl.g:4011:2: ( rule__SwitchConditionalExpression__Alternatives_4_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getAlternatives_4_0_0()); 
            }
            // InternalJqlDsl.g:4012:2: ( rule__SwitchConditionalExpression__Alternatives_4_0_0 )
            // InternalJqlDsl.g:4012:3: rule__SwitchConditionalExpression__Alternatives_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalExpression__Alternatives_4_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getAlternatives_4_0_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__Group_4_0__0__Impl"


    // $ANTLR start "rule__SwitchConditionalCase__Group__0"
    // InternalJqlDsl.g:4021:1: rule__SwitchConditionalCase__Group__0 : rule__SwitchConditionalCase__Group__0__Impl rule__SwitchConditionalCase__Group__1 ;
    public final void rule__SwitchConditionalCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4025:1: ( rule__SwitchConditionalCase__Group__0__Impl rule__SwitchConditionalCase__Group__1 )
            // InternalJqlDsl.g:4026:2: rule__SwitchConditionalCase__Group__0__Impl rule__SwitchConditionalCase__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SwitchConditionalCase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__0"


    // $ANTLR start "rule__SwitchConditionalCase__Group__0__Impl"
    // InternalJqlDsl.g:4033:1: rule__SwitchConditionalCase__Group__0__Impl : ( () ) ;
    public final void rule__SwitchConditionalCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4037:1: ( ( () ) )
            // InternalJqlDsl.g:4038:1: ( () )
            {
            // InternalJqlDsl.g:4038:1: ( () )
            // InternalJqlDsl.g:4039:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getSwitchConditionalCaseAction_0()); 
            }
            // InternalJqlDsl.g:4040:2: ()
            // InternalJqlDsl.g:4040:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getSwitchConditionalCaseAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchConditionalCase__Group__0__Impl"


    // $ANTLR start "rule__SwitchConditionalCase__Group__1"
    // InternalJqlDsl.g:4048:1: rule__SwitchConditionalCase__Group__1 : rule__SwitchConditionalCase__Group__1__Impl rule__SwitchConditionalCase__Group__2 ;
    public final void rule__SwitchConditionalCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4052:1: ( rule__SwitchConditionalCase__Group__1__Impl rule__SwitchConditionalCase__Group__2 )
            // InternalJqlDsl.g:4053:2: rule__SwitchConditionalCase__Group__1__Impl rule__SwitchConditionalCase__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SwitchConditionalCase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__1"


    // $ANTLR start "rule__SwitchConditionalCase__Group__1__Impl"
    // InternalJqlDsl.g:4060:1: rule__SwitchConditionalCase__Group__1__Impl : ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) ) ;
    public final void rule__SwitchConditionalCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4064:1: ( ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) ) )
            // InternalJqlDsl.g:4065:1: ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) )
            {
            // InternalJqlDsl.g:4065:1: ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) )
            // InternalJqlDsl.g:4066:2: ( rule__SwitchConditionalCase__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getConditionAssignment_1()); 
            }
            // InternalJqlDsl.g:4067:2: ( rule__SwitchConditionalCase__ConditionAssignment_1 )
            // InternalJqlDsl.g:4067:3: rule__SwitchConditionalCase__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getConditionAssignment_1()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__1__Impl"


    // $ANTLR start "rule__SwitchConditionalCase__Group__2"
    // InternalJqlDsl.g:4075:1: rule__SwitchConditionalCase__Group__2 : rule__SwitchConditionalCase__Group__2__Impl rule__SwitchConditionalCase__Group__3 ;
    public final void rule__SwitchConditionalCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4079:1: ( rule__SwitchConditionalCase__Group__2__Impl rule__SwitchConditionalCase__Group__3 )
            // InternalJqlDsl.g:4080:2: rule__SwitchConditionalCase__Group__2__Impl rule__SwitchConditionalCase__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__SwitchConditionalCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__2"


    // $ANTLR start "rule__SwitchConditionalCase__Group__2__Impl"
    // InternalJqlDsl.g:4087:1: rule__SwitchConditionalCase__Group__2__Impl : ( ( rule__SwitchConditionalCase__Alternatives_2 ) ) ;
    public final void rule__SwitchConditionalCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4091:1: ( ( ( rule__SwitchConditionalCase__Alternatives_2 ) ) )
            // InternalJqlDsl.g:4092:1: ( ( rule__SwitchConditionalCase__Alternatives_2 ) )
            {
            // InternalJqlDsl.g:4092:1: ( ( rule__SwitchConditionalCase__Alternatives_2 ) )
            // InternalJqlDsl.g:4093:2: ( rule__SwitchConditionalCase__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getAlternatives_2()); 
            }
            // InternalJqlDsl.g:4094:2: ( rule__SwitchConditionalCase__Alternatives_2 )
            // InternalJqlDsl.g:4094:3: rule__SwitchConditionalCase__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getAlternatives_2()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__2__Impl"


    // $ANTLR start "rule__SwitchConditionalCase__Group__3"
    // InternalJqlDsl.g:4102:1: rule__SwitchConditionalCase__Group__3 : rule__SwitchConditionalCase__Group__3__Impl ;
    public final void rule__SwitchConditionalCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4106:1: ( rule__SwitchConditionalCase__Group__3__Impl )
            // InternalJqlDsl.g:4107:2: rule__SwitchConditionalCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__3"


    // $ANTLR start "rule__SwitchConditionalCase__Group__3__Impl"
    // InternalJqlDsl.g:4113:1: rule__SwitchConditionalCase__Group__3__Impl : ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) ) ;
    public final void rule__SwitchConditionalCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4117:1: ( ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) ) )
            // InternalJqlDsl.g:4118:1: ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) )
            {
            // InternalJqlDsl.g:4118:1: ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) )
            // InternalJqlDsl.g:4119:2: ( rule__SwitchConditionalCase__ResultAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getResultAssignment_3()); 
            }
            // InternalJqlDsl.g:4120:2: ( rule__SwitchConditionalCase__ResultAssignment_3 )
            // InternalJqlDsl.g:4120:3: rule__SwitchConditionalCase__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SwitchConditionalCase__ResultAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getResultAssignment_3()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalCase__Group__3__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group__0"
    // InternalJqlDsl.g:4129:1: rule__SwitchEqualsExpression__Group__0 : rule__SwitchEqualsExpression__Group__0__Impl rule__SwitchEqualsExpression__Group__1 ;
    public final void rule__SwitchEqualsExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4133:1: ( rule__SwitchEqualsExpression__Group__0__Impl rule__SwitchEqualsExpression__Group__1 )
            // InternalJqlDsl.g:4134:2: rule__SwitchEqualsExpression__Group__0__Impl rule__SwitchEqualsExpression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__SwitchEqualsExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group__0"


    // $ANTLR start "rule__SwitchEqualsExpression__Group__0__Impl"
    // InternalJqlDsl.g:4141:1: rule__SwitchEqualsExpression__Group__0__Impl : ( () ) ;
    public final void rule__SwitchEqualsExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4145:1: ( ( () ) )
            // InternalJqlDsl.g:4146:1: ( () )
            {
            // InternalJqlDsl.g:4146:1: ( () )
            // InternalJqlDsl.g:4147:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getSwitchEqualsExpressionAction_0()); 
            }
            // InternalJqlDsl.g:4148:2: ()
            // InternalJqlDsl.g:4148:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getSwitchEqualsExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchEqualsExpression__Group__0__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group__1"
    // InternalJqlDsl.g:4156:1: rule__SwitchEqualsExpression__Group__1 : rule__SwitchEqualsExpression__Group__1__Impl rule__SwitchEqualsExpression__Group__2 ;
    public final void rule__SwitchEqualsExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4160:1: ( rule__SwitchEqualsExpression__Group__1__Impl rule__SwitchEqualsExpression__Group__2 )
            // InternalJqlDsl.g:4161:2: rule__SwitchEqualsExpression__Group__1__Impl rule__SwitchEqualsExpression__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__SwitchEqualsExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group__1"


    // $ANTLR start "rule__SwitchEqualsExpression__Group__1__Impl"
    // InternalJqlDsl.g:4168:1: rule__SwitchEqualsExpression__Group__1__Impl : ( ( rule__SwitchEqualsExpression__Group_1__0 )* ) ;
    public final void rule__SwitchEqualsExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4172:1: ( ( ( rule__SwitchEqualsExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:4173:1: ( ( rule__SwitchEqualsExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:4173:1: ( ( rule__SwitchEqualsExpression__Group_1__0 )* )
            // InternalJqlDsl.g:4174:2: ( rule__SwitchEqualsExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:4175:2: ( rule__SwitchEqualsExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred54_InternalJqlDsl()) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==41) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred54_InternalJqlDsl()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalJqlDsl.g:4175:3: rule__SwitchEqualsExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SwitchEqualsExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group__1__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group__2"
    // InternalJqlDsl.g:4183:1: rule__SwitchEqualsExpression__Group__2 : rule__SwitchEqualsExpression__Group__2__Impl ;
    public final void rule__SwitchEqualsExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4187:1: ( rule__SwitchEqualsExpression__Group__2__Impl )
            // InternalJqlDsl.g:4188:2: rule__SwitchEqualsExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group__2"


    // $ANTLR start "rule__SwitchEqualsExpression__Group__2__Impl"
    // InternalJqlDsl.g:4194:1: rule__SwitchEqualsExpression__Group__2__Impl : ( ( rule__SwitchEqualsExpression__Group_2__0 )? ) ;
    public final void rule__SwitchEqualsExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4198:1: ( ( ( rule__SwitchEqualsExpression__Group_2__0 )? ) )
            // InternalJqlDsl.g:4199:1: ( ( rule__SwitchEqualsExpression__Group_2__0 )? )
            {
            // InternalJqlDsl.g:4199:1: ( ( rule__SwitchEqualsExpression__Group_2__0 )? )
            // InternalJqlDsl.g:4200:2: ( rule__SwitchEqualsExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:4201:2: ( rule__SwitchEqualsExpression__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred55_InternalJqlDsl()) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==43) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred55_InternalJqlDsl()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalJqlDsl.g:4201:3: rule__SwitchEqualsExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchEqualsExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group__2__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_1__0"
    // InternalJqlDsl.g:4210:1: rule__SwitchEqualsExpression__Group_1__0 : rule__SwitchEqualsExpression__Group_1__0__Impl rule__SwitchEqualsExpression__Group_1__1 ;
    public final void rule__SwitchEqualsExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4214:1: ( rule__SwitchEqualsExpression__Group_1__0__Impl rule__SwitchEqualsExpression__Group_1__1 )
            // InternalJqlDsl.g:4215:2: rule__SwitchEqualsExpression__Group_1__0__Impl rule__SwitchEqualsExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SwitchEqualsExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_1__0"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:4222:1: rule__SwitchEqualsExpression__Group_1__0__Impl : ( ( rule__SwitchEqualsExpression__Group_1_0__0 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4226:1: ( ( ( rule__SwitchEqualsExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:4227:1: ( ( rule__SwitchEqualsExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:4227:1: ( ( rule__SwitchEqualsExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:4228:2: ( rule__SwitchEqualsExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:4229:2: ( rule__SwitchEqualsExpression__Group_1_0__0 )
            // InternalJqlDsl.g:4229:3: rule__SwitchEqualsExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_1__1"
    // InternalJqlDsl.g:4237:1: rule__SwitchEqualsExpression__Group_1__1 : rule__SwitchEqualsExpression__Group_1__1__Impl ;
    public final void rule__SwitchEqualsExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4241:1: ( rule__SwitchEqualsExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:4242:2: rule__SwitchEqualsExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_1__1"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:4248:1: rule__SwitchEqualsExpression__Group_1__1__Impl : ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4252:1: ( ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4253:1: ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4253:1: ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) )
            // InternalJqlDsl.g:4254:2: ( rule__SwitchEqualsExpression__CasesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getCasesAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4255:2: ( rule__SwitchEqualsExpression__CasesAssignment_1_1 )
            // InternalJqlDsl.g:4255:3: rule__SwitchEqualsExpression__CasesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__CasesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getCasesAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_1_0__0"
    // InternalJqlDsl.g:4264:1: rule__SwitchEqualsExpression__Group_1_0__0 : rule__SwitchEqualsExpression__Group_1_0__0__Impl ;
    public final void rule__SwitchEqualsExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4268:1: ( rule__SwitchEqualsExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:4269:2: rule__SwitchEqualsExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_1_0__0"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_1_0__0__Impl"
    // InternalJqlDsl.g:4275:1: rule__SwitchEqualsExpression__Group_1_0__0__Impl : ( ( rule__SwitchEqualsExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4279:1: ( ( ( rule__SwitchEqualsExpression__Alternatives_1_0_0 ) ) )
            // InternalJqlDsl.g:4280:1: ( ( rule__SwitchEqualsExpression__Alternatives_1_0_0 ) )
            {
            // InternalJqlDsl.g:4280:1: ( ( rule__SwitchEqualsExpression__Alternatives_1_0_0 ) )
            // InternalJqlDsl.g:4281:2: ( rule__SwitchEqualsExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getAlternatives_1_0_0()); 
            }
            // InternalJqlDsl.g:4282:2: ( rule__SwitchEqualsExpression__Alternatives_1_0_0 )
            // InternalJqlDsl.g:4282:3: rule__SwitchEqualsExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getAlternatives_1_0_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2__0"
    // InternalJqlDsl.g:4291:1: rule__SwitchEqualsExpression__Group_2__0 : rule__SwitchEqualsExpression__Group_2__0__Impl rule__SwitchEqualsExpression__Group_2__1 ;
    public final void rule__SwitchEqualsExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4295:1: ( rule__SwitchEqualsExpression__Group_2__0__Impl rule__SwitchEqualsExpression__Group_2__1 )
            // InternalJqlDsl.g:4296:2: rule__SwitchEqualsExpression__Group_2__0__Impl rule__SwitchEqualsExpression__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__SwitchEqualsExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_2__0"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2__0__Impl"
    // InternalJqlDsl.g:4303:1: rule__SwitchEqualsExpression__Group_2__0__Impl : ( ( rule__SwitchEqualsExpression__Group_2_0__0 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4307:1: ( ( ( rule__SwitchEqualsExpression__Group_2_0__0 ) ) )
            // InternalJqlDsl.g:4308:1: ( ( rule__SwitchEqualsExpression__Group_2_0__0 ) )
            {
            // InternalJqlDsl.g:4308:1: ( ( rule__SwitchEqualsExpression__Group_2_0__0 ) )
            // InternalJqlDsl.g:4309:2: ( rule__SwitchEqualsExpression__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_2_0()); 
            }
            // InternalJqlDsl.g:4310:2: ( rule__SwitchEqualsExpression__Group_2_0__0 )
            // InternalJqlDsl.g:4310:3: rule__SwitchEqualsExpression__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_2_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_2_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_2__0__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2__1"
    // InternalJqlDsl.g:4318:1: rule__SwitchEqualsExpression__Group_2__1 : rule__SwitchEqualsExpression__Group_2__1__Impl ;
    public final void rule__SwitchEqualsExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4322:1: ( rule__SwitchEqualsExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:4323:2: rule__SwitchEqualsExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_2__1"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2__1__Impl"
    // InternalJqlDsl.g:4329:1: rule__SwitchEqualsExpression__Group_2__1__Impl : ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4333:1: ( ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) ) )
            // InternalJqlDsl.g:4334:1: ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:4334:1: ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) )
            // InternalJqlDsl.g:4335:2: ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getDefaultAssignment_2_1()); 
            }
            // InternalJqlDsl.g:4336:2: ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 )
            // InternalJqlDsl.g:4336:3: rule__SwitchEqualsExpression__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__DefaultAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getDefaultAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_2__1__Impl"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2_0__0"
    // InternalJqlDsl.g:4345:1: rule__SwitchEqualsExpression__Group_2_0__0 : rule__SwitchEqualsExpression__Group_2_0__0__Impl ;
    public final void rule__SwitchEqualsExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4349:1: ( rule__SwitchEqualsExpression__Group_2_0__0__Impl )
            // InternalJqlDsl.g:4350:2: rule__SwitchEqualsExpression__Group_2_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_2_0__0"


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2_0__0__Impl"
    // InternalJqlDsl.g:4356:1: rule__SwitchEqualsExpression__Group_2_0__0__Impl : ( ( rule__SwitchEqualsExpression__Alternatives_2_0_0 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4360:1: ( ( ( rule__SwitchEqualsExpression__Alternatives_2_0_0 ) ) )
            // InternalJqlDsl.g:4361:1: ( ( rule__SwitchEqualsExpression__Alternatives_2_0_0 ) )
            {
            // InternalJqlDsl.g:4361:1: ( ( rule__SwitchEqualsExpression__Alternatives_2_0_0 ) )
            // InternalJqlDsl.g:4362:2: ( rule__SwitchEqualsExpression__Alternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getAlternatives_2_0_0()); 
            }
            // InternalJqlDsl.g:4363:2: ( rule__SwitchEqualsExpression__Alternatives_2_0_0 )
            // InternalJqlDsl.g:4363:3: rule__SwitchEqualsExpression__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsExpression__Alternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getAlternatives_2_0_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__Group_2_0__0__Impl"


    // $ANTLR start "rule__SwitchEqualsCase__Group__0"
    // InternalJqlDsl.g:4372:1: rule__SwitchEqualsCase__Group__0 : rule__SwitchEqualsCase__Group__0__Impl rule__SwitchEqualsCase__Group__1 ;
    public final void rule__SwitchEqualsCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4376:1: ( rule__SwitchEqualsCase__Group__0__Impl rule__SwitchEqualsCase__Group__1 )
            // InternalJqlDsl.g:4377:2: rule__SwitchEqualsCase__Group__0__Impl rule__SwitchEqualsCase__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SwitchEqualsCase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__0"


    // $ANTLR start "rule__SwitchEqualsCase__Group__0__Impl"
    // InternalJqlDsl.g:4384:1: rule__SwitchEqualsCase__Group__0__Impl : ( () ) ;
    public final void rule__SwitchEqualsCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4388:1: ( ( () ) )
            // InternalJqlDsl.g:4389:1: ( () )
            {
            // InternalJqlDsl.g:4389:1: ( () )
            // InternalJqlDsl.g:4390:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getSwitchEqualsCaseAction_0()); 
            }
            // InternalJqlDsl.g:4391:2: ()
            // InternalJqlDsl.g:4391:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getSwitchEqualsCaseAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchEqualsCase__Group__0__Impl"


    // $ANTLR start "rule__SwitchEqualsCase__Group__1"
    // InternalJqlDsl.g:4399:1: rule__SwitchEqualsCase__Group__1 : rule__SwitchEqualsCase__Group__1__Impl rule__SwitchEqualsCase__Group__2 ;
    public final void rule__SwitchEqualsCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4403:1: ( rule__SwitchEqualsCase__Group__1__Impl rule__SwitchEqualsCase__Group__2 )
            // InternalJqlDsl.g:4404:2: rule__SwitchEqualsCase__Group__1__Impl rule__SwitchEqualsCase__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SwitchEqualsCase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__1"


    // $ANTLR start "rule__SwitchEqualsCase__Group__1__Impl"
    // InternalJqlDsl.g:4411:1: rule__SwitchEqualsCase__Group__1__Impl : ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) ) ;
    public final void rule__SwitchEqualsCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4415:1: ( ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) ) )
            // InternalJqlDsl.g:4416:1: ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) )
            {
            // InternalJqlDsl.g:4416:1: ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) )
            // InternalJqlDsl.g:4417:2: ( rule__SwitchEqualsCase__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getConditionAssignment_1()); 
            }
            // InternalJqlDsl.g:4418:2: ( rule__SwitchEqualsCase__ConditionAssignment_1 )
            // InternalJqlDsl.g:4418:3: rule__SwitchEqualsCase__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getConditionAssignment_1()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__1__Impl"


    // $ANTLR start "rule__SwitchEqualsCase__Group__2"
    // InternalJqlDsl.g:4426:1: rule__SwitchEqualsCase__Group__2 : rule__SwitchEqualsCase__Group__2__Impl rule__SwitchEqualsCase__Group__3 ;
    public final void rule__SwitchEqualsCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4430:1: ( rule__SwitchEqualsCase__Group__2__Impl rule__SwitchEqualsCase__Group__3 )
            // InternalJqlDsl.g:4431:2: rule__SwitchEqualsCase__Group__2__Impl rule__SwitchEqualsCase__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__SwitchEqualsCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__2"


    // $ANTLR start "rule__SwitchEqualsCase__Group__2__Impl"
    // InternalJqlDsl.g:4438:1: rule__SwitchEqualsCase__Group__2__Impl : ( ( rule__SwitchEqualsCase__Alternatives_2 ) ) ;
    public final void rule__SwitchEqualsCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4442:1: ( ( ( rule__SwitchEqualsCase__Alternatives_2 ) ) )
            // InternalJqlDsl.g:4443:1: ( ( rule__SwitchEqualsCase__Alternatives_2 ) )
            {
            // InternalJqlDsl.g:4443:1: ( ( rule__SwitchEqualsCase__Alternatives_2 ) )
            // InternalJqlDsl.g:4444:2: ( rule__SwitchEqualsCase__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getAlternatives_2()); 
            }
            // InternalJqlDsl.g:4445:2: ( rule__SwitchEqualsCase__Alternatives_2 )
            // InternalJqlDsl.g:4445:3: rule__SwitchEqualsCase__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getAlternatives_2()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__2__Impl"


    // $ANTLR start "rule__SwitchEqualsCase__Group__3"
    // InternalJqlDsl.g:4453:1: rule__SwitchEqualsCase__Group__3 : rule__SwitchEqualsCase__Group__3__Impl ;
    public final void rule__SwitchEqualsCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4457:1: ( rule__SwitchEqualsCase__Group__3__Impl )
            // InternalJqlDsl.g:4458:2: rule__SwitchEqualsCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__3"


    // $ANTLR start "rule__SwitchEqualsCase__Group__3__Impl"
    // InternalJqlDsl.g:4464:1: rule__SwitchEqualsCase__Group__3__Impl : ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) ) ;
    public final void rule__SwitchEqualsCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4468:1: ( ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) ) )
            // InternalJqlDsl.g:4469:1: ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) )
            {
            // InternalJqlDsl.g:4469:1: ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) )
            // InternalJqlDsl.g:4470:2: ( rule__SwitchEqualsCase__ResultAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getResultAssignment_3()); 
            }
            // InternalJqlDsl.g:4471:2: ( rule__SwitchEqualsCase__ResultAssignment_3 )
            // InternalJqlDsl.g:4471:3: rule__SwitchEqualsCase__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SwitchEqualsCase__ResultAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getResultAssignment_3()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsCase__Group__3__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalJqlDsl.g:4480:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4484:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalJqlDsl.g:4485:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // InternalJqlDsl.g:4492:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4496:1: ( ( () ) )
            // InternalJqlDsl.g:4497:1: ( () )
            {
            // InternalJqlDsl.g:4497:1: ( () )
            // InternalJqlDsl.g:4498:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4499:2: ()
            // InternalJqlDsl.g:4499:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // InternalJqlDsl.g:4507:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4511:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalJqlDsl.g:4512:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // InternalJqlDsl.g:4518:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4522:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalJqlDsl.g:4523:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalJqlDsl.g:4523:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalJqlDsl.g:4524:2: ( rule__BooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalJqlDsl.g:4525:2: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalJqlDsl.g:4525:3: rule__BooleanLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_0__0"
    // InternalJqlDsl.g:4534:1: rule__NumberLiteral__Group_0__0 : rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 ;
    public final void rule__NumberLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4538:1: ( rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 )
            // InternalJqlDsl.g:4539:2: rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__NumberLiteral__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumberLiteral__Group_0__0"


    // $ANTLR start "rule__NumberLiteral__Group_0__0__Impl"
    // InternalJqlDsl.g:4546:1: rule__NumberLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4550:1: ( ( () ) )
            // InternalJqlDsl.g:4551:1: ( () )
            {
            // InternalJqlDsl.g:4551:1: ( () )
            // InternalJqlDsl.g:4552:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getIntegerLiteralAction_0_0()); 
            }
            // InternalJqlDsl.g:4553:2: ()
            // InternalJqlDsl.g:4553:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getIntegerLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_0__1"
    // InternalJqlDsl.g:4561:1: rule__NumberLiteral__Group_0__1 : rule__NumberLiteral__Group_0__1__Impl ;
    public final void rule__NumberLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4565:1: ( rule__NumberLiteral__Group_0__1__Impl )
            // InternalJqlDsl.g:4566:2: rule__NumberLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumberLiteral__Group_0__1"


    // $ANTLR start "rule__NumberLiteral__Group_0__1__Impl"
    // InternalJqlDsl.g:4572:1: rule__NumberLiteral__Group_0__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__NumberLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4576:1: ( ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDsl.g:4577:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:4577:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDsl.g:4578:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDsl.g:4579:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            // InternalJqlDsl.g:4579:3: rule__NumberLiteral__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__NumberLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_1__0"
    // InternalJqlDsl.g:4588:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4592:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalJqlDsl.g:4593:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__NumberLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumberLiteral__Group_1__0"


    // $ANTLR start "rule__NumberLiteral__Group_1__0__Impl"
    // InternalJqlDsl.g:4600:1: rule__NumberLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4604:1: ( ( () ) )
            // InternalJqlDsl.g:4605:1: ( () )
            {
            // InternalJqlDsl.g:4605:1: ( () )
            // InternalJqlDsl.g:4606:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getDecimalLiteralAction_1_0()); 
            }
            // InternalJqlDsl.g:4607:2: ()
            // InternalJqlDsl.g:4607:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getDecimalLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_1__1"
    // InternalJqlDsl.g:4615:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4619:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalJqlDsl.g:4620:2: rule__NumberLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumberLiteral__Group_1__1"


    // $ANTLR start "rule__NumberLiteral__Group_1__1__Impl"
    // InternalJqlDsl.g:4626:1: rule__NumberLiteral__Group_1__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4630:1: ( ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4631:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4631:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDsl.g:4632:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4633:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            // InternalJqlDsl.g:4633:3: rule__NumberLiteral__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__NumberLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // InternalJqlDsl.g:4642:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4646:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // InternalJqlDsl.g:4647:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // InternalJqlDsl.g:4654:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4658:1: ( ( () ) )
            // InternalJqlDsl.g:4659:1: ( () )
            {
            // InternalJqlDsl.g:4659:1: ( () )
            // InternalJqlDsl.g:4660:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4661:2: ()
            // InternalJqlDsl.g:4661:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // InternalJqlDsl.g:4669:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4673:1: ( rule__StringLiteral__Group__1__Impl )
            // InternalJqlDsl.g:4674:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // InternalJqlDsl.g:4680:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4684:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDsl.g:4685:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDsl.g:4685:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // InternalJqlDsl.g:4686:2: ( rule__StringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDsl.g:4687:2: ( rule__StringLiteral__ValueAssignment_1 )
            // InternalJqlDsl.g:4687:3: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            }

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
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__TemporalLiteral__Group_0__0"
    // InternalJqlDsl.g:4696:1: rule__TemporalLiteral__Group_0__0 : rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 ;
    public final void rule__TemporalLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4700:1: ( rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 )
            // InternalJqlDsl.g:4701:2: rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__TemporalLiteral__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TemporalLiteral__Group_0__0"


    // $ANTLR start "rule__TemporalLiteral__Group_0__0__Impl"
    // InternalJqlDsl.g:4708:1: rule__TemporalLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4712:1: ( ( () ) )
            // InternalJqlDsl.g:4713:1: ( () )
            {
            // InternalJqlDsl.g:4713:1: ( () )
            // InternalJqlDsl.g:4714:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getDateLiteralAction_0_0()); 
            }
            // InternalJqlDsl.g:4715:2: ()
            // InternalJqlDsl.g:4715:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getDateLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__TemporalLiteral__Group_0__1"
    // InternalJqlDsl.g:4723:1: rule__TemporalLiteral__Group_0__1 : rule__TemporalLiteral__Group_0__1__Impl ;
    public final void rule__TemporalLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4727:1: ( rule__TemporalLiteral__Group_0__1__Impl )
            // InternalJqlDsl.g:4728:2: rule__TemporalLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TemporalLiteral__Group_0__1"


    // $ANTLR start "rule__TemporalLiteral__Group_0__1__Impl"
    // InternalJqlDsl.g:4734:1: rule__TemporalLiteral__Group_0__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__TemporalLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4738:1: ( ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDsl.g:4739:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:4739:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDsl.g:4740:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDsl.g:4741:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            // InternalJqlDsl.g:4741:3: rule__TemporalLiteral__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getValueAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__TemporalLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__TemporalLiteral__Group_1__0"
    // InternalJqlDsl.g:4750:1: rule__TemporalLiteral__Group_1__0 : rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 ;
    public final void rule__TemporalLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4754:1: ( rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 )
            // InternalJqlDsl.g:4755:2: rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__TemporalLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TemporalLiteral__Group_1__0"


    // $ANTLR start "rule__TemporalLiteral__Group_1__0__Impl"
    // InternalJqlDsl.g:4762:1: rule__TemporalLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4766:1: ( ( () ) )
            // InternalJqlDsl.g:4767:1: ( () )
            {
            // InternalJqlDsl.g:4767:1: ( () )
            // InternalJqlDsl.g:4768:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getTimeStampLiteralAction_1_0()); 
            }
            // InternalJqlDsl.g:4769:2: ()
            // InternalJqlDsl.g:4769:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getTimeStampLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__TemporalLiteral__Group_1__1"
    // InternalJqlDsl.g:4777:1: rule__TemporalLiteral__Group_1__1 : rule__TemporalLiteral__Group_1__1__Impl ;
    public final void rule__TemporalLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4781:1: ( rule__TemporalLiteral__Group_1__1__Impl )
            // InternalJqlDsl.g:4782:2: rule__TemporalLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TemporalLiteral__Group_1__1"


    // $ANTLR start "rule__TemporalLiteral__Group_1__1__Impl"
    // InternalJqlDsl.g:4788:1: rule__TemporalLiteral__Group_1__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__TemporalLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4792:1: ( ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4793:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4793:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDsl.g:4794:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4795:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            // InternalJqlDsl.g:4795:3: rule__TemporalLiteral__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalLiteral__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getValueAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__TemporalLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group__0"
    // InternalJqlDsl.g:4804:1: rule__MeasuredLiteral__Group__0 : rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 ;
    public final void rule__MeasuredLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4808:1: ( rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 )
            // InternalJqlDsl.g:4809:2: rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MeasuredLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MeasuredLiteral__Group__0"


    // $ANTLR start "rule__MeasuredLiteral__Group__0__Impl"
    // InternalJqlDsl.g:4816:1: rule__MeasuredLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MeasuredLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4820:1: ( ( () ) )
            // InternalJqlDsl.g:4821:1: ( () )
            {
            // InternalJqlDsl.g:4821:1: ( () )
            // InternalJqlDsl.g:4822:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasuredLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4823:2: ()
            // InternalJqlDsl.g:4823:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getMeasuredLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group__0__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group__1"
    // InternalJqlDsl.g:4831:1: rule__MeasuredLiteral__Group__1 : rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 ;
    public final void rule__MeasuredLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4835:1: ( rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 )
            // InternalJqlDsl.g:4836:2: rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__MeasuredLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MeasuredLiteral__Group__1"


    // $ANTLR start "rule__MeasuredLiteral__Group__1__Impl"
    // InternalJqlDsl.g:4843:1: rule__MeasuredLiteral__Group__1__Impl : ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MeasuredLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4847:1: ( ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDsl.g:4848:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDsl.g:4848:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            // InternalJqlDsl.g:4849:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDsl.g:4850:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            // InternalJqlDsl.g:4850:3: rule__MeasuredLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getValueAssignment_1()); 
            }

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
    // $ANTLR end "rule__MeasuredLiteral__Group__1__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group__2"
    // InternalJqlDsl.g:4858:1: rule__MeasuredLiteral__Group__2 : rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 ;
    public final void rule__MeasuredLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4862:1: ( rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 )
            // InternalJqlDsl.g:4863:2: rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MeasuredLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MeasuredLiteral__Group__2"


    // $ANTLR start "rule__MeasuredLiteral__Group__2__Impl"
    // InternalJqlDsl.g:4870:1: rule__MeasuredLiteral__Group__2__Impl : ( '[' ) ;
    public final void rule__MeasuredLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4874:1: ( ( '[' ) )
            // InternalJqlDsl.g:4875:1: ( '[' )
            {
            // InternalJqlDsl.g:4875:1: ( '[' )
            // InternalJqlDsl.g:4876:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getLeftSquareBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__MeasuredLiteral__Group__2__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group__3"
    // InternalJqlDsl.g:4885:1: rule__MeasuredLiteral__Group__3 : rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 ;
    public final void rule__MeasuredLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4889:1: ( rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 )
            // InternalJqlDsl.g:4890:2: rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__MeasuredLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MeasuredLiteral__Group__3"


    // $ANTLR start "rule__MeasuredLiteral__Group__3__Impl"
    // InternalJqlDsl.g:4897:1: rule__MeasuredLiteral__Group__3__Impl : ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) ) ;
    public final void rule__MeasuredLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4901:1: ( ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) ) )
            // InternalJqlDsl.g:4902:1: ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) )
            {
            // InternalJqlDsl.g:4902:1: ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) )
            // InternalJqlDsl.g:4903:2: ( rule__MeasuredLiteral__MeasureAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasureAssignment_3()); 
            }
            // InternalJqlDsl.g:4904:2: ( rule__MeasuredLiteral__MeasureAssignment_3 )
            // InternalJqlDsl.g:4904:3: rule__MeasuredLiteral__MeasureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__MeasureAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getMeasureAssignment_3()); 
            }

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
    // $ANTLR end "rule__MeasuredLiteral__Group__3__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group__4"
    // InternalJqlDsl.g:4912:1: rule__MeasuredLiteral__Group__4 : rule__MeasuredLiteral__Group__4__Impl ;
    public final void rule__MeasuredLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4916:1: ( rule__MeasuredLiteral__Group__4__Impl )
            // InternalJqlDsl.g:4917:2: rule__MeasuredLiteral__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MeasuredLiteral__Group__4"


    // $ANTLR start "rule__MeasuredLiteral__Group__4__Impl"
    // InternalJqlDsl.g:4923:1: rule__MeasuredLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__MeasuredLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4927:1: ( ( ']' ) )
            // InternalJqlDsl.g:4928:1: ( ']' )
            {
            // InternalJqlDsl.g:4928:1: ( ']' )
            // InternalJqlDsl.g:4929:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getRightSquareBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__MeasuredLiteral__Group__4__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__0"
    // InternalJqlDsl.g:4939:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4943:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalJqlDsl.g:4944:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__EnumLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EnumLiteral__Group__0"


    // $ANTLR start "rule__EnumLiteral__Group__0__Impl"
    // InternalJqlDsl.g:4951:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4955:1: ( ( () ) )
            // InternalJqlDsl.g:4956:1: ( () )
            {
            // InternalJqlDsl.g:4956:1: ( () )
            // InternalJqlDsl.g:4957:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4958:2: ()
            // InternalJqlDsl.g:4958:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__1"
    // InternalJqlDsl.g:4966:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4970:1: ( rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 )
            // InternalJqlDsl.g:4971:2: rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EnumLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EnumLiteral__Group__1"


    // $ANTLR start "rule__EnumLiteral__Group__1__Impl"
    // InternalJqlDsl.g:4978:1: rule__EnumLiteral__Group__1__Impl : ( '`' ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4982:1: ( ( '`' ) )
            // InternalJqlDsl.g:4983:1: ( '`' )
            {
            // InternalJqlDsl.g:4983:1: ( '`' )
            // InternalJqlDsl.g:4984:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGraveAccentKeyword_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getGraveAccentKeyword_1()); 
            }

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
    // $ANTLR end "rule__EnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__2"
    // InternalJqlDsl.g:4993:1: rule__EnumLiteral__Group__2 : rule__EnumLiteral__Group__2__Impl ;
    public final void rule__EnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4997:1: ( rule__EnumLiteral__Group__2__Impl )
            // InternalJqlDsl.g:4998:2: rule__EnumLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EnumLiteral__Group__2"


    // $ANTLR start "rule__EnumLiteral__Group__2__Impl"
    // InternalJqlDsl.g:5004:1: rule__EnumLiteral__Group__2__Impl : ( ( rule__EnumLiteral__ValueAssignment_2 ) ) ;
    public final void rule__EnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5008:1: ( ( ( rule__EnumLiteral__ValueAssignment_2 ) ) )
            // InternalJqlDsl.g:5009:1: ( ( rule__EnumLiteral__ValueAssignment_2 ) )
            {
            // InternalJqlDsl.g:5009:1: ( ( rule__EnumLiteral__ValueAssignment_2 ) )
            // InternalJqlDsl.g:5010:2: ( rule__EnumLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getValueAssignment_2()); 
            }
            // InternalJqlDsl.g:5011:2: ( rule__EnumLiteral__ValueAssignment_2 )
            // InternalJqlDsl.g:5011:3: rule__EnumLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getValueAssignment_2()); 
            }

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
    // $ANTLR end "rule__EnumLiteral__Group__2__Impl"


    // $ANTLR start "rule__NavigationExpression__Group__0"
    // InternalJqlDsl.g:5020:1: rule__NavigationExpression__Group__0 : rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5024:1: ( rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 )
            // InternalJqlDsl.g:5025:2: rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__NavigationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group__0"


    // $ANTLR start "rule__NavigationExpression__Group__0__Impl"
    // InternalJqlDsl.g:5032:1: rule__NavigationExpression__Group__0__Impl : ( ( rule__NavigationExpression__BaseAssignment_0 ) ) ;
    public final void rule__NavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5036:1: ( ( ( rule__NavigationExpression__BaseAssignment_0 ) ) )
            // InternalJqlDsl.g:5037:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            {
            // InternalJqlDsl.g:5037:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            // InternalJqlDsl.g:5038:2: ( rule__NavigationExpression__BaseAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getBaseAssignment_0()); 
            }
            // InternalJqlDsl.g:5039:2: ( rule__NavigationExpression__BaseAssignment_0 )
            // InternalJqlDsl.g:5039:3: rule__NavigationExpression__BaseAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__BaseAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getBaseAssignment_0()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group__0__Impl"


    // $ANTLR start "rule__NavigationExpression__Group__1"
    // InternalJqlDsl.g:5047:1: rule__NavigationExpression__Group__1 : rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5051:1: ( rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 )
            // InternalJqlDsl.g:5052:2: rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__NavigationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group__1"


    // $ANTLR start "rule__NavigationExpression__Group__1__Impl"
    // InternalJqlDsl.g:5059:1: rule__NavigationExpression__Group__1__Impl : ( ( rule__NavigationExpression__Group_1__0 )* ) ;
    public final void rule__NavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5063:1: ( ( ( rule__NavigationExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:5064:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:5064:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            // InternalJqlDsl.g:5065:2: ( rule__NavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:5066:2: ( rule__NavigationExpression__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==55) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalJqlDsl.g:5066:3: rule__NavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__NavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group__1__Impl"


    // $ANTLR start "rule__NavigationExpression__Group__2"
    // InternalJqlDsl.g:5074:1: rule__NavigationExpression__Group__2 : rule__NavigationExpression__Group__2__Impl ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5078:1: ( rule__NavigationExpression__Group__2__Impl )
            // InternalJqlDsl.g:5079:2: rule__NavigationExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group__2"


    // $ANTLR start "rule__NavigationExpression__Group__2__Impl"
    // InternalJqlDsl.g:5085:1: rule__NavigationExpression__Group__2__Impl : ( ( rule__NavigationExpression__Group_2__0 )? ) ;
    public final void rule__NavigationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5089:1: ( ( ( rule__NavigationExpression__Group_2__0 )? ) )
            // InternalJqlDsl.g:5090:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            {
            // InternalJqlDsl.g:5090:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            // InternalJqlDsl.g:5091:2: ( rule__NavigationExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:5092:2: ( rule__NavigationExpression__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJqlDsl.g:5092:3: rule__NavigationExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group__2__Impl"


    // $ANTLR start "rule__NavigationExpression__Group_1__0"
    // InternalJqlDsl.g:5101:1: rule__NavigationExpression__Group_1__0 : rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 ;
    public final void rule__NavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5105:1: ( rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 )
            // InternalJqlDsl.g:5106:2: rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__NavigationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group_1__0"


    // $ANTLR start "rule__NavigationExpression__Group_1__0__Impl"
    // InternalJqlDsl.g:5113:1: rule__NavigationExpression__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__NavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5117:1: ( ( ( '.' ) ) )
            // InternalJqlDsl.g:5118:1: ( ( '.' ) )
            {
            // InternalJqlDsl.g:5118:1: ( ( '.' ) )
            // InternalJqlDsl.g:5119:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFullStopKeyword_1_0()); 
            }
            // InternalJqlDsl.g:5120:2: ( '.' )
            // InternalJqlDsl.g:5120:3: '.'
            {
            match(input,55,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NavigationExpression__Group_1__1"
    // InternalJqlDsl.g:5128:1: rule__NavigationExpression__Group_1__1 : rule__NavigationExpression__Group_1__1__Impl ;
    public final void rule__NavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5132:1: ( rule__NavigationExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:5133:2: rule__NavigationExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group_1__1"


    // $ANTLR start "rule__NavigationExpression__Group_1__1__Impl"
    // InternalJqlDsl.g:5139:1: rule__NavigationExpression__Group_1__1__Impl : ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) ;
    public final void rule__NavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5143:1: ( ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) )
            // InternalJqlDsl.g:5144:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:5144:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            // InternalJqlDsl.g:5145:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFeaturesAssignment_1_1()); 
            }
            // InternalJqlDsl.g:5146:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            // InternalJqlDsl.g:5146:3: rule__NavigationExpression__FeaturesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__FeaturesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getFeaturesAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NavigationExpression__Group_2__0"
    // InternalJqlDsl.g:5155:1: rule__NavigationExpression__Group_2__0 : rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 ;
    public final void rule__NavigationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5159:1: ( rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 )
            // InternalJqlDsl.g:5160:2: rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__NavigationExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group_2__0"


    // $ANTLR start "rule__NavigationExpression__Group_2__0__Impl"
    // InternalJqlDsl.g:5167:1: rule__NavigationExpression__Group_2__0__Impl : ( '@' ) ;
    public final void rule__NavigationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5171:1: ( ( '@' ) )
            // InternalJqlDsl.g:5172:1: ( '@' )
            {
            // InternalJqlDsl.g:5172:1: ( '@' )
            // InternalJqlDsl.g:5173:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getCommercialAtKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group_2__0__Impl"


    // $ANTLR start "rule__NavigationExpression__Group_2__1"
    // InternalJqlDsl.g:5182:1: rule__NavigationExpression__Group_2__1 : rule__NavigationExpression__Group_2__1__Impl ;
    public final void rule__NavigationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5186:1: ( rule__NavigationExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:5187:2: rule__NavigationExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NavigationExpression__Group_2__1"


    // $ANTLR start "rule__NavigationExpression__Group_2__1__Impl"
    // InternalJqlDsl.g:5193:1: rule__NavigationExpression__Group_2__1__Impl : ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) ;
    public final void rule__NavigationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5197:1: ( ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) )
            // InternalJqlDsl.g:5198:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:5198:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            // InternalJqlDsl.g:5199:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCastAssignment_2_1()); 
            }
            // InternalJqlDsl.g:5200:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            // InternalJqlDsl.g:5200:3: rule__NavigationExpression__CastAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigationExpression__CastAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getCastAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalJqlDsl.g:5209:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5213:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalJqlDsl.g:5214:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalJqlDsl.g:5221:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5225:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:5226:1: ( RULE_ID )
            {
            // InternalJqlDsl.g:5226:1: ( RULE_ID )
            // InternalJqlDsl.g:5227:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalJqlDsl.g:5236:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5240:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalJqlDsl.g:5241:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalJqlDsl.g:5247:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5251:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalJqlDsl.g:5252:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalJqlDsl.g:5252:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalJqlDsl.g:5253:2: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalJqlDsl.g:5253:2: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalJqlDsl.g:5254:3: ( rule__QualifiedName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:5255:3: ( rule__QualifiedName__Group_1__0 )
            // InternalJqlDsl.g:5255:4: rule__QualifiedName__Group_1__0
            {
            pushFollow(FOLLOW_46);
            rule__QualifiedName__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }

            // InternalJqlDsl.g:5258:2: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalJqlDsl.g:5259:3: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:5260:3: ( rule__QualifiedName__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==57) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalJqlDsl.g:5260:4: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalJqlDsl.g:5270:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5274:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalJqlDsl.g:5275:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalJqlDsl.g:5282:1: rule__QualifiedName__Group_1__0__Impl : ( ( '::' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5286:1: ( ( ( '::' ) ) )
            // InternalJqlDsl.g:5287:1: ( ( '::' ) )
            {
            // InternalJqlDsl.g:5287:1: ( ( '::' ) )
            // InternalJqlDsl.g:5288:2: ( '::' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            // InternalJqlDsl.g:5289:2: ( '::' )
            // InternalJqlDsl.g:5289:3: '::'
            {
            match(input,57,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalJqlDsl.g:5297:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5301:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalJqlDsl.g:5302:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalJqlDsl.g:5308:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5312:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:5313:1: ( RULE_ID )
            {
            // InternalJqlDsl.g:5313:1: ( RULE_ID )
            // InternalJqlDsl.g:5314:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ConcatenateExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDsl.g:5324:1: rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 : ( ruleOpConcat ) ;
    public final void rule__ConcatenateExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5328:1: ( ( ruleOpConcat ) )
            // InternalJqlDsl.g:5329:2: ( ruleOpConcat )
            {
            // InternalJqlDsl.g:5329:2: ( ruleOpConcat )
            // InternalJqlDsl.g:5330:3: ruleOpConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getOperatorOpConcatParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getOperatorOpConcatParserRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__ConcatenateExpression__RightOperandAssignment_1_1"
    // InternalJqlDsl.g:5339:1: rule__ConcatenateExpression__RightOperandAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__ConcatenateExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5343:1: ( ( ruleOrExpression ) )
            // InternalJqlDsl.g:5344:2: ( ruleOrExpression )
            {
            // InternalJqlDsl.g:5344:2: ( ruleOrExpression )
            // InternalJqlDsl.g:5345:3: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getRightOperandOrExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcatenateExpressionAccess().getRightOperandOrExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ConcatenateExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDsl.g:5354:1: rule__OrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__OrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5358:1: ( ( ruleOpOr ) )
            // InternalJqlDsl.g:5359:2: ( ruleOpOr )
            {
            // InternalJqlDsl.g:5359:2: ( ruleOpOr )
            // InternalJqlDsl.g:5360:3: ruleOpOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOpOrParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorOpOrParserRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__OrExpression__RightOperandAssignment_1_1"
    // InternalJqlDsl.g:5369:1: rule__OrExpression__RightOperandAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5373:1: ( ( ruleAndExpression ) )
            // InternalJqlDsl.g:5374:2: ( ruleAndExpression )
            {
            // InternalJqlDsl.g:5374:2: ( ruleAndExpression )
            // InternalJqlDsl.g:5375:3: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDsl.g:5384:1: rule__AndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__AndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5388:1: ( ( ruleOpAnd ) )
            // InternalJqlDsl.g:5389:2: ( ruleOpAnd )
            {
            // InternalJqlDsl.g:5389:2: ( ruleOpAnd )
            // InternalJqlDsl.g:5390:3: ruleOpAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorOpAndParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorOpAndParserRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__AndExpression__RightOperandAssignment_1_1"
    // InternalJqlDsl.g:5399:1: rule__AndExpression__RightOperandAssignment_1_1 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5403:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDsl.g:5404:2: ( ruleEqualityExpression )
            {
            // InternalJqlDsl.g:5404:2: ( ruleEqualityExpression )
            // InternalJqlDsl.g:5405:3: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightOperandEqualityExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightOperandEqualityExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDsl.g:5414:1: rule__EqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5418:1: ( ( ruleOpEquality ) )
            // InternalJqlDsl.g:5419:2: ( ruleOpEquality )
            {
            // InternalJqlDsl.g:5419:2: ( ruleOpEquality )
            // InternalJqlDsl.g:5420:3: ruleOpEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorOpEqualityParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOperatorOpEqualityParserRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__EqualityExpression__RightOperandAssignment_1_1"
    // InternalJqlDsl.g:5429:1: rule__EqualityExpression__RightOperandAssignment_1_1 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5433:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:5434:2: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:5434:2: ( ruleRelationalExpression )
            // InternalJqlDsl.g:5435:3: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightOperandRelationalExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRightOperandRelationalExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDsl.g:5444:1: rule__RelationalExpression__OperatorAssignment_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5448:1: ( ( ruleOpCompare ) )
            // InternalJqlDsl.g:5449:2: ( ruleOpCompare )
            {
            // InternalJqlDsl.g:5449:2: ( ruleOpCompare )
            // InternalJqlDsl.g:5450:3: ruleOpCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorOpCompareParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOperatorOpCompareParserRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__RelationalExpression__RightOperandAssignment_1_1"
    // InternalJqlDsl.g:5459:1: rule__RelationalExpression__RightOperandAssignment_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5463:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDsl.g:5464:2: ( ruleAdditiveExpression )
            {
            // InternalJqlDsl.g:5464:2: ( ruleAdditiveExpression )
            // InternalJqlDsl.g:5465:3: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDsl.g:5474:1: rule__AdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5478:1: ( ( ruleOpAdd ) )
            // InternalJqlDsl.g:5479:2: ( ruleOpAdd )
            {
            // InternalJqlDsl.g:5479:2: ( ruleOpAdd )
            // InternalJqlDsl.g:5480:3: ruleOpAdd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorOpAddParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpAdd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOperatorOpAddParserRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__AdditiveExpression__RightOperandAssignment_1_1"
    // InternalJqlDsl.g:5489:1: rule__AdditiveExpression__RightOperandAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5493:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDsl.g:5494:2: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDsl.g:5494:2: ( ruleMultiplicativeExpression )
            // InternalJqlDsl.g:5495:3: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__FunctionsAssignment_1_1"
    // InternalJqlDsl.g:5504:1: rule__MultiplicativeExpression__FunctionsAssignment_1_1 : ( ruleFunction ) ;
    public final void rule__MultiplicativeExpression__FunctionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5508:1: ( ( ruleFunction ) )
            // InternalJqlDsl.g:5509:2: ( ruleFunction )
            {
            // InternalJqlDsl.g:5509:2: ( ruleFunction )
            // InternalJqlDsl.g:5510:3: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionsFunctionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionsFunctionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__FunctionsAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1"
    // InternalJqlDsl.g:5519:1: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5523:1: ( ( ruleOpMulti ) )
            // InternalJqlDsl.g:5524:2: ( ruleOpMulti )
            {
            // InternalJqlDsl.g:5524:2: ( ruleOpMulti )
            // InternalJqlDsl.g:5525:3: ruleOpMulti
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorOpMultiParserRuleCall_2_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpMulti();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorOpMultiParserRuleCall_2_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightOperandAssignment_2_1"
    // InternalJqlDsl.g:5534:1: rule__MultiplicativeExpression__RightOperandAssignment_2_1 : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__RightOperandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5538:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:5539:2: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:5539:2: ( ruleUnaryOperation )
            // InternalJqlDsl.g:5540:3: ruleUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandUnaryOperationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandUnaryOperationParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__RightOperandAssignment_2_1"


    // $ANTLR start "rule__UnaryOperation__OperatorAssignment_0_1"
    // InternalJqlDsl.g:5549:1: rule__UnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5553:1: ( ( ruleOpUnary ) )
            // InternalJqlDsl.g:5554:2: ( ruleOpUnary )
            {
            // InternalJqlDsl.g:5554:2: ( ruleOpUnary )
            // InternalJqlDsl.g:5555:3: ruleOpUnary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorOpUnaryParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpUnary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperatorOpUnaryParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__OperatorAssignment_0_1"


    // $ANTLR start "rule__UnaryOperation__OperandAssignment_0_2"
    // InternalJqlDsl.g:5564:1: rule__UnaryOperation__OperandAssignment_0_2 : ( ruleUnaryOperation ) ;
    public final void rule__UnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5568:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:5569:2: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:5569:2: ( ruleUnaryOperation )
            // InternalJqlDsl.g:5570:3: ruleUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__OperandAssignment_0_2"


    // $ANTLR start "rule__LambdaExpression__ArgumentAssignment_1"
    // InternalJqlDsl.g:5579:1: rule__LambdaExpression__ArgumentAssignment_1 : ( ruleFeature ) ;
    public final void rule__LambdaExpression__ArgumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5583:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5584:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5584:2: ( ruleFeature )
            // InternalJqlDsl.g:5585:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getArgumentFeatureParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getArgumentFeatureParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__LambdaExpression__ArgumentAssignment_1"


    // $ANTLR start "rule__LambdaExpression__StatementAssignment_3"
    // InternalJqlDsl.g:5594:1: rule__LambdaExpression__StatementAssignment_3 : ( ruleExpression ) ;
    public final void rule__LambdaExpression__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5598:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5599:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5599:2: ( ruleExpression )
            // InternalJqlDsl.g:5600:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getStatementExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getStatementExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__LambdaExpression__StatementAssignment_3"


    // $ANTLR start "rule__Function__FeatureAssignment_1"
    // InternalJqlDsl.g:5609:1: rule__Function__FeatureAssignment_1 : ( ruleFeature ) ;
    public final void rule__Function__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5613:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5614:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5614:2: ( ruleFeature )
            // InternalJqlDsl.g:5615:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFeatureFeatureParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFeatureFeatureParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Function__FeatureAssignment_1"


    // $ANTLR start "rule__Function__LambdaAssignment_2_1_0"
    // InternalJqlDsl.g:5624:1: rule__Function__LambdaAssignment_2_1_0 : ( ruleLambdaExpression ) ;
    public final void rule__Function__LambdaAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5628:1: ( ( ruleLambdaExpression ) )
            // InternalJqlDsl.g:5629:2: ( ruleLambdaExpression )
            {
            // InternalJqlDsl.g:5629:2: ( ruleLambdaExpression )
            // InternalJqlDsl.g:5630:3: ruleLambdaExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLambdaLambdaExpressionParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLambdaExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLambdaLambdaExpressionParserRuleCall_2_1_0_0()); 
            }

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
    // $ANTLR end "rule__Function__LambdaAssignment_2_1_0"


    // $ANTLR start "rule__Function__ParametersAssignment_2_1_1_0"
    // InternalJqlDsl.g:5639:1: rule__Function__ParametersAssignment_2_1_1_0 : ( ruleExpression ) ;
    public final void rule__Function__ParametersAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5643:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5644:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5644:2: ( ruleExpression )
            // InternalJqlDsl.g:5645:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_2_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_2_1_1_0_0()); 
            }

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
    // $ANTLR end "rule__Function__ParametersAssignment_2_1_1_0"


    // $ANTLR start "rule__Function__ParametersAssignment_2_1_1_1_1"
    // InternalJqlDsl.g:5654:1: rule__Function__ParametersAssignment_2_1_1_1_1 : ( ruleExpression ) ;
    public final void rule__Function__ParametersAssignment_2_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5658:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5659:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5659:2: ( ruleExpression )
            // InternalJqlDsl.g:5660:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_2_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_2_1_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__Function__ParametersAssignment_2_1_1_1_1"


    // $ANTLR start "rule__SwitchExpression__OperandAssignment_2"
    // InternalJqlDsl.g:5669:1: rule__SwitchExpression__OperandAssignment_2 : ( ruleConcatenateExpression ) ;
    public final void rule__SwitchExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5673:1: ( ( ruleConcatenateExpression ) )
            // InternalJqlDsl.g:5674:2: ( ruleConcatenateExpression )
            {
            // InternalJqlDsl.g:5674:2: ( ruleConcatenateExpression )
            // InternalJqlDsl.g:5675:3: ruleConcatenateExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getOperandConcatenateExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConcatenateExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getOperandConcatenateExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__SwitchExpression__OperandAssignment_2"


    // $ANTLR start "rule__SwitchExpression__BodyAssignment_3"
    // InternalJqlDsl.g:5684:1: rule__SwitchExpression__BodyAssignment_3 : ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) ) ;
    public final void rule__SwitchExpression__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5688:1: ( ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) ) )
            // InternalJqlDsl.g:5689:2: ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) )
            {
            // InternalJqlDsl.g:5689:2: ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) )
            // InternalJqlDsl.g:5690:3: ( rule__SwitchExpression__BodyAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getBodyAlternatives_3_0()); 
            }
            // InternalJqlDsl.g:5691:3: ( rule__SwitchExpression__BodyAlternatives_3_0 )
            // InternalJqlDsl.g:5691:4: rule__SwitchExpression__BodyAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__BodyAlternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getBodyAlternatives_3_0()); 
            }

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
    // $ANTLR end "rule__SwitchExpression__BodyAssignment_3"


    // $ANTLR start "rule__SwitchConditionalExpression__AliasAssignment_2"
    // InternalJqlDsl.g:5699:1: rule__SwitchConditionalExpression__AliasAssignment_2 : ( ruleFeature ) ;
    public final void rule__SwitchConditionalExpression__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5703:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5704:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5704:2: ( ruleFeature )
            // InternalJqlDsl.g:5705:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getAliasFeatureParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getAliasFeatureParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__AliasAssignment_2"


    // $ANTLR start "rule__SwitchConditionalExpression__CasesAssignment_3_1"
    // InternalJqlDsl.g:5714:1: rule__SwitchConditionalExpression__CasesAssignment_3_1 : ( ruleSwitchConditionalCase ) ;
    public final void rule__SwitchConditionalExpression__CasesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5718:1: ( ( ruleSwitchConditionalCase ) )
            // InternalJqlDsl.g:5719:2: ( ruleSwitchConditionalCase )
            {
            // InternalJqlDsl.g:5719:2: ( ruleSwitchConditionalCase )
            // InternalJqlDsl.g:5720:3: ruleSwitchConditionalCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getCasesSwitchConditionalCaseParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchConditionalCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getCasesSwitchConditionalCaseParserRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__CasesAssignment_3_1"


    // $ANTLR start "rule__SwitchConditionalExpression__DefaultAssignment_4_1"
    // InternalJqlDsl.g:5729:1: rule__SwitchConditionalExpression__DefaultAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__SwitchConditionalExpression__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5733:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5734:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5734:2: ( ruleExpression )
            // InternalJqlDsl.g:5735:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getDefaultExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getDefaultExpressionParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalExpression__DefaultAssignment_4_1"


    // $ANTLR start "rule__SwitchConditionalCase__ConditionAssignment_1"
    // InternalJqlDsl.g:5744:1: rule__SwitchConditionalCase__ConditionAssignment_1 : ( ruleRelationalExpression ) ;
    public final void rule__SwitchConditionalCase__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5748:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:5749:2: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:5749:2: ( ruleRelationalExpression )
            // InternalJqlDsl.g:5750:3: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getConditionRelationalExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getConditionRelationalExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalCase__ConditionAssignment_1"


    // $ANTLR start "rule__SwitchConditionalCase__ResultAssignment_3"
    // InternalJqlDsl.g:5759:1: rule__SwitchConditionalCase__ResultAssignment_3 : ( ruleExpression ) ;
    public final void rule__SwitchConditionalCase__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5763:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5764:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5764:2: ( ruleExpression )
            // InternalJqlDsl.g:5765:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getResultExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getResultExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__SwitchConditionalCase__ResultAssignment_3"


    // $ANTLR start "rule__SwitchEqualsExpression__CasesAssignment_1_1"
    // InternalJqlDsl.g:5774:1: rule__SwitchEqualsExpression__CasesAssignment_1_1 : ( ruleSwitchEqualsCase ) ;
    public final void rule__SwitchEqualsExpression__CasesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5778:1: ( ( ruleSwitchEqualsCase ) )
            // InternalJqlDsl.g:5779:2: ( ruleSwitchEqualsCase )
            {
            // InternalJqlDsl.g:5779:2: ( ruleSwitchEqualsCase )
            // InternalJqlDsl.g:5780:3: ruleSwitchEqualsCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getCasesSwitchEqualsCaseParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchEqualsCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getCasesSwitchEqualsCaseParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__CasesAssignment_1_1"


    // $ANTLR start "rule__SwitchEqualsExpression__DefaultAssignment_2_1"
    // InternalJqlDsl.g:5789:1: rule__SwitchEqualsExpression__DefaultAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__SwitchEqualsExpression__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5793:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5794:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5794:2: ( ruleExpression )
            // InternalJqlDsl.g:5795:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getDefaultExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getDefaultExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsExpression__DefaultAssignment_2_1"


    // $ANTLR start "rule__SwitchEqualsCase__ConditionAssignment_1"
    // InternalJqlDsl.g:5804:1: rule__SwitchEqualsCase__ConditionAssignment_1 : ( ruleLiteral ) ;
    public final void rule__SwitchEqualsCase__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5808:1: ( ( ruleLiteral ) )
            // InternalJqlDsl.g:5809:2: ( ruleLiteral )
            {
            // InternalJqlDsl.g:5809:2: ( ruleLiteral )
            // InternalJqlDsl.g:5810:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getConditionLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getConditionLiteralParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsCase__ConditionAssignment_1"


    // $ANTLR start "rule__SwitchEqualsCase__ResultAssignment_3"
    // InternalJqlDsl.g:5819:1: rule__SwitchEqualsCase__ResultAssignment_3 : ( ruleExpression ) ;
    public final void rule__SwitchEqualsCase__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5823:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5824:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5824:2: ( ruleExpression )
            // InternalJqlDsl.g:5825:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getResultExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getResultExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__SwitchEqualsCase__ResultAssignment_3"


    // $ANTLR start "rule__BooleanLiteral__IsTrueAssignment_1_1"
    // InternalJqlDsl.g:5834:1: rule__BooleanLiteral__IsTrueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5838:1: ( ( ( 'true' ) ) )
            // InternalJqlDsl.g:5839:2: ( ( 'true' ) )
            {
            // InternalJqlDsl.g:5839:2: ( ( 'true' ) )
            // InternalJqlDsl.g:5840:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            // InternalJqlDsl.g:5841:3: ( 'true' )
            // InternalJqlDsl.g:5842:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__BooleanLiteral__IsTrueAssignment_1_1"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_0_1"
    // InternalJqlDsl.g:5853:1: rule__NumberLiteral__ValueAssignment_0_1 : ( RULE_INTEGER ) ;
    public final void rule__NumberLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5857:1: ( ( RULE_INTEGER ) )
            // InternalJqlDsl.g:5858:2: ( RULE_INTEGER )
            {
            // InternalJqlDsl.g:5858:2: ( RULE_INTEGER )
            // InternalJqlDsl.g:5859:3: RULE_INTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueINTEGERTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INTEGER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueINTEGERTerminalRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_0_1"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1_1"
    // InternalJqlDsl.g:5868:1: rule__NumberLiteral__ValueAssignment_1_1 : ( RULE_DECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5872:1: ( ( RULE_DECIMAL ) )
            // InternalJqlDsl.g:5873:2: ( RULE_DECIMAL )
            {
            // InternalJqlDsl.g:5873:2: ( RULE_DECIMAL )
            // InternalJqlDsl.g:5874:3: RULE_DECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueDECIMALTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueDECIMALTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // InternalJqlDsl.g:5883:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5887:1: ( ( RULE_STRING ) )
            // InternalJqlDsl.g:5888:2: ( RULE_STRING )
            {
            // InternalJqlDsl.g:5888:2: ( RULE_STRING )
            // InternalJqlDsl.g:5889:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"


    // $ANTLR start "rule__TemporalLiteral__ValueAssignment_0_1"
    // InternalJqlDsl.g:5898:1: rule__TemporalLiteral__ValueAssignment_0_1 : ( RULE_DATE ) ;
    public final void rule__TemporalLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5902:1: ( ( RULE_DATE ) )
            // InternalJqlDsl.g:5903:2: ( RULE_DATE )
            {
            // InternalJqlDsl.g:5903:2: ( RULE_DATE )
            // InternalJqlDsl.g:5904:3: RULE_DATE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueDATETerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_DATE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getValueDATETerminalRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__TemporalLiteral__ValueAssignment_0_1"


    // $ANTLR start "rule__TemporalLiteral__ValueAssignment_1_1"
    // InternalJqlDsl.g:5913:1: rule__TemporalLiteral__ValueAssignment_1_1 : ( RULE_TIMESTAMP ) ;
    public final void rule__TemporalLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5917:1: ( ( RULE_TIMESTAMP ) )
            // InternalJqlDsl.g:5918:2: ( RULE_TIMESTAMP )
            {
            // InternalJqlDsl.g:5918:2: ( RULE_TIMESTAMP )
            // InternalJqlDsl.g:5919:3: RULE_TIMESTAMP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueTIMESTAMPTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_TIMESTAMP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalLiteralAccess().getValueTIMESTAMPTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__TemporalLiteral__ValueAssignment_1_1"


    // $ANTLR start "rule__MeasuredLiteral__ValueAssignment_1"
    // InternalJqlDsl.g:5928:1: rule__MeasuredLiteral__ValueAssignment_1 : ( ruleNumberLiteral ) ;
    public final void rule__MeasuredLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5932:1: ( ( ruleNumberLiteral ) )
            // InternalJqlDsl.g:5933:2: ( ruleNumberLiteral )
            {
            // InternalJqlDsl.g:5933:2: ( ruleNumberLiteral )
            // InternalJqlDsl.g:5934:3: ruleNumberLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getValueNumberLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getValueNumberLiteralParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__MeasuredLiteral__ValueAssignment_1"


    // $ANTLR start "rule__MeasuredLiteral__MeasureAssignment_3"
    // InternalJqlDsl.g:5943:1: rule__MeasuredLiteral__MeasureAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__MeasuredLiteral__MeasureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5947:1: ( ( ruleQualifiedName ) )
            // InternalJqlDsl.g:5948:2: ( ruleQualifiedName )
            {
            // InternalJqlDsl.g:5948:2: ( ruleQualifiedName )
            // InternalJqlDsl.g:5949:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasureQualifiedNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getMeasureQualifiedNameParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__MeasuredLiteral__MeasureAssignment_3"


    // $ANTLR start "rule__EnumLiteral__ValueAssignment_2"
    // InternalJqlDsl.g:5958:1: rule__EnumLiteral__ValueAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EnumLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5962:1: ( ( ruleQualifiedName ) )
            // InternalJqlDsl.g:5963:2: ( ruleQualifiedName )
            {
            // InternalJqlDsl.g:5963:2: ( ruleQualifiedName )
            // InternalJqlDsl.g:5964:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getValueQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getValueQualifiedNameParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__EnumLiteral__ValueAssignment_2"


    // $ANTLR start "rule__NavigationExpression__BaseAssignment_0"
    // InternalJqlDsl.g:5973:1: rule__NavigationExpression__BaseAssignment_0 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5977:1: ( ( ruleNavigationBase ) )
            // InternalJqlDsl.g:5978:2: ( ruleNavigationBase )
            {
            // InternalJqlDsl.g:5978:2: ( ruleNavigationBase )
            // InternalJqlDsl.g:5979:3: ruleNavigationBase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getBaseNavigationBaseParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNavigationBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getBaseNavigationBaseParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__BaseAssignment_0"


    // $ANTLR start "rule__NavigationExpression__FeaturesAssignment_1_1"
    // InternalJqlDsl.g:5988:1: rule__NavigationExpression__FeaturesAssignment_1_1 : ( ruleFeature ) ;
    public final void rule__NavigationExpression__FeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5992:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5993:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5993:2: ( ruleFeature )
            // InternalJqlDsl.g:5994:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFeaturesFeatureParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getFeaturesFeatureParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__FeaturesAssignment_1_1"


    // $ANTLR start "rule__NavigationExpression__CastAssignment_2_1"
    // InternalJqlDsl.g:6003:1: rule__NavigationExpression__CastAssignment_2_1 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__CastAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:6007:1: ( ( ruleNavigationBase ) )
            // InternalJqlDsl.g:6008:2: ( ruleNavigationBase )
            {
            // InternalJqlDsl.g:6008:2: ( ruleNavigationBase )
            // InternalJqlDsl.g:6009:3: ruleNavigationBase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCastNavigationBaseParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNavigationBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationExpressionAccess().getCastNavigationBaseParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__NavigationExpression__CastAssignment_2_1"


    // $ANTLR start "rule__Feature__NameAssignment"
    // InternalJqlDsl.g:6018:1: rule__Feature__NameAssignment : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:6022:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:6023:2: ( RULE_ID )
            {
            // InternalJqlDsl.g:6023:2: ( RULE_ID )
            // InternalJqlDsl.g:6024:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Feature__NameAssignment"

    // $ANTLR start synpred52_InternalJqlDsl
    public final void synpred52_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:3824:3: ( rule__SwitchConditionalExpression__Group_3__0 )
        // InternalJqlDsl.g:3824:3: rule__SwitchConditionalExpression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchConditionalExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalJqlDsl

    // $ANTLR start synpred53_InternalJqlDsl
    public final void synpred53_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:3850:3: ( rule__SwitchConditionalExpression__Group_4__0 )
        // InternalJqlDsl.g:3850:3: rule__SwitchConditionalExpression__Group_4__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchConditionalExpression__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalJqlDsl

    // $ANTLR start synpred54_InternalJqlDsl
    public final void synpred54_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:4175:3: ( rule__SwitchEqualsExpression__Group_1__0 )
        // InternalJqlDsl.g:4175:3: rule__SwitchEqualsExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchEqualsExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalJqlDsl

    // $ANTLR start synpred55_InternalJqlDsl
    public final void synpred55_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:4201:3: ( rule__SwitchEqualsExpression__Group_2__0 )
        // InternalJqlDsl.g:4201:3: rule__SwitchEqualsExpression__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchEqualsExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalJqlDsl

    // Delegated rules

    public final boolean synpred55_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0441400E030003F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003FC000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001FC000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000E03000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0441403E030003F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0449403E030003F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000FC000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000002L});

}