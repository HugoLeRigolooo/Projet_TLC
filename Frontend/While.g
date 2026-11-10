grammar While;

options {
    output = AST;
    ASTLabelType = CommonTree;
    backtrack = true;
}

tokens {
    // Racines pour l'AST
    PROGRAM;
    FUNCTION;
    INPUTS;
    OUTPUTS;
    COMMANDS;
    ASSIGN;
    VARS;
    EXPRS;
    IF;
    WHILE;
    FOR;
    FOREACH;
    EQUAL;
    CALL;
    CONS;
    LIST;
    HD;
    TL;
    NOP;
    NIL;
}

// PARSER

program
    :   function+ EOF
        -> ^(PROGRAM function+)
    ;

function
    :   'function' SYMBOL ':' 'read' input '%' commands '%' 'write' output
        -> ^(FUNCTION SYMBOL input commands output)
    ;

input
    :   (VARIABLE (',' VARIABLE)*)?
        -> ^(INPUTS VARIABLE*)
    ;

output
    :   VARIABLE (',' VARIABLE)*
        -> ^(OUTPUTS VARIABLE+)
    ;

commands
    :   command (';' command)*
        -> ^(COMMANDS command+)
    ;

command
    :   'nop'
        -> NOP
    |   vars ':=' exprs
        -> ^(ASSIGN vars exprs)
    |   'if' expression 'then' t=commands ('else' e=commands)? 'fi'
        -> ^(IF expression $t $e?)
    |   'while' expression 'do' commands 'od'
        -> ^(WHILE expression commands)
    |   'for' expression 'do' commands 'od'
        -> ^(FOR expression commands)
    |   'foreach' VARIABLE 'in' expression 'do' commands 'od'
        -> ^(FOREACH VARIABLE expression commands)
    ;

vars
    :   VARIABLE (',' VARIABLE)*
        -> ^(VARS VARIABLE+)
    ;

exprs
    :   expression (',' expression)*
        -> ^(EXPRS expression+)
    ;

expression
    :   eb1=exprBase ( '=?' eb2=exprBase -> ^(EQUAL $eb1 $eb2)
                     | -> $eb1
                     )
    ;

exprBase
    :   'nil'
        -> NIL
    |   VARIABLE
    |   SYMBOL
    |   '(' 'cons' exprBase* ')'
        -> ^(CONS exprBase*)
    |   '(' 'list' exprBase* ')'
        -> ^(LIST exprBase*)
    |   '(' 'hd' exprBase ')'
        -> ^(HD exprBase)
    |   '(' 'tl' exprBase ')'
        -> ^(TL exprBase)
    |   '(' SYMBOL exprBase* ')'
        -> ^(CALL SYMBOL exprBase*)
    ;


// LEXER

VARIABLE
    :   'A'..'Z' ('a'..'z' | 'A'..'Z' | '0'..'9')* ('!' | '?')?
    ;

SYMBOL
    :   'a'..'z' ('a'..'z' | 'A'..'Z' | '0'..'9')* ('!' | '?')?
    ;

WS
    :   (' ' | '\t' | '\r' | '\n')+ { $channel=HIDDEN; }
    ;