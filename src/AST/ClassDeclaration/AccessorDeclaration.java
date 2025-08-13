package AST.ClassDeclaration;

import AST.MethodDeclaration.DeafultMethod;
import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
