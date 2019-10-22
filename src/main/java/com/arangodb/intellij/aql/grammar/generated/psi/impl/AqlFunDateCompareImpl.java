// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnyType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlDateUnit;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunDateCompare;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlIntegerType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_DATE_COMPARE;

public class AqlFunDateCompareImpl extends ASTWrapperPsiElement implements AqlFunDateCompare {

  public AqlFunDateCompareImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunDateCompare(this);
  }

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
  public List<AqlDateUnit> getDateUnitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlDateUnit.class);
  }

  @Override
  @NotNull
  public List<AqlIntegerType> getIntegerTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlIntegerType.class);
  }

  @Override
  @NotNull
  public PsiElement getFDateCompare() {
    return findNotNullChildByType(F_DATE_COMPARE);
  }

}
