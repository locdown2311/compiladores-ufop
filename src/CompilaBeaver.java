import java.io.FileReader;
import java.io.IOException;

import beaver.Symbol;
import beaver.Scanner;

import lang.parser.LangParserB;
import lang.parser.Lexer;
import lang.parser.Terminals;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import lang.nodes.CProg;

public class CompilaBeaver {
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
        Lexer sc = new Lexer(new FileReader(path));
        Symbol tk = sc.nextToken();
        while (tk.getId() != 0) {
            System.out.println(Terminals.NAMES[tk.getId()] + " : " + (tk.value == null ? "NULL" : tk.value.toString()));
            tk = sc.nextToken();
        }
        return;
    }

    public static void runDot(String path) throws IOException, Exception {
        if (prg == null) {
            runParser(path);
        }
        DotFile d = new DotFile();
        prg.toDot(d);
        String dotfname = path.replaceFirst("\\.[^\\.]+$", ".dot");
        System.out.println("Escrevendo saída para: " + dotfname);
        d.writeToFile(dotfname);
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
    private static void runParser(String path) throws IOException, Exception{
           Lexer l = new Lexer(new FileReader(path));
           LangParserB p = new LangParserB();
           prg = (CProg) p.parse(l);
     }

     public static void main(String args[]) throws IOException, Exception {
        if (args.length < 1) {
            System.out.println("use CompilaBeaver <nome-de-arquivo>");
            System.exit(0);
        } else {
            if (given(args, "-lex") >= 0) {
                runLexer(args[args.length - 1]);
                return;
            }
            if (given(args, "-p") >= 0) {
                runParser(args[args.length - 1]);
                runDot(args[args.length - 1]);
                return;
            }
            if (given(args, "-lpi") >= 0) {
                runInterpreter(args[args.length - 1], false);
                return;
            }
        }
    }
}
