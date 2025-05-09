parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program//done
    :(
       importStatement
      |componentDeclaration
      |classDeclaration
      |statement
      |methodDeclaration
     )* EOF;
// functionDeclaration
importStatement//done
    : importDefault
    | importNamespace
    | importNamed
    | importDefaultWithNamed
    | importDefaultWithNamespace
    | importSideEffect
    ;

importSideEffect: IMPORT STRING eos;//done

importDefault: IMPORT IDENTIFIER FROM STRING eos;//done

importNamespace: IMPORT STAR AS IDENTIFIER FROM STRING eos;//done

importNamed: IMPORT importSpecifier FROM STRING eos;//done

importDefaultWithNamed: IMPORT IDENTIFIER COMMA importSpecifier FROM STRING eos;//done

importDefaultWithNamespace: IMPORT IDENTIFIER COMMA STAR AS IDENTIFIER FROM STRING eos;//done

importSpecifier: LCURLY importList RCURLY;//no need

importList: importItem (COMMA importItem)*;//no need

importItem: IDENTIFIER (AS IDENTIFIER)?;//done

componentDeclaration//done
    : COMPONENT LPAREN componentMetadata RPAREN
    ;

componentMetadata//no need
    : LCURLY metadataProperty (COMMA metadataProperty)* COMMA? RCURLY
    ;

metadataProperty//done
    : selectorProperty
    | templateProperty
    | stylesProperty
    | standalone
    | imports
    ;

    standalone:STANDALONE COLON Boolean;//done

     imports:IMPORTS COLON arrayLiteral;//edit this to list of id

selectorProperty//done
    : SELECTOR COLON STRING
    ;

templateProperty//done
    : templateUrl
    | templetHTML
    ;

    templateUrl:TEMPLATEURL COLON STRING;//done

    templetHTML:TEMPLATE COLON html;//done

    html:STRING;//done

stylesProperty
    : styleUrls
 //   | stylesCss
    ;

styleUrls:STYLEURL COLON  (STRING | arrayLiteral);// edit this to list of urls
  //  stylesCss:TEMPLATE COLON STRING;

classDeclaration
    : EXPORT?
      ABSTRACT?
      CLASS identifier
      (LESS_THAN genericClassParameters(COMMA genericClassParameters)* GREATER_THAN)?
      (EXTENDS identifier)?
      (IMPLEMENTS identifier (COMMA identifier)*)?
      classBody
    ;

 genericClassParameters:identifier (EXTENDS identifier)?;

classBody
    : LCURLY classMember* RCURLY
    ;

classMember
      :accessModifier?
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

propertyDeclaration
    : IDENTIFIER typeAnnotation? (EQUAL expression)? SEMI
    ;


constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN
      ((COLON THIS LPAREN args? RPAREN) | blockStatement)?
    ;

accessorDeclaration
    : (GET | SET) IDENTIFIER LPAREN parameter? RPAREN
      typeAnnotation? (blockStatement | SEMI)
    ;

methodDeclaration//done
    :deafultMethod
    |anonymosMethod
    ;

    deafultMethod://done
     ASYNC? identifier LPAREN (parameterList | args)? RPAREN
                   typeAnnotation? (blockStatement | ARROW expressionStatement);

    anonymosMethod://done
    ASYNC? LPAREN (parameterList|args)? RPAREN typeAnnotation? ARROW (blockStatement|expressionStatement);

     parameterList://no need
               (parameter (COMMA parameter)*)? ;

              parameter://done
              IDENTIFIER (typeAnnotation  (EQUAL literal)?)?;




statement//done
       : variableDeclaration//
       | ifStatement//
       | blockStatement//
       | loopStatement//
       | loopControlStatement//
       | expressionStatement//
       ;

loopControlStatement//done
    : (BREAK|CONTINUE)
    //identifier?
    ;

loopStatement//done
            : forStatement
            | whileStatement
            | doWhileStatement
            | forOfStatement
           // | angularForStatement
            ;

forStatement//done
    : FOR LPAREN
      (variableDeclaration | expression? SEMI)//Initialization
      expression? SEMI//condition
      expression?//update
      RPAREN statement
    ;

        whileStatement//done
            : WHILE LPAREN expression RPAREN statement
            ;


        doWhileStatement//done
            : DO statement WHILE LPAREN expression RPAREN SEMI?
            ;

        forOfStatement//done
            : FOR LPAREN variableDeclarationKeyword identifier OF expression RPAREN statement
            ;


//        angularForStatement
//            : NGFOR EQUAL DOUBLEQUTATION variableDeclarationKeyword identifier OF expression
//              (SEMI variableDeclarationKeyword identifier EQUAL identifier)* DOUBLEQUTATION
//            ;

        ifStatement//done
            : ifSection (elseIfSection)* (elseSection)?
            ;

            ifSection:IF LPAREN expression RPAREN statement;//done

            elseIfSection:ELSEIF LPAREN expression RPAREN statement;//done

            elseSection:ELSE statement;//done

        blockStatement
            : LCURLY statement* RCURLY
            ;

variableDeclaration//done
    :EXPORT? variableDeclarationKeyword identifier typeAnnotation? (EQUAL expression)? (AS identifier)? SEMI
    ;

    variableDeclarationKeyword:(CONST | LET | VAR);//done

expressionStatement: expression eos;//no need

expression//done
    : anonymosMethod                                                                          # AnounymusMethodExpr
    | THIS                                                                                    # ThisExpr
    | expression DOT expression                                                               # MemberDotExpr
    | expression LSBRACKET expression RSBRACKET                                               # MemberIndexExpr
    | expression LPAREN args? RPAREN                                                          # CallExpr
    | expression QUESITIONMARK DOT IDENTIFIER                                                 # SafeNavExpr
    | expression QUESITIONMARK RSBRACKET expression RSBRACKET                                 # SafeIndexExpr
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

    primary//done
        : literal                            # LiteralExpr
        | identifier                         # IdentifierExpr
        | arrayLiteral                       # ArrayLiteralExpr
        | mapLitral                          # MapLiteralExpr
        | objectLiteral                      # ObjectLiteralExpr
        | objectInit                         # ObjectinitExpr
        ;

arrayLiteral : LSBRACKET (expression (COMMA expression)*)? COMMA? RSBRACKET;//done

objectLiteral : LCURLY (propertyAssignment (COMMA propertyAssignment)*)? COMMA? RCURLY;//done

objectInit : NEW identifier (LESS_THAN type GREATER_THAN)? LPAREN args? RPAREN;//done

propertyAssignment : identifier COLON expression;//done

mapLitral : LCURLY (mapmember (COMMA mapmember)*)? COMMA? RCURLY;//done

mapmember:STRING COLON expression;//done

identifier:IDENTIFIER;//done




args : expression (COMMA expression)*;//done

literal : number | STRING | Boolean | Null | Undefined; //done

number: Integer | Float; //done

//modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;


typeAnnotation//no need
    : COLON type
    ;

type//done
    : STRINGKEYWORD | NUMBER | BOOLEANKEYWORD | ANY | ANY LSBRACKET RSBRACKET | IDENTIFIER (LESS_THAN type GREATER_THAN)?
    ;

eos: SEMI?;//done
