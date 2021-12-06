// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnyType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunMergeRecursive;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlOperatorStatements;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_MERGE_RECURSIVE;

public class AqlFunMergeRecursiveImpl extends ASTWrapperPsiElement implements AqlFunMergeRecursive {

  public AqlFunMergeRecursiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunMergeRecursive(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlAnyType> getAnyTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlAnyType.class);
  }

  @Override
  @NotNull
  public List<AqlOperatorStatements> getOperatorStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlOperatorStatements.class);
  }

  @Override
  @NotNull
  public PsiElement getFMergeRecursive() {
    return findNotNullChildByType(F_MERGE_RECURSIVE);
  }

}
