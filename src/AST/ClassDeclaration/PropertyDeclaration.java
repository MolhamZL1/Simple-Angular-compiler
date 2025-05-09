package AST.ClassDeclaration;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Type;

public class PropertyDeclaration implements ClassStatment{
    private Identifier name;
    private Type type;
    private Expression value;

    public PropertyDeclaration(Identifier name, Type type, Expression value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                "name=" + name +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
