package AST.ComponentClasses;

import AST.ASTNode;

public class HTML implements ASTNode {
   private String html;

    public HTML(String html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "html{" +
                html +
                '}';
    }
}
