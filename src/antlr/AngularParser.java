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
		CONSTRUCTOR=17, VAR=18, CLASS=19, IMPORT=20, IMPORTS=21, EXPORT=22, AS=23, 
		FROM=24, NEW=25, THIS=26, IMPLEMENTS=27, STRINGKEYWORD=28, BOOLEANKEYWORD=29, 
		NUMBER=30, ANY=31, INPUT=32, OUTPUT=33, VIEWCHILD=34, COMPONENT=35, SELECTOR=36, 
		STANDALONE=37, STYLEURL=38, TEMPLATEURL=39, TEMPLATE=40, NGFOR=41, PUBLIC=42, 
		PRIVATE=43, PROTECTED=44, READONLY=45, STATIC=46, ABSTRACT=47, FINAL=48, 
		ASYNC=49, EXTENDS=50, SET=51, GET=52, EQUAL=53, ARROW=54, PLUS=55, MINUS=56, 
		STAR=57, DIVIDE=58, MODULO=59, AND=60, OR=61, NOT=62, EQUAL_TO=63, EQUAL_TO3=64, 
		NOT_EQUAL=65, NOT_EQUAL2=66, GREATER_THAN=67, LESS_THAN=68, GREATER_THAN_OR_EQUAL=69, 
		LESS_THAN_OR_EQUAL=70, LPAREN=71, RPAREN=72, LSBRACKET=73, RSBRACKET=74, 
		LCURLY=75, RCURLY=76, COMMA=77, SEMI=78, COLON=79, DOT=80, DOUBLEQUTATION=81, 
		QUESITIONMARK=82, DOLLARSIGN=83, Integer=84, Float=85, STRING=86, Boolean=87, 
		Undefined=88, Null=89, IDENTIFIER=90, SINGLE_LINE_COMMENT=91, COMMENT_BLOCK=92, 
		WS=93, OVERRIDE=94;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importSideEffect = 2, 
		RULE_importDefault = 3, RULE_importNamespace = 4, RULE_importNamed = 5, 
		RULE_importDefaultWithNamed = 6, RULE_importDefaultWithNamespace = 7, 
		RULE_importSpecifier = 8, RULE_importList = 9, RULE_importItem = 10, RULE_componentDeclaration = 11, 
		RULE_componentMetadata = 12, RULE_metadataProperty = 13, RULE_standalone = 14, 
		RULE_imports = 15, RULE_selectorProperty = 16, RULE_templateProperty = 17, 
		RULE_templateUrl = 18, RULE_templetHTML = 19, RULE_html = 20, RULE_stylesProperty = 21, 
		RULE_styleUrls = 22, RULE_classDeclaration = 23, RULE_genericClassParameters = 24, 
		RULE_classBody = 25, RULE_classMember = 26, RULE_classMemberModifier = 27, 
		RULE_classStatment = 28, RULE_angularSpecificMember = 29, RULE_inputDeclaration = 30, 
		RULE_outputDeclaration = 31, RULE_viewChildDeclaration = 32, RULE_constructorDeclaration = 33, 
		RULE_delegatedConstructor = 34, RULE_deafultConstructor = 35, RULE_accessorDeclaration = 36, 
		RULE_propertyDeclaration = 37, RULE_accessModifier = 38, RULE_methodDeclaration = 39, 
		RULE_deafultMethod = 40, RULE_anonymosMethod = 41, RULE_parameterList = 42, 
		RULE_parameter = 43, RULE_statement = 44, RULE_loopControlStatement = 45, 
		RULE_loopStatement = 46, RULE_forStatement = 47, RULE_whileStatement = 48, 
		RULE_doWhileStatement = 49, RULE_forOfStatement = 50, RULE_ifStatement = 51, 
		RULE_ifSection = 52, RULE_elseIfSection = 53, RULE_elseSection = 54, RULE_blockStatement = 55, 
		RULE_variableDeclaration = 56, RULE_variableDeclarationKeyword = 57, RULE_expressionStatement = 58, 
		RULE_expression = 59, RULE_primary = 60, RULE_arrayLiteral = 61, RULE_objectLiteral = 62, 
		RULE_objectInit = 63, RULE_propertyAssignment = 64, RULE_mapLitral = 65, 
		RULE_mapmember = 66, RULE_identifier = 67, RULE_args = 68, RULE_literal = 69, 
		RULE_number = 70, RULE_typeAnnotation = 71, RULE_type = 72, RULE_eos = 73;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importSideEffect", "importDefault", "importNamespace", 
			"importNamed", "importDefaultWithNamed", "importDefaultWithNamespace", 
			"importSpecifier", "importList", "importItem", "componentDeclaration", 
			"componentMetadata", "metadataProperty", "standalone", "imports", "selectorProperty", 
			"templateProperty", "templateUrl", "templetHTML", "html", "stylesProperty", 
			"styleUrls", "classDeclaration", "genericClassParameters", "classBody", 
			"classMember", "classMemberModifier", "classStatment", "angularSpecificMember", 
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
			"'import'", "'imports'", "'export'", "'as'", "'from'", "'new'", "'this'", 
			"'implements'", "'string'", "'boolean'", "'number'", "'any'", "'@Input'", 
			"'@Output'", "'@ViewChild'", "'@Component'", "'selector'", "'standalone'", 
			"'styleUrl'", "'templateUrl'", "'template'", "'*ngFor'", "'public'", 
			"'private'", "'protected'", "'readonly'", "'static'", "'abstract'", "'final'", 
			"'async'", "'extends'", "'set'", "'get'", "'='", "'=>'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'=='", "'==='", "'!='", 
			"'!=='", "'>'", "'<'", "'>='", "'<='", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "','", "';'", "':'", "'.'", "'\"'", "'?'", "'$'", null, null, 
			null, null, "'undefined'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "FOR", "OF", "WHILE", "SWITCH", "CASE", 
			"BREAK", "CONTINUE", "DEFAULT", "DO", "FUNCTION", "RETURN", "CONST", 
			"LET", "CONSTRUCTOR", "VAR", "CLASS", "IMPORT", "IMPORTS", "EXPORT", 
			"AS", "FROM", "NEW", "THIS", "IMPLEMENTS", "STRINGKEYWORD", "BOOLEANKEYWORD", 
			"NUMBER", "ANY", "INPUT", "OUTPUT", "VIEWCHILD", "COMPONENT", "SELECTOR", 
			"STANDALONE", "STYLEURL", "TEMPLATEURL", "TEMPLATE", "NGFOR", "PUBLIC", 
			"PRIVATE", "PROTECTED", "READONLY", "STATIC", "ABSTRACT", "FINAL", "ASYNC", 
			"EXTENDS", "SET", "GET", "EQUAL", "ARROW", "PLUS", "MINUS", "STAR", "DIVIDE", 
			"MODULO", "AND", "OR", "NOT", "EQUAL_TO", "EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", 
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"LPAREN", "RPAREN", "LSBRACKET", "RSBRACKET", "LCURLY", "RCURLY", "COMMA", 
			"SEMI", "COLON", "DOT", "DOUBLEQUTATION", "QUESITIONMARK", "DOLLARSIGN", 
			"Integer", "Float", "STRING", "Boolean", "Undefined", "Null", "IDENTIFIER", 
			"SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "WS", "OVERRIDE"
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
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720476131392591442L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(148);
					importStatement();
					}
					break;
				case 2:
					{
					setState(149);
					componentDeclaration();
					}
					break;
				case 3:
					{
					setState(150);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(151);
					statement();
					}
					break;
				case 5:
					{
					setState(152);
					methodDeclaration();
					}
					break;
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportNamedContext importNamed() {
			return getRuleContext(ImportNamedContext.class,0);
		}
		public ImportDefaultWithNamedContext importDefaultWithNamed() {
			return getRuleContext(ImportDefaultWithNamedContext.class,0);
		}
		public ImportDefaultWithNamespaceContext importDefaultWithNamespace() {
			return getRuleContext(ImportDefaultWithNamespaceContext.class,0);
		}
		public ImportSideEffectContext importSideEffect() {
			return getRuleContext(ImportSideEffectContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				importDefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				importNamespace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				importNamed();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				importDefaultWithNamed();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				importDefaultWithNamespace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
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
			setState(168);
			match(IMPORT);
			setState(169);
			match(STRING);
			setState(170);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
			setState(172);
			match(IMPORT);
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(FROM);
			setState(175);
			match(STRING);
			setState(176);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
			setState(178);
			match(IMPORT);
			setState(179);
			match(STAR);
			setState(180);
			match(AS);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(FROM);
			setState(183);
			match(STRING);
			setState(184);
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
			setState(186);
			match(IMPORT);
			setState(187);
			importSpecifier();
			setState(188);
			match(FROM);
			setState(189);
			match(STRING);
			setState(190);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
			setState(192);
			match(IMPORT);
			setState(193);
			match(IDENTIFIER);
			setState(194);
			match(COMMA);
			setState(195);
			importSpecifier();
			setState(196);
			match(FROM);
			setState(197);
			match(STRING);
			setState(198);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
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
			setState(200);
			match(IMPORT);
			setState(201);
			match(IDENTIFIER);
			setState(202);
			match(COMMA);
			setState(203);
			match(STAR);
			setState(204);
			match(AS);
			setState(205);
			match(IDENTIFIER);
			setState(206);
			match(FROM);
			setState(207);
			match(STRING);
			setState(208);
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
			setState(210);
			match(LCURLY);
			setState(211);
			importList();
			setState(212);
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
			setState(214);
			importItem();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				importItem();
				}
				}
				setState(221);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
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
			setState(222);
			match(IDENTIFIER);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(223);
				match(AS);
				setState(224);
				match(IDENTIFIER);
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
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
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
			setState(227);
			match(COMPONENT);
			setState(228);
			match(LPAREN);
			setState(229);
			componentMetadata();
			setState(230);
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
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public List<MetadataPropertyContext> metadataProperty() {
			return getRuleContexts(MetadataPropertyContext.class);
		}
		public MetadataPropertyContext metadataProperty(int i) {
			return getRuleContext(MetadataPropertyContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
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
			setState(232);
			match(LCURLY);
			setState(233);
			metadataProperty();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					metadataProperty();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241);
				match(COMMA);
				}
			}

			setState(244);
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
	public static class MetadataPropertyContext extends ParserRuleContext {
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public StylesPropertyContext stylesProperty() {
			return getRuleContext(StylesPropertyContext.class,0);
		}
		public StandaloneContext standalone() {
			return getRuleContext(StandaloneContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public MetadataPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMetadataProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMetadataProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMetadataProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataPropertyContext metadataProperty() throws RecognitionException {
		MetadataPropertyContext _localctx = new MetadataPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metadataProperty);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				selectorProperty();
				}
				break;
			case TEMPLATEURL:
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				templateProperty();
				}
				break;
			case STYLEURL:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				stylesProperty();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				standalone();
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
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
			setState(253);
			match(STANDALONE);
			setState(254);
			match(COLON);
			setState(255);
			match(Boolean);
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
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
			setState(257);
			match(IMPORTS);
			setState(258);
			match(COLON);
			setState(259);
			arrayLiteral();
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
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
		enterRule(_localctx, 32, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(SELECTOR);
			setState(262);
			match(COLON);
			setState(263);
			match(STRING);
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
		public TemplateUrlContext templateUrl() {
			return getRuleContext(TemplateUrlContext.class,0);
		}
		public TempletHTMLContext templetHTML() {
			return getRuleContext(TempletHTMLContext.class,0);
		}
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_templateProperty);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				templateUrl();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
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
		enterRule(_localctx, 36, RULE_templateUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(TEMPLATEURL);
			setState(270);
			match(COLON);
			setState(271);
			match(STRING);
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
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
		enterRule(_localctx, 38, RULE_templetHTML);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(TEMPLATE);
			setState(274);
			match(COLON);
			setState(275);
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
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
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
		enterRule(_localctx, 40, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(STRING);
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
		public StyleUrlsContext styleUrls() {
			return getRuleContext(StyleUrlsContext.class,0);
		}
		public StylesPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesPropertyContext stylesProperty() throws RecognitionException {
		StylesPropertyContext _localctx = new StylesPropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stylesProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
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
		enterRule(_localctx, 44, RULE_styleUrls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(STYLEURL);
			setState(282);
			match(COLON);
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(283);
				match(STRING);
				}
				break;
			case LSBRACKET:
				{
				setState(284);
				arrayLiteral();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
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
		enterRule(_localctx, 46, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(287);
				match(EXPORT);
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(290);
				match(ABSTRACT);
				}
			}

			setState(293);
			match(CLASS);
			setState(294);
			identifier();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(295);
				match(LESS_THAN);
				setState(296);
				genericClassParameters();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					genericClassParameters();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(GREATER_THAN);
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(308);
				match(EXTENDS);
				setState(309);
				identifier();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(312);
				match(IMPLEMENTS);
				setState(313);
				identifier();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(314);
					match(COMMA);
					setState(315);
					identifier();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(323);
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
		enterRule(_localctx, 48, RULE_genericClassParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			identifier();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(326);
				match(EXTENDS);
				setState(327);
				identifier();
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
		enterRule(_localctx, 50, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LCURLY);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7595456394133504L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 8912897L) != 0)) {
				{
				{
				setState(331);
				classMember();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
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
		enterRule(_localctx, 52, RULE_classMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) {
				{
				setState(339);
				accessModifier();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 562949953421319L) != 0)) {
				{
				setState(342);
				classMemberModifier();
				}
			}

			setState(345);
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
		enterRule(_localctx, 54, RULE_classMemberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 562949953421319L) != 0)) ) {
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
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public AccessorDeclarationContext accessorDeclaration() {
			return getRuleContext(AccessorDeclarationContext.class,0);
		}
		public AngularSpecificMemberContext angularSpecificMember() {
			return getRuleContext(AngularSpecificMemberContext.class,0);
		}
		public ClassStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatmentContext classStatment() throws RecognitionException {
		ClassStatmentContext _localctx = new ClassStatmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classStatment);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				accessorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
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
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public OutputDeclarationContext outputDeclaration() {
			return getRuleContext(OutputDeclarationContext.class,0);
		}
		public ViewChildDeclarationContext viewChildDeclaration() {
			return getRuleContext(ViewChildDeclarationContext.class,0);
		}
		public AngularSpecificMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularSpecificMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularSpecificMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularSpecificMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularSpecificMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularSpecificMemberContext angularSpecificMember() throws RecognitionException {
		AngularSpecificMemberContext _localctx = new AngularSpecificMemberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_angularSpecificMember);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				inputDeclaration();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				outputDeclaration();
				}
				break;
			case VIEWCHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 60, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(INPUT);
			setState(363);
			match(LPAREN);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(364);
				match(STRING);
				}
				break;
			case LCURLY:
				{
				setState(365);
				objectLiteral();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(368);
			match(RPAREN);
			setState(369);
			match(IDENTIFIER);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(370);
				typeAnnotation();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(373);
				match(EQUAL);
				setState(374);
				expression(0);
				}
			}

			setState(377);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 62, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(OUTPUT);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(380);
				match(LPAREN);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(381);
					match(STRING);
					}
				}

				setState(384);
				match(RPAREN);
				}
			}

			setState(387);
			match(IDENTIFIER);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(388);
				typeAnnotation();
				}
			}

			setState(391);
			match(EQUAL);
			setState(392);
			objectInit();
			setState(393);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 64, RULE_viewChildDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(VIEWCHILD);
			setState(396);
			match(LPAREN);
			setState(397);
			match(STRING);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(398);
				match(COMMA);
				setState(399);
				objectLiteral();
				}
			}

			setState(402);
			match(RPAREN);
			setState(403);
			match(IDENTIFIER);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(404);
				typeAnnotation();
				}
			}

			setState(407);
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
		public DeafultConstructorContext deafultConstructor() {
			return getRuleContext(DeafultConstructorContext.class,0);
		}
		public DelegatedConstructorContext delegatedConstructor() {
			return getRuleContext(DelegatedConstructorContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constructorDeclaration);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				deafultConstructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
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
		enterRule(_localctx, 68, RULE_delegatedConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(CONSTRUCTOR);
			setState(414);
			match(LPAREN);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(415);
				parameterList();
				}
				break;
			}
			setState(418);
			match(RPAREN);
			setState(419);
			match(COLON);
			setState(420);
			match(THIS);
			setState(421);
			match(LPAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				setState(422);
				args();
				}
			}

			setState(425);
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
		enterRule(_localctx, 70, RULE_deafultConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(CONSTRUCTOR);
			setState(428);
			match(LPAREN);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(429);
				parameterList();
				}
				break;
			}
			setState(432);
			match(RPAREN);
			setState(433);
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
		enterRule(_localctx, 72, RULE_accessorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==GET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(436);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
		enterRule(_localctx, 74, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			identifier();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(439);
				typeAnnotation();
				}
			}

			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(442);
				match(EQUAL);
				setState(443);
				expression(0);
				}
			}

			setState(446);
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
		enterRule(_localctx, 76, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
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
		public DeafultMethodContext deafultMethod() {
			return getRuleContext(DeafultMethodContext.class,0);
		}
		public AnonymosMethodContext anonymosMethod() {
			return getRuleContext(AnonymosMethodContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_methodDeclaration);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				deafultMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
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
		enterRule(_localctx, 80, RULE_deafultMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(454);
				match(ASYNC);
				}
			}

			setState(457);
			identifier();
			setState(458);
			match(LPAREN);
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(459);
				parameterList();
				}
				break;
			case 2:
				{
				setState(460);
				args();
				}
				break;
			}
			setState(463);
			match(RPAREN);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(464);
				typeAnnotation();
				}
			}

			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(467);
				blockStatement();
				}
				break;
			case ARROW:
				{
				setState(468);
				match(ARROW);
				setState(469);
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
		enterRule(_localctx, 82, RULE_anonymosMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(472);
				match(ASYNC);
				}
			}

			setState(475);
			match(LPAREN);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(476);
				parameterList();
				}
				break;
			case 2:
				{
				setState(477);
				args();
				}
				break;
			}
			setState(480);
			match(RPAREN);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(481);
				typeAnnotation();
				}
			}

			setState(484);
			match(ARROW);
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(485);
				blockStatement();
				}
				break;
			case 2:
				{
				setState(486);
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
		enterRule(_localctx, 84, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(489);
				parameter();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(490);
					match(COMMA);
					setState(491);
					parameter();
					}
					}
					setState(496);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 86, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(IDENTIFIER);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(500);
				typeAnnotation();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(501);
					match(EQUAL);
					setState(502);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopControlStatementContext loopControlStatement() {
			return getRuleContext(LoopControlStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				blockStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				loopControlStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(512);
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
		enterRule(_localctx, 90, RULE_loopControlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForOfStatementContext forOfStatement() {
			return getRuleContext(ForOfStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_loopStatement);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				forStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				doWhileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
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
		enterRule(_localctx, 94, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(FOR);
			setState(524);
			match(LPAREN);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
			case EXPORT:
				{
				setState(525);
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
			case STRING:
			case Boolean:
			case Undefined:
			case Null:
			case IDENTIFIER:
				{
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
					{
					setState(526);
					expression(0);
					}
				}

				setState(529);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				setState(532);
				expression(0);
				}
			}

			setState(535);
			match(SEMI);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				setState(536);
				expression(0);
				}
			}

			setState(539);
			match(RPAREN);
			setState(540);
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
		enterRule(_localctx, 96, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(WHILE);
			setState(543);
			match(LPAREN);
			setState(544);
			expression(0);
			setState(545);
			match(RPAREN);
			setState(546);
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
		enterRule(_localctx, 98, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(DO);
			setState(549);
			statement();
			setState(550);
			match(WHILE);
			setState(551);
			match(LPAREN);
			setState(552);
			expression(0);
			setState(553);
			match(RPAREN);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(554);
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
		enterRule(_localctx, 100, RULE_forOfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(FOR);
			setState(558);
			match(LPAREN);
			setState(559);
			variableDeclarationKeyword();
			setState(560);
			identifier();
			setState(561);
			match(OF);
			setState(562);
			expression(0);
			setState(563);
			match(RPAREN);
			setState(564);
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
		enterRule(_localctx, 102, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			ifSection();
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(567);
					elseIfSection();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(573);
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
		enterRule(_localctx, 104, RULE_ifSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(IF);
			setState(577);
			match(LPAREN);
			setState(578);
			expression(0);
			setState(579);
			match(RPAREN);
			setState(580);
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
		enterRule(_localctx, 106, RULE_elseIfSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(ELSEIF);
			setState(583);
			match(LPAREN);
			setState(584);
			expression(0);
			setState(585);
			match(RPAREN);
			setState(586);
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
		enterRule(_localctx, 108, RULE_elseSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(ELSE);
			setState(589);
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
		enterRule(_localctx, 110, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(LCURLY);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359542924882L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				{
				setState(592);
				statement();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
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
		public VariableDeclarationKeywordContext variableDeclarationKeyword() {
			return getRuleContext(VariableDeclarationKeywordContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
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
		enterRule(_localctx, 112, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(600);
				match(EXPORT);
				}
			}

			setState(603);
			variableDeclarationKeyword();
			setState(604);
			identifier();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(605);
				typeAnnotation();
				}
			}

			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(608);
				match(EQUAL);
				setState(609);
				expression(0);
				}
			}

			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(612);
				match(AS);
				setState(613);
				identifier();
				}
			}

			setState(616);
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
		enterRule(_localctx, 114, RULE_variableDeclarationKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		enterRule(_localctx, 116, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			expression(0);
			setState(621);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public List<TerminalNode> RSBRACKET() { return getTokens(AngularParser.RSBRACKET); }
		public TerminalNode RSBRACKET(int i) {
			return getToken(AngularParser.RSBRACKET, i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESITIONMARK() { return getToken(AngularParser.QUESITIONMARK, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new AnounymusMethodExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(624);
				anonymosMethod();
				}
				break;
			case 2:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(625);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(626);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4719772409484279808L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(627);
				expression(12);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(628);
				match(LPAREN);
				setState(629);
				expression(0);
				setState(630);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					{
					setState(632);
					match(MINUS);
					setState(633);
					match(MINUS);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(634);
					match(PLUS);
					setState(635);
					match(PLUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(638);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(698);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new MemberDotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(642);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(643);
						match(DOT);
						setState(644);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ArthmaticOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(645);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(646);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(647);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(649);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(650);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(651);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(652);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(653);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(654);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(655);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(656);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new AssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(657);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(658);
						match(EQUAL);
						setState(659);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new AdditionAssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(660);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(661);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(662);
						match(EQUAL);
						setState(663);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(664);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(665);
						match(QUESITIONMARK);
						setState(666);
						expression(0);
						setState(667);
						match(COLON);
						setState(668);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new MemberIndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(670);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(671);
						match(LSBRACKET);
						setState(672);
						expression(0);
						setState(673);
						match(RSBRACKET);
						}
						break;
					case 10:
						{
						_localctx = new CallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(675);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(676);
						match(LPAREN);
						setState(678);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
							{
							setState(677);
							args();
							}
						}

						setState(680);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new SafeNavExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(681);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(682);
						match(QUESITIONMARK);
						setState(683);
						match(DOT);
						setState(684);
						match(IDENTIFIER);
						}
						break;
					case 12:
						{
						_localctx = new SafeIndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(685);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(686);
						match(QUESITIONMARK);
						setState(687);
						match(RSBRACKET);
						setState(688);
						expression(0);
						setState(689);
						match(RSBRACKET);
						}
						break;
					case 13:
						{
						_localctx = new PostFixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(696);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							{
							setState(692);
							match(MINUS);
							setState(693);
							match(MINUS);
							}
							}
							break;
						case PLUS:
							{
							{
							setState(694);
							match(PLUS);
							setState(695);
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
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
	public static class ObjectLiteralExprContext extends PrimaryContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectinitExprContext extends PrimaryContext {
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public ObjectinitExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectinitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectinitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectinitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends PrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExprContext extends PrimaryContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapLiteralExprContext extends PrimaryContext {
		public MapLitralContext mapLitral() {
			return getRuleContext(MapLitralContext.class,0);
		}
		public MapLiteralExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMapLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMapLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_primary);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				literal();
				}
				break;
			case 2:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				identifier();
				}
				break;
			case 3:
				_localctx = new ArrayLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				arrayLiteral();
				}
				break;
			case 4:
				_localctx = new MapLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				mapLitral();
				}
				break;
			case 5:
				_localctx = new ObjectLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(707);
				objectLiteral();
				}
				break;
			case 6:
				_localctx = new ObjectinitExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(708);
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
		enterRule(_localctx, 122, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LSBRACKET);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				setState(712);
				expression(0);
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(713);
						match(COMMA);
						setState(714);
						expression(0);
						}
						} 
					}
					setState(719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
			}

			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(722);
				match(COMMA);
				}
			}

			setState(725);
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
		enterRule(_localctx, 124, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(LCURLY);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(728);
				propertyAssignment();
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(729);
						match(COMMA);
						setState(730);
						propertyAssignment();
						}
						} 
					}
					setState(735);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
			}

			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(738);
				match(COMMA);
				}
			}

			setState(741);
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
		enterRule(_localctx, 126, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(NEW);
			setState(744);
			identifier();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(745);
				match(LESS_THAN);
				setState(746);
				type();
				setState(747);
				match(GREATER_THAN);
				}
			}

			setState(751);
			match(LPAREN);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4720335359538364416L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1040405L) != 0)) {
				{
				setState(752);
				args();
				}
			}

			setState(755);
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
		enterRule(_localctx, 128, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			identifier();
			setState(758);
			match(COLON);
			setState(759);
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
		enterRule(_localctx, 130, RULE_mapLitral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(LCURLY);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(762);
				mapmember();
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(763);
						match(COMMA);
						setState(764);
						mapmember();
						}
						} 
					}
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(772);
				match(COMMA);
				}
			}

			setState(775);
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
		enterRule(_localctx, 132, RULE_mapmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(STRING);
			setState(778);
			match(COLON);
			setState(779);
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
		enterRule(_localctx, 134, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
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
		enterRule(_localctx, 136, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			expression(0);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(784);
				match(COMMA);
				setState(785);
				expression(0);
				}
				}
				setState(790);
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
		enterRule(_localctx, 138, RULE_literal);
		try {
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(STRING);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(Boolean);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				match(Null);
				}
				break;
			case Undefined:
				enterOuterAlt(_localctx, 5);
				{
				setState(795);
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
		enterRule(_localctx, 140, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
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
		enterRule(_localctx, 142, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(COLON);
			setState(801);
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
		enterRule(_localctx, 144, RULE_type);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(STRINGKEYWORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				match(BOOLEANKEYWORD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				match(ANY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				match(ANY);
				setState(808);
				match(LSBRACKET);
				setState(809);
				match(RSBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(810);
				match(IDENTIFIER);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(811);
					match(LESS_THAN);
					setState(812);
					type();
					setState(813);
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
		enterRule(_localctx, 146, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(819);
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
		case 59:
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
		"\u0004\u0001^\u0337\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u009a\b\u0000\n\u0000"+
		"\f\u0000\u009d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a7\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00da"+
		"\b\t\n\t\f\t\u00dd\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00ed\b\f\n\f\f\f\u00f0\t\f\u0001\f\u0003\f\u00f3"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fc"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u010c\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u011e\b\u0016\u0001\u0017\u0003"+
		"\u0017\u0121\b\u0017\u0001\u0017\u0003\u0017\u0124\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u012c\b\u0017\n\u0017\f\u0017\u012f\t\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0133\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0137\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u013d\b\u0017"+
		"\n\u0017\f\u0017\u0140\t\u0017\u0003\u0017\u0142\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0149\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u014d\b\u0019\n\u0019\f\u0019\u0150\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u0155\b\u001a\u0001\u001a"+
		"\u0003\u001a\u0158\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0164\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0169\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u016f\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0174\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0178\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u017f\b\u001f\u0001"+
		"\u001f\u0003\u001f\u0182\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0186"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0191\b \u0001 \u0001 \u0001 \u0003 \u0196"+
		"\b \u0001 \u0001 \u0001!\u0001!\u0003!\u019c\b!\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01a1\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01a8"+
		"\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u01af\b#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0003%\u01b9\b%\u0001%\u0001"+
		"%\u0003%\u01bd\b%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0003\'"+
		"\u01c5\b\'\u0001(\u0003(\u01c8\b(\u0001(\u0001(\u0001(\u0001(\u0003(\u01ce"+
		"\b(\u0001(\u0001(\u0003(\u01d2\b(\u0001(\u0001(\u0001(\u0003(\u01d7\b"+
		"(\u0001)\u0003)\u01da\b)\u0001)\u0001)\u0001)\u0003)\u01df\b)\u0001)\u0001"+
		")\u0003)\u01e3\b)\u0001)\u0001)\u0001)\u0003)\u01e8\b)\u0001*\u0001*\u0001"+
		"*\u0005*\u01ed\b*\n*\f*\u01f0\t*\u0003*\u01f2\b*\u0001+\u0001+\u0001+"+
		"\u0001+\u0003+\u01f8\b+\u0003+\u01fa\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0202\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u020a\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u0210\b/\u0001/\u0003/\u0213"+
		"\b/\u0001/\u0003/\u0216\b/\u0001/\u0001/\u0003/\u021a\b/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u022c\b1\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00053\u0239\b3\n3"+
		"\f3\u023c\t3\u00013\u00033\u023f\b3\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u0001"+
		"6\u00017\u00017\u00057\u0252\b7\n7\f7\u0255\t7\u00017\u00017\u00018\u0003"+
		"8\u025a\b8\u00018\u00018\u00018\u00038\u025f\b8\u00018\u00018\u00038\u0263"+
		"\b8\u00018\u00018\u00038\u0267\b8\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u027d\b;\u0001;\u0001;\u0003;\u0281"+
		"\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02a7\b;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u02b9\b;\u0005;\u02bb\b;\n;\f;\u02be"+
		"\t;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u02c6\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0005=\u02cc\b=\n=\f=\u02cf\t=\u0003=\u02d1\b=\u0001="+
		"\u0003=\u02d4\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0005>\u02dc"+
		"\b>\n>\f>\u02df\t>\u0003>\u02e1\b>\u0001>\u0003>\u02e4\b>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u02ee\b?\u0001?\u0001"+
		"?\u0003?\u02f2\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0005A\u02fe\bA\nA\fA\u0301\tA\u0003A\u0303\bA\u0001A"+
		"\u0003A\u0306\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0005D\u0313\bD\nD\fD\u0316\tD\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0003E\u031d\bE\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u0330\bH\u0003H\u0332\bH\u0001I\u0003I\u0335\bI\u0001"+
		"I\u0000\u0001vJ\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0000\f\u0002\u0000-/^^\u0001\u000034\u0001\u0000*,\u0001\u0000\t\n\u0002"+
		"\u0000\u000f\u0010\u0012\u0012\u0002\u000078>>\u0001\u00007;\u0001\u0000"+
		"CF\u0001\u0000?B\u0001\u0000<=\u0001\u000078\u0001\u0000TU\u0375\u0000"+
		"\u009b\u0001\u0000\u0000\u0000\u0002\u00a6\u0001\u0000\u0000\u0000\u0004"+
		"\u00a8\u0001\u0000\u0000\u0000\u0006\u00ac\u0001\u0000\u0000\u0000\b\u00b2"+
		"\u0001\u0000\u0000\u0000\n\u00ba\u0001\u0000\u0000\u0000\f\u00c0\u0001"+
		"\u0000\u0000\u0000\u000e\u00c8\u0001\u0000\u0000\u0000\u0010\u00d2\u0001"+
		"\u0000\u0000\u0000\u0012\u00d6\u0001\u0000\u0000\u0000\u0014\u00de\u0001"+
		"\u0000\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018\u00e8\u0001"+
		"\u0000\u0000\u0000\u001a\u00fb\u0001\u0000\u0000\u0000\u001c\u00fd\u0001"+
		"\u0000\u0000\u0000\u001e\u0101\u0001\u0000\u0000\u0000 \u0105\u0001\u0000"+
		"\u0000\u0000\"\u010b\u0001\u0000\u0000\u0000$\u010d\u0001\u0000\u0000"+
		"\u0000&\u0111\u0001\u0000\u0000\u0000(\u0115\u0001\u0000\u0000\u0000*"+
		"\u0117\u0001\u0000\u0000\u0000,\u0119\u0001\u0000\u0000\u0000.\u0120\u0001"+
		"\u0000\u0000\u00000\u0145\u0001\u0000\u0000\u00002\u014a\u0001\u0000\u0000"+
		"\u00004\u0154\u0001\u0000\u0000\u00006\u015b\u0001\u0000\u0000\u00008"+
		"\u0163\u0001\u0000\u0000\u0000:\u0168\u0001\u0000\u0000\u0000<\u016a\u0001"+
		"\u0000\u0000\u0000>\u017b\u0001\u0000\u0000\u0000@\u018b\u0001\u0000\u0000"+
		"\u0000B\u019b\u0001\u0000\u0000\u0000D\u019d\u0001\u0000\u0000\u0000F"+
		"\u01ab\u0001\u0000\u0000\u0000H\u01b3\u0001\u0000\u0000\u0000J\u01b6\u0001"+
		"\u0000\u0000\u0000L\u01c0\u0001\u0000\u0000\u0000N\u01c4\u0001\u0000\u0000"+
		"\u0000P\u01c7\u0001\u0000\u0000\u0000R\u01d9\u0001\u0000\u0000\u0000T"+
		"\u01f1\u0001\u0000\u0000\u0000V\u01f3\u0001\u0000\u0000\u0000X\u0201\u0001"+
		"\u0000\u0000\u0000Z\u0203\u0001\u0000\u0000\u0000\\\u0209\u0001\u0000"+
		"\u0000\u0000^\u020b\u0001\u0000\u0000\u0000`\u021e\u0001\u0000\u0000\u0000"+
		"b\u0224\u0001\u0000\u0000\u0000d\u022d\u0001\u0000\u0000\u0000f\u0236"+
		"\u0001\u0000\u0000\u0000h\u0240\u0001\u0000\u0000\u0000j\u0246\u0001\u0000"+
		"\u0000\u0000l\u024c\u0001\u0000\u0000\u0000n\u024f\u0001\u0000\u0000\u0000"+
		"p\u0259\u0001\u0000\u0000\u0000r\u026a\u0001\u0000\u0000\u0000t\u026c"+
		"\u0001\u0000\u0000\u0000v\u0280\u0001\u0000\u0000\u0000x\u02c5\u0001\u0000"+
		"\u0000\u0000z\u02c7\u0001\u0000\u0000\u0000|\u02d7\u0001\u0000\u0000\u0000"+
		"~\u02e7\u0001\u0000\u0000\u0000\u0080\u02f5\u0001\u0000\u0000\u0000\u0082"+
		"\u02f9\u0001\u0000\u0000\u0000\u0084\u0309\u0001\u0000\u0000\u0000\u0086"+
		"\u030d\u0001\u0000\u0000\u0000\u0088\u030f\u0001\u0000\u0000\u0000\u008a"+
		"\u031c\u0001\u0000\u0000\u0000\u008c\u031e\u0001\u0000\u0000\u0000\u008e"+
		"\u0320\u0001\u0000\u0000\u0000\u0090\u0331\u0001\u0000\u0000\u0000\u0092"+
		"\u0334\u0001\u0000\u0000\u0000\u0094\u009a\u0003\u0002\u0001\u0000\u0095"+
		"\u009a\u0003\u0016\u000b\u0000\u0096\u009a\u0003.\u0017\u0000\u0097\u009a"+
		"\u0003X,\u0000\u0098\u009a\u0003N\'\u0000\u0099\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0000\u0000"+
		"\u0001\u009f\u0001\u0001\u0000\u0000\u0000\u00a0\u00a7\u0003\u0006\u0003"+
		"\u0000\u00a1\u00a7\u0003\b\u0004\u0000\u00a2\u00a7\u0003\n\u0005\u0000"+
		"\u00a3\u00a7\u0003\f\u0006\u0000\u00a4\u00a7\u0003\u000e\u0007\u0000\u00a5"+
		"\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u0003\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0014\u0000\u0000\u00a9\u00aa\u0005V\u0000\u0000\u00aa\u00ab"+
		"\u0003\u0092I\u0000\u00ab\u0005\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0014\u0000\u0000\u00ad\u00ae\u0005Z\u0000\u0000\u00ae\u00af\u0005\u0018"+
		"\u0000\u0000\u00af\u00b0\u0005V\u0000\u0000\u00b0\u00b1\u0003\u0092I\u0000"+
		"\u00b1\u0007\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000"+
		"\u00b3\u00b4\u00059\u0000\u0000\u00b4\u00b5\u0005\u0017\u0000\u0000\u00b5"+
		"\u00b6\u0005Z\u0000\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00b8"+
		"\u0005V\u0000\u0000\u00b8\u00b9\u0003\u0092I\u0000\u00b9\t\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0014\u0000\u0000\u00bb\u00bc\u0003\u0010"+
		"\b\u0000\u00bc\u00bd\u0005\u0018\u0000\u0000\u00bd\u00be\u0005V\u0000"+
		"\u0000\u00be\u00bf\u0003\u0092I\u0000\u00bf\u000b\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c2\u0005Z\u0000\u0000\u00c2"+
		"\u00c3\u0005M\u0000\u0000\u00c3\u00c4\u0003\u0010\b\u0000\u00c4\u00c5"+
		"\u0005\u0018\u0000\u0000\u00c5\u00c6\u0005V\u0000\u0000\u00c6\u00c7\u0003"+
		"\u0092I\u0000\u00c7\r\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0014"+
		"\u0000\u0000\u00c9\u00ca\u0005Z\u0000\u0000\u00ca\u00cb\u0005M\u0000\u0000"+
		"\u00cb\u00cc\u00059\u0000\u0000\u00cc\u00cd\u0005\u0017\u0000\u0000\u00cd"+
		"\u00ce\u0005Z\u0000\u0000\u00ce\u00cf\u0005\u0018\u0000\u0000\u00cf\u00d0"+
		"\u0005V\u0000\u0000\u00d0\u00d1\u0003\u0092I\u0000\u00d1\u000f\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005K\u0000\u0000\u00d3\u00d4\u0003\u0012\t"+
		"\u0000\u00d4\u00d5\u0005L\u0000\u0000\u00d5\u0011\u0001\u0000\u0000\u0000"+
		"\u00d6\u00db\u0003\u0014\n\u0000\u00d7\u00d8\u0005M\u0000\u0000\u00d8"+
		"\u00da\u0003\u0014\n\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0005Z\u0000\u0000\u00df\u00e0\u0005"+
		"\u0017\u0000\u0000\u00e0\u00e2\u0005Z\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u0015\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005#\u0000\u0000\u00e4\u00e5\u0005G\u0000\u0000"+
		"\u00e5\u00e6\u0003\u0018\f\u0000\u00e6\u00e7\u0005H\u0000\u0000\u00e7"+
		"\u0017\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005K\u0000\u0000\u00e9\u00ee"+
		"\u0003\u001a\r\u0000\u00ea\u00eb\u0005M\u0000\u0000\u00eb\u00ed\u0003"+
		"\u001a\r\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0005M\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005L\u0000\u0000\u00f5\u0019\u0001\u0000\u0000\u0000"+
		"\u00f6\u00fc\u0003 \u0010\u0000\u00f7\u00fc\u0003\"\u0011\u0000\u00f8"+
		"\u00fc\u0003*\u0015\u0000\u00f9\u00fc\u0003\u001c\u000e\u0000\u00fa\u00fc"+
		"\u0003\u001e\u000f\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u001b"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005%\u0000\u0000\u00fe\u00ff\u0005"+
		"O\u0000\u0000\u00ff\u0100\u0005W\u0000\u0000\u0100\u001d\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\u0015\u0000\u0000\u0102\u0103\u0005O\u0000\u0000"+
		"\u0103\u0104\u0003z=\u0000\u0104\u001f\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0005$\u0000\u0000\u0106\u0107\u0005O\u0000\u0000\u0107\u0108\u0005V"+
		"\u0000\u0000\u0108!\u0001\u0000\u0000\u0000\u0109\u010c\u0003$\u0012\u0000"+
		"\u010a\u010c\u0003&\u0013\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c#\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005\'\u0000\u0000\u010e\u010f\u0005O\u0000\u0000\u010f\u0110\u0005"+
		"V\u0000\u0000\u0110%\u0001\u0000\u0000\u0000\u0111\u0112\u0005(\u0000"+
		"\u0000\u0112\u0113\u0005O\u0000\u0000\u0113\u0114\u0003(\u0014\u0000\u0114"+
		"\'\u0001\u0000\u0000\u0000\u0115\u0116\u0005V\u0000\u0000\u0116)\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0003,\u0016\u0000\u0118+\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005&\u0000\u0000\u011a\u011d\u0005O\u0000\u0000\u011b"+
		"\u011e\u0005V\u0000\u0000\u011c\u011e\u0003z=\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e-\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0005\u0016\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0005/\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005\u0013\u0000\u0000\u0126\u0132\u0003\u0086C\u0000"+
		"\u0127\u0128\u0005D\u0000\u0000\u0128\u012d\u00030\u0018\u0000\u0129\u012a"+
		"\u0005M\u0000\u0000\u012a\u012c\u00030\u0018\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0005C\u0000"+
		"\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0127\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u00052\u0000\u0000\u0135\u0137\u0003\u0086C\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0141\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u001b\u0000\u0000\u0139"+
		"\u013e\u0003\u0086C\u0000\u013a\u013b\u0005M\u0000\u0000\u013b\u013d\u0003"+
		"\u0086C\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0141\u0138\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u00032\u0019"+
		"\u0000\u0144/\u0001\u0000\u0000\u0000\u0145\u0148\u0003\u0086C\u0000\u0146"+
		"\u0147\u00052\u0000\u0000\u0147\u0149\u0003\u0086C\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u01491\u0001\u0000"+
		"\u0000\u0000\u014a\u014e\u0005K\u0000\u0000\u014b\u014d\u00034\u001a\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005L\u0000\u0000\u01523\u0001\u0000\u0000\u0000\u0153\u0155"+
		"\u0003L&\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0158\u00036\u001b"+
		"\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u00038\u001c\u0000"+
		"\u015a5\u0001\u0000\u0000\u0000\u015b\u015c\u0007\u0000\u0000\u0000\u015c"+
		"7\u0001\u0000\u0000\u0000\u015d\u0164\u0003J%\u0000\u015e\u0164\u0003"+
		"N\'\u0000\u015f\u0164\u0003p8\u0000\u0160\u0164\u0003B!\u0000\u0161\u0164"+
		"\u0003H$\u0000\u0162\u0164\u0003:\u001d\u0000\u0163\u015d\u0001\u0000"+
		"\u0000\u0000\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000"+
		"\u0000\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u01649\u0001\u0000\u0000"+
		"\u0000\u0165\u0169\u0003<\u001e\u0000\u0166\u0169\u0003>\u001f\u0000\u0167"+
		"\u0169\u0003@ \u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169;\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005 \u0000\u0000\u016b\u016e\u0005G\u0000\u0000"+
		"\u016c\u016f\u0005V\u0000\u0000\u016d\u016f\u0003|>\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0005H\u0000\u0000\u0171\u0173\u0005Z\u0000\u0000\u0172\u0174\u0003\u008e"+
		"G\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0176\u00055\u0000\u0000"+
		"\u0176\u0178\u0003v;\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0003\u0092I\u0000\u017a=\u0001\u0000\u0000\u0000\u017b\u0181\u0005!"+
		"\u0000\u0000\u017c\u017e\u0005G\u0000\u0000\u017d\u017f\u0005V\u0000\u0000"+
		"\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0005H\u0000\u0000\u0181"+
		"\u017c\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u0005Z\u0000\u0000\u0184\u0186"+
		"\u0003\u008eG\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"5\u0000\u0000\u0188\u0189\u0003~?\u0000\u0189\u018a\u0003\u0092I\u0000"+
		"\u018a?\u0001\u0000\u0000\u0000\u018b\u018c\u0005\"\u0000\u0000\u018c"+
		"\u018d\u0005G\u0000\u0000\u018d\u0190\u0005V\u0000\u0000\u018e\u018f\u0005"+
		"M\u0000\u0000\u018f\u0191\u0003|>\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0005H\u0000\u0000\u0193\u0195\u0005Z\u0000\u0000\u0194"+
		"\u0196\u0003\u008eG\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0003\u0092I\u0000\u0198A\u0001\u0000\u0000\u0000\u0199\u019c\u0003F"+
		"#\u0000\u019a\u019c\u0003D\"\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019a\u0001\u0000\u0000\u0000\u019cC\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0005\u0011\u0000\u0000\u019e\u01a0\u0005G\u0000\u0000\u019f\u01a1"+
		"\u0003T*\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005H\u0000"+
		"\u0000\u01a3\u01a4\u0005O\u0000\u0000\u01a4\u01a5\u0005\u001a\u0000\u0000"+
		"\u01a5\u01a7\u0005G\u0000\u0000\u01a6\u01a8\u0003\u0088D\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005H\u0000\u0000\u01aaE\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0005\u0011\u0000\u0000\u01ac\u01ae\u0005G\u0000"+
		"\u0000\u01ad\u01af\u0003T*\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0005H\u0000\u0000\u01b1\u01b2\u0003n7\u0000\u01b2G\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0007\u0001\u0000\u0000\u01b4\u01b5\u0003P(\u0000"+
		"\u01b5I\u0001\u0000\u0000\u0000\u01b6\u01b8\u0003\u0086C\u0000\u01b7\u01b9"+
		"\u0003\u008eG\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005"+
		"5\u0000\u0000\u01bb\u01bd\u0003v;\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0005N\u0000\u0000\u01bfK\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0007\u0002\u0000\u0000\u01c1M\u0001\u0000\u0000\u0000\u01c2\u01c5"+
		"\u0003P(\u0000\u01c3\u01c5\u0003R)\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5O\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c8\u00051\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0003\u0086C\u0000\u01ca\u01cd\u0005G\u0000\u0000\u01cb\u01ce\u0003"+
		"T*\u0000\u01cc\u01ce\u0003\u0088D\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005H\u0000\u0000"+
		"\u01d0\u01d2\u0003\u008eG\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d6\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d7\u0003n7\u0000\u01d4\u01d5\u00056\u0000\u0000\u01d5\u01d7\u0003"+
		"t:\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d7Q\u0001\u0000\u0000\u0000\u01d8\u01da\u00051\u0000\u0000\u01d9"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01de\u0005G\u0000\u0000\u01dc\u01df"+
		"\u0003T*\u0000\u01dd\u01df\u0003\u0088D\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0005H\u0000"+
		"\u0000\u01e1\u01e3\u0003\u008eG\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e7\u00056\u0000\u0000\u01e5\u01e8\u0003n7\u0000\u01e6\u01e8"+
		"\u0003t:\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8S\u0001\u0000\u0000\u0000\u01e9\u01ee\u0003V+\u0000"+
		"\u01ea\u01eb\u0005M\u0000\u0000\u01eb\u01ed\u0003V+\u0000\u01ec\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01e9"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2U\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f9\u0005Z\u0000\u0000\u01f4\u01f7\u0003\u008e"+
		"G\u0000\u01f5\u01f6\u00055\u0000\u0000\u01f6\u01f8\u0003\u008aE\u0000"+
		"\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0001\u0000\u0000\u0000\u01faW\u0001\u0000\u0000\u0000\u01fb"+
		"\u0202\u0003p8\u0000\u01fc\u0202\u0003f3\u0000\u01fd\u0202\u0003n7\u0000"+
		"\u01fe\u0202\u0003\\.\u0000\u01ff\u0202\u0003Z-\u0000\u0200\u0202\u0003"+
		"t:\u0000\u0201\u01fb\u0001\u0000\u0000\u0000\u0201\u01fc\u0001\u0000\u0000"+
		"\u0000\u0201\u01fd\u0001\u0000\u0000\u0000\u0201\u01fe\u0001\u0000\u0000"+
		"\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0200\u0001\u0000\u0000"+
		"\u0000\u0202Y\u0001\u0000\u0000\u0000\u0203\u0204\u0007\u0003\u0000\u0000"+
		"\u0204[\u0001\u0000\u0000\u0000\u0205\u020a\u0003^/\u0000\u0206\u020a"+
		"\u0003`0\u0000\u0207\u020a\u0003b1\u0000\u0208\u020a\u0003d2\u0000\u0209"+
		"\u0205\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a"+
		"]\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u0004\u0000\u0000\u020c\u0212"+
		"\u0005G\u0000\u0000\u020d\u0213\u0003p8\u0000\u020e\u0210\u0003v;\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0213\u0005N\u0000\u0000\u0212"+
		"\u020d\u0001\u0000\u0000\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0213"+
		"\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0003v;\u0000\u0215\u0214\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u0219\u0005N\u0000\u0000\u0218\u021a\u0003v;"+
		"\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0005H\u0000\u0000"+
		"\u021c\u021d\u0003X,\u0000\u021d_\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\u0006\u0000\u0000\u021f\u0220\u0005G\u0000\u0000\u0220\u0221\u0003"+
		"v;\u0000\u0221\u0222\u0005H\u0000\u0000\u0222\u0223\u0003X,\u0000\u0223"+
		"a\u0001\u0000\u0000\u0000\u0224\u0225\u0005\f\u0000\u0000\u0225\u0226"+
		"\u0003X,\u0000\u0226\u0227\u0005\u0006\u0000\u0000\u0227\u0228\u0005G"+
		"\u0000\u0000\u0228\u0229\u0003v;\u0000\u0229\u022b\u0005H\u0000\u0000"+
		"\u022a\u022c\u0005N\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022cc\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0005\u0004\u0000\u0000\u022e\u022f\u0005G\u0000\u0000\u022f\u0230\u0003"+
		"r9\u0000\u0230\u0231\u0003\u0086C\u0000\u0231\u0232\u0005\u0005\u0000"+
		"\u0000\u0232\u0233\u0003v;\u0000\u0233\u0234\u0005H\u0000\u0000\u0234"+
		"\u0235\u0003X,\u0000\u0235e\u0001\u0000\u0000\u0000\u0236\u023a\u0003"+
		"h4\u0000\u0237\u0239\u0003j5\u0000\u0238\u0237\u0001\u0000\u0000\u0000"+
		"\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000"+
		"\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023f\u0003l6\u0000\u023e\u023d"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023fg\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0005\u0001\u0000\u0000\u0241\u0242\u0005"+
		"G\u0000\u0000\u0242\u0243\u0003v;\u0000\u0243\u0244\u0005H\u0000\u0000"+
		"\u0244\u0245\u0003X,\u0000\u0245i\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0005\u0002\u0000\u0000\u0247\u0248\u0005G\u0000\u0000\u0248\u0249\u0003"+
		"v;\u0000\u0249\u024a\u0005H\u0000\u0000\u024a\u024b\u0003X,\u0000\u024b"+
		"k\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u0003\u0000\u0000\u024d\u024e"+
		"\u0003X,\u0000\u024em\u0001\u0000\u0000\u0000\u024f\u0253\u0005K\u0000"+
		"\u0000\u0250\u0252\u0003X,\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252"+
		"\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0256\u0257\u0005L\u0000\u0000\u0257o\u0001"+
		"\u0000\u0000\u0000\u0258\u025a\u0005\u0016\u0000\u0000\u0259\u0258\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0003r9\u0000\u025c\u025e\u0003\u0086C"+
		"\u0000\u025d\u025f\u0003\u008eG\u0000\u025e\u025d\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u00055\u0000\u0000\u0261\u0263\u0003v;\u0000\u0262\u0260"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0266"+
		"\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0017\u0000\u0000\u0265\u0267"+
		"\u0003\u0086C\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0005"+
		"N\u0000\u0000\u0269q\u0001\u0000\u0000\u0000\u026a\u026b\u0007\u0004\u0000"+
		"\u0000\u026bs\u0001\u0000\u0000\u0000\u026c\u026d\u0003v;\u0000\u026d"+
		"\u026e\u0003\u0092I\u0000\u026eu\u0001\u0000\u0000\u0000\u026f\u0270\u0006"+
		";\uffff\uffff\u0000\u0270\u0281\u0003R)\u0000\u0271\u0281\u0005\u001a"+
		"\u0000\u0000\u0272\u0273\u0007\u0005\u0000\u0000\u0273\u0281\u0003v;\f"+
		"\u0274\u0275\u0005G\u0000\u0000\u0275\u0276\u0003v;\u0000\u0276\u0277"+
		"\u0005H\u0000\u0000\u0277\u0281\u0001\u0000\u0000\u0000\u0278\u0279\u0005"+
		"8\u0000\u0000\u0279\u027d\u00058\u0000\u0000\u027a\u027b\u00057\u0000"+
		"\u0000\u027b\u027d\u00057\u0000\u0000\u027c\u0278\u0001\u0000\u0000\u0000"+
		"\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u0281\u0003v;\u0002\u027f\u0281\u0003x<\u0000\u0280\u026f\u0001"+
		"\u0000\u0000\u0000\u0280\u0271\u0001\u0000\u0000\u0000\u0280\u0272\u0001"+
		"\u0000\u0000\u0000\u0280\u0274\u0001\u0000\u0000\u0000\u0280\u027c\u0001"+
		"\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281\u02bc\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\n\u0011\u0000\u0000\u0283\u0284\u0005P"+
		"\u0000\u0000\u0284\u02bb\u0003v;\u0012\u0285\u0286\n\u000b\u0000\u0000"+
		"\u0286\u0287\u0007\u0006\u0000\u0000\u0287\u02bb\u0003v;\f\u0288\u0289"+
		"\n\n\u0000\u0000\u0289\u028a\u0007\u0007\u0000\u0000\u028a\u02bb\u0003"+
		"v;\u000b\u028b\u028c\n\t\u0000\u0000\u028c\u028d\u0007\b\u0000\u0000\u028d"+
		"\u02bb\u0003v;\n\u028e\u028f\n\b\u0000\u0000\u028f\u0290\u0007\t\u0000"+
		"\u0000\u0290\u02bb\u0003v;\t\u0291\u0292\n\u0007\u0000\u0000\u0292\u0293"+
		"\u00055\u0000\u0000\u0293\u02bb\u0003v;\b\u0294\u0295\n\u0006\u0000\u0000"+
		"\u0295\u0296\u0007\n\u0000\u0000\u0296\u0297\u00055\u0000\u0000\u0297"+
		"\u02bb\u0003v;\u0007\u0298\u0299\n\u0005\u0000\u0000\u0299\u029a\u0005"+
		"R\u0000\u0000\u029a\u029b\u0003v;\u0000\u029b\u029c\u0005O\u0000\u0000"+
		"\u029c\u029d\u0003v;\u0006\u029d\u02bb\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\n\u0010\u0000\u0000\u029f\u02a0\u0005I\u0000\u0000\u02a0\u02a1\u0003"+
		"v;\u0000\u02a1\u02a2\u0005J\u0000\u0000\u02a2\u02bb\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\n\u000f\u0000\u0000\u02a4\u02a6\u0005G\u0000\u0000"+
		"\u02a5\u02a7\u0003\u0088D\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8"+
		"\u02bb\u0005H\u0000\u0000\u02a9\u02aa\n\u000e\u0000\u0000\u02aa\u02ab"+
		"\u0005R\u0000\u0000\u02ab\u02ac\u0005P\u0000\u0000\u02ac\u02bb\u0005Z"+
		"\u0000\u0000\u02ad\u02ae\n\r\u0000\u0000\u02ae\u02af\u0005R\u0000\u0000"+
		"\u02af\u02b0\u0005J\u0000\u0000\u02b0\u02b1\u0003v;\u0000\u02b1\u02b2"+
		"\u0005J\u0000\u0000\u02b2\u02bb\u0001\u0000\u0000\u0000\u02b3\u02b8\n"+
		"\u0003\u0000\u0000\u02b4\u02b5\u00058\u0000\u0000\u02b5\u02b9\u00058\u0000"+
		"\u0000\u02b6\u02b7\u00057\u0000\u0000\u02b7\u02b9\u00057\u0000\u0000\u02b8"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9"+
		"\u02bb\u0001\u0000\u0000\u0000\u02ba\u0282\u0001\u0000\u0000\u0000\u02ba"+
		"\u0285\u0001\u0000\u0000\u0000\u02ba\u0288\u0001\u0000\u0000\u0000\u02ba"+
		"\u028b\u0001\u0000\u0000\u0000\u02ba\u028e\u0001\u0000\u0000\u0000\u02ba"+
		"\u0291\u0001\u0000\u0000\u0000\u02ba\u0294\u0001\u0000\u0000\u0000\u02ba"+
		"\u0298\u0001\u0000\u0000\u0000\u02ba\u029e\u0001\u0000\u0000\u0000\u02ba"+
		"\u02a3\u0001\u0000\u0000\u0000\u02ba\u02a9\u0001\u0000\u0000\u0000\u02ba"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ba\u02b3\u0001\u0000\u0000\u0000\u02bb"+
		"\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bdw\u0001\u0000\u0000\u0000\u02be\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c6\u0003\u008aE\u0000\u02c0\u02c6\u0003"+
		"\u0086C\u0000\u02c1\u02c6\u0003z=\u0000\u02c2\u02c6\u0003\u0082A\u0000"+
		"\u02c3\u02c6\u0003|>\u0000\u02c4\u02c6\u0003~?\u0000\u02c5\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c0\u0001\u0000\u0000\u0000\u02c5\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6y\u0001\u0000"+
		"\u0000\u0000\u02c7\u02d0\u0005I\u0000\u0000\u02c8\u02cd\u0003v;\u0000"+
		"\u02c9\u02ca\u0005M\u0000\u0000\u02ca\u02cc\u0003v;\u0000\u02cb\u02c9"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000\u0000\u02cd\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d1"+
		"\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0\u02c8"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005M\u0000\u0000\u02d3\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d6\u0005J\u0000\u0000\u02d6{\u0001\u0000\u0000"+
		"\u0000\u02d7\u02e0\u0005K\u0000\u0000\u02d8\u02dd\u0003\u0080@\u0000\u02d9"+
		"\u02da\u0005M\u0000\u0000\u02da\u02dc\u0003\u0080@\u0000\u02db\u02d9\u0001"+
		"\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e1\u0001"+
		"\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02d8\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e4\u0005M\u0000\u0000\u02e3\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0005L\u0000\u0000\u02e6}\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0005\u0019\u0000\u0000\u02e8\u02ed\u0003\u0086C\u0000\u02e9"+
		"\u02ea\u0005D\u0000\u0000\u02ea\u02eb\u0003\u0090H\u0000\u02eb\u02ec\u0005"+
		"C\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f1\u0005G\u0000\u0000\u02f0\u02f2\u0003\u0088D\u0000"+
		"\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005H\u0000\u0000\u02f4"+
		"\u007f\u0001\u0000\u0000\u0000\u02f5\u02f6\u0003\u0086C\u0000\u02f6\u02f7"+
		"\u0005O\u0000\u0000\u02f7\u02f8\u0003v;\u0000\u02f8\u0081\u0001\u0000"+
		"\u0000\u0000\u02f9\u0302\u0005K\u0000\u0000\u02fa\u02ff\u0003\u0084B\u0000"+
		"\u02fb\u02fc\u0005M\u0000\u0000\u02fc\u02fe\u0003\u0084B\u0000\u02fd\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0303"+
		"\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u02fa"+
		"\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0305"+
		"\u0001\u0000\u0000\u0000\u0304\u0306\u0005M\u0000\u0000\u0305\u0304\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0005L\u0000\u0000\u0308\u0083\u0001\u0000"+
		"\u0000\u0000\u0309\u030a\u0005V\u0000\u0000\u030a\u030b\u0005O\u0000\u0000"+
		"\u030b\u030c\u0003v;\u0000\u030c\u0085\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0005Z\u0000\u0000\u030e\u0087\u0001\u0000\u0000\u0000\u030f\u0314\u0003"+
		"v;\u0000\u0310\u0311\u0005M\u0000\u0000\u0311\u0313\u0003v;\u0000\u0312"+
		"\u0310\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314"+
		"\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u0089\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317"+
		"\u031d\u0003\u008cF\u0000\u0318\u031d\u0005V\u0000\u0000\u0319\u031d\u0005"+
		"W\u0000\u0000\u031a\u031d\u0005Y\u0000\u0000\u031b\u031d\u0005X\u0000"+
		"\u0000\u031c\u0317\u0001\u0000\u0000\u0000\u031c\u0318\u0001\u0000\u0000"+
		"\u0000\u031c\u0319\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000"+
		"\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031d\u008b\u0001\u0000\u0000"+
		"\u0000\u031e\u031f\u0007\u000b\u0000\u0000\u031f\u008d\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0005O\u0000\u0000\u0321\u0322\u0003\u0090H\u0000\u0322"+
		"\u008f\u0001\u0000\u0000\u0000\u0323\u0332\u0005\u001c\u0000\u0000\u0324"+
		"\u0332\u0005\u001e\u0000\u0000\u0325\u0332\u0005\u001d\u0000\u0000\u0326"+
		"\u0332\u0005\u001f\u0000\u0000\u0327\u0328\u0005\u001f\u0000\u0000\u0328"+
		"\u0329\u0005I\u0000\u0000\u0329\u0332\u0005J\u0000\u0000\u032a\u032f\u0005"+
		"Z\u0000\u0000\u032b\u032c\u0005D\u0000\u0000\u032c\u032d\u0003\u0090H"+
		"\u0000\u032d\u032e\u0005C\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000"+
		"\u032f\u032b\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000"+
		"\u0330\u0332\u0001\u0000\u0000\u0000\u0331\u0323\u0001\u0000\u0000\u0000"+
		"\u0331\u0324\u0001\u0000\u0000\u0000\u0331\u0325\u0001\u0000\u0000\u0000"+
		"\u0331\u0326\u0001\u0000\u0000\u0000\u0331\u0327\u0001\u0000\u0000\u0000"+
		"\u0331\u032a\u0001\u0000\u0000\u0000\u0332\u0091\u0001\u0000\u0000\u0000"+
		"\u0333\u0335\u0005N\u0000\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u0093\u0001\u0000\u0000\u0000W\u0099"+
		"\u009b\u00a6\u00db\u00e1\u00ee\u00f2\u00fb\u010b\u011d\u0120\u0123\u012d"+
		"\u0132\u0136\u013e\u0141\u0148\u014e\u0154\u0157\u0163\u0168\u016e\u0173"+
		"\u0177\u017e\u0181\u0185\u0190\u0195\u019b\u01a0\u01a7\u01ae\u01b8\u01bc"+
		"\u01c4\u01c7\u01cd\u01d1\u01d6\u01d9\u01de\u01e2\u01e7\u01ee\u01f1\u01f7"+
		"\u01f9\u0201\u0209\u020f\u0212\u0215\u0219\u022b\u023a\u023e\u0253\u0259"+
		"\u025e\u0262\u0266\u027c\u0280\u02a6\u02b8\u02ba\u02bc\u02c5\u02cd\u02d0"+
		"\u02d3\u02dd\u02e0\u02e3\u02ed\u02f1\u02ff\u0302\u0305\u0314\u031c\u032f"+
		"\u0331\u0334";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}