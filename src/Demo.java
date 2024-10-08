import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import lang.parser.LangLexer;
import lang.parser.LangParser;

import java.io.IOException;

public class Demo {

    public static void runLexer(String inputFile) throws IOException {
        LangLexer lexer = new LangLexer(CharStreams.fromFileName(inputFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        for (Token token : tokens.getTokens()) {
            String symbolicName = LangLexer.VOCABULARY.getSymbolicName(token.getType());
            String tokenName = symbolicName != null ? symbolicName : token.getText();
            System.out.printf("(%d,%d), %s -> %s\n",
                    token.getLine(), token.getCharPositionInLine(), tokenName, token.getText());
        }
    }

    public static void runParser(String inputFile) throws IOException {
        LangLexer lexer = new LangLexer(CharStreams.fromFileName(inputFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        LangParser parser = new LangParser(tokens);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }

    public static void runInterpreter(String inputFile) {
        // Implement your interpreter logic here
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Use: Demo <arquivo>");
            System.exit(1);
        }

        String option = args[args.length - 1];
        switch (option) {
            case "-lex":
                runLexer(args[args.length - 2]);
                break;
            case "-p":
                runParser(args[args.length - 2]);
                break;
            case "-lpi":
                runInterpreter(args[args.length - 2]);
                break;
            default:
                System.err.println("Opção invalida");
                System.exit(1);
        }
    }
}