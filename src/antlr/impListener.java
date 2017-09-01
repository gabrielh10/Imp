package antlr;

// Generated from imp.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link impParser}.
 */
public interface impListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link impParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(@NotNull impParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(@NotNull impParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(@NotNull impParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(@NotNull impParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#pgm}.
	 * @param ctx the parse tree
	 */
	void enterPgm(@NotNull impParser.PgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#pgm}.
	 * @param ctx the parse tree
	 */
	void exitPgm(@NotNull impParser.PgmContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull impParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull impParser.StmtContext ctx);
}