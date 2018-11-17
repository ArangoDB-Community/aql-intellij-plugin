// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.machak.aql.grammar.AqlElementType;
import com.machak.aql.grammar.AqlTokenType;
import com.machak.aql.grammar.generated.psi.impl.*;

public interface AqlTypes {

  IElementType OBJECT_EXPRESSION = new AqlElementType("OBJECT_EXPRESSION");
  IElementType PROPERTY_KEY_NAME = new AqlElementType("PROPERTY_KEY_NAME");
  IElementType PROPERTY_LOOKUP = new AqlElementType("PROPERTY_LOOKUP");
  IElementType PROPERTY_NAME = new AqlElementType("PROPERTY_NAME");
  IElementType QUERY_ITEM = new AqlElementType("QUERY_ITEM");
  IElementType STATEMENT = new AqlElementType("STATEMENT");

  IElementType ASC = new AqlTokenType("ASC");
  IElementType BLOCK_COMMENT = new AqlTokenType("block_comment");
  IElementType COMMENT = new AqlTokenType("comment");
  IElementType DESC = new AqlTokenType("DESC");
  IElementType FOR = new AqlTokenType("FOR");
  IElementType ID = new AqlTokenType("id");
  IElementType IN = new AqlTokenType("IN");
  IElementType LEFT_BRACE = new AqlTokenType("{");
  IElementType LEFT_BRACKET = new AqlTokenType("[");
  IElementType LEFT_PAREN = new AqlTokenType("(");
  IElementType OP_AND = new AqlTokenType("&");
  IElementType OP_EQ = new AqlTokenType("=");
  IElementType OP_IS = new AqlTokenType("::=");
  IElementType OP_NOT = new AqlTokenType("!");
  IElementType OP_ONEMORE = new AqlTokenType("+");
  IElementType OP_OPT = new AqlTokenType("?");
  IElementType OP_OR = new AqlTokenType("|");
  IElementType OP_ZEROMORE = new AqlTokenType("*");
  IElementType PROPERTID = new AqlTokenType("propertId");
  IElementType RETURN = new AqlTokenType("RETURN");
  IElementType RIGHT_BRACE = new AqlTokenType("}");
  IElementType RIGHT_BRACKET = new AqlTokenType("]");
  IElementType RIGHT_PAREN = new AqlTokenType(")");
  IElementType SEMICOLON = new AqlTokenType(";");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == OBJECT_EXPRESSION) {
        return new AqlObjectExpressionImpl(node);
      } else if (type == PROPERTY_KEY_NAME) {
        return new AqlPropertyKeyNameImpl(node);
      } else if (type == PROPERTY_LOOKUP) {
        return new AqlPropertyLookupImpl(node);
      } else if (type == PROPERTY_NAME) {
        return new AqlPropertyNameImpl(node);
      } else if (type == QUERY_ITEM) {
        return new AqlQueryItemImpl(node);
      } else if (type == STATEMENT) {
        return new AqlStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
