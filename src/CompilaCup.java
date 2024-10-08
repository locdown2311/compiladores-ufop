import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import lang.parser.Parser;
import java_cup.runtime.Symbol;
import lang.parser.Sym;
import lang.nodes.environment.Env;
import lang.nodes.CProg;
import lang.parser.Lexer;

public class CompilaCup {

    public static CProg prg = null;

    public static int given(String[] v, String s) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public static void runLexer(String path) throws IOException, Exception {
        LexerCup sc = new LexerCup(new FileReader(path));
        Symbol tk = sc.next_token();
        while (tk.sym != 0) {
            System.out.println(Sym.terminalNames[tk.sym] + ": " + (tk.value == null ? "NULL" : tk.value.toString()));
            tk = sc.next_token();
        }
        return;
    }

    public static void runInterpreter(String path, Boolean debug) throws IOException, Exception {
        if (prg == null) {
            runParser(path);
        }
        Env env = new Env();
        prg.interp(env);
        return;
    }

    private static void runParser(String path) throws IOException, Exception {
        LexerCup l = new LexerCup(new FileReader(path));
        Parser p = new Parser(l);
        prg = (CProg) p.parse();
    }

    public static void main(String args[]) throws IOException, Exception {
        if (args.length < 1) {
            System.out.println("use CompilaCup <nome-de-arquivo>");
            System.exit(0);
        } else {
            if (given(args, "-lex") >= 0) {
                runLexer(args[args.length - 1]);
                return;
            }
            if (given(args, "-p") >= 0) {
                runParser(args[args.length - 1]);
                return;
            }
            if (given(args, "-lpi") >= 0) {
                runInterpreter(args[args.length - 1], false);
                return;
            }
        }
    }
}
