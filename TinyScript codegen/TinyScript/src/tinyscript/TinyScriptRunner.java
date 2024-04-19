package tinyscript;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import tinyscript.codegen.TinyScriptCodeGenerator;
import tinyscript.exceptions.TinyScriptExceptionHandler;
import tinyscript.generated.TinyScriptLexer;
import tinyscript.generated.TinyScriptParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TinyScriptRunner {
    private static final TinyScriptExceptionHandler exceptionHandler = new TinyScriptExceptionHandler();

    private static final Path inputPath = Paths.get("src", "tinyscript", "input.tys");
    private static final Path outputPath = Paths.get("src", "tinyscript", "generated", "TinyScriptOutput.java");
    private static final Path javaSTPath = Paths.get("src", "tinyscript", "codegen", "stringtemplate", "JavaGen.stg");

    public static TinyScriptParser.ProgramContext readProgram(String source) {
        var lexer = new TinyScriptLexer(CharStreams.fromString(source));
        lexer.removeErrorListeners();
        lexer.addErrorListener(exceptionHandler);

        var parser = new TinyScriptParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(exceptionHandler);

        return parser.program();
    }

    public static void main(String[] args) throws IOException {
        String source = Files.readString(inputPath);
        var tree = readProgram(source);

        if (exceptionHandler.isValid()) {
            var semanticAnalyzer = new TinyScriptSemanticAnalyzer(exceptionHandler);
            semanticAnalyzer.visit(tree);

            if (exceptionHandler.isValid()) {
                System.out.println();
                System.out.println("***** Input is valid, generating code... *****");

                var javaGenerator = new TinyScriptCodeGenerator(
                        javaSTPath.toString(), "java", "tinyscript.generated", "TinyScriptOutput");
                javaGenerator.visit(tree);
                Files.write(outputPath, javaGenerator.generatedCode.getBytes());

                System.out.println("***** Code generated *****");
            }
            else {
                printExceptions();
            }
        }
        else {
            printExceptions();
        }
    }

    private static void printExceptions() {
        System.out.println();
        System.out.println("***** Input has problems *****");

        for (var exc : exceptionHandler.getExceptions()) {
            System.out.println(exc);
        }
    }
}