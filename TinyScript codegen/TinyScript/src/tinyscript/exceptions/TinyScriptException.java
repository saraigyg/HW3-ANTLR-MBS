package tinyscript.exceptions;

public class TinyScriptException {
    public int line;
    public int column;
    public String message;

    public TinyScriptException(int line, int column, String message) {
        this.line = line;
        this.column = column;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(
                "line %d, column %d: %s", line, column, message);
    }
}
