package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;


public class CIfthen extends CNode {

      private Exp cond;
      private CNode cthen;
      private CNode celse;

      public CIfthen(Exp c, CNode t, CNode e){
          super();
          cond = c;
          cthen = t;
          celse = e;
      }

      public CIfthen(int line, int col, Exp c, CNode t){
          super();
          cond = c;
          cthen = t;
          celse = null;
      }

      public CNode getCond(){ return cond; }
      public CNode getThen(){ return cthen; }
      public CNode getElse(){ return celse;}

      public void interp(Env e){
         if((Boolean)cond.eval(e)){
             cthen.interp(e);
         }else if(celse != null){celse.interp(e);}
      }

      public int toDot(DotFile d){
         int nc = cond.toDot(d);
         int nt = cthen.toDot(d);
         int ne = -1, root = -1;
         if(celse != null){
           ne = celse.toDot(d);
         }
         root = d.addNode("If");
         d.addEdge(root, nc);
         d.addEdge(root, nt);
         if(ne >= 0){ d.addEdge(root, ne);}
         return root;
      }
}
