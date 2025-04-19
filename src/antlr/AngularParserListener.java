// Generated from C:/Users/USER/Desktop/New folder/angularCompiler2/src/antlr/AngularParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSideEffect}.
	 * @param ctx the parse tree
	 */
	void enterImportSideEffect(AngularParser.ImportSideEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSideEffect}.
	 * @param ctx the parse tree
	 */
	void exitImportSideEffect(AngularParser.ImportSideEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(AngularParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(AngularParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(AngularParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(AngularParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamed}.
	 * @param ctx the parse tree
	 */
	void enterImportNamed(AngularParser.ImportNamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamed}.
	 * @param ctx the parse tree
	 */
	void exitImportNamed(AngularParser.ImportNamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importDefaultWithNamed}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultWithNamed(AngularParser.ImportDefaultWithNamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDefaultWithNamed}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultWithNamed(AngularParser.ImportDefaultWithNamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importDefaultWithNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultWithNamespace(AngularParser.ImportDefaultWithNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDefaultWithNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultWithNamespace(AngularParser.ImportDefaultWithNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(AngularParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(AngularParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngularParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngularParser.EosContext ctx);
}