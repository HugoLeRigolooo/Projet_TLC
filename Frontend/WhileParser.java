// $ANTLR 3.5.3 While.g 2026-11-16 10:10:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WhileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CALL", "COMMANDS", 
		"CONS", "EQUAL", "EXPRS", "FOR", "FOREACH", "FUNCTION", "HD", "IF", "INPUTS", 
		"LIST", "NIL", "NOP", "OUTPUTS", "PROGRAM", "SYMBOL", "TL", "VARIABLE", 
		"VARS", "WHILE", "WS", "'%'", "'('", "')'", "','", "':'", "':='", "';'", 
		"'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function'", 
		"'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", "'read'", 
		"'then'", "'tl'", "'while'", "'write'"
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
	public static final int ASSIGN=4;
	public static final int CALL=5;
	public static final int COMMANDS=6;
	public static final int CONS=7;
	public static final int EQUAL=8;
	public static final int EXPRS=9;
	public static final int FOR=10;
	public static final int FOREACH=11;
	public static final int FUNCTION=12;
	public static final int HD=13;
	public static final int IF=14;
	public static final int INPUTS=15;
	public static final int LIST=16;
	public static final int NIL=17;
	public static final int NOP=18;
	public static final int OUTPUTS=19;
	public static final int PROGRAM=20;
	public static final int SYMBOL=21;
	public static final int TL=22;
	public static final int VARIABLE=23;
	public static final int VARS=24;
	public static final int WHILE=25;
	public static final int WS=26;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

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
	@Override public String[] getTokenNames() { return WhileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "While.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// While.g:35:1: program : ( function )+ EOF -> ^( PROGRAM ( function )+ ) ;
	public final WhileParser.program_return program() throws RecognitionException {
		WhileParser.program_return retval = new WhileParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope function1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// While.g:36:5: ( ( function )+ EOF -> ^( PROGRAM ( function )+ ) )
			// While.g:36:9: ( function )+ EOF
			{
			// While.g:36:9: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==41) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// While.g:36:9: function
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
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:9: -> ^( PROGRAM ( function )+ )
			{
				// While.g:37:12: ^( PROGRAM ( function )+ )
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


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// While.g:40:1: function : 'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output -> ^( FUNCTION SYMBOL input commands output ) ;
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
		ParserRuleReturnScope input7 =null;
		ParserRuleReturnScope commands9 =null;
		ParserRuleReturnScope output12 =null;

		CommonTree string_literal3_tree=null;
		CommonTree SYMBOL4_tree=null;
		CommonTree char_literal5_tree=null;
		CommonTree string_literal6_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree char_literal10_tree=null;
		CommonTree string_literal11_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// While.g:41:5: ( 'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output -> ^( FUNCTION SYMBOL input commands output ) )
			// While.g:41:9: 'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output
			{
			string_literal3=(Token)match(input,41,FOLLOW_41_in_function245); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(string_literal3);

			SYMBOL4=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function247); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL4);

			char_literal5=(Token)match(input,31,FOLLOW_31_in_function249); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_31.add(char_literal5);

			string_literal6=(Token)match(input,49,FOLLOW_49_in_function251); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_49.add(string_literal6);

			pushFollow(FOLLOW_input_in_function253);
			input7=input();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_input.add(input7.getTree());
			char_literal8=(Token)match(input,27,FOLLOW_27_in_function255); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_27.add(char_literal8);

			pushFollow(FOLLOW_commands_in_function257);
			commands9=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands9.getTree());
			char_literal10=(Token)match(input,27,FOLLOW_27_in_function259); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_27.add(char_literal10);

			string_literal11=(Token)match(input,53,FOLLOW_53_in_function261); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(string_literal11);

			pushFollow(FOLLOW_output_in_function263);
			output12=output();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_output.add(output12.getTree());

			// AST REWRITE
			// elements: SYMBOL, output, commands, input
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 42:9: -> ^( FUNCTION SYMBOL input commands output )
			{
				// While.g:42:12: ^( FUNCTION SYMBOL input commands output )
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


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class input_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "input"
	// While.g:45:1: input : ( VARIABLE ( ',' VARIABLE )* )? -> ^( INPUTS ( VARIABLE )* ) ;
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");

		try {
			// While.g:46:5: ( ( VARIABLE ( ',' VARIABLE )* )? -> ^( INPUTS ( VARIABLE )* ) )
			// While.g:46:9: ( VARIABLE ( ',' VARIABLE )* )?
			{
			// While.g:46:9: ( VARIABLE ( ',' VARIABLE )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VARIABLE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// While.g:46:10: VARIABLE ( ',' VARIABLE )*
					{
					VARIABLE13=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE13);

					// While.g:46:19: ( ',' VARIABLE )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==30) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// While.g:46:20: ',' VARIABLE
							{
							char_literal14=(Token)match(input,30,FOLLOW_30_in_input308); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_30.add(char_literal14);

							VARIABLE15=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input310); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE15);

							}
							break;

						default :
							break loop2;
						}
					}

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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 47:9: -> ^( INPUTS ( VARIABLE )* )
			{
				// While.g:47:12: ^( INPUTS ( VARIABLE )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INPUTS, "INPUTS"), root_1);
				// While.g:47:21: ( VARIABLE )*
				while ( stream_VARIABLE.hasNext() ) {
					adaptor.addChild(root_1, stream_VARIABLE.nextNode());
				}
				stream_VARIABLE.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class output_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "output"
	// While.g:50:1: output : VARIABLE ( ',' VARIABLE )* -> ^( OUTPUTS ( VARIABLE )+ ) ;
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");

		try {
			// While.g:51:5: ( VARIABLE ( ',' VARIABLE )* -> ^( OUTPUTS ( VARIABLE )+ ) )
			// While.g:51:9: VARIABLE ( ',' VARIABLE )*
			{
			VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output350); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE16);

			// While.g:51:18: ( ',' VARIABLE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==30) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// While.g:51:19: ',' VARIABLE
					{
					char_literal17=(Token)match(input,30,FOLLOW_30_in_output353); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_30.add(char_literal17);

					VARIABLE18=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output355); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE18);

					}
					break;

				default :
					break loop4;
				}
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 52:9: -> ^( OUTPUTS ( VARIABLE )+ )
			{
				// While.g:52:12: ^( OUTPUTS ( VARIABLE )+ )
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


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// While.g:55:1: commands : command ( ';' command )* -> ^( COMMANDS ( command )+ ) ;
	public final WhileParser.commands_return commands() throws RecognitionException {
		WhileParser.commands_return retval = new WhileParser.commands_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal20=null;
		ParserRuleReturnScope command19 =null;
		ParserRuleReturnScope command21 =null;

		CommonTree char_literal20_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// While.g:56:5: ( command ( ';' command )* -> ^( COMMANDS ( command )+ ) )
			// While.g:56:9: command ( ';' command )*
			{
			pushFollow(FOLLOW_command_in_commands393);
			command19=command();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_command.add(command19.getTree());
			// While.g:56:17: ( ';' command )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==33) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// While.g:56:18: ';' command
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
			}


			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 57:9: -> ^( COMMANDS ( command )+ )
			{
				// While.g:57:12: ^( COMMANDS ( command )+ )
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


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "command"
	// While.g:60:1: command : ( 'nop' -> NOP | vars ':=' exprs -> ^( ASSIGN vars exprs ) | 'if' expression 'then' t= commands ( 'else' e= commands )? 'fi' -> ^( IF expression $t ( $e)? ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) | 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) | 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH VARIABLE expression commands ) );
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
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope vars23 =null;
		ParserRuleReturnScope exprs25 =null;
		ParserRuleReturnScope expression27 =null;
		ParserRuleReturnScope expression32 =null;
		ParserRuleReturnScope commands34 =null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope commands39 =null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope commands46 =null;

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
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// While.g:61:5: ( 'nop' -> NOP | vars ':=' exprs -> ^( ASSIGN vars exprs ) | 'if' expression 'then' t= commands ( 'else' e= commands )? 'fi' -> ^( IF expression $t ( $e)? ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) | 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) | 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH VARIABLE expression commands ) )
			int alt7=6;
			switch ( input.LA(1) ) {
			case 47:
				{
				alt7=1;
				}
				break;
			case VARIABLE:
				{
				alt7=2;
				}
				break;
			case 43:
				{
				alt7=3;
				}
				break;
			case 52:
				{
				alt7=4;
				}
				break;
			case 39:
				{
				alt7=5;
				}
				break;
			case 40:
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
					// While.g:61:9: 'nop'
					{
					string_literal22=(Token)match(input,47,FOLLOW_47_in_command436); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(string_literal22);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 62:9: -> NOP
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(NOP, "NOP"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// While.g:63:9: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command458);
					vars23=vars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_vars.add(vars23.getTree());
					string_literal24=(Token)match(input,32,FOLLOW_32_in_command460); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_32.add(string_literal24);

					pushFollow(FOLLOW_exprs_in_command462);
					exprs25=exprs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprs.add(exprs25.getTree());

					// AST REWRITE
					// elements: exprs, vars
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 64:9: -> ^( ASSIGN vars exprs )
					{
						// While.g:64:12: ^( ASSIGN vars exprs )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						adaptor.addChild(root_1, stream_vars.nextTree());
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// While.g:65:9: 'if' expression 'then' t= commands ( 'else' e= commands )? 'fi'
					{
					string_literal26=(Token)match(input,43,FOLLOW_43_in_command490); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_43.add(string_literal26);

					pushFollow(FOLLOW_expression_in_command492);
					expression27=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression27.getTree());
					string_literal28=(Token)match(input,50,FOLLOW_50_in_command494); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(string_literal28);

					pushFollow(FOLLOW_commands_in_command498);
					t=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(t.getTree());
					// While.g:65:43: ( 'else' e= commands )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==37) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// While.g:65:44: 'else' e= commands
							{
							string_literal29=(Token)match(input,37,FOLLOW_37_in_command501); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_37.add(string_literal29);

							pushFollow(FOLLOW_commands_in_command505);
							e=commands();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_commands.add(e.getTree());
							}
							break;

					}

					string_literal30=(Token)match(input,38,FOLLOW_38_in_command509); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_38.add(string_literal30);


					// AST REWRITE
					// elements: t, e, expression
					// token labels: 
					// rule labels: t, e, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 66:9: -> ^( IF expression $t ( $e)? )
					{
						// While.g:66:12: ^( IF expression $t ( $e)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_t.nextTree());
						// While.g:66:32: ( $e)?
						if ( stream_e.hasNext() ) {
							adaptor.addChild(root_1, stream_e.nextTree());
						}
						stream_e.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// While.g:67:9: 'while' expression 'do' commands 'od'
					{
					string_literal31=(Token)match(input,52,FOLLOW_52_in_command542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_52.add(string_literal31);

					pushFollow(FOLLOW_expression_in_command544);
					expression32=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
					string_literal33=(Token)match(input,36,FOLLOW_36_in_command546); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_36.add(string_literal33);

					pushFollow(FOLLOW_commands_in_command548);
					commands34=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(commands34.getTree());
					string_literal35=(Token)match(input,48,FOLLOW_48_in_command550); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_48.add(string_literal35);


					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 68:9: -> ^( WHILE expression commands )
					{
						// While.g:68:12: ^( WHILE expression commands )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// While.g:69:9: 'for' expression 'do' commands 'od'
					{
					string_literal36=(Token)match(input,39,FOLLOW_39_in_command578); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_39.add(string_literal36);

					pushFollow(FOLLOW_expression_in_command580);
					expression37=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());
					string_literal38=(Token)match(input,36,FOLLOW_36_in_command582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_36.add(string_literal38);

					pushFollow(FOLLOW_commands_in_command584);
					commands39=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(commands39.getTree());
					string_literal40=(Token)match(input,48,FOLLOW_48_in_command586); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_48.add(string_literal40);


					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 70:9: -> ^( FOR expression commands )
					{
						// While.g:70:12: ^( FOR expression commands )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// While.g:71:9: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					string_literal41=(Token)match(input,40,FOLLOW_40_in_command614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_40.add(string_literal41);

					VARIABLE42=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE42);

					string_literal43=(Token)match(input,44,FOLLOW_44_in_command618); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(string_literal43);

					pushFollow(FOLLOW_expression_in_command620);
					expression44=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression44.getTree());
					string_literal45=(Token)match(input,36,FOLLOW_36_in_command622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_36.add(string_literal45);

					pushFollow(FOLLOW_commands_in_command624);
					commands46=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(commands46.getTree());
					string_literal47=(Token)match(input,48,FOLLOW_48_in_command626); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_48.add(string_literal47);


					// AST REWRITE
					// elements: expression, VARIABLE, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 72:9: -> ^( FOREACH VARIABLE expression commands )
					{
						// While.g:72:12: ^( FOREACH VARIABLE expression commands )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class vars_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// While.g:75:1: vars : VARIABLE ( ',' VARIABLE )* -> ^( VARS ( VARIABLE )+ ) ;
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");

		try {
			// While.g:76:5: ( VARIABLE ( ',' VARIABLE )* -> ^( VARS ( VARIABLE )+ ) )
			// While.g:76:9: VARIABLE ( ',' VARIABLE )*
			{
			VARIABLE48=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars665); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE48);

			// While.g:76:18: ( ',' VARIABLE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==30) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// While.g:76:19: ',' VARIABLE
					{
					char_literal49=(Token)match(input,30,FOLLOW_30_in_vars668); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_30.add(char_literal49);

					VARIABLE50=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE50);

					}
					break;

				default :
					break loop8;
				}
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:9: -> ^( VARS ( VARIABLE )+ )
			{
				// While.g:77:12: ^( VARS ( VARIABLE )+ )
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


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// While.g:80:1: exprs : expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) ;
	public final WhileParser.exprs_return exprs() throws RecognitionException {
		WhileParser.exprs_return retval = new WhileParser.exprs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal52=null;
		ParserRuleReturnScope expression51 =null;
		ParserRuleReturnScope expression53 =null;

		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// While.g:81:5: ( expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) )
			// While.g:81:9: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs708);
			expression51=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression51.getTree());
			// While.g:81:20: ( ',' expression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==30) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// While.g:81:21: ',' expression
					{
					char_literal52=(Token)match(input,30,FOLLOW_30_in_exprs711); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_30.add(char_literal52);

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
			}


			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 82:9: -> ^( EXPRS ( expression )+ )
			{
				// While.g:82:12: ^( EXPRS ( expression )+ )
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


			retval.tree = root_0;
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// While.g:85:1: expression : eb1= exprBase ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1) ;
	public final WhileParser.expression_return expression() throws RecognitionException {
		WhileParser.expression_return retval = new WhileParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal54=null;
		ParserRuleReturnScope eb1 =null;
		ParserRuleReturnScope eb2 =null;

		CommonTree string_literal54_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// While.g:86:5: (eb1= exprBase ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1) )
			// While.g:86:9: eb1= exprBase ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1)
			{
			pushFollow(FOLLOW_exprBase_in_expression753);
			eb1=exprBase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprBase.add(eb1.getTree());
			// While.g:86:22: ( '=?' eb2= exprBase -> ^( EQUAL $eb1 $eb2) | -> $eb1)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==34) ) {
				alt10=1;
			}
			else if ( (LA10_0==EOF||LA10_0==27||LA10_0==30||LA10_0==33||(LA10_0 >= 36 && LA10_0 <= 38)||LA10_0==48||LA10_0==50) ) {
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
					// While.g:86:24: '=?' eb2= exprBase
					{
					string_literal54=(Token)match(input,34,FOLLOW_34_in_expression757); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_34.add(string_literal54);

					pushFollow(FOLLOW_exprBase_in_expression761);
					eb2=exprBase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprBase.add(eb2.getTree());

					// AST REWRITE
					// elements: eb1, eb2
					// token labels: 
					// rule labels: eb2, eb1, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_eb2=new RewriteRuleSubtreeStream(adaptor,"rule eb2",eb2!=null?eb2.getTree():null);
					RewriteRuleSubtreeStream stream_eb1=new RewriteRuleSubtreeStream(adaptor,"rule eb1",eb1!=null?eb1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 86:42: -> ^( EQUAL $eb1 $eb2)
					{
						// While.g:86:45: ^( EQUAL $eb1 $eb2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EQUAL, "EQUAL"), root_1);
						adaptor.addChild(root_1, stream_eb1.nextTree());
						adaptor.addChild(root_1, stream_eb2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// While.g:87:24: 
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
					RewriteRuleSubtreeStream stream_eb1=new RewriteRuleSubtreeStream(adaptor,"rule eb1",eb1!=null?eb1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 87:24: -> $eb1
					{
						adaptor.addChild(root_0, stream_eb1.nextTree());
					}


					retval.tree = root_0;
					}

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class exprBase_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// While.g:91:1: exprBase : ( 'nil' -> NIL | VARIABLE | SYMBOL | '(' 'cons' ( exprBase )* ')' -> ^( CONS ( exprBase )* ) | '(' 'list' ( exprBase )* ')' -> ^( LIST ( exprBase )* ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL ( exprBase )* ')' -> ^( CALL SYMBOL ( exprBase )* ) );
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
		ParserRuleReturnScope exprBase60 =null;
		ParserRuleReturnScope exprBase64 =null;
		ParserRuleReturnScope exprBase68 =null;
		ParserRuleReturnScope exprBase72 =null;
		ParserRuleReturnScope exprBase76 =null;

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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// While.g:92:5: ( 'nil' -> NIL | VARIABLE | SYMBOL | '(' 'cons' ( exprBase )* ')' -> ^( CONS ( exprBase )* ) | '(' 'list' ( exprBase )* ')' -> ^( LIST ( exprBase )* ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL ( exprBase )* ')' -> ^( CALL SYMBOL ( exprBase )* ) )
			int alt14=8;
			switch ( input.LA(1) ) {
			case 46:
				{
				alt14=1;
				}
				break;
			case VARIABLE:
				{
				alt14=2;
				}
				break;
			case SYMBOL:
				{
				alt14=3;
				}
				break;
			case 28:
				{
				switch ( input.LA(2) ) {
				case 35:
					{
					alt14=4;
					}
					break;
				case 45:
					{
					alt14=5;
					}
					break;
				case 42:
					{
					alt14=6;
					}
					break;
				case 51:
					{
					alt14=7;
					}
					break;
				case SYMBOL:
					{
					alt14=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// While.g:92:9: 'nil'
					{
					string_literal55=(Token)match(input,46,FOLLOW_46_in_exprBase843); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_46.add(string_literal55);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 93:9: -> NIL
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// While.g:94:9: VARIABLE
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
					// While.g:95:9: SYMBOL
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
					// While.g:96:9: '(' 'cons' ( exprBase )* ')'
					{
					char_literal58=(Token)match(input,28,FOLLOW_28_in_exprBase885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal58);

					string_literal59=(Token)match(input,35,FOLLOW_35_in_exprBase887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_35.add(string_literal59);

					// While.g:96:20: ( exprBase )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==SYMBOL||LA11_0==VARIABLE||LA11_0==28||LA11_0==46) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// While.g:96:20: exprBase
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
					}

					char_literal61=(Token)match(input,29,FOLLOW_29_in_exprBase892); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal61);


					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 97:9: -> ^( CONS ( exprBase )* )
					{
						// While.g:97:12: ^( CONS ( exprBase )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONS, "CONS"), root_1);
						// While.g:97:19: ( exprBase )*
						while ( stream_exprBase.hasNext() ) {
							adaptor.addChild(root_1, stream_exprBase.nextTree());
						}
						stream_exprBase.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// While.g:98:9: '(' 'list' ( exprBase )* ')'
					{
					char_literal62=(Token)match(input,28,FOLLOW_28_in_exprBase919); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal62);

					string_literal63=(Token)match(input,45,FOLLOW_45_in_exprBase921); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_45.add(string_literal63);

					// While.g:98:20: ( exprBase )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==SYMBOL||LA12_0==VARIABLE||LA12_0==28||LA12_0==46) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// While.g:98:20: exprBase
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
					}

					char_literal65=(Token)match(input,29,FOLLOW_29_in_exprBase926); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal65);


					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 99:9: -> ^( LIST ( exprBase )* )
					{
						// While.g:99:12: ^( LIST ( exprBase )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);
						// While.g:99:19: ( exprBase )*
						while ( stream_exprBase.hasNext() ) {
							adaptor.addChild(root_1, stream_exprBase.nextTree());
						}
						stream_exprBase.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// While.g:100:9: '(' 'hd' exprBase ')'
					{
					char_literal66=(Token)match(input,28,FOLLOW_28_in_exprBase953); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal66);

					string_literal67=(Token)match(input,42,FOLLOW_42_in_exprBase955); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(string_literal67);

					pushFollow(FOLLOW_exprBase_in_exprBase957);
					exprBase68=exprBase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprBase.add(exprBase68.getTree());
					char_literal69=(Token)match(input,29,FOLLOW_29_in_exprBase959); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal69);


					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 101:9: -> ^( HD exprBase )
					{
						// While.g:101:12: ^( HD exprBase )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HD, "HD"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// While.g:102:9: '(' 'tl' exprBase ')'
					{
					char_literal70=(Token)match(input,28,FOLLOW_28_in_exprBase985); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal70);

					string_literal71=(Token)match(input,51,FOLLOW_51_in_exprBase987); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_51.add(string_literal71);

					pushFollow(FOLLOW_exprBase_in_exprBase989);
					exprBase72=exprBase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprBase.add(exprBase72.getTree());
					char_literal73=(Token)match(input,29,FOLLOW_29_in_exprBase991); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal73);


					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 103:9: -> ^( TL exprBase )
					{
						// While.g:103:12: ^( TL exprBase )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TL, "TL"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// While.g:104:9: '(' SYMBOL ( exprBase )* ')'
					{
					char_literal74=(Token)match(input,28,FOLLOW_28_in_exprBase1017); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal74);

					SYMBOL75=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase1019); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL75);

					// While.g:104:20: ( exprBase )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==SYMBOL||LA13_0==VARIABLE||LA13_0==28||LA13_0==46) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// While.g:104:20: exprBase
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
					}

					char_literal77=(Token)match(input,29,FOLLOW_29_in_exprBase1024); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal77);


					// AST REWRITE
					// elements: exprBase, SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 105:9: -> ^( CALL SYMBOL ( exprBase )* )
					{
						// While.g:105:12: ^( CALL SYMBOL ( exprBase )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						// While.g:105:26: ( exprBase )*
						while ( stream_exprBase.hasNext() ) {
							adaptor.addChild(root_1, stream_exprBase.nextTree());
						}
						stream_exprBase.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprBase"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program206 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_EOF_in_program209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_function245 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_SYMBOL_in_function247 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_function249 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_function251 = new BitSet(new long[]{0x0000000008800000L});
	public static final BitSet FOLLOW_input_in_function253 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_function255 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_commands_in_function257 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_function259 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_function261 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_output_in_function263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input305 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_input308 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_input310 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output350 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_output353 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_output355 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_command_in_commands393 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_commands396 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_command_in_commands398 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_47_in_command436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command458 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_command460 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_exprs_in_command462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_command490 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_expression_in_command492 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command494 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_commands_in_command498 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_37_in_command501 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_commands_in_command505 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command542 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_expression_in_command544 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command546 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_commands_in_command548 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_command578 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_expression_in_command580 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command582 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_commands_in_command584 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_command614 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_command616 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_command618 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_expression_in_command620 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command622 = new BitSet(new long[]{0x0010898000800000L});
	public static final BitSet FOLLOW_commands_in_command624 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars665 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_vars668 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars670 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_expression_in_exprs708 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_exprs711 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_expression_in_exprs713 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_exprBase_in_expression753 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_expression757 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_exprBase_in_expression761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_exprBase843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprBase865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprBase875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_exprBase885 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_exprBase887 = new BitSet(new long[]{0x0000400030A00000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase889 = new BitSet(new long[]{0x0000400030A00000L});
	public static final BitSet FOLLOW_29_in_exprBase892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_exprBase919 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_exprBase921 = new BitSet(new long[]{0x0000400030A00000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase923 = new BitSet(new long[]{0x0000400030A00000L});
	public static final BitSet FOLLOW_29_in_exprBase926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_exprBase953 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_exprBase955 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase957 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_exprBase959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_exprBase985 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_exprBase987 = new BitSet(new long[]{0x0000400010A00000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase989 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_exprBase991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_exprBase1017 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprBase1019 = new BitSet(new long[]{0x0000400030A00000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase1021 = new BitSet(new long[]{0x0000400030A00000L});
	public static final BitSet FOLLOW_29_in_exprBase1024 = new BitSet(new long[]{0x0000000000000002L});
}
