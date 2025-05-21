lexer grammar AngularLexer;

IF: 'if';
ELSEIF: 'else' WS 'if';
ELSE: 'else';
FOR: 'for';
OF:'of';
WHILE: 'while';
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
CONTINUE: 'continue';
DEFAULT: 'default';
DO: 'do';
//TRY: 'try';
//CATCH: 'catch';
//FINALLY: 'finally';
//THROW: 'throw';
FUNCTION: 'function';
RETURN: 'return';
CONST: 'const';
TYPE:'type';
LET: 'let';
CONSTRUCTOR:'constructor';
VAR: 'var';
CLASS:'class';
IMPORT: 'import';
EXPORT: 'export';
AS: 'as';
FROM: 'from';
NEW:'new';
THIS:'this';
IMPLEMENTS:'implements';
STRINGKEYWORD:'string';
BOOLEANKEYWORD:'boolean';
NUMBER:'number';
ANY:'any';
//angular
INPUT: '@Input';
OUTPUT: '@Output';
VIEWCHILD: '@ViewChild';
//EVENT_EMITTER:'EventEmitter';
//NGONINIT: 'ngOnInit';
//NGONCHANGES: 'ngOnChanges';

NGFOR:'*ngFor';


//MODIFIRES
PUBLIC : 'public';
PRIVATE : 'private';
PROTECTED : 'protected';
READONLY : 'readonly';
STATIC : 'static';
ABSTRACT : 'abstract';
FINAL : 'final';
ASYNC : 'async';
EXTENDS:'extends';
SET:'set';
GET:'get';

// Operators
EQUAL: '=';
ARROW: '=>';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIVIDE: '/';
MODULO: '%';
AND: '&&';
OR: '||';
NOT: '!';
EQUAL_TO: '==';
EQUAL_TO3: '===';
NOT_EQUAL: '!=';
NOT_EQUAL2: '!==';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';

// Punctuation
LPAREN: '(';
RPAREN: ')';
LSBRACKET: '[';
RSBRACKET: ']';
LCURLY: '{';
RCURLY: '}';
COMMA: ',';
SEMI: ';';
COLON: ':';
DOT: '.';

DOUBLEQUTATION:'"';
QUESITIONMARK: '?';
DOLLARSIGN:'$';

// Literals
Integer: [0]|([1-9][0-9]*);
Float: [0-9]+ '.' [0-9]+;
fragment STRINGFrag: ('"' (~["\\])* '"') | ('\'' (~['\\])* '\'');
fragment BooleanFrag: 'true' | 'false';
Boolean:BooleanFrag;
STRING:STRINGFrag;
Undefined: 'undefined';
Null: 'null';
fragment IDENTIFIERFrag: [a-zA-Z_$][a-zA-Z0-9_$]*;
IDENTIFIER:IDENTIFIERFrag;

// Comments
fragment SINGLE_LINE_COMMENTFrag: '//' ~[\r\n]* ->skip;
fragment COMMENT_BLOCKFrag: '/*' .*? '*/' -> skip;
fragment WSFrag : [ \t\r\n]+ -> skip;

SINGLE_LINE_COMMENT:SINGLE_LINE_COMMENTFrag -> skip;
COMMENT_BLOCK: COMMENT_BLOCKFrag -> skip;
WS : WSFrag -> skip;

COMPONENT: '@Component'->pushMode(COMPONENT_MODE);
mode COMPONENT_MODE;
CompSINGLE_LINE_COMMENT:SINGLE_LINE_COMMENTFrag-> skip;
CompCOMMENT_BLOCK: COMMENT_BLOCKFrag-> skip;
CompWS : WSFrag-> skip;
SELECTOR:'selector';
STANDALONE:'standalone';
STYLEURL:'styleUrl';
TEMPLATEURL:'templateUrl';
TEMPLATE:'template';
IMPORTS: 'imports';

CompString:STRINGFrag;
CompBool:BooleanFrag;
CompCOLON:':';
Comp_COMMA: ',';
BACKTICK:'`';
TAG_OPEN: '<';
TAG_CLOSE: '>';
TAG_SLASH: '/';
TAG_SLASH_CLOSE: '/>';
NG_IF: '*ngIf';
NG_FOR: '*ngFor';
INTERPOLATION_OPEN: '{{';
INTERPOLATION_CLOSE: '}}';
Comp_LSBRACKET: '[';
Comp_RSBRACKET: ']';
Component_LCURLY: '{';
Component_RCURLY: '}';
Component_LPAREN: '(';
Comp_IDENTIFIER:IDENTIFIERFrag;
Component_RPAREN: ')'->popMode;