package visitor;


import AST.Args;
import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Parameter;
import AST.Type;
import SymbolTable.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import loghandler.ColorsConsole;

import java.util.ArrayList;
import java.util.List;

public class SettingSymbolTable extends AngularParserBaseVisitor {
    ComponentSymbol componentSymbol;
    String pathFile;

    public SettingSymbolTable(ComponentSymbol componentSymbol,String pathFile){
        this.componentSymbol=componentSymbol;
        this.pathFile=pathFile;
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

        componentSymbol.getProperties().setSymbol(new ProparatyDecSymbol(ctx.name.IDENTIFIER().getText(),ctx.typeAnnotation()==null?"any": ctx.typeAnnotation().type().getText(),ctx.getStart().getLine()),pathFile);
        return null;
    }

    @Override
    public Void visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {
        componentSymbol.getProperties().setSymbol(new ProparatyDecSymbol(ctx.identifier().IDENTIFIER().getText(),ctx.typeAnnotation()==null?"any": ctx.typeAnnotation().type().getText(),ctx.getStart().getLine()),pathFile);
        componentSymbol.getInputs().setSymbol(new InputDecSymbol(ctx.identifier().IDENTIFIER().getText(),ctx.typeAnnotation()==null?"any": ctx.typeAnnotation().type().getText(),ctx.getStart().getLine()),pathFile);
        return null;
    }

    @Override
    public Void visitDeafultMethod(AngularParser.DeafultMethodContext ctx) {
      MethodDecSymbol methodDecSymbol=  new MethodDecSymbol(ctx.identifier().IDENTIFIER().getText(),ctx.typeAnnotation()==null?"any": ctx.typeAnnotation().type().getText(),ctx.getStart().getLine());
componentSymbol.getMethods().setSymbol(methodDecSymbol,pathFile);

        if (ctx.parameterList()!=null){
            for (AngularParser.ParameterContext parameterCtx:ctx.parameterList().parameter()
            ) {
               methodDecSymbol.getArgsMethodSymbolTable().setSymbol(new ArgsMethodSymbol(parameterCtx.identifier().IDENTIFIER().getText(),parameterCtx.typeAnnotation()==null?"any":parameterCtx.typeAnnotation().type().getText(),ctx.getStart().getLine()),methodDecSymbol.getName(),pathFile);
            }
        }
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
