package lang.parser;
public class Token extends beaver.Scanner{
     public TK tag;        // Uma marca para o Token
     public int l, c;      // Coordenadas de Linha e Coluna
     public Object value;  // Um lexema ou o valor denotado pelo lexema

     public Token(int l, int c, TK t){
          tag = t;
          this.l = l;
          this.c = c;
          value = null;
     }

     public Token(int l, int c, TK t, Object o){
         this(l,c,t);
         value = o;
     }

     @Override
     public String toString(){
          String s = (value == null) ? "" : value.toString();
          return  "(" + l + ", " + c + ") : "+ tag + " {" + s + "}";
     }
}
