package edu.washington.escience.myria.expression;

import com.google.common.base.Objects;

import edu.washington.escience.myria.Schema;
import edu.washington.escience.myria.Type;

/**
 * Boolean and in an expression tree.
 */
public class AndExpression extends BinaryExpression {
  /***/
  private static final long serialVersionUID = 1L;

  /**
   * This is not really unused, it's used automagically by Jackson deserialization.
   */
  @SuppressWarnings("unused")
  private AndExpression() {
  }

  /**
   * True if left and right are true.
   * 
   * @param left the left operand.
   * @param right the right operand.
   */
  public AndExpression(final ExpressionOperator left, final ExpressionOperator right) {
    super(left, right);
  }

  @Override
  public Type getOutputType(final Schema schema, final Schema stateSchema) {
    checkBooleanType(schema, stateSchema);
    return Type.BOOLEAN_TYPE;
  }

  @Override
  public String getJavaString(final Schema schema, final Schema stateSchema) {
    return getInfixBinaryString("&&", schema, stateSchema);
  }

  @Override
  public int hashCode() {
    return defaultHashCode();
  }

  @Override
  public boolean equals(final Object other) {
    if (other == null || !(other instanceof AndExpression)) {
      return false;
    }
    AndExpression bOther = (AndExpression) other;
    return Objects.equal(getLeft(), bOther.getLeft()) && Objects.equal(getRight(), bOther.getRight());
  }
}