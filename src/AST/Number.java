package AST;

public class Number implements ASTNode{
   private String number;

    public Number(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "number{" +
                 number +
                '}';
    }
}
