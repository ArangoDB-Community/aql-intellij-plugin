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

public class AqlAnalyzerTypeImpl extends ASTWrapperPsiElement implements AqlAnalyzerType {

  public AqlAnalyzerTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitAnalyzerType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getADelimiter() {
    return findChildByType(A_DELIMITER);
  }

  @Override
  @Nullable
  public PsiElement getAIdentity() {
    return findChildByType(A_IDENTITY);
  }

  @Override
  @Nullable
  public PsiElement getANgram() {
    return findChildByType(A_NGRAM);
  }

  @Override
  @Nullable
  public PsiElement getANorm() {
    return findChildByType(A_NORM);
  }

  @Override
  @Nullable
  public PsiElement getAStem() {
    return findChildByType(A_STEM);
  }

  @Override
  @Nullable
  public PsiElement getATextAr() {
    return findChildByType(A_TEXT_AR);
  }

  @Override
  @Nullable
  public PsiElement getATextBa() {
    return findChildByType(A_TEXT_BA);
  }

  @Override
  @Nullable
  public PsiElement getATextCa() {
    return findChildByType(A_TEXT_CA);
  }

  @Override
  @Nullable
  public PsiElement getATextDa() {
    return findChildByType(A_TEXT_DA);
  }

  @Override
  @Nullable
  public PsiElement getATextDe() {
    return findChildByType(A_TEXT_DE);
  }

  @Override
  @Nullable
  public PsiElement getATextEl() {
    return findChildByType(A_TEXT_EL);
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
  public PsiElement getATextFr() {
    return findChildByType(A_TEXT_FR);
  }

  @Override
  @Nullable
  public PsiElement getATextGa() {
    return findChildByType(A_TEXT_GA);
  }

  @Override
  @Nullable
  public PsiElement getATextHi() {
    return findChildByType(A_TEXT_HI);
  }

  @Override
  @Nullable
  public PsiElement getATextHu() {
    return findChildByType(A_TEXT_HU);
  }

  @Override
  @Nullable
  public PsiElement getATextId() {
    return findChildByType(A_TEXT_ID);
  }

  @Override
  @Nullable
  public PsiElement getATextIt() {
    return findChildByType(A_TEXT_IT);
  }

  @Override
  @Nullable
  public PsiElement getATextLt() {
    return findChildByType(A_TEXT_LT);
  }

  @Override
  @Nullable
  public PsiElement getATextNe() {
    return findChildByType(A_TEXT_NE);
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
  public PsiElement getATextRo() {
    return findChildByType(A_TEXT_RO);
  }

  @Override
  @Nullable
  public PsiElement getATextRu() {
    return findChildByType(A_TEXT_RU);
  }

  @Override
  @Nullable
  public PsiElement getATextSr() {
    return findChildByType(A_TEXT_SR);
  }

  @Override
  @Nullable
  public PsiElement getATextSv() {
    return findChildByType(A_TEXT_SV);
  }

  @Override
  @Nullable
  public PsiElement getATextTa() {
    return findChildByType(A_TEXT_TA);
  }

  @Override
  @Nullable
  public PsiElement getATextTr() {
    return findChildByType(A_TEXT_TR);
  }

  @Override
  @Nullable
  public PsiElement getATextZh() {
    return findChildByType(A_TEXT_ZH);
  }

}
