package AST.ClassDeclaration.AngularSpecificMember;

import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Primary.ObjectInit;
import AST.Primary.ObjectLiteral;
import AST.Type;

public class InputDeclaration implements AngularSpecificMember{
    private String alias;
    private ObjectLiteral config;
    private Identifier identifier;
    private Type type;
    private Expression initializer;

    public InputDeclaration(String alias, ObjectLiteral config, Identifier identifier, Type type, Expression initializer) {
        this.alias = alias;
        this.config = config;
        this.identifier = identifier;
        this.type = type;
        this.initializer = initializer;
    }

    @Override
    public String toString() {
        return "\nInputDeclaration{" +
                "alias='" + alias + '\'' +
                ", config=" + config +
                ", identifier=" + identifier +
                ", type=" + type +
                ", initializer=" + initializer +
                '}';
    }
}
