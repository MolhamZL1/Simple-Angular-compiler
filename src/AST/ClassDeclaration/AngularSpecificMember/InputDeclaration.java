package AST.ClassDeclaration.AngularSpecificMember;

import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Primary.ObjectInit;
import AST.Primary.ObjectLiteral;
import AST.Type;
import Code_Generation.CodeResult;

public class InputDeclaration implements AngularSpecificMember{
    private String alias;
    private ObjectLiteral config;
    private Identifier identifier;
    private Type type;
    private Expression initializer;

    public InputDeclaration(String alias, ObjectLiteral config, Identifier identifier, Type type, Expression initializer) {
        this.alias = alias;
        this.config = config;
        this.identifier = identifier;
        this.type = type;
        this.initializer = initializer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nInputDeclaration{");
        sb.append("alias='").append(alias != null ? alias : "").append('\'');

        if (config != null) {
            sb.append(", config=").append(config);
        }

        sb.append(", identifier=").append(identifier);

        if (type != null) {
            sb.append(", type=").append(type);
        }

        if (initializer != null) {
            sb.append(", initializer=").append(initializer);
        }

        sb.append('}');
        return sb.toString();
    }

    @Override
    public CodeResult generateCode() {
        // اسم الخاصية
        String name = (identifier == null || identifier.getIdentifier() == null || identifier.getIdentifier().isBlank())
                ? "_input"
                : identifier.getIdentifier();

        // المهيّئ (إن وُجد)
        CodeResult init = (initializer != null)
                ? initializer.generateCode()
                : new CodeResult("undefined", "");

        // ميتاداتا (alias/config/type) ما إلها أثر وقت التشغيل، لذلك منترك تعليق اختياري
        StringBuilder js = new StringBuilder();
        if (init.js != null) js.append(init.js);

        // عرّف المتغيّر بشكل Global بسيط ليستخدمه التمبلِت
        js.append("var ").append(name).append(" = ")
                .append(init.html == null || init.html.isBlank() ? "undefined" : init.html)
                .append(";\n");

        // ملاحظة: alias و config و type معلومات تعريفية فقط
        // js.append("/* @Input alias=" + (alias!=null?alias:"") + " */\n");

        return new CodeResult("", js.toString());
    }

}
