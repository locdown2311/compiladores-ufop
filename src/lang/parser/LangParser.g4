parser grammar LangParser;

@header {
package lang.parser;
import java.util.*;
import lang.nodes.expr.*;
import lang.nodes.*;
}

options {
	tokenVocab = LangLexer;
}

// Regras iniciais
prog
	returns[CProg c]:
	e = defList { $c = new CProg($e.df.toArray(new CFuncDef[$e.df.size()])); };

defList
	returns[ArrayList<CFuncDef> df]:
	d = def defList { $df = $defList.df != null ? $defList.df : new ArrayList<CFuncDef>(); $df.add($d.d); 
		}
	| def { $df = new ArrayList<CFuncDef>(); $df.add($def.d); };
// Regras para definições
def
	returns[CFuncDef d]:
	data {$d = $data.d; }
	func {$d = $func.d; };

// Definição de estrutura de dados
data
    returns[CFuncDef d]:
    DATA typeName = TYPE LBRACE decls = decl* RBRACE {

    };

// Declaração de variável em uma estrutura de dados
decl
	returns[CVarDec decla]:
	id = ID DOUBLE_COLON t = type SEMICOLON {
          $decla = new CVarDec($id.text, $t.t);
      };

// Definição de função
func
    returns[CFuncDef d]:
    id = ID LPAREN p = params? RPAREN (
        COLON retTypes += type (COMMA retTypes += type)*
    )? LBRACE cmds += cmd* RBRACE {
        // Cria a lista de parâmetros
        ArrayList<CVarDec> paramList = ($p.text != null) ? $p.paramList : new ArrayList<CVarDec>();
        
        // Cria a lista de tipos de retorno
        ArrayList<CType> returnTypes = new ArrayList<>();
        if ($retTypes != null) {
            for (CType retType : $retTypes) {
                returnTypes.add(retType);
            }
        }

        // Cria o objeto CFuncDef
        $d = new CFuncDef($id.text, paramList.toArray(new CVarDec[0]), returnTypes.toArray(new CType[0]), $cmds);
    };
// Parâmetros de função
params
    returns[ArrayList<CVarDec> paramList]:
    { $paramList = new ArrayList<CVarDec>(); }
    ID DOUBLE_COLON type { 
        $paramList.add(new CVarDec($ID.text, $type.t)); 
    }
    (
        COMMA ID DOUBLE_COLON type { 
            $paramList.add(new CVarDec($ID.text, $type.t)); 
        }
    )*;
// Tipos
type
	returns[CType t]:
	btype (LBRACK RBRACK)? {
         $t = new CType($btype.base);
     };
// Tipos básicos
btype
	returns[CBaseType base]:
	INT { $base = CBaseType.INT; }
	| CHAR { $base = CBaseType.CHAR; }
	| BOOLEAN { $base = CBaseType.BOOL; }
	| FLOAT { $base = CBaseType.FLOAT; }
	| VOID { $base = CBaseType.VOID; }
	| TYPE { $base = CBaseType.TYPE; };

// Comandos
cmd
    returns [CNode c]:
    block { $c = new CBlock($block.rcmds); }
    | ifCmd { $c = $ifCmd.c; }
    | iterateCmd { $c = $iterateCmd.c; }
    | readCmd { $c = $readCmd.c; }
    | printCmd { $c = $printCmd.c; }
    | returnCmd { $c = $returnCmd.c; }
    | assignCmd { $c = $assignCmd.c; }
    | funcCallCmd;

block
    returns [CNode[] rcmds]:
    LBRACE cmds += cmd* RBRACE {
        $rcmds = $cmds.stream().map(cmd -> cmd.c).toArray(CNode[]::new);
    }
    ;
ifCmd
	returns[CNode c]:
	IF LPAREN e = exp RPAREN thenCmd = cmd (ELSE elseCmd = cmd)? {
      $c = new CIfthen($e.expr, $thenCmd.c, $ELSE != null ? $elseCmd.c : null);
   };

iterateCmd
	returns[CNode c]:
	ITERATE LPAREN e = exp RPAREN body = cmd {
      $c = new CLoop($e.expr, $body.c);
   };
readCmd
	returns[CNode c]:
	READ l = lvalue SEMICOLON {
       $c = new CRead($l.lval);
   };
printCmd
	returns[CNode c]:
	PRINT e = exp SEMICOLON {
      $c = new Print($e.expr);
   };
returnCmd
	returns[CNode c]:
	RETURN e = exp (COMMA es += exp)* SEMICOLON {
      
   };
