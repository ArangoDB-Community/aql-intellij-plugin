// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnyInteger;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlDoubleType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlScientificNumber;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlScientificNumberImpl extends ASTWrapperPsiElement implements AqlScientificNumber {

    public AqlScientificNumberImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitScientificNumber(this);
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
    public List<AqlAnyInteger> getAnyIntegerList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlAnyInteger.class);
    }

    @Override
    @Nullable
    public AqlDoubleType getDoubleType() {
        return findChildByClass(AqlDoubleType.class);
    }

    @Override
    @NotNull
    public PsiElement getExponentIndicator() {
        return findNotNullChildByType(EXPONENT_INDICATOR);
    }

}
