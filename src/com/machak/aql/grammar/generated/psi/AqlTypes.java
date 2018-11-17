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
  IElementType KEYWORD_STATEMENTS = new AqlElementType("KEYWORD_STATEMENTS");
  IElementType LIMIT_OFFSET = new AqlElementType("LIMIT_OFFSET");
  IElementType LINE_COMMENT = new AqlElementType("LINE_COMMENT");
  IElementType OBJECT_EXPRESSION = new AqlElementType("OBJECT_EXPRESSION");
  IElementType OPERATOR_STATEMENTS = new AqlElementType("OPERATOR_STATEMENTS");
  IElementType PROPERTY_KEY_NAME = new AqlElementType("PROPERTY_KEY_NAME");
  IElementType PROPERTY_LOOKUP = new AqlElementType("PROPERTY_LOOKUP");
  IElementType PROPERTY_NAME = new AqlElementType("PROPERTY_NAME");
  IElementType QUERY_ITEM = new AqlElementType("QUERY_ITEM");
  IElementType SEQUENCE = new AqlElementType("SEQUENCE");
  IElementType STATEMENT = new AqlElementType("STATEMENT");

  IElementType B_COMMENT = new AqlTokenType("B_COMMENT");
  IElementType DOUBLE_QUOTE = new AqlTokenType("\"");
  IElementType ID = new AqlTokenType("ID");
  IElementType L_COMMENT = new AqlTokenType("L_COMMENT");
  IElementType NUMBER_INTEGER = new AqlTokenType("NUMBER_INTEGER");
  IElementType SINGLE_QUOTE = new AqlTokenType("'");
  IElementType T_AGGREGATE = new AqlTokenType("T_AGGREGATE");
  IElementType T_ALL = new AqlTokenType("all");
  IElementType T_AND = new AqlTokenType("and");
  IElementType T_ANY = new AqlTokenType("any");
  IElementType T_ARRAY_CLOSE = new AqlTokenType("]");
  IElementType T_ARRAY_OPEN = new AqlTokenType("[");
  IElementType T_ASC = new AqlTokenType("T_ASC");
  IElementType T_CLOSE = new AqlTokenType(")");
  IElementType T_COLLECT = new AqlTokenType("T_COLLECT");
  IElementType T_COLON = new AqlTokenType(":");
  IElementType T_COMMA = new AqlTokenType(",");
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
  IElementType T_IN = new AqlTokenType("T_IN");
  IElementType T_INBOUND = new AqlTokenType("inbound");
  IElementType T_INSERT = new AqlTokenType("T_INSERT");
  IElementType T_INTO = new AqlTokenType("T_INTO");
  IElementType T_LE = new AqlTokenType("<=");
  IElementType T_LET = new AqlTokenType("T_LET");
  IElementType T_LIKE = new AqlTokenType("like");
  IElementType T_LIMIT = new AqlTokenType("T_LIMIT");
  IElementType T_LT = new AqlTokenType("<");
  IElementType T_MINUS = new AqlTokenType("-");
  IElementType T_MOD = new AqlTokenType("%");
  IElementType T_NE = new AqlTokenType("!=");
  IElementType T_NIN = new AqlTokenType("T_NIN");
  IElementType T_NONE = new AqlTokenType("none");
  IElementType T_NOT = new AqlTokenType("not");
  IElementType T_NULL = new AqlTokenType("null");
  IElementType T_OBJECT_CLOSE = new AqlTokenType("}");
  IElementType T_OBJECT_OPEN = new AqlTokenType("{");
  IElementType T_OPEN = new AqlTokenType("(");
  IElementType T_OR = new AqlTokenType("or");
  IElementType T_OUTBOUND = new AqlTokenType("outbound");
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
      } else if (type == KEYWORD_STATEMENTS) {
        return new AqlKeywordStatementsImpl(node);
      } else if (type == LIMIT_OFFSET) {
        return new AqlLimitOffsetImpl(node);
      } else if (type == LINE_COMMENT) {
        return new AqlLineCommentImpl(node);
      } else if (type == OBJECT_EXPRESSION) {
        return new AqlObjectExpressionImpl(node);
      } else if (type == OPERATOR_STATEMENTS) {
        return new AqlOperatorStatementsImpl(node);
      } else if (type == PROPERTY_KEY_NAME) {
        return new AqlPropertyKeyNameImpl(node);
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
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
