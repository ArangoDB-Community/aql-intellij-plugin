// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.machak.aql.grammar.AqlElementType;
import com.machak.aql.grammar.AqlTokenType;
import com.machak.aql.grammar.generated.psi.impl.*;

public interface AqlTypes {

  IElementType BLOCK_COMMENT = new AqlElementType("BLOCK_COMMENT");
  IElementType COMMENT = new AqlElementType("COMMENT");
    IElementType INTEGER_TYPE = new AqlElementType("INTEGER_TYPE");
  IElementType KEYWORD_STATEMENTS = new AqlElementType("KEYWORD_STATEMENTS");
  IElementType LIMIT_OFFSET = new AqlElementType("LIMIT_OFFSET");
  IElementType LINE_COMMENT = new AqlElementType("LINE_COMMENT");
  IElementType OBJECT_EXPRESSION = new AqlElementType("OBJECT_EXPRESSION");
  IElementType OBJECT_VARIABLE = new AqlElementType("OBJECT_VARIABLE");
  IElementType OPERATOR_STATEMENTS = new AqlElementType("OPERATOR_STATEMENTS");
  IElementType PROPERTY_LOOKUP = new AqlElementType("PROPERTY_LOOKUP");
  IElementType PROPERTY_NAME = new AqlElementType("PROPERTY_NAME");
  IElementType QUERY_ITEM = new AqlElementType("QUERY_ITEM");
  IElementType SEQUENCE = new AqlElementType("SEQUENCE");
  IElementType STATEMENT = new AqlElementType("STATEMENT");
  IElementType STRING_TYPE = new AqlElementType("STRING_TYPE");
    IElementType SYSTEM_PROPERTY = new AqlElementType("SYSTEM_PROPERTY");

