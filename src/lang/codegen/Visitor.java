package lang.codegen;

import org.stringtemplate.v4.STGroup;
import lang.nodes.environment.Env;
import lang.nodes.expr.*;
import lang.nodes.*;

public abstract class Visitor {

    public abstract void visit(CProg c);
    public abstract void visit(CFuncDef c);
    public abstract void visit(CType t);
    public abstract void visit(CVarDec c);


    public abstract void visit(CRead c);
    public abstract void visit(CBlock c);
    public abstract void visit(Print c);
    public abstract void visit(CRet c);
    public abstract void visit(CAttr c);
    public abstract void visit(ArrInst c);
    public abstract void visit(CIfthen c);
    public abstract void visit(CLoop c);

    public abstract void visit(Plus e);
    public abstract void visit(Minus e);
    public abstract void visit(Times e);
    public abstract void visit(Div e);
    public abstract void visit(Mod e);

    public abstract void visit(Lt e);
    public abstract void visit(Gt e);
    public abstract void visit(Loe e);
    public abstract void visit(Goe e);
    public abstract void visit(Eq e);
    public abstract void visit(Ne e);

    public abstract void visit(And e);
    public abstract void visit(Or e);
    public abstract void visit(Not e);

    public abstract void visit(Var e);
    public abstract void visit(IntLit e);
    public abstract void visit(CharLit e);
    public abstract void visit(FloatLit e);
    public abstract void visit(BoolLit e);
    public abstract void visit(StringLit e);
    public abstract void visit(Uminus e);

    public abstract void visit(CFieldAccess e);
    public abstract void visit(CArrayAccess e);
    public abstract void visit(CNull e);

}
