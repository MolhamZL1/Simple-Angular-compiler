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
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadata(AngularParser.ComponentMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadata(AngularParser.ComponentMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterMetadataProperty(AngularParser.MetadataPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitMetadataProperty(AngularParser.MetadataPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(AngularParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(AngularParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templetHTML}.
	 * @param ctx the parse tree
	 */
	void enterTempletHTML(AngularParser.TempletHTMLContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templetHTML}.
	 * @param ctx the parse tree
	 */
	void exitTempletHTML(AngularParser.TempletHTMLContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylesProperty}.
	 * @param ctx the parse tree
	 */
	void enterStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylesProperty}.
	 * @param ctx the parse tree
	 */
	void exitStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void enterAngularSpecificMember(AngularParser.AngularSpecificMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void exitAngularSpecificMember(AngularParser.AngularSpecificMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(AngularParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclaration(AngularParser.OutputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#viewChildDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterViewChildDeclaration(AngularParser.ViewChildDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#viewChildDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitViewChildDeclaration(AngularParser.ViewChildDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#deafultMethod}.
	 * @param ctx the parse tree
	 */
	void enterDeafultMethod(AngularParser.DeafultMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#deafultMethod}.
	 * @param ctx the parse tree
	 */
	void exitDeafultMethod(AngularParser.DeafultMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#anonymosMethod}.
	 * @param ctx the parse tree
	 */
	void enterAnonymosMethod(AngularParser.AnonymosMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#anonymosMethod}.
	 * @param ctx the parse tree
	 */
	void exitAnonymosMethod(AngularParser.AnonymosMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAccessorDeclaration(AngularParser.AccessorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAccessorDeclaration(AngularParser.AccessorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(AngularParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(AngularParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AngularParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AngularParser.BlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Obinit}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObinit(AngularParser.ObinitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Obinit}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObinit(AngularParser.ObinitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreFixExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreFixExpr(AngularParser.PreFixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreFixExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreFixExpr(AngularParser.PreFixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnounymusMethodExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnounymusMethodExpr(AngularParser.AnounymusMethodExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnounymusMethodExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnounymusMethodExpr(AngularParser.AnounymusMethodExprContext ctx);
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
	 * Enter a parse tree produced by the {@code PostFixExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostFixExpr(AngularParser.PostFixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostFixExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostFixExpr(AngularParser.PostFixExprContext ctx);
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
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionAssignmentExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionAssignmentExpr(AngularParser.AdditionAssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionAssignmentExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionAssignmentExpr(AngularParser.AdditionAssignmentExprContext ctx);
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
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(AngularParser.ThisExprContext ctx);
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
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteralExpr(AngularParser.MapLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteralExpr(AngularParser.MapLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void enterObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void exitObjectInit(AngularParser.ObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#mapLitral}.
	 * @param ctx the parse tree
	 */
	void enterMapLitral(AngularParser.MapLitralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#mapLitral}.
	 * @param ctx the parse tree
	 */
	void exitMapLitral(AngularParser.MapLitralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#mapmember}.
	 * @param ctx the parse tree
	 */
	void enterMapmember(AngularParser.MapmemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#mapmember}.
	 * @param ctx the parse tree
	 */
	void exitMapmember(AngularParser.MapmemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#loopControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopControlStatement(AngularParser.LoopControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#loopControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopControlStatement(AngularParser.LoopControlStatementContext ctx);
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