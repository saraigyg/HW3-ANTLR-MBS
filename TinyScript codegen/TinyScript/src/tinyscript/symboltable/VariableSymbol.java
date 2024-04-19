package tinyscript.symboltable;

import tinyscript.typesystem.TSType;

public class VariableSymbol {
    public TSType type;
    public String name;


    public VariableSymbol(TSType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return type.name + " " + name;
    }
}
