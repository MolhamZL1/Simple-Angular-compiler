package AST.ComponentClasses;

import Code_Generation.CodeResult;

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


    @Override
    public CodeResult generateCode() {
        // ميتاداتا فقط — ما في HTML/JS وقت التشغيل
        return new CodeResult("", "");
    }
}
