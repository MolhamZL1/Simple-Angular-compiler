package AST.ComponentClasses;

import AST.Primary.ArrayLiteral;

import java.util.List;

public class ImportsComponent implements MetadataProperty{
   private List<String> arrayLiteral;

    public ImportsComponent(List<String> arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public String toString() {
        return "ImportsComponent{" +
                 arrayLiteral +
                '}';
    }
}
