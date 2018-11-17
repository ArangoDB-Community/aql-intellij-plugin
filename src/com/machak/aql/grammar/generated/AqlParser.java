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
        if (t == BLOCK_COMMENT) {
            r = BlockComment(b, 0);
        } else if (t == COMMENT) {
            r = Comment(b, 0);
        } else if (t == KEYWORD_STATEMENTS) {
            r = KeywordStatements(b, 0);
        } else if (t == LINE_COMMENT) {
            r = LineComment(b, 0);
        } else if (t == OBJECT_EXPRESSION) {
            r = ObjectExpression(b, 0);
        } else if (t == PROPERTY_KEY_NAME) {
            r = PropertyKeyName(b, 0);
        } else if (t == PROPERTY_LOOKUP) {
            r = PropertyLookup(b, 0);
        } else if (t == PROPERTY_NAME) {
            r = PropertyName(b, 0);
        } else if (t == QUERY_ITEM) {
            r = QueryItem(b, 0);
        } else if (t == SEQUENCE) {
            r = Sequence(b, 0);
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
    // B_COMMENT
    public static boolean BlockComment(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "BlockComment")) {
            return false;
        }
        if (!nextTokenIs(b, B_COMMENT)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, B_COMMENT);
        exit_section_(b, m, BLOCK_COMMENT, r);
        return r;
    }

    /* ********************************************************** */
    // LineComment | BlockComment
    public static boolean Comment(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Comment")) {
            return false;
        }
        if (!nextTokenIs(b, "<comment>", B_COMMENT, L_COMMENT)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
        r = LineComment(b, l + 1);
        if (!r) {
            r = BlockComment(b, l + 1);
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // ASC
    //                         | DESC
    //                         | FILTER
    //                         | FOR
    //                         | IN
    //                         | LET
    //                         | LIMIT
    //                         | RETURN
    //                         | SORT
    public static boolean KeywordStatements(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "KeywordStatements")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, KEYWORD_STATEMENTS, "<keyword statements>");
        r = consumeToken(b, ASC);
        if (!r) {
            r = consumeToken(b, DESC);
        }
        if (!r) {
            r = consumeToken(b, FILTER);
        }
        if (!r) {
            r = consumeToken(b, FOR);
        }
        if (!r) {
            r = consumeToken(b, IN);
        }
        if (!r) {
            r = consumeToken(b, LET);
        }
        if (!r) {
            r = consumeToken(b, LIMIT);
        }
        if (!r) {
            r = consumeToken(b, RETURN);
        }
        if (!r) {
            r = consumeToken(b, SORT);
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // L_COMMENT
    public static boolean LineComment(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "LineComment")) {
            return false;
        }
        if (!nextTokenIs(b, L_COMMENT)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, L_COMMENT);
        exit_section_(b, m, LINE_COMMENT, r);
        return r;
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
    // PropertyName
    public static boolean PropertyKeyName(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "PropertyKeyName")) {
            return false;
        }
        if (!nextTokenIs(b, ID)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = PropertyName(b, l + 1);
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
    // ID
    public static boolean PropertyName(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "PropertyName")) {
            return false;
        }
        if (!nextTokenIs(b, ID)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        exit_section_(b, m, PROPERTY_NAME, r);
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
    // NUMBER_INTEGER ".." NUMBER_INTEGER
    public static boolean Sequence(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Sequence")) {
            return false;
        }
        if (!nextTokenIs(b, NUMBER_INTEGER)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, NUMBER_INTEGER);
        r = r && consumeToken(b, "..");
        r = r && consumeToken(b, NUMBER_INTEGER);
        exit_section_(b, m, SEQUENCE, r);
        return r;
    }

    /* ********************************************************** */
    // (KeywordStatements) |(PropertyName) | (Sequence) | (ObjectExpression) | (Comment)
    public static boolean Statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
        r = Statement_0(b, l + 1);
        if (!r) {
            r = Statement_1(b, l + 1);
        }
        if (!r) {
            r = Statement_2(b, l + 1);
        }
        if (!r) {
            r = Statement_3(b, l + 1);
        }
        if (!r) {
            r = Statement_4(b, l + 1);
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (KeywordStatements)
    private static boolean Statement_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_0")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = KeywordStatements(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (PropertyName)
    private static boolean Statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_1")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = PropertyName(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Sequence)
    private static boolean Statement_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_2")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = Sequence(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (ObjectExpression)
    private static boolean Statement_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_3")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = ObjectExpression(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Comment)
    private static boolean Statement_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_4")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = Comment(b, l + 1);
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
    //                         KeywordStatements
    //                         | ObjectExpression
    //                         | Sequence
    //                         | PropertyName
    //                         | Comment
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

    // KeywordStatements
    //                         | ObjectExpression
    //                         | Sequence
    //                         | PropertyName
    //                         | Comment
    private static boolean statement_recover_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "statement_recover_0")) {
            return false;
        }
        boolean r;
        r = KeywordStatements(b, l + 1);
        if (!r) {
            r = ObjectExpression(b, l + 1);
        }
        if (!r) {
            r = Sequence(b, l + 1);
        }
        if (!r) {
            r = PropertyName(b, l + 1);
        }
        if (!r) {
            r = Comment(b, l + 1);
        }
        return r;
    }

    static final Parser statement_recover_parser_ = new Parser() {
        public boolean parse(PsiBuilder b, int l) {
            return statement_recover(b, l + 1);
        }
    };
}
