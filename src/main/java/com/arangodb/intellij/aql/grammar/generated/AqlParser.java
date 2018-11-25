// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.arangodb.intellij.aql.grammar.custom.psi.AqlParserUtil.*;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AqlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ANY_NUMBER) {
      r = AnyNumber(b, 0);
    } else if (t == ARRAY_TYPE) {
      r = ArrayType(b, 0);
    } else if (t == BLOCK_COMMENT) {
      r = BlockComment(b, 0);
    } else if (t == BOOLEAN_TYPE) {
      r = BooleanType(b, 0);
    } else if (t == COMMENT) {
      r = Comment(b, 0);
    } else if (t == COMPLEX_JSON_PROPERTY) {
      r = ComplexJsonProperty(b, 0);
    } else if (t == EXPRESSION_TYPE) {
      r = ExpressionType(b, 0);
    } else if (t == FUN_ABS) {
      r = FunAbs(b, 0);
    } else if (t == FUN_ACOS) {
      r = FunAcos(b, 0);
    } else if (t == FUN_ASIN) {
      r = FunAsin(b, 0);
    } else if (t == FUN_ATAN) {
      r = FunAtan(b, 0);
    } else if (t == FUN_ATAN_2) {
      r = FunAtan2(b, 0);
    } else if (t == FUN_AVERAGE) {
      r = FunAverage(b, 0);
    } else if (t == FUN_AVG) {
      r = FunAvg(b, 0);
    } else if (t == FUN_CEIL) {
      r = FunCeil(b, 0);
    } else if (t == FUN_CONCAT_SEPARATOR) {
      r = FunConcatSeparator(b, 0);
    } else if (t == FUN_COS) {
      r = FunCos(b, 0);
    } else if (t == FUN_DEGREES) {
      r = FunDegrees(b, 0);
    } else if (t == FUN_EXP) {
      r = FunExp(b, 0);
    } else if (t == FUN_EXP_2) {
      r = FunExp2(b, 0);
    } else if (t == FUN_FLOOR) {
      r = FunFloor(b, 0);
    } else if (t == FUN_LOG) {
      r = FunLog(b, 0);
    } else if (t == FUN_LOG_10) {
      r = FunLog10(b, 0);
    } else if (t == FUN_LOG_2) {
      r = FunLog2(b, 0);
    } else if (t == FUN_MAX) {
      r = FunMax(b, 0);
    } else if (t == FUN_MEDIAN) {
      r = FunMedian(b, 0);
    } else if (t == FUN_MIN) {
      r = FunMin(b, 0);
    } else if (t == FUN_PERCENTILE) {
      r = FunPercentile(b, 0);
    } else if (t == FUN_PI) {
      r = FunPi(b, 0);
    } else if (t == FUN_POW) {
      r = FunPow(b, 0);
    } else if (t == FUN_RADIANS) {
      r = FunRadians(b, 0);
    } else if (t == FUN_RAND) {
      r = FunRand(b, 0);
    } else if (t == FUN_RANGE) {
      r = FunRange(b, 0);
    } else if (t == FUN_ROUND) {
      r = FunRound(b, 0);
    } else if (t == FUN_SQRT) {
      r = FunSQRT(b, 0);
    } else if (t == FUN_SIN) {
      r = FunSin(b, 0);
    } else if (t == FUN_STDDEV) {
      r = FunStddev(b, 0);
    } else if (t == FUN_STDDEV_POPULATION) {
      r = FunStddevPopulation(b, 0);
    } else if (t == FUN_SUM) {
      r = FunSum(b, 0);
    } else if (t == FUN_TAN) {
      r = FunTan(b, 0);
    } else if (t == FUN_TAN_2) {
      r = FunTan2(b, 0);
    } else if (t == FUN_VARIANCE) {
      r = FunVariance(b, 0);
    } else if (t == FUN_VARIANCE_POPULATION) {
      r = FunVariancePopulation(b, 0);
    } else if (t == FUN_VARIANCE_SAMPLE) {
      r = FunVarianceSample(b, 0);
    } else if (t == FUNCTION_EXPRESSION) {
      r = FunctionExpression(b, 0);
    } else if (t == INTEGER_TYPE) {
      r = IntegerType(b, 0);
    } else if (t == JSON_TYPE) {
      r = JsonType(b, 0);
    } else if (t == KEYWORD_FUNCTIONS) {
      r = KeywordFunctions(b, 0);
    } else if (t == KEYWORD_STATEMENTS) {
      r = KeywordStatements(b, 0);
    } else if (t == LINE_COMMENT) {
      r = LineComment(b, 0);
    } else if (t == NAMED_KEYWORD_FUNCTIONS) {
      r = NamedKeywordFunctions(b, 0);
    } else if (t == NAMED_KEYWORD_STATEMENTS) {
      r = NamedKeywordStatements(b, 0);
    } else if (t == NUMBER_TYPE) {
      r = NumberType(b, 0);
    } else if (t == OBJECT_EXPRESSION) {
      r = ObjectExpression(b, 0);
    } else if (t == OPERATOR_STATEMENTS) {
      r = OperatorStatements(b, 0);
    } else if (t == PARAMETER_VARIABLE) {
      r = ParameterVariable(b, 0);
    } else if (t == PROPERTY_LOOKUP) {
      r = PropertyLookup(b, 0);
    } else if (t == PROPERTY_NAME) {
      r = PropertyName(b, 0);
    } else if (t == QUERY_ITEM) {
      r = QueryItem(b, 0);
    } else if (t == RESERVERD_WORDS) {
      r = ReserverdWords(b, 0);
    } else if (t == SEQUENCE) {
      r = Sequence(b, 0);
    } else if (t == SIGNED_INTEGER) {
      r = SignedInteger(b, 0);
    } else if (t == STATEMENT) {
      r = Statement(b, 0);
    } else if (t == STRING_TYPE) {
      r = StringType(b, 0);
    } else if (t == SYSTEM_PROPERTY) {
      r = SystemProperty(b, 0);
    } else if (t == VARIABLE_PLACE_HOLDER) {
      r = VariablePlaceHolder(b, 0);
    } else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return aql(b, l + 1);
  }

  /* ********************************************************** */
  // NUMBER | (T_PLUS | T_MINUS) NUMBER
  public static boolean AnyNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyNumber")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_NUMBER, "<any number>");
    r = consumeToken(b, NUMBER);
    if (!r) {
      r = AnyNumber_1(b, l + 1);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (T_PLUS | T_MINUS) NUMBER
  private static boolean AnyNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyNumber_1")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = AnyNumber_1_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PLUS | T_MINUS
  private static boolean AnyNumber_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyNumber_1_0")) {
      return false;
    }
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) {
      r = consumeToken(b, T_MINUS);
    }
    return r;
  }

  /* ********************************************************** */
  // T_PLUS
  //                     | T_MINUS
  //                     | T_TIMES
  //                     | T_DIV
  //                     | T_MOD
  static boolean ArithmeticOperators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArithmeticOperators")) {
      return false;
    }
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) {
      r = consumeToken(b, T_MINUS);
    }
    if (!r) {
      r = consumeToken(b, T_TIMES);
    }
    if (!r) {
      r = consumeToken(b, T_DIV);
    }
    if (!r) {
      r = consumeToken(b, T_MOD);
    }
    return r;
  }

  /* ********************************************************** */
  // T_ARRAY_OPEN ExpressionArray* T_ARRAY_CLOSE
  public static boolean ArrayType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType")) {
      return false;
    }
    if (!nextTokenIs(b, T_ARRAY_OPEN)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && ArrayType_1(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  // ExpressionArray*
  private static boolean ArrayType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType_1")) {
      return false;
    }
    while (true) {
      int c = current_position_(b);
      if (!ExpressionArray(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "ArrayType_1", c)) {
        break;
      }
    }
    return true;
  }

  /* ********************************************************** */
  // B_COMMENT
  public static boolean BlockComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockComment")) return false;
    if (!nextTokenIs(b, B_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, B_COMMENT);
    exit_section_(b, m, BLOCK_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_TRUE | T_FALSE
  public static boolean BooleanType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanType")) {
      return false;
    }
    if (!nextTokenIs(b, "<boolean type>", T_FALSE, T_TRUE)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_TYPE, "<boolean type>");
    r = consumeToken(b, T_TRUE);
    if (!r) {
      r = consumeToken(b, T_FALSE);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LineComment | BlockComment
  public static boolean Comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment")) return false;
    if (!nextTokenIs(b, "<comment>", B_COMMENT, L_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = LineComment(b, l + 1);
    if (!r) r = BlockComment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExpressionArray | ArrayType
  public static boolean ComplexJsonProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComplexJsonProperty")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPLEX_JSON_PROPERTY, "<complex json property>");
    r = ExpressionArray(b, l + 1);
    if (!r) {
      r = ArrayType(b, l + 1);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExpressionType (',' ExpressionType)*
  static boolean ExpressionArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionArray")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionType(b, l + 1);
    r = r && ExpressionArray_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ExpressionType)*
  private static boolean ExpressionArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionArray_1")) {
      return false;
    }
    while (true) {
      int c = current_position_(b);
      if (!ExpressionArray_1_0(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "ExpressionArray_1", c)) {
        break;
      }
    }
    return true;
  }

  // ',' ExpressionType
  private static boolean ExpressionArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionArray_1_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ExpressionType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression
  //                 | NumberType
  //                 | ArrayType
  //                 | StringType
  //                 | BooleanType
  //                 | VariablePlaceHolder
  //                 | FunctionExpression
  //                 | ParameterVariable
  //                 | SystemProperty
  //                 | ArithmeticOperators
  //                 | ReserverdWords
  //                 | PropertyName
  public static boolean ExpressionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionType")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_TYPE, "<expression type>");
    r = ObjectExpression(b, l + 1);
    if (!r) {
      r = NumberType(b, l + 1);
    }
    if (!r) {
      r = ArrayType(b, l + 1);
    }
    if (!r) {
      r = StringType(b, l + 1);
    }
    if (!r) {
      r = BooleanType(b, l + 1);
    }
    if (!r) {
      r = VariablePlaceHolder(b, l + 1);
    }
    if (!r) {
      r = FunctionExpression(b, l + 1);
    }
    if (!r) {
      r = ParameterVariable(b, l + 1);
    }
    if (!r) {
      r = SystemProperty(b, l + 1);
    }
    if (!r) {
      r = ArithmeticOperators(b, l + 1);
    }
    if (!r) {
      r = ReserverdWords(b, l + 1);
    }
    if (!r) {
      r = PropertyName(b, l + 1);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // F_ABS "(" number_argument ")"
  public static boolean FunAbs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAbs")) {
      return false;
    }
    if (!nextTokenIs(b, F_ABS)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ABS, null);
    r = consumeTokens(b, 1, F_ABS, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ACOS "(" number_argument ")"
  public static boolean FunAcos(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAcos")) {
      return false;
    }
    if (!nextTokenIs(b, F_ACOS)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ACOS, null);
    r = consumeTokens(b, 1, F_ACOS, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ASIN "(" number_argument ")"
  public static boolean FunAsin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAsin")) {
      return false;
    }
    if (!nextTokenIs(b, F_ASIN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ASIN, null);
    r = consumeTokens(b, 1, F_ASIN, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ATAN "(" number_argument ")"
  public static boolean FunAtan(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAtan")) {
      return false;
    }
    if (!nextTokenIs(b, F_ATAN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ATAN, null);
    r = consumeTokens(b, 1, F_ATAN, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ATAN2 "(" number_argument ")"
  public static boolean FunAtan2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAtan2")) {
      return false;
    }
    if (!nextTokenIs(b, F_ATAN2)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ATAN_2, null);
    r = consumeTokens(b, 1, F_ATAN2, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_AVERAGE  "(" number_argument_array ")"
  public static boolean FunAverage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAverage")) {
      return false;
    }
    if (!nextTokenIs(b, F_AVERAGE)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_AVERAGE, null);
    r = consumeTokens(b, 1, F_AVERAGE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_AVG "(" number_argument_array ")"
  public static boolean FunAvg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAvg")) {
      return false;
    }
    if (!nextTokenIs(b, F_AVG)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_AVG, null);
    r = consumeTokens(b, 1, F_AVG, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_CEIL  "(" number_argument ")"
  public static boolean FunCeil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCeil")) {
      return false;
    }
    if (!nextTokenIs(b, F_CEIL)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CEIL, null);
    r = consumeTokens(b, 1, F_CEIL, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_CONCAT_SEPARATOR "(" string_argument "," ExpressionArray+ ")"
  public static boolean FunConcatSeparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunConcatSeparator")) {
      return false;
    }
    if (!nextTokenIs(b, F_CONCAT_SEPARATOR)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CONCAT_SEPARATOR, null);
    r = consumeTokens(b, 1, F_CONCAT_SEPARATOR, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunConcatSeparator_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionArray+
  private static boolean FunConcatSeparator_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunConcatSeparator_4")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionArray(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ExpressionArray(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "FunConcatSeparator_4", c)) {
        break;
      }
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_COS "(" number_argument ")"
  public static boolean FunCos(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCos")) {
      return false;
    }
    if (!nextTokenIs(b, F_COS)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COS, null);
    r = consumeTokens(b, 1, F_COS, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DEGREES  "(" number_argument ")"
  public static boolean FunDegrees(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDegrees")) {
      return false;
    }
    if (!nextTokenIs(b, F_DEGREES)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DEGREES, null);
    r = consumeTokens(b, 1, F_DEGREES, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_EXP  "(" number_argument ")"
  public static boolean FunExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunExp")) {
      return false;
    }
    if (!nextTokenIs(b, F_EXP)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_EXP, null);
    r = consumeTokens(b, 1, F_EXP, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_EXP2  "(" number_argument ")"
  public static boolean FunExp2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunExp2")) {
      return false;
    }
    if (!nextTokenIs(b, F_EXP2)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_EXP_2, null);
    r = consumeTokens(b, 1, F_EXP2, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_FLOOR  "(" number_argument ")"
  public static boolean FunFloor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFloor")) {
      return false;
    }
    if (!nextTokenIs(b, F_FLOOR)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FLOOR, null);
    r = consumeTokens(b, 1, F_FLOOR, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LOG  "(" number_argument ")"
  public static boolean FunLog(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLog")) {
      return false;
    }
    if (!nextTokenIs(b, F_LOG)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOG, null);
    r = consumeTokens(b, 1, F_LOG, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LOG10  "(" number_argument ")"
  public static boolean FunLog10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLog10")) {
      return false;
    }
    if (!nextTokenIs(b, F_LOG10)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOG_10, null);
    r = consumeTokens(b, 1, F_LOG10, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LOG2  "(" number_argument ")"
  public static boolean FunLog2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLog2")) {
      return false;
    }
    if (!nextTokenIs(b, F_LOG2)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOG_2, null);
    r = consumeTokens(b, 1, F_LOG2, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MAX  "(" number_argument_array ")"
  public static boolean FunMax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMax")) {
      return false;
    }
    if (!nextTokenIs(b, F_MAX)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MAX, null);
    r = consumeTokens(b, 1, F_MAX, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MEDIAN  "(" number_argument_array ")"
  public static boolean FunMedian(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMedian")) {
      return false;
    }
    if (!nextTokenIs(b, F_MEDIAN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MEDIAN, null);
    r = consumeTokens(b, 1, F_MEDIAN, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MIN  "(" number_argument_array ")"
  public static boolean FunMin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMin")) {
      return false;
    }
    if (!nextTokenIs(b, F_MIN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MIN, null);
    r = consumeTokens(b, 1, F_MIN, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_PERCENTILE  "(" number_argument_array "," external_percentile_range_rule ("," StringType)? ")"
  public static boolean FunPercentile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPercentile")) {
      return false;
    }
    if (!nextTokenIs(b, F_PERCENTILE)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PERCENTILE, null);
    r = consumeTokens(b, 1, F_PERCENTILE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, parsePercentileRange(b, l + 1)) && r;
    r = p && report_error_(b, FunPercentile_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," StringType)?
  private static boolean FunPercentile_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPercentile_5")) {
      return false;
    }
    FunPercentile_5_0(b, l + 1);
    return true;
  }

  // "," StringType
  private static boolean FunPercentile_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPercentile_5_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_PI "(" ")"
  public static boolean FunPi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPi")) {
      return false;
    }
    if (!nextTokenIs(b, F_PI)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PI, null);
    r = consumeTokens(b, 1, F_PI, T_OPEN, T_CLOSE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_POW "(" number_argument "," number_argument ")"
  public static boolean FunPow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPow")) {
      return false;
    }
    if (!nextTokenIs(b, F_POW)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_POW, null);
    r = consumeTokens(b, 1, F_POW, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, number_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RADIANS "(" number_argument ")"
  public static boolean FunRadians(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRadians")) {
      return false;
    }
    if (!nextTokenIs(b, F_RADIANS)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RADIANS, null);
    r = consumeTokens(b, 1, F_RADIANS, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RAND "(" ")"
  public static boolean FunRand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRand")) {
      return false;
    }
    if (!nextTokenIs(b, F_RAND)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RAND, null);
    r = consumeTokens(b, 1, F_RAND, T_OPEN, T_CLOSE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RANGE "(" number_argument "," number_argument ("," number_argument)? ")"
  public static boolean FunRange(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRange")) {
      return false;
    }
    if (!nextTokenIs(b, F_RANGE)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RANGE, null);
    r = consumeTokens(b, 1, F_RANGE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, number_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRange_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," number_argument)?
  private static boolean FunRange_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRange_5")) {
      return false;
    }
    FunRange_5_0(b, l + 1);
    return true;
  }

  // "," number_argument
  private static boolean FunRange_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRange_5_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_ROUND "(" number_argument ")"
  public static boolean FunRound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRound")) {
      return false;
    }
    if (!nextTokenIs(b, F_ROUND)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ROUND, null);
    r = consumeTokens(b, 1, F_ROUND, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SQRT "(" number_argument ")"
  public static boolean FunSQRT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSQRT")) {
      return false;
    }
    if (!nextTokenIs(b, F_SQRT)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SQRT, null);
    r = consumeTokens(b, 1, F_SQRT, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SIN "(" number_argument ")"
  public static boolean FunSin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSin")) {
      return false;
    }
    if (!nextTokenIs(b, F_SIN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SIN, null);
    r = consumeTokens(b, 1, F_SIN, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_STDDEV "(" number_argument_array ")"
  public static boolean FunStddev(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunStddev")) {
      return false;
    }
    if (!nextTokenIs(b, F_STDDEV)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STDDEV, null);
    r = consumeTokens(b, 1, F_STDDEV, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_STDDEV_POPULATION "(" number_argument_array ")"
  public static boolean FunStddevPopulation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunStddevPopulation")) {
      return false;
    }
    if (!nextTokenIs(b, F_STDDEV_POPULATION)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STDDEV_POPULATION, null);
    r = consumeTokens(b, 1, F_STDDEV_POPULATION, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SUM "(" number_argument_array ")"
  public static boolean FunSum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSum")) {
      return false;
    }
    if (!nextTokenIs(b, F_SUM)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SUM, null);
    r = consumeTokens(b, 1, F_SUM, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TAN "(" number_argument ")"
  public static boolean FunTan(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTan")) {
      return false;
    }
    if (!nextTokenIs(b, F_TAN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TAN, null);
    r = consumeTokens(b, 1, F_TAN, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TAN2 "(" number_argument ")"
  public static boolean FunTan2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTan2")) {
      return false;
    }
    if (!nextTokenIs(b, F_TAN2)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TAN_2, null);
    r = consumeTokens(b, 1, F_TAN2, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE "(" number_argument_array ")"
  public static boolean FunVariance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVariance")) {
      return false;
    }
    if (!nextTokenIs(b, F_VARIANCE)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE, null);
    r = consumeTokens(b, 1, F_VARIANCE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE_POPULATION "(" number_argument_array ")"
  public static boolean FunVariancePopulation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVariancePopulation")) {
      return false;
    }
    if (!nextTokenIs(b, F_VARIANCE_POPULATION)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE_POPULATION, null);
    r = consumeTokens(b, 1, F_VARIANCE_POPULATION, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE_SAMPLE "(" number_argument_array ")"
  public static boolean FunVarianceSample(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVarianceSample")) {
      return false;
    }
    if (!nextTokenIs(b, F_VARIANCE_SAMPLE)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE_SAMPLE, null);
    r = consumeTokens(b, 1, F_VARIANCE_SAMPLE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // NamedKeywordFunctions T_OPEN ExpressionArray* T_CLOSE
  public static boolean FunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionExpression")) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_EXPRESSION, "<function expression>");
    r = NamedKeywordFunctions(b, l + 1);
    r = r && consumeToken(b, T_OPEN);
    r = r && FunctionExpression_2(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionArray*
  private static boolean FunctionExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionExpression_2")) {
      return false;
    }
    while (true) {
      int c = current_position_(b);
      if (!ExpressionArray(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "FunctionExpression_2", c)) {
        break;
      }
    }
    return true;
  }

  /* ********************************************************** */
  // NUMBER_INTEGER
  public static boolean IntegerType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerType")) return false;
    if (!nextTokenIs(b, NUMBER_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER_INTEGER);
    exit_section_(b, m, INTEGER_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // "{" (ExpressionType ":" ComplexJsonProperty) ? ("," ExpressionType ":" ExpressionArray | ArrayType | NamedKeywordStatements | ObjectExpression  )*  "}"
  public static boolean JsonType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType")) {
      return false;
    }
    if (!nextTokenIs(b, T_OBJECT_OPEN)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, JSON_TYPE, null);
    r = consumeToken(b, T_OBJECT_OPEN);
    r = r && JsonType_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, JsonType_2(b, l + 1));
    r = p && consumeToken(b, T_OBJECT_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ExpressionType ":" ComplexJsonProperty) ?
  private static boolean JsonType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType_1")) {
      return false;
    }
    JsonType_1_0(b, l + 1);
    return true;
  }

  // ExpressionType ":" ComplexJsonProperty
  private static boolean JsonType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType_1_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionType(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && ComplexJsonProperty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," ExpressionType ":" ExpressionArray | ArrayType | NamedKeywordStatements | ObjectExpression  )*
  private static boolean JsonType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType_2")) {
      return false;
    }
    while (true) {
      int c = current_position_(b);
      if (!JsonType_2_0(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "JsonType_2", c)) {
        break;
      }
    }
    return true;
  }

  // "," ExpressionType ":" ExpressionArray | ArrayType | NamedKeywordStatements | ObjectExpression
  private static boolean JsonType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType_2_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = JsonType_2_0_0(b, l + 1);
    if (!r) {
      r = ArrayType(b, l + 1);
    }
    if (!r) {
      r = NamedKeywordStatements(b, l + 1);
    }
    if (!r) {
      r = ObjectExpression(b, l + 1);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // "," ExpressionType ":" ExpressionArray
  private static boolean JsonType_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType_2_0_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ExpressionType(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && ExpressionArray(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_SUBSTITUTE
  //                         | F_MD5
  //                         | F_GEO_POINT
  //                         | F_FIRST_LIST
  //                         | F_DATE_SUBTRACT
  //                         | F_DATE_MINUTE
  //                         | F_SPLIT
  //                         | F_WARN
  //                         | F_DATE_LEAPYEAR
  //                         | F_STDDEV_SAMPLE
  //                         | F_IS_BOOL
  //                         | F_TO_LIST
  //                         | F_REGEX_SPLIT
  //                         | F_MATCHES
  //                         | F_CURRENT_DATABASE
  //                         | F_UNSET
  //                         | F_JSON_PARSE
  //                         | F_GEO_MULTILINESTRING
  //                         | F_DATE_DAYOFYEAR
  //                         | F_LAST
  //                         | F_VALUES
  //                         | F_DATE_DAY
  //                         | F_DATE_DAYS_IN_MONTH
  //                         | F_NEAR
  //                         | F_LTRIM
  //                         | F_REVERSE
  //                         | F_FIRST
  //                         | F_LENGTH
  //                         | F_UNSET_RECURSIVE
  //                         | F_PARSE_IDENTIFIER
  //                         | F_TO_BASE64
  //                         | F_IS_DATESTRING
  //                         | F_INTERSECTION
  //                         | F_MINUS
  //                         | F_IS_IN_POLYGON
  //                         | F_IS_OBJECT
  //                         | F_STARTS_WITH
  //                         | F_DATE_DAYOFWEEK
  //                         | F_TFIDF
  //                         | F_DATE_ISO8601
  //                         | F_DATE_TRUNC
  //                         | F_IS_LIST
  //                         | F_NOOPT
  //                         | F_ATTRIBUTES
  //                         | F_CALL
  //                         | F_LEVENSHTEIN_DISTANCE
  //                         | F_REMOVE_VALUE
  //                         | F_DATE_FORMAT
  //                         | F_OUTERSECTION
  //                         | F_UNION
  //                         | F_KEYS
  //                         | F_COLLECTION_COUNT
  //                         | F_BOOST
  //                         | F_REGEX_MATCHES
  //                         | F_DISTANCE
  //                         | F_CHAR_LENGTH
  //                         | F_MERGE_RECURSIVE
  //                         | F_UPPER
  //                         | F_MIN_MATCH
  //                         | F_GEO_EQUALS
  //                         | F_TRIM
  //                         | F_LEFT
  //                         | F_NOT_NULL
  //                         | F_VERSION
  //                         | F_SLEEP
  //                         | F_POP
  //                         | F_UUID
  //                         | F_TO_NUMBER
  //                         | F_FIND_FIRST
  //                         | F_DATE_ISOWEEK
  //                         | F_LOWER
  //                         | F_GEO_CONTAINS
  //                         | F_TRANSLATE
  //                         | F_GEO_LINESTRING
  //                         | F_APPLY
  //                         | F_DATE_SECOND
  //                         | F_BM25
  //                         | F_DATE_MONTH
  //                         | F_SHIFT
  //                         | F_CONCAT
  //                         | F_SUBSTRING
  //                         | F_CURRENT_USER
  //                         | F_CONTAINS_ARRAY
  //                         | F_HAS
  //                         | F_KEEP
  //                         | F_TO_STRING
  //                         | F_V8
  //                         | F_PREGEL_RESULT
  //                         | F_UNION_DISTINCT
  //                         | F_LIKE
  //                         | F_COUNT_UNIQUE
  //                         | F_WITHIN
  //                         | F_IS_STRING
  //                         | F_REGEX_TEST
  //                         | F_REMOVE_VALUES
  //                         | F_GEO_INTERSECTS
  //                         | F_IS_DOCUMENT
  //                         | F_REGEX_REPLACE
  //                         | F_SORTED_UNIQUE
  //                         | F_TYPENAME
  //                         | F_DATE_ADD
  //                         | F_REMOVE_NTH
  //                         | F_APPEND
  //                         | F_FLATTEN
  //                         | F_GEO_POLYGON
  //                         | F_COUNT
  //                         | F_DATE_MILLISECOND
  //                         | F_WITHIN_RECTANGLE
  //                         | F_SOUNDEX
  //                         | F_TOKENS
  //                         | F_DATE_QUARTER
  //                         | F_IS_NULL
  //                         | F_COLLECTIONS
  //                         | F_ANALYZER
  //                         | F_PHRASE
  //                         | F_DATE_NOW
  //                         | F_TO_ARRAY
  //                         | F_RIGHT
  //                         | F_RTRIM
  //                         | F_DOCUMENT
  //                         | F_GEO_DISTANCE
  //                         | F_PASSTHRU
  //                         | F_ZIP
  //                         | F_TO_HEX
  //                         | F_FULLTEXT
  //                         | F_UNIQUE
  //                         | F_IS_KEY
  //                         | F_IS_ARRAY
  //                         | F_SHA512
  //                         | F_DATE_COMPARE
  //                         | F_IS_SAME_COLLECTION
  //                         | F_PUSH
  //                         | F_DATE_YEAR
  //                         | F_HASH
  //                         | F_COUNT_DISTINCT
  //                         | F_SHA1
  //                         | F_POSITION
  //                         | F_MERGE
  //                         | F_DATE_TIMESTAMP
  //                         | F_ENCODE_URI_COMPONENT
  //                         | F_CONTAINS
  //                         | F_FAIL
  //                         | F_EXISTS
  //                         | F_NTH
  //                         | F_TO_BOOL
  //                         | F_DATE_HOUR
  //                         | F_JSON_STRINGIFY
  //                         | F_FIRST_DOCUMENT
  //                         | F_RANDOM_TOKEN
  //                         | F_FIND_LAST
  //                         | F_IS_NUMBER
  //                         | F_SORTED
  //                         | F_DATE_DIFF
  //                         | F_UNSHIFT
  //                         | F_ASSERT
  //                         | F_GEO_MULTIPOINT
  //                         | F_SLICE
  public static boolean KeywordFunctions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeywordFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_FUNCTIONS, "<keyword functions>");
    r = consumeToken(b, F_SUBSTITUTE);
    if (!r) r = consumeToken(b, F_MD5);
    if (!r) r = consumeToken(b, F_GEO_POINT);
    if (!r) r = consumeToken(b, F_FIRST_LIST);
    if (!r) r = consumeToken(b, F_DATE_SUBTRACT);
    if (!r) r = consumeToken(b, F_DATE_MINUTE);
    if (!r) r = consumeToken(b, F_SPLIT);
    if (!r) r = consumeToken(b, F_WARN);
    if (!r) r = consumeToken(b, F_DATE_LEAPYEAR);
    if (!r) r = consumeToken(b, F_STDDEV_SAMPLE);
    if (!r) r = consumeToken(b, F_IS_BOOL);
    if (!r) r = consumeToken(b, F_TO_LIST);
    if (!r) r = consumeToken(b, F_REGEX_SPLIT);
    if (!r) r = consumeToken(b, F_MATCHES);
    if (!r) r = consumeToken(b, F_CURRENT_DATABASE);
    if (!r) r = consumeToken(b, F_UNSET);
    if (!r) r = consumeToken(b, F_JSON_PARSE);
    if (!r) r = consumeToken(b, F_GEO_MULTILINESTRING);
    if (!r) r = consumeToken(b, F_DATE_DAYOFYEAR);
    if (!r) r = consumeToken(b, F_LAST);
    if (!r) r = consumeToken(b, F_VALUES);
    if (!r) r = consumeToken(b, F_DATE_DAY);
    if (!r) r = consumeToken(b, F_DATE_DAYS_IN_MONTH);
    if (!r) r = consumeToken(b, F_NEAR);
    if (!r) r = consumeToken(b, F_LTRIM);
    if (!r) r = consumeToken(b, F_REVERSE);
    if (!r) r = consumeToken(b, F_FIRST);
    if (!r) r = consumeToken(b, F_LENGTH);
    if (!r) r = consumeToken(b, F_UNSET_RECURSIVE);
    if (!r) r = consumeToken(b, F_PARSE_IDENTIFIER);
    if (!r) r = consumeToken(b, F_TO_BASE64);
    if (!r) r = consumeToken(b, F_IS_DATESTRING);
    if (!r) r = consumeToken(b, F_INTERSECTION);
    if (!r) r = consumeToken(b, F_MINUS);
    if (!r) r = consumeToken(b, F_IS_IN_POLYGON);
    if (!r) r = consumeToken(b, F_IS_OBJECT);
    if (!r) r = consumeToken(b, F_STARTS_WITH);
    if (!r) r = consumeToken(b, F_DATE_DAYOFWEEK);
    if (!r) r = consumeToken(b, F_TFIDF);
    if (!r) r = consumeToken(b, F_DATE_ISO8601);
    if (!r) r = consumeToken(b, F_DATE_TRUNC);
    if (!r) r = consumeToken(b, F_IS_LIST);
    if (!r) r = consumeToken(b, F_NOOPT);
    if (!r) r = consumeToken(b, F_ATTRIBUTES);
    if (!r) r = consumeToken(b, F_CALL);
    if (!r) r = consumeToken(b, F_LEVENSHTEIN_DISTANCE);
    if (!r) r = consumeToken(b, F_REMOVE_VALUE);
    if (!r) r = consumeToken(b, F_DATE_FORMAT);
    if (!r) r = consumeToken(b, F_OUTERSECTION);
    if (!r) r = consumeToken(b, F_UNION);
    if (!r) r = consumeToken(b, F_KEYS);
    if (!r) r = consumeToken(b, F_COLLECTION_COUNT);
    if (!r) r = consumeToken(b, F_BOOST);
    if (!r) r = consumeToken(b, F_REGEX_MATCHES);
    if (!r) r = consumeToken(b, F_DISTANCE);
    if (!r) r = consumeToken(b, F_CHAR_LENGTH);
    if (!r) r = consumeToken(b, F_MERGE_RECURSIVE);
    if (!r) r = consumeToken(b, F_UPPER);
    if (!r) r = consumeToken(b, F_MIN_MATCH);
    if (!r) r = consumeToken(b, F_GEO_EQUALS);
    if (!r) r = consumeToken(b, F_TRIM);
    if (!r) r = consumeToken(b, F_LEFT);
    if (!r) r = consumeToken(b, F_NOT_NULL);
    if (!r) r = consumeToken(b, F_VERSION);
    if (!r) r = consumeToken(b, F_SLEEP);
    if (!r) r = consumeToken(b, F_POP);
    if (!r) r = consumeToken(b, F_UUID);
    if (!r) r = consumeToken(b, F_TO_NUMBER);
    if (!r) r = consumeToken(b, F_FIND_FIRST);
    if (!r) r = consumeToken(b, F_DATE_ISOWEEK);
    if (!r) r = consumeToken(b, F_LOWER);
    if (!r) r = consumeToken(b, F_GEO_CONTAINS);
    if (!r) r = consumeToken(b, F_TRANSLATE);
    if (!r) r = consumeToken(b, F_GEO_LINESTRING);
    if (!r) r = consumeToken(b, F_APPLY);
    if (!r) r = consumeToken(b, F_DATE_SECOND);
    if (!r) r = consumeToken(b, F_BM25);
    if (!r) r = consumeToken(b, F_DATE_MONTH);
    if (!r) r = consumeToken(b, F_SHIFT);
    if (!r) r = consumeToken(b, F_CONCAT);
    if (!r) r = consumeToken(b, F_SUBSTRING);
    if (!r) r = consumeToken(b, F_CURRENT_USER);
    if (!r) r = consumeToken(b, F_CONTAINS_ARRAY);
    if (!r) r = consumeToken(b, F_HAS);
    if (!r) r = consumeToken(b, F_KEEP);
    if (!r) r = consumeToken(b, F_TO_STRING);
    if (!r) r = consumeToken(b, F_V8);
    if (!r) r = consumeToken(b, F_PREGEL_RESULT);
    if (!r) r = consumeToken(b, F_UNION_DISTINCT);
    if (!r) r = consumeToken(b, F_LIKE);
    if (!r) r = consumeToken(b, F_COUNT_UNIQUE);
    if (!r) r = consumeToken(b, F_WITHIN);
    if (!r) r = consumeToken(b, F_IS_STRING);
    if (!r) r = consumeToken(b, F_REGEX_TEST);
    if (!r) r = consumeToken(b, F_REMOVE_VALUES);
    if (!r) r = consumeToken(b, F_GEO_INTERSECTS);
    if (!r) r = consumeToken(b, F_IS_DOCUMENT);
    if (!r) r = consumeToken(b, F_REGEX_REPLACE);
    if (!r) r = consumeToken(b, F_SORTED_UNIQUE);
    if (!r) r = consumeToken(b, F_TYPENAME);
    if (!r) r = consumeToken(b, F_DATE_ADD);
    if (!r) r = consumeToken(b, F_REMOVE_NTH);
    if (!r) r = consumeToken(b, F_APPEND);
    if (!r) r = consumeToken(b, F_FLATTEN);
    if (!r) r = consumeToken(b, F_GEO_POLYGON);
    if (!r) r = consumeToken(b, F_COUNT);
    if (!r) r = consumeToken(b, F_DATE_MILLISECOND);
    if (!r) r = consumeToken(b, F_WITHIN_RECTANGLE);
    if (!r) r = consumeToken(b, F_SOUNDEX);
    if (!r) r = consumeToken(b, F_TOKENS);
    if (!r) r = consumeToken(b, F_DATE_QUARTER);
    if (!r) r = consumeToken(b, F_IS_NULL);
    if (!r) r = consumeToken(b, F_COLLECTIONS);
    if (!r) r = consumeToken(b, F_ANALYZER);
    if (!r) r = consumeToken(b, F_PHRASE);
    if (!r) r = consumeToken(b, F_DATE_NOW);
    if (!r) r = consumeToken(b, F_TO_ARRAY);
    if (!r) r = consumeToken(b, F_RIGHT);
    if (!r) r = consumeToken(b, F_RTRIM);
    if (!r) r = consumeToken(b, F_DOCUMENT);
    if (!r) r = consumeToken(b, F_GEO_DISTANCE);
    if (!r) r = consumeToken(b, F_PASSTHRU);
    if (!r) r = consumeToken(b, F_ZIP);
    if (!r) r = consumeToken(b, F_TO_HEX);
    if (!r) r = consumeToken(b, F_FULLTEXT);
    if (!r) r = consumeToken(b, F_UNIQUE);
    if (!r) r = consumeToken(b, F_IS_KEY);
    if (!r) r = consumeToken(b, F_IS_ARRAY);
    if (!r) r = consumeToken(b, F_SHA512);
    if (!r) r = consumeToken(b, F_DATE_COMPARE);
    if (!r) r = consumeToken(b, F_IS_SAME_COLLECTION);
    if (!r) r = consumeToken(b, F_PUSH);
    if (!r) r = consumeToken(b, F_DATE_YEAR);
    if (!r) r = consumeToken(b, F_HASH);
    if (!r) r = consumeToken(b, F_COUNT_DISTINCT);
    if (!r) r = consumeToken(b, F_SHA1);
    if (!r) r = consumeToken(b, F_POSITION);
    if (!r) r = consumeToken(b, F_MERGE);
    if (!r) r = consumeToken(b, F_DATE_TIMESTAMP);
    if (!r) r = consumeToken(b, F_ENCODE_URI_COMPONENT);
    if (!r) r = consumeToken(b, F_CONTAINS);
    if (!r) r = consumeToken(b, F_FAIL);
    if (!r) r = consumeToken(b, F_EXISTS);
    if (!r) r = consumeToken(b, F_NTH);
    if (!r) r = consumeToken(b, F_TO_BOOL);
    if (!r) r = consumeToken(b, F_DATE_HOUR);
    if (!r) r = consumeToken(b, F_JSON_STRINGIFY);
    if (!r) r = consumeToken(b, F_FIRST_DOCUMENT);
    if (!r) r = consumeToken(b, F_RANDOM_TOKEN);
    if (!r) r = consumeToken(b, F_FIND_LAST);
    if (!r) r = consumeToken(b, F_IS_NUMBER);
    if (!r) r = consumeToken(b, F_SORTED);
    if (!r) r = consumeToken(b, F_DATE_DIFF);
    if (!r) r = consumeToken(b, F_UNSHIFT);
    if (!r) r = consumeToken(b, F_ASSERT);
    if (!r) r = consumeToken(b, F_GEO_MULTIPOINT);
    if (!r) r = consumeToken(b, F_SLICE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SHORTEST_PATH
  //                         | T_SEARCH
  //                         | T_REPLACE
  //                         | T_ASC
  //                         | T_AGGREGATE
  //                         | T_FILTER
  //                         | T_DESC
  //                         | T_IN
  //                         | T_INTO
  //                         | T_LIMIT
  //                         | T_UPDATE
  //                         | T_SORT
  //                         | T_GRAPH
  //                         | T_FOR
  //                         | T_LET
  //                         | T_COLLECT
  //                         | T_WITH
  //                         | T_DISTINCT
  //                         | T_RETURN
  //                         | T_UPSERT
  //                         | T_REMOVE
  //                         | T_INSERT
  //                         | T_OUTBOUND
  //                         | T_INBOUND
  //                         | T_ANY
  //                         | T_ALL
  //                         | T_NONE
  public static boolean KeywordStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeywordStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_STATEMENTS, "<keyword statements>");
    r = consumeToken(b, T_SHORTEST_PATH);
    if (!r) r = consumeToken(b, T_SEARCH);
    if (!r) r = consumeToken(b, T_REPLACE);
    if (!r) r = consumeToken(b, T_ASC);
    if (!r) r = consumeToken(b, T_AGGREGATE);
    if (!r) r = consumeToken(b, T_FILTER);
    if (!r) r = consumeToken(b, T_DESC);
    if (!r) r = consumeToken(b, T_IN);
    if (!r) r = consumeToken(b, T_INTO);
    if (!r) r = consumeToken(b, T_LIMIT);
    if (!r) r = consumeToken(b, T_UPDATE);
    if (!r) r = consumeToken(b, T_SORT);
    if (!r) r = consumeToken(b, T_GRAPH);
    if (!r) r = consumeToken(b, T_FOR);
    if (!r) r = consumeToken(b, T_LET);
    if (!r) r = consumeToken(b, T_COLLECT);
    if (!r) r = consumeToken(b, T_WITH);
    if (!r) r = consumeToken(b, T_DISTINCT);
    if (!r) r = consumeToken(b, T_RETURN);
    if (!r) r = consumeToken(b, T_UPSERT);
    if (!r) r = consumeToken(b, T_REMOVE);
    if (!r) r = consumeToken(b, T_INSERT);
    if (!r) {
      r = consumeToken(b, T_OUTBOUND);
    }
    if (!r) {
      r = consumeToken(b, T_INBOUND);
    }
    if (!r) {
      r = consumeToken(b, T_ANY);
    }
    if (!r) {
      r = consumeToken(b, T_ALL);
    }
    if (!r) {
      r = consumeToken(b, T_NONE);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // L_COMMENT
  public static boolean LineComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LineComment")) return false;
    if (!nextTokenIs(b, L_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_COMMENT);
    exit_section_(b, m, LINE_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordFunctions
  public static boolean NamedKeywordFunctions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedKeywordFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_KEYWORD_FUNCTIONS, "<named keyword functions>");
    r = KeywordFunctions(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeywordStatements
  public static boolean NamedKeywordStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedKeywordStatements")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_KEYWORD_STATEMENTS, "<named keyword statements>");
    r = KeywordStatements(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnyNumber | SignedInteger | IntegerType
  public static boolean NumberType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberType")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_TYPE, "<number type>");
    r = AnyNumber(b, l + 1);
    if (!r) {
      r = SignedInteger(b, l + 1);
    }
    if (!r) {
      r = IntegerType(b, l + 1);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PropertyName (DOT PropertyLookup)*
  public static boolean ObjectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression")) return false;
    if (!nextTokenIs(b, ID)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyName(b, l + 1);
    r = r && ObjectExpression_1(b, l + 1);
    exit_section_(b, m, OBJECT_EXPRESSION, r);
    return r;
  }

  // (DOT PropertyLookup)*
  private static boolean ObjectExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1")) {
      return false;
    }
    while (true) {
      int c = current_position_(b);
      if (!ObjectExpression_1_0(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "ObjectExpression_1", c)) {
        break;
      }
    }
    return true;
  }

  // DOT PropertyLookup
  private static boolean ObjectExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && PropertyLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_IS
  //                        | T_NOT
  //                        | T_AND
  //                        | T_LOGICAL_AND
  //                        | T_OR
  //                        | T_NIN
  //                        | T_REGEX_MATCH
  //                        | T_REGEX_NON_MATCH
  //                        | T_EQ
  //                        | T_NE
  //                        | T_LT
  //                        | T_GT
  //                        | T_LE
  //                        | T_GE
  //                        | T_LIKE
  //                        | T_QUESTION
  //                        | T_COLON
  //                        | T_SCOPE
  //                        | T_RANGE
  //                        //TODO remove
  //                       | T_COMMA
  //                       | T_OPEN
  //                        | T_CLOSE
  //                         | T_OBJECT_OPEN
  //                        | T_ARRAY_OPEN
  //                        | T_ARRAY_CLOSE
  //                        | T_OBJECT_START
  //                        | T_OBJECT_CLOSE
  //                        | DOT
  public static boolean OperatorStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperatorStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_STATEMENTS, "<operator statements>");
    r = consumeToken(b, T_IS);
    if (!r) r = consumeToken(b, T_NOT);
    if (!r) r = consumeToken(b, T_AND);
    if (!r) r = consumeToken(b, T_LOGICAL_AND);
    if (!r) r = consumeToken(b, T_OR);
    if (!r) r = consumeToken(b, T_NIN);
    if (!r) r = consumeToken(b, T_REGEX_MATCH);
    if (!r) r = consumeToken(b, T_REGEX_NON_MATCH);
    if (!r) r = consumeToken(b, T_EQ);
    if (!r) r = consumeToken(b, T_NE);
    if (!r) r = consumeToken(b, T_LT);
    if (!r) r = consumeToken(b, T_GT);
    if (!r) r = consumeToken(b, T_LE);
    if (!r) r = consumeToken(b, T_GE);
    if (!r) r = consumeToken(b, T_LIKE);
    if (!r) r = consumeToken(b, T_QUESTION);
    if (!r) r = consumeToken(b, T_COLON);
    if (!r) r = consumeToken(b, T_SCOPE);
    if (!r) r = consumeToken(b, T_RANGE);
    if (!r) r = consumeToken(b, T_COMMA);
    if (!r) r = consumeToken(b, T_OPEN);
    if (!r) r = consumeToken(b, T_CLOSE);
    if (!r) r = consumeToken(b, T_OBJECT_OPEN);
    if (!r) r = consumeToken(b, T_ARRAY_OPEN);
    if (!r) r = consumeToken(b, T_ARRAY_CLOSE);
    if (!r) {
      r = consumeToken(b, T_OBJECT_START);
    }
    if (!r) {
      r = consumeToken(b, T_OBJECT_CLOSE);
    }
    if (!r) {
      r = consumeToken(b, DOT);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // N_AT  PropertyName
  public static boolean ParameterVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterVariable")) {
      return false;
    }
    if (!nextTokenIs(b, N_AT)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, N_AT);
    r = r && PropertyName(b, l + 1);
    exit_section_(b, m, PARAMETER_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // PropertyName | SystemProperty
  public static boolean PropertyLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyLookup")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_LOOKUP, "<property lookup>");
    r = PropertyName(b, l + 1);
    if (!r) {
      r = SystemProperty(b, l + 1);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean PropertyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, PROPERTY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> Statement
  public static boolean QueryItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, QUERY_ITEM, "<query item>");
    r = QueryItem_0(b, l + 1);
    p = r; // pin = 1
    r = r && Statement(b, l + 1);
    exit_section_(b, l, m, r, p, statement_recover_parser_);
    return r || p;
  }

  // !<<eof>>
  private static boolean QueryItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_NULL
  public static boolean ReserverdWords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReserverdWords")) {
      return false;
    }
    if (!nextTokenIs(b, T_NULL)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NULL);
    exit_section_(b, m, RESERVERD_WORDS, r);
    return r;
  }

  /* ********************************************************** */
  // IntegerType T_RANGE IntegerType
  public static boolean Sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sequence")) return false;
    if (!nextTokenIs(b, NUMBER_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerType(b, l + 1);
    r = r && consumeToken(b, T_RANGE);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, m, SEQUENCE, r);
    return r;
  }

  /* ********************************************************** */
  // (T_PLUS | T_MINUS) IntegerType
  public static boolean SignedInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedInteger")) {
      return false;
    }
    if (!nextTokenIs(b, "<signed integer>", T_MINUS, T_PLUS)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_INTEGER, "<signed integer>");
    r = SignedInteger_0(b, l + 1);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_PLUS | T_MINUS
  private static boolean SignedInteger_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedInteger_0")) {
      return false;
    }
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) {
      r = consumeToken(b, T_MINUS);
    }
    return r;
  }

  /* ********************************************************** */
  // NamedKeywordStatements
  //               | OperatorStatements
  //               | Sequence
  //               | StringType
  //               | ArrayType
  //               | JsonType
  //               | NumberType
  //               | BooleanType
  //               | VariablePlaceHolder
  //               | FunctionExpression
  //               | ExpressionType
  //               // functions
  //               | FunAbs
  //               | FunAcos
  //               | FunAsin
  //               | FunAvg
  //               | FunAverage
  //               | FunTan
  //               | FunTan2
  //               | FunAtan
  //               | FunSin
  //               | FunAtan2
  //               | FunCos
  //               | FunDegrees
  //               | FunMin
  //               | FunMedian
  //               | FunLog10
  //               | FunMax
  //               | FunSQRT
  //               | FunPercentile
  //               | FunPi
  //               | FunLog2
  //               | FunLog
  //               | FunFloor
  //               | FunExp2
  //               | FunExp
  //               | FunCeil
  //               | FunRand
  //               | FunSum
  //               | FunStddev
  //               | FunPow
  //               | FunVarianceSample
  //               | FunStddevPopulation
  //               | FunVariancePopulation
  //               | FunRadians
  //               | FunRange
  //               | FunRound
  //               | FunVariance
  //               | FunConcatSeparator
  //               | Comment
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = NamedKeywordStatements(b, l + 1);
    if (!r) {
      r = OperatorStatements(b, l + 1);
    }
    if (!r) {
      r = Sequence(b, l + 1);
    }
    if (!r) {
      r = StringType(b, l + 1);
    }
    if (!r) {
      r = ArrayType(b, l + 1);
    }
    if (!r) {
      r = JsonType(b, l + 1);
    }
    if (!r) {
      r = NumberType(b, l + 1);
    }
    if (!r) {
      r = BooleanType(b, l + 1);
    }
    if (!r) {
      r = VariablePlaceHolder(b, l + 1);
    }
    if (!r) {
      r = FunctionExpression(b, l + 1);
    }
    if (!r) {
      r = ExpressionType(b, l + 1);
    }
    if (!r) {
      r = FunAbs(b, l + 1);
    }
    if (!r) {
      r = FunAcos(b, l + 1);
    }
    if (!r) {
      r = FunAsin(b, l + 1);
    }
    if (!r) {
      r = FunAvg(b, l + 1);
    }
    if (!r) {
      r = FunAverage(b, l + 1);
    }
    if (!r) {
      r = FunTan(b, l + 1);
    }
    if (!r) {
      r = FunTan2(b, l + 1);
    }
    if (!r) {
      r = FunAtan(b, l + 1);
    }
    if (!r) {
      r = FunSin(b, l + 1);
    }
    if (!r) {
      r = FunAtan2(b, l + 1);
    }
    if (!r) {
      r = FunCos(b, l + 1);
    }
    if (!r) {
      r = FunDegrees(b, l + 1);
    }
    if (!r) {
      r = FunMin(b, l + 1);
    }
    if (!r) {
      r = FunMedian(b, l + 1);
    }
    if (!r) {
      r = FunLog10(b, l + 1);
    }
    if (!r) {
      r = FunMax(b, l + 1);
    }
    if (!r) {
      r = FunSQRT(b, l + 1);
    }
    if (!r) {
      r = FunPercentile(b, l + 1);
    }
    if (!r) {
      r = FunPi(b, l + 1);
    }
    if (!r) {
      r = FunLog2(b, l + 1);
    }
    if (!r) {
      r = FunLog(b, l + 1);
    }
    if (!r) {
      r = FunFloor(b, l + 1);
    }
    if (!r) {
      r = FunExp2(b, l + 1);
    }
    if (!r) {
      r = FunExp(b, l + 1);
    }
    if (!r) {
      r = FunCeil(b, l + 1);
    }
    if (!r) {
      r = FunRand(b, l + 1);
    }
    if (!r) {
      r = FunSum(b, l + 1);
    }
    if (!r) {
      r = FunStddev(b, l + 1);
    }
    if (!r) {
      r = FunPow(b, l + 1);
    }
    if (!r) {
      r = FunVarianceSample(b, l + 1);
    }
    if (!r) {
      r = FunStddevPopulation(b, l + 1);
    }
    if (!r) {
      r = FunVariancePopulation(b, l + 1);
    }
    if (!r) {
      r = FunRadians(b, l + 1);
    }
    if (!r) {
      r = FunRange(b, l + 1);
    }
    if (!r) {
      r = FunRound(b, l + 1);
    }
    if (!r) {
      r = FunVariance(b, l + 1);
    }
    if (!r) {
      r = FunConcatSeparator(b, l + 1);
    }
    if (!r) {
      r = Comment(b, l + 1);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (TEXT_SINGLE) | (TEXT_DOUBLE)
  public static boolean StringType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringType")) return false;
    if (!nextTokenIs(b, "<string type>", TEXT_DOUBLE, TEXT_SINGLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_TYPE, "<string type>");
    r = consumeToken(b, TEXT_SINGLE);
    if (!r) r = consumeToken(b, TEXT_DOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_KEY | T_ID  | T_SYS_FROM  | T_SYS_TO
  public static boolean SystemProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SystemProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYSTEM_PROPERTY, "<system property>");
    r = consumeToken(b, T_KEY);
    if (!r) r = consumeToken(b, T_ID);
    if (!r) r = consumeToken(b, T_SYS_FROM);
    if (!r) r = consumeToken(b, T_SYS_TO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_OBJECT_START ObjectExpression T_OBJECT_CLOSE
  public static boolean VariablePlaceHolder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariablePlaceHolder")) {
      return false;
    }
    if (!nextTokenIs(b, T_OBJECT_START)) {
      return false;
    }
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_PLACE_HOLDER, null);
    r = consumeToken(b, T_OBJECT_START);
    r = r && ObjectExpression(b, l + 1);
    p = r; // pin = 2
    r = r && consumeToken(b, T_OBJECT_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // QueryItem *
  static boolean aql(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aql")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QueryItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aql", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NumberType | ObjectExpression | ParameterVariable | VariablePlaceHolder
  static boolean number_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument")) {
      return false;
    }
    boolean r;
    r = NumberType(b, l + 1);
    if (!r) {
      r = ObjectExpression(b, l + 1);
    }
    if (!r) {
      r = ParameterVariable(b, l + 1);
    }
    if (!r) {
      r = VariablePlaceHolder(b, l + 1);
    }
    return r;
  }

  /* ********************************************************** */
  // "[" number_argument (',' number_argument)+ "]"
  static boolean number_argument_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array")) {
      return false;
    }
    if (!nextTokenIs(b, T_ARRAY_OPEN)) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && number_argument(b, l + 1);
    r = r && number_argument_array_2(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' number_argument)+
  private static boolean number_argument_array_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_2")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!number_argument_array_2_0(b, l + 1)) {
        break;
      }
      if (!empty_element_parsed_guard_(b, "number_argument_array_2", c)) {
        break;
      }
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' number_argument
  private static boolean number_argument_array_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_2_0")) {
      return false;
    }
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(
  //                         Statement
  //                     )
  static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //                         Statement
  //                     )
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringType | ObjectExpression | ParameterVariable | VariablePlaceHolder
  static boolean string_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_argument")) {
      return false;
    }
    boolean r;
    r = StringType(b, l + 1);
    if (!r) {
      r = ObjectExpression(b, l + 1);
    }
    if (!r) {
      r = ParameterVariable(b, l + 1);
    }
    if (!r) {
      r = VariablePlaceHolder(b, l + 1);
    }
    return r;
  }

  static final Parser statement_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return statement_recover(b, l + 1);
    }
  };
}
