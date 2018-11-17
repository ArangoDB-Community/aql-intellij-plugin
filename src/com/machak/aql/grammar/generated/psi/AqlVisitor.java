// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class AqlVisitor extends PsiElementVisitor {

  public void visitBlockComment(@NotNull AqlBlockComment o) {
    visitPsiElement(o);
  }

  public void visitComment(@NotNull AqlComment o) {
    visitPsiElement(o);
  }

    public void visitKeywordStatements(@NotNull AqlKeywordStatements o) {
        visitPsiElement(o);
    }

    public void visitLimitOffset(@NotNull AqlLimitOffset o) {
        visitPsiElement(o);
    }

  public void visitLineComment(@NotNull AqlLineComment o) {
    visitPsiElement(o);
  }

  public void visitObjectExpression(@NotNull AqlObjectExpression o) {
    visitPsiElement(o);
  }

    public void visitOperatorStatements(@NotNull AqlOperatorStatements o) {
        visitPsiElement(o);
    }

  public void visitPropertyKeyName(@NotNull AqlPropertyKeyName o) {
    visitPsiElement(o);
  }

  public void visitPropertyLookup(@NotNull AqlPropertyLookup o) {
    visitPsiElement(o);
  }

  public void visitPropertyName(@NotNull AqlPropertyName o) {
    visitPsiElement(o);
  }

  public void visitQueryItem(@NotNull AqlQueryItem o) {
    visitPsiElement(o);
  }

    public void visitSequence(@NotNull AqlSequence o) {
        visitPsiElement(o);
    }

  public void visitStatement(@NotNull AqlStatement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
