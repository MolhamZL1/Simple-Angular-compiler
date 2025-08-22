package AST.ComponentClasses;


import AST.ASTNode;
import Code_Generation.CodeResult;

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
    @Override
    public CodeResult generateCode() {
        // بيانات تعريفية فقط — لا HTML ولا JS وقت التشغيل
        return new CodeResult("", "");
    }
}
