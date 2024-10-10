package lang.typeChecker;


public class CtxEntry<A, B> {

       private A left;
       private B right;

       public CtxEntry(A a, B b){
           left = a;
           right = b;
       }

      public A getLeft(){return left;}
      public B getRight(){return right;}

      public String ident(int n, String s){
         String ns = "";
         String sep = "";
         for(int i =0; i< n; i++){sep += " ";}
         for(String si : s.split("\n")){
              ns += sep + si + "\n";
         }
         return ns;
      }
      public String toString(){
           return toStringIntdent(0);
      }

      public String toStringIntdent(int n){
           String spair =  " < " + left.toString() + ";\n ";
           return spair + ident(spair.length()+n, right.toString()) + ident(spair.length()+n," >");
      }
}
