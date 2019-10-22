// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunGeoEquals;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlJsonType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_GEO_EQUALS;

public class AqlFunGeoEqualsImpl extends ASTWrapperPsiElement implements AqlFunGeoEquals {

  public AqlFunGeoEqualsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunGeoEquals(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlJsonType> getJsonTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlJsonType.class);
  }

  @Override
  @NotNull
  public PsiElement getFGeoEquals() {
    return findNotNullChildByType(F_GEO_EQUALS);
  }

}
