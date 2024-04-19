package tinyscript.symboltable;

import java.util.HashMap;

public class Scope {
    private final Scope previous;
    private final HashMap<String, VariableSymbol> variables = new HashMap<>();
    private final HashMap<String, FunctionSymbol> functions = new HashMap<>();  // also supports scoped (local) functions, for example, inside classes

    public Scope getPrevious() {
        return previous;
    }

    public Scope(Scope previous) {
        this.previous = previous;
    }

    public VariableSymbol getVariable(String name) {
        if (variables.containsKey(name))
            return variables.get(name);
        else if (previous != null)
            return previous.getVariable(name);

        return null;
    }

    public FunctionSymbol getFunction(String name) {
        if (functions.containsKey(name))
            return functions.get(name);
        else if (previous != null)
            return previous.getFunction(name);

        return null;
    }

    public boolean addVariable(String name, VariableSymbol symbol) {
        if (variables.containsKey(name)) {
            return false;
        }

        variables.put(name, symbol);
        return true;
    }

    public boolean addFunction(String name, FunctionSymbol symbol) {
        if (functions.containsKey(name)) {
            return false;
        }

        functions.put(name, symbol);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        if (previous != null)
            bld.append(previous);

        bld.append("-------Scope start--------\n");

        for (var variable : variables.values()) {
            bld.append(variable.toString()).append("\n");
        }

        for (var function : functions.values()) {
            bld.append(function.toString()).append("\n");
        }

        bld.append("-------Scope end--------\n");
        return bld.toString();
    }
}
