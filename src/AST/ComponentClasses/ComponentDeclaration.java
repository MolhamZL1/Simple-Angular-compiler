package AST.ComponentClasses;


import AST.ASTNode;
import Code_Generation.CodeResult;

import java.util.List;

public class ComponentDeclaration implements ASTNode {
    @Override
    public CodeResult generateCode() {
        return null;
    }

    private List<MetadataProperty> metadataPropertyList;

    public ComponentDeclaration(List<MetadataProperty> metadataPropertyList) {
        this.metadataPropertyList = metadataPropertyList;
    }

    @Override
    public String toString() {
        return "\nComponent{"+metadataPropertyList+"}";
    }
}
