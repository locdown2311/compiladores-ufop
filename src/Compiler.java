import java.io.FileReader;
import java.io.IOException;

public class Compiler {
    private Token t;
    private Lexer lexer;
    private boolean eof,debug;


    
    public static void main(String argv[]) {
        if (argv.length == 0) {
        System.out.println("Usage : java Compiler <inputfile>");
        }
        else {
            for (int i = 0; i < argv.length; i++) {
                Lexer scanner = null;
                try {
                    scanner = new Lexer( new java.io.FileReader(argv[i]) );
                    while ( !scanner.isZzAtEOF() ){
                        System.out.println(scanner.nextToken());
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