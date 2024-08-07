import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Parser {
    private Token t;
    private Lexer lex;
    private ArrayList<Token> buffTokens;
    private Stack<Integer> s;
    private int pos, rpos, level, nback;
    private boolean eof,debug;

    public Parser(String path) throws FileNotFoundException{
        lex = new Lexer(new FileReader(path));
        buffTokens = new ArrayList<Token>(500);
        s = new Stack<Integer>();
        pos = 0;
        rpos =0;
        nback = 0;
        eof = false;
        debug = false;
        nextToken();
    }

    private void nextToken(){
        Token t = new Token(-1,-1,TK.EOF,null);
        if(!eof){
            if(pos < rpos){
                pos ++;
                eof = buffTokens.get(pos-1).tag == TK.EOF;
            }else{
               try{
                  t = lex.nextToken();
                  if(t == null){
                      eof = true;
                      t = new Token(-1,-1,TK.EOF,null);
                      buffToken.add(t);
                  }else{ buffToken.add(t);}
                  rpos++;
                  pos++;
               }catch(IOException e){
                  e.printStackTrace();
                  System.exit(1);
               }
            }
        }
    }
    public void scanAll(){
        try{
          t = lex.nextToken();
          while(t != null){
             System.out.println(t.toString());
             t = lex.nextToken();
          }
        }catch(IOException e){
            e.printStackTrace();
        }
   }


    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Uso: java Compiler <arquivo_de_entrada>");
            return;
        }

        try (FileReader r = new FileReader(args[1])) {
            Lexer l = new Lexer(r);
            Token tok;
            while ((tok = l.nextToken()) != null) {
                System.out.println(tok);
            }
        } catch (IOException e) {
            System.err.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
}