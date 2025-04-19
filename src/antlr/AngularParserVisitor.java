// Generated from C:/Users/USER/Desktop/New folder/angularCompiler2/src/antlr/AngularParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importSideEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSideEffect(AngularParser.ImportSideEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefault(AngularParser.ImportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(AngularParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamed(AngularParser.ImportNamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDefaultWithNamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultWithNamed(AngularParser.ImportDefaultWithNamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDefaultWithNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultWithNamespace(AngularParser.ImportDefaultWithNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(AngularParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngularParser.EosContext ctx);
}