// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static com.machak.aql.grammar.generated.GeneratedTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

    public ASTNode parse(IElementType t, PsiBuilder b) {
        parseLight(t, b);
        return b.getTreeBuilt();
    }

    public void parseLight(IElementType t, PsiBuilder b) {
        boolean r;
        b = GeneratedParserUtilBase.adapt_builder_(t, b, this, null);
        Marker m = enter_section_(b, 0, _COLLAPSE_, null);
        if (t == EXPR) {
            r = expr(b, 0);
        } else {
            r = parse_root_(t, b, 0);
        }
        exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
    }

    protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
        return root(b, l + 1);
    }

    /* ********************************************************** */
    // expr
    static boolean element(PsiBuilder b, int l) {
        return expr(b, l + 1);
    }

    /* ********************************************************** */
    // FOR | id | IN | RETURN
    public static boolean expr(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "expr")) {
            return false;
        }
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
        r = consumeToken(b, FOR);
        if (!r) {
            r = consumeToken(b, ID);
        }
        if (!r) {
            r = consumeToken(b, IN);
        }
        if (!r) {
            r = consumeToken(b, RETURN);
        }
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // element *
    static boolean root(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "root")) {
            return false;
        }
        while (true) {
            int c = current_position_(b);
            if (!element(b, l + 1)) {
                break;
            }
            if (!empty_element_parsed_guard_(b, "root", c)) {
                break;
            }
        }
        return true;
    }

}
