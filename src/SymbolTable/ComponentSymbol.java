package SymbolTable;

import AST.ExpressionsClasses.Expression;

import java.util.List;

public class ComponentSymbol {
    private String name;
    private String templatePath;
    private List<String> imports;
    private ProparatyDecSymbolTable properties;
    private int line;

    public ComponentSymbol() {
        this.properties =new ProparatyDecSymbolTable();
    }

    public ProparatyDecSymbolTable getProperties() {
        return properties;
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
