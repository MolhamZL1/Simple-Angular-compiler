parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program
    :(importStatement
     //| componentDeclaration | classDeclaration | functionDeclaration | statement
     )* EOF;

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

eos: SEMI?;
