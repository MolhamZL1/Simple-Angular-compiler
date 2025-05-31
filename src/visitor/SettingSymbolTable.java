package visitor;


import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Type;
import SymbolTable.ComponentSymbol;
import SymbolTable.ProparatyDecSymbol;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import loghandler.ColorsConsole;

public class SettingSymbolTable extends AngularParserBaseVisitor {
    ComponentSymbol componentSymbol;

    public SettingSymbolTable(ComponentSymbol componentSymbol){
        this.componentSymbol=componentSymbol;
    }

    @Override
    public Void visitSelectorProperty(AngularParser.SelectorPropertyContext ctx) {
        componentSymbol.setName(ctx.STRING().getText());
        return null;
    }

    @Override
    public Void visitTemplateUrl(AngularParser.TemplateUrlContext ctx) {
        componentSymbol.setTemplatePath(ctx.STRING().getText());

        return null;
    }

    @Override
    public Void visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {

        componentSymbol.getProperties().setSymbol(new ProparatyDecSymbol(ctx.name.IDENTIFIER().getText(),ctx.typeAnnotation()==null?"any": ctx.typeAnnotation().type().getText(),ctx.getStart().getLine()));
        return null;
    }

    @Override
    public Void visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {
        componentSymbol.getProperties().setSymbol(new ProparatyDecSymbol(ctx.identifier().IDENTIFIER().getText(),ctx.typeAnnotation()==null?"any": ctx.typeAnnotation().type().getText(),ctx.getStart().getLine()));

        return null;
    }

// @Override
//    public Void visitImports(AngularParser.ImportsContext ctx) {
//        List<String> identifiers = new ArrayList<>();
//
//        for (AngularParser.IdentifierContext idctx : ctx.listOfId().identifier()) {
//            Identifier id=(Identifier) visit(idctx);
//            identifiers.add(id.getIdentifier());
//        }
//        componentSymbol.setImports(identifiers);
//        return null;
//    }
}
