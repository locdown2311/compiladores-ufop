import java.io.FileReader;

import lang.parser.Parser;
import lang.parser.Lexer;

public class CompilaCup {
    public static void main(String[] args) {
        try {
            String sourcecode = args.length > 0 ? args[0] : "input.txt";
            Parser p = new Parser(new Lexer(new FileReader(sourcecode)));
            Object result = p.parse().value;

            System.out.println("Compilacao concluida com sucesso...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
