// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunPhraseImpl extends ASTWrapperPsiElement implements AqlFunPhrase {

  public AqlFunPhraseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunPhrase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlNumberType> getNumberTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlNumberType.class);
  }

  @Override
  @NotNull
  public List<AqlObjectExpression> getObjectExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlObjectExpression.class);
  }

  @Override
  @NotNull
  public List<AqlParameterVariable> getParameterVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlParameterVariable.class);
  }

  @Override
  @Nullable
  public AqlPropertyLookup getPropertyLookup() {
    return findChildByClass(AqlPropertyLookup.class);
  }

  @Override
  @NotNull
  public List<AqlPropertyName> getPropertyNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlPropertyName.class);
  }

  @Override
  @NotNull
  public List<AqlStringType> getStringTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlStringType.class);
  }

  @Override
  @NotNull
  public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
  }

  @Override
  @Nullable
  public PsiElement getFPhrase() {
    return findChildByType(F_PHRASE);
  }

}
