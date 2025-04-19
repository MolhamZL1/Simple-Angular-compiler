package visitor;

import AST.ASTNode;
import AST.ImportsClasses.*;
import AST.Program;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        // Assuming "STRING" in the AngularParser represents the quoted module name
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportSideEffect(module);
    }

    @Override
    public ImportStatement visitImportDefault(AngularParser.ImportDefaultContext ctx) {
        // Assuming "IDENTIFIER" represents the default import name
        String name = ctx.IDENTIFIER().getText();
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportDefault(name, module);
    }

    @Override
    public ImportStatement visitImportNamespace(AngularParser.ImportNamespaceContext ctx) {
        // Assuming "IDENTIFIER" is the alias for namespace import
        String alias = ctx.IDENTIFIER().getText();
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportNamespace(alias, module);
    }

    @Override
    public ImportStatement visitImportNamed(AngularParser.ImportNamedContext ctx) {
        // Visit the import specifiers
        List<ImportItem> items = visitImportSpecifier(ctx.importSpecifier());
        String module = stripQuotes(ctx.STRING().getText());
        return new ImportNamed(items, module);
    }

    @Override
    public ImportStatement visitImportDefaultWithNamed(AngularParser.ImportDefaultWithNamedContext ctx) {
        // Default identifier and named import specifiers
        String defaultId = ctx.IDENTIFIER().getText();
        List<ImportItem> items = visitImportSpecifier(ctx.importSpecifier());
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
        String alias = (ctx.IDENTIFIER().size() > 1) ? ctx.IDENTIFIER(1).getText() : original;
        return new ImportItem(original, alias);
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
