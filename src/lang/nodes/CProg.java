package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import java.util.HashMap;

public class CProg extends CNode {

    private CFuncDef[] funcs;

    public CProg(CFuncDef[] funcs) {
        super();
        this.funcs = funcs;
    }

    public CFuncDef[] getFuncs() {
        return funcs;
    }

    public Object getFunctionByID(String id) {

        
        for (CFuncDef fn : funcs) {
            if (fn.getID().equals(id)) {
                return fn;
            }
        }
        return null;
    }

    public void populateFuncEnv(Env e) {
        for (CFuncDef fn : funcs) {
            e.declareFunc(fn.getID(), fn);
        }
    }

    public void interp(Env e) {
        // Findind the entry point
        CFuncDef start = (CFuncDef) getFunctionByID("inicio");
        if (start != null) {
            HashMap<String, Object> page = start.buildLocalEnv(new DummyVal());
            e.pushVariablesEnv(page);
            populateFuncEnv(e);
            start.interp(e);
        } else {
            throw new RuntimeException("Ponto de partida \"inicio\" ausente.");
        }
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int toDot(DotFile d) {
        int c;
        int root = d.addNode("Prog");
        for (CFuncDef f : funcs) {
            c = f.toDot(d);
            d.addEdge(root, c);
        }
        return root;
    }
}
