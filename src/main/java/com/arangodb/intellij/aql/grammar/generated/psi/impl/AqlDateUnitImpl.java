// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;

public class AqlDateUnitImpl extends ASTWrapperPsiElement implements AqlDateUnit {

  public AqlDateUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitDateUnit(this);
  }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
        else super.accept(visitor);
    }

  @Override
  @Nullable
  public PsiElement getDDayD() {
    return findChildByType(D_DAY_D);
  }

  @Override
  @Nullable
  public PsiElement getDDayS() {
    return findChildByType(D_DAY_S);
  }

  @Override
  @Nullable
  public PsiElement getDHourD() {
    return findChildByType(D_HOUR_D);
  }

  @Override
  @Nullable
  public PsiElement getDHourS() {
    return findChildByType(D_HOUR_S);
  }

  @Override
  @Nullable
  public PsiElement getDMillisecondD() {
    return findChildByType(D_MILLISECOND_D);
  }

  @Override
  @Nullable
  public PsiElement getDMillisecondS() {
    return findChildByType(D_MILLISECOND_S);
  }

  @Override
  @Nullable
  public PsiElement getDMinuteD() {
    return findChildByType(D_MINUTE_D);
  }

  @Override
  @Nullable
  public PsiElement getDMinuteS() {
    return findChildByType(D_MINUTE_S);
  }

  @Override
  @Nullable
  public PsiElement getDMonthD() {
    return findChildByType(D_MONTH_D);
  }

  @Override
  @Nullable
  public PsiElement getDMonthS() {
    return findChildByType(D_MONTH_S);
  }

  @Override
  @Nullable
  public PsiElement getDSecondD() {
    return findChildByType(D_SECOND_D);
  }

  @Override
  @Nullable
  public PsiElement getDSecondS() {
    return findChildByType(D_SECOND_S);
  }

  @Override
  @Nullable
  public PsiElement getDYearD() {
    return findChildByType(D_YEAR_D);
  }

  @Override
  @Nullable
  public PsiElement getDYearS() {
    return findChildByType(D_YEAR_S);
  }

}
