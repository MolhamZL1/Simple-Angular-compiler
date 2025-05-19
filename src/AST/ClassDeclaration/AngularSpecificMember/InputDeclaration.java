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
        StringBuilder sb = new StringBuilder("\nInputDeclaration{");
        sb.append("alias='").append(alias != null ? alias : "").append('\'');

        if (config != null) {
            sb.append(", config=").append(config);
        }

        sb.append(", identifier=").append(identifier);

        if (type != null) {
            sb.append(", type=").append(type);
        }

        if (initializer != null) {
            sb.append(", initializer=").append(initializer);
        }

        sb.append('}');
        return sb.toString();
    }
}
