package AST.ComponentClasses.Template;

import AST.ASTNode;
import Code_Generation.CodeResult;

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
    @Override
    public CodeResult generateCode() {
        StringBuilder html = new StringBuilder();
        StringBuilder js = new StringBuilder();
        for (ASTNode node : templateContents) {
            if (node != null) {
                CodeResult child = node.generateCode();
                html.append(child.html);
                js.append(child.js);
            }
        }
        return new CodeResult(html.toString(), js.toString());
    }
}
