// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlArrayType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunGeoMultiPoint;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunGeoMultiPointImpl extends ASTWrapperPsiElement implements AqlFunGeoMultiPoint {

    public AqlFunGeoMultiPointImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitFunGeoMultiPoint(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @NotNull
    public List<AqlArrayType> getArrayTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlArrayType.class);
    }

    @Override
    @NotNull
    public PsiElement getFGeoMultipoint() {
        return findNotNullChildByType(F_GEO_MULTIPOINT);
    }

}