  IElementType B_COMMENT = new AqlTokenType("B_COMMENT");
  IElementType DOLLAR = new AqlTokenType("$");
  IElementType DOUBLE_QUOTE = new AqlTokenType("\"");
  IElementType ID = new AqlTokenType("ID");
  IElementType L_COMMENT = new AqlTokenType("L_COMMENT");
  IElementType NUMBER_INTEGER = new AqlTokenType("NUMBER_INTEGER");
  IElementType OBJECT_START = new AqlTokenType("${");
  IElementType SINGLE_QUOTE = new AqlTokenType("'");
  IElementType TEXT_DOUBLE = new AqlTokenType("TEXT_DOUBLE");
  IElementType TEXT_SINGLE = new AqlTokenType("TEXT_SINGLE");
  IElementType T_AGGREGATE = new AqlTokenType("T_AGGREGATE");
    IElementType T_ALL = new AqlTokenType("T_ALL");
    IElementType T_AND = new AqlTokenType("T_AND");
    IElementType T_ANY = new AqlTokenType("T_ANY");
  IElementType T_ARRAY_CLOSE = new AqlTokenType("]");
  IElementType T_ARRAY_OPEN = new AqlTokenType("[");
  IElementType T_ASC = new AqlTokenType("T_ASC");
    IElementType T_AT = new AqlTokenType("@");
  IElementType T_CLOSE = new AqlTokenType(")");
  IElementType T_COLLECT = new AqlTokenType("T_COLLECT");
  IElementType T_COLON = new AqlTokenType(":");
  IElementType T_COMMA = new AqlTokenType(",");
    IElementType T_COUNT = new AqlTokenType("T_COUNT");
  IElementType T_DESC = new AqlTokenType("T_DESC");
  IElementType T_DISTINCT = new AqlTokenType("T_DISTINCT");
  IElementType T_DIV = new AqlTokenType("/");
  IElementType T_EQ = new AqlTokenType("==");
  IElementType T_FALSE = new AqlTokenType("false");
  IElementType T_FILTER = new AqlTokenType("T_FILTER");
  IElementType T_FOR = new AqlTokenType("T_FOR");
  IElementType T_GE = new AqlTokenType(">=");
  IElementType T_GRAPH = new AqlTokenType("T_GRAPH");
  IElementType T_GT = new AqlTokenType(">");
    IElementType T_ID = new AqlTokenType("_id");
  IElementType T_IN = new AqlTokenType("T_IN");
    IElementType T_INBOUND = new AqlTokenType("T_INBOUND");
  IElementType T_INSERT = new AqlTokenType("T_INSERT");
    IElementType T_INTERSECTION = new AqlTokenType("T_INTERSECTION");
  IElementType T_INTO = new AqlTokenType("T_INTO");
  IElementType T_IS = new AqlTokenType("=");
    IElementType T_KEY = new AqlTokenType("_key");
  IElementType T_LE = new AqlTokenType("<=");
  IElementType T_LET = new AqlTokenType("T_LET");
  IElementType T_LIKE = new AqlTokenType("like");
  IElementType T_LIMIT = new AqlTokenType("T_LIMIT");
  IElementType T_LOGICAL_AND = new AqlTokenType("&&");
  IElementType T_LT = new AqlTokenType("<");
  IElementType T_MINUS = new AqlTokenType("-");
  IElementType T_MOD = new AqlTokenType("%");
  IElementType T_NE = new AqlTokenType("!=");
    IElementType T_NIN = new AqlTokenType("T_NIN");
  IElementType T_NONE = new AqlTokenType("none");
    IElementType T_NOT = new AqlTokenType("not");
    IElementType T_NULL = new AqlTokenType("T_NULL");
  IElementType T_OBJECT_CLOSE = new AqlTokenType("}");
  IElementType T_OBJECT_OPEN = new AqlTokenType("{");
  IElementType T_OPEN = new AqlTokenType("(");
    IElementType T_OR = new AqlTokenType("||");
    IElementType T_OUTBOUND = new AqlTokenType("T_OUTBOUND");
  IElementType T_PHRASE = new AqlTokenType("T_PHRASE");
  IElementType T_PLUS = new AqlTokenType("+");
  IElementType T_QUESTION = new AqlTokenType("?");
  IElementType T_RANGE = new AqlTokenType("..");
  IElementType T_REGEX_MATCH = new AqlTokenType("~=");
  IElementType T_REGEX_NON_MATCH = new AqlTokenType("~!");
  IElementType T_REMOVE = new AqlTokenType("T_REMOVE");
  IElementType T_REPLACE = new AqlTokenType("T_REPLACE");
  IElementType T_RETURN = new AqlTokenType("T_RETURN");
  IElementType T_SCOPE = new AqlTokenType("::");
  IElementType T_SEARCH = new AqlTokenType("T_SEARCH");
  IElementType T_SHORTEST_PATH = new AqlTokenType("T_SHORTEST_PATH");
  IElementType T_SORT = new AqlTokenType("T_SORT");
    IElementType T_SYS_FROM = new AqlTokenType("_from");
    IElementType T_SYS_TO = new AqlTokenType("_to");
  IElementType T_TIMES = new AqlTokenType("*");
  IElementType T_TRUE = new AqlTokenType("true");
  IElementType T_UPDATE = new AqlTokenType("T_UPDATE");
  IElementType T_UPSERT = new AqlTokenType("T_UPSERT");
  IElementType T_WITH = new AqlTokenType("T_WITH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BLOCK_COMMENT) {
        return new AqlBlockCommentImpl(node);
      } else if (type == COMMENT) {
        return new AqlCommentImpl(node);
      } else if (type == INTEGER_TYPE) {
          return new AqlIntegerTypeImpl(node);
      } else if (type == KEYWORD_STATEMENTS) {
        return new AqlKeywordStatementsImpl(node);
      } else if (type == LIMIT_OFFSET) {
        return new AqlLimitOffsetImpl(node);
      } else if (type == LINE_COMMENT) {
        return new AqlLineCommentImpl(node);
      } else if (type == OBJECT_EXPRESSION) {
        return new AqlObjectExpressionImpl(node);
      } else if (type == OBJECT_VARIABLE) {
        return new AqlObjectVariableImpl(node);
      } else if (type == OPERATOR_STATEMENTS) {
        return new AqlOperatorStatementsImpl(node);
      } else if (type == PROPERTY_LOOKUP) {
        return new AqlPropertyLookupImpl(node);
      } else if (type == PROPERTY_NAME) {
        return new AqlPropertyNameImpl(node);
      } else if (type == QUERY_ITEM) {
        return new AqlQueryItemImpl(node);
      } else if (type == SEQUENCE) {
        return new AqlSequenceImpl(node);
      } else if (type == STATEMENT) {
        return new AqlStatementImpl(node);
      } else if (type == STRING_TYPE) {
        return new AqlStringTypeImpl(node);
      } else if (type == SYSTEM_PROPERTY) {
          return new AqlSystemPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
