package visitor;

import AST.*;
import AST.ComponentClasses.*;
import AST.ExpressionsClasses.Expression;
import AST.ImportsClasses.*;
import AST.Number;
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
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {

        return super.visitImportStatement(ctx);
    }


    @Override
    public ImportStatement visitImportSideEffect(AngularParser.ImportSideEffectContext ctx) {

        String module = stripQuotes(ctx.STRING().getText());
        return new ImportSideEffect(module);
    }

    @Override
    public ImportStatement visitImportDefault(AngularParser.ImportDefaultContext ctx) {

        String name = ctx.IDENTIFIER().getText();
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportDefault(name, module);
    }

    @Override
    public ImportStatement visitImportNamespace(AngularParser.ImportNamespaceContext ctx) {

        String alias = ctx.IDENTIFIER().getText();
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportNamespace(alias, module);
    }

    @Override
    public ImportStatement visitImportNamed(AngularParser.ImportNamedContext ctx) {
        // Visit the import specifiers
        List<ImportItem> items = (List<ImportItem>) visit(ctx.importSpecifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportNamed(items, module);
    }

    @Override
    public ImportStatement visitImportDefaultWithNamed(AngularParser.ImportDefaultWithNamedContext ctx) {
        // Default identifier and named import specifiers
        String defaultId = ctx.IDENTIFIER().getText();
        List<ImportItem> items = (List<ImportItem>) visit(ctx.importSpecifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportDefaultWithNamed(defaultId, items, module);
    }

    @Override
    public ImportStatement visitImportDefaultWithNamespace(AngularParser.ImportDefaultWithNamespaceContext ctx) {
        // Default identifier and namespace alias
        String defaultId = ctx.IDENTIFIER(0).getText();
        String alias = ctx.IDENTIFIER(1).getText();
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
        String original = ctx.IDENTIFIER(0).getText();
        String alias = (ctx.IDENTIFIER().size() > 1) ? ctx.IDENTIFIER(1).getText() : null;
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
    public MetadataProperty visitMetadataProperty(AngularParser.MetadataPropertyContext ctx) {

        if (ctx.selectorProperty() != null) {
            return (MetadataProperty) visit(ctx.selectorProperty());
        } else if (ctx.templateProperty() != null) {
            return (MetadataProperty) visit(ctx.templateProperty());
        } else if (ctx.stylesProperty() != null) {
            return(MetadataProperty) visit(ctx.stylesProperty());
        } else if (ctx.standalone() != null) {
            return(MetadataProperty) visit(ctx.standalone());
        } else if (ctx.imports() != null) {
            return(MetadataProperty) visit(ctx.imports());
        }
        throw new IllegalStateException("Unknown metadata property type");
    }
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

//    @Override
//    public StylesProperty visitStylesProperty(AngularParser.StylesPropertyContext ctx) {
//        if (ctx.styleUrls() != null) {
//            List<String> paths = new ArrayList<>();
//            if (ctx.styleUrls().arrayLiteral() != null) {
//                paths = visitArrayLiteral(ctx.styleUrls().arrayLiteral());
//            } else {
//                paths.add(cleanStringLiteral(ctx.styleUrls().STRING().getText()));
//            }
//            return new StylesProperty(true, paths);
//        }
//        throw new UnsupportedOperationException("Inline styles not implemented");
//    }
    @Override
    public StandaloneProperty visitStandalone(AngularParser.StandaloneContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.Boolean().getText());
        return new StandaloneProperty(value);
    }
//    @Override
//    public ImportsProperty visitImports(AngularParser.ImportsContext ctx) {
//        List<String> imports = visitArrayLiteral(ctx.arrayLiteral());
//        return new ImportsProperty(imports);
//    }
//
//    @Override
//    public List<String> visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
//        return ctx.STRING().stream()
//                .map(node -> cleanStringLiteral(node.getText()))
//                .collect(Collectors.toList());
//    }

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
