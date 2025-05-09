package AST.ClassDeclaration;

import AST.ASTNode;
import AST.Identifier;

public class GenericClassParameter implements ASTNode {
private Identifier parameter;
private Identifier parent;

    public GenericClassParameter(Identifier parameter, Identifier parent) {
        this.parameter = parameter;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "\nGenericClassParameters{" +
                "parameter=" + parameter +
                ", parent=" + parent +
                '}';
    }
}
