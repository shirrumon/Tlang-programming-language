// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tlangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tlangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(tlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link tlangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(tlangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link tlangParser#reasign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReasign(tlangParser.ReasignContext ctx);
	/**
	 * Visit a parse tree produced by {@link tlangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(tlangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link tlangParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(tlangParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link tlangParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(tlangParser.SubContext ctx);
}