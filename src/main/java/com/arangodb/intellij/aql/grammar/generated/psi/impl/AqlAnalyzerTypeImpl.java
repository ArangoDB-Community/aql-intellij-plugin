// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnalyzerType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlAnalyzerTypeImpl extends ASTWrapperPsiElement implements AqlAnalyzerType {

  public AqlAnalyzerTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitAnalyzerType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAIdentity() {
    return findChildByType(A_IDENTITY);
  }

  @Override
  @Nullable
  public PsiElement getATextDe() {
    return findChildByType(A_TEXT_DE);
  }

  @Override
  @Nullable
  public PsiElement getATextEn() {
    return findChildByType(A_TEXT_EN);
  }

  @Override
  @Nullable
  public PsiElement getATextEs() {
    return findChildByType(A_TEXT_ES);
  }

  @Override
  @Nullable
  public PsiElement getATextFi() {
    return findChildByType(A_TEXT_FI);
  }

  @Override
  @Nullable
  public PsiElement getATextIt() {
    return findChildByType(A_TEXT_IT);
  }

  @Override
  @Nullable
  public PsiElement getATextNl() {
    return findChildByType(A_TEXT_NL);
  }

  @Override
  @Nullable
  public PsiElement getATextNo() {
    return findChildByType(A_TEXT_NO);
  }

  @Override
  @Nullable
  public PsiElement getATextPt() {
    return findChildByType(A_TEXT_PT);
  }

  @Override
  @Nullable
  public PsiElement getATextRu() {
    return findChildByType(A_TEXT_RU);
  }

  @Override
  @Nullable
  public PsiElement getATextSv() {
    return findChildByType(A_TEXT_SV);
  }

  @Override
  @Nullable
  public PsiElement getATextZh() {
    return findChildByType(A_TEXT_ZH);
  }

}
