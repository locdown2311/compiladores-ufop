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
        return 0;
    }

}
