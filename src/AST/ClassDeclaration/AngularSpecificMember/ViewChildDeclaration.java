package AST.ClassDeclaration.AngularSpecificMember;

import AST.Identifier;
import AST.Primary.ObjectLiteral;
import AST.Type;
import Code_Generation.CodeResult;

public class ViewChildDeclaration implements AngularSpecificMember{
    private String refrenceName;
    private ObjectLiteral metaData;
    private Identifier proparaty;


    private Type type;

    public ViewChildDeclaration(String refrenceName, ObjectLiteral metaData, Identifier proparaty, Type type) {
        this.refrenceName = refrenceName;
        this.metaData = metaData;
        this.proparaty = proparaty;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nViewChildDeclaration{");
        sb.append("refrenceName='").append(refrenceName).append('\'');

        if (metaData != null) {
            sb.append(", metaData=").append(metaData);
        }

        sb.append(", proparaty=").append(proparaty);

        if (type != null) {
            sb.append(", type=").append(type);
        }

        sb.append('}');
        return sb.toString();
    }
    @Override
    public CodeResult generateCode() {
        // ref name
        final String refJs = jsString(refrenceName);

        // property name
        final String propName = (proparaty != null ? proparaty.toString() : "");
        final String propJs = jsString(propName);

        // options/meta as JS
        String optsJs = "null";
        if (metaData != null) {
            try {
                // إذا عندك metaData.generateCode() يرجّع JS literal مثل { static:true }
                CodeResult mcr = metaData.generateCode();
                if (mcr != null && mcr.js != null && !mcr.js.isBlank()) {
                    optsJs = mcr.js;
                } else {
                    // fallback بسيط
                    optsJs = metaData.toString();
                }
            } catch (Exception e) {
                optsJs = metaData.toString();
            }
        }

        // type as string (اختياري)
        final String typeJs = (type == null) ? "null" : jsString(type.toString());

        // نجمع الـ descriptor داخل ميتاداتا الكلاس
        String js =
                "(function(cls){\n" +
                        "  cls.__meta = cls.__meta || {};\n" +
                        "  (cls.__meta.viewChildren = cls.__meta.viewChildren || []).push({\n" +
                        "    ref: " + refJs + ",\n" +
                        "    property: " + propJs + ",\n" +
                        "    opts: " + optsJs + ",\n" +
                        "    type: " + typeJs + "\n" +
                        "  });\n" +
                        "})(this);\n";

        // ما في HTML مباشر لهاد العضو
        return new CodeResult("", js);
    }

    // ===== Helpers =====
    private static String jsString(String s) {
        if (s == null) return "null";
        String e = s
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r");
        return "\"" + e + "\"";
    }
}
