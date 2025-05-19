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
        StringBuilder sb = new StringBuilder("\nViewChildDeclaration{");
        sb.append("refrenceName='").append(refrenceName).append('\'');

        if (metaData != null) {
            sb.append(", metaData=").append(metaData);
        }

        sb.append(", proparaty=").append(proparaty);

        if (type != null) {
            sb.append(", type=").append(type);
        }

        sb.append('}');
        return sb.toString();
    }
}
