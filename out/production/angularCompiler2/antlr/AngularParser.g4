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
    : importDefault                   #ImportDefaultLabel
    | importNamespace                 #ImportNamespaceLabel
    | importNamed                     #ImportNamedLabel
    | importDefaultWithNamed          #ImportDefaultWithNamedLabel
    | importDefaultWithNamespace      #ImportDefaultWithNamespaceLabel
    | importSideEffect                #ImportSideEffectLabel
    ;

importSideEffect: IMPORT STRING eos;//done

importDefault: IMPORT identifier FROM STRING eos;//done

importNamespace: IMPORT STAR AS identifier FROM STRING eos;//done

importNamed: IMPORT importSpecifier FROM STRING eos;//done

importDefaultWithNamed: IMPORT identifier COMMA importSpecifier FROM STRING eos;//done

importDefaultWithNamespace: IMPORT identifier COMMA STAR AS identifier FROM STRING eos;//done

importSpecifier: LCURLY importList RCURLY;//no need

importList: importItem (COMMA importItem)*;//no need

importItem: original=identifier (AS alias=identifier)?;//done

componentDeclaration//done
    : COMPONENT Component_LPAREN componentMetadata Component_RPAREN
    ;

componentMetadata//no need
    : Component_LCURLY metadataProperty (Comp_COMMA metadataProperty)* Comp_COMMA? Component_RCURLY
    ;

metadataProperty//done
    : selectorProperty   #SelectorPropertyLabel
    | templateProperty   #TemplatePropertyLabel
    | stylesProperty     #StylesPropertyLabel
    | standalone         #StandaloneLabel
    | imports            #ImportsLabel
    ;

    standalone:STANDALONE CompCOLON CompBool;//done

     imports:IMPORTS CompCOLON listOfId;//edit this to list of id
listOfId:Comp_LSBRACKET (Comp_IDENTIFIER (Comp_COMMA Comp_IDENTIFIER)*) Comp_RSBRACKET;
selectorProperty//done
    : SELECTOR CompCOLON CompString
    ;

templateProperty//done
    : templateUrl    #TemplateUrlLabel
    | templetHTML    #TemplateHTMLLabel
    ;

    templateUrl:TEMPLATEURL CompCOLON CompString;//done

    templetHTML:TEMPLATE CompCOLON html;//done

    html:CompString;//done

stylesProperty//done
    : styleUrls   #StyleUrlsLabel
 //   | stylesCss
    ;

styleUrls:STYLEURL CompCOLON Comp_LSBRACKET? (CompString (Comp_COMMA CompString)*) Comp_RSBRACKET?;//done
  //  stylesCss:TEMPLATE COLON STRING;

classDeclaration//done
    : EXPORT?
      ABSTRACT?
      CLASS name=identifier
      (LESS_THAN genericClassParameters(COMMA genericClassParameters)* GREATER_THAN)?
      (EXTENDS parent=identifier)?
      (IMPLEMENTS identifier (COMMA identifier)*)?
      classBody
    ;//edit to string for null

 genericClassParameters:parameterid=identifier (EXTENDS parent=identifier)?;//done

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
          propertyDeclaration            #PropartyDeclerationLabel//
        | methodDeclaration              #MethodDeclerationLabel//
        | variableDeclaration            #VariableDeclerationLabel//
        | constructorDeclaration         #ConstructorDeclerationLabel//
        | accessorDeclaration            #AccessorDeclerationLabel//
        | angularSpecificMember          #AngularMemberLabel//
        ;

    angularSpecificMember//done
        : inputDeclaration               #InputDeclerationLabel
        | outputDeclaration              #OutputDeclerationLabel
        | viewChildDeclaration           #ViewChildDeclerationLabel
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
    : deafultConstructor       #DeaafultContructorLabel
    | delegatedConstructor     #DelegatedConstructorLabel
    ;

    delegatedConstructor://done//
    CONSTRUCTOR LPAREN parameterList? RPAREN
                               COLON THIS LPAREN args? RPAREN
                             ;

    deafultConstructor://done//
    CONSTRUCTOR LPAREN parameterList? RPAREN
                              blockStatement
                           ;

accessorDeclaration//done
    : (GET | SET) deafultMethod
    ;

 propertyDeclaration//done//
        : name=identifier typeAnnotation? (EQUAL value=expression)? SEMI
        ;

      accessModifier//done//
            : PUBLIC | PRIVATE | PROTECTED
            ;

methodDeclaration//done
    :deafultMethod       #DeafultmethodLabel
    |anonymosMethod      #AnonymusMethodLabel
    ;

    deafultMethod://done
     ASYNC? FUNCTION? identifier LPAREN (parameterList | args)? RPAREN
                   typeAnnotation? (blockStatement | ARROW expressionStatement);

    anonymosMethod://done
    ASYNC? LPAREN (parameterList|args)? RPAREN typeAnnotation? ARROW (blockStatement|expressionStatement);

     parameterList://no need
               (parameter (COMMA parameter)*)? ;

              parameter://done
              identifier (typeAnnotation  (EQUAL literal)?)?;

statement//done
       : variableDeclaration        #VariableDeclerrationLabel//
       | ifStatement                #IfStatmentLabel//
       | blockStatement             #BlockStatmentLabel//
       | loopStatement              #LoopStatmentLabel
       | loopControlStatement       #LoopControlStatmentLabel//
       | expressionStatement        #ExpressionStatemntLabel
       ;

loopControlStatement//done
    : (BREAK|CONTINUE)
    //identifier?
    ;

loopStatement//done
            : forStatement       #ForStatementLabel
            | whileStatement     #WhileStatementLabel
            | doWhileStatement   #DoWhileStatementLabel
            | forOfStatement     #ForOfStatementLabel
           // | angularForStatement
            ;

forStatement//done
    : FOR LPAREN
      (variableDeclaration | initialization=expression? SEMI)//Initialization
      condition=expression? SEMI//condition
      update=expression?//update
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

variableDeclaration//done//
    :EXPORT? variableDeclarationKeyword name=identifier typeAnnotation? (EQUAL value=expression)? (AS castedType=identifier)? SEMI
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
