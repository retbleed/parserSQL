// Generated from D:/Projects/parserSQL/src\simplesql.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplesqlParser}.
 */
public interface simplesqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(simplesqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(simplesqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(simplesqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(simplesqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(simplesqlParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(simplesqlParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(simplesqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(simplesqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(simplesqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(simplesqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(simplesqlParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(simplesqlParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(simplesqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(simplesqlParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(simplesqlParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(simplesqlParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(simplesqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(simplesqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(simplesqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(simplesqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(simplesqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(simplesqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simplesqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simplesqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplesqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(simplesqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplesqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(simplesqlParser.LiteralContext ctx);
}