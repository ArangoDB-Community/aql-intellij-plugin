// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.AqlNamedElement;
import org.jetbrains.annotations.NotNull;

public class AqlVisitor extends PsiElementVisitor {

    public void visitObjectExpression(@NotNull AqlObjectExpression o) {
        visitPsiElement(o);
    }

    public void visitPropertyKeyName(@NotNull AqlPropertyKeyName o) {
        visitNamedElement(o);
    }

    public void visitPropertyLookup(@NotNull AqlPropertyLookup o) {
        visitPsiElement(o);
    }

    public void visitQueryItem(@NotNull AqlQueryItem o) {
        visitPsiElement(o);
    }

    public void visitStatement(@NotNull AqlStatement o) {
        visitPsiElement(o);
    }

    public void visitNamedElement(@NotNull AqlNamedElement o) {
        visitPsiElement(o);
    }

    public void visitPsiElement(@NotNull PsiElement o) {
        visitElement(o);
    }

}
