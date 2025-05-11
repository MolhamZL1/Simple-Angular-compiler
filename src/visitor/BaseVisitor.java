package visitor;

import AST.*;
import AST.ComponentClasses.*;
import AST.ExpressionsClasses.*;
import AST.ImportsClasses.*;
import AST.Number;
import AST.Primary.*;
import AST.Statement.VariableDeclaration;
import AST.Statement.VariableDeclarationKeyword;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor {
    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
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
//    @Override
//    public MetadataProperty visitMetadataProperty(AngularParser.MetadataPropertyContext ctx) {
//
//        if (ctx.selectorProperty() != null) {
//            return (MetadataProperty) visit(ctx.selectorProperty());
//        } else if (ctx.templateProperty() != null) {
//            return (MetadataProperty) visit(ctx.templateProperty());
//        } else if (ctx.stylesProperty() != null) {
//            return(MetadataProperty) visit(ctx.stylesProperty());
//        } else if (ctx.standalone() != null) {
//            return(MetadataProperty) visit(ctx.standalone());
//        } else if (ctx.imports() != null) {
//            return(MetadataProperty) visit(ctx.imports());
//        }
//        throw new IllegalStateException("Unknown metadata property type");
//    }
@Override
    public SelectorProperty visitSelectorProperty(AngularParser.SelectorPropertyContext ctx) {
        String selector = ctx.STRING().getText();
        return new SelectorProperty(stripQuotes(selector));
    }
    @Override
    public TemplateProperty visitTemplateProperty(AngularParser.TemplatePropertyContext ctx) {
        if (ctx.templateUrl() != null) {
            return (TemplateProperty) visit(ctx.templateUrl());

        } else if(ctx.templetHTML()!=null) {
            return (TemplateProperty) visit(ctx.templetHTML());
        }
        throw new IllegalStateException("Unknown template property type");

    }

    @Override
    public TemplateUrl visitTemplateUrl(AngularParser.TemplateUrlContext ctx) {
        String url=ctx.STRING().getText();
        return new TemplateUrl(url);
    }

    @Override
    public TempletHTML visitTempletHTML(AngularParser.TempletHTMLContext ctx) {
        HTML html=(HTML) visit(ctx.html());
        return new TempletHTML(html);
    }

    @Override
    public HTML visitHtml(AngularParser.HtmlContext ctx) {
       String html= ctx.STRING().getText();
        return new HTML(html);
    }

    @Override
    public StandaloneProperty visitStandalone(AngularParser.StandaloneContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.Boolean().getText());
        return new StandaloneProperty(value);
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        boolean isExported=ctx.EXPORT()!=null;
        VariableDeclarationKeyword variableDeclarationKeyword=(VariableDeclarationKeyword)visit(ctx.variableDeclarationKeyword());
        Type type=(Type) visit(ctx.typeAnnotation().type());
        Identifier name=(Identifier) visit(ctx.name);
        Expression value=(Expression) visit(ctx.expression());
        Identifier castedType=(Identifier) visit(ctx.castedType);
        return new VariableDeclaration(isExported,variableDeclarationKeyword,type,name,value,castedType);
    }

    @Override
    public VariableDeclarationKeyword visitVariableDeclarationKeyword(AngularParser.VariableDeclarationKeywordContext ctx) {
        return new VariableDeclarationKeyword(ctx.getText());
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
        return new CallExpr((Expression) visit(ctx.expression()),(Args) visit(ctx.args()));
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
        Args args= (Args) visit(ctx.args());
        return new ObjectInit(className,type,args);
    }

    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        Identifier proparty= (Identifier) visit(ctx.identifier());
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
            literal= (String) visit(ctx.number());
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
