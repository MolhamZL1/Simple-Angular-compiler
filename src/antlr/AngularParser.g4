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
       | ifStatement
       |   blockStatement
       | loopStatement
       | expressionStatement
        ;

        loopStatement
            :forStatement


            | whileStatement
            | doWhileStatement
            | forOfStatement

           // | angularForStatement
            ;



        // Standard for loop
        forStatement
            : FOR LPAREN (variableDeclaration | expressionStatement | SEMI)
              expression? SEMI
              expression? RPAREN statement
            ;

        // While loop
        whileStatement
            : WHILE LPAREN expression RPAREN statement
            ;

        // Do-while loop
        doWhileStatement
            : DO statement WHILE LPAREN expression RPAREN SEMI?
            ;

        // For-of loop (iterables)
        forOfStatement
            : FOR LPAREN (VAR | LET | CONST) IDENTIFIER OF expression RPAREN statement
            ;

//        // Angular *ngFor template
//        angularForStatement
//            : '*ngFor' EQUAL '"' LET IDENTIFIER OF expression
//              (SEMI LET IDENTIFIER EQUAL IDENTIFIER)* '"'
//            ;

        ifStatement
            : IF LPAREN expression RPAREN statement (ELSE statement)?
            ;

        blockStatement
            : LCURLY statement* RCURLY
            ;

variableDeclaration
    : (CONST | LET | VAR) IDENTIFIER typeAnnotation? (EQUAL expression)? (AS IDENTIFIER)? eos
    ;
    expressionStatement: expression eos;

expression
    : primary                                                                                 # PrimaryExpr
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
    | expression ((MINUS MINUS)|(PLUS PLUS))                                                  # PostFixExpr
    |((MINUS MINUS)|(PLUS PLUS)) expression                                                   # PreFixExpr
   // | templateLiteral                                                                         # TemplateExpr
    ;

    primary
        : literal                            # LiteralExpr
        | IDENTIFIER                         # IdentifierExpr
        | arrayLiteral                       # ArrayLiteralExpr
        | objectLiteral                      # ObjectLiteralExpr
        ;

arrayLiteral : LSBRACKET (expression (COMMA expression)*)? RSBRACKET;

objectLiteral : LCURLY (propertyAssignment (COMMA propertyAssignment)*)? RCURLY;

propertyAssignment : IDENTIFIER COLON expression;

loopControlStatement
    : BREAK
    | CONTINUE
    | BREAK IDENTIFIER  // labeled break
    | CONTINUE IDENTIFIER  // labeled continue
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
