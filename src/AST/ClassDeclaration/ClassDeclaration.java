package AST.ClassDeclaration;

import AST.Identifier;

import java.util.List;

public class ClassDeclaration {
    private boolean isExported;
    private boolean isAbstract;
    private Identifier name;
    private List<GenericClassParameter> genericParameters;
    private Identifier parent;
    private List<Identifier> interfaces;

    public ClassDeclaration(boolean isExported, boolean isAbstract, Identifier name, List<GenericClassParameter> genericParameters, Identifier parent, List<Identifier> interfaces) {
        this.isExported = isExported;
        this.isAbstract = isAbstract;
        this.name = name;
        this.genericParameters = genericParameters;
        this.parent = parent;
        this.interfaces = interfaces;
    }

    @Override
    public String toString() {
        return "\nClassDeclaration{" +
                "isExported=" + isExported +
                ", isAbstract=" + isAbstract +
                ", name=" + name +
                ", genericParameters=" + genericParameters +
                ", parent=" + parent +
                ", interfaces=" + interfaces +
                '}';
    }
}
