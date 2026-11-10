// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g 2026-11-10 10:57:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WhileLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int PROGRAM=4;
    public static final int FUNCTION=5;
    public static final int INPUTS=6;
    public static final int OUTPUTS=7;
    public static final int COMMANDS=8;
    public static final int ASSIGN=9;
    public static final int VARS=10;
    public static final int EXPRS=11;
    public static final int IF=12;
    public static final int WHILE=13;
    public static final int FOR=14;
    public static final int FOREACH=15;
    public static final int EQUAL=16;
    public static final int CALL=17;
    public static final int CONS=18;
    public static final int LIST=19;
    public static final int HD=20;
    public static final int TL=21;
    public static final int NOP=22;
    public static final int NIL=23;
    public static final int SYMBOL=24;
    public static final int VARIABLE=25;
    public static final int WS=26;

    // delegates
    // delegators

    public WhileLexer() {;} 
    public WhileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public WhileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:3:7: ( 'function' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:3:9: 'function'
            {
            match("function"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:4:7: ( ':' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:4:9: ':'
            {
            match(':'); 

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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:5:7: ( 'read' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:5:9: 'read'
            {
            match("read"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:6:7: ( '%' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:6:9: '%'
            {
            match('%'); 

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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:7:7: ( 'write' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:7:9: 'write'
            {
            match("write"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:8:7: ( ',' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:8:9: ','
            {
            match(','); 

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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:9:7: ( ';' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:9:9: ';'
            {
            match(';'); 

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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:10:7: ( 'nop' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:10:9: 'nop'
            {
            match("nop"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:11:7: ( ':=' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:11:9: ':='
            {
            match(":="); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:12:7: ( 'if' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:12:9: 'if'
            {
            match("if"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:13:7: ( 'then' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:13:9: 'then'
            {
            match("then"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:14:7: ( 'else' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:14:9: 'else'
            {
            match("else"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:15:7: ( 'fi' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:15:9: 'fi'
            {
            match("fi"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:16:7: ( 'while' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:16:9: 'while'
            {
            match("while"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:17:7: ( 'do' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:17:9: 'do'
            {
            match("do"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:18:7: ( 'od' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:18:9: 'od'
            {
            match("od"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:19:7: ( 'for' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:19:9: 'for'
            {
            match("for"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:20:7: ( 'foreach' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:20:9: 'foreach'
            {
            match("foreach"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:21:7: ( 'in' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:21:9: 'in'
            {
            match("in"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:22:7: ( '=?' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:22:9: '=?'
            {
            match("=?"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:23:7: ( 'nil' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:23:9: 'nil'
            {
            match("nil"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:24:7: ( '(' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:24:9: '('
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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:25:7: ( 'cons' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:25:9: 'cons'
            {
            match("cons"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:26:7: ( ')' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:26:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:27:7: ( 'list' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:27:9: 'list'
            {
            match("list"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:28:7: ( 'hd' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:28:9: 'hd'
            {
            match("hd"); 


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
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:29:7: ( 'tl' )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:29:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:112:5: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )? )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:112:9: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('A','Z'); 
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:112:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:112:52: ( '!' | '?' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='!'||LA2_0=='?') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "VARIABLE"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:116:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )? )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:116:9: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:116:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:116:52: ( '!' | '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='!'||LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "SYMBOL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:120:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:120:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:120:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | VARIABLE | SYMBOL | WS )
        int alt6=30;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:130: T__47
                {
                mT__47(); 

                }
                break;
            case 22 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:136: T__48
                {
                mT__48(); 

                }
                break;
            case 23 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:142: T__49
                {
                mT__49(); 

                }
                break;
            case 24 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:148: T__50
                {
                mT__50(); 

                }
                break;
            case 25 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:154: T__51
                {
                mT__51(); 

                }
                break;
            case 26 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:160: T__52
                {
                mT__52(); 

                }
                break;
            case 27 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:166: T__53
                {
                mT__53(); 

                }
                break;
            case 28 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:172: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 29 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:181: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 30 :
                // C:\\Users\\hugor\\OneDrive\\Bureau\\Cours\\ESIR2\\S7\\TLC\\Projet_TLC\\Frontend\\While.g:1:188: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\25\1\33\1\25\1\uffff\1\25\2\uffff\6\25\2\uffff\1\25"+
        "\1\uffff\2\25\3\uffff\1\25\1\54\1\25\2\uffff\5\25\1\63\1\64\1\25"+
        "\1\66\1\25\1\70\1\71\2\25\1\74\1\25\1\uffff\1\77\3\25\1\103\1\104"+
        "\2\uffff\1\25\1\uffff\1\25\2\uffff\2\25\1\uffff\2\25\1\uffff\1\113"+
        "\2\25\2\uffff\1\116\1\117\1\120\1\121\2\25\1\uffff\1\124\1\125\4"+
        "\uffff\2\25\2\uffff\1\25\1\131\1\132\2\uffff";
    static final String DFA6_eofS =
        "\133\uffff";
    static final String DFA6_minS =
        "\1\11\1\151\1\75\1\145\1\uffff\1\150\2\uffff\1\151\1\146\1\150"+
        "\1\154\1\157\1\144\2\uffff\1\157\1\uffff\1\151\1\144\3\uffff\1\156"+
        "\1\41\1\162\2\uffff\1\141\2\151\1\160\1\154\2\41\1\145\1\41\1\163"+
        "\2\41\1\156\1\163\1\41\1\143\1\uffff\1\41\1\144\1\164\1\154\2\41"+
        "\2\uffff\1\156\1\uffff\1\145\2\uffff\1\163\1\164\1\uffff\1\164\1"+
        "\141\1\uffff\1\41\2\145\2\uffff\4\41\1\151\1\143\1\uffff\2\41\4"+
        "\uffff\1\157\1\150\2\uffff\1\156\2\41\2\uffff";
    static final String DFA6_maxS =
        "\1\172\1\165\1\75\1\145\1\uffff\1\162\2\uffff\1\157\1\156\2\154"+
        "\1\157\1\144\2\uffff\1\157\1\uffff\1\151\1\144\3\uffff\1\156\1\172"+
        "\1\162\2\uffff\1\141\2\151\1\160\1\154\2\172\1\145\1\172\1\163\2"+
        "\172\1\156\1\163\1\172\1\143\1\uffff\1\172\1\144\1\164\1\154\2\172"+
        "\2\uffff\1\156\1\uffff\1\145\2\uffff\1\163\1\164\1\uffff\1\164\1"+
        "\141\1\uffff\1\172\2\145\2\uffff\4\172\1\151\1\143\1\uffff\2\172"+
        "\4\uffff\1\157\1\150\2\uffff\1\156\2\172\2\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\24\1\26\1\uffff\1\30\2\uffff"+
        "\1\34\1\35\1\36\3\uffff\1\11\1\2\20\uffff\1\15\6\uffff\1\12\1\23"+
        "\1\uffff\1\33\1\uffff\1\17\1\20\2\uffff\1\32\2\uffff\1\21\3\uffff"+
        "\1\10\1\25\6\uffff\1\3\2\uffff\1\13\1\14\1\27\1\31\2\uffff\1\5\1"+
        "\16\3\uffff\1\22\1\1";
    static final String DFA6_specialS =
        "\133\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\4\uffff\1\4\2\uffff\1\17\1"+
            "\21\2\uffff\1\6\15\uffff\1\2\1\7\1\uffff\1\16\3\uffff\32\24"+
            "\6\uffff\2\25\1\20\1\14\1\13\1\1\1\25\1\23\1\11\2\25\1\22\1"+
            "\25\1\10\1\15\2\25\1\3\1\25\1\12\2\25\1\5\3\25",
            "\1\30\5\uffff\1\31\5\uffff\1\27",
            "\1\32",
            "\1\34",
            "",
            "\1\36\11\uffff\1\35",
            "",
            "",
            "\1\40\5\uffff\1\37",
            "\1\41\7\uffff\1\42",
            "\1\43\3\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "\1\53",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\55",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\65",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\67",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\72",
            "\1\73",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\75",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\4"+
            "\25\1\76\25\25",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            "",
            "\1\105",
            "",
            "\1\106",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\122",
            "\1\123",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | VARIABLE | SYMBOL | WS );";
        }
    }
 

}