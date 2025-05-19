// Generated from C:/Users/USER/Desktop/New folder/angularCompiler2/src/antlr/AngularParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSEIF=2, ELSE=3, FOR=4, OF=5, WHILE=6, SWITCH=7, CASE=8, BREAK=9, 
		CONTINUE=10, DEFAULT=11, DO=12, FUNCTION=13, RETURN=14, CONST=15, LET=16, 
		CONSTRUCTOR=17, VAR=18, CLASS=19, IMPORT=20, EXPORT=21, AS=22, FROM=23, 
		NEW=24, THIS=25, IMPLEMENTS=26, STRINGKEYWORD=27, BOOLEANKEYWORD=28, NUMBER=29, 
		ANY=30, INPUT=31, OUTPUT=32, VIEWCHILD=33, NGFOR=34, PUBLIC=35, PRIVATE=36, 
		PROTECTED=37, READONLY=38, STATIC=39, ABSTRACT=40, FINAL=41, ASYNC=42, 
		EXTENDS=43, SET=44, GET=45, EQUAL=46, ARROW=47, PLUS=48, MINUS=49, STAR=50, 
		DIVIDE=51, MODULO=52, AND=53, OR=54, NOT=55, EQUAL_TO=56, EQUAL_TO3=57, 
		NOT_EQUAL=58, NOT_EQUAL2=59, GREATER_THAN=60, LESS_THAN=61, GREATER_THAN_OR_EQUAL=62, 
		LESS_THAN_OR_EQUAL=63, LPAREN=64, RPAREN=65, LSBRACKET=66, RSBRACKET=67, 
		LCURLY=68, RCURLY=69, COMMA=70, SEMI=71, COLON=72, DOT=73, DOUBLEQUTATION=74, 
		QUESITIONMARK=75, DOLLARSIGN=76, Integer=77, Float=78, Boolean=79, STRING=80, 
		Undefined=81, Null=82, IDENTIFIER=83, SINGLE_LINE_COMMENT=84, COMMENT_BLOCK=85, 
		WS=86, COMPONENT=87, CompSINGLE_LINE_COMMENT=88, CompCOMMENT_BLOCK=89, 
		CompWS=90, SELECTOR=91, STANDALONE=92, STYLEURL=93, TEMPLATEURL=94, TEMPLATE=95, 
		IMPORTS=96, CompString=97, CompBool=98, CompCOLON=99, Comp_COMMA=100, 
		Comp_LSBRACKET=101, Comp_RSBRACKET=102, Component_LCURLY=103, Component_RCURLY=104, 
		Component_LPAREN=105, Comp_IDENTIFIER=106, Component_RPAREN=107, OVERRIDE=108;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importSideEffect = 2, 
		RULE_importDefault = 3, RULE_importNamespace = 4, RULE_importNamed = 5, 
		RULE_importDefaultWithNamed = 6, RULE_importDefaultWithNamespace = 7, 
		RULE_importSpecifier = 8, RULE_importList = 9, RULE_importItem = 10, RULE_componentDeclaration = 11, 
		RULE_componentMetadata = 12, RULE_metadataProperty = 13, RULE_standalone = 14, 
		RULE_imports = 15, RULE_listOfId = 16, RULE_selectorProperty = 17, RULE_templateProperty = 18, 
		RULE_templateUrl = 19, RULE_templetHTML = 20, RULE_html = 21, RULE_stylesProperty = 22, 
		RULE_styleUrls = 23, RULE_classDeclaration = 24, RULE_genericClassParameters = 25, 
		RULE_classBody = 26, RULE_classMember = 27, RULE_classMemberModifier = 28, 
		RULE_classStatment = 29, RULE_angularSpecificMember = 30, RULE_inputDeclaration = 31, 
		RULE_outputDeclaration = 32, RULE_viewChildDeclaration = 33, RULE_constructorDeclaration = 34, 
		RULE_delegatedConstructor = 35, RULE_deafultConstructor = 36, RULE_accessorDeclaration = 37, 
		RULE_propertyDeclaration = 38, RULE_accessModifier = 39, RULE_methodDeclaration = 40, 
		RULE_deafultMethod = 41, RULE_anonymosMethod = 42, RULE_parameterList = 43, 
		RULE_parameter = 44, RULE_statement = 45, RULE_loopControlStatement = 46, 
		RULE_loopStatement = 47, RULE_forStatement = 48, RULE_whileStatement = 49, 
		RULE_doWhileStatement = 50, RULE_forOfStatement = 51, RULE_ifStatement = 52, 
		RULE_ifSection = 53, RULE_elseIfSection = 54, RULE_elseSection = 55, RULE_blockStatement = 56, 
		RULE_variableDeclaration = 57, RULE_variableDeclarationKeyword = 58, RULE_expressionStatement = 59, 
		RULE_expression = 60, RULE_primary = 61, RULE_arrayLiteral = 62, RULE_objectLiteral = 63, 
		RULE_objectInit = 64, RULE_propertyAssignment = 65, RULE_mapLitral = 66, 
		RULE_mapmember = 67, RULE_identifier = 68, RULE_args = 69, RULE_literal = 70, 
		RULE_number = 71, RULE_typeAnnotation = 72, RULE_type = 73, RULE_eos = 74;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importSideEffect", "importDefault", "importNamespace", 
			"importNamed", "importDefaultWithNamed", "importDefaultWithNamespace", 
			"importSpecifier", "importList", "importItem", "componentDeclaration", 
			"componentMetadata", "metadataProperty", "standalone", "imports", "listOfId", 
			"selectorProperty", "templateProperty", "templateUrl", "templetHTML", 
			"html", "stylesProperty", "styleUrls", "classDeclaration", "genericClassParameters", 
			"classBody", "classMember", "classMemberModifier", "classStatment", "angularSpecificMember", 
			"inputDeclaration", "outputDeclaration", "viewChildDeclaration", "constructorDeclaration", 
			"delegatedConstructor", "deafultConstructor", "accessorDeclaration", 
			"propertyDeclaration", "accessModifier", "methodDeclaration", "deafultMethod", 
			"anonymosMethod", "parameterList", "parameter", "statement", "loopControlStatement", 
			"loopStatement", "forStatement", "whileStatement", "doWhileStatement", 
			"forOfStatement", "ifStatement", "ifSection", "elseIfSection", "elseSection", 
			"blockStatement", "variableDeclaration", "variableDeclarationKeyword", 
			"expressionStatement", "expression", "primary", "arrayLiteral", "objectLiteral", 
			"objectInit", "propertyAssignment", "mapLitral", "mapmember", "identifier", 
			"args", "literal", "number", "typeAnnotation", "type", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", null, "'else'", "'for'", "'of'", "'while'", "'switch'", 
			"'case'", "'break'", "'continue'", "'default'", "'do'", "'function'", 
			"'return'", "'const'", "'let'", "'constructor'", "'var'", "'class'", 
			"'import'", "'export'", "'as'", "'from'", "'new'", "'this'", "'implements'", 
			"'string'", "'boolean'", "'number'", "'any'", "'@Input'", "'@Output'", 
			"'@ViewChild'", "'*ngFor'", "'public'", "'private'", "'protected'", "'readonly'", 
			"'static'", "'abstract'", "'final'", "'async'", "'extends'", "'set'", 
			"'get'", "'='", "'=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'", "'=='", "'==='", "'!='", "'!=='", "'>'", "'<'", "'>='", "'<='", 
			null, null, null, null, null, null, null, "';'", null, "'.'", "'\"'", 
			"'?'", "'$'", null, null, null, null, "'undefined'", "'null'", null, 
			null, null, null, "'@Component'", null, null, null, "'selector'", "'standalone'", 
			"'styleUrl'", "'templateUrl'", "'template'", "'imports'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "FOR", "OF", "WHILE", "SWITCH", "CASE", 
			"BREAK", "CONTINUE", "DEFAULT", "DO", "FUNCTION", "RETURN", "CONST", 
			"LET", "CONSTRUCTOR", "VAR", "CLASS", "IMPORT", "EXPORT", "AS", "FROM", 
			"NEW", "THIS", "IMPLEMENTS", "STRINGKEYWORD", "BOOLEANKEYWORD", "NUMBER", 
			"ANY", "INPUT", "OUTPUT", "VIEWCHILD", "NGFOR", "PUBLIC", "PRIVATE", 
			"PROTECTED", "READONLY", "STATIC", "ABSTRACT", "FINAL", "ASYNC", "EXTENDS", 
			"SET", "GET", "EQUAL", "ARROW", "PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", 
			"AND", "OR", "NOT", "EQUAL_TO", "EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", 
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"LPAREN", "RPAREN", "LSBRACKET", "RSBRACKET", "LCURLY", "RCURLY", "COMMA", 
			"SEMI", "COLON", "DOT", "DOUBLEQUTATION", "QUESITIONMARK", "DOLLARSIGN", 
			"Integer", "Float", "Boolean", "STRING", "Undefined", "Null", "IDENTIFIER", 
			"SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "WS", "COMPONENT", "CompSINGLE_LINE_COMMENT", 
			"CompCOMMENT_BLOCK", "CompWS", "SELECTOR", "STANDALONE", "STYLEURL", 
			"TEMPLATEURL", "TEMPLATE", "IMPORTS", "CompString", "CompBool", "CompCOLON", 
			"Comp_COMMA", "Comp_LSBRACKET", "Comp_RSBRACKET", "Component_LCURLY", 
			"Component_RCURLY", "Component_LPAREN", "Comp_IDENTIFIER", "Component_RPAREN", 
			"OVERRIDE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ComponentDeclarationContext> componentDeclaration() {
			return getRuleContexts(ComponentDeclarationContext.class);
		}
		public ComponentDeclarationContext componentDeclaration(int i) {
			return getRuleContext(ComponentDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36878719561610834L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9429013L) != 0)) {
				{
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(150);
					importStatement();
					}
					break;
				case 2:
					{
					setState(151);
					componentDeclaration();
					}
					break;
				case 3:
					{
					setState(152);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(153);
					statement();
					}
					break;
				case 5:
					{
					setState(154);
					methodDeclaration();
					}
					break;
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultLabelContext extends ImportStatementContext {
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public ImportDefaultLabelContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultWithNamedLabelContext extends ImportStatementContext {
		public ImportDefaultWithNamedContext importDefaultWithNamed() {
			return getRuleContext(ImportDefaultWithNamedContext.class,0);
		}
		public ImportDefaultWithNamedLabelContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultWithNamedLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultWithNamedLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultWithNamedLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceLabelContext extends ImportStatementContext {
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportNamespaceLabelContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamespaceLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamespaceLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamespaceLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamedLabelContext extends ImportStatementContext {
		public ImportNamedContext importNamed() {
			return getRuleContext(ImportNamedContext.class,0);
		}
		public ImportNamedLabelContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamedLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamedLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamedLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportSideEffectLabelContext extends ImportStatementContext {
		public ImportSideEffectContext importSideEffect() {
			return getRuleContext(ImportSideEffectContext.class,0);
		}
		public ImportSideEffectLabelContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSideEffectLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSideEffectLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSideEffectLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultWithNamespaceLabelContext extends ImportStatementContext {
		public ImportDefaultWithNamespaceContext importDefaultWithNamespace() {
			return getRuleContext(ImportDefaultWithNamespaceContext.class,0);
		}
		public ImportDefaultWithNamespaceLabelContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultWithNamespaceLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultWithNamespaceLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultWithNamespaceLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImportDefaultLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				importDefault();
				}
				break;
			case 2:
				_localctx = new ImportNamespaceLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				importNamespace();
				}
				break;
			case 3:
				_localctx = new ImportNamedLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				importNamed();
				}
				break;
			case 4:
				_localctx = new ImportDefaultWithNamedLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				importDefaultWithNamed();
				}
				break;
			case 5:
				_localctx = new ImportDefaultWithNamespaceLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				importDefaultWithNamespace();
				}
				break;
			case 6:
				_localctx = new ImportSideEffectLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				importSideEffect();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSideEffectContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportSideEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSideEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSideEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSideEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSideEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSideEffectContext importSideEffect() throws RecognitionException {
		ImportSideEffectContext _localctx = new ImportSideEffectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importSideEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IMPORT);
			setState(171);
			match(STRING);
			setState(172);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IMPORT);
			setState(175);
			identifier();
			setState(176);
			match(FROM);
			setState(177);
			match(STRING);
			setState(178);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IMPORT);
			setState(181);
			match(STAR);
			setState(182);
			match(AS);
			setState(183);
			identifier();
			setState(184);
			match(FROM);
			setState(185);
			match(STRING);
			setState(186);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamedContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamedContext importNamed() throws RecognitionException {
		ImportNamedContext _localctx = new ImportNamedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importNamed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IMPORT);
			setState(189);
			importSpecifier();
			setState(190);
			match(FROM);
			setState(191);
			match(STRING);
			setState(192);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultWithNamedContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportDefaultWithNamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefaultWithNamed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultWithNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultWithNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultWithNamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultWithNamedContext importDefaultWithNamed() throws RecognitionException {
		ImportDefaultWithNamedContext _localctx = new ImportDefaultWithNamedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDefaultWithNamed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IMPORT);
			setState(195);
			identifier();
			setState(196);
			match(COMMA);
			setState(197);
			importSpecifier();
			setState(198);
			match(FROM);
			setState(199);
			match(STRING);
			setState(200);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultWithNamespaceContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportDefaultWithNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefaultWithNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultWithNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultWithNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultWithNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultWithNamespaceContext importDefaultWithNamespace() throws RecognitionException {
		ImportDefaultWithNamespaceContext _localctx = new ImportDefaultWithNamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDefaultWithNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IMPORT);
			setState(203);
			identifier();
			setState(204);
			match(COMMA);
			setState(205);
			match(STAR);
			setState(206);
			match(AS);
			setState(207);
			identifier();
			setState(208);
			match(FROM);
			setState(209);
			match(STRING);
			setState(210);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LCURLY);
			setState(213);
			importList();
			setState(214);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			importItem();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				importItem();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public IdentifierContext original;
		public IdentifierContext alias;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((ImportItemContext)_localctx).original = identifier();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(225);
				match(AS);
				setState(226);
				((ImportItemContext)_localctx).alias = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode Component_LPAREN() { return getToken(AngularParser.Component_LPAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode Component_RPAREN() { return getToken(AngularParser.Component_RPAREN, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(COMPONENT);
			setState(230);
			match(Component_LPAREN);
			setState(231);
			componentMetadata();
			setState(232);
			match(Component_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode Component_LCURLY() { return getToken(AngularParser.Component_LCURLY, 0); }
		public List<MetadataPropertyContext> metadataProperty() {
			return getRuleContexts(MetadataPropertyContext.class);
		}
		public MetadataPropertyContext metadataProperty(int i) {
			return getRuleContext(MetadataPropertyContext.class,i);
		}
		public TerminalNode Component_RCURLY() { return getToken(AngularParser.Component_RCURLY, 0); }
		public List<TerminalNode> Comp_COMMA() { return getTokens(AngularParser.Comp_COMMA); }
		public TerminalNode Comp_COMMA(int i) {
			return getToken(AngularParser.Comp_COMMA, i);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentMetadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Component_LCURLY);
			setState(235);
			metadataProperty();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(Comp_COMMA);
					setState(237);
					metadataProperty();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comp_COMMA) {
				{
				setState(243);
				match(Comp_COMMA);
				}
			}

			setState(246);
			match(Component_RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataPropertyContext extends ParserRuleContext {
		public MetadataPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataProperty; }
	 
		public MetadataPropertyContext() { }
		public void copyFrom(MetadataPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneLabelContext extends MetadataPropertyContext {
		public StandaloneContext standalone() {
			return getRuleContext(StandaloneContext.class,0);
		}
		public StandaloneLabelContext(MetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyLabelContext extends MetadataPropertyContext {
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public SelectorPropertyLabelContext(MetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorPropertyLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorPropertyLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorPropertyLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyLabelContext extends MetadataPropertyContext {
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public TemplatePropertyLabelContext(MetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplatePropertyLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplatePropertyLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplatePropertyLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropertyLabelContext extends MetadataPropertyContext {
		public StylesPropertyContext stylesProperty() {
			return getRuleContext(StylesPropertyContext.class,0);
		}
		public StylesPropertyLabelContext(MetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesPropertyLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesPropertyLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesPropertyLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsLabelContext extends MetadataPropertyContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ImportsLabelContext(MetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataPropertyContext metadataProperty() throws RecognitionException {
		MetadataPropertyContext _localctx = new MetadataPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metadataProperty);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropertyLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				selectorProperty();
				}
				break;
			case TEMPLATEURL:
			case TEMPLATE:
				_localctx = new TemplatePropertyLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				templateProperty();
				}
				break;
			case STYLEURL:
				_localctx = new StylesPropertyLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				stylesProperty();
				}
				break;
			case STANDALONE:
				_localctx = new StandaloneLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				standalone();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				imports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode CompCOLON() { return getToken(AngularParser.CompCOLON, 0); }
		public TerminalNode CompBool() { return getToken(AngularParser.CompBool, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(STANDALONE);
			setState(256);
			match(CompCOLON);
			setState(257);
			match(CompBool);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode CompCOLON() { return getToken(AngularParser.CompCOLON, 0); }
		public ListOfIdContext listOfId() {
			return getRuleContext(ListOfIdContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(IMPORTS);
			setState(260);
			match(CompCOLON);
			setState(261);
			listOfId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListOfIdContext extends ParserRuleContext {
		public TerminalNode Comp_LSBRACKET() { return getToken(AngularParser.Comp_LSBRACKET, 0); }
		public TerminalNode Comp_RSBRACKET() { return getToken(AngularParser.Comp_RSBRACKET, 0); }
		public List<TerminalNode> Comp_IDENTIFIER() { return getTokens(AngularParser.Comp_IDENTIFIER); }
		public TerminalNode Comp_IDENTIFIER(int i) {
			return getToken(AngularParser.Comp_IDENTIFIER, i);
		}
		public List<TerminalNode> Comp_COMMA() { return getTokens(AngularParser.Comp_COMMA); }
		public TerminalNode Comp_COMMA(int i) {
			return getToken(AngularParser.Comp_COMMA, i);
		}
		public ListOfIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterListOfId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitListOfId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitListOfId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfIdContext listOfId() throws RecognitionException {
		ListOfIdContext _localctx = new ListOfIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listOfId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Comp_LSBRACKET);
			{
			setState(264);
			match(Comp_IDENTIFIER);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comp_COMMA) {
				{
				{
				setState(265);
				match(Comp_COMMA);
				setState(266);
				match(Comp_IDENTIFIER);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(272);
			match(Comp_RSBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode CompCOLON() { return getToken(AngularParser.CompCOLON, 0); }
		public TerminalNode CompString() { return getToken(AngularParser.CompString, 0); }
		public SelectorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPropertyContext selectorProperty() throws RecognitionException {
		SelectorPropertyContext _localctx = new SelectorPropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(SELECTOR);
			setState(275);
			match(CompCOLON);
			setState(276);
			match(CompString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends ParserRuleContext {
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
	 
		public TemplatePropertyContext() { }
		public void copyFrom(TemplatePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHTMLLabelContext extends TemplatePropertyContext {
		public TempletHTMLContext templetHTML() {
			return getRuleContext(TempletHTMLContext.class,0);
		}
		public TemplateHTMLLabelContext(TemplatePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateHTMLLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateHTMLLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateHTMLLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlLabelContext extends TemplatePropertyContext {
		public TemplateUrlContext templateUrl() {
			return getRuleContext(TemplateUrlContext.class,0);
		}
		public TemplateUrlLabelContext(TemplatePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrlLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrlLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrlLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_templateProperty);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				_localctx = new TemplateUrlLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				templateUrl();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateHTMLLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				templetHTML();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public TerminalNode CompCOLON() { return getToken(AngularParser.CompCOLON, 0); }
		public TerminalNode CompString() { return getToken(AngularParser.CompString, 0); }
		public TemplateUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrlContext templateUrl() throws RecognitionException {
		TemplateUrlContext _localctx = new TemplateUrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_templateUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(TEMPLATEURL);
			setState(283);
			match(CompCOLON);
			setState(284);
			match(CompString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TempletHTMLContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode CompCOLON() { return getToken(AngularParser.CompCOLON, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TempletHTMLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templetHTML; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTempletHTML(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTempletHTML(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTempletHTML(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempletHTMLContext templetHTML() throws RecognitionException {
		TempletHTMLContext _localctx = new TempletHTMLContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_templetHTML);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(TEMPLATE);
			setState(287);
			match(CompCOLON);
			setState(288);
			html();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode CompString() { return getToken(AngularParser.CompString, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(CompString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropertyContext extends ParserRuleContext {
		public StylesPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesProperty; }
	 
		public StylesPropertyContext() { }
		public void copyFrom(StylesPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsLabelContext extends StylesPropertyContext {
		public StyleUrlsContext styleUrls() {
			return getRuleContext(StyleUrlsContext.class,0);
		}
		public StyleUrlsLabelContext(StylesPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrlsLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrlsLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrlsLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesPropertyContext stylesProperty() throws RecognitionException {
		StylesPropertyContext _localctx = new StylesPropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stylesProperty);
		try {
			_localctx = new StyleUrlsLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			styleUrls();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(AngularParser.STYLEURL, 0); }
		public TerminalNode CompCOLON() { return getToken(AngularParser.CompCOLON, 0); }
		public List<TerminalNode> CompString() { return getTokens(AngularParser.CompString); }
		public TerminalNode CompString(int i) {
			return getToken(AngularParser.CompString, i);
		}
		public TerminalNode Comp_LSBRACKET() { return getToken(AngularParser.Comp_LSBRACKET, 0); }
		public TerminalNode Comp_RSBRACKET() { return getToken(AngularParser.Comp_RSBRACKET, 0); }
		public List<TerminalNode> Comp_COMMA() { return getTokens(AngularParser.Comp_COMMA); }
		public TerminalNode Comp_COMMA(int i) {
			return getToken(AngularParser.Comp_COMMA, i);
		}
		public StyleUrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlsContext styleUrls() throws RecognitionException {
		StyleUrlsContext _localctx = new StyleUrlsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_styleUrls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(STYLEURL);
			setState(295);
			match(CompCOLON);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comp_LSBRACKET) {
				{
				setState(296);
				match(Comp_LSBRACKET);
				}
			}

			{
			setState(299);
			match(CompString);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(Comp_COMMA);
					setState(301);
					match(CompString);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comp_RSBRACKET) {
				{
				setState(307);
				match(Comp_RSBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext parent;
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<GenericClassParametersContext> genericClassParameters() {
			return getRuleContexts(GenericClassParametersContext.class);
		}
		public GenericClassParametersContext genericClassParameters(int i) {
			return getRuleContext(GenericClassParametersContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(310);
				match(EXPORT);
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(313);
				match(ABSTRACT);
				}
			}

			setState(316);
			match(CLASS);
			setState(317);
			((ClassDeclarationContext)_localctx).name = identifier();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(318);
				match(LESS_THAN);
				setState(319);
				genericClassParameters();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(320);
					match(COMMA);
					setState(321);
					genericClassParameters();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(GREATER_THAN);
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(331);
				match(EXTENDS);
				setState(332);
				((ClassDeclarationContext)_localctx).parent = identifier();
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(335);
				match(IMPLEMENTS);
				setState(336);
				identifier();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					identifier();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(346);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericClassParametersContext extends ParserRuleContext {
		public IdentifierContext parameterid;
		public IdentifierContext parent;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public GenericClassParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericClassParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericClassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericClassParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericClassParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericClassParametersContext genericClassParameters() throws RecognitionException {
		GenericClassParametersContext _localctx = new GenericClassParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_genericClassParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((GenericClassParametersContext)_localctx).parameterid = identifier();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(349);
				match(EXTENDS);
				setState(350);
				((GenericClassParametersContext)_localctx).parent = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(LCURLY);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 59354303143936L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186568705L) != 0)) {
				{
				{
				setState(354);
				classMember();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassStatmentContext classStatment() {
			return getRuleContext(ClassStatmentContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassMemberModifierContext classMemberModifier() {
			return getRuleContext(ClassMemberModifierContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				setState(362);
				accessModifier();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0) || _la==OVERRIDE) {
				{
				setState(365);
				classMemberModifier();
				}
			}

			setState(368);
			classStatment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public TerminalNode OVERRIDE() { return getToken(AngularParser.OVERRIDE, 0); }
		public ClassMemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberModifierContext classMemberModifier() throws RecognitionException {
		ClassMemberModifierContext _localctx = new ClassMemberModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classMemberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0) || _la==OVERRIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassStatmentContext extends ParserRuleContext {
		public ClassStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatment; }
	 
		public ClassStatmentContext() { }
		public void copyFrom(ClassStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclerationLabelContext extends ClassStatmentContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclerationLabelContext(ClassStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclerationLabelContext extends ClassStatmentContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ConstructorDeclerationLabelContext(ClassStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessorDeclerationLabelContext extends ClassStatmentContext {
		public AccessorDeclarationContext accessorDeclaration() {
			return getRuleContext(AccessorDeclarationContext.class,0);
		}
		public AccessorDeclerationLabelContext(ClassStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessorDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessorDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessorDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclerationLabelContext extends ClassStatmentContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodDeclerationLabelContext(ClassStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AngularMemberLabelContext extends ClassStatmentContext {
		public AngularSpecificMemberContext angularSpecificMember() {
			return getRuleContext(AngularSpecificMemberContext.class,0);
		}
		public AngularMemberLabelContext(ClassStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularMemberLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularMemberLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularMemberLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropartyDeclerationLabelContext extends ClassStatmentContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public PropartyDeclerationLabelContext(ClassStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropartyDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropartyDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropartyDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatmentContext classStatment() throws RecognitionException {
		ClassStatmentContext _localctx = new ClassStatmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classStatment);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PropartyDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				propertyDeclaration();
				}
				break;
			case 2:
				_localctx = new MethodDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				methodDeclaration();
				}
				break;
			case 3:
				_localctx = new VariableDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ConstructorDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				constructorDeclaration();
				}
				break;
			case 5:
				_localctx = new AccessorDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				accessorDeclaration();
				}
				break;
			case 6:
				_localctx = new AngularMemberLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				angularSpecificMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularSpecificMemberContext extends ParserRuleContext {
		public AngularSpecificMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularSpecificMember; }
	 
		public AngularSpecificMemberContext() { }
		public void copyFrom(AngularSpecificMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ViewChildDeclerationLabelContext extends AngularSpecificMemberContext {
		public ViewChildDeclarationContext viewChildDeclaration() {
			return getRuleContext(ViewChildDeclarationContext.class,0);
		}
		public ViewChildDeclerationLabelContext(AngularSpecificMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterViewChildDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitViewChildDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitViewChildDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputDeclerationLabelContext extends AngularSpecificMemberContext {
		public OutputDeclarationContext outputDeclaration() {
			return getRuleContext(OutputDeclarationContext.class,0);
		}
		public OutputDeclerationLabelContext(AngularSpecificMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutputDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutputDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutputDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclerationLabelContext extends AngularSpecificMemberContext {
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public InputDeclerationLabelContext(AngularSpecificMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputDeclerationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputDeclerationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputDeclerationLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularSpecificMemberContext angularSpecificMember() throws RecognitionException {
		AngularSpecificMemberContext _localctx = new AngularSpecificMemberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_angularSpecificMember);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				_localctx = new InputDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				inputDeclaration();
				}
				break;
			case OUTPUT:
				_localctx = new OutputDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				outputDeclaration();
				}
				break;
			case VIEWCHILD:
				_localctx = new ViewChildDeclerationLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				viewChildDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclarationContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(INPUT);
			setState(386);
			match(LPAREN);
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(387);
				match(STRING);
				}
				break;
			case LCURLY:
				{
				setState(388);
				objectLiteral();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(391);
			match(RPAREN);
			setState(392);
			identifier();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(393);
				typeAnnotation();
				}
			}

			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(396);
				match(EQUAL);
				setState(397);
				expression(0);
				}
			}

			setState(400);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputDeclarationContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(AngularParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public OutputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputDeclarationContext outputDeclaration() throws RecognitionException {
		OutputDeclarationContext _localctx = new OutputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(OUTPUT);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(403);
				match(LPAREN);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(404);
					match(STRING);
					}
				}

				setState(407);
				match(RPAREN);
				}
			}

			setState(410);
			identifier();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(411);
				typeAnnotation();
				}
			}

			setState(414);
			match(EQUAL);
			setState(415);
			objectInit();
			setState(416);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewChildDeclarationContext extends ParserRuleContext {
		public TerminalNode VIEWCHILD() { return getToken(AngularParser.VIEWCHILD, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ViewChildDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewChildDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterViewChildDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitViewChildDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitViewChildDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewChildDeclarationContext viewChildDeclaration() throws RecognitionException {
		ViewChildDeclarationContext _localctx = new ViewChildDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_viewChildDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(VIEWCHILD);
			setState(419);
			match(LPAREN);
			setState(420);
			match(STRING);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(421);
				match(COMMA);
				setState(422);
				objectLiteral();
				}
			}

			setState(425);
			match(RPAREN);
			setState(426);
			identifier();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(427);
				typeAnnotation();
				}
			}

			setState(430);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	 
		public ConstructorDeclarationContext() { }
		public void copyFrom(ConstructorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeaafultContructorLabelContext extends ConstructorDeclarationContext {
		public DeafultConstructorContext deafultConstructor() {
			return getRuleContext(DeafultConstructorContext.class,0);
		}
		public DeaafultContructorLabelContext(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeaafultContructorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeaafultContructorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeaafultContructorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DelegatedConstructorLabelContext extends ConstructorDeclarationContext {
		public DelegatedConstructorContext delegatedConstructor() {
			return getRuleContext(DelegatedConstructorContext.class,0);
		}
		public DelegatedConstructorLabelContext(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDelegatedConstructorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDelegatedConstructorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDelegatedConstructorLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constructorDeclaration);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new DeaafultContructorLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				deafultConstructor();
				}
				break;
			case 2:
				_localctx = new DelegatedConstructorLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				delegatedConstructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelegatedConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public DelegatedConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegatedConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDelegatedConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDelegatedConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDelegatedConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegatedConstructorContext delegatedConstructor() throws RecognitionException {
		DelegatedConstructorContext _localctx = new DelegatedConstructorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_delegatedConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(CONSTRUCTOR);
			setState(437);
			match(LPAREN);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(438);
				parameterList();
				}
				break;
			}
			setState(441);
			match(RPAREN);
			setState(442);
			match(COLON);
			setState(443);
			match(THIS);
			setState(444);
			match(LPAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
				{
				setState(445);
				args();
				}
			}

			setState(448);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeafultConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DeafultConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deafultConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeafultConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeafultConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeafultConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeafultConstructorContext deafultConstructor() throws RecognitionException {
		DeafultConstructorContext _localctx = new DeafultConstructorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_deafultConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(CONSTRUCTOR);
			setState(451);
			match(LPAREN);
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(452);
				parameterList();
				}
				break;
			}
			setState(455);
			match(RPAREN);
			setState(456);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessorDeclarationContext extends ParserRuleContext {
		public DeafultMethodContext deafultMethod() {
			return getRuleContext(DeafultMethodContext.class,0);
		}
		public TerminalNode GET() { return getToken(AngularParser.GET, 0); }
		public TerminalNode SET() { return getToken(AngularParser.SET, 0); }
		public AccessorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorDeclarationContext accessorDeclaration() throws RecognitionException {
		AccessorDeclarationContext _localctx = new AccessorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_accessorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==GET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(459);
			deafultMethod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext value;
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			((PropertyDeclarationContext)_localctx).name = identifier();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(462);
				typeAnnotation();
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(465);
				match(EQUAL);
				setState(466);
				((PropertyDeclarationContext)_localctx).value = expression(0);
				}
			}

			setState(469);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeafultmethodLabelContext extends MethodDeclarationContext {
		public DeafultMethodContext deafultMethod() {
			return getRuleContext(DeafultMethodContext.class,0);
		}
		public DeafultmethodLabelContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeafultmethodLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeafultmethodLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeafultmethodLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnonymusMethodLabelContext extends MethodDeclarationContext {
		public AnonymosMethodContext anonymosMethod() {
			return getRuleContext(AnonymosMethodContext.class,0);
		}
		public AnonymusMethodLabelContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnonymusMethodLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnonymusMethodLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnonymusMethodLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodDeclaration);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new DeafultmethodLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				deafultMethod();
				}
				break;
			case 2:
				_localctx = new AnonymusMethodLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				anonymosMethod();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeafultMethodContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public DeafultMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deafultMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeafultMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeafultMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeafultMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeafultMethodContext deafultMethod() throws RecognitionException {
		DeafultMethodContext _localctx = new DeafultMethodContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_deafultMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(477);
				match(ASYNC);
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(480);
				match(FUNCTION);
				}
			}

			setState(483);
			identifier();
			setState(484);
			match(LPAREN);
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(485);
				parameterList();
				}
				break;
			case 2:
				{
				setState(486);
				args();
				}
				break;
			}
			setState(489);
			match(RPAREN);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(490);
				typeAnnotation();
				}
			}

			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(493);
				blockStatement();
				}
				break;
			case ARROW:
				{
				setState(494);
				match(ARROW);
				setState(495);
				expressionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnonymosMethodContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public AnonymosMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymosMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnonymosMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnonymosMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnonymosMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymosMethodContext anonymosMethod() throws RecognitionException {
		AnonymosMethodContext _localctx = new AnonymosMethodContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_anonymosMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(498);
				match(ASYNC);
				}
			}

			setState(501);
			match(LPAREN);
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(502);
				parameterList();
				}
				break;
			case 2:
				{
				setState(503);
				args();
				}
				break;
			}
			setState(506);
			match(RPAREN);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(507);
				typeAnnotation();
				}
			}

			setState(510);
			match(ARROW);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(511);
				blockStatement();
				}
				break;
			case 2:
				{
				setState(512);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(515);
				parameter();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(516);
					match(COMMA);
					setState(517);
					parameter();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			identifier();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(526);
				typeAnnotation();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(527);
					match(EQUAL);
					setState(528);
					literal();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopControlStatmentLabelContext extends StatementContext {
		public LoopControlStatementContext loopControlStatement() {
			return getRuleContext(LoopControlStatementContext.class,0);
		}
		public LoopControlStatmentLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoopControlStatmentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoopControlStatmentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoopControlStatmentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatmentLabelContext extends StatementContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockStatmentLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockStatmentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockStatmentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockStatmentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclerrationLabelContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclerrationLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclerrationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclerrationLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclerrationLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatmentLabelContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopStatmentLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoopStatmentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoopStatmentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoopStatmentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatemntLabelContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionStatemntLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatemntLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatemntLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatemntLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatmentLabelContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatmentLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatmentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatmentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatmentLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new VariableDeclerrationLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new IfStatmentLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new BlockStatmentLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				blockStatement();
				}
				break;
			case 4:
				_localctx = new LoopStatmentLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new LoopControlStatmentLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				loopControlStatement();
				}
				break;
			case 6:
				_localctx = new ExpressionStatemntLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopControlStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(AngularParser.CONTINUE, 0); }
		public LoopControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoopControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoopControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoopControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopControlStatementContext loopControlStatement() throws RecognitionException {
		LoopControlStatementContext _localctx = new LoopControlStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_loopControlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementLabelContext extends LoopStatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStatementLabelContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfStatementLabelContext extends LoopStatementContext {
		public ForOfStatementContext forOfStatement() {
			return getRuleContext(ForOfStatementContext.class,0);
		}
		public ForOfStatementLabelContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForOfStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForOfStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForOfStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementLabelContext extends LoopStatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DoWhileStatementLabelContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementLabelContext extends LoopStatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStatementLabelContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_loopStatement);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new ForStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				forStatement();
				}
				break;
			case 2:
				_localctx = new WhileStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				whileStatement();
				}
				break;
			case 3:
				_localctx = new DoWhileStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				doWhileStatement();
				}
				break;
			case 4:
				_localctx = new ForOfStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				forOfStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ExpressionContext initialization;
		public ExpressionContext condition;
		public ExpressionContext update;
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(FOR);
			setState(550);
			match(LPAREN);
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
			case EXPORT:
				{
				setState(551);
				variableDeclaration();
				}
				break;
			case NEW:
			case THIS:
			case ASYNC:
			case PLUS:
			case MINUS:
			case NOT:
			case LPAREN:
			case LSBRACKET:
			case LCURLY:
			case SEMI:
			case Integer:
			case Float:
			case Boolean:
			case STRING:
			case Undefined:
			case Null:
			case IDENTIFIER:
				{
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
					{
					setState(552);
					((ForStatementContext)_localctx).initialization = expression(0);
					}
				}

				setState(555);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
				{
				setState(558);
				((ForStatementContext)_localctx).condition = expression(0);
				}
			}

			setState(561);
			match(SEMI);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
				{
				setState(562);
				((ForStatementContext)_localctx).update = expression(0);
				}
			}

			setState(565);
			match(RPAREN);
			setState(566);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(WHILE);
			setState(569);
			match(LPAREN);
			setState(570);
			expression(0);
			setState(571);
			match(RPAREN);
			setState(572);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(DO);
			setState(575);
			statement();
			setState(576);
			match(WHILE);
			setState(577);
			match(LPAREN);
			setState(578);
			expression(0);
			setState(579);
			match(RPAREN);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(580);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForOfStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public VariableDeclarationKeywordContext variableDeclarationKeyword() {
			return getRuleContext(VariableDeclarationKeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForOfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forOfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForOfStatementContext forOfStatement() throws RecognitionException {
		ForOfStatementContext _localctx = new ForOfStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forOfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(FOR);
			setState(584);
			match(LPAREN);
			setState(585);
			variableDeclarationKeyword();
			setState(586);
			identifier();
			setState(587);
			match(OF);
			setState(588);
			expression(0);
			setState(589);
			match(RPAREN);
			setState(590);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfSectionContext ifSection() {
			return getRuleContext(IfSectionContext.class,0);
		}
		public List<ElseIfSectionContext> elseIfSection() {
			return getRuleContexts(ElseIfSectionContext.class);
		}
		public ElseIfSectionContext elseIfSection(int i) {
			return getRuleContext(ElseIfSectionContext.class,i);
		}
		public ElseSectionContext elseSection() {
			return getRuleContext(ElseSectionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			ifSection();
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(593);
					elseIfSection();
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(599);
				elseSection();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfSectionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSectionContext ifSection() throws RecognitionException {
		IfSectionContext _localctx = new IfSectionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ifSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(IF);
			setState(603);
			match(LPAREN);
			setState(604);
			expression(0);
			setState(605);
			match(RPAREN);
			setState(606);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfSectionContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(AngularParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfSectionContext elseIfSection() throws RecognitionException {
		ElseIfSectionContext _localctx = new ElseIfSectionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elseIfSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(ELSEIF);
			setState(609);
			match(LPAREN);
			setState(610);
			expression(0);
			setState(611);
			match(RPAREN);
			setState(612);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseSectionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseSectionContext elseSection() throws RecognitionException {
		ElseSectionContext _localctx = new ElseSectionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elseSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(ELSE);
			setState(615);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(LCURLY);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36877620048402002L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1040405L) != 0)) {
				{
				{
				setState(618);
				statement();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext value;
		public IdentifierContext castedType;
		public VariableDeclarationKeywordContext variableDeclarationKeyword() {
			return getRuleContext(VariableDeclarationKeywordContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(626);
				match(EXPORT);
				}
			}

			setState(629);
			variableDeclarationKeyword();
			setState(630);
			((VariableDeclarationContext)_localctx).name = identifier();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(631);
				typeAnnotation();
				}
			}

			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(634);
				match(EQUAL);
				setState(635);
				((VariableDeclarationContext)_localctx).value = expression(0);
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(638);
				match(AS);
				setState(639);
				((VariableDeclarationContext)_localctx).castedType = identifier();
				}
			}

			setState(642);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationKeywordContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public VariableDeclarationKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationKeywordContext variableDeclarationKeyword() throws RecognitionException {
		VariableDeclarationKeywordContext _localctx = new VariableDeclarationKeywordContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableDeclarationKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 360448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			expression(0);
			setState(647);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreFixExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public PreFixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPreFixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPreFixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPreFixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnounymusMethodExprContext extends ExpressionContext {
		public AnonymosMethodContext anonymosMethod() {
			return getRuleContext(AnonymosMethodContext.class,0);
		}
		public AnounymusMethodExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnounymusMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnounymusMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnounymusMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(AngularParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(AngularParser.GREATER_THAN_OR_EQUAL, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ExpressionContext {
		public ExpressionContext variable;
		public ExpressionContext value;
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SafeNavExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SafeNavExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSafeNavExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSafeNavExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSafeNavExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(AngularParser.NOT, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexExprContext extends ExpressionContext {
		public ExpressionContext member;
		public ExpressionContext index;
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberIndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDotExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberDotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArthmaticOpExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(AngularParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public ArthmaticOpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArthmaticOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArthmaticOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArthmaticOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_TO() { return getToken(AngularParser.EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_TO3() { return getToken(AngularParser.EQUAL_TO3, 0); }
		public TerminalNode NOT_EQUAL2() { return getToken(AngularParser.NOT_EQUAL2, 0); }
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SafeIndexExprContext extends ExpressionContext {
		public ExpressionContext baseObject;
		public ExpressionContext indexObject;
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public List<TerminalNode> RSBRACKET() { return getTokens(AngularParser.RSBRACKET); }
		public TerminalNode RSBRACKET(int i) {
			return getToken(AngularParser.RSBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SafeIndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSafeIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSafeIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSafeIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostFixExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public PostFixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostFixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostFixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostFixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionAssignmentExprContext extends ExpressionContext {
		public ExpressionContext variable;
		public Token op;
		public ExpressionContext value;
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public AdditionAssignmentExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAdditionAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAdditionAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAdditionAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public LogicalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExprContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext true_;
		public ExpressionContext false_;
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				_localctx = new AnounymusMethodExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(650);
				anonymosMethod();
				}
				break;
			case 2:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(651);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(652);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36873221949095936L) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(653);
				expression(12);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				match(LPAREN);
				setState(655);
				expression(0);
				setState(656);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(662);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					{
					setState(658);
					match(MINUS);
					setState(659);
					match(MINUS);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(660);
					match(PLUS);
					setState(661);
					match(PLUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(664);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(665);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new MemberDotExprContext(new ExpressionContext(_parentctx, _parentState));
						((MemberDotExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(668);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(669);
						match(DOT);
						setState(670);
						((MemberDotExprContext)_localctx).right = expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ArthmaticOpExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArthmaticOpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(671);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(672);
						((ArthmaticOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724278030336L) != 0)) ) {
							((ArthmaticOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(673);
						((ArthmaticOpExprContext)_localctx).right = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(674);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(675);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606846976L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(676);
						((RelationalExprContext)_localctx).right = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(677);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(678);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1080863910568919040L) != 0)) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(679);
						((EqualityExprContext)_localctx).right = expression(10);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExprContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(681);
						((LogicalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(682);
						((LogicalExprContext)_localctx).right = expression(9);
						}
						break;
					case 6:
						{
						_localctx = new AssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						((AssignmentExprContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(684);
						match(EQUAL);
						setState(685);
						((AssignmentExprContext)_localctx).value = expression(8);
						}
						break;
					case 7:
						{
						_localctx = new AdditionAssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionAssignmentExprContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(687);
						((AdditionAssignmentExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditionAssignmentExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(688);
						match(EQUAL);
						setState(689);
						((AdditionAssignmentExprContext)_localctx).value = expression(7);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(691);
						match(QUESITIONMARK);
						setState(692);
						((TernaryExprContext)_localctx).true_ = expression(0);
						setState(693);
						match(COLON);
						setState(694);
						((TernaryExprContext)_localctx).false_ = expression(6);
						}
						break;
					case 9:
						{
						_localctx = new MemberIndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((MemberIndexExprContext)_localctx).member = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(697);
						match(LSBRACKET);
						setState(698);
						((MemberIndexExprContext)_localctx).index = expression(0);
						setState(699);
						match(RSBRACKET);
						}
						break;
					case 10:
						{
						_localctx = new CallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(702);
						match(LPAREN);
						setState(704);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
							{
							setState(703);
							args();
							}
						}

						setState(706);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new SafeNavExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(708);
						match(QUESITIONMARK);
						setState(709);
						match(DOT);
						setState(710);
						identifier();
						}
						break;
					case 12:
						{
						_localctx = new SafeIndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((SafeIndexExprContext)_localctx).baseObject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(712);
						match(QUESITIONMARK);
						setState(713);
						match(RSBRACKET);
						setState(714);
						((SafeIndexExprContext)_localctx).indexObject = expression(0);
						setState(715);
						match(RSBRACKET);
						}
						break;
					case 13:
						{
						_localctx = new PostFixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(722);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							{
							setState(718);
							match(MINUS);
							setState(719);
							match(MINUS);
							}
							}
							break;
						case PLUS:
							{
							{
							setState(720);
							match(PLUS);
							setState(721);
							match(PLUS);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapLiteralprimaryContext extends PrimaryContext {
		public MapLitralContext mapLitral() {
			return getRuleContext(MapLitralContext.class,0);
		}
		public MapLiteralprimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMapLiteralprimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMapLiteralprimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapLiteralprimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectinitprimaryContext extends PrimaryContext {
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public ObjectinitprimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectinitprimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectinitprimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectinitprimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralprimaryContext extends PrimaryContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralprimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteralprimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteralprimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteralprimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralprimaryContext extends PrimaryContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralprimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteralprimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteralprimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteralprimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierprimaryContext extends PrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierprimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierprimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierprimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierprimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralprimaryContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralprimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralprimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralprimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralprimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primary);
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new LiteralprimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				literal();
				}
				break;
			case 2:
				_localctx = new IdentifierprimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				identifier();
				}
				break;
			case 3:
				_localctx = new ArrayLiteralprimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				arrayLiteral();
				}
				break;
			case 4:
				_localctx = new MapLiteralprimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(732);
				mapLitral();
				}
				break;
			case 5:
				_localctx = new ObjectLiteralprimaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(733);
				objectLiteral();
				}
				break;
			case 6:
				_localctx = new ObjectinitprimaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(734);
				objectInit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(LSBRACKET);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
				{
				setState(738);
				expression(0);
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(739);
						match(COMMA);
						setState(740);
						expression(0);
						}
						} 
					}
					setState(745);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				}
			}

			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(748);
				match(COMMA);
				}
			}

			setState(751);
			match(RSBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(LCURLY);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(754);
				propertyAssignment();
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(755);
						match(COMMA);
						setState(756);
						propertyAssignment();
						}
						} 
					}
					setState(761);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
			}

			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(764);
				match(COMMA);
				}
			}

			setState(767);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInitContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInitContext objectInit() throws RecognitionException {
		ObjectInitContext _localctx = new ObjectInitContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(NEW);
			setState(770);
			identifier();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(771);
				match(LESS_THAN);
				setState(772);
				type();
				setState(773);
				match(GREATER_THAN);
				}
			}

			setState(777);
			match(LPAREN);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 1143937397294366723L) != 0)) {
				{
				setState(778);
				args();
				}
			}

			setState(781);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			identifier();
			setState(784);
			match(COLON);
			setState(785);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapLitralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<MapmemberContext> mapmember() {
			return getRuleContexts(MapmemberContext.class);
		}
		public MapmemberContext mapmember(int i) {
			return getRuleContext(MapmemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public MapLitralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLitral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMapLitral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMapLitral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapLitral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLitralContext mapLitral() throws RecognitionException {
		MapLitralContext _localctx = new MapLitralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mapLitral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(LCURLY);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(788);
				mapmember();
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(789);
						match(COMMA);
						setState(790);
						mapmember();
						}
						} 
					}
					setState(795);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(798);
				match(COMMA);
				}
			}

			setState(801);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapmemberContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapmemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapmember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMapmember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMapmember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapmember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapmemberContext mapmember() throws RecognitionException {
		MapmemberContext _localctx = new MapmemberContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_mapmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(STRING);
			setState(804);
			match(COLON);
			setState(805);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			expression(0);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(810);
				match(COMMA);
				setState(811);
				expression(0);
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public TerminalNode Null() { return getToken(AngularParser.Null, 0); }
		public TerminalNode Undefined() { return getToken(AngularParser.Undefined, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_literal);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(STRING);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(819);
				match(Boolean);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 4);
				{
				setState(820);
				match(Null);
				}
				break;
			case Undefined:
				enterOuterAlt(_localctx, 5);
				{
				setState(821);
				match(Undefined);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(AngularParser.Integer, 0); }
		public TerminalNode Float() { return getToken(AngularParser.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(COLON);
			setState(827);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRINGKEYWORD() { return getToken(AngularParser.STRINGKEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode BOOLEANKEYWORD() { return getToken(AngularParser.BOOLEANKEYWORD, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_type);
		int _la;
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(STRINGKEYWORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				match(BOOLEANKEYWORD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				match(ANY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				match(ANY);
				setState(834);
				match(LSBRACKET);
				setState(835);
				match(RSBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(836);
				match(IDENTIFIER);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(837);
					match(LESS_THAN);
					setState(838);
					type();
					setState(839);
					match(GREATER_THAN);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(845);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001l\u0351\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u009c"+
		"\b\u0000\n\u0000\f\u0000\u009f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00a9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00dc\b\t\n\t\f\t\u00df\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u00e4\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00ef\b\f\n\f\f\f\u00f2\t\f\u0001\f\u0003"+
		"\f\u00f5\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00fe\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u010c\b\u0010\n\u0010\f\u0010\u010f\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0119\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u012a\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u012f\b\u0017\n\u0017\f\u0017\u0132\t\u0017\u0001\u0017\u0003\u0017"+
		"\u0135\b\u0017\u0001\u0018\u0003\u0018\u0138\b\u0018\u0001\u0018\u0003"+
		"\u0018\u013b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0143\b\u0018\n\u0018\f\u0018\u0146\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u014a\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u014e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0154\b\u0018\n\u0018\f\u0018\u0157\t\u0018\u0003\u0018\u0159"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0160\b\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0164\b\u001a"+
		"\n\u001a\f\u001a\u0167\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0003"+
		"\u001b\u016c\b\u001b\u0001\u001b\u0003\u001b\u016f\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u017b\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0180\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0186\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u018b\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u018f\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0196"+
		"\b \u0001 \u0003 \u0199\b \u0001 \u0001 \u0003 \u019d\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01a8\b!\u0001"+
		"!\u0001!\u0001!\u0003!\u01ad\b!\u0001!\u0001!\u0001\"\u0001\"\u0003\""+
		"\u01b3\b\"\u0001#\u0001#\u0001#\u0003#\u01b8\b#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u01bf\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u01c6"+
		"\b$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0003&\u01d0"+
		"\b&\u0001&\u0001&\u0003&\u01d4\b&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0003(\u01dc\b(\u0001)\u0003)\u01df\b)\u0001)\u0003)\u01e2\b"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01e8\b)\u0001)\u0001)\u0003)\u01ec"+
		"\b)\u0001)\u0001)\u0001)\u0003)\u01f1\b)\u0001*\u0003*\u01f4\b*\u0001"+
		"*\u0001*\u0001*\u0003*\u01f9\b*\u0001*\u0001*\u0003*\u01fd\b*\u0001*\u0001"+
		"*\u0001*\u0003*\u0202\b*\u0001+\u0001+\u0001+\u0005+\u0207\b+\n+\f+\u020a"+
		"\t+\u0003+\u020c\b+\u0001,\u0001,\u0001,\u0001,\u0003,\u0212\b,\u0003"+
		",\u0214\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u021c\b-\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0003/\u0224\b/\u00010\u00010\u0001"+
		"0\u00010\u00030\u022a\b0\u00010\u00030\u022d\b0\u00010\u00030\u0230\b"+
		"0\u00010\u00010\u00030\u0234\b0\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0246\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00054\u0253\b4\n4\f4\u0256\t4\u00014\u00034\u0259"+
		"\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00018\u00018\u00058\u026c\b8\n8"+
		"\f8\u026f\t8\u00018\u00018\u00019\u00039\u0274\b9\u00019\u00019\u0001"+
		"9\u00039\u0279\b9\u00019\u00019\u00039\u027d\b9\u00019\u00019\u00039\u0281"+
		"\b9\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u0297\b<\u0001<\u0001<\u0003<\u029b\b<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u02c1\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u02d3\b<\u0005<\u02d5\b<\n<\f<\u02d8\t<\u0001=\u0001=\u0001="+
		"\u0001=\u0001=\u0001=\u0003=\u02e0\b=\u0001>\u0001>\u0001>\u0001>\u0005"+
		">\u02e6\b>\n>\f>\u02e9\t>\u0003>\u02eb\b>\u0001>\u0003>\u02ee\b>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001?\u0005?\u02f6\b?\n?\f?\u02f9\t?\u0003"+
		"?\u02fb\b?\u0001?\u0003?\u02fe\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0003@\u0308\b@\u0001@\u0001@\u0003@\u030c\b@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0005B\u0318"+
		"\bB\nB\fB\u031b\tB\u0003B\u031d\bB\u0001B\u0003B\u0320\bB\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0005"+
		"E\u032d\bE\nE\fE\u0330\tE\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0337"+
		"\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u034a\bI\u0003"+
		"I\u034c\bI\u0001J\u0003J\u034f\bJ\u0001J\u0000\u0001xK\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0000\f\u0002\u0000&(ll\u0001"+
		"\u0000,-\u0001\u0000#%\u0001\u0000\t\n\u0002\u0000\u000f\u0010\u0012\u0012"+
		"\u0002\u00000177\u0001\u000004\u0001\u0000<?\u0001\u00008;\u0001\u0000"+
		"56\u0001\u000001\u0001\u0000MN\u0392\u0000\u009d\u0001\u0000\u0000\u0000"+
		"\u0002\u00a8\u0001\u0000\u0000\u0000\u0004\u00aa\u0001\u0000\u0000\u0000"+
		"\u0006\u00ae\u0001\u0000\u0000\u0000\b\u00b4\u0001\u0000\u0000\u0000\n"+
		"\u00bc\u0001\u0000\u0000\u0000\f\u00c2\u0001\u0000\u0000\u0000\u000e\u00ca"+
		"\u0001\u0000\u0000\u0000\u0010\u00d4\u0001\u0000\u0000\u0000\u0012\u00d8"+
		"\u0001\u0000\u0000\u0000\u0014\u00e0\u0001\u0000\u0000\u0000\u0016\u00e5"+
		"\u0001\u0000\u0000\u0000\u0018\u00ea\u0001\u0000\u0000\u0000\u001a\u00fd"+
		"\u0001\u0000\u0000\u0000\u001c\u00ff\u0001\u0000\u0000\u0000\u001e\u0103"+
		"\u0001\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000\"\u0112\u0001"+
		"\u0000\u0000\u0000$\u0118\u0001\u0000\u0000\u0000&\u011a\u0001\u0000\u0000"+
		"\u0000(\u011e\u0001\u0000\u0000\u0000*\u0122\u0001\u0000\u0000\u0000,"+
		"\u0124\u0001\u0000\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u0137\u0001"+
		"\u0000\u0000\u00002\u015c\u0001\u0000\u0000\u00004\u0161\u0001\u0000\u0000"+
		"\u00006\u016b\u0001\u0000\u0000\u00008\u0172\u0001\u0000\u0000\u0000:"+
		"\u017a\u0001\u0000\u0000\u0000<\u017f\u0001\u0000\u0000\u0000>\u0181\u0001"+
		"\u0000\u0000\u0000@\u0192\u0001\u0000\u0000\u0000B\u01a2\u0001\u0000\u0000"+
		"\u0000D\u01b2\u0001\u0000\u0000\u0000F\u01b4\u0001\u0000\u0000\u0000H"+
		"\u01c2\u0001\u0000\u0000\u0000J\u01ca\u0001\u0000\u0000\u0000L\u01cd\u0001"+
		"\u0000\u0000\u0000N\u01d7\u0001\u0000\u0000\u0000P\u01db\u0001\u0000\u0000"+
		"\u0000R\u01de\u0001\u0000\u0000\u0000T\u01f3\u0001\u0000\u0000\u0000V"+
		"\u020b\u0001\u0000\u0000\u0000X\u020d\u0001\u0000\u0000\u0000Z\u021b\u0001"+
		"\u0000\u0000\u0000\\\u021d\u0001\u0000\u0000\u0000^\u0223\u0001\u0000"+
		"\u0000\u0000`\u0225\u0001\u0000\u0000\u0000b\u0238\u0001\u0000\u0000\u0000"+
		"d\u023e\u0001\u0000\u0000\u0000f\u0247\u0001\u0000\u0000\u0000h\u0250"+
		"\u0001\u0000\u0000\u0000j\u025a\u0001\u0000\u0000\u0000l\u0260\u0001\u0000"+
		"\u0000\u0000n\u0266\u0001\u0000\u0000\u0000p\u0269\u0001\u0000\u0000\u0000"+
		"r\u0273\u0001\u0000\u0000\u0000t\u0284\u0001\u0000\u0000\u0000v\u0286"+
		"\u0001\u0000\u0000\u0000x\u029a\u0001\u0000\u0000\u0000z\u02df\u0001\u0000"+
		"\u0000\u0000|\u02e1\u0001\u0000\u0000\u0000~\u02f1\u0001\u0000\u0000\u0000"+
		"\u0080\u0301\u0001\u0000\u0000\u0000\u0082\u030f\u0001\u0000\u0000\u0000"+
		"\u0084\u0313\u0001\u0000\u0000\u0000\u0086\u0323\u0001\u0000\u0000\u0000"+
		"\u0088\u0327\u0001\u0000\u0000\u0000\u008a\u0329\u0001\u0000\u0000\u0000"+
		"\u008c\u0336\u0001\u0000\u0000\u0000\u008e\u0338\u0001\u0000\u0000\u0000"+
		"\u0090\u033a\u0001\u0000\u0000\u0000\u0092\u034b\u0001\u0000\u0000\u0000"+
		"\u0094\u034e\u0001\u0000\u0000\u0000\u0096\u009c\u0003\u0002\u0001\u0000"+
		"\u0097\u009c\u0003\u0016\u000b\u0000\u0098\u009c\u00030\u0018\u0000\u0099"+
		"\u009c\u0003Z-\u0000\u009a\u009c\u0003P(\u0000\u009b\u0096\u0001\u0000"+
		"\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0000"+
		"\u0000\u0001\u00a1\u0001\u0001\u0000\u0000\u0000\u00a2\u00a9\u0003\u0006"+
		"\u0003\u0000\u00a3\u00a9\u0003\b\u0004\u0000\u00a4\u00a9\u0003\n\u0005"+
		"\u0000\u00a5\u00a9\u0003\f\u0006\u0000\u00a6\u00a9\u0003\u000e\u0007\u0000"+
		"\u00a7\u00a9\u0003\u0004\u0002\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u0003\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0014\u0000\u0000\u00ab\u00ac\u0005P\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0094J\u0000\u00ad\u0005\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0014\u0000\u0000\u00af\u00b0\u0003\u0088D\u0000\u00b0\u00b1\u0005"+
		"\u0017\u0000\u0000\u00b1\u00b2\u0005P\u0000\u0000\u00b2\u00b3\u0003\u0094"+
		"J\u0000\u00b3\u0007\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0014\u0000"+
		"\u0000\u00b5\u00b6\u00052\u0000\u0000\u00b6\u00b7\u0005\u0016\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0088D\u0000\u00b8\u00b9\u0005\u0017\u0000\u0000\u00b9"+
		"\u00ba\u0005P\u0000\u0000\u00ba\u00bb\u0003\u0094J\u0000\u00bb\t\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0014\u0000\u0000\u00bd\u00be\u0003"+
		"\u0010\b\u0000\u00be\u00bf\u0005\u0017\u0000\u0000\u00bf\u00c0\u0005P"+
		"\u0000\u0000\u00c0\u00c1\u0003\u0094J\u0000\u00c1\u000b\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0014\u0000\u0000\u00c3\u00c4\u0003\u0088D\u0000"+
		"\u00c4\u00c5\u0005F\u0000\u0000\u00c5\u00c6\u0003\u0010\b\u0000\u00c6"+
		"\u00c7\u0005\u0017\u0000\u0000\u00c7\u00c8\u0005P\u0000\u0000\u00c8\u00c9"+
		"\u0003\u0094J\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"\u0014\u0000\u0000\u00cb\u00cc\u0003\u0088D\u0000\u00cc\u00cd\u0005F\u0000"+
		"\u0000\u00cd\u00ce\u00052\u0000\u0000\u00ce\u00cf\u0005\u0016\u0000\u0000"+
		"\u00cf\u00d0\u0003\u0088D\u0000\u00d0\u00d1\u0005\u0017\u0000\u0000\u00d1"+
		"\u00d2\u0005P\u0000\u0000\u00d2\u00d3\u0003\u0094J\u0000\u00d3\u000f\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005D\u0000\u0000\u00d5\u00d6\u0003\u0012"+
		"\t\u0000\u00d6\u00d7\u0005E\u0000\u0000\u00d7\u0011\u0001\u0000\u0000"+
		"\u0000\u00d8\u00dd\u0003\u0014\n\u0000\u00d9\u00da\u0005F\u0000\u0000"+
		"\u00da\u00dc\u0003\u0014\n\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u0013\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0003\u0088D\u0000\u00e1\u00e2"+
		"\u0005\u0016\u0000\u0000\u00e2\u00e4\u0003\u0088D\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u0015\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005W\u0000\u0000\u00e6\u00e7\u0005i\u0000"+
		"\u0000\u00e7\u00e8\u0003\u0018\f\u0000\u00e8\u00e9\u0005k\u0000\u0000"+
		"\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005g\u0000\u0000\u00eb"+
		"\u00f0\u0003\u001a\r\u0000\u00ec\u00ed\u0005d\u0000\u0000\u00ed\u00ef"+
		"\u0003\u001a\r\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0005d\u0000\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005h\u0000\u0000\u00f7\u0019\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fe\u0003\"\u0011\u0000\u00f9\u00fe\u0003$\u0012\u0000"+
		"\u00fa\u00fe\u0003,\u0016\u0000\u00fb\u00fe\u0003\u001c\u000e\u0000\u00fc"+
		"\u00fe\u0003\u001e\u000f\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u001b\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\\\u0000\u0000\u0100\u0101"+
		"\u0005c\u0000\u0000\u0101\u0102\u0005b\u0000\u0000\u0102\u001d\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0005`\u0000\u0000\u0104\u0105\u0005c\u0000\u0000"+
		"\u0105\u0106\u0003 \u0010\u0000\u0106\u001f\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005e\u0000\u0000\u0108\u010d\u0005j\u0000\u0000\u0109\u010a\u0005"+
		"d\u0000\u0000\u010a\u010c\u0005j\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005f\u0000\u0000"+
		"\u0111!\u0001\u0000\u0000\u0000\u0112\u0113\u0005[\u0000\u0000\u0113\u0114"+
		"\u0005c\u0000\u0000\u0114\u0115\u0005a\u0000\u0000\u0115#\u0001\u0000"+
		"\u0000\u0000\u0116\u0119\u0003&\u0013\u0000\u0117\u0119\u0003(\u0014\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u0119%\u0001\u0000\u0000\u0000\u011a\u011b\u0005^\u0000\u0000\u011b\u011c"+
		"\u0005c\u0000\u0000\u011c\u011d\u0005a\u0000\u0000\u011d\'\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005_\u0000\u0000\u011f\u0120\u0005c\u0000\u0000"+
		"\u0120\u0121\u0003*\u0015\u0000\u0121)\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005a\u0000\u0000\u0123+\u0001\u0000\u0000\u0000\u0124\u0125\u0003."+
		"\u0017\u0000\u0125-\u0001\u0000\u0000\u0000\u0126\u0127\u0005]\u0000\u0000"+
		"\u0127\u0129\u0005c\u0000\u0000\u0128\u012a\u0005e\u0000\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u0130\u0005a\u0000\u0000\u012c\u012d\u0005"+
		"d\u0000\u0000\u012d\u012f\u0005a\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0005f\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135/\u0001\u0000\u0000\u0000\u0136\u0138\u0005\u0015\u0000\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0005(\u0000\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0013\u0000\u0000\u013d\u0149"+
		"\u0003\u0088D\u0000\u013e\u013f\u0005=\u0000\u0000\u013f\u0144\u00032"+
		"\u0019\u0000\u0140\u0141\u0005F\u0000\u0000\u0141\u0143\u00032\u0019\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005<\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u013e\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014d\u0001\u0000\u0000\u0000\u014b\u014c\u0005+\u0000\u0000\u014c\u014e"+
		"\u0003\u0088D\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u0158\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"\u001a\u0000\u0000\u0150\u0155\u0003\u0088D\u0000\u0151\u0152\u0005F\u0000"+
		"\u0000\u0152\u0154\u0003\u0088D\u0000\u0153\u0151\u0001\u0000\u0000\u0000"+
		"\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u014f\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u00034\u001a\u0000\u015b1\u0001\u0000\u0000\u0000\u015c\u015f"+
		"\u0003\u0088D\u0000\u015d\u015e\u0005+\u0000\u0000\u015e\u0160\u0003\u0088"+
		"D\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u01603\u0001\u0000\u0000\u0000\u0161\u0165\u0005D\u0000\u0000\u0162"+
		"\u0164\u00036\u001b\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0005E\u0000\u0000\u01695\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0003N\'\u0000\u016b\u016a\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u016f\u00038\u001c\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0003:\u001d\u0000\u01717\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0007\u0000\u0000\u0000\u01739\u0001\u0000\u0000\u0000\u0174\u017b\u0003"+
		"L&\u0000\u0175\u017b\u0003P(\u0000\u0176\u017b\u0003r9\u0000\u0177\u017b"+
		"\u0003D\"\u0000\u0178\u017b\u0003J%\u0000\u0179\u017b\u0003<\u001e\u0000"+
		"\u017a\u0174\u0001\u0000\u0000\u0000\u017a\u0175\u0001\u0000\u0000\u0000"+
		"\u017a\u0176\u0001\u0000\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000"+
		"\u017b;\u0001\u0000\u0000\u0000\u017c\u0180\u0003>\u001f\u0000\u017d\u0180"+
		"\u0003@ \u0000\u017e\u0180\u0003B!\u0000\u017f\u017c\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u0180=\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u001f\u0000\u0000"+
		"\u0182\u0185\u0005@\u0000\u0000\u0183\u0186\u0005P\u0000\u0000\u0184\u0186"+
		"\u0003~?\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0184\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0005A\u0000\u0000\u0188\u018a\u0003\u0088D\u0000"+
		"\u0189\u018b\u0003\u0090H\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0005.\u0000\u0000\u018d\u018f\u0003x<\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0003\u0094J\u0000\u0191?\u0001\u0000\u0000"+
		"\u0000\u0192\u0198\u0005 \u0000\u0000\u0193\u0195\u0005@\u0000\u0000\u0194"+
		"\u0196\u0005P\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199"+
		"\u0005A\u0000\u0000\u0198\u0193\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0003"+
		"\u0088D\u0000\u019b\u019d\u0003\u0090H\u0000\u019c\u019b\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0005.\u0000\u0000\u019f\u01a0\u0003\u0080@\u0000\u01a0"+
		"\u01a1\u0003\u0094J\u0000\u01a1A\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		"!\u0000\u0000\u01a3\u01a4\u0005@\u0000\u0000\u01a4\u01a7\u0005P\u0000"+
		"\u0000\u01a5\u01a6\u0005F\u0000\u0000\u01a6\u01a8\u0003~?\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005A\u0000\u0000\u01aa\u01ac"+
		"\u0003\u0088D\u0000\u01ab\u01ad\u0003\u0090H\u0000\u01ac\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0003\u0094J\u0000\u01afC\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b3\u0003H$\u0000\u01b1\u01b3\u0003F#\u0000\u01b2\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3E\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005\u0011\u0000\u0000\u01b5\u01b7\u0005@\u0000"+
		"\u0000\u01b6\u01b8\u0003V+\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005A\u0000\u0000\u01ba\u01bb\u0005H\u0000\u0000\u01bb\u01bc\u0005"+
		"\u0019\u0000\u0000\u01bc\u01be\u0005@\u0000\u0000\u01bd\u01bf\u0003\u008a"+
		"E\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005A\u0000\u0000"+
		"\u01c1G\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0011\u0000\u0000\u01c3"+
		"\u01c5\u0005@\u0000\u0000\u01c4\u01c6\u0003V+\u0000\u01c5\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0005A\u0000\u0000\u01c8\u01c9\u0003p8"+
		"\u0000\u01c9I\u0001\u0000\u0000\u0000\u01ca\u01cb\u0007\u0001\u0000\u0000"+
		"\u01cb\u01cc\u0003R)\u0000\u01ccK\u0001\u0000\u0000\u0000\u01cd\u01cf"+
		"\u0003\u0088D\u0000\u01ce\u01d0\u0003\u0090H\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0005.\u0000\u0000\u01d2\u01d4\u0003x<\u0000"+
		"\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005G\u0000\u0000\u01d6"+
		"M\u0001\u0000\u0000\u0000\u01d7\u01d8\u0007\u0002\u0000\u0000\u01d8O\u0001"+
		"\u0000\u0000\u0000\u01d9\u01dc\u0003R)\u0000\u01da\u01dc\u0003T*\u0000"+
		"\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000"+
		"\u01dcQ\u0001\u0000\u0000\u0000\u01dd\u01df\u0005*\u0000\u0000\u01de\u01dd"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e2\u0005\r\u0000\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0003\u0088D\u0000\u01e4\u01e7\u0005@\u0000"+
		"\u0000\u01e5\u01e8\u0003V+\u0000\u01e6\u01e8\u0003\u008aE\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01eb\u0005A\u0000\u0000\u01ea\u01ec\u0003\u0090H\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01f0\u0001"+
		"\u0000\u0000\u0000\u01ed\u01f1\u0003p8\u0000\u01ee\u01ef\u0005/\u0000"+
		"\u0000\u01ef\u01f1\u0003v;\u0000\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f0"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f1S\u0001\u0000\u0000\u0000\u01f2\u01f4"+
		"\u0005*\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f8\u0005"+
		"@\u0000\u0000\u01f6\u01f9\u0003V+\u0000\u01f7\u01f9\u0003\u008aE\u0000"+
		"\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fc\u0005A\u0000\u0000\u01fb\u01fd\u0003\u0090H\u0000\u01fc\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u0201\u0005/\u0000\u0000\u01ff\u0202\u0003"+
		"p8\u0000\u0200\u0202\u0003v;\u0000\u0201\u01ff\u0001\u0000\u0000\u0000"+
		"\u0201\u0200\u0001\u0000\u0000\u0000\u0202U\u0001\u0000\u0000\u0000\u0203"+
		"\u0208\u0003X,\u0000\u0204\u0205\u0005F\u0000\u0000\u0205\u0207\u0003"+
		"X,\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000"+
		"\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000"+
		"\u0000\u020b\u0203\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020cW\u0001\u0000\u0000\u0000\u020d\u0213\u0003\u0088D\u0000\u020e"+
		"\u0211\u0003\u0090H\u0000\u020f\u0210\u0005.\u0000\u0000\u0210\u0212\u0003"+
		"\u008cF\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000"+
		"\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u020e\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214Y\u0001\u0000\u0000"+
		"\u0000\u0215\u021c\u0003r9\u0000\u0216\u021c\u0003h4\u0000\u0217\u021c"+
		"\u0003p8\u0000\u0218\u021c\u0003^/\u0000\u0219\u021c\u0003\\.\u0000\u021a"+
		"\u021c\u0003v;\u0000\u021b\u0215\u0001\u0000\u0000\u0000\u021b\u0216\u0001"+
		"\u0000\u0000\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021b\u0218\u0001"+
		"\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021c[\u0001\u0000\u0000\u0000\u021d\u021e\u0007\u0003"+
		"\u0000\u0000\u021e]\u0001\u0000\u0000\u0000\u021f\u0224\u0003`0\u0000"+
		"\u0220\u0224\u0003b1\u0000\u0221\u0224\u0003d2\u0000\u0222\u0224\u0003"+
		"f3\u0000\u0223\u021f\u0001\u0000\u0000\u0000\u0223\u0220\u0001\u0000\u0000"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0222\u0001\u0000\u0000"+
		"\u0000\u0224_\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u0004\u0000\u0000"+
		"\u0226\u022c\u0005@\u0000\u0000\u0227\u022d\u0003r9\u0000\u0228\u022a"+
		"\u0003x<\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022d\u0005G\u0000"+
		"\u0000\u022c\u0227\u0001\u0000\u0000\u0000\u022c\u0229\u0001\u0000\u0000"+
		"\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u0230\u0003x<\u0000\u022f"+
		"\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0233\u0005G\u0000\u0000\u0232\u0234"+
		"\u0003x<\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0005A\u0000"+
		"\u0000\u0236\u0237\u0003Z-\u0000\u0237a\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\u0005\u0006\u0000\u0000\u0239\u023a\u0005@\u0000\u0000\u023a\u023b"+
		"\u0003x<\u0000\u023b\u023c\u0005A\u0000\u0000\u023c\u023d\u0003Z-\u0000"+
		"\u023dc\u0001\u0000\u0000\u0000\u023e\u023f\u0005\f\u0000\u0000\u023f"+
		"\u0240\u0003Z-\u0000\u0240\u0241\u0005\u0006\u0000\u0000\u0241\u0242\u0005"+
		"@\u0000\u0000\u0242\u0243\u0003x<\u0000\u0243\u0245\u0005A\u0000\u0000"+
		"\u0244\u0246\u0005G\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0001\u0000\u0000\u0000\u0246e\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0005\u0004\u0000\u0000\u0248\u0249\u0005@\u0000\u0000\u0249\u024a\u0003"+
		"t:\u0000\u024a\u024b\u0003\u0088D\u0000\u024b\u024c\u0005\u0005\u0000"+
		"\u0000\u024c\u024d\u0003x<\u0000\u024d\u024e\u0005A\u0000\u0000\u024e"+
		"\u024f\u0003Z-\u0000\u024fg\u0001\u0000\u0000\u0000\u0250\u0254\u0003"+
		"j5\u0000\u0251\u0253\u0003l6\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000"+
		"\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000"+
		"\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u0259\u0003n7\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259i\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0005\u0001\u0000\u0000\u025b\u025c\u0005"+
		"@\u0000\u0000\u025c\u025d\u0003x<\u0000\u025d\u025e\u0005A\u0000\u0000"+
		"\u025e\u025f\u0003Z-\u0000\u025fk\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0005\u0002\u0000\u0000\u0261\u0262\u0005@\u0000\u0000\u0262\u0263\u0003"+
		"x<\u0000\u0263\u0264\u0005A\u0000\u0000\u0264\u0265\u0003Z-\u0000\u0265"+
		"m\u0001\u0000\u0000\u0000\u0266\u0267\u0005\u0003\u0000\u0000\u0267\u0268"+
		"\u0003Z-\u0000\u0268o\u0001\u0000\u0000\u0000\u0269\u026d\u0005D\u0000"+
		"\u0000\u026a\u026c\u0003Z-\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026c"+
		"\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d"+
		"\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f"+
		"\u026d\u0001\u0000\u0000\u0000\u0270\u0271\u0005E\u0000\u0000\u0271q\u0001"+
		"\u0000\u0000\u0000\u0272\u0274\u0005\u0015\u0000\u0000\u0273\u0272\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0276\u0003t:\u0000\u0276\u0278\u0003\u0088D"+
		"\u0000\u0277\u0279\u0003\u0090H\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0005.\u0000\u0000\u027b\u027d\u0003x<\u0000\u027c\u027a"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u0280"+
		"\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u0016\u0000\u0000\u027f\u0281"+
		"\u0003\u0088D\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0005"+
		"G\u0000\u0000\u0283s\u0001\u0000\u0000\u0000\u0284\u0285\u0007\u0004\u0000"+
		"\u0000\u0285u\u0001\u0000\u0000\u0000\u0286\u0287\u0003x<\u0000\u0287"+
		"\u0288\u0003\u0094J\u0000\u0288w\u0001\u0000\u0000\u0000\u0289\u028a\u0006"+
		"<\uffff\uffff\u0000\u028a\u029b\u0003T*\u0000\u028b\u029b\u0005\u0019"+
		"\u0000\u0000\u028c\u028d\u0007\u0005\u0000\u0000\u028d\u029b\u0003x<\f"+
		"\u028e\u028f\u0005@\u0000\u0000\u028f\u0290\u0003x<\u0000\u0290\u0291"+
		"\u0005A\u0000\u0000\u0291\u029b\u0001\u0000\u0000\u0000\u0292\u0293\u0005"+
		"1\u0000\u0000\u0293\u0297\u00051\u0000\u0000\u0294\u0295\u00050\u0000"+
		"\u0000\u0295\u0297\u00050\u0000\u0000\u0296\u0292\u0001\u0000\u0000\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000"+
		"\u0298\u029b\u0003x<\u0002\u0299\u029b\u0003z=\u0000\u029a\u0289\u0001"+
		"\u0000\u0000\u0000\u029a\u028b\u0001\u0000\u0000\u0000\u029a\u028c\u0001"+
		"\u0000\u0000\u0000\u029a\u028e\u0001\u0000\u0000\u0000\u029a\u0296\u0001"+
		"\u0000\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029b\u02d6\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\n\u0011\u0000\u0000\u029d\u029e\u0005I"+
		"\u0000\u0000\u029e\u02d5\u0003x<\u0012\u029f\u02a0\n\u000b\u0000\u0000"+
		"\u02a0\u02a1\u0007\u0006\u0000\u0000\u02a1\u02d5\u0003x<\f\u02a2\u02a3"+
		"\n\n\u0000\u0000\u02a3\u02a4\u0007\u0007\u0000\u0000\u02a4\u02d5\u0003"+
		"x<\u000b\u02a5\u02a6\n\t\u0000\u0000\u02a6\u02a7\u0007\b\u0000\u0000\u02a7"+
		"\u02d5\u0003x<\n\u02a8\u02a9\n\b\u0000\u0000\u02a9\u02aa\u0007\t\u0000"+
		"\u0000\u02aa\u02d5\u0003x<\t\u02ab\u02ac\n\u0007\u0000\u0000\u02ac\u02ad"+
		"\u0005.\u0000\u0000\u02ad\u02d5\u0003x<\b\u02ae\u02af\n\u0006\u0000\u0000"+
		"\u02af\u02b0\u0007\n\u0000\u0000\u02b0\u02b1\u0005.\u0000\u0000\u02b1"+
		"\u02d5\u0003x<\u0007\u02b2\u02b3\n\u0005\u0000\u0000\u02b3\u02b4\u0005"+
		"K\u0000\u0000\u02b4\u02b5\u0003x<\u0000\u02b5\u02b6\u0005H\u0000\u0000"+
		"\u02b6\u02b7\u0003x<\u0006\u02b7\u02d5\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\n\u0010\u0000\u0000\u02b9\u02ba\u0005B\u0000\u0000\u02ba\u02bb\u0003"+
		"x<\u0000\u02bb\u02bc\u0005C\u0000\u0000\u02bc\u02d5\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\n\u000f\u0000\u0000\u02be\u02c0\u0005@\u0000\u0000"+
		"\u02bf\u02c1\u0003\u008aE\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2"+
		"\u02d5\u0005A\u0000\u0000\u02c3\u02c4\n\u000e\u0000\u0000\u02c4\u02c5"+
		"\u0005K\u0000\u0000\u02c5\u02c6\u0005I\u0000\u0000\u02c6\u02d5\u0003\u0088"+
		"D\u0000\u02c7\u02c8\n\r\u0000\u0000\u02c8\u02c9\u0005K\u0000\u0000\u02c9"+
		"\u02ca\u0005C\u0000\u0000\u02ca\u02cb\u0003x<\u0000\u02cb\u02cc\u0005"+
		"C\u0000\u0000\u02cc\u02d5\u0001\u0000\u0000\u0000\u02cd\u02d2\n\u0003"+
		"\u0000\u0000\u02ce\u02cf\u00051\u0000\u0000\u02cf\u02d3\u00051\u0000\u0000"+
		"\u02d0\u02d1\u00050\u0000\u0000\u02d1\u02d3\u00050\u0000\u0000\u02d2\u02ce"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d4\u029c\u0001\u0000\u0000\u0000\u02d4\u029f"+
		"\u0001\u0000\u0000\u0000\u02d4\u02a2\u0001\u0000\u0000\u0000\u02d4\u02a5"+
		"\u0001\u0000\u0000\u0000\u02d4\u02a8\u0001\u0000\u0000\u0000\u02d4\u02ab"+
		"\u0001\u0000\u0000\u0000\u02d4\u02ae\u0001\u0000\u0000\u0000\u02d4\u02b2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02b8\u0001\u0000\u0000\u0000\u02d4\u02bd"+
		"\u0001\u0000\u0000\u0000\u02d4\u02c3\u0001\u0000\u0000\u0000\u02d4\u02c7"+
		"\u0001\u0000\u0000\u0000\u02d4\u02cd\u0001\u0000\u0000\u0000\u02d5\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d7y\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d9\u02e0\u0003\u008cF\u0000\u02da\u02e0\u0003\u0088"+
		"D\u0000\u02db\u02e0\u0003|>\u0000\u02dc\u02e0\u0003\u0084B\u0000\u02dd"+
		"\u02e0\u0003~?\u0000\u02de\u02e0\u0003\u0080@\u0000\u02df\u02d9\u0001"+
		"\u0000\u0000\u0000\u02df\u02da\u0001\u0000\u0000\u0000\u02df\u02db\u0001"+
		"\u0000\u0000\u0000\u02df\u02dc\u0001\u0000\u0000\u0000\u02df\u02dd\u0001"+
		"\u0000\u0000\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02e0{\u0001\u0000"+
		"\u0000\u0000\u02e1\u02ea\u0005B\u0000\u0000\u02e2\u02e7\u0003x<\u0000"+
		"\u02e3\u02e4\u0005F\u0000\u0000\u02e4\u02e6\u0003x<\u0000\u02e5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02eb"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea\u02e2"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ee\u0005F\u0000\u0000\u02ed\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005C\u0000\u0000\u02f0}\u0001\u0000\u0000"+
		"\u0000\u02f1\u02fa\u0005D\u0000\u0000\u02f2\u02f7\u0003\u0082A\u0000\u02f3"+
		"\u02f4\u0005F\u0000\u0000\u02f4\u02f6\u0003\u0082A\u0000\u02f5\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fb\u0001"+
		"\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02f2\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fe\u0005F\u0000\u0000\u02fd\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0005E\u0000\u0000\u0300\u007f\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0005\u0018\u0000\u0000\u0302\u0307\u0003\u0088D\u0000"+
		"\u0303\u0304\u0005=\u0000\u0000\u0304\u0305\u0003\u0092I\u0000\u0305\u0306"+
		"\u0005<\u0000\u0000\u0306\u0308\u0001\u0000\u0000\u0000\u0307\u0303\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u0309\u0001"+
		"\u0000\u0000\u0000\u0309\u030b\u0005@\u0000\u0000\u030a\u030c\u0003\u008a"+
		"E\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0005A\u0000\u0000"+
		"\u030e\u0081\u0001\u0000\u0000\u0000\u030f\u0310\u0003\u0088D\u0000\u0310"+
		"\u0311\u0005H\u0000\u0000\u0311\u0312\u0003x<\u0000\u0312\u0083\u0001"+
		"\u0000\u0000\u0000\u0313\u031c\u0005D\u0000\u0000\u0314\u0319\u0003\u0086"+
		"C\u0000\u0315\u0316\u0005F\u0000\u0000\u0316\u0318\u0003\u0086C\u0000"+
		"\u0317\u0315\u0001\u0000\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000"+
		"\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000"+
		"\u031a\u031d\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000"+
		"\u031c\u0314\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000"+
		"\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u0320\u0005F\u0000\u0000\u031f"+
		"\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0005E\u0000\u0000\u0322\u0085"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0005P\u0000\u0000\u0324\u0325\u0005"+
		"H\u0000\u0000\u0325\u0326\u0003x<\u0000\u0326\u0087\u0001\u0000\u0000"+
		"\u0000\u0327\u0328\u0005S\u0000\u0000\u0328\u0089\u0001\u0000\u0000\u0000"+
		"\u0329\u032e\u0003x<\u0000\u032a\u032b\u0005F\u0000\u0000\u032b\u032d"+
		"\u0003x<\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000"+
		"\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000"+
		"\u0000\u0000\u032f\u008b\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000"+
		"\u0000\u0000\u0331\u0337\u0003\u008eG\u0000\u0332\u0337\u0005P\u0000\u0000"+
		"\u0333\u0337\u0005O\u0000\u0000\u0334\u0337\u0005R\u0000\u0000\u0335\u0337"+
		"\u0005Q\u0000\u0000\u0336\u0331\u0001\u0000\u0000\u0000\u0336\u0332\u0001"+
		"\u0000\u0000\u0000\u0336\u0333\u0001\u0000\u0000\u0000\u0336\u0334\u0001"+
		"\u0000\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0337\u008d\u0001"+
		"\u0000\u0000\u0000\u0338\u0339\u0007\u000b\u0000\u0000\u0339\u008f\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0005H\u0000\u0000\u033b\u033c\u0003\u0092"+
		"I\u0000\u033c\u0091\u0001\u0000\u0000\u0000\u033d\u034c\u0005\u001b\u0000"+
		"\u0000\u033e\u034c\u0005\u001d\u0000\u0000\u033f\u034c\u0005\u001c\u0000"+
		"\u0000\u0340\u034c\u0005\u001e\u0000\u0000\u0341\u0342\u0005\u001e\u0000"+
		"\u0000\u0342\u0343\u0005B\u0000\u0000\u0343\u034c\u0005C\u0000\u0000\u0344"+
		"\u0349\u0005S\u0000\u0000\u0345\u0346\u0005=\u0000\u0000\u0346\u0347\u0003"+
		"\u0092I\u0000\u0347\u0348\u0005<\u0000\u0000\u0348\u034a\u0001\u0000\u0000"+
		"\u0000\u0349\u0345\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000"+
		"\u0000\u034a\u034c\u0001\u0000\u0000\u0000\u034b\u033d\u0001\u0000\u0000"+
		"\u0000\u034b\u033e\u0001\u0000\u0000\u0000\u034b\u033f\u0001\u0000\u0000"+
		"\u0000\u034b\u0340\u0001\u0000\u0000\u0000\u034b\u0341\u0001\u0000\u0000"+
		"\u0000\u034b\u0344\u0001\u0000\u0000\u0000\u034c\u0093\u0001\u0000\u0000"+
		"\u0000\u034d\u034f\u0005G\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0095\u0001\u0000\u0000\u0000"+
		"[\u009b\u009d\u00a8\u00dd\u00e3\u00f0\u00f4\u00fd\u010d\u0118\u0129\u0130"+
		"\u0134\u0137\u013a\u0144\u0149\u014d\u0155\u0158\u015f\u0165\u016b\u016e"+
		"\u017a\u017f\u0185\u018a\u018e\u0195\u0198\u019c\u01a7\u01ac\u01b2\u01b7"+
		"\u01be\u01c5\u01cf\u01d3\u01db\u01de\u01e1\u01e7\u01eb\u01f0\u01f3\u01f8"+
		"\u01fc\u0201\u0208\u020b\u0211\u0213\u021b\u0223\u0229\u022c\u022f\u0233"+
		"\u0245\u0254\u0258\u026d\u0273\u0278\u027c\u0280\u0296\u029a\u02c0\u02d2"+
		"\u02d4\u02d6\u02df\u02e7\u02ea\u02ed\u02f7\u02fa\u02fd\u0307\u030b\u0319"+
		"\u031c\u031f\u032e\u0336\u0349\u034b\u034e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}