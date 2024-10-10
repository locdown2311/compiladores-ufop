package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import lang.nodes.expr.Exp;
import lang.nodes.expr.Var;

public class CAttr extends CNode {

      private Var v;
      private Exp e;

      public CAttr(Var v, Exp e){
          super();
          this.v = v;
          this.e = e;
      }

      public Exp getExp(){ return e;}
      public Var getVar(){ return v;}

      public void interp(Env env){
         env.store(v.getName(),e.eval(env));
      }
      public void accept (Visitor v) {v.visit(this);}


      public int toDot(DotFile d){
         int nv = v.toDot(d);
         int ne = e.toDot(d);
         int root = d.addNode("Attr");
         d.addEdge(root, nv);
         d.addEdge(root, ne);
         return root;
      }
}
