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
        } else if (t == LIMIT_OFFSET) {
            r = LimitOffset(b, 0);
        } else if (t == LINE_COMMENT) {
            r = LineComment(b, 0);
        } else if (t == OBJECT_EXPRESSION) {
            r = ObjectExpression(b, 0);
        } else if (t == OBJECT_VARIABLE) {
            r = ObjectVariable(b, 0);
        } else if (t == OPERATOR_STATEMENTS) {
            r = OperatorStatements(b, 0);
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
        } else if (t == STRING_TYPE) {
            r = StringType(b, 0);
        } else if (t == SYNTAX_OPERATORS) {
            r = SyntaxOperators(b, 0);
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
    // T_SHORTEST_PATH
    //                         | T_PHRASE
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
    public static boolean KeywordStatements(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "KeywordStatements")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, KEYWORD_STATEMENTS, "<keyword statements>");
        r = consumeToken(b, T_SHORTEST_PATH);
        if (!r) {
            r = consumeToken(b, T_PHRASE);
        }
        if (!r) {
            r = consumeToken(b, T_SEARCH);
        }
        if (!r) {
            r = consumeToken(b, T_REPLACE);
        }
        if (!r) {
            r = consumeToken(b, T_ASC);
        }
        if (!r) {
            r = consumeToken(b, T_AGGREGATE);
        }
        if (!r) {
            r = consumeToken(b, T_FILTER);
        }
        if (!r) {
            r = consumeToken(b, T_DESC);
        }
        if (!r) {
            r = consumeToken(b, T_IN);
        }
        if (!r) {
            r = consumeToken(b, T_INTO);
        }
        if (!r) {
            r = consumeToken(b, T_LIMIT);
        }
        if (!r) {
            r = consumeToken(b, T_UPDATE);
        }
        if (!r) {
            r = consumeToken(b, T_SORT);
        }
        if (!r) {
            r = consumeToken(b, T_GRAPH);
        }
        if (!r) {
            r = consumeToken(b, T_FOR);
        }
        if (!r) {
            r = consumeToken(b, T_LET);
        }
        if (!r) {
            r = consumeToken(b, T_COLLECT);
        }
        if (!r) {
            r = consumeToken(b, T_WITH);
        }
        if (!r) {
            r = consumeToken(b, T_DISTINCT);
        }
        if (!r) {
            r = consumeToken(b, T_RETURN);
        }
        if (!r) {
            r = consumeToken(b, T_UPSERT);
        }
        if (!r) {
            r = consumeToken(b, T_REMOVE);
        }
        if (!r) {
            r = consumeToken(b, T_INSERT);
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // NUMBER_INTEGER "," NUMBER_INTEGER
    public static boolean LimitOffset(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "LimitOffset")) {
            return false;
        }
        if (!nextTokenIs(b, NUMBER_INTEGER)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, NUMBER_INTEGER, T_COMMA, NUMBER_INTEGER);
        exit_section_(b, m, LIMIT_OFFSET, r);
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
    // DOLLAR T_OBJECT_OPEN ObjectExpression T_OBJECT_CLOSE
    public static boolean ObjectVariable(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ObjectVariable")) {
            return false;
        }
        if (!nextTokenIs(b, DOLLAR)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, DOLLAR, T_OBJECT_OPEN);
        r = r && ObjectExpression(b, l + 1);
        r = r && consumeToken(b, T_OBJECT_CLOSE);
        exit_section_(b, m, OBJECT_VARIABLE, r);
        return r;
    }

    /* ********************************************************** */
    // T_NULL
    //                        | T_TRUE
    //                        | T_IS
    //                        | T_FALSE
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
    //                        | T_PLUS
    //                        | T_MINUS
    //                        | T_TIMES
    //                        | T_DIV
    //                        | T_MOD
    //                        | T_QUESTION
    //                        | T_COLON
    //                        | T_SCOPE
    //                        | T_RANGE
    //                        | T_COMMA
    //                        | T_OPEN
    //                        | T_CLOSE
    //                        | T_OBJECT_OPEN
    //                        | T_OBJECT_CLOSE
    //                        | T_ARRAY_OPEN
    //                        | T_ARRAY_CLOSE
    //                        | T_OUTBOUND
    //                        | T_INBOUND
    //                        | T_ANY
    //                        | T_ALL
    //                        | T_NONE
    public static boolean OperatorStatements(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "OperatorStatements")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, OPERATOR_STATEMENTS, "<operator statements>");
        r = consumeToken(b, T_NULL);
        if (!r) {
            r = consumeToken(b, T_TRUE);
        }
        if (!r) {
            r = consumeToken(b, T_IS);
        }
        if (!r) {
            r = consumeToken(b, T_FALSE);
        }
        if (!r) {
            r = consumeToken(b, T_NOT);
        }
        if (!r) {
            r = consumeToken(b, T_AND);
        }
        if (!r) {
            r = consumeToken(b, T_LOGICAL_AND);
        }
        if (!r) {
            r = consumeToken(b, T_OR);
        }
        if (!r) {
            r = consumeToken(b, T_NIN);
        }
        if (!r) {
            r = consumeToken(b, T_REGEX_MATCH);
        }
        if (!r) {
            r = consumeToken(b, T_REGEX_NON_MATCH);
        }
        if (!r) {
            r = consumeToken(b, T_EQ);
        }
        if (!r) {
            r = consumeToken(b, T_NE);
        }
        if (!r) {
            r = consumeToken(b, T_LT);
        }
        if (!r) {
            r = consumeToken(b, T_GT);
        }
        if (!r) {
            r = consumeToken(b, T_LE);
        }
        if (!r) {
            r = consumeToken(b, T_GE);
        }
        if (!r) {
            r = consumeToken(b, T_LIKE);
        }
        if (!r) {
            r = consumeToken(b, T_PLUS);
        }
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
        if (!r) {
            r = consumeToken(b, T_QUESTION);
        }
        if (!r) {
            r = consumeToken(b, T_COLON);
        }
        if (!r) {
            r = consumeToken(b, T_SCOPE);
        }
        if (!r) {
            r = consumeToken(b, T_RANGE);
        }
        if (!r) {
            r = consumeToken(b, T_COMMA);
        }
        if (!r) {
            r = consumeToken(b, T_OPEN);
        }
        if (!r) {
            r = consumeToken(b, T_CLOSE);
        }
        if (!r) {
            r = consumeToken(b, T_OBJECT_OPEN);
        }
        if (!r) {
            r = consumeToken(b, T_OBJECT_CLOSE);
        }
        if (!r) {
            r = consumeToken(b, T_ARRAY_OPEN);
        }
        if (!r) {
            r = consumeToken(b, T_ARRAY_CLOSE);
        }
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
        r = consumeTokens(b, 0, NUMBER_INTEGER, T_RANGE, NUMBER_INTEGER);
        exit_section_(b, m, SEQUENCE, r);
        return r;
    }

    /* ********************************************************** */
    // (KeywordStatements)
    //               | (OperatorStatements)
    //               | (PropertyName)
    //               | (ObjectVariable)
    //               | (Sequence)
    //               | (StringType)
    //               | (LimitOffset)
    //               | (ObjectExpression)
    //               | (Comment)
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
        if (!r) {
            r = Statement_5(b, l + 1);
        }
        if (!r) {
            r = Statement_6(b, l + 1);
        }
        if (!r) {
            r = Statement_7(b, l + 1);
        }
        if (!r) {
            r = Statement_8(b, l + 1);
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

    // (OperatorStatements)
    private static boolean Statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_1")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = OperatorStatements(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (PropertyName)
    private static boolean Statement_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_2")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = PropertyName(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (ObjectVariable)
    private static boolean Statement_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_3")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = ObjectVariable(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Sequence)
    private static boolean Statement_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_4")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = Sequence(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (StringType)
    private static boolean Statement_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_5")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (LimitOffset)
    private static boolean Statement_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_6")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = LimitOffset(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (ObjectExpression)
    private static boolean Statement_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_7")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = ObjectExpression(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Comment)
    private static boolean Statement_8(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement_8")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = Comment(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // (TEXT_SINGLE) | (TEXT_DOUBLE)
    public static boolean StringType(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "StringType")) {
            return false;
        }
        if (!nextTokenIs(b, "<string type>", TEXT_DOUBLE, TEXT_SINGLE)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, STRING_TYPE, "<string type>");
        r = consumeToken(b, TEXT_SINGLE);
        if (!r) {
            r = consumeToken(b, TEXT_DOUBLE);
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // SINGLE_QUOTE
    public static boolean SyntaxOperators(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "SyntaxOperators")) {
            return false;
        }
        if (!nextTokenIs(b, SINGLE_QUOTE)) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, SINGLE_QUOTE);
        exit_section_(b, m, SYNTAX_OPERATORS, r);
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
    //                         | OperatorStatements
    //                         | ObjectExpression
    //                         | SyntaxOperators
    //                         | Sequence
    //                         | StringType
    //                         | PropertyName
    //                         | ObjectVariable
    //                         | LimitOffset
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
    //                         | OperatorStatements
    //                         | ObjectExpression
    //                         | SyntaxOperators
    //                         | Sequence
    //                         | StringType
    //                         | PropertyName
    //                         | ObjectVariable
    //                         | LimitOffset
    //                         | Comment
    private static boolean statement_recover_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "statement_recover_0")) {
            return false;
        }
        boolean r;
        r = KeywordStatements(b, l + 1);
        if (!r) {
            r = OperatorStatements(b, l + 1);
        }
        if (!r) {
            r = ObjectExpression(b, l + 1);
        }
        if (!r) {
            r = SyntaxOperators(b, l + 1);
        }
        if (!r) {
            r = Sequence(b, l + 1);
        }
        if (!r) {
            r = StringType(b, l + 1);
        }
        if (!r) {
            r = PropertyName(b, l + 1);
        }
        if (!r) {
            r = ObjectVariable(b, l + 1);
        }
        if (!r) {
            r = LimitOffset(b, l + 1);
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
