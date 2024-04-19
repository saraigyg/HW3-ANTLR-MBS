package tinyscript;

// This class is an example of Java code from the input.tys file; whitespace formatting may vary
public class TinyScriptOutputExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void print(String s) {
    }

    public static void main(String[] args) {
        int a = 1 + 2 + 3;
        String s = "apple";
        boolean b = true;
        var i = a * 2;

        while (i < 15) {
            i = i + 1;
            print("i increased");
        }

        if (b) {
            add(1, 2);
        }
        else {
            print("not true");
        }

    }
}