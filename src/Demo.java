import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import lang.codegen.CodeGen;
import lang.codegen.Visitor;
import lang.codegen.TVisitor;
import lang.nodes.CProg;
import lang.parser.LangLexer;
import lang.parser.LangParser;
import lang.nodes.environment.Env;
import lang.nodes.dotutils.*;

import java.io.IOException;

public class Demo {

    public static CProg prg = null;

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

        // Preenche o stream de tokens
        tokens.fill();
        LangParser parser = new LangParser(tokens);

        parser.setBuildParseTree(false);

        prg = (CProg) parser.prog().c;
    }

    public static void runDot(String inputFile) throws IOException {
        if (prg == null) {
            runParser(inputFile);
        }
        DotFile d = new DotFile();
        prg.toDot(d);
        String dotfname = inputFile.replaceFirst("\\.[^\\.]+$", ".dot");
        System.out.println("Escrevendo saída para: " + dotfname);
        d.writeToFile(dotfname);
        return;
    }

    public static void runInterpreter(String inputFile) throws IOException {
        LangLexer lexer = new LangLexer(CharStreams.fromFileName(inputFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        LangParser parser = new LangParser(tokens);
        parser.setBuildParseTree(false);
        Env env = new Env();
        prg = (CProg) parser.prog().c;
        prg.interp(env);

    }

    public static void runGen(String path) throws IOException {
        if (prg == null) {
            runParser(path);
        }
        Env env = new Env();
        TVisitor tv = new TVisitor();
        prg.accept(tv);
        CodeGen v = new CodeGen(env);
        prg.accept(v);
        //v.printProgram();

        return;
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Use: Demo <arquivo>");
            System.exit(1);
        }

        String option = args[args.length - 2];
        switch (option) {
            case "-lex":
                runLexer(args[args.length - 1]);
                break;
            case "-p":
                runParser(args[args.length - 1]);
                break;
            case "-i":
                runInterpreter(args[args.length - 1]);
                break;
            case "-di":
                runDot(args[args.length - 1]);
                runInterpreter(args[args.length - 1]);
                break;
            case "-g":
                runGen(args[args.length - 1]);
                break;
            default:
                System.err.println("Opção invalida");
                System.exit(1);
        }
    }
}