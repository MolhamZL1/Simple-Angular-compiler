package AST.ComponentClasses;


import AST.ASTNode;

import java.util.List;

public class ComponentDeclaration implements ASTNode {
private List<MetadataProperty> metadataPropertyList;

    public ComponentDeclaration(List<MetadataProperty> metadataPropertyList) {
        this.metadataPropertyList = metadataPropertyList;
    }

    @Override
    public String toString() {
        return "\nComponent{"+metadataPropertyList+"}";
    }
}
