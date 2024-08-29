package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;

public class CVarDec extends CNode {

      private CType t;
      private String id;

      public CVarDec(CType t, String i){
          super();
          this.t = t;
          this.id = i;
      }

      public String getID(){ return id;}
      public CType getTy(){ return t;}

      public void interp(Env e){
      }

      public int toDot(DotFile d){
         int nt = t.toDot(d);
         int root = d.addNode(" VarDec ");
         int nvar = d.addNode(id);
         d.addEdge(root, nt);
         d.addEdge(root, nvar);
         return root;
      }
}
