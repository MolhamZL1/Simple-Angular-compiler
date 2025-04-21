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
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(AngularParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(AngularParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeNavExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSafeNavExpr(AngularParser.SafeNavExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeNavExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSafeNavExpr(AngularParser.SafeNavExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpr(AngularParser.MemberIndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpr(AngularParser.MemberIndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(AngularParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(AngularParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpr(AngularParser.MemberDotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpr(AngularParser.MemberDotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(AngularParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(AngularParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSafeIndexExpr(AngularParser.SafeIndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSafeIndexExpr(AngularParser.SafeIndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(AngularParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(AngularParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(AngularParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(AngularParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(AngularParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(AngularParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AngularParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AngularParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
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