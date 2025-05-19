package AST.Statement;

import AST.ASTNode;

public class VariableDeclarationKeyword implements ASTNode {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public VariableDeclarationKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "VariableDeclarationKeyword{" +
                "keyword='" + keyword + '\'' +
                '}';
    }
}
