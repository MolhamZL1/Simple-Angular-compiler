package AST.ComponentClasses;

import AST.ASTNode;

public class AttributeValue implements ASTNode {
private Interpolation interpolation;
private String value;

    public AttributeValue(Interpolation interpolation, String value) {
        this.interpolation = interpolation;
        this.value = value;
    }

    @Override
    public String toString() {//add null check
        return "AttributeValue{" +
                "interpolation=" + interpolation +
                ", value='" + value + '\'' +
                '}';
    }
}
