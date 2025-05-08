package AST;

import java.util.List;

public class ObjectLiteral implements Primary{
    List<PropertyAssignment> properties;

    public ObjectLiteral(List<PropertyAssignment> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "\nObjectLiteral{" +
                "properties=" + properties +
                '}';
    }
}
