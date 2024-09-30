package lang.nodes;

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

     abstract public int toDot(DotFile d);

     abstract public void interp(Env e);

}
