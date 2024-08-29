package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public abstract class CNode  extends beaver.Symbol  {

   public CNode(){
        super();
   }

   public int getLine(){
        return super.getLine(getStart());
   }

   public int getColumn(){
        return super.getColumn(getStart());
   }

   abstract public int toDot(DotFile d);
   abstract public void interp(Env e);

}
