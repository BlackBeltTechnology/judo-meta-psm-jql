package hu.blackbelt.judo.meta.jql.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Implies", "False", "True", "And", "Div", "Mod", "Not", "Xor", "ColonColon", "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "Or", "ExclamationMark", "NumberSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "VerticalLine", "RULE_DATE", "RULE_TIMESTAMP", "RULE_INTEGER", "RULE_DECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int LessThanSignGreaterThanSign=13;
    public static final int Or=15;
    public static final int True=6;
    public static final int False=5;
    public static final int LessThanSign=27;
    public static final int Implies=4;
    public static final int LeftParenthesis=18;
    public static final int RightSquareBracket=33;
    public static final int ExclamationMark=16;
    public static final int GreaterThanSign=29;
    public static final int RULE_ID=39;
    public static final int RightParenthesis=19;
    public static final int GreaterThanSignEqualsSign=14;
    public static final int ColonColon=12;
    public static final int RULE_DECIMAL=38;
    public static final int Not=10;
    public static final int RULE_DATE=35;
    public static final int VerticalLine=34;
    public static final int And=7;
    public static final int PlusSign=21;
    public static final int NumberSign=17;
    public static final int RULE_ML_COMMENT=41;
    public static final int Xor=11;
    public static final int LeftSquareBracket=32;
    public static final int RULE_STRING=40;
    public static final int RULE_SL_COMMENT=42;
    public static final int Comma=22;
    public static final int EqualsSign=28;
    public static final int HyphenMinus=23;
    public static final int Solidus=25;
    public static final int Colon=26;
    public static final int EOF=-1;
    public static final int Asterisk=20;
    public static final int FullStop=24;
    public static final int Mod=9;
    public static final int RULE_WS=43;
    public static final int RULE_ANY_OTHER=44;
    public static final int CommercialAt=31;
    public static final int Div=8;
    public static final int QuestionMark=30;
    public static final int RULE_TIMESTAMP=36;
    public static final int RULE_INTEGER=37;

    // delegates
    // delegators


        public InternalJqlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJqlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJqlDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJqlDslParser.g"; }


    	private JqlDslGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("NumberSign", "'#'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("QuestionMark", "'?'");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("VerticalLine", "'|'");
    		tokenNameToValue.put("ColonColon", "'::'");
    		tokenNameToValue.put("LessThanSignGreaterThanSign", "'<>'");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Div", "'div'");
    		tokenNameToValue.put("Mod", "'mod'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Xor", "'xor'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Implies", "'implies'");
    	}

    	public void setGrammarAccess(JqlDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleExpression"
    // InternalJqlDslParser.g:87:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:88:1: ( ruleExpression EOF )
            // InternalJqlDslParser.g:89:1: ruleExpression EOF
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
    // InternalJqlDslParser.g:96:1: ruleExpression : ( ruleSwitchExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:100:2: ( ( ruleSwitchExpression ) )
            // InternalJqlDslParser.g:101:2: ( ruleSwitchExpression )
            {
            // InternalJqlDslParser.g:101:2: ( ruleSwitchExpression )
            // InternalJqlDslParser.g:102:3: ruleSwitchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getSwitchExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getSwitchExpressionParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleSwitchExpression"
    // InternalJqlDslParser.g:112:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:113:1: ( ruleSwitchExpression EOF )
            // InternalJqlDslParser.g:114:1: ruleSwitchExpression EOF
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
    // InternalJqlDslParser.g:121:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Group__0 ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:125:2: ( ( ( rule__SwitchExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:126:2: ( ( rule__SwitchExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:126:2: ( ( rule__SwitchExpression__Group__0 ) )
            // InternalJqlDslParser.g:127:3: ( rule__SwitchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:128:3: ( rule__SwitchExpression__Group__0 )
            // InternalJqlDslParser.g:128:4: rule__SwitchExpression__Group__0
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


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalJqlDslParser.g:137:1: entryRuleImpliesExpression : ruleImpliesExpression EOF ;
    public final void entryRuleImpliesExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:138:1: ( ruleImpliesExpression EOF )
            // InternalJqlDslParser.g:139:1: ruleImpliesExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionRule()); 
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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalJqlDslParser.g:146:1: ruleImpliesExpression : ( ( rule__ImpliesExpression__Group__0 ) ) ;
    public final void ruleImpliesExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:150:2: ( ( ( rule__ImpliesExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:151:2: ( ( rule__ImpliesExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:151:2: ( ( rule__ImpliesExpression__Group__0 ) )
            // InternalJqlDslParser.g:152:3: ( rule__ImpliesExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:153:3: ( rule__ImpliesExpression__Group__0 )
            // InternalJqlDslParser.g:153:4: rule__ImpliesExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalJqlDslParser.g:162:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:163:1: ( ruleOrExpression EOF )
            // InternalJqlDslParser.g:164:1: ruleOrExpression EOF
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
    // InternalJqlDslParser.g:171:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:175:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:176:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:176:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalJqlDslParser.g:177:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:178:3: ( rule__OrExpression__Group__0 )
            // InternalJqlDslParser.g:178:4: rule__OrExpression__Group__0
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


    // $ANTLR start "entryRuleXorExpression"
    // InternalJqlDslParser.g:187:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:188:1: ( ruleXorExpression EOF )
            // InternalJqlDslParser.g:189:1: ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionRule()); 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalJqlDslParser.g:196:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:200:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:201:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:201:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalJqlDslParser.g:202:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:203:3: ( rule__XorExpression__Group__0 )
            // InternalJqlDslParser.g:203:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalJqlDslParser.g:212:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:213:1: ( ruleAndExpression EOF )
            // InternalJqlDslParser.g:214:1: ruleAndExpression EOF
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
    // InternalJqlDslParser.g:221:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:225:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:226:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:226:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalJqlDslParser.g:227:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:228:3: ( rule__AndExpression__Group__0 )
            // InternalJqlDslParser.g:228:4: rule__AndExpression__Group__0
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


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalJqlDslParser.g:237:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:238:1: ( ruleEqualityExpression EOF )
            // InternalJqlDslParser.g:239:1: ruleEqualityExpression EOF
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
    // InternalJqlDslParser.g:246:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:250:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:251:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:251:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalJqlDslParser.g:252:3: ( rule__EqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:253:3: ( rule__EqualityExpression__Group__0 )
            // InternalJqlDslParser.g:253:4: rule__EqualityExpression__Group__0
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
    // InternalJqlDslParser.g:262:1: entryRuleOpEquality : ruleOpEquality EOF ;
    public final void entryRuleOpEquality() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:263:1: ( ruleOpEquality EOF )
            // InternalJqlDslParser.g:264:1: ruleOpEquality EOF
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
    // InternalJqlDslParser.g:271:1: ruleOpEquality : ( ( rule__OpEquality__Alternatives ) ) ;
    public final void ruleOpEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:275:2: ( ( ( rule__OpEquality__Alternatives ) ) )
            // InternalJqlDslParser.g:276:2: ( ( rule__OpEquality__Alternatives ) )
            {
            // InternalJqlDslParser.g:276:2: ( ( rule__OpEquality__Alternatives ) )
            // InternalJqlDslParser.g:277:3: ( rule__OpEquality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpEqualityAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:278:3: ( rule__OpEquality__Alternatives )
            // InternalJqlDslParser.g:278:4: rule__OpEquality__Alternatives
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
    // InternalJqlDslParser.g:287:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:288:1: ( ruleRelationalExpression EOF )
            // InternalJqlDslParser.g:289:1: ruleRelationalExpression EOF
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
    // InternalJqlDslParser.g:296:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:300:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:301:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:301:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalJqlDslParser.g:302:3: ( rule__RelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:303:3: ( rule__RelationalExpression__Group__0 )
            // InternalJqlDslParser.g:303:4: rule__RelationalExpression__Group__0
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
    // InternalJqlDslParser.g:312:1: entryRuleOpCompare : ruleOpCompare EOF ;
    public final void entryRuleOpCompare() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:313:1: ( ruleOpCompare EOF )
            // InternalJqlDslParser.g:314:1: ruleOpCompare EOF
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
    // InternalJqlDslParser.g:321:1: ruleOpCompare : ( ( rule__OpCompare__Alternatives ) ) ;
    public final void ruleOpCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:325:2: ( ( ( rule__OpCompare__Alternatives ) ) )
            // InternalJqlDslParser.g:326:2: ( ( rule__OpCompare__Alternatives ) )
            {
            // InternalJqlDslParser.g:326:2: ( ( rule__OpCompare__Alternatives ) )
            // InternalJqlDslParser.g:327:3: ( rule__OpCompare__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:328:3: ( rule__OpCompare__Alternatives )
            // InternalJqlDslParser.g:328:4: rule__OpCompare__Alternatives
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
    // InternalJqlDslParser.g:337:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:338:1: ( ruleAdditiveExpression EOF )
            // InternalJqlDslParser.g:339:1: ruleAdditiveExpression EOF
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
    // InternalJqlDslParser.g:346:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:350:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:351:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:351:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalJqlDslParser.g:352:3: ( rule__AdditiveExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:353:3: ( rule__AdditiveExpression__Group__0 )
            // InternalJqlDslParser.g:353:4: rule__AdditiveExpression__Group__0
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
    // InternalJqlDslParser.g:362:1: entryRuleOpAdd : ruleOpAdd EOF ;
    public final void entryRuleOpAdd() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:363:1: ( ruleOpAdd EOF )
            // InternalJqlDslParser.g:364:1: ruleOpAdd EOF
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
    // InternalJqlDslParser.g:371:1: ruleOpAdd : ( ( rule__OpAdd__Alternatives ) ) ;
    public final void ruleOpAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:375:2: ( ( ( rule__OpAdd__Alternatives ) ) )
            // InternalJqlDslParser.g:376:2: ( ( rule__OpAdd__Alternatives ) )
            {
            // InternalJqlDslParser.g:376:2: ( ( rule__OpAdd__Alternatives ) )
            // InternalJqlDslParser.g:377:3: ( rule__OpAdd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAddAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:378:3: ( rule__OpAdd__Alternatives )
            // InternalJqlDslParser.g:378:4: rule__OpAdd__Alternatives
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
    // InternalJqlDslParser.g:387:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:388:1: ( ruleMultiplicativeExpression EOF )
            // InternalJqlDslParser.g:389:1: ruleMultiplicativeExpression EOF
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
    // InternalJqlDslParser.g:396:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:400:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:401:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:401:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalJqlDslParser.g:402:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:403:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalJqlDslParser.g:403:4: rule__MultiplicativeExpression__Group__0
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
    // InternalJqlDslParser.g:412:1: entryRuleOpMulti : ruleOpMulti EOF ;
    public final void entryRuleOpMulti() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:413:1: ( ruleOpMulti EOF )
            // InternalJqlDslParser.g:414:1: ruleOpMulti EOF
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
    // InternalJqlDslParser.g:421:1: ruleOpMulti : ( ( rule__OpMulti__Alternatives ) ) ;
    public final void ruleOpMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:425:2: ( ( ( rule__OpMulti__Alternatives ) ) )
            // InternalJqlDslParser.g:426:2: ( ( rule__OpMulti__Alternatives ) )
            {
            // InternalJqlDslParser.g:426:2: ( ( rule__OpMulti__Alternatives ) )
            // InternalJqlDslParser.g:427:3: ( rule__OpMulti__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpMultiAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:428:3: ( rule__OpMulti__Alternatives )
            // InternalJqlDslParser.g:428:4: rule__OpMulti__Alternatives
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
    // InternalJqlDslParser.g:437:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:438:1: ( ruleUnaryOperation EOF )
            // InternalJqlDslParser.g:439:1: ruleUnaryOperation EOF
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
    // InternalJqlDslParser.g:446:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Alternatives ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:450:2: ( ( ( rule__UnaryOperation__Alternatives ) ) )
            // InternalJqlDslParser.g:451:2: ( ( rule__UnaryOperation__Alternatives ) )
            {
            // InternalJqlDslParser.g:451:2: ( ( rule__UnaryOperation__Alternatives ) )
            // InternalJqlDslParser.g:452:3: ( rule__UnaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:453:3: ( rule__UnaryOperation__Alternatives )
            // InternalJqlDslParser.g:453:4: rule__UnaryOperation__Alternatives
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
    // InternalJqlDslParser.g:462:1: entryRuleOpUnary : ruleOpUnary EOF ;
    public final void entryRuleOpUnary() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:463:1: ( ruleOpUnary EOF )
            // InternalJqlDslParser.g:464:1: ruleOpUnary EOF
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
    // InternalJqlDslParser.g:471:1: ruleOpUnary : ( ( rule__OpUnary__Alternatives ) ) ;
    public final void ruleOpUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:475:2: ( ( ( rule__OpUnary__Alternatives ) ) )
            // InternalJqlDslParser.g:476:2: ( ( rule__OpUnary__Alternatives ) )
            {
            // InternalJqlDslParser.g:476:2: ( ( rule__OpUnary__Alternatives ) )
            // InternalJqlDslParser.g:477:3: ( rule__OpUnary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpUnaryAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:478:3: ( rule__OpUnary__Alternatives )
            // InternalJqlDslParser.g:478:4: rule__OpUnary__Alternatives
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
    // InternalJqlDslParser.g:487:1: entryRuleParenthesizedExpression : ruleParenthesizedExpression EOF ;
    public final void entryRuleParenthesizedExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:488:1: ( ruleParenthesizedExpression EOF )
            // InternalJqlDslParser.g:489:1: ruleParenthesizedExpression EOF
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
    // InternalJqlDslParser.g:496:1: ruleParenthesizedExpression : ( ( rule__ParenthesizedExpression__Group__0 ) ) ;
    public final void ruleParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:500:2: ( ( ( rule__ParenthesizedExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:501:2: ( ( rule__ParenthesizedExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:501:2: ( ( rule__ParenthesizedExpression__Group__0 ) )
            // InternalJqlDslParser.g:502:3: ( rule__ParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:503:3: ( rule__ParenthesizedExpression__Group__0 )
            // InternalJqlDslParser.g:503:4: rule__ParenthesizedExpression__Group__0
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
    // InternalJqlDslParser.g:512:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:513:1: ( rulePrimaryExpression EOF )
            // InternalJqlDslParser.g:514:1: rulePrimaryExpression EOF
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
    // InternalJqlDslParser.g:521:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:525:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalJqlDslParser.g:526:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalJqlDslParser.g:526:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalJqlDslParser.g:527:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:528:3: ( rule__PrimaryExpression__Alternatives )
            // InternalJqlDslParser.g:528:4: rule__PrimaryExpression__Alternatives
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
    // InternalJqlDslParser.g:537:1: entryRuleLambdaExpression : ruleLambdaExpression EOF ;
    public final void entryRuleLambdaExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:538:1: ( ruleLambdaExpression EOF )
            // InternalJqlDslParser.g:539:1: ruleLambdaExpression EOF
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
    // InternalJqlDslParser.g:546:1: ruleLambdaExpression : ( ( rule__LambdaExpression__Group__0 ) ) ;
    public final void ruleLambdaExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:550:2: ( ( ( rule__LambdaExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:551:2: ( ( rule__LambdaExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:551:2: ( ( rule__LambdaExpression__Group__0 ) )
            // InternalJqlDslParser.g:552:3: ( rule__LambdaExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:553:3: ( rule__LambdaExpression__Group__0 )
            // InternalJqlDslParser.g:553:4: rule__LambdaExpression__Group__0
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
    // InternalJqlDslParser.g:562:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:563:1: ( ruleFunction EOF )
            // InternalJqlDslParser.g:564:1: ruleFunction EOF
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
    // InternalJqlDslParser.g:571:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:575:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalJqlDslParser.g:576:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalJqlDslParser.g:576:2: ( ( rule__Function__Group__0 ) )
            // InternalJqlDslParser.g:577:3: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:578:3: ( rule__Function__Group__0 )
            // InternalJqlDslParser.g:578:4: rule__Function__Group__0
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
    // InternalJqlDslParser.g:587:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:588:1: ( ruleLiteral EOF )
            // InternalJqlDslParser.g:589:1: ruleLiteral EOF
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
    // InternalJqlDslParser.g:596:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:600:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalJqlDslParser.g:601:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalJqlDslParser.g:601:2: ( ( rule__Literal__Alternatives ) )
            // InternalJqlDslParser.g:602:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:603:3: ( rule__Literal__Alternatives )
            // InternalJqlDslParser.g:603:4: rule__Literal__Alternatives
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
    // InternalJqlDslParser.g:612:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:613:1: ( ruleBooleanLiteral EOF )
            // InternalJqlDslParser.g:614:1: ruleBooleanLiteral EOF
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
    // InternalJqlDslParser.g:621:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:625:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalJqlDslParser.g:626:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalJqlDslParser.g:626:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalJqlDslParser.g:627:3: ( rule__BooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:628:3: ( rule__BooleanLiteral__Group__0 )
            // InternalJqlDslParser.g:628:4: rule__BooleanLiteral__Group__0
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
    // InternalJqlDslParser.g:637:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:638:1: ( ruleNumberLiteral EOF )
            // InternalJqlDslParser.g:639:1: ruleNumberLiteral EOF
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
    // InternalJqlDslParser.g:646:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Alternatives ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:650:2: ( ( ( rule__NumberLiteral__Alternatives ) ) )
            // InternalJqlDslParser.g:651:2: ( ( rule__NumberLiteral__Alternatives ) )
            {
            // InternalJqlDslParser.g:651:2: ( ( rule__NumberLiteral__Alternatives ) )
            // InternalJqlDslParser.g:652:3: ( rule__NumberLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:653:3: ( rule__NumberLiteral__Alternatives )
            // InternalJqlDslParser.g:653:4: rule__NumberLiteral__Alternatives
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
    // InternalJqlDslParser.g:662:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:663:1: ( ruleStringLiteral EOF )
            // InternalJqlDslParser.g:664:1: ruleStringLiteral EOF
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
    // InternalJqlDslParser.g:671:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:675:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // InternalJqlDslParser.g:676:2: ( ( rule__StringLiteral__Group__0 ) )
            {
            // InternalJqlDslParser.g:676:2: ( ( rule__StringLiteral__Group__0 ) )
            // InternalJqlDslParser.g:677:3: ( rule__StringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:678:3: ( rule__StringLiteral__Group__0 )
            // InternalJqlDslParser.g:678:4: rule__StringLiteral__Group__0
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
    // InternalJqlDslParser.g:687:1: entryRuleTemporalLiteral : ruleTemporalLiteral EOF ;
    public final void entryRuleTemporalLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:688:1: ( ruleTemporalLiteral EOF )
            // InternalJqlDslParser.g:689:1: ruleTemporalLiteral EOF
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
    // InternalJqlDslParser.g:696:1: ruleTemporalLiteral : ( ( rule__TemporalLiteral__Alternatives ) ) ;
    public final void ruleTemporalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:700:2: ( ( ( rule__TemporalLiteral__Alternatives ) ) )
            // InternalJqlDslParser.g:701:2: ( ( rule__TemporalLiteral__Alternatives ) )
            {
            // InternalJqlDslParser.g:701:2: ( ( rule__TemporalLiteral__Alternatives ) )
            // InternalJqlDslParser.g:702:3: ( rule__TemporalLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:703:3: ( rule__TemporalLiteral__Alternatives )
            // InternalJqlDslParser.g:703:4: rule__TemporalLiteral__Alternatives
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
    // InternalJqlDslParser.g:712:1: entryRuleMeasuredLiteral : ruleMeasuredLiteral EOF ;
    public final void entryRuleMeasuredLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:713:1: ( ruleMeasuredLiteral EOF )
            // InternalJqlDslParser.g:714:1: ruleMeasuredLiteral EOF
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
    // InternalJqlDslParser.g:721:1: ruleMeasuredLiteral : ( ( rule__MeasuredLiteral__Group__0 ) ) ;
    public final void ruleMeasuredLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:725:2: ( ( ( rule__MeasuredLiteral__Group__0 ) ) )
            // InternalJqlDslParser.g:726:2: ( ( rule__MeasuredLiteral__Group__0 ) )
            {
            // InternalJqlDslParser.g:726:2: ( ( rule__MeasuredLiteral__Group__0 ) )
            // InternalJqlDslParser.g:727:3: ( rule__MeasuredLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:728:3: ( rule__MeasuredLiteral__Group__0 )
            // InternalJqlDslParser.g:728:4: rule__MeasuredLiteral__Group__0
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
    // InternalJqlDslParser.g:737:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:738:1: ( ruleEnumLiteral EOF )
            // InternalJqlDslParser.g:739:1: ruleEnumLiteral EOF
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
    // InternalJqlDslParser.g:746:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:750:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalJqlDslParser.g:751:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalJqlDslParser.g:751:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalJqlDslParser.g:752:3: ( rule__EnumLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:753:3: ( rule__EnumLiteral__Group__0 )
            // InternalJqlDslParser.g:753:4: rule__EnumLiteral__Group__0
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
    // InternalJqlDslParser.g:762:1: entryRuleNavigationExpression : ruleNavigationExpression EOF ;
    public final void entryRuleNavigationExpression() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:763:1: ( ruleNavigationExpression EOF )
            // InternalJqlDslParser.g:764:1: ruleNavigationExpression EOF
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
    // InternalJqlDslParser.g:771:1: ruleNavigationExpression : ( ( rule__NavigationExpression__Group__0 ) ) ;
    public final void ruleNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:775:2: ( ( ( rule__NavigationExpression__Group__0 ) ) )
            // InternalJqlDslParser.g:776:2: ( ( rule__NavigationExpression__Group__0 ) )
            {
            // InternalJqlDslParser.g:776:2: ( ( rule__NavigationExpression__Group__0 ) )
            // InternalJqlDslParser.g:777:3: ( rule__NavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:778:3: ( rule__NavigationExpression__Group__0 )
            // InternalJqlDslParser.g:778:4: rule__NavigationExpression__Group__0
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
    // InternalJqlDslParser.g:787:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:788:1: ( ruleFeature EOF )
            // InternalJqlDslParser.g:789:1: ruleFeature EOF
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
    // InternalJqlDslParser.g:796:1: ruleFeature : ( ( rule__Feature__NameAssignment ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:800:2: ( ( ( rule__Feature__NameAssignment ) ) )
            // InternalJqlDslParser.g:801:2: ( ( rule__Feature__NameAssignment ) )
            {
            // InternalJqlDslParser.g:801:2: ( ( rule__Feature__NameAssignment ) )
            // InternalJqlDslParser.g:802:3: ( rule__Feature__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameAssignment()); 
            }
            // InternalJqlDslParser.g:803:3: ( rule__Feature__NameAssignment )
            // InternalJqlDslParser.g:803:4: rule__Feature__NameAssignment
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
    // InternalJqlDslParser.g:812:1: entryRuleNavigationBase : ruleNavigationBase EOF ;
    public final void entryRuleNavigationBase() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:813:1: ( ruleNavigationBase EOF )
            // InternalJqlDslParser.g:814:1: ruleNavigationBase EOF
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
    // InternalJqlDslParser.g:821:1: ruleNavigationBase : ( ( rule__NavigationBase__Alternatives ) ) ;
    public final void ruleNavigationBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:825:2: ( ( ( rule__NavigationBase__Alternatives ) ) )
            // InternalJqlDslParser.g:826:2: ( ( rule__NavigationBase__Alternatives ) )
            {
            // InternalJqlDslParser.g:826:2: ( ( rule__NavigationBase__Alternatives ) )
            // InternalJqlDslParser.g:827:3: ( rule__NavigationBase__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationBaseAccess().getAlternatives()); 
            }
            // InternalJqlDslParser.g:828:3: ( rule__NavigationBase__Alternatives )
            // InternalJqlDslParser.g:828:4: rule__NavigationBase__Alternatives
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
    // InternalJqlDslParser.g:837:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:838:1: ( ruleQualifiedName EOF )
            // InternalJqlDslParser.g:839:1: ruleQualifiedName EOF
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
    // InternalJqlDslParser.g:846:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:850:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalJqlDslParser.g:851:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalJqlDslParser.g:851:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalJqlDslParser.g:852:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalJqlDslParser.g:853:3: ( rule__QualifiedName__Group__0 )
            // InternalJqlDslParser.g:853:4: rule__QualifiedName__Group__0
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
    // InternalJqlDslParser.g:862:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalJqlDslParser.g:863:1: ( ruleValidID EOF )
            // InternalJqlDslParser.g:864:1: ruleValidID EOF
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
    // InternalJqlDslParser.g:871:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:875:2: ( ( RULE_ID ) )
            // InternalJqlDslParser.g:876:2: ( RULE_ID )
            {
            // InternalJqlDslParser.g:876:2: ( RULE_ID )
            // InternalJqlDslParser.g:877:3: RULE_ID
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


    // $ANTLR start "rule__OpEquality__Alternatives"
    // InternalJqlDslParser.g:886:1: rule__OpEquality__Alternatives : ( ( LessThanSignGreaterThanSign ) | ( EqualsSign ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:890:1: ( ( LessThanSignGreaterThanSign ) | ( EqualsSign ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LessThanSignGreaterThanSign) ) {
                alt1=1;
            }
            else if ( (LA1_0==EqualsSign) ) {
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
                    // InternalJqlDslParser.g:891:2: ( LessThanSignGreaterThanSign )
                    {
                    // InternalJqlDslParser.g:891:2: ( LessThanSignGreaterThanSign )
                    // InternalJqlDslParser.g:892:3: LessThanSignGreaterThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                    }
                    match(input,LessThanSignGreaterThanSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:897:2: ( EqualsSign )
                    {
                    // InternalJqlDslParser.g:897:2: ( EqualsSign )
                    // InternalJqlDslParser.g:898:3: EqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getEqualsSignKeyword_1()); 
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
    // InternalJqlDslParser.g:907:1: rule__OpCompare__Alternatives : ( ( GreaterThanSignEqualsSign ) | ( ( rule__OpCompare__Group_1__0 ) ) | ( GreaterThanSign ) | ( LessThanSign ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:911:1: ( ( GreaterThanSignEqualsSign ) | ( ( rule__OpCompare__Group_1__0 ) ) | ( GreaterThanSign ) | ( LessThanSign ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case GreaterThanSignEqualsSign:
                {
                alt2=1;
                }
                break;
            case LessThanSign:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=False && LA2_2<=True)||LA2_2==Not||(LA2_2>=NumberSign && LA2_2<=LeftParenthesis)||LA2_2==HyphenMinus||(LA2_2>=RULE_DATE && LA2_2<=RULE_STRING)) ) {
                    alt2=4;
                }
                else if ( (LA2_2==EqualsSign) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case GreaterThanSign:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJqlDslParser.g:912:2: ( GreaterThanSignEqualsSign )
                    {
                    // InternalJqlDslParser.g:912:2: ( GreaterThanSignEqualsSign )
                    // InternalJqlDslParser.g:913:3: GreaterThanSignEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                    }
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:918:2: ( ( rule__OpCompare__Group_1__0 ) )
                    {
                    // InternalJqlDslParser.g:918:2: ( ( rule__OpCompare__Group_1__0 ) )
                    // InternalJqlDslParser.g:919:3: ( rule__OpCompare__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGroup_1()); 
                    }
                    // InternalJqlDslParser.g:920:3: ( rule__OpCompare__Group_1__0 )
                    // InternalJqlDslParser.g:920:4: rule__OpCompare__Group_1__0
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
                    // InternalJqlDslParser.g:924:2: ( GreaterThanSign )
                    {
                    // InternalJqlDslParser.g:924:2: ( GreaterThanSign )
                    // InternalJqlDslParser.g:925:3: GreaterThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                    }
                    match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDslParser.g:930:2: ( LessThanSign )
                    {
                    // InternalJqlDslParser.g:930:2: ( LessThanSign )
                    // InternalJqlDslParser.g:931:3: LessThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                    }
                    match(input,LessThanSign,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:940:1: rule__OpAdd__Alternatives : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:944:1: ( ( PlusSign ) | ( HyphenMinus ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PlusSign) ) {
                alt3=1;
            }
            else if ( (LA3_0==HyphenMinus) ) {
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
                    // InternalJqlDslParser.g:945:2: ( PlusSign )
                    {
                    // InternalJqlDslParser.g:945:2: ( PlusSign )
                    // InternalJqlDslParser.g:946:3: PlusSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,PlusSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:951:2: ( HyphenMinus )
                    {
                    // InternalJqlDslParser.g:951:2: ( HyphenMinus )
                    // InternalJqlDslParser.g:952:3: HyphenMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:961:1: rule__OpMulti__Alternatives : ( ( Asterisk ) | ( Solidus ) | ( Div ) | ( Mod ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:965:1: ( ( Asterisk ) | ( Solidus ) | ( Div ) | ( Mod ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case Asterisk:
                {
                alt4=1;
                }
                break;
            case Solidus:
                {
                alt4=2;
                }
                break;
            case Div:
                {
                alt4=3;
                }
                break;
            case Mod:
                {
                alt4=4;
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
                    // InternalJqlDslParser.g:966:2: ( Asterisk )
                    {
                    // InternalJqlDslParser.g:966:2: ( Asterisk )
                    // InternalJqlDslParser.g:967:3: Asterisk
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                    }
                    match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:972:2: ( Solidus )
                    {
                    // InternalJqlDslParser.g:972:2: ( Solidus )
                    // InternalJqlDslParser.g:973:3: Solidus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); 
                    }
                    match(input,Solidus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJqlDslParser.g:978:2: ( Div )
                    {
                    // InternalJqlDslParser.g:978:2: ( Div )
                    // InternalJqlDslParser.g:979:3: Div
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDivKeyword_2()); 
                    }
                    match(input,Div,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getDivKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJqlDslParser.g:984:2: ( Mod )
                    {
                    // InternalJqlDslParser.g:984:2: ( Mod )
                    // InternalJqlDslParser.g:985:3: Mod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getModKeyword_3()); 
                    }
                    match(input,Mod,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getModKeyword_3()); 
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
    // InternalJqlDslParser.g:994:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:998:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Not||LA5_0==HyphenMinus) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=False && LA5_0<=True)||(LA5_0>=NumberSign && LA5_0<=LeftParenthesis)||(LA5_0>=RULE_DATE && LA5_0<=RULE_STRING)) ) {
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
                    // InternalJqlDslParser.g:999:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalJqlDslParser.g:999:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalJqlDslParser.g:1000:3: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalJqlDslParser.g:1001:3: ( rule__UnaryOperation__Group_0__0 )
                    // InternalJqlDslParser.g:1001:4: rule__UnaryOperation__Group_0__0
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
                    // InternalJqlDslParser.g:1005:2: ( rulePrimaryExpression )
                    {
                    // InternalJqlDslParser.g:1005:2: ( rulePrimaryExpression )
                    // InternalJqlDslParser.g:1006:3: rulePrimaryExpression
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
    // InternalJqlDslParser.g:1015:1: rule__OpUnary__Alternatives : ( ( Not ) | ( HyphenMinus ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1019:1: ( ( Not ) | ( HyphenMinus ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Not) ) {
                alt6=1;
            }
            else if ( (LA6_0==HyphenMinus) ) {
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
                    // InternalJqlDslParser.g:1020:2: ( Not )
                    {
                    // InternalJqlDslParser.g:1020:2: ( Not )
                    // InternalJqlDslParser.g:1021:3: Not
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNotKeyword_0()); 
                    }
                    match(input,Not,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNotKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:1026:2: ( HyphenMinus )
                    {
                    // InternalJqlDslParser.g:1026:2: ( HyphenMinus )
                    // InternalJqlDslParser.g:1027:3: HyphenMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
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
    // InternalJqlDslParser.g:1036:1: rule__PrimaryExpression__Alternatives : ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1040:1: ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalJqlDslParser.g:1041:2: ( ruleParenthesizedExpression )
                    {
                    // InternalJqlDslParser.g:1041:2: ( ruleParenthesizedExpression )
                    // InternalJqlDslParser.g:1042:3: ruleParenthesizedExpression
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
                    // InternalJqlDslParser.g:1047:2: ( ruleNavigationExpression )
                    {
                    // InternalJqlDslParser.g:1047:2: ( ruleNavigationExpression )
                    // InternalJqlDslParser.g:1048:3: ruleNavigationExpression
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
                    // InternalJqlDslParser.g:1053:2: ( ruleLiteral )
                    {
                    // InternalJqlDslParser.g:1053:2: ( ruleLiteral )
                    // InternalJqlDslParser.g:1054:3: ruleLiteral
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


    // $ANTLR start "rule__Function__Alternatives_3"
    // InternalJqlDslParser.g:1063:1: rule__Function__Alternatives_3 : ( ( ( rule__Function__LambdaAssignment_3_0 ) ) | ( ( rule__Function__Group_3_1__0 ) ) );
    public final void rule__Function__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1067:1: ( ( ( rule__Function__LambdaAssignment_3_0 ) ) | ( ( rule__Function__Group_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==Implies||(LA8_1>=And && LA8_1<=Mod)||(LA8_1>=Xor && LA8_1<=ExclamationMark)||(LA8_1>=RightParenthesis && LA8_1<=Solidus)||(LA8_1>=LessThanSign && LA8_1<=CommercialAt)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==VerticalLine) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=False && LA8_0<=True)||LA8_0==Not||(LA8_0>=NumberSign && LA8_0<=LeftParenthesis)||LA8_0==HyphenMinus||(LA8_0>=RULE_DATE && LA8_0<=RULE_DECIMAL)||LA8_0==RULE_STRING) ) {
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
                    // InternalJqlDslParser.g:1068:2: ( ( rule__Function__LambdaAssignment_3_0 ) )
                    {
                    // InternalJqlDslParser.g:1068:2: ( ( rule__Function__LambdaAssignment_3_0 ) )
                    // InternalJqlDslParser.g:1069:3: ( rule__Function__LambdaAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionAccess().getLambdaAssignment_3_0()); 
                    }
                    // InternalJqlDslParser.g:1070:3: ( rule__Function__LambdaAssignment_3_0 )
                    // InternalJqlDslParser.g:1070:4: rule__Function__LambdaAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__LambdaAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionAccess().getLambdaAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:1074:2: ( ( rule__Function__Group_3_1__0 ) )
                    {
                    // InternalJqlDslParser.g:1074:2: ( ( rule__Function__Group_3_1__0 ) )
                    // InternalJqlDslParser.g:1075:3: ( rule__Function__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionAccess().getGroup_3_1()); 
                    }
                    // InternalJqlDslParser.g:1076:3: ( rule__Function__Group_3_1__0 )
                    // InternalJqlDslParser.g:1076:4: rule__Function__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__Function__Alternatives_3"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalJqlDslParser.g:1084:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1088:1: ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleTemporalLiteral ) | ( ruleEnumLiteral ) | ( ruleMeasuredLiteral ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt9=1;
                }
                break;
            case RULE_INTEGER:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||LA9_2==Implies||(LA9_2>=And && LA9_2<=Mod)||LA9_2==Xor||(LA9_2>=LessThanSignGreaterThanSign && LA9_2<=ExclamationMark)||(LA9_2>=RightParenthesis && LA9_2<=HyphenMinus)||(LA9_2>=Solidus && LA9_2<=QuestionMark)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==LeftSquareBracket) ) {
                    alt9=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMAL:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==EOF||LA9_3==Implies||(LA9_3>=And && LA9_3<=Mod)||LA9_3==Xor||(LA9_3>=LessThanSignGreaterThanSign && LA9_3<=ExclamationMark)||(LA9_3>=RightParenthesis && LA9_3<=HyphenMinus)||(LA9_3>=Solidus && LA9_3<=QuestionMark)) ) {
                    alt9=2;
                }
                else if ( (LA9_3==LeftSquareBracket) ) {
                    alt9=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_DATE:
            case RULE_TIMESTAMP:
                {
                alt9=4;
                }
                break;
            case NumberSign:
            case RULE_ID:
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
                    // InternalJqlDslParser.g:1089:2: ( ruleBooleanLiteral )
                    {
                    // InternalJqlDslParser.g:1089:2: ( ruleBooleanLiteral )
                    // InternalJqlDslParser.g:1090:3: ruleBooleanLiteral
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
                    // InternalJqlDslParser.g:1095:2: ( ruleNumberLiteral )
                    {
                    // InternalJqlDslParser.g:1095:2: ( ruleNumberLiteral )
                    // InternalJqlDslParser.g:1096:3: ruleNumberLiteral
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
                    // InternalJqlDslParser.g:1101:2: ( ruleStringLiteral )
                    {
                    // InternalJqlDslParser.g:1101:2: ( ruleStringLiteral )
                    // InternalJqlDslParser.g:1102:3: ruleStringLiteral
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
                    // InternalJqlDslParser.g:1107:2: ( ruleTemporalLiteral )
                    {
                    // InternalJqlDslParser.g:1107:2: ( ruleTemporalLiteral )
                    // InternalJqlDslParser.g:1108:3: ruleTemporalLiteral
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
                    // InternalJqlDslParser.g:1113:2: ( ruleEnumLiteral )
                    {
                    // InternalJqlDslParser.g:1113:2: ( ruleEnumLiteral )
                    // InternalJqlDslParser.g:1114:3: ruleEnumLiteral
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
                    // InternalJqlDslParser.g:1119:2: ( ruleMeasuredLiteral )
                    {
                    // InternalJqlDslParser.g:1119:2: ( ruleMeasuredLiteral )
                    // InternalJqlDslParser.g:1120:3: ruleMeasuredLiteral
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
    // InternalJqlDslParser.g:1129:1: rule__BooleanLiteral__Alternatives_1 : ( ( False ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1133:1: ( ( False ) | ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==False) ) {
                alt10=1;
            }
            else if ( (LA10_0==True) ) {
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
                    // InternalJqlDslParser.g:1134:2: ( False )
                    {
                    // InternalJqlDslParser.g:1134:2: ( False )
                    // InternalJqlDslParser.g:1135:3: False
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }
                    match(input,False,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJqlDslParser.g:1140:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    {
                    // InternalJqlDslParser.g:1140:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_1 ) )
                    // InternalJqlDslParser.g:1141:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_1()); 
                    }
                    // InternalJqlDslParser.g:1142:3: ( rule__BooleanLiteral__IsTrueAssignment_1_1 )
                    // InternalJqlDslParser.g:1142:4: rule__BooleanLiteral__IsTrueAssignment_1_1
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
    // InternalJqlDslParser.g:1150:1: rule__NumberLiteral__Alternatives : ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) );
    public final void rule__NumberLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1154:1: ( ( ( rule__NumberLiteral__Group_0__0 ) ) | ( ( rule__NumberLiteral__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INTEGER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DECIMAL) ) {
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
                    // InternalJqlDslParser.g:1155:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDslParser.g:1155:2: ( ( rule__NumberLiteral__Group_0__0 ) )
                    // InternalJqlDslParser.g:1156:3: ( rule__NumberLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDslParser.g:1157:3: ( rule__NumberLiteral__Group_0__0 )
                    // InternalJqlDslParser.g:1157:4: rule__NumberLiteral__Group_0__0
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
                    // InternalJqlDslParser.g:1161:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDslParser.g:1161:2: ( ( rule__NumberLiteral__Group_1__0 ) )
                    // InternalJqlDslParser.g:1162:3: ( rule__NumberLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDslParser.g:1163:3: ( rule__NumberLiteral__Group_1__0 )
                    // InternalJqlDslParser.g:1163:4: rule__NumberLiteral__Group_1__0
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
    // InternalJqlDslParser.g:1171:1: rule__TemporalLiteral__Alternatives : ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) );
    public final void rule__TemporalLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1175:1: ( ( ( rule__TemporalLiteral__Group_0__0 ) ) | ( ( rule__TemporalLiteral__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DATE) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_TIMESTAMP) ) {
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
                    // InternalJqlDslParser.g:1176:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    {
                    // InternalJqlDslParser.g:1176:2: ( ( rule__TemporalLiteral__Group_0__0 ) )
                    // InternalJqlDslParser.g:1177:3: ( rule__TemporalLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_0()); 
                    }
                    // InternalJqlDslParser.g:1178:3: ( rule__TemporalLiteral__Group_0__0 )
                    // InternalJqlDslParser.g:1178:4: rule__TemporalLiteral__Group_0__0
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
                    // InternalJqlDslParser.g:1182:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    {
                    // InternalJqlDslParser.g:1182:2: ( ( rule__TemporalLiteral__Group_1__0 ) )
                    // InternalJqlDslParser.g:1183:3: ( rule__TemporalLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalLiteralAccess().getGroup_1()); 
                    }
                    // InternalJqlDslParser.g:1184:3: ( rule__TemporalLiteral__Group_1__0 )
                    // InternalJqlDslParser.g:1184:4: rule__TemporalLiteral__Group_1__0
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
    // InternalJqlDslParser.g:1192:1: rule__NavigationBase__Alternatives : ( ( ruleValidID ) | ( ruleQualifiedName ) );
    public final void rule__NavigationBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1196:1: ( ( ruleValidID ) | ( ruleQualifiedName ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==Implies||(LA13_1>=And && LA13_1<=Mod)||LA13_1==Xor||(LA13_1>=LessThanSignGreaterThanSign && LA13_1<=ExclamationMark)||(LA13_1>=RightParenthesis && LA13_1<=CommercialAt)) ) {
                    alt13=1;
                }
                else if ( (LA13_1==ColonColon) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJqlDslParser.g:1197:2: ( ruleValidID )
                    {
                    // InternalJqlDslParser.g:1197:2: ( ruleValidID )
                    // InternalJqlDslParser.g:1198:3: ruleValidID
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
                    // InternalJqlDslParser.g:1203:2: ( ruleQualifiedName )
                    {
                    // InternalJqlDslParser.g:1203:2: ( ruleQualifiedName )
                    // InternalJqlDslParser.g:1204:3: ruleQualifiedName
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


    // $ANTLR start "rule__SwitchExpression__Group__0"
    // InternalJqlDslParser.g:1213:1: rule__SwitchExpression__Group__0 : rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 ;
    public final void rule__SwitchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1217:1: ( rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 )
            // InternalJqlDslParser.g:1218:2: rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalJqlDslParser.g:1225:1: rule__SwitchExpression__Group__0__Impl : ( ruleImpliesExpression ) ;
    public final void rule__SwitchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1229:1: ( ( ruleImpliesExpression ) )
            // InternalJqlDslParser.g:1230:1: ( ruleImpliesExpression )
            {
            // InternalJqlDslParser.g:1230:1: ( ruleImpliesExpression )
            // InternalJqlDslParser.g:1231:2: ruleImpliesExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__0__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__1"
    // InternalJqlDslParser.g:1240:1: rule__SwitchExpression__Group__1 : rule__SwitchExpression__Group__1__Impl ;
    public final void rule__SwitchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1244:1: ( rule__SwitchExpression__Group__1__Impl )
            // InternalJqlDslParser.g:1245:2: rule__SwitchExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalJqlDslParser.g:1251:1: rule__SwitchExpression__Group__1__Impl : ( ( rule__SwitchExpression__Group_1__0 )? ) ;
    public final void rule__SwitchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1255:1: ( ( ( rule__SwitchExpression__Group_1__0 )? ) )
            // InternalJqlDslParser.g:1256:1: ( ( rule__SwitchExpression__Group_1__0 )? )
            {
            // InternalJqlDslParser.g:1256:1: ( ( rule__SwitchExpression__Group_1__0 )? )
            // InternalJqlDslParser.g:1257:2: ( rule__SwitchExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:1258:2: ( rule__SwitchExpression__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QuestionMark) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJqlDslParser.g:1258:3: rule__SwitchExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SwitchExpression__Group_1__0"
    // InternalJqlDslParser.g:1267:1: rule__SwitchExpression__Group_1__0 : rule__SwitchExpression__Group_1__0__Impl rule__SwitchExpression__Group_1__1 ;
    public final void rule__SwitchExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1271:1: ( rule__SwitchExpression__Group_1__0__Impl rule__SwitchExpression__Group_1__1 )
            // InternalJqlDslParser.g:1272:2: rule__SwitchExpression__Group_1__0__Impl rule__SwitchExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SwitchExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__0"


    // $ANTLR start "rule__SwitchExpression__Group_1__0__Impl"
    // InternalJqlDslParser.g:1279:1: rule__SwitchExpression__Group_1__0__Impl : ( ( rule__SwitchExpression__Group_1_0__0 ) ) ;
    public final void rule__SwitchExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1283:1: ( ( ( rule__SwitchExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:1284:1: ( ( rule__SwitchExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:1284:1: ( ( rule__SwitchExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:1285:2: ( rule__SwitchExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:1286:2: ( rule__SwitchExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:1286:3: rule__SwitchExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SwitchExpression__Group_1__1"
    // InternalJqlDslParser.g:1294:1: rule__SwitchExpression__Group_1__1 : rule__SwitchExpression__Group_1__1__Impl rule__SwitchExpression__Group_1__2 ;
    public final void rule__SwitchExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1298:1: ( rule__SwitchExpression__Group_1__1__Impl rule__SwitchExpression__Group_1__2 )
            // InternalJqlDslParser.g:1299:2: rule__SwitchExpression__Group_1__1__Impl rule__SwitchExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__SwitchExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__1"


    // $ANTLR start "rule__SwitchExpression__Group_1__1__Impl"
    // InternalJqlDslParser.g:1306:1: rule__SwitchExpression__Group_1__1__Impl : ( ( rule__SwitchExpression__ThenExpressionAssignment_1_1 ) ) ;
    public final void rule__SwitchExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1310:1: ( ( ( rule__SwitchExpression__ThenExpressionAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:1311:1: ( ( rule__SwitchExpression__ThenExpressionAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:1311:1: ( ( rule__SwitchExpression__ThenExpressionAssignment_1_1 ) )
            // InternalJqlDslParser.g:1312:2: ( rule__SwitchExpression__ThenExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getThenExpressionAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:1313:2: ( rule__SwitchExpression__ThenExpressionAssignment_1_1 )
            // InternalJqlDslParser.g:1313:3: rule__SwitchExpression__ThenExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__ThenExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getThenExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SwitchExpression__Group_1__2"
    // InternalJqlDslParser.g:1321:1: rule__SwitchExpression__Group_1__2 : rule__SwitchExpression__Group_1__2__Impl rule__SwitchExpression__Group_1__3 ;
    public final void rule__SwitchExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1325:1: ( rule__SwitchExpression__Group_1__2__Impl rule__SwitchExpression__Group_1__3 )
            // InternalJqlDslParser.g:1326:2: rule__SwitchExpression__Group_1__2__Impl rule__SwitchExpression__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__SwitchExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__2"


    // $ANTLR start "rule__SwitchExpression__Group_1__2__Impl"
    // InternalJqlDslParser.g:1333:1: rule__SwitchExpression__Group_1__2__Impl : ( Colon ) ;
    public final void rule__SwitchExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1337:1: ( ( Colon ) )
            // InternalJqlDslParser.g:1338:1: ( Colon )
            {
            // InternalJqlDslParser.g:1338:1: ( Colon )
            // InternalJqlDslParser.g:1339:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getColonKeyword_1_2()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getColonKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SwitchExpression__Group_1__3"
    // InternalJqlDslParser.g:1348:1: rule__SwitchExpression__Group_1__3 : rule__SwitchExpression__Group_1__3__Impl ;
    public final void rule__SwitchExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1352:1: ( rule__SwitchExpression__Group_1__3__Impl )
            // InternalJqlDslParser.g:1353:2: rule__SwitchExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__3"


    // $ANTLR start "rule__SwitchExpression__Group_1__3__Impl"
    // InternalJqlDslParser.g:1359:1: rule__SwitchExpression__Group_1__3__Impl : ( ( rule__SwitchExpression__ElseExpressionAssignment_1_3 ) ) ;
    public final void rule__SwitchExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1363:1: ( ( ( rule__SwitchExpression__ElseExpressionAssignment_1_3 ) ) )
            // InternalJqlDslParser.g:1364:1: ( ( rule__SwitchExpression__ElseExpressionAssignment_1_3 ) )
            {
            // InternalJqlDslParser.g:1364:1: ( ( rule__SwitchExpression__ElseExpressionAssignment_1_3 ) )
            // InternalJqlDslParser.g:1365:2: ( rule__SwitchExpression__ElseExpressionAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getElseExpressionAssignment_1_3()); 
            }
            // InternalJqlDslParser.g:1366:2: ( rule__SwitchExpression__ElseExpressionAssignment_1_3 )
            // InternalJqlDslParser.g:1366:3: rule__SwitchExpression__ElseExpressionAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__ElseExpressionAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getElseExpressionAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1__3__Impl"


    // $ANTLR start "rule__SwitchExpression__Group_1_0__0"
    // InternalJqlDslParser.g:1375:1: rule__SwitchExpression__Group_1_0__0 : rule__SwitchExpression__Group_1_0__0__Impl ;
    public final void rule__SwitchExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1379:1: ( rule__SwitchExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:1380:2: rule__SwitchExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1_0__0"


    // $ANTLR start "rule__SwitchExpression__Group_1_0__0__Impl"
    // InternalJqlDslParser.g:1386:1: rule__SwitchExpression__Group_1_0__0__Impl : ( ( rule__SwitchExpression__Group_1_0_0__0 ) ) ;
    public final void rule__SwitchExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1390:1: ( ( ( rule__SwitchExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:1391:1: ( ( rule__SwitchExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:1391:1: ( ( rule__SwitchExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:1392:2: ( rule__SwitchExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:1393:2: ( rule__SwitchExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:1393:3: rule__SwitchExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__SwitchExpression__Group_1_0_0__0"
    // InternalJqlDslParser.g:1402:1: rule__SwitchExpression__Group_1_0_0__0 : rule__SwitchExpression__Group_1_0_0__0__Impl rule__SwitchExpression__Group_1_0_0__1 ;
    public final void rule__SwitchExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1406:1: ( rule__SwitchExpression__Group_1_0_0__0__Impl rule__SwitchExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:1407:2: rule__SwitchExpression__Group_1_0_0__0__Impl rule__SwitchExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__SwitchExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1_0_0__0"


    // $ANTLR start "rule__SwitchExpression__Group_1_0_0__0__Impl"
    // InternalJqlDslParser.g:1414:1: rule__SwitchExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__SwitchExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1418:1: ( ( () ) )
            // InternalJqlDslParser.g:1419:1: ( () )
            {
            // InternalJqlDslParser.g:1419:1: ( () )
            // InternalJqlDslParser.g:1420:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getTernaryOperationConditionAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:1421:2: ()
            // InternalJqlDslParser.g:1421:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getTernaryOperationConditionAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__SwitchExpression__Group_1_0_0__1"
    // InternalJqlDslParser.g:1429:1: rule__SwitchExpression__Group_1_0_0__1 : rule__SwitchExpression__Group_1_0_0__1__Impl ;
    public final void rule__SwitchExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1433:1: ( rule__SwitchExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:1434:2: rule__SwitchExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1_0_0__1"


    // $ANTLR start "rule__SwitchExpression__Group_1_0_0__1__Impl"
    // InternalJqlDslParser.g:1440:1: rule__SwitchExpression__Group_1_0_0__1__Impl : ( QuestionMark ) ;
    public final void rule__SwitchExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1444:1: ( ( QuestionMark ) )
            // InternalJqlDslParser.g:1445:1: ( QuestionMark )
            {
            // InternalJqlDslParser.g:1445:1: ( QuestionMark )
            // InternalJqlDslParser.g:1446:2: QuestionMark
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getQuestionMarkKeyword_1_0_0_1()); 
            }
            match(input,QuestionMark,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getQuestionMarkKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__0"
    // InternalJqlDslParser.g:1456:1: rule__ImpliesExpression__Group__0 : rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 ;
    public final void rule__ImpliesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1460:1: ( rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 )
            // InternalJqlDslParser.g:1461:2: rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ImpliesExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0"


    // $ANTLR start "rule__ImpliesExpression__Group__0__Impl"
    // InternalJqlDslParser.g:1468:1: rule__ImpliesExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ImpliesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1472:1: ( ( ruleOrExpression ) )
            // InternalJqlDslParser.g:1473:1: ( ruleOrExpression )
            {
            // InternalJqlDslParser.g:1473:1: ( ruleOrExpression )
            // InternalJqlDslParser.g:1474:2: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__1"
    // InternalJqlDslParser.g:1483:1: rule__ImpliesExpression__Group__1 : rule__ImpliesExpression__Group__1__Impl ;
    public final void rule__ImpliesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1487:1: ( rule__ImpliesExpression__Group__1__Impl )
            // InternalJqlDslParser.g:1488:2: rule__ImpliesExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1"


    // $ANTLR start "rule__ImpliesExpression__Group__1__Impl"
    // InternalJqlDslParser.g:1494:1: rule__ImpliesExpression__Group__1__Impl : ( ( rule__ImpliesExpression__Group_1__0 )* ) ;
    public final void rule__ImpliesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1498:1: ( ( ( rule__ImpliesExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:1499:1: ( ( rule__ImpliesExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:1499:1: ( ( rule__ImpliesExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:1500:2: ( rule__ImpliesExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:1501:2: ( rule__ImpliesExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Implies) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJqlDslParser.g:1501:3: rule__ImpliesExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ImpliesExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0"
    // InternalJqlDslParser.g:1510:1: rule__ImpliesExpression__Group_1__0 : rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 ;
    public final void rule__ImpliesExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1514:1: ( rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 )
            // InternalJqlDslParser.g:1515:2: rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ImpliesExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0__Impl"
    // InternalJqlDslParser.g:1522:1: rule__ImpliesExpression__Group_1__0__Impl : ( ( rule__ImpliesExpression__Group_1_0__0 ) ) ;
    public final void rule__ImpliesExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1526:1: ( ( ( rule__ImpliesExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:1527:1: ( ( rule__ImpliesExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:1527:1: ( ( rule__ImpliesExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:1528:2: ( rule__ImpliesExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:1529:2: ( rule__ImpliesExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:1529:3: rule__ImpliesExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1"
    // InternalJqlDslParser.g:1537:1: rule__ImpliesExpression__Group_1__1 : rule__ImpliesExpression__Group_1__1__Impl ;
    public final void rule__ImpliesExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1541:1: ( rule__ImpliesExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:1542:2: rule__ImpliesExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1__Impl"
    // InternalJqlDslParser.g:1548:1: rule__ImpliesExpression__Group_1__1__Impl : ( ( rule__ImpliesExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__ImpliesExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1552:1: ( ( ( rule__ImpliesExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:1553:1: ( ( rule__ImpliesExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:1553:1: ( ( rule__ImpliesExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:1554:2: ( rule__ImpliesExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:1555:2: ( rule__ImpliesExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:1555:3: rule__ImpliesExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getRightOperandAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1_0__0"
    // InternalJqlDslParser.g:1564:1: rule__ImpliesExpression__Group_1_0__0 : rule__ImpliesExpression__Group_1_0__0__Impl ;
    public final void rule__ImpliesExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1568:1: ( rule__ImpliesExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:1569:2: rule__ImpliesExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1_0__0"


    // $ANTLR start "rule__ImpliesExpression__Group_1_0__0__Impl"
    // InternalJqlDslParser.g:1575:1: rule__ImpliesExpression__Group_1_0__0__Impl : ( ( rule__ImpliesExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ImpliesExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1579:1: ( ( ( rule__ImpliesExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:1580:1: ( ( rule__ImpliesExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:1580:1: ( ( rule__ImpliesExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:1581:2: ( rule__ImpliesExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:1582:2: ( rule__ImpliesExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:1582:3: rule__ImpliesExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1_0_0__0"
    // InternalJqlDslParser.g:1591:1: rule__ImpliesExpression__Group_1_0_0__0 : rule__ImpliesExpression__Group_1_0_0__0__Impl rule__ImpliesExpression__Group_1_0_0__1 ;
    public final void rule__ImpliesExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1595:1: ( rule__ImpliesExpression__Group_1_0_0__0__Impl rule__ImpliesExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:1596:2: rule__ImpliesExpression__Group_1_0_0__0__Impl rule__ImpliesExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ImpliesExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ImpliesExpression__Group_1_0_0__0__Impl"
    // InternalJqlDslParser.g:1603:1: rule__ImpliesExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ImpliesExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1607:1: ( ( () ) )
            // InternalJqlDslParser.g:1608:1: ( () )
            {
            // InternalJqlDslParser.g:1608:1: ( () )
            // InternalJqlDslParser.g:1609:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:1610:2: ()
            // InternalJqlDslParser.g:1610:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1_0_0__1"
    // InternalJqlDslParser.g:1618:1: rule__ImpliesExpression__Group_1_0_0__1 : rule__ImpliesExpression__Group_1_0_0__1__Impl ;
    public final void rule__ImpliesExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1622:1: ( rule__ImpliesExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:1623:2: rule__ImpliesExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ImpliesExpression__Group_1_0_0__1__Impl"
    // InternalJqlDslParser.g:1629:1: rule__ImpliesExpression__Group_1_0_0__1__Impl : ( ( rule__ImpliesExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ImpliesExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1633:1: ( ( ( rule__ImpliesExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:1634:1: ( ( rule__ImpliesExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:1634:1: ( ( rule__ImpliesExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:1635:2: ( rule__ImpliesExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:1636:2: ( rule__ImpliesExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:1636:3: rule__ImpliesExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalJqlDslParser.g:1645:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1649:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalJqlDslParser.g:1650:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalJqlDslParser.g:1657:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1661:1: ( ( ruleXorExpression ) )
            // InternalJqlDslParser.g:1662:1: ( ruleXorExpression )
            {
            // InternalJqlDslParser.g:1662:1: ( ruleXorExpression )
            // InternalJqlDslParser.g:1663:2: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalJqlDslParser.g:1672:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1676:1: ( rule__OrExpression__Group__1__Impl )
            // InternalJqlDslParser.g:1677:2: rule__OrExpression__Group__1__Impl
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
    // InternalJqlDslParser.g:1683:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1687:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:1688:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:1688:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:1689:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:1690:2: ( rule__OrExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Or) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJqlDslParser.g:1690:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalJqlDslParser.g:1699:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1703:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalJqlDslParser.g:1704:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:1711:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1715:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:1716:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:1716:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:1717:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:1718:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:1718:3: rule__OrExpression__Group_1_0__0
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
    // InternalJqlDslParser.g:1726:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1730:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:1731:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:1737:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1741:1: ( ( ( rule__OrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:1742:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:1742:1: ( ( rule__OrExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:1743:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:1744:2: ( rule__OrExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:1744:3: rule__OrExpression__RightOperandAssignment_1_1
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
    // InternalJqlDslParser.g:1753:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1757:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:1758:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalJqlDslParser.g:1764:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1768:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:1769:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:1769:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:1770:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:1771:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:1771:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalJqlDslParser.g:1780:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1784:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:1785:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalJqlDslParser.g:1792:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1796:1: ( ( () ) )
            // InternalJqlDslParser.g:1797:1: ( () )
            {
            // InternalJqlDslParser.g:1797:1: ( () )
            // InternalJqlDslParser.g:1798:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:1799:2: ()
            // InternalJqlDslParser.g:1799:3: 
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
    // InternalJqlDslParser.g:1807:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1811:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:1812:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDslParser.g:1818:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1822:1: ( ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:1823:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:1823:1: ( ( rule__OrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:1824:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:1825:2: ( rule__OrExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:1825:3: rule__OrExpression__OperatorAssignment_1_0_0_1
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


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalJqlDslParser.g:1834:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1838:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalJqlDslParser.g:1839:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalJqlDslParser.g:1846:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1850:1: ( ( ruleAndExpression ) )
            // InternalJqlDslParser.g:1851:1: ( ruleAndExpression )
            {
            // InternalJqlDslParser.g:1851:1: ( ruleAndExpression )
            // InternalJqlDslParser.g:1852:2: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalJqlDslParser.g:1861:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1865:1: ( rule__XorExpression__Group__1__Impl )
            // InternalJqlDslParser.g:1866:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalJqlDslParser.g:1872:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1876:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:1877:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:1877:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:1878:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:1879:2: ( rule__XorExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Xor) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJqlDslParser.g:1879:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalJqlDslParser.g:1888:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1892:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalJqlDslParser.g:1893:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalJqlDslParser.g:1900:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1904:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:1905:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:1905:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:1906:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:1907:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:1907:3: rule__XorExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalJqlDslParser.g:1915:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1919:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:1920:2: rule__XorExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalJqlDslParser.g:1926:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1930:1: ( ( ( rule__XorExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:1931:1: ( ( rule__XorExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:1931:1: ( ( rule__XorExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:1932:2: ( rule__XorExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:1933:2: ( rule__XorExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:1933:3: rule__XorExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getRightOperandAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0__0"
    // InternalJqlDslParser.g:1942:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1946:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:1947:2: rule__XorExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0__0"


    // $ANTLR start "rule__XorExpression__Group_1_0__0__Impl"
    // InternalJqlDslParser.g:1953:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1957:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:1958:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:1958:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:1959:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:1960:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:1960:3: rule__XorExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__0"
    // InternalJqlDslParser.g:1969:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1973:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:1974:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_10);
            rule__XorExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0_0__0"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__0__Impl"
    // InternalJqlDslParser.g:1981:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:1985:1: ( ( () ) )
            // InternalJqlDslParser.g:1986:1: ( () )
            {
            // InternalJqlDslParser.g:1986:1: ( () )
            // InternalJqlDslParser.g:1987:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:1988:2: ()
            // InternalJqlDslParser.g:1988:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__1"
    // InternalJqlDslParser.g:1996:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2000:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:2001:2: rule__XorExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0_0__1"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__1__Impl"
    // InternalJqlDslParser.g:2007:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2011:1: ( ( ( rule__XorExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:2012:1: ( ( rule__XorExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:2012:1: ( ( rule__XorExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:2013:2: ( rule__XorExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:2014:2: ( rule__XorExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:2014:3: rule__XorExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalJqlDslParser.g:2023:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2027:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalJqlDslParser.g:2028:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJqlDslParser.g:2035:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2039:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDslParser.g:2040:1: ( ruleEqualityExpression )
            {
            // InternalJqlDslParser.g:2040:1: ( ruleEqualityExpression )
            // InternalJqlDslParser.g:2041:2: ruleEqualityExpression
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
    // InternalJqlDslParser.g:2050:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2054:1: ( rule__AndExpression__Group__1__Impl )
            // InternalJqlDslParser.g:2055:2: rule__AndExpression__Group__1__Impl
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
    // InternalJqlDslParser.g:2061:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2065:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:2066:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:2066:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:2067:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:2068:2: ( rule__AndExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==And) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJqlDslParser.g:2068:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalJqlDslParser.g:2077:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2081:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalJqlDslParser.g:2082:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:2089:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2093:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:2094:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:2094:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:2095:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:2096:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:2096:3: rule__AndExpression__Group_1_0__0
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
    // InternalJqlDslParser.g:2104:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2108:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:2109:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:2115:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2119:1: ( ( ( rule__AndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:2120:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:2120:1: ( ( rule__AndExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:2121:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:2122:2: ( rule__AndExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:2122:3: rule__AndExpression__RightOperandAssignment_1_1
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
    // InternalJqlDslParser.g:2131:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2135:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:2136:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalJqlDslParser.g:2142:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2146:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:2147:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:2147:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:2148:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:2149:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:2149:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalJqlDslParser.g:2158:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2162:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:2163:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJqlDslParser.g:2170:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2174:1: ( ( () ) )
            // InternalJqlDslParser.g:2175:1: ( () )
            {
            // InternalJqlDslParser.g:2175:1: ( () )
            // InternalJqlDslParser.g:2176:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:2177:2: ()
            // InternalJqlDslParser.g:2177:3: 
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
    // InternalJqlDslParser.g:2185:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2189:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:2190:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDslParser.g:2196:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2200:1: ( ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:2201:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:2201:1: ( ( rule__AndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:2202:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:2203:2: ( rule__AndExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:2203:3: rule__AndExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDslParser.g:2212:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2216:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalJqlDslParser.g:2217:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalJqlDslParser.g:2224:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2228:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDslParser.g:2229:1: ( ruleRelationalExpression )
            {
            // InternalJqlDslParser.g:2229:1: ( ruleRelationalExpression )
            // InternalJqlDslParser.g:2230:2: ruleRelationalExpression
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
    // InternalJqlDslParser.g:2239:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2243:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalJqlDslParser.g:2244:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalJqlDslParser.g:2250:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2254:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:2255:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:2255:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:2256:2: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:2257:2: ( rule__EqualityExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LessThanSignGreaterThanSign||LA19_0==EqualsSign) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJqlDslParser.g:2257:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalJqlDslParser.g:2266:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2270:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalJqlDslParser.g:2271:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:2278:1: rule__EqualityExpression__Group_1__0__Impl : ( ( rule__EqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2282:1: ( ( ( rule__EqualityExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:2283:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:2283:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:2284:2: ( rule__EqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:2285:2: ( rule__EqualityExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:2285:3: rule__EqualityExpression__Group_1_0__0
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
    // InternalJqlDslParser.g:2293:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2297:1: ( rule__EqualityExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:2298:2: rule__EqualityExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:2304:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2308:1: ( ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:2309:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:2309:1: ( ( rule__EqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:2310:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:2311:2: ( rule__EqualityExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:2311:3: rule__EqualityExpression__RightOperandAssignment_1_1
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
    // InternalJqlDslParser.g:2320:1: rule__EqualityExpression__Group_1_0__0 : rule__EqualityExpression__Group_1_0__0__Impl ;
    public final void rule__EqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2324:1: ( rule__EqualityExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:2325:2: rule__EqualityExpression__Group_1_0__0__Impl
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
    // InternalJqlDslParser.g:2331:1: rule__EqualityExpression__Group_1_0__0__Impl : ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2335:1: ( ( ( rule__EqualityExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:2336:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:2336:1: ( ( rule__EqualityExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:2337:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:2338:2: ( rule__EqualityExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:2338:3: rule__EqualityExpression__Group_1_0_0__0
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
    // InternalJqlDslParser.g:2347:1: rule__EqualityExpression__Group_1_0_0__0 : rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 ;
    public final void rule__EqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2351:1: ( rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:2352:2: rule__EqualityExpression__Group_1_0_0__0__Impl rule__EqualityExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalJqlDslParser.g:2359:1: rule__EqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2363:1: ( ( () ) )
            // InternalJqlDslParser.g:2364:1: ( () )
            {
            // InternalJqlDslParser.g:2364:1: ( () )
            // InternalJqlDslParser.g:2365:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:2366:2: ()
            // InternalJqlDslParser.g:2366:3: 
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
    // InternalJqlDslParser.g:2374:1: rule__EqualityExpression__Group_1_0_0__1 : rule__EqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__EqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2378:1: ( rule__EqualityExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:2379:2: rule__EqualityExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDslParser.g:2385:1: rule__EqualityExpression__Group_1_0_0__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__EqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2389:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:2390:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:2390:1: ( ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:2391:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:2392:2: ( rule__EqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:2392:3: rule__EqualityExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDslParser.g:2401:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2405:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalJqlDslParser.g:2406:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJqlDslParser.g:2413:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2417:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDslParser.g:2418:1: ( ruleAdditiveExpression )
            {
            // InternalJqlDslParser.g:2418:1: ( ruleAdditiveExpression )
            // InternalJqlDslParser.g:2419:2: ruleAdditiveExpression
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
    // InternalJqlDslParser.g:2428:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2432:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalJqlDslParser.g:2433:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalJqlDslParser.g:2439:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2443:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:2444:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:2444:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:2445:2: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:2446:2: ( rule__RelationalExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==GreaterThanSignEqualsSign||LA20_0==LessThanSign||LA20_0==GreaterThanSign) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJqlDslParser.g:2446:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalJqlDslParser.g:2455:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2459:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalJqlDslParser.g:2460:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:2467:1: rule__RelationalExpression__Group_1__0__Impl : ( ( rule__RelationalExpression__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2471:1: ( ( ( rule__RelationalExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:2472:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:2472:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:2473:2: ( rule__RelationalExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:2474:2: ( rule__RelationalExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:2474:3: rule__RelationalExpression__Group_1_0__0
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
    // InternalJqlDslParser.g:2482:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2486:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:2487:2: rule__RelationalExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:2493:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2497:1: ( ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:2498:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:2498:1: ( ( rule__RelationalExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:2499:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:2500:2: ( rule__RelationalExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:2500:3: rule__RelationalExpression__RightOperandAssignment_1_1
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
    // InternalJqlDslParser.g:2509:1: rule__RelationalExpression__Group_1_0__0 : rule__RelationalExpression__Group_1_0__0__Impl ;
    public final void rule__RelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2513:1: ( rule__RelationalExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:2514:2: rule__RelationalExpression__Group_1_0__0__Impl
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
    // InternalJqlDslParser.g:2520:1: rule__RelationalExpression__Group_1_0__0__Impl : ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2524:1: ( ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:2525:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:2525:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:2526:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:2527:2: ( rule__RelationalExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:2527:3: rule__RelationalExpression__Group_1_0_0__0
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
    // InternalJqlDslParser.g:2536:1: rule__RelationalExpression__Group_1_0_0__0 : rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 ;
    public final void rule__RelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2540:1: ( rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:2541:2: rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJqlDslParser.g:2548:1: rule__RelationalExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2552:1: ( ( () ) )
            // InternalJqlDslParser.g:2553:1: ( () )
            {
            // InternalJqlDslParser.g:2553:1: ( () )
            // InternalJqlDslParser.g:2554:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:2555:2: ()
            // InternalJqlDslParser.g:2555:3: 
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
    // InternalJqlDslParser.g:2563:1: rule__RelationalExpression__Group_1_0_0__1 : rule__RelationalExpression__Group_1_0_0__1__Impl ;
    public final void rule__RelationalExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2567:1: ( rule__RelationalExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:2568:2: rule__RelationalExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDslParser.g:2574:1: rule__RelationalExpression__Group_1_0_0__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__RelationalExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2578:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:2579:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:2579:1: ( ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:2580:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:2581:2: ( rule__RelationalExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:2581:3: rule__RelationalExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDslParser.g:2590:1: rule__OpCompare__Group_1__0 : rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 ;
    public final void rule__OpCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2594:1: ( rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1 )
            // InternalJqlDslParser.g:2595:2: rule__OpCompare__Group_1__0__Impl rule__OpCompare__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalJqlDslParser.g:2602:1: rule__OpCompare__Group_1__0__Impl : ( LessThanSign ) ;
    public final void rule__OpCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2606:1: ( ( LessThanSign ) )
            // InternalJqlDslParser.g:2607:1: ( LessThanSign )
            {
            // InternalJqlDslParser.g:2607:1: ( LessThanSign )
            // InternalJqlDslParser.g:2608:2: LessThanSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,LessThanSign,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:2617:1: rule__OpCompare__Group_1__1 : rule__OpCompare__Group_1__1__Impl ;
    public final void rule__OpCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2621:1: ( rule__OpCompare__Group_1__1__Impl )
            // InternalJqlDslParser.g:2622:2: rule__OpCompare__Group_1__1__Impl
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
    // InternalJqlDslParser.g:2628:1: rule__OpCompare__Group_1__1__Impl : ( EqualsSign ) ;
    public final void rule__OpCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2632:1: ( ( EqualsSign ) )
            // InternalJqlDslParser.g:2633:1: ( EqualsSign )
            {
            // InternalJqlDslParser.g:2633:1: ( EqualsSign )
            // InternalJqlDslParser.g:2634:2: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:2644:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2648:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalJqlDslParser.g:2649:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalJqlDslParser.g:2656:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2660:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDslParser.g:2661:1: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDslParser.g:2661:1: ( ruleMultiplicativeExpression )
            // InternalJqlDslParser.g:2662:2: ruleMultiplicativeExpression
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
    // InternalJqlDslParser.g:2671:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2675:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalJqlDslParser.g:2676:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalJqlDslParser.g:2682:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2686:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:2687:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:2687:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:2688:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:2689:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==PlusSign||LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJqlDslParser.g:2689:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalJqlDslParser.g:2698:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2702:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalJqlDslParser.g:2703:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:2710:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2714:1: ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) )
            // InternalJqlDslParser.g:2715:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            {
            // InternalJqlDslParser.g:2715:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            // InternalJqlDslParser.g:2716:2: ( rule__AdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalJqlDslParser.g:2717:2: ( rule__AdditiveExpression__Group_1_0__0 )
            // InternalJqlDslParser.g:2717:3: rule__AdditiveExpression__Group_1_0__0
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
    // InternalJqlDslParser.g:2725:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2729:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:2730:2: rule__AdditiveExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:2736:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2740:1: ( ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:2741:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:2741:1: ( ( rule__AdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalJqlDslParser.g:2742:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:2743:2: ( rule__AdditiveExpression__RightOperandAssignment_1_1 )
            // InternalJqlDslParser.g:2743:3: rule__AdditiveExpression__RightOperandAssignment_1_1
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
    // InternalJqlDslParser.g:2752:1: rule__AdditiveExpression__Group_1_0__0 : rule__AdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__AdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2756:1: ( rule__AdditiveExpression__Group_1_0__0__Impl )
            // InternalJqlDslParser.g:2757:2: rule__AdditiveExpression__Group_1_0__0__Impl
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
    // InternalJqlDslParser.g:2763:1: rule__AdditiveExpression__Group_1_0__0__Impl : ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2767:1: ( ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalJqlDslParser.g:2768:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalJqlDslParser.g:2768:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            // InternalJqlDslParser.g:2769:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalJqlDslParser.g:2770:2: ( rule__AdditiveExpression__Group_1_0_0__0 )
            // InternalJqlDslParser.g:2770:3: rule__AdditiveExpression__Group_1_0_0__0
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
    // InternalJqlDslParser.g:2779:1: rule__AdditiveExpression__Group_1_0_0__0 : rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 ;
    public final void rule__AdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2783:1: ( rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 )
            // InternalJqlDslParser.g:2784:2: rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalJqlDslParser.g:2791:1: rule__AdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2795:1: ( ( () ) )
            // InternalJqlDslParser.g:2796:1: ( () )
            {
            // InternalJqlDslParser.g:2796:1: ( () )
            // InternalJqlDslParser.g:2797:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalJqlDslParser.g:2798:2: ()
            // InternalJqlDslParser.g:2798:3: 
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
    // InternalJqlDslParser.g:2806:1: rule__AdditiveExpression__Group_1_0_0__1 : rule__AdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2810:1: ( rule__AdditiveExpression__Group_1_0_0__1__Impl )
            // InternalJqlDslParser.g:2811:2: rule__AdditiveExpression__Group_1_0_0__1__Impl
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
    // InternalJqlDslParser.g:2817:1: rule__AdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2821:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalJqlDslParser.g:2822:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalJqlDslParser.g:2822:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalJqlDslParser.g:2823:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalJqlDslParser.g:2824:2: ( rule__AdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalJqlDslParser.g:2824:3: rule__AdditiveExpression__OperatorAssignment_1_0_0_1
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
    // InternalJqlDslParser.g:2833:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2837:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalJqlDslParser.g:2838:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalJqlDslParser.g:2845:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2849:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDslParser.g:2850:1: ( ruleUnaryOperation )
            {
            // InternalJqlDslParser.g:2850:1: ( ruleUnaryOperation )
            // InternalJqlDslParser.g:2851:2: ruleUnaryOperation
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
    // InternalJqlDslParser.g:2860:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2864:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // InternalJqlDslParser.g:2865:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalJqlDslParser.g:2872:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2876:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:2877:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:2877:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:2878:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:2879:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ExclamationMark) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalJqlDslParser.g:2879:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalJqlDslParser.g:2887:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2891:1: ( rule__MultiplicativeExpression__Group__2__Impl )
            // InternalJqlDslParser.g:2892:2: rule__MultiplicativeExpression__Group__2__Impl
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
    // InternalJqlDslParser.g:2898:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__Group_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2902:1: ( ( ( rule__MultiplicativeExpression__Group_2__0 )* ) )
            // InternalJqlDslParser.g:2903:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            {
            // InternalJqlDslParser.g:2903:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            // InternalJqlDslParser.g:2904:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDslParser.g:2905:2: ( rule__MultiplicativeExpression__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=Div && LA23_0<=Mod)||LA23_0==Asterisk||LA23_0==Solidus) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJqlDslParser.g:2905:3: rule__MultiplicativeExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalJqlDslParser.g:2914:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2918:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalJqlDslParser.g:2919:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:2926:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( ExclamationMark ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2930:1: ( ( ( ExclamationMark ) ) )
            // InternalJqlDslParser.g:2931:1: ( ( ExclamationMark ) )
            {
            // InternalJqlDslParser.g:2931:1: ( ( ExclamationMark ) )
            // InternalJqlDslParser.g:2932:2: ( ExclamationMark )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getExclamationMarkKeyword_1_0()); 
            }
            // InternalJqlDslParser.g:2933:2: ( ExclamationMark )
            // InternalJqlDslParser.g:2933:3: ExclamationMark
            {
            match(input,ExclamationMark,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDslParser.g:2941:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2945:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:2946:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:2952:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2956:1: ( ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:2957:1: ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:2957:1: ( ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 ) )
            // InternalJqlDslParser.g:2958:2: ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionsAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:2959:2: ( rule__MultiplicativeExpression__FunctionsAssignment_1_1 )
            // InternalJqlDslParser.g:2959:3: rule__MultiplicativeExpression__FunctionsAssignment_1_1
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
    // InternalJqlDslParser.g:2968:1: rule__MultiplicativeExpression__Group_2__0 : rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2972:1: ( rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 )
            // InternalJqlDslParser.g:2973:2: rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:2980:1: rule__MultiplicativeExpression__Group_2__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2984:1: ( ( ( rule__MultiplicativeExpression__Group_2_0__0 ) ) )
            // InternalJqlDslParser.g:2985:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            {
            // InternalJqlDslParser.g:2985:1: ( ( rule__MultiplicativeExpression__Group_2_0__0 ) )
            // InternalJqlDslParser.g:2986:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0()); 
            }
            // InternalJqlDslParser.g:2987:2: ( rule__MultiplicativeExpression__Group_2_0__0 )
            // InternalJqlDslParser.g:2987:3: rule__MultiplicativeExpression__Group_2_0__0
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
    // InternalJqlDslParser.g:2995:1: rule__MultiplicativeExpression__Group_2__1 : rule__MultiplicativeExpression__Group_2__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:2999:1: ( rule__MultiplicativeExpression__Group_2__1__Impl )
            // InternalJqlDslParser.g:3000:2: rule__MultiplicativeExpression__Group_2__1__Impl
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
    // InternalJqlDslParser.g:3006:1: rule__MultiplicativeExpression__Group_2__1__Impl : ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3010:1: ( ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) ) )
            // InternalJqlDslParser.g:3011:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            {
            // InternalJqlDslParser.g:3011:1: ( ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 ) )
            // InternalJqlDslParser.g:3012:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandAssignment_2_1()); 
            }
            // InternalJqlDslParser.g:3013:2: ( rule__MultiplicativeExpression__RightOperandAssignment_2_1 )
            // InternalJqlDslParser.g:3013:3: rule__MultiplicativeExpression__RightOperandAssignment_2_1
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
    // InternalJqlDslParser.g:3022:1: rule__MultiplicativeExpression__Group_2_0__0 : rule__MultiplicativeExpression__Group_2_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3026:1: ( rule__MultiplicativeExpression__Group_2_0__0__Impl )
            // InternalJqlDslParser.g:3027:2: rule__MultiplicativeExpression__Group_2_0__0__Impl
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
    // InternalJqlDslParser.g:3033:1: rule__MultiplicativeExpression__Group_2_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3037:1: ( ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) ) )
            // InternalJqlDslParser.g:3038:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            {
            // InternalJqlDslParser.g:3038:1: ( ( rule__MultiplicativeExpression__Group_2_0_0__0 ) )
            // InternalJqlDslParser.g:3039:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_0_0()); 
            }
            // InternalJqlDslParser.g:3040:2: ( rule__MultiplicativeExpression__Group_2_0_0__0 )
            // InternalJqlDslParser.g:3040:3: rule__MultiplicativeExpression__Group_2_0_0__0
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
    // InternalJqlDslParser.g:3049:1: rule__MultiplicativeExpression__Group_2_0_0__0 : rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3053:1: ( rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1 )
            // InternalJqlDslParser.g:3054:2: rule__MultiplicativeExpression__Group_2_0_0__0__Impl rule__MultiplicativeExpression__Group_2_0_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalJqlDslParser.g:3061:1: rule__MultiplicativeExpression__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3065:1: ( ( () ) )
            // InternalJqlDslParser.g:3066:1: ( () )
            {
            // InternalJqlDslParser.g:3066:1: ( () )
            // InternalJqlDslParser.g:3067:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftOperandAction_2_0_0_0()); 
            }
            // InternalJqlDslParser.g:3068:2: ()
            // InternalJqlDslParser.g:3068:3: 
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
    // InternalJqlDslParser.g:3076:1: rule__MultiplicativeExpression__Group_2_0_0__1 : rule__MultiplicativeExpression__Group_2_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3080:1: ( rule__MultiplicativeExpression__Group_2_0_0__1__Impl )
            // InternalJqlDslParser.g:3081:2: rule__MultiplicativeExpression__Group_2_0_0__1__Impl
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
    // InternalJqlDslParser.g:3087:1: rule__MultiplicativeExpression__Group_2_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3091:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) ) )
            // InternalJqlDslParser.g:3092:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            {
            // InternalJqlDslParser.g:3092:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 ) )
            // InternalJqlDslParser.g:3093:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_2_0_0_1()); 
            }
            // InternalJqlDslParser.g:3094:2: ( rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 )
            // InternalJqlDslParser.g:3094:3: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1
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
    // InternalJqlDslParser.g:3103:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3107:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalJqlDslParser.g:3108:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalJqlDslParser.g:3115:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3119:1: ( ( () ) )
            // InternalJqlDslParser.g:3120:1: ( () )
            {
            // InternalJqlDslParser.g:3120:1: ( () )
            // InternalJqlDslParser.g:3121:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); 
            }
            // InternalJqlDslParser.g:3122:2: ()
            // InternalJqlDslParser.g:3122:3: 
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
    // InternalJqlDslParser.g:3130:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3134:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalJqlDslParser.g:3135:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:3142:1: rule__UnaryOperation__Group_0__1__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3146:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalJqlDslParser.g:3147:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalJqlDslParser.g:3147:1: ( ( rule__UnaryOperation__OperatorAssignment_0_1 ) )
            // InternalJqlDslParser.g:3148:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalJqlDslParser.g:3149:2: ( rule__UnaryOperation__OperatorAssignment_0_1 )
            // InternalJqlDslParser.g:3149:3: rule__UnaryOperation__OperatorAssignment_0_1
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
    // InternalJqlDslParser.g:3157:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3161:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalJqlDslParser.g:3162:2: rule__UnaryOperation__Group_0__2__Impl
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
    // InternalJqlDslParser.g:3168:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3172:1: ( ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalJqlDslParser.g:3173:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalJqlDslParser.g:3173:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            // InternalJqlDslParser.g:3174:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalJqlDslParser.g:3175:2: ( rule__UnaryOperation__OperandAssignment_0_2 )
            // InternalJqlDslParser.g:3175:3: rule__UnaryOperation__OperandAssignment_0_2
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
    // InternalJqlDslParser.g:3184:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3188:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // InternalJqlDslParser.g:3189:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:3196:1: rule__ParenthesizedExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3200:1: ( ( LeftParenthesis ) )
            // InternalJqlDslParser.g:3201:1: ( LeftParenthesis )
            {
            // InternalJqlDslParser.g:3201:1: ( LeftParenthesis )
            // InternalJqlDslParser.g:3202:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:3211:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3215:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // InternalJqlDslParser.g:3216:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalJqlDslParser.g:3223:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3227:1: ( ( ruleExpression ) )
            // InternalJqlDslParser.g:3228:1: ( ruleExpression )
            {
            // InternalJqlDslParser.g:3228:1: ( ruleExpression )
            // InternalJqlDslParser.g:3229:2: ruleExpression
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
    // InternalJqlDslParser.g:3238:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3242:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // InternalJqlDslParser.g:3243:2: rule__ParenthesizedExpression__Group__2__Impl
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
    // InternalJqlDslParser.g:3249:1: rule__ParenthesizedExpression__Group__2__Impl : ( RightParenthesis ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3253:1: ( ( RightParenthesis ) )
            // InternalJqlDslParser.g:3254:1: ( RightParenthesis )
            {
            // InternalJqlDslParser.g:3254:1: ( RightParenthesis )
            // InternalJqlDslParser.g:3255:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:3265:1: rule__LambdaExpression__Group__0 : rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 ;
    public final void rule__LambdaExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3269:1: ( rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1 )
            // InternalJqlDslParser.g:3270:2: rule__LambdaExpression__Group__0__Impl rule__LambdaExpression__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:3277:1: rule__LambdaExpression__Group__0__Impl : ( () ) ;
    public final void rule__LambdaExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3281:1: ( ( () ) )
            // InternalJqlDslParser.g:3282:1: ( () )
            {
            // InternalJqlDslParser.g:3282:1: ( () )
            // InternalJqlDslParser.g:3283:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getLambdaExpressionAction_0()); 
            }
            // InternalJqlDslParser.g:3284:2: ()
            // InternalJqlDslParser.g:3284:3: 
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
    // InternalJqlDslParser.g:3292:1: rule__LambdaExpression__Group__1 : rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 ;
    public final void rule__LambdaExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3296:1: ( rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2 )
            // InternalJqlDslParser.g:3297:2: rule__LambdaExpression__Group__1__Impl rule__LambdaExpression__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalJqlDslParser.g:3304:1: rule__LambdaExpression__Group__1__Impl : ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) ;
    public final void rule__LambdaExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3308:1: ( ( ( rule__LambdaExpression__ArgumentAssignment_1 ) ) )
            // InternalJqlDslParser.g:3309:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            {
            // InternalJqlDslParser.g:3309:1: ( ( rule__LambdaExpression__ArgumentAssignment_1 ) )
            // InternalJqlDslParser.g:3310:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getArgumentAssignment_1()); 
            }
            // InternalJqlDslParser.g:3311:2: ( rule__LambdaExpression__ArgumentAssignment_1 )
            // InternalJqlDslParser.g:3311:3: rule__LambdaExpression__ArgumentAssignment_1
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
    // InternalJqlDslParser.g:3319:1: rule__LambdaExpression__Group__2 : rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 ;
    public final void rule__LambdaExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3323:1: ( rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3 )
            // InternalJqlDslParser.g:3324:2: rule__LambdaExpression__Group__2__Impl rule__LambdaExpression__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:3331:1: rule__LambdaExpression__Group__2__Impl : ( VerticalLine ) ;
    public final void rule__LambdaExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3335:1: ( ( VerticalLine ) )
            // InternalJqlDslParser.g:3336:1: ( VerticalLine )
            {
            // InternalJqlDslParser.g:3336:1: ( VerticalLine )
            // InternalJqlDslParser.g:3337:2: VerticalLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getVerticalLineKeyword_2()); 
            }
            match(input,VerticalLine,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:3346:1: rule__LambdaExpression__Group__3 : rule__LambdaExpression__Group__3__Impl ;
    public final void rule__LambdaExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3350:1: ( rule__LambdaExpression__Group__3__Impl )
            // InternalJqlDslParser.g:3351:2: rule__LambdaExpression__Group__3__Impl
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
    // InternalJqlDslParser.g:3357:1: rule__LambdaExpression__Group__3__Impl : ( ( rule__LambdaExpression__StatementAssignment_3 ) ) ;
    public final void rule__LambdaExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3361:1: ( ( ( rule__LambdaExpression__StatementAssignment_3 ) ) )
            // InternalJqlDslParser.g:3362:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            {
            // InternalJqlDslParser.g:3362:1: ( ( rule__LambdaExpression__StatementAssignment_3 ) )
            // InternalJqlDslParser.g:3363:2: ( rule__LambdaExpression__StatementAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getStatementAssignment_3()); 
            }
            // InternalJqlDslParser.g:3364:2: ( rule__LambdaExpression__StatementAssignment_3 )
            // InternalJqlDslParser.g:3364:3: rule__LambdaExpression__StatementAssignment_3
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
    // InternalJqlDslParser.g:3373:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3377:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalJqlDslParser.g:3378:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:3385:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3389:1: ( ( () ) )
            // InternalJqlDslParser.g:3390:1: ( () )
            {
            // InternalJqlDslParser.g:3390:1: ( () )
            // InternalJqlDslParser.g:3391:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            }
            // InternalJqlDslParser.g:3392:2: ()
            // InternalJqlDslParser.g:3392:3: 
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
    // InternalJqlDslParser.g:3400:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3404:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalJqlDslParser.g:3405:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalJqlDslParser.g:3412:1: rule__Function__Group__1__Impl : ( ( rule__Function__FeatureAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3416:1: ( ( ( rule__Function__FeatureAssignment_1 ) ) )
            // InternalJqlDslParser.g:3417:1: ( ( rule__Function__FeatureAssignment_1 ) )
            {
            // InternalJqlDslParser.g:3417:1: ( ( rule__Function__FeatureAssignment_1 ) )
            // InternalJqlDslParser.g:3418:2: ( rule__Function__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFeatureAssignment_1()); 
            }
            // InternalJqlDslParser.g:3419:2: ( rule__Function__FeatureAssignment_1 )
            // InternalJqlDslParser.g:3419:3: rule__Function__FeatureAssignment_1
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
    // InternalJqlDslParser.g:3427:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3431:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalJqlDslParser.g:3432:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalJqlDslParser.g:3439:1: rule__Function__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3443:1: ( ( LeftParenthesis ) )
            // InternalJqlDslParser.g:3444:1: ( LeftParenthesis )
            {
            // InternalJqlDslParser.g:3444:1: ( LeftParenthesis )
            // InternalJqlDslParser.g:3445:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Function__Group__3"
    // InternalJqlDslParser.g:3454:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3458:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalJqlDslParser.g:3459:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalJqlDslParser.g:3466:1: rule__Function__Group__3__Impl : ( ( rule__Function__Alternatives_3 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3470:1: ( ( ( rule__Function__Alternatives_3 )? ) )
            // InternalJqlDslParser.g:3471:1: ( ( rule__Function__Alternatives_3 )? )
            {
            // InternalJqlDslParser.g:3471:1: ( ( rule__Function__Alternatives_3 )? )
            // InternalJqlDslParser.g:3472:2: ( rule__Function__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getAlternatives_3()); 
            }
            // InternalJqlDslParser.g:3473:2: ( rule__Function__Alternatives_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=False && LA24_0<=True)||LA24_0==Not||(LA24_0>=NumberSign && LA24_0<=LeftParenthesis)||LA24_0==HyphenMinus||(LA24_0>=RULE_DATE && LA24_0<=RULE_STRING)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJqlDslParser.g:3473:3: rule__Function__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalJqlDslParser.g:3481:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3485:1: ( rule__Function__Group__4__Impl )
            // InternalJqlDslParser.g:3486:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalJqlDslParser.g:3492:1: rule__Function__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3496:1: ( ( RightParenthesis ) )
            // InternalJqlDslParser.g:3497:1: ( RightParenthesis )
            {
            // InternalJqlDslParser.g:3497:1: ( RightParenthesis )
            // InternalJqlDslParser.g:3498:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group_3_1__0"
    // InternalJqlDslParser.g:3508:1: rule__Function__Group_3_1__0 : rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 ;
    public final void rule__Function__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3512:1: ( rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 )
            // InternalJqlDslParser.g:3513:2: rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Function__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__0"


    // $ANTLR start "rule__Function__Group_3_1__0__Impl"
    // InternalJqlDslParser.g:3520:1: rule__Function__Group_3_1__0__Impl : ( ( rule__Function__ParametersAssignment_3_1_0 ) ) ;
    public final void rule__Function__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3524:1: ( ( ( rule__Function__ParametersAssignment_3_1_0 ) ) )
            // InternalJqlDslParser.g:3525:1: ( ( rule__Function__ParametersAssignment_3_1_0 ) )
            {
            // InternalJqlDslParser.g:3525:1: ( ( rule__Function__ParametersAssignment_3_1_0 ) )
            // InternalJqlDslParser.g:3526:2: ( rule__Function__ParametersAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_0()); 
            }
            // InternalJqlDslParser.g:3527:2: ( rule__Function__ParametersAssignment_3_1_0 )
            // InternalJqlDslParser.g:3527:3: rule__Function__ParametersAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__0__Impl"


    // $ANTLR start "rule__Function__Group_3_1__1"
    // InternalJqlDslParser.g:3535:1: rule__Function__Group_3_1__1 : rule__Function__Group_3_1__1__Impl ;
    public final void rule__Function__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3539:1: ( rule__Function__Group_3_1__1__Impl )
            // InternalJqlDslParser.g:3540:2: rule__Function__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__1"


    // $ANTLR start "rule__Function__Group_3_1__1__Impl"
    // InternalJqlDslParser.g:3546:1: rule__Function__Group_3_1__1__Impl : ( ( rule__Function__Group_3_1_1__0 )* ) ;
    public final void rule__Function__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3550:1: ( ( ( rule__Function__Group_3_1_1__0 )* ) )
            // InternalJqlDslParser.g:3551:1: ( ( rule__Function__Group_3_1_1__0 )* )
            {
            // InternalJqlDslParser.g:3551:1: ( ( rule__Function__Group_3_1_1__0 )* )
            // InternalJqlDslParser.g:3552:2: ( rule__Function__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup_3_1_1()); 
            }
            // InternalJqlDslParser.g:3553:2: ( rule__Function__Group_3_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJqlDslParser.g:3553:3: rule__Function__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Function__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__1__Impl"


    // $ANTLR start "rule__Function__Group_3_1_1__0"
    // InternalJqlDslParser.g:3562:1: rule__Function__Group_3_1_1__0 : rule__Function__Group_3_1_1__0__Impl rule__Function__Group_3_1_1__1 ;
    public final void rule__Function__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3566:1: ( rule__Function__Group_3_1_1__0__Impl rule__Function__Group_3_1_1__1 )
            // InternalJqlDslParser.g:3567:2: rule__Function__Group_3_1_1__0__Impl rule__Function__Group_3_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1_1__0"


    // $ANTLR start "rule__Function__Group_3_1_1__0__Impl"
    // InternalJqlDslParser.g:3574:1: rule__Function__Group_3_1_1__0__Impl : ( Comma ) ;
    public final void rule__Function__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3578:1: ( ( Comma ) )
            // InternalJqlDslParser.g:3579:1: ( Comma )
            {
            // InternalJqlDslParser.g:3579:1: ( Comma )
            // InternalJqlDslParser.g:3580:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Function__Group_3_1_1__1"
    // InternalJqlDslParser.g:3589:1: rule__Function__Group_3_1_1__1 : rule__Function__Group_3_1_1__1__Impl ;
    public final void rule__Function__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3593:1: ( rule__Function__Group_3_1_1__1__Impl )
            // InternalJqlDslParser.g:3594:2: rule__Function__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1_1__1"


    // $ANTLR start "rule__Function__Group_3_1_1__1__Impl"
    // InternalJqlDslParser.g:3600:1: rule__Function__Group_3_1_1__1__Impl : ( ( rule__Function__ParametersAssignment_3_1_1_1 ) ) ;
    public final void rule__Function__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3604:1: ( ( ( rule__Function__ParametersAssignment_3_1_1_1 ) ) )
            // InternalJqlDslParser.g:3605:1: ( ( rule__Function__ParametersAssignment_3_1_1_1 ) )
            {
            // InternalJqlDslParser.g:3605:1: ( ( rule__Function__ParametersAssignment_3_1_1_1 ) )
            // InternalJqlDslParser.g:3606:2: ( rule__Function__ParametersAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1_1()); 
            }
            // InternalJqlDslParser.g:3607:2: ( rule__Function__ParametersAssignment_3_1_1_1 )
            // InternalJqlDslParser.g:3607:3: rule__Function__ParametersAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalJqlDslParser.g:3616:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3620:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalJqlDslParser.g:3621:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJqlDslParser.g:3628:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3632:1: ( ( () ) )
            // InternalJqlDslParser.g:3633:1: ( () )
            {
            // InternalJqlDslParser.g:3633:1: ( () )
            // InternalJqlDslParser.g:3634:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            }
            // InternalJqlDslParser.g:3635:2: ()
            // InternalJqlDslParser.g:3635:3: 
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
    // InternalJqlDslParser.g:3643:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3647:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalJqlDslParser.g:3648:2: rule__BooleanLiteral__Group__1__Impl
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
    // InternalJqlDslParser.g:3654:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3658:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalJqlDslParser.g:3659:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalJqlDslParser.g:3659:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalJqlDslParser.g:3660:2: ( rule__BooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalJqlDslParser.g:3661:2: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalJqlDslParser.g:3661:3: rule__BooleanLiteral__Alternatives_1
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
    // InternalJqlDslParser.g:3670:1: rule__NumberLiteral__Group_0__0 : rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 ;
    public final void rule__NumberLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3674:1: ( rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1 )
            // InternalJqlDslParser.g:3675:2: rule__NumberLiteral__Group_0__0__Impl rule__NumberLiteral__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalJqlDslParser.g:3682:1: rule__NumberLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3686:1: ( ( () ) )
            // InternalJqlDslParser.g:3687:1: ( () )
            {
            // InternalJqlDslParser.g:3687:1: ( () )
            // InternalJqlDslParser.g:3688:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getIntegerLiteralAction_0_0()); 
            }
            // InternalJqlDslParser.g:3689:2: ()
            // InternalJqlDslParser.g:3689:3: 
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
    // InternalJqlDslParser.g:3697:1: rule__NumberLiteral__Group_0__1 : rule__NumberLiteral__Group_0__1__Impl ;
    public final void rule__NumberLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3701:1: ( rule__NumberLiteral__Group_0__1__Impl )
            // InternalJqlDslParser.g:3702:2: rule__NumberLiteral__Group_0__1__Impl
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
    // InternalJqlDslParser.g:3708:1: rule__NumberLiteral__Group_0__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__NumberLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3712:1: ( ( ( rule__NumberLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDslParser.g:3713:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDslParser.g:3713:1: ( ( rule__NumberLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDslParser.g:3714:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDslParser.g:3715:2: ( rule__NumberLiteral__ValueAssignment_0_1 )
            // InternalJqlDslParser.g:3715:3: rule__NumberLiteral__ValueAssignment_0_1
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
    // InternalJqlDslParser.g:3724:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3728:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalJqlDslParser.g:3729:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalJqlDslParser.g:3736:1: rule__NumberLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3740:1: ( ( () ) )
            // InternalJqlDslParser.g:3741:1: ( () )
            {
            // InternalJqlDslParser.g:3741:1: ( () )
            // InternalJqlDslParser.g:3742:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getDecimalLiteralAction_1_0()); 
            }
            // InternalJqlDslParser.g:3743:2: ()
            // InternalJqlDslParser.g:3743:3: 
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
    // InternalJqlDslParser.g:3751:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3755:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalJqlDslParser.g:3756:2: rule__NumberLiteral__Group_1__1__Impl
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
    // InternalJqlDslParser.g:3762:1: rule__NumberLiteral__Group_1__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3766:1: ( ( ( rule__NumberLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:3767:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:3767:1: ( ( rule__NumberLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDslParser.g:3768:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:3769:2: ( rule__NumberLiteral__ValueAssignment_1_1 )
            // InternalJqlDslParser.g:3769:3: rule__NumberLiteral__ValueAssignment_1_1
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
    // InternalJqlDslParser.g:3778:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3782:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // InternalJqlDslParser.g:3783:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalJqlDslParser.g:3790:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3794:1: ( ( () ) )
            // InternalJqlDslParser.g:3795:1: ( () )
            {
            // InternalJqlDslParser.g:3795:1: ( () )
            // InternalJqlDslParser.g:3796:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            }
            // InternalJqlDslParser.g:3797:2: ()
            // InternalJqlDslParser.g:3797:3: 
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
    // InternalJqlDslParser.g:3805:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3809:1: ( rule__StringLiteral__Group__1__Impl )
            // InternalJqlDslParser.g:3810:2: rule__StringLiteral__Group__1__Impl
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
    // InternalJqlDslParser.g:3816:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3820:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDslParser.g:3821:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDslParser.g:3821:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // InternalJqlDslParser.g:3822:2: ( rule__StringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDslParser.g:3823:2: ( rule__StringLiteral__ValueAssignment_1 )
            // InternalJqlDslParser.g:3823:3: rule__StringLiteral__ValueAssignment_1
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
    // InternalJqlDslParser.g:3832:1: rule__TemporalLiteral__Group_0__0 : rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 ;
    public final void rule__TemporalLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3836:1: ( rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1 )
            // InternalJqlDslParser.g:3837:2: rule__TemporalLiteral__Group_0__0__Impl rule__TemporalLiteral__Group_0__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalJqlDslParser.g:3844:1: rule__TemporalLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3848:1: ( ( () ) )
            // InternalJqlDslParser.g:3849:1: ( () )
            {
            // InternalJqlDslParser.g:3849:1: ( () )
            // InternalJqlDslParser.g:3850:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getDateLiteralAction_0_0()); 
            }
            // InternalJqlDslParser.g:3851:2: ()
            // InternalJqlDslParser.g:3851:3: 
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
    // InternalJqlDslParser.g:3859:1: rule__TemporalLiteral__Group_0__1 : rule__TemporalLiteral__Group_0__1__Impl ;
    public final void rule__TemporalLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3863:1: ( rule__TemporalLiteral__Group_0__1__Impl )
            // InternalJqlDslParser.g:3864:2: rule__TemporalLiteral__Group_0__1__Impl
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
    // InternalJqlDslParser.g:3870:1: rule__TemporalLiteral__Group_0__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__TemporalLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3874:1: ( ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) ) )
            // InternalJqlDslParser.g:3875:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            {
            // InternalJqlDslParser.g:3875:1: ( ( rule__TemporalLiteral__ValueAssignment_0_1 ) )
            // InternalJqlDslParser.g:3876:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalJqlDslParser.g:3877:2: ( rule__TemporalLiteral__ValueAssignment_0_1 )
            // InternalJqlDslParser.g:3877:3: rule__TemporalLiteral__ValueAssignment_0_1
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
    // InternalJqlDslParser.g:3886:1: rule__TemporalLiteral__Group_1__0 : rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 ;
    public final void rule__TemporalLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3890:1: ( rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1 )
            // InternalJqlDslParser.g:3891:2: rule__TemporalLiteral__Group_1__0__Impl rule__TemporalLiteral__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalJqlDslParser.g:3898:1: rule__TemporalLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__TemporalLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3902:1: ( ( () ) )
            // InternalJqlDslParser.g:3903:1: ( () )
            {
            // InternalJqlDslParser.g:3903:1: ( () )
            // InternalJqlDslParser.g:3904:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getTimeStampLiteralAction_1_0()); 
            }
            // InternalJqlDslParser.g:3905:2: ()
            // InternalJqlDslParser.g:3905:3: 
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
    // InternalJqlDslParser.g:3913:1: rule__TemporalLiteral__Group_1__1 : rule__TemporalLiteral__Group_1__1__Impl ;
    public final void rule__TemporalLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3917:1: ( rule__TemporalLiteral__Group_1__1__Impl )
            // InternalJqlDslParser.g:3918:2: rule__TemporalLiteral__Group_1__1__Impl
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
    // InternalJqlDslParser.g:3924:1: rule__TemporalLiteral__Group_1__1__Impl : ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) ;
    public final void rule__TemporalLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3928:1: ( ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:3929:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:3929:1: ( ( rule__TemporalLiteral__ValueAssignment_1_1 ) )
            // InternalJqlDslParser.g:3930:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:3931:2: ( rule__TemporalLiteral__ValueAssignment_1_1 )
            // InternalJqlDslParser.g:3931:3: rule__TemporalLiteral__ValueAssignment_1_1
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
    // InternalJqlDslParser.g:3940:1: rule__MeasuredLiteral__Group__0 : rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 ;
    public final void rule__MeasuredLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3944:1: ( rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1 )
            // InternalJqlDslParser.g:3945:2: rule__MeasuredLiteral__Group__0__Impl rule__MeasuredLiteral__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalJqlDslParser.g:3952:1: rule__MeasuredLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MeasuredLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3956:1: ( ( () ) )
            // InternalJqlDslParser.g:3957:1: ( () )
            {
            // InternalJqlDslParser.g:3957:1: ( () )
            // InternalJqlDslParser.g:3958:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasuredLiteralAction_0()); 
            }
            // InternalJqlDslParser.g:3959:2: ()
            // InternalJqlDslParser.g:3959:3: 
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
    // InternalJqlDslParser.g:3967:1: rule__MeasuredLiteral__Group__1 : rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 ;
    public final void rule__MeasuredLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3971:1: ( rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2 )
            // InternalJqlDslParser.g:3972:2: rule__MeasuredLiteral__Group__1__Impl rule__MeasuredLiteral__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalJqlDslParser.g:3979:1: rule__MeasuredLiteral__Group__1__Impl : ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MeasuredLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3983:1: ( ( ( rule__MeasuredLiteral__ValueAssignment_1 ) ) )
            // InternalJqlDslParser.g:3984:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            {
            // InternalJqlDslParser.g:3984:1: ( ( rule__MeasuredLiteral__ValueAssignment_1 ) )
            // InternalJqlDslParser.g:3985:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getValueAssignment_1()); 
            }
            // InternalJqlDslParser.g:3986:2: ( rule__MeasuredLiteral__ValueAssignment_1 )
            // InternalJqlDslParser.g:3986:3: rule__MeasuredLiteral__ValueAssignment_1
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
    // InternalJqlDslParser.g:3994:1: rule__MeasuredLiteral__Group__2 : rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 ;
    public final void rule__MeasuredLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:3998:1: ( rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3 )
            // InternalJqlDslParser.g:3999:2: rule__MeasuredLiteral__Group__2__Impl rule__MeasuredLiteral__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:4006:1: rule__MeasuredLiteral__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__MeasuredLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4010:1: ( ( LeftSquareBracket ) )
            // InternalJqlDslParser.g:4011:1: ( LeftSquareBracket )
            {
            // InternalJqlDslParser.g:4011:1: ( LeftSquareBracket )
            // InternalJqlDslParser.g:4012:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:4021:1: rule__MeasuredLiteral__Group__3 : rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 ;
    public final void rule__MeasuredLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4025:1: ( rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4 )
            // InternalJqlDslParser.g:4026:2: rule__MeasuredLiteral__Group__3__Impl rule__MeasuredLiteral__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:4033:1: rule__MeasuredLiteral__Group__3__Impl : ( ( rule__MeasuredLiteral__Group_3__0 )? ) ;
    public final void rule__MeasuredLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4037:1: ( ( ( rule__MeasuredLiteral__Group_3__0 )? ) )
            // InternalJqlDslParser.g:4038:1: ( ( rule__MeasuredLiteral__Group_3__0 )? )
            {
            // InternalJqlDslParser.g:4038:1: ( ( rule__MeasuredLiteral__Group_3__0 )? )
            // InternalJqlDslParser.g:4039:2: ( rule__MeasuredLiteral__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getGroup_3()); 
            }
            // InternalJqlDslParser.g:4040:2: ( rule__MeasuredLiteral__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==ColonColon) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalJqlDslParser.g:4040:3: rule__MeasuredLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasuredLiteral__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // InternalJqlDslParser.g:4048:1: rule__MeasuredLiteral__Group__4 : rule__MeasuredLiteral__Group__4__Impl rule__MeasuredLiteral__Group__5 ;
    public final void rule__MeasuredLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4052:1: ( rule__MeasuredLiteral__Group__4__Impl rule__MeasuredLiteral__Group__5 )
            // InternalJqlDslParser.g:4053:2: rule__MeasuredLiteral__Group__4__Impl rule__MeasuredLiteral__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__MeasuredLiteral__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalJqlDslParser.g:4060:1: rule__MeasuredLiteral__Group__4__Impl : ( ( rule__MeasuredLiteral__MeasureAssignment_4 ) ) ;
    public final void rule__MeasuredLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4064:1: ( ( ( rule__MeasuredLiteral__MeasureAssignment_4 ) ) )
            // InternalJqlDslParser.g:4065:1: ( ( rule__MeasuredLiteral__MeasureAssignment_4 ) )
            {
            // InternalJqlDslParser.g:4065:1: ( ( rule__MeasuredLiteral__MeasureAssignment_4 ) )
            // InternalJqlDslParser.g:4066:2: ( rule__MeasuredLiteral__MeasureAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasureAssignment_4()); 
            }
            // InternalJqlDslParser.g:4067:2: ( rule__MeasuredLiteral__MeasureAssignment_4 )
            // InternalJqlDslParser.g:4067:3: rule__MeasuredLiteral__MeasureAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__MeasureAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getMeasureAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MeasuredLiteral__Group__5"
    // InternalJqlDslParser.g:4075:1: rule__MeasuredLiteral__Group__5 : rule__MeasuredLiteral__Group__5__Impl ;
    public final void rule__MeasuredLiteral__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4079:1: ( rule__MeasuredLiteral__Group__5__Impl )
            // InternalJqlDslParser.g:4080:2: rule__MeasuredLiteral__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group__5"


    // $ANTLR start "rule__MeasuredLiteral__Group__5__Impl"
    // InternalJqlDslParser.g:4086:1: rule__MeasuredLiteral__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__MeasuredLiteral__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4090:1: ( ( RightSquareBracket ) )
            // InternalJqlDslParser.g:4091:1: ( RightSquareBracket )
            {
            // InternalJqlDslParser.g:4091:1: ( RightSquareBracket )
            // InternalJqlDslParser.g:4092:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group__5__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group_3__0"
    // InternalJqlDslParser.g:4102:1: rule__MeasuredLiteral__Group_3__0 : rule__MeasuredLiteral__Group_3__0__Impl rule__MeasuredLiteral__Group_3__1 ;
    public final void rule__MeasuredLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4106:1: ( rule__MeasuredLiteral__Group_3__0__Impl rule__MeasuredLiteral__Group_3__1 )
            // InternalJqlDslParser.g:4107:2: rule__MeasuredLiteral__Group_3__0__Impl rule__MeasuredLiteral__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__MeasuredLiteral__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group_3__0"


    // $ANTLR start "rule__MeasuredLiteral__Group_3__0__Impl"
    // InternalJqlDslParser.g:4114:1: rule__MeasuredLiteral__Group_3__0__Impl : ( ( rule__MeasuredLiteral__TypeAssignment_3_0 ) ) ;
    public final void rule__MeasuredLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4118:1: ( ( ( rule__MeasuredLiteral__TypeAssignment_3_0 ) ) )
            // InternalJqlDslParser.g:4119:1: ( ( rule__MeasuredLiteral__TypeAssignment_3_0 ) )
            {
            // InternalJqlDslParser.g:4119:1: ( ( rule__MeasuredLiteral__TypeAssignment_3_0 ) )
            // InternalJqlDslParser.g:4120:2: ( rule__MeasuredLiteral__TypeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getTypeAssignment_3_0()); 
            }
            // InternalJqlDslParser.g:4121:2: ( rule__MeasuredLiteral__TypeAssignment_3_0 )
            // InternalJqlDslParser.g:4121:3: rule__MeasuredLiteral__TypeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__TypeAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getTypeAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group_3__0__Impl"


    // $ANTLR start "rule__MeasuredLiteral__Group_3__1"
    // InternalJqlDslParser.g:4129:1: rule__MeasuredLiteral__Group_3__1 : rule__MeasuredLiteral__Group_3__1__Impl ;
    public final void rule__MeasuredLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4133:1: ( rule__MeasuredLiteral__Group_3__1__Impl )
            // InternalJqlDslParser.g:4134:2: rule__MeasuredLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredLiteral__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group_3__1"


    // $ANTLR start "rule__MeasuredLiteral__Group_3__1__Impl"
    // InternalJqlDslParser.g:4140:1: rule__MeasuredLiteral__Group_3__1__Impl : ( NumberSign ) ;
    public final void rule__MeasuredLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4144:1: ( ( NumberSign ) )
            // InternalJqlDslParser.g:4145:1: ( NumberSign )
            {
            // InternalJqlDslParser.g:4145:1: ( NumberSign )
            // InternalJqlDslParser.g:4146:2: NumberSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getNumberSignKeyword_3_1()); 
            }
            match(input,NumberSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getNumberSignKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__Group_3__1__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__0"
    // InternalJqlDslParser.g:4156:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4160:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalJqlDslParser.g:4161:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
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
    // InternalJqlDslParser.g:4168:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4172:1: ( ( () ) )
            // InternalJqlDslParser.g:4173:1: ( () )
            {
            // InternalJqlDslParser.g:4173:1: ( () )
            // InternalJqlDslParser.g:4174:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }
            // InternalJqlDslParser.g:4175:2: ()
            // InternalJqlDslParser.g:4175:3: 
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
    // InternalJqlDslParser.g:4183:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4187:1: ( rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2 )
            // InternalJqlDslParser.g:4188:2: rule__EnumLiteral__Group__1__Impl rule__EnumLiteral__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalJqlDslParser.g:4195:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__TypeAssignment_1 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4199:1: ( ( ( rule__EnumLiteral__TypeAssignment_1 )? ) )
            // InternalJqlDslParser.g:4200:1: ( ( rule__EnumLiteral__TypeAssignment_1 )? )
            {
            // InternalJqlDslParser.g:4200:1: ( ( rule__EnumLiteral__TypeAssignment_1 )? )
            // InternalJqlDslParser.g:4201:2: ( rule__EnumLiteral__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getTypeAssignment_1()); 
            }
            // InternalJqlDslParser.g:4202:2: ( rule__EnumLiteral__TypeAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJqlDslParser.g:4202:3: rule__EnumLiteral__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumLiteral__TypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
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
    // InternalJqlDslParser.g:4210:1: rule__EnumLiteral__Group__2 : rule__EnumLiteral__Group__2__Impl rule__EnumLiteral__Group__3 ;
    public final void rule__EnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4214:1: ( rule__EnumLiteral__Group__2__Impl rule__EnumLiteral__Group__3 )
            // InternalJqlDslParser.g:4215:2: rule__EnumLiteral__Group__2__Impl rule__EnumLiteral__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__EnumLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalJqlDslParser.g:4222:1: rule__EnumLiteral__Group__2__Impl : ( NumberSign ) ;
    public final void rule__EnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4226:1: ( ( NumberSign ) )
            // InternalJqlDslParser.g:4227:1: ( NumberSign )
            {
            // InternalJqlDslParser.g:4227:1: ( NumberSign )
            // InternalJqlDslParser.g:4228:2: NumberSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getNumberSignKeyword_2()); 
            }
            match(input,NumberSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getNumberSignKeyword_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EnumLiteral__Group__3"
    // InternalJqlDslParser.g:4237:1: rule__EnumLiteral__Group__3 : rule__EnumLiteral__Group__3__Impl ;
    public final void rule__EnumLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4241:1: ( rule__EnumLiteral__Group__3__Impl )
            // InternalJqlDslParser.g:4242:2: rule__EnumLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__3"


    // $ANTLR start "rule__EnumLiteral__Group__3__Impl"
    // InternalJqlDslParser.g:4248:1: rule__EnumLiteral__Group__3__Impl : ( ( rule__EnumLiteral__ValueAssignment_3 ) ) ;
    public final void rule__EnumLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4252:1: ( ( ( rule__EnumLiteral__ValueAssignment_3 ) ) )
            // InternalJqlDslParser.g:4253:1: ( ( rule__EnumLiteral__ValueAssignment_3 ) )
            {
            // InternalJqlDslParser.g:4253:1: ( ( rule__EnumLiteral__ValueAssignment_3 ) )
            // InternalJqlDslParser.g:4254:2: ( rule__EnumLiteral__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getValueAssignment_3()); 
            }
            // InternalJqlDslParser.g:4255:2: ( rule__EnumLiteral__ValueAssignment_3 )
            // InternalJqlDslParser.g:4255:3: rule__EnumLiteral__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__3__Impl"


    // $ANTLR start "rule__NavigationExpression__Group__0"
    // InternalJqlDslParser.g:4264:1: rule__NavigationExpression__Group__0 : rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4268:1: ( rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1 )
            // InternalJqlDslParser.g:4269:2: rule__NavigationExpression__Group__0__Impl rule__NavigationExpression__Group__1
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
    // InternalJqlDslParser.g:4276:1: rule__NavigationExpression__Group__0__Impl : ( ( rule__NavigationExpression__BaseAssignment_0 ) ) ;
    public final void rule__NavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4280:1: ( ( ( rule__NavigationExpression__BaseAssignment_0 ) ) )
            // InternalJqlDslParser.g:4281:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            {
            // InternalJqlDslParser.g:4281:1: ( ( rule__NavigationExpression__BaseAssignment_0 ) )
            // InternalJqlDslParser.g:4282:2: ( rule__NavigationExpression__BaseAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getBaseAssignment_0()); 
            }
            // InternalJqlDslParser.g:4283:2: ( rule__NavigationExpression__BaseAssignment_0 )
            // InternalJqlDslParser.g:4283:3: rule__NavigationExpression__BaseAssignment_0
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
    // InternalJqlDslParser.g:4291:1: rule__NavigationExpression__Group__1 : rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4295:1: ( rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2 )
            // InternalJqlDslParser.g:4296:2: rule__NavigationExpression__Group__1__Impl rule__NavigationExpression__Group__2
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
    // InternalJqlDslParser.g:4303:1: rule__NavigationExpression__Group__1__Impl : ( ( rule__NavigationExpression__Group_1__0 )* ) ;
    public final void rule__NavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4307:1: ( ( ( rule__NavigationExpression__Group_1__0 )* ) )
            // InternalJqlDslParser.g:4308:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:4308:1: ( ( rule__NavigationExpression__Group_1__0 )* )
            // InternalJqlDslParser.g:4309:2: ( rule__NavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:4310:2: ( rule__NavigationExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==FullStop) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalJqlDslParser.g:4310:3: rule__NavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__NavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalJqlDslParser.g:4318:1: rule__NavigationExpression__Group__2 : rule__NavigationExpression__Group__2__Impl ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4322:1: ( rule__NavigationExpression__Group__2__Impl )
            // InternalJqlDslParser.g:4323:2: rule__NavigationExpression__Group__2__Impl
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
    // InternalJqlDslParser.g:4329:1: rule__NavigationExpression__Group__2__Impl : ( ( rule__NavigationExpression__Group_2__0 )? ) ;
    public final void rule__NavigationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4333:1: ( ( ( rule__NavigationExpression__Group_2__0 )? ) )
            // InternalJqlDslParser.g:4334:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            {
            // InternalJqlDslParser.g:4334:1: ( ( rule__NavigationExpression__Group_2__0 )? )
            // InternalJqlDslParser.g:4335:2: ( rule__NavigationExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getGroup_2()); 
            }
            // InternalJqlDslParser.g:4336:2: ( rule__NavigationExpression__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CommercialAt) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJqlDslParser.g:4336:3: rule__NavigationExpression__Group_2__0
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
    // InternalJqlDslParser.g:4345:1: rule__NavigationExpression__Group_1__0 : rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 ;
    public final void rule__NavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4349:1: ( rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1 )
            // InternalJqlDslParser.g:4350:2: rule__NavigationExpression__Group_1__0__Impl rule__NavigationExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:4357:1: rule__NavigationExpression__Group_1__0__Impl : ( ( FullStop ) ) ;
    public final void rule__NavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4361:1: ( ( ( FullStop ) ) )
            // InternalJqlDslParser.g:4362:1: ( ( FullStop ) )
            {
            // InternalJqlDslParser.g:4362:1: ( ( FullStop ) )
            // InternalJqlDslParser.g:4363:2: ( FullStop )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFullStopKeyword_1_0()); 
            }
            // InternalJqlDslParser.g:4364:2: ( FullStop )
            // InternalJqlDslParser.g:4364:3: FullStop
            {
            match(input,FullStop,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDslParser.g:4372:1: rule__NavigationExpression__Group_1__1 : rule__NavigationExpression__Group_1__1__Impl ;
    public final void rule__NavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4376:1: ( rule__NavigationExpression__Group_1__1__Impl )
            // InternalJqlDslParser.g:4377:2: rule__NavigationExpression__Group_1__1__Impl
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
    // InternalJqlDslParser.g:4383:1: rule__NavigationExpression__Group_1__1__Impl : ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) ;
    public final void rule__NavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4387:1: ( ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) ) )
            // InternalJqlDslParser.g:4388:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            {
            // InternalJqlDslParser.g:4388:1: ( ( rule__NavigationExpression__FeaturesAssignment_1_1 ) )
            // InternalJqlDslParser.g:4389:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getFeaturesAssignment_1_1()); 
            }
            // InternalJqlDslParser.g:4390:2: ( rule__NavigationExpression__FeaturesAssignment_1_1 )
            // InternalJqlDslParser.g:4390:3: rule__NavigationExpression__FeaturesAssignment_1_1
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
    // InternalJqlDslParser.g:4399:1: rule__NavigationExpression__Group_2__0 : rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 ;
    public final void rule__NavigationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4403:1: ( rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1 )
            // InternalJqlDslParser.g:4404:2: rule__NavigationExpression__Group_2__0__Impl rule__NavigationExpression__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:4411:1: rule__NavigationExpression__Group_2__0__Impl : ( CommercialAt ) ;
    public final void rule__NavigationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4415:1: ( ( CommercialAt ) )
            // InternalJqlDslParser.g:4416:1: ( CommercialAt )
            {
            // InternalJqlDslParser.g:4416:1: ( CommercialAt )
            // InternalJqlDslParser.g:4417:2: CommercialAt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,CommercialAt,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:4426:1: rule__NavigationExpression__Group_2__1 : rule__NavigationExpression__Group_2__1__Impl ;
    public final void rule__NavigationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4430:1: ( rule__NavigationExpression__Group_2__1__Impl )
            // InternalJqlDslParser.g:4431:2: rule__NavigationExpression__Group_2__1__Impl
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
    // InternalJqlDslParser.g:4437:1: rule__NavigationExpression__Group_2__1__Impl : ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) ;
    public final void rule__NavigationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4441:1: ( ( ( rule__NavigationExpression__CastAssignment_2_1 ) ) )
            // InternalJqlDslParser.g:4442:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            {
            // InternalJqlDslParser.g:4442:1: ( ( rule__NavigationExpression__CastAssignment_2_1 ) )
            // InternalJqlDslParser.g:4443:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationExpressionAccess().getCastAssignment_2_1()); 
            }
            // InternalJqlDslParser.g:4444:2: ( rule__NavigationExpression__CastAssignment_2_1 )
            // InternalJqlDslParser.g:4444:3: rule__NavigationExpression__CastAssignment_2_1
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
    // InternalJqlDslParser.g:4453:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4457:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalJqlDslParser.g:4458:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalJqlDslParser.g:4465:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4469:1: ( ( RULE_ID ) )
            // InternalJqlDslParser.g:4470:1: ( RULE_ID )
            {
            // InternalJqlDslParser.g:4470:1: ( RULE_ID )
            // InternalJqlDslParser.g:4471:2: RULE_ID
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
    // InternalJqlDslParser.g:4480:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4484:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalJqlDslParser.g:4485:2: rule__QualifiedName__Group__1__Impl
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
    // InternalJqlDslParser.g:4491:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4495:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalJqlDslParser.g:4496:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalJqlDslParser.g:4496:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalJqlDslParser.g:4497:2: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalJqlDslParser.g:4497:2: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalJqlDslParser.g:4498:3: ( rule__QualifiedName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:4499:3: ( rule__QualifiedName__Group_1__0 )
            // InternalJqlDslParser.g:4499:4: rule__QualifiedName__Group_1__0
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

            // InternalJqlDslParser.g:4502:2: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalJqlDslParser.g:4503:3: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalJqlDslParser.g:4504:3: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ColonColon) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalJqlDslParser.g:4504:4: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalJqlDslParser.g:4514:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4518:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalJqlDslParser.g:4519:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJqlDslParser.g:4526:1: rule__QualifiedName__Group_1__0__Impl : ( ( ColonColon ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4530:1: ( ( ( ColonColon ) ) )
            // InternalJqlDslParser.g:4531:1: ( ( ColonColon ) )
            {
            // InternalJqlDslParser.g:4531:1: ( ( ColonColon ) )
            // InternalJqlDslParser.g:4532:2: ( ColonColon )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            // InternalJqlDslParser.g:4533:2: ( ColonColon )
            // InternalJqlDslParser.g:4533:3: ColonColon
            {
            match(input,ColonColon,FOLLOW_2); if (state.failed) return ;

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
    // InternalJqlDslParser.g:4541:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4545:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalJqlDslParser.g:4546:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalJqlDslParser.g:4552:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4556:1: ( ( RULE_ID ) )
            // InternalJqlDslParser.g:4557:1: ( RULE_ID )
            {
            // InternalJqlDslParser.g:4557:1: ( RULE_ID )
            // InternalJqlDslParser.g:4558:2: RULE_ID
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


    // $ANTLR start "rule__SwitchExpression__ThenExpressionAssignment_1_1"
    // InternalJqlDslParser.g:4568:1: rule__SwitchExpression__ThenExpressionAssignment_1_1 : ( ruleSwitchExpression ) ;
    public final void rule__SwitchExpression__ThenExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4572:1: ( ( ruleSwitchExpression ) )
            // InternalJqlDslParser.g:4573:2: ( ruleSwitchExpression )
            {
            // InternalJqlDslParser.g:4573:2: ( ruleSwitchExpression )
            // InternalJqlDslParser.g:4574:3: ruleSwitchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getThenExpressionSwitchExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getThenExpressionSwitchExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__ThenExpressionAssignment_1_1"


    // $ANTLR start "rule__SwitchExpression__ElseExpressionAssignment_1_3"
    // InternalJqlDslParser.g:4583:1: rule__SwitchExpression__ElseExpressionAssignment_1_3 : ( ruleSwitchExpression ) ;
    public final void rule__SwitchExpression__ElseExpressionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4587:1: ( ( ruleSwitchExpression ) )
            // InternalJqlDslParser.g:4588:2: ( ruleSwitchExpression )
            {
            // InternalJqlDslParser.g:4588:2: ( ruleSwitchExpression )
            // InternalJqlDslParser.g:4589:3: ruleSwitchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getElseExpressionSwitchExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getElseExpressionSwitchExpressionParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__ElseExpressionAssignment_1_3"


    // $ANTLR start "rule__ImpliesExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDslParser.g:4598:1: rule__ImpliesExpression__OperatorAssignment_1_0_0_1 : ( ( Implies ) ) ;
    public final void rule__ImpliesExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4602:1: ( ( ( Implies ) ) )
            // InternalJqlDslParser.g:4603:2: ( ( Implies ) )
            {
            // InternalJqlDslParser.g:4603:2: ( ( Implies ) )
            // InternalJqlDslParser.g:4604:3: ( Implies )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesKeyword_1_0_0_1_0()); 
            }
            // InternalJqlDslParser.g:4605:3: ( Implies )
            // InternalJqlDslParser.g:4606:4: Implies
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesKeyword_1_0_0_1_0()); 
            }
            match(input,Implies,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesKeyword_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__ImpliesExpression__RightOperandAssignment_1_1"
    // InternalJqlDslParser.g:4617:1: rule__ImpliesExpression__RightOperandAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__ImpliesExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4621:1: ( ( ruleOrExpression ) )
            // InternalJqlDslParser.g:4622:2: ( ruleOrExpression )
            {
            // InternalJqlDslParser.g:4622:2: ( ruleOrExpression )
            // InternalJqlDslParser.g:4623:3: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExpressionAccess().getRightOperandOrExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExpressionAccess().getRightOperandOrExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDslParser.g:4632:1: rule__OrExpression__OperatorAssignment_1_0_0_1 : ( ( Or ) ) ;
    public final void rule__OrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4636:1: ( ( ( Or ) ) )
            // InternalJqlDslParser.g:4637:2: ( ( Or ) )
            {
            // InternalJqlDslParser.g:4637:2: ( ( Or ) )
            // InternalJqlDslParser.g:4638:3: ( Or )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrKeyword_1_0_0_1_0()); 
            }
            // InternalJqlDslParser.g:4639:3: ( Or )
            // InternalJqlDslParser.g:4640:4: Or
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrKeyword_1_0_0_1_0()); 
            }
            match(input,Or,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorOrKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorOrKeyword_1_0_0_1_0()); 
            }

            }


            }

        }
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
    // InternalJqlDslParser.g:4651:1: rule__OrExpression__RightOperandAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4655:1: ( ( ruleXorExpression ) )
            // InternalJqlDslParser.g:4656:2: ( ruleXorExpression )
            {
            // InternalJqlDslParser.g:4656:2: ( ruleXorExpression )
            // InternalJqlDslParser.g:4657:3: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOperandXorExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightOperandXorExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XorExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDslParser.g:4666:1: rule__XorExpression__OperatorAssignment_1_0_0_1 : ( ( Xor ) ) ;
    public final void rule__XorExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4670:1: ( ( ( Xor ) ) )
            // InternalJqlDslParser.g:4671:2: ( ( Xor ) )
            {
            // InternalJqlDslParser.g:4671:2: ( ( Xor ) )
            // InternalJqlDslParser.g:4672:3: ( Xor )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorXorKeyword_1_0_0_1_0()); 
            }
            // InternalJqlDslParser.g:4673:3: ( Xor )
            // InternalJqlDslParser.g:4674:4: Xor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOperatorXorKeyword_1_0_0_1_0()); 
            }
            match(input,Xor,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorXorKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOperatorXorKeyword_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__XorExpression__RightOperandAssignment_1_1"
    // InternalJqlDslParser.g:4685:1: rule__XorExpression__RightOperandAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4689:1: ( ( ruleAndExpression ) )
            // InternalJqlDslParser.g:4690:2: ( ruleAndExpression )
            {
            // InternalJqlDslParser.g:4690:2: ( ruleAndExpression )
            // InternalJqlDslParser.g:4691:3: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_0_0_1"
    // InternalJqlDslParser.g:4700:1: rule__AndExpression__OperatorAssignment_1_0_0_1 : ( ( And ) ) ;
    public final void rule__AndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4704:1: ( ( ( And ) ) )
            // InternalJqlDslParser.g:4705:2: ( ( And ) )
            {
            // InternalJqlDslParser.g:4705:2: ( ( And ) )
            // InternalJqlDslParser.g:4706:3: ( And )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndKeyword_1_0_0_1_0()); 
            }
            // InternalJqlDslParser.g:4707:3: ( And )
            // InternalJqlDslParser.g:4708:4: And
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndKeyword_1_0_0_1_0()); 
            }
            match(input,And,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAndKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAndKeyword_1_0_0_1_0()); 
            }

            }


            }

        }
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
    // InternalJqlDslParser.g:4719:1: rule__AndExpression__RightOperandAssignment_1_1 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4723:1: ( ( ruleEqualityExpression ) )
            // InternalJqlDslParser.g:4724:2: ( ruleEqualityExpression )
            {
            // InternalJqlDslParser.g:4724:2: ( ruleEqualityExpression )
            // InternalJqlDslParser.g:4725:3: ruleEqualityExpression
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
    // InternalJqlDslParser.g:4734:1: rule__EqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4738:1: ( ( ruleOpEquality ) )
            // InternalJqlDslParser.g:4739:2: ( ruleOpEquality )
            {
            // InternalJqlDslParser.g:4739:2: ( ruleOpEquality )
            // InternalJqlDslParser.g:4740:3: ruleOpEquality
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
    // InternalJqlDslParser.g:4749:1: rule__EqualityExpression__RightOperandAssignment_1_1 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4753:1: ( ( ruleRelationalExpression ) )
            // InternalJqlDslParser.g:4754:2: ( ruleRelationalExpression )
            {
            // InternalJqlDslParser.g:4754:2: ( ruleRelationalExpression )
            // InternalJqlDslParser.g:4755:3: ruleRelationalExpression
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
    // InternalJqlDslParser.g:4764:1: rule__RelationalExpression__OperatorAssignment_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4768:1: ( ( ruleOpCompare ) )
            // InternalJqlDslParser.g:4769:2: ( ruleOpCompare )
            {
            // InternalJqlDslParser.g:4769:2: ( ruleOpCompare )
            // InternalJqlDslParser.g:4770:3: ruleOpCompare
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
    // InternalJqlDslParser.g:4779:1: rule__RelationalExpression__RightOperandAssignment_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4783:1: ( ( ruleAdditiveExpression ) )
            // InternalJqlDslParser.g:4784:2: ( ruleAdditiveExpression )
            {
            // InternalJqlDslParser.g:4784:2: ( ruleAdditiveExpression )
            // InternalJqlDslParser.g:4785:3: ruleAdditiveExpression
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
    // InternalJqlDslParser.g:4794:1: rule__AdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4798:1: ( ( ruleOpAdd ) )
            // InternalJqlDslParser.g:4799:2: ( ruleOpAdd )
            {
            // InternalJqlDslParser.g:4799:2: ( ruleOpAdd )
            // InternalJqlDslParser.g:4800:3: ruleOpAdd
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
    // InternalJqlDslParser.g:4809:1: rule__AdditiveExpression__RightOperandAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4813:1: ( ( ruleMultiplicativeExpression ) )
            // InternalJqlDslParser.g:4814:2: ( ruleMultiplicativeExpression )
            {
            // InternalJqlDslParser.g:4814:2: ( ruleMultiplicativeExpression )
            // InternalJqlDslParser.g:4815:3: ruleMultiplicativeExpression
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
    // InternalJqlDslParser.g:4824:1: rule__MultiplicativeExpression__FunctionsAssignment_1_1 : ( ruleFunction ) ;
    public final void rule__MultiplicativeExpression__FunctionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4828:1: ( ( ruleFunction ) )
            // InternalJqlDslParser.g:4829:2: ( ruleFunction )
            {
            // InternalJqlDslParser.g:4829:2: ( ruleFunction )
            // InternalJqlDslParser.g:4830:3: ruleFunction
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
    // InternalJqlDslParser.g:4839:1: rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4843:1: ( ( ruleOpMulti ) )
            // InternalJqlDslParser.g:4844:2: ( ruleOpMulti )
            {
            // InternalJqlDslParser.g:4844:2: ( ruleOpMulti )
            // InternalJqlDslParser.g:4845:3: ruleOpMulti
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
    // InternalJqlDslParser.g:4854:1: rule__MultiplicativeExpression__RightOperandAssignment_2_1 : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__RightOperandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4858:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDslParser.g:4859:2: ( ruleUnaryOperation )
            {
            // InternalJqlDslParser.g:4859:2: ( ruleUnaryOperation )
            // InternalJqlDslParser.g:4860:3: ruleUnaryOperation
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
    // InternalJqlDslParser.g:4869:1: rule__UnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4873:1: ( ( ruleOpUnary ) )
            // InternalJqlDslParser.g:4874:2: ( ruleOpUnary )
            {
            // InternalJqlDslParser.g:4874:2: ( ruleOpUnary )
            // InternalJqlDslParser.g:4875:3: ruleOpUnary
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
    // InternalJqlDslParser.g:4884:1: rule__UnaryOperation__OperandAssignment_0_2 : ( ruleUnaryOperation ) ;
    public final void rule__UnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4888:1: ( ( ruleUnaryOperation ) )
            // InternalJqlDslParser.g:4889:2: ( ruleUnaryOperation )
            {
            // InternalJqlDslParser.g:4889:2: ( ruleUnaryOperation )
            // InternalJqlDslParser.g:4890:3: ruleUnaryOperation
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
    // InternalJqlDslParser.g:4899:1: rule__LambdaExpression__ArgumentAssignment_1 : ( ruleFeature ) ;
    public final void rule__LambdaExpression__ArgumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4903:1: ( ( ruleFeature ) )
            // InternalJqlDslParser.g:4904:2: ( ruleFeature )
            {
            // InternalJqlDslParser.g:4904:2: ( ruleFeature )
            // InternalJqlDslParser.g:4905:3: ruleFeature
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
    // InternalJqlDslParser.g:4914:1: rule__LambdaExpression__StatementAssignment_3 : ( ruleExpression ) ;
    public final void rule__LambdaExpression__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4918:1: ( ( ruleExpression ) )
            // InternalJqlDslParser.g:4919:2: ( ruleExpression )
            {
            // InternalJqlDslParser.g:4919:2: ( ruleExpression )
            // InternalJqlDslParser.g:4920:3: ruleExpression
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
    // InternalJqlDslParser.g:4929:1: rule__Function__FeatureAssignment_1 : ( ruleFeature ) ;
    public final void rule__Function__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4933:1: ( ( ruleFeature ) )
            // InternalJqlDslParser.g:4934:2: ( ruleFeature )
            {
            // InternalJqlDslParser.g:4934:2: ( ruleFeature )
            // InternalJqlDslParser.g:4935:3: ruleFeature
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


    // $ANTLR start "rule__Function__LambdaAssignment_3_0"
    // InternalJqlDslParser.g:4944:1: rule__Function__LambdaAssignment_3_0 : ( ruleLambdaExpression ) ;
    public final void rule__Function__LambdaAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4948:1: ( ( ruleLambdaExpression ) )
            // InternalJqlDslParser.g:4949:2: ( ruleLambdaExpression )
            {
            // InternalJqlDslParser.g:4949:2: ( ruleLambdaExpression )
            // InternalJqlDslParser.g:4950:3: ruleLambdaExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLambdaLambdaExpressionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLambdaExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLambdaLambdaExpressionParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__LambdaAssignment_3_0"


    // $ANTLR start "rule__Function__ParametersAssignment_3_1_0"
    // InternalJqlDslParser.g:4959:1: rule__Function__ParametersAssignment_3_1_0 : ( ruleExpression ) ;
    public final void rule__Function__ParametersAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4963:1: ( ( ruleExpression ) )
            // InternalJqlDslParser.g:4964:2: ( ruleExpression )
            {
            // InternalJqlDslParser.g:4964:2: ( ruleExpression )
            // InternalJqlDslParser.g:4965:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_3_1_0"


    // $ANTLR start "rule__Function__ParametersAssignment_3_1_1_1"
    // InternalJqlDslParser.g:4974:1: rule__Function__ParametersAssignment_3_1_1_1 : ( ruleExpression ) ;
    public final void rule__Function__ParametersAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4978:1: ( ( ruleExpression ) )
            // InternalJqlDslParser.g:4979:2: ( ruleExpression )
            {
            // InternalJqlDslParser.g:4979:2: ( ruleExpression )
            // InternalJqlDslParser.g:4980:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getParametersExpressionParserRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_3_1_1_1"


    // $ANTLR start "rule__BooleanLiteral__IsTrueAssignment_1_1"
    // InternalJqlDslParser.g:4989:1: rule__BooleanLiteral__IsTrueAssignment_1_1 : ( ( True ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:4993:1: ( ( ( True ) ) )
            // InternalJqlDslParser.g:4994:2: ( ( True ) )
            {
            // InternalJqlDslParser.g:4994:2: ( ( True ) )
            // InternalJqlDslParser.g:4995:3: ( True )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            // InternalJqlDslParser.g:4996:3: ( True )
            // InternalJqlDslParser.g:4997:4: True
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            match(input,True,FOLLOW_2); if (state.failed) return ;
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
    // InternalJqlDslParser.g:5008:1: rule__NumberLiteral__ValueAssignment_0_1 : ( RULE_INTEGER ) ;
    public final void rule__NumberLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5012:1: ( ( RULE_INTEGER ) )
            // InternalJqlDslParser.g:5013:2: ( RULE_INTEGER )
            {
            // InternalJqlDslParser.g:5013:2: ( RULE_INTEGER )
            // InternalJqlDslParser.g:5014:3: RULE_INTEGER
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
    // InternalJqlDslParser.g:5023:1: rule__NumberLiteral__ValueAssignment_1_1 : ( RULE_DECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5027:1: ( ( RULE_DECIMAL ) )
            // InternalJqlDslParser.g:5028:2: ( RULE_DECIMAL )
            {
            // InternalJqlDslParser.g:5028:2: ( RULE_DECIMAL )
            // InternalJqlDslParser.g:5029:3: RULE_DECIMAL
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
    // InternalJqlDslParser.g:5038:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5042:1: ( ( RULE_STRING ) )
            // InternalJqlDslParser.g:5043:2: ( RULE_STRING )
            {
            // InternalJqlDslParser.g:5043:2: ( RULE_STRING )
            // InternalJqlDslParser.g:5044:3: RULE_STRING
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
    // InternalJqlDslParser.g:5053:1: rule__TemporalLiteral__ValueAssignment_0_1 : ( RULE_DATE ) ;
    public final void rule__TemporalLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5057:1: ( ( RULE_DATE ) )
            // InternalJqlDslParser.g:5058:2: ( RULE_DATE )
            {
            // InternalJqlDslParser.g:5058:2: ( RULE_DATE )
            // InternalJqlDslParser.g:5059:3: RULE_DATE
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
    // InternalJqlDslParser.g:5068:1: rule__TemporalLiteral__ValueAssignment_1_1 : ( RULE_TIMESTAMP ) ;
    public final void rule__TemporalLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5072:1: ( ( RULE_TIMESTAMP ) )
            // InternalJqlDslParser.g:5073:2: ( RULE_TIMESTAMP )
            {
            // InternalJqlDslParser.g:5073:2: ( RULE_TIMESTAMP )
            // InternalJqlDslParser.g:5074:3: RULE_TIMESTAMP
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
    // InternalJqlDslParser.g:5083:1: rule__MeasuredLiteral__ValueAssignment_1 : ( ruleNumberLiteral ) ;
    public final void rule__MeasuredLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5087:1: ( ( ruleNumberLiteral ) )
            // InternalJqlDslParser.g:5088:2: ( ruleNumberLiteral )
            {
            // InternalJqlDslParser.g:5088:2: ( ruleNumberLiteral )
            // InternalJqlDslParser.g:5089:3: ruleNumberLiteral
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


    // $ANTLR start "rule__MeasuredLiteral__TypeAssignment_3_0"
    // InternalJqlDslParser.g:5098:1: rule__MeasuredLiteral__TypeAssignment_3_0 : ( ruleQualifiedName ) ;
    public final void rule__MeasuredLiteral__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5102:1: ( ( ruleQualifiedName ) )
            // InternalJqlDslParser.g:5103:2: ( ruleQualifiedName )
            {
            // InternalJqlDslParser.g:5103:2: ( ruleQualifiedName )
            // InternalJqlDslParser.g:5104:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getTypeQualifiedNameParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getTypeQualifiedNameParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__TypeAssignment_3_0"


    // $ANTLR start "rule__MeasuredLiteral__MeasureAssignment_4"
    // InternalJqlDslParser.g:5113:1: rule__MeasuredLiteral__MeasureAssignment_4 : ( ruleValidID ) ;
    public final void rule__MeasuredLiteral__MeasureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5117:1: ( ( ruleValidID ) )
            // InternalJqlDslParser.g:5118:2: ( ruleValidID )
            {
            // InternalJqlDslParser.g:5118:2: ( ruleValidID )
            // InternalJqlDslParser.g:5119:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasuredLiteralAccess().getMeasureValidIDParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasuredLiteralAccess().getMeasureValidIDParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredLiteral__MeasureAssignment_4"


    // $ANTLR start "rule__EnumLiteral__TypeAssignment_1"
    // InternalJqlDslParser.g:5128:1: rule__EnumLiteral__TypeAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__EnumLiteral__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5132:1: ( ( ruleQualifiedName ) )
            // InternalJqlDslParser.g:5133:2: ( ruleQualifiedName )
            {
            // InternalJqlDslParser.g:5133:2: ( ruleQualifiedName )
            // InternalJqlDslParser.g:5134:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getTypeQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getTypeQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__TypeAssignment_1"


    // $ANTLR start "rule__EnumLiteral__ValueAssignment_3"
    // InternalJqlDslParser.g:5143:1: rule__EnumLiteral__ValueAssignment_3 : ( ruleValidID ) ;
    public final void rule__EnumLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5147:1: ( ( ruleValidID ) )
            // InternalJqlDslParser.g:5148:2: ( ruleValidID )
            {
            // InternalJqlDslParser.g:5148:2: ( ruleValidID )
            // InternalJqlDslParser.g:5149:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getValueValidIDParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getValueValidIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__ValueAssignment_3"


    // $ANTLR start "rule__NavigationExpression__BaseAssignment_0"
    // InternalJqlDslParser.g:5158:1: rule__NavigationExpression__BaseAssignment_0 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5162:1: ( ( ruleNavigationBase ) )
            // InternalJqlDslParser.g:5163:2: ( ruleNavigationBase )
            {
            // InternalJqlDslParser.g:5163:2: ( ruleNavigationBase )
            // InternalJqlDslParser.g:5164:3: ruleNavigationBase
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
    // InternalJqlDslParser.g:5173:1: rule__NavigationExpression__FeaturesAssignment_1_1 : ( ruleFeature ) ;
    public final void rule__NavigationExpression__FeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5177:1: ( ( ruleFeature ) )
            // InternalJqlDslParser.g:5178:2: ( ruleFeature )
            {
            // InternalJqlDslParser.g:5178:2: ( ruleFeature )
            // InternalJqlDslParser.g:5179:3: ruleFeature
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
    // InternalJqlDslParser.g:5188:1: rule__NavigationExpression__CastAssignment_2_1 : ( ruleNavigationBase ) ;
    public final void rule__NavigationExpression__CastAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5192:1: ( ( ruleNavigationBase ) )
            // InternalJqlDslParser.g:5193:2: ( ruleNavigationBase )
            {
            // InternalJqlDslParser.g:5193:2: ( ruleNavigationBase )
            // InternalJqlDslParser.g:5194:3: ruleNavigationBase
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
    // InternalJqlDslParser.g:5203:1: rule__Feature__NameAssignment : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJqlDslParser.g:5207:1: ( ( RULE_ID ) )
            // InternalJqlDslParser.g:5208:2: ( RULE_ID )
            {
            // InternalJqlDslParser.g:5208:2: ( RULE_ID )
            // InternalJqlDslParser.g:5209:3: RULE_ID
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4\1\uffff\1\4";
    static final String dfa_3s = "\1\5\1\uffff\1\4\2\uffff\1\47\1\4\1\47\1\4";
    static final String dfa_4s = "\1\50\1\uffff\1\37\2\uffff\1\47\1\37\1\47\1\37";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\2\4\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\2\3\12\uffff\1\3\1\1\20\uffff\4\3\1\2\1\3",
            "",
            "\1\4\2\uffff\3\4\1\uffff\1\4\1\5\4\4\2\uffff\15\4",
            "",
            "",
            "\1\6",
            "\1\4\2\uffff\3\4\1\uffff\1\4\1\7\4\4\1\3\1\uffff\15\4",
            "\1\10",
            "\1\4\2\uffff\3\4\1\uffff\1\4\1\7\4\4\1\3\1\uffff\15\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1036:1: rule__PrimaryExpression__Alternatives : ( ( ruleParenthesizedExpression ) | ( ruleNavigationExpression ) | ( ruleLiteral ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001F800860460L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000028004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000028004002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002110300L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002100302L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002100300L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000001F8008E0460L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001002L});

}