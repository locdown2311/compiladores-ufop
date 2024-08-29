
import java.io.*;
import beaver.Symbol;
import beaver.Scanner;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import lang.parser.LangParser;
import lang.parser.Lexer;
import lang.parser.Terminals;
import lang.nodes.CNode;
import lang.nodes.CProg;
import lang.nodes.CFuncDef;

public class Compiler{


     public static int given(String[] v, String s){
         for(int i =0; i< v.length; i++){
             if(v[i].equals(s)){
                 return i;
             }
         }
         return -1;
     }

     public static void runLexer(String path) throws IOException, Exception {
           Lexer l = new Lexer(new FileReader(path));
           Symbol tk = l.nextToken();
           while(tk.getId() != 0){
                System.out.println(Terminals.NAMES[tk.getId()] + " : " + (tk.value == null ? "NULL" : tk.value.toString()));
                tk = l.nextToken();
           }
           return;
     }

     public static void runDot(String path) throws IOException, Exception {
           Scanner l = new Lexer(new FileReader(path));
           LangParser p = new LangParser();
           CProg prg = (CProg)p.parse(l);
           DotFile d = new DotFile();
           prg.toDot(d);
           String dotfname = path.replaceFirst("\\.[^\\.]+$",".dot");
           System.out.println("Escrevendo saída para: " + dotfname);
           d.writeToFile(dotfname);
           return;
     }

     public static void runInterpreter(String path, Boolean debug) throws IOException, Exception{
           Scanner l = new Lexer(new FileReader(path));
           LangParser p = new LangParser();
           CProg prg = (CProg)p.parse(l);
           Env env = new Env();
           prg.interp(env);
           return;
     }

     public static void main(String args[])  throws IOException, Exception {
          if(args.length < 1){
             System.out.println("use Compiler <nome-de-arquivo>");
             System.exit(0);
          }else{
              if(given(args, "-lex") >= 0 ){
                  runLexer(args[args.length -1]);
                  return;
              }
              if(given(args, "-dot") >= 0 ){
                  runDot(args[args.length -1]);
                  return;
              }
              if(given(args, "-i") >= 0){
                 runInterpreter(args[args.length -1],false);
                 return;
              }
              if(given(args, "-id") >= 0){
                 runInterpreter(args[args.length -1],true);
                 return;
              }
          }
     }
}
