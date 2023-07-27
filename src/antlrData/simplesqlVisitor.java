// Generated from D:/Projects/parserSQL/src/antlrData\simplesql.g4 by ANTLR 4.12.0
package antlrData;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplesqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplesqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(simplesqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(simplesqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(simplesqlParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(simplesqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(simplesqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(simplesqlParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(simplesqlParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(simplesqlParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(simplesqlParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(simplesqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(simplesqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simplesqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplesqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(simplesqlParser.LiteralContext ctx);
}