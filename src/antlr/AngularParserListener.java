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
	 * Enter a parse tree produced by the {@code ImportDefaultLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultLabel(AngularParser.ImportDefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportDefaultLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultLabel(AngularParser.ImportDefaultLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportNamespaceLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespaceLabel(AngularParser.ImportNamespaceLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportNamespaceLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespaceLabel(AngularParser.ImportNamespaceLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportNamedLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportNamedLabel(AngularParser.ImportNamedLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportNamedLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportNamedLabel(AngularParser.ImportNamedLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportDefaultWithNamedLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultWithNamedLabel(AngularParser.ImportDefaultWithNamedLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportDefaultWithNamedLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultWithNamedLabel(AngularParser.ImportDefaultWithNamedLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportDefaultWithNamespaceLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultWithNamespaceLabel(AngularParser.ImportDefaultWithNamespaceLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportDefaultWithNamespaceLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultWithNamespaceLabel(AngularParser.ImportDefaultWithNamespaceLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportSideEffectLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportSideEffectLabel(AngularParser.ImportSideEffectLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportSideEffectLabel}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportSideEffectLabel(AngularParser.ImportSideEffectLabelContext ctx);
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
	 * Enter a parse tree produced by the {@code SelectorPropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorPropertyLabel(AngularParser.SelectorPropertyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorPropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorPropertyLabel(AngularParser.SelectorPropertyLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplatePropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplatePropertyLabel(AngularParser.TemplatePropertyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplatePropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplatePropertyLabel(AngularParser.TemplatePropertyLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesPropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterStylesPropertyLabel(AngularParser.StylesPropertyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesPropertyLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitStylesPropertyLabel(AngularParser.StylesPropertyLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneLabel(AngularParser.StandaloneLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneLabel(AngularParser.StandaloneLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsLabel(AngularParser.ImportsLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsLabel}
	 * labeled alternative in {@link AngularParser#metadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsLabel(AngularParser.ImportsLabelContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#listOfId}.
	 * @param ctx the parse tree
	 */
	void enterListOfId(AngularParser.ListOfIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#listOfId}.
	 * @param ctx the parse tree
	 */
	void exitListOfId(AngularParser.ListOfIdContext ctx);
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
	 * Enter a parse tree produced by the {@code TemplateUrlLabel}
	 * labeled alternative in {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlLabel(AngularParser.TemplateUrlLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlLabel}
	 * labeled alternative in {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlLabel(AngularParser.TemplateUrlLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHTMLLabel}
	 * labeled alternative in {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHTMLLabel(AngularParser.TemplateHTMLLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHTMLLabel}
	 * labeled alternative in {@link AngularParser#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHTMLLabel(AngularParser.TemplateHTMLLabelContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContent(AngularParser.TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContent(AngularParser.TemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BiningAttrLabel}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterBiningAttrLabel(AngularParser.BiningAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BiningAttrLabel}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitBiningAttrLabel(AngularParser.BiningAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectiveAttrLabel}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveAttrLabel(AngularParser.DirectiveAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectiveAttrLabel}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveAttrLabel(AngularParser.DirectiveAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrLabel}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrLabel(AngularParser.HtmlAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrLabel}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrLabel(AngularParser.HtmlAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(AngularParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(AngularParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlsLabel}
	 * labeled alternative in {@link AngularParser#stylesProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsLabel(AngularParser.StyleUrlsLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlsLabel}
	 * labeled alternative in {@link AngularParser#stylesProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsLabel(AngularParser.StyleUrlsLabelContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#genericClassParameters}.
	 * @param ctx the parse tree
	 */
	void enterGenericClassParameters(AngularParser.GenericClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#genericClassParameters}.
	 * @param ctx the parse tree
	 */
	void exitGenericClassParameters(AngularParser.GenericClassParametersContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#classMemberModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberModifier(AngularParser.ClassMemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMemberModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberModifier(AngularParser.ClassMemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropartyDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterPropartyDeclerationLabel(AngularParser.PropartyDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropartyDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitPropartyDeclerationLabel(AngularParser.PropartyDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclerationLabel(AngularParser.MethodDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclerationLabel(AngularParser.MethodDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclerationLabel(AngularParser.VariableDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclerationLabel(AngularParser.VariableDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclerationLabel(AngularParser.ConstructorDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclerationLabel(AngularParser.ConstructorDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccessorDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterAccessorDeclerationLabel(AngularParser.AccessorDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccessorDeclerationLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitAccessorDeclerationLabel(AngularParser.AccessorDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AngularMemberLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void enterAngularMemberLabel(AngularParser.AngularMemberLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AngularMemberLabel}
	 * labeled alternative in {@link AngularParser#classStatment}.
	 * @param ctx the parse tree
	 */
	void exitAngularMemberLabel(AngularParser.AngularMemberLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclerationLabel(AngularParser.InputDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclerationLabel(AngularParser.InputDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclerationLabel(AngularParser.OutputDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclerationLabel(AngularParser.OutputDeclerationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ViewChildDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void enterViewChildDeclerationLabel(AngularParser.ViewChildDeclerationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ViewChildDeclerationLabel}
	 * labeled alternative in {@link AngularParser#angularSpecificMember}.
	 * @param ctx the parse tree
	 */
	void exitViewChildDeclerationLabel(AngularParser.ViewChildDeclerationLabelContext ctx);
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
	 * Enter a parse tree produced by the {@code DeaafultContructorLabel}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeaafultContructorLabel(AngularParser.DeaafultContructorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeaafultContructorLabel}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeaafultContructorLabel(AngularParser.DeaafultContructorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelegatedConstructorLabel}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDelegatedConstructorLabel(AngularParser.DelegatedConstructorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelegatedConstructorLabel}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDelegatedConstructorLabel(AngularParser.DelegatedConstructorLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#delegatedConstructor}.
	 * @param ctx the parse tree
	 */
	void enterDelegatedConstructor(AngularParser.DelegatedConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#delegatedConstructor}.
	 * @param ctx the parse tree
	 */
	void exitDelegatedConstructor(AngularParser.DelegatedConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#deafultConstructor}.
	 * @param ctx the parse tree
	 */
	void enterDeafultConstructor(AngularParser.DeafultConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#deafultConstructor}.
	 * @param ctx the parse tree
	 */
	void exitDeafultConstructor(AngularParser.DeafultConstructorContext ctx);
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
	 * Enter a parse tree produced by the {@code DeafultmethodLabel}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeafultmethodLabel(AngularParser.DeafultmethodLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeafultmethodLabel}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeafultmethodLabel(AngularParser.DeafultmethodLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonymusMethodLabel}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnonymusMethodLabel(AngularParser.AnonymusMethodLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonymusMethodLabel}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnonymusMethodLabel(AngularParser.AnonymusMethodLabelContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableDeclerrationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclerrationLabel(AngularParser.VariableDeclerrationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclerrationLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclerrationLabel(AngularParser.VariableDeclerrationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatmentLabel(AngularParser.IfStatmentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatmentLabel(AngularParser.IfStatmentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatmentLabel(AngularParser.BlockStatmentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatmentLabel(AngularParser.BlockStatmentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatmentLabel(AngularParser.LoopStatmentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatmentLabel(AngularParser.LoopStatmentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopControlStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopControlStatmentLabel(AngularParser.LoopControlStatmentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopControlStatmentLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopControlStatmentLabel(AngularParser.LoopControlStatmentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatemntLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatemntLabel(AngularParser.ExpressionStatemntLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatemntLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatemntLabel(AngularParser.ExpressionStatemntLabelContext ctx);
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
	 * Enter a parse tree produced by the {@code ForStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatementLabel(AngularParser.ForStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatementLabel(AngularParser.ForStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementLabel(AngularParser.WhileStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementLabel(AngularParser.WhileStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatementLabel(AngularParser.DoWhileStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatementLabel(AngularParser.DoWhileStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatementLabel(AngularParser.ForOfStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatementLabel}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatementLabel(AngularParser.ForOfStatementLabelContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#ifSection}.
	 * @param ctx the parse tree
	 */
	void enterIfSection(AngularParser.IfSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifSection}.
	 * @param ctx the parse tree
	 */
	void exitIfSection(AngularParser.IfSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseIfSection}.
	 * @param ctx the parse tree
	 */
	void enterElseIfSection(AngularParser.ElseIfSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfSection}.
	 * @param ctx the parse tree
	 */
	void exitElseIfSection(AngularParser.ElseIfSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseSection}.
	 * @param ctx the parse tree
	 */
	void enterElseSection(AngularParser.ElseSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseSection}.
	 * @param ctx the parse tree
	 */
	void exitElseSection(AngularParser.ElseSectionContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#variableDeclarationKeyword}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationKeyword(AngularParser.VariableDeclarationKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclarationKeyword}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationKeyword(AngularParser.VariableDeclarationKeywordContext ctx);
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
	 * Enter a parse tree produced by the {@code ArthmaticOpExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArthmaticOpExpr(AngularParser.ArthmaticOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArthmaticOpExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArthmaticOpExpr(AngularParser.ArthmaticOpExprContext ctx);
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
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(AngularParser.LogicalExprContext ctx);
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
	 * Enter a parse tree produced by the {@code Literalprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralprimary(AngularParser.LiteralprimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literalprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralprimary(AngularParser.LiteralprimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifierprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierprimary(AngularParser.IdentifierprimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifierprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierprimary(AngularParser.IdentifierprimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralprimary(AngularParser.ArrayLiteralprimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralprimary(AngularParser.ArrayLiteralprimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteralprimary(AngularParser.MapLiteralprimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteralprimary(AngularParser.MapLiteralprimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralprimary(AngularParser.ObjectLiteralprimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralprimary(AngularParser.ObjectLiteralprimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Objectinitprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterObjectinitprimary(AngularParser.ObjectinitprimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Objectinitprimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitObjectinitprimary(AngularParser.ObjectinitprimaryContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AngularParser.IdentifierContext ctx);
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