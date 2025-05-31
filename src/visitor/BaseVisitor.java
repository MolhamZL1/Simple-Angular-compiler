package visitor;

import AST.*;
import AST.ClassDeclaration.*;
import AST.ClassDeclaration.AngularSpecificMember.InputDeclaration;
import AST.ClassDeclaration.AngularSpecificMember.OutputDeclaration;
import AST.ClassDeclaration.AngularSpecificMember.ViewChildDeclaration;
import AST.ClassDeclaration.ConstructorDeclaration.DeafultConstructor;
import AST.ClassDeclaration.ConstructorDeclaration.DelegatedConstructor;
import AST.ComponentClasses.*;
import AST.ExpressionsClasses.*;
import AST.ImportsClasses.*;
import AST.MethodDeclaration.AnonymosMethod;
import AST.MethodDeclaration.DeafultMethod;
import AST.Number;
import AST.Primary.*;
import AST.Statement.BlockStatement;
import AST.Statement.IfStatement.ElseIfSection;
import AST.Statement.IfStatement.ElseSection;
import AST.Statement.IfStatement.IfSection;
import AST.Statement.IfStatement.IfStatement;
import AST.Statement.LoopStatement.*;
import AST.Statement.Statement;
import AST.Statement.VariableDeclaration;
import AST.Statement.VariableDeclarationKeyword;
import SymbolTable.ComponentSymbol;
import SymbolTable.ComponentsSymboleTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import loghandler.ColorsConsole;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor {
  private ComponentsSymboleTable componentsSymboleTable ;
  private String pathFile;

    public BaseVisitor(ComponentsSymboleTable componentsSymboleTable,String pathFile) {
        this.componentsSymboleTable = componentsSymboleTable;
        this.pathFile=pathFile;
    }

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {

        Program program=new Program();
        for (int i = 0; i < ctx.children.size(); i++) {
            program.addChild((ASTNode) visit(ctx.getChild(i)));
        }

        return program;
    }

    @Override
    public ImportStatement visitImportSideEffect(AngularParser.ImportSideEffectContext ctx) {

        String module = stripQuotes(ctx.STRING().getText());
        return new ImportSideEffect(module);
    }

    @Override
    public ImportStatement visitImportDefault(AngularParser.ImportDefaultContext ctx) {

        Identifier name = (Identifier)visit( ctx.identifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportDefault(name, module);
    }

    @Override
    public ImportStatement visitImportNamespace(AngularParser.ImportNamespaceContext ctx) {

        Identifier alias = (Identifier) visit(ctx.identifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportNamespace(alias, module);
    }

    @Override
    public ImportStatement visitImportNamed(AngularParser.ImportNamedContext ctx) {

        List<ImportItem> items = (List<ImportItem>) visit(ctx.importSpecifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportNamed(items, module);
    }

    @Override
    public ImportStatement visitImportDefaultWithNamed(AngularParser.ImportDefaultWithNamedContext ctx) {

        Identifier defaultId =(Identifier) visit(ctx.identifier());
        List<ImportItem> items = (List<ImportItem>) visit(ctx.importSpecifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportDefaultWithNamed(defaultId, items, module);
    }

    @Override
    public ImportStatement visitImportDefaultWithNamespace(AngularParser.ImportDefaultWithNamespaceContext ctx) {

        Identifier defaultId =(Identifier) visit(ctx.identifier(0));
        Identifier alias =(Identifier) visit(ctx.identifier(1));
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportDefaultWithNamespace(defaultId, alias, module);
    }

    public List<ImportItem> visitImportSpecifier(AngularParser.ImportSpecifierContext ctx) {
        List<ImportItem> importItemsList = new ArrayList<>();
        if (ctx.importList() != null) {
            for (AngularParser.ImportItemContext importItemCtx : ctx.importList().importItem()) {
                ImportItem importItem = (ImportItem) visit(importItemCtx);
                importItemsList.add(importItem);
            }
        }

        return importItemsList;
    }

    public ImportItem visitImportItem(AngularParser.ImportItemContext ctx) {
        // Extracting original name and alias for an import item
        Identifier original = (Identifier) visit(ctx.identifier(0));
        Identifier alias=null;
        if(ctx.identifier(1)!=null){
         alias=(Identifier) visit(ctx.identifier(1));
        }

        return new ImportItem(original, alias);
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        List<MetadataProperty> metadataProperties = new ArrayList<>();
        AngularParser.ComponentMetadataContext metadataCtx = ctx.componentMetadata();

        if (metadataCtx.metadataProperty() != null) {
            for (AngularParser.MetadataPropertyContext propCtx : metadataCtx.metadataProperty()) {
                MetadataProperty property = (MetadataProperty) visit(propCtx);
                if (property != null) {
                    metadataProperties.add(property);
                }
            }
        }
        ComponentDeclaration componentDeclaration=new ComponentDeclaration(metadataProperties);
        return componentDeclaration;
    }

    @Override
    public StandaloneProperty visitStandalone(AngularParser.StandaloneContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.Boolean().getText());
        return new StandaloneProperty(value);
    }

@Override
    public SelectorProperty visitSelectorProperty(AngularParser.SelectorPropertyContext ctx) {
        String selector = ctx.STRING().getText();
        return new SelectorProperty(stripQuotes(selector));
    }

    @Override
    public TemplateUrl visitTemplateUrl(AngularParser.TemplateUrlContext ctx) {
        String url=ctx.STRING().getText();
        return new TemplateUrl(url);
    }

    @Override
    public TemplateContent visitTemplateContent(AngularParser.TemplateContentContext ctx) {
        List<ASTNode>  templateContents=new ArrayList<>();
        for (int i = 0; i <ctx.getChildCount() ; i++) {
            templateContents.add( (ASTNode) visit(ctx.getChild(i)));
        }
        return new TemplateContent(templateContents);
    }

    @Override
    public TempletHTML visitTempletHTML(AngularParser.TempletHTMLContext ctx) {

        return new TempletHTML((TemplateContent) visit(ctx.templateContent()));
    }

    @Override
    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
         Identifier tagname =(Identifier) visit(ctx.tagName);
         if(tagname.getIdentifier().startsWith("app-")){
          componentsSymboleTable.check(tagname.getIdentifier(),pathFile);
         }

         List<Attribute> attributes=new ArrayList<>();
        for (AngularParser.AttributeContext atrctx: ctx.attribute() ) {
            attributes.add((Attribute)visit(atrctx));
        }
         TemplateContent templateContent=ctx.templateContent()!=null?(TemplateContent) visit(ctx.templateContent()):null;
        return new HtmlElement(tagname,attributes,templateContent);
    }

    @Override
    public Interpolation visitInterpolation(AngularParser.InterpolationContext ctx) {
        Interpolation interpolation=   new Interpolation((Expression) visit(ctx.expression()));


        for (ComponentSymbol componentSymbol:componentsSymboleTable.getSymbols().values()) {
            int index=componentSymbol.getTemplatePath().lastIndexOf("/");
           String templatePath=componentSymbol.getTemplatePath().substring(index+1).replaceAll("'","");
if(pathFile.contains(templatePath)){
    componentSymbol.getProperties().check(interpolation.getExpression().toString(),pathFile);
}
        }
        return interpolation ;
    }

    @Override
    public Binding visitBinding(AngularParser.BindingContext ctx) {
        return new Binding((Identifier) visit(ctx.identifier()),(AttributeValue) visit(ctx.attributeValue()));
    }

    @Override
    public NgForDirective visitNgForDirective(AngularParser.NgForDirectiveContext ctx) {
        return new NgForDirective((AttributeValue) visit(ctx.attributeValue()));
    }

    @Override
    public NgIfDirective visitNgIfDirective(AngularParser.NgIfDirectiveContext ctx) {
        return new NgIfDirective((AttributeValue) visit(ctx.attributeValue()));
    }

    @Override
    public AttributeValue visitAttributeValue(AngularParser.AttributeValueContext ctx) {
        return new AttributeValue(ctx.interpolation()!=null?(Interpolation) visit(ctx.interpolation()):null,ctx.STRING()!=null?ctx.STRING().getText():null);
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        return new HtmlAttribute((AttributeValue)visit(ctx.attributeValue()),ctx.identifier()!=null?((Identifier)visit(ctx.identifier())).getIdentifier():ctx.getChild(0).getText());
    }

    @Override
    public StyleUrls visitStyleUrls(AngularParser.StyleUrlsContext ctx) {
        List<String> styles=new ArrayList<>();
        for (TerminalNode style:  ctx.STRING()) {
            styles.add(style.getText());
        }
        return new StyleUrls(styles);
    }

    @Override
    public ImportsComponent visitImports(AngularParser.ImportsContext ctx) {

        return new ImportsComponent((List<String>) visit(ctx.listOfId()));
    }
    @Override
    public List<String> visitListOfId(AngularParser.ListOfIdContext ctx) {
        List<String> identifiers = new ArrayList<>();

        for (AngularParser.IdentifierContext idctx : ctx.identifier()) {
            Identifier id=(Identifier) visit(idctx);
            identifiers.add(id.getIdentifier());
        }

        return identifiers;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        boolean isExported = ctx.EXPORT() != null;
        boolean isAbstract = ctx.ABSTRACT() != null;
        Identifier name = (Identifier) visit(ctx.name);
        List<GenericClassParameter> genericClassParameters = new ArrayList<>();
        if(ctx.genericClassParameters()!=null){
        for (AngularParser.GenericClassParametersContext genCtx : ctx.genericClassParameters()) {
            GenericClassParameter genericClassParameter = (GenericClassParameter) visit(genCtx);
            if (genericClassParameter != null) {
                genericClassParameters.add(genericClassParameter);
            }
        }
    }
        Identifier parent=ctx.parent!=null?(Identifier)visit(ctx.parent):null;
        List<Identifier> interfaces=new ArrayList<>();
        if (ctx.identifier()!=null){
        for (int i = 2; i <ctx.identifier().size() ; i++) {
            interfaces.add((Identifier) visit(ctx.identifier(i)));
        }}
        ClassBody classBody=(ClassBody) visit(ctx.classBody());
       return new ClassDeclaration(isExported,isAbstract,name,genericClassParameters,parent,interfaces,classBody);
    }

    @Override
    public GenericClassParameter visitGenericClassParameters(AngularParser.GenericClassParametersContext ctx) {
        return new GenericClassParameter((Identifier) visit(ctx.parameterid),(Identifier) visit(ctx.parent));//maybe null here add if else
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {

        List<ClassMember> classMembers=new ArrayList<>();
        if (ctx.classMember()!=null){
            for (AngularParser.ClassMemberContext classMemberContext: ctx.classMember() ) {
                classMembers.add((ClassMember) visit(classMemberContext));
            }
        }
        return new ClassBody(classMembers);
    }

    @Override
    public ClassMember visitClassMember(AngularParser.ClassMemberContext ctx) {
        AccessModifier accessModifier=null;
        if (ctx.accessModifier()!=null){
            accessModifier=(AccessModifier) visit(ctx.accessModifier());
        }
        ClassMemberModifier classMemberModifier=null;
        if(ctx.classMemberModifier()!=null){
            classMemberModifier=(ClassMemberModifier) visit(ctx.classMemberModifier());
        }

        ClassStatment classStatment=(ClassStatment) visit(ctx.classStatment());
        return new ClassMember(accessModifier,classMemberModifier,classStatment);
    }

    @Override
    public ClassMemberModifier visitClassMemberModifier(AngularParser.ClassMemberModifierContext ctx) {
        return new ClassMemberModifier(ctx.getText());
    }

    @Override
    public AccessModifier visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        return new AccessModifier(ctx.getText());
    }

    @Override
    public PropertyDeclaration visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        Identifier name=(Identifier) visit(ctx.name);
        Type type=null;
        if (ctx.typeAnnotation()!=null){
         type=(Type) visit(ctx.typeAnnotation().type());
        }
        Expression value=null;
        if (ctx.value!=null) {
             value = (Expression) visit(ctx.value);
        }
        return new PropertyDeclaration(name,type,value);
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        boolean isExported=ctx.EXPORT()!=null;
        VariableDeclarationKeyword variableDeclarationKeyword=(VariableDeclarationKeyword)visit(ctx.variableDeclarationKeyword());
        Type type=null;
        if (ctx.typeAnnotation()!=null){
            type=(Type) visit(ctx.typeAnnotation().type());
        }
        Identifier name=(Identifier) visit(ctx.name);
        Expression value=null;
        if (ctx.value!=null) {
            value = (Expression) visit(ctx.value);
        }
        Identifier castedType=null;
        if (ctx.castedType!=null) {
            castedType = (Identifier) visit(ctx.castedType);
        }
       // varDecSymbolTable.set(new VarDecSymbol(name.getIdentifier(),type==null?"not specified":type.getType(),ctx.getStart().getLine()));
        return new VariableDeclaration(isExported,variableDeclarationKeyword,type,name,value,castedType);
    }

    @Override
    public VariableDeclarationKeyword visitVariableDeclarationKeyword(AngularParser.VariableDeclarationKeywordContext ctx) {
        return new VariableDeclarationKeyword(ctx.getText());
    }

    @Override
    public DelegatedConstructor visitDelegatedConstructor(AngularParser.DelegatedConstructorContext ctx) {
        List<Parameter> parameters=new ArrayList<>();
        Args args=null;
        if (ctx.args()!=null){
            args=(Args) visit(ctx.args());
        }
        if (ctx.parameterList()!=null){
            for (AngularParser.ParameterContext parameterCtx:ctx.parameterList().parameter()
                 ) {
                parameters.add((Parameter) visit(parameterCtx));
            }
        }
        return new DelegatedConstructor(parameters,args);
    }

    @Override
    public DeafultConstructor visitDeafultConstructor(AngularParser.DeafultConstructorContext ctx) {
        List<Parameter> parameters=new ArrayList<>();
        BlockStatement blockStatement=null;
        if (ctx.blockStatement()!=null){
            blockStatement=(BlockStatement) visit(ctx.blockStatement());
        }
        if (ctx.parameterList()!=null){
            for (AngularParser.ParameterContext parameterCtx:ctx.parameterList().parameter()
            ) {
                parameters.add((Parameter) visit(parameterCtx));
            }
        }
        return new DeafultConstructor(parameters,blockStatement);
    }

    @Override
    public AccessorDeclaration visitAccessorDeclaration(AngularParser.AccessorDeclarationContext ctx) {
        String accessor=ctx.getChild(0).getText();
        DeafultMethod deafultMethod=(DeafultMethod) visit(ctx.deafultMethod());

        return new AccessorDeclaration(accessor,deafultMethod);
    }

    @Override
    public InputDeclaration visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {
        String alias = ctx.STRING() != null ? ctx.STRING().getText() : null;
        ObjectLiteral config = ctx.objectLiteral() != null ? (ObjectLiteral) visit(ctx.objectLiteral()) : null;
        Identifier identifier = (Identifier) visit(ctx.identifier());
        Type type = ctx.typeAnnotation() != null ? (Type) visit(ctx.typeAnnotation().type()) : null;
        Expression initializer = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new InputDeclaration(alias, config, identifier, type, initializer);
    }

    @Override
    public OutputDeclaration visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx) {
        String alias = ctx.STRING() != null ? ctx.STRING().getText() : null;
        Identifier identifier = (Identifier) visit(ctx.identifier());
        Type type = ctx.typeAnnotation() != null ? (Type) visit(ctx.typeAnnotation().type()) : null;
         ObjectInit eventEmitter=(ObjectInit)visit(ctx.objectInit());
        return new OutputDeclaration(alias, identifier, type,eventEmitter);
    }

    @Override
    public ViewChildDeclaration visitViewChildDeclaration(AngularParser.ViewChildDeclarationContext ctx) {
        String refrenceName = ctx.STRING().getText();
        Identifier proparaty = (Identifier) visit(ctx.identifier());
        ObjectLiteral metaData = ctx.objectLiteral() != null
                ? (ObjectLiteral) visit(ctx.objectLiteral())
                : null;
        Type type = ctx.typeAnnotation() != null && ctx.typeAnnotation().type() != null
                ? (Type) visit(ctx.typeAnnotation().type())
                : null;
        return new ViewChildDeclaration(refrenceName, metaData, proparaty, type);
    }

    @Override
    public DeafultMethod visitDeafultMethod(AngularParser.DeafultMethodContext ctx) {
        boolean isAsync=ctx.ASYNC()!=null;
        Identifier name=(Identifier) visit(ctx.identifier());
        List<Parameter> parameters=new ArrayList<>();
        Args args=null;
        if (ctx.parameterList()!=null){
            for (AngularParser.ParameterContext parameterCtx:ctx.parameterList().parameter()
            ) {
                parameters.add((Parameter) visit(parameterCtx));
            }
        } else if (ctx.args()!=null) {
            args=(Args) visit(ctx.args());
        }
        Type type = ctx.typeAnnotation() != null && ctx.typeAnnotation().type() != null
                ? (Type) visit(ctx.typeAnnotation().type())
                : null;
        ASTNode body= (ASTNode) (ctx.blockStatement()!=null?visit(ctx.blockStatement()):visit(ctx.expressionStatement().expression()));
        return new DeafultMethod(isAsync,name,parameters,args,type,body);
    }

    @Override
    public AnonymosMethod visitAnonymosMethod(AngularParser.AnonymosMethodContext ctx) {
        boolean isAsync=ctx.ASYNC()!=null;
        List<Parameter> parameters=new ArrayList<>();
        Args args=null;
        if (ctx.parameterList()!=null){
            for (AngularParser.ParameterContext parameterCtx:ctx.parameterList().parameter()
            ) {
                parameters.add((Parameter) visit(parameterCtx));
            }
        } else if (ctx.args()!=null) {
            args=(Args) visit(ctx.args());
        }
        Type type = ctx.typeAnnotation() != null && ctx.typeAnnotation().type() != null
                ? (Type) visit(ctx.typeAnnotation().type())
                : null;
        ASTNode body= (ASTNode) (ctx.blockStatement()!=null?visit(ctx.blockStatement()):visit(ctx.expressionStatement().expression()));
        return new AnonymosMethod(isAsync,parameters,args,type,body);
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Identifier name=(Identifier) visit(ctx.identifier());
        Type type = ctx.typeAnnotation() != null && ctx.typeAnnotation().type() != null
                ? (Type) visit(ctx.typeAnnotation().type())
                : null;
        Literal literal=ctx.literal()!=null?(Literal) visit(ctx.literal()):null;
        return new Parameter(name,type,literal);
    }

    @Override
    public IfStatement visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfSection ifSection=(IfSection) visit(ctx.ifSection());
        List<ElseIfSection> elseIfSections=new ArrayList<>();
        if (ctx.elseIfSection()!=null){
            for (AngularParser.ElseIfSectionContext elseIfSection:ctx.elseIfSection()
            ) {
                elseIfSections.add((ElseIfSection) visit(elseIfSection));
            }
        }
        ElseSection elseSection=ctx.elseSection()!=null?(ElseSection) visit(ctx.elseSection()):null;
        return new IfStatement(ifSection,elseIfSections,elseSection);
    }

    @Override
    public IfSection visitIfSection(AngularParser.IfSectionContext ctx) {
        Expression condition=(Expression) visit(ctx.expression());
        Statement body=(Statement) visit(ctx.statement());
        return new IfSection(condition,body);
    }

    @Override
    public ElseIfSection visitElseIfSection(AngularParser.ElseIfSectionContext ctx) {
        Expression condition=(Expression) visit(ctx.expression());
        Statement body=(Statement) visit(ctx.statement());
        return new ElseIfSection(condition,body);
    }

    @Override
    public ElseSection visitElseSection(AngularParser.ElseSectionContext ctx) {
        Statement body=(Statement) visit(ctx.statement());
        return new ElseSection(body);
    }

    @Override
    public BlockStatement visitBlockStatement(AngularParser.BlockStatementContext ctx) {

List<Statement> statements=new ArrayList<>();
        if (ctx.statement()!=null){
            for (AngularParser.StatementContext statementContext:ctx.statement()
            ) {
                statements.add((Statement) visit(statementContext));
            }
        }

        return new BlockStatement(statements);
    }

    @Override
    public ForStatement visitForStatement(AngularParser.ForStatementContext ctx) {
         ASTNode initialization=(ASTNode)visit(ctx.initialization!=null?ctx.initialization:ctx.variableDeclaration());
         Expression update=ctx.update!=null?(Expression)visit(ctx.update):null;
         Expression condition=ctx.condition!=null?(Expression)visit(ctx.condition):null;
         Statement body=(Statement)visit(ctx.statement());
        return new ForStatement(initialization,update,condition,body);
    }

    @Override
    public WhileStatement visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        return new WhileStatement((Expression) visit(ctx.expression()),(Statement) visit(ctx.statement()));
    }

    @Override
    public DoWhileStatement visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx) {
        return new DoWhileStatement((Expression) visit(ctx.expression()),(Statement) visit(ctx.statement()));
    }

    @Override
    public ForOfStatement visitForOfStatement(AngularParser.ForOfStatementContext ctx) {
        return new ForOfStatement(
                (VariableDeclarationKeyword) visit(ctx.variableDeclarationKeyword()),
                (Identifier) visit(ctx.identifier()),
                (Expression) visit(ctx.expression()),
                (Statement) visit(ctx.statement())
        );
    }

    @Override
    public LoopControlStatement visitLoopControlStatement(AngularParser.LoopControlStatementContext ctx) {
        return new LoopControlStatement( ctx.getText());
    }

    @Override
    public Expression visitExpressionStatemntLabel(AngularParser.ExpressionStatemntLabelContext ctx) {
        return (Expression) visit(ctx.expressionStatement().expression());
    }

    @Override
    public ThisExpr visitThisExpr(AngularParser.ThisExprContext ctx) {
     return new ThisExpr();
    }

    @Override
    public DotExpr visitMemberDotExpr(AngularParser.MemberDotExprContext ctx) {
        return new DotExpr((Expression) visit(ctx.left), (Expression) visit(ctx.right));
    }

    @Override
    public MemberIndexExpr visitMemberIndexExpr(AngularParser.MemberIndexExprContext ctx) {
        return new MemberIndexExpr((Expression) visit(ctx.member),(Expression) visit(ctx.index));
    }

    @Override
    public CallExpr visitCallExpr(AngularParser.CallExprContext ctx) {
        return new CallExpr((Expression) visit(ctx.expression()),ctx.args()!=null?(Args) visit(ctx.args()):null);
    }

    @Override
    public SafeNavExpr visitSafeNavExpr(AngularParser.SafeNavExprContext ctx) {
        return new SafeNavExpr((Expression) visit(ctx.expression()),(Identifier) visit(ctx.identifier()));
    }

    @Override
    public SafeIndexExpr visitSafeIndexExpr(AngularParser.SafeIndexExprContext ctx) {
        return new SafeIndexExpr((Expression) visit(ctx.baseObject),(Expression) visit(ctx.indexObject));
    }

    @Override
    public UnaryExpr visitUnaryExpr(AngularParser.UnaryExprContext ctx) {
        return new UnaryExpr((Expression) visit(ctx.expression()),ctx.op.getText());
    }

    @Override
    public ArthmaticOpExpr visitArthmaticOpExpr(AngularParser.ArthmaticOpExprContext ctx) {
        return new ArthmaticOpExpr((Expression) visit(ctx.left), ctx.op.getText(),(Expression) visit(ctx.right));
    }

    @Override
    public RelationalExpr visitRelationalExpr(AngularParser.RelationalExprContext ctx) {
        return new RelationalExpr((Expression) visit(ctx.left), ctx.op.getText(),(Expression) visit(ctx.right));
    }

    @Override
    public EqualityExpr visitEqualityExpr(AngularParser.EqualityExprContext ctx) {
        return new EqualityExpr((Expression) visit(ctx.left), ctx.op.getText(),(Expression) visit(ctx.right));
    }

    @Override
    public LogicalExpr visitLogicalExpr(AngularParser.LogicalExprContext ctx) {
        return new LogicalExpr((Expression) visit(ctx.left), ctx.op.getText(),(Expression) visit(ctx.right));
    }

    @Override
    public AssignmentExpr visitAssignmentExpr(AngularParser.AssignmentExprContext ctx) {
        return new AssignmentExpr((Expression) visit(ctx.variable),(Expression) visit(ctx.value));
    }

    @Override
    public AdditionAssignmentExpr visitAdditionAssignmentExpr(AngularParser.AdditionAssignmentExprContext ctx) {
        return new AdditionAssignmentExpr((Expression) visit(ctx.variable),ctx.op.getText(),(Expression) visit(ctx.value));
    }

    @Override
    public TernaryExpr visitTernaryExpr(AngularParser.TernaryExprContext ctx) {
        return new TernaryExpr((Expression) visit(ctx.condition),(Expression) visit(ctx.true_),(Expression) visit(ctx.false_));
    }

    @Override
    public ParenthesizedExpr visitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx) {
        return new ParenthesizedExpr((Expression) visit(ctx.expression()));
    }

    @Override
    public PostFixExpr visitPostFixExpr(AngularParser.PostFixExprContext ctx) {
        return new PostFixExpr((Expression) visit(ctx.expression()),ctx.MINUS(0)!=null?"--":"++");
    }

    @Override
    public PreFixExpr visitPreFixExpr(AngularParser.PreFixExprContext ctx) {
        return new PreFixExpr((Expression) visit(ctx.expression()),ctx.MINUS(0)!=null?"--":"++");
    }

    @Override
    public ArrayLiteral visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
        List<Expression> items=new ArrayList<>();
        for (AngularParser.ExpressionContext expressionctx : ctx.expression()) {
            Expression expression = (Expression) visit(expressionctx);
            if (expression != null) {
                items.add(expression);
            }
        }
        return new ArrayLiteral(items);
    }

    @Override
    public ObjectLiteral visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        List<PropertyAssignment> properties=new ArrayList<>();
        for (AngularParser.PropertyAssignmentContext propartyctx : ctx.propertyAssignment()) {
            PropertyAssignment proparaty = (PropertyAssignment) visit(propartyctx);
            if (proparaty != null) {
                properties.add(proparaty);
            }
        }
        return new ObjectLiteral(properties);
    }

    @Override
    public ObjectInit visitObjectInit(AngularParser.ObjectInitContext ctx) {
        Identifier className= (Identifier) visit(ctx.identifier());
        Type type= (Type) visit(ctx.type());
        Args args=ctx.args()!=null? (Args) visit(ctx.args()):null;
        return new ObjectInit(className,type,args);
    }

    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        Identifier proparty= ctx.identifier()!=null?(Identifier) visit(ctx.identifier()):new Identifier(ctx.IMPORTS().getText());
        Expression expression=(Expression) visit(ctx.expression());
        return new PropertyAssignment(proparty,expression);
    }

    @Override
    public MapLitral visitMapLitral(AngularParser.MapLitralContext ctx) {
        List<Mapmember> mapmembers=new ArrayList<>();

            for (AngularParser.MapmemberContext memberCtx : ctx.mapmember()) {
                Mapmember mapmember = (Mapmember) visit(memberCtx);
                if (mapmember != null) {
                    mapmembers.add(mapmember);
                }
            }

        return new MapLitral(mapmembers);
    }

    @Override
    public Mapmember visitMapmember(AngularParser.MapmemberContext ctx) {
        String key=ctx.STRING().getText();
        Expression value= (Expression) visit(ctx.expression());
        return new Mapmember(key,value);
    }

    @Override
    public Identifier visitIdentifier(AngularParser.IdentifierContext ctx) {
        return new Identifier(ctx.getText());
    }

    @Override
    public Literal visitLiteral(AngularParser.LiteralContext ctx) {
        String literal;
        if(ctx.number()!=null){
           Number number= (Number) visit(ctx.number());
           literal=number.getNumber();
        }
        else{
            literal=ctx.getText();
        }
        return new Literal(literal);
    }

    @Override
    public Args visitArgs(AngularParser.ArgsContext ctx) {
        List expressions=new ArrayList<Expression>();
        for (AngularParser.ExpressionContext exprctx :ctx.expression()) {
            Expression expression= (Expression) visit(exprctx);
            expressions.add(expression);
        }
        return new Args(expressions);
    }

    @Override
    public Number visitNumber(AngularParser.NumberContext ctx) {
        return new Number(ctx.getText());
    }

    @Override
    public Type visitType(AngularParser.TypeContext ctx) {
        return new Type(ctx.getText());
    }

    private String stripQuotes(String s) {
        // Removing quotes around strings like 'module' or "module"
        return s.substring(1, s.length() - 1); // remove the first and last characters (quotes)
    }


    @Override
    public Object visitEos(AngularParser.EosContext ctx) {
        return super.visitEos(ctx);
    }
}
