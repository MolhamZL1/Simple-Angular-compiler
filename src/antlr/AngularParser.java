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
		IF=1, ELSEIF=2, ELSE=3, FOR=4, WHILE=5, SWITCH=6, CASE=7, BREAK=8, CONTINUE=9, 
		DEFAULT=10, DO=11, TRY=12, CATCH=13, FINALLY=14, THROW=15, FUNCTION=16, 
		RETURN=17, CONST=18, LET=19, CONSTRUCTOR=20, VAR=21, CLASS=22, IMPORT=23, 
		IMPORTS=24, EXPORT=25, AS=26, FROM=27, NEW=28, THIS=29, IMPLEMENTS=30, 
		INPUT=31, OUTPUT=32, VIEWCHILD=33, COMPONENT=34, NGONINIT=35, NGONCHANGES=36, 
		SELECTOR=37, STANDALONE=38, STYLEURL=39, TEMPLATEURL=40, TEMPLATE=41, 
		PUBLIC=42, PRIVATE=43, PROTECTED=44, READONLY=45, STATIC=46, ABSTRACT=47, 
		FINAL=48, ASYNC=49, EQUAL=50, ARROW=51, PLUS=52, MINUS=53, STAR=54, DIVIDE=55, 
		MODULO=56, AND=57, OR=58, NOT=59, EQUAL_TO=60, EQUAL_TO3=61, NOT_EQUAL=62, 
		NOT_EQUAL2=63, GREATER_THAN=64, LESS_THAN=65, GREATER_THAN_OR_EQUAL=66, 
		LESS_THAN_OR_EQUAL=67, LPAREN=68, RPAREN=69, LSBRACKET=70, RSBRACKET=71, 
		LCURLY=72, RCURLY=73, COMMA=74, SEMI=75, COLON=76, DOT=77, QUESITIONMARK=78, 
		Integer=79, Float=80, STRING=81, Boolean=82, Undefined=83, Null=84, IDENTIFIER=85, 
		SINGLE_LINE_COMMENT=86, COMMENT_BLOCK=87, WS=88;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importSideEffect = 2, 
		RULE_importDefault = 3, RULE_importNamespace = 4, RULE_importNamed = 5, 
		RULE_importDefaultWithNamed = 6, RULE_importDefaultWithNamespace = 7, 
		RULE_importSpecifier = 8, RULE_importList = 9, RULE_importItem = 10, RULE_eos = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importSideEffect", "importDefault", "importNamespace", 
			"importNamed", "importDefaultWithNamed", "importDefaultWithNamespace", 
			"importSpecifier", "importList", "importItem", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", null, "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", "'const'", "'let'", "'constructor'", 
			"'var'", "'class'", "'import'", "'imports'", "'export'", "'as'", "'from'", 
			"'new'", "'this'", "'implements'", "'@Input'", "'@Output'", "'@ViewChild'", 
			"'@Component'", "'ngOnInit'", "'ngOnChanges'", "'selector'", "'standalone'", 
			"'styleUrl'", "'templateUrl'", "'template'", "'public'", "'private'", 
			"'protected'", "'readonly'", "'static'", "'abstract'", "'final'", "'async'", 
			"'='", "'=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", 
			"'=='", "'==='", "'!='", "'!=='", "'>'", "'<'", "'>='", "'<='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "';'", "':'", "'.'", "'?'", 
			null, null, null, null, "'undefined'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "FOR", "WHILE", "SWITCH", "CASE", "BREAK", 
			"CONTINUE", "DEFAULT", "DO", "TRY", "CATCH", "FINALLY", "THROW", "FUNCTION", 
			"RETURN", "CONST", "LET", "CONSTRUCTOR", "VAR", "CLASS", "IMPORT", "IMPORTS", 
			"EXPORT", "AS", "FROM", "NEW", "THIS", "IMPLEMENTS", "INPUT", "OUTPUT", 
			"VIEWCHILD", "COMPONENT", "NGONINIT", "NGONCHANGES", "SELECTOR", "STANDALONE", 
			"STYLEURL", "TEMPLATEURL", "TEMPLATE", "PUBLIC", "PRIVATE", "PROTECTED", 
			"READONLY", "STATIC", "ABSTRACT", "FINAL", "ASYNC", "EQUAL", "ARROW", 
			"PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", "AND", "OR", "NOT", "EQUAL_TO", 
			"EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "LPAREN", "RPAREN", "LSBRACKET", 
			"RSBRACKET", "LCURLY", "RCURLY", "COMMA", "SEMI", "COLON", "DOT", "QUESITIONMARK", 
			"Integer", "Float", "STRING", "Boolean", "Undefined", "Null", "IDENTIFIER", 
			"SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "WS"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(24);
				importStatement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				importDefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				importNamespace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				importNamed();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				importDefaultWithNamed();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				importDefaultWithNamespace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
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
			setState(40);
			match(IMPORT);
			setState(41);
			match(STRING);
			setState(42);
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
			setState(44);
			match(IMPORT);
			setState(45);
			match(IDENTIFIER);
			setState(46);
			match(FROM);
			setState(47);
			match(STRING);
			setState(48);
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
			setState(50);
			match(IMPORT);
			setState(51);
			match(STAR);
			setState(52);
			match(AS);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(FROM);
			setState(55);
			match(STRING);
			setState(56);
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
			setState(58);
			match(IMPORT);
			setState(59);
			importSpecifier();
			setState(60);
			match(FROM);
			setState(61);
			match(STRING);
			setState(62);
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
			setState(64);
			match(IMPORT);
			setState(65);
			match(IDENTIFIER);
			setState(66);
			match(COMMA);
			setState(67);
			importSpecifier();
			setState(68);
			match(FROM);
			setState(69);
			match(STRING);
			setState(70);
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
			setState(72);
			match(IMPORT);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(COMMA);
			setState(75);
			match(STAR);
			setState(76);
			match(AS);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(FROM);
			setState(79);
			match(STRING);
			setState(80);
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
			setState(82);
			match(LCURLY);
			setState(83);
			importList();
			setState(84);
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
			setState(86);
			importItem();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				importItem();
				}
				}
				setState(93);
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
			setState(94);
			match(IDENTIFIER);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(95);
				match(AS);
				setState(96);
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
		enterRule(_localctx, 22, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(99);
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

	public static final String _serializedATN =
		"\u0004\u0001Xg\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000"+
		"\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\nb\b\n\u0001\u000b\u0003\u000be\b\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000c\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004(\u0001"+
		"\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000"+
		"\u0000\n:\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000eH\u0001"+
		"\u0000\u0000\u0000\u0010R\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000"+
		"\u0000\u0014^\u0001\u0000\u0000\u0000\u0016d\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f"+
		"\u0001\u0001\u0000\u0000\u0000 \'\u0003\u0006\u0003\u0000!\'\u0003\b\u0004"+
		"\u0000\"\'\u0003\n\u0005\u0000#\'\u0003\f\u0006\u0000$\'\u0003\u000e\u0007"+
		"\u0000%\'\u0003\u0004\u0002\u0000& \u0001\u0000\u0000\u0000&!\u0001\u0000"+
		"\u0000\u0000&\"\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000"+
		"\u0000()\u0005\u0017\u0000\u0000)*\u0005Q\u0000\u0000*+\u0003\u0016\u000b"+
		"\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u0017\u0000\u0000-.\u0005"+
		"U\u0000\u0000./\u0005\u001b\u0000\u0000/0\u0005Q\u0000\u000001\u0003\u0016"+
		"\u000b\u00001\u0007\u0001\u0000\u0000\u000023\u0005\u0017\u0000\u0000"+
		"34\u00056\u0000\u000045\u0005\u001a\u0000\u000056\u0005U\u0000\u00006"+
		"7\u0005\u001b\u0000\u000078\u0005Q\u0000\u000089\u0003\u0016\u000b\u0000"+
		"9\t\u0001\u0000\u0000\u0000:;\u0005\u0017\u0000\u0000;<\u0003\u0010\b"+
		"\u0000<=\u0005\u001b\u0000\u0000=>\u0005Q\u0000\u0000>?\u0003\u0016\u000b"+
		"\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\u0017\u0000\u0000AB\u0005"+
		"U\u0000\u0000BC\u0005J\u0000\u0000CD\u0003\u0010\b\u0000DE\u0005\u001b"+
		"\u0000\u0000EF\u0005Q\u0000\u0000FG\u0003\u0016\u000b\u0000G\r\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0017\u0000\u0000IJ\u0005U\u0000\u0000JK\u0005J\u0000"+
		"\u0000KL\u00056\u0000\u0000LM\u0005\u001a\u0000\u0000MN\u0005U\u0000\u0000"+
		"NO\u0005\u001b\u0000\u0000OP\u0005Q\u0000\u0000PQ\u0003\u0016\u000b\u0000"+
		"Q\u000f\u0001\u0000\u0000\u0000RS\u0005H\u0000\u0000ST\u0003\u0012\t\u0000"+
		"TU\u0005I\u0000\u0000U\u0011\u0001\u0000\u0000\u0000V[\u0003\u0014\n\u0000"+
		"WX\u0005J\u0000\u0000XZ\u0003\u0014\n\u0000YW\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\\u0013\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0005"+
		"U\u0000\u0000_`\u0005\u001a\u0000\u0000`b\u0005U\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0015\u0001\u0000\u0000\u0000"+
		"ce\u0005K\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"e\u0017\u0001\u0000\u0000\u0000\u0005\u001b&[ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}