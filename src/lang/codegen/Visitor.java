package lang.codegen;

import org.stringtemplate.v4.STGroup;
import lang.nodes.environment.Env;
import lang.nodes.expr.*;
import lang.nodes.*;

public class Visitor {
    private STGroup groupTemplate;
    private String fileName;
    private Env env;

    public Visitor(String fileName, Env env) {
        this.groupTemplate = new STGroupFile("./Template.stg");
        this.fileName = fileName;
        this.env = env;
    }

    public void visit(Plus e) {
        ST aux = groupTemplate.getInstanceOf("add_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Minus e) {
        ST aux = groupTemplate.getInstanceOf("sub_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Times e) {
        ST aux = groupTemplate.getInstanceOf("mul_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Div e) {
        ST aux = groupTemplate.getInstanceOf("div_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Mod e) {
        ST aux = groupTemplate.getInstanceOf("mod_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Lt e) {
        ST aux = groupTemplate.getInstanceOf("lt_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Gt e) {
        ST aux = groupTemplate.getInstanceOf("gt_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Loe e) {
        ST aux = groupTemplate.getInstanceOf("loe_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Goe e) {
        ST aux = groupTemplate.getInstanceOf("goe_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Eq e) {
        ST aux = groupTemplate.getInstanceOf("eq_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Ne e) {
        ST aux = groupTemplate.getInstanceOf("neq_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(And e) {
        ST aux = groupTemplate.getInstanceOf("and_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }
    public void visit(Or e) {
        ST aux = groupTemplate.getInstanceOf("or_expr");
        e.getLeft().accept(this);
        aux.add(" left_expr ", expr);
        e.getRight().accept(this);
        aux.add(" right_expr ", expr);
        expr = aux;
    }

}
