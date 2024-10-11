package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import lang.nodes.expr.Exp;
import lang.nodes.expr.Var;

public class CAttr extends CNode {

   private Exp lval;
   private Exp e;

   public CAttr(Exp lval, Exp e) {
       super();
       this.lval = lval;
       this.e = e;
   }

   public Exp getLval() { return lval; }
   public Exp getExp() { return e; }
   

   public void interp(Env env) {
       if (lval instanceof Var) {
           Var var = (Var) lval;
           env.store(var.getName(), e.eval(env));
       } else if (lval instanceof CFieldAccess) {
           CFieldAccess fieldAccess = (CFieldAccess) lval;
       } else if (lval instanceof CArrayAccess) {
           CArrayAccess arrayAccess = (CArrayAccess) lval;
           
       } else {
           throw new RuntimeException("Lvalue inválido para atribuição");
       }
   }

   public void accept(Visitor v) { v.visit(this); }

   public int toDot(DotFile d) {
       int nlval = lval.toDot(d);
       int ne = e.toDot(d);
       int root = d.addNode("Attr");
       d.addEdge(root, nlval);
       d.addEdge(root, ne);
       return root;
   }
}