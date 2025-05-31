package SymbolTable;

import AST.ExpressionsClasses.Expression;

import java.util.List;

public class ComponentSymbol implements Symbol{
    private String name;
    private String templatePath;
    private List<String> imports;
    private ProparatyDecSymbolTable properties;
    private MethodDecSymbolTable methods;
    private int line;

    public ComponentSymbol() {
        this.properties =new ProparatyDecSymbolTable();
        this.methods =new MethodDecSymbolTable();
    }

    public ProparatyDecSymbolTable getProperties() {
        return properties;
    }

    public MethodDecSymbolTable getMethods() {
        return methods;
    }

    public String getName() {
        return name;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public List<String> getImports() {
        return imports;
    }

    public int getLine() {
        return line;
    }

    public void setName(String name) {

        this.name = name.replaceAll("'","");;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
