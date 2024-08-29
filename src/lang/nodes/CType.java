package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class CType extends CNode {

      private String type;

      public CType(String tyName){
          super();
          type = tyName;
      }

      public String getTyname(){ return type;}

      public void interp(Env e){}

      public int toDot(DotFile d){
         int root = d.addNode(type);
         return root;
      }
}
