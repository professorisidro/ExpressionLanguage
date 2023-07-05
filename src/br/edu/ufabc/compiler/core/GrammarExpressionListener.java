// Generated from GrammarExpression.g4 by ANTLR 4.13.0
package br.edu.ufabc.compiler.core;

	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarExpressionParser}.
 */
public interface GrammarExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarExpressionParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarExpressionParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(GrammarExpressionParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(GrammarExpressionParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrammarExpressionParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrammarExpressionParser.TermoContext ctx);
}