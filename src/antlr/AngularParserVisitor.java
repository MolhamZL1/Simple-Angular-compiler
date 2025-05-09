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
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(AngularParser.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataProperty(AngularParser.MetadataPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(AngularParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templetHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempletHTML(AngularParser.TempletHTMLContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stylesProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleUrls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#genericClassParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericClassParameters(AngularParser.GenericClassParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classMemberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberModifier(AngularParser.ClassMemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatment(AngularParser.ClassStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularSpecificMember(AngularParser.AngularSpecificMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#viewChildDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewChildDeclaration(AngularParser.ViewChildDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#delegatedConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegatedConstructor(AngularParser.DelegatedConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#deafultConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeafultConstructor(AngularParser.DeafultConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorDeclaration(AngularParser.AccessorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#deafultMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeafultMethod(AngularParser.DeafultMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#anonymosMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymosMethod(AngularParser.AnonymosMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loopControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatement(AngularParser.LoopControlStatementContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#ifSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSection(AngularParser.IfSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfSection(AngularParser.ElseIfSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSection(AngularParser.ElseSectionContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#variableDeclarationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationKeyword(AngularParser.VariableDeclarationKeywordContext ctx);
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
	 * Visit a parse tree produced by the {@code AnounymusMethodExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnounymusMethodExpr(AngularParser.AnounymusMethodExprContext ctx);
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
	 * Visit a parse tree produced by the {@code MemberIndexExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpr(AngularParser.MemberIndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpr(AngularParser.MemberDotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArthmaticOpExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArthmaticOpExpr(AngularParser.ArthmaticOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(AngularParser.EqualityExprContext ctx);
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
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionAssignmentExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionAssignmentExpr(AngularParser.AdditionAssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(AngularParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(AngularParser.ThisExprContext ctx);
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
	 * Visit a parse tree produced by the {@code MapLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteralExpr(AngularParser.MapLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectinitExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectinitExpr(AngularParser.ObjectinitExprContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#mapLitral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLitral(AngularParser.MapLitralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#mapmember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapmember(AngularParser.MapmemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AngularParser.IdentifierContext ctx);
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