package AST.ClassDeclaration;

import AST.MethodDeclaration.DeafultMethod;

public class AccessorDeclaration implements ClassStatment{
    private String accessor;
    private DeafultMethod method;

    public AccessorDeclaration(String accessor, DeafultMethod method) {
        this.accessor = accessor;
        this.method = method;
    }

    @Override
    public String toString() {
        return "\nAccessorDeclaration{" +
                "accessor='" + accessor + '\'' +
                ", method=" + method +
                '}';
    }
}
