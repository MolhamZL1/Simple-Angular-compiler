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
	 * Visit a parse tree produced by the {@code ImportDefaultLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultLabel(AngularParser.ImportDefaultLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportNamespaceLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespaceLabel(AngularParser.ImportNamespaceLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportNamedLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamedLabel(AngularParser.ImportNamedLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportDefaultWithNamedLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultWithNamedLabel(AngularParser.ImportDefaultWithNamedLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportDefaultWithNamespaceLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultWithNamespaceLabel(AngularParser.ImportDefaultWithNamespaceLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportSideEffectLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSideEffectLabel(AngularParser.ImportSideEffectLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code SelectorPropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorPropertyLabel(AngularParser.SelectorPropertyLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplatePropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatePropertyLabel(AngularParser.TemplatePropertyLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesPropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesPropertyLabel(AngularParser.StylesPropertyLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneLabel(AngularParser.StandaloneLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsLabel(AngularParser.ImportsLabelContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#listOfId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfId(AngularParser.ListOfIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlLabel}
	 * labeled alternative in {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlLabel(AngularParser.TemplateUrlLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHTMLLabel}
	 * labeled alternative in {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHTMLLabel(AngularParser.TemplateHTMLLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code StyleUrlsLabel}
	 * labeled alternative in {@link AngularParser#stylesProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsLabel(AngularParser.StyleUrlsLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code PropartyDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropartyDeclerationLabel(AngularParser.PropartyDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclerationLabel(AngularParser.MethodDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclerationLabel(AngularParser.VariableDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclerationLabel(AngularParser.ConstructorDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessorDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorDeclerationLabel(AngularParser.AccessorDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AngularMemberLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularMemberLabel(AngularParser.AngularMemberLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclerationLabel(AngularParser.InputDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutputDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDeclerationLabel(AngularParser.OutputDeclerationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ViewChildDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewChildDeclerationLabel(AngularParser.ViewChildDeclerationLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code DeaafultContructorLabel}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeaafultContructorLabel(AngularParser.DeaafultContructorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelegatedConstructorLabel}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegatedConstructorLabel(AngularParser.DelegatedConstructorLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code DeafultmethodLabel}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeafultmethodLabel(AngularParser.DeafultmethodLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymusMethodLabel}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymusMethodLabel(AngularParser.AnonymusMethodLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code VariableDeclerrationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclerrationLabel(AngularParser.VariableDeclerrationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatmentLabel(AngularParser.IfStatmentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatmentLabel(AngularParser.BlockStatmentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatmentLabel(AngularParser.LoopStatmentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopControlStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatmentLabel(AngularParser.LoopControlStatmentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatemntLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatemntLabel(AngularParser.ExpressionStatemntLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loopControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatement(AngularParser.LoopControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementLabel(AngularParser.ForStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementLabel(AngularParser.WhileStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatementLabel(AngularParser.DoWhileStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfStatementLabel(AngularParser.ForOfStatementLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code Literalprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralprimary(AngularParser.LiteralprimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifierprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierprimary(AngularParser.IdentifierprimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralprimary(AngularParser.ArrayLiteralprimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteralprimary(AngularParser.MapLiteralprimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralprimary(AngularParser.ObjectLiteralprimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Objectinitprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectinitprimary(AngularParser.ObjectinitprimaryContext ctx);
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