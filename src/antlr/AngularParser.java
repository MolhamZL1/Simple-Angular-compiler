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
		STANDALONE=37, STYLEURL=38, TEMPLATEURL=39, TEMPLATE=40, PUBLIC=41, PRIVATE=42, 
		PROTECTED=43, READONLY=44, STATIC=45, ABSTRACT=46, FINAL=47, ASYNC=48, 
		EXTENDS=49, EQUAL=50, ARROW=51, PLUS=52, MINUS=53, STAR=54, DIVIDE=55, 
		MODULO=56, AND=57, OR=58, NOT=59, EQUAL_TO=60, EQUAL_TO3=61, NOT_EQUAL=62, 
		NOT_EQUAL2=63, GREATER_THAN=64, LESS_THAN=65, GREATER_THAN_OR_EQUAL=66, 
		LESS_THAN_OR_EQUAL=67, LPAREN=68, RPAREN=69, LSBRACKET=70, RSBRACKET=71, 
		LCURLY=72, RCURLY=73, COMMA=74, SEMI=75, COLON=76, DOT=77, QUESITIONMARK=78, 
		DOLLARSIGN=79, Integer=80, Float=81, STRING=82, Boolean=83, Undefined=84, 
		Null=85, IDENTIFIER=86, SINGLE_LINE_COMMENT=87, COMMENT_BLOCK=88, WS=89, 
		OVERRIDE=90, VIEW_CHILD=91, GET=92, SET=93;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importSideEffect = 2, 
		RULE_importDefault = 3, RULE_importNamespace = 4, RULE_importNamed = 5, 
		RULE_importDefaultWithNamed = 6, RULE_importDefaultWithNamespace = 7, 
		RULE_importSpecifier = 8, RULE_importList = 9, RULE_importItem = 10, RULE_componentDeclaration = 11, 
		RULE_componentMetadata = 12, RULE_metadataProperty = 13, RULE_standalone = 14, 
		RULE_imports = 15, RULE_selectorProperty = 16, RULE_templateProperty = 17, 
		RULE_templateUrl = 18, RULE_templetHTML = 19, RULE_html = 20, RULE_stylesProperty = 21, 
		RULE_styleUrls = 22, RULE_classDeclaration = 23, RULE_classBody = 24, 
		RULE_classMember = 25, RULE_angularSpecificMember = 26, RULE_inputDeclaration = 27, 
		RULE_outputDeclaration = 28, RULE_viewChildDeclaration = 29, RULE_accessModifier = 30, 
		RULE_propertyDeclaration = 31, RULE_methodDeclaration = 32, RULE_deafultMethod = 33, 
		RULE_anonymosMethod = 34, RULE_constructorDeclaration = 35, RULE_accessorDeclaration = 36, 
		RULE_parameterList = 37, RULE_parameter = 38, RULE_statement = 39, RULE_loopStatement = 40, 
		RULE_forStatement = 41, RULE_whileStatement = 42, RULE_doWhileStatement = 43, 
		RULE_forOfStatement = 44, RULE_ifStatement = 45, RULE_blockStatement = 46, 
		RULE_variableDeclaration = 47, RULE_expressionStatement = 48, RULE_expression = 49, 
		RULE_primary = 50, RULE_arrayLiteral = 51, RULE_objectLiteral = 52, RULE_objectInit = 53, 
		RULE_propertyAssignment = 54, RULE_mapLitral = 55, RULE_mapmember = 56, 
		RULE_loopControlStatement = 57, RULE_args = 58, RULE_literal = 59, RULE_number = 60, 
		RULE_typeAnnotation = 61, RULE_type = 62, RULE_eos = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importSideEffect", "importDefault", "importNamespace", 
			"importNamed", "importDefaultWithNamed", "importDefaultWithNamespace", 
			"importSpecifier", "importList", "importItem", "componentDeclaration", 
			"componentMetadata", "metadataProperty", "standalone", "imports", "selectorProperty", 
			"templateProperty", "templateUrl", "templetHTML", "html", "stylesProperty", 
			"styleUrls", "classDeclaration", "classBody", "classMember", "angularSpecificMember", 
			"inputDeclaration", "outputDeclaration", "viewChildDeclaration", "accessModifier", 
			"propertyDeclaration", "methodDeclaration", "deafultMethod", "anonymosMethod", 
			"constructorDeclaration", "accessorDeclaration", "parameterList", "parameter", 
			"statement", "loopStatement", "forStatement", "whileStatement", "doWhileStatement", 
			"forOfStatement", "ifStatement", "blockStatement", "variableDeclaration", 
			"expressionStatement", "expression", "primary", "arrayLiteral", "objectLiteral", 
			"objectInit", "propertyAssignment", "mapLitral", "mapmember", "loopControlStatement", 
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
			"'styleUrl'", "'templateUrl'", "'template'", "'public'", "'private'", 
			"'protected'", "'readonly'", "'static'", "'abstract'", "'final'", "'async'", 
			"'extends'", "'='", "'=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
			"'||'", "'!'", "'=='", "'==='", "'!='", "'!=='", "'>'", "'<'", "'>='", 
			"'<='", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "':'", 
			"'.'", "'?'", "'$'", null, null, null, null, "'undefined'", "'null'"
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
			"STANDALONE", "STYLEURL", "TEMPLATEURL", "TEMPLATE", "PUBLIC", "PRIVATE", 
			"PROTECTED", "READONLY", "STATIC", "ABSTRACT", "FINAL", "ASYNC", "EXTENDS", 
			"EQUAL", "ARROW", "PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", "AND", 
			"OR", "NOT", "EQUAL_TO", "EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", "GREATER_THAN", 
			"LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "LPAREN", 
			"RPAREN", "LSBRACKET", "RSBRACKET", "LCURLY", "RCURLY", "COMMA", "SEMI", 
			"COLON", "DOT", "QUESITIONMARK", "DOLLARSIGN", "Integer", "Float", "STRING", 
			"Boolean", "Undefined", "Null", "IDENTIFIER", "SINGLE_LINE_COMMENT", 
			"COMMENT_BLOCK", "WS", "OVERRIDE", "VIEW_CHILD", "GET", "SET"
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 590323429372958290L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 520213L) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(128);
					importStatement();
					}
					break;
				case 2:
					{
					setState(129);
					componentDeclaration();
					}
					break;
				case 3:
					{
					setState(130);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(131);
					statement();
					}
					break;
				case 5:
					{
					setState(132);
					methodDeclaration();
					}
					break;
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				importDefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				importNamespace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				importNamed();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				importDefaultWithNamed();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				importDefaultWithNamespace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
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
			setState(148);
			match(IMPORT);
			setState(149);
			match(STRING);
			setState(150);
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
			setState(152);
			match(IMPORT);
			setState(153);
			match(IDENTIFIER);
			setState(154);
			match(FROM);
			setState(155);
			match(STRING);
			setState(156);
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
			setState(158);
			match(IMPORT);
			setState(159);
			match(STAR);
			setState(160);
			match(AS);
			setState(161);
			match(IDENTIFIER);
			setState(162);
			match(FROM);
			setState(163);
			match(STRING);
			setState(164);
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
			setState(166);
			match(IMPORT);
			setState(167);
			importSpecifier();
			setState(168);
			match(FROM);
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
			setState(172);
			match(IMPORT);
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(COMMA);
			setState(175);
			importSpecifier();
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
			setState(180);
			match(IMPORT);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(COMMA);
			setState(183);
			match(STAR);
			setState(184);
			match(AS);
			setState(185);
			match(IDENTIFIER);
			setState(186);
			match(FROM);
			setState(187);
			match(STRING);
			setState(188);
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
			setState(190);
			match(LCURLY);
			setState(191);
			importList();
			setState(192);
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
			setState(194);
			importItem();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				importItem();
				}
				}
				setState(201);
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
			setState(202);
			match(IDENTIFIER);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(203);
				match(AS);
				setState(204);
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
			setState(207);
			match(COMPONENT);
			setState(208);
			match(LPAREN);
			setState(209);
			componentMetadata();
			setState(210);
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
			setState(212);
			match(LCURLY);
			setState(213);
			metadataProperty();
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(COMMA);
					setState(215);
					metadataProperty();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(221);
				match(COMMA);
				}
			}

			setState(224);
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
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				selectorProperty();
				}
				break;
			case TEMPLATEURL:
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				templateProperty();
				}
				break;
			case STYLEURL:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				stylesProperty();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				standalone();
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
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
			setState(233);
			match(STANDALONE);
			setState(234);
			match(COLON);
			setState(235);
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
			setState(237);
			match(IMPORTS);
			setState(238);
			match(COLON);
			setState(239);
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
			setState(241);
			match(SELECTOR);
			setState(242);
			match(COLON);
			setState(243);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				templateUrl();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
			setState(249);
			match(TEMPLATEURL);
			setState(250);
			match(COLON);
			setState(251);
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
			setState(253);
			match(TEMPLATE);
			setState(254);
			match(COLON);
			setState(255);
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
			setState(257);
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
			setState(259);
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
			setState(261);
			match(STYLEURL);
			setState(262);
			match(COLON);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(263);
				match(STRING);
				}
				break;
			case LSBRACKET:
				{
				setState(264);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<TerminalNode> EXTENDS() { return getTokens(AngularParser.EXTENDS); }
		public TerminalNode EXTENDS(int i) {
			return getToken(AngularParser.EXTENDS, i);
		}
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
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(267);
				match(EXPORT);
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(270);
				match(ABSTRACT);
				}
			}

			setState(273);
			match(CLASS);
			setState(274);
			match(IDENTIFIER);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(275);
				match(LESS_THAN);
				setState(276);
				match(IDENTIFIER);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(277);
					match(EXTENDS);
					setState(278);
					match(IDENTIFIER);
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(281);
					match(COMMA);
					setState(282);
					match(IDENTIFIER);
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXTENDS) {
						{
						setState(283);
						match(EXTENDS);
						setState(284);
						match(IDENTIFIER);
						}
					}

					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(GREATER_THAN);
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(295);
				match(EXTENDS);
				setState(296);
				match(IDENTIFIER);
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(299);
				match(IMPLEMENTS);
				setState(300);
				match(IDENTIFIER);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(301);
					match(COMMA);
					setState(302);
					match(IDENTIFIER);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(310);
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
		enterRule(_localctx, 48, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LCURLY);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 420026331398144L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 63176705L) != 0)) {
				{
				{
				setState(313);
				classMember();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public TerminalNode OVERRIDE() { return getToken(AngularParser.OVERRIDE, 0); }
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
		enterRule(_localctx, 50, RULE_classMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) {
				{
				setState(321);
				accessModifier();
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 70368744177671L) != 0)) {
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 70368744177671L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(327);
				propertyDeclaration();
				}
				break;
			case 2:
				{
				setState(328);
				methodDeclaration();
				}
				break;
			case 3:
				{
				setState(329);
				variableDeclaration();
				}
				break;
			case 4:
				{
				setState(330);
				constructorDeclaration();
				}
				break;
			case 5:
				{
				setState(331);
				accessorDeclaration();
				}
				break;
			case 6:
				{
				setState(332);
				angularSpecificMember();
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
		enterRule(_localctx, 52, RULE_angularSpecificMember);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				inputDeclaration();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				outputDeclaration();
				}
				break;
			case VIEW_CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
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
		enterRule(_localctx, 54, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(INPUT);
			setState(341);
			match(LPAREN);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(342);
				match(STRING);
				}
				break;
			case LCURLY:
				{
				setState(343);
				objectLiteral();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(346);
			match(RPAREN);
			setState(347);
			match(IDENTIFIER);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(348);
				typeAnnotation();
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(351);
				match(EQUAL);
				setState(352);
				expression(0);
				}
			}

			setState(355);
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
		enterRule(_localctx, 56, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(OUTPUT);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(358);
				match(LPAREN);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(359);
					match(STRING);
					}
				}

				setState(362);
				match(RPAREN);
				}
			}

			setState(365);
			match(IDENTIFIER);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(366);
				typeAnnotation();
				}
			}

			setState(369);
			match(EQUAL);
			setState(370);
			objectInit();
			setState(371);
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
		public TerminalNode VIEW_CHILD() { return getToken(AngularParser.VIEW_CHILD, 0); }
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
		enterRule(_localctx, 58, RULE_viewChildDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(VIEW_CHILD);
			setState(374);
			match(LPAREN);
			setState(375);
			match(STRING);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(376);
				match(COMMA);
				setState(377);
				objectLiteral();
				}
			}

			setState(380);
			match(RPAREN);
			setState(381);
			match(IDENTIFIER);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(382);
				typeAnnotation();
				}
			}

			setState(385);
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
		enterRule(_localctx, 60, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
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
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 62, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(IDENTIFIER);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(390);
				typeAnnotation();
				}
			}

			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(393);
				match(EQUAL);
				setState(394);
				expression(0);
				}
			}

			setState(397);
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
		enterRule(_localctx, 64, RULE_methodDeclaration);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				deafultMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 66, RULE_deafultMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(403);
				match(ASYNC);
				}
			}

			setState(406);
			match(IDENTIFIER);
			setState(407);
			match(LPAREN);
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(408);
				parameterList();
				}
				break;
			case 2:
				{
				setState(409);
				args();
				}
				break;
			}
			setState(412);
			match(RPAREN);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(413);
				typeAnnotation();
				}
			}

			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(416);
				blockStatement();
				}
				break;
			case ARROW:
				{
				setState(417);
				match(ARROW);
				setState(418);
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
		enterRule(_localctx, 68, RULE_anonymosMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(421);
				match(ASYNC);
				}
			}

			setState(424);
			match(LPAREN);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(425);
				parameterList();
				}
				break;
			case 2:
				{
				setState(426);
				args();
				}
				break;
			}
			setState(429);
			match(RPAREN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(430);
				typeAnnotation();
				}
			}

			setState(433);
			match(ARROW);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(434);
				blockStatement();
				}
				break;
			case 2:
				{
				setState(435);
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 70, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(CONSTRUCTOR);
			setState(439);
			match(LPAREN);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(440);
				parameterList();
				}
				break;
			}
			setState(443);
			match(RPAREN);
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(444);
				match(COLON);
				setState(445);
				match(THIS);
				setState(446);
				match(LPAREN);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4575841956952801283L) != 0)) {
					{
					setState(447);
					args();
					}
				}

				setState(450);
				match(RPAREN);
				}
				}
				break;
			case LCURLY:
				{
				setState(451);
				blockStatement();
				}
				break;
			case CONST:
			case LET:
			case CONSTRUCTOR:
			case VAR:
			case EXPORT:
			case INPUT:
			case OUTPUT:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case READONLY:
			case STATIC:
			case ABSTRACT:
			case ASYNC:
			case LPAREN:
			case RCURLY:
			case IDENTIFIER:
			case OVERRIDE:
			case VIEW_CHILD:
			case GET:
			case SET:
				break;
			default:
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
	public static class AccessorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode GET() { return getToken(AngularParser.GET, 0); }
		public TerminalNode SET() { return getToken(AngularParser.SET, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
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
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==GET || _la==SET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(455);
			match(IDENTIFIER);
			setState(456);
			match(LPAREN);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(457);
				parameter();
				}
			}

			setState(460);
			match(RPAREN);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(461);
				typeAnnotation();
				}
			}

			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(464);
				blockStatement();
				}
				break;
			case SEMI:
				{
				setState(465);
				match(SEMI);
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
		enterRule(_localctx, 74, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(468);
				parameter();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(469);
					match(COMMA);
					setState(470);
					parameter();
					}
					}
					setState(475);
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
		enterRule(_localctx, 76, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(IDENTIFIER);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(479);
				typeAnnotation();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(480);
					match(EQUAL);
					setState(481);
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
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				blockStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				loopControlStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(491);
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
		enterRule(_localctx, 80, RULE_loopStatement);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				forStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				doWhileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
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
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
		enterRule(_localctx, 82, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(FOR);
			setState(501);
			match(LPAREN);
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
			case EXPORT:
				{
				setState(502);
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
			case Integer:
			case Float:
			case STRING:
			case Boolean:
			case Undefined:
			case Null:
			case IDENTIFIER:
				{
				setState(503);
				expressionStatement();
				}
				break;
			case SEMI:
				{
				setState(504);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4575841956952801283L) != 0)) {
				{
				setState(507);
				expression(0);
				}
			}

			setState(510);
			match(SEMI);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4575841956952801283L) != 0)) {
				{
				setState(511);
				expression(0);
				}
			}

			setState(514);
			match(RPAREN);
			setState(515);
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
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(WHILE);
			setState(518);
			match(LPAREN);
			setState(519);
			expression(0);
			setState(520);
			match(RPAREN);
			setState(521);
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
		enterRule(_localctx, 86, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(DO);
			setState(524);
			statement();
			setState(525);
			match(WHILE);
			setState(526);
			match(LPAREN);
			setState(527);
			expression(0);
			setState(528);
			match(RPAREN);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(529);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
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
		enterRule(_localctx, 88, RULE_forOfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(FOR);
			setState(533);
			match(LPAREN);
			setState(534);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 360448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(535);
			match(IDENTIFIER);
			setState(536);
			match(OF);
			setState(537);
			expression(0);
			setState(538);
			match(RPAREN);
			setState(539);
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
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
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
		enterRule(_localctx, 90, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(IF);
			setState(542);
			match(LPAREN);
			setState(543);
			expression(0);
			setState(544);
			match(RPAREN);
			setState(545);
			statement();
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(546);
				match(ELSE);
				setState(547);
				statement();
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
		enterRule(_localctx, 92, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LCURLY);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 590253026267469394L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 520213L) != 0)) {
				{
				{
				setState(551);
				statement();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
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
		enterRule(_localctx, 94, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(559);
				match(EXPORT);
				}
			}

			setState(562);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 360448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(563);
			match(IDENTIFIER);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(564);
				typeAnnotation();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(567);
				match(EQUAL);
				setState(568);
				expression(0);
				}
			}

			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(571);
				match(AS);
				setState(572);
				match(IDENTIFIER);
				}
			}

			setState(575);
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
		enterRule(_localctx, 96, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			expression(0);
			setState(578);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				_localctx = new AnounymusMethodExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(581);
				anonymosMethod();
				}
				break;
			case 2:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(582);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(583);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 589971551185534976L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(584);
				expression(12);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(585);
				match(LPAREN);
				setState(586);
				expression(0);
				setState(587);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new PreFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					{
					setState(589);
					match(MINUS);
					setState(590);
					match(MINUS);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(591);
					match(PLUS);
					setState(592);
					match(PLUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(595);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(596);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new MemberDotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(599);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(600);
						match(DOT);
						setState(601);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ArthmaticOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(602);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(603);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448485376L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(604);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(605);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(606);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(607);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(608);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(609);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606846976L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(610);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(612);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(613);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new AssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(615);
						match(EQUAL);
						setState(616);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new AdditionAssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(617);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(618);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(619);
						match(EQUAL);
						setState(620);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(621);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(622);
						match(QUESITIONMARK);
						setState(623);
						expression(0);
						setState(624);
						match(COLON);
						setState(625);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new MemberIndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(627);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(628);
						match(LSBRACKET);
						setState(629);
						expression(0);
						setState(630);
						match(RSBRACKET);
						}
						break;
					case 10:
						{
						_localctx = new CallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(633);
						match(LPAREN);
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4575841956952801283L) != 0)) {
							{
							setState(634);
							args();
							}
						}

						setState(637);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new SafeNavExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(638);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(639);
						match(QUESITIONMARK);
						setState(640);
						match(DOT);
						setState(641);
						match(IDENTIFIER);
						}
						break;
					case 12:
						{
						_localctx = new SafeIndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(642);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(643);
						match(QUESITIONMARK);
						setState(644);
						match(RSBRACKET);
						setState(645);
						expression(0);
						setState(646);
						match(RSBRACKET);
						}
						break;
					case 13:
						{
						_localctx = new PostFixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(653);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							{
							setState(649);
							match(MINUS);
							setState(650);
							match(MINUS);
							}
							}
							break;
						case PLUS:
							{
							{
							setState(651);
							match(PLUS);
							setState(652);
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
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 100, RULE_primary);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				literal();
				}
				break;
			case 2:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ArrayLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				arrayLiteral();
				}
				break;
			case 4:
				_localctx = new MapLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				mapLitral();
				}
				break;
			case 5:
				_localctx = new ObjectLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(664);
				objectLiteral();
				}
				break;
			case 6:
				_localctx = new ObjectinitExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(665);
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
		enterRule(_localctx, 102, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(LSBRACKET);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4575841956952801283L) != 0)) {
				{
				setState(669);
				expression(0);
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(670);
						match(COMMA);
						setState(671);
						expression(0);
						}
						} 
					}
					setState(676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
			}

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(679);
				match(COMMA);
				}
			}

			setState(682);
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
		enterRule(_localctx, 104, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(LCURLY);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(685);
				propertyAssignment();
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(686);
						match(COMMA);
						setState(687);
						propertyAssignment();
						}
						} 
					}
					setState(692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				}
			}

			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(695);
				match(COMMA);
				}
			}

			setState(698);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 106, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(NEW);
			setState(701);
			match(IDENTIFIER);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(702);
				match(LESS_THAN);
				setState(703);
				type();
				setState(704);
				match(GREATER_THAN);
				}
			}

			setState(708);
			match(LPAREN);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 4575841956952801283L) != 0)) {
				{
				setState(709);
				args();
				}
			}

			setState(712);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 108, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(IDENTIFIER);
			setState(715);
			match(COLON);
			setState(716);
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
		enterRule(_localctx, 110, RULE_mapLitral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(LCURLY);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(719);
				mapmember();
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(720);
						match(COMMA);
						setState(721);
						mapmember();
						}
						} 
					}
					setState(726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
			}

			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(729);
				match(COMMA);
				}
			}

			setState(732);
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
		enterRule(_localctx, 112, RULE_mapmember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(STRING);
			setState(735);
			match(COLON);
			setState(736);
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
	public static class LoopControlStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(AngularParser.CONTINUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 114, RULE_loopControlStatement);
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(BREAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(CONTINUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				match(BREAK);
				setState(741);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
				match(CONTINUE);
				setState(743);
				match(IDENTIFIER);
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
		enterRule(_localctx, 116, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			expression(0);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(747);
				match(COMMA);
				setState(748);
				expression(0);
				}
				}
				setState(753);
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
		enterRule(_localctx, 118, RULE_literal);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				match(STRING);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(Boolean);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
				match(Null);
				}
				break;
			case Undefined:
				enterOuterAlt(_localctx, 5);
				{
				setState(758);
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
		enterRule(_localctx, 120, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		enterRule(_localctx, 122, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(COLON);
			setState(764);
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
		enterRule(_localctx, 124, RULE_type);
		int _la;
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(STRINGKEYWORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				match(BOOLEANKEYWORD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				match(ANY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
				match(ANY);
				setState(771);
				match(LSBRACKET);
				setState(772);
				match(RSBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(773);
				match(IDENTIFIER);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(774);
					match(LESS_THAN);
					setState(775);
					type();
					setState(776);
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
		enterRule(_localctx, 126, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(782);
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
		case 49:
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
		"\u0004\u0001]\u0312\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0086\b\u0000\n\u0000"+
		"\f\u0000\u0089\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0093\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00c6"+
		"\b\t\n\t\f\t\u00c9\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u00ce\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00d9\b\f\n\f\f\f\u00dc\t\f\u0001\f\u0003\f\u00df"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e8"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00f8\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u010a\b\u0016\u0001\u0017\u0003"+
		"\u0017\u010d\b\u0017\u0001\u0017\u0003\u0017\u0110\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0118\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u011e\b\u0017\u0005\u0017\u0120\b\u0017\n\u0017\f\u0017\u0123\t\u0017"+
		"\u0001\u0017\u0003\u0017\u0126\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u012a\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0130\b\u0017\n\u0017\f\u0017\u0133\t\u0017\u0003\u0017\u0135\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u013b\b\u0018"+
		"\n\u0018\f\u0018\u013e\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003"+
		"\u0019\u0143\b\u0019\u0001\u0019\u0003\u0019\u0146\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u014e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0153\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0159"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u015e\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0162\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0169\b\u001c\u0001\u001c"+
		"\u0003\u001c\u016c\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0170\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u017b\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0180\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0188"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u018c\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0003 \u0192\b \u0001!\u0003!\u0195\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u019b\b!\u0001!\u0001!\u0003!\u019f\b!\u0001"+
		"!\u0001!\u0001!\u0003!\u01a4\b!\u0001\"\u0003\"\u01a7\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01ac\b\"\u0001\"\u0001\"\u0003\"\u01b0\b\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u01b5\b\"\u0001#\u0001#\u0001#\u0003#\u01ba\b"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01c1\b#\u0001#\u0001#\u0003"+
		"#\u01c5\b#\u0001$\u0001$\u0001$\u0001$\u0003$\u01cb\b$\u0001$\u0001$\u0003"+
		"$\u01cf\b$\u0001$\u0001$\u0003$\u01d3\b$\u0001%\u0001%\u0001%\u0005%\u01d8"+
		"\b%\n%\f%\u01db\t%\u0003%\u01dd\b%\u0001&\u0001&\u0001&\u0001&\u0003&"+
		"\u01e3\b&\u0003&\u01e5\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01ed\b\'\u0001(\u0001(\u0001(\u0001(\u0003(\u01f3\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01fa\b)\u0001)\u0003)\u01fd\b)\u0001"+
		")\u0001)\u0003)\u0201\b)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0213\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0225\b-\u0001"+
		".\u0001.\u0005.\u0229\b.\n.\f.\u022c\t.\u0001.\u0001.\u0001/\u0003/\u0231"+
		"\b/\u0001/\u0001/\u0001/\u0003/\u0236\b/\u0001/\u0001/\u0003/\u023a\b"+
		"/\u0001/\u0001/\u0003/\u023e\b/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u0252\b1\u00011\u00011\u00031\u0256\b1\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u027c\b1\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u028e\b1\u00051\u0290\b1\n1\f1\u0293\t1\u00012"+
		"\u00012\u00012\u00012\u00012\u00012\u00032\u029b\b2\u00013\u00013\u0001"+
		"3\u00013\u00053\u02a1\b3\n3\f3\u02a4\t3\u00033\u02a6\b3\u00013\u00033"+
		"\u02a9\b3\u00013\u00013\u00014\u00014\u00014\u00014\u00054\u02b1\b4\n"+
		"4\f4\u02b4\t4\u00034\u02b6\b4\u00014\u00034\u02b9\b4\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u02c3\b5\u00015\u00015\u0003"+
		"5\u02c7\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00057\u02d3\b7\n7\f7\u02d6\t7\u00037\u02d8\b7\u00017\u00037"+
		"\u02db\b7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u02e9\b9\u0001:\u0001:\u0001:\u0005:\u02ee"+
		"\b:\n:\f:\u02f1\t:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02f8\b;"+
		"\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u030b\b>\u0003"+
		">\u030d\b>\u0001?\u0003?\u0310\b?\u0001?\u0000\u0001b@\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000\u000b\u0002\u0000"+
		",.ZZ\u0001\u0000)+\u0001\u0000\\]\u0002\u0000\u000f\u0010\u0012\u0012"+
		"\u0002\u000045;;\u0001\u000048\u0001\u0000@C\u0001\u0000<?\u0001\u0000"+
		"9:\u0001\u000045\u0001\u0000PQ\u0360\u0000\u0087\u0001\u0000\u0000\u0000"+
		"\u0002\u0092\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000"+
		"\u0006\u0098\u0001\u0000\u0000\u0000\b\u009e\u0001\u0000\u0000\u0000\n"+
		"\u00a6\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000\u0000\u0000\u000e\u00b4"+
		"\u0001\u0000\u0000\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00c2"+
		"\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000\u0000\u0016\u00cf"+
		"\u0001\u0000\u0000\u0000\u0018\u00d4\u0001\u0000\u0000\u0000\u001a\u00e7"+
		"\u0001\u0000\u0000\u0000\u001c\u00e9\u0001\u0000\u0000\u0000\u001e\u00ed"+
		"\u0001\u0000\u0000\u0000 \u00f1\u0001\u0000\u0000\u0000\"\u00f7\u0001"+
		"\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000\u0000&\u00fd\u0001\u0000\u0000"+
		"\u0000(\u0101\u0001\u0000\u0000\u0000*\u0103\u0001\u0000\u0000\u0000,"+
		"\u0105\u0001\u0000\u0000\u0000.\u010c\u0001\u0000\u0000\u00000\u0138\u0001"+
		"\u0000\u0000\u00002\u0142\u0001\u0000\u0000\u00004\u0152\u0001\u0000\u0000"+
		"\u00006\u0154\u0001\u0000\u0000\u00008\u0165\u0001\u0000\u0000\u0000:"+
		"\u0175\u0001\u0000\u0000\u0000<\u0183\u0001\u0000\u0000\u0000>\u0185\u0001"+
		"\u0000\u0000\u0000@\u0191\u0001\u0000\u0000\u0000B\u0194\u0001\u0000\u0000"+
		"\u0000D\u01a6\u0001\u0000\u0000\u0000F\u01b6\u0001\u0000\u0000\u0000H"+
		"\u01c6\u0001\u0000\u0000\u0000J\u01dc\u0001\u0000\u0000\u0000L\u01de\u0001"+
		"\u0000\u0000\u0000N\u01ec\u0001\u0000\u0000\u0000P\u01f2\u0001\u0000\u0000"+
		"\u0000R\u01f4\u0001\u0000\u0000\u0000T\u0205\u0001\u0000\u0000\u0000V"+
		"\u020b\u0001\u0000\u0000\u0000X\u0214\u0001\u0000\u0000\u0000Z\u021d\u0001"+
		"\u0000\u0000\u0000\\\u0226\u0001\u0000\u0000\u0000^\u0230\u0001\u0000"+
		"\u0000\u0000`\u0241\u0001\u0000\u0000\u0000b\u0255\u0001\u0000\u0000\u0000"+
		"d\u029a\u0001\u0000\u0000\u0000f\u029c\u0001\u0000\u0000\u0000h\u02ac"+
		"\u0001\u0000\u0000\u0000j\u02bc\u0001\u0000\u0000\u0000l\u02ca\u0001\u0000"+
		"\u0000\u0000n\u02ce\u0001\u0000\u0000\u0000p\u02de\u0001\u0000\u0000\u0000"+
		"r\u02e8\u0001\u0000\u0000\u0000t\u02ea\u0001\u0000\u0000\u0000v\u02f7"+
		"\u0001\u0000\u0000\u0000x\u02f9\u0001\u0000\u0000\u0000z\u02fb\u0001\u0000"+
		"\u0000\u0000|\u030c\u0001\u0000\u0000\u0000~\u030f\u0001\u0000\u0000\u0000"+
		"\u0080\u0086\u0003\u0002\u0001\u0000\u0081\u0086\u0003\u0016\u000b\u0000"+
		"\u0082\u0086\u0003.\u0017\u0000\u0083\u0086\u0003N\'\u0000\u0084\u0086"+
		"\u0003@ \u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000"+
		"\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u0000\u0000\u0001\u008b\u0001\u0001\u0000"+
		"\u0000\u0000\u008c\u0093\u0003\u0006\u0003\u0000\u008d\u0093\u0003\b\u0004"+
		"\u0000\u008e\u0093\u0003\n\u0005\u0000\u008f\u0093\u0003\f\u0006\u0000"+
		"\u0090\u0093\u0003\u000e\u0007\u0000\u0091\u0093\u0003\u0004\u0002\u0000"+
		"\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000"+
		"\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0003\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0014\u0000\u0000"+
		"\u0095\u0096\u0005R\u0000\u0000\u0096\u0097\u0003~?\u0000\u0097\u0005"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099\u009a"+
		"\u0005V\u0000\u0000\u009a\u009b\u0005\u0018\u0000\u0000\u009b\u009c\u0005"+
		"R\u0000\u0000\u009c\u009d\u0003~?\u0000\u009d\u0007\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u0014\u0000\u0000\u009f\u00a0\u00056\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0017\u0000\u0000\u00a1\u00a2\u0005V\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0018\u0000\u0000\u00a3\u00a4\u0005R\u0000\u0000\u00a4\u00a5"+
		"\u0003~?\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0014"+
		"\u0000\u0000\u00a7\u00a8\u0003\u0010\b\u0000\u00a8\u00a9\u0005\u0018\u0000"+
		"\u0000\u00a9\u00aa\u0005R\u0000\u0000\u00aa\u00ab\u0003~?\u0000\u00ab"+
		"\u000b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad"+
		"\u00ae\u0005V\u0000\u0000\u00ae\u00af\u0005J\u0000\u0000\u00af\u00b0\u0003"+
		"\u0010\b\u0000\u00b0\u00b1\u0005\u0018\u0000\u0000\u00b1\u00b2\u0005R"+
		"\u0000\u0000\u00b2\u00b3\u0003~?\u0000\u00b3\r\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u0014\u0000\u0000\u00b5\u00b6\u0005V\u0000\u0000\u00b6"+
		"\u00b7\u0005J\u0000\u0000\u00b7\u00b8\u00056\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0017\u0000\u0000\u00b9\u00ba\u0005V\u0000\u0000\u00ba\u00bb\u0005\u0018"+
		"\u0000\u0000\u00bb\u00bc\u0005R\u0000\u0000\u00bc\u00bd\u0003~?\u0000"+
		"\u00bd\u000f\u0001\u0000\u0000\u0000\u00be\u00bf\u0005H\u0000\u0000\u00bf"+
		"\u00c0\u0003\u0012\t\u0000\u00c0\u00c1\u0005I\u0000\u0000\u00c1\u0011"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u0014\n\u0000\u00c3\u00c4\u0005"+
		"J\u0000\u0000\u00c4\u00c6\u0003\u0014\n\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u0013\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0005V\u0000"+
		"\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc\u00ce\u0005V\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005#\u0000\u0000\u00d0"+
		"\u00d1\u0005D\u0000\u0000\u00d1\u00d2\u0003\u0018\f\u0000\u00d2\u00d3"+
		"\u0005E\u0000\u0000\u00d3\u0017\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"H\u0000\u0000\u00d5\u00da\u0003\u001a\r\u0000\u00d6\u00d7\u0005J\u0000"+
		"\u0000\u00d7\u00d9\u0003\u001a\r\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00df\u0005J\u0000\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005I\u0000\u0000\u00e1\u0019"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e8\u0003 \u0010\u0000\u00e3\u00e8\u0003"+
		"\"\u0011\u0000\u00e4\u00e8\u0003*\u0015\u0000\u00e5\u00e8\u0003\u001c"+
		"\u000e\u0000\u00e6\u00e8\u0003\u001e\u000f\u0000\u00e7\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u001b\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005%\u0000"+
		"\u0000\u00ea\u00eb\u0005L\u0000\u0000\u00eb\u00ec\u0005S\u0000\u0000\u00ec"+
		"\u001d\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0015\u0000\u0000\u00ee"+
		"\u00ef\u0005L\u0000\u0000\u00ef\u00f0\u0003f3\u0000\u00f0\u001f\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005$\u0000\u0000\u00f2\u00f3\u0005L\u0000"+
		"\u0000\u00f3\u00f4\u0005R\u0000\u0000\u00f4!\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f8\u0003$\u0012\u0000\u00f6\u00f8\u0003&\u0013\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8#\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\'\u0000\u0000\u00fa\u00fb\u0005L\u0000"+
		"\u0000\u00fb\u00fc\u0005R\u0000\u0000\u00fc%\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005(\u0000\u0000\u00fe\u00ff\u0005L\u0000\u0000\u00ff\u0100\u0003"+
		"(\u0014\u0000\u0100\'\u0001\u0000\u0000\u0000\u0101\u0102\u0005R\u0000"+
		"\u0000\u0102)\u0001\u0000\u0000\u0000\u0103\u0104\u0003,\u0016\u0000\u0104"+
		"+\u0001\u0000\u0000\u0000\u0105\u0106\u0005&\u0000\u0000\u0106\u0109\u0005"+
		"L\u0000\u0000\u0107\u010a\u0005R\u0000\u0000\u0108\u010a\u0003f3\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a-\u0001\u0000\u0000\u0000\u010b\u010d\u0005\u0016\u0000\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0001\u0000\u0000\u0000\u010e\u0110\u0005.\u0000\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0013\u0000\u0000\u0112\u0125"+
		"\u0005V\u0000\u0000\u0113\u0114\u0005A\u0000\u0000\u0114\u0117\u0005V"+
		"\u0000\u0000\u0115\u0116\u00051\u0000\u0000\u0116\u0118\u0005V\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0121\u0001\u0000\u0000\u0000\u0119\u011a\u0005J\u0000\u0000\u011a"+
		"\u011d\u0005V\u0000\u0000\u011b\u011c\u00051\u0000\u0000\u011c\u011e\u0005"+
		"V\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0119\u0001\u0000"+
		"\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0126\u0005@\u0000"+
		"\u0000\u0125\u0113\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0128\u00051\u0000\u0000"+
		"\u0128\u012a\u0005V\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u0134\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005\u001b\u0000\u0000\u012c\u0131\u0005V\u0000\u0000\u012d\u012e"+
		"\u0005J\u0000\u0000\u012e\u0130\u0005V\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u00030\u0018\u0000\u0137/\u0001\u0000\u0000\u0000"+
		"\u0138\u013c\u0005H\u0000\u0000\u0139\u013b\u00032\u0019\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005I\u0000\u0000\u01401\u0001\u0000\u0000\u0000\u0141\u0143\u0003<"+
		"\u001e\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u0007\u0000"+
		"\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u014d\u0001\u0000\u0000\u0000\u0147\u014e\u0003>\u001f"+
		"\u0000\u0148\u014e\u0003@ \u0000\u0149\u014e\u0003^/\u0000\u014a\u014e"+
		"\u0003F#\u0000\u014b\u014e\u0003H$\u0000\u014c\u014e\u00034\u001a\u0000"+
		"\u014d\u0147\u0001\u0000\u0000\u0000\u014d\u0148\u0001\u0000\u0000\u0000"+
		"\u014d\u0149\u0001\u0000\u0000\u0000\u014d\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e3\u0001\u0000\u0000\u0000\u014f\u0153\u00036\u001b\u0000\u0150\u0153"+
		"\u00038\u001c\u0000\u0151\u0153\u0003:\u001d\u0000\u0152\u014f\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u01535\u0001\u0000\u0000\u0000\u0154\u0155\u0005 \u0000\u0000"+
		"\u0155\u0158\u0005D\u0000\u0000\u0156\u0159\u0005R\u0000\u0000\u0157\u0159"+
		"\u0003h4\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005E\u0000\u0000\u015b\u015d\u0005V\u0000\u0000"+
		"\u015c\u015e\u0003z=\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u00052\u0000\u0000\u0160\u0162\u0003b1\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0003~?\u0000\u01647\u0001\u0000\u0000\u0000"+
		"\u0165\u016b\u0005!\u0000\u0000\u0166\u0168\u0005D\u0000\u0000\u0167\u0169"+
		"\u0005R\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0005"+
		"E\u0000\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0005V\u0000"+
		"\u0000\u016e\u0170\u0003z=\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u00052\u0000\u0000\u0172\u0173\u0003j5\u0000\u0173\u0174\u0003"+
		"~?\u0000\u01749\u0001\u0000\u0000\u0000\u0175\u0176\u0005[\u0000\u0000"+
		"\u0176\u0177\u0005D\u0000\u0000\u0177\u017a\u0005R\u0000\u0000\u0178\u0179"+
		"\u0005J\u0000\u0000\u0179\u017b\u0003h4\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0005E\u0000\u0000\u017d\u017f\u0005V\u0000\u0000"+
		"\u017e\u0180\u0003z=\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0003~?\u0000\u0182;\u0001\u0000\u0000\u0000\u0183\u0184\u0007\u0001"+
		"\u0000\u0000\u0184=\u0001\u0000\u0000\u0000\u0185\u0187\u0005V\u0000\u0000"+
		"\u0186\u0188\u0003z=\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u00052\u0000\u0000\u018a\u018c\u0003b1\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005K\u0000\u0000\u018e?\u0001\u0000\u0000\u0000"+
		"\u018f\u0192\u0003B!\u0000\u0190\u0192\u0003D\"\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192A\u0001\u0000"+
		"\u0000\u0000\u0193\u0195\u00050\u0000\u0000\u0194\u0193\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005V\u0000\u0000\u0197\u019a\u0005D\u0000\u0000\u0198"+
		"\u019b\u0003J%\u0000\u0199\u019b\u0003t:\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0005E\u0000"+
		"\u0000\u019d\u019f\u0003z=\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a3\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a4\u0003\\.\u0000\u01a1\u01a2\u00053\u0000\u0000\u01a2\u01a4\u0003"+
		"`0\u0000\u01a3\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a4C\u0001\u0000\u0000\u0000\u01a5\u01a7\u00050\u0000\u0000\u01a6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ab\u0005D\u0000\u0000\u01a9\u01ac"+
		"\u0003J%\u0000\u01aa\u01ac\u0003t:\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0005E\u0000\u0000"+
		"\u01ae\u01b0\u0003z=\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b4"+
		"\u00053\u0000\u0000\u01b2\u01b5\u0003\\.\u0000\u01b3\u01b5\u0003`0\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b5E\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\u0011\u0000\u0000\u01b7"+
		"\u01b9\u0005D\u0000\u0000\u01b8\u01ba\u0003J%\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bb\u01c4\u0005E\u0000\u0000\u01bc\u01bd\u0005L\u0000"+
		"\u0000\u01bd\u01be\u0005\u001a\u0000\u0000\u01be\u01c0\u0005D\u0000\u0000"+
		"\u01bf\u01c1\u0003t:\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c5"+
		"\u0005E\u0000\u0000\u01c3\u01c5\u0003\\.\u0000\u01c4\u01bc\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5G\u0001\u0000\u0000\u0000\u01c6\u01c7\u0007\u0002\u0000"+
		"\u0000\u01c7\u01c8\u0005V\u0000\u0000\u01c8\u01ca\u0005D\u0000\u0000\u01c9"+
		"\u01cb\u0003L&\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005"+
		"E\u0000\u0000\u01cd\u01cf\u0003z=\u0000\u01ce\u01cd\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d3\u0003\\.\u0000\u01d1\u01d3\u0005K\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"I\u0001\u0000\u0000\u0000\u01d4\u01d9\u0003L&\u0000\u01d5\u01d6\u0005"+
		"J\u0000\u0000\u01d6\u01d8\u0003L&\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01d4\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01ddK\u0001\u0000\u0000\u0000"+
		"\u01de\u01e4\u0005V\u0000\u0000\u01df\u01e2\u0003z=\u0000\u01e0\u01e1"+
		"\u00052\u0000\u0000\u01e1\u01e3\u0003v;\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e4\u01df\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5M\u0001\u0000\u0000\u0000\u01e6\u01ed\u0003^/\u0000"+
		"\u01e7\u01ed\u0003Z-\u0000\u01e8\u01ed\u0003\\.\u0000\u01e9\u01ed\u0003"+
		"P(\u0000\u01ea\u01ed\u0003r9\u0000\u01eb\u01ed\u0003`0\u0000\u01ec\u01e6"+
		"\u0001\u0000\u0000\u0000\u01ec\u01e7\u0001\u0000\u0000\u0000\u01ec\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01edO\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f3\u0003R)\u0000\u01ef\u01f3\u0003T*\u0000"+
		"\u01f0\u01f3\u0003V+\u0000\u01f1\u01f3\u0003X,\u0000\u01f2\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f2\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3Q\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0005\u0004\u0000\u0000\u01f5\u01f9\u0005D\u0000"+
		"\u0000\u01f6\u01fa\u0003^/\u0000\u01f7\u01fa\u0003`0\u0000\u01f8\u01fa"+
		"\u0005K\u0000\u0000\u01f9\u01f6\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fd\u0003b1\u0000\u01fc\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0200\u0005K\u0000\u0000\u01ff\u0201\u0003b1\u0000\u0200"+
		"\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005E\u0000\u0000\u0203\u0204"+
		"\u0003N\'\u0000\u0204S\u0001\u0000\u0000\u0000\u0205\u0206\u0005\u0006"+
		"\u0000\u0000\u0206\u0207\u0005D\u0000\u0000\u0207\u0208\u0003b1\u0000"+
		"\u0208\u0209\u0005E\u0000\u0000\u0209\u020a\u0003N\'\u0000\u020aU\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005\f\u0000\u0000\u020c\u020d\u0003N"+
		"\'\u0000\u020d\u020e\u0005\u0006\u0000\u0000\u020e\u020f\u0005D\u0000"+
		"\u0000\u020f\u0210\u0003b1\u0000\u0210\u0212\u0005E\u0000\u0000\u0211"+
		"\u0213\u0005K\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213W\u0001\u0000\u0000\u0000\u0214\u0215\u0005"+
		"\u0004\u0000\u0000\u0215\u0216\u0005D\u0000\u0000\u0216\u0217\u0007\u0003"+
		"\u0000\u0000\u0217\u0218\u0005V\u0000\u0000\u0218\u0219\u0005\u0005\u0000"+
		"\u0000\u0219\u021a\u0003b1\u0000\u021a\u021b\u0005E\u0000\u0000\u021b"+
		"\u021c\u0003N\'\u0000\u021cY\u0001\u0000\u0000\u0000\u021d\u021e\u0005"+
		"\u0001\u0000\u0000\u021e\u021f\u0005D\u0000\u0000\u021f\u0220\u0003b1"+
		"\u0000\u0220\u0221\u0005E\u0000\u0000\u0221\u0224\u0003N\'\u0000\u0222"+
		"\u0223\u0005\u0003\u0000\u0000\u0223\u0225\u0003N\'\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225[\u0001"+
		"\u0000\u0000\u0000\u0226\u022a\u0005H\u0000\u0000\u0227\u0229\u0003N\'"+
		"\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000"+
		"\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000"+
		"\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0005I\u0000\u0000\u022e]\u0001\u0000\u0000\u0000\u022f"+
		"\u0231\u0005\u0016\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0007\u0003\u0000\u0000\u0233\u0235\u0005V\u0000\u0000\u0234\u0236"+
		"\u0003z=\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u00052\u0000"+
		"\u0000\u0238\u023a\u0003b1\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b"+
		"\u023c\u0005\u0017\u0000\u0000\u023c\u023e\u0005V\u0000\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0003~?\u0000\u0240_\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0003b1\u0000\u0242\u0243\u0003~?\u0000\u0243"+
		"a\u0001\u0000\u0000\u0000\u0244\u0245\u00061\uffff\uffff\u0000\u0245\u0256"+
		"\u0003D\"\u0000\u0246\u0256\u0005\u001a\u0000\u0000\u0247\u0248\u0007"+
		"\u0004\u0000\u0000\u0248\u0256\u0003b1\f\u0249\u024a\u0005D\u0000\u0000"+
		"\u024a\u024b\u0003b1\u0000\u024b\u024c\u0005E\u0000\u0000\u024c\u0256"+
		"\u0001\u0000\u0000\u0000\u024d\u024e\u00055\u0000\u0000\u024e\u0252\u0005"+
		"5\u0000\u0000\u024f\u0250\u00054\u0000\u0000\u0250\u0252\u00054\u0000"+
		"\u0000\u0251\u024d\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0256\u0003b1\u0002\u0254"+
		"\u0256\u0003d2\u0000\u0255\u0244\u0001\u0000\u0000\u0000\u0255\u0246\u0001"+
		"\u0000\u0000\u0000\u0255\u0247\u0001\u0000\u0000\u0000\u0255\u0249\u0001"+
		"\u0000\u0000\u0000\u0255\u0251\u0001\u0000\u0000\u0000\u0255\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0291\u0001\u0000\u0000\u0000\u0257\u0258\n\u0011"+
		"\u0000\u0000\u0258\u0259\u0005M\u0000\u0000\u0259\u0290\u0003b1\u0012"+
		"\u025a\u025b\n\u000b\u0000\u0000\u025b\u025c\u0007\u0005\u0000\u0000\u025c"+
		"\u0290\u0003b1\f\u025d\u025e\n\n\u0000\u0000\u025e\u025f\u0007\u0006\u0000"+
		"\u0000\u025f\u0290\u0003b1\u000b\u0260\u0261\n\t\u0000\u0000\u0261\u0262"+
		"\u0007\u0007\u0000\u0000\u0262\u0290\u0003b1\n\u0263\u0264\n\b\u0000\u0000"+
		"\u0264\u0265\u0007\b\u0000\u0000\u0265\u0290\u0003b1\t\u0266\u0267\n\u0007"+
		"\u0000\u0000\u0267\u0268\u00052\u0000\u0000\u0268\u0290\u0003b1\b\u0269"+
		"\u026a\n\u0006\u0000\u0000\u026a\u026b\u0007\t\u0000\u0000\u026b\u026c"+
		"\u00052\u0000\u0000\u026c\u0290\u0003b1\u0007\u026d\u026e\n\u0005\u0000"+
		"\u0000\u026e\u026f\u0005N\u0000\u0000\u026f\u0270\u0003b1\u0000\u0270"+
		"\u0271\u0005L\u0000\u0000\u0271\u0272\u0003b1\u0006\u0272\u0290\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\n\u0010\u0000\u0000\u0274\u0275\u0005F"+
		"\u0000\u0000\u0275\u0276\u0003b1\u0000\u0276\u0277\u0005G\u0000\u0000"+
		"\u0277\u0290\u0001\u0000\u0000\u0000\u0278\u0279\n\u000f\u0000\u0000\u0279"+
		"\u027b\u0005D\u0000\u0000\u027a\u027c\u0003t:\u0000\u027b\u027a\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u0290\u0005E\u0000\u0000\u027e\u027f\n\u000e"+
		"\u0000\u0000\u027f\u0280\u0005N\u0000\u0000\u0280\u0281\u0005M\u0000\u0000"+
		"\u0281\u0290\u0005V\u0000\u0000\u0282\u0283\n\r\u0000\u0000\u0283\u0284"+
		"\u0005N\u0000\u0000\u0284\u0285\u0005G\u0000\u0000\u0285\u0286\u0003b"+
		"1\u0000\u0286\u0287\u0005G\u0000\u0000\u0287\u0290\u0001\u0000\u0000\u0000"+
		"\u0288\u028d\n\u0003\u0000\u0000\u0289\u028a\u00055\u0000\u0000\u028a"+
		"\u028e\u00055\u0000\u0000\u028b\u028c\u00054\u0000\u0000\u028c\u028e\u0005"+
		"4\u0000\u0000\u028d\u0289\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028e\u0290\u0001\u0000\u0000\u0000\u028f\u0257\u0001\u0000"+
		"\u0000\u0000\u028f\u025a\u0001\u0000\u0000\u0000\u028f\u025d\u0001\u0000"+
		"\u0000\u0000\u028f\u0260\u0001\u0000\u0000\u0000\u028f\u0263\u0001\u0000"+
		"\u0000\u0000\u028f\u0266\u0001\u0000\u0000\u0000\u028f\u0269\u0001\u0000"+
		"\u0000\u0000\u028f\u026d\u0001\u0000\u0000\u0000\u028f\u0273\u0001\u0000"+
		"\u0000\u0000\u028f\u0278\u0001\u0000\u0000\u0000\u028f\u027e\u0001\u0000"+
		"\u0000\u0000\u028f\u0282\u0001\u0000\u0000\u0000\u028f\u0288\u0001\u0000"+
		"\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292c\u0001\u0000\u0000"+
		"\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294\u029b\u0003v;\u0000\u0295"+
		"\u029b\u0005V\u0000\u0000\u0296\u029b\u0003f3\u0000\u0297\u029b\u0003"+
		"n7\u0000\u0298\u029b\u0003h4\u0000\u0299\u029b\u0003j5\u0000\u029a\u0294"+
		"\u0001\u0000\u0000\u0000\u029a\u0295\u0001\u0000\u0000\u0000\u029a\u0296"+
		"\u0001\u0000\u0000\u0000\u029a\u0297\u0001\u0000\u0000\u0000\u029a\u0298"+
		"\u0001\u0000\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029be\u0001"+
		"\u0000\u0000\u0000\u029c\u02a5\u0005F\u0000\u0000\u029d\u02a2\u0003b1"+
		"\u0000\u029e\u029f\u0005J\u0000\u0000\u029f\u02a1\u0003b1\u0000\u02a0"+
		"\u029e\u0001\u0000\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5"+
		"\u029d\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a8\u0001\u0000\u0000\u0000\u02a7\u02a9\u0005J\u0000\u0000\u02a8\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005G\u0000\u0000\u02abg\u0001\u0000"+
		"\u0000\u0000\u02ac\u02b5\u0005H\u0000\u0000\u02ad\u02b2\u0003l6\u0000"+
		"\u02ae\u02af\u0005J\u0000\u0000\u02af\u02b1\u0003l6\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02ad"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b9\u0005J\u0000\u0000\u02b8\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0005I\u0000\u0000\u02bbi\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0005\u0019\u0000\u0000\u02bd\u02c2\u0005V\u0000\u0000"+
		"\u02be\u02bf\u0005A\u0000\u0000\u02bf\u02c0\u0003|>\u0000\u02c0\u02c1"+
		"\u0005@\u0000\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02be\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c6\u0005D\u0000\u0000\u02c5\u02c7\u0003t:"+
		"\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005E\u0000\u0000"+
		"\u02c9k\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005V\u0000\u0000\u02cb\u02cc"+
		"\u0005L\u0000\u0000\u02cc\u02cd\u0003b1\u0000\u02cdm\u0001\u0000\u0000"+
		"\u0000\u02ce\u02d7\u0005H\u0000\u0000\u02cf\u02d4\u0003p8\u0000\u02d0"+
		"\u02d1\u0005J\u0000\u0000\u02d1\u02d3\u0003p8\u0000\u02d2\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d8\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02da\u0001"+
		"\u0000\u0000\u0000\u02d9\u02db\u0005J\u0000\u0000\u02da\u02d9\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0005I\u0000\u0000\u02ddo\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0005R\u0000\u0000\u02df\u02e0\u0005L\u0000\u0000\u02e0\u02e1"+
		"\u0003b1\u0000\u02e1q\u0001\u0000\u0000\u0000\u02e2\u02e9\u0005\t\u0000"+
		"\u0000\u02e3\u02e9\u0005\n\u0000\u0000\u02e4\u02e5\u0005\t\u0000\u0000"+
		"\u02e5\u02e9\u0005V\u0000\u0000\u02e6\u02e7\u0005\n\u0000\u0000\u02e7"+
		"\u02e9\u0005V\u0000\u0000\u02e8\u02e2\u0001\u0000\u0000\u0000\u02e8\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e4\u0001\u0000\u0000\u0000\u02e8\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e9s\u0001\u0000\u0000\u0000\u02ea\u02ef\u0003"+
		"b1\u0000\u02eb\u02ec\u0005J\u0000\u0000\u02ec\u02ee\u0003b1\u0000\u02ed"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000\u0000\u0000\u02ef"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0"+
		"u\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2\u02f8"+
		"\u0003x<\u0000\u02f3\u02f8\u0005R\u0000\u0000\u02f4\u02f8\u0005S\u0000"+
		"\u0000\u02f5\u02f8\u0005U\u0000\u0000\u02f6\u02f8\u0005T\u0000\u0000\u02f7"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f7\u02f3\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f8w\u0001\u0000\u0000\u0000\u02f9\u02fa"+
		"\u0007\n\u0000\u0000\u02fay\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005"+
		"L\u0000\u0000\u02fc\u02fd\u0003|>\u0000\u02fd{\u0001\u0000\u0000\u0000"+
		"\u02fe\u030d\u0005\u001c\u0000\u0000\u02ff\u030d\u0005\u001e\u0000\u0000"+
		"\u0300\u030d\u0005\u001d\u0000\u0000\u0301\u030d\u0005\u001f\u0000\u0000"+
		"\u0302\u0303\u0005\u001f\u0000\u0000\u0303\u0304\u0005F\u0000\u0000\u0304"+
		"\u030d\u0005G\u0000\u0000\u0305\u030a\u0005V\u0000\u0000\u0306\u0307\u0005"+
		"A\u0000\u0000\u0307\u0308\u0003|>\u0000\u0308\u0309\u0005@\u0000\u0000"+
		"\u0309\u030b\u0001\u0000\u0000\u0000\u030a\u0306\u0001\u0000\u0000\u0000"+
		"\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030d\u0001\u0000\u0000\u0000"+
		"\u030c\u02fe\u0001\u0000\u0000\u0000\u030c\u02ff\u0001\u0000\u0000\u0000"+
		"\u030c\u0300\u0001\u0000\u0000\u0000\u030c\u0301\u0001\u0000\u0000\u0000"+
		"\u030c\u0302\u0001\u0000\u0000\u0000\u030c\u0305\u0001\u0000\u0000\u0000"+
		"\u030d}\u0001\u0000\u0000\u0000\u030e\u0310\u0005K\u0000\u0000\u030f\u030e"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u007f"+
		"\u0001\u0000\u0000\u0000Y\u0085\u0087\u0092\u00c7\u00cd\u00da\u00de\u00e7"+
		"\u00f7\u0109\u010c\u010f\u0117\u011d\u0121\u0125\u0129\u0131\u0134\u013c"+
		"\u0142\u0145\u014d\u0152\u0158\u015d\u0161\u0168\u016b\u016f\u017a\u017f"+
		"\u0187\u018b\u0191\u0194\u019a\u019e\u01a3\u01a6\u01ab\u01af\u01b4\u01b9"+
		"\u01c0\u01c4\u01ca\u01ce\u01d2\u01d9\u01dc\u01e2\u01e4\u01ec\u01f2\u01f9"+
		"\u01fc\u0200\u0212\u0224\u022a\u0230\u0235\u0239\u023d\u0251\u0255\u027b"+
		"\u028d\u028f\u0291\u029a\u02a2\u02a5\u02a8\u02b2\u02b5\u02b8\u02c2\u02c6"+
		"\u02d4\u02d7\u02da\u02e8\u02ef\u02f7\u030a\u030c\u030f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}