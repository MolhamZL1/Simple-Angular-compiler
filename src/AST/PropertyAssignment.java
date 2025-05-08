package AST;

import AST.ExpressionsClasses.Expression;

public class PropertyAssignment implements ASTNode{
    private Identifier  property;
    private Expression value;

    public PropertyAssignment(Identifier property, Expression value) {
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nPropertyAssignment{" +
                "property=" + property +
                ", value=" + value +
                '}';
    }
}
