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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_DECIMAL", "RULE_STRING", "RULE_DATE", "RULE_TIMESTAMP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'or'", "'OR'", "'and'", "'AND'", "'=='", "'!='", "'>='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'not'", "'NOT'", "'false'", "'='", "'('", "')'", "'|'", "','", "'CASE'", "'AS'", "'WHEN'", "'ELSE'", "'THEN'", "'['", "']'", "'`'", "'.'", "'@'", "'::'", "'true'"
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


    // $ANTLR start "entryRuleTransformation"
    // InternalJqlDsl.g:554:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalJqlDsl.g:555:1: ( ruleTransformation EOF )
            // InternalJqlDsl.g:556:1: ruleTransformation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTransformation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationRule()); 
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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalJqlDsl.g:563:1: ruleTransformation : ( ( rule__Transformation__Group__0 ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:567:2: ( ( ( rule__Transformation__Group__0 ) ) )
            // InternalJqlDsl.g:568:2: ( ( rule__Transformation__Group__0 ) )
            {
            // InternalJqlDsl.g:568:2: ( ( rule__Transformation__Group__0 ) )
            // InternalJqlDsl.g:569:3: ( rule__Transformation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getGroup()); 
            }
            // InternalJqlDsl.g:570:3: ( rule__Transformation__Group__0 )
            // InternalJqlDsl.g:570:4: rule__Transformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation"


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

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_TIMESTAMP)||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=29 && LA1_0<=32)||LA1_0==34||LA1_0==45||LA1_0==49) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
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

                if ( (LA5_2==EOF||(LA5_2>=RULE_ID && LA5_2<=RULE_TIMESTAMP)||(LA5_2>=24 && LA5_2<=25)||(LA5_2>=29 && LA5_2<=32)||LA5_2==34||LA5_2==45||LA5_2==49) ) {
                    alt5=4;
                }
                else if ( (LA5_2==33) ) {
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
    // InternalJqlDsl.g:1141:1: rule__OpMulti__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1145:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt7=3;
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

            }
        }
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
    // InternalJqlDsl.g:1168:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1172:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=24 && LA8_0<=25)||(LA8_0>=29 && LA8_0<=31)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_TIMESTAMP)||LA8_0==32||LA8_0==34||LA8_0==45||LA8_0==49) ) {
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
                    // InternalJqlDsl.g:1173:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1173:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalJqlDsl.g:1174:3: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1175:3: ( rule__UnaryOperation__Group_0__0 )
                    // InternalJqlDsl.g:1175:4: rule__UnaryOperation__Group_0__0
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
                    // InternalJqlDsl.g:1179:2: ( rulePrimaryExpression )
                    {
                    // InternalJqlDsl.g:1179:2: ( rulePrimaryExpression )
                    // InternalJqlDsl.g:1180:3: rulePrimaryExpression
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
    // InternalJqlDsl.g:1189:1: rule__OpUnary__Alternatives : ( ( '!' ) | ( 'not' ) | ( 'NOT' ) | ( '-' ) | ( '+' ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1193:1: ( ( '!' ) | ( 'not' ) | ( 'NOT' ) | ( '-' ) | ( '+' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
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
                    // InternalJqlDsl.g:1194:2: ( '!' )
                    {
                    // InternalJqlDsl.g:1194:2: ( '!' )
                    // InternalJqlDsl.g:1195:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1200:2: ( 'not' )
                    {
                    // InternalJqlDsl.g:1200:2: ( 'not' )
                    // InternalJqlDsl.g:1201:3: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNotKeyword_1()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNotKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDsl.g:1206:2: ( 'NOT' )
                    {
                    // InternalJqlDsl.g:1206:2: ( 'NOT' )
                    // InternalJqlDsl.g:1207:3: 'NOT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTKeyword_2()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDsl.g:1212:2: ( '-' )
                    {
                    // InternalJqlDsl.g:1212:2: ( '-' )
                    // InternalJqlDsl.g:1213:3: '-'
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
                    // InternalJqlDsl.g:1218:2: ( '+' )
                    {
                    // InternalJqlDsl.g:1218:2: ( '+' )
                    // InternalJqlDsl.g:1219:3: '+'
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
    // InternalJqlDsl.g:1228:1: rule__PrimaryExpression__Alternatives : ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1232:1: ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 34:
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
            case 32:
            case 45:
            case 49:
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
                    // InternalJqlDsl.g:1233:2: ( ruleParenthesizedExpression )
                    {
                    // InternalJqlDsl.g:1233:2: ( ruleParenthesizedExpression )
                    // InternalJqlDsl.g:1234:3: ruleParenthesizedExpression
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
                    // InternalJqlDsl.g:1239:2: ( ruleNavigationExpression )
                    {
                    // InternalJqlDsl.g:1239:2: ( ruleNavigationExpression )
                    // InternalJqlDsl.g:1240:3: ruleNavigationExpression
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
                    // InternalJqlDsl.g:1245:2: ( ruleLiteral )
                    {
                    // InternalJqlDsl.g:1245:2: ( ruleLiteral )
                    // InternalJqlDsl.g:1246:3: ruleLiteral
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


    // $ANTLR start "rule__Transformation__Alternatives_2_1"
    // InternalJqlDsl.g:1255:1: rule__Transformation__Alternatives_2_1 : ( ( ( rule__Transformation__LambdaAssignment_2_1_0 ) ) | ( ( rule__Transformation__Group_2_1_1__0 ) ) );
    public final void rule__Transformation__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1259:1: ( ( ( rule__Transformation__LambdaAssignment_2_1_0 ) ) | ( ( rule__Transformation__Group_2_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==36) ) {
                    alt11=1;
                }
                else if ( ((LA11_1>=14 && LA11_1<=29)||LA11_1==35||LA11_1==37||(LA11_1>=46 && LA11_1<=48)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_INTEGER && LA11_0<=RULE_TIMESTAMP)||(LA11_0>=24 && LA11_0<=25)||(LA11_0>=29 && LA11_0<=32)||(LA11_0>=34 && LA11_0<=35)||(LA11_0>=37 && LA11_0<=38)||LA11_0==45||LA11_0==49) ) {
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
                    // InternalJqlDsl.g:1260:2: ( ( rule__Transformation__LambdaAssignment_2_1_0 ) )
                    {
                    // InternalJqlDsl.g:1260:2: ( ( rule__Transformation__LambdaAssignment_2_1_0 ) )
                    // InternalJqlDsl.g:1261:3: ( rule__Transformation__LambdaAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransformationAccess().getLambdaAssignment_2_1_0()); 
                    }
                    // InternalJqlDsl.g:1262:3: ( rule__Transformation__LambdaAssignment_2_1_0 )
                    // InternalJqlDsl.g:1262:4: rule__Transformation__LambdaAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__LambdaAssignment_2_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransformationAccess().getLambdaAssignment_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1266:2: ( ( rule__Transformation__Group_2_1_1__0 ) )
                    {
                    // InternalJqlDsl.g:1266:2: ( ( rule__Transformation__Group_2_1_1__0 ) )
                    // InternalJqlDsl.g:1267:3: ( rule__Transformation__Group_2_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransformationAccess().getGroup_2_1_1()); 
                    }
                    // InternalJqlDsl.g:1268:3: ( rule__Transformation__Group_2_1_1__0 )
                    // InternalJqlDsl.g:1268:4: rule__Transformation__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__Group_2_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransformationAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__Transformation__Alternatives_2_1"


    // $ANTLR start "rule__SwitchExpression__BodyAlternatives_3_0"
    // InternalJqlDsl.g:1276:1: rule__SwitchExpression__BodyAlternatives_3_0 : ( ( ruleSwitchConditionalExpression ) | ( ruleSwitchEqualsExpression ) );
    public final void rule__SwitchExpression__BodyAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1280:1: ( ( ruleSwitchConditionalExpression ) | ( ruleSwitchEqualsExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||LA12_0==35||LA12_0==37||(LA12_0>=40 && LA12_0<=41)) ) {
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
                    // InternalJqlDsl.g:1281:2: ( ruleSwitchConditionalExpression )
                    {
                    // InternalJqlDsl.g:1281:2: ( ruleSwitchConditionalExpression )
                    // InternalJqlDsl.g:1282:3: ruleSwitchConditionalExpression
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
                    // InternalJqlDsl.g:1287:2: ( ruleSwitchEqualsExpression )
                    {
                    // InternalJqlDsl.g:1287:2: ( ruleSwitchEqualsExpression )
                    // InternalJqlDsl.g:1288:3: ruleSwitchEqualsExpression
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalJqlDsl.g:1297:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1301:1: ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 32:
            case 49:
                {
                alt13=1;
                }
                break;
            case RULE_INTEGER:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==43) ) {
                    alt13=6;
                }
                else if ( (LA13_2==EOF||(LA13_2>=14 && LA13_2<=29)||LA13_2==35||LA13_2==37||(LA13_2>=39 && LA13_2<=42)) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMAL:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==43) ) {
                    alt13=6;
                }
                else if ( (LA13_3==EOF||(LA13_3>=14 && LA13_3<=29)||LA13_3==35||LA13_3==37||(LA13_3>=39 && LA13_3<=42)) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case RULE_DATE:
            case RULE_TIMESTAMP:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalJqlDsl.g:1302:2: ( ruleBooleanLiteral )
                    {
                    // InternalJqlDsl.g:1302:2: ( ruleBooleanLiteral )
                    // InternalJqlDsl.g:1303:3: ruleBooleanLiteral
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
                    // InternalJqlDsl.g:1308:2: ( ruleNumberLiteral )
                    {
                    // InternalJqlDsl.g:1308:2: ( ruleNumberLiteral )
                    // InternalJqlDsl.g:1309:3: ruleNumberLiteral
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
                    // InternalJqlDsl.g:1314:2: ( ruleStringLiteral )
                    {
                    // InternalJqlDsl.g:1314:2: ( ruleStringLiteral )
                    // InternalJqlDsl.g:1315:3: ruleStringLiteral
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
                    // InternalJqlDsl.g:1320:2: ( ruleTemporalLiteral )
                    {
                    // InternalJqlDsl.g:1320:2: ( ruleTemporalLiteral )
                    // InternalJqlDsl.g:1321:3: ruleTemporalLiteral
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
                    // InternalJqlDsl.g:1326:2: ( ruleEnumLiteral )
                    {
                    // InternalJqlDsl.g:1326:2: ( ruleEnumLiteral )
                    // InternalJqlDsl.g:1327:3: ruleEnumLiteral
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
                    // InternalJqlDsl.g:1332:2: ( ruleMeasuredLiteral )
                    {
                    // InternalJqlDsl.g:1332:2: ( ruleMeasuredLiteral )
                    // InternalJqlDsl.g:1333:3: ruleMeasuredLiteral
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
    // InternalJqlDsl.g:1342:1: rule__BooleanLiteral__Alternatives_1 : ( ( 'false' ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1346:1: ( ( 'false' ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==49) ) {
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
                    // InternalJqlDsl.g:1347:2: ( 'false' )
                    {
                    // InternalJqlDsl.g:1347:2: ( 'false' )
                    // InternalJqlDsl.g:1348:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:1353:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    {
                    // InternalJqlDsl.g:1353:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    // InternalJqlDsl.g:1354:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_1()); 
                    }
                    // InternalJqlDsl.g:1355:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    // InternalJqlDsl.g:1355:4: rule__BooleanLiteral__IsTrueAssignment_1_1
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
    // InternalJqlDsl.g:1363:1: rule__NumberLiteral__Alternatives : ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) );
    public final void rule__NumberLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1367:1: ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INTEGER) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_DECIMAL) ) {
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
                    // InternalJqlDsl.g:1368:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1368:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    // InternalJqlDsl.g:1369:3: ( rule__NumberLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1370:3: ( rule__NumberLiteral__Group_0__0 )
                    // InternalJqlDsl.g:1370:4: rule__NumberLiteral__Group_0__0
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
                    // InternalJqlDsl.g:1374:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1374:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    // InternalJqlDsl.g:1375:3: ( rule__NumberLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1376:3: ( rule__NumberLiteral__Group_1__0 )
                    // InternalJqlDsl.g:1376:4: rule__NumberLiteral__Group_1__0
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
    // InternalJqlDsl.g:1384:1: rule__TemporalLiteral__Alternatives : ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) );
    public final void rule__TemporalLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1388:1: ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DATE) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_TIMESTAMP) ) {
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
                    // InternalJqlDsl.g:1389:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDsl.g:1389:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    // InternalJqlDsl.g:1390:3: ( rule__TemporalLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDsl.g:1391:3: ( rule__TemporalLiteral__Group_0__0 )
                    // InternalJqlDsl.g:1391:4: rule__TemporalLiteral__Group_0__0
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
                    // InternalJqlDsl.g:1395:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDsl.g:1395:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    // InternalJqlDsl.g:1396:3: ( rule__TemporalLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDsl.g:1397:3: ( rule__TemporalLiteral__Group_1__0 )
                    // InternalJqlDsl.g:1397:4: rule__TemporalLiteral__Group_1__0
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
    // InternalJqlDsl.g:1405:1: rule__NavigationBase__Alternatives : ( ( ruleValidID ) | ( ruleQualifiedName ) );
    public final void rule__NavigationBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1409:1: ( ( ruleValidID ) | ( ruleQualifiedName ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==48) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||(LA17_1>=14 && LA17_1<=29)||LA17_1==35||LA17_1==37||(LA17_1>=39 && LA17_1<=42)||(LA17_1>=46 && LA17_1<=47)) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJqlDsl.g:1410:2: ( ruleValidID )
                    {
                    // InternalJqlDsl.g:1410:2: ( ruleValidID )
                    // InternalJqlDsl.g:1411:3: ruleValidID
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
                    // InternalJqlDsl.g:1416:2: ( ruleQualifiedName )
                    {
                    // InternalJqlDsl.g:1416:2: ( ruleQualifiedName )
                    // InternalJqlDsl.g:1417:3: ruleQualifiedName
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
    // InternalJqlDsl.g:1426:1: rule__ConcatenateExpression__Group__0 : rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1 ;
    public final void rule__ConcatenateExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1430:1: ( rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1 )
            // InternalJqlDsl.g:1431:2: rule__ConcatenateExpression__Group__0__Impl rule__ConcatenateExpression__Group__1
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
    // InternalJqlDsl.g:1438:1: rule__ConcatenateExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ConcatenateExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1442:1: ( ( ruleOrExpression ) )
            // InternalJqlDsl.g:1443:1: ( ruleOrExpression )
            {
            // InternalJqlDsl.g:1443:1: ( ruleOrExpression )
            // InternalJqlDsl.g:1444:2: ruleOrExpression
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
    // InternalJqlDsl.g:1453:1: rule__ConcatenateExpression__Group__1 : rule__ConcatenateExpression__Group__1__Impl ;
    public final void rule__ConcatenateExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1457:1: ( rule__ConcatenateExpression__Group__1__Impl )
            // InternalJqlDsl.g:1458:2: rule__ConcatenateExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1464:1: rule__ConcatenateExpression__Group__1__Impl : ( ( rule__ConcatenateExpression__Group_1__0 )* ) ;
    public final void rule__ConcatenateExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1468:1: ( ( ( rule__ConcatenateExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1469:1: ( ( rule__ConcatenateExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1469:1: ( ( rule__ConcatenateExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1470:2: ( rule__ConcatenateExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1471:2: ( rule__ConcatenateExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJqlDsl.g:1471:3: rule__ConcatenateExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ConcatenateExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalJqlDsl.g:1480:1: rule__ConcatenateExpression__Group_1__0 : rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1 ;
    public final void rule__ConcatenateExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1484:1: ( rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1 )
            // InternalJqlDsl.g:1485:2: rule__ConcatenateExpression__Group_1__0__Impl rule__ConcatenateExpression__Group_1__1
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
    // InternalJqlDsl.g:1492:1: rule__ConcatenateExpression__Group_1__0__Impl : ( ( rule__ConcatenateExpression__Group_1_0__0 ) ) ;
    public final void rule__ConcatenateExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1496:1: ( ( ( rule__ConcatenateExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1497:1: ( ( rule__ConcatenateExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1497:1: ( ( rule__ConcatenateExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1498:2: ( rule__ConcatenateExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1499:2: ( rule__ConcatenateExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1499:3: rule__ConcatenateExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1507:1: rule__ConcatenateExpression__Group_1__1 : rule__ConcatenateExpression__Group_1__1__Impl ;
    public final void rule__ConcatenateExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1511:1: ( rule__ConcatenateExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1512:2: rule__ConcatenateExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1518:1: rule__ConcatenateExpression__Group_1__1__Impl : ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__ConcatenateExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1522:1: ( ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1523:1: ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1523:1: ( ( rule__ConcatenateExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1524:2: ( rule__ConcatenateExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1525:2: ( rule__ConcatenateExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1525:3: rule__ConcatenateExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1534:1: rule__ConcatenateExpression__Group_1_0__0 : rule__ConcatenateExpression__Group_1_0__0__Impl ;
    public final void rule__ConcatenateExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1538:1: ( rule__ConcatenateExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1539:2: rule__ConcatenateExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1545:1: rule__ConcatenateExpression__Group_1_0__0__Impl : ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConcatenateExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1549:1: ( ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1550:1: ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1550:1: ( ( rule__ConcatenateExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1551:2: ( rule__ConcatenateExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1552:2: ( rule__ConcatenateExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1552:3: rule__ConcatenateExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1561:1: rule__ConcatenateExpression__Group_1_0_0__0 : rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1 ;
    public final void rule__ConcatenateExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1565:1: ( rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1566:2: rule__ConcatenateExpression__Group_1_0_0__0__Impl rule__ConcatenateExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1573:1: rule__ConcatenateExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConcatenateExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1577:1: ( ( () ) )
            // InternalJqlDsl.g:1578:1: ( () )
            {
            // InternalJqlDsl.g:1578:1: ( () )
            // InternalJqlDsl.g:1579:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1580:2: ()
            // InternalJqlDsl.g:1580:3: 
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
    // InternalJqlDsl.g:1588:1: rule__ConcatenateExpression__Group_1_0_0__1 : rule__ConcatenateExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConcatenateExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1592:1: ( rule__ConcatenateExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1593:2: rule__ConcatenateExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:1599:1: rule__ConcatenateExpression__Group_1_0_0__1__Impl : ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConcatenateExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1603:1: ( ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1604:1: ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1604:1: ( ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1605:2: ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcatenateExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1606:2: ( rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1606:3: rule__ConcatenateExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:1615:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1619:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalJqlDsl.g:1620:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalJqlDsl.g:1627:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1631:1: ( ( ruleAndExpression ) )
            // InternalJqlDsl.g:1632:1: ( ruleAndExpression )
            {
            // InternalJqlDsl.g:1632:1: ( ruleAndExpression )
            // InternalJqlDsl.g:1633:2: ruleAndExpression
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
    // InternalJqlDsl.g:1642:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1646:1: ( rule__OrExpression__Group__1__Impl )
            // InternalJqlDsl.g:1647:2: rule__OrExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1653:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1657:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1658:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1658:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1659:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1660:2: ( rule__OrExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=15 && LA19_0<=16)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJqlDsl.g:1660:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalJqlDsl.g:1669:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1673:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalJqlDsl.g:1674:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalJqlDsl.g:1681:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1685:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1686:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1686:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1687:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1688:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1688:3: rule__OrExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1696:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1700:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1701:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1707:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1711:1: ( ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1712:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1712:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1713:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1714:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1714:3: rule__OrExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1723:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1727:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1728:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1734:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1738:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1739:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1739:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1740:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1741:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1741:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1750:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1754:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1755:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1762:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1766:1: ( ( () ) )
            // InternalJqlDsl.g:1767:1: ( () )
            {
            // InternalJqlDsl.g:1767:1: ( () )
            // InternalJqlDsl.g:1768:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1769:2: ()
            // InternalJqlDsl.g:1769:3: 
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
    // InternalJqlDsl.g:1777:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1781:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1782:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:1788:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1792:1: ( ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1793:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1793:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1794:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1795:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1795:3: rule__OrExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:1804:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1808:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalJqlDsl.g:1809:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalJqlDsl.g:1816:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1820:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDsl.g:1821:1: ( ruleEqualityExpression )
            {
            // InternalJqlDsl.g:1821:1: ( ruleEqualityExpression )
            // InternalJqlDsl.g:1822:2: ruleEqualityExpression
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
    // InternalJqlDsl.g:1831:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1835:1: ( rule__AndExpression__Group__1__Impl )
            // InternalJqlDsl.g:1836:2: rule__AndExpression__Group__1__Impl
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
    // InternalJqlDsl.g:1842:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1846:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:1847:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:1847:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalJqlDsl.g:1848:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:1849:2: ( rule__AndExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=17 && LA20_0<=18)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJqlDsl.g:1849:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalJqlDsl.g:1858:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1862:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalJqlDsl.g:1863:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalJqlDsl.g:1870:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1874:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:1875:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:1875:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:1876:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:1877:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalJqlDsl.g:1877:3: rule__AndExpression__Group_1_0__0
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
    // InternalJqlDsl.g:1885:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1889:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:1890:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:1896:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1900:1: ( ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:1901:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:1901:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:1902:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:1903:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:1903:3: rule__AndExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:1912:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1916:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:1917:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:1923:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1927:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:1928:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:1928:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:1929:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:1930:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:1930:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:1939:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1943:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:1944:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:1951:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1955:1: ( ( () ) )
            // InternalJqlDsl.g:1956:1: ( () )
            {
            // InternalJqlDsl.g:1956:1: ( () )
            // InternalJqlDsl.g:1957:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:1958:2: ()
            // InternalJqlDsl.g:1958:3: 
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
    // InternalJqlDsl.g:1966:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1970:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:1971:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:1977:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1981:1: ( ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:1982:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:1982:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:1983:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:1984:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:1984:3: rule__AndExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:1993:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:1997:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalJqlDsl.g:1998:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
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
    // InternalJqlDsl.g:2005:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2009:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:2010:1: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:2010:1: ( ruleRelationalExpression )
            // InternalJqlDsl.g:2011:2: ruleRelationalExpression
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
    // InternalJqlDsl.g:2020:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2024:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalJqlDsl.g:2025:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalJqlDsl.g:2031:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2035:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2036:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2036:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2037:2: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2038:2: ( rule__EqualityExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=19 && LA21_0<=20)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJqlDsl.g:2038:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalJqlDsl.g:2047:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2051:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalJqlDsl.g:2052:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
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
    // InternalJqlDsl.g:2059:1: rule__EqualityExpression__Group_1__0__Impl : ( ( rule__EqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2063:1: ( ( ( rule__EqualityExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2064:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2064:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2065:2: ( rule__EqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2066:2: ( rule__EqualityExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2066:3: rule__EqualityExpression__Group_1_0__0
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
    // InternalJqlDsl.g:2074:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2078:1: ( rule__EqualityExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2079:2: rule__EqualityExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2085:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2089:1: ( ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2090:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2090:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2091:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2092:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2092:3: rule__EqualityExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:2101:1: rule__EqualityExpression__Group_1_0__0 : rule__EqualityExpression__Group_1_0__0__Impl ;
    public final void rule__EqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2105:1: ( rule__EqualityExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2106:2: rule__EqualityExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:2112:1: rule__EqualityExpression__Group_1_0__0__Impl : ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2116:1: ( ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2117:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2117:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2118:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2119:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2119:3: rule__EqualityExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:2128:1: rule__EqualityExpression__Group_1_0_0__0 : rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 ;
    public final void rule__EqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2132:1: ( rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2133:2: rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:2140:1: rule__EqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2144:1: ( ( () ) )
            // InternalJqlDsl.g:2145:1: ( () )
            {
            // InternalJqlDsl.g:2145:1: ( () )
            // InternalJqlDsl.g:2146:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2147:2: ()
            // InternalJqlDsl.g:2147:3: 
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
    // InternalJqlDsl.g:2155:1: rule__EqualityExpression__Group_1_0_0__1 : rule__EqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__EqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2159:1: ( rule__EqualityExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2160:2: rule__EqualityExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:2166:1: rule__EqualityExpression__Group_1_0_0__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__EqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2170:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2171:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2171:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2172:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2173:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2173:3: rule__EqualityExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:2182:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2186:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalJqlDsl.g:2187:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
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
    // InternalJqlDsl.g:2194:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2198:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDsl.g:2199:1: ( ruleAdditiveExpression )
            {
            // InternalJqlDsl.g:2199:1: ( ruleAdditiveExpression )
            // InternalJqlDsl.g:2200:2: ruleAdditiveExpression
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
    // InternalJqlDsl.g:2209:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2213:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalJqlDsl.g:2214:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalJqlDsl.g:2220:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2224:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2225:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2225:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2226:2: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2227:2: ( rule__RelationalExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=21 && LA22_0<=23)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalJqlDsl.g:2227:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalJqlDsl.g:2236:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2240:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalJqlDsl.g:2241:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
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
    // InternalJqlDsl.g:2248:1: rule__RelationalExpression__Group_1__0__Impl : ( ( rule__RelationalExpression__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2252:1: ( ( ( rule__RelationalExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2253:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2253:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2254:2: ( rule__RelationalExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2255:2: ( rule__RelationalExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2255:3: rule__RelationalExpression__Group_1_0__0
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
    // InternalJqlDsl.g:2263:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2267:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2268:2: rule__RelationalExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2274:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2278:1: ( ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2279:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2279:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2280:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2281:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2281:3: rule__RelationalExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:2290:1: rule__RelationalExpression__Group_1_0__0 : rule__RelationalExpression__Group_1_0__0__Impl ;
    public final void rule__RelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2294:1: ( rule__RelationalExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2295:2: rule__RelationalExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:2301:1: rule__RelationalExpression__Group_1_0__0__Impl : ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2305:1: ( ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2306:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2306:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2307:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2308:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2308:3: rule__RelationalExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:2317:1: rule__RelationalExpression__Group_1_0_0__0 : rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 ;
    public final void rule__RelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2321:1: ( rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2322:2: rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:2329:1: rule__RelationalExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2333:1: ( ( () ) )
            // InternalJqlDsl.g:2334:1: ( () )
            {
            // InternalJqlDsl.g:2334:1: ( () )
            // InternalJqlDsl.g:2335:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2336:2: ()
            // InternalJqlDsl.g:2336:3: 
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
    // InternalJqlDsl.g:2344:1: rule__RelationalExpression__Group_1_0_0__1 : rule__RelationalExpression__Group_1_0_0__1__Impl ;
    public final void rule__RelationalExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2348:1: ( rule__RelationalExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2349:2: rule__RelationalExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:2355:1: rule__RelationalExpression__Group_1_0_0__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__RelationalExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2359:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2360:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2360:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2361:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2362:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2362:3: rule__RelationalExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:2371:1: rule__OpCompare__Group_1__0 : rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 ;
    public final void rule__OpCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2375:1: ( rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 )
            // InternalJqlDsl.g:2376:2: rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1
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
    // InternalJqlDsl.g:2383:1: rule__OpCompare__Group_1__0__Impl : ( '<' ) ;
    public final void rule__OpCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2387:1: ( ( '<' ) )
            // InternalJqlDsl.g:2388:1: ( '<' )
            {
            // InternalJqlDsl.g:2388:1: ( '<' )
            // InternalJqlDsl.g:2389:2: '<'
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
    // InternalJqlDsl.g:2398:1: rule__OpCompare__Group_1__1 : rule__OpCompare__Group_1__1__Impl ;
    public final void rule__OpCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2402:1: ( rule__OpCompare__Group_1__1__Impl )
            // InternalJqlDsl.g:2403:2: rule__OpCompare__Group_1__1__Impl
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
    // InternalJqlDsl.g:2409:1: rule__OpCompare__Group_1__1__Impl : ( '=' ) ;
    public final void rule__OpCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2413:1: ( ( '=' ) )
            // InternalJqlDsl.g:2414:1: ( '=' )
            {
            // InternalJqlDsl.g:2414:1: ( '=' )
            // InternalJqlDsl.g:2415:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:2425:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2429:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalJqlDsl.g:2430:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
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
    // InternalJqlDsl.g:2437:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2441:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDsl.g:2442:1: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDsl.g:2442:1: ( ruleMultiplicativeExpression )
            // InternalJqlDsl.g:2443:2: ruleMultiplicativeExpression
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
    // InternalJqlDsl.g:2452:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2456:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalJqlDsl.g:2457:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalJqlDsl.g:2463:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2467:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2468:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2468:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2469:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2470:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=24 && LA23_0<=25)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJqlDsl.g:2470:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalJqlDsl.g:2479:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2483:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalJqlDsl.g:2484:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
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
    // InternalJqlDsl.g:2491:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2495:1: ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) )
            // InternalJqlDsl.g:2496:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            {
            // InternalJqlDsl.g:2496:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            // InternalJqlDsl.g:2497:2: ( rule__AdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDsl.g:2498:2: ( rule__AdditiveExpression__Group_1_0__0 )
            // InternalJqlDsl.g:2498:3: rule__AdditiveExpression__Group_1_0__0
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
    // InternalJqlDsl.g:2506:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2510:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2511:2: rule__AdditiveExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2517:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2521:1: ( ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2522:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2522:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDsl.g:2523:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2524:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            // InternalJqlDsl.g:2524:3: rule__AdditiveExpression__RightOperandAssignment_1_1
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
    // InternalJqlDsl.g:2533:1: rule__AdditiveExpression__Group_1_0__0 : rule__AdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__AdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2537:1: ( rule__AdditiveExpression__Group_1_0__0__Impl )
            // InternalJqlDsl.g:2538:2: rule__AdditiveExpression__Group_1_0__0__Impl
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
    // InternalJqlDsl.g:2544:1: rule__AdditiveExpression__Group_1_0__0__Impl : ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2548:1: ( ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDsl.g:2549:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDsl.g:2549:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            // InternalJqlDsl.g:2550:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDsl.g:2551:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            // InternalJqlDsl.g:2551:3: rule__AdditiveExpression__Group_1_0_0__0
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
    // InternalJqlDsl.g:2560:1: rule__AdditiveExpression__Group_1_0_0__0 : rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 ;
    public final void rule__AdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2564:1: ( rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 )
            // InternalJqlDsl.g:2565:2: rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1
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
    // InternalJqlDsl.g:2572:1: rule__AdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2576:1: ( ( () ) )
            // InternalJqlDsl.g:2577:1: ( () )
            {
            // InternalJqlDsl.g:2577:1: ( () )
            // InternalJqlDsl.g:2578:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDsl.g:2579:2: ()
            // InternalJqlDsl.g:2579:3: 
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
    // InternalJqlDsl.g:2587:1: rule__AdditiveExpression__Group_1_0_0__1 : rule__AdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2591:1: ( rule__AdditiveExpression__Group_1_0_0__1__Impl )
            // InternalJqlDsl.g:2592:2: rule__AdditiveExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDsl.g:2598:1: rule__AdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2602:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDsl.g:2603:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDsl.g:2603:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDsl.g:2604:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDsl.g:2605:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDsl.g:2605:3: rule__AdditiveExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDsl.g:2614:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2618:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalJqlDsl.g:2619:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
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
    // InternalJqlDsl.g:2626:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2630:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:2631:1: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:2631:1: ( ruleUnaryOperation )
            // InternalJqlDsl.g:2632:2: ruleUnaryOperation
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
    // InternalJqlDsl.g:2641:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2645:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // InternalJqlDsl.g:2646:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
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
    // InternalJqlDsl.g:2653:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2657:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:2658:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:2658:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalJqlDsl.g:2659:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:2660:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalJqlDsl.g:2660:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalJqlDsl.g:2668:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2672:1: ( rule__MultiplicativeExpression__Group__2__Impl )
            // InternalJqlDsl.g:2673:2: rule__MultiplicativeExpression__Group__2__Impl
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
    // InternalJqlDsl.g:2679:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__Group_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2683:1: ( ( ( rule__MultiplicativeExpression__Group_2__0 )* ) )
            // InternalJqlDsl.g:2684:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            {
            // InternalJqlDsl.g:2684:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            // InternalJqlDsl.g:2685:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:2686:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=26 && LA25_0<=28)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJqlDsl.g:2686:3: rule__MultiplicativeExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MultiplicativeExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalJqlDsl.g:2695:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2699:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalJqlDsl.g:2700:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalJqlDsl.g:2707:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( '!' ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2711:1: ( ( ( '!' ) ) )
            // InternalJqlDsl.g:2712:1: ( ( '!' ) )
            {
            // InternalJqlDsl.g:2712:1: ( ( '!' ) )
            // InternalJqlDsl.g:2713:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getExclamationMarkKeyword_1_0()); 
            }
            // InternalJqlDsl.g:2714:2: ( '!' )
            // InternalJqlDsl.g:2714:3: '!'
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDsl.g:2722:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2726:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:2727:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:2733:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__TransformationsAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2737:1: ( ( ( rule__MultiplicativeExpression__TransformationsAssignment_1_1 ) ) )
            // InternalJqlDsl.g:2738:1: ( ( rule__MultiplicativeExpression__TransformationsAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:2738:1: ( ( rule__MultiplicativeExpression__TransformationsAssignment_1_1 ) )
            // InternalJqlDsl.g:2739:2: ( rule__MultiplicativeExpression__TransformationsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getTransformationsAssignment_1_1()); 
            }
            // InternalJqlDsl.g:2740:2: ( rule__MultiplicativeExpression__TransformationsAssignment_1_1 )
            // InternalJqlDsl.g:2740:3: rule__MultiplicativeExpression__TransformationsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__TransformationsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getTransformationsAssignment_1_1()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:2749:1: rule__MultiplicativeExpression__Group_2__0 : rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2753:1: ( rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 )
            // InternalJqlDsl.g:2754:2: rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1
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
    // InternalJqlDsl.g:2761:1: rule__MultiplicativeExpression__Group_2__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2765:1: ( ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) )
            // InternalJqlDsl.g:2766:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            {
            // InternalJqlDsl.g:2766:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            // InternalJqlDsl.g:2767:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0()); 
            }
            // InternalJqlDsl.g:2768:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            // InternalJqlDsl.g:2768:3: rule__MultiplicativeExpression__Group_2_0__0
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
    // InternalJqlDsl.g:2776:1: rule__MultiplicativeExpression__Group_2__1 : rule__MultiplicativeExpression__Group_2__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2780:1: ( rule__MultiplicativeExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:2781:2: rule__MultiplicativeExpression__Group_2__1__Impl
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
    // InternalJqlDsl.g:2787:1: rule__MultiplicativeExpression__Group_2__1__Impl : ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2791:1: ( ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) )
            // InternalJqlDsl.g:2792:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:2792:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            // InternalJqlDsl.g:2793:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandAssignment_2_1()); 
            }
            // InternalJqlDsl.g:2794:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            // InternalJqlDsl.g:2794:3: rule__MultiplicativeExpression__RightOperandAssignment_2_1
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
    // InternalJqlDsl.g:2803:1: rule__MultiplicativeExpression__Group_2_0__0 : rule__MultiplicativeExpression__Group_2_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2807:1: ( rule__MultiplicativeExpression__Group_2_0__0__Impl )
            // InternalJqlDsl.g:2808:2: rule__MultiplicativeExpression__Group_2_0__0__Impl
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
    // InternalJqlDsl.g:2814:1: rule__MultiplicativeExpression__Group_2_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2818:1: ( ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) )
            // InternalJqlDsl.g:2819:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            {
            // InternalJqlDsl.g:2819:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            // InternalJqlDsl.g:2820:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0_0()); 
            }
            // InternalJqlDsl.g:2821:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            // InternalJqlDsl.g:2821:3: rule__MultiplicativeExpression__Group_2_0_0__0
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
    // InternalJqlDsl.g:2830:1: rule__MultiplicativeExpression__Group_2_0_0__0 : rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2834:1: ( rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 )
            // InternalJqlDsl.g:2835:2: rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1
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
    // InternalJqlDsl.g:2842:1: rule__MultiplicativeExpression__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2846:1: ( ( () ) )
            // InternalJqlDsl.g:2847:1: ( () )
            {
            // InternalJqlDsl.g:2847:1: ( () )
            // InternalJqlDsl.g:2848:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftOperandAction_2_0_0_0()); 
            }
            // InternalJqlDsl.g:2849:2: ()
            // InternalJqlDsl.g:2849:3: 
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
    // InternalJqlDsl.g:2857:1: rule__MultiplicativeExpression__Group_2_0_0__1 : rule__MultiplicativeExpression__Group_2_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2861:1: ( rule__MultiplicativeExpression__Group_2_0_0__1__Impl )
            // InternalJqlDsl.g:2862:2: rule__MultiplicativeExpression__Group_2_0_0__1__Impl
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
    // InternalJqlDsl.g:2868:1: rule__MultiplicativeExpression__Group_2_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2872:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) )
            // InternalJqlDsl.g:2873:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            {
            // InternalJqlDsl.g:2873:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            // InternalJqlDsl.g:2874:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_2_0_0_1()); 
            }
            // InternalJqlDsl.g:2875:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            // InternalJqlDsl.g:2875:3: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1
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
    // InternalJqlDsl.g:2884:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2888:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalJqlDsl.g:2889:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
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
    // InternalJqlDsl.g:2896:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2900:1: ( ( () ) )
            // InternalJqlDsl.g:2901:1: ( () )
            {
            // InternalJqlDsl.g:2901:1: ( () )
            // InternalJqlDsl.g:2902:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); 
            }
            // InternalJqlDsl.g:2903:2: ()
            // InternalJqlDsl.g:2903:3: 
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
    // InternalJqlDsl.g:2911:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2915:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalJqlDsl.g:2916:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
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
    // InternalJqlDsl.g:2923:1: rule__UnaryOperation__Group_0__1__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2927:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalJqlDsl.g:2928:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:2928:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            // InternalJqlDsl.g:2929:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalJqlDsl.g:2930:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            // InternalJqlDsl.g:2930:3: rule__UnaryOperation__OperatorAssignment_0_1
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
    // InternalJqlDsl.g:2938:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2942:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalJqlDsl.g:2943:2: rule__UnaryOperation__Group_0__2__Impl
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
    // InternalJqlDsl.g:2949:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2953:1: ( ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalJqlDsl.g:2954:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalJqlDsl.g:2954:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            // InternalJqlDsl.g:2955:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalJqlDsl.g:2956:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            // InternalJqlDsl.g:2956:3: rule__UnaryOperation__OperandAssignment_0_2
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
    // InternalJqlDsl.g:2965:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2969:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // InternalJqlDsl.g:2970:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
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
    // InternalJqlDsl.g:2977:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2981:1: ( ( '(' ) )
            // InternalJqlDsl.g:2982:1: ( '(' )
            {
            // InternalJqlDsl.g:2982:1: ( '(' )
            // InternalJqlDsl.g:2983:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:2992:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:2996:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // InternalJqlDsl.g:2997:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
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
    // InternalJqlDsl.g:3004:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3008:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:3009:1: ( ruleExpression )
            {
            // InternalJqlDsl.g:3009:1: ( ruleExpression )
            // InternalJqlDsl.g:3010:2: ruleExpression
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
    // InternalJqlDsl.g:3019:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3023:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // InternalJqlDsl.g:3024:2: rule__ParenthesizedExpression__Group__2__Impl
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
    // InternalJqlDsl.g:3030:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3034:1: ( ( ')' ) )
            // InternalJqlDsl.g:3035:1: ( ')' )
            {
            // InternalJqlDsl.g:3035:1: ( ')' )
            // InternalJqlDsl.g:3036:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3046:1: rule__LambdaExpression__Group__0 : rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 ;
    public final void rule__LambdaExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3050:1: ( rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 )
            // InternalJqlDsl.g:3051:2: rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1
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
    // InternalJqlDsl.g:3058:1: rule__LambdaExpression__Group__0__Impl : ( () ) ;
    public final void rule__LambdaExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3062:1: ( ( () ) )
            // InternalJqlDsl.g:3063:1: ( () )
            {
            // InternalJqlDsl.g:3063:1: ( () )
            // InternalJqlDsl.g:3064:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getLambdaExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3065:2: ()
            // InternalJqlDsl.g:3065:3: 
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
    // InternalJqlDsl.g:3073:1: rule__LambdaExpression__Group__1 : rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 ;
    public final void rule__LambdaExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3077:1: ( rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 )
            // InternalJqlDsl.g:3078:2: rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2
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
    // InternalJqlDsl.g:3085:1: rule__LambdaExpression__Group__1__Impl : ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) ;
    public final void rule__LambdaExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3089:1: ( ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) )
            // InternalJqlDsl.g:3090:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            {
            // InternalJqlDsl.g:3090:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            // InternalJqlDsl.g:3091:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getArgumentAssignment_1()); 
            }
            // InternalJqlDsl.g:3092:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            // InternalJqlDsl.g:3092:3: rule__LambdaExpression__ArgumentAssignment_1
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
    // InternalJqlDsl.g:3100:1: rule__LambdaExpression__Group__2 : rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 ;
    public final void rule__LambdaExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3104:1: ( rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 )
            // InternalJqlDsl.g:3105:2: rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3
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
    // InternalJqlDsl.g:3112:1: rule__LambdaExpression__Group__2__Impl : ( '|' ) ;
    public final void rule__LambdaExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3116:1: ( ( '|' ) )
            // InternalJqlDsl.g:3117:1: ( '|' )
            {
            // InternalJqlDsl.g:3117:1: ( '|' )
            // InternalJqlDsl.g:3118:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getVerticalLineKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:3127:1: rule__LambdaExpression__Group__3 : rule__LambdaExpression__Group__3__Impl ;
    public final void rule__LambdaExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3131:1: ( rule__LambdaExpression__Group__3__Impl )
            // InternalJqlDsl.g:3132:2: rule__LambdaExpression__Group__3__Impl
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
    // InternalJqlDsl.g:3138:1: rule__LambdaExpression__Group__3__Impl : ( ( rule__LambdaExpression__StatementAssignment_3 ) ) ;
    public final void rule__LambdaExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3142:1: ( ( ( rule__LambdaExpression__StatementAssignment_3 ) ) )
            // InternalJqlDsl.g:3143:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            {
            // InternalJqlDsl.g:3143:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            // InternalJqlDsl.g:3144:2: ( rule__LambdaExpression__StatementAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getStatementAssignment_3()); 
            }
            // InternalJqlDsl.g:3145:2: ( rule__LambdaExpression__StatementAssignment_3 )
            // InternalJqlDsl.g:3145:3: rule__LambdaExpression__StatementAssignment_3
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


    // $ANTLR start "rule__Transformation__Group__0"
    // InternalJqlDsl.g:3154:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3158:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // InternalJqlDsl.g:3159:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Transformation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__1();

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
    // $ANTLR end "rule__Transformation__Group__0"


    // $ANTLR start "rule__Transformation__Group__0__Impl"
    // InternalJqlDsl.g:3166:1: rule__Transformation__Group__0__Impl : ( () ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3170:1: ( ( () ) )
            // InternalJqlDsl.g:3171:1: ( () )
            {
            // InternalJqlDsl.g:3171:1: ( () )
            // InternalJqlDsl.g:3172:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getTransformationAction_0()); 
            }
            // InternalJqlDsl.g:3173:2: ()
            // InternalJqlDsl.g:3173:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getTransformationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0__Impl"


    // $ANTLR start "rule__Transformation__Group__1"
    // InternalJqlDsl.g:3181:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3185:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // InternalJqlDsl.g:3186:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Transformation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__2();

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
    // $ANTLR end "rule__Transformation__Group__1"


    // $ANTLR start "rule__Transformation__Group__1__Impl"
    // InternalJqlDsl.g:3193:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__FeatureAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3197:1: ( ( ( rule__Transformation__FeatureAssignment_1 ) ) )
            // InternalJqlDsl.g:3198:1: ( ( rule__Transformation__FeatureAssignment_1 ) )
            {
            // InternalJqlDsl.g:3198:1: ( ( rule__Transformation__FeatureAssignment_1 ) )
            // InternalJqlDsl.g:3199:2: ( rule__Transformation__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getFeatureAssignment_1()); 
            }
            // InternalJqlDsl.g:3200:2: ( rule__Transformation__FeatureAssignment_1 )
            // InternalJqlDsl.g:3200:3: rule__Transformation__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__FeatureAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getFeatureAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1__Impl"


    // $ANTLR start "rule__Transformation__Group__2"
    // InternalJqlDsl.g:3208:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3212:1: ( rule__Transformation__Group__2__Impl )
            // InternalJqlDsl.g:3213:2: rule__Transformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__2__Impl();

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
    // $ANTLR end "rule__Transformation__Group__2"


    // $ANTLR start "rule__Transformation__Group__2__Impl"
    // InternalJqlDsl.g:3219:1: rule__Transformation__Group__2__Impl : ( ( rule__Transformation__Group_2__0 )? ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3223:1: ( ( ( rule__Transformation__Group_2__0 )? ) )
            // InternalJqlDsl.g:3224:1: ( ( rule__Transformation__Group_2__0 )? )
            {
            // InternalJqlDsl.g:3224:1: ( ( rule__Transformation__Group_2__0 )? )
            // InternalJqlDsl.g:3225:2: ( rule__Transformation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:3226:2: ( rule__Transformation__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJqlDsl.g:3226:3: rule__Transformation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2__Impl"


    // $ANTLR start "rule__Transformation__Group_2__0"
    // InternalJqlDsl.g:3235:1: rule__Transformation__Group_2__0 : rule__Transformation__Group_2__0__Impl rule__Transformation__Group_2__1 ;
    public final void rule__Transformation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3239:1: ( rule__Transformation__Group_2__0__Impl rule__Transformation__Group_2__1 )
            // InternalJqlDsl.g:3240:2: rule__Transformation__Group_2__0__Impl rule__Transformation__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Transformation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2__1();

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
    // $ANTLR end "rule__Transformation__Group_2__0"


    // $ANTLR start "rule__Transformation__Group_2__0__Impl"
    // InternalJqlDsl.g:3247:1: rule__Transformation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Transformation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3251:1: ( ( '(' ) )
            // InternalJqlDsl.g:3252:1: ( '(' )
            {
            // InternalJqlDsl.g:3252:1: ( '(' )
            // InternalJqlDsl.g:3253:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2__0__Impl"


    // $ANTLR start "rule__Transformation__Group_2__1"
    // InternalJqlDsl.g:3262:1: rule__Transformation__Group_2__1 : rule__Transformation__Group_2__1__Impl rule__Transformation__Group_2__2 ;
    public final void rule__Transformation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3266:1: ( rule__Transformation__Group_2__1__Impl rule__Transformation__Group_2__2 )
            // InternalJqlDsl.g:3267:2: rule__Transformation__Group_2__1__Impl rule__Transformation__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__Transformation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2__2();

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
    // $ANTLR end "rule__Transformation__Group_2__1"


    // $ANTLR start "rule__Transformation__Group_2__1__Impl"
    // InternalJqlDsl.g:3274:1: rule__Transformation__Group_2__1__Impl : ( ( rule__Transformation__Alternatives_2_1 ) ) ;
    public final void rule__Transformation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3278:1: ( ( ( rule__Transformation__Alternatives_2_1 ) ) )
            // InternalJqlDsl.g:3279:1: ( ( rule__Transformation__Alternatives_2_1 ) )
            {
            // InternalJqlDsl.g:3279:1: ( ( rule__Transformation__Alternatives_2_1 ) )
            // InternalJqlDsl.g:3280:2: ( rule__Transformation__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getAlternatives_2_1()); 
            }
            // InternalJqlDsl.g:3281:2: ( rule__Transformation__Alternatives_2_1 )
            // InternalJqlDsl.g:3281:3: rule__Transformation__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2__1__Impl"


    // $ANTLR start "rule__Transformation__Group_2__2"
    // InternalJqlDsl.g:3289:1: rule__Transformation__Group_2__2 : rule__Transformation__Group_2__2__Impl ;
    public final void rule__Transformation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3293:1: ( rule__Transformation__Group_2__2__Impl )
            // InternalJqlDsl.g:3294:2: rule__Transformation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2__2__Impl();

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
    // $ANTLR end "rule__Transformation__Group_2__2"


    // $ANTLR start "rule__Transformation__Group_2__2__Impl"
    // InternalJqlDsl.g:3300:1: rule__Transformation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Transformation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3304:1: ( ( ')' ) )
            // InternalJqlDsl.g:3305:1: ( ')' )
            {
            // InternalJqlDsl.g:3305:1: ( ')' )
            // InternalJqlDsl.g:3306:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2__2__Impl"


    // $ANTLR start "rule__Transformation__Group_2_1_1__0"
    // InternalJqlDsl.g:3316:1: rule__Transformation__Group_2_1_1__0 : rule__Transformation__Group_2_1_1__0__Impl rule__Transformation__Group_2_1_1__1 ;
    public final void rule__Transformation__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3320:1: ( rule__Transformation__Group_2_1_1__0__Impl rule__Transformation__Group_2_1_1__1 )
            // InternalJqlDsl.g:3321:2: rule__Transformation__Group_2_1_1__0__Impl rule__Transformation__Group_2_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Transformation__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2_1_1__1();

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
    // $ANTLR end "rule__Transformation__Group_2_1_1__0"


    // $ANTLR start "rule__Transformation__Group_2_1_1__0__Impl"
    // InternalJqlDsl.g:3328:1: rule__Transformation__Group_2_1_1__0__Impl : ( ( rule__Transformation__ParametersAssignment_2_1_1_0 )? ) ;
    public final void rule__Transformation__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3332:1: ( ( ( rule__Transformation__ParametersAssignment_2_1_1_0 )? ) )
            // InternalJqlDsl.g:3333:1: ( ( rule__Transformation__ParametersAssignment_2_1_1_0 )? )
            {
            // InternalJqlDsl.g:3333:1: ( ( rule__Transformation__ParametersAssignment_2_1_1_0 )? )
            // InternalJqlDsl.g:3334:2: ( rule__Transformation__ParametersAssignment_2_1_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getParametersAssignment_2_1_1_0()); 
            }
            // InternalJqlDsl.g:3335:2: ( rule__Transformation__ParametersAssignment_2_1_1_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_TIMESTAMP)||(LA27_0>=24 && LA27_0<=25)||(LA27_0>=29 && LA27_0<=32)||LA27_0==34||LA27_0==38||LA27_0==45||LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJqlDsl.g:3335:3: rule__Transformation__ParametersAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__ParametersAssignment_2_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getParametersAssignment_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Transformation__Group_2_1_1__1"
    // InternalJqlDsl.g:3343:1: rule__Transformation__Group_2_1_1__1 : rule__Transformation__Group_2_1_1__1__Impl ;
    public final void rule__Transformation__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3347:1: ( rule__Transformation__Group_2_1_1__1__Impl )
            // InternalJqlDsl.g:3348:2: rule__Transformation__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Transformation__Group_2_1_1__1"


    // $ANTLR start "rule__Transformation__Group_2_1_1__1__Impl"
    // InternalJqlDsl.g:3354:1: rule__Transformation__Group_2_1_1__1__Impl : ( ( rule__Transformation__Group_2_1_1_1__0 )* ) ;
    public final void rule__Transformation__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3358:1: ( ( ( rule__Transformation__Group_2_1_1_1__0 )* ) )
            // InternalJqlDsl.g:3359:1: ( ( rule__Transformation__Group_2_1_1_1__0 )* )
            {
            // InternalJqlDsl.g:3359:1: ( ( rule__Transformation__Group_2_1_1_1__0 )* )
            // InternalJqlDsl.g:3360:2: ( rule__Transformation__Group_2_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getGroup_2_1_1_1()); 
            }
            // InternalJqlDsl.g:3361:2: ( rule__Transformation__Group_2_1_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalJqlDsl.g:3361:3: rule__Transformation__Group_2_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Transformation__Group_2_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getGroup_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Transformation__Group_2_1_1_1__0"
    // InternalJqlDsl.g:3370:1: rule__Transformation__Group_2_1_1_1__0 : rule__Transformation__Group_2_1_1_1__0__Impl rule__Transformation__Group_2_1_1_1__1 ;
    public final void rule__Transformation__Group_2_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3374:1: ( rule__Transformation__Group_2_1_1_1__0__Impl rule__Transformation__Group_2_1_1_1__1 )
            // InternalJqlDsl.g:3375:2: rule__Transformation__Group_2_1_1_1__0__Impl rule__Transformation__Group_2_1_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Transformation__Group_2_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2_1_1_1__1();

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
    // $ANTLR end "rule__Transformation__Group_2_1_1_1__0"


    // $ANTLR start "rule__Transformation__Group_2_1_1_1__0__Impl"
    // InternalJqlDsl.g:3382:1: rule__Transformation__Group_2_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Transformation__Group_2_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3386:1: ( ( ',' ) )
            // InternalJqlDsl.g:3387:1: ( ',' )
            {
            // InternalJqlDsl.g:3387:1: ( ',' )
            // InternalJqlDsl.g:3388:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getCommaKeyword_2_1_1_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getCommaKeyword_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2_1_1_1__0__Impl"


    // $ANTLR start "rule__Transformation__Group_2_1_1_1__1"
    // InternalJqlDsl.g:3397:1: rule__Transformation__Group_2_1_1_1__1 : rule__Transformation__Group_2_1_1_1__1__Impl ;
    public final void rule__Transformation__Group_2_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3401:1: ( rule__Transformation__Group_2_1_1_1__1__Impl )
            // InternalJqlDsl.g:3402:2: rule__Transformation__Group_2_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_2_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Transformation__Group_2_1_1_1__1"


    // $ANTLR start "rule__Transformation__Group_2_1_1_1__1__Impl"
    // InternalJqlDsl.g:3408:1: rule__Transformation__Group_2_1_1_1__1__Impl : ( ( rule__Transformation__ParametersAssignment_2_1_1_1_1 ) ) ;
    public final void rule__Transformation__Group_2_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3412:1: ( ( ( rule__Transformation__ParametersAssignment_2_1_1_1_1 ) ) )
            // InternalJqlDsl.g:3413:1: ( ( rule__Transformation__ParametersAssignment_2_1_1_1_1 ) )
            {
            // InternalJqlDsl.g:3413:1: ( ( rule__Transformation__ParametersAssignment_2_1_1_1_1 ) )
            // InternalJqlDsl.g:3414:2: ( rule__Transformation__ParametersAssignment_2_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getParametersAssignment_2_1_1_1_1()); 
            }
            // InternalJqlDsl.g:3415:2: ( rule__Transformation__ParametersAssignment_2_1_1_1_1 )
            // InternalJqlDsl.g:3415:3: rule__Transformation__ParametersAssignment_2_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__ParametersAssignment_2_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getParametersAssignment_2_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_2_1_1_1__1__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__0"
    // InternalJqlDsl.g:3424:1: rule__SwitchExpression__Group__0 : rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 ;
    public final void rule__SwitchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3428:1: ( rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 )
            // InternalJqlDsl.g:3429:2: rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1
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
    // InternalJqlDsl.g:3436:1: rule__SwitchExpression__Group__0__Impl : ( () ) ;
    public final void rule__SwitchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3440:1: ( ( () ) )
            // InternalJqlDsl.g:3441:1: ( () )
            {
            // InternalJqlDsl.g:3441:1: ( () )
            // InternalJqlDsl.g:3442:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getSwitchExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3443:2: ()
            // InternalJqlDsl.g:3443:3: 
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
    // InternalJqlDsl.g:3451:1: rule__SwitchExpression__Group__1 : rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 ;
    public final void rule__SwitchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3455:1: ( rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 )
            // InternalJqlDsl.g:3456:2: rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2
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
    // InternalJqlDsl.g:3463:1: rule__SwitchExpression__Group__1__Impl : ( 'CASE' ) ;
    public final void rule__SwitchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3467:1: ( ( 'CASE' ) )
            // InternalJqlDsl.g:3468:1: ( 'CASE' )
            {
            // InternalJqlDsl.g:3468:1: ( 'CASE' )
            // InternalJqlDsl.g:3469:2: 'CASE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getCASEKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getCASEKeyword_1()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:3478:1: rule__SwitchExpression__Group__2 : rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 ;
    public final void rule__SwitchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3482:1: ( rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 )
            // InternalJqlDsl.g:3483:2: rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3
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
    // InternalJqlDsl.g:3490:1: rule__SwitchExpression__Group__2__Impl : ( ( rule__SwitchExpression__OperandAssignment_2 ) ) ;
    public final void rule__SwitchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3494:1: ( ( ( rule__SwitchExpression__OperandAssignment_2 ) ) )
            // InternalJqlDsl.g:3495:1: ( ( rule__SwitchExpression__OperandAssignment_2 ) )
            {
            // InternalJqlDsl.g:3495:1: ( ( rule__SwitchExpression__OperandAssignment_2 ) )
            // InternalJqlDsl.g:3496:2: ( rule__SwitchExpression__OperandAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getOperandAssignment_2()); 
            }
            // InternalJqlDsl.g:3497:2: ( rule__SwitchExpression__OperandAssignment_2 )
            // InternalJqlDsl.g:3497:3: rule__SwitchExpression__OperandAssignment_2
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
    // InternalJqlDsl.g:3505:1: rule__SwitchExpression__Group__3 : rule__SwitchExpression__Group__3__Impl ;
    public final void rule__SwitchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3509:1: ( rule__SwitchExpression__Group__3__Impl )
            // InternalJqlDsl.g:3510:2: rule__SwitchExpression__Group__3__Impl
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
    // InternalJqlDsl.g:3516:1: rule__SwitchExpression__Group__3__Impl : ( ( rule__SwitchExpression__BodyAssignment_3 ) ) ;
    public final void rule__SwitchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3520:1: ( ( ( rule__SwitchExpression__BodyAssignment_3 ) ) )
            // InternalJqlDsl.g:3521:1: ( ( rule__SwitchExpression__BodyAssignment_3 ) )
            {
            // InternalJqlDsl.g:3521:1: ( ( rule__SwitchExpression__BodyAssignment_3 ) )
            // InternalJqlDsl.g:3522:2: ( rule__SwitchExpression__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getBodyAssignment_3()); 
            }
            // InternalJqlDsl.g:3523:2: ( rule__SwitchExpression__BodyAssignment_3 )
            // InternalJqlDsl.g:3523:3: rule__SwitchExpression__BodyAssignment_3
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
    // InternalJqlDsl.g:3532:1: rule__SwitchConditionalExpression__Group__0 : rule__SwitchConditionalExpression__Group__0__Impl rule__SwitchConditionalExpression__Group__1 ;
    public final void rule__SwitchConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3536:1: ( rule__SwitchConditionalExpression__Group__0__Impl rule__SwitchConditionalExpression__Group__1 )
            // InternalJqlDsl.g:3537:2: rule__SwitchConditionalExpression__Group__0__Impl rule__SwitchConditionalExpression__Group__1
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
    // InternalJqlDsl.g:3544:1: rule__SwitchConditionalExpression__Group__0__Impl : ( () ) ;
    public final void rule__SwitchConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3548:1: ( ( () ) )
            // InternalJqlDsl.g:3549:1: ( () )
            {
            // InternalJqlDsl.g:3549:1: ( () )
            // InternalJqlDsl.g:3550:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getSwitchConditionalExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3551:2: ()
            // InternalJqlDsl.g:3551:3: 
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
    // InternalJqlDsl.g:3559:1: rule__SwitchConditionalExpression__Group__1 : rule__SwitchConditionalExpression__Group__1__Impl rule__SwitchConditionalExpression__Group__2 ;
    public final void rule__SwitchConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3563:1: ( rule__SwitchConditionalExpression__Group__1__Impl rule__SwitchConditionalExpression__Group__2 )
            // InternalJqlDsl.g:3564:2: rule__SwitchConditionalExpression__Group__1__Impl rule__SwitchConditionalExpression__Group__2
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
    // InternalJqlDsl.g:3571:1: rule__SwitchConditionalExpression__Group__1__Impl : ( 'AS' ) ;
    public final void rule__SwitchConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3575:1: ( ( 'AS' ) )
            // InternalJqlDsl.g:3576:1: ( 'AS' )
            {
            // InternalJqlDsl.g:3576:1: ( 'AS' )
            // InternalJqlDsl.g:3577:2: 'AS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getASKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getASKeyword_1()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:3586:1: rule__SwitchConditionalExpression__Group__2 : rule__SwitchConditionalExpression__Group__2__Impl rule__SwitchConditionalExpression__Group__3 ;
    public final void rule__SwitchConditionalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3590:1: ( rule__SwitchConditionalExpression__Group__2__Impl rule__SwitchConditionalExpression__Group__3 )
            // InternalJqlDsl.g:3591:2: rule__SwitchConditionalExpression__Group__2__Impl rule__SwitchConditionalExpression__Group__3
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
    // InternalJqlDsl.g:3598:1: rule__SwitchConditionalExpression__Group__2__Impl : ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) ) ;
    public final void rule__SwitchConditionalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3602:1: ( ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) ) )
            // InternalJqlDsl.g:3603:1: ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) )
            {
            // InternalJqlDsl.g:3603:1: ( ( rule__SwitchConditionalExpression__AliasAssignment_2 ) )
            // InternalJqlDsl.g:3604:2: ( rule__SwitchConditionalExpression__AliasAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getAliasAssignment_2()); 
            }
            // InternalJqlDsl.g:3605:2: ( rule__SwitchConditionalExpression__AliasAssignment_2 )
            // InternalJqlDsl.g:3605:3: rule__SwitchConditionalExpression__AliasAssignment_2
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
    // InternalJqlDsl.g:3613:1: rule__SwitchConditionalExpression__Group__3 : rule__SwitchConditionalExpression__Group__3__Impl rule__SwitchConditionalExpression__Group__4 ;
    public final void rule__SwitchConditionalExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3617:1: ( rule__SwitchConditionalExpression__Group__3__Impl rule__SwitchConditionalExpression__Group__4 )
            // InternalJqlDsl.g:3618:2: rule__SwitchConditionalExpression__Group__3__Impl rule__SwitchConditionalExpression__Group__4
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
    // InternalJqlDsl.g:3625:1: rule__SwitchConditionalExpression__Group__3__Impl : ( ( rule__SwitchConditionalExpression__Group_3__0 )* ) ;
    public final void rule__SwitchConditionalExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3629:1: ( ( ( rule__SwitchConditionalExpression__Group_3__0 )* ) )
            // InternalJqlDsl.g:3630:1: ( ( rule__SwitchConditionalExpression__Group_3__0 )* )
            {
            // InternalJqlDsl.g:3630:1: ( ( rule__SwitchConditionalExpression__Group_3__0 )* )
            // InternalJqlDsl.g:3631:2: ( rule__SwitchConditionalExpression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_3()); 
            }
            // InternalJqlDsl.g:3632:2: ( rule__SwitchConditionalExpression__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred40_InternalJqlDsl()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalJqlDsl.g:3632:3: rule__SwitchConditionalExpression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SwitchConditionalExpression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalJqlDsl.g:3640:1: rule__SwitchConditionalExpression__Group__4 : rule__SwitchConditionalExpression__Group__4__Impl ;
    public final void rule__SwitchConditionalExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3644:1: ( rule__SwitchConditionalExpression__Group__4__Impl )
            // InternalJqlDsl.g:3645:2: rule__SwitchConditionalExpression__Group__4__Impl
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
    // InternalJqlDsl.g:3651:1: rule__SwitchConditionalExpression__Group__4__Impl : ( ( rule__SwitchConditionalExpression__Group_4__0 )? ) ;
    public final void rule__SwitchConditionalExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3655:1: ( ( ( rule__SwitchConditionalExpression__Group_4__0 )? ) )
            // InternalJqlDsl.g:3656:1: ( ( rule__SwitchConditionalExpression__Group_4__0 )? )
            {
            // InternalJqlDsl.g:3656:1: ( ( rule__SwitchConditionalExpression__Group_4__0 )? )
            // InternalJqlDsl.g:3657:2: ( rule__SwitchConditionalExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getGroup_4()); 
            }
            // InternalJqlDsl.g:3658:2: ( rule__SwitchConditionalExpression__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred41_InternalJqlDsl()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalJqlDsl.g:3658:3: rule__SwitchConditionalExpression__Group_4__0
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
    // InternalJqlDsl.g:3667:1: rule__SwitchConditionalExpression__Group_3__0 : rule__SwitchConditionalExpression__Group_3__0__Impl rule__SwitchConditionalExpression__Group_3__1 ;
    public final void rule__SwitchConditionalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3671:1: ( rule__SwitchConditionalExpression__Group_3__0__Impl rule__SwitchConditionalExpression__Group_3__1 )
            // InternalJqlDsl.g:3672:2: rule__SwitchConditionalExpression__Group_3__0__Impl rule__SwitchConditionalExpression__Group_3__1
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
    // InternalJqlDsl.g:3679:1: rule__SwitchConditionalExpression__Group_3__0__Impl : ( ( 'WHEN' ) ) ;
    public final void rule__SwitchConditionalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3683:1: ( ( ( 'WHEN' ) ) )
            // InternalJqlDsl.g:3684:1: ( ( 'WHEN' ) )
            {
            // InternalJqlDsl.g:3684:1: ( ( 'WHEN' ) )
            // InternalJqlDsl.g:3685:2: ( 'WHEN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getWHENKeyword_3_0()); 
            }
            // InternalJqlDsl.g:3686:2: ( 'WHEN' )
            // InternalJqlDsl.g:3686:3: 'WHEN'
            {
            match(input,40,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getWHENKeyword_3_0()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:3694:1: rule__SwitchConditionalExpression__Group_3__1 : rule__SwitchConditionalExpression__Group_3__1__Impl ;
    public final void rule__SwitchConditionalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3698:1: ( rule__SwitchConditionalExpression__Group_3__1__Impl )
            // InternalJqlDsl.g:3699:2: rule__SwitchConditionalExpression__Group_3__1__Impl
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
    // InternalJqlDsl.g:3705:1: rule__SwitchConditionalExpression__Group_3__1__Impl : ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3709:1: ( ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) ) )
            // InternalJqlDsl.g:3710:1: ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) )
            {
            // InternalJqlDsl.g:3710:1: ( ( rule__SwitchConditionalExpression__CasesAssignment_3_1 ) )
            // InternalJqlDsl.g:3711:2: ( rule__SwitchConditionalExpression__CasesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getCasesAssignment_3_1()); 
            }
            // InternalJqlDsl.g:3712:2: ( rule__SwitchConditionalExpression__CasesAssignment_3_1 )
            // InternalJqlDsl.g:3712:3: rule__SwitchConditionalExpression__CasesAssignment_3_1
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


    // $ANTLR start "rule__SwitchConditionalExpression__Group_4__0"
    // InternalJqlDsl.g:3721:1: rule__SwitchConditionalExpression__Group_4__0 : rule__SwitchConditionalExpression__Group_4__0__Impl rule__SwitchConditionalExpression__Group_4__1 ;
    public final void rule__SwitchConditionalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3725:1: ( rule__SwitchConditionalExpression__Group_4__0__Impl rule__SwitchConditionalExpression__Group_4__1 )
            // InternalJqlDsl.g:3726:2: rule__SwitchConditionalExpression__Group_4__0__Impl rule__SwitchConditionalExpression__Group_4__1
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
    // InternalJqlDsl.g:3733:1: rule__SwitchConditionalExpression__Group_4__0__Impl : ( ( 'ELSE' ) ) ;
    public final void rule__SwitchConditionalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3737:1: ( ( ( 'ELSE' ) ) )
            // InternalJqlDsl.g:3738:1: ( ( 'ELSE' ) )
            {
            // InternalJqlDsl.g:3738:1: ( ( 'ELSE' ) )
            // InternalJqlDsl.g:3739:2: ( 'ELSE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getELSEKeyword_4_0()); 
            }
            // InternalJqlDsl.g:3740:2: ( 'ELSE' )
            // InternalJqlDsl.g:3740:3: 'ELSE'
            {
            match(input,41,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalExpressionAccess().getELSEKeyword_4_0()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:3748:1: rule__SwitchConditionalExpression__Group_4__1 : rule__SwitchConditionalExpression__Group_4__1__Impl ;
    public final void rule__SwitchConditionalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3752:1: ( rule__SwitchConditionalExpression__Group_4__1__Impl )
            // InternalJqlDsl.g:3753:2: rule__SwitchConditionalExpression__Group_4__1__Impl
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
    // InternalJqlDsl.g:3759:1: rule__SwitchConditionalExpression__Group_4__1__Impl : ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) ) ;
    public final void rule__SwitchConditionalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3763:1: ( ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) ) )
            // InternalJqlDsl.g:3764:1: ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) )
            {
            // InternalJqlDsl.g:3764:1: ( ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 ) )
            // InternalJqlDsl.g:3765:2: ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalExpressionAccess().getDefaultAssignment_4_1()); 
            }
            // InternalJqlDsl.g:3766:2: ( rule__SwitchConditionalExpression__DefaultAssignment_4_1 )
            // InternalJqlDsl.g:3766:3: rule__SwitchConditionalExpression__DefaultAssignment_4_1
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


    // $ANTLR start "rule__SwitchConditionalCase__Group__0"
    // InternalJqlDsl.g:3775:1: rule__SwitchConditionalCase__Group__0 : rule__SwitchConditionalCase__Group__0__Impl rule__SwitchConditionalCase__Group__1 ;
    public final void rule__SwitchConditionalCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3779:1: ( rule__SwitchConditionalCase__Group__0__Impl rule__SwitchConditionalCase__Group__1 )
            // InternalJqlDsl.g:3780:2: rule__SwitchConditionalCase__Group__0__Impl rule__SwitchConditionalCase__Group__1
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
    // InternalJqlDsl.g:3787:1: rule__SwitchConditionalCase__Group__0__Impl : ( () ) ;
    public final void rule__SwitchConditionalCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3791:1: ( ( () ) )
            // InternalJqlDsl.g:3792:1: ( () )
            {
            // InternalJqlDsl.g:3792:1: ( () )
            // InternalJqlDsl.g:3793:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getSwitchConditionalCaseAction_0()); 
            }
            // InternalJqlDsl.g:3794:2: ()
            // InternalJqlDsl.g:3794:3: 
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
    // InternalJqlDsl.g:3802:1: rule__SwitchConditionalCase__Group__1 : rule__SwitchConditionalCase__Group__1__Impl rule__SwitchConditionalCase__Group__2 ;
    public final void rule__SwitchConditionalCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3806:1: ( rule__SwitchConditionalCase__Group__1__Impl rule__SwitchConditionalCase__Group__2 )
            // InternalJqlDsl.g:3807:2: rule__SwitchConditionalCase__Group__1__Impl rule__SwitchConditionalCase__Group__2
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
    // InternalJqlDsl.g:3814:1: rule__SwitchConditionalCase__Group__1__Impl : ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) ) ;
    public final void rule__SwitchConditionalCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3818:1: ( ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) ) )
            // InternalJqlDsl.g:3819:1: ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) )
            {
            // InternalJqlDsl.g:3819:1: ( ( rule__SwitchConditionalCase__ConditionAssignment_1 ) )
            // InternalJqlDsl.g:3820:2: ( rule__SwitchConditionalCase__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getConditionAssignment_1()); 
            }
            // InternalJqlDsl.g:3821:2: ( rule__SwitchConditionalCase__ConditionAssignment_1 )
            // InternalJqlDsl.g:3821:3: rule__SwitchConditionalCase__ConditionAssignment_1
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
    // InternalJqlDsl.g:3829:1: rule__SwitchConditionalCase__Group__2 : rule__SwitchConditionalCase__Group__2__Impl rule__SwitchConditionalCase__Group__3 ;
    public final void rule__SwitchConditionalCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3833:1: ( rule__SwitchConditionalCase__Group__2__Impl rule__SwitchConditionalCase__Group__3 )
            // InternalJqlDsl.g:3834:2: rule__SwitchConditionalCase__Group__2__Impl rule__SwitchConditionalCase__Group__3
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
    // InternalJqlDsl.g:3841:1: rule__SwitchConditionalCase__Group__2__Impl : ( 'THEN' ) ;
    public final void rule__SwitchConditionalCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3845:1: ( ( 'THEN' ) )
            // InternalJqlDsl.g:3846:1: ( 'THEN' )
            {
            // InternalJqlDsl.g:3846:1: ( 'THEN' )
            // InternalJqlDsl.g:3847:2: 'THEN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getTHENKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchConditionalCaseAccess().getTHENKeyword_2()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:3856:1: rule__SwitchConditionalCase__Group__3 : rule__SwitchConditionalCase__Group__3__Impl ;
    public final void rule__SwitchConditionalCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3860:1: ( rule__SwitchConditionalCase__Group__3__Impl )
            // InternalJqlDsl.g:3861:2: rule__SwitchConditionalCase__Group__3__Impl
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
    // InternalJqlDsl.g:3867:1: rule__SwitchConditionalCase__Group__3__Impl : ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) ) ;
    public final void rule__SwitchConditionalCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3871:1: ( ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) ) )
            // InternalJqlDsl.g:3872:1: ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) )
            {
            // InternalJqlDsl.g:3872:1: ( ( rule__SwitchConditionalCase__ResultAssignment_3 ) )
            // InternalJqlDsl.g:3873:2: ( rule__SwitchConditionalCase__ResultAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchConditionalCaseAccess().getResultAssignment_3()); 
            }
            // InternalJqlDsl.g:3874:2: ( rule__SwitchConditionalCase__ResultAssignment_3 )
            // InternalJqlDsl.g:3874:3: rule__SwitchConditionalCase__ResultAssignment_3
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
    // InternalJqlDsl.g:3883:1: rule__SwitchEqualsExpression__Group__0 : rule__SwitchEqualsExpression__Group__0__Impl rule__SwitchEqualsExpression__Group__1 ;
    public final void rule__SwitchEqualsExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3887:1: ( rule__SwitchEqualsExpression__Group__0__Impl rule__SwitchEqualsExpression__Group__1 )
            // InternalJqlDsl.g:3888:2: rule__SwitchEqualsExpression__Group__0__Impl rule__SwitchEqualsExpression__Group__1
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
    // InternalJqlDsl.g:3895:1: rule__SwitchEqualsExpression__Group__0__Impl : ( () ) ;
    public final void rule__SwitchEqualsExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3899:1: ( ( () ) )
            // InternalJqlDsl.g:3900:1: ( () )
            {
            // InternalJqlDsl.g:3900:1: ( () )
            // InternalJqlDsl.g:3901:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getSwitchEqualsExpressionAction_0()); 
            }
            // InternalJqlDsl.g:3902:2: ()
            // InternalJqlDsl.g:3902:3: 
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
    // InternalJqlDsl.g:3910:1: rule__SwitchEqualsExpression__Group__1 : rule__SwitchEqualsExpression__Group__1__Impl rule__SwitchEqualsExpression__Group__2 ;
    public final void rule__SwitchEqualsExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3914:1: ( rule__SwitchEqualsExpression__Group__1__Impl rule__SwitchEqualsExpression__Group__2 )
            // InternalJqlDsl.g:3915:2: rule__SwitchEqualsExpression__Group__1__Impl rule__SwitchEqualsExpression__Group__2
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
    // InternalJqlDsl.g:3922:1: rule__SwitchEqualsExpression__Group__1__Impl : ( ( rule__SwitchEqualsExpression__Group_1__0 )* ) ;
    public final void rule__SwitchEqualsExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3926:1: ( ( ( rule__SwitchEqualsExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:3927:1: ( ( rule__SwitchEqualsExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:3927:1: ( ( rule__SwitchEqualsExpression__Group_1__0 )* )
            // InternalJqlDsl.g:3928:2: ( rule__SwitchEqualsExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:3929:2: ( rule__SwitchEqualsExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred42_InternalJqlDsl()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalJqlDsl.g:3929:3: rule__SwitchEqualsExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SwitchEqualsExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalJqlDsl.g:3937:1: rule__SwitchEqualsExpression__Group__2 : rule__SwitchEqualsExpression__Group__2__Impl ;
    public final void rule__SwitchEqualsExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3941:1: ( rule__SwitchEqualsExpression__Group__2__Impl )
            // InternalJqlDsl.g:3942:2: rule__SwitchEqualsExpression__Group__2__Impl
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
    // InternalJqlDsl.g:3948:1: rule__SwitchEqualsExpression__Group__2__Impl : ( ( rule__SwitchEqualsExpression__Group_2__0 )? ) ;
    public final void rule__SwitchEqualsExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3952:1: ( ( ( rule__SwitchEqualsExpression__Group_2__0 )? ) )
            // InternalJqlDsl.g:3953:1: ( ( rule__SwitchEqualsExpression__Group_2__0 )? )
            {
            // InternalJqlDsl.g:3953:1: ( ( rule__SwitchEqualsExpression__Group_2__0 )? )
            // InternalJqlDsl.g:3954:2: ( rule__SwitchEqualsExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:3955:2: ( rule__SwitchEqualsExpression__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred43_InternalJqlDsl()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalJqlDsl.g:3955:3: rule__SwitchEqualsExpression__Group_2__0
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
    // InternalJqlDsl.g:3964:1: rule__SwitchEqualsExpression__Group_1__0 : rule__SwitchEqualsExpression__Group_1__0__Impl rule__SwitchEqualsExpression__Group_1__1 ;
    public final void rule__SwitchEqualsExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3968:1: ( rule__SwitchEqualsExpression__Group_1__0__Impl rule__SwitchEqualsExpression__Group_1__1 )
            // InternalJqlDsl.g:3969:2: rule__SwitchEqualsExpression__Group_1__0__Impl rule__SwitchEqualsExpression__Group_1__1
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
    // InternalJqlDsl.g:3976:1: rule__SwitchEqualsExpression__Group_1__0__Impl : ( ( 'WHEN' ) ) ;
    public final void rule__SwitchEqualsExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3980:1: ( ( ( 'WHEN' ) ) )
            // InternalJqlDsl.g:3981:1: ( ( 'WHEN' ) )
            {
            // InternalJqlDsl.g:3981:1: ( ( 'WHEN' ) )
            // InternalJqlDsl.g:3982:2: ( 'WHEN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getWHENKeyword_1_0()); 
            }
            // InternalJqlDsl.g:3983:2: ( 'WHEN' )
            // InternalJqlDsl.g:3983:3: 'WHEN'
            {
            match(input,40,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getWHENKeyword_1_0()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:3991:1: rule__SwitchEqualsExpression__Group_1__1 : rule__SwitchEqualsExpression__Group_1__1__Impl ;
    public final void rule__SwitchEqualsExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:3995:1: ( rule__SwitchEqualsExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:3996:2: rule__SwitchEqualsExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:4002:1: rule__SwitchEqualsExpression__Group_1__1__Impl : ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4006:1: ( ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4007:1: ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4007:1: ( ( rule__SwitchEqualsExpression__CasesAssignment_1_1 ) )
            // InternalJqlDsl.g:4008:2: ( rule__SwitchEqualsExpression__CasesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getCasesAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4009:2: ( rule__SwitchEqualsExpression__CasesAssignment_1_1 )
            // InternalJqlDsl.g:4009:3: rule__SwitchEqualsExpression__CasesAssignment_1_1
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


    // $ANTLR start "rule__SwitchEqualsExpression__Group_2__0"
    // InternalJqlDsl.g:4018:1: rule__SwitchEqualsExpression__Group_2__0 : rule__SwitchEqualsExpression__Group_2__0__Impl rule__SwitchEqualsExpression__Group_2__1 ;
    public final void rule__SwitchEqualsExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4022:1: ( rule__SwitchEqualsExpression__Group_2__0__Impl rule__SwitchEqualsExpression__Group_2__1 )
            // InternalJqlDsl.g:4023:2: rule__SwitchEqualsExpression__Group_2__0__Impl rule__SwitchEqualsExpression__Group_2__1
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
    // InternalJqlDsl.g:4030:1: rule__SwitchEqualsExpression__Group_2__0__Impl : ( ( 'ELSE' ) ) ;
    public final void rule__SwitchEqualsExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4034:1: ( ( ( 'ELSE' ) ) )
            // InternalJqlDsl.g:4035:1: ( ( 'ELSE' ) )
            {
            // InternalJqlDsl.g:4035:1: ( ( 'ELSE' ) )
            // InternalJqlDsl.g:4036:2: ( 'ELSE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getELSEKeyword_2_0()); 
            }
            // InternalJqlDsl.g:4037:2: ( 'ELSE' )
            // InternalJqlDsl.g:4037:3: 'ELSE'
            {
            match(input,41,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsExpressionAccess().getELSEKeyword_2_0()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:4045:1: rule__SwitchEqualsExpression__Group_2__1 : rule__SwitchEqualsExpression__Group_2__1__Impl ;
    public final void rule__SwitchEqualsExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4049:1: ( rule__SwitchEqualsExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:4050:2: rule__SwitchEqualsExpression__Group_2__1__Impl
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
    // InternalJqlDsl.g:4056:1: rule__SwitchEqualsExpression__Group_2__1__Impl : ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) ) ;
    public final void rule__SwitchEqualsExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4060:1: ( ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) ) )
            // InternalJqlDsl.g:4061:1: ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:4061:1: ( ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 ) )
            // InternalJqlDsl.g:4062:2: ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsExpressionAccess().getDefaultAssignment_2_1()); 
            }
            // InternalJqlDsl.g:4063:2: ( rule__SwitchEqualsExpression__DefaultAssignment_2_1 )
            // InternalJqlDsl.g:4063:3: rule__SwitchEqualsExpression__DefaultAssignment_2_1
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


    // $ANTLR start "rule__SwitchEqualsCase__Group__0"
    // InternalJqlDsl.g:4072:1: rule__SwitchEqualsCase__Group__0 : rule__SwitchEqualsCase__Group__0__Impl rule__SwitchEqualsCase__Group__1 ;
    public final void rule__SwitchEqualsCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4076:1: ( rule__SwitchEqualsCase__Group__0__Impl rule__SwitchEqualsCase__Group__1 )
            // InternalJqlDsl.g:4077:2: rule__SwitchEqualsCase__Group__0__Impl rule__SwitchEqualsCase__Group__1
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
    // InternalJqlDsl.g:4084:1: rule__SwitchEqualsCase__Group__0__Impl : ( () ) ;
    public final void rule__SwitchEqualsCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4088:1: ( ( () ) )
            // InternalJqlDsl.g:4089:1: ( () )
            {
            // InternalJqlDsl.g:4089:1: ( () )
            // InternalJqlDsl.g:4090:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getSwitchEqualsCaseAction_0()); 
            }
            // InternalJqlDsl.g:4091:2: ()
            // InternalJqlDsl.g:4091:3: 
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
    // InternalJqlDsl.g:4099:1: rule__SwitchEqualsCase__Group__1 : rule__SwitchEqualsCase__Group__1__Impl rule__SwitchEqualsCase__Group__2 ;
    public final void rule__SwitchEqualsCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4103:1: ( rule__SwitchEqualsCase__Group__1__Impl rule__SwitchEqualsCase__Group__2 )
            // InternalJqlDsl.g:4104:2: rule__SwitchEqualsCase__Group__1__Impl rule__SwitchEqualsCase__Group__2
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
    // InternalJqlDsl.g:4111:1: rule__SwitchEqualsCase__Group__1__Impl : ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) ) ;
    public final void rule__SwitchEqualsCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4115:1: ( ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) ) )
            // InternalJqlDsl.g:4116:1: ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) )
            {
            // InternalJqlDsl.g:4116:1: ( ( rule__SwitchEqualsCase__ConditionAssignment_1 ) )
            // InternalJqlDsl.g:4117:2: ( rule__SwitchEqualsCase__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getConditionAssignment_1()); 
            }
            // InternalJqlDsl.g:4118:2: ( rule__SwitchEqualsCase__ConditionAssignment_1 )
            // InternalJqlDsl.g:4118:3: rule__SwitchEqualsCase__ConditionAssignment_1
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
    // InternalJqlDsl.g:4126:1: rule__SwitchEqualsCase__Group__2 : rule__SwitchEqualsCase__Group__2__Impl rule__SwitchEqualsCase__Group__3 ;
    public final void rule__SwitchEqualsCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4130:1: ( rule__SwitchEqualsCase__Group__2__Impl rule__SwitchEqualsCase__Group__3 )
            // InternalJqlDsl.g:4131:2: rule__SwitchEqualsCase__Group__2__Impl rule__SwitchEqualsCase__Group__3
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
    // InternalJqlDsl.g:4138:1: rule__SwitchEqualsCase__Group__2__Impl : ( 'THEN' ) ;
    public final void rule__SwitchEqualsCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4142:1: ( ( 'THEN' ) )
            // InternalJqlDsl.g:4143:1: ( 'THEN' )
            {
            // InternalJqlDsl.g:4143:1: ( 'THEN' )
            // InternalJqlDsl.g:4144:2: 'THEN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getTHENKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchEqualsCaseAccess().getTHENKeyword_2()); 
            }

            }


            }

        }
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
    // InternalJqlDsl.g:4153:1: rule__SwitchEqualsCase__Group__3 : rule__SwitchEqualsCase__Group__3__Impl ;
    public final void rule__SwitchEqualsCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4157:1: ( rule__SwitchEqualsCase__Group__3__Impl )
            // InternalJqlDsl.g:4158:2: rule__SwitchEqualsCase__Group__3__Impl
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
    // InternalJqlDsl.g:4164:1: rule__SwitchEqualsCase__Group__3__Impl : ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) ) ;
    public final void rule__SwitchEqualsCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4168:1: ( ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) ) )
            // InternalJqlDsl.g:4169:1: ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) )
            {
            // InternalJqlDsl.g:4169:1: ( ( rule__SwitchEqualsCase__ResultAssignment_3 ) )
            // InternalJqlDsl.g:4170:2: ( rule__SwitchEqualsCase__ResultAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchEqualsCaseAccess().getResultAssignment_3()); 
            }
            // InternalJqlDsl.g:4171:2: ( rule__SwitchEqualsCase__ResultAssignment_3 )
            // InternalJqlDsl.g:4171:3: rule__SwitchEqualsCase__ResultAssignment_3
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
    // InternalJqlDsl.g:4180:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4184:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalJqlDsl.g:4185:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
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
    // InternalJqlDsl.g:4192:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4196:1: ( ( () ) )
            // InternalJqlDsl.g:4197:1: ( () )
            {
            // InternalJqlDsl.g:4197:1: ( () )
            // InternalJqlDsl.g:4198:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4199:2: ()
            // InternalJqlDsl.g:4199:3: 
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
    // InternalJqlDsl.g:4207:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4211:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalJqlDsl.g:4212:2: rule__BooleanLiteral__Group__1__Impl
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
    // InternalJqlDsl.g:4218:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4222:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalJqlDsl.g:4223:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalJqlDsl.g:4223:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalJqlDsl.g:4224:2: ( rule__BooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalJqlDsl.g:4225:2: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalJqlDsl.g:4225:3: rule__BooleanLiteral__Alternatives_1
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
    // InternalJqlDsl.g:4234:1: rule__NumberLiteral__Group_0__0 : rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 ;
    public final void rule__NumberLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4238:1: ( rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 )
            // InternalJqlDsl.g:4239:2: rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1
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
    // InternalJqlDsl.g:4246:1: rule__NumberLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4250:1: ( ( () ) )
            // InternalJqlDsl.g:4251:1: ( () )
            {
            // InternalJqlDsl.g:4251:1: ( () )
            // InternalJqlDsl.g:4252:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getIntegerLiteralAction_0_0()); 
            }
            // InternalJqlDsl.g:4253:2: ()
            // InternalJqlDsl.g:4253:3: 
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
    // InternalJqlDsl.g:4261:1: rule__NumberLiteral__Group_0__1 : rule__NumberLiteral__Group_0__1__Impl ;
    public final void rule__NumberLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4265:1: ( rule__NumberLiteral__Group_0__1__Impl )
            // InternalJqlDsl.g:4266:2: rule__NumberLiteral__Group_0__1__Impl
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
    // InternalJqlDsl.g:4272:1: rule__NumberLiteral__Group_0__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__NumberLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4276:1: ( ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDsl.g:4277:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:4277:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDsl.g:4278:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDsl.g:4279:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            // InternalJqlDsl.g:4279:3: rule__NumberLiteral__ValueAssignment_0_1
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
    // InternalJqlDsl.g:4288:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4292:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalJqlDsl.g:4293:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
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
    // InternalJqlDsl.g:4300:1: rule__NumberLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4304:1: ( ( () ) )
            // InternalJqlDsl.g:4305:1: ( () )
            {
            // InternalJqlDsl.g:4305:1: ( () )
            // InternalJqlDsl.g:4306:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getDecimalLiteralAction_1_0()); 
            }
            // InternalJqlDsl.g:4307:2: ()
            // InternalJqlDsl.g:4307:3: 
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
    // InternalJqlDsl.g:4315:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4319:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalJqlDsl.g:4320:2: rule__NumberLiteral__Group_1__1__Impl
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
    // InternalJqlDsl.g:4326:1: rule__NumberLiteral__Group_1__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4330:1: ( ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4331:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4331:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDsl.g:4332:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4333:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            // InternalJqlDsl.g:4333:3: rule__NumberLiteral__ValueAssignment_1_1
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
    // InternalJqlDsl.g:4342:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4346:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // InternalJqlDsl.g:4347:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
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
    // InternalJqlDsl.g:4354:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4358:1: ( ( () ) )
            // InternalJqlDsl.g:4359:1: ( () )
            {
            // InternalJqlDsl.g:4359:1: ( () )
            // InternalJqlDsl.g:4360:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4361:2: ()
            // InternalJqlDsl.g:4361:3: 
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
    // InternalJqlDsl.g:4369:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4373:1: ( rule__StringLiteral__Group__1__Impl )
            // InternalJqlDsl.g:4374:2: rule__StringLiteral__Group__1__Impl
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
    // InternalJqlDsl.g:4380:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4384:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDsl.g:4385:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDsl.g:4385:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // InternalJqlDsl.g:4386:2: ( rule__StringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDsl.g:4387:2: ( rule__StringLiteral__ValueAssignment_1 )
            // InternalJqlDsl.g:4387:3: rule__StringLiteral__ValueAssignment_1
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
    // InternalJqlDsl.g:4396:1: rule__TemporalLiteral__Group_0__0 : rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 ;
    public final void rule__TemporalLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4400:1: ( rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 )
            // InternalJqlDsl.g:4401:2: rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1
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
    // InternalJqlDsl.g:4408:1: rule__TemporalLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4412:1: ( ( () ) )
            // InternalJqlDsl.g:4413:1: ( () )
            {
            // InternalJqlDsl.g:4413:1: ( () )
            // InternalJqlDsl.g:4414:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getDateLiteralAction_0_0()); 
            }
            // InternalJqlDsl.g:4415:2: ()
            // InternalJqlDsl.g:4415:3: 
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
    // InternalJqlDsl.g:4423:1: rule__TemporalLiteral__Group_0__1 : rule__TemporalLiteral__Group_0__1__Impl ;
    public final void rule__TemporalLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4427:1: ( rule__TemporalLiteral__Group_0__1__Impl )
            // InternalJqlDsl.g:4428:2: rule__TemporalLiteral__Group_0__1__Impl
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
    // InternalJqlDsl.g:4434:1: rule__TemporalLiteral__Group_0__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__TemporalLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4438:1: ( ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDsl.g:4439:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDsl.g:4439:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDsl.g:4440:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDsl.g:4441:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            // InternalJqlDsl.g:4441:3: rule__TemporalLiteral__ValueAssignment_0_1
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
    // InternalJqlDsl.g:4450:1: rule__TemporalLiteral__Group_1__0 : rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 ;
    public final void rule__TemporalLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4454:1: ( rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 )
            // InternalJqlDsl.g:4455:2: rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1
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
    // InternalJqlDsl.g:4462:1: rule__TemporalLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4466:1: ( ( () ) )
            // InternalJqlDsl.g:4467:1: ( () )
            {
            // InternalJqlDsl.g:4467:1: ( () )
            // InternalJqlDsl.g:4468:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getTimeStampLiteralAction_1_0()); 
            }
            // InternalJqlDsl.g:4469:2: ()
            // InternalJqlDsl.g:4469:3: 
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
    // InternalJqlDsl.g:4477:1: rule__TemporalLiteral__Group_1__1 : rule__TemporalLiteral__Group_1__1__Impl ;
    public final void rule__TemporalLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4481:1: ( rule__TemporalLiteral__Group_1__1__Impl )
            // InternalJqlDsl.g:4482:2: rule__TemporalLiteral__Group_1__1__Impl
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
    // InternalJqlDsl.g:4488:1: rule__TemporalLiteral__Group_1__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__TemporalLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4492:1: ( ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4493:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4493:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDsl.g:4494:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4495:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            // InternalJqlDsl.g:4495:3: rule__TemporalLiteral__ValueAssignment_1_1
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
    // InternalJqlDsl.g:4504:1: rule__MeasuredLiteral__Group__0 : rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 ;
    public final void rule__MeasuredLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4508:1: ( rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 )
            // InternalJqlDsl.g:4509:2: rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1
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
    // InternalJqlDsl.g:4516:1: rule__MeasuredLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MeasuredLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4520:1: ( ( () ) )
            // InternalJqlDsl.g:4521:1: ( () )
            {
            // InternalJqlDsl.g:4521:1: ( () )
            // InternalJqlDsl.g:4522:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasuredLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4523:2: ()
            // InternalJqlDsl.g:4523:3: 
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
    // InternalJqlDsl.g:4531:1: rule__MeasuredLiteral__Group__1 : rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 ;
    public final void rule__MeasuredLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4535:1: ( rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 )
            // InternalJqlDsl.g:4536:2: rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2
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
    // InternalJqlDsl.g:4543:1: rule__MeasuredLiteral__Group__1__Impl : ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MeasuredLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4547:1: ( ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDsl.g:4548:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDsl.g:4548:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            // InternalJqlDsl.g:4549:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDsl.g:4550:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            // InternalJqlDsl.g:4550:3: rule__MeasuredLiteral__ValueAssignment_1
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
    // InternalJqlDsl.g:4558:1: rule__MeasuredLiteral__Group__2 : rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 ;
    public final void rule__MeasuredLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4562:1: ( rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 )
            // InternalJqlDsl.g:4563:2: rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3
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
    // InternalJqlDsl.g:4570:1: rule__MeasuredLiteral__Group__2__Impl : ( '[' ) ;
    public final void rule__MeasuredLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4574:1: ( ( '[' ) )
            // InternalJqlDsl.g:4575:1: ( '[' )
            {
            // InternalJqlDsl.g:4575:1: ( '[' )
            // InternalJqlDsl.g:4576:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:4585:1: rule__MeasuredLiteral__Group__3 : rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 ;
    public final void rule__MeasuredLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4589:1: ( rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 )
            // InternalJqlDsl.g:4590:2: rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4
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
    // InternalJqlDsl.g:4597:1: rule__MeasuredLiteral__Group__3__Impl : ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) ) ;
    public final void rule__MeasuredLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4601:1: ( ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) ) )
            // InternalJqlDsl.g:4602:1: ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) )
            {
            // InternalJqlDsl.g:4602:1: ( ( rule__MeasuredLiteral__MeasureAssignment_3 ) )
            // InternalJqlDsl.g:4603:2: ( rule__MeasuredLiteral__MeasureAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasureAssignment_3()); 
            }
            // InternalJqlDsl.g:4604:2: ( rule__MeasuredLiteral__MeasureAssignment_3 )
            // InternalJqlDsl.g:4604:3: rule__MeasuredLiteral__MeasureAssignment_3
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
    // InternalJqlDsl.g:4612:1: rule__MeasuredLiteral__Group__4 : rule__MeasuredLiteral__Group__4__Impl ;
    public final void rule__MeasuredLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4616:1: ( rule__MeasuredLiteral__Group__4__Impl )
            // InternalJqlDsl.g:4617:2: rule__MeasuredLiteral__Group__4__Impl
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
    // InternalJqlDsl.g:4623:1: rule__MeasuredLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__MeasuredLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4627:1: ( ( ']' ) )
            // InternalJqlDsl.g:4628:1: ( ']' )
            {
            // InternalJqlDsl.g:4628:1: ( ']' )
            // InternalJqlDsl.g:4629:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:4639:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4643:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalJqlDsl.g:4644:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
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
    // InternalJqlDsl.g:4651:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4655:1: ( ( () ) )
            // InternalJqlDsl.g:4656:1: ( () )
            {
            // InternalJqlDsl.g:4656:1: ( () )
            // InternalJqlDsl.g:4657:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }
            // InternalJqlDsl.g:4658:2: ()
            // InternalJqlDsl.g:4658:3: 
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
    // InternalJqlDsl.g:4666:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4670:1: ( rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 )
            // InternalJqlDsl.g:4671:2: rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2
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
    // InternalJqlDsl.g:4678:1: rule__EnumLiteral__Group__1__Impl : ( '`' ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4682:1: ( ( '`' ) )
            // InternalJqlDsl.g:4683:1: ( '`' )
            {
            // InternalJqlDsl.g:4683:1: ( '`' )
            // InternalJqlDsl.g:4684:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGraveAccentKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:4693:1: rule__EnumLiteral__Group__2 : rule__EnumLiteral__Group__2__Impl ;
    public final void rule__EnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4697:1: ( rule__EnumLiteral__Group__2__Impl )
            // InternalJqlDsl.g:4698:2: rule__EnumLiteral__Group__2__Impl
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
    // InternalJqlDsl.g:4704:1: rule__EnumLiteral__Group__2__Impl : ( ( rule__EnumLiteral__ValueAssignment_2 ) ) ;
    public final void rule__EnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4708:1: ( ( ( rule__EnumLiteral__ValueAssignment_2 ) ) )
            // InternalJqlDsl.g:4709:1: ( ( rule__EnumLiteral__ValueAssignment_2 ) )
            {
            // InternalJqlDsl.g:4709:1: ( ( rule__EnumLiteral__ValueAssignment_2 ) )
            // InternalJqlDsl.g:4710:2: ( rule__EnumLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getValueAssignment_2()); 
            }
            // InternalJqlDsl.g:4711:2: ( rule__EnumLiteral__ValueAssignment_2 )
            // InternalJqlDsl.g:4711:3: rule__EnumLiteral__ValueAssignment_2
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
    // InternalJqlDsl.g:4720:1: rule__NavigationExpression__Group__0 : rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4724:1: ( rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 )
            // InternalJqlDsl.g:4725:2: rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1
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
    // InternalJqlDsl.g:4732:1: rule__NavigationExpression__Group__0__Impl : ( ( rule__NavigationExpression__BaseAssignment_0 ) ) ;
    public final void rule__NavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4736:1: ( ( ( rule__NavigationExpression__BaseAssignment_0 ) ) )
            // InternalJqlDsl.g:4737:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            {
            // InternalJqlDsl.g:4737:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            // InternalJqlDsl.g:4738:2: ( rule__NavigationExpression__BaseAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getBaseAssignment_0()); 
            }
            // InternalJqlDsl.g:4739:2: ( rule__NavigationExpression__BaseAssignment_0 )
            // InternalJqlDsl.g:4739:3: rule__NavigationExpression__BaseAssignment_0
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
    // InternalJqlDsl.g:4747:1: rule__NavigationExpression__Group__1 : rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4751:1: ( rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 )
            // InternalJqlDsl.g:4752:2: rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2
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
    // InternalJqlDsl.g:4759:1: rule__NavigationExpression__Group__1__Impl : ( ( rule__NavigationExpression__Group_1__0 )* ) ;
    public final void rule__NavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4763:1: ( ( ( rule__NavigationExpression__Group_1__0 )* ) )
            // InternalJqlDsl.g:4764:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            {
            // InternalJqlDsl.g:4764:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            // InternalJqlDsl.g:4765:2: ( rule__NavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:4766:2: ( rule__NavigationExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalJqlDsl.g:4766:3: rule__NavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__NavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalJqlDsl.g:4774:1: rule__NavigationExpression__Group__2 : rule__NavigationExpression__Group__2__Impl ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4778:1: ( rule__NavigationExpression__Group__2__Impl )
            // InternalJqlDsl.g:4779:2: rule__NavigationExpression__Group__2__Impl
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
    // InternalJqlDsl.g:4785:1: rule__NavigationExpression__Group__2__Impl : ( ( rule__NavigationExpression__Group_2__0 )? ) ;
    public final void rule__NavigationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4789:1: ( ( ( rule__NavigationExpression__Group_2__0 )? ) )
            // InternalJqlDsl.g:4790:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            {
            // InternalJqlDsl.g:4790:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            // InternalJqlDsl.g:4791:2: ( rule__NavigationExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDsl.g:4792:2: ( rule__NavigationExpression__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJqlDsl.g:4792:3: rule__NavigationExpression__Group_2__0
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
    // InternalJqlDsl.g:4801:1: rule__NavigationExpression__Group_1__0 : rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 ;
    public final void rule__NavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4805:1: ( rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 )
            // InternalJqlDsl.g:4806:2: rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1
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
    // InternalJqlDsl.g:4813:1: rule__NavigationExpression__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__NavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4817:1: ( ( ( '.' ) ) )
            // InternalJqlDsl.g:4818:1: ( ( '.' ) )
            {
            // InternalJqlDsl.g:4818:1: ( ( '.' ) )
            // InternalJqlDsl.g:4819:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFullStopKeyword_1_0()); 
            }
            // InternalJqlDsl.g:4820:2: ( '.' )
            // InternalJqlDsl.g:4820:3: '.'
            {
            match(input,46,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDsl.g:4828:1: rule__NavigationExpression__Group_1__1 : rule__NavigationExpression__Group_1__1__Impl ;
    public final void rule__NavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4832:1: ( rule__NavigationExpression__Group_1__1__Impl )
            // InternalJqlDsl.g:4833:2: rule__NavigationExpression__Group_1__1__Impl
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
    // InternalJqlDsl.g:4839:1: rule__NavigationExpression__Group_1__1__Impl : ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) ;
    public final void rule__NavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4843:1: ( ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) )
            // InternalJqlDsl.g:4844:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            {
            // InternalJqlDsl.g:4844:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            // InternalJqlDsl.g:4845:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFeaturesAssignment_1_1()); 
            }
            // InternalJqlDsl.g:4846:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            // InternalJqlDsl.g:4846:3: rule__NavigationExpression__FeaturesAssignment_1_1
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
    // InternalJqlDsl.g:4855:1: rule__NavigationExpression__Group_2__0 : rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 ;
    public final void rule__NavigationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4859:1: ( rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 )
            // InternalJqlDsl.g:4860:2: rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1
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
    // InternalJqlDsl.g:4867:1: rule__NavigationExpression__Group_2__0__Impl : ( '@' ) ;
    public final void rule__NavigationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4871:1: ( ( '@' ) )
            // InternalJqlDsl.g:4872:1: ( '@' )
            {
            // InternalJqlDsl.g:4872:1: ( '@' )
            // InternalJqlDsl.g:4873:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:4882:1: rule__NavigationExpression__Group_2__1 : rule__NavigationExpression__Group_2__1__Impl ;
    public final void rule__NavigationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4886:1: ( rule__NavigationExpression__Group_2__1__Impl )
            // InternalJqlDsl.g:4887:2: rule__NavigationExpression__Group_2__1__Impl
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
    // InternalJqlDsl.g:4893:1: rule__NavigationExpression__Group_2__1__Impl : ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) ;
    public final void rule__NavigationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4897:1: ( ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) )
            // InternalJqlDsl.g:4898:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            {
            // InternalJqlDsl.g:4898:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            // InternalJqlDsl.g:4899:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCastAssignment_2_1()); 
            }
            // InternalJqlDsl.g:4900:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            // InternalJqlDsl.g:4900:3: rule__NavigationExpression__CastAssignment_2_1
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
    // InternalJqlDsl.g:4909:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4913:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalJqlDsl.g:4914:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalJqlDsl.g:4921:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4925:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:4926:1: ( RULE_ID )
            {
            // InternalJqlDsl.g:4926:1: ( RULE_ID )
            // InternalJqlDsl.g:4927:2: RULE_ID
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
    // InternalJqlDsl.g:4936:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4940:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalJqlDsl.g:4941:2: rule__QualifiedName__Group__1__Impl
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
    // InternalJqlDsl.g:4947:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4951:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalJqlDsl.g:4952:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalJqlDsl.g:4952:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalJqlDsl.g:4953:2: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalJqlDsl.g:4953:2: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalJqlDsl.g:4954:3: ( rule__QualifiedName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:4955:3: ( rule__QualifiedName__Group_1__0 )
            // InternalJqlDsl.g:4955:4: rule__QualifiedName__Group_1__0
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

            // InternalJqlDsl.g:4958:2: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalJqlDsl.g:4959:3: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDsl.g:4960:3: ( rule__QualifiedName__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalJqlDsl.g:4960:4: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalJqlDsl.g:4970:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4974:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalJqlDsl.g:4975:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalJqlDsl.g:4982:1: rule__QualifiedName__Group_1__0__Impl : ( ( '::' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:4986:1: ( ( ( '::' ) ) )
            // InternalJqlDsl.g:4987:1: ( ( '::' ) )
            {
            // InternalJqlDsl.g:4987:1: ( ( '::' ) )
            // InternalJqlDsl.g:4988:2: ( '::' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            // InternalJqlDsl.g:4989:2: ( '::' )
            // InternalJqlDsl.g:4989:3: '::'
            {
            match(input,48,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDsl.g:4997:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5001:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalJqlDsl.g:5002:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalJqlDsl.g:5008:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5012:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:5013:1: ( RULE_ID )
            {
            // InternalJqlDsl.g:5013:1: ( RULE_ID )
            // InternalJqlDsl.g:5014:2: RULE_ID
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
    // InternalJqlDsl.g:5024:1: rule__ConcatenateExpression__OperatorAssignment_1_0_0_1 : ( ruleOpConcat ) ;
    public final void rule__ConcatenateExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5028:1: ( ( ruleOpConcat ) )
            // InternalJqlDsl.g:5029:2: ( ruleOpConcat )
            {
            // InternalJqlDsl.g:5029:2: ( ruleOpConcat )
            // InternalJqlDsl.g:5030:3: ruleOpConcat
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
    // InternalJqlDsl.g:5039:1: rule__ConcatenateExpression__RightOperandAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__ConcatenateExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5043:1: ( ( ruleOrExpression ) )
            // InternalJqlDsl.g:5044:2: ( ruleOrExpression )
            {
            // InternalJqlDsl.g:5044:2: ( ruleOrExpression )
            // InternalJqlDsl.g:5045:3: ruleOrExpression
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
    // InternalJqlDsl.g:5054:1: rule__OrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__OrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5058:1: ( ( ruleOpOr ) )
            // InternalJqlDsl.g:5059:2: ( ruleOpOr )
            {
            // InternalJqlDsl.g:5059:2: ( ruleOpOr )
            // InternalJqlDsl.g:5060:3: ruleOpOr
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
    // InternalJqlDsl.g:5069:1: rule__OrExpression__RightOperandAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5073:1: ( ( ruleAndExpression ) )
            // InternalJqlDsl.g:5074:2: ( ruleAndExpression )
            {
            // InternalJqlDsl.g:5074:2: ( ruleAndExpression )
            // InternalJqlDsl.g:5075:3: ruleAndExpression
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
    // InternalJqlDsl.g:5084:1: rule__AndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__AndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5088:1: ( ( ruleOpAnd ) )
            // InternalJqlDsl.g:5089:2: ( ruleOpAnd )
            {
            // InternalJqlDsl.g:5089:2: ( ruleOpAnd )
            // InternalJqlDsl.g:5090:3: ruleOpAnd
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
    // InternalJqlDsl.g:5099:1: rule__AndExpression__RightOperandAssignment_1_1 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5103:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDsl.g:5104:2: ( ruleEqualityExpression )
            {
            // InternalJqlDsl.g:5104:2: ( ruleEqualityExpression )
            // InternalJqlDsl.g:5105:3: ruleEqualityExpression
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
    // InternalJqlDsl.g:5114:1: rule__EqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5118:1: ( ( ruleOpEquality ) )
            // InternalJqlDsl.g:5119:2: ( ruleOpEquality )
            {
            // InternalJqlDsl.g:5119:2: ( ruleOpEquality )
            // InternalJqlDsl.g:5120:3: ruleOpEquality
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
    // InternalJqlDsl.g:5129:1: rule__EqualityExpression__RightOperandAssignment_1_1 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5133:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:5134:2: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:5134:2: ( ruleRelationalExpression )
            // InternalJqlDsl.g:5135:3: ruleRelationalExpression
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
    // InternalJqlDsl.g:5144:1: rule__RelationalExpression__OperatorAssignment_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5148:1: ( ( ruleOpCompare ) )
            // InternalJqlDsl.g:5149:2: ( ruleOpCompare )
            {
            // InternalJqlDsl.g:5149:2: ( ruleOpCompare )
            // InternalJqlDsl.g:5150:3: ruleOpCompare
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
    // InternalJqlDsl.g:5159:1: rule__RelationalExpression__RightOperandAssignment_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5163:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDsl.g:5164:2: ( ruleAdditiveExpression )
            {
            // InternalJqlDsl.g:5164:2: ( ruleAdditiveExpression )
            // InternalJqlDsl.g:5165:3: ruleAdditiveExpression
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
    // InternalJqlDsl.g:5174:1: rule__AdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5178:1: ( ( ruleOpAdd ) )
            // InternalJqlDsl.g:5179:2: ( ruleOpAdd )
            {
            // InternalJqlDsl.g:5179:2: ( ruleOpAdd )
            // InternalJqlDsl.g:5180:3: ruleOpAdd
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
    // InternalJqlDsl.g:5189:1: rule__AdditiveExpression__RightOperandAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5193:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDsl.g:5194:2: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDsl.g:5194:2: ( ruleMultiplicativeExpression )
            // InternalJqlDsl.g:5195:3: ruleMultiplicativeExpression
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


    // $ANTLR start "rule__MultiplicativeExpression__TransformationsAssignment_1_1"
    // InternalJqlDsl.g:5204:1: rule__MultiplicativeExpression__TransformationsAssignment_1_1 : ( ruleTransformation ) ;
    public final void rule__MultiplicativeExpression__TransformationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5208:1: ( ( ruleTransformation ) )
            // InternalJqlDsl.g:5209:2: ( ruleTransformation )
            {
            // InternalJqlDsl.g:5209:2: ( ruleTransformation )
            // InternalJqlDsl.g:5210:3: ruleTransformation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getTransformationsTransformationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getTransformationsTransformationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__TransformationsAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1"
    // InternalJqlDsl.g:5219:1: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5223:1: ( ( ruleOpMulti ) )
            // InternalJqlDsl.g:5224:2: ( ruleOpMulti )
            {
            // InternalJqlDsl.g:5224:2: ( ruleOpMulti )
            // InternalJqlDsl.g:5225:3: ruleOpMulti
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
    // InternalJqlDsl.g:5234:1: rule__MultiplicativeExpression__RightOperandAssignment_2_1 : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__RightOperandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5238:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:5239:2: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:5239:2: ( ruleUnaryOperation )
            // InternalJqlDsl.g:5240:3: ruleUnaryOperation
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
    // InternalJqlDsl.g:5249:1: rule__UnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5253:1: ( ( ruleOpUnary ) )
            // InternalJqlDsl.g:5254:2: ( ruleOpUnary )
            {
            // InternalJqlDsl.g:5254:2: ( ruleOpUnary )
            // InternalJqlDsl.g:5255:3: ruleOpUnary
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
    // InternalJqlDsl.g:5264:1: rule__UnaryOperation__OperandAssignment_0_2 : ( ruleUnaryOperation ) ;
    public final void rule__UnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5268:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDsl.g:5269:2: ( ruleUnaryOperation )
            {
            // InternalJqlDsl.g:5269:2: ( ruleUnaryOperation )
            // InternalJqlDsl.g:5270:3: ruleUnaryOperation
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
    // InternalJqlDsl.g:5279:1: rule__LambdaExpression__ArgumentAssignment_1 : ( ruleFeature ) ;
    public final void rule__LambdaExpression__ArgumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5283:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5284:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5284:2: ( ruleFeature )
            // InternalJqlDsl.g:5285:3: ruleFeature
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
    // InternalJqlDsl.g:5294:1: rule__LambdaExpression__StatementAssignment_3 : ( ruleExpression ) ;
    public final void rule__LambdaExpression__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5298:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5299:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5299:2: ( ruleExpression )
            // InternalJqlDsl.g:5300:3: ruleExpression
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


    // $ANTLR start "rule__Transformation__FeatureAssignment_1"
    // InternalJqlDsl.g:5309:1: rule__Transformation__FeatureAssignment_1 : ( ruleFeature ) ;
    public final void rule__Transformation__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5313:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5314:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5314:2: ( ruleFeature )
            // InternalJqlDsl.g:5315:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getFeatureFeatureParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getFeatureFeatureParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__FeatureAssignment_1"


    // $ANTLR start "rule__Transformation__LambdaAssignment_2_1_0"
    // InternalJqlDsl.g:5324:1: rule__Transformation__LambdaAssignment_2_1_0 : ( ruleLambdaExpression ) ;
    public final void rule__Transformation__LambdaAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5328:1: ( ( ruleLambdaExpression ) )
            // InternalJqlDsl.g:5329:2: ( ruleLambdaExpression )
            {
            // InternalJqlDsl.g:5329:2: ( ruleLambdaExpression )
            // InternalJqlDsl.g:5330:3: ruleLambdaExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getLambdaLambdaExpressionParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLambdaExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getLambdaLambdaExpressionParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__LambdaAssignment_2_1_0"


    // $ANTLR start "rule__Transformation__ParametersAssignment_2_1_1_0"
    // InternalJqlDsl.g:5339:1: rule__Transformation__ParametersAssignment_2_1_1_0 : ( ruleExpression ) ;
    public final void rule__Transformation__ParametersAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5343:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5344:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5344:2: ( ruleExpression )
            // InternalJqlDsl.g:5345:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getParametersExpressionParserRuleCall_2_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getParametersExpressionParserRuleCall_2_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__ParametersAssignment_2_1_1_0"


    // $ANTLR start "rule__Transformation__ParametersAssignment_2_1_1_1_1"
    // InternalJqlDsl.g:5354:1: rule__Transformation__ParametersAssignment_2_1_1_1_1 : ( ruleExpression ) ;
    public final void rule__Transformation__ParametersAssignment_2_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5358:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5359:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5359:2: ( ruleExpression )
            // InternalJqlDsl.g:5360:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransformationAccess().getParametersExpressionParserRuleCall_2_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransformationAccess().getParametersExpressionParserRuleCall_2_1_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__ParametersAssignment_2_1_1_1_1"


    // $ANTLR start "rule__SwitchExpression__OperandAssignment_2"
    // InternalJqlDsl.g:5369:1: rule__SwitchExpression__OperandAssignment_2 : ( ruleConcatenateExpression ) ;
    public final void rule__SwitchExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5373:1: ( ( ruleConcatenateExpression ) )
            // InternalJqlDsl.g:5374:2: ( ruleConcatenateExpression )
            {
            // InternalJqlDsl.g:5374:2: ( ruleConcatenateExpression )
            // InternalJqlDsl.g:5375:3: ruleConcatenateExpression
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
    // InternalJqlDsl.g:5384:1: rule__SwitchExpression__BodyAssignment_3 : ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) ) ;
    public final void rule__SwitchExpression__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5388:1: ( ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) ) )
            // InternalJqlDsl.g:5389:2: ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) )
            {
            // InternalJqlDsl.g:5389:2: ( ( rule__SwitchExpression__BodyAlternatives_3_0 ) )
            // InternalJqlDsl.g:5390:3: ( rule__SwitchExpression__BodyAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getBodyAlternatives_3_0()); 
            }
            // InternalJqlDsl.g:5391:3: ( rule__SwitchExpression__BodyAlternatives_3_0 )
            // InternalJqlDsl.g:5391:4: rule__SwitchExpression__BodyAlternatives_3_0
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
    // InternalJqlDsl.g:5399:1: rule__SwitchConditionalExpression__AliasAssignment_2 : ( ruleFeature ) ;
    public final void rule__SwitchConditionalExpression__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5403:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5404:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5404:2: ( ruleFeature )
            // InternalJqlDsl.g:5405:3: ruleFeature
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
    // InternalJqlDsl.g:5414:1: rule__SwitchConditionalExpression__CasesAssignment_3_1 : ( ruleSwitchConditionalCase ) ;
    public final void rule__SwitchConditionalExpression__CasesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5418:1: ( ( ruleSwitchConditionalCase ) )
            // InternalJqlDsl.g:5419:2: ( ruleSwitchConditionalCase )
            {
            // InternalJqlDsl.g:5419:2: ( ruleSwitchConditionalCase )
            // InternalJqlDsl.g:5420:3: ruleSwitchConditionalCase
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
    // InternalJqlDsl.g:5429:1: rule__SwitchConditionalExpression__DefaultAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__SwitchConditionalExpression__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5433:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5434:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5434:2: ( ruleExpression )
            // InternalJqlDsl.g:5435:3: ruleExpression
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
    // InternalJqlDsl.g:5444:1: rule__SwitchConditionalCase__ConditionAssignment_1 : ( ruleRelationalExpression ) ;
    public final void rule__SwitchConditionalCase__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5448:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDsl.g:5449:2: ( ruleRelationalExpression )
            {
            // InternalJqlDsl.g:5449:2: ( ruleRelationalExpression )
            // InternalJqlDsl.g:5450:3: ruleRelationalExpression
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
    // InternalJqlDsl.g:5459:1: rule__SwitchConditionalCase__ResultAssignment_3 : ( ruleExpression ) ;
    public final void rule__SwitchConditionalCase__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5463:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5464:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5464:2: ( ruleExpression )
            // InternalJqlDsl.g:5465:3: ruleExpression
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
    // InternalJqlDsl.g:5474:1: rule__SwitchEqualsExpression__CasesAssignment_1_1 : ( ruleSwitchEqualsCase ) ;
    public final void rule__SwitchEqualsExpression__CasesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5478:1: ( ( ruleSwitchEqualsCase ) )
            // InternalJqlDsl.g:5479:2: ( ruleSwitchEqualsCase )
            {
            // InternalJqlDsl.g:5479:2: ( ruleSwitchEqualsCase )
            // InternalJqlDsl.g:5480:3: ruleSwitchEqualsCase
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
    // InternalJqlDsl.g:5489:1: rule__SwitchEqualsExpression__DefaultAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__SwitchEqualsExpression__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5493:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5494:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5494:2: ( ruleExpression )
            // InternalJqlDsl.g:5495:3: ruleExpression
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
    // InternalJqlDsl.g:5504:1: rule__SwitchEqualsCase__ConditionAssignment_1 : ( ruleLiteral ) ;
    public final void rule__SwitchEqualsCase__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5508:1: ( ( ruleLiteral ) )
            // InternalJqlDsl.g:5509:2: ( ruleLiteral )
            {
            // InternalJqlDsl.g:5509:2: ( ruleLiteral )
            // InternalJqlDsl.g:5510:3: ruleLiteral
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
    // InternalJqlDsl.g:5519:1: rule__SwitchEqualsCase__ResultAssignment_3 : ( ruleExpression ) ;
    public final void rule__SwitchEqualsCase__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5523:1: ( ( ruleExpression ) )
            // InternalJqlDsl.g:5524:2: ( ruleExpression )
            {
            // InternalJqlDsl.g:5524:2: ( ruleExpression )
            // InternalJqlDsl.g:5525:3: ruleExpression
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
    // InternalJqlDsl.g:5534:1: rule__BooleanLiteral__IsTrueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5538:1: ( ( ( 'true' ) ) )
            // InternalJqlDsl.g:5539:2: ( ( 'true' ) )
            {
            // InternalJqlDsl.g:5539:2: ( ( 'true' ) )
            // InternalJqlDsl.g:5540:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            // InternalJqlDsl.g:5541:3: ( 'true' )
            // InternalJqlDsl.g:5542:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDsl.g:5553:1: rule__NumberLiteral__ValueAssignment_0_1 : ( RULE_INTEGER ) ;
    public final void rule__NumberLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5557:1: ( ( RULE_INTEGER ) )
            // InternalJqlDsl.g:5558:2: ( RULE_INTEGER )
            {
            // InternalJqlDsl.g:5558:2: ( RULE_INTEGER )
            // InternalJqlDsl.g:5559:3: RULE_INTEGER
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
    // InternalJqlDsl.g:5568:1: rule__NumberLiteral__ValueAssignment_1_1 : ( RULE_DECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5572:1: ( ( RULE_DECIMAL ) )
            // InternalJqlDsl.g:5573:2: ( RULE_DECIMAL )
            {
            // InternalJqlDsl.g:5573:2: ( RULE_DECIMAL )
            // InternalJqlDsl.g:5574:3: RULE_DECIMAL
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
    // InternalJqlDsl.g:5583:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5587:1: ( ( RULE_STRING ) )
            // InternalJqlDsl.g:5588:2: ( RULE_STRING )
            {
            // InternalJqlDsl.g:5588:2: ( RULE_STRING )
            // InternalJqlDsl.g:5589:3: RULE_STRING
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
    // InternalJqlDsl.g:5598:1: rule__TemporalLiteral__ValueAssignment_0_1 : ( RULE_DATE ) ;
    public final void rule__TemporalLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5602:1: ( ( RULE_DATE ) )
            // InternalJqlDsl.g:5603:2: ( RULE_DATE )
            {
            // InternalJqlDsl.g:5603:2: ( RULE_DATE )
            // InternalJqlDsl.g:5604:3: RULE_DATE
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
    // InternalJqlDsl.g:5613:1: rule__TemporalLiteral__ValueAssignment_1_1 : ( RULE_TIMESTAMP ) ;
    public final void rule__TemporalLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5617:1: ( ( RULE_TIMESTAMP ) )
            // InternalJqlDsl.g:5618:2: ( RULE_TIMESTAMP )
            {
            // InternalJqlDsl.g:5618:2: ( RULE_TIMESTAMP )
            // InternalJqlDsl.g:5619:3: RULE_TIMESTAMP
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
    // InternalJqlDsl.g:5628:1: rule__MeasuredLiteral__ValueAssignment_1 : ( ruleNumberLiteral ) ;
    public final void rule__MeasuredLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5632:1: ( ( ruleNumberLiteral ) )
            // InternalJqlDsl.g:5633:2: ( ruleNumberLiteral )
            {
            // InternalJqlDsl.g:5633:2: ( ruleNumberLiteral )
            // InternalJqlDsl.g:5634:3: ruleNumberLiteral
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
    // InternalJqlDsl.g:5643:1: rule__MeasuredLiteral__MeasureAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__MeasuredLiteral__MeasureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5647:1: ( ( ruleQualifiedName ) )
            // InternalJqlDsl.g:5648:2: ( ruleQualifiedName )
            {
            // InternalJqlDsl.g:5648:2: ( ruleQualifiedName )
            // InternalJqlDsl.g:5649:3: ruleQualifiedName
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
    // InternalJqlDsl.g:5658:1: rule__EnumLiteral__ValueAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EnumLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5662:1: ( ( ruleQualifiedName ) )
            // InternalJqlDsl.g:5663:2: ( ruleQualifiedName )
            {
            // InternalJqlDsl.g:5663:2: ( ruleQualifiedName )
            // InternalJqlDsl.g:5664:3: ruleQualifiedName
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
    // InternalJqlDsl.g:5673:1: rule__NavigationExpression__BaseAssignment_0 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5677:1: ( ( ruleNavigationBase ) )
            // InternalJqlDsl.g:5678:2: ( ruleNavigationBase )
            {
            // InternalJqlDsl.g:5678:2: ( ruleNavigationBase )
            // InternalJqlDsl.g:5679:3: ruleNavigationBase
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
    // InternalJqlDsl.g:5688:1: rule__NavigationExpression__FeaturesAssignment_1_1 : ( ruleFeature ) ;
    public final void rule__NavigationExpression__FeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5692:1: ( ( ruleFeature ) )
            // InternalJqlDsl.g:5693:2: ( ruleFeature )
            {
            // InternalJqlDsl.g:5693:2: ( ruleFeature )
            // InternalJqlDsl.g:5694:3: ruleFeature
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
    // InternalJqlDsl.g:5703:1: rule__NavigationExpression__CastAssignment_2_1 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__CastAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5707:1: ( ( ruleNavigationBase ) )
            // InternalJqlDsl.g:5708:2: ( ruleNavigationBase )
            {
            // InternalJqlDsl.g:5708:2: ( ruleNavigationBase )
            // InternalJqlDsl.g:5709:3: ruleNavigationBase
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
    // InternalJqlDsl.g:5718:1: rule__Feature__NameAssignment : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDsl.g:5722:1: ( ( RULE_ID ) )
            // InternalJqlDsl.g:5723:2: ( RULE_ID )
            {
            // InternalJqlDsl.g:5723:2: ( RULE_ID )
            // InternalJqlDsl.g:5724:3: RULE_ID
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

    // $ANTLR start synpred40_InternalJqlDsl
    public final void synpred40_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:3632:3: ( rule__SwitchConditionalExpression__Group_3__0 )
        // InternalJqlDsl.g:3632:3: rule__SwitchConditionalExpression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchConditionalExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalJqlDsl

    // $ANTLR start synpred41_InternalJqlDsl
    public final void synpred41_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:3658:3: ( rule__SwitchConditionalExpression__Group_4__0 )
        // InternalJqlDsl.g:3658:3: rule__SwitchConditionalExpression__Group_4__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchConditionalExpression__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalJqlDsl

    // $ANTLR start synpred42_InternalJqlDsl
    public final void synpred42_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:3929:3: ( rule__SwitchEqualsExpression__Group_1__0 )
        // InternalJqlDsl.g:3929:3: rule__SwitchEqualsExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchEqualsExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalJqlDsl

    // $ANTLR start synpred43_InternalJqlDsl
    public final void synpred43_InternalJqlDsl_fragment() throws RecognitionException {   
        // InternalJqlDsl.g:3955:3: ( rule__SwitchEqualsExpression__Group_2__0 )
        // InternalJqlDsl.g:3955:3: rule__SwitchEqualsExpression__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__SwitchEqualsExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalJqlDsl

    // Delegated rules

    public final boolean synpred42_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalJqlDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalJqlDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalJqlDsl_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00022005E30003F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E3000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00022045E30003F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00022065E30003F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000002L});

}