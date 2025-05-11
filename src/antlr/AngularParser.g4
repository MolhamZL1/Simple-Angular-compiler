parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program//done
    :(
       primary
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

stylesProperty//done
    : styleUrls
 //   | stylesCss
    ;

styleUrls:STYLEURL COLON LSBRACKET? (STRING (COMMA STRING)*) RSBRACKET?;//done
  //  stylesCss:TEMPLATE COLON STRING;

classDeclaration//done
    : EXPORT?
      ABSTRACT?
      CLASS identifier
      (LESS_THAN genericClassParameters(COMMA genericClassParameters)* GREATER_THAN)?
      (EXTENDS identifier)?
      (IMPLEMENTS identifier (COMMA identifier)*)?
      classBody
    ;

 genericClassParameters:identifier (EXTENDS identifier)?;//done

classBody//done
    : LCURLY classMember* RCURLY
    ;

classMember//done
      :accessModifier?
       classMemberModifier?
       classStatment
       ;

classMemberModifier:(STATIC | READONLY | ABSTRACT | OVERRIDE);//done

    classStatment:
          propertyDeclaration//
        | methodDeclaration//
        | variableDeclaration//
        | constructorDeclaration//
        | accessorDeclaration//
        | angularSpecificMember//
        ;

    angularSpecificMember//done
        : inputDeclaration//
        | outputDeclaration//
        | viewChildDeclaration//
        ;

    inputDeclaration//done
        : INPUT LPAREN (STRING | objectLiteral)? RPAREN
          identifier typeAnnotation? (EQUAL expression)? eos
        ;

    outputDeclaration//done
        : OUTPUT (LPAREN STRING? RPAREN)?
          identifier typeAnnotation? EQUAL objectInit eos
        ;

    viewChildDeclaration//done
        : VIEWCHILD LPAREN STRING (COMMA objectLiteral)? RPAREN
          identifier typeAnnotation? eos
        ;

constructorDeclaration//done
    : deafultConstructor
    | delegatedConstructor
    ;

    delegatedConstructor://done
    CONSTRUCTOR LPAREN parameterList? RPAREN
                               COLON THIS LPAREN args? RPAREN
                             ;

    deafultConstructor://done
    CONSTRUCTOR LPAREN parameterList? RPAREN
                              blockStatement
                           ;

accessorDeclaration//done
    : (GET | SET) deafultMethod
    ;

 propertyDeclaration//done
        : identifier typeAnnotation? (EQUAL expression)? SEMI
        ;

      accessModifier//done
            : PUBLIC | PRIVATE | PROTECTED
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
    :EXPORT? variableDeclarationKeyword name=identifier typeAnnotation? (EQUAL expression)? (AS castedType=identifier)? SEMI
    ;

    variableDeclarationKeyword:(CONST | LET | VAR);//done//

expressionStatement: expression eos;//no need//noneed

expression//done
    : anonymosMethod                                                                          # AnounymusMethodExpr//noneed
    | THIS                                                                                    # ThisExpr//
    | left=expression DOT right=expression                                                    # MemberDotExpr//
    | member=expression LSBRACKET index=expression RSBRACKET                                  # MemberIndexExpr//
    | expression LPAREN args? RPAREN                                                          # CallExpr//
    | expression QUESITIONMARK DOT identifier                                                 # SafeNavExpr//
    | baseObject=expression QUESITIONMARK RSBRACKET indexObject=expression RSBRACKET          # SafeIndexExpr//
    | op=(MINUS|PLUS|NOT) expression                                                          # UnaryExpr//
    | left=expression op=(STAR|DIVIDE|MODULO|PLUS|MINUS) right=expression                     # ArthmaticOpExpr//
    | left=expression op=(LESS_THAN|GREATER_THAN|LESS_THAN_OR_EQUAL|GREATER_THAN_OR_EQUAL) right=expression # RelationalExpr//
    | left=expression op=(EQUAL_TO|NOT_EQUAL|EQUAL_TO3|NOT_EQUAL2)right=expression            # EqualityExpr//
    | left=expression op=(AND|OR) right=expression                                            # LogicalExpr//
    | variable=expression EQUAL value=expression                                              # AssignmentExpr//
    | variable=expression op=(PLUS|MINUS) EQUAL value=expression                              # AdditionAssignmentExpr//
    | condition=expression QUESITIONMARK true=expression COLON false=expression               # TernaryExpr//
    | LPAREN expression RPAREN                                                                # ParenthesizedExpr//
    | expression ((MINUS MINUS)|(PLUS PLUS))                                                  # PostFixExpr//
    | ((MINUS MINUS)|(PLUS PLUS)) expression                                                  # PreFixExpr//
    | primary                                                                                 # PrimaryExpr//noneed
   // | templateLiteral                                                                         # TemplateExpr
    ;

    primary//done//noneed
        : literal                            # Literalprimary
        | identifier                         # Identifierprimary
        | arrayLiteral                       # ArrayLiteralprimary
        | mapLitral                          # MapLiteralprimary
        | objectLiteral                      # ObjectLiteralprimary
        | objectInit                         # Objectinitprimary
        ;

arrayLiteral : LSBRACKET (expression (COMMA expression)*)? COMMA? RSBRACKET;//done//

objectLiteral : LCURLY (propertyAssignment (COMMA propertyAssignment)*)? COMMA? RCURLY;//done//

objectInit : NEW identifier (LESS_THAN type GREATER_THAN)? LPAREN args? RPAREN;//done//

propertyAssignment : identifier COLON expression;//done//

mapLitral : LCURLY (mapmember (COMMA mapmember)*)? COMMA? RCURLY;//done//

mapmember:STRING COLON expression;//done//

identifier:IDENTIFIER;//done//




args : expression (COMMA expression)*;//done//

literal : number | STRING | Boolean | Null | Undefined; //done//

number: Integer | Float; //done//

//modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC|EXPORT;


typeAnnotation//no need
    : COLON type
    ;

type//done//
    : STRINGKEYWORD | NUMBER | BOOLEANKEYWORD | ANY | ANY LSBRACKET RSBRACKET | IDENTIFIER (LESS_THAN type GREATER_THAN)?
    ;

eos: SEMI?;//done
