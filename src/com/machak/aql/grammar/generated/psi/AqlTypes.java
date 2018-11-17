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
  IElementType LINE_COMMENT = new AqlElementType("LINE_COMMENT");
  IElementType OBJECT_EXPRESSION = new AqlElementType("OBJECT_EXPRESSION");
  IElementType PROPERTY_KEY_NAME = new AqlElementType("PROPERTY_KEY_NAME");
  IElementType PROPERTY_LOOKUP = new AqlElementType("PROPERTY_LOOKUP");
  IElementType PROPERTY_NAME = new AqlElementType("PROPERTY_NAME");
  IElementType QUERY_ITEM = new AqlElementType("QUERY_ITEM");
  IElementType SEQUENCE = new AqlElementType("SEQUENCE");
  IElementType STATEMENT = new AqlElementType("STATEMENT");

  IElementType ASC = new AqlTokenType("ASC");
  IElementType B_COMMENT = new AqlTokenType("B_COMMENT");
  IElementType DESC = new AqlTokenType("DESC");
  IElementType DOUBLE_QUOTE = new AqlTokenType("\"");
  IElementType FILTER = new AqlTokenType("FILTER");
  IElementType FOR = new AqlTokenType("FOR");
  IElementType ID = new AqlTokenType("ID");
  IElementType IN = new AqlTokenType("IN");
  IElementType LEFT_BRACE = new AqlTokenType("{");
  IElementType LEFT_BRACKET = new AqlTokenType("[");
  IElementType LEFT_PAREN = new AqlTokenType("(");
  IElementType LET = new AqlTokenType("LET");
  IElementType LIMIT = new AqlTokenType("LIMIT");
  IElementType L_COMMENT = new AqlTokenType("L_COMMENT");
  IElementType NUMBER_INTEGER = new AqlTokenType("NUMBER_INTEGER");
  IElementType OP_AND = new AqlTokenType("&");
  IElementType OP_EQ = new AqlTokenType("=");
  IElementType OP_IS = new AqlTokenType("::=");
  IElementType OP_NOT = new AqlTokenType("!");
  IElementType OP_ONEMORE = new AqlTokenType("+");
  IElementType OP_OPT = new AqlTokenType("?");
  IElementType OP_OR = new AqlTokenType("|");
  IElementType OP_ZEROMORE = new AqlTokenType("*");
  IElementType RETURN = new AqlTokenType("RETURN");
  IElementType RIGHT_BRACE = new AqlTokenType("}");
  IElementType RIGHT_BRACKET = new AqlTokenType("]");
  IElementType RIGHT_PAREN = new AqlTokenType(")");
  IElementType SEMICOLON = new AqlTokenType(";");
  IElementType SINGLE_QUOTE = new AqlTokenType("'");
  IElementType SORT = new AqlTokenType("SORT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BLOCK_COMMENT) {
        return new AqlBlockCommentImpl(node);
      } else if (type == COMMENT) {
        return new AqlCommentImpl(node);
      } else if (type == KEYWORD_STATEMENTS) {
        return new AqlKeywordStatementsImpl(node);
      } else if (type == LINE_COMMENT) {
        return new AqlLineCommentImpl(node);
      } else if (type == OBJECT_EXPRESSION) {
        return new AqlObjectExpressionImpl(node);
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
