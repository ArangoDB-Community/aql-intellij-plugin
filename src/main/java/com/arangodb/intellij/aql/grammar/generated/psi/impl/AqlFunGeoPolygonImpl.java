// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlArrayType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunGeoPolygon;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_GEO_POLYGON;

public class AqlFunGeoPolygonImpl extends ASTWrapperPsiElement implements AqlFunGeoPolygon {

  public AqlFunGeoPolygonImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunGeoPolygon(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlArrayType> getArrayTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlArrayType.class);
  }

  @Override
  @NotNull
  public PsiElement getFGeoPolygon() {
    return findNotNullChildByType(F_GEO_POLYGON);
  }

}
