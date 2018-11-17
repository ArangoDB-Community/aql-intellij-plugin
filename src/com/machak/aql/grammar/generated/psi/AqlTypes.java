// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.machak.aql.grammar.AqlElementType;
import com.machak.aql.grammar.generated.psi.impl.*;

public interface AqlTypes {

    IElementType OBJECT_EXPRESSION = new AqlElementType("OBJECT_EXPRESSION");
    IElementType PROPERTY_KEY_NAME = new AqlElementType("PROPERTY_KEY_NAME");
    IElementType PROPERTY_LOOKUP = new AqlElementType("PROPERTY_LOOKUP");
    IElementType QUERY_ITEM = new AqlElementType("QUERY_ITEM");
    IElementType STATEMENT = new AqlElementType("STATEMENT");

    IElementType ASC = new AqlElementType("ASC");
    IElementType BLOCK_COMMENT = new AqlElementType("block_comment");
    IElementType COMMENT = new AqlElementType("comment");
    IElementType DESC = new AqlElementType("DESC");
    IElementType FOR = new AqlElementType("FOR");
    IElementType ID = new AqlElementType("id");
    IElementType IN = new AqlElementType("IN");
    IElementType LEFT_BRACE = new AqlElementType("{");
    IElementType LEFT_BRACKET = new AqlElementType("[");
    IElementType LEFT_PAREN = new AqlElementType("(");
    IElementType OP_AND = new AqlElementType("&");
    IElementType OP_EQ = new AqlElementType("=");
    IElementType OP_IS = new AqlElementType("::=");
    IElementType OP_NOT = new AqlElementType("!");
    IElementType OP_ONEMORE = new AqlElementType("+");
    IElementType OP_OPT = new AqlElementType("?");
    IElementType OP_OR = new AqlElementType("|");
    IElementType OP_ZEROMORE = new AqlElementType("*");
    IElementType PROPERTID = new AqlElementType("propertId");
    IElementType RETURN = new AqlElementType("RETURN");
    IElementType RIGHT_BRACE = new AqlElementType("}");
    IElementType RIGHT_BRACKET = new AqlElementType("]");
    IElementType RIGHT_PAREN = new AqlElementType(")");
    IElementType SEMICOLON = new AqlElementType(";");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == OBJECT_EXPRESSION) {
                return new AqlObjectExpressionImpl(node);
            } else if (type == PROPERTY_KEY_NAME) {
                return new AqlPropertyKeyNameImpl(node);
            } else if (type == PROPERTY_LOOKUP) {
                return new AqlPropertyLookupImpl(node);
            } else if (type == QUERY_ITEM) {
                return new AqlQueryItemImpl(node);
            } else if (type == STATEMENT) {
                return new AqlStatementImpl(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
