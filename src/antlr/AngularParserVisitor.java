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
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfStatement(AngularParser.ForOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AngularParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreFixExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFixExpr(AngularParser.PreFixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(AngularParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeNavExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeNavExpr(AngularParser.SafeNavExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpr(AngularParser.MemberIndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(AngularParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpr(AngularParser.MemberDotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(AngularParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeIndexExpr(AngularParser.SafeIndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostFixExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFixExpr(AngularParser.PostFixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(AngularParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(AngularParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loopControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatement(AngularParser.LoopControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(AngularParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AngularParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngularParser.EosContext ctx);
}