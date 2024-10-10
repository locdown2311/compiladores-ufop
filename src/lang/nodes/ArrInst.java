package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import lang.nodes.expr.Exp;

public class ArrInst extends CNode {

      private Exp sz;
      private String id;
      private CType t;

      public ArrInst(String id, Exp sz, CType t){
          super();
          this.sz = sz;
          this.id = id;
          this.t = t;
      }

      public Exp getExp(){ return sz;}
      public String getID(){ return id;}
      public CType getType(){ return t;}

      public void interp(Env e){
             Integer asz = (Integer)sz.eval(e);
             Object[] v = new Object[asz];
             e.store(id, v);
      }
      public void accept (Visitor v) {v.visit(this);}

      public int toDot(DotFile d){
         int nsz, nid, nt;
         int root = d.addNode("ArrInst");
         nid = d.addNode(id);
         nsz = sz.toDot(d);
         nt = t.toDot(d);
         d.addEdge(root, nid);
         d.addEdge(root, nsz);
         d.addEdge(root, nt);
         return root;
      }
}
