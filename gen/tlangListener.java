// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tlangParser}.
 */
public interface tlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tlangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tlangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tlangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(tlangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(tlangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlangParser#reasign}.
	 * @param ctx the parse tree
	 */
	void enterReasign(tlangParser.ReasignContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#reasign}.
	 * @param ctx the parse tree
	 */
	void exitReasign(tlangParser.ReasignContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(tlangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(tlangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlangParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(tlangParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(tlangParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlangParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(tlangParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlangParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(tlangParser.SubContext ctx);
}