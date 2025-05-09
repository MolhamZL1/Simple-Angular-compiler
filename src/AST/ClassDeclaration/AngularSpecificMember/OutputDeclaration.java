package AST.ClassDeclaration.AngularSpecificMember;

import AST.Identifier;
import AST.Primary.ObjectInit;
import AST.Type;

public class OutputDeclaration implements AngularSpecificMember{
    private String alias;
    private Identifier identifier;
    private Type type;
    private ObjectInit eventEmitter;

    public OutputDeclaration(String alias, Identifier identifier, Type type, ObjectInit eventEmitter) {
        this.alias = alias;
        this.identifier = identifier;
        this.type = type;
        this.eventEmitter = eventEmitter;
    }

    @Override
    public String toString() {
        return "\nOutputDeclaration{" +
                "alias='" + alias + '\'' +
                ", identifier=" + identifier +
                ", type=" + type +
                ", eventEmitter=" + eventEmitter +
                '}';
    }
}
