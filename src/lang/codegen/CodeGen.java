package lang.codegen;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.ST;
import lang.nodes.environment.Env;
import lang.nodes.expr.*;
import lang.nodes.*;

public class CodeGen extends Visitor {
    private ST expr;
    private Env env;
    private STGroup groupTemplate;

    public CodeGen(Env env) {
        this.groupTemplate = new STGroupFile("Template.stg");
        this.env = env;
    }

    public void visit(CProg c) {
    }

    public void visit(CFuncDef c) {
    }
    public void visit(CData c) {
    }

    public void visit(CType t) {
    }

    public void visit(CVarDec c) {
    }

    public void visit(CRead c) {
    }

    public void visit(CBlock c) {
    }

    public void visit(Print c) {
    }

    public void visit(CRet c) {
    }

    public void visit(CAttr c) {
    }

    public void visit(Call c) {
    }
    public void visit(ArrInst c) {
    }

    public void visit(CIfthen c) {
    }

    public void visit(CLoop c) {
    }

    public void visit(Plus e) {
        ST aux = groupTemplate.getInstanceOf("add_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'add_expr'");
        }
        
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
    
        e.getRight().accept(this);
        aux.add("right_expr", expr);
    
        expr = aux;
    }

    public void visit(Minus e) {
        ST aux = groupTemplate.getInstanceOf("sub_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'sub_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Times e) {
        ST aux = groupTemplate.getInstanceOf("mul_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'mul_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Div e) {
        ST aux = groupTemplate.getInstanceOf("div_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'div_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Mod e) {
        ST aux = groupTemplate.getInstanceOf("mod_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'mod_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Lt e) {
        ST aux = groupTemplate.getInstanceOf("lt_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'lt_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Gt e) {
        ST aux = groupTemplate.getInstanceOf("gt_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'gt_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Loe e) {
        ST aux = groupTemplate.getInstanceOf("loe_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'loe_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Goe e) {
        ST aux = groupTemplate.getInstanceOf("goe_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'goe_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Eq e) {
        ST aux = groupTemplate.getInstanceOf("eq_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'eq_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Ne e) {
        ST aux = groupTemplate.getInstanceOf("neq_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'neq_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(And e) {
        ST aux = groupTemplate.getInstanceOf("and_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'and_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }
    
    public void visit(Or e) {
        ST aux = groupTemplate.getInstanceOf("or_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'or_expr'");
        }
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    public void visit(Not e) {
    }

    public void visit(Var e) {
    }

    public void visit(IntLit e) {
    }

    public void visit(CharLit e) {
    }

    public void visit(FloatLit e) {
    }

    public void visit(BoolLit e) {
    }

    public void visit(StringLit e) {
    }

    public void visit(Uminus e) {
    }

    public void visit(CFieldAccess e) {
    }

    public void visit(CArrayAccess e) {
    }

    public void visit(CNull e) {
    }
}
