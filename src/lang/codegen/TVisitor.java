package lang.codegen;

import java.util.ArrayList;
import java.util.Stack;

import lang.nodes.expr.*;
import lang.nodes.*;
import lang.typeChecker.CtxEntry;
import lang.typeChecker.MType;
import lang.typeChecker.TypeContext;


public class TVisitor extends Visitor{
    private Stack<MType> stk;
       private TypeContext<String,CtxEntry<MType,TypeContext<String,MType>>> tyctx;
       private TypeContext<String,MType> localCtx;
       private ArrayList<String> err;
       private boolean returnReach;

    public TVisitor(){

    }
    public void visit(CProg c){}
    public void visit(CFuncDef c){}
    public void visit(CType t){}
    public void visit(CVarDec c){}


    public void visit(CRead c){}
    public void visit(CBlock c){}
    public void visit(Print c){}
    public void visit(CRet c){}
    public void visit(CAttr c){}
    public void visit(ArrInst c){}
    public void visit(CIfthen c){}
    public void visit(CLoop c){}

    public void visit(Plus e){}
    public void visit(Minus e){}
    public void visit(Times e){}
    public void visit(Div e){}
    public void visit(Mod e){}

    public void visit(Lt e){}
    public void visit(Gt e){}
    public void visit(Loe e){}
    public void visit(Goe e){}
    public void visit(Eq e){}
    public void visit(Ne e){}

    public void visit(And e){}
    public void visit(Or e){}
    public void visit(Not e){}

    public void visit(Var e){}
    public void visit(IntLit e){}
    public void visit(CharLit e){}
    public void visit(FloatLit e){}
    public void visit(BoolLit e){}
    public void visit(StringLit e){}
    public void visit(Uminus e){}

    public void visit(CFieldAccess e){}
    public void visit(CArrayAccess e){}
    public void visit(CNull e){}
}
