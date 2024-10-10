package lang.nodes;

import lang.codegen.Visitor;

public class CData extends CNode{
    public void accept (Visitor v) {v.visit(this);}

}
