// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;
import static com.arangodb.intellij.aql.grammar.custom.psi.AqlParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

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
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return aql(b, l + 1);
  }

  /* ********************************************************** */
  // A_IDENTITY
  //                  |A_TEXT_DE
  //                  |A_TEXT_EN
  //                  |A_TEXT_ES
  //                  |A_TEXT_FI
  //                  |A_TEXT_FR
  //                  |A_TEXT_IT
  //                  |A_TEXT_NL
  //                  |A_TEXT_NO
  //                  |A_TEXT_PT
  //                  |A_TEXT_RU
  //                  |A_TEXT_SV
  //                  |A_TEXT_ZH
  public static boolean AnalyzerType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnalyzerType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANALYZER_TYPE, "<analyzer type>");
    r = consumeToken(b, A_IDENTITY);
    if (!r) r = consumeToken(b, A_TEXT_DE);
    if (!r) r = consumeToken(b, A_TEXT_EN);
    if (!r) r = consumeToken(b, A_TEXT_ES);
    if (!r) r = consumeToken(b, A_TEXT_FI);
    if (!r) r = consumeToken(b, A_TEXT_FR);
    if (!r) r = consumeToken(b, A_TEXT_IT);
    if (!r) r = consumeToken(b, A_TEXT_NL);
    if (!r) r = consumeToken(b, A_TEXT_NO);
    if (!r) r = consumeToken(b, A_TEXT_PT);
    if (!r) r = consumeToken(b, A_TEXT_RU);
    if (!r) r = consumeToken(b, A_TEXT_SV);
    if (!r) r = consumeToken(b, A_TEXT_ZH);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | (T_PLUS | T_MINUS) NUMBER
  public static boolean AnyNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyNumber")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_NUMBER, "<any number>");
    r = consumeToken(b, NUMBER);
    if (!r) r = AnyNumber_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (T_PLUS | T_MINUS) NUMBER
  private static boolean AnyNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyNumber_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyNumber_1_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PLUS | T_MINUS
  private static boolean AnyNumber_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyNumber_1_0")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    return r;
  }

  /* ********************************************************** */
  // ExpressionType | JsonType
  public static boolean AnyType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_TYPE, "<any type>");
    r = ExpressionType(b, l + 1);
    if (!r) r = JsonType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression "[" ExpressionType "]"
  public static boolean ArrayRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_REF, "<array ref>");
    r = ObjectExpression(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_OPEN);
    r = r && ExpressionType(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' array_element* ']'
  public static boolean ArrayType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType")) return false;
    if (!nextTokenIs(b, T_ARRAY_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_TYPE, null);
    r = consumeToken(b, T_ARRAY_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, ArrayType_1(b, l + 1));
    r = p && consumeToken(b, T_ARRAY_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // array_element*
  private static boolean ArrayType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayType_1", c)) break;
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
    if (!recursion_guard_(b, l, "BooleanType")) return false;
    if (!nextTokenIs(b, "<boolean type>", T_FALSE, T_TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_TYPE, "<boolean type>");
    r = consumeToken(b, T_TRUE);
    if (!r) r = consumeToken(b, T_FALSE);
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
  // D_YEAR_S
  //                        |D_YEAR_D
  //                        |D_MONTH_S
  //                        |D_MONTH_D
  //                        |D_DAY_S
  //                        |D_DAY_D
  //                        |D_HOUR_S
  //                        |D_HOUR_D
  //                        |D_MINUTE_S
  //                        |D_MINUTE_D
  //                        |D_SECOND_S
  //                        |D_SECOND_D
  //                        |D_MILLISECOND_S
  //                        |D_MILLISECOND_D
  public static boolean DateUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATE_UNIT, "<date unit>");
    r = consumeToken(b, D_YEAR_S);
    if (!r) r = consumeToken(b, D_YEAR_D);
    if (!r) r = consumeToken(b, D_MONTH_S);
    if (!r) r = consumeToken(b, D_MONTH_D);
    if (!r) r = consumeToken(b, D_DAY_S);
    if (!r) r = consumeToken(b, D_DAY_D);
    if (!r) r = consumeToken(b, D_HOUR_S);
    if (!r) r = consumeToken(b, D_HOUR_D);
    if (!r) r = consumeToken(b, D_MINUTE_S);
    if (!r) r = consumeToken(b, D_MINUTE_D);
    if (!r) r = consumeToken(b, D_SECOND_S);
    if (!r) r = consumeToken(b, D_SECOND_D);
    if (!r) r = consumeToken(b, D_MILLISECOND_S);
    if (!r) r = consumeToken(b, D_MILLISECOND_D);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExpressionType (',' ExpressionType)*
  static boolean ExpressionArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionArray")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionType(b, l + 1);
    r = r && ExpressionArray_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ExpressionType)*
  private static boolean ExpressionArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionArray_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpressionArray_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpressionArray_1", c)) break;
    }
    return true;
  }

  // ',' ExpressionType
  private static boolean ExpressionArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ExpressionType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Comment
  //                 | FilterType
  //                 | ReturnType
  //                 | VariablePlaceHolder
  //                 | ParameterVariable
  //                 | ArrayRef
  //                 | ObjectExpression
  //                 | SystemProperty
  //                 | StringType
  //                 | IntegerType
  //                 | NumberType
  //                 | Sequence
  //                 | JsonType
  //                 | ArrayType
  //                 | AnalyzerType
  //                 | BooleanType
  //                 | arithmetic_operators
  //                 | ReservedWords
  //                 | PropertyName
  //                 | NamedFunctions
  //                 | NamedKeywordStatements
  //                 | keyword_functions
  //                 | reserved_keywords
  //                 | expression_operators
  //                 | OperatorStatements
  public static boolean ExpressionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_TYPE, "<expression type>");
    r = Comment(b, l + 1);
    if (!r) r = FilterType(b, l + 1);
    if (!r) r = ReturnType(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = ArrayRef(b, l + 1);
    if (!r) r = ObjectExpression(b, l + 1);
    if (!r) r = SystemProperty(b, l + 1);
    if (!r) r = StringType(b, l + 1);
    if (!r) r = IntegerType(b, l + 1);
    if (!r) r = NumberType(b, l + 1);
    if (!r) r = Sequence(b, l + 1);
    if (!r) r = JsonType(b, l + 1);
    if (!r) r = ArrayType(b, l + 1);
    if (!r) r = AnalyzerType(b, l + 1);
    if (!r) r = BooleanType(b, l + 1);
    if (!r) r = arithmetic_operators(b, l + 1);
    if (!r) r = ReservedWords(b, l + 1);
    if (!r) r = PropertyName(b, l + 1);
    if (!r) r = NamedFunctions(b, l + 1);
    if (!r) r = NamedKeywordStatements(b, l + 1);
    if (!r) r = keyword_functions(b, l + 1);
    if (!r) r = reserved_keywords(b, l + 1);
    if (!r) r = expression_operators(b, l + 1);
    if (!r) r = OperatorStatements(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_FILTER ExpressionType *
  public static boolean FilterType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterType")) return false;
    if (!nextTokenIs(b, T_FILTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FILTER_TYPE, null);
    r = consumeToken(b, T_FILTER);
    p = r; // pin = 1
    r = r && FilterType_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionType *
  private static boolean FilterType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpressionType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FilterType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // T_FOR ExpressionType*
  public static boolean ForType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForType")) return false;
    if (!nextTokenIs(b, T_FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_TYPE, null);
    r = consumeToken(b, T_FOR);
    p = r; // pin = 1
    r = r && ForType_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionType*
  private static boolean ForType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpressionType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // F_ABS "(" number_argument ")"
  public static boolean FunAbs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAbs")) return false;
    if (!nextTokenIs(b, F_ABS)) return false;
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
    if (!recursion_guard_(b, l, "FunAcos")) return false;
    if (!nextTokenIs(b, F_ACOS)) return false;
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
  // F_ANALYZER "(" AnyType  "," AnalyzerType ")"
  public static boolean FunAnalyzer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAnalyzer")) return false;
    if (!nextTokenIs(b, F_ANALYZER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ANALYZER, null);
    r = consumeTokens(b, 2, F_ANALYZER, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, AnalyzerType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_APPEND  "(" number_argument_array "," expression_argument ("," boolean_argument)? ")"
  public static boolean FunAppend(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAppend")) return false;
    if (!nextTokenIs(b, F_APPEND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_APPEND, null);
    r = consumeTokens(b, 2, F_APPEND, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, expression_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunAppend_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunAppend_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAppend_5")) return false;
    FunAppend_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunAppend_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAppend_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_APPLY "(" StringType ("," ArrayType)? ")"
  public static boolean FunApply(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunApply")) return false;
    if (!nextTokenIs(b, F_APPLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_APPLY, null);
    r = consumeTokens(b, 2, F_APPLY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, StringType(b, l + 1));
    r = p && report_error_(b, FunApply_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," ArrayType)?
  private static boolean FunApply_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunApply_3")) return false;
    FunApply_3_0(b, l + 1);
    return true;
  }

  // "," ArrayType
  private static boolean FunApply_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunApply_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ArrayType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_ASIN "(" number_argument ")"
  public static boolean FunAsin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAsin")) return false;
    if (!nextTokenIs(b, F_ASIN)) return false;
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
  // F_ASSERT "(" AnyType "," StringType  ")"
  public static boolean FunAssert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAssert")) return false;
    if (!nextTokenIs(b, F_ASSERT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ASSERT, null);
    r = consumeTokens(b, 2, F_ASSERT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, StringType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ATAN "(" number_argument ")"
  public static boolean FunAtan(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAtan")) return false;
    if (!nextTokenIs(b, F_ATAN)) return false;
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
    if (!recursion_guard_(b, l, "FunAtan2")) return false;
    if (!nextTokenIs(b, F_ATAN2)) return false;
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
  // F_ATTRIBUTES "(" document_argument ("," boolean_argument)? ("," boolean_argument)? ")"
  public static boolean FunAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAttributes")) return false;
    if (!nextTokenIs(b, F_ATTRIBUTES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ATTRIBUTES, null);
    r = consumeTokens(b, 2, F_ATTRIBUTES, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, FunAttributes_3(b, l + 1)) && r;
    r = p && report_error_(b, FunAttributes_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunAttributes_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAttributes_3")) return false;
    FunAttributes_3_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunAttributes_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAttributes_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," boolean_argument)?
  private static boolean FunAttributes_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAttributes_4")) return false;
    FunAttributes_4_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunAttributes_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAttributes_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_AVERAGE  "(" number_argument_array ")"
  public static boolean FunAverage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunAverage")) return false;
    if (!nextTokenIs(b, F_AVERAGE)) return false;
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
    if (!recursion_guard_(b, l, "FunAvg")) return false;
    if (!nextTokenIs(b, F_AVG)) return false;
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
  // F_BM25 "(" document_argument  ("," number_argument)? ("," boolean_argument) ")"
  public static boolean FunBm25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBm25")) return false;
    if (!nextTokenIs(b, F_BM25)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_BM_25, null);
    r = consumeTokens(b, 2, F_BM25, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, FunBm25_3(b, l + 1)) && r;
    r = p && report_error_(b, FunBm25_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," number_argument)?
  private static boolean FunBm25_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBm25_3")) return false;
    FunBm25_3_0(b, l + 1);
    return true;
  }

  // "," number_argument
  private static boolean FunBm25_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBm25_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," boolean_argument
  private static boolean FunBm25_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBm25_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_BOOST "(" AnyType  ("," number_argument)?  ")"
  public static boolean FunBoost(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBoost")) return false;
    if (!nextTokenIs(b, F_BOOST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_BOOST, null);
    r = consumeTokens(b, 2, F_BOOST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, FunBoost_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," number_argument)?
  private static boolean FunBoost_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBoost_3")) return false;
    FunBoost_3_0(b, l + 1);
    return true;
  }

  // "," number_argument
  private static boolean FunBoost_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunBoost_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_CALL "(" StringType ("," AnyType)* ")"
  public static boolean FunCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCall")) return false;
    if (!nextTokenIs(b, F_CALL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CALL, null);
    r = consumeTokens(b, 2, F_CALL, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, StringType(b, l + 1));
    r = p && report_error_(b, FunCall_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," AnyType)*
  private static boolean FunCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCall_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunCall_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunCall_3", c)) break;
    }
    return true;
  }

  // "," AnyType
  private static boolean FunCall_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCall_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AnyType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_CEIL  "(" number_argument ")"
  public static boolean FunCeil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCeil")) return false;
    if (!nextTokenIs(b, F_CEIL)) return false;
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
  // F_CHAR_LENGTH "(" AnyType ")"
  public static boolean FunCharLength(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCharLength")) return false;
    if (!nextTokenIs(b, F_CHAR_LENGTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CHAR_LENGTH, null);
    r = consumeTokens(b, 2, F_CHAR_LENGTH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_COLLECTION_COUNT "(" number_argument_array ")"
  public static boolean FunCollectionCount(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCollectionCount")) return false;
    if (!nextTokenIs(b, F_COLLECTION_COUNT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COLLECTION_COUNT, null);
    r = consumeTokens(b, 2, F_COLLECTION_COUNT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_COLLECTIONS "(" ")"
  public static boolean FunCollections(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCollections")) return false;
    if (!nextTokenIs(b, F_COLLECTIONS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COLLECTIONS, null);
    r = consumeTokens(b, 2, F_COLLECTIONS, T_OPEN, T_CLOSE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_CONCAT "(" AnyType+ ")"
  public static boolean FunConcat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunConcat")) return false;
    if (!nextTokenIs(b, F_CONCAT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CONCAT, null);
    r = consumeTokens(b, 2, F_CONCAT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunConcat_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnyType+
  private static boolean FunConcat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunConcat_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyType(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AnyType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunConcat_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_CONCAT_SEPARATOR "(" string_argument "," ExpressionArray+ ")"
  public static boolean FunConcatSeparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunConcatSeparator")) return false;
    if (!nextTokenIs(b, F_CONCAT_SEPARATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CONCAT_SEPARATOR, null);
    r = consumeTokens(b, 2, F_CONCAT_SEPARATOR, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunConcatSeparator_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionArray+
  private static boolean FunConcatSeparator_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunConcatSeparator_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionArray(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ExpressionArray(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunConcatSeparator_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_CONTAINS "(" string_argument "," string_argument ("," boolean_argument)? ")"
  public static boolean FunContains(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunContains")) return false;
    if (!nextTokenIs(b, F_CONTAINS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CONTAINS, null);
    r = consumeTokens(b, 2, F_CONTAINS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunContains_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunContains_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunContains_5")) return false;
    FunContains_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunContains_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunContains_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_CONTAINS_ARRAY  "(" number_argument_array "," expression_argument ("," boolean_argument)? ")"
  public static boolean FunContainsArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunContainsArray")) return false;
    if (!nextTokenIs(b, F_CONTAINS_ARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CONTAINS_ARRAY, null);
    r = consumeTokens(b, 2, F_CONTAINS_ARRAY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, expression_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunContainsArray_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunContainsArray_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunContainsArray_5")) return false;
    FunContainsArray_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunContainsArray_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunContainsArray_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_COS "(" number_argument ")"
  public static boolean FunCos(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCos")) return false;
    if (!nextTokenIs(b, F_COS)) return false;
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
  // F_COUNT  "(" number_argument_array ")"
  public static boolean FunCount(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCount")) return false;
    if (!nextTokenIs(b, F_COUNT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COUNT, null);
    r = consumeTokens(b, 2, F_COUNT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_COUNT_DISTINCT  "(" number_argument_array ")"
  public static boolean FunCountDistinct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCountDistinct")) return false;
    if (!nextTokenIs(b, F_COUNT_DISTINCT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COUNT_DISTINCT, null);
    r = consumeTokens(b, 2, F_COUNT_DISTINCT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_COUNT_UNIQUE  "(" number_argument_array ")"
  public static boolean FunCountUnique(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCountUnique")) return false;
    if (!nextTokenIs(b, F_COUNT_UNIQUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COUNT_UNIQUE, null);
    r = consumeTokens(b, 2, F_COUNT_UNIQUE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_CURRENT_DATABASE "("  ")"
  public static boolean FunCurrentDatabase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCurrentDatabase")) return false;
    if (!nextTokenIs(b, F_CURRENT_DATABASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CURRENT_DATABASE, null);
    r = consumeTokens(b, 2, F_CURRENT_DATABASE, T_OPEN, T_CLOSE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_CURRENT_USER "(" ")"
  public static boolean FunCurrentUser(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunCurrentUser")) return false;
    if (!nextTokenIs(b, F_CURRENT_USER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CURRENT_USER, null);
    r = consumeTokens(b, 2, F_CURRENT_USER, T_OPEN, T_CLOSE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_ADD "("  date_argument "," integer_argument | string_argument "," DateUnit")"
  public static boolean FunDateAdd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateAdd")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_ADD, "<fun date add>");
    r = FunDateAdd_0(b, l + 1);
    if (!r) r = FunDateAdd_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_DATE_ADD "("  date_argument "," integer_argument
  private static boolean FunDateAdd_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateAdd_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_DATE_ADD, T_OPEN);
    r = r && date_argument(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string_argument "," DateUnit")"
  private static boolean FunDateAdd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateAdd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_argument(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && DateUnit(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_DATE_COMPARE "("  date_argument "," date_argument "," DateUnit ("," DateUnit)? ")"
  public static boolean FunDateCompare(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateCompare")) return false;
    if (!nextTokenIs(b, F_DATE_COMPARE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_COMPARE, null);
    r = consumeTokens(b, 2, F_DATE_COMPARE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, date_argument(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, DateUnit(b, l + 1)) && r;
    r = p && report_error_(b, FunDateCompare_7(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," DateUnit)?
  private static boolean FunDateCompare_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateCompare_7")) return false;
    FunDateCompare_7_0(b, l + 1);
    return true;
  }

  // "," DateUnit
  private static boolean FunDateCompare_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateCompare_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && DateUnit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_DATE_DAY "("  date_argument ")"
  public static boolean FunDateDay(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateDay")) return false;
    if (!nextTokenIs(b, F_DATE_DAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_DAY, null);
    r = consumeTokens(b, 2, F_DATE_DAY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_DAYOFYEAR "("  date_argument ")"
  public static boolean FunDateDayOfYear(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateDayOfYear")) return false;
    if (!nextTokenIs(b, F_DATE_DAYOFYEAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_DAY_OF_YEAR, null);
    r = consumeTokens(b, 2, F_DATE_DAYOFYEAR, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_DAYS_IN_MONTH "("  date_argument ")"
  public static boolean FunDateDaysInMonth(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateDaysInMonth")) return false;
    if (!nextTokenIs(b, F_DATE_DAYS_IN_MONTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_DAYS_IN_MONTH, null);
    r = consumeTokens(b, 2, F_DATE_DAYS_IN_MONTH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_DIFF "("  date_argument "," date_argument "," DateUnit ("," boolean_argument)? ")"
  public static boolean FunDateDiff(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateDiff")) return false;
    if (!nextTokenIs(b, F_DATE_DIFF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_DIFF, null);
    r = consumeTokens(b, 2, F_DATE_DIFF, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, date_argument(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, DateUnit(b, l + 1)) && r;
    r = p && report_error_(b, FunDateDiff_7(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunDateDiff_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateDiff_7")) return false;
    FunDateDiff_7_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunDateDiff_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateDiff_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_DATE_FORMAT "("  date_argument "," string_argument ")"
  public static boolean FunDateFormat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateFormat")) return false;
    if (!nextTokenIs(b, F_DATE_FORMAT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_FORMAT, null);
    r = consumeTokens(b, 2, F_DATE_FORMAT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_HOUR "("  date_argument ")"
  public static boolean FunDateHour(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateHour")) return false;
    if (!nextTokenIs(b, F_DATE_HOUR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_HOUR, null);
    r = consumeTokens(b, 2, F_DATE_HOUR, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_ISO8601 "(" date_argument | integer_argument_array ")"
  public static boolean FunDateISO8601(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateISO8601")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_ISO_8601, "<fun date iso 8601>");
    r = FunDateISO8601_0(b, l + 1);
    if (!r) r = FunDateISO8601_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_DATE_ISO8601 "(" date_argument
  private static boolean FunDateISO8601_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateISO8601_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_DATE_ISO8601, T_OPEN);
    r = r && date_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer_argument_array ")"
  private static boolean FunDateISO8601_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateISO8601_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer_argument_array(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_DATE_ISOWEEK "("  date_argument ")"
  public static boolean FunDateIsoWeek(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateIsoWeek")) return false;
    if (!nextTokenIs(b, F_DATE_ISOWEEK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_ISO_WEEK, null);
    r = consumeTokens(b, 2, F_DATE_ISOWEEK, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_LEAPYEAR "("  date_argument ")"
  public static boolean FunDateLeapYear(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateLeapYear")) return false;
    if (!nextTokenIs(b, F_DATE_LEAPYEAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_LEAP_YEAR, null);
    r = consumeTokens(b, 2, F_DATE_LEAPYEAR, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_MILLISECOND "("  date_argument ")"
  public static boolean FunDateMillisecond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateMillisecond")) return false;
    if (!nextTokenIs(b, F_DATE_MILLISECOND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_MILLISECOND, null);
    r = consumeTokens(b, 2, F_DATE_MILLISECOND, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_MINUTE "("  date_argument ")"
  public static boolean FunDateMinute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateMinute")) return false;
    if (!nextTokenIs(b, F_DATE_MINUTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_MINUTE, null);
    r = consumeTokens(b, 2, F_DATE_MINUTE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_MONTH "("  date_argument ")"
  public static boolean FunDateMonth(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateMonth")) return false;
    if (!nextTokenIs(b, F_DATE_MONTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_MONTH, null);
    r = consumeTokens(b, 2, F_DATE_MONTH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_NOW "("  ")"
  public static boolean FunDateNow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateNow")) return false;
    if (!nextTokenIs(b, F_DATE_NOW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_NOW, null);
    r = consumeTokens(b, 2, F_DATE_NOW, T_OPEN, T_CLOSE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_DAYOFWEEK "("  date_argument ")"
  public static boolean FunDateOfWeek(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateOfWeek")) return false;
    if (!nextTokenIs(b, F_DATE_DAYOFWEEK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_OF_WEEK, null);
    r = consumeTokens(b, 2, F_DATE_DAYOFWEEK, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_QUARTER "("  date_argument ")"
  public static boolean FunDateQuarter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateQuarter")) return false;
    if (!nextTokenIs(b, F_DATE_QUARTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_QUARTER, null);
    r = consumeTokens(b, 2, F_DATE_QUARTER, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_SECOND "("  date_argument ")"
  public static boolean FunDateSecond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateSecond")) return false;
    if (!nextTokenIs(b, F_DATE_SECOND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_SECOND, null);
    r = consumeTokens(b, 2, F_DATE_SECOND, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_SUBTRACT "("  date_argument "," integer_argument | string_argument "," DateUnit")"
  public static boolean FunDateSubtract(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateSubtract")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_SUBTRACT, "<fun date subtract>");
    r = FunDateSubtract_0(b, l + 1);
    if (!r) r = FunDateSubtract_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_DATE_SUBTRACT "("  date_argument "," integer_argument
  private static boolean FunDateSubtract_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateSubtract_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_DATE_SUBTRACT, T_OPEN);
    r = r && date_argument(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string_argument "," DateUnit")"
  private static boolean FunDateSubtract_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateSubtract_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_argument(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && DateUnit(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_DATE_TIMESTAMP "("  date_argument | integer_argument_array ")"
  public static boolean FunDateTimeStamp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateTimeStamp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_TIME_STAMP, "<fun date time stamp>");
    r = FunDateTimeStamp_0(b, l + 1);
    if (!r) r = FunDateTimeStamp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_DATE_TIMESTAMP "("  date_argument
  private static boolean FunDateTimeStamp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateTimeStamp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_DATE_TIMESTAMP, T_OPEN);
    r = r && date_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer_argument_array ")"
  private static boolean FunDateTimeStamp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateTimeStamp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer_argument_array(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_DATE_TRUNC "("  date_argument "," DateUnit ")"
  public static boolean FunDateTrunc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateTrunc")) return false;
    if (!nextTokenIs(b, F_DATE_TRUNC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_TRUNC, null);
    r = consumeTokens(b, 2, F_DATE_TRUNC, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, DateUnit(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DATE_YEAR "("  date_argument ")"
  public static boolean FunDateYear(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDateYear")) return false;
    if (!nextTokenIs(b, F_DATE_YEAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DATE_YEAR, null);
    r = consumeTokens(b, 2, F_DATE_YEAR, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, date_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DEGREES  "(" number_argument ")"
  public static boolean FunDegrees(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDegrees")) return false;
    if (!nextTokenIs(b, F_DEGREES)) return false;
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
  // F_DISTANCE "(" NumberType "," NumberType "," NumberType "," NumberType ")"
  public static boolean FunDistance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDistance")) return false;
    if (!nextTokenIs(b, F_DISTANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DISTANCE, null);
    r = consumeTokens(b, 2, F_DISTANCE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, NumberType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, NumberType(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, NumberType(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, NumberType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_DOCUMENT "(" property_name "," StringType | ArrayType ")"
  public static boolean FunDocument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDocument")) return false;
    if (!nextTokenIs(b, "<fun document>", F_DOCUMENT, T_ARRAY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_DOCUMENT, "<fun document>");
    r = FunDocument_0(b, l + 1);
    if (!r) r = FunDocument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_DOCUMENT "(" property_name "," StringType
  private static boolean FunDocument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDocument_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_DOCUMENT, T_OPEN);
    r = r && property_name(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayType ")"
  private static boolean FunDocument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunDocument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_ENCODE_URI_COMPONENT "(" string_argument ")"
  public static boolean FunEncodeUriComponent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunEncodeUriComponent")) return false;
    if (!nextTokenIs(b, F_ENCODE_URI_COMPONENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ENCODE_URI_COMPONENT, null);
    r = consumeTokens(b, 2, F_ENCODE_URI_COMPONENT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_EXISTS "(" PropertyName property_lookup ("," string_argument)? ","  AnyType ")"
  public static boolean FunExists(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunExists")) return false;
    if (!nextTokenIs(b, F_EXISTS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_EXISTS, null);
    r = consumeTokens(b, 2, F_EXISTS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, PropertyName(b, l + 1));
    r = p && report_error_(b, property_lookup(b, l + 1)) && r;
    r = p && report_error_(b, FunExists_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, AnyType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," string_argument)?
  private static boolean FunExists_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunExists_4")) return false;
    FunExists_4_0(b, l + 1);
    return true;
  }

  // "," string_argument
  private static boolean FunExists_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunExists_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_EXP  "(" number_argument ")"
  public static boolean FunExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunExp")) return false;
    if (!nextTokenIs(b, F_EXP)) return false;
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
    if (!recursion_guard_(b, l, "FunExp2")) return false;
    if (!nextTokenIs(b, F_EXP2)) return false;
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
  // F_FAIL "(" StringType ")"
  public static boolean FunFail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFail")) return false;
    if (!nextTokenIs(b, F_FAIL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FAIL, null);
    r = consumeTokens(b, 2, F_FAIL, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, StringType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_FIND_FIRST "(" string_argument "," string_argument ("," integer_argument)* ")"
  public static boolean FunFindFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFindFirst")) return false;
    if (!nextTokenIs(b, F_FIND_FIRST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FIND_FIRST, null);
    r = consumeTokens(b, 2, F_FIND_FIRST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunFindFirst_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," integer_argument)*
  private static boolean FunFindFirst_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFindFirst_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunFindFirst_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunFindFirst_5", c)) break;
    }
    return true;
  }

  // "," integer_argument
  private static boolean FunFindFirst_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFindFirst_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_FIND_LAST "(" string_argument "," string_argument ("," integer_argument)* ")"
  public static boolean FunFindLast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFindLast")) return false;
    if (!nextTokenIs(b, F_FIND_LAST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FIND_LAST, null);
    r = consumeTokens(b, 2, F_FIND_LAST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunFindLast_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," integer_argument)*
  private static boolean FunFindLast_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFindLast_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunFindLast_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunFindLast_5", c)) break;
    }
    return true;
  }

  // "," integer_argument
  private static boolean FunFindLast_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFindLast_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_FIRST  "(" number_argument_array ")"
  public static boolean FunFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirst")) return false;
    if (!nextTokenIs(b, F_FIRST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FIRST, null);
    r = consumeTokens(b, 2, F_FIRST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_FIRST_DOCUMENT "(" AnyType ("," AnyType)* ")"
  public static boolean FunFirstDocument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirstDocument")) return false;
    if (!nextTokenIs(b, F_FIRST_DOCUMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FIRST_DOCUMENT, null);
    r = consumeTokens(b, 2, F_FIRST_DOCUMENT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, FunFirstDocument_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," AnyType)*
  private static boolean FunFirstDocument_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirstDocument_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunFirstDocument_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunFirstDocument_3", c)) break;
    }
    return true;
  }

  // "," AnyType
  private static boolean FunFirstDocument_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirstDocument_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AnyType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_FIRST_LIST "(" AnyType ("," AnyType)* ")"
  public static boolean FunFirstList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirstList")) return false;
    if (!nextTokenIs(b, F_FIRST_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FIRST_LIST, null);
    r = consumeTokens(b, 2, F_FIRST_LIST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, FunFirstList_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," AnyType)*
  private static boolean FunFirstList_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirstList_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunFirstList_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunFirstList_3", c)) break;
    }
    return true;
  }

  // "," AnyType
  private static boolean FunFirstList_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFirstList_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AnyType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_FLATTEN  "(" number_argument_array ("," IntegerType)? ")"
  public static boolean FunFlatten(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFlatten")) return false;
    if (!nextTokenIs(b, F_FLATTEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FLATTEN, null);
    r = consumeTokens(b, 2, F_FLATTEN, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, FunFlatten_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," IntegerType)?
  private static boolean FunFlatten_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFlatten_3")) return false;
    FunFlatten_3_0(b, l + 1);
    return true;
  }

  // "," IntegerType
  private static boolean FunFlatten_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFlatten_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_FLOOR  "(" number_argument ")"
  public static boolean FunFloor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFloor")) return false;
    if (!nextTokenIs(b, F_FLOOR)) return false;
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
  // F_FULLTEXT "(" possible_array "," string_argument  "," string_argument  ("," integer_argument)? ")"
  public static boolean FunFullText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFullText")) return false;
    if (!nextTokenIs(b, F_FULLTEXT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FULL_TEXT, null);
    r = consumeTokens(b, 2, F_FULLTEXT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, possible_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunFullText_7(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," integer_argument)?
  private static boolean FunFullText_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFullText_7")) return false;
    FunFullText_7_0(b, l + 1);
    return true;
  }

  // "," integer_argument
  private static boolean FunFullText_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunFullText_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_GEO_CONTAINS "(" JsonType "," JsonType ")"
  public static boolean FunGeoContains(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoContains")) return false;
    if (!nextTokenIs(b, F_GEO_CONTAINS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_CONTAINS, null);
    r = consumeTokens(b, 2, F_GEO_CONTAINS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, JsonType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, JsonType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_GEO_DISTANCE"(" JsonType "," JsonType ")"
  public static boolean FunGeoDistance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoDistance")) return false;
    if (!nextTokenIs(b, F_GEO_DISTANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_DISTANCE, null);
    r = consumeTokens(b, 2, F_GEO_DISTANCE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, JsonType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, JsonType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_GEO_EQUALS"(" JsonType "," JsonType ")"
  public static boolean FunGeoEquals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoEquals")) return false;
    if (!nextTokenIs(b, F_GEO_EQUALS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_EQUALS, null);
    r = consumeTokens(b, 2, F_GEO_EQUALS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, JsonType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, JsonType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_GEO_INTERSECTS"(" JsonType "," JsonType ")"
  public static boolean FunGeoIntersects(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoIntersects")) return false;
    if (!nextTokenIs(b, F_GEO_INTERSECTS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_INTERSECTS, null);
    r = consumeTokens(b, 2, F_GEO_INTERSECTS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, JsonType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, JsonType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_GEO_LINESTRING "(" ArrayType ("," ArrayType)* ")"
  public static boolean FunGeoLineString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoLineString")) return false;
    if (!nextTokenIs(b, F_GEO_LINESTRING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_LINE_STRING, null);
    r = consumeTokens(b, 2, F_GEO_LINESTRING, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, ArrayType(b, l + 1));
    r = p && report_error_(b, FunGeoLineString_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," ArrayType)*
  private static boolean FunGeoLineString_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoLineString_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunGeoLineString_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunGeoLineString_3", c)) break;
    }
    return true;
  }

  // "," ArrayType
  private static boolean FunGeoLineString_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoLineString_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ArrayType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_GEO_MULTILINESTRING "(" ArrayType ("," ArrayType)* ")"
  public static boolean FunGeoMultiLineString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoMultiLineString")) return false;
    if (!nextTokenIs(b, F_GEO_MULTILINESTRING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_MULTI_LINE_STRING, null);
    r = consumeTokens(b, 2, F_GEO_MULTILINESTRING, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, ArrayType(b, l + 1));
    r = p && report_error_(b, FunGeoMultiLineString_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," ArrayType)*
  private static boolean FunGeoMultiLineString_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoMultiLineString_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunGeoMultiLineString_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunGeoMultiLineString_3", c)) break;
    }
    return true;
  }

  // "," ArrayType
  private static boolean FunGeoMultiLineString_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoMultiLineString_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ArrayType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_GEO_MULTIPOINT "(" ArrayType ("," ArrayType)* ")"
  public static boolean FunGeoMultiPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoMultiPoint")) return false;
    if (!nextTokenIs(b, F_GEO_MULTIPOINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_MULTI_POINT, null);
    r = consumeTokens(b, 2, F_GEO_MULTIPOINT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, ArrayType(b, l + 1));
    r = p && report_error_(b, FunGeoMultiPoint_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," ArrayType)*
  private static boolean FunGeoMultiPoint_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoMultiPoint_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunGeoMultiPoint_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunGeoMultiPoint_3", c)) break;
    }
    return true;
  }

  // "," ArrayType
  private static boolean FunGeoMultiPoint_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoMultiPoint_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ArrayType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_GEO_POINT "(" NumberType "," NumberType ")"
  public static boolean FunGeoPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoPoint")) return false;
    if (!nextTokenIs(b, F_GEO_POINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_POINT, null);
    r = consumeTokens(b, 2, F_GEO_POINT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, NumberType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, NumberType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_GEO_POLYGON "(" ArrayType ("," ArrayType)* ")"
  public static boolean FunGeoPolygon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoPolygon")) return false;
    if (!nextTokenIs(b, F_GEO_POLYGON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_GEO_POLYGON, null);
    r = consumeTokens(b, 2, F_GEO_POLYGON, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, ArrayType(b, l + 1));
    r = p && report_error_(b, FunGeoPolygon_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," ArrayType)*
  private static boolean FunGeoPolygon_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoPolygon_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunGeoPolygon_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunGeoPolygon_3", c)) break;
    }
    return true;
  }

  // "," ArrayType
  private static boolean FunGeoPolygon_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunGeoPolygon_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ArrayType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_HAS  "(" document_argument ("," ExpressionType)? ")"
  public static boolean FunHas(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunHas")) return false;
    if (!nextTokenIs(b, F_HAS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_HAS, null);
    r = consumeTokens(b, 2, F_HAS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, FunHas_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," ExpressionType)?
  private static boolean FunHas_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunHas_3")) return false;
    FunHas_3_0(b, l + 1);
    return true;
  }

  // "," ExpressionType
  private static boolean FunHas_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunHas_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ExpressionType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_HASH "(" AnyType ")"
  public static boolean FunHash(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunHash")) return false;
    if (!nextTokenIs(b, F_HASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_HASH, null);
    r = consumeTokens(b, 2, F_HASH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_INTERSECTION  "(" (number_argument_array)+ ")"
  public static boolean FunInterSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunInterSection")) return false;
    if (!nextTokenIs(b, F_INTERSECTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_INTER_SECTION, null);
    r = consumeTokens(b, 2, F_INTERSECTION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunInterSection_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)+
  private static boolean FunInterSection_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunInterSection_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunInterSection_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunInterSection_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunInterSection_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunInterSection_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunInterSection_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_IS_ARRAY "(" AnyType ")"
  public static boolean FunIsArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsArray")) return false;
    if (!nextTokenIs(b, F_IS_ARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_ARRAY, null);
    r = consumeTokens(b, 2, F_IS_ARRAY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_BOOL "(" AnyType ")"
  public static boolean FunIsBool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsBool")) return false;
    if (!nextTokenIs(b, F_IS_BOOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_BOOL, null);
    r = consumeTokens(b, 2, F_IS_BOOL, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_DATESTRING "("  AnyType ")"
  public static boolean FunIsDateString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsDateString")) return false;
    if (!nextTokenIs(b, F_IS_DATESTRING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_DATE_STRING, null);
    r = consumeTokens(b, 2, F_IS_DATESTRING, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_DOCUMENT "(" AnyType ")"
  public static boolean FunIsDocument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsDocument")) return false;
    if (!nextTokenIs(b, F_IS_DOCUMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_DOCUMENT, null);
    r = consumeTokens(b, 2, F_IS_DOCUMENT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_KEY "(" AnyType ")"
  public static boolean FunIsKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsKey")) return false;
    if (!nextTokenIs(b, F_IS_KEY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_KEY, null);
    r = consumeTokens(b, 2, F_IS_KEY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_LIST "(" AnyType ")"
  public static boolean FunIsList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsList")) return false;
    if (!nextTokenIs(b, F_IS_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_LIST, null);
    r = consumeTokens(b, 2, F_IS_LIST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_NULL "(" AnyType ")"
  public static boolean FunIsNull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsNull")) return false;
    if (!nextTokenIs(b, F_IS_NULL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_NULL, null);
    r = consumeTokens(b, 2, F_IS_NULL, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_NUMBER "(" AnyType ")"
  public static boolean FunIsNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsNumber")) return false;
    if (!nextTokenIs(b, F_IS_NUMBER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_NUMBER, null);
    r = consumeTokens(b, 2, F_IS_NUMBER, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_OBJECT "(" AnyType ")"
  public static boolean FunIsObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsObject")) return false;
    if (!nextTokenIs(b, F_IS_OBJECT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_OBJECT, null);
    r = consumeTokens(b, 2, F_IS_OBJECT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_IS_SAME_COLLECTION  "(" StringType ("," document_argument )? ")"
  public static boolean FunIsSameCollection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsSameCollection")) return false;
    if (!nextTokenIs(b, F_IS_SAME_COLLECTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_SAME_COLLECTION, null);
    r = consumeTokens(b, 2, F_IS_SAME_COLLECTION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, StringType(b, l + 1));
    r = p && report_error_(b, FunIsSameCollection_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," document_argument )?
  private static boolean FunIsSameCollection_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsSameCollection_3")) return false;
    FunIsSameCollection_3_0(b, l + 1);
    return true;
  }

  // "," document_argument
  private static boolean FunIsSameCollection_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsSameCollection_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && document_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_IS_STRING "(" AnyType ")"
  public static boolean FunIsString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunIsString")) return false;
    if (!nextTokenIs(b, F_IS_STRING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_IS_STRING, null);
    r = consumeTokens(b, 2, F_IS_STRING, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_JSON_PARSE "(" string_argument ")"
  public static boolean FunJsonParse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunJsonParse")) return false;
    if (!nextTokenIs(b, F_JSON_PARSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_JSON_PARSE, null);
    r = consumeTokens(b, 2, F_JSON_PARSE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_JSON_STRINGIFY "(" AnyType ")"
  public static boolean FunJsonStringify(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunJsonStringify")) return false;
    if (!nextTokenIs(b, F_JSON_STRINGIFY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_JSON_STRINGIFY, null);
    r = consumeTokens(b, 2, F_JSON_STRINGIFY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_KEEP  "(" document_argument "," (string_list | string_argument_array | possible_array )  ")"
  public static boolean FunKeep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunKeep")) return false;
    if (!nextTokenIs(b, F_KEEP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_KEEP, null);
    r = consumeTokens(b, 2, F_KEEP, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunKeep_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // string_list | string_argument_array | possible_array
  private static boolean FunKeep_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunKeep_4")) return false;
    boolean r;
    r = string_list(b, l + 1);
    if (!r) r = string_argument_array(b, l + 1);
    if (!r) r = possible_array(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // F_KEYS "(" AnyType ")"
  public static boolean FunKeys(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunKeys")) return false;
    if (!nextTokenIs(b, F_KEYS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_KEYS, null);
    r = consumeTokens(b, 2, F_KEYS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LAST  "(" number_argument_array ")"
  public static boolean FunLast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLast")) return false;
    if (!nextTokenIs(b, F_LAST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LAST, null);
    r = consumeTokens(b, 2, F_LAST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LEFT "(" string_argument "," integer_argument ")"
  public static boolean FunLeft(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLeft")) return false;
    if (!nextTokenIs(b, F_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LEFT, null);
    r = consumeTokens(b, 2, F_LEFT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, integer_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LENGTH  "(" number_argument_array | document_argument | string_argument ")"
  public static boolean FunLength(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLength")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_LENGTH, "<fun length>");
    r = FunLength_0(b, l + 1);
    if (!r) r = document_argument(b, l + 1);
    if (!r) r = FunLength_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_LENGTH  "(" number_argument_array
  private static boolean FunLength_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLength_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_LENGTH, T_OPEN);
    r = r && number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string_argument ")"
  private static boolean FunLength_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLength_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_argument(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_LEVENSHTEIN_DISTANCE "(" string_argument "," string_argument ")"
  public static boolean FunLevenshteinDistance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLevenshteinDistance")) return false;
    if (!nextTokenIs(b, F_LEVENSHTEIN_DISTANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LEVENSHTEIN_DISTANCE, null);
    r = consumeTokens(b, 2, F_LEVENSHTEIN_DISTANCE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LIKE "(" string_argument "," string_argument ("," boolean_argument)? ")"
  public static boolean FunLike(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLike")) return false;
    if (!nextTokenIs(b, F_LIKE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LIKE, null);
    r = consumeTokens(b, 2, F_LIKE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunLike_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunLike_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLike_5")) return false;
    FunLike_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunLike_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLike_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_LOG  "(" number_argument ")"
  public static boolean FunLog(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLog")) return false;
    if (!nextTokenIs(b, F_LOG)) return false;
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
    if (!recursion_guard_(b, l, "FunLog10")) return false;
    if (!nextTokenIs(b, F_LOG10)) return false;
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
    if (!recursion_guard_(b, l, "FunLog2")) return false;
    if (!nextTokenIs(b, F_LOG2)) return false;
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
  // F_LOWER "(" string_argument ")"
  public static boolean FunLower(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLower")) return false;
    if (!nextTokenIs(b, F_LOWER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOWER, null);
    r = consumeTokens(b, 2, F_LOWER, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LTRIM "(" string_argument ("," string_argument)?")"
  public static boolean FunLtrim(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLtrim")) return false;
    if (!nextTokenIs(b, F_LTRIM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LTRIM, null);
    r = consumeTokens(b, 2, F_LTRIM, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, FunLtrim_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," string_argument)?
  private static boolean FunLtrim_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLtrim_3")) return false;
    FunLtrim_3_0(b, l + 1);
    return true;
  }

  // "," string_argument
  private static boolean FunLtrim_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunLtrim_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_MATCHES  "(" document_argument "," (expression_argument | JsonType) ("," boolean_argument)?")"
  public static boolean FunMatches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMatches")) return false;
    if (!nextTokenIs(b, F_MATCHES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MATCHES, null);
    r = consumeTokens(b, 2, F_MATCHES, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunMatches_4(b, l + 1)) && r;
    r = p && report_error_(b, FunMatches_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expression_argument | JsonType
  private static boolean FunMatches_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMatches_4")) return false;
    boolean r;
    r = expression_argument(b, l + 1);
    if (!r) r = JsonType(b, l + 1);
    return r;
  }

  // ("," boolean_argument)?
  private static boolean FunMatches_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMatches_5")) return false;
    FunMatches_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunMatches_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMatches_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_MAX  "(" number_argument_array ")"
  public static boolean FunMax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMax")) return false;
    if (!nextTokenIs(b, F_MAX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MAX, null);
    r = consumeTokens(b, 2, F_MAX, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MD5 "(" string_argument ")"
  public static boolean FunMd5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMd5")) return false;
    if (!nextTokenIs(b, F_MD5)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MD_5, null);
    r = consumeTokens(b, 2, F_MD5, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MEDIAN  "(" number_argument_array ")"
  public static boolean FunMedian(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMedian")) return false;
    if (!nextTokenIs(b, F_MEDIAN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MEDIAN, null);
    r = consumeTokens(b, 2, F_MEDIAN, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MERGE  "(" document_argument "," (document_argument)* ")"
  public static boolean FunMerge(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMerge")) return false;
    if (!nextTokenIs(b, F_MERGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MERGE, null);
    r = consumeTokens(b, 2, F_MERGE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunMerge_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (document_argument)*
  private static boolean FunMerge_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMerge_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunMerge_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunMerge_4", c)) break;
    }
    return true;
  }

  // (document_argument)
  private static boolean FunMerge_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMerge_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = document_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_MERGE_RECURSIVE  "(" document_argument "," (document_argument)* ")"
  public static boolean FunMergeRecursive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMergeRecursive")) return false;
    if (!nextTokenIs(b, F_MERGE_RECURSIVE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MERGE_RECURSIVE, null);
    r = consumeTokens(b, 2, F_MERGE_RECURSIVE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunMergeRecursive_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (document_argument)*
  private static boolean FunMergeRecursive_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMergeRecursive_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunMergeRecursive_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunMergeRecursive_4", c)) break;
    }
    return true;
  }

  // (document_argument)
  private static boolean FunMergeRecursive_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMergeRecursive_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = document_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_MIN  "(" number_argument_array ")"
  public static boolean FunMin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMin")) return false;
    if (!nextTokenIs(b, F_MIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MIN, null);
    r = consumeTokens(b, 2, F_MIN, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MIN_MATCH "(" AnyType  "," integer_argument ")"
  public static boolean FunMinMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMinMatch")) return false;
    if (!nextTokenIs(b, F_MIN_MATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MIN_MATCH, null);
    r = consumeTokens(b, 2, F_MIN_MATCH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, integer_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_MINUS  "(" (number_argument_array)+ ")"
  public static boolean FunMinus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMinus")) return false;
    if (!nextTokenIs(b, F_MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MINUS, null);
    r = consumeTokens(b, 2, F_MINUS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunMinus_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)+
  private static boolean FunMinus_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMinus_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunMinus_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunMinus_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunMinus_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunMinus_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunMinus_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_NTH  "(" (number_argument_array) "," IntegerType ")"
  public static boolean FunNTH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNTH")) return false;
    if (!nextTokenIs(b, F_NTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_NTH, null);
    r = consumeTokens(b, 2, F_NTH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunNTH_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, IntegerType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)
  private static boolean FunNTH_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNTH_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_NOOPT "(" AnyType ")"
  public static boolean FunNoopt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNoopt")) return false;
    if (!nextTokenIs(b, F_NOOPT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_NOOPT, null);
    r = consumeTokens(b, 2, F_NOOPT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_NOT_NULL "(" AnyType ("," AnyType)* ")"
  public static boolean FunNotNull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNotNull")) return false;
    if (!nextTokenIs(b, F_NOT_NULL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_NOT_NULL, null);
    r = consumeTokens(b, 2, F_NOT_NULL, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, FunNotNull_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," AnyType)*
  private static boolean FunNotNull_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNotNull_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunNotNull_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunNotNull_3", c)) break;
    }
    return true;
  }

  // "," AnyType
  private static boolean FunNotNull_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNotNull_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AnyType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_OUTERSECTION  "(" (number_argument_array)+ ")"
  public static boolean FunOuterSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunOuterSection")) return false;
    if (!nextTokenIs(b, F_OUTERSECTION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_OUTER_SECTION, null);
    r = consumeTokens(b, 2, F_OUTERSECTION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunOuterSection_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)+
  private static boolean FunOuterSection_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunOuterSection_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunOuterSection_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunOuterSection_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunOuterSection_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunOuterSection_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunOuterSection_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_PARSE_IDENTIFIER  "(" StringType | document_argument  ")"
  public static boolean FunParseIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunParseIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_PARSE_IDENTIFIER, "<fun parse identifier>");
    r = FunParseIdentifier_0(b, l + 1);
    if (!r) r = FunParseIdentifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_PARSE_IDENTIFIER  "(" StringType
  private static boolean FunParseIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunParseIdentifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_PARSE_IDENTIFIER, T_OPEN);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // document_argument  ")"
  private static boolean FunParseIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunParseIdentifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = document_argument(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_PASSTHRU "(" AnyType ")"
  public static boolean FunPassThru(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPassThru")) return false;
    if (!nextTokenIs(b, F_PASSTHRU)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PASS_THRU, null);
    r = consumeTokens(b, 2, F_PASSTHRU, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_PERCENTILE  "(" number_argument_array "," IntegerType ("," StringType)? ")"
  public static boolean FunPercentile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPercentile")) return false;
    if (!nextTokenIs(b, F_PERCENTILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PERCENTILE, null);
    r = consumeTokens(b, 2, F_PERCENTILE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, IntegerType(b, l + 1)) && r;
    r = p && report_error_(b, FunPercentile_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," StringType)?
  private static boolean FunPercentile_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPercentile_5")) return false;
    FunPercentile_5_0(b, l + 1);
    return true;
  }

  // "," StringType
  private static boolean FunPercentile_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPercentile_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_PHRASE "(" PropertyName property_lookup ","  string_argument_array | number_argument_array ")"
  public static boolean FunPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPhrase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_PHRASE, "<fun phrase>");
    r = FunPhrase_0(b, l + 1);
    if (!r) r = FunPhrase_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_PHRASE "(" PropertyName property_lookup ","  string_argument_array
  private static boolean FunPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPhrase_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_PHRASE, T_OPEN);
    r = r && PropertyName(b, l + 1);
    r = r && property_lookup(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && string_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // number_argument_array ")"
  private static boolean FunPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPhrase_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_PI "(" ")"
  public static boolean FunPi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPi")) return false;
    if (!nextTokenIs(b, F_PI)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_PI, T_OPEN, T_CLOSE);
    exit_section_(b, m, FUN_PI, r);
    return r;
  }

  /* ********************************************************** */
  // F_POP  "(" (number_argument_array)+ ")"
  public static boolean FunPop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPop")) return false;
    if (!nextTokenIs(b, F_POP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_POP, null);
    r = consumeTokens(b, 2, F_POP, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunPop_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)+
  private static boolean FunPop_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPop_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunPop_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunPop_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunPop_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunPop_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPop_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_POSITION  "(" number_argument_array "," expression_argument ("," boolean_argument)? ")"
  public static boolean FunPosition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPosition")) return false;
    if (!nextTokenIs(b, F_POSITION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_POSITION, null);
    r = consumeTokens(b, 2, F_POSITION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, expression_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunPosition_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunPosition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPosition_5")) return false;
    FunPosition_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunPosition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPosition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_POW "(" number_argument "," number_argument ")"
  public static boolean FunPow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPow")) return false;
    if (!nextTokenIs(b, F_POW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_POW, null);
    r = consumeTokens(b, 2, F_POW, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, number_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_PREGEL_RESULT "(" AnyType ")"
  public static boolean FunPregelResult(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPregelResult")) return false;
    if (!nextTokenIs(b, F_PREGEL_RESULT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PREGEL_RESULT, null);
    r = consumeTokens(b, 2, F_PREGEL_RESULT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_PUSH  "(" number_argument_array "," expression_argument ("," boolean_argument)? ")"
  public static boolean FunPush(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPush")) return false;
    if (!nextTokenIs(b, F_PUSH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PUSH, null);
    r = consumeTokens(b, 2, F_PUSH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, expression_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunPush_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunPush_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPush_5")) return false;
    FunPush_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunPush_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunPush_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_RADIANS "(" number_argument ")"
  public static boolean FunRadians(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRadians")) return false;
    if (!nextTokenIs(b, F_RADIANS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RADIANS, null);
    r = consumeTokens(b, 2, F_RADIANS, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RAND "(" ")"
  public static boolean FunRand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRand")) return false;
    if (!nextTokenIs(b, F_RAND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_RAND, T_OPEN, T_CLOSE);
    exit_section_(b, m, FUN_RAND, r);
    return r;
  }

  /* ********************************************************** */
  // F_RANDOM_TOKEN "(" integer_argument ")"
  public static boolean FunRandomToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRandomToken")) return false;
    if (!nextTokenIs(b, F_RANDOM_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RANDOM_TOKEN, null);
    r = consumeTokens(b, 2, F_RANDOM_TOKEN, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, integer_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RANGE "(" number_argument "," number_argument ("," number_argument)? ")"
  public static boolean FunRange(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRange")) return false;
    if (!nextTokenIs(b, F_RANGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RANGE, null);
    r = consumeTokens(b, 2, F_RANGE, T_OPEN);
    p = r; // pin = 2
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
    if (!recursion_guard_(b, l, "FunRange_5")) return false;
    FunRange_5_0(b, l + 1);
    return true;
  }

  // "," number_argument
  private static boolean FunRange_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRange_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REGEX_MATCHES "(" string_argument "," string_argument ("," boolean_argument)?  ")"
  public static boolean FunRegexMatches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexMatches")) return false;
    if (!nextTokenIs(b, F_REGEX_MATCHES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_MATCHES, null);
    r = consumeTokens(b, 2, F_REGEX_MATCHES, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRegexMatches_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunRegexMatches_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexMatches_5")) return false;
    FunRegexMatches_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunRegexMatches_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexMatches_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REGEX_REPLACE "(" string_argument "," string_argument "," string_argument  ("," boolean_argument)? ")"
  public static boolean FunRegexReplace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexReplace")) return false;
    if (!nextTokenIs(b, F_REGEX_REPLACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_REPLACE, null);
    r = consumeTokens(b, 2, F_REGEX_REPLACE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRegexReplace_7(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunRegexReplace_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexReplace_7")) return false;
    FunRegexReplace_7_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunRegexReplace_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexReplace_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REGEX_SPLIT "(" string_argument "," string_argument "," boolean_argument ("," integer_argument)? ")"
  public static boolean FunRegexSplit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexSplit")) return false;
    if (!nextTokenIs(b, F_REGEX_SPLIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_SPLIT, null);
    r = consumeTokens(b, 2, F_REGEX_SPLIT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, boolean_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRegexSplit_7(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," integer_argument)?
  private static boolean FunRegexSplit_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexSplit_7")) return false;
    FunRegexSplit_7_0(b, l + 1);
    return true;
  }

  // "," integer_argument
  private static boolean FunRegexSplit_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexSplit_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REGEX_TEST "(" string_argument "," string_argument  ("," boolean_argument)? ")"
  public static boolean FunRegexTest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexTest")) return false;
    if (!nextTokenIs(b, F_REGEX_TEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_TEST, null);
    r = consumeTokens(b, 2, F_REGEX_TEST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRegexTest_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunRegexTest_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexTest_5")) return false;
    FunRegexTest_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunRegexTest_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRegexTest_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REMOVE_NTH  "(" (number_argument_array) "," IntegerType ")"
  public static boolean FunRemoveNTH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRemoveNTH")) return false;
    if (!nextTokenIs(b, F_REMOVE_NTH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REMOVE_NTH, null);
    r = consumeTokens(b, 2, F_REMOVE_NTH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunRemoveNTH_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, IntegerType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)
  private static boolean FunRemoveNTH_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRemoveNTH_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REMOVE_VALUE  "(" number_argument_array "," expression_argument ("," IntegerType)? ")"
  public static boolean FunRemoveValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRemoveValue")) return false;
    if (!nextTokenIs(b, F_REMOVE_VALUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REMOVE_VALUE, null);
    r = consumeTokens(b, 2, F_REMOVE_VALUE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, expression_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRemoveValue_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," IntegerType)?
  private static boolean FunRemoveValue_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRemoveValue_5")) return false;
    FunRemoveValue_5_0(b, l + 1);
    return true;
  }

  // "," IntegerType
  private static boolean FunRemoveValue_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRemoveValue_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_REMOVE_VALUES  "(" number_argument_array "," number_argument_array ")"
  public static boolean FunRemoveValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRemoveValues")) return false;
    if (!nextTokenIs(b, F_REMOVE_VALUES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_REMOVE_VALUES, null);
    r = consumeTokens(b, 2, F_REMOVE_VALUES, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, number_argument_array(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_REVERSE  "(" string_argument | (number_argument_array)+ ")"
  public static boolean FunReverse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunReverse")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_REVERSE, "<fun reverse>");
    r = FunReverse_0(b, l + 1);
    if (!r) r = FunReverse_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_REVERSE  "(" string_argument
  private static boolean FunReverse_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunReverse_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_REVERSE, T_OPEN);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)+ ")"
  private static boolean FunReverse_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunReverse_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunReverse_1_0(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)+
  private static boolean FunReverse_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunReverse_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunReverse_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunReverse_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunReverse_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunReverse_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunReverse_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_RIGHT "(" string_argument "," integer_argument ")"
  public static boolean FunRight(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRight")) return false;
    if (!nextTokenIs(b, F_RIGHT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RIGHT, null);
    r = consumeTokens(b, 2, F_RIGHT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, integer_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ROUND "(" number_argument ")"
  public static boolean FunRound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRound")) return false;
    if (!nextTokenIs(b, F_ROUND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ROUND, null);
    r = consumeTokens(b, 2, F_ROUND, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RTRIM "(" string_argument ("," string_argument)? ")"
  public static boolean FunRtrim(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRtrim")) return false;
    if (!nextTokenIs(b, F_RTRIM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RTRIM, null);
    r = consumeTokens(b, 2, F_RTRIM, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, FunRtrim_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," string_argument)?
  private static boolean FunRtrim_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRtrim_3")) return false;
    FunRtrim_3_0(b, l + 1);
    return true;
  }

  // "," string_argument
  private static boolean FunRtrim_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunRtrim_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_SQRT "(" number_argument ")"
  public static boolean FunSQRT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSQRT")) return false;
    if (!nextTokenIs(b, F_SQRT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SQRT, null);
    r = consumeTokens(b, 2, F_SQRT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SHA1 "(" string_argument  ")"
  public static boolean FunSha1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSha1")) return false;
    if (!nextTokenIs(b, F_SHA1)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SHA_1, null);
    r = consumeTokens(b, 2, F_SHA1, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SHA512 "(" string_argument  ")"
  public static boolean FunSha512(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSha512")) return false;
    if (!nextTokenIs(b, F_SHA512)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SHA_512, null);
    r = consumeTokens(b, 2, F_SHA512, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SHIFT  "(" number_argument_array ")"
  public static boolean FunShift(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunShift")) return false;
    if (!nextTokenIs(b, F_SHIFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SHIFT, null);
    r = consumeTokens(b, 2, F_SHIFT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SIN "(" number_argument ")"
  public static boolean FunSin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSin")) return false;
    if (!nextTokenIs(b, F_SIN)) return false;
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
  // F_SLEEP "(" IntegerType ")"
  public static boolean FunSleep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSleep")) return false;
    if (!nextTokenIs(b, F_SLEEP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SLEEP, null);
    r = consumeTokens(b, 2, F_SLEEP, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, IntegerType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SLICE  "(" ExpressionType "," IntegerType ("," IntegerType)? ")"
  public static boolean FunSlice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSlice")) return false;
    if (!nextTokenIs(b, F_SLICE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SLICE, null);
    r = consumeTokens(b, 1, F_SLICE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, ExpressionType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, IntegerType(b, l + 1)) && r;
    r = p && report_error_(b, FunSlice_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," IntegerType)?
  private static boolean FunSlice_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSlice_5")) return false;
    FunSlice_5_0(b, l + 1);
    return true;
  }

  // "," IntegerType
  private static boolean FunSlice_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSlice_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_SORTED  "(" number_argument_array ")"
  public static boolean FunSorted(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSorted")) return false;
    if (!nextTokenIs(b, F_SORTED)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SORTED, null);
    r = consumeTokens(b, 2, F_SORTED, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SORTED_UNIQUE  "(" number_argument_array ")"
  public static boolean FunSortedUnique(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSortedUnique")) return false;
    if (!nextTokenIs(b, F_SORTED_UNIQUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SORTED_UNIQUE, null);
    r = consumeTokens(b, 2, F_SORTED_UNIQUE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SOUNDEX "(" string_argument ")"
  public static boolean FunSoundex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSoundex")) return false;
    if (!nextTokenIs(b, F_SOUNDEX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SOUNDEX, null);
    r = consumeTokens(b, 2, F_SOUNDEX, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SPLIT "(" string_argument "," string_argument  ("," integer_argument)? ")"
  public static boolean FunSplit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSplit")) return false;
    if (!nextTokenIs(b, F_SPLIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SPLIT, null);
    r = consumeTokens(b, 2, F_SPLIT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunSplit_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," integer_argument)?
  private static boolean FunSplit_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSplit_5")) return false;
    FunSplit_5_0(b, l + 1);
    return true;
  }

  // "," integer_argument
  private static boolean FunSplit_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSplit_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_STARTS_WITH "(" PropertyName property_lookup "," string_argument ")"
  public static boolean FunStartsWith(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunStartsWith")) return false;
    if (!nextTokenIs(b, F_STARTS_WITH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STARTS_WITH, null);
    r = consumeTokens(b, 2, F_STARTS_WITH, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, PropertyName(b, l + 1));
    r = p && report_error_(b, property_lookup(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, string_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_STDDEV_SAMPLE "(" number_argument_array ")"
  public static boolean FunStdDevSample(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunStdDevSample")) return false;
    if (!nextTokenIs(b, F_STDDEV_SAMPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STD_DEV_SAMPLE, null);
    r = consumeTokens(b, 1, F_STDDEV_SAMPLE, T_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_STDDEV "(" number_argument_array ")"
  public static boolean FunStddev(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunStddev")) return false;
    if (!nextTokenIs(b, F_STDDEV)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STDDEV, null);
    r = consumeTokens(b, 2, F_STDDEV, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_STDDEV_POPULATION "(" number_argument_array ")"
  public static boolean FunStddevPopulation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunStddevPopulation")) return false;
    if (!nextTokenIs(b, F_STDDEV_POPULATION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STDDEV_POPULATION, null);
    r = consumeTokens(b, 2, F_STDDEV_POPULATION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_SUBSTITUTE "(" string_argument  ("," string_argument | string_array) ("," string_argument | string_array)? ("," integer_argument)?  ")"
  public static boolean FunSubstitute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute")) return false;
    if (!nextTokenIs(b, F_SUBSTITUTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SUBSTITUTE, null);
    r = consumeTokens(b, 2, F_SUBSTITUTE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, FunSubstitute_3(b, l + 1)) && r;
    r = p && report_error_(b, FunSubstitute_4(b, l + 1)) && r;
    r = p && report_error_(b, FunSubstitute_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "," string_argument | string_array
  private static boolean FunSubstitute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunSubstitute_3_0(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," string_argument
  private static boolean FunSubstitute_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," string_argument | string_array)?
  private static boolean FunSubstitute_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_4")) return false;
    FunSubstitute_4_0(b, l + 1);
    return true;
  }

  // "," string_argument | string_array
  private static boolean FunSubstitute_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunSubstitute_4_0_0(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," string_argument
  private static boolean FunSubstitute_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," integer_argument)?
  private static boolean FunSubstitute_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_5")) return false;
    FunSubstitute_5_0(b, l + 1);
    return true;
  }

  // "," integer_argument
  private static boolean FunSubstitute_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstitute_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_SUBSTRING "(" string_argument "," integer_argument ("," integer_argument)?  ")"
  public static boolean FunSubstring(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstring")) return false;
    if (!nextTokenIs(b, F_SUBSTRING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SUBSTRING, null);
    r = consumeTokens(b, 2, F_SUBSTRING, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, integer_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunSubstring_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," integer_argument)?
  private static boolean FunSubstring_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstring_5")) return false;
    FunSubstring_5_0(b, l + 1);
    return true;
  }

  // "," integer_argument
  private static boolean FunSubstring_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSubstring_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_SUM "(" number_argument_array ")"
  public static boolean FunSum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunSum")) return false;
    if (!nextTokenIs(b, F_SUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SUM, null);
    r = consumeTokens(b, 2, F_SUM, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TAN "(" number_argument ")"
  public static boolean FunTan(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTan")) return false;
    if (!nextTokenIs(b, F_TAN)) return false;
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
    if (!recursion_guard_(b, l, "FunTan2")) return false;
    if (!nextTokenIs(b, F_TAN2)) return false;
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
  // F_TFIDF "(" document_argument  ("," boolean_argument) ")"
  public static boolean FunTfDiff(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTfDiff")) return false;
    if (!nextTokenIs(b, F_TFIDF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TF_DIFF, null);
    r = consumeTokens(b, 2, F_TFIDF, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, document_argument(b, l + 1));
    r = p && report_error_(b, FunTfDiff_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "," boolean_argument
  private static boolean FunTfDiff_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTfDiff_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_TO_ARRAY "(" AnyType ")"
  public static boolean FunToArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToArray")) return false;
    if (!nextTokenIs(b, F_TO_ARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_ARRAY, null);
    r = consumeTokens(b, 2, F_TO_ARRAY, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TO_BASE64 "(" string_argument ")"
  public static boolean FunToBase64(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToBase64")) return false;
    if (!nextTokenIs(b, F_TO_BASE64)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_BASE_64, null);
    r = consumeTokens(b, 2, F_TO_BASE64, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TO_BOOL "(" AnyType ")"
  public static boolean FunToBool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToBool")) return false;
    if (!nextTokenIs(b, F_TO_BOOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_BOOL, null);
    r = consumeTokens(b, 2, F_TO_BOOL, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TO_HEX "(" string_argument ")"
  public static boolean FunToHex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToHex")) return false;
    if (!nextTokenIs(b, F_TO_HEX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_HEX, null);
    r = consumeTokens(b, 2, F_TO_HEX, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TO_LIST "(" AnyType ")"
  public static boolean FunToList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToList")) return false;
    if (!nextTokenIs(b, F_TO_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_LIST, null);
    r = consumeTokens(b, 2, F_TO_LIST, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TO_NUMBER "(" AnyType ")"
  public static boolean FunToNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToNumber")) return false;
    if (!nextTokenIs(b, F_TO_NUMBER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_NUMBER, null);
    r = consumeTokens(b, 2, F_TO_NUMBER, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TO_STRING "(" AnyType ")"
  public static boolean FunToString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunToString")) return false;
    if (!nextTokenIs(b, F_TO_STRING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TO_STRING, null);
    r = consumeTokens(b, 2, F_TO_STRING, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TOKENS "(" string_argument "," AnalyzerType ")"
  public static boolean FunTokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTokens")) return false;
    if (!nextTokenIs(b, F_TOKENS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TOKENS, null);
    r = consumeTokens(b, 0, F_TOKENS, T_OPEN);
    r = r && string_argument(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, consumeToken(b, T_COMMA));
    r = p && report_error_(b, AnalyzerType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TRANSLATE  "(" string_argument "," objects_argument ("," AnyType)? ")"
  public static boolean FunTranslate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTranslate")) return false;
    if (!nextTokenIs(b, F_TRANSLATE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TRANSLATE, null);
    r = consumeTokens(b, 2, F_TRANSLATE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, objects_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunTranslate_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," AnyType)?
  private static boolean FunTranslate_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTranslate_5")) return false;
    FunTranslate_5_0(b, l + 1);
    return true;
  }

  // "," AnyType
  private static boolean FunTranslate_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTranslate_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AnyType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_TRIM "(" string_argument (("," string_argument) | ("," integer_argument)?)  ")"
  public static boolean FunTrim(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTrim")) return false;
    if (!nextTokenIs(b, F_TRIM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TRIM, null);
    r = consumeTokens(b, 2, F_TRIM, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, FunTrim_3(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," string_argument) | ("," integer_argument)?
  private static boolean FunTrim_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTrim_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunTrim_3_0(b, l + 1);
    if (!r) r = FunTrim_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," string_argument
  private static boolean FunTrim_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTrim_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && string_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," integer_argument)?
  private static boolean FunTrim_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTrim_3_1")) return false;
    FunTrim_3_1_0(b, l + 1);
    return true;
  }

  // "," integer_argument
  private static boolean FunTrim_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTrim_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_TYPENAME "(" AnyType ")"
  public static boolean FunTypename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunTypename")) return false;
    if (!nextTokenIs(b, F_TYPENAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TYPENAME, null);
    r = consumeTokens(b, 2, F_TYPENAME, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_UNSHIFT  "(" number_argument_array "," expression_argument ("," boolean_argument)? ")"
  public static boolean FunUnShift(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnShift")) return false;
    if (!nextTokenIs(b, F_UNSHIFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_UN_SHIFT, null);
    r = consumeTokens(b, 2, F_UNSHIFT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, expression_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunUnShift_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," boolean_argument)?
  private static boolean FunUnShift_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnShift_5")) return false;
    FunUnShift_5_0(b, l + 1);
    return true;
  }

  // "," boolean_argument
  private static boolean FunUnShift_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnShift_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && boolean_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_UNION  "(" (number_argument_array)+ ")"
  public static boolean FunUnion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnion")) return false;
    if (!nextTokenIs(b, F_UNION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_UNION, null);
    r = consumeTokens(b, 2, F_UNION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunUnion_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)+
  private static boolean FunUnion_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnion_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunUnion_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunUnion_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunUnion_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunUnion_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnion_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_UNION_DISTINCT  "(" (number_argument_array)+ ")"
  public static boolean FunUnionDistinct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnionDistinct")) return false;
    if (!nextTokenIs(b, F_UNION_DISTINCT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_UNION_DISTINCT, null);
    r = consumeTokens(b, 2, F_UNION_DISTINCT, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, FunUnionDistinct_2(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (number_argument_array)+
  private static boolean FunUnionDistinct_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnionDistinct_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunUnionDistinct_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FunUnionDistinct_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunUnionDistinct_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (number_argument_array)
  private static boolean FunUnionDistinct_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnionDistinct_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_UNIQUE  "(" number_argument_array ")"
  public static boolean FunUnique(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnique")) return false;
    if (!nextTokenIs(b, F_UNIQUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_UNIQUE, null);
    r = consumeTokens(b, 2, F_UNIQUE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_UNSET "(" objects_argument ("," StringType)* | ArrayType ")"
  public static boolean FunUnset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnset")) return false;
    if (!nextTokenIs(b, "<fun unset>", F_UNSET, T_ARRAY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_UNSET, "<fun unset>");
    r = FunUnset_0(b, l + 1);
    if (!r) r = FunUnset_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_UNSET "(" objects_argument ("," StringType)*
  private static boolean FunUnset_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnset_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_UNSET, T_OPEN);
    r = r && objects_argument(b, l + 1);
    r = r && FunUnset_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," StringType)*
  private static boolean FunUnset_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnset_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunUnset_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunUnset_0_3", c)) break;
    }
    return true;
  }

  // "," StringType
  private static boolean FunUnset_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnset_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayType ")"
  private static boolean FunUnset_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnset_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_UNSET_RECURSIVE "(" objects_argument ("," StringType)* | ArrayType ")"
  public static boolean FunUnsetRecursive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnsetRecursive")) return false;
    if (!nextTokenIs(b, "<fun unset recursive>", F_UNSET_RECURSIVE, T_ARRAY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_UNSET_RECURSIVE, "<fun unset recursive>");
    r = FunUnsetRecursive_0(b, l + 1);
    if (!r) r = FunUnsetRecursive_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_UNSET_RECURSIVE "(" objects_argument ("," StringType)*
  private static boolean FunUnsetRecursive_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnsetRecursive_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_UNSET_RECURSIVE, T_OPEN);
    r = r && objects_argument(b, l + 1);
    r = r && FunUnsetRecursive_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," StringType)*
  private static boolean FunUnsetRecursive_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnsetRecursive_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunUnsetRecursive_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunUnsetRecursive_0_3", c)) break;
    }
    return true;
  }

  // "," StringType
  private static boolean FunUnsetRecursive_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnsetRecursive_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayType ")"
  private static boolean FunUnsetRecursive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUnsetRecursive_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_UPPER "(" string_argument ")"
  public static boolean FunUpper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUpper")) return false;
    if (!nextTokenIs(b, F_UPPER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_UPPER, null);
    r = consumeTokens(b, 2, F_UPPER, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_UUID "(" ")"
  public static boolean FunUuid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunUuid")) return false;
    if (!nextTokenIs(b, F_UUID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_UUID, null);
    r = consumeTokens(b, 2, F_UUID, T_OPEN, T_CLOSE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_V8 "(" expression_argument ")"
  public static boolean FunV8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunV8")) return false;
    if (!nextTokenIs(b, F_V8)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_V_8, null);
    r = consumeTokens(b, 2, F_V8, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, expression_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VALUES "(" objects_argument ("," StringType)* | ArrayType ")"
  public static boolean FunValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunValues")) return false;
    if (!nextTokenIs(b, "<fun values>", F_VALUES, T_ARRAY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_VALUES, "<fun values>");
    r = FunValues_0(b, l + 1);
    if (!r) r = FunValues_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // F_VALUES "(" objects_argument ("," StringType)*
  private static boolean FunValues_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunValues_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, F_VALUES, T_OPEN);
    r = r && objects_argument(b, l + 1);
    r = r && FunValues_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," StringType)*
  private static boolean FunValues_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunValues_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunValues_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunValues_0_3", c)) break;
    }
    return true;
  }

  // "," StringType
  private static boolean FunValues_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunValues_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayType ")"
  private static boolean FunValues_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunValues_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_VARIANCE "(" number_argument_array ")"
  public static boolean FunVariance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVariance")) return false;
    if (!nextTokenIs(b, F_VARIANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE, null);
    r = consumeTokens(b, 2, F_VARIANCE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE_POPULATION "(" number_argument_array ")"
  public static boolean FunVariancePopulation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVariancePopulation")) return false;
    if (!nextTokenIs(b, F_VARIANCE_POPULATION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE_POPULATION, null);
    r = consumeTokens(b, 2, F_VARIANCE_POPULATION, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE_SAMPLE "(" number_argument_array ")"
  public static boolean FunVarianceSample(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVarianceSample")) return false;
    if (!nextTokenIs(b, F_VARIANCE_SAMPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE_SAMPLE, null);
    r = consumeTokens(b, 2, F_VARIANCE_SAMPLE, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VERSION "("  ")"
  public static boolean FunVersion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunVersion")) return false;
    if (!nextTokenIs(b, F_VERSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VERSION, null);
    r = consumeTokens(b, 2, F_VERSION, T_OPEN, T_CLOSE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_WARN "(" AnyType "," StringType ")"
  public static boolean FunWarn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunWarn")) return false;
    if (!nextTokenIs(b, F_WARN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_WARN, null);
    r = consumeTokens(b, 2, F_WARN, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, StringType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ZIP "(" ArrayType "," ArrayType ")"
  public static boolean FunZip(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunZip")) return false;
    if (!nextTokenIs(b, F_ZIP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ZIP, null);
    r = consumeTokens(b, 2, F_ZIP, T_OPEN);
    p = r; // pin = 2
    r = r && report_error_(b, ArrayType(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, ArrayType(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // '{' object_element* '}'
  public static boolean JsonType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType")) return false;
    if (!nextTokenIs(b, T_OBJECT_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, JSON_TYPE, null);
    r = consumeToken(b, T_OBJECT_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, JsonType_1(b, l + 1));
    r = p && consumeToken(b, T_OBJECT_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // object_element*
  private static boolean JsonType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JsonType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JsonType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // T_LET ObjectExpression '=' ExpressionType*
  public static boolean LetType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetType")) return false;
    if (!nextTokenIs(b, T_LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LET_TYPE, null);
    r = consumeToken(b, T_LET);
    r = r && ObjectExpression(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, T_IS));
    r = p && LetType_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionType*
  private static boolean LetType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetType_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpressionType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetType_3", c)) break;
    }
    return true;
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
  // FunAbs
  //               | FunStdDevSample
  //               | FunCurrentDatabase
  //               | FunPregelResult
  //               | FunKeys
  //               | FunDateNow
  //               | FunDateISO8601
  //               | FunDateTimeStamp
  //               | FunIsDateString
  //               | FunDateOfWeek
  //               | FunDateYear
  //               | FunDateMonth
  //               | FunDateDay
  //               | FunDateHour
  //               | FunDateMinute
  //               | FunDateSecond
  //               | FunDateMillisecond
  //               | FunDateDayOfYear
  //               | FunDateIsoWeek
  //               | FunDateLeapYear
  //               | FunDateQuarter
  //               | FunDateDaysInMonth
  //               | FunDateTrunc
  //               | FunDateFormat
  //               | FunDateAdd
  //               | FunDateSubtract
  //               | FunDateDiff
  //               | FunDateCompare
  //               | FunStartsWith
  //               | FunMinMatch
  //               | FunBm25
  //               | FunTfDiff
  //               | FunPhrase
  //               | FunExists
  //               | FunBoost
  //               | FunAnalyzer
  //               | FunConcat
  //               | FunContains
  //               | FunEncodeUriComponent
  //               | FunFindFirst
  //               | FunFindLast
  //               | FunJsonParse
  //               | FunJsonStringify
  //               | FunLeft
  //               | FunLevenshteinDistance
  //               | FunLike
  //               | FunLower
  //               | FunLtrim
  //               | FunMd5
  //               | FunRandomToken
  //               | FunRegexMatches
  //               | FunRegexSplit
  //               | FunRegexTest
  //               | FunRegexReplace
  //               | FunRight
  //               | FunRtrim
  //               | FunSha1
  //               | FunSha512
  //               | FunSplit
  //               | FunSoundex
  //               | FunSubstitute
  //               | FunSubstring
  //               | FunTokens
  //               | FunToBase64
  //               | FunToHex
  //               | FunTrim
  //               | FunUpper
  //               | FunUuid
  //               | FunDistance
  //               | FunGeoContains
  //               | FunGeoDistance
  //               | FunGeoEquals
  //               | FunGeoIntersects
  //               | FunGeoLineString
  //               | FunGeoMultiLineString
  //               | FunGeoMultiPoint
  //               | FunGeoPoint
  //               | FunGeoPolygon
  //               | FunNotNull
  //               | FunFirstList
  //               | FunFirstDocument
  //               | FunCollectionCount
  //               | FunCollections
  //               | FunCurrentUser
  //               | FunDocument
  //               | FunHash
  //               | FunApply
  //               | FunAssert
  //               | FunWarn
  //               | FunCall
  //               | FunFail
  //               | FunNoopt
  //               | FunPassThru
  //               | FunSleep
  //               | FunV8
  //               | FunVersion
  //               | FunCharLength
  //               | FunAttributes
  //               | FunMerge
  //               | FunMergeRecursive
  //               | FunParseIdentifier
  //               | FunTranslate
  //               | FunUnset
  //               | FunValues
  //               | FunZip
  //               | FunUnsetRecursive
  //               | FunIsSameCollection
  //               | FunHas
  //               | FunKeep
  //               | FunFullText
  //               | FunMatches
  //               | FunAcos
  //               | FunToBool
  //               | FunToString
  //               | FunToNumber
  //               | FunToArray
  //               | FunToList
  //               | FunIsNull
  //               | FunIsBool
  //               | FunIsNumber
  //               | FunIsString
  //               | FunIsArray
  //               | FunIsList
  //               | FunIsObject
  //               | FunIsDocument
  //               | FunIsKey
  //               | FunTypename
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
  //               | FunPosition
  //               | FunContainsArray
  //               | FunAppend
  //               | FunLength
  //               | FunCount
  //               | FunCountDistinct
  //               | FunCountUnique
  //               | FunFirst
  //               | FunLast
  //               | FunFlatten
  //               | FunInterSection
  //               | FunMinus
  //               | FunNTH
  //               | FunRemoveNTH
  //               | FunOuterSection
  //               | FunRemoveValue
  //               | FunPop
  //               | FunRemoveValues
  //               | FunPush
  //               | FunReverse
  //               | FunShift
  //               | FunSlice
  //               | FunSorted
  //               | FunSortedUnique
  //               | FunUnion
  //               | FunUnionDistinct
  //               | FunUnique
  //               | FunUnShift
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
  public static boolean NamedFunctions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_FUNCTIONS, "<named functions>");
    r = FunAbs(b, l + 1);
    if (!r) r = FunStdDevSample(b, l + 1);
    if (!r) r = FunCurrentDatabase(b, l + 1);
    if (!r) r = FunPregelResult(b, l + 1);
    if (!r) r = FunKeys(b, l + 1);
    if (!r) r = FunDateNow(b, l + 1);
    if (!r) r = FunDateISO8601(b, l + 1);
    if (!r) r = FunDateTimeStamp(b, l + 1);
    if (!r) r = FunIsDateString(b, l + 1);
    if (!r) r = FunDateOfWeek(b, l + 1);
    if (!r) r = FunDateYear(b, l + 1);
    if (!r) r = FunDateMonth(b, l + 1);
    if (!r) r = FunDateDay(b, l + 1);
    if (!r) r = FunDateHour(b, l + 1);
    if (!r) r = FunDateMinute(b, l + 1);
    if (!r) r = FunDateSecond(b, l + 1);
    if (!r) r = FunDateMillisecond(b, l + 1);
    if (!r) r = FunDateDayOfYear(b, l + 1);
    if (!r) r = FunDateIsoWeek(b, l + 1);
    if (!r) r = FunDateLeapYear(b, l + 1);
    if (!r) r = FunDateQuarter(b, l + 1);
    if (!r) r = FunDateDaysInMonth(b, l + 1);
    if (!r) r = FunDateTrunc(b, l + 1);
    if (!r) r = FunDateFormat(b, l + 1);
    if (!r) r = FunDateAdd(b, l + 1);
    if (!r) r = FunDateSubtract(b, l + 1);
    if (!r) r = FunDateDiff(b, l + 1);
    if (!r) r = FunDateCompare(b, l + 1);
    if (!r) r = FunStartsWith(b, l + 1);
    if (!r) r = FunMinMatch(b, l + 1);
    if (!r) r = FunBm25(b, l + 1);
    if (!r) r = FunTfDiff(b, l + 1);
    if (!r) r = FunPhrase(b, l + 1);
    if (!r) r = FunExists(b, l + 1);
    if (!r) r = FunBoost(b, l + 1);
    if (!r) r = FunAnalyzer(b, l + 1);
    if (!r) r = FunConcat(b, l + 1);
    if (!r) r = FunContains(b, l + 1);
    if (!r) r = FunEncodeUriComponent(b, l + 1);
    if (!r) r = FunFindFirst(b, l + 1);
    if (!r) r = FunFindLast(b, l + 1);
    if (!r) r = FunJsonParse(b, l + 1);
    if (!r) r = FunJsonStringify(b, l + 1);
    if (!r) r = FunLeft(b, l + 1);
    if (!r) r = FunLevenshteinDistance(b, l + 1);
    if (!r) r = FunLike(b, l + 1);
    if (!r) r = FunLower(b, l + 1);
    if (!r) r = FunLtrim(b, l + 1);
    if (!r) r = FunMd5(b, l + 1);
    if (!r) r = FunRandomToken(b, l + 1);
    if (!r) r = FunRegexMatches(b, l + 1);
    if (!r) r = FunRegexSplit(b, l + 1);
    if (!r) r = FunRegexTest(b, l + 1);
    if (!r) r = FunRegexReplace(b, l + 1);
    if (!r) r = FunRight(b, l + 1);
    if (!r) r = FunRtrim(b, l + 1);
    if (!r) r = FunSha1(b, l + 1);
    if (!r) r = FunSha512(b, l + 1);
    if (!r) r = FunSplit(b, l + 1);
    if (!r) r = FunSoundex(b, l + 1);
    if (!r) r = FunSubstitute(b, l + 1);
    if (!r) r = FunSubstring(b, l + 1);
    if (!r) r = FunTokens(b, l + 1);
    if (!r) r = FunToBase64(b, l + 1);
    if (!r) r = FunToHex(b, l + 1);
    if (!r) r = FunTrim(b, l + 1);
    if (!r) r = FunUpper(b, l + 1);
    if (!r) r = FunUuid(b, l + 1);
    if (!r) r = FunDistance(b, l + 1);
    if (!r) r = FunGeoContains(b, l + 1);
    if (!r) r = FunGeoDistance(b, l + 1);
    if (!r) r = FunGeoEquals(b, l + 1);
    if (!r) r = FunGeoIntersects(b, l + 1);
    if (!r) r = FunGeoLineString(b, l + 1);
    if (!r) r = FunGeoMultiLineString(b, l + 1);
    if (!r) r = FunGeoMultiPoint(b, l + 1);
    if (!r) r = FunGeoPoint(b, l + 1);
    if (!r) r = FunGeoPolygon(b, l + 1);
    if (!r) r = FunNotNull(b, l + 1);
    if (!r) r = FunFirstList(b, l + 1);
    if (!r) r = FunFirstDocument(b, l + 1);
    if (!r) r = FunCollectionCount(b, l + 1);
    if (!r) r = FunCollections(b, l + 1);
    if (!r) r = FunCurrentUser(b, l + 1);
    if (!r) r = FunDocument(b, l + 1);
    if (!r) r = FunHash(b, l + 1);
    if (!r) r = FunApply(b, l + 1);
    if (!r) r = FunAssert(b, l + 1);
    if (!r) r = FunWarn(b, l + 1);
    if (!r) r = FunCall(b, l + 1);
    if (!r) r = FunFail(b, l + 1);
    if (!r) r = FunNoopt(b, l + 1);
    if (!r) r = FunPassThru(b, l + 1);
    if (!r) r = FunSleep(b, l + 1);
    if (!r) r = FunV8(b, l + 1);
    if (!r) r = FunVersion(b, l + 1);
    if (!r) r = FunCharLength(b, l + 1);
    if (!r) r = FunAttributes(b, l + 1);
    if (!r) r = FunMerge(b, l + 1);
    if (!r) r = FunMergeRecursive(b, l + 1);
    if (!r) r = FunParseIdentifier(b, l + 1);
    if (!r) r = FunTranslate(b, l + 1);
    if (!r) r = FunUnset(b, l + 1);
    if (!r) r = FunValues(b, l + 1);
    if (!r) r = FunZip(b, l + 1);
    if (!r) r = FunUnsetRecursive(b, l + 1);
    if (!r) r = FunIsSameCollection(b, l + 1);
    if (!r) r = FunHas(b, l + 1);
    if (!r) r = FunKeep(b, l + 1);
    if (!r) r = FunFullText(b, l + 1);
    if (!r) r = FunMatches(b, l + 1);
    if (!r) r = FunAcos(b, l + 1);
    if (!r) r = FunToBool(b, l + 1);
    if (!r) r = FunToString(b, l + 1);
    if (!r) r = FunToNumber(b, l + 1);
    if (!r) r = FunToArray(b, l + 1);
    if (!r) r = FunToList(b, l + 1);
    if (!r) r = FunIsNull(b, l + 1);
    if (!r) r = FunIsBool(b, l + 1);
    if (!r) r = FunIsNumber(b, l + 1);
    if (!r) r = FunIsString(b, l + 1);
    if (!r) r = FunIsArray(b, l + 1);
    if (!r) r = FunIsList(b, l + 1);
    if (!r) r = FunIsObject(b, l + 1);
    if (!r) r = FunIsDocument(b, l + 1);
    if (!r) r = FunIsKey(b, l + 1);
    if (!r) r = FunTypename(b, l + 1);
    if (!r) r = FunAsin(b, l + 1);
    if (!r) r = FunAvg(b, l + 1);
    if (!r) r = FunAverage(b, l + 1);
    if (!r) r = FunTan(b, l + 1);
    if (!r) r = FunTan2(b, l + 1);
    if (!r) r = FunAtan(b, l + 1);
    if (!r) r = FunSin(b, l + 1);
    if (!r) r = FunAtan2(b, l + 1);
    if (!r) r = FunCos(b, l + 1);
    if (!r) r = FunDegrees(b, l + 1);
    if (!r) r = FunMin(b, l + 1);
    if (!r) r = FunPosition(b, l + 1);
    if (!r) r = FunContainsArray(b, l + 1);
    if (!r) r = FunAppend(b, l + 1);
    if (!r) r = FunLength(b, l + 1);
    if (!r) r = FunCount(b, l + 1);
    if (!r) r = FunCountDistinct(b, l + 1);
    if (!r) r = FunCountUnique(b, l + 1);
    if (!r) r = FunFirst(b, l + 1);
    if (!r) r = FunLast(b, l + 1);
    if (!r) r = FunFlatten(b, l + 1);
    if (!r) r = FunInterSection(b, l + 1);
    if (!r) r = FunMinus(b, l + 1);
    if (!r) r = FunNTH(b, l + 1);
    if (!r) r = FunRemoveNTH(b, l + 1);
    if (!r) r = FunOuterSection(b, l + 1);
    if (!r) r = FunRemoveValue(b, l + 1);
    if (!r) r = FunPop(b, l + 1);
    if (!r) r = FunRemoveValues(b, l + 1);
    if (!r) r = FunPush(b, l + 1);
    if (!r) r = FunReverse(b, l + 1);
    if (!r) r = FunShift(b, l + 1);
    if (!r) r = FunSlice(b, l + 1);
    if (!r) r = FunSorted(b, l + 1);
    if (!r) r = FunSortedUnique(b, l + 1);
    if (!r) r = FunUnion(b, l + 1);
    if (!r) r = FunUnionDistinct(b, l + 1);
    if (!r) r = FunUnique(b, l + 1);
    if (!r) r = FunUnShift(b, l + 1);
    if (!r) r = FunMedian(b, l + 1);
    if (!r) r = FunLog10(b, l + 1);
    if (!r) r = FunMax(b, l + 1);
    if (!r) r = FunSQRT(b, l + 1);
    if (!r) r = FunPercentile(b, l + 1);
    if (!r) r = FunPi(b, l + 1);
    if (!r) r = FunLog2(b, l + 1);
    if (!r) r = FunLog(b, l + 1);
    if (!r) r = FunFloor(b, l + 1);
    if (!r) r = FunExp2(b, l + 1);
    if (!r) r = FunExp(b, l + 1);
    if (!r) r = FunCeil(b, l + 1);
    if (!r) r = FunRand(b, l + 1);
    if (!r) r = FunSum(b, l + 1);
    if (!r) r = FunStddev(b, l + 1);
    if (!r) r = FunPow(b, l + 1);
    if (!r) r = FunVarianceSample(b, l + 1);
    if (!r) r = FunStddevPopulation(b, l + 1);
    if (!r) r = FunVariancePopulation(b, l + 1);
    if (!r) r = FunRadians(b, l + 1);
    if (!r) r = FunRange(b, l + 1);
    if (!r) r = FunRound(b, l + 1);
    if (!r) r = FunVariance(b, l + 1);
    if (!r) r = FunConcatSeparator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // reserved_keywords
  public static boolean NamedKeywordStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedKeywordStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_KEYWORD_STATEMENTS, "<named keyword statements>");
    r = reserved_keywords(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IntegerType | AnyNumber | SignedInteger
  public static boolean NumberType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_TYPE, "<number type>");
    r = IntegerType(b, l + 1);
    if (!r) r = AnyNumber(b, l + 1);
    if (!r) r = SignedInteger(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (extra_property (property_lookup)*) | (PropertyName (property_lookup)*) | (PropertyName (ParameterVariable)*)
  public static boolean ObjectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_EXPRESSION, "<object expression>");
    r = ObjectExpression_0(b, l + 1);
    if (!r) r = ObjectExpression_1(b, l + 1);
    if (!r) r = ObjectExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // extra_property (property_lookup)*
  private static boolean ObjectExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extra_property(b, l + 1);
    r = r && ObjectExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (property_lookup)*
  private static boolean ObjectExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectExpression_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectExpression_0_1", c)) break;
    }
    return true;
  }

  // (property_lookup)
  private static boolean ObjectExpression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_lookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PropertyName (property_lookup)*
  private static boolean ObjectExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyName(b, l + 1);
    r = r && ObjectExpression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (property_lookup)*
  private static boolean ObjectExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectExpression_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectExpression_1_1", c)) break;
    }
    return true;
  }

  // (property_lookup)
  private static boolean ObjectExpression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_lookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PropertyName (ParameterVariable)*
  private static boolean ObjectExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyName(b, l + 1);
    r = r && ObjectExpression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ParameterVariable)*
  private static boolean ObjectExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectExpression_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectExpression_2_1", c)) break;
    }
    return true;
  }

  // (ParameterVariable)
  private static boolean ObjectExpression_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterVariable(b, l + 1);
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
  //                       | T_COMMA
  //                       | T_OPEN
  //                       | T_CLOSE
  //                       | T_TIMES
  //                       | T_ARRAY_OPEN
  //                       | T_ARRAY_CLOSE
  //                       //| T_OBJECT_OPEN
  //                       //| T_OBJECT_CLOSE
  //                       | DOT
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
    if (!r) r = consumeToken(b, T_TIMES);
    if (!r) r = consumeToken(b, T_ARRAY_OPEN);
    if (!r) r = consumeToken(b, T_ARRAY_CLOSE);
    if (!r) r = consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ("@"  PropertyName) | ("@@"  PropertyName)
  public static boolean ParameterVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterVariable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_VARIABLE, "<parameter variable>");
    r = ParameterVariable_0(b, l + 1);
    if (!r) r = ParameterVariable_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "@"  PropertyName
  private static boolean ParameterVariable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterVariable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@");
    r = r && PropertyName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "@@"  PropertyName
  private static boolean ParameterVariable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterVariable_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@@");
    r = r && PropertyName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PropertyName | SystemProperty | ParameterVariable | VariablePlaceHolder) ("[" ExpressionType "]")?
  public static boolean PropertyLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyLookup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_LOOKUP, "<property lookup>");
    r = PropertyLookup_0(b, l + 1);
    r = r && PropertyLookup_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PropertyName | SystemProperty | ParameterVariable | VariablePlaceHolder
  private static boolean PropertyLookup_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyLookup_0")) return false;
    boolean r;
    r = PropertyName(b, l + 1);
    if (!r) r = SystemProperty(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  // ("[" ExpressionType "]")?
  private static boolean PropertyLookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyLookup_1")) return false;
    PropertyLookup_1_0(b, l + 1);
    return true;
  }

  // "[" ExpressionType "]"
  private static boolean PropertyLookup_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyLookup_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && ExpressionType(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID | T_SYS_EDGES | T_SYS_VERTICES
  public static boolean PropertyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_NAME, "<property name>");
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, T_SYS_EDGES);
    if (!r) r = consumeToken(b, T_SYS_VERTICES);
    exit_section_(b, l, m, r, false, null);
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
    exit_section_(b, l, m, r, p, AqlParser::statement_recover);
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
  public static boolean ReservedWords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReservedWords")) return false;
    if (!nextTokenIs(b, T_NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NULL);
    exit_section_(b, m, RESERVED_WORDS, r);
    return r;
  }

  /* ********************************************************** */
  // (T_RETURN JsonType)
  // //                | (T_RETURN '(' ExpressionType* ')')
  //                 | (T_RETURN ExpressionType*)
  public static boolean ReturnType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType")) return false;
    if (!nextTokenIs(b, T_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReturnType_0(b, l + 1);
    if (!r) r = ReturnType_1(b, l + 1);
    exit_section_(b, m, RETURN_TYPE, r);
    return r;
  }

  // T_RETURN JsonType
  private static boolean ReturnType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_RETURN);
    r = r && JsonType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_RETURN ExpressionType*
  private static boolean ReturnType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_RETURN);
    r = r && ReturnType_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExpressionType*
  private static boolean ReturnType_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpressionType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnType_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (IntegerType | ParameterVariable) T_RANGE (IntegerType | ParameterVariable)
  public static boolean Sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENCE, "<sequence>");
    r = Sequence_0(b, l + 1);
    r = r && consumeToken(b, T_RANGE);
    r = r && Sequence_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IntegerType | ParameterVariable
  private static boolean Sequence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sequence_0")) return false;
    boolean r;
    r = IntegerType(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    return r;
  }

  // IntegerType | ParameterVariable
  private static boolean Sequence_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sequence_2")) return false;
    boolean r;
    r = IntegerType(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (T_PLUS | T_MINUS) IntegerType
  public static boolean SignedInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedInteger")) return false;
    if (!nextTokenIs(b, "<signed integer>", T_MINUS, T_PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_INTEGER, "<signed integer>");
    r = SignedInteger_0(b, l + 1);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_PLUS | T_MINUS
  private static boolean SignedInteger_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedInteger_0")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    return r;
  }

  /* ********************************************************** */
  // Comment
  //               | ForType
  //               | LetType
  //               | JsonType
  //               | ArrayRef
  //               | ReturnType
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Comment(b, l + 1);
    if (!r) r = ForType(b, l + 1);
    if (!r) r = LetType(b, l + 1);
    if (!r) r = JsonType(b, l + 1);
    if (!r) r = ArrayRef(b, l + 1);
    if (!r) r = ReturnType(b, l + 1);
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
  // T_KEY | T_ID  | T_SYS_FROM  | T_SYS_TO | F_ATTRIBUTES | T_SYS_VERTICES | T_SYS_EDGES
  public static boolean SystemProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SystemProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYSTEM_PROPERTY, "<system property>");
    r = consumeToken(b, T_KEY);
    if (!r) r = consumeToken(b, T_ID);
    if (!r) r = consumeToken(b, T_SYS_FROM);
    if (!r) r = consumeToken(b, T_SYS_TO);
    if (!r) r = consumeToken(b, F_ATTRIBUTES);
    if (!r) r = consumeToken(b, T_SYS_VERTICES);
    if (!r) r = consumeToken(b, T_SYS_EDGES);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_tuple (',' single_tuple )*
  // {
  //   //consumeTokenMethod = 'consumeTokenFast'
  // }
  public static boolean TupleType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType")) return false;
    if (!nextTokenIs(b, T_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_tuple(b, l + 1);
    r = r && TupleType_1(b, l + 1);
    r = r && TupleType_2(b, l + 1);
    exit_section_(b, m, TUPLE_TYPE, r);
    return r;
  }

  // (',' single_tuple )*
  private static boolean TupleType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TupleType_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleType_1", c)) break;
    }
    return true;
  }

  // ',' single_tuple
  private static boolean TupleType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && single_tuple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //   //consumeTokenMethod = 'consumeTokenFast'
  // }
  private static boolean TupleType_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // T_PLACHOLDER_START ObjectExpression T_OBJECT_CLOSE
  public static boolean VariablePlaceHolder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariablePlaceHolder")) return false;
    if (!nextTokenIs(b, T_PLACHOLDER_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_PLACE_HOLDER, null);
    r = consumeToken(b, T_PLACHOLDER_START);
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
  // T_PLUS
  //                     | T_MINUS
  //                     | T_TIMES
  //                     | T_DIV
  //                     | T_MOD
  //                     | T_EQ
  //                     | T_IS
  static boolean arithmetic_operators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_operators")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    if (!r) r = consumeToken(b, T_TIMES);
    if (!r) r = consumeToken(b, T_DIV);
    if (!r) r = consumeToken(b, T_MOD);
    if (!r) r = consumeToken(b, T_EQ);
    if (!r) r = consumeToken(b, T_IS);
    return r;
  }

  /* ********************************************************** */
  // (expression_operators | ExpressionArray) (',' |& ']')
  static boolean array_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_element")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = array_element_0(b, l + 1);
    p = r; // pin = 1
    r = r && array_element_1(b, l + 1);
    exit_section_(b, l, m, r, p, AqlParser::not_bracket_or_next_value);
    return r || p;
  }

  // expression_operators | ExpressionArray
  private static boolean array_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_element_0")) return false;
    boolean r;
    r = expression_operators(b, l + 1);
    if (!r) r = ExpressionArray(b, l + 1);
    return r;
  }

  // ',' |& ']'
  private static boolean array_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    if (!r) r = array_element_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // & ']'
  private static boolean array_element_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_element_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression | BooleanType | ParameterVariable | VariablePlaceHolder
  static boolean boolean_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_argument")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
    if (!r) r = BooleanType(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // &('(')
  static boolean brace_lookahead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brace_lookahead")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, T_OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnyType | ('*' IntegerType)+
  static boolean date_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "date_argument")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyType(b, l + 1);
    if (!r) r = date_argument_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*' IntegerType)+
  private static boolean date_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "date_argument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = date_argument_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!date_argument_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "date_argument_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' IntegerType
  private static boolean date_argument_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "date_argument_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_TIMES);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function_lookahead | variable_lookahead
  static boolean declaration_lookahead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_lookahead")) return false;
    boolean r;
    r = function_lookahead(b, l + 1);
    if (!r) r = variable_lookahead(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression | JsonType | ParameterVariable | VariablePlaceHolder
  static boolean document_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "document_argument")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
    if (!r) r = JsonType(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // objects_argument | ExpressionType | JsonType
  static boolean expression_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_argument")) return false;
    boolean r;
    r = objects_argument(b, l + 1);
    if (!r) r = ExpressionType(b, l + 1);
    if (!r) r = JsonType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ('*') ? (reserved_keywords | FilterType)
  static boolean expression_operators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_operators")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_operators_0(b, l + 1);
    r = r && expression_operators_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*') ?
  private static boolean expression_operators_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_operators_0")) return false;
    consumeToken(b, T_TIMES);
    return true;
  }

  // reserved_keywords | FilterType
  private static boolean expression_operators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_operators_1")) return false;
    boolean r;
    r = reserved_keywords(b, l + 1);
    if (!r) r = FilterType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_CURRENT
  static boolean extra_property(PsiBuilder b, int l) {
    return consumeToken(b, T_CURRENT);
  }

  /* ********************************************************** */
  // &(function_names '(')
  static boolean function_lookahead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_lookahead")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = function_lookahead_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // function_names '('
  private static boolean function_lookahead_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_lookahead_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION_NAMES, T_OPEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression | IntegerType | ParameterVariable | VariablePlaceHolder
  static boolean integer_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_argument")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
    if (!r) r = IntegerType(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // possible_number_array | "[" integer_argument (',' integer_argument)* "]"
  static boolean integer_argument_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_argument_array")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = possible_number_array(b, l + 1);
    if (!r) r = integer_argument_array_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" integer_argument (',' integer_argument)* "]"
  private static boolean integer_argument_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_argument_array_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && integer_argument(b, l + 1);
    r = r && integer_argument_array_1_2(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' integer_argument)*
  private static boolean integer_argument_array_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_argument_array_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!integer_argument_array_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "integer_argument_array_1_2", c)) break;
    }
    return true;
  }

  // ',' integer_argument
  private static boolean integer_argument_array_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_argument_array_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && integer_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_SUBSTITUTE
  //                                 | F_MD5
  //                                 | F_GEO_POINT
  //                                 | F_FIRST_LIST
  //                                 | F_DATE_SUBTRACT
  //                                 | F_DATE_MINUTE
  //                                 | F_SPLIT
  //                                 | F_WARN
  //                                 | F_DATE_LEAPYEAR
  //                                 | F_STDDEV_SAMPLE
  //                                 | F_TAN
  //                                 | F_IS_BOOL
  //                                 | F_TO_LIST
  //                                 | F_REGEX_SPLIT
  //                                 | F_MATCHES
  //                                 | F_CURRENT_DATABASE
  //                                 | F_VARIANCE_SAMPLE
  //                                 | F_UNSET
  //                                 | F_JSON_PARSE
  //                                 | F_DEGREES
  //                                 | F_GEO_MULTILINESTRING
  //                                 | F_DATE_DAYOFYEAR
  //                                 | F_LAST
  //                                 | F_VALUES
  //                                 | F_CONCAT_SEPARATOR
  //                                 | F_DATE_DAY
  //                                 | F_STDDEV
  //                                 | F_DATE_DAYS_IN_MONTH
  //                                 | F_NEAR
  //                                 | F_LTRIM
  //                                 | F_REVERSE
  //                                 | F_RANGE
  //                                 | F_FIRST
  //                                 | F_LENGTH
  //                                 | F_UNSET_RECURSIVE
  //                                 | F_PARSE_IDENTIFIER
  //                                 | F_TO_BASE64
  //                                 | F_IS_DATESTRING
  //                                 | F_INTERSECTION
  //                                 | F_MINUS
  //                                 | F_IS_IN_POLYGON
  //                                 | F_IS_OBJECT
  //                                 | F_STARTS_WITH
  //                                 | F_DATE_DAYOFWEEK
  //                                 | F_LOG10
  //                                 | F_TFIDF
  //                                 | F_DATE_ISO8601
  //                                 | F_DATE_TRUNC
  //                                 | F_IS_LIST
  //                                 | F_NOOPT
  //                                 | F_ATTRIBUTES
  //                                 | F_CALL
  //                                 | F_LEVENSHTEIN_DISTANCE
  //                                 | F_REMOVE_VALUE
  //                                 | F_DATE_FORMAT
  //                                 | F_EXP
  //                                 | F_RADIANS
  //                                 | F_OUTERSECTION
  //                                 | F_UNION
  //                                 | F_KEYS
  //                                 | F_COLLECTION_COUNT
  //                                 | F_BOOST
  //                                 | F_REGEX_MATCHES
  //                                 | F_DISTANCE
  //                                 | F_CHAR_LENGTH
  //                                 | F_MERGE_RECURSIVE
  //                                 | F_VARIANCE_POPULATION
  //                                 | F_UPPER
  //                                 | F_RAND
  //                                 | F_MIN_MATCH
  //                                 | F_GEO_EQUALS
  //                                 | F_TRIM
  //                                 | F_LEFT
  //                                 | F_PI
  //                                 | F_NOT_NULL
  //                                 | F_SUM
  //                                 | F_VERSION
  //                                 | F_POW
  //                                 | F_SLEEP
  //                                 | F_POP
  //                                 | F_MIN
  //                                 | F_UUID
  //                                 | F_TO_NUMBER
  //                                 | F_FIND_FIRST
  //                                 | F_DATE_ISOWEEK
  //                                 | F_LOWER
  //                                 | F_GEO_CONTAINS
  //                                 | F_TRANSLATE
  //                                 | F_GEO_LINESTRING
  //                                 | F_APPLY
  //                                 | F_ABS
  //                                 | F_EXP2
  //                                 | F_DATE_SECOND
  //                                 | F_BM25
  //                                 | F_DATE_MONTH
  //                                 | F_SHIFT
  //                                 | F_CONCAT
  //                                 | F_SUBSTRING
  //                                 | F_CURRENT_USER
  //                                 | F_CONTAINS_ARRAY
  //                                 | F_HAS
  //                                 | F_KEEP
  //                                 | F_TO_STRING
  //                                 | F_ACOS
  //                                 | F_V8
  //                                 | F_PREGEL_RESULT
  //                                 | F_UNION_DISTINCT
  //                                 | F_LIKE
  //                                 | F_COUNT_UNIQUE
  //                                 | F_WITHIN
  //                                 | F_IS_STRING
  //                                 | F_REGEX_TEST
  //                                 | F_REMOVE_VALUES
  //                                 | F_GEO_INTERSECTS
  //                                 | F_ATAN
  //                                 | F_LOG2
  //                                 | F_SIN
  //                                 | F_IS_DOCUMENT
  //                                 | F_REGEX_REPLACE
  //                                 | F_AVG
  //                                 | F_SORTED_UNIQUE
  //                                 | F_TYPENAME
  //                                 | F_DATE_ADD
  //                                 | F_REMOVE_NTH
  //                                 | F_APPEND
  //                                 | F_FLATTEN
  //                                 | F_GEO_POLYGON
  //                                 | F_COUNT
  //                                 | F_DATE_MILLISECOND
  //                                 | F_WITHIN_RECTANGLE
  //                                 | F_SOUNDEX
  //                                 | F_TOKENS
  //                                 | F_AVERAGE
  //                                 | F_DATE_QUARTER
  //                                 | F_IS_NULL
  //                                 | F_COLLECTIONS
  //                                 | F_ANALYZER
  //                                 | F_PHRASE
  //                                 | F_DATE_NOW
  //                                 | F_MEDIAN
  //                                 | F_TO_ARRAY
  //                                 | F_RIGHT
  //                                 | F_RTRIM
  //                                 | F_DOCUMENT
  //                                 | F_GEO_DISTANCE
  //                                 | F_PASSTHRU
  //                                 | F_ROUND
  //                                 | F_ZIP
  //                                 | F_TO_HEX
  //                                 | F_FULLTEXT
  //                                 | F_UNIQUE
  //                                 | F_IS_KEY
  //                                 | F_ATAN2
  //                                 | F_CEIL
  //                                 | F_IS_ARRAY
  //                                 | F_SHA512
  //                                 | F_DATE_COMPARE
  //                                 | F_IS_SAME_COLLECTION
  //                                 | F_PUSH
  //                                 | F_DATE_YEAR
  //                                 | F_HASH
  //                                 | F_COUNT_DISTINCT
  //                                 | F_SHA1
  //                                 | F_SQRT
  //                                 | F_LOG
  //                                 | F_POSITION
  //                                 | F_MERGE
  //                                 | F_DATE_TIMESTAMP
  //                                 | F_ENCODE_URI_COMPONENT
  //                                 | F_CONTAINS
  //                                 | F_FAIL
  //                                 | F_FLOOR
  //                                 | F_PERCENTILE
  //                                 | F_MAX
  //                                 | F_EXISTS
  //                                 | F_NTH
  //                                 | F_TO_BOOL
  //                                 | F_DATE_HOUR
  //                                 | F_JSON_STRINGIFY
  //                                 | F_FIRST_DOCUMENT
  //                                 | F_RANDOM_TOKEN
  //                                 | F_FIND_LAST
  //                                 | F_STDDEV_POPULATION
  //                                 | F_COS
  //                                 | F_VARIANCE
  //                                 | F_IS_NUMBER
  //                                 | F_SORTED
  //                                 | F_DATE_DIFF
  //                                 | F_UNSHIFT
  //                                 | F_ASSERT
  //                                 | F_GEO_MULTIPOINT
  //                                 | F_SLICE
  //                                 | F_ASIN
  static boolean keyword_functions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword_functions")) return false;
    boolean r;
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
    if (!r) r = consumeToken(b, F_TAN);
    if (!r) r = consumeToken(b, F_IS_BOOL);
    if (!r) r = consumeToken(b, F_TO_LIST);
    if (!r) r = consumeToken(b, F_REGEX_SPLIT);
    if (!r) r = consumeToken(b, F_MATCHES);
    if (!r) r = consumeToken(b, F_CURRENT_DATABASE);
    if (!r) r = consumeToken(b, F_VARIANCE_SAMPLE);
    if (!r) r = consumeToken(b, F_UNSET);
    if (!r) r = consumeToken(b, F_JSON_PARSE);
    if (!r) r = consumeToken(b, F_DEGREES);
    if (!r) r = consumeToken(b, F_GEO_MULTILINESTRING);
    if (!r) r = consumeToken(b, F_DATE_DAYOFYEAR);
    if (!r) r = consumeToken(b, F_LAST);
    if (!r) r = consumeToken(b, F_VALUES);
    if (!r) r = consumeToken(b, F_CONCAT_SEPARATOR);
    if (!r) r = consumeToken(b, F_DATE_DAY);
    if (!r) r = consumeToken(b, F_STDDEV);
    if (!r) r = consumeToken(b, F_DATE_DAYS_IN_MONTH);
    if (!r) r = consumeToken(b, F_NEAR);
    if (!r) r = consumeToken(b, F_LTRIM);
    if (!r) r = consumeToken(b, F_REVERSE);
    if (!r) r = consumeToken(b, F_RANGE);
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
    if (!r) r = consumeToken(b, F_LOG10);
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
    if (!r) r = consumeToken(b, F_EXP);
    if (!r) r = consumeToken(b, F_RADIANS);
    if (!r) r = consumeToken(b, F_OUTERSECTION);
    if (!r) r = consumeToken(b, F_UNION);
    if (!r) r = consumeToken(b, F_KEYS);
    if (!r) r = consumeToken(b, F_COLLECTION_COUNT);
    if (!r) r = consumeToken(b, F_BOOST);
    if (!r) r = consumeToken(b, F_REGEX_MATCHES);
    if (!r) r = consumeToken(b, F_DISTANCE);
    if (!r) r = consumeToken(b, F_CHAR_LENGTH);
    if (!r) r = consumeToken(b, F_MERGE_RECURSIVE);
    if (!r) r = consumeToken(b, F_VARIANCE_POPULATION);
    if (!r) r = consumeToken(b, F_UPPER);
    if (!r) r = consumeToken(b, F_RAND);
    if (!r) r = consumeToken(b, F_MIN_MATCH);
    if (!r) r = consumeToken(b, F_GEO_EQUALS);
    if (!r) r = consumeToken(b, F_TRIM);
    if (!r) r = consumeToken(b, F_LEFT);
    if (!r) r = consumeToken(b, F_PI);
    if (!r) r = consumeToken(b, F_NOT_NULL);
    if (!r) r = consumeToken(b, F_SUM);
    if (!r) r = consumeToken(b, F_VERSION);
    if (!r) r = consumeToken(b, F_POW);
    if (!r) r = consumeToken(b, F_SLEEP);
    if (!r) r = consumeToken(b, F_POP);
    if (!r) r = consumeToken(b, F_MIN);
    if (!r) r = consumeToken(b, F_UUID);
    if (!r) r = consumeToken(b, F_TO_NUMBER);
    if (!r) r = consumeToken(b, F_FIND_FIRST);
    if (!r) r = consumeToken(b, F_DATE_ISOWEEK);
    if (!r) r = consumeToken(b, F_LOWER);
    if (!r) r = consumeToken(b, F_GEO_CONTAINS);
    if (!r) r = consumeToken(b, F_TRANSLATE);
    if (!r) r = consumeToken(b, F_GEO_LINESTRING);
    if (!r) r = consumeToken(b, F_APPLY);
    if (!r) r = consumeToken(b, F_ABS);
    if (!r) r = consumeToken(b, F_EXP2);
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
    if (!r) r = consumeToken(b, F_ACOS);
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
    if (!r) r = consumeToken(b, F_ATAN);
    if (!r) r = consumeToken(b, F_LOG2);
    if (!r) r = consumeToken(b, F_SIN);
    if (!r) r = consumeToken(b, F_IS_DOCUMENT);
    if (!r) r = consumeToken(b, F_REGEX_REPLACE);
    if (!r) r = consumeToken(b, F_AVG);
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
    if (!r) r = consumeToken(b, F_AVERAGE);
    if (!r) r = consumeToken(b, F_DATE_QUARTER);
    if (!r) r = consumeToken(b, F_IS_NULL);
    if (!r) r = consumeToken(b, F_COLLECTIONS);
    if (!r) r = consumeToken(b, F_ANALYZER);
    if (!r) r = consumeToken(b, F_PHRASE);
    if (!r) r = consumeToken(b, F_DATE_NOW);
    if (!r) r = consumeToken(b, F_MEDIAN);
    if (!r) r = consumeToken(b, F_TO_ARRAY);
    if (!r) r = consumeToken(b, F_RIGHT);
    if (!r) r = consumeToken(b, F_RTRIM);
    if (!r) r = consumeToken(b, F_DOCUMENT);
    if (!r) r = consumeToken(b, F_GEO_DISTANCE);
    if (!r) r = consumeToken(b, F_PASSTHRU);
    if (!r) r = consumeToken(b, F_ROUND);
    if (!r) r = consumeToken(b, F_ZIP);
    if (!r) r = consumeToken(b, F_TO_HEX);
    if (!r) r = consumeToken(b, F_FULLTEXT);
    if (!r) r = consumeToken(b, F_UNIQUE);
    if (!r) r = consumeToken(b, F_IS_KEY);
    if (!r) r = consumeToken(b, F_ATAN2);
    if (!r) r = consumeToken(b, F_CEIL);
    if (!r) r = consumeToken(b, F_IS_ARRAY);
    if (!r) r = consumeToken(b, F_SHA512);
    if (!r) r = consumeToken(b, F_DATE_COMPARE);
    if (!r) r = consumeToken(b, F_IS_SAME_COLLECTION);
    if (!r) r = consumeToken(b, F_PUSH);
    if (!r) r = consumeToken(b, F_DATE_YEAR);
    if (!r) r = consumeToken(b, F_HASH);
    if (!r) r = consumeToken(b, F_COUNT_DISTINCT);
    if (!r) r = consumeToken(b, F_SHA1);
    if (!r) r = consumeToken(b, F_SQRT);
    if (!r) r = consumeToken(b, F_LOG);
    if (!r) r = consumeToken(b, F_POSITION);
    if (!r) r = consumeToken(b, F_MERGE);
    if (!r) r = consumeToken(b, F_DATE_TIMESTAMP);
    if (!r) r = consumeToken(b, F_ENCODE_URI_COMPONENT);
    if (!r) r = consumeToken(b, F_CONTAINS);
    if (!r) r = consumeToken(b, F_FAIL);
    if (!r) r = consumeToken(b, F_FLOOR);
    if (!r) r = consumeToken(b, F_PERCENTILE);
    if (!r) r = consumeToken(b, F_MAX);
    if (!r) r = consumeToken(b, F_EXISTS);
    if (!r) r = consumeToken(b, F_NTH);
    if (!r) r = consumeToken(b, F_TO_BOOL);
    if (!r) r = consumeToken(b, F_DATE_HOUR);
    if (!r) r = consumeToken(b, F_JSON_STRINGIFY);
    if (!r) r = consumeToken(b, F_FIRST_DOCUMENT);
    if (!r) r = consumeToken(b, F_RANDOM_TOKEN);
    if (!r) r = consumeToken(b, F_FIND_LAST);
    if (!r) r = consumeToken(b, F_STDDEV_POPULATION);
    if (!r) r = consumeToken(b, F_COS);
    if (!r) r = consumeToken(b, F_VARIANCE);
    if (!r) r = consumeToken(b, F_IS_NUMBER);
    if (!r) r = consumeToken(b, F_SORTED);
    if (!r) r = consumeToken(b, F_DATE_DIFF);
    if (!r) r = consumeToken(b, F_UNSHIFT);
    if (!r) r = consumeToken(b, F_ASSERT);
    if (!r) r = consumeToken(b, F_GEO_MULTIPOINT);
    if (!r) r = consumeToken(b, F_SLICE);
    if (!r) r = consumeToken(b, F_ASIN);
    return r;
  }

  /* ********************************************************** */
  // !('}'| (ExpressionType))
  static boolean not_brace_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_brace_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_brace_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}'| (ExpressionType)
  private static boolean not_brace_or_next_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_brace_or_next_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_OBJECT_CLOSE);
    if (!r) r = not_brace_or_next_value_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ExpressionType)
  private static boolean not_brace_or_next_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_brace_or_next_value_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(']'|ExpressionArray)
  static boolean not_bracket_or_next_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_bracket_or_next_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !not_bracket_or_next_value_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ']'|ExpressionArray
  private static boolean not_bracket_or_next_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_bracket_or_next_value_0")) return false;
    boolean r;
    r = consumeToken(b, T_ARRAY_CLOSE);
    if (!r) r = ExpressionArray(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NumberType | objects_argument
  static boolean number_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument")) return false;
    boolean r;
    r = NumberType(b, l + 1);
    if (!r) r = objects_argument(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // possible_number_array ("," possible_number_array)* | "[" number_argument (',' number_argument)* "]"
  static boolean number_argument_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number_argument_array_0(b, l + 1);
    if (!r) r = number_argument_array_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // possible_number_array ("," possible_number_array)*
  private static boolean number_argument_array_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = possible_number_array(b, l + 1);
    r = r && number_argument_array_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," possible_number_array)*
  private static boolean number_argument_array_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!number_argument_array_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "number_argument_array_0_1", c)) break;
    }
    return true;
  }

  // "," possible_number_array
  private static boolean number_argument_array_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && possible_number_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" number_argument (',' number_argument)* "]"
  private static boolean number_argument_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && number_argument(b, l + 1);
    r = r && number_argument_array_1_2(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' number_argument)*
  private static boolean number_argument_array_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!number_argument_array_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "number_argument_array_1_2", c)) break;
    }
    return true;
  }

  // ',' number_argument
  private static boolean number_argument_array_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_argument_array_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // property (','|&'}')
  static boolean object_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_element")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = property(b, l + 1);
    p = r; // pin = 1
    r = r && object_element_1(b, l + 1);
    exit_section_(b, l, m, r, p, AqlParser::not_brace_or_next_value);
    return r || p;
  }

  // ','|&'}'
  private static boolean object_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    if (!r) r = object_element_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}'
  private static boolean object_element_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_element_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, T_OBJECT_CLOSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression  | ParameterVariable | VariablePlaceHolder
  static boolean objects_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objects_argument")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression | PropertyName  | ParameterVariable | VariablePlaceHolder
  static boolean possible_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "possible_array")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
    if (!r) r = PropertyName(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TupleType | NumberType | ObjectExpression | PropertyName  | ParameterVariable | VariablePlaceHolder
  static boolean possible_number_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "possible_number_array")) return false;
    boolean r;
    r = TupleType(b, l + 1);
    if (!r) r = NumberType(b, l + 1);
    if (!r) r = ObjectExpression(b, l + 1);
    if (!r) r = PropertyName(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // property_name ":" AnyType+
  static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = property_name(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_COLON));
    r = p && property_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnyType+
  private static boolean property_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyType(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AnyType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOT PropertyLookup
  static boolean property_lookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_lookup")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && PropertyLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // objects_argument | StringType  | ArrayRef
  static boolean property_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_name")) return false;
    boolean r;
    r = objects_argument(b, l + 1);
    if (!r) r = StringType(b, l + 1);
    if (!r) r = ArrayRef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // &(reserved_keywords '(')
  static boolean reserved_function_lookahead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reserved_function_lookahead")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = reserved_function_lookahead_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // reserved_keywords '('
  private static boolean reserved_function_lookahead_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reserved_function_lookahead_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reserved_keywords(b, l + 1);
    r = r && consumeToken(b, T_OPEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_SHORTEST_PATH
  //                         | T_SEARCH
  //                         | T_REPLACE
  //                         | T_ASC
  //                         | T_AGGREGATE
  //                         //| T_FILTER
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
  //                         | T_CURRENT
  //                         | T_WITH
  //                         | T_DISTINCT
  //                         //| T_RETURN
  //                         | T_UPSERT
  //                         | T_REMOVE
  //                         | T_INSERT
  //                         | T_OUTBOUND
  //                         | T_INBOUND
  //                         | T_ANY
  //                         | T_ALL
  //                         | T_NONE
  static boolean reserved_keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reserved_keywords")) return false;
    boolean r;
    r = consumeToken(b, T_SHORTEST_PATH);
    if (!r) r = consumeToken(b, T_SEARCH);
    if (!r) r = consumeToken(b, T_REPLACE);
    if (!r) r = consumeToken(b, T_ASC);
    if (!r) r = consumeToken(b, T_AGGREGATE);
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
    if (!r) r = consumeToken(b, T_CURRENT);
    if (!r) r = consumeToken(b, T_WITH);
    if (!r) r = consumeToken(b, T_DISTINCT);
    if (!r) r = consumeToken(b, T_UPSERT);
    if (!r) r = consumeToken(b, T_REMOVE);
    if (!r) r = consumeToken(b, T_INSERT);
    if (!r) r = consumeToken(b, T_OUTBOUND);
    if (!r) r = consumeToken(b, T_INBOUND);
    if (!r) r = consumeToken(b, T_ANY);
    if (!r) r = consumeToken(b, T_ALL);
    if (!r) r = consumeToken(b, T_NONE);
    return r;
  }

  /* ********************************************************** */
  // '(' AnyType+ ')'
  static boolean single_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_tuple")) return false;
    if (!nextTokenIs(b, T_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, T_OPEN);
    r = r && single_tuple_1(b, l + 1);
    p = r; // pin = 2
    r = r && consumeToken(b, T_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AnyType+
  private static boolean single_tuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_tuple_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyType(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AnyType(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "single_tuple_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(Statement)
  static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Statement)
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression | StringType | ParameterVariable | VariablePlaceHolder
  static boolean string_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_argument")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
    if (!r) r = StringType(b, l + 1);
    if (!r) r = ParameterVariable(b, l + 1);
    if (!r) r = VariablePlaceHolder(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // possible_array | string_array
  static boolean string_argument_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_argument_array")) return false;
    boolean r;
    r = possible_array(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "[" StringType ("," StringType)* "]"
  static boolean string_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_array")) return false;
    if (!nextTokenIs(b, T_ARRAY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && StringType(b, l + 1);
    r = r && string_array_2(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," StringType)*
  private static boolean string_array_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_array_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_array_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_array_2", c)) break;
    }
    return true;
  }

  // "," StringType
  private static boolean string_array_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_array_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringType ("," StringType)*
  static boolean string_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list")) return false;
    if (!nextTokenIs(b, "", TEXT_DOUBLE, TEXT_SINGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringType(b, l + 1);
    r = r && string_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," StringType)*
  private static boolean string_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_list_1", c)) break;
    }
    return true;
  }

  // "," StringType
  private static boolean string_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // &(PropertyName '(')
  static boolean tuple_lookahead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_lookahead")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = tuple_lookahead_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PropertyName '('
  private static boolean tuple_lookahead_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_lookahead_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyName(b, l + 1);
    r = r && consumeToken(b, T_OPEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // &ID
  static boolean variable_lookahead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_lookahead")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
