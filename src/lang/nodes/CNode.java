package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public abstract class CNode  {

     public CNode() {
     }

     public int getLine() {
          return -1;
     }

     public int getColumn() {
          return -1;
     }

     abstract public void accept (Visitor v);

     abstract public int toDot(DotFile d);

     abstract public void interp(Env e);

}
