// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.machak.aql.grammar.generated.AqlParserUtil.*;
import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

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
        if (t == OBJECT_EXPRESSION) {
            r = ObjectExpression(b, 0);
        } else if (t == PROPERTY_KEY_NAME) {
            r = PropertyKeyName(b, 0);
        } else if (t == PROPERTY_LOOKUP) {
            r = PropertyLookup(b, 0);
        } else if (t == QUERY_ITEM) {
            r = QueryItem(b, 0);
        } else if (t == STATEMENT) {
            r = Statement(b, 0);
        } else {
            r = parse_root_(t, b, 0);
        }
        exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
    }

    protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
        return aql(b, l + 1);
    }

    /* ********************************************************** */
    // (PropertyLookup)+
    public static boolean ObjectExpression(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ObjectExpression")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, OBJECT_EXPRESSION, "<object expression>");
        r = ObjectExpression_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
          if (!ObjectExpression_0(b, l + 1)) {
            break;
          }
          if (!empty_element_parsed_guard_(b, "ObjectExpression", c)) {
            break;
          }
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (PropertyLookup)
    private static boolean ObjectExpression_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ObjectExpression_0")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b);
        r = PropertyLookup(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // id
    public static boolean PropertyKeyName(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "PropertyKeyName")) {
        return false;
      }
      if (!nextTokenIs(b, ID)) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        exit_section_(b, m, PROPERTY_KEY_NAME, r);
        return r;
    }

    /* ********************************************************** */
    // "." PropertyKeyName
    public static boolean PropertyLookup(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "PropertyLookup")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, PROPERTY_LOOKUP, "<property lookup>");
        r = consumeToken(b, ".");
        r = r && PropertyKeyName(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // !<<eof>> Statement
    public static boolean QueryItem(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "QueryItem")) {
        return false;
      }
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
      if (!recursion_guard_(b, l, "QueryItem_0")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b, l, _NOT_);
        r = !eof(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // (FOR) | (IN) | (id) |(RETURN) | (ObjectExpression)
    public static boolean Statement(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "Statement")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
        r = consumeToken(b, FOR);
      if (!r) {
        r = consumeToken(b, IN);
      }
      if (!r) {
        r = consumeToken(b, ID);
      }
      if (!r) {
        r = consumeToken(b, RETURN);
      }
      if (!r) {
        r = Statement_4(b, l + 1);
      }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (ObjectExpression)
    private static boolean Statement_4(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "Statement_4")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b);
        r = ObjectExpression(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // QueryItem *
    static boolean aql(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "aql")) {
        return false;
      }
        while (true) {
            int c = current_position_(b);
          if (!QueryItem(b, l + 1)) {
            break;
          }
          if (!empty_element_parsed_guard_(b, "aql", c)) {
            break;
          }
        }
        return true;
    }

    /* ********************************************************** */
    // !(
    //                         FOR
    //                         | IN
    //                         | RETURN
    //                         | ASC
    //                         | DESC
    //                         | id
    //                         | ObjectExpression
    //                     )
    static boolean statement_recover(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "statement_recover")) {
        return false;
      }
        boolean r;
        Marker m = enter_section_(b, l, _NOT_);
        r = !statement_recover_0(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // FOR
    //                         | IN
    //                         | RETURN
    //                         | ASC
    //                         | DESC
    //                         | id
    //                         | ObjectExpression
    private static boolean statement_recover_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "statement_recover_0")) {
        return false;
      }
        boolean r;
        r = consumeToken(b, FOR);
      if (!r) {
        r = consumeToken(b, IN);
      }
      if (!r) {
        r = consumeToken(b, RETURN);
      }
      if (!r) {
        r = consumeToken(b, ASC);
      }
      if (!r) {
        r = consumeToken(b, DESC);
      }
      if (!r) {
        r = consumeToken(b, ID);
      }
      if (!r) {
        r = ObjectExpression(b, l + 1);
      }
        return r;
    }

    static final Parser statement_recover_parser_ = new Parser() {
        public boolean parse(PsiBuilder b, int l) {
            return statement_recover(b, l + 1);
        }
    };
}
