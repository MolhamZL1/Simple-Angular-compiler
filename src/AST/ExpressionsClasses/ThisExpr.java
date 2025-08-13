package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

public class ThisExpr implements Expression{
    @Override
    public String toString() {
        return "this";
    }

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
