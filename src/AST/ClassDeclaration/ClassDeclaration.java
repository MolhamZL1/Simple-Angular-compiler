package AST.ClassDeclaration;

import AST.ASTNode;
import AST.Identifier;
import Code_Generation.CodeResult;

import java.util.List;

public class ClassDeclaration implements ASTNode {
    private boolean isExported;
    private boolean isAbstract;
    private Identifier name;
    private List<GenericClassParameter> genericParameters;
    private Identifier parent;
    private List<Identifier> interfaces;
    private ClassBody classBody;


    public ClassDeclaration(boolean isExported, boolean isAbstract, Identifier name, List<GenericClassParameter> genericParameters, Identifier parent, List<Identifier> interfaces, ClassBody classBody) {
        this.isExported = isExported;
        this.isAbstract = isAbstract;
        this.name = name;
        this.genericParameters = genericParameters;
        this.parent = parent;
        this.interfaces = interfaces;
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "ClassDeclaration{" +
                "isExported=" + isExported +
                ", isAbstract=" + isAbstract +
                ", name=" + name +
                (genericParameters != null ? ", genericParameters=" + genericParameters : "") +
                (parent != null ? ", parent=" + parent : "") +
                (interfaces != null ? ", interfaces=" + interfaces : "") +
                ", classBody=" + classBody +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
