parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    :(
       importStatement
      |componentDeclaration
      |classDeclaration
      |statement
      |methodDeclaration
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

componentDeclaration
    : COMPONENT LPAREN componentMetadata RPAREN
    ;

componentMetadata
    : LCURLY metadataProperty (COMMA metadataProperty)* COMMA? RCURLY
    ;

metadataProperty
    : selectorProperty
    | templateProperty
    | stylesProperty
    | standalone
    | imports
    ;

    standalone:STANDALONE COLON Boolean;

     imports:IMPORTS COLON arrayLiteral;//edit this to list of id

selectorProperty
    : SELECTOR COLON STRING
    ;

templateProperty
    : templateUrl
    | templetHTML
    ;
    templateUrl:TEMPLATEURL COLON STRING;
    templetHTML:TEMPLATE COLON html;
    html:STRING;

stylesProperty
    : styleUrls
 //   | stylesCss
    ;

styleUrls:STYLEURL COLON  (STRING | arrayLiteral);// edit this to list of urls
  //  stylesCss:TEMPLATE COLON STRING;

classDeclaration
    :
     //decoratorList?
      EXPORT?
      ABSTRACT?
      CLASS IDENTIFIER (LESS_THAN IDENTIFIER (EXTENDS IDENTIFIER)?(COMMA IDENTIFIER (EXTENDS IDENTIFIER)?)* GREATER_THAN)?
      (EXTENDS IDENTIFIER)?
      (IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*)?
      classBody
    ;

classBody
    : LCURLY classMember* RCURLY
    ;

classMember
    :
     //decoratorList?
      accessModifier?
      (STATIC | READONLY | ABSTRACT | OVERRIDE)?
      (   propertyDeclaration
        | methodDeclaration
        | variableDeclaration
        | constructorDeclaration
        | accessorDeclaration
        | angularSpecificMember
      )
    ;

    angularSpecificMember
        : inputDeclaration
        | outputDeclaration
        | viewChildDeclaration
        ;

    inputDeclaration
        : INPUT LPAREN (STRING | objectLiteral)?RPAREN
          IDENTIFIER typeAnnotation? (EQUAL expression)? eos
        ;

    outputDeclaration
        : OUTPUT (LPAREN STRING? RPAREN)?
          IDENTIFIER typeAnnotation? EQUAL objectInit eos
        ;

    viewChildDeclaration
        : VIEW_CHILD LPAREN STRING (COMMA objectLiteral)? RPAREN
          IDENTIFIER typeAnnotation? eos
        ;

    accessModifier
        : PUBLIC | PRIVATE | PROTECTED
        ;

// Core class members
propertyDeclaration
    : IDENTIFIER typeAnnotation? (EQUAL expression)? SEMI
    ;

methodDeclaration
    :deafultMethod
    |anonymosMethod
    ;

    deafultMethod: ASYNC? IDENTIFIER LPAREN (parameterList | args)? RPAREN
                   typeAnnotation? (blockStatement | ARROW expressionStatement);

    anonymosMethod:ASYNC? LPAREN (parameterList|args)? RPAREN typeAnnotation? ARROW (blockStatement|expressionStatement);

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN
      ((COLON THIS LPAREN args? RPAREN) | blockStatement)?
    ;

accessorDeclaration
    : (GET | SET) IDENTIFIER LPAREN parameter? RPAREN
      typeAnnotation? (blockStatement | SEMI)
    ;

     parameterList:
               (parameter (COMMA parameter)*)? ;

              parameter:
              IDENTIFIER (typeAnnotation  (EQUAL literal)?)?;




statement
       : variableDeclaration
       | ifStatement
       | blockStatement
       | loopStatement
       | loopControlStatement
       | expressionStatement
       ;

loopStatement
            :forStatement
            | whileStatement
            | doWhileStatement
            | forOfStatement
           // | angularForStatement
            ;


forStatement
    : FOR LPAREN (variableDeclaration | expressionStatement | SEMI)
      expression? SEMI
      expression? RPAREN statement
    ;


        whileStatement
            : WHILE LPAREN expression RPAREN statement
            ;


        doWhileStatement
            : DO statement WHILE LPAREN expression RPAREN SEMI?
            ;


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
    :EXPORT? (CONST | LET | VAR) IDENTIFIER typeAnnotation? (EQUAL expression)? (AS IDENTIFIER)? eos
    ;

expressionStatement: expression eos;

expression
    : anonymosMethod                                                                          # AnounymusMethodExpr
    | THIS                                                                                    # ThisExpr
    | expression DOT expression                                                               # MemberDotExpr
    | expression LSBRACKET expression RSBRACKET                                               # MemberIndexExpr
    | expression LPAREN args? RPAREN                                                          # CallExpr
    | expression QUESITIONMARK DOT IDENTIFIER                                                 # SafeNavExpr
    | expression QUESITIONMARK RSBRACKET expression RSBRACKET                                 # SafeIndexExpr//
    | (MINUS|PLUS|NOT) expression                                                             # UnaryExpr
    | expression (STAR|DIVIDE|MODULO|PLUS|MINUS) expression                                   # ArthmaticOpExpr
    | expression (LESS_THAN|GREATER_THAN|LESS_THAN_OR_EQUAL|GREATER_THAN_OR_EQUAL) expression # RelationalExpr
    | expression (EQUAL_TO|NOT_EQUAL|EQUAL_TO3|NOT_EQUAL2) expression                         # EqualityExpr
    | expression (AND|OR) expression                                                          # LogicalExpr
    | expression EQUAL expression                                                             # AssignmentExpr
    | expression (PLUS|MINUS) EQUAL expression                                                # AdditionAssignmentExpr
    | expression QUESITIONMARK expression COLON expression                                    # TernaryExpr
    | LPAREN expression RPAREN                                                                # ParenthesizedExpr
    | expression ((MINUS MINUS)|(PLUS PLUS))                                                  # PostFixExpr
    | ((MINUS MINUS)|(PLUS PLUS)) expression                                                  # PreFixExpr
    | primary                                                                                 # PrimaryExpr
   // | templateLiteral                                                                         # TemplateExpr
    ;

    primary
        : literal                            # LiteralExpr
        | IDENTIFIER                         # IdentifierExpr
        | arrayLiteral                       # ArrayLiteralExpr
        | mapLitral                          # MapLiteralExpr
        | objectLiteral                      # ObjectLiteralExpr
        | objectInit                         # ObjectinitExpr
        ;

arrayLiteral : LSBRACKET (expression (COMMA expression)*)? COMMA? RSBRACKET;

objectLiteral : LCURLY (propertyAssignment (COMMA propertyAssignment)*)? COMMA? RCURLY;

objectInit : NEW IDENTIFIER (LESS_THAN type GREATER_THAN)? LPAREN args? RPAREN;

propertyAssignment : IDENTIFIER COLON expression;

mapLitral : LCURLY (mapmember (COMMA mapmember)*)? COMMA? RCURLY;

mapmember:STRING COLON expression;



loopControlStatement
    : BREAK
    | CONTINUE
    | BREAK IDENTIFIER
    | CONTINUE IDENTIFIER
    ;


args : expression (COMMA expression)*;

literal : number | STRING | Boolean | Null | Undefined;

number: Integer | Float;

//modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;


typeAnnotation
    : COLON type
    ;

type
    : STRINGKEYWORD | NUMBER | BOOLEANKEYWORD | ANY | ANY LSBRACKET RSBRACKET | IDENTIFIER (LESS_THAN type GREATER_THAN)?
    ;

eos: SEMI?;
