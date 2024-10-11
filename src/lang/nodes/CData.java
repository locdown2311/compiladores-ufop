package lang.nodes;

import java.util.*;
import lang.codegen.Visitor;
import lang.nodes.environment.Env;
import lang.nodes.expr.*;
import lang.nodes.*;
import lang.nodes.dotutils.DotFile;

public class CData extends CFuncDef {
    private String typeName;
    private List<CVarDec> decls;

    public CData(String typeName, List<CVarDec> decls) {
        super(typeName,null,null,null);
        this.typeName = typeName;
        this.decls = decls;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<CVarDec> getDecls() {
        return decls;
    }
    public void interp(Env e){

    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    public int toDot(DotFile d) {
        int root = d.addNode("Data:");
        int nv = d.addNode(typeName);
        int c = 0;
        for (CVarDec cVarDec : decls) {
            c = cVarDec.toDot(d);
            d.addEdge(root, c);
        }
        d.addEdge(root, nv);
        d.addEdge(root, c);
        return root;
    }

}
