package hu.blackbelt.judo.meta.jql.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJqlDslLexer extends Lexer {
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

    public InternalJqlDslLexer() {;} 
    public InternalJqlDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJqlDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJqlDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:11:7: ( '||' )
            // InternalJqlDsl.g:11:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:12:7: ( 'or' )
            // InternalJqlDsl.g:12:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:13:7: ( 'OR' )
            // InternalJqlDsl.g:13:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:14:7: ( 'and' )
            // InternalJqlDsl.g:14:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:15:7: ( 'AND' )
            // InternalJqlDsl.g:15:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:16:7: ( '==' )
            // InternalJqlDsl.g:16:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:17:7: ( '!=' )
            // InternalJqlDsl.g:17:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:18:7: ( '>=' )
            // InternalJqlDsl.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:19:7: ( '>' )
            // InternalJqlDsl.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:20:7: ( '<' )
            // InternalJqlDsl.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:21:7: ( '+' )
            // InternalJqlDsl.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:22:7: ( '-' )
            // InternalJqlDsl.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:23:7: ( '*' )
            // InternalJqlDsl.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:24:7: ( '/' )
            // InternalJqlDsl.g:24:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:25:7: ( '%' )
            // InternalJqlDsl.g:25:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:26:7: ( 'div' )
            // InternalJqlDsl.g:26:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:27:7: ( 'DIV' )
            // InternalJqlDsl.g:27:9: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:28:7: ( 'mod' )
            // InternalJqlDsl.g:28:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:29:7: ( 'MOD' )
            // InternalJqlDsl.g:29:9: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:30:7: ( '!' )
            // InternalJqlDsl.g:30:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:31:7: ( 'not' )
            // InternalJqlDsl.g:31:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:32:7: ( 'NOT' )
            // InternalJqlDsl.g:32:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:33:7: ( 'CASE' )
            // InternalJqlDsl.g:33:9: 'CASE'
            {
            match("CASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:34:7: ( 'case' )
            // InternalJqlDsl.g:34:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:35:7: ( 'AS' )
            // InternalJqlDsl.g:35:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:36:7: ( 'as' )
            // InternalJqlDsl.g:36:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:37:7: ( 'WHEN' )
            // InternalJqlDsl.g:37:9: 'WHEN'
            {
            match("WHEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:38:7: ( 'when' )
            // InternalJqlDsl.g:38:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:39:7: ( 'ELSE' )
            // InternalJqlDsl.g:39:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:40:7: ( 'else' )
            // InternalJqlDsl.g:40:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:41:7: ( 'THEN' )
            // InternalJqlDsl.g:41:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:42:7: ( 'then' )
            // InternalJqlDsl.g:42:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:43:7: ( 'false' )
            // InternalJqlDsl.g:43:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:44:7: ( '=' )
            // InternalJqlDsl.g:44:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:45:7: ( '(' )
            // InternalJqlDsl.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:46:7: ( ')' )
            // InternalJqlDsl.g:46:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:47:7: ( '|' )
            // InternalJqlDsl.g:47:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:48:7: ( ',' )
            // InternalJqlDsl.g:48:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:49:7: ( '[' )
            // InternalJqlDsl.g:49:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:50:7: ( ']' )
            // InternalJqlDsl.g:50:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:51:7: ( '`' )
            // InternalJqlDsl.g:51:9: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:52:7: ( '.' )
            // InternalJqlDsl.g:52:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:53:7: ( '@' )
            // InternalJqlDsl.g:53:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:54:7: ( '::' )
            // InternalJqlDsl.g:54:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:55:7: ( 'true' )
            // InternalJqlDsl.g:55:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6033:11: ( '{' ( '0' .. '9' | '-' )+ '}' )
            // InternalJqlDsl.g:6033:13: '{' ( '0' .. '9' | '-' )+ '}'
            {
            match('{'); 
            // InternalJqlDsl.g:6033:17: ( '0' .. '9' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJqlDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_TIMESTAMP"
    public final void mRULE_TIMESTAMP() throws RecognitionException {
        try {
            int _type = RULE_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6035:16: ( '{' ( '0' .. '9' | '-' )+ 'T' ( options {greedy=false; } : . )* '}' )
            // InternalJqlDsl.g:6035:18: '{' ( '0' .. '9' | '-' )+ 'T' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // InternalJqlDsl.g:6035:22: ( '0' .. '9' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJqlDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('T'); 
            // InternalJqlDsl.g:6035:42: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='}') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='|')||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJqlDsl.g:6035:70: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMESTAMP"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6037:14: ( RULE_INTEGER '.' RULE_INTEGER )
            // InternalJqlDsl.g:6037:16: RULE_INTEGER '.' RULE_INTEGER
            {
            mRULE_INTEGER(); 
            match('.'); 
            mRULE_INTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6039:14: ( ( '0' .. '9' )+ )
            // InternalJqlDsl.g:6039:16: ( '0' .. '9' )+
            {
            // InternalJqlDsl.g:6039:16: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJqlDsl.g:6039:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6041:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJqlDsl.g:6041:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJqlDsl.g:6041:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJqlDsl.g:6041:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalJqlDsl.g:6041:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJqlDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6043:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJqlDsl.g:6043:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJqlDsl.g:6043:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJqlDsl.g:6043:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJqlDsl.g:6043:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJqlDsl.g:6043:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJqlDsl.g:6043:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJqlDsl.g:6043:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJqlDsl.g:6043:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJqlDsl.g:6043:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJqlDsl.g:6043:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6045:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJqlDsl.g:6045:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJqlDsl.g:6045:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJqlDsl.g:6045:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6047:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJqlDsl.g:6047:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJqlDsl.g:6047:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJqlDsl.g:6047:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalJqlDsl.g:6047:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJqlDsl.g:6047:41: ( '\\r' )? '\\n'
                    {
                    // InternalJqlDsl.g:6047:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalJqlDsl.g:6047:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6049:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJqlDsl.g:6049:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJqlDsl.g:6049:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJqlDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJqlDsl.g:6051:16: ( . )
            // InternalJqlDsl.g:6051:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalJqlDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_DATE | RULE_TIMESTAMP | RULE_DECIMAL | RULE_INTEGER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=55;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalJqlDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalJqlDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalJqlDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalJqlDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalJqlDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalJqlDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalJqlDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalJqlDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalJqlDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalJqlDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalJqlDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalJqlDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalJqlDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalJqlDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalJqlDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalJqlDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalJqlDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalJqlDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalJqlDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalJqlDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalJqlDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalJqlDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalJqlDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalJqlDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalJqlDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalJqlDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalJqlDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalJqlDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalJqlDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalJqlDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalJqlDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalJqlDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalJqlDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalJqlDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalJqlDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalJqlDsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalJqlDsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalJqlDsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalJqlDsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalJqlDsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalJqlDsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalJqlDsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalJqlDsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalJqlDsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalJqlDsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalJqlDsl.g:1:280: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 47 :
                // InternalJqlDsl.g:1:290: RULE_TIMESTAMP
                {
                mRULE_TIMESTAMP(); 

                }
                break;
            case 48 :
                // InternalJqlDsl.g:1:305: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 49 :
                // InternalJqlDsl.g:1:318: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 50 :
                // InternalJqlDsl.g:1:331: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalJqlDsl.g:1:339: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 52 :
                // InternalJqlDsl.g:1:351: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 53 :
                // InternalJqlDsl.g:1:367: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalJqlDsl.g:1:383: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalJqlDsl.g:1:391: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\60\4\62\1\71\1\73\1\75\4\uffff\1\104\1\uffff\17\62\10\uffff\2\56\1\140\1\56\1\uffff\2\56\4\uffff\1\145\1\uffff\1\146\1\62\1\150\1\62\1\152\16\uffff\20\62\13\uffff\1\140\5\uffff\1\175\1\uffff\1\176\1\uffff\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\12\62\12\uffff\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\62\11\uffff\1\u0099\1\uffff";
    static final String DFA15_eofS =
        "\u009a\uffff";
    static final String DFA15_minS =
        "\1\0\1\174\1\162\1\122\1\156\1\116\3\75\4\uffff\1\52\1\uffff\1\151\1\111\1\157\1\117\1\157\1\117\1\101\1\141\1\110\1\150\1\114\1\154\1\110\1\150\1\141\10\uffff\1\72\1\55\1\56\1\101\1\uffff\2\0\4\uffff\1\60\1\uffff\1\60\1\144\1\60\1\104\1\60\16\uffff\1\166\1\126\1\144\1\104\1\164\1\124\1\123\1\163\1\105\1\145\1\123\1\163\1\105\1\145\1\165\1\154\11\uffff\1\55\1\uffff\1\56\5\uffff\1\60\1\uffff\1\60\1\uffff\6\60\1\105\1\145\1\116\1\156\1\105\1\145\1\116\1\156\1\145\1\163\12\uffff\11\60\1\145\11\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\174\1\162\1\122\1\163\1\123\3\75\4\uffff\1\57\1\uffff\1\151\1\111\1\157\1\117\1\157\1\117\1\101\1\141\1\110\1\150\1\114\1\154\1\110\1\162\1\141\10\uffff\1\72\2\71\1\172\1\uffff\2\uffff\4\uffff\1\172\1\uffff\1\172\1\144\1\172\1\104\1\172\16\uffff\1\166\1\126\1\144\1\104\1\164\1\124\1\123\1\163\1\105\1\145\1\123\1\163\1\105\1\145\1\165\1\154\11\uffff\1\175\1\uffff\1\71\5\uffff\1\172\1\uffff\1\172\1\uffff\6\172\1\105\1\145\1\116\1\156\1\105\1\145\1\116\1\156\1\145\1\163\12\uffff\11\172\1\145\11\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\12\1\13\1\14\1\15\1\uffff\1\17\17\uffff\1\43\1\44\1\46\1\47\1\50\1\51\1\52\1\53\4\uffff\1\62\2\uffff\1\66\1\67\1\1\1\45\1\uffff\1\62\5\uffff\1\6\1\42\1\7\1\24\1\10\1\11\1\12\1\13\1\14\1\15\1\64\1\65\1\16\1\17\20\uffff\1\43\1\44\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\uffff\1\61\1\uffff\1\60\1\63\1\66\1\2\1\3\1\uffff\1\32\1\uffff\1\31\20\uffff\1\57\1\56\1\4\1\5\1\20\1\21\1\22\1\23\1\25\1\26\12\uffff\1\27\1\30\1\33\1\34\1\35\1\36\1\37\1\40\1\55\1\uffff\1\41";
    static final String DFA15_specialS =
        "\1\2\52\uffff\1\0\1\1\155\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\7\1\53\2\56\1\16\1\56\1\54\1\36\1\37\1\14\1\12\1\40\1\13\1\44\1\15\12\50\1\46\1\56\1\11\1\6\1\10\1\56\1\45\1\5\1\52\1\25\1\20\1\31\7\52\1\22\1\24\1\3\4\52\1\33\2\52\1\27\3\52\1\41\1\56\1\42\1\51\1\52\1\43\1\4\1\52\1\26\1\17\1\32\1\35\6\52\1\21\1\23\1\2\4\52\1\34\2\52\1\30\3\52\1\47\1\1\uff83\56",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\64\4\uffff\1\65",
            "\1\66\4\uffff\1\67",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\102\4\uffff\1\103",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\11\uffff\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\137\2\uffff\12\137",
            "\1\142\1\uffff\12\141",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\0\143",
            "\0\143",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\147",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\151",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\2\uffff\12\137\32\uffff\1\173\50\uffff\1\174",
            "",
            "\1\142\1\uffff\12\141",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_DATE | RULE_TIMESTAMP | RULE_DECIMAL | RULE_INTEGER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( ((LA15_43>='\u0000' && LA15_43<='\uFFFF')) ) {s = 99;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_44 = input.LA(1);

                        s = -1;
                        if ( ((LA15_44>='\u0000' && LA15_44<='\uFFFF')) ) {s = 99;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='|') ) {s = 1;}

                        else if ( (LA15_0=='o') ) {s = 2;}

                        else if ( (LA15_0=='O') ) {s = 3;}

                        else if ( (LA15_0=='a') ) {s = 4;}

                        else if ( (LA15_0=='A') ) {s = 5;}

                        else if ( (LA15_0=='=') ) {s = 6;}

                        else if ( (LA15_0=='!') ) {s = 7;}

                        else if ( (LA15_0=='>') ) {s = 8;}

                        else if ( (LA15_0=='<') ) {s = 9;}

                        else if ( (LA15_0=='+') ) {s = 10;}

                        else if ( (LA15_0=='-') ) {s = 11;}

                        else if ( (LA15_0=='*') ) {s = 12;}

                        else if ( (LA15_0=='/') ) {s = 13;}

                        else if ( (LA15_0=='%') ) {s = 14;}

                        else if ( (LA15_0=='d') ) {s = 15;}

                        else if ( (LA15_0=='D') ) {s = 16;}

                        else if ( (LA15_0=='m') ) {s = 17;}

                        else if ( (LA15_0=='M') ) {s = 18;}

                        else if ( (LA15_0=='n') ) {s = 19;}

                        else if ( (LA15_0=='N') ) {s = 20;}

                        else if ( (LA15_0=='C') ) {s = 21;}

                        else if ( (LA15_0=='c') ) {s = 22;}

                        else if ( (LA15_0=='W') ) {s = 23;}

                        else if ( (LA15_0=='w') ) {s = 24;}

                        else if ( (LA15_0=='E') ) {s = 25;}

                        else if ( (LA15_0=='e') ) {s = 26;}

                        else if ( (LA15_0=='T') ) {s = 27;}

                        else if ( (LA15_0=='t') ) {s = 28;}

                        else if ( (LA15_0=='f') ) {s = 29;}

                        else if ( (LA15_0=='(') ) {s = 30;}

                        else if ( (LA15_0==')') ) {s = 31;}

                        else if ( (LA15_0==',') ) {s = 32;}

                        else if ( (LA15_0=='[') ) {s = 33;}

                        else if ( (LA15_0==']') ) {s = 34;}

                        else if ( (LA15_0=='`') ) {s = 35;}

                        else if ( (LA15_0=='.') ) {s = 36;}

                        else if ( (LA15_0=='@') ) {s = 37;}

                        else if ( (LA15_0==':') ) {s = 38;}

                        else if ( (LA15_0=='{') ) {s = 39;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 40;}

                        else if ( (LA15_0=='^') ) {s = 41;}

                        else if ( (LA15_0=='B'||(LA15_0>='F' && LA15_0<='L')||(LA15_0>='P' && LA15_0<='S')||(LA15_0>='U' && LA15_0<='V')||(LA15_0>='X' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||(LA15_0>='g' && LA15_0<='l')||(LA15_0>='p' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 42;}

                        else if ( (LA15_0=='\"') ) {s = 43;}

                        else if ( (LA15_0=='\'') ) {s = 44;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 45;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='$')||LA15_0=='&'||LA15_0==';'||LA15_0=='?'||LA15_0=='\\'||(LA15_0>='}' && LA15_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}