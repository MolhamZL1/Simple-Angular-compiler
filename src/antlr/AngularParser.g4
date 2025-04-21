parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    :(importStatement
|statement
     )* EOF;
//| componentDeclaration | classDeclaration | functionDeclaration
importStatement
    : importDefault
    | importNamespace
    | importNamed
    | importDefaultWithNamed
    | importDefaultWithNamespace
    | importSideEffect
    ;

importSideEffect: IMPORT STRING eos;

importDefault: IMPORT IDENTIFIER FROM STRING eos;

importNamespace: IMPORT STAR AS IDENTIFIER FROM STRING eos;

importNamed: IMPORT importSpecifier FROM STRING eos;

importDefaultWithNamed: IMPORT IDENTIFIER COMMA importSpecifier FROM STRING eos;

importDefaultWithNamespace: IMPORT IDENTIFIER COMMA STAR AS IDENTIFIER FROM STRING eos;

importSpecifier: LCURLY importList RCURLY;

importList: importItem (COMMA importItem)*;

importItem: IDENTIFIER (AS IDENTIFIER)?;

statement
        : variableDeclaration
//        | objectDecleration
//        | ifStatement
//        | forStatement
//        | whileStatement
//        | expressionStatement
        ;

variableDeclaration
    : (CONST | LET | VAR) IDENTIFIER typeAnnotation? (EQUAL expression)? (AS IDENTIFIER)? eos
    ;
expression
    : literal                                                                                 # LiteralExpr
    | IDENTIFIER                                                                              # IdentifierExpr
    | expression DOT IDENTIFIER                                                               # MemberDotExpr
    | expression LSBRACKET expression RSBRACKET                                               # MemberIndexExpr
    | expression LPAREN args? RPAREN                                                          # CallExpr
    | expression QUESITIONMARK DOT IDENTIFIER                                                 # SafeNavExpr
    | expression QUESITIONMARK RSBRACKET expression RSBRACKET                                 # SafeIndexExpr
    | (MINUS|PLUS|NOT) expression                                                             # UnaryExpr
    | expression (STAR|DIVIDE|MODULO) expression                                              # MultiplicativeExpr
    | expression (PLUS|MINUS) expression                                                      # AdditiveExpr
    | expression (LESS_THAN|GREATER_THAN|LESS_THAN_OR_EQUAL|GREATER_THAN_OR_EQUAL) expression # RelationalExpr
    | expression (EQUAL_TO|NOT_EQUAL|EQUAL_TO3|NOT_EQUAL2) expression                         # EqualityExpr
    | expression AND expression                                                               # LogicalAndExpr
    | expression OR expression                                                                # LogicalOrExpr
    | expression EQUAL expression                                                             # AssignmentExpr
    | expression QUESITIONMARK expression COLON expression                                    # TernaryExpr
    | LPAREN expression RPAREN                                                                # ParenthesizedExpr
   // | templateLiteral                                                                         # TemplateExpr
    ;

// القواعد المساعدة
args : expression (COMMA expression)*;

literal : number | STRING | Boolean | Null | Undefined;

number:Integer|Float;

//modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;


typeAnnotation
    : COLON type
    ;

type
    : STRINGKEYWORD | NUMBER | BOOLEANKEYWORD | ANY
    ;

eos: SEMI?;
