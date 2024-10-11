package lang.codegen;

import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.STGroup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.ST;
import lang.nodes.environment.Env;
import lang.nodes.expr.*;
import lang.nodes.*;

public class CodeGen extends Visitor {
    private ST expr;
    private Env env;
    private STGroup groupTemplate;
    private CProg prg;

    public CodeGen(CProg prg, Env env, String groupTemplatePath) {
        this.groupTemplate = new STGroupFile(groupTemplatePath);
        this.env = env;
        this.prg = prg;
    }

    public void generateCode(String outputFilePath) throws IOException {
        prg.accept(this);

        if (expr == null) {
            throw new RuntimeException("Failed to generate code, expr is null!");
        }

        Files.write(Paths.get(outputFilePath), expr.render().getBytes());
    }

    public void visit(CProg c) {
        List<String> funcStrings = new ArrayList<>();

        // Visita todas as funções e as adiciona ao template
        for (CFuncDef func : c.getFuncs()) {
            func.accept(this);
            funcStrings.add(expr.render());
        }

        ST programTemplate = groupTemplate.getInstanceOf("program");
        if (programTemplate == null) {
            throw new RuntimeException("Failed to load template: 'program'");
        }

        programTemplate.add("name", "Programa"); 
        programTemplate.add("funcs", funcStrings); 

        expr = programTemplate;
    }

    public void visit(CFuncDef c) {
        ST funcTemplate = groupTemplate.getInstanceOf("func");
        if (funcTemplate == null) {
            throw new RuntimeException("Failed to load template: 'func'");
        }

        // Adiciona o nome da função
        funcTemplate.add("name", c.getID());

        // Adiciona o tipo de retorno
        String returnType = "";
        for (CType t : c.getType()) {
            returnType += t.getTyname()+",";
        }
        funcTemplate.add("type", returnType);

        // Adiciona os parâmetros da função
        List<String> params = new ArrayList<>();
        for (CVarDec arg : c.getArgList()) {
            arg.accept(this);
            arg.getTy().getTyname();
            params.add(expr.render());
        }
        funcTemplate.add("params", params);

        // Adiciona o corpo da função
        c.getBody().accept(this);
        funcTemplate.add("stmt", expr.render());

        expr = funcTemplate;
    }

    public void visit(CData c) {
        ST dataTemplate = groupTemplate.getInstanceOf("data_struct");
        if (dataTemplate == null) {
            throw new RuntimeException("Failed to load template: 'data_struct'");
        }

        dataTemplate.add("name", c.getTypeName());

        for (CVarDec field : c.getDecls()) {
            ST fieldTemplate = groupTemplate.getInstanceOf("field");
            if (fieldTemplate == null) {
                throw new RuntimeException("Failed to load template: 'field'");
            }
            fieldTemplate.add("name", field.getID());
            fieldTemplate.add("type", field.getTy());
            dataTemplate.add("fields", fieldTemplate.render());
        }

        expr = dataTemplate;
    }

    public void visit(CType t) {
        t.accept(this);
    }

    public void visit(CVarDec c) {
       /*  ST varDec = groupTemplate.getInstanceOf("var_dec");
        if(varDec == null){
            throw new RuntimeException("Failed to load template: 'var_dec'");
        }
        c.accept(this);
        varDec.add("variavel",expr.render());
        expr = varDec; */

    }

    public void visit(CRead c) {
        ST readTemplate = groupTemplate.getInstanceOf("read_cmd");
        if (readTemplate == null) {
            throw new RuntimeException("Failed to load template: 'read_cmd'");
        }

        c.accept(this);
        readTemplate.add("lvalue", expr.render());

        expr = readTemplate;
    }

    public void visit(CBlock c) {

    }

    public void visit(Print c) {
        ST printTemplate = groupTemplate.getInstanceOf("print_expr");
        if (printTemplate == null) {
            throw new RuntimeException("Failed to load template: 'print_expr'");
        }

        c.getExp().accept(this);
        printTemplate.add("expr", expr.render());

        expr = printTemplate;
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
        ST ifTemplate = groupTemplate.getInstanceOf("if_expr");
        if (ifTemplate == null) {
            throw new RuntimeException("Failed to load template: 'if_expr'");
        }

        c.getCond().accept(this);
        ifTemplate.add("cond_expr", expr);

        c.getThen().accept(this);
        ifTemplate.add("then_expr", expr);

        if (c.getElse() != null) {
            c.getElse().accept(this);
            ifTemplate.add("else_expr", expr.render());
        } else {
            ifTemplate.add("else_expr", "");
        }

        expr = ifTemplate;
    }

    public void visit(CLoop c) {
        ST loopTemplate = groupTemplate.getInstanceOf("iterate");
        if (loopTemplate == null) {
            throw new RuntimeException("Failed to load template: 'loop_expr'");
        }
        c.getCond().accept(this);
        loopTemplate.add("expr", expr);

        c.getBody().accept(this);
        loopTemplate.add("stmt", expr.render());

        expr = loopTemplate;
    }

    public void visit(Plus e) {
        ST aux = groupTemplate.getInstanceOf("add_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'add_expr'");
        }

        e.getLeft().accept(this);
        aux.add("left_expr", expr);

        e.getRight().accept(this);
        aux.add("right_expr", expr.render());

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
        aux.add("right_expr", expr.render());

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
        aux.add("right_expr", expr.render());

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
        ST aux = groupTemplate.getInstanceOf("var_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'var_expr'");
        }
        aux.add("value", e.getName());
        expr = aux;
    }

    public void visit(IntLit e) {
        ST aux = groupTemplate.getInstanceOf("int_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'int_expr'");
        }
        aux.add("value", e.getValue());
        expr = aux;
    }

    public void visit(CharLit e) {
        ST aux = groupTemplate.getInstanceOf("char_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'char_expr'");
        }
        aux.add("value", e.getValue());
        expr = aux;
    }

    public void visit(FloatLit e) {
        ST aux = groupTemplate.getInstanceOf("float_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'float_expr'");
        }
        aux.add("value", e.getValue());
        expr = aux;
    }

    public void visit(BoolLit e) {
        ST aux = groupTemplate.getInstanceOf("bool_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'bool_expr'");
        }
        aux.add("value", e.getValue());
        expr = aux;
    }

    public void visit(StringLit e) {
        ST aux = groupTemplate.getInstanceOf("string_expr");
        if (aux == null) {
            throw new RuntimeException("Failed to load template: 'string_expr'");
        }
        aux.add("value", e.getValue());
        expr = aux;

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
