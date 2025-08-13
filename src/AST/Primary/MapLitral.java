package AST.Primary;

import Code_Generation.CodeResult;

import java.util.List;

public class MapLitral implements Primary{
   private List<Mapmember> items;

    public MapLitral(List<Mapmember> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "\nMapLitral{" +
                "items=" + items +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        return null;
    }
}
