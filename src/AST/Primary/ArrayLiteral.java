package AST.Primary;

import AST.ExpressionsClasses.Expression;

import java.util.List;

public class ArrayLiteral implements Primary{
    List<Expression> items;

    public ArrayLiteral(List<Expression> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ArrayLiteral{" +
                "items=" + items +
                '}';
    }
}