assignCmd
	returns[CNode c]:
	l = lvalue ATTR e = exp SEMICOLON {
        $c = new CAttr((Var)$l.lval, (Exp)$e.expr);
    };
funcCallCmd
    returns[CNode c]:
    id = ID LPAREN args = exps? RPAREN (
        LESS_THAN outArgs += lvalue (COMMA outArgs += lvalue)* GREATER_THAN
    )? SEMICOLON {
        
    };
exp
	returns[Exp expr]: e = logicalOrExp { $expr = $e.expr; };

// Expressões lógicas OR
logicalOrExp
	returns[Exp expr]:
	e1 = logicalAndExp { $expr = $e1.expr; } (
		LOGICAL_OR e2 = logicalAndExp { $expr = new Or($expr, $e2.expr); }
	)*;

logicalAndExp
	returns[Exp expr]:
	e1 = equalityExp { $expr = $e1.expr; } (
		LOGICAL_AND e2 = equalityExp { $expr = new And($expr, $e2.expr); }
	)*;

equalityExp
	returns[Exp expr]:
	e1 = relationalExp { $expr = $e1.expr; } (
		(EQUALS | NOT_EQUALS) e2 = relationalExp { 
        if ($EQUALS != null) {
            $expr = new Eq($expr, $e2.expr);
        } else {
            $expr = new Ne($expr, $e2.expr);
        }
     }
	)*;

relationalExp
	returns[Exp expr]:
	e1 = additiveExp { $expr = $e1.expr; } (
		(
			LESS_THAN
			| GREATER_THAN
			| LESS_OR_EQUAL
			| GREATER_OR_EQUAL
		) e2 = additiveExp { 
        if ($LESS_THAN != null) {
            $expr = new Lt($expr, $e2.expr);
        } else if ($GREATER_THAN != null)  {
            $expr = new Gt($expr, $e2.expr);
        } else if ($LESS_OR_EQUAL != null)  {
            $expr = new Loe($expr, $e2.expr);
        } else {
            $expr = new Goe($expr, $e2.expr);
        }
     }
	)*;

additiveExp
	returns[Exp expr]:
	e1 = multiplicativeExp { $expr = $e1.expr; } (
		(PLUS | MINUS) e2 = multiplicativeExp { 
        if ($PLUS != null) {
            $expr = new Plus($expr, $e2.expr);
        } else {
            $expr = new Minus($expr, $e2.expr);
        }
     }
	)*;

multiplicativeExp
	returns[Exp expr]:
	e1 = unaryExp { $expr = $e1.expr; } (
		(TIMES | DIVIDE | MOD) e2 = unaryExp { 
      if ($TIMES != null){
         $expr = new Times($expr, $e2.expr);
      }else if ($DIVIDE != null){
         $expr = new Div($expr, $e2.expr);
      }
      else{
         $expr = new Mod($expr, $e2.expr);
      }
     }
	)*;

unaryExp
	returns[Exp expr]: (LOGICAL_NOT | MINUS) e = unaryExp { 
        if ($LOGICAL_NOT != null) {
            $expr = new Not($e.expr);
        } else {
            $expr = new Uminus($e.expr);
        }
     }
	| primaryExp { $expr = $primaryExp.expr; };

primaryExp
	returns[Exp expr, CNode array]:
	TRUE { $expr = new BoolLit(true); }
	| FALSE { $expr = new BoolLit(false); }
	| NULL { $expr = new CNull(); }
	| il = INTLIT { $expr = new IntLit(Integer.parseInt($il.text)); }
	| fl = FLOATLIT { $expr = new FloatLit(Float.parseFloat($fl.text)); }
	| cl = CHARLIT { $expr = new CharLit($cl.text.charAt(0)); }
	| sl = STRINGLIT { $expr = new StringLit($sl.text); }
	| lv = lvalue { $expr = $lv.lval; }
	| LPAREN e = exp RPAREN { $expr = $e.expr; }
	| NEW type (LBRACK e = exp RBRACK)* { 
      $array = new ArrInst("temp",$e.expr,$type.t);
     };
// Lvalue
lvalue
	returns[Exp lval]:
	id = ID { $lval = new Var($id.text); }
	| lv = lvalue LBRACK e = exp RBRACK { 
       $lval = new CArrayAccess($lv.lval, $e.expr); 
      }
	| lv = lvalue DOT id = ID {
        $lval = new CFieldAccess($lv.lval, $id.text); 
       };

// Lista de expressões
exps
	returns[ArrayList<Exp> exprs]:
	{ $exprs = new ArrayList<Exp>(); } exp { $exprs.add($exp.expr); } (
		COMMA exp { $exprs.add($exp.expr); }
	)*;