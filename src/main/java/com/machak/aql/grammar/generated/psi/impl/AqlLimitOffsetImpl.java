// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.machak.aql.grammar.generated.psi.AqlIntegerType;
import com.machak.aql.grammar.generated.psi.AqlLimitOffset;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AqlLimitOffsetImpl extends ASTWrapperPsiElement implements AqlLimitOffset {

    public AqlLimitOffsetImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitLimitOffset(this);
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
    public List<AqlIntegerType> getIntegerTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlIntegerType.class);
    }

}
