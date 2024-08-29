package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.ReturnExcept;
import lang.nodes.CFuncDef;
import lang.nodes.environment.Env;
import java.util.HashMap;

public class Call extends Exp{

      private String name;
      private Exp[] arglist;

      public Call(String name, Exp[] args){
           super();
           this.name = name;
           if(args == null){ arglist = new Exp[0];}
           else{ arglist =  args;}
      }

      public String getName(){ return name;}
      public Exp[] getArgs(){ return arglist;}

      public Object eval(Env e){
           Object o[] = new Object[arglist.length];
           for(int i =0; i < arglist.length; i++){
                 o[i] = arglist[i].eval(e);
           }
           CFuncDef fn = (CFuncDef)e.getFunc(name);
           HashMap<String, Object> page = fn.buildLocalEnv(o);
           e.pushVariablesEnv(page);
           try{
              fn.getBody().interp(e);
           }catch(ReturnExcept ex){ //Se a função estiver retornando algo
                e.popVariablesEnv();
                return e.pop();
           }
           return 0;
      }

      public int toDot(DotFile d){
          int root = d.addNode("Call");
          int nn = d.addNode(name);
          d.addEdge(root, nn);
          for(Exp e : arglist){
             nn = e.toDot(d);
             d.addEdge(root,nn);
          }
          return root;
      }
}
