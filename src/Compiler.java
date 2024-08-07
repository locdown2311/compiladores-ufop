import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Compiler {
    private Token t;
    private Lexer lexer;
    private ArrayList<Token> buffTokens;
    private Stack<Integer> s;
    private int pos, rpos, level, nback;
    private boolean eof,debug;


    
    public static void main(String argv[]) {
        if (argv.length == 0) {
        System.out.println("Usage : java Lexer <inputfile>");
        }
        else {
            for (int i = 0; i < argv.length; i++) {
                Lexer scanner = null;
                try {
                    scanner = new Lexer( new java.io.FileReader(argv[i]) );
                    while ( !scanner.isZzAtEOF() ) scanner.nextToken();
                    System.out.println("Imprimindo os tokens:");
                    ArrayList<Token> preenchidos = Lexer.getTokens();
                    for (Token token : preenchidos) {
                        System.out.println(token);
                    }
                }
                catch (java.io.FileNotFoundException e) {
                    System.out.println("File not found : \""+argv[i]+"\"");
                }
                catch (java.io.IOException e) {
                    System.out.println("IO error scanning file \""+argv[i]+"\"");
                    System.out.println(e);
                }
                catch (Exception e) {
                    System.out.println("Unexpected exception:");
                    e.printStackTrace();
                }
            }
        }
  }
}