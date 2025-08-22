package visitor;


import SymbolTable.ArgsMethod.ArgsMethodSymbol;
import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Input.InputDecSymbol;
import SymbolTable.Method.MethodDecSymbol;
import SymbolTable.Properaty.ProparatyDecSymbol;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SymbolTableInitializerVisitor extends AngularParserBaseVisitor {
    ComponentSymbol componentSymbol;
    String pathFile;

    public SymbolTableInitializerVisitor(ComponentSymbol componentSymbol, String pathFile){
        this.componentSymbol=componentSymbol;
        this.pathFile=pathFile;
    }

    private static String stripQuotes(String s){
        if (s == null) return null;
        s = s.trim();
        if ((s.startsWith("'") && s.endsWith("'")) || (s.startsWith("\"") && s.endsWith("\"")))
            return s.substring(1, s.length()-1);
        return s;
    }

    @Override
    public Void visitSelectorProperty(AngularParser.SelectorPropertyContext ctx) {
        componentSymbol.setName(stripQuotes(ctx.STRING().getText()));
        return null;
    }

    @Override
    public Void visitTemplateUrl(AngularParser.TemplateUrlContext ctx) {
        String raw = ctx.STRING().getText();
        String rel = stripQuotes(raw);
        Path base = Paths.get(pathFile).getParent();             // مسار مجلد الملف الحالي
        String resolved = base.resolve(rel).normalize().toString();
        componentSymbol.setTemplatePath(resolved);

        return null;
    }

    @Override
    public Void visitStyleUrls(AngularParser.StyleUrlsContext ctx) {
        String rel = stripQuotes(ctx.STRING().get(0).getText());
        Path base = Paths.get(pathFile).getParent();
        String resolved = base.resolve(rel).normalize().toString();
        componentSymbol.setStylePath(resolved);
        return  null;
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
