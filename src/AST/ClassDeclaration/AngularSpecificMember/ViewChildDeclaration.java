package AST.ClassDeclaration.AngularSpecificMember;

import AST.Identifier;
import AST.Primary.ObjectLiteral;
import AST.Type;

public class ViewChildDeclaration implements AngularSpecificMember{
    private String refrenceName;
    private ObjectLiteral metaData;
    private Identifier proparaty;
    private Type type;

    public ViewChildDeclaration(String refrenceName, ObjectLiteral metaData, Identifier proparaty, Type type) {
        this.refrenceName = refrenceName;
        this.metaData = metaData;
        this.proparaty = proparaty;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nViewChildDeclaration{" +
                "refrenceName='" + refrenceName + '\'' +
                ", metaData=" + metaData +
                ", proparaty=" + proparaty +
                ", type=" + type +
                '}';
    }
}
