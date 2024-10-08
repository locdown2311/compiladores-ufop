package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class CType extends CNode {

      private CBaseType type;

      public CType(CBaseType tyName){
          super();
          this.type = tyName;
      }

      public String getTyname(){ return type.name();}

      public void interp(Env e){}

      public int toDot(DotFile d){
         int root = d.addNode(type.name());
         return root;
      }
}
