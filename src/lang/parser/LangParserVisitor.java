// Generated from lang/parser/LangParser.g4 by ANTLR 4.13.2

package lang.parser;
import java.util.*;
import lang.nodes.expr.*;
import lang.nodes.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(LangParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LangParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LangParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(LangParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCmd(LangParser.IfCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#whileCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCmd(LangParser.WhileCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#readCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCmd(LangParser.ReadCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#printCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCmd(LangParser.PrintCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#returnCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCmd(LangParser.ReturnCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assignCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCmd(LangParser.AssignCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#accessReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessReturn(LangParser.AccessReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#funcCallCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallCmd(LangParser.FuncCallCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LangParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#logicalOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExp(LangParser.LogicalOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#logicalAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExp(LangParser.LogicalAndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#equalityExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExp(LangParser.EqualityExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#relationalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExp(LangParser.RelationalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#additiveExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExp(LangParser.AdditiveExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#multiplicativeExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExp(LangParser.MultiplicativeExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(LangParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(LangParser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(LangParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExps(LangParser.ExpsContext ctx);
}