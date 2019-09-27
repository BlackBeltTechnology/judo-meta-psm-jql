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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_DECIMAL", "RULE_STRING", "RULE_DATE", "RULE_TIMESTAMP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'or'", "'OR'", "'and'", "'AND'", "'=='", "'!='", "'>='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'div'", "'DIV'", "'mod'", "'MOD'", "'!'", "'not'", "'NOT'", "'false'", "'='", "'('", "')'", "'|'", "','", "'['", "']'", "'`'", "'.'", "'@'", "'::'", "'true'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
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
    // InternalJqlDsl.g:63:1: ruleExpression : ( ruleConcatenateExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:67:2: ( ( ruleConcatenateExpression ) )
            // InternalJqlDsl.g:68:2: ( ruleConcatenateExpression )
            {
            // InternalJqlDsl.g:68:2: ( ruleConcatenateExpression )
            // InternalJqlDsl.g:69:3: ruleConcatenateExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getConcatenateExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleConcatenateExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getConcatenateExpressionParserRuleCall()); 
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


    // $ANTLR start "entryRuleLiteral"
    // InternalJqlDsl.g:579:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:580:1: ( ruleLiteral EOF )
            // InternalJqlDsl.g:581:1: ruleLiteral EOF
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
    // InternalJqlDsl.g:588:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:592:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalJqlDsl.g:593:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalJqlDsl.g:593:2: ( ( rule__Literal__Alternatives ) )
            // InternalJqlDsl.g:594:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:595:3: ( rule__Literal__Alternatives )
            // InternalJqlDsl.g:595:4: rule__Literal__Alternatives
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
    // InternalJqlDsl.g:604:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:605:1: ( ruleBooleanLiteral EOF )
            // InternalJqlDsl.g:606:1: ruleBooleanLiteral EOF
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
    // InternalJqlDsl.g:613:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:617:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:618:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:618:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalJqlDsl.g:619:3: ( rule__BooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:620:3: ( rule__BooleanLiteral__Group__0 )
            // InternalJqlDsl.g:620:4: rule__BooleanLiteral__Group__0
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
    // InternalJqlDsl.g:629:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:630:1: ( ruleNumberLiteral EOF )
            // InternalJqlDsl.g:631:1: ruleNumberLiteral EOF
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
    // InternalJqlDsl.g:638:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Alternatives ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:642:2: ( ( ( rule__NumberLiteral__Alternatives ) ) )
            // InternalJqlDsl.g:643:2: ( ( rule__NumberLiteral__Alternatives ) )
            {
            // InternalJqlDsl.g:643:2: ( ( rule__NumberLiteral__Alternatives ) )
            // InternalJqlDsl.g:644:3: ( rule__NumberLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:645:3: ( rule__NumberLiteral__Alternatives )
            // InternalJqlDsl.g:645:4: rule__NumberLiteral__Alternatives
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
    // InternalJqlDsl.g:654:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:655:1: ( ruleStringLiteral EOF )
            // InternalJqlDsl.g:656:1: ruleStringLiteral EOF
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
    // InternalJqlDsl.g:663:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:667:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:668:2: ( ( rule__StringLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:668:2: ( ( rule__StringLiteral__Group__0 ) )
            // InternalJqlDsl.g:669:3: ( rule__StringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:670:3: ( rule__StringLiteral__Group__0 )
            // InternalJqlDsl.g:670:4: rule__StringLiteral__Group__0
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
    // InternalJqlDsl.g:679:1: entryRuleTemporalLiteral : ruleTemporalLiteral EOF ;
    public final void entryRuleTemporalLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:680:1: ( ruleTemporalLiteral EOF )
            // InternalJqlDsl.g:681:1: ruleTemporalLiteral EOF
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
    // InternalJqlDsl.g:688:1: ruleTemporalLiteral : ( ( rule__TemporalLiteral__Alternatives ) ) ;
    public final void ruleTemporalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:692:2: ( ( ( rule__TemporalLiteral__Alternatives ) ) )
            // InternalJqlDsl.g:693:2: ( ( rule__TemporalLiteral__Alternatives ) )
            {
            // InternalJqlDsl.g:693:2: ( ( rule__TemporalLiteral__Alternatives ) )
            // InternalJqlDsl.g:694:3: ( rule__TemporalLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:695:3: ( rule__TemporalLiteral__Alternatives )
            // InternalJqlDsl.g:695:4: rule__TemporalLiteral__Alternatives
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
    // InternalJqlDsl.g:704:1: entryRuleMeasuredLiteral : ruleMeasuredLiteral EOF ;
    public final void entryRuleMeasuredLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:705:1: ( ruleMeasuredLiteral EOF )
            // InternalJqlDsl.g:706:1: ruleMeasuredLiteral EOF
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
    // InternalJqlDsl.g:713:1: ruleMeasuredLiteral : ( ( rule__MeasuredLiteral__Group__0 ) ) ;
    public final void ruleMeasuredLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:717:2: ( ( ( rule__MeasuredLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:718:2: ( ( rule__MeasuredLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:718:2: ( ( rule__MeasuredLiteral__Group__0 ) )
            // InternalJqlDsl.g:719:3: ( rule__MeasuredLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:720:3: ( rule__MeasuredLiteral__Group__0 )
            // InternalJqlDsl.g:720:4: rule__MeasuredLiteral__Group__0
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
    // InternalJqlDsl.g:729:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalJqlDsl.g:730:1: ( ruleEnumLiteral EOF )
            // InternalJqlDsl.g:731:1: ruleEnumLiteral EOF
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
    // InternalJqlDsl.g:738:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:742:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalJqlDsl.g:743:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalJqlDsl.g:743:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalJqlDsl.g:744:3: ( rule__EnumLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            }
            // InternalJqlDsl.g:745:3: ( rule__EnumLiteral__Group__0 )
            // InternalJqlDsl.g:745:4: rule__EnumLiteral__Group__0
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
    // InternalJqlDsl.g:754:1: entryRuleNavigationExpression : ruleNavigationExpression EOF ;
    public final void entryRuleNavigationExpression() throws RecognitionException {
        try {
            // InternalJqlDsl.g:755:1: ( ruleNavigationExpression EOF )
            // InternalJqlDsl.g:756:1: ruleNavigationExpression EOF
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
    // InternalJqlDsl.g:763:1: ruleNavigationExpression : ( ( rule__NavigationExpression__Group__0 ) ) ;
    public final void ruleNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:767:2: ( ( ( rule__NavigationExpression__Group__0 ) ) )
            // InternalJqlDsl.g:768:2: ( ( rule__NavigationExpression__Group__0 ) )
            {
            // InternalJqlDsl.g:768:2: ( ( rule__NavigationExpression__Group__0 ) )
            // InternalJqlDsl.g:769:3: ( rule__NavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            }
            // InternalJqlDsl.g:770:3: ( rule__NavigationExpression__Group__0 )
            // InternalJqlDsl.g:770:4: rule__NavigationExpression__Group__0
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
    // InternalJqlDsl.g:779:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalJqlDsl.g:780:1: ( ruleFeature EOF )
            // InternalJqlDsl.g:781:1: ruleFeature EOF
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
    // InternalJqlDsl.g:788:1: ruleFeature : ( ( rule__Feature__NameAssignment ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:792:2: ( ( ( rule__Feature__NameAssignment ) ) )
            // InternalJqlDsl.g:793:2: ( ( rule__Feature__NameAssignment ) )
            {
            // InternalJqlDsl.g:793:2: ( ( rule__Feature__NameAssignment ) )
            // InternalJqlDsl.g:794:3: ( rule__Feature__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameAssignment()); 
            }
            // InternalJqlDsl.g:795:3: ( rule__Feature__NameAssignment )
            // InternalJqlDsl.g:795:4: rule__Feature__NameAssignment
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
    // InternalJqlDsl.g:804:1: entryRuleNavigationBase : ruleNavigationBase EOF ;
    public final void entryRuleNavigationBase() throws RecognitionException {
        try {
            // InternalJqlDsl.g:805:1: ( ruleNavigationBase EOF )
            // InternalJqlDsl.g:806:1: ruleNavigationBase EOF
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
    // InternalJqlDsl.g:813:1: ruleNavigationBase : ( ( rule__NavigationBase__Alternatives ) ) ;
    public final void ruleNavigationBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:817:2: ( ( ( rule__NavigationBase__Alternatives ) ) )
            // InternalJqlDsl.g:818:2: ( ( rule__NavigationBase__Alternatives ) )
            {
            // InternalJqlDsl.g:818:2: ( ( rule__NavigationBase__Alternatives ) )
            // InternalJqlDsl.g:819:3: ( rule__NavigationBase__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationBaseAccess().getAlternatives()); 
            }
            // InternalJqlDsl.g:820:3: ( rule__NavigationBase__Alternatives )
            // InternalJqlDsl.g:820:4: rule__NavigationBase__Alternatives
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
    // InternalJqlDsl.g:829:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalJqlDsl.g:830:1: ( ruleQualifiedName EOF )
            // InternalJqlDsl.g:831:1: ruleQualifiedName EOF
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
    // InternalJqlDsl.g:838:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:842:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalJqlDsl.g:843:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalJqlDsl.g:843:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalJqlDsl.g:844:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalJqlDsl.g:845:3: ( rule__QualifiedName__Group__0 )
            // InternalJqlDsl.g:845:4: rule__QualifiedName__Group__0
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
    // InternalJqlDsl.g:854:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalJqlDsl.g:855:1: ( ruleValidID EOF )
            // InternalJqlDsl.g:856:1: ruleValidID EOF
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
    // InternalJqlDsl.g:863:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:867:2: ( ( RULE_ID ) )
            // InternalJqlDsl.g:868:2: ( RULE_ID )
            {
            // InternalJqlDsl.g:868:2: ( RULE_ID )
            // InternalJqlDsl.g:869:3: RULE_ID
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


    // $ANTLR start "rule__OpOr__Alternatives"
    // InternalJqlDsl.g:878:1: rule__OpOr__Alternatives : ( ( 'or' ) | ( 'OR' ) );
    public final void rule__OpOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:882:1: ( ( 'or' ) | ( 'OR' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
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
                    // InternalJqlDsl.g:883:2: ( 'or' )
                    {
                    // InternalJqlDsl.g:883:2: ( 'or' )
                    // InternalJqlDsl.g:884:3: 'or'
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
                    // InternalJqlDsl.g:889:2: ( 'OR' )
                    {
                    // InternalJqlDsl.g:889:2: ( 'OR' )
                    // InternalJqlDsl.g:890:3: 'OR'
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
    // InternalJqlDsl.g:899:1: rule__OpAnd__Alternatives : ( ( 'and' ) | ( 'AND' ) );
    public final void rule__OpAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:903:1: ( ( 'and' ) | ( 'AND' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
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
                    // InternalJqlDsl.g:904:2: ( 'and' )
                    {
                    // InternalJqlDsl.g:904:2: ( 'and' )
                    // InternalJqlDsl.g:905:3: 'and'
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
                    // InternalJqlDsl.g:910:2: ( 'AND' )
                    {
                    // InternalJqlDsl.g:910:2: ( 'AND' )
                    // InternalJqlDsl.g:911:3: 'AND'
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
    // InternalJqlDsl.g:920:1: rule__OpEquality__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:924:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
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
                    // InternalJqlDsl.g:925:2: ( '==' )
                    {
                    // InternalJqlDsl.g:925:2: ( '==' )
                    // InternalJqlDsl.g:926:3: '=='
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
                    // InternalJqlDsl.g:931:2: ( '!=' )
                    {
                    // InternalJqlDsl.g:931:2: ( '!=' )
                    // InternalJqlDsl.g:932:3: '!='
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
    // InternalJqlDsl.g:941:1: rule__OpCompare__Alternatives : ( ( '>=' ) | ( ( rule__OpCompare__Group_1__0 ) ) | ( '>' ) | ( '<' ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:945:1: ( ( '>=' ) | ( ( rule__OpCompare__Group_1__0 ) ) | ( '>' ) | ( '<' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||(LA4_2>=RULE_ID && LA4_2<=RULE_TIMESTAMP)||(LA4_2>=24 && LA4_2<=25)||(LA4_2>=33 && LA4_2<=36)||LA4_2==38||LA4_2==44||LA4_2==48) ) {
                    alt4=4;
                }
                else if ( (LA4_2==37) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJqlDsl.g:946:2: ( '>=' )
                    {
                    // InternalJqlDsl.g:946:2: ( '>=' )
                    // InternalJqlDsl.g:947:3: '>='
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
                    // InternalJqlDsl.g:952:2: ( ( rule__OpCompare__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:952:2: ( ( rule__OpCompare__Group_1__0 ) )
                    // InternalJqlDsl.g:953:3: ( rule__OpCompare__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:954:3: ( rule__OpCompare__Group_1__0 )
                    // InternalJqlDsl.g:954:4: rule__OpCompare__Group_1__0
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
                    // InternalJqlDsl.g:958:2: ( '>' )
                    {
                    // InternalJqlDsl.g:958:2: ( '>' )
                    // InternalJqlDsl.g:959:3: '>'
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
                    // InternalJqlDsl.g:964:2: ( '<' )
                    {
                    // InternalJqlDsl.g:964:2: ( '<' )
                    // InternalJqlDsl.g:965:3: '<'
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
    // InternalJqlDsl.g:974:1: rule__OpAdd__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:978:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJqlDsl.g:979:2: ( '+' )
                    {
                    // InternalJqlDsl.g:979:2: ( '+' )
                    // InternalJqlDsl.g:980:3: '+'
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
                    // InternalJqlDsl.g:985:2: ( '-' )
                    {
                    // InternalJqlDsl.g:985:2: ( '-' )
                    // InternalJqlDsl.g:986:3: '-'
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
    // InternalJqlDsl.g:995:1: rule__OpMulti__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) | ( 'div' ) | ( 'DIV' ) | ( 'mod' ) | ( 'MOD' ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:999:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( 'div' ) | ( 'DIV' ) | ( 'mod' ) | ( 'MOD' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 29:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            case 31:
                {
                alt6=6;
                }
                break;
            case 32:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJqlDsl.g:1000:2: ( '*' )
                    {
                    // InternalJqlDsl.g:1000:2: ( '*' )
                    // InternalJqlDsl.g:1001:3: '*'
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
                    // InternalJqlDsl.g:1006:2: ( '/' )
                    {
                    // InternalJqlDsl.g:1006:2: ( '/' )
                    // InternalJqlDsl.g:1007:3: '/'
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
                    // InternalJqlDsl.g:1012:2: ( '%' )
                    {
                    // InternalJqlDsl.g:1012:2: ( '%' )
                    // InternalJqlDsl.g:1013:3: '%'
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
                    // InternalJqlDsl.g:1018:2: ( 'div' )
                    {
                    // InternalJqlDsl.g:1018:2: ( 'div' )
                    // InternalJqlDsl.g:1019:3: 'div'
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
                    // InternalJqlDsl.g:1024:2: ( 'DIV' )
                    {
                    // InternalJqlDsl.g:1024:2: ( 'DIV' )
                    // InternalJqlDsl.g:1025:3: 'DIV'
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
                    // InternalJqlDsl.g:1030:2: ( 'mod' )
                    {
                    // InternalJqlDsl.g:1030:2: ( 'mod' )
                    // InternalJqlDsl.g:1031:3: 'mod'
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
                    // InternalJqlDsl.g:1036:2: ( 'MOD' )
                    {
                    // InternalJqlDsl.g:1036:2: ( 'MOD' )
                    // InternalJqlDsl.g:1037:3: 'MOD'
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
    // InternalJqlDsl.g:1046:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1050:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=24 && LA7_0<=25)||(LA7_0>=33 && LA7_0<=35)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_TIMESTAMP)||LA7_0==36||LA7_0==38||LA7_0==44||LA7_0==48) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJqlDsl.g:1051:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1051:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalJqlDsl.g:1052:3: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1053:3: ( rule__UnaryOperation__Group_0__0 )
                    // InternalJqlDsl.g:1053:4: rule__UnaryOperation__Group_0__0
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
                    // InternalJqlDsl.g:1057:2: ( rulePrimaryExpression )
                    {
                    // InternalJqlDsl.g:1057:2: ( rulePrimaryExpression )
                    // InternalJqlDsl.g:1058:3: rulePrimaryExpression
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
    // InternalJqlDsl.g:1067:1: rule__OpUnary__Alternatives : ( ( '!' ) | ( 'not' ) | ( 'NOT' ) | ( '-' ) | ( '+' ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1071:1: ( ( '!' ) | ( 'not' ) | ( 'NOT' ) | ( '-' ) | ( '+' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJqlDsl.g:1072:2: ( '!' )
                    {
                    // InternalJqlDsl.g:1072:2: ( '!' )
                    // InternalJqlDsl.g:1073:3: '!'
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
                    // InternalJqlDsl.g:1078:2: ( 'not' )
                    {
                    // InternalJqlDsl.g:1078:2: ( 'not' )
                    // InternalJqlDsl.g:1079:3: 'not'
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
                    // InternalJqlDsl.g:1084:2: ( 'NOT' )
                    {
                    // InternalJqlDsl.g:1084:2: ( 'NOT' )
                    // InternalJqlDsl.g:1085:3: 'NOT'
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
                    // InternalJqlDsl.g:1090:2: ( '-' )
                    {
                    // InternalJqlDsl.g:1090:2: ( '-' )
                    // InternalJqlDsl.g:1091:3: '-'
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
                    // InternalJqlDsl.g:1096:2: ( '+' )
                    {
                    // InternalJqlDsl.g:1096:2: ( '+' )
                    // InternalJqlDsl.g:1097:3: '+'
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
    // InternalJqlDsl.g:1106:1: rule__PrimaryExpression__Alternatives : ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1110:1: ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case RULE_STRING:
            case RULE_DATE:
            case RULE_TIMESTAMP:
            case 36:
            case 44:
            case 48:
                {
                alt9=3;
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
                    // InternalJqlDsl.g:1111:2: ( ruleParenthesizedExpression )
                    {
                    // InternalJqlDsl.g:1111:2: ( ruleParenthesizedExpression )
                    // InternalJqlDsl.g:1112:3: ruleParenthesizedExpression
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
                    // InternalJqlDsl.g:1117:2: ( ruleNavigationExpression )
                    {
                    // InternalJqlDsl.g:1117:2: ( ruleNavigationExpression )
                    // InternalJqlDsl.g:1118:3: ruleNavigationExpression
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
                    // InternalJqlDsl.g:1123:2: ( ruleLiteral )
                    {
                    // InternalJqlDsl.g:1123:2: ( ruleLiteral )
                    // InternalJqlDsl.g:1124:3: ruleLiteral
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
    // InternalJqlDsl.g:1133:1: rule__Function__Alternatives_2_1 : ( ( ( rule__Function__LambdaAssignment_2_1_0 ) ) | ( ( rule__Function__Group_2_1_1__0 ) ) );
    public final void rule__Function__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1137:1: ( ( ( rule__Function__LambdaAssignment_2_1_0 ) ) | ( ( rule__Function__Group_2_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=14 && LA10_1<=33)||LA10_1==39||LA10_1==41||(LA10_1>=45 && LA10_1<=47)) ) {
                    alt10=2;
                }
                else if ( (LA10_1==40) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA10_0>=RULE_INTEGER && LA10_0<=RULE_TIMESTAMP)||(LA10_0>=24 && LA10_0<=25)||(LA10_0>=33 && LA10_0<=36)||(LA10_0>=38 && LA10_0<=39)||LA10_0==41||LA10_0==44||LA10_0==48) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJqlDsl.g:1138:2: ( ( rule__Function__LambdaAssignment_2_1_0 ) )
                    {
                    // InternalJqlDsl.g:1138:2: ( ( rule__Function__LambdaAssignment_2_1_0 ) )
                    // InternalJqlDsl.g:1139:3: ( rule__Function__LambdaAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionAccess().getLambdaAssignment_2_1_0()); 
                    }
                    // InternalJqlDsl.g:1140:3: ( rule__Function__LambdaAssignment_2_1_0 )
                    // InternalJqlDsl.g:1140:4: rule__Function__LambdaAssignment_2_1_0
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
                    // InternalJqlDsl.g:1144:2: ( ( rule__Function__Group_2_1_1__0 ) )
                    {
                    // InternalJqlDsl.g:1144:2: ( ( rule__Function__Group_2_1_1__0 ) )
                    // InternalJqlDsl.g:1145:3: ( rule__Function__Group_2_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionAccess().getGroup_2_1_1()); 
                    }
                    // InternalJqlDsl.g:1146:3: ( rule__Function__Group_2_1_1__0 )
                    // InternalJqlDsl.g:1146:4: rule__Function__Group_2_1_1__0
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalJqlDsl.g:1154:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1158:1: ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 36:
            case 48:
                {
                alt11=1;
                }
                break;
            case RULE_INTEGER:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||(LA11_2>=14 && LA11_2<=33)||LA11_2==39||LA11_2==41) ) {
                    alt11=2;
                }
                else if ( (LA11_2==42) ) {
                    alt11=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMAL:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||(LA11_3>=14 && LA11_3<=33)||LA11_3==39||LA11_3==41) ) {
                    alt11=2;
                }
                else if ( (LA11_3==42) ) {
                    alt11=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case RULE_DATE:
            case RULE_TIMESTAMP:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalJqlDsl.g:1159:2: ( ruleBooleanLiteral )
                    {
                    // InternalJqlDsl.g:1159:2: ( ruleBooleanLiteral )
                    // InternalJqlDsl.g:1160:3: ruleBooleanLiteral
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
                    // InternalJqlDsl.g:1165:2: ( ruleNumberLiteral )
                    {
                    // InternalJqlDsl.g:1165:2: ( ruleNumberLiteral )
                    // InternalJqlDsl.g:1166:3: ruleNumberLiteral
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
                    // InternalJqlDsl.g:1171:2: ( ruleStringLiteral )
                    {
                    // InternalJqlDsl.g:1171:2: ( ruleStringLiteral )
                    // InternalJqlDsl.g:1172:3: ruleStringLiteral
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
                    // InternalJqlDsl.g:1177:2: ( ruleTemporalLiteral )
                    {
                    // InternalJqlDsl.g:1177:2: ( ruleTemporalLiteral )
                    // InternalJqlDsl.g:1178:3: ruleTemporalLiteral
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
                    // InternalJqlDsl.g:1183:2: ( ruleEnumLiteral )
                    {
                    // InternalJqlDsl.g:1183:2: ( ruleEnumLiteral )
                    // InternalJqlDsl.g:1184:3: ruleEnumLiteral
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
                    // InternalJqlDsl.g:1189:2: ( ruleMeasuredLiteral )
                    {
                    // InternalJqlDsl.g:1189:2: ( ruleMeasuredLiteral )
                    // InternalJqlDsl.g:1190:3: ruleMeasuredLiteral
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
    // InternalJqlDsl.g:1199:1: rule__BooleanLiteral__Alternatives_1 : ( ( 'false' ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1203:1: ( ( 'false' ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==48) ) {
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
                    // InternalJqlDsl.g:1204:2: ( 'false' )
                    {
                    // InternalJqlDsl.g:1204:2: ( 'false' )
                    // InternalJqlDsl.g:1205:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1210:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    {
                    // InternalJqlDsl.g:1210:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    // InternalJqlDsl.g:1211:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_1()); 
                    }
                    // InternalJqlDsl.g:1212:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    // InternalJqlDsl.g:1212:4: rule__BooleanLiteral__IsTrueAssignment_1_1
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
    // InternalJqlDsl.g:1220:1: rule__NumberLiteral__Alternatives : ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) );
    public final void rule__NumberLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1224:1: ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INTEGER) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_DECIMAL) ) {
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
                    // InternalJqlDsl.g:1225:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1225:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    // InternalJqlDsl.g:1226:3: ( rule__NumberLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1227:3: ( rule__NumberLiteral__Group_0__0 )
                    // InternalJqlDsl.g:1227:4: rule__NumberLiteral__Group_0__0
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
                    // InternalJqlDsl.g:1231:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1231:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    // InternalJqlDsl.g:1232:3: ( rule__NumberLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1233:3: ( rule__NumberLiteral__Group_1__0 )
                    // InternalJqlDsl.g:1233:4: rule__NumberLiteral__Group_1__0
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
    // InternalJqlDsl.g:1241:1: rule__TemporalLiteral__Alternatives : ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) );
    public final void rule__TemporalLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1245:1: ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DATE) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_TIMESTAMP) ) {
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
                    // InternalJqlDsl.g:1246:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1246:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    // InternalJqlDsl.g:1247:3: ( rule__TemporalLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1248:3: ( rule__TemporalLiteral__Group_0__0 )
                    // InternalJqlDsl.g:1248:4: rule__TemporalLiteral__Group_0__0
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
                    // InternalJqlDsl.g:1252:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1252:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    // InternalJqlDsl.g:1253:3: ( rule__TemporalLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1254:3: ( rule__TemporalLiteral__Group_1__0 )
                    // InternalJqlDsl.g:1254:4: rule__TemporalLiteral__Group_1__0
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
    // InternalJqlDsl.g:1262:1: rule__NavigationBase__Alternatives : ( ( ruleValidID ) | ( ruleQualifiedName ) );
    public final void rule__NavigationBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1266:1: ( ( ruleValidID ) | ( ruleQualifiedName ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==47) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||(LA15_1>=14 && LA15_1<=33)||LA15_1==39||LA15_1==41||(LA15_1>=45 && LA15_1<=46)) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJqlDsl.g:1267:2: ( ruleValidID )
                    {
                    // InternalJqlDsl.g:1267:2: ( ruleValidID )
                    // InternalJqlDsl.g:1268:3: ruleValidID
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
                    // InternalJqlDsl.g:1273:2: ( ruleQualifiedName )
                    {
                    // InternalJqlDsl.g:1273:2: ( ruleQualifiedName )
                    // InternalJqlDsl.g:1274:3: ruleQualifiedName
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
    // InternalJqlDsl.g:1283:1: rule__ConcatenateExpression__Group__0 : rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1 ;
    public final void rule__ConcatenateExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1287:1: ( rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1 )
            // InternalJqlDsl.g:1288:2: rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1
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
    // InternalJqlDsl.g:1295:1: rule__ConcatenateExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ConcatenateExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1299:1: ( ( ruleOrExpression ) )
            // InternalJqlDsl.g:1300:1: ( ruleOrExpression )
            {
            // InternalJqlDsl.g:1300:1: ( ruleOrExpression )
            // InternalJqlDsl.g:1301:2: ruleOrExpression
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
    // InternalJqlDsl.g:1310:1: rule__ConcatenateExpression__Group__1 : rule__ConcatenateExpression__Group__1__Impl ;
    public final void rule__ConcatenateExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1314:1: ( rule__ConcatenateExpression__Group__1__Impl )
            // InternalJqlDsl.g:1315:2: rule__ConcatenateExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1321:1: rule__ConcatenateExpression__Group__1__Impl : ( ( rule__ConcatenateExpression__Group_1__0 )* ) ;
    public final void rule__ConcatenateExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1325:1: ( ( ( rule__ConcatenateExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1326:1: ( ( rule__ConcatenateExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1326:1: ( ( rule__ConcatenateExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1327:2: ( rule__ConcatenateExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1328:2: ( rule__ConcatenateExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJqlDsl.g:1328:3: rule__ConcatenateExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ConcatenateExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalJqlDsl.g:1337:1: rule__ConcatenateExpression__Group_1__0 : rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1 ;
    public final void rule__ConcatenateExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1341:1: ( rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1 )
            // InternalJqlDsl.g:1342:2: rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1
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
    // InternalJqlDsl.g:1349:1: rule__ConcatenateExpression__Group_1__0__Impl : ( ( rule__ConcatenateExpression__Group_1_0__0 ) ) ;
    public final void rule__ConcatenateExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1353:1: ( ( ( rule__ConcatenateExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1354:1: ( ( rule__ConcatenateExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1354:1: ( ( rule__ConcatenateExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1355:2: ( rule__ConcatenateExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1356:2: ( rule__ConcatenateExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1356:3: rule__ConcatenateExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1364:1: rule__ConcatenateExpression__Group_1__1 : rule__ConcatenateExpression__Group_1__1__Impl ;
    public final void rule__ConcatenateExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1368:1: ( rule__ConcatenateExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1369:2: rule__ConcatenateExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1375:1: rule__ConcatenateExpression__Group_1__1__Impl : ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__ConcatenateExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1379:1: ( ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1380:1: ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1380:1: ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1381:2: ( rule__ConcatenateExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1382:2: ( rule__ConcatenateExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1382:3: rule__ConcatenateExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1391:1: rule__ConcatenateExpression__Group_1_0__0 : rule__ConcatenateExpression__Group_1_0__0__Impl ;
    public final void rule__ConcatenateExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1395:1: ( rule__ConcatenateExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1396:2: rule__ConcatenateExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1402:1: rule__ConcatenateExpression__Group_1_0__0__Impl : ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConcatenateExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1406:1: ( ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1407:1: ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1407:1: ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1408:2: ( rule__ConcatenateExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1409:2: ( rule__ConcatenateExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1409:3: rule__ConcatenateExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1418:1: rule__ConcatenateExpression__Group_1_0_0__0 : rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1 ;
    public final void rule__ConcatenateExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1422:1: ( rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1423:2: rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1430:1: rule__ConcatenateExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConcatenateExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1434:1: ( ( () ) )
            // InternalJqlDsl.g:1435:1: ( () )
            {
            // InternalJqlDsl.g:1435:1: ( () )
            // InternalJqlDsl.g:1436:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1437:2: ()
            // InternalJqlDsl.g:1437:3: 
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
    // InternalJqlDsl.g:1445:1: rule__ConcatenateExpression__Group_1_0_0__1 : rule__ConcatenateExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConcatenateExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1449:1: ( rule__ConcatenateExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1450:2: rule__ConcatenateExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:1456:1: rule__ConcatenateExpression__Group_1_0_0__1__Impl : ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConcatenateExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1460:1: ( ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1461:1: ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1461:1: ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1462:2: ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1463:2: ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1463:3: rule__ConcatenateExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:1472:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1476:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalJqlDsl.g:1477:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalJqlDsl.g:1484:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1488:1: ( ( ruleAndExpression ) )
            // InternalJqlDsl.g:1489:1: ( ruleAndExpression )
            {
            // InternalJqlDsl.g:1489:1: ( ruleAndExpression )
            // InternalJqlDsl.g:1490:2: ruleAndExpression
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
    // InternalJqlDsl.g:1499:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1503:1: ( rule__OrExpression__Group__1__Impl )
            // InternalJqlDsl.g:1504:2: rule__OrExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1510:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1514:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1515:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1515:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1516:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1517:2: ( rule__OrExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=15 && LA17_0<=16)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJqlDsl.g:1517:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalJqlDsl.g:1526:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1530:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalJqlDsl.g:1531:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalJqlDsl.g:1538:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1542:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1543:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1543:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1544:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1545:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1545:3: rule__OrExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1553:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1557:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1558:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1564:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1568:1: ( ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1569:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1569:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1570:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1571:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1571:3: rule__OrExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1580:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1584:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1585:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1591:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1595:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1596:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1596:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1597:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1598:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1598:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1607:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1611:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1612:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1619:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1623:1: ( ( () ) )
            // InternalJqlDsl.g:1624:1: ( () )
            {
            // InternalJqlDsl.g:1624:1: ( () )
            // InternalJqlDsl.g:1625:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1626:2: ()
            // InternalJqlDsl.g:1626:3: 
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
    // InternalJqlDsl.g:1634:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1638:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1639:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:1645:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1649:1: ( ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1650:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1650:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1651:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1652:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1652:3: rule__OrExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:1661:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1665:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalJqlDsl.g:1666:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalJqlDsl.g:1673:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1677:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDsl.g:1678:1: ( ruleEqualityExpression )
            {
            // InternalJqlDsl.g:1678:1: ( ruleEqualityExpression )
            // InternalJqlDsl.g:1679:2: ruleEqualityExpression
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
    // InternalJqlDsl.g:1688:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1692:1: ( rule__AndExpression__Group__1__Impl )
            // InternalJqlDsl.g:1693:2: rule__AndExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1699:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1703:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1704:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1704:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1705:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1706:2: ( rule__AndExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=18)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJqlDsl.g:1706:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalJqlDsl.g:1715:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1719:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalJqlDsl.g:1720:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalJqlDsl.g:1727:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1731:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1732:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1732:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1733:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1734:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1734:3: rule__AndExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1742:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1746:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1747:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1753:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1757:1: ( ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1758:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1758:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1759:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1760:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1760:3: rule__AndExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1769:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1773:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1774:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1780:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1784:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1785:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1785:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1786:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1787:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1787:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1796:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1800:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1801:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1808:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1812:1: ( ( () ) )
            // InternalJqlDsl.g:1813:1: ( () )
            {
            // InternalJqlDsl.g:1813:1: ( () )
            // InternalJqlDsl.g:1814:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1815:2: ()
            // InternalJqlDsl.g:1815:3: 
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
    // InternalJqlDsl.g:1823:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1827:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1828:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:1834:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1838:1: ( ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1839:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1839:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1840:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1841:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1841:3: rule__AndExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:1850:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1854:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalJqlDsl.g:1855:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
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
    // InternalJqlDsl.g:1862:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1866:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:1867:1: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:1867:1: ( ruleRelationalExpression )
            // InternalJqlDsl.g:1868:2: ruleRelationalExpression
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
    // InternalJqlDsl.g:1877:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1881:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalJqlDsl.g:1882:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1888:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1892:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1893:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1893:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1894:2: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1895:2: ( rule__EqualityExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=19 && LA19_0<=20)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJqlDsl.g:1895:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalJqlDsl.g:1904:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1908:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalJqlDsl.g:1909:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
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
    // InternalJqlDsl.g:1916:1: rule__EqualityExpression__Group_1__0__Impl : ( ( rule__EqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1920:1: ( ( ( rule__EqualityExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1921:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1921:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1922:2: ( rule__EqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1923:2: ( rule__EqualityExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1923:3: rule__EqualityExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1931:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1935:1: ( rule__EqualityExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1936:2: rule__EqualityExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1942:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1946:1: ( ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1947:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1947:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1948:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1949:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1949:3: rule__EqualityExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1958:1: rule__EqualityExpression__Group_1_0__0 : rule__EqualityExpression__Group_1_0__0__Impl ;
    public final void rule__EqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1962:1: ( rule__EqualityExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1963:2: rule__EqualityExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1969:1: rule__EqualityExpression__Group_1_0__0__Impl : ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1973:1: ( ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1974:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1974:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1975:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1976:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1976:3: rule__EqualityExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1985:1: rule__EqualityExpression__Group_1_0_0__0 : rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 ;
    public final void rule__EqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1989:1: ( rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1990:2: rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1997:1: rule__EqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2001:1: ( ( () ) )
            // InternalJqlDsl.g:2002:1: ( () )
            {
            // InternalJqlDsl.g:2002:1: ( () )
            // InternalJqlDsl.g:2003:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2004:2: ()
            // InternalJqlDsl.g:2004:3: 
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
    // InternalJqlDsl.g:2012:1: rule__EqualityExpression__Group_1_0_0__1 : rule__EqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__EqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2016:1: ( rule__EqualityExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2017:2: rule__EqualityExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:2023:1: rule__EqualityExpression__Group_1_0_0__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__EqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2027:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2028:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2028:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2029:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2030:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2030:3: rule__EqualityExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:2039:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2043:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalJqlDsl.g:2044:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
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
    // InternalJqlDsl.g:2051:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2055:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDsl.g:2056:1: ( ruleAdditiveExpression )
            {
            // InternalJqlDsl.g:2056:1: ( ruleAdditiveExpression )
            // InternalJqlDsl.g:2057:2: ruleAdditiveExpression
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
    // InternalJqlDsl.g:2066:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2070:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalJqlDsl.g:2071:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalJqlDsl.g:2077:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2081:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2082:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2082:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2083:2: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2084:2: ( rule__RelationalExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=21 && LA20_0<=23)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJqlDsl.g:2084:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalJqlDsl.g:2093:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2097:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalJqlDsl.g:2098:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
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
    // InternalJqlDsl.g:2105:1: rule__RelationalExpression__Group_1__0__Impl : ( ( rule__RelationalExpression__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2109:1: ( ( ( rule__RelationalExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2110:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2110:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2111:2: ( rule__RelationalExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2112:2: ( rule__RelationalExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2112:3: rule__RelationalExpression__Group_1_0__0
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
    // InternalJqlDsl.g:2120:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2124:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2125:2: rule__RelationalExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2131:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2135:1: ( ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2136:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2136:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2137:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2138:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2138:3: rule__RelationalExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:2147:1: rule__RelationalExpression__Group_1_0__0 : rule__RelationalExpression__Group_1_0__0__Impl ;
    public final void rule__RelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2151:1: ( rule__RelationalExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2152:2: rule__RelationalExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:2158:1: rule__RelationalExpression__Group_1_0__0__Impl : ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2162:1: ( ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2163:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2163:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2164:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2165:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2165:3: rule__RelationalExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:2174:1: rule__RelationalExpression__Group_1_0_0__0 : rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 ;
    public final void rule__RelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2178:1: ( rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2179:2: rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:2186:1: rule__RelationalExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2190:1: ( ( () ) )
            // InternalJqlDsl.g:2191:1: ( () )
            {
            // InternalJqlDsl.g:2191:1: ( () )
            // InternalJqlDsl.g:2192:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2193:2: ()
            // InternalJqlDsl.g:2193:3: 
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
    // InternalJqlDsl.g:2201:1: rule__RelationalExpression__Group_1_0_0__1 : rule__RelationalExpression__Group_1_0_0__1__Impl ;
    public final void rule__RelationalExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2205:1: ( rule__RelationalExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2206:2: rule__RelationalExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:2212:1: rule__RelationalExpression__Group_1_0_0__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__RelationalExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2216:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2217:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2217:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2218:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2219:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2219:3: rule__RelationalExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:2228:1: rule__OpCompare__Group_1__0 : rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 ;
    public final void rule__OpCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2232:1: ( rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 )
            // InternalJqlDsl.g:2233:2: rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1
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
    // InternalJqlDsl.g:2240:1: rule__OpCompare__Group_1__0__Impl : ( '<' ) ;
    public final void rule__OpCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2244:1: ( ( '<' ) )
            // InternalJqlDsl.g:2245:1: ( '<' )
            {
            // InternalJqlDsl.g:2245:1: ( '<' )
            // InternalJqlDsl.g:2246:2: '<'
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
    // InternalJqlDsl.g:2255:1: rule__OpCompare__Group_1__1 : rule__OpCompare__Group_1__1__Impl ;
    public final void rule__OpCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2259:1: ( rule__OpCompare__Group_1__1__Impl )
            // InternalJqlDsl.g:2260:2: rule__OpCompare__Group_1__1__Impl
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
    // InternalJqlDsl.g:2266:1: rule__OpCompare__Group_1__1__Impl : ( '=' ) ;
    public final void rule__OpCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2270:1: ( ( '=' ) )
            // InternalJqlDsl.g:2271:1: ( '=' )
            {
            // InternalJqlDsl.g:2271:1: ( '=' )
            // InternalJqlDsl.g:2272:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:2282:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2286:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalJqlDsl.g:2287:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
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
    // InternalJqlDsl.g:2294:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2298:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDsl.g:2299:1: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDsl.g:2299:1: ( ruleMultiplicativeExpression )
            // InternalJqlDsl.g:2300:2: ruleMultiplicativeExpression
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
    // InternalJqlDsl.g:2309:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2313:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalJqlDsl.g:2314:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalJqlDsl.g:2320:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2324:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2325:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2325:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2326:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2327:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=24 && LA21_0<=25)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJqlDsl.g:2327:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalJqlDsl.g:2336:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2340:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalJqlDsl.g:2341:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
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
    // InternalJqlDsl.g:2348:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2352:1: ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2353:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2353:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2354:2: ( rule__AdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2355:2: ( rule__AdditiveExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2355:3: rule__AdditiveExpression__Group_1_0__0
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
    // InternalJqlDsl.g:2363:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2367:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2368:2: rule__AdditiveExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2374:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2378:1: ( ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2379:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2379:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2380:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2381:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2381:3: rule__AdditiveExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:2390:1: rule__AdditiveExpression__Group_1_0__0 : rule__AdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__AdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2394:1: ( rule__AdditiveExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2395:2: rule__AdditiveExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:2401:1: rule__AdditiveExpression__Group_1_0__0__Impl : ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2405:1: ( ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2406:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2406:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2407:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2408:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2408:3: rule__AdditiveExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:2417:1: rule__AdditiveExpression__Group_1_0_0__0 : rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 ;
    public final void rule__AdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2421:1: ( rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2422:2: rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:2429:1: rule__AdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2433:1: ( ( () ) )
            // InternalJqlDsl.g:2434:1: ( () )
            {
            // InternalJqlDsl.g:2434:1: ( () )
            // InternalJqlDsl.g:2435:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2436:2: ()
            // InternalJqlDsl.g:2436:3: 
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
    // InternalJqlDsl.g:2444:1: rule__AdditiveExpression__Group_1_0_0__1 : rule__AdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2448:1: ( rule__AdditiveExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2449:2: rule__AdditiveExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:2455:1: rule__AdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2459:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2460:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2460:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2461:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2462:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2462:3: rule__AdditiveExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:2471:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2475:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalJqlDsl.g:2476:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
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
    // InternalJqlDsl.g:2483:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2487:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:2488:1: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:2488:1: ( ruleUnaryOperation )
            // InternalJqlDsl.g:2489:2: ruleUnaryOperation
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
    // InternalJqlDsl.g:2498:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2502:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // InternalJqlDsl.g:2503:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
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
    // InternalJqlDsl.g:2510:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2514:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2515:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2515:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2516:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2517:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalJqlDsl.g:2517:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalJqlDsl.g:2525:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2529:1: ( rule__MultiplicativeExpression__Group__2__Impl )
            // InternalJqlDsl.g:2530:2: rule__MultiplicativeExpression__Group__2__Impl
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
    // InternalJqlDsl.g:2536:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__Group_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2540:1: ( ( ( rule__MultiplicativeExpression__Group_2__0 )* ) )
            // InternalJqlDsl.g:2541:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            {
            // InternalJqlDsl.g:2541:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            // InternalJqlDsl.g:2542:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:2543:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=26 && LA23_0<=32)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJqlDsl.g:2543:3: rule__MultiplicativeExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MultiplicativeExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalJqlDsl.g:2552:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2556:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalJqlDsl.g:2557:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalJqlDsl.g:2564:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( '!' ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2568:1: ( ( ( '!' ) ) )
            // InternalJqlDsl.g:2569:1: ( ( '!' ) )
            {
            // InternalJqlDsl.g:2569:1: ( ( '!' ) )
            // InternalJqlDsl.g:2570:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getExclamationMarkKeyword_1_0()); 
            }
            // InternalJqlDsl.g:2571:2: ( '!' )
            // InternalJqlDsl.g:2571:3: '!'
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
    // InternalJqlDsl.g:2579:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2583:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2584:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2590:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2594:1: ( ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2595:1: ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2595:1: ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) )
            // InternalJqlDsl.g:2596:2: ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionsAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2597:2: ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 )
            // InternalJqlDsl.g:2597:3: rule__MultiplicativeExpression__FunctionsAssignment_1_1
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
    // InternalJqlDsl.g:2606:1: rule__MultiplicativeExpression__Group_2__0 : rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2610:1: ( rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 )
            // InternalJqlDsl.g:2611:2: rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1
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
    // InternalJqlDsl.g:2618:1: rule__MultiplicativeExpression__Group_2__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2622:1: ( ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) )
            // InternalJqlDsl.g:2623:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            {
            // InternalJqlDsl.g:2623:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            // InternalJqlDsl.g:2624:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0()); 
            }
            // InternalJqlDsl.g:2625:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            // InternalJqlDsl.g:2625:3: rule__MultiplicativeExpression__Group_2_0__0
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
    // InternalJqlDsl.g:2633:1: rule__MultiplicativeExpression__Group_2__1 : rule__MultiplicativeExpression__Group_2__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2637:1: ( rule__MultiplicativeExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:2638:2: rule__MultiplicativeExpression__Group_2__1__Impl
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
    // InternalJqlDsl.g:2644:1: rule__MultiplicativeExpression__Group_2__1__Impl : ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2648:1: ( ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) )
            // InternalJqlDsl.g:2649:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:2649:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            // InternalJqlDsl.g:2650:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandAssignment_2_1()); 
            }
            // InternalJqlDsl.g:2651:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            // InternalJqlDsl.g:2651:3: rule__MultiplicativeExpression__RightOperandAssignment_2_1
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
    // InternalJqlDsl.g:2660:1: rule__MultiplicativeExpression__Group_2_0__0 : rule__MultiplicativeExpression__Group_2_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2664:1: ( rule__MultiplicativeExpression__Group_2_0__0__Impl )
            // InternalJqlDsl.g:2665:2: rule__MultiplicativeExpression__Group_2_0__0__Impl
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
    // InternalJqlDsl.g:2671:1: rule__MultiplicativeExpression__Group_2_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2675:1: ( ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) )
            // InternalJqlDsl.g:2676:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            {
            // InternalJqlDsl.g:2676:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            // InternalJqlDsl.g:2677:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0_0()); 
            }
            // InternalJqlDsl.g:2678:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            // InternalJqlDsl.g:2678:3: rule__MultiplicativeExpression__Group_2_0_0__0
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
    // InternalJqlDsl.g:2687:1: rule__MultiplicativeExpression__Group_2_0_0__0 : rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2691:1: ( rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 )
            // InternalJqlDsl.g:2692:2: rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1
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
    // InternalJqlDsl.g:2699:1: rule__MultiplicativeExpression__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2703:1: ( ( () ) )
            // InternalJqlDsl.g:2704:1: ( () )
            {
            // InternalJqlDsl.g:2704:1: ( () )
            // InternalJqlDsl.g:2705:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftOperandAction_2_0_0_0()); 
            }
            // InternalJqlDsl.g:2706:2: ()
            // InternalJqlDsl.g:2706:3: 
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
    // InternalJqlDsl.g:2714:1: rule__MultiplicativeExpression__Group_2_0_0__1 : rule__MultiplicativeExpression__Group_2_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2718:1: ( rule__MultiplicativeExpression__Group_2_0_0__1__Impl )
            // InternalJqlDsl.g:2719:2: rule__MultiplicativeExpression__Group_2_0_0__1__Impl
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
    // InternalJqlDsl.g:2725:1: rule__MultiplicativeExpression__Group_2_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2729:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) )
            // InternalJqlDsl.g:2730:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            {
            // InternalJqlDsl.g:2730:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            // InternalJqlDsl.g:2731:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_2_0_0_1()); 
            }
            // InternalJqlDsl.g:2732:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            // InternalJqlDsl.g:2732:3: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1
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
    // InternalJqlDsl.g:2741:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2745:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalJqlDsl.g:2746:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
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
    // InternalJqlDsl.g:2753:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2757:1: ( ( () ) )
            // InternalJqlDsl.g:2758:1: ( () )
            {
            // InternalJqlDsl.g:2758:1: ( () )
            // InternalJqlDsl.g:2759:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); 
            }
            // InternalJqlDsl.g:2760:2: ()
            // InternalJqlDsl.g:2760:3: 
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
    // InternalJqlDsl.g:2768:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2772:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalJqlDsl.g:2773:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
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
    // InternalJqlDsl.g:2780:1: rule__UnaryOperation__Group_0__1__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2784:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalJqlDsl.g:2785:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:2785:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            // InternalJqlDsl.g:2786:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalJqlDsl.g:2787:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            // InternalJqlDsl.g:2787:3: rule__UnaryOperation__OperatorAssignment_0_1
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
    // InternalJqlDsl.g:2795:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2799:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalJqlDsl.g:2800:2: rule__UnaryOperation__Group_0__2__Impl
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
    // InternalJqlDsl.g:2806:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2810:1: ( ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalJqlDsl.g:2811:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalJqlDsl.g:2811:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            // InternalJqlDsl.g:2812:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalJqlDsl.g:2813:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            // InternalJqlDsl.g:2813:3: rule__UnaryOperation__OperandAssignment_0_2
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
    // InternalJqlDsl.g:2822:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2826:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // InternalJqlDsl.g:2827:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalJqlDsl.g:2834:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2838:1: ( ( '(' ) )
            // InternalJqlDsl.g:2839:1: ( '(' )
            {
            // InternalJqlDsl.g:2839:1: ( '(' )
            // InternalJqlDsl.g:2840:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:2849:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2853:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // InternalJqlDsl.g:2854:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalJqlDsl.g:2861:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2865:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:2866:1: ( ruleExpression )
            {
            // InternalJqlDsl.g:2866:1: ( ruleExpression )
            // InternalJqlDsl.g:2867:2: ruleExpression
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
    // InternalJqlDsl.g:2876:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2880:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // InternalJqlDsl.g:2881:2: rule__ParenthesizedExpression__Group__2__Impl
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
    // InternalJqlDsl.g:2887:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2891:1: ( ( ')' ) )
            // InternalJqlDsl.g:2892:1: ( ')' )
            {
            // InternalJqlDsl.g:2892:1: ( ')' )
            // InternalJqlDsl.g:2893:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:2903:1: rule__LambdaExpression__Group__0 : rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 ;
    public final void rule__LambdaExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2907:1: ( rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 )
            // InternalJqlDsl.g:2908:2: rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1
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
    // InternalJqlDsl.g:2915:1: rule__LambdaExpression__Group__0__Impl : ( () ) ;
    public final void rule__LambdaExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2919:1: ( ( () ) )
            // InternalJqlDsl.g:2920:1: ( () )
            {
            // InternalJqlDsl.g:2920:1: ( () )
            // InternalJqlDsl.g:2921:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getLambdaExpressionAction_0()); 
            }
            // InternalJqlDsl.g:2922:2: ()
            // InternalJqlDsl.g:2922:3: 
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
    // InternalJqlDsl.g:2930:1: rule__LambdaExpression__Group__1 : rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 ;
    public final void rule__LambdaExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2934:1: ( rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 )
            // InternalJqlDsl.g:2935:2: rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDsl.g:2942:1: rule__LambdaExpression__Group__1__Impl : ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) ;
    public final void rule__LambdaExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2946:1: ( ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) )
            // InternalJqlDsl.g:2947:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            {
            // InternalJqlDsl.g:2947:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            // InternalJqlDsl.g:2948:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getArgumentAssignment_1()); 
            }
            // InternalJqlDsl.g:2949:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            // InternalJqlDsl.g:2949:3: rule__LambdaExpression__ArgumentAssignment_1
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
    // InternalJqlDsl.g:2957:1: rule__LambdaExpression__Group__2 : rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 ;
    public final void rule__LambdaExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2961:1: ( rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 )
            // InternalJqlDsl.g:2962:2: rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalJqlDsl.g:2969:1: rule__LambdaExpression__Group__2__Impl : ( '|' ) ;
    public final void rule__LambdaExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2973:1: ( ( '|' ) )
            // InternalJqlDsl.g:2974:1: ( '|' )
            {
            // InternalJqlDsl.g:2974:1: ( '|' )
            // InternalJqlDsl.g:2975:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getVerticalLineKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:2984:1: rule__LambdaExpression__Group__3 : rule__LambdaExpression__Group__3__Impl ;
    public final void rule__LambdaExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2988:1: ( rule__LambdaExpression__Group__3__Impl )
            // InternalJqlDsl.g:2989:2: rule__LambdaExpression__Group__3__Impl
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
    // InternalJqlDsl.g:2995:1: rule__LambdaExpression__Group__3__Impl : ( ( rule__LambdaExpression__StatementAssignment_3 ) ) ;
    public final void rule__LambdaExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2999:1: ( ( ( rule__LambdaExpression__StatementAssignment_3 ) ) )
            // InternalJqlDsl.g:3000:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            {
            // InternalJqlDsl.g:3000:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            // InternalJqlDsl.g:3001:2: ( rule__LambdaExpression__StatementAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getStatementAssignment_3()); 
            }
            // InternalJqlDsl.g:3002:2: ( rule__LambdaExpression__StatementAssignment_3 )
            // InternalJqlDsl.g:3002:3: rule__LambdaExpression__StatementAssignment_3
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
    // InternalJqlDsl.g:3011:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3015:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalJqlDsl.g:3016:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalJqlDsl.g:3023:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3027:1: ( ( () ) )
            // InternalJqlDsl.g:3028:1: ( () )
            {
            // InternalJqlDsl.g:3028:1: ( () )
            // InternalJqlDsl.g:3029:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            }
            // InternalJqlDsl.g:3030:2: ()
            // InternalJqlDsl.g:3030:3: 
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
    // InternalJqlDsl.g:3038:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3042:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalJqlDsl.g:3043:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalJqlDsl.g:3050:1: rule__Function__Group__1__Impl : ( ( rule__Function__FeatureAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3054:1: ( ( ( rule__Function__FeatureAssignment_1 ) ) )
            // InternalJqlDsl.g:3055:1: ( ( rule__Function__FeatureAssignment_1 ) )
            {
            // InternalJqlDsl.g:3055:1: ( ( rule__Function__FeatureAssignment_1 ) )
            // InternalJqlDsl.g:3056:2: ( rule__Function__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFeatureAssignment_1()); 
            }
            // InternalJqlDsl.g:3057:2: ( rule__Function__FeatureAssignment_1 )
            // InternalJqlDsl.g:3057:3: rule__Function__FeatureAssignment_1
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
    // InternalJqlDsl.g:3065:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3069:1: ( rule__Function__Group__2__Impl )
            // InternalJqlDsl.g:3070:2: rule__Function__Group__2__Impl
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
    // InternalJqlDsl.g:3076:1: rule__Function__Group__2__Impl : ( ( rule__Function__Group_2__0 )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3080:1: ( ( ( rule__Function__Group_2__0 )? ) )
            // InternalJqlDsl.g:3081:1: ( ( rule__Function__Group_2__0 )? )
            {
            // InternalJqlDsl.g:3081:1: ( ( rule__Function__Group_2__0 )? )
            // InternalJqlDsl.g:3082:2: ( rule__Function__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:3083:2: ( rule__Function__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJqlDsl.g:3083:3: rule__Function__Group_2__0
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
    // InternalJqlDsl.g:3092:1: rule__Function__Group_2__0 : rule__Function__Group_2__0__Impl rule__Function__Group_2__1 ;
    public final void rule__Function__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3096:1: ( rule__Function__Group_2__0__Impl rule__Function__Group_2__1 )
            // InternalJqlDsl.g:3097:2: rule__Function__Group_2__0__Impl rule__Function__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalJqlDsl.g:3104:1: rule__Function__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Function__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3108:1: ( ( '(' ) )
            // InternalJqlDsl.g:3109:1: ( '(' )
            {
            // InternalJqlDsl.g:3109:1: ( '(' )
            // InternalJqlDsl.g:3110:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3119:1: rule__Function__Group_2__1 : rule__Function__Group_2__1__Impl rule__Function__Group_2__2 ;
    public final void rule__Function__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3123:1: ( rule__Function__Group_2__1__Impl rule__Function__Group_2__2 )
            // InternalJqlDsl.g:3124:2: rule__Function__Group_2__1__Impl rule__Function__Group_2__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalJqlDsl.g:3131:1: rule__Function__Group_2__1__Impl : ( ( rule__Function__Alternatives_2_1 ) ) ;
    public final void rule__Function__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3135:1: ( ( ( rule__Function__Alternatives_2_1 ) ) )
            // InternalJqlDsl.g:3136:1: ( ( rule__Function__Alternatives_2_1 ) )
            {
            // InternalJqlDsl.g:3136:1: ( ( rule__Function__Alternatives_2_1 ) )
            // InternalJqlDsl.g:3137:2: ( rule__Function__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getAlternatives_2_1()); 
            }
            // InternalJqlDsl.g:3138:2: ( rule__Function__Alternatives_2_1 )
            // InternalJqlDsl.g:3138:3: rule__Function__Alternatives_2_1
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
    // InternalJqlDsl.g:3146:1: rule__Function__Group_2__2 : rule__Function__Group_2__2__Impl ;
    public final void rule__Function__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3150:1: ( rule__Function__Group_2__2__Impl )
            // InternalJqlDsl.g:3151:2: rule__Function__Group_2__2__Impl
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
    // InternalJqlDsl.g:3157:1: rule__Function__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Function__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3161:1: ( ( ')' ) )
            // InternalJqlDsl.g:3162:1: ( ')' )
            {
            // InternalJqlDsl.g:3162:1: ( ')' )
            // InternalJqlDsl.g:3163:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3173:1: rule__Function__Group_2_1_1__0 : rule__Function__Group_2_1_1__0__Impl rule__Function__Group_2_1_1__1 ;
    public final void rule__Function__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3177:1: ( rule__Function__Group_2_1_1__0__Impl rule__Function__Group_2_1_1__1 )
            // InternalJqlDsl.g:3178:2: rule__Function__Group_2_1_1__0__Impl rule__Function__Group_2_1_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalJqlDsl.g:3185:1: rule__Function__Group_2_1_1__0__Impl : ( ( rule__Function__ParametersAssignment_2_1_1_0 )? ) ;
    public final void rule__Function__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3189:1: ( ( ( rule__Function__ParametersAssignment_2_1_1_0 )? ) )
            // InternalJqlDsl.g:3190:1: ( ( rule__Function__ParametersAssignment_2_1_1_0 )? )
            {
            // InternalJqlDsl.g:3190:1: ( ( rule__Function__ParametersAssignment_2_1_1_0 )? )
            // InternalJqlDsl.g:3191:2: ( rule__Function__ParametersAssignment_2_1_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersAssignment_2_1_1_0()); 
            }
            // InternalJqlDsl.g:3192:2: ( rule__Function__ParametersAssignment_2_1_1_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_TIMESTAMP)||(LA25_0>=24 && LA25_0<=25)||(LA25_0>=33 && LA25_0<=36)||LA25_0==38||LA25_0==44||LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJqlDsl.g:3192:3: rule__Function__ParametersAssignment_2_1_1_0
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
    // InternalJqlDsl.g:3200:1: rule__Function__Group_2_1_1__1 : rule__Function__Group_2_1_1__1__Impl ;
    public final void rule__Function__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3204:1: ( rule__Function__Group_2_1_1__1__Impl )
            // InternalJqlDsl.g:3205:2: rule__Function__Group_2_1_1__1__Impl
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
    // InternalJqlDsl.g:3211:1: rule__Function__Group_2_1_1__1__Impl : ( ( rule__Function__Group_2_1_1_1__0 )* ) ;
    public final void rule__Function__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3215:1: ( ( ( rule__Function__Group_2_1_1_1__0 )* ) )
            // InternalJqlDsl.g:3216:1: ( ( rule__Function__Group_2_1_1_1__0 )* )
            {
            // InternalJqlDsl.g:3216:1: ( ( rule__Function__Group_2_1_1_1__0 )* )
            // InternalJqlDsl.g:3217:2: ( rule__Function__Group_2_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup_2_1_1_1()); 
            }
            // InternalJqlDsl.g:3218:2: ( rule__Function__Group_2_1_1_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJqlDsl.g:3218:3: rule__Function__Group_2_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Function__Group_2_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalJqlDsl.g:3227:1: rule__Function__Group_2_1_1_1__0 : rule__Function__Group_2_1_1_1__0__Impl rule__Function__Group_2_1_1_1__1 ;
    public final void rule__Function__Group_2_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3231:1: ( rule__Function__Group_2_1_1_1__0__Impl rule__Function__Group_2_1_1_1__1 )
            // InternalJqlDsl.g:3232:2: rule__Function__Group_2_1_1_1__0__Impl rule__Function__Group_2_1_1_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalJqlDsl.g:3239:1: rule__Function__Group_2_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_2_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3243:1: ( ( ',' ) )
            // InternalJqlDsl.g:3244:1: ( ',' )
            {
            // InternalJqlDsl.g:3244:1: ( ',' )
            // InternalJqlDsl.g:3245:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getCommaKeyword_2_1_1_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3254:1: rule__Function__Group_2_1_1_1__1 : rule__Function__Group_2_1_1_1__1__Impl ;
    public final void rule__Function__Group_2_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3258:1: ( rule__Function__Group_2_1_1_1__1__Impl )
            // InternalJqlDsl.g:3259:2: rule__Function__Group_2_1_1_1__1__Impl
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
    // InternalJqlDsl.g:3265:1: rule__Function__Group_2_1_1_1__1__Impl : ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) ) ;
    public final void rule__Function__Group_2_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3269:1: ( ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) ) )
            // InternalJqlDsl.g:3270:1: ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) )
            {
            // InternalJqlDsl.g:3270:1: ( ( rule__Function__ParametersAssignment_2_1_1_1_1 ) )
            // InternalJqlDsl.g:3271:2: ( rule__Function__ParametersAssignment_2_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersAssignment_2_1_1_1_1()); 
            }
            // InternalJqlDsl.g:3272:2: ( rule__Function__ParametersAssignment_2_1_1_1_1 )
            // InternalJqlDsl.g:3272:3: rule__Function__ParametersAssignment_2_1_1_1_1
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


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalJqlDsl.g:3281:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3285:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalJqlDsl.g:3286:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalJqlDsl.g:3293:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3297:1: ( ( () ) )
            // InternalJqlDsl.g:3298:1: ( () )
            {
            // InternalJqlDsl.g:3298:1: ( () )
            // InternalJqlDsl.g:3299:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            }
            // InternalJqlDsl.g:3300:2: ()
            // InternalJqlDsl.g:3300:3: 
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
    // InternalJqlDsl.g:3308:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3312:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalJqlDsl.g:3313:2: rule__BooleanLiteral__Group__1__Impl
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
    // InternalJqlDsl.g:3319:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3323:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalJqlDsl.g:3324:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalJqlDsl.g:3324:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalJqlDsl.g:3325:2: ( rule__BooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalJqlDsl.g:3326:2: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalJqlDsl.g:3326:3: rule__BooleanLiteral__Alternatives_1
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
    // InternalJqlDsl.g:3335:1: rule__NumberLiteral__Group_0__0 : rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 ;
    public final void rule__NumberLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3339:1: ( rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 )
            // InternalJqlDsl.g:3340:2: rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalJqlDsl.g:3347:1: rule__NumberLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3351:1: ( ( () ) )
            // InternalJqlDsl.g:3352:1: ( () )
            {
            // InternalJqlDsl.g:3352:1: ( () )
            // InternalJqlDsl.g:3353:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getIntegerLiteralAction_0_0()); 
            }
            // InternalJqlDsl.g:3354:2: ()
            // InternalJqlDsl.g:3354:3: 
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
    // InternalJqlDsl.g:3362:1: rule__NumberLiteral__Group_0__1 : rule__NumberLiteral__Group_0__1__Impl ;
    public final void rule__NumberLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3366:1: ( rule__NumberLiteral__Group_0__1__Impl )
            // InternalJqlDsl.g:3367:2: rule__NumberLiteral__Group_0__1__Impl
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
    // InternalJqlDsl.g:3373:1: rule__NumberLiteral__Group_0__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__NumberLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3377:1: ( ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDsl.g:3378:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:3378:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDsl.g:3379:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDsl.g:3380:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            // InternalJqlDsl.g:3380:3: rule__NumberLiteral__ValueAssignment_0_1
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
    // InternalJqlDsl.g:3389:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3393:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalJqlDsl.g:3394:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalJqlDsl.g:3401:1: rule__NumberLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3405:1: ( ( () ) )
            // InternalJqlDsl.g:3406:1: ( () )
            {
            // InternalJqlDsl.g:3406:1: ( () )
            // InternalJqlDsl.g:3407:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getDecimalLiteralAction_1_0()); 
            }
            // InternalJqlDsl.g:3408:2: ()
            // InternalJqlDsl.g:3408:3: 
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
    // InternalJqlDsl.g:3416:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3420:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalJqlDsl.g:3421:2: rule__NumberLiteral__Group_1__1__Impl
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
    // InternalJqlDsl.g:3427:1: rule__NumberLiteral__Group_1__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3431:1: ( ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDsl.g:3432:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:3432:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDsl.g:3433:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDsl.g:3434:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            // InternalJqlDsl.g:3434:3: rule__NumberLiteral__ValueAssignment_1_1
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
    // InternalJqlDsl.g:3443:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3447:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // InternalJqlDsl.g:3448:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalJqlDsl.g:3455:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3459:1: ( ( () ) )
            // InternalJqlDsl.g:3460:1: ( () )
            {
            // InternalJqlDsl.g:3460:1: ( () )
            // InternalJqlDsl.g:3461:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            }
            // InternalJqlDsl.g:3462:2: ()
            // InternalJqlDsl.g:3462:3: 
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
    // InternalJqlDsl.g:3470:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3474:1: ( rule__StringLiteral__Group__1__Impl )
            // InternalJqlDsl.g:3475:2: rule__StringLiteral__Group__1__Impl
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
    // InternalJqlDsl.g:3481:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3485:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDsl.g:3486:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDsl.g:3486:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // InternalJqlDsl.g:3487:2: ( rule__StringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDsl.g:3488:2: ( rule__StringLiteral__ValueAssignment_1 )
            // InternalJqlDsl.g:3488:3: rule__StringLiteral__ValueAssignment_1
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
    // InternalJqlDsl.g:3497:1: rule__TemporalLiteral__Group_0__0 : rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 ;
    public final void rule__TemporalLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3501:1: ( rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 )
            // InternalJqlDsl.g:3502:2: rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalJqlDsl.g:3509:1: rule__TemporalLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3513:1: ( ( () ) )
            // InternalJqlDsl.g:3514:1: ( () )
            {
            // InternalJqlDsl.g:3514:1: ( () )
            // InternalJqlDsl.g:3515:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getDateLiteralAction_0_0()); 
            }
            // InternalJqlDsl.g:3516:2: ()
            // InternalJqlDsl.g:3516:3: 
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
    // InternalJqlDsl.g:3524:1: rule__TemporalLiteral__Group_0__1 : rule__TemporalLiteral__Group_0__1__Impl ;
    public final void rule__TemporalLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3528:1: ( rule__TemporalLiteral__Group_0__1__Impl )
            // InternalJqlDsl.g:3529:2: rule__TemporalLiteral__Group_0__1__Impl
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
    // InternalJqlDsl.g:3535:1: rule__TemporalLiteral__Group_0__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__TemporalLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3539:1: ( ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDsl.g:3540:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:3540:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDsl.g:3541:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDsl.g:3542:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            // InternalJqlDsl.g:3542:3: rule__TemporalLiteral__ValueAssignment_0_1
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
    // InternalJqlDsl.g:3551:1: rule__TemporalLiteral__Group_1__0 : rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 ;
    public final void rule__TemporalLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3555:1: ( rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 )
            // InternalJqlDsl.g:3556:2: rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJqlDsl.g:3563:1: rule__TemporalLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3567:1: ( ( () ) )
            // InternalJqlDsl.g:3568:1: ( () )
            {
            // InternalJqlDsl.g:3568:1: ( () )
            // InternalJqlDsl.g:3569:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getTimeStampLiteralAction_1_0()); 
            }
            // InternalJqlDsl.g:3570:2: ()
            // InternalJqlDsl.g:3570:3: 
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
    // InternalJqlDsl.g:3578:1: rule__TemporalLiteral__Group_1__1 : rule__TemporalLiteral__Group_1__1__Impl ;
    public final void rule__TemporalLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3582:1: ( rule__TemporalLiteral__Group_1__1__Impl )
            // InternalJqlDsl.g:3583:2: rule__TemporalLiteral__Group_1__1__Impl
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
    // InternalJqlDsl.g:3589:1: rule__TemporalLiteral__Group_1__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__TemporalLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3593:1: ( ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDsl.g:3594:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:3594:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDsl.g:3595:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDsl.g:3596:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            // InternalJqlDsl.g:3596:3: rule__TemporalLiteral__ValueAssignment_1_1
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
    // InternalJqlDsl.g:3605:1: rule__MeasuredLiteral__Group__0 : rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 ;
    public final void rule__MeasuredLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3609:1: ( rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 )
            // InternalJqlDsl.g:3610:2: rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1
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
    // InternalJqlDsl.g:3617:1: rule__MeasuredLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MeasuredLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3621:1: ( ( () ) )
            // InternalJqlDsl.g:3622:1: ( () )
            {
            // InternalJqlDsl.g:3622:1: ( () )
            // InternalJqlDsl.g:3623:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasuredLiteralAction_0()); 
            }
            // InternalJqlDsl.g:3624:2: ()
            // InternalJqlDsl.g:3624:3: 
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
    // InternalJqlDsl.g:3632:1: rule__MeasuredLiteral__Group__1 : rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 ;
    public final void rule__MeasuredLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3636:1: ( rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 )
            // InternalJqlDsl.g:3637:2: rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalJqlDsl.g:3644:1: rule__MeasuredLiteral__Group__1__Impl : ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MeasuredLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3648:1: ( ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDsl.g:3649:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDsl.g:3649:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            // InternalJqlDsl.g:3650:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDsl.g:3651:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            // InternalJqlDsl.g:3651:3: rule__MeasuredLiteral__ValueAssignment_1
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
    // InternalJqlDsl.g:3659:1: rule__MeasuredLiteral__Group__2 : rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 ;
    public final void rule__MeasuredLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3663:1: ( rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 )
            // InternalJqlDsl.g:3664:2: rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3
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
    // InternalJqlDsl.g:3671:1: rule__MeasuredLiteral__Group__2__Impl : ( '[' ) ;
    public final void rule__MeasuredLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3675:1: ( ( '[' ) )
            // InternalJqlDsl.g:3676:1: ( '[' )
            {
            // InternalJqlDsl.g:3676:1: ( '[' )
            // InternalJqlDsl.g:3677:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3686:1: rule__MeasuredLiteral__Group__3 : rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 ;
    public final void rule__MeasuredLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3690:1: ( rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 )
            // InternalJqlDsl.g:3691:2: rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalJqlDsl.g:3698:1: rule__MeasuredLiteral__Group__3__Impl : ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) ) ;
    public final void rule__MeasuredLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3702:1: ( ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) ) )
            // InternalJqlDsl.g:3703:1: ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) )
            {
            // InternalJqlDsl.g:3703:1: ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) )
            // InternalJqlDsl.g:3704:2: ( rule__MeasuredLiteral__MeasureAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasureAssignment_3()); 
            }
            // InternalJqlDsl.g:3705:2: ( rule__MeasuredLiteral__MeasureAssignment_3 )
            // InternalJqlDsl.g:3705:3: rule__MeasuredLiteral__MeasureAssignment_3
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
    // InternalJqlDsl.g:3713:1: rule__MeasuredLiteral__Group__4 : rule__MeasuredLiteral__Group__4__Impl ;
    public final void rule__MeasuredLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3717:1: ( rule__MeasuredLiteral__Group__4__Impl )
            // InternalJqlDsl.g:3718:2: rule__MeasuredLiteral__Group__4__Impl
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
    // InternalJqlDsl.g:3724:1: rule__MeasuredLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__MeasuredLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3728:1: ( ( ']' ) )
            // InternalJqlDsl.g:3729:1: ( ']' )
            {
            // InternalJqlDsl.g:3729:1: ( ']' )
            // InternalJqlDsl.g:3730:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3740:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3744:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalJqlDsl.g:3745:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalJqlDsl.g:3752:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3756:1: ( ( () ) )
            // InternalJqlDsl.g:3757:1: ( () )
            {
            // InternalJqlDsl.g:3757:1: ( () )
            // InternalJqlDsl.g:3758:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }
            // InternalJqlDsl.g:3759:2: ()
            // InternalJqlDsl.g:3759:3: 
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
    // InternalJqlDsl.g:3767:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3771:1: ( rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 )
            // InternalJqlDsl.g:3772:2: rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2
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
    // InternalJqlDsl.g:3779:1: rule__EnumLiteral__Group__1__Impl : ( '`' ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3783:1: ( ( '`' ) )
            // InternalJqlDsl.g:3784:1: ( '`' )
            {
            // InternalJqlDsl.g:3784:1: ( '`' )
            // InternalJqlDsl.g:3785:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGraveAccentKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3794:1: rule__EnumLiteral__Group__2 : rule__EnumLiteral__Group__2__Impl ;
    public final void rule__EnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3798:1: ( rule__EnumLiteral__Group__2__Impl )
            // InternalJqlDsl.g:3799:2: rule__EnumLiteral__Group__2__Impl
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
    // InternalJqlDsl.g:3805:1: rule__EnumLiteral__Group__2__Impl : ( ( rule__EnumLiteral__ValueAssignment_2 ) ) ;
    public final void rule__EnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3809:1: ( ( ( rule__EnumLiteral__ValueAssignment_2 ) ) )
            // InternalJqlDsl.g:3810:1: ( ( rule__EnumLiteral__ValueAssignment_2 ) )
            {
            // InternalJqlDsl.g:3810:1: ( ( rule__EnumLiteral__ValueAssignment_2 ) )
            // InternalJqlDsl.g:3811:2: ( rule__EnumLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getValueAssignment_2()); 
            }
            // InternalJqlDsl.g:3812:2: ( rule__EnumLiteral__ValueAssignment_2 )
            // InternalJqlDsl.g:3812:3: rule__EnumLiteral__ValueAssignment_2
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
    // InternalJqlDsl.g:3821:1: rule__NavigationExpression__Group__0 : rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3825:1: ( rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 )
            // InternalJqlDsl.g:3826:2: rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalJqlDsl.g:3833:1: rule__NavigationExpression__Group__0__Impl : ( ( rule__NavigationExpression__BaseAssignment_0 ) ) ;
    public final void rule__NavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3837:1: ( ( ( rule__NavigationExpression__BaseAssignment_0 ) ) )
            // InternalJqlDsl.g:3838:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            {
            // InternalJqlDsl.g:3838:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            // InternalJqlDsl.g:3839:2: ( rule__NavigationExpression__BaseAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getBaseAssignment_0()); 
            }
            // InternalJqlDsl.g:3840:2: ( rule__NavigationExpression__BaseAssignment_0 )
            // InternalJqlDsl.g:3840:3: rule__NavigationExpression__BaseAssignment_0
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
    // InternalJqlDsl.g:3848:1: rule__NavigationExpression__Group__1 : rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3852:1: ( rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 )
            // InternalJqlDsl.g:3853:2: rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalJqlDsl.g:3860:1: rule__NavigationExpression__Group__1__Impl : ( ( rule__NavigationExpression__Group_1__0 )* ) ;
    public final void rule__NavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3864:1: ( ( ( rule__NavigationExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:3865:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:3865:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            // InternalJqlDsl.g:3866:2: ( rule__NavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:3867:2: ( rule__NavigationExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==45) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJqlDsl.g:3867:3: rule__NavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__NavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalJqlDsl.g:3875:1: rule__NavigationExpression__Group__2 : rule__NavigationExpression__Group__2__Impl ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3879:1: ( rule__NavigationExpression__Group__2__Impl )
            // InternalJqlDsl.g:3880:2: rule__NavigationExpression__Group__2__Impl
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
    // InternalJqlDsl.g:3886:1: rule__NavigationExpression__Group__2__Impl : ( ( rule__NavigationExpression__Group_2__0 )? ) ;
    public final void rule__NavigationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3890:1: ( ( ( rule__NavigationExpression__Group_2__0 )? ) )
            // InternalJqlDsl.g:3891:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            {
            // InternalJqlDsl.g:3891:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            // InternalJqlDsl.g:3892:2: ( rule__NavigationExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:3893:2: ( rule__NavigationExpression__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJqlDsl.g:3893:3: rule__NavigationExpression__Group_2__0
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
    // InternalJqlDsl.g:3902:1: rule__NavigationExpression__Group_1__0 : rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 ;
    public final void rule__NavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3906:1: ( rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 )
            // InternalJqlDsl.g:3907:2: rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1
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
    // InternalJqlDsl.g:3914:1: rule__NavigationExpression__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__NavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3918:1: ( ( ( '.' ) ) )
            // InternalJqlDsl.g:3919:1: ( ( '.' ) )
            {
            // InternalJqlDsl.g:3919:1: ( ( '.' ) )
            // InternalJqlDsl.g:3920:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFullStopKeyword_1_0()); 
            }
            // InternalJqlDsl.g:3921:2: ( '.' )
            // InternalJqlDsl.g:3921:3: '.'
            {
            match(input,45,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDsl.g:3929:1: rule__NavigationExpression__Group_1__1 : rule__NavigationExpression__Group_1__1__Impl ;
    public final void rule__NavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3933:1: ( rule__NavigationExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:3934:2: rule__NavigationExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:3940:1: rule__NavigationExpression__Group_1__1__Impl : ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) ;
    public final void rule__NavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3944:1: ( ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) )
            // InternalJqlDsl.g:3945:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:3945:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            // InternalJqlDsl.g:3946:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFeaturesAssignment_1_1()); 
            }
            // InternalJqlDsl.g:3947:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            // InternalJqlDsl.g:3947:3: rule__NavigationExpression__FeaturesAssignment_1_1
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
    // InternalJqlDsl.g:3956:1: rule__NavigationExpression__Group_2__0 : rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 ;
    public final void rule__NavigationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3960:1: ( rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 )
            // InternalJqlDsl.g:3961:2: rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1
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
    // InternalJqlDsl.g:3968:1: rule__NavigationExpression__Group_2__0__Impl : ( '@' ) ;
    public final void rule__NavigationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3972:1: ( ( '@' ) )
            // InternalJqlDsl.g:3973:1: ( '@' )
            {
            // InternalJqlDsl.g:3973:1: ( '@' )
            // InternalJqlDsl.g:3974:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3983:1: rule__NavigationExpression__Group_2__1 : rule__NavigationExpression__Group_2__1__Impl ;
    public final void rule__NavigationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3987:1: ( rule__NavigationExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:3988:2: rule__NavigationExpression__Group_2__1__Impl
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
    // InternalJqlDsl.g:3994:1: rule__NavigationExpression__Group_2__1__Impl : ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) ;
    public final void rule__NavigationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3998:1: ( ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) )
            // InternalJqlDsl.g:3999:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:3999:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            // InternalJqlDsl.g:4000:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCastAssignment_2_1()); 
            }
            // InternalJqlDsl.g:4001:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            // InternalJqlDsl.g:4001:3: rule__NavigationExpression__CastAssignment_2_1
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
    // InternalJqlDsl.g:4010:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4014:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalJqlDsl.g:4015:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalJqlDsl.g:4022:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4026:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:4027:1: ( RULE_ID )
            {
            // InternalJqlDsl.g:4027:1: ( RULE_ID )
            // InternalJqlDsl.g:4028:2: RULE_ID
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
    // InternalJqlDsl.g:4037:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4041:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalJqlDsl.g:4042:2: rule__QualifiedName__Group__1__Impl
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
    // InternalJqlDsl.g:4048:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4052:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalJqlDsl.g:4053:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalJqlDsl.g:4053:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalJqlDsl.g:4054:2: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalJqlDsl.g:4054:2: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalJqlDsl.g:4055:3: ( rule__QualifiedName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:4056:3: ( rule__QualifiedName__Group_1__0 )
            // InternalJqlDsl.g:4056:4: rule__QualifiedName__Group_1__0
            {
            pushFollow(FOLLOW_40);
            rule__QualifiedName__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }

            // InternalJqlDsl.g:4059:2: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalJqlDsl.g:4060:3: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:4061:3: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==47) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalJqlDsl.g:4061:4: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalJqlDsl.g:4071:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4075:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalJqlDsl.g:4076:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalJqlDsl.g:4083:1: rule__QualifiedName__Group_1__0__Impl : ( ( '::' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4087:1: ( ( ( '::' ) ) )
            // InternalJqlDsl.g:4088:1: ( ( '::' ) )
            {
            // InternalJqlDsl.g:4088:1: ( ( '::' ) )
            // InternalJqlDsl.g:4089:2: ( '::' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            // InternalJqlDsl.g:4090:2: ( '::' )
            // InternalJqlDsl.g:4090:3: '::'
            {
            match(input,47,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDsl.g:4098:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4102:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalJqlDsl.g:4103:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalJqlDsl.g:4109:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4113:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:4114:1: ( RULE_ID )
            {
            // InternalJqlDsl.g:4114:1: ( RULE_ID )
            // InternalJqlDsl.g:4115:2: RULE_ID
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
    // InternalJqlDsl.g:4125:1: rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 : ( ruleOpConcat ) ;
    public final void rule__ConcatenateExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4129:1: ( ( ruleOpConcat ) )
            // InternalJqlDsl.g:4130:2: ( ruleOpConcat )
            {
            // InternalJqlDsl.g:4130:2: ( ruleOpConcat )
            // InternalJqlDsl.g:4131:3: ruleOpConcat
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
    // InternalJqlDsl.g:4140:1: rule__ConcatenateExpression__RightOperandAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__ConcatenateExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4144:1: ( ( ruleOrExpression ) )
            // InternalJqlDsl.g:4145:2: ( ruleOrExpression )
            {
            // InternalJqlDsl.g:4145:2: ( ruleOrExpression )
            // InternalJqlDsl.g:4146:3: ruleOrExpression
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
    // InternalJqlDsl.g:4155:1: rule__OrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__OrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4159:1: ( ( ruleOpOr ) )
            // InternalJqlDsl.g:4160:2: ( ruleOpOr )
            {
            // InternalJqlDsl.g:4160:2: ( ruleOpOr )
            // InternalJqlDsl.g:4161:3: ruleOpOr
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
    // InternalJqlDsl.g:4170:1: rule__OrExpression__RightOperandAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4174:1: ( ( ruleAndExpression ) )
            // InternalJqlDsl.g:4175:2: ( ruleAndExpression )
            {
            // InternalJqlDsl.g:4175:2: ( ruleAndExpression )
            // InternalJqlDsl.g:4176:3: ruleAndExpression
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
    // InternalJqlDsl.g:4185:1: rule__AndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__AndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4189:1: ( ( ruleOpAnd ) )
            // InternalJqlDsl.g:4190:2: ( ruleOpAnd )
            {
            // InternalJqlDsl.g:4190:2: ( ruleOpAnd )
            // InternalJqlDsl.g:4191:3: ruleOpAnd
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
    // InternalJqlDsl.g:4200:1: rule__AndExpression__RightOperandAssignment_1_1 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4204:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDsl.g:4205:2: ( ruleEqualityExpression )
            {
            // InternalJqlDsl.g:4205:2: ( ruleEqualityExpression )
            // InternalJqlDsl.g:4206:3: ruleEqualityExpression
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
    // InternalJqlDsl.g:4215:1: rule__EqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4219:1: ( ( ruleOpEquality ) )
            // InternalJqlDsl.g:4220:2: ( ruleOpEquality )
            {
            // InternalJqlDsl.g:4220:2: ( ruleOpEquality )
            // InternalJqlDsl.g:4221:3: ruleOpEquality
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
    // InternalJqlDsl.g:4230:1: rule__EqualityExpression__RightOperandAssignment_1_1 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4234:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:4235:2: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:4235:2: ( ruleRelationalExpression )
            // InternalJqlDsl.g:4236:3: ruleRelationalExpression
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
    // InternalJqlDsl.g:4245:1: rule__RelationalExpression__OperatorAssignment_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4249:1: ( ( ruleOpCompare ) )
            // InternalJqlDsl.g:4250:2: ( ruleOpCompare )
            {
            // InternalJqlDsl.g:4250:2: ( ruleOpCompare )
            // InternalJqlDsl.g:4251:3: ruleOpCompare
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
    // InternalJqlDsl.g:4260:1: rule__RelationalExpression__RightOperandAssignment_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4264:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDsl.g:4265:2: ( ruleAdditiveExpression )
            {
            // InternalJqlDsl.g:4265:2: ( ruleAdditiveExpression )
            // InternalJqlDsl.g:4266:3: ruleAdditiveExpression
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
    // InternalJqlDsl.g:4275:1: rule__AdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4279:1: ( ( ruleOpAdd ) )
            // InternalJqlDsl.g:4280:2: ( ruleOpAdd )
            {
            // InternalJqlDsl.g:4280:2: ( ruleOpAdd )
            // InternalJqlDsl.g:4281:3: ruleOpAdd
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
    // InternalJqlDsl.g:4290:1: rule__AdditiveExpression__RightOperandAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4294:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDsl.g:4295:2: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDsl.g:4295:2: ( ruleMultiplicativeExpression )
            // InternalJqlDsl.g:4296:3: ruleMultiplicativeExpression
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
    // InternalJqlDsl.g:4305:1: rule__MultiplicativeExpression__FunctionsAssignment_1_1 : ( ruleFunction ) ;
    public final void rule__MultiplicativeExpression__FunctionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4309:1: ( ( ruleFunction ) )
            // InternalJqlDsl.g:4310:2: ( ruleFunction )
            {
            // InternalJqlDsl.g:4310:2: ( ruleFunction )
            // InternalJqlDsl.g:4311:3: ruleFunction
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
    // InternalJqlDsl.g:4320:1: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4324:1: ( ( ruleOpMulti ) )
            // InternalJqlDsl.g:4325:2: ( ruleOpMulti )
            {
            // InternalJqlDsl.g:4325:2: ( ruleOpMulti )
            // InternalJqlDsl.g:4326:3: ruleOpMulti
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
    // InternalJqlDsl.g:4335:1: rule__MultiplicativeExpression__RightOperandAssignment_2_1 : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__RightOperandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4339:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:4340:2: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:4340:2: ( ruleUnaryOperation )
            // InternalJqlDsl.g:4341:3: ruleUnaryOperation
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
    // InternalJqlDsl.g:4350:1: rule__UnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4354:1: ( ( ruleOpUnary ) )
            // InternalJqlDsl.g:4355:2: ( ruleOpUnary )
            {
            // InternalJqlDsl.g:4355:2: ( ruleOpUnary )
            // InternalJqlDsl.g:4356:3: ruleOpUnary
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
    // InternalJqlDsl.g:4365:1: rule__UnaryOperation__OperandAssignment_0_2 : ( ruleUnaryOperation ) ;
    public final void rule__UnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4369:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:4370:2: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:4370:2: ( ruleUnaryOperation )
            // InternalJqlDsl.g:4371:3: ruleUnaryOperation
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
    // InternalJqlDsl.g:4380:1: rule__LambdaExpression__ArgumentAssignment_1 : ( ruleFeature ) ;
    public final void rule__LambdaExpression__ArgumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4384:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:4385:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:4385:2: ( ruleFeature )
            // InternalJqlDsl.g:4386:3: ruleFeature
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
    // InternalJqlDsl.g:4395:1: rule__LambdaExpression__StatementAssignment_3 : ( ruleExpression ) ;
    public final void rule__LambdaExpression__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4399:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:4400:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:4400:2: ( ruleExpression )
            // InternalJqlDsl.g:4401:3: ruleExpression
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
    // InternalJqlDsl.g:4410:1: rule__Function__FeatureAssignment_1 : ( ruleFeature ) ;
    public final void rule__Function__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4414:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:4415:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:4415:2: ( ruleFeature )
            // InternalJqlDsl.g:4416:3: ruleFeature
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
    // InternalJqlDsl.g:4425:1: rule__Function__LambdaAssignment_2_1_0 : ( ruleLambdaExpression ) ;
    public final void rule__Function__LambdaAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4429:1: ( ( ruleLambdaExpression ) )
            // InternalJqlDsl.g:4430:2: ( ruleLambdaExpression )
            {
            // InternalJqlDsl.g:4430:2: ( ruleLambdaExpression )
            // InternalJqlDsl.g:4431:3: ruleLambdaExpression
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
    // InternalJqlDsl.g:4440:1: rule__Function__ParametersAssignment_2_1_1_0 : ( ruleExpression ) ;
    public final void rule__Function__ParametersAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4444:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:4445:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:4445:2: ( ruleExpression )
            // InternalJqlDsl.g:4446:3: ruleExpression
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
    // InternalJqlDsl.g:4455:1: rule__Function__ParametersAssignment_2_1_1_1_1 : ( ruleExpression ) ;
    public final void rule__Function__ParametersAssignment_2_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4459:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:4460:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:4460:2: ( ruleExpression )
            // InternalJqlDsl.g:4461:3: ruleExpression
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


    // $ANTLR start "rule__BooleanLiteral__IsTrueAssignment_1_1"
    // InternalJqlDsl.g:4470:1: rule__BooleanLiteral__IsTrueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4474:1: ( ( ( 'true' ) ) )
            // InternalJqlDsl.g:4475:2: ( ( 'true' ) )
            {
            // InternalJqlDsl.g:4475:2: ( ( 'true' ) )
            // InternalJqlDsl.g:4476:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            // InternalJqlDsl.g:4477:3: ( 'true' )
            // InternalJqlDsl.g:4478:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:4489:1: rule__NumberLiteral__ValueAssignment_0_1 : ( RULE_INTEGER ) ;
    public final void rule__NumberLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4493:1: ( ( RULE_INTEGER ) )
            // InternalJqlDsl.g:4494:2: ( RULE_INTEGER )
            {
            // InternalJqlDsl.g:4494:2: ( RULE_INTEGER )
            // InternalJqlDsl.g:4495:3: RULE_INTEGER
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
    // InternalJqlDsl.g:4504:1: rule__NumberLiteral__ValueAssignment_1_1 : ( RULE_DECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4508:1: ( ( RULE_DECIMAL ) )
            // InternalJqlDsl.g:4509:2: ( RULE_DECIMAL )
            {
            // InternalJqlDsl.g:4509:2: ( RULE_DECIMAL )
            // InternalJqlDsl.g:4510:3: RULE_DECIMAL
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
    // InternalJqlDsl.g:4519:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4523:1: ( ( RULE_STRING ) )
            // InternalJqlDsl.g:4524:2: ( RULE_STRING )
            {
            // InternalJqlDsl.g:4524:2: ( RULE_STRING )
            // InternalJqlDsl.g:4525:3: RULE_STRING
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
    // InternalJqlDsl.g:4534:1: rule__TemporalLiteral__ValueAssignment_0_1 : ( RULE_DATE ) ;
    public final void rule__TemporalLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4538:1: ( ( RULE_DATE ) )
            // InternalJqlDsl.g:4539:2: ( RULE_DATE )
            {
            // InternalJqlDsl.g:4539:2: ( RULE_DATE )
            // InternalJqlDsl.g:4540:3: RULE_DATE
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
    // InternalJqlDsl.g:4549:1: rule__TemporalLiteral__ValueAssignment_1_1 : ( RULE_TIMESTAMP ) ;
    public final void rule__TemporalLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4553:1: ( ( RULE_TIMESTAMP ) )
            // InternalJqlDsl.g:4554:2: ( RULE_TIMESTAMP )
            {
            // InternalJqlDsl.g:4554:2: ( RULE_TIMESTAMP )
            // InternalJqlDsl.g:4555:3: RULE_TIMESTAMP
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
    // InternalJqlDsl.g:4564:1: rule__MeasuredLiteral__ValueAssignment_1 : ( ruleNumberLiteral ) ;
    public final void rule__MeasuredLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4568:1: ( ( ruleNumberLiteral ) )
            // InternalJqlDsl.g:4569:2: ( ruleNumberLiteral )
            {
            // InternalJqlDsl.g:4569:2: ( ruleNumberLiteral )
            // InternalJqlDsl.g:4570:3: ruleNumberLiteral
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
    // InternalJqlDsl.g:4579:1: rule__MeasuredLiteral__MeasureAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__MeasuredLiteral__MeasureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4583:1: ( ( ruleQualifiedName ) )
            // InternalJqlDsl.g:4584:2: ( ruleQualifiedName )
            {
            // InternalJqlDsl.g:4584:2: ( ruleQualifiedName )
            // InternalJqlDsl.g:4585:3: ruleQualifiedName
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
    // InternalJqlDsl.g:4594:1: rule__EnumLiteral__ValueAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EnumLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4598:1: ( ( ruleQualifiedName ) )
            // InternalJqlDsl.g:4599:2: ( ruleQualifiedName )
            {
            // InternalJqlDsl.g:4599:2: ( ruleQualifiedName )
            // InternalJqlDsl.g:4600:3: ruleQualifiedName
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
    // InternalJqlDsl.g:4609:1: rule__NavigationExpression__BaseAssignment_0 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4613:1: ( ( ruleNavigationBase ) )
            // InternalJqlDsl.g:4614:2: ( ruleNavigationBase )
            {
            // InternalJqlDsl.g:4614:2: ( ruleNavigationBase )
            // InternalJqlDsl.g:4615:3: ruleNavigationBase
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
    // InternalJqlDsl.g:4624:1: rule__NavigationExpression__FeaturesAssignment_1_1 : ( ruleFeature ) ;
    public final void rule__NavigationExpression__FeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4628:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:4629:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:4629:2: ( ruleFeature )
            // InternalJqlDsl.g:4630:3: ruleFeature
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
    // InternalJqlDsl.g:4639:1: rule__NavigationExpression__CastAssignment_2_1 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__CastAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4643:1: ( ( ruleNavigationBase ) )
            // InternalJqlDsl.g:4644:2: ( ruleNavigationBase )
            {
            // InternalJqlDsl.g:4644:2: ( ruleNavigationBase )
            // InternalJqlDsl.g:4645:3: ruleNavigationBase
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
    // InternalJqlDsl.g:4654:1: rule__Feature__NameAssignment : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4658:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:4659:2: ( RULE_ID )
            {
            // InternalJqlDsl.g:4659:2: ( RULE_ID )
            // InternalJqlDsl.g:4660:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001105E030003F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003FC000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001FC000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000E03000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001125E030003F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000002L});

}