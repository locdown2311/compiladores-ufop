package lang.nodes.expr;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
public class CharLit extends Exp{

    private char value;
    public CharLit(char value){
         super();
         this.value = value;
    }
    public Character getValue(){ return value;}

    public Object eval(Env e){
        return value;
    }


    public int toDot(DotFile d){
       return d.addNode("\\\'"+value+"\\\'");
    }
}