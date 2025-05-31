package AST.ComponentClasses.Template;

import AST.ASTNode;

import java.util.List;

public class TemplateContent implements ASTNode {
    List<ASTNode> templateContents;

    public TemplateContent(List<ASTNode> templateContents) {
        this.templateContents = templateContents;
    }

    @Override
    public String toString() {
        return "TemplateContent{" +
                "templateContents=" + templateContents +
                '}';
    }
}
