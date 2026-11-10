// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g 2026-11-10 11:07:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class WhileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "FUNCTION", "INPUTS", "OUTPUTS", "COMMANDS", "ASSIGN", "VARS", "EXPRS", "IF", "WHILE", "FOR", "FOREACH", "EQUAL", "CALL", "CONS", "LIST", "HD", "TL", "NOP", "NIL", "SYMBOL", "VARIABLE", "WS", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'=?'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'"
    };
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


        public WhileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WhileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return WhileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:35:1: program : ( function )+ EOF -> ^( PROGRAM ( function )+ ) ;
    public final WhileParser.program_return program() throws RecognitionException {
        WhileParser.program_return retval = new WhileParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        WhileParser.function_return function1 = null;


        CommonTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:36:5: ( ( function )+ EOF -> ^( PROGRAM ( function )+ ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:36:9: ( function )+ EOF
            {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:36:9: ( function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program206);
            	    function1=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:9: -> ^( PROGRAM ( function )+ )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:37:12: ^( PROGRAM ( function )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:40:1: function : 'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output -> ^( FUNCTION SYMBOL input commands output ) ;
    public final WhileParser.function_return function() throws RecognitionException {
        WhileParser.function_return retval = new WhileParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal3=null;
        Token SYMBOL4=null;
        Token char_literal5=null;
        Token string_literal6=null;
        Token char_literal8=null;
        Token char_literal10=null;
        Token string_literal11=null;
        WhileParser.input_return input7 = null;

        WhileParser.commands_return commands9 = null;

        WhileParser.output_return output12 = null;


        CommonTree string_literal3_tree=null;
        CommonTree SYMBOL4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree string_literal11_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:41:5: ( 'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output -> ^( FUNCTION SYMBOL input commands output ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:41:9: 'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output
            {
            string_literal3=(Token)match(input,27,FOLLOW_27_in_function245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(string_literal3);

            SYMBOL4=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL4);

            char_literal5=(Token)match(input,28,FOLLOW_28_in_function249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal5);

            string_literal6=(Token)match(input,29,FOLLOW_29_in_function251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(string_literal6);

            pushFollow(FOLLOW_input_in_function253);
            input7=input();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_input.add(input7.getTree());
            char_literal8=(Token)match(input,30,FOLLOW_30_in_function255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal8);

            pushFollow(FOLLOW_commands_in_function257);
            commands9=commands();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_commands.add(commands9.getTree());
            char_literal10=(Token)match(input,30,FOLLOW_30_in_function259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal10);

            string_literal11=(Token)match(input,31,FOLLOW_31_in_function261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(string_literal11);

            pushFollow(FOLLOW_output_in_function263);
            output12=output();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_output.add(output12.getTree());


            // AST REWRITE
            // elements: SYMBOL, output, input, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 42:9: -> ^( FUNCTION SYMBOL input commands output )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:42:12: ^( FUNCTION SYMBOL input commands output )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_SYMBOL.nextNode());
                adaptor.addChild(root_1, stream_input.nextTree());
                adaptor.addChild(root_1, stream_commands.nextTree());
                adaptor.addChild(root_1, stream_output.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class input_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:45:1: input : ( VARIABLE ( ',' VARIABLE )* )? -> ^( INPUTS ( VARIABLE )* ) ;
    public final WhileParser.input_return input() throws RecognitionException {
        WhileParser.input_return retval = new WhileParser.input_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE13=null;
        Token char_literal14=null;
        Token VARIABLE15=null;

        CommonTree VARIABLE13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree VARIABLE15_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:46:5: ( ( VARIABLE ( ',' VARIABLE )* )? -> ^( INPUTS ( VARIABLE )* ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:46:9: ( VARIABLE ( ',' VARIABLE )* )?
            {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:46:9: ( VARIABLE ( ',' VARIABLE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VARIABLE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:46:10: VARIABLE ( ',' VARIABLE )*
                    {
                    VARIABLE13=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE13);

                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:46:19: ( ',' VARIABLE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==32) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:46:20: ',' VARIABLE
                    	    {
                    	    char_literal14=(Token)match(input,32,FOLLOW_32_in_input308); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_32.add(char_literal14);

                    	    VARIABLE15=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input310); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE15);


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: VARIABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 47:9: -> ^( INPUTS ( VARIABLE )* )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:47:12: ^( INPUTS ( VARIABLE )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INPUTS, "INPUTS"), root_1);

                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:47:21: ( VARIABLE )*
                while ( stream_VARIABLE.hasNext() ) {
                    adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                }
                stream_VARIABLE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "input"

    public static class output_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:50:1: output : VARIABLE ( ',' VARIABLE )* -> ^( OUTPUTS ( VARIABLE )+ ) ;
    public final WhileParser.output_return output() throws RecognitionException {
        WhileParser.output_return retval = new WhileParser.output_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE16=null;
        Token char_literal17=null;
        Token VARIABLE18=null;

        CommonTree VARIABLE16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree VARIABLE18_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:51:5: ( VARIABLE ( ',' VARIABLE )* -> ^( OUTPUTS ( VARIABLE )+ ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:51:9: VARIABLE ( ',' VARIABLE )*
            {
            VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE16);

            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:51:18: ( ',' VARIABLE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:51:19: ',' VARIABLE
            	    {
            	    char_literal17=(Token)match(input,32,FOLLOW_32_in_output353); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal17);

            	    VARIABLE18=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output355); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE18);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            // AST REWRITE
            // elements: VARIABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:9: -> ^( OUTPUTS ( VARIABLE )+ )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:52:12: ^( OUTPUTS ( VARIABLE )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OUTPUTS, "OUTPUTS"), root_1);

                if ( !(stream_VARIABLE.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_VARIABLE.hasNext() ) {
                    adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                }
                stream_VARIABLE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "output"

    public static class commands_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:55:1: commands : command ( ';' command )* -> ^( COMMANDS ( command )+ ) ;
    public final WhileParser.commands_return commands() throws RecognitionException {
        WhileParser.commands_return retval = new WhileParser.commands_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal20=null;
        WhileParser.command_return command19 = null;

        WhileParser.command_return command21 = null;


        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:56:5: ( command ( ';' command )* -> ^( COMMANDS ( command )+ ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:56:9: command ( ';' command )*
            {
            pushFollow(FOLLOW_command_in_commands393);
            command19=command();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_command.add(command19.getTree());
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:56:17: ( ';' command )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:56:18: ';' command
            	    {
            	    char_literal20=(Token)match(input,33,FOLLOW_33_in_commands396); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_33.add(char_literal20);

            	    pushFollow(FOLLOW_command_in_commands398);
            	    command21=command();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_command.add(command21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:9: -> ^( COMMANDS ( command )+ )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:57:12: ^( COMMANDS ( command )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMANDS, "COMMANDS"), root_1);

                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commands"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:60:1: command : ( 'nop' -> NOP | vars ':=' exprs -> ^( ASSIGN vars exprs ) | 'if' expression 'then' t= commands ( 'else' e= commands )? 'fi' -> ^( IF expression $t ( $e)? ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) | 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) | 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH VARIABLE expression commands ) );
    public final WhileParser.command_return command() throws RecognitionException {
        WhileParser.command_return retval = new WhileParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal22=null;
        Token string_literal24=null;
        Token string_literal26=null;
        Token string_literal28=null;
        Token string_literal29=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal33=null;
        Token string_literal35=null;
        Token string_literal36=null;
        Token string_literal38=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token VARIABLE42=null;
        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal47=null;
        WhileParser.commands_return t = null;

        WhileParser.commands_return e = null;

        WhileParser.vars_return vars23 = null;

        WhileParser.exprs_return exprs25 = null;

        WhileParser.expression_return expression27 = null;

        WhileParser.expression_return expression32 = null;

        WhileParser.commands_return commands34 = null;

        WhileParser.expression_return expression37 = null;

        WhileParser.commands_return commands39 = null;

        WhileParser.expression_return expression44 = null;

        WhileParser.commands_return commands46 = null;


        CommonTree string_literal22_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree string_literal26_tree=null;
        CommonTree string_literal28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree string_literal33_tree=null;
        CommonTree string_literal35_tree=null;
        CommonTree string_literal36_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree VARIABLE42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:61:5: ( 'nop' -> NOP | vars ':=' exprs -> ^( ASSIGN vars exprs ) | 'if' expression 'then' t= commands ( 'else' e= commands )? 'fi' -> ^( IF expression $t ( $e)? ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) | 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) | 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH VARIABLE expression commands ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case VARIABLE:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            case 43:
                {
                alt7=5;
                }
                break;
            case 44:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:61:9: 'nop'
                    {
                    string_literal22=(Token)match(input,34,FOLLOW_34_in_command436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal22);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:9: -> NOP
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NOP, "NOP"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:63:9: vars ':=' exprs
                    {
                    pushFollow(FOLLOW_vars_in_command458);
                    vars23=vars();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vars.add(vars23.getTree());
                    string_literal24=(Token)match(input,35,FOLLOW_35_in_command460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal24);

                    pushFollow(FOLLOW_exprs_in_command462);
                    exprs25=exprs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprs.add(exprs25.getTree());


                    // AST REWRITE
                    // elements: vars, exprs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:9: -> ^( ASSIGN vars exprs )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:64:12: ^( ASSIGN vars exprs )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_vars.nextTree());
                        adaptor.addChild(root_1, stream_exprs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:65:9: 'if' expression 'then' t= commands ( 'else' e= commands )? 'fi'
                    {
                    string_literal26=(Token)match(input,36,FOLLOW_36_in_command490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal26);

                    pushFollow(FOLLOW_expression_in_command492);
                    expression27=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression27.getTree());
                    string_literal28=(Token)match(input,37,FOLLOW_37_in_command494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal28);

                    pushFollow(FOLLOW_commands_in_command498);
                    t=commands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commands.add(t.getTree());
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:65:43: ( 'else' e= commands )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==38) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:65:44: 'else' e= commands
                            {
                            string_literal29=(Token)match(input,38,FOLLOW_38_in_command501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_38.add(string_literal29);

                            pushFollow(FOLLOW_commands_in_command505);
                            e=commands();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_commands.add(e.getTree());

                            }
                            break;

                    }

                    string_literal30=(Token)match(input,39,FOLLOW_39_in_command509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal30);



                    // AST REWRITE
                    // elements: e, expression, t
                    // token labels: 
                    // rule labels: t, e, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 66:9: -> ^( IF expression $t ( $e)? )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:66:12: ^( IF expression $t ( $e)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_t.nextTree());
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:66:31: ( $e)?
                        if ( stream_e.hasNext() ) {
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:67:9: 'while' expression 'do' commands 'od'
                    {
                    string_literal31=(Token)match(input,40,FOLLOW_40_in_command542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(string_literal31);

                    pushFollow(FOLLOW_expression_in_command544);
                    expression32=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
                    string_literal33=(Token)match(input,41,FOLLOW_41_in_command546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal33);

                    pushFollow(FOLLOW_commands_in_command548);
                    commands34=commands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commands.add(commands34.getTree());
                    string_literal35=(Token)match(input,42,FOLLOW_42_in_command550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal35);



                    // AST REWRITE
                    // elements: expression, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 68:9: -> ^( WHILE expression commands )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:68:12: ^( WHILE expression commands )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:69:9: 'for' expression 'do' commands 'od'
                    {
                    string_literal36=(Token)match(input,43,FOLLOW_43_in_command578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal36);

                    pushFollow(FOLLOW_expression_in_command580);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());
                    string_literal38=(Token)match(input,41,FOLLOW_41_in_command582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal38);

                    pushFollow(FOLLOW_commands_in_command584);
                    commands39=commands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commands.add(commands39.getTree());
                    string_literal40=(Token)match(input,42,FOLLOW_42_in_command586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal40);



                    // AST REWRITE
                    // elements: commands, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:9: -> ^( FOR expression commands )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:70:12: ^( FOR expression commands )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:71:9: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
                    {
                    string_literal41=(Token)match(input,44,FOLLOW_44_in_command614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal41);

                    VARIABLE42=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE42);

                    string_literal43=(Token)match(input,45,FOLLOW_45_in_command618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_45.add(string_literal43);

                    pushFollow(FOLLOW_expression_in_command620);
                    expression44=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression44.getTree());
                    string_literal45=(Token)match(input,41,FOLLOW_41_in_command622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal45);

                    pushFollow(FOLLOW_commands_in_command624);
                    commands46=commands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commands.add(commands46.getTree());
                    string_literal47=(Token)match(input,42,FOLLOW_42_in_command626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal47);



                    // AST REWRITE
                    // elements: commands, VARIABLE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:9: -> ^( FOREACH VARIABLE expression commands )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:72:12: ^( FOREACH VARIABLE expression commands )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOREACH, "FOREACH"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class vars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:75:1: vars : VARIABLE ( ',' VARIABLE )* -> ^( VARS ( VARIABLE )+ ) ;
    public final WhileParser.vars_return vars() throws RecognitionException {
        WhileParser.vars_return retval = new WhileParser.vars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE48=null;
        Token char_literal49=null;
        Token VARIABLE50=null;

        CommonTree VARIABLE48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree VARIABLE50_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:76:5: ( VARIABLE ( ',' VARIABLE )* -> ^( VARS ( VARIABLE )+ ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:76:9: VARIABLE ( ',' VARIABLE )*
            {
            VARIABLE48=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars665); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE48);

            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:76:18: ( ',' VARIABLE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:76:19: ',' VARIABLE
            	    {
            	    char_literal49=(Token)match(input,32,FOLLOW_32_in_vars668); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal49);

            	    VARIABLE50=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars670); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE50);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: VARIABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:9: -> ^( VARS ( VARIABLE )+ )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:77:12: ^( VARS ( VARIABLE )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARS, "VARS"), root_1);

                if ( !(stream_VARIABLE.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_VARIABLE.hasNext() ) {
                    adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                }
                stream_VARIABLE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:80:1: exprs : expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) ;
    public final WhileParser.exprs_return exprs() throws RecognitionException {
        WhileParser.exprs_return retval = new WhileParser.exprs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        WhileParser.expression_return expression51 = null;

        WhileParser.expression_return expression53 = null;


        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:81:5: ( expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:81:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprs708);
            expression51=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression51.getTree());
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:81:20: ( ',' expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:81:21: ',' expression
            	    {
            	    char_literal52=(Token)match(input,32,FOLLOW_32_in_exprs711); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal52);

            	    pushFollow(FOLLOW_expression_in_exprs713);
            	    expression53=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 82:9: -> ^( EXPRS ( expression )+ )
            {
                // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:82:12: ^( EXPRS ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRS, "EXPRS"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprs"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:85:1: expression : eb1= exprBase ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1) ;
    public final WhileParser.expression_return expression() throws RecognitionException {
        WhileParser.expression_return retval = new WhileParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal54=null;
        WhileParser.exprBase_return eb1 = null;

        WhileParser.exprBase_return eb2 = null;


        CommonTree string_literal54_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:86:5: (eb1= exprBase ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1) )
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:86:9: eb1= exprBase ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1)
            {
            pushFollow(FOLLOW_exprBase_in_expression753);
            eb1=exprBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBase.add(eb1.getTree());
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:86:22: ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==EOF||LA10_0==30||(LA10_0>=32 && LA10_0<=33)||(LA10_0>=37 && LA10_0<=39)||(LA10_0>=41 && LA10_0<=42)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:86:24: '=?' eb2= exprBase
                    {
                    string_literal54=(Token)match(input,46,FOLLOW_46_in_expression757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(string_literal54);

                    pushFollow(FOLLOW_exprBase_in_expression761);
                    eb2=exprBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprBase.add(eb2.getTree());


                    // AST REWRITE
                    // elements: eb2, eb1
                    // token labels: 
                    // rule labels: eb2, eb1, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_eb2=new RewriteRuleSubtreeStream(adaptor,"rule eb2",eb2!=null?eb2.tree:null);
                    RewriteRuleSubtreeStream stream_eb1=new RewriteRuleSubtreeStream(adaptor,"rule eb1",eb1!=null?eb1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:42: -> ^( EQUAL $eb1 $eb2)
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:86:45: ^( EQUAL $eb1 $eb2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EQUAL, "EQUAL"), root_1);

                        adaptor.addChild(root_1, stream_eb1.nextTree());
                        adaptor.addChild(root_1, stream_eb2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:87:24: 
                    {

                    // AST REWRITE
                    // elements: eb1
                    // token labels: 
                    // rule labels: eb1, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_eb1=new RewriteRuleSubtreeStream(adaptor,"rule eb1",eb1!=null?eb1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:24: -> $eb1
                    {
                        adaptor.addChild(root_0, stream_eb1.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class exprBase_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:91:1: exprBase : ( 'nil' -> NIL | VARIABLE | SYMBOL | '(' 'cons' ( exprBase )* ')' -> ^( CONS ( exprBase )* ) | '(' 'list' ( exprBase )* ')' -> ^( LIST ( exprBase )* ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL ( exprBase )* ')' -> ^( CALL SYMBOL ( exprBase )* ) );
    public final WhileParser.exprBase_return exprBase() throws RecognitionException {
        WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        Token VARIABLE56=null;
        Token SYMBOL57=null;
        Token char_literal58=null;
        Token string_literal59=null;
        Token char_literal61=null;
        Token char_literal62=null;
        Token string_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token string_literal67=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token string_literal71=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token SYMBOL75=null;
        Token char_literal77=null;
        WhileParser.exprBase_return exprBase60 = null;

        WhileParser.exprBase_return exprBase64 = null;

        WhileParser.exprBase_return exprBase68 = null;

        WhileParser.exprBase_return exprBase72 = null;

        WhileParser.exprBase_return exprBase76 = null;


        CommonTree string_literal55_tree=null;
        CommonTree VARIABLE56_tree=null;
        CommonTree SYMBOL57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree SYMBOL75_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:92:5: ( 'nil' -> NIL | VARIABLE | SYMBOL | '(' 'cons' ( exprBase )* ')' -> ^( CONS ( exprBase )* ) | '(' 'list' ( exprBase )* ')' -> ^( LIST ( exprBase )* ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL ( exprBase )* ')' -> ^( CALL SYMBOL ( exprBase )* ) )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:92:9: 'nil'
                    {
                    string_literal55=(Token)match(input,47,FOLLOW_47_in_exprBase843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:9: -> NIL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:94:9: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE56=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprBase865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARIABLE56_tree = (CommonTree)adaptor.create(VARIABLE56);
                    adaptor.addChild(root_0, VARIABLE56_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:95:9: SYMBOL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SYMBOL57=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SYMBOL57_tree = (CommonTree)adaptor.create(SYMBOL57);
                    adaptor.addChild(root_0, SYMBOL57_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:96:9: '(' 'cons' ( exprBase )* ')'
                    {
                    char_literal58=(Token)match(input,48,FOLLOW_48_in_exprBase885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal58);

                    string_literal59=(Token)match(input,49,FOLLOW_49_in_exprBase887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(string_literal59);

                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:96:20: ( exprBase )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=SYMBOL && LA11_0<=VARIABLE)||(LA11_0>=47 && LA11_0<=48)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:0:0: exprBase
                    	    {
                    	    pushFollow(FOLLOW_exprBase_in_exprBase889);
                    	    exprBase60=exprBase();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exprBase.add(exprBase60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    char_literal61=(Token)match(input,50,FOLLOW_50_in_exprBase892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal61);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:9: -> ^( CONS ( exprBase )* )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:97:12: ^( CONS ( exprBase )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONS, "CONS"), root_1);

                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:97:19: ( exprBase )*
                        while ( stream_exprBase.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprBase.nextTree());

                        }
                        stream_exprBase.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:98:9: '(' 'list' ( exprBase )* ')'
                    {
                    char_literal62=(Token)match(input,48,FOLLOW_48_in_exprBase919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal62);

                    string_literal63=(Token)match(input,51,FOLLOW_51_in_exprBase921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(string_literal63);

                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:98:20: ( exprBase )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=SYMBOL && LA12_0<=VARIABLE)||(LA12_0>=47 && LA12_0<=48)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:0:0: exprBase
                    	    {
                    	    pushFollow(FOLLOW_exprBase_in_exprBase923);
                    	    exprBase64=exprBase();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exprBase.add(exprBase64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    char_literal65=(Token)match(input,50,FOLLOW_50_in_exprBase926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal65);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:9: -> ^( LIST ( exprBase )* )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:99:12: ^( LIST ( exprBase )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);

                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:99:19: ( exprBase )*
                        while ( stream_exprBase.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprBase.nextTree());

                        }
                        stream_exprBase.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:100:9: '(' 'hd' exprBase ')'
                    {
                    char_literal66=(Token)match(input,48,FOLLOW_48_in_exprBase953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal66);

                    string_literal67=(Token)match(input,52,FOLLOW_52_in_exprBase955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(string_literal67);

                    pushFollow(FOLLOW_exprBase_in_exprBase957);
                    exprBase68=exprBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprBase.add(exprBase68.getTree());
                    char_literal69=(Token)match(input,50,FOLLOW_50_in_exprBase959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal69);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 101:9: -> ^( HD exprBase )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:101:12: ^( HD exprBase )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HD, "HD"), root_1);

                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:102:9: '(' 'tl' exprBase ')'
                    {
                    char_literal70=(Token)match(input,48,FOLLOW_48_in_exprBase985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal70);

                    string_literal71=(Token)match(input,53,FOLLOW_53_in_exprBase987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(string_literal71);

                    pushFollow(FOLLOW_exprBase_in_exprBase989);
                    exprBase72=exprBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprBase.add(exprBase72.getTree());
                    char_literal73=(Token)match(input,50,FOLLOW_50_in_exprBase991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal73);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:9: -> ^( TL exprBase )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:103:12: ^( TL exprBase )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TL, "TL"), root_1);

                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:104:9: '(' SYMBOL ( exprBase )* ')'
                    {
                    char_literal74=(Token)match(input,48,FOLLOW_48_in_exprBase1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal74);

                    SYMBOL75=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase1019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL75);

                    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:104:20: ( exprBase )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=SYMBOL && LA13_0<=VARIABLE)||(LA13_0>=47 && LA13_0<=48)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:0:0: exprBase
                    	    {
                    	    pushFollow(FOLLOW_exprBase_in_exprBase1021);
                    	    exprBase76=exprBase();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exprBase.add(exprBase76.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    char_literal77=(Token)match(input,50,FOLLOW_50_in_exprBase1024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal77);



                    // AST REWRITE
                    // elements: SYMBOL, exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 105:9: -> ^( CALL SYMBOL ( exprBase )* )
                    {
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:105:12: ^( CALL SYMBOL ( exprBase )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_SYMBOL.nextNode());
                        // C:\\Users\\Alexis\\OneDrive\\Cours\\INFO-2\\TLS\\Projet_TLC\\Frontend\\While.g:105:26: ( exprBase )*
                        while ( stream_exprBase.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprBase.nextTree());

                        }
                        stream_exprBase.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\30\3\uffff\1\30\5\uffff";
    static final String DFA14_maxS =
        "\1\60\3\uffff\1\65\5\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\2\25\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\11\30\uffff\1\5\1\uffff\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "91:1: exprBase : ( 'nil' -> NIL | VARIABLE | SYMBOL | '(' 'cons' ( exprBase )* ')' -> ^( CONS ( exprBase )* ) | '(' 'list' ( exprBase )* ')' -> ^( LIST ( exprBase )* ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL ( exprBase )* ')' -> ^( CALL SYMBOL ( exprBase )* ) );";
        }
    }
 

    public static final BitSet FOLLOW_function_in_program206 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EOF_in_program209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_function245 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SYMBOL_in_function247 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_function249 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_function251 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_input_in_function253 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function255 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_function257 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function259 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function261 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_output_in_function263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_input305 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_input308 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_input310 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_VARIABLE_in_output350 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_output353 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_output355 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_command_in_commands393 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_commands396 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_command_in_commands398 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34_in_command436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command458 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_command460 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_exprs_in_command462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_command490 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_expression_in_command492 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_command494 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command498 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_command501 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command505 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_command509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_command542 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_expression_in_command544 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command546 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command548 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_command578 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_expression_in_command580 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command582 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command584 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_command614 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_command616 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command618 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_expression_in_command620 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command622 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command624 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_vars665 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_vars668 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_vars670 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_expression_in_exprs708 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_exprs711 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_expression_in_exprs713 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_exprBase_in_expression753 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_expression757 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_exprBase_in_expression761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprBase843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_exprBase865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_exprBase875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase885 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase887 = new BitSet(new long[]{0x0005800003000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase889 = new BitSet(new long[]{0x0005800003000000L});
    public static final BitSet FOLLOW_50_in_exprBase892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase919 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase921 = new BitSet(new long[]{0x0005800003000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase923 = new BitSet(new long[]{0x0005800003000000L});
    public static final BitSet FOLLOW_50_in_exprBase926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase953 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase955 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase957 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprBase959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase985 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase987 = new BitSet(new long[]{0x0001800003000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase989 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprBase991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase1017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SYMBOL_in_exprBase1019 = new BitSet(new long[]{0x0005800003000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase1021 = new BitSet(new long[]{0x0005800003000000L});
    public static final BitSet FOLLOW_50_in_exprBase1024 = new BitSet(new long[]{0x0000000000000002L});

}